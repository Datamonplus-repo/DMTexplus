package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class mantenimientodehdrs_wc_impl extends GXWebComponent
{
   public mantenimientodehdrs_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public mantenimientodehdrs_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mantenimientodehdrs_wc_impl.class ));
   }

   public mantenimientodehdrs_wc_impl( int remoteHandle ,
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
      cmbavGridactions = new HTMLChoice();
      chkHayRec = UIFactory.getCheckbox(this);
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
               AV64Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64Emprcod", AV64Emprcod);
               AV65Clicod = (int)(GXutil.lval( httpContext.GetPar( "Clicod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65Clicod), 6, 0));
               AV66Barfecgen = localUtil.parseDateParm( httpContext.GetPar( "Barfecgen")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66Barfecgen", localUtil.format(AV66Barfecgen, "99/99/99"));
               AV67BarFecGen_to = localUtil.parseDateParm( httpContext.GetPar( "BarFecGen_to")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67BarFecGen_to", localUtil.format(AV67BarFecGen_to, "99/99/99"));
               AV68Barsit = (byte)(GXutil.lval( httpContext.GetPar( "Barsit"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68Barsit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68Barsit), 2, 0));
               AV69BarSit_to = (byte)(GXutil.lval( httpContext.GetPar( "BarSit_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69BarSit_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69BarSit_to), 2, 0));
               AV70BarEnccli = httpContext.GetPar( "BarEnccli") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70BarEnccli", AV70BarEnccli);
               AV71BarDisnum = httpContext.GetPar( "BarDisnum") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71BarDisnum", AV71BarDisnum);
               AV95Barcod = (int)(GXutil.lval( httpContext.GetPar( "Barcod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV95Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV95Barcod), 8, 0));
               AV96BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV96BarCodReo", GXutil.str( AV96BarCodReo, 1, 0));
               AV97BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV97BarCodPar", AV97BarCodPar);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV64Emprcod,Integer.valueOf(AV65Clicod),AV66Barfecgen,AV67BarFecGen_to,Byte.valueOf(AV68Barsit),Byte.valueOf(AV69BarSit_to),AV70BarEnccli,AV71BarDisnum,Integer.valueOf(AV95Barcod),Byte.valueOf(AV96BarCodReo),AV97BarCodPar});
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
      nRC_GXsfl_41 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_41"))) ;
      nGXsfl_41_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_41_idx"))) ;
      sGXsfl_41_idx = httpContext.GetPar( "sGXsfl_41_idx") ;
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
      AV72Enc20c = (short)(GXutil.lval( httpContext.GetPar( "Enc20c"))) ;
      AV64Emprcod = httpContext.GetPar( "Emprcod") ;
      AV65Clicod = (int)(GXutil.lval( httpContext.GetPar( "Clicod"))) ;
      AV66Barfecgen = localUtil.parseDateParm( httpContext.GetPar( "Barfecgen")) ;
      AV67BarFecGen_to = localUtil.parseDateParm( httpContext.GetPar( "BarFecGen_to")) ;
      AV68Barsit = (byte)(GXutil.lval( httpContext.GetPar( "Barsit"))) ;
      AV69BarSit_to = (byte)(GXutil.lval( httpContext.GetPar( "BarSit_to"))) ;
      AV70BarEnccli = httpContext.GetPar( "BarEnccli") ;
      AV71BarDisnum = httpContext.GetPar( "BarDisnum") ;
      AV95Barcod = (int)(GXutil.lval( httpContext.GetPar( "Barcod"))) ;
      AV96BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      AV97BarCodPar = httpContext.GetPar( "BarCodPar") ;
      AV25ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV20ColumnsSelector);
      AV104Pgmname = httpContext.GetPar( "Pgmname") ;
      AV88Usurcod = httpContext.GetPar( "Usurcod") ;
      AV89Station = httpContext.GetPar( "Station") ;
      AV15FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV26TFBarNHdr = httpContext.GetPar( "TFBarNHdr") ;
      AV27TFBarNHdr_Sel = httpContext.GetPar( "TFBarNHdr_Sel") ;
      AV28TFCliNom = httpContext.GetPar( "TFCliNom") ;
      AV29TFCliNom_Sel = httpContext.GetPar( "TFCliNom_Sel") ;
      AV73TFPedidoCliente = httpContext.GetPar( "TFPedidoCliente") ;
      AV74TFPedidoCliente_Sel = httpContext.GetPar( "TFPedidoCliente_Sel") ;
      AV32TFBarSer = httpContext.GetPar( "TFBarSer") ;
      AV33TFBarSer_Sel = httpContext.GetPar( "TFBarSer_Sel") ;
      AV34TFBarSerDsc = httpContext.GetPar( "TFBarSerDsc") ;
      AV35TFBarSerDsc_Sel = httpContext.GetPar( "TFBarSerDsc_Sel") ;
      AV36TFBarTipArtDsc = httpContext.GetPar( "TFBarTipArtDsc") ;
      AV37TFBarTipArtDsc_Sel = httpContext.GetPar( "TFBarTipArtDsc_Sel") ;
      AV40TFBarColNom = httpContext.GetPar( "TFBarColNom") ;
      AV41TFBarColNom_Sel = httpContext.GetPar( "TFBarColNom_Sel") ;
      AV42TFBarColNum = (int)(GXutil.lval( httpContext.GetPar( "TFBarColNum"))) ;
      AV43TFBarColNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFBarColNum_To"))) ;
      AV44TFBarFecGen = localUtil.parseDateParm( httpContext.GetPar( "TFBarFecGen")) ;
      AV48TFBarFecCli = localUtil.parseDateParm( httpContext.GetPar( "TFBarFecCli")) ;
      AV52TFBarFecSal = localUtil.parseDateParm( httpContext.GetPar( "TFBarFecSal")) ;
      AV56TFBarSit = (byte)(GXutil.lval( httpContext.GetPar( "TFBarSit"))) ;
      AV57TFBarSit_To = (byte)(GXutil.lval( httpContext.GetPar( "TFBarSit_To"))) ;
      AV58TFHayRec_Sel = (byte)(GXutil.lval( httpContext.GetPar( "TFHayRec_Sel"))) ;
      AV98TFBarPart = (short)(GXutil.lval( httpContext.GetPar( "TFBarPart"))) ;
      AV99TFBarPart_To = (short)(GXutil.lval( httpContext.GetPar( "TFBarPart_To"))) ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      AV100Carvitin = (short)(GXutil.lval( httpContext.GetPar( "Carvitin"))) ;
      AV76Pwdgrl = (short)(GXutil.lval( httpContext.GetPar( "Pwdgrl"))) ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV72Enc20c, AV64Emprcod, AV65Clicod, AV66Barfecgen, AV67BarFecGen_to, AV68Barsit, AV69BarSit_to, AV70BarEnccli, AV71BarDisnum, AV95Barcod, AV96BarCodReo, AV97BarCodPar, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV104Pgmname, AV88Usurcod, AV89Station, AV15FilterFullText, AV26TFBarNHdr, AV27TFBarNHdr_Sel, AV28TFCliNom, AV29TFCliNom_Sel, AV73TFPedidoCliente, AV74TFPedidoCliente_Sel, AV32TFBarSer, AV33TFBarSer_Sel, AV34TFBarSerDsc, AV35TFBarSerDsc_Sel, AV36TFBarTipArtDsc, AV37TFBarTipArtDsc_Sel, AV40TFBarColNom, AV41TFBarColNom_Sel, AV42TFBarColNum, AV43TFBarColNum_To, AV44TFBarFecGen, AV48TFBarFecCli, AV52TFBarFecSal, AV56TFBarSit, AV57TFBarSit_To, AV58TFHayRec_Sel, AV98TFBarPart, AV99TFBarPart_To, AV12OrderedBy, AV13OrderedDsc, Gx_mode, AV100Carvitin, AV76Pwdgrl, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1DZ2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( " Mantenimiento HDRs", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.mantenimientodehdrs_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV64Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV65Clicod,6,0)),GXutil.URLEncode(GXutil.formatDateParm(AV66Barfecgen)),GXutil.URLEncode(GXutil.formatDateParm(AV67BarFecGen_to)),GXutil.URLEncode(GXutil.ltrimstr(AV68Barsit,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV69BarSit_to,2,0)),GXutil.URLEncode(GXutil.rtrim(AV70BarEnccli)),GXutil.URLEncode(GXutil.rtrim(AV71BarDisnum)),GXutil.URLEncode(GXutil.ltrimstr(AV95Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV96BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV97BarCodPar))}, new String[] {"Emprcod","Clicod","Barfecgen","BarFecGen_to","Barsit","BarSit_to","BarEnccli","BarDisnum","Barcod","BarCodReo","BarCodPar"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV104Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vUSURCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV88Usurcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTATION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV89Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCARVITIN", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV100Carvitin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPWDGRL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV76Pwdgrl), "ZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_41", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_41, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV23ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV23ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV61GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV62GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV59DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV59DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV20ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV20ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV64Emprcod", GXutil.rtrim( wcpOAV64Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV65Clicod", GXutil.ltrim( localUtil.ntoc( wcpOAV65Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV66Barfecgen", localUtil.dtoc( wcpOAV66Barfecgen, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV67BarFecGen_to", localUtil.dtoc( wcpOAV67BarFecGen_to, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV68Barsit", GXutil.ltrim( localUtil.ntoc( wcpOAV68Barsit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV69BarSit_to", GXutil.ltrim( localUtil.ntoc( wcpOAV69BarSit_to, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV70BarEnccli", GXutil.rtrim( wcpOAV70BarEnccli));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV71BarDisnum", GXutil.rtrim( wcpOAV71BarDisnum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV95Barcod", GXutil.ltrim( localUtil.ntoc( wcpOAV95Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV96BarCodReo", GXutil.ltrim( localUtil.ntoc( wcpOAV96BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV97BarCodPar", GXutil.rtrim( wcpOAV97BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV25ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV64Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV104Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV104Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vUSURCOD", GXutil.rtrim( AV88Usurcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vUSURCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV88Usurcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSTATION", GXutil.rtrim( AV89Station));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTATION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV89Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNHDR", GXutil.rtrim( AV26TFBarNHdr));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNHDR_SEL", GXutil.rtrim( AV27TFBarNHdr_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLINOM", GXutil.rtrim( AV28TFCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLINOM_SEL", GXutil.rtrim( AV29TFCliNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPEDIDOCLIENTE", GXutil.rtrim( AV73TFPedidoCliente));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPEDIDOCLIENTE_SEL", GXutil.rtrim( AV74TFPedidoCliente_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSER", GXutil.rtrim( AV32TFBarSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSER_SEL", GXutil.rtrim( AV33TFBarSer_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSERDSC", GXutil.rtrim( AV34TFBarSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSERDSC_SEL", GXutil.rtrim( AV35TFBarSerDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARTIPARTDSC", GXutil.rtrim( AV36TFBarTipArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARTIPARTDSC_SEL", GXutil.rtrim( AV37TFBarTipArtDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNOM", GXutil.rtrim( AV40TFBarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNOM_SEL", GXutil.rtrim( AV41TFBarColNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNUM", GXutil.ltrim( localUtil.ntoc( AV42TFBarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV43TFBarColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFECGEN", localUtil.dtoc( AV44TFBarFecGen, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFECCLI", localUtil.dtoc( AV48TFBarFecCli, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFECSAL", localUtil.dtoc( AV52TFBarFecSal, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSIT", GXutil.ltrim( localUtil.ntoc( AV56TFBarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSIT_TO", GXutil.ltrim( localUtil.ntoc( AV57TFBarSit_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHAYREC_SEL", GXutil.ltrim( localUtil.ntoc( AV58TFHayRec_Sel, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARPART", GXutil.ltrim( localUtil.ntoc( AV98TFBarPart, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARPART_TO", GXutil.ltrim( localUtil.ntoc( AV99TFBarPart_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD", GXutil.ltrim( localUtil.ntoc( AV65Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECGEN", localUtil.dtoc( AV66Barfecgen, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECGEN_TO", localUtil.dtoc( AV67BarFecGen_to, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARSIT", GXutil.ltrim( localUtil.ntoc( AV68Barsit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARSIT_TO", GXutil.ltrim( localUtil.ntoc( AV69BarSit_to, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARENCCLI", GXutil.rtrim( AV70BarEnccli));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARDISNUM", GXutil.rtrim( AV71BarDisnum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOD", GXutil.ltrim( localUtil.ntoc( AV95Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV96BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODPAR", GXutil.rtrim( AV97BarCodPar));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV10GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCARVITIN", GXutil.ltrim( localUtil.ntoc( AV100Carvitin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCARVITIN", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV100Carvitin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PROCOD", GXutil.rtrim( A758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARORDLIN", GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARFASEST", GXutil.ltrim( localUtil.ntoc( A153BarFasEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPWDGRL", GXutil.ltrim( localUtil.ntoc( AV76Pwdgrl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPWDGRL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV76Pwdgrl), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCONTVAL", GXutil.ltrim( localUtil.ntoc( AV75ContVal, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD_SELECTED", GXutil.rtrim( AV78EmprCod_Selected));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOD_SELECTED", GXutil.ltrim( localUtil.ntoc( AV79BarCod_Selected, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODREO_SELECTED", GXutil.ltrim( localUtil.ntoc( AV80BarCodReo_Selected, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODPAR_SELECTED", GXutil.rtrim( AV81BarCodPar_Selected));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vENC20C", GXutil.ltrim( localUtil.ntoc( AV72Enc20c, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARDISNUM", GXutil.rtrim( A143BarDisNum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Icontype", GXutil.rtrim( Ddo_managefilters_Icontype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Icon", GXutil.rtrim( Ddo_managefilters_Icon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Tooltip", GXutil.rtrim( Ddo_managefilters_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Cls", GXutil.rtrim( Ddo_managefilters_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Width", GXutil.rtrim( Dvpanel_tableheader_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Autowidth", GXutil.booltostr( Dvpanel_tableheader_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Autoheight", GXutil.booltostr( Dvpanel_tableheader_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Cls", GXutil.rtrim( Dvpanel_tableheader_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Title", GXutil.rtrim( Dvpanel_tableheader_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Collapsible", GXutil.booltostr( Dvpanel_tableheader_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Collapsed", GXutil.booltostr( Dvpanel_tableheader_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Showcollapseicon", GXutil.booltostr( Dvpanel_tableheader_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Iconposition", GXutil.rtrim( Dvpanel_tableheader_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Autoscroll", GXutil.booltostr( Dvpanel_tableheader_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Class", GXutil.rtrim( Gridpaginationbar_Class));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Showfirst", GXutil.booltostr( Gridpaginationbar_Showfirst));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Showprevious", GXutil.booltostr( Gridpaginationbar_Showprevious));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Shownext", GXutil.booltostr( Gridpaginationbar_Shownext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Showlast", GXutil.booltostr( Gridpaginationbar_Showlast));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Pagestoshow", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Pagestoshow, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Pagingbuttonsposition", GXutil.rtrim( Gridpaginationbar_Pagingbuttonsposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Pagingcaptionposition", GXutil.rtrim( Gridpaginationbar_Pagingcaptionposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Emptygridclass", GXutil.rtrim( Gridpaginationbar_Emptygridclass));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselector", GXutil.booltostr( Gridpaginationbar_Rowsperpageselector));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageoptions", GXutil.rtrim( Gridpaginationbar_Rowsperpageoptions));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Previous", GXutil.rtrim( Gridpaginationbar_Previous));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Next", GXutil.rtrim( Gridpaginationbar_Next));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Caption", GXutil.rtrim( Gridpaginationbar_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Emptygridcaption", GXutil.rtrim( Gridpaginationbar_Emptygridcaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpagecaption", GXutil.rtrim( Gridpaginationbar_Rowsperpagecaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Caption", GXutil.rtrim( Ddo_grid_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_set", GXutil.rtrim( Ddo_grid_Filteredtext_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_set", GXutil.rtrim( Ddo_grid_Filteredtextto_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_set", GXutil.rtrim( Ddo_grid_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includesortasc", GXutil.rtrim( Ddo_grid_Includesortasc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Fixable", GXutil.rtrim( Ddo_grid_Fixable));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filterisrange", GXutil.rtrim( Ddo_grid_Filterisrange));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includedatalist", GXutil.rtrim( Ddo_grid_Includedatalist));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalisttype", GXutil.rtrim( Ddo_grid_Datalisttype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalistfixedvalues", GXutil.rtrim( Ddo_grid_Datalistfixedvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption", GXutil.rtrim( Ddo_gridcolumnsselector_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip", GXutil.rtrim( Ddo_gridcolumnsselector_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls", GXutil.rtrim( Ddo_gridcolumnsselector_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype", GXutil.rtrim( Ddo_gridcolumnsselector_Dropdownoptionstype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname", GXutil.rtrim( Ddo_gridcolumnsselector_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace", GXutil.rtrim( Ddo_gridcolumnsselector_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_DELETE_Title", GXutil.rtrim( Dvelop_confirmpanel_delete_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_DELETE_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_delete_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_DELETE_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_delete_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_DELETE_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_delete_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_DELETE_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_delete_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_DELETE_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_delete_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_DELETE_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_delete_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Fixedcolumns", GXutil.rtrim( Grid_empowerer_Fixedcolumns));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_DELETE_Result", GXutil.rtrim( Dvelop_confirmpanel_delete_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_DELETE_Result", GXutil.rtrim( Dvelop_confirmpanel_delete_Result));
   }

   public void renderHtmlCloseForm1DZ2( )
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
      return "MantenimientodeHDRs_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Mantenimiento HDRs", "") ;
   }

   public void wb1DZ0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.mantenimientodehdrs_wc");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
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
         ucDvpanel_tableheader.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tableheader_Internalname, sPrefix+"DVPANEL_TABLEHEADERContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_TABLEHEADERContainer"+"TableHeader"+"\" style=\"display:none;\">") ;
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientodeHDRs_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientodeHDRs_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientodeHDRs_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_23_1DZ2( true) ;
      }
      else
      {
         wb_table1_23_1DZ2( false) ;
      }
      return  ;
   }

   public void wb_table1_23_1DZ2e( boolean wbgen )
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
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, sPrefix, "false");
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
         ucGridpaginationbar.setProperty("CurrentPage", AV61GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV62GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, sPrefix+"GRIDPAGINATIONBARContainer");
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
         ucDdo_grid.setProperty("Fixable", Ddo_grid_Fixable);
         ucDdo_grid.setProperty("IncludeFilter", Ddo_grid_Includefilter);
         ucDdo_grid.setProperty("FilterType", Ddo_grid_Filtertype);
         ucDdo_grid.setProperty("FilterIsRange", Ddo_grid_Filterisrange);
         ucDdo_grid.setProperty("IncludeDataList", Ddo_grid_Includedatalist);
         ucDdo_grid.setProperty("DataListType", Ddo_grid_Datalisttype);
         ucDdo_grid.setProperty("DataListFixedValues", Ddo_grid_Datalistfixedvalues);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV59DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV59DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV20ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         wb_table2_74_1DZ2( true) ;
      }
      else
      {
         wb_table2_74_1DZ2( false) ;
      }
      return  ;
   }

   public void wb_table2_74_1DZ2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_barfecgenauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'" + sPrefix + "',false,'" + sGXsfl_41_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_barfecgenauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_barfecgenauxdate_Internalname, localUtil.format(AV46DDO_BarFecGenAuxDate, "99/99/99"), localUtil.format( AV46DDO_BarFecGenAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,81);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_barfecgenauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientodeHDRs_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_barfecgenauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_MantenimientodeHDRs_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_barfeccliauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'" + sPrefix + "',false,'" + sGXsfl_41_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_barfeccliauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_barfeccliauxdate_Internalname, localUtil.format(AV50DDO_BarFecCliAuxDate, "99/99/99"), localUtil.format( AV50DDO_BarFecCliAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,83);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_barfeccliauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientodeHDRs_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_barfeccliauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_MantenimientodeHDRs_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_barfecsalauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'" + sPrefix + "',false,'" + sGXsfl_41_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_barfecsalauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_barfecsalauxdate_Internalname, localUtil.format(AV54DDO_BarFecSalAuxDate, "99/99/99"), localUtil.format( AV54DDO_BarFecSalAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,85);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_barfecsalauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientodeHDRs_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_barfecsalauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_MantenimientodeHDRs_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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

   public void start1DZ2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( " Mantenimiento HDRs", ""), (short)(0)) ;
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
            strup1DZ0( ) ;
         }
      }
   }

   public void ws1DZ2( )
   {
      start1DZ2( ) ;
      evt1DZ2( ) ;
   }

   public void evt1DZ2( )
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
                              strup1DZ0( ) ;
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
                        else if ( GXutil.strcmp(sEvt, "DDO_MANAGEFILTERS.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1DZ0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e111DZ2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1DZ0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e121DZ2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1DZ0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e131DZ2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1DZ0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e141DZ2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1DZ0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e151DZ2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_DELETE.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1DZ0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e161DZ2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1DZ0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e171DZ2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1DZ0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e181DZ2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1DZ0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = cmbavGridactions.getInternalname() ;
                                 httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              }
                           }
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 18), "VGRIDACTIONS.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 18), "VGRIDACTIONS.CLICK") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1DZ0( ) ;
                           }
                           nGXsfl_41_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_412( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV63GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63GridActions), 4, 0));
                           A13696BarNHdr = httpContext.cgiGet( edtBarNHdr_Internalname) ;
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           A13878PedidoClie = httpContext.cgiGet( edtPedidoClie_Internalname) ;
                           A4812BarEncCli = httpContext.cgiGet( edtBarEncCli_Internalname) ;
                           A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
                           A1652BarSerDsc = httpContext.cgiGet( edtBarSerDsc_Internalname) ;
                           A13711BarTipArtD = httpContext.cgiGet( edtBarTipArtD_Internalname) ;
                           n13711BarTipArtD = false ;
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n252CliCod = false ;
                           A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
                           A136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A159BarFecGen = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtBarFecGen_Internalname), 0)) ;
                           A155BarFecCli = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtBarFecCli_Internalname), 0)) ;
                           A161BarFecSal = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtBarFecSal_Internalname), 0)) ;
                           A213BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A13710HayRec = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkHayRec.getInternalname()), "1")==0) ? 1 : 0)) ;
                           A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
                           A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( edtDisCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A3594BarPriTin = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarPriTin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A2265BarExt = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarExt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n2265BarExt = false ;
                           A1503BarPart = (short)(localUtil.ctol( httpContext.cgiGet( edtBarPart_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
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
                                       GX_FocusControl = cmbavGridactions.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e191DZ2 ();
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
                                       GX_FocusControl = cmbavGridactions.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e201DZ2 ();
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
                                       GX_FocusControl = cmbavGridactions.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e211DZ2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONS.CLICK") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavGridactions.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e221DZ2 ();
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
                                    strup1DZ0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavGridactions.getInternalname() ;
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

   public void we1DZ2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1DZ2( ) ;
         }
      }
   }

   public void pa1DZ2( )
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
            GX_FocusControl = edtavFilterfulltext_Internalname ;
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
                                 short AV72Enc20c ,
                                 String AV64Emprcod ,
                                 int AV65Clicod ,
                                 java.util.Date AV66Barfecgen ,
                                 java.util.Date AV67BarFecGen_to ,
                                 byte AV68Barsit ,
                                 byte AV69BarSit_to ,
                                 String AV70BarEnccli ,
                                 String AV71BarDisnum ,
                                 int AV95Barcod ,
                                 byte AV96BarCodReo ,
                                 String AV97BarCodPar ,
                                 byte AV25ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ,
                                 String AV104Pgmname ,
                                 String AV88Usurcod ,
                                 String AV89Station ,
                                 String AV15FilterFullText ,
                                 String AV26TFBarNHdr ,
                                 String AV27TFBarNHdr_Sel ,
                                 String AV28TFCliNom ,
                                 String AV29TFCliNom_Sel ,
                                 String AV73TFPedidoCliente ,
                                 String AV74TFPedidoCliente_Sel ,
                                 String AV32TFBarSer ,
                                 String AV33TFBarSer_Sel ,
                                 String AV34TFBarSerDsc ,
                                 String AV35TFBarSerDsc_Sel ,
                                 String AV36TFBarTipArtDsc ,
                                 String AV37TFBarTipArtDsc_Sel ,
                                 String AV40TFBarColNom ,
                                 String AV41TFBarColNom_Sel ,
                                 int AV42TFBarColNum ,
                                 int AV43TFBarColNum_To ,
                                 java.util.Date AV44TFBarFecGen ,
                                 java.util.Date AV48TFBarFecCli ,
                                 java.util.Date AV52TFBarFecSal ,
                                 byte AV56TFBarSit ,
                                 byte AV57TFBarSit_To ,
                                 byte AV58TFHayRec_Sel ,
                                 short AV98TFBarPart ,
                                 short AV99TFBarPart_To ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 String Gx_mode ,
                                 short AV100Carvitin ,
                                 short AV76Pwdgrl ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e201DZ2 ();
      GRID_nCurrentRecord = 0 ;
      rf1DZ2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARNHDR", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A13696BarNHdr, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARNHDR", GXutil.rtrim( A13696BarNHdr));
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
      rf1DZ2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV104Pgmname = "MantenimientodeHDRs_WC" ;
      Gx_err = (short)(0) ;
   }

   public int subgridclient_rec_count_fnc( )
   {
      AV105Mantenimientodehdrs_wcds_1_filterfulltext = AV15FilterFullText ;
      AV106Mantenimientodehdrs_wcds_2_tfbarnhdr = AV26TFBarNHdr ;
      AV107Mantenimientodehdrs_wcds_3_tfbarnhdr_sel = AV27TFBarNHdr_Sel ;
      AV108Mantenimientodehdrs_wcds_4_tfclinom = AV28TFCliNom ;
      AV109Mantenimientodehdrs_wcds_5_tfclinom_sel = AV29TFCliNom_Sel ;
      AV110Mantenimientodehdrs_wcds_6_tfpedidocliente = AV73TFPedidoCliente ;
      AV111Mantenimientodehdrs_wcds_7_tfpedidocliente_sel = AV74TFPedidoCliente_Sel ;
      AV112Mantenimientodehdrs_wcds_8_tfbarser = AV32TFBarSer ;
      AV113Mantenimientodehdrs_wcds_9_tfbarser_sel = AV33TFBarSer_Sel ;
      AV114Mantenimientodehdrs_wcds_10_tfbarserdsc = AV34TFBarSerDsc ;
      AV115Mantenimientodehdrs_wcds_11_tfbarserdsc_sel = AV35TFBarSerDsc_Sel ;
      AV116Mantenimientodehdrs_wcds_12_tfbartipartdsc = AV36TFBarTipArtDsc ;
      AV117Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel = AV37TFBarTipArtDsc_Sel ;
      AV118Mantenimientodehdrs_wcds_14_tfbarcolnom = AV40TFBarColNom ;
      AV119Mantenimientodehdrs_wcds_15_tfbarcolnom_sel = AV41TFBarColNom_Sel ;
      AV120Mantenimientodehdrs_wcds_16_tfbarcolnum = AV42TFBarColNum ;
      AV121Mantenimientodehdrs_wcds_17_tfbarcolnum_to = AV43TFBarColNum_To ;
      AV122Mantenimientodehdrs_wcds_18_tfbarfecgen = AV44TFBarFecGen ;
      AV123Mantenimientodehdrs_wcds_19_tfbarfeccli = AV48TFBarFecCli ;
      AV124Mantenimientodehdrs_wcds_20_tfbarfecsal = AV52TFBarFecSal ;
      AV125Mantenimientodehdrs_wcds_21_tfbarsit = AV56TFBarSit ;
      AV126Mantenimientodehdrs_wcds_22_tfbarsit_to = AV57TFBarSit_To ;
      AV127Mantenimientodehdrs_wcds_23_tfhayrec_sel = AV58TFHayRec_Sel ;
      AV128Mantenimientodehdrs_wcds_24_tfbarpart = AV98TFBarPart ;
      AV129Mantenimientodehdrs_wcds_25_tfbarpart_to = AV99TFBarPart_To ;
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV107Mantenimientodehdrs_wcds_3_tfbarnhdr_sel ,
                                           AV106Mantenimientodehdrs_wcds_2_tfbarnhdr ,
                                           AV109Mantenimientodehdrs_wcds_5_tfclinom_sel ,
                                           AV108Mantenimientodehdrs_wcds_4_tfclinom ,
                                           AV113Mantenimientodehdrs_wcds_9_tfbarser_sel ,
                                           AV112Mantenimientodehdrs_wcds_8_tfbarser ,
                                           AV115Mantenimientodehdrs_wcds_11_tfbarserdsc_sel ,
                                           AV114Mantenimientodehdrs_wcds_10_tfbarserdsc ,
                                           AV117Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel ,
                                           AV116Mantenimientodehdrs_wcds_12_tfbartipartdsc ,
                                           AV119Mantenimientodehdrs_wcds_15_tfbarcolnom_sel ,
                                           AV118Mantenimientodehdrs_wcds_14_tfbarcolnom ,
                                           Integer.valueOf(AV120Mantenimientodehdrs_wcds_16_tfbarcolnum) ,
                                           Integer.valueOf(AV121Mantenimientodehdrs_wcds_17_tfbarcolnum_to) ,
                                           AV122Mantenimientodehdrs_wcds_18_tfbarfecgen ,
                                           AV123Mantenimientodehdrs_wcds_19_tfbarfeccli ,
                                           AV124Mantenimientodehdrs_wcds_20_tfbarfecsal ,
                                           Byte.valueOf(AV125Mantenimientodehdrs_wcds_21_tfbarsit) ,
                                           Byte.valueOf(AV126Mantenimientodehdrs_wcds_22_tfbarsit_to) ,
                                           Short.valueOf(AV128Mantenimientodehdrs_wcds_24_tfbarpart) ,
                                           Short.valueOf(AV129Mantenimientodehdrs_wcds_25_tfbarpart_to) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A13711BarTipArtD ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A159BarFecGen ,
                                           A155BarFecCli ,
                                           A161BarFecSal ,
                                           Byte.valueOf(A213BarSit) ,
                                           Short.valueOf(A1503BarPart) ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV105Mantenimientodehdrs_wcds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A13878PedidoClie ,
                                           AV111Mantenimientodehdrs_wcds_7_tfpedidocliente_sel ,
                                           AV110Mantenimientodehdrs_wcds_6_tfpedidocliente ,
                                           Byte.valueOf(AV127Mantenimientodehdrs_wcds_23_tfhayrec_sel) ,
                                           Byte.valueOf(A13710HayRec) ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(AV65Clicod) ,
                                           AV66Barfecgen ,
                                           AV67BarFecGen_to ,
                                           Byte.valueOf(AV68Barsit) ,
                                           Byte.valueOf(AV69BarSit_to) ,
                                           A4812BarEncCli ,
                                           AV70BarEnccli ,
                                           Short.valueOf(AV72Enc20c) ,
                                           A143BarDisNum ,
                                           AV71BarDisnum ,
                                           Integer.valueOf(AV95Barcod) ,
                                           Byte.valueOf(AV96BarCodReo) ,
                                           AV97BarCodPar ,
                                           AV64Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV106Mantenimientodehdrs_wcds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV106Mantenimientodehdrs_wcds_2_tfbarnhdr), 11, "%") ;
      lV108Mantenimientodehdrs_wcds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV108Mantenimientodehdrs_wcds_4_tfclinom), 30, "%") ;
      lV112Mantenimientodehdrs_wcds_8_tfbarser = GXutil.padr( GXutil.rtrim( AV112Mantenimientodehdrs_wcds_8_tfbarser), 16, "%") ;
      lV114Mantenimientodehdrs_wcds_10_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV114Mantenimientodehdrs_wcds_10_tfbarserdsc), 26, "%") ;
      lV116Mantenimientodehdrs_wcds_12_tfbartipartdsc = GXutil.padr( GXutil.rtrim( AV116Mantenimientodehdrs_wcds_12_tfbartipartdsc), 30, "%") ;
      lV118Mantenimientodehdrs_wcds_14_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV118Mantenimientodehdrs_wcds_14_tfbarcolnom), 13, "%") ;
      /* Using cursor H01DZ2 */
      pr_default.execute(0, new Object[] {AV64Emprcod, Integer.valueOf(AV65Clicod), Integer.valueOf(AV65Clicod), AV66Barfecgen, AV67BarFecGen_to, Byte.valueOf(AV68Barsit), Byte.valueOf(AV69BarSit_to), AV70BarEnccli, Short.valueOf(AV72Enc20c), AV70BarEnccli, AV71BarDisnum, Short.valueOf(AV72Enc20c), AV71BarDisnum, Integer.valueOf(AV95Barcod), Integer.valueOf(AV95Barcod), Byte.valueOf(AV96BarCodReo), Byte.valueOf(AV96BarCodReo), AV97BarCodPar, AV97BarCodPar, lV106Mantenimientodehdrs_wcds_2_tfbarnhdr, AV107Mantenimientodehdrs_wcds_3_tfbarnhdr_sel, lV108Mantenimientodehdrs_wcds_4_tfclinom, AV109Mantenimientodehdrs_wcds_5_tfclinom_sel, lV112Mantenimientodehdrs_wcds_8_tfbarser, AV113Mantenimientodehdrs_wcds_9_tfbarser_sel, lV114Mantenimientodehdrs_wcds_10_tfbarserdsc, AV115Mantenimientodehdrs_wcds_11_tfbarserdsc_sel, lV116Mantenimientodehdrs_wcds_12_tfbartipartdsc, AV117Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel, lV118Mantenimientodehdrs_wcds_14_tfbarcolnom, AV119Mantenimientodehdrs_wcds_15_tfbarcolnom_sel, Integer.valueOf(AV120Mantenimientodehdrs_wcds_16_tfbarcolnum), Integer.valueOf(AV121Mantenimientodehdrs_wcds_17_tfbarcolnum_to), AV122Mantenimientodehdrs_wcds_18_tfbarfecgen, AV123Mantenimientodehdrs_wcds_19_tfbarfeccli, AV124Mantenimientodehdrs_wcds_20_tfbarfecsal, Byte.valueOf(AV125Mantenimientodehdrs_wcds_21_tfbarsit), Byte.valueOf(AV126Mantenimientodehdrs_wcds_22_tfbarsit_to), Short.valueOf(AV128Mantenimientodehdrs_wcds_24_tfbarpart), Short.valueOf(AV129Mantenimientodehdrs_wcds_25_tfbarpart_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A217BarTipArt = H01DZ2_A217BarTipArt[0] ;
         n217BarTipArt = H01DZ2_n217BarTipArt[0] ;
         A1503BarPart = H01DZ2_A1503BarPart[0] ;
         A2265BarExt = H01DZ2_A2265BarExt[0] ;
         n2265BarExt = H01DZ2_n2265BarExt[0] ;
         A3594BarPriTin = H01DZ2_A3594BarPriTin[0] ;
         A361DisCod = H01DZ2_A361DisCod[0] ;
         A213BarSit = H01DZ2_A213BarSit[0] ;
         A161BarFecSal = H01DZ2_A161BarFecSal[0] ;
         A155BarFecCli = H01DZ2_A155BarFecCli[0] ;
         A159BarFecGen = H01DZ2_A159BarFecGen[0] ;
         A136BarColNum = H01DZ2_A136BarColNum[0] ;
         A135BarColNom = H01DZ2_A135BarColNom[0] ;
         A252CliCod = H01DZ2_A252CliCod[0] ;
         n252CliCod = H01DZ2_n252CliCod[0] ;
         A13711BarTipArtD = H01DZ2_A13711BarTipArtD[0] ;
         n13711BarTipArtD = H01DZ2_n13711BarTipArtD[0] ;
         A1652BarSerDsc = H01DZ2_A1652BarSerDsc[0] ;
         A212BarSer = H01DZ2_A212BarSer[0] ;
         A279CliNom = H01DZ2_A279CliNom[0] ;
         A13696BarNHdr = H01DZ2_A13696BarNHdr[0] ;
         A143BarDisNum = H01DZ2_A143BarDisNum[0] ;
         A4812BarEncCli = H01DZ2_A4812BarEncCli[0] ;
         A130BarCodPar = H01DZ2_A130BarCodPar[0] ;
         A132BarCodReo = H01DZ2_A132BarCodReo[0] ;
         A129BarCod = H01DZ2_A129BarCod[0] ;
         A396EmprCod = H01DZ2_A396EmprCod[0] ;
         A13711BarTipArtD = H01DZ2_A13711BarTipArtD[0] ;
         n13711BarTipArtD = H01DZ2_n13711BarTipArtD[0] ;
         A279CliNom = H01DZ2_A279CliNom[0] ;
         GXt_char1 = A13878PedidoClie ;
         GXv_char2[0] = A396EmprCod ;
         GXv_char3[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char5[0] = GXt_char1 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_char4, GXv_char5) ;
         mantenimientodehdrs_wc_impl.this.A396EmprCod = GXv_char2[0] ;
         mantenimientodehdrs_wc_impl.this.A4812BarEncCli = GXv_char3[0] ;
         mantenimientodehdrs_wc_impl.this.A143BarDisNum = GXv_char4[0] ;
         mantenimientodehdrs_wc_impl.this.GXt_char1 = GXv_char5[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A143BarDisNum", A143BarDisNum);
         A13878PedidoClie = GXt_char1 ;
         if ( (GXutil.strcmp("", AV105Mantenimientodehdrs_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV105Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV105Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV105Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV105Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV105Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13711BarTipArtD) , GXutil.padr( "%" + GXutil.upper( AV105Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV105Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV105Mantenimientodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV105Mantenimientodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1503BarPart, 4, 0) , GXutil.padr( "%" + AV105Mantenimientodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV111Mantenimientodehdrs_wcds_7_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV110Mantenimientodehdrs_wcds_6_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV110Mantenimientodehdrs_wcds_6_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV111Mantenimientodehdrs_wcds_7_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV111Mantenimientodehdrs_wcds_7_tfpedidocliente_sel) == 0 ) ) )
               {
                  GXt_int6 = A13710HayRec ;
                  GXv_int7[0] = GXt_int6 ;
                  new app.phayrec(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int7) ;
                  mantenimientodehdrs_wc_impl.this.GXt_int6 = GXv_int7[0] ;
                  A13710HayRec = GXt_int6 ;
                  if ( ( AV127Mantenimientodehdrs_wcds_23_tfhayrec_sel != 1 ) || ( ( A13710HayRec == 1 ) ) )
                  {
                     if ( ( AV127Mantenimientodehdrs_wcds_23_tfhayrec_sel != 2 ) || ( ( A13710HayRec == 0 ) ) )
                     {
                        GRID_nRecordCount = (long)(GRID_nRecordCount+1) ;
                     }
                  }
               }
            }
         }
         pr_default.readNext(0);
      }
      GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      pr_default.close(0);
      return (int)(GRID_nRecordCount) ;
   }

   public void rf1DZ2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(41) ;
      /* Execute user event: Refresh */
      e201DZ2 ();
      nGXsfl_41_idx = 1 ;
      sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_412( ) ;
      bGXsfl_41_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
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
         subsflControlProps_412( ) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              AV107Mantenimientodehdrs_wcds_3_tfbarnhdr_sel ,
                                              AV106Mantenimientodehdrs_wcds_2_tfbarnhdr ,
                                              AV109Mantenimientodehdrs_wcds_5_tfclinom_sel ,
                                              AV108Mantenimientodehdrs_wcds_4_tfclinom ,
                                              AV113Mantenimientodehdrs_wcds_9_tfbarser_sel ,
                                              AV112Mantenimientodehdrs_wcds_8_tfbarser ,
                                              AV115Mantenimientodehdrs_wcds_11_tfbarserdsc_sel ,
                                              AV114Mantenimientodehdrs_wcds_10_tfbarserdsc ,
                                              AV117Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel ,
                                              AV116Mantenimientodehdrs_wcds_12_tfbartipartdsc ,
                                              AV119Mantenimientodehdrs_wcds_15_tfbarcolnom_sel ,
                                              AV118Mantenimientodehdrs_wcds_14_tfbarcolnom ,
                                              Integer.valueOf(AV120Mantenimientodehdrs_wcds_16_tfbarcolnum) ,
                                              Integer.valueOf(AV121Mantenimientodehdrs_wcds_17_tfbarcolnum_to) ,
                                              AV122Mantenimientodehdrs_wcds_18_tfbarfecgen ,
                                              AV123Mantenimientodehdrs_wcds_19_tfbarfeccli ,
                                              AV124Mantenimientodehdrs_wcds_20_tfbarfecsal ,
                                              Byte.valueOf(AV125Mantenimientodehdrs_wcds_21_tfbarsit) ,
                                              Byte.valueOf(AV126Mantenimientodehdrs_wcds_22_tfbarsit_to) ,
                                              Short.valueOf(AV128Mantenimientodehdrs_wcds_24_tfbarpart) ,
                                              Short.valueOf(AV129Mantenimientodehdrs_wcds_25_tfbarpart_to) ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar ,
                                              A279CliNom ,
                                              A212BarSer ,
                                              A1652BarSerDsc ,
                                              A13711BarTipArtD ,
                                              A135BarColNom ,
                                              Integer.valueOf(A136BarColNum) ,
                                              A159BarFecGen ,
                                              A155BarFecCli ,
                                              A161BarFecSal ,
                                              Byte.valueOf(A213BarSit) ,
                                              Short.valueOf(A1503BarPart) ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV105Mantenimientodehdrs_wcds_1_filterfulltext ,
                                              A13696BarNHdr ,
                                              A13878PedidoClie ,
                                              AV111Mantenimientodehdrs_wcds_7_tfpedidocliente_sel ,
                                              AV110Mantenimientodehdrs_wcds_6_tfpedidocliente ,
                                              Byte.valueOf(AV127Mantenimientodehdrs_wcds_23_tfhayrec_sel) ,
                                              Byte.valueOf(A13710HayRec) ,
                                              Integer.valueOf(A252CliCod) ,
                                              Integer.valueOf(AV65Clicod) ,
                                              AV66Barfecgen ,
                                              AV67BarFecGen_to ,
                                              Byte.valueOf(AV68Barsit) ,
                                              Byte.valueOf(AV69BarSit_to) ,
                                              A4812BarEncCli ,
                                              AV70BarEnccli ,
                                              Short.valueOf(AV72Enc20c) ,
                                              A143BarDisNum ,
                                              AV71BarDisnum ,
                                              Integer.valueOf(AV95Barcod) ,
                                              Byte.valueOf(AV96BarCodReo) ,
                                              AV97BarCodPar ,
                                              AV64Emprcod ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT,
                                              TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                              TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                              TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV106Mantenimientodehdrs_wcds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV106Mantenimientodehdrs_wcds_2_tfbarnhdr), 11, "%") ;
         lV108Mantenimientodehdrs_wcds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV108Mantenimientodehdrs_wcds_4_tfclinom), 30, "%") ;
         lV112Mantenimientodehdrs_wcds_8_tfbarser = GXutil.padr( GXutil.rtrim( AV112Mantenimientodehdrs_wcds_8_tfbarser), 16, "%") ;
         lV114Mantenimientodehdrs_wcds_10_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV114Mantenimientodehdrs_wcds_10_tfbarserdsc), 26, "%") ;
         lV116Mantenimientodehdrs_wcds_12_tfbartipartdsc = GXutil.padr( GXutil.rtrim( AV116Mantenimientodehdrs_wcds_12_tfbartipartdsc), 30, "%") ;
         lV118Mantenimientodehdrs_wcds_14_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV118Mantenimientodehdrs_wcds_14_tfbarcolnom), 13, "%") ;
         /* Using cursor H01DZ3 */
         pr_default.execute(1, new Object[] {AV64Emprcod, Integer.valueOf(AV65Clicod), Integer.valueOf(AV65Clicod), AV66Barfecgen, AV67BarFecGen_to, Byte.valueOf(AV68Barsit), Byte.valueOf(AV69BarSit_to), AV70BarEnccli, Short.valueOf(AV72Enc20c), AV70BarEnccli, AV71BarDisnum, Short.valueOf(AV72Enc20c), AV71BarDisnum, Integer.valueOf(AV95Barcod), Integer.valueOf(AV95Barcod), Byte.valueOf(AV96BarCodReo), Byte.valueOf(AV96BarCodReo), AV97BarCodPar, AV97BarCodPar, lV106Mantenimientodehdrs_wcds_2_tfbarnhdr, AV107Mantenimientodehdrs_wcds_3_tfbarnhdr_sel, lV108Mantenimientodehdrs_wcds_4_tfclinom, AV109Mantenimientodehdrs_wcds_5_tfclinom_sel, lV112Mantenimientodehdrs_wcds_8_tfbarser, AV113Mantenimientodehdrs_wcds_9_tfbarser_sel, lV114Mantenimientodehdrs_wcds_10_tfbarserdsc, AV115Mantenimientodehdrs_wcds_11_tfbarserdsc_sel, lV116Mantenimientodehdrs_wcds_12_tfbartipartdsc, AV117Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel, lV118Mantenimientodehdrs_wcds_14_tfbarcolnom, AV119Mantenimientodehdrs_wcds_15_tfbarcolnom_sel, Integer.valueOf(AV120Mantenimientodehdrs_wcds_16_tfbarcolnum), Integer.valueOf(AV121Mantenimientodehdrs_wcds_17_tfbarcolnum_to), AV122Mantenimientodehdrs_wcds_18_tfbarfecgen, AV123Mantenimientodehdrs_wcds_19_tfbarfeccli, AV124Mantenimientodehdrs_wcds_20_tfbarfecsal, Byte.valueOf(AV125Mantenimientodehdrs_wcds_21_tfbarsit), Byte.valueOf(AV126Mantenimientodehdrs_wcds_22_tfbarsit_to), Short.valueOf(AV128Mantenimientodehdrs_wcds_24_tfbarpart), Short.valueOf(AV129Mantenimientodehdrs_wcds_25_tfbarpart_to)});
         nGXsfl_41_idx = 1 ;
         sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_412( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A217BarTipArt = H01DZ3_A217BarTipArt[0] ;
            n217BarTipArt = H01DZ3_n217BarTipArt[0] ;
            A1503BarPart = H01DZ3_A1503BarPart[0] ;
            A2265BarExt = H01DZ3_A2265BarExt[0] ;
            n2265BarExt = H01DZ3_n2265BarExt[0] ;
            A3594BarPriTin = H01DZ3_A3594BarPriTin[0] ;
            A361DisCod = H01DZ3_A361DisCod[0] ;
            A213BarSit = H01DZ3_A213BarSit[0] ;
            A161BarFecSal = H01DZ3_A161BarFecSal[0] ;
            A155BarFecCli = H01DZ3_A155BarFecCli[0] ;
            A159BarFecGen = H01DZ3_A159BarFecGen[0] ;
            A136BarColNum = H01DZ3_A136BarColNum[0] ;
            A135BarColNom = H01DZ3_A135BarColNom[0] ;
            A252CliCod = H01DZ3_A252CliCod[0] ;
            n252CliCod = H01DZ3_n252CliCod[0] ;
            A13711BarTipArtD = H01DZ3_A13711BarTipArtD[0] ;
            n13711BarTipArtD = H01DZ3_n13711BarTipArtD[0] ;
            A1652BarSerDsc = H01DZ3_A1652BarSerDsc[0] ;
            A212BarSer = H01DZ3_A212BarSer[0] ;
            A279CliNom = H01DZ3_A279CliNom[0] ;
            A13696BarNHdr = H01DZ3_A13696BarNHdr[0] ;
            A143BarDisNum = H01DZ3_A143BarDisNum[0] ;
            A4812BarEncCli = H01DZ3_A4812BarEncCli[0] ;
            A130BarCodPar = H01DZ3_A130BarCodPar[0] ;
            A132BarCodReo = H01DZ3_A132BarCodReo[0] ;
            A129BarCod = H01DZ3_A129BarCod[0] ;
            A396EmprCod = H01DZ3_A396EmprCod[0] ;
            A13711BarTipArtD = H01DZ3_A13711BarTipArtD[0] ;
            n13711BarTipArtD = H01DZ3_n13711BarTipArtD[0] ;
            A279CliNom = H01DZ3_A279CliNom[0] ;
            GXt_char1 = A13878PedidoClie ;
            GXv_char5[0] = A396EmprCod ;
            GXv_char4[0] = A4812BarEncCli ;
            GXv_char3[0] = A143BarDisNum ;
            GXv_char2[0] = GXt_char1 ;
            new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char5, GXv_char4, GXv_char3, GXv_char2) ;
            mantenimientodehdrs_wc_impl.this.A396EmprCod = GXv_char5[0] ;
            mantenimientodehdrs_wc_impl.this.A4812BarEncCli = GXv_char4[0] ;
            mantenimientodehdrs_wc_impl.this.A143BarDisNum = GXv_char3[0] ;
            mantenimientodehdrs_wc_impl.this.GXt_char1 = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A143BarDisNum", A143BarDisNum);
            A13878PedidoClie = GXt_char1 ;
            if ( (GXutil.strcmp("", AV105Mantenimientodehdrs_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV105Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV105Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV105Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV105Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV105Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13711BarTipArtD) , GXutil.padr( "%" + GXutil.upper( AV105Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV105Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV105Mantenimientodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV105Mantenimientodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1503BarPart, 4, 0) , GXutil.padr( "%" + AV105Mantenimientodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
            {
               if ( ! ( (GXutil.strcmp("", AV111Mantenimientodehdrs_wcds_7_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV110Mantenimientodehdrs_wcds_6_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV110Mantenimientodehdrs_wcds_6_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV111Mantenimientodehdrs_wcds_7_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV111Mantenimientodehdrs_wcds_7_tfpedidocliente_sel) == 0 ) ) )
                  {
                     GXt_int6 = A13710HayRec ;
                     GXv_int7[0] = GXt_int6 ;
                     new app.phayrec(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int7) ;
                     mantenimientodehdrs_wc_impl.this.GXt_int6 = GXv_int7[0] ;
                     A13710HayRec = GXt_int6 ;
                     if ( ( AV127Mantenimientodehdrs_wcds_23_tfhayrec_sel != 1 ) || ( ( A13710HayRec == 1 ) ) )
                     {
                        if ( ( AV127Mantenimientodehdrs_wcds_23_tfhayrec_sel != 2 ) || ( ( A13710HayRec == 0 ) ) )
                        {
                           e211DZ2 ();
                        }
                     }
                  }
               }
            }
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(41) ;
         wb1DZ0( ) ;
      }
      bGXsfl_41_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1DZ2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARNHDR"+"_"+sGXsfl_41_idx, getSecureSignedToken( sPrefix+sGXsfl_41_idx, GXutil.rtrim( localUtil.format( A13696BarNHdr, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV104Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV104Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vUSURCOD", GXutil.rtrim( AV88Usurcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vUSURCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV88Usurcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSTATION", GXutil.rtrim( AV89Station));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTATION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV89Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCARVITIN", GXutil.ltrim( localUtil.ntoc( AV100Carvitin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCARVITIN", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV100Carvitin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPWDGRL", GXutil.ltrim( localUtil.ntoc( AV76Pwdgrl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPWDGRL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV76Pwdgrl), "ZZZ9")));
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
      AV105Mantenimientodehdrs_wcds_1_filterfulltext = AV15FilterFullText ;
      AV106Mantenimientodehdrs_wcds_2_tfbarnhdr = AV26TFBarNHdr ;
      AV107Mantenimientodehdrs_wcds_3_tfbarnhdr_sel = AV27TFBarNHdr_Sel ;
      AV108Mantenimientodehdrs_wcds_4_tfclinom = AV28TFCliNom ;
      AV109Mantenimientodehdrs_wcds_5_tfclinom_sel = AV29TFCliNom_Sel ;
      AV110Mantenimientodehdrs_wcds_6_tfpedidocliente = AV73TFPedidoCliente ;
      AV111Mantenimientodehdrs_wcds_7_tfpedidocliente_sel = AV74TFPedidoCliente_Sel ;
      AV112Mantenimientodehdrs_wcds_8_tfbarser = AV32TFBarSer ;
      AV113Mantenimientodehdrs_wcds_9_tfbarser_sel = AV33TFBarSer_Sel ;
      AV114Mantenimientodehdrs_wcds_10_tfbarserdsc = AV34TFBarSerDsc ;
      AV115Mantenimientodehdrs_wcds_11_tfbarserdsc_sel = AV35TFBarSerDsc_Sel ;
      AV116Mantenimientodehdrs_wcds_12_tfbartipartdsc = AV36TFBarTipArtDsc ;
      AV117Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel = AV37TFBarTipArtDsc_Sel ;
      AV118Mantenimientodehdrs_wcds_14_tfbarcolnom = AV40TFBarColNom ;
      AV119Mantenimientodehdrs_wcds_15_tfbarcolnom_sel = AV41TFBarColNom_Sel ;
      AV120Mantenimientodehdrs_wcds_16_tfbarcolnum = AV42TFBarColNum ;
      AV121Mantenimientodehdrs_wcds_17_tfbarcolnum_to = AV43TFBarColNum_To ;
      AV122Mantenimientodehdrs_wcds_18_tfbarfecgen = AV44TFBarFecGen ;
      AV123Mantenimientodehdrs_wcds_19_tfbarfeccli = AV48TFBarFecCli ;
      AV124Mantenimientodehdrs_wcds_20_tfbarfecsal = AV52TFBarFecSal ;
      AV125Mantenimientodehdrs_wcds_21_tfbarsit = AV56TFBarSit ;
      AV126Mantenimientodehdrs_wcds_22_tfbarsit_to = AV57TFBarSit_To ;
      AV127Mantenimientodehdrs_wcds_23_tfhayrec_sel = AV58TFHayRec_Sel ;
      AV128Mantenimientodehdrs_wcds_24_tfbarpart = AV98TFBarPart ;
      AV129Mantenimientodehdrs_wcds_25_tfbarpart_to = AV99TFBarPart_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV72Enc20c, AV64Emprcod, AV65Clicod, AV66Barfecgen, AV67BarFecGen_to, AV68Barsit, AV69BarSit_to, AV70BarEnccli, AV71BarDisnum, AV95Barcod, AV96BarCodReo, AV97BarCodPar, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV104Pgmname, AV88Usurcod, AV89Station, AV15FilterFullText, AV26TFBarNHdr, AV27TFBarNHdr_Sel, AV28TFCliNom, AV29TFCliNom_Sel, AV73TFPedidoCliente, AV74TFPedidoCliente_Sel, AV32TFBarSer, AV33TFBarSer_Sel, AV34TFBarSerDsc, AV35TFBarSerDsc_Sel, AV36TFBarTipArtDsc, AV37TFBarTipArtDsc_Sel, AV40TFBarColNom, AV41TFBarColNom_Sel, AV42TFBarColNum, AV43TFBarColNum_To, AV44TFBarFecGen, AV48TFBarFecCli, AV52TFBarFecSal, AV56TFBarSit, AV57TFBarSit_To, AV58TFHayRec_Sel, AV98TFBarPart, AV99TFBarPart_To, AV12OrderedBy, AV13OrderedDsc, Gx_mode, AV100Carvitin, AV76Pwdgrl, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV105Mantenimientodehdrs_wcds_1_filterfulltext = AV15FilterFullText ;
      AV106Mantenimientodehdrs_wcds_2_tfbarnhdr = AV26TFBarNHdr ;
      AV107Mantenimientodehdrs_wcds_3_tfbarnhdr_sel = AV27TFBarNHdr_Sel ;
      AV108Mantenimientodehdrs_wcds_4_tfclinom = AV28TFCliNom ;
      AV109Mantenimientodehdrs_wcds_5_tfclinom_sel = AV29TFCliNom_Sel ;
      AV110Mantenimientodehdrs_wcds_6_tfpedidocliente = AV73TFPedidoCliente ;
      AV111Mantenimientodehdrs_wcds_7_tfpedidocliente_sel = AV74TFPedidoCliente_Sel ;
      AV112Mantenimientodehdrs_wcds_8_tfbarser = AV32TFBarSer ;
      AV113Mantenimientodehdrs_wcds_9_tfbarser_sel = AV33TFBarSer_Sel ;
      AV114Mantenimientodehdrs_wcds_10_tfbarserdsc = AV34TFBarSerDsc ;
      AV115Mantenimientodehdrs_wcds_11_tfbarserdsc_sel = AV35TFBarSerDsc_Sel ;
      AV116Mantenimientodehdrs_wcds_12_tfbartipartdsc = AV36TFBarTipArtDsc ;
      AV117Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel = AV37TFBarTipArtDsc_Sel ;
      AV118Mantenimientodehdrs_wcds_14_tfbarcolnom = AV40TFBarColNom ;
      AV119Mantenimientodehdrs_wcds_15_tfbarcolnom_sel = AV41TFBarColNom_Sel ;
      AV120Mantenimientodehdrs_wcds_16_tfbarcolnum = AV42TFBarColNum ;
      AV121Mantenimientodehdrs_wcds_17_tfbarcolnum_to = AV43TFBarColNum_To ;
      AV122Mantenimientodehdrs_wcds_18_tfbarfecgen = AV44TFBarFecGen ;
      AV123Mantenimientodehdrs_wcds_19_tfbarfeccli = AV48TFBarFecCli ;
      AV124Mantenimientodehdrs_wcds_20_tfbarfecsal = AV52TFBarFecSal ;
      AV125Mantenimientodehdrs_wcds_21_tfbarsit = AV56TFBarSit ;
      AV126Mantenimientodehdrs_wcds_22_tfbarsit_to = AV57TFBarSit_To ;
      AV127Mantenimientodehdrs_wcds_23_tfhayrec_sel = AV58TFHayRec_Sel ;
      AV128Mantenimientodehdrs_wcds_24_tfbarpart = AV98TFBarPart ;
      AV129Mantenimientodehdrs_wcds_25_tfbarpart_to = AV99TFBarPart_To ;
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV72Enc20c, AV64Emprcod, AV65Clicod, AV66Barfecgen, AV67BarFecGen_to, AV68Barsit, AV69BarSit_to, AV70BarEnccli, AV71BarDisnum, AV95Barcod, AV96BarCodReo, AV97BarCodPar, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV104Pgmname, AV88Usurcod, AV89Station, AV15FilterFullText, AV26TFBarNHdr, AV27TFBarNHdr_Sel, AV28TFCliNom, AV29TFCliNom_Sel, AV73TFPedidoCliente, AV74TFPedidoCliente_Sel, AV32TFBarSer, AV33TFBarSer_Sel, AV34TFBarSerDsc, AV35TFBarSerDsc_Sel, AV36TFBarTipArtDsc, AV37TFBarTipArtDsc_Sel, AV40TFBarColNom, AV41TFBarColNom_Sel, AV42TFBarColNum, AV43TFBarColNum_To, AV44TFBarFecGen, AV48TFBarFecCli, AV52TFBarFecSal, AV56TFBarSit, AV57TFBarSit_To, AV58TFHayRec_Sel, AV98TFBarPart, AV99TFBarPart_To, AV12OrderedBy, AV13OrderedDsc, Gx_mode, AV100Carvitin, AV76Pwdgrl, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV105Mantenimientodehdrs_wcds_1_filterfulltext = AV15FilterFullText ;
      AV106Mantenimientodehdrs_wcds_2_tfbarnhdr = AV26TFBarNHdr ;
      AV107Mantenimientodehdrs_wcds_3_tfbarnhdr_sel = AV27TFBarNHdr_Sel ;
      AV108Mantenimientodehdrs_wcds_4_tfclinom = AV28TFCliNom ;
      AV109Mantenimientodehdrs_wcds_5_tfclinom_sel = AV29TFCliNom_Sel ;
      AV110Mantenimientodehdrs_wcds_6_tfpedidocliente = AV73TFPedidoCliente ;
      AV111Mantenimientodehdrs_wcds_7_tfpedidocliente_sel = AV74TFPedidoCliente_Sel ;
      AV112Mantenimientodehdrs_wcds_8_tfbarser = AV32TFBarSer ;
      AV113Mantenimientodehdrs_wcds_9_tfbarser_sel = AV33TFBarSer_Sel ;
      AV114Mantenimientodehdrs_wcds_10_tfbarserdsc = AV34TFBarSerDsc ;
      AV115Mantenimientodehdrs_wcds_11_tfbarserdsc_sel = AV35TFBarSerDsc_Sel ;
      AV116Mantenimientodehdrs_wcds_12_tfbartipartdsc = AV36TFBarTipArtDsc ;
      AV117Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel = AV37TFBarTipArtDsc_Sel ;
      AV118Mantenimientodehdrs_wcds_14_tfbarcolnom = AV40TFBarColNom ;
      AV119Mantenimientodehdrs_wcds_15_tfbarcolnom_sel = AV41TFBarColNom_Sel ;
      AV120Mantenimientodehdrs_wcds_16_tfbarcolnum = AV42TFBarColNum ;
      AV121Mantenimientodehdrs_wcds_17_tfbarcolnum_to = AV43TFBarColNum_To ;
      AV122Mantenimientodehdrs_wcds_18_tfbarfecgen = AV44TFBarFecGen ;
      AV123Mantenimientodehdrs_wcds_19_tfbarfeccli = AV48TFBarFecCli ;
      AV124Mantenimientodehdrs_wcds_20_tfbarfecsal = AV52TFBarFecSal ;
      AV125Mantenimientodehdrs_wcds_21_tfbarsit = AV56TFBarSit ;
      AV126Mantenimientodehdrs_wcds_22_tfbarsit_to = AV57TFBarSit_To ;
      AV127Mantenimientodehdrs_wcds_23_tfhayrec_sel = AV58TFHayRec_Sel ;
      AV128Mantenimientodehdrs_wcds_24_tfbarpart = AV98TFBarPart ;
      AV129Mantenimientodehdrs_wcds_25_tfbarpart_to = AV99TFBarPart_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV72Enc20c, AV64Emprcod, AV65Clicod, AV66Barfecgen, AV67BarFecGen_to, AV68Barsit, AV69BarSit_to, AV70BarEnccli, AV71BarDisnum, AV95Barcod, AV96BarCodReo, AV97BarCodPar, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV104Pgmname, AV88Usurcod, AV89Station, AV15FilterFullText, AV26TFBarNHdr, AV27TFBarNHdr_Sel, AV28TFCliNom, AV29TFCliNom_Sel, AV73TFPedidoCliente, AV74TFPedidoCliente_Sel, AV32TFBarSer, AV33TFBarSer_Sel, AV34TFBarSerDsc, AV35TFBarSerDsc_Sel, AV36TFBarTipArtDsc, AV37TFBarTipArtDsc_Sel, AV40TFBarColNom, AV41TFBarColNom_Sel, AV42TFBarColNum, AV43TFBarColNum_To, AV44TFBarFecGen, AV48TFBarFecCli, AV52TFBarFecSal, AV56TFBarSit, AV57TFBarSit_To, AV58TFHayRec_Sel, AV98TFBarPart, AV99TFBarPart_To, AV12OrderedBy, AV13OrderedDsc, Gx_mode, AV100Carvitin, AV76Pwdgrl, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV105Mantenimientodehdrs_wcds_1_filterfulltext = AV15FilterFullText ;
      AV106Mantenimientodehdrs_wcds_2_tfbarnhdr = AV26TFBarNHdr ;
      AV107Mantenimientodehdrs_wcds_3_tfbarnhdr_sel = AV27TFBarNHdr_Sel ;
      AV108Mantenimientodehdrs_wcds_4_tfclinom = AV28TFCliNom ;
      AV109Mantenimientodehdrs_wcds_5_tfclinom_sel = AV29TFCliNom_Sel ;
      AV110Mantenimientodehdrs_wcds_6_tfpedidocliente = AV73TFPedidoCliente ;
      AV111Mantenimientodehdrs_wcds_7_tfpedidocliente_sel = AV74TFPedidoCliente_Sel ;
      AV112Mantenimientodehdrs_wcds_8_tfbarser = AV32TFBarSer ;
      AV113Mantenimientodehdrs_wcds_9_tfbarser_sel = AV33TFBarSer_Sel ;
      AV114Mantenimientodehdrs_wcds_10_tfbarserdsc = AV34TFBarSerDsc ;
      AV115Mantenimientodehdrs_wcds_11_tfbarserdsc_sel = AV35TFBarSerDsc_Sel ;
      AV116Mantenimientodehdrs_wcds_12_tfbartipartdsc = AV36TFBarTipArtDsc ;
      AV117Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel = AV37TFBarTipArtDsc_Sel ;
      AV118Mantenimientodehdrs_wcds_14_tfbarcolnom = AV40TFBarColNom ;
      AV119Mantenimientodehdrs_wcds_15_tfbarcolnom_sel = AV41TFBarColNom_Sel ;
      AV120Mantenimientodehdrs_wcds_16_tfbarcolnum = AV42TFBarColNum ;
      AV121Mantenimientodehdrs_wcds_17_tfbarcolnum_to = AV43TFBarColNum_To ;
      AV122Mantenimientodehdrs_wcds_18_tfbarfecgen = AV44TFBarFecGen ;
      AV123Mantenimientodehdrs_wcds_19_tfbarfeccli = AV48TFBarFecCli ;
      AV124Mantenimientodehdrs_wcds_20_tfbarfecsal = AV52TFBarFecSal ;
      AV125Mantenimientodehdrs_wcds_21_tfbarsit = AV56TFBarSit ;
      AV126Mantenimientodehdrs_wcds_22_tfbarsit_to = AV57TFBarSit_To ;
      AV127Mantenimientodehdrs_wcds_23_tfhayrec_sel = AV58TFHayRec_Sel ;
      AV128Mantenimientodehdrs_wcds_24_tfbarpart = AV98TFBarPart ;
      AV129Mantenimientodehdrs_wcds_25_tfbarpart_to = AV99TFBarPart_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV72Enc20c, AV64Emprcod, AV65Clicod, AV66Barfecgen, AV67BarFecGen_to, AV68Barsit, AV69BarSit_to, AV70BarEnccli, AV71BarDisnum, AV95Barcod, AV96BarCodReo, AV97BarCodPar, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV104Pgmname, AV88Usurcod, AV89Station, AV15FilterFullText, AV26TFBarNHdr, AV27TFBarNHdr_Sel, AV28TFCliNom, AV29TFCliNom_Sel, AV73TFPedidoCliente, AV74TFPedidoCliente_Sel, AV32TFBarSer, AV33TFBarSer_Sel, AV34TFBarSerDsc, AV35TFBarSerDsc_Sel, AV36TFBarTipArtDsc, AV37TFBarTipArtDsc_Sel, AV40TFBarColNom, AV41TFBarColNom_Sel, AV42TFBarColNum, AV43TFBarColNum_To, AV44TFBarFecGen, AV48TFBarFecCli, AV52TFBarFecSal, AV56TFBarSit, AV57TFBarSit_To, AV58TFHayRec_Sel, AV98TFBarPart, AV99TFBarPart_To, AV12OrderedBy, AV13OrderedDsc, Gx_mode, AV100Carvitin, AV76Pwdgrl, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV105Mantenimientodehdrs_wcds_1_filterfulltext = AV15FilterFullText ;
      AV106Mantenimientodehdrs_wcds_2_tfbarnhdr = AV26TFBarNHdr ;
      AV107Mantenimientodehdrs_wcds_3_tfbarnhdr_sel = AV27TFBarNHdr_Sel ;
      AV108Mantenimientodehdrs_wcds_4_tfclinom = AV28TFCliNom ;
      AV109Mantenimientodehdrs_wcds_5_tfclinom_sel = AV29TFCliNom_Sel ;
      AV110Mantenimientodehdrs_wcds_6_tfpedidocliente = AV73TFPedidoCliente ;
      AV111Mantenimientodehdrs_wcds_7_tfpedidocliente_sel = AV74TFPedidoCliente_Sel ;
      AV112Mantenimientodehdrs_wcds_8_tfbarser = AV32TFBarSer ;
      AV113Mantenimientodehdrs_wcds_9_tfbarser_sel = AV33TFBarSer_Sel ;
      AV114Mantenimientodehdrs_wcds_10_tfbarserdsc = AV34TFBarSerDsc ;
      AV115Mantenimientodehdrs_wcds_11_tfbarserdsc_sel = AV35TFBarSerDsc_Sel ;
      AV116Mantenimientodehdrs_wcds_12_tfbartipartdsc = AV36TFBarTipArtDsc ;
      AV117Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel = AV37TFBarTipArtDsc_Sel ;
      AV118Mantenimientodehdrs_wcds_14_tfbarcolnom = AV40TFBarColNom ;
      AV119Mantenimientodehdrs_wcds_15_tfbarcolnom_sel = AV41TFBarColNom_Sel ;
      AV120Mantenimientodehdrs_wcds_16_tfbarcolnum = AV42TFBarColNum ;
      AV121Mantenimientodehdrs_wcds_17_tfbarcolnum_to = AV43TFBarColNum_To ;
      AV122Mantenimientodehdrs_wcds_18_tfbarfecgen = AV44TFBarFecGen ;
      AV123Mantenimientodehdrs_wcds_19_tfbarfeccli = AV48TFBarFecCli ;
      AV124Mantenimientodehdrs_wcds_20_tfbarfecsal = AV52TFBarFecSal ;
      AV125Mantenimientodehdrs_wcds_21_tfbarsit = AV56TFBarSit ;
      AV126Mantenimientodehdrs_wcds_22_tfbarsit_to = AV57TFBarSit_To ;
      AV127Mantenimientodehdrs_wcds_23_tfhayrec_sel = AV58TFHayRec_Sel ;
      AV128Mantenimientodehdrs_wcds_24_tfbarpart = AV98TFBarPart ;
      AV129Mantenimientodehdrs_wcds_25_tfbarpart_to = AV99TFBarPart_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV72Enc20c, AV64Emprcod, AV65Clicod, AV66Barfecgen, AV67BarFecGen_to, AV68Barsit, AV69BarSit_to, AV70BarEnccli, AV71BarDisnum, AV95Barcod, AV96BarCodReo, AV97BarCodPar, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV104Pgmname, AV88Usurcod, AV89Station, AV15FilterFullText, AV26TFBarNHdr, AV27TFBarNHdr_Sel, AV28TFCliNom, AV29TFCliNom_Sel, AV73TFPedidoCliente, AV74TFPedidoCliente_Sel, AV32TFBarSer, AV33TFBarSer_Sel, AV34TFBarSerDsc, AV35TFBarSerDsc_Sel, AV36TFBarTipArtDsc, AV37TFBarTipArtDsc_Sel, AV40TFBarColNom, AV41TFBarColNom_Sel, AV42TFBarColNum, AV43TFBarColNum_To, AV44TFBarFecGen, AV48TFBarFecCli, AV52TFBarFecSal, AV56TFBarSit, AV57TFBarSit_To, AV58TFHayRec_Sel, AV98TFBarPart, AV99TFBarPart_To, AV12OrderedBy, AV13OrderedDsc, Gx_mode, AV100Carvitin, AV76Pwdgrl, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV104Pgmname = "MantenimientodeHDRs_WC" ;
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strup1DZ0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e191DZ2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV23ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV59DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV20ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_41 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_41"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV61GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV62GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV64Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV64Emprcod") ;
         wcpOAV65Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV65Clicod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV66Barfecgen = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV66Barfecgen"), 0) ;
         wcpOAV67BarFecGen_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV67BarFecGen_to"), 0) ;
         wcpOAV68Barsit = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV68Barsit"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV69BarSit_to = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV69BarSit_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV70BarEnccli = httpContext.cgiGet( sPrefix+"wcpOAV70BarEnccli") ;
         wcpOAV71BarDisnum = httpContext.cgiGet( sPrefix+"wcpOAV71BarDisnum") ;
         wcpOAV95Barcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV95Barcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV96BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV96BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV97BarCodPar = httpContext.cgiGet( sPrefix+"wcpOAV97BarCodPar") ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Ddo_managefilters_Icontype = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Icontype") ;
         Ddo_managefilters_Icon = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Icon") ;
         Ddo_managefilters_Tooltip = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Tooltip") ;
         Ddo_managefilters_Cls = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Cls") ;
         Dvpanel_tableheader_Width = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Width") ;
         Dvpanel_tableheader_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Autowidth")) ;
         Dvpanel_tableheader_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Autoheight")) ;
         Dvpanel_tableheader_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Cls") ;
         Dvpanel_tableheader_Title = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Title") ;
         Dvpanel_tableheader_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Collapsible")) ;
         Dvpanel_tableheader_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Collapsed")) ;
         Dvpanel_tableheader_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Showcollapseicon")) ;
         Dvpanel_tableheader_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Iconposition") ;
         Dvpanel_tableheader_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Autoscroll")) ;
         Gridpaginationbar_Class = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Class") ;
         Gridpaginationbar_Showfirst = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Showfirst")) ;
         Gridpaginationbar_Showprevious = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Showprevious")) ;
         Gridpaginationbar_Shownext = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Shownext")) ;
         Gridpaginationbar_Showlast = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Showlast")) ;
         Gridpaginationbar_Pagestoshow = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Pagestoshow"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridpaginationbar_Pagingbuttonsposition = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Pagingbuttonsposition") ;
         Gridpaginationbar_Pagingcaptionposition = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Pagingcaptionposition") ;
         Gridpaginationbar_Emptygridclass = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Emptygridclass") ;
         Gridpaginationbar_Rowsperpageselector = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselector")) ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridpaginationbar_Rowsperpageoptions = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageoptions") ;
         Gridpaginationbar_Previous = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Previous") ;
         Gridpaginationbar_Next = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Next") ;
         Gridpaginationbar_Caption = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Caption") ;
         Gridpaginationbar_Emptygridcaption = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Emptygridcaption") ;
         Gridpaginationbar_Rowsperpagecaption = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpagecaption") ;
         Ddo_grid_Caption = httpContext.cgiGet( sPrefix+"DDO_GRID_Caption") ;
         Ddo_grid_Filteredtext_set = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_set") ;
         Ddo_grid_Filteredtextto_set = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_set") ;
         Ddo_grid_Selectedvalue_set = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_set") ;
         Ddo_grid_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Includesortasc = httpContext.cgiGet( sPrefix+"DDO_GRID_Includesortasc") ;
         Ddo_grid_Fixable = httpContext.cgiGet( sPrefix+"DDO_GRID_Fixable") ;
         Ddo_grid_Sortedstatus = httpContext.cgiGet( sPrefix+"DDO_GRID_Sortedstatus") ;
         Ddo_grid_Includefilter = httpContext.cgiGet( sPrefix+"DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( sPrefix+"DDO_GRID_Filtertype") ;
         Ddo_grid_Filterisrange = httpContext.cgiGet( sPrefix+"DDO_GRID_Filterisrange") ;
         Ddo_grid_Includedatalist = httpContext.cgiGet( sPrefix+"DDO_GRID_Includedatalist") ;
         Ddo_grid_Datalisttype = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalisttype") ;
         Ddo_grid_Datalistfixedvalues = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalistfixedvalues") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalistproc") ;
         Ddo_gridcolumnsselector_Caption = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption") ;
         Ddo_gridcolumnsselector_Tooltip = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip") ;
         Ddo_gridcolumnsselector_Cls = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls") ;
         Ddo_gridcolumnsselector_Dropdownoptionstype = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype") ;
         Ddo_gridcolumnsselector_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname") ;
         Ddo_gridcolumnsselector_Titlecontrolidtoreplace = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace") ;
         Dvelop_confirmpanel_delete_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_DELETE_Title") ;
         Dvelop_confirmpanel_delete_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_DELETE_Confirmationtext") ;
         Dvelop_confirmpanel_delete_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_DELETE_Yesbuttoncaption") ;
         Dvelop_confirmpanel_delete_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_DELETE_Nobuttoncaption") ;
         Dvelop_confirmpanel_delete_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_DELETE_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_delete_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_DELETE_Yesbuttonposition") ;
         Dvelop_confirmpanel_delete_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_DELETE_Confirmtype") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Hascolumnsselector = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hascolumnsselector")) ;
         Grid_empowerer_Fixedcolumns = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Fixedcolumns") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_get") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedcolumn") ;
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         Ddo_managefilters_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Activeeventkey") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Dvelop_confirmpanel_delete_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_DELETE_Result") ;
         /* Read variables values. */
         AV15FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FilterFullText", AV15FilterFullText);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_barfecgenauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_BARFECGENAUXDATE");
            GX_FocusControl = edtavDdo_barfecgenauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV46DDO_BarFecGenAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46DDO_BarFecGenAuxDate", localUtil.format(AV46DDO_BarFecGenAuxDate, "99/99/99"));
         }
         else
         {
            AV46DDO_BarFecGenAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_barfecgenauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46DDO_BarFecGenAuxDate", localUtil.format(AV46DDO_BarFecGenAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_barfeccliauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_BARFECCLIAUXDATE");
            GX_FocusControl = edtavDdo_barfeccliauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV50DDO_BarFecCliAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50DDO_BarFecCliAuxDate", localUtil.format(AV50DDO_BarFecCliAuxDate, "99/99/99"));
         }
         else
         {
            AV50DDO_BarFecCliAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_barfeccliauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50DDO_BarFecCliAuxDate", localUtil.format(AV50DDO_BarFecCliAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_barfecsalauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_BARFECSALAUXDATE");
            GX_FocusControl = edtavDdo_barfecsalauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV54DDO_BarFecSalAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54DDO_BarFecSalAuxDate", localUtil.format(AV54DDO_BarFecSalAuxDate, "99/99/99"));
         }
         else
         {
            AV54DDO_BarFecSalAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_barfecsalauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54DDO_BarFecSalAuxDate", localUtil.format(AV54DDO_BarFecSalAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
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
      e191DZ2 ();
      if (returnInSub) return;
   }

   public void e191DZ2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV89Station ;
      GXv_char5[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char5) ;
      mantenimientodehdrs_wc_impl.this.GXt_char1 = GXv_char5[0] ;
      AV89Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89Station", AV89Station);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTATION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV89Station, ""))));
      GXv_char5[0] = AV64Emprcod ;
      GXv_char4[0] = AV93EmprNom ;
      GXv_char3[0] = AV88Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV89Station, GXv_char5, GXv_char4, GXv_char3) ;
      mantenimientodehdrs_wc_impl.this.AV64Emprcod = GXv_char5[0] ;
      mantenimientodehdrs_wc_impl.this.AV93EmprNom = GXv_char4[0] ;
      mantenimientodehdrs_wc_impl.this.AV88Usurcod = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64Emprcod", AV64Emprcod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88Usurcod", AV88Usurcod);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vUSURCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV88Usurcod, "@!"))));
      GXt_int6 = (byte)(AV72Enc20c) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV64Emprcod, httpContext.getMessage( "ENC20C", ""), GXv_int7) ;
      mantenimientodehdrs_wc_impl.this.GXt_int6 = GXv_int7[0] ;
      AV72Enc20c = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72Enc20c", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72Enc20c), 4, 0));
      GXt_int8 = AV75ContVal ;
      GXv_int9[0] = GXt_int8 ;
      new app.pbuscon(remoteHandle, context).execute( AV64Emprcod, httpContext.getMessage( "PWDGRL", ""), GXv_int9) ;
      mantenimientodehdrs_wc_impl.this.GXt_int8 = GXv_int9[0] ;
      AV75ContVal = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75ContVal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV75ContVal), 8, 0));
      GXt_int6 = (byte)(AV76Pwdgrl) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV64Emprcod, httpContext.getMessage( "PWDGRL", ""), GXv_int7) ;
      mantenimientodehdrs_wc_impl.this.GXt_int6 = GXv_int7[0] ;
      AV76Pwdgrl = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76Pwdgrl", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV76Pwdgrl), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPWDGRL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV76Pwdgrl), "ZZZ9")));
      GXt_int6 = (byte)(AV100Carvitin) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV64Emprcod, httpContext.getMessage( "CARVIT", ""), GXv_int7) ;
      mantenimientodehdrs_wc_impl.this.GXt_int6 = GXv_int7[0] ;
      AV100Carvitin = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV100Carvitin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV100Carvitin), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCARVITIN", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV100Carvitin), "ZZZ9")));
      AV77ActDatos = "N" ;
      AV82WebSession.setValue("ActDatos", "");
      GXt_char1 = AV89Station ;
      GXv_char5[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char5) ;
      mantenimientodehdrs_wc_impl.this.GXt_char1 = GXv_char5[0] ;
      AV89Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89Station", AV89Station);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTATION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV89Station, ""))));
      GXv_char5[0] = AV64Emprcod ;
      GXv_char4[0] = AV93EmprNom ;
      GXv_char3[0] = AV88Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV89Station, GXv_char5, GXv_char4, GXv_char3) ;
      mantenimientodehdrs_wc_impl.this.AV64Emprcod = GXv_char5[0] ;
      mantenimientodehdrs_wc_impl.this.AV93EmprNom = GXv_char4[0] ;
      mantenimientodehdrs_wc_impl.this.AV88Usurcod = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64Emprcod", AV64Emprcod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88Usurcod", AV88Usurcod);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vUSURCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV88Usurcod, "@!"))));
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      /* Execute user subroutine: 'LOADSAVEDFILTERS' */
      S112 ();
      if (returnInSub) return;
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( AV12OrderedBy < 1 )
      {
         AV12OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10 = AV59DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons11[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons11) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons11[0] ;
      AV59DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e201DZ2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext12[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext12) ;
      AV6WWPContext = GXv_SdtWWPContext12[0] ;
      if ( AV25ManageFiltersExecutionStep == 1 )
      {
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV25ManageFiltersExecutionStep == 2 )
      {
         AV25ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV22Session.getValue("MantenimientodeHDRs_WCColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV22Session.getValue("MantenimientodeHDRs_WCColumnsSelector") ;
         AV20ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtBarNHdr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarNHdr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNHdr_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtCliNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtPedidoClie_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPedidoClie_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedidoClie_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarSer_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarSer_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarSerDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarSerDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSerDsc_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarTipArtD_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarTipArtD_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipArtD_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarColNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarColNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNom_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarColNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarColNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNum_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarFecGen_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarFecGen_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecGen_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarFecCli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarFecCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecCli_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarFecSal_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarFecSal_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecSal_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarSit_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarSit_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSit_Visible), 5, 0), !bGXsfl_41_Refreshing);
      chkHayRec.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkHayRec.getInternalname(), "Visible", GXutil.ltrimstr( chkHayRec.getVisible(), 5, 0), !bGXsfl_41_Refreshing);
      edtBarPart_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarPart_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPart_Visible), 5, 0), !bGXsfl_41_Refreshing);
      AV61GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61GridCurrentPage), 10, 0));
      AV62GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62GridPageCount), 10, 0));
      AV77ActDatos = httpContext.getMessage( "N", "") ;
      if ( GXutil.strcmp(GXutil.upper( GXutil.trim( AV82WebSession.getValue("ActDatos"))), httpContext.getMessage( "S", "")) == 0 )
      {
         GXv_char5[0] = AV64Emprcod ;
         GXv_int9[0] = A129BarCod ;
         GXv_int7[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_int13[0] = A361DisCod ;
         new app.pbordis(remoteHandle, context).execute( GXv_char5, GXv_int9, GXv_int7, GXv_char4, GXv_int13) ;
         mantenimientodehdrs_wc_impl.this.AV64Emprcod = GXv_char5[0] ;
         mantenimientodehdrs_wc_impl.this.A129BarCod = GXv_int9[0] ;
         mantenimientodehdrs_wc_impl.this.A132BarCodReo = GXv_int7[0] ;
         mantenimientodehdrs_wc_impl.this.A130BarCodPar = GXv_char4[0] ;
         mantenimientodehdrs_wc_impl.this.A361DisCod = GXv_int13[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64Emprcod", AV64Emprcod);
         AV87Inc_obs = httpContext.getMessage( "->Eliminacion Hdr ", "") + A13696BarNHdr + GXutil.newLine( ) ;
         new app.pctrinc(remoteHandle, context).execute( AV64Emprcod, GXutil.substring( AV104Pgmname, 1, 10), AV88Usurcod, AV89Station, AV87Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
      }
      AV105Mantenimientodehdrs_wcds_1_filterfulltext = AV15FilterFullText ;
      AV106Mantenimientodehdrs_wcds_2_tfbarnhdr = AV26TFBarNHdr ;
      AV107Mantenimientodehdrs_wcds_3_tfbarnhdr_sel = AV27TFBarNHdr_Sel ;
      AV108Mantenimientodehdrs_wcds_4_tfclinom = AV28TFCliNom ;
      AV109Mantenimientodehdrs_wcds_5_tfclinom_sel = AV29TFCliNom_Sel ;
      AV110Mantenimientodehdrs_wcds_6_tfpedidocliente = AV73TFPedidoCliente ;
      AV111Mantenimientodehdrs_wcds_7_tfpedidocliente_sel = AV74TFPedidoCliente_Sel ;
      AV112Mantenimientodehdrs_wcds_8_tfbarser = AV32TFBarSer ;
      AV113Mantenimientodehdrs_wcds_9_tfbarser_sel = AV33TFBarSer_Sel ;
      AV114Mantenimientodehdrs_wcds_10_tfbarserdsc = AV34TFBarSerDsc ;
      AV115Mantenimientodehdrs_wcds_11_tfbarserdsc_sel = AV35TFBarSerDsc_Sel ;
      AV116Mantenimientodehdrs_wcds_12_tfbartipartdsc = AV36TFBarTipArtDsc ;
      AV117Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel = AV37TFBarTipArtDsc_Sel ;
      AV118Mantenimientodehdrs_wcds_14_tfbarcolnom = AV40TFBarColNom ;
      AV119Mantenimientodehdrs_wcds_15_tfbarcolnom_sel = AV41TFBarColNom_Sel ;
      AV120Mantenimientodehdrs_wcds_16_tfbarcolnum = AV42TFBarColNum ;
      AV121Mantenimientodehdrs_wcds_17_tfbarcolnum_to = AV43TFBarColNum_To ;
      AV122Mantenimientodehdrs_wcds_18_tfbarfecgen = AV44TFBarFecGen ;
      AV123Mantenimientodehdrs_wcds_19_tfbarfeccli = AV48TFBarFecCli ;
      AV124Mantenimientodehdrs_wcds_20_tfbarfecsal = AV52TFBarFecSal ;
      AV125Mantenimientodehdrs_wcds_21_tfbarsit = AV56TFBarSit ;
      AV126Mantenimientodehdrs_wcds_22_tfbarsit_to = AV57TFBarSit_To ;
      AV127Mantenimientodehdrs_wcds_23_tfhayrec_sel = AV58TFHayRec_Sel ;
      AV128Mantenimientodehdrs_wcds_24_tfbarpart = AV98TFBarPart ;
      AV129Mantenimientodehdrs_wcds_25_tfbarpart_to = AV99TFBarPart_To ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e121DZ2( )
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
         AV60PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV60PageToGo) ;
      }
   }

   public void e131DZ2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e141DZ2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV12OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         AV13OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedDsc", AV13OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarNHdr") == 0 )
         {
            AV26TFBarNHdr = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFBarNHdr", AV26TFBarNHdr);
            AV27TFBarNHdr_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFBarNHdr_Sel", AV27TFBarNHdr_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliNom") == 0 )
         {
            AV28TFCliNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFCliNom", AV28TFCliNom);
            AV29TFCliNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFCliNom_Sel", AV29TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PedidoCliente") == 0 )
         {
            AV73TFPedidoCliente = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73TFPedidoCliente", AV73TFPedidoCliente);
            AV74TFPedidoCliente_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74TFPedidoCliente_Sel", AV74TFPedidoCliente_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSer") == 0 )
         {
            AV32TFBarSer = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFBarSer", AV32TFBarSer);
            AV33TFBarSer_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFBarSer_Sel", AV33TFBarSer_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSerDsc") == 0 )
         {
            AV34TFBarSerDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFBarSerDsc", AV34TFBarSerDsc);
            AV35TFBarSerDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFBarSerDsc_Sel", AV35TFBarSerDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarTipArtDsc") == 0 )
         {
            AV36TFBarTipArtDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFBarTipArtDsc", AV36TFBarTipArtDsc);
            AV37TFBarTipArtDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFBarTipArtDsc_Sel", AV37TFBarTipArtDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarColNom") == 0 )
         {
            AV40TFBarColNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFBarColNom", AV40TFBarColNom);
            AV41TFBarColNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFBarColNom_Sel", AV41TFBarColNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarColNum") == 0 )
         {
            AV42TFBarColNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFBarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFBarColNum), 6, 0));
            AV43TFBarColNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFBarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43TFBarColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFecGen") == 0 )
         {
            AV44TFBarFecGen = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFBarFecGen", localUtil.format(AV44TFBarFecGen, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFecCli") == 0 )
         {
            AV48TFBarFecCli = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFBarFecCli", localUtil.format(AV48TFBarFecCli, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFecSal") == 0 )
         {
            AV52TFBarFecSal = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFBarFecSal", localUtil.format(AV52TFBarFecSal, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSit") == 0 )
         {
            AV56TFBarSit = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFBarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TFBarSit), 2, 0));
            AV57TFBarSit_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFBarSit_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57TFBarSit_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HayRec") == 0 )
         {
            AV58TFHayRec_Sel = (byte)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFHayRec_Sel", GXutil.str( AV58TFHayRec_Sel, 1, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarPart") == 0 )
         {
            AV98TFBarPart = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV98TFBarPart", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV98TFBarPart), 4, 0));
            AV99TFBarPart_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV99TFBarPart_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV99TFBarPart_To), 4, 0));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e211DZ2( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         cmbavGridactions.removeAllItems();
         cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
         cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_display", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
         if ( A213BarSit < 9 )
         {
            cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         }
         if ( ( A213BarSit == 1 ) || ( A213BarSit == 2 ) )
         {
            cmbavGridactions.addItem("3", GXutil.format( "%1;%2", httpContext.getMessage( "GX_BtnDelete", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
         }
         cmbavGridactions.addItem("4", GXutil.format( "%1;%2", httpContext.getMessage( "Piezas", ""), "fa fa-store", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("5", GXutil.format( "%1;%2", httpContext.getMessage( "Procesos", ""), "fas fa-industry", "", "", "", "", "", "", ""), (short)(0));
         GXt_int6 = (byte)(0) ;
         GXv_int7[0] = GXt_int6 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "STDNOR", ""), GXv_int7) ;
         mantenimientodehdrs_wc_impl.this.GXt_int6 = GXv_int7[0] ;
         AV94TempBoolean = (boolean)((GXt_int6==1)) ;
         if ( AV94TempBoolean )
         {
            cmbavGridactions.addItem("6", GXutil.format( "%1;%2", httpContext.getMessage( "Normas Estandares Textil", ""), "fa fa-shapes", "", "", "", "", "", "", ""), (short)(0));
         }
         GXt_int6 = (byte)(0) ;
         GXv_int7[0] = GXt_int6 ;
         new app.pexicon(remoteHandle, context).execute( AV64Emprcod, httpContext.getMessage( "CARVIT", ""), GXv_int7) ;
         mantenimientodehdrs_wc_impl.this.GXt_int6 = GXv_int7[0] ;
         AV94TempBoolean = (boolean)((GXt_int6==1)) ;
         if ( AV94TempBoolean )
         {
            cmbavGridactions.addItem("7", GXutil.format( "%1;%2", httpContext.getMessage( "Mantenimiento Partida", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         }
         cmbavGridactions.addItem("8", GXutil.format( "%1;%2", httpContext.getMessage( "Notas", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("9", GXutil.format( "%1;%2", httpContext.getMessage( "Observaciones", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("10", GXutil.format( "%1;%2", httpContext.getMessage( "Imprimir HDR", ""), "fa fa-file-pdf", "", "", "", "", "", "", ""), (short)(0));
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(41) ;
         }
         sendrow_412( ) ;
         GRID_nEOF = (byte)(1) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         if ( ( subGrid_Islastpage == 1 ) && ( ((int)((GRID_nCurrentRecord) % (subgrid_fnc_recordsperpage( )))) == 0 ) )
         {
            GRID_nFirstRecordOnPage = GRID_nCurrentRecord ;
         }
      }
      if ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) )
      {
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      }
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_41_Refreshing )
      {
         httpContext.doAjaxLoad(41, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV63GridActions, 4, 0)) );
   }

   public void e151DZ2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV18ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV20ColumnsSelector.fromJSonString(AV18ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "MantenimientodeHDRs_WCColumnsSelector", ((GXutil.strcmp("", AV18ColumnsSelectorXML)==0) ? "" : AV20ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e111DZ2( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S172 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S152 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("MantenimientodeHDRs_WCFilters")),GXutil.URLEncode(GXutil.rtrim(AV104Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("MantenimientodeHDRs_WCFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV24ManageFiltersXml ;
         GXv_char5[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "MantenimientodeHDRs_WCFilters", Ddo_managefilters_Activeeventkey, GXv_char5) ;
         mantenimientodehdrs_wc_impl.this.GXt_char1 = GXv_char5[0] ;
         AV24ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV24ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV104Pgmname+"GridState", AV24ManageFiltersXml) ;
            AV10GridState.fromxml(AV24ManageFiltersXml, null, null);
            AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
            AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedDsc", AV13OrderedDsc);
            /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
            S142 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S182 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefreshCmp(sPrefix);
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ManageFiltersData", AV23ManageFiltersData);
   }

   public void e221DZ2( )
   {
      /* Gridactions_Click Routine */
      returnInSub = false ;
      if ( AV63GridActions == 1 )
      {
         /* Execute user subroutine: 'DO DISPLAY' */
         S192 ();
         if (returnInSub) return;
      }
      else if ( AV63GridActions == 2 )
      {
         /* Execute user subroutine: 'DO UPDATE' */
         S202 ();
         if (returnInSub) return;
      }
      else if ( AV63GridActions == 3 )
      {
         /* Execute user subroutine: 'DO DELETE' */
         S212 ();
         if (returnInSub) return;
      }
      else if ( AV63GridActions == 4 )
      {
         /* Execute user subroutine: 'DO PIEZAS' */
         S222 ();
         if (returnInSub) return;
      }
      else if ( AV63GridActions == 5 )
      {
         /* Execute user subroutine: 'DO PROCESOS' */
         S232 ();
         if (returnInSub) return;
      }
      else if ( AV63GridActions == 6 )
      {
         /* Execute user subroutine: 'DO NORMAS' */
         S242 ();
         if (returnInSub) return;
      }
      else if ( AV63GridActions == 7 )
      {
         /* Execute user subroutine: 'DO MANTENIMIENTOPARTIDA' */
         S252 ();
         if (returnInSub) return;
      }
      else if ( AV63GridActions == 8 )
      {
         /* Execute user subroutine: 'DO NOTAS' */
         S262 ();
         if (returnInSub) return;
      }
      else if ( AV63GridActions == 9 )
      {
         /* Execute user subroutine: 'DO OBSERVACIONES' */
         S272 ();
         if (returnInSub) return;
      }
      else if ( AV63GridActions == 10 )
      {
         /* Execute user subroutine: 'DO IMPRIMIRHDR' */
         S282 ();
         if (returnInSub) return;
      }
      AV63GridActions = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63GridActions), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV63GridActions, 4, 0)) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e161DZ2( )
   {
      /* Dvelop_confirmpanel_delete_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_delete_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION DELETE' */
         S292 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e171DZ2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char5[0] = AV16ExcelFilename ;
      GXv_char4[0] = AV17ErrorMessage ;
      new app.mantenimientodehdrs_wcexport(remoteHandle, context).execute( GXv_char5, GXv_char4) ;
      mantenimientodehdrs_wc_impl.this.AV16ExcelFilename = GXv_char5[0] ;
      mantenimientodehdrs_wc_impl.this.AV17ErrorMessage = GXv_char4[0] ;
      if ( GXutil.strcmp(AV16ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV16ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV17ErrorMessage);
      }
   }

   public void e181DZ2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.mantenimientodehdrs_wcexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV12OrderedBy, 4, 0))+":"+(AV13OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV20ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector14[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarNHdr", "", "N° Hdr", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "CliNom", "", "Nombre Cliente", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "PedidoCliente", "", "Pedido Cliente", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarSer", "", "Serie", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarSerDsc", "", "Descripción Serie", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarTipArtDsc", "", "Descripcion Tipo Articulo", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarColNom", "", "Nombre Color", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarColNum", "", "Numero del Color", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarFecGen", "", "Fecha Generacion Barcada", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarFecCli", "", "Fecha Disposicion Cliente", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarFecSal", "", "Fecha Salida en Albaran", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarSit", "", "St", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "HayRec", "", "Receta?", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarPart", "", "Nº Partida", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXt_char1 = AV19UserCustomValue ;
      GXv_char5[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "MantenimientodeHDRs_WCColumnsSelector", GXv_char5) ;
      mantenimientodehdrs_wc_impl.this.GXt_char1 = GXv_char5[0] ;
      AV19UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV19UserCustomValue)==0) ) )
      {
         AV21ColumnsSelectorAux.fromxml(AV19UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector14[0] = AV21ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector15[0] = AV20ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, GXv_SdtWWPColumnsSelector15) ;
         AV21ColumnsSelectorAux = GXv_SdtWWPColumnsSelector14[0] ;
         AV20ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item16 = AV23ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item17[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item16 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "MantenimientodeHDRs_WCFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item17) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item16 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item17[0] ;
      AV23ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item16 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV15FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FilterFullText", AV15FilterFullText);
      AV26TFBarNHdr = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFBarNHdr", AV26TFBarNHdr);
      AV27TFBarNHdr_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFBarNHdr_Sel", AV27TFBarNHdr_Sel);
      AV28TFCliNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFCliNom", AV28TFCliNom);
      AV29TFCliNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFCliNom_Sel", AV29TFCliNom_Sel);
      AV73TFPedidoCliente = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73TFPedidoCliente", AV73TFPedidoCliente);
      AV74TFPedidoCliente_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74TFPedidoCliente_Sel", AV74TFPedidoCliente_Sel);
      AV32TFBarSer = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFBarSer", AV32TFBarSer);
      AV33TFBarSer_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFBarSer_Sel", AV33TFBarSer_Sel);
      AV34TFBarSerDsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFBarSerDsc", AV34TFBarSerDsc);
      AV35TFBarSerDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFBarSerDsc_Sel", AV35TFBarSerDsc_Sel);
      AV36TFBarTipArtDsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFBarTipArtDsc", AV36TFBarTipArtDsc);
      AV37TFBarTipArtDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFBarTipArtDsc_Sel", AV37TFBarTipArtDsc_Sel);
      AV40TFBarColNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFBarColNom", AV40TFBarColNom);
      AV41TFBarColNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFBarColNom_Sel", AV41TFBarColNom_Sel);
      AV42TFBarColNum = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFBarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFBarColNum), 6, 0));
      AV43TFBarColNum_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFBarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43TFBarColNum_To), 6, 0));
      AV44TFBarFecGen = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFBarFecGen", localUtil.format(AV44TFBarFecGen, "99/99/99"));
      AV48TFBarFecCli = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFBarFecCli", localUtil.format(AV48TFBarFecCli, "99/99/99"));
      AV52TFBarFecSal = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFBarFecSal", localUtil.format(AV52TFBarFecSal, "99/99/99"));
      AV56TFBarSit = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFBarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TFBarSit), 2, 0));
      AV57TFBarSit_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFBarSit_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57TFBarSit_To), 2, 0));
      AV58TFHayRec_Sel = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFHayRec_Sel", GXutil.str( AV58TFHayRec_Sel, 1, 0));
      AV98TFBarPart = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV98TFBarPart", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV98TFBarPart), 4, 0));
      AV99TFBarPart_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV99TFBarPart_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV99TFBarPart_To), 4, 0));
      Ddo_grid_Selectedvalue_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      Ddo_grid_Filteredtext_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S192( )
   {
      /* 'DO DISPLAY' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.ttrn04", new String[] {GXutil.URLEncode(GXutil.rtrim("DSP")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar))}, new String[] {"Mode","EmprCod","BarCod","BarCodReo","BarCodPar"}) , new Object[] {});
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S202( )
   {
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
      AV101Window.setAutoresize( 0 );
      AV101Window.setWidth( 1500 );
      AV101Window.setHeight( 900 );
      /* Window Datatype Object Property */
      AV101Window.setUrl( formatLink("app.ttrn04", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar))}, new String[] {"Mode","EmprCod","BarCod","BarCodReo","BarCodPar"})  );
      AV101Window.setReturnParms(new Object[] {});
      httpContext.newWindow(AV101Window);
      if ( 1 == 0 )
      {
         httpContext.popup(formatLink("app.ttrn04", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar))}, new String[] {"Mode","EmprCod","BarCod","BarCodReo","BarCodPar"}) , new Object[] {});
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
   }

   public void S212( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
      Dvelop_confirmpanel_delete_Confirmationtext = httpContext.getMessage( "¿Desea eliminar la HDR Nº ", "")+A13696BarNHdr+"?" ;
      ucDvelop_confirmpanel_delete.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_delete_Internalname, "ConfirmationText", Dvelop_confirmpanel_delete_Confirmationtext);
      AV78EmprCod_Selected = A396EmprCod ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78EmprCod_Selected", AV78EmprCod_Selected);
      AV79BarCod_Selected = A129BarCod ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV79BarCod_Selected", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79BarCod_Selected), 8, 0));
      AV80BarCodReo_Selected = A132BarCodReo ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80BarCodReo_Selected", GXutil.str( AV80BarCodReo_Selected, 1, 0));
      AV81BarCodPar_Selected = A130BarCodPar ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81BarCodPar_Selected", AV81BarCodPar_Selected);
      this.executeUsercontrolMethod(sPrefix, false, "DVELOP_CONFIRMPANEL_DELETEContainer", "Confirm", "", new Object[] {});
   }

   public void S292( )
   {
      /* 'DO ACTION DELETE' Routine */
      returnInSub = false ;
      AV91Flag = (byte)(0) ;
      GXv_char5[0] = AV64Emprcod ;
      GXv_int13[0] = A129BarCod ;
      GXv_int7[0] = A132BarCodReo ;
      GXv_char4[0] = A130BarCodPar ;
      GXv_int18[0] = (byte)(AV90Lhipro) ;
      new app.plhipct(remoteHandle, context).execute( GXv_char5, GXv_int13, GXv_int7, GXv_char4, GXv_int18) ;
      mantenimientodehdrs_wc_impl.this.AV64Emprcod = GXv_char5[0] ;
      mantenimientodehdrs_wc_impl.this.A129BarCod = GXv_int13[0] ;
      mantenimientodehdrs_wc_impl.this.A132BarCodReo = GXv_int7[0] ;
      mantenimientodehdrs_wc_impl.this.A130BarCodPar = GXv_char4[0] ;
      mantenimientodehdrs_wc_impl.this.AV90Lhipro = GXv_int18[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64Emprcod", AV64Emprcod);
      if ( AV90Lhipro == 1 )
      {
         /* Using cursor H01DZ4 */
         pr_default.execute(2);
         while ( (pr_default.getStatus(2) != 101) )
         {
            A396EmprCod = H01DZ4_A396EmprCod[0] ;
            A153BarFasEst = H01DZ4_A153BarFasEst[0] ;
            A194BarOrdLin = H01DZ4_A194BarOrdLin[0] ;
            A758ProCod = H01DZ4_A758ProCod[0] ;
            if ( A153BarFasEst >= 1 )
            {
               AV91Flag = (byte)(1) ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            pr_default.readNext(2);
         }
         pr_default.close(2);
      }
      if ( AV91Flag == 1 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atención. Hoja de Ruta iniciada en Producción. No se permite su eliminación", ""));
      }
      else
      {
         if ( (0==AV76Pwdgrl) )
         {
            AV82WebSession.setValue("ActDatos", "S");
            httpContext.doAjaxRefreshCmp(sPrefix);
         }
         else
         {
            AV82WebSession.setValue("ActDatos", "");
            httpContext.popup(formatLink("app.confirmacionpassword", new String[] {GXutil.URLEncode(GXutil.ltrimstr(AV75ContVal,8,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"Contval","PwdBo"}) , new Object[] {"AV75ContVal","AV92PwdBo"});
            httpContext.doAjaxRefreshCmp(sPrefix);
         }
      }
      if ( 1 == 0 )
      {
         callWebObject(formatLink("app.ttrn04", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(AV78EmprCod_Selected)),GXutil.URLEncode(GXutil.ltrimstr(AV79BarCod_Selected,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV80BarCodReo_Selected,1,0)),GXutil.URLEncode(GXutil.rtrim(AV81BarCodPar_Selected))}, new String[] {"Mode","EmprCod","BarCod","BarCodReo","BarCodPar"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void S222( )
   {
      /* 'DO PIEZAS' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.tbarpin", new String[] {GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "UPD", ""))),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar))}, new String[] {"Mode","EmprCod","BarCod","BarCodReo","BarCodPar"}) , new Object[] {});
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S232( )
   {
      /* 'DO PROCESOS' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.webwbarprotabla", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A3594BarPriTin,2,0)),GXutil.URLEncode(GXutil.ltrimstr(A2265BarExt,1,0))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","Discod","BarSit","Barext"}) , new Object[] {"A396EmprCod","A129BarCod","A132BarCodReo","A130BarCodPar","A361DisCod","A3594BarPriTin","A2265BarExt"});
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S242( )
   {
      /* 'DO NORMAS' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.tdisnor", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0))}, new String[] {"Mode","EmprCod","DisCod"}) , new Object[] {});
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S252( )
   {
      /* 'DO MANTENIMIENTOPARTIDA' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.mantenimientodelapartida", new String[] {GXutil.URLEncode(GXutil.rtrim(AV64Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A13878PedidoClie))}, new String[] {"EmprCod","Clicod","BarEnccli"}) , new Object[] {"AV64Emprcod","A252CliCod","A13878PedidoClie"});
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S262( )
   {
      /* 'DO NOTAS' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.tnotashdrs", new String[] {GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "UPD", ""))),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar))}, new String[] {"Mode","EmprCod","BarCod","BarCodReo","BarCodPar","DisCod","CliCod","BarSer","PedidoCliente","BarColNom","BarColNum","BarPie","BarKgm","BarMtr","CliNom","BarSerDsc"}) , new Object[] {});
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S272( )
   {
      /* 'DO OBSERVACIONES' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.tdisobs", new String[] {GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "UPD", ""))),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0))}, new String[] {"Mode","EmprCod","DisCod"}) , new Object[] {});
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S282( )
   {
      /* 'DO IMPRIMIRHDR' Routine */
      returnInSub = false ;
      if ( AV100Carvitin == 1 )
      {
         httpContext.popup(formatLink("app.pcarordemservico", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "PRN", "")))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","ImpCod","Output"}) , new Object[] {"A396EmprCod","A129BarCod","A132BarCodReo","A130BarCodPar","",""});
      }
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV22Session.getValue(AV104Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV104Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV22Session.getValue(AV104Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S182 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S182( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV132GXV1 = 1 ;
      while ( AV132GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV132GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV15FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FilterFullText", AV15FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV26TFBarNHdr = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFBarNHdr", AV26TFBarNHdr);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV27TFBarNHdr_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFBarNHdr_Sel", AV27TFBarNHdr_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV28TFCliNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFCliNom", AV28TFCliNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV29TFCliNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFCliNom_Sel", AV29TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDIDOCLIENTE") == 0 )
         {
            AV73TFPedidoCliente = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73TFPedidoCliente", AV73TFPedidoCliente);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDIDOCLIENTE_SEL") == 0 )
         {
            AV74TFPedidoCliente_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74TFPedidoCliente_Sel", AV74TFPedidoCliente_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV32TFBarSer = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFBarSer", AV32TFBarSer);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV33TFBarSer_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFBarSer_Sel", AV33TFBarSer_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV34TFBarSerDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFBarSerDsc", AV34TFBarSerDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV35TFBarSerDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFBarSerDsc_Sel", AV35TFBarSerDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPARTDSC") == 0 )
         {
            AV36TFBarTipArtDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFBarTipArtDsc", AV36TFBarTipArtDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPARTDSC_SEL") == 0 )
         {
            AV37TFBarTipArtDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFBarTipArtDsc_Sel", AV37TFBarTipArtDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV40TFBarColNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFBarColNom", AV40TFBarColNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV41TFBarColNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFBarColNom_Sel", AV41TFBarColNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV42TFBarColNum = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFBarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFBarColNum), 6, 0));
            AV43TFBarColNum_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFBarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43TFBarColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECGEN") == 0 )
         {
            AV44TFBarFecGen = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFBarFecGen", localUtil.format(AV44TFBarFecGen, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECCLI") == 0 )
         {
            AV48TFBarFecCli = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFBarFecCli", localUtil.format(AV48TFBarFecCli, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECSAL") == 0 )
         {
            AV52TFBarFecSal = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFBarFecSal", localUtil.format(AV52TFBarFecSal, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSIT") == 0 )
         {
            AV56TFBarSit = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFBarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TFBarSit), 2, 0));
            AV57TFBarSit_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFBarSit_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57TFBarSit_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHAYREC_SEL") == 0 )
         {
            AV58TFHayRec_Sel = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFHayRec_Sel", GXutil.str( AV58TFHayRec_Sel, 1, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPART") == 0 )
         {
            AV98TFBarPart = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV98TFBarPart", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV98TFBarPart), 4, 0));
            AV99TFBarPart_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV99TFBarPart_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV99TFBarPart_To), 4, 0));
         }
         AV132GXV1 = (int)(AV132GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char5[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV27TFBarNHdr_Sel)==0), AV27TFBarNHdr_Sel, GXv_char5) ;
      mantenimientodehdrs_wc_impl.this.GXt_char1 = GXv_char5[0] ;
      GXt_char19 = "" ;
      GXv_char4[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV29TFCliNom_Sel)==0), AV29TFCliNom_Sel, GXv_char4) ;
      mantenimientodehdrs_wc_impl.this.GXt_char19 = GXv_char4[0] ;
      GXt_char20 = "" ;
      GXv_char3[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV74TFPedidoCliente_Sel)==0), AV74TFPedidoCliente_Sel, GXv_char3) ;
      mantenimientodehdrs_wc_impl.this.GXt_char20 = GXv_char3[0] ;
      GXt_char21 = "" ;
      GXv_char2[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV33TFBarSer_Sel)==0), AV33TFBarSer_Sel, GXv_char2) ;
      mantenimientodehdrs_wc_impl.this.GXt_char21 = GXv_char2[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV35TFBarSerDsc_Sel)==0), AV35TFBarSerDsc_Sel, GXv_char23) ;
      mantenimientodehdrs_wc_impl.this.GXt_char22 = GXv_char23[0] ;
      GXt_char24 = "" ;
      GXv_char25[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV37TFBarTipArtDsc_Sel)==0), AV37TFBarTipArtDsc_Sel, GXv_char25) ;
      mantenimientodehdrs_wc_impl.this.GXt_char24 = GXv_char25[0] ;
      GXt_char26 = "" ;
      GXv_char27[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV41TFBarColNom_Sel)==0), AV41TFBarColNom_Sel, GXv_char27) ;
      mantenimientodehdrs_wc_impl.this.GXt_char26 = GXv_char27[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"|"+GXt_char19+"|"+GXt_char20+"|"+GXt_char21+"|"+GXt_char22+"|"+GXt_char24+"|"+GXt_char26+"||||||"+((0==AV58TFHayRec_Sel) ? "" : GXutil.str( AV58TFHayRec_Sel, 1, 0))+"|" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char26 = "" ;
      GXv_char27[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV26TFBarNHdr)==0), AV26TFBarNHdr, GXv_char27) ;
      mantenimientodehdrs_wc_impl.this.GXt_char26 = GXv_char27[0] ;
      GXt_char24 = "" ;
      GXv_char25[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV28TFCliNom)==0), AV28TFCliNom, GXv_char25) ;
      mantenimientodehdrs_wc_impl.this.GXt_char24 = GXv_char25[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV73TFPedidoCliente)==0), AV73TFPedidoCliente, GXv_char23) ;
      mantenimientodehdrs_wc_impl.this.GXt_char22 = GXv_char23[0] ;
      GXt_char21 = "" ;
      GXv_char5[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV32TFBarSer)==0), AV32TFBarSer, GXv_char5) ;
      mantenimientodehdrs_wc_impl.this.GXt_char21 = GXv_char5[0] ;
      GXt_char20 = "" ;
      GXv_char4[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV34TFBarSerDsc)==0), AV34TFBarSerDsc, GXv_char4) ;
      mantenimientodehdrs_wc_impl.this.GXt_char20 = GXv_char4[0] ;
      GXt_char19 = "" ;
      GXv_char3[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV36TFBarTipArtDsc)==0), AV36TFBarTipArtDsc, GXv_char3) ;
      mantenimientodehdrs_wc_impl.this.GXt_char19 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV40TFBarColNom)==0), AV40TFBarColNom, GXv_char2) ;
      mantenimientodehdrs_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = GXt_char26+"|"+GXt_char24+"|"+GXt_char22+"|"+GXt_char21+"|"+GXt_char20+"|"+GXt_char19+"|"+GXt_char1+"|"+((0==AV42TFBarColNum) ? "" : GXutil.str( AV42TFBarColNum, 6, 0))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV44TFBarFecGen)) ? "" : localUtil.dtoc( AV44TFBarFecGen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV48TFBarFecCli)) ? "" : localUtil.dtoc( AV48TFBarFecCli, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV52TFBarFecSal)) ? "" : localUtil.dtoc( AV52TFBarFecSal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+((0==AV56TFBarSit) ? "" : GXutil.str( AV56TFBarSit, 2, 0))+"||"+((0==AV98TFBarPart) ? "" : GXutil.str( AV98TFBarPart, 4, 0)) ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "|||||||"+((0==AV43TFBarColNum_To) ? "" : GXutil.str( AV43TFBarColNum_To, 6, 0))+"||||"+((0==AV57TFBarSit_To) ? "" : GXutil.str( AV57TFBarSit_To, 2, 0))+"||"+((0==AV99TFBarPart_To) ? "" : GXutil.str( AV99TFBarPart_To, 4, 0)) ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV22Session.getValue(AV104Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV15FilterFullText)==0), (short)(0), AV15FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFBARNHDR", "", !(GXutil.strcmp("", AV26TFBarNHdr)==0), (short)(0), AV26TFBarNHdr, "", !(GXutil.strcmp("", AV27TFBarNHdr_Sel)==0), AV27TFBarNHdr_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFCLINOM", "", !(GXutil.strcmp("", AV28TFCliNom)==0), (short)(0), AV28TFCliNom, "", !(GXutil.strcmp("", AV29TFCliNom_Sel)==0), AV29TFCliNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFPEDIDOCLIENTE", "", !(GXutil.strcmp("", AV73TFPedidoCliente)==0), (short)(0), AV73TFPedidoCliente, "", !(GXutil.strcmp("", AV74TFPedidoCliente_Sel)==0), AV74TFPedidoCliente_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFBARSER", "", !(GXutil.strcmp("", AV32TFBarSer)==0), (short)(0), AV32TFBarSer, "", !(GXutil.strcmp("", AV33TFBarSer_Sel)==0), AV33TFBarSer_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFBARSERDSC", "", !(GXutil.strcmp("", AV34TFBarSerDsc)==0), (short)(0), AV34TFBarSerDsc, "", !(GXutil.strcmp("", AV35TFBarSerDsc_Sel)==0), AV35TFBarSerDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFBARTIPARTDSC", "", !(GXutil.strcmp("", AV36TFBarTipArtDsc)==0), (short)(0), AV36TFBarTipArtDsc, "", !(GXutil.strcmp("", AV37TFBarTipArtDsc_Sel)==0), AV37TFBarTipArtDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFBARCOLNOM", "", !(GXutil.strcmp("", AV40TFBarColNom)==0), (short)(0), AV40TFBarColNom, "", !(GXutil.strcmp("", AV41TFBarColNom_Sel)==0), AV41TFBarColNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFBARCOLNUM", "", !((0==AV42TFBarColNum)&&(0==AV43TFBarColNum_To)), (short)(0), GXutil.trim( GXutil.str( AV42TFBarColNum, 6, 0)), GXutil.trim( GXutil.str( AV43TFBarColNum_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFBARFECGEN", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV44TFBarFecGen)), (short)(0), GXutil.trim( localUtil.dtoc( AV44TFBarFecGen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFBARFECCLI", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV48TFBarFecCli)), (short)(0), GXutil.trim( localUtil.dtoc( AV48TFBarFecCli, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFBARFECSAL", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV52TFBarFecSal)), (short)(0), GXutil.trim( localUtil.dtoc( AV52TFBarFecSal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFBARSIT", "", !((0==AV56TFBarSit)&&(0==AV57TFBarSit_To)), (short)(0), GXutil.trim( GXutil.str( AV56TFBarSit, 2, 0)), GXutil.trim( GXutil.str( AV57TFBarSit_To, 2, 0))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFHAYREC_SEL", "", !(0==AV58TFHayRec_Sel), (short)(0), GXutil.trim( GXutil.str( AV58TFHayRec_Sel, 1, 0)), "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFBARPART", "", !((0==AV98TFBarPart)&&(0==AV99TFBarPart_To)), (short)(0), GXutil.trim( GXutil.str( AV98TFBarPart, 4, 0)), GXutil.trim( GXutil.str( AV99TFBarPart_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      if ( ! (GXutil.strcmp("", AV64Emprcod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV64Emprcod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV65Clicod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV65Clicod, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV66Barfecgen)) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARFECGEN" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV66Barfecgen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV67BarFecGen_to)) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARFECGEN_TO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV67BarFecGen_to, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV68Barsit) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARSIT" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV68Barsit, 2, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV69BarSit_to) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARSIT_TO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV69BarSit_to, 2, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV70BarEnccli)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARENCCLI" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV70BarEnccli );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV71BarDisnum)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARDISNUM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV71BarDisnum );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV95Barcod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV95Barcod, 8, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV96BarCodReo) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODREO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV96BarCodReo, 1, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV97BarCodPar)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODPAR" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV97BarCodPar );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV104Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV104Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TTrn04" );
      AV22Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table2_74_1DZ2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_delete_Internalname, tblTabledvelop_confirmpanel_delete_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_delete.setProperty("Title", Dvelop_confirmpanel_delete_Title);
         ucDvelop_confirmpanel_delete.setProperty("ConfirmationText", Dvelop_confirmpanel_delete_Confirmationtext);
         ucDvelop_confirmpanel_delete.setProperty("YesButtonCaption", Dvelop_confirmpanel_delete_Yesbuttoncaption);
         ucDvelop_confirmpanel_delete.setProperty("NoButtonCaption", Dvelop_confirmpanel_delete_Nobuttoncaption);
         ucDvelop_confirmpanel_delete.setProperty("CancelButtonCaption", Dvelop_confirmpanel_delete_Cancelbuttoncaption);
         ucDvelop_confirmpanel_delete.setProperty("YesButtonPosition", Dvelop_confirmpanel_delete_Yesbuttonposition);
         ucDvelop_confirmpanel_delete.setProperty("ConfirmType", Dvelop_confirmpanel_delete_Confirmtype);
         ucDvelop_confirmpanel_delete.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_delete_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_DELETEContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_DELETEContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_74_1DZ2e( true) ;
      }
      else
      {
         wb_table2_74_1DZ2e( false) ;
      }
   }

   public void wb_table1_23_1DZ2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablerightheader_Internalname, tblTablerightheader_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* User Defined Control */
         ucDdo_managefilters.setProperty("IconType", Ddo_managefilters_Icontype);
         ucDdo_managefilters.setProperty("Icon", Ddo_managefilters_Icon);
         ucDdo_managefilters.setProperty("Caption", Ddo_managefilters_Caption);
         ucDdo_managefilters.setProperty("Tooltip", Ddo_managefilters_Tooltip);
         ucDdo_managefilters.setProperty("Cls", Ddo_managefilters_Cls);
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV23ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table3_28_1DZ2( true) ;
      }
      else
      {
         wb_table3_28_1DZ2( false) ;
      }
      return  ;
   }

   public void wb_table3_28_1DZ2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_23_1DZ2e( true) ;
      }
      else
      {
         wb_table1_23_1DZ2e( false) ;
      }
   }

   public void wb_table3_28_1DZ2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablefilters_Internalname, tblTablefilters_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFilterfulltext_Internalname, httpContext.getMessage( "Filter Full Text", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'" + sPrefix + "',false,'" + sGXsfl_41_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV15FilterFullText, GXutil.rtrim( localUtil.format( AV15FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_MantenimientodeHDRs_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_28_1DZ2e( true) ;
      }
      else
      {
         wb_table3_28_1DZ2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV64Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64Emprcod", AV64Emprcod);
      AV65Clicod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65Clicod), 6, 0));
      AV66Barfecgen = (java.util.Date)getParm(obj,2,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66Barfecgen", localUtil.format(AV66Barfecgen, "99/99/99"));
      AV67BarFecGen_to = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67BarFecGen_to", localUtil.format(AV67BarFecGen_to, "99/99/99"));
      AV68Barsit = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68Barsit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68Barsit), 2, 0));
      AV69BarSit_to = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69BarSit_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69BarSit_to), 2, 0));
      AV70BarEnccli = (String)getParm(obj,6,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70BarEnccli", AV70BarEnccli);
      AV71BarDisnum = (String)getParm(obj,7,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71BarDisnum", AV71BarDisnum);
      AV95Barcod = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV95Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV95Barcod), 8, 0));
      AV96BarCodReo = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV96BarCodReo", GXutil.str( AV96BarCodReo, 1, 0));
      AV97BarCodPar = (String)getParm(obj,10,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV97BarCodPar", AV97BarCodPar);
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
      pa1DZ2( ) ;
      ws1DZ2( ) ;
      we1DZ2( ) ;
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
      sCtrlAV64Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV65Clicod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV66Barfecgen = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV67BarFecGen_to = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV68Barsit = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV69BarSit_to = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV70BarEnccli = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV71BarDisnum = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV95Barcod = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV96BarCodReo = (String)getParm(obj,9,TypeConstants.STRING) ;
      sCtrlAV97BarCodPar = (String)getParm(obj,10,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1DZ2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "mantenimientodehdrs_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1DZ2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV64Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64Emprcod", AV64Emprcod);
         AV65Clicod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65Clicod), 6, 0));
         AV66Barfecgen = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66Barfecgen", localUtil.format(AV66Barfecgen, "99/99/99"));
         AV67BarFecGen_to = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67BarFecGen_to", localUtil.format(AV67BarFecGen_to, "99/99/99"));
         AV68Barsit = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68Barsit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68Barsit), 2, 0));
         AV69BarSit_to = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69BarSit_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69BarSit_to), 2, 0));
         AV70BarEnccli = (String)getParm(obj,8,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70BarEnccli", AV70BarEnccli);
         AV71BarDisnum = (String)getParm(obj,9,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71BarDisnum", AV71BarDisnum);
         AV95Barcod = ((Number) GXutil.testNumericType( getParm(obj,10,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV95Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV95Barcod), 8, 0));
         AV96BarCodReo = ((Number) GXutil.testNumericType( getParm(obj,11,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV96BarCodReo", GXutil.str( AV96BarCodReo, 1, 0));
         AV97BarCodPar = (String)getParm(obj,12,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV97BarCodPar", AV97BarCodPar);
      }
      wcpOAV64Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV64Emprcod") ;
      wcpOAV65Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV65Clicod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV66Barfecgen = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV66Barfecgen"), 0) ;
      wcpOAV67BarFecGen_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV67BarFecGen_to"), 0) ;
      wcpOAV68Barsit = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV68Barsit"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV69BarSit_to = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV69BarSit_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV70BarEnccli = httpContext.cgiGet( sPrefix+"wcpOAV70BarEnccli") ;
      wcpOAV71BarDisnum = httpContext.cgiGet( sPrefix+"wcpOAV71BarDisnum") ;
      wcpOAV95Barcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV95Barcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV96BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV96BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV97BarCodPar = httpContext.cgiGet( sPrefix+"wcpOAV97BarCodPar") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV64Emprcod, wcpOAV64Emprcod) != 0 ) || ( AV65Clicod != wcpOAV65Clicod ) || !( GXutil.dateCompare(GXutil.resetTime(AV66Barfecgen), GXutil.resetTime(wcpOAV66Barfecgen)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV67BarFecGen_to), GXutil.resetTime(wcpOAV67BarFecGen_to)) ) || ( AV68Barsit != wcpOAV68Barsit ) || ( AV69BarSit_to != wcpOAV69BarSit_to ) || ( GXutil.strcmp(AV70BarEnccli, wcpOAV70BarEnccli) != 0 ) || ( GXutil.strcmp(AV71BarDisnum, wcpOAV71BarDisnum) != 0 ) || ( AV95Barcod != wcpOAV95Barcod ) || ( AV96BarCodReo != wcpOAV96BarCodReo ) || ( GXutil.strcmp(AV97BarCodPar, wcpOAV97BarCodPar) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV64Emprcod = AV64Emprcod ;
      wcpOAV65Clicod = AV65Clicod ;
      wcpOAV66Barfecgen = AV66Barfecgen ;
      wcpOAV67BarFecGen_to = AV67BarFecGen_to ;
      wcpOAV68Barsit = AV68Barsit ;
      wcpOAV69BarSit_to = AV69BarSit_to ;
      wcpOAV70BarEnccli = AV70BarEnccli ;
      wcpOAV71BarDisnum = AV71BarDisnum ;
      wcpOAV95Barcod = AV95Barcod ;
      wcpOAV96BarCodReo = AV96BarCodReo ;
      wcpOAV97BarCodPar = AV97BarCodPar ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV64Emprcod = httpContext.cgiGet( sPrefix+"AV64Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV64Emprcod) > 0 )
      {
         AV64Emprcod = httpContext.cgiGet( sCtrlAV64Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64Emprcod", AV64Emprcod);
      }
      else
      {
         AV64Emprcod = httpContext.cgiGet( sPrefix+"AV64Emprcod_PARM") ;
      }
      sCtrlAV65Clicod = httpContext.cgiGet( sPrefix+"AV65Clicod_CTRL") ;
      if ( GXutil.len( sCtrlAV65Clicod) > 0 )
      {
         AV65Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV65Clicod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65Clicod), 6, 0));
      }
      else
      {
         AV65Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV65Clicod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV66Barfecgen = httpContext.cgiGet( sPrefix+"AV66Barfecgen_CTRL") ;
      if ( GXutil.len( sCtrlAV66Barfecgen) > 0 )
      {
         AV66Barfecgen = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV66Barfecgen), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66Barfecgen", localUtil.format(AV66Barfecgen, "99/99/99"));
      }
      else
      {
         AV66Barfecgen = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV66Barfecgen_PARM"), 0) ;
      }
      sCtrlAV67BarFecGen_to = httpContext.cgiGet( sPrefix+"AV67BarFecGen_to_CTRL") ;
      if ( GXutil.len( sCtrlAV67BarFecGen_to) > 0 )
      {
         AV67BarFecGen_to = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV67BarFecGen_to), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67BarFecGen_to", localUtil.format(AV67BarFecGen_to, "99/99/99"));
      }
      else
      {
         AV67BarFecGen_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV67BarFecGen_to_PARM"), 0) ;
      }
      sCtrlAV68Barsit = httpContext.cgiGet( sPrefix+"AV68Barsit_CTRL") ;
      if ( GXutil.len( sCtrlAV68Barsit) > 0 )
      {
         AV68Barsit = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV68Barsit), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68Barsit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68Barsit), 2, 0));
      }
      else
      {
         AV68Barsit = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV68Barsit_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV69BarSit_to = httpContext.cgiGet( sPrefix+"AV69BarSit_to_CTRL") ;
      if ( GXutil.len( sCtrlAV69BarSit_to) > 0 )
      {
         AV69BarSit_to = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV69BarSit_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69BarSit_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69BarSit_to), 2, 0));
      }
      else
      {
         AV69BarSit_to = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV69BarSit_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV70BarEnccli = httpContext.cgiGet( sPrefix+"AV70BarEnccli_CTRL") ;
      if ( GXutil.len( sCtrlAV70BarEnccli) > 0 )
      {
         AV70BarEnccli = httpContext.cgiGet( sCtrlAV70BarEnccli) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70BarEnccli", AV70BarEnccli);
      }
      else
      {
         AV70BarEnccli = httpContext.cgiGet( sPrefix+"AV70BarEnccli_PARM") ;
      }
      sCtrlAV71BarDisnum = httpContext.cgiGet( sPrefix+"AV71BarDisnum_CTRL") ;
      if ( GXutil.len( sCtrlAV71BarDisnum) > 0 )
      {
         AV71BarDisnum = httpContext.cgiGet( sCtrlAV71BarDisnum) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71BarDisnum", AV71BarDisnum);
      }
      else
      {
         AV71BarDisnum = httpContext.cgiGet( sPrefix+"AV71BarDisnum_PARM") ;
      }
      sCtrlAV95Barcod = httpContext.cgiGet( sPrefix+"AV95Barcod_CTRL") ;
      if ( GXutil.len( sCtrlAV95Barcod) > 0 )
      {
         AV95Barcod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV95Barcod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV95Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV95Barcod), 8, 0));
      }
      else
      {
         AV95Barcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV95Barcod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV96BarCodReo = httpContext.cgiGet( sPrefix+"AV96BarCodReo_CTRL") ;
      if ( GXutil.len( sCtrlAV96BarCodReo) > 0 )
      {
         AV96BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV96BarCodReo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV96BarCodReo", GXutil.str( AV96BarCodReo, 1, 0));
      }
      else
      {
         AV96BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV96BarCodReo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV97BarCodPar = httpContext.cgiGet( sPrefix+"AV97BarCodPar_CTRL") ;
      if ( GXutil.len( sCtrlAV97BarCodPar) > 0 )
      {
         AV97BarCodPar = httpContext.cgiGet( sCtrlAV97BarCodPar) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV97BarCodPar", AV97BarCodPar);
      }
      else
      {
         AV97BarCodPar = httpContext.cgiGet( sPrefix+"AV97BarCodPar_PARM") ;
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
      pa1DZ2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1DZ2( ) ;
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
      ws1DZ2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV64Emprcod_PARM", GXutil.rtrim( AV64Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV64Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV64Emprcod_CTRL", GXutil.rtrim( sCtrlAV64Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV65Clicod_PARM", GXutil.ltrim( localUtil.ntoc( AV65Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV65Clicod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV65Clicod_CTRL", GXutil.rtrim( sCtrlAV65Clicod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV66Barfecgen_PARM", localUtil.dtoc( AV66Barfecgen, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV66Barfecgen)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV66Barfecgen_CTRL", GXutil.rtrim( sCtrlAV66Barfecgen));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV67BarFecGen_to_PARM", localUtil.dtoc( AV67BarFecGen_to, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV67BarFecGen_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV67BarFecGen_to_CTRL", GXutil.rtrim( sCtrlAV67BarFecGen_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV68Barsit_PARM", GXutil.ltrim( localUtil.ntoc( AV68Barsit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV68Barsit)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV68Barsit_CTRL", GXutil.rtrim( sCtrlAV68Barsit));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV69BarSit_to_PARM", GXutil.ltrim( localUtil.ntoc( AV69BarSit_to, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV69BarSit_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV69BarSit_to_CTRL", GXutil.rtrim( sCtrlAV69BarSit_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV70BarEnccli_PARM", GXutil.rtrim( AV70BarEnccli));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV70BarEnccli)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV70BarEnccli_CTRL", GXutil.rtrim( sCtrlAV70BarEnccli));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV71BarDisnum_PARM", GXutil.rtrim( AV71BarDisnum));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV71BarDisnum)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV71BarDisnum_CTRL", GXutil.rtrim( sCtrlAV71BarDisnum));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV95Barcod_PARM", GXutil.ltrim( localUtil.ntoc( AV95Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV95Barcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV95Barcod_CTRL", GXutil.rtrim( sCtrlAV95Barcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV96BarCodReo_PARM", GXutil.ltrim( localUtil.ntoc( AV96BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV96BarCodReo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV96BarCodReo_CTRL", GXutil.rtrim( sCtrlAV96BarCodReo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV97BarCodPar_PARM", GXutil.rtrim( AV97BarCodPar));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV97BarCodPar)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV97BarCodPar_CTRL", GXutil.rtrim( sCtrlAV97BarCodPar));
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
      we1DZ2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211671461", true, true);
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
      httpContext.AddJavascriptSource("mantenimientodehdrs_wc.js", "?20268211671461", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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

   public void subsflControlProps_412( )
   {
      cmbavGridactions.setInternalname( sPrefix+"vGRIDACTIONS_"+sGXsfl_41_idx );
      edtBarNHdr_Internalname = sPrefix+"BARNHDR_"+sGXsfl_41_idx ;
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_41_idx ;
      edtPedidoClie_Internalname = sPrefix+"PEDIDOCLIE_"+sGXsfl_41_idx ;
      edtBarEncCli_Internalname = sPrefix+"BARENCCLI_"+sGXsfl_41_idx ;
      edtBarSer_Internalname = sPrefix+"BARSER_"+sGXsfl_41_idx ;
      edtBarSerDsc_Internalname = sPrefix+"BARSERDSC_"+sGXsfl_41_idx ;
      edtBarTipArtD_Internalname = sPrefix+"BARTIPARTD_"+sGXsfl_41_idx ;
      edtCliCod_Internalname = sPrefix+"CLICOD_"+sGXsfl_41_idx ;
      edtBarColNom_Internalname = sPrefix+"BARCOLNOM_"+sGXsfl_41_idx ;
      edtBarColNum_Internalname = sPrefix+"BARCOLNUM_"+sGXsfl_41_idx ;
      edtBarFecGen_Internalname = sPrefix+"BARFECGEN_"+sGXsfl_41_idx ;
      edtBarFecCli_Internalname = sPrefix+"BARFECCLI_"+sGXsfl_41_idx ;
      edtBarFecSal_Internalname = sPrefix+"BARFECSAL_"+sGXsfl_41_idx ;
      edtBarSit_Internalname = sPrefix+"BARSIT_"+sGXsfl_41_idx ;
      chkHayRec.setInternalname( sPrefix+"HAYREC_"+sGXsfl_41_idx );
      edtBarCod_Internalname = sPrefix+"BARCOD_"+sGXsfl_41_idx ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO_"+sGXsfl_41_idx ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR_"+sGXsfl_41_idx ;
      edtDisCod_Internalname = sPrefix+"DISCOD_"+sGXsfl_41_idx ;
      edtBarPriTin_Internalname = sPrefix+"BARPRITIN_"+sGXsfl_41_idx ;
      edtBarExt_Internalname = sPrefix+"BAREXT_"+sGXsfl_41_idx ;
      edtBarPart_Internalname = sPrefix+"BARPART_"+sGXsfl_41_idx ;
      edtEmprCod_Internalname = sPrefix+"EMPRCOD_"+sGXsfl_41_idx ;
   }

   public void subsflControlProps_fel_412( )
   {
      cmbavGridactions.setInternalname( sPrefix+"vGRIDACTIONS_"+sGXsfl_41_fel_idx );
      edtBarNHdr_Internalname = sPrefix+"BARNHDR_"+sGXsfl_41_fel_idx ;
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_41_fel_idx ;
      edtPedidoClie_Internalname = sPrefix+"PEDIDOCLIE_"+sGXsfl_41_fel_idx ;
      edtBarEncCli_Internalname = sPrefix+"BARENCCLI_"+sGXsfl_41_fel_idx ;
      edtBarSer_Internalname = sPrefix+"BARSER_"+sGXsfl_41_fel_idx ;
      edtBarSerDsc_Internalname = sPrefix+"BARSERDSC_"+sGXsfl_41_fel_idx ;
      edtBarTipArtD_Internalname = sPrefix+"BARTIPARTD_"+sGXsfl_41_fel_idx ;
      edtCliCod_Internalname = sPrefix+"CLICOD_"+sGXsfl_41_fel_idx ;
      edtBarColNom_Internalname = sPrefix+"BARCOLNOM_"+sGXsfl_41_fel_idx ;
      edtBarColNum_Internalname = sPrefix+"BARCOLNUM_"+sGXsfl_41_fel_idx ;
      edtBarFecGen_Internalname = sPrefix+"BARFECGEN_"+sGXsfl_41_fel_idx ;
      edtBarFecCli_Internalname = sPrefix+"BARFECCLI_"+sGXsfl_41_fel_idx ;
      edtBarFecSal_Internalname = sPrefix+"BARFECSAL_"+sGXsfl_41_fel_idx ;
      edtBarSit_Internalname = sPrefix+"BARSIT_"+sGXsfl_41_fel_idx ;
      chkHayRec.setInternalname( sPrefix+"HAYREC_"+sGXsfl_41_fel_idx );
      edtBarCod_Internalname = sPrefix+"BARCOD_"+sGXsfl_41_fel_idx ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO_"+sGXsfl_41_fel_idx ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR_"+sGXsfl_41_fel_idx ;
      edtDisCod_Internalname = sPrefix+"DISCOD_"+sGXsfl_41_fel_idx ;
      edtBarPriTin_Internalname = sPrefix+"BARPRITIN_"+sGXsfl_41_fel_idx ;
      edtBarExt_Internalname = sPrefix+"BAREXT_"+sGXsfl_41_fel_idx ;
      edtBarPart_Internalname = sPrefix+"BARPART_"+sGXsfl_41_fel_idx ;
      edtEmprCod_Internalname = sPrefix+"EMPRCOD_"+sGXsfl_41_fel_idx ;
   }

   public void sendrow_412( )
   {
      subsflControlProps_412( ) ;
      wb1DZ0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_41_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_41_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 42,'"+sPrefix+"',false,'"+sGXsfl_41_idx+"',41)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_41_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV63GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV63GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV63GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(5),"'"+sPrefix+"'"+",false,"+"'"+sPrefix+"EVGRIDACTIONS.CLICK."+sGXsfl_41_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,42);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV63GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_41_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarNHdr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNHdr_Internalname,GXutil.rtrim( A13696BarNHdr),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarNHdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarNHdr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCliNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPedidoClie_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPedidoClie_Internalname,GXutil.rtrim( A13878PedidoClie),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPedidoClie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPedidoClie_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarEncCli_Internalname,GXutil.rtrim( A4812BarEncCli),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarEncCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarSer_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSer_Internalname,GXutil.rtrim( A212BarSer),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarSer_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarSerDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSerDsc_Internalname,GXutil.rtrim( A1652BarSerDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarSerDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarSerDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarTipArtD_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTipArtD_Internalname,GXutil.rtrim( A13711BarTipArtD),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarTipArtD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarTipArtD_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarColNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNom_Internalname,GXutil.rtrim( A135BarColNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarColNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarColNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarColNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarFecGen_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFecGen_Internalname,localUtil.format(A159BarFecGen, "99/99/99"),localUtil.format( A159BarFecGen, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarFecGen_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarFecGen_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarFecCli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFecCli_Internalname,localUtil.format(A155BarFecCli, "99/99/99"),localUtil.format( A155BarFecCli, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarFecCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarFecCli_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarFecSal_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFecSal_Internalname,localUtil.format(A161BarFecSal, "99/99/99"),localUtil.format( A161BarFecSal, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarFecSal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarFecSal_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarSit_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSit_Internalname,GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarSit_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarSit_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+((chkHayRec.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "HAYREC_" + sGXsfl_41_idx ;
         chkHayRec.setName( GXCCtl );
         chkHayRec.setWebtags( "" );
         chkHayRec.setCaption( "" );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkHayRec.getInternalname(), "TitleCaption", chkHayRec.getCaption(), !bGXsfl_41_Refreshing);
         chkHayRec.setCheckedValue( "0" );
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkHayRec.getInternalname(),GXutil.str( A13710HayRec, 1, 0),"","",Integer.valueOf(chkHayRec.getVisible()),Integer.valueOf(0),"1","",StyleString,ClassString,"WWColumn hidden-xs","",""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisCod_Internalname,GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDisCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPriTin_Internalname,GXutil.ltrim( localUtil.ntoc( A3594BarPriTin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3594BarPriTin), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarPriTin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarExt_Internalname,GXutil.ltrim( localUtil.ntoc( A2265BarExt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2265BarExt), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarExt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarPart_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPart_Internalname,GXutil.ltrim( localUtil.ntoc( A1503BarPart, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1503BarPart), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarPart_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarPart_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes1DZ2( ) ;
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
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"41\">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarNHdr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N° Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPedidoClie_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Pedido Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarSer_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Serie", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarSerDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripción Serie", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarTipArtD_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion Tipo Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarColNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarColNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero del Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarFecGen_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Generacion Barcada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarFecCli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Disposicion Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarFecSal_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Salida en Albaran", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarSit_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "St", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((chkHayRec.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Receta?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarPart_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Partida", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
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
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV63GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13696BarNHdr));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarNHdr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A279CliNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCliNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13878PedidoClie));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPedidoClie_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4812BarEncCli));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A212BarSer));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarSer_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1652BarSerDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarSerDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13711BarTipArtD));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarTipArtD_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A135BarColNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarColNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarColNum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A159BarFecGen, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarFecGen_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A155BarFecCli, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarFecCli_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A161BarFecSal, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarFecSal_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarSit_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13710HayRec, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( chkHayRec.getVisible(), (byte)(5), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3594BarPriTin, (byte)(2), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2265BarExt, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1503BarPart, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarPart_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
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
      bttBtnexport_Internalname = sPrefix+"BTNEXPORT" ;
      bttBtnexportcsv_Internalname = sPrefix+"BTNEXPORTCSV" ;
      bttBtneditcolumns_Internalname = sPrefix+"BTNEDITCOLUMNS" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      Ddo_managefilters_Internalname = sPrefix+"DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = sPrefix+"vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = sPrefix+"TABLEFILTERS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      cmbavGridactions.setInternalname( sPrefix+"vGRIDACTIONS" );
      edtBarNHdr_Internalname = sPrefix+"BARNHDR" ;
      edtCliNom_Internalname = sPrefix+"CLINOM" ;
      edtPedidoClie_Internalname = sPrefix+"PEDIDOCLIE" ;
      edtBarEncCli_Internalname = sPrefix+"BARENCCLI" ;
      edtBarSer_Internalname = sPrefix+"BARSER" ;
      edtBarSerDsc_Internalname = sPrefix+"BARSERDSC" ;
      edtBarTipArtD_Internalname = sPrefix+"BARTIPARTD" ;
      edtCliCod_Internalname = sPrefix+"CLICOD" ;
      edtBarColNom_Internalname = sPrefix+"BARCOLNOM" ;
      edtBarColNum_Internalname = sPrefix+"BARCOLNUM" ;
      edtBarFecGen_Internalname = sPrefix+"BARFECGEN" ;
      edtBarFecCli_Internalname = sPrefix+"BARFECCLI" ;
      edtBarFecSal_Internalname = sPrefix+"BARFECSAL" ;
      edtBarSit_Internalname = sPrefix+"BARSIT" ;
      chkHayRec.setInternalname( sPrefix+"HAYREC" );
      edtBarCod_Internalname = sPrefix+"BARCOD" ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO" ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR" ;
      edtDisCod_Internalname = sPrefix+"DISCOD" ;
      edtBarPriTin_Internalname = sPrefix+"BARPRITIN" ;
      edtBarExt_Internalname = sPrefix+"BAREXT" ;
      edtBarPart_Internalname = sPrefix+"BARPART" ;
      edtEmprCod_Internalname = sPrefix+"EMPRCOD" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      Dvelop_confirmpanel_delete_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_DELETE" ;
      tblTabledvelop_confirmpanel_delete_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_DELETE" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
      edtavDdo_barfecgenauxdate_Internalname = sPrefix+"vDDO_BARFECGENAUXDATE" ;
      divDdo_barfecgenauxdates_Internalname = sPrefix+"DDO_BARFECGENAUXDATES" ;
      edtavDdo_barfeccliauxdate_Internalname = sPrefix+"vDDO_BARFECCLIAUXDATE" ;
      divDdo_barfeccliauxdates_Internalname = sPrefix+"DDO_BARFECCLIAUXDATES" ;
      edtavDdo_barfecsalauxdate_Internalname = sPrefix+"vDDO_BARFECSALAUXDATE" ;
      divDdo_barfecsalauxdates_Internalname = sPrefix+"DDO_BARFECSALAUXDATES" ;
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
      edtEmprCod_Jsonclick = "" ;
      edtBarPart_Jsonclick = "" ;
      edtBarExt_Jsonclick = "" ;
      edtBarPriTin_Jsonclick = "" ;
      edtDisCod_Jsonclick = "" ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCod_Jsonclick = "" ;
      chkHayRec.setCaption( "" );
      edtBarSit_Jsonclick = "" ;
      edtBarFecSal_Jsonclick = "" ;
      edtBarFecCli_Jsonclick = "" ;
      edtBarFecGen_Jsonclick = "" ;
      edtBarColNum_Jsonclick = "" ;
      edtBarColNom_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      edtBarTipArtD_Jsonclick = "" ;
      edtBarSerDsc_Jsonclick = "" ;
      edtBarSer_Jsonclick = "" ;
      edtBarEncCli_Jsonclick = "" ;
      edtPedidoClie_Jsonclick = "" ;
      edtCliNom_Jsonclick = "" ;
      edtBarNHdr_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtBarPart_Visible = -1 ;
      chkHayRec.setVisible( -1 );
      edtBarSit_Visible = -1 ;
      edtBarFecSal_Visible = -1 ;
      edtBarFecCli_Visible = -1 ;
      edtBarFecGen_Visible = -1 ;
      edtBarColNum_Visible = -1 ;
      edtBarColNom_Visible = -1 ;
      edtBarTipArtD_Visible = -1 ;
      edtBarSerDsc_Visible = -1 ;
      edtBarSer_Visible = -1 ;
      edtPedidoClie_Visible = -1 ;
      edtCliNom_Visible = -1 ;
      edtBarNHdr_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_barfecsalauxdate_Jsonclick = "" ;
      edtavDdo_barfeccliauxdate_Jsonclick = "" ;
      edtavDdo_barfecgenauxdate_Jsonclick = "" ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;;;;;;;;;;;;;" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Dvelop_confirmpanel_delete_Confirmtype = "1" ;
      Dvelop_confirmpanel_delete_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_delete_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_delete_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_delete_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_delete_Confirmationtext = "¿Desea eliminar la HDR?" ;
      Dvelop_confirmpanel_delete_Title = "" ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "MantenimientodeHDRs_WCGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "||||||||||||1:WWP_TSChecked,2:WWP_TSUnChecked|" ;
      Ddo_grid_Datalisttype = "Dynamic|Dynamic|Dynamic|Dynamic|Dynamic|Dynamic|Dynamic||||||FixedValues|" ;
      Ddo_grid_Includedatalist = "T|T|T|T|T|T|T||||||T|" ;
      Ddo_grid_Filterisrange = "|||||||T||||T||T" ;
      Ddo_grid_Filtertype = "Character|Character|Character|Character|Character|Character|Character|Numeric|Date|Date|Date|Numeric||Numeric" ;
      Ddo_grid_Includefilter = "T|T|T|T|T|T|T|T|T|T|T|T||T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "|T||T|T|T|T|T|T|T|T|T||T" ;
      Ddo_grid_Columnssortvalues = "|1||2|3|4|5|6|7|8|9|10||11" ;
      Ddo_grid_Columnids = "1:BarNHdr|2:CliNom|3:PedidoCliente|5:BarSer|6:BarSerDsc|7:BarTipArtDsc|9:BarColNom|10:BarColNum|11:BarFecGen|12:BarFecCli|13:BarFecSal|14:BarSit|15:HayRec|22:BarPart" ;
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
      Ddo_managefilters_Cls = "ManageFilters" ;
      Ddo_managefilters_Tooltip = "WWP_ManageFiltersTooltip" ;
      Ddo_managefilters_Icon = "fas fa-filter" ;
      Ddo_managefilters_Icontype = "FontIcon" ;
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
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_41_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
      }
      GXCCtl = "HAYREC_" + sGXsfl_41_idx ;
      chkHayRec.setName( GXCCtl );
      chkHayRec.setWebtags( "" );
      chkHayRec.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkHayRec.getInternalname(), "TitleCaption", chkHayRec.getCaption(), !bGXsfl_41_Refreshing);
      chkHayRec.setCheckedValue( "0" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV72Enc20c',fld:'vENC20C',pic:'ZZZ9'},{av:'sPrefix'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV64Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV65Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV66Barfecgen',fld:'vBARFECGEN',pic:''},{av:'AV67BarFecGen_to',fld:'vBARFECGEN_TO',pic:''},{av:'AV68Barsit',fld:'vBARSIT',pic:'Z9'},{av:'AV69BarSit_to',fld:'vBARSIT_TO',pic:'Z9'},{av:'AV70BarEnccli',fld:'vBARENCCLI',pic:''},{av:'AV71BarDisnum',fld:'vBARDISNUM',pic:''},{av:'AV95Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV96BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV97BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV104Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV88Usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV89Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV27TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV28TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV29TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV73TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV74TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV32TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV33TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV34TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV35TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV36TFBarTipArtDsc',fld:'vTFBARTIPARTDSC',pic:''},{av:'AV37TFBarTipArtDsc_Sel',fld:'vTFBARTIPARTDSC_SEL',pic:''},{av:'AV40TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV41TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV42TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV43TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV44TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV48TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV52TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV56TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV57TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV58TFHayRec_Sel',fld:'vTFHAYREC_SEL',pic:'9'},{av:'AV98TFBarPart',fld:'vTFBARPART',pic:'ZZZ9'},{av:'AV99TFBarPart_To',fld:'vTFBARPART_TO',pic:'ZZZ9'},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV100Carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'AV76Pwdgrl',fld:'vPWDGRL',pic:'ZZZ9',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A13696BarNHdr',fld:'BARNHDR',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtPedidoClie_Visible',ctrl:'PEDIDOCLIE',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarTipArtD_Visible',ctrl:'BARTIPARTD',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarFecGen_Visible',ctrl:'BARFECGEN',prop:'Visible'},{av:'edtBarFecCli_Visible',ctrl:'BARFECCLI',prop:'Visible'},{av:'edtBarFecSal_Visible',ctrl:'BARFECSAL',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'chkHayRec.getVisible()',ctrl:'HAYREC',prop:'Visible'},{av:'edtBarPart_Visible',ctrl:'BARPART',prop:'Visible'},{av:'AV61GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV62GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'AV64Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e121DZ2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV72Enc20c',fld:'vENC20C',pic:'ZZZ9'},{av:'AV64Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV65Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV66Barfecgen',fld:'vBARFECGEN',pic:''},{av:'AV67BarFecGen_to',fld:'vBARFECGEN_TO',pic:''},{av:'AV68Barsit',fld:'vBARSIT',pic:'Z9'},{av:'AV69BarSit_to',fld:'vBARSIT_TO',pic:'Z9'},{av:'AV70BarEnccli',fld:'vBARENCCLI',pic:''},{av:'AV71BarDisnum',fld:'vBARDISNUM',pic:''},{av:'AV95Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV96BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV97BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV104Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV88Usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV89Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV27TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV28TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV29TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV73TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV74TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV32TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV33TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV34TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV35TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV36TFBarTipArtDsc',fld:'vTFBARTIPARTDSC',pic:''},{av:'AV37TFBarTipArtDsc_Sel',fld:'vTFBARTIPARTDSC_SEL',pic:''},{av:'AV40TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV41TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV42TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV43TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV44TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV48TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV52TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV56TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV57TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV58TFHayRec_Sel',fld:'vTFHAYREC_SEL',pic:'9'},{av:'AV98TFBarPart',fld:'vTFBARPART',pic:'ZZZ9'},{av:'AV99TFBarPart_To',fld:'vTFBARPART_TO',pic:'ZZZ9'},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV100Carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'AV76Pwdgrl',fld:'vPWDGRL',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e131DZ2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV72Enc20c',fld:'vENC20C',pic:'ZZZ9'},{av:'AV64Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV65Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV66Barfecgen',fld:'vBARFECGEN',pic:''},{av:'AV67BarFecGen_to',fld:'vBARFECGEN_TO',pic:''},{av:'AV68Barsit',fld:'vBARSIT',pic:'Z9'},{av:'AV69BarSit_to',fld:'vBARSIT_TO',pic:'Z9'},{av:'AV70BarEnccli',fld:'vBARENCCLI',pic:''},{av:'AV71BarDisnum',fld:'vBARDISNUM',pic:''},{av:'AV95Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV96BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV97BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV104Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV88Usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV89Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV27TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV28TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV29TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV73TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV74TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV32TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV33TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV34TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV35TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV36TFBarTipArtDsc',fld:'vTFBARTIPARTDSC',pic:''},{av:'AV37TFBarTipArtDsc_Sel',fld:'vTFBARTIPARTDSC_SEL',pic:''},{av:'AV40TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV41TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV42TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV43TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV44TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV48TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV52TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV56TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV57TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV58TFHayRec_Sel',fld:'vTFHAYREC_SEL',pic:'9'},{av:'AV98TFBarPart',fld:'vTFBARPART',pic:'ZZZ9'},{av:'AV99TFBarPart_To',fld:'vTFBARPART_TO',pic:'ZZZ9'},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV100Carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'AV76Pwdgrl',fld:'vPWDGRL',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e141DZ2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV72Enc20c',fld:'vENC20C',pic:'ZZZ9'},{av:'AV64Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV65Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV66Barfecgen',fld:'vBARFECGEN',pic:''},{av:'AV67BarFecGen_to',fld:'vBARFECGEN_TO',pic:''},{av:'AV68Barsit',fld:'vBARSIT',pic:'Z9'},{av:'AV69BarSit_to',fld:'vBARSIT_TO',pic:'Z9'},{av:'AV70BarEnccli',fld:'vBARENCCLI',pic:''},{av:'AV71BarDisnum',fld:'vBARDISNUM',pic:''},{av:'AV95Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV96BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV97BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV104Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV88Usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV89Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV27TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV28TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV29TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV73TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV74TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV32TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV33TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV34TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV35TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV36TFBarTipArtDsc',fld:'vTFBARTIPARTDSC',pic:''},{av:'AV37TFBarTipArtDsc_Sel',fld:'vTFBARTIPARTDSC_SEL',pic:''},{av:'AV40TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV41TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV42TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV43TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV44TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV48TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV52TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV56TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV57TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV58TFHayRec_Sel',fld:'vTFHAYREC_SEL',pic:'9'},{av:'AV98TFBarPart',fld:'vTFBARPART',pic:'ZZZ9'},{av:'AV99TFBarPart_To',fld:'vTFBARPART_TO',pic:'ZZZ9'},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV100Carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'AV76Pwdgrl',fld:'vPWDGRL',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV98TFBarPart',fld:'vTFBARPART',pic:'ZZZ9'},{av:'AV99TFBarPart_To',fld:'vTFBARPART_TO',pic:'ZZZ9'},{av:'AV58TFHayRec_Sel',fld:'vTFHAYREC_SEL',pic:'9'},{av:'AV56TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV57TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV52TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV48TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV44TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV42TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV43TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV40TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV41TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV36TFBarTipArtDsc',fld:'vTFBARTIPARTDSC',pic:''},{av:'AV37TFBarTipArtDsc_Sel',fld:'vTFBARTIPARTDSC_SEL',pic:''},{av:'AV34TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV35TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV32TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV33TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV73TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV74TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV28TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV29TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV26TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV27TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e211DZ2',iparms:[{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV64Emprcod',fld:'vEMPRCOD',pic:'@!'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV63GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e151DZ2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV72Enc20c',fld:'vENC20C',pic:'ZZZ9'},{av:'AV64Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV65Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV66Barfecgen',fld:'vBARFECGEN',pic:''},{av:'AV67BarFecGen_to',fld:'vBARFECGEN_TO',pic:''},{av:'AV68Barsit',fld:'vBARSIT',pic:'Z9'},{av:'AV69BarSit_to',fld:'vBARSIT_TO',pic:'Z9'},{av:'AV70BarEnccli',fld:'vBARENCCLI',pic:''},{av:'AV71BarDisnum',fld:'vBARDISNUM',pic:''},{av:'AV95Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV96BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV97BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV104Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV88Usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV89Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV27TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV28TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV29TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV73TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV74TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV32TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV33TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV34TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV35TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV36TFBarTipArtDsc',fld:'vTFBARTIPARTDSC',pic:''},{av:'AV37TFBarTipArtDsc_Sel',fld:'vTFBARTIPARTDSC_SEL',pic:''},{av:'AV40TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV41TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV42TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV43TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV44TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV48TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV52TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV56TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV57TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV58TFHayRec_Sel',fld:'vTFHAYREC_SEL',pic:'9'},{av:'AV98TFBarPart',fld:'vTFBARPART',pic:'ZZZ9'},{av:'AV99TFBarPart_To',fld:'vTFBARPART_TO',pic:'ZZZ9'},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV100Carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'AV76Pwdgrl',fld:'vPWDGRL',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A13696BarNHdr',fld:'BARNHDR',pic:'',hsh:true}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtPedidoClie_Visible',ctrl:'PEDIDOCLIE',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarTipArtD_Visible',ctrl:'BARTIPARTD',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarFecGen_Visible',ctrl:'BARFECGEN',prop:'Visible'},{av:'edtBarFecCli_Visible',ctrl:'BARFECCLI',prop:'Visible'},{av:'edtBarFecSal_Visible',ctrl:'BARFECSAL',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'chkHayRec.getVisible()',ctrl:'HAYREC',prop:'Visible'},{av:'edtBarPart_Visible',ctrl:'BARPART',prop:'Visible'},{av:'AV61GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV62GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'AV64Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e111DZ2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV72Enc20c',fld:'vENC20C',pic:'ZZZ9'},{av:'AV64Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV65Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV66Barfecgen',fld:'vBARFECGEN',pic:''},{av:'AV67BarFecGen_to',fld:'vBARFECGEN_TO',pic:''},{av:'AV68Barsit',fld:'vBARSIT',pic:'Z9'},{av:'AV69BarSit_to',fld:'vBARSIT_TO',pic:'Z9'},{av:'AV70BarEnccli',fld:'vBARENCCLI',pic:''},{av:'AV71BarDisnum',fld:'vBARDISNUM',pic:''},{av:'AV95Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV96BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV97BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV104Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV88Usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV89Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV27TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV28TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV29TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV73TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV74TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV32TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV33TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV34TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV35TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV36TFBarTipArtDsc',fld:'vTFBARTIPARTDSC',pic:''},{av:'AV37TFBarTipArtDsc_Sel',fld:'vTFBARTIPARTDSC_SEL',pic:''},{av:'AV40TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV41TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV42TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV43TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV44TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV48TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV52TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV56TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV57TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV58TFHayRec_Sel',fld:'vTFHAYREC_SEL',pic:'9'},{av:'AV98TFBarPart',fld:'vTFBARPART',pic:'ZZZ9'},{av:'AV99TFBarPart_To',fld:'vTFBARPART_TO',pic:'ZZZ9'},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV100Carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'AV76Pwdgrl',fld:'vPWDGRL',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A13696BarNHdr',fld:'BARNHDR',pic:'',hsh:true}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV27TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV28TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV29TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV73TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV74TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV32TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV33TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV34TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV35TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV36TFBarTipArtDsc',fld:'vTFBARTIPARTDSC',pic:''},{av:'AV37TFBarTipArtDsc_Sel',fld:'vTFBARTIPARTDSC_SEL',pic:''},{av:'AV40TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV41TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV42TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV43TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV44TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV48TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV52TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV56TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV57TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV58TFHayRec_Sel',fld:'vTFHAYREC_SEL',pic:'9'},{av:'AV98TFBarPart',fld:'vTFBARPART',pic:'ZZZ9'},{av:'AV99TFBarPart_To',fld:'vTFBARPART_TO',pic:'ZZZ9'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtPedidoClie_Visible',ctrl:'PEDIDOCLIE',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarTipArtD_Visible',ctrl:'BARTIPARTD',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarFecGen_Visible',ctrl:'BARFECGEN',prop:'Visible'},{av:'edtBarFecCli_Visible',ctrl:'BARFECCLI',prop:'Visible'},{av:'edtBarFecSal_Visible',ctrl:'BARFECSAL',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'chkHayRec.getVisible()',ctrl:'HAYREC',prop:'Visible'},{av:'edtBarPart_Visible',ctrl:'BARPART',prop:'Visible'},{av:'AV61GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV62GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'AV64Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e221DZ2',iparms:[{av:'cmbavGridactions'},{av:'AV63GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV72Enc20c',fld:'vENC20C',pic:'ZZZ9'},{av:'AV64Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV65Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV66Barfecgen',fld:'vBARFECGEN',pic:''},{av:'AV67BarFecGen_to',fld:'vBARFECGEN_TO',pic:''},{av:'AV68Barsit',fld:'vBARSIT',pic:'Z9'},{av:'AV69BarSit_to',fld:'vBARSIT_TO',pic:'Z9'},{av:'AV70BarEnccli',fld:'vBARENCCLI',pic:''},{av:'AV71BarDisnum',fld:'vBARDISNUM',pic:''},{av:'AV95Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV96BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV97BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV104Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV88Usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV89Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV27TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV28TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV29TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV73TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV74TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV32TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV33TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV34TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV35TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV36TFBarTipArtDsc',fld:'vTFBARTIPARTDSC',pic:''},{av:'AV37TFBarTipArtDsc_Sel',fld:'vTFBARTIPARTDSC_SEL',pic:''},{av:'AV40TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV41TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV42TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV43TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV44TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV48TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV52TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV56TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV57TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV58TFHayRec_Sel',fld:'vTFHAYREC_SEL',pic:'9'},{av:'AV98TFBarPart',fld:'vTFBARPART',pic:'ZZZ9'},{av:'AV99TFBarPart_To',fld:'vTFBARPART_TO',pic:'ZZZ9'},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV100Carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'AV76Pwdgrl',fld:'vPWDGRL',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A13696BarNHdr',fld:'BARNHDR',pic:'',hsh:true},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A3594BarPriTin',fld:'BARPRITIN',pic:'Z9'},{av:'A2265BarExt',fld:'BAREXT',pic:'9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A13878PedidoClie',fld:'PEDIDOCLIE',pic:''}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV63GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'Dvelop_confirmpanel_delete_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_DELETE',prop:'ConfirmationText'},{av:'AV78EmprCod_Selected',fld:'vEMPRCOD_SELECTED',pic:'@!'},{av:'AV79BarCod_Selected',fld:'vBARCOD_SELECTED',pic:'ZZZZZZZ9'},{av:'AV80BarCodReo_Selected',fld:'vBARCODREO_SELECTED',pic:'9'},{av:'AV81BarCodPar_Selected',fld:'vBARCODPAR_SELECTED',pic:''},{av:'A2265BarExt',fld:'BAREXT',pic:'9'},{av:'A3594BarPriTin',fld:'BARPRITIN',pic:'Z9'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13878PedidoClie',fld:'PEDIDOCLIE',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'AV64Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtPedidoClie_Visible',ctrl:'PEDIDOCLIE',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarTipArtD_Visible',ctrl:'BARTIPARTD',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarFecGen_Visible',ctrl:'BARFECGEN',prop:'Visible'},{av:'edtBarFecCli_Visible',ctrl:'BARFECCLI',prop:'Visible'},{av:'edtBarFecSal_Visible',ctrl:'BARFECSAL',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'chkHayRec.getVisible()',ctrl:'HAYREC',prop:'Visible'},{av:'edtBarPart_Visible',ctrl:'BARPART',prop:'Visible'},{av:'AV61GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV62GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_DELETE.CLOSE","{handler:'e161DZ2',iparms:[{av:'Dvelop_confirmpanel_delete_Result',ctrl:'DVELOP_CONFIRMPANEL_DELETE',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV72Enc20c',fld:'vENC20C',pic:'ZZZ9'},{av:'AV64Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV65Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV66Barfecgen',fld:'vBARFECGEN',pic:''},{av:'AV67BarFecGen_to',fld:'vBARFECGEN_TO',pic:''},{av:'AV68Barsit',fld:'vBARSIT',pic:'Z9'},{av:'AV69BarSit_to',fld:'vBARSIT_TO',pic:'Z9'},{av:'AV70BarEnccli',fld:'vBARENCCLI',pic:''},{av:'AV71BarDisnum',fld:'vBARDISNUM',pic:''},{av:'AV95Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV96BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV97BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV104Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV88Usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV89Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV27TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV28TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV29TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV73TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV74TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV32TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV33TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV34TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV35TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV36TFBarTipArtDsc',fld:'vTFBARTIPARTDSC',pic:''},{av:'AV37TFBarTipArtDsc_Sel',fld:'vTFBARTIPARTDSC_SEL',pic:''},{av:'AV40TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV41TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV42TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV43TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV44TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV48TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV52TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV56TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV57TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV58TFHayRec_Sel',fld:'vTFHAYREC_SEL',pic:'9'},{av:'AV98TFBarPart',fld:'vTFBARPART',pic:'ZZZ9'},{av:'AV99TFBarPart_To',fld:'vTFBARPART_TO',pic:'ZZZ9'},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV100Carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'AV76Pwdgrl',fld:'vPWDGRL',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'AV75ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9'},{av:'AV78EmprCod_Selected',fld:'vEMPRCOD_SELECTED',pic:'@!'},{av:'AV79BarCod_Selected',fld:'vBARCOD_SELECTED',pic:'ZZZZZZZ9'},{av:'AV80BarCodReo_Selected',fld:'vBARCODREO_SELECTED',pic:'9'},{av:'AV81BarCodPar_Selected',fld:'vBARCODPAR_SELECTED',pic:''},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A13696BarNHdr',fld:'BARNHDR',pic:'',hsh:true}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_DELETE.CLOSE",",oparms:[{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'AV64Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV75ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtPedidoClie_Visible',ctrl:'PEDIDOCLIE',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarTipArtD_Visible',ctrl:'BARTIPARTD',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarFecGen_Visible',ctrl:'BARFECGEN',prop:'Visible'},{av:'edtBarFecCli_Visible',ctrl:'BARFECCLI',prop:'Visible'},{av:'edtBarFecSal_Visible',ctrl:'BARFECSAL',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'chkHayRec.getVisible()',ctrl:'HAYREC',prop:'Visible'},{av:'edtBarPart_Visible',ctrl:'BARPART',prop:'Visible'},{av:'AV61GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV62GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e171DZ2',iparms:[]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e181DZ2',iparms:[]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("VALID_BARNHDR","{handler:'valid_Barnhdr',iparms:[]");
      setEventMetadata("VALID_BARNHDR",",oparms:[]}");
      setEventMetadata("VALID_CLINOM","{handler:'valid_Clinom',iparms:[]");
      setEventMetadata("VALID_CLINOM",",oparms:[]}");
      setEventMetadata("VALID_PEDIDOCLIE","{handler:'valid_Pedidoclie',iparms:[]");
      setEventMetadata("VALID_PEDIDOCLIE",",oparms:[]}");
      setEventMetadata("VALID_BARENCCLI","{handler:'valid_Barenccli',iparms:[]");
      setEventMetadata("VALID_BARENCCLI",",oparms:[]}");
      setEventMetadata("VALID_BARSER","{handler:'valid_Barser',iparms:[]");
      setEventMetadata("VALID_BARSER",",oparms:[]}");
      setEventMetadata("VALID_BARSERDSC","{handler:'valid_Barserdsc',iparms:[]");
      setEventMetadata("VALID_BARSERDSC",",oparms:[]}");
      setEventMetadata("VALID_BARTIPARTD","{handler:'valid_Bartipartd',iparms:[]");
      setEventMetadata("VALID_BARTIPARTD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOLNOM","{handler:'valid_Barcolnom',iparms:[]");
      setEventMetadata("VALID_BARCOLNOM",",oparms:[]}");
      setEventMetadata("VALID_BARCOLNUM","{handler:'valid_Barcolnum',iparms:[]");
      setEventMetadata("VALID_BARCOLNUM",",oparms:[]}");
      setEventMetadata("VALID_BARSIT","{handler:'valid_Barsit',iparms:[]");
      setEventMetadata("VALID_BARSIT",",oparms:[]}");
      setEventMetadata("VALID_HAYREC","{handler:'valid_Hayrec',iparms:[]");
      setEventMetadata("VALID_HAYREC",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_BARPART","{handler:'valid_Barpart',iparms:[]");
      setEventMetadata("VALID_BARPART",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
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
      wcpOAV64Emprcod = "" ;
      wcpOAV66Barfecgen = GXutil.nullDate() ;
      wcpOAV67BarFecGen_to = GXutil.nullDate() ;
      wcpOAV70BarEnccli = "" ;
      wcpOAV71BarDisnum = "" ;
      wcpOAV97BarCodPar = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      Dvelop_confirmpanel_delete_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV64Emprcod = "" ;
      AV66Barfecgen = GXutil.nullDate() ;
      AV67BarFecGen_to = GXutil.nullDate() ;
      AV70BarEnccli = "" ;
      AV71BarDisnum = "" ;
      AV97BarCodPar = "" ;
      AV20ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV104Pgmname = "" ;
      AV88Usurcod = "" ;
      AV89Station = "" ;
      AV15FilterFullText = "" ;
      AV26TFBarNHdr = "" ;
      AV27TFBarNHdr_Sel = "" ;
      AV28TFCliNom = "" ;
      AV29TFCliNom_Sel = "" ;
      AV73TFPedidoCliente = "" ;
      AV74TFPedidoCliente_Sel = "" ;
      AV32TFBarSer = "" ;
      AV33TFBarSer_Sel = "" ;
      AV34TFBarSerDsc = "" ;
      AV35TFBarSerDsc_Sel = "" ;
      AV36TFBarTipArtDsc = "" ;
      AV37TFBarTipArtDsc_Sel = "" ;
      AV40TFBarColNom = "" ;
      AV41TFBarColNom_Sel = "" ;
      AV44TFBarFecGen = GXutil.nullDate() ;
      AV48TFBarFecCli = GXutil.nullDate() ;
      AV52TFBarFecSal = GXutil.nullDate() ;
      Gx_mode = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV23ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV59DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      A758ProCod = "" ;
      AV78EmprCod_Selected = "" ;
      AV81BarCodPar_Selected = "" ;
      A143BarDisNum = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnexport_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV46DDO_BarFecGenAuxDate = GXutil.nullDate() ;
      AV50DDO_BarFecCliAuxDate = GXutil.nullDate() ;
      AV54DDO_BarFecSalAuxDate = GXutil.nullDate() ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A13696BarNHdr = "" ;
      A279CliNom = "" ;
      A13878PedidoClie = "" ;
      A4812BarEncCli = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A13711BarTipArtD = "" ;
      A135BarColNom = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A155BarFecCli = GXutil.nullDate() ;
      A161BarFecSal = GXutil.nullDate() ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      AV105Mantenimientodehdrs_wcds_1_filterfulltext = "" ;
      AV106Mantenimientodehdrs_wcds_2_tfbarnhdr = "" ;
      AV107Mantenimientodehdrs_wcds_3_tfbarnhdr_sel = "" ;
      AV108Mantenimientodehdrs_wcds_4_tfclinom = "" ;
      AV109Mantenimientodehdrs_wcds_5_tfclinom_sel = "" ;
      AV110Mantenimientodehdrs_wcds_6_tfpedidocliente = "" ;
      AV111Mantenimientodehdrs_wcds_7_tfpedidocliente_sel = "" ;
      AV112Mantenimientodehdrs_wcds_8_tfbarser = "" ;
      AV113Mantenimientodehdrs_wcds_9_tfbarser_sel = "" ;
      AV114Mantenimientodehdrs_wcds_10_tfbarserdsc = "" ;
      AV115Mantenimientodehdrs_wcds_11_tfbarserdsc_sel = "" ;
      AV116Mantenimientodehdrs_wcds_12_tfbartipartdsc = "" ;
      AV117Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel = "" ;
      AV118Mantenimientodehdrs_wcds_14_tfbarcolnom = "" ;
      AV119Mantenimientodehdrs_wcds_15_tfbarcolnom_sel = "" ;
      AV122Mantenimientodehdrs_wcds_18_tfbarfecgen = GXutil.nullDate() ;
      AV123Mantenimientodehdrs_wcds_19_tfbarfeccli = GXutil.nullDate() ;
      AV124Mantenimientodehdrs_wcds_20_tfbarfecsal = GXutil.nullDate() ;
      scmdbuf = "" ;
      lV105Mantenimientodehdrs_wcds_1_filterfulltext = "" ;
      lV106Mantenimientodehdrs_wcds_2_tfbarnhdr = "" ;
      lV108Mantenimientodehdrs_wcds_4_tfclinom = "" ;
      lV112Mantenimientodehdrs_wcds_8_tfbarser = "" ;
      lV114Mantenimientodehdrs_wcds_10_tfbarserdsc = "" ;
      lV116Mantenimientodehdrs_wcds_12_tfbartipartdsc = "" ;
      lV118Mantenimientodehdrs_wcds_14_tfbarcolnom = "" ;
      H01DZ2_A217BarTipArt = new short[1] ;
      H01DZ2_n217BarTipArt = new boolean[] {false} ;
      H01DZ2_A1503BarPart = new short[1] ;
      H01DZ2_A2265BarExt = new byte[1] ;
      H01DZ2_n2265BarExt = new boolean[] {false} ;
      H01DZ2_A3594BarPriTin = new byte[1] ;
      H01DZ2_A361DisCod = new int[1] ;
      H01DZ2_A213BarSit = new byte[1] ;
      H01DZ2_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      H01DZ2_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      H01DZ2_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      H01DZ2_A136BarColNum = new int[1] ;
      H01DZ2_A135BarColNom = new String[] {""} ;
      H01DZ2_A252CliCod = new int[1] ;
      H01DZ2_n252CliCod = new boolean[] {false} ;
      H01DZ2_A13711BarTipArtD = new String[] {""} ;
      H01DZ2_n13711BarTipArtD = new boolean[] {false} ;
      H01DZ2_A1652BarSerDsc = new String[] {""} ;
      H01DZ2_A212BarSer = new String[] {""} ;
      H01DZ2_A279CliNom = new String[] {""} ;
      H01DZ2_A13696BarNHdr = new String[] {""} ;
      H01DZ2_A143BarDisNum = new String[] {""} ;
      H01DZ2_A4812BarEncCli = new String[] {""} ;
      H01DZ2_A130BarCodPar = new String[] {""} ;
      H01DZ2_A132BarCodReo = new byte[1] ;
      H01DZ2_A129BarCod = new int[1] ;
      H01DZ2_A396EmprCod = new String[] {""} ;
      H01DZ3_A217BarTipArt = new short[1] ;
      H01DZ3_n217BarTipArt = new boolean[] {false} ;
      H01DZ3_A1503BarPart = new short[1] ;
      H01DZ3_A2265BarExt = new byte[1] ;
      H01DZ3_n2265BarExt = new boolean[] {false} ;
      H01DZ3_A3594BarPriTin = new byte[1] ;
      H01DZ3_A361DisCod = new int[1] ;
      H01DZ3_A213BarSit = new byte[1] ;
      H01DZ3_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      H01DZ3_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      H01DZ3_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      H01DZ3_A136BarColNum = new int[1] ;
      H01DZ3_A135BarColNom = new String[] {""} ;
      H01DZ3_A252CliCod = new int[1] ;
      H01DZ3_n252CliCod = new boolean[] {false} ;
      H01DZ3_A13711BarTipArtD = new String[] {""} ;
      H01DZ3_n13711BarTipArtD = new boolean[] {false} ;
      H01DZ3_A1652BarSerDsc = new String[] {""} ;
      H01DZ3_A212BarSer = new String[] {""} ;
      H01DZ3_A279CliNom = new String[] {""} ;
      H01DZ3_A13696BarNHdr = new String[] {""} ;
      H01DZ3_A143BarDisNum = new String[] {""} ;
      H01DZ3_A4812BarEncCli = new String[] {""} ;
      H01DZ3_A130BarCodPar = new String[] {""} ;
      H01DZ3_A132BarCodReo = new byte[1] ;
      H01DZ3_A129BarCod = new int[1] ;
      H01DZ3_A396EmprCod = new String[] {""} ;
      AV93EmprNom = "" ;
      AV77ActDatos = "" ;
      AV82WebSession = httpContext.getWebSession();
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons11 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext12 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV22Session = httpContext.getWebSession();
      AV18ColumnsSelectorXML = "" ;
      GXv_int9 = new int[1] ;
      AV87Inc_obs = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV24ManageFiltersXml = "" ;
      AV16ExcelFilename = "" ;
      AV17ErrorMessage = "" ;
      AV19UserCustomValue = "" ;
      AV21ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector14 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector15 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item16 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item17 = new GXBaseCollection[1] ;
      AV101Window = new com.genexus.webpanels.GXWindow();
      ucDvelop_confirmpanel_delete = new com.genexus.webpanels.GXUserControl();
      GXv_int13 = new int[1] ;
      GXv_int7 = new byte[1] ;
      GXv_int18 = new byte[1] ;
      H01DZ4_A129BarCod = new int[1] ;
      H01DZ4_A132BarCodReo = new byte[1] ;
      H01DZ4_A130BarCodPar = new String[] {""} ;
      H01DZ4_A396EmprCod = new String[] {""} ;
      H01DZ4_A153BarFasEst = new byte[1] ;
      H01DZ4_A194BarOrdLin = new short[1] ;
      H01DZ4_A758ProCod = new String[] {""} ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char26 = "" ;
      GXv_char27 = new String[1] ;
      GXt_char24 = "" ;
      GXv_char25 = new String[1] ;
      GXt_char22 = "" ;
      GXv_char23 = new String[1] ;
      GXt_char21 = "" ;
      GXv_char5 = new String[1] ;
      GXt_char20 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char19 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState28 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV64Emprcod = "" ;
      sCtrlAV65Clicod = "" ;
      sCtrlAV66Barfecgen = "" ;
      sCtrlAV67BarFecGen_to = "" ;
      sCtrlAV68Barsit = "" ;
      sCtrlAV69BarSit_to = "" ;
      sCtrlAV70BarEnccli = "" ;
      sCtrlAV71BarDisnum = "" ;
      sCtrlAV95Barcod = "" ;
      sCtrlAV96BarCodReo = "" ;
      sCtrlAV97BarCodPar = "" ;
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientodehdrs_wc__default(),
         new Object[] {
             new Object[] {
            H01DZ2_A217BarTipArt, H01DZ2_n217BarTipArt, H01DZ2_A1503BarPart, H01DZ2_A2265BarExt, H01DZ2_n2265BarExt, H01DZ2_A3594BarPriTin, H01DZ2_A361DisCod, H01DZ2_A213BarSit, H01DZ2_A161BarFecSal, H01DZ2_A155BarFecCli,
            H01DZ2_A159BarFecGen, H01DZ2_A136BarColNum, H01DZ2_A135BarColNom, H01DZ2_A252CliCod, H01DZ2_n252CliCod, H01DZ2_A13711BarTipArtD, H01DZ2_n13711BarTipArtD, H01DZ2_A1652BarSerDsc, H01DZ2_A212BarSer, H01DZ2_A279CliNom,
            H01DZ2_A13696BarNHdr, H01DZ2_A143BarDisNum, H01DZ2_A4812BarEncCli, H01DZ2_A130BarCodPar, H01DZ2_A132BarCodReo, H01DZ2_A129BarCod, H01DZ2_A396EmprCod
            }
            , new Object[] {
            H01DZ3_A217BarTipArt, H01DZ3_n217BarTipArt, H01DZ3_A1503BarPart, H01DZ3_A2265BarExt, H01DZ3_n2265BarExt, H01DZ3_A3594BarPriTin, H01DZ3_A361DisCod, H01DZ3_A213BarSit, H01DZ3_A161BarFecSal, H01DZ3_A155BarFecCli,
            H01DZ3_A159BarFecGen, H01DZ3_A136BarColNum, H01DZ3_A135BarColNom, H01DZ3_A252CliCod, H01DZ3_n252CliCod, H01DZ3_A13711BarTipArtD, H01DZ3_n13711BarTipArtD, H01DZ3_A1652BarSerDsc, H01DZ3_A212BarSer, H01DZ3_A279CliNom,
            H01DZ3_A13696BarNHdr, H01DZ3_A143BarDisNum, H01DZ3_A4812BarEncCli, H01DZ3_A130BarCodPar, H01DZ3_A132BarCodReo, H01DZ3_A129BarCod, H01DZ3_A396EmprCod
            }
            , new Object[] {
            H01DZ4_A129BarCod, H01DZ4_A132BarCodReo, H01DZ4_A130BarCodPar, H01DZ4_A396EmprCod, H01DZ4_A153BarFasEst, H01DZ4_A194BarOrdLin, H01DZ4_A758ProCod
            }
         }
      );
      AV104Pgmname = "MantenimientodeHDRs_WC" ;
      /* GeneXus formulas. */
      AV104Pgmname = "MantenimientodeHDRs_WC" ;
      Gx_err = (short)(0) ;
   }

   private byte wcpOAV68Barsit ;
   private byte wcpOAV69BarSit_to ;
   private byte wcpOAV96BarCodReo ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV68Barsit ;
   private byte AV69BarSit_to ;
   private byte AV96BarCodReo ;
   private byte AV25ManageFiltersExecutionStep ;
   private byte AV56TFBarSit ;
   private byte AV57TFBarSit_To ;
   private byte AV58TFHayRec_Sel ;
   private byte A153BarFasEst ;
   private byte AV80BarCodReo_Selected ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte A213BarSit ;
   private byte A13710HayRec ;
   private byte A132BarCodReo ;
   private byte A3594BarPriTin ;
   private byte A2265BarExt ;
   private byte nDonePA ;
   private byte AV125Mantenimientodehdrs_wcds_21_tfbarsit ;
   private byte AV126Mantenimientodehdrs_wcds_22_tfbarsit_to ;
   private byte AV127Mantenimientodehdrs_wcds_23_tfhayrec_sel ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXt_int6 ;
   private byte AV91Flag ;
   private byte GXv_int7[] ;
   private byte GXv_int18[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV72Enc20c ;
   private short AV98TFBarPart ;
   private short AV99TFBarPart_To ;
   private short AV12OrderedBy ;
   private short AV100Carvitin ;
   private short AV76Pwdgrl ;
   private short A194BarOrdLin ;
   private short wbEnd ;
   private short wbStart ;
   private short AV63GridActions ;
   private short A1503BarPart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV128Mantenimientodehdrs_wcds_24_tfbarpart ;
   private short AV129Mantenimientodehdrs_wcds_25_tfbarpart_to ;
   private short A217BarTipArt ;
   private short AV90Lhipro ;
   private int wcpOAV65Clicod ;
   private int wcpOAV95Barcod ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_41 ;
   private int AV65Clicod ;
   private int AV95Barcod ;
   private int nGXsfl_41_idx=1 ;
   private int AV42TFBarColNum ;
   private int AV43TFBarColNum_To ;
   private int AV75ContVal ;
   private int AV79BarCod_Selected ;
   private int Gridpaginationbar_Pagestoshow ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A129BarCod ;
   private int A361DisCod ;
   private int subGrid_Islastpage ;
   private int AV120Mantenimientodehdrs_wcds_16_tfbarcolnum ;
   private int AV121Mantenimientodehdrs_wcds_17_tfbarcolnum_to ;
   private int GXt_int8 ;
   private int edtBarNHdr_Visible ;
   private int edtCliNom_Visible ;
   private int edtPedidoClie_Visible ;
   private int edtBarSer_Visible ;
   private int edtBarSerDsc_Visible ;
   private int edtBarTipArtD_Visible ;
   private int edtBarColNom_Visible ;
   private int edtBarColNum_Visible ;
   private int edtBarFecGen_Visible ;
   private int edtBarFecCli_Visible ;
   private int edtBarFecSal_Visible ;
   private int edtBarSit_Visible ;
   private int edtBarPart_Visible ;
   private int GXv_int9[] ;
   private int AV60PageToGo ;
   private int GXv_int13[] ;
   private int AV132GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV61GridCurrentPage ;
   private long AV62GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private String wcpOAV64Emprcod ;
   private String wcpOAV70BarEnccli ;
   private String wcpOAV71BarDisnum ;
   private String wcpOAV97BarCodPar ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String Dvelop_confirmpanel_delete_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV64Emprcod ;
   private String AV70BarEnccli ;
   private String AV71BarDisnum ;
   private String AV97BarCodPar ;
   private String sGXsfl_41_idx="0001" ;
   private String AV104Pgmname ;
   private String AV88Usurcod ;
   private String AV89Station ;
   private String AV26TFBarNHdr ;
   private String AV27TFBarNHdr_Sel ;
   private String AV28TFCliNom ;
   private String AV29TFCliNom_Sel ;
   private String AV73TFPedidoCliente ;
   private String AV74TFPedidoCliente_Sel ;
   private String AV32TFBarSer ;
   private String AV33TFBarSer_Sel ;
   private String AV34TFBarSerDsc ;
   private String AV35TFBarSerDsc_Sel ;
   private String AV36TFBarTipArtDsc ;
   private String AV37TFBarTipArtDsc_Sel ;
   private String AV40TFBarColNom ;
   private String AV41TFBarColNom_Sel ;
   private String Gx_mode ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A758ProCod ;
   private String AV78EmprCod_Selected ;
   private String AV81BarCodPar_Selected ;
   private String A143BarDisNum ;
   private String Ddo_managefilters_Icontype ;
   private String Ddo_managefilters_Icon ;
   private String Ddo_managefilters_Tooltip ;
   private String Ddo_managefilters_Cls ;
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
   private String Ddo_grid_Fixable ;
   private String Ddo_grid_Sortedstatus ;
   private String Ddo_grid_Includefilter ;
   private String Ddo_grid_Filtertype ;
   private String Ddo_grid_Filterisrange ;
   private String Ddo_grid_Includedatalist ;
   private String Ddo_grid_Datalisttype ;
   private String Ddo_grid_Datalistfixedvalues ;
   private String Ddo_grid_Datalistproc ;
   private String Ddo_gridcolumnsselector_Caption ;
   private String Ddo_gridcolumnsselector_Tooltip ;
   private String Ddo_gridcolumnsselector_Cls ;
   private String Ddo_gridcolumnsselector_Dropdownoptionstype ;
   private String Ddo_gridcolumnsselector_Gridinternalname ;
   private String Ddo_gridcolumnsselector_Titlecontrolidtoreplace ;
   private String Dvelop_confirmpanel_delete_Title ;
   private String Dvelop_confirmpanel_delete_Confirmationtext ;
   private String Dvelop_confirmpanel_delete_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_delete_Nobuttoncaption ;
   private String Dvelop_confirmpanel_delete_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_delete_Yesbuttonposition ;
   private String Dvelop_confirmpanel_delete_Confirmtype ;
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Fixedcolumns ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divTableactions_Internalname ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtnexport_Internalname ;
   private String bttBtnexport_Jsonclick ;
   private String bttBtnexportcsv_Internalname ;
   private String bttBtnexportcsv_Jsonclick ;
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_barfecgenauxdates_Internalname ;
   private String edtavDdo_barfecgenauxdate_Internalname ;
   private String edtavDdo_barfecgenauxdate_Jsonclick ;
   private String divDdo_barfeccliauxdates_Internalname ;
   private String edtavDdo_barfeccliauxdate_Internalname ;
   private String edtavDdo_barfeccliauxdate_Jsonclick ;
   private String divDdo_barfecsalauxdates_Internalname ;
   private String edtavDdo_barfecsalauxdate_Internalname ;
   private String edtavDdo_barfecsalauxdate_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String A13696BarNHdr ;
   private String edtBarNHdr_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Internalname ;
   private String A13878PedidoClie ;
   private String edtPedidoClie_Internalname ;
   private String A4812BarEncCli ;
   private String edtBarEncCli_Internalname ;
   private String A212BarSer ;
   private String edtBarSer_Internalname ;
   private String A1652BarSerDsc ;
   private String edtBarSerDsc_Internalname ;
   private String A13711BarTipArtD ;
   private String edtBarTipArtD_Internalname ;
   private String edtCliCod_Internalname ;
   private String A135BarColNom ;
   private String edtBarColNom_Internalname ;
   private String edtBarColNum_Internalname ;
   private String edtBarFecGen_Internalname ;
   private String edtBarFecCli_Internalname ;
   private String edtBarFecSal_Internalname ;
   private String edtBarSit_Internalname ;
   private String edtBarCod_Internalname ;
   private String edtBarCodReo_Internalname ;
   private String A130BarCodPar ;
   private String edtBarCodPar_Internalname ;
   private String edtDisCod_Internalname ;
   private String edtBarPriTin_Internalname ;
   private String edtBarExt_Internalname ;
   private String edtBarPart_Internalname ;
   private String A396EmprCod ;
   private String edtEmprCod_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String AV106Mantenimientodehdrs_wcds_2_tfbarnhdr ;
   private String AV107Mantenimientodehdrs_wcds_3_tfbarnhdr_sel ;
   private String AV108Mantenimientodehdrs_wcds_4_tfclinom ;
   private String AV109Mantenimientodehdrs_wcds_5_tfclinom_sel ;
   private String AV110Mantenimientodehdrs_wcds_6_tfpedidocliente ;
   private String AV111Mantenimientodehdrs_wcds_7_tfpedidocliente_sel ;
   private String AV112Mantenimientodehdrs_wcds_8_tfbarser ;
   private String AV113Mantenimientodehdrs_wcds_9_tfbarser_sel ;
   private String AV114Mantenimientodehdrs_wcds_10_tfbarserdsc ;
   private String AV115Mantenimientodehdrs_wcds_11_tfbarserdsc_sel ;
   private String AV116Mantenimientodehdrs_wcds_12_tfbartipartdsc ;
   private String AV117Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel ;
   private String AV118Mantenimientodehdrs_wcds_14_tfbarcolnom ;
   private String AV119Mantenimientodehdrs_wcds_15_tfbarcolnom_sel ;
   private String scmdbuf ;
   private String lV106Mantenimientodehdrs_wcds_2_tfbarnhdr ;
   private String lV108Mantenimientodehdrs_wcds_4_tfclinom ;
   private String lV112Mantenimientodehdrs_wcds_8_tfbarser ;
   private String lV114Mantenimientodehdrs_wcds_10_tfbarserdsc ;
   private String lV116Mantenimientodehdrs_wcds_12_tfbartipartdsc ;
   private String lV118Mantenimientodehdrs_wcds_14_tfbarcolnom ;
   private String AV93EmprNom ;
   private String AV77ActDatos ;
   private String Dvelop_confirmpanel_delete_Internalname ;
   private String GXt_char26 ;
   private String GXv_char27[] ;
   private String GXt_char24 ;
   private String GXv_char25[] ;
   private String GXt_char22 ;
   private String GXv_char23[] ;
   private String GXt_char21 ;
   private String GXv_char5[] ;
   private String GXt_char20 ;
   private String GXv_char4[] ;
   private String GXt_char19 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblTabledvelop_confirmpanel_delete_Internalname ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV64Emprcod ;
   private String sCtrlAV65Clicod ;
   private String sCtrlAV66Barfecgen ;
   private String sCtrlAV67BarFecGen_to ;
   private String sCtrlAV68Barsit ;
   private String sCtrlAV69BarSit_to ;
   private String sCtrlAV70BarEnccli ;
   private String sCtrlAV71BarDisnum ;
   private String sCtrlAV95Barcod ;
   private String sCtrlAV96BarCodReo ;
   private String sCtrlAV97BarCodPar ;
   private String sGXsfl_41_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtBarNHdr_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtPedidoClie_Jsonclick ;
   private String edtBarEncCli_Jsonclick ;
   private String edtBarSer_Jsonclick ;
   private String edtBarSerDsc_Jsonclick ;
   private String edtBarTipArtD_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String edtBarColNom_Jsonclick ;
   private String edtBarColNum_Jsonclick ;
   private String edtBarFecGen_Jsonclick ;
   private String edtBarFecCli_Jsonclick ;
   private String edtBarFecSal_Jsonclick ;
   private String edtBarSit_Jsonclick ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
   private String edtDisCod_Jsonclick ;
   private String edtBarPriTin_Jsonclick ;
   private String edtBarExt_Jsonclick ;
   private String edtBarPart_Jsonclick ;
   private String edtEmprCod_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV66Barfecgen ;
   private java.util.Date wcpOAV67BarFecGen_to ;
   private java.util.Date AV66Barfecgen ;
   private java.util.Date AV67BarFecGen_to ;
   private java.util.Date AV44TFBarFecGen ;
   private java.util.Date AV48TFBarFecCli ;
   private java.util.Date AV52TFBarFecSal ;
   private java.util.Date AV46DDO_BarFecGenAuxDate ;
   private java.util.Date AV50DDO_BarFecCliAuxDate ;
   private java.util.Date AV54DDO_BarFecSalAuxDate ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date A161BarFecSal ;
   private java.util.Date AV122Mantenimientodehdrs_wcds_18_tfbarfecgen ;
   private java.util.Date AV123Mantenimientodehdrs_wcds_19_tfbarfeccli ;
   private java.util.Date AV124Mantenimientodehdrs_wcds_20_tfbarfecsal ;
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
   private boolean Grid_empowerer_Hascolumnsselector ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n13711BarTipArtD ;
   private boolean n252CliCod ;
   private boolean n2265BarExt ;
   private boolean n217BarTipArt ;
   private boolean bGXsfl_41_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean AV94TempBoolean ;
   private String AV18ColumnsSelectorXML ;
   private String AV24ManageFiltersXml ;
   private String AV19UserCustomValue ;
   private String AV15FilterFullText ;
   private String AV105Mantenimientodehdrs_wcds_1_filterfulltext ;
   private String lV105Mantenimientodehdrs_wcds_1_filterfulltext ;
   private String AV87Inc_obs ;
   private String AV16ExcelFilename ;
   private String AV17ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.webpanels.GXWindow AV101Window ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV22Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_delete ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private HTMLChoice cmbavGridactions ;
   private ICheckbox chkHayRec ;
   private IDataStoreProvider pr_default ;
   private short[] H01DZ2_A217BarTipArt ;
   private boolean[] H01DZ2_n217BarTipArt ;
   private short[] H01DZ2_A1503BarPart ;
   private byte[] H01DZ2_A2265BarExt ;
   private boolean[] H01DZ2_n2265BarExt ;
   private byte[] H01DZ2_A3594BarPriTin ;
   private int[] H01DZ2_A361DisCod ;
   private byte[] H01DZ2_A213BarSit ;
   private java.util.Date[] H01DZ2_A161BarFecSal ;
   private java.util.Date[] H01DZ2_A155BarFecCli ;
   private java.util.Date[] H01DZ2_A159BarFecGen ;
   private int[] H01DZ2_A136BarColNum ;
   private String[] H01DZ2_A135BarColNom ;
   private int[] H01DZ2_A252CliCod ;
   private boolean[] H01DZ2_n252CliCod ;
   private String[] H01DZ2_A13711BarTipArtD ;
   private boolean[] H01DZ2_n13711BarTipArtD ;
   private String[] H01DZ2_A1652BarSerDsc ;
   private String[] H01DZ2_A212BarSer ;
   private String[] H01DZ2_A279CliNom ;
   private String[] H01DZ2_A13696BarNHdr ;
   private String[] H01DZ2_A143BarDisNum ;
   private String[] H01DZ2_A4812BarEncCli ;
   private String[] H01DZ2_A130BarCodPar ;
   private byte[] H01DZ2_A132BarCodReo ;
   private int[] H01DZ2_A129BarCod ;
   private String[] H01DZ2_A396EmprCod ;
   private short[] H01DZ3_A217BarTipArt ;
   private boolean[] H01DZ3_n217BarTipArt ;
   private short[] H01DZ3_A1503BarPart ;
   private byte[] H01DZ3_A2265BarExt ;
   private boolean[] H01DZ3_n2265BarExt ;
   private byte[] H01DZ3_A3594BarPriTin ;
   private int[] H01DZ3_A361DisCod ;
   private byte[] H01DZ3_A213BarSit ;
   private java.util.Date[] H01DZ3_A161BarFecSal ;
   private java.util.Date[] H01DZ3_A155BarFecCli ;
   private java.util.Date[] H01DZ3_A159BarFecGen ;
   private int[] H01DZ3_A136BarColNum ;
   private String[] H01DZ3_A135BarColNom ;
   private int[] H01DZ3_A252CliCod ;
   private boolean[] H01DZ3_n252CliCod ;
   private String[] H01DZ3_A13711BarTipArtD ;
   private boolean[] H01DZ3_n13711BarTipArtD ;
   private String[] H01DZ3_A1652BarSerDsc ;
   private String[] H01DZ3_A212BarSer ;
   private String[] H01DZ3_A279CliNom ;
   private String[] H01DZ3_A13696BarNHdr ;
   private String[] H01DZ3_A143BarDisNum ;
   private String[] H01DZ3_A4812BarEncCli ;
   private String[] H01DZ3_A130BarCodPar ;
   private byte[] H01DZ3_A132BarCodReo ;
   private int[] H01DZ3_A129BarCod ;
   private String[] H01DZ3_A396EmprCod ;
   private int[] H01DZ4_A129BarCod ;
   private byte[] H01DZ4_A132BarCodReo ;
   private String[] H01DZ4_A130BarCodPar ;
   private String[] H01DZ4_A396EmprCod ;
   private byte[] H01DZ4_A153BarFasEst ;
   private short[] H01DZ4_A194BarOrdLin ;
   private String[] H01DZ4_A758ProCod ;
   private com.genexus.webpanels.WebSession AV82WebSession ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV23ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item16 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item17[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext12[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState28[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV21ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector14[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector15[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV59DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons11[] ;
}

final  class mantenimientodehdrs_wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01DZ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV107Mantenimientodehdrs_wcds_3_tfbarnhdr_sel ,
                                          String AV106Mantenimientodehdrs_wcds_2_tfbarnhdr ,
                                          String AV109Mantenimientodehdrs_wcds_5_tfclinom_sel ,
                                          String AV108Mantenimientodehdrs_wcds_4_tfclinom ,
                                          String AV113Mantenimientodehdrs_wcds_9_tfbarser_sel ,
                                          String AV112Mantenimientodehdrs_wcds_8_tfbarser ,
                                          String AV115Mantenimientodehdrs_wcds_11_tfbarserdsc_sel ,
                                          String AV114Mantenimientodehdrs_wcds_10_tfbarserdsc ,
                                          String AV117Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel ,
                                          String AV116Mantenimientodehdrs_wcds_12_tfbartipartdsc ,
                                          String AV119Mantenimientodehdrs_wcds_15_tfbarcolnom_sel ,
                                          String AV118Mantenimientodehdrs_wcds_14_tfbarcolnom ,
                                          int AV120Mantenimientodehdrs_wcds_16_tfbarcolnum ,
                                          int AV121Mantenimientodehdrs_wcds_17_tfbarcolnum_to ,
                                          java.util.Date AV122Mantenimientodehdrs_wcds_18_tfbarfecgen ,
                                          java.util.Date AV123Mantenimientodehdrs_wcds_19_tfbarfeccli ,
                                          java.util.Date AV124Mantenimientodehdrs_wcds_20_tfbarfecsal ,
                                          byte AV125Mantenimientodehdrs_wcds_21_tfbarsit ,
                                          byte AV126Mantenimientodehdrs_wcds_22_tfbarsit_to ,
                                          short AV128Mantenimientodehdrs_wcds_24_tfbarpart ,
                                          short AV129Mantenimientodehdrs_wcds_25_tfbarpart_to ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A13711BarTipArtD ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          java.util.Date A159BarFecGen ,
                                          java.util.Date A155BarFecCli ,
                                          java.util.Date A161BarFecSal ,
                                          byte A213BarSit ,
                                          short A1503BarPart ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV105Mantenimientodehdrs_wcds_1_filterfulltext ,
                                          String A13696BarNHdr ,
                                          String A13878PedidoClie ,
                                          String AV111Mantenimientodehdrs_wcds_7_tfpedidocliente_sel ,
                                          String AV110Mantenimientodehdrs_wcds_6_tfpedidocliente ,
                                          byte AV127Mantenimientodehdrs_wcds_23_tfhayrec_sel ,
                                          byte A13710HayRec ,
                                          int A252CliCod ,
                                          int AV65Clicod ,
                                          java.util.Date AV66Barfecgen ,
                                          java.util.Date AV67BarFecGen_to ,
                                          byte AV68Barsit ,
                                          byte AV69BarSit_to ,
                                          String A4812BarEncCli ,
                                          String AV70BarEnccli ,
                                          short AV72Enc20c ,
                                          String A143BarDisNum ,
                                          String AV71BarDisnum ,
                                          int AV95Barcod ,
                                          byte AV96BarCodReo ,
                                          String AV97BarCodPar ,
                                          String AV64Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int29 = new byte[40];
      Object[] GXv_Object30 = new Object[2];
      scmdbuf = "SELECT T1.BarTipArt AS BarTipArt, T1.BarPart, T1.BarExt, T1.BarPriTin, T1.DisCod, T1.BarSit, T1.BarFecSal, T1.BarFecCli, T1.BarFecGen, T1.BarColNum, T1.BarColNom," ;
      scmdbuf += " T1.CliCod, T2.TipArtDsc AS BarTipArtD, T1.BarSerDsc, T1.BarSer, T3.CliNom, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90')," ;
      scmdbuf += " 2))) || T1.BarCodPar AS BarNHdr, T1.BarDisNum, T1.BarEncCli, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod FROM ((TXPBARCAD T1 LEFT JOIN TXPTIPART T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.TipArtCod = T1.BarTipArt) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.CliCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      addWhere(sWhereString, "(T1.BarSit >= ?)");
      addWhere(sWhereString, "(T1.BarSit <= ?)");
      addWhere(sWhereString, "(T1.BarEncCli = ? and ? = 1 or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.BarDisNum = ? and (? = 0) or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.BarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodPar = ? or (rtrim(?) IS NULL))");
      if ( (GXutil.strcmp("", AV107Mantenimientodehdrs_wcds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV106Mantenimientodehdrs_wcds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Mantenimientodehdrs_wcds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int29[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Mantenimientodehdrs_wcds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV108Mantenimientodehdrs_wcds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Mantenimientodehdrs_wcds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int29[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Mantenimientodehdrs_wcds_9_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV112Mantenimientodehdrs_wcds_8_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Mantenimientodehdrs_wcds_9_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int29[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Mantenimientodehdrs_wcds_11_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV114Mantenimientodehdrs_wcds_10_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Mantenimientodehdrs_wcds_11_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int29[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV116Mantenimientodehdrs_wcds_12_tfbartipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipArtDsc = ?)");
      }
      else
      {
         GXv_int29[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Mantenimientodehdrs_wcds_15_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV118Mantenimientodehdrs_wcds_14_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Mantenimientodehdrs_wcds_15_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int29[30] = (byte)(1) ;
      }
      if ( ! (0==AV120Mantenimientodehdrs_wcds_16_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int29[31] = (byte)(1) ;
      }
      if ( ! (0==AV121Mantenimientodehdrs_wcds_17_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int29[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV122Mantenimientodehdrs_wcds_18_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int29[33] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV123Mantenimientodehdrs_wcds_19_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int29[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV124Mantenimientodehdrs_wcds_20_tfbarfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int29[35] = (byte)(1) ;
      }
      if ( ! (0==AV125Mantenimientodehdrs_wcds_21_tfbarsit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int29[36] = (byte)(1) ;
      }
      if ( ! (0==AV126Mantenimientodehdrs_wcds_22_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int29[37] = (byte)(1) ;
      }
      if ( ! (0==AV128Mantenimientodehdrs_wcds_24_tfbarpart) )
      {
         addWhere(sWhereString, "(T1.BarPart >= ?)");
      }
      else
      {
         GXv_int29[38] = (byte)(1) ;
      }
      if ( ! (0==AV129Mantenimientodehdrs_wcds_25_tfbarpart_to) )
      {
         addWhere(sWhereString, "(T1.BarPart <= ?)");
      }
      else
      {
         GXv_int29[39] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSer" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSer DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.TipArtDsc" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.TipArtDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNom" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNum" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecGen" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecGen DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecCli" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecCli DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecSal" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecSal DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSit" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSit DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarPart" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarPart DESC" ;
      }
      GXv_Object30[0] = scmdbuf ;
      GXv_Object30[1] = GXv_int29 ;
      return GXv_Object30 ;
   }

   protected Object[] conditional_H01DZ3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV107Mantenimientodehdrs_wcds_3_tfbarnhdr_sel ,
                                          String AV106Mantenimientodehdrs_wcds_2_tfbarnhdr ,
                                          String AV109Mantenimientodehdrs_wcds_5_tfclinom_sel ,
                                          String AV108Mantenimientodehdrs_wcds_4_tfclinom ,
                                          String AV113Mantenimientodehdrs_wcds_9_tfbarser_sel ,
                                          String AV112Mantenimientodehdrs_wcds_8_tfbarser ,
                                          String AV115Mantenimientodehdrs_wcds_11_tfbarserdsc_sel ,
                                          String AV114Mantenimientodehdrs_wcds_10_tfbarserdsc ,
                                          String AV117Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel ,
                                          String AV116Mantenimientodehdrs_wcds_12_tfbartipartdsc ,
                                          String AV119Mantenimientodehdrs_wcds_15_tfbarcolnom_sel ,
                                          String AV118Mantenimientodehdrs_wcds_14_tfbarcolnom ,
                                          int AV120Mantenimientodehdrs_wcds_16_tfbarcolnum ,
                                          int AV121Mantenimientodehdrs_wcds_17_tfbarcolnum_to ,
                                          java.util.Date AV122Mantenimientodehdrs_wcds_18_tfbarfecgen ,
                                          java.util.Date AV123Mantenimientodehdrs_wcds_19_tfbarfeccli ,
                                          java.util.Date AV124Mantenimientodehdrs_wcds_20_tfbarfecsal ,
                                          byte AV125Mantenimientodehdrs_wcds_21_tfbarsit ,
                                          byte AV126Mantenimientodehdrs_wcds_22_tfbarsit_to ,
                                          short AV128Mantenimientodehdrs_wcds_24_tfbarpart ,
                                          short AV129Mantenimientodehdrs_wcds_25_tfbarpart_to ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A13711BarTipArtD ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          java.util.Date A159BarFecGen ,
                                          java.util.Date A155BarFecCli ,
                                          java.util.Date A161BarFecSal ,
                                          byte A213BarSit ,
                                          short A1503BarPart ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV105Mantenimientodehdrs_wcds_1_filterfulltext ,
                                          String A13696BarNHdr ,
                                          String A13878PedidoClie ,
                                          String AV111Mantenimientodehdrs_wcds_7_tfpedidocliente_sel ,
                                          String AV110Mantenimientodehdrs_wcds_6_tfpedidocliente ,
                                          byte AV127Mantenimientodehdrs_wcds_23_tfhayrec_sel ,
                                          byte A13710HayRec ,
                                          int A252CliCod ,
                                          int AV65Clicod ,
                                          java.util.Date AV66Barfecgen ,
                                          java.util.Date AV67BarFecGen_to ,
                                          byte AV68Barsit ,
                                          byte AV69BarSit_to ,
                                          String A4812BarEncCli ,
                                          String AV70BarEnccli ,
                                          short AV72Enc20c ,
                                          String A143BarDisNum ,
                                          String AV71BarDisnum ,
                                          int AV95Barcod ,
                                          byte AV96BarCodReo ,
                                          String AV97BarCodPar ,
                                          String AV64Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int31 = new byte[40];
      Object[] GXv_Object32 = new Object[2];
      scmdbuf = "SELECT T1.BarTipArt AS BarTipArt, T1.BarPart, T1.BarExt, T1.BarPriTin, T1.DisCod, T1.BarSit, T1.BarFecSal, T1.BarFecCli, T1.BarFecGen, T1.BarColNum, T1.BarColNom," ;
      scmdbuf += " T1.CliCod, T2.TipArtDsc AS BarTipArtD, T1.BarSerDsc, T1.BarSer, T3.CliNom, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90')," ;
      scmdbuf += " 2))) || T1.BarCodPar AS BarNHdr, T1.BarDisNum, T1.BarEncCli, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod FROM ((TXPBARCAD T1 LEFT JOIN TXPTIPART T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.TipArtCod = T1.BarTipArt) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.CliCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      addWhere(sWhereString, "(T1.BarSit >= ?)");
      addWhere(sWhereString, "(T1.BarSit <= ?)");
      addWhere(sWhereString, "(T1.BarEncCli = ? and ? = 1 or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.BarDisNum = ? and (? = 0) or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.BarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodPar = ? or (rtrim(?) IS NULL))");
      if ( (GXutil.strcmp("", AV107Mantenimientodehdrs_wcds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV106Mantenimientodehdrs_wcds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Mantenimientodehdrs_wcds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int31[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Mantenimientodehdrs_wcds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV108Mantenimientodehdrs_wcds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Mantenimientodehdrs_wcds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int31[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Mantenimientodehdrs_wcds_9_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV112Mantenimientodehdrs_wcds_8_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Mantenimientodehdrs_wcds_9_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int31[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Mantenimientodehdrs_wcds_11_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV114Mantenimientodehdrs_wcds_10_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Mantenimientodehdrs_wcds_11_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int31[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV116Mantenimientodehdrs_wcds_12_tfbartipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipArtDsc = ?)");
      }
      else
      {
         GXv_int31[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Mantenimientodehdrs_wcds_15_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV118Mantenimientodehdrs_wcds_14_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Mantenimientodehdrs_wcds_15_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int31[30] = (byte)(1) ;
      }
      if ( ! (0==AV120Mantenimientodehdrs_wcds_16_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int31[31] = (byte)(1) ;
      }
      if ( ! (0==AV121Mantenimientodehdrs_wcds_17_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int31[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV122Mantenimientodehdrs_wcds_18_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int31[33] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV123Mantenimientodehdrs_wcds_19_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int31[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV124Mantenimientodehdrs_wcds_20_tfbarfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int31[35] = (byte)(1) ;
      }
      if ( ! (0==AV125Mantenimientodehdrs_wcds_21_tfbarsit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int31[36] = (byte)(1) ;
      }
      if ( ! (0==AV126Mantenimientodehdrs_wcds_22_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int31[37] = (byte)(1) ;
      }
      if ( ! (0==AV128Mantenimientodehdrs_wcds_24_tfbarpart) )
      {
         addWhere(sWhereString, "(T1.BarPart >= ?)");
      }
      else
      {
         GXv_int31[38] = (byte)(1) ;
      }
      if ( ! (0==AV129Mantenimientodehdrs_wcds_25_tfbarpart_to) )
      {
         addWhere(sWhereString, "(T1.BarPart <= ?)");
      }
      else
      {
         GXv_int31[39] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSer" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSer DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.TipArtDsc" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.TipArtDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNom" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNum" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecGen" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecGen DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecCli" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecCli DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecSal" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecSal DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSit" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSit DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarPart" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarPart DESC" ;
      }
      GXv_Object32[0] = scmdbuf ;
      GXv_Object32[1] = GXv_int31 ;
      return GXv_Object32 ;
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
                  return conditional_H01DZ2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (java.util.Date)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , (java.util.Date)dynConstraints[30] , (java.util.Date)dynConstraints[31] , (java.util.Date)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() , ((Number) dynConstraints[34]).shortValue() , ((Number) dynConstraints[35]).shortValue() , ((Boolean) dynConstraints[36]).booleanValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).byteValue() , ((Number) dynConstraints[43]).byteValue() , ((Number) dynConstraints[44]).intValue() , ((Number) dynConstraints[45]).intValue() , (java.util.Date)dynConstraints[46] , (java.util.Date)dynConstraints[47] , ((Number) dynConstraints[48]).byteValue() , ((Number) dynConstraints[49]).byteValue() , (String)dynConstraints[50] , (String)dynConstraints[51] , ((Number) dynConstraints[52]).shortValue() , (String)dynConstraints[53] , (String)dynConstraints[54] , ((Number) dynConstraints[55]).intValue() , ((Number) dynConstraints[56]).byteValue() , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] );
            case 1 :
                  return conditional_H01DZ3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (java.util.Date)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , (java.util.Date)dynConstraints[30] , (java.util.Date)dynConstraints[31] , (java.util.Date)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() , ((Number) dynConstraints[34]).shortValue() , ((Number) dynConstraints[35]).shortValue() , ((Boolean) dynConstraints[36]).booleanValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).byteValue() , ((Number) dynConstraints[43]).byteValue() , ((Number) dynConstraints[44]).intValue() , ((Number) dynConstraints[45]).intValue() , (java.util.Date)dynConstraints[46] , (java.util.Date)dynConstraints[47] , ((Number) dynConstraints[48]).byteValue() , ((Number) dynConstraints[49]).byteValue() , (String)dynConstraints[50] , (String)dynConstraints[51] , ((Number) dynConstraints[52]).shortValue() , (String)dynConstraints[53] , (String)dynConstraints[54] , ((Number) dynConstraints[55]).intValue() , ((Number) dynConstraints[56]).byteValue() , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01DZ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01DZ3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01DZ4", "SELECT BarCod, BarCodReo, BarCodPar, EmprCod, BarFasEst, BarOrdLin, ProCod FROM TXPBARFAS ORDER BY ProCod, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(4);
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(7);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(8);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(9);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((String[]) buf[12])[0] = rslt.getString(11, 13);
               ((int[]) buf[13])[0] = rslt.getInt(12);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(14, 26);
               ((String[]) buf[18])[0] = rslt.getString(15, 16);
               ((String[]) buf[19])[0] = rslt.getString(16, 30);
               ((String[]) buf[20])[0] = rslt.getString(17, 11);
               ((String[]) buf[21])[0] = rslt.getString(18, 8);
               ((String[]) buf[22])[0] = rslt.getString(19, 20);
               ((String[]) buf[23])[0] = rslt.getString(20, 1);
               ((byte[]) buf[24])[0] = rslt.getByte(21);
               ((int[]) buf[25])[0] = rslt.getInt(22);
               ((String[]) buf[26])[0] = rslt.getString(23, 3);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(4);
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(7);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(8);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(9);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((String[]) buf[12])[0] = rslt.getString(11, 13);
               ((int[]) buf[13])[0] = rslt.getInt(12);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(14, 26);
               ((String[]) buf[18])[0] = rslt.getString(15, 16);
               ((String[]) buf[19])[0] = rslt.getString(16, 30);
               ((String[]) buf[20])[0] = rslt.getString(17, 11);
               ((String[]) buf[21])[0] = rslt.getString(18, 8);
               ((String[]) buf[22])[0] = rslt.getString(19, 20);
               ((String[]) buf[23])[0] = rslt.getString(20, 1);
               ((byte[]) buf[24])[0] = rslt.getByte(21);
               ((int[]) buf[25])[0] = rslt.getInt(22);
               ((String[]) buf[26])[0] = rslt.getString(23, 3);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
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
                  stmt.setString(sIdx, (String)parms[40], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[43]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[44]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[45]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[46]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 20);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 20);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[51]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 8);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[55]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[56]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 1);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 11);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 11);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 16);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[73]);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[74]);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[75]);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[76]).byteValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[77]).byteValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[78]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[79]).shortValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[43]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[44]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[45]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[46]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 20);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 20);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[51]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 8);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[55]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[56]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 1);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 11);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 11);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 16);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[73]);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[74]);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[75]);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[76]).byteValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[77]).byteValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[78]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[79]).shortValue());
               }
               return;
      }
   }

}

