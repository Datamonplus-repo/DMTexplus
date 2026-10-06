package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class listadodeformulas_wc_impl extends GXWebComponent
{
   public listadodeformulas_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public listadodeformulas_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( listadodeformulas_wc_impl.class ));
   }

   public listadodeformulas_wc_impl( int remoteHandle ,
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
      cmbForBlo = new HTMLChoice();
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
               AV170Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV170Emprcod", AV170Emprcod);
               AV171Clicod = (int)(GXutil.lval( httpContext.GetPar( "Clicod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV171Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV171Clicod), 6, 0));
               AV172Clicod_to = (int)(GXutil.lval( httpContext.GetPar( "Clicod_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV172Clicod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV172Clicod_to), 6, 0));
               AV173Forser = httpContext.GetPar( "Forser") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV173Forser", AV173Forser);
               AV174Forser_to = httpContext.GetPar( "Forser_to") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV174Forser_to", AV174Forser_to);
               AV175Forcolnum = (int)(GXutil.lval( httpContext.GetPar( "Forcolnum"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV175Forcolnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV175Forcolnum), 6, 0));
               AV176Forcolnum_to = (int)(GXutil.lval( httpContext.GetPar( "Forcolnum_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV176Forcolnum_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV176Forcolnum_to), 6, 0));
               AV177Forcolnom = httpContext.GetPar( "Forcolnom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV177Forcolnom", AV177Forcolnom);
               AV178Forcolnom_to = httpContext.GetPar( "Forcolnom_to") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV178Forcolnom_to", AV178Forcolnom_to);
               AV179Tipcolcod = (byte)(GXutil.lval( httpContext.GetPar( "Tipcolcod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV179Tipcolcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV179Tipcolcod), 2, 0));
               AV180Tipcolcod_to = (short)(GXutil.lval( httpContext.GetPar( "Tipcolcod_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV180Tipcolcod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV180Tipcolcod_to), 4, 0));
               AV183ForNumColfrom = (int)(GXutil.lval( httpContext.GetPar( "ForNumColfrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV183ForNumColfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV183ForNumColfrom), 8, 0));
               AV184ForNumColto = (int)(GXutil.lval( httpContext.GetPar( "ForNumColto"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV184ForNumColto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV184ForNumColto), 8, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV170Emprcod,Integer.valueOf(AV171Clicod),Integer.valueOf(AV172Clicod_to),AV173Forser,AV174Forser_to,Integer.valueOf(AV175Forcolnum),Integer.valueOf(AV176Forcolnum_to),AV177Forcolnom,AV178Forcolnom_to,Byte.valueOf(AV179Tipcolcod),Short.valueOf(AV180Tipcolcod_to),Integer.valueOf(AV183ForNumColfrom),Integer.valueOf(AV184ForNumColto)});
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
      nRC_GXsfl_47 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_47"))) ;
      nGXsfl_47_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_47_idx"))) ;
      sGXsfl_47_idx = httpContext.GetPar( "sGXsfl_47_idx") ;
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
      AV170Emprcod = httpContext.GetPar( "Emprcod") ;
      AV171Clicod = (int)(GXutil.lval( httpContext.GetPar( "Clicod"))) ;
      AV172Clicod_to = (int)(GXutil.lval( httpContext.GetPar( "Clicod_to"))) ;
      AV173Forser = httpContext.GetPar( "Forser") ;
      AV174Forser_to = httpContext.GetPar( "Forser_to") ;
      AV175Forcolnum = (int)(GXutil.lval( httpContext.GetPar( "Forcolnum"))) ;
      AV176Forcolnum_to = (int)(GXutil.lval( httpContext.GetPar( "Forcolnum_to"))) ;
      AV177Forcolnom = httpContext.GetPar( "Forcolnom") ;
      AV178Forcolnom_to = httpContext.GetPar( "Forcolnom_to") ;
      AV179Tipcolcod = (byte)(GXutil.lval( httpContext.GetPar( "Tipcolcod"))) ;
      AV180Tipcolcod_to = (short)(GXutil.lval( httpContext.GetPar( "Tipcolcod_to"))) ;
      AV183ForNumColfrom = (int)(GXutil.lval( httpContext.GetPar( "ForNumColfrom"))) ;
      AV184ForNumColto = (int)(GXutil.lval( httpContext.GetPar( "ForNumColto"))) ;
      AV25ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV20ColumnsSelector);
      AV15FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV30TFCliCod = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod"))) ;
      AV31TFCliCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod_To"))) ;
      AV32TFCliNom = httpContext.GetPar( "TFCliNom") ;
      AV33TFCliNom_Sel = httpContext.GetPar( "TFCliNom_Sel") ;
      AV34TFForSer = httpContext.GetPar( "TFForSer") ;
      AV35TFForSer_Sel = httpContext.GetPar( "TFForSer_Sel") ;
      AV36TFForSerDsc = httpContext.GetPar( "TFForSerDsc") ;
      AV37TFForSerDsc_Sel = httpContext.GetPar( "TFForSerDsc_Sel") ;
      AV118TFForTipArt = (short)(GXutil.lval( httpContext.GetPar( "TFForTipArt"))) ;
      AV119TFForTipArt_To = (short)(GXutil.lval( httpContext.GetPar( "TFForTipArt_To"))) ;
      AV181TFForTipArtDsc = httpContext.GetPar( "TFForTipArtDsc") ;
      AV182TFForTipArtDsc_Sel = httpContext.GetPar( "TFForTipArtDsc_Sel") ;
      AV38TFForColNom = httpContext.GetPar( "TFForColNom") ;
      AV39TFForColNom_Sel = httpContext.GetPar( "TFForColNom_Sel") ;
      AV40TFForColNum = (int)(GXutil.lval( httpContext.GetPar( "TFForColNum"))) ;
      AV41TFForColNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFForColNum_To"))) ;
      AV42TFTipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TFTipColCod"))) ;
      AV43TFTipColCod_To = (byte)(GXutil.lval( httpContext.GetPar( "TFTipColCod_To"))) ;
      AV44TFTipColDsc = httpContext.GetPar( "TFTipColDsc") ;
      AV45TFTipColDsc_Sel = httpContext.GetPar( "TFTipColDsc_Sel") ;
      AV46TFIntCod = (byte)(GXutil.lval( httpContext.GetPar( "TFIntCod"))) ;
      AV47TFIntCod_To = (byte)(GXutil.lval( httpContext.GetPar( "TFIntCod_To"))) ;
      AV48TFIntDsc = httpContext.GetPar( "TFIntDsc") ;
      AV49TFIntDsc_Sel = httpContext.GetPar( "TFIntDsc_Sel") ;
      AV58TFIntCodF = (byte)(GXutil.lval( httpContext.GetPar( "TFIntCodF"))) ;
      AV59TFIntCodF_To = (byte)(GXutil.lval( httpContext.GetPar( "TFIntCodF_To"))) ;
      AV60TFIntDscF = httpContext.GetPar( "TFIntDscF") ;
      AV61TFIntDscF_Sel = httpContext.GetPar( "TFIntDscF_Sel") ;
      AV88TFForNumCol = (int)(GXutil.lval( httpContext.GetPar( "TFForNumCol"))) ;
      AV89TFForNumCol_To = (int)(GXutil.lval( httpContext.GetPar( "TFForNumCol_To"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV186TFForBlo_Sels);
      AV148TFForCosForm = CommonUtil.decimalVal( httpContext.GetPar( "TFForCosForm"), ".") ;
      AV149TFForCosForm_To = CommonUtil.decimalVal( httpContext.GetPar( "TFForCosForm_To"), ".") ;
      AV90TFForFec = localUtil.parseDateParm( httpContext.GetPar( "TFForFec")) ;
      AV102TFForUltMod = localUtil.parseDateParm( httpContext.GetPar( "TFForUltMod")) ;
      AV189Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV170Emprcod, AV171Clicod, AV172Clicod_to, AV173Forser, AV174Forser_to, AV175Forcolnum, AV176Forcolnum_to, AV177Forcolnom, AV178Forcolnom_to, AV179Tipcolcod, AV180Tipcolcod_to, AV183ForNumColfrom, AV184ForNumColto, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV30TFCliCod, AV31TFCliCod_To, AV32TFCliNom, AV33TFCliNom_Sel, AV34TFForSer, AV35TFForSer_Sel, AV36TFForSerDsc, AV37TFForSerDsc_Sel, AV118TFForTipArt, AV119TFForTipArt_To, AV181TFForTipArtDsc, AV182TFForTipArtDsc_Sel, AV38TFForColNom, AV39TFForColNom_Sel, AV40TFForColNum, AV41TFForColNum_To, AV42TFTipColCod, AV43TFTipColCod_To, AV44TFTipColDsc, AV45TFTipColDsc_Sel, AV46TFIntCod, AV47TFIntCod_To, AV48TFIntDsc, AV49TFIntDsc_Sel, AV58TFIntCodF, AV59TFIntCodF_To, AV60TFIntDscF, AV61TFIntDscF_Sel, AV88TFForNumCol, AV89TFForNumCol_To, AV186TFForBlo_Sels, AV148TFForCosForm, AV149TFForCosForm_To, AV90TFForFec, AV102TFForUltMod, AV189Pgmname, AV12OrderedBy, AV13OrderedDsc, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1KS2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Listado de Formulas", "")) ;
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
      httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.listadodeformulas_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV170Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV171Clicod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV172Clicod_to,6,0)),GXutil.URLEncode(GXutil.rtrim(AV173Forser)),GXutil.URLEncode(GXutil.rtrim(AV174Forser_to)),GXutil.URLEncode(GXutil.ltrimstr(AV175Forcolnum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV176Forcolnum_to,6,0)),GXutil.URLEncode(GXutil.rtrim(AV177Forcolnom)),GXutil.URLEncode(GXutil.rtrim(AV178Forcolnom_to)),GXutil.URLEncode(GXutil.ltrimstr(AV179Tipcolcod,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV180Tipcolcod_to,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV183ForNumColfrom,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV184ForNumColto,8,0))}, new String[] {"Emprcod","Clicod","Clicod_to","Forser","Forser_to","Forcolnum","Forcolnum_to","Forcolnom","Forcolnom_to","Tipcolcod","Tipcolcod_to","ForNumColfrom","ForNumColto"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ListadodeFormulas_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV189Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("formulaciontinte\\listadodeformulas_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_47", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_47, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV23ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV23ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV168GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV169GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV166DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV166DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV20ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV20ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV170Emprcod", GXutil.rtrim( wcpOAV170Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV171Clicod", GXutil.ltrim( localUtil.ntoc( wcpOAV171Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV172Clicod_to", GXutil.ltrim( localUtil.ntoc( wcpOAV172Clicod_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV173Forser", GXutil.rtrim( wcpOAV173Forser));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV174Forser_to", GXutil.rtrim( wcpOAV174Forser_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV175Forcolnum", GXutil.ltrim( localUtil.ntoc( wcpOAV175Forcolnum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV176Forcolnum_to", GXutil.ltrim( localUtil.ntoc( wcpOAV176Forcolnum_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV177Forcolnom", GXutil.rtrim( wcpOAV177Forcolnom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV178Forcolnom_to", GXutil.rtrim( wcpOAV178Forcolnom_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV179Tipcolcod", GXutil.ltrim( localUtil.ntoc( wcpOAV179Tipcolcod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV180Tipcolcod_to", GXutil.ltrim( localUtil.ntoc( wcpOAV180Tipcolcod_to, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV183ForNumColfrom", GXutil.ltrim( localUtil.ntoc( wcpOAV183ForNumColfrom, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV184ForNumColto", GXutil.ltrim( localUtil.ntoc( wcpOAV184ForNumColto, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV25ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLICOD", GXutil.ltrim( localUtil.ntoc( AV30TFCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV31TFCliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLINOM", GXutil.rtrim( AV32TFCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLINOM_SEL", GXutil.rtrim( AV33TFCliNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFORSER", GXutil.rtrim( AV34TFForSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFORSER_SEL", GXutil.rtrim( AV35TFForSer_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFORSERDSC", GXutil.rtrim( AV36TFForSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFORSERDSC_SEL", GXutil.rtrim( AV37TFForSerDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFORTIPART", GXutil.ltrim( localUtil.ntoc( AV118TFForTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFORTIPART_TO", GXutil.ltrim( localUtil.ntoc( AV119TFForTipArt_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFORTIPARTDSC", GXutil.rtrim( AV181TFForTipArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFORTIPARTDSC_SEL", GXutil.rtrim( AV182TFForTipArtDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFORCOLNOM", GXutil.rtrim( AV38TFForColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFORCOLNOM_SEL", GXutil.rtrim( AV39TFForColNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFORCOLNUM", GXutil.ltrim( localUtil.ntoc( AV40TFForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFORCOLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV41TFForColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFTIPCOLCOD", GXutil.ltrim( localUtil.ntoc( AV42TFTipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFTIPCOLCOD_TO", GXutil.ltrim( localUtil.ntoc( AV43TFTipColCod_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFTIPCOLDSC", GXutil.rtrim( AV44TFTipColDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFTIPCOLDSC_SEL", GXutil.rtrim( AV45TFTipColDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFINTCOD", GXutil.ltrim( localUtil.ntoc( AV46TFIntCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFINTCOD_TO", GXutil.ltrim( localUtil.ntoc( AV47TFIntCod_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFINTDSC", GXutil.rtrim( AV48TFIntDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFINTDSC_SEL", GXutil.rtrim( AV49TFIntDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFINTCODF", GXutil.ltrim( localUtil.ntoc( AV58TFIntCodF, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFINTCODF_TO", GXutil.ltrim( localUtil.ntoc( AV59TFIntCodF_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFINTDSCF", GXutil.rtrim( AV60TFIntDscF));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFINTDSCF_SEL", GXutil.rtrim( AV61TFIntDscF_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFORNUMCOL", GXutil.ltrim( localUtil.ntoc( AV88TFForNumCol, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFORNUMCOL_TO", GXutil.ltrim( localUtil.ntoc( AV89TFForNumCol_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vTFFORBLO_SELS", AV186TFForBlo_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vTFFORBLO_SELS", AV186TFForBlo_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFORCOSFORM", GXutil.ltrim( localUtil.ntoc( AV148TFForCosForm, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFORCOSFORM_TO", GXutil.ltrim( localUtil.ntoc( AV149TFForCosForm_To, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFORFEC", localUtil.dtoc( AV90TFForFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFORULTMOD", localUtil.dtoc( AV102TFForUltMod, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV170Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD", GXutil.ltrim( localUtil.ntoc( AV171Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV172Clicod_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORSER", GXutil.rtrim( AV173Forser));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORSER_TO", GXutil.rtrim( AV174Forser_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORCOLNUM", GXutil.ltrim( localUtil.ntoc( AV175Forcolnum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORCOLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV176Forcolnum_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORCOLNOM", GXutil.rtrim( AV177Forcolnom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORCOLNOM_TO", GXutil.rtrim( AV178Forcolnom_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPCOLCOD", GXutil.ltrim( localUtil.ntoc( AV179Tipcolcod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPCOLCOD_TO", GXutil.ltrim( localUtil.ntoc( AV180Tipcolcod_to, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORNUMCOLFROM", GXutil.ltrim( localUtil.ntoc( AV183ForNumColfrom, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORNUMCOLTO", GXutil.ltrim( localUtil.ntoc( AV184ForNumColto, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV10GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFORBLO_SELSJSON", AV185TFForBlo_SelsJson);
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INNEWWINDOW1_Width", GXutil.rtrim( Innewwindow1_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INNEWWINDOW1_Height", GXutil.rtrim( Innewwindow1_Height));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INNEWWINDOW1_Target", GXutil.rtrim( Innewwindow1_Target));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption", GXutil.rtrim( Ddo_gridcolumnsselector_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip", GXutil.rtrim( Ddo_gridcolumnsselector_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls", GXutil.rtrim( Ddo_gridcolumnsselector_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype", GXutil.rtrim( Ddo_gridcolumnsselector_Dropdownoptionstype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname", GXutil.rtrim( Ddo_gridcolumnsselector_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace", GXutil.rtrim( Ddo_gridcolumnsselector_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_INFORMETIPOFICHA_Title", GXutil.rtrim( Dvelop_confirmpanel_informetipoficha_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_INFORMETIPOFICHA_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_informetipoficha_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_INFORMETIPOFICHA_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_informetipoficha_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_INFORMETIPOFICHA_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_informetipoficha_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_INFORMETIPOFICHA_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_informetipoficha_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_INFORMETIPOFICHA_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_informetipoficha_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_INFORMETIPOFICHA_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_informetipoficha_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_INFORMEFORMULASCONCLAVES_Title", GXutil.rtrim( Dvelop_confirmpanel_informeformulasconclaves_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_INFORMEFORMULASCONCLAVES_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_informeformulasconclaves_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_INFORMEFORMULASCONCLAVES_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_informeformulasconclaves_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_INFORMEFORMULASCONCLAVES_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_informeformulasconclaves_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_INFORMEFORMULASCONCLAVES_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_informeformulasconclaves_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_INFORMEFORMULASCONCLAVES_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_informeformulasconclaves_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_INFORMEFORMULASCONCLAVES_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_informeformulasconclaves_Confirmtype));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_INFORMETIPOFICHA_Result", GXutil.rtrim( Dvelop_confirmpanel_informetipoficha_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_INFORMEFORMULASCONCLAVES_Result", GXutil.rtrim( Dvelop_confirmpanel_informeformulasconclaves_Result));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_INFORMETIPOFICHA_Result", GXutil.rtrim( Dvelop_confirmpanel_informetipoficha_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_INFORMEFORMULASCONCLAVES_Result", GXutil.rtrim( Dvelop_confirmpanel_informeformulasconclaves_Result));
   }

   public void renderHtmlCloseForm1KS2( )
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
      return "FormulacionTinte.ListadodeFormulas_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Listado de Formulas", "") ;
   }

   public void wb1KS0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.formulaciontinte.listadodeformulas_wc");
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
            httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 47, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\ListadodeFormulas_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 47, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportReportCaption", ""), bttBtnexportreport_Jsonclick, 7, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e111ks1_client"+"'", TempTags, "", 2, "HLP_FormulacionTinte\\ListadodeFormulas_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 47, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\ListadodeFormulas_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninformetipoficha_Internalname, "gx.evt.setGridEvt("+GXutil.str( 47, 2, 0)+","+"null"+");", httpContext.getMessage( "Informe Tipo Ficha", ""), bttBtninformetipoficha_Jsonclick, 7, httpContext.getMessage( "Informe Tipo Ficha", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e121ks1_client"+"'", TempTags, "", 2, "HLP_FormulacionTinte\\ListadodeFormulas_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninformeformulasconclaves_Internalname, "gx.evt.setGridEvt("+GXutil.str( 47, 2, 0)+","+"null"+");", httpContext.getMessage( "Informe Formulas con Claves", ""), bttBtninformeformulasconclaves_Jsonclick, 7, httpContext.getMessage( "Informe Formulas con Claves", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e131ks1_client"+"'", TempTags, "", 2, "HLP_FormulacionTinte\\ListadodeFormulas_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 47, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\ListadodeFormulas_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_29_1KS2( true) ;
      }
      else
      {
         wb_table1_29_1KS2( false) ;
      }
      return  ;
   }

   public void wb_table1_29_1KS2e( boolean wbgen )
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
         startgridcontrol47( ) ;
      }
      if ( wbEnd == 47 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_47 = (int)(nGXsfl_47_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV168GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV169GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV189Pgmname), GXutil.rtrim( localUtil.format( AV189Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ListadodeFormulas_WC.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV166DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucInnewwindow1.render(context, "innewwindow", Innewwindow1_Internalname, sPrefix+"INNEWWINDOW1Container");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV166DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV20ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         wb_table2_80_1KS2( true) ;
      }
      else
      {
         wb_table2_80_1KS2( false) ;
      }
      return  ;
   }

   public void wb_table2_80_1KS2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table3_85_1KS2( true) ;
      }
      else
      {
         wb_table3_85_1KS2( false) ;
      }
      return  ;
   }

   public void wb_table3_85_1KS2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_forfecauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 92,'" + sPrefix + "',false,'" + sGXsfl_47_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_forfecauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_forfecauxdate_Internalname, localUtil.format(AV92DDO_ForFecAuxDate, "99/99/99"), localUtil.format( AV92DDO_ForFecAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,92);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_forfecauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ListadodeFormulas_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_forfecauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_FormulacionTinte\\ListadodeFormulas_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_forultmodauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'" + sPrefix + "',false,'" + sGXsfl_47_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_forultmodauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_forultmodauxdate_Internalname, localUtil.format(AV104DDO_ForUltModAuxDate, "99/99/99"), localUtil.format( AV104DDO_ForUltModAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,94);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_forultmodauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ListadodeFormulas_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_forultmodauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_FormulacionTinte\\ListadodeFormulas_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 47 )
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

   public void start1KS2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Listado de Formulas", ""), (short)(0)) ;
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
            strup1KS0( ) ;
         }
      }
   }

   public void ws1KS2( )
   {
      start1KS2( ) ;
      evt1KS2( ) ;
   }

   public void evt1KS2( )
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
                              strup1KS0( ) ;
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
                              strup1KS0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e141KS2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1KS0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e151KS2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1KS0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e161KS2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1KS0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e171KS2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1KS0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e181KS2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_INFORMETIPOFICHA.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1KS0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e191KS2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_INFORMEFORMULASCONCLAVES.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1KS0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e201KS2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1KS0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e211KS2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1KS0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e221KS2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1KS0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavFilterfulltext_Internalname ;
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
                              strup1KS0( ) ;
                           }
                           nGXsfl_47_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_47_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_47_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_472( ) ;
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           A494ForSer = httpContext.cgiGet( edtForSer_Internalname) ;
                           A5742ForSerDsc = httpContext.cgiGet( edtForSerDsc_Internalname) ;
                           n5742ForSerDsc = false ;
                           A4384ForTipArt = (short)(localUtil.ctol( httpContext.cgiGet( edtForTipArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n4384ForTipArt = false ;
                           A13929ForTipArtD = httpContext.cgiGet( edtForTipArtD_Internalname) ;
                           n13929ForTipArtD = false ;
                           A482ForColNom = httpContext.cgiGet( edtForColNom_Internalname) ;
                           A483ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtForColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A831TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtTipColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A832TipColDsc = httpContext.cgiGet( edtTipColDsc_Internalname) ;
                           n832TipColDsc = false ;
                           A583IntCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtIntCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A584IntDsc = httpContext.cgiGet( edtIntDsc_Internalname) ;
                           n584IntDsc = false ;
                           A5362IntCodF = (byte)(localUtil.ctol( httpContext.cgiGet( edtIntCodF_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n5362IntCodF = false ;
                           A5363IntDscF = httpContext.cgiGet( edtIntDscF_Internalname) ;
                           n5363IntDscF = false ;
                           A486ForNumCol = (int)(localUtil.ctol( httpContext.cgiGet( edtForNumCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           cmbForBlo.setName( cmbForBlo.getInternalname() );
                           cmbForBlo.setValue( httpContext.cgiGet( cmbForBlo.getInternalname()) );
                           A7781ForBlo = httpContext.cgiGet( cmbForBlo.getInternalname()) ;
                           n7781ForBlo = false ;
                           A4380ForCosForm = localUtil.ctond( httpContext.cgiGet( edtForCosForm_Internalname)) ;
                           n4380ForCosForm = false ;
                           A485ForFec = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtForFec_Internalname), 0)) ;
                           n485ForFec = false ;
                           A495ForUltMod = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtForUltMod_Internalname), 0)) ;
                           n495ForUltMod = false ;
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
                                       GX_FocusControl = edtavFilterfulltext_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e231KS2 ();
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
                                       GX_FocusControl = edtavFilterfulltext_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e241KS2 ();
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
                                       GX_FocusControl = edtavFilterfulltext_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e251KS2 ();
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
                                    strup1KS0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavFilterfulltext_Internalname ;
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

   public void we1KS2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1KS2( ) ;
         }
      }
   }

   public void pa1KS2( )
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
      subsflControlProps_472( ) ;
      while ( nGXsfl_47_idx <= nRC_GXsfl_47 )
      {
         sendrow_472( ) ;
         nGXsfl_47_idx = ((subGrid_Islastpage==1)&&(nGXsfl_47_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_47_idx+1) ;
         sGXsfl_47_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_47_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_472( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV170Emprcod ,
                                 int AV171Clicod ,
                                 int AV172Clicod_to ,
                                 String AV173Forser ,
                                 String AV174Forser_to ,
                                 int AV175Forcolnum ,
                                 int AV176Forcolnum_to ,
                                 String AV177Forcolnom ,
                                 String AV178Forcolnom_to ,
                                 byte AV179Tipcolcod ,
                                 short AV180Tipcolcod_to ,
                                 int AV183ForNumColfrom ,
                                 int AV184ForNumColto ,
                                 byte AV25ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ,
                                 String AV15FilterFullText ,
                                 int AV30TFCliCod ,
                                 int AV31TFCliCod_To ,
                                 String AV32TFCliNom ,
                                 String AV33TFCliNom_Sel ,
                                 String AV34TFForSer ,
                                 String AV35TFForSer_Sel ,
                                 String AV36TFForSerDsc ,
                                 String AV37TFForSerDsc_Sel ,
                                 short AV118TFForTipArt ,
                                 short AV119TFForTipArt_To ,
                                 String AV181TFForTipArtDsc ,
                                 String AV182TFForTipArtDsc_Sel ,
                                 String AV38TFForColNom ,
                                 String AV39TFForColNom_Sel ,
                                 int AV40TFForColNum ,
                                 int AV41TFForColNum_To ,
                                 byte AV42TFTipColCod ,
                                 byte AV43TFTipColCod_To ,
                                 String AV44TFTipColDsc ,
                                 String AV45TFTipColDsc_Sel ,
                                 byte AV46TFIntCod ,
                                 byte AV47TFIntCod_To ,
                                 String AV48TFIntDsc ,
                                 String AV49TFIntDsc_Sel ,
                                 byte AV58TFIntCodF ,
                                 byte AV59TFIntCodF_To ,
                                 String AV60TFIntDscF ,
                                 String AV61TFIntDscF_Sel ,
                                 int AV88TFForNumCol ,
                                 int AV89TFForNumCol_To ,
                                 GXSimpleCollection<String> AV186TFForBlo_Sels ,
                                 java.math.BigDecimal AV148TFForCosForm ,
                                 java.math.BigDecimal AV149TFForCosForm_To ,
                                 java.util.Date AV90TFForFec ,
                                 java.util.Date AV102TFForUltMod ,
                                 String AV189Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e241KS2 ();
      GRID_nCurrentRecord = 0 ;
      rf1KS2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ListadodeFormulas_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV189Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("formulaciontinte\\listadodeformulas_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
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
      rf1KS2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV189Pgmname = "FormulacionTinte.ListadodeFormulas_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV189Pgmname", AV189Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public int subgridclient_rec_count_fnc( )
   {
      AV193Formulaciontinte_listadodeformulas_wcds_1_filterfulltext = AV15FilterFullText ;
      AV194Formulaciontinte_listadodeformulas_wcds_2_tfclicod = AV30TFCliCod ;
      AV195Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to = AV31TFCliCod_To ;
      AV196Formulaciontinte_listadodeformulas_wcds_4_tfclinom = AV32TFCliNom ;
      AV197Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel = AV33TFCliNom_Sel ;
      AV198Formulaciontinte_listadodeformulas_wcds_6_tfforser = AV34TFForSer ;
      AV199Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel = AV35TFForSer_Sel ;
      AV200Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc = AV36TFForSerDsc ;
      AV201Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel = AV37TFForSerDsc_Sel ;
      AV202Formulaciontinte_listadodeformulas_wcds_10_tffortipart = AV118TFForTipArt ;
      AV203Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to = AV119TFForTipArt_To ;
      AV204Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc = AV181TFForTipArtDsc ;
      AV205Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel = AV182TFForTipArtDsc_Sel ;
      AV206Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom = AV38TFForColNom ;
      AV207Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel = AV39TFForColNom_Sel ;
      AV208Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum = AV40TFForColNum ;
      AV209Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to = AV41TFForColNum_To ;
      AV210Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod = AV42TFTipColCod ;
      AV211Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to = AV43TFTipColCod_To ;
      AV212Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc = AV44TFTipColDsc ;
      AV213Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel = AV45TFTipColDsc_Sel ;
      AV214Formulaciontinte_listadodeformulas_wcds_22_tfintcod = AV46TFIntCod ;
      AV215Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to = AV47TFIntCod_To ;
      AV216Formulaciontinte_listadodeformulas_wcds_24_tfintdsc = AV48TFIntDsc ;
      AV217Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel = AV49TFIntDsc_Sel ;
      AV218Formulaciontinte_listadodeformulas_wcds_26_tfintcodf = AV58TFIntCodF ;
      AV219Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to = AV59TFIntCodF_To ;
      AV220Formulaciontinte_listadodeformulas_wcds_28_tfintdscf = AV60TFIntDscF ;
      AV221Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel = AV61TFIntDscF_Sel ;
      AV222Formulaciontinte_listadodeformulas_wcds_30_tffornumcol = AV88TFForNumCol ;
      AV223Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to = AV89TFForNumCol_To ;
      AV224Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels = AV186TFForBlo_Sels ;
      AV225Formulaciontinte_listadodeformulas_wcds_33_tfforcosform = AV148TFForCosForm ;
      AV226Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to = AV149TFForCosForm_To ;
      AV227Formulaciontinte_listadodeformulas_wcds_35_tfforfec = AV90TFForFec ;
      AV228Formulaciontinte_listadodeformulas_wcds_36_tfforultmod = AV102TFForUltMod ;
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A7781ForBlo ,
                                           AV224Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels ,
                                           Integer.valueOf(AV194Formulaciontinte_listadodeformulas_wcds_2_tfclicod) ,
                                           Integer.valueOf(AV195Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to) ,
                                           AV197Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel ,
                                           AV196Formulaciontinte_listadodeformulas_wcds_4_tfclinom ,
                                           AV199Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel ,
                                           AV198Formulaciontinte_listadodeformulas_wcds_6_tfforser ,
                                           AV201Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel ,
                                           AV200Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc ,
                                           Short.valueOf(AV202Formulaciontinte_listadodeformulas_wcds_10_tffortipart) ,
                                           Short.valueOf(AV203Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to) ,
                                           AV207Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel ,
                                           AV206Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom ,
                                           Integer.valueOf(AV208Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum) ,
                                           Integer.valueOf(AV209Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to) ,
                                           Byte.valueOf(AV210Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod) ,
                                           Byte.valueOf(AV211Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to) ,
                                           AV213Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel ,
                                           AV212Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc ,
                                           Byte.valueOf(AV214Formulaciontinte_listadodeformulas_wcds_22_tfintcod) ,
                                           Byte.valueOf(AV215Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to) ,
                                           AV217Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel ,
                                           AV216Formulaciontinte_listadodeformulas_wcds_24_tfintdsc ,
                                           Byte.valueOf(AV218Formulaciontinte_listadodeformulas_wcds_26_tfintcodf) ,
                                           Byte.valueOf(AV219Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to) ,
                                           AV221Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel ,
                                           AV220Formulaciontinte_listadodeformulas_wcds_28_tfintdscf ,
                                           Integer.valueOf(AV222Formulaciontinte_listadodeformulas_wcds_30_tffornumcol) ,
                                           Integer.valueOf(AV223Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to) ,
                                           Integer.valueOf(AV224Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels.size()) ,
                                           AV225Formulaciontinte_listadodeformulas_wcds_33_tfforcosform ,
                                           AV226Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to ,
                                           AV227Formulaciontinte_listadodeformulas_wcds_35_tfforfec ,
                                           AV228Formulaciontinte_listadodeformulas_wcds_36_tfforultmod ,
                                           Integer.valueOf(AV171Clicod) ,
                                           Integer.valueOf(AV172Clicod_to) ,
                                           AV173Forser ,
                                           AV174Forser_to ,
                                           AV177Forcolnom ,
                                           AV178Forcolnom_to ,
                                           Integer.valueOf(AV175Forcolnum) ,
                                           Integer.valueOf(AV176Forcolnum_to) ,
                                           Byte.valueOf(AV179Tipcolcod) ,
                                           Short.valueOf(AV180Tipcolcod_to) ,
                                           Integer.valueOf(AV183ForNumColfrom) ,
                                           Integer.valueOf(AV184ForNumColto) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           Short.valueOf(A4384ForTipArt) ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           Byte.valueOf(A583IntCod) ,
                                           A584IntDsc ,
                                           Byte.valueOf(A5362IntCodF) ,
                                           A5363IntDscF ,
                                           Integer.valueOf(A486ForNumCol) ,
                                           A4380ForCosForm ,
                                           A485ForFec ,
                                           A495ForUltMod ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV193Formulaciontinte_listadodeformulas_wcds_1_filterfulltext ,
                                           A13929ForTipArtD ,
                                           AV205Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel ,
                                           AV204Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc ,
                                           A10045CliAct ,
                                           AV170Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV204Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc = GXutil.padr( GXutil.rtrim( AV204Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc), 30, "%") ;
      lV196Formulaciontinte_listadodeformulas_wcds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV196Formulaciontinte_listadodeformulas_wcds_4_tfclinom), 30, "%") ;
      lV198Formulaciontinte_listadodeformulas_wcds_6_tfforser = GXutil.padr( GXutil.rtrim( AV198Formulaciontinte_listadodeformulas_wcds_6_tfforser), 16, "%") ;
      lV200Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc = GXutil.padr( GXutil.rtrim( AV200Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc), 26, "%") ;
      lV206Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom = GXutil.padr( GXutil.rtrim( AV206Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom), 13, "%") ;
      lV212Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV212Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc), 30, "%") ;
      lV216Formulaciontinte_listadodeformulas_wcds_24_tfintdsc = GXutil.padr( GXutil.rtrim( AV216Formulaciontinte_listadodeformulas_wcds_24_tfintdsc), 30, "%") ;
      lV220Formulaciontinte_listadodeformulas_wcds_28_tfintdscf = GXutil.padr( GXutil.rtrim( AV220Formulaciontinte_listadodeformulas_wcds_28_tfintdscf), 30, "%") ;
      /* Using cursor H01KS2 */
      pr_default.execute(0, new Object[] {AV170Emprcod, AV205Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel, AV204Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc, lV204Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc, AV205Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel, AV205Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel, Integer.valueOf(AV194Formulaciontinte_listadodeformulas_wcds_2_tfclicod), Integer.valueOf(AV195Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to), lV196Formulaciontinte_listadodeformulas_wcds_4_tfclinom, AV197Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel, lV198Formulaciontinte_listadodeformulas_wcds_6_tfforser, AV199Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel, lV200Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc, AV201Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel, Short.valueOf(AV202Formulaciontinte_listadodeformulas_wcds_10_tffortipart), Short.valueOf(AV203Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to), lV206Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom, AV207Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel, Integer.valueOf(AV208Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum), Integer.valueOf(AV209Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to), Byte.valueOf(AV210Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod), Byte.valueOf(AV211Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to), lV212Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc, AV213Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel, Byte.valueOf(AV214Formulaciontinte_listadodeformulas_wcds_22_tfintcod), Byte.valueOf(AV215Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to), lV216Formulaciontinte_listadodeformulas_wcds_24_tfintdsc, AV217Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel, Byte.valueOf(AV218Formulaciontinte_listadodeformulas_wcds_26_tfintcodf), Byte.valueOf(AV219Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to), lV220Formulaciontinte_listadodeformulas_wcds_28_tfintdscf, AV221Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel, Integer.valueOf(AV222Formulaciontinte_listadodeformulas_wcds_30_tffornumcol), Integer.valueOf(AV223Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to), AV225Formulaciontinte_listadodeformulas_wcds_33_tfforcosform, AV226Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to, AV227Formulaciontinte_listadodeformulas_wcds_35_tfforfec, AV228Formulaciontinte_listadodeformulas_wcds_36_tfforultmod, Integer.valueOf(AV171Clicod), Integer.valueOf(AV172Clicod_to), AV173Forser, AV174Forser_to, AV177Forcolnom, AV178Forcolnom_to, Integer.valueOf(AV175Forcolnum), Integer.valueOf(AV176Forcolnum_to), Byte.valueOf(AV179Tipcolcod), Short.valueOf(AV180Tipcolcod_to), Integer.valueOf(AV183ForNumColfrom), Integer.valueOf(AV184ForNumColto)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = H01KS2_A396EmprCod[0] ;
         A10045CliAct = H01KS2_A10045CliAct[0] ;
         A495ForUltMod = H01KS2_A495ForUltMod[0] ;
         n495ForUltMod = H01KS2_n495ForUltMod[0] ;
         A485ForFec = H01KS2_A485ForFec[0] ;
         n485ForFec = H01KS2_n485ForFec[0] ;
         A4380ForCosForm = H01KS2_A4380ForCosForm[0] ;
         n4380ForCosForm = H01KS2_n4380ForCosForm[0] ;
         A7781ForBlo = H01KS2_A7781ForBlo[0] ;
         n7781ForBlo = H01KS2_n7781ForBlo[0] ;
         A486ForNumCol = H01KS2_A486ForNumCol[0] ;
         A5363IntDscF = H01KS2_A5363IntDscF[0] ;
         n5363IntDscF = H01KS2_n5363IntDscF[0] ;
         A5362IntCodF = H01KS2_A5362IntCodF[0] ;
         n5362IntCodF = H01KS2_n5362IntCodF[0] ;
         A584IntDsc = H01KS2_A584IntDsc[0] ;
         n584IntDsc = H01KS2_n584IntDsc[0] ;
         A583IntCod = H01KS2_A583IntCod[0] ;
         A832TipColDsc = H01KS2_A832TipColDsc[0] ;
         n832TipColDsc = H01KS2_n832TipColDsc[0] ;
         A831TipColCod = H01KS2_A831TipColCod[0] ;
         A483ForColNum = H01KS2_A483ForColNum[0] ;
         A482ForColNom = H01KS2_A482ForColNom[0] ;
         A4384ForTipArt = H01KS2_A4384ForTipArt[0] ;
         n4384ForTipArt = H01KS2_n4384ForTipArt[0] ;
         A5742ForSerDsc = H01KS2_A5742ForSerDsc[0] ;
         n5742ForSerDsc = H01KS2_n5742ForSerDsc[0] ;
         A494ForSer = H01KS2_A494ForSer[0] ;
         A279CliNom = H01KS2_A279CliNom[0] ;
         A252CliCod = H01KS2_A252CliCod[0] ;
         A13929ForTipArtD = H01KS2_A13929ForTipArtD[0] ;
         n13929ForTipArtD = H01KS2_n13929ForTipArtD[0] ;
         A5363IntDscF = H01KS2_A5363IntDscF[0] ;
         n5363IntDscF = H01KS2_n5363IntDscF[0] ;
         A584IntDsc = H01KS2_A584IntDsc[0] ;
         n584IntDsc = H01KS2_n584IntDsc[0] ;
         A832TipColDsc = H01KS2_A832TipColDsc[0] ;
         n832TipColDsc = H01KS2_n832TipColDsc[0] ;
         A13929ForTipArtD = H01KS2_A13929ForTipArtD[0] ;
         n13929ForTipArtD = H01KS2_n13929ForTipArtD[0] ;
         A10045CliAct = H01KS2_A10045CliAct[0] ;
         A279CliNom = H01KS2_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV193Formulaciontinte_listadodeformulas_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV193Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV193Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A494ForSer) , GXutil.padr( "%" + GXutil.upper( AV193Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5742ForSerDsc) , GXutil.padr( "%" + GXutil.upper( AV193Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A4384ForTipArt, 4, 0) , GXutil.padr( "%" + AV193Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13929ForTipArtD) , GXutil.padr( "%" + GXutil.upper( AV193Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A482ForColNom) , GXutil.padr( "%" + GXutil.upper( AV193Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A483ForColNum, 6, 0) , GXutil.padr( "%" + AV193Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A831TipColCod, 2, 0) , GXutil.padr( "%" + AV193Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A832TipColDsc) , GXutil.padr( "%" + GXutil.upper( AV193Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A583IntCod, 2, 0) , GXutil.padr( "%" + AV193Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A584IntDsc) , GXutil.padr( "%" + GXutil.upper( AV193Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A5362IntCodF, 2, 0) , GXutil.padr( "%" + AV193Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5363IntDscF) , GXutil.padr( "%" + GXutil.upper( AV193Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A486ForNumCol, 8, 0) , GXutil.padr( "%" + AV193Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "n", "") , GXutil.padr( "%" + GXutil.lower( AV193Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A7781ForBlo, "N") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "s", "") , GXutil.padr( "%" + GXutil.lower( AV193Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A7781ForBlo, "S") == 0 ) ) || ( GXutil.like( GXutil.str( A4380ForCosForm, 11, 5) , GXutil.padr( "%" + AV193Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            GRID_nRecordCount = (long)(GRID_nRecordCount+1) ;
         }
         pr_default.readNext(0);
      }
      GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      pr_default.close(0);
      return (int)(GRID_nRecordCount) ;
   }

   public void rf1KS2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(47) ;
      /* Execute user event: Refresh */
      e241KS2 ();
      nGXsfl_47_idx = 1 ;
      sGXsfl_47_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_47_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_472( ) ;
      bGXsfl_47_Refreshing = true ;
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
         subsflControlProps_472( ) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              A7781ForBlo ,
                                              AV224Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels ,
                                              Integer.valueOf(AV194Formulaciontinte_listadodeformulas_wcds_2_tfclicod) ,
                                              Integer.valueOf(AV195Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to) ,
                                              AV197Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel ,
                                              AV196Formulaciontinte_listadodeformulas_wcds_4_tfclinom ,
                                              AV199Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel ,
                                              AV198Formulaciontinte_listadodeformulas_wcds_6_tfforser ,
                                              AV201Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel ,
                                              AV200Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc ,
                                              Short.valueOf(AV202Formulaciontinte_listadodeformulas_wcds_10_tffortipart) ,
                                              Short.valueOf(AV203Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to) ,
                                              AV207Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel ,
                                              AV206Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom ,
                                              Integer.valueOf(AV208Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum) ,
                                              Integer.valueOf(AV209Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to) ,
                                              Byte.valueOf(AV210Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod) ,
                                              Byte.valueOf(AV211Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to) ,
                                              AV213Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel ,
                                              AV212Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc ,
                                              Byte.valueOf(AV214Formulaciontinte_listadodeformulas_wcds_22_tfintcod) ,
                                              Byte.valueOf(AV215Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to) ,
                                              AV217Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel ,
                                              AV216Formulaciontinte_listadodeformulas_wcds_24_tfintdsc ,
                                              Byte.valueOf(AV218Formulaciontinte_listadodeformulas_wcds_26_tfintcodf) ,
                                              Byte.valueOf(AV219Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to) ,
                                              AV221Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel ,
                                              AV220Formulaciontinte_listadodeformulas_wcds_28_tfintdscf ,
                                              Integer.valueOf(AV222Formulaciontinte_listadodeformulas_wcds_30_tffornumcol) ,
                                              Integer.valueOf(AV223Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to) ,
                                              Integer.valueOf(AV224Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels.size()) ,
                                              AV225Formulaciontinte_listadodeformulas_wcds_33_tfforcosform ,
                                              AV226Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to ,
                                              AV227Formulaciontinte_listadodeformulas_wcds_35_tfforfec ,
                                              AV228Formulaciontinte_listadodeformulas_wcds_36_tfforultmod ,
                                              Integer.valueOf(AV171Clicod) ,
                                              Integer.valueOf(AV172Clicod_to) ,
                                              AV173Forser ,
                                              AV174Forser_to ,
                                              AV177Forcolnom ,
                                              AV178Forcolnom_to ,
                                              Integer.valueOf(AV175Forcolnum) ,
                                              Integer.valueOf(AV176Forcolnum_to) ,
                                              Byte.valueOf(AV179Tipcolcod) ,
                                              Short.valueOf(AV180Tipcolcod_to) ,
                                              Integer.valueOf(AV183ForNumColfrom) ,
                                              Integer.valueOf(AV184ForNumColto) ,
                                              Integer.valueOf(A252CliCod) ,
                                              A279CliNom ,
                                              A494ForSer ,
                                              A5742ForSerDsc ,
                                              Short.valueOf(A4384ForTipArt) ,
                                              A482ForColNom ,
                                              Integer.valueOf(A483ForColNum) ,
                                              Byte.valueOf(A831TipColCod) ,
                                              A832TipColDsc ,
                                              Byte.valueOf(A583IntCod) ,
                                              A584IntDsc ,
                                              Byte.valueOf(A5362IntCodF) ,
                                              A5363IntDscF ,
                                              Integer.valueOf(A486ForNumCol) ,
                                              A4380ForCosForm ,
                                              A485ForFec ,
                                              A495ForUltMod ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV193Formulaciontinte_listadodeformulas_wcds_1_filterfulltext ,
                                              A13929ForTipArtD ,
                                              AV205Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel ,
                                              AV204Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc ,
                                              A10045CliAct ,
                                              AV170Emprcod ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                              TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE,
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DATE,
                                              TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV204Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc = GXutil.padr( GXutil.rtrim( AV204Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc), 30, "%") ;
         lV196Formulaciontinte_listadodeformulas_wcds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV196Formulaciontinte_listadodeformulas_wcds_4_tfclinom), 30, "%") ;
         lV198Formulaciontinte_listadodeformulas_wcds_6_tfforser = GXutil.padr( GXutil.rtrim( AV198Formulaciontinte_listadodeformulas_wcds_6_tfforser), 16, "%") ;
         lV200Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc = GXutil.padr( GXutil.rtrim( AV200Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc), 26, "%") ;
         lV206Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom = GXutil.padr( GXutil.rtrim( AV206Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom), 13, "%") ;
         lV212Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV212Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc), 30, "%") ;
         lV216Formulaciontinte_listadodeformulas_wcds_24_tfintdsc = GXutil.padr( GXutil.rtrim( AV216Formulaciontinte_listadodeformulas_wcds_24_tfintdsc), 30, "%") ;
         lV220Formulaciontinte_listadodeformulas_wcds_28_tfintdscf = GXutil.padr( GXutil.rtrim( AV220Formulaciontinte_listadodeformulas_wcds_28_tfintdscf), 30, "%") ;
         /* Using cursor H01KS3 */
         pr_default.execute(1, new Object[] {AV170Emprcod, AV205Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel, AV204Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc, lV204Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc, AV205Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel, AV205Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel, Integer.valueOf(AV194Formulaciontinte_listadodeformulas_wcds_2_tfclicod), Integer.valueOf(AV195Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to), lV196Formulaciontinte_listadodeformulas_wcds_4_tfclinom, AV197Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel, lV198Formulaciontinte_listadodeformulas_wcds_6_tfforser, AV199Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel, lV200Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc, AV201Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel, Short.valueOf(AV202Formulaciontinte_listadodeformulas_wcds_10_tffortipart), Short.valueOf(AV203Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to), lV206Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom, AV207Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel, Integer.valueOf(AV208Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum), Integer.valueOf(AV209Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to), Byte.valueOf(AV210Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod), Byte.valueOf(AV211Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to), lV212Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc, AV213Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel, Byte.valueOf(AV214Formulaciontinte_listadodeformulas_wcds_22_tfintcod), Byte.valueOf(AV215Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to), lV216Formulaciontinte_listadodeformulas_wcds_24_tfintdsc, AV217Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel, Byte.valueOf(AV218Formulaciontinte_listadodeformulas_wcds_26_tfintcodf), Byte.valueOf(AV219Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to), lV220Formulaciontinte_listadodeformulas_wcds_28_tfintdscf, AV221Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel, Integer.valueOf(AV222Formulaciontinte_listadodeformulas_wcds_30_tffornumcol), Integer.valueOf(AV223Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to), AV225Formulaciontinte_listadodeformulas_wcds_33_tfforcosform, AV226Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to, AV227Formulaciontinte_listadodeformulas_wcds_35_tfforfec, AV228Formulaciontinte_listadodeformulas_wcds_36_tfforultmod, Integer.valueOf(AV171Clicod), Integer.valueOf(AV172Clicod_to), AV173Forser, AV174Forser_to, AV177Forcolnom, AV178Forcolnom_to, Integer.valueOf(AV175Forcolnum), Integer.valueOf(AV176Forcolnum_to), Byte.valueOf(AV179Tipcolcod), Short.valueOf(AV180Tipcolcod_to), Integer.valueOf(AV183ForNumColfrom), Integer.valueOf(AV184ForNumColto)});
         nGXsfl_47_idx = 1 ;
         sGXsfl_47_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_47_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_472( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A396EmprCod = H01KS3_A396EmprCod[0] ;
            A10045CliAct = H01KS3_A10045CliAct[0] ;
            A495ForUltMod = H01KS3_A495ForUltMod[0] ;
            n495ForUltMod = H01KS3_n495ForUltMod[0] ;
            A485ForFec = H01KS3_A485ForFec[0] ;
            n485ForFec = H01KS3_n485ForFec[0] ;
            A4380ForCosForm = H01KS3_A4380ForCosForm[0] ;
            n4380ForCosForm = H01KS3_n4380ForCosForm[0] ;
            A7781ForBlo = H01KS3_A7781ForBlo[0] ;
            n7781ForBlo = H01KS3_n7781ForBlo[0] ;
            A486ForNumCol = H01KS3_A486ForNumCol[0] ;
            A5363IntDscF = H01KS3_A5363IntDscF[0] ;
            n5363IntDscF = H01KS3_n5363IntDscF[0] ;
            A5362IntCodF = H01KS3_A5362IntCodF[0] ;
            n5362IntCodF = H01KS3_n5362IntCodF[0] ;
            A584IntDsc = H01KS3_A584IntDsc[0] ;
            n584IntDsc = H01KS3_n584IntDsc[0] ;
            A583IntCod = H01KS3_A583IntCod[0] ;
            A832TipColDsc = H01KS3_A832TipColDsc[0] ;
            n832TipColDsc = H01KS3_n832TipColDsc[0] ;
            A831TipColCod = H01KS3_A831TipColCod[0] ;
            A483ForColNum = H01KS3_A483ForColNum[0] ;
            A482ForColNom = H01KS3_A482ForColNom[0] ;
            A4384ForTipArt = H01KS3_A4384ForTipArt[0] ;
            n4384ForTipArt = H01KS3_n4384ForTipArt[0] ;
            A5742ForSerDsc = H01KS3_A5742ForSerDsc[0] ;
            n5742ForSerDsc = H01KS3_n5742ForSerDsc[0] ;
            A494ForSer = H01KS3_A494ForSer[0] ;
            A279CliNom = H01KS3_A279CliNom[0] ;
            A252CliCod = H01KS3_A252CliCod[0] ;
            A13929ForTipArtD = H01KS3_A13929ForTipArtD[0] ;
            n13929ForTipArtD = H01KS3_n13929ForTipArtD[0] ;
            A5363IntDscF = H01KS3_A5363IntDscF[0] ;
            n5363IntDscF = H01KS3_n5363IntDscF[0] ;
            A584IntDsc = H01KS3_A584IntDsc[0] ;
            n584IntDsc = H01KS3_n584IntDsc[0] ;
            A832TipColDsc = H01KS3_A832TipColDsc[0] ;
            n832TipColDsc = H01KS3_n832TipColDsc[0] ;
            A13929ForTipArtD = H01KS3_A13929ForTipArtD[0] ;
            n13929ForTipArtD = H01KS3_n13929ForTipArtD[0] ;
            A10045CliAct = H01KS3_A10045CliAct[0] ;
            A279CliNom = H01KS3_A279CliNom[0] ;
            if ( (GXutil.strcmp("", AV193Formulaciontinte_listadodeformulas_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV193Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV193Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A494ForSer) , GXutil.padr( "%" + GXutil.upper( AV193Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5742ForSerDsc) , GXutil.padr( "%" + GXutil.upper( AV193Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A4384ForTipArt, 4, 0) , GXutil.padr( "%" + AV193Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13929ForTipArtD) , GXutil.padr( "%" + GXutil.upper( AV193Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A482ForColNom) , GXutil.padr( "%" + GXutil.upper( AV193Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A483ForColNum, 6, 0) , GXutil.padr( "%" + AV193Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A831TipColCod, 2, 0) , GXutil.padr( "%" + AV193Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A832TipColDsc) , GXutil.padr( "%" + GXutil.upper( AV193Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A583IntCod, 2, 0) , GXutil.padr( "%" + AV193Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A584IntDsc) , GXutil.padr( "%" + GXutil.upper( AV193Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A5362IntCodF, 2, 0) , GXutil.padr( "%" + AV193Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5363IntDscF) , GXutil.padr( "%" + GXutil.upper( AV193Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A486ForNumCol, 8, 0) , GXutil.padr( "%" + AV193Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "n", "") , GXutil.padr( "%" + GXutil.lower( AV193Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A7781ForBlo, "N") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "s", "") , GXutil.padr( "%" + GXutil.lower( AV193Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A7781ForBlo, "S") == 0 ) ) || ( GXutil.like( GXutil.str( A4380ForCosForm, 11, 5) , GXutil.padr( "%" + AV193Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
            {
               e251KS2 ();
            }
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(47) ;
         wb1KS0( ) ;
      }
      bGXsfl_47_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1KS2( )
   {
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
      AV193Formulaciontinte_listadodeformulas_wcds_1_filterfulltext = AV15FilterFullText ;
      AV194Formulaciontinte_listadodeformulas_wcds_2_tfclicod = AV30TFCliCod ;
      AV195Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to = AV31TFCliCod_To ;
      AV196Formulaciontinte_listadodeformulas_wcds_4_tfclinom = AV32TFCliNom ;
      AV197Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel = AV33TFCliNom_Sel ;
      AV198Formulaciontinte_listadodeformulas_wcds_6_tfforser = AV34TFForSer ;
      AV199Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel = AV35TFForSer_Sel ;
      AV200Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc = AV36TFForSerDsc ;
      AV201Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel = AV37TFForSerDsc_Sel ;
      AV202Formulaciontinte_listadodeformulas_wcds_10_tffortipart = AV118TFForTipArt ;
      AV203Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to = AV119TFForTipArt_To ;
      AV204Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc = AV181TFForTipArtDsc ;
      AV205Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel = AV182TFForTipArtDsc_Sel ;
      AV206Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom = AV38TFForColNom ;
      AV207Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel = AV39TFForColNom_Sel ;
      AV208Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum = AV40TFForColNum ;
      AV209Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to = AV41TFForColNum_To ;
      AV210Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod = AV42TFTipColCod ;
      AV211Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to = AV43TFTipColCod_To ;
      AV212Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc = AV44TFTipColDsc ;
      AV213Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel = AV45TFTipColDsc_Sel ;
      AV214Formulaciontinte_listadodeformulas_wcds_22_tfintcod = AV46TFIntCod ;
      AV215Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to = AV47TFIntCod_To ;
      AV216Formulaciontinte_listadodeformulas_wcds_24_tfintdsc = AV48TFIntDsc ;
      AV217Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel = AV49TFIntDsc_Sel ;
      AV218Formulaciontinte_listadodeformulas_wcds_26_tfintcodf = AV58TFIntCodF ;
      AV219Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to = AV59TFIntCodF_To ;
      AV220Formulaciontinte_listadodeformulas_wcds_28_tfintdscf = AV60TFIntDscF ;
      AV221Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel = AV61TFIntDscF_Sel ;
      AV222Formulaciontinte_listadodeformulas_wcds_30_tffornumcol = AV88TFForNumCol ;
      AV223Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to = AV89TFForNumCol_To ;
      AV224Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels = AV186TFForBlo_Sels ;
      AV225Formulaciontinte_listadodeformulas_wcds_33_tfforcosform = AV148TFForCosForm ;
      AV226Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to = AV149TFForCosForm_To ;
      AV227Formulaciontinte_listadodeformulas_wcds_35_tfforfec = AV90TFForFec ;
      AV228Formulaciontinte_listadodeformulas_wcds_36_tfforultmod = AV102TFForUltMod ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV170Emprcod, AV171Clicod, AV172Clicod_to, AV173Forser, AV174Forser_to, AV175Forcolnum, AV176Forcolnum_to, AV177Forcolnom, AV178Forcolnom_to, AV179Tipcolcod, AV180Tipcolcod_to, AV183ForNumColfrom, AV184ForNumColto, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV30TFCliCod, AV31TFCliCod_To, AV32TFCliNom, AV33TFCliNom_Sel, AV34TFForSer, AV35TFForSer_Sel, AV36TFForSerDsc, AV37TFForSerDsc_Sel, AV118TFForTipArt, AV119TFForTipArt_To, AV181TFForTipArtDsc, AV182TFForTipArtDsc_Sel, AV38TFForColNom, AV39TFForColNom_Sel, AV40TFForColNum, AV41TFForColNum_To, AV42TFTipColCod, AV43TFTipColCod_To, AV44TFTipColDsc, AV45TFTipColDsc_Sel, AV46TFIntCod, AV47TFIntCod_To, AV48TFIntDsc, AV49TFIntDsc_Sel, AV58TFIntCodF, AV59TFIntCodF_To, AV60TFIntDscF, AV61TFIntDscF_Sel, AV88TFForNumCol, AV89TFForNumCol_To, AV186TFForBlo_Sels, AV148TFForCosForm, AV149TFForCosForm_To, AV90TFForFec, AV102TFForUltMod, AV189Pgmname, AV12OrderedBy, AV13OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV193Formulaciontinte_listadodeformulas_wcds_1_filterfulltext = AV15FilterFullText ;
      AV194Formulaciontinte_listadodeformulas_wcds_2_tfclicod = AV30TFCliCod ;
      AV195Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to = AV31TFCliCod_To ;
      AV196Formulaciontinte_listadodeformulas_wcds_4_tfclinom = AV32TFCliNom ;
      AV197Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel = AV33TFCliNom_Sel ;
      AV198Formulaciontinte_listadodeformulas_wcds_6_tfforser = AV34TFForSer ;
      AV199Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel = AV35TFForSer_Sel ;
      AV200Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc = AV36TFForSerDsc ;
      AV201Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel = AV37TFForSerDsc_Sel ;
      AV202Formulaciontinte_listadodeformulas_wcds_10_tffortipart = AV118TFForTipArt ;
      AV203Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to = AV119TFForTipArt_To ;
      AV204Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc = AV181TFForTipArtDsc ;
      AV205Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel = AV182TFForTipArtDsc_Sel ;
      AV206Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom = AV38TFForColNom ;
      AV207Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel = AV39TFForColNom_Sel ;
      AV208Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum = AV40TFForColNum ;
      AV209Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to = AV41TFForColNum_To ;
      AV210Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod = AV42TFTipColCod ;
      AV211Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to = AV43TFTipColCod_To ;
      AV212Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc = AV44TFTipColDsc ;
      AV213Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel = AV45TFTipColDsc_Sel ;
      AV214Formulaciontinte_listadodeformulas_wcds_22_tfintcod = AV46TFIntCod ;
      AV215Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to = AV47TFIntCod_To ;
      AV216Formulaciontinte_listadodeformulas_wcds_24_tfintdsc = AV48TFIntDsc ;
      AV217Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel = AV49TFIntDsc_Sel ;
      AV218Formulaciontinte_listadodeformulas_wcds_26_tfintcodf = AV58TFIntCodF ;
      AV219Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to = AV59TFIntCodF_To ;
      AV220Formulaciontinte_listadodeformulas_wcds_28_tfintdscf = AV60TFIntDscF ;
      AV221Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel = AV61TFIntDscF_Sel ;
      AV222Formulaciontinte_listadodeformulas_wcds_30_tffornumcol = AV88TFForNumCol ;
      AV223Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to = AV89TFForNumCol_To ;
      AV224Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels = AV186TFForBlo_Sels ;
      AV225Formulaciontinte_listadodeformulas_wcds_33_tfforcosform = AV148TFForCosForm ;
      AV226Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to = AV149TFForCosForm_To ;
      AV227Formulaciontinte_listadodeformulas_wcds_35_tfforfec = AV90TFForFec ;
      AV228Formulaciontinte_listadodeformulas_wcds_36_tfforultmod = AV102TFForUltMod ;
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV170Emprcod, AV171Clicod, AV172Clicod_to, AV173Forser, AV174Forser_to, AV175Forcolnum, AV176Forcolnum_to, AV177Forcolnom, AV178Forcolnom_to, AV179Tipcolcod, AV180Tipcolcod_to, AV183ForNumColfrom, AV184ForNumColto, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV30TFCliCod, AV31TFCliCod_To, AV32TFCliNom, AV33TFCliNom_Sel, AV34TFForSer, AV35TFForSer_Sel, AV36TFForSerDsc, AV37TFForSerDsc_Sel, AV118TFForTipArt, AV119TFForTipArt_To, AV181TFForTipArtDsc, AV182TFForTipArtDsc_Sel, AV38TFForColNom, AV39TFForColNom_Sel, AV40TFForColNum, AV41TFForColNum_To, AV42TFTipColCod, AV43TFTipColCod_To, AV44TFTipColDsc, AV45TFTipColDsc_Sel, AV46TFIntCod, AV47TFIntCod_To, AV48TFIntDsc, AV49TFIntDsc_Sel, AV58TFIntCodF, AV59TFIntCodF_To, AV60TFIntDscF, AV61TFIntDscF_Sel, AV88TFForNumCol, AV89TFForNumCol_To, AV186TFForBlo_Sels, AV148TFForCosForm, AV149TFForCosForm_To, AV90TFForFec, AV102TFForUltMod, AV189Pgmname, AV12OrderedBy, AV13OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV193Formulaciontinte_listadodeformulas_wcds_1_filterfulltext = AV15FilterFullText ;
      AV194Formulaciontinte_listadodeformulas_wcds_2_tfclicod = AV30TFCliCod ;
      AV195Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to = AV31TFCliCod_To ;
      AV196Formulaciontinte_listadodeformulas_wcds_4_tfclinom = AV32TFCliNom ;
      AV197Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel = AV33TFCliNom_Sel ;
      AV198Formulaciontinte_listadodeformulas_wcds_6_tfforser = AV34TFForSer ;
      AV199Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel = AV35TFForSer_Sel ;
      AV200Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc = AV36TFForSerDsc ;
      AV201Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel = AV37TFForSerDsc_Sel ;
      AV202Formulaciontinte_listadodeformulas_wcds_10_tffortipart = AV118TFForTipArt ;
      AV203Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to = AV119TFForTipArt_To ;
      AV204Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc = AV181TFForTipArtDsc ;
      AV205Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel = AV182TFForTipArtDsc_Sel ;
      AV206Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom = AV38TFForColNom ;
      AV207Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel = AV39TFForColNom_Sel ;
      AV208Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum = AV40TFForColNum ;
      AV209Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to = AV41TFForColNum_To ;
      AV210Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod = AV42TFTipColCod ;
      AV211Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to = AV43TFTipColCod_To ;
      AV212Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc = AV44TFTipColDsc ;
      AV213Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel = AV45TFTipColDsc_Sel ;
      AV214Formulaciontinte_listadodeformulas_wcds_22_tfintcod = AV46TFIntCod ;
      AV215Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to = AV47TFIntCod_To ;
      AV216Formulaciontinte_listadodeformulas_wcds_24_tfintdsc = AV48TFIntDsc ;
      AV217Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel = AV49TFIntDsc_Sel ;
      AV218Formulaciontinte_listadodeformulas_wcds_26_tfintcodf = AV58TFIntCodF ;
      AV219Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to = AV59TFIntCodF_To ;
      AV220Formulaciontinte_listadodeformulas_wcds_28_tfintdscf = AV60TFIntDscF ;
      AV221Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel = AV61TFIntDscF_Sel ;
      AV222Formulaciontinte_listadodeformulas_wcds_30_tffornumcol = AV88TFForNumCol ;
      AV223Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to = AV89TFForNumCol_To ;
      AV224Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels = AV186TFForBlo_Sels ;
      AV225Formulaciontinte_listadodeformulas_wcds_33_tfforcosform = AV148TFForCosForm ;
      AV226Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to = AV149TFForCosForm_To ;
      AV227Formulaciontinte_listadodeformulas_wcds_35_tfforfec = AV90TFForFec ;
      AV228Formulaciontinte_listadodeformulas_wcds_36_tfforultmod = AV102TFForUltMod ;
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
         gxgrgrid_refresh( subGrid_Rows, AV170Emprcod, AV171Clicod, AV172Clicod_to, AV173Forser, AV174Forser_to, AV175Forcolnum, AV176Forcolnum_to, AV177Forcolnom, AV178Forcolnom_to, AV179Tipcolcod, AV180Tipcolcod_to, AV183ForNumColfrom, AV184ForNumColto, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV30TFCliCod, AV31TFCliCod_To, AV32TFCliNom, AV33TFCliNom_Sel, AV34TFForSer, AV35TFForSer_Sel, AV36TFForSerDsc, AV37TFForSerDsc_Sel, AV118TFForTipArt, AV119TFForTipArt_To, AV181TFForTipArtDsc, AV182TFForTipArtDsc_Sel, AV38TFForColNom, AV39TFForColNom_Sel, AV40TFForColNum, AV41TFForColNum_To, AV42TFTipColCod, AV43TFTipColCod_To, AV44TFTipColDsc, AV45TFTipColDsc_Sel, AV46TFIntCod, AV47TFIntCod_To, AV48TFIntDsc, AV49TFIntDsc_Sel, AV58TFIntCodF, AV59TFIntCodF_To, AV60TFIntDscF, AV61TFIntDscF_Sel, AV88TFForNumCol, AV89TFForNumCol_To, AV186TFForBlo_Sels, AV148TFForCosForm, AV149TFForCosForm_To, AV90TFForFec, AV102TFForUltMod, AV189Pgmname, AV12OrderedBy, AV13OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV193Formulaciontinte_listadodeformulas_wcds_1_filterfulltext = AV15FilterFullText ;
      AV194Formulaciontinte_listadodeformulas_wcds_2_tfclicod = AV30TFCliCod ;
      AV195Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to = AV31TFCliCod_To ;
      AV196Formulaciontinte_listadodeformulas_wcds_4_tfclinom = AV32TFCliNom ;
      AV197Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel = AV33TFCliNom_Sel ;
      AV198Formulaciontinte_listadodeformulas_wcds_6_tfforser = AV34TFForSer ;
      AV199Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel = AV35TFForSer_Sel ;
      AV200Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc = AV36TFForSerDsc ;
      AV201Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel = AV37TFForSerDsc_Sel ;
      AV202Formulaciontinte_listadodeformulas_wcds_10_tffortipart = AV118TFForTipArt ;
      AV203Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to = AV119TFForTipArt_To ;
      AV204Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc = AV181TFForTipArtDsc ;
      AV205Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel = AV182TFForTipArtDsc_Sel ;
      AV206Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom = AV38TFForColNom ;
      AV207Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel = AV39TFForColNom_Sel ;
      AV208Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum = AV40TFForColNum ;
      AV209Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to = AV41TFForColNum_To ;
      AV210Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod = AV42TFTipColCod ;
      AV211Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to = AV43TFTipColCod_To ;
      AV212Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc = AV44TFTipColDsc ;
      AV213Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel = AV45TFTipColDsc_Sel ;
      AV214Formulaciontinte_listadodeformulas_wcds_22_tfintcod = AV46TFIntCod ;
      AV215Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to = AV47TFIntCod_To ;
      AV216Formulaciontinte_listadodeformulas_wcds_24_tfintdsc = AV48TFIntDsc ;
      AV217Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel = AV49TFIntDsc_Sel ;
      AV218Formulaciontinte_listadodeformulas_wcds_26_tfintcodf = AV58TFIntCodF ;
      AV219Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to = AV59TFIntCodF_To ;
      AV220Formulaciontinte_listadodeformulas_wcds_28_tfintdscf = AV60TFIntDscF ;
      AV221Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel = AV61TFIntDscF_Sel ;
      AV222Formulaciontinte_listadodeformulas_wcds_30_tffornumcol = AV88TFForNumCol ;
      AV223Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to = AV89TFForNumCol_To ;
      AV224Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels = AV186TFForBlo_Sels ;
      AV225Formulaciontinte_listadodeformulas_wcds_33_tfforcosform = AV148TFForCosForm ;
      AV226Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to = AV149TFForCosForm_To ;
      AV227Formulaciontinte_listadodeformulas_wcds_35_tfforfec = AV90TFForFec ;
      AV228Formulaciontinte_listadodeformulas_wcds_36_tfforultmod = AV102TFForUltMod ;
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
         gxgrgrid_refresh( subGrid_Rows, AV170Emprcod, AV171Clicod, AV172Clicod_to, AV173Forser, AV174Forser_to, AV175Forcolnum, AV176Forcolnum_to, AV177Forcolnom, AV178Forcolnom_to, AV179Tipcolcod, AV180Tipcolcod_to, AV183ForNumColfrom, AV184ForNumColto, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV30TFCliCod, AV31TFCliCod_To, AV32TFCliNom, AV33TFCliNom_Sel, AV34TFForSer, AV35TFForSer_Sel, AV36TFForSerDsc, AV37TFForSerDsc_Sel, AV118TFForTipArt, AV119TFForTipArt_To, AV181TFForTipArtDsc, AV182TFForTipArtDsc_Sel, AV38TFForColNom, AV39TFForColNom_Sel, AV40TFForColNum, AV41TFForColNum_To, AV42TFTipColCod, AV43TFTipColCod_To, AV44TFTipColDsc, AV45TFTipColDsc_Sel, AV46TFIntCod, AV47TFIntCod_To, AV48TFIntDsc, AV49TFIntDsc_Sel, AV58TFIntCodF, AV59TFIntCodF_To, AV60TFIntDscF, AV61TFIntDscF_Sel, AV88TFForNumCol, AV89TFForNumCol_To, AV186TFForBlo_Sels, AV148TFForCosForm, AV149TFForCosForm_To, AV90TFForFec, AV102TFForUltMod, AV189Pgmname, AV12OrderedBy, AV13OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV193Formulaciontinte_listadodeformulas_wcds_1_filterfulltext = AV15FilterFullText ;
      AV194Formulaciontinte_listadodeformulas_wcds_2_tfclicod = AV30TFCliCod ;
      AV195Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to = AV31TFCliCod_To ;
      AV196Formulaciontinte_listadodeformulas_wcds_4_tfclinom = AV32TFCliNom ;
      AV197Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel = AV33TFCliNom_Sel ;
      AV198Formulaciontinte_listadodeformulas_wcds_6_tfforser = AV34TFForSer ;
      AV199Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel = AV35TFForSer_Sel ;
      AV200Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc = AV36TFForSerDsc ;
      AV201Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel = AV37TFForSerDsc_Sel ;
      AV202Formulaciontinte_listadodeformulas_wcds_10_tffortipart = AV118TFForTipArt ;
      AV203Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to = AV119TFForTipArt_To ;
      AV204Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc = AV181TFForTipArtDsc ;
      AV205Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel = AV182TFForTipArtDsc_Sel ;
      AV206Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom = AV38TFForColNom ;
      AV207Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel = AV39TFForColNom_Sel ;
      AV208Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum = AV40TFForColNum ;
      AV209Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to = AV41TFForColNum_To ;
      AV210Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod = AV42TFTipColCod ;
      AV211Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to = AV43TFTipColCod_To ;
      AV212Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc = AV44TFTipColDsc ;
      AV213Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel = AV45TFTipColDsc_Sel ;
      AV214Formulaciontinte_listadodeformulas_wcds_22_tfintcod = AV46TFIntCod ;
      AV215Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to = AV47TFIntCod_To ;
      AV216Formulaciontinte_listadodeformulas_wcds_24_tfintdsc = AV48TFIntDsc ;
      AV217Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel = AV49TFIntDsc_Sel ;
      AV218Formulaciontinte_listadodeformulas_wcds_26_tfintcodf = AV58TFIntCodF ;
      AV219Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to = AV59TFIntCodF_To ;
      AV220Formulaciontinte_listadodeformulas_wcds_28_tfintdscf = AV60TFIntDscF ;
      AV221Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel = AV61TFIntDscF_Sel ;
      AV222Formulaciontinte_listadodeformulas_wcds_30_tffornumcol = AV88TFForNumCol ;
      AV223Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to = AV89TFForNumCol_To ;
      AV224Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels = AV186TFForBlo_Sels ;
      AV225Formulaciontinte_listadodeformulas_wcds_33_tfforcosform = AV148TFForCosForm ;
      AV226Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to = AV149TFForCosForm_To ;
      AV227Formulaciontinte_listadodeformulas_wcds_35_tfforfec = AV90TFForFec ;
      AV228Formulaciontinte_listadodeformulas_wcds_36_tfforultmod = AV102TFForUltMod ;
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
         gxgrgrid_refresh( subGrid_Rows, AV170Emprcod, AV171Clicod, AV172Clicod_to, AV173Forser, AV174Forser_to, AV175Forcolnum, AV176Forcolnum_to, AV177Forcolnom, AV178Forcolnom_to, AV179Tipcolcod, AV180Tipcolcod_to, AV183ForNumColfrom, AV184ForNumColto, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV30TFCliCod, AV31TFCliCod_To, AV32TFCliNom, AV33TFCliNom_Sel, AV34TFForSer, AV35TFForSer_Sel, AV36TFForSerDsc, AV37TFForSerDsc_Sel, AV118TFForTipArt, AV119TFForTipArt_To, AV181TFForTipArtDsc, AV182TFForTipArtDsc_Sel, AV38TFForColNom, AV39TFForColNom_Sel, AV40TFForColNum, AV41TFForColNum_To, AV42TFTipColCod, AV43TFTipColCod_To, AV44TFTipColDsc, AV45TFTipColDsc_Sel, AV46TFIntCod, AV47TFIntCod_To, AV48TFIntDsc, AV49TFIntDsc_Sel, AV58TFIntCodF, AV59TFIntCodF_To, AV60TFIntDscF, AV61TFIntDscF_Sel, AV88TFForNumCol, AV89TFForNumCol_To, AV186TFForBlo_Sels, AV148TFForCosForm, AV149TFForCosForm_To, AV90TFForFec, AV102TFForUltMod, AV189Pgmname, AV12OrderedBy, AV13OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV189Pgmname = "FormulacionTinte.ListadodeFormulas_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV189Pgmname", AV189Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1KS0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e231KS2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV23ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV166DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV20ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_47 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_47"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV168GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV169GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV170Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV170Emprcod") ;
         wcpOAV171Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV171Clicod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV172Clicod_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV172Clicod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV173Forser = httpContext.cgiGet( sPrefix+"wcpOAV173Forser") ;
         wcpOAV174Forser_to = httpContext.cgiGet( sPrefix+"wcpOAV174Forser_to") ;
         wcpOAV175Forcolnum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV175Forcolnum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV176Forcolnum_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV176Forcolnum_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV177Forcolnom = httpContext.cgiGet( sPrefix+"wcpOAV177Forcolnom") ;
         wcpOAV178Forcolnom_to = httpContext.cgiGet( sPrefix+"wcpOAV178Forcolnom_to") ;
         wcpOAV179Tipcolcod = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV179Tipcolcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV180Tipcolcod_to = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV180Tipcolcod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV183ForNumColfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV183ForNumColfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV184ForNumColto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV184ForNumColto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         Innewwindow1_Width = httpContext.cgiGet( sPrefix+"INNEWWINDOW1_Width") ;
         Innewwindow1_Height = httpContext.cgiGet( sPrefix+"INNEWWINDOW1_Height") ;
         Innewwindow1_Target = httpContext.cgiGet( sPrefix+"INNEWWINDOW1_Target") ;
         Ddo_gridcolumnsselector_Caption = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption") ;
         Ddo_gridcolumnsselector_Tooltip = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip") ;
         Ddo_gridcolumnsselector_Cls = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls") ;
         Ddo_gridcolumnsselector_Dropdownoptionstype = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype") ;
         Ddo_gridcolumnsselector_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname") ;
         Ddo_gridcolumnsselector_Titlecontrolidtoreplace = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace") ;
         Dvelop_confirmpanel_informetipoficha_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_INFORMETIPOFICHA_Title") ;
         Dvelop_confirmpanel_informetipoficha_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_INFORMETIPOFICHA_Confirmationtext") ;
         Dvelop_confirmpanel_informetipoficha_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_INFORMETIPOFICHA_Yesbuttoncaption") ;
         Dvelop_confirmpanel_informetipoficha_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_INFORMETIPOFICHA_Nobuttoncaption") ;
         Dvelop_confirmpanel_informetipoficha_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_INFORMETIPOFICHA_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_informetipoficha_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_INFORMETIPOFICHA_Yesbuttonposition") ;
         Dvelop_confirmpanel_informetipoficha_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_INFORMETIPOFICHA_Confirmtype") ;
         Dvelop_confirmpanel_informeformulasconclaves_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_INFORMEFORMULASCONCLAVES_Title") ;
         Dvelop_confirmpanel_informeformulasconclaves_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_INFORMEFORMULASCONCLAVES_Confirmationtext") ;
         Dvelop_confirmpanel_informeformulasconclaves_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_INFORMEFORMULASCONCLAVES_Yesbuttoncaption") ;
         Dvelop_confirmpanel_informeformulasconclaves_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_INFORMEFORMULASCONCLAVES_Nobuttoncaption") ;
         Dvelop_confirmpanel_informeformulasconclaves_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_INFORMEFORMULASCONCLAVES_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_informeformulasconclaves_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_INFORMEFORMULASCONCLAVES_Yesbuttonposition") ;
         Dvelop_confirmpanel_informeformulasconclaves_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_INFORMEFORMULASCONCLAVES_Confirmtype") ;
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
         Dvelop_confirmpanel_informetipoficha_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_INFORMETIPOFICHA_Result") ;
         Dvelop_confirmpanel_informeformulasconclaves_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_INFORMEFORMULASCONCLAVES_Result") ;
         /* Read variables values. */
         AV15FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FilterFullText", AV15FilterFullText);
         AV189Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV189Pgmname", AV189Pgmname);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_forfecauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_FORFECAUXDATE");
            GX_FocusControl = edtavDdo_forfecauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV92DDO_ForFecAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92DDO_ForFecAuxDate", localUtil.format(AV92DDO_ForFecAuxDate, "99/99/99"));
         }
         else
         {
            AV92DDO_ForFecAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_forfecauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92DDO_ForFecAuxDate", localUtil.format(AV92DDO_ForFecAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_forultmodauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_FORULTMODAUXDATE");
            GX_FocusControl = edtavDdo_forultmodauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV104DDO_ForUltModAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV104DDO_ForUltModAuxDate", localUtil.format(AV104DDO_ForUltModAuxDate, "99/99/99"));
         }
         else
         {
            AV104DDO_ForUltModAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_forultmodauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV104DDO_ForUltModAuxDate", localUtil.format(AV104DDO_ForUltModAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ListadodeFormulas_WC");
         AV189Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV189Pgmname", AV189Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV189Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("formulaciontinte\\listadodeformulas_wc:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e231KS2 ();
      if (returnInSub) return;
   }

   public void e231KS2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV190Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      listadodeformulas_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV190Station = GXt_char1 ;
      GXv_char2[0] = AV170Emprcod ;
      GXv_char3[0] = AV191Emprnom ;
      GXv_char4[0] = AV192Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV190Station, GXv_char2, GXv_char3, GXv_char4) ;
      listadodeformulas_wc_impl.this.AV170Emprcod = GXv_char2[0] ;
      listadodeformulas_wc_impl.this.AV191Emprnom = GXv_char3[0] ;
      listadodeformulas_wc_impl.this.AV192Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV170Emprcod", AV170Emprcod);
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV166DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV166DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e241KS2( )
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
      if ( GXutil.strcmp(AV22Session.getValue("FormulacionTinte.ListadodeFormulas_WCColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV22Session.getValue("FormulacionTinte.ListadodeFormulas_WCColumnsSelector") ;
         AV20ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtCliCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Visible), 5, 0), !bGXsfl_47_Refreshing);
      edtCliNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Visible), 5, 0), !bGXsfl_47_Refreshing);
      edtForSer_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForSer_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForSer_Visible), 5, 0), !bGXsfl_47_Refreshing);
      edtForSerDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForSerDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForSerDsc_Visible), 5, 0), !bGXsfl_47_Refreshing);
      edtForTipArt_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForTipArt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForTipArt_Visible), 5, 0), !bGXsfl_47_Refreshing);
      edtForTipArtD_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForTipArtD_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForTipArtD_Visible), 5, 0), !bGXsfl_47_Refreshing);
      edtForColNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForColNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForColNom_Visible), 5, 0), !bGXsfl_47_Refreshing);
      edtForColNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForColNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForColNum_Visible), 5, 0), !bGXsfl_47_Refreshing);
      edtTipColCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtTipColCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipColCod_Visible), 5, 0), !bGXsfl_47_Refreshing);
      edtTipColDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtTipColDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipColDsc_Visible), 5, 0), !bGXsfl_47_Refreshing);
      edtIntCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtIntCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntCod_Visible), 5, 0), !bGXsfl_47_Refreshing);
      edtIntDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtIntDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntDsc_Visible), 5, 0), !bGXsfl_47_Refreshing);
      edtIntCodF_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtIntCodF_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntCodF_Visible), 5, 0), !bGXsfl_47_Refreshing);
      edtIntDscF_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtIntDscF_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntDscF_Visible), 5, 0), !bGXsfl_47_Refreshing);
      edtForNumCol_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForNumCol_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForNumCol_Visible), 5, 0), !bGXsfl_47_Refreshing);
      cmbForBlo.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbForBlo.getInternalname(), "Visible", GXutil.ltrimstr( cmbForBlo.getVisible(), 5, 0), !bGXsfl_47_Refreshing);
      edtForCosForm_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForCosForm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForCosForm_Visible), 5, 0), !bGXsfl_47_Refreshing);
      edtForFec_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForFec_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForFec_Visible), 5, 0), !bGXsfl_47_Refreshing);
      edtForUltMod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForUltMod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForUltMod_Visible), 5, 0), !bGXsfl_47_Refreshing);
      AV168GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV168GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV168GridCurrentPage), 10, 0));
      AV169GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV169GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV169GridPageCount), 10, 0));
      AV193Formulaciontinte_listadodeformulas_wcds_1_filterfulltext = AV15FilterFullText ;
      AV194Formulaciontinte_listadodeformulas_wcds_2_tfclicod = AV30TFCliCod ;
      AV195Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to = AV31TFCliCod_To ;
      AV196Formulaciontinte_listadodeformulas_wcds_4_tfclinom = AV32TFCliNom ;
      AV197Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel = AV33TFCliNom_Sel ;
      AV198Formulaciontinte_listadodeformulas_wcds_6_tfforser = AV34TFForSer ;
      AV199Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel = AV35TFForSer_Sel ;
      AV200Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc = AV36TFForSerDsc ;
      AV201Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel = AV37TFForSerDsc_Sel ;
      AV202Formulaciontinte_listadodeformulas_wcds_10_tffortipart = AV118TFForTipArt ;
      AV203Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to = AV119TFForTipArt_To ;
      AV204Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc = AV181TFForTipArtDsc ;
      AV205Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel = AV182TFForTipArtDsc_Sel ;
      AV206Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom = AV38TFForColNom ;
      AV207Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel = AV39TFForColNom_Sel ;
      AV208Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum = AV40TFForColNum ;
      AV209Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to = AV41TFForColNum_To ;
      AV210Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod = AV42TFTipColCod ;
      AV211Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to = AV43TFTipColCod_To ;
      AV212Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc = AV44TFTipColDsc ;
      AV213Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel = AV45TFTipColDsc_Sel ;
      AV214Formulaciontinte_listadodeformulas_wcds_22_tfintcod = AV46TFIntCod ;
      AV215Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to = AV47TFIntCod_To ;
      AV216Formulaciontinte_listadodeformulas_wcds_24_tfintdsc = AV48TFIntDsc ;
      AV217Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel = AV49TFIntDsc_Sel ;
      AV218Formulaciontinte_listadodeformulas_wcds_26_tfintcodf = AV58TFIntCodF ;
      AV219Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to = AV59TFIntCodF_To ;
      AV220Formulaciontinte_listadodeformulas_wcds_28_tfintdscf = AV60TFIntDscF ;
      AV221Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel = AV61TFIntDscF_Sel ;
      AV222Formulaciontinte_listadodeformulas_wcds_30_tffornumcol = AV88TFForNumCol ;
      AV223Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to = AV89TFForNumCol_To ;
      AV224Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels = AV186TFForBlo_Sels ;
      AV225Formulaciontinte_listadodeformulas_wcds_33_tfforcosform = AV148TFForCosForm ;
      AV226Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to = AV149TFForCosForm_To ;
      AV227Formulaciontinte_listadodeformulas_wcds_35_tfforfec = AV90TFForFec ;
      AV228Formulaciontinte_listadodeformulas_wcds_36_tfforultmod = AV102TFForUltMod ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e151KS2( )
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
         AV167PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV167PageToGo) ;
      }
   }

   public void e161KS2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e171KS2( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliCod") == 0 )
         {
            AV30TFCliCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TFCliCod), 6, 0));
            AV31TFCliCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliNom") == 0 )
         {
            AV32TFCliNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFCliNom", AV32TFCliNom);
            AV33TFCliNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFCliNom_Sel", AV33TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForSer") == 0 )
         {
            AV34TFForSer = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFForSer", AV34TFForSer);
            AV35TFForSer_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFForSer_Sel", AV35TFForSer_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForSerDsc") == 0 )
         {
            AV36TFForSerDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFForSerDsc", AV36TFForSerDsc);
            AV37TFForSerDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFForSerDsc_Sel", AV37TFForSerDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForTipArt") == 0 )
         {
            AV118TFForTipArt = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV118TFForTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV118TFForTipArt), 4, 0));
            AV119TFForTipArt_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV119TFForTipArt_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV119TFForTipArt_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForTipArtDsc") == 0 )
         {
            AV181TFForTipArtDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV181TFForTipArtDsc", AV181TFForTipArtDsc);
            AV182TFForTipArtDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV182TFForTipArtDsc_Sel", AV182TFForTipArtDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForColNom") == 0 )
         {
            AV38TFForColNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFForColNom", AV38TFForColNom);
            AV39TFForColNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFForColNom_Sel", AV39TFForColNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForColNum") == 0 )
         {
            AV40TFForColNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TFForColNum), 6, 0));
            AV41TFForColNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFForColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41TFForColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "TipColCod") == 0 )
         {
            AV42TFTipColCod = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFTipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFTipColCod), 2, 0));
            AV43TFTipColCod_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFTipColCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43TFTipColCod_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "TipColDsc") == 0 )
         {
            AV44TFTipColDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFTipColDsc", AV44TFTipColDsc);
            AV45TFTipColDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFTipColDsc_Sel", AV45TFTipColDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "IntCod") == 0 )
         {
            AV46TFIntCod = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFIntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46TFIntCod), 2, 0));
            AV47TFIntCod_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFIntCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFIntCod_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "IntDsc") == 0 )
         {
            AV48TFIntDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFIntDsc", AV48TFIntDsc);
            AV49TFIntDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFIntDsc_Sel", AV49TFIntDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "IntCodF") == 0 )
         {
            AV58TFIntCodF = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFIntCodF", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58TFIntCodF), 2, 0));
            AV59TFIntCodF_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFIntCodF_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59TFIntCodF_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "IntDscF") == 0 )
         {
            AV60TFIntDscF = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFIntDscF", AV60TFIntDscF);
            AV61TFIntDscF_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFIntDscF_Sel", AV61TFIntDscF_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForNumCol") == 0 )
         {
            AV88TFForNumCol = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88TFForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV88TFForNumCol), 8, 0));
            AV89TFForNumCol_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89TFForNumCol_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV89TFForNumCol_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForBlo") == 0 )
         {
            AV185TFForBlo_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV185TFForBlo_SelsJson", AV185TFForBlo_SelsJson);
            AV186TFForBlo_Sels.fromJSonString(AV185TFForBlo_SelsJson, null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForCosForm") == 0 )
         {
            AV148TFForCosForm = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV148TFForCosForm", GXutil.ltrimstr( AV148TFForCosForm, 11, 5));
            AV149TFForCosForm_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV149TFForCosForm_To", GXutil.ltrimstr( AV149TFForCosForm_To, 11, 5));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForFec") == 0 )
         {
            AV90TFForFec = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90TFForFec", localUtil.format(AV90TFForFec, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForUltMod") == 0 )
         {
            AV102TFForUltMod = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV102TFForUltMod", localUtil.format(AV102TFForUltMod, "99/99/99"));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV186TFForBlo_Sels", AV186TFForBlo_Sels);
   }

   private void e251KS2( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(47) ;
         }
         sendrow_472( ) ;
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
      if ( isFullAjaxMode( ) && ! bGXsfl_47_Refreshing )
      {
         httpContext.doAjaxLoad(47, GridRow);
      }
   }

   public void e181KS2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV18ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV20ColumnsSelector.fromJSonString(AV18ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.ListadodeFormulas_WCColumnsSelector", ((GXutil.strcmp("", AV18ColumnsSelectorXML)==0) ? "" : AV20ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e141KS2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("FormulacionTinte.ListadodeFormulas_WCFilters")),GXutil.URLEncode(GXutil.rtrim(AV189Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("FormulacionTinte.ListadodeFormulas_WCFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV24ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "FormulacionTinte.ListadodeFormulas_WCFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         listadodeformulas_wc_impl.this.GXt_char1 = GXv_char4[0] ;
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
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV189Pgmname+"GridState", AV24ManageFiltersXml) ;
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
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV186TFForBlo_Sels", AV186TFForBlo_Sels);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ManageFiltersData", AV23ManageFiltersData);
   }

   public void e191KS2( )
   {
      /* Dvelop_confirmpanel_informetipoficha_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_informetipoficha_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION INFORMETIPOFICHA' */
         S192 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e201KS2( )
   {
      /* Dvelop_confirmpanel_informeformulasconclaves_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_informeformulasconclaves_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION INFORMEFORMULASCONCLAVES' */
         S202 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e211KS2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV16ExcelFilename ;
      GXv_char3[0] = AV17ErrorMessage ;
      new app.formulaciontinte.listadodeformulas_wcexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      listadodeformulas_wc_impl.this.AV16ExcelFilename = GXv_char4[0] ;
      listadodeformulas_wc_impl.this.AV17ErrorMessage = GXv_char3[0] ;
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

   public void e221KS2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.formulaciontinte.listadodeformulas_wcexportcsv", new String[] {}, new String[] {}) );
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
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CliCod", "", "Cliente", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CliNom", "", "Nombre", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ForSer", "", "Articulo", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ForSerDsc", "", "Descripcion", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ForTipArt", "", "Tipo Articulo", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ForTipArtDsc", "", "Descripcion", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ForColNom", "", "Color", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ForColNum", "", "Numero", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "TipColCod", "", "TC", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "TipColDsc", "", "Descripcion", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "IntCod", "", "Intensidad", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "IntDsc", "", "Descripcion", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "IntCodF", "", "Cod. Int. Fact.", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "IntDscF", "", "Intensidad Fact.", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ForNumCol", "", "Nº Interno F.", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ForBlo", "", "Bloqueo Color?", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ForCosForm", "", "Coste Formula", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ForFec", "", "Fecha Formula", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ForUltMod", "", "Ultima Modificacion", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV19UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.ListadodeFormulas_WCColumnsSelector", GXv_char4) ;
      listadodeformulas_wc_impl.this.GXt_char1 = GXv_char4[0] ;
      AV19UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV19UserCustomValue)==0) ) )
      {
         AV21ColumnsSelectorAux.fromxml(AV19UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector8[0] = AV21ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector9[0] = AV20ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, GXv_SdtWWPColumnsSelector9) ;
         AV21ColumnsSelectorAux = GXv_SdtWWPColumnsSelector8[0] ;
         AV20ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = AV23ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "FormulacionTinte.ListadodeFormulas_WCFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV23ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV15FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FilterFullText", AV15FilterFullText);
      AV30TFCliCod = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TFCliCod), 6, 0));
      AV31TFCliCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TFCliCod_To), 6, 0));
      AV32TFCliNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFCliNom", AV32TFCliNom);
      AV33TFCliNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFCliNom_Sel", AV33TFCliNom_Sel);
      AV34TFForSer = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFForSer", AV34TFForSer);
      AV35TFForSer_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFForSer_Sel", AV35TFForSer_Sel);
      AV36TFForSerDsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFForSerDsc", AV36TFForSerDsc);
      AV37TFForSerDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFForSerDsc_Sel", AV37TFForSerDsc_Sel);
      AV118TFForTipArt = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV118TFForTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV118TFForTipArt), 4, 0));
      AV119TFForTipArt_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV119TFForTipArt_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV119TFForTipArt_To), 4, 0));
      AV181TFForTipArtDsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV181TFForTipArtDsc", AV181TFForTipArtDsc);
      AV182TFForTipArtDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV182TFForTipArtDsc_Sel", AV182TFForTipArtDsc_Sel);
      AV38TFForColNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFForColNom", AV38TFForColNom);
      AV39TFForColNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFForColNom_Sel", AV39TFForColNom_Sel);
      AV40TFForColNum = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TFForColNum), 6, 0));
      AV41TFForColNum_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFForColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41TFForColNum_To), 6, 0));
      AV42TFTipColCod = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFTipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFTipColCod), 2, 0));
      AV43TFTipColCod_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFTipColCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43TFTipColCod_To), 2, 0));
      AV44TFTipColDsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFTipColDsc", AV44TFTipColDsc);
      AV45TFTipColDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFTipColDsc_Sel", AV45TFTipColDsc_Sel);
      AV46TFIntCod = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFIntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46TFIntCod), 2, 0));
      AV47TFIntCod_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFIntCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFIntCod_To), 2, 0));
      AV48TFIntDsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFIntDsc", AV48TFIntDsc);
      AV49TFIntDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFIntDsc_Sel", AV49TFIntDsc_Sel);
      AV58TFIntCodF = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFIntCodF", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58TFIntCodF), 2, 0));
      AV59TFIntCodF_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFIntCodF_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59TFIntCodF_To), 2, 0));
      AV60TFIntDscF = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFIntDscF", AV60TFIntDscF);
      AV61TFIntDscF_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFIntDscF_Sel", AV61TFIntDscF_Sel);
      AV88TFForNumCol = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88TFForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV88TFForNumCol), 8, 0));
      AV89TFForNumCol_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89TFForNumCol_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV89TFForNumCol_To), 8, 0));
      AV186TFForBlo_Sels = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV148TFForCosForm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV148TFForCosForm", GXutil.ltrimstr( AV148TFForCosForm, 11, 5));
      AV149TFForCosForm_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV149TFForCosForm_To", GXutil.ltrimstr( AV149TFForCosForm_To, 11, 5));
      AV90TFForFec = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90TFForFec", localUtil.format(AV90TFForFec, "99/99/99"));
      AV102TFForUltMod = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV102TFForUltMod", localUtil.format(AV102TFForUltMod, "99/99/99"));
      Ddo_grid_Selectedvalue_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      Ddo_grid_Filteredtext_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S192( )
   {
      /* 'DO ACTION INFORMETIPOFICHA' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.formulaciontinte.rfo0002", new String[] {GXutil.URLEncode(GXutil.rtrim(AV170Emprcod)),GXutil.URLEncode(GXutil.rtrim(" ")),GXutil.URLEncode(GXutil.ltrimstr(AV171Clicod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV172Clicod_to,6,0)),GXutil.URLEncode(GXutil.rtrim(AV173Forser)),GXutil.URLEncode(GXutil.rtrim(AV174Forser_to)),GXutil.URLEncode(GXutil.ltrimstr(AV175Forcolnum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV176Forcolnum_to,6,0)),GXutil.URLEncode(GXutil.rtrim(AV177Forcolnom)),GXutil.URLEncode(GXutil.rtrim(AV178Forcolnom_to)),GXutil.URLEncode(GXutil.ltrimstr(AV179Tipcolcod,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV180Tipcolcod_to,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV183ForNumColfrom,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV184ForNumColto,8,0)),GXutil.URLEncode(GXutil.rtrim(" "))}, new String[] {"EmprCod","ImpCod","PCliCod","UCliCod","PSerie","USerie","PColor","UColor","PNumCol","UNumCol","tc1","Tc2","fornumcolfrom","fornumcolto","Output"}) , new Object[] {"AV170Emprcod","","AV171Clicod","AV172Clicod_to","AV173Forser","AV174Forser_to","AV175Forcolnum","AV176Forcolnum_to","AV177Forcolnom","AV178Forcolnom_to","AV179Tipcolcod","AV180Tipcolcod_to","AV183ForNumColfrom","AV184ForNumColto",""});
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S202( )
   {
      /* 'DO ACTION INFORMEFORMULASCONCLAVES' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.formulaciontinte.rldform", new String[] {GXutil.URLEncode(GXutil.rtrim(AV170Emprcod)),GXutil.URLEncode(GXutil.rtrim(" ")),GXutil.URLEncode(GXutil.ltrimstr(AV171Clicod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV172Clicod_to,6,0)),GXutil.URLEncode(GXutil.rtrim(AV173Forser)),GXutil.URLEncode(GXutil.rtrim(AV174Forser_to)),GXutil.URLEncode(GXutil.ltrimstr(AV175Forcolnum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV176Forcolnum_to,6,0)),GXutil.URLEncode(GXutil.rtrim(AV177Forcolnom)),GXutil.URLEncode(GXutil.rtrim(AV178Forcolnom_to)),GXutil.URLEncode(GXutil.ltrimstr(AV179Tipcolcod,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV180Tipcolcod_to,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV183ForNumColfrom,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV184ForNumColto,8,0))}, new String[] {"EmprCod","ImpCod","PCliCod","UCliCod","PSerie","USerie","PColor","UColor","PNumCol","UNumCol","tc1","tc2","PForNumCol","UForNumCol"}) , new Object[] {"AV170Emprcod","","AV171Clicod","AV172Clicod_to","AV173Forser","AV174Forser_to","AV175Forcolnum","AV176Forcolnum_to","AV177Forcolnom","AV178Forcolnom_to","AV179Tipcolcod","AV180Tipcolcod_to","AV183ForNumColfrom","AV184ForNumColto"});
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV22Session.getValue(AV189Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV189Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV22Session.getValue(AV189Pgmname+"GridState"), null, null);
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
      AV229GXV1 = 1 ;
      while ( AV229GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV229GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV15FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FilterFullText", AV15FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV30TFCliCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TFCliCod), 6, 0));
            AV31TFCliCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV32TFCliNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFCliNom", AV32TFCliNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV33TFCliNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFCliNom_Sel", AV33TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER") == 0 )
         {
            AV34TFForSer = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFForSer", AV34TFForSer);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER_SEL") == 0 )
         {
            AV35TFForSer_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFForSer_Sel", AV35TFForSer_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSERDSC") == 0 )
         {
            AV36TFForSerDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFForSerDsc", AV36TFForSerDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSERDSC_SEL") == 0 )
         {
            AV37TFForSerDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFForSerDsc_Sel", AV37TFForSerDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORTIPART") == 0 )
         {
            AV118TFForTipArt = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV118TFForTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV118TFForTipArt), 4, 0));
            AV119TFForTipArt_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV119TFForTipArt_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV119TFForTipArt_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORTIPARTDSC") == 0 )
         {
            AV181TFForTipArtDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV181TFForTipArtDsc", AV181TFForTipArtDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORTIPARTDSC_SEL") == 0 )
         {
            AV182TFForTipArtDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV182TFForTipArtDsc_Sel", AV182TFForTipArtDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM") == 0 )
         {
            AV38TFForColNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFForColNom", AV38TFForColNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM_SEL") == 0 )
         {
            AV39TFForColNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFForColNom_Sel", AV39TFForColNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNUM") == 0 )
         {
            AV40TFForColNum = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TFForColNum), 6, 0));
            AV41TFForColNum_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFForColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41TFForColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLCOD") == 0 )
         {
            AV42TFTipColCod = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFTipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFTipColCod), 2, 0));
            AV43TFTipColCod_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFTipColCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43TFTipColCod_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLDSC") == 0 )
         {
            AV44TFTipColDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFTipColDsc", AV44TFTipColDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLDSC_SEL") == 0 )
         {
            AV45TFTipColDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFTipColDsc_Sel", AV45TFTipColDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTCOD") == 0 )
         {
            AV46TFIntCod = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFIntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46TFIntCod), 2, 0));
            AV47TFIntCod_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFIntCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFIntCod_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTDSC") == 0 )
         {
            AV48TFIntDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFIntDsc", AV48TFIntDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTDSC_SEL") == 0 )
         {
            AV49TFIntDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFIntDsc_Sel", AV49TFIntDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTCODF") == 0 )
         {
            AV58TFIntCodF = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFIntCodF", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58TFIntCodF), 2, 0));
            AV59TFIntCodF_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFIntCodF_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59TFIntCodF_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTDSCF") == 0 )
         {
            AV60TFIntDscF = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFIntDscF", AV60TFIntDscF);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTDSCF_SEL") == 0 )
         {
            AV61TFIntDscF_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFIntDscF_Sel", AV61TFIntDscF_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORNUMCOL") == 0 )
         {
            AV88TFForNumCol = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88TFForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV88TFForNumCol), 8, 0));
            AV89TFForNumCol_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89TFForNumCol_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV89TFForNumCol_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORBLO_SEL") == 0 )
         {
            AV185TFForBlo_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV185TFForBlo_SelsJson", AV185TFForBlo_SelsJson);
            AV186TFForBlo_Sels.fromJSonString(AV185TFForBlo_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOSFORM") == 0 )
         {
            AV148TFForCosForm = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV148TFForCosForm", GXutil.ltrimstr( AV148TFForCosForm, 11, 5));
            AV149TFForCosForm_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV149TFForCosForm_To", GXutil.ltrimstr( AV149TFForCosForm_To, 11, 5));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORFEC") == 0 )
         {
            AV90TFForFec = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90TFForFec", localUtil.format(AV90TFForFec, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORULTMOD") == 0 )
         {
            AV102TFForUltMod = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV102TFForUltMod", localUtil.format(AV102TFForUltMod, "99/99/99"));
         }
         AV229GXV1 = (int)(AV229GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV33TFCliNom_Sel)==0), AV33TFCliNom_Sel, GXv_char4) ;
      listadodeformulas_wc_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV35TFForSer_Sel)==0), AV35TFForSer_Sel, GXv_char3) ;
      listadodeformulas_wc_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char13 = "" ;
      GXv_char2[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV37TFForSerDsc_Sel)==0), AV37TFForSerDsc_Sel, GXv_char2) ;
      listadodeformulas_wc_impl.this.GXt_char13 = GXv_char2[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV182TFForTipArtDsc_Sel)==0), AV182TFForTipArtDsc_Sel, GXv_char15) ;
      listadodeformulas_wc_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV39TFForColNom_Sel)==0), AV39TFForColNom_Sel, GXv_char17) ;
      listadodeformulas_wc_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV45TFTipColDsc_Sel)==0), AV45TFTipColDsc_Sel, GXv_char19) ;
      listadodeformulas_wc_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV49TFIntDsc_Sel)==0), AV49TFIntDsc_Sel, GXv_char21) ;
      listadodeformulas_wc_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV61TFIntDscF_Sel)==0), AV61TFIntDscF_Sel, GXv_char23) ;
      listadodeformulas_wc_impl.this.GXt_char22 = GXv_char23[0] ;
      GXt_char24 = "" ;
      GXv_char25[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV186TFForBlo_Sels.size()==0), AV185TFForBlo_SelsJson, GXv_char25) ;
      listadodeformulas_wc_impl.this.GXt_char24 = GXv_char25[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"|"+GXt_char12+"|"+GXt_char13+"||"+GXt_char14+"|"+GXt_char16+"|||"+GXt_char18+"||"+GXt_char20+"||"+GXt_char22+"||"+GXt_char24+"|||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char24 = "" ;
      GXv_char25[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV32TFCliNom)==0), AV32TFCliNom, GXv_char25) ;
      listadodeformulas_wc_impl.this.GXt_char24 = GXv_char25[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV34TFForSer)==0), AV34TFForSer, GXv_char23) ;
      listadodeformulas_wc_impl.this.GXt_char22 = GXv_char23[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV36TFForSerDsc)==0), AV36TFForSerDsc, GXv_char21) ;
      listadodeformulas_wc_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV181TFForTipArtDsc)==0), AV181TFForTipArtDsc, GXv_char19) ;
      listadodeformulas_wc_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV38TFForColNom)==0), AV38TFForColNom, GXv_char17) ;
      listadodeformulas_wc_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV44TFTipColDsc)==0), AV44TFTipColDsc, GXv_char15) ;
      listadodeformulas_wc_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char13 = "" ;
      GXv_char4[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV48TFIntDsc)==0), AV48TFIntDsc, GXv_char4) ;
      listadodeformulas_wc_impl.this.GXt_char13 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV60TFIntDscF)==0), AV60TFIntDscF, GXv_char3) ;
      listadodeformulas_wc_impl.this.GXt_char12 = GXv_char3[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV30TFCliCod) ? "" : GXutil.str( AV30TFCliCod, 6, 0))+"|"+GXt_char24+"|"+GXt_char22+"|"+GXt_char20+"|"+((0==AV118TFForTipArt) ? "" : GXutil.str( AV118TFForTipArt, 4, 0))+"|"+GXt_char18+"|"+GXt_char16+"|"+((0==AV40TFForColNum) ? "" : GXutil.str( AV40TFForColNum, 6, 0))+"|"+((0==AV42TFTipColCod) ? "" : GXutil.str( AV42TFTipColCod, 2, 0))+"|"+GXt_char14+"|"+((0==AV46TFIntCod) ? "" : GXutil.str( AV46TFIntCod, 2, 0))+"|"+GXt_char13+"|"+((0==AV58TFIntCodF) ? "" : GXutil.str( AV58TFIntCodF, 2, 0))+"|"+GXt_char12+"|"+((0==AV88TFForNumCol) ? "" : GXutil.str( AV88TFForNumCol, 8, 0))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV148TFForCosForm)==0) ? "" : GXutil.str( AV148TFForCosForm, 11, 5))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV90TFForFec)) ? "" : localUtil.dtoc( AV90TFForFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV102TFForUltMod)) ? "" : localUtil.dtoc( AV102TFForUltMod, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV31TFCliCod_To) ? "" : GXutil.str( AV31TFCliCod_To, 6, 0))+"||||"+((0==AV119TFForTipArt_To) ? "" : GXutil.str( AV119TFForTipArt_To, 4, 0))+"|||"+((0==AV41TFForColNum_To) ? "" : GXutil.str( AV41TFForColNum_To, 6, 0))+"|"+((0==AV43TFTipColCod_To) ? "" : GXutil.str( AV43TFTipColCod_To, 2, 0))+"||"+((0==AV47TFIntCod_To) ? "" : GXutil.str( AV47TFIntCod_To, 2, 0))+"||"+((0==AV59TFIntCodF_To) ? "" : GXutil.str( AV59TFIntCodF_To, 2, 0))+"||"+((0==AV89TFForNumCol_To) ? "" : GXutil.str( AV89TFForNumCol_To, 8, 0))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV149TFForCosForm_To)==0) ? "" : GXutil.str( AV149TFForCosForm_To, 11, 5))+"||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV22Session.getValue(AV189Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState26, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV15FilterFullText)==0), (short)(0), AV15FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFCLICOD", "", !((0==AV30TFCliCod)&&(0==AV31TFCliCod_To)), (short)(0), GXutil.trim( GXutil.str( AV30TFCliCod, 6, 0)), GXutil.trim( GXutil.str( AV31TFCliCod_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFCLINOM", "", !(GXutil.strcmp("", AV32TFCliNom)==0), (short)(0), AV32TFCliNom, "", !(GXutil.strcmp("", AV33TFCliNom_Sel)==0), AV33TFCliNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFFORSER", "", !(GXutil.strcmp("", AV34TFForSer)==0), (short)(0), AV34TFForSer, "", !(GXutil.strcmp("", AV35TFForSer_Sel)==0), AV35TFForSer_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFFORSERDSC", "", !(GXutil.strcmp("", AV36TFForSerDsc)==0), (short)(0), AV36TFForSerDsc, "", !(GXutil.strcmp("", AV37TFForSerDsc_Sel)==0), AV37TFForSerDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFFORTIPART", "", !((0==AV118TFForTipArt)&&(0==AV119TFForTipArt_To)), (short)(0), GXutil.trim( GXutil.str( AV118TFForTipArt, 4, 0)), GXutil.trim( GXutil.str( AV119TFForTipArt_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFFORTIPARTDSC", "", !(GXutil.strcmp("", AV181TFForTipArtDsc)==0), (short)(0), AV181TFForTipArtDsc, "", !(GXutil.strcmp("", AV182TFForTipArtDsc_Sel)==0), AV182TFForTipArtDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFFORCOLNOM", "", !(GXutil.strcmp("", AV38TFForColNom)==0), (short)(0), AV38TFForColNom, "", !(GXutil.strcmp("", AV39TFForColNom_Sel)==0), AV39TFForColNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFFORCOLNUM", "", !((0==AV40TFForColNum)&&(0==AV41TFForColNum_To)), (short)(0), GXutil.trim( GXutil.str( AV40TFForColNum, 6, 0)), GXutil.trim( GXutil.str( AV41TFForColNum_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFTIPCOLCOD", "", !((0==AV42TFTipColCod)&&(0==AV43TFTipColCod_To)), (short)(0), GXutil.trim( GXutil.str( AV42TFTipColCod, 2, 0)), GXutil.trim( GXutil.str( AV43TFTipColCod_To, 2, 0))) ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFTIPCOLDSC", "", !(GXutil.strcmp("", AV44TFTipColDsc)==0), (short)(0), AV44TFTipColDsc, "", !(GXutil.strcmp("", AV45TFTipColDsc_Sel)==0), AV45TFTipColDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFINTCOD", "", !((0==AV46TFIntCod)&&(0==AV47TFIntCod_To)), (short)(0), GXutil.trim( GXutil.str( AV46TFIntCod, 2, 0)), GXutil.trim( GXutil.str( AV47TFIntCod_To, 2, 0))) ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFINTDSC", "", !(GXutil.strcmp("", AV48TFIntDsc)==0), (short)(0), AV48TFIntDsc, "", !(GXutil.strcmp("", AV49TFIntDsc_Sel)==0), AV49TFIntDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFINTCODF", "", !((0==AV58TFIntCodF)&&(0==AV59TFIntCodF_To)), (short)(0), GXutil.trim( GXutil.str( AV58TFIntCodF, 2, 0)), GXutil.trim( GXutil.str( AV59TFIntCodF_To, 2, 0))) ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFINTDSCF", "", !(GXutil.strcmp("", AV60TFIntDscF)==0), (short)(0), AV60TFIntDscF, "", !(GXutil.strcmp("", AV61TFIntDscF_Sel)==0), AV61TFIntDscF_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFFORNUMCOL", "", !((0==AV88TFForNumCol)&&(0==AV89TFForNumCol_To)), (short)(0), GXutil.trim( GXutil.str( AV88TFForNumCol, 8, 0)), GXutil.trim( GXutil.str( AV89TFForNumCol_To, 8, 0))) ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFFORBLO_SEL", "", !(AV186TFForBlo_Sels.size()==0), (short)(0), AV186TFForBlo_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFFORCOSFORM", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV148TFForCosForm)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV149TFForCosForm_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV148TFForCosForm, 11, 5)), GXutil.trim( GXutil.str( AV149TFForCosForm_To, 11, 5))) ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFFORFEC", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV90TFForFec)), (short)(0), GXutil.trim( localUtil.dtoc( AV90TFForFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFFORULTMOD", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV102TFForUltMod)), (short)(0), GXutil.trim( localUtil.dtoc( AV102TFForUltMod, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      if ( ! (GXutil.strcmp("", AV170Emprcod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV170Emprcod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV171Clicod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV171Clicod, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV172Clicod_to) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICOD_TO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV172Clicod_to, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV173Forser)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FORSER" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV173Forser );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV174Forser_to)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FORSER_TO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV174Forser_to );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV175Forcolnum) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FORCOLNUM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV175Forcolnum, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV176Forcolnum_to) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FORCOLNUM_TO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV176Forcolnum_to, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV177Forcolnom)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FORCOLNOM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV177Forcolnom );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV178Forcolnom_to)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FORCOLNOM_TO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV178Forcolnom_to );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV179Tipcolcod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&TIPCOLCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV179Tipcolcod, 2, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV180Tipcolcod_to) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&TIPCOLCOD_TO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV180Tipcolcod_to, 4, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV183ForNumColfrom) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FORNUMCOLFROM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV183ForNumColfrom, 8, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV184ForNumColto) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FORNUMCOLTO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV184ForNumColto, 8, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV189Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV189Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TMFormulas" );
      AV22Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table3_85_1KS2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_informeformulasconclaves_Internalname, tblTabledvelop_confirmpanel_informeformulasconclaves_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_informeformulasconclaves.setProperty("Title", Dvelop_confirmpanel_informeformulasconclaves_Title);
         ucDvelop_confirmpanel_informeformulasconclaves.setProperty("ConfirmationText", Dvelop_confirmpanel_informeformulasconclaves_Confirmationtext);
         ucDvelop_confirmpanel_informeformulasconclaves.setProperty("YesButtonCaption", Dvelop_confirmpanel_informeformulasconclaves_Yesbuttoncaption);
         ucDvelop_confirmpanel_informeformulasconclaves.setProperty("NoButtonCaption", Dvelop_confirmpanel_informeformulasconclaves_Nobuttoncaption);
         ucDvelop_confirmpanel_informeformulasconclaves.setProperty("CancelButtonCaption", Dvelop_confirmpanel_informeformulasconclaves_Cancelbuttoncaption);
         ucDvelop_confirmpanel_informeformulasconclaves.setProperty("YesButtonPosition", Dvelop_confirmpanel_informeformulasconclaves_Yesbuttonposition);
         ucDvelop_confirmpanel_informeformulasconclaves.setProperty("ConfirmType", Dvelop_confirmpanel_informeformulasconclaves_Confirmtype);
         ucDvelop_confirmpanel_informeformulasconclaves.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_informeformulasconclaves_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_INFORMEFORMULASCONCLAVESContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_INFORMEFORMULASCONCLAVESContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_85_1KS2e( true) ;
      }
      else
      {
         wb_table3_85_1KS2e( false) ;
      }
   }

   public void wb_table2_80_1KS2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_informetipoficha_Internalname, tblTabledvelop_confirmpanel_informetipoficha_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_informetipoficha.setProperty("Title", Dvelop_confirmpanel_informetipoficha_Title);
         ucDvelop_confirmpanel_informetipoficha.setProperty("ConfirmationText", Dvelop_confirmpanel_informetipoficha_Confirmationtext);
         ucDvelop_confirmpanel_informetipoficha.setProperty("YesButtonCaption", Dvelop_confirmpanel_informetipoficha_Yesbuttoncaption);
         ucDvelop_confirmpanel_informetipoficha.setProperty("NoButtonCaption", Dvelop_confirmpanel_informetipoficha_Nobuttoncaption);
         ucDvelop_confirmpanel_informetipoficha.setProperty("CancelButtonCaption", Dvelop_confirmpanel_informetipoficha_Cancelbuttoncaption);
         ucDvelop_confirmpanel_informetipoficha.setProperty("YesButtonPosition", Dvelop_confirmpanel_informetipoficha_Yesbuttonposition);
         ucDvelop_confirmpanel_informetipoficha.setProperty("ConfirmType", Dvelop_confirmpanel_informetipoficha_Confirmtype);
         ucDvelop_confirmpanel_informetipoficha.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_informetipoficha_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_INFORMETIPOFICHAContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_INFORMETIPOFICHAContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_80_1KS2e( true) ;
      }
      else
      {
         wb_table2_80_1KS2e( false) ;
      }
   }

   public void wb_table1_29_1KS2( boolean wbgen )
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
         wb_table4_34_1KS2( true) ;
      }
      else
      {
         wb_table4_34_1KS2( false) ;
      }
      return  ;
   }

   public void wb_table4_34_1KS2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_29_1KS2e( true) ;
      }
      else
      {
         wb_table1_29_1KS2e( false) ;
      }
   }

   public void wb_table4_34_1KS2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'" + sPrefix + "',false,'" + sGXsfl_47_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV15FilterFullText, GXutil.rtrim( localUtil.format( AV15FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,38);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_FormulacionTinte\\ListadodeFormulas_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_34_1KS2e( true) ;
      }
      else
      {
         wb_table4_34_1KS2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV170Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV170Emprcod", AV170Emprcod);
      AV171Clicod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV171Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV171Clicod), 6, 0));
      AV172Clicod_to = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV172Clicod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV172Clicod_to), 6, 0));
      AV173Forser = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV173Forser", AV173Forser);
      AV174Forser_to = (String)getParm(obj,4,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV174Forser_to", AV174Forser_to);
      AV175Forcolnum = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV175Forcolnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV175Forcolnum), 6, 0));
      AV176Forcolnum_to = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV176Forcolnum_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV176Forcolnum_to), 6, 0));
      AV177Forcolnom = (String)getParm(obj,7,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV177Forcolnom", AV177Forcolnom);
      AV178Forcolnom_to = (String)getParm(obj,8,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV178Forcolnom_to", AV178Forcolnom_to);
      AV179Tipcolcod = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV179Tipcolcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV179Tipcolcod), 2, 0));
      AV180Tipcolcod_to = ((Number) GXutil.testNumericType( getParm(obj,10,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV180Tipcolcod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV180Tipcolcod_to), 4, 0));
      AV183ForNumColfrom = ((Number) GXutil.testNumericType( getParm(obj,11,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV183ForNumColfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV183ForNumColfrom), 8, 0));
      AV184ForNumColto = ((Number) GXutil.testNumericType( getParm(obj,12,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV184ForNumColto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV184ForNumColto), 8, 0));
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
      pa1KS2( ) ;
      ws1KS2( ) ;
      we1KS2( ) ;
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
      sCtrlAV170Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV171Clicod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV172Clicod_to = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV173Forser = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV174Forser_to = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV175Forcolnum = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV176Forcolnum_to = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV177Forcolnom = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV178Forcolnom_to = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV179Tipcolcod = (String)getParm(obj,9,TypeConstants.STRING) ;
      sCtrlAV180Tipcolcod_to = (String)getParm(obj,10,TypeConstants.STRING) ;
      sCtrlAV183ForNumColfrom = (String)getParm(obj,11,TypeConstants.STRING) ;
      sCtrlAV184ForNumColto = (String)getParm(obj,12,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1KS2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "formulaciontinte\\listadodeformulas_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1KS2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV170Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV170Emprcod", AV170Emprcod);
         AV171Clicod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV171Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV171Clicod), 6, 0));
         AV172Clicod_to = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV172Clicod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV172Clicod_to), 6, 0));
         AV173Forser = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV173Forser", AV173Forser);
         AV174Forser_to = (String)getParm(obj,6,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV174Forser_to", AV174Forser_to);
         AV175Forcolnum = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV175Forcolnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV175Forcolnum), 6, 0));
         AV176Forcolnum_to = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV176Forcolnum_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV176Forcolnum_to), 6, 0));
         AV177Forcolnom = (String)getParm(obj,9,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV177Forcolnom", AV177Forcolnom);
         AV178Forcolnom_to = (String)getParm(obj,10,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV178Forcolnom_to", AV178Forcolnom_to);
         AV179Tipcolcod = ((Number) GXutil.testNumericType( getParm(obj,11,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV179Tipcolcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV179Tipcolcod), 2, 0));
         AV180Tipcolcod_to = ((Number) GXutil.testNumericType( getParm(obj,12,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV180Tipcolcod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV180Tipcolcod_to), 4, 0));
         AV183ForNumColfrom = ((Number) GXutil.testNumericType( getParm(obj,13,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV183ForNumColfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV183ForNumColfrom), 8, 0));
         AV184ForNumColto = ((Number) GXutil.testNumericType( getParm(obj,14,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV184ForNumColto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV184ForNumColto), 8, 0));
      }
      wcpOAV170Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV170Emprcod") ;
      wcpOAV171Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV171Clicod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV172Clicod_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV172Clicod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV173Forser = httpContext.cgiGet( sPrefix+"wcpOAV173Forser") ;
      wcpOAV174Forser_to = httpContext.cgiGet( sPrefix+"wcpOAV174Forser_to") ;
      wcpOAV175Forcolnum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV175Forcolnum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV176Forcolnum_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV176Forcolnum_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV177Forcolnom = httpContext.cgiGet( sPrefix+"wcpOAV177Forcolnom") ;
      wcpOAV178Forcolnom_to = httpContext.cgiGet( sPrefix+"wcpOAV178Forcolnom_to") ;
      wcpOAV179Tipcolcod = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV179Tipcolcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV180Tipcolcod_to = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV180Tipcolcod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV183ForNumColfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV183ForNumColfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV184ForNumColto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV184ForNumColto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV170Emprcod, wcpOAV170Emprcod) != 0 ) || ( AV171Clicod != wcpOAV171Clicod ) || ( AV172Clicod_to != wcpOAV172Clicod_to ) || ( GXutil.strcmp(AV173Forser, wcpOAV173Forser) != 0 ) || ( GXutil.strcmp(AV174Forser_to, wcpOAV174Forser_to) != 0 ) || ( AV175Forcolnum != wcpOAV175Forcolnum ) || ( AV176Forcolnum_to != wcpOAV176Forcolnum_to ) || ( GXutil.strcmp(AV177Forcolnom, wcpOAV177Forcolnom) != 0 ) || ( GXutil.strcmp(AV178Forcolnom_to, wcpOAV178Forcolnom_to) != 0 ) || ( AV179Tipcolcod != wcpOAV179Tipcolcod ) || ( AV180Tipcolcod_to != wcpOAV180Tipcolcod_to ) || ( AV183ForNumColfrom != wcpOAV183ForNumColfrom ) || ( AV184ForNumColto != wcpOAV184ForNumColto ) ) )
      {
         setjustcreated();
      }
      wcpOAV170Emprcod = AV170Emprcod ;
      wcpOAV171Clicod = AV171Clicod ;
      wcpOAV172Clicod_to = AV172Clicod_to ;
      wcpOAV173Forser = AV173Forser ;
      wcpOAV174Forser_to = AV174Forser_to ;
      wcpOAV175Forcolnum = AV175Forcolnum ;
      wcpOAV176Forcolnum_to = AV176Forcolnum_to ;
      wcpOAV177Forcolnom = AV177Forcolnom ;
      wcpOAV178Forcolnom_to = AV178Forcolnom_to ;
      wcpOAV179Tipcolcod = AV179Tipcolcod ;
      wcpOAV180Tipcolcod_to = AV180Tipcolcod_to ;
      wcpOAV183ForNumColfrom = AV183ForNumColfrom ;
      wcpOAV184ForNumColto = AV184ForNumColto ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV170Emprcod = httpContext.cgiGet( sPrefix+"AV170Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV170Emprcod) > 0 )
      {
         AV170Emprcod = httpContext.cgiGet( sCtrlAV170Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV170Emprcod", AV170Emprcod);
      }
      else
      {
         AV170Emprcod = httpContext.cgiGet( sPrefix+"AV170Emprcod_PARM") ;
      }
      sCtrlAV171Clicod = httpContext.cgiGet( sPrefix+"AV171Clicod_CTRL") ;
      if ( GXutil.len( sCtrlAV171Clicod) > 0 )
      {
         AV171Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV171Clicod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV171Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV171Clicod), 6, 0));
      }
      else
      {
         AV171Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV171Clicod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV172Clicod_to = httpContext.cgiGet( sPrefix+"AV172Clicod_to_CTRL") ;
      if ( GXutil.len( sCtrlAV172Clicod_to) > 0 )
      {
         AV172Clicod_to = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV172Clicod_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV172Clicod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV172Clicod_to), 6, 0));
      }
      else
      {
         AV172Clicod_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV172Clicod_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV173Forser = httpContext.cgiGet( sPrefix+"AV173Forser_CTRL") ;
      if ( GXutil.len( sCtrlAV173Forser) > 0 )
      {
         AV173Forser = httpContext.cgiGet( sCtrlAV173Forser) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV173Forser", AV173Forser);
      }
      else
      {
         AV173Forser = httpContext.cgiGet( sPrefix+"AV173Forser_PARM") ;
      }
      sCtrlAV174Forser_to = httpContext.cgiGet( sPrefix+"AV174Forser_to_CTRL") ;
      if ( GXutil.len( sCtrlAV174Forser_to) > 0 )
      {
         AV174Forser_to = httpContext.cgiGet( sCtrlAV174Forser_to) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV174Forser_to", AV174Forser_to);
      }
      else
      {
         AV174Forser_to = httpContext.cgiGet( sPrefix+"AV174Forser_to_PARM") ;
      }
      sCtrlAV175Forcolnum = httpContext.cgiGet( sPrefix+"AV175Forcolnum_CTRL") ;
      if ( GXutil.len( sCtrlAV175Forcolnum) > 0 )
      {
         AV175Forcolnum = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV175Forcolnum), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV175Forcolnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV175Forcolnum), 6, 0));
      }
      else
      {
         AV175Forcolnum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV175Forcolnum_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV176Forcolnum_to = httpContext.cgiGet( sPrefix+"AV176Forcolnum_to_CTRL") ;
      if ( GXutil.len( sCtrlAV176Forcolnum_to) > 0 )
      {
         AV176Forcolnum_to = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV176Forcolnum_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV176Forcolnum_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV176Forcolnum_to), 6, 0));
      }
      else
      {
         AV176Forcolnum_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV176Forcolnum_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV177Forcolnom = httpContext.cgiGet( sPrefix+"AV177Forcolnom_CTRL") ;
      if ( GXutil.len( sCtrlAV177Forcolnom) > 0 )
      {
         AV177Forcolnom = httpContext.cgiGet( sCtrlAV177Forcolnom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV177Forcolnom", AV177Forcolnom);
      }
      else
      {
         AV177Forcolnom = httpContext.cgiGet( sPrefix+"AV177Forcolnom_PARM") ;
      }
      sCtrlAV178Forcolnom_to = httpContext.cgiGet( sPrefix+"AV178Forcolnom_to_CTRL") ;
      if ( GXutil.len( sCtrlAV178Forcolnom_to) > 0 )
      {
         AV178Forcolnom_to = httpContext.cgiGet( sCtrlAV178Forcolnom_to) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV178Forcolnom_to", AV178Forcolnom_to);
      }
      else
      {
         AV178Forcolnom_to = httpContext.cgiGet( sPrefix+"AV178Forcolnom_to_PARM") ;
      }
      sCtrlAV179Tipcolcod = httpContext.cgiGet( sPrefix+"AV179Tipcolcod_CTRL") ;
      if ( GXutil.len( sCtrlAV179Tipcolcod) > 0 )
      {
         AV179Tipcolcod = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV179Tipcolcod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV179Tipcolcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV179Tipcolcod), 2, 0));
      }
      else
      {
         AV179Tipcolcod = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV179Tipcolcod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV180Tipcolcod_to = httpContext.cgiGet( sPrefix+"AV180Tipcolcod_to_CTRL") ;
      if ( GXutil.len( sCtrlAV180Tipcolcod_to) > 0 )
      {
         AV180Tipcolcod_to = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV180Tipcolcod_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV180Tipcolcod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV180Tipcolcod_to), 4, 0));
      }
      else
      {
         AV180Tipcolcod_to = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV180Tipcolcod_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV183ForNumColfrom = httpContext.cgiGet( sPrefix+"AV183ForNumColfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV183ForNumColfrom) > 0 )
      {
         AV183ForNumColfrom = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV183ForNumColfrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV183ForNumColfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV183ForNumColfrom), 8, 0));
      }
      else
      {
         AV183ForNumColfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV183ForNumColfrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV184ForNumColto = httpContext.cgiGet( sPrefix+"AV184ForNumColto_CTRL") ;
      if ( GXutil.len( sCtrlAV184ForNumColto) > 0 )
      {
         AV184ForNumColto = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV184ForNumColto), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV184ForNumColto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV184ForNumColto), 8, 0));
      }
      else
      {
         AV184ForNumColto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV184ForNumColto_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa1KS2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1KS2( ) ;
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
      ws1KS2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV170Emprcod_PARM", GXutil.rtrim( AV170Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV170Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV170Emprcod_CTRL", GXutil.rtrim( sCtrlAV170Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV171Clicod_PARM", GXutil.ltrim( localUtil.ntoc( AV171Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV171Clicod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV171Clicod_CTRL", GXutil.rtrim( sCtrlAV171Clicod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV172Clicod_to_PARM", GXutil.ltrim( localUtil.ntoc( AV172Clicod_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV172Clicod_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV172Clicod_to_CTRL", GXutil.rtrim( sCtrlAV172Clicod_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV173Forser_PARM", GXutil.rtrim( AV173Forser));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV173Forser)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV173Forser_CTRL", GXutil.rtrim( sCtrlAV173Forser));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV174Forser_to_PARM", GXutil.rtrim( AV174Forser_to));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV174Forser_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV174Forser_to_CTRL", GXutil.rtrim( sCtrlAV174Forser_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV175Forcolnum_PARM", GXutil.ltrim( localUtil.ntoc( AV175Forcolnum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV175Forcolnum)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV175Forcolnum_CTRL", GXutil.rtrim( sCtrlAV175Forcolnum));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV176Forcolnum_to_PARM", GXutil.ltrim( localUtil.ntoc( AV176Forcolnum_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV176Forcolnum_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV176Forcolnum_to_CTRL", GXutil.rtrim( sCtrlAV176Forcolnum_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV177Forcolnom_PARM", GXutil.rtrim( AV177Forcolnom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV177Forcolnom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV177Forcolnom_CTRL", GXutil.rtrim( sCtrlAV177Forcolnom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV178Forcolnom_to_PARM", GXutil.rtrim( AV178Forcolnom_to));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV178Forcolnom_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV178Forcolnom_to_CTRL", GXutil.rtrim( sCtrlAV178Forcolnom_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV179Tipcolcod_PARM", GXutil.ltrim( localUtil.ntoc( AV179Tipcolcod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV179Tipcolcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV179Tipcolcod_CTRL", GXutil.rtrim( sCtrlAV179Tipcolcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV180Tipcolcod_to_PARM", GXutil.ltrim( localUtil.ntoc( AV180Tipcolcod_to, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV180Tipcolcod_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV180Tipcolcod_to_CTRL", GXutil.rtrim( sCtrlAV180Tipcolcod_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV183ForNumColfrom_PARM", GXutil.ltrim( localUtil.ntoc( AV183ForNumColfrom, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV183ForNumColfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV183ForNumColfrom_CTRL", GXutil.rtrim( sCtrlAV183ForNumColfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV184ForNumColto_PARM", GXutil.ltrim( localUtil.ntoc( AV184ForNumColto, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV184ForNumColto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV184ForNumColto_CTRL", GXutil.rtrim( sCtrlAV184ForNumColto));
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
      we1KS2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211665854", true, true);
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
      httpContext.AddJavascriptSource("formulaciontinte/listadodeformulas_wc.js", "?20268211665855", false, true);
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
      httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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

   public void subsflControlProps_472( )
   {
      edtCliCod_Internalname = sPrefix+"CLICOD_"+sGXsfl_47_idx ;
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_47_idx ;
      edtForSer_Internalname = sPrefix+"FORSER_"+sGXsfl_47_idx ;
      edtForSerDsc_Internalname = sPrefix+"FORSERDSC_"+sGXsfl_47_idx ;
      edtForTipArt_Internalname = sPrefix+"FORTIPART_"+sGXsfl_47_idx ;
      edtForTipArtD_Internalname = sPrefix+"FORTIPARTD_"+sGXsfl_47_idx ;
      edtForColNom_Internalname = sPrefix+"FORCOLNOM_"+sGXsfl_47_idx ;
      edtForColNum_Internalname = sPrefix+"FORCOLNUM_"+sGXsfl_47_idx ;
      edtTipColCod_Internalname = sPrefix+"TIPCOLCOD_"+sGXsfl_47_idx ;
      edtTipColDsc_Internalname = sPrefix+"TIPCOLDSC_"+sGXsfl_47_idx ;
      edtIntCod_Internalname = sPrefix+"INTCOD_"+sGXsfl_47_idx ;
      edtIntDsc_Internalname = sPrefix+"INTDSC_"+sGXsfl_47_idx ;
      edtIntCodF_Internalname = sPrefix+"INTCODF_"+sGXsfl_47_idx ;
      edtIntDscF_Internalname = sPrefix+"INTDSCF_"+sGXsfl_47_idx ;
      edtForNumCol_Internalname = sPrefix+"FORNUMCOL_"+sGXsfl_47_idx ;
      cmbForBlo.setInternalname( sPrefix+"FORBLO_"+sGXsfl_47_idx );
      edtForCosForm_Internalname = sPrefix+"FORCOSFORM_"+sGXsfl_47_idx ;
      edtForFec_Internalname = sPrefix+"FORFEC_"+sGXsfl_47_idx ;
      edtForUltMod_Internalname = sPrefix+"FORULTMOD_"+sGXsfl_47_idx ;
   }

   public void subsflControlProps_fel_472( )
   {
      edtCliCod_Internalname = sPrefix+"CLICOD_"+sGXsfl_47_fel_idx ;
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_47_fel_idx ;
      edtForSer_Internalname = sPrefix+"FORSER_"+sGXsfl_47_fel_idx ;
      edtForSerDsc_Internalname = sPrefix+"FORSERDSC_"+sGXsfl_47_fel_idx ;
      edtForTipArt_Internalname = sPrefix+"FORTIPART_"+sGXsfl_47_fel_idx ;
      edtForTipArtD_Internalname = sPrefix+"FORTIPARTD_"+sGXsfl_47_fel_idx ;
      edtForColNom_Internalname = sPrefix+"FORCOLNOM_"+sGXsfl_47_fel_idx ;
      edtForColNum_Internalname = sPrefix+"FORCOLNUM_"+sGXsfl_47_fel_idx ;
      edtTipColCod_Internalname = sPrefix+"TIPCOLCOD_"+sGXsfl_47_fel_idx ;
      edtTipColDsc_Internalname = sPrefix+"TIPCOLDSC_"+sGXsfl_47_fel_idx ;
      edtIntCod_Internalname = sPrefix+"INTCOD_"+sGXsfl_47_fel_idx ;
      edtIntDsc_Internalname = sPrefix+"INTDSC_"+sGXsfl_47_fel_idx ;
      edtIntCodF_Internalname = sPrefix+"INTCODF_"+sGXsfl_47_fel_idx ;
      edtIntDscF_Internalname = sPrefix+"INTDSCF_"+sGXsfl_47_fel_idx ;
      edtForNumCol_Internalname = sPrefix+"FORNUMCOL_"+sGXsfl_47_fel_idx ;
      cmbForBlo.setInternalname( sPrefix+"FORBLO_"+sGXsfl_47_fel_idx );
      edtForCosForm_Internalname = sPrefix+"FORCOSFORM_"+sGXsfl_47_fel_idx ;
      edtForFec_Internalname = sPrefix+"FORFEC_"+sGXsfl_47_fel_idx ;
      edtForUltMod_Internalname = sPrefix+"FORULTMOD_"+sGXsfl_47_fel_idx ;
   }

   public void sendrow_472( )
   {
      subsflControlProps_472( ) ;
      wb1KS0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_47_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_47_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_47_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCliCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCliNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtForSer_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForSer_Internalname,GXutil.rtrim( A494ForSer),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtForSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtForSer_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtForSerDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForSerDsc_Internalname,GXutil.rtrim( A5742ForSerDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtForSerDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtForSerDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtForTipArt_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForTipArt_Internalname,GXutil.ltrim( localUtil.ntoc( A4384ForTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4384ForTipArt), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtForTipArt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtForTipArt_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtForTipArtD_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForTipArtD_Internalname,GXutil.rtrim( A13929ForTipArtD),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtForTipArtD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtForTipArtD_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtForColNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForColNom_Internalname,GXutil.rtrim( A482ForColNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtForColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtForColNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtForColNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A483ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtForColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtForColNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtTipColCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipColCod_Internalname,GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTipColCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtTipColCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtTipColDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipColDsc_Internalname,GXutil.rtrim( A832TipColDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTipColDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtTipColDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtIntCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtIntCod_Internalname,GXutil.ltrim( localUtil.ntoc( A583IntCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A583IntCod), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtIntCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtIntCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtIntDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtIntDsc_Internalname,GXutil.rtrim( A584IntDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtIntDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtIntDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtIntCodF_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtIntCodF_Internalname,GXutil.ltrim( localUtil.ntoc( A5362IntCodF, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5362IntCodF), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtIntCodF_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtIntCodF_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtIntDscF_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtIntDscF_Internalname,GXutil.rtrim( A5363IntDscF),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtIntDscF_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtIntDscF_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtForNumCol_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForNumCol_Internalname,GXutil.ltrim( localUtil.ntoc( A486ForNumCol, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A486ForNumCol), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtForNumCol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtForNumCol_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((cmbForBlo.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbForBlo.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "FORBLO_" + sGXsfl_47_idx ;
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
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbForBlo,cmbForBlo.getInternalname(),GXutil.rtrim( A7781ForBlo),Integer.valueOf(1),cmbForBlo.getJsonclick(),Integer.valueOf(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbForBlo.getVisible()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn hidden-xs","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbForBlo.setValue( GXutil.rtrim( A7781ForBlo) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbForBlo.getInternalname(), "Values", cmbForBlo.ToJavascriptSource(), !bGXsfl_47_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtForCosForm_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForCosForm_Internalname,GXutil.ltrim( localUtil.ntoc( A4380ForCosForm, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A4380ForCosForm, "ZZZZ9.99999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtForCosForm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtForCosForm_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtForFec_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForFec_Internalname,localUtil.format(A485ForFec, "99/99/99"),localUtil.format( A485ForFec, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtForFec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtForFec_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtForUltMod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForUltMod_Internalname,localUtil.format(A495ForUltMod, "99/99/99"),localUtil.format( A495ForUltMod, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtForUltMod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtForUltMod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1KS2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_47_idx = ((subGrid_Islastpage==1)&&(nGXsfl_47_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_47_idx+1) ;
         sGXsfl_47_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_47_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_472( ) ;
      }
      /* End function sendrow_472 */
   }

   public void startgridcontrol47( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"47\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtForSer_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtForSerDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtForTipArt_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtForTipArtD_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtForColNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtForColNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtTipColCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "TC", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtTipColDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtIntCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Intensidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtIntDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtIntCodF_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cod. Int. Fact.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtIntDscF_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Intensidad Fact.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtForNumCol_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Interno F.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbForBlo.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Bloqueo Color?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtForCosForm_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coste Formula", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtForFec_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Formula", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtForUltMod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Ultima Modificacion", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCliCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A279CliNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCliNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A494ForSer));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtForSer_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5742ForSerDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtForSerDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4384ForTipArt, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtForTipArt_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13929ForTipArtD));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtForTipArtD_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A482ForColNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtForColNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A483ForColNum, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtForColNum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtTipColCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A832TipColDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtTipColDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A583IntCod, (byte)(2), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtIntCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A584IntDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtIntDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5362IntCodF, (byte)(2), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtIntCodF_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5363IntDscF));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtIntDscF_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A486ForNumCol, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtForNumCol_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A7781ForBlo));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbForBlo.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4380ForCosForm, (byte)(11), (byte)(5), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtForCosForm_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A485ForFec, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtForFec_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A495ForUltMod, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtForUltMod_Visible, (byte)(5), (byte)(0), ".", "")));
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
      bttBtnexportreport_Internalname = sPrefix+"BTNEXPORTREPORT" ;
      bttBtnexportcsv_Internalname = sPrefix+"BTNEXPORTCSV" ;
      bttBtninformetipoficha_Internalname = sPrefix+"BTNINFORMETIPOFICHA" ;
      bttBtninformeformulasconclaves_Internalname = sPrefix+"BTNINFORMEFORMULASCONCLAVES" ;
      bttBtneditcolumns_Internalname = sPrefix+"BTNEDITCOLUMNS" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      Ddo_managefilters_Internalname = sPrefix+"DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = sPrefix+"vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = sPrefix+"TABLEFILTERS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      edtCliCod_Internalname = sPrefix+"CLICOD" ;
      edtCliNom_Internalname = sPrefix+"CLINOM" ;
      edtForSer_Internalname = sPrefix+"FORSER" ;
      edtForSerDsc_Internalname = sPrefix+"FORSERDSC" ;
      edtForTipArt_Internalname = sPrefix+"FORTIPART" ;
      edtForTipArtD_Internalname = sPrefix+"FORTIPARTD" ;
      edtForColNom_Internalname = sPrefix+"FORCOLNOM" ;
      edtForColNum_Internalname = sPrefix+"FORCOLNUM" ;
      edtTipColCod_Internalname = sPrefix+"TIPCOLCOD" ;
      edtTipColDsc_Internalname = sPrefix+"TIPCOLDSC" ;
      edtIntCod_Internalname = sPrefix+"INTCOD" ;
      edtIntDsc_Internalname = sPrefix+"INTDSC" ;
      edtIntCodF_Internalname = sPrefix+"INTCODF" ;
      edtIntDscF_Internalname = sPrefix+"INTDSCF" ;
      edtForNumCol_Internalname = sPrefix+"FORNUMCOL" ;
      cmbForBlo.setInternalname( sPrefix+"FORBLO" );
      edtForCosForm_Internalname = sPrefix+"FORCOSFORM" ;
      edtForFec_Internalname = sPrefix+"FORFEC" ;
      edtForUltMod_Internalname = sPrefix+"FORULTMOD" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Innewwindow1_Internalname = sPrefix+"INNEWWINDOW1" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      Dvelop_confirmpanel_informetipoficha_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_INFORMETIPOFICHA" ;
      tblTabledvelop_confirmpanel_informetipoficha_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_INFORMETIPOFICHA" ;
      Dvelop_confirmpanel_informeformulasconclaves_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_INFORMEFORMULASCONCLAVES" ;
      tblTabledvelop_confirmpanel_informeformulasconclaves_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_INFORMEFORMULASCONCLAVES" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
      edtavDdo_forfecauxdate_Internalname = sPrefix+"vDDO_FORFECAUXDATE" ;
      divDdo_forfecauxdates_Internalname = sPrefix+"DDO_FORFECAUXDATES" ;
      edtavDdo_forultmodauxdate_Internalname = sPrefix+"vDDO_FORULTMODAUXDATE" ;
      divDdo_forultmodauxdates_Internalname = sPrefix+"DDO_FORULTMODAUXDATES" ;
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
      edtForUltMod_Jsonclick = "" ;
      edtForFec_Jsonclick = "" ;
      edtForCosForm_Jsonclick = "" ;
      cmbForBlo.setJsonclick( "" );
      edtForNumCol_Jsonclick = "" ;
      edtIntDscF_Jsonclick = "" ;
      edtIntCodF_Jsonclick = "" ;
      edtIntDsc_Jsonclick = "" ;
      edtIntCod_Jsonclick = "" ;
      edtTipColDsc_Jsonclick = "" ;
      edtTipColCod_Jsonclick = "" ;
      edtForColNum_Jsonclick = "" ;
      edtForColNom_Jsonclick = "" ;
      edtForTipArtD_Jsonclick = "" ;
      edtForTipArt_Jsonclick = "" ;
      edtForSerDsc_Jsonclick = "" ;
      edtForSer_Jsonclick = "" ;
      edtCliNom_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtForUltMod_Visible = -1 ;
      edtForFec_Visible = -1 ;
      edtForCosForm_Visible = -1 ;
      cmbForBlo.setVisible( -1 );
      edtForNumCol_Visible = -1 ;
      edtIntDscF_Visible = -1 ;
      edtIntCodF_Visible = -1 ;
      edtIntDsc_Visible = -1 ;
      edtIntCod_Visible = -1 ;
      edtTipColDsc_Visible = -1 ;
      edtTipColCod_Visible = -1 ;
      edtForColNum_Visible = -1 ;
      edtForColNom_Visible = -1 ;
      edtForTipArtD_Visible = -1 ;
      edtForTipArt_Visible = -1 ;
      edtForSerDsc_Visible = -1 ;
      edtForSer_Visible = -1 ;
      edtCliNom_Visible = -1 ;
      edtCliCod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_forultmodauxdate_Jsonclick = "" ;
      edtavDdo_forfecauxdate_Jsonclick = "" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Dvelop_confirmpanel_informeformulasconclaves_Confirmtype = "1" ;
      Dvelop_confirmpanel_informeformulasconclaves_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_informeformulasconclaves_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_informeformulasconclaves_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_informeformulasconclaves_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_informeformulasconclaves_Confirmationtext = "¿Confirma el Informe?" ;
      Dvelop_confirmpanel_informeformulasconclaves_Title = "" ;
      Dvelop_confirmpanel_informetipoficha_Confirmtype = "1" ;
      Dvelop_confirmpanel_informetipoficha_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_informetipoficha_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_informetipoficha_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_informetipoficha_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_informetipoficha_Confirmationtext = "¿Confirma el informe?" ;
      Dvelop_confirmpanel_informetipoficha_Title = "" ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Innewwindow1_Target = "" ;
      Innewwindow1_Height = "50" ;
      Innewwindow1_Width = "50" ;
      Ddo_grid_Datalistproc = "FormulacionTinte.ListadodeFormulas_WCGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "|||||||||||||||N:N,S:S|||" ;
      Ddo_grid_Allowmultipleselection = "|||||||||||||||T|||" ;
      Ddo_grid_Datalisttype = "|Dynamic|Dynamic|Dynamic||Dynamic|Dynamic|||Dynamic||Dynamic||Dynamic||FixedValues|||" ;
      Ddo_grid_Includedatalist = "|T|T|T||T|T|||T||T||T||T|||" ;
      Ddo_grid_Filterisrange = "T||||T|||T|T||T||T||T||T||" ;
      Ddo_grid_Filtertype = "Numeric|Character|Character|Character|Numeric|Character|Character|Numeric|Numeric|Character|Numeric|Character|Numeric|Character|Numeric||Numeric|Date|Date" ;
      Ddo_grid_Includefilter = "T|T|T|T|T|T|T|T|T|T|T|T|T|T|T||T|T|T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T|T|T|T||T|T|T|T|T|T|T|T|T|T|T|T|T" ;
      Ddo_grid_Columnssortvalues = "1|2|3|4|5||6|7|8|9|10|11|12|13|14|15|16|17|18" ;
      Ddo_grid_Columnids = "0:CliCod|1:CliNom|2:ForSer|3:ForSerDsc|4:ForTipArt|5:ForTipArtDsc|6:ForColNom|7:ForColNum|8:TipColCod|9:TipColDsc|10:IntCod|11:IntDsc|12:IntCodF|13:IntDscF|14:ForNumCol|15:ForBlo|16:ForCosForm|17:ForFec|18:ForUltMod" ;
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
      GXCCtl = "FORBLO_" + sGXsfl_47_idx ;
      cmbForBlo.setName( GXCCtl );
      cmbForBlo.setWebtags( "" );
      cmbForBlo.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbForBlo.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbForBlo.getItemCount() > 0 )
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV170Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV171Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV172Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV173Forser',fld:'vFORSER',pic:''},{av:'AV174Forser_to',fld:'vFORSER_TO',pic:''},{av:'AV175Forcolnum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV176Forcolnum_to',fld:'vFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV177Forcolnom',fld:'vFORCOLNOM',pic:''},{av:'AV178Forcolnom_to',fld:'vFORCOLNOM_TO',pic:''},{av:'AV179Tipcolcod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV180Tipcolcod_to',fld:'vTIPCOLCOD_TO',pic:'ZZZ9'},{av:'AV183ForNumColfrom',fld:'vFORNUMCOLFROM',pic:'ZZZZZZZ9'},{av:'AV184ForNumColto',fld:'vFORNUMCOLTO',pic:'ZZZZZZZ9'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV30TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV31TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV32TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV33TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV34TFForSer',fld:'vTFFORSER',pic:''},{av:'AV35TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV36TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV37TFForSerDsc_Sel',fld:'vTFFORSERDSC_SEL',pic:''},{av:'AV118TFForTipArt',fld:'vTFFORTIPART',pic:'ZZZ9'},{av:'AV119TFForTipArt_To',fld:'vTFFORTIPART_TO',pic:'ZZZ9'},{av:'AV181TFForTipArtDsc',fld:'vTFFORTIPARTDSC',pic:''},{av:'AV182TFForTipArtDsc_Sel',fld:'vTFFORTIPARTDSC_SEL',pic:''},{av:'AV38TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV39TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV40TFForColNum',fld:'vTFFORCOLNUM',pic:'ZZZZZ9'},{av:'AV41TFForColNum_To',fld:'vTFFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV42TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV43TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV44TFTipColDsc',fld:'vTFTIPCOLDSC',pic:''},{av:'AV45TFTipColDsc_Sel',fld:'vTFTIPCOLDSC_SEL',pic:''},{av:'AV46TFIntCod',fld:'vTFINTCOD',pic:'Z9'},{av:'AV47TFIntCod_To',fld:'vTFINTCOD_TO',pic:'Z9'},{av:'AV48TFIntDsc',fld:'vTFINTDSC',pic:''},{av:'AV49TFIntDsc_Sel',fld:'vTFINTDSC_SEL',pic:''},{av:'AV58TFIntCodF',fld:'vTFINTCODF',pic:'Z9'},{av:'AV59TFIntCodF_To',fld:'vTFINTCODF_TO',pic:'Z9'},{av:'AV60TFIntDscF',fld:'vTFINTDSCF',pic:''},{av:'AV61TFIntDscF_Sel',fld:'vTFINTDSCF_SEL',pic:''},{av:'AV88TFForNumCol',fld:'vTFFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV89TFForNumCol_To',fld:'vTFFORNUMCOL_TO',pic:'ZZZZZZZ9'},{av:'AV186TFForBlo_Sels',fld:'vTFFORBLO_SELS',pic:''},{av:'AV148TFForCosForm',fld:'vTFFORCOSFORM',pic:'ZZZZ9.99999'},{av:'AV149TFForCosForm_To',fld:'vTFFORCOSFORM_TO',pic:'ZZZZ9.99999'},{av:'AV90TFForFec',fld:'vTFFORFEC',pic:''},{av:'AV102TFForUltMod',fld:'vTFFORULTMOD',pic:''},{av:'AV189Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtForSer_Visible',ctrl:'FORSER',prop:'Visible'},{av:'edtForSerDsc_Visible',ctrl:'FORSERDSC',prop:'Visible'},{av:'edtForTipArt_Visible',ctrl:'FORTIPART',prop:'Visible'},{av:'edtForTipArtD_Visible',ctrl:'FORTIPARTD',prop:'Visible'},{av:'edtForColNom_Visible',ctrl:'FORCOLNOM',prop:'Visible'},{av:'edtForColNum_Visible',ctrl:'FORCOLNUM',prop:'Visible'},{av:'edtTipColCod_Visible',ctrl:'TIPCOLCOD',prop:'Visible'},{av:'edtTipColDsc_Visible',ctrl:'TIPCOLDSC',prop:'Visible'},{av:'edtIntCod_Visible',ctrl:'INTCOD',prop:'Visible'},{av:'edtIntDsc_Visible',ctrl:'INTDSC',prop:'Visible'},{av:'edtIntCodF_Visible',ctrl:'INTCODF',prop:'Visible'},{av:'edtIntDscF_Visible',ctrl:'INTDSCF',prop:'Visible'},{av:'edtForNumCol_Visible',ctrl:'FORNUMCOL',prop:'Visible'},{av:'cmbForBlo'},{av:'edtForCosForm_Visible',ctrl:'FORCOSFORM',prop:'Visible'},{av:'edtForFec_Visible',ctrl:'FORFEC',prop:'Visible'},{av:'edtForUltMod_Visible',ctrl:'FORULTMOD',prop:'Visible'},{av:'AV168GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV169GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e151KS2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV170Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV171Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV172Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV173Forser',fld:'vFORSER',pic:''},{av:'AV174Forser_to',fld:'vFORSER_TO',pic:''},{av:'AV175Forcolnum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV176Forcolnum_to',fld:'vFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV177Forcolnom',fld:'vFORCOLNOM',pic:''},{av:'AV178Forcolnom_to',fld:'vFORCOLNOM_TO',pic:''},{av:'AV179Tipcolcod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV180Tipcolcod_to',fld:'vTIPCOLCOD_TO',pic:'ZZZ9'},{av:'AV183ForNumColfrom',fld:'vFORNUMCOLFROM',pic:'ZZZZZZZ9'},{av:'AV184ForNumColto',fld:'vFORNUMCOLTO',pic:'ZZZZZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV30TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV31TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV32TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV33TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV34TFForSer',fld:'vTFFORSER',pic:''},{av:'AV35TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV36TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV37TFForSerDsc_Sel',fld:'vTFFORSERDSC_SEL',pic:''},{av:'AV118TFForTipArt',fld:'vTFFORTIPART',pic:'ZZZ9'},{av:'AV119TFForTipArt_To',fld:'vTFFORTIPART_TO',pic:'ZZZ9'},{av:'AV181TFForTipArtDsc',fld:'vTFFORTIPARTDSC',pic:''},{av:'AV182TFForTipArtDsc_Sel',fld:'vTFFORTIPARTDSC_SEL',pic:''},{av:'AV38TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV39TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV40TFForColNum',fld:'vTFFORCOLNUM',pic:'ZZZZZ9'},{av:'AV41TFForColNum_To',fld:'vTFFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV42TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV43TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV44TFTipColDsc',fld:'vTFTIPCOLDSC',pic:''},{av:'AV45TFTipColDsc_Sel',fld:'vTFTIPCOLDSC_SEL',pic:''},{av:'AV46TFIntCod',fld:'vTFINTCOD',pic:'Z9'},{av:'AV47TFIntCod_To',fld:'vTFINTCOD_TO',pic:'Z9'},{av:'AV48TFIntDsc',fld:'vTFINTDSC',pic:''},{av:'AV49TFIntDsc_Sel',fld:'vTFINTDSC_SEL',pic:''},{av:'AV58TFIntCodF',fld:'vTFINTCODF',pic:'Z9'},{av:'AV59TFIntCodF_To',fld:'vTFINTCODF_TO',pic:'Z9'},{av:'AV60TFIntDscF',fld:'vTFINTDSCF',pic:''},{av:'AV61TFIntDscF_Sel',fld:'vTFINTDSCF_SEL',pic:''},{av:'AV88TFForNumCol',fld:'vTFFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV89TFForNumCol_To',fld:'vTFFORNUMCOL_TO',pic:'ZZZZZZZ9'},{av:'AV186TFForBlo_Sels',fld:'vTFFORBLO_SELS',pic:''},{av:'AV148TFForCosForm',fld:'vTFFORCOSFORM',pic:'ZZZZ9.99999'},{av:'AV149TFForCosForm_To',fld:'vTFFORCOSFORM_TO',pic:'ZZZZ9.99999'},{av:'AV90TFForFec',fld:'vTFFORFEC',pic:''},{av:'AV102TFForUltMod',fld:'vTFFORULTMOD',pic:''},{av:'AV189Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e161KS2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV170Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV171Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV172Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV173Forser',fld:'vFORSER',pic:''},{av:'AV174Forser_to',fld:'vFORSER_TO',pic:''},{av:'AV175Forcolnum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV176Forcolnum_to',fld:'vFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV177Forcolnom',fld:'vFORCOLNOM',pic:''},{av:'AV178Forcolnom_to',fld:'vFORCOLNOM_TO',pic:''},{av:'AV179Tipcolcod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV180Tipcolcod_to',fld:'vTIPCOLCOD_TO',pic:'ZZZ9'},{av:'AV183ForNumColfrom',fld:'vFORNUMCOLFROM',pic:'ZZZZZZZ9'},{av:'AV184ForNumColto',fld:'vFORNUMCOLTO',pic:'ZZZZZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV30TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV31TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV32TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV33TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV34TFForSer',fld:'vTFFORSER',pic:''},{av:'AV35TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV36TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV37TFForSerDsc_Sel',fld:'vTFFORSERDSC_SEL',pic:''},{av:'AV118TFForTipArt',fld:'vTFFORTIPART',pic:'ZZZ9'},{av:'AV119TFForTipArt_To',fld:'vTFFORTIPART_TO',pic:'ZZZ9'},{av:'AV181TFForTipArtDsc',fld:'vTFFORTIPARTDSC',pic:''},{av:'AV182TFForTipArtDsc_Sel',fld:'vTFFORTIPARTDSC_SEL',pic:''},{av:'AV38TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV39TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV40TFForColNum',fld:'vTFFORCOLNUM',pic:'ZZZZZ9'},{av:'AV41TFForColNum_To',fld:'vTFFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV42TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV43TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV44TFTipColDsc',fld:'vTFTIPCOLDSC',pic:''},{av:'AV45TFTipColDsc_Sel',fld:'vTFTIPCOLDSC_SEL',pic:''},{av:'AV46TFIntCod',fld:'vTFINTCOD',pic:'Z9'},{av:'AV47TFIntCod_To',fld:'vTFINTCOD_TO',pic:'Z9'},{av:'AV48TFIntDsc',fld:'vTFINTDSC',pic:''},{av:'AV49TFIntDsc_Sel',fld:'vTFINTDSC_SEL',pic:''},{av:'AV58TFIntCodF',fld:'vTFINTCODF',pic:'Z9'},{av:'AV59TFIntCodF_To',fld:'vTFINTCODF_TO',pic:'Z9'},{av:'AV60TFIntDscF',fld:'vTFINTDSCF',pic:''},{av:'AV61TFIntDscF_Sel',fld:'vTFINTDSCF_SEL',pic:''},{av:'AV88TFForNumCol',fld:'vTFFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV89TFForNumCol_To',fld:'vTFFORNUMCOL_TO',pic:'ZZZZZZZ9'},{av:'AV186TFForBlo_Sels',fld:'vTFFORBLO_SELS',pic:''},{av:'AV148TFForCosForm',fld:'vTFFORCOSFORM',pic:'ZZZZ9.99999'},{av:'AV149TFForCosForm_To',fld:'vTFFORCOSFORM_TO',pic:'ZZZZ9.99999'},{av:'AV90TFForFec',fld:'vTFFORFEC',pic:''},{av:'AV102TFForUltMod',fld:'vTFFORULTMOD',pic:''},{av:'AV189Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e171KS2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV170Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV171Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV172Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV173Forser',fld:'vFORSER',pic:''},{av:'AV174Forser_to',fld:'vFORSER_TO',pic:''},{av:'AV175Forcolnum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV176Forcolnum_to',fld:'vFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV177Forcolnom',fld:'vFORCOLNOM',pic:''},{av:'AV178Forcolnom_to',fld:'vFORCOLNOM_TO',pic:''},{av:'AV179Tipcolcod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV180Tipcolcod_to',fld:'vTIPCOLCOD_TO',pic:'ZZZ9'},{av:'AV183ForNumColfrom',fld:'vFORNUMCOLFROM',pic:'ZZZZZZZ9'},{av:'AV184ForNumColto',fld:'vFORNUMCOLTO',pic:'ZZZZZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV30TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV31TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV32TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV33TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV34TFForSer',fld:'vTFFORSER',pic:''},{av:'AV35TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV36TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV37TFForSerDsc_Sel',fld:'vTFFORSERDSC_SEL',pic:''},{av:'AV118TFForTipArt',fld:'vTFFORTIPART',pic:'ZZZ9'},{av:'AV119TFForTipArt_To',fld:'vTFFORTIPART_TO',pic:'ZZZ9'},{av:'AV181TFForTipArtDsc',fld:'vTFFORTIPARTDSC',pic:''},{av:'AV182TFForTipArtDsc_Sel',fld:'vTFFORTIPARTDSC_SEL',pic:''},{av:'AV38TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV39TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV40TFForColNum',fld:'vTFFORCOLNUM',pic:'ZZZZZ9'},{av:'AV41TFForColNum_To',fld:'vTFFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV42TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV43TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV44TFTipColDsc',fld:'vTFTIPCOLDSC',pic:''},{av:'AV45TFTipColDsc_Sel',fld:'vTFTIPCOLDSC_SEL',pic:''},{av:'AV46TFIntCod',fld:'vTFINTCOD',pic:'Z9'},{av:'AV47TFIntCod_To',fld:'vTFINTCOD_TO',pic:'Z9'},{av:'AV48TFIntDsc',fld:'vTFINTDSC',pic:''},{av:'AV49TFIntDsc_Sel',fld:'vTFINTDSC_SEL',pic:''},{av:'AV58TFIntCodF',fld:'vTFINTCODF',pic:'Z9'},{av:'AV59TFIntCodF_To',fld:'vTFINTCODF_TO',pic:'Z9'},{av:'AV60TFIntDscF',fld:'vTFINTDSCF',pic:''},{av:'AV61TFIntDscF_Sel',fld:'vTFINTDSCF_SEL',pic:''},{av:'AV88TFForNumCol',fld:'vTFFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV89TFForNumCol_To',fld:'vTFFORNUMCOL_TO',pic:'ZZZZZZZ9'},{av:'AV186TFForBlo_Sels',fld:'vTFFORBLO_SELS',pic:''},{av:'AV148TFForCosForm',fld:'vTFFORCOSFORM',pic:'ZZZZ9.99999'},{av:'AV149TFForCosForm_To',fld:'vTFFORCOSFORM_TO',pic:'ZZZZ9.99999'},{av:'AV90TFForFec',fld:'vTFFORFEC',pic:''},{av:'AV102TFForUltMod',fld:'vTFFORULTMOD',pic:''},{av:'AV189Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV102TFForUltMod',fld:'vTFFORULTMOD',pic:''},{av:'AV90TFForFec',fld:'vTFFORFEC',pic:''},{av:'AV148TFForCosForm',fld:'vTFFORCOSFORM',pic:'ZZZZ9.99999'},{av:'AV149TFForCosForm_To',fld:'vTFFORCOSFORM_TO',pic:'ZZZZ9.99999'},{av:'AV185TFForBlo_SelsJson',fld:'vTFFORBLO_SELSJSON',pic:''},{av:'AV186TFForBlo_Sels',fld:'vTFFORBLO_SELS',pic:''},{av:'AV88TFForNumCol',fld:'vTFFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV89TFForNumCol_To',fld:'vTFFORNUMCOL_TO',pic:'ZZZZZZZ9'},{av:'AV60TFIntDscF',fld:'vTFINTDSCF',pic:''},{av:'AV61TFIntDscF_Sel',fld:'vTFINTDSCF_SEL',pic:''},{av:'AV58TFIntCodF',fld:'vTFINTCODF',pic:'Z9'},{av:'AV59TFIntCodF_To',fld:'vTFINTCODF_TO',pic:'Z9'},{av:'AV48TFIntDsc',fld:'vTFINTDSC',pic:''},{av:'AV49TFIntDsc_Sel',fld:'vTFINTDSC_SEL',pic:''},{av:'AV46TFIntCod',fld:'vTFINTCOD',pic:'Z9'},{av:'AV47TFIntCod_To',fld:'vTFINTCOD_TO',pic:'Z9'},{av:'AV44TFTipColDsc',fld:'vTFTIPCOLDSC',pic:''},{av:'AV45TFTipColDsc_Sel',fld:'vTFTIPCOLDSC_SEL',pic:''},{av:'AV42TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV43TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV40TFForColNum',fld:'vTFFORCOLNUM',pic:'ZZZZZ9'},{av:'AV41TFForColNum_To',fld:'vTFFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV38TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV39TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV181TFForTipArtDsc',fld:'vTFFORTIPARTDSC',pic:''},{av:'AV182TFForTipArtDsc_Sel',fld:'vTFFORTIPARTDSC_SEL',pic:''},{av:'AV118TFForTipArt',fld:'vTFFORTIPART',pic:'ZZZ9'},{av:'AV119TFForTipArt_To',fld:'vTFFORTIPART_TO',pic:'ZZZ9'},{av:'AV36TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV37TFForSerDsc_Sel',fld:'vTFFORSERDSC_SEL',pic:''},{av:'AV34TFForSer',fld:'vTFFORSER',pic:''},{av:'AV35TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV32TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV33TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV30TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV31TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e251KS2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e181KS2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV170Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV171Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV172Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV173Forser',fld:'vFORSER',pic:''},{av:'AV174Forser_to',fld:'vFORSER_TO',pic:''},{av:'AV175Forcolnum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV176Forcolnum_to',fld:'vFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV177Forcolnom',fld:'vFORCOLNOM',pic:''},{av:'AV178Forcolnom_to',fld:'vFORCOLNOM_TO',pic:''},{av:'AV179Tipcolcod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV180Tipcolcod_to',fld:'vTIPCOLCOD_TO',pic:'ZZZ9'},{av:'AV183ForNumColfrom',fld:'vFORNUMCOLFROM',pic:'ZZZZZZZ9'},{av:'AV184ForNumColto',fld:'vFORNUMCOLTO',pic:'ZZZZZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV30TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV31TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV32TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV33TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV34TFForSer',fld:'vTFFORSER',pic:''},{av:'AV35TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV36TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV37TFForSerDsc_Sel',fld:'vTFFORSERDSC_SEL',pic:''},{av:'AV118TFForTipArt',fld:'vTFFORTIPART',pic:'ZZZ9'},{av:'AV119TFForTipArt_To',fld:'vTFFORTIPART_TO',pic:'ZZZ9'},{av:'AV181TFForTipArtDsc',fld:'vTFFORTIPARTDSC',pic:''},{av:'AV182TFForTipArtDsc_Sel',fld:'vTFFORTIPARTDSC_SEL',pic:''},{av:'AV38TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV39TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV40TFForColNum',fld:'vTFFORCOLNUM',pic:'ZZZZZ9'},{av:'AV41TFForColNum_To',fld:'vTFFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV42TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV43TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV44TFTipColDsc',fld:'vTFTIPCOLDSC',pic:''},{av:'AV45TFTipColDsc_Sel',fld:'vTFTIPCOLDSC_SEL',pic:''},{av:'AV46TFIntCod',fld:'vTFINTCOD',pic:'Z9'},{av:'AV47TFIntCod_To',fld:'vTFINTCOD_TO',pic:'Z9'},{av:'AV48TFIntDsc',fld:'vTFINTDSC',pic:''},{av:'AV49TFIntDsc_Sel',fld:'vTFINTDSC_SEL',pic:''},{av:'AV58TFIntCodF',fld:'vTFINTCODF',pic:'Z9'},{av:'AV59TFIntCodF_To',fld:'vTFINTCODF_TO',pic:'Z9'},{av:'AV60TFIntDscF',fld:'vTFINTDSCF',pic:''},{av:'AV61TFIntDscF_Sel',fld:'vTFINTDSCF_SEL',pic:''},{av:'AV88TFForNumCol',fld:'vTFFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV89TFForNumCol_To',fld:'vTFFORNUMCOL_TO',pic:'ZZZZZZZ9'},{av:'AV186TFForBlo_Sels',fld:'vTFFORBLO_SELS',pic:''},{av:'AV148TFForCosForm',fld:'vTFFORCOSFORM',pic:'ZZZZ9.99999'},{av:'AV149TFForCosForm_To',fld:'vTFFORCOSFORM_TO',pic:'ZZZZ9.99999'},{av:'AV90TFForFec',fld:'vTFFORFEC',pic:''},{av:'AV102TFForUltMod',fld:'vTFFORULTMOD',pic:''},{av:'AV189Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtForSer_Visible',ctrl:'FORSER',prop:'Visible'},{av:'edtForSerDsc_Visible',ctrl:'FORSERDSC',prop:'Visible'},{av:'edtForTipArt_Visible',ctrl:'FORTIPART',prop:'Visible'},{av:'edtForTipArtD_Visible',ctrl:'FORTIPARTD',prop:'Visible'},{av:'edtForColNom_Visible',ctrl:'FORCOLNOM',prop:'Visible'},{av:'edtForColNum_Visible',ctrl:'FORCOLNUM',prop:'Visible'},{av:'edtTipColCod_Visible',ctrl:'TIPCOLCOD',prop:'Visible'},{av:'edtTipColDsc_Visible',ctrl:'TIPCOLDSC',prop:'Visible'},{av:'edtIntCod_Visible',ctrl:'INTCOD',prop:'Visible'},{av:'edtIntDsc_Visible',ctrl:'INTDSC',prop:'Visible'},{av:'edtIntCodF_Visible',ctrl:'INTCODF',prop:'Visible'},{av:'edtIntDscF_Visible',ctrl:'INTDSCF',prop:'Visible'},{av:'edtForNumCol_Visible',ctrl:'FORNUMCOL',prop:'Visible'},{av:'cmbForBlo'},{av:'edtForCosForm_Visible',ctrl:'FORCOSFORM',prop:'Visible'},{av:'edtForFec_Visible',ctrl:'FORFEC',prop:'Visible'},{av:'edtForUltMod_Visible',ctrl:'FORULTMOD',prop:'Visible'},{av:'AV168GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV169GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e141KS2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV170Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV171Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV172Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV173Forser',fld:'vFORSER',pic:''},{av:'AV174Forser_to',fld:'vFORSER_TO',pic:''},{av:'AV175Forcolnum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV176Forcolnum_to',fld:'vFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV177Forcolnom',fld:'vFORCOLNOM',pic:''},{av:'AV178Forcolnom_to',fld:'vFORCOLNOM_TO',pic:''},{av:'AV179Tipcolcod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV180Tipcolcod_to',fld:'vTIPCOLCOD_TO',pic:'ZZZ9'},{av:'AV183ForNumColfrom',fld:'vFORNUMCOLFROM',pic:'ZZZZZZZ9'},{av:'AV184ForNumColto',fld:'vFORNUMCOLTO',pic:'ZZZZZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV30TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV31TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV32TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV33TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV34TFForSer',fld:'vTFFORSER',pic:''},{av:'AV35TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV36TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV37TFForSerDsc_Sel',fld:'vTFFORSERDSC_SEL',pic:''},{av:'AV118TFForTipArt',fld:'vTFFORTIPART',pic:'ZZZ9'},{av:'AV119TFForTipArt_To',fld:'vTFFORTIPART_TO',pic:'ZZZ9'},{av:'AV181TFForTipArtDsc',fld:'vTFFORTIPARTDSC',pic:''},{av:'AV182TFForTipArtDsc_Sel',fld:'vTFFORTIPARTDSC_SEL',pic:''},{av:'AV38TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV39TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV40TFForColNum',fld:'vTFFORCOLNUM',pic:'ZZZZZ9'},{av:'AV41TFForColNum_To',fld:'vTFFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV42TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV43TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV44TFTipColDsc',fld:'vTFTIPCOLDSC',pic:''},{av:'AV45TFTipColDsc_Sel',fld:'vTFTIPCOLDSC_SEL',pic:''},{av:'AV46TFIntCod',fld:'vTFINTCOD',pic:'Z9'},{av:'AV47TFIntCod_To',fld:'vTFINTCOD_TO',pic:'Z9'},{av:'AV48TFIntDsc',fld:'vTFINTDSC',pic:''},{av:'AV49TFIntDsc_Sel',fld:'vTFINTDSC_SEL',pic:''},{av:'AV58TFIntCodF',fld:'vTFINTCODF',pic:'Z9'},{av:'AV59TFIntCodF_To',fld:'vTFINTCODF_TO',pic:'Z9'},{av:'AV60TFIntDscF',fld:'vTFINTDSCF',pic:''},{av:'AV61TFIntDscF_Sel',fld:'vTFINTDSCF_SEL',pic:''},{av:'AV88TFForNumCol',fld:'vTFFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV89TFForNumCol_To',fld:'vTFFORNUMCOL_TO',pic:'ZZZZZZZ9'},{av:'AV186TFForBlo_Sels',fld:'vTFFORBLO_SELS',pic:''},{av:'AV148TFForCosForm',fld:'vTFFORCOSFORM',pic:'ZZZZ9.99999'},{av:'AV149TFForCosForm_To',fld:'vTFFORCOSFORM_TO',pic:'ZZZZ9.99999'},{av:'AV90TFForFec',fld:'vTFFORFEC',pic:''},{av:'AV102TFForUltMod',fld:'vTFFORULTMOD',pic:''},{av:'AV189Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV185TFForBlo_SelsJson',fld:'vTFFORBLO_SELSJSON',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV30TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV31TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV32TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV33TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV34TFForSer',fld:'vTFFORSER',pic:''},{av:'AV35TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV36TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV37TFForSerDsc_Sel',fld:'vTFFORSERDSC_SEL',pic:''},{av:'AV118TFForTipArt',fld:'vTFFORTIPART',pic:'ZZZ9'},{av:'AV119TFForTipArt_To',fld:'vTFFORTIPART_TO',pic:'ZZZ9'},{av:'AV181TFForTipArtDsc',fld:'vTFFORTIPARTDSC',pic:''},{av:'AV182TFForTipArtDsc_Sel',fld:'vTFFORTIPARTDSC_SEL',pic:''},{av:'AV38TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV39TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV40TFForColNum',fld:'vTFFORCOLNUM',pic:'ZZZZZ9'},{av:'AV41TFForColNum_To',fld:'vTFFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV42TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV43TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV44TFTipColDsc',fld:'vTFTIPCOLDSC',pic:''},{av:'AV45TFTipColDsc_Sel',fld:'vTFTIPCOLDSC_SEL',pic:''},{av:'AV46TFIntCod',fld:'vTFINTCOD',pic:'Z9'},{av:'AV47TFIntCod_To',fld:'vTFINTCOD_TO',pic:'Z9'},{av:'AV48TFIntDsc',fld:'vTFINTDSC',pic:''},{av:'AV49TFIntDsc_Sel',fld:'vTFINTDSC_SEL',pic:''},{av:'AV58TFIntCodF',fld:'vTFINTCODF',pic:'Z9'},{av:'AV59TFIntCodF_To',fld:'vTFINTCODF_TO',pic:'Z9'},{av:'AV60TFIntDscF',fld:'vTFINTDSCF',pic:''},{av:'AV61TFIntDscF_Sel',fld:'vTFINTDSCF_SEL',pic:''},{av:'AV88TFForNumCol',fld:'vTFFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV89TFForNumCol_To',fld:'vTFFORNUMCOL_TO',pic:'ZZZZZZZ9'},{av:'AV186TFForBlo_Sels',fld:'vTFFORBLO_SELS',pic:''},{av:'AV148TFForCosForm',fld:'vTFFORCOSFORM',pic:'ZZZZ9.99999'},{av:'AV149TFForCosForm_To',fld:'vTFFORCOSFORM_TO',pic:'ZZZZ9.99999'},{av:'AV90TFForFec',fld:'vTFFORFEC',pic:''},{av:'AV102TFForUltMod',fld:'vTFFORULTMOD',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV185TFForBlo_SelsJson',fld:'vTFFORBLO_SELSJSON',pic:''},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtForSer_Visible',ctrl:'FORSER',prop:'Visible'},{av:'edtForSerDsc_Visible',ctrl:'FORSERDSC',prop:'Visible'},{av:'edtForTipArt_Visible',ctrl:'FORTIPART',prop:'Visible'},{av:'edtForTipArtD_Visible',ctrl:'FORTIPARTD',prop:'Visible'},{av:'edtForColNom_Visible',ctrl:'FORCOLNOM',prop:'Visible'},{av:'edtForColNum_Visible',ctrl:'FORCOLNUM',prop:'Visible'},{av:'edtTipColCod_Visible',ctrl:'TIPCOLCOD',prop:'Visible'},{av:'edtTipColDsc_Visible',ctrl:'TIPCOLDSC',prop:'Visible'},{av:'edtIntCod_Visible',ctrl:'INTCOD',prop:'Visible'},{av:'edtIntDsc_Visible',ctrl:'INTDSC',prop:'Visible'},{av:'edtIntCodF_Visible',ctrl:'INTCODF',prop:'Visible'},{av:'edtIntDscF_Visible',ctrl:'INTDSCF',prop:'Visible'},{av:'edtForNumCol_Visible',ctrl:'FORNUMCOL',prop:'Visible'},{av:'cmbForBlo'},{av:'edtForCosForm_Visible',ctrl:'FORCOSFORM',prop:'Visible'},{av:'edtForFec_Visible',ctrl:'FORFEC',prop:'Visible'},{av:'edtForUltMod_Visible',ctrl:'FORULTMOD',prop:'Visible'},{av:'AV168GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV169GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("'DOINFORMETIPOFICHA'","{handler:'e121KS1',iparms:[]");
      setEventMetadata("'DOINFORMETIPOFICHA'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_INFORMETIPOFICHA.CLOSE","{handler:'e191KS2',iparms:[{av:'Dvelop_confirmpanel_informetipoficha_Result',ctrl:'DVELOP_CONFIRMPANEL_INFORMETIPOFICHA',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV170Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV171Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV172Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV173Forser',fld:'vFORSER',pic:''},{av:'AV174Forser_to',fld:'vFORSER_TO',pic:''},{av:'AV175Forcolnum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV176Forcolnum_to',fld:'vFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV177Forcolnom',fld:'vFORCOLNOM',pic:''},{av:'AV178Forcolnom_to',fld:'vFORCOLNOM_TO',pic:''},{av:'AV179Tipcolcod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV180Tipcolcod_to',fld:'vTIPCOLCOD_TO',pic:'ZZZ9'},{av:'AV183ForNumColfrom',fld:'vFORNUMCOLFROM',pic:'ZZZZZZZ9'},{av:'AV184ForNumColto',fld:'vFORNUMCOLTO',pic:'ZZZZZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV30TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV31TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV32TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV33TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV34TFForSer',fld:'vTFFORSER',pic:''},{av:'AV35TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV36TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV37TFForSerDsc_Sel',fld:'vTFFORSERDSC_SEL',pic:''},{av:'AV118TFForTipArt',fld:'vTFFORTIPART',pic:'ZZZ9'},{av:'AV119TFForTipArt_To',fld:'vTFFORTIPART_TO',pic:'ZZZ9'},{av:'AV181TFForTipArtDsc',fld:'vTFFORTIPARTDSC',pic:''},{av:'AV182TFForTipArtDsc_Sel',fld:'vTFFORTIPARTDSC_SEL',pic:''},{av:'AV38TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV39TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV40TFForColNum',fld:'vTFFORCOLNUM',pic:'ZZZZZ9'},{av:'AV41TFForColNum_To',fld:'vTFFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV42TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV43TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV44TFTipColDsc',fld:'vTFTIPCOLDSC',pic:''},{av:'AV45TFTipColDsc_Sel',fld:'vTFTIPCOLDSC_SEL',pic:''},{av:'AV46TFIntCod',fld:'vTFINTCOD',pic:'Z9'},{av:'AV47TFIntCod_To',fld:'vTFINTCOD_TO',pic:'Z9'},{av:'AV48TFIntDsc',fld:'vTFINTDSC',pic:''},{av:'AV49TFIntDsc_Sel',fld:'vTFINTDSC_SEL',pic:''},{av:'AV58TFIntCodF',fld:'vTFINTCODF',pic:'Z9'},{av:'AV59TFIntCodF_To',fld:'vTFINTCODF_TO',pic:'Z9'},{av:'AV60TFIntDscF',fld:'vTFINTDSCF',pic:''},{av:'AV61TFIntDscF_Sel',fld:'vTFINTDSCF_SEL',pic:''},{av:'AV88TFForNumCol',fld:'vTFFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV89TFForNumCol_To',fld:'vTFFORNUMCOL_TO',pic:'ZZZZZZZ9'},{av:'AV186TFForBlo_Sels',fld:'vTFFORBLO_SELS',pic:''},{av:'AV148TFForCosForm',fld:'vTFFORCOSFORM',pic:'ZZZZ9.99999'},{av:'AV149TFForCosForm_To',fld:'vTFFORCOSFORM_TO',pic:'ZZZZ9.99999'},{av:'AV90TFForFec',fld:'vTFFORFEC',pic:''},{av:'AV102TFForUltMod',fld:'vTFFORULTMOD',pic:''},{av:'AV189Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_INFORMETIPOFICHA.CLOSE",",oparms:[{av:'AV184ForNumColto',fld:'vFORNUMCOLTO',pic:'ZZZZZZZ9'},{av:'AV183ForNumColfrom',fld:'vFORNUMCOLFROM',pic:'ZZZZZZZ9'},{av:'AV180Tipcolcod_to',fld:'vTIPCOLCOD_TO',pic:'ZZZ9'},{av:'AV179Tipcolcod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV178Forcolnom_to',fld:'vFORCOLNOM_TO',pic:''},{av:'AV177Forcolnom',fld:'vFORCOLNOM',pic:''},{av:'AV176Forcolnum_to',fld:'vFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV175Forcolnum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV174Forser_to',fld:'vFORSER_TO',pic:''},{av:'AV173Forser',fld:'vFORSER',pic:''},{av:'AV172Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV171Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV170Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtForSer_Visible',ctrl:'FORSER',prop:'Visible'},{av:'edtForSerDsc_Visible',ctrl:'FORSERDSC',prop:'Visible'},{av:'edtForTipArt_Visible',ctrl:'FORTIPART',prop:'Visible'},{av:'edtForTipArtD_Visible',ctrl:'FORTIPARTD',prop:'Visible'},{av:'edtForColNom_Visible',ctrl:'FORCOLNOM',prop:'Visible'},{av:'edtForColNum_Visible',ctrl:'FORCOLNUM',prop:'Visible'},{av:'edtTipColCod_Visible',ctrl:'TIPCOLCOD',prop:'Visible'},{av:'edtTipColDsc_Visible',ctrl:'TIPCOLDSC',prop:'Visible'},{av:'edtIntCod_Visible',ctrl:'INTCOD',prop:'Visible'},{av:'edtIntDsc_Visible',ctrl:'INTDSC',prop:'Visible'},{av:'edtIntCodF_Visible',ctrl:'INTCODF',prop:'Visible'},{av:'edtIntDscF_Visible',ctrl:'INTDSCF',prop:'Visible'},{av:'edtForNumCol_Visible',ctrl:'FORNUMCOL',prop:'Visible'},{av:'cmbForBlo'},{av:'edtForCosForm_Visible',ctrl:'FORCOSFORM',prop:'Visible'},{av:'edtForFec_Visible',ctrl:'FORFEC',prop:'Visible'},{av:'edtForUltMod_Visible',ctrl:'FORULTMOD',prop:'Visible'},{av:'AV168GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV169GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOINFORMEFORMULASCONCLAVES'","{handler:'e131KS1',iparms:[]");
      setEventMetadata("'DOINFORMEFORMULASCONCLAVES'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_INFORMEFORMULASCONCLAVES.CLOSE","{handler:'e201KS2',iparms:[{av:'Dvelop_confirmpanel_informeformulasconclaves_Result',ctrl:'DVELOP_CONFIRMPANEL_INFORMEFORMULASCONCLAVES',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV170Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV171Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV172Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV173Forser',fld:'vFORSER',pic:''},{av:'AV174Forser_to',fld:'vFORSER_TO',pic:''},{av:'AV175Forcolnum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV176Forcolnum_to',fld:'vFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV177Forcolnom',fld:'vFORCOLNOM',pic:''},{av:'AV178Forcolnom_to',fld:'vFORCOLNOM_TO',pic:''},{av:'AV179Tipcolcod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV180Tipcolcod_to',fld:'vTIPCOLCOD_TO',pic:'ZZZ9'},{av:'AV183ForNumColfrom',fld:'vFORNUMCOLFROM',pic:'ZZZZZZZ9'},{av:'AV184ForNumColto',fld:'vFORNUMCOLTO',pic:'ZZZZZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV30TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV31TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV32TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV33TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV34TFForSer',fld:'vTFFORSER',pic:''},{av:'AV35TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV36TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV37TFForSerDsc_Sel',fld:'vTFFORSERDSC_SEL',pic:''},{av:'AV118TFForTipArt',fld:'vTFFORTIPART',pic:'ZZZ9'},{av:'AV119TFForTipArt_To',fld:'vTFFORTIPART_TO',pic:'ZZZ9'},{av:'AV181TFForTipArtDsc',fld:'vTFFORTIPARTDSC',pic:''},{av:'AV182TFForTipArtDsc_Sel',fld:'vTFFORTIPARTDSC_SEL',pic:''},{av:'AV38TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV39TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV40TFForColNum',fld:'vTFFORCOLNUM',pic:'ZZZZZ9'},{av:'AV41TFForColNum_To',fld:'vTFFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV42TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV43TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV44TFTipColDsc',fld:'vTFTIPCOLDSC',pic:''},{av:'AV45TFTipColDsc_Sel',fld:'vTFTIPCOLDSC_SEL',pic:''},{av:'AV46TFIntCod',fld:'vTFINTCOD',pic:'Z9'},{av:'AV47TFIntCod_To',fld:'vTFINTCOD_TO',pic:'Z9'},{av:'AV48TFIntDsc',fld:'vTFINTDSC',pic:''},{av:'AV49TFIntDsc_Sel',fld:'vTFINTDSC_SEL',pic:''},{av:'AV58TFIntCodF',fld:'vTFINTCODF',pic:'Z9'},{av:'AV59TFIntCodF_To',fld:'vTFINTCODF_TO',pic:'Z9'},{av:'AV60TFIntDscF',fld:'vTFINTDSCF',pic:''},{av:'AV61TFIntDscF_Sel',fld:'vTFINTDSCF_SEL',pic:''},{av:'AV88TFForNumCol',fld:'vTFFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV89TFForNumCol_To',fld:'vTFFORNUMCOL_TO',pic:'ZZZZZZZ9'},{av:'AV186TFForBlo_Sels',fld:'vTFFORBLO_SELS',pic:''},{av:'AV148TFForCosForm',fld:'vTFFORCOSFORM',pic:'ZZZZ9.99999'},{av:'AV149TFForCosForm_To',fld:'vTFFORCOSFORM_TO',pic:'ZZZZ9.99999'},{av:'AV90TFForFec',fld:'vTFFORFEC',pic:''},{av:'AV102TFForUltMod',fld:'vTFFORULTMOD',pic:''},{av:'AV189Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_INFORMEFORMULASCONCLAVES.CLOSE",",oparms:[{av:'AV184ForNumColto',fld:'vFORNUMCOLTO',pic:'ZZZZZZZ9'},{av:'AV183ForNumColfrom',fld:'vFORNUMCOLFROM',pic:'ZZZZZZZ9'},{av:'AV180Tipcolcod_to',fld:'vTIPCOLCOD_TO',pic:'ZZZ9'},{av:'AV179Tipcolcod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV178Forcolnom_to',fld:'vFORCOLNOM_TO',pic:''},{av:'AV177Forcolnom',fld:'vFORCOLNOM',pic:''},{av:'AV176Forcolnum_to',fld:'vFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV175Forcolnum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV174Forser_to',fld:'vFORSER_TO',pic:''},{av:'AV173Forser',fld:'vFORSER',pic:''},{av:'AV172Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV171Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV170Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtForSer_Visible',ctrl:'FORSER',prop:'Visible'},{av:'edtForSerDsc_Visible',ctrl:'FORSERDSC',prop:'Visible'},{av:'edtForTipArt_Visible',ctrl:'FORTIPART',prop:'Visible'},{av:'edtForTipArtD_Visible',ctrl:'FORTIPARTD',prop:'Visible'},{av:'edtForColNom_Visible',ctrl:'FORCOLNOM',prop:'Visible'},{av:'edtForColNum_Visible',ctrl:'FORCOLNUM',prop:'Visible'},{av:'edtTipColCod_Visible',ctrl:'TIPCOLCOD',prop:'Visible'},{av:'edtTipColDsc_Visible',ctrl:'TIPCOLDSC',prop:'Visible'},{av:'edtIntCod_Visible',ctrl:'INTCOD',prop:'Visible'},{av:'edtIntDsc_Visible',ctrl:'INTDSC',prop:'Visible'},{av:'edtIntCodF_Visible',ctrl:'INTCODF',prop:'Visible'},{av:'edtIntDscF_Visible',ctrl:'INTDSCF',prop:'Visible'},{av:'edtForNumCol_Visible',ctrl:'FORNUMCOL',prop:'Visible'},{av:'cmbForBlo'},{av:'edtForCosForm_Visible',ctrl:'FORCOSFORM',prop:'Visible'},{av:'edtForFec_Visible',ctrl:'FORFEC',prop:'Visible'},{av:'edtForUltMod_Visible',ctrl:'FORULTMOD',prop:'Visible'},{av:'AV168GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV169GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e211KS2',iparms:[]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e111KS1',iparms:[]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'Innewwindow1_Target',ctrl:'INNEWWINDOW1',prop:'Target'},{av:'Innewwindow1_Height',ctrl:'INNEWWINDOW1',prop:'Height'},{av:'Innewwindow1_Width',ctrl:'INNEWWINDOW1',prop:'Width'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e221KS2',iparms:[]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_CLINOM","{handler:'valid_Clinom',iparms:[]");
      setEventMetadata("VALID_CLINOM",",oparms:[]}");
      setEventMetadata("VALID_FORSER","{handler:'valid_Forser',iparms:[]");
      setEventMetadata("VALID_FORSER",",oparms:[]}");
      setEventMetadata("VALID_FORSERDSC","{handler:'valid_Forserdsc',iparms:[]");
      setEventMetadata("VALID_FORSERDSC",",oparms:[]}");
      setEventMetadata("VALID_FORTIPART","{handler:'valid_Fortipart',iparms:[]");
      setEventMetadata("VALID_FORTIPART",",oparms:[]}");
      setEventMetadata("VALID_FORTIPARTD","{handler:'valid_Fortipartd',iparms:[]");
      setEventMetadata("VALID_FORTIPARTD",",oparms:[]}");
      setEventMetadata("VALID_FORCOLNOM","{handler:'valid_Forcolnom',iparms:[]");
      setEventMetadata("VALID_FORCOLNOM",",oparms:[]}");
      setEventMetadata("VALID_FORCOLNUM","{handler:'valid_Forcolnum',iparms:[]");
      setEventMetadata("VALID_FORCOLNUM",",oparms:[]}");
      setEventMetadata("VALID_TIPCOLCOD","{handler:'valid_Tipcolcod',iparms:[]");
      setEventMetadata("VALID_TIPCOLCOD",",oparms:[]}");
      setEventMetadata("VALID_TIPCOLDSC","{handler:'valid_Tipcoldsc',iparms:[]");
      setEventMetadata("VALID_TIPCOLDSC",",oparms:[]}");
      setEventMetadata("VALID_INTCOD","{handler:'valid_Intcod',iparms:[]");
      setEventMetadata("VALID_INTCOD",",oparms:[]}");
      setEventMetadata("VALID_INTDSC","{handler:'valid_Intdsc',iparms:[]");
      setEventMetadata("VALID_INTDSC",",oparms:[]}");
      setEventMetadata("VALID_INTCODF","{handler:'valid_Intcodf',iparms:[]");
      setEventMetadata("VALID_INTCODF",",oparms:[]}");
      setEventMetadata("VALID_INTDSCF","{handler:'valid_Intdscf',iparms:[]");
      setEventMetadata("VALID_INTDSCF",",oparms:[]}");
      setEventMetadata("VALID_FORNUMCOL","{handler:'valid_Fornumcol',iparms:[]");
      setEventMetadata("VALID_FORNUMCOL",",oparms:[]}");
      setEventMetadata("VALID_FORBLO","{handler:'valid_Forblo',iparms:[]");
      setEventMetadata("VALID_FORBLO",",oparms:[]}");
      setEventMetadata("VALID_FORCOSFORM","{handler:'valid_Forcosform',iparms:[]");
      setEventMetadata("VALID_FORCOSFORM",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Forultmod',iparms:[]");
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
      wcpOAV170Emprcod = "" ;
      wcpOAV173Forser = "" ;
      wcpOAV174Forser_to = "" ;
      wcpOAV177Forcolnom = "" ;
      wcpOAV178Forcolnom_to = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      Dvelop_confirmpanel_informetipoficha_Result = "" ;
      Dvelop_confirmpanel_informeformulasconclaves_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV170Emprcod = "" ;
      AV173Forser = "" ;
      AV174Forser_to = "" ;
      AV177Forcolnom = "" ;
      AV178Forcolnom_to = "" ;
      AV20ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV15FilterFullText = "" ;
      AV32TFCliNom = "" ;
      AV33TFCliNom_Sel = "" ;
      AV34TFForSer = "" ;
      AV35TFForSer_Sel = "" ;
      AV36TFForSerDsc = "" ;
      AV37TFForSerDsc_Sel = "" ;
      AV181TFForTipArtDsc = "" ;
      AV182TFForTipArtDsc_Sel = "" ;
      AV38TFForColNom = "" ;
      AV39TFForColNom_Sel = "" ;
      AV44TFTipColDsc = "" ;
      AV45TFTipColDsc_Sel = "" ;
      AV48TFIntDsc = "" ;
      AV49TFIntDsc_Sel = "" ;
      AV60TFIntDscF = "" ;
      AV61TFIntDscF_Sel = "" ;
      AV186TFForBlo_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV148TFForCosForm = DecimalUtil.ZERO ;
      AV149TFForCosForm_To = DecimalUtil.ZERO ;
      AV90TFForFec = GXutil.nullDate() ;
      AV102TFForUltMod = GXutil.nullDate() ;
      AV189Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV23ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV166DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV185TFForBlo_SelsJson = "" ;
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
      bttBtnexportreport_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtninformetipoficha_Jsonclick = "" ;
      bttBtninformeformulasconclaves_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucInnewwindow1 = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV92DDO_ForFecAuxDate = GXutil.nullDate() ;
      AV104DDO_ForUltModAuxDate = GXutil.nullDate() ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A279CliNom = "" ;
      A494ForSer = "" ;
      A5742ForSerDsc = "" ;
      A13929ForTipArtD = "" ;
      A482ForColNom = "" ;
      A832TipColDsc = "" ;
      A584IntDsc = "" ;
      A5363IntDscF = "" ;
      A7781ForBlo = "" ;
      A4380ForCosForm = DecimalUtil.ZERO ;
      A485ForFec = GXutil.nullDate() ;
      A495ForUltMod = GXutil.nullDate() ;
      AV193Formulaciontinte_listadodeformulas_wcds_1_filterfulltext = "" ;
      AV196Formulaciontinte_listadodeformulas_wcds_4_tfclinom = "" ;
      AV197Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel = "" ;
      AV198Formulaciontinte_listadodeformulas_wcds_6_tfforser = "" ;
      AV199Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel = "" ;
      AV200Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc = "" ;
      AV201Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel = "" ;
      AV204Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc = "" ;
      AV205Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel = "" ;
      AV206Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom = "" ;
      AV207Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel = "" ;
      AV212Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc = "" ;
      AV213Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel = "" ;
      AV216Formulaciontinte_listadodeformulas_wcds_24_tfintdsc = "" ;
      AV217Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel = "" ;
      AV220Formulaciontinte_listadodeformulas_wcds_28_tfintdscf = "" ;
      AV221Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel = "" ;
      AV224Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV225Formulaciontinte_listadodeformulas_wcds_33_tfforcosform = DecimalUtil.ZERO ;
      AV226Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to = DecimalUtil.ZERO ;
      AV227Formulaciontinte_listadodeformulas_wcds_35_tfforfec = GXutil.nullDate() ;
      AV228Formulaciontinte_listadodeformulas_wcds_36_tfforultmod = GXutil.nullDate() ;
      scmdbuf = "" ;
      lV204Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc = "" ;
      lV193Formulaciontinte_listadodeformulas_wcds_1_filterfulltext = "" ;
      lV196Formulaciontinte_listadodeformulas_wcds_4_tfclinom = "" ;
      lV198Formulaciontinte_listadodeformulas_wcds_6_tfforser = "" ;
      lV200Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc = "" ;
      lV206Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom = "" ;
      lV212Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc = "" ;
      lV216Formulaciontinte_listadodeformulas_wcds_24_tfintdsc = "" ;
      lV220Formulaciontinte_listadodeformulas_wcds_28_tfintdscf = "" ;
      A10045CliAct = "" ;
      A396EmprCod = "" ;
      H01KS2_A829TipArtCod = new short[1] ;
      H01KS2_A396EmprCod = new String[] {""} ;
      H01KS2_A10045CliAct = new String[] {""} ;
      H01KS2_A495ForUltMod = new java.util.Date[] {GXutil.nullDate()} ;
      H01KS2_n495ForUltMod = new boolean[] {false} ;
      H01KS2_A485ForFec = new java.util.Date[] {GXutil.nullDate()} ;
      H01KS2_n485ForFec = new boolean[] {false} ;
      H01KS2_A4380ForCosForm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01KS2_n4380ForCosForm = new boolean[] {false} ;
      H01KS2_A7781ForBlo = new String[] {""} ;
      H01KS2_n7781ForBlo = new boolean[] {false} ;
      H01KS2_A486ForNumCol = new int[1] ;
      H01KS2_A5363IntDscF = new String[] {""} ;
      H01KS2_n5363IntDscF = new boolean[] {false} ;
      H01KS2_A5362IntCodF = new byte[1] ;
      H01KS2_n5362IntCodF = new boolean[] {false} ;
      H01KS2_A584IntDsc = new String[] {""} ;
      H01KS2_n584IntDsc = new boolean[] {false} ;
      H01KS2_A583IntCod = new byte[1] ;
      H01KS2_A832TipColDsc = new String[] {""} ;
      H01KS2_n832TipColDsc = new boolean[] {false} ;
      H01KS2_A831TipColCod = new byte[1] ;
      H01KS2_A483ForColNum = new int[1] ;
      H01KS2_A482ForColNom = new String[] {""} ;
      H01KS2_A4384ForTipArt = new short[1] ;
      H01KS2_n4384ForTipArt = new boolean[] {false} ;
      H01KS2_A5742ForSerDsc = new String[] {""} ;
      H01KS2_n5742ForSerDsc = new boolean[] {false} ;
      H01KS2_A494ForSer = new String[] {""} ;
      H01KS2_A279CliNom = new String[] {""} ;
      H01KS2_A252CliCod = new int[1] ;
      H01KS2_A13929ForTipArtD = new String[] {""} ;
      H01KS2_n13929ForTipArtD = new boolean[] {false} ;
      H01KS3_A829TipArtCod = new short[1] ;
      H01KS3_A396EmprCod = new String[] {""} ;
      H01KS3_A10045CliAct = new String[] {""} ;
      H01KS3_A495ForUltMod = new java.util.Date[] {GXutil.nullDate()} ;
      H01KS3_n495ForUltMod = new boolean[] {false} ;
      H01KS3_A485ForFec = new java.util.Date[] {GXutil.nullDate()} ;
      H01KS3_n485ForFec = new boolean[] {false} ;
      H01KS3_A4380ForCosForm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01KS3_n4380ForCosForm = new boolean[] {false} ;
      H01KS3_A7781ForBlo = new String[] {""} ;
      H01KS3_n7781ForBlo = new boolean[] {false} ;
      H01KS3_A486ForNumCol = new int[1] ;
      H01KS3_A5363IntDscF = new String[] {""} ;
      H01KS3_n5363IntDscF = new boolean[] {false} ;
      H01KS3_A5362IntCodF = new byte[1] ;
      H01KS3_n5362IntCodF = new boolean[] {false} ;
      H01KS3_A584IntDsc = new String[] {""} ;
      H01KS3_n584IntDsc = new boolean[] {false} ;
      H01KS3_A583IntCod = new byte[1] ;
      H01KS3_A832TipColDsc = new String[] {""} ;
      H01KS3_n832TipColDsc = new boolean[] {false} ;
      H01KS3_A831TipColCod = new byte[1] ;
      H01KS3_A483ForColNum = new int[1] ;
      H01KS3_A482ForColNom = new String[] {""} ;
      H01KS3_A4384ForTipArt = new short[1] ;
      H01KS3_n4384ForTipArt = new boolean[] {false} ;
      H01KS3_A5742ForSerDsc = new String[] {""} ;
      H01KS3_n5742ForSerDsc = new boolean[] {false} ;
      H01KS3_A494ForSer = new String[] {""} ;
      H01KS3_A279CliNom = new String[] {""} ;
      H01KS3_A252CliCod = new int[1] ;
      H01KS3_A13929ForTipArtD = new String[] {""} ;
      H01KS3_n13929ForTipArtD = new boolean[] {false} ;
      hsh = "" ;
      AV190Station = "" ;
      AV191Emprnom = "" ;
      AV192Usurcod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV22Session = httpContext.getWebSession();
      AV18ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV24ManageFiltersXml = "" ;
      AV16ExcelFilename = "" ;
      AV17ErrorMessage = "" ;
      AV19UserCustomValue = "" ;
      AV21ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11 = new GXBaseCollection[1] ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXt_char24 = "" ;
      GXv_char25 = new String[1] ;
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
      GXv_SdtWWPGridState26 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      ucDvelop_confirmpanel_informeformulasconclaves = new com.genexus.webpanels.GXUserControl();
      ucDvelop_confirmpanel_informetipoficha = new com.genexus.webpanels.GXUserControl();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV170Emprcod = "" ;
      sCtrlAV171Clicod = "" ;
      sCtrlAV172Clicod_to = "" ;
      sCtrlAV173Forser = "" ;
      sCtrlAV174Forser_to = "" ;
      sCtrlAV175Forcolnum = "" ;
      sCtrlAV176Forcolnum_to = "" ;
      sCtrlAV177Forcolnom = "" ;
      sCtrlAV178Forcolnom_to = "" ;
      sCtrlAV179Tipcolcod = "" ;
      sCtrlAV180Tipcolcod_to = "" ;
      sCtrlAV183ForNumColfrom = "" ;
      sCtrlAV184ForNumColto = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GXCCtl = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.listadodeformulas_wc__default(),
         new Object[] {
             new Object[] {
            H01KS2_A829TipArtCod, H01KS2_A396EmprCod, H01KS2_A10045CliAct, H01KS2_A495ForUltMod, H01KS2_n495ForUltMod, H01KS2_A485ForFec, H01KS2_n485ForFec, H01KS2_A4380ForCosForm, H01KS2_n4380ForCosForm, H01KS2_A7781ForBlo,
            H01KS2_n7781ForBlo, H01KS2_A486ForNumCol, H01KS2_A5363IntDscF, H01KS2_n5363IntDscF, H01KS2_A5362IntCodF, H01KS2_n5362IntCodF, H01KS2_A584IntDsc, H01KS2_n584IntDsc, H01KS2_A583IntCod, H01KS2_A832TipColDsc,
            H01KS2_n832TipColDsc, H01KS2_A831TipColCod, H01KS2_A483ForColNum, H01KS2_A482ForColNom, H01KS2_A4384ForTipArt, H01KS2_n4384ForTipArt, H01KS2_A5742ForSerDsc, H01KS2_n5742ForSerDsc, H01KS2_A494ForSer, H01KS2_A279CliNom,
            H01KS2_A252CliCod, H01KS2_A13929ForTipArtD, H01KS2_n13929ForTipArtD
            }
            , new Object[] {
            H01KS3_A829TipArtCod, H01KS3_A396EmprCod, H01KS3_A10045CliAct, H01KS3_A495ForUltMod, H01KS3_n495ForUltMod, H01KS3_A485ForFec, H01KS3_n485ForFec, H01KS3_A4380ForCosForm, H01KS3_n4380ForCosForm, H01KS3_A7781ForBlo,
            H01KS3_n7781ForBlo, H01KS3_A486ForNumCol, H01KS3_A5363IntDscF, H01KS3_n5363IntDscF, H01KS3_A5362IntCodF, H01KS3_n5362IntCodF, H01KS3_A584IntDsc, H01KS3_n584IntDsc, H01KS3_A583IntCod, H01KS3_A832TipColDsc,
            H01KS3_n832TipColDsc, H01KS3_A831TipColCod, H01KS3_A483ForColNum, H01KS3_A482ForColNom, H01KS3_A4384ForTipArt, H01KS3_n4384ForTipArt, H01KS3_A5742ForSerDsc, H01KS3_n5742ForSerDsc, H01KS3_A494ForSer, H01KS3_A279CliNom,
            H01KS3_A252CliCod, H01KS3_A13929ForTipArtD, H01KS3_n13929ForTipArtD
            }
         }
      );
      AV189Pgmname = "FormulacionTinte.ListadodeFormulas_WC" ;
      /* GeneXus formulas. */
      AV189Pgmname = "FormulacionTinte.ListadodeFormulas_WC" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOAV179Tipcolcod ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV179Tipcolcod ;
   private byte AV25ManageFiltersExecutionStep ;
   private byte AV42TFTipColCod ;
   private byte AV43TFTipColCod_To ;
   private byte AV46TFIntCod ;
   private byte AV47TFIntCod_To ;
   private byte AV58TFIntCodF ;
   private byte AV59TFIntCodF_To ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte A831TipColCod ;
   private byte A583IntCod ;
   private byte A5362IntCodF ;
   private byte nDonePA ;
   private byte AV210Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod ;
   private byte AV211Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to ;
   private byte AV214Formulaciontinte_listadodeformulas_wcds_22_tfintcod ;
   private byte AV215Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to ;
   private byte AV218Formulaciontinte_listadodeformulas_wcds_26_tfintcodf ;
   private byte AV219Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short wcpOAV180Tipcolcod_to ;
   private short AV180Tipcolcod_to ;
   private short AV118TFForTipArt ;
   private short AV119TFForTipArt_To ;
   private short AV12OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short A4384ForTipArt ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV202Formulaciontinte_listadodeformulas_wcds_10_tffortipart ;
   private short AV203Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to ;
   private int wcpOAV171Clicod ;
   private int wcpOAV172Clicod_to ;
   private int wcpOAV175Forcolnum ;
   private int wcpOAV176Forcolnum_to ;
   private int wcpOAV183ForNumColfrom ;
   private int wcpOAV184ForNumColto ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_47 ;
   private int AV171Clicod ;
   private int AV172Clicod_to ;
   private int AV175Forcolnum ;
   private int AV176Forcolnum_to ;
   private int AV183ForNumColfrom ;
   private int AV184ForNumColto ;
   private int nGXsfl_47_idx=1 ;
   private int AV30TFCliCod ;
   private int AV31TFCliCod_To ;
   private int AV40TFForColNum ;
   private int AV41TFForColNum_To ;
   private int AV88TFForNumCol ;
   private int AV89TFForNumCol_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavPgmname_Enabled ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int A486ForNumCol ;
   private int subGrid_Islastpage ;
   private int AV194Formulaciontinte_listadodeformulas_wcds_2_tfclicod ;
   private int AV195Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to ;
   private int AV208Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum ;
   private int AV209Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to ;
   private int AV222Formulaciontinte_listadodeformulas_wcds_30_tffornumcol ;
   private int AV223Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to ;
   private int AV224Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels_size ;
   private int edtCliCod_Visible ;
   private int edtCliNom_Visible ;
   private int edtForSer_Visible ;
   private int edtForSerDsc_Visible ;
   private int edtForTipArt_Visible ;
   private int edtForTipArtD_Visible ;
   private int edtForColNom_Visible ;
   private int edtForColNum_Visible ;
   private int edtTipColCod_Visible ;
   private int edtTipColDsc_Visible ;
   private int edtIntCod_Visible ;
   private int edtIntDsc_Visible ;
   private int edtIntCodF_Visible ;
   private int edtIntDscF_Visible ;
   private int edtForNumCol_Visible ;
   private int edtForCosForm_Visible ;
   private int edtForFec_Visible ;
   private int edtForUltMod_Visible ;
   private int AV167PageToGo ;
   private int AV229GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV168GridCurrentPage ;
   private long AV169GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV148TFForCosForm ;
   private java.math.BigDecimal AV149TFForCosForm_To ;
   private java.math.BigDecimal A4380ForCosForm ;
   private java.math.BigDecimal AV225Formulaciontinte_listadodeformulas_wcds_33_tfforcosform ;
   private java.math.BigDecimal AV226Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to ;
   private String wcpOAV170Emprcod ;
   private String wcpOAV173Forser ;
   private String wcpOAV174Forser_to ;
   private String wcpOAV177Forcolnom ;
   private String wcpOAV178Forcolnom_to ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String Dvelop_confirmpanel_informetipoficha_Result ;
   private String Dvelop_confirmpanel_informeformulasconclaves_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV170Emprcod ;
   private String AV173Forser ;
   private String AV174Forser_to ;
   private String AV177Forcolnom ;
   private String AV178Forcolnom_to ;
   private String sGXsfl_47_idx="0001" ;
   private String AV32TFCliNom ;
   private String AV33TFCliNom_Sel ;
   private String AV34TFForSer ;
   private String AV35TFForSer_Sel ;
   private String AV36TFForSerDsc ;
   private String AV37TFForSerDsc_Sel ;
   private String AV181TFForTipArtDsc ;
   private String AV182TFForTipArtDsc_Sel ;
   private String AV38TFForColNom ;
   private String AV39TFForColNom_Sel ;
   private String AV44TFTipColDsc ;
   private String AV45TFTipColDsc_Sel ;
   private String AV48TFIntDsc ;
   private String AV49TFIntDsc_Sel ;
   private String AV60TFIntDscF ;
   private String AV61TFIntDscF_Sel ;
   private String AV189Pgmname ;
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
   private String Innewwindow1_Width ;
   private String Innewwindow1_Height ;
   private String Innewwindow1_Target ;
   private String Ddo_gridcolumnsselector_Caption ;
   private String Ddo_gridcolumnsselector_Tooltip ;
   private String Ddo_gridcolumnsselector_Cls ;
   private String Ddo_gridcolumnsselector_Dropdownoptionstype ;
   private String Ddo_gridcolumnsselector_Gridinternalname ;
   private String Ddo_gridcolumnsselector_Titlecontrolidtoreplace ;
   private String Dvelop_confirmpanel_informetipoficha_Title ;
   private String Dvelop_confirmpanel_informetipoficha_Confirmationtext ;
   private String Dvelop_confirmpanel_informetipoficha_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_informetipoficha_Nobuttoncaption ;
   private String Dvelop_confirmpanel_informetipoficha_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_informetipoficha_Yesbuttonposition ;
   private String Dvelop_confirmpanel_informetipoficha_Confirmtype ;
   private String Dvelop_confirmpanel_informeformulasconclaves_Title ;
   private String Dvelop_confirmpanel_informeformulasconclaves_Confirmationtext ;
   private String Dvelop_confirmpanel_informeformulasconclaves_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_informeformulasconclaves_Nobuttoncaption ;
   private String Dvelop_confirmpanel_informeformulasconclaves_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_informeformulasconclaves_Yesbuttonposition ;
   private String Dvelop_confirmpanel_informeformulasconclaves_Confirmtype ;
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
   private String bttBtnexportreport_Internalname ;
   private String bttBtnexportreport_Jsonclick ;
   private String bttBtnexportcsv_Internalname ;
   private String bttBtnexportcsv_Jsonclick ;
   private String bttBtninformetipoficha_Internalname ;
   private String bttBtninformetipoficha_Jsonclick ;
   private String bttBtninformeformulasconclaves_Internalname ;
   private String bttBtninformeformulasconclaves_Jsonclick ;
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Innewwindow1_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_forfecauxdates_Internalname ;
   private String edtavDdo_forfecauxdate_Internalname ;
   private String edtavDdo_forfecauxdate_Jsonclick ;
   private String divDdo_forultmodauxdates_Internalname ;
   private String edtavDdo_forultmodauxdate_Internalname ;
   private String edtavDdo_forultmodauxdate_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavFilterfulltext_Internalname ;
   private String edtCliCod_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Internalname ;
   private String A494ForSer ;
   private String edtForSer_Internalname ;
   private String A5742ForSerDsc ;
   private String edtForSerDsc_Internalname ;
   private String edtForTipArt_Internalname ;
   private String A13929ForTipArtD ;
   private String edtForTipArtD_Internalname ;
   private String A482ForColNom ;
   private String edtForColNom_Internalname ;
   private String edtForColNum_Internalname ;
   private String edtTipColCod_Internalname ;
   private String A832TipColDsc ;
   private String edtTipColDsc_Internalname ;
   private String edtIntCod_Internalname ;
   private String A584IntDsc ;
   private String edtIntDsc_Internalname ;
   private String edtIntCodF_Internalname ;
   private String A5363IntDscF ;
   private String edtIntDscF_Internalname ;
   private String edtForNumCol_Internalname ;
   private String A7781ForBlo ;
   private String edtForCosForm_Internalname ;
   private String edtForFec_Internalname ;
   private String edtForUltMod_Internalname ;
   private String AV196Formulaciontinte_listadodeformulas_wcds_4_tfclinom ;
   private String AV197Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel ;
   private String AV198Formulaciontinte_listadodeformulas_wcds_6_tfforser ;
   private String AV199Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel ;
   private String AV200Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc ;
   private String AV201Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel ;
   private String AV204Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc ;
   private String AV205Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel ;
   private String AV206Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom ;
   private String AV207Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel ;
   private String AV212Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc ;
   private String AV213Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel ;
   private String AV216Formulaciontinte_listadodeformulas_wcds_24_tfintdsc ;
   private String AV217Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel ;
   private String AV220Formulaciontinte_listadodeformulas_wcds_28_tfintdscf ;
   private String AV221Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel ;
   private String scmdbuf ;
   private String lV204Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc ;
   private String lV196Formulaciontinte_listadodeformulas_wcds_4_tfclinom ;
   private String lV198Formulaciontinte_listadodeformulas_wcds_6_tfforser ;
   private String lV200Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc ;
   private String lV206Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom ;
   private String lV212Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc ;
   private String lV216Formulaciontinte_listadodeformulas_wcds_24_tfintdsc ;
   private String lV220Formulaciontinte_listadodeformulas_wcds_28_tfintdscf ;
   private String A10045CliAct ;
   private String A396EmprCod ;
   private String hsh ;
   private String AV190Station ;
   private String AV191Emprnom ;
   private String AV192Usurcod ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXt_char24 ;
   private String GXv_char25[] ;
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
   private String tblTabledvelop_confirmpanel_informeformulasconclaves_Internalname ;
   private String Dvelop_confirmpanel_informeformulasconclaves_Internalname ;
   private String tblTabledvelop_confirmpanel_informetipoficha_Internalname ;
   private String Dvelop_confirmpanel_informetipoficha_Internalname ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV170Emprcod ;
   private String sCtrlAV171Clicod ;
   private String sCtrlAV172Clicod_to ;
   private String sCtrlAV173Forser ;
   private String sCtrlAV174Forser_to ;
   private String sCtrlAV175Forcolnum ;
   private String sCtrlAV176Forcolnum_to ;
   private String sCtrlAV177Forcolnom ;
   private String sCtrlAV178Forcolnom_to ;
   private String sCtrlAV179Tipcolcod ;
   private String sCtrlAV180Tipcolcod_to ;
   private String sCtrlAV183ForNumColfrom ;
   private String sCtrlAV184ForNumColto ;
   private String sGXsfl_47_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtForSer_Jsonclick ;
   private String edtForSerDsc_Jsonclick ;
   private String edtForTipArt_Jsonclick ;
   private String edtForTipArtD_Jsonclick ;
   private String edtForColNom_Jsonclick ;
   private String edtForColNum_Jsonclick ;
   private String edtTipColCod_Jsonclick ;
   private String edtTipColDsc_Jsonclick ;
   private String edtIntCod_Jsonclick ;
   private String edtIntDsc_Jsonclick ;
   private String edtIntCodF_Jsonclick ;
   private String edtIntDscF_Jsonclick ;
   private String edtForNumCol_Jsonclick ;
   private String GXCCtl ;
   private String edtForCosForm_Jsonclick ;
   private String edtForFec_Jsonclick ;
   private String edtForUltMod_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV90TFForFec ;
   private java.util.Date AV102TFForUltMod ;
   private java.util.Date AV92DDO_ForFecAuxDate ;
   private java.util.Date AV104DDO_ForUltModAuxDate ;
   private java.util.Date A485ForFec ;
   private java.util.Date A495ForUltMod ;
   private java.util.Date AV227Formulaciontinte_listadodeformulas_wcds_35_tfforfec ;
   private java.util.Date AV228Formulaciontinte_listadodeformulas_wcds_36_tfforultmod ;
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
   private boolean n5742ForSerDsc ;
   private boolean n4384ForTipArt ;
   private boolean n13929ForTipArtD ;
   private boolean n832TipColDsc ;
   private boolean n584IntDsc ;
   private boolean n5362IntCodF ;
   private boolean n5363IntDscF ;
   private boolean n7781ForBlo ;
   private boolean n4380ForCosForm ;
   private boolean n485ForFec ;
   private boolean n495ForUltMod ;
   private boolean bGXsfl_47_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV185TFForBlo_SelsJson ;
   private String AV18ColumnsSelectorXML ;
   private String AV24ManageFiltersXml ;
   private String AV19UserCustomValue ;
   private String AV15FilterFullText ;
   private String AV193Formulaciontinte_listadodeformulas_wcds_1_filterfulltext ;
   private String lV193Formulaciontinte_listadodeformulas_wcds_1_filterfulltext ;
   private String AV16ExcelFilename ;
   private String AV17ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV22Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucInnewwindow1 ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_informeformulasconclaves ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_informetipoficha ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbForBlo ;
   private IDataStoreProvider pr_default ;
   private short[] H01KS2_A829TipArtCod ;
   private String[] H01KS2_A396EmprCod ;
   private String[] H01KS2_A10045CliAct ;
   private java.util.Date[] H01KS2_A495ForUltMod ;
   private boolean[] H01KS2_n495ForUltMod ;
   private java.util.Date[] H01KS2_A485ForFec ;
   private boolean[] H01KS2_n485ForFec ;
   private java.math.BigDecimal[] H01KS2_A4380ForCosForm ;
   private boolean[] H01KS2_n4380ForCosForm ;
   private String[] H01KS2_A7781ForBlo ;
   private boolean[] H01KS2_n7781ForBlo ;
   private int[] H01KS2_A486ForNumCol ;
   private String[] H01KS2_A5363IntDscF ;
   private boolean[] H01KS2_n5363IntDscF ;
   private byte[] H01KS2_A5362IntCodF ;
   private boolean[] H01KS2_n5362IntCodF ;
   private String[] H01KS2_A584IntDsc ;
   private boolean[] H01KS2_n584IntDsc ;
   private byte[] H01KS2_A583IntCod ;
   private String[] H01KS2_A832TipColDsc ;
   private boolean[] H01KS2_n832TipColDsc ;
   private byte[] H01KS2_A831TipColCod ;
   private int[] H01KS2_A483ForColNum ;
   private String[] H01KS2_A482ForColNom ;
   private short[] H01KS2_A4384ForTipArt ;
   private boolean[] H01KS2_n4384ForTipArt ;
   private String[] H01KS2_A5742ForSerDsc ;
   private boolean[] H01KS2_n5742ForSerDsc ;
   private String[] H01KS2_A494ForSer ;
   private String[] H01KS2_A279CliNom ;
   private int[] H01KS2_A252CliCod ;
   private String[] H01KS2_A13929ForTipArtD ;
   private boolean[] H01KS2_n13929ForTipArtD ;
   private short[] H01KS3_A829TipArtCod ;
   private String[] H01KS3_A396EmprCod ;
   private String[] H01KS3_A10045CliAct ;
   private java.util.Date[] H01KS3_A495ForUltMod ;
   private boolean[] H01KS3_n495ForUltMod ;
   private java.util.Date[] H01KS3_A485ForFec ;
   private boolean[] H01KS3_n485ForFec ;
   private java.math.BigDecimal[] H01KS3_A4380ForCosForm ;
   private boolean[] H01KS3_n4380ForCosForm ;
   private String[] H01KS3_A7781ForBlo ;
   private boolean[] H01KS3_n7781ForBlo ;
   private int[] H01KS3_A486ForNumCol ;
   private String[] H01KS3_A5363IntDscF ;
   private boolean[] H01KS3_n5363IntDscF ;
   private byte[] H01KS3_A5362IntCodF ;
   private boolean[] H01KS3_n5362IntCodF ;
   private String[] H01KS3_A584IntDsc ;
   private boolean[] H01KS3_n584IntDsc ;
   private byte[] H01KS3_A583IntCod ;
   private String[] H01KS3_A832TipColDsc ;
   private boolean[] H01KS3_n832TipColDsc ;
   private byte[] H01KS3_A831TipColCod ;
   private int[] H01KS3_A483ForColNum ;
   private String[] H01KS3_A482ForColNom ;
   private short[] H01KS3_A4384ForTipArt ;
   private boolean[] H01KS3_n4384ForTipArt ;
   private String[] H01KS3_A5742ForSerDsc ;
   private boolean[] H01KS3_n5742ForSerDsc ;
   private String[] H01KS3_A494ForSer ;
   private String[] H01KS3_A279CliNom ;
   private int[] H01KS3_A252CliCod ;
   private String[] H01KS3_A13929ForTipArtD ;
   private boolean[] H01KS3_n13929ForTipArtD ;
   private GXSimpleCollection<String> AV186TFForBlo_Sels ;
   private GXSimpleCollection<String> AV224Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV23ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV21ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV166DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState26[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
}

final  class listadodeformulas_wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01KS2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A7781ForBlo ,
                                          GXSimpleCollection<String> AV224Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels ,
                                          int AV194Formulaciontinte_listadodeformulas_wcds_2_tfclicod ,
                                          int AV195Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to ,
                                          String AV197Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel ,
                                          String AV196Formulaciontinte_listadodeformulas_wcds_4_tfclinom ,
                                          String AV199Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel ,
                                          String AV198Formulaciontinte_listadodeformulas_wcds_6_tfforser ,
                                          String AV201Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel ,
                                          String AV200Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc ,
                                          short AV202Formulaciontinte_listadodeformulas_wcds_10_tffortipart ,
                                          short AV203Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to ,
                                          String AV207Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel ,
                                          String AV206Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom ,
                                          int AV208Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum ,
                                          int AV209Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to ,
                                          byte AV210Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod ,
                                          byte AV211Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to ,
                                          String AV213Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel ,
                                          String AV212Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc ,
                                          byte AV214Formulaciontinte_listadodeformulas_wcds_22_tfintcod ,
                                          byte AV215Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to ,
                                          String AV217Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel ,
                                          String AV216Formulaciontinte_listadodeformulas_wcds_24_tfintdsc ,
                                          byte AV218Formulaciontinte_listadodeformulas_wcds_26_tfintcodf ,
                                          byte AV219Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to ,
                                          String AV221Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel ,
                                          String AV220Formulaciontinte_listadodeformulas_wcds_28_tfintdscf ,
                                          int AV222Formulaciontinte_listadodeformulas_wcds_30_tffornumcol ,
                                          int AV223Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to ,
                                          int AV224Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels_size ,
                                          java.math.BigDecimal AV225Formulaciontinte_listadodeformulas_wcds_33_tfforcosform ,
                                          java.math.BigDecimal AV226Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to ,
                                          java.util.Date AV227Formulaciontinte_listadodeformulas_wcds_35_tfforfec ,
                                          java.util.Date AV228Formulaciontinte_listadodeformulas_wcds_36_tfforultmod ,
                                          int AV171Clicod ,
                                          int AV172Clicod_to ,
                                          String AV173Forser ,
                                          String AV174Forser_to ,
                                          String AV177Forcolnom ,
                                          String AV178Forcolnom_to ,
                                          int AV175Forcolnum ,
                                          int AV176Forcolnum_to ,
                                          byte AV179Tipcolcod ,
                                          short AV180Tipcolcod_to ,
                                          int AV183ForNumColfrom ,
                                          int AV184ForNumColto ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          short A4384ForTipArt ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          byte A583IntCod ,
                                          String A584IntDsc ,
                                          byte A5362IntCodF ,
                                          String A5363IntDscF ,
                                          int A486ForNumCol ,
                                          java.math.BigDecimal A4380ForCosForm ,
                                          java.util.Date A485ForFec ,
                                          java.util.Date A495ForUltMod ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV193Formulaciontinte_listadodeformulas_wcds_1_filterfulltext ,
                                          String A13929ForTipArtD ,
                                          String AV205Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel ,
                                          String AV204Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc ,
                                          String A10045CliAct ,
                                          String AV170Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int27 = new byte[50];
      Object[] GXv_Object28 = new Object[2];
      scmdbuf = "SELECT T5.TipArtCod, T1.EmprCod, T6.CliAct, T1.ForUltMod, T1.ForFec, T1.ForCosForm, T1.ForBlo, T1.ForNumCol, T2.IntDscF, T1.IntCodF, T3.IntDsc, T1.IntCod, T4.TipColDsc," ;
      scmdbuf += " T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForTipArt, T1.ForSerDsc, T1.ForSer, T6.CliNom, T1.CliCod, COALESCE( T5.TipArtDsc, ' ') AS ForTipArtD FROM (((((TXPCFORMU" ;
      scmdbuf += " T1 LEFT JOIN TXPINTFAC T2 ON T2.EmprCod = T1.EmprCod AND T2.IntCodF = T1.IntCodF) INNER JOIN TXPINTENS T3 ON T3.EmprCod = T1.EmprCod AND T3.IntCod = T1.IntCod)" ;
      scmdbuf += " INNER JOIN TXPTIPCOL T4 ON T4.EmprCod = T1.EmprCod AND T4.TipColCod = T1.TipColCod) LEFT JOIN TXPTIPART T5 ON T5.EmprCod = T1.EmprCod AND T5.TipArtCod = T1.ForTipArt)" ;
      scmdbuf += " INNER JOIN TXPCLIENT T6 ON T6.EmprCod = T1.EmprCod AND T6.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T5.TipArtDsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T5.TipArtDsc, ' ') = ?))");
      addWhere(sWhereString, "(T6.CliAct = 'S')");
      if ( ! (0==AV194Formulaciontinte_listadodeformulas_wcds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int27[6] = (byte)(1) ;
      }
      if ( ! (0==AV195Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int27[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV197Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV196Formulaciontinte_listadodeformulas_wcds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T6.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV197Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T6.CliNom = ?)");
      }
      else
      {
         GXv_int27[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV199Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV198Formulaciontinte_listadodeformulas_wcds_6_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV199Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int27[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV201Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV200Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV201Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int27[13] = (byte)(1) ;
      }
      if ( ! (0==AV202Formulaciontinte_listadodeformulas_wcds_10_tffortipart) )
      {
         addWhere(sWhereString, "(T1.ForTipArt >= ?)");
      }
      else
      {
         GXv_int27[14] = (byte)(1) ;
      }
      if ( ! (0==AV203Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to) )
      {
         addWhere(sWhereString, "(T1.ForTipArt <= ?)");
      }
      else
      {
         GXv_int27[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV207Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV206Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV207Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int27[17] = (byte)(1) ;
      }
      if ( ! (0==AV208Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int27[18] = (byte)(1) ;
      }
      if ( ! (0==AV209Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int27[19] = (byte)(1) ;
      }
      if ( ! (0==AV210Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int27[20] = (byte)(1) ;
      }
      if ( ! (0==AV211Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int27[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV213Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV212Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV213Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.TipColDsc = ?)");
      }
      else
      {
         GXv_int27[23] = (byte)(1) ;
      }
      if ( ! (0==AV214Formulaciontinte_listadodeformulas_wcds_22_tfintcod) )
      {
         addWhere(sWhereString, "(T1.IntCod >= ?)");
      }
      else
      {
         GXv_int27[24] = (byte)(1) ;
      }
      if ( ! (0==AV215Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to) )
      {
         addWhere(sWhereString, "(T1.IntCod <= ?)");
      }
      else
      {
         GXv_int27[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV217Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel)==0) && ( ! (GXutil.strcmp("", AV216Formulaciontinte_listadodeformulas_wcds_24_tfintdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.IntDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV217Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.IntDsc = ?)");
      }
      else
      {
         GXv_int27[27] = (byte)(1) ;
      }
      if ( ! (0==AV218Formulaciontinte_listadodeformulas_wcds_26_tfintcodf) )
      {
         addWhere(sWhereString, "(T1.IntCodF >= ?)");
      }
      else
      {
         GXv_int27[28] = (byte)(1) ;
      }
      if ( ! (0==AV219Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to) )
      {
         addWhere(sWhereString, "(T1.IntCodF <= ?)");
      }
      else
      {
         GXv_int27[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV221Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel)==0) && ( ! (GXutil.strcmp("", AV220Formulaciontinte_listadodeformulas_wcds_28_tfintdscf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.IntDscF) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV221Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel)==0) )
      {
         addWhere(sWhereString, "(T2.IntDscF = ?)");
      }
      else
      {
         GXv_int27[31] = (byte)(1) ;
      }
      if ( ! (0==AV222Formulaciontinte_listadodeformulas_wcds_30_tffornumcol) )
      {
         addWhere(sWhereString, "(T1.ForNumCol >= ?)");
      }
      else
      {
         GXv_int27[32] = (byte)(1) ;
      }
      if ( ! (0==AV223Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to) )
      {
         addWhere(sWhereString, "(T1.ForNumCol <= ?)");
      }
      else
      {
         GXv_int27[33] = (byte)(1) ;
      }
      if ( AV224Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV224Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels, "T1.ForBlo IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV225Formulaciontinte_listadodeformulas_wcds_33_tfforcosform)==0) )
      {
         addWhere(sWhereString, "(T1.ForCosForm >= ?)");
      }
      else
      {
         GXv_int27[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV226Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForCosForm <= ?)");
      }
      else
      {
         GXv_int27[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV227Formulaciontinte_listadodeformulas_wcds_35_tfforfec)) )
      {
         addWhere(sWhereString, "(T1.ForFec >= ?)");
      }
      else
      {
         GXv_int27[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV228Formulaciontinte_listadodeformulas_wcds_36_tfforultmod)) )
      {
         addWhere(sWhereString, "(T1.ForUltMod >= ?)");
      }
      else
      {
         GXv_int27[37] = (byte)(1) ;
      }
      if ( ! (0==AV171Clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int27[38] = (byte)(1) ;
      }
      if ( ! (0==AV172Clicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int27[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV173Forser)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer >= ?)");
      }
      else
      {
         GXv_int27[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV174Forser_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer <= ?)");
      }
      else
      {
         GXv_int27[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV177Forcolnom)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom >= ?)");
      }
      else
      {
         GXv_int27[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV178Forcolnom_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom <= ?)");
      }
      else
      {
         GXv_int27[43] = (byte)(1) ;
      }
      if ( ! (0==AV175Forcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int27[44] = (byte)(1) ;
      }
      if ( ! (0==AV176Forcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int27[45] = (byte)(1) ;
      }
      if ( ! (0==AV179Tipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int27[46] = (byte)(1) ;
      }
      if ( ! (0==AV180Tipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int27[47] = (byte)(1) ;
      }
      if ( ! (0==AV183ForNumColfrom) )
      {
         addWhere(sWhereString, "(T1.ForNumCol >= ?)");
      }
      else
      {
         GXv_int27[48] = (byte)(1) ;
      }
      if ( ! (0==AV184ForNumColto) )
      {
         addWhere(sWhereString, "(T1.ForNumCol <= ?)");
      }
      else
      {
         GXv_int27[49] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T6.CliNom" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T6.CliNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForSer" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForSer DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForSerDsc" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForSerDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForTipArt" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForTipArt DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForColNom" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForColNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForColNum" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForColNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TipColCod" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TipColCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.TipColDsc" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.TipColDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.IntCod" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.IntCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.IntDsc" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.IntDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.IntCodF" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.IntCodF DESC" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.IntDscF" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.IntDscF DESC" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForNumCol" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForNumCol DESC" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForBlo" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForBlo DESC" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForCosForm" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForCosForm DESC" ;
      }
      else if ( ( AV12OrderedBy == 17 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForFec" ;
      }
      else if ( ( AV12OrderedBy == 17 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForFec DESC" ;
      }
      else if ( ( AV12OrderedBy == 18 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForUltMod" ;
      }
      else if ( ( AV12OrderedBy == 18 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForUltMod DESC" ;
      }
      GXv_Object28[0] = scmdbuf ;
      GXv_Object28[1] = GXv_int27 ;
      return GXv_Object28 ;
   }

   protected Object[] conditional_H01KS3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A7781ForBlo ,
                                          GXSimpleCollection<String> AV224Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels ,
                                          int AV194Formulaciontinte_listadodeformulas_wcds_2_tfclicod ,
                                          int AV195Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to ,
                                          String AV197Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel ,
                                          String AV196Formulaciontinte_listadodeformulas_wcds_4_tfclinom ,
                                          String AV199Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel ,
                                          String AV198Formulaciontinte_listadodeformulas_wcds_6_tfforser ,
                                          String AV201Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel ,
                                          String AV200Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc ,
                                          short AV202Formulaciontinte_listadodeformulas_wcds_10_tffortipart ,
                                          short AV203Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to ,
                                          String AV207Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel ,
                                          String AV206Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom ,
                                          int AV208Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum ,
                                          int AV209Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to ,
                                          byte AV210Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod ,
                                          byte AV211Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to ,
                                          String AV213Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel ,
                                          String AV212Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc ,
                                          byte AV214Formulaciontinte_listadodeformulas_wcds_22_tfintcod ,
                                          byte AV215Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to ,
                                          String AV217Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel ,
                                          String AV216Formulaciontinte_listadodeformulas_wcds_24_tfintdsc ,
                                          byte AV218Formulaciontinte_listadodeformulas_wcds_26_tfintcodf ,
                                          byte AV219Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to ,
                                          String AV221Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel ,
                                          String AV220Formulaciontinte_listadodeformulas_wcds_28_tfintdscf ,
                                          int AV222Formulaciontinte_listadodeformulas_wcds_30_tffornumcol ,
                                          int AV223Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to ,
                                          int AV224Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels_size ,
                                          java.math.BigDecimal AV225Formulaciontinte_listadodeformulas_wcds_33_tfforcosform ,
                                          java.math.BigDecimal AV226Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to ,
                                          java.util.Date AV227Formulaciontinte_listadodeformulas_wcds_35_tfforfec ,
                                          java.util.Date AV228Formulaciontinte_listadodeformulas_wcds_36_tfforultmod ,
                                          int AV171Clicod ,
                                          int AV172Clicod_to ,
                                          String AV173Forser ,
                                          String AV174Forser_to ,
                                          String AV177Forcolnom ,
                                          String AV178Forcolnom_to ,
                                          int AV175Forcolnum ,
                                          int AV176Forcolnum_to ,
                                          byte AV179Tipcolcod ,
                                          short AV180Tipcolcod_to ,
                                          int AV183ForNumColfrom ,
                                          int AV184ForNumColto ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          short A4384ForTipArt ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          byte A583IntCod ,
                                          String A584IntDsc ,
                                          byte A5362IntCodF ,
                                          String A5363IntDscF ,
                                          int A486ForNumCol ,
                                          java.math.BigDecimal A4380ForCosForm ,
                                          java.util.Date A485ForFec ,
                                          java.util.Date A495ForUltMod ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV193Formulaciontinte_listadodeformulas_wcds_1_filterfulltext ,
                                          String A13929ForTipArtD ,
                                          String AV205Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel ,
                                          String AV204Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc ,
                                          String A10045CliAct ,
                                          String AV170Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int30 = new byte[50];
      Object[] GXv_Object31 = new Object[2];
      scmdbuf = "SELECT T5.TipArtCod, T1.EmprCod, T6.CliAct, T1.ForUltMod, T1.ForFec, T1.ForCosForm, T1.ForBlo, T1.ForNumCol, T2.IntDscF, T1.IntCodF, T3.IntDsc, T1.IntCod, T4.TipColDsc," ;
      scmdbuf += " T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForTipArt, T1.ForSerDsc, T1.ForSer, T6.CliNom, T1.CliCod, COALESCE( T5.TipArtDsc, ' ') AS ForTipArtD FROM (((((TXPCFORMU" ;
      scmdbuf += " T1 LEFT JOIN TXPINTFAC T2 ON T2.EmprCod = T1.EmprCod AND T2.IntCodF = T1.IntCodF) INNER JOIN TXPINTENS T3 ON T3.EmprCod = T1.EmprCod AND T3.IntCod = T1.IntCod)" ;
      scmdbuf += " INNER JOIN TXPTIPCOL T4 ON T4.EmprCod = T1.EmprCod AND T4.TipColCod = T1.TipColCod) LEFT JOIN TXPTIPART T5 ON T5.EmprCod = T1.EmprCod AND T5.TipArtCod = T1.ForTipArt)" ;
      scmdbuf += " INNER JOIN TXPCLIENT T6 ON T6.EmprCod = T1.EmprCod AND T6.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T5.TipArtDsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T5.TipArtDsc, ' ') = ?))");
      addWhere(sWhereString, "(T6.CliAct = 'S')");
      if ( ! (0==AV194Formulaciontinte_listadodeformulas_wcds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int30[6] = (byte)(1) ;
      }
      if ( ! (0==AV195Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int30[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV197Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV196Formulaciontinte_listadodeformulas_wcds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T6.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV197Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T6.CliNom = ?)");
      }
      else
      {
         GXv_int30[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV199Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV198Formulaciontinte_listadodeformulas_wcds_6_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV199Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int30[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV201Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV200Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV201Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int30[13] = (byte)(1) ;
      }
      if ( ! (0==AV202Formulaciontinte_listadodeformulas_wcds_10_tffortipart) )
      {
         addWhere(sWhereString, "(T1.ForTipArt >= ?)");
      }
      else
      {
         GXv_int30[14] = (byte)(1) ;
      }
      if ( ! (0==AV203Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to) )
      {
         addWhere(sWhereString, "(T1.ForTipArt <= ?)");
      }
      else
      {
         GXv_int30[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV207Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV206Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV207Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int30[17] = (byte)(1) ;
      }
      if ( ! (0==AV208Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int30[18] = (byte)(1) ;
      }
      if ( ! (0==AV209Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int30[19] = (byte)(1) ;
      }
      if ( ! (0==AV210Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int30[20] = (byte)(1) ;
      }
      if ( ! (0==AV211Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int30[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV213Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV212Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV213Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.TipColDsc = ?)");
      }
      else
      {
         GXv_int30[23] = (byte)(1) ;
      }
      if ( ! (0==AV214Formulaciontinte_listadodeformulas_wcds_22_tfintcod) )
      {
         addWhere(sWhereString, "(T1.IntCod >= ?)");
      }
      else
      {
         GXv_int30[24] = (byte)(1) ;
      }
      if ( ! (0==AV215Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to) )
      {
         addWhere(sWhereString, "(T1.IntCod <= ?)");
      }
      else
      {
         GXv_int30[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV217Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel)==0) && ( ! (GXutil.strcmp("", AV216Formulaciontinte_listadodeformulas_wcds_24_tfintdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.IntDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV217Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.IntDsc = ?)");
      }
      else
      {
         GXv_int30[27] = (byte)(1) ;
      }
      if ( ! (0==AV218Formulaciontinte_listadodeformulas_wcds_26_tfintcodf) )
      {
         addWhere(sWhereString, "(T1.IntCodF >= ?)");
      }
      else
      {
         GXv_int30[28] = (byte)(1) ;
      }
      if ( ! (0==AV219Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to) )
      {
         addWhere(sWhereString, "(T1.IntCodF <= ?)");
      }
      else
      {
         GXv_int30[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV221Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel)==0) && ( ! (GXutil.strcmp("", AV220Formulaciontinte_listadodeformulas_wcds_28_tfintdscf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.IntDscF) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV221Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel)==0) )
      {
         addWhere(sWhereString, "(T2.IntDscF = ?)");
      }
      else
      {
         GXv_int30[31] = (byte)(1) ;
      }
      if ( ! (0==AV222Formulaciontinte_listadodeformulas_wcds_30_tffornumcol) )
      {
         addWhere(sWhereString, "(T1.ForNumCol >= ?)");
      }
      else
      {
         GXv_int30[32] = (byte)(1) ;
      }
      if ( ! (0==AV223Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to) )
      {
         addWhere(sWhereString, "(T1.ForNumCol <= ?)");
      }
      else
      {
         GXv_int30[33] = (byte)(1) ;
      }
      if ( AV224Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV224Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels, "T1.ForBlo IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV225Formulaciontinte_listadodeformulas_wcds_33_tfforcosform)==0) )
      {
         addWhere(sWhereString, "(T1.ForCosForm >= ?)");
      }
      else
      {
         GXv_int30[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV226Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForCosForm <= ?)");
      }
      else
      {
         GXv_int30[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV227Formulaciontinte_listadodeformulas_wcds_35_tfforfec)) )
      {
         addWhere(sWhereString, "(T1.ForFec >= ?)");
      }
      else
      {
         GXv_int30[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV228Formulaciontinte_listadodeformulas_wcds_36_tfforultmod)) )
      {
         addWhere(sWhereString, "(T1.ForUltMod >= ?)");
      }
      else
      {
         GXv_int30[37] = (byte)(1) ;
      }
      if ( ! (0==AV171Clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int30[38] = (byte)(1) ;
      }
      if ( ! (0==AV172Clicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int30[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV173Forser)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer >= ?)");
      }
      else
      {
         GXv_int30[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV174Forser_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer <= ?)");
      }
      else
      {
         GXv_int30[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV177Forcolnom)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom >= ?)");
      }
      else
      {
         GXv_int30[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV178Forcolnom_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom <= ?)");
      }
      else
      {
         GXv_int30[43] = (byte)(1) ;
      }
      if ( ! (0==AV175Forcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int30[44] = (byte)(1) ;
      }
      if ( ! (0==AV176Forcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int30[45] = (byte)(1) ;
      }
      if ( ! (0==AV179Tipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int30[46] = (byte)(1) ;
      }
      if ( ! (0==AV180Tipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int30[47] = (byte)(1) ;
      }
      if ( ! (0==AV183ForNumColfrom) )
      {
         addWhere(sWhereString, "(T1.ForNumCol >= ?)");
      }
      else
      {
         GXv_int30[48] = (byte)(1) ;
      }
      if ( ! (0==AV184ForNumColto) )
      {
         addWhere(sWhereString, "(T1.ForNumCol <= ?)");
      }
      else
      {
         GXv_int30[49] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T6.CliNom" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T6.CliNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForSer" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForSer DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForSerDsc" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForSerDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForTipArt" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForTipArt DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForColNom" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForColNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForColNum" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForColNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TipColCod" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TipColCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.TipColDsc" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.TipColDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.IntCod" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.IntCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.IntDsc" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.IntDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.IntCodF" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.IntCodF DESC" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.IntDscF" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.IntDscF DESC" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForNumCol" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForNumCol DESC" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForBlo" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForBlo DESC" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForCosForm" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForCosForm DESC" ;
      }
      else if ( ( AV12OrderedBy == 17 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForFec" ;
      }
      else if ( ( AV12OrderedBy == 17 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForFec DESC" ;
      }
      else if ( ( AV12OrderedBy == 18 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForUltMod" ;
      }
      else if ( ( AV12OrderedBy == 18 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForUltMod DESC" ;
      }
      GXv_Object31[0] = scmdbuf ;
      GXv_Object31[1] = GXv_int30 ;
      return GXv_Object31 ;
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
                  return conditional_H01KS2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).byteValue() , ((Number) dynConstraints[17]).byteValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).byteValue() , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).intValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).byteValue() , ((Number) dynConstraints[44]).shortValue() , ((Number) dynConstraints[45]).intValue() , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).intValue() , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , ((Number) dynConstraints[51]).shortValue() , (String)dynConstraints[52] , ((Number) dynConstraints[53]).intValue() , ((Number) dynConstraints[54]).byteValue() , (String)dynConstraints[55] , ((Number) dynConstraints[56]).byteValue() , (String)dynConstraints[57] , ((Number) dynConstraints[58]).byteValue() , (String)dynConstraints[59] , ((Number) dynConstraints[60]).intValue() , (java.math.BigDecimal)dynConstraints[61] , (java.util.Date)dynConstraints[62] , (java.util.Date)dynConstraints[63] , ((Number) dynConstraints[64]).shortValue() , ((Boolean) dynConstraints[65]).booleanValue() , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] );
            case 1 :
                  return conditional_H01KS3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).byteValue() , ((Number) dynConstraints[17]).byteValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).byteValue() , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).intValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).byteValue() , ((Number) dynConstraints[44]).shortValue() , ((Number) dynConstraints[45]).intValue() , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).intValue() , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , ((Number) dynConstraints[51]).shortValue() , (String)dynConstraints[52] , ((Number) dynConstraints[53]).intValue() , ((Number) dynConstraints[54]).byteValue() , (String)dynConstraints[55] , ((Number) dynConstraints[56]).byteValue() , (String)dynConstraints[57] , ((Number) dynConstraints[58]).byteValue() , (String)dynConstraints[59] , ((Number) dynConstraints[60]).intValue() , (java.math.BigDecimal)dynConstraints[61] , (java.util.Date)dynConstraints[62] , (java.util.Date)dynConstraints[63] , ((Number) dynConstraints[64]).shortValue() , ((Boolean) dynConstraints[65]).booleanValue() , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01KS2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01KS3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(8);
               ((String[]) buf[12])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((byte[]) buf[18])[0] = rslt.getByte(12);
               ((String[]) buf[19])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(14);
               ((int[]) buf[22])[0] = rslt.getInt(15);
               ((String[]) buf[23])[0] = rslt.getString(16, 13);
               ((short[]) buf[24])[0] = rslt.getShort(17);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(18, 26);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(19, 16);
               ((String[]) buf[29])[0] = rslt.getString(20, 30);
               ((int[]) buf[30])[0] = rslt.getInt(21);
               ((String[]) buf[31])[0] = rslt.getString(22, 30);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(8);
               ((String[]) buf[12])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((byte[]) buf[18])[0] = rslt.getByte(12);
               ((String[]) buf[19])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(14);
               ((int[]) buf[22])[0] = rslt.getInt(15);
               ((String[]) buf[23])[0] = rslt.getString(16, 13);
               ((short[]) buf[24])[0] = rslt.getShort(17);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(18, 26);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(19, 16);
               ((String[]) buf[29])[0] = rslt.getString(20, 30);
               ((int[]) buf[30])[0] = rslt.getInt(21);
               ((String[]) buf[31])[0] = rslt.getString(22, 30);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[50], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 26);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[70]).byteValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[71]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[74]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[75]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 30);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[78]).byteValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[79]).byteValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[84], 5);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[85], 5);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[86]);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[87]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 16);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 16);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 13);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 13);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[96]).byteValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[97]).shortValue());
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[98]).intValue());
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[99]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 26);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[70]).byteValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[71]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[74]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[75]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 30);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[78]).byteValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[79]).byteValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[84], 5);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[85], 5);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[86]);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[87]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 16);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 16);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 13);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 13);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[96]).byteValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[97]).shortValue());
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[98]).intValue());
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[99]).intValue());
               }
               return;
      }
   }

}

