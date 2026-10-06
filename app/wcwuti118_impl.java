package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcwuti118_impl extends GXWebComponent
{
   public wcwuti118_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wcwuti118_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcwuti118_impl.class ));
   }

   public wcwuti118_impl( int remoteHandle ,
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
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( nGotPars == 0 )
         {
            entryPointCalled = false ;
            gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
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
               AV33EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33EmprCod", AV33EmprCod);
               AV5Fecha = localUtil.parseDateParm( httpContext.GetPar( "Fecha")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Fecha", localUtil.format(AV5Fecha, "99/99/99"));
               AV6Fecha_to = localUtil.parseDateParm( httpContext.GetPar( "Fecha_to")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Fecha_to", localUtil.format(AV6Fecha_to, "99/99/99"));
               AV206Prdnum1 = httpContext.GetPar( "Prdnum1") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV206Prdnum1", AV206Prdnum1);
               AV207PrdNum2 = httpContext.GetPar( "PrdNum2") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV207PrdNum2", AV207PrdNum2);
               AV9LoteBusqueda = httpContext.GetPar( "LoteBusqueda") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9LoteBusqueda", AV9LoteBusqueda);
               AV10CalStkIni = (byte)(GXutil.lval( httpContext.GetPar( "CalStkIni"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10CalStkIni", GXutil.str( AV10CalStkIni, 1, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV33EmprCod,AV5Fecha,AV6Fecha_to,AV206Prdnum1,AV207PrdNum2,AV9LoteBusqueda,Byte.valueOf(AV10CalStkIni)});
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
               gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
            {
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
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
      nRC_GXsfl_45 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_45"))) ;
      nGXsfl_45_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_45_idx"))) ;
      sGXsfl_45_idx = httpContext.GetPar( "sGXsfl_45_idx") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      edtavStockinicial_Title = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavStockinicial_Internalname, "Title", edtavStockinicial_Title, !bGXsfl_45_Refreshing);
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
      AV28ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV23ColumnsSelector);
      AV221Pgmname = httpContext.GetPar( "Pgmname") ;
      AV209OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV210OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV18FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV33EmprCod = httpContext.GetPar( "EmprCod") ;
      AV5Fecha = localUtil.parseDateParm( httpContext.GetPar( "Fecha")) ;
      AV6Fecha_to = localUtil.parseDateParm( httpContext.GetPar( "Fecha_to")) ;
      AV206Prdnum1 = httpContext.GetPar( "Prdnum1") ;
      AV207PrdNum2 = httpContext.GetPar( "PrdNum2") ;
      AV9LoteBusqueda = httpContext.GetPar( "LoteBusqueda") ;
      AV10CalStkIni = (byte)(GXutil.lval( httpContext.GetPar( "CalStkIni"))) ;
      edtavStockinicial_Title = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavStockinicial_Internalname, "Title", edtavStockinicial_Title, !bGXsfl_45_Refreshing);
      AV68Fec1 = localUtil.parseDateParm( httpContext.GetPar( "Fec1")) ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A719PrdNum = httpContext.GetPar( "PrdNum") ;
      n719PrdNum = false ;
      A12453HreFecAct = localUtil.parseDateParm( httpContext.GetPar( "HreFecAct")) ;
      n12453HreFecAct = false ;
      AV145Prdnumi = httpContext.GetPar( "Prdnumi") ;
      AV143PrdNumf = httpContext.GetPar( "PrdNumf") ;
      AV70Fec2 = localUtil.parseDateParm( httpContext.GetPar( "Fec2")) ;
      A4558HrePrdNum = httpContext.GetPar( "HrePrdNum") ;
      n4558HrePrdNum = false ;
      A4563HrePrdCant = CommonUtil.decimalVal( httpContext.GetPar( "HrePrdCant"), ".") ;
      n4563HrePrdCant = false ;
      A5726HreLote = httpContext.GetPar( "HreLote") ;
      n5726HreLote = false ;
      A862CumConFec = localUtil.parseDateParm( httpContext.GetPar( "CumConFec")) ;
      AV54Contval = (int)(GXutil.lval( httpContext.GetPar( "Contval"))) ;
      A860CumConCant = CommonUtil.decimalVal( httpContext.GetPar( "CumConCant"), ".") ;
      A5862CumConLot = httpContext.GetPar( "CumConLot") ;
      A3348CCStkFec = localUtil.parseDateParm( httpContext.GetPar( "CCStkFec")) ;
      A3345TipMovCc = httpContext.GetPar( "TipMovCc") ;
      A3357CCStkDsc = httpContext.GetPar( "CCStkDsc") ;
      A3344CCStkCanS = CommonUtil.decimalVal( httpContext.GetPar( "CCStkCanS"), ".") ;
      A5722CCStkLot = httpContext.GetPar( "CCStkLot") ;
      A415EntFecEnt = localUtil.parseDateParm( httpContext.GetPar( "EntFecEnt")) ;
      A11Albaran = httpContext.GetPar( "Albaran") ;
      A418EntUniEnt = CommonUtil.decimalVal( httpContext.GetPar( "EntUniEnt"), ".") ;
      A5686EntLotN = httpContext.GetPar( "EntLotN") ;
      AV7PrdnumIN = httpContext.GetPar( "PrdnumIN") ;
      AV115Lote2 = httpContext.GetPar( "Lote2") ;
      AV43CantC = CommonUtil.decimalVal( httpContext.GetPar( "CantC"), ".") ;
      AV44CantCm = CommonUtil.decimalVal( httpContext.GetPar( "CantCm"), ".") ;
      AV153q = (short)(GXutil.lval( httpContext.GetPar( "q"))) ;
      AV19PrdNum = httpContext.GetPar( "PrdNum") ;
      AV114Lote = httpContext.GetPar( "Lote") ;
      A11707HreProv = (int)(GXutil.lval( httpContext.GetPar( "HreProv"))) ;
      n11707HreProv = false ;
      A12718HreFabId = (int)(GXutil.lval( httpContext.GetPar( "HreFabId"))) ;
      n12718HreFabId = false ;
      AV148Proprv = (byte)(GXutil.lval( httpContext.GetPar( "Proprv"))) ;
      A6156EntPrvNum = (int)(GXutil.lval( httpContext.GetPar( "EntPrvNum"))) ;
      n6156EntPrvNum = false ;
      A12716EntFabId = (int)(GXutil.lval( httpContext.GetPar( "EntFabId"))) ;
      A658PedCod = (int)(GXutil.lval( httpContext.GetPar( "PedCod"))) ;
      n658PedCod = false ;
      AV152PrvNum2 = (int)(GXutil.lval( httpContext.GetPar( "PrvNum2"))) ;
      AV138PrdFabId = (int)(GXutil.lval( httpContext.GetPar( "PrdFabId"))) ;
      AV83HreLote = httpContext.GetPar( "HreLote") ;
      AV39Cant = CommonUtil.decimalVal( httpContext.GetPar( "Cant"), ".") ;
      AV172z = CommonUtil.decimalVal( httpContext.GetPar( "z"), ".") ;
      AV133pedcod = (int)(GXutil.lval( httpContext.GetPar( "pedcod"))) ;
      A795PrvNum = (int)(GXutil.lval( httpContext.GetPar( "PrvNum"))) ;
      A12714PrdFabId = (int)(GXutil.lval( httpContext.GetPar( "PrdFabId"))) ;
      n12714PrdFabId = false ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV28ManageFiltersExecutionStep, AV23ColumnsSelector, AV221Pgmname, AV209OrderedBy, AV210OrderedDsc, AV18FilterFullText, AV33EmprCod, AV5Fecha, AV6Fecha_to, AV206Prdnum1, AV207PrdNum2, AV9LoteBusqueda, AV10CalStkIni, AV68Fec1, A396EmprCod, A719PrdNum, A12453HreFecAct, AV145Prdnumi, AV143PrdNumf, AV70Fec2, A4558HrePrdNum, A4563HrePrdCant, A5726HreLote, A862CumConFec, AV54Contval, A860CumConCant, A5862CumConLot, A3348CCStkFec, A3345TipMovCc, A3357CCStkDsc, A3344CCStkCanS, A5722CCStkLot, A415EntFecEnt, A11Albaran, A418EntUniEnt, A5686EntLotN, AV7PrdnumIN, AV115Lote2, AV43CantC, AV44CantCm, AV153q, AV19PrdNum, AV114Lote, A11707HreProv, A12718HreFabId, AV148Proprv, A6156EntPrvNum, A12716EntFabId, A658PedCod, AV152PrvNum2, AV138PrdFabId, AV83HreLote, AV39Cant, AV172z, AV133pedcod, A795PrvNum, A12714PrdFabId, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa14F2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Analisis Consumos, Compras, Stock Final", "")) ;
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
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.wcwuti118", new String[] {GXutil.URLEncode(GXutil.rtrim(AV33EmprCod)),GXutil.URLEncode(GXutil.formatDateParm(AV5Fecha)),GXutil.URLEncode(GXutil.formatDateParm(AV6Fecha_to)),GXutil.URLEncode(GXutil.rtrim(AV206Prdnum1)),GXutil.URLEncode(GXutil.rtrim(AV207PrdNum2)),GXutil.URLEncode(GXutil.rtrim(AV9LoteBusqueda)),GXutil.URLEncode(GXutil.ltrimstr(AV10CalStkIni,1,0))}, new String[] {"EmprCod","Fecha","Fecha_to","Prdnum1","PrdNum2","LoteBusqueda","CalStkIni"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV221Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFEC1", getSecureSignedToken( sPrefix, AV68Fec1));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPRDNUMI", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV145Prdnumi, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPRDNUMF", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV143PrdNumf, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFEC2", getSecureSignedToken( sPrefix, AV70Fec2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCONTVAL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV54Contval), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPRDNUMIN", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV7PrdnumIN, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vLOTE2", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV115Lote2, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vQ", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV153q), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPROPRV", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV148Proprv), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPRVNUM2", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV152PrvNum2), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPRDFABID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV138PrdFabId), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vHRELOTE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV83HreLote, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCANT", getSecureSignedToken( sPrefix, localUtil.format( AV39Cant, "ZZZZZZ9.999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vZ", getSecureSignedToken( sPrefix, localUtil.format( AV172z, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPEDCOD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV133pedcod), "ZZZZZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_45", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_45, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV26ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV26ManageFiltersData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV29DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV29DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV23ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV23ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV33EmprCod", GXutil.rtrim( wcpOAV33EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV5Fecha", localUtil.dtoc( wcpOAV5Fecha, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV6Fecha_to", localUtil.dtoc( wcpOAV6Fecha_to, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV206Prdnum1", GXutil.rtrim( wcpOAV206Prdnum1));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV207PrdNum2", GXutil.rtrim( wcpOAV207PrdNum2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV9LoteBusqueda", GXutil.rtrim( wcpOAV9LoteBusqueda));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV10CalStkIni", GXutil.ltrim( localUtil.ntoc( wcpOAV10CalStkIni, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV28ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV221Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV221Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV209OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV210OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV33EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFECHA", localUtil.dtoc( AV5Fecha, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFECHA_TO", localUtil.dtoc( AV6Fecha_to, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRDNUM1", GXutil.rtrim( AV206Prdnum1));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRDNUM2", GXutil.rtrim( AV207PrdNum2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLOTEBUSQUEDA", GXutil.rtrim( AV9LoteBusqueda));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCALSTKINI", GXutil.ltrim( localUtil.ntoc( AV10CalStkIni, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vTAB_PRD", AV180Tab_prd);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vTAB_PRD", AV180Tab_prd);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vTAB_LTECN", AV179Tab_ltecn);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vTAB_LTECN", AV179Tab_ltecn);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vTAB_CNTCN", AV176Tab_cntcn);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vTAB_CNTCN", AV176Tab_cntcn);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vTAB_PRDCM", AV181tab_prdcm);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vTAB_PRDCM", AV181tab_prdcm);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vTAB_LTECM", AV178Tab_ltecm);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vTAB_LTECM", AV178Tab_ltecm);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vTAB_CNTCM", AV175Tab_cntcm);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vTAB_CNTCM", AV175Tab_cntcm);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFEC1", localUtil.dtoc( AV68Fec1, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFEC1", getSecureSignedToken( sPrefix, AV68Fec1));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PRDNUM", GXutil.rtrim( A719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HREFECACT", localUtil.dtoc( A12453HreFecAct, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRDNUMI", GXutil.rtrim( AV145Prdnumi));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPRDNUMI", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV145Prdnumi, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRDNUMF", GXutil.rtrim( AV143PrdNumf));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPRDNUMF", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV143PrdNumf, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFEC2", localUtil.dtoc( AV70Fec2, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFEC2", getSecureSignedToken( sPrefix, AV70Fec2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HREPRDNUM", GXutil.rtrim( A4558HrePrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HREPRDCANT", GXutil.ltrim( localUtil.ntoc( A4563HrePrdCant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HRELOTE", GXutil.rtrim( A5726HreLote));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CUMCONFEC", localUtil.dtoc( A862CumConFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCONTVAL", GXutil.ltrim( localUtil.ntoc( AV54Contval, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCONTVAL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV54Contval), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CUMCONCANT", GXutil.ltrim( localUtil.ntoc( A860CumConCant, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CUMCONLOT", GXutil.rtrim( A5862CumConLot));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CCSTKFEC", localUtil.dtoc( A3348CCStkFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TIPMOVCC", GXutil.rtrim( A3345TipMovCc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CCSTKDSC", GXutil.rtrim( A3357CCStkDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CCSTKCANS", GXutil.ltrim( localUtil.ntoc( A3344CCStkCanS, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CCSTKLOT", GXutil.rtrim( A5722CCStkLot));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"ENTFECENT", localUtil.dtoc( A415EntFecEnt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"ALBARAN", GXutil.rtrim( A11Albaran));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"ENTUNIENT", GXutil.ltrim( localUtil.ntoc( A418EntUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"ENTLOTN", GXutil.rtrim( A5686EntLotN));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vTAB_PROD", AV182Tab_prod);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vTAB_PROD", AV182Tab_prod);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRDNUMIN", GXutil.rtrim( AV7PrdnumIN));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPRDNUMIN", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV7PrdnumIN, ""))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vTAB_LOTE", AV177Tab_lote);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vTAB_LOTE", AV177Tab_lote);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLOTE2", GXutil.rtrim( AV115Lote2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vLOTE2", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV115Lote2, ""))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vTAB_CNT1", AV173Tab_cnt1);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vTAB_CNT1", AV173Tab_cnt1);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vTAB_CNT2", AV174Tab_cnt2);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vTAB_CNT2", AV174Tab_cnt2);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vQ", GXutil.ltrim( localUtil.ntoc( AV153q, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vQ", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV153q), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HREPROV", GXutil.ltrim( localUtil.ntoc( A11707HreProv, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HREFABID", GXutil.ltrim( localUtil.ntoc( A12718HreFabId, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPROPRV", GXutil.ltrim( localUtil.ntoc( AV148Proprv, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPROPRV", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV148Proprv), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"ENTPRVNUM", GXutil.ltrim( localUtil.ntoc( A6156EntPrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"ENTFABID", GXutil.ltrim( localUtil.ntoc( A12716EntFabId, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PEDCOD", GXutil.ltrim( localUtil.ntoc( A658PedCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRVNUM2", GXutil.ltrim( localUtil.ntoc( AV152PrvNum2, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPRVNUM2", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV152PrvNum2), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRDFABID", GXutil.ltrim( localUtil.ntoc( AV138PrdFabId, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPRDFABID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV138PrdFabId), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHRELOTE", GXutil.rtrim( AV83HreLote));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vHRELOTE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV83HreLote, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCANT", GXutil.ltrim( localUtil.ntoc( AV39Cant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCANT", getSecureSignedToken( sPrefix, localUtil.format( AV39Cant, "ZZZZZZ9.999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vZ", GXutil.ltrim( localUtil.ntoc( AV172z, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vZ", getSecureSignedToken( sPrefix, localUtil.format( AV172z, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPEDCOD", GXutil.ltrim( localUtil.ntoc( AV133pedcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPEDCOD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV133pedcod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PRVNUM", GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PRDFABID", GXutil.ltrim( localUtil.ntoc( A12714PrdFabId, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV16GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV16GridState);
      }
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Caption", GXutil.rtrim( Ddo_grid_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includesortasc", GXutil.rtrim( Ddo_grid_Includesortasc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Fixable", GXutil.rtrim( Ddo_grid_Fixable));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption", GXutil.rtrim( Ddo_gridcolumnsselector_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip", GXutil.rtrim( Ddo_gridcolumnsselector_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls", GXutil.rtrim( Ddo_gridcolumnsselector_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype", GXutil.rtrim( Ddo_gridcolumnsselector_Dropdownoptionstype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname", GXutil.rtrim( Ddo_gridcolumnsselector_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace", GXutil.rtrim( Ddo_gridcolumnsselector_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Infinitescrolling", GXutil.rtrim( Grid_empowerer_Infinitescrolling));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSTOCKINICIAL_Title", GXutil.rtrim( edtavStockinicial_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
   }

   public void renderHtmlCloseForm14F2( )
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
      return "WCWUti118" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Analisis Consumos, Compras, Stock Final", "") ;
   }

   public void wb14F0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.wcwuti118");
            httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
            httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucProgressbar.render(context, "gxprogressindicator", Progressbar_Internalname, sPrefix+"PROGRESSBARContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroupGrouped", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCWUti118.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCWUti118.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_27_14F2( true) ;
      }
      else
      {
         wb_table1_27_14F2( false) ;
      }
      return  ;
   }

   public void wb_table1_27_14F2e( boolean wbgen )
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
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithtotalizers_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol45( ) ;
      }
      if ( wbEnd == 45 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_45 = (int)(nGXsfl_45_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            GridContainer.AddObjectProperty("GRID_nEOF", GRID_nEOF);
            GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
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
         app.GxWebStd.gx_div_start( httpContext, divCell_grid_dwc_Internalname, 1, 0, "px", 0, "px", divCell_grid_dwc_Class, "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"W0058"+"", GXutil.rtrim( WebComp_Grid_dwc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+sPrefix+"gxHTMLWrpW0058"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_45_Refreshing )
            {
               if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldGrid_dwc), GXutil.lower( WebComp_Grid_dwc_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp(sPrefix+"gxHTMLWrpW0058"+"");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV29DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV29DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV23ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("InfiniteScrolling", Grid_empowerer_Infinitescrolling);
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 45 )
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
               GridContainer.AddObjectProperty("GRID_nEOF", GRID_nEOF);
               GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
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

   public void start14F2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Analisis Consumos, Compras, Stock Final", ""), (short)(0)) ;
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
            strup14F0( ) ;
         }
      }
   }

   public void ws14F2( )
   {
      start14F2( ) ;
      evt14F2( ) ;
   }

   public void evt14F2( )
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
                              strup14F0( ) ;
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
                              strup14F0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1114F2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup14F0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1214F2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup14F0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1314F2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup14F0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e1414F2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup14F0( ) ;
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
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup14F0( ) ;
                           }
                           sEvt = httpContext.cgiGet( sPrefix+"GRIDPAGING") ;
                           if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                           {
                              subgrid_firstpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "PREV") == 0 )
                           {
                              subgrid_previouspage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                           {
                              subgrid_nextpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                           {
                              subgrid_lastpage( ) ;
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
                              strup14F0( ) ;
                           }
                           nGXsfl_45_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_452( ) ;
                           AV208DetailWebComponent = httpContext.cgiGet( edtavDetailwebcomponent_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDetailwebcomponent_Internalname, AV208DetailWebComponent);
                           AV19PrdNum = httpContext.cgiGet( edtavPrdnum_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPrdnum_Internalname, AV19PrdNum);
                           app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPRDNUM"+"_"+sGXsfl_45_idx, getSecureSignedToken( sPrefix+sGXsfl_45_idx, GXutil.rtrim( localUtil.format( AV19PrdNum, ""))));
                           AV20PrdNom = httpContext.cgiGet( edtavPrdnom_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPrdnom_Internalname, AV20PrdNom);
                           AV114Lote = httpContext.cgiGet( edtavLote_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavLote_Internalname, AV114Lote);
                           app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vLOTE"+"_"+sGXsfl_45_idx, getSecureSignedToken( sPrefix+sGXsfl_45_idx, GXutil.rtrim( localUtil.format( AV114Lote, ""))));
                           AV139PrdFabNm = httpContext.cgiGet( edtavPrdfabnm_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPrdfabnm_Internalname, AV139PrdFabNm);
                           AV141PrdNomgrid = httpContext.cgiGet( edtavPrdnomgrid_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPrdnomgrid_Internalname, AV141PrdNomgrid);
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCantc_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCantc_Internalname)), DecimalUtil.stringToDec("9999999.999")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCANTC");
                              GX_FocusControl = edtavCantc_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV43CantC = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCantc_Internalname, GXutil.ltrimstr( AV43CantC, 11, 3));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCANTC"+"_"+sGXsfl_45_idx, getSecureSignedToken( sPrefix+sGXsfl_45_idx, localUtil.format( AV43CantC, "ZZZZZZ9.999")));
                           }
                           else
                           {
                              AV43CantC = localUtil.ctond( httpContext.cgiGet( edtavCantc_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCantc_Internalname, GXutil.ltrimstr( AV43CantC, 11, 3));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCANTC"+"_"+sGXsfl_45_idx, getSecureSignedToken( sPrefix+sGXsfl_45_idx, localUtil.format( AV43CantC, "ZZZZZZ9.999")));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCantcm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCantcm_Internalname)), DecimalUtil.stringToDec("99999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCANTCM");
                              GX_FocusControl = edtavCantcm_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV44CantCm = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCantcm_Internalname, GXutil.ltrimstr( AV44CantCm, 11, 2));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCANTCM"+"_"+sGXsfl_45_idx, getSecureSignedToken( sPrefix+sGXsfl_45_idx, localUtil.format( AV44CantCm, "ZZZZZZ9.99")));
                           }
                           else
                           {
                              AV44CantCm = localUtil.ctond( httpContext.cgiGet( edtavCantcm_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCantcm_Internalname, GXutil.ltrimstr( AV44CantCm, 11, 2));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCANTCM"+"_"+sGXsfl_45_idx, getSecureSignedToken( sPrefix+sGXsfl_45_idx, localUtil.format( AV44CantCm, "ZZZZZZ9.99")));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavStockinicial_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavStockinicial_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vSTOCKINICIAL");
                              GX_FocusControl = edtavStockinicial_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV157StockInicial = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavStockinicial_Internalname, GXutil.ltrimstr( AV157StockInicial, 12, 4));
                           }
                           else
                           {
                              AV157StockInicial = localUtil.ctond( httpContext.cgiGet( edtavStockinicial_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavStockinicial_Internalname, GXutil.ltrimstr( AV157StockInicial, 12, 4));
                           }
                           if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavStockfinal_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavStockfinal_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vSTOCKFINAL");
                              GX_FocusControl = edtavStockfinal_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV156Stockfinal = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavStockfinal_Internalname, GXutil.ltrimstr( AV156Stockfinal, 12, 4));
                           }
                           else
                           {
                              AV156Stockfinal = localUtil.ctond( httpContext.cgiGet( edtavStockfinal_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavStockfinal_Internalname, GXutil.ltrimstr( AV156Stockfinal, 12, 4));
                           }
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
                                       e1514F2 ();
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
                                       e1614F2 ();
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
                                       e1714F2 ();
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
                                    strup14F0( ) ;
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
                     if ( nCmpId == 58 )
                     {
                        OldGrid_dwc = httpContext.cgiGet( sPrefix+"W0058") ;
                        if ( ( GXutil.len( OldGrid_dwc) == 0 ) || ( GXutil.strcmp(OldGrid_dwc, WebComp_Grid_dwc_Component) != 0 ) )
                        {
                           WebComp_Grid_dwc = WebUtils.getWebComponent(getClass(), "app." + OldGrid_dwc + "_impl", remoteHandle, context);
                           WebComp_Grid_dwc_Component = OldGrid_dwc ;
                        }
                        if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
                        {
                           WebComp_Grid_dwc.componentprocess(sPrefix+"W0058", "", sEvt);
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

   public void we14F2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm14F2( ) ;
         }
      }
   }

   public void pa14F2( )
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
      subsflControlProps_452( ) ;
      while ( nGXsfl_45_idx <= nRC_GXsfl_45 )
      {
         sendrow_452( ) ;
         nGXsfl_45_idx = ((subGrid_Islastpage==1)&&(nGXsfl_45_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_452( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 byte AV28ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV23ColumnsSelector ,
                                 String AV221Pgmname ,
                                 short AV209OrderedBy ,
                                 boolean AV210OrderedDsc ,
                                 String AV18FilterFullText ,
                                 String AV33EmprCod ,
                                 java.util.Date AV5Fecha ,
                                 java.util.Date AV6Fecha_to ,
                                 String AV206Prdnum1 ,
                                 String AV207PrdNum2 ,
                                 String AV9LoteBusqueda ,
                                 byte AV10CalStkIni ,
                                 java.util.Date AV68Fec1 ,
                                 String A396EmprCod ,
                                 String A719PrdNum ,
                                 java.util.Date A12453HreFecAct ,
                                 String AV145Prdnumi ,
                                 String AV143PrdNumf ,
                                 java.util.Date AV70Fec2 ,
                                 String A4558HrePrdNum ,
                                 java.math.BigDecimal A4563HrePrdCant ,
                                 String A5726HreLote ,
                                 java.util.Date A862CumConFec ,
                                 int AV54Contval ,
                                 java.math.BigDecimal A860CumConCant ,
                                 String A5862CumConLot ,
                                 java.util.Date A3348CCStkFec ,
                                 String A3345TipMovCc ,
                                 String A3357CCStkDsc ,
                                 java.math.BigDecimal A3344CCStkCanS ,
                                 String A5722CCStkLot ,
                                 java.util.Date A415EntFecEnt ,
                                 String A11Albaran ,
                                 java.math.BigDecimal A418EntUniEnt ,
                                 String A5686EntLotN ,
                                 String AV7PrdnumIN ,
                                 String AV115Lote2 ,
                                 java.math.BigDecimal AV43CantC ,
                                 java.math.BigDecimal AV44CantCm ,
                                 short AV153q ,
                                 String AV19PrdNum ,
                                 String AV114Lote ,
                                 int A11707HreProv ,
                                 int A12718HreFabId ,
                                 byte AV148Proprv ,
                                 int A6156EntPrvNum ,
                                 int A12716EntFabId ,
                                 int A658PedCod ,
                                 int AV152PrvNum2 ,
                                 int AV138PrdFabId ,
                                 String AV83HreLote ,
                                 java.math.BigDecimal AV39Cant ,
                                 java.math.BigDecimal AV172z ,
                                 int AV133pedcod ,
                                 int A795PrvNum ,
                                 int A12714PrdFabId ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e1614F2 ();
      GRID_nCurrentRecord = 0 ;
      rf14F2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCANTC", getSecureSignedToken( sPrefix, localUtil.format( AV43CantC, "ZZZZZZ9.999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCANTC", GXutil.ltrim( localUtil.ntoc( AV43CantC, (byte)(11), (byte)(3), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCANTCM", getSecureSignedToken( sPrefix, localUtil.format( AV44CantCm, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCANTCM", GXutil.ltrim( localUtil.ntoc( AV44CantCm, (byte)(11), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPRDNUM", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV19PrdNum, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRDNUM", GXutil.rtrim( AV19PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vLOTE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV114Lote, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLOTE", GXutil.rtrim( AV114Lote));
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
      GRID_nFirstRecordOnPage = 0 ;
      GRID_nCurrentRecord = 0 ;
      GXCCtl = "GRID_nFirstRecordOnPage_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      send_integrity_hashes( ) ;
      rf14F2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV221Pgmname = "WCWUti118" ;
      Gx_err = (short)(0) ;
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavPrdnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrdnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdnum_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavPrdnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrdnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdnom_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavLote_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavLote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLote_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavPrdfabnm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrdfabnm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdfabnm_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavPrdnomgrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrdnomgrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdnomgrid_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavCantc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCantc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCantc_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavCantcm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCantcm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCantcm_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavStockinicial_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavStockinicial_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavStockinicial_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavStockfinal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavStockfinal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavStockfinal_Enabled), 5, 0), !bGXsfl_45_Refreshing);
   }

   public void rf14F2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(45) ;
      /* Execute user event: Refresh */
      e1614F2 ();
      nGXsfl_45_idx = (int)(1+GRID_nFirstRecordOnPage) ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_452( ) ;
      bGXsfl_45_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_fnc_recordsperpage( ) );
      if ( subGrid_Islastpage != 0 )
      {
         GRID_nFirstRecordOnPage = (long)(subgrid_fnc_recordcount( )-subgrid_fnc_recordsperpage( )) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      }
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
         subsflControlProps_452( ) ;
         e1714F2 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_45_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e1714F2 ();
         }
         wbEnd = (short)(45) ;
         wb14F0( ) ;
      }
      bGXsfl_45_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes14F2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV221Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV221Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFEC1", localUtil.dtoc( AV68Fec1, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFEC1", getSecureSignedToken( sPrefix, AV68Fec1));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRDNUMI", GXutil.rtrim( AV145Prdnumi));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPRDNUMI", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV145Prdnumi, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRDNUMF", GXutil.rtrim( AV143PrdNumf));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPRDNUMF", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV143PrdNumf, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFEC2", localUtil.dtoc( AV70Fec2, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFEC2", getSecureSignedToken( sPrefix, AV70Fec2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCONTVAL", GXutil.ltrim( localUtil.ntoc( AV54Contval, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCONTVAL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV54Contval), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRDNUMIN", GXutil.rtrim( AV7PrdnumIN));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPRDNUMIN", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV7PrdnumIN, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLOTE2", GXutil.rtrim( AV115Lote2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vLOTE2", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV115Lote2, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCANTC"+"_"+sGXsfl_45_idx, getSecureSignedToken( sPrefix+sGXsfl_45_idx, localUtil.format( AV43CantC, "ZZZZZZ9.999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCANTCM"+"_"+sGXsfl_45_idx, getSecureSignedToken( sPrefix+sGXsfl_45_idx, localUtil.format( AV44CantCm, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vQ", GXutil.ltrim( localUtil.ntoc( AV153q, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vQ", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV153q), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPRDNUM"+"_"+sGXsfl_45_idx, getSecureSignedToken( sPrefix+sGXsfl_45_idx, GXutil.rtrim( localUtil.format( AV19PrdNum, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vLOTE"+"_"+sGXsfl_45_idx, getSecureSignedToken( sPrefix+sGXsfl_45_idx, GXutil.rtrim( localUtil.format( AV114Lote, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPROPRV", GXutil.ltrim( localUtil.ntoc( AV148Proprv, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPROPRV", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV148Proprv), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRVNUM2", GXutil.ltrim( localUtil.ntoc( AV152PrvNum2, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPRVNUM2", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV152PrvNum2), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRDFABID", GXutil.ltrim( localUtil.ntoc( AV138PrdFabId, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPRDFABID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV138PrdFabId), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHRELOTE", GXutil.rtrim( AV83HreLote));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vHRELOTE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV83HreLote, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCANT", GXutil.ltrim( localUtil.ntoc( AV39Cant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCANT", getSecureSignedToken( sPrefix, localUtil.format( AV39Cant, "ZZZZZZ9.999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vZ", GXutil.ltrim( localUtil.ntoc( AV172z, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vZ", getSecureSignedToken( sPrefix, localUtil.format( AV172z, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPEDCOD", GXutil.ltrim( localUtil.ntoc( AV133pedcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPEDCOD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV133pedcod), "ZZZZZZZ9")));
   }

   public int subgrid_fnc_pagecount( )
   {
      return -1 ;
   }

   public int subgrid_fnc_recordcount( )
   {
      return (int)(((subGrid_Recordcount==0) ? GRID_nFirstRecordOnPage+1 : subGrid_Recordcount)) ;
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
      return (int)(((subGrid_Islastpage==1) ? subgrid_fnc_recordcount( )/ (double) (subgrid_fnc_recordsperpage( ))+((((int)((subgrid_fnc_recordcount( )) % (subgrid_fnc_recordsperpage( ))))==0) ? 0 : 1) : GXutil.Int( GRID_nFirstRecordOnPage/ (double) (subgrid_fnc_recordsperpage( )))+1)) ;
   }

   public short subgrid_firstpage( )
   {
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV28ManageFiltersExecutionStep, AV23ColumnsSelector, AV221Pgmname, AV209OrderedBy, AV210OrderedDsc, AV18FilterFullText, AV33EmprCod, AV5Fecha, AV6Fecha_to, AV206Prdnum1, AV207PrdNum2, AV9LoteBusqueda, AV10CalStkIni, AV68Fec1, A396EmprCod, A719PrdNum, A12453HreFecAct, AV145Prdnumi, AV143PrdNumf, AV70Fec2, A4558HrePrdNum, A4563HrePrdCant, A5726HreLote, A862CumConFec, AV54Contval, A860CumConCant, A5862CumConLot, A3348CCStkFec, A3345TipMovCc, A3357CCStkDsc, A3344CCStkCanS, A5722CCStkLot, A415EntFecEnt, A11Albaran, A418EntUniEnt, A5686EntLotN, AV7PrdnumIN, AV115Lote2, AV43CantC, AV44CantCm, AV153q, AV19PrdNum, AV114Lote, A11707HreProv, A12718HreFabId, AV148Proprv, A6156EntPrvNum, A12716EntFabId, A658PedCod, AV152PrvNum2, AV138PrdFabId, AV83HreLote, AV39Cant, AV172z, AV133pedcod, A795PrvNum, A12714PrdFabId, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      if ( GRID_nEOF == 1 )
      {
         GRID_nFirstRecordOnPage = GRID_nCurrentRecord ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV28ManageFiltersExecutionStep, AV23ColumnsSelector, AV221Pgmname, AV209OrderedBy, AV210OrderedDsc, AV18FilterFullText, AV33EmprCod, AV5Fecha, AV6Fecha_to, AV206Prdnum1, AV207PrdNum2, AV9LoteBusqueda, AV10CalStkIni, AV68Fec1, A396EmprCod, A719PrdNum, A12453HreFecAct, AV145Prdnumi, AV143PrdNumf, AV70Fec2, A4558HrePrdNum, A4563HrePrdCant, A5726HreLote, A862CumConFec, AV54Contval, A860CumConCant, A5862CumConLot, A3348CCStkFec, A3345TipMovCc, A3357CCStkDsc, A3344CCStkCanS, A5722CCStkLot, A415EntFecEnt, A11Albaran, A418EntUniEnt, A5686EntLotN, AV7PrdnumIN, AV115Lote2, AV43CantC, AV44CantCm, AV153q, AV19PrdNum, AV114Lote, A11707HreProv, A12718HreFabId, AV148Proprv, A6156EntPrvNum, A12716EntFabId, A658PedCod, AV152PrvNum2, AV138PrdFabId, AV83HreLote, AV39Cant, AV172z, AV133pedcod, A795PrvNum, A12714PrdFabId, sPrefix) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV28ManageFiltersExecutionStep, AV23ColumnsSelector, AV221Pgmname, AV209OrderedBy, AV210OrderedDsc, AV18FilterFullText, AV33EmprCod, AV5Fecha, AV6Fecha_to, AV206Prdnum1, AV207PrdNum2, AV9LoteBusqueda, AV10CalStkIni, AV68Fec1, A396EmprCod, A719PrdNum, A12453HreFecAct, AV145Prdnumi, AV143PrdNumf, AV70Fec2, A4558HrePrdNum, A4563HrePrdCant, A5726HreLote, A862CumConFec, AV54Contval, A860CumConCant, A5862CumConLot, A3348CCStkFec, A3345TipMovCc, A3357CCStkDsc, A3344CCStkCanS, A5722CCStkLot, A415EntFecEnt, A11Albaran, A418EntUniEnt, A5686EntLotN, AV7PrdnumIN, AV115Lote2, AV43CantC, AV44CantCm, AV153q, AV19PrdNum, AV114Lote, A11707HreProv, A12718HreFabId, AV148Proprv, A6156EntPrvNum, A12716EntFabId, A658PedCod, AV152PrvNum2, AV138PrdFabId, AV83HreLote, AV39Cant, AV172z, AV133pedcod, A795PrvNum, A12714PrdFabId, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      subGrid_Islastpage = 1 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV28ManageFiltersExecutionStep, AV23ColumnsSelector, AV221Pgmname, AV209OrderedBy, AV210OrderedDsc, AV18FilterFullText, AV33EmprCod, AV5Fecha, AV6Fecha_to, AV206Prdnum1, AV207PrdNum2, AV9LoteBusqueda, AV10CalStkIni, AV68Fec1, A396EmprCod, A719PrdNum, A12453HreFecAct, AV145Prdnumi, AV143PrdNumf, AV70Fec2, A4558HrePrdNum, A4563HrePrdCant, A5726HreLote, A862CumConFec, AV54Contval, A860CumConCant, A5862CumConLot, A3348CCStkFec, A3345TipMovCc, A3357CCStkDsc, A3344CCStkCanS, A5722CCStkLot, A415EntFecEnt, A11Albaran, A418EntUniEnt, A5686EntLotN, AV7PrdnumIN, AV115Lote2, AV43CantC, AV44CantCm, AV153q, AV19PrdNum, AV114Lote, A11707HreProv, A12718HreFabId, AV148Proprv, A6156EntPrvNum, A12716EntFabId, A658PedCod, AV152PrvNum2, AV138PrdFabId, AV83HreLote, AV39Cant, AV172z, AV133pedcod, A795PrvNum, A12714PrdFabId, sPrefix) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV28ManageFiltersExecutionStep, AV23ColumnsSelector, AV221Pgmname, AV209OrderedBy, AV210OrderedDsc, AV18FilterFullText, AV33EmprCod, AV5Fecha, AV6Fecha_to, AV206Prdnum1, AV207PrdNum2, AV9LoteBusqueda, AV10CalStkIni, AV68Fec1, A396EmprCod, A719PrdNum, A12453HreFecAct, AV145Prdnumi, AV143PrdNumf, AV70Fec2, A4558HrePrdNum, A4563HrePrdCant, A5726HreLote, A862CumConFec, AV54Contval, A860CumConCant, A5862CumConLot, A3348CCStkFec, A3345TipMovCc, A3357CCStkDsc, A3344CCStkCanS, A5722CCStkLot, A415EntFecEnt, A11Albaran, A418EntUniEnt, A5686EntLotN, AV7PrdnumIN, AV115Lote2, AV43CantC, AV44CantCm, AV153q, AV19PrdNum, AV114Lote, A11707HreProv, A12718HreFabId, AV148Proprv, A6156EntPrvNum, A12716EntFabId, A658PedCod, AV152PrvNum2, AV138PrdFabId, AV83HreLote, AV39Cant, AV172z, AV133pedcod, A795PrvNum, A12714PrdFabId, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV221Pgmname = "WCWUti118" ;
      Gx_err = (short)(0) ;
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavPrdnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrdnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdnum_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavPrdnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrdnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdnom_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavLote_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavLote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLote_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavPrdfabnm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrdfabnm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdfabnm_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavPrdnomgrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrdnomgrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdnomgrid_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavCantc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCantc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCantc_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavCantcm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCantcm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCantcm_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavStockinicial_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavStockinicial_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavStockinicial_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavStockfinal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavStockfinal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavStockfinal_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strup14F0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1514F2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV26ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV29DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV23ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_45 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_45"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV33EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV33EmprCod") ;
         wcpOAV5Fecha = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV5Fecha"), 0) ;
         wcpOAV6Fecha_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV6Fecha_to"), 0) ;
         wcpOAV206Prdnum1 = httpContext.cgiGet( sPrefix+"wcpOAV206Prdnum1") ;
         wcpOAV207PrdNum2 = httpContext.cgiGet( sPrefix+"wcpOAV207PrdNum2") ;
         wcpOAV9LoteBusqueda = httpContext.cgiGet( sPrefix+"wcpOAV9LoteBusqueda") ;
         wcpOAV10CalStkIni = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV10CalStkIni"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV70Fec2 = localUtil.ctod( httpContext.cgiGet( sPrefix+"vFEC2"), 0) ;
         AV68Fec1 = localUtil.ctod( httpContext.cgiGet( sPrefix+"vFEC1"), 0) ;
         AV33EmprCod = httpContext.cgiGet( sPrefix+"vEMPRCOD") ;
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
         Ddo_grid_Caption = httpContext.cgiGet( sPrefix+"DDO_GRID_Caption") ;
         Ddo_grid_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Includesortasc = httpContext.cgiGet( sPrefix+"DDO_GRID_Includesortasc") ;
         Ddo_grid_Fixable = httpContext.cgiGet( sPrefix+"DDO_GRID_Fixable") ;
         Ddo_grid_Sortedstatus = httpContext.cgiGet( sPrefix+"DDO_GRID_Sortedstatus") ;
         Ddo_gridcolumnsselector_Caption = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption") ;
         Ddo_gridcolumnsselector_Tooltip = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip") ;
         Ddo_gridcolumnsselector_Cls = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls") ;
         Ddo_gridcolumnsselector_Dropdownoptionstype = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype") ;
         Ddo_gridcolumnsselector_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname") ;
         Ddo_gridcolumnsselector_Titlecontrolidtoreplace = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Infinitescrolling = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Infinitescrolling") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Hascolumnsselector = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hascolumnsselector")) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_get") ;
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         Ddo_managefilters_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Activeeventkey") ;
         /* Read variables values. */
         AV18FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18FilterFullText", AV18FilterFullText);
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
      e1514F2 ();
      if (returnInSub) return;
   }

   public void e1514F2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXv_int1[0] = (byte)(AV212ConMan) ;
      new app.pexicon(remoteHandle, context).execute( AV33EmprCod, httpContext.getMessage( "CONMAN", ""), GXv_int1) ;
      wcwuti118_impl.this.AV212ConMan = GXv_int1[0] ;
      GXv_char2[0] = AV33EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "CONMAN", "") ;
      GXv_int4[0] = AV54Contval ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_int4) ;
      wcwuti118_impl.this.AV33EmprCod = GXv_char2[0] ;
      wcwuti118_impl.this.AV54Contval = GXv_int4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33EmprCod", AV33EmprCod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54Contval", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54Contval), 8, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCONTVAL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV54Contval), "ZZZZZZZ9")));
      GXv_char3[0] = AV33EmprCod ;
      GXv_char2[0] = httpContext.getMessage( "CONMAN", "") ;
      GXv_char5[0] = AV213contdsc ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_char5) ;
      wcwuti118_impl.this.AV33EmprCod = GXv_char3[0] ;
      wcwuti118_impl.this.AV213contdsc = GXv_char5[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33EmprCod", AV33EmprCod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV213contdsc", AV213contdsc);
      AV212ConMan = (short)(((0==AV212ConMan) ? 9 : AV212ConMan)) ;
      GXt_int6 = AV148Proprv ;
      GXv_int1[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV33EmprCod, httpContext.getMessage( "PROPRV", ""), GXv_int1) ;
      wcwuti118_impl.this.GXt_int6 = GXv_int1[0] ;
      AV148Proprv = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV148Proprv", GXutil.str( AV148Proprv, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPROPRV", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV148Proprv), "9")));
      GXt_int6 = (byte)(AV214Lotes) ;
      GXv_int1[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV33EmprCod, httpContext.getMessage( "01LOTE", ""), GXv_int1) ;
      wcwuti118_impl.this.GXt_int6 = GXv_int1[0] ;
      AV214Lotes = GXt_int6 ;
      AV68Fec1 = AV5Fecha ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68Fec1", localUtil.format(AV68Fec1, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFEC1", getSecureSignedToken( sPrefix, AV68Fec1));
      AV70Fec2 = AV6Fecha_to ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70Fec2", localUtil.format(AV70Fec2, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFEC2", getSecureSignedToken( sPrefix, AV70Fec2));
      AV145Prdnumi = AV206Prdnum1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV145Prdnumi", AV145Prdnumi);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPRDNUMI", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV145Prdnumi, ""))));
      AV143PrdNumf = AV207PrdNum2 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV143PrdNumf", AV143PrdNumf);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPRDNUMF", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV143PrdNumf, ""))));
      AV195Mes = (byte)(GXutil.month( AV68Fec1)) ;
      AV188Anyo = (short)(GXutil.year( AV68Fec1)) ;
      AV196MesAnt = (byte)(AV195Mes-1) ;
      AV189AnyoANt = (short)(((AV196MesAnt==0) ? AV188Anyo-1 : AV188Anyo)) ;
      AV196MesAnt = (byte)(((AV196MesAnt==0) ? 12 : AV196MesAnt)) ;
      AV190Dia = localUtil.dtoc( GXutil.dadd(AV68Fec1,-(1)), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
      AV191DiaActual = localUtil.dtoc( AV68Fec1, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
      AV192DiaFinMes = GXutil.dadd(AV68Fec1,-(1)) ;
      AV194DiaIniMesActual = localUtil.ctod( AV191DiaActual, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      AV193DiaFinMesActual = GXutil.eomdate( localUtil.ctod( AV191DiaActual, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
      edtavStockinicial_Title = httpContext.getMessage( "Stock Inicial ", "")+localUtil.dtoc( AV192DiaFinMes, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavStockinicial_Internalname, "Title", edtavStockinicial_Title, !bGXsfl_45_Refreshing);
      GXt_char7 = AV217Station ;
      GXv_char5[0] = GXt_char7 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char5) ;
      wcwuti118_impl.this.GXt_char7 = GXv_char5[0] ;
      AV217Station = GXt_char7 ;
      GXv_char5[0] = AV33EmprCod ;
      GXv_char3[0] = AV218Emprnom ;
      GXv_char2[0] = AV219Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV217Station, GXv_char5, GXv_char3, GXv_char2) ;
      wcwuti118_impl.this.AV33EmprCod = GXv_char5[0] ;
      wcwuti118_impl.this.AV218Emprnom = GXv_char3[0] ;
      wcwuti118_impl.this.AV219Usurcod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33EmprCod", AV33EmprCod);
      divCell_grid_dwc_Class = "Invisible WCD_"+GXutil.upper( subGrid_Internalname) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, divCell_grid_dwc_Internalname, "Class", divCell_grid_dwc_Class, true);
      subGrid_Rows = 50 ;
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
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      if ( AV209OrderedBy < 1 )
      {
         AV209OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV209OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV209OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = AV29DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9[0] ;
      AV29DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
   }

   public void e1614F2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext10[0] = AV12WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext10) ;
      AV12WWPContext = GXv_SdtWWPContext10[0] ;
      if ( AV28ManageFiltersExecutionStep == 1 )
      {
         AV28ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28ManageFiltersExecutionStep", GXutil.str( AV28ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV28ManageFiltersExecutionStep == 2 )
      {
         AV28ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28ManageFiltersExecutionStep", GXutil.str( AV28ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV25Session.getValue("WCWUti118ColumnsSelector"), "") != 0 )
      {
         AV21ColumnsSelectorXML = AV25Session.getValue("WCWUti118ColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV21ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S152 ();
         if (returnInSub) return;
      }
      edtavPrdnum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrdnum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdnum_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtavPrdnom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrdnom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdnom_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtavLote_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavLote_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLote_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtavPrdfabnm_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrdfabnm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdfabnm_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtavPrdnomgrid_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrdnomgrid_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdnomgrid_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtavCantc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCantc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCantc_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtavCantcm_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCantcm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCantcm_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtavStockinicial_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavStockinicial_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavStockinicial_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtavStockfinal_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavStockfinal_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavStockfinal_Visible), 5, 0), !bGXsfl_45_Refreshing);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ColumnsSelector", AV23ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV26ManageFiltersData", AV26ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV16GridState", AV16GridState);
   }

   public void e1214F2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV209OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV209OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV209OrderedBy), 4, 0));
         AV210OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV210OrderedDsc", AV210OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e1714F2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV208DetailWebComponent = "<i class=\"fas fa-angle-right ArrowIcon\"></i>" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDetailwebcomponent_Internalname, AV208DetailWebComponent);
      AV204ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(1) );
      AV204ProgressIndicator.showwithtitle(httpContext.getMessage( "Consumos Tinte, Acabados ......", ""));
      AV204ProgressIndicator.setgxTv_SdtProgress_Value( 10 );
      /* Execute user subroutine: 'CONSUMOS' */
      S162 ();
      if (returnInSub) return;
      AV203x = GXutil.sleep( 1) ;
      AV204ProgressIndicator.showwithtitle(httpContext.getMessage( "Consumos Manuales ......", ""));
      AV204ProgressIndicator.setgxTv_SdtProgress_Value( 20 );
      /* Execute user subroutine: 'CONSUMOS2' */
      S172 ();
      if (returnInSub) return;
      AV203x = GXutil.sleep( 1) ;
      AV204ProgressIndicator.showwithtitle(httpContext.getMessage( "Consumos Lavados Maquinas ......", ""));
      AV204ProgressIndicator.setgxTv_SdtProgress_Value( 30 );
      /* Execute user subroutine: 'CONSUMOS3' */
      S182 ();
      if (returnInSub) return;
      AV203x = GXutil.sleep( 1) ;
      AV204ProgressIndicator.showwithtitle(httpContext.getMessage( "Compras ......", ""));
      AV204ProgressIndicator.setgxTv_SdtProgress_Value( 40 );
      /* Execute user subroutine: 'COMPRAS' */
      S192 ();
      if (returnInSub) return;
      AV203x = GXutil.sleep( 1) ;
      AV204ProgressIndicator.showwithtitle(httpContext.getMessage( "Organizo consumos por LOTE ......", ""));
      AV204ProgressIndicator.setgxTv_SdtProgress_Value( 50 );
      AV172z = DecimalUtil.doubleToDec(1) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV172z", GXutil.ltrimstr( AV172z, 10, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vZ", getSecureSignedToken( sPrefix, localUtil.format( AV172z, "ZZZZZZ9.99")));
      AV153q = (short)(1) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV153q", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV153q), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vQ", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV153q), "ZZZ9")));
      GX_I = 1 ;
      while ( GX_I <= 10000 )
      {
         AV182Tab_prod[GX_I-1] = " " ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 10000 )
      {
         AV177Tab_lote[GX_I-1] = " " ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 10000 )
      {
         AV173Tab_cnt1[GX_I-1] = DecimalUtil.doubleToDec(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 10000 )
      {
         AV174Tab_cnt2[GX_I-1] = DecimalUtil.doubleToDec(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      while ( AV172z.doubleValue() <= 10000 )
      {
         if ( GXutil.strcmp(AV180Tab_prd[(int)(DecimalUtil.decToDouble(AV172z))-1], " ") == 0 )
         {
            if (true) break;
         }
         AV7PrdnumIN = AV180Tab_prd[(int)(DecimalUtil.decToDouble(AV172z))-1] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7PrdnumIN", AV7PrdnumIN);
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPRDNUMIN", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV7PrdnumIN, ""))));
         AV115Lote2 = AV179Tab_ltecn[(int)(DecimalUtil.decToDouble(AV172z))-1] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV115Lote2", AV115Lote2);
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vLOTE2", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV115Lote2, ""))));
         AV43CantC = AV176Tab_cntcn[(int)(DecimalUtil.decToDouble(AV172z))-1] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCantc_Internalname, GXutil.ltrimstr( AV43CantC, 11, 3));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCANTC"+"_"+sGXsfl_45_idx, getSecureSignedToken( sPrefix+sGXsfl_45_idx, localUtil.format( AV43CantC, "ZZZZZZ9.999")));
         AV44CantCm = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCantcm_Internalname, GXutil.ltrimstr( AV44CantCm, 11, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCANTCM"+"_"+sGXsfl_45_idx, getSecureSignedToken( sPrefix+sGXsfl_45_idx, localUtil.format( AV44CantCm, "ZZZZZZ9.99")));
         /* Execute user subroutine: 'CONTROLLOTE' */
         S202 ();
         if (returnInSub) return;
         AV172z = AV172z.add(DecimalUtil.doubleToDec(1)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV172z", GXutil.ltrimstr( AV172z, 10, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vZ", getSecureSignedToken( sPrefix, localUtil.format( AV172z, "ZZZZZZ9.99")));
      }
      AV203x = GXutil.sleep( 1) ;
      AV204ProgressIndicator.showwithtitle(httpContext.getMessage( "Organizo compras por LOTE ......", ""));
      AV204ProgressIndicator.setgxTv_SdtProgress_Value( 60 );
      AV172z = DecimalUtil.doubleToDec(1) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV172z", GXutil.ltrimstr( AV172z, 10, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vZ", getSecureSignedToken( sPrefix, localUtil.format( AV172z, "ZZZZZZ9.99")));
      while ( AV172z.doubleValue() <= 10000 )
      {
         if ( GXutil.strcmp(AV181tab_prdcm[(int)(DecimalUtil.decToDouble(AV172z))-1], " ") == 0 )
         {
            if (true) break;
         }
         AV7PrdnumIN = AV181tab_prdcm[(int)(DecimalUtil.decToDouble(AV172z))-1] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7PrdnumIN", AV7PrdnumIN);
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPRDNUMIN", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV7PrdnumIN, ""))));
         AV115Lote2 = AV178Tab_ltecm[(int)(DecimalUtil.decToDouble(AV172z))-1] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV115Lote2", AV115Lote2);
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vLOTE2", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV115Lote2, ""))));
         AV44CantCm = AV175Tab_cntcm[(int)(DecimalUtil.decToDouble(AV172z))-1] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCantcm_Internalname, GXutil.ltrimstr( AV44CantCm, 11, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCANTCM"+"_"+sGXsfl_45_idx, getSecureSignedToken( sPrefix+sGXsfl_45_idx, localUtil.format( AV44CantCm, "ZZZZZZ9.99")));
         AV43CantC = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCantc_Internalname, GXutil.ltrimstr( AV43CantC, 11, 3));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCANTC"+"_"+sGXsfl_45_idx, getSecureSignedToken( sPrefix+sGXsfl_45_idx, localUtil.format( AV43CantC, "ZZZZZZ9.999")));
         /* Execute user subroutine: 'CONTROLLOTE' */
         S202 ();
         if (returnInSub) return;
         AV172z = AV172z.add(DecimalUtil.doubleToDec(1)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV172z", GXutil.ltrimstr( AV172z, 10, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vZ", getSecureSignedToken( sPrefix, localUtil.format( AV172z, "ZZZZZZ9.99")));
      }
      AV203x = GXutil.sleep( 1) ;
      AV204ProgressIndicator.showwithtitle(httpContext.getMessage( "Procesando informacion ......", ""));
      AV204ProgressIndicator.setgxTv_SdtProgress_Value( 70 );
      AV43CantC = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCantc_Internalname, GXutil.ltrimstr( AV43CantC, 11, 3));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCANTC"+"_"+sGXsfl_45_idx, getSecureSignedToken( sPrefix+sGXsfl_45_idx, localUtil.format( AV43CantC, "ZZZZZZ9.999")));
      AV44CantCm = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCantcm_Internalname, GXutil.ltrimstr( AV44CantCm, 11, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCANTCM"+"_"+sGXsfl_45_idx, getSecureSignedToken( sPrefix+sGXsfl_45_idx, localUtil.format( AV44CantCm, "ZZZZZZ9.99")));
      AV65Entradas = DecimalUtil.doubleToDec(0) ;
      AV154salidas = DecimalUtil.doubleToDec(0) ;
      AV157StockInicial = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavStockinicial_Internalname, GXutil.ltrimstr( AV157StockInicial, 12, 4));
      AV114Lote = " " ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavLote_Internalname, AV114Lote);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vLOTE"+"_"+sGXsfl_45_idx, getSecureSignedToken( sPrefix+sGXsfl_45_idx, GXutil.rtrim( localUtil.format( AV114Lote, ""))));
      AV89i = (short)(1) ;
      while ( AV89i <= 10000 )
      {
         if ( GXutil.strcmp(AV182Tab_prod[AV89i-1], " ") == 0 )
         {
            if (true) break;
         }
         AV19PrdNum = AV182Tab_prod[AV89i-1] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPrdnum_Internalname, AV19PrdNum);
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPRDNUM"+"_"+sGXsfl_45_idx, getSecureSignedToken( sPrefix+sGXsfl_45_idx, GXutil.rtrim( localUtil.format( AV19PrdNum, ""))));
         GXt_char7 = AV20PrdNom ;
         GXv_char5[0] = AV33EmprCod ;
         GXv_char3[0] = AV19PrdNum ;
         GXv_char2[0] = GXt_char7 ;
         new app.pprddsc(remoteHandle, context).execute( GXv_char5, GXv_char3, GXv_char2) ;
         wcwuti118_impl.this.AV33EmprCod = GXv_char5[0] ;
         wcwuti118_impl.this.AV19PrdNum = GXv_char3[0] ;
         wcwuti118_impl.this.GXt_char7 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33EmprCod", AV33EmprCod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPrdnum_Internalname, AV19PrdNum);
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPRDNUM"+"_"+sGXsfl_45_idx, getSecureSignedToken( sPrefix+sGXsfl_45_idx, GXutil.rtrim( localUtil.format( AV19PrdNum, ""))));
         AV20PrdNom = GXt_char7 ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPrdnom_Internalname, AV20PrdNom);
         AV43CantC = AV173Tab_cnt1[AV89i-1].divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCantc_Internalname, GXutil.ltrimstr( AV43CantC, 11, 3));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCANTC"+"_"+sGXsfl_45_idx, getSecureSignedToken( sPrefix+sGXsfl_45_idx, localUtil.format( AV43CantC, "ZZZZZZ9.999")));
         AV44CantCm = AV174Tab_cnt2[AV89i-1] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCantcm_Internalname, GXutil.ltrimstr( AV44CantCm, 11, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCANTCM"+"_"+sGXsfl_45_idx, getSecureSignedToken( sPrefix+sGXsfl_45_idx, localUtil.format( AV44CantCm, "ZZZZZZ9.99")));
         AV114Lote = AV177Tab_lote[AV89i-1] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavLote_Internalname, AV114Lote);
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vLOTE"+"_"+sGXsfl_45_idx, getSecureSignedToken( sPrefix+sGXsfl_45_idx, GXutil.rtrim( localUtil.format( AV114Lote, ""))));
         AV139PrdFabNm = "" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPrdfabnm_Internalname, AV139PrdFabNm);
         AV141PrdNomgrid = "" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPrdnomgrid_Internalname, AV141PrdNomgrid);
         if ( AV43CantC.doubleValue() > 0 )
         {
            /* Execute user subroutine: 'MASDATOS1' */
            S212 ();
            if (returnInSub) return;
         }
         else
         {
            if ( AV44CantCm.doubleValue() > 0 )
            {
               /* Execute user subroutine: 'MASDATOS2' */
               S222 ();
               if (returnInSub) return;
            }
         }
         if ( GXutil.like( AV114Lote , GXutil.padr( AV9LoteBusqueda , 26 , "%"),  ' ' ) || ( GXutil.strcmp(AV9LoteBusqueda, " ") == 0 ) )
         {
            if ( AV10CalStkIni == 1 )
            {
               GXv_char5[0] = AV33EmprCod ;
               GXv_date11[0] = AV68Fec1 ;
               GXv_char3[0] = AV19PrdNum ;
               GXv_char2[0] = AV114Lote ;
               GXv_decimal12[0] = AV157StockInicial ;
               new app.pprc125(remoteHandle, context).execute( GXv_char5, GXv_date11, GXv_char3, GXv_char2, GXv_decimal12) ;
               wcwuti118_impl.this.AV33EmprCod = GXv_char5[0] ;
               wcwuti118_impl.this.AV68Fec1 = GXv_date11[0] ;
               wcwuti118_impl.this.AV19PrdNum = GXv_char3[0] ;
               wcwuti118_impl.this.AV114Lote = GXv_char2[0] ;
               wcwuti118_impl.this.AV157StockInicial = GXv_decimal12[0] ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33EmprCod", AV33EmprCod);
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68Fec1", localUtil.format(AV68Fec1, "99/99/99"));
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFEC1", getSecureSignedToken( sPrefix, AV68Fec1));
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPrdnum_Internalname, AV19PrdNum);
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPRDNUM"+"_"+sGXsfl_45_idx, getSecureSignedToken( sPrefix+sGXsfl_45_idx, GXutil.rtrim( localUtil.format( AV19PrdNum, ""))));
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavLote_Internalname, AV114Lote);
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vLOTE"+"_"+sGXsfl_45_idx, getSecureSignedToken( sPrefix+sGXsfl_45_idx, GXutil.rtrim( localUtil.format( AV114Lote, ""))));
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavStockinicial_Internalname, GXutil.ltrimstr( AV157StockInicial, 12, 4));
               Gx_msg = httpContext.getMessage( "Return Calculo Stock Inicial.PUTi103.. ", "") + AV19PrdNum ;
               System.out.println( Gx_msg );
            }
            if ( ( AV43CantC.doubleValue() > 0 ) || ( AV44CantCm.doubleValue() > 0 ) )
            {
               AV156Stockfinal = AV44CantCm.add(AV157StockInicial).subtract(AV43CantC) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavStockfinal_Internalname, GXutil.ltrimstr( AV156Stockfinal, 12, 4));
               AV204ProgressIndicator.showwithtitle(httpContext.getMessage( "Procesando informacion ......", ""));
               AV204ProgressIndicator.setgxTv_SdtProgress_Description( GXutil.trim( AV19PrdNum)+"_"+GXutil.trim( AV20PrdNom) );
               /* Load Method */
               if ( wbStart != -1 )
               {
                  wbStart = (short)(45) ;
               }
               if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
               {
                  sendrow_452( ) ;
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
               if ( isFullAjaxMode( ) && ! bGXsfl_45_Refreshing )
               {
                  httpContext.doAjaxLoad(45, GridRow);
               }
            }
         }
         AV43CantC = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCantc_Internalname, GXutil.ltrimstr( AV43CantC, 11, 3));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCANTC"+"_"+sGXsfl_45_idx, getSecureSignedToken( sPrefix+sGXsfl_45_idx, localUtil.format( AV43CantC, "ZZZZZZ9.999")));
         AV44CantCm = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCantcm_Internalname, GXutil.ltrimstr( AV44CantCm, 11, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCANTCM"+"_"+sGXsfl_45_idx, getSecureSignedToken( sPrefix+sGXsfl_45_idx, localUtil.format( AV44CantCm, "ZZZZZZ9.99")));
         AV89i = (short)(AV89i+1) ;
      }
      AV203x = GXutil.sleep( 1) ;
      AV204ProgressIndicator.showwithtitle(httpContext.getMessage( "Proceso Finalizado.....", ""));
      AV204ProgressIndicator.setgxTv_SdtProgress_Value( 100 );
      AV203x = GXutil.sleep( 2) ;
      AV204ProgressIndicator.hide();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV204ProgressIndicator", AV204ProgressIndicator);
   }

   public void e1314F2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV21ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV23ColumnsSelector.fromJSonString(AV21ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "WCWUti118ColumnsSelector", ((GXutil.strcmp("", AV21ColumnsSelectorXML)==0) ? "" : AV23ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ColumnsSelector", AV23ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV26ManageFiltersData", AV26ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV16GridState", AV16GridState);
   }

   public void e1114F2( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S232 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S142 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("WCWUti118Filters")),GXutil.URLEncode(GXutil.rtrim(AV221Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV28ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28ManageFiltersExecutionStep", GXutil.str( AV28ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("WCWUti118Filters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV28ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28ManageFiltersExecutionStep", GXutil.str( AV28ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char7 = AV27ManageFiltersXml ;
         GXv_char5[0] = GXt_char7 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "WCWUti118Filters", Ddo_managefilters_Activeeventkey, GXv_char5) ;
         wcwuti118_impl.this.GXt_char7 = GXv_char5[0] ;
         AV27ManageFiltersXml = GXt_char7 ;
         if ( (GXutil.strcmp("", AV27ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S232 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV221Pgmname+"GridState", AV27ManageFiltersXml) ;
            AV16GridState.fromxml(AV27ManageFiltersXml, null, null);
            AV209OrderedBy = AV16GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV209OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV209OrderedBy), 4, 0));
            AV210OrderedDsc = AV16GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV210OrderedDsc", AV210OrderedDsc);
            /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
            S132 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S242 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV16GridState", AV16GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ColumnsSelector", AV23ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV26ManageFiltersData", AV26ManageFiltersData);
   }

   public void e1414F2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.wcwuti118exportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   public void S132( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV209OrderedBy, 4, 0))+":"+(AV210OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S152( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV23ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector13[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "&PrdNum", "", "Codigo Producto", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "&PrdNom", "", "Descripcion Producto", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "&Lote", "", "Lote", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "&PrdFabNm", "", "Fabricante", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "&PrdNomgrid", "", "Distribuidor", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "&CantC", "", "Consumos", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "&CantCm", "", "Compras", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "&StockInicial", "", "Stock Inicial", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "&Stockfinal", "", "Stock Final", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXt_char7 = AV22UserCustomValue ;
      GXv_char5[0] = GXt_char7 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WCWUti118ColumnsSelector", GXv_char5) ;
      wcwuti118_impl.this.GXt_char7 = GXv_char5[0] ;
      AV22UserCustomValue = GXt_char7 ;
      if ( ! ( (GXutil.strcmp("", AV22UserCustomValue)==0) ) )
      {
         AV24ColumnsSelectorAux.fromxml(AV22UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector13[0] = AV24ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, GXv_SdtWWPColumnsSelector14) ;
         AV24ColumnsSelectorAux = GXv_SdtWWPColumnsSelector13[0] ;
         AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item15 = AV26ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item16[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item15 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "WCWUti118Filters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item16) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item15 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item16[0] ;
      AV26ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item15 ;
   }

   public void S232( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV18FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18FilterFullText", AV18FilterFullText);
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV25Session.getValue(AV221Pgmname+"GridState"), "") == 0 )
      {
         AV16GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV221Pgmname+"GridState"), null, null);
      }
      else
      {
         AV16GridState.fromxml(AV25Session.getValue(AV221Pgmname+"GridState"), null, null);
      }
      AV209OrderedBy = AV16GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV209OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV209OrderedBy), 4, 0));
      AV210OrderedDsc = AV16GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV210OrderedDsc", AV210OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S132 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S242 ();
      if (returnInSub) return;
   }

   public void S242( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV222GXV1 = 1 ;
      while ( AV222GXV1 <= AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV222GXV1));
         if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18FilterFullText", AV18FilterFullText);
         }
         AV222GXV1 = (int)(AV222GXV1+1) ;
      }
   }

   public void S142( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV16GridState.fromxml(AV25Session.getValue(AV221Pgmname+"GridState"), null, null);
      AV16GridState.setgxTv_SdtWWPGridState_Orderedby( AV209OrderedBy );
      AV16GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV210OrderedDsc );
      AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState17[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState17, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV18FilterFullText)==0), (short)(0), AV18FilterFullText, "") ;
      AV16GridState = GXv_SdtWWPGridState17[0] ;
      if ( ! (GXutil.strcmp("", AV33EmprCod)==0) )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV33EmprCod );
         AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV17GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV5Fecha)) )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FECHA" );
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV5Fecha, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV17GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV6Fecha_to)) )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FECHA_TO" );
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV6Fecha_to, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV17GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV206Prdnum1)==0) )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PRDNUM1" );
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV206Prdnum1 );
         AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV17GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV207PrdNum2)==0) )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PRDNUM2" );
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV207PrdNum2 );
         AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV17GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV9LoteBusqueda)==0) )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&LOTEBUSQUEDA" );
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV9LoteBusqueda );
         AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV17GridStateFilterValue, 0);
      }
      if ( ! (0==AV10CalStkIni) )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CALSTKINI" );
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV10CalStkIni, 1, 0) );
         AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV17GridStateFilterValue, 0);
      }
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV221Pgmname+"GridState", AV16GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S162( )
   {
      /* 'CONSUMOS' Routine */
      returnInSub = false ;
      AV39Cant = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39Cant", GXutil.ltrimstr( AV39Cant, 11, 3));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCANT", getSecureSignedToken( sPrefix, localUtil.format( AV39Cant, "ZZZZZZ9.999")));
      AV89i = (short)(1) ;
      AV153q = (short)(1) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV153q", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV153q), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vQ", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV153q), "ZZZ9")));
      GX_I = 1 ;
      while ( GX_I <= 10000 )
      {
         AV176Tab_cntcn[GX_I-1] = DecimalUtil.doubleToDec(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 10000 )
      {
         AV179Tab_ltecn[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 10000 )
      {
         AV180Tab_prd[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      /* Using cursor H014F2 */
      pr_default.execute(0, new Object[] {AV33EmprCod, AV145Prdnumi, AV68Fec1, AV70Fec2, AV143PrdNumf});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = H014F2_A396EmprCod[0] ;
         A12453HreFecAct = H014F2_A12453HreFecAct[0] ;
         n12453HreFecAct = H014F2_n12453HreFecAct[0] ;
         A719PrdNum = H014F2_A719PrdNum[0] ;
         n719PrdNum = H014F2_n719PrdNum[0] ;
         A4558HrePrdNum = H014F2_A4558HrePrdNum[0] ;
         n4558HrePrdNum = H014F2_n4558HrePrdNum[0] ;
         A4563HrePrdCant = H014F2_A4563HrePrdCant[0] ;
         n4563HrePrdCant = H014F2_n4563HrePrdCant[0] ;
         A5726HreLote = H014F2_A5726HreLote[0] ;
         n5726HreLote = H014F2_n5726HreLote[0] ;
         AV7PrdnumIN = A4558HrePrdNum ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7PrdnumIN", AV7PrdnumIN);
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPRDNUMIN", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV7PrdnumIN, ""))));
         AV39Cant = A4563HrePrdCant ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39Cant", GXutil.ltrimstr( AV39Cant, 11, 3));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCANT", getSecureSignedToken( sPrefix, localUtil.format( AV39Cant, "ZZZZZZ9.999")));
         AV83HreLote = ((GXutil.strcmp(A5726HreLote, " ")!=0) ? A5726HreLote : "S/N") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83HreLote", AV83HreLote);
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vHRELOTE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV83HreLote, ""))));
         /* Execute user subroutine: 'CONTROLLOTECN' */
         S253 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S172( )
   {
      /* 'CONSUMOS2' Routine */
      returnInSub = false ;
      /* Using cursor H014F3 */
      pr_default.execute(1, new Object[] {AV33EmprCod, AV145Prdnumi, AV68Fec1, AV70Fec2, AV143PrdNumf});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A859CumCodCont = H014F3_A859CumCodCont[0] ;
         A396EmprCod = H014F3_A396EmprCod[0] ;
         A862CumConFec = H014F3_A862CumConFec[0] ;
         A719PrdNum = H014F3_A719PrdNum[0] ;
         n719PrdNum = H014F3_n719PrdNum[0] ;
         A860CumConCant = H014F3_A860CumConCant[0] ;
         A5862CumConLot = H014F3_A5862CumConLot[0] ;
         A862CumConFec = H014F3_A862CumConFec[0] ;
         AV7PrdnumIN = A719PrdNum ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7PrdnumIN", AV7PrdnumIN);
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPRDNUMIN", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV7PrdnumIN, ""))));
         AV39Cant = ((AV54Contval==1) ? A860CumConCant.multiply(DecimalUtil.doubleToDec(1000)) : A860CumConCant) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39Cant", GXutil.ltrimstr( AV39Cant, 11, 3));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCANT", getSecureSignedToken( sPrefix, localUtil.format( AV39Cant, "ZZZZZZ9.999")));
         AV83HreLote = ((GXutil.strcmp(A5862CumConLot, " ")!=0) ? A5862CumConLot : "S/N") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83HreLote", AV83HreLote);
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vHRELOTE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV83HreLote, ""))));
         /* Execute user subroutine: 'CONTROLLOTECN' */
         S253 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            pr_default.close(1);
            returnInSub = true;
            if (true) return;
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void S182( )
   {
      /* 'CONSUMOS3' Routine */
      returnInSub = false ;
      /* Using cursor H014F4 */
      pr_default.execute(2, new Object[] {AV33EmprCod, AV145Prdnumi, AV68Fec1, AV70Fec2, AV143PrdNumf});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A396EmprCod = H014F4_A396EmprCod[0] ;
         A3345TipMovCc = H014F4_A3345TipMovCc[0] ;
         A3357CCStkDsc = H014F4_A3357CCStkDsc[0] ;
         A3348CCStkFec = H014F4_A3348CCStkFec[0] ;
         A719PrdNum = H014F4_A719PrdNum[0] ;
         n719PrdNum = H014F4_n719PrdNum[0] ;
         A3344CCStkCanS = H014F4_A3344CCStkCanS[0] ;
         A5722CCStkLot = H014F4_A5722CCStkLot[0] ;
         AV7PrdnumIN = A719PrdNum ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7PrdnumIN", AV7PrdnumIN);
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPRDNUMIN", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV7PrdnumIN, ""))));
         AV39Cant = A3344CCStkCanS.multiply(DecimalUtil.doubleToDec(1000)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39Cant", GXutil.ltrimstr( AV39Cant, 11, 3));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCANT", getSecureSignedToken( sPrefix, localUtil.format( AV39Cant, "ZZZZZZ9.999")));
         AV83HreLote = ((GXutil.strcmp(A5722CCStkLot, " ")!=0) ? A5722CCStkLot : "S/N") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83HreLote", AV83HreLote);
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vHRELOTE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV83HreLote, ""))));
         /* Execute user subroutine: 'CONTROLLOTECN' */
         S253 ();
         if ( returnInSub )
         {
            pr_default.close(2);
            returnInSub = true;
            if (true) return;
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void S253( )
   {
      /* 'CONTROLLOTECN' Routine */
      returnInSub = false ;
      AV89i = (short)(1) ;
      AV75FlagLote = (byte)(0) ;
      while ( AV89i <= 10000 )
      {
         if ( GXutil.strcmp(AV180Tab_prd[AV89i-1], " ") == 0 )
         {
            if (true) break;
         }
         if ( GXutil.strcmp(AV180Tab_prd[AV89i-1], AV7PrdnumIN) == 0 )
         {
            if ( GXutil.strcmp(AV179Tab_ltecn[AV89i-1], AV83HreLote) == 0 )
            {
               AV176Tab_cntcn[AV89i-1] = AV176Tab_cntcn[AV89i-1].add(AV39Cant) ;
               AV75FlagLote = (byte)(1) ;
               if (true) break;
            }
         }
         AV89i = (short)(AV89i+1) ;
      }
      if ( AV75FlagLote == 0 )
      {
         AV180Tab_prd[AV153q-1] = AV7PrdnumIN ;
         AV176Tab_cntcn[AV153q-1] = AV39Cant ;
         AV179Tab_ltecn[AV153q-1] = AV83HreLote ;
         AV153q = (short)(AV153q+1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV153q", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV153q), 4, 0));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vQ", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV153q), "ZZZ9")));
      }
   }

   public void S192( )
   {
      /* 'COMPRAS' Routine */
      returnInSub = false ;
      AV44CantCm = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCantcm_Internalname, GXutil.ltrimstr( AV44CantCm, 11, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCANTCM"+"_"+sGXsfl_45_idx, getSecureSignedToken( sPrefix+sGXsfl_45_idx, localUtil.format( AV44CantCm, "ZZZZZZ9.99")));
      AV89i = (short)(1) ;
      AV172z = DecimalUtil.doubleToDec(1) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV172z", GXutil.ltrimstr( AV172z, 10, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vZ", getSecureSignedToken( sPrefix, localUtil.format( AV172z, "ZZZZZZ9.99")));
      GX_I = 1 ;
      while ( GX_I <= 10000 )
      {
         AV175Tab_cntcm[GX_I-1] = DecimalUtil.doubleToDec(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 10000 )
      {
         AV178Tab_ltecm[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 10000 )
      {
         AV181tab_prdcm[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      /* Using cursor H014F5 */
      pr_default.execute(3, new Object[] {AV33EmprCod, AV145Prdnumi, AV68Fec1, AV70Fec2, AV143PrdNumf});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A11Albaran = H014F5_A11Albaran[0] ;
         A415EntFecEnt = H014F5_A415EntFecEnt[0] ;
         A719PrdNum = H014F5_A719PrdNum[0] ;
         n719PrdNum = H014F5_n719PrdNum[0] ;
         A396EmprCod = H014F5_A396EmprCod[0] ;
         A418EntUniEnt = H014F5_A418EntUniEnt[0] ;
         A5686EntLotN = H014F5_A5686EntLotN[0] ;
         AV7PrdnumIN = A719PrdNum ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7PrdnumIN", AV7PrdnumIN);
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPRDNUMIN", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV7PrdnumIN, ""))));
         AV39Cant = A418EntUniEnt ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39Cant", GXutil.ltrimstr( AV39Cant, 11, 3));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCANT", getSecureSignedToken( sPrefix, localUtil.format( AV39Cant, "ZZZZZZ9.999")));
         AV83HreLote = ((GXutil.strcmp(A5686EntLotN, " ")!=0) ? A5686EntLotN : "S/N") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83HreLote", AV83HreLote);
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vHRELOTE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV83HreLote, ""))));
         /* Execute user subroutine: 'CONTROLLOTECM' */
         S266 ();
         if ( returnInSub )
         {
            pr_default.close(3);
            returnInSub = true;
            if (true) return;
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void S266( )
   {
      /* 'CONTROLLOTECM' Routine */
      returnInSub = false ;
      AV89i = (short)(1) ;
      AV75FlagLote = (byte)(0) ;
      while ( AV89i <= 10000 )
      {
         if ( GXutil.strcmp(AV181tab_prdcm[AV89i-1], " ") == 0 )
         {
            if (true) break;
         }
         if ( GXutil.strcmp(AV181tab_prdcm[AV89i-1], AV7PrdnumIN) == 0 )
         {
            if ( GXutil.strcmp(AV178Tab_ltecm[AV89i-1], AV83HreLote) == 0 )
            {
               AV175Tab_cntcm[AV89i-1] = AV175Tab_cntcm[AV89i-1].add(AV39Cant) ;
               AV75FlagLote = (byte)(1) ;
               if (true) break;
            }
         }
         AV89i = (short)(AV89i+1) ;
      }
      if ( AV75FlagLote == 0 )
      {
         AV181tab_prdcm[(int)(DecimalUtil.decToDouble(AV172z))-1] = AV7PrdnumIN ;
         AV175Tab_cntcm[(int)(DecimalUtil.decToDouble(AV172z))-1] = AV39Cant ;
         AV178Tab_ltecm[(int)(DecimalUtil.decToDouble(AV172z))-1] = AV83HreLote ;
         AV172z = AV172z.add(DecimalUtil.doubleToDec(1)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV172z", GXutil.ltrimstr( AV172z, 10, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vZ", getSecureSignedToken( sPrefix, localUtil.format( AV172z, "ZZZZZZ9.99")));
      }
   }

   public void S202( )
   {
      /* 'CONTROLLOTE' Routine */
      returnInSub = false ;
      AV89i = (short)(1) ;
      AV75FlagLote = (byte)(0) ;
      while ( AV89i <= 10000 )
      {
         if ( GXutil.strcmp(AV182Tab_prod[AV89i-1], " ") == 0 )
         {
            if (true) break;
         }
         if ( GXutil.strcmp(AV182Tab_prod[AV89i-1], AV7PrdnumIN) == 0 )
         {
            if ( GXutil.strcmp(AV177Tab_lote[AV89i-1], AV115Lote2) == 0 )
            {
               AV173Tab_cnt1[AV89i-1] = AV173Tab_cnt1[AV89i-1].add(AV43CantC) ;
               AV174Tab_cnt2[AV89i-1] = AV174Tab_cnt2[AV89i-1].add(AV44CantCm) ;
               AV75FlagLote = (byte)(1) ;
               if (true) break;
            }
         }
         AV89i = (short)(AV89i+1) ;
      }
      if ( AV75FlagLote == 0 )
      {
         AV182Tab_prod[AV153q-1] = AV7PrdnumIN ;
         AV177Tab_lote[AV153q-1] = AV115Lote2 ;
         AV173Tab_cnt1[AV153q-1] = AV43CantC ;
         AV174Tab_cnt2[AV153q-1] = AV44CantCm ;
         AV153q = (short)(AV153q+1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV153q", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV153q), 4, 0));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vQ", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV153q), "ZZZ9")));
      }
   }

   public void S212( )
   {
      /* 'MASDATOS1' Routine */
      returnInSub = false ;
      /* Using cursor H014F6 */
      pr_default.execute(4, new Object[] {AV33EmprCod, AV19PrdNum, AV114Lote, AV68Fec1, AV70Fec2});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A396EmprCod = H014F6_A396EmprCod[0] ;
         A719PrdNum = H014F6_A719PrdNum[0] ;
         n719PrdNum = H014F6_n719PrdNum[0] ;
         A5726HreLote = H014F6_A5726HreLote[0] ;
         n5726HreLote = H014F6_n5726HreLote[0] ;
         A12453HreFecAct = H014F6_A12453HreFecAct[0] ;
         n12453HreFecAct = H014F6_n12453HreFecAct[0] ;
         A11707HreProv = H014F6_A11707HreProv[0] ;
         n11707HreProv = H014F6_n11707HreProv[0] ;
         A12718HreFabId = H014F6_A12718HreFabId[0] ;
         n12718HreFabId = H014F6_n12718HreFabId[0] ;
         GXt_char7 = AV141PrdNomgrid ;
         GXv_char5[0] = A396EmprCod ;
         GXv_int4[0] = A11707HreProv ;
         GXv_char3[0] = GXt_char7 ;
         new app.pprvnom(remoteHandle, context).execute( GXv_char5, GXv_int4, GXv_char3) ;
         wcwuti118_impl.this.A396EmprCod = GXv_char5[0] ;
         wcwuti118_impl.this.A11707HreProv = GXv_int4[0] ;
         wcwuti118_impl.this.GXt_char7 = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11707HreProv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11707HreProv), 6, 0));
         AV141PrdNomgrid = GXt_char7 ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPrdnomgrid_Internalname, AV141PrdNomgrid);
         AV141PrdNomgrid = ((GXutil.strcmp(AV141PrdNomgrid, "Error")==0)&&(A11707HreProv==0) ? "" : AV141PrdNomgrid) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPrdnomgrid_Internalname, AV141PrdNomgrid);
         GXt_char7 = AV139PrdFabNm ;
         GXv_char5[0] = A396EmprCod ;
         GXv_int4[0] = A12718HreFabId ;
         GXv_char3[0] = GXt_char7 ;
         new app.pprdfabnom(remoteHandle, context).execute( GXv_char5, GXv_int4, GXv_char3) ;
         wcwuti118_impl.this.A396EmprCod = GXv_char5[0] ;
         wcwuti118_impl.this.A12718HreFabId = GXv_int4[0] ;
         wcwuti118_impl.this.GXt_char7 = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12718HreFabId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12718HreFabId), 6, 0));
         AV139PrdFabNm = GXt_char7 ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPrdfabnm_Internalname, AV139PrdFabNm);
         AV139PrdFabNm = ((GXutil.strcmp(AV139PrdFabNm, "Error")==0)&&(A12718HreFabId==0) ? "" : AV139PrdFabNm) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPrdfabnm_Internalname, AV139PrdFabNm);
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   public void S222( )
   {
      /* 'MASDATOS2' Routine */
      returnInSub = false ;
      /* Using cursor H014F7 */
      pr_default.execute(5, new Object[] {AV33EmprCod, AV19PrdNum, AV114Lote, AV68Fec1, AV70Fec2});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A396EmprCod = H014F7_A396EmprCod[0] ;
         A719PrdNum = H014F7_A719PrdNum[0] ;
         n719PrdNum = H014F7_n719PrdNum[0] ;
         A5686EntLotN = H014F7_A5686EntLotN[0] ;
         A415EntFecEnt = H014F7_A415EntFecEnt[0] ;
         A6156EntPrvNum = H014F7_A6156EntPrvNum[0] ;
         n6156EntPrvNum = H014F7_n6156EntPrvNum[0] ;
         A12716EntFabId = H014F7_A12716EntFabId[0] ;
         A658PedCod = H014F7_A658PedCod[0] ;
         n658PedCod = H014F7_n658PedCod[0] ;
         if ( AV148Proprv == 1 )
         {
            AV152PrvNum2 = A6156EntPrvNum ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV152PrvNum2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV152PrvNum2), 6, 0));
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPRVNUM2", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV152PrvNum2), "ZZZZZ9")));
            AV138PrdFabId = A12716EntFabId ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV138PrdFabId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV138PrdFabId), 6, 0));
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPRDFABID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV138PrdFabId), "ZZZZZ9")));
         }
         else if ( AV148Proprv == 0 )
         {
            AV133pedcod = A658PedCod ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV133pedcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV133pedcod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPEDCOD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV133pedcod), "ZZZZZZZ9")));
            /* Execute user subroutine: 'CPEDID' */
            S278 ();
            if ( returnInSub )
            {
               pr_default.close(5);
               returnInSub = true;
               if (true) return;
            }
         }
         GXt_char7 = AV141PrdNomgrid ;
         GXv_char5[0] = A396EmprCod ;
         GXv_int4[0] = AV152PrvNum2 ;
         GXv_char3[0] = GXt_char7 ;
         new app.pprvnom(remoteHandle, context).execute( GXv_char5, GXv_int4, GXv_char3) ;
         wcwuti118_impl.this.A396EmprCod = GXv_char5[0] ;
         wcwuti118_impl.this.AV152PrvNum2 = GXv_int4[0] ;
         wcwuti118_impl.this.GXt_char7 = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV152PrvNum2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV152PrvNum2), 6, 0));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPRVNUM2", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV152PrvNum2), "ZZZZZ9")));
         AV141PrdNomgrid = GXt_char7 ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPrdnomgrid_Internalname, AV141PrdNomgrid);
         AV141PrdNomgrid = ((GXutil.strcmp(AV141PrdNomgrid, "Error")==0)&&(AV152PrvNum2==0) ? "" : AV141PrdNomgrid) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPrdnomgrid_Internalname, AV141PrdNomgrid);
         GXt_char7 = AV139PrdFabNm ;
         GXv_char5[0] = A396EmprCod ;
         GXv_int4[0] = AV138PrdFabId ;
         GXv_char3[0] = GXt_char7 ;
         new app.pprdfabnom(remoteHandle, context).execute( GXv_char5, GXv_int4, GXv_char3) ;
         wcwuti118_impl.this.A396EmprCod = GXv_char5[0] ;
         wcwuti118_impl.this.AV138PrdFabId = GXv_int4[0] ;
         wcwuti118_impl.this.GXt_char7 = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV138PrdFabId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV138PrdFabId), 6, 0));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPRDFABID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV138PrdFabId), "ZZZZZ9")));
         AV139PrdFabNm = GXt_char7 ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPrdfabnm_Internalname, AV139PrdFabNm);
         AV139PrdFabNm = ((GXutil.strcmp(AV139PrdFabNm, "Error")==0)&&(AV138PrdFabId==0) ? "" : AV139PrdFabNm) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPrdfabnm_Internalname, AV139PrdFabNm);
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(5);
      }
      pr_default.close(5);
   }

   public void S278( )
   {
      /* 'CPEDID' Routine */
      returnInSub = false ;
      AV152PrvNum2 = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV152PrvNum2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV152PrvNum2), 6, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPRVNUM2", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV152PrvNum2), "ZZZZZ9")));
      AV138PrdFabId = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV138PrdFabId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV138PrdFabId), 6, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPRDFABID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV138PrdFabId), "ZZZZZ9")));
      /* Using cursor H014F8 */
      pr_default.execute(6, new Object[] {AV33EmprCod, Integer.valueOf(AV133pedcod)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A719PrdNum = H014F8_A719PrdNum[0] ;
         n719PrdNum = H014F8_n719PrdNum[0] ;
         A658PedCod = H014F8_A658PedCod[0] ;
         n658PedCod = H014F8_n658PedCod[0] ;
         A396EmprCod = H014F8_A396EmprCod[0] ;
         A795PrvNum = H014F8_A795PrvNum[0] ;
         A12714PrdFabId = H014F8_A12714PrdFabId[0] ;
         n12714PrdFabId = H014F8_n12714PrdFabId[0] ;
         A795PrvNum = H014F8_A795PrvNum[0] ;
         A12714PrdFabId = H014F8_A12714PrdFabId[0] ;
         n12714PrdFabId = H014F8_n12714PrdFabId[0] ;
         AV152PrvNum2 = A795PrvNum ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV152PrvNum2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV152PrvNum2), 6, 0));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPRVNUM2", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV152PrvNum2), "ZZZZZ9")));
         AV138PrdFabId = A12714PrdFabId ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV138PrdFabId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV138PrdFabId), 6, 0));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPRDFABID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV138PrdFabId), "ZZZZZ9")));
         pr_default.readNext(6);
      }
      pr_default.close(6);
   }

   public void wb_table1_27_14F2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV26ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_32_14F2( true) ;
      }
      else
      {
         wb_table2_32_14F2( false) ;
      }
      return  ;
   }

   public void wb_table2_32_14F2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_27_14F2e( true) ;
      }
      else
      {
         wb_table1_27_14F2e( false) ;
      }
   }

   public void wb_table2_32_14F2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'" + sPrefix + "',false,'" + sGXsfl_45_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV18FilterFullText, GXutil.rtrim( localUtil.format( AV18FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_WCWUti118.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_32_14F2e( true) ;
      }
      else
      {
         wb_table2_32_14F2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV33EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33EmprCod", AV33EmprCod);
      AV5Fecha = (java.util.Date)getParm(obj,1,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Fecha", localUtil.format(AV5Fecha, "99/99/99"));
      AV6Fecha_to = (java.util.Date)getParm(obj,2,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Fecha_to", localUtil.format(AV6Fecha_to, "99/99/99"));
      AV206Prdnum1 = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV206Prdnum1", AV206Prdnum1);
      AV207PrdNum2 = (String)getParm(obj,4,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV207PrdNum2", AV207PrdNum2);
      AV9LoteBusqueda = (String)getParm(obj,5,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9LoteBusqueda", AV9LoteBusqueda);
      AV10CalStkIni = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10CalStkIni", GXutil.str( AV10CalStkIni, 1, 0));
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
      pa14F2( ) ;
      ws14F2( ) ;
      we14F2( ) ;
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
      sCtrlAV33EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV5Fecha = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV6Fecha_to = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV206Prdnum1 = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV207PrdNum2 = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV9LoteBusqueda = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV10CalStkIni = (String)getParm(obj,6,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa14F2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "wcwuti118", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa14F2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV33EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33EmprCod", AV33EmprCod);
         AV5Fecha = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Fecha", localUtil.format(AV5Fecha, "99/99/99"));
         AV6Fecha_to = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Fecha_to", localUtil.format(AV6Fecha_to, "99/99/99"));
         AV206Prdnum1 = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV206Prdnum1", AV206Prdnum1);
         AV207PrdNum2 = (String)getParm(obj,6,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV207PrdNum2", AV207PrdNum2);
         AV9LoteBusqueda = (String)getParm(obj,7,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9LoteBusqueda", AV9LoteBusqueda);
         AV10CalStkIni = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10CalStkIni", GXutil.str( AV10CalStkIni, 1, 0));
      }
      wcpOAV33EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV33EmprCod") ;
      wcpOAV5Fecha = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV5Fecha"), 0) ;
      wcpOAV6Fecha_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV6Fecha_to"), 0) ;
      wcpOAV206Prdnum1 = httpContext.cgiGet( sPrefix+"wcpOAV206Prdnum1") ;
      wcpOAV207PrdNum2 = httpContext.cgiGet( sPrefix+"wcpOAV207PrdNum2") ;
      wcpOAV9LoteBusqueda = httpContext.cgiGet( sPrefix+"wcpOAV9LoteBusqueda") ;
      wcpOAV10CalStkIni = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV10CalStkIni"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV33EmprCod, wcpOAV33EmprCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(AV5Fecha), GXutil.resetTime(wcpOAV5Fecha)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV6Fecha_to), GXutil.resetTime(wcpOAV6Fecha_to)) ) || ( GXutil.strcmp(AV206Prdnum1, wcpOAV206Prdnum1) != 0 ) || ( GXutil.strcmp(AV207PrdNum2, wcpOAV207PrdNum2) != 0 ) || ( GXutil.strcmp(AV9LoteBusqueda, wcpOAV9LoteBusqueda) != 0 ) || ( AV10CalStkIni != wcpOAV10CalStkIni ) ) )
      {
         setjustcreated();
      }
      wcpOAV33EmprCod = AV33EmprCod ;
      wcpOAV5Fecha = AV5Fecha ;
      wcpOAV6Fecha_to = AV6Fecha_to ;
      wcpOAV206Prdnum1 = AV206Prdnum1 ;
      wcpOAV207PrdNum2 = AV207PrdNum2 ;
      wcpOAV9LoteBusqueda = AV9LoteBusqueda ;
      wcpOAV10CalStkIni = AV10CalStkIni ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV33EmprCod = httpContext.cgiGet( sPrefix+"AV33EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlAV33EmprCod) > 0 )
      {
         AV33EmprCod = httpContext.cgiGet( sCtrlAV33EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33EmprCod", AV33EmprCod);
      }
      else
      {
         AV33EmprCod = httpContext.cgiGet( sPrefix+"AV33EmprCod_PARM") ;
      }
      sCtrlAV5Fecha = httpContext.cgiGet( sPrefix+"AV5Fecha_CTRL") ;
      if ( GXutil.len( sCtrlAV5Fecha) > 0 )
      {
         AV5Fecha = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV5Fecha), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Fecha", localUtil.format(AV5Fecha, "99/99/99"));
      }
      else
      {
         AV5Fecha = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV5Fecha_PARM"), 0) ;
      }
      sCtrlAV6Fecha_to = httpContext.cgiGet( sPrefix+"AV6Fecha_to_CTRL") ;
      if ( GXutil.len( sCtrlAV6Fecha_to) > 0 )
      {
         AV6Fecha_to = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV6Fecha_to), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Fecha_to", localUtil.format(AV6Fecha_to, "99/99/99"));
      }
      else
      {
         AV6Fecha_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV6Fecha_to_PARM"), 0) ;
      }
      sCtrlAV206Prdnum1 = httpContext.cgiGet( sPrefix+"AV206Prdnum1_CTRL") ;
      if ( GXutil.len( sCtrlAV206Prdnum1) > 0 )
      {
         AV206Prdnum1 = httpContext.cgiGet( sCtrlAV206Prdnum1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV206Prdnum1", AV206Prdnum1);
      }
      else
      {
         AV206Prdnum1 = httpContext.cgiGet( sPrefix+"AV206Prdnum1_PARM") ;
      }
      sCtrlAV207PrdNum2 = httpContext.cgiGet( sPrefix+"AV207PrdNum2_CTRL") ;
      if ( GXutil.len( sCtrlAV207PrdNum2) > 0 )
      {
         AV207PrdNum2 = httpContext.cgiGet( sCtrlAV207PrdNum2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV207PrdNum2", AV207PrdNum2);
      }
      else
      {
         AV207PrdNum2 = httpContext.cgiGet( sPrefix+"AV207PrdNum2_PARM") ;
      }
      sCtrlAV9LoteBusqueda = httpContext.cgiGet( sPrefix+"AV9LoteBusqueda_CTRL") ;
      if ( GXutil.len( sCtrlAV9LoteBusqueda) > 0 )
      {
         AV9LoteBusqueda = httpContext.cgiGet( sCtrlAV9LoteBusqueda) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9LoteBusqueda", AV9LoteBusqueda);
      }
      else
      {
         AV9LoteBusqueda = httpContext.cgiGet( sPrefix+"AV9LoteBusqueda_PARM") ;
      }
      sCtrlAV10CalStkIni = httpContext.cgiGet( sPrefix+"AV10CalStkIni_CTRL") ;
      if ( GXutil.len( sCtrlAV10CalStkIni) > 0 )
      {
         AV10CalStkIni = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV10CalStkIni), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10CalStkIni", GXutil.str( AV10CalStkIni, 1, 0));
      }
      else
      {
         AV10CalStkIni = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV10CalStkIni_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa14F2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws14F2( ) ;
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
      ws14F2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV33EmprCod_PARM", GXutil.rtrim( AV33EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV33EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV33EmprCod_CTRL", GXutil.rtrim( sCtrlAV33EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5Fecha_PARM", localUtil.dtoc( AV5Fecha, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV5Fecha)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5Fecha_CTRL", GXutil.rtrim( sCtrlAV5Fecha));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6Fecha_to_PARM", localUtil.dtoc( AV6Fecha_to, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV6Fecha_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6Fecha_to_CTRL", GXutil.rtrim( sCtrlAV6Fecha_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV206Prdnum1_PARM", GXutil.rtrim( AV206Prdnum1));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV206Prdnum1)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV206Prdnum1_CTRL", GXutil.rtrim( sCtrlAV206Prdnum1));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV207PrdNum2_PARM", GXutil.rtrim( AV207PrdNum2));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV207PrdNum2)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV207PrdNum2_CTRL", GXutil.rtrim( sCtrlAV207PrdNum2));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9LoteBusqueda_PARM", GXutil.rtrim( AV9LoteBusqueda));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV9LoteBusqueda)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9LoteBusqueda_CTRL", GXutil.rtrim( sCtrlAV9LoteBusqueda));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10CalStkIni_PARM", GXutil.ltrim( localUtil.ntoc( AV10CalStkIni, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV10CalStkIni)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10CalStkIni_CTRL", GXutil.rtrim( sCtrlAV10CalStkIni));
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
      we14F2( ) ;
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
      httpContext.AddStyleSheetFile("GXProgressIndicator/css/bootstrap-progressbar-3.0.1.css", "");
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115564226", true, true);
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
      httpContext.AddJavascriptSource("wcwuti118.js", "?202682115564226", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_452( )
   {
      edtavDetailwebcomponent_Internalname = sPrefix+"vDETAILWEBCOMPONENT_"+sGXsfl_45_idx ;
      edtavPrdnum_Internalname = sPrefix+"vPRDNUM_"+sGXsfl_45_idx ;
      edtavPrdnom_Internalname = sPrefix+"vPRDNOM_"+sGXsfl_45_idx ;
      edtavLote_Internalname = sPrefix+"vLOTE_"+sGXsfl_45_idx ;
      edtavPrdfabnm_Internalname = sPrefix+"vPRDFABNM_"+sGXsfl_45_idx ;
      edtavPrdnomgrid_Internalname = sPrefix+"vPRDNOMGRID_"+sGXsfl_45_idx ;
      edtavCantc_Internalname = sPrefix+"vCANTC_"+sGXsfl_45_idx ;
      edtavCantcm_Internalname = sPrefix+"vCANTCM_"+sGXsfl_45_idx ;
      edtavStockinicial_Internalname = sPrefix+"vSTOCKINICIAL_"+sGXsfl_45_idx ;
      edtavStockfinal_Internalname = sPrefix+"vSTOCKFINAL_"+sGXsfl_45_idx ;
   }

   public void subsflControlProps_fel_452( )
   {
      edtavDetailwebcomponent_Internalname = sPrefix+"vDETAILWEBCOMPONENT_"+sGXsfl_45_fel_idx ;
      edtavPrdnum_Internalname = sPrefix+"vPRDNUM_"+sGXsfl_45_fel_idx ;
      edtavPrdnom_Internalname = sPrefix+"vPRDNOM_"+sGXsfl_45_fel_idx ;
      edtavLote_Internalname = sPrefix+"vLOTE_"+sGXsfl_45_fel_idx ;
      edtavPrdfabnm_Internalname = sPrefix+"vPRDFABNM_"+sGXsfl_45_fel_idx ;
      edtavPrdnomgrid_Internalname = sPrefix+"vPRDNOMGRID_"+sGXsfl_45_fel_idx ;
      edtavCantc_Internalname = sPrefix+"vCANTC_"+sGXsfl_45_fel_idx ;
      edtavCantcm_Internalname = sPrefix+"vCANTCM_"+sGXsfl_45_fel_idx ;
      edtavStockinicial_Internalname = sPrefix+"vSTOCKINICIAL_"+sGXsfl_45_fel_idx ;
      edtavStockfinal_Internalname = sPrefix+"vSTOCKFINAL_"+sGXsfl_45_fel_idx ;
   }

   public void sendrow_452( )
   {
      subsflControlProps_452( ) ;
      wb14F0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_45_idx - GRID_nFirstRecordOnPage <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_45_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_45_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 46,'"+sPrefix+"',false,'"+sGXsfl_45_idx+"',45)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDetailwebcomponent_Internalname,GXutil.rtrim( AV208DetailWebComponent),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,46);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+"e1814f2_client"+"'","","","","",edtavDetailwebcomponent_Jsonclick,Integer.valueOf(7),"Attribute","",ROClassString,"WWIconActionColumn WCD_ActionColumn","",Integer.valueOf(-1),Integer.valueOf(edtavDetailwebcomponent_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavPrdnum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavPrdnum_Enabled!=0)&&(edtavPrdnum_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 47,'"+sPrefix+"',false,'"+sGXsfl_45_idx+"',45)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrdnum_Internalname,GXutil.rtrim( AV19PrdNum),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavPrdnum_Enabled!=0)&&(edtavPrdnum_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,47);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPrdnum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavPrdnum_Visible),Integer.valueOf(edtavPrdnum_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavPrdnom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavPrdnom_Enabled!=0)&&(edtavPrdnom_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 48,'"+sPrefix+"',false,'"+sGXsfl_45_idx+"',45)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrdnom_Internalname,GXutil.rtrim( AV20PrdNom),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavPrdnom_Enabled!=0)&&(edtavPrdnom_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,48);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPrdnom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavPrdnom_Visible),Integer.valueOf(edtavPrdnom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavLote_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavLote_Enabled!=0)&&(edtavLote_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 49,'"+sPrefix+"',false,'"+sGXsfl_45_idx+"',45)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLote_Internalname,GXutil.rtrim( AV114Lote),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavLote_Enabled!=0)&&(edtavLote_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,49);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavLote_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavLote_Visible),Integer.valueOf(edtavLote_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavPrdfabnm_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavPrdfabnm_Enabled!=0)&&(edtavPrdfabnm_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 50,'"+sPrefix+"',false,'"+sGXsfl_45_idx+"',45)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrdfabnm_Internalname,GXutil.rtrim( AV139PrdFabNm),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavPrdfabnm_Enabled!=0)&&(edtavPrdfabnm_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,50);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPrdfabnm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavPrdfabnm_Visible),Integer.valueOf(edtavPrdfabnm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavPrdnomgrid_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavPrdnomgrid_Enabled!=0)&&(edtavPrdnomgrid_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 51,'"+sPrefix+"',false,'"+sGXsfl_45_idx+"',45)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrdnomgrid_Internalname,GXutil.rtrim( AV141PrdNomgrid),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavPrdnomgrid_Enabled!=0)&&(edtavPrdnomgrid_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,51);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPrdnomgrid_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavPrdnomgrid_Visible),Integer.valueOf(edtavPrdnomgrid_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCantc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCantc_Enabled!=0)&&(edtavCantc_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 52,'"+sPrefix+"',false,'"+sGXsfl_45_idx+"',45)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCantc_Internalname,GXutil.ltrim( localUtil.ntoc( AV43CantC, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCantc_Enabled!=0) ? localUtil.format( AV43CantC, "ZZZZZZ9.999") : localUtil.format( AV43CantC, "ZZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+((edtavCantc_Enabled!=0)&&(edtavCantc_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,52);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCantc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCantc_Visible),Integer.valueOf(edtavCantc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCantcm_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCantcm_Enabled!=0)&&(edtavCantcm_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 53,'"+sPrefix+"',false,'"+sGXsfl_45_idx+"',45)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCantcm_Internalname,GXutil.ltrim( localUtil.ntoc( AV44CantCm, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCantcm_Enabled!=0) ? localUtil.format( AV44CantCm, "ZZZZZZ9.99") : localUtil.format( AV44CantCm, "ZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavCantcm_Enabled!=0)&&(edtavCantcm_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,53);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCantcm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCantcm_Visible),Integer.valueOf(edtavCantcm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavStockinicial_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavStockinicial_Enabled!=0)&&(edtavStockinicial_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 54,'"+sPrefix+"',false,'"+sGXsfl_45_idx+"',45)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavStockinicial_Internalname,GXutil.ltrim( localUtil.ntoc( AV157StockInicial, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavStockinicial_Enabled!=0) ? localUtil.format( AV157StockInicial, "ZZZZZZ9.9999") : localUtil.format( AV157StockInicial, "ZZZZZZ9.9999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+((edtavStockinicial_Enabled!=0)&&(edtavStockinicial_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,54);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavStockinicial_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavStockinicial_Visible),Integer.valueOf(edtavStockinicial_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavStockfinal_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavStockfinal_Enabled!=0)&&(edtavStockfinal_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 55,'"+sPrefix+"',false,'"+sGXsfl_45_idx+"',45)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavStockfinal_Internalname,GXutil.ltrim( localUtil.ntoc( AV156Stockfinal, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavStockfinal_Enabled!=0) ? localUtil.format( AV156Stockfinal, "ZZZZZZ9.9999") : localUtil.format( AV156Stockfinal, "ZZZZZZ9.9999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+((edtavStockfinal_Enabled!=0)&&(edtavStockfinal_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,55);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavStockfinal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavStockfinal_Visible),Integer.valueOf(edtavStockfinal_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes14F2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_45_idx = ((subGrid_Islastpage==1)&&(nGXsfl_45_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_452( ) ;
      }
      /* End function sendrow_452 */
   }

   public void startgridcontrol45( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"45\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPrdnum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPrdnom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavLote_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Lote", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPrdfabnm_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fabricante", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPrdnomgrid_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Distribuidor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCantc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Consumos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCantcm_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Compras", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavStockinicial_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( edtavStockinicial_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavStockfinal_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Stock Final", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         GridContainer.AddObjectProperty("GridName", "Grid");
      }
      else
      {
         GridContainer.AddObjectProperty("GridName", "Grid");
         GridContainer.AddObjectProperty("Header", subGrid_Header);
         GridContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV208DetailWebComponent));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDetailwebcomponent_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV19PrdNum));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrdnum_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPrdnum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV20PrdNom));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrdnom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPrdnom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV114Lote));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLote_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavLote_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV139PrdFabNm));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrdfabnm_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPrdfabnm_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV141PrdNomgrid));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrdnomgrid_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPrdnomgrid_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV43CantC, (byte)(11), (byte)(3), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCantc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCantc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV44CantCm, (byte)(11), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCantcm_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCantcm_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV157StockInicial, (byte)(12), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavStockinicial_Title));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavStockinicial_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavStockinicial_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV156Stockfinal, (byte)(12), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavStockfinal_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavStockfinal_Visible, (byte)(5), (byte)(0), ".", "")));
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
      Progressbar_Internalname = sPrefix+"PROGRESSBAR" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
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
      edtavPrdnum_Internalname = sPrefix+"vPRDNUM" ;
      edtavPrdnom_Internalname = sPrefix+"vPRDNOM" ;
      edtavLote_Internalname = sPrefix+"vLOTE" ;
      edtavPrdfabnm_Internalname = sPrefix+"vPRDFABNM" ;
      edtavPrdnomgrid_Internalname = sPrefix+"vPRDNOMGRID" ;
      edtavCantc_Internalname = sPrefix+"vCANTC" ;
      edtavCantcm_Internalname = sPrefix+"vCANTCM" ;
      edtavStockinicial_Internalname = sPrefix+"vSTOCKINICIAL" ;
      edtavStockfinal_Internalname = sPrefix+"vSTOCKFINAL" ;
      divCell_grid_dwc_Internalname = sPrefix+"CELL_GRID_DWC" ;
      divGridtablewithtotalizers_Internalname = sPrefix+"GRIDTABLEWITHTOTALIZERS" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
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
      edtavStockfinal_Jsonclick = "" ;
      edtavStockfinal_Enabled = 1 ;
      edtavStockinicial_Jsonclick = "" ;
      edtavStockinicial_Enabled = 1 ;
      edtavCantcm_Jsonclick = "" ;
      edtavCantcm_Enabled = 1 ;
      edtavCantc_Jsonclick = "" ;
      edtavCantc_Enabled = 1 ;
      edtavPrdnomgrid_Jsonclick = "" ;
      edtavPrdnomgrid_Enabled = 1 ;
      edtavPrdfabnm_Jsonclick = "" ;
      edtavPrdfabnm_Enabled = 1 ;
      edtavLote_Jsonclick = "" ;
      edtavLote_Enabled = 1 ;
      edtavPrdnom_Jsonclick = "" ;
      edtavPrdnom_Enabled = 1 ;
      edtavPrdnum_Jsonclick = "" ;
      edtavPrdnum_Enabled = 1 ;
      edtavDetailwebcomponent_Jsonclick = "" ;
      edtavDetailwebcomponent_Visible = -1 ;
      edtavDetailwebcomponent_Enabled = 1 ;
      subGrid_Class = "GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtavStockfinal_Visible = -1 ;
      edtavStockinicial_Visible = -1 ;
      edtavCantcm_Visible = -1 ;
      edtavCantc_Visible = -1 ;
      edtavPrdnomgrid_Visible = -1 ;
      edtavPrdfabnm_Visible = -1 ;
      edtavLote_Visible = -1 ;
      edtavPrdnom_Visible = -1 ;
      edtavPrdnum_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      divCell_grid_dwc_Class = "col-xs-12" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Infinitescrolling = "Form" ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T||||||||" ;
      Ddo_grid_Columnssortvalues = "2||||||||" ;
      Ddo_grid_Columnids = "1:PrdNum|2:PrdNom|3:Lote|4:PrdFabNm|5:PrdNomgrid|6:CantC|7:CantCm|8:StockInicial|9:Stockfinal" ;
      Ddo_grid_Gridinternalname = "" ;
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
      edtavStockinicial_Title = httpContext.getMessage( "Stock Inicial", "") ;
      subGrid_Rows = 50 ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'edtavStockinicial_Title',ctrl:'vSTOCKINICIAL',prop:'Title'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A12453HreFecAct',fld:'HREFECACT',pic:''},{av:'A4558HrePrdNum',fld:'HREPRDNUM',pic:''},{av:'A4563HrePrdCant',fld:'HREPRDCANT',pic:'ZZZZZZ9.999'},{av:'A5726HreLote',fld:'HRELOTE',pic:''},{av:'A862CumConFec',fld:'CUMCONFEC',pic:''},{av:'A860CumConCant',fld:'CUMCONCANT',pic:'ZZZZZZ9.9999'},{av:'A5862CumConLot',fld:'CUMCONLOT',pic:''},{av:'A3348CCStkFec',fld:'CCSTKFEC',pic:''},{av:'A3345TipMovCc',fld:'TIPMOVCC',pic:''},{av:'A3357CCStkDsc',fld:'CCSTKDSC',pic:''},{av:'A3344CCStkCanS',fld:'CCSTKCANS',pic:'ZZZZZZ9.9999'},{av:'A5722CCStkLot',fld:'CCSTKLOT',pic:''},{av:'A415EntFecEnt',fld:'ENTFECENT',pic:''},{av:'A11Albaran',fld:'ALBARAN',pic:''},{av:'A418EntUniEnt',fld:'ENTUNIENT',pic:'ZZZZZ9.99'},{av:'A5686EntLotN',fld:'ENTLOTN',pic:''},{av:'AV43CantC',fld:'vCANTC',pic:'ZZZZZZ9.999',hsh:true},{av:'AV44CantCm',fld:'vCANTCM',pic:'ZZZZZZ9.99',hsh:true},{av:'AV19PrdNum',fld:'vPRDNUM',pic:'',hsh:true},{av:'AV114Lote',fld:'vLOTE',pic:'',hsh:true},{av:'A11707HreProv',fld:'HREPROV',pic:'ZZZZZ9'},{av:'A12718HreFabId',fld:'HREFABID',pic:'ZZZZZ9'},{av:'A6156EntPrvNum',fld:'ENTPRVNUM',pic:'ZZZZZ9'},{av:'A12716EntFabId',fld:'ENTFABID',pic:'ZZZZZ9'},{av:'A658PedCod',fld:'PEDCOD',pic:'ZZZZZZZ9'},{av:'A795PrvNum',fld:'PRVNUM',pic:'ZZZZZ9'},{av:'A12714PrdFabId',fld:'PRDFABID',pic:'ZZZZZ9'},{av:'sPrefix'},{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV209OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV210OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV18FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV33EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5Fecha',fld:'vFECHA',pic:''},{av:'AV6Fecha_to',fld:'vFECHA_TO',pic:''},{av:'AV206Prdnum1',fld:'vPRDNUM1',pic:''},{av:'AV207PrdNum2',fld:'vPRDNUM2',pic:''},{av:'AV9LoteBusqueda',fld:'vLOTEBUSQUEDA',pic:''},{av:'AV10CalStkIni',fld:'vCALSTKINI',pic:'9'},{av:'AV221Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV68Fec1',fld:'vFEC1',pic:'',hsh:true},{av:'AV145Prdnumi',fld:'vPRDNUMI',pic:'',hsh:true},{av:'AV143PrdNumf',fld:'vPRDNUMF',pic:'',hsh:true},{av:'AV70Fec2',fld:'vFEC2',pic:'',hsh:true},{av:'AV54Contval',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'AV7PrdnumIN',fld:'vPRDNUMIN',pic:'',hsh:true},{av:'AV115Lote2',fld:'vLOTE2',pic:'',hsh:true},{av:'AV153q',fld:'vQ',pic:'ZZZ9',hsh:true},{av:'AV148Proprv',fld:'vPROPRV',pic:'9',hsh:true},{av:'AV152PrvNum2',fld:'vPRVNUM2',pic:'ZZZZZ9',hsh:true},{av:'AV138PrdFabId',fld:'vPRDFABID',pic:'ZZZZZ9',hsh:true},{av:'AV83HreLote',fld:'vHRELOTE',pic:'',hsh:true},{av:'AV39Cant',fld:'vCANT',pic:'ZZZZZZ9.999',hsh:true},{av:'AV172z',fld:'vZ',pic:'ZZZZZZ9.99',hsh:true},{av:'AV133pedcod',fld:'vPEDCOD',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtavPrdnum_Visible',ctrl:'vPRDNUM',prop:'Visible'},{av:'edtavPrdnom_Visible',ctrl:'vPRDNOM',prop:'Visible'},{av:'edtavLote_Visible',ctrl:'vLOTE',prop:'Visible'},{av:'edtavPrdfabnm_Visible',ctrl:'vPRDFABNM',prop:'Visible'},{av:'edtavPrdnomgrid_Visible',ctrl:'vPRDNOMGRID',prop:'Visible'},{av:'edtavCantc_Visible',ctrl:'vCANTC',prop:'Visible'},{av:'edtavCantcm_Visible',ctrl:'vCANTCM',prop:'Visible'},{av:'edtavStockinicial_Visible',ctrl:'vSTOCKINICIAL',prop:'Visible'},{av:'edtavStockfinal_Visible',ctrl:'vSTOCKFINAL',prop:'Visible'},{av:'AV26ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV16GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e1214F2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV221Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV209OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV210OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV18FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV33EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5Fecha',fld:'vFECHA',pic:''},{av:'AV6Fecha_to',fld:'vFECHA_TO',pic:''},{av:'AV206Prdnum1',fld:'vPRDNUM1',pic:''},{av:'AV207PrdNum2',fld:'vPRDNUM2',pic:''},{av:'AV9LoteBusqueda',fld:'vLOTEBUSQUEDA',pic:''},{av:'AV10CalStkIni',fld:'vCALSTKINI',pic:'9'},{av:'edtavStockinicial_Title',ctrl:'vSTOCKINICIAL',prop:'Title'},{av:'AV68Fec1',fld:'vFEC1',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A12453HreFecAct',fld:'HREFECACT',pic:''},{av:'AV145Prdnumi',fld:'vPRDNUMI',pic:'',hsh:true},{av:'AV143PrdNumf',fld:'vPRDNUMF',pic:'',hsh:true},{av:'AV70Fec2',fld:'vFEC2',pic:'',hsh:true},{av:'A4558HrePrdNum',fld:'HREPRDNUM',pic:''},{av:'A4563HrePrdCant',fld:'HREPRDCANT',pic:'ZZZZZZ9.999'},{av:'A5726HreLote',fld:'HRELOTE',pic:''},{av:'A862CumConFec',fld:'CUMCONFEC',pic:''},{av:'AV54Contval',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'A860CumConCant',fld:'CUMCONCANT',pic:'ZZZZZZ9.9999'},{av:'A5862CumConLot',fld:'CUMCONLOT',pic:''},{av:'A3348CCStkFec',fld:'CCSTKFEC',pic:''},{av:'A3345TipMovCc',fld:'TIPMOVCC',pic:''},{av:'A3357CCStkDsc',fld:'CCSTKDSC',pic:''},{av:'A3344CCStkCanS',fld:'CCSTKCANS',pic:'ZZZZZZ9.9999'},{av:'A5722CCStkLot',fld:'CCSTKLOT',pic:''},{av:'A415EntFecEnt',fld:'ENTFECENT',pic:''},{av:'A11Albaran',fld:'ALBARAN',pic:''},{av:'A418EntUniEnt',fld:'ENTUNIENT',pic:'ZZZZZ9.99'},{av:'A5686EntLotN',fld:'ENTLOTN',pic:''},{av:'AV7PrdnumIN',fld:'vPRDNUMIN',pic:'',hsh:true},{av:'AV115Lote2',fld:'vLOTE2',pic:'',hsh:true},{av:'AV43CantC',fld:'vCANTC',pic:'ZZZZZZ9.999',hsh:true},{av:'AV44CantCm',fld:'vCANTCM',pic:'ZZZZZZ9.99',hsh:true},{av:'AV153q',fld:'vQ',pic:'ZZZ9',hsh:true},{av:'AV19PrdNum',fld:'vPRDNUM',pic:'',hsh:true},{av:'AV114Lote',fld:'vLOTE',pic:'',hsh:true},{av:'A11707HreProv',fld:'HREPROV',pic:'ZZZZZ9'},{av:'A12718HreFabId',fld:'HREFABID',pic:'ZZZZZ9'},{av:'AV148Proprv',fld:'vPROPRV',pic:'9',hsh:true},{av:'A6156EntPrvNum',fld:'ENTPRVNUM',pic:'ZZZZZ9'},{av:'A12716EntFabId',fld:'ENTFABID',pic:'ZZZZZ9'},{av:'A658PedCod',fld:'PEDCOD',pic:'ZZZZZZZ9'},{av:'AV152PrvNum2',fld:'vPRVNUM2',pic:'ZZZZZ9',hsh:true},{av:'AV138PrdFabId',fld:'vPRDFABID',pic:'ZZZZZ9',hsh:true},{av:'AV83HreLote',fld:'vHRELOTE',pic:'',hsh:true},{av:'AV39Cant',fld:'vCANT',pic:'ZZZZZZ9.999',hsh:true},{av:'AV172z',fld:'vZ',pic:'ZZZZZZ9.99',hsh:true},{av:'AV133pedcod',fld:'vPEDCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A795PrvNum',fld:'PRVNUM',pic:'ZZZZZ9'},{av:'A12714PrdFabId',fld:'PRDFABID',pic:'ZZZZZ9'},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV209OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV210OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e1714F2',iparms:[{av:'AV180Tab_prd',fld:'vTAB_PRD',pic:''},{av:'AV179Tab_ltecn',fld:'vTAB_LTECN',pic:''},{av:'AV176Tab_cntcn',fld:'vTAB_CNTCN',pic:'ZZZZZZ9.999'},{av:'AV181tab_prdcm',fld:'vTAB_PRDCM',pic:''},{av:'AV178Tab_ltecm',fld:'vTAB_LTECM',pic:''},{av:'AV175Tab_cntcm',fld:'vTAB_CNTCM',pic:'ZZZZZ9.99'},{av:'AV33EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9LoteBusqueda',fld:'vLOTEBUSQUEDA',pic:''},{av:'AV10CalStkIni',fld:'vCALSTKINI',pic:'9'},{av:'AV68Fec1',fld:'vFEC1',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A12453HreFecAct',fld:'HREFECACT',pic:''},{av:'AV145Prdnumi',fld:'vPRDNUMI',pic:'',hsh:true},{av:'AV143PrdNumf',fld:'vPRDNUMF',pic:'',hsh:true},{av:'AV70Fec2',fld:'vFEC2',pic:'',hsh:true},{av:'A4558HrePrdNum',fld:'HREPRDNUM',pic:''},{av:'A4563HrePrdCant',fld:'HREPRDCANT',pic:'ZZZZZZ9.999'},{av:'A5726HreLote',fld:'HRELOTE',pic:''},{av:'A862CumConFec',fld:'CUMCONFEC',pic:''},{av:'AV54Contval',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'A860CumConCant',fld:'CUMCONCANT',pic:'ZZZZZZ9.9999'},{av:'A5862CumConLot',fld:'CUMCONLOT',pic:''},{av:'A3348CCStkFec',fld:'CCSTKFEC',pic:''},{av:'A3345TipMovCc',fld:'TIPMOVCC',pic:''},{av:'A3357CCStkDsc',fld:'CCSTKDSC',pic:''},{av:'A3344CCStkCanS',fld:'CCSTKCANS',pic:'ZZZZZZ9.9999'},{av:'A5722CCStkLot',fld:'CCSTKLOT',pic:''},{av:'A415EntFecEnt',fld:'ENTFECENT',pic:''},{av:'A11Albaran',fld:'ALBARAN',pic:''},{av:'A418EntUniEnt',fld:'ENTUNIENT',pic:'ZZZZZ9.99'},{av:'A5686EntLotN',fld:'ENTLOTN',pic:''},{av:'AV182Tab_prod',fld:'vTAB_PROD',pic:''},{av:'AV7PrdnumIN',fld:'vPRDNUMIN',pic:'',hsh:true},{av:'AV177Tab_lote',fld:'vTAB_LOTE',pic:''},{av:'AV115Lote2',fld:'vLOTE2',pic:'',hsh:true},{av:'AV173Tab_cnt1',fld:'vTAB_CNT1',pic:'ZZZZZZ9.99'},{av:'AV43CantC',fld:'vCANTC',pic:'ZZZZZZ9.999',hsh:true},{av:'AV174Tab_cnt2',fld:'vTAB_CNT2',pic:'ZZZZZZ9.99'},{av:'AV44CantCm',fld:'vCANTCM',pic:'ZZZZZZ9.99',hsh:true},{av:'AV153q',fld:'vQ',pic:'ZZZ9',hsh:true},{av:'AV19PrdNum',fld:'vPRDNUM',pic:'',hsh:true},{av:'AV114Lote',fld:'vLOTE',pic:'',hsh:true},{av:'A11707HreProv',fld:'HREPROV',pic:'ZZZZZ9'},{av:'A12718HreFabId',fld:'HREFABID',pic:'ZZZZZ9'},{av:'AV148Proprv',fld:'vPROPRV',pic:'9',hsh:true},{av:'A6156EntPrvNum',fld:'ENTPRVNUM',pic:'ZZZZZ9'},{av:'A12716EntFabId',fld:'ENTFABID',pic:'ZZZZZ9'},{av:'A658PedCod',fld:'PEDCOD',pic:'ZZZZZZZ9'},{av:'AV152PrvNum2',fld:'vPRVNUM2',pic:'ZZZZZ9',hsh:true},{av:'AV138PrdFabId',fld:'vPRDFABID',pic:'ZZZZZ9',hsh:true},{av:'AV83HreLote',fld:'vHRELOTE',pic:'',hsh:true},{av:'AV39Cant',fld:'vCANT',pic:'ZZZZZZ9.999',hsh:true},{av:'AV172z',fld:'vZ',pic:'ZZZZZZ9.99',hsh:true},{av:'AV133pedcod',fld:'vPEDCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A795PrvNum',fld:'PRVNUM',pic:'ZZZZZ9'},{av:'A12714PrdFabId',fld:'PRDFABID',pic:'ZZZZZ9'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV208DetailWebComponent',fld:'vDETAILWEBCOMPONENT',pic:''},{av:'AV172z',fld:'vZ',pic:'ZZZZZZ9.99',hsh:true},{av:'AV153q',fld:'vQ',pic:'ZZZ9',hsh:true},{av:'AV182Tab_prod',fld:'vTAB_PROD',pic:''},{av:'AV177Tab_lote',fld:'vTAB_LOTE',pic:''},{av:'AV173Tab_cnt1',fld:'vTAB_CNT1',pic:'ZZZZZZ9.99'},{av:'AV174Tab_cnt2',fld:'vTAB_CNT2',pic:'ZZZZZZ9.99'},{av:'AV7PrdnumIN',fld:'vPRDNUMIN',pic:'',hsh:true},{av:'AV115Lote2',fld:'vLOTE2',pic:'',hsh:true},{av:'AV43CantC',fld:'vCANTC',pic:'ZZZZZZ9.999',hsh:true},{av:'AV44CantCm',fld:'vCANTCM',pic:'ZZZZZZ9.99',hsh:true},{av:'AV157StockInicial',fld:'vSTOCKINICIAL',pic:'ZZZZZZ9.9999'},{av:'AV114Lote',fld:'vLOTE',pic:'',hsh:true},{av:'AV19PrdNum',fld:'vPRDNUM',pic:'',hsh:true},{av:'AV20PrdNom',fld:'vPRDNOM',pic:''},{av:'AV139PrdFabNm',fld:'vPRDFABNM',pic:''},{av:'AV141PrdNomgrid',fld:'vPRDNOMGRID',pic:''},{av:'AV68Fec1',fld:'vFEC1',pic:'',hsh:true},{av:'AV33EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV156Stockfinal',fld:'vSTOCKFINAL',pic:'ZZZZZZ9.9999'},{av:'AV39Cant',fld:'vCANT',pic:'ZZZZZZ9.999',hsh:true},{av:'AV176Tab_cntcn',fld:'vTAB_CNTCN',pic:'ZZZZZZ9.999'},{av:'AV179Tab_ltecn',fld:'vTAB_LTECN',pic:''},{av:'AV180Tab_prd',fld:'vTAB_PRD',pic:''},{av:'AV83HreLote',fld:'vHRELOTE',pic:'',hsh:true},{av:'AV175Tab_cntcm',fld:'vTAB_CNTCM',pic:'ZZZZZ9.99'},{av:'AV178Tab_ltecm',fld:'vTAB_LTECM',pic:''},{av:'AV181tab_prdcm',fld:'vTAB_PRDCM',pic:''},{av:'AV152PrvNum2',fld:'vPRVNUM2',pic:'ZZZZZ9',hsh:true},{av:'AV138PrdFabId',fld:'vPRDFABID',pic:'ZZZZZ9',hsh:true},{av:'AV133pedcod',fld:'vPEDCOD',pic:'ZZZZZZZ9',hsh:true}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e1314F2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV221Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV209OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV210OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV18FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV33EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5Fecha',fld:'vFECHA',pic:''},{av:'AV6Fecha_to',fld:'vFECHA_TO',pic:''},{av:'AV206Prdnum1',fld:'vPRDNUM1',pic:''},{av:'AV207PrdNum2',fld:'vPRDNUM2',pic:''},{av:'AV9LoteBusqueda',fld:'vLOTEBUSQUEDA',pic:''},{av:'AV10CalStkIni',fld:'vCALSTKINI',pic:'9'},{av:'edtavStockinicial_Title',ctrl:'vSTOCKINICIAL',prop:'Title'},{av:'AV68Fec1',fld:'vFEC1',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A12453HreFecAct',fld:'HREFECACT',pic:''},{av:'AV145Prdnumi',fld:'vPRDNUMI',pic:'',hsh:true},{av:'AV143PrdNumf',fld:'vPRDNUMF',pic:'',hsh:true},{av:'AV70Fec2',fld:'vFEC2',pic:'',hsh:true},{av:'A4558HrePrdNum',fld:'HREPRDNUM',pic:''},{av:'A4563HrePrdCant',fld:'HREPRDCANT',pic:'ZZZZZZ9.999'},{av:'A5726HreLote',fld:'HRELOTE',pic:''},{av:'A862CumConFec',fld:'CUMCONFEC',pic:''},{av:'AV54Contval',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'A860CumConCant',fld:'CUMCONCANT',pic:'ZZZZZZ9.9999'},{av:'A5862CumConLot',fld:'CUMCONLOT',pic:''},{av:'A3348CCStkFec',fld:'CCSTKFEC',pic:''},{av:'A3345TipMovCc',fld:'TIPMOVCC',pic:''},{av:'A3357CCStkDsc',fld:'CCSTKDSC',pic:''},{av:'A3344CCStkCanS',fld:'CCSTKCANS',pic:'ZZZZZZ9.9999'},{av:'A5722CCStkLot',fld:'CCSTKLOT',pic:''},{av:'A415EntFecEnt',fld:'ENTFECENT',pic:''},{av:'A11Albaran',fld:'ALBARAN',pic:''},{av:'A418EntUniEnt',fld:'ENTUNIENT',pic:'ZZZZZ9.99'},{av:'A5686EntLotN',fld:'ENTLOTN',pic:''},{av:'AV7PrdnumIN',fld:'vPRDNUMIN',pic:'',hsh:true},{av:'AV115Lote2',fld:'vLOTE2',pic:'',hsh:true},{av:'AV43CantC',fld:'vCANTC',pic:'ZZZZZZ9.999',hsh:true},{av:'AV44CantCm',fld:'vCANTCM',pic:'ZZZZZZ9.99',hsh:true},{av:'AV153q',fld:'vQ',pic:'ZZZ9',hsh:true},{av:'AV19PrdNum',fld:'vPRDNUM',pic:'',hsh:true},{av:'AV114Lote',fld:'vLOTE',pic:'',hsh:true},{av:'A11707HreProv',fld:'HREPROV',pic:'ZZZZZ9'},{av:'A12718HreFabId',fld:'HREFABID',pic:'ZZZZZ9'},{av:'AV148Proprv',fld:'vPROPRV',pic:'9',hsh:true},{av:'A6156EntPrvNum',fld:'ENTPRVNUM',pic:'ZZZZZ9'},{av:'A12716EntFabId',fld:'ENTFABID',pic:'ZZZZZ9'},{av:'A658PedCod',fld:'PEDCOD',pic:'ZZZZZZZ9'},{av:'AV152PrvNum2',fld:'vPRVNUM2',pic:'ZZZZZ9',hsh:true},{av:'AV138PrdFabId',fld:'vPRDFABID',pic:'ZZZZZ9',hsh:true},{av:'AV83HreLote',fld:'vHRELOTE',pic:'',hsh:true},{av:'AV39Cant',fld:'vCANT',pic:'ZZZZZZ9.999',hsh:true},{av:'AV172z',fld:'vZ',pic:'ZZZZZZ9.99',hsh:true},{av:'AV133pedcod',fld:'vPEDCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A795PrvNum',fld:'PRVNUM',pic:'ZZZZZ9'},{av:'A12714PrdFabId',fld:'PRDFABID',pic:'ZZZZZ9'},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtavPrdnum_Visible',ctrl:'vPRDNUM',prop:'Visible'},{av:'edtavPrdnom_Visible',ctrl:'vPRDNOM',prop:'Visible'},{av:'edtavLote_Visible',ctrl:'vLOTE',prop:'Visible'},{av:'edtavPrdfabnm_Visible',ctrl:'vPRDFABNM',prop:'Visible'},{av:'edtavPrdnomgrid_Visible',ctrl:'vPRDNOMGRID',prop:'Visible'},{av:'edtavCantc_Visible',ctrl:'vCANTC',prop:'Visible'},{av:'edtavCantcm_Visible',ctrl:'vCANTCM',prop:'Visible'},{av:'edtavStockinicial_Visible',ctrl:'vSTOCKINICIAL',prop:'Visible'},{av:'edtavStockfinal_Visible',ctrl:'vSTOCKFINAL',prop:'Visible'},{av:'AV26ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV16GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e1114F2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV221Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV209OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV210OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV18FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV33EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5Fecha',fld:'vFECHA',pic:''},{av:'AV6Fecha_to',fld:'vFECHA_TO',pic:''},{av:'AV206Prdnum1',fld:'vPRDNUM1',pic:''},{av:'AV207PrdNum2',fld:'vPRDNUM2',pic:''},{av:'AV9LoteBusqueda',fld:'vLOTEBUSQUEDA',pic:''},{av:'AV10CalStkIni',fld:'vCALSTKINI',pic:'9'},{av:'edtavStockinicial_Title',ctrl:'vSTOCKINICIAL',prop:'Title'},{av:'AV68Fec1',fld:'vFEC1',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A12453HreFecAct',fld:'HREFECACT',pic:''},{av:'AV145Prdnumi',fld:'vPRDNUMI',pic:'',hsh:true},{av:'AV143PrdNumf',fld:'vPRDNUMF',pic:'',hsh:true},{av:'AV70Fec2',fld:'vFEC2',pic:'',hsh:true},{av:'A4558HrePrdNum',fld:'HREPRDNUM',pic:''},{av:'A4563HrePrdCant',fld:'HREPRDCANT',pic:'ZZZZZZ9.999'},{av:'A5726HreLote',fld:'HRELOTE',pic:''},{av:'A862CumConFec',fld:'CUMCONFEC',pic:''},{av:'AV54Contval',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'A860CumConCant',fld:'CUMCONCANT',pic:'ZZZZZZ9.9999'},{av:'A5862CumConLot',fld:'CUMCONLOT',pic:''},{av:'A3348CCStkFec',fld:'CCSTKFEC',pic:''},{av:'A3345TipMovCc',fld:'TIPMOVCC',pic:''},{av:'A3357CCStkDsc',fld:'CCSTKDSC',pic:''},{av:'A3344CCStkCanS',fld:'CCSTKCANS',pic:'ZZZZZZ9.9999'},{av:'A5722CCStkLot',fld:'CCSTKLOT',pic:''},{av:'A415EntFecEnt',fld:'ENTFECENT',pic:''},{av:'A11Albaran',fld:'ALBARAN',pic:''},{av:'A418EntUniEnt',fld:'ENTUNIENT',pic:'ZZZZZ9.99'},{av:'A5686EntLotN',fld:'ENTLOTN',pic:''},{av:'AV7PrdnumIN',fld:'vPRDNUMIN',pic:'',hsh:true},{av:'AV115Lote2',fld:'vLOTE2',pic:'',hsh:true},{av:'AV43CantC',fld:'vCANTC',pic:'ZZZZZZ9.999',hsh:true},{av:'AV44CantCm',fld:'vCANTCM',pic:'ZZZZZZ9.99',hsh:true},{av:'AV153q',fld:'vQ',pic:'ZZZ9',hsh:true},{av:'AV19PrdNum',fld:'vPRDNUM',pic:'',hsh:true},{av:'AV114Lote',fld:'vLOTE',pic:'',hsh:true},{av:'A11707HreProv',fld:'HREPROV',pic:'ZZZZZ9'},{av:'A12718HreFabId',fld:'HREFABID',pic:'ZZZZZ9'},{av:'AV148Proprv',fld:'vPROPRV',pic:'9',hsh:true},{av:'A6156EntPrvNum',fld:'ENTPRVNUM',pic:'ZZZZZ9'},{av:'A12716EntFabId',fld:'ENTFABID',pic:'ZZZZZ9'},{av:'A658PedCod',fld:'PEDCOD',pic:'ZZZZZZZ9'},{av:'AV152PrvNum2',fld:'vPRVNUM2',pic:'ZZZZZ9',hsh:true},{av:'AV138PrdFabId',fld:'vPRDFABID',pic:'ZZZZZ9',hsh:true},{av:'AV83HreLote',fld:'vHRELOTE',pic:'',hsh:true},{av:'AV39Cant',fld:'vCANT',pic:'ZZZZZZ9.999',hsh:true},{av:'AV172z',fld:'vZ',pic:'ZZZZZZ9.99',hsh:true},{av:'AV133pedcod',fld:'vPEDCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A795PrvNum',fld:'PRVNUM',pic:'ZZZZZ9'},{av:'A12714PrdFabId',fld:'PRDFABID',pic:'ZZZZZ9'},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV16GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV16GridState',fld:'vGRIDSTATE',pic:''},{av:'AV209OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV210OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV18FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtavPrdnum_Visible',ctrl:'vPRDNUM',prop:'Visible'},{av:'edtavPrdnom_Visible',ctrl:'vPRDNOM',prop:'Visible'},{av:'edtavLote_Visible',ctrl:'vLOTE',prop:'Visible'},{av:'edtavPrdfabnm_Visible',ctrl:'vPRDFABNM',prop:'Visible'},{av:'edtavPrdnomgrid_Visible',ctrl:'vPRDNOMGRID',prop:'Visible'},{av:'edtavCantc_Visible',ctrl:'vCANTC',prop:'Visible'},{av:'edtavCantcm_Visible',ctrl:'vCANTCM',prop:'Visible'},{av:'edtavStockinicial_Visible',ctrl:'vSTOCKINICIAL',prop:'Visible'},{av:'edtavStockfinal_Visible',ctrl:'vSTOCKFINAL',prop:'Visible'},{av:'AV26ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e1414F2',iparms:[]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK","{handler:'e1814F2',iparms:[{av:'AV33EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV19PrdNum',fld:'vPRDNUM',pic:'',hsh:true},{av:'AV114Lote',fld:'vLOTE',pic:'',hsh:true},{av:'AV68Fec1',fld:'vFEC1',pic:'',hsh:true},{av:'AV70Fec2',fld:'vFEC2',pic:'',hsh:true}]");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK",",oparms:[{ctrl:'GRID_DWC'}]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'edtavStockinicial_Title',ctrl:'vSTOCKINICIAL',prop:'Title'},{av:'AV68Fec1',fld:'vFEC1',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A12453HreFecAct',fld:'HREFECACT',pic:''},{av:'AV145Prdnumi',fld:'vPRDNUMI',pic:'',hsh:true},{av:'AV143PrdNumf',fld:'vPRDNUMF',pic:'',hsh:true},{av:'AV70Fec2',fld:'vFEC2',pic:'',hsh:true},{av:'A4558HrePrdNum',fld:'HREPRDNUM',pic:''},{av:'A4563HrePrdCant',fld:'HREPRDCANT',pic:'ZZZZZZ9.999'},{av:'A5726HreLote',fld:'HRELOTE',pic:''},{av:'A862CumConFec',fld:'CUMCONFEC',pic:''},{av:'AV54Contval',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'A860CumConCant',fld:'CUMCONCANT',pic:'ZZZZZZ9.9999'},{av:'A5862CumConLot',fld:'CUMCONLOT',pic:''},{av:'A3348CCStkFec',fld:'CCSTKFEC',pic:''},{av:'A3345TipMovCc',fld:'TIPMOVCC',pic:''},{av:'A3357CCStkDsc',fld:'CCSTKDSC',pic:''},{av:'A3344CCStkCanS',fld:'CCSTKCANS',pic:'ZZZZZZ9.9999'},{av:'A5722CCStkLot',fld:'CCSTKLOT',pic:''},{av:'A415EntFecEnt',fld:'ENTFECENT',pic:''},{av:'A11Albaran',fld:'ALBARAN',pic:''},{av:'A418EntUniEnt',fld:'ENTUNIENT',pic:'ZZZZZ9.99'},{av:'A5686EntLotN',fld:'ENTLOTN',pic:''},{av:'AV7PrdnumIN',fld:'vPRDNUMIN',pic:'',hsh:true},{av:'AV115Lote2',fld:'vLOTE2',pic:'',hsh:true},{av:'AV43CantC',fld:'vCANTC',pic:'ZZZZZZ9.999',hsh:true},{av:'AV44CantCm',fld:'vCANTCM',pic:'ZZZZZZ9.99',hsh:true},{av:'AV153q',fld:'vQ',pic:'ZZZ9',hsh:true},{av:'AV19PrdNum',fld:'vPRDNUM',pic:'',hsh:true},{av:'AV114Lote',fld:'vLOTE',pic:'',hsh:true},{av:'A11707HreProv',fld:'HREPROV',pic:'ZZZZZ9'},{av:'A12718HreFabId',fld:'HREFABID',pic:'ZZZZZ9'},{av:'AV148Proprv',fld:'vPROPRV',pic:'9',hsh:true},{av:'A6156EntPrvNum',fld:'ENTPRVNUM',pic:'ZZZZZ9'},{av:'A12716EntFabId',fld:'ENTFABID',pic:'ZZZZZ9'},{av:'A658PedCod',fld:'PEDCOD',pic:'ZZZZZZZ9'},{av:'AV152PrvNum2',fld:'vPRVNUM2',pic:'ZZZZZ9',hsh:true},{av:'AV138PrdFabId',fld:'vPRDFABID',pic:'ZZZZZ9',hsh:true},{av:'AV83HreLote',fld:'vHRELOTE',pic:'',hsh:true},{av:'AV39Cant',fld:'vCANT',pic:'ZZZZZZ9.999',hsh:true},{av:'AV172z',fld:'vZ',pic:'ZZZZZZ9.99',hsh:true},{av:'AV133pedcod',fld:'vPEDCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A795PrvNum',fld:'PRVNUM',pic:'ZZZZZ9'},{av:'A12714PrdFabId',fld:'PRDFABID',pic:'ZZZZZ9'},{av:'sPrefix'},{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV221Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV209OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV210OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV18FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV33EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5Fecha',fld:'vFECHA',pic:''},{av:'AV6Fecha_to',fld:'vFECHA_TO',pic:''},{av:'AV206Prdnum1',fld:'vPRDNUM1',pic:''},{av:'AV207PrdNum2',fld:'vPRDNUM2',pic:''},{av:'AV9LoteBusqueda',fld:'vLOTEBUSQUEDA',pic:''},{av:'AV10CalStkIni',fld:'vCALSTKINI',pic:'9'}]");
      setEventMetadata("GRID_FIRSTPAGE",",oparms:[{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtavPrdnum_Visible',ctrl:'vPRDNUM',prop:'Visible'},{av:'edtavPrdnom_Visible',ctrl:'vPRDNOM',prop:'Visible'},{av:'edtavLote_Visible',ctrl:'vLOTE',prop:'Visible'},{av:'edtavPrdfabnm_Visible',ctrl:'vPRDFABNM',prop:'Visible'},{av:'edtavPrdnomgrid_Visible',ctrl:'vPRDNOMGRID',prop:'Visible'},{av:'edtavCantc_Visible',ctrl:'vCANTC',prop:'Visible'},{av:'edtavCantcm_Visible',ctrl:'vCANTCM',prop:'Visible'},{av:'edtavStockinicial_Visible',ctrl:'vSTOCKINICIAL',prop:'Visible'},{av:'edtavStockfinal_Visible',ctrl:'vSTOCKFINAL',prop:'Visible'},{av:'AV26ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV16GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'edtavStockinicial_Title',ctrl:'vSTOCKINICIAL',prop:'Title'},{av:'AV68Fec1',fld:'vFEC1',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A12453HreFecAct',fld:'HREFECACT',pic:''},{av:'AV145Prdnumi',fld:'vPRDNUMI',pic:'',hsh:true},{av:'AV143PrdNumf',fld:'vPRDNUMF',pic:'',hsh:true},{av:'AV70Fec2',fld:'vFEC2',pic:'',hsh:true},{av:'A4558HrePrdNum',fld:'HREPRDNUM',pic:''},{av:'A4563HrePrdCant',fld:'HREPRDCANT',pic:'ZZZZZZ9.999'},{av:'A5726HreLote',fld:'HRELOTE',pic:''},{av:'A862CumConFec',fld:'CUMCONFEC',pic:''},{av:'AV54Contval',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'A860CumConCant',fld:'CUMCONCANT',pic:'ZZZZZZ9.9999'},{av:'A5862CumConLot',fld:'CUMCONLOT',pic:''},{av:'A3348CCStkFec',fld:'CCSTKFEC',pic:''},{av:'A3345TipMovCc',fld:'TIPMOVCC',pic:''},{av:'A3357CCStkDsc',fld:'CCSTKDSC',pic:''},{av:'A3344CCStkCanS',fld:'CCSTKCANS',pic:'ZZZZZZ9.9999'},{av:'A5722CCStkLot',fld:'CCSTKLOT',pic:''},{av:'A415EntFecEnt',fld:'ENTFECENT',pic:''},{av:'A11Albaran',fld:'ALBARAN',pic:''},{av:'A418EntUniEnt',fld:'ENTUNIENT',pic:'ZZZZZ9.99'},{av:'A5686EntLotN',fld:'ENTLOTN',pic:''},{av:'AV7PrdnumIN',fld:'vPRDNUMIN',pic:'',hsh:true},{av:'AV115Lote2',fld:'vLOTE2',pic:'',hsh:true},{av:'AV43CantC',fld:'vCANTC',pic:'ZZZZZZ9.999',hsh:true},{av:'AV44CantCm',fld:'vCANTCM',pic:'ZZZZZZ9.99',hsh:true},{av:'AV153q',fld:'vQ',pic:'ZZZ9',hsh:true},{av:'AV19PrdNum',fld:'vPRDNUM',pic:'',hsh:true},{av:'AV114Lote',fld:'vLOTE',pic:'',hsh:true},{av:'A11707HreProv',fld:'HREPROV',pic:'ZZZZZ9'},{av:'A12718HreFabId',fld:'HREFABID',pic:'ZZZZZ9'},{av:'AV148Proprv',fld:'vPROPRV',pic:'9',hsh:true},{av:'A6156EntPrvNum',fld:'ENTPRVNUM',pic:'ZZZZZ9'},{av:'A12716EntFabId',fld:'ENTFABID',pic:'ZZZZZ9'},{av:'A658PedCod',fld:'PEDCOD',pic:'ZZZZZZZ9'},{av:'AV152PrvNum2',fld:'vPRVNUM2',pic:'ZZZZZ9',hsh:true},{av:'AV138PrdFabId',fld:'vPRDFABID',pic:'ZZZZZ9',hsh:true},{av:'AV83HreLote',fld:'vHRELOTE',pic:'',hsh:true},{av:'AV39Cant',fld:'vCANT',pic:'ZZZZZZ9.999',hsh:true},{av:'AV172z',fld:'vZ',pic:'ZZZZZZ9.99',hsh:true},{av:'AV133pedcod',fld:'vPEDCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A795PrvNum',fld:'PRVNUM',pic:'ZZZZZ9'},{av:'A12714PrdFabId',fld:'PRDFABID',pic:'ZZZZZ9'},{av:'sPrefix'},{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV221Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV209OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV210OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV18FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV33EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5Fecha',fld:'vFECHA',pic:''},{av:'AV6Fecha_to',fld:'vFECHA_TO',pic:''},{av:'AV206Prdnum1',fld:'vPRDNUM1',pic:''},{av:'AV207PrdNum2',fld:'vPRDNUM2',pic:''},{av:'AV9LoteBusqueda',fld:'vLOTEBUSQUEDA',pic:''},{av:'AV10CalStkIni',fld:'vCALSTKINI',pic:'9'}]");
      setEventMetadata("GRID_PREVPAGE",",oparms:[{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtavPrdnum_Visible',ctrl:'vPRDNUM',prop:'Visible'},{av:'edtavPrdnom_Visible',ctrl:'vPRDNOM',prop:'Visible'},{av:'edtavLote_Visible',ctrl:'vLOTE',prop:'Visible'},{av:'edtavPrdfabnm_Visible',ctrl:'vPRDFABNM',prop:'Visible'},{av:'edtavPrdnomgrid_Visible',ctrl:'vPRDNOMGRID',prop:'Visible'},{av:'edtavCantc_Visible',ctrl:'vCANTC',prop:'Visible'},{av:'edtavCantcm_Visible',ctrl:'vCANTCM',prop:'Visible'},{av:'edtavStockinicial_Visible',ctrl:'vSTOCKINICIAL',prop:'Visible'},{av:'edtavStockfinal_Visible',ctrl:'vSTOCKFINAL',prop:'Visible'},{av:'AV26ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV16GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'edtavStockinicial_Title',ctrl:'vSTOCKINICIAL',prop:'Title'},{av:'AV68Fec1',fld:'vFEC1',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A12453HreFecAct',fld:'HREFECACT',pic:''},{av:'AV145Prdnumi',fld:'vPRDNUMI',pic:'',hsh:true},{av:'AV143PrdNumf',fld:'vPRDNUMF',pic:'',hsh:true},{av:'AV70Fec2',fld:'vFEC2',pic:'',hsh:true},{av:'A4558HrePrdNum',fld:'HREPRDNUM',pic:''},{av:'A4563HrePrdCant',fld:'HREPRDCANT',pic:'ZZZZZZ9.999'},{av:'A5726HreLote',fld:'HRELOTE',pic:''},{av:'A862CumConFec',fld:'CUMCONFEC',pic:''},{av:'AV54Contval',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'A860CumConCant',fld:'CUMCONCANT',pic:'ZZZZZZ9.9999'},{av:'A5862CumConLot',fld:'CUMCONLOT',pic:''},{av:'A3348CCStkFec',fld:'CCSTKFEC',pic:''},{av:'A3345TipMovCc',fld:'TIPMOVCC',pic:''},{av:'A3357CCStkDsc',fld:'CCSTKDSC',pic:''},{av:'A3344CCStkCanS',fld:'CCSTKCANS',pic:'ZZZZZZ9.9999'},{av:'A5722CCStkLot',fld:'CCSTKLOT',pic:''},{av:'A415EntFecEnt',fld:'ENTFECENT',pic:''},{av:'A11Albaran',fld:'ALBARAN',pic:''},{av:'A418EntUniEnt',fld:'ENTUNIENT',pic:'ZZZZZ9.99'},{av:'A5686EntLotN',fld:'ENTLOTN',pic:''},{av:'AV7PrdnumIN',fld:'vPRDNUMIN',pic:'',hsh:true},{av:'AV115Lote2',fld:'vLOTE2',pic:'',hsh:true},{av:'AV43CantC',fld:'vCANTC',pic:'ZZZZZZ9.999',hsh:true},{av:'AV44CantCm',fld:'vCANTCM',pic:'ZZZZZZ9.99',hsh:true},{av:'AV153q',fld:'vQ',pic:'ZZZ9',hsh:true},{av:'AV19PrdNum',fld:'vPRDNUM',pic:'',hsh:true},{av:'AV114Lote',fld:'vLOTE',pic:'',hsh:true},{av:'A11707HreProv',fld:'HREPROV',pic:'ZZZZZ9'},{av:'A12718HreFabId',fld:'HREFABID',pic:'ZZZZZ9'},{av:'AV148Proprv',fld:'vPROPRV',pic:'9',hsh:true},{av:'A6156EntPrvNum',fld:'ENTPRVNUM',pic:'ZZZZZ9'},{av:'A12716EntFabId',fld:'ENTFABID',pic:'ZZZZZ9'},{av:'A658PedCod',fld:'PEDCOD',pic:'ZZZZZZZ9'},{av:'AV152PrvNum2',fld:'vPRVNUM2',pic:'ZZZZZ9',hsh:true},{av:'AV138PrdFabId',fld:'vPRDFABID',pic:'ZZZZZ9',hsh:true},{av:'AV83HreLote',fld:'vHRELOTE',pic:'',hsh:true},{av:'AV39Cant',fld:'vCANT',pic:'ZZZZZZ9.999',hsh:true},{av:'AV172z',fld:'vZ',pic:'ZZZZZZ9.99',hsh:true},{av:'AV133pedcod',fld:'vPEDCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A795PrvNum',fld:'PRVNUM',pic:'ZZZZZ9'},{av:'A12714PrdFabId',fld:'PRDFABID',pic:'ZZZZZ9'},{av:'sPrefix'},{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV221Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV209OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV210OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV18FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV33EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5Fecha',fld:'vFECHA',pic:''},{av:'AV6Fecha_to',fld:'vFECHA_TO',pic:''},{av:'AV206Prdnum1',fld:'vPRDNUM1',pic:''},{av:'AV207PrdNum2',fld:'vPRDNUM2',pic:''},{av:'AV9LoteBusqueda',fld:'vLOTEBUSQUEDA',pic:''},{av:'AV10CalStkIni',fld:'vCALSTKINI',pic:'9'}]");
      setEventMetadata("GRID_NEXTPAGE",",oparms:[{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtavPrdnum_Visible',ctrl:'vPRDNUM',prop:'Visible'},{av:'edtavPrdnom_Visible',ctrl:'vPRDNOM',prop:'Visible'},{av:'edtavLote_Visible',ctrl:'vLOTE',prop:'Visible'},{av:'edtavPrdfabnm_Visible',ctrl:'vPRDFABNM',prop:'Visible'},{av:'edtavPrdnomgrid_Visible',ctrl:'vPRDNOMGRID',prop:'Visible'},{av:'edtavCantc_Visible',ctrl:'vCANTC',prop:'Visible'},{av:'edtavCantcm_Visible',ctrl:'vCANTCM',prop:'Visible'},{av:'edtavStockinicial_Visible',ctrl:'vSTOCKINICIAL',prop:'Visible'},{av:'edtavStockfinal_Visible',ctrl:'vSTOCKFINAL',prop:'Visible'},{av:'AV26ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV16GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'edtavStockinicial_Title',ctrl:'vSTOCKINICIAL',prop:'Title'},{av:'AV68Fec1',fld:'vFEC1',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A12453HreFecAct',fld:'HREFECACT',pic:''},{av:'AV145Prdnumi',fld:'vPRDNUMI',pic:'',hsh:true},{av:'AV143PrdNumf',fld:'vPRDNUMF',pic:'',hsh:true},{av:'AV70Fec2',fld:'vFEC2',pic:'',hsh:true},{av:'A4558HrePrdNum',fld:'HREPRDNUM',pic:''},{av:'A4563HrePrdCant',fld:'HREPRDCANT',pic:'ZZZZZZ9.999'},{av:'A5726HreLote',fld:'HRELOTE',pic:''},{av:'A862CumConFec',fld:'CUMCONFEC',pic:''},{av:'AV54Contval',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'A860CumConCant',fld:'CUMCONCANT',pic:'ZZZZZZ9.9999'},{av:'A5862CumConLot',fld:'CUMCONLOT',pic:''},{av:'A3348CCStkFec',fld:'CCSTKFEC',pic:''},{av:'A3345TipMovCc',fld:'TIPMOVCC',pic:''},{av:'A3357CCStkDsc',fld:'CCSTKDSC',pic:''},{av:'A3344CCStkCanS',fld:'CCSTKCANS',pic:'ZZZZZZ9.9999'},{av:'A5722CCStkLot',fld:'CCSTKLOT',pic:''},{av:'A415EntFecEnt',fld:'ENTFECENT',pic:''},{av:'A11Albaran',fld:'ALBARAN',pic:''},{av:'A418EntUniEnt',fld:'ENTUNIENT',pic:'ZZZZZ9.99'},{av:'A5686EntLotN',fld:'ENTLOTN',pic:''},{av:'AV7PrdnumIN',fld:'vPRDNUMIN',pic:'',hsh:true},{av:'AV115Lote2',fld:'vLOTE2',pic:'',hsh:true},{av:'AV43CantC',fld:'vCANTC',pic:'ZZZZZZ9.999',hsh:true},{av:'AV44CantCm',fld:'vCANTCM',pic:'ZZZZZZ9.99',hsh:true},{av:'AV153q',fld:'vQ',pic:'ZZZ9',hsh:true},{av:'AV19PrdNum',fld:'vPRDNUM',pic:'',hsh:true},{av:'AV114Lote',fld:'vLOTE',pic:'',hsh:true},{av:'A11707HreProv',fld:'HREPROV',pic:'ZZZZZ9'},{av:'A12718HreFabId',fld:'HREFABID',pic:'ZZZZZ9'},{av:'AV148Proprv',fld:'vPROPRV',pic:'9',hsh:true},{av:'A6156EntPrvNum',fld:'ENTPRVNUM',pic:'ZZZZZ9'},{av:'A12716EntFabId',fld:'ENTFABID',pic:'ZZZZZ9'},{av:'A658PedCod',fld:'PEDCOD',pic:'ZZZZZZZ9'},{av:'AV152PrvNum2',fld:'vPRVNUM2',pic:'ZZZZZ9',hsh:true},{av:'AV138PrdFabId',fld:'vPRDFABID',pic:'ZZZZZ9',hsh:true},{av:'AV83HreLote',fld:'vHRELOTE',pic:'',hsh:true},{av:'AV39Cant',fld:'vCANT',pic:'ZZZZZZ9.999',hsh:true},{av:'AV172z',fld:'vZ',pic:'ZZZZZZ9.99',hsh:true},{av:'AV133pedcod',fld:'vPEDCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A795PrvNum',fld:'PRVNUM',pic:'ZZZZZ9'},{av:'A12714PrdFabId',fld:'PRDFABID',pic:'ZZZZZ9'},{av:'sPrefix'},{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV221Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV209OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV210OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV18FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV33EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5Fecha',fld:'vFECHA',pic:''},{av:'AV6Fecha_to',fld:'vFECHA_TO',pic:''},{av:'AV206Prdnum1',fld:'vPRDNUM1',pic:''},{av:'AV207PrdNum2',fld:'vPRDNUM2',pic:''},{av:'AV9LoteBusqueda',fld:'vLOTEBUSQUEDA',pic:''},{av:'AV10CalStkIni',fld:'vCALSTKINI',pic:'9'}]");
      setEventMetadata("GRID_LASTPAGE",",oparms:[{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtavPrdnum_Visible',ctrl:'vPRDNUM',prop:'Visible'},{av:'edtavPrdnom_Visible',ctrl:'vPRDNOM',prop:'Visible'},{av:'edtavLote_Visible',ctrl:'vLOTE',prop:'Visible'},{av:'edtavPrdfabnm_Visible',ctrl:'vPRDFABNM',prop:'Visible'},{av:'edtavPrdnomgrid_Visible',ctrl:'vPRDNOMGRID',prop:'Visible'},{av:'edtavCantc_Visible',ctrl:'vCANTC',prop:'Visible'},{av:'edtavCantcm_Visible',ctrl:'vCANTCM',prop:'Visible'},{av:'edtavStockinicial_Visible',ctrl:'vSTOCKINICIAL',prop:'Visible'},{av:'edtavStockfinal_Visible',ctrl:'vSTOCKFINAL',prop:'Visible'},{av:'AV26ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV16GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("VALIDV_PRDNUM","{handler:'validv_Prdnum',iparms:[]");
      setEventMetadata("VALIDV_PRDNUM",",oparms:[]}");
      setEventMetadata("VALIDV_LOTE","{handler:'validv_Lote',iparms:[]");
      setEventMetadata("VALIDV_LOTE",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Stockfinal',iparms:[]");
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
      wcpOAV33EmprCod = "" ;
      wcpOAV5Fecha = GXutil.nullDate() ;
      wcpOAV6Fecha_to = GXutil.nullDate() ;
      wcpOAV206Prdnum1 = "" ;
      wcpOAV207PrdNum2 = "" ;
      wcpOAV9LoteBusqueda = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV33EmprCod = "" ;
      AV5Fecha = GXutil.nullDate() ;
      AV6Fecha_to = GXutil.nullDate() ;
      AV206Prdnum1 = "" ;
      AV207PrdNum2 = "" ;
      AV9LoteBusqueda = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV221Pgmname = "" ;
      AV18FilterFullText = "" ;
      AV68Fec1 = GXutil.nullDate() ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      A12453HreFecAct = GXutil.nullDate() ;
      AV145Prdnumi = "" ;
      AV143PrdNumf = "" ;
      AV70Fec2 = GXutil.nullDate() ;
      A4558HrePrdNum = "" ;
      A4563HrePrdCant = DecimalUtil.ZERO ;
      A5726HreLote = "" ;
      A862CumConFec = GXutil.nullDate() ;
      A860CumConCant = DecimalUtil.ZERO ;
      A5862CumConLot = "" ;
      A3348CCStkFec = GXutil.nullDate() ;
      A3345TipMovCc = "" ;
      A3357CCStkDsc = "" ;
      A3344CCStkCanS = DecimalUtil.ZERO ;
      A5722CCStkLot = "" ;
      A415EntFecEnt = GXutil.nullDate() ;
      A11Albaran = "" ;
      A418EntUniEnt = DecimalUtil.ZERO ;
      A5686EntLotN = "" ;
      AV7PrdnumIN = "" ;
      AV115Lote2 = "" ;
      AV43CantC = DecimalUtil.ZERO ;
      AV44CantCm = DecimalUtil.ZERO ;
      AV19PrdNum = "" ;
      AV114Lote = "" ;
      AV83HreLote = "" ;
      AV39Cant = DecimalUtil.ZERO ;
      AV172z = DecimalUtil.ZERO ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV26ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV29DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV180Tab_prd = new String[10000] ;
      GX_I = 1 ;
      while ( GX_I <= 10000 )
      {
         AV180Tab_prd[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV179Tab_ltecn = new String[10000] ;
      GX_I = 1 ;
      while ( GX_I <= 10000 )
      {
         AV179Tab_ltecn[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV176Tab_cntcn = new java.math.BigDecimal[10000] ;
      GX_I = 1 ;
      while ( GX_I <= 10000 )
      {
         AV176Tab_cntcn[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV181tab_prdcm = new String[10000] ;
      GX_I = 1 ;
      while ( GX_I <= 10000 )
      {
         AV181tab_prdcm[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV178Tab_ltecm = new String[10000] ;
      GX_I = 1 ;
      while ( GX_I <= 10000 )
      {
         AV178Tab_ltecm[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV175Tab_cntcm = new java.math.BigDecimal[10000] ;
      GX_I = 1 ;
      while ( GX_I <= 10000 )
      {
         AV175Tab_cntcm[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV182Tab_prod = new String[10000] ;
      GX_I = 1 ;
      while ( GX_I <= 10000 )
      {
         AV182Tab_prod[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV177Tab_lote = new String[10000] ;
      GX_I = 1 ;
      while ( GX_I <= 10000 )
      {
         AV177Tab_lote[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV173Tab_cnt1 = new java.math.BigDecimal[10000] ;
      GX_I = 1 ;
      while ( GX_I <= 10000 )
      {
         AV173Tab_cnt1[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV174Tab_cnt2 = new java.math.BigDecimal[10000] ;
      GX_I = 1 ;
      while ( GX_I <= 10000 )
      {
         AV174Tab_cnt2[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV16GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ucProgressbar = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      WebComp_Grid_dwc_Component = "" ;
      OldGrid_dwc = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV208DetailWebComponent = "" ;
      AV20PrdNom = "" ;
      AV139PrdFabNm = "" ;
      AV141PrdNomgrid = "" ;
      AV157StockInicial = DecimalUtil.ZERO ;
      AV156Stockfinal = DecimalUtil.ZERO ;
      GXCCtl = "" ;
      AV213contdsc = "" ;
      GXv_int1 = new byte[1] ;
      AV190Dia = "" ;
      AV191DiaActual = "" ;
      AV192DiaFinMes = GXutil.nullDate() ;
      AV194DiaIniMesActual = GXutil.nullDate() ;
      AV193DiaFinMesActual = GXutil.nullDate() ;
      AV217Station = "" ;
      AV218Emprnom = "" ;
      AV219Usurcod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV12WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext10 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV25Session = httpContext.getWebSession();
      AV21ColumnsSelectorXML = "" ;
      AV204ProgressIndicator = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      AV65Entradas = DecimalUtil.ZERO ;
      AV154salidas = DecimalUtil.ZERO ;
      GXv_date11 = new java.util.Date[1] ;
      GXv_char2 = new String[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      Gx_msg = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV27ManageFiltersXml = "" ;
      AV22UserCustomValue = "" ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector13 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector14 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item15 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item16 = new GXBaseCollection[1] ;
      AV17GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXv_SdtWWPGridState17 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      scmdbuf = "" ;
      H014F2_A4492HreBarCod = new int[1] ;
      H014F2_A4493HreBarReo = new byte[1] ;
      H014F2_A4494HreBarPar = new String[] {""} ;
      H014F2_A4495HreNumCie = new byte[1] ;
      H014F2_A4545HreLinMaq = new short[1] ;
      H014F2_A4550HreLinPro = new byte[1] ;
      H014F2_A4557HreRecLin = new short[1] ;
      H014F2_A396EmprCod = new String[] {""} ;
      H014F2_A12453HreFecAct = new java.util.Date[] {GXutil.nullDate()} ;
      H014F2_n12453HreFecAct = new boolean[] {false} ;
      H014F2_A719PrdNum = new String[] {""} ;
      H014F2_n719PrdNum = new boolean[] {false} ;
      H014F2_A4558HrePrdNum = new String[] {""} ;
      H014F2_n4558HrePrdNum = new boolean[] {false} ;
      H014F2_A4563HrePrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H014F2_n4563HrePrdCant = new boolean[] {false} ;
      H014F2_A5726HreLote = new String[] {""} ;
      H014F2_n5726HreLote = new boolean[] {false} ;
      H014F3_A859CumCodCont = new int[1] ;
      H014F3_A396EmprCod = new String[] {""} ;
      H014F3_A862CumConFec = new java.util.Date[] {GXutil.nullDate()} ;
      H014F3_A719PrdNum = new String[] {""} ;
      H014F3_n719PrdNum = new boolean[] {false} ;
      H014F3_A860CumConCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H014F3_A5862CumConLot = new String[] {""} ;
      H014F4_A3342CCStkLin = new long[1] ;
      H014F4_A396EmprCod = new String[] {""} ;
      H014F4_A3345TipMovCc = new String[] {""} ;
      H014F4_A3357CCStkDsc = new String[] {""} ;
      H014F4_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      H014F4_A719PrdNum = new String[] {""} ;
      H014F4_n719PrdNum = new boolean[] {false} ;
      H014F4_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H014F4_A5722CCStkLot = new String[] {""} ;
      H014F5_A597LinEnt = new short[1] ;
      H014F5_A11Albaran = new String[] {""} ;
      H014F5_A415EntFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      H014F5_A719PrdNum = new String[] {""} ;
      H014F5_n719PrdNum = new boolean[] {false} ;
      H014F5_A396EmprCod = new String[] {""} ;
      H014F5_A418EntUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H014F5_A5686EntLotN = new String[] {""} ;
      H014F6_A4492HreBarCod = new int[1] ;
      H014F6_A4493HreBarReo = new byte[1] ;
      H014F6_A4494HreBarPar = new String[] {""} ;
      H014F6_A4495HreNumCie = new byte[1] ;
      H014F6_A4545HreLinMaq = new short[1] ;
      H014F6_A4550HreLinPro = new byte[1] ;
      H014F6_A4557HreRecLin = new short[1] ;
      H014F6_A396EmprCod = new String[] {""} ;
      H014F6_A719PrdNum = new String[] {""} ;
      H014F6_n719PrdNum = new boolean[] {false} ;
      H014F6_A5726HreLote = new String[] {""} ;
      H014F6_n5726HreLote = new boolean[] {false} ;
      H014F6_A12453HreFecAct = new java.util.Date[] {GXutil.nullDate()} ;
      H014F6_n12453HreFecAct = new boolean[] {false} ;
      H014F6_A11707HreProv = new int[1] ;
      H014F6_n11707HreProv = new boolean[] {false} ;
      H014F6_A12718HreFabId = new int[1] ;
      H014F6_n12718HreFabId = new boolean[] {false} ;
      H014F7_A597LinEnt = new short[1] ;
      H014F7_A396EmprCod = new String[] {""} ;
      H014F7_A719PrdNum = new String[] {""} ;
      H014F7_n719PrdNum = new boolean[] {false} ;
      H014F7_A5686EntLotN = new String[] {""} ;
      H014F7_A415EntFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      H014F7_A6156EntPrvNum = new int[1] ;
      H014F7_n6156EntPrvNum = new boolean[] {false} ;
      H014F7_A12716EntFabId = new int[1] ;
      H014F7_A658PedCod = new int[1] ;
      H014F7_n658PedCod = new boolean[] {false} ;
      GXt_char7 = "" ;
      GXv_char5 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_char3 = new String[1] ;
      H014F8_A719PrdNum = new String[] {""} ;
      H014F8_n719PrdNum = new boolean[] {false} ;
      H014F8_A658PedCod = new int[1] ;
      H014F8_n658PedCod = new boolean[] {false} ;
      H014F8_A396EmprCod = new String[] {""} ;
      H014F8_A795PrvNum = new int[1] ;
      H014F8_A12714PrdFabId = new int[1] ;
      H014F8_n12714PrdFabId = new boolean[] {false} ;
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV33EmprCod = "" ;
      sCtrlAV5Fecha = "" ;
      sCtrlAV6Fecha_to = "" ;
      sCtrlAV206Prdnum1 = "" ;
      sCtrlAV207PrdNum2 = "" ;
      sCtrlAV9LoteBusqueda = "" ;
      sCtrlAV10CalStkIni = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcwuti118__default(),
         new Object[] {
             new Object[] {
            H014F2_A4492HreBarCod, H014F2_A4493HreBarReo, H014F2_A4494HreBarPar, H014F2_A4495HreNumCie, H014F2_A4545HreLinMaq, H014F2_A4550HreLinPro, H014F2_A4557HreRecLin, H014F2_A396EmprCod, H014F2_A12453HreFecAct, H014F2_n12453HreFecAct,
            H014F2_A719PrdNum, H014F2_n719PrdNum, H014F2_A4558HrePrdNum, H014F2_n4558HrePrdNum, H014F2_A4563HrePrdCant, H014F2_n4563HrePrdCant, H014F2_A5726HreLote, H014F2_n5726HreLote
            }
            , new Object[] {
            H014F3_A859CumCodCont, H014F3_A396EmprCod, H014F3_A862CumConFec, H014F3_A719PrdNum, H014F3_A860CumConCant, H014F3_A5862CumConLot
            }
            , new Object[] {
            H014F4_A3342CCStkLin, H014F4_A396EmprCod, H014F4_A3345TipMovCc, H014F4_A3357CCStkDsc, H014F4_A3348CCStkFec, H014F4_A719PrdNum, H014F4_A3344CCStkCanS, H014F4_A5722CCStkLot
            }
            , new Object[] {
            H014F5_A597LinEnt, H014F5_A11Albaran, H014F5_A415EntFecEnt, H014F5_A719PrdNum, H014F5_A396EmprCod, H014F5_A418EntUniEnt, H014F5_A5686EntLotN
            }
            , new Object[] {
            H014F6_A4492HreBarCod, H014F6_A4493HreBarReo, H014F6_A4494HreBarPar, H014F6_A4495HreNumCie, H014F6_A4545HreLinMaq, H014F6_A4550HreLinPro, H014F6_A4557HreRecLin, H014F6_A396EmprCod, H014F6_A719PrdNum, H014F6_n719PrdNum,
            H014F6_A5726HreLote, H014F6_n5726HreLote, H014F6_A12453HreFecAct, H014F6_n12453HreFecAct, H014F6_A11707HreProv, H014F6_n11707HreProv, H014F6_A12718HreFabId, H014F6_n12718HreFabId
            }
            , new Object[] {
            H014F7_A597LinEnt, H014F7_A396EmprCod, H014F7_A719PrdNum, H014F7_A5686EntLotN, H014F7_A415EntFecEnt, H014F7_A6156EntPrvNum, H014F7_n6156EntPrvNum, H014F7_A12716EntFabId, H014F7_A658PedCod, H014F7_n658PedCod
            }
            , new Object[] {
            H014F8_A719PrdNum, H014F8_A658PedCod, H014F8_A396EmprCod, H014F8_A795PrvNum, H014F8_A12714PrdFabId, H014F8_n12714PrdFabId
            }
         }
      );
      AV221Pgmname = "WCWUti118" ;
      /* GeneXus formulas. */
      AV221Pgmname = "WCWUti118" ;
      Gx_err = (short)(0) ;
      edtavDetailwebcomponent_Enabled = 0 ;
      edtavPrdnum_Enabled = 0 ;
      edtavPrdnom_Enabled = 0 ;
      edtavLote_Enabled = 0 ;
      edtavPrdfabnm_Enabled = 0 ;
      edtavPrdnomgrid_Enabled = 0 ;
      edtavCantc_Enabled = 0 ;
      edtavCantcm_Enabled = 0 ;
      edtavStockinicial_Enabled = 0 ;
      edtavStockfinal_Enabled = 0 ;
      WebComp_Grid_dwc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte wcpOAV10CalStkIni ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV10CalStkIni ;
   private byte AV28ManageFiltersExecutionStep ;
   private byte AV148Proprv ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXt_int6 ;
   private byte GXv_int1[] ;
   private byte AV195Mes ;
   private byte AV196MesAnt ;
   private byte AV75FlagLote ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
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
   private short AV209OrderedBy ;
   private short AV153q ;
   private short wbEnd ;
   private short wbStart ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV212ConMan ;
   private short AV214Lotes ;
   private short AV188Anyo ;
   private short AV189AnyoANt ;
   private short AV203x ;
   private short AV89i ;
   private int nRC_GXsfl_45 ;
   private int subGrid_Rows ;
   private int nGXsfl_45_idx=1 ;
   private int AV54Contval ;
   private int A11707HreProv ;
   private int A12718HreFabId ;
   private int A6156EntPrvNum ;
   private int A12716EntFabId ;
   private int A658PedCod ;
   private int AV152PrvNum2 ;
   private int AV138PrdFabId ;
   private int AV133pedcod ;
   private int A795PrvNum ;
   private int A12714PrdFabId ;
   private int subGrid_Islastpage ;
   private int edtavDetailwebcomponent_Enabled ;
   private int edtavPrdnum_Enabled ;
   private int edtavPrdnom_Enabled ;
   private int edtavLote_Enabled ;
   private int edtavPrdfabnm_Enabled ;
   private int edtavPrdnomgrid_Enabled ;
   private int edtavCantc_Enabled ;
   private int edtavCantcm_Enabled ;
   private int edtavStockinicial_Enabled ;
   private int edtavStockfinal_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int subGrid_Recordcount ;
   private int edtavPrdnum_Visible ;
   private int edtavPrdnom_Visible ;
   private int edtavLote_Visible ;
   private int edtavPrdfabnm_Visible ;
   private int edtavPrdnomgrid_Visible ;
   private int edtavCantc_Visible ;
   private int edtavCantcm_Visible ;
   private int edtavStockinicial_Visible ;
   private int edtavStockfinal_Visible ;
   private int GX_I ;
   private int AV222GXV1 ;
   private int A859CumCodCont ;
   private int GXv_int4[] ;
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
   private long GRID_nCurrentRecord ;
   private java.math.BigDecimal A4563HrePrdCant ;
   private java.math.BigDecimal A860CumConCant ;
   private java.math.BigDecimal A3344CCStkCanS ;
   private java.math.BigDecimal A418EntUniEnt ;
   private java.math.BigDecimal AV43CantC ;
   private java.math.BigDecimal AV44CantCm ;
   private java.math.BigDecimal AV39Cant ;
   private java.math.BigDecimal AV172z ;
   private java.math.BigDecimal AV176Tab_cntcn[] ;
   private java.math.BigDecimal AV175Tab_cntcm[] ;
   private java.math.BigDecimal AV173Tab_cnt1[] ;
   private java.math.BigDecimal AV174Tab_cnt2[] ;
   private java.math.BigDecimal AV157StockInicial ;
   private java.math.BigDecimal AV156Stockfinal ;
   private java.math.BigDecimal AV65Entradas ;
   private java.math.BigDecimal AV154salidas ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private String wcpOAV33EmprCod ;
   private String wcpOAV206Prdnum1 ;
   private String wcpOAV207PrdNum2 ;
   private String wcpOAV9LoteBusqueda ;
   private String edtavStockinicial_Title ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV33EmprCod ;
   private String AV206Prdnum1 ;
   private String AV207PrdNum2 ;
   private String AV9LoteBusqueda ;
   private String sGXsfl_45_idx="0001" ;
   private String edtavStockinicial_Internalname ;
   private String AV221Pgmname ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String AV145Prdnumi ;
   private String AV143PrdNumf ;
   private String A4558HrePrdNum ;
   private String A5726HreLote ;
   private String A5862CumConLot ;
   private String A3345TipMovCc ;
   private String A3357CCStkDsc ;
   private String A5722CCStkLot ;
   private String A11Albaran ;
   private String A5686EntLotN ;
   private String AV7PrdnumIN ;
   private String AV115Lote2 ;
   private String AV19PrdNum ;
   private String AV114Lote ;
   private String AV83HreLote ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV180Tab_prd[] ;
   private String AV179Tab_ltecn[] ;
   private String AV181tab_prdcm[] ;
   private String AV178Tab_ltecm[] ;
   private String AV182Tab_prod[] ;
   private String AV177Tab_lote[] ;
   private String Ddo_managefilters_Icontype ;
   private String Ddo_managefilters_Icon ;
   private String Ddo_managefilters_Tooltip ;
   private String Ddo_managefilters_Cls ;
   private String Dvpanel_tableheader_Width ;
   private String Dvpanel_tableheader_Cls ;
   private String Dvpanel_tableheader_Title ;
   private String Dvpanel_tableheader_Iconposition ;
   private String Ddo_grid_Caption ;
   private String Ddo_grid_Gridinternalname ;
   private String Ddo_grid_Columnids ;
   private String Ddo_grid_Columnssortvalues ;
   private String Ddo_grid_Includesortasc ;
   private String Ddo_grid_Fixable ;
   private String Ddo_grid_Sortedstatus ;
   private String Ddo_gridcolumnsselector_Caption ;
   private String Ddo_gridcolumnsselector_Tooltip ;
   private String Ddo_gridcolumnsselector_Cls ;
   private String Ddo_gridcolumnsselector_Dropdownoptionstype ;
   private String Ddo_gridcolumnsselector_Gridinternalname ;
   private String Ddo_gridcolumnsselector_Titlecontrolidtoreplace ;
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Infinitescrolling ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String Progressbar_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divTableactions_Internalname ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtnexportcsv_Internalname ;
   private String bttBtnexportcsv_Jsonclick ;
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String divGridtablewithtotalizers_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String divCell_grid_dwc_Internalname ;
   private String divCell_grid_dwc_Class ;
   private String WebComp_Grid_dwc_Component ;
   private String OldGrid_dwc ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavDetailwebcomponent_Internalname ;
   private String AV208DetailWebComponent ;
   private String edtavPrdnum_Internalname ;
   private String AV20PrdNom ;
   private String edtavPrdnom_Internalname ;
   private String edtavLote_Internalname ;
   private String AV139PrdFabNm ;
   private String edtavPrdfabnm_Internalname ;
   private String AV141PrdNomgrid ;
   private String edtavPrdnomgrid_Internalname ;
   private String edtavCantc_Internalname ;
   private String edtavCantcm_Internalname ;
   private String edtavStockfinal_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String GXCCtl ;
   private String AV213contdsc ;
   private String AV190Dia ;
   private String AV191DiaActual ;
   private String AV217Station ;
   private String AV218Emprnom ;
   private String AV219Usurcod ;
   private String GXv_char2[] ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String GXt_char7 ;
   private String GXv_char5[] ;
   private String GXv_char3[] ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV33EmprCod ;
   private String sCtrlAV5Fecha ;
   private String sCtrlAV6Fecha_to ;
   private String sCtrlAV206Prdnum1 ;
   private String sCtrlAV207PrdNum2 ;
   private String sCtrlAV9LoteBusqueda ;
   private String sCtrlAV10CalStkIni ;
   private String sGXsfl_45_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavDetailwebcomponent_Jsonclick ;
   private String edtavPrdnum_Jsonclick ;
   private String edtavPrdnom_Jsonclick ;
   private String edtavLote_Jsonclick ;
   private String edtavPrdfabnm_Jsonclick ;
   private String edtavPrdnomgrid_Jsonclick ;
   private String edtavCantc_Jsonclick ;
   private String edtavCantcm_Jsonclick ;
   private String edtavStockinicial_Jsonclick ;
   private String edtavStockfinal_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV5Fecha ;
   private java.util.Date wcpOAV6Fecha_to ;
   private java.util.Date AV5Fecha ;
   private java.util.Date AV6Fecha_to ;
   private java.util.Date AV68Fec1 ;
   private java.util.Date A12453HreFecAct ;
   private java.util.Date AV70Fec2 ;
   private java.util.Date A862CumConFec ;
   private java.util.Date A3348CCStkFec ;
   private java.util.Date A415EntFecEnt ;
   private java.util.Date AV192DiaFinMes ;
   private java.util.Date AV194DiaIniMesActual ;
   private java.util.Date AV193DiaFinMesActual ;
   private java.util.Date GXv_date11[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean bGXsfl_45_Refreshing=false ;
   private boolean AV210OrderedDsc ;
   private boolean n719PrdNum ;
   private boolean n12453HreFecAct ;
   private boolean n4558HrePrdNum ;
   private boolean n4563HrePrdCant ;
   private boolean n5726HreLote ;
   private boolean n11707HreProv ;
   private boolean n12718HreFabId ;
   private boolean n6156EntPrvNum ;
   private boolean n658PedCod ;
   private boolean n12714PrdFabId ;
   private boolean Dvpanel_tableheader_Autowidth ;
   private boolean Dvpanel_tableheader_Autoheight ;
   private boolean Dvpanel_tableheader_Collapsible ;
   private boolean Dvpanel_tableheader_Collapsed ;
   private boolean Dvpanel_tableheader_Showcollapseicon ;
   private boolean Dvpanel_tableheader_Autoscroll ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean Grid_empowerer_Hascolumnsselector ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV21ColumnsSelectorXML ;
   private String AV27ManageFiltersXml ;
   private String AV22UserCustomValue ;
   private String AV18FilterFullText ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Grid_dwc ;
   private com.genexus.webpanels.WebSession AV25Session ;
   private com.genexus.webpanels.GXUserControl ucProgressbar ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV204ProgressIndicator ;
   private IDataStoreProvider pr_default ;
   private int[] H014F2_A4492HreBarCod ;
   private byte[] H014F2_A4493HreBarReo ;
   private String[] H014F2_A4494HreBarPar ;
   private byte[] H014F2_A4495HreNumCie ;
   private short[] H014F2_A4545HreLinMaq ;
   private byte[] H014F2_A4550HreLinPro ;
   private short[] H014F2_A4557HreRecLin ;
   private String[] H014F2_A396EmprCod ;
   private java.util.Date[] H014F2_A12453HreFecAct ;
   private boolean[] H014F2_n12453HreFecAct ;
   private String[] H014F2_A719PrdNum ;
   private boolean[] H014F2_n719PrdNum ;
   private String[] H014F2_A4558HrePrdNum ;
   private boolean[] H014F2_n4558HrePrdNum ;
   private java.math.BigDecimal[] H014F2_A4563HrePrdCant ;
   private boolean[] H014F2_n4563HrePrdCant ;
   private String[] H014F2_A5726HreLote ;
   private boolean[] H014F2_n5726HreLote ;
   private int[] H014F3_A859CumCodCont ;
   private String[] H014F3_A396EmprCod ;
   private java.util.Date[] H014F3_A862CumConFec ;
   private String[] H014F3_A719PrdNum ;
   private boolean[] H014F3_n719PrdNum ;
   private java.math.BigDecimal[] H014F3_A860CumConCant ;
   private String[] H014F3_A5862CumConLot ;
   private long[] H014F4_A3342CCStkLin ;
   private String[] H014F4_A396EmprCod ;
   private String[] H014F4_A3345TipMovCc ;
   private String[] H014F4_A3357CCStkDsc ;
   private java.util.Date[] H014F4_A3348CCStkFec ;
   private String[] H014F4_A719PrdNum ;
   private boolean[] H014F4_n719PrdNum ;
   private java.math.BigDecimal[] H014F4_A3344CCStkCanS ;
   private String[] H014F4_A5722CCStkLot ;
   private short[] H014F5_A597LinEnt ;
   private String[] H014F5_A11Albaran ;
   private java.util.Date[] H014F5_A415EntFecEnt ;
   private String[] H014F5_A719PrdNum ;
   private boolean[] H014F5_n719PrdNum ;
   private String[] H014F5_A396EmprCod ;
   private java.math.BigDecimal[] H014F5_A418EntUniEnt ;
   private String[] H014F5_A5686EntLotN ;
   private int[] H014F6_A4492HreBarCod ;
   private byte[] H014F6_A4493HreBarReo ;
   private String[] H014F6_A4494HreBarPar ;
   private byte[] H014F6_A4495HreNumCie ;
   private short[] H014F6_A4545HreLinMaq ;
   private byte[] H014F6_A4550HreLinPro ;
   private short[] H014F6_A4557HreRecLin ;
   private String[] H014F6_A396EmprCod ;
   private String[] H014F6_A719PrdNum ;
   private boolean[] H014F6_n719PrdNum ;
   private String[] H014F6_A5726HreLote ;
   private boolean[] H014F6_n5726HreLote ;
   private java.util.Date[] H014F6_A12453HreFecAct ;
   private boolean[] H014F6_n12453HreFecAct ;
   private int[] H014F6_A11707HreProv ;
   private boolean[] H014F6_n11707HreProv ;
   private int[] H014F6_A12718HreFabId ;
   private boolean[] H014F6_n12718HreFabId ;
   private short[] H014F7_A597LinEnt ;
   private String[] H014F7_A396EmprCod ;
   private String[] H014F7_A719PrdNum ;
   private boolean[] H014F7_n719PrdNum ;
   private String[] H014F7_A5686EntLotN ;
   private java.util.Date[] H014F7_A415EntFecEnt ;
   private int[] H014F7_A6156EntPrvNum ;
   private boolean[] H014F7_n6156EntPrvNum ;
   private int[] H014F7_A12716EntFabId ;
   private int[] H014F7_A658PedCod ;
   private boolean[] H014F7_n658PedCod ;
   private String[] H014F8_A719PrdNum ;
   private boolean[] H014F8_n719PrdNum ;
   private int[] H014F8_A658PedCod ;
   private boolean[] H014F8_n658PedCod ;
   private String[] H014F8_A396EmprCod ;
   private int[] H014F8_A795PrvNum ;
   private int[] H014F8_A12714PrdFabId ;
   private boolean[] H014F8_n12714PrdFabId ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV26ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item15 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item16[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV23ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV24ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector13[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector14[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV29DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV16GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState17[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV17GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPContext AV12WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext10[] ;
}

final  class wcwuti118__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H014F2", "SELECT HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro, HreRecLin, EmprCod, HreFecAct, PrdNum, HrePrdNum, HrePrdCant, HreLote FROM TXPHISLRE WHERE (EmprCod = ? and PrdNum >= ? and HreFecAct >= ?) AND (HreFecAct <= ?) AND (PrdNum <= ?) ORDER BY EmprCod, PrdNum, HreFecAct ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H014F3", "SELECT T1.CumCodCont, T1.EmprCod, T2.CumConFec, T1.PrdNum, T1.CumConCant, T1.CumConLot FROM (TXPLCUMCO T1 INNER JOIN TXPCCUMCO T2 ON T2.EmprCod = T1.EmprCod AND T2.CumCodCont = T1.CumCodCont) WHERE (T1.EmprCod = ? and T1.PrdNum >= ? and T2.CumConFec >= ?) AND (T2.CumConFec <= ?) AND (T1.PrdNum <= ?) ORDER BY T1.EmprCod, T1.PrdNum, T2.CumConFec ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H014F4", "SELECT CCStkLin, EmprCod, TipMovCc, CCStkDsc, CCStkFec, PrdNum, CCStkCanS, CCStkLot FROM TXPCCSTKS WHERE (EmprCod = ? and PrdNum >= ? and CCStkFec >= ?) AND (CCStkFec <= ?) AND (CCStkDsc like '%Lavado en Maquina%') AND (TipMovCc = 'SM') AND (PrdNum <= ?) ORDER BY EmprCod, PrdNum, CCStkFec ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H014F5", "SELECT LinEnt, Albaran, EntFecEnt, PrdNum, EmprCod, EntUniEnt, EntLotN FROM TXPENTALM WHERE (EmprCod = ? and PrdNum >= ? and EntFecEnt >= ?) AND (EntFecEnt <= ?) AND (SUBSTR(Albaran, 1, 3) <> 'REC') AND (SUBSTR(Albaran, 1, 3) <> 'INV') AND (SUBSTR(Albaran, 1, 2) <> 'AD') AND (PrdNum <= ?) ORDER BY EmprCod, PrdNum, EntFecEnt ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H014F6", "SELECT * FROM (SELECT HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro, HreRecLin, EmprCod, PrdNum, HreLote, HreFecAct, HreProv, HreFabId FROM TXPHISLRE WHERE (EmprCod = ? and PrdNum = ? and HreLote = ? and HreFecAct >= ?) AND (HreFecAct <= ?) ORDER BY EmprCod, PrdNum, HreLote, HreFecAct) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H014F7", "SELECT * FROM (SELECT LinEnt, EmprCod, PrdNum, EntLotN, EntFecEnt, EntPrvNum, EntFabId, PedCod FROM TXPENTALM WHERE (EmprCod = ? and PrdNum = ? and EntLotN = ? and EntFecEnt >= ?) AND (EntFecEnt <= ?) ORDER BY EmprCod, PrdNum, EntLotN, EntFecEnt) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H014F8", "SELECT T1.PrdNum, T1.PedCod, T1.EmprCod, T2.PrvNum, T2.PrdFabId FROM (TXPLPEDID T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.PedCod = ? ORDER BY T1.EmprCod, T1.PedCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(11, 6);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(12,3);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(13, 26);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 26);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(11);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(12);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(13);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setString(5, (String)parms[4], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setString(5, (String)parms[4], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setString(5, (String)parms[4], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setString(5, (String)parms[4], 6);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 26);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setDate(5, (java.util.Date)parms[4]);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 26);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setDate(5, (java.util.Date)parms[4]);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

