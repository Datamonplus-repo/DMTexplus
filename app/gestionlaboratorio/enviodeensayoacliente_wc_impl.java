package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class enviodeensayoacliente_wc_impl extends GXWebComponent
{
   public enviodeensayoacliente_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public enviodeensayoacliente_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( enviodeensayoacliente_wc_impl.class ));
   }

   public enviodeensayoacliente_wc_impl( int remoteHandle ,
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
      chkavSeleccionar = UIFactory.getCheckbox(this);
      cmbLb_Estado = new HTMLChoice();
      chkavSeleccionareliminar = UIFactory.getCheckbox(this);
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
               AV36Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36Emprcod", AV36Emprcod);
               AV6Clicod = (int)(GXutil.lval( httpContext.GetPar( "Clicod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Clicod), 6, 0));
               AV59Lb_Cartaz = httpContext.GetPar( "Lb_Cartaz") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59Lb_Cartaz", AV59Lb_Cartaz);
               AV60Lb_ColNom = httpContext.GetPar( "Lb_ColNom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60Lb_ColNom", AV60Lb_ColNom);
               AV65Lb_numero = (int)(GXutil.lval( httpContext.GetPar( "Lb_numero"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65Lb_numero), 8, 0));
               AV62Lb_FechaEfrom = localUtil.parseDateParm( httpContext.GetPar( "Lb_FechaEfrom")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62Lb_FechaEfrom", localUtil.format(AV62Lb_FechaEfrom, "99/99/99"));
               AV64Lb_FechaEto = localUtil.parseDateParm( httpContext.GetPar( "Lb_FechaEto")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64Lb_FechaEto", localUtil.format(AV64Lb_FechaEto, "99/99/99"));
               AV63Lb_fechaEn = localUtil.parseDateParm( httpContext.GetPar( "Lb_fechaEn")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63Lb_fechaEn", localUtil.format(AV63Lb_fechaEn, "99/99/99"));
               AV61Lb_estado = (byte)(GXutil.lval( httpContext.GetPar( "Lb_estado"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61Lb_estado", GXutil.str( AV61Lb_estado, 1, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV36Emprcod,Integer.valueOf(AV6Clicod),AV59Lb_Cartaz,AV60Lb_ColNom,Integer.valueOf(AV65Lb_numero),AV62Lb_FechaEfrom,AV64Lb_FechaEto,AV63Lb_fechaEn,Byte.valueOf(AV61Lb_estado)});
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
      nRC_GXsfl_80 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_80"))) ;
      nGXsfl_80_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_80_idx"))) ;
      sGXsfl_80_idx = httpContext.GetPar( "sGXsfl_80_idx") ;
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
      AV41FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV36Emprcod = httpContext.GetPar( "Emprcod") ;
      AV6Clicod = (int)(GXutil.lval( httpContext.GetPar( "Clicod"))) ;
      AV59Lb_Cartaz = httpContext.GetPar( "Lb_Cartaz") ;
      AV60Lb_ColNom = httpContext.GetPar( "Lb_ColNom") ;
      AV65Lb_numero = (int)(GXutil.lval( httpContext.GetPar( "Lb_numero"))) ;
      AV62Lb_FechaEfrom = localUtil.parseDateParm( httpContext.GetPar( "Lb_FechaEfrom")) ;
      AV64Lb_FechaEto = localUtil.parseDateParm( httpContext.GetPar( "Lb_FechaEto")) ;
      AV61Lb_estado = (byte)(GXutil.lval( httpContext.GetPar( "Lb_estado"))) ;
      AV69ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV10ColumnsSelector);
      AV122TFLb_numero = (int)(GXutil.lval( httpContext.GetPar( "TFLb_numero"))) ;
      AV123TFLb_numero_To = (int)(GXutil.lval( httpContext.GetPar( "TFLb_numero_To"))) ;
      AV80TFCliCod = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod"))) ;
      AV81TFCliCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod_To"))) ;
      AV86TFLb_ArtCod = httpContext.GetPar( "TFLb_ArtCod") ;
      AV87TFLb_ArtCod_Sel = httpContext.GetPar( "TFLb_ArtCod_Sel") ;
      AV90TFLb_ColNomC = httpContext.GetPar( "TFLb_ColNomC") ;
      AV91TFLb_ColNomC_Sel = httpContext.GetPar( "TFLb_ColNomC_Sel") ;
      AV138TFLb_Rb = CommonUtil.decimalVal( httpContext.GetPar( "TFLb_Rb"), ".") ;
      AV139TFLb_Rb_To = CommonUtil.decimalVal( httpContext.GetPar( "TFLb_Rb_To"), ".") ;
      AV130TFLb_opcion = httpContext.GetPar( "TFLb_opcion") ;
      AV131TFLb_opcion_Sel = httpContext.GetPar( "TFLb_opcion_Sel") ;
      AV124TFLb_numop = (byte)(GXutil.lval( httpContext.GetPar( "TFLb_numop"))) ;
      AV125TFLb_numop_To = (byte)(GXutil.lval( httpContext.GetPar( "TFLb_numop_To"))) ;
      AV88TFLb_Cartaz = httpContext.GetPar( "TFLb_Cartaz") ;
      AV89TFLb_Cartaz_Sel = httpContext.GetPar( "TFLb_Cartaz_Sel") ;
      AV102TFLb_FechaE = localUtil.parseDateParm( httpContext.GetPar( "TFLb_FechaE")) ;
      AV104TFLb_FechaEn = localUtil.parseDateParm( httpContext.GetPar( "TFLb_FechaEn")) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV97TFLb_Estado_Sels);
      AV164Pgmname = httpContext.GetPar( "Pgmname") ;
      AV73OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV75OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV63Lb_fechaEn = localUtil.parseDateParm( httpContext.GetPar( "Lb_fechaEn")) ;
      AV39F_Cformu = (short)(GXutil.lval( httpContext.GetPar( "F_Cformu"))) ;
      AV43ForUltUti = localUtil.parseDateParm( httpContext.GetPar( "ForUltUti")) ;
      AV42Fornumcol = (int)(GXutil.lval( httpContext.GetPar( "Fornumcol"))) ;
      Gx_msg = httpContext.GetPar( "Gx_msg") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV8Col_Lb_numero);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV9Col_Lb_opcion);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV144Col_Lb_numeroE);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV145Col_Lb_opcionE);
      AV13coste = CommonUtil.decimalVal( httpContext.GetPar( "coste"), ".") ;
      AV71Moda21 = (short)(GXutil.lval( httpContext.GetPar( "Moda21"))) ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV41FilterFullText, AV36Emprcod, AV6Clicod, AV59Lb_Cartaz, AV60Lb_ColNom, AV65Lb_numero, AV62Lb_FechaEfrom, AV64Lb_FechaEto, AV61Lb_estado, AV69ManageFiltersExecutionStep, AV10ColumnsSelector, AV122TFLb_numero, AV123TFLb_numero_To, AV80TFCliCod, AV81TFCliCod_To, AV86TFLb_ArtCod, AV87TFLb_ArtCod_Sel, AV90TFLb_ColNomC, AV91TFLb_ColNomC_Sel, AV138TFLb_Rb, AV139TFLb_Rb_To, AV130TFLb_opcion, AV131TFLb_opcion_Sel, AV124TFLb_numop, AV125TFLb_numop_To, AV88TFLb_Cartaz, AV89TFLb_Cartaz_Sel, AV102TFLb_FechaE, AV104TFLb_FechaEn, AV97TFLb_Estado_Sels, AV164Pgmname, AV73OrderedBy, AV75OrderedDsc, AV63Lb_fechaEn, AV39F_Cformu, AV43ForUltUti, AV42Fornumcol, Gx_msg, AV8Col_Lb_numero, AV9Col_Lb_opcion, AV144Col_Lb_numeroE, AV145Col_Lb_opcionE, AV13coste, AV71Moda21, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1TR2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Envio de Ensayos a Cliente", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.gestionlaboratorio.enviodeensayoacliente_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV36Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV6Clicod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV59Lb_Cartaz)),GXutil.URLEncode(GXutil.rtrim(AV60Lb_ColNom)),GXutil.URLEncode(GXutil.ltrimstr(AV65Lb_numero,8,0)),GXutil.URLEncode(GXutil.formatDateParm(AV62Lb_FechaEfrom)),GXutil.URLEncode(GXutil.formatDateParm(AV64Lb_FechaEto)),GXutil.URLEncode(GXutil.formatDateParm(AV63Lb_fechaEn)),GXutil.URLEncode(GXutil.ltrimstr(AV61Lb_estado,1,0))}, new String[] {"Emprcod","Clicod","Lb_Cartaz","Lb_ColNom","Lb_numero","Lb_FechaEfrom","Lb_FechaEto","Lb_fechaEn","Lb_estado"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFORULTUTI", getSecureSignedToken( sPrefix, AV43ForUltUti));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOSTE", getSecureSignedToken( sPrefix, localUtil.format( AV13coste, "ZZZZ9.99999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV71Moda21), "ZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"EnviodeEnsayoaCliente_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV164Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("gestionlaboratorio\\enviodeensayoacliente_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXH_vFILTERFULLTEXT", AV41FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_80", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_80, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV68ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV68ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV45GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV46GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV34DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV34DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV10ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV10ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV36Emprcod", GXutil.rtrim( wcpOAV36Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV6Clicod", GXutil.ltrim( localUtil.ntoc( wcpOAV6Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV59Lb_Cartaz", GXutil.rtrim( wcpOAV59Lb_Cartaz));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV60Lb_ColNom", GXutil.rtrim( wcpOAV60Lb_ColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV65Lb_numero", GXutil.ltrim( localUtil.ntoc( wcpOAV65Lb_numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV62Lb_FechaEfrom", localUtil.dtoc( wcpOAV62Lb_FechaEfrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV64Lb_FechaEto", localUtil.dtoc( wcpOAV64Lb_FechaEto, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV63Lb_fechaEn", localUtil.dtoc( wcpOAV63Lb_fechaEn, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV61Lb_estado", GXutil.ltrim( localUtil.ntoc( wcpOAV61Lb_estado, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV69ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_NUMERO", GXutil.ltrim( localUtil.ntoc( AV122TFLb_numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_NUMERO_TO", GXutil.ltrim( localUtil.ntoc( AV123TFLb_numero_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLICOD", GXutil.ltrim( localUtil.ntoc( AV80TFCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV81TFCliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_ARTCOD", GXutil.rtrim( AV86TFLb_ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_ARTCOD_SEL", GXutil.rtrim( AV87TFLb_ArtCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_COLNOMC", GXutil.rtrim( AV90TFLb_ColNomC));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_COLNOMC_SEL", GXutil.rtrim( AV91TFLb_ColNomC_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_RB", GXutil.ltrim( localUtil.ntoc( AV138TFLb_Rb, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_RB_TO", GXutil.ltrim( localUtil.ntoc( AV139TFLb_Rb_To, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_OPCION", GXutil.rtrim( AV130TFLb_opcion));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_OPCION_SEL", GXutil.rtrim( AV131TFLb_opcion_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_NUMOP", GXutil.ltrim( localUtil.ntoc( AV124TFLb_numop, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_NUMOP_TO", GXutil.ltrim( localUtil.ntoc( AV125TFLb_numop_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_CARTAZ", GXutil.rtrim( AV88TFLb_Cartaz));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_CARTAZ_SEL", GXutil.rtrim( AV89TFLb_Cartaz_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_FECHAE", localUtil.dtoc( AV102TFLb_FechaE, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_FECHAEN", localUtil.dtoc( AV104TFLb_FechaEn, 0, "/"));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vTFLB_ESTADO_SELS", AV97TFLb_Estado_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vTFLB_ESTADO_SELS", AV97TFLb_Estado_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV36Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV73OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV75OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD", GXutil.ltrim( localUtil.ntoc( AV6Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_CARTAZ", GXutil.rtrim( AV59Lb_Cartaz));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_COLNOM", GXutil.rtrim( AV60Lb_ColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_NUMERO", GXutil.ltrim( localUtil.ntoc( AV65Lb_numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_FECHAEFROM", localUtil.dtoc( AV62Lb_FechaEfrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_FECHAETO", localUtil.dtoc( AV64Lb_FechaEto, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_FECHAEN", localUtil.dtoc( AV63Lb_fechaEn, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_ESTADO", GXutil.ltrim( localUtil.ntoc( AV61Lb_estado, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"LB_COLNOM", GXutil.rtrim( A5536Lb_ColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"LB_COLNUM", GXutil.ltrim( localUtil.ntoc( A5537Lb_ColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TIPCOLCOD", GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORULTUTI", localUtil.dtoc( AV43ForUltUti, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFORULTUTI", getSecureSignedToken( sPrefix, AV43ForUltUti));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORNUMCOL", GXutil.ltrim( localUtil.ntoc( AV42Fornumcol, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMSG", GXutil.rtrim( Gx_msg));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOL_LB_NUMERO", AV8Col_Lb_numero);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOL_LB_NUMERO", AV8Col_Lb_numero);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOL_LB_OPCION", AV9Col_Lb_opcion);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOL_LB_OPCION", AV9Col_Lb_opcion);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOL_LB_NUMEROE", AV144Col_Lb_numeroE);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOL_LB_NUMEROE", AV144Col_Lb_numeroE);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOL_LB_OPCIONE", AV145Col_Lb_opcionE);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOL_LB_OPCIONE", AV145Col_Lb_opcionE);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV47GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV47GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_ESTADO_SELSJSON", AV98TFLb_Estado_SelsJson);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCOSTE", GXutil.ltrim( localUtil.ntoc( AV13coste, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOSTE", getSecureSignedToken( sPrefix, localUtil.format( AV13coste, "ZZZZ9.99999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMODA21", GXutil.ltrim( localUtil.ntoc( AV71Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV71Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vIN_LB_NUMEROL", GXutil.ltrim( localUtil.ntoc( AV54IN_Lb_numerol, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vIN_LB_FECHAEN", localUtil.dtoc( AV52IN_lb_fechaen, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CLINOM", GXutil.rtrim( A279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPCOLCOD", GXutil.ltrim( localUtil.ntoc( AV154TipColcod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLINOM", GXutil.rtrim( AV151CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_COLNOMC", GXutil.rtrim( AV155Lb_colnomc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_COLNUM", GXutil.ltrim( localUtil.ntoc( AV153lb_colNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vNUMFORM", GXutil.ltrim( localUtil.ntoc( AV156Numform, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vI", GXutil.ltrim( localUtil.ntoc( AV51i, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE3_Width", GXutil.rtrim( Dvpanel_unnamedtable3_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE3_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable3_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE3_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable3_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE3_Cls", GXutil.rtrim( Dvpanel_unnamedtable3_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE3_Title", GXutil.rtrim( Dvpanel_unnamedtable3_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE3_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable3_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE3_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable3_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE3_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable3_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE3_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable3_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE3_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable3_Autoscroll));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ENVIAR_Title", GXutil.rtrim( Dvelop_confirmpanel_enviar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ENVIAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_enviar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ENVIAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enviar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ENVIAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enviar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ENVIAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enviar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ENVIAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_enviar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ENVIAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_enviar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Title", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ENVIOOPCIONA_Title", GXutil.rtrim( Dvelop_confirmpanel_envioopciona_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ENVIOOPCIONA_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_envioopciona_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ENVIOOPCIONA_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_envioopciona_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ENVIOOPCIONA_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_envioopciona_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ENVIOOPCIONA_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_envioopciona_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ENVIOOPCIONA_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_envioopciona_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ENVIOOPCIONA_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_envioopciona_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ENVIAR_Result", GXutil.rtrim( Dvelop_confirmpanel_enviar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ENVIOOPCIONA_Result", GXutil.rtrim( Dvelop_confirmpanel_envioopciona_Result));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ENVIAR_Result", GXutil.rtrim( Dvelop_confirmpanel_enviar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ENVIOOPCIONA_Result", GXutil.rtrim( Dvelop_confirmpanel_envioopciona_Result));
   }

   public void renderHtmlCloseForm1TR2( )
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
      return "GestionLaboratorio.EnviodeEnsayoaCliente_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Envio de Ensayos a Cliente", "") ;
   }

   public void wb1TR0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.gestionlaboratorio.enviodeensayoacliente_wc");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 80, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\EnviodeEnsayoaCliente_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 80, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\EnviodeEnsayoaCliente_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 80, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\EnviodeEnsayoaCliente_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_23_1TR2( true) ;
      }
      else
      {
         wb_table1_23_1TR2( false) ;
      }
      return  ;
   }

   public void wb_table1_23_1TR2e( boolean wbgen )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenviar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 80, 2, 0)+","+"null"+");", httpContext.getMessage( "Enviar", ""), bttBtnenviar_Jsonclick, 7, httpContext.getMessage( "Enviar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e111tr1_client"+"'", TempTags, "", 2, "HLP_GestionLaboratorio\\EnviodeEnsayoaCliente_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnmarcartodos_Internalname, "gx.evt.setGridEvt("+GXutil.str( 80, 2, 0)+","+"null"+");", "++", bttBtnmarcartodos_Jsonclick, 5, "++", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOMARCARTODOS\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\EnviodeEnsayoaCliente_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtndesmarcartodos_Internalname, "gx.evt.setGridEvt("+GXutil.str( 80, 2, 0)+","+"null"+");", "--", bttBtndesmarcartodos_Jsonclick, 5, "--", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DODESMARCARTODOS\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\EnviodeEnsayoaCliente_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneliminar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 80, 2, 0)+","+"null"+");", httpContext.getMessage( "Eliminar Envio", ""), bttBtneliminar_Jsonclick, 7, httpContext.getMessage( "Eliminar Envio", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e121tr1_client"+"'", TempTags, "", 2, "HLP_GestionLaboratorio\\EnviodeEnsayoaCliente_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnlabdip_Internalname, "gx.evt.setGridEvt("+GXutil.str( 80, 2, 0)+","+"null"+");", httpContext.getMessage( "Lab DIP para Aprovaçao", ""), bttBtnlabdip_Jsonclick, 5, httpContext.getMessage( "Lab DIP para Aprovaçao", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOLABDIP\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\EnviodeEnsayoaCliente_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenvioopciona_Internalname, "gx.evt.setGridEvt("+GXutil.str( 80, 2, 0)+","+"null"+");", httpContext.getMessage( "Envio Opcion Texplus Provisional", ""), bttBtnenvioopciona_Jsonclick, 5, httpContext.getMessage( "Envio Opcion Texplus Provisional", ""), "", StyleString, ClassString, bttBtnenvioopciona_Visible, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOENVIOOPCIONA\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\EnviodeEnsayoaCliente_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncancelar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 80, 2, 0)+","+"null"+");", httpContext.getMessage( "Cancelar", ""), bttBtncancelar_Jsonclick, 5, httpContext.getMessage( "Cancelar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOCANCELAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\EnviodeEnsayoaCliente_WC.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", divUnnamedtable2_Height, "px", "", "left", "top", "", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_unnamedtable3.setProperty("Width", Dvpanel_unnamedtable3_Width);
         ucDvpanel_unnamedtable3.setProperty("AutoWidth", Dvpanel_unnamedtable3_Autowidth);
         ucDvpanel_unnamedtable3.setProperty("AutoHeight", Dvpanel_unnamedtable3_Autoheight);
         ucDvpanel_unnamedtable3.setProperty("Cls", Dvpanel_unnamedtable3_Cls);
         ucDvpanel_unnamedtable3.setProperty("Title", Dvpanel_unnamedtable3_Title);
         ucDvpanel_unnamedtable3.setProperty("Collapsible", Dvpanel_unnamedtable3_Collapsible);
         ucDvpanel_unnamedtable3.setProperty("Collapsed", Dvpanel_unnamedtable3_Collapsed);
         ucDvpanel_unnamedtable3.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable3_Showcollapseicon);
         ucDvpanel_unnamedtable3.setProperty("IconPosition", Dvpanel_unnamedtable3_Iconposition);
         ucDvpanel_unnamedtable3.setProperty("AutoScroll", Dvpanel_unnamedtable3_Autoscroll);
         ucDvpanel_unnamedtable3.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable3_Internalname, sPrefix+"DVPANEL_UNNAMEDTABLE3Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_UNNAMEDTABLE3Container"+"UnnamedTable3"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-10", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnlabdipcoste_Internalname, "gx.evt.setGridEvt("+GXutil.str( 80, 2, 0)+","+"null"+");", httpContext.getMessage( "Lab DIP con Coste", ""), bttBtnlabdipcoste_Jsonclick, 5, httpContext.getMessage( "Lab DIP con Coste", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOLABDIPCOSTE\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\EnviodeEnsayoaCliente_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablelb_rb_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 MergeLabelCell CellWidth_12_5", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblocklb_rb_Internalname, httpContext.getMessage( "Rb", ""), "", "", lblTextblocklb_rb_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_GestionLaboratorio\\EnviodeEnsayoaCliente_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 CellWidth_87_5", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavLb_rb_Internalname, httpContext.getMessage( "Rb", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'" + sPrefix + "',false,'" + sGXsfl_80_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLb_rb_Internalname, GXutil.ltrim( localUtil.ntoc( AV67Lb_Rb, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavLb_rb_Enabled!=0) ? localUtil.format( AV67Lb_Rb, "ZZZ9.99") : localUtil.format( AV67Lb_Rb, "ZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,71);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLb_rb_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavLb_rb_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\EnviodeEnsayoaCliente_WC.htm");
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
         startgridcontrol80( ) ;
      }
      if ( wbEnd == 80 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_80 = (int)(nGXsfl_80_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV45GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV46GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, sPrefix+"GRIDPAGINATIONBARContainer");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV164Pgmname), GXutil.rtrim( localUtil.format( AV164Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GestionLaboratorio\\EnviodeEnsayoaCliente_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDatamonjs.render(context, "datamonjs", Datamonjs_Internalname, sPrefix+"DATAMONJSContainer");
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
         ucDdo_grid.setProperty("AllowMultipleSelection", Ddo_grid_Allowmultipleselection);
         ucDdo_grid.setProperty("DataListFixedValues", Ddo_grid_Datalistfixedvalues);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV34DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV34DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV10ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         wb_table2_113_1TR2( true) ;
      }
      else
      {
         wb_table2_113_1TR2( false) ;
      }
      return  ;
   }

   public void wb_table2_113_1TR2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table3_118_1TR2( true) ;
      }
      else
      {
         wb_table3_118_1TR2( false) ;
      }
      return  ;
   }

   public void wb_table3_118_1TR2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table4_123_1TR2( true) ;
      }
      else
      {
         wb_table4_123_1TR2( false) ;
      }
      return  ;
   }

   public void wb_table4_123_1TR2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_lb_fechaeauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 130,'" + sPrefix + "',false,'" + sGXsfl_80_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_lb_fechaeauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_lb_fechaeauxdate_Internalname, localUtil.format(AV16DDO_Lb_FechaEAuxDate, "99/99/99"), localUtil.format( AV16DDO_Lb_FechaEAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,130);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_lb_fechaeauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\EnviodeEnsayoaCliente_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_lb_fechaeauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_GestionLaboratorio\\EnviodeEnsayoaCliente_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_lb_fechaenauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 132,'" + sPrefix + "',false,'" + sGXsfl_80_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_lb_fechaenauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_lb_fechaenauxdate_Internalname, localUtil.format(AV18DDO_Lb_FechaEnAuxDate, "99/99/99"), localUtil.format( AV18DDO_Lb_FechaEnAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,132);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_lb_fechaenauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\EnviodeEnsayoaCliente_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_lb_fechaenauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_GestionLaboratorio\\EnviodeEnsayoaCliente_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 80 )
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

   public void start1TR2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Envio de Ensayos a Cliente", ""), (short)(0)) ;
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
            strup1TR0( ) ;
         }
      }
   }

   public void ws1TR2( )
   {
      start1TR2( ) ;
      evt1TR2( ) ;
   }

   public void evt1TR2( )
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
                              strup1TR0( ) ;
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
                              strup1TR0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e131TR2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1TR0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e141TR2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1TR0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e151TR2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1TR0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e161TR2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1TR0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e171TR2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ENVIAR.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1TR0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e181TR2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1TR0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e191TR2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ENVIOOPCIONA.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1TR0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e201TR2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOLABDIPCOSTE'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1TR0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'Dolabdipcoste' */
                                 e211TR2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOMARCARTODOS'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1TR0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoMarcarTodos' */
                                 e221TR2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DODESMARCARTODOS'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1TR0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoDesmarcarTodos' */
                                 e231TR2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOLABDIP'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1TR0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'Dolabdip' */
                                 e241TR2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOENVIOOPCIONA'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1TR0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoEnvioOpcionA' */
                                 e251TR2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCANCELAR'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1TR0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoCancelar' */
                                 e261TR2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1TR0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e271TR2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1TR0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e281TR2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1TR0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = chkavSeleccionar.getInternalname() ;
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
                              strup1TR0( ) ;
                           }
                           nGXsfl_80_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_802( ) ;
                           AV77Seleccionar = GXutil.strtobool( httpContext.cgiGet( chkavSeleccionar.getInternalname())) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSeleccionar.getInternalname(), AV77Seleccionar);
                           A5532Lb_numero = (int)(localUtil.ctol( httpContext.cgiGet( edtLb_numero_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A5533Lb_ArtCod = httpContext.cgiGet( edtLb_ArtCod_Internalname) ;
                           A5538Lb_ColNomC = httpContext.cgiGet( edtLb_ColNomC_Internalname) ;
                           A5547Lb_Rb = localUtil.ctond( httpContext.cgiGet( edtLb_Rb_Internalname)) ;
                           A5555Lb_opcion = GXutil.upper( httpContext.cgiGet( edtLb_opcion_Internalname)) ;
                           A5718Lb_numop = (byte)(localUtil.ctol( httpContext.cgiGet( edtLb_numop_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A5540Lb_Cartaz = httpContext.cgiGet( edtLb_Cartaz_Internalname) ;
                           A5541Lb_FechaE = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtLb_FechaE_Internalname), 0)) ;
                           A5567Lb_FechaEn = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtLb_FechaEn_Internalname), 0)) ;
                           cmbLb_Estado.setName( cmbLb_Estado.getInternalname() );
                           cmbLb_Estado.setValue( httpContext.cgiGet( cmbLb_Estado.getInternalname()) );
                           A5566Lb_Estado = (byte)(GXutil.lval( httpContext.cgiGet( cmbLb_Estado.getInternalname()))) ;
                           AV72Obs = httpContext.cgiGet( edtavObs_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavObs_Internalname, AV72Obs);
                           AV78SeleccionarEliminar = GXutil.strtobool( httpContext.cgiGet( chkavSeleccionareliminar.getInternalname())) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSeleccionareliminar.getInternalname(), AV78SeleccionarEliminar);
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavF_cformu_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavF_cformu_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vF_CFORMU");
                              GX_FocusControl = edtavF_cformu_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV39F_Cformu = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavF_cformu_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39F_Cformu), 4, 0));
                           }
                           else
                           {
                              AV39F_Cformu = (short)(localUtil.ctol( httpContext.cgiGet( edtavF_cformu_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavF_cformu_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39F_Cformu), 4, 0));
                           }
                           A5565Lb_CosteE = localUtil.ctond( httpContext.cgiGet( edtLb_CosteE_Internalname)) ;
                           A5599Lb_RGB = localUtil.ctol( httpContext.cgiGet( edtLb_RGB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
                                       GX_FocusControl = chkavSeleccionar.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e291TR2 ();
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
                                       GX_FocusControl = chkavSeleccionar.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e301TR2 ();
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
                                       GX_FocusControl = chkavSeleccionar.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e311TR2 ();
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
                                          /* Set Refresh If Filterfulltext Changed */
                                          if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV41FilterFullText) != 0 )
                                          {
                                             Rfr0gs = true ;
                                          }
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
                                    strup1TR0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = chkavSeleccionar.getInternalname() ;
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

   public void we1TR2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1TR2( ) ;
         }
      }
   }

   public void pa1TR2( )
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
      subsflControlProps_802( ) ;
      while ( nGXsfl_80_idx <= nRC_GXsfl_80 )
      {
         sendrow_802( ) ;
         nGXsfl_80_idx = ((subGrid_Islastpage==1)&&(nGXsfl_80_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_80_idx+1) ;
         sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_802( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV41FilterFullText ,
                                 String AV36Emprcod ,
                                 int AV6Clicod ,
                                 String AV59Lb_Cartaz ,
                                 String AV60Lb_ColNom ,
                                 int AV65Lb_numero ,
                                 java.util.Date AV62Lb_FechaEfrom ,
                                 java.util.Date AV64Lb_FechaEto ,
                                 byte AV61Lb_estado ,
                                 byte AV69ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV10ColumnsSelector ,
                                 int AV122TFLb_numero ,
                                 int AV123TFLb_numero_To ,
                                 int AV80TFCliCod ,
                                 int AV81TFCliCod_To ,
                                 String AV86TFLb_ArtCod ,
                                 String AV87TFLb_ArtCod_Sel ,
                                 String AV90TFLb_ColNomC ,
                                 String AV91TFLb_ColNomC_Sel ,
                                 java.math.BigDecimal AV138TFLb_Rb ,
                                 java.math.BigDecimal AV139TFLb_Rb_To ,
                                 String AV130TFLb_opcion ,
                                 String AV131TFLb_opcion_Sel ,
                                 byte AV124TFLb_numop ,
                                 byte AV125TFLb_numop_To ,
                                 String AV88TFLb_Cartaz ,
                                 String AV89TFLb_Cartaz_Sel ,
                                 java.util.Date AV102TFLb_FechaE ,
                                 java.util.Date AV104TFLb_FechaEn ,
                                 GXSimpleCollection<Byte> AV97TFLb_Estado_Sels ,
                                 String AV164Pgmname ,
                                 short AV73OrderedBy ,
                                 boolean AV75OrderedDsc ,
                                 java.util.Date AV63Lb_fechaEn ,
                                 short AV39F_Cformu ,
                                 java.util.Date AV43ForUltUti ,
                                 int AV42Fornumcol ,
                                 String Gx_msg ,
                                 GXSimpleCollection<Integer> AV8Col_Lb_numero ,
                                 GXSimpleCollection<String> AV9Col_Lb_opcion ,
                                 GXSimpleCollection<Integer> AV144Col_Lb_numeroE ,
                                 GXSimpleCollection<String> AV145Col_Lb_opcionE ,
                                 java.math.BigDecimal AV13coste ,
                                 short AV71Moda21 ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e301TR2 ();
      GRID_nCurrentRecord = 0 ;
      rf1TR2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"EnviodeEnsayoaCliente_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV164Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("gestionlaboratorio\\enviodeensayoacliente_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_LB_ESTADO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A5566Lb_Estado), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"LB_ESTADO", GXutil.ltrim( localUtil.ntoc( A5566Lb_Estado, (byte)(1), (byte)(0), ".", "")));
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
      rf1TR2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV164Pgmname = "GestionLaboratorio.EnviodeEnsayoaCliente_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV164Pgmname", AV164Pgmname);
      Gx_err = (short)(0) ;
      edtavObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavObs_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtavF_cformu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavF_cformu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavF_cformu_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1TR2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(80) ;
      /* Execute user event: Refresh */
      e301TR2 ();
      nGXsfl_80_idx = 1 ;
      sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_802( ) ;
      bGXsfl_80_Refreshing = true ;
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
         subsflControlProps_802( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Byte.valueOf(A5566Lb_Estado) ,
                                              AV184Gestionlaboratorio_enviodeensayoacliente_wcds_20_tflb_estado_sels ,
                                              AV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext ,
                                              Integer.valueOf(AV166Gestionlaboratorio_enviodeensayoacliente_wcds_2_tflb_numero) ,
                                              Integer.valueOf(AV167Gestionlaboratorio_enviodeensayoacliente_wcds_3_tflb_numero_to) ,
                                              Integer.valueOf(AV168Gestionlaboratorio_enviodeensayoacliente_wcds_4_tfclicod) ,
                                              Integer.valueOf(AV169Gestionlaboratorio_enviodeensayoacliente_wcds_5_tfclicod_to) ,
                                              AV171Gestionlaboratorio_enviodeensayoacliente_wcds_7_tflb_artcod_sel ,
                                              AV170Gestionlaboratorio_enviodeensayoacliente_wcds_6_tflb_artcod ,
                                              AV173Gestionlaboratorio_enviodeensayoacliente_wcds_9_tflb_colnomc_sel ,
                                              AV172Gestionlaboratorio_enviodeensayoacliente_wcds_8_tflb_colnomc ,
                                              AV174Gestionlaboratorio_enviodeensayoacliente_wcds_10_tflb_rb ,
                                              AV175Gestionlaboratorio_enviodeensayoacliente_wcds_11_tflb_rb_to ,
                                              AV177Gestionlaboratorio_enviodeensayoacliente_wcds_13_tflb_opcion_sel ,
                                              AV176Gestionlaboratorio_enviodeensayoacliente_wcds_12_tflb_opcion ,
                                              Byte.valueOf(AV178Gestionlaboratorio_enviodeensayoacliente_wcds_14_tflb_numop) ,
                                              Byte.valueOf(AV179Gestionlaboratorio_enviodeensayoacliente_wcds_15_tflb_numop_to) ,
                                              AV181Gestionlaboratorio_enviodeensayoacliente_wcds_17_tflb_cartaz_sel ,
                                              AV180Gestionlaboratorio_enviodeensayoacliente_wcds_16_tflb_cartaz ,
                                              AV182Gestionlaboratorio_enviodeensayoacliente_wcds_18_tflb_fechae ,
                                              AV183Gestionlaboratorio_enviodeensayoacliente_wcds_19_tflb_fechaen ,
                                              Integer.valueOf(AV184Gestionlaboratorio_enviodeensayoacliente_wcds_20_tflb_estado_sels.size()) ,
                                              Integer.valueOf(AV6Clicod) ,
                                              AV59Lb_Cartaz ,
                                              AV60Lb_ColNom ,
                                              Integer.valueOf(AV65Lb_numero) ,
                                              AV62Lb_FechaEfrom ,
                                              AV64Lb_FechaEto ,
                                              Integer.valueOf(A5532Lb_numero) ,
                                              Integer.valueOf(A252CliCod) ,
                                              A5533Lb_ArtCod ,
                                              A5538Lb_ColNomC ,
                                              A5547Lb_Rb ,
                                              A5555Lb_opcion ,
                                              Byte.valueOf(A5718Lb_numop) ,
                                              A5540Lb_Cartaz ,
                                              A5541Lb_FechaE ,
                                              A5567Lb_FechaEn ,
                                              A5536Lb_ColNom ,
                                              Short.valueOf(AV73OrderedBy) ,
                                              Boolean.valueOf(AV75OrderedDsc) ,
                                              Byte.valueOf(A5569Lb_EstEns) ,
                                              Short.valueOf(AV147Carvema) ,
                                              Byte.valueOf(AV61Lb_estado) ,
                                              AV36Emprcod ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                              TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext), "%", "") ;
         lV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext), "%", "") ;
         lV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext), "%", "") ;
         lV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext), "%", "") ;
         lV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext), "%", "") ;
         lV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext), "%", "") ;
         lV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext), "%", "") ;
         lV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext), "%", "") ;
         lV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext), "%", "") ;
         lV170Gestionlaboratorio_enviodeensayoacliente_wcds_6_tflb_artcod = GXutil.padr( GXutil.rtrim( AV170Gestionlaboratorio_enviodeensayoacliente_wcds_6_tflb_artcod), 16, "%") ;
         lV172Gestionlaboratorio_enviodeensayoacliente_wcds_8_tflb_colnomc = GXutil.padr( GXutil.rtrim( AV172Gestionlaboratorio_enviodeensayoacliente_wcds_8_tflb_colnomc), 13, "%") ;
         lV176Gestionlaboratorio_enviodeensayoacliente_wcds_12_tflb_opcion = GXutil.padr( GXutil.rtrim( AV176Gestionlaboratorio_enviodeensayoacliente_wcds_12_tflb_opcion), 1, "%") ;
         lV180Gestionlaboratorio_enviodeensayoacliente_wcds_16_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV180Gestionlaboratorio_enviodeensayoacliente_wcds_16_tflb_cartaz), 20, "%") ;
         lV59Lb_Cartaz = GXutil.padr( GXutil.rtrim( AV59Lb_Cartaz), 20, "%") ;
         lV60Lb_ColNom = GXutil.padr( GXutil.rtrim( AV60Lb_ColNom), 13, "%") ;
         /* Using cursor H01TR2 */
         pr_default.execute(0, new Object[] {AV36Emprcod, Short.valueOf(AV147Carvema), Byte.valueOf(AV61Lb_estado), Byte.valueOf(AV61Lb_estado), Byte.valueOf(AV61Lb_estado), lV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext, lV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext, lV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext, lV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext, lV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext, lV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext, lV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext, lV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext, lV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext, Integer.valueOf(AV166Gestionlaboratorio_enviodeensayoacliente_wcds_2_tflb_numero), Integer.valueOf(AV167Gestionlaboratorio_enviodeensayoacliente_wcds_3_tflb_numero_to), Integer.valueOf(AV168Gestionlaboratorio_enviodeensayoacliente_wcds_4_tfclicod), Integer.valueOf(AV169Gestionlaboratorio_enviodeensayoacliente_wcds_5_tfclicod_to), lV170Gestionlaboratorio_enviodeensayoacliente_wcds_6_tflb_artcod, AV171Gestionlaboratorio_enviodeensayoacliente_wcds_7_tflb_artcod_sel, lV172Gestionlaboratorio_enviodeensayoacliente_wcds_8_tflb_colnomc, AV173Gestionlaboratorio_enviodeensayoacliente_wcds_9_tflb_colnomc_sel, AV174Gestionlaboratorio_enviodeensayoacliente_wcds_10_tflb_rb, AV175Gestionlaboratorio_enviodeensayoacliente_wcds_11_tflb_rb_to, lV176Gestionlaboratorio_enviodeensayoacliente_wcds_12_tflb_opcion, AV177Gestionlaboratorio_enviodeensayoacliente_wcds_13_tflb_opcion_sel, Byte.valueOf(AV178Gestionlaboratorio_enviodeensayoacliente_wcds_14_tflb_numop), Byte.valueOf(AV179Gestionlaboratorio_enviodeensayoacliente_wcds_15_tflb_numop_to), lV180Gestionlaboratorio_enviodeensayoacliente_wcds_16_tflb_cartaz, AV181Gestionlaboratorio_enviodeensayoacliente_wcds_17_tflb_cartaz_sel, AV182Gestionlaboratorio_enviodeensayoacliente_wcds_18_tflb_fechae, AV183Gestionlaboratorio_enviodeensayoacliente_wcds_19_tflb_fechaen, Integer.valueOf(AV6Clicod), lV59Lb_Cartaz, lV60Lb_ColNom, Integer.valueOf(AV65Lb_numero), AV62Lb_FechaEfrom, AV64Lb_FechaEto, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_80_idx = 1 ;
         sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_802( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A5569Lb_EstEns = H01TR2_A5569Lb_EstEns[0] ;
            A396EmprCod = H01TR2_A396EmprCod[0] ;
            A5536Lb_ColNom = H01TR2_A5536Lb_ColNom[0] ;
            A5537Lb_ColNum = H01TR2_A5537Lb_ColNum[0] ;
            A831TipColCod = H01TR2_A831TipColCod[0] ;
            n831TipColCod = H01TR2_n831TipColCod[0] ;
            A279CliNom = H01TR2_A279CliNom[0] ;
            A5599Lb_RGB = H01TR2_A5599Lb_RGB[0] ;
            A5565Lb_CosteE = H01TR2_A5565Lb_CosteE[0] ;
            A5566Lb_Estado = H01TR2_A5566Lb_Estado[0] ;
            A5567Lb_FechaEn = H01TR2_A5567Lb_FechaEn[0] ;
            A5541Lb_FechaE = H01TR2_A5541Lb_FechaE[0] ;
            A5540Lb_Cartaz = H01TR2_A5540Lb_Cartaz[0] ;
            A5718Lb_numop = H01TR2_A5718Lb_numop[0] ;
            A5555Lb_opcion = H01TR2_A5555Lb_opcion[0] ;
            A5547Lb_Rb = H01TR2_A5547Lb_Rb[0] ;
            A5538Lb_ColNomC = H01TR2_A5538Lb_ColNomC[0] ;
            A5533Lb_ArtCod = H01TR2_A5533Lb_ArtCod[0] ;
            A252CliCod = H01TR2_A252CliCod[0] ;
            A5532Lb_numero = H01TR2_A5532Lb_numero[0] ;
            A5569Lb_EstEns = H01TR2_A5569Lb_EstEns[0] ;
            A5536Lb_ColNom = H01TR2_A5536Lb_ColNom[0] ;
            A5537Lb_ColNum = H01TR2_A5537Lb_ColNum[0] ;
            A831TipColCod = H01TR2_A831TipColCod[0] ;
            n831TipColCod = H01TR2_n831TipColCod[0] ;
            A5599Lb_RGB = H01TR2_A5599Lb_RGB[0] ;
            A5541Lb_FechaE = H01TR2_A5541Lb_FechaE[0] ;
            A5540Lb_Cartaz = H01TR2_A5540Lb_Cartaz[0] ;
            A5547Lb_Rb = H01TR2_A5547Lb_Rb[0] ;
            A5538Lb_ColNomC = H01TR2_A5538Lb_ColNomC[0] ;
            A5533Lb_ArtCod = H01TR2_A5533Lb_ArtCod[0] ;
            A252CliCod = H01TR2_A252CliCod[0] ;
            A279CliNom = H01TR2_A279CliNom[0] ;
            e311TR2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(80) ;
         wb1TR0( ) ;
      }
      bGXsfl_80_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1TR2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORULTUTI", localUtil.dtoc( AV43ForUltUti, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFORULTUTI", getSecureSignedToken( sPrefix, AV43ForUltUti));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCOSTE", GXutil.ltrim( localUtil.ntoc( AV13coste, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOSTE", getSecureSignedToken( sPrefix, localUtil.format( AV13coste, "ZZZZ9.99999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMODA21", GXutil.ltrim( localUtil.ntoc( AV71Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV71Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_LB_ESTADO"+"_"+sGXsfl_80_idx, getSecureSignedToken( sPrefix+sGXsfl_80_idx, localUtil.format( DecimalUtil.doubleToDec(A5566Lb_Estado), "9")));
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
      AV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext = AV41FilterFullText ;
      AV166Gestionlaboratorio_enviodeensayoacliente_wcds_2_tflb_numero = AV122TFLb_numero ;
      AV167Gestionlaboratorio_enviodeensayoacliente_wcds_3_tflb_numero_to = AV123TFLb_numero_To ;
      AV168Gestionlaboratorio_enviodeensayoacliente_wcds_4_tfclicod = AV80TFCliCod ;
      AV169Gestionlaboratorio_enviodeensayoacliente_wcds_5_tfclicod_to = AV81TFCliCod_To ;
      AV170Gestionlaboratorio_enviodeensayoacliente_wcds_6_tflb_artcod = AV86TFLb_ArtCod ;
      AV171Gestionlaboratorio_enviodeensayoacliente_wcds_7_tflb_artcod_sel = AV87TFLb_ArtCod_Sel ;
      AV172Gestionlaboratorio_enviodeensayoacliente_wcds_8_tflb_colnomc = AV90TFLb_ColNomC ;
      AV173Gestionlaboratorio_enviodeensayoacliente_wcds_9_tflb_colnomc_sel = AV91TFLb_ColNomC_Sel ;
      AV174Gestionlaboratorio_enviodeensayoacliente_wcds_10_tflb_rb = AV138TFLb_Rb ;
      AV175Gestionlaboratorio_enviodeensayoacliente_wcds_11_tflb_rb_to = AV139TFLb_Rb_To ;
      AV176Gestionlaboratorio_enviodeensayoacliente_wcds_12_tflb_opcion = AV130TFLb_opcion ;
      AV177Gestionlaboratorio_enviodeensayoacliente_wcds_13_tflb_opcion_sel = AV131TFLb_opcion_Sel ;
      AV178Gestionlaboratorio_enviodeensayoacliente_wcds_14_tflb_numop = AV124TFLb_numop ;
      AV179Gestionlaboratorio_enviodeensayoacliente_wcds_15_tflb_numop_to = AV125TFLb_numop_To ;
      AV180Gestionlaboratorio_enviodeensayoacliente_wcds_16_tflb_cartaz = AV88TFLb_Cartaz ;
      AV181Gestionlaboratorio_enviodeensayoacliente_wcds_17_tflb_cartaz_sel = AV89TFLb_Cartaz_Sel ;
      AV182Gestionlaboratorio_enviodeensayoacliente_wcds_18_tflb_fechae = AV102TFLb_FechaE ;
      AV183Gestionlaboratorio_enviodeensayoacliente_wcds_19_tflb_fechaen = AV104TFLb_FechaEn ;
      AV184Gestionlaboratorio_enviodeensayoacliente_wcds_20_tflb_estado_sels = AV97TFLb_Estado_Sels ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Byte.valueOf(A5566Lb_Estado) ,
                                           AV184Gestionlaboratorio_enviodeensayoacliente_wcds_20_tflb_estado_sels ,
                                           AV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext ,
                                           Integer.valueOf(AV166Gestionlaboratorio_enviodeensayoacliente_wcds_2_tflb_numero) ,
                                           Integer.valueOf(AV167Gestionlaboratorio_enviodeensayoacliente_wcds_3_tflb_numero_to) ,
                                           Integer.valueOf(AV168Gestionlaboratorio_enviodeensayoacliente_wcds_4_tfclicod) ,
                                           Integer.valueOf(AV169Gestionlaboratorio_enviodeensayoacliente_wcds_5_tfclicod_to) ,
                                           AV171Gestionlaboratorio_enviodeensayoacliente_wcds_7_tflb_artcod_sel ,
                                           AV170Gestionlaboratorio_enviodeensayoacliente_wcds_6_tflb_artcod ,
                                           AV173Gestionlaboratorio_enviodeensayoacliente_wcds_9_tflb_colnomc_sel ,
                                           AV172Gestionlaboratorio_enviodeensayoacliente_wcds_8_tflb_colnomc ,
                                           AV174Gestionlaboratorio_enviodeensayoacliente_wcds_10_tflb_rb ,
                                           AV175Gestionlaboratorio_enviodeensayoacliente_wcds_11_tflb_rb_to ,
                                           AV177Gestionlaboratorio_enviodeensayoacliente_wcds_13_tflb_opcion_sel ,
                                           AV176Gestionlaboratorio_enviodeensayoacliente_wcds_12_tflb_opcion ,
                                           Byte.valueOf(AV178Gestionlaboratorio_enviodeensayoacliente_wcds_14_tflb_numop) ,
                                           Byte.valueOf(AV179Gestionlaboratorio_enviodeensayoacliente_wcds_15_tflb_numop_to) ,
                                           AV181Gestionlaboratorio_enviodeensayoacliente_wcds_17_tflb_cartaz_sel ,
                                           AV180Gestionlaboratorio_enviodeensayoacliente_wcds_16_tflb_cartaz ,
                                           AV182Gestionlaboratorio_enviodeensayoacliente_wcds_18_tflb_fechae ,
                                           AV183Gestionlaboratorio_enviodeensayoacliente_wcds_19_tflb_fechaen ,
                                           Integer.valueOf(AV184Gestionlaboratorio_enviodeensayoacliente_wcds_20_tflb_estado_sels.size()) ,
                                           Integer.valueOf(AV6Clicod) ,
                                           AV59Lb_Cartaz ,
                                           AV60Lb_ColNom ,
                                           Integer.valueOf(AV65Lb_numero) ,
                                           AV62Lb_FechaEfrom ,
                                           AV64Lb_FechaEto ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A5533Lb_ArtCod ,
                                           A5538Lb_ColNomC ,
                                           A5547Lb_Rb ,
                                           A5555Lb_opcion ,
                                           Byte.valueOf(A5718Lb_numop) ,
                                           A5540Lb_Cartaz ,
                                           A5541Lb_FechaE ,
                                           A5567Lb_FechaEn ,
                                           A5536Lb_ColNom ,
                                           Short.valueOf(AV73OrderedBy) ,
                                           Boolean.valueOf(AV75OrderedDsc) ,
                                           Byte.valueOf(A5569Lb_EstEns) ,
                                           Short.valueOf(AV147Carvema) ,
                                           Byte.valueOf(AV61Lb_estado) ,
                                           AV36Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext), "%", "") ;
      lV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext), "%", "") ;
      lV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext), "%", "") ;
      lV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext), "%", "") ;
      lV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext), "%", "") ;
      lV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext), "%", "") ;
      lV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext), "%", "") ;
      lV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext), "%", "") ;
      lV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext), "%", "") ;
      lV170Gestionlaboratorio_enviodeensayoacliente_wcds_6_tflb_artcod = GXutil.padr( GXutil.rtrim( AV170Gestionlaboratorio_enviodeensayoacliente_wcds_6_tflb_artcod), 16, "%") ;
      lV172Gestionlaboratorio_enviodeensayoacliente_wcds_8_tflb_colnomc = GXutil.padr( GXutil.rtrim( AV172Gestionlaboratorio_enviodeensayoacliente_wcds_8_tflb_colnomc), 13, "%") ;
      lV176Gestionlaboratorio_enviodeensayoacliente_wcds_12_tflb_opcion = GXutil.padr( GXutil.rtrim( AV176Gestionlaboratorio_enviodeensayoacliente_wcds_12_tflb_opcion), 1, "%") ;
      lV180Gestionlaboratorio_enviodeensayoacliente_wcds_16_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV180Gestionlaboratorio_enviodeensayoacliente_wcds_16_tflb_cartaz), 20, "%") ;
      lV59Lb_Cartaz = GXutil.padr( GXutil.rtrim( AV59Lb_Cartaz), 20, "%") ;
      lV60Lb_ColNom = GXutil.padr( GXutil.rtrim( AV60Lb_ColNom), 13, "%") ;
      /* Using cursor H01TR3 */
      pr_default.execute(1, new Object[] {AV36Emprcod, Short.valueOf(AV147Carvema), Byte.valueOf(AV61Lb_estado), Byte.valueOf(AV61Lb_estado), Byte.valueOf(AV61Lb_estado), lV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext, lV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext, lV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext, lV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext, lV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext, lV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext, lV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext, lV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext, lV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext, Integer.valueOf(AV166Gestionlaboratorio_enviodeensayoacliente_wcds_2_tflb_numero), Integer.valueOf(AV167Gestionlaboratorio_enviodeensayoacliente_wcds_3_tflb_numero_to), Integer.valueOf(AV168Gestionlaboratorio_enviodeensayoacliente_wcds_4_tfclicod), Integer.valueOf(AV169Gestionlaboratorio_enviodeensayoacliente_wcds_5_tfclicod_to), lV170Gestionlaboratorio_enviodeensayoacliente_wcds_6_tflb_artcod, AV171Gestionlaboratorio_enviodeensayoacliente_wcds_7_tflb_artcod_sel, lV172Gestionlaboratorio_enviodeensayoacliente_wcds_8_tflb_colnomc, AV173Gestionlaboratorio_enviodeensayoacliente_wcds_9_tflb_colnomc_sel, AV174Gestionlaboratorio_enviodeensayoacliente_wcds_10_tflb_rb, AV175Gestionlaboratorio_enviodeensayoacliente_wcds_11_tflb_rb_to, lV176Gestionlaboratorio_enviodeensayoacliente_wcds_12_tflb_opcion, AV177Gestionlaboratorio_enviodeensayoacliente_wcds_13_tflb_opcion_sel, Byte.valueOf(AV178Gestionlaboratorio_enviodeensayoacliente_wcds_14_tflb_numop), Byte.valueOf(AV179Gestionlaboratorio_enviodeensayoacliente_wcds_15_tflb_numop_to), lV180Gestionlaboratorio_enviodeensayoacliente_wcds_16_tflb_cartaz, AV181Gestionlaboratorio_enviodeensayoacliente_wcds_17_tflb_cartaz_sel, AV182Gestionlaboratorio_enviodeensayoacliente_wcds_18_tflb_fechae, AV183Gestionlaboratorio_enviodeensayoacliente_wcds_19_tflb_fechaen, Integer.valueOf(AV6Clicod), lV59Lb_Cartaz, lV60Lb_ColNom, Integer.valueOf(AV65Lb_numero), AV62Lb_FechaEfrom, AV64Lb_FechaEto});
      GRID_nRecordCount = H01TR3_AGRID_nRecordCount[0] ;
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
      AV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext = AV41FilterFullText ;
      AV166Gestionlaboratorio_enviodeensayoacliente_wcds_2_tflb_numero = AV122TFLb_numero ;
      AV167Gestionlaboratorio_enviodeensayoacliente_wcds_3_tflb_numero_to = AV123TFLb_numero_To ;
      AV168Gestionlaboratorio_enviodeensayoacliente_wcds_4_tfclicod = AV80TFCliCod ;
      AV169Gestionlaboratorio_enviodeensayoacliente_wcds_5_tfclicod_to = AV81TFCliCod_To ;
      AV170Gestionlaboratorio_enviodeensayoacliente_wcds_6_tflb_artcod = AV86TFLb_ArtCod ;
      AV171Gestionlaboratorio_enviodeensayoacliente_wcds_7_tflb_artcod_sel = AV87TFLb_ArtCod_Sel ;
      AV172Gestionlaboratorio_enviodeensayoacliente_wcds_8_tflb_colnomc = AV90TFLb_ColNomC ;
      AV173Gestionlaboratorio_enviodeensayoacliente_wcds_9_tflb_colnomc_sel = AV91TFLb_ColNomC_Sel ;
      AV174Gestionlaboratorio_enviodeensayoacliente_wcds_10_tflb_rb = AV138TFLb_Rb ;
      AV175Gestionlaboratorio_enviodeensayoacliente_wcds_11_tflb_rb_to = AV139TFLb_Rb_To ;
      AV176Gestionlaboratorio_enviodeensayoacliente_wcds_12_tflb_opcion = AV130TFLb_opcion ;
      AV177Gestionlaboratorio_enviodeensayoacliente_wcds_13_tflb_opcion_sel = AV131TFLb_opcion_Sel ;
      AV178Gestionlaboratorio_enviodeensayoacliente_wcds_14_tflb_numop = AV124TFLb_numop ;
      AV179Gestionlaboratorio_enviodeensayoacliente_wcds_15_tflb_numop_to = AV125TFLb_numop_To ;
      AV180Gestionlaboratorio_enviodeensayoacliente_wcds_16_tflb_cartaz = AV88TFLb_Cartaz ;
      AV181Gestionlaboratorio_enviodeensayoacliente_wcds_17_tflb_cartaz_sel = AV89TFLb_Cartaz_Sel ;
      AV182Gestionlaboratorio_enviodeensayoacliente_wcds_18_tflb_fechae = AV102TFLb_FechaE ;
      AV183Gestionlaboratorio_enviodeensayoacliente_wcds_19_tflb_fechaen = AV104TFLb_FechaEn ;
      AV184Gestionlaboratorio_enviodeensayoacliente_wcds_20_tflb_estado_sels = AV97TFLb_Estado_Sels ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV41FilterFullText, AV36Emprcod, AV6Clicod, AV59Lb_Cartaz, AV60Lb_ColNom, AV65Lb_numero, AV62Lb_FechaEfrom, AV64Lb_FechaEto, AV61Lb_estado, AV69ManageFiltersExecutionStep, AV10ColumnsSelector, AV122TFLb_numero, AV123TFLb_numero_To, AV80TFCliCod, AV81TFCliCod_To, AV86TFLb_ArtCod, AV87TFLb_ArtCod_Sel, AV90TFLb_ColNomC, AV91TFLb_ColNomC_Sel, AV138TFLb_Rb, AV139TFLb_Rb_To, AV130TFLb_opcion, AV131TFLb_opcion_Sel, AV124TFLb_numop, AV125TFLb_numop_To, AV88TFLb_Cartaz, AV89TFLb_Cartaz_Sel, AV102TFLb_FechaE, AV104TFLb_FechaEn, AV97TFLb_Estado_Sels, AV164Pgmname, AV73OrderedBy, AV75OrderedDsc, AV63Lb_fechaEn, AV39F_Cformu, AV43ForUltUti, AV42Fornumcol, Gx_msg, AV8Col_Lb_numero, AV9Col_Lb_opcion, AV144Col_Lb_numeroE, AV145Col_Lb_opcionE, AV13coste, AV71Moda21, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext = AV41FilterFullText ;
      AV166Gestionlaboratorio_enviodeensayoacliente_wcds_2_tflb_numero = AV122TFLb_numero ;
      AV167Gestionlaboratorio_enviodeensayoacliente_wcds_3_tflb_numero_to = AV123TFLb_numero_To ;
      AV168Gestionlaboratorio_enviodeensayoacliente_wcds_4_tfclicod = AV80TFCliCod ;
      AV169Gestionlaboratorio_enviodeensayoacliente_wcds_5_tfclicod_to = AV81TFCliCod_To ;
      AV170Gestionlaboratorio_enviodeensayoacliente_wcds_6_tflb_artcod = AV86TFLb_ArtCod ;
      AV171Gestionlaboratorio_enviodeensayoacliente_wcds_7_tflb_artcod_sel = AV87TFLb_ArtCod_Sel ;
      AV172Gestionlaboratorio_enviodeensayoacliente_wcds_8_tflb_colnomc = AV90TFLb_ColNomC ;
      AV173Gestionlaboratorio_enviodeensayoacliente_wcds_9_tflb_colnomc_sel = AV91TFLb_ColNomC_Sel ;
      AV174Gestionlaboratorio_enviodeensayoacliente_wcds_10_tflb_rb = AV138TFLb_Rb ;
      AV175Gestionlaboratorio_enviodeensayoacliente_wcds_11_tflb_rb_to = AV139TFLb_Rb_To ;
      AV176Gestionlaboratorio_enviodeensayoacliente_wcds_12_tflb_opcion = AV130TFLb_opcion ;
      AV177Gestionlaboratorio_enviodeensayoacliente_wcds_13_tflb_opcion_sel = AV131TFLb_opcion_Sel ;
      AV178Gestionlaboratorio_enviodeensayoacliente_wcds_14_tflb_numop = AV124TFLb_numop ;
      AV179Gestionlaboratorio_enviodeensayoacliente_wcds_15_tflb_numop_to = AV125TFLb_numop_To ;
      AV180Gestionlaboratorio_enviodeensayoacliente_wcds_16_tflb_cartaz = AV88TFLb_Cartaz ;
      AV181Gestionlaboratorio_enviodeensayoacliente_wcds_17_tflb_cartaz_sel = AV89TFLb_Cartaz_Sel ;
      AV182Gestionlaboratorio_enviodeensayoacliente_wcds_18_tflb_fechae = AV102TFLb_FechaE ;
      AV183Gestionlaboratorio_enviodeensayoacliente_wcds_19_tflb_fechaen = AV104TFLb_FechaEn ;
      AV184Gestionlaboratorio_enviodeensayoacliente_wcds_20_tflb_estado_sels = AV97TFLb_Estado_Sels ;
      GRID_nRecordCount = subgrid_fnc_recordcount( ) ;
      if ( ( GRID_nRecordCount >= subgrid_fnc_recordsperpage( ) ) && ( GRID_nEOF == 0 ) )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV41FilterFullText, AV36Emprcod, AV6Clicod, AV59Lb_Cartaz, AV60Lb_ColNom, AV65Lb_numero, AV62Lb_FechaEfrom, AV64Lb_FechaEto, AV61Lb_estado, AV69ManageFiltersExecutionStep, AV10ColumnsSelector, AV122TFLb_numero, AV123TFLb_numero_To, AV80TFCliCod, AV81TFCliCod_To, AV86TFLb_ArtCod, AV87TFLb_ArtCod_Sel, AV90TFLb_ColNomC, AV91TFLb_ColNomC_Sel, AV138TFLb_Rb, AV139TFLb_Rb_To, AV130TFLb_opcion, AV131TFLb_opcion_Sel, AV124TFLb_numop, AV125TFLb_numop_To, AV88TFLb_Cartaz, AV89TFLb_Cartaz_Sel, AV102TFLb_FechaE, AV104TFLb_FechaEn, AV97TFLb_Estado_Sels, AV164Pgmname, AV73OrderedBy, AV75OrderedDsc, AV63Lb_fechaEn, AV39F_Cformu, AV43ForUltUti, AV42Fornumcol, Gx_msg, AV8Col_Lb_numero, AV9Col_Lb_opcion, AV144Col_Lb_numeroE, AV145Col_Lb_opcionE, AV13coste, AV71Moda21, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext = AV41FilterFullText ;
      AV166Gestionlaboratorio_enviodeensayoacliente_wcds_2_tflb_numero = AV122TFLb_numero ;
      AV167Gestionlaboratorio_enviodeensayoacliente_wcds_3_tflb_numero_to = AV123TFLb_numero_To ;
      AV168Gestionlaboratorio_enviodeensayoacliente_wcds_4_tfclicod = AV80TFCliCod ;
      AV169Gestionlaboratorio_enviodeensayoacliente_wcds_5_tfclicod_to = AV81TFCliCod_To ;
      AV170Gestionlaboratorio_enviodeensayoacliente_wcds_6_tflb_artcod = AV86TFLb_ArtCod ;
      AV171Gestionlaboratorio_enviodeensayoacliente_wcds_7_tflb_artcod_sel = AV87TFLb_ArtCod_Sel ;
      AV172Gestionlaboratorio_enviodeensayoacliente_wcds_8_tflb_colnomc = AV90TFLb_ColNomC ;
      AV173Gestionlaboratorio_enviodeensayoacliente_wcds_9_tflb_colnomc_sel = AV91TFLb_ColNomC_Sel ;
      AV174Gestionlaboratorio_enviodeensayoacliente_wcds_10_tflb_rb = AV138TFLb_Rb ;
      AV175Gestionlaboratorio_enviodeensayoacliente_wcds_11_tflb_rb_to = AV139TFLb_Rb_To ;
      AV176Gestionlaboratorio_enviodeensayoacliente_wcds_12_tflb_opcion = AV130TFLb_opcion ;
      AV177Gestionlaboratorio_enviodeensayoacliente_wcds_13_tflb_opcion_sel = AV131TFLb_opcion_Sel ;
      AV178Gestionlaboratorio_enviodeensayoacliente_wcds_14_tflb_numop = AV124TFLb_numop ;
      AV179Gestionlaboratorio_enviodeensayoacliente_wcds_15_tflb_numop_to = AV125TFLb_numop_To ;
      AV180Gestionlaboratorio_enviodeensayoacliente_wcds_16_tflb_cartaz = AV88TFLb_Cartaz ;
      AV181Gestionlaboratorio_enviodeensayoacliente_wcds_17_tflb_cartaz_sel = AV89TFLb_Cartaz_Sel ;
      AV182Gestionlaboratorio_enviodeensayoacliente_wcds_18_tflb_fechae = AV102TFLb_FechaE ;
      AV183Gestionlaboratorio_enviodeensayoacliente_wcds_19_tflb_fechaen = AV104TFLb_FechaEn ;
      AV184Gestionlaboratorio_enviodeensayoacliente_wcds_20_tflb_estado_sels = AV97TFLb_Estado_Sels ;
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
         gxgrgrid_refresh( subGrid_Rows, AV41FilterFullText, AV36Emprcod, AV6Clicod, AV59Lb_Cartaz, AV60Lb_ColNom, AV65Lb_numero, AV62Lb_FechaEfrom, AV64Lb_FechaEto, AV61Lb_estado, AV69ManageFiltersExecutionStep, AV10ColumnsSelector, AV122TFLb_numero, AV123TFLb_numero_To, AV80TFCliCod, AV81TFCliCod_To, AV86TFLb_ArtCod, AV87TFLb_ArtCod_Sel, AV90TFLb_ColNomC, AV91TFLb_ColNomC_Sel, AV138TFLb_Rb, AV139TFLb_Rb_To, AV130TFLb_opcion, AV131TFLb_opcion_Sel, AV124TFLb_numop, AV125TFLb_numop_To, AV88TFLb_Cartaz, AV89TFLb_Cartaz_Sel, AV102TFLb_FechaE, AV104TFLb_FechaEn, AV97TFLb_Estado_Sels, AV164Pgmname, AV73OrderedBy, AV75OrderedDsc, AV63Lb_fechaEn, AV39F_Cformu, AV43ForUltUti, AV42Fornumcol, Gx_msg, AV8Col_Lb_numero, AV9Col_Lb_opcion, AV144Col_Lb_numeroE, AV145Col_Lb_opcionE, AV13coste, AV71Moda21, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext = AV41FilterFullText ;
      AV166Gestionlaboratorio_enviodeensayoacliente_wcds_2_tflb_numero = AV122TFLb_numero ;
      AV167Gestionlaboratorio_enviodeensayoacliente_wcds_3_tflb_numero_to = AV123TFLb_numero_To ;
      AV168Gestionlaboratorio_enviodeensayoacliente_wcds_4_tfclicod = AV80TFCliCod ;
      AV169Gestionlaboratorio_enviodeensayoacliente_wcds_5_tfclicod_to = AV81TFCliCod_To ;
      AV170Gestionlaboratorio_enviodeensayoacliente_wcds_6_tflb_artcod = AV86TFLb_ArtCod ;
      AV171Gestionlaboratorio_enviodeensayoacliente_wcds_7_tflb_artcod_sel = AV87TFLb_ArtCod_Sel ;
      AV172Gestionlaboratorio_enviodeensayoacliente_wcds_8_tflb_colnomc = AV90TFLb_ColNomC ;
      AV173Gestionlaboratorio_enviodeensayoacliente_wcds_9_tflb_colnomc_sel = AV91TFLb_ColNomC_Sel ;
      AV174Gestionlaboratorio_enviodeensayoacliente_wcds_10_tflb_rb = AV138TFLb_Rb ;
      AV175Gestionlaboratorio_enviodeensayoacliente_wcds_11_tflb_rb_to = AV139TFLb_Rb_To ;
      AV176Gestionlaboratorio_enviodeensayoacliente_wcds_12_tflb_opcion = AV130TFLb_opcion ;
      AV177Gestionlaboratorio_enviodeensayoacliente_wcds_13_tflb_opcion_sel = AV131TFLb_opcion_Sel ;
      AV178Gestionlaboratorio_enviodeensayoacliente_wcds_14_tflb_numop = AV124TFLb_numop ;
      AV179Gestionlaboratorio_enviodeensayoacliente_wcds_15_tflb_numop_to = AV125TFLb_numop_To ;
      AV180Gestionlaboratorio_enviodeensayoacliente_wcds_16_tflb_cartaz = AV88TFLb_Cartaz ;
      AV181Gestionlaboratorio_enviodeensayoacliente_wcds_17_tflb_cartaz_sel = AV89TFLb_Cartaz_Sel ;
      AV182Gestionlaboratorio_enviodeensayoacliente_wcds_18_tflb_fechae = AV102TFLb_FechaE ;
      AV183Gestionlaboratorio_enviodeensayoacliente_wcds_19_tflb_fechaen = AV104TFLb_FechaEn ;
      AV184Gestionlaboratorio_enviodeensayoacliente_wcds_20_tflb_estado_sels = AV97TFLb_Estado_Sels ;
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
         gxgrgrid_refresh( subGrid_Rows, AV41FilterFullText, AV36Emprcod, AV6Clicod, AV59Lb_Cartaz, AV60Lb_ColNom, AV65Lb_numero, AV62Lb_FechaEfrom, AV64Lb_FechaEto, AV61Lb_estado, AV69ManageFiltersExecutionStep, AV10ColumnsSelector, AV122TFLb_numero, AV123TFLb_numero_To, AV80TFCliCod, AV81TFCliCod_To, AV86TFLb_ArtCod, AV87TFLb_ArtCod_Sel, AV90TFLb_ColNomC, AV91TFLb_ColNomC_Sel, AV138TFLb_Rb, AV139TFLb_Rb_To, AV130TFLb_opcion, AV131TFLb_opcion_Sel, AV124TFLb_numop, AV125TFLb_numop_To, AV88TFLb_Cartaz, AV89TFLb_Cartaz_Sel, AV102TFLb_FechaE, AV104TFLb_FechaEn, AV97TFLb_Estado_Sels, AV164Pgmname, AV73OrderedBy, AV75OrderedDsc, AV63Lb_fechaEn, AV39F_Cformu, AV43ForUltUti, AV42Fornumcol, Gx_msg, AV8Col_Lb_numero, AV9Col_Lb_opcion, AV144Col_Lb_numeroE, AV145Col_Lb_opcionE, AV13coste, AV71Moda21, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext = AV41FilterFullText ;
      AV166Gestionlaboratorio_enviodeensayoacliente_wcds_2_tflb_numero = AV122TFLb_numero ;
      AV167Gestionlaboratorio_enviodeensayoacliente_wcds_3_tflb_numero_to = AV123TFLb_numero_To ;
      AV168Gestionlaboratorio_enviodeensayoacliente_wcds_4_tfclicod = AV80TFCliCod ;
      AV169Gestionlaboratorio_enviodeensayoacliente_wcds_5_tfclicod_to = AV81TFCliCod_To ;
      AV170Gestionlaboratorio_enviodeensayoacliente_wcds_6_tflb_artcod = AV86TFLb_ArtCod ;
      AV171Gestionlaboratorio_enviodeensayoacliente_wcds_7_tflb_artcod_sel = AV87TFLb_ArtCod_Sel ;
      AV172Gestionlaboratorio_enviodeensayoacliente_wcds_8_tflb_colnomc = AV90TFLb_ColNomC ;
      AV173Gestionlaboratorio_enviodeensayoacliente_wcds_9_tflb_colnomc_sel = AV91TFLb_ColNomC_Sel ;
      AV174Gestionlaboratorio_enviodeensayoacliente_wcds_10_tflb_rb = AV138TFLb_Rb ;
      AV175Gestionlaboratorio_enviodeensayoacliente_wcds_11_tflb_rb_to = AV139TFLb_Rb_To ;
      AV176Gestionlaboratorio_enviodeensayoacliente_wcds_12_tflb_opcion = AV130TFLb_opcion ;
      AV177Gestionlaboratorio_enviodeensayoacliente_wcds_13_tflb_opcion_sel = AV131TFLb_opcion_Sel ;
      AV178Gestionlaboratorio_enviodeensayoacliente_wcds_14_tflb_numop = AV124TFLb_numop ;
      AV179Gestionlaboratorio_enviodeensayoacliente_wcds_15_tflb_numop_to = AV125TFLb_numop_To ;
      AV180Gestionlaboratorio_enviodeensayoacliente_wcds_16_tflb_cartaz = AV88TFLb_Cartaz ;
      AV181Gestionlaboratorio_enviodeensayoacliente_wcds_17_tflb_cartaz_sel = AV89TFLb_Cartaz_Sel ;
      AV182Gestionlaboratorio_enviodeensayoacliente_wcds_18_tflb_fechae = AV102TFLb_FechaE ;
      AV183Gestionlaboratorio_enviodeensayoacliente_wcds_19_tflb_fechaen = AV104TFLb_FechaEn ;
      AV184Gestionlaboratorio_enviodeensayoacliente_wcds_20_tflb_estado_sels = AV97TFLb_Estado_Sels ;
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
         gxgrgrid_refresh( subGrid_Rows, AV41FilterFullText, AV36Emprcod, AV6Clicod, AV59Lb_Cartaz, AV60Lb_ColNom, AV65Lb_numero, AV62Lb_FechaEfrom, AV64Lb_FechaEto, AV61Lb_estado, AV69ManageFiltersExecutionStep, AV10ColumnsSelector, AV122TFLb_numero, AV123TFLb_numero_To, AV80TFCliCod, AV81TFCliCod_To, AV86TFLb_ArtCod, AV87TFLb_ArtCod_Sel, AV90TFLb_ColNomC, AV91TFLb_ColNomC_Sel, AV138TFLb_Rb, AV139TFLb_Rb_To, AV130TFLb_opcion, AV131TFLb_opcion_Sel, AV124TFLb_numop, AV125TFLb_numop_To, AV88TFLb_Cartaz, AV89TFLb_Cartaz_Sel, AV102TFLb_FechaE, AV104TFLb_FechaEn, AV97TFLb_Estado_Sels, AV164Pgmname, AV73OrderedBy, AV75OrderedDsc, AV63Lb_fechaEn, AV39F_Cformu, AV43ForUltUti, AV42Fornumcol, Gx_msg, AV8Col_Lb_numero, AV9Col_Lb_opcion, AV144Col_Lb_numeroE, AV145Col_Lb_opcionE, AV13coste, AV71Moda21, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV164Pgmname = "GestionLaboratorio.EnviodeEnsayoaCliente_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV164Pgmname", AV164Pgmname);
      Gx_err = (short)(0) ;
      edtavObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavObs_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtavF_cformu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavF_cformu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavF_cformu_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1TR0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e291TR2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV68ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV34DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV10ColumnsSelector);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOL_LB_OPCIONE"), AV145Col_Lb_opcionE);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOL_LB_NUMEROE"), AV144Col_Lb_numeroE);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOL_LB_OPCION"), AV9Col_Lb_opcion);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOL_LB_NUMERO"), AV8Col_Lb_numero);
         /* Read saved values. */
         nRC_GXsfl_80 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_80"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV45GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV46GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV36Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV36Emprcod") ;
         wcpOAV6Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV6Clicod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV59Lb_Cartaz = httpContext.cgiGet( sPrefix+"wcpOAV59Lb_Cartaz") ;
         wcpOAV60Lb_ColNom = httpContext.cgiGet( sPrefix+"wcpOAV60Lb_ColNom") ;
         wcpOAV65Lb_numero = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV65Lb_numero"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV62Lb_FechaEfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV62Lb_FechaEfrom"), 0) ;
         wcpOAV64Lb_FechaEto = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV64Lb_FechaEto"), 0) ;
         wcpOAV63Lb_fechaEn = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV63Lb_fechaEn"), 0) ;
         wcpOAV61Lb_estado = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV61Lb_estado"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV51i = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV63Lb_fechaEn = localUtil.ctod( httpContext.cgiGet( sPrefix+"vLB_FECHAEN"), 0) ;
         Gx_msg = httpContext.cgiGet( sPrefix+"vMSG") ;
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
         Dvpanel_unnamedtable3_Width = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE3_Width") ;
         Dvpanel_unnamedtable3_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE3_Autowidth")) ;
         Dvpanel_unnamedtable3_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE3_Autoheight")) ;
         Dvpanel_unnamedtable3_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE3_Cls") ;
         Dvpanel_unnamedtable3_Title = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE3_Title") ;
         Dvpanel_unnamedtable3_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE3_Collapsible")) ;
         Dvpanel_unnamedtable3_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE3_Collapsed")) ;
         Dvpanel_unnamedtable3_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE3_Showcollapseicon")) ;
         Dvpanel_unnamedtable3_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE3_Iconposition") ;
         Dvpanel_unnamedtable3_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE3_Autoscroll")) ;
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
         Dvelop_confirmpanel_enviar_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ENVIAR_Title") ;
         Dvelop_confirmpanel_enviar_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ENVIAR_Confirmationtext") ;
         Dvelop_confirmpanel_enviar_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ENVIAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_enviar_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ENVIAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_enviar_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ENVIAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_enviar_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ENVIAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_enviar_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ENVIAR_Confirmtype") ;
         Dvelop_confirmpanel_eliminar_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Title") ;
         Dvelop_confirmpanel_eliminar_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Confirmationtext") ;
         Dvelop_confirmpanel_eliminar_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_eliminar_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Confirmtype") ;
         Dvelop_confirmpanel_envioopciona_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ENVIOOPCIONA_Title") ;
         Dvelop_confirmpanel_envioopciona_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ENVIOOPCIONA_Confirmationtext") ;
         Dvelop_confirmpanel_envioopciona_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ENVIOOPCIONA_Yesbuttoncaption") ;
         Dvelop_confirmpanel_envioopciona_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ENVIOOPCIONA_Nobuttoncaption") ;
         Dvelop_confirmpanel_envioopciona_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ENVIOOPCIONA_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_envioopciona_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ENVIOOPCIONA_Yesbuttonposition") ;
         Dvelop_confirmpanel_envioopciona_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ENVIOOPCIONA_Confirmtype") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
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
         Dvelop_confirmpanel_enviar_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ENVIAR_Result") ;
         Dvelop_confirmpanel_eliminar_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Result") ;
         Dvelop_confirmpanel_envioopciona_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ENVIOOPCIONA_Result") ;
         /* Read variables values. */
         AV41FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41FilterFullText", AV41FilterFullText);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavLb_rb_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavLb_rb_Internalname)), DecimalUtil.stringToDec("9999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vLB_RB");
            GX_FocusControl = edtavLb_rb_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV67Lb_Rb = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67Lb_Rb", GXutil.ltrimstr( AV67Lb_Rb, 7, 2));
         }
         else
         {
            AV67Lb_Rb = localUtil.ctond( httpContext.cgiGet( edtavLb_rb_Internalname)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67Lb_Rb", GXutil.ltrimstr( AV67Lb_Rb, 7, 2));
         }
         AV164Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV164Pgmname", AV164Pgmname);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_lb_fechaeauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_LB_FECHAEAUXDATE");
            GX_FocusControl = edtavDdo_lb_fechaeauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV16DDO_Lb_FechaEAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16DDO_Lb_FechaEAuxDate", localUtil.format(AV16DDO_Lb_FechaEAuxDate, "99/99/99"));
         }
         else
         {
            AV16DDO_Lb_FechaEAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_lb_fechaeauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16DDO_Lb_FechaEAuxDate", localUtil.format(AV16DDO_Lb_FechaEAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_lb_fechaenauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_LB_FECHAENAUXDATE");
            GX_FocusControl = edtavDdo_lb_fechaenauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV18DDO_Lb_FechaEnAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18DDO_Lb_FechaEnAuxDate", localUtil.format(AV18DDO_Lb_FechaEnAuxDate, "99/99/99"));
         }
         else
         {
            AV18DDO_Lb_FechaEnAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_lb_fechaenauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18DDO_Lb_FechaEnAuxDate", localUtil.format(AV18DDO_Lb_FechaEnAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"EnviodeEnsayoaCliente_WC");
         AV164Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV164Pgmname", AV164Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV164Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("gestionlaboratorio\\enviodeensayoacliente_wc:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV41FilterFullText) != 0 )
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
      e291TR2 ();
      if (returnInSub) return;
   }

   public void e291TR2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_int1 = (byte)(AV71Moda21) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV36Emprcod, httpContext.getMessage( "MODA21", ""), GXv_int2) ;
      enviodeensayoacliente_wc_impl.this.GXt_int1 = GXv_int2[0] ;
      AV71Moda21 = GXt_int1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71Moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71Moda21), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV71Moda21), "ZZZ9")));
      GXt_char3 = AV159Station ;
      GXv_char4[0] = GXt_char3 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      enviodeensayoacliente_wc_impl.this.GXt_char3 = GXv_char4[0] ;
      AV159Station = GXt_char3 ;
      GXv_char4[0] = AV36Emprcod ;
      GXv_char5[0] = AV160EmprNom ;
      GXv_char6[0] = AV161UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV159Station, GXv_char4, GXv_char5, GXv_char6) ;
      enviodeensayoacliente_wc_impl.this.AV36Emprcod = GXv_char4[0] ;
      enviodeensayoacliente_wc_impl.this.AV160EmprNom = GXv_char5[0] ;
      enviodeensayoacliente_wc_impl.this.AV161UsurCod = GXv_char6[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36Emprcod", AV36Emprcod);
      divUnnamedtable2_Height = 10 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, divUnnamedtable2_Internalname, "Height", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable2_Height), 9, 0), true);
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
      if ( AV73OrderedBy < 1 )
      {
         AV73OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = AV34DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] ;
      AV34DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e301TR2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext9[0] = AV143WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV143WWPContext = GXv_SdtWWPContext9[0] ;
      /* Execute user subroutine: 'CHECKSECURITYFORACTIONS' */
      S152 ();
      if (returnInSub) return;
      if ( AV69ManageFiltersExecutionStep == 1 )
      {
         AV69ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69ManageFiltersExecutionStep", GXutil.str( AV69ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV69ManageFiltersExecutionStep == 2 )
      {
         AV69ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69ManageFiltersExecutionStep", GXutil.str( AV69ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S162 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV79Session.getValue("GestionLaboratorio.EnviodeEnsayoaCliente_WCColumnsSelector"), "") != 0 )
      {
         AV12ColumnsSelectorXML = AV79Session.getValue("GestionLaboratorio.EnviodeEnsayoaCliente_WCColumnsSelector") ;
         AV10ColumnsSelector.fromxml(AV12ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S172 ();
         if (returnInSub) return;
      }
      chkavSeleccionar.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSeleccionar.getInternalname(), "Visible", GXutil.ltrimstr( chkavSeleccionar.getVisible(), 5, 0), !bGXsfl_80_Refreshing);
      edtLb_numero_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_numero_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_numero_Visible), 5, 0), !bGXsfl_80_Refreshing);
      edtCliCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Visible), 5, 0), !bGXsfl_80_Refreshing);
      edtLb_ArtCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_ArtCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_ArtCod_Visible), 5, 0), !bGXsfl_80_Refreshing);
      edtLb_ColNomC_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_ColNomC_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_ColNomC_Visible), 5, 0), !bGXsfl_80_Refreshing);
      edtLb_Rb_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_Rb_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_Rb_Visible), 5, 0), !bGXsfl_80_Refreshing);
      edtLb_opcion_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_opcion_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_opcion_Visible), 5, 0), !bGXsfl_80_Refreshing);
      edtLb_numop_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_numop_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_numop_Visible), 5, 0), !bGXsfl_80_Refreshing);
      edtLb_Cartaz_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_Cartaz_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_Cartaz_Visible), 5, 0), !bGXsfl_80_Refreshing);
      edtLb_FechaE_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_FechaE_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_FechaE_Visible), 5, 0), !bGXsfl_80_Refreshing);
      edtLb_FechaEn_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_FechaEn_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_FechaEn_Visible), 5, 0), !bGXsfl_80_Refreshing);
      cmbLb_Estado.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbLb_Estado.getInternalname(), "Visible", GXutil.ltrimstr( cmbLb_Estado.getVisible(), 5, 0), !bGXsfl_80_Refreshing);
      chkavSeleccionareliminar.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSeleccionareliminar.getInternalname(), "Visible", GXutil.ltrimstr( chkavSeleccionareliminar.getVisible(), 5, 0), !bGXsfl_80_Refreshing);
      AV45GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45GridCurrentPage), 10, 0));
      AV46GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46GridPageCount), 10, 0));
      chkavSeleccionar.setColumnHeaderClass( "WWColumn" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSeleccionar.getInternalname(), "Columnheaderclass", chkavSeleccionar.getColumnHeaderClass(), !bGXsfl_80_Refreshing);
      edtLb_numero_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_numero_Internalname, "Columnheaderclass", edtLb_numero_Columnheaderclass, !bGXsfl_80_Refreshing);
      edtCliCod_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliCod_Internalname, "Columnheaderclass", edtCliCod_Columnheaderclass, !bGXsfl_80_Refreshing);
      edtLb_ArtCod_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_ArtCod_Internalname, "Columnheaderclass", edtLb_ArtCod_Columnheaderclass, !bGXsfl_80_Refreshing);
      edtLb_ColNomC_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_ColNomC_Internalname, "Columnheaderclass", edtLb_ColNomC_Columnheaderclass, !bGXsfl_80_Refreshing);
      edtLb_Rb_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_Rb_Internalname, "Columnheaderclass", edtLb_Rb_Columnheaderclass, !bGXsfl_80_Refreshing);
      edtLb_opcion_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_opcion_Internalname, "Columnheaderclass", edtLb_opcion_Columnheaderclass, !bGXsfl_80_Refreshing);
      edtLb_numop_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_numop_Internalname, "Columnheaderclass", edtLb_numop_Columnheaderclass, !bGXsfl_80_Refreshing);
      edtLb_Cartaz_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_Cartaz_Internalname, "Columnheaderclass", edtLb_Cartaz_Columnheaderclass, !bGXsfl_80_Refreshing);
      edtLb_FechaE_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_FechaE_Internalname, "Columnheaderclass", edtLb_FechaE_Columnheaderclass, !bGXsfl_80_Refreshing);
      edtLb_FechaEn_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_FechaEn_Internalname, "Columnheaderclass", edtLb_FechaEn_Columnheaderclass, !bGXsfl_80_Refreshing);
      cmbLb_Estado.setColumnHeaderClass( "WWColumn hidden-xs" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbLb_Estado.getInternalname(), "Columnheaderclass", cmbLb_Estado.getColumnHeaderClass(), !bGXsfl_80_Refreshing);
      chkavSeleccionareliminar.setColumnHeaderClass( "WWColumn" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSeleccionareliminar.getInternalname(), "Columnheaderclass", chkavSeleccionareliminar.getColumnHeaderClass(), !bGXsfl_80_Refreshing);
      AV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext = AV41FilterFullText ;
      AV166Gestionlaboratorio_enviodeensayoacliente_wcds_2_tflb_numero = AV122TFLb_numero ;
      AV167Gestionlaboratorio_enviodeensayoacliente_wcds_3_tflb_numero_to = AV123TFLb_numero_To ;
      AV168Gestionlaboratorio_enviodeensayoacliente_wcds_4_tfclicod = AV80TFCliCod ;
      AV169Gestionlaboratorio_enviodeensayoacliente_wcds_5_tfclicod_to = AV81TFCliCod_To ;
      AV170Gestionlaboratorio_enviodeensayoacliente_wcds_6_tflb_artcod = AV86TFLb_ArtCod ;
      AV171Gestionlaboratorio_enviodeensayoacliente_wcds_7_tflb_artcod_sel = AV87TFLb_ArtCod_Sel ;
      AV172Gestionlaboratorio_enviodeensayoacliente_wcds_8_tflb_colnomc = AV90TFLb_ColNomC ;
      AV173Gestionlaboratorio_enviodeensayoacliente_wcds_9_tflb_colnomc_sel = AV91TFLb_ColNomC_Sel ;
      AV174Gestionlaboratorio_enviodeensayoacliente_wcds_10_tflb_rb = AV138TFLb_Rb ;
      AV175Gestionlaboratorio_enviodeensayoacliente_wcds_11_tflb_rb_to = AV139TFLb_Rb_To ;
      AV176Gestionlaboratorio_enviodeensayoacliente_wcds_12_tflb_opcion = AV130TFLb_opcion ;
      AV177Gestionlaboratorio_enviodeensayoacliente_wcds_13_tflb_opcion_sel = AV131TFLb_opcion_Sel ;
      AV178Gestionlaboratorio_enviodeensayoacliente_wcds_14_tflb_numop = AV124TFLb_numop ;
      AV179Gestionlaboratorio_enviodeensayoacliente_wcds_15_tflb_numop_to = AV125TFLb_numop_To ;
      AV180Gestionlaboratorio_enviodeensayoacliente_wcds_16_tflb_cartaz = AV88TFLb_Cartaz ;
      AV181Gestionlaboratorio_enviodeensayoacliente_wcds_17_tflb_cartaz_sel = AV89TFLb_Cartaz_Sel ;
      AV182Gestionlaboratorio_enviodeensayoacliente_wcds_18_tflb_fechae = AV102TFLb_FechaE ;
      AV183Gestionlaboratorio_enviodeensayoacliente_wcds_19_tflb_fechaen = AV104TFLb_FechaEn ;
      AV184Gestionlaboratorio_enviodeensayoacliente_wcds_20_tflb_estado_sels = AV97TFLb_Estado_Sels ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10ColumnsSelector", AV10ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV68ManageFiltersData", AV68ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV47GridState", AV47GridState);
   }

   public void e141TR2( )
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
         AV76PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV76PageToGo) ;
      }
   }

   public void e151TR2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e161TR2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV73OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73OrderedBy), 4, 0));
         AV75OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75OrderedDsc", AV75OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_numero") == 0 )
         {
            AV122TFLb_numero = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV122TFLb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV122TFLb_numero), 8, 0));
            AV123TFLb_numero_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV123TFLb_numero_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV123TFLb_numero_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliCod") == 0 )
         {
            AV80TFCliCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80TFCliCod), 6, 0));
            AV81TFCliCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_ArtCod") == 0 )
         {
            AV86TFLb_ArtCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV86TFLb_ArtCod", AV86TFLb_ArtCod);
            AV87TFLb_ArtCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV87TFLb_ArtCod_Sel", AV87TFLb_ArtCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_ColNomC") == 0 )
         {
            AV90TFLb_ColNomC = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90TFLb_ColNomC", AV90TFLb_ColNomC);
            AV91TFLb_ColNomC_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91TFLb_ColNomC_Sel", AV91TFLb_ColNomC_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_Rb") == 0 )
         {
            AV138TFLb_Rb = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV138TFLb_Rb", GXutil.ltrimstr( AV138TFLb_Rb, 7, 2));
            AV139TFLb_Rb_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV139TFLb_Rb_To", GXutil.ltrimstr( AV139TFLb_Rb_To, 7, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_opcion") == 0 )
         {
            AV130TFLb_opcion = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV130TFLb_opcion", AV130TFLb_opcion);
            AV131TFLb_opcion_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV131TFLb_opcion_Sel", AV131TFLb_opcion_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_numop") == 0 )
         {
            AV124TFLb_numop = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV124TFLb_numop", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV124TFLb_numop), 2, 0));
            AV125TFLb_numop_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV125TFLb_numop_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV125TFLb_numop_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_Cartaz") == 0 )
         {
            AV88TFLb_Cartaz = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88TFLb_Cartaz", AV88TFLb_Cartaz);
            AV89TFLb_Cartaz_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89TFLb_Cartaz_Sel", AV89TFLb_Cartaz_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_FechaE") == 0 )
         {
            AV102TFLb_FechaE = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV102TFLb_FechaE", localUtil.format(AV102TFLb_FechaE, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_FechaEn") == 0 )
         {
            AV104TFLb_FechaEn = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV104TFLb_FechaEn", localUtil.format(AV104TFLb_FechaEn, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_Estado") == 0 )
         {
            AV98TFLb_Estado_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV98TFLb_Estado_SelsJson", AV98TFLb_Estado_SelsJson);
            AV97TFLb_Estado_Sels.fromJSonString(GXutil.strReplace( AV98TFLb_Estado_SelsJson, "\"", ""), null);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV97TFLb_Estado_Sels", AV97TFLb_Estado_Sels);
   }

   private void e311TR2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      GXt_char3 = AV72Obs ;
      GXv_char6[0] = A396EmprCod ;
      GXv_int10[0] = A252CliCod ;
      GXv_char5[0] = A5533Lb_ArtCod ;
      GXv_char4[0] = A5536Lb_ColNom ;
      GXv_int11[0] = A5537Lb_ColNum ;
      GXv_int2[0] = A831TipColCod ;
      GXv_char12[0] = A5555Lb_opcion ;
      GXv_int13[0] = (byte)(AV39F_Cformu) ;
      GXv_date14[0] = AV43ForUltUti ;
      GXv_int15[0] = AV42Fornumcol ;
      GXv_char16[0] = GXt_char3 ;
      new app.pens080(remoteHandle, context).execute( GXv_char6, GXv_int10, GXv_char5, GXv_char4, GXv_int11, GXv_int2, GXv_char12, GXv_int13, GXv_date14, GXv_int15, GXv_char16) ;
      enviodeensayoacliente_wc_impl.this.A396EmprCod = GXv_char6[0] ;
      enviodeensayoacliente_wc_impl.this.A252CliCod = GXv_int10[0] ;
      enviodeensayoacliente_wc_impl.this.A5533Lb_ArtCod = GXv_char5[0] ;
      enviodeensayoacliente_wc_impl.this.A5536Lb_ColNom = GXv_char4[0] ;
      enviodeensayoacliente_wc_impl.this.A5537Lb_ColNum = GXv_int11[0] ;
      enviodeensayoacliente_wc_impl.this.A831TipColCod = GXv_int2[0] ;
      enviodeensayoacliente_wc_impl.this.A5555Lb_opcion = GXv_char12[0] ;
      enviodeensayoacliente_wc_impl.this.AV39F_Cformu = GXv_int13[0] ;
      enviodeensayoacliente_wc_impl.this.AV43ForUltUti = GXv_date14[0] ;
      enviodeensayoacliente_wc_impl.this.AV42Fornumcol = GXv_int15[0] ;
      enviodeensayoacliente_wc_impl.this.GXt_char3 = GXv_char16[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5536Lb_ColNom", A5536Lb_ColNom);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5537Lb_ColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5537Lb_ColNum), 6, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavF_cformu_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39F_Cformu), 4, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43ForUltUti", localUtil.format(AV43ForUltUti, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFORULTUTI", getSecureSignedToken( sPrefix, AV43ForUltUti));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42Fornumcol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42Fornumcol), 8, 0));
      AV72Obs = GXt_char3 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavObs_Internalname, AV72Obs);
      GXv_char16[0] = A396EmprCod ;
      GXv_int15[0] = A252CliCod ;
      GXv_char12[0] = A5533Lb_ArtCod ;
      GXv_char6[0] = A5536Lb_ColNom ;
      GXv_int11[0] = A5537Lb_ColNum ;
      GXv_int13[0] = A831TipColCod ;
      GXv_int2[0] = (byte)(AV39F_Cformu) ;
      GXv_date14[0] = AV43ForUltUti ;
      GXv_int10[0] = AV42Fornumcol ;
      GXv_char5[0] = Gx_msg ;
      new app.pens011(remoteHandle, context).execute( GXv_char16, GXv_int15, GXv_char12, GXv_char6, GXv_int11, GXv_int13, GXv_int2, GXv_date14, GXv_int10, GXv_char5) ;
      enviodeensayoacliente_wc_impl.this.A396EmprCod = GXv_char16[0] ;
      enviodeensayoacliente_wc_impl.this.A252CliCod = GXv_int15[0] ;
      enviodeensayoacliente_wc_impl.this.A5533Lb_ArtCod = GXv_char12[0] ;
      enviodeensayoacliente_wc_impl.this.A5536Lb_ColNom = GXv_char6[0] ;
      enviodeensayoacliente_wc_impl.this.A5537Lb_ColNum = GXv_int11[0] ;
      enviodeensayoacliente_wc_impl.this.A831TipColCod = GXv_int13[0] ;
      enviodeensayoacliente_wc_impl.this.AV39F_Cformu = GXv_int2[0] ;
      enviodeensayoacliente_wc_impl.this.AV43ForUltUti = GXv_date14[0] ;
      enviodeensayoacliente_wc_impl.this.AV42Fornumcol = GXv_int10[0] ;
      enviodeensayoacliente_wc_impl.this.Gx_msg = GXv_char5[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5536Lb_ColNom", A5536Lb_ColNom);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5537Lb_ColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5537Lb_ColNum), 6, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavF_cformu_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39F_Cformu), 4, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43ForUltUti", localUtil.format(AV43ForUltUti, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFORULTUTI", getSecureSignedToken( sPrefix, AV43ForUltUti));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42Fornumcol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42Fornumcol), 8, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_msg", Gx_msg);
      chkavSeleccionar.setColumnClass( ((GXutil.strcmp(AV72Obs, " ")!=0) ? "WWColumn WWColumnWarning WWColumnWarningFirstColumn" : "WWColumn") );
      edtLb_numero_Columnclass = ((GXutil.strcmp(AV72Obs, " ")!=0) ? "WWColumn WWColumnWarning hidden-xs" : "WWColumn hidden-xs") ;
      edtCliCod_Columnclass = ((GXutil.strcmp(AV72Obs, " ")!=0) ? "WWColumn WWColumnWarning" : "WWColumn") ;
      edtLb_ArtCod_Columnclass = ((GXutil.strcmp(AV72Obs, " ")!=0) ? "WWColumn WWColumnWarning" : "WWColumn") ;
      edtLb_ColNomC_Columnclass = ((GXutil.strcmp(AV72Obs, " ")!=0) ? "WWColumn WWColumnWarning" : "WWColumn") ;
      edtLb_Rb_Columnclass = ((GXutil.strcmp(AV72Obs, " ")!=0) ? "WWColumn WWColumnWarning" : "WWColumn") ;
      edtLb_opcion_Columnclass = ((GXutil.strcmp(AV72Obs, " ")!=0) ? "WWColumn WWColumnWarning hidden-xs" : "WWColumn hidden-xs") ;
      edtLb_numop_Columnclass = ((GXutil.strcmp(AV72Obs, " ")!=0) ? "WWColumn WWColumnWarning hidden-xs" : "WWColumn hidden-xs") ;
      edtLb_Cartaz_Columnclass = ((GXutil.strcmp(AV72Obs, " ")!=0) ? "WWColumn WWColumnWarning" : "WWColumn") ;
      edtLb_FechaE_Columnclass = ((GXutil.strcmp(AV72Obs, " ")!=0) ? "WWColumn WWColumnWarning" : "WWColumn") ;
      edtLb_FechaEn_Columnclass = ((GXutil.strcmp(AV72Obs, " ")!=0) ? "WWColumn WWColumnWarning" : "WWColumn") ;
      cmbLb_Estado.setColumnClass( ((GXutil.strcmp(AV72Obs, " ")!=0) ? "WWColumn WWColumnWarning hidden-xs" : "WWColumn hidden-xs") );
      chkavSeleccionareliminar.setColumnClass( ((GXutil.strcmp(AV72Obs, " ")!=0) ? "WWColumn WWColumnWarning" : "WWColumn") );
      AV77Seleccionar = false ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSeleccionar.getInternalname(), AV77Seleccionar);
      AV51i = (short)(1) ;
      while ( AV51i <= AV8Col_Lb_numero.size() )
      {
         if ( ( ((Number) AV8Col_Lb_numero.elementAt(-1+AV51i)).intValue() == A5532Lb_numero ) && ( GXutil.strcmp((String)AV9Col_Lb_opcion.elementAt(-1+AV51i), A5555Lb_opcion) == 0 ) )
         {
            AV77Seleccionar = true ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSeleccionar.getInternalname(), AV77Seleccionar);
            if (true) break;
         }
         AV51i = (short)(AV51i+1) ;
      }
      if ( (0==A5566Lb_Estado) )
      {
         chkavSeleccionareliminar.setVisible( 0 );
      }
      AV78SeleccionarEliminar = false ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSeleccionareliminar.getInternalname(), AV78SeleccionarEliminar);
      AV51i = (short)(1) ;
      while ( AV51i <= AV144Col_Lb_numeroE.size() )
      {
         if ( ( ((Number) AV144Col_Lb_numeroE.elementAt(-1+AV51i)).intValue() == A5532Lb_numero ) && ( GXutil.strcmp((String)AV145Col_Lb_opcionE.elementAt(-1+AV51i), A5555Lb_opcion) == 0 ) )
         {
            AV78SeleccionarEliminar = true ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSeleccionareliminar.getInternalname(), AV78SeleccionarEliminar);
            if (true) break;
         }
         AV51i = (short)(AV51i+1) ;
      }
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(80) ;
      }
      sendrow_802( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_80_Refreshing )
      {
         httpContext.doAjaxLoad(80, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void e171TR2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV12ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV10ColumnsSelector.fromJSonString(AV12ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "GestionLaboratorio.EnviodeEnsayoaCliente_WCColumnsSelector", ((GXutil.strcmp("", AV12ColumnsSelectorXML)==0) ? "" : AV10ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10ColumnsSelector", AV10ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV68ManageFiltersData", AV68ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV47GridState", AV47GridState);
   }

   public void e131TR2( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S182 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S162 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("GestionLaboratorio.EnviodeEnsayoaCliente_WCFilters")),GXutil.URLEncode(GXutil.rtrim(AV164Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV69ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69ManageFiltersExecutionStep", GXutil.str( AV69ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("GestionLaboratorio.EnviodeEnsayoaCliente_WCFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV69ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69ManageFiltersExecutionStep", GXutil.str( AV69ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char3 = AV70ManageFiltersXml ;
         GXv_char16[0] = GXt_char3 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "GestionLaboratorio.EnviodeEnsayoaCliente_WCFilters", Ddo_managefilters_Activeeventkey, GXv_char16) ;
         enviodeensayoacliente_wc_impl.this.GXt_char3 = GXv_char16[0] ;
         AV70ManageFiltersXml = GXt_char3 ;
         if ( (GXutil.strcmp("", AV70ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S182 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV164Pgmname+"GridState", AV70ManageFiltersXml) ;
            AV47GridState.fromxml(AV70ManageFiltersXml, null, null);
            AV73OrderedBy = AV47GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73OrderedBy), 4, 0));
            AV75OrderedDsc = AV47GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75OrderedDsc", AV75OrderedDsc);
            /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
            S142 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S192 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefreshCmp(sPrefix);
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV47GridState", AV47GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV97TFLb_Estado_Sels", AV97TFLb_Estado_Sels);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10ColumnsSelector", AV10ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV68ManageFiltersData", AV68ManageFiltersData);
   }

   public void e211TR2( )
   {
      /* 'Dolabdipcoste' Routine */
      returnInSub = false ;
      AV7Col_EnvioEnsayo.clear();
      AV51i = (short)(1) ;
      while ( AV51i <= AV8Col_Lb_numero.size() )
      {
         AV53IN_Lb_numero = ((Number) AV8Col_Lb_numero.elementAt(-1+AV51i)).intValue() ;
         AV55IN_Lb_opcion = (String)AV9Col_Lb_opcion.elementAt(-1+AV51i) ;
         AV57Item_EnvioEnsayo = (app.gestionlaboratorio.SdtEnviodeEnsayo_SDT)new app.gestionlaboratorio.SdtEnviodeEnsayo_SDT(remoteHandle, context);
         AV57Item_EnvioEnsayo.setgxTv_SdtEnviodeEnsayo_SDT_Lb_numero( AV53IN_Lb_numero );
         AV57Item_EnvioEnsayo.setgxTv_SdtEnviodeEnsayo_SDT_Lb_opcion( AV55IN_Lb_opcion );
         AV57Item_EnvioEnsayo.setgxTv_SdtEnviodeEnsayo_SDT_Lb_cartaz( A5540Lb_Cartaz );
         AV57Item_EnvioEnsayo.setgxTv_SdtEnviodeEnsayo_SDT_Coste( AV13coste );
         AV7Col_EnvioEnsayo.add(AV57Item_EnvioEnsayo, 0);
         AV51i = (short)(AV51i+1) ;
      }
      AV58Json_EnvioEnsayo = AV7Col_EnvioEnsayo.toJSonString(false) ;
      httpContext.popup(formatLink("app.gestionlaboratorio.rens023", new String[] {GXutil.URLEncode(GXutil.rtrim(AV36Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV6Clicod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV59Lb_Cartaz)),GXutil.URLEncode(GXutil.formatDateParm(AV63Lb_fechaEn)),GXutil.URLEncode(DecimalUtil.decToString(AV67Lb_Rb)),GXutil.URLEncode(GXutil.rtrim(AV58Json_EnvioEnsayo))}, new String[] {"EmprCod","CliCod","Lb_cartaz","Lb_fechaen","Lb_rb","Json_EnvioEnsayo"}) , new Object[] {"AV36Emprcod","AV6Clicod","AV59Lb_Cartaz","AV63Lb_fechaEn","AV67Lb_Rb","AV58Json_EnvioEnsayo"});
      /*  Sending Event outputs  */
   }

   public void e181TR2( )
   {
      /* Dvelop_confirmpanel_enviar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_enviar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ENVIAR' */
         S202 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV8Col_Lb_numero", AV8Col_Lb_numero);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV9Col_Lb_opcion", AV9Col_Lb_opcion);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10ColumnsSelector", AV10ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV68ManageFiltersData", AV68ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV47GridState", AV47GridState);
   }

   public void e221TR2( )
   {
      /* 'DoMarcarTodos' Routine */
      returnInSub = false ;
      AV8Col_Lb_numero.clear();
      AV9Col_Lb_opcion.clear();
      /* Start For Each Line */
      nRC_GXsfl_80 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_80"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      nGXsfl_80_fel_idx = 0 ;
      while ( nGXsfl_80_fel_idx < nRC_GXsfl_80 )
      {
         nGXsfl_80_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_80_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_80_fel_idx+1) ;
         sGXsfl_80_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_fel_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_fel_802( ) ;
         AV77Seleccionar = GXutil.strtobool( httpContext.cgiGet( chkavSeleccionar.getInternalname())) ;
         A5532Lb_numero = (int)(localUtil.ctol( httpContext.cgiGet( edtLb_numero_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A5533Lb_ArtCod = httpContext.cgiGet( edtLb_ArtCod_Internalname) ;
         A5538Lb_ColNomC = httpContext.cgiGet( edtLb_ColNomC_Internalname) ;
         A5547Lb_Rb = localUtil.ctond( httpContext.cgiGet( edtLb_Rb_Internalname)) ;
         A5555Lb_opcion = GXutil.upper( httpContext.cgiGet( edtLb_opcion_Internalname)) ;
         A5718Lb_numop = (byte)(localUtil.ctol( httpContext.cgiGet( edtLb_numop_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A5540Lb_Cartaz = httpContext.cgiGet( edtLb_Cartaz_Internalname) ;
         A5541Lb_FechaE = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtLb_FechaE_Internalname), 0)) ;
         A5567Lb_FechaEn = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtLb_FechaEn_Internalname), 0)) ;
         cmbLb_Estado.setName( cmbLb_Estado.getInternalname() );
         cmbLb_Estado.setValue( httpContext.cgiGet( cmbLb_Estado.getInternalname()) );
         A5566Lb_Estado = (byte)(GXutil.lval( httpContext.cgiGet( cmbLb_Estado.getInternalname()))) ;
         AV72Obs = httpContext.cgiGet( edtavObs_Internalname) ;
         AV78SeleccionarEliminar = GXutil.strtobool( httpContext.cgiGet( chkavSeleccionareliminar.getInternalname())) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavF_cformu_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavF_cformu_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vF_CFORMU");
            GX_FocusControl = edtavF_cformu_Internalname ;
            wbErr = true ;
            AV39F_Cformu = (short)(0) ;
         }
         else
         {
            AV39F_Cformu = (short)(localUtil.ctol( httpContext.cgiGet( edtavF_cformu_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         }
         A5565Lb_CosteE = localUtil.ctond( httpContext.cgiGet( edtLb_CosteE_Internalname)) ;
         A5599Lb_RGB = localUtil.ctol( httpContext.cgiGet( edtLb_RGB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV8Col_Lb_numero.add((int)(A5532Lb_numero), 0);
         AV9Col_Lb_opcion.add(A5555Lb_opcion, 0);
         /* End For Each Line */
      }
      if ( nGXsfl_80_fel_idx == 0 )
      {
         nGXsfl_80_idx = 1 ;
         sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_802( ) ;
      }
      nGXsfl_80_fel_idx = 1 ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV8Col_Lb_numero", AV8Col_Lb_numero);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV9Col_Lb_opcion", AV9Col_Lb_opcion);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10ColumnsSelector", AV10ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV68ManageFiltersData", AV68ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV47GridState", AV47GridState);
   }

   public void e231TR2( )
   {
      /* 'DoDesmarcarTodos' Routine */
      returnInSub = false ;
      AV8Col_Lb_numero.clear();
      AV9Col_Lb_opcion.clear();
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV8Col_Lb_numero", AV8Col_Lb_numero);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV9Col_Lb_opcion", AV9Col_Lb_opcion);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10ColumnsSelector", AV10ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV68ManageFiltersData", AV68ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV47GridState", AV47GridState);
   }

   public void e191TR2( )
   {
      /* Dvelop_confirmpanel_eliminar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_eliminar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMINAR' */
         S212 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV8Col_Lb_numero", AV8Col_Lb_numero);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV9Col_Lb_opcion", AV9Col_Lb_opcion);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV144Col_Lb_numeroE", AV144Col_Lb_numeroE);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV145Col_Lb_opcionE", AV145Col_Lb_opcionE);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10ColumnsSelector", AV10ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV68ManageFiltersData", AV68ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV47GridState", AV47GridState);
   }

   public void e241TR2( )
   {
      /* 'Dolabdip' Routine */
      returnInSub = false ;
      AV7Col_EnvioEnsayo.clear();
      AV51i = (short)(1) ;
      while ( AV51i <= AV8Col_Lb_numero.size() )
      {
         AV53IN_Lb_numero = ((Number) AV8Col_Lb_numero.elementAt(-1+AV51i)).intValue() ;
         AV55IN_Lb_opcion = (String)AV9Col_Lb_opcion.elementAt(-1+AV51i) ;
         AV57Item_EnvioEnsayo = (app.gestionlaboratorio.SdtEnviodeEnsayo_SDT)new app.gestionlaboratorio.SdtEnviodeEnsayo_SDT(remoteHandle, context);
         AV57Item_EnvioEnsayo.setgxTv_SdtEnviodeEnsayo_SDT_Lb_numero( AV53IN_Lb_numero );
         AV57Item_EnvioEnsayo.setgxTv_SdtEnviodeEnsayo_SDT_Lb_opcion( AV55IN_Lb_opcion );
         AV57Item_EnvioEnsayo.setgxTv_SdtEnviodeEnsayo_SDT_Lb_cartaz( A5540Lb_Cartaz );
         AV57Item_EnvioEnsayo.setgxTv_SdtEnviodeEnsayo_SDT_Coste( AV13coste );
         AV7Col_EnvioEnsayo.add(AV57Item_EnvioEnsayo, 0);
         AV51i = (short)(AV51i+1) ;
      }
      AV58Json_EnvioEnsayo = AV7Col_EnvioEnsayo.toJSonString(false) ;
      httpContext.popup(formatLink("app.gestionlaboratorio.rensm016", new String[] {GXutil.URLEncode(GXutil.rtrim(AV36Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV6Clicod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV59Lb_Cartaz)),GXutil.URLEncode(GXutil.formatDateParm(AV63Lb_fechaEn)),GXutil.URLEncode(GXutil.rtrim(AV58Json_EnvioEnsayo))}, new String[] {"EmprCod","CliCod","Lb_cartaz","Lb_fechaen","Json_EnvioEnsayo"}) , new Object[] {"AV36Emprcod","AV6Clicod","AV59Lb_Cartaz","AV63Lb_fechaEn","AV58Json_EnvioEnsayo"});
      /*  Sending Event outputs  */
   }

   public void e251TR2( )
   {
      /* 'DoEnvioOpcionA' Routine */
      returnInSub = false ;
      AV149t = (short)(0) ;
      /* Start For Each Line */
      nRC_GXsfl_80 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_80"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      nGXsfl_80_fel_idx = 0 ;
      while ( nGXsfl_80_fel_idx < nRC_GXsfl_80 )
      {
         nGXsfl_80_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_80_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_80_fel_idx+1) ;
         sGXsfl_80_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_fel_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_fel_802( ) ;
         AV77Seleccionar = GXutil.strtobool( httpContext.cgiGet( chkavSeleccionar.getInternalname())) ;
         A5532Lb_numero = (int)(localUtil.ctol( httpContext.cgiGet( edtLb_numero_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A5533Lb_ArtCod = httpContext.cgiGet( edtLb_ArtCod_Internalname) ;
         A5538Lb_ColNomC = httpContext.cgiGet( edtLb_ColNomC_Internalname) ;
         A5547Lb_Rb = localUtil.ctond( httpContext.cgiGet( edtLb_Rb_Internalname)) ;
         A5555Lb_opcion = GXutil.upper( httpContext.cgiGet( edtLb_opcion_Internalname)) ;
         A5718Lb_numop = (byte)(localUtil.ctol( httpContext.cgiGet( edtLb_numop_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A5540Lb_Cartaz = httpContext.cgiGet( edtLb_Cartaz_Internalname) ;
         A5541Lb_FechaE = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtLb_FechaE_Internalname), 0)) ;
         A5567Lb_FechaEn = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtLb_FechaEn_Internalname), 0)) ;
         cmbLb_Estado.setName( cmbLb_Estado.getInternalname() );
         cmbLb_Estado.setValue( httpContext.cgiGet( cmbLb_Estado.getInternalname()) );
         A5566Lb_Estado = (byte)(GXutil.lval( httpContext.cgiGet( cmbLb_Estado.getInternalname()))) ;
         AV72Obs = httpContext.cgiGet( edtavObs_Internalname) ;
         AV78SeleccionarEliminar = GXutil.strtobool( httpContext.cgiGet( chkavSeleccionareliminar.getInternalname())) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavF_cformu_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavF_cformu_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vF_CFORMU");
            GX_FocusControl = edtavF_cformu_Internalname ;
            wbErr = true ;
            AV39F_Cformu = (short)(0) ;
         }
         else
         {
            AV39F_Cformu = (short)(localUtil.ctol( httpContext.cgiGet( edtavF_cformu_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         }
         A5565Lb_CosteE = localUtil.ctond( httpContext.cgiGet( edtLb_CosteE_Internalname)) ;
         A5599Lb_RGB = localUtil.ctol( httpContext.cgiGet( edtLb_RGB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         if ( GXutil.strcmp(A5555Lb_opcion, httpContext.getMessage( "A", "")) == 0 )
         {
            AV149t = (short)(AV149t+1) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         /* End For Each Line */
      }
      if ( nGXsfl_80_fel_idx == 0 )
      {
         nGXsfl_80_idx = 1 ;
         sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_802( ) ;
      }
      nGXsfl_80_fel_idx = 1 ;
      if ( (0==AV65Lb_numero) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atenção. Esta opção só é ativada se apenas um número de ensaio tiver sido filtrado na tela de filtros.", ""));
      }
      else
      {
         if ( AV149t == 0 )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Eu procurei Opção A, e não foi encontrado.", ""));
         }
         else
         {
            if ( (0==AV39F_Cformu) )
            {
               /* Start For Each Line */
               nRC_GXsfl_80 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_80"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               nGXsfl_80_fel_idx = 0 ;
               while ( nGXsfl_80_fel_idx < nRC_GXsfl_80 )
               {
                  nGXsfl_80_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_80_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_80_fel_idx+1) ;
                  sGXsfl_80_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_fel_idx), 4, 0), (short)(4), "0") ;
                  subsflControlProps_fel_802( ) ;
                  AV77Seleccionar = GXutil.strtobool( httpContext.cgiGet( chkavSeleccionar.getInternalname())) ;
                  A5532Lb_numero = (int)(localUtil.ctol( httpContext.cgiGet( edtLb_numero_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                  A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                  A5533Lb_ArtCod = httpContext.cgiGet( edtLb_ArtCod_Internalname) ;
                  A5538Lb_ColNomC = httpContext.cgiGet( edtLb_ColNomC_Internalname) ;
                  A5547Lb_Rb = localUtil.ctond( httpContext.cgiGet( edtLb_Rb_Internalname)) ;
                  A5555Lb_opcion = GXutil.upper( httpContext.cgiGet( edtLb_opcion_Internalname)) ;
                  A5718Lb_numop = (byte)(localUtil.ctol( httpContext.cgiGet( edtLb_numop_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                  A5540Lb_Cartaz = httpContext.cgiGet( edtLb_Cartaz_Internalname) ;
                  A5541Lb_FechaE = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtLb_FechaE_Internalname), 0)) ;
                  A5567Lb_FechaEn = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtLb_FechaEn_Internalname), 0)) ;
                  cmbLb_Estado.setName( cmbLb_Estado.getInternalname() );
                  cmbLb_Estado.setValue( httpContext.cgiGet( cmbLb_Estado.getInternalname()) );
                  A5566Lb_Estado = (byte)(GXutil.lval( httpContext.cgiGet( cmbLb_Estado.getInternalname()))) ;
                  AV72Obs = httpContext.cgiGet( edtavObs_Internalname) ;
                  AV78SeleccionarEliminar = GXutil.strtobool( httpContext.cgiGet( chkavSeleccionareliminar.getInternalname())) ;
                  if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavF_cformu_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavF_cformu_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vF_CFORMU");
                     GX_FocusControl = edtavF_cformu_Internalname ;
                     wbErr = true ;
                     AV39F_Cformu = (short)(0) ;
                  }
                  else
                  {
                     AV39F_Cformu = (short)(localUtil.ctol( httpContext.cgiGet( edtavF_cformu_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                  }
                  A5565Lb_CosteE = localUtil.ctond( httpContext.cgiGet( edtLb_CosteE_Internalname)) ;
                  A5599Lb_RGB = localUtil.ctol( httpContext.cgiGet( edtLb_RGB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                  if ( GXutil.strcmp(A5555Lb_opcion, httpContext.getMessage( "A", "")) == 0 )
                  {
                     AV6Clicod = A252CliCod ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Clicod), 6, 0));
                     AV151CliNom = A279CliNom ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV151CliNom", AV151CliNom);
                     AV152lb_artcod = A5533Lb_ArtCod ;
                     AV60Lb_ColNom = A5536Lb_ColNom ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60Lb_ColNom", AV60Lb_ColNom);
                     AV153lb_colNum = A5537Lb_ColNum ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV153lb_colNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV153lb_colNum), 6, 0));
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV154TipColcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV154TipColcod), 2, 0));
                     AV155Lb_colnomc = A5538Lb_ColNomC ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV155Lb_colnomc", AV155Lb_colnomc);
                  }
                  /* End For Each Line */
               }
               if ( nGXsfl_80_fel_idx == 0 )
               {
                  nGXsfl_80_idx = 1 ;
                  sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
                  subsflControlProps_802( ) ;
               }
               nGXsfl_80_fel_idx = 1 ;
               Dvelop_confirmpanel_envioopciona_Confirmationtext = httpContext.getMessage( "Ha seleccionado Actualizar en Produccion", "")+GXutil.newLine( ) ;
               ucDvelop_confirmpanel_envioopciona.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_envioopciona_Internalname, "ConfirmationText", Dvelop_confirmpanel_envioopciona_Confirmationtext);
               Dvelop_confirmpanel_envioopciona_Confirmationtext = Dvelop_confirmpanel_envioopciona_Confirmationtext+httpContext.getMessage( "Este Nº Ensayo, NO existe en Colorteca.", "")+GXutil.newLine( ) ;
               ucDvelop_confirmpanel_envioopciona.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_envioopciona_Internalname, "ConfirmationText", Dvelop_confirmpanel_envioopciona_Confirmationtext);
               Dvelop_confirmpanel_envioopciona_Confirmationtext = Dvelop_confirmpanel_envioopciona_Confirmationtext+httpContext.getMessage( "Creara el COLOR:", "")+GXutil.newLine( ) ;
               ucDvelop_confirmpanel_envioopciona.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_envioopciona_Internalname, "ConfirmationText", Dvelop_confirmpanel_envioopciona_Confirmationtext);
               Dvelop_confirmpanel_envioopciona_Confirmationtext = Dvelop_confirmpanel_envioopciona_Confirmationtext+httpContext.getMessage( "Cliente ", "")+GXutil.trim( AV151CliNom)+GXutil.newLine( ) ;
               ucDvelop_confirmpanel_envioopciona.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_envioopciona_Internalname, "ConfirmationText", Dvelop_confirmpanel_envioopciona_Confirmationtext);
               Dvelop_confirmpanel_envioopciona_Confirmationtext = Dvelop_confirmpanel_envioopciona_Confirmationtext+httpContext.getMessage( "Color ", "")+GXutil.trim( AV155Lb_colnomc)+GXutil.newLine( ) ;
               ucDvelop_confirmpanel_envioopciona.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_envioopciona_Internalname, "ConfirmationText", Dvelop_confirmpanel_envioopciona_Confirmationtext);
               Dvelop_confirmpanel_envioopciona_Confirmationtext = Dvelop_confirmpanel_envioopciona_Confirmationtext+httpContext.getMessage( "Numero ", "")+GXutil.trim( GXutil.str( AV153lb_colNum, 6, 0))+GXutil.newLine( ) ;
               ucDvelop_confirmpanel_envioopciona.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_envioopciona_Internalname, "ConfirmationText", Dvelop_confirmpanel_envioopciona_Confirmationtext);
               Dvelop_confirmpanel_envioopciona_Confirmationtext = Dvelop_confirmpanel_envioopciona_Confirmationtext+httpContext.getMessage( "Numero ", "")+GXutil.trim( GXutil.str( AV154TipColcod, 2, 0))+GXutil.newLine( ) ;
               ucDvelop_confirmpanel_envioopciona.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_envioopciona_Internalname, "ConfirmationText", Dvelop_confirmpanel_envioopciona_Confirmationtext);
               Dvelop_confirmpanel_envioopciona_Confirmationtext = Dvelop_confirmpanel_envioopciona_Confirmationtext+httpContext.getMessage( "Desea continuar?", "") ;
               ucDvelop_confirmpanel_envioopciona.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_envioopciona_Internalname, "ConfirmationText", Dvelop_confirmpanel_envioopciona_Confirmationtext);
            }
            else
            {
               GXv_char16[0] = AV36Emprcod ;
               GXv_int15[0] = AV42Fornumcol ;
               GXv_int11[0] = AV156Numform ;
               new app.pfornumcol(remoteHandle, context).execute( GXv_char16, GXv_int15, GXv_int11) ;
               enviodeensayoacliente_wc_impl.this.AV36Emprcod = GXv_char16[0] ;
               enviodeensayoacliente_wc_impl.this.AV42Fornumcol = GXv_int15[0] ;
               enviodeensayoacliente_wc_impl.this.AV156Numform = (short)((short)(GXv_int11[0])) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36Emprcod", AV36Emprcod);
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42Fornumcol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42Fornumcol), 8, 0));
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV156Numform", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV156Numform), 4, 0));
               Dvelop_confirmpanel_envioopciona_Confirmationtext = httpContext.getMessage( "Ha seleccionado Actualizar en Produccion", "")+GXutil.newLine( ) ;
               ucDvelop_confirmpanel_envioopciona.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_envioopciona_Internalname, "ConfirmationText", Dvelop_confirmpanel_envioopciona_Confirmationtext);
               Dvelop_confirmpanel_envioopciona_Confirmationtext = Dvelop_confirmpanel_envioopciona_Confirmationtext+httpContext.getMessage( "Este Nº Ensayo, EXISTE en Colorteca.", "")+GXutil.newLine( ) ;
               ucDvelop_confirmpanel_envioopciona.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_envioopciona_Internalname, "ConfirmationText", Dvelop_confirmpanel_envioopciona_Confirmationtext);
               Dvelop_confirmpanel_envioopciona_Confirmationtext = Dvelop_confirmpanel_envioopciona_Confirmationtext+httpContext.getMessage( "Se eliminaran: COLORANTES y PRODUCTOS(#)", "")+GXutil.newLine( ) ;
               ucDvelop_confirmpanel_envioopciona.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_envioopciona_Internalname, "ConfirmationText", Dvelop_confirmpanel_envioopciona_Confirmationtext);
               Dvelop_confirmpanel_envioopciona_Confirmationtext = Dvelop_confirmpanel_envioopciona_Confirmationtext+httpContext.getMessage( "Desea continuar?", "") ;
               ucDvelop_confirmpanel_envioopciona.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_envioopciona_Internalname, "ConfirmationText", Dvelop_confirmpanel_envioopciona_Confirmationtext);
            }
            this.executeUsercontrolMethod(sPrefix, false, "DVELOP_CONFIRMPANEL_ENVIOOPCIONAContainer", "Confirm", "", new Object[] {});
         }
      }
      /*  Sending Event outputs  */
   }

   public void e201TR2( )
   {
      /* Dvelop_confirmpanel_envioopciona_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_envioopciona_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ENVIOOPCIONA' */
         S222 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10ColumnsSelector", AV10ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV68ManageFiltersData", AV68ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV47GridState", AV47GridState);
   }

   public void e261TR2( )
   {
      /* 'DoCancelar' Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void e271TR2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char16[0] = AV38ExcelFilename ;
      GXv_char12[0] = AV37ErrorMessage ;
      new app.gestionlaboratorio.enviodeensayoacliente_wcexport(remoteHandle, context).execute( GXv_char16, GXv_char12) ;
      enviodeensayoacliente_wc_impl.this.AV38ExcelFilename = GXv_char16[0] ;
      enviodeensayoacliente_wc_impl.this.AV37ErrorMessage = GXv_char12[0] ;
      if ( GXutil.strcmp(AV38ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV38ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV37ErrorMessage);
      }
   }

   public void e281TR2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.gestionlaboratorio.enviodeensayoacliente_wcexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV73OrderedBy, 4, 0))+":"+(AV75OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S172( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV10ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector17[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector17, "&Seleccionar", "", "", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      GXv_SdtWWPColumnsSelector17[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector17, "Lb_numero", "", "Nº de Ensayo", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      GXv_SdtWWPColumnsSelector17[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector17, "CliCod", "", "Cliente", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      GXv_SdtWWPColumnsSelector17[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector17, "Lb_ArtCod", "", "Articulo", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      GXv_SdtWWPColumnsSelector17[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector17, "Lb_ColNomC", "", "Color Cliente", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      GXv_SdtWWPColumnsSelector17[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector17, "Lb_Rb", "", "Rb", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      GXv_SdtWWPColumnsSelector17[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector17, "Lb_opcion", "", "Opcion", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      GXv_SdtWWPColumnsSelector17[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector17, "Lb_numop", "", "Nº", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      GXv_SdtWWPColumnsSelector17[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector17, "Lb_Cartaz", "", "Coleccion", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      GXv_SdtWWPColumnsSelector17[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector17, "Lb_FechaE", "", "Fecha Entrada", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      GXv_SdtWWPColumnsSelector17[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector17, "Lb_FechaEn", "", "Fecha Envio", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      GXv_SdtWWPColumnsSelector17[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector17, "Lb_Estado", "", "Estado", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      GXv_SdtWWPColumnsSelector17[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector17, "&SeleccionarEliminar", "", "E", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      GXt_char3 = AV142UserCustomValue ;
      GXv_char16[0] = GXt_char3 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "GestionLaboratorio.EnviodeEnsayoaCliente_WCColumnsSelector", GXv_char16) ;
      enviodeensayoacliente_wc_impl.this.GXt_char3 = GXv_char16[0] ;
      AV142UserCustomValue = GXt_char3 ;
      if ( ! ( (GXutil.strcmp("", AV142UserCustomValue)==0) ) )
      {
         AV11ColumnsSelectorAux.fromxml(AV142UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector17[0] = AV11ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector18[0] = AV10ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector17, GXv_SdtWWPColumnsSelector18) ;
         AV11ColumnsSelectorAux = GXv_SdtWWPColumnsSelector17[0] ;
         AV10ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      }
   }

   public void S152( )
   {
      /* 'CHECKSECURITYFORACTIONS' Routine */
      returnInSub = false ;
      GXt_int1 = (byte)(0) ;
      GXv_int13[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV36Emprcod, httpContext.getMessage( "MODA21", ""), GXv_int13) ;
      enviodeensayoacliente_wc_impl.this.GXt_int1 = GXv_int13[0] ;
      AV148TempBoolean = (boolean)((GXt_int1==1)) ;
      if ( ! ( AV148TempBoolean ) )
      {
         bttBtnenvioopciona_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, bttBtnenvioopciona_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtnenvioopciona_Visible), 5, 0), true);
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item19 = AV68ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item20[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item19 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "GestionLaboratorio.EnviodeEnsayoaCliente_WCFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item20) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item19 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item20[0] ;
      AV68ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item19 ;
   }

   public void S182( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV41FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41FilterFullText", AV41FilterFullText);
      AV122TFLb_numero = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV122TFLb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV122TFLb_numero), 8, 0));
      AV123TFLb_numero_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV123TFLb_numero_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV123TFLb_numero_To), 8, 0));
      AV80TFCliCod = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80TFCliCod), 6, 0));
      AV81TFCliCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81TFCliCod_To), 6, 0));
      AV86TFLb_ArtCod = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV86TFLb_ArtCod", AV86TFLb_ArtCod);
      AV87TFLb_ArtCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV87TFLb_ArtCod_Sel", AV87TFLb_ArtCod_Sel);
      AV90TFLb_ColNomC = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90TFLb_ColNomC", AV90TFLb_ColNomC);
      AV91TFLb_ColNomC_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91TFLb_ColNomC_Sel", AV91TFLb_ColNomC_Sel);
      AV138TFLb_Rb = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV138TFLb_Rb", GXutil.ltrimstr( AV138TFLb_Rb, 7, 2));
      AV139TFLb_Rb_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV139TFLb_Rb_To", GXutil.ltrimstr( AV139TFLb_Rb_To, 7, 2));
      AV130TFLb_opcion = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV130TFLb_opcion", AV130TFLb_opcion);
      AV131TFLb_opcion_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV131TFLb_opcion_Sel", AV131TFLb_opcion_Sel);
      AV124TFLb_numop = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV124TFLb_numop", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV124TFLb_numop), 2, 0));
      AV125TFLb_numop_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV125TFLb_numop_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV125TFLb_numop_To), 2, 0));
      AV88TFLb_Cartaz = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88TFLb_Cartaz", AV88TFLb_Cartaz);
      AV89TFLb_Cartaz_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89TFLb_Cartaz_Sel", AV89TFLb_Cartaz_Sel);
      AV102TFLb_FechaE = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV102TFLb_FechaE", localUtil.format(AV102TFLb_FechaE, "99/99/99"));
      AV104TFLb_FechaEn = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV104TFLb_FechaEn", localUtil.format(AV104TFLb_FechaEn, "99/99/99"));
      AV97TFLb_Estado_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "") ;
      Ddo_grid_Selectedvalue_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      Ddo_grid_Filteredtext_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S202( )
   {
      /* 'DO ACTION ENVIAR' Routine */
      returnInSub = false ;
      AV5Lb_HoraEn = GXutil.resetDate(GXutil.serverNow( context, remoteHandle, pr_default)) ;
      AV66Lb_opcions = "" ;
      AV51i = (short)(1) ;
      while ( AV51i <= AV8Col_Lb_numero.size() )
      {
         AV53IN_Lb_numero = ((Number) AV8Col_Lb_numero.elementAt(-1+AV51i)).intValue() ;
         AV55IN_Lb_opcion = (String)AV9Col_Lb_opcion.elementAt(-1+AV51i) ;
         GXv_char16[0] = AV36Emprcod ;
         GXv_int15[0] = AV53IN_Lb_numero ;
         GXv_char12[0] = AV55IN_Lb_opcion ;
         GXv_date14[0] = AV63Lb_fechaEn ;
         GXv_dtime21[0] = AV5Lb_HoraEn ;
         GXv_int13[0] = (byte)(1) ;
         new app.gestionlaboratorio.pens006(remoteHandle, context).execute( GXv_char16, GXv_int15, GXv_char12, GXv_date14, GXv_dtime21, GXv_int13) ;
         enviodeensayoacliente_wc_impl.this.AV36Emprcod = GXv_char16[0] ;
         enviodeensayoacliente_wc_impl.this.AV53IN_Lb_numero = GXv_int15[0] ;
         enviodeensayoacliente_wc_impl.this.AV55IN_Lb_opcion = GXv_char12[0] ;
         enviodeensayoacliente_wc_impl.this.AV63Lb_fechaEn = GXv_date14[0] ;
         enviodeensayoacliente_wc_impl.this.AV5Lb_HoraEn = GXv_dtime21[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36Emprcod", AV36Emprcod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63Lb_fechaEn", localUtil.format(AV63Lb_fechaEn, "99/99/99"));
         AV146Clicodgrid = A252CliCod ;
         if ( ( AV71Moda21 == 1 ) && ( AV53IN_Lb_numero != AV54IN_Lb_numerol ) && ( AV54IN_Lb_numerol > 0 ) )
         {
            GXv_char16[0] = AV36Emprcod ;
            GXv_int15[0] = AV54IN_Lb_numerol ;
            GXv_char12[0] = AV66Lb_opcions ;
            GXv_date14[0] = AV63Lb_fechaEn ;
            GXv_int11[0] = A252CliCod ;
            new app.gestionlaboratorio.pregcor8(remoteHandle, context).execute( GXv_char16, GXv_int15, GXv_char12, GXv_date14, GXv_int11) ;
            enviodeensayoacliente_wc_impl.this.AV36Emprcod = GXv_char16[0] ;
            enviodeensayoacliente_wc_impl.this.AV54IN_Lb_numerol = GXv_int15[0] ;
            enviodeensayoacliente_wc_impl.this.AV66Lb_opcions = GXv_char12[0] ;
            enviodeensayoacliente_wc_impl.this.AV63Lb_fechaEn = GXv_date14[0] ;
            enviodeensayoacliente_wc_impl.this.A252CliCod = GXv_int11[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36Emprcod", AV36Emprcod);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54IN_Lb_numerol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54IN_Lb_numerol), 8, 0));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63Lb_fechaEn", localUtil.format(AV63Lb_fechaEn, "99/99/99"));
            AV66Lb_opcions = " " ;
         }
         GXv_char16[0] = AV36Emprcod ;
         GXv_int15[0] = AV53IN_Lb_numero ;
         new app.gestionlaboratorio.pdbgl00(remoteHandle, context).execute( GXv_char16, GXv_int15) ;
         enviodeensayoacliente_wc_impl.this.AV36Emprcod = GXv_char16[0] ;
         enviodeensayoacliente_wc_impl.this.AV53IN_Lb_numero = GXv_int15[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36Emprcod", AV36Emprcod);
         if ( GXutil.strcmp(AV66Lb_opcions, " ") == 0 )
         {
            AV66Lb_opcions = GXutil.trim( AV55IN_Lb_opcion) + "+" ;
         }
         else
         {
            AV66Lb_opcions += GXutil.concat( GXutil.trim( AV55IN_Lb_opcion), "+", "") ;
         }
         AV54IN_Lb_numerol = AV53IN_Lb_numero ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54IN_Lb_numerol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54IN_Lb_numerol), 8, 0));
         AV51i = (short)(AV51i+1) ;
      }
      if ( AV71Moda21 == 1 )
      {
         GXv_char16[0] = AV36Emprcod ;
         GXv_int15[0] = AV54IN_Lb_numerol ;
         GXv_char12[0] = AV66Lb_opcions ;
         GXv_date14[0] = AV63Lb_fechaEn ;
         GXv_int11[0] = AV146Clicodgrid ;
         new app.gestionlaboratorio.pregcor8(remoteHandle, context).execute( GXv_char16, GXv_int15, GXv_char12, GXv_date14, GXv_int11) ;
         enviodeensayoacliente_wc_impl.this.AV36Emprcod = GXv_char16[0] ;
         enviodeensayoacliente_wc_impl.this.AV54IN_Lb_numerol = GXv_int15[0] ;
         enviodeensayoacliente_wc_impl.this.AV66Lb_opcions = GXv_char12[0] ;
         enviodeensayoacliente_wc_impl.this.AV63Lb_fechaEn = GXv_date14[0] ;
         enviodeensayoacliente_wc_impl.this.AV146Clicodgrid = GXv_int11[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36Emprcod", AV36Emprcod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54IN_Lb_numerol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54IN_Lb_numerol), 8, 0));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63Lb_fechaEn", localUtil.format(AV63Lb_fechaEn, "99/99/99"));
      }
      AV8Col_Lb_numero.clear();
      AV9Col_Lb_opcion.clear();
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S212( )
   {
      /* 'DO ACTION ELIMINAR' Routine */
      returnInSub = false ;
      AV51i = (short)(1) ;
      while ( AV51i <= AV144Col_Lb_numeroE.size() )
      {
         AV53IN_Lb_numero = ((Number) AV144Col_Lb_numeroE.elementAt(-1+AV51i)).intValue() ;
         AV55IN_Lb_opcion = (String)AV145Col_Lb_opcionE.elementAt(-1+AV51i) ;
         AV40Fec_null = GXutil.nullDate() ;
         AV49Hora_null = GXutil.resetTime( GXutil.nullDate() );
         AV35Elimino_e = (short)(1) ;
         GXv_char16[0] = AV36Emprcod ;
         GXv_int15[0] = AV53IN_Lb_numero ;
         GXv_char12[0] = AV55IN_Lb_opcion ;
         GXv_date14[0] = AV40Fec_null ;
         GXv_dtime21[0] = AV49Hora_null ;
         GXv_int13[0] = (byte)(0) ;
         new app.gestionlaboratorio.pens006(remoteHandle, context).execute( GXv_char16, GXv_int15, GXv_char12, GXv_date14, GXv_dtime21, GXv_int13) ;
         enviodeensayoacliente_wc_impl.this.AV36Emprcod = GXv_char16[0] ;
         enviodeensayoacliente_wc_impl.this.AV53IN_Lb_numero = GXv_int15[0] ;
         enviodeensayoacliente_wc_impl.this.AV55IN_Lb_opcion = GXv_char12[0] ;
         enviodeensayoacliente_wc_impl.this.AV40Fec_null = GXv_date14[0] ;
         enviodeensayoacliente_wc_impl.this.AV49Hora_null = GXv_dtime21[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36Emprcod", AV36Emprcod);
         GXv_char16[0] = AV36Emprcod ;
         GXv_int15[0] = AV53IN_Lb_numero ;
         new app.gestionlaboratorio.pdbgl00(remoteHandle, context).execute( GXv_char16, GXv_int15) ;
         enviodeensayoacliente_wc_impl.this.AV36Emprcod = GXv_char16[0] ;
         enviodeensayoacliente_wc_impl.this.AV53IN_Lb_numero = GXv_int15[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36Emprcod", AV36Emprcod);
         AV51i = (short)(AV51i+1) ;
      }
      if ( AV71Moda21 == 1 )
      {
         AV66Lb_opcions = "" ;
         AV54IN_Lb_numerol = 0 ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54IN_Lb_numerol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54IN_Lb_numerol), 8, 0));
         AV35Elimino_e = (short)(0) ;
         AV51i = (short)(1) ;
         while ( AV51i <= AV144Col_Lb_numeroE.size() )
         {
            AV53IN_Lb_numero = ((Number) AV144Col_Lb_numeroE.elementAt(-1+AV51i)).intValue() ;
            AV55IN_Lb_opcion = (String)AV145Col_Lb_opcionE.elementAt(-1+AV51i) ;
            if ( A5566Lb_Estado == 1 )
            {
               AV35Elimino_e = (short)(1) ;
               if ( ( AV53IN_Lb_numero != AV54IN_Lb_numerol ) && ( AV54IN_Lb_numerol > 0 ) )
               {
                  GXv_char16[0] = AV36Emprcod ;
                  GXv_int15[0] = AV54IN_Lb_numerol ;
                  GXv_char12[0] = AV66Lb_opcions ;
                  GXv_date14[0] = AV52IN_lb_fechaen ;
                  GXv_int11[0] = A252CliCod ;
                  new app.gestionlaboratorio.pregcor8(remoteHandle, context).execute( GXv_char16, GXv_int15, GXv_char12, GXv_date14, GXv_int11) ;
                  enviodeensayoacliente_wc_impl.this.AV36Emprcod = GXv_char16[0] ;
                  enviodeensayoacliente_wc_impl.this.AV54IN_Lb_numerol = GXv_int15[0] ;
                  enviodeensayoacliente_wc_impl.this.AV66Lb_opcions = GXv_char12[0] ;
                  enviodeensayoacliente_wc_impl.this.AV52IN_lb_fechaen = GXv_date14[0] ;
                  enviodeensayoacliente_wc_impl.this.A252CliCod = GXv_int11[0] ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36Emprcod", AV36Emprcod);
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54IN_Lb_numerol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54IN_Lb_numerol), 8, 0));
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52IN_lb_fechaen", localUtil.format(AV52IN_lb_fechaen, "99/99/99"));
                  AV66Lb_opcions = " " ;
               }
               if ( GXutil.strcmp(AV66Lb_opcions, " ") == 0 )
               {
                  AV66Lb_opcions = GXutil.trim( AV55IN_Lb_opcion) + "+" ;
               }
               else
               {
                  AV66Lb_opcions += GXutil.concat( GXutil.trim( AV55IN_Lb_opcion), "+", "") ;
               }
               AV52IN_lb_fechaen = AV63Lb_fechaEn ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52IN_lb_fechaen", localUtil.format(AV52IN_lb_fechaen, "99/99/99"));
            }
            else
            {
               if ( ( AV53IN_Lb_numero != AV54IN_Lb_numerol ) && ( AV54IN_Lb_numerol > 0 ) )
               {
                  if ( GXutil.strcmp(AV66Lb_opcions, " ") == 0 )
                  {
                     AV52IN_lb_fechaen = GXutil.nullDate() ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52IN_lb_fechaen", localUtil.format(AV52IN_lb_fechaen, "99/99/99"));
                  }
                  GXv_char16[0] = AV36Emprcod ;
                  GXv_int15[0] = AV54IN_Lb_numerol ;
                  GXv_char12[0] = AV66Lb_opcions ;
                  GXv_date14[0] = AV52IN_lb_fechaen ;
                  GXv_int11[0] = A252CliCod ;
                  new app.gestionlaboratorio.pregcor8(remoteHandle, context).execute( GXv_char16, GXv_int15, GXv_char12, GXv_date14, GXv_int11) ;
                  enviodeensayoacliente_wc_impl.this.AV36Emprcod = GXv_char16[0] ;
                  enviodeensayoacliente_wc_impl.this.AV54IN_Lb_numerol = GXv_int15[0] ;
                  enviodeensayoacliente_wc_impl.this.AV66Lb_opcions = GXv_char12[0] ;
                  enviodeensayoacliente_wc_impl.this.AV52IN_lb_fechaen = GXv_date14[0] ;
                  enviodeensayoacliente_wc_impl.this.A252CliCod = GXv_int11[0] ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36Emprcod", AV36Emprcod);
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54IN_Lb_numerol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54IN_Lb_numerol), 8, 0));
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52IN_lb_fechaen", localUtil.format(AV52IN_lb_fechaen, "99/99/99"));
                  AV66Lb_opcions = " " ;
               }
            }
            AV146Clicodgrid = A252CliCod ;
            AV54IN_Lb_numerol = AV53IN_Lb_numero ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54IN_Lb_numerol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54IN_Lb_numerol), 8, 0));
            AV51i = (short)(AV51i+1) ;
         }
         if ( AV35Elimino_e == 1 )
         {
            if ( GXutil.strcmp(AV66Lb_opcions, " ") == 0 )
            {
               AV52IN_lb_fechaen = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52IN_lb_fechaen", localUtil.format(AV52IN_lb_fechaen, "99/99/99"));
            }
            GXv_char16[0] = AV36Emprcod ;
            GXv_int15[0] = AV54IN_Lb_numerol ;
            GXv_char12[0] = AV66Lb_opcions ;
            GXv_date14[0] = AV52IN_lb_fechaen ;
            GXv_int11[0] = AV146Clicodgrid ;
            new app.gestionlaboratorio.pregcor8(remoteHandle, context).execute( GXv_char16, GXv_int15, GXv_char12, GXv_date14, GXv_int11) ;
            enviodeensayoacliente_wc_impl.this.AV36Emprcod = GXv_char16[0] ;
            enviodeensayoacliente_wc_impl.this.AV54IN_Lb_numerol = GXv_int15[0] ;
            enviodeensayoacliente_wc_impl.this.AV66Lb_opcions = GXv_char12[0] ;
            enviodeensayoacliente_wc_impl.this.AV52IN_lb_fechaen = GXv_date14[0] ;
            enviodeensayoacliente_wc_impl.this.AV146Clicodgrid = GXv_int11[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36Emprcod", AV36Emprcod);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54IN_Lb_numerol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54IN_Lb_numerol), 8, 0));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52IN_lb_fechaen", localUtil.format(AV52IN_lb_fechaen, "99/99/99"));
         }
         if ( AV35Elimino_e == 0 )
         {
            /* Start For Each Line */
            nRC_GXsfl_80 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_80"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            nGXsfl_80_fel_idx = 0 ;
            while ( nGXsfl_80_fel_idx < nRC_GXsfl_80 )
            {
               nGXsfl_80_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_80_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_80_fel_idx+1) ;
               sGXsfl_80_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_fel_idx), 4, 0), (short)(4), "0") ;
               subsflControlProps_fel_802( ) ;
               AV77Seleccionar = GXutil.strtobool( httpContext.cgiGet( chkavSeleccionar.getInternalname())) ;
               A5532Lb_numero = (int)(localUtil.ctol( httpContext.cgiGet( edtLb_numero_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               A5533Lb_ArtCod = httpContext.cgiGet( edtLb_ArtCod_Internalname) ;
               A5538Lb_ColNomC = httpContext.cgiGet( edtLb_ColNomC_Internalname) ;
               A5547Lb_Rb = localUtil.ctond( httpContext.cgiGet( edtLb_Rb_Internalname)) ;
               A5555Lb_opcion = GXutil.upper( httpContext.cgiGet( edtLb_opcion_Internalname)) ;
               A5718Lb_numop = (byte)(localUtil.ctol( httpContext.cgiGet( edtLb_numop_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               A5540Lb_Cartaz = httpContext.cgiGet( edtLb_Cartaz_Internalname) ;
               A5541Lb_FechaE = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtLb_FechaE_Internalname), 0)) ;
               A5567Lb_FechaEn = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtLb_FechaEn_Internalname), 0)) ;
               cmbLb_Estado.setName( cmbLb_Estado.getInternalname() );
               cmbLb_Estado.setValue( httpContext.cgiGet( cmbLb_Estado.getInternalname()) );
               A5566Lb_Estado = (byte)(GXutil.lval( httpContext.cgiGet( cmbLb_Estado.getInternalname()))) ;
               AV72Obs = httpContext.cgiGet( edtavObs_Internalname) ;
               AV78SeleccionarEliminar = GXutil.strtobool( httpContext.cgiGet( chkavSeleccionareliminar.getInternalname())) ;
               if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavF_cformu_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavF_cformu_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vF_CFORMU");
                  GX_FocusControl = edtavF_cformu_Internalname ;
                  wbErr = true ;
                  AV39F_Cformu = (short)(0) ;
               }
               else
               {
                  AV39F_Cformu = (short)(localUtil.ctol( httpContext.cgiGet( edtavF_cformu_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               }
               A5565Lb_CosteE = localUtil.ctond( httpContext.cgiGet( edtLb_CosteE_Internalname)) ;
               A5599Lb_RGB = localUtil.ctol( httpContext.cgiGet( edtLb_RGB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
               AV40Fec_null = GXutil.nullDate() ;
               GXv_char16[0] = AV36Emprcod ;
               GXv_int15[0] = A5532Lb_numero ;
               GXv_char12[0] = " " ;
               GXv_date14[0] = AV40Fec_null ;
               GXv_int11[0] = A252CliCod ;
               new app.gestionlaboratorio.pregcor8(remoteHandle, context).execute( GXv_char16, GXv_int15, GXv_char12, GXv_date14, GXv_int11) ;
               enviodeensayoacliente_wc_impl.this.AV36Emprcod = GXv_char16[0] ;
               enviodeensayoacliente_wc_impl.this.A5532Lb_numero = GXv_int15[0] ;
               enviodeensayoacliente_wc_impl.this.AV40Fec_null = GXv_date14[0] ;
               enviodeensayoacliente_wc_impl.this.A252CliCod = GXv_int11[0] ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36Emprcod", AV36Emprcod);
               /* End For Each Line */
            }
            if ( nGXsfl_80_fel_idx == 0 )
            {
               nGXsfl_80_idx = 1 ;
               sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
               subsflControlProps_802( ) ;
            }
            nGXsfl_80_fel_idx = 1 ;
         }
      }
      AV8Col_Lb_numero.clear();
      AV9Col_Lb_opcion.clear();
      AV144Col_Lb_numeroE.clear();
      AV145Col_Lb_opcionE.clear();
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S222( )
   {
      /* 'DO ACTION ENVIOOPCIONA' Routine */
      returnInSub = false ;
      /* Start For Each Line */
      nRC_GXsfl_80 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_80"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      nGXsfl_80_fel_idx = 0 ;
      while ( nGXsfl_80_fel_idx < nRC_GXsfl_80 )
      {
         nGXsfl_80_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_80_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_80_fel_idx+1) ;
         sGXsfl_80_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_fel_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_fel_802( ) ;
         AV77Seleccionar = GXutil.strtobool( httpContext.cgiGet( chkavSeleccionar.getInternalname())) ;
         A5532Lb_numero = (int)(localUtil.ctol( httpContext.cgiGet( edtLb_numero_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A5533Lb_ArtCod = httpContext.cgiGet( edtLb_ArtCod_Internalname) ;
         A5538Lb_ColNomC = httpContext.cgiGet( edtLb_ColNomC_Internalname) ;
         A5547Lb_Rb = localUtil.ctond( httpContext.cgiGet( edtLb_Rb_Internalname)) ;
         A5555Lb_opcion = GXutil.upper( httpContext.cgiGet( edtLb_opcion_Internalname)) ;
         A5718Lb_numop = (byte)(localUtil.ctol( httpContext.cgiGet( edtLb_numop_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A5540Lb_Cartaz = httpContext.cgiGet( edtLb_Cartaz_Internalname) ;
         A5541Lb_FechaE = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtLb_FechaE_Internalname), 0)) ;
         A5567Lb_FechaEn = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtLb_FechaEn_Internalname), 0)) ;
         cmbLb_Estado.setName( cmbLb_Estado.getInternalname() );
         cmbLb_Estado.setValue( httpContext.cgiGet( cmbLb_Estado.getInternalname()) );
         A5566Lb_Estado = (byte)(GXutil.lval( httpContext.cgiGet( cmbLb_Estado.getInternalname()))) ;
         AV72Obs = httpContext.cgiGet( edtavObs_Internalname) ;
         AV78SeleccionarEliminar = GXutil.strtobool( httpContext.cgiGet( chkavSeleccionareliminar.getInternalname())) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavF_cformu_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavF_cformu_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vF_CFORMU");
            GX_FocusControl = edtavF_cformu_Internalname ;
            wbErr = true ;
            AV39F_Cformu = (short)(0) ;
         }
         else
         {
            AV39F_Cformu = (short)(localUtil.ctol( httpContext.cgiGet( edtavF_cformu_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         }
         A5565Lb_CosteE = localUtil.ctond( httpContext.cgiGet( edtLb_CosteE_Internalname)) ;
         A5599Lb_RGB = localUtil.ctol( httpContext.cgiGet( edtLb_RGB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         if ( GXutil.strcmp(A5555Lb_opcion, httpContext.getMessage( "A", "")) == 0 )
         {
            GXv_char16[0] = AV36Emprcod ;
            GXv_int15[0] = A5532Lb_numero ;
            GXv_char12[0] = A5555Lb_opcion ;
            GXv_date14[0] = AV63Lb_fechaEn ;
            GXv_decimal22[0] = A5565Lb_CosteE ;
            GXv_int23[0] = A5599Lb_RGB ;
            GXv_int13[0] = (byte)(AV39F_Cformu) ;
            GXv_int2[0] = (byte)(0) ;
            GXv_int24[0] = (byte)(0) ;
            GXv_int11[0] = A5537Lb_ColNum ;
            GXv_char6[0] = httpContext.getMessage( "N", "") ;
            new app.gestionlaboratorio.pens009(remoteHandle, context).execute( GXv_char16, GXv_int15, GXv_char12, GXv_date14, GXv_decimal22, GXv_int23, GXv_int13, GXv_int2, GXv_int24, GXv_int11, GXv_char6) ;
            enviodeensayoacliente_wc_impl.this.AV36Emprcod = GXv_char16[0] ;
            enviodeensayoacliente_wc_impl.this.A5532Lb_numero = GXv_int15[0] ;
            enviodeensayoacliente_wc_impl.this.A5555Lb_opcion = GXv_char12[0] ;
            enviodeensayoacliente_wc_impl.this.AV63Lb_fechaEn = GXv_date14[0] ;
            enviodeensayoacliente_wc_impl.this.A5565Lb_CosteE = GXv_decimal22[0] ;
            enviodeensayoacliente_wc_impl.this.A5599Lb_RGB = GXv_int23[0] ;
            enviodeensayoacliente_wc_impl.this.AV39F_Cformu = GXv_int13[0] ;
            enviodeensayoacliente_wc_impl.this.A5537Lb_ColNum = GXv_int11[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36Emprcod", AV36Emprcod);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63Lb_fechaEn", localUtil.format(AV63Lb_fechaEn, "99/99/99"));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavF_cformu_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39F_Cformu), 4, 0));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5537Lb_ColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5537Lb_ColNum), 6, 0));
         }
         /* End For Each Line */
      }
      if ( nGXsfl_80_fel_idx == 0 )
      {
         nGXsfl_80_idx = 1 ;
         sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_802( ) ;
      }
      nGXsfl_80_fel_idx = 1 ;
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV79Session.getValue(AV164Pgmname+"GridState"), "") == 0 )
      {
         AV47GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV164Pgmname+"GridState"), null, null);
      }
      else
      {
         AV47GridState.fromxml(AV79Session.getValue(AV164Pgmname+"GridState"), null, null);
      }
      AV73OrderedBy = AV47GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73OrderedBy), 4, 0));
      AV75OrderedDsc = AV47GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75OrderedDsc", AV75OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S192 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV47GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV47GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV47GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S192( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV191GXV1 = 1 ;
      while ( AV191GXV1 <= AV47GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV48GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV47GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV191GXV1));
         if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV41FilterFullText = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41FilterFullText", AV41FilterFullText);
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_NUMERO") == 0 )
         {
            AV122TFLb_numero = (int)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV122TFLb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV122TFLb_numero), 8, 0));
            AV123TFLb_numero_To = (int)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV123TFLb_numero_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV123TFLb_numero_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV80TFCliCod = (int)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80TFCliCod), 6, 0));
            AV81TFCliCod_To = (int)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTCOD") == 0 )
         {
            AV86TFLb_ArtCod = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV86TFLb_ArtCod", AV86TFLb_ArtCod);
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTCOD_SEL") == 0 )
         {
            AV87TFLb_ArtCod_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV87TFLb_ArtCod_Sel", AV87TFLb_ArtCod_Sel);
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOMC") == 0 )
         {
            AV90TFLb_ColNomC = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90TFLb_ColNomC", AV90TFLb_ColNomC);
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOMC_SEL") == 0 )
         {
            AV91TFLb_ColNomC_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91TFLb_ColNomC_Sel", AV91TFLb_ColNomC_Sel);
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_RB") == 0 )
         {
            AV138TFLb_Rb = CommonUtil.decimalVal( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV138TFLb_Rb", GXutil.ltrimstr( AV138TFLb_Rb, 7, 2));
            AV139TFLb_Rb_To = CommonUtil.decimalVal( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV139TFLb_Rb_To", GXutil.ltrimstr( AV139TFLb_Rb_To, 7, 2));
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_OPCION") == 0 )
         {
            AV130TFLb_opcion = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV130TFLb_opcion", AV130TFLb_opcion);
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_OPCION_SEL") == 0 )
         {
            AV131TFLb_opcion_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV131TFLb_opcion_Sel", AV131TFLb_opcion_Sel);
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_NUMOP") == 0 )
         {
            AV124TFLb_numop = (byte)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV124TFLb_numop", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV124TFLb_numop), 2, 0));
            AV125TFLb_numop_To = (byte)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV125TFLb_numop_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV125TFLb_numop_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZ") == 0 )
         {
            AV88TFLb_Cartaz = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88TFLb_Cartaz", AV88TFLb_Cartaz);
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZ_SEL") == 0 )
         {
            AV89TFLb_Cartaz_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89TFLb_Cartaz_Sel", AV89TFLb_Cartaz_Sel);
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FECHAE") == 0 )
         {
            AV102TFLb_FechaE = localUtil.ctod( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV102TFLb_FechaE", localUtil.format(AV102TFLb_FechaE, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FECHAEN") == 0 )
         {
            AV104TFLb_FechaEn = localUtil.ctod( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV104TFLb_FechaEn", localUtil.format(AV104TFLb_FechaEn, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ESTADO_SEL") == 0 )
         {
            AV98TFLb_Estado_SelsJson = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV98TFLb_Estado_SelsJson", AV98TFLb_Estado_SelsJson);
            AV97TFLb_Estado_Sels.fromJSonString(AV98TFLb_Estado_SelsJson, null);
         }
         AV191GXV1 = (int)(AV191GXV1+1) ;
      }
      GXt_char3 = "" ;
      GXv_char16[0] = GXt_char3 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV87TFLb_ArtCod_Sel)==0), AV87TFLb_ArtCod_Sel, GXv_char16) ;
      enviodeensayoacliente_wc_impl.this.GXt_char3 = GXv_char16[0] ;
      GXt_char25 = "" ;
      GXv_char12[0] = GXt_char25 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV91TFLb_ColNomC_Sel)==0), AV91TFLb_ColNomC_Sel, GXv_char12) ;
      enviodeensayoacliente_wc_impl.this.GXt_char25 = GXv_char12[0] ;
      GXt_char26 = "" ;
      GXv_char6[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV131TFLb_opcion_Sel)==0), AV131TFLb_opcion_Sel, GXv_char6) ;
      enviodeensayoacliente_wc_impl.this.GXt_char26 = GXv_char6[0] ;
      GXt_char27 = "" ;
      GXv_char5[0] = GXt_char27 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV89TFLb_Cartaz_Sel)==0), AV89TFLb_Cartaz_Sel, GXv_char5) ;
      enviodeensayoacliente_wc_impl.this.GXt_char27 = GXv_char5[0] ;
      Ddo_grid_Selectedvalue_set = "|||"+GXt_char3+"|"+GXt_char25+"||"+GXt_char26+"||"+GXt_char27+"|||"+((AV97TFLb_Estado_Sels.size()==0) ? "" : AV98TFLb_Estado_SelsJson)+"|" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char27 = "" ;
      GXv_char16[0] = GXt_char27 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV86TFLb_ArtCod)==0), AV86TFLb_ArtCod, GXv_char16) ;
      enviodeensayoacliente_wc_impl.this.GXt_char27 = GXv_char16[0] ;
      GXt_char26 = "" ;
      GXv_char12[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV90TFLb_ColNomC)==0), AV90TFLb_ColNomC, GXv_char12) ;
      enviodeensayoacliente_wc_impl.this.GXt_char26 = GXv_char12[0] ;
      GXt_char25 = "" ;
      GXv_char6[0] = GXt_char25 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV130TFLb_opcion)==0), AV130TFLb_opcion, GXv_char6) ;
      enviodeensayoacliente_wc_impl.this.GXt_char25 = GXv_char6[0] ;
      GXt_char3 = "" ;
      GXv_char5[0] = GXt_char3 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV88TFLb_Cartaz)==0), AV88TFLb_Cartaz, GXv_char5) ;
      enviodeensayoacliente_wc_impl.this.GXt_char3 = GXv_char5[0] ;
      Ddo_grid_Filteredtext_set = "|"+((0==AV122TFLb_numero) ? "" : GXutil.str( AV122TFLb_numero, 8, 0))+"|"+((0==AV80TFCliCod) ? "" : GXutil.str( AV80TFCliCod, 6, 0))+"|"+GXt_char27+"|"+GXt_char26+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV138TFLb_Rb)==0) ? "" : GXutil.str( AV138TFLb_Rb, 7, 2))+"|"+GXt_char25+"|"+((0==AV124TFLb_numop) ? "" : GXutil.str( AV124TFLb_numop, 2, 0))+"|"+GXt_char3+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV102TFLb_FechaE)) ? "" : localUtil.dtoc( AV102TFLb_FechaE, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV104TFLb_FechaEn)) ? "" : localUtil.dtoc( AV104TFLb_FechaEn, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "|"+((0==AV123TFLb_numero_To) ? "" : GXutil.str( AV123TFLb_numero_To, 8, 0))+"|"+((0==AV81TFCliCod_To) ? "" : GXutil.str( AV81TFCliCod_To, 6, 0))+"|||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV139TFLb_Rb_To)==0) ? "" : GXutil.str( AV139TFLb_Rb_To, 7, 2))+"||"+((0==AV125TFLb_numop_To) ? "" : GXutil.str( AV125TFLb_numop_To, 2, 0))+"|||||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S162( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV47GridState.fromxml(AV79Session.getValue(AV164Pgmname+"GridState"), null, null);
      AV47GridState.setgxTv_SdtWWPGridState_Orderedby( AV73OrderedBy );
      AV47GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV75OrderedDsc );
      AV47GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState28[0] = AV47GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV41FilterFullText)==0), (short)(0), AV41FilterFullText, "") ;
      AV47GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV47GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFLB_NUMERO", "", !((0==AV122TFLb_numero)&&(0==AV123TFLb_numero_To)), (short)(0), GXutil.trim( GXutil.str( AV122TFLb_numero, 8, 0)), GXutil.trim( GXutil.str( AV123TFLb_numero_To, 8, 0))) ;
      AV47GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV47GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFCLICOD", "", !((0==AV80TFCliCod)&&(0==AV81TFCliCod_To)), (short)(0), GXutil.trim( GXutil.str( AV80TFCliCod, 6, 0)), GXutil.trim( GXutil.str( AV81TFCliCod_To, 6, 0))) ;
      AV47GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV47GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFLB_ARTCOD", "", !(GXutil.strcmp("", AV86TFLb_ArtCod)==0), (short)(0), AV86TFLb_ArtCod, "", !(GXutil.strcmp("", AV87TFLb_ArtCod_Sel)==0), AV87TFLb_ArtCod_Sel, "") ;
      AV47GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV47GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFLB_COLNOMC", "", !(GXutil.strcmp("", AV90TFLb_ColNomC)==0), (short)(0), AV90TFLb_ColNomC, "", !(GXutil.strcmp("", AV91TFLb_ColNomC_Sel)==0), AV91TFLb_ColNomC_Sel, "") ;
      AV47GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV47GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFLB_RB", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV138TFLb_Rb)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV139TFLb_Rb_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV138TFLb_Rb, 7, 2)), GXutil.trim( GXutil.str( AV139TFLb_Rb_To, 7, 2))) ;
      AV47GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV47GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFLB_OPCION", "", !(GXutil.strcmp("", AV130TFLb_opcion)==0), (short)(0), AV130TFLb_opcion, "", !(GXutil.strcmp("", AV131TFLb_opcion_Sel)==0), AV131TFLb_opcion_Sel, "") ;
      AV47GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV47GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFLB_NUMOP", "", !((0==AV124TFLb_numop)&&(0==AV125TFLb_numop_To)), (short)(0), GXutil.trim( GXutil.str( AV124TFLb_numop, 2, 0)), GXutil.trim( GXutil.str( AV125TFLb_numop_To, 2, 0))) ;
      AV47GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV47GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFLB_CARTAZ", "", !(GXutil.strcmp("", AV88TFLb_Cartaz)==0), (short)(0), AV88TFLb_Cartaz, "", !(GXutil.strcmp("", AV89TFLb_Cartaz_Sel)==0), AV89TFLb_Cartaz_Sel, "") ;
      AV47GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV47GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFLB_FECHAE", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV102TFLb_FechaE)), (short)(0), GXutil.trim( localUtil.dtoc( AV102TFLb_FechaE, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV47GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV47GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFLB_FECHAEN", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV104TFLb_FechaEn)), (short)(0), GXutil.trim( localUtil.dtoc( AV104TFLb_FechaEn, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV47GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV47GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFLB_ESTADO_SEL", "", !(AV97TFLb_Estado_Sels.size()==0), (short)(0), AV97TFLb_Estado_Sels.toJSonString(false), "") ;
      AV47GridState = GXv_SdtWWPGridState28[0] ;
      if ( ! (GXutil.strcmp("", AV36Emprcod)==0) )
      {
         AV48GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV48GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV48GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV36Emprcod );
         AV47GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV48GridStateFilterValue, 0);
      }
      if ( ! (0==AV6Clicod) )
      {
         AV48GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV48GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICOD" );
         AV48GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV6Clicod, 6, 0) );
         AV47GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV48GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV59Lb_Cartaz)==0) )
      {
         AV48GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV48GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&LB_CARTAZ" );
         AV48GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV59Lb_Cartaz );
         AV47GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV48GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV60Lb_ColNom)==0) )
      {
         AV48GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV48GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&LB_COLNOM" );
         AV48GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV60Lb_ColNom );
         AV47GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV48GridStateFilterValue, 0);
      }
      if ( ! (0==AV65Lb_numero) )
      {
         AV48GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV48GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&LB_NUMERO" );
         AV48GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV65Lb_numero, 8, 0) );
         AV47GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV48GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV62Lb_FechaEfrom)) )
      {
         AV48GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV48GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&LB_FECHAEFROM" );
         AV48GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV62Lb_FechaEfrom, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV47GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV48GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV64Lb_FechaEto)) )
      {
         AV48GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV48GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&LB_FECHAETO" );
         AV48GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV64Lb_FechaEto, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV47GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV48GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV63Lb_fechaEn)) )
      {
         AV48GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV48GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&LB_FECHAEN" );
         AV48GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV63Lb_fechaEn, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV47GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV48GridStateFilterValue, 0);
      }
      if ( ! (0==AV61Lb_estado) )
      {
         AV48GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV48GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&LB_ESTADO" );
         AV48GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV61Lb_estado, 1, 0) );
         AV47GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV48GridStateFilterValue, 0);
      }
      AV47GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV47GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV164Pgmname+"GridState", AV47GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV140TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV140TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV164Pgmname );
      AV140TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV140TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV50HTTPRequest.getScriptName()+"?"+AV50HTTPRequest.getQuerystring() );
      AV140TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "GestionLaboratorio.TENS003" );
      AV79Session.setValue("TrnContext", AV140TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table4_123_1TR2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_envioopciona_Internalname, tblTabledvelop_confirmpanel_envioopciona_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_envioopciona.setProperty("Title", Dvelop_confirmpanel_envioopciona_Title);
         ucDvelop_confirmpanel_envioopciona.setProperty("ConfirmationText", Dvelop_confirmpanel_envioopciona_Confirmationtext);
         ucDvelop_confirmpanel_envioopciona.setProperty("YesButtonCaption", Dvelop_confirmpanel_envioopciona_Yesbuttoncaption);
         ucDvelop_confirmpanel_envioopciona.setProperty("NoButtonCaption", Dvelop_confirmpanel_envioopciona_Nobuttoncaption);
         ucDvelop_confirmpanel_envioopciona.setProperty("CancelButtonCaption", Dvelop_confirmpanel_envioopciona_Cancelbuttoncaption);
         ucDvelop_confirmpanel_envioopciona.setProperty("YesButtonPosition", Dvelop_confirmpanel_envioopciona_Yesbuttonposition);
         ucDvelop_confirmpanel_envioopciona.setProperty("ConfirmType", Dvelop_confirmpanel_envioopciona_Confirmtype);
         ucDvelop_confirmpanel_envioopciona.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_envioopciona_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_ENVIOOPCIONAContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_ENVIOOPCIONAContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_123_1TR2e( true) ;
      }
      else
      {
         wb_table4_123_1TR2e( false) ;
      }
   }

   public void wb_table3_118_1TR2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_eliminar_Internalname, tblTabledvelop_confirmpanel_eliminar_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_eliminar.setProperty("Title", Dvelop_confirmpanel_eliminar_Title);
         ucDvelop_confirmpanel_eliminar.setProperty("ConfirmationText", Dvelop_confirmpanel_eliminar_Confirmationtext);
         ucDvelop_confirmpanel_eliminar.setProperty("YesButtonCaption", Dvelop_confirmpanel_eliminar_Yesbuttoncaption);
         ucDvelop_confirmpanel_eliminar.setProperty("NoButtonCaption", Dvelop_confirmpanel_eliminar_Nobuttoncaption);
         ucDvelop_confirmpanel_eliminar.setProperty("CancelButtonCaption", Dvelop_confirmpanel_eliminar_Cancelbuttoncaption);
         ucDvelop_confirmpanel_eliminar.setProperty("YesButtonPosition", Dvelop_confirmpanel_eliminar_Yesbuttonposition);
         ucDvelop_confirmpanel_eliminar.setProperty("ConfirmType", Dvelop_confirmpanel_eliminar_Confirmtype);
         ucDvelop_confirmpanel_eliminar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_eliminar_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_118_1TR2e( true) ;
      }
      else
      {
         wb_table3_118_1TR2e( false) ;
      }
   }

   public void wb_table2_113_1TR2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_enviar_Internalname, tblTabledvelop_confirmpanel_enviar_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_enviar.setProperty("Title", Dvelop_confirmpanel_enviar_Title);
         ucDvelop_confirmpanel_enviar.setProperty("ConfirmationText", Dvelop_confirmpanel_enviar_Confirmationtext);
         ucDvelop_confirmpanel_enviar.setProperty("YesButtonCaption", Dvelop_confirmpanel_enviar_Yesbuttoncaption);
         ucDvelop_confirmpanel_enviar.setProperty("NoButtonCaption", Dvelop_confirmpanel_enviar_Nobuttoncaption);
         ucDvelop_confirmpanel_enviar.setProperty("CancelButtonCaption", Dvelop_confirmpanel_enviar_Cancelbuttoncaption);
         ucDvelop_confirmpanel_enviar.setProperty("YesButtonPosition", Dvelop_confirmpanel_enviar_Yesbuttonposition);
         ucDvelop_confirmpanel_enviar.setProperty("ConfirmType", Dvelop_confirmpanel_enviar_Confirmtype);
         ucDvelop_confirmpanel_enviar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_enviar_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_ENVIARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_ENVIARContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_113_1TR2e( true) ;
      }
      else
      {
         wb_table2_113_1TR2e( false) ;
      }
   }

   public void wb_table1_23_1TR2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV68ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table5_28_1TR2( true) ;
      }
      else
      {
         wb_table5_28_1TR2( false) ;
      }
      return  ;
   }

   public void wb_table5_28_1TR2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_23_1TR2e( true) ;
      }
      else
      {
         wb_table1_23_1TR2e( false) ;
      }
   }

   public void wb_table5_28_1TR2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'" + sPrefix + "',false,'" + sGXsfl_80_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV41FilterFullText, GXutil.rtrim( localUtil.format( AV41FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_GestionLaboratorio\\EnviodeEnsayoaCliente_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_28_1TR2e( true) ;
      }
      else
      {
         wb_table5_28_1TR2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV36Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36Emprcod", AV36Emprcod);
      AV6Clicod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Clicod), 6, 0));
      AV59Lb_Cartaz = (String)getParm(obj,2,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59Lb_Cartaz", AV59Lb_Cartaz);
      AV60Lb_ColNom = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60Lb_ColNom", AV60Lb_ColNom);
      AV65Lb_numero = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65Lb_numero), 8, 0));
      AV62Lb_FechaEfrom = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62Lb_FechaEfrom", localUtil.format(AV62Lb_FechaEfrom, "99/99/99"));
      AV64Lb_FechaEto = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64Lb_FechaEto", localUtil.format(AV64Lb_FechaEto, "99/99/99"));
      AV63Lb_fechaEn = (java.util.Date)getParm(obj,7,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63Lb_fechaEn", localUtil.format(AV63Lb_fechaEn, "99/99/99"));
      AV61Lb_estado = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61Lb_estado", GXutil.str( AV61Lb_estado, 1, 0));
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
      pa1TR2( ) ;
      ws1TR2( ) ;
      we1TR2( ) ;
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
      sCtrlAV36Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV6Clicod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV59Lb_Cartaz = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV60Lb_ColNom = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV65Lb_numero = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV62Lb_FechaEfrom = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV64Lb_FechaEto = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV63Lb_fechaEn = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV61Lb_estado = (String)getParm(obj,8,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1TR2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "gestionlaboratorio\\enviodeensayoacliente_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1TR2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV36Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36Emprcod", AV36Emprcod);
         AV6Clicod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Clicod), 6, 0));
         AV59Lb_Cartaz = (String)getParm(obj,4,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59Lb_Cartaz", AV59Lb_Cartaz);
         AV60Lb_ColNom = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60Lb_ColNom", AV60Lb_ColNom);
         AV65Lb_numero = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65Lb_numero), 8, 0));
         AV62Lb_FechaEfrom = (java.util.Date)getParm(obj,7,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62Lb_FechaEfrom", localUtil.format(AV62Lb_FechaEfrom, "99/99/99"));
         AV64Lb_FechaEto = (java.util.Date)getParm(obj,8,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64Lb_FechaEto", localUtil.format(AV64Lb_FechaEto, "99/99/99"));
         AV63Lb_fechaEn = (java.util.Date)getParm(obj,9,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63Lb_fechaEn", localUtil.format(AV63Lb_fechaEn, "99/99/99"));
         AV61Lb_estado = ((Number) GXutil.testNumericType( getParm(obj,10,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61Lb_estado", GXutil.str( AV61Lb_estado, 1, 0));
      }
      wcpOAV36Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV36Emprcod") ;
      wcpOAV6Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV6Clicod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV59Lb_Cartaz = httpContext.cgiGet( sPrefix+"wcpOAV59Lb_Cartaz") ;
      wcpOAV60Lb_ColNom = httpContext.cgiGet( sPrefix+"wcpOAV60Lb_ColNom") ;
      wcpOAV65Lb_numero = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV65Lb_numero"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV62Lb_FechaEfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV62Lb_FechaEfrom"), 0) ;
      wcpOAV64Lb_FechaEto = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV64Lb_FechaEto"), 0) ;
      wcpOAV63Lb_fechaEn = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV63Lb_fechaEn"), 0) ;
      wcpOAV61Lb_estado = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV61Lb_estado"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV36Emprcod, wcpOAV36Emprcod) != 0 ) || ( AV6Clicod != wcpOAV6Clicod ) || ( GXutil.strcmp(AV59Lb_Cartaz, wcpOAV59Lb_Cartaz) != 0 ) || ( GXutil.strcmp(AV60Lb_ColNom, wcpOAV60Lb_ColNom) != 0 ) || ( AV65Lb_numero != wcpOAV65Lb_numero ) || !( GXutil.dateCompare(GXutil.resetTime(AV62Lb_FechaEfrom), GXutil.resetTime(wcpOAV62Lb_FechaEfrom)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV64Lb_FechaEto), GXutil.resetTime(wcpOAV64Lb_FechaEto)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV63Lb_fechaEn), GXutil.resetTime(wcpOAV63Lb_fechaEn)) ) || ( AV61Lb_estado != wcpOAV61Lb_estado ) ) )
      {
         setjustcreated();
      }
      wcpOAV36Emprcod = AV36Emprcod ;
      wcpOAV6Clicod = AV6Clicod ;
      wcpOAV59Lb_Cartaz = AV59Lb_Cartaz ;
      wcpOAV60Lb_ColNom = AV60Lb_ColNom ;
      wcpOAV65Lb_numero = AV65Lb_numero ;
      wcpOAV62Lb_FechaEfrom = AV62Lb_FechaEfrom ;
      wcpOAV64Lb_FechaEto = AV64Lb_FechaEto ;
      wcpOAV63Lb_fechaEn = AV63Lb_fechaEn ;
      wcpOAV61Lb_estado = AV61Lb_estado ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV36Emprcod = httpContext.cgiGet( sPrefix+"AV36Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV36Emprcod) > 0 )
      {
         AV36Emprcod = httpContext.cgiGet( sCtrlAV36Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36Emprcod", AV36Emprcod);
      }
      else
      {
         AV36Emprcod = httpContext.cgiGet( sPrefix+"AV36Emprcod_PARM") ;
      }
      sCtrlAV6Clicod = httpContext.cgiGet( sPrefix+"AV6Clicod_CTRL") ;
      if ( GXutil.len( sCtrlAV6Clicod) > 0 )
      {
         AV6Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV6Clicod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Clicod), 6, 0));
      }
      else
      {
         AV6Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV6Clicod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV59Lb_Cartaz = httpContext.cgiGet( sPrefix+"AV59Lb_Cartaz_CTRL") ;
      if ( GXutil.len( sCtrlAV59Lb_Cartaz) > 0 )
      {
         AV59Lb_Cartaz = httpContext.cgiGet( sCtrlAV59Lb_Cartaz) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59Lb_Cartaz", AV59Lb_Cartaz);
      }
      else
      {
         AV59Lb_Cartaz = httpContext.cgiGet( sPrefix+"AV59Lb_Cartaz_PARM") ;
      }
      sCtrlAV60Lb_ColNom = httpContext.cgiGet( sPrefix+"AV60Lb_ColNom_CTRL") ;
      if ( GXutil.len( sCtrlAV60Lb_ColNom) > 0 )
      {
         AV60Lb_ColNom = httpContext.cgiGet( sCtrlAV60Lb_ColNom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60Lb_ColNom", AV60Lb_ColNom);
      }
      else
      {
         AV60Lb_ColNom = httpContext.cgiGet( sPrefix+"AV60Lb_ColNom_PARM") ;
      }
      sCtrlAV65Lb_numero = httpContext.cgiGet( sPrefix+"AV65Lb_numero_CTRL") ;
      if ( GXutil.len( sCtrlAV65Lb_numero) > 0 )
      {
         AV65Lb_numero = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV65Lb_numero), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65Lb_numero), 8, 0));
      }
      else
      {
         AV65Lb_numero = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV65Lb_numero_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV62Lb_FechaEfrom = httpContext.cgiGet( sPrefix+"AV62Lb_FechaEfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV62Lb_FechaEfrom) > 0 )
      {
         AV62Lb_FechaEfrom = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV62Lb_FechaEfrom), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62Lb_FechaEfrom", localUtil.format(AV62Lb_FechaEfrom, "99/99/99"));
      }
      else
      {
         AV62Lb_FechaEfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV62Lb_FechaEfrom_PARM"), 0) ;
      }
      sCtrlAV64Lb_FechaEto = httpContext.cgiGet( sPrefix+"AV64Lb_FechaEto_CTRL") ;
      if ( GXutil.len( sCtrlAV64Lb_FechaEto) > 0 )
      {
         AV64Lb_FechaEto = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV64Lb_FechaEto), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64Lb_FechaEto", localUtil.format(AV64Lb_FechaEto, "99/99/99"));
      }
      else
      {
         AV64Lb_FechaEto = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV64Lb_FechaEto_PARM"), 0) ;
      }
      sCtrlAV63Lb_fechaEn = httpContext.cgiGet( sPrefix+"AV63Lb_fechaEn_CTRL") ;
      if ( GXutil.len( sCtrlAV63Lb_fechaEn) > 0 )
      {
         AV63Lb_fechaEn = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV63Lb_fechaEn), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63Lb_fechaEn", localUtil.format(AV63Lb_fechaEn, "99/99/99"));
      }
      else
      {
         AV63Lb_fechaEn = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV63Lb_fechaEn_PARM"), 0) ;
      }
      sCtrlAV61Lb_estado = httpContext.cgiGet( sPrefix+"AV61Lb_estado_CTRL") ;
      if ( GXutil.len( sCtrlAV61Lb_estado) > 0 )
      {
         AV61Lb_estado = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV61Lb_estado), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61Lb_estado", GXutil.str( AV61Lb_estado, 1, 0));
      }
      else
      {
         AV61Lb_estado = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV61Lb_estado_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa1TR2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1TR2( ) ;
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
      ws1TR2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV36Emprcod_PARM", GXutil.rtrim( AV36Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV36Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV36Emprcod_CTRL", GXutil.rtrim( sCtrlAV36Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6Clicod_PARM", GXutil.ltrim( localUtil.ntoc( AV6Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV6Clicod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6Clicod_CTRL", GXutil.rtrim( sCtrlAV6Clicod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV59Lb_Cartaz_PARM", GXutil.rtrim( AV59Lb_Cartaz));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV59Lb_Cartaz)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV59Lb_Cartaz_CTRL", GXutil.rtrim( sCtrlAV59Lb_Cartaz));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV60Lb_ColNom_PARM", GXutil.rtrim( AV60Lb_ColNom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV60Lb_ColNom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV60Lb_ColNom_CTRL", GXutil.rtrim( sCtrlAV60Lb_ColNom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV65Lb_numero_PARM", GXutil.ltrim( localUtil.ntoc( AV65Lb_numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV65Lb_numero)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV65Lb_numero_CTRL", GXutil.rtrim( sCtrlAV65Lb_numero));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV62Lb_FechaEfrom_PARM", localUtil.dtoc( AV62Lb_FechaEfrom, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV62Lb_FechaEfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV62Lb_FechaEfrom_CTRL", GXutil.rtrim( sCtrlAV62Lb_FechaEfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV64Lb_FechaEto_PARM", localUtil.dtoc( AV64Lb_FechaEto, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV64Lb_FechaEto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV64Lb_FechaEto_CTRL", GXutil.rtrim( sCtrlAV64Lb_FechaEto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV63Lb_fechaEn_PARM", localUtil.dtoc( AV63Lb_fechaEn, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV63Lb_fechaEn)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV63Lb_fechaEn_CTRL", GXutil.rtrim( sCtrlAV63Lb_fechaEn));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV61Lb_estado_PARM", GXutil.ltrim( localUtil.ntoc( AV61Lb_estado, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV61Lb_estado)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV61Lb_estado_CTRL", GXutil.rtrim( sCtrlAV61Lb_estado));
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
      we1TR2( ) ;
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
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026821166861", true, true);
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
      httpContext.AddJavascriptSource("gestionlaboratorio/enviodeensayoacliente_wc.js", "?2026821166861", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
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

   public void subsflControlProps_802( )
   {
      chkavSeleccionar.setInternalname( sPrefix+"vSELECCIONAR_"+sGXsfl_80_idx );
      edtLb_numero_Internalname = sPrefix+"LB_NUMERO_"+sGXsfl_80_idx ;
      edtCliCod_Internalname = sPrefix+"CLICOD_"+sGXsfl_80_idx ;
      edtLb_ArtCod_Internalname = sPrefix+"LB_ARTCOD_"+sGXsfl_80_idx ;
      edtLb_ColNomC_Internalname = sPrefix+"LB_COLNOMC_"+sGXsfl_80_idx ;
      edtLb_Rb_Internalname = sPrefix+"LB_RB_"+sGXsfl_80_idx ;
      edtLb_opcion_Internalname = sPrefix+"LB_OPCION_"+sGXsfl_80_idx ;
      edtLb_numop_Internalname = sPrefix+"LB_NUMOP_"+sGXsfl_80_idx ;
      edtLb_Cartaz_Internalname = sPrefix+"LB_CARTAZ_"+sGXsfl_80_idx ;
      edtLb_FechaE_Internalname = sPrefix+"LB_FECHAE_"+sGXsfl_80_idx ;
      edtLb_FechaEn_Internalname = sPrefix+"LB_FECHAEN_"+sGXsfl_80_idx ;
      cmbLb_Estado.setInternalname( sPrefix+"LB_ESTADO_"+sGXsfl_80_idx );
      edtavObs_Internalname = sPrefix+"vOBS_"+sGXsfl_80_idx ;
      chkavSeleccionareliminar.setInternalname( sPrefix+"vSELECCIONARELIMINAR_"+sGXsfl_80_idx );
      edtavF_cformu_Internalname = sPrefix+"vF_CFORMU_"+sGXsfl_80_idx ;
      edtLb_CosteE_Internalname = sPrefix+"LB_COSTEE_"+sGXsfl_80_idx ;
      edtLb_RGB_Internalname = sPrefix+"LB_RGB_"+sGXsfl_80_idx ;
   }

   public void subsflControlProps_fel_802( )
   {
      chkavSeleccionar.setInternalname( sPrefix+"vSELECCIONAR_"+sGXsfl_80_fel_idx );
      edtLb_numero_Internalname = sPrefix+"LB_NUMERO_"+sGXsfl_80_fel_idx ;
      edtCliCod_Internalname = sPrefix+"CLICOD_"+sGXsfl_80_fel_idx ;
      edtLb_ArtCod_Internalname = sPrefix+"LB_ARTCOD_"+sGXsfl_80_fel_idx ;
      edtLb_ColNomC_Internalname = sPrefix+"LB_COLNOMC_"+sGXsfl_80_fel_idx ;
      edtLb_Rb_Internalname = sPrefix+"LB_RB_"+sGXsfl_80_fel_idx ;
      edtLb_opcion_Internalname = sPrefix+"LB_OPCION_"+sGXsfl_80_fel_idx ;
      edtLb_numop_Internalname = sPrefix+"LB_NUMOP_"+sGXsfl_80_fel_idx ;
      edtLb_Cartaz_Internalname = sPrefix+"LB_CARTAZ_"+sGXsfl_80_fel_idx ;
      edtLb_FechaE_Internalname = sPrefix+"LB_FECHAE_"+sGXsfl_80_fel_idx ;
      edtLb_FechaEn_Internalname = sPrefix+"LB_FECHAEN_"+sGXsfl_80_fel_idx ;
      cmbLb_Estado.setInternalname( sPrefix+"LB_ESTADO_"+sGXsfl_80_fel_idx );
      edtavObs_Internalname = sPrefix+"vOBS_"+sGXsfl_80_fel_idx ;
      chkavSeleccionareliminar.setInternalname( sPrefix+"vSELECCIONARELIMINAR_"+sGXsfl_80_fel_idx );
      edtavF_cformu_Internalname = sPrefix+"vF_CFORMU_"+sGXsfl_80_fel_idx ;
      edtLb_CosteE_Internalname = sPrefix+"LB_COSTEE_"+sGXsfl_80_fel_idx ;
      edtLb_RGB_Internalname = sPrefix+"LB_RGB_"+sGXsfl_80_fel_idx ;
   }

   public void sendrow_802( )
   {
      subsflControlProps_802( ) ;
      wb1TR0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_80_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_80_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_80_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+((chkavSeleccionar.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavSeleccionar.getEnabled()!=0)&&(chkavSeleccionar.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 81,'"+sPrefix+"',false,'"+sGXsfl_80_idx+"',80)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "vSELECCIONAR_" + sGXsfl_80_idx ;
         chkavSeleccionar.setName( GXCCtl );
         chkavSeleccionar.setWebtags( "" );
         chkavSeleccionar.setCaption( "" );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSeleccionar.getInternalname(), "TitleCaption", chkavSeleccionar.getCaption(), !bGXsfl_80_Refreshing);
         chkavSeleccionar.setCheckedValue( "false" );
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavSeleccionar.getInternalname(),GXutil.booltostr( AV77Seleccionar),"","",Integer.valueOf(chkavSeleccionar.getVisible()),Integer.valueOf(1),"true","",StyleString,ClassString,chkavSeleccionar.getColumnClass(),chkavSeleccionar.getColumnHeaderClass(),TempTags+((chkavSeleccionar.getEnabled()!=0)&&(chkavSeleccionar.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,81);\"" : " ")});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtLb_numero_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_numero_Internalname,GXutil.ltrim( localUtil.ntoc( A5532Lb_numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5532Lb_numero), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_numero_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtLb_numero_Columnclass,edtLb_numero_Columnheaderclass,Integer.valueOf(edtLb_numero_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtCliCod_Columnclass,edtCliCod_Columnheaderclass,Integer.valueOf(edtCliCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtLb_ArtCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_ArtCod_Internalname,GXutil.rtrim( A5533Lb_ArtCod),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_ArtCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtLb_ArtCod_Columnclass,edtLb_ArtCod_Columnheaderclass,Integer.valueOf(edtLb_ArtCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtLb_ColNomC_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_ColNomC_Internalname,GXutil.rtrim( A5538Lb_ColNomC),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_ColNomC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtLb_ColNomC_Columnclass,edtLb_ColNomC_Columnheaderclass,Integer.valueOf(edtLb_ColNomC_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtLb_Rb_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_Rb_Internalname,GXutil.ltrim( localUtil.ntoc( A5547Lb_Rb, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A5547Lb_Rb, "ZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_Rb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtLb_Rb_Columnclass,edtLb_Rb_Columnheaderclass,Integer.valueOf(edtLb_Rb_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtLb_opcion_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_opcion_Internalname,GXutil.rtrim( A5555Lb_opcion),GXutil.rtrim( localUtil.format( A5555Lb_opcion, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_opcion_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtLb_opcion_Columnclass,edtLb_opcion_Columnheaderclass,Integer.valueOf(edtLb_opcion_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtLb_numop_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_numop_Internalname,GXutil.ltrim( localUtil.ntoc( A5718Lb_numop, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5718Lb_numop), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_numop_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtLb_numop_Columnclass,edtLb_numop_Columnheaderclass,Integer.valueOf(edtLb_numop_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtLb_Cartaz_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_Cartaz_Internalname,GXutil.rtrim( A5540Lb_Cartaz),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_Cartaz_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtLb_Cartaz_Columnclass,edtLb_Cartaz_Columnheaderclass,Integer.valueOf(edtLb_Cartaz_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtLb_FechaE_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_FechaE_Internalname,localUtil.format(A5541Lb_FechaE, "99/99/99"),localUtil.format( A5541Lb_FechaE, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_FechaE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtLb_FechaE_Columnclass,edtLb_FechaE_Columnheaderclass,Integer.valueOf(edtLb_FechaE_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtLb_FechaEn_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_FechaEn_Internalname,localUtil.format(A5567Lb_FechaEn, "99/99/99"),localUtil.format( A5567Lb_FechaEn, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_FechaEn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtLb_FechaEn_Columnclass,edtLb_FechaEn_Columnheaderclass,Integer.valueOf(edtLb_FechaEn_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((cmbLb_Estado.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbLb_Estado.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "LB_ESTADO_" + sGXsfl_80_idx ;
            cmbLb_Estado.setName( GXCCtl );
            cmbLb_Estado.setWebtags( "" );
            cmbLb_Estado.addItem("0", httpContext.getMessage( "NO Enviado", ""), (short)(0));
            cmbLb_Estado.addItem("1", httpContext.getMessage( "Enviado", ""), (short)(0));
            cmbLb_Estado.addItem("2", httpContext.getMessage( "Recepcionado", ""), (short)(0));
            if ( cmbLb_Estado.getItemCount() > 0 )
            {
               A5566Lb_Estado = (byte)(GXutil.lval( cmbLb_Estado.getValidValue(GXutil.trim( GXutil.str( A5566Lb_Estado, 1, 0))))) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbLb_Estado,cmbLb_Estado.getInternalname(),GXutil.trim( GXutil.str( A5566Lb_Estado, 1, 0)),Integer.valueOf(1),cmbLb_Estado.getJsonclick(),Integer.valueOf(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(cmbLb_Estado.getVisible()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute",cmbLb_Estado.getColumnClass(),cmbLb_Estado.getColumnHeaderClass(),"","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbLb_Estado.setValue( GXutil.trim( GXutil.str( A5566Lb_Estado, 1, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbLb_Estado.getInternalname(), "Values", cmbLb_Estado.ToJavascriptSource(), !bGXsfl_80_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavObs_Enabled!=0)&&(edtavObs_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 93,'"+sPrefix+"',false,'"+sGXsfl_80_idx+"',80)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavObs_Internalname,AV72Obs,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavObs_Enabled!=0)&&(edtavObs_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,93);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavObs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+((chkavSeleccionareliminar.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavSeleccionareliminar.getEnabled()!=0)&&(chkavSeleccionareliminar.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 94,'"+sPrefix+"',false,'"+sGXsfl_80_idx+"',80)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "vSELECCIONARELIMINAR_" + sGXsfl_80_idx ;
         chkavSeleccionareliminar.setName( GXCCtl );
         chkavSeleccionareliminar.setWebtags( "" );
         chkavSeleccionareliminar.setCaption( "" );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSeleccionareliminar.getInternalname(), "TitleCaption", chkavSeleccionareliminar.getCaption(), !bGXsfl_80_Refreshing);
         chkavSeleccionareliminar.setCheckedValue( "false" );
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavSeleccionareliminar.getInternalname(),GXutil.booltostr( AV78SeleccionarEliminar),"","",Integer.valueOf(chkavSeleccionareliminar.getVisible()),Integer.valueOf(1),"true","",StyleString,ClassString,chkavSeleccionareliminar.getColumnClass(),chkavSeleccionareliminar.getColumnHeaderClass(),TempTags+((chkavSeleccionareliminar.getEnabled()!=0)&&(chkavSeleccionareliminar.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,94);\"" : " ")});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavF_cformu_Enabled!=0)&&(edtavF_cformu_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 95,'"+sPrefix+"',false,'"+sGXsfl_80_idx+"',80)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavF_cformu_Internalname,GXutil.ltrim( localUtil.ntoc( AV39F_Cformu, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavF_cformu_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV39F_Cformu), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV39F_Cformu), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavF_cformu_Enabled!=0)&&(edtavF_cformu_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,95);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavF_cformu_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavF_cformu_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_CosteE_Internalname,GXutil.ltrim( localUtil.ntoc( A5565Lb_CosteE, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A5565Lb_CosteE, "ZZZZ9.99999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_CosteE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_RGB_Internalname,GXutil.ltrim( localUtil.ntoc( A5599Lb_RGB, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5599Lb_RGB), "ZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_RGB_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1TR2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_80_idx = ((subGrid_Islastpage==1)&&(nGXsfl_80_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_80_idx+1) ;
         sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_802( ) ;
      }
      /* End function sendrow_802 */
   }

   public void startgridcontrol80( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"80\">") ;
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
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((chkavSeleccionar.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_numero_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº de Ensayo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_ArtCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_ColNomC_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_Rb_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Rb", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_opcion_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Opcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_numop_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_Cartaz_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coleccion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_FechaE_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Entrada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_FechaEn_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Envio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbLb_Estado.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Estado", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((chkavSeleccionareliminar.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "E", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.booltostr( AV77Seleccionar));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( chkavSeleccionar.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( chkavSeleccionar.getColumnHeaderClass()));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( chkavSeleccionar.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5532Lb_numero, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtLb_numero_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtLb_numero_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_numero_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtCliCod_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtCliCod_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCliCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5533Lb_ArtCod));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtLb_ArtCod_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtLb_ArtCod_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_ArtCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5538Lb_ColNomC));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtLb_ColNomC_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtLb_ColNomC_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_ColNomC_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5547Lb_Rb, (byte)(7), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtLb_Rb_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtLb_Rb_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_Rb_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5555Lb_opcion));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtLb_opcion_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtLb_opcion_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_opcion_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5718Lb_numop, (byte)(2), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtLb_numop_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtLb_numop_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_numop_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5540Lb_Cartaz));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtLb_Cartaz_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtLb_Cartaz_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_Cartaz_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A5541Lb_FechaE, "99/99/99"));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtLb_FechaE_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtLb_FechaE_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_FechaE_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A5567Lb_FechaEn, "99/99/99"));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtLb_FechaEn_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtLb_FechaEn_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_FechaEn_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5566Lb_Estado, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( cmbLb_Estado.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( cmbLb_Estado.getColumnHeaderClass()));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbLb_Estado.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", AV72Obs);
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavObs_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.booltostr( AV78SeleccionarEliminar));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( chkavSeleccionareliminar.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( chkavSeleccionareliminar.getColumnHeaderClass()));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( chkavSeleccionareliminar.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV39F_Cformu, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavF_cformu_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5565Lb_CosteE, (byte)(11), (byte)(5), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5599Lb_RGB, (byte)(10), (byte)(0), ".", "")));
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
      bttBtnenviar_Internalname = sPrefix+"BTNENVIAR" ;
      bttBtnmarcartodos_Internalname = sPrefix+"BTNMARCARTODOS" ;
      bttBtndesmarcartodos_Internalname = sPrefix+"BTNDESMARCARTODOS" ;
      bttBtneliminar_Internalname = sPrefix+"BTNELIMINAR" ;
      bttBtnlabdip_Internalname = sPrefix+"BTNLABDIP" ;
      bttBtnenvioopciona_Internalname = sPrefix+"BTNENVIOOPCIONA" ;
      bttBtncancelar_Internalname = sPrefix+"BTNCANCELAR" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      bttBtnlabdipcoste_Internalname = sPrefix+"BTNLABDIPCOSTE" ;
      lblTextblocklb_rb_Internalname = sPrefix+"TEXTBLOCKLB_RB" ;
      edtavLb_rb_Internalname = sPrefix+"vLB_RB" ;
      divUnnamedtablelb_rb_Internalname = sPrefix+"UNNAMEDTABLELB_RB" ;
      divUnnamedtable3_Internalname = sPrefix+"UNNAMEDTABLE3" ;
      Dvpanel_unnamedtable3_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE3" ;
      chkavSeleccionar.setInternalname( sPrefix+"vSELECCIONAR" );
      edtLb_numero_Internalname = sPrefix+"LB_NUMERO" ;
      edtCliCod_Internalname = sPrefix+"CLICOD" ;
      edtLb_ArtCod_Internalname = sPrefix+"LB_ARTCOD" ;
      edtLb_ColNomC_Internalname = sPrefix+"LB_COLNOMC" ;
      edtLb_Rb_Internalname = sPrefix+"LB_RB" ;
      edtLb_opcion_Internalname = sPrefix+"LB_OPCION" ;
      edtLb_numop_Internalname = sPrefix+"LB_NUMOP" ;
      edtLb_Cartaz_Internalname = sPrefix+"LB_CARTAZ" ;
      edtLb_FechaE_Internalname = sPrefix+"LB_FECHAE" ;
      edtLb_FechaEn_Internalname = sPrefix+"LB_FECHAEN" ;
      cmbLb_Estado.setInternalname( sPrefix+"LB_ESTADO" );
      edtavObs_Internalname = sPrefix+"vOBS" ;
      chkavSeleccionareliminar.setInternalname( sPrefix+"vSELECCIONARELIMINAR" );
      edtavF_cformu_Internalname = sPrefix+"vF_CFORMU" ;
      edtLb_CosteE_Internalname = sPrefix+"LB_COSTEE" ;
      edtLb_RGB_Internalname = sPrefix+"LB_RGB" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      Datamonjs_Internalname = sPrefix+"DATAMONJS" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      Dvelop_confirmpanel_enviar_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_ENVIAR" ;
      tblTabledvelop_confirmpanel_enviar_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_ENVIAR" ;
      Dvelop_confirmpanel_eliminar_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR" ;
      tblTabledvelop_confirmpanel_eliminar_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_ELIMINAR" ;
      Dvelop_confirmpanel_envioopciona_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_ENVIOOPCIONA" ;
      tblTabledvelop_confirmpanel_envioopciona_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_ENVIOOPCIONA" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
      edtavDdo_lb_fechaeauxdate_Internalname = sPrefix+"vDDO_LB_FECHAEAUXDATE" ;
      divDdo_lb_fechaeauxdates_Internalname = sPrefix+"DDO_LB_FECHAEAUXDATES" ;
      edtavDdo_lb_fechaenauxdate_Internalname = sPrefix+"vDDO_LB_FECHAENAUXDATE" ;
      divDdo_lb_fechaenauxdates_Internalname = sPrefix+"DDO_LB_FECHAENAUXDATES" ;
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
      edtLb_RGB_Jsonclick = "" ;
      edtLb_CosteE_Jsonclick = "" ;
      edtavF_cformu_Jsonclick = "" ;
      edtavF_cformu_Visible = 0 ;
      edtavF_cformu_Enabled = 1 ;
      chkavSeleccionareliminar.setCaption( "" );
      chkavSeleccionareliminar.setColumnClass( "WWColumn" );
      chkavSeleccionareliminar.setEnabled( 1 );
      edtavObs_Jsonclick = "" ;
      edtavObs_Visible = 0 ;
      edtavObs_Enabled = 1 ;
      cmbLb_Estado.setJsonclick( "" );
      cmbLb_Estado.setColumnClass( "WWColumn hidden-xs" );
      edtLb_FechaEn_Jsonclick = "" ;
      edtLb_FechaEn_Columnclass = "WWColumn" ;
      edtLb_FechaE_Jsonclick = "" ;
      edtLb_FechaE_Columnclass = "WWColumn" ;
      edtLb_Cartaz_Jsonclick = "" ;
      edtLb_Cartaz_Columnclass = "WWColumn" ;
      edtLb_numop_Jsonclick = "" ;
      edtLb_numop_Columnclass = "WWColumn hidden-xs" ;
      edtLb_opcion_Jsonclick = "" ;
      edtLb_opcion_Columnclass = "WWColumn hidden-xs" ;
      edtLb_Rb_Jsonclick = "" ;
      edtLb_Rb_Columnclass = "WWColumn" ;
      edtLb_ColNomC_Jsonclick = "" ;
      edtLb_ColNomC_Columnclass = "WWColumn" ;
      edtLb_ArtCod_Jsonclick = "" ;
      edtLb_ArtCod_Columnclass = "WWColumn" ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Columnclass = "WWColumn" ;
      edtLb_numero_Jsonclick = "" ;
      edtLb_numero_Columnclass = "WWColumn hidden-xs" ;
      chkavSeleccionar.setCaption( "" );
      chkavSeleccionar.setColumnClass( "WWColumn" );
      chkavSeleccionar.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      chkavSeleccionareliminar.setColumnHeaderClass( "" );
      cmbLb_Estado.setColumnHeaderClass( "" );
      edtLb_FechaEn_Columnheaderclass = "" ;
      edtLb_FechaE_Columnheaderclass = "" ;
      edtLb_Cartaz_Columnheaderclass = "" ;
      edtLb_numop_Columnheaderclass = "" ;
      edtLb_opcion_Columnheaderclass = "" ;
      edtLb_Rb_Columnheaderclass = "" ;
      edtLb_ColNomC_Columnheaderclass = "" ;
      edtLb_ArtCod_Columnheaderclass = "" ;
      edtCliCod_Columnheaderclass = "" ;
      edtLb_numero_Columnheaderclass = "" ;
      chkavSeleccionar.setColumnHeaderClass( "" );
      chkavSeleccionareliminar.setVisible( -1 );
      cmbLb_Estado.setVisible( -1 );
      edtLb_FechaEn_Visible = -1 ;
      edtLb_FechaE_Visible = -1 ;
      edtLb_Cartaz_Visible = -1 ;
      edtLb_numop_Visible = -1 ;
      edtLb_opcion_Visible = -1 ;
      edtLb_Rb_Visible = -1 ;
      edtLb_ColNomC_Visible = -1 ;
      edtLb_ArtCod_Visible = -1 ;
      edtCliCod_Visible = -1 ;
      edtLb_numero_Visible = -1 ;
      chkavSeleccionar.setVisible( -1 );
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_lb_fechaenauxdate_Jsonclick = "" ;
      edtavDdo_lb_fechaeauxdate_Jsonclick = "" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavLb_rb_Jsonclick = "" ;
      edtavLb_rb_Enabled = 1 ;
      divUnnamedtable2_Height = 0 ;
      bttBtnenvioopciona_Visible = 1 ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Dvelop_confirmpanel_envioopciona_Confirmtype = "1" ;
      Dvelop_confirmpanel_envioopciona_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_envioopciona_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_envioopciona_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_envioopciona_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_envioopciona_Confirmationtext = "¿Enviamos?" ;
      Dvelop_confirmpanel_envioopciona_Title = "" ;
      Dvelop_confirmpanel_eliminar_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminar_Confirmationtext = "¿Desea Eliminar Envio?" ;
      Dvelop_confirmpanel_eliminar_Title = "" ;
      Dvelop_confirmpanel_enviar_Confirmtype = "1" ;
      Dvelop_confirmpanel_enviar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_enviar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_enviar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_enviar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_enviar_Confirmationtext = "¿Confirma Envio?" ;
      Dvelop_confirmpanel_enviar_Title = "" ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "GestionLaboratorio.EnviodeEnsayoaCliente_WCGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "|||||||||||0:NO Enviado,1:Enviado,2:Recepcionado|" ;
      Ddo_grid_Allowmultipleselection = "|||||||||||T|" ;
      Ddo_grid_Datalisttype = "|||Dynamic|Dynamic||Dynamic||Dynamic|||FixedValues|" ;
      Ddo_grid_Includedatalist = "|||T|T||T||T|||T|" ;
      Ddo_grid_Filterisrange = "|T|T|||T||T|||||" ;
      Ddo_grid_Filtertype = "|Numeric|Numeric|Character|Character|Numeric|Character|Numeric|Character|Date|Date||" ;
      Ddo_grid_Includefilter = "|T|T|T|T|T|T|T|T|T|T||" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "|T|T|T|T|T|T|T|T|T|T|T|" ;
      Ddo_grid_Columnssortvalues = "|2|3|4|5|6|7|8|9|10|11|12|" ;
      Ddo_grid_Columnids = "0:Seleccionar|1:Lb_numero|2:CliCod|3:Lb_ArtCod|4:Lb_ColNomC|5:Lb_Rb|6:Lb_opcion|7:Lb_numop|8:Lb_Cartaz|9:Lb_FechaE|10:Lb_FechaEn|11:Lb_Estado|13:SeleccionarEliminar" ;
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
      Dvpanel_unnamedtable3_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Iconposition = "Right" ;
      Dvpanel_unnamedtable3_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable3_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Title = httpContext.getMessage( "Lab Dip con Coste", "") ;
      Dvpanel_unnamedtable3_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable3_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Width = "100%" ;
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
      GXCCtl = "vSELECCIONAR_" + sGXsfl_80_idx ;
      chkavSeleccionar.setName( GXCCtl );
      chkavSeleccionar.setWebtags( "" );
      chkavSeleccionar.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSeleccionar.getInternalname(), "TitleCaption", chkavSeleccionar.getCaption(), !bGXsfl_80_Refreshing);
      chkavSeleccionar.setCheckedValue( "false" );
      GXCCtl = "LB_ESTADO_" + sGXsfl_80_idx ;
      cmbLb_Estado.setName( GXCCtl );
      cmbLb_Estado.setWebtags( "" );
      cmbLb_Estado.addItem("0", httpContext.getMessage( "NO Enviado", ""), (short)(0));
      cmbLb_Estado.addItem("1", httpContext.getMessage( "Enviado", ""), (short)(0));
      cmbLb_Estado.addItem("2", httpContext.getMessage( "Recepcionado", ""), (short)(0));
      if ( cmbLb_Estado.getItemCount() > 0 )
      {
      }
      GXCCtl = "vSELECCIONARELIMINAR_" + sGXsfl_80_idx ;
      chkavSeleccionareliminar.setName( GXCCtl );
      chkavSeleccionareliminar.setWebtags( "" );
      chkavSeleccionareliminar.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSeleccionareliminar.getInternalname(), "TitleCaption", chkavSeleccionareliminar.getCaption(), !bGXsfl_80_Refreshing);
      chkavSeleccionareliminar.setCheckedValue( "false" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV39F_Cformu',fld:'vF_CFORMU',pic:'ZZZ9'},{av:'AV42Fornumcol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9'},{av:'Gx_msg',fld:'vMSG',pic:''},{av:'AV8Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV9Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'AV144Col_Lb_numeroE',fld:'vCOL_LB_NUMEROE',pic:''},{av:'AV145Col_Lb_opcionE',fld:'vCOL_LB_OPCIONE',pic:''},{av:'sPrefix'},{av:'AV69ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV41FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV36Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV59Lb_Cartaz',fld:'vLB_CARTAZ',pic:''},{av:'AV60Lb_ColNom',fld:'vLB_COLNOM',pic:''},{av:'AV65Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV62Lb_FechaEfrom',fld:'vLB_FECHAEFROM',pic:''},{av:'AV64Lb_FechaEto',fld:'vLB_FECHAETO',pic:''},{av:'AV61Lb_estado',fld:'vLB_ESTADO',pic:'9'},{av:'AV122TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV123TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV80TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV81TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV86TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV87TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV90TFLb_ColNomC',fld:'vTFLB_COLNOMC',pic:''},{av:'AV91TFLb_ColNomC_Sel',fld:'vTFLB_COLNOMC_SEL',pic:''},{av:'AV138TFLb_Rb',fld:'vTFLB_RB',pic:'ZZZ9.99'},{av:'AV139TFLb_Rb_To',fld:'vTFLB_RB_TO',pic:'ZZZ9.99'},{av:'AV130TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV131TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV124TFLb_numop',fld:'vTFLB_NUMOP',pic:'Z9'},{av:'AV125TFLb_numop_To',fld:'vTFLB_NUMOP_TO',pic:'Z9'},{av:'AV88TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV89TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV102TFLb_FechaE',fld:'vTFLB_FECHAE',pic:''},{av:'AV104TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV97TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV164Pgmname',fld:'vPGMNAME',pic:''},{av:'AV73OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV75OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV63Lb_fechaEn',fld:'vLB_FECHAEN',pic:''},{av:'AV43ForUltUti',fld:'vFORULTUTI',pic:'',hsh:true},{av:'AV13coste',fld:'vCOSTE',pic:'ZZZZ9.99999',hsh:true},{av:'AV71Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV69ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'edtLb_numero_Visible',ctrl:'LB_NUMERO',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtLb_ArtCod_Visible',ctrl:'LB_ARTCOD',prop:'Visible'},{av:'edtLb_ColNomC_Visible',ctrl:'LB_COLNOMC',prop:'Visible'},{av:'edtLb_Rb_Visible',ctrl:'LB_RB',prop:'Visible'},{av:'edtLb_opcion_Visible',ctrl:'LB_OPCION',prop:'Visible'},{av:'edtLb_numop_Visible',ctrl:'LB_NUMOP',prop:'Visible'},{av:'edtLb_Cartaz_Visible',ctrl:'LB_CARTAZ',prop:'Visible'},{av:'edtLb_FechaE_Visible',ctrl:'LB_FECHAE',prop:'Visible'},{av:'edtLb_FechaEn_Visible',ctrl:'LB_FECHAEN',prop:'Visible'},{av:'cmbLb_Estado'},{av:'chkavSeleccionareliminar.getVisible()',ctrl:'vSELECCIONARELIMINAR',prop:'Visible'},{av:'AV45GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV46GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'chkavSeleccionar.getColumnHeaderClass()',ctrl:'vSELECCIONAR',prop:'Columnheaderclass'},{av:'edtLb_numero_Columnheaderclass',ctrl:'LB_NUMERO',prop:'Columnheaderclass'},{av:'edtCliCod_Columnheaderclass',ctrl:'CLICOD',prop:'Columnheaderclass'},{av:'edtLb_ArtCod_Columnheaderclass',ctrl:'LB_ARTCOD',prop:'Columnheaderclass'},{av:'edtLb_ColNomC_Columnheaderclass',ctrl:'LB_COLNOMC',prop:'Columnheaderclass'},{av:'edtLb_Rb_Columnheaderclass',ctrl:'LB_RB',prop:'Columnheaderclass'},{av:'edtLb_opcion_Columnheaderclass',ctrl:'LB_OPCION',prop:'Columnheaderclass'},{av:'edtLb_numop_Columnheaderclass',ctrl:'LB_NUMOP',prop:'Columnheaderclass'},{av:'edtLb_Cartaz_Columnheaderclass',ctrl:'LB_CARTAZ',prop:'Columnheaderclass'},{av:'edtLb_FechaE_Columnheaderclass',ctrl:'LB_FECHAE',prop:'Columnheaderclass'},{av:'edtLb_FechaEn_Columnheaderclass',ctrl:'LB_FECHAEN',prop:'Columnheaderclass'},{av:'chkavSeleccionareliminar.getColumnHeaderClass()',ctrl:'vSELECCIONARELIMINAR',prop:'Columnheaderclass'},{ctrl:'BTNENVIOOPCIONA',prop:'Visible'},{av:'AV68ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV47GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e141TR2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV41FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV36Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV59Lb_Cartaz',fld:'vLB_CARTAZ',pic:''},{av:'AV60Lb_ColNom',fld:'vLB_COLNOM',pic:''},{av:'AV65Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV62Lb_FechaEfrom',fld:'vLB_FECHAEFROM',pic:''},{av:'AV64Lb_FechaEto',fld:'vLB_FECHAETO',pic:''},{av:'AV61Lb_estado',fld:'vLB_ESTADO',pic:'9'},{av:'AV69ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV122TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV123TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV80TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV81TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV86TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV87TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV90TFLb_ColNomC',fld:'vTFLB_COLNOMC',pic:''},{av:'AV91TFLb_ColNomC_Sel',fld:'vTFLB_COLNOMC_SEL',pic:''},{av:'AV138TFLb_Rb',fld:'vTFLB_RB',pic:'ZZZ9.99'},{av:'AV139TFLb_Rb_To',fld:'vTFLB_RB_TO',pic:'ZZZ9.99'},{av:'AV130TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV131TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV124TFLb_numop',fld:'vTFLB_NUMOP',pic:'Z9'},{av:'AV125TFLb_numop_To',fld:'vTFLB_NUMOP_TO',pic:'Z9'},{av:'AV88TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV89TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV102TFLb_FechaE',fld:'vTFLB_FECHAE',pic:''},{av:'AV104TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV97TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV164Pgmname',fld:'vPGMNAME',pic:''},{av:'AV73OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV75OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV63Lb_fechaEn',fld:'vLB_FECHAEN',pic:''},{av:'AV39F_Cformu',fld:'vF_CFORMU',pic:'ZZZ9'},{av:'AV43ForUltUti',fld:'vFORULTUTI',pic:'',hsh:true},{av:'AV42Fornumcol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9'},{av:'Gx_msg',fld:'vMSG',pic:''},{av:'AV8Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV9Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'AV144Col_Lb_numeroE',fld:'vCOL_LB_NUMEROE',pic:''},{av:'AV145Col_Lb_opcionE',fld:'vCOL_LB_OPCIONE',pic:''},{av:'AV13coste',fld:'vCOSTE',pic:'ZZZZ9.99999',hsh:true},{av:'AV71Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e151TR2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV41FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV36Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV59Lb_Cartaz',fld:'vLB_CARTAZ',pic:''},{av:'AV60Lb_ColNom',fld:'vLB_COLNOM',pic:''},{av:'AV65Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV62Lb_FechaEfrom',fld:'vLB_FECHAEFROM',pic:''},{av:'AV64Lb_FechaEto',fld:'vLB_FECHAETO',pic:''},{av:'AV61Lb_estado',fld:'vLB_ESTADO',pic:'9'},{av:'AV69ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV122TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV123TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV80TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV81TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV86TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV87TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV90TFLb_ColNomC',fld:'vTFLB_COLNOMC',pic:''},{av:'AV91TFLb_ColNomC_Sel',fld:'vTFLB_COLNOMC_SEL',pic:''},{av:'AV138TFLb_Rb',fld:'vTFLB_RB',pic:'ZZZ9.99'},{av:'AV139TFLb_Rb_To',fld:'vTFLB_RB_TO',pic:'ZZZ9.99'},{av:'AV130TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV131TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV124TFLb_numop',fld:'vTFLB_NUMOP',pic:'Z9'},{av:'AV125TFLb_numop_To',fld:'vTFLB_NUMOP_TO',pic:'Z9'},{av:'AV88TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV89TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV102TFLb_FechaE',fld:'vTFLB_FECHAE',pic:''},{av:'AV104TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV97TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV164Pgmname',fld:'vPGMNAME',pic:''},{av:'AV73OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV75OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV63Lb_fechaEn',fld:'vLB_FECHAEN',pic:''},{av:'AV39F_Cformu',fld:'vF_CFORMU',pic:'ZZZ9'},{av:'AV43ForUltUti',fld:'vFORULTUTI',pic:'',hsh:true},{av:'AV42Fornumcol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9'},{av:'Gx_msg',fld:'vMSG',pic:''},{av:'AV8Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV9Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'AV144Col_Lb_numeroE',fld:'vCOL_LB_NUMEROE',pic:''},{av:'AV145Col_Lb_opcionE',fld:'vCOL_LB_OPCIONE',pic:''},{av:'AV13coste',fld:'vCOSTE',pic:'ZZZZ9.99999',hsh:true},{av:'AV71Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e161TR2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV41FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV36Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV59Lb_Cartaz',fld:'vLB_CARTAZ',pic:''},{av:'AV60Lb_ColNom',fld:'vLB_COLNOM',pic:''},{av:'AV65Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV62Lb_FechaEfrom',fld:'vLB_FECHAEFROM',pic:''},{av:'AV64Lb_FechaEto',fld:'vLB_FECHAETO',pic:''},{av:'AV61Lb_estado',fld:'vLB_ESTADO',pic:'9'},{av:'AV69ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV122TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV123TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV80TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV81TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV86TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV87TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV90TFLb_ColNomC',fld:'vTFLB_COLNOMC',pic:''},{av:'AV91TFLb_ColNomC_Sel',fld:'vTFLB_COLNOMC_SEL',pic:''},{av:'AV138TFLb_Rb',fld:'vTFLB_RB',pic:'ZZZ9.99'},{av:'AV139TFLb_Rb_To',fld:'vTFLB_RB_TO',pic:'ZZZ9.99'},{av:'AV130TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV131TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV124TFLb_numop',fld:'vTFLB_NUMOP',pic:'Z9'},{av:'AV125TFLb_numop_To',fld:'vTFLB_NUMOP_TO',pic:'Z9'},{av:'AV88TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV89TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV102TFLb_FechaE',fld:'vTFLB_FECHAE',pic:''},{av:'AV104TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV97TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV164Pgmname',fld:'vPGMNAME',pic:''},{av:'AV73OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV75OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV63Lb_fechaEn',fld:'vLB_FECHAEN',pic:''},{av:'AV39F_Cformu',fld:'vF_CFORMU',pic:'ZZZ9'},{av:'AV43ForUltUti',fld:'vFORULTUTI',pic:'',hsh:true},{av:'AV42Fornumcol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9'},{av:'Gx_msg',fld:'vMSG',pic:''},{av:'AV8Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV9Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'AV144Col_Lb_numeroE',fld:'vCOL_LB_NUMEROE',pic:''},{av:'AV145Col_Lb_opcionE',fld:'vCOL_LB_OPCIONE',pic:''},{av:'AV13coste',fld:'vCOSTE',pic:'ZZZZ9.99999',hsh:true},{av:'AV71Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV73OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV75OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV98TFLb_Estado_SelsJson',fld:'vTFLB_ESTADO_SELSJSON',pic:''},{av:'AV97TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV104TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV102TFLb_FechaE',fld:'vTFLB_FECHAE',pic:''},{av:'AV88TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV89TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV124TFLb_numop',fld:'vTFLB_NUMOP',pic:'Z9'},{av:'AV125TFLb_numop_To',fld:'vTFLB_NUMOP_TO',pic:'Z9'},{av:'AV130TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV131TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV138TFLb_Rb',fld:'vTFLB_RB',pic:'ZZZ9.99'},{av:'AV139TFLb_Rb_To',fld:'vTFLB_RB_TO',pic:'ZZZ9.99'},{av:'AV90TFLb_ColNomC',fld:'vTFLB_COLNOMC',pic:''},{av:'AV91TFLb_ColNomC_Sel',fld:'vTFLB_COLNOMC_SEL',pic:''},{av:'AV86TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV87TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV80TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV81TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV122TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV123TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e311TR2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A5533Lb_ArtCod',fld:'LB_ARTCOD',pic:''},{av:'A5536Lb_ColNom',fld:'LB_COLNOM',pic:''},{av:'A5537Lb_ColNum',fld:'LB_COLNUM',pic:'ZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A5555Lb_opcion',fld:'LB_OPCION',pic:'@!'},{av:'AV39F_Cformu',fld:'vF_CFORMU',pic:'ZZZ9'},{av:'AV43ForUltUti',fld:'vFORULTUTI',pic:'',hsh:true},{av:'AV42Fornumcol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9'},{av:'Gx_msg',fld:'vMSG',pic:''},{av:'AV8Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'A5532Lb_numero',fld:'LB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV9Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'cmbLb_Estado'},{av:'A5566Lb_Estado',fld:'LB_ESTADO',pic:'9',hsh:true},{av:'AV144Col_Lb_numeroE',fld:'vCOL_LB_NUMEROE',pic:''},{av:'AV145Col_Lb_opcionE',fld:'vCOL_LB_OPCIONE',pic:''}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV72Obs',fld:'vOBS',pic:''},{av:'AV42Fornumcol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV43ForUltUti',fld:'vFORULTUTI',pic:'',hsh:true},{av:'AV39F_Cformu',fld:'vF_CFORMU',pic:'ZZZ9'},{av:'A5555Lb_opcion',fld:'LB_OPCION',pic:'@!'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A5537Lb_ColNum',fld:'LB_COLNUM',pic:'ZZZZZ9'},{av:'A5536Lb_ColNom',fld:'LB_COLNOM',pic:''},{av:'A5533Lb_ArtCod',fld:'LB_ARTCOD',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'Gx_msg',fld:'vMSG',pic:''},{av:'chkavSeleccionar.getColumnClass()',ctrl:'vSELECCIONAR',prop:'Columnclass'},{av:'edtLb_numero_Columnclass',ctrl:'LB_NUMERO',prop:'Columnclass'},{av:'edtCliCod_Columnclass',ctrl:'CLICOD',prop:'Columnclass'},{av:'edtLb_ArtCod_Columnclass',ctrl:'LB_ARTCOD',prop:'Columnclass'},{av:'edtLb_ColNomC_Columnclass',ctrl:'LB_COLNOMC',prop:'Columnclass'},{av:'edtLb_Rb_Columnclass',ctrl:'LB_RB',prop:'Columnclass'},{av:'edtLb_opcion_Columnclass',ctrl:'LB_OPCION',prop:'Columnclass'},{av:'edtLb_numop_Columnclass',ctrl:'LB_NUMOP',prop:'Columnclass'},{av:'edtLb_Cartaz_Columnclass',ctrl:'LB_CARTAZ',prop:'Columnclass'},{av:'edtLb_FechaE_Columnclass',ctrl:'LB_FECHAE',prop:'Columnclass'},{av:'edtLb_FechaEn_Columnclass',ctrl:'LB_FECHAEN',prop:'Columnclass'},{av:'cmbLb_Estado'},{av:'chkavSeleccionareliminar.getColumnClass()',ctrl:'vSELECCIONARELIMINAR',prop:'Columnclass'},{av:'AV77Seleccionar',fld:'vSELECCIONAR',pic:''},{av:'chkavSeleccionareliminar.getVisible()',ctrl:'vSELECCIONARELIMINAR',prop:'Visible'},{av:'AV78SeleccionarEliminar',fld:'vSELECCIONARELIMINAR',pic:''}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e171TR2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV41FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV36Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV59Lb_Cartaz',fld:'vLB_CARTAZ',pic:''},{av:'AV60Lb_ColNom',fld:'vLB_COLNOM',pic:''},{av:'AV65Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV62Lb_FechaEfrom',fld:'vLB_FECHAEFROM',pic:''},{av:'AV64Lb_FechaEto',fld:'vLB_FECHAETO',pic:''},{av:'AV61Lb_estado',fld:'vLB_ESTADO',pic:'9'},{av:'AV69ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV122TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV123TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV80TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV81TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV86TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV87TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV90TFLb_ColNomC',fld:'vTFLB_COLNOMC',pic:''},{av:'AV91TFLb_ColNomC_Sel',fld:'vTFLB_COLNOMC_SEL',pic:''},{av:'AV138TFLb_Rb',fld:'vTFLB_RB',pic:'ZZZ9.99'},{av:'AV139TFLb_Rb_To',fld:'vTFLB_RB_TO',pic:'ZZZ9.99'},{av:'AV130TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV131TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV124TFLb_numop',fld:'vTFLB_NUMOP',pic:'Z9'},{av:'AV125TFLb_numop_To',fld:'vTFLB_NUMOP_TO',pic:'Z9'},{av:'AV88TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV89TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV102TFLb_FechaE',fld:'vTFLB_FECHAE',pic:''},{av:'AV104TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV97TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV164Pgmname',fld:'vPGMNAME',pic:''},{av:'AV73OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV75OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV63Lb_fechaEn',fld:'vLB_FECHAEN',pic:''},{av:'AV39F_Cformu',fld:'vF_CFORMU',pic:'ZZZ9'},{av:'AV43ForUltUti',fld:'vFORULTUTI',pic:'',hsh:true},{av:'AV42Fornumcol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9'},{av:'Gx_msg',fld:'vMSG',pic:''},{av:'AV8Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV9Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'AV144Col_Lb_numeroE',fld:'vCOL_LB_NUMEROE',pic:''},{av:'AV145Col_Lb_opcionE',fld:'vCOL_LB_OPCIONE',pic:''},{av:'AV13coste',fld:'vCOSTE',pic:'ZZZZ9.99999',hsh:true},{av:'AV71Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV10ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV69ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'edtLb_numero_Visible',ctrl:'LB_NUMERO',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtLb_ArtCod_Visible',ctrl:'LB_ARTCOD',prop:'Visible'},{av:'edtLb_ColNomC_Visible',ctrl:'LB_COLNOMC',prop:'Visible'},{av:'edtLb_Rb_Visible',ctrl:'LB_RB',prop:'Visible'},{av:'edtLb_opcion_Visible',ctrl:'LB_OPCION',prop:'Visible'},{av:'edtLb_numop_Visible',ctrl:'LB_NUMOP',prop:'Visible'},{av:'edtLb_Cartaz_Visible',ctrl:'LB_CARTAZ',prop:'Visible'},{av:'edtLb_FechaE_Visible',ctrl:'LB_FECHAE',prop:'Visible'},{av:'edtLb_FechaEn_Visible',ctrl:'LB_FECHAEN',prop:'Visible'},{av:'cmbLb_Estado'},{av:'chkavSeleccionareliminar.getVisible()',ctrl:'vSELECCIONARELIMINAR',prop:'Visible'},{av:'AV45GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV46GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'chkavSeleccionar.getColumnHeaderClass()',ctrl:'vSELECCIONAR',prop:'Columnheaderclass'},{av:'edtLb_numero_Columnheaderclass',ctrl:'LB_NUMERO',prop:'Columnheaderclass'},{av:'edtCliCod_Columnheaderclass',ctrl:'CLICOD',prop:'Columnheaderclass'},{av:'edtLb_ArtCod_Columnheaderclass',ctrl:'LB_ARTCOD',prop:'Columnheaderclass'},{av:'edtLb_ColNomC_Columnheaderclass',ctrl:'LB_COLNOMC',prop:'Columnheaderclass'},{av:'edtLb_Rb_Columnheaderclass',ctrl:'LB_RB',prop:'Columnheaderclass'},{av:'edtLb_opcion_Columnheaderclass',ctrl:'LB_OPCION',prop:'Columnheaderclass'},{av:'edtLb_numop_Columnheaderclass',ctrl:'LB_NUMOP',prop:'Columnheaderclass'},{av:'edtLb_Cartaz_Columnheaderclass',ctrl:'LB_CARTAZ',prop:'Columnheaderclass'},{av:'edtLb_FechaE_Columnheaderclass',ctrl:'LB_FECHAE',prop:'Columnheaderclass'},{av:'edtLb_FechaEn_Columnheaderclass',ctrl:'LB_FECHAEN',prop:'Columnheaderclass'},{av:'chkavSeleccionareliminar.getColumnHeaderClass()',ctrl:'vSELECCIONARELIMINAR',prop:'Columnheaderclass'},{ctrl:'BTNENVIOOPCIONA',prop:'Visible'},{av:'AV68ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV47GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e131TR2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV41FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV36Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV59Lb_Cartaz',fld:'vLB_CARTAZ',pic:''},{av:'AV60Lb_ColNom',fld:'vLB_COLNOM',pic:''},{av:'AV65Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV62Lb_FechaEfrom',fld:'vLB_FECHAEFROM',pic:''},{av:'AV64Lb_FechaEto',fld:'vLB_FECHAETO',pic:''},{av:'AV61Lb_estado',fld:'vLB_ESTADO',pic:'9'},{av:'AV69ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV122TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV123TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV80TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV81TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV86TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV87TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV90TFLb_ColNomC',fld:'vTFLB_COLNOMC',pic:''},{av:'AV91TFLb_ColNomC_Sel',fld:'vTFLB_COLNOMC_SEL',pic:''},{av:'AV138TFLb_Rb',fld:'vTFLB_RB',pic:'ZZZ9.99'},{av:'AV139TFLb_Rb_To',fld:'vTFLB_RB_TO',pic:'ZZZ9.99'},{av:'AV130TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV131TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV124TFLb_numop',fld:'vTFLB_NUMOP',pic:'Z9'},{av:'AV125TFLb_numop_To',fld:'vTFLB_NUMOP_TO',pic:'Z9'},{av:'AV88TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV89TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV102TFLb_FechaE',fld:'vTFLB_FECHAE',pic:''},{av:'AV104TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV97TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV164Pgmname',fld:'vPGMNAME',pic:''},{av:'AV73OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV75OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV63Lb_fechaEn',fld:'vLB_FECHAEN',pic:''},{av:'AV39F_Cformu',fld:'vF_CFORMU',pic:'ZZZ9'},{av:'AV43ForUltUti',fld:'vFORULTUTI',pic:'',hsh:true},{av:'AV42Fornumcol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9'},{av:'Gx_msg',fld:'vMSG',pic:''},{av:'AV8Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV9Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'AV144Col_Lb_numeroE',fld:'vCOL_LB_NUMEROE',pic:''},{av:'AV145Col_Lb_opcionE',fld:'vCOL_LB_OPCIONE',pic:''},{av:'AV13coste',fld:'vCOSTE',pic:'ZZZZ9.99999',hsh:true},{av:'AV71Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV47GridState',fld:'vGRIDSTATE',pic:''},{av:'AV98TFLb_Estado_SelsJson',fld:'vTFLB_ESTADO_SELSJSON',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV69ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV47GridState',fld:'vGRIDSTATE',pic:''},{av:'AV73OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV75OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV41FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV122TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV123TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV80TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV81TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV86TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV87TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV90TFLb_ColNomC',fld:'vTFLB_COLNOMC',pic:''},{av:'AV91TFLb_ColNomC_Sel',fld:'vTFLB_COLNOMC_SEL',pic:''},{av:'AV138TFLb_Rb',fld:'vTFLB_RB',pic:'ZZZ9.99'},{av:'AV139TFLb_Rb_To',fld:'vTFLB_RB_TO',pic:'ZZZ9.99'},{av:'AV130TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV131TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV124TFLb_numop',fld:'vTFLB_NUMOP',pic:'Z9'},{av:'AV125TFLb_numop_To',fld:'vTFLB_NUMOP_TO',pic:'Z9'},{av:'AV88TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV89TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV102TFLb_FechaE',fld:'vTFLB_FECHAE',pic:''},{av:'AV104TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV97TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV98TFLb_Estado_SelsJson',fld:'vTFLB_ESTADO_SELSJSON',pic:''},{av:'AV10ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'edtLb_numero_Visible',ctrl:'LB_NUMERO',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtLb_ArtCod_Visible',ctrl:'LB_ARTCOD',prop:'Visible'},{av:'edtLb_ColNomC_Visible',ctrl:'LB_COLNOMC',prop:'Visible'},{av:'edtLb_Rb_Visible',ctrl:'LB_RB',prop:'Visible'},{av:'edtLb_opcion_Visible',ctrl:'LB_OPCION',prop:'Visible'},{av:'edtLb_numop_Visible',ctrl:'LB_NUMOP',prop:'Visible'},{av:'edtLb_Cartaz_Visible',ctrl:'LB_CARTAZ',prop:'Visible'},{av:'edtLb_FechaE_Visible',ctrl:'LB_FECHAE',prop:'Visible'},{av:'edtLb_FechaEn_Visible',ctrl:'LB_FECHAEN',prop:'Visible'},{av:'cmbLb_Estado'},{av:'chkavSeleccionareliminar.getVisible()',ctrl:'vSELECCIONARELIMINAR',prop:'Visible'},{av:'AV45GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV46GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'chkavSeleccionar.getColumnHeaderClass()',ctrl:'vSELECCIONAR',prop:'Columnheaderclass'},{av:'edtLb_numero_Columnheaderclass',ctrl:'LB_NUMERO',prop:'Columnheaderclass'},{av:'edtCliCod_Columnheaderclass',ctrl:'CLICOD',prop:'Columnheaderclass'},{av:'edtLb_ArtCod_Columnheaderclass',ctrl:'LB_ARTCOD',prop:'Columnheaderclass'},{av:'edtLb_ColNomC_Columnheaderclass',ctrl:'LB_COLNOMC',prop:'Columnheaderclass'},{av:'edtLb_Rb_Columnheaderclass',ctrl:'LB_RB',prop:'Columnheaderclass'},{av:'edtLb_opcion_Columnheaderclass',ctrl:'LB_OPCION',prop:'Columnheaderclass'},{av:'edtLb_numop_Columnheaderclass',ctrl:'LB_NUMOP',prop:'Columnheaderclass'},{av:'edtLb_Cartaz_Columnheaderclass',ctrl:'LB_CARTAZ',prop:'Columnheaderclass'},{av:'edtLb_FechaE_Columnheaderclass',ctrl:'LB_FECHAE',prop:'Columnheaderclass'},{av:'edtLb_FechaEn_Columnheaderclass',ctrl:'LB_FECHAEN',prop:'Columnheaderclass'},{av:'chkavSeleccionareliminar.getColumnHeaderClass()',ctrl:'vSELECCIONARELIMINAR',prop:'Columnheaderclass'},{ctrl:'BTNENVIOOPCIONA',prop:'Visible'},{av:'AV68ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("'DOLABDIPCOSTE'","{handler:'e211TR2',iparms:[{av:'AV8Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV9Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'A5540Lb_Cartaz',fld:'LB_CARTAZ',pic:''},{av:'AV13coste',fld:'vCOSTE',pic:'ZZZZ9.99999',hsh:true},{av:'AV36Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV59Lb_Cartaz',fld:'vLB_CARTAZ',pic:''},{av:'AV63Lb_fechaEn',fld:'vLB_FECHAEN',pic:''},{av:'AV67Lb_Rb',fld:'vLB_RB',pic:'ZZZ9.99'}]");
      setEventMetadata("'DOLABDIPCOSTE'",",oparms:[{av:'AV67Lb_Rb',fld:'vLB_RB',pic:'ZZZ9.99'},{av:'AV63Lb_fechaEn',fld:'vLB_FECHAEN',pic:''},{av:'AV59Lb_Cartaz',fld:'vLB_CARTAZ',pic:''},{av:'AV6Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV36Emprcod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOENVIAR'","{handler:'e111TR1',iparms:[{av:'AV8Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV63Lb_fechaEn',fld:'vLB_FECHAEN',pic:''},{av:'A5541Lb_FechaE',fld:'LB_FECHAE',pic:''}]");
      setEventMetadata("'DOENVIAR'",",oparms:[{av:'Gx_msg',fld:'vMSG',pic:''}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ENVIAR.CLOSE","{handler:'e181TR2',iparms:[{av:'Dvelop_confirmpanel_enviar_Result',ctrl:'DVELOP_CONFIRMPANEL_ENVIAR',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV41FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV36Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV59Lb_Cartaz',fld:'vLB_CARTAZ',pic:''},{av:'AV60Lb_ColNom',fld:'vLB_COLNOM',pic:''},{av:'AV65Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV62Lb_FechaEfrom',fld:'vLB_FECHAEFROM',pic:''},{av:'AV64Lb_FechaEto',fld:'vLB_FECHAETO',pic:''},{av:'AV61Lb_estado',fld:'vLB_ESTADO',pic:'9'},{av:'AV69ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV122TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV123TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV80TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV81TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV86TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV87TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV90TFLb_ColNomC',fld:'vTFLB_COLNOMC',pic:''},{av:'AV91TFLb_ColNomC_Sel',fld:'vTFLB_COLNOMC_SEL',pic:''},{av:'AV138TFLb_Rb',fld:'vTFLB_RB',pic:'ZZZ9.99'},{av:'AV139TFLb_Rb_To',fld:'vTFLB_RB_TO',pic:'ZZZ9.99'},{av:'AV130TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV131TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV124TFLb_numop',fld:'vTFLB_NUMOP',pic:'Z9'},{av:'AV125TFLb_numop_To',fld:'vTFLB_NUMOP_TO',pic:'Z9'},{av:'AV88TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV89TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV102TFLb_FechaE',fld:'vTFLB_FECHAE',pic:''},{av:'AV104TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV97TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV164Pgmname',fld:'vPGMNAME',pic:''},{av:'AV73OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV75OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV63Lb_fechaEn',fld:'vLB_FECHAEN',pic:''},{av:'AV39F_Cformu',fld:'vF_CFORMU',pic:'ZZZ9'},{av:'AV43ForUltUti',fld:'vFORULTUTI',pic:'',hsh:true},{av:'AV42Fornumcol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9'},{av:'Gx_msg',fld:'vMSG',pic:''},{av:'AV8Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV9Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'AV144Col_Lb_numeroE',fld:'vCOL_LB_NUMEROE',pic:''},{av:'AV145Col_Lb_opcionE',fld:'vCOL_LB_OPCIONE',pic:''},{av:'AV13coste',fld:'vCOSTE',pic:'ZZZZ9.99999',hsh:true},{av:'AV71Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'AV54IN_Lb_numerol',fld:'vIN_LB_NUMEROL',pic:'ZZZZZZZ9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ENVIAR.CLOSE",",oparms:[{av:'AV63Lb_fechaEn',fld:'vLB_FECHAEN',pic:''},{av:'AV36Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'AV54IN_Lb_numerol',fld:'vIN_LB_NUMEROL',pic:'ZZZZZZZ9'},{av:'AV8Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV9Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'AV69ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'edtLb_numero_Visible',ctrl:'LB_NUMERO',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtLb_ArtCod_Visible',ctrl:'LB_ARTCOD',prop:'Visible'},{av:'edtLb_ColNomC_Visible',ctrl:'LB_COLNOMC',prop:'Visible'},{av:'edtLb_Rb_Visible',ctrl:'LB_RB',prop:'Visible'},{av:'edtLb_opcion_Visible',ctrl:'LB_OPCION',prop:'Visible'},{av:'edtLb_numop_Visible',ctrl:'LB_NUMOP',prop:'Visible'},{av:'edtLb_Cartaz_Visible',ctrl:'LB_CARTAZ',prop:'Visible'},{av:'edtLb_FechaE_Visible',ctrl:'LB_FECHAE',prop:'Visible'},{av:'edtLb_FechaEn_Visible',ctrl:'LB_FECHAEN',prop:'Visible'},{av:'cmbLb_Estado'},{av:'chkavSeleccionareliminar.getVisible()',ctrl:'vSELECCIONARELIMINAR',prop:'Visible'},{av:'AV45GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV46GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'chkavSeleccionar.getColumnHeaderClass()',ctrl:'vSELECCIONAR',prop:'Columnheaderclass'},{av:'edtLb_numero_Columnheaderclass',ctrl:'LB_NUMERO',prop:'Columnheaderclass'},{av:'edtCliCod_Columnheaderclass',ctrl:'CLICOD',prop:'Columnheaderclass'},{av:'edtLb_ArtCod_Columnheaderclass',ctrl:'LB_ARTCOD',prop:'Columnheaderclass'},{av:'edtLb_ColNomC_Columnheaderclass',ctrl:'LB_COLNOMC',prop:'Columnheaderclass'},{av:'edtLb_Rb_Columnheaderclass',ctrl:'LB_RB',prop:'Columnheaderclass'},{av:'edtLb_opcion_Columnheaderclass',ctrl:'LB_OPCION',prop:'Columnheaderclass'},{av:'edtLb_numop_Columnheaderclass',ctrl:'LB_NUMOP',prop:'Columnheaderclass'},{av:'edtLb_Cartaz_Columnheaderclass',ctrl:'LB_CARTAZ',prop:'Columnheaderclass'},{av:'edtLb_FechaE_Columnheaderclass',ctrl:'LB_FECHAE',prop:'Columnheaderclass'},{av:'edtLb_FechaEn_Columnheaderclass',ctrl:'LB_FECHAEN',prop:'Columnheaderclass'},{av:'chkavSeleccionareliminar.getColumnHeaderClass()',ctrl:'vSELECCIONARELIMINAR',prop:'Columnheaderclass'},{ctrl:'BTNENVIOOPCIONA',prop:'Visible'},{av:'AV68ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV47GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOMARCARTODOS'","{handler:'e221TR2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV41FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV36Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV59Lb_Cartaz',fld:'vLB_CARTAZ',pic:''},{av:'AV60Lb_ColNom',fld:'vLB_COLNOM',pic:''},{av:'AV65Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV62Lb_FechaEfrom',fld:'vLB_FECHAEFROM',pic:''},{av:'AV64Lb_FechaEto',fld:'vLB_FECHAETO',pic:''},{av:'AV61Lb_estado',fld:'vLB_ESTADO',pic:'9'},{av:'AV69ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV122TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV123TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV80TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV81TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV86TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV87TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV90TFLb_ColNomC',fld:'vTFLB_COLNOMC',pic:''},{av:'AV91TFLb_ColNomC_Sel',fld:'vTFLB_COLNOMC_SEL',pic:''},{av:'AV138TFLb_Rb',fld:'vTFLB_RB',pic:'ZZZ9.99'},{av:'AV139TFLb_Rb_To',fld:'vTFLB_RB_TO',pic:'ZZZ9.99'},{av:'AV130TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV131TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV124TFLb_numop',fld:'vTFLB_NUMOP',pic:'Z9'},{av:'AV125TFLb_numop_To',fld:'vTFLB_NUMOP_TO',pic:'Z9'},{av:'AV88TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV89TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV102TFLb_FechaE',fld:'vTFLB_FECHAE',pic:''},{av:'AV104TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV97TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV164Pgmname',fld:'vPGMNAME',pic:''},{av:'AV73OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV75OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV63Lb_fechaEn',fld:'vLB_FECHAEN',pic:''},{av:'AV39F_Cformu',fld:'vF_CFORMU',grid:80,pic:'ZZZ9'},{av:'nRC_GXsfl_80',ctrl:'GRID',grid:80,prop:'GridRC',grid:80},{av:'AV43ForUltUti',fld:'vFORULTUTI',pic:'',hsh:true},{av:'AV42Fornumcol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9'},{av:'Gx_msg',fld:'vMSG',pic:''},{av:'AV8Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV9Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'AV144Col_Lb_numeroE',fld:'vCOL_LB_NUMEROE',pic:''},{av:'AV145Col_Lb_opcionE',fld:'vCOL_LB_OPCIONE',pic:''},{av:'AV13coste',fld:'vCOSTE',pic:'ZZZZ9.99999',hsh:true},{av:'AV71Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'A5532Lb_numero',fld:'LB_NUMERO',grid:80,pic:'ZZZZZZZ9'},{av:'A5555Lb_opcion',fld:'LB_OPCION',grid:80,pic:'@!'}]");
      setEventMetadata("'DOMARCARTODOS'",",oparms:[{av:'AV8Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV9Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'AV69ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'edtLb_numero_Visible',ctrl:'LB_NUMERO',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtLb_ArtCod_Visible',ctrl:'LB_ARTCOD',prop:'Visible'},{av:'edtLb_ColNomC_Visible',ctrl:'LB_COLNOMC',prop:'Visible'},{av:'edtLb_Rb_Visible',ctrl:'LB_RB',prop:'Visible'},{av:'edtLb_opcion_Visible',ctrl:'LB_OPCION',prop:'Visible'},{av:'edtLb_numop_Visible',ctrl:'LB_NUMOP',prop:'Visible'},{av:'edtLb_Cartaz_Visible',ctrl:'LB_CARTAZ',prop:'Visible'},{av:'edtLb_FechaE_Visible',ctrl:'LB_FECHAE',prop:'Visible'},{av:'edtLb_FechaEn_Visible',ctrl:'LB_FECHAEN',prop:'Visible'},{av:'cmbLb_Estado'},{av:'chkavSeleccionareliminar.getVisible()',ctrl:'vSELECCIONARELIMINAR',prop:'Visible'},{av:'AV45GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV46GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'chkavSeleccionar.getColumnHeaderClass()',ctrl:'vSELECCIONAR',prop:'Columnheaderclass'},{av:'edtLb_numero_Columnheaderclass',ctrl:'LB_NUMERO',prop:'Columnheaderclass'},{av:'edtCliCod_Columnheaderclass',ctrl:'CLICOD',prop:'Columnheaderclass'},{av:'edtLb_ArtCod_Columnheaderclass',ctrl:'LB_ARTCOD',prop:'Columnheaderclass'},{av:'edtLb_ColNomC_Columnheaderclass',ctrl:'LB_COLNOMC',prop:'Columnheaderclass'},{av:'edtLb_Rb_Columnheaderclass',ctrl:'LB_RB',prop:'Columnheaderclass'},{av:'edtLb_opcion_Columnheaderclass',ctrl:'LB_OPCION',prop:'Columnheaderclass'},{av:'edtLb_numop_Columnheaderclass',ctrl:'LB_NUMOP',prop:'Columnheaderclass'},{av:'edtLb_Cartaz_Columnheaderclass',ctrl:'LB_CARTAZ',prop:'Columnheaderclass'},{av:'edtLb_FechaE_Columnheaderclass',ctrl:'LB_FECHAE',prop:'Columnheaderclass'},{av:'edtLb_FechaEn_Columnheaderclass',ctrl:'LB_FECHAEN',prop:'Columnheaderclass'},{av:'chkavSeleccionareliminar.getColumnHeaderClass()',ctrl:'vSELECCIONARELIMINAR',prop:'Columnheaderclass'},{ctrl:'BTNENVIOOPCIONA',prop:'Visible'},{av:'AV68ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV47GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DODESMARCARTODOS'","{handler:'e231TR2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV41FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV36Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV59Lb_Cartaz',fld:'vLB_CARTAZ',pic:''},{av:'AV60Lb_ColNom',fld:'vLB_COLNOM',pic:''},{av:'AV65Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV62Lb_FechaEfrom',fld:'vLB_FECHAEFROM',pic:''},{av:'AV64Lb_FechaEto',fld:'vLB_FECHAETO',pic:''},{av:'AV61Lb_estado',fld:'vLB_ESTADO',pic:'9'},{av:'AV69ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV122TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV123TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV80TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV81TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV86TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV87TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV90TFLb_ColNomC',fld:'vTFLB_COLNOMC',pic:''},{av:'AV91TFLb_ColNomC_Sel',fld:'vTFLB_COLNOMC_SEL',pic:''},{av:'AV138TFLb_Rb',fld:'vTFLB_RB',pic:'ZZZ9.99'},{av:'AV139TFLb_Rb_To',fld:'vTFLB_RB_TO',pic:'ZZZ9.99'},{av:'AV130TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV131TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV124TFLb_numop',fld:'vTFLB_NUMOP',pic:'Z9'},{av:'AV125TFLb_numop_To',fld:'vTFLB_NUMOP_TO',pic:'Z9'},{av:'AV88TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV89TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV102TFLb_FechaE',fld:'vTFLB_FECHAE',pic:''},{av:'AV104TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV97TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV164Pgmname',fld:'vPGMNAME',pic:''},{av:'AV73OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV75OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV63Lb_fechaEn',fld:'vLB_FECHAEN',pic:''},{av:'AV39F_Cformu',fld:'vF_CFORMU',pic:'ZZZ9'},{av:'AV43ForUltUti',fld:'vFORULTUTI',pic:'',hsh:true},{av:'AV42Fornumcol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9'},{av:'Gx_msg',fld:'vMSG',pic:''},{av:'AV8Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV9Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'AV144Col_Lb_numeroE',fld:'vCOL_LB_NUMEROE',pic:''},{av:'AV145Col_Lb_opcionE',fld:'vCOL_LB_OPCIONE',pic:''},{av:'AV13coste',fld:'vCOSTE',pic:'ZZZZ9.99999',hsh:true},{av:'AV71Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'sPrefix'}]");
      setEventMetadata("'DODESMARCARTODOS'",",oparms:[{av:'AV8Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV9Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'AV69ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'edtLb_numero_Visible',ctrl:'LB_NUMERO',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtLb_ArtCod_Visible',ctrl:'LB_ARTCOD',prop:'Visible'},{av:'edtLb_ColNomC_Visible',ctrl:'LB_COLNOMC',prop:'Visible'},{av:'edtLb_Rb_Visible',ctrl:'LB_RB',prop:'Visible'},{av:'edtLb_opcion_Visible',ctrl:'LB_OPCION',prop:'Visible'},{av:'edtLb_numop_Visible',ctrl:'LB_NUMOP',prop:'Visible'},{av:'edtLb_Cartaz_Visible',ctrl:'LB_CARTAZ',prop:'Visible'},{av:'edtLb_FechaE_Visible',ctrl:'LB_FECHAE',prop:'Visible'},{av:'edtLb_FechaEn_Visible',ctrl:'LB_FECHAEN',prop:'Visible'},{av:'cmbLb_Estado'},{av:'chkavSeleccionareliminar.getVisible()',ctrl:'vSELECCIONARELIMINAR',prop:'Visible'},{av:'AV45GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV46GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'chkavSeleccionar.getColumnHeaderClass()',ctrl:'vSELECCIONAR',prop:'Columnheaderclass'},{av:'edtLb_numero_Columnheaderclass',ctrl:'LB_NUMERO',prop:'Columnheaderclass'},{av:'edtCliCod_Columnheaderclass',ctrl:'CLICOD',prop:'Columnheaderclass'},{av:'edtLb_ArtCod_Columnheaderclass',ctrl:'LB_ARTCOD',prop:'Columnheaderclass'},{av:'edtLb_ColNomC_Columnheaderclass',ctrl:'LB_COLNOMC',prop:'Columnheaderclass'},{av:'edtLb_Rb_Columnheaderclass',ctrl:'LB_RB',prop:'Columnheaderclass'},{av:'edtLb_opcion_Columnheaderclass',ctrl:'LB_OPCION',prop:'Columnheaderclass'},{av:'edtLb_numop_Columnheaderclass',ctrl:'LB_NUMOP',prop:'Columnheaderclass'},{av:'edtLb_Cartaz_Columnheaderclass',ctrl:'LB_CARTAZ',prop:'Columnheaderclass'},{av:'edtLb_FechaE_Columnheaderclass',ctrl:'LB_FECHAE',prop:'Columnheaderclass'},{av:'edtLb_FechaEn_Columnheaderclass',ctrl:'LB_FECHAEN',prop:'Columnheaderclass'},{av:'chkavSeleccionareliminar.getColumnHeaderClass()',ctrl:'vSELECCIONARELIMINAR',prop:'Columnheaderclass'},{ctrl:'BTNENVIOOPCIONA',prop:'Visible'},{av:'AV68ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV47GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOELIMINAR'","{handler:'e121TR1',iparms:[{av:'AV144Col_Lb_numeroE',fld:'vCOL_LB_NUMEROE',pic:''}]");
      setEventMetadata("'DOELIMINAR'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE","{handler:'e191TR2',iparms:[{av:'Dvelop_confirmpanel_eliminar_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINAR',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV41FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV36Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV59Lb_Cartaz',fld:'vLB_CARTAZ',pic:''},{av:'AV60Lb_ColNom',fld:'vLB_COLNOM',pic:''},{av:'AV65Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV62Lb_FechaEfrom',fld:'vLB_FECHAEFROM',pic:''},{av:'AV64Lb_FechaEto',fld:'vLB_FECHAETO',pic:''},{av:'AV61Lb_estado',fld:'vLB_ESTADO',pic:'9'},{av:'AV69ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV122TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV123TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV80TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV81TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV86TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV87TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV90TFLb_ColNomC',fld:'vTFLB_COLNOMC',pic:''},{av:'AV91TFLb_ColNomC_Sel',fld:'vTFLB_COLNOMC_SEL',pic:''},{av:'AV138TFLb_Rb',fld:'vTFLB_RB',pic:'ZZZ9.99'},{av:'AV139TFLb_Rb_To',fld:'vTFLB_RB_TO',pic:'ZZZ9.99'},{av:'AV130TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV131TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV124TFLb_numop',fld:'vTFLB_NUMOP',pic:'Z9'},{av:'AV125TFLb_numop_To',fld:'vTFLB_NUMOP_TO',pic:'Z9'},{av:'AV88TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV89TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV102TFLb_FechaE',fld:'vTFLB_FECHAE',pic:''},{av:'AV104TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV97TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV164Pgmname',fld:'vPGMNAME',pic:''},{av:'AV73OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV75OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV63Lb_fechaEn',fld:'vLB_FECHAEN',pic:''},{av:'AV39F_Cformu',fld:'vF_CFORMU',grid:80,pic:'ZZZ9'},{av:'nRC_GXsfl_80',ctrl:'GRID',grid:80,prop:'GridRC',grid:80},{av:'AV43ForUltUti',fld:'vFORULTUTI',pic:'',hsh:true},{av:'AV42Fornumcol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9'},{av:'Gx_msg',fld:'vMSG',pic:''},{av:'AV8Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV9Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'AV144Col_Lb_numeroE',fld:'vCOL_LB_NUMEROE',pic:''},{av:'AV145Col_Lb_opcionE',fld:'vCOL_LB_OPCIONE',pic:''},{av:'AV13coste',fld:'vCOSTE',pic:'ZZZZ9.99999',hsh:true},{av:'AV71Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'A5566Lb_Estado',fld:'LB_ESTADO',grid:80,pic:'9',hsh:true},{av:'AV52IN_lb_fechaen',fld:'vIN_LB_FECHAEN',pic:''},{av:'A252CliCod',fld:'CLICOD',grid:80,pic:'ZZZZZ9'},{av:'A5532Lb_numero',fld:'LB_NUMERO',grid:80,pic:'ZZZZZZZ9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE",",oparms:[{av:'AV36Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV54IN_Lb_numerol',fld:'vIN_LB_NUMEROL',pic:'ZZZZZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'AV52IN_lb_fechaen',fld:'vIN_LB_FECHAEN',pic:''},{av:'A5532Lb_numero',fld:'LB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV8Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV9Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'AV144Col_Lb_numeroE',fld:'vCOL_LB_NUMEROE',pic:''},{av:'AV145Col_Lb_opcionE',fld:'vCOL_LB_OPCIONE',pic:''},{av:'AV69ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'edtLb_numero_Visible',ctrl:'LB_NUMERO',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtLb_ArtCod_Visible',ctrl:'LB_ARTCOD',prop:'Visible'},{av:'edtLb_ColNomC_Visible',ctrl:'LB_COLNOMC',prop:'Visible'},{av:'edtLb_Rb_Visible',ctrl:'LB_RB',prop:'Visible'},{av:'edtLb_opcion_Visible',ctrl:'LB_OPCION',prop:'Visible'},{av:'edtLb_numop_Visible',ctrl:'LB_NUMOP',prop:'Visible'},{av:'edtLb_Cartaz_Visible',ctrl:'LB_CARTAZ',prop:'Visible'},{av:'edtLb_FechaE_Visible',ctrl:'LB_FECHAE',prop:'Visible'},{av:'edtLb_FechaEn_Visible',ctrl:'LB_FECHAEN',prop:'Visible'},{av:'cmbLb_Estado'},{av:'chkavSeleccionareliminar.getVisible()',ctrl:'vSELECCIONARELIMINAR',prop:'Visible'},{av:'AV45GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV46GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'chkavSeleccionar.getColumnHeaderClass()',ctrl:'vSELECCIONAR',prop:'Columnheaderclass'},{av:'edtLb_numero_Columnheaderclass',ctrl:'LB_NUMERO',prop:'Columnheaderclass'},{av:'edtCliCod_Columnheaderclass',ctrl:'CLICOD',prop:'Columnheaderclass'},{av:'edtLb_ArtCod_Columnheaderclass',ctrl:'LB_ARTCOD',prop:'Columnheaderclass'},{av:'edtLb_ColNomC_Columnheaderclass',ctrl:'LB_COLNOMC',prop:'Columnheaderclass'},{av:'edtLb_Rb_Columnheaderclass',ctrl:'LB_RB',prop:'Columnheaderclass'},{av:'edtLb_opcion_Columnheaderclass',ctrl:'LB_OPCION',prop:'Columnheaderclass'},{av:'edtLb_numop_Columnheaderclass',ctrl:'LB_NUMOP',prop:'Columnheaderclass'},{av:'edtLb_Cartaz_Columnheaderclass',ctrl:'LB_CARTAZ',prop:'Columnheaderclass'},{av:'edtLb_FechaE_Columnheaderclass',ctrl:'LB_FECHAE',prop:'Columnheaderclass'},{av:'edtLb_FechaEn_Columnheaderclass',ctrl:'LB_FECHAEN',prop:'Columnheaderclass'},{av:'chkavSeleccionareliminar.getColumnHeaderClass()',ctrl:'vSELECCIONARELIMINAR',prop:'Columnheaderclass'},{ctrl:'BTNENVIOOPCIONA',prop:'Visible'},{av:'AV68ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV47GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOLABDIP'","{handler:'e241TR2',iparms:[{av:'AV8Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV9Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'A5540Lb_Cartaz',fld:'LB_CARTAZ',pic:''},{av:'AV13coste',fld:'vCOSTE',pic:'ZZZZ9.99999',hsh:true},{av:'AV36Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV59Lb_Cartaz',fld:'vLB_CARTAZ',pic:''},{av:'AV63Lb_fechaEn',fld:'vLB_FECHAEN',pic:''}]");
      setEventMetadata("'DOLABDIP'",",oparms:[{av:'AV63Lb_fechaEn',fld:'vLB_FECHAEN',pic:''},{av:'AV59Lb_Cartaz',fld:'vLB_CARTAZ',pic:''},{av:'AV6Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV36Emprcod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOENVIOOPCIONA'","{handler:'e251TR2',iparms:[{av:'A5555Lb_opcion',fld:'LB_OPCION',grid:80,pic:'@!'},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_80',ctrl:'GRID',grid:80,prop:'GridRC',grid:80},{av:'AV65Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV39F_Cformu',fld:'vF_CFORMU',grid:80,pic:'ZZZ9'},{av:'A252CliCod',fld:'CLICOD',grid:80,pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A5533Lb_ArtCod',fld:'LB_ARTCOD',grid:80,pic:''},{av:'A5536Lb_ColNom',fld:'LB_COLNOM',pic:''},{av:'A5537Lb_ColNum',fld:'LB_COLNUM',pic:'ZZZZZ9'},{av:'AV154TipColcod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'A5538Lb_ColNomC',fld:'LB_COLNOMC',grid:80,pic:''},{av:'AV151CliNom',fld:'vCLINOM',pic:''},{av:'AV155Lb_colnomc',fld:'vLB_COLNOMC',pic:''},{av:'AV153lb_colNum',fld:'vLB_COLNUM',pic:'ZZZZZ9'},{av:'AV36Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV42Fornumcol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV156Numform',fld:'vNUMFORM',pic:'ZZZ9'}]");
      setEventMetadata("'DOENVIOOPCIONA'",",oparms:[{av:'AV6Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV151CliNom',fld:'vCLINOM',pic:''},{av:'AV60Lb_ColNom',fld:'vLB_COLNOM',pic:''},{av:'AV153lb_colNum',fld:'vLB_COLNUM',pic:'ZZZZZ9'},{av:'AV154TipColcod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV155Lb_colnomc',fld:'vLB_COLNOMC',pic:''},{av:'AV156Numform',fld:'vNUMFORM',pic:'ZZZ9'},{av:'AV42Fornumcol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV36Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'Dvelop_confirmpanel_envioopciona_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_ENVIOOPCIONA',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ENVIOOPCIONA.CLOSE","{handler:'e201TR2',iparms:[{av:'Dvelop_confirmpanel_envioopciona_Result',ctrl:'DVELOP_CONFIRMPANEL_ENVIOOPCIONA',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV41FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV36Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV59Lb_Cartaz',fld:'vLB_CARTAZ',pic:''},{av:'AV60Lb_ColNom',fld:'vLB_COLNOM',pic:''},{av:'AV65Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV62Lb_FechaEfrom',fld:'vLB_FECHAEFROM',pic:''},{av:'AV64Lb_FechaEto',fld:'vLB_FECHAETO',pic:''},{av:'AV61Lb_estado',fld:'vLB_ESTADO',pic:'9'},{av:'AV69ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV122TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV123TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV80TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV81TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV86TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV87TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV90TFLb_ColNomC',fld:'vTFLB_COLNOMC',pic:''},{av:'AV91TFLb_ColNomC_Sel',fld:'vTFLB_COLNOMC_SEL',pic:''},{av:'AV138TFLb_Rb',fld:'vTFLB_RB',pic:'ZZZ9.99'},{av:'AV139TFLb_Rb_To',fld:'vTFLB_RB_TO',pic:'ZZZ9.99'},{av:'AV130TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV131TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV124TFLb_numop',fld:'vTFLB_NUMOP',pic:'Z9'},{av:'AV125TFLb_numop_To',fld:'vTFLB_NUMOP_TO',pic:'Z9'},{av:'AV88TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV89TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV102TFLb_FechaE',fld:'vTFLB_FECHAE',pic:''},{av:'AV104TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV97TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV164Pgmname',fld:'vPGMNAME',pic:''},{av:'AV73OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV75OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV63Lb_fechaEn',fld:'vLB_FECHAEN',pic:''},{av:'AV39F_Cformu',fld:'vF_CFORMU',grid:80,pic:'ZZZ9'},{av:'nRC_GXsfl_80',ctrl:'GRID',grid:80,prop:'GridRC',grid:80},{av:'AV43ForUltUti',fld:'vFORULTUTI',pic:'',hsh:true},{av:'AV42Fornumcol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9'},{av:'Gx_msg',fld:'vMSG',pic:''},{av:'AV8Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV9Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'AV144Col_Lb_numeroE',fld:'vCOL_LB_NUMEROE',pic:''},{av:'AV145Col_Lb_opcionE',fld:'vCOL_LB_OPCIONE',pic:''},{av:'AV13coste',fld:'vCOSTE',pic:'ZZZZ9.99999',hsh:true},{av:'AV71Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'A5555Lb_opcion',fld:'LB_OPCION',grid:80,pic:'@!'},{av:'A5532Lb_numero',fld:'LB_NUMERO',grid:80,pic:'ZZZZZZZ9'},{av:'A5565Lb_CosteE',fld:'LB_COSTEE',grid:80,pic:'ZZZZ9.99999'},{av:'A5599Lb_RGB',fld:'LB_RGB',grid:80,pic:'ZZZZZZZZZ9'},{av:'A5537Lb_ColNum',fld:'LB_COLNUM',pic:'ZZZZZ9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ENVIOOPCIONA.CLOSE",",oparms:[{av:'A5537Lb_ColNum',fld:'LB_COLNUM',pic:'ZZZZZ9'},{av:'AV39F_Cformu',fld:'vF_CFORMU',pic:'ZZZ9'},{av:'A5599Lb_RGB',fld:'LB_RGB',pic:'ZZZZZZZZZ9'},{av:'A5565Lb_CosteE',fld:'LB_COSTEE',pic:'ZZZZ9.99999'},{av:'AV63Lb_fechaEn',fld:'vLB_FECHAEN',pic:''},{av:'A5555Lb_opcion',fld:'LB_OPCION',pic:'@!'},{av:'A5532Lb_numero',fld:'LB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV36Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV69ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'edtLb_numero_Visible',ctrl:'LB_NUMERO',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtLb_ArtCod_Visible',ctrl:'LB_ARTCOD',prop:'Visible'},{av:'edtLb_ColNomC_Visible',ctrl:'LB_COLNOMC',prop:'Visible'},{av:'edtLb_Rb_Visible',ctrl:'LB_RB',prop:'Visible'},{av:'edtLb_opcion_Visible',ctrl:'LB_OPCION',prop:'Visible'},{av:'edtLb_numop_Visible',ctrl:'LB_NUMOP',prop:'Visible'},{av:'edtLb_Cartaz_Visible',ctrl:'LB_CARTAZ',prop:'Visible'},{av:'edtLb_FechaE_Visible',ctrl:'LB_FECHAE',prop:'Visible'},{av:'edtLb_FechaEn_Visible',ctrl:'LB_FECHAEN',prop:'Visible'},{av:'cmbLb_Estado'},{av:'chkavSeleccionareliminar.getVisible()',ctrl:'vSELECCIONARELIMINAR',prop:'Visible'},{av:'AV45GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV46GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'chkavSeleccionar.getColumnHeaderClass()',ctrl:'vSELECCIONAR',prop:'Columnheaderclass'},{av:'edtLb_numero_Columnheaderclass',ctrl:'LB_NUMERO',prop:'Columnheaderclass'},{av:'edtCliCod_Columnheaderclass',ctrl:'CLICOD',prop:'Columnheaderclass'},{av:'edtLb_ArtCod_Columnheaderclass',ctrl:'LB_ARTCOD',prop:'Columnheaderclass'},{av:'edtLb_ColNomC_Columnheaderclass',ctrl:'LB_COLNOMC',prop:'Columnheaderclass'},{av:'edtLb_Rb_Columnheaderclass',ctrl:'LB_RB',prop:'Columnheaderclass'},{av:'edtLb_opcion_Columnheaderclass',ctrl:'LB_OPCION',prop:'Columnheaderclass'},{av:'edtLb_numop_Columnheaderclass',ctrl:'LB_NUMOP',prop:'Columnheaderclass'},{av:'edtLb_Cartaz_Columnheaderclass',ctrl:'LB_CARTAZ',prop:'Columnheaderclass'},{av:'edtLb_FechaE_Columnheaderclass',ctrl:'LB_FECHAE',prop:'Columnheaderclass'},{av:'edtLb_FechaEn_Columnheaderclass',ctrl:'LB_FECHAEN',prop:'Columnheaderclass'},{av:'chkavSeleccionareliminar.getColumnHeaderClass()',ctrl:'vSELECCIONARELIMINAR',prop:'Columnheaderclass'},{ctrl:'BTNENVIOOPCIONA',prop:'Visible'},{av:'AV68ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV47GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOCANCELAR'","{handler:'e261TR2',iparms:[]");
      setEventMetadata("'DOCANCELAR'",",oparms:[]}");
      setEventMetadata("'DOEXPORT'","{handler:'e271TR2',iparms:[]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e281TR2',iparms:[]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("VALID_LB_NUMERO","{handler:'valid_Lb_numero',iparms:[]");
      setEventMetadata("VALID_LB_NUMERO",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Lb_rgb',iparms:[]");
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
      wcpOAV36Emprcod = "" ;
      wcpOAV59Lb_Cartaz = "" ;
      wcpOAV60Lb_ColNom = "" ;
      wcpOAV62Lb_FechaEfrom = GXutil.nullDate() ;
      wcpOAV64Lb_FechaEto = GXutil.nullDate() ;
      wcpOAV63Lb_fechaEn = GXutil.nullDate() ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      Dvelop_confirmpanel_enviar_Result = "" ;
      Dvelop_confirmpanel_eliminar_Result = "" ;
      Dvelop_confirmpanel_envioopciona_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV36Emprcod = "" ;
      AV59Lb_Cartaz = "" ;
      AV60Lb_ColNom = "" ;
      AV62Lb_FechaEfrom = GXutil.nullDate() ;
      AV64Lb_FechaEto = GXutil.nullDate() ;
      AV63Lb_fechaEn = GXutil.nullDate() ;
      AV41FilterFullText = "" ;
      AV10ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV86TFLb_ArtCod = "" ;
      AV87TFLb_ArtCod_Sel = "" ;
      AV90TFLb_ColNomC = "" ;
      AV91TFLb_ColNomC_Sel = "" ;
      AV138TFLb_Rb = DecimalUtil.ZERO ;
      AV139TFLb_Rb_To = DecimalUtil.ZERO ;
      AV130TFLb_opcion = "" ;
      AV131TFLb_opcion_Sel = "" ;
      AV88TFLb_Cartaz = "" ;
      AV89TFLb_Cartaz_Sel = "" ;
      AV102TFLb_FechaE = GXutil.nullDate() ;
      AV104TFLb_FechaEn = GXutil.nullDate() ;
      AV97TFLb_Estado_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV164Pgmname = "" ;
      AV43ForUltUti = GXutil.nullDate() ;
      Gx_msg = "" ;
      AV8Col_Lb_numero = new GXSimpleCollection<Integer>(Integer.class, "internal", "");
      AV9Col_Lb_opcion = new GXSimpleCollection<String>(String.class, "internal", "");
      AV144Col_Lb_numeroE = new GXSimpleCollection<Integer>(Integer.class, "internal", "");
      AV145Col_Lb_opcionE = new GXSimpleCollection<String>(String.class, "internal", "");
      AV13coste = DecimalUtil.ZERO ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV68ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV34DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A396EmprCod = "" ;
      A5536Lb_ColNom = "" ;
      AV47GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV98TFLb_Estado_SelsJson = "" ;
      AV52IN_lb_fechaen = GXutil.nullDate() ;
      A279CliNom = "" ;
      AV151CliNom = "" ;
      AV155Lb_colnomc = "" ;
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
      bttBtnenviar_Jsonclick = "" ;
      bttBtnmarcartodos_Jsonclick = "" ;
      bttBtndesmarcartodos_Jsonclick = "" ;
      bttBtneliminar_Jsonclick = "" ;
      bttBtnlabdip_Jsonclick = "" ;
      bttBtnenvioopciona_Jsonclick = "" ;
      bttBtncancelar_Jsonclick = "" ;
      ucDvpanel_unnamedtable3 = new com.genexus.webpanels.GXUserControl();
      bttBtnlabdipcoste_Jsonclick = "" ;
      lblTextblocklb_rb_Jsonclick = "" ;
      AV67Lb_Rb = DecimalUtil.ZERO ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV16DDO_Lb_FechaEAuxDate = GXutil.nullDate() ;
      AV18DDO_Lb_FechaEnAuxDate = GXutil.nullDate() ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A5533Lb_ArtCod = "" ;
      A5538Lb_ColNomC = "" ;
      A5547Lb_Rb = DecimalUtil.ZERO ;
      A5555Lb_opcion = "" ;
      A5540Lb_Cartaz = "" ;
      A5541Lb_FechaE = GXutil.nullDate() ;
      A5567Lb_FechaEn = GXutil.nullDate() ;
      AV72Obs = "" ;
      A5565Lb_CosteE = DecimalUtil.ZERO ;
      AV184Gestionlaboratorio_enviodeensayoacliente_wcds_20_tflb_estado_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      scmdbuf = "" ;
      lV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext = "" ;
      lV170Gestionlaboratorio_enviodeensayoacliente_wcds_6_tflb_artcod = "" ;
      lV172Gestionlaboratorio_enviodeensayoacliente_wcds_8_tflb_colnomc = "" ;
      lV176Gestionlaboratorio_enviodeensayoacliente_wcds_12_tflb_opcion = "" ;
      lV180Gestionlaboratorio_enviodeensayoacliente_wcds_16_tflb_cartaz = "" ;
      lV59Lb_Cartaz = "" ;
      lV60Lb_ColNom = "" ;
      AV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext = "" ;
      AV171Gestionlaboratorio_enviodeensayoacliente_wcds_7_tflb_artcod_sel = "" ;
      AV170Gestionlaboratorio_enviodeensayoacliente_wcds_6_tflb_artcod = "" ;
      AV173Gestionlaboratorio_enviodeensayoacliente_wcds_9_tflb_colnomc_sel = "" ;
      AV172Gestionlaboratorio_enviodeensayoacliente_wcds_8_tflb_colnomc = "" ;
      AV174Gestionlaboratorio_enviodeensayoacliente_wcds_10_tflb_rb = DecimalUtil.ZERO ;
      AV175Gestionlaboratorio_enviodeensayoacliente_wcds_11_tflb_rb_to = DecimalUtil.ZERO ;
      AV177Gestionlaboratorio_enviodeensayoacliente_wcds_13_tflb_opcion_sel = "" ;
      AV176Gestionlaboratorio_enviodeensayoacliente_wcds_12_tflb_opcion = "" ;
      AV181Gestionlaboratorio_enviodeensayoacliente_wcds_17_tflb_cartaz_sel = "" ;
      AV180Gestionlaboratorio_enviodeensayoacliente_wcds_16_tflb_cartaz = "" ;
      AV182Gestionlaboratorio_enviodeensayoacliente_wcds_18_tflb_fechae = GXutil.nullDate() ;
      AV183Gestionlaboratorio_enviodeensayoacliente_wcds_19_tflb_fechaen = GXutil.nullDate() ;
      H01TR2_A5569Lb_EstEns = new byte[1] ;
      H01TR2_A396EmprCod = new String[] {""} ;
      H01TR2_A5536Lb_ColNom = new String[] {""} ;
      H01TR2_A5537Lb_ColNum = new int[1] ;
      H01TR2_A831TipColCod = new byte[1] ;
      H01TR2_n831TipColCod = new boolean[] {false} ;
      H01TR2_A279CliNom = new String[] {""} ;
      H01TR2_A5599Lb_RGB = new long[1] ;
      H01TR2_A5565Lb_CosteE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01TR2_A5566Lb_Estado = new byte[1] ;
      H01TR2_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      H01TR2_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      H01TR2_A5540Lb_Cartaz = new String[] {""} ;
      H01TR2_A5718Lb_numop = new byte[1] ;
      H01TR2_A5555Lb_opcion = new String[] {""} ;
      H01TR2_A5547Lb_Rb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01TR2_A5538Lb_ColNomC = new String[] {""} ;
      H01TR2_A5533Lb_ArtCod = new String[] {""} ;
      H01TR2_A252CliCod = new int[1] ;
      H01TR2_A5532Lb_numero = new int[1] ;
      H01TR3_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV159Station = "" ;
      AV160EmprNom = "" ;
      AV161UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV143WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV79Session = httpContext.getWebSession();
      AV12ColumnsSelectorXML = "" ;
      GXv_char4 = new String[1] ;
      GXv_int10 = new int[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV70ManageFiltersXml = "" ;
      AV7Col_EnvioEnsayo = new GXBaseCollection<app.gestionlaboratorio.SdtEnviodeEnsayo_SDT>(app.gestionlaboratorio.SdtEnviodeEnsayo_SDT.class, "EnviodeEnsayo_SDT", "TexplusNET", remoteHandle);
      AV55IN_Lb_opcion = "" ;
      AV57Item_EnvioEnsayo = new app.gestionlaboratorio.SdtEnviodeEnsayo_SDT(remoteHandle, context);
      AV58Json_EnvioEnsayo = "" ;
      AV152lb_artcod = "" ;
      ucDvelop_confirmpanel_envioopciona = new com.genexus.webpanels.GXUserControl();
      AV38ExcelFilename = "" ;
      AV37ErrorMessage = "" ;
      AV142UserCustomValue = "" ;
      AV11ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector17 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector18 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item19 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item20 = new GXBaseCollection[1] ;
      AV5Lb_HoraEn = GXutil.resetTime( GXutil.nullDate() );
      AV66Lb_opcions = "" ;
      AV40Fec_null = GXutil.nullDate() ;
      AV49Hora_null = GXutil.resetTime( GXutil.nullDate() );
      GXv_dtime21 = new java.util.Date[1] ;
      GXv_int15 = new int[1] ;
      GXv_date14 = new java.util.Date[1] ;
      GXv_decimal22 = new java.math.BigDecimal[1] ;
      GXv_int23 = new long[1] ;
      GXv_int13 = new byte[1] ;
      GXv_int2 = new byte[1] ;
      GXv_int24 = new byte[1] ;
      GXv_int11 = new int[1] ;
      AV48GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char27 = "" ;
      GXv_char16 = new String[1] ;
      GXt_char26 = "" ;
      GXv_char12 = new String[1] ;
      GXt_char25 = "" ;
      GXv_char6 = new String[1] ;
      GXt_char3 = "" ;
      GXv_char5 = new String[1] ;
      GXv_SdtWWPGridState28 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV140TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV50HTTPRequest = httpContext.getHttpRequest();
      ucDvelop_confirmpanel_eliminar = new com.genexus.webpanels.GXUserControl();
      ucDvelop_confirmpanel_enviar = new com.genexus.webpanels.GXUserControl();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV36Emprcod = "" ;
      sCtrlAV6Clicod = "" ;
      sCtrlAV59Lb_Cartaz = "" ;
      sCtrlAV60Lb_ColNom = "" ;
      sCtrlAV65Lb_numero = "" ;
      sCtrlAV62Lb_FechaEfrom = "" ;
      sCtrlAV64Lb_FechaEto = "" ;
      sCtrlAV63Lb_fechaEn = "" ;
      sCtrlAV61Lb_estado = "" ;
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.enviodeensayoacliente_wc__default(),
         new Object[] {
             new Object[] {
            H01TR2_A5569Lb_EstEns, H01TR2_A396EmprCod, H01TR2_A5536Lb_ColNom, H01TR2_A5537Lb_ColNum, H01TR2_A831TipColCod, H01TR2_n831TipColCod, H01TR2_A279CliNom, H01TR2_A5599Lb_RGB, H01TR2_A5565Lb_CosteE, H01TR2_A5566Lb_Estado,
            H01TR2_A5567Lb_FechaEn, H01TR2_A5541Lb_FechaE, H01TR2_A5540Lb_Cartaz, H01TR2_A5718Lb_numop, H01TR2_A5555Lb_opcion, H01TR2_A5547Lb_Rb, H01TR2_A5538Lb_ColNomC, H01TR2_A5533Lb_ArtCod, H01TR2_A252CliCod, H01TR2_A5532Lb_numero
            }
            , new Object[] {
            H01TR3_AGRID_nRecordCount
            }
         }
      );
      AV164Pgmname = "GestionLaboratorio.EnviodeEnsayoaCliente_WC" ;
      /* GeneXus formulas. */
      AV164Pgmname = "GestionLaboratorio.EnviodeEnsayoaCliente_WC" ;
      Gx_err = (short)(0) ;
      edtavObs_Enabled = 0 ;
      edtavF_cformu_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOAV61Lb_estado ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV61Lb_estado ;
   private byte AV69ManageFiltersExecutionStep ;
   private byte AV124TFLb_numop ;
   private byte AV125TFLb_numop_To ;
   private byte A831TipColCod ;
   private byte AV154TipColcod ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte A5718Lb_numop ;
   private byte A5566Lb_Estado ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV178Gestionlaboratorio_enviodeensayoacliente_wcds_14_tflb_numop ;
   private byte AV179Gestionlaboratorio_enviodeensayoacliente_wcds_15_tflb_numop_to ;
   private byte A5569Lb_EstEns ;
   private byte GXt_int1 ;
   private byte GXv_int13[] ;
   private byte GXv_int2[] ;
   private byte GXv_int24[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV73OrderedBy ;
   private short AV39F_Cformu ;
   private short AV71Moda21 ;
   private short AV156Numform ;
   private short AV51i ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV147Carvema ;
   private short AV149t ;
   private short AV35Elimino_e ;
   private int wcpOAV6Clicod ;
   private int wcpOAV65Lb_numero ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_80 ;
   private int AV6Clicod ;
   private int AV65Lb_numero ;
   private int nGXsfl_80_idx=1 ;
   private int AV122TFLb_numero ;
   private int AV123TFLb_numero_To ;
   private int AV80TFCliCod ;
   private int AV81TFCliCod_To ;
   private int AV42Fornumcol ;
   private int A5537Lb_ColNum ;
   private int AV54IN_Lb_numerol ;
   private int AV153lb_colNum ;
   private int Gridpaginationbar_Pagestoshow ;
   private int bttBtnenvioopciona_Visible ;
   private int divUnnamedtable2_Height ;
   private int edtavLb_rb_Enabled ;
   private int edtavPgmname_Enabled ;
   private int A5532Lb_numero ;
   private int A252CliCod ;
   private int subGrid_Islastpage ;
   private int edtavObs_Enabled ;
   private int edtavF_cformu_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV184Gestionlaboratorio_enviodeensayoacliente_wcds_20_tflb_estado_sels_size ;
   private int AV166Gestionlaboratorio_enviodeensayoacliente_wcds_2_tflb_numero ;
   private int AV167Gestionlaboratorio_enviodeensayoacliente_wcds_3_tflb_numero_to ;
   private int AV168Gestionlaboratorio_enviodeensayoacliente_wcds_4_tfclicod ;
   private int AV169Gestionlaboratorio_enviodeensayoacliente_wcds_5_tfclicod_to ;
   private int edtLb_numero_Visible ;
   private int edtCliCod_Visible ;
   private int edtLb_ArtCod_Visible ;
   private int edtLb_ColNomC_Visible ;
   private int edtLb_Rb_Visible ;
   private int edtLb_opcion_Visible ;
   private int edtLb_numop_Visible ;
   private int edtLb_Cartaz_Visible ;
   private int edtLb_FechaE_Visible ;
   private int edtLb_FechaEn_Visible ;
   private int AV76PageToGo ;
   private int GXv_int10[] ;
   private int AV53IN_Lb_numero ;
   private int nGXsfl_80_fel_idx=1 ;
   private int AV146Clicodgrid ;
   private int GXv_int15[] ;
   private int GXv_int11[] ;
   private int AV191GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavObs_Visible ;
   private int edtavF_cformu_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV45GridCurrentPage ;
   private long AV46GridPageCount ;
   private long A5599Lb_RGB ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private long GXv_int23[] ;
   private java.math.BigDecimal AV138TFLb_Rb ;
   private java.math.BigDecimal AV139TFLb_Rb_To ;
   private java.math.BigDecimal AV13coste ;
   private java.math.BigDecimal AV67Lb_Rb ;
   private java.math.BigDecimal A5547Lb_Rb ;
   private java.math.BigDecimal A5565Lb_CosteE ;
   private java.math.BigDecimal AV174Gestionlaboratorio_enviodeensayoacliente_wcds_10_tflb_rb ;
   private java.math.BigDecimal AV175Gestionlaboratorio_enviodeensayoacliente_wcds_11_tflb_rb_to ;
   private java.math.BigDecimal GXv_decimal22[] ;
   private String wcpOAV36Emprcod ;
   private String wcpOAV59Lb_Cartaz ;
   private String wcpOAV60Lb_ColNom ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String Dvelop_confirmpanel_enviar_Result ;
   private String Dvelop_confirmpanel_eliminar_Result ;
   private String Dvelop_confirmpanel_envioopciona_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV36Emprcod ;
   private String AV59Lb_Cartaz ;
   private String AV60Lb_ColNom ;
   private String sGXsfl_80_idx="0001" ;
   private String AV86TFLb_ArtCod ;
   private String AV87TFLb_ArtCod_Sel ;
   private String AV90TFLb_ColNomC ;
   private String AV91TFLb_ColNomC_Sel ;
   private String AV130TFLb_opcion ;
   private String AV131TFLb_opcion_Sel ;
   private String AV88TFLb_Cartaz ;
   private String AV89TFLb_Cartaz_Sel ;
   private String AV164Pgmname ;
   private String Gx_msg ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A396EmprCod ;
   private String A5536Lb_ColNom ;
   private String A279CliNom ;
   private String AV151CliNom ;
   private String AV155Lb_colnomc ;
   private String Ddo_managefilters_Icontype ;
   private String Ddo_managefilters_Icon ;
   private String Ddo_managefilters_Tooltip ;
   private String Ddo_managefilters_Cls ;
   private String Dvpanel_tableheader_Width ;
   private String Dvpanel_tableheader_Cls ;
   private String Dvpanel_tableheader_Title ;
   private String Dvpanel_tableheader_Iconposition ;
   private String Dvpanel_unnamedtable3_Width ;
   private String Dvpanel_unnamedtable3_Cls ;
   private String Dvpanel_unnamedtable3_Title ;
   private String Dvpanel_unnamedtable3_Iconposition ;
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
   private String Dvelop_confirmpanel_enviar_Title ;
   private String Dvelop_confirmpanel_enviar_Confirmationtext ;
   private String Dvelop_confirmpanel_enviar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_enviar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_enviar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_enviar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_enviar_Confirmtype ;
   private String Dvelop_confirmpanel_eliminar_Title ;
   private String Dvelop_confirmpanel_eliminar_Confirmationtext ;
   private String Dvelop_confirmpanel_eliminar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_eliminar_Confirmtype ;
   private String Dvelop_confirmpanel_envioopciona_Title ;
   private String Dvelop_confirmpanel_envioopciona_Confirmationtext ;
   private String Dvelop_confirmpanel_envioopciona_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_envioopciona_Nobuttoncaption ;
   private String Dvelop_confirmpanel_envioopciona_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_envioopciona_Yesbuttonposition ;
   private String Dvelop_confirmpanel_envioopciona_Confirmtype ;
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
   private String divUnnamedtable1_Internalname ;
   private String bttBtnenviar_Internalname ;
   private String bttBtnenviar_Jsonclick ;
   private String bttBtnmarcartodos_Internalname ;
   private String bttBtnmarcartodos_Jsonclick ;
   private String bttBtndesmarcartodos_Internalname ;
   private String bttBtndesmarcartodos_Jsonclick ;
   private String bttBtneliminar_Internalname ;
   private String bttBtneliminar_Jsonclick ;
   private String bttBtnlabdip_Internalname ;
   private String bttBtnlabdip_Jsonclick ;
   private String bttBtnenvioopciona_Internalname ;
   private String bttBtnenvioopciona_Jsonclick ;
   private String bttBtncancelar_Internalname ;
   private String bttBtncancelar_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String Dvpanel_unnamedtable3_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String bttBtnlabdipcoste_Internalname ;
   private String bttBtnlabdipcoste_Jsonclick ;
   private String divUnnamedtablelb_rb_Internalname ;
   private String lblTextblocklb_rb_Internalname ;
   private String lblTextblocklb_rb_Jsonclick ;
   private String edtavLb_rb_Internalname ;
   private String edtavLb_rb_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_lb_fechaeauxdates_Internalname ;
   private String edtavDdo_lb_fechaeauxdate_Internalname ;
   private String edtavDdo_lb_fechaeauxdate_Jsonclick ;
   private String divDdo_lb_fechaenauxdates_Internalname ;
   private String edtavDdo_lb_fechaenauxdate_Internalname ;
   private String edtavDdo_lb_fechaenauxdate_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtLb_numero_Internalname ;
   private String edtCliCod_Internalname ;
   private String A5533Lb_ArtCod ;
   private String edtLb_ArtCod_Internalname ;
   private String A5538Lb_ColNomC ;
   private String edtLb_ColNomC_Internalname ;
   private String edtLb_Rb_Internalname ;
   private String A5555Lb_opcion ;
   private String edtLb_opcion_Internalname ;
   private String edtLb_numop_Internalname ;
   private String A5540Lb_Cartaz ;
   private String edtLb_Cartaz_Internalname ;
   private String edtLb_FechaE_Internalname ;
   private String edtLb_FechaEn_Internalname ;
   private String edtavObs_Internalname ;
   private String edtavF_cformu_Internalname ;
   private String edtLb_CosteE_Internalname ;
   private String edtLb_RGB_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String scmdbuf ;
   private String lV170Gestionlaboratorio_enviodeensayoacliente_wcds_6_tflb_artcod ;
   private String lV172Gestionlaboratorio_enviodeensayoacliente_wcds_8_tflb_colnomc ;
   private String lV176Gestionlaboratorio_enviodeensayoacliente_wcds_12_tflb_opcion ;
   private String lV180Gestionlaboratorio_enviodeensayoacliente_wcds_16_tflb_cartaz ;
   private String lV59Lb_Cartaz ;
   private String lV60Lb_ColNom ;
   private String AV171Gestionlaboratorio_enviodeensayoacliente_wcds_7_tflb_artcod_sel ;
   private String AV170Gestionlaboratorio_enviodeensayoacliente_wcds_6_tflb_artcod ;
   private String AV173Gestionlaboratorio_enviodeensayoacliente_wcds_9_tflb_colnomc_sel ;
   private String AV172Gestionlaboratorio_enviodeensayoacliente_wcds_8_tflb_colnomc ;
   private String AV177Gestionlaboratorio_enviodeensayoacliente_wcds_13_tflb_opcion_sel ;
   private String AV176Gestionlaboratorio_enviodeensayoacliente_wcds_12_tflb_opcion ;
   private String AV181Gestionlaboratorio_enviodeensayoacliente_wcds_17_tflb_cartaz_sel ;
   private String AV180Gestionlaboratorio_enviodeensayoacliente_wcds_16_tflb_cartaz ;
   private String hsh ;
   private String AV159Station ;
   private String AV160EmprNom ;
   private String AV161UsurCod ;
   private String edtLb_numero_Columnheaderclass ;
   private String edtCliCod_Columnheaderclass ;
   private String edtLb_ArtCod_Columnheaderclass ;
   private String edtLb_ColNomC_Columnheaderclass ;
   private String edtLb_Rb_Columnheaderclass ;
   private String edtLb_opcion_Columnheaderclass ;
   private String edtLb_numop_Columnheaderclass ;
   private String edtLb_Cartaz_Columnheaderclass ;
   private String edtLb_FechaE_Columnheaderclass ;
   private String edtLb_FechaEn_Columnheaderclass ;
   private String GXv_char4[] ;
   private String edtLb_numero_Columnclass ;
   private String edtCliCod_Columnclass ;
   private String edtLb_ArtCod_Columnclass ;
   private String edtLb_ColNomC_Columnclass ;
   private String edtLb_Rb_Columnclass ;
   private String edtLb_opcion_Columnclass ;
   private String edtLb_numop_Columnclass ;
   private String edtLb_Cartaz_Columnclass ;
   private String edtLb_FechaE_Columnclass ;
   private String edtLb_FechaEn_Columnclass ;
   private String AV55IN_Lb_opcion ;
   private String sGXsfl_80_fel_idx="0001" ;
   private String AV152lb_artcod ;
   private String Dvelop_confirmpanel_envioopciona_Internalname ;
   private String AV66Lb_opcions ;
   private String GXt_char27 ;
   private String GXv_char16[] ;
   private String GXt_char26 ;
   private String GXv_char12[] ;
   private String GXt_char25 ;
   private String GXv_char6[] ;
   private String GXt_char3 ;
   private String GXv_char5[] ;
   private String tblTabledvelop_confirmpanel_envioopciona_Internalname ;
   private String tblTabledvelop_confirmpanel_eliminar_Internalname ;
   private String Dvelop_confirmpanel_eliminar_Internalname ;
   private String tblTabledvelop_confirmpanel_enviar_Internalname ;
   private String Dvelop_confirmpanel_enviar_Internalname ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV36Emprcod ;
   private String sCtrlAV6Clicod ;
   private String sCtrlAV59Lb_Cartaz ;
   private String sCtrlAV60Lb_ColNom ;
   private String sCtrlAV65Lb_numero ;
   private String sCtrlAV62Lb_FechaEfrom ;
   private String sCtrlAV64Lb_FechaEto ;
   private String sCtrlAV63Lb_fechaEn ;
   private String sCtrlAV61Lb_estado ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtLb_numero_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String edtLb_ArtCod_Jsonclick ;
   private String edtLb_ColNomC_Jsonclick ;
   private String edtLb_Rb_Jsonclick ;
   private String edtLb_opcion_Jsonclick ;
   private String edtLb_numop_Jsonclick ;
   private String edtLb_Cartaz_Jsonclick ;
   private String edtLb_FechaE_Jsonclick ;
   private String edtLb_FechaEn_Jsonclick ;
   private String edtavObs_Jsonclick ;
   private String edtavF_cformu_Jsonclick ;
   private String edtLb_CosteE_Jsonclick ;
   private String edtLb_RGB_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV5Lb_HoraEn ;
   private java.util.Date AV49Hora_null ;
   private java.util.Date GXv_dtime21[] ;
   private java.util.Date wcpOAV62Lb_FechaEfrom ;
   private java.util.Date wcpOAV64Lb_FechaEto ;
   private java.util.Date wcpOAV63Lb_fechaEn ;
   private java.util.Date AV62Lb_FechaEfrom ;
   private java.util.Date AV64Lb_FechaEto ;
   private java.util.Date AV63Lb_fechaEn ;
   private java.util.Date AV102TFLb_FechaE ;
   private java.util.Date AV104TFLb_FechaEn ;
   private java.util.Date AV43ForUltUti ;
   private java.util.Date AV52IN_lb_fechaen ;
   private java.util.Date AV16DDO_Lb_FechaEAuxDate ;
   private java.util.Date AV18DDO_Lb_FechaEnAuxDate ;
   private java.util.Date A5541Lb_FechaE ;
   private java.util.Date A5567Lb_FechaEn ;
   private java.util.Date AV182Gestionlaboratorio_enviodeensayoacliente_wcds_18_tflb_fechae ;
   private java.util.Date AV183Gestionlaboratorio_enviodeensayoacliente_wcds_19_tflb_fechaen ;
   private java.util.Date AV40Fec_null ;
   private java.util.Date GXv_date14[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV75OrderedDsc ;
   private boolean Dvpanel_tableheader_Autowidth ;
   private boolean Dvpanel_tableheader_Autoheight ;
   private boolean Dvpanel_tableheader_Collapsible ;
   private boolean Dvpanel_tableheader_Collapsed ;
   private boolean Dvpanel_tableheader_Showcollapseicon ;
   private boolean Dvpanel_tableheader_Autoscroll ;
   private boolean Dvpanel_unnamedtable3_Autowidth ;
   private boolean Dvpanel_unnamedtable3_Autoheight ;
   private boolean Dvpanel_unnamedtable3_Collapsible ;
   private boolean Dvpanel_unnamedtable3_Collapsed ;
   private boolean Dvpanel_unnamedtable3_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable3_Autoscroll ;
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
   private boolean AV77Seleccionar ;
   private boolean AV78SeleccionarEliminar ;
   private boolean bGXsfl_80_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n831TipColCod ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean AV148TempBoolean ;
   private String AV98TFLb_Estado_SelsJson ;
   private String AV12ColumnsSelectorXML ;
   private String AV70ManageFiltersXml ;
   private String AV142UserCustomValue ;
   private String AV41FilterFullText ;
   private String AV72Obs ;
   private String lV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext ;
   private String AV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext ;
   private String AV58Json_EnvioEnsayo ;
   private String AV38ExcelFilename ;
   private String AV37ErrorMessage ;
   private GXSimpleCollection<Byte> AV184Gestionlaboratorio_enviodeensayoacliente_wcds_20_tflb_estado_sels ;
   private GXSimpleCollection<Byte> AV97TFLb_Estado_Sels ;
   private GXSimpleCollection<Integer> AV8Col_Lb_numero ;
   private GXSimpleCollection<Integer> AV144Col_Lb_numeroE ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV50HTTPRequest ;
   private com.genexus.webpanels.WebSession AV79Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable3 ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_envioopciona ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminar ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_enviar ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkavSeleccionar ;
   private HTMLChoice cmbLb_Estado ;
   private ICheckbox chkavSeleccionareliminar ;
   private IDataStoreProvider pr_default ;
   private byte[] H01TR2_A5569Lb_EstEns ;
   private String[] H01TR2_A396EmprCod ;
   private String[] H01TR2_A5536Lb_ColNom ;
   private int[] H01TR2_A5537Lb_ColNum ;
   private byte[] H01TR2_A831TipColCod ;
   private boolean[] H01TR2_n831TipColCod ;
   private String[] H01TR2_A279CliNom ;
   private long[] H01TR2_A5599Lb_RGB ;
   private java.math.BigDecimal[] H01TR2_A5565Lb_CosteE ;
   private byte[] H01TR2_A5566Lb_Estado ;
   private java.util.Date[] H01TR2_A5567Lb_FechaEn ;
   private java.util.Date[] H01TR2_A5541Lb_FechaE ;
   private String[] H01TR2_A5540Lb_Cartaz ;
   private byte[] H01TR2_A5718Lb_numop ;
   private String[] H01TR2_A5555Lb_opcion ;
   private java.math.BigDecimal[] H01TR2_A5547Lb_Rb ;
   private String[] H01TR2_A5538Lb_ColNomC ;
   private String[] H01TR2_A5533Lb_ArtCod ;
   private int[] H01TR2_A252CliCod ;
   private int[] H01TR2_A5532Lb_numero ;
   private long[] H01TR3_AGRID_nRecordCount ;
   private GXSimpleCollection<String> AV9Col_Lb_opcion ;
   private GXSimpleCollection<String> AV145Col_Lb_opcionE ;
   private GXBaseCollection<app.gestionlaboratorio.SdtEnviodeEnsayo_SDT> AV7Col_EnvioEnsayo ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV68ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item19 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item20[] ;
   private app.gestionlaboratorio.SdtEnviodeEnsayo_SDT AV57Item_EnvioEnsayo ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV10ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV11ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector17[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector18[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV34DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV47GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState28[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV48GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV140TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV143WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
}

final  class enviodeensayoacliente_wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01TR2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5566Lb_Estado ,
                                          GXSimpleCollection<Byte> AV184Gestionlaboratorio_enviodeensayoacliente_wcds_20_tflb_estado_sels ,
                                          String AV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext ,
                                          int AV166Gestionlaboratorio_enviodeensayoacliente_wcds_2_tflb_numero ,
                                          int AV167Gestionlaboratorio_enviodeensayoacliente_wcds_3_tflb_numero_to ,
                                          int AV168Gestionlaboratorio_enviodeensayoacliente_wcds_4_tfclicod ,
                                          int AV169Gestionlaboratorio_enviodeensayoacliente_wcds_5_tfclicod_to ,
                                          String AV171Gestionlaboratorio_enviodeensayoacliente_wcds_7_tflb_artcod_sel ,
                                          String AV170Gestionlaboratorio_enviodeensayoacliente_wcds_6_tflb_artcod ,
                                          String AV173Gestionlaboratorio_enviodeensayoacliente_wcds_9_tflb_colnomc_sel ,
                                          String AV172Gestionlaboratorio_enviodeensayoacliente_wcds_8_tflb_colnomc ,
                                          java.math.BigDecimal AV174Gestionlaboratorio_enviodeensayoacliente_wcds_10_tflb_rb ,
                                          java.math.BigDecimal AV175Gestionlaboratorio_enviodeensayoacliente_wcds_11_tflb_rb_to ,
                                          String AV177Gestionlaboratorio_enviodeensayoacliente_wcds_13_tflb_opcion_sel ,
                                          String AV176Gestionlaboratorio_enviodeensayoacliente_wcds_12_tflb_opcion ,
                                          byte AV178Gestionlaboratorio_enviodeensayoacliente_wcds_14_tflb_numop ,
                                          byte AV179Gestionlaboratorio_enviodeensayoacliente_wcds_15_tflb_numop_to ,
                                          String AV181Gestionlaboratorio_enviodeensayoacliente_wcds_17_tflb_cartaz_sel ,
                                          String AV180Gestionlaboratorio_enviodeensayoacliente_wcds_16_tflb_cartaz ,
                                          java.util.Date AV182Gestionlaboratorio_enviodeensayoacliente_wcds_18_tflb_fechae ,
                                          java.util.Date AV183Gestionlaboratorio_enviodeensayoacliente_wcds_19_tflb_fechaen ,
                                          int AV184Gestionlaboratorio_enviodeensayoacliente_wcds_20_tflb_estado_sels_size ,
                                          int AV6Clicod ,
                                          String AV59Lb_Cartaz ,
                                          String AV60Lb_ColNom ,
                                          int AV65Lb_numero ,
                                          java.util.Date AV62Lb_FechaEfrom ,
                                          java.util.Date AV64Lb_FechaEto ,
                                          int A5532Lb_numero ,
                                          int A252CliCod ,
                                          String A5533Lb_ArtCod ,
                                          String A5538Lb_ColNomC ,
                                          java.math.BigDecimal A5547Lb_Rb ,
                                          String A5555Lb_opcion ,
                                          byte A5718Lb_numop ,
                                          String A5540Lb_Cartaz ,
                                          java.util.Date A5541Lb_FechaE ,
                                          java.util.Date A5567Lb_FechaEn ,
                                          String A5536Lb_ColNom ,
                                          short AV73OrderedBy ,
                                          boolean AV75OrderedDsc ,
                                          byte A5569Lb_EstEns ,
                                          short AV147Carvema ,
                                          byte AV61Lb_estado ,
                                          String AV36Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int29 = new byte[43];
      Object[] GXv_Object30 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T2.Lb_EstEns, T1.EmprCod, T2.Lb_ColNom, T2.Lb_ColNum, T2.TipColCod, T3.CliNom, T2.Lb_RGB, T1.Lb_CosteE, T1.Lb_Estado, T1.Lb_FechaEn, T2.Lb_FechaE, T2.Lb_Cartaz," ;
      sSelectString += " T1.Lb_numop, T1.Lb_opcion, T2.Lb_Rb, T2.Lb_ColNomC, T2.Lb_ArtCod, T2.CliCod, T1.Lb_numero" ;
      sFromString = " FROM ((TXPENS002 T1 INNER JOIN TXPENS001 T2 ON T2.EmprCod = T1.EmprCod AND T2.Lb_numero = T1.Lb_numero) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod" ;
      sFromString += " = T2.CliCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T2.Lb_EstEns < 2)");
      addWhere(sWhereString, "(T1.Lb_Estado >= 0 and T1.Lb_Estado <= 1)");
      addWhere(sWhereString, "(( ( ? = 0 and ( ( T1.Lb_Estado = 1 and ? = 1) or ( T1.Lb_Estado = 0 and ? = 0) or ( ? = 2)))))");
      if ( ! (GXutil.strcmp("", AV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T2.Lb_ColNomC) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.Lb_Rb,'9990.99'), 2) like '%' || ?) or ( UPPER(T1.Lb_opcion) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_numop,'90'), 2) like '%' || ?) or ( UPPER(T2.Lb_Cartaz) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_Estado,'90'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int29[5] = (byte)(1) ;
         GXv_int29[6] = (byte)(1) ;
         GXv_int29[7] = (byte)(1) ;
         GXv_int29[8] = (byte)(1) ;
         GXv_int29[9] = (byte)(1) ;
         GXv_int29[10] = (byte)(1) ;
         GXv_int29[11] = (byte)(1) ;
         GXv_int29[12] = (byte)(1) ;
         GXv_int29[13] = (byte)(1) ;
      }
      if ( ! (0==AV166Gestionlaboratorio_enviodeensayoacliente_wcds_2_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int29[14] = (byte)(1) ;
      }
      if ( ! (0==AV167Gestionlaboratorio_enviodeensayoacliente_wcds_3_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int29[15] = (byte)(1) ;
      }
      if ( ! (0==AV168Gestionlaboratorio_enviodeensayoacliente_wcds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int29[16] = (byte)(1) ;
      }
      if ( ! (0==AV169Gestionlaboratorio_enviodeensayoacliente_wcds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int29[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV171Gestionlaboratorio_enviodeensayoacliente_wcds_7_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV170Gestionlaboratorio_enviodeensayoacliente_wcds_6_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV171Gestionlaboratorio_enviodeensayoacliente_wcds_7_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int29[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV173Gestionlaboratorio_enviodeensayoacliente_wcds_9_tflb_colnomc_sel)==0) && ( ! (GXutil.strcmp("", AV172Gestionlaboratorio_enviodeensayoacliente_wcds_8_tflb_colnomc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_ColNomC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV173Gestionlaboratorio_enviodeensayoacliente_wcds_9_tflb_colnomc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNomC = ?)");
      }
      else
      {
         GXv_int29[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV174Gestionlaboratorio_enviodeensayoacliente_wcds_10_tflb_rb)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Rb >= ?)");
      }
      else
      {
         GXv_int29[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV175Gestionlaboratorio_enviodeensayoacliente_wcds_11_tflb_rb_to)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Rb <= ?)");
      }
      else
      {
         GXv_int29[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV177Gestionlaboratorio_enviodeensayoacliente_wcds_13_tflb_opcion_sel)==0) && ( ! (GXutil.strcmp("", AV176Gestionlaboratorio_enviodeensayoacliente_wcds_12_tflb_opcion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_opcion) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV177Gestionlaboratorio_enviodeensayoacliente_wcds_13_tflb_opcion_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_opcion = ?)");
      }
      else
      {
         GXv_int29[25] = (byte)(1) ;
      }
      if ( ! (0==AV178Gestionlaboratorio_enviodeensayoacliente_wcds_14_tflb_numop) )
      {
         addWhere(sWhereString, "(T1.Lb_numop >= ?)");
      }
      else
      {
         GXv_int29[26] = (byte)(1) ;
      }
      if ( ! (0==AV179Gestionlaboratorio_enviodeensayoacliente_wcds_15_tflb_numop_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numop <= ?)");
      }
      else
      {
         GXv_int29[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV181Gestionlaboratorio_enviodeensayoacliente_wcds_17_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV180Gestionlaboratorio_enviodeensayoacliente_wcds_16_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV181Gestionlaboratorio_enviodeensayoacliente_wcds_17_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int29[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV182Gestionlaboratorio_enviodeensayoacliente_wcds_18_tflb_fechae)) )
      {
         addWhere(sWhereString, "(T2.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int29[30] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV183Gestionlaboratorio_enviodeensayoacliente_wcds_19_tflb_fechaen)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaEn >= ?)");
      }
      else
      {
         GXv_int29[31] = (byte)(1) ;
      }
      if ( AV184Gestionlaboratorio_enviodeensayoacliente_wcds_20_tflb_estado_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV184Gestionlaboratorio_enviodeensayoacliente_wcds_20_tflb_estado_sels, "T1.Lb_Estado IN (", ")")+")");
      }
      if ( ! (0==AV6Clicod) )
      {
         addWhere(sWhereString, "(T2.CliCod = ?)");
      }
      else
      {
         GXv_int29[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Lb_Cartaz)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Cartaz like ?)");
      }
      else
      {
         GXv_int29[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Lb_ColNom)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNom like ?)");
      }
      else
      {
         GXv_int29[34] = (byte)(1) ;
      }
      if ( ! (0==AV65Lb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero = ?)");
      }
      else
      {
         GXv_int29[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV62Lb_FechaEfrom)) )
      {
         addWhere(sWhereString, "(T2.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int29[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV64Lb_FechaEto)) )
      {
         addWhere(sWhereString, "(T2.Lb_FechaE <= ?)");
      }
      else
      {
         GXv_int29[37] = (byte)(1) ;
      }
      if ( AV73OrderedBy == 1 )
      {
         sOrderString += " ORDER BY T1.EmprCod, T2.CliCod, T1.Lb_numero, T1.Lb_opcion" ;
      }
      else if ( ( AV73OrderedBy == 2 ) && ! AV75OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_numero" ;
      }
      else if ( ( AV73OrderedBy == 2 ) && ( AV75OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_numero DESC" ;
      }
      else if ( ( AV73OrderedBy == 3 ) && ! AV75OrderedDsc )
      {
         sOrderString += " ORDER BY T2.CliCod" ;
      }
      else if ( ( AV73OrderedBy == 3 ) && ( AV75OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.CliCod DESC" ;
      }
      else if ( ( AV73OrderedBy == 4 ) && ! AV75OrderedDsc )
      {
         sOrderString += " ORDER BY T2.Lb_ArtCod" ;
      }
      else if ( ( AV73OrderedBy == 4 ) && ( AV75OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.Lb_ArtCod DESC" ;
      }
      else if ( ( AV73OrderedBy == 5 ) && ! AV75OrderedDsc )
      {
         sOrderString += " ORDER BY T2.Lb_ColNomC" ;
      }
      else if ( ( AV73OrderedBy == 5 ) && ( AV75OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.Lb_ColNomC DESC" ;
      }
      else if ( ( AV73OrderedBy == 6 ) && ! AV75OrderedDsc )
      {
         sOrderString += " ORDER BY T2.Lb_Rb" ;
      }
      else if ( ( AV73OrderedBy == 6 ) && ( AV75OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.Lb_Rb DESC" ;
      }
      else if ( ( AV73OrderedBy == 7 ) && ! AV75OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_opcion" ;
      }
      else if ( ( AV73OrderedBy == 7 ) && ( AV75OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_opcion DESC" ;
      }
      else if ( ( AV73OrderedBy == 8 ) && ! AV75OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_numop" ;
      }
      else if ( ( AV73OrderedBy == 8 ) && ( AV75OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_numop DESC" ;
      }
      else if ( ( AV73OrderedBy == 9 ) && ! AV75OrderedDsc )
      {
         sOrderString += " ORDER BY T2.Lb_Cartaz" ;
      }
      else if ( ( AV73OrderedBy == 9 ) && ( AV75OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.Lb_Cartaz DESC" ;
      }
      else if ( ( AV73OrderedBy == 10 ) && ! AV75OrderedDsc )
      {
         sOrderString += " ORDER BY T2.Lb_FechaE" ;
      }
      else if ( ( AV73OrderedBy == 10 ) && ( AV75OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.Lb_FechaE DESC" ;
      }
      else if ( ( AV73OrderedBy == 11 ) && ! AV75OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_FechaEn" ;
      }
      else if ( ( AV73OrderedBy == 11 ) && ( AV75OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_FechaEn DESC" ;
      }
      else if ( ( AV73OrderedBy == 12 ) && ! AV75OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_Estado" ;
      }
      else if ( ( AV73OrderedBy == 12 ) && ( AV75OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_Estado DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.Lb_numero, T1.Lb_opcion" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object30[0] = scmdbuf ;
      GXv_Object30[1] = GXv_int29 ;
      return GXv_Object30 ;
   }

   protected Object[] conditional_H01TR3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5566Lb_Estado ,
                                          GXSimpleCollection<Byte> AV184Gestionlaboratorio_enviodeensayoacliente_wcds_20_tflb_estado_sels ,
                                          String AV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext ,
                                          int AV166Gestionlaboratorio_enviodeensayoacliente_wcds_2_tflb_numero ,
                                          int AV167Gestionlaboratorio_enviodeensayoacliente_wcds_3_tflb_numero_to ,
                                          int AV168Gestionlaboratorio_enviodeensayoacliente_wcds_4_tfclicod ,
                                          int AV169Gestionlaboratorio_enviodeensayoacliente_wcds_5_tfclicod_to ,
                                          String AV171Gestionlaboratorio_enviodeensayoacliente_wcds_7_tflb_artcod_sel ,
                                          String AV170Gestionlaboratorio_enviodeensayoacliente_wcds_6_tflb_artcod ,
                                          String AV173Gestionlaboratorio_enviodeensayoacliente_wcds_9_tflb_colnomc_sel ,
                                          String AV172Gestionlaboratorio_enviodeensayoacliente_wcds_8_tflb_colnomc ,
                                          java.math.BigDecimal AV174Gestionlaboratorio_enviodeensayoacliente_wcds_10_tflb_rb ,
                                          java.math.BigDecimal AV175Gestionlaboratorio_enviodeensayoacliente_wcds_11_tflb_rb_to ,
                                          String AV177Gestionlaboratorio_enviodeensayoacliente_wcds_13_tflb_opcion_sel ,
                                          String AV176Gestionlaboratorio_enviodeensayoacliente_wcds_12_tflb_opcion ,
                                          byte AV178Gestionlaboratorio_enviodeensayoacliente_wcds_14_tflb_numop ,
                                          byte AV179Gestionlaboratorio_enviodeensayoacliente_wcds_15_tflb_numop_to ,
                                          String AV181Gestionlaboratorio_enviodeensayoacliente_wcds_17_tflb_cartaz_sel ,
                                          String AV180Gestionlaboratorio_enviodeensayoacliente_wcds_16_tflb_cartaz ,
                                          java.util.Date AV182Gestionlaboratorio_enviodeensayoacliente_wcds_18_tflb_fechae ,
                                          java.util.Date AV183Gestionlaboratorio_enviodeensayoacliente_wcds_19_tflb_fechaen ,
                                          int AV184Gestionlaboratorio_enviodeensayoacliente_wcds_20_tflb_estado_sels_size ,
                                          int AV6Clicod ,
                                          String AV59Lb_Cartaz ,
                                          String AV60Lb_ColNom ,
                                          int AV65Lb_numero ,
                                          java.util.Date AV62Lb_FechaEfrom ,
                                          java.util.Date AV64Lb_FechaEto ,
                                          int A5532Lb_numero ,
                                          int A252CliCod ,
                                          String A5533Lb_ArtCod ,
                                          String A5538Lb_ColNomC ,
                                          java.math.BigDecimal A5547Lb_Rb ,
                                          String A5555Lb_opcion ,
                                          byte A5718Lb_numop ,
                                          String A5540Lb_Cartaz ,
                                          java.util.Date A5541Lb_FechaE ,
                                          java.util.Date A5567Lb_FechaEn ,
                                          String A5536Lb_ColNom ,
                                          short AV73OrderedBy ,
                                          boolean AV75OrderedDsc ,
                                          byte A5569Lb_EstEns ,
                                          short AV147Carvema ,
                                          byte AV61Lb_estado ,
                                          String AV36Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int32 = new byte[38];
      Object[] GXv_Object33 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM ((TXPENS002 T1 INNER JOIN TXPENS001 T2 ON T2.EmprCod = T1.EmprCod AND T2.Lb_numero = T1.Lb_numero) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.CliCod = T2.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T2.Lb_EstEns < 2)");
      addWhere(sWhereString, "(T1.Lb_Estado >= 0 and T1.Lb_Estado <= 1)");
      addWhere(sWhereString, "(( ( ? = 0 and ( ( T1.Lb_Estado = 1 and ? = 1) or ( T1.Lb_Estado = 0 and ? = 0) or ( ? = 2)))))");
      if ( ! (GXutil.strcmp("", AV165Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T2.Lb_ColNomC) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.Lb_Rb,'9990.99'), 2) like '%' || ?) or ( UPPER(T1.Lb_opcion) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_numop,'90'), 2) like '%' || ?) or ( UPPER(T2.Lb_Cartaz) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_Estado,'90'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int32[5] = (byte)(1) ;
         GXv_int32[6] = (byte)(1) ;
         GXv_int32[7] = (byte)(1) ;
         GXv_int32[8] = (byte)(1) ;
         GXv_int32[9] = (byte)(1) ;
         GXv_int32[10] = (byte)(1) ;
         GXv_int32[11] = (byte)(1) ;
         GXv_int32[12] = (byte)(1) ;
         GXv_int32[13] = (byte)(1) ;
      }
      if ( ! (0==AV166Gestionlaboratorio_enviodeensayoacliente_wcds_2_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int32[14] = (byte)(1) ;
      }
      if ( ! (0==AV167Gestionlaboratorio_enviodeensayoacliente_wcds_3_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int32[15] = (byte)(1) ;
      }
      if ( ! (0==AV168Gestionlaboratorio_enviodeensayoacliente_wcds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int32[16] = (byte)(1) ;
      }
      if ( ! (0==AV169Gestionlaboratorio_enviodeensayoacliente_wcds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int32[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV171Gestionlaboratorio_enviodeensayoacliente_wcds_7_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV170Gestionlaboratorio_enviodeensayoacliente_wcds_6_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV171Gestionlaboratorio_enviodeensayoacliente_wcds_7_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int32[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV173Gestionlaboratorio_enviodeensayoacliente_wcds_9_tflb_colnomc_sel)==0) && ( ! (GXutil.strcmp("", AV172Gestionlaboratorio_enviodeensayoacliente_wcds_8_tflb_colnomc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_ColNomC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV173Gestionlaboratorio_enviodeensayoacliente_wcds_9_tflb_colnomc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNomC = ?)");
      }
      else
      {
         GXv_int32[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV174Gestionlaboratorio_enviodeensayoacliente_wcds_10_tflb_rb)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Rb >= ?)");
      }
      else
      {
         GXv_int32[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV175Gestionlaboratorio_enviodeensayoacliente_wcds_11_tflb_rb_to)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Rb <= ?)");
      }
      else
      {
         GXv_int32[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV177Gestionlaboratorio_enviodeensayoacliente_wcds_13_tflb_opcion_sel)==0) && ( ! (GXutil.strcmp("", AV176Gestionlaboratorio_enviodeensayoacliente_wcds_12_tflb_opcion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_opcion) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV177Gestionlaboratorio_enviodeensayoacliente_wcds_13_tflb_opcion_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_opcion = ?)");
      }
      else
      {
         GXv_int32[25] = (byte)(1) ;
      }
      if ( ! (0==AV178Gestionlaboratorio_enviodeensayoacliente_wcds_14_tflb_numop) )
      {
         addWhere(sWhereString, "(T1.Lb_numop >= ?)");
      }
      else
      {
         GXv_int32[26] = (byte)(1) ;
      }
      if ( ! (0==AV179Gestionlaboratorio_enviodeensayoacliente_wcds_15_tflb_numop_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numop <= ?)");
      }
      else
      {
         GXv_int32[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV181Gestionlaboratorio_enviodeensayoacliente_wcds_17_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV180Gestionlaboratorio_enviodeensayoacliente_wcds_16_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV181Gestionlaboratorio_enviodeensayoacliente_wcds_17_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int32[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV182Gestionlaboratorio_enviodeensayoacliente_wcds_18_tflb_fechae)) )
      {
         addWhere(sWhereString, "(T2.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int32[30] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV183Gestionlaboratorio_enviodeensayoacliente_wcds_19_tflb_fechaen)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaEn >= ?)");
      }
      else
      {
         GXv_int32[31] = (byte)(1) ;
      }
      if ( AV184Gestionlaboratorio_enviodeensayoacliente_wcds_20_tflb_estado_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV184Gestionlaboratorio_enviodeensayoacliente_wcds_20_tflb_estado_sels, "T1.Lb_Estado IN (", ")")+")");
      }
      if ( ! (0==AV6Clicod) )
      {
         addWhere(sWhereString, "(T2.CliCod = ?)");
      }
      else
      {
         GXv_int32[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Lb_Cartaz)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Cartaz like ?)");
      }
      else
      {
         GXv_int32[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Lb_ColNom)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNom like ?)");
      }
      else
      {
         GXv_int32[34] = (byte)(1) ;
      }
      if ( ! (0==AV65Lb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero = ?)");
      }
      else
      {
         GXv_int32[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV62Lb_FechaEfrom)) )
      {
         addWhere(sWhereString, "(T2.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int32[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV64Lb_FechaEto)) )
      {
         addWhere(sWhereString, "(T2.Lb_FechaE <= ?)");
      }
      else
      {
         GXv_int32[37] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV73OrderedBy == 1 )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV73OrderedBy == 2 ) && ! AV75OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV73OrderedBy == 2 ) && ( AV75OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV73OrderedBy == 3 ) && ! AV75OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV73OrderedBy == 3 ) && ( AV75OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV73OrderedBy == 4 ) && ! AV75OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV73OrderedBy == 4 ) && ( AV75OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV73OrderedBy == 5 ) && ! AV75OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV73OrderedBy == 5 ) && ( AV75OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV73OrderedBy == 6 ) && ! AV75OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV73OrderedBy == 6 ) && ( AV75OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV73OrderedBy == 7 ) && ! AV75OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV73OrderedBy == 7 ) && ( AV75OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV73OrderedBy == 8 ) && ! AV75OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV73OrderedBy == 8 ) && ( AV75OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV73OrderedBy == 9 ) && ! AV75OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV73OrderedBy == 9 ) && ( AV75OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV73OrderedBy == 10 ) && ! AV75OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV73OrderedBy == 10 ) && ( AV75OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV73OrderedBy == 11 ) && ! AV75OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV73OrderedBy == 11 ) && ( AV75OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV73OrderedBy == 12 ) && ! AV75OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV73OrderedBy == 12 ) && ( AV75OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object33[0] = scmdbuf ;
      GXv_Object33[1] = GXv_int32 ;
      return GXv_Object33 ;
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
                  return conditional_H01TR2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).byteValue() , ((Number) dynConstraints[16]).byteValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.util.Date)dynConstraints[19] , (java.util.Date)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).shortValue() , ((Boolean) dynConstraints[40]).booleanValue() , ((Number) dynConstraints[41]).byteValue() , ((Number) dynConstraints[42]).shortValue() , ((Number) dynConstraints[43]).byteValue() , (String)dynConstraints[44] , (String)dynConstraints[45] );
            case 1 :
                  return conditional_H01TR3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).byteValue() , ((Number) dynConstraints[16]).byteValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.util.Date)dynConstraints[19] , (java.util.Date)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).shortValue() , ((Boolean) dynConstraints[40]).booleanValue() , ((Number) dynConstraints[41]).byteValue() , ((Number) dynConstraints[42]).shortValue() , ((Number) dynConstraints[43]).byteValue() , (String)dynConstraints[44] , (String)dynConstraints[45] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01TR2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01TR3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((long[]) buf[7])[0] = rslt.getLong(7);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,5);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(10);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 20);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(15,2);
               ((String[]) buf[16])[0] = rslt.getString(16, 13);
               ((String[]) buf[17])[0] = rslt.getString(17, 16);
               ((int[]) buf[18])[0] = rslt.getInt(18);
               ((int[]) buf[19])[0] = rslt.getInt(19);
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
                  stmt.setString(sIdx, (String)parms[43], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[45]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[46]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[47]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 13);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[69]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[70]).byteValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 20);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 20);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[73]);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[74]);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 20);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 13);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[79]);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[80]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[39]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[40]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[64]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 20);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 20);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[68]);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[69]);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 20);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 13);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[74]);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[75]);
               }
               return;
      }
   }

}

