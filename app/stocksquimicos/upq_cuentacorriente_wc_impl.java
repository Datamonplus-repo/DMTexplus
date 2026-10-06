package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class upq_cuentacorriente_wc_impl extends GXWebComponent
{
   public upq_cuentacorriente_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public upq_cuentacorriente_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( upq_cuentacorriente_wc_impl.class ));
   }

   public upq_cuentacorriente_wc_impl( int remoteHandle ,
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
      chkavActualizardatos = UIFactory.getCheckbox(this);
      chkavPwdbo = UIFactory.getCheckbox(this);
      cmbavAccionesgrupo = new HTMLChoice();
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
               AV23Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23Emprcod", AV23Emprcod);
               AV39PrdnumIN = httpContext.GetPar( "PrdnumIN") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39PrdnumIN", AV39PrdnumIN);
               AV91CCstkfecfrom = localUtil.parseDateParm( httpContext.GetPar( "CCstkfecfrom")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91CCstkfecfrom", localUtil.format(AV91CCstkfecfrom, "99/99/99"));
               AV92CCstkfecto = localUtil.parseDateParm( httpContext.GetPar( "CCstkfecto")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92CCstkfecto", localUtil.format(AV92CCstkfecto, "99/99/99"));
               AV26Compras = CommonUtil.decimalVal( httpContext.GetPar( "Compras"), ".") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26Compras", GXutil.ltrimstr( AV26Compras, 12, 4));
               AV27Consumos = CommonUtil.decimalVal( httpContext.GetPar( "Consumos"), ".") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27Consumos", GXutil.ltrimstr( AV27Consumos, 12, 4));
               AV28Devoluciones = CommonUtil.decimalVal( httpContext.GetPar( "Devoluciones"), ".") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28Devoluciones", GXutil.ltrimstr( AV28Devoluciones, 12, 4));
               AV37SaldoInicial = CommonUtil.decimalVal( httpContext.GetPar( "SaldoInicial"), ".") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37SaldoInicial", GXutil.ltrimstr( AV37SaldoInicial, 12, 4));
               AV30Existenciascuentacorriente = CommonUtil.decimalVal( httpContext.GetPar( "Existenciascuentacorriente"), ".") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30Existenciascuentacorriente", GXutil.ltrimstr( AV30Existenciascuentacorriente, 12, 4));
               AV35PrdExiAlm = CommonUtil.decimalVal( httpContext.GetPar( "PrdExiAlm"), ".") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35PrdExiAlm", GXutil.ltrimstr( AV35PrdExiAlm, 12, 4));
               AV34PrdCanres = CommonUtil.decimalVal( httpContext.GetPar( "PrdCanres"), ".") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34PrdCanres", GXutil.ltrimstr( AV34PrdCanres, 12, 4));
               AV36PrdNom = httpContext.GetPar( "PrdNom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36PrdNom", AV36PrdNom);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV23Emprcod,AV39PrdnumIN,AV91CCstkfecfrom,AV92CCstkfecto,AV26Compras,AV27Consumos,AV28Devoluciones,AV37SaldoInicial,AV30Existenciascuentacorriente,AV35PrdExiAlm,AV34PrdCanres,AV36PrdNom});
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
      nRC_GXsfl_103 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_103"))) ;
      nGXsfl_103_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_103_idx"))) ;
      sGXsfl_103_idx = httpContext.GetPar( "sGXsfl_103_idx") ;
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
      AV21ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV16ColumnsSelector);
      AV97Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV37SaldoInicial = CommonUtil.decimalVal( httpContext.GetPar( "SaldoInicial"), ".") ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A719PrdNum = httpContext.GetPar( "PrdNum") ;
      A3348CCStkFec = localUtil.parseDateParm( httpContext.GetPar( "CCStkFec")) ;
      A3356CCStkHor = httpContext.GetPar( "CCStkHor") ;
      AV23Emprcod = httpContext.GetPar( "Emprcod") ;
      AV39PrdnumIN = httpContext.GetPar( "PrdnumIN") ;
      AV91CCstkfecfrom = localUtil.parseDateParm( httpContext.GetPar( "CCstkfecfrom")) ;
      AV92CCstkfecto = localUtil.parseDateParm( httpContext.GetPar( "CCstkfecto")) ;
      A3345TipMovCc = httpContext.GetPar( "TipMovCc") ;
      AV51EntSalInv = (short)(GXutil.lval( httpContext.GetPar( "EntSalInv"))) ;
      AV44RecExiRea = CommonUtil.decimalVal( httpContext.GetPar( "RecExiRea"), ".") ;
      AV47ComprasInv = CommonUtil.decimalVal( httpContext.GetPar( "ComprasInv"), ".") ;
      AV48ConsumosInv = CommonUtil.decimalVal( httpContext.GetPar( "ConsumosInv"), ".") ;
      A3357CCStkDsc = httpContext.GetPar( "CCStkDsc") ;
      A3342CCStkLin = GXutil.lval( httpContext.GetPar( "CCStkLin")) ;
      A3349CCStkPre = CommonUtil.decimalVal( httpContext.GetPar( "CCStkPre"), ".") ;
      A3343CCStkCanE = CommonUtil.decimalVal( httpContext.GetPar( "CCStkCanE"), ".") ;
      A3344CCStkCanS = CommonUtil.decimalVal( httpContext.GetPar( "CCStkCanS"), ".") ;
      A5722CCStkLot = httpContext.GetPar( "CCStkLot") ;
      A3350CCStkBar = (int)(GXutil.lval( httpContext.GetPar( "CCStkBar"))) ;
      A3351CCStkReo = (byte)(GXutil.lval( httpContext.GetPar( "CCStkReo"))) ;
      A3352CCStkPar = httpContext.GetPar( "CCStkPar") ;
      A3358CCStkLen = (short)(GXutil.lval( httpContext.GetPar( "CCStkLen"))) ;
      A3353CCStkPed = (int)(GXutil.lval( httpContext.GetPar( "CCStkPed"))) ;
      A3355CCStkUsu = httpContext.GetPar( "CCStkUsu") ;
      A13979CCStkLotFe = localUtil.parseDateParm( httpContext.GetPar( "CCStkLotFe")) ;
      A810RecFec = localUtil.parseDateParm( httpContext.GetPar( "RecFec")) ;
      AV49Recfec = localUtil.parseDateParm( httpContext.GetPar( "Recfec")) ;
      A809RecExiTeo = CommonUtil.decimalVal( httpContext.GetPar( "RecExiTeo"), ".") ;
      A807RecExiRea = CommonUtil.decimalVal( httpContext.GetPar( "RecExiRea"), ".") ;
      A808RecExiTcc = CommonUtil.decimalVal( httpContext.GetPar( "RecExiTcc"), ".") ;
      A806RecExiRcc = CommonUtil.decimalVal( httpContext.GetPar( "RecExiRcc"), ".") ;
      AV78Actualizardatos = httpContext.GetPar( "Actualizardatos") ;
      AV76PwdBo = GXutil.strtobool( httpContext.GetPar( "PwdBo")) ;
      AV70Usurcod = httpContext.GetPar( "Usurcod") ;
      AV71Station = httpContext.GetPar( "Station") ;
      AV75Password = GXutil.lval( httpContext.GetPar( "Password")) ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV21ManageFiltersExecutionStep, AV16ColumnsSelector, AV97Pgmname, AV12FilterFullText, AV37SaldoInicial, A396EmprCod, A719PrdNum, A3348CCStkFec, A3356CCStkHor, AV23Emprcod, AV39PrdnumIN, AV91CCstkfecfrom, AV92CCstkfecto, A3345TipMovCc, AV51EntSalInv, AV44RecExiRea, AV47ComprasInv, AV48ConsumosInv, A3357CCStkDsc, A3342CCStkLin, A3349CCStkPre, A3343CCStkCanE, A3344CCStkCanS, A5722CCStkLot, A3350CCStkBar, A3351CCStkReo, A3352CCStkPar, A3358CCStkLen, A3353CCStkPed, A3355CCStkUsu, A13979CCStkLotFe, A810RecFec, AV49Recfec, A809RecExiTeo, A807RecExiRea, A808RecExiTcc, A806RecExiRcc, AV78Actualizardatos, AV76PwdBo, AV70Usurcod, AV71Station, AV75Password, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1NY2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "UPQ_Cuenta Corriente", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Popover/WWPPopoverRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.stocksquimicos.upq_cuentacorriente_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV23Emprcod)),GXutil.URLEncode(GXutil.rtrim(AV39PrdnumIN)),GXutil.URLEncode(GXutil.formatDateParm(AV91CCstkfecfrom)),GXutil.URLEncode(GXutil.formatDateParm(AV92CCstkfecto)),GXutil.URLEncode(DecimalUtil.decToString(AV26Compras)),GXutil.URLEncode(DecimalUtil.decToString(AV27Consumos)),GXutil.URLEncode(DecimalUtil.decToString(AV28Devoluciones)),GXutil.URLEncode(DecimalUtil.decToString(AV37SaldoInicial)),GXutil.URLEncode(DecimalUtil.decToString(AV30Existenciascuentacorriente)),GXutil.URLEncode(DecimalUtil.decToString(AV35PrdExiAlm)),GXutil.URLEncode(DecimalUtil.decToString(AV34PrdCanres)),GXutil.URLEncode(GXutil.rtrim(AV36PrdNom))}, new String[] {"Emprcod","PrdnumIN","CCstkfecfrom","CCstkfecto","Compras","Consumos","Devoluciones","SaldoInicial","Existenciascuentacorriente","PrdExiAlm","PrdCanres","PrdNom"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vENTSALINV", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV51EntSalInv), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vRECEXIREA", getSecureSignedToken( sPrefix, localUtil.format( AV44RecExiRea, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOMPRASINV", getSecureSignedToken( sPrefix, localUtil.format( AV47ComprasInv, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCONSUMOSINV", getSecureSignedToken( sPrefix, localUtil.format( AV48ConsumosInv, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vRECFEC", getSecureSignedToken( sPrefix, AV49Recfec));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vUSURCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV70Usurcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTATION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV71Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPASSWORD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV75Password), "ZZZZZZZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_103", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_103, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV19ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV19ManageFiltersData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV22DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV22DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV16ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV16ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV23Emprcod", GXutil.rtrim( wcpOAV23Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV39PrdnumIN", GXutil.rtrim( wcpOAV39PrdnumIN));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV91CCstkfecfrom", localUtil.dtoc( wcpOAV91CCstkfecfrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV92CCstkfecto", localUtil.dtoc( wcpOAV92CCstkfecto, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV26Compras", GXutil.ltrim( localUtil.ntoc( wcpOAV26Compras, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV27Consumos", GXutil.ltrim( localUtil.ntoc( wcpOAV27Consumos, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV28Devoluciones", GXutil.ltrim( localUtil.ntoc( wcpOAV28Devoluciones, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV37SaldoInicial", GXutil.ltrim( localUtil.ntoc( wcpOAV37SaldoInicial, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV30Existenciascuentacorriente", GXutil.ltrim( localUtil.ntoc( wcpOAV30Existenciascuentacorriente, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV35PrdExiAlm", GXutil.ltrim( localUtil.ntoc( wcpOAV35PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV34PrdCanres", GXutil.ltrim( localUtil.ntoc( wcpOAV34PrdCanres, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV36PrdNom", GXutil.rtrim( wcpOAV36PrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV21ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV97Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSALDOINICIAL", GXutil.ltrim( localUtil.ntoc( AV37SaldoInicial, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PRDNUM", GXutil.rtrim( A719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CCSTKFEC", localUtil.dtoc( A3348CCStkFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CCSTKHOR", GXutil.rtrim( A3356CCStkHor));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV23Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRDNUMIN", GXutil.rtrim( AV39PrdnumIN));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCCSTKFECFROM", localUtil.dtoc( AV91CCstkfecfrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCCSTKFECTO", localUtil.dtoc( AV92CCstkfecto, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TIPMOVCC", GXutil.rtrim( A3345TipMovCc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vENTSALINV", GXutil.ltrim( localUtil.ntoc( AV51EntSalInv, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vENTSALINV", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV51EntSalInv), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vRECEXIREA", GXutil.ltrim( localUtil.ntoc( AV44RecExiRea, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vRECEXIREA", getSecureSignedToken( sPrefix, localUtil.format( AV44RecExiRea, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCOMPRASINV", GXutil.ltrim( localUtil.ntoc( AV47ComprasInv, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOMPRASINV", getSecureSignedToken( sPrefix, localUtil.format( AV47ComprasInv, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCONSUMOSINV", GXutil.ltrim( localUtil.ntoc( AV48ConsumosInv, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCONSUMOSINV", getSecureSignedToken( sPrefix, localUtil.format( AV48ConsumosInv, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CCSTKDSC", GXutil.rtrim( A3357CCStkDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CCSTKLIN", GXutil.ltrim( localUtil.ntoc( A3342CCStkLin, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CCSTKPRE", GXutil.ltrim( localUtil.ntoc( A3349CCStkPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CCSTKCANE", GXutil.ltrim( localUtil.ntoc( A3343CCStkCanE, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CCSTKCANS", GXutil.ltrim( localUtil.ntoc( A3344CCStkCanS, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CCSTKLOT", GXutil.rtrim( A5722CCStkLot));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CCSTKBAR", GXutil.ltrim( localUtil.ntoc( A3350CCStkBar, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CCSTKREO", GXutil.ltrim( localUtil.ntoc( A3351CCStkReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CCSTKPAR", GXutil.rtrim( A3352CCStkPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CCSTKLEN", GXutil.ltrim( localUtil.ntoc( A3358CCStkLen, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CCSTKPED", GXutil.ltrim( localUtil.ntoc( A3353CCStkPed, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CCSTKUSU", GXutil.rtrim( A3355CCStkUsu));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CCSTKLOTFE", localUtil.dtoc( A13979CCStkLotFe, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"RECFEC", localUtil.dtoc( A810RecFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vRECFEC", localUtil.dtoc( AV49Recfec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vRECFEC", getSecureSignedToken( sPrefix, AV49Recfec));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"RECEXITEO", GXutil.ltrim( localUtil.ntoc( A809RecExiTeo, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"RECEXIREA", GXutil.ltrim( localUtil.ntoc( A807RecExiRea, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"RECEXITCC", GXutil.ltrim( localUtil.ntoc( A808RecExiTcc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"RECEXIRCC", GXutil.ltrim( localUtil.ntoc( A806RecExiRcc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV10GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRDNOM", GXutil.rtrim( AV36PrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vUSURCOD", GXutil.rtrim( AV70Usurcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vUSURCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV70Usurcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSTATION", GXutil.rtrim( AV71Station));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTATION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV71Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSIACUMULAR", GXutil.rtrim( AV81Siacumular));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPASSWORD", GXutil.ltrim( localUtil.ntoc( AV75Password, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPASSWORD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV75Password), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRDCANRES", GXutil.ltrim( localUtil.ntoc( AV34PrdCanres, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_INFORMACION_Width", GXutil.rtrim( Dvpanel_informacion_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_INFORMACION_Autowidth", GXutil.booltostr( Dvpanel_informacion_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_INFORMACION_Autoheight", GXutil.booltostr( Dvpanel_informacion_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_INFORMACION_Cls", GXutil.rtrim( Dvpanel_informacion_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_INFORMACION_Title", GXutil.rtrim( Dvpanel_informacion_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_INFORMACION_Collapsible", GXutil.booltostr( Dvpanel_informacion_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_INFORMACION_Collapsed", GXutil.booltostr( Dvpanel_informacion_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_INFORMACION_Showcollapseicon", GXutil.booltostr( Dvpanel_informacion_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_INFORMACION_Iconposition", GXutil.rtrim( Dvpanel_informacion_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_INFORMACION_Autoscroll", GXutil.booltostr( Dvpanel_informacion_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_MOVIMIENTOS_Width", GXutil.rtrim( Dvpanel_movimientos_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_MOVIMIENTOS_Autowidth", GXutil.booltostr( Dvpanel_movimientos_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_MOVIMIENTOS_Autoheight", GXutil.booltostr( Dvpanel_movimientos_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_MOVIMIENTOS_Cls", GXutil.rtrim( Dvpanel_movimientos_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_MOVIMIENTOS_Title", GXutil.rtrim( Dvpanel_movimientos_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_MOVIMIENTOS_Collapsible", GXutil.booltostr( Dvpanel_movimientos_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_MOVIMIENTOS_Collapsed", GXutil.booltostr( Dvpanel_movimientos_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_MOVIMIENTOS_Showcollapseicon", GXutil.booltostr( Dvpanel_movimientos_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_MOVIMIENTOS_Iconposition", GXutil.rtrim( Dvpanel_movimientos_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_MOVIMIENTOS_Autoscroll", GXutil.booltostr( Dvpanel_movimientos_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"POPOVER_TIPMOVCC_Gridinternalname", GXutil.rtrim( Popover_tipmovcc_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"POPOVER_TIPMOVCC_Iteminternalname", GXutil.rtrim( Popover_tipmovcc_Iteminternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"POPOVER_TIPMOVCC_Isgriditem", GXutil.booltostr( Popover_tipmovcc_Isgriditem));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"POPOVER_TIPMOVCC_Trigger", GXutil.rtrim( Popover_tipmovcc_Trigger));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"POPOVER_TIPMOVCC_Popoverwidth", GXutil.ltrim( localUtil.ntoc( Popover_tipmovcc_Popoverwidth, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"POPOVER_TIPMOVCC_Position", GXutil.rtrim( Popover_tipmovcc_Position));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Caption", GXutil.rtrim( Ddo_grid_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Fixable", GXutil.rtrim( Ddo_grid_Fixable));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption", GXutil.rtrim( Ddo_gridcolumnsselector_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip", GXutil.rtrim( Ddo_gridcolumnsselector_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls", GXutil.rtrim( Ddo_gridcolumnsselector_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype", GXutil.rtrim( Ddo_gridcolumnsselector_Dropdownoptionstype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname", GXutil.rtrim( Ddo_gridcolumnsselector_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace", GXutil.rtrim( Ddo_gridcolumnsselector_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Title", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNAUDITAR_Title", GXutil.rtrim( Dvelop_confirmpanel_btnauditar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNAUDITAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_btnauditar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNAUDITAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnauditar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNAUDITAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnauditar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNAUDITAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnauditar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNAUDITAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_btnauditar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNAUDITAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_btnauditar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_TITLESCATEGORIES_Gridinternalname", GXutil.rtrim( Grid_titlescategories_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_TITLESCATEGORIES_Gridtitlescategories", GXutil.rtrim( Grid_titlescategories_Gridtitlescategories));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hascategories", GXutil.booltostr( Grid_empowerer_Hascategories));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Popoversingrid", GXutil.rtrim( Grid_empowerer_Popoversingrid));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNAUDITAR_Result", GXutil.rtrim( Dvelop_confirmpanel_btnauditar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNAUDITAR_Result", GXutil.rtrim( Dvelop_confirmpanel_btnauditar_Result));
   }

   public void renderHtmlCloseForm1NY2( )
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
      return "StocksQuimicos.UPQ_CuentaCorriente_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "UPQ_Cuenta Corriente", "") ;
   }

   public void wb1NY0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.stocksquimicos.upq_cuentacorriente_wc");
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
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Popover/WWPPopoverRender.js", "", false, true);
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroupGrouped", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportexcel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 103, 3, 0)+","+"null"+");", httpContext.getMessage( "Export", ""), bttBtnexportexcel_Jsonclick, 5, httpContext.getMessage( "Export", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTEXCEL\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\UPQ_CuentaCorriente_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 103, 3, 0)+","+"null"+");", httpContext.getMessage( "CSV", ""), bttBtncsv_Jsonclick, 5, httpContext.getMessage( "CSV", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\UPQ_CuentaCorriente_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 103, 3, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\UPQ_CuentaCorriente_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_23_1NY2( true) ;
      }
      else
      {
         wb_table1_23_1NY2( false) ;
      }
      return  ;
   }

   public void wb_table1_23_1NY2e( boolean wbgen )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_informacion.setProperty("Width", Dvpanel_informacion_Width);
         ucDvpanel_informacion.setProperty("AutoWidth", Dvpanel_informacion_Autowidth);
         ucDvpanel_informacion.setProperty("AutoHeight", Dvpanel_informacion_Autoheight);
         ucDvpanel_informacion.setProperty("Cls", Dvpanel_informacion_Cls);
         ucDvpanel_informacion.setProperty("Title", Dvpanel_informacion_Title);
         ucDvpanel_informacion.setProperty("Collapsible", Dvpanel_informacion_Collapsible);
         ucDvpanel_informacion.setProperty("Collapsed", Dvpanel_informacion_Collapsed);
         ucDvpanel_informacion.setProperty("ShowCollapseIcon", Dvpanel_informacion_Showcollapseicon);
         ucDvpanel_informacion.setProperty("IconPosition", Dvpanel_informacion_Iconposition);
         ucDvpanel_informacion.setProperty("AutoScroll", Dvpanel_informacion_Autoscroll);
         ucDvpanel_informacion.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_informacion_Internalname, sPrefix+"DVPANEL_INFORMACIONContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_INFORMACIONContainer"+"Informacion"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divInformacion_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Control Group */
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup1_Internalname, httpContext.getMessage( "Saldo Inicial", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_WC.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divSaldoinicial_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavSaldoinicialafecha_Internalname, httpContext.getMessage( "FECHA", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'" + sPrefix + "',false,'" + sGXsfl_103_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSaldoinicialafecha_Internalname, AV66SaldoInicialaFecha, GXutil.rtrim( localUtil.format( AV66SaldoInicialaFecha, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSaldoinicialafecha_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavSaldoinicialafecha_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</fieldset>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Control Group */
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup2_Internalname, httpContext.getMessage( "Control Existencias", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_WC.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divControlexistencias_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavExistenciascuentacorriente_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavExistenciascuentacorriente_Internalname, httpContext.getMessage( "Existencias CC", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavExistenciascuentacorriente_Internalname, GXutil.ltrim( localUtil.ntoc( AV30Existenciascuentacorriente, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavExistenciascuentacorriente_Enabled!=0) ? localUtil.format( AV30Existenciascuentacorriente, "ZZZZZZ9.9999") : localUtil.format( AV30Existenciascuentacorriente, "ZZZZZZ9.9999"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavExistenciascuentacorriente_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavExistenciascuentacorriente_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPrdexialm_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPrdexialm_Internalname, httpContext.getMessage( "Existencias BD", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPrdexialm_Internalname, GXutil.ltrim( localUtil.ntoc( AV35PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavPrdexialm_Enabled!=0) ? localUtil.format( AV35PrdExiAlm, "ZZZZZZ9.9999") : localUtil.format( AV35PrdExiAlm, "ZZZZZZ9.9999"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPrdexialm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPrdexialm_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavExistenciasdif_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavExistenciasdif_Internalname, httpContext.getMessage( "Diferencia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'" + sPrefix + "',false,'" + sGXsfl_103_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavExistenciasdif_Internalname, GXutil.ltrim( localUtil.ntoc( AV67ExistenciasDif, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavExistenciasdif_Enabled!=0) ? localUtil.format( AV67ExistenciasDif, "ZZZZZZ9.9999") : localUtil.format( AV67ExistenciasDif, "ZZZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,61);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavExistenciasdif_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavExistenciasdif_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_WC.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnauditar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 103, 3, 0)+","+"null"+");", httpContext.getMessage( "Auditar", ""), bttBtnauditar_Jsonclick, 7, httpContext.getMessage( "Auditar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e111ny1_client"+"'", TempTags, "", 2, "HLP_StocksQuimicos\\UPQ_CuentaCorriente_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavActualizardatos.getInternalname()+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'" + sPrefix + "',false,'" + sGXsfl_103_idx + "',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavActualizardatos.getInternalname(), AV78Actualizardatos, "", "", 1, chkavActualizardatos.getEnabled(), "S", httpContext.getMessage( "Actualizar Datos?", ""), StyleString, ClassString, "", "", TempTags+" onblur=\""+""+";gx.evt.onblur(this,71);\"");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavPwdbo.getInternalname()+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'" + sPrefix + "',false,'" + sGXsfl_103_idx + "',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavPwdbo.getInternalname(), GXutil.booltostr( AV76PwdBo), "", "", 1, chkavPwdbo.getEnabled(), "true", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(75, this, 'true', 'false',"+"'"+sPrefix+"'"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,75);\"");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</fieldset>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Control Group */
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup3_Internalname, httpContext.getMessage( "Resumen Movimientos", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_WC.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divResumenmovimientos_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCompras_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCompras_Internalname, httpContext.getMessage( "Compras (EN)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCompras_Internalname, GXutil.ltrim( localUtil.ntoc( AV26Compras, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCompras_Enabled!=0) ? localUtil.format( AV26Compras, "ZZZZZZ9.9999") : localUtil.format( AV26Compras, "ZZZZZZ9.9999"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCompras_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCompras_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavConsumos_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavConsumos_Internalname, httpContext.getMessage( "Consumos (SC,SM)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavConsumos_Internalname, GXutil.ltrim( localUtil.ntoc( AV27Consumos, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavConsumos_Enabled!=0) ? localUtil.format( AV27Consumos, "ZZZZZZ9.9999") : localUtil.format( AV27Consumos, "ZZZZZZ9.9999"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavConsumos_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavConsumos_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavDevoluciones_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDevoluciones_Internalname, httpContext.getMessage( "Devoluciones (SD)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDevoluciones_Internalname, GXutil.ltrim( localUtil.ntoc( AV28Devoluciones, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavDevoluciones_Enabled!=0) ? localUtil.format( AV28Devoluciones, "ZZZZZZ9.9999") : localUtil.format( AV28Devoluciones, "ZZZZZZ9.9999"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDevoluciones_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDevoluciones_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</fieldset>") ;
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_movimientos.setProperty("Width", Dvpanel_movimientos_Width);
         ucDvpanel_movimientos.setProperty("AutoWidth", Dvpanel_movimientos_Autowidth);
         ucDvpanel_movimientos.setProperty("AutoHeight", Dvpanel_movimientos_Autoheight);
         ucDvpanel_movimientos.setProperty("Cls", Dvpanel_movimientos_Cls);
         ucDvpanel_movimientos.setProperty("Title", Dvpanel_movimientos_Title);
         ucDvpanel_movimientos.setProperty("Collapsible", Dvpanel_movimientos_Collapsible);
         ucDvpanel_movimientos.setProperty("Collapsed", Dvpanel_movimientos_Collapsed);
         ucDvpanel_movimientos.setProperty("ShowCollapseIcon", Dvpanel_movimientos_Showcollapseicon);
         ucDvpanel_movimientos.setProperty("IconPosition", Dvpanel_movimientos_Iconposition);
         ucDvpanel_movimientos.setProperty("AutoScroll", Dvpanel_movimientos_Autoscroll);
         ucDvpanel_movimientos.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_movimientos_Internalname, sPrefix+"DVPANEL_MOVIMIENTOSContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_MOVIMIENTOSContainer"+"Movimientos"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divMovimientos_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell HasGridEmpowerer", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol103( ) ;
      }
      if ( wbEnd == 103 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_103 = (int)(nGXsfl_103_idx-1) ;
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divHtml_bottomauxiliarcontrols_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
         /* User Defined Control */
         ucPopover_tipmovcc.setProperty("IsGridItem", Popover_tipmovcc_Isgriditem);
         ucPopover_tipmovcc.setProperty("Trigger", Popover_tipmovcc_Trigger);
         ucPopover_tipmovcc.setProperty("PopoverWidth", Popover_tipmovcc_Popoverwidth);
         ucPopover_tipmovcc.setProperty("Position", Popover_tipmovcc_Position);
         ucPopover_tipmovcc.render(context, "dvelop.wwppopover", Popover_tipmovcc_Internalname, sPrefix+"POPOVER_TIPMOVCCContainer");
         /* User Defined Control */
         ucDdo_grid.setProperty("Caption", Ddo_grid_Caption);
         ucDdo_grid.setProperty("ColumnIds", Ddo_grid_Columnids);
         ucDdo_grid.setProperty("ColumnsSortValues", Ddo_grid_Columnssortvalues);
         ucDdo_grid.setProperty("Fixable", Ddo_grid_Fixable);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV22DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV22DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV16ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         wb_table2_130_1NY2( true) ;
      }
      else
      {
         wb_table2_130_1NY2( false) ;
      }
      return  ;
   }

   public void wb_table2_130_1NY2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table3_135_1NY2( true) ;
      }
      else
      {
         wb_table3_135_1NY2( false) ;
      }
      return  ;
   }

   public void wb_table3_135_1NY2e( boolean wbgen )
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
         ucGrid_empowerer.setProperty("PopoversInGrid", Grid_empowerer_Popoversingrid);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDiv_wwpauxwc_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"W0143"+"", GXutil.rtrim( WebComp_Wwpaux_wc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+sPrefix+"gxHTMLWrpW0143"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_103_Refreshing )
            {
               if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldWwpaux_wc), GXutil.lower( WebComp_Wwpaux_wc_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp(sPrefix+"gxHTMLWrpW0143"+"");
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
      if ( wbEnd == 103 )
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

   public void start1NY2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "UPQ_Cuenta Corriente", ""), (short)(0)) ;
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
            strup1NY0( ) ;
         }
      }
   }

   public void ws1NY2( )
   {
      start1NY2( ) ;
      evt1NY2( ) ;
   }

   public void evt1NY2( )
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
                              strup1NY0( ) ;
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
                              strup1NY0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e121NY2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1NY0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e131NY2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1NY0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e141NY2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_BTNAUDITAR.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1NY0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e151NY2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTEXCEL'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1NY0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportExcel' */
                                 e161NY2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1NY0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoCSV' */
                                 e171NY2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "VACTUALIZARDATOS.CLICK") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1NY0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e181NY2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1NY0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = cmbavAccionesgrupo.getInternalname() ;
                                 httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1NY0( ) ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 20), "VACCIONESGRUPO.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 20), "VACCIONESGRUPO.CLICK") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1NY0( ) ;
                           }
                           nGXsfl_103_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_103_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_103_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_1032( ) ;
                           cmbavAccionesgrupo.setName( cmbavAccionesgrupo.getInternalname() );
                           cmbavAccionesgrupo.setValue( httpContext.cgiGet( cmbavAccionesgrupo.getInternalname()) );
                           AV68AccionesGrupo = (short)(GXutil.lval( httpContext.cgiGet( cmbavAccionesgrupo.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavAccionesgrupo.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68AccionesGrupo), 4, 0));
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCcstklin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCcstklin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999999999L ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCSTKLIN");
                              GX_FocusControl = edtavCcstklin_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV13CCStkLin = 0 ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstklin_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13CCStkLin), 12, 0));
                           }
                           else
                           {
                              AV13CCStkLin = localUtil.ctol( httpContext.cgiGet( edtavCcstklin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstklin_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13CCStkLin), 12, 0));
                           }
                           AV40DiaHora = httpContext.cgiGet( edtavDiahora_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDiahora_Internalname, AV40DiaHora);
                           app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vDIAHORA"+"_"+sGXsfl_103_idx, getSecureSignedToken( sPrefix+sGXsfl_103_idx, GXutil.rtrim( localUtil.format( AV40DiaHora, ""))));
                           AV90TipMovCcWithTags = httpContext.cgiGet( edtavTipmovccwithtags_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTipmovccwithtags_Internalname, AV90TipMovCcWithTags);
                           AV41TipMovCc = httpContext.cgiGet( edtavTipmovcc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTipmovcc_Internalname, AV41TipMovCc);
                           app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTIPMOVCC"+"_"+sGXsfl_103_idx, getSecureSignedToken( sPrefix+sGXsfl_103_idx, GXutil.rtrim( localUtil.format( AV41TipMovCc, ""))));
                           AV42CCStkDsc = httpContext.cgiGet( edtavCcstkdsc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkdsc_Internalname, AV42CCStkDsc);
                           app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCCSTKDSC"+"_"+sGXsfl_103_idx, getSecureSignedToken( sPrefix+sGXsfl_103_idx, GXutil.rtrim( localUtil.format( AV42CCStkDsc, ""))));
                           if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCcstkcane_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCcstkcane_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCSTKCANE");
                              GX_FocusControl = edtavCcstkcane_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV54CCStkCanE = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkcane_Internalname, GXutil.ltrimstr( AV54CCStkCanE, 12, 4));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCCSTKCANE"+"_"+sGXsfl_103_idx, getSecureSignedToken( sPrefix+sGXsfl_103_idx, localUtil.format( AV54CCStkCanE, "ZZZZZZ9.9999")));
                           }
                           else
                           {
                              AV54CCStkCanE = localUtil.ctond( httpContext.cgiGet( edtavCcstkcane_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkcane_Internalname, GXutil.ltrimstr( AV54CCStkCanE, 12, 4));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCCSTKCANE"+"_"+sGXsfl_103_idx, getSecureSignedToken( sPrefix+sGXsfl_103_idx, localUtil.format( AV54CCStkCanE, "ZZZZZZ9.9999")));
                           }
                           if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCcstkcans_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCcstkcans_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCSTKCANS");
                              GX_FocusControl = edtavCcstkcans_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV55CCStkCanS = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkcans_Internalname, GXutil.ltrimstr( AV55CCStkCanS, 12, 4));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCCSTKCANS"+"_"+sGXsfl_103_idx, getSecureSignedToken( sPrefix+sGXsfl_103_idx, localUtil.format( AV55CCStkCanS, "ZZZZZZ9.9999")));
                           }
                           else
                           {
                              AV55CCStkCanS = localUtil.ctond( httpContext.cgiGet( edtavCcstkcans_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkcans_Internalname, GXutil.ltrimstr( AV55CCStkCanS, 12, 4));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCCSTKCANS"+"_"+sGXsfl_103_idx, getSecureSignedToken( sPrefix+sGXsfl_103_idx, localUtil.format( AV55CCStkCanS, "ZZZZZZ9.9999")));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCcstkpre_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCcstkpre_Internalname)), DecimalUtil.stringToDec("99999999.99999")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCSTKPRE");
                              GX_FocusControl = edtavCcstkpre_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV53CCStkPre = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkpre_Internalname, GXutil.ltrimstr( AV53CCStkPre, 14, 5));
                           }
                           else
                           {
                              AV53CCStkPre = localUtil.ctond( httpContext.cgiGet( edtavCcstkpre_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkpre_Internalname, GXutil.ltrimstr( AV53CCStkPre, 14, 5));
                           }
                           if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavExis_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavExis_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vEXIS");
                              GX_FocusControl = edtavExis_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV50Exis = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavExis_Internalname, GXutil.ltrimstr( AV50Exis, 12, 4));
                           }
                           else
                           {
                              AV50Exis = localUtil.ctond( httpContext.cgiGet( edtavExis_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavExis_Internalname, GXutil.ltrimstr( AV50Exis, 12, 4));
                           }
                           AV56CCStkLot = httpContext.cgiGet( edtavCcstklot_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstklot_Internalname, AV56CCStkLot);
                           if ( localUtil.vcdtime( httpContext.cgiGet( edtavCcstklotfech_Internalname), (byte)(0), (byte)(0)) == 0 )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vCCSTKLOTFECH");
                              GX_FocusControl = edtavCcstklotfech_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV65CCStkLotFech = GXutil.nullDate() ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstklotfech_Internalname, localUtil.format(AV65CCStkLotFech, "99/99/99"));
                           }
                           else
                           {
                              AV65CCStkLotFech = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavCcstklotfech_Internalname), 0)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstklotfech_Internalname, localUtil.format(AV65CCStkLotFech, "99/99/99"));
                           }
                           AV57Hdr = httpContext.cgiGet( edtavHdr_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHdr_Internalname, AV57Hdr);
                           AV64CCStkUsu = GXutil.upper( httpContext.cgiGet( edtavCcstkusu_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkusu_Internalname, AV64CCStkUsu);
                           app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCCSTKUSU"+"_"+sGXsfl_103_idx, getSecureSignedToken( sPrefix+sGXsfl_103_idx, GXutil.rtrim( localUtil.format( AV64CCStkUsu, "@!"))));
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCcstkbar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCcstkbar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCSTKBAR");
                              GX_FocusControl = edtavCcstkbar_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV58CCStkBar = 0 ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkbar_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58CCStkBar), 8, 0));
                           }
                           else
                           {
                              AV58CCStkBar = (int)(localUtil.ctol( httpContext.cgiGet( edtavCcstkbar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkbar_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58CCStkBar), 8, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCcstkreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCcstkreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCSTKREO");
                              GX_FocusControl = edtavCcstkreo_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV59CCStkReo = (byte)(0) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkreo_Internalname, GXutil.str( AV59CCStkReo, 1, 0));
                           }
                           else
                           {
                              AV59CCStkReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtavCcstkreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkreo_Internalname, GXutil.str( AV59CCStkReo, 1, 0));
                           }
                           AV60CCStkPar = httpContext.cgiGet( edtavCcstkpar_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkpar_Internalname, AV60CCStkPar);
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCcstkped_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCcstkped_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCSTKPED");
                              GX_FocusControl = edtavCcstkped_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV63CCStkPed = 0 ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkped_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63CCStkPed), 8, 0));
                           }
                           else
                           {
                              AV63CCStkPed = (int)(localUtil.ctol( httpContext.cgiGet( edtavCcstkped_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkped_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63CCStkPed), 8, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCcstklen_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCcstklen_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCSTKLEN");
                              GX_FocusControl = edtavCcstklen_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV62CCStkLen = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstklen_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62CCStkLen), 4, 0));
                           }
                           else
                           {
                              AV62CCStkLen = (short)(localUtil.ctol( httpContext.cgiGet( edtavCcstklen_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstklen_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62CCStkLen), 4, 0));
                           }
                           if ( localUtil.vcdtime( httpContext.cgiGet( edtavCcstkfec_Internalname), (byte)(0), (byte)(0)) == 0 )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vCCSTKFEC");
                              GX_FocusControl = edtavCcstkfec_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV24CCStkFec = GXutil.nullDate() ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkfec_Internalname, localUtil.format(AV24CCStkFec, "99/99/99"));
                           }
                           else
                           {
                              AV24CCStkFec = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavCcstkfec_Internalname), 0)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkfec_Internalname, localUtil.format(AV24CCStkFec, "99/99/99"));
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
                                       GX_FocusControl = cmbavAccionesgrupo.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e191NY2 ();
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
                                       GX_FocusControl = cmbavAccionesgrupo.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e201NY2 ();
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
                                       GX_FocusControl = cmbavAccionesgrupo.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e211NY2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "VACCIONESGRUPO.CLICK") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavAccionesgrupo.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e221NY2 ();
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
                                    strup1NY0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavAccionesgrupo.getInternalname() ;
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
                     if ( nCmpId == 143 )
                     {
                        OldWwpaux_wc = httpContext.cgiGet( sPrefix+"W0143") ;
                        if ( ( GXutil.len( OldWwpaux_wc) == 0 ) || ( GXutil.strcmp(OldWwpaux_wc, WebComp_Wwpaux_wc_Component) != 0 ) )
                        {
                           WebComp_Wwpaux_wc = WebUtils.getWebComponent(getClass(), "app." + OldWwpaux_wc + "_impl", remoteHandle, context);
                           WebComp_Wwpaux_wc_Component = OldWwpaux_wc ;
                        }
                        if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
                        {
                           WebComp_Wwpaux_wc.componentprocess(sPrefix+"W0143", "", sEvt);
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

   public void we1NY2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1NY2( ) ;
         }
      }
   }

   public void pa1NY2( )
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
      subsflControlProps_1032( ) ;
      while ( nGXsfl_103_idx <= nRC_GXsfl_103 )
      {
         sendrow_1032( ) ;
         nGXsfl_103_idx = ((subGrid_Islastpage==1)&&(nGXsfl_103_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_103_idx+1) ;
         sGXsfl_103_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_103_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1032( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 byte AV21ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelector ,
                                 String AV97Pgmname ,
                                 String AV12FilterFullText ,
                                 java.math.BigDecimal AV37SaldoInicial ,
                                 String A396EmprCod ,
                                 String A719PrdNum ,
                                 java.util.Date A3348CCStkFec ,
                                 String A3356CCStkHor ,
                                 String AV23Emprcod ,
                                 String AV39PrdnumIN ,
                                 java.util.Date AV91CCstkfecfrom ,
                                 java.util.Date AV92CCstkfecto ,
                                 String A3345TipMovCc ,
                                 short AV51EntSalInv ,
                                 java.math.BigDecimal AV44RecExiRea ,
                                 java.math.BigDecimal AV47ComprasInv ,
                                 java.math.BigDecimal AV48ConsumosInv ,
                                 String A3357CCStkDsc ,
                                 long A3342CCStkLin ,
                                 java.math.BigDecimal A3349CCStkPre ,
                                 java.math.BigDecimal A3343CCStkCanE ,
                                 java.math.BigDecimal A3344CCStkCanS ,
                                 String A5722CCStkLot ,
                                 int A3350CCStkBar ,
                                 byte A3351CCStkReo ,
                                 String A3352CCStkPar ,
                                 short A3358CCStkLen ,
                                 int A3353CCStkPed ,
                                 String A3355CCStkUsu ,
                                 java.util.Date A13979CCStkLotFe ,
                                 java.util.Date A810RecFec ,
                                 java.util.Date AV49Recfec ,
                                 java.math.BigDecimal A809RecExiTeo ,
                                 java.math.BigDecimal A807RecExiRea ,
                                 java.math.BigDecimal A808RecExiTcc ,
                                 java.math.BigDecimal A806RecExiRcc ,
                                 String AV78Actualizardatos ,
                                 boolean AV76PwdBo ,
                                 String AV70Usurcod ,
                                 String AV71Station ,
                                 long AV75Password ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e201NY2 ();
      GRID_nCurrentRecord = 0 ;
      rf1NY2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCCSTKDSC", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV42CCStkDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCCSTKDSC", GXutil.rtrim( AV42CCStkDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTIPMOVCC", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV41TipMovCc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPMOVCC", GXutil.rtrim( AV41TipMovCc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCCSTKUSU", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV64CCStkUsu, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCCSTKUSU", GXutil.rtrim( AV64CCStkUsu));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vDIAHORA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV40DiaHora, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vDIAHORA", GXutil.rtrim( AV40DiaHora));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCCSTKCANE", getSecureSignedToken( sPrefix, localUtil.format( AV54CCStkCanE, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCCSTKCANE", GXutil.ltrim( localUtil.ntoc( AV54CCStkCanE, (byte)(12), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCCSTKCANS", getSecureSignedToken( sPrefix, localUtil.format( AV55CCStkCanS, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCCSTKCANS", GXutil.ltrim( localUtil.ntoc( AV55CCStkCanS, (byte)(12), (byte)(4), ".", "")));
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
      AV78Actualizardatos = ((GXutil.strcmp(GXutil.rtrim( AV78Actualizardatos), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78Actualizardatos", AV78Actualizardatos);
      AV76PwdBo = GXutil.strtobool( GXutil.booltostr( AV76PwdBo)) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76PwdBo", AV76PwdBo);
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf1NY2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV97Pgmname = "StocksQuimicos.UPQ_CuentaCorriente_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV97Pgmname", AV97Pgmname);
      Gx_err = (short)(0) ;
      edtavSaldoinicialafecha_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSaldoinicialafecha_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSaldoinicialafecha_Enabled), 5, 0), true);
      edtavExistenciascuentacorriente_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavExistenciascuentacorriente_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavExistenciascuentacorriente_Enabled), 5, 0), true);
      edtavPrdexialm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrdexialm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdexialm_Enabled), 5, 0), true);
      edtavExistenciasdif_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavExistenciasdif_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavExistenciasdif_Enabled), 5, 0), true);
      chkavPwdbo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavPwdbo.getInternalname(), "Enabled", GXutil.ltrimstr( chkavPwdbo.getEnabled(), 5, 0), true);
      edtavCompras_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCompras_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCompras_Enabled), 5, 0), true);
      edtavConsumos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavConsumos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavConsumos_Enabled), 5, 0), true);
      edtavDevoluciones_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDevoluciones_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDevoluciones_Enabled), 5, 0), true);
      edtavCcstklin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstklin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstklin_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtavDiahora_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiahora_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiahora_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtavTipmovccwithtags_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTipmovccwithtags_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipmovccwithtags_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtavTipmovcc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTipmovcc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipmovcc_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtavCcstkdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkdsc_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtavCcstkcane_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkcane_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkcane_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtavCcstkcans_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkcans_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkcans_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtavCcstkpre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkpre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkpre_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtavExis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavExis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavExis_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtavCcstklot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstklot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstklot_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtavCcstklotfech_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstklotfech_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstklotfech_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtavHdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtavCcstkusu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkusu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkusu_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtavCcstkbar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkbar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkbar_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtavCcstkreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkreo_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtavCcstkpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkpar_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtavCcstkped_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkped_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkped_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtavCcstklen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstklen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstklen_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtavCcstkfec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkfec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkfec_Enabled), 5, 0), !bGXsfl_103_Refreshing);
   }

   public void rf1NY2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(103) ;
      /* Execute user event: Refresh */
      e201NY2 ();
      nGXsfl_103_idx = 1 ;
      sGXsfl_103_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_103_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1032( ) ;
      bGXsfl_103_Refreshing = true ;
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
         subsflControlProps_1032( ) ;
         e211NY2 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_103_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e211NY2 ();
         }
         wbEnd = (short)(103) ;
         wb1NY0( ) ;
      }
      bGXsfl_103_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1NY2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vENTSALINV", GXutil.ltrim( localUtil.ntoc( AV51EntSalInv, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vENTSALINV", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV51EntSalInv), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vRECEXIREA", GXutil.ltrim( localUtil.ntoc( AV44RecExiRea, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vRECEXIREA", getSecureSignedToken( sPrefix, localUtil.format( AV44RecExiRea, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCOMPRASINV", GXutil.ltrim( localUtil.ntoc( AV47ComprasInv, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOMPRASINV", getSecureSignedToken( sPrefix, localUtil.format( AV47ComprasInv, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCONSUMOSINV", GXutil.ltrim( localUtil.ntoc( AV48ConsumosInv, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCONSUMOSINV", getSecureSignedToken( sPrefix, localUtil.format( AV48ConsumosInv, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vRECFEC", localUtil.dtoc( AV49Recfec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vRECFEC", getSecureSignedToken( sPrefix, AV49Recfec));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCCSTKDSC"+"_"+sGXsfl_103_idx, getSecureSignedToken( sPrefix+sGXsfl_103_idx, GXutil.rtrim( localUtil.format( AV42CCStkDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTIPMOVCC"+"_"+sGXsfl_103_idx, getSecureSignedToken( sPrefix+sGXsfl_103_idx, GXutil.rtrim( localUtil.format( AV41TipMovCc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCCSTKUSU"+"_"+sGXsfl_103_idx, getSecureSignedToken( sPrefix+sGXsfl_103_idx, GXutil.rtrim( localUtil.format( AV64CCStkUsu, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vDIAHORA"+"_"+sGXsfl_103_idx, getSecureSignedToken( sPrefix+sGXsfl_103_idx, GXutil.rtrim( localUtil.format( AV40DiaHora, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCCSTKCANE"+"_"+sGXsfl_103_idx, getSecureSignedToken( sPrefix+sGXsfl_103_idx, localUtil.format( AV54CCStkCanE, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCCSTKCANS"+"_"+sGXsfl_103_idx, getSecureSignedToken( sPrefix+sGXsfl_103_idx, localUtil.format( AV55CCStkCanS, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vUSURCOD", GXutil.rtrim( AV70Usurcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vUSURCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV70Usurcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSTATION", GXutil.rtrim( AV71Station));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTATION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV71Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPASSWORD", GXutil.ltrim( localUtil.ntoc( AV75Password, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPASSWORD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV75Password), "ZZZZZZZZZ9")));
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
         gxgrgrid_refresh( subGrid_Rows, AV21ManageFiltersExecutionStep, AV16ColumnsSelector, AV97Pgmname, AV12FilterFullText, AV37SaldoInicial, A396EmprCod, A719PrdNum, A3348CCStkFec, A3356CCStkHor, AV23Emprcod, AV39PrdnumIN, AV91CCstkfecfrom, AV92CCstkfecto, A3345TipMovCc, AV51EntSalInv, AV44RecExiRea, AV47ComprasInv, AV48ConsumosInv, A3357CCStkDsc, A3342CCStkLin, A3349CCStkPre, A3343CCStkCanE, A3344CCStkCanS, A5722CCStkLot, A3350CCStkBar, A3351CCStkReo, A3352CCStkPar, A3358CCStkLen, A3353CCStkPed, A3355CCStkUsu, A13979CCStkLotFe, A810RecFec, AV49Recfec, A809RecExiTeo, A807RecExiRea, A808RecExiTcc, A806RecExiRcc, AV78Actualizardatos, AV76PwdBo, AV70Usurcod, AV71Station, AV75Password, sPrefix) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV21ManageFiltersExecutionStep, AV16ColumnsSelector, AV97Pgmname, AV12FilterFullText, AV37SaldoInicial, A396EmprCod, A719PrdNum, A3348CCStkFec, A3356CCStkHor, AV23Emprcod, AV39PrdnumIN, AV91CCstkfecfrom, AV92CCstkfecto, A3345TipMovCc, AV51EntSalInv, AV44RecExiRea, AV47ComprasInv, AV48ConsumosInv, A3357CCStkDsc, A3342CCStkLin, A3349CCStkPre, A3343CCStkCanE, A3344CCStkCanS, A5722CCStkLot, A3350CCStkBar, A3351CCStkReo, A3352CCStkPar, A3358CCStkLen, A3353CCStkPed, A3355CCStkUsu, A13979CCStkLotFe, A810RecFec, AV49Recfec, A809RecExiTeo, A807RecExiRea, A808RecExiTcc, A806RecExiRcc, AV78Actualizardatos, AV76PwdBo, AV70Usurcod, AV71Station, AV75Password, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV21ManageFiltersExecutionStep, AV16ColumnsSelector, AV97Pgmname, AV12FilterFullText, AV37SaldoInicial, A396EmprCod, A719PrdNum, A3348CCStkFec, A3356CCStkHor, AV23Emprcod, AV39PrdnumIN, AV91CCstkfecfrom, AV92CCstkfecto, A3345TipMovCc, AV51EntSalInv, AV44RecExiRea, AV47ComprasInv, AV48ConsumosInv, A3357CCStkDsc, A3342CCStkLin, A3349CCStkPre, A3343CCStkCanE, A3344CCStkCanS, A5722CCStkLot, A3350CCStkBar, A3351CCStkReo, A3352CCStkPar, A3358CCStkLen, A3353CCStkPed, A3355CCStkUsu, A13979CCStkLotFe, A810RecFec, AV49Recfec, A809RecExiTeo, A807RecExiRea, A808RecExiTcc, A806RecExiRcc, AV78Actualizardatos, AV76PwdBo, AV70Usurcod, AV71Station, AV75Password, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      subGrid_Islastpage = 1 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV21ManageFiltersExecutionStep, AV16ColumnsSelector, AV97Pgmname, AV12FilterFullText, AV37SaldoInicial, A396EmprCod, A719PrdNum, A3348CCStkFec, A3356CCStkHor, AV23Emprcod, AV39PrdnumIN, AV91CCstkfecfrom, AV92CCstkfecto, A3345TipMovCc, AV51EntSalInv, AV44RecExiRea, AV47ComprasInv, AV48ConsumosInv, A3357CCStkDsc, A3342CCStkLin, A3349CCStkPre, A3343CCStkCanE, A3344CCStkCanS, A5722CCStkLot, A3350CCStkBar, A3351CCStkReo, A3352CCStkPar, A3358CCStkLen, A3353CCStkPed, A3355CCStkUsu, A13979CCStkLotFe, A810RecFec, AV49Recfec, A809RecExiTeo, A807RecExiRea, A808RecExiTcc, A806RecExiRcc, AV78Actualizardatos, AV76PwdBo, AV70Usurcod, AV71Station, AV75Password, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV21ManageFiltersExecutionStep, AV16ColumnsSelector, AV97Pgmname, AV12FilterFullText, AV37SaldoInicial, A396EmprCod, A719PrdNum, A3348CCStkFec, A3356CCStkHor, AV23Emprcod, AV39PrdnumIN, AV91CCstkfecfrom, AV92CCstkfecto, A3345TipMovCc, AV51EntSalInv, AV44RecExiRea, AV47ComprasInv, AV48ConsumosInv, A3357CCStkDsc, A3342CCStkLin, A3349CCStkPre, A3343CCStkCanE, A3344CCStkCanS, A5722CCStkLot, A3350CCStkBar, A3351CCStkReo, A3352CCStkPar, A3358CCStkLen, A3353CCStkPed, A3355CCStkUsu, A13979CCStkLotFe, A810RecFec, AV49Recfec, A809RecExiTeo, A807RecExiRea, A808RecExiTcc, A806RecExiRcc, AV78Actualizardatos, AV76PwdBo, AV70Usurcod, AV71Station, AV75Password, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV97Pgmname = "StocksQuimicos.UPQ_CuentaCorriente_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV97Pgmname", AV97Pgmname);
      Gx_err = (short)(0) ;
      edtavSaldoinicialafecha_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSaldoinicialafecha_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSaldoinicialafecha_Enabled), 5, 0), true);
      edtavExistenciascuentacorriente_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavExistenciascuentacorriente_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavExistenciascuentacorriente_Enabled), 5, 0), true);
      edtavPrdexialm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrdexialm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdexialm_Enabled), 5, 0), true);
      edtavExistenciasdif_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavExistenciasdif_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavExistenciasdif_Enabled), 5, 0), true);
      chkavPwdbo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavPwdbo.getInternalname(), "Enabled", GXutil.ltrimstr( chkavPwdbo.getEnabled(), 5, 0), true);
      edtavCompras_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCompras_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCompras_Enabled), 5, 0), true);
      edtavConsumos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavConsumos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavConsumos_Enabled), 5, 0), true);
      edtavDevoluciones_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDevoluciones_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDevoluciones_Enabled), 5, 0), true);
      edtavCcstklin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstklin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstklin_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtavDiahora_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiahora_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiahora_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtavTipmovccwithtags_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTipmovccwithtags_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipmovccwithtags_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtavTipmovcc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTipmovcc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipmovcc_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtavCcstkdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkdsc_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtavCcstkcane_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkcane_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkcane_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtavCcstkcans_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkcans_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkcans_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtavCcstkpre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkpre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkpre_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtavExis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavExis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavExis_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtavCcstklot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstklot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstklot_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtavCcstklotfech_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstklotfech_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstklotfech_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtavHdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtavCcstkusu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkusu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkusu_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtavCcstkbar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkbar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkbar_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtavCcstkreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkreo_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtavCcstkpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkpar_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtavCcstkped_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkped_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkped_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtavCcstklen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstklen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstklen_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtavCcstkfec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkfec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkfec_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strup1NY0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e191NY2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV19ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV22DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV16ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_103 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_103"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV23Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV23Emprcod") ;
         wcpOAV39PrdnumIN = httpContext.cgiGet( sPrefix+"wcpOAV39PrdnumIN") ;
         wcpOAV91CCstkfecfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV91CCstkfecfrom"), 0) ;
         wcpOAV92CCstkfecto = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV92CCstkfecto"), 0) ;
         wcpOAV26Compras = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV26Compras")) ;
         wcpOAV27Consumos = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV27Consumos")) ;
         wcpOAV28Devoluciones = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV28Devoluciones")) ;
         wcpOAV37SaldoInicial = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV37SaldoInicial")) ;
         wcpOAV30Existenciascuentacorriente = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV30Existenciascuentacorriente")) ;
         wcpOAV35PrdExiAlm = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV35PrdExiAlm")) ;
         wcpOAV34PrdCanres = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV34PrdCanres")) ;
         wcpOAV36PrdNom = httpContext.cgiGet( sPrefix+"wcpOAV36PrdNom") ;
         AV39PrdnumIN = httpContext.cgiGet( sPrefix+"vPRDNUMIN") ;
         AV23Emprcod = httpContext.cgiGet( sPrefix+"vEMPRCOD") ;
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
         Dvpanel_informacion_Width = httpContext.cgiGet( sPrefix+"DVPANEL_INFORMACION_Width") ;
         Dvpanel_informacion_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_INFORMACION_Autowidth")) ;
         Dvpanel_informacion_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_INFORMACION_Autoheight")) ;
         Dvpanel_informacion_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_INFORMACION_Cls") ;
         Dvpanel_informacion_Title = httpContext.cgiGet( sPrefix+"DVPANEL_INFORMACION_Title") ;
         Dvpanel_informacion_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_INFORMACION_Collapsible")) ;
         Dvpanel_informacion_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_INFORMACION_Collapsed")) ;
         Dvpanel_informacion_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_INFORMACION_Showcollapseicon")) ;
         Dvpanel_informacion_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_INFORMACION_Iconposition") ;
         Dvpanel_informacion_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_INFORMACION_Autoscroll")) ;
         Dvpanel_movimientos_Width = httpContext.cgiGet( sPrefix+"DVPANEL_MOVIMIENTOS_Width") ;
         Dvpanel_movimientos_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_MOVIMIENTOS_Autowidth")) ;
         Dvpanel_movimientos_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_MOVIMIENTOS_Autoheight")) ;
         Dvpanel_movimientos_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_MOVIMIENTOS_Cls") ;
         Dvpanel_movimientos_Title = httpContext.cgiGet( sPrefix+"DVPANEL_MOVIMIENTOS_Title") ;
         Dvpanel_movimientos_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_MOVIMIENTOS_Collapsible")) ;
         Dvpanel_movimientos_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_MOVIMIENTOS_Collapsed")) ;
         Dvpanel_movimientos_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_MOVIMIENTOS_Showcollapseicon")) ;
         Dvpanel_movimientos_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_MOVIMIENTOS_Iconposition") ;
         Dvpanel_movimientos_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_MOVIMIENTOS_Autoscroll")) ;
         Popover_tipmovcc_Gridinternalname = httpContext.cgiGet( sPrefix+"POPOVER_TIPMOVCC_Gridinternalname") ;
         Popover_tipmovcc_Iteminternalname = httpContext.cgiGet( sPrefix+"POPOVER_TIPMOVCC_Iteminternalname") ;
         Popover_tipmovcc_Isgriditem = GXutil.strtobool( httpContext.cgiGet( sPrefix+"POPOVER_TIPMOVCC_Isgriditem")) ;
         Popover_tipmovcc_Trigger = httpContext.cgiGet( sPrefix+"POPOVER_TIPMOVCC_Trigger") ;
         Popover_tipmovcc_Popoverwidth = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"POPOVER_TIPMOVCC_Popoverwidth"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Popover_tipmovcc_Position = httpContext.cgiGet( sPrefix+"POPOVER_TIPMOVCC_Position") ;
         Ddo_grid_Caption = httpContext.cgiGet( sPrefix+"DDO_GRID_Caption") ;
         Ddo_grid_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Fixable = httpContext.cgiGet( sPrefix+"DDO_GRID_Fixable") ;
         Ddo_gridcolumnsselector_Caption = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption") ;
         Ddo_gridcolumnsselector_Tooltip = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip") ;
         Ddo_gridcolumnsselector_Cls = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls") ;
         Ddo_gridcolumnsselector_Dropdownoptionstype = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype") ;
         Ddo_gridcolumnsselector_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname") ;
         Ddo_gridcolumnsselector_Titlecontrolidtoreplace = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace") ;
         Dvelop_confirmpanel_eliminar_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Title") ;
         Dvelop_confirmpanel_eliminar_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Confirmationtext") ;
         Dvelop_confirmpanel_eliminar_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_eliminar_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Confirmtype") ;
         Dvelop_confirmpanel_btnauditar_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNAUDITAR_Title") ;
         Dvelop_confirmpanel_btnauditar_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNAUDITAR_Confirmationtext") ;
         Dvelop_confirmpanel_btnauditar_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNAUDITAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_btnauditar_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNAUDITAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_btnauditar_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNAUDITAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_btnauditar_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNAUDITAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_btnauditar_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNAUDITAR_Confirmtype") ;
         Grid_titlescategories_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_TITLESCATEGORIES_Gridinternalname") ;
         Grid_titlescategories_Gridtitlescategories = httpContext.cgiGet( sPrefix+"GRID_TITLESCATEGORIES_Gridtitlescategories") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hascategories = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hascategories")) ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Hascolumnsselector = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hascolumnsselector")) ;
         Grid_empowerer_Popoversingrid = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Popoversingrid") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         Ddo_managefilters_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Activeeventkey") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Dvelop_confirmpanel_eliminar_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Result") ;
         Dvelop_confirmpanel_btnauditar_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNAUDITAR_Result") ;
         /* Read variables values. */
         AV12FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12FilterFullText", AV12FilterFullText);
         AV66SaldoInicialaFecha = httpContext.cgiGet( edtavSaldoinicialafecha_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66SaldoInicialaFecha", AV66SaldoInicialaFecha);
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavExistenciasdif_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavExistenciasdif_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vEXISTENCIASDIF");
            GX_FocusControl = edtavExistenciasdif_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV67ExistenciasDif = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67ExistenciasDif", GXutil.ltrimstr( AV67ExistenciasDif, 12, 4));
         }
         else
         {
            AV67ExistenciasDif = localUtil.ctond( httpContext.cgiGet( edtavExistenciasdif_Internalname)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67ExistenciasDif", GXutil.ltrimstr( AV67ExistenciasDif, 12, 4));
         }
         AV78Actualizardatos = ((GXutil.strcmp(httpContext.cgiGet( chkavActualizardatos.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78Actualizardatos", AV78Actualizardatos);
         AV76PwdBo = GXutil.strtobool( httpContext.cgiGet( chkavPwdbo.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76PwdBo", AV76PwdBo);
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
      e191NY2 ();
      if (returnInSub) return;
   }

   public void e191NY2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV66SaldoInicialaFecha = httpContext.getMessage( "Saldo Inicial < ", "") + GXutil.trim( localUtil.dtoc( AV91CCstkfecfrom, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + " = " + GXutil.trim( GXutil.str( AV37SaldoInicial, 12, 4)) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66SaldoInicialaFecha", AV66SaldoInicialaFecha);
      AV67ExistenciasDif = AV30Existenciascuentacorriente.subtract(AV35PrdExiAlm) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67ExistenciasDif", GXutil.ltrimstr( AV67ExistenciasDif, 12, 4));
      AV78Actualizardatos = "N" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78Actualizardatos", AV78Actualizardatos);
      AV77WebSession.remove("ValidarWebWPwdGrl");
      GXt_int1 = AV75Password ;
      GXv_char2[0] = AV23Emprcod ;
      GXv_char3[0] = "PSWAUD" ;
      GXv_int4[0] = GXt_int1 ;
      new app.prepkil(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_int4) ;
      upq_cuentacorriente_wc_impl.this.AV23Emprcod = GXv_char2[0] ;
      upq_cuentacorriente_wc_impl.this.GXt_int1 = GXv_int4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23Emprcod", AV23Emprcod);
      AV75Password = GXt_int1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75Password", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV75Password), 10, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPASSWORD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV75Password), "ZZZZZZZZZ9")));
      AV76PwdBo = false ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76PwdBo", AV76PwdBo);
      GXt_int5 = (byte)(AV80Cotexsur) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV23Emprcod, httpContext.getMessage( "COTEXS", ""), GXv_int6) ;
      upq_cuentacorriente_wc_impl.this.GXt_int5 = GXv_int6[0] ;
      AV80Cotexsur = GXt_int5 ;
      AV81Siacumular = ((AV80Cotexsur==0) ? "N" : "S") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81Siacumular", AV81Siacumular);
      GXt_int5 = (byte)(AV51EntSalInv) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV23Emprcod, httpContext.getMessage( "ENSAIV", ""), GXv_int6) ;
      upq_cuentacorriente_wc_impl.this.GXt_int5 = GXv_int6[0] ;
      AV51EntSalInv = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51EntSalInv", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51EntSalInv), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vENTSALINV", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV51EntSalInv), "ZZZ9")));
      GXt_char7 = AV71Station ;
      GXv_char3[0] = GXt_char7 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char3) ;
      upq_cuentacorriente_wc_impl.this.GXt_char7 = GXv_char3[0] ;
      AV71Station = GXt_char7 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71Station", AV71Station);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTATION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV71Station, ""))));
      GXv_char3[0] = AV23Emprcod ;
      GXv_char2[0] = AV95Emprnom ;
      GXv_char8[0] = AV70Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV71Station, GXv_char3, GXv_char2, GXv_char8) ;
      upq_cuentacorriente_wc_impl.this.AV23Emprcod = GXv_char3[0] ;
      upq_cuentacorriente_wc_impl.this.AV95Emprnom = GXv_char2[0] ;
      upq_cuentacorriente_wc_impl.this.AV70Usurcod = GXv_char8[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23Emprcod", AV23Emprcod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70Usurcod", AV70Usurcod);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vUSURCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV70Usurcod, "@!"))));
      Popover_tipmovcc_Gridinternalname = subGrid_Internalname ;
      ucPopover_tipmovcc.sendProperty(context, sPrefix, false, Popover_tipmovcc_Internalname, "GridInternalName", Popover_tipmovcc_Gridinternalname);
      Popover_tipmovcc_Iteminternalname = edtavTipmovccwithtags_Internalname ;
      ucPopover_tipmovcc.sendProperty(context, sPrefix, false, Popover_tipmovcc_Internalname, "ItemInternalName", Popover_tipmovcc_Iteminternalname);
      subGrid_Rows = 0 ;
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
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = AV22DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10[0] ;
      AV22DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
   }

   public void e201NY2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext11[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext11) ;
      AV6WWPContext = GXv_SdtWWPContext11[0] ;
      if ( AV21ManageFiltersExecutionStep == 1 )
      {
         AV21ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21ManageFiltersExecutionStep", GXutil.str( AV21ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV21ManageFiltersExecutionStep == 2 )
      {
         AV21ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21ManageFiltersExecutionStep", GXutil.str( AV21ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV18Session.getValue("StocksQuimicos.UPQ_CuentaCorriente_WCColumnsSelector"), "") != 0 )
      {
         AV14ColumnsSelectorXML = AV18Session.getValue("StocksQuimicos.UPQ_CuentaCorriente_WCColumnsSelector") ;
         AV16ColumnsSelector.fromxml(AV14ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S142 ();
         if (returnInSub) return;
      }
      edtavCcstklin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstklin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstklin_Visible), 5, 0), !bGXsfl_103_Refreshing);
      edtavDiahora_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiahora_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiahora_Visible), 5, 0), !bGXsfl_103_Refreshing);
      edtavTipmovccwithtags_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTipmovccwithtags_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipmovccwithtags_Visible), 5, 0), !bGXsfl_103_Refreshing);
      edtavCcstkdsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkdsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkdsc_Visible), 5, 0), !bGXsfl_103_Refreshing);
      edtavCcstkcane_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkcane_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkcane_Visible), 5, 0), !bGXsfl_103_Refreshing);
      edtavCcstkcans_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkcans_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkcans_Visible), 5, 0), !bGXsfl_103_Refreshing);
      edtavCcstkpre_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkpre_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkpre_Visible), 5, 0), !bGXsfl_103_Refreshing);
      edtavExis_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavExis_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavExis_Visible), 5, 0), !bGXsfl_103_Refreshing);
      edtavCcstklot_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstklot_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstklot_Visible), 5, 0), !bGXsfl_103_Refreshing);
      edtavCcstklotfech_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstklotfech_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstklotfech_Visible), 5, 0), !bGXsfl_103_Refreshing);
      edtavHdr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHdr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr_Visible), 5, 0), !bGXsfl_103_Refreshing);
      edtavCcstkusu_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkusu_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkusu_Visible), 5, 0), !bGXsfl_103_Refreshing);
      cmbavAccionesgrupo.setColumnHeaderClass( "WWActionGroupColumn" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavAccionesgrupo.getInternalname(), "Columnheaderclass", cmbavAccionesgrupo.getColumnHeaderClass(), !bGXsfl_103_Refreshing);
      edtavCcstklin_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstklin_Internalname, "Columnheaderclass", edtavCcstklin_Columnheaderclass, !bGXsfl_103_Refreshing);
      edtavDiahora_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiahora_Internalname, "Columnheaderclass", edtavDiahora_Columnheaderclass, !bGXsfl_103_Refreshing);
      edtavTipmovccwithtags_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTipmovccwithtags_Internalname, "Columnheaderclass", edtavTipmovccwithtags_Columnheaderclass, !bGXsfl_103_Refreshing);
      edtavCcstkdsc_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkdsc_Internalname, "Columnheaderclass", edtavCcstkdsc_Columnheaderclass, !bGXsfl_103_Refreshing);
      edtavCcstkcane_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkcane_Internalname, "Columnheaderclass", edtavCcstkcane_Columnheaderclass, !bGXsfl_103_Refreshing);
      edtavCcstkcans_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkcans_Internalname, "Columnheaderclass", edtavCcstkcans_Columnheaderclass, !bGXsfl_103_Refreshing);
      edtavCcstkpre_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkpre_Internalname, "Columnheaderclass", edtavCcstkpre_Columnheaderclass, !bGXsfl_103_Refreshing);
      edtavExis_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavExis_Internalname, "Columnheaderclass", edtavExis_Columnheaderclass, !bGXsfl_103_Refreshing);
      edtavCcstklot_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstklot_Internalname, "Columnheaderclass", edtavCcstklot_Columnheaderclass, !bGXsfl_103_Refreshing);
      edtavCcstklotfech_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstklotfech_Internalname, "Columnheaderclass", edtavCcstklotfech_Columnheaderclass, !bGXsfl_103_Refreshing);
      edtavHdr_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHdr_Internalname, "Columnheaderclass", edtavHdr_Columnheaderclass, !bGXsfl_103_Refreshing);
      edtavCcstkusu_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkusu_Internalname, "Columnheaderclass", edtavCcstkusu_Columnheaderclass, !bGXsfl_103_Refreshing);
      if ( GXutil.strcmp(GXutil.upper( GXutil.trim( AV77WebSession.getValue("ValidarWebWPwdGrl"))), "SI") == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Valor correcto¡", ""));
         AV77WebSession.remove("ValidarWebWPwdGrl");
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV16ColumnsSelector", AV16ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV19ManageFiltersData", AV19ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   private void e211NY2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV50Exis = AV37SaldoInicial ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavExis_Internalname, GXutil.ltrimstr( AV50Exis, 12, 4));
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV91CCstkfecfrom ,
                                           AV92CCstkfecto ,
                                           A3348CCStkFec ,
                                           A3345TipMovCc ,
                                           AV23Emprcod ,
                                           AV39PrdnumIN ,
                                           A396EmprCod ,
                                           A719PrdNum } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor H01NY2 */
      pr_default.execute(0, new Object[] {AV23Emprcod, AV39PrdnumIN, AV91CCstkfecfrom, AV92CCstkfecto});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = H01NY2_A396EmprCod[0] ;
         A719PrdNum = H01NY2_A719PrdNum[0] ;
         A3345TipMovCc = H01NY2_A3345TipMovCc[0] ;
         A3348CCStkFec = H01NY2_A3348CCStkFec[0] ;
         A3357CCStkDsc = H01NY2_A3357CCStkDsc[0] ;
         A3342CCStkLin = H01NY2_A3342CCStkLin[0] ;
         A3349CCStkPre = H01NY2_A3349CCStkPre[0] ;
         A3343CCStkCanE = H01NY2_A3343CCStkCanE[0] ;
         A3344CCStkCanS = H01NY2_A3344CCStkCanS[0] ;
         A5722CCStkLot = H01NY2_A5722CCStkLot[0] ;
         A3352CCStkPar = H01NY2_A3352CCStkPar[0] ;
         A3351CCStkReo = H01NY2_A3351CCStkReo[0] ;
         A3350CCStkBar = H01NY2_A3350CCStkBar[0] ;
         A3358CCStkLen = H01NY2_A3358CCStkLen[0] ;
         A3353CCStkPed = H01NY2_A3353CCStkPed[0] ;
         A3355CCStkUsu = H01NY2_A3355CCStkUsu[0] ;
         A13979CCStkLotFe = H01NY2_A13979CCStkLotFe[0] ;
         A3356CCStkHor = H01NY2_A3356CCStkHor[0] ;
         if ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SR", "")) == 0 )
         {
            AV49Recfec = A3348CCStkFec ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49Recfec", localUtil.format(AV49Recfec, "99/99/99"));
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vRECFEC", getSecureSignedToken( sPrefix, AV49Recfec));
            /* Execute user subroutine: 'RECUENTO' */
            S153 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               if (true) return;
            }
            AV50Exis = ((AV51EntSalInv==0) ? AV44RecExiRea : AV44RecExiRea.add(AV47ComprasInv).subtract(AV48ConsumosInv)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavExis_Internalname, GXutil.ltrimstr( AV50Exis, 12, 4));
         }
         AV42CCStkDsc = A3357CCStkDsc ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkdsc_Internalname, AV42CCStkDsc);
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCCSTKDSC"+"_"+sGXsfl_103_idx, getSecureSignedToken( sPrefix+sGXsfl_103_idx, GXutil.rtrim( localUtil.format( AV42CCStkDsc, ""))));
         AV41TipMovCc = A3345TipMovCc ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTipmovcc_Internalname, AV41TipMovCc);
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTIPMOVCC"+"_"+sGXsfl_103_idx, getSecureSignedToken( sPrefix+sGXsfl_103_idx, GXutil.rtrim( localUtil.format( AV41TipMovCc, ""))));
         AV13CCStkLin = A3342CCStkLin ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstklin_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13CCStkLin), 12, 0));
         AV40DiaHora = localUtil.dtoc( A3348CCStkFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + " " + A3356CCStkHor ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDiahora_Internalname, AV40DiaHora);
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vDIAHORA"+"_"+sGXsfl_103_idx, getSecureSignedToken( sPrefix+sGXsfl_103_idx, GXutil.rtrim( localUtil.format( AV40DiaHora, ""))));
         AV24CCStkFec = A3348CCStkFec ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkfec_Internalname, localUtil.format(AV24CCStkFec, "99/99/99"));
         AV52CCStkHor = A3356CCStkHor ;
         AV53CCStkPre = A3349CCStkPre ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkpre_Internalname, GXutil.ltrimstr( AV53CCStkPre, 14, 5));
         AV54CCStkCanE = A3343CCStkCanE ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkcane_Internalname, GXutil.ltrimstr( AV54CCStkCanE, 12, 4));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCCSTKCANE"+"_"+sGXsfl_103_idx, getSecureSignedToken( sPrefix+sGXsfl_103_idx, localUtil.format( AV54CCStkCanE, "ZZZZZZ9.9999")));
         AV55CCStkCanS = A3344CCStkCanS ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkcans_Internalname, GXutil.ltrimstr( AV55CCStkCanS, 12, 4));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCCSTKCANS"+"_"+sGXsfl_103_idx, getSecureSignedToken( sPrefix+sGXsfl_103_idx, localUtil.format( AV55CCStkCanS, "ZZZZZZ9.9999")));
         AV56CCStkLot = A5722CCStkLot ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstklot_Internalname, AV56CCStkLot);
         AV57Hdr = ((A3350CCStkBar==0) ? " " : GXutil.str( A3350CCStkBar, 8, 0)+"-"+GXutil.str( A3351CCStkReo, 1, 0)+A3352CCStkPar) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHdr_Internalname, AV57Hdr);
         AV58CCStkBar = A3350CCStkBar ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkbar_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58CCStkBar), 8, 0));
         AV59CCStkReo = A3351CCStkReo ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkreo_Internalname, GXutil.str( AV59CCStkReo, 1, 0));
         AV60CCStkPar = A3352CCStkPar ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkpar_Internalname, AV60CCStkPar);
         AV62CCStkLen = A3358CCStkLen ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstklen_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62CCStkLen), 4, 0));
         AV63CCStkPed = A3353CCStkPed ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkped_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63CCStkPed), 8, 0));
         AV64CCStkUsu = A3355CCStkUsu ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkusu_Internalname, AV64CCStkUsu);
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCCSTKUSU"+"_"+sGXsfl_103_idx, getSecureSignedToken( sPrefix+sGXsfl_103_idx, GXutil.rtrim( localUtil.format( AV64CCStkUsu, "@!"))));
         AV65CCStkLotFech = A13979CCStkLotFe ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstklotfech_Internalname, localUtil.format(AV65CCStkLotFech, "99/99/99"));
         AV54CCStkCanE = ((GXutil.strcmp(A3345TipMovCc, "SR")==0) ? DecimalUtil.doubleToDec(0) : AV54CCStkCanE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkcane_Internalname, GXutil.ltrimstr( AV54CCStkCanE, 12, 4));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCCSTKCANE"+"_"+sGXsfl_103_idx, getSecureSignedToken( sPrefix+sGXsfl_103_idx, localUtil.format( AV54CCStkCanE, "ZZZZZZ9.9999")));
         AV55CCStkCanS = ((GXutil.strcmp(A3345TipMovCc, "SR")==0) ? DecimalUtil.doubleToDec(0) : AV55CCStkCanS) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkcans_Internalname, GXutil.ltrimstr( AV55CCStkCanS, 12, 4));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCCSTKCANS"+"_"+sGXsfl_103_idx, getSecureSignedToken( sPrefix+sGXsfl_103_idx, localUtil.format( AV55CCStkCanS, "ZZZZZZ9.9999")));
         AV50Exis = AV50Exis.add((AV54CCStkCanE.subtract(AV55CCStkCanS))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavExis_Internalname, GXutil.ltrimstr( AV50Exis, 12, 4));
         cmbavAccionesgrupo.removeAllItems();
         cmbavAccionesgrupo.addItem("0", ";fa fa-bars", (short)(0));
         cmbavAccionesgrupo.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "Eliminar Linea", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
         cmbavAccionesgrupo.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "Modificar Lote", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         cmbavAccionesgrupo.setColumnClass( ((GXutil.strcmp(AV41TipMovCc, "SR")==0) ? "WWActionGroupColumn WWColumnSuccess WWColumnSuccessFirstColumn" : "WWActionGroupColumn") );
         edtavCcstklin_Columnclass = ((GXutil.strcmp(AV41TipMovCc, "SR")==0) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         edtavDiahora_Columnclass = ((GXutil.strcmp(AV41TipMovCc, "SR")==0) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         edtavTipmovccwithtags_Columnclass = ((GXutil.strcmp(AV41TipMovCc, "SR")==0) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         edtavCcstkdsc_Columnclass = ((GXutil.strcmp(AV41TipMovCc, "SR")==0) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         edtavCcstkcane_Columnclass = ((GXutil.strcmp(AV41TipMovCc, "SR")==0) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         edtavCcstkcans_Columnclass = ((GXutil.strcmp(AV41TipMovCc, "SR")==0) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         edtavCcstkpre_Columnclass = ((GXutil.strcmp(AV41TipMovCc, "SR")==0) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         edtavExis_Columnclass = ((GXutil.strcmp(AV41TipMovCc, "SR")==0) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         edtavCcstklot_Columnclass = ((GXutil.strcmp(AV41TipMovCc, "SR")==0) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         edtavCcstklotfech_Columnclass = ((GXutil.strcmp(AV41TipMovCc, "SR")==0) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         edtavHdr_Columnclass = ((GXutil.strcmp(AV41TipMovCc, "SR")==0) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         edtavCcstkusu_Columnclass = ((GXutil.strcmp(AV41TipMovCc, "SR")==0) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         AV90TipMovCcWithTags = AV41TipMovCc ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTipmovccwithtags_Internalname, AV90TipMovCcWithTags);
         AV90TipMovCcWithTags += "<i class='WWPPopoverIcon TagAfterText fa fa-caret-down'></i>" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTipmovccwithtags_Internalname, AV90TipMovCcWithTags);
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(103) ;
         }
         if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
         {
            sendrow_1032( ) ;
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
         if ( isFullAjaxMode( ) && ! bGXsfl_103_Refreshing )
         {
            httpContext.doAjaxLoad(103, GridRow);
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /*  Sending Event outputs  */
      cmbavAccionesgrupo.setValue( GXutil.trim( GXutil.str( AV68AccionesGrupo, 4, 0)) );
   }

   public void e131NY2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV14ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV16ColumnsSelector.fromJSonString(AV14ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "StocksQuimicos.UPQ_CuentaCorriente_WCColumnsSelector", ((GXutil.strcmp("", AV14ColumnsSelectorXML)==0) ? "" : AV16ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV16ColumnsSelector", AV16ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV19ManageFiltersData", AV19ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e121NY2( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S162 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S132 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("StocksQuimicos.UPQ_CuentaCorriente_WCFilters")),GXutil.URLEncode(GXutil.rtrim(AV97Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV21ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21ManageFiltersExecutionStep", GXutil.str( AV21ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("StocksQuimicos.UPQ_CuentaCorriente_WCFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV21ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21ManageFiltersExecutionStep", GXutil.str( AV21ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char7 = AV20ManageFiltersXml ;
         GXv_char8[0] = GXt_char7 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "StocksQuimicos.UPQ_CuentaCorriente_WCFilters", Ddo_managefilters_Activeeventkey, GXv_char8) ;
         upq_cuentacorriente_wc_impl.this.GXt_char7 = GXv_char8[0] ;
         AV20ManageFiltersXml = GXt_char7 ;
         if ( (GXutil.strcmp("", AV20ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S162 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV97Pgmname+"GridState", AV20ManageFiltersXml) ;
            AV10GridState.fromxml(AV20ManageFiltersXml, null, null);
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S172 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV16ColumnsSelector", AV16ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV19ManageFiltersData", AV19ManageFiltersData);
   }

   public void e221NY2( )
   {
      /* Accionesgrupo_Click Routine */
      returnInSub = false ;
      if ( AV68AccionesGrupo == 1 )
      {
         /* Execute user subroutine: 'DO ELIMINAR' */
         S182 ();
         if (returnInSub) return;
      }
      else if ( AV68AccionesGrupo == 2 )
      {
         /* Execute user subroutine: 'DO MODIFICAR' */
         S192 ();
         if (returnInSub) return;
      }
      AV68AccionesGrupo = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavAccionesgrupo.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68AccionesGrupo), 4, 0));
      /*  Sending Event outputs  */
      cmbavAccionesgrupo.setValue( GXutil.trim( GXutil.str( AV68AccionesGrupo, 4, 0)) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavAccionesgrupo.getInternalname(), "Values", cmbavAccionesgrupo.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV16ColumnsSelector", AV16ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV19ManageFiltersData", AV19ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e141NY2( )
   {
      /* Dvelop_confirmpanel_eliminar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_eliminar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMINAR' */
         S202 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV16ColumnsSelector", AV16ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV19ManageFiltersData", AV19ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e151NY2( )
   {
      /* Dvelop_confirmpanel_btnauditar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_btnauditar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION AUDITAR' */
         S212 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV73ProgressIndicator", AV73ProgressIndicator);
   }

   public void e161NY2( )
   {
      /* 'DoExportExcel' Routine */
      returnInSub = false ;
      GXv_char8[0] = AV23Emprcod ;
      GXv_char3[0] = AV39PrdnumIN ;
      GXv_char2[0] = AV36PrdNom ;
      GXv_date12[0] = AV91CCstkfecfrom ;
      GXv_date13[0] = AV92CCstkfecto ;
      GXv_decimal14[0] = AV37SaldoInicial ;
      GXv_char15[0] = AV89ExcelFilename ;
      GXv_char16[0] = AV88ErrorMessage ;
      new app.upq_cuentacorriente_export(remoteHandle, context).execute( GXv_char8, GXv_char3, GXv_char2, GXv_date12, GXv_date13, GXv_decimal14, GXv_char15, GXv_char16) ;
      upq_cuentacorriente_wc_impl.this.AV23Emprcod = GXv_char8[0] ;
      upq_cuentacorriente_wc_impl.this.AV39PrdnumIN = GXv_char3[0] ;
      upq_cuentacorriente_wc_impl.this.AV36PrdNom = GXv_char2[0] ;
      upq_cuentacorriente_wc_impl.this.AV91CCstkfecfrom = GXv_date12[0] ;
      upq_cuentacorriente_wc_impl.this.AV92CCstkfecto = GXv_date13[0] ;
      upq_cuentacorriente_wc_impl.this.AV37SaldoInicial = GXv_decimal14[0] ;
      upq_cuentacorriente_wc_impl.this.AV89ExcelFilename = GXv_char15[0] ;
      upq_cuentacorriente_wc_impl.this.AV88ErrorMessage = GXv_char16[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23Emprcod", AV23Emprcod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39PrdnumIN", AV39PrdnumIN);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36PrdNom", AV36PrdNom);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91CCstkfecfrom", localUtil.format(AV91CCstkfecfrom, "99/99/99"));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92CCstkfecto", localUtil.format(AV92CCstkfecto, "99/99/99"));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37SaldoInicial", GXutil.ltrimstr( AV37SaldoInicial, 12, 4));
      if ( GXutil.strcmp(AV89ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV89ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV88ErrorMessage);
      }
      /*  Sending Event outputs  */
   }

   public void e171NY2( )
   {
      /* 'DoCSV' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.stocksquimicos.upq_cuentacorriente_exportcsv", new String[] {GXutil.URLEncode(GXutil.rtrim(AV23Emprcod)),GXutil.URLEncode(GXutil.rtrim(AV39PrdnumIN)),GXutil.URLEncode(GXutil.formatDateParm(AV91CCstkfecfrom)),GXutil.URLEncode(GXutil.formatDateParm(AV92CCstkfecto)),GXutil.URLEncode(DecimalUtil.decToString(AV37SaldoInicial))}, new String[] {"Emprcod","Prdnum","CCstkfec","CCstkfec_to","SaldoInicial"}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
   }

   public void S142( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV16ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector17[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector17, "&CCStkLin", "", "Linea", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      GXv_SdtWWPColumnsSelector17[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector17, "&DiaHora", "", "Dia Hora", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      GXv_SdtWWPColumnsSelector17[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector17, "&TipMovCc", "", "Tipo", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      GXv_SdtWWPColumnsSelector17[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector17, "&CCStkDsc", "", "Descripcion", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      GXv_SdtWWPColumnsSelector17[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector17, "&CCStkCanE", "Cantidad", "Entrada", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      GXv_SdtWWPColumnsSelector17[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector17, "&CCStkCanS", "Cantidad", "Salida", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      GXv_SdtWWPColumnsSelector17[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector17, "&CCStkPre", "", "Precio", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      GXv_SdtWWPColumnsSelector17[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector17, "&Exis", "", "Saldo", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      GXv_SdtWWPColumnsSelector17[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector17, "&CCStkLot", "", "Lote", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      GXv_SdtWWPColumnsSelector17[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector17, "&CCStkLotFech", "Fecha", "Caducidad", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      GXv_SdtWWPColumnsSelector17[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector17, "&Hdr", "", "N Hdr", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      GXv_SdtWWPColumnsSelector17[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector17, "&CCStkUsu", "", "Usuario", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      GXt_char7 = AV15UserCustomValue ;
      GXv_char16[0] = GXt_char7 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "StocksQuimicos.UPQ_CuentaCorriente_WCColumnsSelector", GXv_char16) ;
      upq_cuentacorriente_wc_impl.this.GXt_char7 = GXv_char16[0] ;
      AV15UserCustomValue = GXt_char7 ;
      if ( ! ( (GXutil.strcmp("", AV15UserCustomValue)==0) ) )
      {
         AV17ColumnsSelectorAux.fromxml(AV15UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector17[0] = AV17ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector18[0] = AV16ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector17, GXv_SdtWWPColumnsSelector18) ;
         AV17ColumnsSelectorAux = GXv_SdtWWPColumnsSelector17[0] ;
         AV16ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item19 = AV19ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item20[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item19 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "StocksQuimicos.UPQ_CuentaCorriente_WCFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item20) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item19 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item20[0] ;
      AV19ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item19 ;
   }

   public void S162( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV12FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12FilterFullText", AV12FilterFullText);
   }

   public void S182( )
   {
      /* 'DO ELIMINAR' Routine */
      returnInSub = false ;
      this.executeUsercontrolMethod(sPrefix, false, "DVELOP_CONFIRMPANEL_ELIMINARContainer", "Confirm", "", new Object[] {});
   }

   public void S202( )
   {
      /* 'DO ACTION ELIMINAR' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV42CCStkDsc, httpContext.getMessage( "Consumo Manual Almacen,wIntMov", "")) == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Esta linea, NO se puede Eliminar", ""));
      }
      else
      {
         GXv_char16[0] = AV23Emprcod ;
         GXv_char15[0] = AV39PrdnumIN ;
         GXv_int4[0] = AV13CCStkLin ;
         new app.pkccstks(remoteHandle, context).execute( GXv_char16, GXv_char15, GXv_int4) ;
         upq_cuentacorriente_wc_impl.this.AV23Emprcod = GXv_char16[0] ;
         upq_cuentacorriente_wc_impl.this.AV39PrdnumIN = GXv_char15[0] ;
         upq_cuentacorriente_wc_impl.this.AV13CCStkLin = GXv_int4[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23Emprcod", AV23Emprcod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39PrdnumIN", AV39PrdnumIN);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstklin_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13CCStkLin), 12, 0));
         AV69Inc_obs = httpContext.getMessage( "Producto ", "") + AV39PrdnumIN + " " + GXutil.trim( AV36PrdNom) + GXutil.newLine( ) ;
         AV69Inc_obs += httpContext.getMessage( "Del Rgto CCSTKS, Linea/Mov/Desc/Usua/Fecha-Hora/Cant E/Cant S =", "") + GXutil.newLine( ) ;
         AV69Inc_obs += GXutil.trim( GXutil.str( AV13CCStkLin, 12, 0)) + " " + AV41TipMovCc + " " + GXutil.newLine( ) ;
         AV69Inc_obs += GXutil.trim( AV42CCStkDsc) + " " + GXutil.trim( AV64CCStkUsu) + GXutil.newLine( ) ;
         AV69Inc_obs += AV40DiaHora + " " + GXutil.str( AV54CCStkCanE, 12, 4) + " " + GXutil.str( AV55CCStkCanS, 12, 4) + GXutil.newLine( ) ;
         new app.pctrinc(remoteHandle, context).execute( AV23Emprcod, GXutil.substring( AV97Pgmname, 1, 10), AV70Usurcod, AV71Station, AV69Inc_obs, 99999999, (byte)(0), "@") ;
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
   }

   public void S192( )
   {
      /* 'DO MODIFICAR' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV42CCStkDsc, httpContext.getMessage( "Consumo Manual Almacen,wIntMov", "")) == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Esta linea, NO se puede Modificar", ""));
      }
      else
      {
         if ( GXutil.strcmp(AV41TipMovCc, httpContext.getMessage( "SC", "")) == 0 )
         {
            httpContext.popup(formatLink("app.webwuti010", new String[] {GXutil.URLEncode(GXutil.rtrim(AV23Emprcod)),GXutil.URLEncode(GXutil.rtrim(AV39PrdnumIN)),GXutil.URLEncode(GXutil.ltrimstr(AV13CCStkLin,12,0)),GXutil.URLEncode(GXutil.ltrimstr(AV58CCStkBar,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV59CCStkReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV60CCStkPar))}, new String[] {"EmprCod","Prdnum","CCStkLin","CCStkBar","CCStkReo","CCStkpar"}) , new Object[] {"AV23Emprcod","AV39PrdnumIN","AV13CCStkLin","AV58CCStkBar","AV59CCStkReo","AV60CCStkPar"});
            gxgrgrid_refresh( subGrid_Rows, AV21ManageFiltersExecutionStep, AV16ColumnsSelector, AV97Pgmname, AV12FilterFullText, AV37SaldoInicial, A396EmprCod, A719PrdNum, A3348CCStkFec, A3356CCStkHor, AV23Emprcod, AV39PrdnumIN, AV91CCstkfecfrom, AV92CCstkfecto, A3345TipMovCc, AV51EntSalInv, AV44RecExiRea, AV47ComprasInv, AV48ConsumosInv, A3357CCStkDsc, A3342CCStkLin, A3349CCStkPre, A3343CCStkCanE, A3344CCStkCanS, A5722CCStkLot, A3350CCStkBar, A3351CCStkReo, A3352CCStkPar, A3358CCStkLen, A3353CCStkPed, A3355CCStkUsu, A13979CCStkLotFe, A810RecFec, AV49Recfec, A809RecExiTeo, A807RecExiRea, A808RecExiTcc, A806RecExiRcc, AV78Actualizardatos, AV76PwdBo, AV70Usurcod, AV71Station, AV75Password, sPrefix) ;
         }
         else if ( GXutil.strcmp(AV41TipMovCc, httpContext.getMessage( "SM", "")) == 0 )
         {
            httpContext.popup(formatLink("app.webwuti011", new String[] {GXutil.URLEncode(GXutil.rtrim(AV23Emprcod)),GXutil.URLEncode(GXutil.rtrim(AV39PrdnumIN)),GXutil.URLEncode(GXutil.ltrimstr(AV13CCStkLin,12,0)),GXutil.URLEncode(GXutil.ltrimstr(AV63CCStkPed,8,0))}, new String[] {"EmprCod","Prdnum","CCStkLin","Ccstkped"}) , new Object[] {"AV23Emprcod","AV39PrdnumIN","AV13CCStkLin","AV63CCStkPed"});
            gxgrgrid_refresh( subGrid_Rows, AV21ManageFiltersExecutionStep, AV16ColumnsSelector, AV97Pgmname, AV12FilterFullText, AV37SaldoInicial, A396EmprCod, A719PrdNum, A3348CCStkFec, A3356CCStkHor, AV23Emprcod, AV39PrdnumIN, AV91CCstkfecfrom, AV92CCstkfecto, A3345TipMovCc, AV51EntSalInv, AV44RecExiRea, AV47ComprasInv, AV48ConsumosInv, A3357CCStkDsc, A3342CCStkLin, A3349CCStkPre, A3343CCStkCanE, A3344CCStkCanS, A5722CCStkLot, A3350CCStkBar, A3351CCStkReo, A3352CCStkPar, A3358CCStkLen, A3353CCStkPed, A3355CCStkUsu, A13979CCStkLotFe, A810RecFec, AV49Recfec, A809RecExiTeo, A807RecExiRea, A808RecExiTcc, A806RecExiRcc, AV78Actualizardatos, AV76PwdBo, AV70Usurcod, AV71Station, AV75Password, sPrefix) ;
         }
         else if ( GXutil.strcmp(AV41TipMovCc, httpContext.getMessage( "EN", "")) == 0 )
         {
            httpContext.popup(formatLink("app.webwuti012", new String[] {GXutil.URLEncode(GXutil.rtrim(AV23Emprcod)),GXutil.URLEncode(GXutil.rtrim(AV39PrdnumIN)),GXutil.URLEncode(GXutil.ltrimstr(AV13CCStkLin,12,0)),GXutil.URLEncode(GXutil.ltrimstr(AV62CCStkLen,4,0))}, new String[] {"EmprCod","Prdnum","CCStkLin","CCStkLen"}) , new Object[] {"AV23Emprcod","AV39PrdnumIN","AV13CCStkLin","AV62CCStkLen"});
            gxgrgrid_refresh( subGrid_Rows, AV21ManageFiltersExecutionStep, AV16ColumnsSelector, AV97Pgmname, AV12FilterFullText, AV37SaldoInicial, A396EmprCod, A719PrdNum, A3348CCStkFec, A3356CCStkHor, AV23Emprcod, AV39PrdnumIN, AV91CCstkfecfrom, AV92CCstkfecto, A3345TipMovCc, AV51EntSalInv, AV44RecExiRea, AV47ComprasInv, AV48ConsumosInv, A3357CCStkDsc, A3342CCStkLin, A3349CCStkPre, A3343CCStkCanE, A3344CCStkCanS, A5722CCStkLot, A3350CCStkBar, A3351CCStkReo, A3352CCStkPar, A3358CCStkLen, A3353CCStkPed, A3355CCStkUsu, A13979CCStkLotFe, A810RecFec, AV49Recfec, A809RecExiTeo, A807RecExiRea, A808RecExiTcc, A806RecExiRcc, AV78Actualizardatos, AV76PwdBo, AV70Usurcod, AV71Station, AV75Password, sPrefix) ;
         }
         else if ( GXutil.strcmp(AV41TipMovCc, httpContext.getMessage( "SR", "")) == 0 )
         {
            httpContext.popup(formatLink("app.webwuti014", new String[] {GXutil.URLEncode(GXutil.rtrim(AV23Emprcod)),GXutil.URLEncode(GXutil.rtrim(AV39PrdnumIN)),GXutil.URLEncode(GXutil.ltrimstr(AV13CCStkLin,12,0)),GXutil.URLEncode(GXutil.formatDateParm(AV24CCStkFec))}, new String[] {"EmprCod","Prdnum","CCStkLin","Recfec"}) , new Object[] {"AV23Emprcod","AV39PrdnumIN","AV13CCStkLin","AV24CCStkFec"});
            httpContext.doAjaxRefreshCmp(sPrefix);
         }
      }
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV18Session.getValue(AV97Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV97Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV18Session.getValue(AV97Pgmname+"GridState"), null, null);
      }
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S172 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S172( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV98GXV1 = 1 ;
      while ( AV98GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV98GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV12FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12FilterFullText", AV12FilterFullText);
         }
         AV98GXV1 = (int)(AV98GXV1+1) ;
      }
   }

   public void S132( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV18Session.getValue(AV97Pgmname+"GridState"), null, null);
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState21[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState21, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV12FilterFullText)==0), (short)(0), AV12FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState21[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV97Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void e181NY2( )
   {
      /* Actualizardatos_Click Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV78Actualizardatos, httpContext.getMessage( "S", "")) == 0 )
      {
         AV77WebSession.setValue("ValidarWebWPwdGrl", GXutil.trim( GXutil.str( AV75Password, 10, 0)));
         /* Window Datatype Object Property */
         AV79Window.setUrl( formatLink("app.webwpwdgrl", new String[] {GXutil.URLEncode(GXutil.booltostr(AV76PwdBo))}, new String[] {"PwdBo"})  );
         AV79Window.setReturnParms(new Object[] {"AV76PwdBo",});
         httpContext.newWindow(AV79Window);
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         AV76PwdBo = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76PwdBo", AV76PwdBo);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV16ColumnsSelector", AV16ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV19ManageFiltersData", AV19ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void S153( )
   {
      /* 'RECUENTO' Routine */
      returnInSub = false ;
      AV43Recexiteo = DecimalUtil.doubleToDec(0) ;
      AV44RecExiRea = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44RecExiRea", GXutil.ltrimstr( AV44RecExiRea, 12, 4));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vRECEXIREA", getSecureSignedToken( sPrefix, localUtil.format( AV44RecExiRea, "ZZZZZZ9.9999")));
      AV45RecExiTcc = DecimalUtil.doubleToDec(0) ;
      AV46RecExiRcc = DecimalUtil.doubleToDec(0) ;
      /* Using cursor H01NY3 */
      pr_default.execute(1, new Object[] {AV23Emprcod, AV39PrdnumIN, AV49Recfec});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A810RecFec = H01NY3_A810RecFec[0] ;
         A719PrdNum = H01NY3_A719PrdNum[0] ;
         A396EmprCod = H01NY3_A396EmprCod[0] ;
         A809RecExiTeo = H01NY3_A809RecExiTeo[0] ;
         A807RecExiRea = H01NY3_A807RecExiRea[0] ;
         A808RecExiTcc = H01NY3_A808RecExiTcc[0] ;
         A806RecExiRcc = H01NY3_A806RecExiRcc[0] ;
         AV43Recexiteo = A809RecExiTeo ;
         AV44RecExiRea = A807RecExiRea ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44RecExiRea", GXutil.ltrimstr( AV44RecExiRea, 12, 4));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vRECEXIREA", getSecureSignedToken( sPrefix, localUtil.format( AV44RecExiRea, "ZZZZZZ9.9999")));
         AV45RecExiTcc = A808RecExiTcc ;
         AV46RecExiRcc = A806RecExiRcc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      GXv_char16[0] = AV23Emprcod ;
      GXv_char15[0] = AV39PrdnumIN ;
      GXv_date13[0] = AV49Recfec ;
      GXv_decimal14[0] = AV47ComprasInv ;
      GXv_decimal22[0] = AV48ConsumosInv ;
      new app.pprc124(remoteHandle, context).execute( GXv_char16, GXv_char15, GXv_date13, GXv_decimal14, GXv_decimal22) ;
      upq_cuentacorriente_wc_impl.this.AV23Emprcod = GXv_char16[0] ;
      upq_cuentacorriente_wc_impl.this.AV39PrdnumIN = GXv_char15[0] ;
      upq_cuentacorriente_wc_impl.this.AV49Recfec = GXv_date13[0] ;
      upq_cuentacorriente_wc_impl.this.AV47ComprasInv = GXv_decimal14[0] ;
      upq_cuentacorriente_wc_impl.this.AV48ConsumosInv = GXv_decimal22[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23Emprcod", AV23Emprcod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39PrdnumIN", AV39PrdnumIN);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49Recfec", localUtil.format(AV49Recfec, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vRECFEC", getSecureSignedToken( sPrefix, AV49Recfec));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47ComprasInv", GXutil.ltrimstr( AV47ComprasInv, 12, 4));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOMPRASINV", getSecureSignedToken( sPrefix, localUtil.format( AV47ComprasInv, "ZZZZZZ9.9999")));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48ConsumosInv", GXutil.ltrimstr( AV48ConsumosInv, 12, 4));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCONSUMOSINV", getSecureSignedToken( sPrefix, localUtil.format( AV48ConsumosInv, "ZZZZZZ9.9999")));
   }

   public void S212( )
   {
      /* 'DO ACTION AUDITAR' Routine */
      returnInSub = false ;
      AV73ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(1) );
      AV73ProgressIndicator.showwithtitle(httpContext.getMessage( "Informe 1, situacion de los productos......", ""));
      AV73ProgressIndicator.setgxTv_SdtProgress_Value( 20 );
      AV86i = GXutil.sleep( 1) ;
      AV82File = "" ;
      callWebObject(formatLink("app.apupq001", new String[] {GXutil.URLEncode(GXutil.rtrim(AV23Emprcod)),GXutil.URLEncode(GXutil.rtrim(AV39PrdnumIN)),GXutil.URLEncode(GXutil.rtrim(AV39PrdnumIN)),GXutil.URLEncode(GXutil.rtrim(AV81Siacumular)),GXutil.URLEncode(GXutil.rtrim(AV78Actualizardatos)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.rtrim(AV82File)),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "UPQ_CuentaCorriente", "")))}, new String[] {"Emprcod","Prdnum1","Prdnum2","Siacumular","ActDatos","CantCierre","File","PgmnameOut"}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      if ( ! AV76PwdBo )
      {
      }
      else
      {
         AV73ProgressIndicator.showwithtitle(httpContext.getMessage( "Auditoria Productos Existencias ..........", ""));
         AV73ProgressIndicator.setgxTv_SdtProgress_Value( 60 );
         AV86i = GXutil.sleep( 2) ;
         AV73ProgressIndicator.setgxTv_SdtProgress_Description( httpContext.getMessage( "(1) Producto ", "")+GXutil.trim( AV39PrdnumIN)+" "+GXutil.trim( AV36PrdNom) );
         GXv_char16[0] = AV23Emprcod ;
         GXv_char15[0] = AV39PrdnumIN ;
         GXv_char8[0] = AV81Siacumular ;
         GXv_decimal22[0] = AV83Dif ;
         GXv_decimal14[0] = AV84Dif2 ;
         GXv_char3[0] = AV85obs ;
         new app.pupq003(remoteHandle, context).execute( GXv_char16, GXv_char15, GXv_char8, GXv_decimal22, GXv_decimal14, GXv_char3) ;
         upq_cuentacorriente_wc_impl.this.AV23Emprcod = GXv_char16[0] ;
         upq_cuentacorriente_wc_impl.this.AV39PrdnumIN = GXv_char15[0] ;
         upq_cuentacorriente_wc_impl.this.AV81Siacumular = GXv_char8[0] ;
         upq_cuentacorriente_wc_impl.this.AV83Dif = GXv_decimal22[0] ;
         upq_cuentacorriente_wc_impl.this.AV84Dif2 = GXv_decimal14[0] ;
         upq_cuentacorriente_wc_impl.this.AV85obs = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23Emprcod", AV23Emprcod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39PrdnumIN", AV39PrdnumIN);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81Siacumular", AV81Siacumular);
         GXv_char16[0] = AV23Emprcod ;
         GXv_char15[0] = AV39PrdnumIN ;
         GXv_decimal22[0] = AV83Dif ;
         GXv_decimal14[0] = AV84Dif2 ;
         GXv_char8[0] = AV85obs ;
         new app.pupq002(remoteHandle, context).execute( GXv_char16, GXv_char15, GXv_decimal22, GXv_decimal14, GXv_char8) ;
         upq_cuentacorriente_wc_impl.this.AV23Emprcod = GXv_char16[0] ;
         upq_cuentacorriente_wc_impl.this.AV39PrdnumIN = GXv_char15[0] ;
         upq_cuentacorriente_wc_impl.this.AV83Dif = GXv_decimal22[0] ;
         upq_cuentacorriente_wc_impl.this.AV84Dif2 = GXv_decimal14[0] ;
         upq_cuentacorriente_wc_impl.this.AV85obs = GXv_char8[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23Emprcod", AV23Emprcod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39PrdnumIN", AV39PrdnumIN);
         new app.pcommit(remoteHandle, context).execute( ) ;
         GXv_char16[0] = AV23Emprcod ;
         GXv_char15[0] = AV39PrdnumIN ;
         new app.core.upq004(remoteHandle, context).execute( GXv_char16, GXv_char15) ;
         upq_cuentacorriente_wc_impl.this.AV23Emprcod = GXv_char16[0] ;
         upq_cuentacorriente_wc_impl.this.AV39PrdnumIN = GXv_char15[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23Emprcod", AV23Emprcod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39PrdnumIN", AV39PrdnumIN);
         AV73ProgressIndicator.setgxTv_SdtProgress_Description( httpContext.getMessage( "(2) Producto ", "")+GXutil.trim( AV39PrdnumIN)+" "+GXutil.trim( AV36PrdNom) );
         GXv_char16[0] = AV23Emprcod ;
         GXv_char15[0] = AV39PrdnumIN ;
         GXv_char8[0] = AV81Siacumular ;
         GXv_decimal22[0] = AV83Dif ;
         GXv_decimal14[0] = AV84Dif2 ;
         GXv_char3[0] = AV85obs ;
         new app.pupq003(remoteHandle, context).execute( GXv_char16, GXv_char15, GXv_char8, GXv_decimal22, GXv_decimal14, GXv_char3) ;
         upq_cuentacorriente_wc_impl.this.AV23Emprcod = GXv_char16[0] ;
         upq_cuentacorriente_wc_impl.this.AV39PrdnumIN = GXv_char15[0] ;
         upq_cuentacorriente_wc_impl.this.AV81Siacumular = GXv_char8[0] ;
         upq_cuentacorriente_wc_impl.this.AV83Dif = GXv_decimal22[0] ;
         upq_cuentacorriente_wc_impl.this.AV84Dif2 = GXv_decimal14[0] ;
         upq_cuentacorriente_wc_impl.this.AV85obs = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23Emprcod", AV23Emprcod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39PrdnumIN", AV39PrdnumIN);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81Siacumular", AV81Siacumular);
         GXv_char16[0] = AV23Emprcod ;
         GXv_char15[0] = AV39PrdnumIN ;
         GXv_decimal22[0] = AV83Dif ;
         GXv_decimal14[0] = AV84Dif2 ;
         GXv_char8[0] = AV85obs ;
         new app.pupq002(remoteHandle, context).execute( GXv_char16, GXv_char15, GXv_decimal22, GXv_decimal14, GXv_char8) ;
         upq_cuentacorriente_wc_impl.this.AV23Emprcod = GXv_char16[0] ;
         upq_cuentacorriente_wc_impl.this.AV39PrdnumIN = GXv_char15[0] ;
         upq_cuentacorriente_wc_impl.this.AV83Dif = GXv_decimal22[0] ;
         upq_cuentacorriente_wc_impl.this.AV84Dif2 = GXv_decimal14[0] ;
         upq_cuentacorriente_wc_impl.this.AV85obs = GXv_char8[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23Emprcod", AV23Emprcod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39PrdnumIN", AV39PrdnumIN);
         new app.pcommit(remoteHandle, context).execute( ) ;
         GXv_char16[0] = AV23Emprcod ;
         GXv_char15[0] = AV39PrdnumIN ;
         new app.core.upq004(remoteHandle, context).execute( GXv_char16, GXv_char15) ;
         upq_cuentacorriente_wc_impl.this.AV23Emprcod = GXv_char16[0] ;
         upq_cuentacorriente_wc_impl.this.AV39PrdnumIN = GXv_char15[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23Emprcod", AV23Emprcod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39PrdnumIN", AV39PrdnumIN);
         AV86i = GXutil.sleep( 1) ;
         AV73ProgressIndicator.showwithtitle(httpContext.getMessage( "Informe 2, situacion de los productos..........", ""));
         AV73ProgressIndicator.setgxTv_SdtProgress_Description( " " );
         AV73ProgressIndicator.setgxTv_SdtProgress_Value( 70 );
         callWebObject(formatLink("app.apupq001", new String[] {GXutil.URLEncode(GXutil.rtrim(AV23Emprcod)),GXutil.URLEncode(GXutil.rtrim(AV39PrdnumIN)),GXutil.URLEncode(GXutil.rtrim(AV39PrdnumIN)),GXutil.URLEncode(GXutil.rtrim(AV81Siacumular)),GXutil.URLEncode(GXutil.rtrim(AV78Actualizardatos)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.rtrim(AV82File)),GXutil.URLEncode(GXutil.rtrim(GXutil.substring( AV97Pgmname, 1, 10)))}, new String[] {"Emprcod","Prdnum1","Prdnum2","Siacumular","ActDatos","CantCierre","File","PgmnameOut"}) );
         httpContext.wjLocDisableFrm = (byte)(2) ;
      }
      AV73ProgressIndicator.showwithtitle(httpContext.getMessage( "Finalizado", ""));
      AV73ProgressIndicator.setgxTv_SdtProgress_Value( 100 );
      AV86i = GXutil.sleep( 1) ;
      AV73ProgressIndicator.hide();
   }

   public void wb_table3_135_1NY2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_btnauditar_Internalname, tblTabledvelop_confirmpanel_btnauditar_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_btnauditar.setProperty("Title", Dvelop_confirmpanel_btnauditar_Title);
         ucDvelop_confirmpanel_btnauditar.setProperty("ConfirmationText", Dvelop_confirmpanel_btnauditar_Confirmationtext);
         ucDvelop_confirmpanel_btnauditar.setProperty("YesButtonCaption", Dvelop_confirmpanel_btnauditar_Yesbuttoncaption);
         ucDvelop_confirmpanel_btnauditar.setProperty("NoButtonCaption", Dvelop_confirmpanel_btnauditar_Nobuttoncaption);
         ucDvelop_confirmpanel_btnauditar.setProperty("CancelButtonCaption", Dvelop_confirmpanel_btnauditar_Cancelbuttoncaption);
         ucDvelop_confirmpanel_btnauditar.setProperty("YesButtonPosition", Dvelop_confirmpanel_btnauditar_Yesbuttonposition);
         ucDvelop_confirmpanel_btnauditar.setProperty("ConfirmType", Dvelop_confirmpanel_btnauditar_Confirmtype);
         ucDvelop_confirmpanel_btnauditar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_btnauditar_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_BTNAUDITARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_BTNAUDITARContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_135_1NY2e( true) ;
      }
      else
      {
         wb_table3_135_1NY2e( false) ;
      }
   }

   public void wb_table2_130_1NY2( boolean wbgen )
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
         wb_table2_130_1NY2e( true) ;
      }
      else
      {
         wb_table2_130_1NY2e( false) ;
      }
   }

   public void wb_table1_23_1NY2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV19ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table4_28_1NY2( true) ;
      }
      else
      {
         wb_table4_28_1NY2( false) ;
      }
      return  ;
   }

   public void wb_table4_28_1NY2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_23_1NY2e( true) ;
      }
      else
      {
         wb_table1_23_1NY2e( false) ;
      }
   }

   public void wb_table4_28_1NY2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'" + sPrefix + "',false,'" + sGXsfl_103_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV12FilterFullText, GXutil.rtrim( localUtil.format( AV12FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_28_1NY2e( true) ;
      }
      else
      {
         wb_table4_28_1NY2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV23Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23Emprcod", AV23Emprcod);
      AV39PrdnumIN = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39PrdnumIN", AV39PrdnumIN);
      AV91CCstkfecfrom = (java.util.Date)getParm(obj,2,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91CCstkfecfrom", localUtil.format(AV91CCstkfecfrom, "99/99/99"));
      AV92CCstkfecto = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92CCstkfecto", localUtil.format(AV92CCstkfecto, "99/99/99"));
      AV26Compras = (java.math.BigDecimal)getParm(obj,4,TypeConstants.DECIMAL) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26Compras", GXutil.ltrimstr( AV26Compras, 12, 4));
      AV27Consumos = (java.math.BigDecimal)getParm(obj,5,TypeConstants.DECIMAL) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27Consumos", GXutil.ltrimstr( AV27Consumos, 12, 4));
      AV28Devoluciones = (java.math.BigDecimal)getParm(obj,6,TypeConstants.DECIMAL) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28Devoluciones", GXutil.ltrimstr( AV28Devoluciones, 12, 4));
      AV37SaldoInicial = (java.math.BigDecimal)getParm(obj,7,TypeConstants.DECIMAL) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37SaldoInicial", GXutil.ltrimstr( AV37SaldoInicial, 12, 4));
      AV30Existenciascuentacorriente = (java.math.BigDecimal)getParm(obj,8,TypeConstants.DECIMAL) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30Existenciascuentacorriente", GXutil.ltrimstr( AV30Existenciascuentacorriente, 12, 4));
      AV35PrdExiAlm = (java.math.BigDecimal)getParm(obj,9,TypeConstants.DECIMAL) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35PrdExiAlm", GXutil.ltrimstr( AV35PrdExiAlm, 12, 4));
      AV34PrdCanres = (java.math.BigDecimal)getParm(obj,10,TypeConstants.DECIMAL) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34PrdCanres", GXutil.ltrimstr( AV34PrdCanres, 12, 4));
      AV36PrdNom = (String)getParm(obj,11,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36PrdNom", AV36PrdNom);
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
      pa1NY2( ) ;
      ws1NY2( ) ;
      we1NY2( ) ;
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
      sCtrlAV23Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV39PrdnumIN = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV91CCstkfecfrom = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV92CCstkfecto = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV26Compras = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV27Consumos = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV28Devoluciones = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV37SaldoInicial = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV30Existenciascuentacorriente = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV35PrdExiAlm = (String)getParm(obj,9,TypeConstants.STRING) ;
      sCtrlAV34PrdCanres = (String)getParm(obj,10,TypeConstants.STRING) ;
      sCtrlAV36PrdNom = (String)getParm(obj,11,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1NY2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "stocksquimicos\\upq_cuentacorriente_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1NY2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV23Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23Emprcod", AV23Emprcod);
         AV39PrdnumIN = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39PrdnumIN", AV39PrdnumIN);
         AV91CCstkfecfrom = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91CCstkfecfrom", localUtil.format(AV91CCstkfecfrom, "99/99/99"));
         AV92CCstkfecto = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92CCstkfecto", localUtil.format(AV92CCstkfecto, "99/99/99"));
         AV26Compras = (java.math.BigDecimal)getParm(obj,6,TypeConstants.DECIMAL) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26Compras", GXutil.ltrimstr( AV26Compras, 12, 4));
         AV27Consumos = (java.math.BigDecimal)getParm(obj,7,TypeConstants.DECIMAL) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27Consumos", GXutil.ltrimstr( AV27Consumos, 12, 4));
         AV28Devoluciones = (java.math.BigDecimal)getParm(obj,8,TypeConstants.DECIMAL) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28Devoluciones", GXutil.ltrimstr( AV28Devoluciones, 12, 4));
         AV37SaldoInicial = (java.math.BigDecimal)getParm(obj,9,TypeConstants.DECIMAL) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37SaldoInicial", GXutil.ltrimstr( AV37SaldoInicial, 12, 4));
         AV30Existenciascuentacorriente = (java.math.BigDecimal)getParm(obj,10,TypeConstants.DECIMAL) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30Existenciascuentacorriente", GXutil.ltrimstr( AV30Existenciascuentacorriente, 12, 4));
         AV35PrdExiAlm = (java.math.BigDecimal)getParm(obj,11,TypeConstants.DECIMAL) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35PrdExiAlm", GXutil.ltrimstr( AV35PrdExiAlm, 12, 4));
         AV34PrdCanres = (java.math.BigDecimal)getParm(obj,12,TypeConstants.DECIMAL) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34PrdCanres", GXutil.ltrimstr( AV34PrdCanres, 12, 4));
         AV36PrdNom = (String)getParm(obj,13,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36PrdNom", AV36PrdNom);
      }
      wcpOAV23Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV23Emprcod") ;
      wcpOAV39PrdnumIN = httpContext.cgiGet( sPrefix+"wcpOAV39PrdnumIN") ;
      wcpOAV91CCstkfecfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV91CCstkfecfrom"), 0) ;
      wcpOAV92CCstkfecto = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV92CCstkfecto"), 0) ;
      wcpOAV26Compras = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV26Compras")) ;
      wcpOAV27Consumos = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV27Consumos")) ;
      wcpOAV28Devoluciones = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV28Devoluciones")) ;
      wcpOAV37SaldoInicial = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV37SaldoInicial")) ;
      wcpOAV30Existenciascuentacorriente = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV30Existenciascuentacorriente")) ;
      wcpOAV35PrdExiAlm = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV35PrdExiAlm")) ;
      wcpOAV34PrdCanres = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV34PrdCanres")) ;
      wcpOAV36PrdNom = httpContext.cgiGet( sPrefix+"wcpOAV36PrdNom") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV23Emprcod, wcpOAV23Emprcod) != 0 ) || ( GXutil.strcmp(AV39PrdnumIN, wcpOAV39PrdnumIN) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(AV91CCstkfecfrom), GXutil.resetTime(wcpOAV91CCstkfecfrom)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV92CCstkfecto), GXutil.resetTime(wcpOAV92CCstkfecto)) ) || ( DecimalUtil.compareTo(AV26Compras, wcpOAV26Compras) != 0 ) || ( DecimalUtil.compareTo(AV27Consumos, wcpOAV27Consumos) != 0 ) || ( DecimalUtil.compareTo(AV28Devoluciones, wcpOAV28Devoluciones) != 0 ) || ( DecimalUtil.compareTo(AV37SaldoInicial, wcpOAV37SaldoInicial) != 0 ) || ( DecimalUtil.compareTo(AV30Existenciascuentacorriente, wcpOAV30Existenciascuentacorriente) != 0 ) || ( DecimalUtil.compareTo(AV35PrdExiAlm, wcpOAV35PrdExiAlm) != 0 ) || ( DecimalUtil.compareTo(AV34PrdCanres, wcpOAV34PrdCanres) != 0 ) || ( GXutil.strcmp(AV36PrdNom, wcpOAV36PrdNom) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV23Emprcod = AV23Emprcod ;
      wcpOAV39PrdnumIN = AV39PrdnumIN ;
      wcpOAV91CCstkfecfrom = AV91CCstkfecfrom ;
      wcpOAV92CCstkfecto = AV92CCstkfecto ;
      wcpOAV26Compras = AV26Compras ;
      wcpOAV27Consumos = AV27Consumos ;
      wcpOAV28Devoluciones = AV28Devoluciones ;
      wcpOAV37SaldoInicial = AV37SaldoInicial ;
      wcpOAV30Existenciascuentacorriente = AV30Existenciascuentacorriente ;
      wcpOAV35PrdExiAlm = AV35PrdExiAlm ;
      wcpOAV34PrdCanres = AV34PrdCanres ;
      wcpOAV36PrdNom = AV36PrdNom ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV23Emprcod = httpContext.cgiGet( sPrefix+"AV23Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV23Emprcod) > 0 )
      {
         AV23Emprcod = httpContext.cgiGet( sCtrlAV23Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23Emprcod", AV23Emprcod);
      }
      else
      {
         AV23Emprcod = httpContext.cgiGet( sPrefix+"AV23Emprcod_PARM") ;
      }
      sCtrlAV39PrdnumIN = httpContext.cgiGet( sPrefix+"AV39PrdnumIN_CTRL") ;
      if ( GXutil.len( sCtrlAV39PrdnumIN) > 0 )
      {
         AV39PrdnumIN = httpContext.cgiGet( sCtrlAV39PrdnumIN) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39PrdnumIN", AV39PrdnumIN);
      }
      else
      {
         AV39PrdnumIN = httpContext.cgiGet( sPrefix+"AV39PrdnumIN_PARM") ;
      }
      sCtrlAV91CCstkfecfrom = httpContext.cgiGet( sPrefix+"AV91CCstkfecfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV91CCstkfecfrom) > 0 )
      {
         AV91CCstkfecfrom = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV91CCstkfecfrom), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91CCstkfecfrom", localUtil.format(AV91CCstkfecfrom, "99/99/99"));
      }
      else
      {
         AV91CCstkfecfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV91CCstkfecfrom_PARM"), 0) ;
      }
      sCtrlAV92CCstkfecto = httpContext.cgiGet( sPrefix+"AV92CCstkfecto_CTRL") ;
      if ( GXutil.len( sCtrlAV92CCstkfecto) > 0 )
      {
         AV92CCstkfecto = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV92CCstkfecto), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92CCstkfecto", localUtil.format(AV92CCstkfecto, "99/99/99"));
      }
      else
      {
         AV92CCstkfecto = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV92CCstkfecto_PARM"), 0) ;
      }
      sCtrlAV26Compras = httpContext.cgiGet( sPrefix+"AV26Compras_CTRL") ;
      if ( GXutil.len( sCtrlAV26Compras) > 0 )
      {
         AV26Compras = localUtil.ctond( httpContext.cgiGet( sCtrlAV26Compras)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26Compras", GXutil.ltrimstr( AV26Compras, 12, 4));
      }
      else
      {
         AV26Compras = localUtil.ctond( httpContext.cgiGet( sPrefix+"AV26Compras_PARM")) ;
      }
      sCtrlAV27Consumos = httpContext.cgiGet( sPrefix+"AV27Consumos_CTRL") ;
      if ( GXutil.len( sCtrlAV27Consumos) > 0 )
      {
         AV27Consumos = localUtil.ctond( httpContext.cgiGet( sCtrlAV27Consumos)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27Consumos", GXutil.ltrimstr( AV27Consumos, 12, 4));
      }
      else
      {
         AV27Consumos = localUtil.ctond( httpContext.cgiGet( sPrefix+"AV27Consumos_PARM")) ;
      }
      sCtrlAV28Devoluciones = httpContext.cgiGet( sPrefix+"AV28Devoluciones_CTRL") ;
      if ( GXutil.len( sCtrlAV28Devoluciones) > 0 )
      {
         AV28Devoluciones = localUtil.ctond( httpContext.cgiGet( sCtrlAV28Devoluciones)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28Devoluciones", GXutil.ltrimstr( AV28Devoluciones, 12, 4));
      }
      else
      {
         AV28Devoluciones = localUtil.ctond( httpContext.cgiGet( sPrefix+"AV28Devoluciones_PARM")) ;
      }
      sCtrlAV37SaldoInicial = httpContext.cgiGet( sPrefix+"AV37SaldoInicial_CTRL") ;
      if ( GXutil.len( sCtrlAV37SaldoInicial) > 0 )
      {
         AV37SaldoInicial = localUtil.ctond( httpContext.cgiGet( sCtrlAV37SaldoInicial)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37SaldoInicial", GXutil.ltrimstr( AV37SaldoInicial, 12, 4));
      }
      else
      {
         AV37SaldoInicial = localUtil.ctond( httpContext.cgiGet( sPrefix+"AV37SaldoInicial_PARM")) ;
      }
      sCtrlAV30Existenciascuentacorriente = httpContext.cgiGet( sPrefix+"AV30Existenciascuentacorriente_CTRL") ;
      if ( GXutil.len( sCtrlAV30Existenciascuentacorriente) > 0 )
      {
         AV30Existenciascuentacorriente = localUtil.ctond( httpContext.cgiGet( sCtrlAV30Existenciascuentacorriente)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30Existenciascuentacorriente", GXutil.ltrimstr( AV30Existenciascuentacorriente, 12, 4));
      }
      else
      {
         AV30Existenciascuentacorriente = localUtil.ctond( httpContext.cgiGet( sPrefix+"AV30Existenciascuentacorriente_PARM")) ;
      }
      sCtrlAV35PrdExiAlm = httpContext.cgiGet( sPrefix+"AV35PrdExiAlm_CTRL") ;
      if ( GXutil.len( sCtrlAV35PrdExiAlm) > 0 )
      {
         AV35PrdExiAlm = localUtil.ctond( httpContext.cgiGet( sCtrlAV35PrdExiAlm)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35PrdExiAlm", GXutil.ltrimstr( AV35PrdExiAlm, 12, 4));
      }
      else
      {
         AV35PrdExiAlm = localUtil.ctond( httpContext.cgiGet( sPrefix+"AV35PrdExiAlm_PARM")) ;
      }
      sCtrlAV34PrdCanres = httpContext.cgiGet( sPrefix+"AV34PrdCanres_CTRL") ;
      if ( GXutil.len( sCtrlAV34PrdCanres) > 0 )
      {
         AV34PrdCanres = localUtil.ctond( httpContext.cgiGet( sCtrlAV34PrdCanres)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34PrdCanres", GXutil.ltrimstr( AV34PrdCanres, 12, 4));
      }
      else
      {
         AV34PrdCanres = localUtil.ctond( httpContext.cgiGet( sPrefix+"AV34PrdCanres_PARM")) ;
      }
      sCtrlAV36PrdNom = httpContext.cgiGet( sPrefix+"AV36PrdNom_CTRL") ;
      if ( GXutil.len( sCtrlAV36PrdNom) > 0 )
      {
         AV36PrdNom = httpContext.cgiGet( sCtrlAV36PrdNom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36PrdNom", AV36PrdNom);
      }
      else
      {
         AV36PrdNom = httpContext.cgiGet( sPrefix+"AV36PrdNom_PARM") ;
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
      pa1NY2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1NY2( ) ;
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
      ws1NY2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV23Emprcod_PARM", GXutil.rtrim( AV23Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV23Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV23Emprcod_CTRL", GXutil.rtrim( sCtrlAV23Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV39PrdnumIN_PARM", GXutil.rtrim( AV39PrdnumIN));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV39PrdnumIN)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV39PrdnumIN_CTRL", GXutil.rtrim( sCtrlAV39PrdnumIN));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV91CCstkfecfrom_PARM", localUtil.dtoc( AV91CCstkfecfrom, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV91CCstkfecfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV91CCstkfecfrom_CTRL", GXutil.rtrim( sCtrlAV91CCstkfecfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV92CCstkfecto_PARM", localUtil.dtoc( AV92CCstkfecto, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV92CCstkfecto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV92CCstkfecto_CTRL", GXutil.rtrim( sCtrlAV92CCstkfecto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV26Compras_PARM", GXutil.ltrim( localUtil.ntoc( AV26Compras, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV26Compras)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV26Compras_CTRL", GXutil.rtrim( sCtrlAV26Compras));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV27Consumos_PARM", GXutil.ltrim( localUtil.ntoc( AV27Consumos, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV27Consumos)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV27Consumos_CTRL", GXutil.rtrim( sCtrlAV27Consumos));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV28Devoluciones_PARM", GXutil.ltrim( localUtil.ntoc( AV28Devoluciones, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV28Devoluciones)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV28Devoluciones_CTRL", GXutil.rtrim( sCtrlAV28Devoluciones));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV37SaldoInicial_PARM", GXutil.ltrim( localUtil.ntoc( AV37SaldoInicial, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV37SaldoInicial)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV37SaldoInicial_CTRL", GXutil.rtrim( sCtrlAV37SaldoInicial));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV30Existenciascuentacorriente_PARM", GXutil.ltrim( localUtil.ntoc( AV30Existenciascuentacorriente, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV30Existenciascuentacorriente)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV30Existenciascuentacorriente_CTRL", GXutil.rtrim( sCtrlAV30Existenciascuentacorriente));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV35PrdExiAlm_PARM", GXutil.ltrim( localUtil.ntoc( AV35PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV35PrdExiAlm)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV35PrdExiAlm_CTRL", GXutil.rtrim( sCtrlAV35PrdExiAlm));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV34PrdCanres_PARM", GXutil.ltrim( localUtil.ntoc( AV34PrdCanres, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV34PrdCanres)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV34PrdCanres_CTRL", GXutil.rtrim( sCtrlAV34PrdCanres));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV36PrdNom_PARM", GXutil.rtrim( AV36PrdNom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV36PrdNom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV36PrdNom_CTRL", GXutil.rtrim( sCtrlAV36PrdNom));
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
      we1NY2( ) ;
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
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("calendar-system.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211556684", true, true);
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
      httpContext.AddJavascriptSource("stocksquimicos/upq_cuentacorriente_wc.js", "?20268211556684", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Popover/WWPPopoverRender.js", "", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_1032( )
   {
      cmbavAccionesgrupo.setInternalname( sPrefix+"vACCIONESGRUPO_"+sGXsfl_103_idx );
      edtavCcstklin_Internalname = sPrefix+"vCCSTKLIN_"+sGXsfl_103_idx ;
      edtavDiahora_Internalname = sPrefix+"vDIAHORA_"+sGXsfl_103_idx ;
      edtavTipmovccwithtags_Internalname = sPrefix+"vTIPMOVCCWITHTAGS_"+sGXsfl_103_idx ;
      edtavTipmovcc_Internalname = sPrefix+"vTIPMOVCC_"+sGXsfl_103_idx ;
      edtavCcstkdsc_Internalname = sPrefix+"vCCSTKDSC_"+sGXsfl_103_idx ;
      edtavCcstkcane_Internalname = sPrefix+"vCCSTKCANE_"+sGXsfl_103_idx ;
      edtavCcstkcans_Internalname = sPrefix+"vCCSTKCANS_"+sGXsfl_103_idx ;
      edtavCcstkpre_Internalname = sPrefix+"vCCSTKPRE_"+sGXsfl_103_idx ;
      edtavExis_Internalname = sPrefix+"vEXIS_"+sGXsfl_103_idx ;
      edtavCcstklot_Internalname = sPrefix+"vCCSTKLOT_"+sGXsfl_103_idx ;
      edtavCcstklotfech_Internalname = sPrefix+"vCCSTKLOTFECH_"+sGXsfl_103_idx ;
      edtavHdr_Internalname = sPrefix+"vHDR_"+sGXsfl_103_idx ;
      edtavCcstkusu_Internalname = sPrefix+"vCCSTKUSU_"+sGXsfl_103_idx ;
      edtavCcstkbar_Internalname = sPrefix+"vCCSTKBAR_"+sGXsfl_103_idx ;
      edtavCcstkreo_Internalname = sPrefix+"vCCSTKREO_"+sGXsfl_103_idx ;
      edtavCcstkpar_Internalname = sPrefix+"vCCSTKPAR_"+sGXsfl_103_idx ;
      edtavCcstkped_Internalname = sPrefix+"vCCSTKPED_"+sGXsfl_103_idx ;
      edtavCcstklen_Internalname = sPrefix+"vCCSTKLEN_"+sGXsfl_103_idx ;
      edtavCcstkfec_Internalname = sPrefix+"vCCSTKFEC_"+sGXsfl_103_idx ;
   }

   public void subsflControlProps_fel_1032( )
   {
      cmbavAccionesgrupo.setInternalname( sPrefix+"vACCIONESGRUPO_"+sGXsfl_103_fel_idx );
      edtavCcstklin_Internalname = sPrefix+"vCCSTKLIN_"+sGXsfl_103_fel_idx ;
      edtavDiahora_Internalname = sPrefix+"vDIAHORA_"+sGXsfl_103_fel_idx ;
      edtavTipmovccwithtags_Internalname = sPrefix+"vTIPMOVCCWITHTAGS_"+sGXsfl_103_fel_idx ;
      edtavTipmovcc_Internalname = sPrefix+"vTIPMOVCC_"+sGXsfl_103_fel_idx ;
      edtavCcstkdsc_Internalname = sPrefix+"vCCSTKDSC_"+sGXsfl_103_fel_idx ;
      edtavCcstkcane_Internalname = sPrefix+"vCCSTKCANE_"+sGXsfl_103_fel_idx ;
      edtavCcstkcans_Internalname = sPrefix+"vCCSTKCANS_"+sGXsfl_103_fel_idx ;
      edtavCcstkpre_Internalname = sPrefix+"vCCSTKPRE_"+sGXsfl_103_fel_idx ;
      edtavExis_Internalname = sPrefix+"vEXIS_"+sGXsfl_103_fel_idx ;
      edtavCcstklot_Internalname = sPrefix+"vCCSTKLOT_"+sGXsfl_103_fel_idx ;
      edtavCcstklotfech_Internalname = sPrefix+"vCCSTKLOTFECH_"+sGXsfl_103_fel_idx ;
      edtavHdr_Internalname = sPrefix+"vHDR_"+sGXsfl_103_fel_idx ;
      edtavCcstkusu_Internalname = sPrefix+"vCCSTKUSU_"+sGXsfl_103_fel_idx ;
      edtavCcstkbar_Internalname = sPrefix+"vCCSTKBAR_"+sGXsfl_103_fel_idx ;
      edtavCcstkreo_Internalname = sPrefix+"vCCSTKREO_"+sGXsfl_103_fel_idx ;
      edtavCcstkpar_Internalname = sPrefix+"vCCSTKPAR_"+sGXsfl_103_fel_idx ;
      edtavCcstkped_Internalname = sPrefix+"vCCSTKPED_"+sGXsfl_103_fel_idx ;
      edtavCcstklen_Internalname = sPrefix+"vCCSTKLEN_"+sGXsfl_103_fel_idx ;
      edtavCcstkfec_Internalname = sPrefix+"vCCSTKFEC_"+sGXsfl_103_fel_idx ;
   }

   public void sendrow_1032( )
   {
      subsflControlProps_1032( ) ;
      wb1NY0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_103_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_103_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_103_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavAccionesgrupo.getEnabled()!=0)&&(cmbavAccionesgrupo.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 104,'"+sPrefix+"',false,'"+sGXsfl_103_idx+"',103)\"" : " ") ;
         if ( ( cmbavAccionesgrupo.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vACCIONESGRUPO_" + sGXsfl_103_idx ;
            cmbavAccionesgrupo.setName( GXCCtl );
            cmbavAccionesgrupo.setWebtags( "" );
            if ( cmbavAccionesgrupo.getItemCount() > 0 )
            {
               AV68AccionesGrupo = (short)(GXutil.lval( cmbavAccionesgrupo.getValidValue(GXutil.trim( GXutil.str( AV68AccionesGrupo, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavAccionesgrupo.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68AccionesGrupo), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavAccionesgrupo,cmbavAccionesgrupo.getInternalname(),GXutil.trim( GXutil.str( AV68AccionesGrupo, 4, 0)),Integer.valueOf(1),cmbavAccionesgrupo.getJsonclick(),Integer.valueOf(5),"'"+sPrefix+"'"+",false,"+"'"+sPrefix+"EVACCIONESGRUPO.CLICK."+sGXsfl_103_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO",cmbavAccionesgrupo.getColumnClass(),cmbavAccionesgrupo.getColumnHeaderClass(),TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavAccionesgrupo.getEnabled()!=0)&&(cmbavAccionesgrupo.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,104);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavAccionesgrupo.setValue( GXutil.trim( GXutil.str( AV68AccionesGrupo, 4, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavAccionesgrupo.getInternalname(), "Values", cmbavAccionesgrupo.ToJavascriptSource(), !bGXsfl_103_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCcstklin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCcstklin_Enabled!=0)&&(edtavCcstklin_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 105,'"+sPrefix+"',false,'"+sGXsfl_103_idx+"',103)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCcstklin_Internalname,GXutil.ltrim( localUtil.ntoc( AV13CCStkLin, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCcstklin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV13CCStkLin), "ZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV13CCStkLin), "ZZZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavCcstklin_Enabled!=0)&&(edtavCcstklin_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,105);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCcstklin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavCcstklin_Columnclass,edtavCcstklin_Columnheaderclass,Integer.valueOf(edtavCcstklin_Visible),Integer.valueOf(edtavCcstklin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(103),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavDiahora_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavDiahora_Enabled!=0)&&(edtavDiahora_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 106,'"+sPrefix+"',false,'"+sGXsfl_103_idx+"',103)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDiahora_Internalname,GXutil.rtrim( AV40DiaHora),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavDiahora_Enabled!=0)&&(edtavDiahora_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,106);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDiahora_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavDiahora_Columnclass,edtavDiahora_Columnheaderclass,Integer.valueOf(edtavDiahora_Visible),Integer.valueOf(edtavDiahora_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(103),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavTipmovccwithtags_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavTipmovccwithtags_Enabled!=0)&&(edtavTipmovccwithtags_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 107,'"+sPrefix+"',false,'"+sGXsfl_103_idx+"',103)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTipmovccwithtags_Internalname,AV90TipMovCcWithTags,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavTipmovccwithtags_Enabled!=0)&&(edtavTipmovccwithtags_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,107);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavTipmovccwithtags_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavTipmovccwithtags_Columnclass,edtavTipmovccwithtags_Columnheaderclass,Integer.valueOf(edtavTipmovccwithtags_Visible),Integer.valueOf(edtavTipmovccwithtags_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(103),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavTipmovcc_Enabled!=0)&&(edtavTipmovcc_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 108,'"+sPrefix+"',false,'"+sGXsfl_103_idx+"',103)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTipmovcc_Internalname,GXutil.rtrim( AV41TipMovCc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavTipmovcc_Enabled!=0)&&(edtavTipmovcc_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,108);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+"e231ny2_client"+"'","","","","",edtavTipmovcc_Jsonclick,Integer.valueOf(7),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavTipmovcc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(103),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavCcstkdsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCcstkdsc_Enabled!=0)&&(edtavCcstkdsc_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 109,'"+sPrefix+"',false,'"+sGXsfl_103_idx+"',103)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCcstkdsc_Internalname,GXutil.rtrim( AV42CCStkDsc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavCcstkdsc_Enabled!=0)&&(edtavCcstkdsc_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,109);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCcstkdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavCcstkdsc_Columnclass,edtavCcstkdsc_Columnheaderclass,Integer.valueOf(edtavCcstkdsc_Visible),Integer.valueOf(edtavCcstkdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(103),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCcstkcane_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCcstkcane_Enabled!=0)&&(edtavCcstkcane_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 110,'"+sPrefix+"',false,'"+sGXsfl_103_idx+"',103)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCcstkcane_Internalname,GXutil.ltrim( localUtil.ntoc( AV54CCStkCanE, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCcstkcane_Enabled!=0) ? localUtil.format( AV54CCStkCanE, "ZZZZZZ9.9999") : localUtil.format( AV54CCStkCanE, "ZZZZZZ9.9999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+((edtavCcstkcane_Enabled!=0)&&(edtavCcstkcane_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,110);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCcstkcane_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavCcstkcane_Columnclass,edtavCcstkcane_Columnheaderclass,Integer.valueOf(edtavCcstkcane_Visible),Integer.valueOf(edtavCcstkcane_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(103),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCcstkcans_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCcstkcans_Enabled!=0)&&(edtavCcstkcans_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 111,'"+sPrefix+"',false,'"+sGXsfl_103_idx+"',103)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCcstkcans_Internalname,GXutil.ltrim( localUtil.ntoc( AV55CCStkCanS, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCcstkcans_Enabled!=0) ? localUtil.format( AV55CCStkCanS, "ZZZZZZ9.9999") : localUtil.format( AV55CCStkCanS, "ZZZZZZ9.9999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+((edtavCcstkcans_Enabled!=0)&&(edtavCcstkcans_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,111);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCcstkcans_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavCcstkcans_Columnclass,edtavCcstkcans_Columnheaderclass,Integer.valueOf(edtavCcstkcans_Visible),Integer.valueOf(edtavCcstkcans_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(103),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCcstkpre_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCcstkpre_Enabled!=0)&&(edtavCcstkpre_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 112,'"+sPrefix+"',false,'"+sGXsfl_103_idx+"',103)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCcstkpre_Internalname,GXutil.ltrim( localUtil.ntoc( AV53CCStkPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCcstkpre_Enabled!=0) ? localUtil.format( AV53CCStkPre, "ZZZZZZZ9.999") : localUtil.format( AV53CCStkPre, "ZZZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+((edtavCcstkpre_Enabled!=0)&&(edtavCcstkpre_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,112);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCcstkpre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavCcstkpre_Columnclass,edtavCcstkpre_Columnheaderclass,Integer.valueOf(edtavCcstkpre_Visible),Integer.valueOf(edtavCcstkpre_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(103),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavExis_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavExis_Enabled!=0)&&(edtavExis_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 113,'"+sPrefix+"',false,'"+sGXsfl_103_idx+"',103)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavExis_Internalname,GXutil.ltrim( localUtil.ntoc( AV50Exis, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavExis_Enabled!=0) ? localUtil.format( AV50Exis, "ZZZZZZ9.9999") : localUtil.format( AV50Exis, "ZZZZZZ9.9999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+((edtavExis_Enabled!=0)&&(edtavExis_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,113);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavExis_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavExis_Columnclass,edtavExis_Columnheaderclass,Integer.valueOf(edtavExis_Visible),Integer.valueOf(edtavExis_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(103),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavCcstklot_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCcstklot_Enabled!=0)&&(edtavCcstklot_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 114,'"+sPrefix+"',false,'"+sGXsfl_103_idx+"',103)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCcstklot_Internalname,GXutil.rtrim( AV56CCStkLot),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavCcstklot_Enabled!=0)&&(edtavCcstklot_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,114);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCcstklot_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavCcstklot_Columnclass,edtavCcstklot_Columnheaderclass,Integer.valueOf(edtavCcstklot_Visible),Integer.valueOf(edtavCcstklot_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(103),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCcstklotfech_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCcstklotfech_Enabled!=0)&&(edtavCcstklotfech_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 115,'"+sPrefix+"',false,'"+sGXsfl_103_idx+"',103)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCcstklotfech_Internalname,localUtil.format(AV65CCStkLotFech, "99/99/99"),localUtil.format( AV65CCStkLotFech, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+((edtavCcstklotfech_Enabled!=0)&&(edtavCcstklotfech_Visible!=0) ? " onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,115);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCcstklotfech_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavCcstklotfech_Columnclass,edtavCcstklotfech_Columnheaderclass,Integer.valueOf(edtavCcstklotfech_Visible),Integer.valueOf(edtavCcstklotfech_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(103),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavHdr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavHdr_Enabled!=0)&&(edtavHdr_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 116,'"+sPrefix+"',false,'"+sGXsfl_103_idx+"',103)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr_Internalname,GXutil.rtrim( AV57Hdr),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavHdr_Enabled!=0)&&(edtavHdr_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,116);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavHdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavHdr_Columnclass,edtavHdr_Columnheaderclass,Integer.valueOf(edtavHdr_Visible),Integer.valueOf(edtavHdr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(103),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavCcstkusu_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCcstkusu_Enabled!=0)&&(edtavCcstkusu_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 117,'"+sPrefix+"',false,'"+sGXsfl_103_idx+"',103)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCcstkusu_Internalname,GXutil.rtrim( AV64CCStkUsu),GXutil.rtrim( localUtil.format( AV64CCStkUsu, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+((edtavCcstkusu_Enabled!=0)&&(edtavCcstkusu_Visible!=0) ? " onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,117);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCcstkusu_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavCcstkusu_Columnclass,edtavCcstkusu_Columnheaderclass,Integer.valueOf(edtavCcstkusu_Visible),Integer.valueOf(edtavCcstkusu_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(103),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCcstkbar_Enabled!=0)&&(edtavCcstkbar_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 118,'"+sPrefix+"',false,'"+sGXsfl_103_idx+"',103)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCcstkbar_Internalname,GXutil.ltrim( localUtil.ntoc( AV58CCStkBar, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCcstkbar_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV58CCStkBar), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV58CCStkBar), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavCcstkbar_Enabled!=0)&&(edtavCcstkbar_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,118);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCcstkbar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavCcstkbar_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(103),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCcstkreo_Enabled!=0)&&(edtavCcstkreo_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 119,'"+sPrefix+"',false,'"+sGXsfl_103_idx+"',103)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCcstkreo_Internalname,GXutil.ltrim( localUtil.ntoc( AV59CCStkReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCcstkreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV59CCStkReo), "9") : localUtil.format( DecimalUtil.doubleToDec(AV59CCStkReo), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavCcstkreo_Enabled!=0)&&(edtavCcstkreo_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,119);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCcstkreo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavCcstkreo_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(103),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCcstkpar_Enabled!=0)&&(edtavCcstkpar_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 120,'"+sPrefix+"',false,'"+sGXsfl_103_idx+"',103)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCcstkpar_Internalname,GXutil.rtrim( AV60CCStkPar),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavCcstkpar_Enabled!=0)&&(edtavCcstkpar_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,120);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCcstkpar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavCcstkpar_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(103),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCcstkped_Enabled!=0)&&(edtavCcstkped_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 121,'"+sPrefix+"',false,'"+sGXsfl_103_idx+"',103)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCcstkped_Internalname,GXutil.ltrim( localUtil.ntoc( AV63CCStkPed, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCcstkped_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV63CCStkPed), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV63CCStkPed), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavCcstkped_Enabled!=0)&&(edtavCcstkped_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,121);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCcstkped_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavCcstkped_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(103),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCcstklen_Enabled!=0)&&(edtavCcstklen_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 122,'"+sPrefix+"',false,'"+sGXsfl_103_idx+"',103)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCcstklen_Internalname,GXutil.ltrim( localUtil.ntoc( AV62CCStkLen, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCcstklen_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV62CCStkLen), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV62CCStkLen), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavCcstklen_Enabled!=0)&&(edtavCcstklen_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,122);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCcstklen_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavCcstklen_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(103),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCcstkfec_Enabled!=0)&&(edtavCcstkfec_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 123,'"+sPrefix+"',false,'"+sGXsfl_103_idx+"',103)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCcstkfec_Internalname,localUtil.format(AV24CCStkFec, "99/99/99"),localUtil.format( AV24CCStkFec, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+((edtavCcstkfec_Enabled!=0)&&(edtavCcstkfec_Visible!=0) ? " onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,123);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCcstkfec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavCcstkfec_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(103),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1NY2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_103_idx = ((subGrid_Islastpage==1)&&(nGXsfl_103_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_103_idx+1) ;
         sGXsfl_103_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_103_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1032( ) ;
      }
      /* End function sendrow_1032 */
   }

   public void startgridcontrol103( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"103\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"ConvertToDDO"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCcstklin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavDiahora_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Dia Hora", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavTipmovccwithtags_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCcstkdsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCcstkcane_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Entrada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCcstkcans_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Salida", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCcstkpre_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Precio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavExis_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Saldo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCcstklot_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Lote", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCcstklotfech_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Caducidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavHdr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCcstkusu_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Usuario", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV68AccionesGrupo, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( cmbavAccionesgrupo.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( cmbavAccionesgrupo.getColumnHeaderClass()));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV13CCStkLin, (byte)(12), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavCcstklin_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavCcstklin_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCcstklin_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCcstklin_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV40DiaHora));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavDiahora_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavDiahora_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDiahora_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavDiahora_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", AV90TipMovCcWithTags);
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavTipmovccwithtags_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavTipmovccwithtags_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTipmovccwithtags_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavTipmovccwithtags_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV41TipMovCc));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTipmovcc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV42CCStkDsc));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavCcstkdsc_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavCcstkdsc_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCcstkdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCcstkdsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV54CCStkCanE, (byte)(12), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavCcstkcane_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavCcstkcane_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCcstkcane_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCcstkcane_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV55CCStkCanS, (byte)(12), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavCcstkcans_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavCcstkcans_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCcstkcans_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCcstkcans_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV53CCStkPre, (byte)(14), (byte)(5), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavCcstkpre_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavCcstkpre_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCcstkpre_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCcstkpre_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV50Exis, (byte)(12), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavExis_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavExis_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavExis_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavExis_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV56CCStkLot));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavCcstklot_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavCcstklot_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCcstklot_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCcstklot_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(AV65CCStkLotFech, "99/99/99"));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavCcstklotfech_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavCcstklotfech_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCcstklotfech_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCcstklotfech_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV57Hdr));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavHdr_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavHdr_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHdr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavHdr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV64CCStkUsu));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavCcstkusu_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavCcstkusu_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCcstkusu_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCcstkusu_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV58CCStkBar, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCcstkbar_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV59CCStkReo, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCcstkreo_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV60CCStkPar));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCcstkpar_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV63CCStkPed, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCcstkped_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV62CCStkLen, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCcstklen_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(AV24CCStkFec, "99/99/99"));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCcstkfec_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      bttBtnexportexcel_Internalname = sPrefix+"BTNEXPORTEXCEL" ;
      bttBtncsv_Internalname = sPrefix+"BTNCSV" ;
      bttBtneditcolumns_Internalname = sPrefix+"BTNEDITCOLUMNS" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      Ddo_managefilters_Internalname = sPrefix+"DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = sPrefix+"vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = sPrefix+"TABLEFILTERS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      edtavSaldoinicialafecha_Internalname = sPrefix+"vSALDOINICIALAFECHA" ;
      divSaldoinicial_Internalname = sPrefix+"SALDOINICIAL" ;
      grpUnnamedgroup1_Internalname = sPrefix+"UNNAMEDGROUP1" ;
      edtavExistenciascuentacorriente_Internalname = sPrefix+"vEXISTENCIASCUENTACORRIENTE" ;
      edtavPrdexialm_Internalname = sPrefix+"vPRDEXIALM" ;
      edtavExistenciasdif_Internalname = sPrefix+"vEXISTENCIASDIF" ;
      bttBtnauditar_Internalname = sPrefix+"BTNAUDITAR" ;
      chkavActualizardatos.setInternalname( sPrefix+"vACTUALIZARDATOS" );
      chkavPwdbo.setInternalname( sPrefix+"vPWDBO" );
      divUnnamedtable4_Internalname = sPrefix+"UNNAMEDTABLE4" ;
      divControlexistencias_Internalname = sPrefix+"CONTROLEXISTENCIAS" ;
      grpUnnamedgroup2_Internalname = sPrefix+"UNNAMEDGROUP2" ;
      edtavCompras_Internalname = sPrefix+"vCOMPRAS" ;
      edtavConsumos_Internalname = sPrefix+"vCONSUMOS" ;
      edtavDevoluciones_Internalname = sPrefix+"vDEVOLUCIONES" ;
      divResumenmovimientos_Internalname = sPrefix+"RESUMENMOVIMIENTOS" ;
      grpUnnamedgroup3_Internalname = sPrefix+"UNNAMEDGROUP3" ;
      divInformacion_Internalname = sPrefix+"INFORMACION" ;
      Dvpanel_informacion_Internalname = sPrefix+"DVPANEL_INFORMACION" ;
      cmbavAccionesgrupo.setInternalname( sPrefix+"vACCIONESGRUPO" );
      edtavCcstklin_Internalname = sPrefix+"vCCSTKLIN" ;
      edtavDiahora_Internalname = sPrefix+"vDIAHORA" ;
      edtavTipmovccwithtags_Internalname = sPrefix+"vTIPMOVCCWITHTAGS" ;
      edtavTipmovcc_Internalname = sPrefix+"vTIPMOVCC" ;
      edtavCcstkdsc_Internalname = sPrefix+"vCCSTKDSC" ;
      edtavCcstkcane_Internalname = sPrefix+"vCCSTKCANE" ;
      edtavCcstkcans_Internalname = sPrefix+"vCCSTKCANS" ;
      edtavCcstkpre_Internalname = sPrefix+"vCCSTKPRE" ;
      edtavExis_Internalname = sPrefix+"vEXIS" ;
      edtavCcstklot_Internalname = sPrefix+"vCCSTKLOT" ;
      edtavCcstklotfech_Internalname = sPrefix+"vCCSTKLOTFECH" ;
      edtavHdr_Internalname = sPrefix+"vHDR" ;
      edtavCcstkusu_Internalname = sPrefix+"vCCSTKUSU" ;
      edtavCcstkbar_Internalname = sPrefix+"vCCSTKBAR" ;
      edtavCcstkreo_Internalname = sPrefix+"vCCSTKREO" ;
      edtavCcstkpar_Internalname = sPrefix+"vCCSTKPAR" ;
      edtavCcstkped_Internalname = sPrefix+"vCCSTKPED" ;
      edtavCcstklen_Internalname = sPrefix+"vCCSTKLEN" ;
      edtavCcstkfec_Internalname = sPrefix+"vCCSTKFEC" ;
      divMovimientos_Internalname = sPrefix+"MOVIMIENTOS" ;
      Dvpanel_movimientos_Internalname = sPrefix+"DVPANEL_MOVIMIENTOS" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Popover_tipmovcc_Internalname = sPrefix+"POPOVER_TIPMOVCC" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      Dvelop_confirmpanel_eliminar_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR" ;
      tblTabledvelop_confirmpanel_eliminar_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_ELIMINAR" ;
      Dvelop_confirmpanel_btnauditar_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_BTNAUDITAR" ;
      tblTabledvelop_confirmpanel_btnauditar_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_BTNAUDITAR" ;
      Grid_titlescategories_Internalname = sPrefix+"GRID_TITLESCATEGORIES" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
      divDiv_wwpauxwc_Internalname = sPrefix+"DIV_WWPAUXWC" ;
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
      edtavCcstkfec_Jsonclick = "" ;
      edtavCcstkfec_Visible = 0 ;
      edtavCcstkfec_Enabled = 1 ;
      edtavCcstklen_Jsonclick = "" ;
      edtavCcstklen_Visible = 0 ;
      edtavCcstklen_Enabled = 1 ;
      edtavCcstkped_Jsonclick = "" ;
      edtavCcstkped_Visible = 0 ;
      edtavCcstkped_Enabled = 1 ;
      edtavCcstkpar_Jsonclick = "" ;
      edtavCcstkpar_Visible = 0 ;
      edtavCcstkpar_Enabled = 1 ;
      edtavCcstkreo_Jsonclick = "" ;
      edtavCcstkreo_Visible = 0 ;
      edtavCcstkreo_Enabled = 1 ;
      edtavCcstkbar_Jsonclick = "" ;
      edtavCcstkbar_Visible = 0 ;
      edtavCcstkbar_Enabled = 1 ;
      edtavCcstkusu_Jsonclick = "" ;
      edtavCcstkusu_Columnclass = "WWColumn" ;
      edtavCcstkusu_Enabled = 1 ;
      edtavHdr_Jsonclick = "" ;
      edtavHdr_Columnclass = "WWColumn" ;
      edtavHdr_Enabled = 1 ;
      edtavCcstklotfech_Jsonclick = "" ;
      edtavCcstklotfech_Columnclass = "WWColumn" ;
      edtavCcstklotfech_Enabled = 1 ;
      edtavCcstklot_Jsonclick = "" ;
      edtavCcstklot_Columnclass = "WWColumn" ;
      edtavCcstklot_Enabled = 1 ;
      edtavExis_Jsonclick = "" ;
      edtavExis_Columnclass = "WWColumn" ;
      edtavExis_Enabled = 1 ;
      edtavCcstkpre_Jsonclick = "" ;
      edtavCcstkpre_Columnclass = "WWColumn" ;
      edtavCcstkpre_Enabled = 1 ;
      edtavCcstkcans_Jsonclick = "" ;
      edtavCcstkcans_Columnclass = "WWColumn" ;
      edtavCcstkcans_Enabled = 1 ;
      edtavCcstkcane_Jsonclick = "" ;
      edtavCcstkcane_Columnclass = "WWColumn" ;
      edtavCcstkcane_Enabled = 1 ;
      edtavCcstkdsc_Jsonclick = "" ;
      edtavCcstkdsc_Columnclass = "WWColumn" ;
      edtavCcstkdsc_Enabled = 1 ;
      edtavTipmovcc_Jsonclick = "" ;
      edtavTipmovcc_Visible = 0 ;
      edtavTipmovcc_Enabled = 1 ;
      edtavTipmovccwithtags_Jsonclick = "" ;
      edtavTipmovccwithtags_Columnclass = "WWColumn" ;
      edtavTipmovccwithtags_Enabled = 1 ;
      edtavDiahora_Jsonclick = "" ;
      edtavDiahora_Columnclass = "WWColumn" ;
      edtavDiahora_Enabled = 1 ;
      edtavCcstklin_Jsonclick = "" ;
      edtavCcstklin_Columnclass = "WWColumn" ;
      edtavCcstklin_Enabled = 1 ;
      cmbavAccionesgrupo.setJsonclick( "" );
      cmbavAccionesgrupo.setVisible( -1 );
      cmbavAccionesgrupo.setEnabled( 1 );
      cmbavAccionesgrupo.setColumnClass( "WWActionGroupColumn" );
      subGrid_Class = "GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtavCcstkusu_Columnheaderclass = "" ;
      edtavHdr_Columnheaderclass = "" ;
      edtavCcstklotfech_Columnheaderclass = "" ;
      edtavCcstklot_Columnheaderclass = "" ;
      edtavExis_Columnheaderclass = "" ;
      edtavCcstkpre_Columnheaderclass = "" ;
      edtavCcstkcans_Columnheaderclass = "" ;
      edtavCcstkcane_Columnheaderclass = "" ;
      edtavCcstkdsc_Columnheaderclass = "" ;
      edtavTipmovccwithtags_Columnheaderclass = "" ;
      edtavDiahora_Columnheaderclass = "" ;
      edtavCcstklin_Columnheaderclass = "" ;
      cmbavAccionesgrupo.setColumnHeaderClass( "" );
      edtavCcstkusu_Visible = -1 ;
      edtavHdr_Visible = -1 ;
      edtavCcstklotfech_Visible = -1 ;
      edtavCcstklot_Visible = -1 ;
      edtavExis_Visible = -1 ;
      edtavCcstkpre_Visible = -1 ;
      edtavCcstkcans_Visible = -1 ;
      edtavCcstkcane_Visible = -1 ;
      edtavCcstkdsc_Visible = -1 ;
      edtavTipmovccwithtags_Visible = -1 ;
      edtavDiahora_Visible = -1 ;
      edtavCcstklin_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDevoluciones_Jsonclick = "" ;
      edtavDevoluciones_Enabled = 0 ;
      edtavConsumos_Jsonclick = "" ;
      edtavConsumos_Enabled = 0 ;
      edtavCompras_Jsonclick = "" ;
      edtavCompras_Enabled = 0 ;
      chkavPwdbo.setEnabled( 1 );
      chkavActualizardatos.setEnabled( 1 );
      edtavExistenciasdif_Jsonclick = "" ;
      edtavExistenciasdif_Enabled = 1 ;
      edtavPrdexialm_Jsonclick = "" ;
      edtavPrdexialm_Enabled = 0 ;
      edtavExistenciascuentacorriente_Jsonclick = "" ;
      edtavExistenciascuentacorriente_Enabled = 0 ;
      edtavSaldoinicialafecha_Jsonclick = "" ;
      edtavSaldoinicialafecha_Enabled = 1 ;
      Grid_empowerer_Popoversingrid = "Popover_TipMovCc" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hascategories = GXutil.toBoolean( -1) ;
      Grid_titlescategories_Gridtitlescategories = ";;;;;;Cantidad;Cantidad;;;;Fecha;;;;;;;;" ;
      Dvelop_confirmpanel_btnauditar_Confirmtype = "1" ;
      Dvelop_confirmpanel_btnauditar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_btnauditar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_btnauditar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_btnauditar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_btnauditar_Confirmationtext = "¿Auditar?" ;
      Dvelop_confirmpanel_btnauditar_Title = "" ;
      Dvelop_confirmpanel_eliminar_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminar_Confirmationtext = "¿Desea eliminarla Linea?" ;
      Dvelop_confirmpanel_eliminar_Title = "" ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Columnssortvalues = "|||||||||||" ;
      Ddo_grid_Columnids = "1:CCStkLin|2:DiaHora|3:TipMovCc|5:CCStkDsc|6:CCStkCanE|7:CCStkCanS|8:CCStkPre|9:Exis|10:CCStkLot|11:CCStkLotFech|12:Hdr|13:CCStkUsu" ;
      Ddo_grid_Gridinternalname = "" ;
      Popover_tipmovcc_Position = "Bottom" ;
      Popover_tipmovcc_Popoverwidth = 400 ;
      Popover_tipmovcc_Trigger = "Click" ;
      Popover_tipmovcc_Isgriditem = GXutil.toBoolean( -1) ;
      Popover_tipmovcc_Iteminternalname = "" ;
      Dvpanel_movimientos_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_movimientos_Iconposition = "Right" ;
      Dvpanel_movimientos_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_movimientos_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_movimientos_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_movimientos_Title = httpContext.getMessage( "Movimientos", "") ;
      Dvpanel_movimientos_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_movimientos_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_movimientos_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_movimientos_Width = "100%" ;
      Dvpanel_informacion_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_informacion_Iconposition = "Right" ;
      Dvpanel_informacion_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_informacion_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_informacion_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_informacion_Title = httpContext.getMessage( "Informacion", "") ;
      Dvpanel_informacion_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_informacion_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_informacion_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_informacion_Width = "100%" ;
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
      chkavActualizardatos.setName( "vACTUALIZARDATOS" );
      chkavActualizardatos.setWebtags( "" );
      chkavActualizardatos.setCaption( httpContext.getMessage( "Actualizar Datos?", "") );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavActualizardatos.getInternalname(), "TitleCaption", chkavActualizardatos.getCaption(), true);
      chkavActualizardatos.setCheckedValue( "N" );
      chkavPwdbo.setName( "vPWDBO" );
      chkavPwdbo.setWebtags( "" );
      chkavPwdbo.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavPwdbo.getInternalname(), "TitleCaption", chkavPwdbo.getCaption(), true);
      chkavPwdbo.setCheckedValue( "false" );
      GXCCtl = "vACCIONESGRUPO_" + sGXsfl_103_idx ;
      cmbavAccionesgrupo.setName( GXCCtl );
      cmbavAccionesgrupo.setWebtags( "" );
      if ( cmbavAccionesgrupo.getItemCount() > 0 )
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV37SaldoInicial',fld:'vSALDOINICIAL',pic:'ZZZZZZ9.9999'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A3348CCStkFec',fld:'CCSTKFEC',pic:''},{av:'A3356CCStkHor',fld:'CCSTKHOR',pic:''},{av:'AV23Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV39PrdnumIN',fld:'vPRDNUMIN',pic:''},{av:'AV91CCstkfecfrom',fld:'vCCSTKFECFROM',pic:''},{av:'AV92CCstkfecto',fld:'vCCSTKFECTO',pic:''},{av:'A3345TipMovCc',fld:'TIPMOVCC',pic:''},{av:'A3357CCStkDsc',fld:'CCSTKDSC',pic:''},{av:'A3342CCStkLin',fld:'CCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'A3349CCStkPre',fld:'CCSTKPRE',pic:'ZZZZZZZ9.999'},{av:'A3343CCStkCanE',fld:'CCSTKCANE',pic:'ZZZZZZ9.9999'},{av:'A3344CCStkCanS',fld:'CCSTKCANS',pic:'ZZZZZZ9.9999'},{av:'A5722CCStkLot',fld:'CCSTKLOT',pic:''},{av:'A3350CCStkBar',fld:'CCSTKBAR',pic:'ZZZZZZZ9'},{av:'A3351CCStkReo',fld:'CCSTKREO',pic:'9'},{av:'A3352CCStkPar',fld:'CCSTKPAR',pic:''},{av:'A3358CCStkLen',fld:'CCSTKLEN',pic:'ZZZ9'},{av:'A3353CCStkPed',fld:'CCSTKPED',pic:'ZZZZZZZ9'},{av:'A3355CCStkUsu',fld:'CCSTKUSU',pic:'@!'},{av:'A13979CCStkLotFe',fld:'CCSTKLOTFE',pic:''},{av:'A810RecFec',fld:'RECFEC',pic:''},{av:'A809RecExiTeo',fld:'RECEXITEO',pic:'ZZZZZZ9.9999'},{av:'A807RecExiRea',fld:'RECEXIREA',pic:'ZZZZZZ9.9999'},{av:'A808RecExiTcc',fld:'RECEXITCC',pic:'ZZZZZZ9.9999'},{av:'A806RecExiRcc',fld:'RECEXIRCC',pic:'ZZZZZZ9.9999'},{av:'sPrefix'},{av:'AV21ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV16ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV97Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV51EntSalInv',fld:'vENTSALINV',pic:'ZZZ9',hsh:true},{av:'AV44RecExiRea',fld:'vRECEXIREA',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV47ComprasInv',fld:'vCOMPRASINV',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV48ConsumosInv',fld:'vCONSUMOSINV',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV49Recfec',fld:'vRECFEC',pic:'',hsh:true},{av:'AV78Actualizardatos',fld:'vACTUALIZARDATOS',pic:''},{av:'AV76PwdBo',fld:'vPWDBO',pic:''},{av:'AV70Usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV71Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV75Password',fld:'vPASSWORD',pic:'ZZZZZZZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV21ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV16ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtavCcstklin_Visible',ctrl:'vCCSTKLIN',prop:'Visible'},{av:'edtavDiahora_Visible',ctrl:'vDIAHORA',prop:'Visible'},{av:'edtavTipmovccwithtags_Visible',ctrl:'vTIPMOVCCWITHTAGS',prop:'Visible'},{av:'edtavCcstkdsc_Visible',ctrl:'vCCSTKDSC',prop:'Visible'},{av:'edtavCcstkcane_Visible',ctrl:'vCCSTKCANE',prop:'Visible'},{av:'edtavCcstkcans_Visible',ctrl:'vCCSTKCANS',prop:'Visible'},{av:'edtavCcstkpre_Visible',ctrl:'vCCSTKPRE',prop:'Visible'},{av:'edtavExis_Visible',ctrl:'vEXIS',prop:'Visible'},{av:'edtavCcstklot_Visible',ctrl:'vCCSTKLOT',prop:'Visible'},{av:'edtavCcstklotfech_Visible',ctrl:'vCCSTKLOTFECH',prop:'Visible'},{av:'edtavHdr_Visible',ctrl:'vHDR',prop:'Visible'},{av:'edtavCcstkusu_Visible',ctrl:'vCCSTKUSU',prop:'Visible'},{av:'cmbavAccionesgrupo'},{av:'edtavCcstklin_Columnheaderclass',ctrl:'vCCSTKLIN',prop:'Columnheaderclass'},{av:'edtavDiahora_Columnheaderclass',ctrl:'vDIAHORA',prop:'Columnheaderclass'},{av:'edtavTipmovccwithtags_Columnheaderclass',ctrl:'vTIPMOVCCWITHTAGS',prop:'Columnheaderclass'},{av:'edtavCcstkdsc_Columnheaderclass',ctrl:'vCCSTKDSC',prop:'Columnheaderclass'},{av:'edtavCcstkcane_Columnheaderclass',ctrl:'vCCSTKCANE',prop:'Columnheaderclass'},{av:'edtavCcstkcans_Columnheaderclass',ctrl:'vCCSTKCANS',prop:'Columnheaderclass'},{av:'edtavCcstkpre_Columnheaderclass',ctrl:'vCCSTKPRE',prop:'Columnheaderclass'},{av:'edtavExis_Columnheaderclass',ctrl:'vEXIS',prop:'Columnheaderclass'},{av:'edtavCcstklot_Columnheaderclass',ctrl:'vCCSTKLOT',prop:'Columnheaderclass'},{av:'edtavCcstklotfech_Columnheaderclass',ctrl:'vCCSTKLOTFECH',prop:'Columnheaderclass'},{av:'edtavHdr_Columnheaderclass',ctrl:'vHDR',prop:'Columnheaderclass'},{av:'edtavCcstkusu_Columnheaderclass',ctrl:'vCCSTKUSU',prop:'Columnheaderclass'},{av:'AV19ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRID.LOAD","{handler:'e211NY2',iparms:[{av:'AV37SaldoInicial',fld:'vSALDOINICIAL',pic:'ZZZZZZ9.9999'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A3348CCStkFec',fld:'CCSTKFEC',pic:''},{av:'A3356CCStkHor',fld:'CCSTKHOR',pic:''},{av:'AV23Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV39PrdnumIN',fld:'vPRDNUMIN',pic:''},{av:'AV91CCstkfecfrom',fld:'vCCSTKFECFROM',pic:''},{av:'AV92CCstkfecto',fld:'vCCSTKFECTO',pic:''},{av:'A3345TipMovCc',fld:'TIPMOVCC',pic:''},{av:'AV51EntSalInv',fld:'vENTSALINV',pic:'ZZZ9',hsh:true},{av:'AV44RecExiRea',fld:'vRECEXIREA',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV47ComprasInv',fld:'vCOMPRASINV',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV48ConsumosInv',fld:'vCONSUMOSINV',pic:'ZZZZZZ9.9999',hsh:true},{av:'A3357CCStkDsc',fld:'CCSTKDSC',pic:''},{av:'A3342CCStkLin',fld:'CCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'A3349CCStkPre',fld:'CCSTKPRE',pic:'ZZZZZZZ9.999'},{av:'A3343CCStkCanE',fld:'CCSTKCANE',pic:'ZZZZZZ9.9999'},{av:'A3344CCStkCanS',fld:'CCSTKCANS',pic:'ZZZZZZ9.9999'},{av:'A5722CCStkLot',fld:'CCSTKLOT',pic:''},{av:'A3350CCStkBar',fld:'CCSTKBAR',pic:'ZZZZZZZ9'},{av:'A3351CCStkReo',fld:'CCSTKREO',pic:'9'},{av:'A3352CCStkPar',fld:'CCSTKPAR',pic:''},{av:'A3358CCStkLen',fld:'CCSTKLEN',pic:'ZZZ9'},{av:'A3353CCStkPed',fld:'CCSTKPED',pic:'ZZZZZZZ9'},{av:'A3355CCStkUsu',fld:'CCSTKUSU',pic:'@!'},{av:'A13979CCStkLotFe',fld:'CCSTKLOTFE',pic:''},{av:'A810RecFec',fld:'RECFEC',pic:''},{av:'AV49Recfec',fld:'vRECFEC',pic:'',hsh:true},{av:'A809RecExiTeo',fld:'RECEXITEO',pic:'ZZZZZZ9.9999'},{av:'A807RecExiRea',fld:'RECEXIREA',pic:'ZZZZZZ9.9999'},{av:'A808RecExiTcc',fld:'RECEXITCC',pic:'ZZZZZZ9.9999'},{av:'A806RecExiRcc',fld:'RECEXIRCC',pic:'ZZZZZZ9.9999'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV50Exis',fld:'vEXIS',pic:'ZZZZZZ9.9999'},{av:'AV49Recfec',fld:'vRECFEC',pic:'',hsh:true},{av:'AV42CCStkDsc',fld:'vCCSTKDSC',pic:'',hsh:true},{av:'AV41TipMovCc',fld:'vTIPMOVCC',pic:'',hsh:true},{av:'AV13CCStkLin',fld:'vCCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'AV40DiaHora',fld:'vDIAHORA',pic:'',hsh:true},{av:'AV24CCStkFec',fld:'vCCSTKFEC',pic:''},{av:'AV53CCStkPre',fld:'vCCSTKPRE',pic:'ZZZZZZZ9.999'},{av:'AV54CCStkCanE',fld:'vCCSTKCANE',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV55CCStkCanS',fld:'vCCSTKCANS',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV56CCStkLot',fld:'vCCSTKLOT',pic:''},{av:'AV57Hdr',fld:'vHDR',pic:''},{av:'AV58CCStkBar',fld:'vCCSTKBAR',pic:'ZZZZZZZ9'},{av:'AV59CCStkReo',fld:'vCCSTKREO',pic:'9'},{av:'AV60CCStkPar',fld:'vCCSTKPAR',pic:''},{av:'AV62CCStkLen',fld:'vCCSTKLEN',pic:'ZZZ9'},{av:'AV63CCStkPed',fld:'vCCSTKPED',pic:'ZZZZZZZ9'},{av:'AV64CCStkUsu',fld:'vCCSTKUSU',pic:'@!',hsh:true},{av:'AV65CCStkLotFech',fld:'vCCSTKLOTFECH',pic:''},{av:'cmbavAccionesgrupo'},{av:'AV68AccionesGrupo',fld:'vACCIONESGRUPO',pic:'ZZZ9'},{av:'edtavCcstklin_Columnclass',ctrl:'vCCSTKLIN',prop:'Columnclass'},{av:'edtavDiahora_Columnclass',ctrl:'vDIAHORA',prop:'Columnclass'},{av:'edtavTipmovccwithtags_Columnclass',ctrl:'vTIPMOVCCWITHTAGS',prop:'Columnclass'},{av:'edtavCcstkdsc_Columnclass',ctrl:'vCCSTKDSC',prop:'Columnclass'},{av:'edtavCcstkcane_Columnclass',ctrl:'vCCSTKCANE',prop:'Columnclass'},{av:'edtavCcstkcans_Columnclass',ctrl:'vCCSTKCANS',prop:'Columnclass'},{av:'edtavCcstkpre_Columnclass',ctrl:'vCCSTKPRE',prop:'Columnclass'},{av:'edtavExis_Columnclass',ctrl:'vEXIS',prop:'Columnclass'},{av:'edtavCcstklot_Columnclass',ctrl:'vCCSTKLOT',prop:'Columnclass'},{av:'edtavCcstklotfech_Columnclass',ctrl:'vCCSTKLOTFECH',prop:'Columnclass'},{av:'edtavHdr_Columnclass',ctrl:'vHDR',prop:'Columnclass'},{av:'edtavCcstkusu_Columnclass',ctrl:'vCCSTKUSU',prop:'Columnclass'},{av:'AV90TipMovCcWithTags',fld:'vTIPMOVCCWITHTAGS',pic:''},{av:'AV44RecExiRea',fld:'vRECEXIREA',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV48ConsumosInv',fld:'vCONSUMOSINV',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV47ComprasInv',fld:'vCOMPRASINV',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV39PrdnumIN',fld:'vPRDNUMIN',pic:''},{av:'AV23Emprcod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e131NY2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV21ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV16ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV97Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV37SaldoInicial',fld:'vSALDOINICIAL',pic:'ZZZZZZ9.9999'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A3348CCStkFec',fld:'CCSTKFEC',pic:''},{av:'A3356CCStkHor',fld:'CCSTKHOR',pic:''},{av:'AV23Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV39PrdnumIN',fld:'vPRDNUMIN',pic:''},{av:'AV91CCstkfecfrom',fld:'vCCSTKFECFROM',pic:''},{av:'AV92CCstkfecto',fld:'vCCSTKFECTO',pic:''},{av:'A3345TipMovCc',fld:'TIPMOVCC',pic:''},{av:'AV51EntSalInv',fld:'vENTSALINV',pic:'ZZZ9',hsh:true},{av:'AV44RecExiRea',fld:'vRECEXIREA',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV47ComprasInv',fld:'vCOMPRASINV',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV48ConsumosInv',fld:'vCONSUMOSINV',pic:'ZZZZZZ9.9999',hsh:true},{av:'A3357CCStkDsc',fld:'CCSTKDSC',pic:''},{av:'A3342CCStkLin',fld:'CCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'A3349CCStkPre',fld:'CCSTKPRE',pic:'ZZZZZZZ9.999'},{av:'A3343CCStkCanE',fld:'CCSTKCANE',pic:'ZZZZZZ9.9999'},{av:'A3344CCStkCanS',fld:'CCSTKCANS',pic:'ZZZZZZ9.9999'},{av:'A5722CCStkLot',fld:'CCSTKLOT',pic:''},{av:'A3350CCStkBar',fld:'CCSTKBAR',pic:'ZZZZZZZ9'},{av:'A3351CCStkReo',fld:'CCSTKREO',pic:'9'},{av:'A3352CCStkPar',fld:'CCSTKPAR',pic:''},{av:'A3358CCStkLen',fld:'CCSTKLEN',pic:'ZZZ9'},{av:'A3353CCStkPed',fld:'CCSTKPED',pic:'ZZZZZZZ9'},{av:'A3355CCStkUsu',fld:'CCSTKUSU',pic:'@!'},{av:'A13979CCStkLotFe',fld:'CCSTKLOTFE',pic:''},{av:'A810RecFec',fld:'RECFEC',pic:''},{av:'AV49Recfec',fld:'vRECFEC',pic:'',hsh:true},{av:'A809RecExiTeo',fld:'RECEXITEO',pic:'ZZZZZZ9.9999'},{av:'A807RecExiRea',fld:'RECEXIREA',pic:'ZZZZZZ9.9999'},{av:'A808RecExiTcc',fld:'RECEXITCC',pic:'ZZZZZZ9.9999'},{av:'A806RecExiRcc',fld:'RECEXIRCC',pic:'ZZZZZZ9.9999'},{av:'AV78Actualizardatos',fld:'vACTUALIZARDATOS',pic:''},{av:'AV76PwdBo',fld:'vPWDBO',pic:''},{av:'AV70Usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV71Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV75Password',fld:'vPASSWORD',pic:'ZZZZZZZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV16ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV21ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtavCcstklin_Visible',ctrl:'vCCSTKLIN',prop:'Visible'},{av:'edtavDiahora_Visible',ctrl:'vDIAHORA',prop:'Visible'},{av:'edtavTipmovccwithtags_Visible',ctrl:'vTIPMOVCCWITHTAGS',prop:'Visible'},{av:'edtavCcstkdsc_Visible',ctrl:'vCCSTKDSC',prop:'Visible'},{av:'edtavCcstkcane_Visible',ctrl:'vCCSTKCANE',prop:'Visible'},{av:'edtavCcstkcans_Visible',ctrl:'vCCSTKCANS',prop:'Visible'},{av:'edtavCcstkpre_Visible',ctrl:'vCCSTKPRE',prop:'Visible'},{av:'edtavExis_Visible',ctrl:'vEXIS',prop:'Visible'},{av:'edtavCcstklot_Visible',ctrl:'vCCSTKLOT',prop:'Visible'},{av:'edtavCcstklotfech_Visible',ctrl:'vCCSTKLOTFECH',prop:'Visible'},{av:'edtavHdr_Visible',ctrl:'vHDR',prop:'Visible'},{av:'edtavCcstkusu_Visible',ctrl:'vCCSTKUSU',prop:'Visible'},{av:'cmbavAccionesgrupo'},{av:'edtavCcstklin_Columnheaderclass',ctrl:'vCCSTKLIN',prop:'Columnheaderclass'},{av:'edtavDiahora_Columnheaderclass',ctrl:'vDIAHORA',prop:'Columnheaderclass'},{av:'edtavTipmovccwithtags_Columnheaderclass',ctrl:'vTIPMOVCCWITHTAGS',prop:'Columnheaderclass'},{av:'edtavCcstkdsc_Columnheaderclass',ctrl:'vCCSTKDSC',prop:'Columnheaderclass'},{av:'edtavCcstkcane_Columnheaderclass',ctrl:'vCCSTKCANE',prop:'Columnheaderclass'},{av:'edtavCcstkcans_Columnheaderclass',ctrl:'vCCSTKCANS',prop:'Columnheaderclass'},{av:'edtavCcstkpre_Columnheaderclass',ctrl:'vCCSTKPRE',prop:'Columnheaderclass'},{av:'edtavExis_Columnheaderclass',ctrl:'vEXIS',prop:'Columnheaderclass'},{av:'edtavCcstklot_Columnheaderclass',ctrl:'vCCSTKLOT',prop:'Columnheaderclass'},{av:'edtavCcstklotfech_Columnheaderclass',ctrl:'vCCSTKLOTFECH',prop:'Columnheaderclass'},{av:'edtavHdr_Columnheaderclass',ctrl:'vHDR',prop:'Columnheaderclass'},{av:'edtavCcstkusu_Columnheaderclass',ctrl:'vCCSTKUSU',prop:'Columnheaderclass'},{av:'AV19ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e121NY2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV21ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV16ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV97Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV37SaldoInicial',fld:'vSALDOINICIAL',pic:'ZZZZZZ9.9999'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A3348CCStkFec',fld:'CCSTKFEC',pic:''},{av:'A3356CCStkHor',fld:'CCSTKHOR',pic:''},{av:'AV23Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV39PrdnumIN',fld:'vPRDNUMIN',pic:''},{av:'AV91CCstkfecfrom',fld:'vCCSTKFECFROM',pic:''},{av:'AV92CCstkfecto',fld:'vCCSTKFECTO',pic:''},{av:'A3345TipMovCc',fld:'TIPMOVCC',pic:''},{av:'AV51EntSalInv',fld:'vENTSALINV',pic:'ZZZ9',hsh:true},{av:'AV44RecExiRea',fld:'vRECEXIREA',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV47ComprasInv',fld:'vCOMPRASINV',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV48ConsumosInv',fld:'vCONSUMOSINV',pic:'ZZZZZZ9.9999',hsh:true},{av:'A3357CCStkDsc',fld:'CCSTKDSC',pic:''},{av:'A3342CCStkLin',fld:'CCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'A3349CCStkPre',fld:'CCSTKPRE',pic:'ZZZZZZZ9.999'},{av:'A3343CCStkCanE',fld:'CCSTKCANE',pic:'ZZZZZZ9.9999'},{av:'A3344CCStkCanS',fld:'CCSTKCANS',pic:'ZZZZZZ9.9999'},{av:'A5722CCStkLot',fld:'CCSTKLOT',pic:''},{av:'A3350CCStkBar',fld:'CCSTKBAR',pic:'ZZZZZZZ9'},{av:'A3351CCStkReo',fld:'CCSTKREO',pic:'9'},{av:'A3352CCStkPar',fld:'CCSTKPAR',pic:''},{av:'A3358CCStkLen',fld:'CCSTKLEN',pic:'ZZZ9'},{av:'A3353CCStkPed',fld:'CCSTKPED',pic:'ZZZZZZZ9'},{av:'A3355CCStkUsu',fld:'CCSTKUSU',pic:'@!'},{av:'A13979CCStkLotFe',fld:'CCSTKLOTFE',pic:''},{av:'A810RecFec',fld:'RECFEC',pic:''},{av:'AV49Recfec',fld:'vRECFEC',pic:'',hsh:true},{av:'A809RecExiTeo',fld:'RECEXITEO',pic:'ZZZZZZ9.9999'},{av:'A807RecExiRea',fld:'RECEXIREA',pic:'ZZZZZZ9.9999'},{av:'A808RecExiTcc',fld:'RECEXITCC',pic:'ZZZZZZ9.9999'},{av:'A806RecExiRcc',fld:'RECEXIRCC',pic:'ZZZZZZ9.9999'},{av:'AV78Actualizardatos',fld:'vACTUALIZARDATOS',pic:''},{av:'AV76PwdBo',fld:'vPWDBO',pic:''},{av:'AV70Usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV71Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV75Password',fld:'vPASSWORD',pic:'ZZZZZZZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV21ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV16ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtavCcstklin_Visible',ctrl:'vCCSTKLIN',prop:'Visible'},{av:'edtavDiahora_Visible',ctrl:'vDIAHORA',prop:'Visible'},{av:'edtavTipmovccwithtags_Visible',ctrl:'vTIPMOVCCWITHTAGS',prop:'Visible'},{av:'edtavCcstkdsc_Visible',ctrl:'vCCSTKDSC',prop:'Visible'},{av:'edtavCcstkcane_Visible',ctrl:'vCCSTKCANE',prop:'Visible'},{av:'edtavCcstkcans_Visible',ctrl:'vCCSTKCANS',prop:'Visible'},{av:'edtavCcstkpre_Visible',ctrl:'vCCSTKPRE',prop:'Visible'},{av:'edtavExis_Visible',ctrl:'vEXIS',prop:'Visible'},{av:'edtavCcstklot_Visible',ctrl:'vCCSTKLOT',prop:'Visible'},{av:'edtavCcstklotfech_Visible',ctrl:'vCCSTKLOTFECH',prop:'Visible'},{av:'edtavHdr_Visible',ctrl:'vHDR',prop:'Visible'},{av:'edtavCcstkusu_Visible',ctrl:'vCCSTKUSU',prop:'Visible'},{av:'cmbavAccionesgrupo'},{av:'edtavCcstklin_Columnheaderclass',ctrl:'vCCSTKLIN',prop:'Columnheaderclass'},{av:'edtavDiahora_Columnheaderclass',ctrl:'vDIAHORA',prop:'Columnheaderclass'},{av:'edtavTipmovccwithtags_Columnheaderclass',ctrl:'vTIPMOVCCWITHTAGS',prop:'Columnheaderclass'},{av:'edtavCcstkdsc_Columnheaderclass',ctrl:'vCCSTKDSC',prop:'Columnheaderclass'},{av:'edtavCcstkcane_Columnheaderclass',ctrl:'vCCSTKCANE',prop:'Columnheaderclass'},{av:'edtavCcstkcans_Columnheaderclass',ctrl:'vCCSTKCANS',prop:'Columnheaderclass'},{av:'edtavCcstkpre_Columnheaderclass',ctrl:'vCCSTKPRE',prop:'Columnheaderclass'},{av:'edtavExis_Columnheaderclass',ctrl:'vEXIS',prop:'Columnheaderclass'},{av:'edtavCcstklot_Columnheaderclass',ctrl:'vCCSTKLOT',prop:'Columnheaderclass'},{av:'edtavCcstklotfech_Columnheaderclass',ctrl:'vCCSTKLOTFECH',prop:'Columnheaderclass'},{av:'edtavHdr_Columnheaderclass',ctrl:'vHDR',prop:'Columnheaderclass'},{av:'edtavCcstkusu_Columnheaderclass',ctrl:'vCCSTKUSU',prop:'Columnheaderclass'},{av:'AV19ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VACCIONESGRUPO.CLICK","{handler:'e221NY2',iparms:[{av:'cmbavAccionesgrupo'},{av:'AV68AccionesGrupo',fld:'vACCIONESGRUPO',pic:'ZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV21ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV16ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV97Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV37SaldoInicial',fld:'vSALDOINICIAL',pic:'ZZZZZZ9.9999'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A3348CCStkFec',fld:'CCSTKFEC',pic:''},{av:'A3356CCStkHor',fld:'CCSTKHOR',pic:''},{av:'AV23Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV39PrdnumIN',fld:'vPRDNUMIN',pic:''},{av:'AV91CCstkfecfrom',fld:'vCCSTKFECFROM',pic:''},{av:'AV92CCstkfecto',fld:'vCCSTKFECTO',pic:''},{av:'A3345TipMovCc',fld:'TIPMOVCC',pic:''},{av:'AV51EntSalInv',fld:'vENTSALINV',pic:'ZZZ9',hsh:true},{av:'AV44RecExiRea',fld:'vRECEXIREA',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV47ComprasInv',fld:'vCOMPRASINV',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV48ConsumosInv',fld:'vCONSUMOSINV',pic:'ZZZZZZ9.9999',hsh:true},{av:'A3357CCStkDsc',fld:'CCSTKDSC',pic:''},{av:'A3342CCStkLin',fld:'CCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'A3349CCStkPre',fld:'CCSTKPRE',pic:'ZZZZZZZ9.999'},{av:'A3343CCStkCanE',fld:'CCSTKCANE',pic:'ZZZZZZ9.9999'},{av:'A3344CCStkCanS',fld:'CCSTKCANS',pic:'ZZZZZZ9.9999'},{av:'A5722CCStkLot',fld:'CCSTKLOT',pic:''},{av:'A3350CCStkBar',fld:'CCSTKBAR',pic:'ZZZZZZZ9'},{av:'A3351CCStkReo',fld:'CCSTKREO',pic:'9'},{av:'A3352CCStkPar',fld:'CCSTKPAR',pic:''},{av:'A3358CCStkLen',fld:'CCSTKLEN',pic:'ZZZ9'},{av:'A3353CCStkPed',fld:'CCSTKPED',pic:'ZZZZZZZ9'},{av:'A3355CCStkUsu',fld:'CCSTKUSU',pic:'@!'},{av:'A13979CCStkLotFe',fld:'CCSTKLOTFE',pic:''},{av:'A810RecFec',fld:'RECFEC',pic:''},{av:'AV49Recfec',fld:'vRECFEC',pic:'',hsh:true},{av:'A809RecExiTeo',fld:'RECEXITEO',pic:'ZZZZZZ9.9999'},{av:'A807RecExiRea',fld:'RECEXIREA',pic:'ZZZZZZ9.9999'},{av:'A808RecExiTcc',fld:'RECEXITCC',pic:'ZZZZZZ9.9999'},{av:'A806RecExiRcc',fld:'RECEXIRCC',pic:'ZZZZZZ9.9999'},{av:'AV78Actualizardatos',fld:'vACTUALIZARDATOS',pic:''},{av:'AV76PwdBo',fld:'vPWDBO',pic:''},{av:'AV70Usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV71Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV75Password',fld:'vPASSWORD',pic:'ZZZZZZZZZ9',hsh:true},{av:'sPrefix'},{av:'AV42CCStkDsc',fld:'vCCSTKDSC',pic:'',hsh:true},{av:'AV41TipMovCc',fld:'vTIPMOVCC',pic:'',hsh:true},{av:'AV13CCStkLin',fld:'vCCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'AV58CCStkBar',fld:'vCCSTKBAR',pic:'ZZZZZZZ9'},{av:'AV59CCStkReo',fld:'vCCSTKREO',pic:'9'},{av:'AV60CCStkPar',fld:'vCCSTKPAR',pic:''},{av:'AV63CCStkPed',fld:'vCCSTKPED',pic:'ZZZZZZZ9'},{av:'AV62CCStkLen',fld:'vCCSTKLEN',pic:'ZZZ9'},{av:'AV24CCStkFec',fld:'vCCSTKFEC',pic:''}]");
      setEventMetadata("VACCIONESGRUPO.CLICK",",oparms:[{av:'cmbavAccionesgrupo'},{av:'AV68AccionesGrupo',fld:'vACCIONESGRUPO',pic:'ZZZ9'},{av:'AV60CCStkPar',fld:'vCCSTKPAR',pic:''},{av:'AV59CCStkReo',fld:'vCCSTKREO',pic:'9'},{av:'AV58CCStkBar',fld:'vCCSTKBAR',pic:'ZZZZZZZ9'},{av:'AV13CCStkLin',fld:'vCCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'AV39PrdnumIN',fld:'vPRDNUMIN',pic:''},{av:'AV23Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV63CCStkPed',fld:'vCCSTKPED',pic:'ZZZZZZZ9'},{av:'AV62CCStkLen',fld:'vCCSTKLEN',pic:'ZZZ9'},{av:'AV24CCStkFec',fld:'vCCSTKFEC',pic:''},{av:'AV21ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV16ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtavCcstklin_Visible',ctrl:'vCCSTKLIN',prop:'Visible'},{av:'edtavDiahora_Visible',ctrl:'vDIAHORA',prop:'Visible'},{av:'edtavTipmovccwithtags_Visible',ctrl:'vTIPMOVCCWITHTAGS',prop:'Visible'},{av:'edtavCcstkdsc_Visible',ctrl:'vCCSTKDSC',prop:'Visible'},{av:'edtavCcstkcane_Visible',ctrl:'vCCSTKCANE',prop:'Visible'},{av:'edtavCcstkcans_Visible',ctrl:'vCCSTKCANS',prop:'Visible'},{av:'edtavCcstkpre_Visible',ctrl:'vCCSTKPRE',prop:'Visible'},{av:'edtavExis_Visible',ctrl:'vEXIS',prop:'Visible'},{av:'edtavCcstklot_Visible',ctrl:'vCCSTKLOT',prop:'Visible'},{av:'edtavCcstklotfech_Visible',ctrl:'vCCSTKLOTFECH',prop:'Visible'},{av:'edtavHdr_Visible',ctrl:'vHDR',prop:'Visible'},{av:'edtavCcstkusu_Visible',ctrl:'vCCSTKUSU',prop:'Visible'},{av:'edtavCcstklin_Columnheaderclass',ctrl:'vCCSTKLIN',prop:'Columnheaderclass'},{av:'edtavDiahora_Columnheaderclass',ctrl:'vDIAHORA',prop:'Columnheaderclass'},{av:'edtavTipmovccwithtags_Columnheaderclass',ctrl:'vTIPMOVCCWITHTAGS',prop:'Columnheaderclass'},{av:'edtavCcstkdsc_Columnheaderclass',ctrl:'vCCSTKDSC',prop:'Columnheaderclass'},{av:'edtavCcstkcane_Columnheaderclass',ctrl:'vCCSTKCANE',prop:'Columnheaderclass'},{av:'edtavCcstkcans_Columnheaderclass',ctrl:'vCCSTKCANS',prop:'Columnheaderclass'},{av:'edtavCcstkpre_Columnheaderclass',ctrl:'vCCSTKPRE',prop:'Columnheaderclass'},{av:'edtavExis_Columnheaderclass',ctrl:'vEXIS',prop:'Columnheaderclass'},{av:'edtavCcstklot_Columnheaderclass',ctrl:'vCCSTKLOT',prop:'Columnheaderclass'},{av:'edtavCcstklotfech_Columnheaderclass',ctrl:'vCCSTKLOTFECH',prop:'Columnheaderclass'},{av:'edtavHdr_Columnheaderclass',ctrl:'vHDR',prop:'Columnheaderclass'},{av:'edtavCcstkusu_Columnheaderclass',ctrl:'vCCSTKUSU',prop:'Columnheaderclass'},{av:'AV19ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE","{handler:'e141NY2',iparms:[{av:'Dvelop_confirmpanel_eliminar_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINAR',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV21ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV16ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV97Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV37SaldoInicial',fld:'vSALDOINICIAL',pic:'ZZZZZZ9.9999'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A3348CCStkFec',fld:'CCSTKFEC',pic:''},{av:'A3356CCStkHor',fld:'CCSTKHOR',pic:''},{av:'AV23Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV39PrdnumIN',fld:'vPRDNUMIN',pic:''},{av:'AV91CCstkfecfrom',fld:'vCCSTKFECFROM',pic:''},{av:'AV92CCstkfecto',fld:'vCCSTKFECTO',pic:''},{av:'A3345TipMovCc',fld:'TIPMOVCC',pic:''},{av:'AV51EntSalInv',fld:'vENTSALINV',pic:'ZZZ9',hsh:true},{av:'AV44RecExiRea',fld:'vRECEXIREA',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV47ComprasInv',fld:'vCOMPRASINV',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV48ConsumosInv',fld:'vCONSUMOSINV',pic:'ZZZZZZ9.9999',hsh:true},{av:'A3357CCStkDsc',fld:'CCSTKDSC',pic:''},{av:'A3342CCStkLin',fld:'CCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'A3349CCStkPre',fld:'CCSTKPRE',pic:'ZZZZZZZ9.999'},{av:'A3343CCStkCanE',fld:'CCSTKCANE',pic:'ZZZZZZ9.9999'},{av:'A3344CCStkCanS',fld:'CCSTKCANS',pic:'ZZZZZZ9.9999'},{av:'A5722CCStkLot',fld:'CCSTKLOT',pic:''},{av:'A3350CCStkBar',fld:'CCSTKBAR',pic:'ZZZZZZZ9'},{av:'A3351CCStkReo',fld:'CCSTKREO',pic:'9'},{av:'A3352CCStkPar',fld:'CCSTKPAR',pic:''},{av:'A3358CCStkLen',fld:'CCSTKLEN',pic:'ZZZ9'},{av:'A3353CCStkPed',fld:'CCSTKPED',pic:'ZZZZZZZ9'},{av:'A3355CCStkUsu',fld:'CCSTKUSU',pic:'@!'},{av:'A13979CCStkLotFe',fld:'CCSTKLOTFE',pic:''},{av:'A810RecFec',fld:'RECFEC',pic:''},{av:'AV49Recfec',fld:'vRECFEC',pic:'',hsh:true},{av:'A809RecExiTeo',fld:'RECEXITEO',pic:'ZZZZZZ9.9999'},{av:'A807RecExiRea',fld:'RECEXIREA',pic:'ZZZZZZ9.9999'},{av:'A808RecExiTcc',fld:'RECEXITCC',pic:'ZZZZZZ9.9999'},{av:'A806RecExiRcc',fld:'RECEXIRCC',pic:'ZZZZZZ9.9999'},{av:'AV78Actualizardatos',fld:'vACTUALIZARDATOS',pic:''},{av:'AV76PwdBo',fld:'vPWDBO',pic:''},{av:'AV70Usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV71Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV75Password',fld:'vPASSWORD',pic:'ZZZZZZZZZ9',hsh:true},{av:'sPrefix'},{av:'AV42CCStkDsc',fld:'vCCSTKDSC',pic:'',hsh:true},{av:'AV13CCStkLin',fld:'vCCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'AV36PrdNom',fld:'vPRDNOM',pic:''},{av:'AV41TipMovCc',fld:'vTIPMOVCC',pic:'',hsh:true},{av:'AV64CCStkUsu',fld:'vCCSTKUSU',pic:'@!',hsh:true},{av:'AV40DiaHora',fld:'vDIAHORA',pic:'',hsh:true},{av:'AV54CCStkCanE',fld:'vCCSTKCANE',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV55CCStkCanS',fld:'vCCSTKCANS',pic:'ZZZZZZ9.9999',hsh:true}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE",",oparms:[{av:'AV13CCStkLin',fld:'vCCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'AV39PrdnumIN',fld:'vPRDNUMIN',pic:''},{av:'AV23Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV21ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV16ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtavCcstklin_Visible',ctrl:'vCCSTKLIN',prop:'Visible'},{av:'edtavDiahora_Visible',ctrl:'vDIAHORA',prop:'Visible'},{av:'edtavTipmovccwithtags_Visible',ctrl:'vTIPMOVCCWITHTAGS',prop:'Visible'},{av:'edtavCcstkdsc_Visible',ctrl:'vCCSTKDSC',prop:'Visible'},{av:'edtavCcstkcane_Visible',ctrl:'vCCSTKCANE',prop:'Visible'},{av:'edtavCcstkcans_Visible',ctrl:'vCCSTKCANS',prop:'Visible'},{av:'edtavCcstkpre_Visible',ctrl:'vCCSTKPRE',prop:'Visible'},{av:'edtavExis_Visible',ctrl:'vEXIS',prop:'Visible'},{av:'edtavCcstklot_Visible',ctrl:'vCCSTKLOT',prop:'Visible'},{av:'edtavCcstklotfech_Visible',ctrl:'vCCSTKLOTFECH',prop:'Visible'},{av:'edtavHdr_Visible',ctrl:'vHDR',prop:'Visible'},{av:'edtavCcstkusu_Visible',ctrl:'vCCSTKUSU',prop:'Visible'},{av:'cmbavAccionesgrupo'},{av:'edtavCcstklin_Columnheaderclass',ctrl:'vCCSTKLIN',prop:'Columnheaderclass'},{av:'edtavDiahora_Columnheaderclass',ctrl:'vDIAHORA',prop:'Columnheaderclass'},{av:'edtavTipmovccwithtags_Columnheaderclass',ctrl:'vTIPMOVCCWITHTAGS',prop:'Columnheaderclass'},{av:'edtavCcstkdsc_Columnheaderclass',ctrl:'vCCSTKDSC',prop:'Columnheaderclass'},{av:'edtavCcstkcane_Columnheaderclass',ctrl:'vCCSTKCANE',prop:'Columnheaderclass'},{av:'edtavCcstkcans_Columnheaderclass',ctrl:'vCCSTKCANS',prop:'Columnheaderclass'},{av:'edtavCcstkpre_Columnheaderclass',ctrl:'vCCSTKPRE',prop:'Columnheaderclass'},{av:'edtavExis_Columnheaderclass',ctrl:'vEXIS',prop:'Columnheaderclass'},{av:'edtavCcstklot_Columnheaderclass',ctrl:'vCCSTKLOT',prop:'Columnheaderclass'},{av:'edtavCcstklotfech_Columnheaderclass',ctrl:'vCCSTKLOTFECH',prop:'Columnheaderclass'},{av:'edtavHdr_Columnheaderclass',ctrl:'vHDR',prop:'Columnheaderclass'},{av:'edtavCcstkusu_Columnheaderclass',ctrl:'vCCSTKUSU',prop:'Columnheaderclass'},{av:'AV19ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOAUDITAR'","{handler:'e111NY1',iparms:[{av:'AV76PwdBo',fld:'vPWDBO',pic:''}]");
      setEventMetadata("'DOAUDITAR'",",oparms:[{av:'Dvelop_confirmpanel_btnauditar_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_BTNAUDITAR',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNAUDITAR.CLOSE","{handler:'e151NY2',iparms:[{av:'Dvelop_confirmpanel_btnauditar_Result',ctrl:'DVELOP_CONFIRMPANEL_BTNAUDITAR',prop:'Result'},{av:'AV23Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV39PrdnumIN',fld:'vPRDNUMIN',pic:''},{av:'AV81Siacumular',fld:'vSIACUMULAR',pic:''},{av:'AV78Actualizardatos',fld:'vACTUALIZARDATOS',pic:''},{av:'AV76PwdBo',fld:'vPWDBO',pic:''},{av:'AV36PrdNom',fld:'vPRDNOM',pic:''},{av:'AV97Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNAUDITAR.CLOSE",",oparms:[{av:'AV78Actualizardatos',fld:'vACTUALIZARDATOS',pic:''},{av:'AV81Siacumular',fld:'vSIACUMULAR',pic:''},{av:'AV39PrdnumIN',fld:'vPRDNUMIN',pic:''},{av:'AV23Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV97Pgmname',fld:'vPGMNAME',pic:''}]}");
      setEventMetadata("'DOEXPORTEXCEL'","{handler:'e161NY2',iparms:[{av:'AV23Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV39PrdnumIN',fld:'vPRDNUMIN',pic:''},{av:'AV36PrdNom',fld:'vPRDNOM',pic:''},{av:'AV91CCstkfecfrom',fld:'vCCSTKFECFROM',pic:''},{av:'AV92CCstkfecto',fld:'vCCSTKFECTO',pic:''},{av:'AV37SaldoInicial',fld:'vSALDOINICIAL',pic:'ZZZZZZ9.9999'}]");
      setEventMetadata("'DOEXPORTEXCEL'",",oparms:[{av:'AV37SaldoInicial',fld:'vSALDOINICIAL',pic:'ZZZZZZ9.9999'},{av:'AV92CCstkfecto',fld:'vCCSTKFECTO',pic:''},{av:'AV91CCstkfecfrom',fld:'vCCSTKFECFROM',pic:''},{av:'AV36PrdNom',fld:'vPRDNOM',pic:''},{av:'AV39PrdnumIN',fld:'vPRDNUMIN',pic:''},{av:'AV23Emprcod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOCSV'","{handler:'e171NY2',iparms:[{av:'AV23Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV39PrdnumIN',fld:'vPRDNUMIN',pic:''},{av:'AV91CCstkfecfrom',fld:'vCCSTKFECFROM',pic:''},{av:'AV92CCstkfecto',fld:'vCCSTKFECTO',pic:''},{av:'AV37SaldoInicial',fld:'vSALDOINICIAL',pic:'ZZZZZZ9.9999'}]");
      setEventMetadata("'DOCSV'",",oparms:[{av:'AV37SaldoInicial',fld:'vSALDOINICIAL',pic:'ZZZZZZ9.9999'},{av:'AV92CCstkfecto',fld:'vCCSTKFECTO',pic:''},{av:'AV91CCstkfecfrom',fld:'vCCSTKFECFROM',pic:''},{av:'AV39PrdnumIN',fld:'vPRDNUMIN',pic:''},{av:'AV23Emprcod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("VTIPMOVCC.CLICK","{handler:'e231NY2',iparms:[{av:'AV23Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV58CCStkBar',fld:'vCCSTKBAR',pic:'ZZZZZZZ9'},{av:'AV59CCStkReo',fld:'vCCSTKREO',pic:'9'},{av:'AV60CCStkPar',fld:'vCCSTKPAR',pic:''},{av:'AV39PrdnumIN',fld:'vPRDNUMIN',pic:''},{av:'AV41TipMovCc',fld:'vTIPMOVCC',pic:'',hsh:true},{av:'AV42CCStkDsc',fld:'vCCSTKDSC',pic:'',hsh:true}]");
      setEventMetadata("VTIPMOVCC.CLICK",",oparms:[{ctrl:'WWPAUX_WC'}]}");
      setEventMetadata("VACTUALIZARDATOS.CLICK","{handler:'e181NY2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV21ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV16ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV97Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV37SaldoInicial',fld:'vSALDOINICIAL',pic:'ZZZZZZ9.9999'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A3348CCStkFec',fld:'CCSTKFEC',pic:''},{av:'A3356CCStkHor',fld:'CCSTKHOR',pic:''},{av:'AV23Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV39PrdnumIN',fld:'vPRDNUMIN',pic:''},{av:'AV91CCstkfecfrom',fld:'vCCSTKFECFROM',pic:''},{av:'AV92CCstkfecto',fld:'vCCSTKFECTO',pic:''},{av:'A3345TipMovCc',fld:'TIPMOVCC',pic:''},{av:'AV51EntSalInv',fld:'vENTSALINV',pic:'ZZZ9',hsh:true},{av:'AV44RecExiRea',fld:'vRECEXIREA',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV47ComprasInv',fld:'vCOMPRASINV',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV48ConsumosInv',fld:'vCONSUMOSINV',pic:'ZZZZZZ9.9999',hsh:true},{av:'A3357CCStkDsc',fld:'CCSTKDSC',pic:''},{av:'A3342CCStkLin',fld:'CCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'A3349CCStkPre',fld:'CCSTKPRE',pic:'ZZZZZZZ9.999'},{av:'A3343CCStkCanE',fld:'CCSTKCANE',pic:'ZZZZZZ9.9999'},{av:'A3344CCStkCanS',fld:'CCSTKCANS',pic:'ZZZZZZ9.9999'},{av:'A5722CCStkLot',fld:'CCSTKLOT',pic:''},{av:'A3350CCStkBar',fld:'CCSTKBAR',pic:'ZZZZZZZ9'},{av:'A3351CCStkReo',fld:'CCSTKREO',pic:'9'},{av:'A3352CCStkPar',fld:'CCSTKPAR',pic:''},{av:'A3358CCStkLen',fld:'CCSTKLEN',pic:'ZZZ9'},{av:'A3353CCStkPed',fld:'CCSTKPED',pic:'ZZZZZZZ9'},{av:'A3355CCStkUsu',fld:'CCSTKUSU',pic:'@!'},{av:'A13979CCStkLotFe',fld:'CCSTKLOTFE',pic:''},{av:'A810RecFec',fld:'RECFEC',pic:''},{av:'AV49Recfec',fld:'vRECFEC',pic:'',hsh:true},{av:'A809RecExiTeo',fld:'RECEXITEO',pic:'ZZZZZZ9.9999'},{av:'A807RecExiRea',fld:'RECEXIREA',pic:'ZZZZZZ9.9999'},{av:'A808RecExiTcc',fld:'RECEXITCC',pic:'ZZZZZZ9.9999'},{av:'A806RecExiRcc',fld:'RECEXIRCC',pic:'ZZZZZZ9.9999'},{av:'AV78Actualizardatos',fld:'vACTUALIZARDATOS',pic:''},{av:'AV76PwdBo',fld:'vPWDBO',pic:''},{av:'AV70Usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV71Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV75Password',fld:'vPASSWORD',pic:'ZZZZZZZZZ9',hsh:true},{av:'sPrefix'}]");
      setEventMetadata("VACTUALIZARDATOS.CLICK",",oparms:[{av:'AV76PwdBo',fld:'vPWDBO',pic:''},{av:'AV21ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV16ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtavCcstklin_Visible',ctrl:'vCCSTKLIN',prop:'Visible'},{av:'edtavDiahora_Visible',ctrl:'vDIAHORA',prop:'Visible'},{av:'edtavTipmovccwithtags_Visible',ctrl:'vTIPMOVCCWITHTAGS',prop:'Visible'},{av:'edtavCcstkdsc_Visible',ctrl:'vCCSTKDSC',prop:'Visible'},{av:'edtavCcstkcane_Visible',ctrl:'vCCSTKCANE',prop:'Visible'},{av:'edtavCcstkcans_Visible',ctrl:'vCCSTKCANS',prop:'Visible'},{av:'edtavCcstkpre_Visible',ctrl:'vCCSTKPRE',prop:'Visible'},{av:'edtavExis_Visible',ctrl:'vEXIS',prop:'Visible'},{av:'edtavCcstklot_Visible',ctrl:'vCCSTKLOT',prop:'Visible'},{av:'edtavCcstklotfech_Visible',ctrl:'vCCSTKLOTFECH',prop:'Visible'},{av:'edtavHdr_Visible',ctrl:'vHDR',prop:'Visible'},{av:'edtavCcstkusu_Visible',ctrl:'vCCSTKUSU',prop:'Visible'},{av:'cmbavAccionesgrupo'},{av:'edtavCcstklin_Columnheaderclass',ctrl:'vCCSTKLIN',prop:'Columnheaderclass'},{av:'edtavDiahora_Columnheaderclass',ctrl:'vDIAHORA',prop:'Columnheaderclass'},{av:'edtavTipmovccwithtags_Columnheaderclass',ctrl:'vTIPMOVCCWITHTAGS',prop:'Columnheaderclass'},{av:'edtavCcstkdsc_Columnheaderclass',ctrl:'vCCSTKDSC',prop:'Columnheaderclass'},{av:'edtavCcstkcane_Columnheaderclass',ctrl:'vCCSTKCANE',prop:'Columnheaderclass'},{av:'edtavCcstkcans_Columnheaderclass',ctrl:'vCCSTKCANS',prop:'Columnheaderclass'},{av:'edtavCcstkpre_Columnheaderclass',ctrl:'vCCSTKPRE',prop:'Columnheaderclass'},{av:'edtavExis_Columnheaderclass',ctrl:'vEXIS',prop:'Columnheaderclass'},{av:'edtavCcstklot_Columnheaderclass',ctrl:'vCCSTKLOT',prop:'Columnheaderclass'},{av:'edtavCcstklotfech_Columnheaderclass',ctrl:'vCCSTKLOTFECH',prop:'Columnheaderclass'},{av:'edtavHdr_Columnheaderclass',ctrl:'vHDR',prop:'Columnheaderclass'},{av:'edtavCcstkusu_Columnheaderclass',ctrl:'vCCSTKUSU',prop:'Columnheaderclass'},{av:'AV19ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV37SaldoInicial',fld:'vSALDOINICIAL',pic:'ZZZZZZ9.9999'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A3348CCStkFec',fld:'CCSTKFEC',pic:''},{av:'A3356CCStkHor',fld:'CCSTKHOR',pic:''},{av:'AV23Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV39PrdnumIN',fld:'vPRDNUMIN',pic:''},{av:'AV91CCstkfecfrom',fld:'vCCSTKFECFROM',pic:''},{av:'AV92CCstkfecto',fld:'vCCSTKFECTO',pic:''},{av:'A3345TipMovCc',fld:'TIPMOVCC',pic:''},{av:'AV51EntSalInv',fld:'vENTSALINV',pic:'ZZZ9',hsh:true},{av:'AV44RecExiRea',fld:'vRECEXIREA',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV47ComprasInv',fld:'vCOMPRASINV',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV48ConsumosInv',fld:'vCONSUMOSINV',pic:'ZZZZZZ9.9999',hsh:true},{av:'A3357CCStkDsc',fld:'CCSTKDSC',pic:''},{av:'A3342CCStkLin',fld:'CCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'A3349CCStkPre',fld:'CCSTKPRE',pic:'ZZZZZZZ9.999'},{av:'A3343CCStkCanE',fld:'CCSTKCANE',pic:'ZZZZZZ9.9999'},{av:'A3344CCStkCanS',fld:'CCSTKCANS',pic:'ZZZZZZ9.9999'},{av:'A5722CCStkLot',fld:'CCSTKLOT',pic:''},{av:'A3350CCStkBar',fld:'CCSTKBAR',pic:'ZZZZZZZ9'},{av:'A3351CCStkReo',fld:'CCSTKREO',pic:'9'},{av:'A3352CCStkPar',fld:'CCSTKPAR',pic:''},{av:'A3358CCStkLen',fld:'CCSTKLEN',pic:'ZZZ9'},{av:'A3353CCStkPed',fld:'CCSTKPED',pic:'ZZZZZZZ9'},{av:'A3355CCStkUsu',fld:'CCSTKUSU',pic:'@!'},{av:'A13979CCStkLotFe',fld:'CCSTKLOTFE',pic:''},{av:'A810RecFec',fld:'RECFEC',pic:''},{av:'AV49Recfec',fld:'vRECFEC',pic:'',hsh:true},{av:'A809RecExiTeo',fld:'RECEXITEO',pic:'ZZZZZZ9.9999'},{av:'A807RecExiRea',fld:'RECEXIREA',pic:'ZZZZZZ9.9999'},{av:'A808RecExiTcc',fld:'RECEXITCC',pic:'ZZZZZZ9.9999'},{av:'A806RecExiRcc',fld:'RECEXIRCC',pic:'ZZZZZZ9.9999'},{av:'AV70Usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV71Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV75Password',fld:'vPASSWORD',pic:'ZZZZZZZZZ9',hsh:true},{av:'sPrefix'},{av:'AV21ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV16ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV97Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV78Actualizardatos',fld:'vACTUALIZARDATOS',pic:''},{av:'AV76PwdBo',fld:'vPWDBO',pic:''}]");
      setEventMetadata("GRID_FIRSTPAGE",",oparms:[{av:'AV21ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV16ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtavCcstklin_Visible',ctrl:'vCCSTKLIN',prop:'Visible'},{av:'edtavDiahora_Visible',ctrl:'vDIAHORA',prop:'Visible'},{av:'edtavTipmovccwithtags_Visible',ctrl:'vTIPMOVCCWITHTAGS',prop:'Visible'},{av:'edtavCcstkdsc_Visible',ctrl:'vCCSTKDSC',prop:'Visible'},{av:'edtavCcstkcane_Visible',ctrl:'vCCSTKCANE',prop:'Visible'},{av:'edtavCcstkcans_Visible',ctrl:'vCCSTKCANS',prop:'Visible'},{av:'edtavCcstkpre_Visible',ctrl:'vCCSTKPRE',prop:'Visible'},{av:'edtavExis_Visible',ctrl:'vEXIS',prop:'Visible'},{av:'edtavCcstklot_Visible',ctrl:'vCCSTKLOT',prop:'Visible'},{av:'edtavCcstklotfech_Visible',ctrl:'vCCSTKLOTFECH',prop:'Visible'},{av:'edtavHdr_Visible',ctrl:'vHDR',prop:'Visible'},{av:'edtavCcstkusu_Visible',ctrl:'vCCSTKUSU',prop:'Visible'},{av:'cmbavAccionesgrupo'},{av:'edtavCcstklin_Columnheaderclass',ctrl:'vCCSTKLIN',prop:'Columnheaderclass'},{av:'edtavDiahora_Columnheaderclass',ctrl:'vDIAHORA',prop:'Columnheaderclass'},{av:'edtavTipmovccwithtags_Columnheaderclass',ctrl:'vTIPMOVCCWITHTAGS',prop:'Columnheaderclass'},{av:'edtavCcstkdsc_Columnheaderclass',ctrl:'vCCSTKDSC',prop:'Columnheaderclass'},{av:'edtavCcstkcane_Columnheaderclass',ctrl:'vCCSTKCANE',prop:'Columnheaderclass'},{av:'edtavCcstkcans_Columnheaderclass',ctrl:'vCCSTKCANS',prop:'Columnheaderclass'},{av:'edtavCcstkpre_Columnheaderclass',ctrl:'vCCSTKPRE',prop:'Columnheaderclass'},{av:'edtavExis_Columnheaderclass',ctrl:'vEXIS',prop:'Columnheaderclass'},{av:'edtavCcstklot_Columnheaderclass',ctrl:'vCCSTKLOT',prop:'Columnheaderclass'},{av:'edtavCcstklotfech_Columnheaderclass',ctrl:'vCCSTKLOTFECH',prop:'Columnheaderclass'},{av:'edtavHdr_Columnheaderclass',ctrl:'vHDR',prop:'Columnheaderclass'},{av:'edtavCcstkusu_Columnheaderclass',ctrl:'vCCSTKUSU',prop:'Columnheaderclass'},{av:'AV19ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV37SaldoInicial',fld:'vSALDOINICIAL',pic:'ZZZZZZ9.9999'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A3348CCStkFec',fld:'CCSTKFEC',pic:''},{av:'A3356CCStkHor',fld:'CCSTKHOR',pic:''},{av:'AV23Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV39PrdnumIN',fld:'vPRDNUMIN',pic:''},{av:'AV91CCstkfecfrom',fld:'vCCSTKFECFROM',pic:''},{av:'AV92CCstkfecto',fld:'vCCSTKFECTO',pic:''},{av:'A3345TipMovCc',fld:'TIPMOVCC',pic:''},{av:'AV51EntSalInv',fld:'vENTSALINV',pic:'ZZZ9',hsh:true},{av:'AV44RecExiRea',fld:'vRECEXIREA',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV47ComprasInv',fld:'vCOMPRASINV',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV48ConsumosInv',fld:'vCONSUMOSINV',pic:'ZZZZZZ9.9999',hsh:true},{av:'A3357CCStkDsc',fld:'CCSTKDSC',pic:''},{av:'A3342CCStkLin',fld:'CCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'A3349CCStkPre',fld:'CCSTKPRE',pic:'ZZZZZZZ9.999'},{av:'A3343CCStkCanE',fld:'CCSTKCANE',pic:'ZZZZZZ9.9999'},{av:'A3344CCStkCanS',fld:'CCSTKCANS',pic:'ZZZZZZ9.9999'},{av:'A5722CCStkLot',fld:'CCSTKLOT',pic:''},{av:'A3350CCStkBar',fld:'CCSTKBAR',pic:'ZZZZZZZ9'},{av:'A3351CCStkReo',fld:'CCSTKREO',pic:'9'},{av:'A3352CCStkPar',fld:'CCSTKPAR',pic:''},{av:'A3358CCStkLen',fld:'CCSTKLEN',pic:'ZZZ9'},{av:'A3353CCStkPed',fld:'CCSTKPED',pic:'ZZZZZZZ9'},{av:'A3355CCStkUsu',fld:'CCSTKUSU',pic:'@!'},{av:'A13979CCStkLotFe',fld:'CCSTKLOTFE',pic:''},{av:'A810RecFec',fld:'RECFEC',pic:''},{av:'AV49Recfec',fld:'vRECFEC',pic:'',hsh:true},{av:'A809RecExiTeo',fld:'RECEXITEO',pic:'ZZZZZZ9.9999'},{av:'A807RecExiRea',fld:'RECEXIREA',pic:'ZZZZZZ9.9999'},{av:'A808RecExiTcc',fld:'RECEXITCC',pic:'ZZZZZZ9.9999'},{av:'A806RecExiRcc',fld:'RECEXIRCC',pic:'ZZZZZZ9.9999'},{av:'AV70Usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV71Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV75Password',fld:'vPASSWORD',pic:'ZZZZZZZZZ9',hsh:true},{av:'sPrefix'},{av:'AV21ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV16ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV97Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV78Actualizardatos',fld:'vACTUALIZARDATOS',pic:''},{av:'AV76PwdBo',fld:'vPWDBO',pic:''}]");
      setEventMetadata("GRID_PREVPAGE",",oparms:[{av:'AV21ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV16ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtavCcstklin_Visible',ctrl:'vCCSTKLIN',prop:'Visible'},{av:'edtavDiahora_Visible',ctrl:'vDIAHORA',prop:'Visible'},{av:'edtavTipmovccwithtags_Visible',ctrl:'vTIPMOVCCWITHTAGS',prop:'Visible'},{av:'edtavCcstkdsc_Visible',ctrl:'vCCSTKDSC',prop:'Visible'},{av:'edtavCcstkcane_Visible',ctrl:'vCCSTKCANE',prop:'Visible'},{av:'edtavCcstkcans_Visible',ctrl:'vCCSTKCANS',prop:'Visible'},{av:'edtavCcstkpre_Visible',ctrl:'vCCSTKPRE',prop:'Visible'},{av:'edtavExis_Visible',ctrl:'vEXIS',prop:'Visible'},{av:'edtavCcstklot_Visible',ctrl:'vCCSTKLOT',prop:'Visible'},{av:'edtavCcstklotfech_Visible',ctrl:'vCCSTKLOTFECH',prop:'Visible'},{av:'edtavHdr_Visible',ctrl:'vHDR',prop:'Visible'},{av:'edtavCcstkusu_Visible',ctrl:'vCCSTKUSU',prop:'Visible'},{av:'cmbavAccionesgrupo'},{av:'edtavCcstklin_Columnheaderclass',ctrl:'vCCSTKLIN',prop:'Columnheaderclass'},{av:'edtavDiahora_Columnheaderclass',ctrl:'vDIAHORA',prop:'Columnheaderclass'},{av:'edtavTipmovccwithtags_Columnheaderclass',ctrl:'vTIPMOVCCWITHTAGS',prop:'Columnheaderclass'},{av:'edtavCcstkdsc_Columnheaderclass',ctrl:'vCCSTKDSC',prop:'Columnheaderclass'},{av:'edtavCcstkcane_Columnheaderclass',ctrl:'vCCSTKCANE',prop:'Columnheaderclass'},{av:'edtavCcstkcans_Columnheaderclass',ctrl:'vCCSTKCANS',prop:'Columnheaderclass'},{av:'edtavCcstkpre_Columnheaderclass',ctrl:'vCCSTKPRE',prop:'Columnheaderclass'},{av:'edtavExis_Columnheaderclass',ctrl:'vEXIS',prop:'Columnheaderclass'},{av:'edtavCcstklot_Columnheaderclass',ctrl:'vCCSTKLOT',prop:'Columnheaderclass'},{av:'edtavCcstklotfech_Columnheaderclass',ctrl:'vCCSTKLOTFECH',prop:'Columnheaderclass'},{av:'edtavHdr_Columnheaderclass',ctrl:'vHDR',prop:'Columnheaderclass'},{av:'edtavCcstkusu_Columnheaderclass',ctrl:'vCCSTKUSU',prop:'Columnheaderclass'},{av:'AV19ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV37SaldoInicial',fld:'vSALDOINICIAL',pic:'ZZZZZZ9.9999'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A3348CCStkFec',fld:'CCSTKFEC',pic:''},{av:'A3356CCStkHor',fld:'CCSTKHOR',pic:''},{av:'AV23Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV39PrdnumIN',fld:'vPRDNUMIN',pic:''},{av:'AV91CCstkfecfrom',fld:'vCCSTKFECFROM',pic:''},{av:'AV92CCstkfecto',fld:'vCCSTKFECTO',pic:''},{av:'A3345TipMovCc',fld:'TIPMOVCC',pic:''},{av:'AV51EntSalInv',fld:'vENTSALINV',pic:'ZZZ9',hsh:true},{av:'AV44RecExiRea',fld:'vRECEXIREA',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV47ComprasInv',fld:'vCOMPRASINV',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV48ConsumosInv',fld:'vCONSUMOSINV',pic:'ZZZZZZ9.9999',hsh:true},{av:'A3357CCStkDsc',fld:'CCSTKDSC',pic:''},{av:'A3342CCStkLin',fld:'CCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'A3349CCStkPre',fld:'CCSTKPRE',pic:'ZZZZZZZ9.999'},{av:'A3343CCStkCanE',fld:'CCSTKCANE',pic:'ZZZZZZ9.9999'},{av:'A3344CCStkCanS',fld:'CCSTKCANS',pic:'ZZZZZZ9.9999'},{av:'A5722CCStkLot',fld:'CCSTKLOT',pic:''},{av:'A3350CCStkBar',fld:'CCSTKBAR',pic:'ZZZZZZZ9'},{av:'A3351CCStkReo',fld:'CCSTKREO',pic:'9'},{av:'A3352CCStkPar',fld:'CCSTKPAR',pic:''},{av:'A3358CCStkLen',fld:'CCSTKLEN',pic:'ZZZ9'},{av:'A3353CCStkPed',fld:'CCSTKPED',pic:'ZZZZZZZ9'},{av:'A3355CCStkUsu',fld:'CCSTKUSU',pic:'@!'},{av:'A13979CCStkLotFe',fld:'CCSTKLOTFE',pic:''},{av:'A810RecFec',fld:'RECFEC',pic:''},{av:'AV49Recfec',fld:'vRECFEC',pic:'',hsh:true},{av:'A809RecExiTeo',fld:'RECEXITEO',pic:'ZZZZZZ9.9999'},{av:'A807RecExiRea',fld:'RECEXIREA',pic:'ZZZZZZ9.9999'},{av:'A808RecExiTcc',fld:'RECEXITCC',pic:'ZZZZZZ9.9999'},{av:'A806RecExiRcc',fld:'RECEXIRCC',pic:'ZZZZZZ9.9999'},{av:'AV70Usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV71Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV75Password',fld:'vPASSWORD',pic:'ZZZZZZZZZ9',hsh:true},{av:'sPrefix'},{av:'AV21ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV16ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV97Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV78Actualizardatos',fld:'vACTUALIZARDATOS',pic:''},{av:'AV76PwdBo',fld:'vPWDBO',pic:''}]");
      setEventMetadata("GRID_NEXTPAGE",",oparms:[{av:'AV21ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV16ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtavCcstklin_Visible',ctrl:'vCCSTKLIN',prop:'Visible'},{av:'edtavDiahora_Visible',ctrl:'vDIAHORA',prop:'Visible'},{av:'edtavTipmovccwithtags_Visible',ctrl:'vTIPMOVCCWITHTAGS',prop:'Visible'},{av:'edtavCcstkdsc_Visible',ctrl:'vCCSTKDSC',prop:'Visible'},{av:'edtavCcstkcane_Visible',ctrl:'vCCSTKCANE',prop:'Visible'},{av:'edtavCcstkcans_Visible',ctrl:'vCCSTKCANS',prop:'Visible'},{av:'edtavCcstkpre_Visible',ctrl:'vCCSTKPRE',prop:'Visible'},{av:'edtavExis_Visible',ctrl:'vEXIS',prop:'Visible'},{av:'edtavCcstklot_Visible',ctrl:'vCCSTKLOT',prop:'Visible'},{av:'edtavCcstklotfech_Visible',ctrl:'vCCSTKLOTFECH',prop:'Visible'},{av:'edtavHdr_Visible',ctrl:'vHDR',prop:'Visible'},{av:'edtavCcstkusu_Visible',ctrl:'vCCSTKUSU',prop:'Visible'},{av:'cmbavAccionesgrupo'},{av:'edtavCcstklin_Columnheaderclass',ctrl:'vCCSTKLIN',prop:'Columnheaderclass'},{av:'edtavDiahora_Columnheaderclass',ctrl:'vDIAHORA',prop:'Columnheaderclass'},{av:'edtavTipmovccwithtags_Columnheaderclass',ctrl:'vTIPMOVCCWITHTAGS',prop:'Columnheaderclass'},{av:'edtavCcstkdsc_Columnheaderclass',ctrl:'vCCSTKDSC',prop:'Columnheaderclass'},{av:'edtavCcstkcane_Columnheaderclass',ctrl:'vCCSTKCANE',prop:'Columnheaderclass'},{av:'edtavCcstkcans_Columnheaderclass',ctrl:'vCCSTKCANS',prop:'Columnheaderclass'},{av:'edtavCcstkpre_Columnheaderclass',ctrl:'vCCSTKPRE',prop:'Columnheaderclass'},{av:'edtavExis_Columnheaderclass',ctrl:'vEXIS',prop:'Columnheaderclass'},{av:'edtavCcstklot_Columnheaderclass',ctrl:'vCCSTKLOT',prop:'Columnheaderclass'},{av:'edtavCcstklotfech_Columnheaderclass',ctrl:'vCCSTKLOTFECH',prop:'Columnheaderclass'},{av:'edtavHdr_Columnheaderclass',ctrl:'vHDR',prop:'Columnheaderclass'},{av:'edtavCcstkusu_Columnheaderclass',ctrl:'vCCSTKUSU',prop:'Columnheaderclass'},{av:'AV19ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV37SaldoInicial',fld:'vSALDOINICIAL',pic:'ZZZZZZ9.9999'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A3348CCStkFec',fld:'CCSTKFEC',pic:''},{av:'A3356CCStkHor',fld:'CCSTKHOR',pic:''},{av:'AV23Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV39PrdnumIN',fld:'vPRDNUMIN',pic:''},{av:'AV91CCstkfecfrom',fld:'vCCSTKFECFROM',pic:''},{av:'AV92CCstkfecto',fld:'vCCSTKFECTO',pic:''},{av:'A3345TipMovCc',fld:'TIPMOVCC',pic:''},{av:'AV51EntSalInv',fld:'vENTSALINV',pic:'ZZZ9',hsh:true},{av:'AV44RecExiRea',fld:'vRECEXIREA',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV47ComprasInv',fld:'vCOMPRASINV',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV48ConsumosInv',fld:'vCONSUMOSINV',pic:'ZZZZZZ9.9999',hsh:true},{av:'A3357CCStkDsc',fld:'CCSTKDSC',pic:''},{av:'A3342CCStkLin',fld:'CCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'A3349CCStkPre',fld:'CCSTKPRE',pic:'ZZZZZZZ9.999'},{av:'A3343CCStkCanE',fld:'CCSTKCANE',pic:'ZZZZZZ9.9999'},{av:'A3344CCStkCanS',fld:'CCSTKCANS',pic:'ZZZZZZ9.9999'},{av:'A5722CCStkLot',fld:'CCSTKLOT',pic:''},{av:'A3350CCStkBar',fld:'CCSTKBAR',pic:'ZZZZZZZ9'},{av:'A3351CCStkReo',fld:'CCSTKREO',pic:'9'},{av:'A3352CCStkPar',fld:'CCSTKPAR',pic:''},{av:'A3358CCStkLen',fld:'CCSTKLEN',pic:'ZZZ9'},{av:'A3353CCStkPed',fld:'CCSTKPED',pic:'ZZZZZZZ9'},{av:'A3355CCStkUsu',fld:'CCSTKUSU',pic:'@!'},{av:'A13979CCStkLotFe',fld:'CCSTKLOTFE',pic:''},{av:'A810RecFec',fld:'RECFEC',pic:''},{av:'AV49Recfec',fld:'vRECFEC',pic:'',hsh:true},{av:'A809RecExiTeo',fld:'RECEXITEO',pic:'ZZZZZZ9.9999'},{av:'A807RecExiRea',fld:'RECEXIREA',pic:'ZZZZZZ9.9999'},{av:'A808RecExiTcc',fld:'RECEXITCC',pic:'ZZZZZZ9.9999'},{av:'A806RecExiRcc',fld:'RECEXIRCC',pic:'ZZZZZZ9.9999'},{av:'AV70Usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV71Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV75Password',fld:'vPASSWORD',pic:'ZZZZZZZZZ9',hsh:true},{av:'sPrefix'},{av:'AV21ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV16ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV97Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV78Actualizardatos',fld:'vACTUALIZARDATOS',pic:''},{av:'AV76PwdBo',fld:'vPWDBO',pic:''}]");
      setEventMetadata("GRID_LASTPAGE",",oparms:[{av:'AV21ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV16ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtavCcstklin_Visible',ctrl:'vCCSTKLIN',prop:'Visible'},{av:'edtavDiahora_Visible',ctrl:'vDIAHORA',prop:'Visible'},{av:'edtavTipmovccwithtags_Visible',ctrl:'vTIPMOVCCWITHTAGS',prop:'Visible'},{av:'edtavCcstkdsc_Visible',ctrl:'vCCSTKDSC',prop:'Visible'},{av:'edtavCcstkcane_Visible',ctrl:'vCCSTKCANE',prop:'Visible'},{av:'edtavCcstkcans_Visible',ctrl:'vCCSTKCANS',prop:'Visible'},{av:'edtavCcstkpre_Visible',ctrl:'vCCSTKPRE',prop:'Visible'},{av:'edtavExis_Visible',ctrl:'vEXIS',prop:'Visible'},{av:'edtavCcstklot_Visible',ctrl:'vCCSTKLOT',prop:'Visible'},{av:'edtavCcstklotfech_Visible',ctrl:'vCCSTKLOTFECH',prop:'Visible'},{av:'edtavHdr_Visible',ctrl:'vHDR',prop:'Visible'},{av:'edtavCcstkusu_Visible',ctrl:'vCCSTKUSU',prop:'Visible'},{av:'cmbavAccionesgrupo'},{av:'edtavCcstklin_Columnheaderclass',ctrl:'vCCSTKLIN',prop:'Columnheaderclass'},{av:'edtavDiahora_Columnheaderclass',ctrl:'vDIAHORA',prop:'Columnheaderclass'},{av:'edtavTipmovccwithtags_Columnheaderclass',ctrl:'vTIPMOVCCWITHTAGS',prop:'Columnheaderclass'},{av:'edtavCcstkdsc_Columnheaderclass',ctrl:'vCCSTKDSC',prop:'Columnheaderclass'},{av:'edtavCcstkcane_Columnheaderclass',ctrl:'vCCSTKCANE',prop:'Columnheaderclass'},{av:'edtavCcstkcans_Columnheaderclass',ctrl:'vCCSTKCANS',prop:'Columnheaderclass'},{av:'edtavCcstkpre_Columnheaderclass',ctrl:'vCCSTKPRE',prop:'Columnheaderclass'},{av:'edtavExis_Columnheaderclass',ctrl:'vEXIS',prop:'Columnheaderclass'},{av:'edtavCcstklot_Columnheaderclass',ctrl:'vCCSTKLOT',prop:'Columnheaderclass'},{av:'edtavCcstklotfech_Columnheaderclass',ctrl:'vCCSTKLOTFECH',prop:'Columnheaderclass'},{av:'edtavHdr_Columnheaderclass',ctrl:'vHDR',prop:'Columnheaderclass'},{av:'edtavCcstkusu_Columnheaderclass',ctrl:'vCCSTKUSU',prop:'Columnheaderclass'},{av:'AV19ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("NULL","{handler:'validv_Ccstkfec',iparms:[]");
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
      wcpOAV23Emprcod = "" ;
      wcpOAV39PrdnumIN = "" ;
      wcpOAV91CCstkfecfrom = GXutil.nullDate() ;
      wcpOAV92CCstkfecto = GXutil.nullDate() ;
      wcpOAV26Compras = DecimalUtil.ZERO ;
      wcpOAV27Consumos = DecimalUtil.ZERO ;
      wcpOAV28Devoluciones = DecimalUtil.ZERO ;
      wcpOAV37SaldoInicial = DecimalUtil.ZERO ;
      wcpOAV30Existenciascuentacorriente = DecimalUtil.ZERO ;
      wcpOAV35PrdExiAlm = DecimalUtil.ZERO ;
      wcpOAV34PrdCanres = DecimalUtil.ZERO ;
      wcpOAV36PrdNom = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      Dvelop_confirmpanel_eliminar_Result = "" ;
      Dvelop_confirmpanel_btnauditar_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV23Emprcod = "" ;
      AV39PrdnumIN = "" ;
      AV91CCstkfecfrom = GXutil.nullDate() ;
      AV92CCstkfecto = GXutil.nullDate() ;
      AV26Compras = DecimalUtil.ZERO ;
      AV27Consumos = DecimalUtil.ZERO ;
      AV28Devoluciones = DecimalUtil.ZERO ;
      AV37SaldoInicial = DecimalUtil.ZERO ;
      AV30Existenciascuentacorriente = DecimalUtil.ZERO ;
      AV35PrdExiAlm = DecimalUtil.ZERO ;
      AV34PrdCanres = DecimalUtil.ZERO ;
      AV36PrdNom = "" ;
      AV16ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV97Pgmname = "" ;
      AV12FilterFullText = "" ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      A3348CCStkFec = GXutil.nullDate() ;
      A3356CCStkHor = "" ;
      A3345TipMovCc = "" ;
      AV44RecExiRea = DecimalUtil.ZERO ;
      AV47ComprasInv = DecimalUtil.ZERO ;
      AV48ConsumosInv = DecimalUtil.ZERO ;
      A3357CCStkDsc = "" ;
      A3349CCStkPre = DecimalUtil.ZERO ;
      A3343CCStkCanE = DecimalUtil.ZERO ;
      A3344CCStkCanS = DecimalUtil.ZERO ;
      A5722CCStkLot = "" ;
      A3352CCStkPar = "" ;
      A3355CCStkUsu = "" ;
      A13979CCStkLotFe = GXutil.nullDate() ;
      A810RecFec = GXutil.nullDate() ;
      AV49Recfec = GXutil.nullDate() ;
      A809RecExiTeo = DecimalUtil.ZERO ;
      A807RecExiRea = DecimalUtil.ZERO ;
      A808RecExiTcc = DecimalUtil.ZERO ;
      A806RecExiRcc = DecimalUtil.ZERO ;
      AV78Actualizardatos = "" ;
      AV70Usurcod = "" ;
      AV71Station = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV19ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV22DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV81Siacumular = "" ;
      Popover_tipmovcc_Gridinternalname = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_titlescategories_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnexportexcel_Jsonclick = "" ;
      bttBtncsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      ucDvpanel_informacion = new com.genexus.webpanels.GXUserControl();
      AV66SaldoInicialaFecha = "" ;
      AV67ExistenciasDif = DecimalUtil.ZERO ;
      bttBtnauditar_Jsonclick = "" ;
      ucDvpanel_movimientos = new com.genexus.webpanels.GXUserControl();
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucPopover_tipmovcc = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_titlescategories = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      WebComp_Wwpaux_wc_Component = "" ;
      OldWwpaux_wc = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV40DiaHora = "" ;
      AV90TipMovCcWithTags = "" ;
      AV41TipMovCc = "" ;
      AV42CCStkDsc = "" ;
      AV54CCStkCanE = DecimalUtil.ZERO ;
      AV55CCStkCanS = DecimalUtil.ZERO ;
      AV53CCStkPre = DecimalUtil.ZERO ;
      AV50Exis = DecimalUtil.ZERO ;
      AV56CCStkLot = "" ;
      AV65CCStkLotFech = GXutil.nullDate() ;
      AV57Hdr = "" ;
      AV64CCStkUsu = "" ;
      AV60CCStkPar = "" ;
      AV24CCStkFec = GXutil.nullDate() ;
      AV77WebSession = httpContext.getWebSession();
      GXv_int6 = new byte[1] ;
      AV95Emprnom = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext11 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV18Session = httpContext.getWebSession();
      AV14ColumnsSelectorXML = "" ;
      scmdbuf = "" ;
      H01NY2_A396EmprCod = new String[] {""} ;
      H01NY2_A719PrdNum = new String[] {""} ;
      H01NY2_A3345TipMovCc = new String[] {""} ;
      H01NY2_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      H01NY2_A3357CCStkDsc = new String[] {""} ;
      H01NY2_A3342CCStkLin = new long[1] ;
      H01NY2_A3349CCStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01NY2_A3343CCStkCanE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01NY2_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01NY2_A5722CCStkLot = new String[] {""} ;
      H01NY2_A3352CCStkPar = new String[] {""} ;
      H01NY2_A3351CCStkReo = new byte[1] ;
      H01NY2_A3350CCStkBar = new int[1] ;
      H01NY2_A3358CCStkLen = new short[1] ;
      H01NY2_A3353CCStkPed = new int[1] ;
      H01NY2_A3355CCStkUsu = new String[] {""} ;
      H01NY2_A13979CCStkLotFe = new java.util.Date[] {GXutil.nullDate()} ;
      H01NY2_A3356CCStkHor = new String[] {""} ;
      AV52CCStkHor = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV20ManageFiltersXml = "" ;
      AV73ProgressIndicator = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      GXv_char2 = new String[1] ;
      GXv_date12 = new java.util.Date[1] ;
      AV89ExcelFilename = "" ;
      AV88ErrorMessage = "" ;
      AV15UserCustomValue = "" ;
      GXt_char7 = "" ;
      AV17ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector17 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector18 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item19 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item20 = new GXBaseCollection[1] ;
      GXv_int4 = new long[1] ;
      AV69Inc_obs = "" ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXv_SdtWWPGridState21 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV79Window = new com.genexus.webpanels.GXWindow();
      AV43Recexiteo = DecimalUtil.ZERO ;
      AV45RecExiTcc = DecimalUtil.ZERO ;
      AV46RecExiRcc = DecimalUtil.ZERO ;
      H01NY3_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      H01NY3_A719PrdNum = new String[] {""} ;
      H01NY3_A396EmprCod = new String[] {""} ;
      H01NY3_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01NY3_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01NY3_A808RecExiTcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01NY3_A806RecExiRcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      GXv_date13 = new java.util.Date[1] ;
      AV82File = "" ;
      AV83Dif = DecimalUtil.ZERO ;
      AV84Dif2 = DecimalUtil.ZERO ;
      AV85obs = "" ;
      GXv_char3 = new String[1] ;
      GXv_decimal22 = new java.math.BigDecimal[1] ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      GXv_char8 = new String[1] ;
      GXv_char16 = new String[1] ;
      GXv_char15 = new String[1] ;
      ucDvelop_confirmpanel_btnauditar = new com.genexus.webpanels.GXUserControl();
      ucDvelop_confirmpanel_eliminar = new com.genexus.webpanels.GXUserControl();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV23Emprcod = "" ;
      sCtrlAV39PrdnumIN = "" ;
      sCtrlAV91CCstkfecfrom = "" ;
      sCtrlAV92CCstkfecto = "" ;
      sCtrlAV26Compras = "" ;
      sCtrlAV27Consumos = "" ;
      sCtrlAV28Devoluciones = "" ;
      sCtrlAV37SaldoInicial = "" ;
      sCtrlAV30Existenciascuentacorriente = "" ;
      sCtrlAV35PrdExiAlm = "" ;
      sCtrlAV34PrdCanres = "" ;
      sCtrlAV36PrdNom = "" ;
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.upq_cuentacorriente_wc__default(),
         new Object[] {
             new Object[] {
            H01NY2_A396EmprCod, H01NY2_A719PrdNum, H01NY2_A3345TipMovCc, H01NY2_A3348CCStkFec, H01NY2_A3357CCStkDsc, H01NY2_A3342CCStkLin, H01NY2_A3349CCStkPre, H01NY2_A3343CCStkCanE, H01NY2_A3344CCStkCanS, H01NY2_A5722CCStkLot,
            H01NY2_A3352CCStkPar, H01NY2_A3351CCStkReo, H01NY2_A3350CCStkBar, H01NY2_A3358CCStkLen, H01NY2_A3353CCStkPed, H01NY2_A3355CCStkUsu, H01NY2_A13979CCStkLotFe, H01NY2_A3356CCStkHor
            }
            , new Object[] {
            H01NY3_A810RecFec, H01NY3_A719PrdNum, H01NY3_A396EmprCod, H01NY3_A809RecExiTeo, H01NY3_A807RecExiRea, H01NY3_A808RecExiTcc, H01NY3_A806RecExiRcc
            }
         }
      );
      AV97Pgmname = "StocksQuimicos.UPQ_CuentaCorriente_WC" ;
      /* GeneXus formulas. */
      AV97Pgmname = "StocksQuimicos.UPQ_CuentaCorriente_WC" ;
      Gx_err = (short)(0) ;
      edtavSaldoinicialafecha_Enabled = 0 ;
      edtavExistenciascuentacorriente_Enabled = 0 ;
      edtavPrdexialm_Enabled = 0 ;
      edtavExistenciasdif_Enabled = 0 ;
      chkavPwdbo.setEnabled( 0 );
      edtavCompras_Enabled = 0 ;
      edtavConsumos_Enabled = 0 ;
      edtavDevoluciones_Enabled = 0 ;
      edtavCcstklin_Enabled = 0 ;
      edtavDiahora_Enabled = 0 ;
      edtavTipmovccwithtags_Enabled = 0 ;
      edtavTipmovcc_Enabled = 0 ;
      edtavCcstkdsc_Enabled = 0 ;
      edtavCcstkcane_Enabled = 0 ;
      edtavCcstkcans_Enabled = 0 ;
      edtavCcstkpre_Enabled = 0 ;
      edtavExis_Enabled = 0 ;
      edtavCcstklot_Enabled = 0 ;
      edtavCcstklotfech_Enabled = 0 ;
      edtavHdr_Enabled = 0 ;
      edtavCcstkusu_Enabled = 0 ;
      edtavCcstkbar_Enabled = 0 ;
      edtavCcstkreo_Enabled = 0 ;
      edtavCcstkpar_Enabled = 0 ;
      edtavCcstkped_Enabled = 0 ;
      edtavCcstklen_Enabled = 0 ;
      edtavCcstkfec_Enabled = 0 ;
      WebComp_Wwpaux_wc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV21ManageFiltersExecutionStep ;
   private byte A3351CCStkReo ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte AV59CCStkReo ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV51EntSalInv ;
   private short A3358CCStkLen ;
   private short wbEnd ;
   private short wbStart ;
   private short AV68AccionesGrupo ;
   private short AV62CCStkLen ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV80Cotexsur ;
   private short AV86i ;
   private int subGrid_Rows ;
   private int nRC_GXsfl_103 ;
   private int nGXsfl_103_idx=1 ;
   private int A3350CCStkBar ;
   private int A3353CCStkPed ;
   private int Popover_tipmovcc_Popoverwidth ;
   private int edtavSaldoinicialafecha_Enabled ;
   private int edtavExistenciascuentacorriente_Enabled ;
   private int edtavPrdexialm_Enabled ;
   private int edtavExistenciasdif_Enabled ;
   private int edtavCompras_Enabled ;
   private int edtavConsumos_Enabled ;
   private int edtavDevoluciones_Enabled ;
   private int AV58CCStkBar ;
   private int AV63CCStkPed ;
   private int subGrid_Islastpage ;
   private int edtavCcstklin_Enabled ;
   private int edtavDiahora_Enabled ;
   private int edtavTipmovccwithtags_Enabled ;
   private int edtavTipmovcc_Enabled ;
   private int edtavCcstkdsc_Enabled ;
   private int edtavCcstkcane_Enabled ;
   private int edtavCcstkcans_Enabled ;
   private int edtavCcstkpre_Enabled ;
   private int edtavExis_Enabled ;
   private int edtavCcstklot_Enabled ;
   private int edtavCcstklotfech_Enabled ;
   private int edtavHdr_Enabled ;
   private int edtavCcstkusu_Enabled ;
   private int edtavCcstkbar_Enabled ;
   private int edtavCcstkreo_Enabled ;
   private int edtavCcstkpar_Enabled ;
   private int edtavCcstkped_Enabled ;
   private int edtavCcstklen_Enabled ;
   private int edtavCcstkfec_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int subGrid_Recordcount ;
   private int edtavCcstklin_Visible ;
   private int edtavDiahora_Visible ;
   private int edtavTipmovccwithtags_Visible ;
   private int edtavCcstkdsc_Visible ;
   private int edtavCcstkcane_Visible ;
   private int edtavCcstkcans_Visible ;
   private int edtavCcstkpre_Visible ;
   private int edtavExis_Visible ;
   private int edtavCcstklot_Visible ;
   private int edtavCcstklotfech_Visible ;
   private int edtavHdr_Visible ;
   private int edtavCcstkusu_Visible ;
   private int AV98GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavTipmovcc_Visible ;
   private int edtavCcstkbar_Visible ;
   private int edtavCcstkreo_Visible ;
   private int edtavCcstkpar_Visible ;
   private int edtavCcstkped_Visible ;
   private int edtavCcstklen_Visible ;
   private int edtavCcstkfec_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long A3342CCStkLin ;
   private long AV75Password ;
   private long AV13CCStkLin ;
   private long GRID_nCurrentRecord ;
   private long GXt_int1 ;
   private long GXv_int4[] ;
   private java.math.BigDecimal wcpOAV26Compras ;
   private java.math.BigDecimal wcpOAV27Consumos ;
   private java.math.BigDecimal wcpOAV28Devoluciones ;
   private java.math.BigDecimal wcpOAV37SaldoInicial ;
   private java.math.BigDecimal wcpOAV30Existenciascuentacorriente ;
   private java.math.BigDecimal wcpOAV35PrdExiAlm ;
   private java.math.BigDecimal wcpOAV34PrdCanres ;
   private java.math.BigDecimal AV26Compras ;
   private java.math.BigDecimal AV27Consumos ;
   private java.math.BigDecimal AV28Devoluciones ;
   private java.math.BigDecimal AV37SaldoInicial ;
   private java.math.BigDecimal AV30Existenciascuentacorriente ;
   private java.math.BigDecimal AV35PrdExiAlm ;
   private java.math.BigDecimal AV34PrdCanres ;
   private java.math.BigDecimal AV44RecExiRea ;
   private java.math.BigDecimal AV47ComprasInv ;
   private java.math.BigDecimal AV48ConsumosInv ;
   private java.math.BigDecimal A3349CCStkPre ;
   private java.math.BigDecimal A3343CCStkCanE ;
   private java.math.BigDecimal A3344CCStkCanS ;
   private java.math.BigDecimal A809RecExiTeo ;
   private java.math.BigDecimal A807RecExiRea ;
   private java.math.BigDecimal A808RecExiTcc ;
   private java.math.BigDecimal A806RecExiRcc ;
   private java.math.BigDecimal AV67ExistenciasDif ;
   private java.math.BigDecimal AV54CCStkCanE ;
   private java.math.BigDecimal AV55CCStkCanS ;
   private java.math.BigDecimal AV53CCStkPre ;
   private java.math.BigDecimal AV50Exis ;
   private java.math.BigDecimal AV43Recexiteo ;
   private java.math.BigDecimal AV45RecExiTcc ;
   private java.math.BigDecimal AV46RecExiRcc ;
   private java.math.BigDecimal AV83Dif ;
   private java.math.BigDecimal AV84Dif2 ;
   private java.math.BigDecimal GXv_decimal22[] ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private String wcpOAV23Emprcod ;
   private String wcpOAV39PrdnumIN ;
   private String wcpOAV36PrdNom ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String Dvelop_confirmpanel_eliminar_Result ;
   private String Dvelop_confirmpanel_btnauditar_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV23Emprcod ;
   private String AV39PrdnumIN ;
   private String AV36PrdNom ;
   private String sGXsfl_103_idx="0001" ;
   private String AV97Pgmname ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String A3356CCStkHor ;
   private String A3345TipMovCc ;
   private String A3357CCStkDsc ;
   private String A5722CCStkLot ;
   private String A3352CCStkPar ;
   private String A3355CCStkUsu ;
   private String AV78Actualizardatos ;
   private String AV70Usurcod ;
   private String AV71Station ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV81Siacumular ;
   private String Ddo_managefilters_Icontype ;
   private String Ddo_managefilters_Icon ;
   private String Ddo_managefilters_Tooltip ;
   private String Ddo_managefilters_Cls ;
   private String Dvpanel_tableheader_Width ;
   private String Dvpanel_tableheader_Cls ;
   private String Dvpanel_tableheader_Title ;
   private String Dvpanel_tableheader_Iconposition ;
   private String Dvpanel_informacion_Width ;
   private String Dvpanel_informacion_Cls ;
   private String Dvpanel_informacion_Title ;
   private String Dvpanel_informacion_Iconposition ;
   private String Dvpanel_movimientos_Width ;
   private String Dvpanel_movimientos_Cls ;
   private String Dvpanel_movimientos_Title ;
   private String Dvpanel_movimientos_Iconposition ;
   private String Popover_tipmovcc_Gridinternalname ;
   private String Popover_tipmovcc_Iteminternalname ;
   private String Popover_tipmovcc_Trigger ;
   private String Popover_tipmovcc_Position ;
   private String Ddo_grid_Caption ;
   private String Ddo_grid_Gridinternalname ;
   private String Ddo_grid_Columnids ;
   private String Ddo_grid_Columnssortvalues ;
   private String Ddo_grid_Fixable ;
   private String Ddo_gridcolumnsselector_Caption ;
   private String Ddo_gridcolumnsselector_Tooltip ;
   private String Ddo_gridcolumnsselector_Cls ;
   private String Ddo_gridcolumnsselector_Dropdownoptionstype ;
   private String Ddo_gridcolumnsselector_Gridinternalname ;
   private String Ddo_gridcolumnsselector_Titlecontrolidtoreplace ;
   private String Dvelop_confirmpanel_eliminar_Title ;
   private String Dvelop_confirmpanel_eliminar_Confirmationtext ;
   private String Dvelop_confirmpanel_eliminar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_eliminar_Confirmtype ;
   private String Dvelop_confirmpanel_btnauditar_Title ;
   private String Dvelop_confirmpanel_btnauditar_Confirmationtext ;
   private String Dvelop_confirmpanel_btnauditar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_btnauditar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_btnauditar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_btnauditar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_btnauditar_Confirmtype ;
   private String Grid_titlescategories_Gridinternalname ;
   private String Grid_titlescategories_Gridtitlescategories ;
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Popoversingrid ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divTableactions_Internalname ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtnexportexcel_Internalname ;
   private String bttBtnexportexcel_Jsonclick ;
   private String bttBtncsv_Internalname ;
   private String bttBtncsv_Jsonclick ;
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String Dvpanel_informacion_Internalname ;
   private String divInformacion_Internalname ;
   private String grpUnnamedgroup1_Internalname ;
   private String divSaldoinicial_Internalname ;
   private String edtavSaldoinicialafecha_Internalname ;
   private String edtavSaldoinicialafecha_Jsonclick ;
   private String grpUnnamedgroup2_Internalname ;
   private String divControlexistencias_Internalname ;
   private String edtavExistenciascuentacorriente_Internalname ;
   private String edtavExistenciascuentacorriente_Jsonclick ;
   private String edtavPrdexialm_Internalname ;
   private String edtavPrdexialm_Jsonclick ;
   private String edtavExistenciasdif_Internalname ;
   private String edtavExistenciasdif_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String bttBtnauditar_Internalname ;
   private String bttBtnauditar_Jsonclick ;
   private String grpUnnamedgroup3_Internalname ;
   private String divResumenmovimientos_Internalname ;
   private String edtavCompras_Internalname ;
   private String edtavCompras_Jsonclick ;
   private String edtavConsumos_Internalname ;
   private String edtavConsumos_Jsonclick ;
   private String edtavDevoluciones_Internalname ;
   private String edtavDevoluciones_Jsonclick ;
   private String Dvpanel_movimientos_Internalname ;
   private String divMovimientos_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Popover_tipmovcc_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_titlescategories_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDiv_wwpauxwc_Internalname ;
   private String WebComp_Wwpaux_wc_Component ;
   private String OldWwpaux_wc ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavCcstklin_Internalname ;
   private String AV40DiaHora ;
   private String edtavDiahora_Internalname ;
   private String edtavTipmovccwithtags_Internalname ;
   private String AV41TipMovCc ;
   private String edtavTipmovcc_Internalname ;
   private String AV42CCStkDsc ;
   private String edtavCcstkdsc_Internalname ;
   private String edtavCcstkcane_Internalname ;
   private String edtavCcstkcans_Internalname ;
   private String edtavCcstkpre_Internalname ;
   private String edtavExis_Internalname ;
   private String AV56CCStkLot ;
   private String edtavCcstklot_Internalname ;
   private String edtavCcstklotfech_Internalname ;
   private String AV57Hdr ;
   private String edtavHdr_Internalname ;
   private String AV64CCStkUsu ;
   private String edtavCcstkusu_Internalname ;
   private String edtavCcstkbar_Internalname ;
   private String edtavCcstkreo_Internalname ;
   private String AV60CCStkPar ;
   private String edtavCcstkpar_Internalname ;
   private String edtavCcstkped_Internalname ;
   private String edtavCcstklen_Internalname ;
   private String edtavCcstkfec_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String AV95Emprnom ;
   private String edtavCcstklin_Columnheaderclass ;
   private String edtavDiahora_Columnheaderclass ;
   private String edtavTipmovccwithtags_Columnheaderclass ;
   private String edtavCcstkdsc_Columnheaderclass ;
   private String edtavCcstkcane_Columnheaderclass ;
   private String edtavCcstkcans_Columnheaderclass ;
   private String edtavCcstkpre_Columnheaderclass ;
   private String edtavExis_Columnheaderclass ;
   private String edtavCcstklot_Columnheaderclass ;
   private String edtavCcstklotfech_Columnheaderclass ;
   private String edtavHdr_Columnheaderclass ;
   private String edtavCcstkusu_Columnheaderclass ;
   private String scmdbuf ;
   private String AV52CCStkHor ;
   private String edtavCcstklin_Columnclass ;
   private String edtavDiahora_Columnclass ;
   private String edtavTipmovccwithtags_Columnclass ;
   private String edtavCcstkdsc_Columnclass ;
   private String edtavCcstkcane_Columnclass ;
   private String edtavCcstkcans_Columnclass ;
   private String edtavCcstkpre_Columnclass ;
   private String edtavExis_Columnclass ;
   private String edtavCcstklot_Columnclass ;
   private String edtavCcstklotfech_Columnclass ;
   private String edtavHdr_Columnclass ;
   private String edtavCcstkusu_Columnclass ;
   private String GXv_char2[] ;
   private String GXt_char7 ;
   private String AV85obs ;
   private String GXv_char3[] ;
   private String GXv_char8[] ;
   private String GXv_char16[] ;
   private String GXv_char15[] ;
   private String tblTabledvelop_confirmpanel_btnauditar_Internalname ;
   private String Dvelop_confirmpanel_btnauditar_Internalname ;
   private String tblTabledvelop_confirmpanel_eliminar_Internalname ;
   private String Dvelop_confirmpanel_eliminar_Internalname ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV23Emprcod ;
   private String sCtrlAV39PrdnumIN ;
   private String sCtrlAV91CCstkfecfrom ;
   private String sCtrlAV92CCstkfecto ;
   private String sCtrlAV26Compras ;
   private String sCtrlAV27Consumos ;
   private String sCtrlAV28Devoluciones ;
   private String sCtrlAV37SaldoInicial ;
   private String sCtrlAV30Existenciascuentacorriente ;
   private String sCtrlAV35PrdExiAlm ;
   private String sCtrlAV34PrdCanres ;
   private String sCtrlAV36PrdNom ;
   private String sGXsfl_103_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtavCcstklin_Jsonclick ;
   private String edtavDiahora_Jsonclick ;
   private String edtavTipmovccwithtags_Jsonclick ;
   private String edtavTipmovcc_Jsonclick ;
   private String edtavCcstkdsc_Jsonclick ;
   private String edtavCcstkcane_Jsonclick ;
   private String edtavCcstkcans_Jsonclick ;
   private String edtavCcstkpre_Jsonclick ;
   private String edtavExis_Jsonclick ;
   private String edtavCcstklot_Jsonclick ;
   private String edtavCcstklotfech_Jsonclick ;
   private String edtavHdr_Jsonclick ;
   private String edtavCcstkusu_Jsonclick ;
   private String edtavCcstkbar_Jsonclick ;
   private String edtavCcstkreo_Jsonclick ;
   private String edtavCcstkpar_Jsonclick ;
   private String edtavCcstkped_Jsonclick ;
   private String edtavCcstklen_Jsonclick ;
   private String edtavCcstkfec_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV91CCstkfecfrom ;
   private java.util.Date wcpOAV92CCstkfecto ;
   private java.util.Date AV91CCstkfecfrom ;
   private java.util.Date AV92CCstkfecto ;
   private java.util.Date A3348CCStkFec ;
   private java.util.Date A13979CCStkLotFe ;
   private java.util.Date A810RecFec ;
   private java.util.Date AV49Recfec ;
   private java.util.Date AV65CCStkLotFech ;
   private java.util.Date AV24CCStkFec ;
   private java.util.Date GXv_date12[] ;
   private java.util.Date GXv_date13[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV76PwdBo ;
   private boolean Dvpanel_tableheader_Autowidth ;
   private boolean Dvpanel_tableheader_Autoheight ;
   private boolean Dvpanel_tableheader_Collapsible ;
   private boolean Dvpanel_tableheader_Collapsed ;
   private boolean Dvpanel_tableheader_Showcollapseicon ;
   private boolean Dvpanel_tableheader_Autoscroll ;
   private boolean Dvpanel_informacion_Autowidth ;
   private boolean Dvpanel_informacion_Autoheight ;
   private boolean Dvpanel_informacion_Collapsible ;
   private boolean Dvpanel_informacion_Collapsed ;
   private boolean Dvpanel_informacion_Showcollapseicon ;
   private boolean Dvpanel_informacion_Autoscroll ;
   private boolean Dvpanel_movimientos_Autowidth ;
   private boolean Dvpanel_movimientos_Autoheight ;
   private boolean Dvpanel_movimientos_Collapsible ;
   private boolean Dvpanel_movimientos_Collapsed ;
   private boolean Dvpanel_movimientos_Showcollapseicon ;
   private boolean Dvpanel_movimientos_Autoscroll ;
   private boolean Popover_tipmovcc_Isgriditem ;
   private boolean Grid_empowerer_Hascategories ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean Grid_empowerer_Hascolumnsselector ;
   private boolean wbLoad ;
   private boolean bGXsfl_103_Refreshing=false ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV14ColumnsSelectorXML ;
   private String AV20ManageFiltersXml ;
   private String AV15UserCustomValue ;
   private String AV12FilterFullText ;
   private String AV66SaldoInicialaFecha ;
   private String AV90TipMovCcWithTags ;
   private String AV89ExcelFilename ;
   private String AV88ErrorMessage ;
   private String AV69Inc_obs ;
   private String AV82File ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.webpanels.GXWindow AV79Window ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wwpaux_wc ;
   private com.genexus.webpanels.WebSession AV18Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_informacion ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_movimientos ;
   private com.genexus.webpanels.GXUserControl ucPopover_tipmovcc ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_titlescategories ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_btnauditar ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminar ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private ICheckbox chkavActualizardatos ;
   private ICheckbox chkavPwdbo ;
   private HTMLChoice cmbavAccionesgrupo ;
   private IDataStoreProvider pr_default ;
   private String[] H01NY2_A396EmprCod ;
   private String[] H01NY2_A719PrdNum ;
   private String[] H01NY2_A3345TipMovCc ;
   private java.util.Date[] H01NY2_A3348CCStkFec ;
   private String[] H01NY2_A3357CCStkDsc ;
   private long[] H01NY2_A3342CCStkLin ;
   private java.math.BigDecimal[] H01NY2_A3349CCStkPre ;
   private java.math.BigDecimal[] H01NY2_A3343CCStkCanE ;
   private java.math.BigDecimal[] H01NY2_A3344CCStkCanS ;
   private String[] H01NY2_A5722CCStkLot ;
   private String[] H01NY2_A3352CCStkPar ;
   private byte[] H01NY2_A3351CCStkReo ;
   private int[] H01NY2_A3350CCStkBar ;
   private short[] H01NY2_A3358CCStkLen ;
   private int[] H01NY2_A3353CCStkPed ;
   private String[] H01NY2_A3355CCStkUsu ;
   private java.util.Date[] H01NY2_A13979CCStkLotFe ;
   private String[] H01NY2_A3356CCStkHor ;
   private java.util.Date[] H01NY3_A810RecFec ;
   private String[] H01NY3_A719PrdNum ;
   private String[] H01NY3_A396EmprCod ;
   private java.math.BigDecimal[] H01NY3_A809RecExiTeo ;
   private java.math.BigDecimal[] H01NY3_A807RecExiRea ;
   private java.math.BigDecimal[] H01NY3_A808RecExiTcc ;
   private java.math.BigDecimal[] H01NY3_A806RecExiRcc ;
   private com.genexus.webpanels.WebSession AV77WebSession ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV19ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item19 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item20[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV17ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector17[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector18[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV22DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState21[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV73ProgressIndicator ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext11[] ;
}

final  class upq_cuentacorriente_wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01NY2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV91CCstkfecfrom ,
                                          java.util.Date AV92CCstkfecto ,
                                          java.util.Date A3348CCStkFec ,
                                          String A3345TipMovCc ,
                                          String AV23Emprcod ,
                                          String AV39PrdnumIN ,
                                          String A396EmprCod ,
                                          String A719PrdNum )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int23 = new byte[4];
      Object[] GXv_Object24 = new Object[2];
      scmdbuf = "SELECT EmprCod, PrdNum, TipMovCc, CCStkFec, CCStkDsc, CCStkLin, CCStkPre, CCStkCanE, CCStkCanS, CCStkLot, CCStkPar, CCStkReo, CCStkBar, CCStkLen, CCStkPed, CCStkUsu," ;
      scmdbuf += " CCStkLotFe, CCStkHor FROM TXPCCSTKS" ;
      addWhere(sWhereString, "(EmprCod = ? and PrdNum = ?)");
      addWhere(sWhereString, "(TipMovCc <> 'EC')");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91CCstkfecfrom)) )
      {
         addWhere(sWhereString, "(CCStkFec >= ?)");
      }
      else
      {
         GXv_int23[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV92CCstkfecto)) )
      {
         addWhere(sWhereString, "(CCStkFec <= ?)");
      }
      else
      {
         GXv_int23[3] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, PrdNum, CCStkFec, CCStkHor" ;
      GXv_Object24[0] = scmdbuf ;
      GXv_Object24[1] = GXv_int23 ;
      return GXv_Object24 ;
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
                  return conditional_H01NY2(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01NY2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01NY3", "SELECT RecFec, PrdNum, EmprCod, RecExiTeo, RecExiRea, RecExiTcc, RecExiRcc FROM TXPRECUEN WHERE EmprCod = ? and PrdNum = ? and RecFec = ? ORDER BY EmprCod, PrdNum, RecFec ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((long[]) buf[5])[0] = rslt.getLong(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,4);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,4);
               ((String[]) buf[9])[0] = rslt.getString(10, 26);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 8);
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(17);
               ((String[]) buf[17])[0] = rslt.getString(18, 8);
               return;
            case 1 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
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
                  stmt.setString(sIdx, (String)parms[4], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[5], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[6]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[7]);
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
      }
   }

}

