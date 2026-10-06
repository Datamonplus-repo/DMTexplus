package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class upq_cuentacorriente_t_wc_impl extends GXWebComponent
{
   public upq_cuentacorriente_t_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public upq_cuentacorriente_t_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( upq_cuentacorriente_t_wc_impl.class ));
   }

   public upq_cuentacorriente_t_wc_impl( int remoteHandle ,
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
               AV20Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20Emprcod", AV20Emprcod);
               AV43Prdnum = httpContext.GetPar( "Prdnum") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43Prdnum", AV43Prdnum);
               AV10CCstkfecfrom = localUtil.parseDateParm( httpContext.GetPar( "CCstkfecfrom")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10CCstkfecfrom", localUtil.format(AV10CCstkfecfrom, "99/99/99"));
               AV11CCstkfecto = localUtil.parseDateParm( httpContext.GetPar( "CCstkfecto")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11CCstkfecto", localUtil.format(AV11CCstkfecto, "99/99/99"));
               AV15Compras = CommonUtil.decimalVal( httpContext.GetPar( "Compras"), ".") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15Compras", GXutil.ltrimstr( AV15Compras, 12, 4));
               AV16Consumos = CommonUtil.decimalVal( httpContext.GetPar( "Consumos"), ".") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16Consumos", GXutil.ltrimstr( AV16Consumos, 12, 4));
               AV18Devoluciones = CommonUtil.decimalVal( httpContext.GetPar( "Devoluciones"), ".") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18Devoluciones", GXutil.ltrimstr( AV18Devoluciones, 12, 4));
               AV44SaldoInicial = CommonUtil.decimalVal( httpContext.GetPar( "SaldoInicial"), ".") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44SaldoInicial", GXutil.ltrimstr( AV44SaldoInicial, 12, 4));
               AV24Existenciascuentacorriente = CommonUtil.decimalVal( httpContext.GetPar( "Existenciascuentacorriente"), ".") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24Existenciascuentacorriente", GXutil.ltrimstr( AV24Existenciascuentacorriente, 12, 4));
               AV41PrdExiAlm = CommonUtil.decimalVal( httpContext.GetPar( "PrdExiAlm"), ".") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41PrdExiAlm", GXutil.ltrimstr( AV41PrdExiAlm, 12, 4));
               AV40PrdCanres = CommonUtil.decimalVal( httpContext.GetPar( "PrdCanres"), ".") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40PrdCanres", GXutil.ltrimstr( AV40PrdCanres, 12, 4));
               AV42PrdNom = httpContext.GetPar( "PrdNom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42PrdNom", AV42PrdNom);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV20Emprcod,AV43Prdnum,AV10CCstkfecfrom,AV11CCstkfecto,AV15Compras,AV16Consumos,AV18Devoluciones,AV44SaldoInicial,AV24Existenciascuentacorriente,AV41PrdExiAlm,AV40PrdCanres,AV42PrdNom});
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
      nRC_GXsfl_101 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_101"))) ;
      nGXsfl_101_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_101_idx"))) ;
      sGXsfl_101_idx = httpContext.GetPar( "sGXsfl_101_idx") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      AV23Exis = CommonUtil.decimalVal( httpContext.GetPar( "Exis"), ".") ;
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
      AV25FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV20Emprcod = httpContext.GetPar( "Emprcod") ;
      AV43Prdnum = httpContext.GetPar( "Prdnum") ;
      AV10CCstkfecfrom = localUtil.parseDateParm( httpContext.GetPar( "CCstkfecfrom")) ;
      AV11CCstkfecto = localUtil.parseDateParm( httpContext.GetPar( "CCstkfecto")) ;
      AV34ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV12ColumnsSelector);
      AV48TFCCStkLin = GXutil.lval( httpContext.GetPar( "TFCCStkLin")) ;
      AV49TFCCStkLin_To = GXutil.lval( httpContext.GetPar( "TFCCStkLin_To")) ;
      AV56TFTipMovCc = httpContext.GetPar( "TFTipMovCc") ;
      AV57TFTipMovCc_Sel = httpContext.GetPar( "TFTipMovCc_Sel") ;
      AV46TFCCStkDsc = httpContext.GetPar( "TFCCStkDsc") ;
      AV47TFCCStkDsc_Sel = httpContext.GetPar( "TFCCStkDsc_Sel") ;
      AV52TFCCStkPre = CommonUtil.decimalVal( httpContext.GetPar( "TFCCStkPre"), ".") ;
      AV53TFCCStkPre_To = CommonUtil.decimalVal( httpContext.GetPar( "TFCCStkPre_To"), ".") ;
      AV50TFCCStkLot = httpContext.GetPar( "TFCCStkLot") ;
      AV51TFCCStkLot_Sel = httpContext.GetPar( "TFCCStkLot_Sel") ;
      AV54TFCCStkUsu = httpContext.GetPar( "TFCCStkUsu") ;
      AV55TFCCStkUsu_Sel = httpContext.GetPar( "TFCCStkUsu_Sel") ;
      AV69TFCCStkFec = localUtil.parseDateParm( httpContext.GetPar( "TFCCStkFec")) ;
      AV73TFCCStkHor = httpContext.GetPar( "TFCCStkHor") ;
      AV74TFCCStkHor_Sel = httpContext.GetPar( "TFCCStkHor_Sel") ;
      AV77Pgmname = httpContext.GetPar( "Pgmname") ;
      AV36OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV38OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV15Compras = CommonUtil.decimalVal( httpContext.GetPar( "Compras"), ".") ;
      AV16Consumos = CommonUtil.decimalVal( httpContext.GetPar( "Consumos"), ".") ;
      AV18Devoluciones = CommonUtil.decimalVal( httpContext.GetPar( "Devoluciones"), ".") ;
      AV44SaldoInicial = CommonUtil.decimalVal( httpContext.GetPar( "SaldoInicial"), ".") ;
      AV24Existenciascuentacorriente = CommonUtil.decimalVal( httpContext.GetPar( "Existenciascuentacorriente"), ".") ;
      AV41PrdExiAlm = CommonUtil.decimalVal( httpContext.GetPar( "PrdExiAlm"), ".") ;
      AV40PrdCanres = CommonUtil.decimalVal( httpContext.GetPar( "PrdCanres"), ".") ;
      AV42PrdNom = httpContext.GetPar( "PrdNom") ;
      AV23Exis = CommonUtil.decimalVal( httpContext.GetPar( "Exis"), ".") ;
      AV62Actualizardatos = httpContext.GetPar( "Actualizardatos") ;
      AV64PwdBo = GXutil.strtobool( httpContext.GetPar( "PwdBo")) ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A719PrdNum = httpContext.GetPar( "PrdNum") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV25FilterFullText, AV20Emprcod, AV43Prdnum, AV10CCstkfecfrom, AV11CCstkfecto, AV34ManageFiltersExecutionStep, AV12ColumnsSelector, AV48TFCCStkLin, AV49TFCCStkLin_To, AV56TFTipMovCc, AV57TFTipMovCc_Sel, AV46TFCCStkDsc, AV47TFCCStkDsc_Sel, AV52TFCCStkPre, AV53TFCCStkPre_To, AV50TFCCStkLot, AV51TFCCStkLot_Sel, AV54TFCCStkUsu, AV55TFCCStkUsu_Sel, AV69TFCCStkFec, AV73TFCCStkHor, AV74TFCCStkHor_Sel, AV77Pgmname, AV36OrderedBy, AV38OrderedDsc, AV15Compras, AV16Consumos, AV18Devoluciones, AV44SaldoInicial, AV24Existenciascuentacorriente, AV41PrdExiAlm, AV40PrdCanres, AV42PrdNom, AV23Exis, AV62Actualizardatos, AV64PwdBo, A396EmprCod, A719PrdNum, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1SQ2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( " UPQ_Cuenta CorrienteTRN", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.stocksquimicos.upq_cuentacorriente_t_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV20Emprcod)),GXutil.URLEncode(GXutil.rtrim(AV43Prdnum)),GXutil.URLEncode(GXutil.formatDateParm(AV10CCstkfecfrom)),GXutil.URLEncode(GXutil.formatDateParm(AV11CCstkfecto)),GXutil.URLEncode(DecimalUtil.decToString(AV15Compras)),GXutil.URLEncode(DecimalUtil.decToString(AV16Consumos)),GXutil.URLEncode(DecimalUtil.decToString(AV18Devoluciones)),GXutil.URLEncode(DecimalUtil.decToString(AV44SaldoInicial)),GXutil.URLEncode(DecimalUtil.decToString(AV24Existenciascuentacorriente)),GXutil.URLEncode(DecimalUtil.decToString(AV41PrdExiAlm)),GXutil.URLEncode(DecimalUtil.decToString(AV40PrdCanres)),GXutil.URLEncode(GXutil.rtrim(AV42PrdNom))}, new String[] {"Emprcod","Prdnum","CCstkfecfrom","CCstkfecto","Compras","Consumos","Devoluciones","SaldoInicial","Existenciascuentacorriente","PrdExiAlm","PrdCanres","PrdNom"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_PRDNUM", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A719PrdNum, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"UPQ_CuentaCorriente_t_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV77Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("stocksquimicos\\upq_cuentacorriente_t_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXH_vFILTERFULLTEXT", AV25FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_101", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_101, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV33ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV33ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV26GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV27GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV17DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV17DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV12ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV12ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV20Emprcod", GXutil.rtrim( wcpOAV20Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV43Prdnum", GXutil.rtrim( wcpOAV43Prdnum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV10CCstkfecfrom", localUtil.dtoc( wcpOAV10CCstkfecfrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV11CCstkfecto", localUtil.dtoc( wcpOAV11CCstkfecto, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV15Compras", GXutil.ltrim( localUtil.ntoc( wcpOAV15Compras, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV16Consumos", GXutil.ltrim( localUtil.ntoc( wcpOAV16Consumos, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV18Devoluciones", GXutil.ltrim( localUtil.ntoc( wcpOAV18Devoluciones, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV44SaldoInicial", GXutil.ltrim( localUtil.ntoc( wcpOAV44SaldoInicial, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV24Existenciascuentacorriente", GXutil.ltrim( localUtil.ntoc( wcpOAV24Existenciascuentacorriente, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV41PrdExiAlm", GXutil.ltrim( localUtil.ntoc( wcpOAV41PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV40PrdCanres", GXutil.ltrim( localUtil.ntoc( wcpOAV40PrdCanres, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV42PrdNom", GXutil.rtrim( wcpOAV42PrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV34ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCCSTKLIN", GXutil.ltrim( localUtil.ntoc( AV48TFCCStkLin, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCCSTKLIN_TO", GXutil.ltrim( localUtil.ntoc( AV49TFCCStkLin_To, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFTIPMOVCC", GXutil.rtrim( AV56TFTipMovCc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFTIPMOVCC_SEL", GXutil.rtrim( AV57TFTipMovCc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCCSTKDSC", GXutil.rtrim( AV46TFCCStkDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCCSTKDSC_SEL", GXutil.rtrim( AV47TFCCStkDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCCSTKPRE", GXutil.ltrim( localUtil.ntoc( AV52TFCCStkPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCCSTKPRE_TO", GXutil.ltrim( localUtil.ntoc( AV53TFCCStkPre_To, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCCSTKLOT", GXutil.rtrim( AV50TFCCStkLot));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCCSTKLOT_SEL", GXutil.rtrim( AV51TFCCStkLot_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCCSTKUSU", GXutil.rtrim( AV54TFCCStkUsu));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCCSTKUSU_SEL", GXutil.rtrim( AV55TFCCStkUsu_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCCSTKFEC", localUtil.dtoc( AV69TFCCStkFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCCSTKHOR", GXutil.rtrim( AV73TFCCStkHor));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCCSTKHOR_SEL", GXutil.rtrim( AV74TFCCStkHor_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV36OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV38OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV20Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRDNUM", GXutil.rtrim( AV43Prdnum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCCSTKFECFROM", localUtil.dtoc( AV10CCstkfecfrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCCSTKFECTO", localUtil.dtoc( AV11CCstkfecto, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSALDOINICIAL", GXutil.ltrim( localUtil.ntoc( AV44SaldoInicial, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRDCANRES", GXutil.ltrim( localUtil.ntoc( AV40PrdCanres, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRDNOM", GXutil.rtrim( AV42PrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CCSTKCANE", GXutil.ltrim( localUtil.ntoc( A3343CCStkCanE, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CCSTKCANS", GXutil.ltrim( localUtil.ntoc( A3344CCStkCanS, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV28GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV28GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PRDNUM", GXutil.rtrim( A719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_PRDNUM", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A719PrdNum, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD_SELECTED", GXutil.rtrim( AV97Emprcod_selected));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRDNUM_SELECTED", GXutil.rtrim( AV98Prdnum_selected));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCCSTKLIN_SELECTED", GXutil.ltrim( localUtil.ntoc( AV99Ccstklin_selected, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Result));
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

   public void renderHtmlCloseForm1SQ2( )
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
      return "StocksQuimicos.UPQ_CuentaCorriente_t_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " UPQ_Cuenta CorrienteTRN", "") ;
   }

   public void wb1SQ0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.stocksquimicos.upq_cuentacorriente_t_wc");
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 101, 3, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\UPQ_CuentaCorriente_t_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 101, 3, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\UPQ_CuentaCorriente_t_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 101, 3, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\UPQ_CuentaCorriente_t_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_23_1SQ2( true) ;
      }
      else
      {
         wb_table1_23_1SQ2( false) ;
      }
      return  ;
   }

   public void wb_table1_23_1SQ2e( boolean wbgen )
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
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup1_Internalname, httpContext.getMessage( "Saldo Inicial", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_t_WC.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'" + sPrefix + "',false,'" + sGXsfl_101_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSaldoinicialafecha_Internalname, AV5SaldoInicialaFecha, GXutil.rtrim( localUtil.format( AV5SaldoInicialaFecha, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,48);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSaldoinicialafecha_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavSaldoinicialafecha_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_t_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</fieldset>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Control Group */
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup2_Internalname, httpContext.getMessage( "Control Existencias", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_t_WC.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavExistenciascuentacorriente_Internalname, GXutil.ltrim( localUtil.ntoc( AV24Existenciascuentacorriente, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavExistenciascuentacorriente_Enabled!=0) ? localUtil.format( AV24Existenciascuentacorriente, "ZZZZZZ9.9999") : localUtil.format( AV24Existenciascuentacorriente, "ZZZZZZ9.9999"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavExistenciascuentacorriente_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavExistenciascuentacorriente_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_t_WC.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPrdexialm_Internalname, GXutil.ltrim( localUtil.ntoc( AV41PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavPrdexialm_Enabled!=0) ? localUtil.format( AV41PrdExiAlm, "ZZZZZZ9.9999") : localUtil.format( AV41PrdExiAlm, "ZZZZZZ9.9999"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPrdexialm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPrdexialm_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_t_WC.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'" + sPrefix + "',false,'" + sGXsfl_101_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavExistenciasdif_Internalname, GXutil.ltrim( localUtil.ntoc( AV63ExistenciasDif, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavExistenciasdif_Enabled!=0) ? localUtil.format( AV63ExistenciasDif, "ZZZZZZ9.9999") : localUtil.format( AV63ExistenciasDif, "ZZZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,64);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavExistenciasdif_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavExistenciasdif_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_t_WC.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnauditar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 101, 3, 0)+","+"null"+");", httpContext.getMessage( "Auditar", ""), bttBtnauditar_Jsonclick, 7, httpContext.getMessage( "Auditar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e111sq1_client"+"'", TempTags, "", 2, "HLP_StocksQuimicos\\UPQ_CuentaCorriente_t_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavActualizardatos.getInternalname()+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'" + sPrefix + "',false,'" + sGXsfl_101_idx + "',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavActualizardatos.getInternalname(), AV62Actualizardatos, "", "", 1, chkavActualizardatos.getEnabled(), "S", httpContext.getMessage( "Actualizar Datos?", ""), StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(74, this, 'S', 'N',"+"'"+sPrefix+"'"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,74);\"");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'" + sPrefix + "',false,'" + sGXsfl_101_idx + "',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavPwdbo.getInternalname(), GXutil.booltostr( AV64PwdBo), "", "", 1, chkavPwdbo.getEnabled(), "true", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(78, this, 'true', 'false',"+"'"+sPrefix+"'"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,78);\"");
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
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup3_Internalname, httpContext.getMessage( "Resumen Movimientos", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_t_WC.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCompras_Internalname, GXutil.ltrim( localUtil.ntoc( AV15Compras, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCompras_Enabled!=0) ? localUtil.format( AV15Compras, "ZZZZZZ9.9999") : localUtil.format( AV15Compras, "ZZZZZZ9.9999"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCompras_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCompras_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_t_WC.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavConsumos_Internalname, GXutil.ltrim( localUtil.ntoc( AV16Consumos, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavConsumos_Enabled!=0) ? localUtil.format( AV16Consumos, "ZZZZZZ9.9999") : localUtil.format( AV16Consumos, "ZZZZZZ9.9999"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavConsumos_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavConsumos_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_t_WC.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDevoluciones_Internalname, GXutil.ltrim( localUtil.ntoc( AV18Devoluciones, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavDevoluciones_Enabled!=0) ? localUtil.format( AV18Devoluciones, "ZZZZZZ9.9999") : localUtil.format( AV18Devoluciones, "ZZZZZZ9.9999"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDevoluciones_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDevoluciones_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_t_WC.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol101( ) ;
      }
      if ( wbEnd == 101 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_101 = (int)(nGXsfl_101_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV26GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV27GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV77Pgmname), GXutil.rtrim( localUtil.format( AV77Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_t_WC.htm");
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
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV17DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV17DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV12ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         wb_table2_132_1SQ2( true) ;
      }
      else
      {
         wb_table2_132_1SQ2( false) ;
      }
      return  ;
   }

   public void wb_table2_132_1SQ2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table3_137_1SQ2( true) ;
      }
      else
      {
         wb_table3_137_1SQ2( false) ;
      }
      return  ;
   }

   public void wb_table3_137_1SQ2e( boolean wbgen )
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
         app.GxWebStd.gx_div_start( httpContext, divDdo_ccstkfecauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 145,'" + sPrefix + "',false,'" + sGXsfl_101_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_ccstkfecauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_ccstkfecauxdate_Internalname, localUtil.format(AV71DDO_CCStkFecAuxDate, "99/99/99"), localUtil.format( AV71DDO_CCStkFecAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,145);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_ccstkfecauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_t_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_ccstkfecauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_t_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 101 )
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

   public void start1SQ2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( " UPQ_Cuenta CorrienteTRN", ""), (short)(0)) ;
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
            strup1SQ0( ) ;
         }
      }
   }

   public void ws1SQ2( )
   {
      start1SQ2( ) ;
      evt1SQ2( ) ;
   }

   public void evt1SQ2( )
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
                              strup1SQ0( ) ;
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
                              strup1SQ0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e121SQ2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1SQ0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e131SQ2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1SQ0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e141SQ2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1SQ0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e151SQ2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1SQ0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e161SQ2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1SQ0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e171SQ2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1SQ0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e181SQ2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1SQ0( ) ;
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
                              strup1SQ0( ) ;
                           }
                           nGXsfl_101_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_101_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_101_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_1012( ) ;
                           cmbavAccionesgrupo.setName( cmbavAccionesgrupo.getInternalname() );
                           cmbavAccionesgrupo.setValue( httpContext.cgiGet( cmbavAccionesgrupo.getInternalname()) );
                           AV7AccionesGrupo = (short)(GXutil.lval( httpContext.cgiGet( cmbavAccionesgrupo.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavAccionesgrupo.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7AccionesGrupo), 4, 0));
                           A3342CCStkLin = localUtil.ctol( httpContext.cgiGet( edtCCStkLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                           AV19DiaHora = httpContext.cgiGet( edtavDiahora_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDiahora_Internalname, AV19DiaHora);
                           A3345TipMovCc = httpContext.cgiGet( edtTipMovCc_Internalname) ;
                           A3357CCStkDsc = httpContext.cgiGet( edtCCStkDsc_Internalname) ;
                           if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCcstkcane_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCcstkcane_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCSTKCANE");
                              GX_FocusControl = edtavCcstkcane_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV8CCStkCanE = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkcane_Internalname, GXutil.ltrimstr( AV8CCStkCanE, 12, 4));
                           }
                           else
                           {
                              AV8CCStkCanE = localUtil.ctond( httpContext.cgiGet( edtavCcstkcane_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkcane_Internalname, GXutil.ltrimstr( AV8CCStkCanE, 12, 4));
                           }
                           if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCcstkcans_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCcstkcans_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCSTKCANS");
                              GX_FocusControl = edtavCcstkcans_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV9CCStkCanS = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkcans_Internalname, GXutil.ltrimstr( AV9CCStkCanS, 12, 4));
                           }
                           else
                           {
                              AV9CCStkCanS = localUtil.ctond( httpContext.cgiGet( edtavCcstkcans_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkcans_Internalname, GXutil.ltrimstr( AV9CCStkCanS, 12, 4));
                           }
                           A3349CCStkPre = localUtil.ctond( httpContext.cgiGet( edtCCStkPre_Internalname)) ;
                           if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavExis_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavExis_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vEXIS");
                              GX_FocusControl = edtavExis_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV23Exis = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavExis_Internalname, GXutil.ltrimstr( AV23Exis, 12, 4));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vEXIS"+"_"+sGXsfl_101_idx, getSecureSignedToken( sPrefix+sGXsfl_101_idx, localUtil.format( AV23Exis, "ZZZZZZ9.9999")));
                           }
                           else
                           {
                              AV23Exis = localUtil.ctond( httpContext.cgiGet( edtavExis_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavExis_Internalname, GXutil.ltrimstr( AV23Exis, 12, 4));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vEXIS"+"_"+sGXsfl_101_idx, getSecureSignedToken( sPrefix+sGXsfl_101_idx, localUtil.format( AV23Exis, "ZZZZZZ9.9999")));
                           }
                           A5722CCStkLot = httpContext.cgiGet( edtCCStkLot_Internalname) ;
                           AV30Hdr = httpContext.cgiGet( edtavHdr_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHdr_Internalname, AV30Hdr);
                           A3355CCStkUsu = GXutil.upper( httpContext.cgiGet( edtCCStkUsu_Internalname)) ;
                           A3350CCStkBar = (int)(localUtil.ctol( httpContext.cgiGet( edtCCStkBar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A3351CCStkReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtCCStkReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A3352CCStkPar = httpContext.cgiGet( edtCCStkPar_Internalname) ;
                           A3358CCStkLen = (short)(localUtil.ctol( httpContext.cgiGet( edtCCStkLen_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A3348CCStkFec = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtCCStkFec_Internalname), 0)) ;
                           A3356CCStkHor = httpContext.cgiGet( edtCCStkHor_Internalname) ;
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
                                       e191SQ2 ();
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
                                       e201SQ2 ();
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
                                       e211SQ2 ();
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
                                          if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV25FilterFullText) != 0 )
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
                                    strup1SQ0( ) ;
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
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we1SQ2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1SQ2( ) ;
         }
      }
   }

   public void pa1SQ2( )
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
      subsflControlProps_1012( ) ;
      while ( nGXsfl_101_idx <= nRC_GXsfl_101 )
      {
         sendrow_1012( ) ;
         nGXsfl_101_idx = ((subGrid_Islastpage==1)&&(nGXsfl_101_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_101_idx+1) ;
         sGXsfl_101_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_101_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1012( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV25FilterFullText ,
                                 String AV20Emprcod ,
                                 String AV43Prdnum ,
                                 java.util.Date AV10CCstkfecfrom ,
                                 java.util.Date AV11CCstkfecto ,
                                 byte AV34ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV12ColumnsSelector ,
                                 long AV48TFCCStkLin ,
                                 long AV49TFCCStkLin_To ,
                                 String AV56TFTipMovCc ,
                                 String AV57TFTipMovCc_Sel ,
                                 String AV46TFCCStkDsc ,
                                 String AV47TFCCStkDsc_Sel ,
                                 java.math.BigDecimal AV52TFCCStkPre ,
                                 java.math.BigDecimal AV53TFCCStkPre_To ,
                                 String AV50TFCCStkLot ,
                                 String AV51TFCCStkLot_Sel ,
                                 String AV54TFCCStkUsu ,
                                 String AV55TFCCStkUsu_Sel ,
                                 java.util.Date AV69TFCCStkFec ,
                                 String AV73TFCCStkHor ,
                                 String AV74TFCCStkHor_Sel ,
                                 String AV77Pgmname ,
                                 short AV36OrderedBy ,
                                 boolean AV38OrderedDsc ,
                                 java.math.BigDecimal AV15Compras ,
                                 java.math.BigDecimal AV16Consumos ,
                                 java.math.BigDecimal AV18Devoluciones ,
                                 java.math.BigDecimal AV44SaldoInicial ,
                                 java.math.BigDecimal AV24Existenciascuentacorriente ,
                                 java.math.BigDecimal AV41PrdExiAlm ,
                                 java.math.BigDecimal AV40PrdCanres ,
                                 String AV42PrdNom ,
                                 java.math.BigDecimal AV23Exis ,
                                 String AV62Actualizardatos ,
                                 boolean AV64PwdBo ,
                                 String A396EmprCod ,
                                 String A719PrdNum ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e201SQ2 ();
      GRID_nCurrentRecord = 0 ;
      rf1SQ2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"UPQ_CuentaCorriente_t_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV77Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("stocksquimicos\\upq_cuentacorriente_t_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vEXIS", getSecureSignedToken( sPrefix, localUtil.format( AV23Exis, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEXIS", GXutil.ltrim( localUtil.ntoc( AV23Exis, (byte)(12), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CCSTKLIN", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A3342CCStkLin), "ZZZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CCSTKLIN", GXutil.ltrim( localUtil.ntoc( A3342CCStkLin, (byte)(12), (byte)(0), ".", "")));
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
      AV62Actualizardatos = ((GXutil.strcmp(GXutil.rtrim( AV62Actualizardatos), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62Actualizardatos", AV62Actualizardatos);
      AV64PwdBo = GXutil.strtobool( GXutil.booltostr( AV64PwdBo)) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64PwdBo", AV64PwdBo);
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf1SQ2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV77Pgmname = "StocksQuimicos.UPQ_CuentaCorriente_t_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77Pgmname", AV77Pgmname);
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
      edtavDiahora_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiahora_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiahora_Enabled), 5, 0), !bGXsfl_101_Refreshing);
      edtavCcstkcane_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkcane_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkcane_Enabled), 5, 0), !bGXsfl_101_Refreshing);
      edtavCcstkcans_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkcans_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkcans_Enabled), 5, 0), !bGXsfl_101_Refreshing);
      edtavExis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavExis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavExis_Enabled), 5, 0), !bGXsfl_101_Refreshing);
      edtavHdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr_Enabled), 5, 0), !bGXsfl_101_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1SQ2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(101) ;
      /* Execute user event: Refresh */
      e201SQ2 ();
      nGXsfl_101_idx = 1 ;
      sGXsfl_101_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_101_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1012( ) ;
      bGXsfl_101_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
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
         subsflControlProps_1012( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV81Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext ,
                                              Long.valueOf(AV82Stocksquimicos_upq_cuentacorriente_t_wcds_2_tfccstklin) ,
                                              Long.valueOf(AV83Stocksquimicos_upq_cuentacorriente_t_wcds_3_tfccstklin_to) ,
                                              AV85Stocksquimicos_upq_cuentacorriente_t_wcds_5_tftipmovcc_sel ,
                                              AV84Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc ,
                                              AV87Stocksquimicos_upq_cuentacorriente_t_wcds_7_tfccstkdsc_sel ,
                                              AV86Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc ,
                                              AV88Stocksquimicos_upq_cuentacorriente_t_wcds_8_tfccstkpre ,
                                              AV89Stocksquimicos_upq_cuentacorriente_t_wcds_9_tfccstkpre_to ,
                                              AV91Stocksquimicos_upq_cuentacorriente_t_wcds_11_tfccstklot_sel ,
                                              AV90Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot ,
                                              AV93Stocksquimicos_upq_cuentacorriente_t_wcds_13_tfccstkusu_sel ,
                                              AV92Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu ,
                                              AV94Stocksquimicos_upq_cuentacorriente_t_wcds_14_tfccstkfec ,
                                              AV96Stocksquimicos_upq_cuentacorriente_t_wcds_16_tfccstkhor_sel ,
                                              AV95Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor ,
                                              AV10CCstkfecfrom ,
                                              AV11CCstkfecto ,
                                              Long.valueOf(A3342CCStkLin) ,
                                              A3345TipMovCc ,
                                              A3357CCStkDsc ,
                                              A3349CCStkPre ,
                                              A5722CCStkLot ,
                                              A3355CCStkUsu ,
                                              A3356CCStkHor ,
                                              A3348CCStkFec ,
                                              Short.valueOf(AV36OrderedBy) ,
                                              Boolean.valueOf(AV38OrderedDsc) ,
                                              AV20Emprcod ,
                                              AV43Prdnum ,
                                              A396EmprCod ,
                                              A719PrdNum } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV81Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext), "%", "") ;
         lV81Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext), "%", "") ;
         lV81Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext), "%", "") ;
         lV81Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext), "%", "") ;
         lV81Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext), "%", "") ;
         lV81Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext), "%", "") ;
         lV81Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext), "%", "") ;
         lV84Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc = GXutil.padr( GXutil.rtrim( AV84Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc), 2, "%") ;
         lV86Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc = GXutil.padr( GXutil.rtrim( AV86Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc), 30, "%") ;
         lV90Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot = GXutil.padr( GXutil.rtrim( AV90Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot), 26, "%") ;
         lV92Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu = GXutil.padr( GXutil.rtrim( AV92Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu), 8, "%") ;
         lV95Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor = GXutil.padr( GXutil.rtrim( AV95Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor), 8, "%") ;
         /* Using cursor H01SQ2 */
         pr_default.execute(0, new Object[] {AV20Emprcod, AV43Prdnum, lV81Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext, lV81Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext, lV81Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext, lV81Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext, lV81Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext, lV81Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext, lV81Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext, Long.valueOf(AV82Stocksquimicos_upq_cuentacorriente_t_wcds_2_tfccstklin), Long.valueOf(AV83Stocksquimicos_upq_cuentacorriente_t_wcds_3_tfccstklin_to), lV84Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc, AV85Stocksquimicos_upq_cuentacorriente_t_wcds_5_tftipmovcc_sel, lV86Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc, AV87Stocksquimicos_upq_cuentacorriente_t_wcds_7_tfccstkdsc_sel, AV88Stocksquimicos_upq_cuentacorriente_t_wcds_8_tfccstkpre, AV89Stocksquimicos_upq_cuentacorriente_t_wcds_9_tfccstkpre_to, lV90Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot, AV91Stocksquimicos_upq_cuentacorriente_t_wcds_11_tfccstklot_sel, lV92Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu, AV93Stocksquimicos_upq_cuentacorriente_t_wcds_13_tfccstkusu_sel, AV94Stocksquimicos_upq_cuentacorriente_t_wcds_14_tfccstkfec, lV95Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor, AV96Stocksquimicos_upq_cuentacorriente_t_wcds_16_tfccstkhor_sel, AV10CCstkfecfrom, AV11CCstkfecto, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_101_idx = 1 ;
         sGXsfl_101_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_101_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1012( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A3343CCStkCanE = H01SQ2_A3343CCStkCanE[0] ;
            A3344CCStkCanS = H01SQ2_A3344CCStkCanS[0] ;
            A396EmprCod = H01SQ2_A396EmprCod[0] ;
            A719PrdNum = H01SQ2_A719PrdNum[0] ;
            A3356CCStkHor = H01SQ2_A3356CCStkHor[0] ;
            A3348CCStkFec = H01SQ2_A3348CCStkFec[0] ;
            A3358CCStkLen = H01SQ2_A3358CCStkLen[0] ;
            A3352CCStkPar = H01SQ2_A3352CCStkPar[0] ;
            A3351CCStkReo = H01SQ2_A3351CCStkReo[0] ;
            A3350CCStkBar = H01SQ2_A3350CCStkBar[0] ;
            A3355CCStkUsu = H01SQ2_A3355CCStkUsu[0] ;
            A5722CCStkLot = H01SQ2_A5722CCStkLot[0] ;
            A3349CCStkPre = H01SQ2_A3349CCStkPre[0] ;
            A3357CCStkDsc = H01SQ2_A3357CCStkDsc[0] ;
            A3345TipMovCc = H01SQ2_A3345TipMovCc[0] ;
            A3342CCStkLin = H01SQ2_A3342CCStkLin[0] ;
            e211SQ2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(101) ;
         wb1SQ0( ) ;
      }
      bGXsfl_101_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1SQ2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vEXIS"+"_"+sGXsfl_101_idx, getSecureSignedToken( sPrefix+sGXsfl_101_idx, localUtil.format( AV23Exis, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PRDNUM", GXutil.rtrim( A719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_PRDNUM", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A719PrdNum, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CCSTKLIN"+"_"+sGXsfl_101_idx, getSecureSignedToken( sPrefix+sGXsfl_101_idx, localUtil.format( DecimalUtil.doubleToDec(A3342CCStkLin), "ZZZZZZZZZZZ9")));
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
      AV81Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = AV25FilterFullText ;
      AV82Stocksquimicos_upq_cuentacorriente_t_wcds_2_tfccstklin = AV48TFCCStkLin ;
      AV83Stocksquimicos_upq_cuentacorriente_t_wcds_3_tfccstklin_to = AV49TFCCStkLin_To ;
      AV84Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc = AV56TFTipMovCc ;
      AV85Stocksquimicos_upq_cuentacorriente_t_wcds_5_tftipmovcc_sel = AV57TFTipMovCc_Sel ;
      AV86Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc = AV46TFCCStkDsc ;
      AV87Stocksquimicos_upq_cuentacorriente_t_wcds_7_tfccstkdsc_sel = AV47TFCCStkDsc_Sel ;
      AV88Stocksquimicos_upq_cuentacorriente_t_wcds_8_tfccstkpre = AV52TFCCStkPre ;
      AV89Stocksquimicos_upq_cuentacorriente_t_wcds_9_tfccstkpre_to = AV53TFCCStkPre_To ;
      AV90Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot = AV50TFCCStkLot ;
      AV91Stocksquimicos_upq_cuentacorriente_t_wcds_11_tfccstklot_sel = AV51TFCCStkLot_Sel ;
      AV92Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu = AV54TFCCStkUsu ;
      AV93Stocksquimicos_upq_cuentacorriente_t_wcds_13_tfccstkusu_sel = AV55TFCCStkUsu_Sel ;
      AV94Stocksquimicos_upq_cuentacorriente_t_wcds_14_tfccstkfec = AV69TFCCStkFec ;
      AV95Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor = AV73TFCCStkHor ;
      AV96Stocksquimicos_upq_cuentacorriente_t_wcds_16_tfccstkhor_sel = AV74TFCCStkHor_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV81Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext ,
                                           Long.valueOf(AV82Stocksquimicos_upq_cuentacorriente_t_wcds_2_tfccstklin) ,
                                           Long.valueOf(AV83Stocksquimicos_upq_cuentacorriente_t_wcds_3_tfccstklin_to) ,
                                           AV85Stocksquimicos_upq_cuentacorriente_t_wcds_5_tftipmovcc_sel ,
                                           AV84Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc ,
                                           AV87Stocksquimicos_upq_cuentacorriente_t_wcds_7_tfccstkdsc_sel ,
                                           AV86Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc ,
                                           AV88Stocksquimicos_upq_cuentacorriente_t_wcds_8_tfccstkpre ,
                                           AV89Stocksquimicos_upq_cuentacorriente_t_wcds_9_tfccstkpre_to ,
                                           AV91Stocksquimicos_upq_cuentacorriente_t_wcds_11_tfccstklot_sel ,
                                           AV90Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot ,
                                           AV93Stocksquimicos_upq_cuentacorriente_t_wcds_13_tfccstkusu_sel ,
                                           AV92Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu ,
                                           AV94Stocksquimicos_upq_cuentacorriente_t_wcds_14_tfccstkfec ,
                                           AV96Stocksquimicos_upq_cuentacorriente_t_wcds_16_tfccstkhor_sel ,
                                           AV95Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor ,
                                           AV10CCstkfecfrom ,
                                           AV11CCstkfecto ,
                                           Long.valueOf(A3342CCStkLin) ,
                                           A3345TipMovCc ,
                                           A3357CCStkDsc ,
                                           A3349CCStkPre ,
                                           A5722CCStkLot ,
                                           A3355CCStkUsu ,
                                           A3356CCStkHor ,
                                           A3348CCStkFec ,
                                           Short.valueOf(AV36OrderedBy) ,
                                           Boolean.valueOf(AV38OrderedDsc) ,
                                           AV20Emprcod ,
                                           AV43Prdnum ,
                                           A396EmprCod ,
                                           A719PrdNum } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV81Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext), "%", "") ;
      lV81Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext), "%", "") ;
      lV81Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext), "%", "") ;
      lV81Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext), "%", "") ;
      lV81Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext), "%", "") ;
      lV81Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext), "%", "") ;
      lV81Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext), "%", "") ;
      lV84Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc = GXutil.padr( GXutil.rtrim( AV84Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc), 2, "%") ;
      lV86Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc = GXutil.padr( GXutil.rtrim( AV86Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc), 30, "%") ;
      lV90Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot = GXutil.padr( GXutil.rtrim( AV90Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot), 26, "%") ;
      lV92Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu = GXutil.padr( GXutil.rtrim( AV92Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu), 8, "%") ;
      lV95Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor = GXutil.padr( GXutil.rtrim( AV95Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor), 8, "%") ;
      /* Using cursor H01SQ3 */
      pr_default.execute(1, new Object[] {AV20Emprcod, AV43Prdnum, lV81Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext, lV81Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext, lV81Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext, lV81Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext, lV81Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext, lV81Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext, lV81Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext, Long.valueOf(AV82Stocksquimicos_upq_cuentacorriente_t_wcds_2_tfccstklin), Long.valueOf(AV83Stocksquimicos_upq_cuentacorriente_t_wcds_3_tfccstklin_to), lV84Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc, AV85Stocksquimicos_upq_cuentacorriente_t_wcds_5_tftipmovcc_sel, lV86Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc, AV87Stocksquimicos_upq_cuentacorriente_t_wcds_7_tfccstkdsc_sel, AV88Stocksquimicos_upq_cuentacorriente_t_wcds_8_tfccstkpre, AV89Stocksquimicos_upq_cuentacorriente_t_wcds_9_tfccstkpre_to, lV90Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot, AV91Stocksquimicos_upq_cuentacorriente_t_wcds_11_tfccstklot_sel, lV92Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu, AV93Stocksquimicos_upq_cuentacorriente_t_wcds_13_tfccstkusu_sel, AV94Stocksquimicos_upq_cuentacorriente_t_wcds_14_tfccstkfec, lV95Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor, AV96Stocksquimicos_upq_cuentacorriente_t_wcds_16_tfccstkhor_sel, AV10CCstkfecfrom, AV11CCstkfecto});
      GRID_nRecordCount = H01SQ3_AGRID_nRecordCount[0] ;
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
      AV81Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = AV25FilterFullText ;
      AV82Stocksquimicos_upq_cuentacorriente_t_wcds_2_tfccstklin = AV48TFCCStkLin ;
      AV83Stocksquimicos_upq_cuentacorriente_t_wcds_3_tfccstklin_to = AV49TFCCStkLin_To ;
      AV84Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc = AV56TFTipMovCc ;
      AV85Stocksquimicos_upq_cuentacorriente_t_wcds_5_tftipmovcc_sel = AV57TFTipMovCc_Sel ;
      AV86Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc = AV46TFCCStkDsc ;
      AV87Stocksquimicos_upq_cuentacorriente_t_wcds_7_tfccstkdsc_sel = AV47TFCCStkDsc_Sel ;
      AV88Stocksquimicos_upq_cuentacorriente_t_wcds_8_tfccstkpre = AV52TFCCStkPre ;
      AV89Stocksquimicos_upq_cuentacorriente_t_wcds_9_tfccstkpre_to = AV53TFCCStkPre_To ;
      AV90Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot = AV50TFCCStkLot ;
      AV91Stocksquimicos_upq_cuentacorriente_t_wcds_11_tfccstklot_sel = AV51TFCCStkLot_Sel ;
      AV92Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu = AV54TFCCStkUsu ;
      AV93Stocksquimicos_upq_cuentacorriente_t_wcds_13_tfccstkusu_sel = AV55TFCCStkUsu_Sel ;
      AV94Stocksquimicos_upq_cuentacorriente_t_wcds_14_tfccstkfec = AV69TFCCStkFec ;
      AV95Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor = AV73TFCCStkHor ;
      AV96Stocksquimicos_upq_cuentacorriente_t_wcds_16_tfccstkhor_sel = AV74TFCCStkHor_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV25FilterFullText, AV20Emprcod, AV43Prdnum, AV10CCstkfecfrom, AV11CCstkfecto, AV34ManageFiltersExecutionStep, AV12ColumnsSelector, AV48TFCCStkLin, AV49TFCCStkLin_To, AV56TFTipMovCc, AV57TFTipMovCc_Sel, AV46TFCCStkDsc, AV47TFCCStkDsc_Sel, AV52TFCCStkPre, AV53TFCCStkPre_To, AV50TFCCStkLot, AV51TFCCStkLot_Sel, AV54TFCCStkUsu, AV55TFCCStkUsu_Sel, AV69TFCCStkFec, AV73TFCCStkHor, AV74TFCCStkHor_Sel, AV77Pgmname, AV36OrderedBy, AV38OrderedDsc, AV15Compras, AV16Consumos, AV18Devoluciones, AV44SaldoInicial, AV24Existenciascuentacorriente, AV41PrdExiAlm, AV40PrdCanres, AV42PrdNom, AV23Exis, AV62Actualizardatos, AV64PwdBo, A396EmprCod, A719PrdNum, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV81Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = AV25FilterFullText ;
      AV82Stocksquimicos_upq_cuentacorriente_t_wcds_2_tfccstklin = AV48TFCCStkLin ;
      AV83Stocksquimicos_upq_cuentacorriente_t_wcds_3_tfccstklin_to = AV49TFCCStkLin_To ;
      AV84Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc = AV56TFTipMovCc ;
      AV85Stocksquimicos_upq_cuentacorriente_t_wcds_5_tftipmovcc_sel = AV57TFTipMovCc_Sel ;
      AV86Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc = AV46TFCCStkDsc ;
      AV87Stocksquimicos_upq_cuentacorriente_t_wcds_7_tfccstkdsc_sel = AV47TFCCStkDsc_Sel ;
      AV88Stocksquimicos_upq_cuentacorriente_t_wcds_8_tfccstkpre = AV52TFCCStkPre ;
      AV89Stocksquimicos_upq_cuentacorriente_t_wcds_9_tfccstkpre_to = AV53TFCCStkPre_To ;
      AV90Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot = AV50TFCCStkLot ;
      AV91Stocksquimicos_upq_cuentacorriente_t_wcds_11_tfccstklot_sel = AV51TFCCStkLot_Sel ;
      AV92Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu = AV54TFCCStkUsu ;
      AV93Stocksquimicos_upq_cuentacorriente_t_wcds_13_tfccstkusu_sel = AV55TFCCStkUsu_Sel ;
      AV94Stocksquimicos_upq_cuentacorriente_t_wcds_14_tfccstkfec = AV69TFCCStkFec ;
      AV95Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor = AV73TFCCStkHor ;
      AV96Stocksquimicos_upq_cuentacorriente_t_wcds_16_tfccstkhor_sel = AV74TFCCStkHor_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV25FilterFullText, AV20Emprcod, AV43Prdnum, AV10CCstkfecfrom, AV11CCstkfecto, AV34ManageFiltersExecutionStep, AV12ColumnsSelector, AV48TFCCStkLin, AV49TFCCStkLin_To, AV56TFTipMovCc, AV57TFTipMovCc_Sel, AV46TFCCStkDsc, AV47TFCCStkDsc_Sel, AV52TFCCStkPre, AV53TFCCStkPre_To, AV50TFCCStkLot, AV51TFCCStkLot_Sel, AV54TFCCStkUsu, AV55TFCCStkUsu_Sel, AV69TFCCStkFec, AV73TFCCStkHor, AV74TFCCStkHor_Sel, AV77Pgmname, AV36OrderedBy, AV38OrderedDsc, AV15Compras, AV16Consumos, AV18Devoluciones, AV44SaldoInicial, AV24Existenciascuentacorriente, AV41PrdExiAlm, AV40PrdCanres, AV42PrdNom, AV23Exis, AV62Actualizardatos, AV64PwdBo, A396EmprCod, A719PrdNum, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV81Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = AV25FilterFullText ;
      AV82Stocksquimicos_upq_cuentacorriente_t_wcds_2_tfccstklin = AV48TFCCStkLin ;
      AV83Stocksquimicos_upq_cuentacorriente_t_wcds_3_tfccstklin_to = AV49TFCCStkLin_To ;
      AV84Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc = AV56TFTipMovCc ;
      AV85Stocksquimicos_upq_cuentacorriente_t_wcds_5_tftipmovcc_sel = AV57TFTipMovCc_Sel ;
      AV86Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc = AV46TFCCStkDsc ;
      AV87Stocksquimicos_upq_cuentacorriente_t_wcds_7_tfccstkdsc_sel = AV47TFCCStkDsc_Sel ;
      AV88Stocksquimicos_upq_cuentacorriente_t_wcds_8_tfccstkpre = AV52TFCCStkPre ;
      AV89Stocksquimicos_upq_cuentacorriente_t_wcds_9_tfccstkpre_to = AV53TFCCStkPre_To ;
      AV90Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot = AV50TFCCStkLot ;
      AV91Stocksquimicos_upq_cuentacorriente_t_wcds_11_tfccstklot_sel = AV51TFCCStkLot_Sel ;
      AV92Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu = AV54TFCCStkUsu ;
      AV93Stocksquimicos_upq_cuentacorriente_t_wcds_13_tfccstkusu_sel = AV55TFCCStkUsu_Sel ;
      AV94Stocksquimicos_upq_cuentacorriente_t_wcds_14_tfccstkfec = AV69TFCCStkFec ;
      AV95Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor = AV73TFCCStkHor ;
      AV96Stocksquimicos_upq_cuentacorriente_t_wcds_16_tfccstkhor_sel = AV74TFCCStkHor_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV25FilterFullText, AV20Emprcod, AV43Prdnum, AV10CCstkfecfrom, AV11CCstkfecto, AV34ManageFiltersExecutionStep, AV12ColumnsSelector, AV48TFCCStkLin, AV49TFCCStkLin_To, AV56TFTipMovCc, AV57TFTipMovCc_Sel, AV46TFCCStkDsc, AV47TFCCStkDsc_Sel, AV52TFCCStkPre, AV53TFCCStkPre_To, AV50TFCCStkLot, AV51TFCCStkLot_Sel, AV54TFCCStkUsu, AV55TFCCStkUsu_Sel, AV69TFCCStkFec, AV73TFCCStkHor, AV74TFCCStkHor_Sel, AV77Pgmname, AV36OrderedBy, AV38OrderedDsc, AV15Compras, AV16Consumos, AV18Devoluciones, AV44SaldoInicial, AV24Existenciascuentacorriente, AV41PrdExiAlm, AV40PrdCanres, AV42PrdNom, AV23Exis, AV62Actualizardatos, AV64PwdBo, A396EmprCod, A719PrdNum, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV81Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = AV25FilterFullText ;
      AV82Stocksquimicos_upq_cuentacorriente_t_wcds_2_tfccstklin = AV48TFCCStkLin ;
      AV83Stocksquimicos_upq_cuentacorriente_t_wcds_3_tfccstklin_to = AV49TFCCStkLin_To ;
      AV84Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc = AV56TFTipMovCc ;
      AV85Stocksquimicos_upq_cuentacorriente_t_wcds_5_tftipmovcc_sel = AV57TFTipMovCc_Sel ;
      AV86Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc = AV46TFCCStkDsc ;
      AV87Stocksquimicos_upq_cuentacorriente_t_wcds_7_tfccstkdsc_sel = AV47TFCCStkDsc_Sel ;
      AV88Stocksquimicos_upq_cuentacorriente_t_wcds_8_tfccstkpre = AV52TFCCStkPre ;
      AV89Stocksquimicos_upq_cuentacorriente_t_wcds_9_tfccstkpre_to = AV53TFCCStkPre_To ;
      AV90Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot = AV50TFCCStkLot ;
      AV91Stocksquimicos_upq_cuentacorriente_t_wcds_11_tfccstklot_sel = AV51TFCCStkLot_Sel ;
      AV92Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu = AV54TFCCStkUsu ;
      AV93Stocksquimicos_upq_cuentacorriente_t_wcds_13_tfccstkusu_sel = AV55TFCCStkUsu_Sel ;
      AV94Stocksquimicos_upq_cuentacorriente_t_wcds_14_tfccstkfec = AV69TFCCStkFec ;
      AV95Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor = AV73TFCCStkHor ;
      AV96Stocksquimicos_upq_cuentacorriente_t_wcds_16_tfccstkhor_sel = AV74TFCCStkHor_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV25FilterFullText, AV20Emprcod, AV43Prdnum, AV10CCstkfecfrom, AV11CCstkfecto, AV34ManageFiltersExecutionStep, AV12ColumnsSelector, AV48TFCCStkLin, AV49TFCCStkLin_To, AV56TFTipMovCc, AV57TFTipMovCc_Sel, AV46TFCCStkDsc, AV47TFCCStkDsc_Sel, AV52TFCCStkPre, AV53TFCCStkPre_To, AV50TFCCStkLot, AV51TFCCStkLot_Sel, AV54TFCCStkUsu, AV55TFCCStkUsu_Sel, AV69TFCCStkFec, AV73TFCCStkHor, AV74TFCCStkHor_Sel, AV77Pgmname, AV36OrderedBy, AV38OrderedDsc, AV15Compras, AV16Consumos, AV18Devoluciones, AV44SaldoInicial, AV24Existenciascuentacorriente, AV41PrdExiAlm, AV40PrdCanres, AV42PrdNom, AV23Exis, AV62Actualizardatos, AV64PwdBo, A396EmprCod, A719PrdNum, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV81Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = AV25FilterFullText ;
      AV82Stocksquimicos_upq_cuentacorriente_t_wcds_2_tfccstklin = AV48TFCCStkLin ;
      AV83Stocksquimicos_upq_cuentacorriente_t_wcds_3_tfccstklin_to = AV49TFCCStkLin_To ;
      AV84Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc = AV56TFTipMovCc ;
      AV85Stocksquimicos_upq_cuentacorriente_t_wcds_5_tftipmovcc_sel = AV57TFTipMovCc_Sel ;
      AV86Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc = AV46TFCCStkDsc ;
      AV87Stocksquimicos_upq_cuentacorriente_t_wcds_7_tfccstkdsc_sel = AV47TFCCStkDsc_Sel ;
      AV88Stocksquimicos_upq_cuentacorriente_t_wcds_8_tfccstkpre = AV52TFCCStkPre ;
      AV89Stocksquimicos_upq_cuentacorriente_t_wcds_9_tfccstkpre_to = AV53TFCCStkPre_To ;
      AV90Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot = AV50TFCCStkLot ;
      AV91Stocksquimicos_upq_cuentacorriente_t_wcds_11_tfccstklot_sel = AV51TFCCStkLot_Sel ;
      AV92Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu = AV54TFCCStkUsu ;
      AV93Stocksquimicos_upq_cuentacorriente_t_wcds_13_tfccstkusu_sel = AV55TFCCStkUsu_Sel ;
      AV94Stocksquimicos_upq_cuentacorriente_t_wcds_14_tfccstkfec = AV69TFCCStkFec ;
      AV95Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor = AV73TFCCStkHor ;
      AV96Stocksquimicos_upq_cuentacorriente_t_wcds_16_tfccstkhor_sel = AV74TFCCStkHor_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV25FilterFullText, AV20Emprcod, AV43Prdnum, AV10CCstkfecfrom, AV11CCstkfecto, AV34ManageFiltersExecutionStep, AV12ColumnsSelector, AV48TFCCStkLin, AV49TFCCStkLin_To, AV56TFTipMovCc, AV57TFTipMovCc_Sel, AV46TFCCStkDsc, AV47TFCCStkDsc_Sel, AV52TFCCStkPre, AV53TFCCStkPre_To, AV50TFCCStkLot, AV51TFCCStkLot_Sel, AV54TFCCStkUsu, AV55TFCCStkUsu_Sel, AV69TFCCStkFec, AV73TFCCStkHor, AV74TFCCStkHor_Sel, AV77Pgmname, AV36OrderedBy, AV38OrderedDsc, AV15Compras, AV16Consumos, AV18Devoluciones, AV44SaldoInicial, AV24Existenciascuentacorriente, AV41PrdExiAlm, AV40PrdCanres, AV42PrdNom, AV23Exis, AV62Actualizardatos, AV64PwdBo, A396EmprCod, A719PrdNum, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV77Pgmname = "StocksQuimicos.UPQ_CuentaCorriente_t_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77Pgmname", AV77Pgmname);
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
      edtavDiahora_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiahora_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiahora_Enabled), 5, 0), !bGXsfl_101_Refreshing);
      edtavCcstkcane_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkcane_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkcane_Enabled), 5, 0), !bGXsfl_101_Refreshing);
      edtavCcstkcans_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkcans_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkcans_Enabled), 5, 0), !bGXsfl_101_Refreshing);
      edtavExis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavExis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavExis_Enabled), 5, 0), !bGXsfl_101_Refreshing);
      edtavHdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr_Enabled), 5, 0), !bGXsfl_101_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1SQ0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e191SQ2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV33ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV17DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV12ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_101 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_101"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV26GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV27GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV20Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV20Emprcod") ;
         wcpOAV43Prdnum = httpContext.cgiGet( sPrefix+"wcpOAV43Prdnum") ;
         wcpOAV10CCstkfecfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV10CCstkfecfrom"), 0) ;
         wcpOAV11CCstkfecto = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV11CCstkfecto"), 0) ;
         wcpOAV15Compras = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV15Compras")) ;
         wcpOAV16Consumos = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV16Consumos")) ;
         wcpOAV18Devoluciones = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV18Devoluciones")) ;
         wcpOAV44SaldoInicial = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV44SaldoInicial")) ;
         wcpOAV24Existenciascuentacorriente = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV24Existenciascuentacorriente")) ;
         wcpOAV41PrdExiAlm = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV41PrdExiAlm")) ;
         wcpOAV40PrdCanres = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV40PrdCanres")) ;
         wcpOAV42PrdNom = httpContext.cgiGet( sPrefix+"wcpOAV42PrdNom") ;
         AV97Emprcod_selected = httpContext.cgiGet( sPrefix+"vEMPRCOD_SELECTED") ;
         A396EmprCod = httpContext.cgiGet( sPrefix+"EMPRCOD") ;
         AV98Prdnum_selected = httpContext.cgiGet( sPrefix+"vPRDNUM_SELECTED") ;
         A719PrdNum = httpContext.cgiGet( sPrefix+"PRDNUM") ;
         AV99Ccstklin_selected = localUtil.ctol( httpContext.cgiGet( sPrefix+"vCCSTKLIN_SELECTED"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         Ddo_grid_Datalistproc = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalistproc") ;
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
         AV25FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25FilterFullText", AV25FilterFullText);
         AV5SaldoInicialaFecha = httpContext.cgiGet( edtavSaldoinicialafecha_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5SaldoInicialaFecha", AV5SaldoInicialaFecha);
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavExistenciasdif_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavExistenciasdif_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vEXISTENCIASDIF");
            GX_FocusControl = edtavExistenciasdif_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV63ExistenciasDif = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63ExistenciasDif", GXutil.ltrimstr( AV63ExistenciasDif, 12, 4));
         }
         else
         {
            AV63ExistenciasDif = localUtil.ctond( httpContext.cgiGet( edtavExistenciasdif_Internalname)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63ExistenciasDif", GXutil.ltrimstr( AV63ExistenciasDif, 12, 4));
         }
         AV62Actualizardatos = ((GXutil.strcmp(httpContext.cgiGet( chkavActualizardatos.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62Actualizardatos", AV62Actualizardatos);
         AV64PwdBo = GXutil.strtobool( httpContext.cgiGet( chkavPwdbo.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64PwdBo", AV64PwdBo);
         AV77Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77Pgmname", AV77Pgmname);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_ccstkfecauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_CCSTKFECAUXDATE");
            GX_FocusControl = edtavDdo_ccstkfecauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV71DDO_CCStkFecAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71DDO_CCStkFecAuxDate", localUtil.format(AV71DDO_CCStkFecAuxDate, "99/99/99"));
         }
         else
         {
            AV71DDO_CCStkFecAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_ccstkfecauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71DDO_CCStkFecAuxDate", localUtil.format(AV71DDO_CCStkFecAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         nGXsfl_101_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_101_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_101_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1012( ) ;
         if ( nGXsfl_101_idx > 0 )
         {
            cmbavAccionesgrupo.setName( cmbavAccionesgrupo.getInternalname() );
            cmbavAccionesgrupo.setValue( httpContext.cgiGet( cmbavAccionesgrupo.getInternalname()) );
            AV7AccionesGrupo = (short)(GXutil.lval( httpContext.cgiGet( cmbavAccionesgrupo.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavAccionesgrupo.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7AccionesGrupo), 4, 0));
            A3342CCStkLin = localUtil.ctol( httpContext.cgiGet( edtCCStkLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            AV19DiaHora = httpContext.cgiGet( edtavDiahora_Internalname) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDiahora_Internalname, AV19DiaHora);
            A3345TipMovCc = httpContext.cgiGet( edtTipMovCc_Internalname) ;
            A3357CCStkDsc = httpContext.cgiGet( edtCCStkDsc_Internalname) ;
            if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCcstkcane_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCcstkcane_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCSTKCANE");
               GX_FocusControl = edtavCcstkcane_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV8CCStkCanE = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkcane_Internalname, GXutil.ltrimstr( AV8CCStkCanE, 12, 4));
            }
            else
            {
               AV8CCStkCanE = localUtil.ctond( httpContext.cgiGet( edtavCcstkcane_Internalname)) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkcane_Internalname, GXutil.ltrimstr( AV8CCStkCanE, 12, 4));
            }
            if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCcstkcans_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCcstkcans_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCSTKCANS");
               GX_FocusControl = edtavCcstkcans_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV9CCStkCanS = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkcans_Internalname, GXutil.ltrimstr( AV9CCStkCanS, 12, 4));
            }
            else
            {
               AV9CCStkCanS = localUtil.ctond( httpContext.cgiGet( edtavCcstkcans_Internalname)) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkcans_Internalname, GXutil.ltrimstr( AV9CCStkCanS, 12, 4));
            }
            A3349CCStkPre = localUtil.ctond( httpContext.cgiGet( edtCCStkPre_Internalname)) ;
            if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavExis_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavExis_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vEXIS");
               GX_FocusControl = edtavExis_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV23Exis = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavExis_Internalname, GXutil.ltrimstr( AV23Exis, 12, 4));
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vEXIS"+"_"+sGXsfl_101_idx, getSecureSignedToken( sPrefix+sGXsfl_101_idx, localUtil.format( AV23Exis, "ZZZZZZ9.9999")));
            }
            else
            {
               AV23Exis = localUtil.ctond( httpContext.cgiGet( edtavExis_Internalname)) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavExis_Internalname, GXutil.ltrimstr( AV23Exis, 12, 4));
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vEXIS"+"_"+sGXsfl_101_idx, getSecureSignedToken( sPrefix+sGXsfl_101_idx, localUtil.format( AV23Exis, "ZZZZZZ9.9999")));
            }
            A5722CCStkLot = httpContext.cgiGet( edtCCStkLot_Internalname) ;
            AV30Hdr = httpContext.cgiGet( edtavHdr_Internalname) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHdr_Internalname, AV30Hdr);
            A3355CCStkUsu = GXutil.upper( httpContext.cgiGet( edtCCStkUsu_Internalname)) ;
            A3350CCStkBar = (int)(localUtil.ctol( httpContext.cgiGet( edtCCStkBar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A3351CCStkReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtCCStkReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A3352CCStkPar = httpContext.cgiGet( edtCCStkPar_Internalname) ;
            A3358CCStkLen = (short)(localUtil.ctol( httpContext.cgiGet( edtCCStkLen_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A3348CCStkFec = localUtil.ctod( httpContext.cgiGet( edtCCStkFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            A3356CCStkHor = httpContext.cgiGet( edtCCStkHor_Internalname) ;
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"UPQ_CuentaCorriente_t_WC");
         AV77Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77Pgmname", AV77Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV77Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("stocksquimicos\\upq_cuentacorriente_t_wc:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV25FilterFullText) != 0 )
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
      e191SQ2 ();
      if (returnInSub) return;
   }

   public void e191SQ2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV5SaldoInicialaFecha = httpContext.getMessage( "Saldo Inicial < ", "") + GXutil.trim( localUtil.dtoc( AV10CCstkfecfrom, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + " = " + GXutil.trim( GXutil.str( AV44SaldoInicial, 12, 4)) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5SaldoInicialaFecha", AV5SaldoInicialaFecha);
      AV63ExistenciasDif = AV24Existenciascuentacorriente.subtract(AV41PrdExiAlm) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63ExistenciasDif", GXutil.ltrimstr( AV63ExistenciasDif, 12, 4));
      AV62Actualizardatos = "N" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62Actualizardatos", AV62Actualizardatos);
      AV6WebSession.remove("ValidarWebWPwdGrl");
      GXt_int1 = AV65Password ;
      GXv_char2[0] = AV20Emprcod ;
      GXv_char3[0] = "PSWAUD" ;
      GXv_int4[0] = GXt_int1 ;
      new app.prepkil(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_int4) ;
      upq_cuentacorriente_t_wc_impl.this.AV20Emprcod = GXv_char2[0] ;
      upq_cuentacorriente_t_wc_impl.this.GXt_int1 = GXv_int4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20Emprcod", AV20Emprcod);
      AV65Password = (short)(GXt_int1) ;
      AV64PwdBo = false ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64PwdBo", AV64PwdBo);
      GXt_int5 = (byte)(AV66Cotexsur) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV20Emprcod, httpContext.getMessage( "COTEXS", ""), GXv_int6) ;
      upq_cuentacorriente_t_wc_impl.this.GXt_int5 = GXv_int6[0] ;
      AV66Cotexsur = GXt_int5 ;
      AV67Siacumular = ((AV66Cotexsur==0) ? "N" : "S") ;
      GXt_int5 = (byte)(AV68EntSalInv) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV20Emprcod, httpContext.getMessage( "ENSAIV", ""), GXv_int6) ;
      upq_cuentacorriente_t_wc_impl.this.GXt_int5 = GXv_int6[0] ;
      AV68EntSalInv = GXt_int5 ;
      AV23Exis = AV44SaldoInicial ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavExis_Internalname, GXutil.ltrimstr( AV23Exis, 12, 4));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vEXIS"+"_"+sGXsfl_101_idx, getSecureSignedToken( sPrefix+sGXsfl_101_idx, localUtil.format( AV23Exis, "ZZZZZZ9.9999")));
      GXt_char7 = AV78Station ;
      GXv_char3[0] = GXt_char7 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char3) ;
      upq_cuentacorriente_t_wc_impl.this.GXt_char7 = GXv_char3[0] ;
      AV78Station = GXt_char7 ;
      GXv_char3[0] = AV20Emprcod ;
      GXv_char2[0] = AV79Emprnom ;
      GXv_char8[0] = AV80Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV78Station, GXv_char3, GXv_char2, GXv_char8) ;
      upq_cuentacorriente_t_wc_impl.this.AV20Emprcod = GXv_char3[0] ;
      upq_cuentacorriente_t_wc_impl.this.AV79Emprnom = GXv_char2[0] ;
      upq_cuentacorriente_t_wc_impl.this.AV80Usurcod = GXv_char8[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20Emprcod", AV20Emprcod);
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
      if ( AV36OrderedBy < 1 )
      {
         AV36OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = AV17DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10[0] ;
      AV17DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e201SQ2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext11[0] = AV61WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext11) ;
      AV61WWPContext = GXv_SdtWWPContext11[0] ;
      if ( AV34ManageFiltersExecutionStep == 1 )
      {
         AV34ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34ManageFiltersExecutionStep", GXutil.str( AV34ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV34ManageFiltersExecutionStep == 2 )
      {
         AV34ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34ManageFiltersExecutionStep", GXutil.str( AV34ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV45Session.getValue("StocksQuimicos.UPQ_CuentaCorriente_t_WCColumnsSelector"), "") != 0 )
      {
         AV14ColumnsSelectorXML = AV45Session.getValue("StocksQuimicos.UPQ_CuentaCorriente_t_WCColumnsSelector") ;
         AV12ColumnsSelector.fromxml(AV14ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtCCStkLin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV12ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCCStkLin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCStkLin_Visible), 5, 0), !bGXsfl_101_Refreshing);
      edtavDiahora_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV12ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiahora_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiahora_Visible), 5, 0), !bGXsfl_101_Refreshing);
      edtTipMovCc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV12ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtTipMovCc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipMovCc_Visible), 5, 0), !bGXsfl_101_Refreshing);
      edtCCStkDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV12ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCCStkDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCStkDsc_Visible), 5, 0), !bGXsfl_101_Refreshing);
      edtavCcstkcane_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV12ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkcane_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkcane_Visible), 5, 0), !bGXsfl_101_Refreshing);
      edtavCcstkcans_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV12ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkcans_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkcans_Visible), 5, 0), !bGXsfl_101_Refreshing);
      edtCCStkPre_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV12ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCCStkPre_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCStkPre_Visible), 5, 0), !bGXsfl_101_Refreshing);
      edtavExis_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV12ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavExis_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavExis_Visible), 5, 0), !bGXsfl_101_Refreshing);
      edtCCStkLot_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV12ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCCStkLot_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCStkLot_Visible), 5, 0), !bGXsfl_101_Refreshing);
      edtavHdr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV12ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHdr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr_Visible), 5, 0), !bGXsfl_101_Refreshing);
      edtCCStkUsu_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV12ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCCStkUsu_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCStkUsu_Visible), 5, 0), !bGXsfl_101_Refreshing);
      edtCCStkFec_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV12ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCCStkFec_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCStkFec_Visible), 5, 0), !bGXsfl_101_Refreshing);
      edtCCStkHor_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV12ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCCStkHor_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCStkHor_Visible), 5, 0), !bGXsfl_101_Refreshing);
      AV26GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26GridCurrentPage), 10, 0));
      AV27GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27GridPageCount), 10, 0));
      cmbavAccionesgrupo.setColumnHeaderClass( "WWActionGroupColumn" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavAccionesgrupo.getInternalname(), "Columnheaderclass", cmbavAccionesgrupo.getColumnHeaderClass(), !bGXsfl_101_Refreshing);
      edtCCStkLin_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCCStkLin_Internalname, "Columnheaderclass", edtCCStkLin_Columnheaderclass, !bGXsfl_101_Refreshing);
      edtavDiahora_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiahora_Internalname, "Columnheaderclass", edtavDiahora_Columnheaderclass, !bGXsfl_101_Refreshing);
      edtTipMovCc_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtTipMovCc_Internalname, "Columnheaderclass", edtTipMovCc_Columnheaderclass, !bGXsfl_101_Refreshing);
      edtCCStkDsc_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCCStkDsc_Internalname, "Columnheaderclass", edtCCStkDsc_Columnheaderclass, !bGXsfl_101_Refreshing);
      edtavCcstkcane_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkcane_Internalname, "Columnheaderclass", edtavCcstkcane_Columnheaderclass, !bGXsfl_101_Refreshing);
      edtavCcstkcans_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkcans_Internalname, "Columnheaderclass", edtavCcstkcans_Columnheaderclass, !bGXsfl_101_Refreshing);
      edtCCStkPre_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCCStkPre_Internalname, "Columnheaderclass", edtCCStkPre_Columnheaderclass, !bGXsfl_101_Refreshing);
      edtavExis_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavExis_Internalname, "Columnheaderclass", edtavExis_Columnheaderclass, !bGXsfl_101_Refreshing);
      edtCCStkLot_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCCStkLot_Internalname, "Columnheaderclass", edtCCStkLot_Columnheaderclass, !bGXsfl_101_Refreshing);
      edtavHdr_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHdr_Internalname, "Columnheaderclass", edtavHdr_Columnheaderclass, !bGXsfl_101_Refreshing);
      edtCCStkUsu_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCCStkUsu_Internalname, "Columnheaderclass", edtCCStkUsu_Columnheaderclass, !bGXsfl_101_Refreshing);
      edtCCStkFec_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCCStkFec_Internalname, "Columnheaderclass", edtCCStkFec_Columnheaderclass, !bGXsfl_101_Refreshing);
      edtCCStkHor_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCCStkHor_Internalname, "Columnheaderclass", edtCCStkHor_Columnheaderclass, !bGXsfl_101_Refreshing);
      AV81Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = AV25FilterFullText ;
      AV82Stocksquimicos_upq_cuentacorriente_t_wcds_2_tfccstklin = AV48TFCCStkLin ;
      AV83Stocksquimicos_upq_cuentacorriente_t_wcds_3_tfccstklin_to = AV49TFCCStkLin_To ;
      AV84Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc = AV56TFTipMovCc ;
      AV85Stocksquimicos_upq_cuentacorriente_t_wcds_5_tftipmovcc_sel = AV57TFTipMovCc_Sel ;
      AV86Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc = AV46TFCCStkDsc ;
      AV87Stocksquimicos_upq_cuentacorriente_t_wcds_7_tfccstkdsc_sel = AV47TFCCStkDsc_Sel ;
      AV88Stocksquimicos_upq_cuentacorriente_t_wcds_8_tfccstkpre = AV52TFCCStkPre ;
      AV89Stocksquimicos_upq_cuentacorriente_t_wcds_9_tfccstkpre_to = AV53TFCCStkPre_To ;
      AV90Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot = AV50TFCCStkLot ;
      AV91Stocksquimicos_upq_cuentacorriente_t_wcds_11_tfccstklot_sel = AV51TFCCStkLot_Sel ;
      AV92Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu = AV54TFCCStkUsu ;
      AV93Stocksquimicos_upq_cuentacorriente_t_wcds_13_tfccstkusu_sel = AV55TFCCStkUsu_Sel ;
      AV94Stocksquimicos_upq_cuentacorriente_t_wcds_14_tfccstkfec = AV69TFCCStkFec ;
      AV95Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor = AV73TFCCStkHor ;
      AV96Stocksquimicos_upq_cuentacorriente_t_wcds_16_tfccstkhor_sel = AV74TFCCStkHor_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV12ColumnsSelector", AV12ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV33ManageFiltersData", AV33ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV28GridState", AV28GridState);
   }

   public void e131SQ2( )
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
         AV39PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV39PageToGo) ;
      }
   }

   public void e141SQ2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e151SQ2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV36OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36OrderedBy), 4, 0));
         AV38OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38OrderedDsc", AV38OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CCStkLin") == 0 )
         {
            AV48TFCCStkLin = GXutil.lval( Ddo_grid_Filteredtext_get) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFCCStkLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFCCStkLin), 12, 0));
            AV49TFCCStkLin_To = GXutil.lval( Ddo_grid_Filteredtextto_get) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFCCStkLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFCCStkLin_To), 12, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "TipMovCc") == 0 )
         {
            AV56TFTipMovCc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFTipMovCc", AV56TFTipMovCc);
            AV57TFTipMovCc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFTipMovCc_Sel", AV57TFTipMovCc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CCStkDsc") == 0 )
         {
            AV46TFCCStkDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFCCStkDsc", AV46TFCCStkDsc);
            AV47TFCCStkDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFCCStkDsc_Sel", AV47TFCCStkDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CCStkPre") == 0 )
         {
            AV52TFCCStkPre = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFCCStkPre", GXutil.ltrimstr( AV52TFCCStkPre, 14, 5));
            AV53TFCCStkPre_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFCCStkPre_To", GXutil.ltrimstr( AV53TFCCStkPre_To, 14, 5));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CCStkLot") == 0 )
         {
            AV50TFCCStkLot = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFCCStkLot", AV50TFCCStkLot);
            AV51TFCCStkLot_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFCCStkLot_Sel", AV51TFCCStkLot_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CCStkUsu") == 0 )
         {
            AV54TFCCStkUsu = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFCCStkUsu", AV54TFCCStkUsu);
            AV55TFCCStkUsu_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFCCStkUsu_Sel", AV55TFCCStkUsu_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CCStkFec") == 0 )
         {
            AV69TFCCStkFec = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69TFCCStkFec", localUtil.format(AV69TFCCStkFec, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CCStkHor") == 0 )
         {
            AV73TFCCStkHor = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73TFCCStkHor", AV73TFCCStkHor);
            AV74TFCCStkHor_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74TFCCStkHor_Sel", AV74TFCCStkHor_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e211SQ2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavAccionesgrupo.removeAllItems();
      cmbavAccionesgrupo.addItem("0", ";fa fa-bars", (short)(0));
      cmbavAccionesgrupo.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "Eliminar Linea", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      cmbavAccionesgrupo.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "Modificar Lote", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      AV19DiaHora = localUtil.dtoc( A3348CCStkFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + " " + A3356CCStkHor ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDiahora_Internalname, AV19DiaHora);
      AV8CCStkCanE = ((GXutil.strcmp(A3345TipMovCc, "SR")==0) ? DecimalUtil.doubleToDec(0) : A3343CCStkCanE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkcane_Internalname, GXutil.ltrimstr( AV8CCStkCanE, 12, 4));
      AV9CCStkCanS = ((GXutil.strcmp(A3345TipMovCc, "SR")==0) ? DecimalUtil.doubleToDec(0) : A3344CCStkCanS) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkcans_Internalname, GXutil.ltrimstr( AV9CCStkCanS, 12, 4));
      AV23Exis = AV23Exis.add((A3343CCStkCanE.subtract(A3344CCStkCanS))) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavExis_Internalname, GXutil.ltrimstr( AV23Exis, 12, 4));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vEXIS"+"_"+sGXsfl_101_idx, getSecureSignedToken( sPrefix+sGXsfl_101_idx, localUtil.format( AV23Exis, "ZZZZZZ9.9999")));
      GXt_decimal12 = AV23Exis ;
      GXv_decimal13[0] = GXt_decimal12 ;
      new app.stocksquimicos.upq_cuentacorriente_recuento(remoteHandle, context).execute( AV20Emprcod, AV43Prdnum, A3348CCStkFec, GXv_decimal13) ;
      upq_cuentacorriente_t_wc_impl.this.GXt_decimal12 = GXv_decimal13[0] ;
      AV23Exis = ((GXutil.strcmp(A3345TipMovCc, "SR")==0) ? GXt_decimal12 : AV23Exis) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavExis_Internalname, GXutil.ltrimstr( AV23Exis, 12, 4));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vEXIS"+"_"+sGXsfl_101_idx, getSecureSignedToken( sPrefix+sGXsfl_101_idx, localUtil.format( AV23Exis, "ZZZZZZ9.9999")));
      AV30Hdr = ((A3350CCStkBar==0) ? " " : GXutil.str( A3350CCStkBar, 8, 0)+"-"+GXutil.str( A3351CCStkReo, 1, 0)+A3352CCStkPar) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHdr_Internalname, AV30Hdr);
      cmbavAccionesgrupo.setColumnClass( ((GXutil.strcmp(A3345TipMovCc, "SR")==0) ? "WWActionGroupColumn WWColumnSuccess WWColumnSuccessFirstColumn" : "WWActionGroupColumn") );
      edtCCStkLin_Columnclass = ((GXutil.strcmp(A3345TipMovCc, "SR")==0) ? "WWColumn WWColumnSuccess hidden-xs" : "WWColumn hidden-xs") ;
      edtavDiahora_Columnclass = ((GXutil.strcmp(A3345TipMovCc, "SR")==0) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
      edtTipMovCc_Columnclass = ((GXutil.strcmp(A3345TipMovCc, "SR")==0) ? "WWColumn WWColumnSuccess hidden-xs" : "WWColumn hidden-xs") ;
      edtCCStkDsc_Columnclass = ((GXutil.strcmp(A3345TipMovCc, "SR")==0) ? "WWColumn WWColumnSuccess hidden-xs" : "WWColumn hidden-xs") ;
      edtavCcstkcane_Columnclass = ((GXutil.strcmp(A3345TipMovCc, "SR")==0) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
      edtavCcstkcans_Columnclass = ((GXutil.strcmp(A3345TipMovCc, "SR")==0) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
      edtCCStkPre_Columnclass = ((GXutil.strcmp(A3345TipMovCc, "SR")==0) ? "WWColumn WWColumnSuccess hidden-xs" : "WWColumn hidden-xs") ;
      edtavExis_Columnclass = ((GXutil.strcmp(A3345TipMovCc, "SR")==0) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
      edtCCStkLot_Columnclass = ((GXutil.strcmp(A3345TipMovCc, "SR")==0) ? "WWColumn WWColumnSuccess hidden-xs" : "WWColumn hidden-xs") ;
      edtavHdr_Columnclass = ((GXutil.strcmp(A3345TipMovCc, "SR")==0) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
      edtCCStkUsu_Columnclass = ((GXutil.strcmp(A3345TipMovCc, "SR")==0) ? "WWColumn WWColumnSuccess hidden-xs" : "WWColumn hidden-xs") ;
      edtCCStkFec_Columnclass = ((GXutil.strcmp(A3345TipMovCc, "SR")==0) ? "WWColumn WWColumnSuccess hidden-xs" : "WWColumn hidden-xs") ;
      edtCCStkHor_Columnclass = ((GXutil.strcmp(A3345TipMovCc, "SR")==0) ? "WWColumn WWColumnSuccess hidden-xs" : "WWColumn hidden-xs") ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(101) ;
      }
      sendrow_1012( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_101_Refreshing )
      {
         httpContext.doAjaxLoad(101, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavAccionesgrupo.setValue( GXutil.trim( GXutil.str( AV7AccionesGrupo, 4, 0)) );
   }

   public void e161SQ2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV14ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV12ColumnsSelector.fromJSonString(AV14ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "StocksQuimicos.UPQ_CuentaCorriente_t_WCColumnsSelector", ((GXutil.strcmp("", AV14ColumnsSelectorXML)==0) ? "" : AV12ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV12ColumnsSelector", AV12ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV33ManageFiltersData", AV33ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV28GridState", AV28GridState);
   }

   public void e121SQ2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("StocksQuimicos.UPQ_CuentaCorriente_t_WCFilters")),GXutil.URLEncode(GXutil.rtrim(AV77Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV34ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34ManageFiltersExecutionStep", GXutil.str( AV34ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("StocksQuimicos.UPQ_CuentaCorriente_t_WCFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV34ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34ManageFiltersExecutionStep", GXutil.str( AV34ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char7 = AV35ManageFiltersXml ;
         GXv_char8[0] = GXt_char7 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "StocksQuimicos.UPQ_CuentaCorriente_t_WCFilters", Ddo_managefilters_Activeeventkey, GXv_char8) ;
         upq_cuentacorriente_t_wc_impl.this.GXt_char7 = GXv_char8[0] ;
         AV35ManageFiltersXml = GXt_char7 ;
         if ( (GXutil.strcmp("", AV35ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV77Pgmname+"GridState", AV35ManageFiltersXml) ;
            AV28GridState.fromxml(AV35ManageFiltersXml, null, null);
            AV36OrderedBy = AV28GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36OrderedBy), 4, 0));
            AV38OrderedDsc = AV28GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38OrderedDsc", AV38OrderedDsc);
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
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV28GridState", AV28GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV12ColumnsSelector", AV12ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV33ManageFiltersData", AV33ManageFiltersData);
   }

   public void e171SQ2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char8[0] = AV22ExcelFilename ;
      GXv_char3[0] = AV21ErrorMessage ;
      new app.stocksquimicos.upq_cuentacorriente_t_wcexport(remoteHandle, context).execute( GXv_char8, GXv_char3) ;
      upq_cuentacorriente_t_wc_impl.this.AV22ExcelFilename = GXv_char8[0] ;
      upq_cuentacorriente_t_wc_impl.this.AV21ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV22ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV22ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV21ErrorMessage);
      }
   }

   public void e181SQ2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.stocksquimicos.upq_cuentacorriente_t_wcexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV36OrderedBy, 4, 0))+":"+(AV38OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV12ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector14[0] = AV12ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "CCStkLin", "", "Linea", true, "") ;
      AV12ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV12ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&DiaHora", "", "Dia Hora", true, "") ;
      AV12ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV12ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "TipMovCc", "", "Tipo", true, "") ;
      AV12ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV12ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "CCStkDsc", "", "Descripcion", true, "") ;
      AV12ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV12ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&CCStkCanE", "Cantidad", "Entrada", true, "") ;
      AV12ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV12ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&CCStkCanS", "Cantidad", "Salida", true, "") ;
      AV12ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV12ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "CCStkPre", "", "Precio", true, "") ;
      AV12ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV12ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&Exis", "", "Saldo", true, "") ;
      AV12ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV12ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "CCStkLot", "", "Lote", true, "") ;
      AV12ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV12ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&Hdr", "", "N Hdr", true, "") ;
      AV12ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV12ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "CCStkUsu", "", "Usuario", true, "") ;
      AV12ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV12ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "CCStkFec", "", "Fecha", true, "") ;
      AV12ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV12ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "CCStkHor", "", "Hora", true, "") ;
      AV12ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXt_char7 = AV60UserCustomValue ;
      GXv_char8[0] = GXt_char7 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "StocksQuimicos.UPQ_CuentaCorriente_t_WCColumnsSelector", GXv_char8) ;
      upq_cuentacorriente_t_wc_impl.this.GXt_char7 = GXv_char8[0] ;
      AV60UserCustomValue = GXt_char7 ;
      if ( ! ( (GXutil.strcmp("", AV60UserCustomValue)==0) ) )
      {
         AV13ColumnsSelectorAux.fromxml(AV60UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector14[0] = AV13ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector15[0] = AV12ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, GXv_SdtWWPColumnsSelector15) ;
         AV13ColumnsSelectorAux = GXv_SdtWWPColumnsSelector14[0] ;
         AV12ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item16 = AV33ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item17[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item16 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "StocksQuimicos.UPQ_CuentaCorriente_t_WCFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item17) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item16 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item17[0] ;
      AV33ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item16 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV25FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25FilterFullText", AV25FilterFullText);
      AV48TFCCStkLin = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFCCStkLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFCCStkLin), 12, 0));
      AV49TFCCStkLin_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFCCStkLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFCCStkLin_To), 12, 0));
      AV56TFTipMovCc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFTipMovCc", AV56TFTipMovCc);
      AV57TFTipMovCc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFTipMovCc_Sel", AV57TFTipMovCc_Sel);
      AV46TFCCStkDsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFCCStkDsc", AV46TFCCStkDsc);
      AV47TFCCStkDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFCCStkDsc_Sel", AV47TFCCStkDsc_Sel);
      AV52TFCCStkPre = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFCCStkPre", GXutil.ltrimstr( AV52TFCCStkPre, 14, 5));
      AV53TFCCStkPre_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFCCStkPre_To", GXutil.ltrimstr( AV53TFCCStkPre_To, 14, 5));
      AV50TFCCStkLot = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFCCStkLot", AV50TFCCStkLot);
      AV51TFCCStkLot_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFCCStkLot_Sel", AV51TFCCStkLot_Sel);
      AV54TFCCStkUsu = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFCCStkUsu", AV54TFCCStkUsu);
      AV55TFCCStkUsu_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFCCStkUsu_Sel", AV55TFCCStkUsu_Sel);
      AV69TFCCStkFec = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69TFCCStkFec", localUtil.format(AV69TFCCStkFec, "99/99/99"));
      AV73TFCCStkHor = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73TFCCStkHor", AV73TFCCStkHor);
      AV74TFCCStkHor_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74TFCCStkHor_Sel", AV74TFCCStkHor_Sel);
      Ddo_grid_Selectedvalue_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      Ddo_grid_Filteredtext_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S192( )
   {
      /* 'DO ELIMINAR' Routine */
      returnInSub = false ;
      AV97Emprcod_selected = A396EmprCod ;
      AV98Prdnum_selected = A719PrdNum ;
      AV99Ccstklin_selected = A3342CCStkLin ;
      this.executeUsercontrolMethod(sPrefix, false, "DVELOP_CONFIRMPANEL_ELIMINARContainer", "Confirm", "", new Object[] {});
   }

   public void S212( )
   {
      /* 'DO ACTION ELIMINAR' Routine */
      returnInSub = false ;
   }

   public void S202( )
   {
      /* 'DO MODIFICAR' Routine */
      returnInSub = false ;
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV45Session.getValue(AV77Pgmname+"GridState"), "") == 0 )
      {
         AV28GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV77Pgmname+"GridState"), null, null);
      }
      else
      {
         AV28GridState.fromxml(AV45Session.getValue(AV77Pgmname+"GridState"), null, null);
      }
      AV36OrderedBy = AV28GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36OrderedBy), 4, 0));
      AV38OrderedDsc = AV28GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38OrderedDsc", AV38OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S182 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV28GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV28GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV28GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S182( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV100GXV1 = 1 ;
      while ( AV100GXV1 <= AV28GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV29GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV28GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV100GXV1));
         if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV25FilterFullText = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25FilterFullText", AV25FilterFullText);
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKLIN") == 0 )
         {
            AV48TFCCStkLin = GXutil.lval( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFCCStkLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFCCStkLin), 12, 0));
            AV49TFCCStkLin_To = GXutil.lval( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFCCStkLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFCCStkLin_To), 12, 0));
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMOVCC") == 0 )
         {
            AV56TFTipMovCc = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFTipMovCc", AV56TFTipMovCc);
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMOVCC_SEL") == 0 )
         {
            AV57TFTipMovCc_Sel = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFTipMovCc_Sel", AV57TFTipMovCc_Sel);
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKDSC") == 0 )
         {
            AV46TFCCStkDsc = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFCCStkDsc", AV46TFCCStkDsc);
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKDSC_SEL") == 0 )
         {
            AV47TFCCStkDsc_Sel = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFCCStkDsc_Sel", AV47TFCCStkDsc_Sel);
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKPRE") == 0 )
         {
            AV52TFCCStkPre = CommonUtil.decimalVal( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFCCStkPre", GXutil.ltrimstr( AV52TFCCStkPre, 14, 5));
            AV53TFCCStkPre_To = CommonUtil.decimalVal( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFCCStkPre_To", GXutil.ltrimstr( AV53TFCCStkPre_To, 14, 5));
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKLOT") == 0 )
         {
            AV50TFCCStkLot = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFCCStkLot", AV50TFCCStkLot);
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKLOT_SEL") == 0 )
         {
            AV51TFCCStkLot_Sel = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFCCStkLot_Sel", AV51TFCCStkLot_Sel);
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKUSU") == 0 )
         {
            AV54TFCCStkUsu = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFCCStkUsu", AV54TFCCStkUsu);
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKUSU_SEL") == 0 )
         {
            AV55TFCCStkUsu_Sel = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFCCStkUsu_Sel", AV55TFCCStkUsu_Sel);
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKFEC") == 0 )
         {
            AV69TFCCStkFec = localUtil.ctod( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69TFCCStkFec", localUtil.format(AV69TFCCStkFec, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKHOR") == 0 )
         {
            AV73TFCCStkHor = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73TFCCStkHor", AV73TFCCStkHor);
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKHOR_SEL") == 0 )
         {
            AV74TFCCStkHor_Sel = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74TFCCStkHor_Sel", AV74TFCCStkHor_Sel);
         }
         AV100GXV1 = (int)(AV100GXV1+1) ;
      }
      GXt_char7 = "" ;
      GXv_char8[0] = GXt_char7 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV57TFTipMovCc_Sel)==0), AV57TFTipMovCc_Sel, GXv_char8) ;
      upq_cuentacorriente_t_wc_impl.this.GXt_char7 = GXv_char8[0] ;
      GXt_char18 = "" ;
      GXv_char3[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV47TFCCStkDsc_Sel)==0), AV47TFCCStkDsc_Sel, GXv_char3) ;
      upq_cuentacorriente_t_wc_impl.this.GXt_char18 = GXv_char3[0] ;
      GXt_char19 = "" ;
      GXv_char2[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV51TFCCStkLot_Sel)==0), AV51TFCCStkLot_Sel, GXv_char2) ;
      upq_cuentacorriente_t_wc_impl.this.GXt_char19 = GXv_char2[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV55TFCCStkUsu_Sel)==0), AV55TFCCStkUsu_Sel, GXv_char21) ;
      upq_cuentacorriente_t_wc_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV74TFCCStkHor_Sel)==0), AV74TFCCStkHor_Sel, GXv_char23) ;
      upq_cuentacorriente_t_wc_impl.this.GXt_char22 = GXv_char23[0] ;
      Ddo_grid_Selectedvalue_set = "||"+GXt_char7+"|"+GXt_char18+"|||||"+GXt_char19+"||"+GXt_char20+"||"+GXt_char22 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV56TFTipMovCc)==0), AV56TFTipMovCc, GXv_char23) ;
      upq_cuentacorriente_t_wc_impl.this.GXt_char22 = GXv_char23[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV46TFCCStkDsc)==0), AV46TFCCStkDsc, GXv_char21) ;
      upq_cuentacorriente_t_wc_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char19 = "" ;
      GXv_char8[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV50TFCCStkLot)==0), AV50TFCCStkLot, GXv_char8) ;
      upq_cuentacorriente_t_wc_impl.this.GXt_char19 = GXv_char8[0] ;
      GXt_char18 = "" ;
      GXv_char3[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV54TFCCStkUsu)==0), AV54TFCCStkUsu, GXv_char3) ;
      upq_cuentacorriente_t_wc_impl.this.GXt_char18 = GXv_char3[0] ;
      GXt_char7 = "" ;
      GXv_char2[0] = GXt_char7 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV73TFCCStkHor)==0), AV73TFCCStkHor, GXv_char2) ;
      upq_cuentacorriente_t_wc_impl.this.GXt_char7 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV48TFCCStkLin) ? "" : GXutil.str( AV48TFCCStkLin, 12, 0))+"||"+GXt_char22+"|"+GXt_char20+"|||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV52TFCCStkPre)==0) ? "" : GXutil.str( AV52TFCCStkPre, 14, 5))+"||"+GXt_char19+"||"+GXt_char18+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV69TFCCStkFec)) ? "" : localUtil.dtoc( AV69TFCCStkFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+GXt_char7 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV49TFCCStkLin_To) ? "" : GXutil.str( AV49TFCCStkLin_To, 12, 0))+"||||||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV53TFCCStkPre_To)==0) ? "" : GXutil.str( AV53TFCCStkPre_To, 14, 5))+"||||||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV28GridState.fromxml(AV45Session.getValue(AV77Pgmname+"GridState"), null, null);
      AV28GridState.setgxTv_SdtWWPGridState_Orderedby( AV36OrderedBy );
      AV28GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV38OrderedDsc );
      AV28GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState24[0] = AV28GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV25FilterFullText)==0), (short)(0), AV25FilterFullText, "") ;
      AV28GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV28GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFCCSTKLIN", "", !((0==AV48TFCCStkLin)&&(0==AV49TFCCStkLin_To)), (short)(0), GXutil.trim( GXutil.str( AV48TFCCStkLin, 12, 0)), GXutil.trim( GXutil.str( AV49TFCCStkLin_To, 12, 0))) ;
      AV28GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV28GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFTIPMOVCC", "", !(GXutil.strcmp("", AV56TFTipMovCc)==0), (short)(0), AV56TFTipMovCc, "", !(GXutil.strcmp("", AV57TFTipMovCc_Sel)==0), AV57TFTipMovCc_Sel, "") ;
      AV28GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV28GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFCCSTKDSC", "", !(GXutil.strcmp("", AV46TFCCStkDsc)==0), (short)(0), AV46TFCCStkDsc, "", !(GXutil.strcmp("", AV47TFCCStkDsc_Sel)==0), AV47TFCCStkDsc_Sel, "") ;
      AV28GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV28GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFCCSTKPRE", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV52TFCCStkPre)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV53TFCCStkPre_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV52TFCCStkPre, 14, 5)), GXutil.trim( GXutil.str( AV53TFCCStkPre_To, 14, 5))) ;
      AV28GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV28GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFCCSTKLOT", "", !(GXutil.strcmp("", AV50TFCCStkLot)==0), (short)(0), AV50TFCCStkLot, "", !(GXutil.strcmp("", AV51TFCCStkLot_Sel)==0), AV51TFCCStkLot_Sel, "") ;
      AV28GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV28GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFCCSTKUSU", "", !(GXutil.strcmp("", AV54TFCCStkUsu)==0), (short)(0), AV54TFCCStkUsu, "", !(GXutil.strcmp("", AV55TFCCStkUsu_Sel)==0), AV55TFCCStkUsu_Sel, "") ;
      AV28GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV28GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFCCSTKFEC", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV69TFCCStkFec)), (short)(0), GXutil.trim( localUtil.dtoc( AV69TFCCStkFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV28GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV28GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFCCSTKHOR", "", !(GXutil.strcmp("", AV73TFCCStkHor)==0), (short)(0), AV73TFCCStkHor, "", !(GXutil.strcmp("", AV74TFCCStkHor_Sel)==0), AV74TFCCStkHor_Sel, "") ;
      AV28GridState = GXv_SdtWWPGridState24[0] ;
      if ( ! (GXutil.strcmp("", AV20Emprcod)==0) )
      {
         AV29GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV29GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV29GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV20Emprcod );
         AV28GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV29GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV43Prdnum)==0) )
      {
         AV29GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV29GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PRDNUM" );
         AV29GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV43Prdnum );
         AV28GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV29GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV10CCstkfecfrom)) )
      {
         AV29GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV29GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CCSTKFECFROM" );
         AV29GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV10CCstkfecfrom, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV28GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV29GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV11CCstkfecto)) )
      {
         AV29GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV29GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CCSTKFECTO" );
         AV29GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV11CCstkfecto, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV28GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV29GridStateFilterValue, 0);
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV15Compras)==0) )
      {
         AV29GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV29GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&COMPRAS" );
         AV29GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV15Compras, 12, 4) );
         AV28GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV29GridStateFilterValue, 0);
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV16Consumos)==0) )
      {
         AV29GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV29GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CONSUMOS" );
         AV29GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV16Consumos, 12, 4) );
         AV28GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV29GridStateFilterValue, 0);
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV18Devoluciones)==0) )
      {
         AV29GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV29GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&DEVOLUCIONES" );
         AV29GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV18Devoluciones, 12, 4) );
         AV28GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV29GridStateFilterValue, 0);
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV44SaldoInicial)==0) )
      {
         AV29GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV29GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&SALDOINICIAL" );
         AV29GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV44SaldoInicial, 12, 4) );
         AV28GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV29GridStateFilterValue, 0);
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV24Existenciascuentacorriente)==0) )
      {
         AV29GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV29GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EXISTENCIASCUENTACORRIENTE" );
         AV29GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV24Existenciascuentacorriente, 12, 4) );
         AV28GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV29GridStateFilterValue, 0);
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV41PrdExiAlm)==0) )
      {
         AV29GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV29GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PRDEXIALM" );
         AV29GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV41PrdExiAlm, 12, 4) );
         AV28GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV29GridStateFilterValue, 0);
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV40PrdCanres)==0) )
      {
         AV29GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV29GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PRDCANRES" );
         AV29GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV40PrdCanres, 12, 4) );
         AV28GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV29GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV42PrdNom)==0) )
      {
         AV29GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV29GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PRDNOM" );
         AV29GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV42PrdNom );
         AV28GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV29GridStateFilterValue, 0);
      }
      AV28GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV28GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV77Pgmname+"GridState", AV28GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV58TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV58TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV77Pgmname );
      AV58TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV58TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV31HTTPRequest.getScriptName()+"?"+AV31HTTPRequest.getQuerystring() );
      AV58TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "StocksQuimicos.UPQ_CuentaCorriente_TRN" );
      AV45Session.setValue("TrnContext", AV58TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table3_137_1SQ2( boolean wbgen )
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
         wb_table3_137_1SQ2e( true) ;
      }
      else
      {
         wb_table3_137_1SQ2e( false) ;
      }
   }

   public void wb_table2_132_1SQ2( boolean wbgen )
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
         wb_table2_132_1SQ2e( true) ;
      }
      else
      {
         wb_table2_132_1SQ2e( false) ;
      }
   }

   public void wb_table1_23_1SQ2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV33ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table4_28_1SQ2( true) ;
      }
      else
      {
         wb_table4_28_1SQ2( false) ;
      }
      return  ;
   }

   public void wb_table4_28_1SQ2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_23_1SQ2e( true) ;
      }
      else
      {
         wb_table1_23_1SQ2e( false) ;
      }
   }

   public void wb_table4_28_1SQ2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'" + sPrefix + "',false,'" + sGXsfl_101_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV25FilterFullText, GXutil.rtrim( localUtil.format( AV25FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_t_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_28_1SQ2e( true) ;
      }
      else
      {
         wb_table4_28_1SQ2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV20Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20Emprcod", AV20Emprcod);
      AV43Prdnum = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43Prdnum", AV43Prdnum);
      AV10CCstkfecfrom = (java.util.Date)getParm(obj,2,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10CCstkfecfrom", localUtil.format(AV10CCstkfecfrom, "99/99/99"));
      AV11CCstkfecto = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11CCstkfecto", localUtil.format(AV11CCstkfecto, "99/99/99"));
      AV15Compras = (java.math.BigDecimal)getParm(obj,4,TypeConstants.DECIMAL) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15Compras", GXutil.ltrimstr( AV15Compras, 12, 4));
      AV16Consumos = (java.math.BigDecimal)getParm(obj,5,TypeConstants.DECIMAL) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16Consumos", GXutil.ltrimstr( AV16Consumos, 12, 4));
      AV18Devoluciones = (java.math.BigDecimal)getParm(obj,6,TypeConstants.DECIMAL) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18Devoluciones", GXutil.ltrimstr( AV18Devoluciones, 12, 4));
      AV44SaldoInicial = (java.math.BigDecimal)getParm(obj,7,TypeConstants.DECIMAL) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44SaldoInicial", GXutil.ltrimstr( AV44SaldoInicial, 12, 4));
      AV24Existenciascuentacorriente = (java.math.BigDecimal)getParm(obj,8,TypeConstants.DECIMAL) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24Existenciascuentacorriente", GXutil.ltrimstr( AV24Existenciascuentacorriente, 12, 4));
      AV41PrdExiAlm = (java.math.BigDecimal)getParm(obj,9,TypeConstants.DECIMAL) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41PrdExiAlm", GXutil.ltrimstr( AV41PrdExiAlm, 12, 4));
      AV40PrdCanres = (java.math.BigDecimal)getParm(obj,10,TypeConstants.DECIMAL) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40PrdCanres", GXutil.ltrimstr( AV40PrdCanres, 12, 4));
      AV42PrdNom = (String)getParm(obj,11,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42PrdNom", AV42PrdNom);
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
      pa1SQ2( ) ;
      ws1SQ2( ) ;
      we1SQ2( ) ;
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
      sCtrlAV20Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV43Prdnum = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV10CCstkfecfrom = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV11CCstkfecto = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV15Compras = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV16Consumos = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV18Devoluciones = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV44SaldoInicial = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV24Existenciascuentacorriente = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV41PrdExiAlm = (String)getParm(obj,9,TypeConstants.STRING) ;
      sCtrlAV40PrdCanres = (String)getParm(obj,10,TypeConstants.STRING) ;
      sCtrlAV42PrdNom = (String)getParm(obj,11,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1SQ2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "stocksquimicos\\upq_cuentacorriente_t_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1SQ2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV20Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20Emprcod", AV20Emprcod);
         AV43Prdnum = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43Prdnum", AV43Prdnum);
         AV10CCstkfecfrom = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10CCstkfecfrom", localUtil.format(AV10CCstkfecfrom, "99/99/99"));
         AV11CCstkfecto = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11CCstkfecto", localUtil.format(AV11CCstkfecto, "99/99/99"));
         AV15Compras = (java.math.BigDecimal)getParm(obj,6,TypeConstants.DECIMAL) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15Compras", GXutil.ltrimstr( AV15Compras, 12, 4));
         AV16Consumos = (java.math.BigDecimal)getParm(obj,7,TypeConstants.DECIMAL) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16Consumos", GXutil.ltrimstr( AV16Consumos, 12, 4));
         AV18Devoluciones = (java.math.BigDecimal)getParm(obj,8,TypeConstants.DECIMAL) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18Devoluciones", GXutil.ltrimstr( AV18Devoluciones, 12, 4));
         AV44SaldoInicial = (java.math.BigDecimal)getParm(obj,9,TypeConstants.DECIMAL) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44SaldoInicial", GXutil.ltrimstr( AV44SaldoInicial, 12, 4));
         AV24Existenciascuentacorriente = (java.math.BigDecimal)getParm(obj,10,TypeConstants.DECIMAL) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24Existenciascuentacorriente", GXutil.ltrimstr( AV24Existenciascuentacorriente, 12, 4));
         AV41PrdExiAlm = (java.math.BigDecimal)getParm(obj,11,TypeConstants.DECIMAL) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41PrdExiAlm", GXutil.ltrimstr( AV41PrdExiAlm, 12, 4));
         AV40PrdCanres = (java.math.BigDecimal)getParm(obj,12,TypeConstants.DECIMAL) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40PrdCanres", GXutil.ltrimstr( AV40PrdCanres, 12, 4));
         AV42PrdNom = (String)getParm(obj,13,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42PrdNom", AV42PrdNom);
      }
      wcpOAV20Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV20Emprcod") ;
      wcpOAV43Prdnum = httpContext.cgiGet( sPrefix+"wcpOAV43Prdnum") ;
      wcpOAV10CCstkfecfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV10CCstkfecfrom"), 0) ;
      wcpOAV11CCstkfecto = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV11CCstkfecto"), 0) ;
      wcpOAV15Compras = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV15Compras")) ;
      wcpOAV16Consumos = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV16Consumos")) ;
      wcpOAV18Devoluciones = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV18Devoluciones")) ;
      wcpOAV44SaldoInicial = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV44SaldoInicial")) ;
      wcpOAV24Existenciascuentacorriente = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV24Existenciascuentacorriente")) ;
      wcpOAV41PrdExiAlm = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV41PrdExiAlm")) ;
      wcpOAV40PrdCanres = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV40PrdCanres")) ;
      wcpOAV42PrdNom = httpContext.cgiGet( sPrefix+"wcpOAV42PrdNom") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV20Emprcod, wcpOAV20Emprcod) != 0 ) || ( GXutil.strcmp(AV43Prdnum, wcpOAV43Prdnum) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(AV10CCstkfecfrom), GXutil.resetTime(wcpOAV10CCstkfecfrom)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV11CCstkfecto), GXutil.resetTime(wcpOAV11CCstkfecto)) ) || ( DecimalUtil.compareTo(AV15Compras, wcpOAV15Compras) != 0 ) || ( DecimalUtil.compareTo(AV16Consumos, wcpOAV16Consumos) != 0 ) || ( DecimalUtil.compareTo(AV18Devoluciones, wcpOAV18Devoluciones) != 0 ) || ( DecimalUtil.compareTo(AV44SaldoInicial, wcpOAV44SaldoInicial) != 0 ) || ( DecimalUtil.compareTo(AV24Existenciascuentacorriente, wcpOAV24Existenciascuentacorriente) != 0 ) || ( DecimalUtil.compareTo(AV41PrdExiAlm, wcpOAV41PrdExiAlm) != 0 ) || ( DecimalUtil.compareTo(AV40PrdCanres, wcpOAV40PrdCanres) != 0 ) || ( GXutil.strcmp(AV42PrdNom, wcpOAV42PrdNom) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV20Emprcod = AV20Emprcod ;
      wcpOAV43Prdnum = AV43Prdnum ;
      wcpOAV10CCstkfecfrom = AV10CCstkfecfrom ;
      wcpOAV11CCstkfecto = AV11CCstkfecto ;
      wcpOAV15Compras = AV15Compras ;
      wcpOAV16Consumos = AV16Consumos ;
      wcpOAV18Devoluciones = AV18Devoluciones ;
      wcpOAV44SaldoInicial = AV44SaldoInicial ;
      wcpOAV24Existenciascuentacorriente = AV24Existenciascuentacorriente ;
      wcpOAV41PrdExiAlm = AV41PrdExiAlm ;
      wcpOAV40PrdCanres = AV40PrdCanres ;
      wcpOAV42PrdNom = AV42PrdNom ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV20Emprcod = httpContext.cgiGet( sPrefix+"AV20Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV20Emprcod) > 0 )
      {
         AV20Emprcod = httpContext.cgiGet( sCtrlAV20Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20Emprcod", AV20Emprcod);
      }
      else
      {
         AV20Emprcod = httpContext.cgiGet( sPrefix+"AV20Emprcod_PARM") ;
      }
      sCtrlAV43Prdnum = httpContext.cgiGet( sPrefix+"AV43Prdnum_CTRL") ;
      if ( GXutil.len( sCtrlAV43Prdnum) > 0 )
      {
         AV43Prdnum = httpContext.cgiGet( sCtrlAV43Prdnum) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43Prdnum", AV43Prdnum);
      }
      else
      {
         AV43Prdnum = httpContext.cgiGet( sPrefix+"AV43Prdnum_PARM") ;
      }
      sCtrlAV10CCstkfecfrom = httpContext.cgiGet( sPrefix+"AV10CCstkfecfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV10CCstkfecfrom) > 0 )
      {
         AV10CCstkfecfrom = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV10CCstkfecfrom), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10CCstkfecfrom", localUtil.format(AV10CCstkfecfrom, "99/99/99"));
      }
      else
      {
         AV10CCstkfecfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV10CCstkfecfrom_PARM"), 0) ;
      }
      sCtrlAV11CCstkfecto = httpContext.cgiGet( sPrefix+"AV11CCstkfecto_CTRL") ;
      if ( GXutil.len( sCtrlAV11CCstkfecto) > 0 )
      {
         AV11CCstkfecto = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV11CCstkfecto), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11CCstkfecto", localUtil.format(AV11CCstkfecto, "99/99/99"));
      }
      else
      {
         AV11CCstkfecto = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV11CCstkfecto_PARM"), 0) ;
      }
      sCtrlAV15Compras = httpContext.cgiGet( sPrefix+"AV15Compras_CTRL") ;
      if ( GXutil.len( sCtrlAV15Compras) > 0 )
      {
         AV15Compras = localUtil.ctond( httpContext.cgiGet( sCtrlAV15Compras)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15Compras", GXutil.ltrimstr( AV15Compras, 12, 4));
      }
      else
      {
         AV15Compras = localUtil.ctond( httpContext.cgiGet( sPrefix+"AV15Compras_PARM")) ;
      }
      sCtrlAV16Consumos = httpContext.cgiGet( sPrefix+"AV16Consumos_CTRL") ;
      if ( GXutil.len( sCtrlAV16Consumos) > 0 )
      {
         AV16Consumos = localUtil.ctond( httpContext.cgiGet( sCtrlAV16Consumos)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16Consumos", GXutil.ltrimstr( AV16Consumos, 12, 4));
      }
      else
      {
         AV16Consumos = localUtil.ctond( httpContext.cgiGet( sPrefix+"AV16Consumos_PARM")) ;
      }
      sCtrlAV18Devoluciones = httpContext.cgiGet( sPrefix+"AV18Devoluciones_CTRL") ;
      if ( GXutil.len( sCtrlAV18Devoluciones) > 0 )
      {
         AV18Devoluciones = localUtil.ctond( httpContext.cgiGet( sCtrlAV18Devoluciones)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18Devoluciones", GXutil.ltrimstr( AV18Devoluciones, 12, 4));
      }
      else
      {
         AV18Devoluciones = localUtil.ctond( httpContext.cgiGet( sPrefix+"AV18Devoluciones_PARM")) ;
      }
      sCtrlAV44SaldoInicial = httpContext.cgiGet( sPrefix+"AV44SaldoInicial_CTRL") ;
      if ( GXutil.len( sCtrlAV44SaldoInicial) > 0 )
      {
         AV44SaldoInicial = localUtil.ctond( httpContext.cgiGet( sCtrlAV44SaldoInicial)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44SaldoInicial", GXutil.ltrimstr( AV44SaldoInicial, 12, 4));
      }
      else
      {
         AV44SaldoInicial = localUtil.ctond( httpContext.cgiGet( sPrefix+"AV44SaldoInicial_PARM")) ;
      }
      sCtrlAV24Existenciascuentacorriente = httpContext.cgiGet( sPrefix+"AV24Existenciascuentacorriente_CTRL") ;
      if ( GXutil.len( sCtrlAV24Existenciascuentacorriente) > 0 )
      {
         AV24Existenciascuentacorriente = localUtil.ctond( httpContext.cgiGet( sCtrlAV24Existenciascuentacorriente)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24Existenciascuentacorriente", GXutil.ltrimstr( AV24Existenciascuentacorriente, 12, 4));
      }
      else
      {
         AV24Existenciascuentacorriente = localUtil.ctond( httpContext.cgiGet( sPrefix+"AV24Existenciascuentacorriente_PARM")) ;
      }
      sCtrlAV41PrdExiAlm = httpContext.cgiGet( sPrefix+"AV41PrdExiAlm_CTRL") ;
      if ( GXutil.len( sCtrlAV41PrdExiAlm) > 0 )
      {
         AV41PrdExiAlm = localUtil.ctond( httpContext.cgiGet( sCtrlAV41PrdExiAlm)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41PrdExiAlm", GXutil.ltrimstr( AV41PrdExiAlm, 12, 4));
      }
      else
      {
         AV41PrdExiAlm = localUtil.ctond( httpContext.cgiGet( sPrefix+"AV41PrdExiAlm_PARM")) ;
      }
      sCtrlAV40PrdCanres = httpContext.cgiGet( sPrefix+"AV40PrdCanres_CTRL") ;
      if ( GXutil.len( sCtrlAV40PrdCanres) > 0 )
      {
         AV40PrdCanres = localUtil.ctond( httpContext.cgiGet( sCtrlAV40PrdCanres)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40PrdCanres", GXutil.ltrimstr( AV40PrdCanres, 12, 4));
      }
      else
      {
         AV40PrdCanres = localUtil.ctond( httpContext.cgiGet( sPrefix+"AV40PrdCanres_PARM")) ;
      }
      sCtrlAV42PrdNom = httpContext.cgiGet( sPrefix+"AV42PrdNom_CTRL") ;
      if ( GXutil.len( sCtrlAV42PrdNom) > 0 )
      {
         AV42PrdNom = httpContext.cgiGet( sCtrlAV42PrdNom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42PrdNom", AV42PrdNom);
      }
      else
      {
         AV42PrdNom = httpContext.cgiGet( sPrefix+"AV42PrdNom_PARM") ;
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
      pa1SQ2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1SQ2( ) ;
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
      ws1SQ2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV20Emprcod_PARM", GXutil.rtrim( AV20Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV20Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV20Emprcod_CTRL", GXutil.rtrim( sCtrlAV20Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV43Prdnum_PARM", GXutil.rtrim( AV43Prdnum));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV43Prdnum)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV43Prdnum_CTRL", GXutil.rtrim( sCtrlAV43Prdnum));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10CCstkfecfrom_PARM", localUtil.dtoc( AV10CCstkfecfrom, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV10CCstkfecfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10CCstkfecfrom_CTRL", GXutil.rtrim( sCtrlAV10CCstkfecfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11CCstkfecto_PARM", localUtil.dtoc( AV11CCstkfecto, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV11CCstkfecto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11CCstkfecto_CTRL", GXutil.rtrim( sCtrlAV11CCstkfecto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV15Compras_PARM", GXutil.ltrim( localUtil.ntoc( AV15Compras, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV15Compras)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV15Compras_CTRL", GXutil.rtrim( sCtrlAV15Compras));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV16Consumos_PARM", GXutil.ltrim( localUtil.ntoc( AV16Consumos, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV16Consumos)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV16Consumos_CTRL", GXutil.rtrim( sCtrlAV16Consumos));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV18Devoluciones_PARM", GXutil.ltrim( localUtil.ntoc( AV18Devoluciones, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV18Devoluciones)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV18Devoluciones_CTRL", GXutil.rtrim( sCtrlAV18Devoluciones));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV44SaldoInicial_PARM", GXutil.ltrim( localUtil.ntoc( AV44SaldoInicial, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV44SaldoInicial)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV44SaldoInicial_CTRL", GXutil.rtrim( sCtrlAV44SaldoInicial));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV24Existenciascuentacorriente_PARM", GXutil.ltrim( localUtil.ntoc( AV24Existenciascuentacorriente, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV24Existenciascuentacorriente)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV24Existenciascuentacorriente_CTRL", GXutil.rtrim( sCtrlAV24Existenciascuentacorriente));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV41PrdExiAlm_PARM", GXutil.ltrim( localUtil.ntoc( AV41PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV41PrdExiAlm)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV41PrdExiAlm_CTRL", GXutil.rtrim( sCtrlAV41PrdExiAlm));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV40PrdCanres_PARM", GXutil.ltrim( localUtil.ntoc( AV40PrdCanres, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV40PrdCanres)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV40PrdCanres_CTRL", GXutil.rtrim( sCtrlAV40PrdCanres));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV42PrdNom_PARM", GXutil.rtrim( AV42PrdNom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV42PrdNom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV42PrdNom_CTRL", GXutil.rtrim( sCtrlAV42PrdNom));
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
      we1SQ2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115555426", true, true);
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
      httpContext.AddJavascriptSource("stocksquimicos/upq_cuentacorriente_t_wc.js", "?202682115555426", false, true);
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

   public void subsflControlProps_1012( )
   {
      cmbavAccionesgrupo.setInternalname( sPrefix+"vACCIONESGRUPO_"+sGXsfl_101_idx );
      edtCCStkLin_Internalname = sPrefix+"CCSTKLIN_"+sGXsfl_101_idx ;
      edtavDiahora_Internalname = sPrefix+"vDIAHORA_"+sGXsfl_101_idx ;
      edtTipMovCc_Internalname = sPrefix+"TIPMOVCC_"+sGXsfl_101_idx ;
      edtCCStkDsc_Internalname = sPrefix+"CCSTKDSC_"+sGXsfl_101_idx ;
      edtavCcstkcane_Internalname = sPrefix+"vCCSTKCANE_"+sGXsfl_101_idx ;
      edtavCcstkcans_Internalname = sPrefix+"vCCSTKCANS_"+sGXsfl_101_idx ;
      edtCCStkPre_Internalname = sPrefix+"CCSTKPRE_"+sGXsfl_101_idx ;
      edtavExis_Internalname = sPrefix+"vEXIS_"+sGXsfl_101_idx ;
      edtCCStkLot_Internalname = sPrefix+"CCSTKLOT_"+sGXsfl_101_idx ;
      edtavHdr_Internalname = sPrefix+"vHDR_"+sGXsfl_101_idx ;
      edtCCStkUsu_Internalname = sPrefix+"CCSTKUSU_"+sGXsfl_101_idx ;
      edtCCStkBar_Internalname = sPrefix+"CCSTKBAR_"+sGXsfl_101_idx ;
      edtCCStkReo_Internalname = sPrefix+"CCSTKREO_"+sGXsfl_101_idx ;
      edtCCStkPar_Internalname = sPrefix+"CCSTKPAR_"+sGXsfl_101_idx ;
      edtCCStkLen_Internalname = sPrefix+"CCSTKLEN_"+sGXsfl_101_idx ;
      edtCCStkFec_Internalname = sPrefix+"CCSTKFEC_"+sGXsfl_101_idx ;
      edtCCStkHor_Internalname = sPrefix+"CCSTKHOR_"+sGXsfl_101_idx ;
   }

   public void subsflControlProps_fel_1012( )
   {
      cmbavAccionesgrupo.setInternalname( sPrefix+"vACCIONESGRUPO_"+sGXsfl_101_fel_idx );
      edtCCStkLin_Internalname = sPrefix+"CCSTKLIN_"+sGXsfl_101_fel_idx ;
      edtavDiahora_Internalname = sPrefix+"vDIAHORA_"+sGXsfl_101_fel_idx ;
      edtTipMovCc_Internalname = sPrefix+"TIPMOVCC_"+sGXsfl_101_fel_idx ;
      edtCCStkDsc_Internalname = sPrefix+"CCSTKDSC_"+sGXsfl_101_fel_idx ;
      edtavCcstkcane_Internalname = sPrefix+"vCCSTKCANE_"+sGXsfl_101_fel_idx ;
      edtavCcstkcans_Internalname = sPrefix+"vCCSTKCANS_"+sGXsfl_101_fel_idx ;
      edtCCStkPre_Internalname = sPrefix+"CCSTKPRE_"+sGXsfl_101_fel_idx ;
      edtavExis_Internalname = sPrefix+"vEXIS_"+sGXsfl_101_fel_idx ;
      edtCCStkLot_Internalname = sPrefix+"CCSTKLOT_"+sGXsfl_101_fel_idx ;
      edtavHdr_Internalname = sPrefix+"vHDR_"+sGXsfl_101_fel_idx ;
      edtCCStkUsu_Internalname = sPrefix+"CCSTKUSU_"+sGXsfl_101_fel_idx ;
      edtCCStkBar_Internalname = sPrefix+"CCSTKBAR_"+sGXsfl_101_fel_idx ;
      edtCCStkReo_Internalname = sPrefix+"CCSTKREO_"+sGXsfl_101_fel_idx ;
      edtCCStkPar_Internalname = sPrefix+"CCSTKPAR_"+sGXsfl_101_fel_idx ;
      edtCCStkLen_Internalname = sPrefix+"CCSTKLEN_"+sGXsfl_101_fel_idx ;
      edtCCStkFec_Internalname = sPrefix+"CCSTKFEC_"+sGXsfl_101_fel_idx ;
      edtCCStkHor_Internalname = sPrefix+"CCSTKHOR_"+sGXsfl_101_fel_idx ;
   }

   public void sendrow_1012( )
   {
      subsflControlProps_1012( ) ;
      wb1SQ0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_101_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_101_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_101_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavAccionesgrupo.getEnabled()!=0)&&(cmbavAccionesgrupo.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 102,'"+sPrefix+"',false,'"+sGXsfl_101_idx+"',101)\"" : " ") ;
         if ( ( cmbavAccionesgrupo.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vACCIONESGRUPO_" + sGXsfl_101_idx ;
            cmbavAccionesgrupo.setName( GXCCtl );
            cmbavAccionesgrupo.setWebtags( "" );
            if ( cmbavAccionesgrupo.getItemCount() > 0 )
            {
               AV7AccionesGrupo = (short)(GXutil.lval( cmbavAccionesgrupo.getValidValue(GXutil.trim( GXutil.str( AV7AccionesGrupo, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavAccionesgrupo.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7AccionesGrupo), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavAccionesgrupo,cmbavAccionesgrupo.getInternalname(),GXutil.trim( GXutil.str( AV7AccionesGrupo, 4, 0)),Integer.valueOf(1),cmbavAccionesgrupo.getJsonclick(),Integer.valueOf(7),"'"+sPrefix+"'"+",false,"+"'"+"e221sq2_client"+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO",cmbavAccionesgrupo.getColumnClass(),cmbavAccionesgrupo.getColumnHeaderClass(),TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavAccionesgrupo.getEnabled()!=0)&&(cmbavAccionesgrupo.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,102);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavAccionesgrupo.setValue( GXutil.trim( GXutil.str( AV7AccionesGrupo, 4, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavAccionesgrupo.getInternalname(), "Values", cmbavAccionesgrupo.ToJavascriptSource(), !bGXsfl_101_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCCStkLin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCStkLin_Internalname,GXutil.ltrim( localUtil.ntoc( A3342CCStkLin, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3342CCStkLin), "ZZZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCCStkLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtCCStkLin_Columnclass,edtCCStkLin_Columnheaderclass,Integer.valueOf(edtCCStkLin_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(101),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavDiahora_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavDiahora_Enabled!=0)&&(edtavDiahora_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 104,'"+sPrefix+"',false,'"+sGXsfl_101_idx+"',101)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDiahora_Internalname,GXutil.rtrim( AV19DiaHora),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavDiahora_Enabled!=0)&&(edtavDiahora_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,104);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDiahora_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavDiahora_Columnclass,edtavDiahora_Columnheaderclass,Integer.valueOf(edtavDiahora_Visible),Integer.valueOf(edtavDiahora_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(101),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtTipMovCc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipMovCc_Internalname,GXutil.rtrim( A3345TipMovCc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTipMovCc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtTipMovCc_Columnclass,edtTipMovCc_Columnheaderclass,Integer.valueOf(edtTipMovCc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(101),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCCStkDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCStkDsc_Internalname,GXutil.rtrim( A3357CCStkDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCCStkDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtCCStkDsc_Columnclass,edtCCStkDsc_Columnheaderclass,Integer.valueOf(edtCCStkDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(101),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCcstkcane_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCcstkcane_Enabled!=0)&&(edtavCcstkcane_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 107,'"+sPrefix+"',false,'"+sGXsfl_101_idx+"',101)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCcstkcane_Internalname,GXutil.ltrim( localUtil.ntoc( AV8CCStkCanE, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCcstkcane_Enabled!=0) ? localUtil.format( AV8CCStkCanE, "ZZZZZZ9.9999") : localUtil.format( AV8CCStkCanE, "ZZZZZZ9.9999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+((edtavCcstkcane_Enabled!=0)&&(edtavCcstkcane_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,107);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCcstkcane_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavCcstkcane_Columnclass,edtavCcstkcane_Columnheaderclass,Integer.valueOf(edtavCcstkcane_Visible),Integer.valueOf(edtavCcstkcane_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(101),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCcstkcans_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCcstkcans_Enabled!=0)&&(edtavCcstkcans_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 108,'"+sPrefix+"',false,'"+sGXsfl_101_idx+"',101)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCcstkcans_Internalname,GXutil.ltrim( localUtil.ntoc( AV9CCStkCanS, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCcstkcans_Enabled!=0) ? localUtil.format( AV9CCStkCanS, "ZZZZZZ9.9999") : localUtil.format( AV9CCStkCanS, "ZZZZZZ9.9999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+((edtavCcstkcans_Enabled!=0)&&(edtavCcstkcans_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,108);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCcstkcans_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavCcstkcans_Columnclass,edtavCcstkcans_Columnheaderclass,Integer.valueOf(edtavCcstkcans_Visible),Integer.valueOf(edtavCcstkcans_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(101),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCCStkPre_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCStkPre_Internalname,GXutil.ltrim( localUtil.ntoc( A3349CCStkPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A3349CCStkPre, "ZZZZZZZ9.999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCCStkPre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtCCStkPre_Columnclass,edtCCStkPre_Columnheaderclass,Integer.valueOf(edtCCStkPre_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(101),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavExis_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavExis_Enabled!=0)&&(edtavExis_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 110,'"+sPrefix+"',false,'"+sGXsfl_101_idx+"',101)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavExis_Internalname,GXutil.ltrim( localUtil.ntoc( AV23Exis, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavExis_Enabled!=0) ? localUtil.format( AV23Exis, "ZZZZZZ9.9999") : localUtil.format( AV23Exis, "ZZZZZZ9.9999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+((edtavExis_Enabled!=0)&&(edtavExis_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,110);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavExis_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavExis_Columnclass,edtavExis_Columnheaderclass,Integer.valueOf(edtavExis_Visible),Integer.valueOf(edtavExis_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(101),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCCStkLot_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCStkLot_Internalname,GXutil.rtrim( A5722CCStkLot),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCCStkLot_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtCCStkLot_Columnclass,edtCCStkLot_Columnheaderclass,Integer.valueOf(edtCCStkLot_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(101),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavHdr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavHdr_Enabled!=0)&&(edtavHdr_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 112,'"+sPrefix+"',false,'"+sGXsfl_101_idx+"',101)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr_Internalname,GXutil.rtrim( AV30Hdr),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavHdr_Enabled!=0)&&(edtavHdr_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,112);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavHdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavHdr_Columnclass,edtavHdr_Columnheaderclass,Integer.valueOf(edtavHdr_Visible),Integer.valueOf(edtavHdr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(101),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCCStkUsu_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCStkUsu_Internalname,GXutil.rtrim( A3355CCStkUsu),GXutil.rtrim( localUtil.format( A3355CCStkUsu, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCCStkUsu_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtCCStkUsu_Columnclass,edtCCStkUsu_Columnheaderclass,Integer.valueOf(edtCCStkUsu_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(101),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCStkBar_Internalname,GXutil.ltrim( localUtil.ntoc( A3350CCStkBar, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3350CCStkBar), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCCStkBar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(101),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCStkReo_Internalname,GXutil.ltrim( localUtil.ntoc( A3351CCStkReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3351CCStkReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCCStkReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(101),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCStkPar_Internalname,GXutil.rtrim( A3352CCStkPar),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCCStkPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(101),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCStkLen_Internalname,GXutil.ltrim( localUtil.ntoc( A3358CCStkLen, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3358CCStkLen), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCCStkLen_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(101),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCCStkFec_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCStkFec_Internalname,localUtil.format(A3348CCStkFec, "99/99/99"),localUtil.format( A3348CCStkFec, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCCStkFec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtCCStkFec_Columnclass,edtCCStkFec_Columnheaderclass,Integer.valueOf(edtCCStkFec_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(101),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCCStkHor_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCStkHor_Internalname,GXutil.rtrim( A3356CCStkHor),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCCStkHor_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtCCStkHor_Columnclass,edtCCStkHor_Columnheaderclass,Integer.valueOf(edtCCStkHor_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(101),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes1SQ2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_101_idx = ((subGrid_Islastpage==1)&&(nGXsfl_101_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_101_idx+1) ;
         sGXsfl_101_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_101_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1012( ) ;
      }
      /* End function sendrow_1012 */
   }

   public void startgridcontrol101( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"101\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCCStkLin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavDiahora_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Dia Hora", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtTipMovCc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCCStkDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCcstkcane_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Entrada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCcstkcans_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Salida", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCCStkPre_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Precio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavExis_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Saldo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCCStkLot_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Lote", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavHdr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCCStkUsu_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCCStkFec_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCCStkHor_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hora", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV7AccionesGrupo, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( cmbavAccionesgrupo.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( cmbavAccionesgrupo.getColumnHeaderClass()));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3342CCStkLin, (byte)(12), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtCCStkLin_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtCCStkLin_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCCStkLin_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV19DiaHora));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavDiahora_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavDiahora_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDiahora_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavDiahora_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A3345TipMovCc));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtTipMovCc_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtTipMovCc_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtTipMovCc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A3357CCStkDsc));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtCCStkDsc_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtCCStkDsc_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCCStkDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV8CCStkCanE, (byte)(12), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavCcstkcane_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavCcstkcane_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCcstkcane_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCcstkcane_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV9CCStkCanS, (byte)(12), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavCcstkcans_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavCcstkcans_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCcstkcans_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCcstkcans_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3349CCStkPre, (byte)(14), (byte)(5), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtCCStkPre_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtCCStkPre_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCCStkPre_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV23Exis, (byte)(12), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavExis_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavExis_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavExis_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavExis_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5722CCStkLot));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtCCStkLot_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtCCStkLot_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCCStkLot_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV30Hdr));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavHdr_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavHdr_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHdr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavHdr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A3355CCStkUsu));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtCCStkUsu_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtCCStkUsu_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCCStkUsu_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3350CCStkBar, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3351CCStkReo, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A3352CCStkPar));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3358CCStkLen, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A3348CCStkFec, "99/99/99"));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtCCStkFec_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtCCStkFec_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCCStkFec_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A3356CCStkHor));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtCCStkHor_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtCCStkHor_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCCStkHor_Visible, (byte)(5), (byte)(0), ".", "")));
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
      edtCCStkLin_Internalname = sPrefix+"CCSTKLIN" ;
      edtavDiahora_Internalname = sPrefix+"vDIAHORA" ;
      edtTipMovCc_Internalname = sPrefix+"TIPMOVCC" ;
      edtCCStkDsc_Internalname = sPrefix+"CCSTKDSC" ;
      edtavCcstkcane_Internalname = sPrefix+"vCCSTKCANE" ;
      edtavCcstkcans_Internalname = sPrefix+"vCCSTKCANS" ;
      edtCCStkPre_Internalname = sPrefix+"CCSTKPRE" ;
      edtavExis_Internalname = sPrefix+"vEXIS" ;
      edtCCStkLot_Internalname = sPrefix+"CCSTKLOT" ;
      edtavHdr_Internalname = sPrefix+"vHDR" ;
      edtCCStkUsu_Internalname = sPrefix+"CCSTKUSU" ;
      edtCCStkBar_Internalname = sPrefix+"CCSTKBAR" ;
      edtCCStkReo_Internalname = sPrefix+"CCSTKREO" ;
      edtCCStkPar_Internalname = sPrefix+"CCSTKPAR" ;
      edtCCStkLen_Internalname = sPrefix+"CCSTKLEN" ;
      edtCCStkFec_Internalname = sPrefix+"CCSTKFEC" ;
      edtCCStkHor_Internalname = sPrefix+"CCSTKHOR" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      Dvelop_confirmpanel_eliminar_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR" ;
      tblTabledvelop_confirmpanel_eliminar_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_ELIMINAR" ;
      Dvelop_confirmpanel_btnauditar_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_BTNAUDITAR" ;
      tblTabledvelop_confirmpanel_btnauditar_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_BTNAUDITAR" ;
      Grid_titlescategories_Internalname = sPrefix+"GRID_TITLESCATEGORIES" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
      edtavDdo_ccstkfecauxdate_Internalname = sPrefix+"vDDO_CCSTKFECAUXDATE" ;
      divDdo_ccstkfecauxdates_Internalname = sPrefix+"DDO_CCSTKFECAUXDATES" ;
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
      edtCCStkHor_Jsonclick = "" ;
      edtCCStkHor_Columnclass = "WWColumn hidden-xs" ;
      edtCCStkFec_Jsonclick = "" ;
      edtCCStkFec_Columnclass = "WWColumn hidden-xs" ;
      edtCCStkLen_Jsonclick = "" ;
      edtCCStkPar_Jsonclick = "" ;
      edtCCStkReo_Jsonclick = "" ;
      edtCCStkBar_Jsonclick = "" ;
      edtCCStkUsu_Jsonclick = "" ;
      edtCCStkUsu_Columnclass = "WWColumn hidden-xs" ;
      edtavHdr_Jsonclick = "" ;
      edtavHdr_Columnclass = "WWColumn" ;
      edtavHdr_Enabled = 1 ;
      edtCCStkLot_Jsonclick = "" ;
      edtCCStkLot_Columnclass = "WWColumn hidden-xs" ;
      edtavExis_Jsonclick = "" ;
      edtavExis_Columnclass = "WWColumn" ;
      edtavExis_Enabled = 1 ;
      edtCCStkPre_Jsonclick = "" ;
      edtCCStkPre_Columnclass = "WWColumn hidden-xs" ;
      edtavCcstkcans_Jsonclick = "" ;
      edtavCcstkcans_Columnclass = "WWColumn" ;
      edtavCcstkcans_Enabled = 1 ;
      edtavCcstkcane_Jsonclick = "" ;
      edtavCcstkcane_Columnclass = "WWColumn" ;
      edtavCcstkcane_Enabled = 1 ;
      edtCCStkDsc_Jsonclick = "" ;
      edtCCStkDsc_Columnclass = "WWColumn hidden-xs" ;
      edtTipMovCc_Jsonclick = "" ;
      edtTipMovCc_Columnclass = "WWColumn hidden-xs" ;
      edtavDiahora_Jsonclick = "" ;
      edtavDiahora_Columnclass = "WWColumn" ;
      edtavDiahora_Enabled = 1 ;
      edtCCStkLin_Jsonclick = "" ;
      edtCCStkLin_Columnclass = "WWColumn hidden-xs" ;
      cmbavAccionesgrupo.setJsonclick( "" );
      cmbavAccionesgrupo.setVisible( -1 );
      cmbavAccionesgrupo.setEnabled( 1 );
      cmbavAccionesgrupo.setColumnClass( "WWActionGroupColumn" );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtCCStkHor_Columnheaderclass = "" ;
      edtCCStkFec_Columnheaderclass = "" ;
      edtCCStkUsu_Columnheaderclass = "" ;
      edtavHdr_Columnheaderclass = "" ;
      edtCCStkLot_Columnheaderclass = "" ;
      edtavExis_Columnheaderclass = "" ;
      edtCCStkPre_Columnheaderclass = "" ;
      edtavCcstkcans_Columnheaderclass = "" ;
      edtavCcstkcane_Columnheaderclass = "" ;
      edtCCStkDsc_Columnheaderclass = "" ;
      edtTipMovCc_Columnheaderclass = "" ;
      edtavDiahora_Columnheaderclass = "" ;
      edtCCStkLin_Columnheaderclass = "" ;
      cmbavAccionesgrupo.setColumnHeaderClass( "" );
      edtCCStkHor_Visible = -1 ;
      edtCCStkFec_Visible = -1 ;
      edtCCStkUsu_Visible = -1 ;
      edtavHdr_Visible = -1 ;
      edtCCStkLot_Visible = -1 ;
      edtavExis_Visible = -1 ;
      edtCCStkPre_Visible = -1 ;
      edtavCcstkcans_Visible = -1 ;
      edtavCcstkcane_Visible = -1 ;
      edtCCStkDsc_Visible = -1 ;
      edtTipMovCc_Visible = -1 ;
      edtavDiahora_Visible = -1 ;
      edtCCStkLin_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_ccstkfecauxdate_Jsonclick = "" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
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
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hascategories = GXutil.toBoolean( -1) ;
      Grid_titlescategories_Gridtitlescategories = ";;;;;Cantidad;Cantidad;;;;;;;;;;;" ;
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
      Ddo_grid_Datalistproc = "StocksQuimicos.UPQ_CuentaCorriente_t_WCGetFilterData" ;
      Ddo_grid_Datalisttype = "||Dynamic|Dynamic|||||Dynamic||Dynamic||Dynamic" ;
      Ddo_grid_Includedatalist = "||T|T|||||T||T||T" ;
      Ddo_grid_Filterisrange = "T||||||T||||||" ;
      Ddo_grid_Filtertype = "Numeric||Character|Character|||Numeric||Character||Character|Date|Character" ;
      Ddo_grid_Includefilter = "T||T|T|||T||T||T|T|T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T||T|T|||T||T||T|T|T" ;
      Ddo_grid_Columnssortvalues = "5||6|7|||8||9||10|3|4" ;
      Ddo_grid_Columnids = "1:CCStkLin|2:DiaHora|3:TipMovCc|4:CCStkDsc|5:CCStkCanE|6:CCStkCanS|7:CCStkPre|8:Exis|9:CCStkLot|10:Hdr|11:CCStkUsu|16:CCStkFec|17:CCStkHor" ;
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
      GXCCtl = "vACCIONESGRUPO_" + sGXsfl_101_idx ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV23Exis',fld:'vEXIS',pic:'ZZZZZZ9.9999',hsh:true},{av:'sPrefix'},{av:'AV34ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV12ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV25FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV20Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV43Prdnum',fld:'vPRDNUM',pic:''},{av:'AV10CCstkfecfrom',fld:'vCCSTKFECFROM',pic:''},{av:'AV11CCstkfecto',fld:'vCCSTKFECTO',pic:''},{av:'AV48TFCCStkLin',fld:'vTFCCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'AV49TFCCStkLin_To',fld:'vTFCCSTKLIN_TO',pic:'ZZZZZZZZZZZ9'},{av:'AV56TFTipMovCc',fld:'vTFTIPMOVCC',pic:''},{av:'AV57TFTipMovCc_Sel',fld:'vTFTIPMOVCC_SEL',pic:''},{av:'AV46TFCCStkDsc',fld:'vTFCCSTKDSC',pic:''},{av:'AV47TFCCStkDsc_Sel',fld:'vTFCCSTKDSC_SEL',pic:''},{av:'AV52TFCCStkPre',fld:'vTFCCSTKPRE',pic:'ZZZZZZZ9.999'},{av:'AV53TFCCStkPre_To',fld:'vTFCCSTKPRE_TO',pic:'ZZZZZZZ9.999'},{av:'AV50TFCCStkLot',fld:'vTFCCSTKLOT',pic:''},{av:'AV51TFCCStkLot_Sel',fld:'vTFCCSTKLOT_SEL',pic:''},{av:'AV54TFCCStkUsu',fld:'vTFCCSTKUSU',pic:'@!'},{av:'AV55TFCCStkUsu_Sel',fld:'vTFCCSTKUSU_SEL',pic:'@!'},{av:'AV69TFCCStkFec',fld:'vTFCCSTKFEC',pic:''},{av:'AV73TFCCStkHor',fld:'vTFCCSTKHOR',pic:''},{av:'AV74TFCCStkHor_Sel',fld:'vTFCCSTKHOR_SEL',pic:''},{av:'AV77Pgmname',fld:'vPGMNAME',pic:''},{av:'AV36OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV38OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV15Compras',fld:'vCOMPRAS',pic:'ZZZZZZ9.9999'},{av:'AV16Consumos',fld:'vCONSUMOS',pic:'ZZZZZZ9.9999'},{av:'AV18Devoluciones',fld:'vDEVOLUCIONES',pic:'ZZZZZZ9.9999'},{av:'AV44SaldoInicial',fld:'vSALDOINICIAL',pic:'ZZZZZZ9.9999'},{av:'AV24Existenciascuentacorriente',fld:'vEXISTENCIASCUENTACORRIENTE',pic:'ZZZZZZ9.9999'},{av:'AV41PrdExiAlm',fld:'vPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV40PrdCanres',fld:'vPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV42PrdNom',fld:'vPRDNOM',pic:''},{av:'AV62Actualizardatos',fld:'vACTUALIZARDATOS',pic:''},{av:'AV64PwdBo',fld:'vPWDBO',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A719PrdNum',fld:'PRDNUM',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV34ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV12ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCCStkLin_Visible',ctrl:'CCSTKLIN',prop:'Visible'},{av:'edtavDiahora_Visible',ctrl:'vDIAHORA',prop:'Visible'},{av:'edtTipMovCc_Visible',ctrl:'TIPMOVCC',prop:'Visible'},{av:'edtCCStkDsc_Visible',ctrl:'CCSTKDSC',prop:'Visible'},{av:'edtavCcstkcane_Visible',ctrl:'vCCSTKCANE',prop:'Visible'},{av:'edtavCcstkcans_Visible',ctrl:'vCCSTKCANS',prop:'Visible'},{av:'edtCCStkPre_Visible',ctrl:'CCSTKPRE',prop:'Visible'},{av:'edtavExis_Visible',ctrl:'vEXIS',prop:'Visible'},{av:'edtCCStkLot_Visible',ctrl:'CCSTKLOT',prop:'Visible'},{av:'edtavHdr_Visible',ctrl:'vHDR',prop:'Visible'},{av:'edtCCStkUsu_Visible',ctrl:'CCSTKUSU',prop:'Visible'},{av:'edtCCStkFec_Visible',ctrl:'CCSTKFEC',prop:'Visible'},{av:'edtCCStkHor_Visible',ctrl:'CCSTKHOR',prop:'Visible'},{av:'AV26GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV27GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavAccionesgrupo'},{av:'edtCCStkLin_Columnheaderclass',ctrl:'CCSTKLIN',prop:'Columnheaderclass'},{av:'edtavDiahora_Columnheaderclass',ctrl:'vDIAHORA',prop:'Columnheaderclass'},{av:'edtTipMovCc_Columnheaderclass',ctrl:'TIPMOVCC',prop:'Columnheaderclass'},{av:'edtCCStkDsc_Columnheaderclass',ctrl:'CCSTKDSC',prop:'Columnheaderclass'},{av:'edtavCcstkcane_Columnheaderclass',ctrl:'vCCSTKCANE',prop:'Columnheaderclass'},{av:'edtavCcstkcans_Columnheaderclass',ctrl:'vCCSTKCANS',prop:'Columnheaderclass'},{av:'edtCCStkPre_Columnheaderclass',ctrl:'CCSTKPRE',prop:'Columnheaderclass'},{av:'edtavExis_Columnheaderclass',ctrl:'vEXIS',prop:'Columnheaderclass'},{av:'edtCCStkLot_Columnheaderclass',ctrl:'CCSTKLOT',prop:'Columnheaderclass'},{av:'edtavHdr_Columnheaderclass',ctrl:'vHDR',prop:'Columnheaderclass'},{av:'edtCCStkUsu_Columnheaderclass',ctrl:'CCSTKUSU',prop:'Columnheaderclass'},{av:'edtCCStkFec_Columnheaderclass',ctrl:'CCSTKFEC',prop:'Columnheaderclass'},{av:'edtCCStkHor_Columnheaderclass',ctrl:'CCSTKHOR',prop:'Columnheaderclass'},{av:'AV33ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV28GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e131SQ2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV25FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV20Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV43Prdnum',fld:'vPRDNUM',pic:''},{av:'AV10CCstkfecfrom',fld:'vCCSTKFECFROM',pic:''},{av:'AV11CCstkfecto',fld:'vCCSTKFECTO',pic:''},{av:'AV34ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV12ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV48TFCCStkLin',fld:'vTFCCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'AV49TFCCStkLin_To',fld:'vTFCCSTKLIN_TO',pic:'ZZZZZZZZZZZ9'},{av:'AV56TFTipMovCc',fld:'vTFTIPMOVCC',pic:''},{av:'AV57TFTipMovCc_Sel',fld:'vTFTIPMOVCC_SEL',pic:''},{av:'AV46TFCCStkDsc',fld:'vTFCCSTKDSC',pic:''},{av:'AV47TFCCStkDsc_Sel',fld:'vTFCCSTKDSC_SEL',pic:''},{av:'AV52TFCCStkPre',fld:'vTFCCSTKPRE',pic:'ZZZZZZZ9.999'},{av:'AV53TFCCStkPre_To',fld:'vTFCCSTKPRE_TO',pic:'ZZZZZZZ9.999'},{av:'AV50TFCCStkLot',fld:'vTFCCSTKLOT',pic:''},{av:'AV51TFCCStkLot_Sel',fld:'vTFCCSTKLOT_SEL',pic:''},{av:'AV54TFCCStkUsu',fld:'vTFCCSTKUSU',pic:'@!'},{av:'AV55TFCCStkUsu_Sel',fld:'vTFCCSTKUSU_SEL',pic:'@!'},{av:'AV69TFCCStkFec',fld:'vTFCCSTKFEC',pic:''},{av:'AV73TFCCStkHor',fld:'vTFCCSTKHOR',pic:''},{av:'AV74TFCCStkHor_Sel',fld:'vTFCCSTKHOR_SEL',pic:''},{av:'AV77Pgmname',fld:'vPGMNAME',pic:''},{av:'AV36OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV38OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV15Compras',fld:'vCOMPRAS',pic:'ZZZZZZ9.9999'},{av:'AV16Consumos',fld:'vCONSUMOS',pic:'ZZZZZZ9.9999'},{av:'AV18Devoluciones',fld:'vDEVOLUCIONES',pic:'ZZZZZZ9.9999'},{av:'AV44SaldoInicial',fld:'vSALDOINICIAL',pic:'ZZZZZZ9.9999'},{av:'AV24Existenciascuentacorriente',fld:'vEXISTENCIASCUENTACORRIENTE',pic:'ZZZZZZ9.9999'},{av:'AV41PrdExiAlm',fld:'vPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV40PrdCanres',fld:'vPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV42PrdNom',fld:'vPRDNOM',pic:''},{av:'AV23Exis',fld:'vEXIS',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV62Actualizardatos',fld:'vACTUALIZARDATOS',pic:''},{av:'AV64PwdBo',fld:'vPWDBO',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A719PrdNum',fld:'PRDNUM',pic:'',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e141SQ2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV25FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV20Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV43Prdnum',fld:'vPRDNUM',pic:''},{av:'AV10CCstkfecfrom',fld:'vCCSTKFECFROM',pic:''},{av:'AV11CCstkfecto',fld:'vCCSTKFECTO',pic:''},{av:'AV34ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV12ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV48TFCCStkLin',fld:'vTFCCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'AV49TFCCStkLin_To',fld:'vTFCCSTKLIN_TO',pic:'ZZZZZZZZZZZ9'},{av:'AV56TFTipMovCc',fld:'vTFTIPMOVCC',pic:''},{av:'AV57TFTipMovCc_Sel',fld:'vTFTIPMOVCC_SEL',pic:''},{av:'AV46TFCCStkDsc',fld:'vTFCCSTKDSC',pic:''},{av:'AV47TFCCStkDsc_Sel',fld:'vTFCCSTKDSC_SEL',pic:''},{av:'AV52TFCCStkPre',fld:'vTFCCSTKPRE',pic:'ZZZZZZZ9.999'},{av:'AV53TFCCStkPre_To',fld:'vTFCCSTKPRE_TO',pic:'ZZZZZZZ9.999'},{av:'AV50TFCCStkLot',fld:'vTFCCSTKLOT',pic:''},{av:'AV51TFCCStkLot_Sel',fld:'vTFCCSTKLOT_SEL',pic:''},{av:'AV54TFCCStkUsu',fld:'vTFCCSTKUSU',pic:'@!'},{av:'AV55TFCCStkUsu_Sel',fld:'vTFCCSTKUSU_SEL',pic:'@!'},{av:'AV69TFCCStkFec',fld:'vTFCCSTKFEC',pic:''},{av:'AV73TFCCStkHor',fld:'vTFCCSTKHOR',pic:''},{av:'AV74TFCCStkHor_Sel',fld:'vTFCCSTKHOR_SEL',pic:''},{av:'AV77Pgmname',fld:'vPGMNAME',pic:''},{av:'AV36OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV38OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV15Compras',fld:'vCOMPRAS',pic:'ZZZZZZ9.9999'},{av:'AV16Consumos',fld:'vCONSUMOS',pic:'ZZZZZZ9.9999'},{av:'AV18Devoluciones',fld:'vDEVOLUCIONES',pic:'ZZZZZZ9.9999'},{av:'AV44SaldoInicial',fld:'vSALDOINICIAL',pic:'ZZZZZZ9.9999'},{av:'AV24Existenciascuentacorriente',fld:'vEXISTENCIASCUENTACORRIENTE',pic:'ZZZZZZ9.9999'},{av:'AV41PrdExiAlm',fld:'vPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV40PrdCanres',fld:'vPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV42PrdNom',fld:'vPRDNOM',pic:''},{av:'AV23Exis',fld:'vEXIS',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV62Actualizardatos',fld:'vACTUALIZARDATOS',pic:''},{av:'AV64PwdBo',fld:'vPWDBO',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A719PrdNum',fld:'PRDNUM',pic:'',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e151SQ2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV25FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV20Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV43Prdnum',fld:'vPRDNUM',pic:''},{av:'AV10CCstkfecfrom',fld:'vCCSTKFECFROM',pic:''},{av:'AV11CCstkfecto',fld:'vCCSTKFECTO',pic:''},{av:'AV34ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV12ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV48TFCCStkLin',fld:'vTFCCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'AV49TFCCStkLin_To',fld:'vTFCCSTKLIN_TO',pic:'ZZZZZZZZZZZ9'},{av:'AV56TFTipMovCc',fld:'vTFTIPMOVCC',pic:''},{av:'AV57TFTipMovCc_Sel',fld:'vTFTIPMOVCC_SEL',pic:''},{av:'AV46TFCCStkDsc',fld:'vTFCCSTKDSC',pic:''},{av:'AV47TFCCStkDsc_Sel',fld:'vTFCCSTKDSC_SEL',pic:''},{av:'AV52TFCCStkPre',fld:'vTFCCSTKPRE',pic:'ZZZZZZZ9.999'},{av:'AV53TFCCStkPre_To',fld:'vTFCCSTKPRE_TO',pic:'ZZZZZZZ9.999'},{av:'AV50TFCCStkLot',fld:'vTFCCSTKLOT',pic:''},{av:'AV51TFCCStkLot_Sel',fld:'vTFCCSTKLOT_SEL',pic:''},{av:'AV54TFCCStkUsu',fld:'vTFCCSTKUSU',pic:'@!'},{av:'AV55TFCCStkUsu_Sel',fld:'vTFCCSTKUSU_SEL',pic:'@!'},{av:'AV69TFCCStkFec',fld:'vTFCCSTKFEC',pic:''},{av:'AV73TFCCStkHor',fld:'vTFCCSTKHOR',pic:''},{av:'AV74TFCCStkHor_Sel',fld:'vTFCCSTKHOR_SEL',pic:''},{av:'AV77Pgmname',fld:'vPGMNAME',pic:''},{av:'AV36OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV38OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV15Compras',fld:'vCOMPRAS',pic:'ZZZZZZ9.9999'},{av:'AV16Consumos',fld:'vCONSUMOS',pic:'ZZZZZZ9.9999'},{av:'AV18Devoluciones',fld:'vDEVOLUCIONES',pic:'ZZZZZZ9.9999'},{av:'AV44SaldoInicial',fld:'vSALDOINICIAL',pic:'ZZZZZZ9.9999'},{av:'AV24Existenciascuentacorriente',fld:'vEXISTENCIASCUENTACORRIENTE',pic:'ZZZZZZ9.9999'},{av:'AV41PrdExiAlm',fld:'vPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV40PrdCanres',fld:'vPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV42PrdNom',fld:'vPRDNOM',pic:''},{av:'AV23Exis',fld:'vEXIS',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV62Actualizardatos',fld:'vACTUALIZARDATOS',pic:''},{av:'AV64PwdBo',fld:'vPWDBO',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A719PrdNum',fld:'PRDNUM',pic:'',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV36OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV38OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV73TFCCStkHor',fld:'vTFCCSTKHOR',pic:''},{av:'AV74TFCCStkHor_Sel',fld:'vTFCCSTKHOR_SEL',pic:''},{av:'AV69TFCCStkFec',fld:'vTFCCSTKFEC',pic:''},{av:'AV54TFCCStkUsu',fld:'vTFCCSTKUSU',pic:'@!'},{av:'AV55TFCCStkUsu_Sel',fld:'vTFCCSTKUSU_SEL',pic:'@!'},{av:'AV50TFCCStkLot',fld:'vTFCCSTKLOT',pic:''},{av:'AV51TFCCStkLot_Sel',fld:'vTFCCSTKLOT_SEL',pic:''},{av:'AV52TFCCStkPre',fld:'vTFCCSTKPRE',pic:'ZZZZZZZ9.999'},{av:'AV53TFCCStkPre_To',fld:'vTFCCSTKPRE_TO',pic:'ZZZZZZZ9.999'},{av:'AV46TFCCStkDsc',fld:'vTFCCSTKDSC',pic:''},{av:'AV47TFCCStkDsc_Sel',fld:'vTFCCSTKDSC_SEL',pic:''},{av:'AV56TFTipMovCc',fld:'vTFTIPMOVCC',pic:''},{av:'AV57TFTipMovCc_Sel',fld:'vTFTIPMOVCC_SEL',pic:''},{av:'AV48TFCCStkLin',fld:'vTFCCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'AV49TFCCStkLin_To',fld:'vTFCCSTKLIN_TO',pic:'ZZZZZZZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e211SQ2',iparms:[{av:'A3348CCStkFec',fld:'CCSTKFEC',pic:''},{av:'A3356CCStkHor',fld:'CCSTKHOR',pic:''},{av:'A3345TipMovCc',fld:'TIPMOVCC',pic:''},{av:'A3343CCStkCanE',fld:'CCSTKCANE',pic:'ZZZZZZ9.9999'},{av:'A3344CCStkCanS',fld:'CCSTKCANS',pic:'ZZZZZZ9.9999'},{av:'AV23Exis',fld:'vEXIS',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV20Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV43Prdnum',fld:'vPRDNUM',pic:''},{av:'A3350CCStkBar',fld:'CCSTKBAR',pic:'ZZZZZZZ9'},{av:'A3351CCStkReo',fld:'CCSTKREO',pic:'9'},{av:'A3352CCStkPar',fld:'CCSTKPAR',pic:''}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavAccionesgrupo'},{av:'AV7AccionesGrupo',fld:'vACCIONESGRUPO',pic:'ZZZ9'},{av:'AV19DiaHora',fld:'vDIAHORA',pic:''},{av:'AV8CCStkCanE',fld:'vCCSTKCANE',pic:'ZZZZZZ9.9999'},{av:'AV9CCStkCanS',fld:'vCCSTKCANS',pic:'ZZZZZZ9.9999'},{av:'AV23Exis',fld:'vEXIS',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV30Hdr',fld:'vHDR',pic:''},{av:'edtCCStkLin_Columnclass',ctrl:'CCSTKLIN',prop:'Columnclass'},{av:'edtavDiahora_Columnclass',ctrl:'vDIAHORA',prop:'Columnclass'},{av:'edtTipMovCc_Columnclass',ctrl:'TIPMOVCC',prop:'Columnclass'},{av:'edtCCStkDsc_Columnclass',ctrl:'CCSTKDSC',prop:'Columnclass'},{av:'edtavCcstkcane_Columnclass',ctrl:'vCCSTKCANE',prop:'Columnclass'},{av:'edtavCcstkcans_Columnclass',ctrl:'vCCSTKCANS',prop:'Columnclass'},{av:'edtCCStkPre_Columnclass',ctrl:'CCSTKPRE',prop:'Columnclass'},{av:'edtavExis_Columnclass',ctrl:'vEXIS',prop:'Columnclass'},{av:'edtCCStkLot_Columnclass',ctrl:'CCSTKLOT',prop:'Columnclass'},{av:'edtavHdr_Columnclass',ctrl:'vHDR',prop:'Columnclass'},{av:'edtCCStkUsu_Columnclass',ctrl:'CCSTKUSU',prop:'Columnclass'},{av:'edtCCStkFec_Columnclass',ctrl:'CCSTKFEC',prop:'Columnclass'},{av:'edtCCStkHor_Columnclass',ctrl:'CCSTKHOR',prop:'Columnclass'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e161SQ2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV25FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV20Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV43Prdnum',fld:'vPRDNUM',pic:''},{av:'AV10CCstkfecfrom',fld:'vCCSTKFECFROM',pic:''},{av:'AV11CCstkfecto',fld:'vCCSTKFECTO',pic:''},{av:'AV34ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV12ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV48TFCCStkLin',fld:'vTFCCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'AV49TFCCStkLin_To',fld:'vTFCCSTKLIN_TO',pic:'ZZZZZZZZZZZ9'},{av:'AV56TFTipMovCc',fld:'vTFTIPMOVCC',pic:''},{av:'AV57TFTipMovCc_Sel',fld:'vTFTIPMOVCC_SEL',pic:''},{av:'AV46TFCCStkDsc',fld:'vTFCCSTKDSC',pic:''},{av:'AV47TFCCStkDsc_Sel',fld:'vTFCCSTKDSC_SEL',pic:''},{av:'AV52TFCCStkPre',fld:'vTFCCSTKPRE',pic:'ZZZZZZZ9.999'},{av:'AV53TFCCStkPre_To',fld:'vTFCCSTKPRE_TO',pic:'ZZZZZZZ9.999'},{av:'AV50TFCCStkLot',fld:'vTFCCSTKLOT',pic:''},{av:'AV51TFCCStkLot_Sel',fld:'vTFCCSTKLOT_SEL',pic:''},{av:'AV54TFCCStkUsu',fld:'vTFCCSTKUSU',pic:'@!'},{av:'AV55TFCCStkUsu_Sel',fld:'vTFCCSTKUSU_SEL',pic:'@!'},{av:'AV69TFCCStkFec',fld:'vTFCCSTKFEC',pic:''},{av:'AV73TFCCStkHor',fld:'vTFCCSTKHOR',pic:''},{av:'AV74TFCCStkHor_Sel',fld:'vTFCCSTKHOR_SEL',pic:''},{av:'AV77Pgmname',fld:'vPGMNAME',pic:''},{av:'AV36OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV38OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV15Compras',fld:'vCOMPRAS',pic:'ZZZZZZ9.9999'},{av:'AV16Consumos',fld:'vCONSUMOS',pic:'ZZZZZZ9.9999'},{av:'AV18Devoluciones',fld:'vDEVOLUCIONES',pic:'ZZZZZZ9.9999'},{av:'AV44SaldoInicial',fld:'vSALDOINICIAL',pic:'ZZZZZZ9.9999'},{av:'AV24Existenciascuentacorriente',fld:'vEXISTENCIASCUENTACORRIENTE',pic:'ZZZZZZ9.9999'},{av:'AV41PrdExiAlm',fld:'vPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV40PrdCanres',fld:'vPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV42PrdNom',fld:'vPRDNOM',pic:''},{av:'AV23Exis',fld:'vEXIS',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV62Actualizardatos',fld:'vACTUALIZARDATOS',pic:''},{av:'AV64PwdBo',fld:'vPWDBO',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A719PrdNum',fld:'PRDNUM',pic:'',hsh:true},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV12ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV34ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtCCStkLin_Visible',ctrl:'CCSTKLIN',prop:'Visible'},{av:'edtavDiahora_Visible',ctrl:'vDIAHORA',prop:'Visible'},{av:'edtTipMovCc_Visible',ctrl:'TIPMOVCC',prop:'Visible'},{av:'edtCCStkDsc_Visible',ctrl:'CCSTKDSC',prop:'Visible'},{av:'edtavCcstkcane_Visible',ctrl:'vCCSTKCANE',prop:'Visible'},{av:'edtavCcstkcans_Visible',ctrl:'vCCSTKCANS',prop:'Visible'},{av:'edtCCStkPre_Visible',ctrl:'CCSTKPRE',prop:'Visible'},{av:'edtavExis_Visible',ctrl:'vEXIS',prop:'Visible'},{av:'edtCCStkLot_Visible',ctrl:'CCSTKLOT',prop:'Visible'},{av:'edtavHdr_Visible',ctrl:'vHDR',prop:'Visible'},{av:'edtCCStkUsu_Visible',ctrl:'CCSTKUSU',prop:'Visible'},{av:'edtCCStkFec_Visible',ctrl:'CCSTKFEC',prop:'Visible'},{av:'edtCCStkHor_Visible',ctrl:'CCSTKHOR',prop:'Visible'},{av:'AV26GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV27GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavAccionesgrupo'},{av:'edtCCStkLin_Columnheaderclass',ctrl:'CCSTKLIN',prop:'Columnheaderclass'},{av:'edtavDiahora_Columnheaderclass',ctrl:'vDIAHORA',prop:'Columnheaderclass'},{av:'edtTipMovCc_Columnheaderclass',ctrl:'TIPMOVCC',prop:'Columnheaderclass'},{av:'edtCCStkDsc_Columnheaderclass',ctrl:'CCSTKDSC',prop:'Columnheaderclass'},{av:'edtavCcstkcane_Columnheaderclass',ctrl:'vCCSTKCANE',prop:'Columnheaderclass'},{av:'edtavCcstkcans_Columnheaderclass',ctrl:'vCCSTKCANS',prop:'Columnheaderclass'},{av:'edtCCStkPre_Columnheaderclass',ctrl:'CCSTKPRE',prop:'Columnheaderclass'},{av:'edtavExis_Columnheaderclass',ctrl:'vEXIS',prop:'Columnheaderclass'},{av:'edtCCStkLot_Columnheaderclass',ctrl:'CCSTKLOT',prop:'Columnheaderclass'},{av:'edtavHdr_Columnheaderclass',ctrl:'vHDR',prop:'Columnheaderclass'},{av:'edtCCStkUsu_Columnheaderclass',ctrl:'CCSTKUSU',prop:'Columnheaderclass'},{av:'edtCCStkFec_Columnheaderclass',ctrl:'CCSTKFEC',prop:'Columnheaderclass'},{av:'edtCCStkHor_Columnheaderclass',ctrl:'CCSTKHOR',prop:'Columnheaderclass'},{av:'AV33ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV28GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e121SQ2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV25FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV20Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV43Prdnum',fld:'vPRDNUM',pic:''},{av:'AV10CCstkfecfrom',fld:'vCCSTKFECFROM',pic:''},{av:'AV11CCstkfecto',fld:'vCCSTKFECTO',pic:''},{av:'AV34ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV12ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV48TFCCStkLin',fld:'vTFCCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'AV49TFCCStkLin_To',fld:'vTFCCSTKLIN_TO',pic:'ZZZZZZZZZZZ9'},{av:'AV56TFTipMovCc',fld:'vTFTIPMOVCC',pic:''},{av:'AV57TFTipMovCc_Sel',fld:'vTFTIPMOVCC_SEL',pic:''},{av:'AV46TFCCStkDsc',fld:'vTFCCSTKDSC',pic:''},{av:'AV47TFCCStkDsc_Sel',fld:'vTFCCSTKDSC_SEL',pic:''},{av:'AV52TFCCStkPre',fld:'vTFCCSTKPRE',pic:'ZZZZZZZ9.999'},{av:'AV53TFCCStkPre_To',fld:'vTFCCSTKPRE_TO',pic:'ZZZZZZZ9.999'},{av:'AV50TFCCStkLot',fld:'vTFCCSTKLOT',pic:''},{av:'AV51TFCCStkLot_Sel',fld:'vTFCCSTKLOT_SEL',pic:''},{av:'AV54TFCCStkUsu',fld:'vTFCCSTKUSU',pic:'@!'},{av:'AV55TFCCStkUsu_Sel',fld:'vTFCCSTKUSU_SEL',pic:'@!'},{av:'AV69TFCCStkFec',fld:'vTFCCSTKFEC',pic:''},{av:'AV73TFCCStkHor',fld:'vTFCCSTKHOR',pic:''},{av:'AV74TFCCStkHor_Sel',fld:'vTFCCSTKHOR_SEL',pic:''},{av:'AV77Pgmname',fld:'vPGMNAME',pic:''},{av:'AV36OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV38OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV15Compras',fld:'vCOMPRAS',pic:'ZZZZZZ9.9999'},{av:'AV16Consumos',fld:'vCONSUMOS',pic:'ZZZZZZ9.9999'},{av:'AV18Devoluciones',fld:'vDEVOLUCIONES',pic:'ZZZZZZ9.9999'},{av:'AV44SaldoInicial',fld:'vSALDOINICIAL',pic:'ZZZZZZ9.9999'},{av:'AV24Existenciascuentacorriente',fld:'vEXISTENCIASCUENTACORRIENTE',pic:'ZZZZZZ9.9999'},{av:'AV41PrdExiAlm',fld:'vPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV40PrdCanres',fld:'vPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV42PrdNom',fld:'vPRDNOM',pic:''},{av:'AV23Exis',fld:'vEXIS',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV62Actualizardatos',fld:'vACTUALIZARDATOS',pic:''},{av:'AV64PwdBo',fld:'vPWDBO',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A719PrdNum',fld:'PRDNUM',pic:'',hsh:true},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV28GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV34ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV28GridState',fld:'vGRIDSTATE',pic:''},{av:'AV36OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV38OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV25FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV48TFCCStkLin',fld:'vTFCCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'AV49TFCCStkLin_To',fld:'vTFCCSTKLIN_TO',pic:'ZZZZZZZZZZZ9'},{av:'AV56TFTipMovCc',fld:'vTFTIPMOVCC',pic:''},{av:'AV57TFTipMovCc_Sel',fld:'vTFTIPMOVCC_SEL',pic:''},{av:'AV46TFCCStkDsc',fld:'vTFCCSTKDSC',pic:''},{av:'AV47TFCCStkDsc_Sel',fld:'vTFCCSTKDSC_SEL',pic:''},{av:'AV52TFCCStkPre',fld:'vTFCCSTKPRE',pic:'ZZZZZZZ9.999'},{av:'AV53TFCCStkPre_To',fld:'vTFCCSTKPRE_TO',pic:'ZZZZZZZ9.999'},{av:'AV50TFCCStkLot',fld:'vTFCCSTKLOT',pic:''},{av:'AV51TFCCStkLot_Sel',fld:'vTFCCSTKLOT_SEL',pic:''},{av:'AV54TFCCStkUsu',fld:'vTFCCSTKUSU',pic:'@!'},{av:'AV55TFCCStkUsu_Sel',fld:'vTFCCSTKUSU_SEL',pic:'@!'},{av:'AV69TFCCStkFec',fld:'vTFCCSTKFEC',pic:''},{av:'AV73TFCCStkHor',fld:'vTFCCSTKHOR',pic:''},{av:'AV74TFCCStkHor_Sel',fld:'vTFCCSTKHOR_SEL',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV12ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCCStkLin_Visible',ctrl:'CCSTKLIN',prop:'Visible'},{av:'edtavDiahora_Visible',ctrl:'vDIAHORA',prop:'Visible'},{av:'edtTipMovCc_Visible',ctrl:'TIPMOVCC',prop:'Visible'},{av:'edtCCStkDsc_Visible',ctrl:'CCSTKDSC',prop:'Visible'},{av:'edtavCcstkcane_Visible',ctrl:'vCCSTKCANE',prop:'Visible'},{av:'edtavCcstkcans_Visible',ctrl:'vCCSTKCANS',prop:'Visible'},{av:'edtCCStkPre_Visible',ctrl:'CCSTKPRE',prop:'Visible'},{av:'edtavExis_Visible',ctrl:'vEXIS',prop:'Visible'},{av:'edtCCStkLot_Visible',ctrl:'CCSTKLOT',prop:'Visible'},{av:'edtavHdr_Visible',ctrl:'vHDR',prop:'Visible'},{av:'edtCCStkUsu_Visible',ctrl:'CCSTKUSU',prop:'Visible'},{av:'edtCCStkFec_Visible',ctrl:'CCSTKFEC',prop:'Visible'},{av:'edtCCStkHor_Visible',ctrl:'CCSTKHOR',prop:'Visible'},{av:'AV26GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV27GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavAccionesgrupo'},{av:'edtCCStkLin_Columnheaderclass',ctrl:'CCSTKLIN',prop:'Columnheaderclass'},{av:'edtavDiahora_Columnheaderclass',ctrl:'vDIAHORA',prop:'Columnheaderclass'},{av:'edtTipMovCc_Columnheaderclass',ctrl:'TIPMOVCC',prop:'Columnheaderclass'},{av:'edtCCStkDsc_Columnheaderclass',ctrl:'CCSTKDSC',prop:'Columnheaderclass'},{av:'edtavCcstkcane_Columnheaderclass',ctrl:'vCCSTKCANE',prop:'Columnheaderclass'},{av:'edtavCcstkcans_Columnheaderclass',ctrl:'vCCSTKCANS',prop:'Columnheaderclass'},{av:'edtCCStkPre_Columnheaderclass',ctrl:'CCSTKPRE',prop:'Columnheaderclass'},{av:'edtavExis_Columnheaderclass',ctrl:'vEXIS',prop:'Columnheaderclass'},{av:'edtCCStkLot_Columnheaderclass',ctrl:'CCSTKLOT',prop:'Columnheaderclass'},{av:'edtavHdr_Columnheaderclass',ctrl:'vHDR',prop:'Columnheaderclass'},{av:'edtCCStkUsu_Columnheaderclass',ctrl:'CCSTKUSU',prop:'Columnheaderclass'},{av:'edtCCStkFec_Columnheaderclass',ctrl:'CCSTKFEC',prop:'Columnheaderclass'},{av:'edtCCStkHor_Columnheaderclass',ctrl:'CCSTKHOR',prop:'Columnheaderclass'},{av:'AV33ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VACCIONESGRUPO.CLICK","{handler:'e221SQ2',iparms:[{av:'cmbavAccionesgrupo'},{av:'AV7AccionesGrupo',fld:'vACCIONESGRUPO',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A719PrdNum',fld:'PRDNUM',pic:'',hsh:true},{av:'A3342CCStkLin',fld:'CCSTKLIN',pic:'ZZZZZZZZZZZ9',hsh:true}]");
      setEventMetadata("VACCIONESGRUPO.CLICK",",oparms:[{av:'cmbavAccionesgrupo'},{av:'AV7AccionesGrupo',fld:'vACCIONESGRUPO',pic:'ZZZ9'}]}");
      setEventMetadata("'DOAUDITAR'","{handler:'e111SQ1',iparms:[]");
      setEventMetadata("'DOAUDITAR'",",oparms:[]}");
      setEventMetadata("'DOEXPORT'","{handler:'e171SQ2',iparms:[]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e181SQ2',iparms:[]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Ccstkhor',iparms:[]");
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
      wcpOAV20Emprcod = "" ;
      wcpOAV43Prdnum = "" ;
      wcpOAV10CCstkfecfrom = GXutil.nullDate() ;
      wcpOAV11CCstkfecto = GXutil.nullDate() ;
      wcpOAV15Compras = DecimalUtil.ZERO ;
      wcpOAV16Consumos = DecimalUtil.ZERO ;
      wcpOAV18Devoluciones = DecimalUtil.ZERO ;
      wcpOAV44SaldoInicial = DecimalUtil.ZERO ;
      wcpOAV24Existenciascuentacorriente = DecimalUtil.ZERO ;
      wcpOAV41PrdExiAlm = DecimalUtil.ZERO ;
      wcpOAV40PrdCanres = DecimalUtil.ZERO ;
      wcpOAV42PrdNom = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      Dvelop_confirmpanel_eliminar_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV20Emprcod = "" ;
      AV43Prdnum = "" ;
      AV10CCstkfecfrom = GXutil.nullDate() ;
      AV11CCstkfecto = GXutil.nullDate() ;
      AV15Compras = DecimalUtil.ZERO ;
      AV16Consumos = DecimalUtil.ZERO ;
      AV18Devoluciones = DecimalUtil.ZERO ;
      AV44SaldoInicial = DecimalUtil.ZERO ;
      AV24Existenciascuentacorriente = DecimalUtil.ZERO ;
      AV41PrdExiAlm = DecimalUtil.ZERO ;
      AV40PrdCanres = DecimalUtil.ZERO ;
      AV42PrdNom = "" ;
      AV23Exis = DecimalUtil.ZERO ;
      AV25FilterFullText = "" ;
      AV12ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV56TFTipMovCc = "" ;
      AV57TFTipMovCc_Sel = "" ;
      AV46TFCCStkDsc = "" ;
      AV47TFCCStkDsc_Sel = "" ;
      AV52TFCCStkPre = DecimalUtil.ZERO ;
      AV53TFCCStkPre_To = DecimalUtil.ZERO ;
      AV50TFCCStkLot = "" ;
      AV51TFCCStkLot_Sel = "" ;
      AV54TFCCStkUsu = "" ;
      AV55TFCCStkUsu_Sel = "" ;
      AV69TFCCStkFec = GXutil.nullDate() ;
      AV73TFCCStkHor = "" ;
      AV74TFCCStkHor_Sel = "" ;
      AV77Pgmname = "" ;
      AV62Actualizardatos = "" ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV33ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV17DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A3343CCStkCanE = DecimalUtil.ZERO ;
      A3344CCStkCanS = DecimalUtil.ZERO ;
      AV28GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV97Emprcod_selected = "" ;
      AV98Prdnum_selected = "" ;
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
      ucDvpanel_informacion = new com.genexus.webpanels.GXUserControl();
      AV5SaldoInicialaFecha = "" ;
      AV63ExistenciasDif = DecimalUtil.ZERO ;
      bttBtnauditar_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_titlescategories = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV71DDO_CCStkFecAuxDate = GXutil.nullDate() ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV19DiaHora = "" ;
      A3345TipMovCc = "" ;
      A3357CCStkDsc = "" ;
      AV8CCStkCanE = DecimalUtil.ZERO ;
      AV9CCStkCanS = DecimalUtil.ZERO ;
      A3349CCStkPre = DecimalUtil.ZERO ;
      A5722CCStkLot = "" ;
      AV30Hdr = "" ;
      A3355CCStkUsu = "" ;
      A3352CCStkPar = "" ;
      A3348CCStkFec = GXutil.nullDate() ;
      A3356CCStkHor = "" ;
      scmdbuf = "" ;
      lV81Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = "" ;
      lV84Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc = "" ;
      lV86Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc = "" ;
      lV90Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot = "" ;
      lV92Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu = "" ;
      lV95Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor = "" ;
      AV81Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = "" ;
      AV85Stocksquimicos_upq_cuentacorriente_t_wcds_5_tftipmovcc_sel = "" ;
      AV84Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc = "" ;
      AV87Stocksquimicos_upq_cuentacorriente_t_wcds_7_tfccstkdsc_sel = "" ;
      AV86Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc = "" ;
      AV88Stocksquimicos_upq_cuentacorriente_t_wcds_8_tfccstkpre = DecimalUtil.ZERO ;
      AV89Stocksquimicos_upq_cuentacorriente_t_wcds_9_tfccstkpre_to = DecimalUtil.ZERO ;
      AV91Stocksquimicos_upq_cuentacorriente_t_wcds_11_tfccstklot_sel = "" ;
      AV90Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot = "" ;
      AV93Stocksquimicos_upq_cuentacorriente_t_wcds_13_tfccstkusu_sel = "" ;
      AV92Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu = "" ;
      AV94Stocksquimicos_upq_cuentacorriente_t_wcds_14_tfccstkfec = GXutil.nullDate() ;
      AV96Stocksquimicos_upq_cuentacorriente_t_wcds_16_tfccstkhor_sel = "" ;
      AV95Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor = "" ;
      H01SQ2_A3343CCStkCanE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01SQ2_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01SQ2_A396EmprCod = new String[] {""} ;
      H01SQ2_A719PrdNum = new String[] {""} ;
      H01SQ2_A3356CCStkHor = new String[] {""} ;
      H01SQ2_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      H01SQ2_A3358CCStkLen = new short[1] ;
      H01SQ2_A3352CCStkPar = new String[] {""} ;
      H01SQ2_A3351CCStkReo = new byte[1] ;
      H01SQ2_A3350CCStkBar = new int[1] ;
      H01SQ2_A3355CCStkUsu = new String[] {""} ;
      H01SQ2_A5722CCStkLot = new String[] {""} ;
      H01SQ2_A3349CCStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01SQ2_A3357CCStkDsc = new String[] {""} ;
      H01SQ2_A3345TipMovCc = new String[] {""} ;
      H01SQ2_A3342CCStkLin = new long[1] ;
      H01SQ3_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV6WebSession = httpContext.getWebSession();
      GXv_int4 = new long[1] ;
      AV67Siacumular = "" ;
      GXv_int6 = new byte[1] ;
      AV78Station = "" ;
      AV79Emprnom = "" ;
      AV80Usurcod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV61WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext11 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV45Session = httpContext.getWebSession();
      AV14ColumnsSelectorXML = "" ;
      GXt_decimal12 = DecimalUtil.ZERO ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV35ManageFiltersXml = "" ;
      AV22ExcelFilename = "" ;
      AV21ErrorMessage = "" ;
      AV60UserCustomValue = "" ;
      AV13ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector14 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector15 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item16 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item17 = new GXBaseCollection[1] ;
      AV29GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char22 = "" ;
      GXv_char23 = new String[1] ;
      GXt_char20 = "" ;
      GXv_char21 = new String[1] ;
      GXt_char19 = "" ;
      GXv_char8 = new String[1] ;
      GXt_char18 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char7 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState24 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV58TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV31HTTPRequest = httpContext.getHttpRequest();
      ucDvelop_confirmpanel_btnauditar = new com.genexus.webpanels.GXUserControl();
      ucDvelop_confirmpanel_eliminar = new com.genexus.webpanels.GXUserControl();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV20Emprcod = "" ;
      sCtrlAV43Prdnum = "" ;
      sCtrlAV10CCstkfecfrom = "" ;
      sCtrlAV11CCstkfecto = "" ;
      sCtrlAV15Compras = "" ;
      sCtrlAV16Consumos = "" ;
      sCtrlAV18Devoluciones = "" ;
      sCtrlAV44SaldoInicial = "" ;
      sCtrlAV24Existenciascuentacorriente = "" ;
      sCtrlAV41PrdExiAlm = "" ;
      sCtrlAV40PrdCanres = "" ;
      sCtrlAV42PrdNom = "" ;
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.upq_cuentacorriente_t_wc__default(),
         new Object[] {
             new Object[] {
            H01SQ2_A3343CCStkCanE, H01SQ2_A3344CCStkCanS, H01SQ2_A396EmprCod, H01SQ2_A719PrdNum, H01SQ2_A3356CCStkHor, H01SQ2_A3348CCStkFec, H01SQ2_A3358CCStkLen, H01SQ2_A3352CCStkPar, H01SQ2_A3351CCStkReo, H01SQ2_A3350CCStkBar,
            H01SQ2_A3355CCStkUsu, H01SQ2_A5722CCStkLot, H01SQ2_A3349CCStkPre, H01SQ2_A3357CCStkDsc, H01SQ2_A3345TipMovCc, H01SQ2_A3342CCStkLin
            }
            , new Object[] {
            H01SQ3_AGRID_nRecordCount
            }
         }
      );
      AV77Pgmname = "StocksQuimicos.UPQ_CuentaCorriente_t_WC" ;
      /* GeneXus formulas. */
      AV77Pgmname = "StocksQuimicos.UPQ_CuentaCorriente_t_WC" ;
      Gx_err = (short)(0) ;
      edtavSaldoinicialafecha_Enabled = 0 ;
      edtavExistenciascuentacorriente_Enabled = 0 ;
      edtavPrdexialm_Enabled = 0 ;
      edtavExistenciasdif_Enabled = 0 ;
      chkavPwdbo.setEnabled( 0 );
      edtavCompras_Enabled = 0 ;
      edtavConsumos_Enabled = 0 ;
      edtavDevoluciones_Enabled = 0 ;
      edtavDiahora_Enabled = 0 ;
      edtavCcstkcane_Enabled = 0 ;
      edtavCcstkcans_Enabled = 0 ;
      edtavExis_Enabled = 0 ;
      edtavHdr_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV34ManageFiltersExecutionStep ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte A3351CCStkReo ;
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
   private short AV36OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV7AccionesGrupo ;
   private short A3358CCStkLen ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV65Password ;
   private short AV66Cotexsur ;
   private short AV68EntSalInv ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_101 ;
   private int nGXsfl_101_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavSaldoinicialafecha_Enabled ;
   private int edtavExistenciascuentacorriente_Enabled ;
   private int edtavPrdexialm_Enabled ;
   private int edtavExistenciasdif_Enabled ;
   private int edtavCompras_Enabled ;
   private int edtavConsumos_Enabled ;
   private int edtavDevoluciones_Enabled ;
   private int edtavPgmname_Enabled ;
   private int A3350CCStkBar ;
   private int subGrid_Islastpage ;
   private int edtavDiahora_Enabled ;
   private int edtavCcstkcane_Enabled ;
   private int edtavCcstkcans_Enabled ;
   private int edtavExis_Enabled ;
   private int edtavHdr_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int edtCCStkLin_Visible ;
   private int edtavDiahora_Visible ;
   private int edtTipMovCc_Visible ;
   private int edtCCStkDsc_Visible ;
   private int edtavCcstkcane_Visible ;
   private int edtavCcstkcans_Visible ;
   private int edtCCStkPre_Visible ;
   private int edtavExis_Visible ;
   private int edtCCStkLot_Visible ;
   private int edtavHdr_Visible ;
   private int edtCCStkUsu_Visible ;
   private int edtCCStkFec_Visible ;
   private int edtCCStkHor_Visible ;
   private int AV39PageToGo ;
   private int AV100GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV48TFCCStkLin ;
   private long AV49TFCCStkLin_To ;
   private long AV26GridCurrentPage ;
   private long AV27GridPageCount ;
   private long AV99Ccstklin_selected ;
   private long A3342CCStkLin ;
   private long GRID_nCurrentRecord ;
   private long AV82Stocksquimicos_upq_cuentacorriente_t_wcds_2_tfccstklin ;
   private long AV83Stocksquimicos_upq_cuentacorriente_t_wcds_3_tfccstklin_to ;
   private long GRID_nRecordCount ;
   private long GXt_int1 ;
   private long GXv_int4[] ;
   private java.math.BigDecimal wcpOAV15Compras ;
   private java.math.BigDecimal wcpOAV16Consumos ;
   private java.math.BigDecimal wcpOAV18Devoluciones ;
   private java.math.BigDecimal wcpOAV44SaldoInicial ;
   private java.math.BigDecimal wcpOAV24Existenciascuentacorriente ;
   private java.math.BigDecimal wcpOAV41PrdExiAlm ;
   private java.math.BigDecimal wcpOAV40PrdCanres ;
   private java.math.BigDecimal AV15Compras ;
   private java.math.BigDecimal AV16Consumos ;
   private java.math.BigDecimal AV18Devoluciones ;
   private java.math.BigDecimal AV44SaldoInicial ;
   private java.math.BigDecimal AV24Existenciascuentacorriente ;
   private java.math.BigDecimal AV41PrdExiAlm ;
   private java.math.BigDecimal AV40PrdCanres ;
   private java.math.BigDecimal AV23Exis ;
   private java.math.BigDecimal AV52TFCCStkPre ;
   private java.math.BigDecimal AV53TFCCStkPre_To ;
   private java.math.BigDecimal A3343CCStkCanE ;
   private java.math.BigDecimal A3344CCStkCanS ;
   private java.math.BigDecimal AV63ExistenciasDif ;
   private java.math.BigDecimal AV8CCStkCanE ;
   private java.math.BigDecimal AV9CCStkCanS ;
   private java.math.BigDecimal A3349CCStkPre ;
   private java.math.BigDecimal AV88Stocksquimicos_upq_cuentacorriente_t_wcds_8_tfccstkpre ;
   private java.math.BigDecimal AV89Stocksquimicos_upq_cuentacorriente_t_wcds_9_tfccstkpre_to ;
   private java.math.BigDecimal GXt_decimal12 ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private String wcpOAV20Emprcod ;
   private String wcpOAV43Prdnum ;
   private String wcpOAV42PrdNom ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String Dvelop_confirmpanel_eliminar_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV20Emprcod ;
   private String AV43Prdnum ;
   private String AV42PrdNom ;
   private String sGXsfl_101_idx="0001" ;
   private String AV56TFTipMovCc ;
   private String AV57TFTipMovCc_Sel ;
   private String AV46TFCCStkDsc ;
   private String AV47TFCCStkDsc_Sel ;
   private String AV50TFCCStkLot ;
   private String AV51TFCCStkLot_Sel ;
   private String AV54TFCCStkUsu ;
   private String AV55TFCCStkUsu_Sel ;
   private String AV73TFCCStkHor ;
   private String AV74TFCCStkHor_Sel ;
   private String AV77Pgmname ;
   private String AV62Actualizardatos ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV97Emprcod_selected ;
   private String AV98Prdnum_selected ;
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
   private String Ddo_grid_Datalistproc ;
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
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_titlescategories_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_ccstkfecauxdates_Internalname ;
   private String edtavDdo_ccstkfecauxdate_Internalname ;
   private String edtavDdo_ccstkfecauxdate_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtCCStkLin_Internalname ;
   private String AV19DiaHora ;
   private String edtavDiahora_Internalname ;
   private String A3345TipMovCc ;
   private String edtTipMovCc_Internalname ;
   private String A3357CCStkDsc ;
   private String edtCCStkDsc_Internalname ;
   private String edtavCcstkcane_Internalname ;
   private String edtavCcstkcans_Internalname ;
   private String edtCCStkPre_Internalname ;
   private String edtavExis_Internalname ;
   private String A5722CCStkLot ;
   private String edtCCStkLot_Internalname ;
   private String AV30Hdr ;
   private String edtavHdr_Internalname ;
   private String A3355CCStkUsu ;
   private String edtCCStkUsu_Internalname ;
   private String edtCCStkBar_Internalname ;
   private String edtCCStkReo_Internalname ;
   private String A3352CCStkPar ;
   private String edtCCStkPar_Internalname ;
   private String edtCCStkLen_Internalname ;
   private String edtCCStkFec_Internalname ;
   private String A3356CCStkHor ;
   private String edtCCStkHor_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String scmdbuf ;
   private String lV84Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc ;
   private String lV86Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc ;
   private String lV90Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot ;
   private String lV92Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu ;
   private String lV95Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor ;
   private String AV85Stocksquimicos_upq_cuentacorriente_t_wcds_5_tftipmovcc_sel ;
   private String AV84Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc ;
   private String AV87Stocksquimicos_upq_cuentacorriente_t_wcds_7_tfccstkdsc_sel ;
   private String AV86Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc ;
   private String AV91Stocksquimicos_upq_cuentacorriente_t_wcds_11_tfccstklot_sel ;
   private String AV90Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot ;
   private String AV93Stocksquimicos_upq_cuentacorriente_t_wcds_13_tfccstkusu_sel ;
   private String AV92Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu ;
   private String AV96Stocksquimicos_upq_cuentacorriente_t_wcds_16_tfccstkhor_sel ;
   private String AV95Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor ;
   private String hsh ;
   private String AV67Siacumular ;
   private String AV78Station ;
   private String AV79Emprnom ;
   private String AV80Usurcod ;
   private String edtCCStkLin_Columnheaderclass ;
   private String edtavDiahora_Columnheaderclass ;
   private String edtTipMovCc_Columnheaderclass ;
   private String edtCCStkDsc_Columnheaderclass ;
   private String edtavCcstkcane_Columnheaderclass ;
   private String edtavCcstkcans_Columnheaderclass ;
   private String edtCCStkPre_Columnheaderclass ;
   private String edtavExis_Columnheaderclass ;
   private String edtCCStkLot_Columnheaderclass ;
   private String edtavHdr_Columnheaderclass ;
   private String edtCCStkUsu_Columnheaderclass ;
   private String edtCCStkFec_Columnheaderclass ;
   private String edtCCStkHor_Columnheaderclass ;
   private String edtCCStkLin_Columnclass ;
   private String edtavDiahora_Columnclass ;
   private String edtTipMovCc_Columnclass ;
   private String edtCCStkDsc_Columnclass ;
   private String edtavCcstkcane_Columnclass ;
   private String edtavCcstkcans_Columnclass ;
   private String edtCCStkPre_Columnclass ;
   private String edtavExis_Columnclass ;
   private String edtCCStkLot_Columnclass ;
   private String edtavHdr_Columnclass ;
   private String edtCCStkUsu_Columnclass ;
   private String edtCCStkFec_Columnclass ;
   private String edtCCStkHor_Columnclass ;
   private String GXt_char22 ;
   private String GXv_char23[] ;
   private String GXt_char20 ;
   private String GXv_char21[] ;
   private String GXt_char19 ;
   private String GXv_char8[] ;
   private String GXt_char18 ;
   private String GXv_char3[] ;
   private String GXt_char7 ;
   private String GXv_char2[] ;
   private String tblTabledvelop_confirmpanel_btnauditar_Internalname ;
   private String Dvelop_confirmpanel_btnauditar_Internalname ;
   private String tblTabledvelop_confirmpanel_eliminar_Internalname ;
   private String Dvelop_confirmpanel_eliminar_Internalname ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV20Emprcod ;
   private String sCtrlAV43Prdnum ;
   private String sCtrlAV10CCstkfecfrom ;
   private String sCtrlAV11CCstkfecto ;
   private String sCtrlAV15Compras ;
   private String sCtrlAV16Consumos ;
   private String sCtrlAV18Devoluciones ;
   private String sCtrlAV44SaldoInicial ;
   private String sCtrlAV24Existenciascuentacorriente ;
   private String sCtrlAV41PrdExiAlm ;
   private String sCtrlAV40PrdCanres ;
   private String sCtrlAV42PrdNom ;
   private String sGXsfl_101_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtCCStkLin_Jsonclick ;
   private String edtavDiahora_Jsonclick ;
   private String edtTipMovCc_Jsonclick ;
   private String edtCCStkDsc_Jsonclick ;
   private String edtavCcstkcane_Jsonclick ;
   private String edtavCcstkcans_Jsonclick ;
   private String edtCCStkPre_Jsonclick ;
   private String edtavExis_Jsonclick ;
   private String edtCCStkLot_Jsonclick ;
   private String edtavHdr_Jsonclick ;
   private String edtCCStkUsu_Jsonclick ;
   private String edtCCStkBar_Jsonclick ;
   private String edtCCStkReo_Jsonclick ;
   private String edtCCStkPar_Jsonclick ;
   private String edtCCStkLen_Jsonclick ;
   private String edtCCStkFec_Jsonclick ;
   private String edtCCStkHor_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV10CCstkfecfrom ;
   private java.util.Date wcpOAV11CCstkfecto ;
   private java.util.Date AV10CCstkfecfrom ;
   private java.util.Date AV11CCstkfecto ;
   private java.util.Date AV69TFCCStkFec ;
   private java.util.Date AV71DDO_CCStkFecAuxDate ;
   private java.util.Date A3348CCStkFec ;
   private java.util.Date AV94Stocksquimicos_upq_cuentacorriente_t_wcds_14_tfccstkfec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV38OrderedDsc ;
   private boolean AV64PwdBo ;
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
   private boolean Gridpaginationbar_Showfirst ;
   private boolean Gridpaginationbar_Showprevious ;
   private boolean Gridpaginationbar_Shownext ;
   private boolean Gridpaginationbar_Showlast ;
   private boolean Gridpaginationbar_Rowsperpageselector ;
   private boolean Grid_empowerer_Hascategories ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean Grid_empowerer_Hascolumnsselector ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_101_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV14ColumnsSelectorXML ;
   private String AV35ManageFiltersXml ;
   private String AV60UserCustomValue ;
   private String AV25FilterFullText ;
   private String AV5SaldoInicialaFecha ;
   private String lV81Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext ;
   private String AV81Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext ;
   private String AV22ExcelFilename ;
   private String AV21ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV31HTTPRequest ;
   private com.genexus.webpanels.WebSession AV45Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_informacion ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_titlescategories ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_btnauditar ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminar ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkavActualizardatos ;
   private ICheckbox chkavPwdbo ;
   private HTMLChoice cmbavAccionesgrupo ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] H01SQ2_A3343CCStkCanE ;
   private java.math.BigDecimal[] H01SQ2_A3344CCStkCanS ;
   private String[] H01SQ2_A396EmprCod ;
   private String[] H01SQ2_A719PrdNum ;
   private String[] H01SQ2_A3356CCStkHor ;
   private java.util.Date[] H01SQ2_A3348CCStkFec ;
   private short[] H01SQ2_A3358CCStkLen ;
   private String[] H01SQ2_A3352CCStkPar ;
   private byte[] H01SQ2_A3351CCStkReo ;
   private int[] H01SQ2_A3350CCStkBar ;
   private String[] H01SQ2_A3355CCStkUsu ;
   private String[] H01SQ2_A5722CCStkLot ;
   private java.math.BigDecimal[] H01SQ2_A3349CCStkPre ;
   private String[] H01SQ2_A3357CCStkDsc ;
   private String[] H01SQ2_A3345TipMovCc ;
   private long[] H01SQ2_A3342CCStkLin ;
   private long[] H01SQ3_AGRID_nRecordCount ;
   private com.genexus.webpanels.WebSession AV6WebSession ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV33ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item16 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item17[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV12ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV13ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector14[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector15[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV17DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV28GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState24[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV29GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV58TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV61WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext11[] ;
}

final  class upq_cuentacorriente_t_wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01SQ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV81Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext ,
                                          long AV82Stocksquimicos_upq_cuentacorriente_t_wcds_2_tfccstklin ,
                                          long AV83Stocksquimicos_upq_cuentacorriente_t_wcds_3_tfccstklin_to ,
                                          String AV85Stocksquimicos_upq_cuentacorriente_t_wcds_5_tftipmovcc_sel ,
                                          String AV84Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc ,
                                          String AV87Stocksquimicos_upq_cuentacorriente_t_wcds_7_tfccstkdsc_sel ,
                                          String AV86Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc ,
                                          java.math.BigDecimal AV88Stocksquimicos_upq_cuentacorriente_t_wcds_8_tfccstkpre ,
                                          java.math.BigDecimal AV89Stocksquimicos_upq_cuentacorriente_t_wcds_9_tfccstkpre_to ,
                                          String AV91Stocksquimicos_upq_cuentacorriente_t_wcds_11_tfccstklot_sel ,
                                          String AV90Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot ,
                                          String AV93Stocksquimicos_upq_cuentacorriente_t_wcds_13_tfccstkusu_sel ,
                                          String AV92Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu ,
                                          java.util.Date AV94Stocksquimicos_upq_cuentacorriente_t_wcds_14_tfccstkfec ,
                                          String AV96Stocksquimicos_upq_cuentacorriente_t_wcds_16_tfccstkhor_sel ,
                                          String AV95Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor ,
                                          java.util.Date AV10CCstkfecfrom ,
                                          java.util.Date AV11CCstkfecto ,
                                          long A3342CCStkLin ,
                                          String A3345TipMovCc ,
                                          String A3357CCStkDsc ,
                                          java.math.BigDecimal A3349CCStkPre ,
                                          String A5722CCStkLot ,
                                          String A3355CCStkUsu ,
                                          String A3356CCStkHor ,
                                          java.util.Date A3348CCStkFec ,
                                          short AV36OrderedBy ,
                                          boolean AV38OrderedDsc ,
                                          String AV20Emprcod ,
                                          String AV43Prdnum ,
                                          String A396EmprCod ,
                                          String A719PrdNum )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int25 = new byte[31];
      Object[] GXv_Object26 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " CCStkCanE, CCStkCanS, EmprCod, PrdNum, CCStkHor, CCStkFec, CCStkLen, CCStkPar, CCStkReo, CCStkBar, CCStkUsu, CCStkLot, CCStkPre, CCStkDsc, TipMovCc, CCStkLin" ;
      sFromString = " FROM TXPCCSTKS" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(EmprCod = ? and PrdNum = ?)");
      addWhere(sWhereString, "(TipMovCc <> 'EC')");
      if ( ! (GXutil.strcmp("", AV81Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(CCStkLin,'999999999990'), 2) like '%' || ?) or ( UPPER(TipMovCc) like '%' || UPPER(?)) or ( UPPER(CCStkDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(CCStkPre,'99999990.99999'), 2) like '%' || ?) or ( UPPER(CCStkLot) like '%' || UPPER(?)) or ( UPPER(CCStkUsu) like '%' || UPPER(?)) or ( UPPER(CCStkHor) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int25[2] = (byte)(1) ;
         GXv_int25[3] = (byte)(1) ;
         GXv_int25[4] = (byte)(1) ;
         GXv_int25[5] = (byte)(1) ;
         GXv_int25[6] = (byte)(1) ;
         GXv_int25[7] = (byte)(1) ;
         GXv_int25[8] = (byte)(1) ;
      }
      if ( ! (0==AV82Stocksquimicos_upq_cuentacorriente_t_wcds_2_tfccstklin) )
      {
         addWhere(sWhereString, "(CCStkLin >= ?)");
      }
      else
      {
         GXv_int25[9] = (byte)(1) ;
      }
      if ( ! (0==AV83Stocksquimicos_upq_cuentacorriente_t_wcds_3_tfccstklin_to) )
      {
         addWhere(sWhereString, "(CCStkLin <= ?)");
      }
      else
      {
         GXv_int25[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Stocksquimicos_upq_cuentacorriente_t_wcds_5_tftipmovcc_sel)==0) && ( ! (GXutil.strcmp("", AV84Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(TipMovCc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Stocksquimicos_upq_cuentacorriente_t_wcds_5_tftipmovcc_sel)==0) )
      {
         addWhere(sWhereString, "(TipMovCc = ?)");
      }
      else
      {
         GXv_int25[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Stocksquimicos_upq_cuentacorriente_t_wcds_7_tfccstkdsc_sel)==0) && ( ! (GXutil.strcmp("", AV86Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCStkDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Stocksquimicos_upq_cuentacorriente_t_wcds_7_tfccstkdsc_sel)==0) )
      {
         addWhere(sWhereString, "(CCStkDsc = ?)");
      }
      else
      {
         GXv_int25[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Stocksquimicos_upq_cuentacorriente_t_wcds_8_tfccstkpre)==0) )
      {
         addWhere(sWhereString, "(CCStkPre >= ?)");
      }
      else
      {
         GXv_int25[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Stocksquimicos_upq_cuentacorriente_t_wcds_9_tfccstkpre_to)==0) )
      {
         addWhere(sWhereString, "(CCStkPre <= ?)");
      }
      else
      {
         GXv_int25[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Stocksquimicos_upq_cuentacorriente_t_wcds_11_tfccstklot_sel)==0) && ( ! (GXutil.strcmp("", AV90Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCStkLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Stocksquimicos_upq_cuentacorriente_t_wcds_11_tfccstklot_sel)==0) )
      {
         addWhere(sWhereString, "(CCStkLot = ?)");
      }
      else
      {
         GXv_int25[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Stocksquimicos_upq_cuentacorriente_t_wcds_13_tfccstkusu_sel)==0) && ( ! (GXutil.strcmp("", AV92Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCStkUsu) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Stocksquimicos_upq_cuentacorriente_t_wcds_13_tfccstkusu_sel)==0) )
      {
         addWhere(sWhereString, "(CCStkUsu = ?)");
      }
      else
      {
         GXv_int25[20] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV94Stocksquimicos_upq_cuentacorriente_t_wcds_14_tfccstkfec)) )
      {
         addWhere(sWhereString, "(CCStkFec >= ?)");
      }
      else
      {
         GXv_int25[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Stocksquimicos_upq_cuentacorriente_t_wcds_16_tfccstkhor_sel)==0) && ( ! (GXutil.strcmp("", AV95Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCStkHor) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Stocksquimicos_upq_cuentacorriente_t_wcds_16_tfccstkhor_sel)==0) )
      {
         addWhere(sWhereString, "(CCStkHor = ?)");
      }
      else
      {
         GXv_int25[23] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV10CCstkfecfrom)) )
      {
         addWhere(sWhereString, "(CCStkFec >= ?)");
      }
      else
      {
         GXv_int25[24] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV11CCstkfecto)) )
      {
         addWhere(sWhereString, "(CCStkFec <= ?)");
      }
      else
      {
         GXv_int25[25] = (byte)(1) ;
      }
      if ( AV36OrderedBy == 1 )
      {
         sOrderString += " ORDER BY EmprCod" ;
      }
      else if ( AV36OrderedBy == 2 )
      {
         sOrderString += " ORDER BY PrdNum" ;
      }
      else if ( ( AV36OrderedBy == 3 ) && ! AV38OrderedDsc )
      {
         sOrderString += " ORDER BY CCStkFec" ;
      }
      else if ( ( AV36OrderedBy == 3 ) && ( AV38OrderedDsc ) )
      {
         sOrderString += " ORDER BY CCStkFec DESC" ;
      }
      else if ( ( AV36OrderedBy == 4 ) && ! AV38OrderedDsc )
      {
         sOrderString += " ORDER BY CCStkHor" ;
      }
      else if ( ( AV36OrderedBy == 4 ) && ( AV38OrderedDsc ) )
      {
         sOrderString += " ORDER BY CCStkHor DESC" ;
      }
      else if ( ( AV36OrderedBy == 5 ) && ! AV38OrderedDsc )
      {
         sOrderString += " ORDER BY CCStkLin" ;
      }
      else if ( ( AV36OrderedBy == 5 ) && ( AV38OrderedDsc ) )
      {
         sOrderString += " ORDER BY CCStkLin DESC" ;
      }
      else if ( ( AV36OrderedBy == 6 ) && ! AV38OrderedDsc )
      {
         sOrderString += " ORDER BY TipMovCc" ;
      }
      else if ( ( AV36OrderedBy == 6 ) && ( AV38OrderedDsc ) )
      {
         sOrderString += " ORDER BY TipMovCc DESC" ;
      }
      else if ( ( AV36OrderedBy == 7 ) && ! AV38OrderedDsc )
      {
         sOrderString += " ORDER BY CCStkDsc" ;
      }
      else if ( ( AV36OrderedBy == 7 ) && ( AV38OrderedDsc ) )
      {
         sOrderString += " ORDER BY CCStkDsc DESC" ;
      }
      else if ( ( AV36OrderedBy == 8 ) && ! AV38OrderedDsc )
      {
         sOrderString += " ORDER BY CCStkPre" ;
      }
      else if ( ( AV36OrderedBy == 8 ) && ( AV38OrderedDsc ) )
      {
         sOrderString += " ORDER BY CCStkPre DESC" ;
      }
      else if ( ( AV36OrderedBy == 9 ) && ! AV38OrderedDsc )
      {
         sOrderString += " ORDER BY CCStkLot" ;
      }
      else if ( ( AV36OrderedBy == 9 ) && ( AV38OrderedDsc ) )
      {
         sOrderString += " ORDER BY CCStkLot DESC" ;
      }
      else if ( ( AV36OrderedBy == 10 ) && ! AV38OrderedDsc )
      {
         sOrderString += " ORDER BY CCStkUsu" ;
      }
      else if ( ( AV36OrderedBy == 10 ) && ( AV38OrderedDsc ) )
      {
         sOrderString += " ORDER BY CCStkUsu DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY EmprCod, PrdNum, CCStkLin" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object26[0] = scmdbuf ;
      GXv_Object26[1] = GXv_int25 ;
      return GXv_Object26 ;
   }

   protected Object[] conditional_H01SQ3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV81Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext ,
                                          long AV82Stocksquimicos_upq_cuentacorriente_t_wcds_2_tfccstklin ,
                                          long AV83Stocksquimicos_upq_cuentacorriente_t_wcds_3_tfccstklin_to ,
                                          String AV85Stocksquimicos_upq_cuentacorriente_t_wcds_5_tftipmovcc_sel ,
                                          String AV84Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc ,
                                          String AV87Stocksquimicos_upq_cuentacorriente_t_wcds_7_tfccstkdsc_sel ,
                                          String AV86Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc ,
                                          java.math.BigDecimal AV88Stocksquimicos_upq_cuentacorriente_t_wcds_8_tfccstkpre ,
                                          java.math.BigDecimal AV89Stocksquimicos_upq_cuentacorriente_t_wcds_9_tfccstkpre_to ,
                                          String AV91Stocksquimicos_upq_cuentacorriente_t_wcds_11_tfccstklot_sel ,
                                          String AV90Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot ,
                                          String AV93Stocksquimicos_upq_cuentacorriente_t_wcds_13_tfccstkusu_sel ,
                                          String AV92Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu ,
                                          java.util.Date AV94Stocksquimicos_upq_cuentacorriente_t_wcds_14_tfccstkfec ,
                                          String AV96Stocksquimicos_upq_cuentacorriente_t_wcds_16_tfccstkhor_sel ,
                                          String AV95Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor ,
                                          java.util.Date AV10CCstkfecfrom ,
                                          java.util.Date AV11CCstkfecto ,
                                          long A3342CCStkLin ,
                                          String A3345TipMovCc ,
                                          String A3357CCStkDsc ,
                                          java.math.BigDecimal A3349CCStkPre ,
                                          String A5722CCStkLot ,
                                          String A3355CCStkUsu ,
                                          String A3356CCStkHor ,
                                          java.util.Date A3348CCStkFec ,
                                          short AV36OrderedBy ,
                                          boolean AV38OrderedDsc ,
                                          String AV20Emprcod ,
                                          String AV43Prdnum ,
                                          String A396EmprCod ,
                                          String A719PrdNum )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int27 = new byte[26];
      Object[] GXv_Object28 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM TXPCCSTKS" ;
      addWhere(sWhereString, "(EmprCod = ? and PrdNum = ?)");
      addWhere(sWhereString, "(TipMovCc <> 'EC')");
      if ( ! (GXutil.strcmp("", AV81Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(CCStkLin,'999999999990'), 2) like '%' || ?) or ( UPPER(TipMovCc) like '%' || UPPER(?)) or ( UPPER(CCStkDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(CCStkPre,'99999990.99999'), 2) like '%' || ?) or ( UPPER(CCStkLot) like '%' || UPPER(?)) or ( UPPER(CCStkUsu) like '%' || UPPER(?)) or ( UPPER(CCStkHor) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int27[2] = (byte)(1) ;
         GXv_int27[3] = (byte)(1) ;
         GXv_int27[4] = (byte)(1) ;
         GXv_int27[5] = (byte)(1) ;
         GXv_int27[6] = (byte)(1) ;
         GXv_int27[7] = (byte)(1) ;
         GXv_int27[8] = (byte)(1) ;
      }
      if ( ! (0==AV82Stocksquimicos_upq_cuentacorriente_t_wcds_2_tfccstklin) )
      {
         addWhere(sWhereString, "(CCStkLin >= ?)");
      }
      else
      {
         GXv_int27[9] = (byte)(1) ;
      }
      if ( ! (0==AV83Stocksquimicos_upq_cuentacorriente_t_wcds_3_tfccstklin_to) )
      {
         addWhere(sWhereString, "(CCStkLin <= ?)");
      }
      else
      {
         GXv_int27[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Stocksquimicos_upq_cuentacorriente_t_wcds_5_tftipmovcc_sel)==0) && ( ! (GXutil.strcmp("", AV84Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(TipMovCc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Stocksquimicos_upq_cuentacorriente_t_wcds_5_tftipmovcc_sel)==0) )
      {
         addWhere(sWhereString, "(TipMovCc = ?)");
      }
      else
      {
         GXv_int27[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Stocksquimicos_upq_cuentacorriente_t_wcds_7_tfccstkdsc_sel)==0) && ( ! (GXutil.strcmp("", AV86Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCStkDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Stocksquimicos_upq_cuentacorriente_t_wcds_7_tfccstkdsc_sel)==0) )
      {
         addWhere(sWhereString, "(CCStkDsc = ?)");
      }
      else
      {
         GXv_int27[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Stocksquimicos_upq_cuentacorriente_t_wcds_8_tfccstkpre)==0) )
      {
         addWhere(sWhereString, "(CCStkPre >= ?)");
      }
      else
      {
         GXv_int27[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Stocksquimicos_upq_cuentacorriente_t_wcds_9_tfccstkpre_to)==0) )
      {
         addWhere(sWhereString, "(CCStkPre <= ?)");
      }
      else
      {
         GXv_int27[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Stocksquimicos_upq_cuentacorriente_t_wcds_11_tfccstklot_sel)==0) && ( ! (GXutil.strcmp("", AV90Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCStkLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Stocksquimicos_upq_cuentacorriente_t_wcds_11_tfccstklot_sel)==0) )
      {
         addWhere(sWhereString, "(CCStkLot = ?)");
      }
      else
      {
         GXv_int27[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Stocksquimicos_upq_cuentacorriente_t_wcds_13_tfccstkusu_sel)==0) && ( ! (GXutil.strcmp("", AV92Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCStkUsu) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Stocksquimicos_upq_cuentacorriente_t_wcds_13_tfccstkusu_sel)==0) )
      {
         addWhere(sWhereString, "(CCStkUsu = ?)");
      }
      else
      {
         GXv_int27[20] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV94Stocksquimicos_upq_cuentacorriente_t_wcds_14_tfccstkfec)) )
      {
         addWhere(sWhereString, "(CCStkFec >= ?)");
      }
      else
      {
         GXv_int27[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Stocksquimicos_upq_cuentacorriente_t_wcds_16_tfccstkhor_sel)==0) && ( ! (GXutil.strcmp("", AV95Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCStkHor) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Stocksquimicos_upq_cuentacorriente_t_wcds_16_tfccstkhor_sel)==0) )
      {
         addWhere(sWhereString, "(CCStkHor = ?)");
      }
      else
      {
         GXv_int27[23] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV10CCstkfecfrom)) )
      {
         addWhere(sWhereString, "(CCStkFec >= ?)");
      }
      else
      {
         GXv_int27[24] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV11CCstkfecto)) )
      {
         addWhere(sWhereString, "(CCStkFec <= ?)");
      }
      else
      {
         GXv_int27[25] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV36OrderedBy == 1 )
      {
         scmdbuf += "" ;
      }
      else if ( AV36OrderedBy == 2 )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV36OrderedBy == 3 ) && ! AV38OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV36OrderedBy == 3 ) && ( AV38OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV36OrderedBy == 4 ) && ! AV38OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV36OrderedBy == 4 ) && ( AV38OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV36OrderedBy == 5 ) && ! AV38OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV36OrderedBy == 5 ) && ( AV38OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV36OrderedBy == 6 ) && ! AV38OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV36OrderedBy == 6 ) && ( AV38OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV36OrderedBy == 7 ) && ! AV38OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV36OrderedBy == 7 ) && ( AV38OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV36OrderedBy == 8 ) && ! AV38OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV36OrderedBy == 8 ) && ( AV38OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV36OrderedBy == 9 ) && ! AV38OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV36OrderedBy == 9 ) && ( AV38OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV36OrderedBy == 10 ) && ! AV38OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV36OrderedBy == 10 ) && ( AV38OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object28[0] = scmdbuf ;
      GXv_Object28[1] = GXv_int27 ;
      return GXv_Object28 ;
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
                  return conditional_H01SQ2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).longValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (java.util.Date)dynConstraints[17] , ((Number) dynConstraints[18]).longValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.util.Date)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Boolean) dynConstraints[27]).booleanValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] );
            case 1 :
                  return conditional_H01SQ3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).longValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (java.util.Date)dynConstraints[17] , ((Number) dynConstraints[18]).longValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.util.Date)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Boolean) dynConstraints[27]).booleanValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01SQ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01SQ3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 8);
               ((String[]) buf[11])[0] = rslt.getString(12, 26);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,5);
               ((String[]) buf[13])[0] = rslt.getString(14, 30);
               ((String[]) buf[14])[0] = rslt.getString(15, 2);
               ((long[]) buf[15])[0] = rslt.getLong(16);
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
                  stmt.setString(sIdx, (String)parms[31], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[40]).longValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[41]).longValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 5);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 5);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[52]);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 8);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[55]);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[56]);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[35]).longValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[36]).longValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 5);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 5);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[47]);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 8);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[50]);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[51]);
               }
               return;
      }
   }

}

