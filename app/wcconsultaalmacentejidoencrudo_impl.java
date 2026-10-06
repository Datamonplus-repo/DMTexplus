package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcconsultaalmacentejidoencrudo_impl extends GXWebComponent
{
   public wcconsultaalmacentejidoencrudo_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wcconsultaalmacentejidoencrudo_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcconsultaalmacentejidoencrudo_impl.class ));
   }

   public wcconsultaalmacentejidoencrudo_impl( int remoteHandle ,
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
      cmbAlbRReo = new HTMLChoice();
      cmbAlbRUni = new HTMLChoice();
      cmbAlbREst = new HTMLChoice();
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
               AV67Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67Emprcod", AV67Emprcod);
               AV68Albrfen = localUtil.parseDateParm( httpContext.GetPar( "Albrfen")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68Albrfen", localUtil.format(AV68Albrfen, "99/99/99"));
               AV69Albrfen_to = localUtil.parseDateParm( httpContext.GetPar( "Albrfen_to")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69Albrfen_to", localUtil.format(AV69Albrfen_to, "99/99/99"));
               AV70Clicod = (int)(GXutil.lval( httpContext.GetPar( "Clicod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70Clicod), 6, 0));
               AV71Clicod_to = (int)(GXutil.lval( httpContext.GetPar( "Clicod_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71Clicod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71Clicod_to), 6, 0));
               AV72AlbRef = httpContext.GetPar( "AlbRef") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72AlbRef", AV72AlbRef);
               AV88albref_to = httpContext.GetPar( "albref_to") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88albref_to", AV88albref_to);
               AV80Procecod = (short)(GXutil.lval( httpContext.GetPar( "Procecod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80Procecod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80Procecod), 4, 0));
               AV81ProceCod_to = (short)(GXutil.lval( httpContext.GetPar( "ProceCod_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81ProceCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81ProceCod_to), 4, 0));
               AV73AlbRReo = httpContext.GetPar( "AlbRReo") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73AlbRReo", AV73AlbRReo);
               AV74AlbREst = (byte)(GXutil.lval( httpContext.GetPar( "AlbREst"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74AlbREst", GXutil.str( AV74AlbREst, 1, 0));
               AV90TipEntCod = (short)(GXutil.lval( httpContext.GetPar( "TipEntCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV90TipEntCod), 4, 0));
               AV89AlbRuni = httpContext.GetPar( "AlbRuni") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89AlbRuni", AV89AlbRuni);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV67Emprcod,AV68Albrfen,AV69Albrfen_to,Integer.valueOf(AV70Clicod),Integer.valueOf(AV71Clicod_to),AV72AlbRef,AV88albref_to,Short.valueOf(AV80Procecod),Short.valueOf(AV81ProceCod_to),AV73AlbRReo,Byte.valueOf(AV74AlbREst),Short.valueOf(AV90TipEntCod),AV89AlbRuni});
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
      AV67Emprcod = httpContext.GetPar( "Emprcod") ;
      AV68Albrfen = localUtil.parseDateParm( httpContext.GetPar( "Albrfen")) ;
      AV69Albrfen_to = localUtil.parseDateParm( httpContext.GetPar( "Albrfen_to")) ;
      AV70Clicod = (int)(GXutil.lval( httpContext.GetPar( "Clicod"))) ;
      AV71Clicod_to = (int)(GXutil.lval( httpContext.GetPar( "Clicod_to"))) ;
      AV72AlbRef = httpContext.GetPar( "AlbRef") ;
      AV88albref_to = httpContext.GetPar( "albref_to") ;
      AV80Procecod = (short)(GXutil.lval( httpContext.GetPar( "Procecod"))) ;
      AV81ProceCod_to = (short)(GXutil.lval( httpContext.GetPar( "ProceCod_to"))) ;
      AV73AlbRReo = httpContext.GetPar( "AlbRReo") ;
      AV74AlbREst = (byte)(GXutil.lval( httpContext.GetPar( "AlbREst"))) ;
      AV90TipEntCod = (short)(GXutil.lval( httpContext.GetPar( "TipEntCod"))) ;
      AV89AlbRuni = httpContext.GetPar( "AlbRuni") ;
      AV25ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV20ColumnsSelector);
      AV14FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV26TFAlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "TFAlbRecCod"))) ;
      AV27TFAlbRecCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFAlbRecCod_To"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV78TFAlbRReo_Sels);
      AV33TFAlbRFen = localUtil.parseDateParm( httpContext.GetPar( "TFAlbRFen")) ;
      AV37TFCliCod = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod"))) ;
      AV38TFCliCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod_To"))) ;
      AV39TFCliNom = httpContext.GetPar( "TFCliNom") ;
      AV40TFCliNom_Sel = httpContext.GetPar( "TFCliNom_Sel") ;
      AV41TFAlbRef = httpContext.GetPar( "TFAlbRef") ;
      AV42TFAlbRef_Sel = httpContext.GetPar( "TFAlbRef_Sel") ;
      AV43TFAlbRefDsc = httpContext.GetPar( "TFAlbRefDsc") ;
      AV44TFAlbRefDsc_Sel = httpContext.GetPar( "TFAlbRefDsc_Sel") ;
      AV45TFAlbRDisCli = httpContext.GetPar( "TFAlbRDisCli") ;
      AV46TFAlbRDisCli_Sel = httpContext.GetPar( "TFAlbRDisCli_Sel") ;
      AV47TFAlbRTartD = httpContext.GetPar( "TFAlbRTartD") ;
      AV48TFAlbRTartD_Sel = httpContext.GetPar( "TFAlbRTartD_Sel") ;
      AV49TFAlbRLote = httpContext.GetPar( "TFAlbRLote") ;
      AV50TFAlbRLote_Sel = httpContext.GetPar( "TFAlbRLote_Sel") ;
      AV51TFAlbRLoc = httpContext.GetPar( "TFAlbRLoc") ;
      AV52TFAlbRLoc_Sel = httpContext.GetPar( "TFAlbRLoc_Sel") ;
      AV53TFAlbRPieEnt = (int)(GXutil.lval( httpContext.GetPar( "TFAlbRPieEnt"))) ;
      AV54TFAlbRPieEnt_To = (int)(GXutil.lval( httpContext.GetPar( "TFAlbRPieEnt_To"))) ;
      AV55TFAlbRPieUti = (int)(GXutil.lval( httpContext.GetPar( "TFAlbRPieUti"))) ;
      AV56TFAlbRPieUti_To = (int)(GXutil.lval( httpContext.GetPar( "TFAlbRPieUti_To"))) ;
      AV57TFAlbRPieDis = (int)(GXutil.lval( httpContext.GetPar( "TFAlbRPieDis"))) ;
      AV58TFAlbRPieDis_To = (int)(GXutil.lval( httpContext.GetPar( "TFAlbRPieDis_To"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV60TFAlbRUni_Sels);
      AV61TFAlbRUniEnt = CommonUtil.decimalVal( httpContext.GetPar( "TFAlbRUniEnt"), ".") ;
      AV62TFAlbRUniEnt_To = CommonUtil.decimalVal( httpContext.GetPar( "TFAlbRUniEnt_To"), ".") ;
      AV63TFAlbRUniUti = CommonUtil.decimalVal( httpContext.GetPar( "TFAlbRUniUti"), ".") ;
      AV64TFAlbRUniUti_To = CommonUtil.decimalVal( httpContext.GetPar( "TFAlbRUniUti_To"), ".") ;
      AV65TFAlbRUniDis = CommonUtil.decimalVal( httpContext.GetPar( "TFAlbRUniDis"), ".") ;
      AV66TFAlbRUniDis_To = CommonUtil.decimalVal( httpContext.GetPar( "TFAlbRUniDis_To"), ".") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV76TFAlbREst_Sels);
      AV82TFProceNom = httpContext.GetPar( "TFProceNom") ;
      AV83TFProceNom_Sel = httpContext.GetPar( "TFProceNom_Sel") ;
      AV84TFComposicion = httpContext.GetPar( "TFComposicion") ;
      AV85TFComposicion_Sel = httpContext.GetPar( "TFComposicion_Sel") ;
      AV91TFTipEntNom = httpContext.GetPar( "TFTipEntNom") ;
      AV92TFTipEntNom_Sel = httpContext.GetPar( "TFTipEntNom_Sel") ;
      AV93TFAlbRDes = httpContext.GetPar( "TFAlbRDes") ;
      AV94TFAlbRDes_Sel = httpContext.GetPar( "TFAlbRDes_Sel") ;
      AV97Pgmname = httpContext.GetPar( "Pgmname") ;
      AV32OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV12OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV67Emprcod, AV68Albrfen, AV69Albrfen_to, AV70Clicod, AV71Clicod_to, AV72AlbRef, AV88albref_to, AV80Procecod, AV81ProceCod_to, AV73AlbRReo, AV74AlbREst, AV90TipEntCod, AV89AlbRuni, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV14FilterFullText, AV26TFAlbRecCod, AV27TFAlbRecCod_To, AV78TFAlbRReo_Sels, AV33TFAlbRFen, AV37TFCliCod, AV38TFCliCod_To, AV39TFCliNom, AV40TFCliNom_Sel, AV41TFAlbRef, AV42TFAlbRef_Sel, AV43TFAlbRefDsc, AV44TFAlbRefDsc_Sel, AV45TFAlbRDisCli, AV46TFAlbRDisCli_Sel, AV47TFAlbRTartD, AV48TFAlbRTartD_Sel, AV49TFAlbRLote, AV50TFAlbRLote_Sel, AV51TFAlbRLoc, AV52TFAlbRLoc_Sel, AV53TFAlbRPieEnt, AV54TFAlbRPieEnt_To, AV55TFAlbRPieUti, AV56TFAlbRPieUti_To, AV57TFAlbRPieDis, AV58TFAlbRPieDis_To, AV60TFAlbRUni_Sels, AV61TFAlbRUniEnt, AV62TFAlbRUniEnt_To, AV63TFAlbRUniUti, AV64TFAlbRUniUti_To, AV65TFAlbRUniDis, AV66TFAlbRUniDis_To, AV76TFAlbREst_Sels, AV82TFProceNom, AV83TFProceNom_Sel, AV84TFComposicion, AV85TFComposicion_Sel, AV91TFTipEntNom, AV92TFTipEntNom_Sel, AV93TFAlbRDes, AV94TFAlbRDes_Sel, AV97Pgmname, AV32OrderedBy, AV12OrderedDsc, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1662( ) ;
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
         httpContext.writeValue( httpContext.getMessage( " Entrada Tejido Crudo Almacen", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.wcconsultaalmacentejidoencrudo", new String[] {GXutil.URLEncode(GXutil.rtrim(AV67Emprcod)),GXutil.URLEncode(GXutil.formatDateParm(AV68Albrfen)),GXutil.URLEncode(GXutil.formatDateParm(AV69Albrfen_to)),GXutil.URLEncode(GXutil.ltrimstr(AV70Clicod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV71Clicod_to,6,0)),GXutil.URLEncode(GXutil.rtrim(AV72AlbRef)),GXutil.URLEncode(GXutil.rtrim(AV88albref_to)),GXutil.URLEncode(GXutil.ltrimstr(AV80Procecod,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV81ProceCod_to,4,0)),GXutil.URLEncode(GXutil.rtrim(AV73AlbRReo)),GXutil.URLEncode(GXutil.ltrimstr(AV74AlbREst,1,0)),GXutil.URLEncode(GXutil.ltrimstr(AV90TipEntCod,4,0)),GXutil.URLEncode(GXutil.rtrim(AV89AlbRuni))}, new String[] {"Emprcod","Albrfen","Albrfen_to","Clicod","Clicod_to","AlbRef","albref_to","Procecod","ProceCod_to","AlbRReo","AlbREst","TipEntCod","AlbRuni"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"WCConsultaAlmacenTejidoencrudo");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV97Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("wcconsultaalmacentejidoencrudo:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV30GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV31GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV28DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV28DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV20ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV20ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV67Emprcod", GXutil.rtrim( wcpOAV67Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV68Albrfen", localUtil.dtoc( wcpOAV68Albrfen, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV69Albrfen_to", localUtil.dtoc( wcpOAV69Albrfen_to, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV70Clicod", GXutil.ltrim( localUtil.ntoc( wcpOAV70Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV71Clicod_to", GXutil.ltrim( localUtil.ntoc( wcpOAV71Clicod_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV72AlbRef", GXutil.rtrim( wcpOAV72AlbRef));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV88albref_to", GXutil.rtrim( wcpOAV88albref_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV80Procecod", GXutil.ltrim( localUtil.ntoc( wcpOAV80Procecod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV81ProceCod_to", GXutil.ltrim( localUtil.ntoc( wcpOAV81ProceCod_to, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV73AlbRReo", GXutil.rtrim( wcpOAV73AlbRReo));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV74AlbREst", GXutil.ltrim( localUtil.ntoc( wcpOAV74AlbREst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV90TipEntCod", GXutil.ltrim( localUtil.ntoc( wcpOAV90TipEntCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV89AlbRuni", GXutil.rtrim( wcpOAV89AlbRuni));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV25ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBRECCOD", GXutil.ltrim( localUtil.ntoc( AV26TFAlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBRECCOD_TO", GXutil.ltrim( localUtil.ntoc( AV27TFAlbRecCod_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vTFALBRREO_SELS", AV78TFAlbRReo_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vTFALBRREO_SELS", AV78TFAlbRReo_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBRFEN", localUtil.dtoc( AV33TFAlbRFen, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLICOD", GXutil.ltrim( localUtil.ntoc( AV37TFCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV38TFCliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLINOM", GXutil.rtrim( AV39TFCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLINOM_SEL", GXutil.rtrim( AV40TFCliNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBREF", GXutil.rtrim( AV41TFAlbRef));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBREF_SEL", GXutil.rtrim( AV42TFAlbRef_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBREFDSC", GXutil.rtrim( AV43TFAlbRefDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBREFDSC_SEL", GXutil.rtrim( AV44TFAlbRefDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBRDISCLI", GXutil.rtrim( AV45TFAlbRDisCli));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBRDISCLI_SEL", GXutil.rtrim( AV46TFAlbRDisCli_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBRTARTD", GXutil.rtrim( AV47TFAlbRTartD));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBRTARTD_SEL", GXutil.rtrim( AV48TFAlbRTartD_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBRLOTE", GXutil.rtrim( AV49TFAlbRLote));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBRLOTE_SEL", GXutil.rtrim( AV50TFAlbRLote_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBRLOC", GXutil.rtrim( AV51TFAlbRLoc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBRLOC_SEL", GXutil.rtrim( AV52TFAlbRLoc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBRPIEENT", GXutil.ltrim( localUtil.ntoc( AV53TFAlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBRPIEENT_TO", GXutil.ltrim( localUtil.ntoc( AV54TFAlbRPieEnt_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBRPIEUTI", GXutil.ltrim( localUtil.ntoc( AV55TFAlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBRPIEUTI_TO", GXutil.ltrim( localUtil.ntoc( AV56TFAlbRPieUti_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBRPIEDIS", GXutil.ltrim( localUtil.ntoc( AV57TFAlbRPieDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBRPIEDIS_TO", GXutil.ltrim( localUtil.ntoc( AV58TFAlbRPieDis_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vTFALBRUNI_SELS", AV60TFAlbRUni_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vTFALBRUNI_SELS", AV60TFAlbRUni_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBRUNIENT", GXutil.ltrim( localUtil.ntoc( AV61TFAlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBRUNIENT_TO", GXutil.ltrim( localUtil.ntoc( AV62TFAlbRUniEnt_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBRUNIUTI", GXutil.ltrim( localUtil.ntoc( AV63TFAlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBRUNIUTI_TO", GXutil.ltrim( localUtil.ntoc( AV64TFAlbRUniUti_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBRUNIDIS", GXutil.ltrim( localUtil.ntoc( AV65TFAlbRUniDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBRUNIDIS_TO", GXutil.ltrim( localUtil.ntoc( AV66TFAlbRUniDis_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vTFALBREST_SELS", AV76TFAlbREst_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vTFALBREST_SELS", AV76TFAlbREst_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPROCENOM", GXutil.rtrim( AV82TFProceNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPROCENOM_SEL", GXutil.rtrim( AV83TFProceNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCOMPOSICION", GXutil.rtrim( AV84TFComposicion));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCOMPOSICION_SEL", GXutil.rtrim( AV85TFComposicion_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFTIPENTNOM", GXutil.rtrim( AV91TFTipEntNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFTIPENTNOM_SEL", GXutil.rtrim( AV92TFTipEntNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBRDES", GXutil.rtrim( AV93TFAlbRDes));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBRDES_SEL", GXutil.rtrim( AV94TFAlbRDes_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV32OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV12OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV67Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBRFEN", localUtil.dtoc( AV68Albrfen, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBRFEN_TO", localUtil.dtoc( AV69Albrfen_to, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD", GXutil.ltrim( localUtil.ntoc( AV70Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV71Clicod_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBREF", GXutil.rtrim( AV72AlbRef));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBREF_TO", GXutil.rtrim( AV88albref_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPROCECOD", GXutil.ltrim( localUtil.ntoc( AV80Procecod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPROCECOD_TO", GXutil.ltrim( localUtil.ntoc( AV81ProceCod_to, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBRREO", GXutil.rtrim( AV73AlbRReo));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBREST", GXutil.ltrim( localUtil.ntoc( AV74AlbREst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPENTCOD", GXutil.ltrim( localUtil.ntoc( AV90TipEntCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBRUNI", GXutil.rtrim( AV89AlbRuni));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"ALBRENT", GXutil.rtrim( A46AlbREnt));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"ALBRENT2", GXutil.rtrim( A5806AlbREnt2));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV10GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBRREO_SELSJSON", AV77TFAlbRReo_SelsJson);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBRUNI_SELSJSON", AV59TFAlbRUni_SelsJson);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBREST_SELSJSON", AV75TFAlbREst_SelsJson);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Allowmultipleselection", GXutil.rtrim( Ddo_grid_Allowmultipleselection));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalistfixedvalues", GXutil.rtrim( Ddo_grid_Datalistfixedvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption", GXutil.rtrim( Ddo_gridcolumnsselector_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip", GXutil.rtrim( Ddo_gridcolumnsselector_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls", GXutil.rtrim( Ddo_gridcolumnsselector_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype", GXutil.rtrim( Ddo_gridcolumnsselector_Dropdownoptionstype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname", GXutil.rtrim( Ddo_gridcolumnsselector_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace", GXutil.rtrim( Ddo_gridcolumnsselector_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DETAILWEBCOMPONENT_MODAL_Width", GXutil.rtrim( Detailwebcomponent_modal_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DETAILWEBCOMPONENT_MODAL_Title", GXutil.rtrim( Detailwebcomponent_modal_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DETAILWEBCOMPONENT_MODAL_Confirmtype", GXutil.rtrim( Detailwebcomponent_modal_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DETAILWEBCOMPONENT_MODAL_Bodytype", GXutil.rtrim( Detailwebcomponent_modal_Bodytype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_TITLESCATEGORIES_Gridinternalname", GXutil.rtrim( Grid_titlescategories_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_TITLESCATEGORIES_Gridtitlescategories", GXutil.rtrim( Grid_titlescategories_Gridtitlescategories));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hascategories", GXutil.booltostr( Grid_empowerer_Hascategories));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
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
   }

   public void renderHtmlCloseForm1662( )
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
         if ( ! ( WebComp_Grid_dwc == null ) )
         {
            WebComp_Grid_dwc.componentjscripts();
         }
         if ( ! ( WebComp_Wwpaux_wc == null ) )
         {
            WebComp_Wwpaux_wc.componentjscripts();
         }
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
      return "WCConsultaAlmacenTejidoencrudo" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Entrada Tejido Crudo Almacen", "") ;
   }

   public void wb1660( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.wcconsultaalmacentejidoencrudo");
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
            httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCConsultaAlmacenTejidoencrudo.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCConsultaAlmacenTejidoencrudo.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCConsultaAlmacenTejidoencrudo.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_23_1662( true) ;
      }
      else
      {
         wb_table1_23_1662( false) ;
      }
      return  ;
   }

   public void wb_table1_23_1662e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV30GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV31GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, sPrefix+"GRIDPAGINATIONBARContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divCell_grid_dwc_Internalname, 1, 0, "px", 0, "px", divCell_grid_dwc_Class, "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"W0073"+"", GXutil.rtrim( WebComp_Grid_dwc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+sPrefix+"gxHTMLWrpW0073"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_41_Refreshing )
            {
               if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldGrid_dwc), GXutil.lower( WebComp_Grid_dwc_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp(sPrefix+"gxHTMLWrpW0073"+"");
                  }
                  WebComp_Grid_dwc.componentdraw();
                  if ( GXutil.strcmp(GXutil.lower( OldGrid_dwc), GXutil.lower( WebComp_Grid_dwc_Component)) != 0 )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV97Pgmname), GXutil.rtrim( localUtil.format( AV97Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WCConsultaAlmacenTejidoencrudo.htm");
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
         ucDdo_grid.setProperty("Fixable", Ddo_grid_Fixable);
         ucDdo_grid.setProperty("IncludeFilter", Ddo_grid_Includefilter);
         ucDdo_grid.setProperty("FilterType", Ddo_grid_Filtertype);
         ucDdo_grid.setProperty("FilterIsRange", Ddo_grid_Filterisrange);
         ucDdo_grid.setProperty("IncludeDataList", Ddo_grid_Includedatalist);
         ucDdo_grid.setProperty("DataListType", Ddo_grid_Datalisttype);
         ucDdo_grid.setProperty("AllowMultipleSelection", Ddo_grid_Allowmultipleselection);
         ucDdo_grid.setProperty("DataListFixedValues", Ddo_grid_Datalistfixedvalues);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV28DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV28DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV20ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         wb_table2_83_1662( true) ;
      }
      else
      {
         wb_table2_83_1662( false) ;
      }
      return  ;
   }

   public void wb_table2_83_1662e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_titlescategories.setProperty("GridTitlesCategories", Grid_titlescategories_Gridtitlescategories);
         ucGrid_titlescategories.render(context, "dvelop.gridtitlescategories", Grid_titlescategories_Internalname, sPrefix+"GRID_TITLESCATEGORIESContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasCategories", Grid_empowerer_Hascategories);
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDiv_wwpauxwc_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"W0091"+"", GXutil.rtrim( WebComp_Wwpaux_wc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+sPrefix+"gxHTMLWrpW0091"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_41_Refreshing )
            {
               if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldWwpaux_wc), GXutil.lower( WebComp_Wwpaux_wc_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp(sPrefix+"gxHTMLWrpW0091"+"");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_albrfenauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'" + sPrefix + "',false,'" + sGXsfl_41_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_albrfenauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_albrfenauxdate_Internalname, localUtil.format(AV35DDO_AlbRFenAuxDate, "99/99/99"), localUtil.format( AV35DDO_AlbRFenAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,93);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_albrfenauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WCConsultaAlmacenTejidoencrudo.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_albrfenauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WCConsultaAlmacenTejidoencrudo.htm");
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

   public void start1662( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( " Entrada Tejido Crudo Almacen", ""), (short)(0)) ;
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
            strup1660( ) ;
         }
      }
   }

   public void ws1662( )
   {
      start1662( ) ;
      evt1662( ) ;
   }

   public void evt1662( )
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
                              strup1660( ) ;
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
                              strup1660( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e111662 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1660( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e121662 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1660( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e131662 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1660( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e141662 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1660( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e151662 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DETAILWEBCOMPONENT_MODAL.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1660( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e161662 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1660( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e171662 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1660( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e181662 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1660( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavDetailwebcomponent_Internalname ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1660( ) ;
                           }
                           nGXsfl_41_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_412( ) ;
                           AV79DetailWebComponent = httpContext.cgiGet( edtavDetailwebcomponent_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDetailwebcomponent_Internalname, AV79DetailWebComponent);
                           A44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           cmbAlbRReo.setName( cmbAlbRReo.getInternalname() );
                           cmbAlbRReo.setValue( httpContext.cgiGet( cmbAlbRReo.getInternalname()) );
                           A55AlbRReo = httpContext.cgiGet( cmbAlbRReo.getInternalname()) ;
                           A49AlbRFen = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtAlbRFen_Internalname), 0)) ;
                           AV15AlbREnt2 = httpContext.cgiGet( edtavAlbrent2_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavAlbrent2_Internalname, AV15AlbREnt2);
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           A45AlbRef = httpContext.cgiGet( edtAlbRef_Internalname) ;
                           A3613AlbRefDsc = httpContext.cgiGet( edtAlbRefDsc_Internalname) ;
                           A3359AlbRDisCli = httpContext.cgiGet( edtAlbRDisCli_Internalname) ;
                           A6264AlbRTartD = httpContext.cgiGet( edtAlbRTartD_Internalname) ;
                           n6264AlbRTartD = false ;
                           A6463AlbRLote = httpContext.cgiGet( edtAlbRLote_Internalname) ;
                           A50AlbRLoc = httpContext.cgiGet( edtAlbRLoc_Internalname) ;
                           A52AlbRPieEnt = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A54AlbRPieUti = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieUti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A51AlbRPieDis = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieDis_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           cmbAlbRUni.setName( cmbAlbRUni.getInternalname() );
                           cmbAlbRUni.setValue( httpContext.cgiGet( cmbAlbRUni.getInternalname()) );
                           A56AlbRUni = httpContext.cgiGet( cmbAlbRUni.getInternalname()) ;
                           A58AlbRUniEnt = localUtil.ctond( httpContext.cgiGet( edtAlbRUniEnt_Internalname)) ;
                           A60AlbRUniUti = localUtil.ctond( httpContext.cgiGet( edtAlbRUniUti_Internalname)) ;
                           A57AlbRUniDis = localUtil.ctond( httpContext.cgiGet( edtAlbRUniDis_Internalname)) ;
                           cmbAlbREst.setName( cmbAlbREst.getInternalname() );
                           cmbAlbREst.setValue( httpContext.cgiGet( cmbAlbREst.getInternalname()) );
                           A47AlbREst = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbREst.getInternalname()))) ;
                           A971ProceNom = httpContext.cgiGet( edtProceNom_Internalname) ;
                           n971ProceNom = false ;
                           A13981Composicio = httpContext.cgiGet( edtComposicio_Internalname) ;
                           A1212TipEntNom = httpContext.cgiGet( edtTipEntNom_Internalname) ;
                           n1212TipEntNom = false ;
                           A1291AlbRDes = httpContext.cgiGet( edtAlbRDes_Internalname) ;
                           A13982AlbRArtLu = localUtil.ctond( httpContext.cgiGet( edtAlbRArtLu_Internalname)) ;
                           n13982AlbRArtLu = false ;
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
                                       GX_FocusControl = edtavDetailwebcomponent_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e191662 ();
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
                                       GX_FocusControl = edtavDetailwebcomponent_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e201662 ();
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
                                       GX_FocusControl = edtavDetailwebcomponent_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e211662 ();
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
                                    strup1660( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavDetailwebcomponent_Internalname ;
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
                  else if ( GXutil.strcmp(sEvtType, "W") == 0 )
                  {
                     sEvtType = GXutil.left( sEvt, 4) ;
                     sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-4) ;
                     nCmpId = (short)(GXutil.lval( sEvtType)) ;
                     if ( nCmpId == 73 )
                     {
                        OldGrid_dwc = httpContext.cgiGet( sPrefix+"W0073") ;
                        if ( ( GXutil.len( OldGrid_dwc) == 0 ) || ( GXutil.strcmp(OldGrid_dwc, WebComp_Grid_dwc_Component) != 0 ) )
                        {
                           WebComp_Grid_dwc = WebUtils.getWebComponent(getClass(), "app." + OldGrid_dwc + "_impl", remoteHandle, context);
                           WebComp_Grid_dwc_Component = OldGrid_dwc ;
                        }
                        if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
                        {
                           WebComp_Grid_dwc.componentprocess(sPrefix+"W0073", "", sEvt);
                        }
                        WebComp_Grid_dwc_Component = OldGrid_dwc ;
                     }
                     else if ( nCmpId == 91 )
                     {
                        OldWwpaux_wc = httpContext.cgiGet( sPrefix+"W0091") ;
                        if ( ( GXutil.len( OldWwpaux_wc) == 0 ) || ( GXutil.strcmp(OldWwpaux_wc, WebComp_Wwpaux_wc_Component) != 0 ) )
                        {
                           WebComp_Wwpaux_wc = WebUtils.getWebComponent(getClass(), "app." + OldWwpaux_wc + "_impl", remoteHandle, context);
                           WebComp_Wwpaux_wc_Component = OldWwpaux_wc ;
                        }
                        if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
                        {
                           WebComp_Wwpaux_wc.componentprocess(sPrefix+"W0091", "", sEvt);
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

   public void we1662( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1662( ) ;
         }
      }
   }

   public void pa1662( )
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
                                 String AV67Emprcod ,
                                 java.util.Date AV68Albrfen ,
                                 java.util.Date AV69Albrfen_to ,
                                 int AV70Clicod ,
                                 int AV71Clicod_to ,
                                 String AV72AlbRef ,
                                 String AV88albref_to ,
                                 short AV80Procecod ,
                                 short AV81ProceCod_to ,
                                 String AV73AlbRReo ,
                                 byte AV74AlbREst ,
                                 short AV90TipEntCod ,
                                 String AV89AlbRuni ,
                                 byte AV25ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ,
                                 String AV14FilterFullText ,
                                 int AV26TFAlbRecCod ,
                                 int AV27TFAlbRecCod_To ,
                                 GXSimpleCollection<String> AV78TFAlbRReo_Sels ,
                                 java.util.Date AV33TFAlbRFen ,
                                 int AV37TFCliCod ,
                                 int AV38TFCliCod_To ,
                                 String AV39TFCliNom ,
                                 String AV40TFCliNom_Sel ,
                                 String AV41TFAlbRef ,
                                 String AV42TFAlbRef_Sel ,
                                 String AV43TFAlbRefDsc ,
                                 String AV44TFAlbRefDsc_Sel ,
                                 String AV45TFAlbRDisCli ,
                                 String AV46TFAlbRDisCli_Sel ,
                                 String AV47TFAlbRTartD ,
                                 String AV48TFAlbRTartD_Sel ,
                                 String AV49TFAlbRLote ,
                                 String AV50TFAlbRLote_Sel ,
                                 String AV51TFAlbRLoc ,
                                 String AV52TFAlbRLoc_Sel ,
                                 int AV53TFAlbRPieEnt ,
                                 int AV54TFAlbRPieEnt_To ,
                                 int AV55TFAlbRPieUti ,
                                 int AV56TFAlbRPieUti_To ,
                                 int AV57TFAlbRPieDis ,
                                 int AV58TFAlbRPieDis_To ,
                                 GXSimpleCollection<String> AV60TFAlbRUni_Sels ,
                                 java.math.BigDecimal AV61TFAlbRUniEnt ,
                                 java.math.BigDecimal AV62TFAlbRUniEnt_To ,
                                 java.math.BigDecimal AV63TFAlbRUniUti ,
                                 java.math.BigDecimal AV64TFAlbRUniUti_To ,
                                 java.math.BigDecimal AV65TFAlbRUniDis ,
                                 java.math.BigDecimal AV66TFAlbRUniDis_To ,
                                 GXSimpleCollection<Byte> AV76TFAlbREst_Sels ,
                                 String AV82TFProceNom ,
                                 String AV83TFProceNom_Sel ,
                                 String AV84TFComposicion ,
                                 String AV85TFComposicion_Sel ,
                                 String AV91TFTipEntNom ,
                                 String AV92TFTipEntNom_Sel ,
                                 String AV93TFAlbRDes ,
                                 String AV94TFAlbRDes_Sel ,
                                 String AV97Pgmname ,
                                 short AV32OrderedBy ,
                                 boolean AV12OrderedDsc ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e201662 ();
      GRID_nCurrentRecord = 0 ;
      rf1662( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"WCConsultaAlmacenTejidoencrudo");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV97Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("wcconsultaalmacentejidoencrudo:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_ALBRECCOD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"ALBRECCOD", GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")));
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
      rf1662( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV97Pgmname = "WCConsultaAlmacenTejidoencrudo" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV97Pgmname", AV97Pgmname);
      Gx_err = (short)(0) ;
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavAlbrent2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlbrent2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbrent2_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public int subgridclient_rec_count_fnc( )
   {
      AV101Wcconsultaalmacentejidoencrudods_1_filterfulltext = AV14FilterFullText ;
      AV102Wcconsultaalmacentejidoencrudods_2_tfalbreccod = AV26TFAlbRecCod ;
      AV103Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to = AV27TFAlbRecCod_To ;
      AV104Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels = AV78TFAlbRReo_Sels ;
      AV105Wcconsultaalmacentejidoencrudods_5_tfalbrfen = AV33TFAlbRFen ;
      AV106Wcconsultaalmacentejidoencrudods_6_tfclicod = AV37TFCliCod ;
      AV107Wcconsultaalmacentejidoencrudods_7_tfclicod_to = AV38TFCliCod_To ;
      AV108Wcconsultaalmacentejidoencrudods_8_tfclinom = AV39TFCliNom ;
      AV109Wcconsultaalmacentejidoencrudods_9_tfclinom_sel = AV40TFCliNom_Sel ;
      AV110Wcconsultaalmacentejidoencrudods_10_tfalbref = AV41TFAlbRef ;
      AV111Wcconsultaalmacentejidoencrudods_11_tfalbref_sel = AV42TFAlbRef_Sel ;
      AV112Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc = AV43TFAlbRefDsc ;
      AV113Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel = AV44TFAlbRefDsc_Sel ;
      AV114Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli = AV45TFAlbRDisCli ;
      AV115Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel = AV46TFAlbRDisCli_Sel ;
      AV116Wcconsultaalmacentejidoencrudods_16_tfalbrtartd = AV47TFAlbRTartD ;
      AV117Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel = AV48TFAlbRTartD_Sel ;
      AV118Wcconsultaalmacentejidoencrudods_18_tfalbrlote = AV49TFAlbRLote ;
      AV119Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel = AV50TFAlbRLote_Sel ;
      AV120Wcconsultaalmacentejidoencrudods_20_tfalbrloc = AV51TFAlbRLoc ;
      AV121Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel = AV52TFAlbRLoc_Sel ;
      AV122Wcconsultaalmacentejidoencrudods_22_tfalbrpieent = AV53TFAlbRPieEnt ;
      AV123Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to = AV54TFAlbRPieEnt_To ;
      AV124Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti = AV55TFAlbRPieUti ;
      AV125Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to = AV56TFAlbRPieUti_To ;
      AV126Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis = AV57TFAlbRPieDis ;
      AV127Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to = AV58TFAlbRPieDis_To ;
      AV128Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels = AV60TFAlbRUni_Sels ;
      AV129Wcconsultaalmacentejidoencrudods_29_tfalbrunient = AV61TFAlbRUniEnt ;
      AV130Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to = AV62TFAlbRUniEnt_To ;
      AV131Wcconsultaalmacentejidoencrudods_31_tfalbruniuti = AV63TFAlbRUniUti ;
      AV132Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to = AV64TFAlbRUniUti_To ;
      AV133Wcconsultaalmacentejidoencrudods_33_tfalbrunidis = AV65TFAlbRUniDis ;
      AV134Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to = AV66TFAlbRUniDis_To ;
      AV135Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels = AV76TFAlbREst_Sels ;
      AV136Wcconsultaalmacentejidoencrudods_36_tfprocenom = AV82TFProceNom ;
      AV137Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel = AV83TFProceNom_Sel ;
      AV138Wcconsultaalmacentejidoencrudods_38_tfcomposicion = AV84TFComposicion ;
      AV139Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel = AV85TFComposicion_Sel ;
      AV140Wcconsultaalmacentejidoencrudods_40_tftipentnom = AV91TFTipEntNom ;
      AV141Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel = AV92TFTipEntNom_Sel ;
      AV142Wcconsultaalmacentejidoencrudods_42_tfalbrdes = AV93TFAlbRDes ;
      AV143Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel = AV94TFAlbRDes_Sel ;
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A55AlbRReo ,
                                           AV104Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels ,
                                           A56AlbRUni ,
                                           AV128Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels ,
                                           Byte.valueOf(A47AlbREst) ,
                                           AV135Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels ,
                                           Integer.valueOf(AV102Wcconsultaalmacentejidoencrudods_2_tfalbreccod) ,
                                           Integer.valueOf(AV103Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to) ,
                                           Integer.valueOf(AV104Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels.size()) ,
                                           AV105Wcconsultaalmacentejidoencrudods_5_tfalbrfen ,
                                           Integer.valueOf(AV106Wcconsultaalmacentejidoencrudods_6_tfclicod) ,
                                           Integer.valueOf(AV107Wcconsultaalmacentejidoencrudods_7_tfclicod_to) ,
                                           AV109Wcconsultaalmacentejidoencrudods_9_tfclinom_sel ,
                                           AV108Wcconsultaalmacentejidoencrudods_8_tfclinom ,
                                           AV111Wcconsultaalmacentejidoencrudods_11_tfalbref_sel ,
                                           AV110Wcconsultaalmacentejidoencrudods_10_tfalbref ,
                                           AV113Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel ,
                                           AV112Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc ,
                                           AV115Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel ,
                                           AV114Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli ,
                                           AV117Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel ,
                                           AV116Wcconsultaalmacentejidoencrudods_16_tfalbrtartd ,
                                           AV119Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel ,
                                           AV118Wcconsultaalmacentejidoencrudods_18_tfalbrlote ,
                                           AV121Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel ,
                                           AV120Wcconsultaalmacentejidoencrudods_20_tfalbrloc ,
                                           Integer.valueOf(AV122Wcconsultaalmacentejidoencrudods_22_tfalbrpieent) ,
                                           Integer.valueOf(AV123Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to) ,
                                           Integer.valueOf(AV124Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti) ,
                                           Integer.valueOf(AV125Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to) ,
                                           Integer.valueOf(AV126Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis) ,
                                           Integer.valueOf(AV127Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to) ,
                                           Integer.valueOf(AV128Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels.size()) ,
                                           AV129Wcconsultaalmacentejidoencrudods_29_tfalbrunient ,
                                           AV130Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to ,
                                           AV131Wcconsultaalmacentejidoencrudods_31_tfalbruniuti ,
                                           AV132Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to ,
                                           AV133Wcconsultaalmacentejidoencrudods_33_tfalbrunidis ,
                                           AV134Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to ,
                                           Integer.valueOf(AV135Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels.size()) ,
                                           AV137Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel ,
                                           AV136Wcconsultaalmacentejidoencrudods_36_tfprocenom ,
                                           AV141Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel ,
                                           AV140Wcconsultaalmacentejidoencrudods_40_tftipentnom ,
                                           AV143Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel ,
                                           AV142Wcconsultaalmacentejidoencrudods_42_tfalbrdes ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A49AlbRFen ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           A3359AlbRDisCli ,
                                           A6264AlbRTartD ,
                                           A6463AlbRLote ,
                                           A50AlbRLoc ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           A58AlbRUniEnt ,
                                           A60AlbRUniUti ,
                                           A971ProceNom ,
                                           A1212TipEntNom ,
                                           A1291AlbRDes ,
                                           Short.valueOf(AV32OrderedBy) ,
                                           Boolean.valueOf(AV12OrderedDsc) ,
                                           AV101Wcconsultaalmacentejidoencrudods_1_filterfulltext ,
                                           Integer.valueOf(A51AlbRPieDis) ,
                                           A57AlbRUniDis ,
                                           A13981Composicio ,
                                           AV139Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel ,
                                           AV138Wcconsultaalmacentejidoencrudods_38_tfcomposicion ,
                                           AV72AlbRef ,
                                           AV88albref_to ,
                                           AV68Albrfen ,
                                           AV69Albrfen_to ,
                                           Integer.valueOf(AV70Clicod) ,
                                           Integer.valueOf(AV71Clicod_to) ,
                                           Short.valueOf(A970ProceCod) ,
                                           Short.valueOf(AV80Procecod) ,
                                           Short.valueOf(AV81ProceCod_to) ,
                                           AV73AlbRReo ,
                                           Byte.valueOf(AV74AlbREst) ,
                                           AV89AlbRuni ,
                                           Short.valueOf(A1211TipEntCod) ,
                                           Short.valueOf(AV90TipEntCod) ,
                                           AV67Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV108Wcconsultaalmacentejidoencrudods_8_tfclinom = GXutil.padr( GXutil.rtrim( AV108Wcconsultaalmacentejidoencrudods_8_tfclinom), 30, "%") ;
      lV110Wcconsultaalmacentejidoencrudods_10_tfalbref = GXutil.padr( GXutil.rtrim( AV110Wcconsultaalmacentejidoencrudods_10_tfalbref), 16, "%") ;
      lV112Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV112Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc), 26, "%") ;
      lV114Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli = GXutil.padr( GXutil.rtrim( AV114Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli), 20, "%") ;
      lV116Wcconsultaalmacentejidoencrudods_16_tfalbrtartd = GXutil.padr( GXutil.rtrim( AV116Wcconsultaalmacentejidoencrudods_16_tfalbrtartd), 30, "%") ;
      lV118Wcconsultaalmacentejidoencrudods_18_tfalbrlote = GXutil.padr( GXutil.rtrim( AV118Wcconsultaalmacentejidoencrudods_18_tfalbrlote), 20, "%") ;
      lV120Wcconsultaalmacentejidoencrudods_20_tfalbrloc = GXutil.padr( GXutil.rtrim( AV120Wcconsultaalmacentejidoencrudods_20_tfalbrloc), 10, "%") ;
      lV136Wcconsultaalmacentejidoencrudods_36_tfprocenom = GXutil.padr( GXutil.rtrim( AV136Wcconsultaalmacentejidoencrudods_36_tfprocenom), 30, "%") ;
      lV140Wcconsultaalmacentejidoencrudods_40_tftipentnom = GXutil.padr( GXutil.rtrim( AV140Wcconsultaalmacentejidoencrudods_40_tftipentnom), 25, "%") ;
      lV142Wcconsultaalmacentejidoencrudods_42_tfalbrdes = GXutil.padr( GXutil.rtrim( AV142Wcconsultaalmacentejidoencrudods_42_tfalbrdes), 20, "%") ;
      /* Using cursor H01662 */
      pr_default.execute(0, new Object[] {AV67Emprcod, AV72AlbRef, AV88albref_to, AV68Albrfen, AV69Albrfen_to, Integer.valueOf(AV70Clicod), Integer.valueOf(AV71Clicod_to), Short.valueOf(AV80Procecod), Short.valueOf(AV81ProceCod_to), Byte.valueOf(AV74AlbREst), Byte.valueOf(AV74AlbREst), AV89AlbRuni, Short.valueOf(AV90TipEntCod), Short.valueOf(AV90TipEntCod), Integer.valueOf(AV102Wcconsultaalmacentejidoencrudods_2_tfalbreccod), Integer.valueOf(AV103Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to), AV105Wcconsultaalmacentejidoencrudods_5_tfalbrfen, Integer.valueOf(AV106Wcconsultaalmacentejidoencrudods_6_tfclicod), Integer.valueOf(AV107Wcconsultaalmacentejidoencrudods_7_tfclicod_to), lV108Wcconsultaalmacentejidoencrudods_8_tfclinom, AV109Wcconsultaalmacentejidoencrudods_9_tfclinom_sel, lV110Wcconsultaalmacentejidoencrudods_10_tfalbref, AV111Wcconsultaalmacentejidoencrudods_11_tfalbref_sel, lV112Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc, AV113Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel, lV114Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli, AV115Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel, lV116Wcconsultaalmacentejidoencrudods_16_tfalbrtartd, AV117Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel, lV118Wcconsultaalmacentejidoencrudods_18_tfalbrlote, AV119Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel, lV120Wcconsultaalmacentejidoencrudods_20_tfalbrloc, AV121Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel, Integer.valueOf(AV122Wcconsultaalmacentejidoencrudods_22_tfalbrpieent), Integer.valueOf(AV123Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to), Integer.valueOf(AV124Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti), Integer.valueOf(AV125Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to), Integer.valueOf(AV126Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis), Integer.valueOf(AV127Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to), AV129Wcconsultaalmacentejidoencrudods_29_tfalbrunient, AV130Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to, AV131Wcconsultaalmacentejidoencrudods_31_tfalbruniuti, AV132Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to, AV133Wcconsultaalmacentejidoencrudods_33_tfalbrunidis, AV134Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to, lV136Wcconsultaalmacentejidoencrudods_36_tfprocenom, AV137Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel, lV140Wcconsultaalmacentejidoencrudods_40_tftipentnom, AV141Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel, lV142Wcconsultaalmacentejidoencrudods_42_tfalbrdes, AV143Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6263AlbRTartC = H01662_A6263AlbRTartC[0] ;
         n6263AlbRTartC = H01662_n6263AlbRTartC[0] ;
         A970ProceCod = H01662_A970ProceCod[0] ;
         n970ProceCod = H01662_n970ProceCod[0] ;
         A1211TipEntCod = H01662_A1211TipEntCod[0] ;
         n1211TipEntCod = H01662_n1211TipEntCod[0] ;
         A46AlbREnt = H01662_A46AlbREnt[0] ;
         A5806AlbREnt2 = H01662_A5806AlbREnt2[0] ;
         A1291AlbRDes = H01662_A1291AlbRDes[0] ;
         A1212TipEntNom = H01662_A1212TipEntNom[0] ;
         n1212TipEntNom = H01662_n1212TipEntNom[0] ;
         A971ProceNom = H01662_A971ProceNom[0] ;
         n971ProceNom = H01662_n971ProceNom[0] ;
         A47AlbREst = H01662_A47AlbREst[0] ;
         A57AlbRUniDis = H01662_A57AlbRUniDis[0] ;
         A56AlbRUni = H01662_A56AlbRUni[0] ;
         A51AlbRPieDis = H01662_A51AlbRPieDis[0] ;
         A50AlbRLoc = H01662_A50AlbRLoc[0] ;
         A6463AlbRLote = H01662_A6463AlbRLote[0] ;
         A6264AlbRTartD = H01662_A6264AlbRTartD[0] ;
         n6264AlbRTartD = H01662_n6264AlbRTartD[0] ;
         A3359AlbRDisCli = H01662_A3359AlbRDisCli[0] ;
         A3613AlbRefDsc = H01662_A3613AlbRefDsc[0] ;
         A279CliNom = H01662_A279CliNom[0] ;
         A49AlbRFen = H01662_A49AlbRFen[0] ;
         A55AlbRReo = H01662_A55AlbRReo[0] ;
         A44AlbRecCod = H01662_A44AlbRecCod[0] ;
         A13982AlbRArtLu = H01662_A13982AlbRArtLu[0] ;
         n13982AlbRArtLu = H01662_n13982AlbRArtLu[0] ;
         A58AlbRUniEnt = H01662_A58AlbRUniEnt[0] ;
         A60AlbRUniUti = H01662_A60AlbRUniUti[0] ;
         A52AlbRPieEnt = H01662_A52AlbRPieEnt[0] ;
         A54AlbRPieUti = H01662_A54AlbRPieUti[0] ;
         A45AlbRef = H01662_A45AlbRef[0] ;
         A252CliCod = H01662_A252CliCod[0] ;
         A396EmprCod = H01662_A396EmprCod[0] ;
         A279CliNom = H01662_A279CliNom[0] ;
         A6264AlbRTartD = H01662_A6264AlbRTartD[0] ;
         n6264AlbRTartD = H01662_n6264AlbRTartD[0] ;
         A971ProceNom = H01662_A971ProceNom[0] ;
         n971ProceNom = H01662_n971ProceNom[0] ;
         A1212TipEntNom = H01662_A1212TipEntNom[0] ;
         n1212TipEntNom = H01662_n1212TipEntNom[0] ;
         A13982AlbRArtLu = H01662_A13982AlbRArtLu[0] ;
         n13982AlbRArtLu = H01662_n13982AlbRArtLu[0] ;
         if ( ( GXutil.strcmp(A55AlbRReo, AV73AlbRReo) == 0 ) || ( GXutil.strcmp(AV73AlbRReo, httpContext.getMessage( "T", "")) == 0 ) )
         {
            GXt_char1 = A13981Composicio ;
            GXv_char2[0] = A396EmprCod ;
            GXv_int3[0] = A252CliCod ;
            GXv_char4[0] = A45AlbRef ;
            GXv_char5[0] = GXt_char1 ;
            new app.almacensindetalle.composicion(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_char4, GXv_char5) ;
            wcconsultaalmacentejidoencrudo_impl.this.A396EmprCod = GXv_char2[0] ;
            wcconsultaalmacentejidoencrudo_impl.this.A252CliCod = GXv_int3[0] ;
            wcconsultaalmacentejidoencrudo_impl.this.A45AlbRef = GXv_char4[0] ;
            wcconsultaalmacentejidoencrudo_impl.this.GXt_char1 = GXv_char5[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
            A13981Composicio = GXt_char1 ;
            if ( (GXutil.strcmp("", AV101Wcconsultaalmacentejidoencrudods_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV101Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "no", "") , GXutil.padr( "%" + GXutil.lower( AV101Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, "NO") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "si", "") , GXutil.padr( "%" + GXutil.lower( AV101Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, "SI") == 0 ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV101Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV101Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV101Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3613AlbRefDsc) , GXutil.padr( "%" + GXutil.upper( AV101Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3359AlbRDisCli) , GXutil.padr( "%" + GXutil.upper( AV101Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6264AlbRTartD) , GXutil.padr( "%" + GXutil.upper( AV101Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6463AlbRLote) , GXutil.padr( "%" + GXutil.upper( AV101Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A50AlbRLoc) , GXutil.padr( "%" + GXutil.upper( AV101Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A52AlbRPieEnt, 6, 0) , GXutil.padr( "%" + AV101Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A54AlbRPieUti, 6, 0) , GXutil.padr( "%" + AV101Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A51AlbRPieDis, 6, 0) , GXutil.padr( "%" + AV101Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "k", "") , GXutil.padr( "%" + GXutil.lower( AV101Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, "K") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "m", "") , GXutil.padr( "%" + GXutil.lower( AV101Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, "M") == 0 ) ) || ( GXutil.like( GXutil.str( A58AlbRUniEnt, 9, 2) , GXutil.padr( "%" + AV101Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A60AlbRUniUti, 9, 2) , GXutil.padr( "%" + AV101Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A57AlbRUniDis, 9, 2) , GXutil.padr( "%" + AV101Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "abierta", "") , GXutil.padr( "%" + GXutil.lower( AV101Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A47AlbREst == 0 ) ) || ( GXutil.like( httpContext.getMessage( "cerrada", "") , GXutil.padr( "%" + GXutil.lower( AV101Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A47AlbREst == 1 ) ) || ( GXutil.like( GXutil.upper( A971ProceNom) , GXutil.padr( "%" + GXutil.upper( AV101Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13981Composicio) , GXutil.padr( "%" + GXutil.upper( AV101Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1212TipEntNom) , GXutil.padr( "%" + GXutil.upper( AV101Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1291AlbRDes) , GXutil.padr( "%" + GXutil.upper( AV101Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
            {
               if ( ! ( (GXutil.strcmp("", AV139Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel)==0) && ( ! (GXutil.strcmp("", AV138Wcconsultaalmacentejidoencrudods_38_tfcomposicion)==0) ) ) || ( GXutil.like( GXutil.upper( A13981Composicio) , GXutil.padr( "%" + GXutil.upper( AV138Wcconsultaalmacentejidoencrudods_38_tfcomposicion) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV139Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel)==0) || ( ( GXutil.strcmp(A13981Composicio, AV139Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel) == 0 ) ) )
                  {
                     GRID_nRecordCount = (long)(GRID_nRecordCount+1) ;
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

   public void rf1662( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(41) ;
      /* Execute user event: Refresh */
      e201662 ();
      nGXsfl_41_idx = 1 ;
      sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_412( ) ;
      bGXsfl_41_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_fnc_recordsperpage( ) );
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
            {
               WebComp_Grid_dwc.componentstart();
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
         subsflControlProps_412( ) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              A55AlbRReo ,
                                              AV104Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels ,
                                              A56AlbRUni ,
                                              AV128Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels ,
                                              Byte.valueOf(A47AlbREst) ,
                                              AV135Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels ,
                                              Integer.valueOf(AV102Wcconsultaalmacentejidoencrudods_2_tfalbreccod) ,
                                              Integer.valueOf(AV103Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to) ,
                                              Integer.valueOf(AV104Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels.size()) ,
                                              AV105Wcconsultaalmacentejidoencrudods_5_tfalbrfen ,
                                              Integer.valueOf(AV106Wcconsultaalmacentejidoencrudods_6_tfclicod) ,
                                              Integer.valueOf(AV107Wcconsultaalmacentejidoencrudods_7_tfclicod_to) ,
                                              AV109Wcconsultaalmacentejidoencrudods_9_tfclinom_sel ,
                                              AV108Wcconsultaalmacentejidoencrudods_8_tfclinom ,
                                              AV111Wcconsultaalmacentejidoencrudods_11_tfalbref_sel ,
                                              AV110Wcconsultaalmacentejidoencrudods_10_tfalbref ,
                                              AV113Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel ,
                                              AV112Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc ,
                                              AV115Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel ,
                                              AV114Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli ,
                                              AV117Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel ,
                                              AV116Wcconsultaalmacentejidoencrudods_16_tfalbrtartd ,
                                              AV119Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel ,
                                              AV118Wcconsultaalmacentejidoencrudods_18_tfalbrlote ,
                                              AV121Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel ,
                                              AV120Wcconsultaalmacentejidoencrudods_20_tfalbrloc ,
                                              Integer.valueOf(AV122Wcconsultaalmacentejidoencrudods_22_tfalbrpieent) ,
                                              Integer.valueOf(AV123Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to) ,
                                              Integer.valueOf(AV124Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti) ,
                                              Integer.valueOf(AV125Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to) ,
                                              Integer.valueOf(AV126Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis) ,
                                              Integer.valueOf(AV127Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to) ,
                                              Integer.valueOf(AV128Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels.size()) ,
                                              AV129Wcconsultaalmacentejidoencrudods_29_tfalbrunient ,
                                              AV130Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to ,
                                              AV131Wcconsultaalmacentejidoencrudods_31_tfalbruniuti ,
                                              AV132Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to ,
                                              AV133Wcconsultaalmacentejidoencrudods_33_tfalbrunidis ,
                                              AV134Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to ,
                                              Integer.valueOf(AV135Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels.size()) ,
                                              AV137Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel ,
                                              AV136Wcconsultaalmacentejidoencrudods_36_tfprocenom ,
                                              AV141Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel ,
                                              AV140Wcconsultaalmacentejidoencrudods_40_tftipentnom ,
                                              AV143Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel ,
                                              AV142Wcconsultaalmacentejidoencrudods_42_tfalbrdes ,
                                              Integer.valueOf(A44AlbRecCod) ,
                                              A49AlbRFen ,
                                              Integer.valueOf(A252CliCod) ,
                                              A279CliNom ,
                                              A45AlbRef ,
                                              A3613AlbRefDsc ,
                                              A3359AlbRDisCli ,
                                              A6264AlbRTartD ,
                                              A6463AlbRLote ,
                                              A50AlbRLoc ,
                                              Integer.valueOf(A52AlbRPieEnt) ,
                                              Integer.valueOf(A54AlbRPieUti) ,
                                              A58AlbRUniEnt ,
                                              A60AlbRUniUti ,
                                              A971ProceNom ,
                                              A1212TipEntNom ,
                                              A1291AlbRDes ,
                                              Short.valueOf(AV32OrderedBy) ,
                                              Boolean.valueOf(AV12OrderedDsc) ,
                                              AV101Wcconsultaalmacentejidoencrudods_1_filterfulltext ,
                                              Integer.valueOf(A51AlbRPieDis) ,
                                              A57AlbRUniDis ,
                                              A13981Composicio ,
                                              AV139Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel ,
                                              AV138Wcconsultaalmacentejidoencrudods_38_tfcomposicion ,
                                              AV72AlbRef ,
                                              AV88albref_to ,
                                              AV68Albrfen ,
                                              AV69Albrfen_to ,
                                              Integer.valueOf(AV70Clicod) ,
                                              Integer.valueOf(AV71Clicod_to) ,
                                              Short.valueOf(A970ProceCod) ,
                                              Short.valueOf(AV80Procecod) ,
                                              Short.valueOf(AV81ProceCod_to) ,
                                              AV73AlbRReo ,
                                              Byte.valueOf(AV74AlbREst) ,
                                              AV89AlbRuni ,
                                              Short.valueOf(A1211TipEntCod) ,
                                              Short.valueOf(AV90TipEntCod) ,
                                              AV67Emprcod ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                              TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV108Wcconsultaalmacentejidoencrudods_8_tfclinom = GXutil.padr( GXutil.rtrim( AV108Wcconsultaalmacentejidoencrudods_8_tfclinom), 30, "%") ;
         lV110Wcconsultaalmacentejidoencrudods_10_tfalbref = GXutil.padr( GXutil.rtrim( AV110Wcconsultaalmacentejidoencrudods_10_tfalbref), 16, "%") ;
         lV112Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV112Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc), 26, "%") ;
         lV114Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli = GXutil.padr( GXutil.rtrim( AV114Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli), 20, "%") ;
         lV116Wcconsultaalmacentejidoencrudods_16_tfalbrtartd = GXutil.padr( GXutil.rtrim( AV116Wcconsultaalmacentejidoencrudods_16_tfalbrtartd), 30, "%") ;
         lV118Wcconsultaalmacentejidoencrudods_18_tfalbrlote = GXutil.padr( GXutil.rtrim( AV118Wcconsultaalmacentejidoencrudods_18_tfalbrlote), 20, "%") ;
         lV120Wcconsultaalmacentejidoencrudods_20_tfalbrloc = GXutil.padr( GXutil.rtrim( AV120Wcconsultaalmacentejidoencrudods_20_tfalbrloc), 10, "%") ;
         lV136Wcconsultaalmacentejidoencrudods_36_tfprocenom = GXutil.padr( GXutil.rtrim( AV136Wcconsultaalmacentejidoencrudods_36_tfprocenom), 30, "%") ;
         lV140Wcconsultaalmacentejidoencrudods_40_tftipentnom = GXutil.padr( GXutil.rtrim( AV140Wcconsultaalmacentejidoencrudods_40_tftipentnom), 25, "%") ;
         lV142Wcconsultaalmacentejidoencrudods_42_tfalbrdes = GXutil.padr( GXutil.rtrim( AV142Wcconsultaalmacentejidoencrudods_42_tfalbrdes), 20, "%") ;
         /* Using cursor H01663 */
         pr_default.execute(1, new Object[] {AV67Emprcod, AV72AlbRef, AV88albref_to, AV68Albrfen, AV69Albrfen_to, Integer.valueOf(AV70Clicod), Integer.valueOf(AV71Clicod_to), Short.valueOf(AV80Procecod), Short.valueOf(AV81ProceCod_to), Byte.valueOf(AV74AlbREst), Byte.valueOf(AV74AlbREst), AV89AlbRuni, Short.valueOf(AV90TipEntCod), Short.valueOf(AV90TipEntCod), Integer.valueOf(AV102Wcconsultaalmacentejidoencrudods_2_tfalbreccod), Integer.valueOf(AV103Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to), AV105Wcconsultaalmacentejidoencrudods_5_tfalbrfen, Integer.valueOf(AV106Wcconsultaalmacentejidoencrudods_6_tfclicod), Integer.valueOf(AV107Wcconsultaalmacentejidoencrudods_7_tfclicod_to), lV108Wcconsultaalmacentejidoencrudods_8_tfclinom, AV109Wcconsultaalmacentejidoencrudods_9_tfclinom_sel, lV110Wcconsultaalmacentejidoencrudods_10_tfalbref, AV111Wcconsultaalmacentejidoencrudods_11_tfalbref_sel, lV112Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc, AV113Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel, lV114Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli, AV115Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel, lV116Wcconsultaalmacentejidoencrudods_16_tfalbrtartd, AV117Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel, lV118Wcconsultaalmacentejidoencrudods_18_tfalbrlote, AV119Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel, lV120Wcconsultaalmacentejidoencrudods_20_tfalbrloc, AV121Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel, Integer.valueOf(AV122Wcconsultaalmacentejidoencrudods_22_tfalbrpieent), Integer.valueOf(AV123Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to), Integer.valueOf(AV124Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti), Integer.valueOf(AV125Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to), Integer.valueOf(AV126Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis), Integer.valueOf(AV127Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to), AV129Wcconsultaalmacentejidoencrudods_29_tfalbrunient, AV130Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to, AV131Wcconsultaalmacentejidoencrudods_31_tfalbruniuti, AV132Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to, AV133Wcconsultaalmacentejidoencrudods_33_tfalbrunidis, AV134Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to, lV136Wcconsultaalmacentejidoencrudods_36_tfprocenom, AV137Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel, lV140Wcconsultaalmacentejidoencrudods_40_tftipentnom, AV141Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel, lV142Wcconsultaalmacentejidoencrudods_42_tfalbrdes, AV143Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel});
         nGXsfl_41_idx = 1 ;
         sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_412( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A6263AlbRTartC = H01663_A6263AlbRTartC[0] ;
            n6263AlbRTartC = H01663_n6263AlbRTartC[0] ;
            A970ProceCod = H01663_A970ProceCod[0] ;
            n970ProceCod = H01663_n970ProceCod[0] ;
            A1211TipEntCod = H01663_A1211TipEntCod[0] ;
            n1211TipEntCod = H01663_n1211TipEntCod[0] ;
            A46AlbREnt = H01663_A46AlbREnt[0] ;
            A5806AlbREnt2 = H01663_A5806AlbREnt2[0] ;
            A1291AlbRDes = H01663_A1291AlbRDes[0] ;
            A1212TipEntNom = H01663_A1212TipEntNom[0] ;
            n1212TipEntNom = H01663_n1212TipEntNom[0] ;
            A971ProceNom = H01663_A971ProceNom[0] ;
            n971ProceNom = H01663_n971ProceNom[0] ;
            A47AlbREst = H01663_A47AlbREst[0] ;
            A57AlbRUniDis = H01663_A57AlbRUniDis[0] ;
            A56AlbRUni = H01663_A56AlbRUni[0] ;
            A51AlbRPieDis = H01663_A51AlbRPieDis[0] ;
            A50AlbRLoc = H01663_A50AlbRLoc[0] ;
            A6463AlbRLote = H01663_A6463AlbRLote[0] ;
            A6264AlbRTartD = H01663_A6264AlbRTartD[0] ;
            n6264AlbRTartD = H01663_n6264AlbRTartD[0] ;
            A3359AlbRDisCli = H01663_A3359AlbRDisCli[0] ;
            A3613AlbRefDsc = H01663_A3613AlbRefDsc[0] ;
            A279CliNom = H01663_A279CliNom[0] ;
            A49AlbRFen = H01663_A49AlbRFen[0] ;
            A55AlbRReo = H01663_A55AlbRReo[0] ;
            A44AlbRecCod = H01663_A44AlbRecCod[0] ;
            A13982AlbRArtLu = H01663_A13982AlbRArtLu[0] ;
            n13982AlbRArtLu = H01663_n13982AlbRArtLu[0] ;
            A58AlbRUniEnt = H01663_A58AlbRUniEnt[0] ;
            A60AlbRUniUti = H01663_A60AlbRUniUti[0] ;
            A52AlbRPieEnt = H01663_A52AlbRPieEnt[0] ;
            A54AlbRPieUti = H01663_A54AlbRPieUti[0] ;
            A45AlbRef = H01663_A45AlbRef[0] ;
            A252CliCod = H01663_A252CliCod[0] ;
            A396EmprCod = H01663_A396EmprCod[0] ;
            A279CliNom = H01663_A279CliNom[0] ;
            A6264AlbRTartD = H01663_A6264AlbRTartD[0] ;
            n6264AlbRTartD = H01663_n6264AlbRTartD[0] ;
            A971ProceNom = H01663_A971ProceNom[0] ;
            n971ProceNom = H01663_n971ProceNom[0] ;
            A1212TipEntNom = H01663_A1212TipEntNom[0] ;
            n1212TipEntNom = H01663_n1212TipEntNom[0] ;
            A13982AlbRArtLu = H01663_A13982AlbRArtLu[0] ;
            n13982AlbRArtLu = H01663_n13982AlbRArtLu[0] ;
            if ( ( GXutil.strcmp(A55AlbRReo, AV73AlbRReo) == 0 ) || ( GXutil.strcmp(AV73AlbRReo, httpContext.getMessage( "T", "")) == 0 ) )
            {
               GXt_char1 = A13981Composicio ;
               GXv_char5[0] = A396EmprCod ;
               GXv_int3[0] = A252CliCod ;
               GXv_char4[0] = A45AlbRef ;
               GXv_char2[0] = GXt_char1 ;
               new app.almacensindetalle.composicion(remoteHandle, context).execute( GXv_char5, GXv_int3, GXv_char4, GXv_char2) ;
               wcconsultaalmacentejidoencrudo_impl.this.A396EmprCod = GXv_char5[0] ;
               wcconsultaalmacentejidoencrudo_impl.this.A252CliCod = GXv_int3[0] ;
               wcconsultaalmacentejidoencrudo_impl.this.A45AlbRef = GXv_char4[0] ;
               wcconsultaalmacentejidoencrudo_impl.this.GXt_char1 = GXv_char2[0] ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               A13981Composicio = GXt_char1 ;
               if ( (GXutil.strcmp("", AV101Wcconsultaalmacentejidoencrudods_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV101Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "no", "") , GXutil.padr( "%" + GXutil.lower( AV101Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, "NO") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "si", "") , GXutil.padr( "%" + GXutil.lower( AV101Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, "SI") == 0 ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV101Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV101Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV101Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3613AlbRefDsc) , GXutil.padr( "%" + GXutil.upper( AV101Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3359AlbRDisCli) , GXutil.padr( "%" + GXutil.upper( AV101Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6264AlbRTartD) , GXutil.padr( "%" + GXutil.upper( AV101Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6463AlbRLote) , GXutil.padr( "%" + GXutil.upper( AV101Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A50AlbRLoc) , GXutil.padr( "%" + GXutil.upper( AV101Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A52AlbRPieEnt, 6, 0) , GXutil.padr( "%" + AV101Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A54AlbRPieUti, 6, 0) , GXutil.padr( "%" + AV101Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A51AlbRPieDis, 6, 0) , GXutil.padr( "%" + AV101Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "k", "") , GXutil.padr( "%" + GXutil.lower( AV101Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, "K") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "m", "") , GXutil.padr( "%" + GXutil.lower( AV101Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, "M") == 0 ) ) || ( GXutil.like( GXutil.str( A58AlbRUniEnt, 9, 2) , GXutil.padr( "%" + AV101Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A60AlbRUniUti, 9, 2) , GXutil.padr( "%" + AV101Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A57AlbRUniDis, 9, 2) , GXutil.padr( "%" + AV101Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "abierta", "") , GXutil.padr( "%" + GXutil.lower( AV101Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A47AlbREst == 0 ) ) || ( GXutil.like( httpContext.getMessage( "cerrada", "") , GXutil.padr( "%" + GXutil.lower( AV101Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A47AlbREst == 1 ) ) || ( GXutil.like( GXutil.upper( A971ProceNom) , GXutil.padr( "%" + GXutil.upper( AV101Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13981Composicio) , GXutil.padr( "%" + GXutil.upper( AV101Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1212TipEntNom) , GXutil.padr( "%" + GXutil.upper( AV101Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1291AlbRDes) , GXutil.padr( "%" + GXutil.upper( AV101Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
               {
                  if ( ! ( (GXutil.strcmp("", AV139Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel)==0) && ( ! (GXutil.strcmp("", AV138Wcconsultaalmacentejidoencrudods_38_tfcomposicion)==0) ) ) || ( GXutil.like( GXutil.upper( A13981Composicio) , GXutil.padr( "%" + GXutil.upper( AV138Wcconsultaalmacentejidoencrudods_38_tfcomposicion) , 255 , "%"),  ' ' ) ) )
                  {
                     if ( (GXutil.strcmp("", AV139Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel)==0) || ( ( GXutil.strcmp(A13981Composicio, AV139Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel) == 0 ) ) )
                     {
                        e211662 ();
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
         wb1660( ) ;
      }
      bGXsfl_41_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1662( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_ALBRECCOD"+"_"+sGXsfl_41_idx, getSecureSignedToken( sPrefix+sGXsfl_41_idx, localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9")));
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
      AV101Wcconsultaalmacentejidoencrudods_1_filterfulltext = AV14FilterFullText ;
      AV102Wcconsultaalmacentejidoencrudods_2_tfalbreccod = AV26TFAlbRecCod ;
      AV103Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to = AV27TFAlbRecCod_To ;
      AV104Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels = AV78TFAlbRReo_Sels ;
      AV105Wcconsultaalmacentejidoencrudods_5_tfalbrfen = AV33TFAlbRFen ;
      AV106Wcconsultaalmacentejidoencrudods_6_tfclicod = AV37TFCliCod ;
      AV107Wcconsultaalmacentejidoencrudods_7_tfclicod_to = AV38TFCliCod_To ;
      AV108Wcconsultaalmacentejidoencrudods_8_tfclinom = AV39TFCliNom ;
      AV109Wcconsultaalmacentejidoencrudods_9_tfclinom_sel = AV40TFCliNom_Sel ;
      AV110Wcconsultaalmacentejidoencrudods_10_tfalbref = AV41TFAlbRef ;
      AV111Wcconsultaalmacentejidoencrudods_11_tfalbref_sel = AV42TFAlbRef_Sel ;
      AV112Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc = AV43TFAlbRefDsc ;
      AV113Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel = AV44TFAlbRefDsc_Sel ;
      AV114Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli = AV45TFAlbRDisCli ;
      AV115Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel = AV46TFAlbRDisCli_Sel ;
      AV116Wcconsultaalmacentejidoencrudods_16_tfalbrtartd = AV47TFAlbRTartD ;
      AV117Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel = AV48TFAlbRTartD_Sel ;
      AV118Wcconsultaalmacentejidoencrudods_18_tfalbrlote = AV49TFAlbRLote ;
      AV119Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel = AV50TFAlbRLote_Sel ;
      AV120Wcconsultaalmacentejidoencrudods_20_tfalbrloc = AV51TFAlbRLoc ;
      AV121Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel = AV52TFAlbRLoc_Sel ;
      AV122Wcconsultaalmacentejidoencrudods_22_tfalbrpieent = AV53TFAlbRPieEnt ;
      AV123Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to = AV54TFAlbRPieEnt_To ;
      AV124Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti = AV55TFAlbRPieUti ;
      AV125Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to = AV56TFAlbRPieUti_To ;
      AV126Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis = AV57TFAlbRPieDis ;
      AV127Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to = AV58TFAlbRPieDis_To ;
      AV128Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels = AV60TFAlbRUni_Sels ;
      AV129Wcconsultaalmacentejidoencrudods_29_tfalbrunient = AV61TFAlbRUniEnt ;
      AV130Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to = AV62TFAlbRUniEnt_To ;
      AV131Wcconsultaalmacentejidoencrudods_31_tfalbruniuti = AV63TFAlbRUniUti ;
      AV132Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to = AV64TFAlbRUniUti_To ;
      AV133Wcconsultaalmacentejidoencrudods_33_tfalbrunidis = AV65TFAlbRUniDis ;
      AV134Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to = AV66TFAlbRUniDis_To ;
      AV135Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels = AV76TFAlbREst_Sels ;
      AV136Wcconsultaalmacentejidoencrudods_36_tfprocenom = AV82TFProceNom ;
      AV137Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel = AV83TFProceNom_Sel ;
      AV138Wcconsultaalmacentejidoencrudods_38_tfcomposicion = AV84TFComposicion ;
      AV139Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel = AV85TFComposicion_Sel ;
      AV140Wcconsultaalmacentejidoencrudods_40_tftipentnom = AV91TFTipEntNom ;
      AV141Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel = AV92TFTipEntNom_Sel ;
      AV142Wcconsultaalmacentejidoencrudods_42_tfalbrdes = AV93TFAlbRDes ;
      AV143Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel = AV94TFAlbRDes_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV67Emprcod, AV68Albrfen, AV69Albrfen_to, AV70Clicod, AV71Clicod_to, AV72AlbRef, AV88albref_to, AV80Procecod, AV81ProceCod_to, AV73AlbRReo, AV74AlbREst, AV90TipEntCod, AV89AlbRuni, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV14FilterFullText, AV26TFAlbRecCod, AV27TFAlbRecCod_To, AV78TFAlbRReo_Sels, AV33TFAlbRFen, AV37TFCliCod, AV38TFCliCod_To, AV39TFCliNom, AV40TFCliNom_Sel, AV41TFAlbRef, AV42TFAlbRef_Sel, AV43TFAlbRefDsc, AV44TFAlbRefDsc_Sel, AV45TFAlbRDisCli, AV46TFAlbRDisCli_Sel, AV47TFAlbRTartD, AV48TFAlbRTartD_Sel, AV49TFAlbRLote, AV50TFAlbRLote_Sel, AV51TFAlbRLoc, AV52TFAlbRLoc_Sel, AV53TFAlbRPieEnt, AV54TFAlbRPieEnt_To, AV55TFAlbRPieUti, AV56TFAlbRPieUti_To, AV57TFAlbRPieDis, AV58TFAlbRPieDis_To, AV60TFAlbRUni_Sels, AV61TFAlbRUniEnt, AV62TFAlbRUniEnt_To, AV63TFAlbRUniUti, AV64TFAlbRUniUti_To, AV65TFAlbRUniDis, AV66TFAlbRUniDis_To, AV76TFAlbREst_Sels, AV82TFProceNom, AV83TFProceNom_Sel, AV84TFComposicion, AV85TFComposicion_Sel, AV91TFTipEntNom, AV92TFTipEntNom_Sel, AV93TFAlbRDes, AV94TFAlbRDes_Sel, AV97Pgmname, AV32OrderedBy, AV12OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV101Wcconsultaalmacentejidoencrudods_1_filterfulltext = AV14FilterFullText ;
      AV102Wcconsultaalmacentejidoencrudods_2_tfalbreccod = AV26TFAlbRecCod ;
      AV103Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to = AV27TFAlbRecCod_To ;
      AV104Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels = AV78TFAlbRReo_Sels ;
      AV105Wcconsultaalmacentejidoencrudods_5_tfalbrfen = AV33TFAlbRFen ;
      AV106Wcconsultaalmacentejidoencrudods_6_tfclicod = AV37TFCliCod ;
      AV107Wcconsultaalmacentejidoencrudods_7_tfclicod_to = AV38TFCliCod_To ;
      AV108Wcconsultaalmacentejidoencrudods_8_tfclinom = AV39TFCliNom ;
      AV109Wcconsultaalmacentejidoencrudods_9_tfclinom_sel = AV40TFCliNom_Sel ;
      AV110Wcconsultaalmacentejidoencrudods_10_tfalbref = AV41TFAlbRef ;
      AV111Wcconsultaalmacentejidoencrudods_11_tfalbref_sel = AV42TFAlbRef_Sel ;
      AV112Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc = AV43TFAlbRefDsc ;
      AV113Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel = AV44TFAlbRefDsc_Sel ;
      AV114Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli = AV45TFAlbRDisCli ;
      AV115Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel = AV46TFAlbRDisCli_Sel ;
      AV116Wcconsultaalmacentejidoencrudods_16_tfalbrtartd = AV47TFAlbRTartD ;
      AV117Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel = AV48TFAlbRTartD_Sel ;
      AV118Wcconsultaalmacentejidoencrudods_18_tfalbrlote = AV49TFAlbRLote ;
      AV119Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel = AV50TFAlbRLote_Sel ;
      AV120Wcconsultaalmacentejidoencrudods_20_tfalbrloc = AV51TFAlbRLoc ;
      AV121Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel = AV52TFAlbRLoc_Sel ;
      AV122Wcconsultaalmacentejidoencrudods_22_tfalbrpieent = AV53TFAlbRPieEnt ;
      AV123Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to = AV54TFAlbRPieEnt_To ;
      AV124Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti = AV55TFAlbRPieUti ;
      AV125Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to = AV56TFAlbRPieUti_To ;
      AV126Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis = AV57TFAlbRPieDis ;
      AV127Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to = AV58TFAlbRPieDis_To ;
      AV128Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels = AV60TFAlbRUni_Sels ;
      AV129Wcconsultaalmacentejidoencrudods_29_tfalbrunient = AV61TFAlbRUniEnt ;
      AV130Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to = AV62TFAlbRUniEnt_To ;
      AV131Wcconsultaalmacentejidoencrudods_31_tfalbruniuti = AV63TFAlbRUniUti ;
      AV132Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to = AV64TFAlbRUniUti_To ;
      AV133Wcconsultaalmacentejidoencrudods_33_tfalbrunidis = AV65TFAlbRUniDis ;
      AV134Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to = AV66TFAlbRUniDis_To ;
      AV135Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels = AV76TFAlbREst_Sels ;
      AV136Wcconsultaalmacentejidoencrudods_36_tfprocenom = AV82TFProceNom ;
      AV137Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel = AV83TFProceNom_Sel ;
      AV138Wcconsultaalmacentejidoencrudods_38_tfcomposicion = AV84TFComposicion ;
      AV139Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel = AV85TFComposicion_Sel ;
      AV140Wcconsultaalmacentejidoencrudods_40_tftipentnom = AV91TFTipEntNom ;
      AV141Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel = AV92TFTipEntNom_Sel ;
      AV142Wcconsultaalmacentejidoencrudods_42_tfalbrdes = AV93TFAlbRDes ;
      AV143Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel = AV94TFAlbRDes_Sel ;
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV67Emprcod, AV68Albrfen, AV69Albrfen_to, AV70Clicod, AV71Clicod_to, AV72AlbRef, AV88albref_to, AV80Procecod, AV81ProceCod_to, AV73AlbRReo, AV74AlbREst, AV90TipEntCod, AV89AlbRuni, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV14FilterFullText, AV26TFAlbRecCod, AV27TFAlbRecCod_To, AV78TFAlbRReo_Sels, AV33TFAlbRFen, AV37TFCliCod, AV38TFCliCod_To, AV39TFCliNom, AV40TFCliNom_Sel, AV41TFAlbRef, AV42TFAlbRef_Sel, AV43TFAlbRefDsc, AV44TFAlbRefDsc_Sel, AV45TFAlbRDisCli, AV46TFAlbRDisCli_Sel, AV47TFAlbRTartD, AV48TFAlbRTartD_Sel, AV49TFAlbRLote, AV50TFAlbRLote_Sel, AV51TFAlbRLoc, AV52TFAlbRLoc_Sel, AV53TFAlbRPieEnt, AV54TFAlbRPieEnt_To, AV55TFAlbRPieUti, AV56TFAlbRPieUti_To, AV57TFAlbRPieDis, AV58TFAlbRPieDis_To, AV60TFAlbRUni_Sels, AV61TFAlbRUniEnt, AV62TFAlbRUniEnt_To, AV63TFAlbRUniUti, AV64TFAlbRUniUti_To, AV65TFAlbRUniDis, AV66TFAlbRUniDis_To, AV76TFAlbREst_Sels, AV82TFProceNom, AV83TFProceNom_Sel, AV84TFComposicion, AV85TFComposicion_Sel, AV91TFTipEntNom, AV92TFTipEntNom_Sel, AV93TFAlbRDes, AV94TFAlbRDes_Sel, AV97Pgmname, AV32OrderedBy, AV12OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV101Wcconsultaalmacentejidoencrudods_1_filterfulltext = AV14FilterFullText ;
      AV102Wcconsultaalmacentejidoencrudods_2_tfalbreccod = AV26TFAlbRecCod ;
      AV103Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to = AV27TFAlbRecCod_To ;
      AV104Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels = AV78TFAlbRReo_Sels ;
      AV105Wcconsultaalmacentejidoencrudods_5_tfalbrfen = AV33TFAlbRFen ;
      AV106Wcconsultaalmacentejidoencrudods_6_tfclicod = AV37TFCliCod ;
      AV107Wcconsultaalmacentejidoencrudods_7_tfclicod_to = AV38TFCliCod_To ;
      AV108Wcconsultaalmacentejidoencrudods_8_tfclinom = AV39TFCliNom ;
      AV109Wcconsultaalmacentejidoencrudods_9_tfclinom_sel = AV40TFCliNom_Sel ;
      AV110Wcconsultaalmacentejidoencrudods_10_tfalbref = AV41TFAlbRef ;
      AV111Wcconsultaalmacentejidoencrudods_11_tfalbref_sel = AV42TFAlbRef_Sel ;
      AV112Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc = AV43TFAlbRefDsc ;
      AV113Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel = AV44TFAlbRefDsc_Sel ;
      AV114Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli = AV45TFAlbRDisCli ;
      AV115Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel = AV46TFAlbRDisCli_Sel ;
      AV116Wcconsultaalmacentejidoencrudods_16_tfalbrtartd = AV47TFAlbRTartD ;
      AV117Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel = AV48TFAlbRTartD_Sel ;
      AV118Wcconsultaalmacentejidoencrudods_18_tfalbrlote = AV49TFAlbRLote ;
      AV119Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel = AV50TFAlbRLote_Sel ;
      AV120Wcconsultaalmacentejidoencrudods_20_tfalbrloc = AV51TFAlbRLoc ;
      AV121Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel = AV52TFAlbRLoc_Sel ;
      AV122Wcconsultaalmacentejidoencrudods_22_tfalbrpieent = AV53TFAlbRPieEnt ;
      AV123Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to = AV54TFAlbRPieEnt_To ;
      AV124Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti = AV55TFAlbRPieUti ;
      AV125Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to = AV56TFAlbRPieUti_To ;
      AV126Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis = AV57TFAlbRPieDis ;
      AV127Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to = AV58TFAlbRPieDis_To ;
      AV128Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels = AV60TFAlbRUni_Sels ;
      AV129Wcconsultaalmacentejidoencrudods_29_tfalbrunient = AV61TFAlbRUniEnt ;
      AV130Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to = AV62TFAlbRUniEnt_To ;
      AV131Wcconsultaalmacentejidoencrudods_31_tfalbruniuti = AV63TFAlbRUniUti ;
      AV132Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to = AV64TFAlbRUniUti_To ;
      AV133Wcconsultaalmacentejidoencrudods_33_tfalbrunidis = AV65TFAlbRUniDis ;
      AV134Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to = AV66TFAlbRUniDis_To ;
      AV135Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels = AV76TFAlbREst_Sels ;
      AV136Wcconsultaalmacentejidoencrudods_36_tfprocenom = AV82TFProceNom ;
      AV137Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel = AV83TFProceNom_Sel ;
      AV138Wcconsultaalmacentejidoencrudods_38_tfcomposicion = AV84TFComposicion ;
      AV139Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel = AV85TFComposicion_Sel ;
      AV140Wcconsultaalmacentejidoencrudods_40_tftipentnom = AV91TFTipEntNom ;
      AV141Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel = AV92TFTipEntNom_Sel ;
      AV142Wcconsultaalmacentejidoencrudods_42_tfalbrdes = AV93TFAlbRDes ;
      AV143Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel = AV94TFAlbRDes_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV67Emprcod, AV68Albrfen, AV69Albrfen_to, AV70Clicod, AV71Clicod_to, AV72AlbRef, AV88albref_to, AV80Procecod, AV81ProceCod_to, AV73AlbRReo, AV74AlbREst, AV90TipEntCod, AV89AlbRuni, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV14FilterFullText, AV26TFAlbRecCod, AV27TFAlbRecCod_To, AV78TFAlbRReo_Sels, AV33TFAlbRFen, AV37TFCliCod, AV38TFCliCod_To, AV39TFCliNom, AV40TFCliNom_Sel, AV41TFAlbRef, AV42TFAlbRef_Sel, AV43TFAlbRefDsc, AV44TFAlbRefDsc_Sel, AV45TFAlbRDisCli, AV46TFAlbRDisCli_Sel, AV47TFAlbRTartD, AV48TFAlbRTartD_Sel, AV49TFAlbRLote, AV50TFAlbRLote_Sel, AV51TFAlbRLoc, AV52TFAlbRLoc_Sel, AV53TFAlbRPieEnt, AV54TFAlbRPieEnt_To, AV55TFAlbRPieUti, AV56TFAlbRPieUti_To, AV57TFAlbRPieDis, AV58TFAlbRPieDis_To, AV60TFAlbRUni_Sels, AV61TFAlbRUniEnt, AV62TFAlbRUniEnt_To, AV63TFAlbRUniUti, AV64TFAlbRUniUti_To, AV65TFAlbRUniDis, AV66TFAlbRUniDis_To, AV76TFAlbREst_Sels, AV82TFProceNom, AV83TFProceNom_Sel, AV84TFComposicion, AV85TFComposicion_Sel, AV91TFTipEntNom, AV92TFTipEntNom_Sel, AV93TFAlbRDes, AV94TFAlbRDes_Sel, AV97Pgmname, AV32OrderedBy, AV12OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV101Wcconsultaalmacentejidoencrudods_1_filterfulltext = AV14FilterFullText ;
      AV102Wcconsultaalmacentejidoencrudods_2_tfalbreccod = AV26TFAlbRecCod ;
      AV103Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to = AV27TFAlbRecCod_To ;
      AV104Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels = AV78TFAlbRReo_Sels ;
      AV105Wcconsultaalmacentejidoencrudods_5_tfalbrfen = AV33TFAlbRFen ;
      AV106Wcconsultaalmacentejidoencrudods_6_tfclicod = AV37TFCliCod ;
      AV107Wcconsultaalmacentejidoencrudods_7_tfclicod_to = AV38TFCliCod_To ;
      AV108Wcconsultaalmacentejidoencrudods_8_tfclinom = AV39TFCliNom ;
      AV109Wcconsultaalmacentejidoencrudods_9_tfclinom_sel = AV40TFCliNom_Sel ;
      AV110Wcconsultaalmacentejidoencrudods_10_tfalbref = AV41TFAlbRef ;
      AV111Wcconsultaalmacentejidoencrudods_11_tfalbref_sel = AV42TFAlbRef_Sel ;
      AV112Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc = AV43TFAlbRefDsc ;
      AV113Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel = AV44TFAlbRefDsc_Sel ;
      AV114Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli = AV45TFAlbRDisCli ;
      AV115Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel = AV46TFAlbRDisCli_Sel ;
      AV116Wcconsultaalmacentejidoencrudods_16_tfalbrtartd = AV47TFAlbRTartD ;
      AV117Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel = AV48TFAlbRTartD_Sel ;
      AV118Wcconsultaalmacentejidoencrudods_18_tfalbrlote = AV49TFAlbRLote ;
      AV119Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel = AV50TFAlbRLote_Sel ;
      AV120Wcconsultaalmacentejidoencrudods_20_tfalbrloc = AV51TFAlbRLoc ;
      AV121Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel = AV52TFAlbRLoc_Sel ;
      AV122Wcconsultaalmacentejidoencrudods_22_tfalbrpieent = AV53TFAlbRPieEnt ;
      AV123Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to = AV54TFAlbRPieEnt_To ;
      AV124Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti = AV55TFAlbRPieUti ;
      AV125Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to = AV56TFAlbRPieUti_To ;
      AV126Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis = AV57TFAlbRPieDis ;
      AV127Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to = AV58TFAlbRPieDis_To ;
      AV128Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels = AV60TFAlbRUni_Sels ;
      AV129Wcconsultaalmacentejidoencrudods_29_tfalbrunient = AV61TFAlbRUniEnt ;
      AV130Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to = AV62TFAlbRUniEnt_To ;
      AV131Wcconsultaalmacentejidoencrudods_31_tfalbruniuti = AV63TFAlbRUniUti ;
      AV132Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to = AV64TFAlbRUniUti_To ;
      AV133Wcconsultaalmacentejidoencrudods_33_tfalbrunidis = AV65TFAlbRUniDis ;
      AV134Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to = AV66TFAlbRUniDis_To ;
      AV135Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels = AV76TFAlbREst_Sels ;
      AV136Wcconsultaalmacentejidoencrudods_36_tfprocenom = AV82TFProceNom ;
      AV137Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel = AV83TFProceNom_Sel ;
      AV138Wcconsultaalmacentejidoencrudods_38_tfcomposicion = AV84TFComposicion ;
      AV139Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel = AV85TFComposicion_Sel ;
      AV140Wcconsultaalmacentejidoencrudods_40_tftipentnom = AV91TFTipEntNom ;
      AV141Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel = AV92TFTipEntNom_Sel ;
      AV142Wcconsultaalmacentejidoencrudods_42_tfalbrdes = AV93TFAlbRDes ;
      AV143Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel = AV94TFAlbRDes_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV67Emprcod, AV68Albrfen, AV69Albrfen_to, AV70Clicod, AV71Clicod_to, AV72AlbRef, AV88albref_to, AV80Procecod, AV81ProceCod_to, AV73AlbRReo, AV74AlbREst, AV90TipEntCod, AV89AlbRuni, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV14FilterFullText, AV26TFAlbRecCod, AV27TFAlbRecCod_To, AV78TFAlbRReo_Sels, AV33TFAlbRFen, AV37TFCliCod, AV38TFCliCod_To, AV39TFCliNom, AV40TFCliNom_Sel, AV41TFAlbRef, AV42TFAlbRef_Sel, AV43TFAlbRefDsc, AV44TFAlbRefDsc_Sel, AV45TFAlbRDisCli, AV46TFAlbRDisCli_Sel, AV47TFAlbRTartD, AV48TFAlbRTartD_Sel, AV49TFAlbRLote, AV50TFAlbRLote_Sel, AV51TFAlbRLoc, AV52TFAlbRLoc_Sel, AV53TFAlbRPieEnt, AV54TFAlbRPieEnt_To, AV55TFAlbRPieUti, AV56TFAlbRPieUti_To, AV57TFAlbRPieDis, AV58TFAlbRPieDis_To, AV60TFAlbRUni_Sels, AV61TFAlbRUniEnt, AV62TFAlbRUniEnt_To, AV63TFAlbRUniUti, AV64TFAlbRUniUti_To, AV65TFAlbRUniDis, AV66TFAlbRUniDis_To, AV76TFAlbREst_Sels, AV82TFProceNom, AV83TFProceNom_Sel, AV84TFComposicion, AV85TFComposicion_Sel, AV91TFTipEntNom, AV92TFTipEntNom_Sel, AV93TFAlbRDes, AV94TFAlbRDes_Sel, AV97Pgmname, AV32OrderedBy, AV12OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV101Wcconsultaalmacentejidoencrudods_1_filterfulltext = AV14FilterFullText ;
      AV102Wcconsultaalmacentejidoencrudods_2_tfalbreccod = AV26TFAlbRecCod ;
      AV103Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to = AV27TFAlbRecCod_To ;
      AV104Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels = AV78TFAlbRReo_Sels ;
      AV105Wcconsultaalmacentejidoencrudods_5_tfalbrfen = AV33TFAlbRFen ;
      AV106Wcconsultaalmacentejidoencrudods_6_tfclicod = AV37TFCliCod ;
      AV107Wcconsultaalmacentejidoencrudods_7_tfclicod_to = AV38TFCliCod_To ;
      AV108Wcconsultaalmacentejidoencrudods_8_tfclinom = AV39TFCliNom ;
      AV109Wcconsultaalmacentejidoencrudods_9_tfclinom_sel = AV40TFCliNom_Sel ;
      AV110Wcconsultaalmacentejidoencrudods_10_tfalbref = AV41TFAlbRef ;
      AV111Wcconsultaalmacentejidoencrudods_11_tfalbref_sel = AV42TFAlbRef_Sel ;
      AV112Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc = AV43TFAlbRefDsc ;
      AV113Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel = AV44TFAlbRefDsc_Sel ;
      AV114Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli = AV45TFAlbRDisCli ;
      AV115Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel = AV46TFAlbRDisCli_Sel ;
      AV116Wcconsultaalmacentejidoencrudods_16_tfalbrtartd = AV47TFAlbRTartD ;
      AV117Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel = AV48TFAlbRTartD_Sel ;
      AV118Wcconsultaalmacentejidoencrudods_18_tfalbrlote = AV49TFAlbRLote ;
      AV119Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel = AV50TFAlbRLote_Sel ;
      AV120Wcconsultaalmacentejidoencrudods_20_tfalbrloc = AV51TFAlbRLoc ;
      AV121Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel = AV52TFAlbRLoc_Sel ;
      AV122Wcconsultaalmacentejidoencrudods_22_tfalbrpieent = AV53TFAlbRPieEnt ;
      AV123Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to = AV54TFAlbRPieEnt_To ;
      AV124Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti = AV55TFAlbRPieUti ;
      AV125Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to = AV56TFAlbRPieUti_To ;
      AV126Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis = AV57TFAlbRPieDis ;
      AV127Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to = AV58TFAlbRPieDis_To ;
      AV128Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels = AV60TFAlbRUni_Sels ;
      AV129Wcconsultaalmacentejidoencrudods_29_tfalbrunient = AV61TFAlbRUniEnt ;
      AV130Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to = AV62TFAlbRUniEnt_To ;
      AV131Wcconsultaalmacentejidoencrudods_31_tfalbruniuti = AV63TFAlbRUniUti ;
      AV132Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to = AV64TFAlbRUniUti_To ;
      AV133Wcconsultaalmacentejidoencrudods_33_tfalbrunidis = AV65TFAlbRUniDis ;
      AV134Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to = AV66TFAlbRUniDis_To ;
      AV135Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels = AV76TFAlbREst_Sels ;
      AV136Wcconsultaalmacentejidoencrudods_36_tfprocenom = AV82TFProceNom ;
      AV137Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel = AV83TFProceNom_Sel ;
      AV138Wcconsultaalmacentejidoencrudods_38_tfcomposicion = AV84TFComposicion ;
      AV139Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel = AV85TFComposicion_Sel ;
      AV140Wcconsultaalmacentejidoencrudods_40_tftipentnom = AV91TFTipEntNom ;
      AV141Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel = AV92TFTipEntNom_Sel ;
      AV142Wcconsultaalmacentejidoencrudods_42_tfalbrdes = AV93TFAlbRDes ;
      AV143Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel = AV94TFAlbRDes_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV67Emprcod, AV68Albrfen, AV69Albrfen_to, AV70Clicod, AV71Clicod_to, AV72AlbRef, AV88albref_to, AV80Procecod, AV81ProceCod_to, AV73AlbRReo, AV74AlbREst, AV90TipEntCod, AV89AlbRuni, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV14FilterFullText, AV26TFAlbRecCod, AV27TFAlbRecCod_To, AV78TFAlbRReo_Sels, AV33TFAlbRFen, AV37TFCliCod, AV38TFCliCod_To, AV39TFCliNom, AV40TFCliNom_Sel, AV41TFAlbRef, AV42TFAlbRef_Sel, AV43TFAlbRefDsc, AV44TFAlbRefDsc_Sel, AV45TFAlbRDisCli, AV46TFAlbRDisCli_Sel, AV47TFAlbRTartD, AV48TFAlbRTartD_Sel, AV49TFAlbRLote, AV50TFAlbRLote_Sel, AV51TFAlbRLoc, AV52TFAlbRLoc_Sel, AV53TFAlbRPieEnt, AV54TFAlbRPieEnt_To, AV55TFAlbRPieUti, AV56TFAlbRPieUti_To, AV57TFAlbRPieDis, AV58TFAlbRPieDis_To, AV60TFAlbRUni_Sels, AV61TFAlbRUniEnt, AV62TFAlbRUniEnt_To, AV63TFAlbRUniUti, AV64TFAlbRUniUti_To, AV65TFAlbRUniDis, AV66TFAlbRUniDis_To, AV76TFAlbREst_Sels, AV82TFProceNom, AV83TFProceNom_Sel, AV84TFComposicion, AV85TFComposicion_Sel, AV91TFTipEntNom, AV92TFTipEntNom_Sel, AV93TFAlbRDes, AV94TFAlbRDes_Sel, AV97Pgmname, AV32OrderedBy, AV12OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV97Pgmname = "WCConsultaAlmacenTejidoencrudo" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV97Pgmname", AV97Pgmname);
      Gx_err = (short)(0) ;
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavAlbrent2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlbrent2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbrent2_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1660( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e191662 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV23ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV28DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV20ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_41 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_41"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV30GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV31GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV67Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV67Emprcod") ;
         wcpOAV68Albrfen = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV68Albrfen"), 0) ;
         wcpOAV69Albrfen_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV69Albrfen_to"), 0) ;
         wcpOAV70Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV70Clicod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV71Clicod_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV71Clicod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV72AlbRef = httpContext.cgiGet( sPrefix+"wcpOAV72AlbRef") ;
         wcpOAV88albref_to = httpContext.cgiGet( sPrefix+"wcpOAV88albref_to") ;
         wcpOAV80Procecod = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV80Procecod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV81ProceCod_to = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV81ProceCod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV73AlbRReo = httpContext.cgiGet( sPrefix+"wcpOAV73AlbRReo") ;
         wcpOAV74AlbREst = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV74AlbREst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV90TipEntCod = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV90TipEntCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV89AlbRuni = httpContext.cgiGet( sPrefix+"wcpOAV89AlbRuni") ;
         AV67Emprcod = httpContext.cgiGet( sPrefix+"vEMPRCOD") ;
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
         Ddo_grid_Allowmultipleselection = httpContext.cgiGet( sPrefix+"DDO_GRID_Allowmultipleselection") ;
         Ddo_grid_Datalistfixedvalues = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalistfixedvalues") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalistproc") ;
         Ddo_gridcolumnsselector_Caption = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption") ;
         Ddo_gridcolumnsselector_Tooltip = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip") ;
         Ddo_gridcolumnsselector_Cls = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls") ;
         Ddo_gridcolumnsselector_Dropdownoptionstype = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype") ;
         Ddo_gridcolumnsselector_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname") ;
         Ddo_gridcolumnsselector_Titlecontrolidtoreplace = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace") ;
         Detailwebcomponent_modal_Width = httpContext.cgiGet( sPrefix+"DETAILWEBCOMPONENT_MODAL_Width") ;
         Detailwebcomponent_modal_Title = httpContext.cgiGet( sPrefix+"DETAILWEBCOMPONENT_MODAL_Title") ;
         Detailwebcomponent_modal_Confirmtype = httpContext.cgiGet( sPrefix+"DETAILWEBCOMPONENT_MODAL_Confirmtype") ;
         Detailwebcomponent_modal_Bodytype = httpContext.cgiGet( sPrefix+"DETAILWEBCOMPONENT_MODAL_Bodytype") ;
         Grid_titlescategories_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_TITLESCATEGORIES_Gridinternalname") ;
         Grid_titlescategories_Gridtitlescategories = httpContext.cgiGet( sPrefix+"GRID_TITLESCATEGORIES_Gridtitlescategories") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hascategories = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hascategories")) ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Hascolumnsselector = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hascolumnsselector")) ;
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
         /* Read variables values. */
         AV14FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14FilterFullText", AV14FilterFullText);
         AV97Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV97Pgmname", AV97Pgmname);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_albrfenauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_ALBRFENAUXDATE");
            GX_FocusControl = edtavDdo_albrfenauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV35DDO_AlbRFenAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35DDO_AlbRFenAuxDate", localUtil.format(AV35DDO_AlbRFenAuxDate, "99/99/99"));
         }
         else
         {
            AV35DDO_AlbRFenAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_albrfenauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35DDO_AlbRFenAuxDate", localUtil.format(AV35DDO_AlbRFenAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         nGXsfl_41_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_412( ) ;
         if ( nGXsfl_41_idx > 0 )
         {
            AV79DetailWebComponent = httpContext.cgiGet( edtavDetailwebcomponent_Internalname) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDetailwebcomponent_Internalname, AV79DetailWebComponent);
            A44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            cmbAlbRReo.setName( cmbAlbRReo.getInternalname() );
            cmbAlbRReo.setValue( httpContext.cgiGet( cmbAlbRReo.getInternalname()) );
            A55AlbRReo = httpContext.cgiGet( cmbAlbRReo.getInternalname()) ;
            A49AlbRFen = localUtil.ctod( httpContext.cgiGet( edtAlbRFen_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV15AlbREnt2 = httpContext.cgiGet( edtavAlbrent2_Internalname) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavAlbrent2_Internalname, AV15AlbREnt2);
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            A45AlbRef = httpContext.cgiGet( edtAlbRef_Internalname) ;
            A3613AlbRefDsc = httpContext.cgiGet( edtAlbRefDsc_Internalname) ;
            A3359AlbRDisCli = httpContext.cgiGet( edtAlbRDisCli_Internalname) ;
            A6264AlbRTartD = httpContext.cgiGet( edtAlbRTartD_Internalname) ;
            n6264AlbRTartD = false ;
            A6463AlbRLote = httpContext.cgiGet( edtAlbRLote_Internalname) ;
            A50AlbRLoc = httpContext.cgiGet( edtAlbRLoc_Internalname) ;
            A52AlbRPieEnt = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A54AlbRPieUti = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieUti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A51AlbRPieDis = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieDis_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            cmbAlbRUni.setName( cmbAlbRUni.getInternalname() );
            cmbAlbRUni.setValue( httpContext.cgiGet( cmbAlbRUni.getInternalname()) );
            A56AlbRUni = httpContext.cgiGet( cmbAlbRUni.getInternalname()) ;
            A58AlbRUniEnt = localUtil.ctond( httpContext.cgiGet( edtAlbRUniEnt_Internalname)) ;
            A60AlbRUniUti = localUtil.ctond( httpContext.cgiGet( edtAlbRUniUti_Internalname)) ;
            A57AlbRUniDis = localUtil.ctond( httpContext.cgiGet( edtAlbRUniDis_Internalname)) ;
            cmbAlbREst.setName( cmbAlbREst.getInternalname() );
            cmbAlbREst.setValue( httpContext.cgiGet( cmbAlbREst.getInternalname()) );
            A47AlbREst = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbREst.getInternalname()))) ;
            A971ProceNom = httpContext.cgiGet( edtProceNom_Internalname) ;
            n971ProceNom = false ;
            A13981Composicio = httpContext.cgiGet( edtComposicio_Internalname) ;
            A1212TipEntNom = httpContext.cgiGet( edtTipEntNom_Internalname) ;
            n1212TipEntNom = false ;
            A1291AlbRDes = httpContext.cgiGet( edtAlbRDes_Internalname) ;
            A13982AlbRArtLu = localUtil.ctond( httpContext.cgiGet( edtAlbRArtLu_Internalname)) ;
            n13982AlbRArtLu = false ;
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"WCConsultaAlmacenTejidoencrudo");
         AV97Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV97Pgmname", AV97Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV97Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("wcconsultaalmacentejidoencrudo:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e191662 ();
      if (returnInSub) return;
   }

   public void e191662( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV98Station ;
      GXv_char5[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char5) ;
      wcconsultaalmacentejidoencrudo_impl.this.GXt_char1 = GXv_char5[0] ;
      AV98Station = GXt_char1 ;
      GXv_char5[0] = AV67Emprcod ;
      GXv_char4[0] = AV99Emprnom ;
      GXv_char2[0] = AV100Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV98Station, GXv_char5, GXv_char4, GXv_char2) ;
      wcconsultaalmacentejidoencrudo_impl.this.AV67Emprcod = GXv_char5[0] ;
      wcconsultaalmacentejidoencrudo_impl.this.AV99Emprnom = GXv_char4[0] ;
      wcconsultaalmacentejidoencrudo_impl.this.AV100Usurcod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67Emprcod", AV67Emprcod);
      divCell_grid_dwc_Class = "Invisible WCD_"+GXutil.upper( subGrid_Internalname) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, divCell_grid_dwc_Internalname, "Class", divCell_grid_dwc_Class, true);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      Grid_titlescategories_Gridinternalname = subGrid_Internalname ;
      ucGrid_titlescategories.sendProperty(context, sPrefix, false, Grid_titlescategories_Internalname, "GridInternalName", Grid_titlescategories_Gridinternalname);
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
      if ( AV32OrderedBy < 1 )
      {
         AV32OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32OrderedBy), 4, 0));
         AV12OrderedDsc = true ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedDsc", AV12OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = AV28DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] ;
      AV28DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e201662( )
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
      if ( GXutil.strcmp(AV22Session.getValue("WCConsultaAlmacenTejidoencrudoColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV22Session.getValue("WCConsultaAlmacenTejidoencrudoColumnsSelector") ;
         AV20ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtAlbRecCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbRecCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Visible), 5, 0), !bGXsfl_41_Refreshing);
      cmbAlbRReo.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlbRReo.getInternalname(), "Visible", GXutil.ltrimstr( cmbAlbRReo.getVisible(), 5, 0), !bGXsfl_41_Refreshing);
      edtAlbRFen_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbRFen_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRFen_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavAlbrent2_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlbrent2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbrent2_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtCliCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtCliNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtAlbRef_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbRef_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRef_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtAlbRefDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbRefDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRefDsc_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtAlbRDisCli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbRDisCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRDisCli_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtAlbRTartD_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbRTartD_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRTartD_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtAlbRLote_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbRLote_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRLote_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtAlbRLoc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbRLoc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRLoc_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtAlbRPieEnt_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbRPieEnt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieEnt_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtAlbRPieUti_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbRPieUti_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieUti_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtAlbRPieDis_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbRPieDis_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieDis_Visible), 5, 0), !bGXsfl_41_Refreshing);
      cmbAlbRUni.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlbRUni.getInternalname(), "Visible", GXutil.ltrimstr( cmbAlbRUni.getVisible(), 5, 0), !bGXsfl_41_Refreshing);
      edtAlbRUniEnt_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbRUniEnt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniEnt_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtAlbRUniUti_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbRUniUti_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniUti_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtAlbRUniDis_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbRUniDis_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniDis_Visible), 5, 0), !bGXsfl_41_Refreshing);
      cmbAlbREst.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlbREst.getInternalname(), "Visible", GXutil.ltrimstr( cmbAlbREst.getVisible(), 5, 0), !bGXsfl_41_Refreshing);
      edtProceNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtProceNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProceNom_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtComposicio_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtComposicio_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtComposicio_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtTipEntNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtTipEntNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipEntNom_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtAlbRDes_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbRDes_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRDes_Visible), 5, 0), !bGXsfl_41_Refreshing);
      AV30GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30GridCurrentPage), 10, 0));
      AV31GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31GridPageCount), 10, 0));
      AV101Wcconsultaalmacentejidoencrudods_1_filterfulltext = AV14FilterFullText ;
      AV102Wcconsultaalmacentejidoencrudods_2_tfalbreccod = AV26TFAlbRecCod ;
      AV103Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to = AV27TFAlbRecCod_To ;
      AV104Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels = AV78TFAlbRReo_Sels ;
      AV105Wcconsultaalmacentejidoencrudods_5_tfalbrfen = AV33TFAlbRFen ;
      AV106Wcconsultaalmacentejidoencrudods_6_tfclicod = AV37TFCliCod ;
      AV107Wcconsultaalmacentejidoencrudods_7_tfclicod_to = AV38TFCliCod_To ;
      AV108Wcconsultaalmacentejidoencrudods_8_tfclinom = AV39TFCliNom ;
      AV109Wcconsultaalmacentejidoencrudods_9_tfclinom_sel = AV40TFCliNom_Sel ;
      AV110Wcconsultaalmacentejidoencrudods_10_tfalbref = AV41TFAlbRef ;
      AV111Wcconsultaalmacentejidoencrudods_11_tfalbref_sel = AV42TFAlbRef_Sel ;
      AV112Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc = AV43TFAlbRefDsc ;
      AV113Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel = AV44TFAlbRefDsc_Sel ;
      AV114Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli = AV45TFAlbRDisCli ;
      AV115Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel = AV46TFAlbRDisCli_Sel ;
      AV116Wcconsultaalmacentejidoencrudods_16_tfalbrtartd = AV47TFAlbRTartD ;
      AV117Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel = AV48TFAlbRTartD_Sel ;
      AV118Wcconsultaalmacentejidoencrudods_18_tfalbrlote = AV49TFAlbRLote ;
      AV119Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel = AV50TFAlbRLote_Sel ;
      AV120Wcconsultaalmacentejidoencrudods_20_tfalbrloc = AV51TFAlbRLoc ;
      AV121Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel = AV52TFAlbRLoc_Sel ;
      AV122Wcconsultaalmacentejidoencrudods_22_tfalbrpieent = AV53TFAlbRPieEnt ;
      AV123Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to = AV54TFAlbRPieEnt_To ;
      AV124Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti = AV55TFAlbRPieUti ;
      AV125Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to = AV56TFAlbRPieUti_To ;
      AV126Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis = AV57TFAlbRPieDis ;
      AV127Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to = AV58TFAlbRPieDis_To ;
      AV128Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels = AV60TFAlbRUni_Sels ;
      AV129Wcconsultaalmacentejidoencrudods_29_tfalbrunient = AV61TFAlbRUniEnt ;
      AV130Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to = AV62TFAlbRUniEnt_To ;
      AV131Wcconsultaalmacentejidoencrudods_31_tfalbruniuti = AV63TFAlbRUniUti ;
      AV132Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to = AV64TFAlbRUniUti_To ;
      AV133Wcconsultaalmacentejidoencrudods_33_tfalbrunidis = AV65TFAlbRUniDis ;
      AV134Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to = AV66TFAlbRUniDis_To ;
      AV135Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels = AV76TFAlbREst_Sels ;
      AV136Wcconsultaalmacentejidoencrudods_36_tfprocenom = AV82TFProceNom ;
      AV137Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel = AV83TFProceNom_Sel ;
      AV138Wcconsultaalmacentejidoencrudods_38_tfcomposicion = AV84TFComposicion ;
      AV139Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel = AV85TFComposicion_Sel ;
      AV140Wcconsultaalmacentejidoencrudods_40_tftipentnom = AV91TFTipEntNom ;
      AV141Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel = AV92TFTipEntNom_Sel ;
      AV142Wcconsultaalmacentejidoencrudods_42_tfalbrdes = AV93TFAlbRDes ;
      AV143Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel = AV94TFAlbRDes_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e121662( )
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
         AV29PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV29PageToGo) ;
      }
   }

   public void e131662( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e141662( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV32OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32OrderedBy), 4, 0));
         AV12OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedDsc", AV12OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRecCod") == 0 )
         {
            AV26TFAlbRecCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFAlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFAlbRecCod), 8, 0));
            AV27TFAlbRecCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFAlbRecCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFAlbRecCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRReo") == 0 )
         {
            AV77TFAlbRReo_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77TFAlbRReo_SelsJson", AV77TFAlbRReo_SelsJson);
            AV78TFAlbRReo_Sels.fromJSonString(AV77TFAlbRReo_SelsJson, null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRFen") == 0 )
         {
            AV33TFAlbRFen = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFAlbRFen", localUtil.format(AV33TFAlbRFen, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliCod") == 0 )
         {
            AV37TFCliCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFCliCod), 6, 0));
            AV38TFCliCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliNom") == 0 )
         {
            AV39TFCliNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFCliNom", AV39TFCliNom);
            AV40TFCliNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFCliNom_Sel", AV40TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRef") == 0 )
         {
            AV41TFAlbRef = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFAlbRef", AV41TFAlbRef);
            AV42TFAlbRef_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFAlbRef_Sel", AV42TFAlbRef_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRefDsc") == 0 )
         {
            AV43TFAlbRefDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFAlbRefDsc", AV43TFAlbRefDsc);
            AV44TFAlbRefDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFAlbRefDsc_Sel", AV44TFAlbRefDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRDisCli") == 0 )
         {
            AV45TFAlbRDisCli = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFAlbRDisCli", AV45TFAlbRDisCli);
            AV46TFAlbRDisCli_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFAlbRDisCli_Sel", AV46TFAlbRDisCli_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRTartD") == 0 )
         {
            AV47TFAlbRTartD = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFAlbRTartD", AV47TFAlbRTartD);
            AV48TFAlbRTartD_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFAlbRTartD_Sel", AV48TFAlbRTartD_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRLote") == 0 )
         {
            AV49TFAlbRLote = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFAlbRLote", AV49TFAlbRLote);
            AV50TFAlbRLote_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFAlbRLote_Sel", AV50TFAlbRLote_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRLoc") == 0 )
         {
            AV51TFAlbRLoc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFAlbRLoc", AV51TFAlbRLoc);
            AV52TFAlbRLoc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFAlbRLoc_Sel", AV52TFAlbRLoc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRPieEnt") == 0 )
         {
            AV53TFAlbRPieEnt = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFAlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53TFAlbRPieEnt), 6, 0));
            AV54TFAlbRPieEnt_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFAlbRPieEnt_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54TFAlbRPieEnt_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRPieUti") == 0 )
         {
            AV55TFAlbRPieUti = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFAlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFAlbRPieUti), 6, 0));
            AV56TFAlbRPieUti_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFAlbRPieUti_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TFAlbRPieUti_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRPieDis") == 0 )
         {
            AV57TFAlbRPieDis = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFAlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57TFAlbRPieDis), 6, 0));
            AV58TFAlbRPieDis_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFAlbRPieDis_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58TFAlbRPieDis_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRUni") == 0 )
         {
            AV59TFAlbRUni_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFAlbRUni_SelsJson", AV59TFAlbRUni_SelsJson);
            AV60TFAlbRUni_Sels.fromJSonString(AV59TFAlbRUni_SelsJson, null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRUniEnt") == 0 )
         {
            AV61TFAlbRUniEnt = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFAlbRUniEnt", GXutil.ltrimstr( AV61TFAlbRUniEnt, 9, 2));
            AV62TFAlbRUniEnt_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFAlbRUniEnt_To", GXutil.ltrimstr( AV62TFAlbRUniEnt_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRUniUti") == 0 )
         {
            AV63TFAlbRUniUti = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFAlbRUniUti", GXutil.ltrimstr( AV63TFAlbRUniUti, 9, 2));
            AV64TFAlbRUniUti_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFAlbRUniUti_To", GXutil.ltrimstr( AV64TFAlbRUniUti_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRUniDis") == 0 )
         {
            AV65TFAlbRUniDis = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFAlbRUniDis", GXutil.ltrimstr( AV65TFAlbRUniDis, 9, 2));
            AV66TFAlbRUniDis_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFAlbRUniDis_To", GXutil.ltrimstr( AV66TFAlbRUniDis_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbREst") == 0 )
         {
            AV75TFAlbREst_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75TFAlbREst_SelsJson", AV75TFAlbREst_SelsJson);
            AV76TFAlbREst_Sels.fromJSonString(GXutil.strReplace( AV75TFAlbREst_SelsJson, "\"", ""), null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProceNom") == 0 )
         {
            AV82TFProceNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82TFProceNom", AV82TFProceNom);
            AV83TFProceNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83TFProceNom_Sel", AV83TFProceNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Composicion") == 0 )
         {
            AV84TFComposicion = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84TFComposicion", AV84TFComposicion);
            AV85TFComposicion_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV85TFComposicion_Sel", AV85TFComposicion_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "TipEntNom") == 0 )
         {
            AV91TFTipEntNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91TFTipEntNom", AV91TFTipEntNom);
            AV92TFTipEntNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92TFTipEntNom_Sel", AV92TFTipEntNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRDes") == 0 )
         {
            AV93TFAlbRDes = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV93TFAlbRDes", AV93TFAlbRDes);
            AV94TFAlbRDes_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV94TFAlbRDes_Sel", AV94TFAlbRDes_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV76TFAlbREst_Sels", AV76TFAlbREst_Sels);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV60TFAlbRUni_Sels", AV60TFAlbRUni_Sels);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV78TFAlbRReo_Sels", AV78TFAlbRReo_Sels);
   }

   private void e211662( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         AV79DetailWebComponent = "<i class=\"fas fa-angle-right ArrowIcon\"></i>" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDetailwebcomponent_Internalname, AV79DetailWebComponent);
         AV15AlbREnt2 = ((GXutil.strcmp("", A5806AlbREnt2)==0) ? A46AlbREnt : A5806AlbREnt2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavAlbrent2_Internalname, AV15AlbREnt2);
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
   }

   public void e151662( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV18ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV20ColumnsSelector.fromJSonString(AV18ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "WCConsultaAlmacenTejidoencrudoColumnsSelector", ((GXutil.strcmp("", AV18ColumnsSelectorXML)==0) ? "" : AV20ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e111662( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("WCConsultaAlmacenTejidoencrudoFilters")),GXutil.URLEncode(GXutil.rtrim(AV97Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("WCConsultaAlmacenTejidoencrudoFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV24ManageFiltersXml ;
         GXv_char5[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "WCConsultaAlmacenTejidoencrudoFilters", Ddo_managefilters_Activeeventkey, GXv_char5) ;
         wcconsultaalmacentejidoencrudo_impl.this.GXt_char1 = GXv_char5[0] ;
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
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV97Pgmname+"GridState", AV24ManageFiltersXml) ;
            AV10GridState.fromxml(AV24ManageFiltersXml, null, null);
            AV32OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32OrderedBy), 4, 0));
            AV12OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedDsc", AV12OrderedDsc);
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
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV78TFAlbRReo_Sels", AV78TFAlbRReo_Sels);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV60TFAlbRUni_Sels", AV60TFAlbRUni_Sels);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV76TFAlbREst_Sels", AV76TFAlbREst_Sels);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ManageFiltersData", AV23ManageFiltersData);
   }

   public void e161662( )
   {
      /* Detailwebcomponent_modal_Close Routine */
      returnInSub = false ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e171662( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char5[0] = AV16ExcelFilename ;
      GXv_char4[0] = AV17ErrorMessage ;
      new app.wcconsultaalmacentejidoencrudoexport(remoteHandle, context).execute( GXv_char5, GXv_char4) ;
      wcconsultaalmacentejidoencrudo_impl.this.AV16ExcelFilename = GXv_char5[0] ;
      wcconsultaalmacentejidoencrudo_impl.this.AV17ErrorMessage = GXv_char4[0] ;
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

   public void e181662( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.wcconsultaalmacentejidoencrudoexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV32OrderedBy, 4, 0))+":"+(AV12OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV20ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector9[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "AlbRecCod", "", "N Recepcion", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "AlbRReo", "", "Rec?", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "AlbRFen", "", "Fecha", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "&AlbREnt2", "", "Nº Documento", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "CliCod", "", "Codigo", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "CliNom", "", "Cliente", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "AlbRef", "", "Referencia", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "AlbRefDsc", "", "Descripcion", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "AlbRDisCli", "", "Disp. Cliente", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "AlbRTartD", "", "Tipo Articulo", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "AlbRLote", "", "Lote", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "AlbRLoc", "", "Localizacion", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "AlbRPieEnt", "Piezas", "Entradas", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "AlbRPieUti", "Piezas", "Utilizadas", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "AlbRPieDis", "Piezas", "Disponibles", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "AlbRUni", "", "Und", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "AlbRUniEnt", "Unidades", "Entradas", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "AlbRUniUti", "Unidades", "Utilizadas", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "AlbRUniDis", "Unidades", "Disponibles", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "AlbREst", "", "Estado", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "ProceNom", "", "Procedencia", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "Composicion", "", "Composicion", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "TipEntNom", "", "Tipo Entrada", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "AlbRDes", "", "Destino", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXt_char1 = AV19UserCustomValue ;
      GXv_char5[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WCConsultaAlmacenTejidoencrudoColumnsSelector", GXv_char5) ;
      wcconsultaalmacentejidoencrudo_impl.this.GXt_char1 = GXv_char5[0] ;
      AV19UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV19UserCustomValue)==0) ) )
      {
         AV21ColumnsSelectorAux.fromxml(AV19UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector9[0] = AV21ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, GXv_SdtWWPColumnsSelector10) ;
         AV21ColumnsSelectorAux = GXv_SdtWWPColumnsSelector9[0] ;
         AV20ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item11 = AV23ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item12[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item11 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "WCConsultaAlmacenTejidoencrudoFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item12) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item11 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item12[0] ;
      AV23ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item11 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV14FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14FilterFullText", AV14FilterFullText);
      AV26TFAlbRecCod = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFAlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFAlbRecCod), 8, 0));
      AV27TFAlbRecCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFAlbRecCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFAlbRecCod_To), 8, 0));
      AV78TFAlbRReo_Sels = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV33TFAlbRFen = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFAlbRFen", localUtil.format(AV33TFAlbRFen, "99/99/99"));
      AV37TFCliCod = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFCliCod), 6, 0));
      AV38TFCliCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38TFCliCod_To), 6, 0));
      AV39TFCliNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFCliNom", AV39TFCliNom);
      AV40TFCliNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFCliNom_Sel", AV40TFCliNom_Sel);
      AV41TFAlbRef = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFAlbRef", AV41TFAlbRef);
      AV42TFAlbRef_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFAlbRef_Sel", AV42TFAlbRef_Sel);
      AV43TFAlbRefDsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFAlbRefDsc", AV43TFAlbRefDsc);
      AV44TFAlbRefDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFAlbRefDsc_Sel", AV44TFAlbRefDsc_Sel);
      AV45TFAlbRDisCli = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFAlbRDisCli", AV45TFAlbRDisCli);
      AV46TFAlbRDisCli_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFAlbRDisCli_Sel", AV46TFAlbRDisCli_Sel);
      AV47TFAlbRTartD = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFAlbRTartD", AV47TFAlbRTartD);
      AV48TFAlbRTartD_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFAlbRTartD_Sel", AV48TFAlbRTartD_Sel);
      AV49TFAlbRLote = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFAlbRLote", AV49TFAlbRLote);
      AV50TFAlbRLote_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFAlbRLote_Sel", AV50TFAlbRLote_Sel);
      AV51TFAlbRLoc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFAlbRLoc", AV51TFAlbRLoc);
      AV52TFAlbRLoc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFAlbRLoc_Sel", AV52TFAlbRLoc_Sel);
      AV53TFAlbRPieEnt = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFAlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53TFAlbRPieEnt), 6, 0));
      AV54TFAlbRPieEnt_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFAlbRPieEnt_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54TFAlbRPieEnt_To), 6, 0));
      AV55TFAlbRPieUti = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFAlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFAlbRPieUti), 6, 0));
      AV56TFAlbRPieUti_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFAlbRPieUti_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TFAlbRPieUti_To), 6, 0));
      AV57TFAlbRPieDis = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFAlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57TFAlbRPieDis), 6, 0));
      AV58TFAlbRPieDis_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFAlbRPieDis_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58TFAlbRPieDis_To), 6, 0));
      AV60TFAlbRUni_Sels = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV61TFAlbRUniEnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFAlbRUniEnt", GXutil.ltrimstr( AV61TFAlbRUniEnt, 9, 2));
      AV62TFAlbRUniEnt_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFAlbRUniEnt_To", GXutil.ltrimstr( AV62TFAlbRUniEnt_To, 9, 2));
      AV63TFAlbRUniUti = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFAlbRUniUti", GXutil.ltrimstr( AV63TFAlbRUniUti, 9, 2));
      AV64TFAlbRUniUti_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFAlbRUniUti_To", GXutil.ltrimstr( AV64TFAlbRUniUti_To, 9, 2));
      AV65TFAlbRUniDis = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFAlbRUniDis", GXutil.ltrimstr( AV65TFAlbRUniDis, 9, 2));
      AV66TFAlbRUniDis_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFAlbRUniDis_To", GXutil.ltrimstr( AV66TFAlbRUniDis_To, 9, 2));
      AV76TFAlbREst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "") ;
      AV82TFProceNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82TFProceNom", AV82TFProceNom);
      AV83TFProceNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83TFProceNom_Sel", AV83TFProceNom_Sel);
      AV84TFComposicion = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84TFComposicion", AV84TFComposicion);
      AV85TFComposicion_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV85TFComposicion_Sel", AV85TFComposicion_Sel);
      AV91TFTipEntNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91TFTipEntNom", AV91TFTipEntNom);
      AV92TFTipEntNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92TFTipEntNom_Sel", AV92TFTipEntNom_Sel);
      AV93TFAlbRDes = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV93TFAlbRDes", AV93TFAlbRDes);
      AV94TFAlbRDes_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV94TFAlbRDes_Sel", AV94TFAlbRDes_Sel);
      Ddo_grid_Selectedvalue_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      Ddo_grid_Filteredtext_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV22Session.getValue(AV97Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV97Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV22Session.getValue(AV97Pgmname+"GridState"), null, null);
      }
      AV32OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32OrderedBy), 4, 0));
      AV12OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedDsc", AV12OrderedDsc);
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
      AV144GXV1 = 1 ;
      while ( AV144GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV144GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV14FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14FilterFullText", AV14FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECCOD") == 0 )
         {
            AV26TFAlbRecCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFAlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFAlbRecCod), 8, 0));
            AV27TFAlbRecCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFAlbRecCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFAlbRecCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRREO_SEL") == 0 )
         {
            AV77TFAlbRReo_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77TFAlbRReo_SelsJson", AV77TFAlbRReo_SelsJson);
            AV78TFAlbRReo_Sels.fromJSonString(AV77TFAlbRReo_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRFEN") == 0 )
         {
            AV33TFAlbRFen = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFAlbRFen", localUtil.format(AV33TFAlbRFen, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV37TFCliCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFCliCod), 6, 0));
            AV38TFCliCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV39TFCliNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFCliNom", AV39TFCliNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV40TFCliNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFCliNom_Sel", AV40TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF") == 0 )
         {
            AV41TFAlbRef = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFAlbRef", AV41TFAlbRef);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF_SEL") == 0 )
         {
            AV42TFAlbRef_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFAlbRef_Sel", AV42TFAlbRef_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREFDSC") == 0 )
         {
            AV43TFAlbRefDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFAlbRefDsc", AV43TFAlbRefDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREFDSC_SEL") == 0 )
         {
            AV44TFAlbRefDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFAlbRefDsc_Sel", AV44TFAlbRefDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRDISCLI") == 0 )
         {
            AV45TFAlbRDisCli = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFAlbRDisCli", AV45TFAlbRDisCli);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRDISCLI_SEL") == 0 )
         {
            AV46TFAlbRDisCli_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFAlbRDisCli_Sel", AV46TFAlbRDisCli_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRTARTD") == 0 )
         {
            AV47TFAlbRTartD = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFAlbRTartD", AV47TFAlbRTartD);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRTARTD_SEL") == 0 )
         {
            AV48TFAlbRTartD_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFAlbRTartD_Sel", AV48TFAlbRTartD_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRLOTE") == 0 )
         {
            AV49TFAlbRLote = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFAlbRLote", AV49TFAlbRLote);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRLOTE_SEL") == 0 )
         {
            AV50TFAlbRLote_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFAlbRLote_Sel", AV50TFAlbRLote_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRLOC") == 0 )
         {
            AV51TFAlbRLoc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFAlbRLoc", AV51TFAlbRLoc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRLOC_SEL") == 0 )
         {
            AV52TFAlbRLoc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFAlbRLoc_Sel", AV52TFAlbRLoc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEENT") == 0 )
         {
            AV53TFAlbRPieEnt = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFAlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53TFAlbRPieEnt), 6, 0));
            AV54TFAlbRPieEnt_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFAlbRPieEnt_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54TFAlbRPieEnt_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEUTI") == 0 )
         {
            AV55TFAlbRPieUti = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFAlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFAlbRPieUti), 6, 0));
            AV56TFAlbRPieUti_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFAlbRPieUti_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TFAlbRPieUti_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEDIS") == 0 )
         {
            AV57TFAlbRPieDis = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFAlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57TFAlbRPieDis), 6, 0));
            AV58TFAlbRPieDis_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFAlbRPieDis_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58TFAlbRPieDis_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNI_SEL") == 0 )
         {
            AV59TFAlbRUni_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFAlbRUni_SelsJson", AV59TFAlbRUni_SelsJson);
            AV60TFAlbRUni_Sels.fromJSonString(AV59TFAlbRUni_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIENT") == 0 )
         {
            AV61TFAlbRUniEnt = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFAlbRUniEnt", GXutil.ltrimstr( AV61TFAlbRUniEnt, 9, 2));
            AV62TFAlbRUniEnt_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFAlbRUniEnt_To", GXutil.ltrimstr( AV62TFAlbRUniEnt_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIUTI") == 0 )
         {
            AV63TFAlbRUniUti = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFAlbRUniUti", GXutil.ltrimstr( AV63TFAlbRUniUti, 9, 2));
            AV64TFAlbRUniUti_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFAlbRUniUti_To", GXutil.ltrimstr( AV64TFAlbRUniUti_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIDIS") == 0 )
         {
            AV65TFAlbRUniDis = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFAlbRUniDis", GXutil.ltrimstr( AV65TFAlbRUniDis, 9, 2));
            AV66TFAlbRUniDis_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFAlbRUniDis_To", GXutil.ltrimstr( AV66TFAlbRUniDis_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREST_SEL") == 0 )
         {
            AV75TFAlbREst_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75TFAlbREst_SelsJson", AV75TFAlbREst_SelsJson);
            AV76TFAlbREst_Sels.fromJSonString(AV75TFAlbREst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCENOM") == 0 )
         {
            AV82TFProceNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82TFProceNom", AV82TFProceNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCENOM_SEL") == 0 )
         {
            AV83TFProceNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83TFProceNom_Sel", AV83TFProceNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOMPOSICION") == 0 )
         {
            AV84TFComposicion = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84TFComposicion", AV84TFComposicion);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOMPOSICION_SEL") == 0 )
         {
            AV85TFComposicion_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV85TFComposicion_Sel", AV85TFComposicion_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPENTNOM") == 0 )
         {
            AV91TFTipEntNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91TFTipEntNom", AV91TFTipEntNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPENTNOM_SEL") == 0 )
         {
            AV92TFTipEntNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92TFTipEntNom_Sel", AV92TFTipEntNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRDES") == 0 )
         {
            AV93TFAlbRDes = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV93TFAlbRDes", AV93TFAlbRDes);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRDES_SEL") == 0 )
         {
            AV94TFAlbRDes_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV94TFAlbRDes_Sel", AV94TFAlbRDes_Sel);
         }
         AV144GXV1 = (int)(AV144GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char5[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV78TFAlbRReo_Sels.size()==0), AV77TFAlbRReo_SelsJson, GXv_char5) ;
      wcconsultaalmacentejidoencrudo_impl.this.GXt_char1 = GXv_char5[0] ;
      GXt_char13 = "" ;
      GXv_char4[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV40TFCliNom_Sel)==0), AV40TFCliNom_Sel, GXv_char4) ;
      wcconsultaalmacentejidoencrudo_impl.this.GXt_char13 = GXv_char4[0] ;
      GXt_char14 = "" ;
      GXv_char2[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV42TFAlbRef_Sel)==0), AV42TFAlbRef_Sel, GXv_char2) ;
      wcconsultaalmacentejidoencrudo_impl.this.GXt_char14 = GXv_char2[0] ;
      GXt_char15 = "" ;
      GXv_char16[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV44TFAlbRefDsc_Sel)==0), AV44TFAlbRefDsc_Sel, GXv_char16) ;
      wcconsultaalmacentejidoencrudo_impl.this.GXt_char15 = GXv_char16[0] ;
      GXt_char17 = "" ;
      GXv_char18[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV46TFAlbRDisCli_Sel)==0), AV46TFAlbRDisCli_Sel, GXv_char18) ;
      wcconsultaalmacentejidoencrudo_impl.this.GXt_char17 = GXv_char18[0] ;
      GXt_char19 = "" ;
      GXv_char20[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV48TFAlbRTartD_Sel)==0), AV48TFAlbRTartD_Sel, GXv_char20) ;
      wcconsultaalmacentejidoencrudo_impl.this.GXt_char19 = GXv_char20[0] ;
      GXt_char21 = "" ;
      GXv_char22[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV50TFAlbRLote_Sel)==0), AV50TFAlbRLote_Sel, GXv_char22) ;
      wcconsultaalmacentejidoencrudo_impl.this.GXt_char21 = GXv_char22[0] ;
      GXt_char23 = "" ;
      GXv_char24[0] = GXt_char23 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV52TFAlbRLoc_Sel)==0), AV52TFAlbRLoc_Sel, GXv_char24) ;
      wcconsultaalmacentejidoencrudo_impl.this.GXt_char23 = GXv_char24[0] ;
      GXt_char25 = "" ;
      GXv_char26[0] = GXt_char25 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV60TFAlbRUni_Sels.size()==0), AV59TFAlbRUni_SelsJson, GXv_char26) ;
      wcconsultaalmacentejidoencrudo_impl.this.GXt_char25 = GXv_char26[0] ;
      GXt_char27 = "" ;
      GXv_char28[0] = GXt_char27 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV83TFProceNom_Sel)==0), AV83TFProceNom_Sel, GXv_char28) ;
      wcconsultaalmacentejidoencrudo_impl.this.GXt_char27 = GXv_char28[0] ;
      GXt_char29 = "" ;
      GXv_char30[0] = GXt_char29 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV85TFComposicion_Sel)==0), AV85TFComposicion_Sel, GXv_char30) ;
      wcconsultaalmacentejidoencrudo_impl.this.GXt_char29 = GXv_char30[0] ;
      GXt_char31 = "" ;
      GXv_char32[0] = GXt_char31 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV92TFTipEntNom_Sel)==0), AV92TFTipEntNom_Sel, GXv_char32) ;
      wcconsultaalmacentejidoencrudo_impl.this.GXt_char31 = GXv_char32[0] ;
      GXt_char33 = "" ;
      GXv_char34[0] = GXt_char33 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV94TFAlbRDes_Sel)==0), AV94TFAlbRDes_Sel, GXv_char34) ;
      wcconsultaalmacentejidoencrudo_impl.this.GXt_char33 = GXv_char34[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"||||"+GXt_char13+"|"+GXt_char14+"|"+GXt_char15+"|"+GXt_char17+"|"+GXt_char19+"|"+GXt_char21+"|"+GXt_char23+"||||"+GXt_char25+"||||"+((AV76TFAlbREst_Sels.size()==0) ? "" : AV75TFAlbREst_SelsJson)+"|"+GXt_char27+"|"+GXt_char29+"|"+GXt_char31+"|"+GXt_char33 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char33 = "" ;
      GXv_char34[0] = GXt_char33 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV39TFCliNom)==0), AV39TFCliNom, GXv_char34) ;
      wcconsultaalmacentejidoencrudo_impl.this.GXt_char33 = GXv_char34[0] ;
      GXt_char31 = "" ;
      GXv_char32[0] = GXt_char31 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV41TFAlbRef)==0), AV41TFAlbRef, GXv_char32) ;
      wcconsultaalmacentejidoencrudo_impl.this.GXt_char31 = GXv_char32[0] ;
      GXt_char29 = "" ;
      GXv_char30[0] = GXt_char29 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV43TFAlbRefDsc)==0), AV43TFAlbRefDsc, GXv_char30) ;
      wcconsultaalmacentejidoencrudo_impl.this.GXt_char29 = GXv_char30[0] ;
      GXt_char27 = "" ;
      GXv_char28[0] = GXt_char27 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV45TFAlbRDisCli)==0), AV45TFAlbRDisCli, GXv_char28) ;
      wcconsultaalmacentejidoencrudo_impl.this.GXt_char27 = GXv_char28[0] ;
      GXt_char25 = "" ;
      GXv_char26[0] = GXt_char25 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV47TFAlbRTartD)==0), AV47TFAlbRTartD, GXv_char26) ;
      wcconsultaalmacentejidoencrudo_impl.this.GXt_char25 = GXv_char26[0] ;
      GXt_char23 = "" ;
      GXv_char24[0] = GXt_char23 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV49TFAlbRLote)==0), AV49TFAlbRLote, GXv_char24) ;
      wcconsultaalmacentejidoencrudo_impl.this.GXt_char23 = GXv_char24[0] ;
      GXt_char21 = "" ;
      GXv_char22[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV51TFAlbRLoc)==0), AV51TFAlbRLoc, GXv_char22) ;
      wcconsultaalmacentejidoencrudo_impl.this.GXt_char21 = GXv_char22[0] ;
      GXt_char19 = "" ;
      GXv_char20[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV82TFProceNom)==0), AV82TFProceNom, GXv_char20) ;
      wcconsultaalmacentejidoencrudo_impl.this.GXt_char19 = GXv_char20[0] ;
      GXt_char17 = "" ;
      GXv_char18[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV84TFComposicion)==0), AV84TFComposicion, GXv_char18) ;
      wcconsultaalmacentejidoencrudo_impl.this.GXt_char17 = GXv_char18[0] ;
      GXt_char15 = "" ;
      GXv_char16[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV91TFTipEntNom)==0), AV91TFTipEntNom, GXv_char16) ;
      wcconsultaalmacentejidoencrudo_impl.this.GXt_char15 = GXv_char16[0] ;
      GXt_char14 = "" ;
      GXv_char5[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV93TFAlbRDes)==0), AV93TFAlbRDes, GXv_char5) ;
      wcconsultaalmacentejidoencrudo_impl.this.GXt_char14 = GXv_char5[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV26TFAlbRecCod) ? "" : GXutil.str( AV26TFAlbRecCod, 8, 0))+"||"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV33TFAlbRFen)) ? "" : localUtil.dtoc( AV33TFAlbRFen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"||"+((0==AV37TFCliCod) ? "" : GXutil.str( AV37TFCliCod, 6, 0))+"|"+GXt_char33+"|"+GXt_char31+"|"+GXt_char29+"|"+GXt_char27+"|"+GXt_char25+"|"+GXt_char23+"|"+GXt_char21+"|"+((0==AV53TFAlbRPieEnt) ? "" : GXutil.str( AV53TFAlbRPieEnt, 6, 0))+"|"+((0==AV55TFAlbRPieUti) ? "" : GXutil.str( AV55TFAlbRPieUti, 6, 0))+"|"+((0==AV57TFAlbRPieDis) ? "" : GXutil.str( AV57TFAlbRPieDis, 6, 0))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV61TFAlbRUniEnt)==0) ? "" : GXutil.str( AV61TFAlbRUniEnt, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV63TFAlbRUniUti)==0) ? "" : GXutil.str( AV63TFAlbRUniUti, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV65TFAlbRUniDis)==0) ? "" : GXutil.str( AV65TFAlbRUniDis, 9, 2))+"||"+GXt_char19+"|"+GXt_char17+"|"+GXt_char15+"|"+GXt_char14 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV27TFAlbRecCod_To) ? "" : GXutil.str( AV27TFAlbRecCod_To, 8, 0))+"||||"+((0==AV38TFCliCod_To) ? "" : GXutil.str( AV38TFCliCod_To, 6, 0))+"||||||||"+((0==AV54TFAlbRPieEnt_To) ? "" : GXutil.str( AV54TFAlbRPieEnt_To, 6, 0))+"|"+((0==AV56TFAlbRPieUti_To) ? "" : GXutil.str( AV56TFAlbRPieUti_To, 6, 0))+"|"+((0==AV58TFAlbRPieDis_To) ? "" : GXutil.str( AV58TFAlbRPieDis_To, 6, 0))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV62TFAlbRUniEnt_To)==0) ? "" : GXutil.str( AV62TFAlbRUniEnt_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV64TFAlbRUniUti_To)==0) ? "" : GXutil.str( AV64TFAlbRUniUti_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV66TFAlbRUniDis_To)==0) ? "" : GXutil.str( AV66TFAlbRUniDis_To, 9, 2))+"|||||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV22Session.getValue(AV97Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV32OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV12OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState35[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState35, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV14FilterFullText)==0), (short)(0), AV14FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState35[0] ;
      GXv_SdtWWPGridState35[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState35, "TFALBRECCOD", "", !((0==AV26TFAlbRecCod)&&(0==AV27TFAlbRecCod_To)), (short)(0), GXutil.trim( GXutil.str( AV26TFAlbRecCod, 8, 0)), GXutil.trim( GXutil.str( AV27TFAlbRecCod_To, 8, 0))) ;
      AV10GridState = GXv_SdtWWPGridState35[0] ;
      GXv_SdtWWPGridState35[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState35, "TFALBRREO_SEL", "", !(AV78TFAlbRReo_Sels.size()==0), (short)(0), AV78TFAlbRReo_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState35[0] ;
      GXv_SdtWWPGridState35[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState35, "TFALBRFEN", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV33TFAlbRFen)), (short)(0), GXutil.trim( localUtil.dtoc( AV33TFAlbRFen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState35[0] ;
      GXv_SdtWWPGridState35[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState35, "TFCLICOD", "", !((0==AV37TFCliCod)&&(0==AV38TFCliCod_To)), (short)(0), GXutil.trim( GXutil.str( AV37TFCliCod, 6, 0)), GXutil.trim( GXutil.str( AV38TFCliCod_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState35[0] ;
      GXv_SdtWWPGridState35[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState35, "TFCLINOM", "", !(GXutil.strcmp("", AV39TFCliNom)==0), (short)(0), AV39TFCliNom, "", !(GXutil.strcmp("", AV40TFCliNom_Sel)==0), AV40TFCliNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState35[0] ;
      GXv_SdtWWPGridState35[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState35, "TFALBREF", "", !(GXutil.strcmp("", AV41TFAlbRef)==0), (short)(0), AV41TFAlbRef, "", !(GXutil.strcmp("", AV42TFAlbRef_Sel)==0), AV42TFAlbRef_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState35[0] ;
      GXv_SdtWWPGridState35[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState35, "TFALBREFDSC", "", !(GXutil.strcmp("", AV43TFAlbRefDsc)==0), (short)(0), AV43TFAlbRefDsc, "", !(GXutil.strcmp("", AV44TFAlbRefDsc_Sel)==0), AV44TFAlbRefDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState35[0] ;
      GXv_SdtWWPGridState35[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState35, "TFALBRDISCLI", "", !(GXutil.strcmp("", AV45TFAlbRDisCli)==0), (short)(0), AV45TFAlbRDisCli, "", !(GXutil.strcmp("", AV46TFAlbRDisCli_Sel)==0), AV46TFAlbRDisCli_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState35[0] ;
      GXv_SdtWWPGridState35[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState35, "TFALBRTARTD", "", !(GXutil.strcmp("", AV47TFAlbRTartD)==0), (short)(0), AV47TFAlbRTartD, "", !(GXutil.strcmp("", AV48TFAlbRTartD_Sel)==0), AV48TFAlbRTartD_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState35[0] ;
      GXv_SdtWWPGridState35[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState35, "TFALBRLOTE", "", !(GXutil.strcmp("", AV49TFAlbRLote)==0), (short)(0), AV49TFAlbRLote, "", !(GXutil.strcmp("", AV50TFAlbRLote_Sel)==0), AV50TFAlbRLote_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState35[0] ;
      GXv_SdtWWPGridState35[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState35, "TFALBRLOC", "", !(GXutil.strcmp("", AV51TFAlbRLoc)==0), (short)(0), AV51TFAlbRLoc, "", !(GXutil.strcmp("", AV52TFAlbRLoc_Sel)==0), AV52TFAlbRLoc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState35[0] ;
      GXv_SdtWWPGridState35[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState35, "TFALBRPIEENT", "", !((0==AV53TFAlbRPieEnt)&&(0==AV54TFAlbRPieEnt_To)), (short)(0), GXutil.trim( GXutil.str( AV53TFAlbRPieEnt, 6, 0)), GXutil.trim( GXutil.str( AV54TFAlbRPieEnt_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState35[0] ;
      GXv_SdtWWPGridState35[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState35, "TFALBRPIEUTI", "", !((0==AV55TFAlbRPieUti)&&(0==AV56TFAlbRPieUti_To)), (short)(0), GXutil.trim( GXutil.str( AV55TFAlbRPieUti, 6, 0)), GXutil.trim( GXutil.str( AV56TFAlbRPieUti_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState35[0] ;
      GXv_SdtWWPGridState35[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState35, "TFALBRPIEDIS", "", !((0==AV57TFAlbRPieDis)&&(0==AV58TFAlbRPieDis_To)), (short)(0), GXutil.trim( GXutil.str( AV57TFAlbRPieDis, 6, 0)), GXutil.trim( GXutil.str( AV58TFAlbRPieDis_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState35[0] ;
      GXv_SdtWWPGridState35[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState35, "TFALBRUNI_SEL", "", !(AV60TFAlbRUni_Sels.size()==0), (short)(0), AV60TFAlbRUni_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState35[0] ;
      GXv_SdtWWPGridState35[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState35, "TFALBRUNIENT", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV61TFAlbRUniEnt)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV62TFAlbRUniEnt_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV61TFAlbRUniEnt, 9, 2)), GXutil.trim( GXutil.str( AV62TFAlbRUniEnt_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState35[0] ;
      GXv_SdtWWPGridState35[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState35, "TFALBRUNIUTI", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV63TFAlbRUniUti)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV64TFAlbRUniUti_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV63TFAlbRUniUti, 9, 2)), GXutil.trim( GXutil.str( AV64TFAlbRUniUti_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState35[0] ;
      GXv_SdtWWPGridState35[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState35, "TFALBRUNIDIS", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV65TFAlbRUniDis)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV66TFAlbRUniDis_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV65TFAlbRUniDis, 9, 2)), GXutil.trim( GXutil.str( AV66TFAlbRUniDis_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState35[0] ;
      GXv_SdtWWPGridState35[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState35, "TFALBREST_SEL", "", !(AV76TFAlbREst_Sels.size()==0), (short)(0), AV76TFAlbREst_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState35[0] ;
      GXv_SdtWWPGridState35[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState35, "TFPROCENOM", "", !(GXutil.strcmp("", AV82TFProceNom)==0), (short)(0), AV82TFProceNom, "", !(GXutil.strcmp("", AV83TFProceNom_Sel)==0), AV83TFProceNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState35[0] ;
      GXv_SdtWWPGridState35[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState35, "TFCOMPOSICION", "", !(GXutil.strcmp("", AV84TFComposicion)==0), (short)(0), AV84TFComposicion, "", !(GXutil.strcmp("", AV85TFComposicion_Sel)==0), AV85TFComposicion_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState35[0] ;
      GXv_SdtWWPGridState35[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState35, "TFTIPENTNOM", "", !(GXutil.strcmp("", AV91TFTipEntNom)==0), (short)(0), AV91TFTipEntNom, "", !(GXutil.strcmp("", AV92TFTipEntNom_Sel)==0), AV92TFTipEntNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState35[0] ;
      GXv_SdtWWPGridState35[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState35, "TFALBRDES", "", !(GXutil.strcmp("", AV93TFAlbRDes)==0), (short)(0), AV93TFAlbRDes, "", !(GXutil.strcmp("", AV94TFAlbRDes_Sel)==0), AV94TFAlbRDes_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState35[0] ;
      if ( ! (GXutil.strcmp("", AV67Emprcod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV67Emprcod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV68Albrfen)) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBRFEN" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV68Albrfen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV69Albrfen_to)) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBRFEN_TO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV69Albrfen_to, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV70Clicod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV70Clicod, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV71Clicod_to) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICOD_TO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV71Clicod_to, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV72AlbRef)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBREF" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV72AlbRef );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV88albref_to)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBREF_TO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV88albref_to );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV80Procecod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PROCECOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV80Procecod, 4, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV81ProceCod_to) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PROCECOD_TO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV81ProceCod_to, 4, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV73AlbRReo)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBRREO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV73AlbRReo );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV74AlbREst) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBREST" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV74AlbREst, 1, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV90TipEntCod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&TIPENTCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV90TipEntCod, 4, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV89AlbRuni)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBRUNI" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV89AlbRuni );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV97Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV97Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TTrn22" );
      AV22Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table2_83_1662( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledetailwebcomponent_modal_Internalname, tblTabledetailwebcomponent_modal_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDetailwebcomponent_modal.setProperty("Width", Detailwebcomponent_modal_Width);
         ucDetailwebcomponent_modal.setProperty("Title", Detailwebcomponent_modal_Title);
         ucDetailwebcomponent_modal.setProperty("ConfirmType", Detailwebcomponent_modal_Confirmtype);
         ucDetailwebcomponent_modal.setProperty("BodyType", Detailwebcomponent_modal_Bodytype);
         ucDetailwebcomponent_modal.render(context, "dvelop.gxbootstrap.confirmpanel", Detailwebcomponent_modal_Internalname, sPrefix+"DETAILWEBCOMPONENT_MODALContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DETAILWEBCOMPONENT_MODALContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_83_1662e( true) ;
      }
      else
      {
         wb_table2_83_1662e( false) ;
      }
   }

   public void wb_table1_23_1662( boolean wbgen )
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
         wb_table3_28_1662( true) ;
      }
      else
      {
         wb_table3_28_1662( false) ;
      }
      return  ;
   }

   public void wb_table3_28_1662e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_23_1662e( true) ;
      }
      else
      {
         wb_table1_23_1662e( false) ;
      }
   }

   public void wb_table3_28_1662( boolean wbgen )
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV14FilterFullText, GXutil.rtrim( localUtil.format( AV14FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_WCConsultaAlmacenTejidoencrudo.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_28_1662e( true) ;
      }
      else
      {
         wb_table3_28_1662e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV67Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67Emprcod", AV67Emprcod);
      AV68Albrfen = (java.util.Date)getParm(obj,1,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68Albrfen", localUtil.format(AV68Albrfen, "99/99/99"));
      AV69Albrfen_to = (java.util.Date)getParm(obj,2,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69Albrfen_to", localUtil.format(AV69Albrfen_to, "99/99/99"));
      AV70Clicod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70Clicod), 6, 0));
      AV71Clicod_to = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71Clicod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71Clicod_to), 6, 0));
      AV72AlbRef = (String)getParm(obj,5,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72AlbRef", AV72AlbRef);
      AV88albref_to = (String)getParm(obj,6,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88albref_to", AV88albref_to);
      AV80Procecod = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80Procecod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80Procecod), 4, 0));
      AV81ProceCod_to = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81ProceCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81ProceCod_to), 4, 0));
      AV73AlbRReo = (String)getParm(obj,9,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73AlbRReo", AV73AlbRReo);
      AV74AlbREst = ((Number) GXutil.testNumericType( getParm(obj,10,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74AlbREst", GXutil.str( AV74AlbREst, 1, 0));
      AV90TipEntCod = ((Number) GXutil.testNumericType( getParm(obj,11,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV90TipEntCod), 4, 0));
      AV89AlbRuni = (String)getParm(obj,12,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89AlbRuni", AV89AlbRuni);
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
      pa1662( ) ;
      ws1662( ) ;
      we1662( ) ;
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
      sCtrlAV67Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV68Albrfen = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV69Albrfen_to = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV70Clicod = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV71Clicod_to = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV72AlbRef = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV88albref_to = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV80Procecod = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV81ProceCod_to = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV73AlbRReo = (String)getParm(obj,9,TypeConstants.STRING) ;
      sCtrlAV74AlbREst = (String)getParm(obj,10,TypeConstants.STRING) ;
      sCtrlAV90TipEntCod = (String)getParm(obj,11,TypeConstants.STRING) ;
      sCtrlAV89AlbRuni = (String)getParm(obj,12,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1662( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "wcconsultaalmacentejidoencrudo", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1662( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV67Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67Emprcod", AV67Emprcod);
         AV68Albrfen = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68Albrfen", localUtil.format(AV68Albrfen, "99/99/99"));
         AV69Albrfen_to = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69Albrfen_to", localUtil.format(AV69Albrfen_to, "99/99/99"));
         AV70Clicod = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70Clicod), 6, 0));
         AV71Clicod_to = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71Clicod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71Clicod_to), 6, 0));
         AV72AlbRef = (String)getParm(obj,7,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72AlbRef", AV72AlbRef);
         AV88albref_to = (String)getParm(obj,8,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88albref_to", AV88albref_to);
         AV80Procecod = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80Procecod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80Procecod), 4, 0));
         AV81ProceCod_to = ((Number) GXutil.testNumericType( getParm(obj,10,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81ProceCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81ProceCod_to), 4, 0));
         AV73AlbRReo = (String)getParm(obj,11,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73AlbRReo", AV73AlbRReo);
         AV74AlbREst = ((Number) GXutil.testNumericType( getParm(obj,12,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74AlbREst", GXutil.str( AV74AlbREst, 1, 0));
         AV90TipEntCod = ((Number) GXutil.testNumericType( getParm(obj,13,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV90TipEntCod), 4, 0));
         AV89AlbRuni = (String)getParm(obj,14,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89AlbRuni", AV89AlbRuni);
      }
      wcpOAV67Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV67Emprcod") ;
      wcpOAV68Albrfen = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV68Albrfen"), 0) ;
      wcpOAV69Albrfen_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV69Albrfen_to"), 0) ;
      wcpOAV70Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV70Clicod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV71Clicod_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV71Clicod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV72AlbRef = httpContext.cgiGet( sPrefix+"wcpOAV72AlbRef") ;
      wcpOAV88albref_to = httpContext.cgiGet( sPrefix+"wcpOAV88albref_to") ;
      wcpOAV80Procecod = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV80Procecod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV81ProceCod_to = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV81ProceCod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV73AlbRReo = httpContext.cgiGet( sPrefix+"wcpOAV73AlbRReo") ;
      wcpOAV74AlbREst = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV74AlbREst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV90TipEntCod = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV90TipEntCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV89AlbRuni = httpContext.cgiGet( sPrefix+"wcpOAV89AlbRuni") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV67Emprcod, wcpOAV67Emprcod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(AV68Albrfen), GXutil.resetTime(wcpOAV68Albrfen)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV69Albrfen_to), GXutil.resetTime(wcpOAV69Albrfen_to)) ) || ( AV70Clicod != wcpOAV70Clicod ) || ( AV71Clicod_to != wcpOAV71Clicod_to ) || ( GXutil.strcmp(AV72AlbRef, wcpOAV72AlbRef) != 0 ) || ( GXutil.strcmp(AV88albref_to, wcpOAV88albref_to) != 0 ) || ( AV80Procecod != wcpOAV80Procecod ) || ( AV81ProceCod_to != wcpOAV81ProceCod_to ) || ( GXutil.strcmp(AV73AlbRReo, wcpOAV73AlbRReo) != 0 ) || ( AV74AlbREst != wcpOAV74AlbREst ) || ( AV90TipEntCod != wcpOAV90TipEntCod ) || ( GXutil.strcmp(AV89AlbRuni, wcpOAV89AlbRuni) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV67Emprcod = AV67Emprcod ;
      wcpOAV68Albrfen = AV68Albrfen ;
      wcpOAV69Albrfen_to = AV69Albrfen_to ;
      wcpOAV70Clicod = AV70Clicod ;
      wcpOAV71Clicod_to = AV71Clicod_to ;
      wcpOAV72AlbRef = AV72AlbRef ;
      wcpOAV88albref_to = AV88albref_to ;
      wcpOAV80Procecod = AV80Procecod ;
      wcpOAV81ProceCod_to = AV81ProceCod_to ;
      wcpOAV73AlbRReo = AV73AlbRReo ;
      wcpOAV74AlbREst = AV74AlbREst ;
      wcpOAV90TipEntCod = AV90TipEntCod ;
      wcpOAV89AlbRuni = AV89AlbRuni ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV67Emprcod = httpContext.cgiGet( sPrefix+"AV67Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV67Emprcod) > 0 )
      {
         AV67Emprcod = httpContext.cgiGet( sCtrlAV67Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67Emprcod", AV67Emprcod);
      }
      else
      {
         AV67Emprcod = httpContext.cgiGet( sPrefix+"AV67Emprcod_PARM") ;
      }
      sCtrlAV68Albrfen = httpContext.cgiGet( sPrefix+"AV68Albrfen_CTRL") ;
      if ( GXutil.len( sCtrlAV68Albrfen) > 0 )
      {
         AV68Albrfen = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV68Albrfen), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68Albrfen", localUtil.format(AV68Albrfen, "99/99/99"));
      }
      else
      {
         AV68Albrfen = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV68Albrfen_PARM"), 0) ;
      }
      sCtrlAV69Albrfen_to = httpContext.cgiGet( sPrefix+"AV69Albrfen_to_CTRL") ;
      if ( GXutil.len( sCtrlAV69Albrfen_to) > 0 )
      {
         AV69Albrfen_to = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV69Albrfen_to), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69Albrfen_to", localUtil.format(AV69Albrfen_to, "99/99/99"));
      }
      else
      {
         AV69Albrfen_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV69Albrfen_to_PARM"), 0) ;
      }
      sCtrlAV70Clicod = httpContext.cgiGet( sPrefix+"AV70Clicod_CTRL") ;
      if ( GXutil.len( sCtrlAV70Clicod) > 0 )
      {
         AV70Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV70Clicod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70Clicod), 6, 0));
      }
      else
      {
         AV70Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV70Clicod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV71Clicod_to = httpContext.cgiGet( sPrefix+"AV71Clicod_to_CTRL") ;
      if ( GXutil.len( sCtrlAV71Clicod_to) > 0 )
      {
         AV71Clicod_to = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV71Clicod_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71Clicod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71Clicod_to), 6, 0));
      }
      else
      {
         AV71Clicod_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV71Clicod_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV72AlbRef = httpContext.cgiGet( sPrefix+"AV72AlbRef_CTRL") ;
      if ( GXutil.len( sCtrlAV72AlbRef) > 0 )
      {
         AV72AlbRef = httpContext.cgiGet( sCtrlAV72AlbRef) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72AlbRef", AV72AlbRef);
      }
      else
      {
         AV72AlbRef = httpContext.cgiGet( sPrefix+"AV72AlbRef_PARM") ;
      }
      sCtrlAV88albref_to = httpContext.cgiGet( sPrefix+"AV88albref_to_CTRL") ;
      if ( GXutil.len( sCtrlAV88albref_to) > 0 )
      {
         AV88albref_to = httpContext.cgiGet( sCtrlAV88albref_to) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88albref_to", AV88albref_to);
      }
      else
      {
         AV88albref_to = httpContext.cgiGet( sPrefix+"AV88albref_to_PARM") ;
      }
      sCtrlAV80Procecod = httpContext.cgiGet( sPrefix+"AV80Procecod_CTRL") ;
      if ( GXutil.len( sCtrlAV80Procecod) > 0 )
      {
         AV80Procecod = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV80Procecod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80Procecod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80Procecod), 4, 0));
      }
      else
      {
         AV80Procecod = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV80Procecod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV81ProceCod_to = httpContext.cgiGet( sPrefix+"AV81ProceCod_to_CTRL") ;
      if ( GXutil.len( sCtrlAV81ProceCod_to) > 0 )
      {
         AV81ProceCod_to = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV81ProceCod_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81ProceCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81ProceCod_to), 4, 0));
      }
      else
      {
         AV81ProceCod_to = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV81ProceCod_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV73AlbRReo = httpContext.cgiGet( sPrefix+"AV73AlbRReo_CTRL") ;
      if ( GXutil.len( sCtrlAV73AlbRReo) > 0 )
      {
         AV73AlbRReo = httpContext.cgiGet( sCtrlAV73AlbRReo) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73AlbRReo", AV73AlbRReo);
      }
      else
      {
         AV73AlbRReo = httpContext.cgiGet( sPrefix+"AV73AlbRReo_PARM") ;
      }
      sCtrlAV74AlbREst = httpContext.cgiGet( sPrefix+"AV74AlbREst_CTRL") ;
      if ( GXutil.len( sCtrlAV74AlbREst) > 0 )
      {
         AV74AlbREst = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV74AlbREst), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74AlbREst", GXutil.str( AV74AlbREst, 1, 0));
      }
      else
      {
         AV74AlbREst = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV74AlbREst_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV90TipEntCod = httpContext.cgiGet( sPrefix+"AV90TipEntCod_CTRL") ;
      if ( GXutil.len( sCtrlAV90TipEntCod) > 0 )
      {
         AV90TipEntCod = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV90TipEntCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV90TipEntCod), 4, 0));
      }
      else
      {
         AV90TipEntCod = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV90TipEntCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV89AlbRuni = httpContext.cgiGet( sPrefix+"AV89AlbRuni_CTRL") ;
      if ( GXutil.len( sCtrlAV89AlbRuni) > 0 )
      {
         AV89AlbRuni = httpContext.cgiGet( sCtrlAV89AlbRuni) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89AlbRuni", AV89AlbRuni);
      }
      else
      {
         AV89AlbRuni = httpContext.cgiGet( sPrefix+"AV89AlbRuni_PARM") ;
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
      pa1662( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1662( ) ;
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
      ws1662( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV67Emprcod_PARM", GXutil.rtrim( AV67Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV67Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV67Emprcod_CTRL", GXutil.rtrim( sCtrlAV67Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV68Albrfen_PARM", localUtil.dtoc( AV68Albrfen, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV68Albrfen)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV68Albrfen_CTRL", GXutil.rtrim( sCtrlAV68Albrfen));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV69Albrfen_to_PARM", localUtil.dtoc( AV69Albrfen_to, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV69Albrfen_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV69Albrfen_to_CTRL", GXutil.rtrim( sCtrlAV69Albrfen_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV70Clicod_PARM", GXutil.ltrim( localUtil.ntoc( AV70Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV70Clicod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV70Clicod_CTRL", GXutil.rtrim( sCtrlAV70Clicod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV71Clicod_to_PARM", GXutil.ltrim( localUtil.ntoc( AV71Clicod_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV71Clicod_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV71Clicod_to_CTRL", GXutil.rtrim( sCtrlAV71Clicod_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV72AlbRef_PARM", GXutil.rtrim( AV72AlbRef));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV72AlbRef)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV72AlbRef_CTRL", GXutil.rtrim( sCtrlAV72AlbRef));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV88albref_to_PARM", GXutil.rtrim( AV88albref_to));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV88albref_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV88albref_to_CTRL", GXutil.rtrim( sCtrlAV88albref_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV80Procecod_PARM", GXutil.ltrim( localUtil.ntoc( AV80Procecod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV80Procecod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV80Procecod_CTRL", GXutil.rtrim( sCtrlAV80Procecod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV81ProceCod_to_PARM", GXutil.ltrim( localUtil.ntoc( AV81ProceCod_to, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV81ProceCod_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV81ProceCod_to_CTRL", GXutil.rtrim( sCtrlAV81ProceCod_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV73AlbRReo_PARM", GXutil.rtrim( AV73AlbRReo));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV73AlbRReo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV73AlbRReo_CTRL", GXutil.rtrim( sCtrlAV73AlbRReo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV74AlbREst_PARM", GXutil.ltrim( localUtil.ntoc( AV74AlbREst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV74AlbREst)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV74AlbREst_CTRL", GXutil.rtrim( sCtrlAV74AlbREst));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV90TipEntCod_PARM", GXutil.ltrim( localUtil.ntoc( AV90TipEntCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV90TipEntCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV90TipEntCod_CTRL", GXutil.rtrim( sCtrlAV90TipEntCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV89AlbRuni_PARM", GXutil.rtrim( AV89AlbRuni));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV89AlbRuni)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV89AlbRuni_CTRL", GXutil.rtrim( sCtrlAV89AlbRuni));
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
      we1662( ) ;
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
      if ( ! ( WebComp_Grid_dwc == null ) )
      {
         WebComp_Grid_dwc.componentjscripts();
      }
      if ( ! ( WebComp_Wwpaux_wc == null ) )
      {
         WebComp_Wwpaux_wc.componentjscripts();
      }
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
      if ( ! ( WebComp_Grid_dwc == null ) )
      {
         if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
         {
            WebComp_Grid_dwc.componentthemes();
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211665860", true, true);
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
      httpContext.AddJavascriptSource("wcconsultaalmacentejidoencrudo.js", "?20268211665860", false, true);
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
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_412( )
   {
      edtavDetailwebcomponent_Internalname = sPrefix+"vDETAILWEBCOMPONENT_"+sGXsfl_41_idx ;
      edtAlbRecCod_Internalname = sPrefix+"ALBRECCOD_"+sGXsfl_41_idx ;
      cmbAlbRReo.setInternalname( sPrefix+"ALBRREO_"+sGXsfl_41_idx );
      edtAlbRFen_Internalname = sPrefix+"ALBRFEN_"+sGXsfl_41_idx ;
      edtavAlbrent2_Internalname = sPrefix+"vALBRENT2_"+sGXsfl_41_idx ;
      edtCliCod_Internalname = sPrefix+"CLICOD_"+sGXsfl_41_idx ;
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_41_idx ;
      edtAlbRef_Internalname = sPrefix+"ALBREF_"+sGXsfl_41_idx ;
      edtAlbRefDsc_Internalname = sPrefix+"ALBREFDSC_"+sGXsfl_41_idx ;
      edtAlbRDisCli_Internalname = sPrefix+"ALBRDISCLI_"+sGXsfl_41_idx ;
      edtAlbRTartD_Internalname = sPrefix+"ALBRTARTD_"+sGXsfl_41_idx ;
      edtAlbRLote_Internalname = sPrefix+"ALBRLOTE_"+sGXsfl_41_idx ;
      edtAlbRLoc_Internalname = sPrefix+"ALBRLOC_"+sGXsfl_41_idx ;
      edtAlbRPieEnt_Internalname = sPrefix+"ALBRPIEENT_"+sGXsfl_41_idx ;
      edtAlbRPieUti_Internalname = sPrefix+"ALBRPIEUTI_"+sGXsfl_41_idx ;
      edtAlbRPieDis_Internalname = sPrefix+"ALBRPIEDIS_"+sGXsfl_41_idx ;
      cmbAlbRUni.setInternalname( sPrefix+"ALBRUNI_"+sGXsfl_41_idx );
      edtAlbRUniEnt_Internalname = sPrefix+"ALBRUNIENT_"+sGXsfl_41_idx ;
      edtAlbRUniUti_Internalname = sPrefix+"ALBRUNIUTI_"+sGXsfl_41_idx ;
      edtAlbRUniDis_Internalname = sPrefix+"ALBRUNIDIS_"+sGXsfl_41_idx ;
      cmbAlbREst.setInternalname( sPrefix+"ALBREST_"+sGXsfl_41_idx );
      edtProceNom_Internalname = sPrefix+"PROCENOM_"+sGXsfl_41_idx ;
      edtComposicio_Internalname = sPrefix+"COMPOSICIO_"+sGXsfl_41_idx ;
      edtTipEntNom_Internalname = sPrefix+"TIPENTNOM_"+sGXsfl_41_idx ;
      edtAlbRDes_Internalname = sPrefix+"ALBRDES_"+sGXsfl_41_idx ;
      edtAlbRArtLu_Internalname = sPrefix+"ALBRARTLU_"+sGXsfl_41_idx ;
   }

   public void subsflControlProps_fel_412( )
   {
      edtavDetailwebcomponent_Internalname = sPrefix+"vDETAILWEBCOMPONENT_"+sGXsfl_41_fel_idx ;
      edtAlbRecCod_Internalname = sPrefix+"ALBRECCOD_"+sGXsfl_41_fel_idx ;
      cmbAlbRReo.setInternalname( sPrefix+"ALBRREO_"+sGXsfl_41_fel_idx );
      edtAlbRFen_Internalname = sPrefix+"ALBRFEN_"+sGXsfl_41_fel_idx ;
      edtavAlbrent2_Internalname = sPrefix+"vALBRENT2_"+sGXsfl_41_fel_idx ;
      edtCliCod_Internalname = sPrefix+"CLICOD_"+sGXsfl_41_fel_idx ;
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_41_fel_idx ;
      edtAlbRef_Internalname = sPrefix+"ALBREF_"+sGXsfl_41_fel_idx ;
      edtAlbRefDsc_Internalname = sPrefix+"ALBREFDSC_"+sGXsfl_41_fel_idx ;
      edtAlbRDisCli_Internalname = sPrefix+"ALBRDISCLI_"+sGXsfl_41_fel_idx ;
      edtAlbRTartD_Internalname = sPrefix+"ALBRTARTD_"+sGXsfl_41_fel_idx ;
      edtAlbRLote_Internalname = sPrefix+"ALBRLOTE_"+sGXsfl_41_fel_idx ;
      edtAlbRLoc_Internalname = sPrefix+"ALBRLOC_"+sGXsfl_41_fel_idx ;
      edtAlbRPieEnt_Internalname = sPrefix+"ALBRPIEENT_"+sGXsfl_41_fel_idx ;
      edtAlbRPieUti_Internalname = sPrefix+"ALBRPIEUTI_"+sGXsfl_41_fel_idx ;
      edtAlbRPieDis_Internalname = sPrefix+"ALBRPIEDIS_"+sGXsfl_41_fel_idx ;
      cmbAlbRUni.setInternalname( sPrefix+"ALBRUNI_"+sGXsfl_41_fel_idx );
      edtAlbRUniEnt_Internalname = sPrefix+"ALBRUNIENT_"+sGXsfl_41_fel_idx ;
      edtAlbRUniUti_Internalname = sPrefix+"ALBRUNIUTI_"+sGXsfl_41_fel_idx ;
      edtAlbRUniDis_Internalname = sPrefix+"ALBRUNIDIS_"+sGXsfl_41_fel_idx ;
      cmbAlbREst.setInternalname( sPrefix+"ALBREST_"+sGXsfl_41_fel_idx );
      edtProceNom_Internalname = sPrefix+"PROCENOM_"+sGXsfl_41_fel_idx ;
      edtComposicio_Internalname = sPrefix+"COMPOSICIO_"+sGXsfl_41_fel_idx ;
      edtTipEntNom_Internalname = sPrefix+"TIPENTNOM_"+sGXsfl_41_fel_idx ;
      edtAlbRDes_Internalname = sPrefix+"ALBRDES_"+sGXsfl_41_fel_idx ;
      edtAlbRArtLu_Internalname = sPrefix+"ALBRARTLU_"+sGXsfl_41_fel_idx ;
   }

   public void sendrow_412( )
   {
      subsflControlProps_412( ) ;
      wb1660( ) ;
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
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_41_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 42,'"+sPrefix+"',false,'"+sGXsfl_41_idx+"',41)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDetailwebcomponent_Internalname,GXutil.rtrim( AV79DetailWebComponent),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,42);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+"e221662_client"+"'","","","","",edtavDetailwebcomponent_Jsonclick,Integer.valueOf(7),"Attribute","",ROClassString,"WWIconActionColumn WCD_ActionColumn","",Integer.valueOf(-1),Integer.valueOf(edtavDetailwebcomponent_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtAlbRecCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecCod_Internalname,GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtAlbRecCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((cmbAlbRReo.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbAlbRReo.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ALBRREO_" + sGXsfl_41_idx ;
            cmbAlbRReo.setName( GXCCtl );
            cmbAlbRReo.setWebtags( "" );
            cmbAlbRReo.addItem("NO", httpContext.getMessage( "NO", ""), (short)(0));
            cmbAlbRReo.addItem("SI", httpContext.getMessage( "SI", ""), (short)(0));
            if ( cmbAlbRReo.getItemCount() > 0 )
            {
               A55AlbRReo = cmbAlbRReo.getValidValue(A55AlbRReo) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbRReo,cmbAlbRReo.getInternalname(),GXutil.rtrim( A55AlbRReo),Integer.valueOf(1),cmbAlbRReo.getJsonclick(),Integer.valueOf(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbAlbRReo.getVisible()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn hidden-xs","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbAlbRReo.setValue( GXutil.rtrim( A55AlbRReo) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlbRReo.getInternalname(), "Values", cmbAlbRReo.ToJavascriptSource(), !bGXsfl_41_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtAlbRFen_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRFen_Internalname,localUtil.format(A49AlbRFen, "99/99/99"),localUtil.format( A49AlbRFen, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbRFen_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtAlbRFen_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavAlbrent2_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavAlbrent2_Enabled!=0)&&(edtavAlbrent2_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 46,'"+sPrefix+"',false,'"+sGXsfl_41_idx+"',41)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlbrent2_Internalname,GXutil.rtrim( AV15AlbREnt2),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavAlbrent2_Enabled!=0)&&(edtavAlbrent2_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,46);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAlbrent2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavAlbrent2_Visible),Integer.valueOf(edtavAlbrent2_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCliCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
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
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtAlbRef_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRef_Internalname,GXutil.rtrim( A45AlbRef),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbRef_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtAlbRef_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtAlbRefDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRefDsc_Internalname,GXutil.rtrim( A3613AlbRefDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbRefDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtAlbRefDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtAlbRDisCli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRDisCli_Internalname,GXutil.rtrim( A3359AlbRDisCli),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbRDisCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtAlbRDisCli_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtAlbRTartD_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRTartD_Internalname,GXutil.rtrim( A6264AlbRTartD),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbRTartD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtAlbRTartD_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtAlbRLote_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRLote_Internalname,GXutil.rtrim( A6463AlbRLote),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbRLote_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtAlbRLote_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtAlbRLoc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRLoc_Internalname,GXutil.rtrim( A50AlbRLoc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbRLoc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtAlbRLoc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtAlbRPieEnt_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRPieEnt_Internalname,GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbRPieEnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtAlbRPieEnt_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtAlbRPieUti_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRPieUti_Internalname,GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A54AlbRPieUti), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbRPieUti_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtAlbRPieUti_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtAlbRPieDis_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRPieDis_Internalname,GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A51AlbRPieDis), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbRPieDis_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtAlbRPieDis_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((cmbAlbRUni.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbAlbRUni.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ALBRUNI_" + sGXsfl_41_idx ;
            cmbAlbRUni.setName( GXCCtl );
            cmbAlbRUni.setWebtags( "" );
            cmbAlbRUni.addItem("K", httpContext.getMessage( "K", ""), (short)(0));
            cmbAlbRUni.addItem("M", httpContext.getMessage( "M", ""), (short)(0));
            if ( cmbAlbRUni.getItemCount() > 0 )
            {
               A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbRUni,cmbAlbRUni.getInternalname(),GXutil.rtrim( A56AlbRUni),Integer.valueOf(1),cmbAlbRUni.getJsonclick(),Integer.valueOf(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbAlbRUni.getVisible()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn hidden-xs","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), !bGXsfl_41_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtAlbRUniEnt_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRUniEnt_Internalname,GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbRUniEnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtAlbRUniEnt_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtAlbRUniUti_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRUniUti_Internalname,GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A60AlbRUniUti, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbRUniUti_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtAlbRUniUti_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtAlbRUniDis_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRUniDis_Internalname,GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A57AlbRUniDis, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbRUniDis_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtAlbRUniDis_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((cmbAlbREst.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbAlbREst.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ALBREST_" + sGXsfl_41_idx ;
            cmbAlbREst.setName( GXCCtl );
            cmbAlbREst.setWebtags( "" );
            cmbAlbREst.addItem("0", httpContext.getMessage( "Abierta", ""), (short)(0));
            cmbAlbREst.addItem("1", httpContext.getMessage( "Cerrada", ""), (short)(0));
            if ( cmbAlbREst.getItemCount() > 0 )
            {
               A47AlbREst = (byte)(GXutil.lval( cmbAlbREst.getValidValue(GXutil.trim( GXutil.str( A47AlbREst, 1, 0))))) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbREst,cmbAlbREst.getInternalname(),GXutil.trim( GXutil.str( A47AlbREst, 1, 0)),Integer.valueOf(1),cmbAlbREst.getJsonclick(),Integer.valueOf(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(cmbAlbREst.getVisible()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn hidden-xs","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbAlbREst.setValue( GXutil.trim( GXutil.str( A47AlbREst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlbREst.getInternalname(), "Values", cmbAlbREst.ToJavascriptSource(), !bGXsfl_41_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtProceNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProceNom_Internalname,GXutil.rtrim( A971ProceNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtProceNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtProceNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtComposicio_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtComposicio_Internalname,GXutil.rtrim( A13981Composicio),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtComposicio_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtComposicio_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtTipEntNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipEntNom_Internalname,GXutil.rtrim( A1212TipEntNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTipEntNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtTipEntNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(25),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtAlbRDes_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRDes_Internalname,GXutil.rtrim( A1291AlbRDes),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbRDes_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtAlbRDes_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRArtLu_Internalname,GXutil.ltrim( localUtil.ntoc( A13982AlbRArtLu, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A13982AlbRArtLu, "ZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbRArtLu_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1662( ) ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbRecCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N Recepcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbAlbRReo.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Rec?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbRFen_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAlbrent2_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Documento", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbRef_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Referencia", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbRefDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbRDisCli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Disp. Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbRTartD_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbRLote_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Lote", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbRLoc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Localizacion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbRPieEnt_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Entradas", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbRPieUti_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Utilizadas", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbRPieDis_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Disponibles", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbAlbRUni.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Und", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbRUniEnt_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Entradas", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbRUniUti_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Utilizadas", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbRUniDis_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Disponibles", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbAlbREst.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Estado", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtProceNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Procedencia", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtComposicio_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Composicion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtTipEntNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo Entrada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbRDes_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Destino", "")) ;
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
         GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV79DetailWebComponent));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDetailwebcomponent_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbRecCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A55AlbRReo));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbAlbRReo.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A49AlbRFen, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbRFen_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV15AlbREnt2));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlbrent2_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAlbrent2_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCliCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A279CliNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCliNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A45AlbRef));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbRef_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A3613AlbRefDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbRefDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A3359AlbRDisCli));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbRDisCli_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A6264AlbRTartD));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbRTartD_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A6463AlbRLote));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbRLote_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A50AlbRLoc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbRLoc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbRPieEnt_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbRPieUti_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbRPieDis_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A56AlbRUni));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbAlbRUni.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbRUniEnt_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbRUniUti_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbRUniDis_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbAlbREst.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A971ProceNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtProceNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13981Composicio));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtComposicio_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1212TipEntNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtTipEntNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1291AlbRDes));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbRDes_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13982AlbRArtLu, (byte)(6), (byte)(2), ".", "")));
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
      edtavDetailwebcomponent_Internalname = sPrefix+"vDETAILWEBCOMPONENT" ;
      edtAlbRecCod_Internalname = sPrefix+"ALBRECCOD" ;
      cmbAlbRReo.setInternalname( sPrefix+"ALBRREO" );
      edtAlbRFen_Internalname = sPrefix+"ALBRFEN" ;
      edtavAlbrent2_Internalname = sPrefix+"vALBRENT2" ;
      edtCliCod_Internalname = sPrefix+"CLICOD" ;
      edtCliNom_Internalname = sPrefix+"CLINOM" ;
      edtAlbRef_Internalname = sPrefix+"ALBREF" ;
      edtAlbRefDsc_Internalname = sPrefix+"ALBREFDSC" ;
      edtAlbRDisCli_Internalname = sPrefix+"ALBRDISCLI" ;
      edtAlbRTartD_Internalname = sPrefix+"ALBRTARTD" ;
      edtAlbRLote_Internalname = sPrefix+"ALBRLOTE" ;
      edtAlbRLoc_Internalname = sPrefix+"ALBRLOC" ;
      edtAlbRPieEnt_Internalname = sPrefix+"ALBRPIEENT" ;
      edtAlbRPieUti_Internalname = sPrefix+"ALBRPIEUTI" ;
      edtAlbRPieDis_Internalname = sPrefix+"ALBRPIEDIS" ;
      cmbAlbRUni.setInternalname( sPrefix+"ALBRUNI" );
      edtAlbRUniEnt_Internalname = sPrefix+"ALBRUNIENT" ;
      edtAlbRUniUti_Internalname = sPrefix+"ALBRUNIUTI" ;
      edtAlbRUniDis_Internalname = sPrefix+"ALBRUNIDIS" ;
      cmbAlbREst.setInternalname( sPrefix+"ALBREST" );
      edtProceNom_Internalname = sPrefix+"PROCENOM" ;
      edtComposicio_Internalname = sPrefix+"COMPOSICIO" ;
      edtTipEntNom_Internalname = sPrefix+"TIPENTNOM" ;
      edtAlbRDes_Internalname = sPrefix+"ALBRDES" ;
      edtAlbRArtLu_Internalname = sPrefix+"ALBRARTLU" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divCell_grid_dwc_Internalname = sPrefix+"CELL_GRID_DWC" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      Detailwebcomponent_modal_Internalname = sPrefix+"DETAILWEBCOMPONENT_MODAL" ;
      tblTabledetailwebcomponent_modal_Internalname = sPrefix+"TABLEDETAILWEBCOMPONENT_MODAL" ;
      Grid_titlescategories_Internalname = sPrefix+"GRID_TITLESCATEGORIES" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
      divDiv_wwpauxwc_Internalname = sPrefix+"DIV_WWPAUXWC" ;
      edtavDdo_albrfenauxdate_Internalname = sPrefix+"vDDO_ALBRFENAUXDATE" ;
      divDdo_albrfenauxdates_Internalname = sPrefix+"DDO_ALBRFENAUXDATES" ;
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
      subGrid_Allowhovering = (byte)(-1) ;
      subGrid_Allowselection = (byte)(1) ;
      subGrid_Header = "" ;
      edtAlbRArtLu_Jsonclick = "" ;
      edtAlbRDes_Jsonclick = "" ;
      edtTipEntNom_Jsonclick = "" ;
      edtComposicio_Jsonclick = "" ;
      edtProceNom_Jsonclick = "" ;
      cmbAlbREst.setJsonclick( "" );
      edtAlbRUniDis_Jsonclick = "" ;
      edtAlbRUniUti_Jsonclick = "" ;
      edtAlbRUniEnt_Jsonclick = "" ;
      cmbAlbRUni.setJsonclick( "" );
      edtAlbRPieDis_Jsonclick = "" ;
      edtAlbRPieUti_Jsonclick = "" ;
      edtAlbRPieEnt_Jsonclick = "" ;
      edtAlbRLoc_Jsonclick = "" ;
      edtAlbRLote_Jsonclick = "" ;
      edtAlbRTartD_Jsonclick = "" ;
      edtAlbRDisCli_Jsonclick = "" ;
      edtAlbRefDsc_Jsonclick = "" ;
      edtAlbRef_Jsonclick = "" ;
      edtCliNom_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      edtavAlbrent2_Jsonclick = "" ;
      edtavAlbrent2_Enabled = 1 ;
      edtAlbRFen_Jsonclick = "" ;
      cmbAlbRReo.setJsonclick( "" );
      edtAlbRecCod_Jsonclick = "" ;
      edtavDetailwebcomponent_Jsonclick = "" ;
      edtavDetailwebcomponent_Visible = -1 ;
      edtavDetailwebcomponent_Enabled = 1 ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtAlbRDes_Visible = -1 ;
      edtTipEntNom_Visible = -1 ;
      edtComposicio_Visible = -1 ;
      edtProceNom_Visible = -1 ;
      cmbAlbREst.setVisible( -1 );
      edtAlbRUniDis_Visible = -1 ;
      edtAlbRUniUti_Visible = -1 ;
      edtAlbRUniEnt_Visible = -1 ;
      cmbAlbRUni.setVisible( -1 );
      edtAlbRPieDis_Visible = -1 ;
      edtAlbRPieUti_Visible = -1 ;
      edtAlbRPieEnt_Visible = -1 ;
      edtAlbRLoc_Visible = -1 ;
      edtAlbRLote_Visible = -1 ;
      edtAlbRTartD_Visible = -1 ;
      edtAlbRDisCli_Visible = -1 ;
      edtAlbRefDsc_Visible = -1 ;
      edtAlbRef_Visible = -1 ;
      edtCliNom_Visible = -1 ;
      edtCliCod_Visible = -1 ;
      edtavAlbrent2_Visible = -1 ;
      edtAlbRFen_Visible = -1 ;
      cmbAlbRReo.setVisible( -1 );
      edtAlbRecCod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_albrfenauxdate_Jsonclick = "" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      divCell_grid_dwc_Class = "col-xs-12" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hascategories = GXutil.toBoolean( -1) ;
      Grid_titlescategories_Gridtitlescategories = ";;;;;;;;;;;;;Piezas;Piezas;Piezas;;Unidades;Unidades;Unidades;;;;;;" ;
      Detailwebcomponent_modal_Bodytype = "WebComponent" ;
      Detailwebcomponent_modal_Confirmtype = "" ;
      Detailwebcomponent_modal_Title = httpContext.getMessage( "Nº Recepción utilizada en las siguientes Producciones:", "") ;
      Detailwebcomponent_modal_Width = "400" ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "WCConsultaAlmacenTejidoencrudoGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "|NO:NO,SI:SI||||||||||||||K:K,M:M||||0:Abierta,1:Cerrada||||" ;
      Ddo_grid_Allowmultipleselection = "|T||||||||||||||T||||T||||" ;
      Ddo_grid_Datalisttype = "|FixedValues||||Dynamic|Dynamic|Dynamic|Dynamic|Dynamic|Dynamic|Dynamic||||FixedValues||||FixedValues|Dynamic|Dynamic|Dynamic|Dynamic" ;
      Ddo_grid_Includedatalist = "|T||||T|T|T|T|T|T|T||||T||||T|T|T|T|T" ;
      Ddo_grid_Filterisrange = "T||||T||||||||T|T|T||T|T|T|||||" ;
      Ddo_grid_Filtertype = "Numeric||Date||Numeric|Character|Character|Character|Character|Character|Character|Character|Numeric|Numeric|Numeric||Numeric|Numeric|Numeric||Character|Character|Character|Character" ;
      Ddo_grid_Includefilter = "T||T||T|T|T|T|T|T|T|T|T|T|T||T|T|T||T|T|T|T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T|T||T|T|T|T|T|T|T|T|T|T||T|T|T||T|T||T|T" ;
      Ddo_grid_Columnssortvalues = "2|3|1||4|5|6|7|8|9|10|11|12|13||14|15|16||17|18||19|20" ;
      Ddo_grid_Columnids = "1:AlbRecCod|2:AlbRReo|3:AlbRFen|4:AlbREnt2|5:CliCod|6:CliNom|7:AlbRef|8:AlbRefDsc|9:AlbRDisCli|10:AlbRTartD|11:AlbRLote|12:AlbRLoc|13:AlbRPieEnt|14:AlbRPieUti|15:AlbRPieDis|16:AlbRUni|17:AlbRUniEnt|18:AlbRUniUti|19:AlbRUniDis|20:AlbREst|21:ProceNom|22:Composicion|23:TipEntNom|24:AlbRDes" ;
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
      GXCCtl = "ALBRREO_" + sGXsfl_41_idx ;
      cmbAlbRReo.setName( GXCCtl );
      cmbAlbRReo.setWebtags( "" );
      cmbAlbRReo.addItem("NO", httpContext.getMessage( "NO", ""), (short)(0));
      cmbAlbRReo.addItem("SI", httpContext.getMessage( "SI", ""), (short)(0));
      if ( cmbAlbRReo.getItemCount() > 0 )
      {
      }
      GXCCtl = "ALBRUNI_" + sGXsfl_41_idx ;
      cmbAlbRUni.setName( GXCCtl );
      cmbAlbRUni.setWebtags( "" );
      cmbAlbRUni.addItem("K", httpContext.getMessage( "K", ""), (short)(0));
      cmbAlbRUni.addItem("M", httpContext.getMessage( "M", ""), (short)(0));
      if ( cmbAlbRUni.getItemCount() > 0 )
      {
      }
      GXCCtl = "ALBREST_" + sGXsfl_41_idx ;
      cmbAlbREst.setName( GXCCtl );
      cmbAlbREst.setWebtags( "" );
      cmbAlbREst.addItem("0", httpContext.getMessage( "Abierta", ""), (short)(0));
      cmbAlbREst.addItem("1", httpContext.getMessage( "Cerrada", ""), (short)(0));
      if ( cmbAlbREst.getItemCount() > 0 )
      {
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV67Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV68Albrfen',fld:'vALBRFEN',pic:''},{av:'AV69Albrfen_to',fld:'vALBRFEN_TO',pic:''},{av:'AV70Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV71Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV72AlbRef',fld:'vALBREF',pic:''},{av:'AV88albref_to',fld:'vALBREF_TO',pic:''},{av:'AV80Procecod',fld:'vPROCECOD',pic:'ZZZ9'},{av:'AV81ProceCod_to',fld:'vPROCECOD_TO',pic:'ZZZ9'},{av:'AV73AlbRReo',fld:'vALBRREO',pic:'@!'},{av:'AV74AlbREst',fld:'vALBREST',pic:'9'},{av:'AV90TipEntCod',fld:'vTIPENTCOD',pic:'ZZZ9'},{av:'AV89AlbRuni',fld:'vALBRUNI',pic:'@!'},{av:'AV14FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV27TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV78TFAlbRReo_Sels',fld:'vTFALBRREO_SELS',pic:''},{av:'AV33TFAlbRFen',fld:'vTFALBRFEN',pic:''},{av:'AV37TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV38TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV39TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV40TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV41TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV42TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV43TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV44TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV45TFAlbRDisCli',fld:'vTFALBRDISCLI',pic:''},{av:'AV46TFAlbRDisCli_Sel',fld:'vTFALBRDISCLI_SEL',pic:''},{av:'AV47TFAlbRTartD',fld:'vTFALBRTARTD',pic:''},{av:'AV48TFAlbRTartD_Sel',fld:'vTFALBRTARTD_SEL',pic:''},{av:'AV49TFAlbRLote',fld:'vTFALBRLOTE',pic:''},{av:'AV50TFAlbRLote_Sel',fld:'vTFALBRLOTE_SEL',pic:''},{av:'AV51TFAlbRLoc',fld:'vTFALBRLOC',pic:''},{av:'AV52TFAlbRLoc_Sel',fld:'vTFALBRLOC_SEL',pic:''},{av:'AV53TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV54TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV55TFAlbRPieUti',fld:'vTFALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV56TFAlbRPieUti_To',fld:'vTFALBRPIEUTI_TO',pic:'ZZZZZ9'},{av:'AV57TFAlbRPieDis',fld:'vTFALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV58TFAlbRPieDis_To',fld:'vTFALBRPIEDIS_TO',pic:'ZZZZZ9'},{av:'AV60TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV61TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV62TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV63TFAlbRUniUti',fld:'vTFALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV64TFAlbRUniUti_To',fld:'vTFALBRUNIUTI_TO',pic:'ZZZZZ9.99'},{av:'AV65TFAlbRUniDis',fld:'vTFALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV66TFAlbRUniDis_To',fld:'vTFALBRUNIDIS_TO',pic:'ZZZZZ9.99'},{av:'AV76TFAlbREst_Sels',fld:'vTFALBREST_SELS',pic:''},{av:'AV82TFProceNom',fld:'vTFPROCENOM',pic:''},{av:'AV83TFProceNom_Sel',fld:'vTFPROCENOM_SEL',pic:''},{av:'AV84TFComposicion',fld:'vTFCOMPOSICION',pic:''},{av:'AV85TFComposicion_Sel',fld:'vTFCOMPOSICION_SEL',pic:''},{av:'AV91TFTipEntNom',fld:'vTFTIPENTNOM',pic:''},{av:'AV92TFTipEntNom_Sel',fld:'vTFTIPENTNOM_SEL',pic:''},{av:'AV93TFAlbRDes',fld:'vTFALBRDES',pic:''},{av:'AV94TFAlbRDes_Sel',fld:'vTFALBRDES_SEL',pic:''},{av:'AV97Pgmname',fld:'vPGMNAME',pic:''},{av:'AV32OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV12OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtAlbRecCod_Visible',ctrl:'ALBRECCOD',prop:'Visible'},{av:'cmbAlbRReo'},{av:'edtAlbRFen_Visible',ctrl:'ALBRFEN',prop:'Visible'},{av:'edtavAlbrent2_Visible',ctrl:'vALBRENT2',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtAlbRef_Visible',ctrl:'ALBREF',prop:'Visible'},{av:'edtAlbRefDsc_Visible',ctrl:'ALBREFDSC',prop:'Visible'},{av:'edtAlbRDisCli_Visible',ctrl:'ALBRDISCLI',prop:'Visible'},{av:'edtAlbRTartD_Visible',ctrl:'ALBRTARTD',prop:'Visible'},{av:'edtAlbRLote_Visible',ctrl:'ALBRLOTE',prop:'Visible'},{av:'edtAlbRLoc_Visible',ctrl:'ALBRLOC',prop:'Visible'},{av:'edtAlbRPieEnt_Visible',ctrl:'ALBRPIEENT',prop:'Visible'},{av:'edtAlbRPieUti_Visible',ctrl:'ALBRPIEUTI',prop:'Visible'},{av:'edtAlbRPieDis_Visible',ctrl:'ALBRPIEDIS',prop:'Visible'},{av:'cmbAlbRUni'},{av:'edtAlbRUniEnt_Visible',ctrl:'ALBRUNIENT',prop:'Visible'},{av:'edtAlbRUniUti_Visible',ctrl:'ALBRUNIUTI',prop:'Visible'},{av:'edtAlbRUniDis_Visible',ctrl:'ALBRUNIDIS',prop:'Visible'},{av:'cmbAlbREst'},{av:'edtProceNom_Visible',ctrl:'PROCENOM',prop:'Visible'},{av:'edtComposicio_Visible',ctrl:'COMPOSICIO',prop:'Visible'},{av:'edtTipEntNom_Visible',ctrl:'TIPENTNOM',prop:'Visible'},{av:'edtAlbRDes_Visible',ctrl:'ALBRDES',prop:'Visible'},{av:'AV30GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV31GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e121662',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV67Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV68Albrfen',fld:'vALBRFEN',pic:''},{av:'AV69Albrfen_to',fld:'vALBRFEN_TO',pic:''},{av:'AV70Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV71Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV72AlbRef',fld:'vALBREF',pic:''},{av:'AV88albref_to',fld:'vALBREF_TO',pic:''},{av:'AV80Procecod',fld:'vPROCECOD',pic:'ZZZ9'},{av:'AV81ProceCod_to',fld:'vPROCECOD_TO',pic:'ZZZ9'},{av:'AV73AlbRReo',fld:'vALBRREO',pic:'@!'},{av:'AV74AlbREst',fld:'vALBREST',pic:'9'},{av:'AV90TipEntCod',fld:'vTIPENTCOD',pic:'ZZZ9'},{av:'AV89AlbRuni',fld:'vALBRUNI',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV14FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV27TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV78TFAlbRReo_Sels',fld:'vTFALBRREO_SELS',pic:''},{av:'AV33TFAlbRFen',fld:'vTFALBRFEN',pic:''},{av:'AV37TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV38TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV39TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV40TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV41TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV42TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV43TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV44TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV45TFAlbRDisCli',fld:'vTFALBRDISCLI',pic:''},{av:'AV46TFAlbRDisCli_Sel',fld:'vTFALBRDISCLI_SEL',pic:''},{av:'AV47TFAlbRTartD',fld:'vTFALBRTARTD',pic:''},{av:'AV48TFAlbRTartD_Sel',fld:'vTFALBRTARTD_SEL',pic:''},{av:'AV49TFAlbRLote',fld:'vTFALBRLOTE',pic:''},{av:'AV50TFAlbRLote_Sel',fld:'vTFALBRLOTE_SEL',pic:''},{av:'AV51TFAlbRLoc',fld:'vTFALBRLOC',pic:''},{av:'AV52TFAlbRLoc_Sel',fld:'vTFALBRLOC_SEL',pic:''},{av:'AV53TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV54TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV55TFAlbRPieUti',fld:'vTFALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV56TFAlbRPieUti_To',fld:'vTFALBRPIEUTI_TO',pic:'ZZZZZ9'},{av:'AV57TFAlbRPieDis',fld:'vTFALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV58TFAlbRPieDis_To',fld:'vTFALBRPIEDIS_TO',pic:'ZZZZZ9'},{av:'AV60TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV61TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV62TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV63TFAlbRUniUti',fld:'vTFALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV64TFAlbRUniUti_To',fld:'vTFALBRUNIUTI_TO',pic:'ZZZZZ9.99'},{av:'AV65TFAlbRUniDis',fld:'vTFALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV66TFAlbRUniDis_To',fld:'vTFALBRUNIDIS_TO',pic:'ZZZZZ9.99'},{av:'AV76TFAlbREst_Sels',fld:'vTFALBREST_SELS',pic:''},{av:'AV82TFProceNom',fld:'vTFPROCENOM',pic:''},{av:'AV83TFProceNom_Sel',fld:'vTFPROCENOM_SEL',pic:''},{av:'AV84TFComposicion',fld:'vTFCOMPOSICION',pic:''},{av:'AV85TFComposicion_Sel',fld:'vTFCOMPOSICION_SEL',pic:''},{av:'AV91TFTipEntNom',fld:'vTFTIPENTNOM',pic:''},{av:'AV92TFTipEntNom_Sel',fld:'vTFTIPENTNOM_SEL',pic:''},{av:'AV93TFAlbRDes',fld:'vTFALBRDES',pic:''},{av:'AV94TFAlbRDes_Sel',fld:'vTFALBRDES_SEL',pic:''},{av:'AV97Pgmname',fld:'vPGMNAME',pic:''},{av:'AV32OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV12OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e131662',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV67Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV68Albrfen',fld:'vALBRFEN',pic:''},{av:'AV69Albrfen_to',fld:'vALBRFEN_TO',pic:''},{av:'AV70Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV71Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV72AlbRef',fld:'vALBREF',pic:''},{av:'AV88albref_to',fld:'vALBREF_TO',pic:''},{av:'AV80Procecod',fld:'vPROCECOD',pic:'ZZZ9'},{av:'AV81ProceCod_to',fld:'vPROCECOD_TO',pic:'ZZZ9'},{av:'AV73AlbRReo',fld:'vALBRREO',pic:'@!'},{av:'AV74AlbREst',fld:'vALBREST',pic:'9'},{av:'AV90TipEntCod',fld:'vTIPENTCOD',pic:'ZZZ9'},{av:'AV89AlbRuni',fld:'vALBRUNI',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV14FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV27TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV78TFAlbRReo_Sels',fld:'vTFALBRREO_SELS',pic:''},{av:'AV33TFAlbRFen',fld:'vTFALBRFEN',pic:''},{av:'AV37TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV38TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV39TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV40TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV41TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV42TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV43TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV44TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV45TFAlbRDisCli',fld:'vTFALBRDISCLI',pic:''},{av:'AV46TFAlbRDisCli_Sel',fld:'vTFALBRDISCLI_SEL',pic:''},{av:'AV47TFAlbRTartD',fld:'vTFALBRTARTD',pic:''},{av:'AV48TFAlbRTartD_Sel',fld:'vTFALBRTARTD_SEL',pic:''},{av:'AV49TFAlbRLote',fld:'vTFALBRLOTE',pic:''},{av:'AV50TFAlbRLote_Sel',fld:'vTFALBRLOTE_SEL',pic:''},{av:'AV51TFAlbRLoc',fld:'vTFALBRLOC',pic:''},{av:'AV52TFAlbRLoc_Sel',fld:'vTFALBRLOC_SEL',pic:''},{av:'AV53TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV54TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV55TFAlbRPieUti',fld:'vTFALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV56TFAlbRPieUti_To',fld:'vTFALBRPIEUTI_TO',pic:'ZZZZZ9'},{av:'AV57TFAlbRPieDis',fld:'vTFALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV58TFAlbRPieDis_To',fld:'vTFALBRPIEDIS_TO',pic:'ZZZZZ9'},{av:'AV60TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV61TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV62TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV63TFAlbRUniUti',fld:'vTFALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV64TFAlbRUniUti_To',fld:'vTFALBRUNIUTI_TO',pic:'ZZZZZ9.99'},{av:'AV65TFAlbRUniDis',fld:'vTFALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV66TFAlbRUniDis_To',fld:'vTFALBRUNIDIS_TO',pic:'ZZZZZ9.99'},{av:'AV76TFAlbREst_Sels',fld:'vTFALBREST_SELS',pic:''},{av:'AV82TFProceNom',fld:'vTFPROCENOM',pic:''},{av:'AV83TFProceNom_Sel',fld:'vTFPROCENOM_SEL',pic:''},{av:'AV84TFComposicion',fld:'vTFCOMPOSICION',pic:''},{av:'AV85TFComposicion_Sel',fld:'vTFCOMPOSICION_SEL',pic:''},{av:'AV91TFTipEntNom',fld:'vTFTIPENTNOM',pic:''},{av:'AV92TFTipEntNom_Sel',fld:'vTFTIPENTNOM_SEL',pic:''},{av:'AV93TFAlbRDes',fld:'vTFALBRDES',pic:''},{av:'AV94TFAlbRDes_Sel',fld:'vTFALBRDES_SEL',pic:''},{av:'AV97Pgmname',fld:'vPGMNAME',pic:''},{av:'AV32OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV12OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e141662',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV67Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV68Albrfen',fld:'vALBRFEN',pic:''},{av:'AV69Albrfen_to',fld:'vALBRFEN_TO',pic:''},{av:'AV70Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV71Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV72AlbRef',fld:'vALBREF',pic:''},{av:'AV88albref_to',fld:'vALBREF_TO',pic:''},{av:'AV80Procecod',fld:'vPROCECOD',pic:'ZZZ9'},{av:'AV81ProceCod_to',fld:'vPROCECOD_TO',pic:'ZZZ9'},{av:'AV73AlbRReo',fld:'vALBRREO',pic:'@!'},{av:'AV74AlbREst',fld:'vALBREST',pic:'9'},{av:'AV90TipEntCod',fld:'vTIPENTCOD',pic:'ZZZ9'},{av:'AV89AlbRuni',fld:'vALBRUNI',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV14FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV27TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV78TFAlbRReo_Sels',fld:'vTFALBRREO_SELS',pic:''},{av:'AV33TFAlbRFen',fld:'vTFALBRFEN',pic:''},{av:'AV37TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV38TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV39TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV40TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV41TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV42TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV43TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV44TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV45TFAlbRDisCli',fld:'vTFALBRDISCLI',pic:''},{av:'AV46TFAlbRDisCli_Sel',fld:'vTFALBRDISCLI_SEL',pic:''},{av:'AV47TFAlbRTartD',fld:'vTFALBRTARTD',pic:''},{av:'AV48TFAlbRTartD_Sel',fld:'vTFALBRTARTD_SEL',pic:''},{av:'AV49TFAlbRLote',fld:'vTFALBRLOTE',pic:''},{av:'AV50TFAlbRLote_Sel',fld:'vTFALBRLOTE_SEL',pic:''},{av:'AV51TFAlbRLoc',fld:'vTFALBRLOC',pic:''},{av:'AV52TFAlbRLoc_Sel',fld:'vTFALBRLOC_SEL',pic:''},{av:'AV53TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV54TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV55TFAlbRPieUti',fld:'vTFALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV56TFAlbRPieUti_To',fld:'vTFALBRPIEUTI_TO',pic:'ZZZZZ9'},{av:'AV57TFAlbRPieDis',fld:'vTFALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV58TFAlbRPieDis_To',fld:'vTFALBRPIEDIS_TO',pic:'ZZZZZ9'},{av:'AV60TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV61TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV62TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV63TFAlbRUniUti',fld:'vTFALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV64TFAlbRUniUti_To',fld:'vTFALBRUNIUTI_TO',pic:'ZZZZZ9.99'},{av:'AV65TFAlbRUniDis',fld:'vTFALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV66TFAlbRUniDis_To',fld:'vTFALBRUNIDIS_TO',pic:'ZZZZZ9.99'},{av:'AV76TFAlbREst_Sels',fld:'vTFALBREST_SELS',pic:''},{av:'AV82TFProceNom',fld:'vTFPROCENOM',pic:''},{av:'AV83TFProceNom_Sel',fld:'vTFPROCENOM_SEL',pic:''},{av:'AV84TFComposicion',fld:'vTFCOMPOSICION',pic:''},{av:'AV85TFComposicion_Sel',fld:'vTFCOMPOSICION_SEL',pic:''},{av:'AV91TFTipEntNom',fld:'vTFTIPENTNOM',pic:''},{av:'AV92TFTipEntNom_Sel',fld:'vTFTIPENTNOM_SEL',pic:''},{av:'AV93TFAlbRDes',fld:'vTFALBRDES',pic:''},{av:'AV94TFAlbRDes_Sel',fld:'vTFALBRDES_SEL',pic:''},{av:'AV97Pgmname',fld:'vPGMNAME',pic:''},{av:'AV32OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV12OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV32OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV12OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV93TFAlbRDes',fld:'vTFALBRDES',pic:''},{av:'AV94TFAlbRDes_Sel',fld:'vTFALBRDES_SEL',pic:''},{av:'AV91TFTipEntNom',fld:'vTFTIPENTNOM',pic:''},{av:'AV92TFTipEntNom_Sel',fld:'vTFTIPENTNOM_SEL',pic:''},{av:'AV84TFComposicion',fld:'vTFCOMPOSICION',pic:''},{av:'AV85TFComposicion_Sel',fld:'vTFCOMPOSICION_SEL',pic:''},{av:'AV82TFProceNom',fld:'vTFPROCENOM',pic:''},{av:'AV83TFProceNom_Sel',fld:'vTFPROCENOM_SEL',pic:''},{av:'AV75TFAlbREst_SelsJson',fld:'vTFALBREST_SELSJSON',pic:''},{av:'AV76TFAlbREst_Sels',fld:'vTFALBREST_SELS',pic:''},{av:'AV65TFAlbRUniDis',fld:'vTFALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV66TFAlbRUniDis_To',fld:'vTFALBRUNIDIS_TO',pic:'ZZZZZ9.99'},{av:'AV63TFAlbRUniUti',fld:'vTFALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV64TFAlbRUniUti_To',fld:'vTFALBRUNIUTI_TO',pic:'ZZZZZ9.99'},{av:'AV61TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV62TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV59TFAlbRUni_SelsJson',fld:'vTFALBRUNI_SELSJSON',pic:''},{av:'AV60TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV57TFAlbRPieDis',fld:'vTFALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV58TFAlbRPieDis_To',fld:'vTFALBRPIEDIS_TO',pic:'ZZZZZ9'},{av:'AV55TFAlbRPieUti',fld:'vTFALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV56TFAlbRPieUti_To',fld:'vTFALBRPIEUTI_TO',pic:'ZZZZZ9'},{av:'AV53TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV54TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV51TFAlbRLoc',fld:'vTFALBRLOC',pic:''},{av:'AV52TFAlbRLoc_Sel',fld:'vTFALBRLOC_SEL',pic:''},{av:'AV49TFAlbRLote',fld:'vTFALBRLOTE',pic:''},{av:'AV50TFAlbRLote_Sel',fld:'vTFALBRLOTE_SEL',pic:''},{av:'AV47TFAlbRTartD',fld:'vTFALBRTARTD',pic:''},{av:'AV48TFAlbRTartD_Sel',fld:'vTFALBRTARTD_SEL',pic:''},{av:'AV45TFAlbRDisCli',fld:'vTFALBRDISCLI',pic:''},{av:'AV46TFAlbRDisCli_Sel',fld:'vTFALBRDISCLI_SEL',pic:''},{av:'AV43TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV44TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV41TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV42TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV39TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV40TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV37TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV38TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV33TFAlbRFen',fld:'vTFALBRFEN',pic:''},{av:'AV77TFAlbRReo_SelsJson',fld:'vTFALBRREO_SELSJSON',pic:''},{av:'AV78TFAlbRReo_Sels',fld:'vTFALBRREO_SELS',pic:''},{av:'AV26TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV27TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e211662',iparms:[{av:'A46AlbREnt',fld:'ALBRENT',pic:''},{av:'A5806AlbREnt2',fld:'ALBRENT2',pic:''}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV79DetailWebComponent',fld:'vDETAILWEBCOMPONENT',pic:''},{av:'AV15AlbREnt2',fld:'vALBRENT2',pic:''}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e151662',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV67Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV68Albrfen',fld:'vALBRFEN',pic:''},{av:'AV69Albrfen_to',fld:'vALBRFEN_TO',pic:''},{av:'AV70Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV71Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV72AlbRef',fld:'vALBREF',pic:''},{av:'AV88albref_to',fld:'vALBREF_TO',pic:''},{av:'AV80Procecod',fld:'vPROCECOD',pic:'ZZZ9'},{av:'AV81ProceCod_to',fld:'vPROCECOD_TO',pic:'ZZZ9'},{av:'AV73AlbRReo',fld:'vALBRREO',pic:'@!'},{av:'AV74AlbREst',fld:'vALBREST',pic:'9'},{av:'AV90TipEntCod',fld:'vTIPENTCOD',pic:'ZZZ9'},{av:'AV89AlbRuni',fld:'vALBRUNI',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV14FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV27TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV78TFAlbRReo_Sels',fld:'vTFALBRREO_SELS',pic:''},{av:'AV33TFAlbRFen',fld:'vTFALBRFEN',pic:''},{av:'AV37TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV38TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV39TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV40TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV41TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV42TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV43TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV44TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV45TFAlbRDisCli',fld:'vTFALBRDISCLI',pic:''},{av:'AV46TFAlbRDisCli_Sel',fld:'vTFALBRDISCLI_SEL',pic:''},{av:'AV47TFAlbRTartD',fld:'vTFALBRTARTD',pic:''},{av:'AV48TFAlbRTartD_Sel',fld:'vTFALBRTARTD_SEL',pic:''},{av:'AV49TFAlbRLote',fld:'vTFALBRLOTE',pic:''},{av:'AV50TFAlbRLote_Sel',fld:'vTFALBRLOTE_SEL',pic:''},{av:'AV51TFAlbRLoc',fld:'vTFALBRLOC',pic:''},{av:'AV52TFAlbRLoc_Sel',fld:'vTFALBRLOC_SEL',pic:''},{av:'AV53TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV54TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV55TFAlbRPieUti',fld:'vTFALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV56TFAlbRPieUti_To',fld:'vTFALBRPIEUTI_TO',pic:'ZZZZZ9'},{av:'AV57TFAlbRPieDis',fld:'vTFALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV58TFAlbRPieDis_To',fld:'vTFALBRPIEDIS_TO',pic:'ZZZZZ9'},{av:'AV60TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV61TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV62TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV63TFAlbRUniUti',fld:'vTFALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV64TFAlbRUniUti_To',fld:'vTFALBRUNIUTI_TO',pic:'ZZZZZ9.99'},{av:'AV65TFAlbRUniDis',fld:'vTFALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV66TFAlbRUniDis_To',fld:'vTFALBRUNIDIS_TO',pic:'ZZZZZ9.99'},{av:'AV76TFAlbREst_Sels',fld:'vTFALBREST_SELS',pic:''},{av:'AV82TFProceNom',fld:'vTFPROCENOM',pic:''},{av:'AV83TFProceNom_Sel',fld:'vTFPROCENOM_SEL',pic:''},{av:'AV84TFComposicion',fld:'vTFCOMPOSICION',pic:''},{av:'AV85TFComposicion_Sel',fld:'vTFCOMPOSICION_SEL',pic:''},{av:'AV91TFTipEntNom',fld:'vTFTIPENTNOM',pic:''},{av:'AV92TFTipEntNom_Sel',fld:'vTFTIPENTNOM_SEL',pic:''},{av:'AV93TFAlbRDes',fld:'vTFALBRDES',pic:''},{av:'AV94TFAlbRDes_Sel',fld:'vTFALBRDES_SEL',pic:''},{av:'AV97Pgmname',fld:'vPGMNAME',pic:''},{av:'AV32OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV12OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtAlbRecCod_Visible',ctrl:'ALBRECCOD',prop:'Visible'},{av:'cmbAlbRReo'},{av:'edtAlbRFen_Visible',ctrl:'ALBRFEN',prop:'Visible'},{av:'edtavAlbrent2_Visible',ctrl:'vALBRENT2',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtAlbRef_Visible',ctrl:'ALBREF',prop:'Visible'},{av:'edtAlbRefDsc_Visible',ctrl:'ALBREFDSC',prop:'Visible'},{av:'edtAlbRDisCli_Visible',ctrl:'ALBRDISCLI',prop:'Visible'},{av:'edtAlbRTartD_Visible',ctrl:'ALBRTARTD',prop:'Visible'},{av:'edtAlbRLote_Visible',ctrl:'ALBRLOTE',prop:'Visible'},{av:'edtAlbRLoc_Visible',ctrl:'ALBRLOC',prop:'Visible'},{av:'edtAlbRPieEnt_Visible',ctrl:'ALBRPIEENT',prop:'Visible'},{av:'edtAlbRPieUti_Visible',ctrl:'ALBRPIEUTI',prop:'Visible'},{av:'edtAlbRPieDis_Visible',ctrl:'ALBRPIEDIS',prop:'Visible'},{av:'cmbAlbRUni'},{av:'edtAlbRUniEnt_Visible',ctrl:'ALBRUNIENT',prop:'Visible'},{av:'edtAlbRUniUti_Visible',ctrl:'ALBRUNIUTI',prop:'Visible'},{av:'edtAlbRUniDis_Visible',ctrl:'ALBRUNIDIS',prop:'Visible'},{av:'cmbAlbREst'},{av:'edtProceNom_Visible',ctrl:'PROCENOM',prop:'Visible'},{av:'edtComposicio_Visible',ctrl:'COMPOSICIO',prop:'Visible'},{av:'edtTipEntNom_Visible',ctrl:'TIPENTNOM',prop:'Visible'},{av:'edtAlbRDes_Visible',ctrl:'ALBRDES',prop:'Visible'},{av:'AV30GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV31GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e111662',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV67Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV68Albrfen',fld:'vALBRFEN',pic:''},{av:'AV69Albrfen_to',fld:'vALBRFEN_TO',pic:''},{av:'AV70Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV71Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV72AlbRef',fld:'vALBREF',pic:''},{av:'AV88albref_to',fld:'vALBREF_TO',pic:''},{av:'AV80Procecod',fld:'vPROCECOD',pic:'ZZZ9'},{av:'AV81ProceCod_to',fld:'vPROCECOD_TO',pic:'ZZZ9'},{av:'AV73AlbRReo',fld:'vALBRREO',pic:'@!'},{av:'AV74AlbREst',fld:'vALBREST',pic:'9'},{av:'AV90TipEntCod',fld:'vTIPENTCOD',pic:'ZZZ9'},{av:'AV89AlbRuni',fld:'vALBRUNI',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV14FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV27TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV78TFAlbRReo_Sels',fld:'vTFALBRREO_SELS',pic:''},{av:'AV33TFAlbRFen',fld:'vTFALBRFEN',pic:''},{av:'AV37TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV38TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV39TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV40TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV41TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV42TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV43TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV44TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV45TFAlbRDisCli',fld:'vTFALBRDISCLI',pic:''},{av:'AV46TFAlbRDisCli_Sel',fld:'vTFALBRDISCLI_SEL',pic:''},{av:'AV47TFAlbRTartD',fld:'vTFALBRTARTD',pic:''},{av:'AV48TFAlbRTartD_Sel',fld:'vTFALBRTARTD_SEL',pic:''},{av:'AV49TFAlbRLote',fld:'vTFALBRLOTE',pic:''},{av:'AV50TFAlbRLote_Sel',fld:'vTFALBRLOTE_SEL',pic:''},{av:'AV51TFAlbRLoc',fld:'vTFALBRLOC',pic:''},{av:'AV52TFAlbRLoc_Sel',fld:'vTFALBRLOC_SEL',pic:''},{av:'AV53TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV54TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV55TFAlbRPieUti',fld:'vTFALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV56TFAlbRPieUti_To',fld:'vTFALBRPIEUTI_TO',pic:'ZZZZZ9'},{av:'AV57TFAlbRPieDis',fld:'vTFALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV58TFAlbRPieDis_To',fld:'vTFALBRPIEDIS_TO',pic:'ZZZZZ9'},{av:'AV60TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV61TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV62TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV63TFAlbRUniUti',fld:'vTFALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV64TFAlbRUniUti_To',fld:'vTFALBRUNIUTI_TO',pic:'ZZZZZ9.99'},{av:'AV65TFAlbRUniDis',fld:'vTFALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV66TFAlbRUniDis_To',fld:'vTFALBRUNIDIS_TO',pic:'ZZZZZ9.99'},{av:'AV76TFAlbREst_Sels',fld:'vTFALBREST_SELS',pic:''},{av:'AV82TFProceNom',fld:'vTFPROCENOM',pic:''},{av:'AV83TFProceNom_Sel',fld:'vTFPROCENOM_SEL',pic:''},{av:'AV84TFComposicion',fld:'vTFCOMPOSICION',pic:''},{av:'AV85TFComposicion_Sel',fld:'vTFCOMPOSICION_SEL',pic:''},{av:'AV91TFTipEntNom',fld:'vTFTIPENTNOM',pic:''},{av:'AV92TFTipEntNom_Sel',fld:'vTFTIPENTNOM_SEL',pic:''},{av:'AV93TFAlbRDes',fld:'vTFALBRDES',pic:''},{av:'AV94TFAlbRDes_Sel',fld:'vTFALBRDES_SEL',pic:''},{av:'AV97Pgmname',fld:'vPGMNAME',pic:''},{av:'AV32OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV12OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV77TFAlbRReo_SelsJson',fld:'vTFALBRREO_SELSJSON',pic:''},{av:'AV59TFAlbRUni_SelsJson',fld:'vTFALBRUNI_SELSJSON',pic:''},{av:'AV75TFAlbREst_SelsJson',fld:'vTFALBREST_SELSJSON',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV32OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV12OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV14FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV27TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV78TFAlbRReo_Sels',fld:'vTFALBRREO_SELS',pic:''},{av:'AV33TFAlbRFen',fld:'vTFALBRFEN',pic:''},{av:'AV37TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV38TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV39TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV40TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV41TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV42TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV43TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV44TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV45TFAlbRDisCli',fld:'vTFALBRDISCLI',pic:''},{av:'AV46TFAlbRDisCli_Sel',fld:'vTFALBRDISCLI_SEL',pic:''},{av:'AV47TFAlbRTartD',fld:'vTFALBRTARTD',pic:''},{av:'AV48TFAlbRTartD_Sel',fld:'vTFALBRTARTD_SEL',pic:''},{av:'AV49TFAlbRLote',fld:'vTFALBRLOTE',pic:''},{av:'AV50TFAlbRLote_Sel',fld:'vTFALBRLOTE_SEL',pic:''},{av:'AV51TFAlbRLoc',fld:'vTFALBRLOC',pic:''},{av:'AV52TFAlbRLoc_Sel',fld:'vTFALBRLOC_SEL',pic:''},{av:'AV53TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV54TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV55TFAlbRPieUti',fld:'vTFALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV56TFAlbRPieUti_To',fld:'vTFALBRPIEUTI_TO',pic:'ZZZZZ9'},{av:'AV57TFAlbRPieDis',fld:'vTFALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV58TFAlbRPieDis_To',fld:'vTFALBRPIEDIS_TO',pic:'ZZZZZ9'},{av:'AV60TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV61TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV62TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV63TFAlbRUniUti',fld:'vTFALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV64TFAlbRUniUti_To',fld:'vTFALBRUNIUTI_TO',pic:'ZZZZZ9.99'},{av:'AV65TFAlbRUniDis',fld:'vTFALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV66TFAlbRUniDis_To',fld:'vTFALBRUNIDIS_TO',pic:'ZZZZZ9.99'},{av:'AV76TFAlbREst_Sels',fld:'vTFALBREST_SELS',pic:''},{av:'AV82TFProceNom',fld:'vTFPROCENOM',pic:''},{av:'AV83TFProceNom_Sel',fld:'vTFPROCENOM_SEL',pic:''},{av:'AV84TFComposicion',fld:'vTFCOMPOSICION',pic:''},{av:'AV85TFComposicion_Sel',fld:'vTFCOMPOSICION_SEL',pic:''},{av:'AV91TFTipEntNom',fld:'vTFTIPENTNOM',pic:''},{av:'AV92TFTipEntNom_Sel',fld:'vTFTIPENTNOM_SEL',pic:''},{av:'AV93TFAlbRDes',fld:'vTFALBRDES',pic:''},{av:'AV94TFAlbRDes_Sel',fld:'vTFALBRDES_SEL',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV75TFAlbREst_SelsJson',fld:'vTFALBREST_SELSJSON',pic:''},{av:'AV59TFAlbRUni_SelsJson',fld:'vTFALBRUNI_SELSJSON',pic:''},{av:'AV77TFAlbRReo_SelsJson',fld:'vTFALBRREO_SELSJSON',pic:''},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtAlbRecCod_Visible',ctrl:'ALBRECCOD',prop:'Visible'},{av:'cmbAlbRReo'},{av:'edtAlbRFen_Visible',ctrl:'ALBRFEN',prop:'Visible'},{av:'edtavAlbrent2_Visible',ctrl:'vALBRENT2',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtAlbRef_Visible',ctrl:'ALBREF',prop:'Visible'},{av:'edtAlbRefDsc_Visible',ctrl:'ALBREFDSC',prop:'Visible'},{av:'edtAlbRDisCli_Visible',ctrl:'ALBRDISCLI',prop:'Visible'},{av:'edtAlbRTartD_Visible',ctrl:'ALBRTARTD',prop:'Visible'},{av:'edtAlbRLote_Visible',ctrl:'ALBRLOTE',prop:'Visible'},{av:'edtAlbRLoc_Visible',ctrl:'ALBRLOC',prop:'Visible'},{av:'edtAlbRPieEnt_Visible',ctrl:'ALBRPIEENT',prop:'Visible'},{av:'edtAlbRPieUti_Visible',ctrl:'ALBRPIEUTI',prop:'Visible'},{av:'edtAlbRPieDis_Visible',ctrl:'ALBRPIEDIS',prop:'Visible'},{av:'cmbAlbRUni'},{av:'edtAlbRUniEnt_Visible',ctrl:'ALBRUNIENT',prop:'Visible'},{av:'edtAlbRUniUti_Visible',ctrl:'ALBRUNIUTI',prop:'Visible'},{av:'edtAlbRUniDis_Visible',ctrl:'ALBRUNIDIS',prop:'Visible'},{av:'cmbAlbREst'},{av:'edtProceNom_Visible',ctrl:'PROCENOM',prop:'Visible'},{av:'edtComposicio_Visible',ctrl:'COMPOSICIO',prop:'Visible'},{av:'edtTipEntNom_Visible',ctrl:'TIPENTNOM',prop:'Visible'},{av:'edtAlbRDes_Visible',ctrl:'ALBRDES',prop:'Visible'},{av:'AV30GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV31GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK","{handler:'e221662',iparms:[{av:'AV67Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK",",oparms:[{ctrl:'GRID_DWC'}]}");
      setEventMetadata("DETAILWEBCOMPONENT_MODAL.CLOSE","{handler:'e161662',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV67Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV68Albrfen',fld:'vALBRFEN',pic:''},{av:'AV69Albrfen_to',fld:'vALBRFEN_TO',pic:''},{av:'AV70Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV71Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV72AlbRef',fld:'vALBREF',pic:''},{av:'AV88albref_to',fld:'vALBREF_TO',pic:''},{av:'AV80Procecod',fld:'vPROCECOD',pic:'ZZZ9'},{av:'AV81ProceCod_to',fld:'vPROCECOD_TO',pic:'ZZZ9'},{av:'AV73AlbRReo',fld:'vALBRREO',pic:'@!'},{av:'AV74AlbREst',fld:'vALBREST',pic:'9'},{av:'AV90TipEntCod',fld:'vTIPENTCOD',pic:'ZZZ9'},{av:'AV89AlbRuni',fld:'vALBRUNI',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV14FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV27TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV78TFAlbRReo_Sels',fld:'vTFALBRREO_SELS',pic:''},{av:'AV33TFAlbRFen',fld:'vTFALBRFEN',pic:''},{av:'AV37TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV38TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV39TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV40TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV41TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV42TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV43TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV44TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV45TFAlbRDisCli',fld:'vTFALBRDISCLI',pic:''},{av:'AV46TFAlbRDisCli_Sel',fld:'vTFALBRDISCLI_SEL',pic:''},{av:'AV47TFAlbRTartD',fld:'vTFALBRTARTD',pic:''},{av:'AV48TFAlbRTartD_Sel',fld:'vTFALBRTARTD_SEL',pic:''},{av:'AV49TFAlbRLote',fld:'vTFALBRLOTE',pic:''},{av:'AV50TFAlbRLote_Sel',fld:'vTFALBRLOTE_SEL',pic:''},{av:'AV51TFAlbRLoc',fld:'vTFALBRLOC',pic:''},{av:'AV52TFAlbRLoc_Sel',fld:'vTFALBRLOC_SEL',pic:''},{av:'AV53TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV54TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV55TFAlbRPieUti',fld:'vTFALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV56TFAlbRPieUti_To',fld:'vTFALBRPIEUTI_TO',pic:'ZZZZZ9'},{av:'AV57TFAlbRPieDis',fld:'vTFALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV58TFAlbRPieDis_To',fld:'vTFALBRPIEDIS_TO',pic:'ZZZZZ9'},{av:'AV60TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV61TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV62TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV63TFAlbRUniUti',fld:'vTFALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV64TFAlbRUniUti_To',fld:'vTFALBRUNIUTI_TO',pic:'ZZZZZ9.99'},{av:'AV65TFAlbRUniDis',fld:'vTFALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV66TFAlbRUniDis_To',fld:'vTFALBRUNIDIS_TO',pic:'ZZZZZ9.99'},{av:'AV76TFAlbREst_Sels',fld:'vTFALBREST_SELS',pic:''},{av:'AV82TFProceNom',fld:'vTFPROCENOM',pic:''},{av:'AV83TFProceNom_Sel',fld:'vTFPROCENOM_SEL',pic:''},{av:'AV84TFComposicion',fld:'vTFCOMPOSICION',pic:''},{av:'AV85TFComposicion_Sel',fld:'vTFCOMPOSICION_SEL',pic:''},{av:'AV91TFTipEntNom',fld:'vTFTIPENTNOM',pic:''},{av:'AV92TFTipEntNom_Sel',fld:'vTFTIPENTNOM_SEL',pic:''},{av:'AV93TFAlbRDes',fld:'vTFALBRDES',pic:''},{av:'AV94TFAlbRDes_Sel',fld:'vTFALBRDES_SEL',pic:''},{av:'AV97Pgmname',fld:'vPGMNAME',pic:''},{av:'AV32OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV12OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'}]");
      setEventMetadata("DETAILWEBCOMPONENT_MODAL.CLOSE",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtAlbRecCod_Visible',ctrl:'ALBRECCOD',prop:'Visible'},{av:'cmbAlbRReo'},{av:'edtAlbRFen_Visible',ctrl:'ALBRFEN',prop:'Visible'},{av:'edtavAlbrent2_Visible',ctrl:'vALBRENT2',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtAlbRef_Visible',ctrl:'ALBREF',prop:'Visible'},{av:'edtAlbRefDsc_Visible',ctrl:'ALBREFDSC',prop:'Visible'},{av:'edtAlbRDisCli_Visible',ctrl:'ALBRDISCLI',prop:'Visible'},{av:'edtAlbRTartD_Visible',ctrl:'ALBRTARTD',prop:'Visible'},{av:'edtAlbRLote_Visible',ctrl:'ALBRLOTE',prop:'Visible'},{av:'edtAlbRLoc_Visible',ctrl:'ALBRLOC',prop:'Visible'},{av:'edtAlbRPieEnt_Visible',ctrl:'ALBRPIEENT',prop:'Visible'},{av:'edtAlbRPieUti_Visible',ctrl:'ALBRPIEUTI',prop:'Visible'},{av:'edtAlbRPieDis_Visible',ctrl:'ALBRPIEDIS',prop:'Visible'},{av:'cmbAlbRUni'},{av:'edtAlbRUniEnt_Visible',ctrl:'ALBRUNIENT',prop:'Visible'},{av:'edtAlbRUniUti_Visible',ctrl:'ALBRUNIUTI',prop:'Visible'},{av:'edtAlbRUniDis_Visible',ctrl:'ALBRUNIDIS',prop:'Visible'},{av:'cmbAlbREst'},{av:'edtProceNom_Visible',ctrl:'PROCENOM',prop:'Visible'},{av:'edtComposicio_Visible',ctrl:'COMPOSICIO',prop:'Visible'},{av:'edtTipEntNom_Visible',ctrl:'TIPENTNOM',prop:'Visible'},{av:'edtAlbRDes_Visible',ctrl:'ALBRDES',prop:'Visible'},{av:'AV30GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV31GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e171662',iparms:[]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e181662',iparms:[]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("VALID_ALBRECCOD","{handler:'valid_Albreccod',iparms:[]");
      setEventMetadata("VALID_ALBRECCOD",",oparms:[]}");
      setEventMetadata("VALID_ALBRREO","{handler:'valid_Albrreo',iparms:[]");
      setEventMetadata("VALID_ALBRREO",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_CLINOM","{handler:'valid_Clinom',iparms:[]");
      setEventMetadata("VALID_CLINOM",",oparms:[]}");
      setEventMetadata("VALID_ALBREF","{handler:'valid_Albref',iparms:[]");
      setEventMetadata("VALID_ALBREF",",oparms:[]}");
      setEventMetadata("VALID_ALBREFDSC","{handler:'valid_Albrefdsc',iparms:[]");
      setEventMetadata("VALID_ALBREFDSC",",oparms:[]}");
      setEventMetadata("VALID_ALBRDISCLI","{handler:'valid_Albrdiscli',iparms:[]");
      setEventMetadata("VALID_ALBRDISCLI",",oparms:[]}");
      setEventMetadata("VALID_ALBRTARTD","{handler:'valid_Albrtartd',iparms:[]");
      setEventMetadata("VALID_ALBRTARTD",",oparms:[]}");
      setEventMetadata("VALID_ALBRLOTE","{handler:'valid_Albrlote',iparms:[]");
      setEventMetadata("VALID_ALBRLOTE",",oparms:[]}");
      setEventMetadata("VALID_ALBRLOC","{handler:'valid_Albrloc',iparms:[]");
      setEventMetadata("VALID_ALBRLOC",",oparms:[]}");
      setEventMetadata("VALID_ALBRPIEENT","{handler:'valid_Albrpieent',iparms:[]");
      setEventMetadata("VALID_ALBRPIEENT",",oparms:[]}");
      setEventMetadata("VALID_ALBRPIEUTI","{handler:'valid_Albrpieuti',iparms:[]");
      setEventMetadata("VALID_ALBRPIEUTI",",oparms:[]}");
      setEventMetadata("VALID_ALBRPIEDIS","{handler:'valid_Albrpiedis',iparms:[]");
      setEventMetadata("VALID_ALBRPIEDIS",",oparms:[]}");
      setEventMetadata("VALID_ALBRUNI","{handler:'valid_Albruni',iparms:[]");
      setEventMetadata("VALID_ALBRUNI",",oparms:[]}");
      setEventMetadata("VALID_ALBRUNIENT","{handler:'valid_Albrunient',iparms:[]");
      setEventMetadata("VALID_ALBRUNIENT",",oparms:[]}");
      setEventMetadata("VALID_ALBRUNIUTI","{handler:'valid_Albruniuti',iparms:[]");
      setEventMetadata("VALID_ALBRUNIUTI",",oparms:[]}");
      setEventMetadata("VALID_ALBRUNIDIS","{handler:'valid_Albrunidis',iparms:[]");
      setEventMetadata("VALID_ALBRUNIDIS",",oparms:[]}");
      setEventMetadata("VALID_ALBREST","{handler:'valid_Albrest',iparms:[]");
      setEventMetadata("VALID_ALBREST",",oparms:[]}");
      setEventMetadata("VALID_PROCENOM","{handler:'valid_Procenom',iparms:[]");
      setEventMetadata("VALID_PROCENOM",",oparms:[]}");
      setEventMetadata("VALID_COMPOSICIO","{handler:'valid_Composicio',iparms:[]");
      setEventMetadata("VALID_COMPOSICIO",",oparms:[]}");
      setEventMetadata("VALID_TIPENTNOM","{handler:'valid_Tipentnom',iparms:[]");
      setEventMetadata("VALID_TIPENTNOM",",oparms:[]}");
      setEventMetadata("VALID_ALBRDES","{handler:'valid_Albrdes',iparms:[]");
      setEventMetadata("VALID_ALBRDES",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Albrartlu',iparms:[]");
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
      wcpOAV67Emprcod = "" ;
      wcpOAV68Albrfen = GXutil.nullDate() ;
      wcpOAV69Albrfen_to = GXutil.nullDate() ;
      wcpOAV72AlbRef = "" ;
      wcpOAV88albref_to = "" ;
      wcpOAV73AlbRReo = "" ;
      wcpOAV89AlbRuni = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV67Emprcod = "" ;
      AV68Albrfen = GXutil.nullDate() ;
      AV69Albrfen_to = GXutil.nullDate() ;
      AV72AlbRef = "" ;
      AV88albref_to = "" ;
      AV73AlbRReo = "" ;
      AV89AlbRuni = "" ;
      AV20ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV14FilterFullText = "" ;
      AV78TFAlbRReo_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV33TFAlbRFen = GXutil.nullDate() ;
      AV39TFCliNom = "" ;
      AV40TFCliNom_Sel = "" ;
      AV41TFAlbRef = "" ;
      AV42TFAlbRef_Sel = "" ;
      AV43TFAlbRefDsc = "" ;
      AV44TFAlbRefDsc_Sel = "" ;
      AV45TFAlbRDisCli = "" ;
      AV46TFAlbRDisCli_Sel = "" ;
      AV47TFAlbRTartD = "" ;
      AV48TFAlbRTartD_Sel = "" ;
      AV49TFAlbRLote = "" ;
      AV50TFAlbRLote_Sel = "" ;
      AV51TFAlbRLoc = "" ;
      AV52TFAlbRLoc_Sel = "" ;
      AV60TFAlbRUni_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV61TFAlbRUniEnt = DecimalUtil.ZERO ;
      AV62TFAlbRUniEnt_To = DecimalUtil.ZERO ;
      AV63TFAlbRUniUti = DecimalUtil.ZERO ;
      AV64TFAlbRUniUti_To = DecimalUtil.ZERO ;
      AV65TFAlbRUniDis = DecimalUtil.ZERO ;
      AV66TFAlbRUniDis_To = DecimalUtil.ZERO ;
      AV76TFAlbREst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV82TFProceNom = "" ;
      AV83TFProceNom_Sel = "" ;
      AV84TFComposicion = "" ;
      AV85TFComposicion_Sel = "" ;
      AV91TFTipEntNom = "" ;
      AV92TFTipEntNom_Sel = "" ;
      AV93TFAlbRDes = "" ;
      AV94TFAlbRDes_Sel = "" ;
      AV97Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV23ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV28DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A46AlbREnt = "" ;
      A5806AlbREnt2 = "" ;
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV77TFAlbRReo_SelsJson = "" ;
      AV59TFAlbRUni_SelsJson = "" ;
      AV75TFAlbREst_SelsJson = "" ;
      A396EmprCod = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_titlescategories_Gridinternalname = "" ;
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
      WebComp_Grid_dwc_Component = "" ;
      OldGrid_dwc = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_titlescategories = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      WebComp_Wwpaux_wc_Component = "" ;
      OldWwpaux_wc = "" ;
      AV35DDO_AlbRFenAuxDate = GXutil.nullDate() ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV79DetailWebComponent = "" ;
      A55AlbRReo = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      AV15AlbREnt2 = "" ;
      A279CliNom = "" ;
      A45AlbRef = "" ;
      A3613AlbRefDsc = "" ;
      A3359AlbRDisCli = "" ;
      A6264AlbRTartD = "" ;
      A6463AlbRLote = "" ;
      A50AlbRLoc = "" ;
      A56AlbRUni = "" ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      A971ProceNom = "" ;
      A13981Composicio = "" ;
      A1212TipEntNom = "" ;
      A1291AlbRDes = "" ;
      A13982AlbRArtLu = DecimalUtil.ZERO ;
      AV101Wcconsultaalmacentejidoencrudods_1_filterfulltext = "" ;
      AV104Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV105Wcconsultaalmacentejidoencrudods_5_tfalbrfen = GXutil.nullDate() ;
      AV108Wcconsultaalmacentejidoencrudods_8_tfclinom = "" ;
      AV109Wcconsultaalmacentejidoencrudods_9_tfclinom_sel = "" ;
      AV110Wcconsultaalmacentejidoencrudods_10_tfalbref = "" ;
      AV111Wcconsultaalmacentejidoencrudods_11_tfalbref_sel = "" ;
      AV112Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc = "" ;
      AV113Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel = "" ;
      AV114Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli = "" ;
      AV115Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel = "" ;
      AV116Wcconsultaalmacentejidoencrudods_16_tfalbrtartd = "" ;
      AV117Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel = "" ;
      AV118Wcconsultaalmacentejidoencrudods_18_tfalbrlote = "" ;
      AV119Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel = "" ;
      AV120Wcconsultaalmacentejidoencrudods_20_tfalbrloc = "" ;
      AV121Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel = "" ;
      AV128Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV129Wcconsultaalmacentejidoencrudods_29_tfalbrunient = DecimalUtil.ZERO ;
      AV130Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to = DecimalUtil.ZERO ;
      AV131Wcconsultaalmacentejidoencrudods_31_tfalbruniuti = DecimalUtil.ZERO ;
      AV132Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to = DecimalUtil.ZERO ;
      AV133Wcconsultaalmacentejidoencrudods_33_tfalbrunidis = DecimalUtil.ZERO ;
      AV134Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to = DecimalUtil.ZERO ;
      AV135Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV136Wcconsultaalmacentejidoencrudods_36_tfprocenom = "" ;
      AV137Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel = "" ;
      AV138Wcconsultaalmacentejidoencrudods_38_tfcomposicion = "" ;
      AV139Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel = "" ;
      AV140Wcconsultaalmacentejidoencrudods_40_tftipentnom = "" ;
      AV141Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel = "" ;
      AV142Wcconsultaalmacentejidoencrudods_42_tfalbrdes = "" ;
      AV143Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel = "" ;
      scmdbuf = "" ;
      lV101Wcconsultaalmacentejidoencrudods_1_filterfulltext = "" ;
      lV108Wcconsultaalmacentejidoencrudods_8_tfclinom = "" ;
      lV110Wcconsultaalmacentejidoencrudods_10_tfalbref = "" ;
      lV112Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc = "" ;
      lV114Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli = "" ;
      lV116Wcconsultaalmacentejidoencrudods_16_tfalbrtartd = "" ;
      lV118Wcconsultaalmacentejidoencrudods_18_tfalbrlote = "" ;
      lV120Wcconsultaalmacentejidoencrudods_20_tfalbrloc = "" ;
      lV136Wcconsultaalmacentejidoencrudods_36_tfprocenom = "" ;
      lV140Wcconsultaalmacentejidoencrudods_40_tftipentnom = "" ;
      lV142Wcconsultaalmacentejidoencrudods_42_tfalbrdes = "" ;
      H01662_A65ArtCod = new String[] {""} ;
      H01662_A6263AlbRTartC = new short[1] ;
      H01662_n6263AlbRTartC = new boolean[] {false} ;
      H01662_A970ProceCod = new short[1] ;
      H01662_n970ProceCod = new boolean[] {false} ;
      H01662_A1211TipEntCod = new short[1] ;
      H01662_n1211TipEntCod = new boolean[] {false} ;
      H01662_A46AlbREnt = new String[] {""} ;
      H01662_A5806AlbREnt2 = new String[] {""} ;
      H01662_A1291AlbRDes = new String[] {""} ;
      H01662_A1212TipEntNom = new String[] {""} ;
      H01662_n1212TipEntNom = new boolean[] {false} ;
      H01662_A971ProceNom = new String[] {""} ;
      H01662_n971ProceNom = new boolean[] {false} ;
      H01662_A47AlbREst = new byte[1] ;
      H01662_A57AlbRUniDis = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01662_A56AlbRUni = new String[] {""} ;
      H01662_A51AlbRPieDis = new int[1] ;
      H01662_A50AlbRLoc = new String[] {""} ;
      H01662_A6463AlbRLote = new String[] {""} ;
      H01662_A6264AlbRTartD = new String[] {""} ;
      H01662_n6264AlbRTartD = new boolean[] {false} ;
      H01662_A3359AlbRDisCli = new String[] {""} ;
      H01662_A3613AlbRefDsc = new String[] {""} ;
      H01662_A279CliNom = new String[] {""} ;
      H01662_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      H01662_A55AlbRReo = new String[] {""} ;
      H01662_A44AlbRecCod = new int[1] ;
      H01662_A13982AlbRArtLu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01662_n13982AlbRArtLu = new boolean[] {false} ;
      H01662_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01662_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01662_A52AlbRPieEnt = new int[1] ;
      H01662_A54AlbRPieUti = new int[1] ;
      H01662_A45AlbRef = new String[] {""} ;
      H01662_A252CliCod = new int[1] ;
      H01662_A396EmprCod = new String[] {""} ;
      H01663_A65ArtCod = new String[] {""} ;
      H01663_A6263AlbRTartC = new short[1] ;
      H01663_n6263AlbRTartC = new boolean[] {false} ;
      H01663_A970ProceCod = new short[1] ;
      H01663_n970ProceCod = new boolean[] {false} ;
      H01663_A1211TipEntCod = new short[1] ;
      H01663_n1211TipEntCod = new boolean[] {false} ;
      H01663_A46AlbREnt = new String[] {""} ;
      H01663_A5806AlbREnt2 = new String[] {""} ;
      H01663_A1291AlbRDes = new String[] {""} ;
      H01663_A1212TipEntNom = new String[] {""} ;
      H01663_n1212TipEntNom = new boolean[] {false} ;
      H01663_A971ProceNom = new String[] {""} ;
      H01663_n971ProceNom = new boolean[] {false} ;
      H01663_A47AlbREst = new byte[1] ;
      H01663_A57AlbRUniDis = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01663_A56AlbRUni = new String[] {""} ;
      H01663_A51AlbRPieDis = new int[1] ;
      H01663_A50AlbRLoc = new String[] {""} ;
      H01663_A6463AlbRLote = new String[] {""} ;
      H01663_A6264AlbRTartD = new String[] {""} ;
      H01663_n6264AlbRTartD = new boolean[] {false} ;
      H01663_A3359AlbRDisCli = new String[] {""} ;
      H01663_A3613AlbRefDsc = new String[] {""} ;
      H01663_A279CliNom = new String[] {""} ;
      H01663_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      H01663_A55AlbRReo = new String[] {""} ;
      H01663_A44AlbRecCod = new int[1] ;
      H01663_A13982AlbRArtLu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01663_n13982AlbRArtLu = new boolean[] {false} ;
      H01663_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01663_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01663_A52AlbRPieEnt = new int[1] ;
      H01663_A54AlbRPieUti = new int[1] ;
      H01663_A45AlbRef = new String[] {""} ;
      H01663_A252CliCod = new int[1] ;
      H01663_A396EmprCod = new String[] {""} ;
      GXv_int3 = new int[1] ;
      hsh = "" ;
      AV98Station = "" ;
      AV99Emprnom = "" ;
      AV100Usurcod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext8 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV22Session = httpContext.getWebSession();
      AV18ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV24ManageFiltersXml = "" ;
      AV16ExcelFilename = "" ;
      AV17ErrorMessage = "" ;
      AV19UserCustomValue = "" ;
      AV21ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector10 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item11 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = new GXBaseCollection[1] ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char1 = "" ;
      GXt_char13 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXt_char33 = "" ;
      GXv_char34 = new String[1] ;
      GXt_char31 = "" ;
      GXv_char32 = new String[1] ;
      GXt_char29 = "" ;
      GXv_char30 = new String[1] ;
      GXt_char27 = "" ;
      GXv_char28 = new String[1] ;
      GXt_char25 = "" ;
      GXv_char26 = new String[1] ;
      GXt_char23 = "" ;
      GXv_char24 = new String[1] ;
      GXt_char21 = "" ;
      GXv_char22 = new String[1] ;
      GXt_char19 = "" ;
      GXv_char20 = new String[1] ;
      GXt_char17 = "" ;
      GXv_char18 = new String[1] ;
      GXt_char15 = "" ;
      GXv_char16 = new String[1] ;
      GXt_char14 = "" ;
      GXv_char5 = new String[1] ;
      GXv_SdtWWPGridState35 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      ucDetailwebcomponent_modal = new com.genexus.webpanels.GXUserControl();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV67Emprcod = "" ;
      sCtrlAV68Albrfen = "" ;
      sCtrlAV69Albrfen_to = "" ;
      sCtrlAV70Clicod = "" ;
      sCtrlAV71Clicod_to = "" ;
      sCtrlAV72AlbRef = "" ;
      sCtrlAV88albref_to = "" ;
      sCtrlAV80Procecod = "" ;
      sCtrlAV81ProceCod_to = "" ;
      sCtrlAV73AlbRReo = "" ;
      sCtrlAV74AlbREst = "" ;
      sCtrlAV90TipEntCod = "" ;
      sCtrlAV89AlbRuni = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GXCCtl = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcconsultaalmacentejidoencrudo__default(),
         new Object[] {
             new Object[] {
            H01662_A65ArtCod, H01662_A6263AlbRTartC, H01662_n6263AlbRTartC, H01662_A970ProceCod, H01662_n970ProceCod, H01662_A1211TipEntCod, H01662_n1211TipEntCod, H01662_A46AlbREnt, H01662_A5806AlbREnt2, H01662_A1291AlbRDes,
            H01662_A1212TipEntNom, H01662_n1212TipEntNom, H01662_A971ProceNom, H01662_n971ProceNom, H01662_A47AlbREst, H01662_A57AlbRUniDis, H01662_A56AlbRUni, H01662_A51AlbRPieDis, H01662_A50AlbRLoc, H01662_A6463AlbRLote,
            H01662_A6264AlbRTartD, H01662_n6264AlbRTartD, H01662_A3359AlbRDisCli, H01662_A3613AlbRefDsc, H01662_A279CliNom, H01662_A49AlbRFen, H01662_A55AlbRReo, H01662_A44AlbRecCod, H01662_A13982AlbRArtLu, H01662_n13982AlbRArtLu,
            H01662_A58AlbRUniEnt, H01662_A60AlbRUniUti, H01662_A52AlbRPieEnt, H01662_A54AlbRPieUti, H01662_A45AlbRef, H01662_A252CliCod, H01662_A396EmprCod
            }
            , new Object[] {
            H01663_A65ArtCod, H01663_A6263AlbRTartC, H01663_n6263AlbRTartC, H01663_A970ProceCod, H01663_n970ProceCod, H01663_A1211TipEntCod, H01663_n1211TipEntCod, H01663_A46AlbREnt, H01663_A5806AlbREnt2, H01663_A1291AlbRDes,
            H01663_A1212TipEntNom, H01663_n1212TipEntNom, H01663_A971ProceNom, H01663_n971ProceNom, H01663_A47AlbREst, H01663_A57AlbRUniDis, H01663_A56AlbRUni, H01663_A51AlbRPieDis, H01663_A50AlbRLoc, H01663_A6463AlbRLote,
            H01663_A6264AlbRTartD, H01663_n6264AlbRTartD, H01663_A3359AlbRDisCli, H01663_A3613AlbRefDsc, H01663_A279CliNom, H01663_A49AlbRFen, H01663_A55AlbRReo, H01663_A44AlbRecCod, H01663_A13982AlbRArtLu, H01663_n13982AlbRArtLu,
            H01663_A58AlbRUniEnt, H01663_A60AlbRUniUti, H01663_A52AlbRPieEnt, H01663_A54AlbRPieUti, H01663_A45AlbRef, H01663_A252CliCod, H01663_A396EmprCod
            }
         }
      );
      AV97Pgmname = "WCConsultaAlmacenTejidoencrudo" ;
      /* GeneXus formulas. */
      AV97Pgmname = "WCConsultaAlmacenTejidoencrudo" ;
      Gx_err = (short)(0) ;
      edtavDetailwebcomponent_Enabled = 0 ;
      edtavAlbrent2_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
      WebComp_Grid_dwc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Wwpaux_wc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte wcpOAV74AlbREst ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV74AlbREst ;
   private byte AV25ManageFiltersExecutionStep ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte A47AlbREst ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short wcpOAV80Procecod ;
   private short wcpOAV81ProceCod_to ;
   private short wcpOAV90TipEntCod ;
   private short AV80Procecod ;
   private short AV81ProceCod_to ;
   private short AV90TipEntCod ;
   private short AV32OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short A970ProceCod ;
   private short A1211TipEntCod ;
   private short A6263AlbRTartC ;
   private int wcpOAV70Clicod ;
   private int wcpOAV71Clicod_to ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_41 ;
   private int AV70Clicod ;
   private int AV71Clicod_to ;
   private int nGXsfl_41_idx=1 ;
   private int AV26TFAlbRecCod ;
   private int AV27TFAlbRecCod_To ;
   private int AV37TFCliCod ;
   private int AV38TFCliCod_To ;
   private int AV53TFAlbRPieEnt ;
   private int AV54TFAlbRPieEnt_To ;
   private int AV55TFAlbRPieUti ;
   private int AV56TFAlbRPieUti_To ;
   private int AV57TFAlbRPieDis ;
   private int AV58TFAlbRPieDis_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavPgmname_Enabled ;
   private int A44AlbRecCod ;
   private int A252CliCod ;
   private int A52AlbRPieEnt ;
   private int A54AlbRPieUti ;
   private int A51AlbRPieDis ;
   private int subGrid_Islastpage ;
   private int edtavDetailwebcomponent_Enabled ;
   private int edtavAlbrent2_Enabled ;
   private int AV102Wcconsultaalmacentejidoencrudods_2_tfalbreccod ;
   private int AV103Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to ;
   private int AV106Wcconsultaalmacentejidoencrudods_6_tfclicod ;
   private int AV107Wcconsultaalmacentejidoencrudods_7_tfclicod_to ;
   private int AV122Wcconsultaalmacentejidoencrudods_22_tfalbrpieent ;
   private int AV123Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to ;
   private int AV124Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti ;
   private int AV125Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to ;
   private int AV126Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis ;
   private int AV127Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to ;
   private int AV104Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels_size ;
   private int AV128Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels_size ;
   private int AV135Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels_size ;
   private int GXv_int3[] ;
   private int edtAlbRecCod_Visible ;
   private int edtAlbRFen_Visible ;
   private int edtavAlbrent2_Visible ;
   private int edtCliCod_Visible ;
   private int edtCliNom_Visible ;
   private int edtAlbRef_Visible ;
   private int edtAlbRefDsc_Visible ;
   private int edtAlbRDisCli_Visible ;
   private int edtAlbRTartD_Visible ;
   private int edtAlbRLote_Visible ;
   private int edtAlbRLoc_Visible ;
   private int edtAlbRPieEnt_Visible ;
   private int edtAlbRPieUti_Visible ;
   private int edtAlbRPieDis_Visible ;
   private int edtAlbRUniEnt_Visible ;
   private int edtAlbRUniUti_Visible ;
   private int edtAlbRUniDis_Visible ;
   private int edtProceNom_Visible ;
   private int edtComposicio_Visible ;
   private int edtTipEntNom_Visible ;
   private int edtAlbRDes_Visible ;
   private int AV29PageToGo ;
   private int AV144GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavDetailwebcomponent_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV30GridCurrentPage ;
   private long AV31GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV61TFAlbRUniEnt ;
   private java.math.BigDecimal AV62TFAlbRUniEnt_To ;
   private java.math.BigDecimal AV63TFAlbRUniUti ;
   private java.math.BigDecimal AV64TFAlbRUniUti_To ;
   private java.math.BigDecimal AV65TFAlbRUniDis ;
   private java.math.BigDecimal AV66TFAlbRUniDis_To ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private java.math.BigDecimal A13982AlbRArtLu ;
   private java.math.BigDecimal AV129Wcconsultaalmacentejidoencrudods_29_tfalbrunient ;
   private java.math.BigDecimal AV130Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to ;
   private java.math.BigDecimal AV131Wcconsultaalmacentejidoencrudods_31_tfalbruniuti ;
   private java.math.BigDecimal AV132Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to ;
   private java.math.BigDecimal AV133Wcconsultaalmacentejidoencrudods_33_tfalbrunidis ;
   private java.math.BigDecimal AV134Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to ;
   private String wcpOAV67Emprcod ;
   private String wcpOAV72AlbRef ;
   private String wcpOAV88albref_to ;
   private String wcpOAV73AlbRReo ;
   private String wcpOAV89AlbRuni ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV67Emprcod ;
   private String AV72AlbRef ;
   private String AV88albref_to ;
   private String AV73AlbRReo ;
   private String AV89AlbRuni ;
   private String sGXsfl_41_idx="0001" ;
   private String AV39TFCliNom ;
   private String AV40TFCliNom_Sel ;
   private String AV41TFAlbRef ;
   private String AV42TFAlbRef_Sel ;
   private String AV43TFAlbRefDsc ;
   private String AV44TFAlbRefDsc_Sel ;
   private String AV45TFAlbRDisCli ;
   private String AV46TFAlbRDisCli_Sel ;
   private String AV47TFAlbRTartD ;
   private String AV48TFAlbRTartD_Sel ;
   private String AV49TFAlbRLote ;
   private String AV50TFAlbRLote_Sel ;
   private String AV51TFAlbRLoc ;
   private String AV52TFAlbRLoc_Sel ;
   private String AV82TFProceNom ;
   private String AV83TFProceNom_Sel ;
   private String AV84TFComposicion ;
   private String AV85TFComposicion_Sel ;
   private String AV91TFTipEntNom ;
   private String AV92TFTipEntNom_Sel ;
   private String AV93TFAlbRDes ;
   private String AV94TFAlbRDes_Sel ;
   private String AV97Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A46AlbREnt ;
   private String A5806AlbREnt2 ;
   private String A396EmprCod ;
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
   private String Ddo_grid_Allowmultipleselection ;
   private String Ddo_grid_Datalistfixedvalues ;
   private String Ddo_grid_Datalistproc ;
   private String Ddo_gridcolumnsselector_Caption ;
   private String Ddo_gridcolumnsselector_Tooltip ;
   private String Ddo_gridcolumnsselector_Cls ;
   private String Ddo_gridcolumnsselector_Dropdownoptionstype ;
   private String Ddo_gridcolumnsselector_Gridinternalname ;
   private String Ddo_gridcolumnsselector_Titlecontrolidtoreplace ;
   private String Detailwebcomponent_modal_Width ;
   private String Detailwebcomponent_modal_Title ;
   private String Detailwebcomponent_modal_Confirmtype ;
   private String Detailwebcomponent_modal_Bodytype ;
   private String Grid_titlescategories_Gridinternalname ;
   private String Grid_titlescategories_Gridtitlescategories ;
   private String Grid_empowerer_Gridinternalname ;
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
   private String divCell_grid_dwc_Internalname ;
   private String divCell_grid_dwc_Class ;
   private String WebComp_Grid_dwc_Component ;
   private String OldGrid_dwc ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_titlescategories_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDiv_wwpauxwc_Internalname ;
   private String WebComp_Wwpaux_wc_Component ;
   private String OldWwpaux_wc ;
   private String divDdo_albrfenauxdates_Internalname ;
   private String edtavDdo_albrfenauxdate_Internalname ;
   private String edtavDdo_albrfenauxdate_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavDetailwebcomponent_Internalname ;
   private String AV79DetailWebComponent ;
   private String edtAlbRecCod_Internalname ;
   private String A55AlbRReo ;
   private String edtAlbRFen_Internalname ;
   private String AV15AlbREnt2 ;
   private String edtavAlbrent2_Internalname ;
   private String edtCliCod_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Internalname ;
   private String A45AlbRef ;
   private String edtAlbRef_Internalname ;
   private String A3613AlbRefDsc ;
   private String edtAlbRefDsc_Internalname ;
   private String A3359AlbRDisCli ;
   private String edtAlbRDisCli_Internalname ;
   private String A6264AlbRTartD ;
   private String edtAlbRTartD_Internalname ;
   private String A6463AlbRLote ;
   private String edtAlbRLote_Internalname ;
   private String A50AlbRLoc ;
   private String edtAlbRLoc_Internalname ;
   private String edtAlbRPieEnt_Internalname ;
   private String edtAlbRPieUti_Internalname ;
   private String edtAlbRPieDis_Internalname ;
   private String A56AlbRUni ;
   private String edtAlbRUniEnt_Internalname ;
   private String edtAlbRUniUti_Internalname ;
   private String edtAlbRUniDis_Internalname ;
   private String A971ProceNom ;
   private String edtProceNom_Internalname ;
   private String A13981Composicio ;
   private String edtComposicio_Internalname ;
   private String A1212TipEntNom ;
   private String edtTipEntNom_Internalname ;
   private String A1291AlbRDes ;
   private String edtAlbRDes_Internalname ;
   private String edtAlbRArtLu_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String AV108Wcconsultaalmacentejidoencrudods_8_tfclinom ;
   private String AV109Wcconsultaalmacentejidoencrudods_9_tfclinom_sel ;
   private String AV110Wcconsultaalmacentejidoencrudods_10_tfalbref ;
   private String AV111Wcconsultaalmacentejidoencrudods_11_tfalbref_sel ;
   private String AV112Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc ;
   private String AV113Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel ;
   private String AV114Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli ;
   private String AV115Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel ;
   private String AV116Wcconsultaalmacentejidoencrudods_16_tfalbrtartd ;
   private String AV117Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel ;
   private String AV118Wcconsultaalmacentejidoencrudods_18_tfalbrlote ;
   private String AV119Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel ;
   private String AV120Wcconsultaalmacentejidoencrudods_20_tfalbrloc ;
   private String AV121Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel ;
   private String AV136Wcconsultaalmacentejidoencrudods_36_tfprocenom ;
   private String AV137Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel ;
   private String AV138Wcconsultaalmacentejidoencrudods_38_tfcomposicion ;
   private String AV139Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel ;
   private String AV140Wcconsultaalmacentejidoencrudods_40_tftipentnom ;
   private String AV141Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel ;
   private String AV142Wcconsultaalmacentejidoencrudods_42_tfalbrdes ;
   private String AV143Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel ;
   private String scmdbuf ;
   private String lV108Wcconsultaalmacentejidoencrudods_8_tfclinom ;
   private String lV110Wcconsultaalmacentejidoencrudods_10_tfalbref ;
   private String lV112Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc ;
   private String lV114Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli ;
   private String lV116Wcconsultaalmacentejidoencrudods_16_tfalbrtartd ;
   private String lV118Wcconsultaalmacentejidoencrudods_18_tfalbrlote ;
   private String lV120Wcconsultaalmacentejidoencrudods_20_tfalbrloc ;
   private String lV136Wcconsultaalmacentejidoencrudods_36_tfprocenom ;
   private String lV140Wcconsultaalmacentejidoencrudods_40_tftipentnom ;
   private String lV142Wcconsultaalmacentejidoencrudods_42_tfalbrdes ;
   private String hsh ;
   private String AV98Station ;
   private String AV99Emprnom ;
   private String AV100Usurcod ;
   private String GXt_char1 ;
   private String GXt_char13 ;
   private String GXv_char4[] ;
   private String GXv_char2[] ;
   private String GXt_char33 ;
   private String GXv_char34[] ;
   private String GXt_char31 ;
   private String GXv_char32[] ;
   private String GXt_char29 ;
   private String GXv_char30[] ;
   private String GXt_char27 ;
   private String GXv_char28[] ;
   private String GXt_char25 ;
   private String GXv_char26[] ;
   private String GXt_char23 ;
   private String GXv_char24[] ;
   private String GXt_char21 ;
   private String GXv_char22[] ;
   private String GXt_char19 ;
   private String GXv_char20[] ;
   private String GXt_char17 ;
   private String GXv_char18[] ;
   private String GXt_char15 ;
   private String GXv_char16[] ;
   private String GXt_char14 ;
   private String GXv_char5[] ;
   private String tblTabledetailwebcomponent_modal_Internalname ;
   private String Detailwebcomponent_modal_Internalname ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV67Emprcod ;
   private String sCtrlAV68Albrfen ;
   private String sCtrlAV69Albrfen_to ;
   private String sCtrlAV70Clicod ;
   private String sCtrlAV71Clicod_to ;
   private String sCtrlAV72AlbRef ;
   private String sCtrlAV88albref_to ;
   private String sCtrlAV80Procecod ;
   private String sCtrlAV81ProceCod_to ;
   private String sCtrlAV73AlbRReo ;
   private String sCtrlAV74AlbREst ;
   private String sCtrlAV90TipEntCod ;
   private String sCtrlAV89AlbRuni ;
   private String sGXsfl_41_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavDetailwebcomponent_Jsonclick ;
   private String edtAlbRecCod_Jsonclick ;
   private String GXCCtl ;
   private String edtAlbRFen_Jsonclick ;
   private String edtavAlbrent2_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtAlbRef_Jsonclick ;
   private String edtAlbRefDsc_Jsonclick ;
   private String edtAlbRDisCli_Jsonclick ;
   private String edtAlbRTartD_Jsonclick ;
   private String edtAlbRLote_Jsonclick ;
   private String edtAlbRLoc_Jsonclick ;
   private String edtAlbRPieEnt_Jsonclick ;
   private String edtAlbRPieUti_Jsonclick ;
   private String edtAlbRPieDis_Jsonclick ;
   private String edtAlbRUniEnt_Jsonclick ;
   private String edtAlbRUniUti_Jsonclick ;
   private String edtAlbRUniDis_Jsonclick ;
   private String edtProceNom_Jsonclick ;
   private String edtComposicio_Jsonclick ;
   private String edtTipEntNom_Jsonclick ;
   private String edtAlbRDes_Jsonclick ;
   private String edtAlbRArtLu_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV68Albrfen ;
   private java.util.Date wcpOAV69Albrfen_to ;
   private java.util.Date AV68Albrfen ;
   private java.util.Date AV69Albrfen_to ;
   private java.util.Date AV33TFAlbRFen ;
   private java.util.Date AV35DDO_AlbRFenAuxDate ;
   private java.util.Date A49AlbRFen ;
   private java.util.Date AV105Wcconsultaalmacentejidoencrudods_5_tfalbrfen ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV12OrderedDsc ;
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
   private boolean Grid_empowerer_Hascolumnsselector ;
   private boolean wbLoad ;
   private boolean bGXsfl_41_Refreshing=false ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n6264AlbRTartD ;
   private boolean n971ProceNom ;
   private boolean n1212TipEntNom ;
   private boolean n13982AlbRArtLu ;
   private boolean n6263AlbRTartC ;
   private boolean n970ProceCod ;
   private boolean n1211TipEntCod ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV77TFAlbRReo_SelsJson ;
   private String AV59TFAlbRUni_SelsJson ;
   private String AV75TFAlbREst_SelsJson ;
   private String AV18ColumnsSelectorXML ;
   private String AV24ManageFiltersXml ;
   private String AV19UserCustomValue ;
   private String AV14FilterFullText ;
   private String AV101Wcconsultaalmacentejidoencrudods_1_filterfulltext ;
   private String lV101Wcconsultaalmacentejidoencrudods_1_filterfulltext ;
   private String AV16ExcelFilename ;
   private String AV17ErrorMessage ;
   private GXSimpleCollection<Byte> AV76TFAlbREst_Sels ;
   private GXSimpleCollection<Byte> AV135Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Grid_dwc ;
   private GXWebComponent WebComp_Wwpaux_wc ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV22Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_titlescategories ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDetailwebcomponent_modal ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbAlbRReo ;
   private HTMLChoice cmbAlbRUni ;
   private HTMLChoice cmbAlbREst ;
   private IDataStoreProvider pr_default ;
   private String[] H01662_A65ArtCod ;
   private short[] H01662_A6263AlbRTartC ;
   private boolean[] H01662_n6263AlbRTartC ;
   private short[] H01662_A970ProceCod ;
   private boolean[] H01662_n970ProceCod ;
   private short[] H01662_A1211TipEntCod ;
   private boolean[] H01662_n1211TipEntCod ;
   private String[] H01662_A46AlbREnt ;
   private String[] H01662_A5806AlbREnt2 ;
   private String[] H01662_A1291AlbRDes ;
   private String[] H01662_A1212TipEntNom ;
   private boolean[] H01662_n1212TipEntNom ;
   private String[] H01662_A971ProceNom ;
   private boolean[] H01662_n971ProceNom ;
   private byte[] H01662_A47AlbREst ;
   private java.math.BigDecimal[] H01662_A57AlbRUniDis ;
   private String[] H01662_A56AlbRUni ;
   private int[] H01662_A51AlbRPieDis ;
   private String[] H01662_A50AlbRLoc ;
   private String[] H01662_A6463AlbRLote ;
   private String[] H01662_A6264AlbRTartD ;
   private boolean[] H01662_n6264AlbRTartD ;
   private String[] H01662_A3359AlbRDisCli ;
   private String[] H01662_A3613AlbRefDsc ;
   private String[] H01662_A279CliNom ;
   private java.util.Date[] H01662_A49AlbRFen ;
   private String[] H01662_A55AlbRReo ;
   private int[] H01662_A44AlbRecCod ;
   private java.math.BigDecimal[] H01662_A13982AlbRArtLu ;
   private boolean[] H01662_n13982AlbRArtLu ;
   private java.math.BigDecimal[] H01662_A58AlbRUniEnt ;
   private java.math.BigDecimal[] H01662_A60AlbRUniUti ;
   private int[] H01662_A52AlbRPieEnt ;
   private int[] H01662_A54AlbRPieUti ;
   private String[] H01662_A45AlbRef ;
   private int[] H01662_A252CliCod ;
   private String[] H01662_A396EmprCod ;
   private String[] H01663_A65ArtCod ;
   private short[] H01663_A6263AlbRTartC ;
   private boolean[] H01663_n6263AlbRTartC ;
   private short[] H01663_A970ProceCod ;
   private boolean[] H01663_n970ProceCod ;
   private short[] H01663_A1211TipEntCod ;
   private boolean[] H01663_n1211TipEntCod ;
   private String[] H01663_A46AlbREnt ;
   private String[] H01663_A5806AlbREnt2 ;
   private String[] H01663_A1291AlbRDes ;
   private String[] H01663_A1212TipEntNom ;
   private boolean[] H01663_n1212TipEntNom ;
   private String[] H01663_A971ProceNom ;
   private boolean[] H01663_n971ProceNom ;
   private byte[] H01663_A47AlbREst ;
   private java.math.BigDecimal[] H01663_A57AlbRUniDis ;
   private String[] H01663_A56AlbRUni ;
   private int[] H01663_A51AlbRPieDis ;
   private String[] H01663_A50AlbRLoc ;
   private String[] H01663_A6463AlbRLote ;
   private String[] H01663_A6264AlbRTartD ;
   private boolean[] H01663_n6264AlbRTartD ;
   private String[] H01663_A3359AlbRDisCli ;
   private String[] H01663_A3613AlbRefDsc ;
   private String[] H01663_A279CliNom ;
   private java.util.Date[] H01663_A49AlbRFen ;
   private String[] H01663_A55AlbRReo ;
   private int[] H01663_A44AlbRecCod ;
   private java.math.BigDecimal[] H01663_A13982AlbRArtLu ;
   private boolean[] H01663_n13982AlbRArtLu ;
   private java.math.BigDecimal[] H01663_A58AlbRUniEnt ;
   private java.math.BigDecimal[] H01663_A60AlbRUniUti ;
   private int[] H01663_A52AlbRPieEnt ;
   private int[] H01663_A54AlbRPieUti ;
   private String[] H01663_A45AlbRef ;
   private int[] H01663_A252CliCod ;
   private String[] H01663_A396EmprCod ;
   private GXSimpleCollection<String> AV78TFAlbRReo_Sels ;
   private GXSimpleCollection<String> AV60TFAlbRUni_Sels ;
   private GXSimpleCollection<String> AV104Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels ;
   private GXSimpleCollection<String> AV128Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV23ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item11 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item12[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV21ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector10[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV28DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState35[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext8[] ;
}

final  class wcconsultaalmacentejidoencrudo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01662( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV104Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV128Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels ,
                                          byte A47AlbREst ,
                                          GXSimpleCollection<Byte> AV135Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels ,
                                          int AV102Wcconsultaalmacentejidoencrudods_2_tfalbreccod ,
                                          int AV103Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to ,
                                          int AV104Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels_size ,
                                          java.util.Date AV105Wcconsultaalmacentejidoencrudods_5_tfalbrfen ,
                                          int AV106Wcconsultaalmacentejidoencrudods_6_tfclicod ,
                                          int AV107Wcconsultaalmacentejidoencrudods_7_tfclicod_to ,
                                          String AV109Wcconsultaalmacentejidoencrudods_9_tfclinom_sel ,
                                          String AV108Wcconsultaalmacentejidoencrudods_8_tfclinom ,
                                          String AV111Wcconsultaalmacentejidoencrudods_11_tfalbref_sel ,
                                          String AV110Wcconsultaalmacentejidoencrudods_10_tfalbref ,
                                          String AV113Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel ,
                                          String AV112Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc ,
                                          String AV115Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel ,
                                          String AV114Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli ,
                                          String AV117Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel ,
                                          String AV116Wcconsultaalmacentejidoencrudods_16_tfalbrtartd ,
                                          String AV119Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel ,
                                          String AV118Wcconsultaalmacentejidoencrudods_18_tfalbrlote ,
                                          String AV121Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel ,
                                          String AV120Wcconsultaalmacentejidoencrudods_20_tfalbrloc ,
                                          int AV122Wcconsultaalmacentejidoencrudods_22_tfalbrpieent ,
                                          int AV123Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to ,
                                          int AV124Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti ,
                                          int AV125Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to ,
                                          int AV126Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis ,
                                          int AV127Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to ,
                                          int AV128Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels_size ,
                                          java.math.BigDecimal AV129Wcconsultaalmacentejidoencrudods_29_tfalbrunient ,
                                          java.math.BigDecimal AV130Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to ,
                                          java.math.BigDecimal AV131Wcconsultaalmacentejidoencrudods_31_tfalbruniuti ,
                                          java.math.BigDecimal AV132Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to ,
                                          java.math.BigDecimal AV133Wcconsultaalmacentejidoencrudods_33_tfalbrunidis ,
                                          java.math.BigDecimal AV134Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to ,
                                          int AV135Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels_size ,
                                          String AV137Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel ,
                                          String AV136Wcconsultaalmacentejidoencrudods_36_tfprocenom ,
                                          String AV141Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel ,
                                          String AV140Wcconsultaalmacentejidoencrudods_40_tftipentnom ,
                                          String AV143Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel ,
                                          String AV142Wcconsultaalmacentejidoencrudods_42_tfalbrdes ,
                                          int A44AlbRecCod ,
                                          java.util.Date A49AlbRFen ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          String A3359AlbRDisCli ,
                                          String A6264AlbRTartD ,
                                          String A6463AlbRLote ,
                                          String A50AlbRLoc ,
                                          int A52AlbRPieEnt ,
                                          int A54AlbRPieUti ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          java.math.BigDecimal A60AlbRUniUti ,
                                          String A971ProceNom ,
                                          String A1212TipEntNom ,
                                          String A1291AlbRDes ,
                                          short AV32OrderedBy ,
                                          boolean AV12OrderedDsc ,
                                          String AV101Wcconsultaalmacentejidoencrudods_1_filterfulltext ,
                                          int A51AlbRPieDis ,
                                          java.math.BigDecimal A57AlbRUniDis ,
                                          String A13981Composicio ,
                                          String AV139Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel ,
                                          String AV138Wcconsultaalmacentejidoencrudods_38_tfcomposicion ,
                                          String AV72AlbRef ,
                                          String AV88albref_to ,
                                          java.util.Date AV68Albrfen ,
                                          java.util.Date AV69Albrfen_to ,
                                          int AV70Clicod ,
                                          int AV71Clicod_to ,
                                          short A970ProceCod ,
                                          short AV80Procecod ,
                                          short AV81ProceCod_to ,
                                          String AV73AlbRReo ,
                                          byte AV74AlbREst ,
                                          String AV89AlbRuni ,
                                          short A1211TipEntCod ,
                                          short AV90TipEntCod ,
                                          String AV67Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int36 = new byte[51];
      Object[] GXv_Object37 = new Object[2];
      scmdbuf = "SELECT T6.ArtCod, T1.AlbRTartC AS AlbRTartC, T1.ProceCod, T1.TipEntCod, T1.AlbREnt, T1.AlbREnt2, T1.AlbRDes, T5.TipEntNom, T4.ProceNom, T1.AlbREst, CASE  WHEN (" ;
      scmdbuf += " T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END AS AlbRUniDis, T1.AlbRUni, T1.AlbRPieEnt" ;
      scmdbuf += " - T1.AlbRPieUti AS AlbRPieDis, T1.AlbRLoc, T1.AlbRLote, T3.TipArtDsc AS AlbRTartD, T1.AlbRDisCli, T1.AlbRefDsc, T2.CliNom, T1.AlbRFen, T1.AlbRReo, T1.AlbRecCod," ;
      scmdbuf += " COALESCE( T6.ArtLu, 0) AS AlbRArtLu, T1.AlbRUniEnt, T1.AlbRUniUti, T1.AlbRPieEnt, T1.AlbRPieUti, T1.AlbRef, T1.CliCod, T1.EmprCod FROM (((((TXPALBREC T1 INNER JOIN" ;
      scmdbuf += " TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPTIPART T3 ON T3.EmprCod = T1.EmprCod AND T3.TipArtCod = T1.AlbRTartC) LEFT JOIN" ;
      scmdbuf += " TXPPROCED T4 ON T4.EmprCod = T1.EmprCod AND T4.ProceCod = T1.ProceCod) LEFT JOIN TXPENTRAD T5 ON T5.EmprCod = T1.EmprCod AND T5.TipEntCod = T1.TipEntCod) LEFT JOIN" ;
      scmdbuf += " TXPARTICU T6 ON T6.EmprCod = T1.EmprCod AND T6.CliCod = T1.CliCod AND T6.ArtCod = T1.AlbRef)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbRef >= ?)");
      addWhere(sWhereString, "(T1.AlbRef <= ?)");
      addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      addWhere(sWhereString, "(T1.AlbRFen <= ?)");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.ProceCod >= ?)");
      addWhere(sWhereString, "(T1.ProceCod <= ?)");
      addWhere(sWhereString, "(T1.AlbREst = ? or ? = 9)");
      addWhere(sWhereString, "(T1.AlbRUni = ?)");
      addWhere(sWhereString, "(T1.TipEntCod = ? or (? = 0))");
      if ( ! (0==AV102Wcconsultaalmacentejidoencrudods_2_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int36[14] = (byte)(1) ;
      }
      if ( ! (0==AV103Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int36[15] = (byte)(1) ;
      }
      if ( AV104Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV104Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels, "T1.AlbRReo IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV105Wcconsultaalmacentejidoencrudods_5_tfalbrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int36[16] = (byte)(1) ;
      }
      if ( ! (0==AV106Wcconsultaalmacentejidoencrudods_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int36[17] = (byte)(1) ;
      }
      if ( ! (0==AV107Wcconsultaalmacentejidoencrudods_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int36[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Wcconsultaalmacentejidoencrudods_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV108Wcconsultaalmacentejidoencrudods_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Wcconsultaalmacentejidoencrudods_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int36[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Wcconsultaalmacentejidoencrudods_11_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV110Wcconsultaalmacentejidoencrudods_10_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Wcconsultaalmacentejidoencrudods_11_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int36[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV112Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int36[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel)==0) && ( ! (GXutil.strcmp("", AV114Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRDisCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRDisCli = ?)");
      }
      else
      {
         GXv_int36[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel)==0) && ( ! (GXutil.strcmp("", AV116Wcconsultaalmacentejidoencrudods_16_tfalbrtartd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipArtDsc = ?)");
      }
      else
      {
         GXv_int36[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel)==0) && ( ! (GXutil.strcmp("", AV118Wcconsultaalmacentejidoencrudods_18_tfalbrlote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRLote = ?)");
      }
      else
      {
         GXv_int36[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel)==0) && ( ! (GXutil.strcmp("", AV120Wcconsultaalmacentejidoencrudods_20_tfalbrloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRLoc = ?)");
      }
      else
      {
         GXv_int36[32] = (byte)(1) ;
      }
      if ( ! (0==AV122Wcconsultaalmacentejidoencrudods_22_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int36[33] = (byte)(1) ;
      }
      if ( ! (0==AV123Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int36[34] = (byte)(1) ;
      }
      if ( ! (0==AV124Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int36[35] = (byte)(1) ;
      }
      if ( ! (0==AV125Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int36[36] = (byte)(1) ;
      }
      if ( ! (0==AV126Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) >= ?)");
      }
      else
      {
         GXv_int36[37] = (byte)(1) ;
      }
      if ( ! (0==AV127Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) <= ?)");
      }
      else
      {
         GXv_int36[38] = (byte)(1) ;
      }
      if ( AV128Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV128Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV129Wcconsultaalmacentejidoencrudods_29_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int36[39] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV130Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int36[40] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV131Wcconsultaalmacentejidoencrudods_31_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int36[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV132Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int36[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV133Wcconsultaalmacentejidoencrudods_33_tfalbrunidis)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) >= ?)");
      }
      else
      {
         GXv_int36[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV134Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) <= ?)");
      }
      else
      {
         GXv_int36[44] = (byte)(1) ;
      }
      if ( AV135Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV135Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels, "T1.AlbREst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV137Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV136Wcconsultaalmacentejidoencrudods_36_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV137Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProceNom = ?)");
      }
      else
      {
         GXv_int36[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV141Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel)==0) && ( ! (GXutil.strcmp("", AV140Wcconsultaalmacentejidoencrudods_40_tftipentnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.TipEntNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV141Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.TipEntNom = ?)");
      }
      else
      {
         GXv_int36[48] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV143Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel)==0) && ( ! (GXutil.strcmp("", AV142Wcconsultaalmacentejidoencrudods_42_tfalbrdes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[49] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV143Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRDes = ?)");
      }
      else
      {
         GXv_int36[50] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV32OrderedBy == 1 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRFen" ;
      }
      else if ( ( AV32OrderedBy == 1 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRFen DESC" ;
      }
      else if ( ( AV32OrderedBy == 2 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRecCod" ;
      }
      else if ( ( AV32OrderedBy == 2 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRecCod DESC" ;
      }
      else if ( ( AV32OrderedBy == 3 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRReo" ;
      }
      else if ( ( AV32OrderedBy == 3 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRReo DESC" ;
      }
      else if ( ( AV32OrderedBy == 4 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV32OrderedBy == 4 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV32OrderedBy == 5 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV32OrderedBy == 5 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV32OrderedBy == 6 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRef" ;
      }
      else if ( ( AV32OrderedBy == 6 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRef DESC" ;
      }
      else if ( ( AV32OrderedBy == 7 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRefDsc" ;
      }
      else if ( ( AV32OrderedBy == 7 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRefDsc DESC" ;
      }
      else if ( ( AV32OrderedBy == 8 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRDisCli" ;
      }
      else if ( ( AV32OrderedBy == 8 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRDisCli DESC" ;
      }
      else if ( ( AV32OrderedBy == 9 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.TipArtDsc" ;
      }
      else if ( ( AV32OrderedBy == 9 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.TipArtDsc DESC" ;
      }
      else if ( ( AV32OrderedBy == 10 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRLote" ;
      }
      else if ( ( AV32OrderedBy == 10 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRLote DESC" ;
      }
      else if ( ( AV32OrderedBy == 11 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRLoc" ;
      }
      else if ( ( AV32OrderedBy == 11 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRLoc DESC" ;
      }
      else if ( ( AV32OrderedBy == 12 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRPieEnt" ;
      }
      else if ( ( AV32OrderedBy == 12 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRPieEnt DESC" ;
      }
      else if ( ( AV32OrderedBy == 13 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRPieUti" ;
      }
      else if ( ( AV32OrderedBy == 13 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRPieUti DESC" ;
      }
      else if ( ( AV32OrderedBy == 14 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRUni" ;
      }
      else if ( ( AV32OrderedBy == 14 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRUni DESC" ;
      }
      else if ( ( AV32OrderedBy == 15 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRUniEnt" ;
      }
      else if ( ( AV32OrderedBy == 15 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRUniEnt DESC" ;
      }
      else if ( ( AV32OrderedBy == 16 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRUniUti" ;
      }
      else if ( ( AV32OrderedBy == 16 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRUniUti DESC" ;
      }
      else if ( ( AV32OrderedBy == 17 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbREst" ;
      }
      else if ( ( AV32OrderedBy == 17 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbREst DESC" ;
      }
      else if ( ( AV32OrderedBy == 18 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.ProceNom" ;
      }
      else if ( ( AV32OrderedBy == 18 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.ProceNom DESC" ;
      }
      else if ( ( AV32OrderedBy == 19 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T5.TipEntNom" ;
      }
      else if ( ( AV32OrderedBy == 19 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T5.TipEntNom DESC" ;
      }
      else if ( ( AV32OrderedBy == 20 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRDes" ;
      }
      else if ( ( AV32OrderedBy == 20 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRDes DESC" ;
      }
      GXv_Object37[0] = scmdbuf ;
      GXv_Object37[1] = GXv_int36 ;
      return GXv_Object37 ;
   }

   protected Object[] conditional_H01663( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV104Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV128Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels ,
                                          byte A47AlbREst ,
                                          GXSimpleCollection<Byte> AV135Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels ,
                                          int AV102Wcconsultaalmacentejidoencrudods_2_tfalbreccod ,
                                          int AV103Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to ,
                                          int AV104Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels_size ,
                                          java.util.Date AV105Wcconsultaalmacentejidoencrudods_5_tfalbrfen ,
                                          int AV106Wcconsultaalmacentejidoencrudods_6_tfclicod ,
                                          int AV107Wcconsultaalmacentejidoencrudods_7_tfclicod_to ,
                                          String AV109Wcconsultaalmacentejidoencrudods_9_tfclinom_sel ,
                                          String AV108Wcconsultaalmacentejidoencrudods_8_tfclinom ,
                                          String AV111Wcconsultaalmacentejidoencrudods_11_tfalbref_sel ,
                                          String AV110Wcconsultaalmacentejidoencrudods_10_tfalbref ,
                                          String AV113Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel ,
                                          String AV112Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc ,
                                          String AV115Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel ,
                                          String AV114Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli ,
                                          String AV117Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel ,
                                          String AV116Wcconsultaalmacentejidoencrudods_16_tfalbrtartd ,
                                          String AV119Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel ,
                                          String AV118Wcconsultaalmacentejidoencrudods_18_tfalbrlote ,
                                          String AV121Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel ,
                                          String AV120Wcconsultaalmacentejidoencrudods_20_tfalbrloc ,
                                          int AV122Wcconsultaalmacentejidoencrudods_22_tfalbrpieent ,
                                          int AV123Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to ,
                                          int AV124Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti ,
                                          int AV125Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to ,
                                          int AV126Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis ,
                                          int AV127Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to ,
                                          int AV128Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels_size ,
                                          java.math.BigDecimal AV129Wcconsultaalmacentejidoencrudods_29_tfalbrunient ,
                                          java.math.BigDecimal AV130Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to ,
                                          java.math.BigDecimal AV131Wcconsultaalmacentejidoencrudods_31_tfalbruniuti ,
                                          java.math.BigDecimal AV132Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to ,
                                          java.math.BigDecimal AV133Wcconsultaalmacentejidoencrudods_33_tfalbrunidis ,
                                          java.math.BigDecimal AV134Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to ,
                                          int AV135Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels_size ,
                                          String AV137Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel ,
                                          String AV136Wcconsultaalmacentejidoencrudods_36_tfprocenom ,
                                          String AV141Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel ,
                                          String AV140Wcconsultaalmacentejidoencrudods_40_tftipentnom ,
                                          String AV143Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel ,
                                          String AV142Wcconsultaalmacentejidoencrudods_42_tfalbrdes ,
                                          int A44AlbRecCod ,
                                          java.util.Date A49AlbRFen ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          String A3359AlbRDisCli ,
                                          String A6264AlbRTartD ,
                                          String A6463AlbRLote ,
                                          String A50AlbRLoc ,
                                          int A52AlbRPieEnt ,
                                          int A54AlbRPieUti ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          java.math.BigDecimal A60AlbRUniUti ,
                                          String A971ProceNom ,
                                          String A1212TipEntNom ,
                                          String A1291AlbRDes ,
                                          short AV32OrderedBy ,
                                          boolean AV12OrderedDsc ,
                                          String AV101Wcconsultaalmacentejidoencrudods_1_filterfulltext ,
                                          int A51AlbRPieDis ,
                                          java.math.BigDecimal A57AlbRUniDis ,
                                          String A13981Composicio ,
                                          String AV139Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel ,
                                          String AV138Wcconsultaalmacentejidoencrudods_38_tfcomposicion ,
                                          String AV72AlbRef ,
                                          String AV88albref_to ,
                                          java.util.Date AV68Albrfen ,
                                          java.util.Date AV69Albrfen_to ,
                                          int AV70Clicod ,
                                          int AV71Clicod_to ,
                                          short A970ProceCod ,
                                          short AV80Procecod ,
                                          short AV81ProceCod_to ,
                                          String AV73AlbRReo ,
                                          byte AV74AlbREst ,
                                          String AV89AlbRuni ,
                                          short A1211TipEntCod ,
                                          short AV90TipEntCod ,
                                          String AV67Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int39 = new byte[51];
      Object[] GXv_Object40 = new Object[2];
      scmdbuf = "SELECT T6.ArtCod, T1.AlbRTartC AS AlbRTartC, T1.ProceCod, T1.TipEntCod, T1.AlbREnt, T1.AlbREnt2, T1.AlbRDes, T5.TipEntNom, T4.ProceNom, T1.AlbREst, CASE  WHEN (" ;
      scmdbuf += " T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END AS AlbRUniDis, T1.AlbRUni, T1.AlbRPieEnt" ;
      scmdbuf += " - T1.AlbRPieUti AS AlbRPieDis, T1.AlbRLoc, T1.AlbRLote, T3.TipArtDsc AS AlbRTartD, T1.AlbRDisCli, T1.AlbRefDsc, T2.CliNom, T1.AlbRFen, T1.AlbRReo, T1.AlbRecCod," ;
      scmdbuf += " COALESCE( T6.ArtLu, 0) AS AlbRArtLu, T1.AlbRUniEnt, T1.AlbRUniUti, T1.AlbRPieEnt, T1.AlbRPieUti, T1.AlbRef, T1.CliCod, T1.EmprCod FROM (((((TXPALBREC T1 INNER JOIN" ;
      scmdbuf += " TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPTIPART T3 ON T3.EmprCod = T1.EmprCod AND T3.TipArtCod = T1.AlbRTartC) LEFT JOIN" ;
      scmdbuf += " TXPPROCED T4 ON T4.EmprCod = T1.EmprCod AND T4.ProceCod = T1.ProceCod) LEFT JOIN TXPENTRAD T5 ON T5.EmprCod = T1.EmprCod AND T5.TipEntCod = T1.TipEntCod) LEFT JOIN" ;
      scmdbuf += " TXPARTICU T6 ON T6.EmprCod = T1.EmprCod AND T6.CliCod = T1.CliCod AND T6.ArtCod = T1.AlbRef)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbRef >= ?)");
      addWhere(sWhereString, "(T1.AlbRef <= ?)");
      addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      addWhere(sWhereString, "(T1.AlbRFen <= ?)");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.ProceCod >= ?)");
      addWhere(sWhereString, "(T1.ProceCod <= ?)");
      addWhere(sWhereString, "(T1.AlbREst = ? or ? = 9)");
      addWhere(sWhereString, "(T1.AlbRUni = ?)");
      addWhere(sWhereString, "(T1.TipEntCod = ? or (? = 0))");
      if ( ! (0==AV102Wcconsultaalmacentejidoencrudods_2_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int39[14] = (byte)(1) ;
      }
      if ( ! (0==AV103Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int39[15] = (byte)(1) ;
      }
      if ( AV104Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV104Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels, "T1.AlbRReo IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV105Wcconsultaalmacentejidoencrudods_5_tfalbrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int39[16] = (byte)(1) ;
      }
      if ( ! (0==AV106Wcconsultaalmacentejidoencrudods_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int39[17] = (byte)(1) ;
      }
      if ( ! (0==AV107Wcconsultaalmacentejidoencrudods_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int39[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Wcconsultaalmacentejidoencrudods_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV108Wcconsultaalmacentejidoencrudods_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int39[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Wcconsultaalmacentejidoencrudods_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int39[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Wcconsultaalmacentejidoencrudods_11_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV110Wcconsultaalmacentejidoencrudods_10_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int39[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Wcconsultaalmacentejidoencrudods_11_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int39[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV112Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int39[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int39[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel)==0) && ( ! (GXutil.strcmp("", AV114Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRDisCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int39[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRDisCli = ?)");
      }
      else
      {
         GXv_int39[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel)==0) && ( ! (GXutil.strcmp("", AV116Wcconsultaalmacentejidoencrudods_16_tfalbrtartd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int39[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipArtDsc = ?)");
      }
      else
      {
         GXv_int39[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel)==0) && ( ! (GXutil.strcmp("", AV118Wcconsultaalmacentejidoencrudods_18_tfalbrlote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int39[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRLote = ?)");
      }
      else
      {
         GXv_int39[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel)==0) && ( ! (GXutil.strcmp("", AV120Wcconsultaalmacentejidoencrudods_20_tfalbrloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int39[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRLoc = ?)");
      }
      else
      {
         GXv_int39[32] = (byte)(1) ;
      }
      if ( ! (0==AV122Wcconsultaalmacentejidoencrudods_22_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int39[33] = (byte)(1) ;
      }
      if ( ! (0==AV123Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int39[34] = (byte)(1) ;
      }
      if ( ! (0==AV124Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int39[35] = (byte)(1) ;
      }
      if ( ! (0==AV125Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int39[36] = (byte)(1) ;
      }
      if ( ! (0==AV126Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) >= ?)");
      }
      else
      {
         GXv_int39[37] = (byte)(1) ;
      }
      if ( ! (0==AV127Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) <= ?)");
      }
      else
      {
         GXv_int39[38] = (byte)(1) ;
      }
      if ( AV128Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV128Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV129Wcconsultaalmacentejidoencrudods_29_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int39[39] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV130Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int39[40] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV131Wcconsultaalmacentejidoencrudods_31_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int39[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV132Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int39[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV133Wcconsultaalmacentejidoencrudods_33_tfalbrunidis)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) >= ?)");
      }
      else
      {
         GXv_int39[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV134Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) <= ?)");
      }
      else
      {
         GXv_int39[44] = (byte)(1) ;
      }
      if ( AV135Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV135Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels, "T1.AlbREst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV137Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV136Wcconsultaalmacentejidoencrudods_36_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int39[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV137Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProceNom = ?)");
      }
      else
      {
         GXv_int39[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV141Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel)==0) && ( ! (GXutil.strcmp("", AV140Wcconsultaalmacentejidoencrudods_40_tftipentnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.TipEntNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int39[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV141Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.TipEntNom = ?)");
      }
      else
      {
         GXv_int39[48] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV143Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel)==0) && ( ! (GXutil.strcmp("", AV142Wcconsultaalmacentejidoencrudods_42_tfalbrdes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int39[49] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV143Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRDes = ?)");
      }
      else
      {
         GXv_int39[50] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV32OrderedBy == 1 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRFen" ;
      }
      else if ( ( AV32OrderedBy == 1 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRFen DESC" ;
      }
      else if ( ( AV32OrderedBy == 2 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRecCod" ;
      }
      else if ( ( AV32OrderedBy == 2 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRecCod DESC" ;
      }
      else if ( ( AV32OrderedBy == 3 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRReo" ;
      }
      else if ( ( AV32OrderedBy == 3 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRReo DESC" ;
      }
      else if ( ( AV32OrderedBy == 4 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV32OrderedBy == 4 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV32OrderedBy == 5 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV32OrderedBy == 5 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV32OrderedBy == 6 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRef" ;
      }
      else if ( ( AV32OrderedBy == 6 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRef DESC" ;
      }
      else if ( ( AV32OrderedBy == 7 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRefDsc" ;
      }
      else if ( ( AV32OrderedBy == 7 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRefDsc DESC" ;
      }
      else if ( ( AV32OrderedBy == 8 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRDisCli" ;
      }
      else if ( ( AV32OrderedBy == 8 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRDisCli DESC" ;
      }
      else if ( ( AV32OrderedBy == 9 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.TipArtDsc" ;
      }
      else if ( ( AV32OrderedBy == 9 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.TipArtDsc DESC" ;
      }
      else if ( ( AV32OrderedBy == 10 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRLote" ;
      }
      else if ( ( AV32OrderedBy == 10 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRLote DESC" ;
      }
      else if ( ( AV32OrderedBy == 11 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRLoc" ;
      }
      else if ( ( AV32OrderedBy == 11 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRLoc DESC" ;
      }
      else if ( ( AV32OrderedBy == 12 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRPieEnt" ;
      }
      else if ( ( AV32OrderedBy == 12 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRPieEnt DESC" ;
      }
      else if ( ( AV32OrderedBy == 13 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRPieUti" ;
      }
      else if ( ( AV32OrderedBy == 13 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRPieUti DESC" ;
      }
      else if ( ( AV32OrderedBy == 14 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRUni" ;
      }
      else if ( ( AV32OrderedBy == 14 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRUni DESC" ;
      }
      else if ( ( AV32OrderedBy == 15 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRUniEnt" ;
      }
      else if ( ( AV32OrderedBy == 15 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRUniEnt DESC" ;
      }
      else if ( ( AV32OrderedBy == 16 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRUniUti" ;
      }
      else if ( ( AV32OrderedBy == 16 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRUniUti DESC" ;
      }
      else if ( ( AV32OrderedBy == 17 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbREst" ;
      }
      else if ( ( AV32OrderedBy == 17 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbREst DESC" ;
      }
      else if ( ( AV32OrderedBy == 18 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.ProceNom" ;
      }
      else if ( ( AV32OrderedBy == 18 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.ProceNom DESC" ;
      }
      else if ( ( AV32OrderedBy == 19 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T5.TipEntNom" ;
      }
      else if ( ( AV32OrderedBy == 19 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T5.TipEntNom DESC" ;
      }
      else if ( ( AV32OrderedBy == 20 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRDes" ;
      }
      else if ( ( AV32OrderedBy == 20 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRDes DESC" ;
      }
      GXv_Object40[0] = scmdbuf ;
      GXv_Object40[1] = GXv_int39 ;
      return GXv_Object40 ;
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
                  return conditional_H01662(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (java.util.Date)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (java.util.Date)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).intValue() , ((Number) dynConstraints[57]).intValue() , (java.math.BigDecimal)dynConstraints[58] , (java.math.BigDecimal)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , (String)dynConstraints[62] , ((Number) dynConstraints[63]).shortValue() , ((Boolean) dynConstraints[64]).booleanValue() , (String)dynConstraints[65] , ((Number) dynConstraints[66]).intValue() , (java.math.BigDecimal)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] , (java.util.Date)dynConstraints[73] , (java.util.Date)dynConstraints[74] , ((Number) dynConstraints[75]).intValue() , ((Number) dynConstraints[76]).intValue() , ((Number) dynConstraints[77]).shortValue() , ((Number) dynConstraints[78]).shortValue() , ((Number) dynConstraints[79]).shortValue() , (String)dynConstraints[80] , ((Number) dynConstraints[81]).byteValue() , (String)dynConstraints[82] , ((Number) dynConstraints[83]).shortValue() , ((Number) dynConstraints[84]).shortValue() , (String)dynConstraints[85] , (String)dynConstraints[86] );
            case 1 :
                  return conditional_H01663(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (java.util.Date)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (java.util.Date)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).intValue() , ((Number) dynConstraints[57]).intValue() , (java.math.BigDecimal)dynConstraints[58] , (java.math.BigDecimal)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , (String)dynConstraints[62] , ((Number) dynConstraints[63]).shortValue() , ((Boolean) dynConstraints[64]).booleanValue() , (String)dynConstraints[65] , ((Number) dynConstraints[66]).intValue() , (java.math.BigDecimal)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] , (java.util.Date)dynConstraints[73] , (java.util.Date)dynConstraints[74] , ((Number) dynConstraints[75]).intValue() , ((Number) dynConstraints[76]).intValue() , ((Number) dynConstraints[77]).shortValue() , ((Number) dynConstraints[78]).shortValue() , ((Number) dynConstraints[79]).shortValue() , (String)dynConstraints[80] , ((Number) dynConstraints[81]).byteValue() , (String)dynConstraints[82] , ((Number) dynConstraints[83]).shortValue() , ((Number) dynConstraints[84]).shortValue() , (String)dynConstraints[85] , (String)dynConstraints[86] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01662", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01663", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 8);
               ((String[]) buf[8])[0] = rslt.getString(6, 20);
               ((String[]) buf[9])[0] = rslt.getString(7, 20);
               ((String[]) buf[10])[0] = rslt.getString(8, 25);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(10);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(11,2);
               ((String[]) buf[16])[0] = rslt.getString(12, 1);
               ((int[]) buf[17])[0] = rslt.getInt(13);
               ((String[]) buf[18])[0] = rslt.getString(14, 10);
               ((String[]) buf[19])[0] = rslt.getString(15, 20);
               ((String[]) buf[20])[0] = rslt.getString(16, 30);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(17, 20);
               ((String[]) buf[23])[0] = rslt.getString(18, 26);
               ((String[]) buf[24])[0] = rslt.getString(19, 30);
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDate(20);
               ((String[]) buf[26])[0] = rslt.getString(21, 2);
               ((int[]) buf[27])[0] = rslt.getInt(22);
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(23,2);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(24,2);
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(25,2);
               ((int[]) buf[32])[0] = rslt.getInt(26);
               ((int[]) buf[33])[0] = rslt.getInt(27);
               ((String[]) buf[34])[0] = rslt.getString(28, 16);
               ((int[]) buf[35])[0] = rslt.getInt(29);
               ((String[]) buf[36])[0] = rslt.getString(30, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 8);
               ((String[]) buf[8])[0] = rslt.getString(6, 20);
               ((String[]) buf[9])[0] = rslt.getString(7, 20);
               ((String[]) buf[10])[0] = rslt.getString(8, 25);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(10);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(11,2);
               ((String[]) buf[16])[0] = rslt.getString(12, 1);
               ((int[]) buf[17])[0] = rslt.getInt(13);
               ((String[]) buf[18])[0] = rslt.getString(14, 10);
               ((String[]) buf[19])[0] = rslt.getString(15, 20);
               ((String[]) buf[20])[0] = rslt.getString(16, 30);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(17, 20);
               ((String[]) buf[23])[0] = rslt.getString(18, 26);
               ((String[]) buf[24])[0] = rslt.getString(19, 30);
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDate(20);
               ((String[]) buf[26])[0] = rslt.getString(21, 2);
               ((int[]) buf[27])[0] = rslt.getInt(22);
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(23,2);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(24,2);
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(25,2);
               ((int[]) buf[32])[0] = rslt.getInt(26);
               ((int[]) buf[33])[0] = rslt.getInt(27);
               ((String[]) buf[34])[0] = rslt.getString(28, 16);
               ((int[]) buf[35])[0] = rslt.getInt(29);
               ((String[]) buf[36])[0] = rslt.getString(30, 3);
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
                  stmt.setString(sIdx, (String)parms[51], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[54]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[55]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[61]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[67]);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 26);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 20);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 20);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 10);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 10);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[90], 2);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[91], 2);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[92], 2);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[93], 2);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[94], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[95], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 30);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 30);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 25);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 25);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 20);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 20);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[54]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[55]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[61]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[67]);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 26);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 20);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 20);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 10);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 10);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[90], 2);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[91], 2);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[92], 2);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[93], 2);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[94], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[95], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 30);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 30);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 25);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 25);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 20);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 20);
               }
               return;
      }
   }

}

