package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class consultasituacioncoleccion_wc_impl extends GXWebComponent
{
   public consultasituacioncoleccion_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public consultasituacioncoleccion_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consultasituacioncoleccion_wc_impl.class ));
   }

   public consultasituacioncoleccion_wc_impl( int remoteHandle ,
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
      cmbavGridactiongroup1 = new HTMLChoice();
      cmbLb_EstEns = new HTMLChoice();
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
               AV230Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV230Emprcod", AV230Emprcod);
               AV217CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV217CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV217CliCod), 6, 0));
               AV218Lb_ArtCod = httpContext.GetPar( "Lb_ArtCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV218Lb_ArtCod", AV218Lb_ArtCod);
               AV228Lb_numero = (int)(GXutil.lval( httpContext.GetPar( "Lb_numero"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV228Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV228Lb_numero), 8, 0));
               AV231Lb_EstEns = (byte)(GXutil.lval( httpContext.GetPar( "Lb_EstEns"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV231Lb_EstEns", GXutil.str( AV231Lb_EstEns, 1, 0));
               AV226Lb_FechaEfrom = localUtil.parseDateParm( httpContext.GetPar( "Lb_FechaEfrom")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV226Lb_FechaEfrom", localUtil.format(AV226Lb_FechaEfrom, "99/99/99"));
               AV227Lb_FechaEto = localUtil.parseDateParm( httpContext.GetPar( "Lb_FechaEto")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV227Lb_FechaEto", localUtil.format(AV227Lb_FechaEto, "99/99/99"));
               AV219Lb_Cartaz = httpContext.GetPar( "Lb_Cartaz") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV219Lb_Cartaz", AV219Lb_Cartaz);
               AV220Lb_cartazffrom = localUtil.parseDateParm( httpContext.GetPar( "Lb_cartazffrom")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV220Lb_cartazffrom", localUtil.format(AV220Lb_cartazffrom, "99/99/99"));
               AV221Lb_cartazfto = localUtil.parseDateParm( httpContext.GetPar( "Lb_cartazfto")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV221Lb_cartazfto", localUtil.format(AV221Lb_cartazfto, "99/99/99"));
               AV222Lb_ColNom = httpContext.GetPar( "Lb_ColNom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV222Lb_ColNom", AV222Lb_ColNom);
               AV224Lb_ColNum = (int)(GXutil.lval( httpContext.GetPar( "Lb_ColNum"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV224Lb_ColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV224Lb_ColNum), 6, 0));
               AV223Lb_ColNomC = httpContext.GetPar( "Lb_ColNomC") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV223Lb_ColNomC", AV223Lb_ColNomC);
               AV233Lb_Tipo = httpContext.GetPar( "Lb_Tipo") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV233Lb_Tipo", AV233Lb_Tipo);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV230Emprcod,Integer.valueOf(AV217CliCod),AV218Lb_ArtCod,Integer.valueOf(AV228Lb_numero),Byte.valueOf(AV231Lb_EstEns),AV226Lb_FechaEfrom,AV227Lb_FechaEto,AV219Lb_Cartaz,AV220Lb_cartazffrom,AV221Lb_cartazfto,AV222Lb_ColNom,Integer.valueOf(AV224Lb_ColNum),AV223Lb_ColNomC,AV233Lb_Tipo});
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
      AV27FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV230Emprcod = httpContext.GetPar( "Emprcod") ;
      AV217CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
      AV218Lb_ArtCod = httpContext.GetPar( "Lb_ArtCod") ;
      AV228Lb_numero = (int)(GXutil.lval( httpContext.GetPar( "Lb_numero"))) ;
      AV231Lb_EstEns = (byte)(GXutil.lval( httpContext.GetPar( "Lb_EstEns"))) ;
      AV226Lb_FechaEfrom = localUtil.parseDateParm( httpContext.GetPar( "Lb_FechaEfrom")) ;
      AV227Lb_FechaEto = localUtil.parseDateParm( httpContext.GetPar( "Lb_FechaEto")) ;
      AV219Lb_Cartaz = httpContext.GetPar( "Lb_Cartaz") ;
      AV220Lb_cartazffrom = localUtil.parseDateParm( httpContext.GetPar( "Lb_cartazffrom")) ;
      AV221Lb_cartazfto = localUtil.parseDateParm( httpContext.GetPar( "Lb_cartazfto")) ;
      AV222Lb_ColNom = httpContext.GetPar( "Lb_ColNom") ;
      AV224Lb_ColNum = (int)(GXutil.lval( httpContext.GetPar( "Lb_ColNum"))) ;
      AV223Lb_ColNomC = httpContext.GetPar( "Lb_ColNomC") ;
      AV233Lb_Tipo = httpContext.GetPar( "Lb_Tipo") ;
      AV38ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV5ColumnsSelector);
      AV47TFCliNom = httpContext.GetPar( "TFCliNom") ;
      AV48TFCliNom_Sel = httpContext.GetPar( "TFCliNom_Sel") ;
      AV71TFLb_Cartaz = httpContext.GetPar( "TFLb_Cartaz") ;
      AV72TFLb_Cartaz_Sel = httpContext.GetPar( "TFLb_Cartaz_Sel") ;
      AV67TFLb_ArtCod = httpContext.GetPar( "TFLb_ArtCod") ;
      AV68TFLb_ArtCod_Sel = httpContext.GetPar( "TFLb_ArtCod_Sel") ;
      AV77TFLb_ColNomC = httpContext.GetPar( "TFLb_ColNomC") ;
      AV78TFLb_ColNomC_Sel = httpContext.GetPar( "TFLb_ColNomC_Sel") ;
      AV75TFLb_ColNom = httpContext.GetPar( "TFLb_ColNom") ;
      AV76TFLb_ColNom_Sel = httpContext.GetPar( "TFLb_ColNom_Sel") ;
      AV79TFLb_ColNum = (int)(GXutil.lval( httpContext.GetPar( "TFLb_ColNum"))) ;
      AV80TFLb_ColNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFLb_ColNum_To"))) ;
      AV125TFLb_numero = (int)(GXutil.lval( httpContext.GetPar( "TFLb_numero"))) ;
      AV126TFLb_numero_To = (int)(GXutil.lval( httpContext.GetPar( "TFLb_numero_To"))) ;
      AV161TFLb_Tipo = httpContext.GetPar( "TFLb_Tipo") ;
      AV162TFLb_Tipo_Sel = httpContext.GetPar( "TFLb_Tipo_Sel") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV235TFLb_EstEns_Sels);
      AV109TFLb_Local = httpContext.GetPar( "TFLb_Local") ;
      AV110TFLb_Local_Sel = httpContext.GetPar( "TFLb_Local_Sel") ;
      AV91TFLb_FechaE = localUtil.parseDateParm( httpContext.GetPar( "TFLb_FechaE")) ;
      AV143TFLb_Rb = CommonUtil.decimalVal( httpContext.GetPar( "TFLb_Rb"), ".") ;
      AV144TFLb_Rb_To = CommonUtil.decimalVal( httpContext.GetPar( "TFLb_Rb_To"), ".") ;
      AV133TFLb_obsLb = httpContext.GetPar( "TFLb_obsLb") ;
      AV134TFLb_obsLb_Sel = httpContext.GetPar( "TFLb_obsLb_Sel") ;
      AV239Pgmname = httpContext.GetPar( "Pgmname") ;
      AV40OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV42OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      A5555Lb_opcion = httpContext.GetPar( "Lb_opcion") ;
      A5563Lb_FechaR = localUtil.parseDateParm( httpContext.GetPar( "Lb_FechaR")) ;
      A5567Lb_FechaEn = localUtil.parseDateParm( httpContext.GetPar( "Lb_FechaEn")) ;
      A6461Lb_FecNoa1 = localUtil.parseDateParm( httpContext.GetPar( "Lb_FecNoa1")) ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV27FilterFullText, AV230Emprcod, AV217CliCod, AV218Lb_ArtCod, AV228Lb_numero, AV231Lb_EstEns, AV226Lb_FechaEfrom, AV227Lb_FechaEto, AV219Lb_Cartaz, AV220Lb_cartazffrom, AV221Lb_cartazfto, AV222Lb_ColNom, AV224Lb_ColNum, AV223Lb_ColNomC, AV233Lb_Tipo, AV38ManageFiltersExecutionStep, AV5ColumnsSelector, AV47TFCliNom, AV48TFCliNom_Sel, AV71TFLb_Cartaz, AV72TFLb_Cartaz_Sel, AV67TFLb_ArtCod, AV68TFLb_ArtCod_Sel, AV77TFLb_ColNomC, AV78TFLb_ColNomC_Sel, AV75TFLb_ColNom, AV76TFLb_ColNom_Sel, AV79TFLb_ColNum, AV80TFLb_ColNum_To, AV125TFLb_numero, AV126TFLb_numero_To, AV161TFLb_Tipo, AV162TFLb_Tipo_Sel, AV235TFLb_EstEns_Sels, AV109TFLb_Local, AV110TFLb_Local_Sel, AV91TFLb_FechaE, AV143TFLb_Rb, AV144TFLb_Rb_To, AV133TFLb_obsLb, AV134TFLb_obsLb_Sel, AV239Pgmname, AV40OrderedBy, AV42OrderedDsc, A5555Lb_opcion, A5563Lb_FechaR, A5567Lb_FechaEn, A6461Lb_FecNoa1, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1U82( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Consulta Situacion Coleccion", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.gestionlaboratorio.consultasituacioncoleccion_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV230Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV217CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV218Lb_ArtCod)),GXutil.URLEncode(GXutil.ltrimstr(AV228Lb_numero,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV231Lb_EstEns,1,0)),GXutil.URLEncode(GXutil.formatDateParm(AV226Lb_FechaEfrom)),GXutil.URLEncode(GXutil.formatDateParm(AV227Lb_FechaEto)),GXutil.URLEncode(GXutil.rtrim(AV219Lb_Cartaz)),GXutil.URLEncode(GXutil.formatDateParm(AV220Lb_cartazffrom)),GXutil.URLEncode(GXutil.formatDateParm(AV221Lb_cartazfto)),GXutil.URLEncode(GXutil.rtrim(AV222Lb_ColNom)),GXutil.URLEncode(GXutil.ltrimstr(AV224Lb_ColNum,6,0)),GXutil.URLEncode(GXutil.rtrim(AV223Lb_ColNomC)),GXutil.URLEncode(GXutil.rtrim(AV233Lb_Tipo))}, new String[] {"Emprcod","CliCod","Lb_ArtCod","Lb_numero","Lb_EstEns","Lb_FechaEfrom","Lb_FechaEto","Lb_Cartaz","Lb_cartazffrom","Lb_cartazfto","Lb_ColNom","Lb_ColNum","Lb_ColNomC","Lb_Tipo"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ConsultaSituacionColeccion_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV239Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("gestionlaboratorio\\consultasituacioncoleccion_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXH_vFILTERFULLTEXT", AV27FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_41", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_41, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV37ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV37ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV28GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV29GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV24DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV24DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV5ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV5ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV230Emprcod", GXutil.rtrim( wcpOAV230Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV217CliCod", GXutil.ltrim( localUtil.ntoc( wcpOAV217CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV218Lb_ArtCod", GXutil.rtrim( wcpOAV218Lb_ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV228Lb_numero", GXutil.ltrim( localUtil.ntoc( wcpOAV228Lb_numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV231Lb_EstEns", GXutil.ltrim( localUtil.ntoc( wcpOAV231Lb_EstEns, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV226Lb_FechaEfrom", localUtil.dtoc( wcpOAV226Lb_FechaEfrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV227Lb_FechaEto", localUtil.dtoc( wcpOAV227Lb_FechaEto, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV219Lb_Cartaz", GXutil.rtrim( wcpOAV219Lb_Cartaz));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV220Lb_cartazffrom", localUtil.dtoc( wcpOAV220Lb_cartazffrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV221Lb_cartazfto", localUtil.dtoc( wcpOAV221Lb_cartazfto, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV222Lb_ColNom", GXutil.rtrim( wcpOAV222Lb_ColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV224Lb_ColNum", GXutil.ltrim( localUtil.ntoc( wcpOAV224Lb_ColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV223Lb_ColNomC", GXutil.rtrim( wcpOAV223Lb_ColNomC));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV233Lb_Tipo", GXutil.rtrim( wcpOAV233Lb_Tipo));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV38ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLINOM", GXutil.rtrim( AV47TFCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLINOM_SEL", GXutil.rtrim( AV48TFCliNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_CARTAZ", GXutil.rtrim( AV71TFLb_Cartaz));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_CARTAZ_SEL", GXutil.rtrim( AV72TFLb_Cartaz_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_ARTCOD", GXutil.rtrim( AV67TFLb_ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_ARTCOD_SEL", GXutil.rtrim( AV68TFLb_ArtCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_COLNOMC", GXutil.rtrim( AV77TFLb_ColNomC));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_COLNOMC_SEL", GXutil.rtrim( AV78TFLb_ColNomC_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_COLNOM", GXutil.rtrim( AV75TFLb_ColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_COLNOM_SEL", GXutil.rtrim( AV76TFLb_ColNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_COLNUM", GXutil.ltrim( localUtil.ntoc( AV79TFLb_ColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_COLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV80TFLb_ColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_NUMERO", GXutil.ltrim( localUtil.ntoc( AV125TFLb_numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_NUMERO_TO", GXutil.ltrim( localUtil.ntoc( AV126TFLb_numero_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_TIPO", GXutil.rtrim( AV161TFLb_Tipo));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_TIPO_SEL", GXutil.rtrim( AV162TFLb_Tipo_Sel));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vTFLB_ESTENS_SELS", AV235TFLb_EstEns_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vTFLB_ESTENS_SELS", AV235TFLb_EstEns_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_LOCAL", GXutil.rtrim( AV109TFLb_Local));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_LOCAL_SEL", GXutil.rtrim( AV110TFLb_Local_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_FECHAE", localUtil.dtoc( AV91TFLb_FechaE, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_RB", GXutil.ltrim( localUtil.ntoc( AV143TFLb_Rb, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_RB_TO", GXutil.ltrim( localUtil.ntoc( AV144TFLb_Rb_To, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_OBSLB", AV133TFLb_obsLb);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_OBSLB_SEL", AV134TFLb_obsLb_Sel);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV40OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV42OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV230Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD", GXutil.ltrim( localUtil.ntoc( AV217CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_ARTCOD", GXutil.rtrim( AV218Lb_ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_NUMERO", GXutil.ltrim( localUtil.ntoc( AV228Lb_numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_ESTENS", GXutil.ltrim( localUtil.ntoc( AV231Lb_EstEns, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_FECHAEFROM", localUtil.dtoc( AV226Lb_FechaEfrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_FECHAETO", localUtil.dtoc( AV227Lb_FechaEto, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_CARTAZ", GXutil.rtrim( AV219Lb_Cartaz));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_CARTAZFFROM", localUtil.dtoc( AV220Lb_cartazffrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_CARTAZFTO", localUtil.dtoc( AV221Lb_cartazfto, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_COLNOM", GXutil.rtrim( AV222Lb_ColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_COLNUM", GXutil.ltrim( localUtil.ntoc( AV224Lb_ColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_COLNOMC", GXutil.rtrim( AV223Lb_ColNomC));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_TIPO", GXutil.rtrim( AV233Lb_Tipo));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"LB_OPCION", GXutil.rtrim( A5555Lb_opcion));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"LB_FECHAR", localUtil.dtoc( A5563Lb_FechaR, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"LB_FECHAEN", localUtil.dtoc( A5567Lb_FechaEn, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"LB_FECNOA1", localUtil.dtoc( A6461Lb_FecNoa1, 0, "/"));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV30GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV30GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_ESTENS_SELSJSON", AV234TFLb_EstEns_SelsJson);
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

   public void renderHtmlCloseForm1U82( )
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
      return "GestionLaboratorio.ConsultaSituacionColeccion_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Consulta Situacion Coleccion", "") ;
   }

   public void wb1U80( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.gestionlaboratorio.consultasituacioncoleccion_wc");
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
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\ConsultaSituacionColeccion_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\ConsultaSituacionColeccion_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\ConsultaSituacionColeccion_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_23_1U82( true) ;
      }
      else
      {
         wb_table1_23_1U82( false) ;
      }
      return  ;
   }

   public void wb_table1_23_1U82e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV28GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV29GridPageCount);
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"W0067"+"", GXutil.rtrim( WebComp_Grid_dwc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+sPrefix+"gxHTMLWrpW0067"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_41_Refreshing )
            {
               if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldGrid_dwc), GXutil.lower( WebComp_Grid_dwc_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp(sPrefix+"gxHTMLWrpW0067"+"");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV239Pgmname), GXutil.rtrim( localUtil.format( AV239Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GestionLaboratorio\\ConsultaSituacionColeccion_WC.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV24DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV24DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV5ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_titlescategories.setProperty("GridTitlesCategories", Grid_titlescategories_Gridtitlescategories);
         ucGrid_titlescategories.render(context, "dvelop.gridtitlescategories", Grid_titlescategories_Internalname, sPrefix+"GRID_TITLESCATEGORIESContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasCategories", Grid_empowerer_Hascategories);
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_lb_fechaeauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'" + sPrefix + "',false,'" + sGXsfl_41_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_lb_fechaeauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_lb_fechaeauxdate_Internalname, localUtil.format(AV12DDO_Lb_FechaEAuxDate, "99/99/99"), localUtil.format( AV12DDO_Lb_FechaEAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,80);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_lb_fechaeauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\ConsultaSituacionColeccion_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_lb_fechaeauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_GestionLaboratorio\\ConsultaSituacionColeccion_WC.htm");
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

   public void start1U82( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Consulta Situacion Coleccion", ""), (short)(0)) ;
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
            strup1U80( ) ;
         }
      }
   }

   public void ws1U82( )
   {
      start1U82( ) ;
      evt1U82( ) ;
   }

   public void evt1U82( )
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
                              strup1U80( ) ;
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
                              strup1U80( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e111U82 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1U80( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e121U82 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1U80( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e131U82 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1U80( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e141U82 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1U80( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e151U82 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1U80( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e161U82 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1U80( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e171U82 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1U80( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = cmbavGridactiongroup1.getInternalname() ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 23), "VGRIDACTIONGROUP1.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 23), "VGRIDACTIONGROUP1.CLICK") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1U80( ) ;
                           }
                           nGXsfl_41_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_412( ) ;
                           cmbavGridactiongroup1.setName( cmbavGridactiongroup1.getInternalname() );
                           cmbavGridactiongroup1.setValue( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()) );
                           AV236GridActionGroup1 = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV236GridActionGroup1), 4, 0));
                           AV232DetailWebComponent = httpContext.cgiGet( edtavDetailwebcomponent_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDetailwebcomponent_Internalname, AV232DetailWebComponent);
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           A5540Lb_Cartaz = httpContext.cgiGet( edtLb_Cartaz_Internalname) ;
                           A5533Lb_ArtCod = httpContext.cgiGet( edtLb_ArtCod_Internalname) ;
                           A5538Lb_ColNomC = httpContext.cgiGet( edtLb_ColNomC_Internalname) ;
                           A5536Lb_ColNom = httpContext.cgiGet( edtLb_ColNom_Internalname) ;
                           A5537Lb_ColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtLb_ColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A5532Lb_numero = (int)(localUtil.ctol( httpContext.cgiGet( edtLb_numero_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A5570Lb_Tipo = httpContext.cgiGet( edtLb_Tipo_Internalname) ;
                           cmbLb_EstEns.setName( cmbLb_EstEns.getInternalname() );
                           cmbLb_EstEns.setValue( httpContext.cgiGet( cmbLb_EstEns.getInternalname()) );
                           A5569Lb_EstEns = (byte)(GXutil.lval( httpContext.cgiGet( cmbLb_EstEns.getInternalname()))) ;
                           AV229Lb_opcion = GXutil.upper( httpContext.cgiGet( edtavLb_opcion_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavLb_opcion_Internalname, AV229Lb_opcion);
                           A5701Lb_Local = httpContext.cgiGet( edtLb_Local_Internalname) ;
                           A5541Lb_FechaE = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtLb_FechaE_Internalname), 0)) ;
                           if ( localUtil.vcdtime( httpContext.cgiGet( edtavLb_fechaen_Internalname), (byte)(0), (byte)(0)) == 0 )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vLB_FECHAEN");
                              GX_FocusControl = edtavLb_fechaen_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV34Lb_FechaEn = GXutil.nullDate() ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavLb_fechaen_Internalname, localUtil.format(AV34Lb_FechaEn, "99/99/99"));
                           }
                           else
                           {
                              AV34Lb_FechaEn = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavLb_fechaen_Internalname), 0)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavLb_fechaen_Internalname, localUtil.format(AV34Lb_FechaEn, "99/99/99"));
                           }
                           if ( localUtil.vcdtime( httpContext.cgiGet( edtavLb_fechar_Internalname), (byte)(0), (byte)(0)) == 0 )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vLB_FECHAR");
                              GX_FocusControl = edtavLb_fechar_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV35Lb_FechaR = GXutil.nullDate() ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavLb_fechar_Internalname, localUtil.format(AV35Lb_FechaR, "99/99/99"));
                           }
                           else
                           {
                              AV35Lb_FechaR = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavLb_fechar_Internalname), 0)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavLb_fechar_Internalname, localUtil.format(AV35Lb_FechaR, "99/99/99"));
                           }
                           if ( localUtil.vcdtime( httpContext.cgiGet( edtavLb_fecnoa1_Internalname), (byte)(0), (byte)(0)) == 0 )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vLB_FECNOA1");
                              GX_FocusControl = edtavLb_fecnoa1_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV36Lb_FecNoa1 = GXutil.nullDate() ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavLb_fecnoa1_Internalname, localUtil.format(AV36Lb_FecNoa1, "99/99/99"));
                           }
                           else
                           {
                              AV36Lb_FecNoa1 = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavLb_fecnoa1_Internalname), 0)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavLb_fecnoa1_Internalname, localUtil.format(AV36Lb_FecNoa1, "99/99/99"));
                           }
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A5547Lb_Rb = localUtil.ctond( httpContext.cgiGet( edtLb_Rb_Internalname)) ;
                           A10883Lb_obsLb = httpContext.cgiGet( edtLb_obsLb_Internalname) ;
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
                                       GX_FocusControl = cmbavGridactiongroup1.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e181U82 ();
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
                                       GX_FocusControl = cmbavGridactiongroup1.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e191U82 ();
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
                                       GX_FocusControl = cmbavGridactiongroup1.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e201U82 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONGROUP1.CLICK") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavGridactiongroup1.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e211U82 ();
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
                                          if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV27FilterFullText) != 0 )
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
                                    strup1U80( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavGridactiongroup1.getInternalname() ;
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
                     if ( nCmpId == 67 )
                     {
                        OldGrid_dwc = httpContext.cgiGet( sPrefix+"W0067") ;
                        if ( ( GXutil.len( OldGrid_dwc) == 0 ) || ( GXutil.strcmp(OldGrid_dwc, WebComp_Grid_dwc_Component) != 0 ) )
                        {
                           WebComp_Grid_dwc = WebUtils.getWebComponent(getClass(), "app." + OldGrid_dwc + "_impl", remoteHandle, context);
                           WebComp_Grid_dwc_Component = OldGrid_dwc ;
                        }
                        if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
                        {
                           WebComp_Grid_dwc.componentprocess(sPrefix+"W0067", "", sEvt);
                        }
                        WebComp_Grid_dwc_Component = OldGrid_dwc ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we1U82( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1U82( ) ;
         }
      }
   }

   public void pa1U82( )
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
                                 String AV27FilterFullText ,
                                 String AV230Emprcod ,
                                 int AV217CliCod ,
                                 String AV218Lb_ArtCod ,
                                 int AV228Lb_numero ,
                                 byte AV231Lb_EstEns ,
                                 java.util.Date AV226Lb_FechaEfrom ,
                                 java.util.Date AV227Lb_FechaEto ,
                                 String AV219Lb_Cartaz ,
                                 java.util.Date AV220Lb_cartazffrom ,
                                 java.util.Date AV221Lb_cartazfto ,
                                 String AV222Lb_ColNom ,
                                 int AV224Lb_ColNum ,
                                 String AV223Lb_ColNomC ,
                                 String AV233Lb_Tipo ,
                                 byte AV38ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV5ColumnsSelector ,
                                 String AV47TFCliNom ,
                                 String AV48TFCliNom_Sel ,
                                 String AV71TFLb_Cartaz ,
                                 String AV72TFLb_Cartaz_Sel ,
                                 String AV67TFLb_ArtCod ,
                                 String AV68TFLb_ArtCod_Sel ,
                                 String AV77TFLb_ColNomC ,
                                 String AV78TFLb_ColNomC_Sel ,
                                 String AV75TFLb_ColNom ,
                                 String AV76TFLb_ColNom_Sel ,
                                 int AV79TFLb_ColNum ,
                                 int AV80TFLb_ColNum_To ,
                                 int AV125TFLb_numero ,
                                 int AV126TFLb_numero_To ,
                                 String AV161TFLb_Tipo ,
                                 String AV162TFLb_Tipo_Sel ,
                                 GXSimpleCollection<Byte> AV235TFLb_EstEns_Sels ,
                                 String AV109TFLb_Local ,
                                 String AV110TFLb_Local_Sel ,
                                 java.util.Date AV91TFLb_FechaE ,
                                 java.math.BigDecimal AV143TFLb_Rb ,
                                 java.math.BigDecimal AV144TFLb_Rb_To ,
                                 String AV133TFLb_obsLb ,
                                 String AV134TFLb_obsLb_Sel ,
                                 String AV239Pgmname ,
                                 short AV40OrderedBy ,
                                 boolean AV42OrderedDsc ,
                                 String A5555Lb_opcion ,
                                 java.util.Date A5563Lb_FechaR ,
                                 java.util.Date A5567Lb_FechaEn ,
                                 java.util.Date A6461Lb_FecNoa1 ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e191U82 ();
      GRID_nCurrentRecord = 0 ;
      rf1U82( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ConsultaSituacionColeccion_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV239Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("gestionlaboratorio\\consultasituacioncoleccion_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_LB_NUMERO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A5532Lb_numero), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"LB_NUMERO", GXutil.ltrim( localUtil.ntoc( A5532Lb_numero, (byte)(8), (byte)(0), ".", "")));
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
      rf1U82( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV239Pgmname = "GestionLaboratorio.ConsultaSituacionColeccion_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV239Pgmname", AV239Pgmname);
      Gx_err = (short)(0) ;
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavLb_opcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavLb_opcion_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLb_opcion_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavLb_fechaen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavLb_fechaen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLb_fechaen_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavLb_fechar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavLb_fechar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLb_fechar_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavLb_fecnoa1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavLb_fecnoa1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLb_fecnoa1_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1U82( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(41) ;
      /* Execute user event: Refresh */
      e191U82 ();
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
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_412( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Byte.valueOf(A5569Lb_EstEns) ,
                                              AV260Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels ,
                                              AV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext ,
                                              AV245Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel ,
                                              AV244Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom ,
                                              AV247Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel ,
                                              AV246Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz ,
                                              AV249Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel ,
                                              AV248Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod ,
                                              AV251Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel ,
                                              AV250Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc ,
                                              AV253Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel ,
                                              AV252Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom ,
                                              Integer.valueOf(AV254Gestionlaboratorio_consultasituacioncoleccion_wcds_12_tflb_colnum) ,
                                              Integer.valueOf(AV255Gestionlaboratorio_consultasituacioncoleccion_wcds_13_tflb_colnum_to) ,
                                              Integer.valueOf(AV256Gestionlaboratorio_consultasituacioncoleccion_wcds_14_tflb_numero) ,
                                              Integer.valueOf(AV257Gestionlaboratorio_consultasituacioncoleccion_wcds_15_tflb_numero_to) ,
                                              AV259Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel ,
                                              AV258Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo ,
                                              Integer.valueOf(AV260Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels.size()) ,
                                              AV262Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel ,
                                              AV261Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local ,
                                              AV263Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae ,
                                              AV264Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb ,
                                              AV265Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to ,
                                              AV267Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel ,
                                              AV266Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb ,
                                              Integer.valueOf(AV217CliCod) ,
                                              Integer.valueOf(AV228Lb_numero) ,
                                              AV220Lb_cartazffrom ,
                                              AV221Lb_cartazfto ,
                                              AV226Lb_FechaEfrom ,
                                              AV227Lb_FechaEto ,
                                              Integer.valueOf(AV224Lb_ColNum) ,
                                              A279CliNom ,
                                              A5540Lb_Cartaz ,
                                              A5533Lb_ArtCod ,
                                              A5538Lb_ColNomC ,
                                              A5536Lb_ColNom ,
                                              Integer.valueOf(A5537Lb_ColNum) ,
                                              Integer.valueOf(A5532Lb_numero) ,
                                              A5570Lb_Tipo ,
                                              A5701Lb_Local ,
                                              A5547Lb_Rb ,
                                              A10883Lb_obsLb ,
                                              A5541Lb_FechaE ,
                                              Integer.valueOf(A252CliCod) ,
                                              A5594Lb_cartazf ,
                                              Short.valueOf(AV40OrderedBy) ,
                                              Boolean.valueOf(AV42OrderedDsc) ,
                                              AV219Lb_Cartaz ,
                                              AV218Lb_ArtCod ,
                                              AV223Lb_ColNomC ,
                                              AV222Lb_ColNom ,
                                              Byte.valueOf(AV231Lb_EstEns) ,
                                              AV233Lb_Tipo ,
                                              AV230Emprcod ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                              TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV219Lb_Cartaz = GXutil.padr( GXutil.rtrim( AV219Lb_Cartaz), 20, "%") ;
         lV218Lb_ArtCod = GXutil.padr( GXutil.rtrim( AV218Lb_ArtCod), 16, "%") ;
         lV223Lb_ColNomC = GXutil.padr( GXutil.rtrim( AV223Lb_ColNomC), 13, "%") ;
         lV222Lb_ColNom = GXutil.padr( GXutil.rtrim( AV222Lb_ColNom), 13, "%") ;
         lV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
         lV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
         lV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
         lV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
         lV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
         lV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
         lV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
         lV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
         lV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
         lV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
         lV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
         lV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
         lV244Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV244Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom), 30, "%") ;
         lV246Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV246Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz), 20, "%") ;
         lV248Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod = GXutil.padr( GXutil.rtrim( AV248Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod), 16, "%") ;
         lV250Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc = GXutil.padr( GXutil.rtrim( AV250Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc), 13, "%") ;
         lV252Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom = GXutil.padr( GXutil.rtrim( AV252Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom), 13, "%") ;
         lV258Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo = GXutil.padr( GXutil.rtrim( AV258Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo), 1, "%") ;
         lV261Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local = GXutil.padr( GXutil.rtrim( AV261Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local), 10, "%") ;
         lV266Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb = GXutil.concat( GXutil.rtrim( AV266Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb), "%", "") ;
         /* Using cursor H01U82 */
         pr_default.execute(0, new Object[] {AV230Emprcod, lV219Lb_Cartaz, AV219Lb_Cartaz, lV218Lb_ArtCod, AV218Lb_ArtCod, lV223Lb_ColNomC, AV223Lb_ColNomC, lV222Lb_ColNom, AV222Lb_ColNom, Byte.valueOf(AV231Lb_EstEns), Byte.valueOf(AV231Lb_EstEns), AV233Lb_Tipo, AV233Lb_Tipo, lV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV244Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom, AV245Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel, lV246Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz, AV247Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel, lV248Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod, AV249Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel, lV250Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc, AV251Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel, lV252Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom, AV253Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel, Integer.valueOf(AV254Gestionlaboratorio_consultasituacioncoleccion_wcds_12_tflb_colnum), Integer.valueOf(AV255Gestionlaboratorio_consultasituacioncoleccion_wcds_13_tflb_colnum_to), Integer.valueOf(AV256Gestionlaboratorio_consultasituacioncoleccion_wcds_14_tflb_numero), Integer.valueOf(AV257Gestionlaboratorio_consultasituacioncoleccion_wcds_15_tflb_numero_to), lV258Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo, AV259Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel, lV261Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local, AV262Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel, AV263Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae, AV264Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb, AV265Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to, lV266Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb, AV267Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel, Integer.valueOf(AV217CliCod), Integer.valueOf(AV228Lb_numero), AV220Lb_cartazffrom, AV221Lb_cartazfto, AV226Lb_FechaEfrom, AV227Lb_FechaEto, Integer.valueOf(AV224Lb_ColNum), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_41_idx = 1 ;
         sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_412( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A5532Lb_numero = H01U82_A5532Lb_numero[0] ;
            A396EmprCod = H01U82_A396EmprCod[0] ;
            A5594Lb_cartazf = H01U82_A5594Lb_cartazf[0] ;
            A252CliCod = H01U82_A252CliCod[0] ;
            A10883Lb_obsLb = H01U82_A10883Lb_obsLb[0] ;
            A5547Lb_Rb = H01U82_A5547Lb_Rb[0] ;
            A5541Lb_FechaE = H01U82_A5541Lb_FechaE[0] ;
            A5701Lb_Local = H01U82_A5701Lb_Local[0] ;
            A5569Lb_EstEns = H01U82_A5569Lb_EstEns[0] ;
            A5570Lb_Tipo = H01U82_A5570Lb_Tipo[0] ;
            A5537Lb_ColNum = H01U82_A5537Lb_ColNum[0] ;
            A5536Lb_ColNom = H01U82_A5536Lb_ColNom[0] ;
            A5538Lb_ColNomC = H01U82_A5538Lb_ColNomC[0] ;
            A5533Lb_ArtCod = H01U82_A5533Lb_ArtCod[0] ;
            A5540Lb_Cartaz = H01U82_A5540Lb_Cartaz[0] ;
            A279CliNom = H01U82_A279CliNom[0] ;
            A279CliNom = H01U82_A279CliNom[0] ;
            e201U82 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(41) ;
         wb1U80( ) ;
      }
      bGXsfl_41_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1U82( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD"+"_"+sGXsfl_41_idx, getSecureSignedToken( sPrefix+sGXsfl_41_idx, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_LB_NUMERO"+"_"+sGXsfl_41_idx, getSecureSignedToken( sPrefix+sGXsfl_41_idx, localUtil.format( DecimalUtil.doubleToDec(A5532Lb_numero), "ZZZZZZZ9")));
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
      AV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = AV27FilterFullText ;
      AV244Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom = AV47TFCliNom ;
      AV245Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel = AV48TFCliNom_Sel ;
      AV246Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz = AV71TFLb_Cartaz ;
      AV247Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel = AV72TFLb_Cartaz_Sel ;
      AV248Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod = AV67TFLb_ArtCod ;
      AV249Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel = AV68TFLb_ArtCod_Sel ;
      AV250Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc = AV77TFLb_ColNomC ;
      AV251Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel = AV78TFLb_ColNomC_Sel ;
      AV252Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom = AV75TFLb_ColNom ;
      AV253Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel = AV76TFLb_ColNom_Sel ;
      AV254Gestionlaboratorio_consultasituacioncoleccion_wcds_12_tflb_colnum = AV79TFLb_ColNum ;
      AV255Gestionlaboratorio_consultasituacioncoleccion_wcds_13_tflb_colnum_to = AV80TFLb_ColNum_To ;
      AV256Gestionlaboratorio_consultasituacioncoleccion_wcds_14_tflb_numero = AV125TFLb_numero ;
      AV257Gestionlaboratorio_consultasituacioncoleccion_wcds_15_tflb_numero_to = AV126TFLb_numero_To ;
      AV258Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo = AV161TFLb_Tipo ;
      AV259Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel = AV162TFLb_Tipo_Sel ;
      AV260Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels = AV235TFLb_EstEns_Sels ;
      AV261Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local = AV109TFLb_Local ;
      AV262Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel = AV110TFLb_Local_Sel ;
      AV263Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae = AV91TFLb_FechaE ;
      AV264Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb = AV143TFLb_Rb ;
      AV265Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to = AV144TFLb_Rb_To ;
      AV266Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb = AV133TFLb_obsLb ;
      AV267Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel = AV134TFLb_obsLb_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Byte.valueOf(A5569Lb_EstEns) ,
                                           AV260Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels ,
                                           AV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext ,
                                           AV245Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel ,
                                           AV244Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom ,
                                           AV247Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel ,
                                           AV246Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz ,
                                           AV249Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel ,
                                           AV248Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod ,
                                           AV251Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel ,
                                           AV250Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc ,
                                           AV253Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel ,
                                           AV252Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom ,
                                           Integer.valueOf(AV254Gestionlaboratorio_consultasituacioncoleccion_wcds_12_tflb_colnum) ,
                                           Integer.valueOf(AV255Gestionlaboratorio_consultasituacioncoleccion_wcds_13_tflb_colnum_to) ,
                                           Integer.valueOf(AV256Gestionlaboratorio_consultasituacioncoleccion_wcds_14_tflb_numero) ,
                                           Integer.valueOf(AV257Gestionlaboratorio_consultasituacioncoleccion_wcds_15_tflb_numero_to) ,
                                           AV259Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel ,
                                           AV258Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo ,
                                           Integer.valueOf(AV260Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels.size()) ,
                                           AV262Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel ,
                                           AV261Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local ,
                                           AV263Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae ,
                                           AV264Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb ,
                                           AV265Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to ,
                                           AV267Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel ,
                                           AV266Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb ,
                                           Integer.valueOf(AV217CliCod) ,
                                           Integer.valueOf(AV228Lb_numero) ,
                                           AV220Lb_cartazffrom ,
                                           AV221Lb_cartazfto ,
                                           AV226Lb_FechaEfrom ,
                                           AV227Lb_FechaEto ,
                                           Integer.valueOf(AV224Lb_ColNum) ,
                                           A279CliNom ,
                                           A5540Lb_Cartaz ,
                                           A5533Lb_ArtCod ,
                                           A5538Lb_ColNomC ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           A5570Lb_Tipo ,
                                           A5701Lb_Local ,
                                           A5547Lb_Rb ,
                                           A10883Lb_obsLb ,
                                           A5541Lb_FechaE ,
                                           Integer.valueOf(A252CliCod) ,
                                           A5594Lb_cartazf ,
                                           Short.valueOf(AV40OrderedBy) ,
                                           Boolean.valueOf(AV42OrderedDsc) ,
                                           AV219Lb_Cartaz ,
                                           AV218Lb_ArtCod ,
                                           AV223Lb_ColNomC ,
                                           AV222Lb_ColNom ,
                                           Byte.valueOf(AV231Lb_EstEns) ,
                                           AV233Lb_Tipo ,
                                           AV230Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV219Lb_Cartaz = GXutil.padr( GXutil.rtrim( AV219Lb_Cartaz), 20, "%") ;
      lV218Lb_ArtCod = GXutil.padr( GXutil.rtrim( AV218Lb_ArtCod), 16, "%") ;
      lV223Lb_ColNomC = GXutil.padr( GXutil.rtrim( AV223Lb_ColNomC), 13, "%") ;
      lV222Lb_ColNom = GXutil.padr( GXutil.rtrim( AV222Lb_ColNom), 13, "%") ;
      lV222Lb_ColNom = GXutil.padr( GXutil.rtrim( AV222Lb_ColNom), 13, "%") ;
      lV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV244Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV244Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom), 30, "%") ;
      lV246Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV246Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz), 20, "%") ;
      lV248Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod = GXutil.padr( GXutil.rtrim( AV248Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod), 16, "%") ;
      lV250Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc = GXutil.padr( GXutil.rtrim( AV250Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc), 13, "%") ;
      lV252Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom = GXutil.padr( GXutil.rtrim( AV252Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom), 13, "%") ;
      lV258Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo = GXutil.padr( GXutil.rtrim( AV258Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo), 1, "%") ;
      lV261Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local = GXutil.padr( GXutil.rtrim( AV261Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local), 10, "%") ;
      lV266Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb = GXutil.concat( GXutil.rtrim( AV266Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb), "%", "") ;
      /* Using cursor H01U83 */
      pr_default.execute(1, new Object[] {AV230Emprcod, lV219Lb_Cartaz, AV219Lb_Cartaz, lV218Lb_ArtCod, AV218Lb_ArtCod, lV223Lb_ColNomC, AV223Lb_ColNomC, lV222Lb_ColNom, AV222Lb_ColNom, Byte.valueOf(AV231Lb_EstEns), Byte.valueOf(AV231Lb_EstEns), lV222Lb_ColNom, AV222Lb_ColNom, AV233Lb_Tipo, AV233Lb_Tipo, lV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV244Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom, AV245Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel, lV246Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz, AV247Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel, lV248Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod, AV249Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel, lV250Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc, AV251Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel, lV252Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom, AV253Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel, Integer.valueOf(AV254Gestionlaboratorio_consultasituacioncoleccion_wcds_12_tflb_colnum), Integer.valueOf(AV255Gestionlaboratorio_consultasituacioncoleccion_wcds_13_tflb_colnum_to), Integer.valueOf(AV256Gestionlaboratorio_consultasituacioncoleccion_wcds_14_tflb_numero), Integer.valueOf(AV257Gestionlaboratorio_consultasituacioncoleccion_wcds_15_tflb_numero_to), lV258Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo, AV259Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel, lV261Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local, AV262Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel, AV263Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae, AV264Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb, AV265Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to, lV266Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb, AV267Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel, Integer.valueOf(AV217CliCod), Integer.valueOf(AV228Lb_numero), AV220Lb_cartazffrom, AV221Lb_cartazfto, AV226Lb_FechaEfrom, AV227Lb_FechaEto, Integer.valueOf(AV224Lb_ColNum)});
      GRID_nRecordCount = H01U83_AGRID_nRecordCount[0] ;
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
      AV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = AV27FilterFullText ;
      AV244Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom = AV47TFCliNom ;
      AV245Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel = AV48TFCliNom_Sel ;
      AV246Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz = AV71TFLb_Cartaz ;
      AV247Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel = AV72TFLb_Cartaz_Sel ;
      AV248Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod = AV67TFLb_ArtCod ;
      AV249Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel = AV68TFLb_ArtCod_Sel ;
      AV250Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc = AV77TFLb_ColNomC ;
      AV251Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel = AV78TFLb_ColNomC_Sel ;
      AV252Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom = AV75TFLb_ColNom ;
      AV253Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel = AV76TFLb_ColNom_Sel ;
      AV254Gestionlaboratorio_consultasituacioncoleccion_wcds_12_tflb_colnum = AV79TFLb_ColNum ;
      AV255Gestionlaboratorio_consultasituacioncoleccion_wcds_13_tflb_colnum_to = AV80TFLb_ColNum_To ;
      AV256Gestionlaboratorio_consultasituacioncoleccion_wcds_14_tflb_numero = AV125TFLb_numero ;
      AV257Gestionlaboratorio_consultasituacioncoleccion_wcds_15_tflb_numero_to = AV126TFLb_numero_To ;
      AV258Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo = AV161TFLb_Tipo ;
      AV259Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel = AV162TFLb_Tipo_Sel ;
      AV260Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels = AV235TFLb_EstEns_Sels ;
      AV261Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local = AV109TFLb_Local ;
      AV262Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel = AV110TFLb_Local_Sel ;
      AV263Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae = AV91TFLb_FechaE ;
      AV264Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb = AV143TFLb_Rb ;
      AV265Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to = AV144TFLb_Rb_To ;
      AV266Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb = AV133TFLb_obsLb ;
      AV267Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel = AV134TFLb_obsLb_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV27FilterFullText, AV230Emprcod, AV217CliCod, AV218Lb_ArtCod, AV228Lb_numero, AV231Lb_EstEns, AV226Lb_FechaEfrom, AV227Lb_FechaEto, AV219Lb_Cartaz, AV220Lb_cartazffrom, AV221Lb_cartazfto, AV222Lb_ColNom, AV224Lb_ColNum, AV223Lb_ColNomC, AV233Lb_Tipo, AV38ManageFiltersExecutionStep, AV5ColumnsSelector, AV47TFCliNom, AV48TFCliNom_Sel, AV71TFLb_Cartaz, AV72TFLb_Cartaz_Sel, AV67TFLb_ArtCod, AV68TFLb_ArtCod_Sel, AV77TFLb_ColNomC, AV78TFLb_ColNomC_Sel, AV75TFLb_ColNom, AV76TFLb_ColNom_Sel, AV79TFLb_ColNum, AV80TFLb_ColNum_To, AV125TFLb_numero, AV126TFLb_numero_To, AV161TFLb_Tipo, AV162TFLb_Tipo_Sel, AV235TFLb_EstEns_Sels, AV109TFLb_Local, AV110TFLb_Local_Sel, AV91TFLb_FechaE, AV143TFLb_Rb, AV144TFLb_Rb_To, AV133TFLb_obsLb, AV134TFLb_obsLb_Sel, AV239Pgmname, AV40OrderedBy, AV42OrderedDsc, A5555Lb_opcion, A5563Lb_FechaR, A5567Lb_FechaEn, A6461Lb_FecNoa1, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = AV27FilterFullText ;
      AV244Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom = AV47TFCliNom ;
      AV245Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel = AV48TFCliNom_Sel ;
      AV246Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz = AV71TFLb_Cartaz ;
      AV247Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel = AV72TFLb_Cartaz_Sel ;
      AV248Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod = AV67TFLb_ArtCod ;
      AV249Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel = AV68TFLb_ArtCod_Sel ;
      AV250Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc = AV77TFLb_ColNomC ;
      AV251Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel = AV78TFLb_ColNomC_Sel ;
      AV252Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom = AV75TFLb_ColNom ;
      AV253Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel = AV76TFLb_ColNom_Sel ;
      AV254Gestionlaboratorio_consultasituacioncoleccion_wcds_12_tflb_colnum = AV79TFLb_ColNum ;
      AV255Gestionlaboratorio_consultasituacioncoleccion_wcds_13_tflb_colnum_to = AV80TFLb_ColNum_To ;
      AV256Gestionlaboratorio_consultasituacioncoleccion_wcds_14_tflb_numero = AV125TFLb_numero ;
      AV257Gestionlaboratorio_consultasituacioncoleccion_wcds_15_tflb_numero_to = AV126TFLb_numero_To ;
      AV258Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo = AV161TFLb_Tipo ;
      AV259Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel = AV162TFLb_Tipo_Sel ;
      AV260Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels = AV235TFLb_EstEns_Sels ;
      AV261Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local = AV109TFLb_Local ;
      AV262Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel = AV110TFLb_Local_Sel ;
      AV263Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae = AV91TFLb_FechaE ;
      AV264Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb = AV143TFLb_Rb ;
      AV265Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to = AV144TFLb_Rb_To ;
      AV266Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb = AV133TFLb_obsLb ;
      AV267Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel = AV134TFLb_obsLb_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV27FilterFullText, AV230Emprcod, AV217CliCod, AV218Lb_ArtCod, AV228Lb_numero, AV231Lb_EstEns, AV226Lb_FechaEfrom, AV227Lb_FechaEto, AV219Lb_Cartaz, AV220Lb_cartazffrom, AV221Lb_cartazfto, AV222Lb_ColNom, AV224Lb_ColNum, AV223Lb_ColNomC, AV233Lb_Tipo, AV38ManageFiltersExecutionStep, AV5ColumnsSelector, AV47TFCliNom, AV48TFCliNom_Sel, AV71TFLb_Cartaz, AV72TFLb_Cartaz_Sel, AV67TFLb_ArtCod, AV68TFLb_ArtCod_Sel, AV77TFLb_ColNomC, AV78TFLb_ColNomC_Sel, AV75TFLb_ColNom, AV76TFLb_ColNom_Sel, AV79TFLb_ColNum, AV80TFLb_ColNum_To, AV125TFLb_numero, AV126TFLb_numero_To, AV161TFLb_Tipo, AV162TFLb_Tipo_Sel, AV235TFLb_EstEns_Sels, AV109TFLb_Local, AV110TFLb_Local_Sel, AV91TFLb_FechaE, AV143TFLb_Rb, AV144TFLb_Rb_To, AV133TFLb_obsLb, AV134TFLb_obsLb_Sel, AV239Pgmname, AV40OrderedBy, AV42OrderedDsc, A5555Lb_opcion, A5563Lb_FechaR, A5567Lb_FechaEn, A6461Lb_FecNoa1, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = AV27FilterFullText ;
      AV244Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom = AV47TFCliNom ;
      AV245Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel = AV48TFCliNom_Sel ;
      AV246Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz = AV71TFLb_Cartaz ;
      AV247Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel = AV72TFLb_Cartaz_Sel ;
      AV248Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod = AV67TFLb_ArtCod ;
      AV249Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel = AV68TFLb_ArtCod_Sel ;
      AV250Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc = AV77TFLb_ColNomC ;
      AV251Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel = AV78TFLb_ColNomC_Sel ;
      AV252Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom = AV75TFLb_ColNom ;
      AV253Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel = AV76TFLb_ColNom_Sel ;
      AV254Gestionlaboratorio_consultasituacioncoleccion_wcds_12_tflb_colnum = AV79TFLb_ColNum ;
      AV255Gestionlaboratorio_consultasituacioncoleccion_wcds_13_tflb_colnum_to = AV80TFLb_ColNum_To ;
      AV256Gestionlaboratorio_consultasituacioncoleccion_wcds_14_tflb_numero = AV125TFLb_numero ;
      AV257Gestionlaboratorio_consultasituacioncoleccion_wcds_15_tflb_numero_to = AV126TFLb_numero_To ;
      AV258Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo = AV161TFLb_Tipo ;
      AV259Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel = AV162TFLb_Tipo_Sel ;
      AV260Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels = AV235TFLb_EstEns_Sels ;
      AV261Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local = AV109TFLb_Local ;
      AV262Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel = AV110TFLb_Local_Sel ;
      AV263Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae = AV91TFLb_FechaE ;
      AV264Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb = AV143TFLb_Rb ;
      AV265Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to = AV144TFLb_Rb_To ;
      AV266Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb = AV133TFLb_obsLb ;
      AV267Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel = AV134TFLb_obsLb_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV27FilterFullText, AV230Emprcod, AV217CliCod, AV218Lb_ArtCod, AV228Lb_numero, AV231Lb_EstEns, AV226Lb_FechaEfrom, AV227Lb_FechaEto, AV219Lb_Cartaz, AV220Lb_cartazffrom, AV221Lb_cartazfto, AV222Lb_ColNom, AV224Lb_ColNum, AV223Lb_ColNomC, AV233Lb_Tipo, AV38ManageFiltersExecutionStep, AV5ColumnsSelector, AV47TFCliNom, AV48TFCliNom_Sel, AV71TFLb_Cartaz, AV72TFLb_Cartaz_Sel, AV67TFLb_ArtCod, AV68TFLb_ArtCod_Sel, AV77TFLb_ColNomC, AV78TFLb_ColNomC_Sel, AV75TFLb_ColNom, AV76TFLb_ColNom_Sel, AV79TFLb_ColNum, AV80TFLb_ColNum_To, AV125TFLb_numero, AV126TFLb_numero_To, AV161TFLb_Tipo, AV162TFLb_Tipo_Sel, AV235TFLb_EstEns_Sels, AV109TFLb_Local, AV110TFLb_Local_Sel, AV91TFLb_FechaE, AV143TFLb_Rb, AV144TFLb_Rb_To, AV133TFLb_obsLb, AV134TFLb_obsLb_Sel, AV239Pgmname, AV40OrderedBy, AV42OrderedDsc, A5555Lb_opcion, A5563Lb_FechaR, A5567Lb_FechaEn, A6461Lb_FecNoa1, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = AV27FilterFullText ;
      AV244Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom = AV47TFCliNom ;
      AV245Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel = AV48TFCliNom_Sel ;
      AV246Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz = AV71TFLb_Cartaz ;
      AV247Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel = AV72TFLb_Cartaz_Sel ;
      AV248Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod = AV67TFLb_ArtCod ;
      AV249Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel = AV68TFLb_ArtCod_Sel ;
      AV250Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc = AV77TFLb_ColNomC ;
      AV251Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel = AV78TFLb_ColNomC_Sel ;
      AV252Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom = AV75TFLb_ColNom ;
      AV253Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel = AV76TFLb_ColNom_Sel ;
      AV254Gestionlaboratorio_consultasituacioncoleccion_wcds_12_tflb_colnum = AV79TFLb_ColNum ;
      AV255Gestionlaboratorio_consultasituacioncoleccion_wcds_13_tflb_colnum_to = AV80TFLb_ColNum_To ;
      AV256Gestionlaboratorio_consultasituacioncoleccion_wcds_14_tflb_numero = AV125TFLb_numero ;
      AV257Gestionlaboratorio_consultasituacioncoleccion_wcds_15_tflb_numero_to = AV126TFLb_numero_To ;
      AV258Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo = AV161TFLb_Tipo ;
      AV259Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel = AV162TFLb_Tipo_Sel ;
      AV260Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels = AV235TFLb_EstEns_Sels ;
      AV261Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local = AV109TFLb_Local ;
      AV262Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel = AV110TFLb_Local_Sel ;
      AV263Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae = AV91TFLb_FechaE ;
      AV264Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb = AV143TFLb_Rb ;
      AV265Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to = AV144TFLb_Rb_To ;
      AV266Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb = AV133TFLb_obsLb ;
      AV267Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel = AV134TFLb_obsLb_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV27FilterFullText, AV230Emprcod, AV217CliCod, AV218Lb_ArtCod, AV228Lb_numero, AV231Lb_EstEns, AV226Lb_FechaEfrom, AV227Lb_FechaEto, AV219Lb_Cartaz, AV220Lb_cartazffrom, AV221Lb_cartazfto, AV222Lb_ColNom, AV224Lb_ColNum, AV223Lb_ColNomC, AV233Lb_Tipo, AV38ManageFiltersExecutionStep, AV5ColumnsSelector, AV47TFCliNom, AV48TFCliNom_Sel, AV71TFLb_Cartaz, AV72TFLb_Cartaz_Sel, AV67TFLb_ArtCod, AV68TFLb_ArtCod_Sel, AV77TFLb_ColNomC, AV78TFLb_ColNomC_Sel, AV75TFLb_ColNom, AV76TFLb_ColNom_Sel, AV79TFLb_ColNum, AV80TFLb_ColNum_To, AV125TFLb_numero, AV126TFLb_numero_To, AV161TFLb_Tipo, AV162TFLb_Tipo_Sel, AV235TFLb_EstEns_Sels, AV109TFLb_Local, AV110TFLb_Local_Sel, AV91TFLb_FechaE, AV143TFLb_Rb, AV144TFLb_Rb_To, AV133TFLb_obsLb, AV134TFLb_obsLb_Sel, AV239Pgmname, AV40OrderedBy, AV42OrderedDsc, A5555Lb_opcion, A5563Lb_FechaR, A5567Lb_FechaEn, A6461Lb_FecNoa1, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = AV27FilterFullText ;
      AV244Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom = AV47TFCliNom ;
      AV245Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel = AV48TFCliNom_Sel ;
      AV246Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz = AV71TFLb_Cartaz ;
      AV247Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel = AV72TFLb_Cartaz_Sel ;
      AV248Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod = AV67TFLb_ArtCod ;
      AV249Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel = AV68TFLb_ArtCod_Sel ;
      AV250Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc = AV77TFLb_ColNomC ;
      AV251Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel = AV78TFLb_ColNomC_Sel ;
      AV252Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom = AV75TFLb_ColNom ;
      AV253Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel = AV76TFLb_ColNom_Sel ;
      AV254Gestionlaboratorio_consultasituacioncoleccion_wcds_12_tflb_colnum = AV79TFLb_ColNum ;
      AV255Gestionlaboratorio_consultasituacioncoleccion_wcds_13_tflb_colnum_to = AV80TFLb_ColNum_To ;
      AV256Gestionlaboratorio_consultasituacioncoleccion_wcds_14_tflb_numero = AV125TFLb_numero ;
      AV257Gestionlaboratorio_consultasituacioncoleccion_wcds_15_tflb_numero_to = AV126TFLb_numero_To ;
      AV258Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo = AV161TFLb_Tipo ;
      AV259Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel = AV162TFLb_Tipo_Sel ;
      AV260Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels = AV235TFLb_EstEns_Sels ;
      AV261Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local = AV109TFLb_Local ;
      AV262Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel = AV110TFLb_Local_Sel ;
      AV263Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae = AV91TFLb_FechaE ;
      AV264Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb = AV143TFLb_Rb ;
      AV265Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to = AV144TFLb_Rb_To ;
      AV266Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb = AV133TFLb_obsLb ;
      AV267Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel = AV134TFLb_obsLb_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV27FilterFullText, AV230Emprcod, AV217CliCod, AV218Lb_ArtCod, AV228Lb_numero, AV231Lb_EstEns, AV226Lb_FechaEfrom, AV227Lb_FechaEto, AV219Lb_Cartaz, AV220Lb_cartazffrom, AV221Lb_cartazfto, AV222Lb_ColNom, AV224Lb_ColNum, AV223Lb_ColNomC, AV233Lb_Tipo, AV38ManageFiltersExecutionStep, AV5ColumnsSelector, AV47TFCliNom, AV48TFCliNom_Sel, AV71TFLb_Cartaz, AV72TFLb_Cartaz_Sel, AV67TFLb_ArtCod, AV68TFLb_ArtCod_Sel, AV77TFLb_ColNomC, AV78TFLb_ColNomC_Sel, AV75TFLb_ColNom, AV76TFLb_ColNom_Sel, AV79TFLb_ColNum, AV80TFLb_ColNum_To, AV125TFLb_numero, AV126TFLb_numero_To, AV161TFLb_Tipo, AV162TFLb_Tipo_Sel, AV235TFLb_EstEns_Sels, AV109TFLb_Local, AV110TFLb_Local_Sel, AV91TFLb_FechaE, AV143TFLb_Rb, AV144TFLb_Rb_To, AV133TFLb_obsLb, AV134TFLb_obsLb_Sel, AV239Pgmname, AV40OrderedBy, AV42OrderedDsc, A5555Lb_opcion, A5563Lb_FechaR, A5567Lb_FechaEn, A6461Lb_FecNoa1, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV239Pgmname = "GestionLaboratorio.ConsultaSituacionColeccion_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV239Pgmname", AV239Pgmname);
      Gx_err = (short)(0) ;
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavLb_opcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavLb_opcion_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLb_opcion_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavLb_fechaen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavLb_fechaen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLb_fechaen_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavLb_fechar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavLb_fechar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLb_fechar_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavLb_fecnoa1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavLb_fecnoa1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLb_fecnoa1_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1U80( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e181U82 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV37ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV24DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV5ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_41 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_41"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV28GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV29GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV230Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV230Emprcod") ;
         wcpOAV217CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV217CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV218Lb_ArtCod = httpContext.cgiGet( sPrefix+"wcpOAV218Lb_ArtCod") ;
         wcpOAV228Lb_numero = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV228Lb_numero"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV231Lb_EstEns = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV231Lb_EstEns"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV226Lb_FechaEfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV226Lb_FechaEfrom"), 0) ;
         wcpOAV227Lb_FechaEto = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV227Lb_FechaEto"), 0) ;
         wcpOAV219Lb_Cartaz = httpContext.cgiGet( sPrefix+"wcpOAV219Lb_Cartaz") ;
         wcpOAV220Lb_cartazffrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV220Lb_cartazffrom"), 0) ;
         wcpOAV221Lb_cartazfto = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV221Lb_cartazfto"), 0) ;
         wcpOAV222Lb_ColNom = httpContext.cgiGet( sPrefix+"wcpOAV222Lb_ColNom") ;
         wcpOAV224Lb_ColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV224Lb_ColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV223Lb_ColNomC = httpContext.cgiGet( sPrefix+"wcpOAV223Lb_ColNomC") ;
         wcpOAV233Lb_Tipo = httpContext.cgiGet( sPrefix+"wcpOAV233Lb_Tipo") ;
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
         AV27FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27FilterFullText", AV27FilterFullText);
         AV239Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV239Pgmname", AV239Pgmname);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_lb_fechaeauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_LB_FECHAEAUXDATE");
            GX_FocusControl = edtavDdo_lb_fechaeauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12DDO_Lb_FechaEAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12DDO_Lb_FechaEAuxDate", localUtil.format(AV12DDO_Lb_FechaEAuxDate, "99/99/99"));
         }
         else
         {
            AV12DDO_Lb_FechaEAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_lb_fechaeauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12DDO_Lb_FechaEAuxDate", localUtil.format(AV12DDO_Lb_FechaEAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ConsultaSituacionColeccion_WC");
         AV239Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV239Pgmname", AV239Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV239Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("gestionlaboratorio\\consultasituacioncoleccion_wc:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV27FilterFullText) != 0 )
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
      e181U82 ();
      if (returnInSub) return;
   }

   public void e181U82( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV240Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      consultasituacioncoleccion_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV240Station = GXt_char1 ;
      GXv_char2[0] = AV230Emprcod ;
      GXv_char3[0] = AV241Emprnom ;
      GXv_char4[0] = AV242Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV240Station, GXv_char2, GXv_char3, GXv_char4) ;
      consultasituacioncoleccion_wc_impl.this.AV230Emprcod = GXv_char2[0] ;
      consultasituacioncoleccion_wc_impl.this.AV241Emprnom = GXv_char3[0] ;
      consultasituacioncoleccion_wc_impl.this.AV242Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV230Emprcod", AV230Emprcod);
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
      if ( AV40OrderedBy < 1 )
      {
         AV40OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV24DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV24DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e191U82( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext7[0] = AV216WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV216WWPContext = GXv_SdtWWPContext7[0] ;
      if ( AV38ManageFiltersExecutionStep == 1 )
      {
         AV38ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38ManageFiltersExecutionStep", GXutil.str( AV38ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV38ManageFiltersExecutionStep == 2 )
      {
         AV38ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38ManageFiltersExecutionStep", GXutil.str( AV38ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV44Session.getValue("GestionLaboratorio.ConsultaSituacionColeccion_WCColumnsSelector"), "") != 0 )
      {
         AV7ColumnsSelectorXML = AV44Session.getValue("GestionLaboratorio.ConsultaSituacionColeccion_WCColumnsSelector") ;
         AV5ColumnsSelector.fromxml(AV7ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtCliNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtLb_Cartaz_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_Cartaz_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_Cartaz_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtLb_ArtCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_ArtCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_ArtCod_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtLb_ColNomC_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_ColNomC_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_ColNomC_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtLb_ColNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_ColNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_ColNom_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtLb_ColNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_ColNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_ColNum_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtLb_numero_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_numero_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_numero_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtLb_Tipo_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_Tipo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_Tipo_Visible), 5, 0), !bGXsfl_41_Refreshing);
      cmbLb_EstEns.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbLb_EstEns.getInternalname(), "Visible", GXutil.ltrimstr( cmbLb_EstEns.getVisible(), 5, 0), !bGXsfl_41_Refreshing);
      edtavLb_opcion_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavLb_opcion_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLb_opcion_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtLb_Local_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_Local_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_Local_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtLb_FechaE_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_FechaE_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_FechaE_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavLb_fechaen_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavLb_fechaen_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLb_fechaen_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavLb_fechar_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavLb_fechar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLb_fechar_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavLb_fecnoa1_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavLb_fecnoa1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLb_fecnoa1_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtLb_Rb_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_Rb_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_Rb_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtLb_obsLb_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_obsLb_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_obsLb_Visible), 5, 0), !bGXsfl_41_Refreshing);
      AV28GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28GridCurrentPage), 10, 0));
      AV29GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29GridPageCount), 10, 0));
      cmbavGridactiongroup1.setColumnHeaderClass( "WWActionGroupColumn" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavGridactiongroup1.getInternalname(), "Columnheaderclass", cmbavGridactiongroup1.getColumnHeaderClass(), !bGXsfl_41_Refreshing);
      edtavDetailwebcomponent_Columnheaderclass = "WWIconActionColumn WCD_ActionColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDetailwebcomponent_Internalname, "Columnheaderclass", edtavDetailwebcomponent_Columnheaderclass, !bGXsfl_41_Refreshing);
      edtCliNom_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliNom_Internalname, "Columnheaderclass", edtCliNom_Columnheaderclass, !bGXsfl_41_Refreshing);
      edtLb_Cartaz_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_Cartaz_Internalname, "Columnheaderclass", edtLb_Cartaz_Columnheaderclass, !bGXsfl_41_Refreshing);
      edtLb_ArtCod_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_ArtCod_Internalname, "Columnheaderclass", edtLb_ArtCod_Columnheaderclass, !bGXsfl_41_Refreshing);
      edtLb_ColNomC_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_ColNomC_Internalname, "Columnheaderclass", edtLb_ColNomC_Columnheaderclass, !bGXsfl_41_Refreshing);
      edtLb_ColNom_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_ColNom_Internalname, "Columnheaderclass", edtLb_ColNom_Columnheaderclass, !bGXsfl_41_Refreshing);
      edtLb_ColNum_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_ColNum_Internalname, "Columnheaderclass", edtLb_ColNum_Columnheaderclass, !bGXsfl_41_Refreshing);
      edtLb_numero_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_numero_Internalname, "Columnheaderclass", edtLb_numero_Columnheaderclass, !bGXsfl_41_Refreshing);
      edtLb_Tipo_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_Tipo_Internalname, "Columnheaderclass", edtLb_Tipo_Columnheaderclass, !bGXsfl_41_Refreshing);
      cmbLb_EstEns.setColumnHeaderClass( "WWColumn hidden-xs" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbLb_EstEns.getInternalname(), "Columnheaderclass", cmbLb_EstEns.getColumnHeaderClass(), !bGXsfl_41_Refreshing);
      edtavLb_opcion_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavLb_opcion_Internalname, "Columnheaderclass", edtavLb_opcion_Columnheaderclass, !bGXsfl_41_Refreshing);
      edtLb_Local_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_Local_Internalname, "Columnheaderclass", edtLb_Local_Columnheaderclass, !bGXsfl_41_Refreshing);
      edtLb_FechaE_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_FechaE_Internalname, "Columnheaderclass", edtLb_FechaE_Columnheaderclass, !bGXsfl_41_Refreshing);
      edtavLb_fechaen_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavLb_fechaen_Internalname, "Columnheaderclass", edtavLb_fechaen_Columnheaderclass, !bGXsfl_41_Refreshing);
      edtavLb_fechar_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavLb_fechar_Internalname, "Columnheaderclass", edtavLb_fechar_Columnheaderclass, !bGXsfl_41_Refreshing);
      edtavLb_fecnoa1_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavLb_fecnoa1_Internalname, "Columnheaderclass", edtavLb_fecnoa1_Columnheaderclass, !bGXsfl_41_Refreshing);
      edtLb_Rb_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_Rb_Internalname, "Columnheaderclass", edtLb_Rb_Columnheaderclass, !bGXsfl_41_Refreshing);
      edtLb_obsLb_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_obsLb_Internalname, "Columnheaderclass", edtLb_obsLb_Columnheaderclass, !bGXsfl_41_Refreshing);
      AV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = AV27FilterFullText ;
      AV244Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom = AV47TFCliNom ;
      AV245Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel = AV48TFCliNom_Sel ;
      AV246Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz = AV71TFLb_Cartaz ;
      AV247Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel = AV72TFLb_Cartaz_Sel ;
      AV248Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod = AV67TFLb_ArtCod ;
      AV249Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel = AV68TFLb_ArtCod_Sel ;
      AV250Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc = AV77TFLb_ColNomC ;
      AV251Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel = AV78TFLb_ColNomC_Sel ;
      AV252Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom = AV75TFLb_ColNom ;
      AV253Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel = AV76TFLb_ColNom_Sel ;
      AV254Gestionlaboratorio_consultasituacioncoleccion_wcds_12_tflb_colnum = AV79TFLb_ColNum ;
      AV255Gestionlaboratorio_consultasituacioncoleccion_wcds_13_tflb_colnum_to = AV80TFLb_ColNum_To ;
      AV256Gestionlaboratorio_consultasituacioncoleccion_wcds_14_tflb_numero = AV125TFLb_numero ;
      AV257Gestionlaboratorio_consultasituacioncoleccion_wcds_15_tflb_numero_to = AV126TFLb_numero_To ;
      AV258Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo = AV161TFLb_Tipo ;
      AV259Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel = AV162TFLb_Tipo_Sel ;
      AV260Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels = AV235TFLb_EstEns_Sels ;
      AV261Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local = AV109TFLb_Local ;
      AV262Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel = AV110TFLb_Local_Sel ;
      AV263Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae = AV91TFLb_FechaE ;
      AV264Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb = AV143TFLb_Rb ;
      AV265Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to = AV144TFLb_Rb_To ;
      AV266Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb = AV133TFLb_obsLb ;
      AV267Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel = AV134TFLb_obsLb_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV5ColumnsSelector", AV5ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV37ManageFiltersData", AV37ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV30GridState", AV30GridState);
   }

   public void e121U82( )
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
         AV43PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV43PageToGo) ;
      }
   }

   public void e131U82( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e141U82( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV40OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40OrderedBy), 4, 0));
         AV42OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42OrderedDsc", AV42OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliNom") == 0 )
         {
            AV47TFCliNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFCliNom", AV47TFCliNom);
            AV48TFCliNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFCliNom_Sel", AV48TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_Cartaz") == 0 )
         {
            AV71TFLb_Cartaz = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71TFLb_Cartaz", AV71TFLb_Cartaz);
            AV72TFLb_Cartaz_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72TFLb_Cartaz_Sel", AV72TFLb_Cartaz_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_ArtCod") == 0 )
         {
            AV67TFLb_ArtCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67TFLb_ArtCod", AV67TFLb_ArtCod);
            AV68TFLb_ArtCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TFLb_ArtCod_Sel", AV68TFLb_ArtCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_ColNomC") == 0 )
         {
            AV77TFLb_ColNomC = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77TFLb_ColNomC", AV77TFLb_ColNomC);
            AV78TFLb_ColNomC_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78TFLb_ColNomC_Sel", AV78TFLb_ColNomC_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_ColNom") == 0 )
         {
            AV75TFLb_ColNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75TFLb_ColNom", AV75TFLb_ColNom);
            AV76TFLb_ColNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76TFLb_ColNom_Sel", AV76TFLb_ColNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_ColNum") == 0 )
         {
            AV79TFLb_ColNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV79TFLb_ColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79TFLb_ColNum), 6, 0));
            AV80TFLb_ColNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80TFLb_ColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80TFLb_ColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_numero") == 0 )
         {
            AV125TFLb_numero = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV125TFLb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV125TFLb_numero), 8, 0));
            AV126TFLb_numero_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV126TFLb_numero_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV126TFLb_numero_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_Tipo") == 0 )
         {
            AV161TFLb_Tipo = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV161TFLb_Tipo", AV161TFLb_Tipo);
            AV162TFLb_Tipo_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV162TFLb_Tipo_Sel", AV162TFLb_Tipo_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_EstEns") == 0 )
         {
            AV234TFLb_EstEns_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV234TFLb_EstEns_SelsJson", AV234TFLb_EstEns_SelsJson);
            AV235TFLb_EstEns_Sels.fromJSonString(GXutil.strReplace( AV234TFLb_EstEns_SelsJson, "\"", ""), null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_Local") == 0 )
         {
            AV109TFLb_Local = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV109TFLb_Local", AV109TFLb_Local);
            AV110TFLb_Local_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV110TFLb_Local_Sel", AV110TFLb_Local_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_FechaE") == 0 )
         {
            AV91TFLb_FechaE = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91TFLb_FechaE", localUtil.format(AV91TFLb_FechaE, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_Rb") == 0 )
         {
            AV143TFLb_Rb = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV143TFLb_Rb", GXutil.ltrimstr( AV143TFLb_Rb, 7, 2));
            AV144TFLb_Rb_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV144TFLb_Rb_To", GXutil.ltrimstr( AV144TFLb_Rb_To, 7, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_obsLb") == 0 )
         {
            AV133TFLb_obsLb = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV133TFLb_obsLb", AV133TFLb_obsLb);
            AV134TFLb_obsLb_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV134TFLb_obsLb_Sel", AV134TFLb_obsLb_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV235TFLb_EstEns_Sels", AV235TFLb_EstEns_Sels);
   }

   private void e201U82( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGridactiongroup1.removeAllItems();
      cmbavGridactiongroup1.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGridactiongroup1.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "Observaciones", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      AV232DetailWebComponent = "<i class=\"fas fa-angle-right ArrowIcon\"></i>" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDetailwebcomponent_Internalname, AV232DetailWebComponent);
      AV35Lb_FechaR = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavLb_fechar_Internalname, localUtil.format(AV35Lb_FechaR, "99/99/99"));
      AV229Lb_opcion = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavLb_opcion_Internalname, AV229Lb_opcion);
      /* Using cursor H01U84 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A5563Lb_FechaR = H01U84_A5563Lb_FechaR[0] ;
         A5555Lb_opcion = H01U84_A5555Lb_opcion[0] ;
         if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A5563Lb_FechaR)) )
         {
            AV35Lb_FechaR = A5563Lb_FechaR ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavLb_fechar_Internalname, localUtil.format(AV35Lb_FechaR, "99/99/99"));
            AV229Lb_opcion = A5555Lb_opcion ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavLb_opcion_Internalname, AV229Lb_opcion);
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV34Lb_FechaEn = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavLb_fechaen_Internalname, localUtil.format(AV34Lb_FechaEn, "99/99/99"));
      /* Using cursor H01U85 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A5567Lb_FechaEn = H01U85_A5567Lb_FechaEn[0] ;
         A5555Lb_opcion = H01U85_A5555Lb_opcion[0] ;
         AV34Lb_FechaEn = (!GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A5567Lb_FechaEn)) ? A5567Lb_FechaEn : AV34Lb_FechaEn) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavLb_fechaen_Internalname, localUtil.format(AV34Lb_FechaEn, "99/99/99"));
         pr_default.readNext(3);
      }
      pr_default.close(3);
      AV35Lb_FechaR = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavLb_fechar_Internalname, localUtil.format(AV35Lb_FechaR, "99/99/99"));
      /* Using cursor H01U86 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A5563Lb_FechaR = H01U86_A5563Lb_FechaR[0] ;
         A5555Lb_opcion = H01U86_A5555Lb_opcion[0] ;
         AV35Lb_FechaR = (!GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A5563Lb_FechaR)) ? A5563Lb_FechaR : AV35Lb_FechaR) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavLb_fechar_Internalname, localUtil.format(AV35Lb_FechaR, "99/99/99"));
         pr_default.readNext(4);
      }
      pr_default.close(4);
      AV36Lb_FecNoa1 = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavLb_fecnoa1_Internalname, localUtil.format(AV36Lb_FecNoa1, "99/99/99"));
      /* Using cursor H01U87 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A6461Lb_FecNoa1 = H01U87_A6461Lb_FecNoa1[0] ;
         A5555Lb_opcion = H01U87_A5555Lb_opcion[0] ;
         AV36Lb_FecNoa1 = (!GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A6461Lb_FecNoa1)) ? A6461Lb_FecNoa1 : AV36Lb_FecNoa1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavLb_fecnoa1_Internalname, localUtil.format(AV36Lb_FecNoa1, "99/99/99"));
         pr_default.readNext(5);
      }
      pr_default.close(5);
      if ( GXutil.strcmp(A10883Lb_obsLb, " ") != 0 )
      {
         cmbavGridactiongroup1.setColumnClass( "WWActionGroupColumn WWColumnWarning WWColumnWarningFirstColumn" );
         edtavDetailwebcomponent_Columnclass = "WWIconActionColumn WCD_ActionColumn WWColumnWarning" ;
         edtCliNom_Columnclass = "WWColumn WWColumnWarning hidden-xs" ;
         edtLb_Cartaz_Columnclass = "WWColumn WWColumnWarning hidden-xs" ;
         edtLb_ArtCod_Columnclass = "WWColumn WWColumnWarning" ;
         edtLb_ColNomC_Columnclass = "WWColumn WWColumnWarning hidden-xs" ;
         edtLb_ColNom_Columnclass = "WWColumn WWColumnWarning hidden-xs" ;
         edtLb_ColNum_Columnclass = "WWColumn WWColumnWarning hidden-xs" ;
         edtLb_numero_Columnclass = "WWColumn WWColumnWarning hidden-xs" ;
         edtLb_Tipo_Columnclass = "WWColumn WWColumnWarning" ;
         cmbLb_EstEns.setColumnClass( "WWColumn WWColumnWarning hidden-xs" );
         edtavLb_opcion_Columnclass = "WWColumn WWColumnWarning" ;
         edtLb_Local_Columnclass = "WWColumn WWColumnWarning" ;
         edtLb_FechaE_Columnclass = "WWColumn WWColumnWarning" ;
         edtavLb_fechaen_Columnclass = "WWColumn WWColumnWarning" ;
         edtavLb_fechar_Columnclass = "WWColumn WWColumnWarning" ;
         edtavLb_fecnoa1_Columnclass = "WWColumn WWColumnWarning" ;
         edtLb_Rb_Columnclass = "WWColumn WWColumnWarning hidden-xs" ;
         edtLb_obsLb_Columnclass = "WWColumn WWColumnWarning" ;
      }
      else if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV35Lb_FechaR)) )
      {
         cmbavGridactiongroup1.setColumnClass( "WWActionGroupColumn WWColumnSuccess WWColumnSuccessFirstColumn" );
         edtavDetailwebcomponent_Columnclass = "WWIconActionColumn WCD_ActionColumn WWColumnSuccess" ;
         edtCliNom_Columnclass = "WWColumn WWColumnSuccess hidden-xs" ;
         edtLb_Cartaz_Columnclass = "WWColumn WWColumnSuccess hidden-xs" ;
         edtLb_ArtCod_Columnclass = "WWColumn WWColumnSuccess" ;
         edtLb_ColNomC_Columnclass = "WWColumn WWColumnSuccess hidden-xs" ;
         edtLb_ColNom_Columnclass = "WWColumn WWColumnSuccess hidden-xs" ;
         edtLb_ColNum_Columnclass = "WWColumn WWColumnSuccess hidden-xs" ;
         edtLb_numero_Columnclass = "WWColumn WWColumnSuccess hidden-xs" ;
         edtLb_Tipo_Columnclass = "WWColumn WWColumnSuccess" ;
         cmbLb_EstEns.setColumnClass( "WWColumn WWColumnSuccess hidden-xs" );
         edtavLb_opcion_Columnclass = "WWColumn WWColumnSuccess" ;
         edtLb_Local_Columnclass = "WWColumn WWColumnSuccess" ;
         edtLb_FechaE_Columnclass = "WWColumn WWColumnSuccess" ;
         edtavLb_fechaen_Columnclass = "WWColumn WWColumnSuccess" ;
         edtavLb_fechar_Columnclass = "WWColumn WWColumnSuccess" ;
         edtavLb_fecnoa1_Columnclass = "WWColumn WWColumnSuccess" ;
         edtLb_Rb_Columnclass = "WWColumn WWColumnSuccess hidden-xs" ;
         edtLb_obsLb_Columnclass = "WWColumn WWColumnSuccess" ;
      }
      else if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV35Lb_FechaR)) )
      {
         cmbavGridactiongroup1.setColumnClass( "WWActionGroupColumn WWColumnDanger WWColumnDangerFirstColumn" );
         edtavDetailwebcomponent_Columnclass = "WWIconActionColumn WCD_ActionColumn WWColumnDanger" ;
         edtCliNom_Columnclass = "WWColumn WWColumnDanger hidden-xs" ;
         edtLb_Cartaz_Columnclass = "WWColumn WWColumnDanger hidden-xs" ;
         edtLb_ArtCod_Columnclass = "WWColumn WWColumnDanger" ;
         edtLb_ColNomC_Columnclass = "WWColumn WWColumnDanger hidden-xs" ;
         edtLb_ColNom_Columnclass = "WWColumn WWColumnDanger hidden-xs" ;
         edtLb_ColNum_Columnclass = "WWColumn WWColumnDanger hidden-xs" ;
         edtLb_numero_Columnclass = "WWColumn WWColumnDanger hidden-xs" ;
         edtLb_Tipo_Columnclass = "WWColumn WWColumnDanger" ;
         cmbLb_EstEns.setColumnClass( "WWColumn WWColumnDanger hidden-xs" );
         edtavLb_opcion_Columnclass = "WWColumn WWColumnDanger" ;
         edtLb_Local_Columnclass = "WWColumn WWColumnDanger" ;
         edtLb_FechaE_Columnclass = "WWColumn WWColumnDanger" ;
         edtavLb_fechaen_Columnclass = "WWColumn WWColumnDanger" ;
         edtavLb_fechar_Columnclass = "WWColumn WWColumnDanger" ;
         edtavLb_fecnoa1_Columnclass = "WWColumn WWColumnDanger" ;
         edtLb_Rb_Columnclass = "WWColumn WWColumnDanger hidden-xs" ;
         edtLb_obsLb_Columnclass = "WWColumn WWColumnDanger" ;
      }
      else
      {
         cmbavGridactiongroup1.setColumnClass( httpContext.getMessage( "WWActionGroupColumn", "") );
         edtavDetailwebcomponent_Columnclass = httpContext.getMessage( "WWIconActionColumn WCD_ActionColumn", "") ;
         edtCliNom_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
         edtLb_Cartaz_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
         edtLb_ArtCod_Columnclass = httpContext.getMessage( "WWColumn", "") ;
         edtLb_ColNomC_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
         edtLb_ColNom_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
         edtLb_ColNum_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
         edtLb_numero_Columnclass = ((GXutil.strcmp(A10883Lb_obsLb, " ")!=0) ? "WWColumn hidden-xs WWColumnWarning WWColumnWarningSingleCell" : "WWColumn hidden-xs") ;
         edtLb_Tipo_Columnclass = httpContext.getMessage( "WWColumn", "") ;
         cmbLb_EstEns.setColumnClass( httpContext.getMessage( "WWColumn hidden-xs", "") );
         edtavLb_opcion_Columnclass = httpContext.getMessage( "WWColumn", "") ;
         edtLb_Local_Columnclass = httpContext.getMessage( "WWColumn", "") ;
         edtLb_FechaE_Columnclass = httpContext.getMessage( "WWColumn", "") ;
         edtavLb_fechaen_Columnclass = httpContext.getMessage( "WWColumn", "") ;
         edtavLb_fechar_Columnclass = httpContext.getMessage( "WWColumn", "") ;
         edtavLb_fecnoa1_Columnclass = httpContext.getMessage( "WWColumn", "") ;
         edtLb_Rb_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
         edtLb_obsLb_Columnclass = httpContext.getMessage( "WWColumn", "") ;
      }
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(41) ;
      }
      sendrow_412( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_41_Refreshing )
      {
         httpContext.doAjaxLoad(41, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV236GridActionGroup1, 4, 0)) );
   }

   public void e151U82( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV7ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV5ColumnsSelector.fromJSonString(AV7ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "GestionLaboratorio.ConsultaSituacionColeccion_WCColumnsSelector", ((GXutil.strcmp("", AV7ColumnsSelectorXML)==0) ? "" : AV5ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV5ColumnsSelector", AV5ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV37ManageFiltersData", AV37ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV30GridState", AV30GridState);
   }

   public void e111U82( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("GestionLaboratorio.ConsultaSituacionColeccion_WCFilters")),GXutil.URLEncode(GXutil.rtrim(AV239Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV38ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38ManageFiltersExecutionStep", GXutil.str( AV38ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("GestionLaboratorio.ConsultaSituacionColeccion_WCFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV38ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38ManageFiltersExecutionStep", GXutil.str( AV38ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV39ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "GestionLaboratorio.ConsultaSituacionColeccion_WCFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         consultasituacioncoleccion_wc_impl.this.GXt_char1 = GXv_char4[0] ;
         AV39ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV39ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV239Pgmname+"GridState", AV39ManageFiltersXml) ;
            AV30GridState.fromxml(AV39ManageFiltersXml, null, null);
            AV40OrderedBy = AV30GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40OrderedBy), 4, 0));
            AV42OrderedDsc = AV30GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42OrderedDsc", AV42OrderedDsc);
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
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV30GridState", AV30GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV235TFLb_EstEns_Sels", AV235TFLb_EstEns_Sels);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV5ColumnsSelector", AV5ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV37ManageFiltersData", AV37ManageFiltersData);
   }

   public void e211U82( )
   {
      /* Gridactiongroup1_Click Routine */
      returnInSub = false ;
      if ( AV236GridActionGroup1 == 1 )
      {
         /* Execute user subroutine: 'DO OBSERVACIONES' */
         S192 ();
         if (returnInSub) return;
      }
      AV236GridActionGroup1 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV236GridActionGroup1), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV236GridActionGroup1, 4, 0)) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavGridactiongroup1.getInternalname(), "Values", cmbavGridactiongroup1.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV5ColumnsSelector", AV5ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV37ManageFiltersData", AV37ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV30GridState", AV30GridState);
   }

   public void e161U82( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV26ExcelFilename ;
      GXv_char3[0] = AV25ErrorMessage ;
      new app.gestionlaboratorio.consultasituacioncoleccion_wcexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      consultasituacioncoleccion_wc_impl.this.AV26ExcelFilename = GXv_char4[0] ;
      consultasituacioncoleccion_wc_impl.this.AV25ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV26ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV26ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV25ErrorMessage);
      }
   }

   public void e171U82( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.gestionlaboratorio.consultasituacioncoleccion_wcexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV40OrderedBy, 4, 0))+":"+(AV42OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV5ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CliNom", "", "Cliente", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Lb_Cartaz", "", "Coleccion", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Lb_ArtCod", "", "Articulo", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Lb_ColNomC", "", "Color Cliente", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Lb_ColNom", "", "Color", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Lb_ColNum", "", "Numero", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Lb_numero", "", "Nº de Ensayo", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Lb_Tipo", "", "Tipo", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Lb_EstEns", "", "E", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&Lb_opcion", "", "Opcion", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Lb_Local", "", "Localizacion", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Lb_FechaE", "Fecha", "Entrada", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&Lb_FechaEn", "Fecha", "Envio", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&Lb_FechaR", "Fecha", " Recepcion", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&Lb_FecNoa1", "Fecha", "No aceptacion", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Lb_Rb", "", "Rb", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Lb_obsLb", "", "Obs", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV215UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "GestionLaboratorio.ConsultaSituacionColeccion_WCColumnsSelector", GXv_char4) ;
      consultasituacioncoleccion_wc_impl.this.GXt_char1 = GXv_char4[0] ;
      AV215UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV215UserCustomValue)==0) ) )
      {
         AV6ColumnsSelectorAux.fromxml(AV215UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector8[0] = AV6ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector9[0] = AV5ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, GXv_SdtWWPColumnsSelector9) ;
         AV6ColumnsSelectorAux = GXv_SdtWWPColumnsSelector8[0] ;
         AV5ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = AV37ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "GestionLaboratorio.ConsultaSituacionColeccion_WCFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV37ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV27FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27FilterFullText", AV27FilterFullText);
      AV47TFCliNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFCliNom", AV47TFCliNom);
      AV48TFCliNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFCliNom_Sel", AV48TFCliNom_Sel);
      AV71TFLb_Cartaz = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71TFLb_Cartaz", AV71TFLb_Cartaz);
      AV72TFLb_Cartaz_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72TFLb_Cartaz_Sel", AV72TFLb_Cartaz_Sel);
      AV67TFLb_ArtCod = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67TFLb_ArtCod", AV67TFLb_ArtCod);
      AV68TFLb_ArtCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TFLb_ArtCod_Sel", AV68TFLb_ArtCod_Sel);
      AV77TFLb_ColNomC = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77TFLb_ColNomC", AV77TFLb_ColNomC);
      AV78TFLb_ColNomC_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78TFLb_ColNomC_Sel", AV78TFLb_ColNomC_Sel);
      AV75TFLb_ColNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75TFLb_ColNom", AV75TFLb_ColNom);
      AV76TFLb_ColNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76TFLb_ColNom_Sel", AV76TFLb_ColNom_Sel);
      AV79TFLb_ColNum = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV79TFLb_ColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79TFLb_ColNum), 6, 0));
      AV80TFLb_ColNum_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80TFLb_ColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80TFLb_ColNum_To), 6, 0));
      AV125TFLb_numero = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV125TFLb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV125TFLb_numero), 8, 0));
      AV126TFLb_numero_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV126TFLb_numero_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV126TFLb_numero_To), 8, 0));
      AV161TFLb_Tipo = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV161TFLb_Tipo", AV161TFLb_Tipo);
      AV162TFLb_Tipo_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV162TFLb_Tipo_Sel", AV162TFLb_Tipo_Sel);
      AV235TFLb_EstEns_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "") ;
      AV109TFLb_Local = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV109TFLb_Local", AV109TFLb_Local);
      AV110TFLb_Local_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV110TFLb_Local_Sel", AV110TFLb_Local_Sel);
      AV91TFLb_FechaE = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91TFLb_FechaE", localUtil.format(AV91TFLb_FechaE, "99/99/99"));
      AV143TFLb_Rb = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV143TFLb_Rb", GXutil.ltrimstr( AV143TFLb_Rb, 7, 2));
      AV144TFLb_Rb_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV144TFLb_Rb_To", GXutil.ltrimstr( AV144TFLb_Rb_To, 7, 2));
      AV133TFLb_obsLb = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV133TFLb_obsLb", AV133TFLb_obsLb);
      AV134TFLb_obsLb_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV134TFLb_obsLb_Sel", AV134TFLb_obsLb_Sel);
      Ddo_grid_Selectedvalue_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      Ddo_grid_Filteredtext_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S192( )
   {
      /* 'DO OBSERVACIONES' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.tobslab", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A5532Lb_numero,8,0))}, new String[] {"Mode","EmprCod","Lb_numero"}) , new Object[] {});
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV44Session.getValue(AV239Pgmname+"GridState"), "") == 0 )
      {
         AV30GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV239Pgmname+"GridState"), null, null);
      }
      else
      {
         AV30GridState.fromxml(AV44Session.getValue(AV239Pgmname+"GridState"), null, null);
      }
      AV40OrderedBy = AV30GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40OrderedBy), 4, 0));
      AV42OrderedDsc = AV30GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42OrderedDsc", AV42OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S182 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV30GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV30GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV30GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S182( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV272GXV1 = 1 ;
      while ( AV272GXV1 <= AV30GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV31GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV30GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV272GXV1));
         if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV27FilterFullText = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27FilterFullText", AV27FilterFullText);
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV47TFCliNom = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFCliNom", AV47TFCliNom);
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV48TFCliNom_Sel = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFCliNom_Sel", AV48TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZ") == 0 )
         {
            AV71TFLb_Cartaz = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71TFLb_Cartaz", AV71TFLb_Cartaz);
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZ_SEL") == 0 )
         {
            AV72TFLb_Cartaz_Sel = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72TFLb_Cartaz_Sel", AV72TFLb_Cartaz_Sel);
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTCOD") == 0 )
         {
            AV67TFLb_ArtCod = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67TFLb_ArtCod", AV67TFLb_ArtCod);
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTCOD_SEL") == 0 )
         {
            AV68TFLb_ArtCod_Sel = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TFLb_ArtCod_Sel", AV68TFLb_ArtCod_Sel);
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOMC") == 0 )
         {
            AV77TFLb_ColNomC = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77TFLb_ColNomC", AV77TFLb_ColNomC);
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOMC_SEL") == 0 )
         {
            AV78TFLb_ColNomC_Sel = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78TFLb_ColNomC_Sel", AV78TFLb_ColNomC_Sel);
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOM") == 0 )
         {
            AV75TFLb_ColNom = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75TFLb_ColNom", AV75TFLb_ColNom);
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOM_SEL") == 0 )
         {
            AV76TFLb_ColNom_Sel = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76TFLb_ColNom_Sel", AV76TFLb_ColNom_Sel);
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNUM") == 0 )
         {
            AV79TFLb_ColNum = (int)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV79TFLb_ColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79TFLb_ColNum), 6, 0));
            AV80TFLb_ColNum_To = (int)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80TFLb_ColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80TFLb_ColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_NUMERO") == 0 )
         {
            AV125TFLb_numero = (int)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV125TFLb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV125TFLb_numero), 8, 0));
            AV126TFLb_numero_To = (int)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV126TFLb_numero_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV126TFLb_numero_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_TIPO") == 0 )
         {
            AV161TFLb_Tipo = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV161TFLb_Tipo", AV161TFLb_Tipo);
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_TIPO_SEL") == 0 )
         {
            AV162TFLb_Tipo_Sel = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV162TFLb_Tipo_Sel", AV162TFLb_Tipo_Sel);
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ESTENS_SEL") == 0 )
         {
            AV234TFLb_EstEns_SelsJson = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV234TFLb_EstEns_SelsJson", AV234TFLb_EstEns_SelsJson);
            AV235TFLb_EstEns_Sels.fromJSonString(AV234TFLb_EstEns_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_LOCAL") == 0 )
         {
            AV109TFLb_Local = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV109TFLb_Local", AV109TFLb_Local);
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_LOCAL_SEL") == 0 )
         {
            AV110TFLb_Local_Sel = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV110TFLb_Local_Sel", AV110TFLb_Local_Sel);
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FECHAE") == 0 )
         {
            AV91TFLb_FechaE = localUtil.ctod( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91TFLb_FechaE", localUtil.format(AV91TFLb_FechaE, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_RB") == 0 )
         {
            AV143TFLb_Rb = CommonUtil.decimalVal( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV143TFLb_Rb", GXutil.ltrimstr( AV143TFLb_Rb, 7, 2));
            AV144TFLb_Rb_To = CommonUtil.decimalVal( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV144TFLb_Rb_To", GXutil.ltrimstr( AV144TFLb_Rb_To, 7, 2));
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_OBSLB") == 0 )
         {
            AV133TFLb_obsLb = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV133TFLb_obsLb", AV133TFLb_obsLb);
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_OBSLB_SEL") == 0 )
         {
            AV134TFLb_obsLb_Sel = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV134TFLb_obsLb_Sel", AV134TFLb_obsLb_Sel);
         }
         AV272GXV1 = (int)(AV272GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV48TFCliNom_Sel)==0), AV48TFCliNom_Sel, GXv_char4) ;
      consultasituacioncoleccion_wc_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV72TFLb_Cartaz_Sel)==0), AV72TFLb_Cartaz_Sel, GXv_char3) ;
      consultasituacioncoleccion_wc_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char13 = "" ;
      GXv_char2[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV68TFLb_ArtCod_Sel)==0), AV68TFLb_ArtCod_Sel, GXv_char2) ;
      consultasituacioncoleccion_wc_impl.this.GXt_char13 = GXv_char2[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV78TFLb_ColNomC_Sel)==0), AV78TFLb_ColNomC_Sel, GXv_char15) ;
      consultasituacioncoleccion_wc_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV76TFLb_ColNom_Sel)==0), AV76TFLb_ColNom_Sel, GXv_char17) ;
      consultasituacioncoleccion_wc_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV162TFLb_Tipo_Sel)==0), AV162TFLb_Tipo_Sel, GXv_char19) ;
      consultasituacioncoleccion_wc_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV110TFLb_Local_Sel)==0), AV110TFLb_Local_Sel, GXv_char21) ;
      consultasituacioncoleccion_wc_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV134TFLb_obsLb_Sel)==0), AV134TFLb_obsLb_Sel, GXv_char23) ;
      consultasituacioncoleccion_wc_impl.this.GXt_char22 = GXv_char23[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"|"+GXt_char12+"|"+GXt_char13+"|"+GXt_char14+"|"+GXt_char16+"|||"+GXt_char18+"|"+((AV235TFLb_EstEns_Sels.size()==0) ? "" : AV234TFLb_EstEns_SelsJson)+"||"+GXt_char20+"||||||"+GXt_char22 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV47TFCliNom)==0), AV47TFCliNom, GXv_char23) ;
      consultasituacioncoleccion_wc_impl.this.GXt_char22 = GXv_char23[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV71TFLb_Cartaz)==0), AV71TFLb_Cartaz, GXv_char21) ;
      consultasituacioncoleccion_wc_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV67TFLb_ArtCod)==0), AV67TFLb_ArtCod, GXv_char19) ;
      consultasituacioncoleccion_wc_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV77TFLb_ColNomC)==0), AV77TFLb_ColNomC, GXv_char17) ;
      consultasituacioncoleccion_wc_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV75TFLb_ColNom)==0), AV75TFLb_ColNom, GXv_char15) ;
      consultasituacioncoleccion_wc_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char13 = "" ;
      GXv_char4[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV161TFLb_Tipo)==0), AV161TFLb_Tipo, GXv_char4) ;
      consultasituacioncoleccion_wc_impl.this.GXt_char13 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV109TFLb_Local)==0), AV109TFLb_Local, GXv_char3) ;
      consultasituacioncoleccion_wc_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV133TFLb_obsLb)==0), AV133TFLb_obsLb, GXv_char2) ;
      consultasituacioncoleccion_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = GXt_char22+"|"+GXt_char20+"|"+GXt_char18+"|"+GXt_char16+"|"+GXt_char14+"|"+((0==AV79TFLb_ColNum) ? "" : GXutil.str( AV79TFLb_ColNum, 6, 0))+"|"+((0==AV125TFLb_numero) ? "" : GXutil.str( AV125TFLb_numero, 8, 0))+"|"+GXt_char13+"|||"+GXt_char12+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91TFLb_FechaE)) ? "" : localUtil.dtoc( AV91TFLb_FechaE, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"||||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV143TFLb_Rb)==0) ? "" : GXutil.str( AV143TFLb_Rb, 7, 2))+"|"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "|||||"+((0==AV80TFLb_ColNum_To) ? "" : GXutil.str( AV80TFLb_ColNum_To, 6, 0))+"|"+((0==AV126TFLb_numero_To) ? "" : GXutil.str( AV126TFLb_numero_To, 8, 0))+"|||||||||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV144TFLb_Rb_To)==0) ? "" : GXutil.str( AV144TFLb_Rb_To, 7, 2))+"|" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV30GridState.fromxml(AV44Session.getValue(AV239Pgmname+"GridState"), null, null);
      AV30GridState.setgxTv_SdtWWPGridState_Orderedby( AV40OrderedBy );
      AV30GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV42OrderedDsc );
      AV30GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState24[0] = AV30GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV27FilterFullText)==0), (short)(0), AV27FilterFullText, "") ;
      AV30GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV30GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFCLINOM", "", !(GXutil.strcmp("", AV47TFCliNom)==0), (short)(0), AV47TFCliNom, "", !(GXutil.strcmp("", AV48TFCliNom_Sel)==0), AV48TFCliNom_Sel, "") ;
      AV30GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV30GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFLB_CARTAZ", "", !(GXutil.strcmp("", AV71TFLb_Cartaz)==0), (short)(0), AV71TFLb_Cartaz, "", !(GXutil.strcmp("", AV72TFLb_Cartaz_Sel)==0), AV72TFLb_Cartaz_Sel, "") ;
      AV30GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV30GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFLB_ARTCOD", "", !(GXutil.strcmp("", AV67TFLb_ArtCod)==0), (short)(0), AV67TFLb_ArtCod, "", !(GXutil.strcmp("", AV68TFLb_ArtCod_Sel)==0), AV68TFLb_ArtCod_Sel, "") ;
      AV30GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV30GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFLB_COLNOMC", "", !(GXutil.strcmp("", AV77TFLb_ColNomC)==0), (short)(0), AV77TFLb_ColNomC, "", !(GXutil.strcmp("", AV78TFLb_ColNomC_Sel)==0), AV78TFLb_ColNomC_Sel, "") ;
      AV30GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV30GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFLB_COLNOM", "", !(GXutil.strcmp("", AV75TFLb_ColNom)==0), (short)(0), AV75TFLb_ColNom, "", !(GXutil.strcmp("", AV76TFLb_ColNom_Sel)==0), AV76TFLb_ColNom_Sel, "") ;
      AV30GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV30GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFLB_COLNUM", "", !((0==AV79TFLb_ColNum)&&(0==AV80TFLb_ColNum_To)), (short)(0), GXutil.trim( GXutil.str( AV79TFLb_ColNum, 6, 0)), GXutil.trim( GXutil.str( AV80TFLb_ColNum_To, 6, 0))) ;
      AV30GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV30GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFLB_NUMERO", "", !((0==AV125TFLb_numero)&&(0==AV126TFLb_numero_To)), (short)(0), GXutil.trim( GXutil.str( AV125TFLb_numero, 8, 0)), GXutil.trim( GXutil.str( AV126TFLb_numero_To, 8, 0))) ;
      AV30GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV30GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFLB_TIPO", "", !(GXutil.strcmp("", AV161TFLb_Tipo)==0), (short)(0), AV161TFLb_Tipo, "", !(GXutil.strcmp("", AV162TFLb_Tipo_Sel)==0), AV162TFLb_Tipo_Sel, "") ;
      AV30GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV30GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFLB_ESTENS_SEL", "", !(AV235TFLb_EstEns_Sels.size()==0), (short)(0), AV235TFLb_EstEns_Sels.toJSonString(false), "") ;
      AV30GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV30GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFLB_LOCAL", "", !(GXutil.strcmp("", AV109TFLb_Local)==0), (short)(0), AV109TFLb_Local, "", !(GXutil.strcmp("", AV110TFLb_Local_Sel)==0), AV110TFLb_Local_Sel, "") ;
      AV30GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV30GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFLB_FECHAE", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91TFLb_FechaE)), (short)(0), GXutil.trim( localUtil.dtoc( AV91TFLb_FechaE, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV30GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV30GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFLB_RB", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV143TFLb_Rb)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV144TFLb_Rb_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV143TFLb_Rb, 7, 2)), GXutil.trim( GXutil.str( AV144TFLb_Rb_To, 7, 2))) ;
      AV30GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV30GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFLB_OBSLB", "", !(GXutil.strcmp("", AV133TFLb_obsLb)==0), (short)(0), AV133TFLb_obsLb, "", !(GXutil.strcmp("", AV134TFLb_obsLb_Sel)==0), AV134TFLb_obsLb_Sel, "") ;
      AV30GridState = GXv_SdtWWPGridState24[0] ;
      if ( ! (GXutil.strcmp("", AV230Emprcod)==0) )
      {
         AV31GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV31GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV31GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV230Emprcod );
         AV30GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV31GridStateFilterValue, 0);
      }
      if ( ! (0==AV217CliCod) )
      {
         AV31GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV31GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICOD" );
         AV31GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV217CliCod, 6, 0) );
         AV30GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV31GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV218Lb_ArtCod)==0) )
      {
         AV31GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV31GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&LB_ARTCOD" );
         AV31GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV218Lb_ArtCod );
         AV30GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV31GridStateFilterValue, 0);
      }
      if ( ! (0==AV228Lb_numero) )
      {
         AV31GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV31GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&LB_NUMERO" );
         AV31GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV228Lb_numero, 8, 0) );
         AV30GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV31GridStateFilterValue, 0);
      }
      if ( ! (0==AV231Lb_EstEns) )
      {
         AV31GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV31GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&LB_ESTENS" );
         AV31GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV231Lb_EstEns, 1, 0) );
         AV30GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV31GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV226Lb_FechaEfrom)) )
      {
         AV31GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV31GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&LB_FECHAEFROM" );
         AV31GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV226Lb_FechaEfrom, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV30GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV31GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV227Lb_FechaEto)) )
      {
         AV31GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV31GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&LB_FECHAETO" );
         AV31GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV227Lb_FechaEto, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV30GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV31GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV219Lb_Cartaz)==0) )
      {
         AV31GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV31GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&LB_CARTAZ" );
         AV31GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV219Lb_Cartaz );
         AV30GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV31GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV220Lb_cartazffrom)) )
      {
         AV31GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV31GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&LB_CARTAZFFROM" );
         AV31GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV220Lb_cartazffrom, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV30GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV31GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV221Lb_cartazfto)) )
      {
         AV31GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV31GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&LB_CARTAZFTO" );
         AV31GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV221Lb_cartazfto, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV30GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV31GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV222Lb_ColNom)==0) )
      {
         AV31GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV31GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&LB_COLNOM" );
         AV31GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV222Lb_ColNom );
         AV30GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV31GridStateFilterValue, 0);
      }
      if ( ! (0==AV224Lb_ColNum) )
      {
         AV31GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV31GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&LB_COLNUM" );
         AV31GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV224Lb_ColNum, 6, 0) );
         AV30GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV31GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV223Lb_ColNomC)==0) )
      {
         AV31GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV31GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&LB_COLNOMC" );
         AV31GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV223Lb_ColNomC );
         AV30GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV31GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV233Lb_Tipo)==0) )
      {
         AV31GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV31GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&LB_TIPO" );
         AV31GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV233Lb_Tipo );
         AV30GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV31GridStateFilterValue, 0);
      }
      AV30GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV30GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV239Pgmname+"GridState", AV30GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV213TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV213TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV239Pgmname );
      AV213TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV213TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV32HTTPRequest.getScriptName()+"?"+AV32HTTPRequest.getQuerystring() );
      AV213TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TENS000" );
      AV44Session.setValue("TrnContext", AV213TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_23_1U82( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV37ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_28_1U82( true) ;
      }
      else
      {
         wb_table2_28_1U82( false) ;
      }
      return  ;
   }

   public void wb_table2_28_1U82e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_23_1U82e( true) ;
      }
      else
      {
         wb_table1_23_1U82e( false) ;
      }
   }

   public void wb_table2_28_1U82( boolean wbgen )
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV27FilterFullText, GXutil.rtrim( localUtil.format( AV27FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_GestionLaboratorio\\ConsultaSituacionColeccion_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_28_1U82e( true) ;
      }
      else
      {
         wb_table2_28_1U82e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV230Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV230Emprcod", AV230Emprcod);
      AV217CliCod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV217CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV217CliCod), 6, 0));
      AV218Lb_ArtCod = (String)getParm(obj,2,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV218Lb_ArtCod", AV218Lb_ArtCod);
      AV228Lb_numero = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV228Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV228Lb_numero), 8, 0));
      AV231Lb_EstEns = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV231Lb_EstEns", GXutil.str( AV231Lb_EstEns, 1, 0));
      AV226Lb_FechaEfrom = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV226Lb_FechaEfrom", localUtil.format(AV226Lb_FechaEfrom, "99/99/99"));
      AV227Lb_FechaEto = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV227Lb_FechaEto", localUtil.format(AV227Lb_FechaEto, "99/99/99"));
      AV219Lb_Cartaz = (String)getParm(obj,7,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV219Lb_Cartaz", AV219Lb_Cartaz);
      AV220Lb_cartazffrom = (java.util.Date)getParm(obj,8,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV220Lb_cartazffrom", localUtil.format(AV220Lb_cartazffrom, "99/99/99"));
      AV221Lb_cartazfto = (java.util.Date)getParm(obj,9,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV221Lb_cartazfto", localUtil.format(AV221Lb_cartazfto, "99/99/99"));
      AV222Lb_ColNom = (String)getParm(obj,10,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV222Lb_ColNom", AV222Lb_ColNom);
      AV224Lb_ColNum = ((Number) GXutil.testNumericType( getParm(obj,11,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV224Lb_ColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV224Lb_ColNum), 6, 0));
      AV223Lb_ColNomC = (String)getParm(obj,12,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV223Lb_ColNomC", AV223Lb_ColNomC);
      AV233Lb_Tipo = (String)getParm(obj,13,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV233Lb_Tipo", AV233Lb_Tipo);
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
      pa1U82( ) ;
      ws1U82( ) ;
      we1U82( ) ;
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
      sCtrlAV230Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV217CliCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV218Lb_ArtCod = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV228Lb_numero = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV231Lb_EstEns = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV226Lb_FechaEfrom = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV227Lb_FechaEto = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV219Lb_Cartaz = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV220Lb_cartazffrom = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV221Lb_cartazfto = (String)getParm(obj,9,TypeConstants.STRING) ;
      sCtrlAV222Lb_ColNom = (String)getParm(obj,10,TypeConstants.STRING) ;
      sCtrlAV224Lb_ColNum = (String)getParm(obj,11,TypeConstants.STRING) ;
      sCtrlAV223Lb_ColNomC = (String)getParm(obj,12,TypeConstants.STRING) ;
      sCtrlAV233Lb_Tipo = (String)getParm(obj,13,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1U82( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "gestionlaboratorio\\consultasituacioncoleccion_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1U82( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV230Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV230Emprcod", AV230Emprcod);
         AV217CliCod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV217CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV217CliCod), 6, 0));
         AV218Lb_ArtCod = (String)getParm(obj,4,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV218Lb_ArtCod", AV218Lb_ArtCod);
         AV228Lb_numero = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV228Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV228Lb_numero), 8, 0));
         AV231Lb_EstEns = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV231Lb_EstEns", GXutil.str( AV231Lb_EstEns, 1, 0));
         AV226Lb_FechaEfrom = (java.util.Date)getParm(obj,7,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV226Lb_FechaEfrom", localUtil.format(AV226Lb_FechaEfrom, "99/99/99"));
         AV227Lb_FechaEto = (java.util.Date)getParm(obj,8,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV227Lb_FechaEto", localUtil.format(AV227Lb_FechaEto, "99/99/99"));
         AV219Lb_Cartaz = (String)getParm(obj,9,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV219Lb_Cartaz", AV219Lb_Cartaz);
         AV220Lb_cartazffrom = (java.util.Date)getParm(obj,10,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV220Lb_cartazffrom", localUtil.format(AV220Lb_cartazffrom, "99/99/99"));
         AV221Lb_cartazfto = (java.util.Date)getParm(obj,11,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV221Lb_cartazfto", localUtil.format(AV221Lb_cartazfto, "99/99/99"));
         AV222Lb_ColNom = (String)getParm(obj,12,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV222Lb_ColNom", AV222Lb_ColNom);
         AV224Lb_ColNum = ((Number) GXutil.testNumericType( getParm(obj,13,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV224Lb_ColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV224Lb_ColNum), 6, 0));
         AV223Lb_ColNomC = (String)getParm(obj,14,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV223Lb_ColNomC", AV223Lb_ColNomC);
         AV233Lb_Tipo = (String)getParm(obj,15,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV233Lb_Tipo", AV233Lb_Tipo);
      }
      wcpOAV230Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV230Emprcod") ;
      wcpOAV217CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV217CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV218Lb_ArtCod = httpContext.cgiGet( sPrefix+"wcpOAV218Lb_ArtCod") ;
      wcpOAV228Lb_numero = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV228Lb_numero"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV231Lb_EstEns = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV231Lb_EstEns"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV226Lb_FechaEfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV226Lb_FechaEfrom"), 0) ;
      wcpOAV227Lb_FechaEto = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV227Lb_FechaEto"), 0) ;
      wcpOAV219Lb_Cartaz = httpContext.cgiGet( sPrefix+"wcpOAV219Lb_Cartaz") ;
      wcpOAV220Lb_cartazffrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV220Lb_cartazffrom"), 0) ;
      wcpOAV221Lb_cartazfto = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV221Lb_cartazfto"), 0) ;
      wcpOAV222Lb_ColNom = httpContext.cgiGet( sPrefix+"wcpOAV222Lb_ColNom") ;
      wcpOAV224Lb_ColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV224Lb_ColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV223Lb_ColNomC = httpContext.cgiGet( sPrefix+"wcpOAV223Lb_ColNomC") ;
      wcpOAV233Lb_Tipo = httpContext.cgiGet( sPrefix+"wcpOAV233Lb_Tipo") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV230Emprcod, wcpOAV230Emprcod) != 0 ) || ( AV217CliCod != wcpOAV217CliCod ) || ( GXutil.strcmp(AV218Lb_ArtCod, wcpOAV218Lb_ArtCod) != 0 ) || ( AV228Lb_numero != wcpOAV228Lb_numero ) || ( AV231Lb_EstEns != wcpOAV231Lb_EstEns ) || !( GXutil.dateCompare(GXutil.resetTime(AV226Lb_FechaEfrom), GXutil.resetTime(wcpOAV226Lb_FechaEfrom)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV227Lb_FechaEto), GXutil.resetTime(wcpOAV227Lb_FechaEto)) ) || ( GXutil.strcmp(AV219Lb_Cartaz, wcpOAV219Lb_Cartaz) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(AV220Lb_cartazffrom), GXutil.resetTime(wcpOAV220Lb_cartazffrom)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV221Lb_cartazfto), GXutil.resetTime(wcpOAV221Lb_cartazfto)) ) || ( GXutil.strcmp(AV222Lb_ColNom, wcpOAV222Lb_ColNom) != 0 ) || ( AV224Lb_ColNum != wcpOAV224Lb_ColNum ) || ( GXutil.strcmp(AV223Lb_ColNomC, wcpOAV223Lb_ColNomC) != 0 ) || ( GXutil.strcmp(AV233Lb_Tipo, wcpOAV233Lb_Tipo) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV230Emprcod = AV230Emprcod ;
      wcpOAV217CliCod = AV217CliCod ;
      wcpOAV218Lb_ArtCod = AV218Lb_ArtCod ;
      wcpOAV228Lb_numero = AV228Lb_numero ;
      wcpOAV231Lb_EstEns = AV231Lb_EstEns ;
      wcpOAV226Lb_FechaEfrom = AV226Lb_FechaEfrom ;
      wcpOAV227Lb_FechaEto = AV227Lb_FechaEto ;
      wcpOAV219Lb_Cartaz = AV219Lb_Cartaz ;
      wcpOAV220Lb_cartazffrom = AV220Lb_cartazffrom ;
      wcpOAV221Lb_cartazfto = AV221Lb_cartazfto ;
      wcpOAV222Lb_ColNom = AV222Lb_ColNom ;
      wcpOAV224Lb_ColNum = AV224Lb_ColNum ;
      wcpOAV223Lb_ColNomC = AV223Lb_ColNomC ;
      wcpOAV233Lb_Tipo = AV233Lb_Tipo ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV230Emprcod = httpContext.cgiGet( sPrefix+"AV230Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV230Emprcod) > 0 )
      {
         AV230Emprcod = httpContext.cgiGet( sCtrlAV230Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV230Emprcod", AV230Emprcod);
      }
      else
      {
         AV230Emprcod = httpContext.cgiGet( sPrefix+"AV230Emprcod_PARM") ;
      }
      sCtrlAV217CliCod = httpContext.cgiGet( sPrefix+"AV217CliCod_CTRL") ;
      if ( GXutil.len( sCtrlAV217CliCod) > 0 )
      {
         AV217CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV217CliCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV217CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV217CliCod), 6, 0));
      }
      else
      {
         AV217CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV217CliCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV218Lb_ArtCod = httpContext.cgiGet( sPrefix+"AV218Lb_ArtCod_CTRL") ;
      if ( GXutil.len( sCtrlAV218Lb_ArtCod) > 0 )
      {
         AV218Lb_ArtCod = httpContext.cgiGet( sCtrlAV218Lb_ArtCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV218Lb_ArtCod", AV218Lb_ArtCod);
      }
      else
      {
         AV218Lb_ArtCod = httpContext.cgiGet( sPrefix+"AV218Lb_ArtCod_PARM") ;
      }
      sCtrlAV228Lb_numero = httpContext.cgiGet( sPrefix+"AV228Lb_numero_CTRL") ;
      if ( GXutil.len( sCtrlAV228Lb_numero) > 0 )
      {
         AV228Lb_numero = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV228Lb_numero), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV228Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV228Lb_numero), 8, 0));
      }
      else
      {
         AV228Lb_numero = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV228Lb_numero_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV231Lb_EstEns = httpContext.cgiGet( sPrefix+"AV231Lb_EstEns_CTRL") ;
      if ( GXutil.len( sCtrlAV231Lb_EstEns) > 0 )
      {
         AV231Lb_EstEns = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV231Lb_EstEns), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV231Lb_EstEns", GXutil.str( AV231Lb_EstEns, 1, 0));
      }
      else
      {
         AV231Lb_EstEns = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV231Lb_EstEns_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV226Lb_FechaEfrom = httpContext.cgiGet( sPrefix+"AV226Lb_FechaEfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV226Lb_FechaEfrom) > 0 )
      {
         AV226Lb_FechaEfrom = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV226Lb_FechaEfrom), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV226Lb_FechaEfrom", localUtil.format(AV226Lb_FechaEfrom, "99/99/99"));
      }
      else
      {
         AV226Lb_FechaEfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV226Lb_FechaEfrom_PARM"), 0) ;
      }
      sCtrlAV227Lb_FechaEto = httpContext.cgiGet( sPrefix+"AV227Lb_FechaEto_CTRL") ;
      if ( GXutil.len( sCtrlAV227Lb_FechaEto) > 0 )
      {
         AV227Lb_FechaEto = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV227Lb_FechaEto), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV227Lb_FechaEto", localUtil.format(AV227Lb_FechaEto, "99/99/99"));
      }
      else
      {
         AV227Lb_FechaEto = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV227Lb_FechaEto_PARM"), 0) ;
      }
      sCtrlAV219Lb_Cartaz = httpContext.cgiGet( sPrefix+"AV219Lb_Cartaz_CTRL") ;
      if ( GXutil.len( sCtrlAV219Lb_Cartaz) > 0 )
      {
         AV219Lb_Cartaz = httpContext.cgiGet( sCtrlAV219Lb_Cartaz) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV219Lb_Cartaz", AV219Lb_Cartaz);
      }
      else
      {
         AV219Lb_Cartaz = httpContext.cgiGet( sPrefix+"AV219Lb_Cartaz_PARM") ;
      }
      sCtrlAV220Lb_cartazffrom = httpContext.cgiGet( sPrefix+"AV220Lb_cartazffrom_CTRL") ;
      if ( GXutil.len( sCtrlAV220Lb_cartazffrom) > 0 )
      {
         AV220Lb_cartazffrom = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV220Lb_cartazffrom), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV220Lb_cartazffrom", localUtil.format(AV220Lb_cartazffrom, "99/99/99"));
      }
      else
      {
         AV220Lb_cartazffrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV220Lb_cartazffrom_PARM"), 0) ;
      }
      sCtrlAV221Lb_cartazfto = httpContext.cgiGet( sPrefix+"AV221Lb_cartazfto_CTRL") ;
      if ( GXutil.len( sCtrlAV221Lb_cartazfto) > 0 )
      {
         AV221Lb_cartazfto = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV221Lb_cartazfto), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV221Lb_cartazfto", localUtil.format(AV221Lb_cartazfto, "99/99/99"));
      }
      else
      {
         AV221Lb_cartazfto = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV221Lb_cartazfto_PARM"), 0) ;
      }
      sCtrlAV222Lb_ColNom = httpContext.cgiGet( sPrefix+"AV222Lb_ColNom_CTRL") ;
      if ( GXutil.len( sCtrlAV222Lb_ColNom) > 0 )
      {
         AV222Lb_ColNom = httpContext.cgiGet( sCtrlAV222Lb_ColNom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV222Lb_ColNom", AV222Lb_ColNom);
      }
      else
      {
         AV222Lb_ColNom = httpContext.cgiGet( sPrefix+"AV222Lb_ColNom_PARM") ;
      }
      sCtrlAV224Lb_ColNum = httpContext.cgiGet( sPrefix+"AV224Lb_ColNum_CTRL") ;
      if ( GXutil.len( sCtrlAV224Lb_ColNum) > 0 )
      {
         AV224Lb_ColNum = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV224Lb_ColNum), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV224Lb_ColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV224Lb_ColNum), 6, 0));
      }
      else
      {
         AV224Lb_ColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV224Lb_ColNum_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV223Lb_ColNomC = httpContext.cgiGet( sPrefix+"AV223Lb_ColNomC_CTRL") ;
      if ( GXutil.len( sCtrlAV223Lb_ColNomC) > 0 )
      {
         AV223Lb_ColNomC = httpContext.cgiGet( sCtrlAV223Lb_ColNomC) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV223Lb_ColNomC", AV223Lb_ColNomC);
      }
      else
      {
         AV223Lb_ColNomC = httpContext.cgiGet( sPrefix+"AV223Lb_ColNomC_PARM") ;
      }
      sCtrlAV233Lb_Tipo = httpContext.cgiGet( sPrefix+"AV233Lb_Tipo_CTRL") ;
      if ( GXutil.len( sCtrlAV233Lb_Tipo) > 0 )
      {
         AV233Lb_Tipo = httpContext.cgiGet( sCtrlAV233Lb_Tipo) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV233Lb_Tipo", AV233Lb_Tipo);
      }
      else
      {
         AV233Lb_Tipo = httpContext.cgiGet( sPrefix+"AV233Lb_Tipo_PARM") ;
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
      pa1U82( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1U82( ) ;
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
      ws1U82( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV230Emprcod_PARM", GXutil.rtrim( AV230Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV230Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV230Emprcod_CTRL", GXutil.rtrim( sCtrlAV230Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV217CliCod_PARM", GXutil.ltrim( localUtil.ntoc( AV217CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV217CliCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV217CliCod_CTRL", GXutil.rtrim( sCtrlAV217CliCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV218Lb_ArtCod_PARM", GXutil.rtrim( AV218Lb_ArtCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV218Lb_ArtCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV218Lb_ArtCod_CTRL", GXutil.rtrim( sCtrlAV218Lb_ArtCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV228Lb_numero_PARM", GXutil.ltrim( localUtil.ntoc( AV228Lb_numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV228Lb_numero)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV228Lb_numero_CTRL", GXutil.rtrim( sCtrlAV228Lb_numero));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV231Lb_EstEns_PARM", GXutil.ltrim( localUtil.ntoc( AV231Lb_EstEns, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV231Lb_EstEns)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV231Lb_EstEns_CTRL", GXutil.rtrim( sCtrlAV231Lb_EstEns));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV226Lb_FechaEfrom_PARM", localUtil.dtoc( AV226Lb_FechaEfrom, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV226Lb_FechaEfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV226Lb_FechaEfrom_CTRL", GXutil.rtrim( sCtrlAV226Lb_FechaEfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV227Lb_FechaEto_PARM", localUtil.dtoc( AV227Lb_FechaEto, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV227Lb_FechaEto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV227Lb_FechaEto_CTRL", GXutil.rtrim( sCtrlAV227Lb_FechaEto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV219Lb_Cartaz_PARM", GXutil.rtrim( AV219Lb_Cartaz));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV219Lb_Cartaz)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV219Lb_Cartaz_CTRL", GXutil.rtrim( sCtrlAV219Lb_Cartaz));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV220Lb_cartazffrom_PARM", localUtil.dtoc( AV220Lb_cartazffrom, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV220Lb_cartazffrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV220Lb_cartazffrom_CTRL", GXutil.rtrim( sCtrlAV220Lb_cartazffrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV221Lb_cartazfto_PARM", localUtil.dtoc( AV221Lb_cartazfto, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV221Lb_cartazfto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV221Lb_cartazfto_CTRL", GXutil.rtrim( sCtrlAV221Lb_cartazfto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV222Lb_ColNom_PARM", GXutil.rtrim( AV222Lb_ColNom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV222Lb_ColNom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV222Lb_ColNom_CTRL", GXutil.rtrim( sCtrlAV222Lb_ColNom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV224Lb_ColNum_PARM", GXutil.ltrim( localUtil.ntoc( AV224Lb_ColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV224Lb_ColNum)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV224Lb_ColNum_CTRL", GXutil.rtrim( sCtrlAV224Lb_ColNum));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV223Lb_ColNomC_PARM", GXutil.rtrim( AV223Lb_ColNomC));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV223Lb_ColNomC)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV223Lb_ColNomC_CTRL", GXutil.rtrim( sCtrlAV223Lb_ColNomC));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV233Lb_Tipo_PARM", GXutil.rtrim( AV233Lb_Tipo));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV233Lb_Tipo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV233Lb_Tipo_CTRL", GXutil.rtrim( sCtrlAV233Lb_Tipo));
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
      we1U82( ) ;
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
   }

   public void componentthemes( )
   {
      define_styles( ) ;
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("DVelop/DVPaginationBar/DVPaginationBar.css", "");
      httpContext.AddStyleSheetFile("calendar-system.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      if ( ! ( WebComp_Grid_dwc == null ) )
      {
         if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
         {
            WebComp_Grid_dwc.componentthemes();
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211662610", true, true);
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
      httpContext.AddJavascriptSource("gestionlaboratorio/consultasituacioncoleccion_wc.js", "?20268211662610", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_412( )
   {
      cmbavGridactiongroup1.setInternalname( sPrefix+"vGRIDACTIONGROUP1_"+sGXsfl_41_idx );
      edtavDetailwebcomponent_Internalname = sPrefix+"vDETAILWEBCOMPONENT_"+sGXsfl_41_idx ;
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_41_idx ;
      edtLb_Cartaz_Internalname = sPrefix+"LB_CARTAZ_"+sGXsfl_41_idx ;
      edtLb_ArtCod_Internalname = sPrefix+"LB_ARTCOD_"+sGXsfl_41_idx ;
      edtLb_ColNomC_Internalname = sPrefix+"LB_COLNOMC_"+sGXsfl_41_idx ;
      edtLb_ColNom_Internalname = sPrefix+"LB_COLNOM_"+sGXsfl_41_idx ;
      edtLb_ColNum_Internalname = sPrefix+"LB_COLNUM_"+sGXsfl_41_idx ;
      edtLb_numero_Internalname = sPrefix+"LB_NUMERO_"+sGXsfl_41_idx ;
      edtLb_Tipo_Internalname = sPrefix+"LB_TIPO_"+sGXsfl_41_idx ;
      cmbLb_EstEns.setInternalname( sPrefix+"LB_ESTENS_"+sGXsfl_41_idx );
      edtavLb_opcion_Internalname = sPrefix+"vLB_OPCION_"+sGXsfl_41_idx ;
      edtLb_Local_Internalname = sPrefix+"LB_LOCAL_"+sGXsfl_41_idx ;
      edtLb_FechaE_Internalname = sPrefix+"LB_FECHAE_"+sGXsfl_41_idx ;
      edtavLb_fechaen_Internalname = sPrefix+"vLB_FECHAEN_"+sGXsfl_41_idx ;
      edtavLb_fechar_Internalname = sPrefix+"vLB_FECHAR_"+sGXsfl_41_idx ;
      edtavLb_fecnoa1_Internalname = sPrefix+"vLB_FECNOA1_"+sGXsfl_41_idx ;
      edtEmprCod_Internalname = sPrefix+"EMPRCOD_"+sGXsfl_41_idx ;
      edtLb_Rb_Internalname = sPrefix+"LB_RB_"+sGXsfl_41_idx ;
      edtLb_obsLb_Internalname = sPrefix+"LB_OBSLB_"+sGXsfl_41_idx ;
   }

   public void subsflControlProps_fel_412( )
   {
      cmbavGridactiongroup1.setInternalname( sPrefix+"vGRIDACTIONGROUP1_"+sGXsfl_41_fel_idx );
      edtavDetailwebcomponent_Internalname = sPrefix+"vDETAILWEBCOMPONENT_"+sGXsfl_41_fel_idx ;
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_41_fel_idx ;
      edtLb_Cartaz_Internalname = sPrefix+"LB_CARTAZ_"+sGXsfl_41_fel_idx ;
      edtLb_ArtCod_Internalname = sPrefix+"LB_ARTCOD_"+sGXsfl_41_fel_idx ;
      edtLb_ColNomC_Internalname = sPrefix+"LB_COLNOMC_"+sGXsfl_41_fel_idx ;
      edtLb_ColNom_Internalname = sPrefix+"LB_COLNOM_"+sGXsfl_41_fel_idx ;
      edtLb_ColNum_Internalname = sPrefix+"LB_COLNUM_"+sGXsfl_41_fel_idx ;
      edtLb_numero_Internalname = sPrefix+"LB_NUMERO_"+sGXsfl_41_fel_idx ;
      edtLb_Tipo_Internalname = sPrefix+"LB_TIPO_"+sGXsfl_41_fel_idx ;
      cmbLb_EstEns.setInternalname( sPrefix+"LB_ESTENS_"+sGXsfl_41_fel_idx );
      edtavLb_opcion_Internalname = sPrefix+"vLB_OPCION_"+sGXsfl_41_fel_idx ;
      edtLb_Local_Internalname = sPrefix+"LB_LOCAL_"+sGXsfl_41_fel_idx ;
      edtLb_FechaE_Internalname = sPrefix+"LB_FECHAE_"+sGXsfl_41_fel_idx ;
      edtavLb_fechaen_Internalname = sPrefix+"vLB_FECHAEN_"+sGXsfl_41_fel_idx ;
      edtavLb_fechar_Internalname = sPrefix+"vLB_FECHAR_"+sGXsfl_41_fel_idx ;
      edtavLb_fecnoa1_Internalname = sPrefix+"vLB_FECNOA1_"+sGXsfl_41_fel_idx ;
      edtEmprCod_Internalname = sPrefix+"EMPRCOD_"+sGXsfl_41_fel_idx ;
      edtLb_Rb_Internalname = sPrefix+"LB_RB_"+sGXsfl_41_fel_idx ;
      edtLb_obsLb_Internalname = sPrefix+"LB_OBSLB_"+sGXsfl_41_fel_idx ;
   }

   public void sendrow_412( )
   {
      subsflControlProps_412( ) ;
      wb1U80( ) ;
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
         TempTags = " " + ((cmbavGridactiongroup1.getEnabled()!=0)&&(cmbavGridactiongroup1.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 42,'"+sPrefix+"',false,'"+sGXsfl_41_idx+"',41)\"" : " ") ;
         if ( ( cmbavGridactiongroup1.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONGROUP1_" + sGXsfl_41_idx ;
            cmbavGridactiongroup1.setName( GXCCtl );
            cmbavGridactiongroup1.setWebtags( "" );
            if ( cmbavGridactiongroup1.getItemCount() > 0 )
            {
               AV236GridActionGroup1 = (short)(GXutil.lval( cmbavGridactiongroup1.getValidValue(GXutil.trim( GXutil.str( AV236GridActionGroup1, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV236GridActionGroup1), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactiongroup1,cmbavGridactiongroup1.getInternalname(),GXutil.trim( GXutil.str( AV236GridActionGroup1, 4, 0)),Integer.valueOf(1),cmbavGridactiongroup1.getJsonclick(),Integer.valueOf(5),"'"+sPrefix+"'"+",false,"+"'"+sPrefix+"EVGRIDACTIONGROUP1.CLICK."+sGXsfl_41_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO",cmbavGridactiongroup1.getColumnClass(),cmbavGridactiongroup1.getColumnHeaderClass(),TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactiongroup1.getEnabled()!=0)&&(cmbavGridactiongroup1.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,42);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV236GridActionGroup1, 4, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavGridactiongroup1.getInternalname(), "Values", cmbavGridactiongroup1.ToJavascriptSource(), !bGXsfl_41_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 43,'"+sPrefix+"',false,'"+sGXsfl_41_idx+"',41)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDetailwebcomponent_Internalname,GXutil.rtrim( AV232DetailWebComponent),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,43);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+"e221u82_client"+"'","","","","",edtavDetailwebcomponent_Jsonclick,Integer.valueOf(7),"Attribute","",ROClassString,edtavDetailwebcomponent_Columnclass,edtavDetailwebcomponent_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavDetailwebcomponent_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtCliNom_Columnclass,edtCliNom_Columnheaderclass,Integer.valueOf(edtCliNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtLb_Cartaz_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_Cartaz_Internalname,GXutil.rtrim( A5540Lb_Cartaz),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_Cartaz_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtLb_Cartaz_Columnclass,edtLb_Cartaz_Columnheaderclass,Integer.valueOf(edtLb_Cartaz_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtLb_ArtCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_ArtCod_Internalname,GXutil.rtrim( A5533Lb_ArtCod),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_ArtCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtLb_ArtCod_Columnclass,edtLb_ArtCod_Columnheaderclass,Integer.valueOf(edtLb_ArtCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtLb_ColNomC_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_ColNomC_Internalname,GXutil.rtrim( A5538Lb_ColNomC),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_ColNomC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtLb_ColNomC_Columnclass,edtLb_ColNomC_Columnheaderclass,Integer.valueOf(edtLb_ColNomC_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtLb_ColNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_ColNom_Internalname,GXutil.rtrim( A5536Lb_ColNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_ColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtLb_ColNom_Columnclass,edtLb_ColNom_Columnheaderclass,Integer.valueOf(edtLb_ColNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtLb_ColNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_ColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A5537Lb_ColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5537Lb_ColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_ColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtLb_ColNum_Columnclass,edtLb_ColNum_Columnheaderclass,Integer.valueOf(edtLb_ColNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtLb_numero_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_numero_Internalname,GXutil.ltrim( localUtil.ntoc( A5532Lb_numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5532Lb_numero), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_numero_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtLb_numero_Columnclass,edtLb_numero_Columnheaderclass,Integer.valueOf(edtLb_numero_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtLb_Tipo_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_Tipo_Internalname,GXutil.rtrim( A5570Lb_Tipo),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_Tipo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtLb_Tipo_Columnclass,edtLb_Tipo_Columnheaderclass,Integer.valueOf(edtLb_Tipo_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((cmbLb_EstEns.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbLb_EstEns.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "LB_ESTENS_" + sGXsfl_41_idx ;
            cmbLb_EstEns.setName( GXCCtl );
            cmbLb_EstEns.setWebtags( "" );
            cmbLb_EstEns.addItem("0", httpContext.getMessage( "Pdte. Act. Prod.", ""), (short)(0));
            cmbLb_EstEns.addItem("1", httpContext.getMessage( "Act. Prod.", ""), (short)(0));
            cmbLb_EstEns.addItem("2", httpContext.getMessage( "Cerrado", ""), (short)(0));
            if ( cmbLb_EstEns.getItemCount() > 0 )
            {
               A5569Lb_EstEns = (byte)(GXutil.lval( cmbLb_EstEns.getValidValue(GXutil.trim( GXutil.str( A5569Lb_EstEns, 1, 0))))) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbLb_EstEns,cmbLb_EstEns.getInternalname(),GXutil.trim( GXutil.str( A5569Lb_EstEns, 1, 0)),Integer.valueOf(1),cmbLb_EstEns.getJsonclick(),Integer.valueOf(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(cmbLb_EstEns.getVisible()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute",cmbLb_EstEns.getColumnClass(),cmbLb_EstEns.getColumnHeaderClass(),"","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbLb_EstEns.setValue( GXutil.trim( GXutil.str( A5569Lb_EstEns, 1, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbLb_EstEns.getInternalname(), "Values", cmbLb_EstEns.ToJavascriptSource(), !bGXsfl_41_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavLb_opcion_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavLb_opcion_Enabled!=0)&&(edtavLb_opcion_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 53,'"+sPrefix+"',false,'"+sGXsfl_41_idx+"',41)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLb_opcion_Internalname,GXutil.rtrim( AV229Lb_opcion),GXutil.rtrim( localUtil.format( AV229Lb_opcion, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+((edtavLb_opcion_Enabled!=0)&&(edtavLb_opcion_Visible!=0) ? " onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,53);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavLb_opcion_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavLb_opcion_Columnclass,edtavLb_opcion_Columnheaderclass,Integer.valueOf(edtavLb_opcion_Visible),Integer.valueOf(edtavLb_opcion_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtLb_Local_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_Local_Internalname,GXutil.rtrim( A5701Lb_Local),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_Local_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtLb_Local_Columnclass,edtLb_Local_Columnheaderclass,Integer.valueOf(edtLb_Local_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtLb_FechaE_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_FechaE_Internalname,localUtil.format(A5541Lb_FechaE, "99/99/99"),localUtil.format( A5541Lb_FechaE, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_FechaE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtLb_FechaE_Columnclass,edtLb_FechaE_Columnheaderclass,Integer.valueOf(edtLb_FechaE_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavLb_fechaen_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavLb_fechaen_Enabled!=0)&&(edtavLb_fechaen_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 56,'"+sPrefix+"',false,'"+sGXsfl_41_idx+"',41)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLb_fechaen_Internalname,localUtil.format(AV34Lb_FechaEn, "99/99/99"),localUtil.format( AV34Lb_FechaEn, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+((edtavLb_fechaen_Enabled!=0)&&(edtavLb_fechaen_Visible!=0) ? " onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,56);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavLb_fechaen_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavLb_fechaen_Columnclass,edtavLb_fechaen_Columnheaderclass,Integer.valueOf(edtavLb_fechaen_Visible),Integer.valueOf(edtavLb_fechaen_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavLb_fechar_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavLb_fechar_Enabled!=0)&&(edtavLb_fechar_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 57,'"+sPrefix+"',false,'"+sGXsfl_41_idx+"',41)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLb_fechar_Internalname,localUtil.format(AV35Lb_FechaR, "99/99/99"),localUtil.format( AV35Lb_FechaR, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+((edtavLb_fechar_Enabled!=0)&&(edtavLb_fechar_Visible!=0) ? " onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,57);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavLb_fechar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavLb_fechar_Columnclass,edtavLb_fechar_Columnheaderclass,Integer.valueOf(edtavLb_fechar_Visible),Integer.valueOf(edtavLb_fechar_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavLb_fecnoa1_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavLb_fecnoa1_Enabled!=0)&&(edtavLb_fecnoa1_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 58,'"+sPrefix+"',false,'"+sGXsfl_41_idx+"',41)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLb_fecnoa1_Internalname,localUtil.format(AV36Lb_FecNoa1, "99/99/99"),localUtil.format( AV36Lb_FecNoa1, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+((edtavLb_fecnoa1_Enabled!=0)&&(edtavLb_fecnoa1_Visible!=0) ? " onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,58);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavLb_fecnoa1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavLb_fecnoa1_Columnclass,edtavLb_fecnoa1_Columnheaderclass,Integer.valueOf(edtavLb_fecnoa1_Visible),Integer.valueOf(edtavLb_fecnoa1_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtLb_Rb_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_Rb_Internalname,GXutil.ltrim( localUtil.ntoc( A5547Lb_Rb, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A5547Lb_Rb, "ZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_Rb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtLb_Rb_Columnclass,edtLb_Rb_Columnheaderclass,Integer.valueOf(edtLb_Rb_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtLb_obsLb_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_obsLb_Internalname,A10883Lb_obsLb,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_obsLb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtLb_obsLb_Columnclass,edtLb_obsLb_Columnheaderclass,Integer.valueOf(edtLb_obsLb_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(300),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes1U82( ) ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_Cartaz_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coleccion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_ArtCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_ColNomC_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_ColNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_ColNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_numero_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº de Ensayo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_Tipo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbLb_EstEns.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "E", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavLb_opcion_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Opcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_Local_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Localizacion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_FechaE_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Entrada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavLb_fechaen_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Envio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavLb_fechar_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( " Recepcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavLb_fecnoa1_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "No aceptacion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_Rb_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Rb", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_obsLb_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Obs", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV236GridActionGroup1, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( cmbavGridactiongroup1.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( cmbavGridactiongroup1.getColumnHeaderClass()));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV232DetailWebComponent));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavDetailwebcomponent_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavDetailwebcomponent_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDetailwebcomponent_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A279CliNom));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtCliNom_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtCliNom_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCliNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5540Lb_Cartaz));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtLb_Cartaz_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtLb_Cartaz_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_Cartaz_Visible, (byte)(5), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5536Lb_ColNom));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtLb_ColNom_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtLb_ColNom_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_ColNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5537Lb_ColNum, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtLb_ColNum_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtLb_ColNum_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_ColNum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5532Lb_numero, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtLb_numero_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtLb_numero_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_numero_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5570Lb_Tipo));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtLb_Tipo_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtLb_Tipo_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_Tipo_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5569Lb_EstEns, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( cmbLb_EstEns.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( cmbLb_EstEns.getColumnHeaderClass()));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbLb_EstEns.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV229Lb_opcion));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavLb_opcion_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavLb_opcion_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLb_opcion_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavLb_opcion_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5701Lb_Local));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtLb_Local_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtLb_Local_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_Local_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A5541Lb_FechaE, "99/99/99"));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtLb_FechaE_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtLb_FechaE_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_FechaE_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(AV34Lb_FechaEn, "99/99/99"));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavLb_fechaen_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavLb_fechaen_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLb_fechaen_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavLb_fechaen_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(AV35Lb_FechaR, "99/99/99"));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavLb_fechar_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavLb_fechar_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLb_fechar_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavLb_fechar_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(AV36Lb_FecNoa1, "99/99/99"));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavLb_fecnoa1_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavLb_fecnoa1_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLb_fecnoa1_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavLb_fecnoa1_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5547Lb_Rb, (byte)(7), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtLb_Rb_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtLb_Rb_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_Rb_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A10883Lb_obsLb);
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtLb_obsLb_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtLb_obsLb_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_obsLb_Visible, (byte)(5), (byte)(0), ".", "")));
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
      cmbavGridactiongroup1.setInternalname( sPrefix+"vGRIDACTIONGROUP1" );
      edtavDetailwebcomponent_Internalname = sPrefix+"vDETAILWEBCOMPONENT" ;
      edtCliNom_Internalname = sPrefix+"CLINOM" ;
      edtLb_Cartaz_Internalname = sPrefix+"LB_CARTAZ" ;
      edtLb_ArtCod_Internalname = sPrefix+"LB_ARTCOD" ;
      edtLb_ColNomC_Internalname = sPrefix+"LB_COLNOMC" ;
      edtLb_ColNom_Internalname = sPrefix+"LB_COLNOM" ;
      edtLb_ColNum_Internalname = sPrefix+"LB_COLNUM" ;
      edtLb_numero_Internalname = sPrefix+"LB_NUMERO" ;
      edtLb_Tipo_Internalname = sPrefix+"LB_TIPO" ;
      cmbLb_EstEns.setInternalname( sPrefix+"LB_ESTENS" );
      edtavLb_opcion_Internalname = sPrefix+"vLB_OPCION" ;
      edtLb_Local_Internalname = sPrefix+"LB_LOCAL" ;
      edtLb_FechaE_Internalname = sPrefix+"LB_FECHAE" ;
      edtavLb_fechaen_Internalname = sPrefix+"vLB_FECHAEN" ;
      edtavLb_fechar_Internalname = sPrefix+"vLB_FECHAR" ;
      edtavLb_fecnoa1_Internalname = sPrefix+"vLB_FECNOA1" ;
      edtEmprCod_Internalname = sPrefix+"EMPRCOD" ;
      edtLb_Rb_Internalname = sPrefix+"LB_RB" ;
      edtLb_obsLb_Internalname = sPrefix+"LB_OBSLB" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divCell_grid_dwc_Internalname = sPrefix+"CELL_GRID_DWC" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      Grid_titlescategories_Internalname = sPrefix+"GRID_TITLESCATEGORIES" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
      edtavDdo_lb_fechaeauxdate_Internalname = sPrefix+"vDDO_LB_FECHAEAUXDATE" ;
      divDdo_lb_fechaeauxdates_Internalname = sPrefix+"DDO_LB_FECHAEAUXDATES" ;
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
      edtLb_obsLb_Jsonclick = "" ;
      edtLb_obsLb_Columnclass = "WWColumn" ;
      edtLb_Rb_Jsonclick = "" ;
      edtLb_Rb_Columnclass = "WWColumn hidden-xs" ;
      edtEmprCod_Jsonclick = "" ;
      edtavLb_fecnoa1_Jsonclick = "" ;
      edtavLb_fecnoa1_Columnclass = "WWColumn" ;
      edtavLb_fecnoa1_Enabled = 1 ;
      edtavLb_fechar_Jsonclick = "" ;
      edtavLb_fechar_Columnclass = "WWColumn" ;
      edtavLb_fechar_Enabled = 1 ;
      edtavLb_fechaen_Jsonclick = "" ;
      edtavLb_fechaen_Columnclass = "WWColumn" ;
      edtavLb_fechaen_Enabled = 1 ;
      edtLb_FechaE_Jsonclick = "" ;
      edtLb_FechaE_Columnclass = "WWColumn" ;
      edtLb_Local_Jsonclick = "" ;
      edtLb_Local_Columnclass = "WWColumn" ;
      edtavLb_opcion_Jsonclick = "" ;
      edtavLb_opcion_Columnclass = "WWColumn" ;
      edtavLb_opcion_Enabled = 1 ;
      cmbLb_EstEns.setJsonclick( "" );
      cmbLb_EstEns.setColumnClass( "WWColumn hidden-xs" );
      edtLb_Tipo_Jsonclick = "" ;
      edtLb_Tipo_Columnclass = "WWColumn" ;
      edtLb_numero_Jsonclick = "" ;
      edtLb_numero_Columnclass = "WWColumn hidden-xs" ;
      edtLb_ColNum_Jsonclick = "" ;
      edtLb_ColNum_Columnclass = "WWColumn hidden-xs" ;
      edtLb_ColNom_Jsonclick = "" ;
      edtLb_ColNom_Columnclass = "WWColumn hidden-xs" ;
      edtLb_ColNomC_Jsonclick = "" ;
      edtLb_ColNomC_Columnclass = "WWColumn hidden-xs" ;
      edtLb_ArtCod_Jsonclick = "" ;
      edtLb_ArtCod_Columnclass = "WWColumn" ;
      edtLb_Cartaz_Jsonclick = "" ;
      edtLb_Cartaz_Columnclass = "WWColumn hidden-xs" ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Columnclass = "WWColumn hidden-xs" ;
      edtavDetailwebcomponent_Jsonclick = "" ;
      edtavDetailwebcomponent_Columnclass = "WWIconActionColumn WCD_ActionColumn" ;
      edtavDetailwebcomponent_Visible = -1 ;
      edtavDetailwebcomponent_Enabled = 1 ;
      cmbavGridactiongroup1.setJsonclick( "" );
      cmbavGridactiongroup1.setVisible( -1 );
      cmbavGridactiongroup1.setEnabled( 1 );
      cmbavGridactiongroup1.setColumnClass( "WWActionGroupColumn" );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtLb_obsLb_Columnheaderclass = "" ;
      edtLb_Rb_Columnheaderclass = "" ;
      edtavLb_fecnoa1_Columnheaderclass = "" ;
      edtavLb_fechar_Columnheaderclass = "" ;
      edtavLb_fechaen_Columnheaderclass = "" ;
      edtLb_FechaE_Columnheaderclass = "" ;
      edtLb_Local_Columnheaderclass = "" ;
      edtavLb_opcion_Columnheaderclass = "" ;
      cmbLb_EstEns.setColumnHeaderClass( "" );
      edtLb_Tipo_Columnheaderclass = "" ;
      edtLb_numero_Columnheaderclass = "" ;
      edtLb_ColNum_Columnheaderclass = "" ;
      edtLb_ColNom_Columnheaderclass = "" ;
      edtLb_ColNomC_Columnheaderclass = "" ;
      edtLb_ArtCod_Columnheaderclass = "" ;
      edtLb_Cartaz_Columnheaderclass = "" ;
      edtCliNom_Columnheaderclass = "" ;
      edtavDetailwebcomponent_Columnheaderclass = "" ;
      cmbavGridactiongroup1.setColumnHeaderClass( "" );
      edtLb_obsLb_Visible = -1 ;
      edtLb_Rb_Visible = -1 ;
      edtavLb_fecnoa1_Visible = -1 ;
      edtavLb_fechar_Visible = -1 ;
      edtavLb_fechaen_Visible = -1 ;
      edtLb_FechaE_Visible = -1 ;
      edtLb_Local_Visible = -1 ;
      edtavLb_opcion_Visible = -1 ;
      cmbLb_EstEns.setVisible( -1 );
      edtLb_Tipo_Visible = -1 ;
      edtLb_numero_Visible = -1 ;
      edtLb_ColNum_Visible = -1 ;
      edtLb_ColNom_Visible = -1 ;
      edtLb_ColNomC_Visible = -1 ;
      edtLb_ArtCod_Visible = -1 ;
      edtLb_Cartaz_Visible = -1 ;
      edtCliNom_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_lb_fechaeauxdate_Jsonclick = "" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      divCell_grid_dwc_Class = "col-xs-12" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hascategories = GXutil.toBoolean( -1) ;
      Grid_titlescategories_Gridtitlescategories = ";;;;;;;;;;;;;Fecha;Fecha;Fecha;Fecha;;;" ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "GestionLaboratorio.ConsultaSituacionColeccion_WCGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "||||||||0:Pdte. Act. Prod.,1:Act. Prod.,2:Cerrado||||||||" ;
      Ddo_grid_Allowmultipleselection = "||||||||T||||||||" ;
      Ddo_grid_Datalisttype = "Dynamic|Dynamic|Dynamic|Dynamic|Dynamic|||Dynamic|FixedValues||Dynamic||||||Dynamic" ;
      Ddo_grid_Includedatalist = "T|T|T|T|T|||T|T||T||||||T" ;
      Ddo_grid_Filterisrange = "|||||T|T|||||||||T|" ;
      Ddo_grid_Filtertype = "Character|Character|Character|Character|Character|Numeric|Numeric|Character|||Character|Date||||Numeric|Character" ;
      Ddo_grid_Includefilter = "T|T|T|T|T|T|T|T|||T|T||||T|T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T|T|T|T|T|T|T|T||T|T||||T|T" ;
      Ddo_grid_Columnssortvalues = "3|4|5|6|7|8|9|10|11||12|1||||13|14" ;
      Ddo_grid_Columnids = "2:CliNom|3:Lb_Cartaz|4:Lb_ArtCod|5:Lb_ColNomC|6:Lb_ColNom|7:Lb_ColNum|8:Lb_numero|9:Lb_Tipo|10:Lb_EstEns|11:Lb_opcion|12:Lb_Local|13:Lb_FechaE|14:Lb_FechaEn|15:Lb_FechaR|16:Lb_FecNoa1|18:Lb_Rb|19:Lb_obsLb" ;
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
      GXCCtl = "vGRIDACTIONGROUP1_" + sGXsfl_41_idx ;
      cmbavGridactiongroup1.setName( GXCCtl );
      cmbavGridactiongroup1.setWebtags( "" );
      if ( cmbavGridactiongroup1.getItemCount() > 0 )
      {
      }
      GXCCtl = "LB_ESTENS_" + sGXsfl_41_idx ;
      cmbLb_EstEns.setName( GXCCtl );
      cmbLb_EstEns.setWebtags( "" );
      cmbLb_EstEns.addItem("0", httpContext.getMessage( "Pdte. Act. Prod.", ""), (short)(0));
      cmbLb_EstEns.addItem("1", httpContext.getMessage( "Act. Prod.", ""), (short)(0));
      cmbLb_EstEns.addItem("2", httpContext.getMessage( "Cerrado", ""), (short)(0));
      if ( cmbLb_EstEns.getItemCount() > 0 )
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A5555Lb_opcion',fld:'LB_OPCION',pic:'@!'},{av:'A5563Lb_FechaR',fld:'LB_FECHAR',pic:''},{av:'A5567Lb_FechaEn',fld:'LB_FECHAEN',pic:''},{av:'A6461Lb_FecNoa1',fld:'LB_FECNOA1',pic:''},{av:'sPrefix'},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV5ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV27FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV230Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV217CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV218Lb_ArtCod',fld:'vLB_ARTCOD',pic:''},{av:'AV228Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV231Lb_EstEns',fld:'vLB_ESTENS',pic:'9'},{av:'AV226Lb_FechaEfrom',fld:'vLB_FECHAEFROM',pic:''},{av:'AV227Lb_FechaEto',fld:'vLB_FECHAETO',pic:''},{av:'AV219Lb_Cartaz',fld:'vLB_CARTAZ',pic:''},{av:'AV220Lb_cartazffrom',fld:'vLB_CARTAZFFROM',pic:''},{av:'AV221Lb_cartazfto',fld:'vLB_CARTAZFTO',pic:''},{av:'AV222Lb_ColNom',fld:'vLB_COLNOM',pic:''},{av:'AV224Lb_ColNum',fld:'vLB_COLNUM',pic:'ZZZZZ9'},{av:'AV223Lb_ColNomC',fld:'vLB_COLNOMC',pic:''},{av:'AV233Lb_Tipo',fld:'vLB_TIPO',pic:''},{av:'AV47TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV48TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV71TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV72TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV67TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV68TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV77TFLb_ColNomC',fld:'vTFLB_COLNOMC',pic:''},{av:'AV78TFLb_ColNomC_Sel',fld:'vTFLB_COLNOMC_SEL',pic:''},{av:'AV75TFLb_ColNom',fld:'vTFLB_COLNOM',pic:''},{av:'AV76TFLb_ColNom_Sel',fld:'vTFLB_COLNOM_SEL',pic:''},{av:'AV79TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV80TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV125TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV126TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV161TFLb_Tipo',fld:'vTFLB_TIPO',pic:''},{av:'AV162TFLb_Tipo_Sel',fld:'vTFLB_TIPO_SEL',pic:''},{av:'AV235TFLb_EstEns_Sels',fld:'vTFLB_ESTENS_SELS',pic:''},{av:'AV109TFLb_Local',fld:'vTFLB_LOCAL',pic:''},{av:'AV110TFLb_Local_Sel',fld:'vTFLB_LOCAL_SEL',pic:''},{av:'AV91TFLb_FechaE',fld:'vTFLB_FECHAE',pic:''},{av:'AV143TFLb_Rb',fld:'vTFLB_RB',pic:'ZZZ9.99'},{av:'AV144TFLb_Rb_To',fld:'vTFLB_RB_TO',pic:'ZZZ9.99'},{av:'AV133TFLb_obsLb',fld:'vTFLB_OBSLB',pic:''},{av:'AV134TFLb_obsLb_Sel',fld:'vTFLB_OBSLB_SEL',pic:''},{av:'AV239Pgmname',fld:'vPGMNAME',pic:''},{av:'AV40OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV42OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV5ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtLb_Cartaz_Visible',ctrl:'LB_CARTAZ',prop:'Visible'},{av:'edtLb_ArtCod_Visible',ctrl:'LB_ARTCOD',prop:'Visible'},{av:'edtLb_ColNomC_Visible',ctrl:'LB_COLNOMC',prop:'Visible'},{av:'edtLb_ColNom_Visible',ctrl:'LB_COLNOM',prop:'Visible'},{av:'edtLb_ColNum_Visible',ctrl:'LB_COLNUM',prop:'Visible'},{av:'edtLb_numero_Visible',ctrl:'LB_NUMERO',prop:'Visible'},{av:'edtLb_Tipo_Visible',ctrl:'LB_TIPO',prop:'Visible'},{av:'cmbLb_EstEns'},{av:'edtavLb_opcion_Visible',ctrl:'vLB_OPCION',prop:'Visible'},{av:'edtLb_Local_Visible',ctrl:'LB_LOCAL',prop:'Visible'},{av:'edtLb_FechaE_Visible',ctrl:'LB_FECHAE',prop:'Visible'},{av:'edtavLb_fechaen_Visible',ctrl:'vLB_FECHAEN',prop:'Visible'},{av:'edtavLb_fechar_Visible',ctrl:'vLB_FECHAR',prop:'Visible'},{av:'edtavLb_fecnoa1_Visible',ctrl:'vLB_FECNOA1',prop:'Visible'},{av:'edtLb_Rb_Visible',ctrl:'LB_RB',prop:'Visible'},{av:'edtLb_obsLb_Visible',ctrl:'LB_OBSLB',prop:'Visible'},{av:'AV28GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV29GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavGridactiongroup1'},{av:'edtavDetailwebcomponent_Columnheaderclass',ctrl:'vDETAILWEBCOMPONENT',prop:'Columnheaderclass'},{av:'edtCliNom_Columnheaderclass',ctrl:'CLINOM',prop:'Columnheaderclass'},{av:'edtLb_Cartaz_Columnheaderclass',ctrl:'LB_CARTAZ',prop:'Columnheaderclass'},{av:'edtLb_ArtCod_Columnheaderclass',ctrl:'LB_ARTCOD',prop:'Columnheaderclass'},{av:'edtLb_ColNomC_Columnheaderclass',ctrl:'LB_COLNOMC',prop:'Columnheaderclass'},{av:'edtLb_ColNom_Columnheaderclass',ctrl:'LB_COLNOM',prop:'Columnheaderclass'},{av:'edtLb_ColNum_Columnheaderclass',ctrl:'LB_COLNUM',prop:'Columnheaderclass'},{av:'edtLb_numero_Columnheaderclass',ctrl:'LB_NUMERO',prop:'Columnheaderclass'},{av:'edtLb_Tipo_Columnheaderclass',ctrl:'LB_TIPO',prop:'Columnheaderclass'},{av:'edtavLb_opcion_Columnheaderclass',ctrl:'vLB_OPCION',prop:'Columnheaderclass'},{av:'edtLb_Local_Columnheaderclass',ctrl:'LB_LOCAL',prop:'Columnheaderclass'},{av:'edtLb_FechaE_Columnheaderclass',ctrl:'LB_FECHAE',prop:'Columnheaderclass'},{av:'edtavLb_fechaen_Columnheaderclass',ctrl:'vLB_FECHAEN',prop:'Columnheaderclass'},{av:'edtavLb_fechar_Columnheaderclass',ctrl:'vLB_FECHAR',prop:'Columnheaderclass'},{av:'edtavLb_fecnoa1_Columnheaderclass',ctrl:'vLB_FECNOA1',prop:'Columnheaderclass'},{av:'edtLb_Rb_Columnheaderclass',ctrl:'LB_RB',prop:'Columnheaderclass'},{av:'edtLb_obsLb_Columnheaderclass',ctrl:'LB_OBSLB',prop:'Columnheaderclass'},{av:'AV37ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV30GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e121U82',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV27FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV230Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV217CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV218Lb_ArtCod',fld:'vLB_ARTCOD',pic:''},{av:'AV228Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV231Lb_EstEns',fld:'vLB_ESTENS',pic:'9'},{av:'AV226Lb_FechaEfrom',fld:'vLB_FECHAEFROM',pic:''},{av:'AV227Lb_FechaEto',fld:'vLB_FECHAETO',pic:''},{av:'AV219Lb_Cartaz',fld:'vLB_CARTAZ',pic:''},{av:'AV220Lb_cartazffrom',fld:'vLB_CARTAZFFROM',pic:''},{av:'AV221Lb_cartazfto',fld:'vLB_CARTAZFTO',pic:''},{av:'AV222Lb_ColNom',fld:'vLB_COLNOM',pic:''},{av:'AV224Lb_ColNum',fld:'vLB_COLNUM',pic:'ZZZZZ9'},{av:'AV223Lb_ColNomC',fld:'vLB_COLNOMC',pic:''},{av:'AV233Lb_Tipo',fld:'vLB_TIPO',pic:''},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV5ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV47TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV48TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV71TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV72TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV67TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV68TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV77TFLb_ColNomC',fld:'vTFLB_COLNOMC',pic:''},{av:'AV78TFLb_ColNomC_Sel',fld:'vTFLB_COLNOMC_SEL',pic:''},{av:'AV75TFLb_ColNom',fld:'vTFLB_COLNOM',pic:''},{av:'AV76TFLb_ColNom_Sel',fld:'vTFLB_COLNOM_SEL',pic:''},{av:'AV79TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV80TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV125TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV126TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV161TFLb_Tipo',fld:'vTFLB_TIPO',pic:''},{av:'AV162TFLb_Tipo_Sel',fld:'vTFLB_TIPO_SEL',pic:''},{av:'AV235TFLb_EstEns_Sels',fld:'vTFLB_ESTENS_SELS',pic:''},{av:'AV109TFLb_Local',fld:'vTFLB_LOCAL',pic:''},{av:'AV110TFLb_Local_Sel',fld:'vTFLB_LOCAL_SEL',pic:''},{av:'AV91TFLb_FechaE',fld:'vTFLB_FECHAE',pic:''},{av:'AV143TFLb_Rb',fld:'vTFLB_RB',pic:'ZZZ9.99'},{av:'AV144TFLb_Rb_To',fld:'vTFLB_RB_TO',pic:'ZZZ9.99'},{av:'AV133TFLb_obsLb',fld:'vTFLB_OBSLB',pic:''},{av:'AV134TFLb_obsLb_Sel',fld:'vTFLB_OBSLB_SEL',pic:''},{av:'AV239Pgmname',fld:'vPGMNAME',pic:''},{av:'AV40OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV42OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A5555Lb_opcion',fld:'LB_OPCION',pic:'@!'},{av:'A5563Lb_FechaR',fld:'LB_FECHAR',pic:''},{av:'A5567Lb_FechaEn',fld:'LB_FECHAEN',pic:''},{av:'A6461Lb_FecNoa1',fld:'LB_FECNOA1',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e131U82',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV27FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV230Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV217CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV218Lb_ArtCod',fld:'vLB_ARTCOD',pic:''},{av:'AV228Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV231Lb_EstEns',fld:'vLB_ESTENS',pic:'9'},{av:'AV226Lb_FechaEfrom',fld:'vLB_FECHAEFROM',pic:''},{av:'AV227Lb_FechaEto',fld:'vLB_FECHAETO',pic:''},{av:'AV219Lb_Cartaz',fld:'vLB_CARTAZ',pic:''},{av:'AV220Lb_cartazffrom',fld:'vLB_CARTAZFFROM',pic:''},{av:'AV221Lb_cartazfto',fld:'vLB_CARTAZFTO',pic:''},{av:'AV222Lb_ColNom',fld:'vLB_COLNOM',pic:''},{av:'AV224Lb_ColNum',fld:'vLB_COLNUM',pic:'ZZZZZ9'},{av:'AV223Lb_ColNomC',fld:'vLB_COLNOMC',pic:''},{av:'AV233Lb_Tipo',fld:'vLB_TIPO',pic:''},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV5ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV47TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV48TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV71TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV72TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV67TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV68TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV77TFLb_ColNomC',fld:'vTFLB_COLNOMC',pic:''},{av:'AV78TFLb_ColNomC_Sel',fld:'vTFLB_COLNOMC_SEL',pic:''},{av:'AV75TFLb_ColNom',fld:'vTFLB_COLNOM',pic:''},{av:'AV76TFLb_ColNom_Sel',fld:'vTFLB_COLNOM_SEL',pic:''},{av:'AV79TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV80TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV125TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV126TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV161TFLb_Tipo',fld:'vTFLB_TIPO',pic:''},{av:'AV162TFLb_Tipo_Sel',fld:'vTFLB_TIPO_SEL',pic:''},{av:'AV235TFLb_EstEns_Sels',fld:'vTFLB_ESTENS_SELS',pic:''},{av:'AV109TFLb_Local',fld:'vTFLB_LOCAL',pic:''},{av:'AV110TFLb_Local_Sel',fld:'vTFLB_LOCAL_SEL',pic:''},{av:'AV91TFLb_FechaE',fld:'vTFLB_FECHAE',pic:''},{av:'AV143TFLb_Rb',fld:'vTFLB_RB',pic:'ZZZ9.99'},{av:'AV144TFLb_Rb_To',fld:'vTFLB_RB_TO',pic:'ZZZ9.99'},{av:'AV133TFLb_obsLb',fld:'vTFLB_OBSLB',pic:''},{av:'AV134TFLb_obsLb_Sel',fld:'vTFLB_OBSLB_SEL',pic:''},{av:'AV239Pgmname',fld:'vPGMNAME',pic:''},{av:'AV40OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV42OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A5555Lb_opcion',fld:'LB_OPCION',pic:'@!'},{av:'A5563Lb_FechaR',fld:'LB_FECHAR',pic:''},{av:'A5567Lb_FechaEn',fld:'LB_FECHAEN',pic:''},{av:'A6461Lb_FecNoa1',fld:'LB_FECNOA1',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e141U82',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV27FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV230Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV217CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV218Lb_ArtCod',fld:'vLB_ARTCOD',pic:''},{av:'AV228Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV231Lb_EstEns',fld:'vLB_ESTENS',pic:'9'},{av:'AV226Lb_FechaEfrom',fld:'vLB_FECHAEFROM',pic:''},{av:'AV227Lb_FechaEto',fld:'vLB_FECHAETO',pic:''},{av:'AV219Lb_Cartaz',fld:'vLB_CARTAZ',pic:''},{av:'AV220Lb_cartazffrom',fld:'vLB_CARTAZFFROM',pic:''},{av:'AV221Lb_cartazfto',fld:'vLB_CARTAZFTO',pic:''},{av:'AV222Lb_ColNom',fld:'vLB_COLNOM',pic:''},{av:'AV224Lb_ColNum',fld:'vLB_COLNUM',pic:'ZZZZZ9'},{av:'AV223Lb_ColNomC',fld:'vLB_COLNOMC',pic:''},{av:'AV233Lb_Tipo',fld:'vLB_TIPO',pic:''},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV5ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV47TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV48TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV71TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV72TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV67TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV68TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV77TFLb_ColNomC',fld:'vTFLB_COLNOMC',pic:''},{av:'AV78TFLb_ColNomC_Sel',fld:'vTFLB_COLNOMC_SEL',pic:''},{av:'AV75TFLb_ColNom',fld:'vTFLB_COLNOM',pic:''},{av:'AV76TFLb_ColNom_Sel',fld:'vTFLB_COLNOM_SEL',pic:''},{av:'AV79TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV80TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV125TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV126TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV161TFLb_Tipo',fld:'vTFLB_TIPO',pic:''},{av:'AV162TFLb_Tipo_Sel',fld:'vTFLB_TIPO_SEL',pic:''},{av:'AV235TFLb_EstEns_Sels',fld:'vTFLB_ESTENS_SELS',pic:''},{av:'AV109TFLb_Local',fld:'vTFLB_LOCAL',pic:''},{av:'AV110TFLb_Local_Sel',fld:'vTFLB_LOCAL_SEL',pic:''},{av:'AV91TFLb_FechaE',fld:'vTFLB_FECHAE',pic:''},{av:'AV143TFLb_Rb',fld:'vTFLB_RB',pic:'ZZZ9.99'},{av:'AV144TFLb_Rb_To',fld:'vTFLB_RB_TO',pic:'ZZZ9.99'},{av:'AV133TFLb_obsLb',fld:'vTFLB_OBSLB',pic:''},{av:'AV134TFLb_obsLb_Sel',fld:'vTFLB_OBSLB_SEL',pic:''},{av:'AV239Pgmname',fld:'vPGMNAME',pic:''},{av:'AV40OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV42OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A5555Lb_opcion',fld:'LB_OPCION',pic:'@!'},{av:'A5563Lb_FechaR',fld:'LB_FECHAR',pic:''},{av:'A5567Lb_FechaEn',fld:'LB_FECHAEN',pic:''},{av:'A6461Lb_FecNoa1',fld:'LB_FECNOA1',pic:''},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV40OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV42OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV133TFLb_obsLb',fld:'vTFLB_OBSLB',pic:''},{av:'AV134TFLb_obsLb_Sel',fld:'vTFLB_OBSLB_SEL',pic:''},{av:'AV143TFLb_Rb',fld:'vTFLB_RB',pic:'ZZZ9.99'},{av:'AV144TFLb_Rb_To',fld:'vTFLB_RB_TO',pic:'ZZZ9.99'},{av:'AV91TFLb_FechaE',fld:'vTFLB_FECHAE',pic:''},{av:'AV109TFLb_Local',fld:'vTFLB_LOCAL',pic:''},{av:'AV110TFLb_Local_Sel',fld:'vTFLB_LOCAL_SEL',pic:''},{av:'AV234TFLb_EstEns_SelsJson',fld:'vTFLB_ESTENS_SELSJSON',pic:''},{av:'AV235TFLb_EstEns_Sels',fld:'vTFLB_ESTENS_SELS',pic:''},{av:'AV161TFLb_Tipo',fld:'vTFLB_TIPO',pic:''},{av:'AV162TFLb_Tipo_Sel',fld:'vTFLB_TIPO_SEL',pic:''},{av:'AV125TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV126TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV79TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV80TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV75TFLb_ColNom',fld:'vTFLB_COLNOM',pic:''},{av:'AV76TFLb_ColNom_Sel',fld:'vTFLB_COLNOM_SEL',pic:''},{av:'AV77TFLb_ColNomC',fld:'vTFLB_COLNOMC',pic:''},{av:'AV78TFLb_ColNomC_Sel',fld:'vTFLB_COLNOMC_SEL',pic:''},{av:'AV67TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV68TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV71TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV72TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV47TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV48TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e201U82',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A5532Lb_numero',fld:'LB_NUMERO',pic:'ZZZZZZZ9',hsh:true},{av:'A5555Lb_opcion',fld:'LB_OPCION',pic:'@!'},{av:'A5563Lb_FechaR',fld:'LB_FECHAR',pic:''},{av:'A5567Lb_FechaEn',fld:'LB_FECHAEN',pic:''},{av:'A6461Lb_FecNoa1',fld:'LB_FECNOA1',pic:''},{av:'A10883Lb_obsLb',fld:'LB_OBSLB',pic:''}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactiongroup1'},{av:'AV236GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{av:'AV232DetailWebComponent',fld:'vDETAILWEBCOMPONENT',pic:''},{av:'AV35Lb_FechaR',fld:'vLB_FECHAR',pic:''},{av:'AV229Lb_opcion',fld:'vLB_OPCION',pic:'@!'},{av:'AV34Lb_FechaEn',fld:'vLB_FECHAEN',pic:''},{av:'AV36Lb_FecNoa1',fld:'vLB_FECNOA1',pic:''},{av:'edtavDetailwebcomponent_Columnclass',ctrl:'vDETAILWEBCOMPONENT',prop:'Columnclass'},{av:'edtCliNom_Columnclass',ctrl:'CLINOM',prop:'Columnclass'},{av:'edtLb_Cartaz_Columnclass',ctrl:'LB_CARTAZ',prop:'Columnclass'},{av:'edtLb_ArtCod_Columnclass',ctrl:'LB_ARTCOD',prop:'Columnclass'},{av:'edtLb_ColNomC_Columnclass',ctrl:'LB_COLNOMC',prop:'Columnclass'},{av:'edtLb_ColNom_Columnclass',ctrl:'LB_COLNOM',prop:'Columnclass'},{av:'edtLb_ColNum_Columnclass',ctrl:'LB_COLNUM',prop:'Columnclass'},{av:'edtLb_numero_Columnclass',ctrl:'LB_NUMERO',prop:'Columnclass'},{av:'edtLb_Tipo_Columnclass',ctrl:'LB_TIPO',prop:'Columnclass'},{av:'cmbLb_EstEns'},{av:'edtavLb_opcion_Columnclass',ctrl:'vLB_OPCION',prop:'Columnclass'},{av:'edtLb_Local_Columnclass',ctrl:'LB_LOCAL',prop:'Columnclass'},{av:'edtLb_FechaE_Columnclass',ctrl:'LB_FECHAE',prop:'Columnclass'},{av:'edtavLb_fechaen_Columnclass',ctrl:'vLB_FECHAEN',prop:'Columnclass'},{av:'edtavLb_fechar_Columnclass',ctrl:'vLB_FECHAR',prop:'Columnclass'},{av:'edtavLb_fecnoa1_Columnclass',ctrl:'vLB_FECNOA1',prop:'Columnclass'},{av:'edtLb_Rb_Columnclass',ctrl:'LB_RB',prop:'Columnclass'},{av:'edtLb_obsLb_Columnclass',ctrl:'LB_OBSLB',prop:'Columnclass'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e151U82',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV27FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV230Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV217CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV218Lb_ArtCod',fld:'vLB_ARTCOD',pic:''},{av:'AV228Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV231Lb_EstEns',fld:'vLB_ESTENS',pic:'9'},{av:'AV226Lb_FechaEfrom',fld:'vLB_FECHAEFROM',pic:''},{av:'AV227Lb_FechaEto',fld:'vLB_FECHAETO',pic:''},{av:'AV219Lb_Cartaz',fld:'vLB_CARTAZ',pic:''},{av:'AV220Lb_cartazffrom',fld:'vLB_CARTAZFFROM',pic:''},{av:'AV221Lb_cartazfto',fld:'vLB_CARTAZFTO',pic:''},{av:'AV222Lb_ColNom',fld:'vLB_COLNOM',pic:''},{av:'AV224Lb_ColNum',fld:'vLB_COLNUM',pic:'ZZZZZ9'},{av:'AV223Lb_ColNomC',fld:'vLB_COLNOMC',pic:''},{av:'AV233Lb_Tipo',fld:'vLB_TIPO',pic:''},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV5ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV47TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV48TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV71TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV72TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV67TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV68TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV77TFLb_ColNomC',fld:'vTFLB_COLNOMC',pic:''},{av:'AV78TFLb_ColNomC_Sel',fld:'vTFLB_COLNOMC_SEL',pic:''},{av:'AV75TFLb_ColNom',fld:'vTFLB_COLNOM',pic:''},{av:'AV76TFLb_ColNom_Sel',fld:'vTFLB_COLNOM_SEL',pic:''},{av:'AV79TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV80TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV125TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV126TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV161TFLb_Tipo',fld:'vTFLB_TIPO',pic:''},{av:'AV162TFLb_Tipo_Sel',fld:'vTFLB_TIPO_SEL',pic:''},{av:'AV235TFLb_EstEns_Sels',fld:'vTFLB_ESTENS_SELS',pic:''},{av:'AV109TFLb_Local',fld:'vTFLB_LOCAL',pic:''},{av:'AV110TFLb_Local_Sel',fld:'vTFLB_LOCAL_SEL',pic:''},{av:'AV91TFLb_FechaE',fld:'vTFLB_FECHAE',pic:''},{av:'AV143TFLb_Rb',fld:'vTFLB_RB',pic:'ZZZ9.99'},{av:'AV144TFLb_Rb_To',fld:'vTFLB_RB_TO',pic:'ZZZ9.99'},{av:'AV133TFLb_obsLb',fld:'vTFLB_OBSLB',pic:''},{av:'AV134TFLb_obsLb_Sel',fld:'vTFLB_OBSLB_SEL',pic:''},{av:'AV239Pgmname',fld:'vPGMNAME',pic:''},{av:'AV40OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV42OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A5555Lb_opcion',fld:'LB_OPCION',pic:'@!'},{av:'A5563Lb_FechaR',fld:'LB_FECHAR',pic:''},{av:'A5567Lb_FechaEn',fld:'LB_FECHAEN',pic:''},{av:'A6461Lb_FecNoa1',fld:'LB_FECNOA1',pic:''},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV5ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtLb_Cartaz_Visible',ctrl:'LB_CARTAZ',prop:'Visible'},{av:'edtLb_ArtCod_Visible',ctrl:'LB_ARTCOD',prop:'Visible'},{av:'edtLb_ColNomC_Visible',ctrl:'LB_COLNOMC',prop:'Visible'},{av:'edtLb_ColNom_Visible',ctrl:'LB_COLNOM',prop:'Visible'},{av:'edtLb_ColNum_Visible',ctrl:'LB_COLNUM',prop:'Visible'},{av:'edtLb_numero_Visible',ctrl:'LB_NUMERO',prop:'Visible'},{av:'edtLb_Tipo_Visible',ctrl:'LB_TIPO',prop:'Visible'},{av:'cmbLb_EstEns'},{av:'edtavLb_opcion_Visible',ctrl:'vLB_OPCION',prop:'Visible'},{av:'edtLb_Local_Visible',ctrl:'LB_LOCAL',prop:'Visible'},{av:'edtLb_FechaE_Visible',ctrl:'LB_FECHAE',prop:'Visible'},{av:'edtavLb_fechaen_Visible',ctrl:'vLB_FECHAEN',prop:'Visible'},{av:'edtavLb_fechar_Visible',ctrl:'vLB_FECHAR',prop:'Visible'},{av:'edtavLb_fecnoa1_Visible',ctrl:'vLB_FECNOA1',prop:'Visible'},{av:'edtLb_Rb_Visible',ctrl:'LB_RB',prop:'Visible'},{av:'edtLb_obsLb_Visible',ctrl:'LB_OBSLB',prop:'Visible'},{av:'AV28GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV29GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavGridactiongroup1'},{av:'edtavDetailwebcomponent_Columnheaderclass',ctrl:'vDETAILWEBCOMPONENT',prop:'Columnheaderclass'},{av:'edtCliNom_Columnheaderclass',ctrl:'CLINOM',prop:'Columnheaderclass'},{av:'edtLb_Cartaz_Columnheaderclass',ctrl:'LB_CARTAZ',prop:'Columnheaderclass'},{av:'edtLb_ArtCod_Columnheaderclass',ctrl:'LB_ARTCOD',prop:'Columnheaderclass'},{av:'edtLb_ColNomC_Columnheaderclass',ctrl:'LB_COLNOMC',prop:'Columnheaderclass'},{av:'edtLb_ColNom_Columnheaderclass',ctrl:'LB_COLNOM',prop:'Columnheaderclass'},{av:'edtLb_ColNum_Columnheaderclass',ctrl:'LB_COLNUM',prop:'Columnheaderclass'},{av:'edtLb_numero_Columnheaderclass',ctrl:'LB_NUMERO',prop:'Columnheaderclass'},{av:'edtLb_Tipo_Columnheaderclass',ctrl:'LB_TIPO',prop:'Columnheaderclass'},{av:'edtavLb_opcion_Columnheaderclass',ctrl:'vLB_OPCION',prop:'Columnheaderclass'},{av:'edtLb_Local_Columnheaderclass',ctrl:'LB_LOCAL',prop:'Columnheaderclass'},{av:'edtLb_FechaE_Columnheaderclass',ctrl:'LB_FECHAE',prop:'Columnheaderclass'},{av:'edtavLb_fechaen_Columnheaderclass',ctrl:'vLB_FECHAEN',prop:'Columnheaderclass'},{av:'edtavLb_fechar_Columnheaderclass',ctrl:'vLB_FECHAR',prop:'Columnheaderclass'},{av:'edtavLb_fecnoa1_Columnheaderclass',ctrl:'vLB_FECNOA1',prop:'Columnheaderclass'},{av:'edtLb_Rb_Columnheaderclass',ctrl:'LB_RB',prop:'Columnheaderclass'},{av:'edtLb_obsLb_Columnheaderclass',ctrl:'LB_OBSLB',prop:'Columnheaderclass'},{av:'AV37ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV30GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e111U82',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV27FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV230Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV217CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV218Lb_ArtCod',fld:'vLB_ARTCOD',pic:''},{av:'AV228Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV231Lb_EstEns',fld:'vLB_ESTENS',pic:'9'},{av:'AV226Lb_FechaEfrom',fld:'vLB_FECHAEFROM',pic:''},{av:'AV227Lb_FechaEto',fld:'vLB_FECHAETO',pic:''},{av:'AV219Lb_Cartaz',fld:'vLB_CARTAZ',pic:''},{av:'AV220Lb_cartazffrom',fld:'vLB_CARTAZFFROM',pic:''},{av:'AV221Lb_cartazfto',fld:'vLB_CARTAZFTO',pic:''},{av:'AV222Lb_ColNom',fld:'vLB_COLNOM',pic:''},{av:'AV224Lb_ColNum',fld:'vLB_COLNUM',pic:'ZZZZZ9'},{av:'AV223Lb_ColNomC',fld:'vLB_COLNOMC',pic:''},{av:'AV233Lb_Tipo',fld:'vLB_TIPO',pic:''},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV5ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV47TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV48TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV71TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV72TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV67TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV68TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV77TFLb_ColNomC',fld:'vTFLB_COLNOMC',pic:''},{av:'AV78TFLb_ColNomC_Sel',fld:'vTFLB_COLNOMC_SEL',pic:''},{av:'AV75TFLb_ColNom',fld:'vTFLB_COLNOM',pic:''},{av:'AV76TFLb_ColNom_Sel',fld:'vTFLB_COLNOM_SEL',pic:''},{av:'AV79TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV80TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV125TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV126TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV161TFLb_Tipo',fld:'vTFLB_TIPO',pic:''},{av:'AV162TFLb_Tipo_Sel',fld:'vTFLB_TIPO_SEL',pic:''},{av:'AV235TFLb_EstEns_Sels',fld:'vTFLB_ESTENS_SELS',pic:''},{av:'AV109TFLb_Local',fld:'vTFLB_LOCAL',pic:''},{av:'AV110TFLb_Local_Sel',fld:'vTFLB_LOCAL_SEL',pic:''},{av:'AV91TFLb_FechaE',fld:'vTFLB_FECHAE',pic:''},{av:'AV143TFLb_Rb',fld:'vTFLB_RB',pic:'ZZZ9.99'},{av:'AV144TFLb_Rb_To',fld:'vTFLB_RB_TO',pic:'ZZZ9.99'},{av:'AV133TFLb_obsLb',fld:'vTFLB_OBSLB',pic:''},{av:'AV134TFLb_obsLb_Sel',fld:'vTFLB_OBSLB_SEL',pic:''},{av:'AV239Pgmname',fld:'vPGMNAME',pic:''},{av:'AV40OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV42OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A5555Lb_opcion',fld:'LB_OPCION',pic:'@!'},{av:'A5563Lb_FechaR',fld:'LB_FECHAR',pic:''},{av:'A5567Lb_FechaEn',fld:'LB_FECHAEN',pic:''},{av:'A6461Lb_FecNoa1',fld:'LB_FECNOA1',pic:''},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV30GridState',fld:'vGRIDSTATE',pic:''},{av:'AV234TFLb_EstEns_SelsJson',fld:'vTFLB_ESTENS_SELSJSON',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV30GridState',fld:'vGRIDSTATE',pic:''},{av:'AV40OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV42OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV27FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV47TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV48TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV71TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV72TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV67TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV68TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV77TFLb_ColNomC',fld:'vTFLB_COLNOMC',pic:''},{av:'AV78TFLb_ColNomC_Sel',fld:'vTFLB_COLNOMC_SEL',pic:''},{av:'AV75TFLb_ColNom',fld:'vTFLB_COLNOM',pic:''},{av:'AV76TFLb_ColNom_Sel',fld:'vTFLB_COLNOM_SEL',pic:''},{av:'AV79TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV80TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV125TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV126TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV161TFLb_Tipo',fld:'vTFLB_TIPO',pic:''},{av:'AV162TFLb_Tipo_Sel',fld:'vTFLB_TIPO_SEL',pic:''},{av:'AV235TFLb_EstEns_Sels',fld:'vTFLB_ESTENS_SELS',pic:''},{av:'AV109TFLb_Local',fld:'vTFLB_LOCAL',pic:''},{av:'AV110TFLb_Local_Sel',fld:'vTFLB_LOCAL_SEL',pic:''},{av:'AV91TFLb_FechaE',fld:'vTFLB_FECHAE',pic:''},{av:'AV143TFLb_Rb',fld:'vTFLB_RB',pic:'ZZZ9.99'},{av:'AV144TFLb_Rb_To',fld:'vTFLB_RB_TO',pic:'ZZZ9.99'},{av:'AV133TFLb_obsLb',fld:'vTFLB_OBSLB',pic:''},{av:'AV134TFLb_obsLb_Sel',fld:'vTFLB_OBSLB_SEL',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV234TFLb_EstEns_SelsJson',fld:'vTFLB_ESTENS_SELSJSON',pic:''},{av:'AV5ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtLb_Cartaz_Visible',ctrl:'LB_CARTAZ',prop:'Visible'},{av:'edtLb_ArtCod_Visible',ctrl:'LB_ARTCOD',prop:'Visible'},{av:'edtLb_ColNomC_Visible',ctrl:'LB_COLNOMC',prop:'Visible'},{av:'edtLb_ColNom_Visible',ctrl:'LB_COLNOM',prop:'Visible'},{av:'edtLb_ColNum_Visible',ctrl:'LB_COLNUM',prop:'Visible'},{av:'edtLb_numero_Visible',ctrl:'LB_NUMERO',prop:'Visible'},{av:'edtLb_Tipo_Visible',ctrl:'LB_TIPO',prop:'Visible'},{av:'cmbLb_EstEns'},{av:'edtavLb_opcion_Visible',ctrl:'vLB_OPCION',prop:'Visible'},{av:'edtLb_Local_Visible',ctrl:'LB_LOCAL',prop:'Visible'},{av:'edtLb_FechaE_Visible',ctrl:'LB_FECHAE',prop:'Visible'},{av:'edtavLb_fechaen_Visible',ctrl:'vLB_FECHAEN',prop:'Visible'},{av:'edtavLb_fechar_Visible',ctrl:'vLB_FECHAR',prop:'Visible'},{av:'edtavLb_fecnoa1_Visible',ctrl:'vLB_FECNOA1',prop:'Visible'},{av:'edtLb_Rb_Visible',ctrl:'LB_RB',prop:'Visible'},{av:'edtLb_obsLb_Visible',ctrl:'LB_OBSLB',prop:'Visible'},{av:'AV28GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV29GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavGridactiongroup1'},{av:'edtavDetailwebcomponent_Columnheaderclass',ctrl:'vDETAILWEBCOMPONENT',prop:'Columnheaderclass'},{av:'edtCliNom_Columnheaderclass',ctrl:'CLINOM',prop:'Columnheaderclass'},{av:'edtLb_Cartaz_Columnheaderclass',ctrl:'LB_CARTAZ',prop:'Columnheaderclass'},{av:'edtLb_ArtCod_Columnheaderclass',ctrl:'LB_ARTCOD',prop:'Columnheaderclass'},{av:'edtLb_ColNomC_Columnheaderclass',ctrl:'LB_COLNOMC',prop:'Columnheaderclass'},{av:'edtLb_ColNom_Columnheaderclass',ctrl:'LB_COLNOM',prop:'Columnheaderclass'},{av:'edtLb_ColNum_Columnheaderclass',ctrl:'LB_COLNUM',prop:'Columnheaderclass'},{av:'edtLb_numero_Columnheaderclass',ctrl:'LB_NUMERO',prop:'Columnheaderclass'},{av:'edtLb_Tipo_Columnheaderclass',ctrl:'LB_TIPO',prop:'Columnheaderclass'},{av:'edtavLb_opcion_Columnheaderclass',ctrl:'vLB_OPCION',prop:'Columnheaderclass'},{av:'edtLb_Local_Columnheaderclass',ctrl:'LB_LOCAL',prop:'Columnheaderclass'},{av:'edtLb_FechaE_Columnheaderclass',ctrl:'LB_FECHAE',prop:'Columnheaderclass'},{av:'edtavLb_fechaen_Columnheaderclass',ctrl:'vLB_FECHAEN',prop:'Columnheaderclass'},{av:'edtavLb_fechar_Columnheaderclass',ctrl:'vLB_FECHAR',prop:'Columnheaderclass'},{av:'edtavLb_fecnoa1_Columnheaderclass',ctrl:'vLB_FECNOA1',prop:'Columnheaderclass'},{av:'edtLb_Rb_Columnheaderclass',ctrl:'LB_RB',prop:'Columnheaderclass'},{av:'edtLb_obsLb_Columnheaderclass',ctrl:'LB_OBSLB',prop:'Columnheaderclass'},{av:'AV37ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRIDACTIONGROUP1.CLICK","{handler:'e211U82',iparms:[{av:'cmbavGridactiongroup1'},{av:'AV236GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV27FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV230Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV217CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV218Lb_ArtCod',fld:'vLB_ARTCOD',pic:''},{av:'AV228Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV231Lb_EstEns',fld:'vLB_ESTENS',pic:'9'},{av:'AV226Lb_FechaEfrom',fld:'vLB_FECHAEFROM',pic:''},{av:'AV227Lb_FechaEto',fld:'vLB_FECHAETO',pic:''},{av:'AV219Lb_Cartaz',fld:'vLB_CARTAZ',pic:''},{av:'AV220Lb_cartazffrom',fld:'vLB_CARTAZFFROM',pic:''},{av:'AV221Lb_cartazfto',fld:'vLB_CARTAZFTO',pic:''},{av:'AV222Lb_ColNom',fld:'vLB_COLNOM',pic:''},{av:'AV224Lb_ColNum',fld:'vLB_COLNUM',pic:'ZZZZZ9'},{av:'AV223Lb_ColNomC',fld:'vLB_COLNOMC',pic:''},{av:'AV233Lb_Tipo',fld:'vLB_TIPO',pic:''},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV5ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV47TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV48TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV71TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV72TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV67TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV68TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV77TFLb_ColNomC',fld:'vTFLB_COLNOMC',pic:''},{av:'AV78TFLb_ColNomC_Sel',fld:'vTFLB_COLNOMC_SEL',pic:''},{av:'AV75TFLb_ColNom',fld:'vTFLB_COLNOM',pic:''},{av:'AV76TFLb_ColNom_Sel',fld:'vTFLB_COLNOM_SEL',pic:''},{av:'AV79TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV80TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV125TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV126TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV161TFLb_Tipo',fld:'vTFLB_TIPO',pic:''},{av:'AV162TFLb_Tipo_Sel',fld:'vTFLB_TIPO_SEL',pic:''},{av:'AV235TFLb_EstEns_Sels',fld:'vTFLB_ESTENS_SELS',pic:''},{av:'AV109TFLb_Local',fld:'vTFLB_LOCAL',pic:''},{av:'AV110TFLb_Local_Sel',fld:'vTFLB_LOCAL_SEL',pic:''},{av:'AV91TFLb_FechaE',fld:'vTFLB_FECHAE',pic:''},{av:'AV143TFLb_Rb',fld:'vTFLB_RB',pic:'ZZZ9.99'},{av:'AV144TFLb_Rb_To',fld:'vTFLB_RB_TO',pic:'ZZZ9.99'},{av:'AV133TFLb_obsLb',fld:'vTFLB_OBSLB',pic:''},{av:'AV134TFLb_obsLb_Sel',fld:'vTFLB_OBSLB_SEL',pic:''},{av:'AV239Pgmname',fld:'vPGMNAME',pic:''},{av:'AV40OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV42OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A5555Lb_opcion',fld:'LB_OPCION',pic:'@!'},{av:'A5563Lb_FechaR',fld:'LB_FECHAR',pic:''},{av:'A5567Lb_FechaEn',fld:'LB_FECHAEN',pic:''},{av:'A6461Lb_FecNoa1',fld:'LB_FECNOA1',pic:''},{av:'sPrefix'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A5532Lb_numero',fld:'LB_NUMERO',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("VGRIDACTIONGROUP1.CLICK",",oparms:[{av:'cmbavGridactiongroup1'},{av:'AV236GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV5ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtLb_Cartaz_Visible',ctrl:'LB_CARTAZ',prop:'Visible'},{av:'edtLb_ArtCod_Visible',ctrl:'LB_ARTCOD',prop:'Visible'},{av:'edtLb_ColNomC_Visible',ctrl:'LB_COLNOMC',prop:'Visible'},{av:'edtLb_ColNom_Visible',ctrl:'LB_COLNOM',prop:'Visible'},{av:'edtLb_ColNum_Visible',ctrl:'LB_COLNUM',prop:'Visible'},{av:'edtLb_numero_Visible',ctrl:'LB_NUMERO',prop:'Visible'},{av:'edtLb_Tipo_Visible',ctrl:'LB_TIPO',prop:'Visible'},{av:'cmbLb_EstEns'},{av:'edtavLb_opcion_Visible',ctrl:'vLB_OPCION',prop:'Visible'},{av:'edtLb_Local_Visible',ctrl:'LB_LOCAL',prop:'Visible'},{av:'edtLb_FechaE_Visible',ctrl:'LB_FECHAE',prop:'Visible'},{av:'edtavLb_fechaen_Visible',ctrl:'vLB_FECHAEN',prop:'Visible'},{av:'edtavLb_fechar_Visible',ctrl:'vLB_FECHAR',prop:'Visible'},{av:'edtavLb_fecnoa1_Visible',ctrl:'vLB_FECNOA1',prop:'Visible'},{av:'edtLb_Rb_Visible',ctrl:'LB_RB',prop:'Visible'},{av:'edtLb_obsLb_Visible',ctrl:'LB_OBSLB',prop:'Visible'},{av:'AV28GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV29GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtavDetailwebcomponent_Columnheaderclass',ctrl:'vDETAILWEBCOMPONENT',prop:'Columnheaderclass'},{av:'edtCliNom_Columnheaderclass',ctrl:'CLINOM',prop:'Columnheaderclass'},{av:'edtLb_Cartaz_Columnheaderclass',ctrl:'LB_CARTAZ',prop:'Columnheaderclass'},{av:'edtLb_ArtCod_Columnheaderclass',ctrl:'LB_ARTCOD',prop:'Columnheaderclass'},{av:'edtLb_ColNomC_Columnheaderclass',ctrl:'LB_COLNOMC',prop:'Columnheaderclass'},{av:'edtLb_ColNom_Columnheaderclass',ctrl:'LB_COLNOM',prop:'Columnheaderclass'},{av:'edtLb_ColNum_Columnheaderclass',ctrl:'LB_COLNUM',prop:'Columnheaderclass'},{av:'edtLb_numero_Columnheaderclass',ctrl:'LB_NUMERO',prop:'Columnheaderclass'},{av:'edtLb_Tipo_Columnheaderclass',ctrl:'LB_TIPO',prop:'Columnheaderclass'},{av:'edtavLb_opcion_Columnheaderclass',ctrl:'vLB_OPCION',prop:'Columnheaderclass'},{av:'edtLb_Local_Columnheaderclass',ctrl:'LB_LOCAL',prop:'Columnheaderclass'},{av:'edtLb_FechaE_Columnheaderclass',ctrl:'LB_FECHAE',prop:'Columnheaderclass'},{av:'edtavLb_fechaen_Columnheaderclass',ctrl:'vLB_FECHAEN',prop:'Columnheaderclass'},{av:'edtavLb_fechar_Columnheaderclass',ctrl:'vLB_FECHAR',prop:'Columnheaderclass'},{av:'edtavLb_fecnoa1_Columnheaderclass',ctrl:'vLB_FECNOA1',prop:'Columnheaderclass'},{av:'edtLb_Rb_Columnheaderclass',ctrl:'LB_RB',prop:'Columnheaderclass'},{av:'edtLb_obsLb_Columnheaderclass',ctrl:'LB_OBSLB',prop:'Columnheaderclass'},{av:'AV37ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV30GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e161U82',iparms:[]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e171U82',iparms:[]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK","{handler:'e221U82',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A5532Lb_numero',fld:'LB_NUMERO',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK",",oparms:[{ctrl:'GRID_DWC'}]}");
      setEventMetadata("VALID_LB_NUMERO","{handler:'valid_Lb_numero',iparms:[]");
      setEventMetadata("VALID_LB_NUMERO",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Lb_obslb',iparms:[]");
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
      wcpOAV230Emprcod = "" ;
      wcpOAV218Lb_ArtCod = "" ;
      wcpOAV226Lb_FechaEfrom = GXutil.nullDate() ;
      wcpOAV227Lb_FechaEto = GXutil.nullDate() ;
      wcpOAV219Lb_Cartaz = "" ;
      wcpOAV220Lb_cartazffrom = GXutil.nullDate() ;
      wcpOAV221Lb_cartazfto = GXutil.nullDate() ;
      wcpOAV222Lb_ColNom = "" ;
      wcpOAV223Lb_ColNomC = "" ;
      wcpOAV233Lb_Tipo = "" ;
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
      AV230Emprcod = "" ;
      AV218Lb_ArtCod = "" ;
      AV226Lb_FechaEfrom = GXutil.nullDate() ;
      AV227Lb_FechaEto = GXutil.nullDate() ;
      AV219Lb_Cartaz = "" ;
      AV220Lb_cartazffrom = GXutil.nullDate() ;
      AV221Lb_cartazfto = GXutil.nullDate() ;
      AV222Lb_ColNom = "" ;
      AV223Lb_ColNomC = "" ;
      AV233Lb_Tipo = "" ;
      AV27FilterFullText = "" ;
      AV5ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV47TFCliNom = "" ;
      AV48TFCliNom_Sel = "" ;
      AV71TFLb_Cartaz = "" ;
      AV72TFLb_Cartaz_Sel = "" ;
      AV67TFLb_ArtCod = "" ;
      AV68TFLb_ArtCod_Sel = "" ;
      AV77TFLb_ColNomC = "" ;
      AV78TFLb_ColNomC_Sel = "" ;
      AV75TFLb_ColNom = "" ;
      AV76TFLb_ColNom_Sel = "" ;
      AV161TFLb_Tipo = "" ;
      AV162TFLb_Tipo_Sel = "" ;
      AV235TFLb_EstEns_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV109TFLb_Local = "" ;
      AV110TFLb_Local_Sel = "" ;
      AV91TFLb_FechaE = GXutil.nullDate() ;
      AV143TFLb_Rb = DecimalUtil.ZERO ;
      AV144TFLb_Rb_To = DecimalUtil.ZERO ;
      AV133TFLb_obsLb = "" ;
      AV134TFLb_obsLb_Sel = "" ;
      AV239Pgmname = "" ;
      A5555Lb_opcion = "" ;
      A5563Lb_FechaR = GXutil.nullDate() ;
      A5567Lb_FechaEn = GXutil.nullDate() ;
      A6461Lb_FecNoa1 = GXutil.nullDate() ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV37ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV24DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV30GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV234TFLb_EstEns_SelsJson = "" ;
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
      AV12DDO_Lb_FechaEAuxDate = GXutil.nullDate() ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV232DetailWebComponent = "" ;
      A279CliNom = "" ;
      A5540Lb_Cartaz = "" ;
      A5533Lb_ArtCod = "" ;
      A5538Lb_ColNomC = "" ;
      A5536Lb_ColNom = "" ;
      A5570Lb_Tipo = "" ;
      AV229Lb_opcion = "" ;
      A5701Lb_Local = "" ;
      A5541Lb_FechaE = GXutil.nullDate() ;
      AV34Lb_FechaEn = GXutil.nullDate() ;
      AV35Lb_FechaR = GXutil.nullDate() ;
      AV36Lb_FecNoa1 = GXutil.nullDate() ;
      A396EmprCod = "" ;
      A5547Lb_Rb = DecimalUtil.ZERO ;
      A10883Lb_obsLb = "" ;
      AV260Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      scmdbuf = "" ;
      lV219Lb_Cartaz = "" ;
      lV218Lb_ArtCod = "" ;
      lV223Lb_ColNomC = "" ;
      lV222Lb_ColNom = "" ;
      lV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = "" ;
      lV244Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom = "" ;
      lV246Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz = "" ;
      lV248Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod = "" ;
      lV250Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc = "" ;
      lV252Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom = "" ;
      lV258Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo = "" ;
      lV261Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local = "" ;
      lV266Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb = "" ;
      AV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = "" ;
      AV245Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel = "" ;
      AV244Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom = "" ;
      AV247Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel = "" ;
      AV246Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz = "" ;
      AV249Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel = "" ;
      AV248Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod = "" ;
      AV251Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel = "" ;
      AV250Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc = "" ;
      AV253Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel = "" ;
      AV252Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom = "" ;
      AV259Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel = "" ;
      AV258Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo = "" ;
      AV262Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel = "" ;
      AV261Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local = "" ;
      AV263Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae = GXutil.nullDate() ;
      AV264Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb = DecimalUtil.ZERO ;
      AV265Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to = DecimalUtil.ZERO ;
      AV267Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel = "" ;
      AV266Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb = "" ;
      A5594Lb_cartazf = GXutil.nullDate() ;
      H01U82_A5532Lb_numero = new int[1] ;
      H01U82_A396EmprCod = new String[] {""} ;
      H01U82_A5594Lb_cartazf = new java.util.Date[] {GXutil.nullDate()} ;
      H01U82_A252CliCod = new int[1] ;
      H01U82_A10883Lb_obsLb = new String[] {""} ;
      H01U82_A5547Lb_Rb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01U82_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      H01U82_A5701Lb_Local = new String[] {""} ;
      H01U82_A5569Lb_EstEns = new byte[1] ;
      H01U82_A5570Lb_Tipo = new String[] {""} ;
      H01U82_A5537Lb_ColNum = new int[1] ;
      H01U82_A5536Lb_ColNom = new String[] {""} ;
      H01U82_A5538Lb_ColNomC = new String[] {""} ;
      H01U82_A5533Lb_ArtCod = new String[] {""} ;
      H01U82_A5540Lb_Cartaz = new String[] {""} ;
      H01U82_A279CliNom = new String[] {""} ;
      H01U83_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV240Station = "" ;
      AV241Emprnom = "" ;
      AV242Usurcod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV216WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV44Session = httpContext.getWebSession();
      AV7ColumnsSelectorXML = "" ;
      H01U84_A396EmprCod = new String[] {""} ;
      H01U84_A5532Lb_numero = new int[1] ;
      H01U84_A5563Lb_FechaR = new java.util.Date[] {GXutil.nullDate()} ;
      H01U84_A5555Lb_opcion = new String[] {""} ;
      H01U85_A396EmprCod = new String[] {""} ;
      H01U85_A5532Lb_numero = new int[1] ;
      H01U85_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      H01U85_A5555Lb_opcion = new String[] {""} ;
      H01U86_A396EmprCod = new String[] {""} ;
      H01U86_A5532Lb_numero = new int[1] ;
      H01U86_A5563Lb_FechaR = new java.util.Date[] {GXutil.nullDate()} ;
      H01U86_A5555Lb_opcion = new String[] {""} ;
      H01U87_A396EmprCod = new String[] {""} ;
      H01U87_A5532Lb_numero = new int[1] ;
      H01U87_A6461Lb_FecNoa1 = new java.util.Date[] {GXutil.nullDate()} ;
      H01U87_A5555Lb_opcion = new String[] {""} ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV39ManageFiltersXml = "" ;
      AV26ExcelFilename = "" ;
      AV25ErrorMessage = "" ;
      AV215UserCustomValue = "" ;
      AV6ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11 = new GXBaseCollection[1] ;
      AV31GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char22 = "" ;
      GXv_char23 = new String[1] ;
      GXt_char20 = "" ;
      GXv_char21 = new String[1] ;
      GXt_char18 = "" ;
      GXv_char19 = new String[1] ;
      GXt_char16 = "" ;
      GXv_char17 = new String[1] ;
      GXt_char14 = "" ;
      GXv_char15 = new String[1] ;
      GXt_char13 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char12 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState24 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV213TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV32HTTPRequest = httpContext.getHttpRequest();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV230Emprcod = "" ;
      sCtrlAV217CliCod = "" ;
      sCtrlAV218Lb_ArtCod = "" ;
      sCtrlAV228Lb_numero = "" ;
      sCtrlAV231Lb_EstEns = "" ;
      sCtrlAV226Lb_FechaEfrom = "" ;
      sCtrlAV227Lb_FechaEto = "" ;
      sCtrlAV219Lb_Cartaz = "" ;
      sCtrlAV220Lb_cartazffrom = "" ;
      sCtrlAV221Lb_cartazfto = "" ;
      sCtrlAV222Lb_ColNom = "" ;
      sCtrlAV224Lb_ColNum = "" ;
      sCtrlAV223Lb_ColNomC = "" ;
      sCtrlAV233Lb_Tipo = "" ;
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.consultasituacioncoleccion_wc__default(),
         new Object[] {
             new Object[] {
            H01U82_A5532Lb_numero, H01U82_A396EmprCod, H01U82_A5594Lb_cartazf, H01U82_A252CliCod, H01U82_A10883Lb_obsLb, H01U82_A5547Lb_Rb, H01U82_A5541Lb_FechaE, H01U82_A5701Lb_Local, H01U82_A5569Lb_EstEns, H01U82_A5570Lb_Tipo,
            H01U82_A5537Lb_ColNum, H01U82_A5536Lb_ColNom, H01U82_A5538Lb_ColNomC, H01U82_A5533Lb_ArtCod, H01U82_A5540Lb_Cartaz, H01U82_A279CliNom
            }
            , new Object[] {
            H01U83_AGRID_nRecordCount
            }
            , new Object[] {
            H01U84_A396EmprCod, H01U84_A5532Lb_numero, H01U84_A5563Lb_FechaR, H01U84_A5555Lb_opcion
            }
            , new Object[] {
            H01U85_A396EmprCod, H01U85_A5532Lb_numero, H01U85_A5567Lb_FechaEn, H01U85_A5555Lb_opcion
            }
            , new Object[] {
            H01U86_A396EmprCod, H01U86_A5532Lb_numero, H01U86_A5563Lb_FechaR, H01U86_A5555Lb_opcion
            }
            , new Object[] {
            H01U87_A396EmprCod, H01U87_A5532Lb_numero, H01U87_A6461Lb_FecNoa1, H01U87_A5555Lb_opcion
            }
         }
      );
      AV239Pgmname = "GestionLaboratorio.ConsultaSituacionColeccion_WC" ;
      /* GeneXus formulas. */
      AV239Pgmname = "GestionLaboratorio.ConsultaSituacionColeccion_WC" ;
      Gx_err = (short)(0) ;
      edtavDetailwebcomponent_Enabled = 0 ;
      edtavLb_opcion_Enabled = 0 ;
      edtavLb_fechaen_Enabled = 0 ;
      edtavLb_fechar_Enabled = 0 ;
      edtavLb_fecnoa1_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
      WebComp_Grid_dwc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte wcpOAV231Lb_EstEns ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV231Lb_EstEns ;
   private byte AV38ManageFiltersExecutionStep ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte A5569Lb_EstEns ;
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
   private short nRcdExists_6 ;
   private short nIsMod_6 ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV40OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV236GridActionGroup1 ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV217CliCod ;
   private int wcpOAV228Lb_numero ;
   private int wcpOAV224Lb_ColNum ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_41 ;
   private int AV217CliCod ;
   private int AV228Lb_numero ;
   private int AV224Lb_ColNum ;
   private int nGXsfl_41_idx=1 ;
   private int AV79TFLb_ColNum ;
   private int AV80TFLb_ColNum_To ;
   private int AV125TFLb_numero ;
   private int AV126TFLb_numero_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavPgmname_Enabled ;
   private int A5537Lb_ColNum ;
   private int A5532Lb_numero ;
   private int subGrid_Islastpage ;
   private int edtavDetailwebcomponent_Enabled ;
   private int edtavLb_opcion_Enabled ;
   private int edtavLb_fechaen_Enabled ;
   private int edtavLb_fechar_Enabled ;
   private int edtavLb_fecnoa1_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV260Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels_size ;
   private int AV254Gestionlaboratorio_consultasituacioncoleccion_wcds_12_tflb_colnum ;
   private int AV255Gestionlaboratorio_consultasituacioncoleccion_wcds_13_tflb_colnum_to ;
   private int AV256Gestionlaboratorio_consultasituacioncoleccion_wcds_14_tflb_numero ;
   private int AV257Gestionlaboratorio_consultasituacioncoleccion_wcds_15_tflb_numero_to ;
   private int A252CliCod ;
   private int edtCliNom_Visible ;
   private int edtLb_Cartaz_Visible ;
   private int edtLb_ArtCod_Visible ;
   private int edtLb_ColNomC_Visible ;
   private int edtLb_ColNom_Visible ;
   private int edtLb_ColNum_Visible ;
   private int edtLb_numero_Visible ;
   private int edtLb_Tipo_Visible ;
   private int edtavLb_opcion_Visible ;
   private int edtLb_Local_Visible ;
   private int edtLb_FechaE_Visible ;
   private int edtavLb_fechaen_Visible ;
   private int edtavLb_fechar_Visible ;
   private int edtavLb_fecnoa1_Visible ;
   private int edtLb_Rb_Visible ;
   private int edtLb_obsLb_Visible ;
   private int AV43PageToGo ;
   private int AV272GXV1 ;
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
   private long AV28GridCurrentPage ;
   private long AV29GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV143TFLb_Rb ;
   private java.math.BigDecimal AV144TFLb_Rb_To ;
   private java.math.BigDecimal A5547Lb_Rb ;
   private java.math.BigDecimal AV264Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb ;
   private java.math.BigDecimal AV265Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to ;
   private String wcpOAV230Emprcod ;
   private String wcpOAV218Lb_ArtCod ;
   private String wcpOAV219Lb_Cartaz ;
   private String wcpOAV222Lb_ColNom ;
   private String wcpOAV223Lb_ColNomC ;
   private String wcpOAV233Lb_Tipo ;
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
   private String AV230Emprcod ;
   private String AV218Lb_ArtCod ;
   private String AV219Lb_Cartaz ;
   private String AV222Lb_ColNom ;
   private String AV223Lb_ColNomC ;
   private String AV233Lb_Tipo ;
   private String sGXsfl_41_idx="0001" ;
   private String AV47TFCliNom ;
   private String AV48TFCliNom_Sel ;
   private String AV71TFLb_Cartaz ;
   private String AV72TFLb_Cartaz_Sel ;
   private String AV67TFLb_ArtCod ;
   private String AV68TFLb_ArtCod_Sel ;
   private String AV77TFLb_ColNomC ;
   private String AV78TFLb_ColNomC_Sel ;
   private String AV75TFLb_ColNom ;
   private String AV76TFLb_ColNom_Sel ;
   private String AV161TFLb_Tipo ;
   private String AV162TFLb_Tipo_Sel ;
   private String AV109TFLb_Local ;
   private String AV110TFLb_Local_Sel ;
   private String AV239Pgmname ;
   private String A5555Lb_opcion ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
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
   private String divDdo_lb_fechaeauxdates_Internalname ;
   private String edtavDdo_lb_fechaeauxdate_Internalname ;
   private String edtavDdo_lb_fechaeauxdate_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV232DetailWebComponent ;
   private String edtavDetailwebcomponent_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Internalname ;
   private String A5540Lb_Cartaz ;
   private String edtLb_Cartaz_Internalname ;
   private String A5533Lb_ArtCod ;
   private String edtLb_ArtCod_Internalname ;
   private String A5538Lb_ColNomC ;
   private String edtLb_ColNomC_Internalname ;
   private String A5536Lb_ColNom ;
   private String edtLb_ColNom_Internalname ;
   private String edtLb_ColNum_Internalname ;
   private String edtLb_numero_Internalname ;
   private String A5570Lb_Tipo ;
   private String edtLb_Tipo_Internalname ;
   private String AV229Lb_opcion ;
   private String edtavLb_opcion_Internalname ;
   private String A5701Lb_Local ;
   private String edtLb_Local_Internalname ;
   private String edtLb_FechaE_Internalname ;
   private String edtavLb_fechaen_Internalname ;
   private String edtavLb_fechar_Internalname ;
   private String edtavLb_fecnoa1_Internalname ;
   private String A396EmprCod ;
   private String edtEmprCod_Internalname ;
   private String edtLb_Rb_Internalname ;
   private String edtLb_obsLb_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String scmdbuf ;
   private String lV219Lb_Cartaz ;
   private String lV218Lb_ArtCod ;
   private String lV223Lb_ColNomC ;
   private String lV222Lb_ColNom ;
   private String lV244Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom ;
   private String lV246Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz ;
   private String lV248Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod ;
   private String lV250Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc ;
   private String lV252Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom ;
   private String lV258Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo ;
   private String lV261Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local ;
   private String AV245Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel ;
   private String AV244Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom ;
   private String AV247Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel ;
   private String AV246Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz ;
   private String AV249Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel ;
   private String AV248Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod ;
   private String AV251Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel ;
   private String AV250Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc ;
   private String AV253Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel ;
   private String AV252Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom ;
   private String AV259Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel ;
   private String AV258Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo ;
   private String AV262Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel ;
   private String AV261Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local ;
   private String hsh ;
   private String AV240Station ;
   private String AV241Emprnom ;
   private String AV242Usurcod ;
   private String edtavDetailwebcomponent_Columnheaderclass ;
   private String edtCliNom_Columnheaderclass ;
   private String edtLb_Cartaz_Columnheaderclass ;
   private String edtLb_ArtCod_Columnheaderclass ;
   private String edtLb_ColNomC_Columnheaderclass ;
   private String edtLb_ColNom_Columnheaderclass ;
   private String edtLb_ColNum_Columnheaderclass ;
   private String edtLb_numero_Columnheaderclass ;
   private String edtLb_Tipo_Columnheaderclass ;
   private String edtavLb_opcion_Columnheaderclass ;
   private String edtLb_Local_Columnheaderclass ;
   private String edtLb_FechaE_Columnheaderclass ;
   private String edtavLb_fechaen_Columnheaderclass ;
   private String edtavLb_fechar_Columnheaderclass ;
   private String edtavLb_fecnoa1_Columnheaderclass ;
   private String edtLb_Rb_Columnheaderclass ;
   private String edtLb_obsLb_Columnheaderclass ;
   private String edtavDetailwebcomponent_Columnclass ;
   private String edtCliNom_Columnclass ;
   private String edtLb_Cartaz_Columnclass ;
   private String edtLb_ArtCod_Columnclass ;
   private String edtLb_ColNomC_Columnclass ;
   private String edtLb_ColNom_Columnclass ;
   private String edtLb_ColNum_Columnclass ;
   private String edtLb_numero_Columnclass ;
   private String edtLb_Tipo_Columnclass ;
   private String edtavLb_opcion_Columnclass ;
   private String edtLb_Local_Columnclass ;
   private String edtLb_FechaE_Columnclass ;
   private String edtavLb_fechaen_Columnclass ;
   private String edtavLb_fechar_Columnclass ;
   private String edtavLb_fecnoa1_Columnclass ;
   private String edtLb_Rb_Columnclass ;
   private String edtLb_obsLb_Columnclass ;
   private String GXt_char22 ;
   private String GXv_char23[] ;
   private String GXt_char20 ;
   private String GXv_char21[] ;
   private String GXt_char18 ;
   private String GXv_char19[] ;
   private String GXt_char16 ;
   private String GXv_char17[] ;
   private String GXt_char14 ;
   private String GXv_char15[] ;
   private String GXt_char13 ;
   private String GXv_char4[] ;
   private String GXt_char12 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV230Emprcod ;
   private String sCtrlAV217CliCod ;
   private String sCtrlAV218Lb_ArtCod ;
   private String sCtrlAV228Lb_numero ;
   private String sCtrlAV231Lb_EstEns ;
   private String sCtrlAV226Lb_FechaEfrom ;
   private String sCtrlAV227Lb_FechaEto ;
   private String sCtrlAV219Lb_Cartaz ;
   private String sCtrlAV220Lb_cartazffrom ;
   private String sCtrlAV221Lb_cartazfto ;
   private String sCtrlAV222Lb_ColNom ;
   private String sCtrlAV224Lb_ColNum ;
   private String sCtrlAV223Lb_ColNomC ;
   private String sCtrlAV233Lb_Tipo ;
   private String sGXsfl_41_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtavDetailwebcomponent_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtLb_Cartaz_Jsonclick ;
   private String edtLb_ArtCod_Jsonclick ;
   private String edtLb_ColNomC_Jsonclick ;
   private String edtLb_ColNom_Jsonclick ;
   private String edtLb_ColNum_Jsonclick ;
   private String edtLb_numero_Jsonclick ;
   private String edtLb_Tipo_Jsonclick ;
   private String edtavLb_opcion_Jsonclick ;
   private String edtLb_Local_Jsonclick ;
   private String edtLb_FechaE_Jsonclick ;
   private String edtavLb_fechaen_Jsonclick ;
   private String edtavLb_fechar_Jsonclick ;
   private String edtavLb_fecnoa1_Jsonclick ;
   private String edtEmprCod_Jsonclick ;
   private String edtLb_Rb_Jsonclick ;
   private String edtLb_obsLb_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV226Lb_FechaEfrom ;
   private java.util.Date wcpOAV227Lb_FechaEto ;
   private java.util.Date wcpOAV220Lb_cartazffrom ;
   private java.util.Date wcpOAV221Lb_cartazfto ;
   private java.util.Date AV226Lb_FechaEfrom ;
   private java.util.Date AV227Lb_FechaEto ;
   private java.util.Date AV220Lb_cartazffrom ;
   private java.util.Date AV221Lb_cartazfto ;
   private java.util.Date AV91TFLb_FechaE ;
   private java.util.Date A5563Lb_FechaR ;
   private java.util.Date A5567Lb_FechaEn ;
   private java.util.Date A6461Lb_FecNoa1 ;
   private java.util.Date AV12DDO_Lb_FechaEAuxDate ;
   private java.util.Date A5541Lb_FechaE ;
   private java.util.Date AV34Lb_FechaEn ;
   private java.util.Date AV35Lb_FechaR ;
   private java.util.Date AV36Lb_FecNoa1 ;
   private java.util.Date AV263Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae ;
   private java.util.Date A5594Lb_cartazf ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV42OrderedDsc ;
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
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV234TFLb_EstEns_SelsJson ;
   private String AV7ColumnsSelectorXML ;
   private String AV39ManageFiltersXml ;
   private String AV215UserCustomValue ;
   private String AV27FilterFullText ;
   private String AV133TFLb_obsLb ;
   private String AV134TFLb_obsLb_Sel ;
   private String A10883Lb_obsLb ;
   private String lV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext ;
   private String lV266Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb ;
   private String AV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext ;
   private String AV267Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel ;
   private String AV266Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb ;
   private String AV26ExcelFilename ;
   private String AV25ErrorMessage ;
   private GXSimpleCollection<Byte> AV260Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels ;
   private GXSimpleCollection<Byte> AV235TFLb_EstEns_Sels ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Grid_dwc ;
   private com.genexus.internet.HttpRequest AV32HTTPRequest ;
   private com.genexus.webpanels.WebSession AV44Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_titlescategories ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavGridactiongroup1 ;
   private HTMLChoice cmbLb_EstEns ;
   private IDataStoreProvider pr_default ;
   private int[] H01U82_A5532Lb_numero ;
   private String[] H01U82_A396EmprCod ;
   private java.util.Date[] H01U82_A5594Lb_cartazf ;
   private int[] H01U82_A252CliCod ;
   private String[] H01U82_A10883Lb_obsLb ;
   private java.math.BigDecimal[] H01U82_A5547Lb_Rb ;
   private java.util.Date[] H01U82_A5541Lb_FechaE ;
   private String[] H01U82_A5701Lb_Local ;
   private byte[] H01U82_A5569Lb_EstEns ;
   private String[] H01U82_A5570Lb_Tipo ;
   private int[] H01U82_A5537Lb_ColNum ;
   private String[] H01U82_A5536Lb_ColNom ;
   private String[] H01U82_A5538Lb_ColNomC ;
   private String[] H01U82_A5533Lb_ArtCod ;
   private String[] H01U82_A5540Lb_Cartaz ;
   private String[] H01U82_A279CliNom ;
   private long[] H01U83_AGRID_nRecordCount ;
   private String[] H01U84_A396EmprCod ;
   private int[] H01U84_A5532Lb_numero ;
   private java.util.Date[] H01U84_A5563Lb_FechaR ;
   private String[] H01U84_A5555Lb_opcion ;
   private String[] H01U85_A396EmprCod ;
   private int[] H01U85_A5532Lb_numero ;
   private java.util.Date[] H01U85_A5567Lb_FechaEn ;
   private String[] H01U85_A5555Lb_opcion ;
   private String[] H01U86_A396EmprCod ;
   private int[] H01U86_A5532Lb_numero ;
   private java.util.Date[] H01U86_A5563Lb_FechaR ;
   private String[] H01U86_A5555Lb_opcion ;
   private String[] H01U87_A396EmprCod ;
   private int[] H01U87_A5532Lb_numero ;
   private java.util.Date[] H01U87_A6461Lb_FecNoa1 ;
   private String[] H01U87_A5555Lb_opcion ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV37ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV5ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV6ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV24DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV30GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState24[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV31GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV213TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV216WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
}

final  class consultasituacioncoleccion_wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01U82( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5569Lb_EstEns ,
                                          GXSimpleCollection<Byte> AV260Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels ,
                                          String AV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext ,
                                          String AV245Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel ,
                                          String AV244Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom ,
                                          String AV247Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel ,
                                          String AV246Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz ,
                                          String AV249Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel ,
                                          String AV248Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod ,
                                          String AV251Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel ,
                                          String AV250Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc ,
                                          String AV253Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel ,
                                          String AV252Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom ,
                                          int AV254Gestionlaboratorio_consultasituacioncoleccion_wcds_12_tflb_colnum ,
                                          int AV255Gestionlaboratorio_consultasituacioncoleccion_wcds_13_tflb_colnum_to ,
                                          int AV256Gestionlaboratorio_consultasituacioncoleccion_wcds_14_tflb_numero ,
                                          int AV257Gestionlaboratorio_consultasituacioncoleccion_wcds_15_tflb_numero_to ,
                                          String AV259Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel ,
                                          String AV258Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo ,
                                          int AV260Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels_size ,
                                          String AV262Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel ,
                                          String AV261Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local ,
                                          java.util.Date AV263Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae ,
                                          java.math.BigDecimal AV264Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb ,
                                          java.math.BigDecimal AV265Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to ,
                                          String AV267Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel ,
                                          String AV266Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb ,
                                          int AV217CliCod ,
                                          int AV228Lb_numero ,
                                          java.util.Date AV220Lb_cartazffrom ,
                                          java.util.Date AV221Lb_cartazfto ,
                                          java.util.Date AV226Lb_FechaEfrom ,
                                          java.util.Date AV227Lb_FechaEto ,
                                          int AV224Lb_ColNum ,
                                          String A279CliNom ,
                                          String A5540Lb_Cartaz ,
                                          String A5533Lb_ArtCod ,
                                          String A5538Lb_ColNomC ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          int A5532Lb_numero ,
                                          String A5570Lb_Tipo ,
                                          String A5701Lb_Local ,
                                          java.math.BigDecimal A5547Lb_Rb ,
                                          String A10883Lb_obsLb ,
                                          java.util.Date A5541Lb_FechaE ,
                                          int A252CliCod ,
                                          java.util.Date A5594Lb_cartazf ,
                                          short AV40OrderedBy ,
                                          boolean AV42OrderedDsc ,
                                          String AV219Lb_Cartaz ,
                                          String AV218Lb_ArtCod ,
                                          String AV223Lb_ColNomC ,
                                          String AV222Lb_ColNom ,
                                          byte AV231Lb_EstEns ,
                                          String AV233Lb_Tipo ,
                                          String AV230Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int25 = new byte[60];
      Object[] GXv_Object26 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.Lb_numero, T1.EmprCod, T1.Lb_cartazf, T1.CliCod, T1.Lb_obsLb, T1.Lb_Rb, T1.Lb_FechaE, T1.Lb_Local, T1.Lb_EstEns, T1.Lb_Tipo, T1.Lb_ColNum, T1.Lb_ColNom, T1.Lb_ColNomC," ;
      sSelectString += " T1.Lb_ArtCod, T1.Lb_Cartaz, T2.CliNom" ;
      sFromString = " FROM (TXPENS001 T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.Lb_Cartaz like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.Lb_ArtCod like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.Lb_ColNomC like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.Lb_ColNom like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.Lb_EstEns = ? or ? = 9)");
      addWhere(sWhereString, "(T1.Lb_Tipo = ? or ? = '*')");
      if ( ! (GXutil.strcmp("", AV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.Lb_Cartaz) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNomC) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_Tipo) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_EstEns,'90'), 2) like '%' || ?) or ( UPPER(T1.Lb_Local) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_Rb,'9990.99'), 2) like '%' || ?) or ( UPPER(T1.Lb_obsLb) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int25[13] = (byte)(1) ;
         GXv_int25[14] = (byte)(1) ;
         GXv_int25[15] = (byte)(1) ;
         GXv_int25[16] = (byte)(1) ;
         GXv_int25[17] = (byte)(1) ;
         GXv_int25[18] = (byte)(1) ;
         GXv_int25[19] = (byte)(1) ;
         GXv_int25[20] = (byte)(1) ;
         GXv_int25[21] = (byte)(1) ;
         GXv_int25[22] = (byte)(1) ;
         GXv_int25[23] = (byte)(1) ;
         GXv_int25[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV245Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV244Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV245Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int25[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV247Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV246Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV247Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int25[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV249Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV248Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV249Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int25[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV251Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel)==0) && ( ! (GXutil.strcmp("", AV250Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNomC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV251Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNomC = ?)");
      }
      else
      {
         GXv_int25[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV253Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV252Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV253Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int25[34] = (byte)(1) ;
      }
      if ( ! (0==AV254Gestionlaboratorio_consultasituacioncoleccion_wcds_12_tflb_colnum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int25[35] = (byte)(1) ;
      }
      if ( ! (0==AV255Gestionlaboratorio_consultasituacioncoleccion_wcds_13_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int25[36] = (byte)(1) ;
      }
      if ( ! (0==AV256Gestionlaboratorio_consultasituacioncoleccion_wcds_14_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int25[37] = (byte)(1) ;
      }
      if ( ! (0==AV257Gestionlaboratorio_consultasituacioncoleccion_wcds_15_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int25[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV259Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel)==0) && ( ! (GXutil.strcmp("", AV258Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Tipo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV259Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Tipo = ?)");
      }
      else
      {
         GXv_int25[40] = (byte)(1) ;
      }
      if ( AV260Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV260Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels, "T1.Lb_EstEns IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV262Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel)==0) && ( ! (GXutil.strcmp("", AV261Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Local) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV262Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Local = ?)");
      }
      else
      {
         GXv_int25[42] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV263Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int25[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV264Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Rb >= ?)");
      }
      else
      {
         GXv_int25[44] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV265Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Rb <= ?)");
      }
      else
      {
         GXv_int25[45] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV267Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel)==0) && ( ! (GXutil.strcmp("", AV266Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_obsLb) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[46] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV267Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_obsLb = ?)");
      }
      else
      {
         GXv_int25[47] = (byte)(1) ;
      }
      if ( ! (0==AV217CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int25[48] = (byte)(1) ;
      }
      if ( ! (0==AV228Lb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero = ?)");
      }
      else
      {
         GXv_int25[49] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV220Lb_cartazffrom)) )
      {
         addWhere(sWhereString, "(T1.Lb_cartazf >= ?)");
      }
      else
      {
         GXv_int25[50] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV221Lb_cartazfto)) )
      {
         addWhere(sWhereString, "(T1.Lb_cartazf <= ?)");
      }
      else
      {
         GXv_int25[51] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV226Lb_FechaEfrom)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int25[52] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV227Lb_FechaEto)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE <= ?)");
      }
      else
      {
         GXv_int25[53] = (byte)(1) ;
      }
      if ( ! (0==AV224Lb_ColNum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum = ?)");
      }
      else
      {
         GXv_int25[54] = (byte)(1) ;
      }
      if ( ( AV40OrderedBy == 1 ) && ! AV42OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_FechaE" ;
      }
      else if ( ( AV40OrderedBy == 1 ) && ( AV42OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_FechaE DESC" ;
      }
      else if ( AV40OrderedBy == 2 )
      {
         sOrderString += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV40OrderedBy == 3 ) && ! AV42OrderedDsc )
      {
         sOrderString += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV40OrderedBy == 3 ) && ( AV42OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV40OrderedBy == 4 ) && ! AV42OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_Cartaz" ;
      }
      else if ( ( AV40OrderedBy == 4 ) && ( AV42OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_Cartaz DESC" ;
      }
      else if ( ( AV40OrderedBy == 5 ) && ! AV42OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_ArtCod" ;
      }
      else if ( ( AV40OrderedBy == 5 ) && ( AV42OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_ArtCod DESC" ;
      }
      else if ( ( AV40OrderedBy == 6 ) && ! AV42OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_ColNomC" ;
      }
      else if ( ( AV40OrderedBy == 6 ) && ( AV42OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_ColNomC DESC" ;
      }
      else if ( ( AV40OrderedBy == 7 ) && ! AV42OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_ColNom" ;
      }
      else if ( ( AV40OrderedBy == 7 ) && ( AV42OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_ColNom DESC" ;
      }
      else if ( ( AV40OrderedBy == 8 ) && ! AV42OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_ColNum" ;
      }
      else if ( ( AV40OrderedBy == 8 ) && ( AV42OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_ColNum DESC" ;
      }
      else if ( ( AV40OrderedBy == 9 ) && ! AV42OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_numero" ;
      }
      else if ( ( AV40OrderedBy == 9 ) && ( AV42OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_numero DESC" ;
      }
      else if ( ( AV40OrderedBy == 10 ) && ! AV42OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_Tipo" ;
      }
      else if ( ( AV40OrderedBy == 10 ) && ( AV42OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_Tipo DESC" ;
      }
      else if ( ( AV40OrderedBy == 11 ) && ! AV42OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_EstEns" ;
      }
      else if ( ( AV40OrderedBy == 11 ) && ( AV42OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_EstEns DESC" ;
      }
      else if ( ( AV40OrderedBy == 12 ) && ! AV42OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_Local" ;
      }
      else if ( ( AV40OrderedBy == 12 ) && ( AV42OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_Local DESC" ;
      }
      else if ( ( AV40OrderedBy == 13 ) && ! AV42OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_Rb" ;
      }
      else if ( ( AV40OrderedBy == 13 ) && ( AV42OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_Rb DESC" ;
      }
      else if ( ( AV40OrderedBy == 14 ) && ! AV42OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_obsLb" ;
      }
      else if ( ( AV40OrderedBy == 14 ) && ( AV42OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_obsLb DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.Lb_numero" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object26[0] = scmdbuf ;
      GXv_Object26[1] = GXv_int25 ;
      return GXv_Object26 ;
   }

   protected Object[] conditional_H01U83( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5569Lb_EstEns ,
                                          GXSimpleCollection<Byte> AV260Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels ,
                                          String AV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext ,
                                          String AV245Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel ,
                                          String AV244Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom ,
                                          String AV247Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel ,
                                          String AV246Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz ,
                                          String AV249Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel ,
                                          String AV248Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod ,
                                          String AV251Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel ,
                                          String AV250Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc ,
                                          String AV253Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel ,
                                          String AV252Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom ,
                                          int AV254Gestionlaboratorio_consultasituacioncoleccion_wcds_12_tflb_colnum ,
                                          int AV255Gestionlaboratorio_consultasituacioncoleccion_wcds_13_tflb_colnum_to ,
                                          int AV256Gestionlaboratorio_consultasituacioncoleccion_wcds_14_tflb_numero ,
                                          int AV257Gestionlaboratorio_consultasituacioncoleccion_wcds_15_tflb_numero_to ,
                                          String AV259Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel ,
                                          String AV258Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo ,
                                          int AV260Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels_size ,
                                          String AV262Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel ,
                                          String AV261Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local ,
                                          java.util.Date AV263Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae ,
                                          java.math.BigDecimal AV264Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb ,
                                          java.math.BigDecimal AV265Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to ,
                                          String AV267Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel ,
                                          String AV266Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb ,
                                          int AV217CliCod ,
                                          int AV228Lb_numero ,
                                          java.util.Date AV220Lb_cartazffrom ,
                                          java.util.Date AV221Lb_cartazfto ,
                                          java.util.Date AV226Lb_FechaEfrom ,
                                          java.util.Date AV227Lb_FechaEto ,
                                          int AV224Lb_ColNum ,
                                          String A279CliNom ,
                                          String A5540Lb_Cartaz ,
                                          String A5533Lb_ArtCod ,
                                          String A5538Lb_ColNomC ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          int A5532Lb_numero ,
                                          String A5570Lb_Tipo ,
                                          String A5701Lb_Local ,
                                          java.math.BigDecimal A5547Lb_Rb ,
                                          String A10883Lb_obsLb ,
                                          java.util.Date A5541Lb_FechaE ,
                                          int A252CliCod ,
                                          java.util.Date A5594Lb_cartazf ,
                                          short AV40OrderedBy ,
                                          boolean AV42OrderedDsc ,
                                          String AV219Lb_Cartaz ,
                                          String AV218Lb_ArtCod ,
                                          String AV223Lb_ColNomC ,
                                          String AV222Lb_ColNom ,
                                          byte AV231Lb_EstEns ,
                                          String AV233Lb_Tipo ,
                                          String AV230Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int28 = new byte[57];
      Object[] GXv_Object29 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPENS001 T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.Lb_Cartaz like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.Lb_ArtCod like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.Lb_ColNomC like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.Lb_ColNom like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.Lb_EstEns = ? or ? = 9)");
      addWhere(sWhereString, "(T1.Lb_ColNom like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.Lb_Tipo = ? or ? = '*')");
      if ( ! (GXutil.strcmp("", AV243Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.Lb_Cartaz) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNomC) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_Tipo) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_EstEns,'90'), 2) like '%' || ?) or ( UPPER(T1.Lb_Local) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_Rb,'9990.99'), 2) like '%' || ?) or ( UPPER(T1.Lb_obsLb) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int28[15] = (byte)(1) ;
         GXv_int28[16] = (byte)(1) ;
         GXv_int28[17] = (byte)(1) ;
         GXv_int28[18] = (byte)(1) ;
         GXv_int28[19] = (byte)(1) ;
         GXv_int28[20] = (byte)(1) ;
         GXv_int28[21] = (byte)(1) ;
         GXv_int28[22] = (byte)(1) ;
         GXv_int28[23] = (byte)(1) ;
         GXv_int28[24] = (byte)(1) ;
         GXv_int28[25] = (byte)(1) ;
         GXv_int28[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV245Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV244Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV245Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int28[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV247Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV246Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV247Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int28[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV249Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV248Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV249Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int28[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV251Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel)==0) && ( ! (GXutil.strcmp("", AV250Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNomC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV251Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNomC = ?)");
      }
      else
      {
         GXv_int28[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV253Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV252Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV253Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int28[36] = (byte)(1) ;
      }
      if ( ! (0==AV254Gestionlaboratorio_consultasituacioncoleccion_wcds_12_tflb_colnum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int28[37] = (byte)(1) ;
      }
      if ( ! (0==AV255Gestionlaboratorio_consultasituacioncoleccion_wcds_13_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int28[38] = (byte)(1) ;
      }
      if ( ! (0==AV256Gestionlaboratorio_consultasituacioncoleccion_wcds_14_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int28[39] = (byte)(1) ;
      }
      if ( ! (0==AV257Gestionlaboratorio_consultasituacioncoleccion_wcds_15_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int28[40] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV259Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel)==0) && ( ! (GXutil.strcmp("", AV258Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Tipo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV259Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Tipo = ?)");
      }
      else
      {
         GXv_int28[42] = (byte)(1) ;
      }
      if ( AV260Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV260Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels, "T1.Lb_EstEns IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV262Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel)==0) && ( ! (GXutil.strcmp("", AV261Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Local) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV262Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Local = ?)");
      }
      else
      {
         GXv_int28[44] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV263Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int28[45] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV264Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Rb >= ?)");
      }
      else
      {
         GXv_int28[46] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV265Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Rb <= ?)");
      }
      else
      {
         GXv_int28[47] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV267Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel)==0) && ( ! (GXutil.strcmp("", AV266Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_obsLb) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[48] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV267Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_obsLb = ?)");
      }
      else
      {
         GXv_int28[49] = (byte)(1) ;
      }
      if ( ! (0==AV217CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int28[50] = (byte)(1) ;
      }
      if ( ! (0==AV228Lb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero = ?)");
      }
      else
      {
         GXv_int28[51] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV220Lb_cartazffrom)) )
      {
         addWhere(sWhereString, "(T1.Lb_cartazf >= ?)");
      }
      else
      {
         GXv_int28[52] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV221Lb_cartazfto)) )
      {
         addWhere(sWhereString, "(T1.Lb_cartazf <= ?)");
      }
      else
      {
         GXv_int28[53] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV226Lb_FechaEfrom)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int28[54] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV227Lb_FechaEto)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE <= ?)");
      }
      else
      {
         GXv_int28[55] = (byte)(1) ;
      }
      if ( ! (0==AV224Lb_ColNum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum = ?)");
      }
      else
      {
         GXv_int28[56] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV40OrderedBy == 1 ) && ! AV42OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV40OrderedBy == 1 ) && ( AV42OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( AV40OrderedBy == 2 )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV40OrderedBy == 3 ) && ! AV42OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV40OrderedBy == 3 ) && ( AV42OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV40OrderedBy == 4 ) && ! AV42OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV40OrderedBy == 4 ) && ( AV42OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV40OrderedBy == 5 ) && ! AV42OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV40OrderedBy == 5 ) && ( AV42OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV40OrderedBy == 6 ) && ! AV42OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV40OrderedBy == 6 ) && ( AV42OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV40OrderedBy == 7 ) && ! AV42OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV40OrderedBy == 7 ) && ( AV42OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV40OrderedBy == 8 ) && ! AV42OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV40OrderedBy == 8 ) && ( AV42OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV40OrderedBy == 9 ) && ! AV42OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV40OrderedBy == 9 ) && ( AV42OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV40OrderedBy == 10 ) && ! AV42OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV40OrderedBy == 10 ) && ( AV42OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV40OrderedBy == 11 ) && ! AV42OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV40OrderedBy == 11 ) && ( AV42OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV40OrderedBy == 12 ) && ! AV42OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV40OrderedBy == 12 ) && ( AV42OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV40OrderedBy == 13 ) && ! AV42OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV40OrderedBy == 13 ) && ( AV42OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV40OrderedBy == 14 ) && ! AV42OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV40OrderedBy == 14 ) && ( AV42OrderedDsc ) )
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
                  return conditional_H01U82(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (java.util.Date)dynConstraints[29] , (java.util.Date)dynConstraints[30] , (java.util.Date)dynConstraints[31] , (java.util.Date)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (String)dynConstraints[44] , (java.util.Date)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (java.util.Date)dynConstraints[47] , ((Number) dynConstraints[48]).shortValue() , ((Boolean) dynConstraints[49]).booleanValue() , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , ((Number) dynConstraints[54]).byteValue() , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] );
            case 1 :
                  return conditional_H01U83(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (java.util.Date)dynConstraints[29] , (java.util.Date)dynConstraints[30] , (java.util.Date)dynConstraints[31] , (java.util.Date)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (String)dynConstraints[44] , (java.util.Date)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (java.util.Date)dynConstraints[47] , ((Number) dynConstraints[48]).shortValue() , ((Boolean) dynConstraints[49]).booleanValue() , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , ((Number) dynConstraints[54]).byteValue() , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01U82", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01U83", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01U84", "SELECT EmprCod, Lb_numero, Lb_FechaR, Lb_opcion FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero, Lb_opcion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01U85", "SELECT EmprCod, Lb_numero, Lb_FechaEn, Lb_opcion FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero, Lb_opcion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01U86", "SELECT EmprCod, Lb_numero, Lb_FechaR, Lb_opcion FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero, Lb_opcion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01U87", "SELECT EmprCod, Lb_numero, Lb_FecNoa1, Lb_opcion FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero, Lb_opcion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 10);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 13);
               ((String[]) buf[12])[0] = rslt.getString(13, 13);
               ((String[]) buf[13])[0] = rslt.getString(14, 16);
               ((String[]) buf[14])[0] = rslt.getString(15, 20);
               ((String[]) buf[15])[0] = rslt.getString(16, 30);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
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
                  stmt.setString(sIdx, (String)parms[60], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 20);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 20);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 13);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 13);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 13);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 13);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[69]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[70]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 1);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 1);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 30);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 20);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 20);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 16);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 16);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 13);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 13);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[96]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[97]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[98]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 1);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 1);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 10);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 10);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[103]);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[104], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[105], 2);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[106], 300);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[107], 300);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[108]).intValue());
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[109]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[110]);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[111]);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[112]);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[113]);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[114]).intValue());
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[115]).intValue());
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[116]).intValue());
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[117]).intValue());
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[118]).intValue());
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[119]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 20);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 20);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 13);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 13);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 13);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 13);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[66]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[67]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 13);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 20);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 20);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 16);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 16);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 13);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 13);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 13);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[96]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[97]).intValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 1);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 1);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 10);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 10);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[102]);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[103], 2);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[104], 2);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[105], 300);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[106], 300);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[107]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[108]).intValue());
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[109]);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[110]);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[111]);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[112]);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[113]).intValue());
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

