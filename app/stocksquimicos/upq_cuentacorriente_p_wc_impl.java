package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class upq_cuentacorriente_p_wc_impl extends GXWebComponent
{
   public upq_cuentacorriente_p_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public upq_cuentacorriente_p_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( upq_cuentacorriente_p_wc_impl.class ));
   }

   public upq_cuentacorriente_p_wc_impl( int remoteHandle ,
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
      chkavIsauthorized = UIFactory.getCheckbox(this);
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( nGotPars == 0 )
         {
            entryPointCalled = false ;
            gxfirstwebparm = httpContext.GetFirstPar( "emprcod") ;
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
               AV39emprcod = httpContext.GetPar( "emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39emprcod", AV39emprcod);
               AV61PrdnumIN = httpContext.GetPar( "PrdnumIN") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61PrdnumIN", AV61PrdnumIN);
               AV82CCstkfecfrom = localUtil.parseDateParm( httpContext.GetPar( "CCstkfecfrom")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82CCstkfecfrom", localUtil.format(AV82CCstkfecfrom, "99/99/99"));
               AV83CCstkfecto = localUtil.parseDateParm( httpContext.GetPar( "CCstkfecto")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83CCstkfecto", localUtil.format(AV83CCstkfecto, "99/99/99"));
               AV33Compras = CommonUtil.decimalVal( httpContext.GetPar( "Compras"), ".") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33Compras", GXutil.ltrimstr( AV33Compras, 12, 4));
               AV34Consumos = CommonUtil.decimalVal( httpContext.GetPar( "Consumos"), ".") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34Consumos", GXutil.ltrimstr( AV34Consumos, 12, 4));
               AV37Devoluciones = CommonUtil.decimalVal( httpContext.GetPar( "Devoluciones"), ".") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37Devoluciones", GXutil.ltrimstr( AV37Devoluciones, 12, 4));
               AV64saldoinicial = CommonUtil.decimalVal( httpContext.GetPar( "saldoinicial"), ".") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64saldoinicial", GXutil.ltrimstr( AV64saldoinicial, 12, 4));
               AV42Existenciascuentacorriente = CommonUtil.decimalVal( httpContext.GetPar( "Existenciascuentacorriente"), ".") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42Existenciascuentacorriente", GXutil.ltrimstr( AV42Existenciascuentacorriente, 12, 4));
               AV59PrdExiAlm = CommonUtil.decimalVal( httpContext.GetPar( "PrdExiAlm"), ".") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59PrdExiAlm", GXutil.ltrimstr( AV59PrdExiAlm, 12, 4));
               AV58PrdCanRes = CommonUtil.decimalVal( httpContext.GetPar( "PrdCanRes"), ".") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58PrdCanRes", GXutil.ltrimstr( AV58PrdCanRes, 12, 4));
               AV60PrdNom = httpContext.GetPar( "PrdNom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60PrdNom", AV60PrdNom);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV39emprcod,AV61PrdnumIN,AV82CCstkfecfrom,AV83CCstkfecto,AV33Compras,AV34Consumos,AV37Devoluciones,AV64saldoinicial,AV42Existenciascuentacorriente,AV59PrdExiAlm,AV58PrdCanRes,AV60PrdNom});
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
               gxfirstwebparm = httpContext.GetFirstPar( "emprcod") ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
            {
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxfirstwebparm = httpContext.GetFirstPar( "emprcod") ;
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
      nRC_GXsfl_111 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_111"))) ;
      nGXsfl_111_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_111_idx"))) ;
      sGXsfl_111_idx = httpContext.GetPar( "sGXsfl_111_idx") ;
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
      AV53ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      AV39emprcod = httpContext.GetPar( "emprcod") ;
      AV61PrdnumIN = httpContext.GetPar( "PrdnumIN") ;
      AV82CCstkfecfrom = localUtil.parseDateParm( httpContext.GetPar( "CCstkfecfrom")) ;
      AV83CCstkfecto = localUtil.parseDateParm( httpContext.GetPar( "CCstkfecto")) ;
      AV51IsAuthorized = GXutil.strtobool( httpContext.GetPar( "IsAuthorized")) ;
      AV97Pgmname = httpContext.GetPar( "Pgmname") ;
      AV44FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV64saldoinicial = CommonUtil.decimalVal( httpContext.GetPar( "saldoinicial"), ".") ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A719PrdNum = httpContext.GetPar( "PrdNum") ;
      A3348CCStkFec = localUtil.parseDateParm( httpContext.GetPar( "CCStkFec")) ;
      A3356CCStkHor = httpContext.GetPar( "CCStkHor") ;
      A3345TipMovCc = httpContext.GetPar( "TipMovCc") ;
      AV40EntSalInv = (short)(GXutil.lval( httpContext.GetPar( "EntSalInv"))) ;
      AV8RecExiRea = CommonUtil.decimalVal( httpContext.GetPar( "RecExiRea"), ".") ;
      AV76ComprasInv = CommonUtil.decimalVal( httpContext.GetPar( "ComprasInv"), ".") ;
      AV77ConsumosInv = CommonUtil.decimalVal( httpContext.GetPar( "ConsumosInv"), ".") ;
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
      AV94deletelinea = (short)(GXutil.lval( httpContext.GetPar( "deletelinea"))) ;
      A810RecFec = localUtil.parseDateParm( httpContext.GetPar( "RecFec")) ;
      AV11Recfec = localUtil.parseDateParm( httpContext.GetPar( "Recfec")) ;
      A809RecExiTeo = CommonUtil.decimalVal( httpContext.GetPar( "RecExiTeo"), ".") ;
      A807RecExiRea = CommonUtil.decimalVal( httpContext.GetPar( "RecExiRea"), ".") ;
      A808RecExiTcc = CommonUtil.decimalVal( httpContext.GetPar( "RecExiTcc"), ".") ;
      A806RecExiRcc = CommonUtil.decimalVal( httpContext.GetPar( "RecExiRcc"), ".") ;
      AV14Actualizardatos = httpContext.GetPar( "Actualizardatos") ;
      AV63PwdBo = GXutil.strtobool( httpContext.GetPar( "PwdBo")) ;
      AV89Usurcod = httpContext.GetPar( "Usurcod") ;
      AV90Station = httpContext.GetPar( "Station") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV53ManageFiltersExecutionStep, AV39emprcod, AV61PrdnumIN, AV82CCstkfecfrom, AV83CCstkfecto, AV51IsAuthorized, AV97Pgmname, AV44FilterFullText, AV64saldoinicial, A396EmprCod, A719PrdNum, A3348CCStkFec, A3356CCStkHor, A3345TipMovCc, AV40EntSalInv, AV8RecExiRea, AV76ComprasInv, AV77ConsumosInv, A3357CCStkDsc, A3342CCStkLin, A3349CCStkPre, A3343CCStkCanE, A3344CCStkCanS, A5722CCStkLot, A3350CCStkBar, A3351CCStkReo, A3352CCStkPar, A3358CCStkLen, A3353CCStkPed, A3355CCStkUsu, A13979CCStkLotFe, AV94deletelinea, A810RecFec, AV11Recfec, A809RecExiTeo, A807RecExiRea, A808RecExiTcc, A806RecExiRcc, AV14Actualizardatos, AV63PwdBo, AV89Usurcod, AV90Station, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1SO2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "UPQ Cuenta Corriente (paginado)", "")) ;
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
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Popover/WWPPopoverRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.stocksquimicos.upq_cuentacorriente_p_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV39emprcod)),GXutil.URLEncode(GXutil.rtrim(AV61PrdnumIN)),GXutil.URLEncode(GXutil.formatDateParm(AV82CCstkfecfrom)),GXutil.URLEncode(GXutil.formatDateParm(AV83CCstkfecto)),GXutil.URLEncode(DecimalUtil.decToString(AV33Compras)),GXutil.URLEncode(DecimalUtil.decToString(AV34Consumos)),GXutil.URLEncode(DecimalUtil.decToString(AV37Devoluciones)),GXutil.URLEncode(DecimalUtil.decToString(AV64saldoinicial)),GXutil.URLEncode(DecimalUtil.decToString(AV42Existenciascuentacorriente)),GXutil.URLEncode(DecimalUtil.decToString(AV59PrdExiAlm)),GXutil.URLEncode(DecimalUtil.decToString(AV58PrdCanRes)),GXutil.URLEncode(GXutil.rtrim(AV60PrdNom))}, new String[] {"emprcod","PrdnumIN","CCstkfecfrom","CCstkfecto","Compras","Consumos","Devoluciones","saldoinicial","Existenciascuentacorriente","PrdExiAlm","PrdCanRes","PrdNom"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vENTSALINV", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV40EntSalInv), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vRECEXIREA", getSecureSignedToken( sPrefix, localUtil.format( AV8RecExiRea, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOMPRASINV", getSecureSignedToken( sPrefix, localUtil.format( AV76ComprasInv, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCONSUMOSINV", getSecureSignedToken( sPrefix, localUtil.format( AV77ConsumosInv, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vDELETELINEA", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV94deletelinea), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vRECFEC", getSecureSignedToken( sPrefix, AV11Recfec));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vUSURCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV89Usurcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTATION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV90Station, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"UPQ_CuentaCorriente_p_WC");
      AV63PwdBo = GXutil.strtobool( GXutil.booltostr( AV63PwdBo)) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63PwdBo", AV63PwdBo);
      forbiddenHiddens.add("PwdBo", GXutil.booltostr( AV63PwdBo));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("stocksquimicos\\upq_cuentacorriente_p_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_111", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_111, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV52ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV52ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV45GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV46GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV39emprcod", GXutil.rtrim( wcpOAV39emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV61PrdnumIN", GXutil.rtrim( wcpOAV61PrdnumIN));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV82CCstkfecfrom", localUtil.dtoc( wcpOAV82CCstkfecfrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV83CCstkfecto", localUtil.dtoc( wcpOAV83CCstkfecto, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV33Compras", GXutil.ltrim( localUtil.ntoc( wcpOAV33Compras, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV34Consumos", GXutil.ltrim( localUtil.ntoc( wcpOAV34Consumos, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV37Devoluciones", GXutil.ltrim( localUtil.ntoc( wcpOAV37Devoluciones, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV64saldoinicial", GXutil.ltrim( localUtil.ntoc( wcpOAV64saldoinicial, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV42Existenciascuentacorriente", GXutil.ltrim( localUtil.ntoc( wcpOAV42Existenciascuentacorriente, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV59PrdExiAlm", GXutil.ltrim( localUtil.ntoc( wcpOAV59PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV58PrdCanRes", GXutil.ltrim( localUtil.ntoc( wcpOAV58PrdCanRes, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV60PrdNom", GXutil.rtrim( wcpOAV60PrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV53ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV39emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRDNUMIN", GXutil.rtrim( AV61PrdnumIN));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCCSTKFECFROM", localUtil.dtoc( AV82CCstkfecfrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCCSTKFECTO", localUtil.dtoc( AV83CCstkfecto, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSALDOINICIAL", GXutil.ltrim( localUtil.ntoc( AV64saldoinicial, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PRDNUM", GXutil.rtrim( A719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CCSTKFEC", localUtil.dtoc( A3348CCStkFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CCSTKHOR", GXutil.rtrim( A3356CCStkHor));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TIPMOVCC", GXutil.rtrim( A3345TipMovCc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vENTSALINV", GXutil.ltrim( localUtil.ntoc( AV40EntSalInv, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vENTSALINV", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV40EntSalInv), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vRECEXIREA", GXutil.ltrim( localUtil.ntoc( AV8RecExiRea, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vRECEXIREA", getSecureSignedToken( sPrefix, localUtil.format( AV8RecExiRea, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCOMPRASINV", GXutil.ltrim( localUtil.ntoc( AV76ComprasInv, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOMPRASINV", getSecureSignedToken( sPrefix, localUtil.format( AV76ComprasInv, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCONSUMOSINV", GXutil.ltrim( localUtil.ntoc( AV77ConsumosInv, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCONSUMOSINV", getSecureSignedToken( sPrefix, localUtil.format( AV77ConsumosInv, "ZZZZZZ9.9999")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vDELETELINEA", GXutil.ltrim( localUtil.ntoc( AV94deletelinea, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vDELETELINEA", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV94deletelinea), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"RECFEC", localUtil.dtoc( A810RecFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vRECFEC", localUtil.dtoc( AV11Recfec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vRECFEC", getSecureSignedToken( sPrefix, AV11Recfec));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"RECEXITEO", GXutil.ltrim( localUtil.ntoc( A809RecExiTeo, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"RECEXIREA", GXutil.ltrim( localUtil.ntoc( A807RecExiRea, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"RECEXITCC", GXutil.ltrim( localUtil.ntoc( A808RecExiTcc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"RECEXIRCC", GXutil.ltrim( localUtil.ntoc( A806RecExiRcc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV47GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV47GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFILE", AV6File);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSIACUMULAR", GXutil.rtrim( AV67Siacumular));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRDNOM", GXutil.rtrim( AV60PrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vUSURCOD", GXutil.rtrim( AV89Usurcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vUSURCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV89Usurcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSTATION", GXutil.rtrim( AV90Station));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTATION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV90Station, ""))));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"POPOVER_HDR_Gridinternalname", GXutil.rtrim( Popover_hdr_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"POPOVER_HDR_Iteminternalname", GXutil.rtrim( Popover_hdr_Iteminternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"POPOVER_HDR_Isgriditem", GXutil.booltostr( Popover_hdr_Isgriditem));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"POPOVER_HDR_Trigger", GXutil.rtrim( Popover_hdr_Trigger));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"POPOVER_HDR_Popoverwidth", GXutil.ltrim( localUtil.ntoc( Popover_hdr_Popoverwidth, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"POPOVER_HDR_Position", GXutil.rtrim( Popover_hdr_Position));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNAUDITAR_Title", GXutil.rtrim( Dvelop_confirmpanel_btnauditar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNAUDITAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_btnauditar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNAUDITAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnauditar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNAUDITAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnauditar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNAUDITAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnauditar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNAUDITAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_btnauditar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNAUDITAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_btnauditar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Title", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_TITLESCATEGORIES_Gridinternalname", GXutil.rtrim( Grid_titlescategories_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_TITLESCATEGORIES_Gridtitlescategories", GXutil.rtrim( Grid_titlescategories_Gridtitlescategories));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hascategories", GXutil.booltostr( Grid_empowerer_Hascategories));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Popoversingrid", GXutil.rtrim( Grid_empowerer_Popoversingrid));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNAUDITAR_Result", GXutil.rtrim( Dvelop_confirmpanel_btnauditar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNAUDITAR_Result", GXutil.rtrim( Dvelop_confirmpanel_btnauditar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Result));
   }

   public void renderHtmlCloseForm1SO2( )
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
         if ( ! ( WebComp_Wcupq_cuentacorriente_detallecompras_wc == null ) )
         {
            WebComp_Wcupq_cuentacorriente_detallecompras_wc.componentjscripts();
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
      return "StocksQuimicos.UPQ_CuentaCorriente_p_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "UPQ Cuenta Corriente (paginado)", "") ;
   }

   public void wb1SO0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.stocksquimicos.upq_cuentacorriente_p_wc");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
            httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Popover/WWPPopoverRender.js", "", false, true);
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroupGrouped", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportexcel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 111, 3, 0)+","+"null"+");", httpContext.getMessage( "Export", ""), bttBtnexportexcel_Jsonclick, 5, httpContext.getMessage( "Export", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTEXCEL\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\UPQ_CuentaCorriente_p_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 111, 3, 0)+","+"null"+");", httpContext.getMessage( "CSV", ""), bttBtncsv_Jsonclick, 5, httpContext.getMessage( "CSV", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\UPQ_CuentaCorriente_p_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_21_1SO2( true) ;
      }
      else
      {
         wb_table1_21_1SO2( false) ;
      }
      return  ;
   }

   public void wb_table1_21_1SO2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* User Defined Control */
         ucDatamon.render(context, "datamonjs", Datamon_Internalname, sPrefix+"DATAMONContainer");
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
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup1_Internalname, httpContext.getMessage( "Saldo Inicial", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_p_WC.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divSaldoinicial_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavSaldoinicialafecha_Internalname, httpContext.getMessage( "Saldo Iniciala Fecha", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'" + sPrefix + "',false,'" + sGXsfl_111_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSaldoinicialafecha_Internalname, AV65SaldoInicialaFecha, GXutil.rtrim( localUtil.format( AV65SaldoInicialaFecha, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSaldoinicialafecha_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavSaldoinicialafecha_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_p_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</fieldset>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Control Group */
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup2_Internalname, httpContext.getMessage( "Control Existencias", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_p_WC.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavExistenciascuentacorriente_Internalname, GXutil.ltrim( localUtil.ntoc( AV42Existenciascuentacorriente, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavExistenciascuentacorriente_Enabled!=0) ? localUtil.format( AV42Existenciascuentacorriente, "ZZZZZZ9.9999") : localUtil.format( AV42Existenciascuentacorriente, "ZZZZZZ9.9999"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavExistenciascuentacorriente_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavExistenciascuentacorriente_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_p_WC.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPrdexialm_Internalname, GXutil.ltrim( localUtil.ntoc( AV59PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavPrdexialm_Enabled!=0) ? localUtil.format( AV59PrdExiAlm, "ZZZZZZ9.9999") : localUtil.format( AV59PrdExiAlm, "ZZZZZZ9.9999"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPrdexialm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPrdexialm_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_p_WC.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'" + sPrefix + "',false,'" + sGXsfl_111_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavExistenciasdif_Internalname, GXutil.ltrim( localUtil.ntoc( AV43ExistenciasDif, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavExistenciasdif_Enabled!=0) ? localUtil.format( AV43ExistenciasDif, "ZZZZZZ9.9999") : localUtil.format( AV43ExistenciasDif, "ZZZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,61);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavExistenciasdif_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavExistenciasdif_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_p_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnauditarpwd_Internalname, "gx.evt.setGridEvt("+GXutil.str( 111, 3, 0)+","+"null"+");", httpContext.getMessage( "Auditar", ""), bttBtnauditarpwd_Jsonclick, 5, httpContext.getMessage( "Auditar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOAUDITARPWD\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\UPQ_CuentaCorriente_p_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavActualizardatos.getInternalname()+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'" + sPrefix + "',false,'" + sGXsfl_111_idx + "',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavActualizardatos.getInternalname(), AV14Actualizardatos, "", "", 1, chkavActualizardatos.getEnabled(), "S", httpContext.getMessage( "Actualizar Datos?", ""), StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(71, this, 'S', 'N',"+"'"+sPrefix+"'"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,71);\"");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'" + sPrefix + "',false,'" + sGXsfl_111_idx + "',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavPwdbo.getInternalname(), GXutil.booltostr( AV63PwdBo), "", "", 1, chkavPwdbo.getEnabled(), "true", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(75, this, 'true', 'false',"+"'"+sPrefix+"'"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,75);\"");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Control Group */
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup3_Internalname, httpContext.getMessage( "Resumen Movimientos", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_p_WC.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divResumenmovimientos_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCompras_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCompras_Internalname, httpContext.getMessage( "Compras (EN)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCompras_Internalname, GXutil.ltrim( localUtil.ntoc( AV33Compras, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCompras_Enabled!=0) ? localUtil.format( AV33Compras, "ZZZZZZ9.9999") : localUtil.format( AV33Compras, "ZZZZZZ9.9999"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCompras_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCompras_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_p_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavConsumos_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavConsumos_Internalname, httpContext.getMessage( "Consumos (SC,SM)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavConsumos_Internalname, GXutil.ltrim( localUtil.ntoc( AV34Consumos, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavConsumos_Enabled!=0) ? localUtil.format( AV34Consumos, "ZZZZZZ9.9999") : localUtil.format( AV34Consumos, "ZZZZZZ9.9999"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavConsumos_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavConsumos_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_p_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavDevoluciones_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDevoluciones_Internalname, httpContext.getMessage( "Devoluciones (SD)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDevoluciones_Internalname, GXutil.ltrim( localUtil.ntoc( AV37Devoluciones, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavDevoluciones_Enabled!=0) ? localUtil.format( AV37Devoluciones, "ZZZZZZ9.9999") : localUtil.format( AV37Devoluciones, "ZZZZZZ9.9999"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDevoluciones_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDevoluciones_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_p_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPrdcanres_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPrdcanres_Internalname, httpContext.getMessage( "Reservas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPrdcanres_Internalname, GXutil.ltrim( localUtil.ntoc( AV58PrdCanRes, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavPrdcanres_Enabled!=0) ? localUtil.format( AV58PrdCanRes, "ZZZZZZ9.9999") : localUtil.format( AV58PrdCanRes, "ZZZZZZ9.9999"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPrdcanres_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPrdcanres_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_p_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</fieldset>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Control Group */
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup5_Internalname, httpContext.getMessage( "Detalle Compras", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_p_WC.htm");
         wb_table2_99_1SO2( true) ;
      }
      else
      {
         wb_table2_99_1SO2( false) ;
      }
      return  ;
   }

   public void wb_table2_99_1SO2e( boolean wbgen )
   {
      if ( wbgen )
      {
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol111( ) ;
      }
      if ( wbEnd == 111 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_111 = (int)(nGXsfl_111_idx-1) ;
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV97Pgmname), GXutil.rtrim( localUtil.format( AV97Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_p_WC.htm");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavNumeroregistros_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavNumeroregistros_Internalname, httpContext.getMessage( "Nº de Resgistros", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'" + sPrefix + "',false,'" + sGXsfl_111_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavNumeroregistros_Internalname, GXutil.ltrim( localUtil.ntoc( AV55NumeroRegistros, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavNumeroregistros_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV55NumeroRegistros), "ZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV55NumeroRegistros), "ZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,146);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavNumeroregistros_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavNumeroregistros_Enabled, 0, "text", "1", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_p_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 hidden-xs hidden-sm hidden-md hidden-lg", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableinvisible_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 152,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnauditar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 111, 3, 0)+","+"null"+");", httpContext.getMessage( "Auditar", ""), bttBtnauditar_Jsonclick, 7, httpContext.getMessage( "Auditar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e111so1_client"+"'", TempTags, "", 2, "HLP_StocksQuimicos\\UPQ_CuentaCorriente_p_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavIsauthorized.getInternalname()+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 157,'" + sPrefix + "',false,'" + sGXsfl_111_idx + "',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavIsauthorized.getInternalname(), GXutil.booltostr( AV51IsAuthorized), "", "", 1, chkavIsauthorized.getEnabled(), "true", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(157, this, 'true', 'false',"+"'"+sPrefix+"'"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,157);\"");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         ucPopover_hdr.setProperty("IsGridItem", Popover_hdr_Isgriditem);
         ucPopover_hdr.setProperty("Trigger", Popover_hdr_Trigger);
         ucPopover_hdr.setProperty("PopoverWidth", Popover_hdr_Popoverwidth);
         ucPopover_hdr.setProperty("Position", Popover_hdr_Position);
         ucPopover_hdr.render(context, "dvelop.wwppopover", Popover_hdr_Internalname, sPrefix+"POPOVER_HDRContainer");
         wb_table3_162_1SO2( true) ;
      }
      else
      {
         wb_table3_162_1SO2( false) ;
      }
      return  ;
   }

   public void wb_table3_162_1SO2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table4_167_1SO2( true) ;
      }
      else
      {
         wb_table4_167_1SO2( false) ;
      }
      return  ;
   }

   public void wb_table4_167_1SO2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_titlescategories.setProperty("GridTitlesCategories", Grid_titlescategories_Gridtitlescategories);
         ucGrid_titlescategories.render(context, "dvelop.gridtitlescategories", Grid_titlescategories_Internalname, sPrefix+"GRID_TITLESCATEGORIESContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasCategories", Grid_empowerer_Hascategories);
         ucGrid_empowerer.setProperty("PopoversInGrid", Grid_empowerer_Popoversingrid);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDiv_wwpauxwc_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"W0175"+"", GXutil.rtrim( WebComp_Wwpaux_wc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+sPrefix+"gxHTMLWrpW0175"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_111_Refreshing )
            {
               if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldWwpaux_wc), GXutil.lower( WebComp_Wwpaux_wc_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp(sPrefix+"gxHTMLWrpW0175"+"");
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
      if ( wbEnd == 111 )
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

   public void start1SO2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "UPQ Cuenta Corriente (paginado)", ""), (short)(0)) ;
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
            strup1SO0( ) ;
         }
      }
   }

   public void ws1SO2( )
   {
      start1SO2( ) ;
      evt1SO2( ) ;
   }

   public void evt1SO2( )
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
                              strup1SO0( ) ;
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
                              strup1SO0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e121SO2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1SO0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e131SO2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1SO0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e141SO2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_BTNAUDITAR.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1SO0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e151SO2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1SO0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e161SO2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOAUDITARPWD'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1SO0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoAuditarPwd' */
                                 e171SO2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTEXCEL'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1SO0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportExcel' */
                                 e181SO2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1SO0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoCSV' */
                                 e191SO2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1SO0( ) ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 20), "VACCIONESGRUPO.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 20), "VACCIONESGRUPO.CLICK") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1SO0( ) ;
                           }
                           nGXsfl_111_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_111_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_111_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_1112( ) ;
                           cmbavAccionesgrupo.setName( cmbavAccionesgrupo.getInternalname() );
                           cmbavAccionesgrupo.setValue( httpContext.cgiGet( cmbavAccionesgrupo.getInternalname()) );
                           AV13AccionesGrupo = (short)(GXutil.lval( httpContext.cgiGet( cmbavAccionesgrupo.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavAccionesgrupo.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13AccionesGrupo), 4, 0));
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCcstklin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCcstklin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999999999L ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCSTKLIN");
                              GX_FocusControl = edtavCcstklin_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV22CCStkLin = 0 ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstklin_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22CCStkLin), 12, 0));
                           }
                           else
                           {
                              AV22CCStkLin = localUtil.ctol( httpContext.cgiGet( edtavCcstklin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstklin_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22CCStkLin), 12, 0));
                           }
                           AV38DiaHora = httpContext.cgiGet( edtavDiahora_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDiahora_Internalname, AV38DiaHora);
                           app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vDIAHORA"+"_"+sGXsfl_111_idx, getSecureSignedToken( sPrefix+sGXsfl_111_idx, GXutil.rtrim( localUtil.format( AV38DiaHora, ""))));
                           AV68TipMovCc = httpContext.cgiGet( edtavTipmovcc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTipmovcc_Internalname, AV68TipMovCc);
                           app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTIPMOVCC"+"_"+sGXsfl_111_idx, getSecureSignedToken( sPrefix+sGXsfl_111_idx, GXutil.rtrim( localUtil.format( AV68TipMovCc, ""))));
                           AV18CCStkDsc = httpContext.cgiGet( edtavCcstkdsc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkdsc_Internalname, AV18CCStkDsc);
                           app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCCSTKDSC"+"_"+sGXsfl_111_idx, getSecureSignedToken( sPrefix+sGXsfl_111_idx, GXutil.rtrim( localUtil.format( AV18CCStkDsc, ""))));
                           if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCcstkcane_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCcstkcane_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCSTKCANE");
                              GX_FocusControl = edtavCcstkcane_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV16CCStkCanE = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkcane_Internalname, GXutil.ltrimstr( AV16CCStkCanE, 12, 4));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCCSTKCANE"+"_"+sGXsfl_111_idx, getSecureSignedToken( sPrefix+sGXsfl_111_idx, localUtil.format( AV16CCStkCanE, "ZZZZZZ9.9999")));
                           }
                           else
                           {
                              AV16CCStkCanE = localUtil.ctond( httpContext.cgiGet( edtavCcstkcane_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkcane_Internalname, GXutil.ltrimstr( AV16CCStkCanE, 12, 4));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCCSTKCANE"+"_"+sGXsfl_111_idx, getSecureSignedToken( sPrefix+sGXsfl_111_idx, localUtil.format( AV16CCStkCanE, "ZZZZZZ9.9999")));
                           }
                           if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCcstkcans_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCcstkcans_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCSTKCANS");
                              GX_FocusControl = edtavCcstkcans_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV17CCStkCanS = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkcans_Internalname, GXutil.ltrimstr( AV17CCStkCanS, 12, 4));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCCSTKCANS"+"_"+sGXsfl_111_idx, getSecureSignedToken( sPrefix+sGXsfl_111_idx, localUtil.format( AV17CCStkCanS, "ZZZZZZ9.9999")));
                           }
                           else
                           {
                              AV17CCStkCanS = localUtil.ctond( httpContext.cgiGet( edtavCcstkcans_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkcans_Internalname, GXutil.ltrimstr( AV17CCStkCanS, 12, 4));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCCSTKCANS"+"_"+sGXsfl_111_idx, getSecureSignedToken( sPrefix+sGXsfl_111_idx, localUtil.format( AV17CCStkCanS, "ZZZZZZ9.9999")));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCcstkpre_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCcstkpre_Internalname)), DecimalUtil.stringToDec("99999999.99999")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCSTKPRE");
                              GX_FocusControl = edtavCcstkpre_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV27CCStkPre = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkpre_Internalname, GXutil.ltrimstr( AV27CCStkPre, 14, 5));
                           }
                           else
                           {
                              AV27CCStkPre = localUtil.ctond( httpContext.cgiGet( edtavCcstkpre_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkpre_Internalname, GXutil.ltrimstr( AV27CCStkPre, 14, 5));
                           }
                           if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavExis_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavExis_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vEXIS");
                              GX_FocusControl = edtavExis_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV41Exis = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavExis_Internalname, GXutil.ltrimstr( AV41Exis, 12, 4));
                           }
                           else
                           {
                              AV41Exis = localUtil.ctond( httpContext.cgiGet( edtavExis_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavExis_Internalname, GXutil.ltrimstr( AV41Exis, 12, 4));
                           }
                           AV23CCStkLot = httpContext.cgiGet( edtavCcstklot_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstklot_Internalname, AV23CCStkLot);
                           if ( localUtil.vcdtime( httpContext.cgiGet( edtavCcstklotfech_Internalname), (byte)(0), (byte)(0)) == 0 )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vCCSTKLOTFECH");
                              GX_FocusControl = edtavCcstklotfech_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV24CCStkLotFech = GXutil.nullDate() ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstklotfech_Internalname, localUtil.format(AV24CCStkLotFech, "99/99/99"));
                           }
                           else
                           {
                              AV24CCStkLotFech = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavCcstklotfech_Internalname), 0)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstklotfech_Internalname, localUtil.format(AV24CCStkLotFech, "99/99/99"));
                           }
                           AV87HdrWithTags = httpContext.cgiGet( edtavHdrwithtags_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHdrwithtags_Internalname, AV87HdrWithTags);
                           AV49Hdr = httpContext.cgiGet( edtavHdr_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHdr_Internalname, AV49Hdr);
                           app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vHDR"+"_"+sGXsfl_111_idx, getSecureSignedToken( sPrefix+sGXsfl_111_idx, GXutil.rtrim( localUtil.format( AV49Hdr, ""))));
                           AV29CCStkUsu = GXutil.upper( httpContext.cgiGet( edtavCcstkusu_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkusu_Internalname, AV29CCStkUsu);
                           app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCCSTKUSU"+"_"+sGXsfl_111_idx, getSecureSignedToken( sPrefix+sGXsfl_111_idx, GXutil.rtrim( localUtil.format( AV29CCStkUsu, "@!"))));
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCcstkbar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCcstkbar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCSTKBAR");
                              GX_FocusControl = edtavCcstkbar_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV15CCStkBar = 0 ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkbar_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15CCStkBar), 8, 0));
                           }
                           else
                           {
                              AV15CCStkBar = (int)(localUtil.ctol( httpContext.cgiGet( edtavCcstkbar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkbar_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15CCStkBar), 8, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCcstkreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCcstkreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCSTKREO");
                              GX_FocusControl = edtavCcstkreo_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV28CCStkReo = (byte)(0) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkreo_Internalname, GXutil.str( AV28CCStkReo, 1, 0));
                           }
                           else
                           {
                              AV28CCStkReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtavCcstkreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkreo_Internalname, GXutil.str( AV28CCStkReo, 1, 0));
                           }
                           AV25CCStkPar = httpContext.cgiGet( edtavCcstkpar_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkpar_Internalname, AV25CCStkPar);
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCcstkped_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCcstkped_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCSTKPED");
                              GX_FocusControl = edtavCcstkped_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV26CCStkPed = 0 ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkped_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26CCStkPed), 8, 0));
                           }
                           else
                           {
                              AV26CCStkPed = (int)(localUtil.ctol( httpContext.cgiGet( edtavCcstkped_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkped_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26CCStkPed), 8, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCcstklen_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCcstklen_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCSTKLEN");
                              GX_FocusControl = edtavCcstklen_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV21CCStkLen = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstklen_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21CCStkLen), 4, 0));
                           }
                           else
                           {
                              AV21CCStkLen = (short)(localUtil.ctol( httpContext.cgiGet( edtavCcstklen_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstklen_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21CCStkLen), 4, 0));
                           }
                           if ( localUtil.vcdtime( httpContext.cgiGet( edtavCcstkfec_Internalname), (byte)(0), (byte)(0)) == 0 )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vCCSTKFEC");
                              GX_FocusControl = edtavCcstkfec_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV19CCStkFec = GXutil.nullDate() ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkfec_Internalname, localUtil.format(AV19CCStkFec, "99/99/99"));
                           }
                           else
                           {
                              AV19CCStkFec = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavCcstkfec_Internalname), 0)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkfec_Internalname, localUtil.format(AV19CCStkFec, "99/99/99"));
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
                                       e201SO2 ();
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
                                       e211SO2 ();
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
                                       e221SO2 ();
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
                                       e231SO2 ();
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
                                    strup1SO0( ) ;
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
                     if ( nCmpId == 102 )
                     {
                        OldWcupq_cuentacorriente_detallecompras_wc = httpContext.cgiGet( sPrefix+"W0102") ;
                        if ( ( GXutil.len( OldWcupq_cuentacorriente_detallecompras_wc) == 0 ) || ( GXutil.strcmp(OldWcupq_cuentacorriente_detallecompras_wc, WebComp_Wcupq_cuentacorriente_detallecompras_wc_Component) != 0 ) )
                        {
                           WebComp_Wcupq_cuentacorriente_detallecompras_wc = WebUtils.getWebComponent(getClass(), "app." + OldWcupq_cuentacorriente_detallecompras_wc + "_impl", remoteHandle, context);
                           WebComp_Wcupq_cuentacorriente_detallecompras_wc_Component = OldWcupq_cuentacorriente_detallecompras_wc ;
                        }
                        if ( GXutil.len( WebComp_Wcupq_cuentacorriente_detallecompras_wc_Component) != 0 )
                        {
                           WebComp_Wcupq_cuentacorriente_detallecompras_wc.componentprocess(sPrefix+"W0102", "", sEvt);
                        }
                        WebComp_Wcupq_cuentacorriente_detallecompras_wc_Component = OldWcupq_cuentacorriente_detallecompras_wc ;
                     }
                     else if ( nCmpId == 175 )
                     {
                        OldWwpaux_wc = httpContext.cgiGet( sPrefix+"W0175") ;
                        if ( ( GXutil.len( OldWwpaux_wc) == 0 ) || ( GXutil.strcmp(OldWwpaux_wc, WebComp_Wwpaux_wc_Component) != 0 ) )
                        {
                           WebComp_Wwpaux_wc = WebUtils.getWebComponent(getClass(), "app." + OldWwpaux_wc + "_impl", remoteHandle, context);
                           WebComp_Wwpaux_wc_Component = OldWwpaux_wc ;
                        }
                        if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
                        {
                           WebComp_Wwpaux_wc.componentprocess(sPrefix+"W0175", "", sEvt);
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

   public void we1SO2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1SO2( ) ;
         }
      }
   }

   public void pa1SO2( )
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
      subsflControlProps_1112( ) ;
      while ( nGXsfl_111_idx <= nRC_GXsfl_111 )
      {
         sendrow_1112( ) ;
         nGXsfl_111_idx = ((subGrid_Islastpage==1)&&(nGXsfl_111_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_111_idx+1) ;
         sGXsfl_111_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_111_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1112( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 byte AV53ManageFiltersExecutionStep ,
                                 String AV39emprcod ,
                                 String AV61PrdnumIN ,
                                 java.util.Date AV82CCstkfecfrom ,
                                 java.util.Date AV83CCstkfecto ,
                                 boolean AV51IsAuthorized ,
                                 String AV97Pgmname ,
                                 String AV44FilterFullText ,
                                 java.math.BigDecimal AV64saldoinicial ,
                                 String A396EmprCod ,
                                 String A719PrdNum ,
                                 java.util.Date A3348CCStkFec ,
                                 String A3356CCStkHor ,
                                 String A3345TipMovCc ,
                                 short AV40EntSalInv ,
                                 java.math.BigDecimal AV8RecExiRea ,
                                 java.math.BigDecimal AV76ComprasInv ,
                                 java.math.BigDecimal AV77ConsumosInv ,
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
                                 short AV94deletelinea ,
                                 java.util.Date A810RecFec ,
                                 java.util.Date AV11Recfec ,
                                 java.math.BigDecimal A809RecExiTeo ,
                                 java.math.BigDecimal A807RecExiRea ,
                                 java.math.BigDecimal A808RecExiTcc ,
                                 java.math.BigDecimal A806RecExiRcc ,
                                 String AV14Actualizardatos ,
                                 boolean AV63PwdBo ,
                                 String AV89Usurcod ,
                                 String AV90Station ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e211SO2 ();
      GRID_nCurrentRecord = 0 ;
      rf1SO2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"UPQ_CuentaCorriente_p_WC");
      AV63PwdBo = GXutil.strtobool( GXutil.booltostr( AV63PwdBo)) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63PwdBo", AV63PwdBo);
      forbiddenHiddens.add("PwdBo", GXutil.booltostr( AV63PwdBo));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("stocksquimicos\\upq_cuentacorriente_p_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCCSTKDSC", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV18CCStkDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCCSTKDSC", GXutil.rtrim( AV18CCStkDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTIPMOVCC", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV68TipMovCc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPMOVCC", GXutil.rtrim( AV68TipMovCc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCCSTKUSU", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV29CCStkUsu, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCCSTKUSU", GXutil.rtrim( AV29CCStkUsu));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vDIAHORA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV38DiaHora, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vDIAHORA", GXutil.rtrim( AV38DiaHora));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCCSTKCANE", getSecureSignedToken( sPrefix, localUtil.format( AV16CCStkCanE, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCCSTKCANE", GXutil.ltrim( localUtil.ntoc( AV16CCStkCanE, (byte)(12), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCCSTKCANS", getSecureSignedToken( sPrefix, localUtil.format( AV17CCStkCanS, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCCSTKCANS", GXutil.ltrim( localUtil.ntoc( AV17CCStkCanS, (byte)(12), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vHDR", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV49Hdr, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHDR", GXutil.rtrim( AV49Hdr));
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
      AV14Actualizardatos = ((GXutil.strcmp(GXutil.rtrim( AV14Actualizardatos), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14Actualizardatos", AV14Actualizardatos);
      AV63PwdBo = GXutil.strtobool( GXutil.booltostr( AV63PwdBo)) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63PwdBo", AV63PwdBo);
      AV51IsAuthorized = GXutil.strtobool( GXutil.booltostr( AV51IsAuthorized)) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51IsAuthorized", AV51IsAuthorized);
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf1SO2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV97Pgmname = "StocksQuimicos.UPQ_CuentaCorriente_p_WC" ;
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
      edtavPrdcanres_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrdcanres_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdcanres_Enabled), 5, 0), true);
      edtavCcstklin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstklin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstklin_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavDiahora_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiahora_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiahora_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavTipmovcc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTipmovcc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipmovcc_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavCcstkdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkdsc_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavCcstkcane_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkcane_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkcane_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavCcstkcans_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkcans_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkcans_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavCcstkpre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkpre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkpre_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavExis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavExis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavExis_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavCcstklot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstklot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstklot_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavCcstklotfech_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstklotfech_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstklotfech_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavHdrwithtags_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHdrwithtags_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdrwithtags_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavHdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavCcstkusu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkusu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkusu_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavCcstkbar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkbar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkbar_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavCcstkreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkreo_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavCcstkpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkpar_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavCcstkped_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkped_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkped_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavCcstklen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstklen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstklen_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavCcstkfec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkfec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkfec_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtavNumeroregistros_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavNumeroregistros_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNumeroregistros_Enabled), 5, 0), true);
   }

   public void rf1SO2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(111) ;
      /* Execute user event: Refresh */
      e211SO2 ();
      nGXsfl_111_idx = 1 ;
      sGXsfl_111_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_111_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1112( ) ;
      bGXsfl_111_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
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
            if ( GXutil.len( WebComp_Wcupq_cuentacorriente_detallecompras_wc_Component) != 0 )
            {
               WebComp_Wcupq_cuentacorriente_detallecompras_wc.componentstart();
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
         subsflControlProps_1112( ) ;
         e221SO2 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_111_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e221SO2 ();
         }
         wbEnd = (short)(111) ;
         wb1SO0( ) ;
      }
      bGXsfl_111_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1SO2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vENTSALINV", GXutil.ltrim( localUtil.ntoc( AV40EntSalInv, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vENTSALINV", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV40EntSalInv), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vRECEXIREA", GXutil.ltrim( localUtil.ntoc( AV8RecExiRea, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vRECEXIREA", getSecureSignedToken( sPrefix, localUtil.format( AV8RecExiRea, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCOMPRASINV", GXutil.ltrim( localUtil.ntoc( AV76ComprasInv, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOMPRASINV", getSecureSignedToken( sPrefix, localUtil.format( AV76ComprasInv, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCONSUMOSINV", GXutil.ltrim( localUtil.ntoc( AV77ConsumosInv, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCONSUMOSINV", getSecureSignedToken( sPrefix, localUtil.format( AV77ConsumosInv, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vDELETELINEA", GXutil.ltrim( localUtil.ntoc( AV94deletelinea, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vDELETELINEA", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV94deletelinea), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vRECFEC", localUtil.dtoc( AV11Recfec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vRECFEC", getSecureSignedToken( sPrefix, AV11Recfec));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCCSTKDSC"+"_"+sGXsfl_111_idx, getSecureSignedToken( sPrefix+sGXsfl_111_idx, GXutil.rtrim( localUtil.format( AV18CCStkDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTIPMOVCC"+"_"+sGXsfl_111_idx, getSecureSignedToken( sPrefix+sGXsfl_111_idx, GXutil.rtrim( localUtil.format( AV68TipMovCc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCCSTKUSU"+"_"+sGXsfl_111_idx, getSecureSignedToken( sPrefix+sGXsfl_111_idx, GXutil.rtrim( localUtil.format( AV29CCStkUsu, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vDIAHORA"+"_"+sGXsfl_111_idx, getSecureSignedToken( sPrefix+sGXsfl_111_idx, GXutil.rtrim( localUtil.format( AV38DiaHora, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCCSTKCANE"+"_"+sGXsfl_111_idx, getSecureSignedToken( sPrefix+sGXsfl_111_idx, localUtil.format( AV16CCStkCanE, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCCSTKCANS"+"_"+sGXsfl_111_idx, getSecureSignedToken( sPrefix+sGXsfl_111_idx, localUtil.format( AV17CCStkCanS, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vUSURCOD", GXutil.rtrim( AV89Usurcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vUSURCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV89Usurcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSTATION", GXutil.rtrim( AV90Station));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTATION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV90Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vHDR"+"_"+sGXsfl_111_idx, getSecureSignedToken( sPrefix+sGXsfl_111_idx, GXutil.rtrim( localUtil.format( AV49Hdr, ""))));
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
         gxgrgrid_refresh( subGrid_Rows, AV53ManageFiltersExecutionStep, AV39emprcod, AV61PrdnumIN, AV82CCstkfecfrom, AV83CCstkfecto, AV51IsAuthorized, AV97Pgmname, AV44FilterFullText, AV64saldoinicial, A396EmprCod, A719PrdNum, A3348CCStkFec, A3356CCStkHor, A3345TipMovCc, AV40EntSalInv, AV8RecExiRea, AV76ComprasInv, AV77ConsumosInv, A3357CCStkDsc, A3342CCStkLin, A3349CCStkPre, A3343CCStkCanE, A3344CCStkCanS, A5722CCStkLot, A3350CCStkBar, A3351CCStkReo, A3352CCStkPar, A3358CCStkLen, A3353CCStkPed, A3355CCStkUsu, A13979CCStkLotFe, AV94deletelinea, A810RecFec, AV11Recfec, A809RecExiTeo, A807RecExiRea, A808RecExiTcc, A806RecExiRcc, AV14Actualizardatos, AV63PwdBo, AV89Usurcod, AV90Station, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV53ManageFiltersExecutionStep, AV39emprcod, AV61PrdnumIN, AV82CCstkfecfrom, AV83CCstkfecto, AV51IsAuthorized, AV97Pgmname, AV44FilterFullText, AV64saldoinicial, A396EmprCod, A719PrdNum, A3348CCStkFec, A3356CCStkHor, A3345TipMovCc, AV40EntSalInv, AV8RecExiRea, AV76ComprasInv, AV77ConsumosInv, A3357CCStkDsc, A3342CCStkLin, A3349CCStkPre, A3343CCStkCanE, A3344CCStkCanS, A5722CCStkLot, A3350CCStkBar, A3351CCStkReo, A3352CCStkPar, A3358CCStkLen, A3353CCStkPed, A3355CCStkUsu, A13979CCStkLotFe, AV94deletelinea, A810RecFec, AV11Recfec, A809RecExiTeo, A807RecExiRea, A808RecExiTcc, A806RecExiRcc, AV14Actualizardatos, AV63PwdBo, AV89Usurcod, AV90Station, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV53ManageFiltersExecutionStep, AV39emprcod, AV61PrdnumIN, AV82CCstkfecfrom, AV83CCstkfecto, AV51IsAuthorized, AV97Pgmname, AV44FilterFullText, AV64saldoinicial, A396EmprCod, A719PrdNum, A3348CCStkFec, A3356CCStkHor, A3345TipMovCc, AV40EntSalInv, AV8RecExiRea, AV76ComprasInv, AV77ConsumosInv, A3357CCStkDsc, A3342CCStkLin, A3349CCStkPre, A3343CCStkCanE, A3344CCStkCanS, A5722CCStkLot, A3350CCStkBar, A3351CCStkReo, A3352CCStkPar, A3358CCStkLen, A3353CCStkPed, A3355CCStkUsu, A13979CCStkLotFe, AV94deletelinea, A810RecFec, AV11Recfec, A809RecExiTeo, A807RecExiRea, A808RecExiTcc, A806RecExiRcc, AV14Actualizardatos, AV63PwdBo, AV89Usurcod, AV90Station, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      subGrid_Islastpage = 1 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV53ManageFiltersExecutionStep, AV39emprcod, AV61PrdnumIN, AV82CCstkfecfrom, AV83CCstkfecto, AV51IsAuthorized, AV97Pgmname, AV44FilterFullText, AV64saldoinicial, A396EmprCod, A719PrdNum, A3348CCStkFec, A3356CCStkHor, A3345TipMovCc, AV40EntSalInv, AV8RecExiRea, AV76ComprasInv, AV77ConsumosInv, A3357CCStkDsc, A3342CCStkLin, A3349CCStkPre, A3343CCStkCanE, A3344CCStkCanS, A5722CCStkLot, A3350CCStkBar, A3351CCStkReo, A3352CCStkPar, A3358CCStkLen, A3353CCStkPed, A3355CCStkUsu, A13979CCStkLotFe, AV94deletelinea, A810RecFec, AV11Recfec, A809RecExiTeo, A807RecExiRea, A808RecExiTcc, A806RecExiRcc, AV14Actualizardatos, AV63PwdBo, AV89Usurcod, AV90Station, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV53ManageFiltersExecutionStep, AV39emprcod, AV61PrdnumIN, AV82CCstkfecfrom, AV83CCstkfecto, AV51IsAuthorized, AV97Pgmname, AV44FilterFullText, AV64saldoinicial, A396EmprCod, A719PrdNum, A3348CCStkFec, A3356CCStkHor, A3345TipMovCc, AV40EntSalInv, AV8RecExiRea, AV76ComprasInv, AV77ConsumosInv, A3357CCStkDsc, A3342CCStkLin, A3349CCStkPre, A3343CCStkCanE, A3344CCStkCanS, A5722CCStkLot, A3350CCStkBar, A3351CCStkReo, A3352CCStkPar, A3358CCStkLen, A3353CCStkPed, A3355CCStkUsu, A13979CCStkLotFe, AV94deletelinea, A810RecFec, AV11Recfec, A809RecExiTeo, A807RecExiRea, A808RecExiTcc, A806RecExiRcc, AV14Actualizardatos, AV63PwdBo, AV89Usurcod, AV90Station, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV97Pgmname = "StocksQuimicos.UPQ_CuentaCorriente_p_WC" ;
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
      edtavPrdcanres_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrdcanres_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdcanres_Enabled), 5, 0), true);
      edtavCcstklin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstklin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstklin_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavDiahora_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiahora_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiahora_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavTipmovcc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTipmovcc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipmovcc_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavCcstkdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkdsc_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavCcstkcane_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkcane_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkcane_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavCcstkcans_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkcans_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkcans_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavCcstkpre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkpre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkpre_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavExis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavExis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavExis_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavCcstklot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstklot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstklot_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavCcstklotfech_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstklotfech_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstklotfech_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavHdrwithtags_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHdrwithtags_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdrwithtags_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavHdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavCcstkusu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkusu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkusu_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavCcstkbar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkbar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkbar_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavCcstkreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkreo_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavCcstkpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkpar_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavCcstkped_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkped_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkped_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavCcstklen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstklen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstklen_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavCcstkfec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkfec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkfec_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtavNumeroregistros_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavNumeroregistros_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNumeroregistros_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1SO0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e201SO2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV52ManageFiltersData);
         /* Read saved values. */
         nRC_GXsfl_111 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_111"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV45GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV46GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV39emprcod = httpContext.cgiGet( sPrefix+"wcpOAV39emprcod") ;
         wcpOAV61PrdnumIN = httpContext.cgiGet( sPrefix+"wcpOAV61PrdnumIN") ;
         wcpOAV82CCstkfecfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV82CCstkfecfrom"), 0) ;
         wcpOAV83CCstkfecto = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV83CCstkfecto"), 0) ;
         wcpOAV33Compras = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV33Compras")) ;
         wcpOAV34Consumos = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV34Consumos")) ;
         wcpOAV37Devoluciones = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV37Devoluciones")) ;
         wcpOAV64saldoinicial = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV64saldoinicial")) ;
         wcpOAV42Existenciascuentacorriente = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV42Existenciascuentacorriente")) ;
         wcpOAV59PrdExiAlm = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV59PrdExiAlm")) ;
         wcpOAV58PrdCanRes = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV58PrdCanRes")) ;
         wcpOAV60PrdNom = httpContext.cgiGet( sPrefix+"wcpOAV60PrdNom") ;
         AV61PrdnumIN = httpContext.cgiGet( sPrefix+"vPRDNUMIN") ;
         AV39emprcod = httpContext.cgiGet( sPrefix+"vEMPRCOD") ;
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
         Popover_hdr_Gridinternalname = httpContext.cgiGet( sPrefix+"POPOVER_HDR_Gridinternalname") ;
         Popover_hdr_Iteminternalname = httpContext.cgiGet( sPrefix+"POPOVER_HDR_Iteminternalname") ;
         Popover_hdr_Isgriditem = GXutil.strtobool( httpContext.cgiGet( sPrefix+"POPOVER_HDR_Isgriditem")) ;
         Popover_hdr_Trigger = httpContext.cgiGet( sPrefix+"POPOVER_HDR_Trigger") ;
         Popover_hdr_Popoverwidth = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"POPOVER_HDR_Popoverwidth"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Popover_hdr_Position = httpContext.cgiGet( sPrefix+"POPOVER_HDR_Position") ;
         Dvelop_confirmpanel_btnauditar_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNAUDITAR_Title") ;
         Dvelop_confirmpanel_btnauditar_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNAUDITAR_Confirmationtext") ;
         Dvelop_confirmpanel_btnauditar_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNAUDITAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_btnauditar_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNAUDITAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_btnauditar_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNAUDITAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_btnauditar_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNAUDITAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_btnauditar_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNAUDITAR_Confirmtype") ;
         Dvelop_confirmpanel_eliminar_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Title") ;
         Dvelop_confirmpanel_eliminar_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Confirmationtext") ;
         Dvelop_confirmpanel_eliminar_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_eliminar_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Confirmtype") ;
         Grid_titlescategories_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_TITLESCATEGORIES_Gridinternalname") ;
         Grid_titlescategories_Gridtitlescategories = httpContext.cgiGet( sPrefix+"GRID_TITLESCATEGORIES_Gridtitlescategories") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hascategories = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hascategories")) ;
         Grid_empowerer_Popoversingrid = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Popoversingrid") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_managefilters_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Activeeventkey") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Dvelop_confirmpanel_btnauditar_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNAUDITAR_Result") ;
         Dvelop_confirmpanel_eliminar_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Result") ;
         /* Read variables values. */
         AV44FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44FilterFullText", AV44FilterFullText);
         AV65SaldoInicialaFecha = httpContext.cgiGet( edtavSaldoinicialafecha_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65SaldoInicialaFecha", AV65SaldoInicialaFecha);
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavExistenciasdif_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavExistenciasdif_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vEXISTENCIASDIF");
            GX_FocusControl = edtavExistenciasdif_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV43ExistenciasDif = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43ExistenciasDif", GXutil.ltrimstr( AV43ExistenciasDif, 12, 4));
         }
         else
         {
            AV43ExistenciasDif = localUtil.ctond( httpContext.cgiGet( edtavExistenciasdif_Internalname)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43ExistenciasDif", GXutil.ltrimstr( AV43ExistenciasDif, 12, 4));
         }
         AV14Actualizardatos = ((GXutil.strcmp(httpContext.cgiGet( chkavActualizardatos.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14Actualizardatos", AV14Actualizardatos);
         AV63PwdBo = GXutil.strtobool( httpContext.cgiGet( chkavPwdbo.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63PwdBo", AV63PwdBo);
         AV97Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV97Pgmname", AV97Pgmname);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavNumeroregistros_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavNumeroregistros_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNUMEROREGISTROS");
            GX_FocusControl = edtavNumeroregistros_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV55NumeroRegistros = 0 ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55NumeroRegistros", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55NumeroRegistros), 12, 0));
         }
         else
         {
            AV55NumeroRegistros = localUtil.ctol( httpContext.cgiGet( edtavNumeroregistros_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55NumeroRegistros", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55NumeroRegistros), 12, 0));
         }
         AV51IsAuthorized = GXutil.strtobool( httpContext.cgiGet( chkavIsauthorized.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51IsAuthorized", AV51IsAuthorized);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"UPQ_CuentaCorriente_p_WC");
         AV63PwdBo = GXutil.strtobool( httpContext.cgiGet( chkavPwdbo.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63PwdBo", AV63PwdBo);
         forbiddenHiddens.add("PwdBo", GXutil.booltostr( AV63PwdBo));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("stocksquimicos\\upq_cuentacorriente_p_wc:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e201SO2 ();
      if (returnInSub) return;
   }

   public void e201SO2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV90Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      upq_cuentacorriente_p_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV90Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90Station", AV90Station);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTATION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV90Station, ""))));
      GXv_char2[0] = AV39emprcod ;
      GXv_char3[0] = AV91EmprNom ;
      GXv_char4[0] = AV89Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV90Station, GXv_char2, GXv_char3, GXv_char4) ;
      upq_cuentacorriente_p_wc_impl.this.AV39emprcod = GXv_char2[0] ;
      upq_cuentacorriente_p_wc_impl.this.AV91EmprNom = GXv_char3[0] ;
      upq_cuentacorriente_p_wc_impl.this.AV89Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39emprcod", AV39emprcod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89Usurcod", AV89Usurcod);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vUSURCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV89Usurcod, "@!"))));
      Popover_hdr_Gridinternalname = subGrid_Internalname ;
      ucPopover_hdr.sendProperty(context, sPrefix, false, Popover_hdr_Internalname, "GridInternalName", Popover_hdr_Gridinternalname);
      Popover_hdr_Iteminternalname = edtavHdrwithtags_Internalname ;
      ucPopover_hdr.sendProperty(context, sPrefix, false, Popover_hdr_Internalname, "ItemInternalName", Popover_hdr_Iteminternalname);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Grid_titlescategories_Gridinternalname = subGrid_Internalname ;
      ucGrid_titlescategories.sendProperty(context, sPrefix, false, Grid_titlescategories_Internalname, "GridInternalName", Grid_titlescategories_Gridinternalname);
      /* Execute user subroutine: 'LOADSAVEDFILTERS' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      AV65SaldoInicialaFecha = httpContext.getMessage( "Saldo Inicial < ", "") + GXutil.trim( localUtil.dtoc( AV82CCstkfecfrom, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + " = " + GXutil.trim( GXutil.str( AV64saldoinicial, 12, 4)) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65SaldoInicialaFecha", AV65SaldoInicialaFecha);
      AV43ExistenciasDif = AV42Existenciascuentacorriente.subtract(AV59PrdExiAlm) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43ExistenciasDif", GXutil.ltrimstr( AV43ExistenciasDif, 12, 4));
      AV14Actualizardatos = "N" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14Actualizardatos", AV14Actualizardatos);
      AV12WebSession.remove("ValidarWebWPwdGrl");
      GXt_int5 = AV57Password ;
      GXv_char4[0] = AV39emprcod ;
      GXv_char3[0] = "PSWAUD" ;
      GXv_int6[0] = GXt_int5 ;
      new app.prepkil(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int6) ;
      upq_cuentacorriente_p_wc_impl.this.AV39emprcod = GXv_char4[0] ;
      upq_cuentacorriente_p_wc_impl.this.GXt_int5 = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39emprcod", AV39emprcod);
      AV57Password = (short)(GXt_int5) ;
      AV63PwdBo = false ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63PwdBo", AV63PwdBo);
      GXt_int7 = (byte)(AV35Cotexsur) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV39emprcod, httpContext.getMessage( "COTEXS", ""), GXv_int8) ;
      upq_cuentacorriente_p_wc_impl.this.GXt_int7 = GXv_int8[0] ;
      AV35Cotexsur = GXt_int7 ;
      AV67Siacumular = ((AV35Cotexsur==0) ? "N" : "S") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67Siacumular", AV67Siacumular);
      GXt_int7 = (byte)(AV40EntSalInv) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV39emprcod, httpContext.getMessage( "ENSAIV", ""), GXv_int8) ;
      upq_cuentacorriente_p_wc_impl.this.GXt_int7 = GXv_int8[0] ;
      AV40EntSalInv = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40EntSalInv", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40EntSalInv), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vENTSALINV", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV40EntSalInv), "ZZZ9")));
      GXt_int7 = (byte)(AV94deletelinea) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV39emprcod, httpContext.getMessage( "DLLCC", ""), GXv_int8) ;
      upq_cuentacorriente_p_wc_impl.this.GXt_int7 = GXv_int8[0] ;
      AV94deletelinea = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV94deletelinea", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV94deletelinea), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vDELETELINEA", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV94deletelinea), "ZZZ9")));
      /* Object Property */
      if ( GXutil.len( sPrefix) == 0 )
      {
         bDynCreated_Wcupq_cuentacorriente_detallecompras_wc = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcupq_cuentacorriente_detallecompras_wc_Component), GXutil.lower( "StocksQuimicos.UPQ_CuentaCorriente_DetalleCompras_WC")) != 0 )
      {
         WebComp_Wcupq_cuentacorriente_detallecompras_wc = WebUtils.getWebComponent(getClass(), "app.stocksquimicos.upq_cuentacorriente_detallecompras_wc_impl", remoteHandle, context);
         WebComp_Wcupq_cuentacorriente_detallecompras_wc_Component = "StocksQuimicos.UPQ_CuentaCorriente_DetalleCompras_WC" ;
      }
      if ( GXutil.len( WebComp_Wcupq_cuentacorriente_detallecompras_wc_Component) != 0 )
      {
         WebComp_Wcupq_cuentacorriente_detallecompras_wc.setjustcreated();
         WebComp_Wcupq_cuentacorriente_detallecompras_wc.componentprepare(new Object[] {sPrefix+"W0102","",AV39emprcod,AV61PrdnumIN});
         WebComp_Wcupq_cuentacorriente_detallecompras_wc.componentbind(new Object[] {"",""});
      }
      subgrid_gotopage( 1) ;
      AV51IsAuthorized = false ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51IsAuthorized", AV51IsAuthorized);
   }

   public void e211SO2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext9[0] = AV73WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV73WWPContext = GXv_SdtWWPContext9[0] ;
      if ( AV53ManageFiltersExecutionStep == 1 )
      {
         AV53ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53ManageFiltersExecutionStep", GXutil.str( AV53ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV53ManageFiltersExecutionStep == 2 )
      {
         AV53ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53ManageFiltersExecutionStep", GXutil.str( AV53ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      AV45GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45GridCurrentPage), 10, 0));
      cmbavAccionesgrupo.setColumnHeaderClass( "WWActionGroupColumn" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavAccionesgrupo.getInternalname(), "Columnheaderclass", cmbavAccionesgrupo.getColumnHeaderClass(), !bGXsfl_111_Refreshing);
      edtavCcstklin_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstklin_Internalname, "Columnheaderclass", edtavCcstklin_Columnheaderclass, !bGXsfl_111_Refreshing);
      edtavDiahora_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiahora_Internalname, "Columnheaderclass", edtavDiahora_Columnheaderclass, !bGXsfl_111_Refreshing);
      edtavTipmovcc_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTipmovcc_Internalname, "Columnheaderclass", edtavTipmovcc_Columnheaderclass, !bGXsfl_111_Refreshing);
      edtavCcstkdsc_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkdsc_Internalname, "Columnheaderclass", edtavCcstkdsc_Columnheaderclass, !bGXsfl_111_Refreshing);
      edtavCcstkcane_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkcane_Internalname, "Columnheaderclass", edtavCcstkcane_Columnheaderclass, !bGXsfl_111_Refreshing);
      edtavCcstkcans_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkcans_Internalname, "Columnheaderclass", edtavCcstkcans_Columnheaderclass, !bGXsfl_111_Refreshing);
      edtavCcstkpre_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkpre_Internalname, "Columnheaderclass", edtavCcstkpre_Columnheaderclass, !bGXsfl_111_Refreshing);
      edtavExis_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavExis_Internalname, "Columnheaderclass", edtavExis_Columnheaderclass, !bGXsfl_111_Refreshing);
      edtavCcstklot_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstklot_Internalname, "Columnheaderclass", edtavCcstklot_Columnheaderclass, !bGXsfl_111_Refreshing);
      edtavCcstklotfech_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstklotfech_Internalname, "Columnheaderclass", edtavCcstklotfech_Columnheaderclass, !bGXsfl_111_Refreshing);
      edtavHdrwithtags_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHdrwithtags_Internalname, "Columnheaderclass", edtavHdrwithtags_Columnheaderclass, !bGXsfl_111_Refreshing);
      edtavCcstkusu_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkusu_Internalname, "Columnheaderclass", edtavCcstkusu_Columnheaderclass, !bGXsfl_111_Refreshing);
      GXt_int5 = AV55NumeroRegistros ;
      GXv_int6[0] = GXt_int5 ;
      new app.stocksquimicos.registrosccstks(remoteHandle, context).execute( AV39emprcod, AV61PrdnumIN, AV82CCstkfecfrom, AV83CCstkfecto, GXv_int6) ;
      upq_cuentacorriente_p_wc_impl.this.GXt_int5 = GXv_int6[0] ;
      AV55NumeroRegistros = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55NumeroRegistros", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55NumeroRegistros), 12, 0));
      AV84GridRows = ((subGrid_Rows==0) ? 1 : subGrid_Rows) ;
      AV46GridPageCount = (long)((AV55NumeroRegistros/ (double) (AV84GridRows))+1) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46GridPageCount), 10, 0));
      this.executeUsercontrolMethod(sPrefix, false, "DATAMONContainer", "GridLayoutClean", "", new Object[] {});
      if ( AV51IsAuthorized )
      {
         this.executeUsercontrolMethod(sPrefix, false, "DATAMONContainer", "ClickElement", "", new Object[] {"#"+bttBtnauditar_Internalname});
         AV51IsAuthorized = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51IsAuthorized", AV51IsAuthorized);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV52ManageFiltersData", AV52ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV47GridState", AV47GridState);
   }

   public void e131SO2( )
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
         AV56PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV56PageToGo) ;
      }
   }

   public void e141SO2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   private void e221SO2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV41Exis = AV64saldoinicial ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavExis_Internalname, GXutil.ltrimstr( AV41Exis, 12, 4));
      /* Using cursor H01SO2 */
      pr_default.execute(0, new Object[] {AV39emprcod, AV61PrdnumIN, AV82CCstkfecfrom, AV83CCstkfecto});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = H01SO2_A396EmprCod[0] ;
         A719PrdNum = H01SO2_A719PrdNum[0] ;
         A3345TipMovCc = H01SO2_A3345TipMovCc[0] ;
         A3348CCStkFec = H01SO2_A3348CCStkFec[0] ;
         A3357CCStkDsc = H01SO2_A3357CCStkDsc[0] ;
         A3342CCStkLin = H01SO2_A3342CCStkLin[0] ;
         A3349CCStkPre = H01SO2_A3349CCStkPre[0] ;
         A3343CCStkCanE = H01SO2_A3343CCStkCanE[0] ;
         A3344CCStkCanS = H01SO2_A3344CCStkCanS[0] ;
         A5722CCStkLot = H01SO2_A5722CCStkLot[0] ;
         A3352CCStkPar = H01SO2_A3352CCStkPar[0] ;
         A3351CCStkReo = H01SO2_A3351CCStkReo[0] ;
         A3350CCStkBar = H01SO2_A3350CCStkBar[0] ;
         A3358CCStkLen = H01SO2_A3358CCStkLen[0] ;
         A3353CCStkPed = H01SO2_A3353CCStkPed[0] ;
         A3355CCStkUsu = H01SO2_A3355CCStkUsu[0] ;
         A13979CCStkLotFe = H01SO2_A13979CCStkLotFe[0] ;
         A3356CCStkHor = H01SO2_A3356CCStkHor[0] ;
         if ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SR", "")) == 0 )
         {
            AV11Recfec = A3348CCStkFec ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11Recfec", localUtil.format(AV11Recfec, "99/99/99"));
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vRECFEC", getSecureSignedToken( sPrefix, AV11Recfec));
            /* Execute user subroutine: 'RECUENTO' */
            S143 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               if (true) return;
            }
            AV41Exis = ((AV40EntSalInv==0) ? AV8RecExiRea : AV8RecExiRea.add(AV76ComprasInv).subtract(AV77ConsumosInv)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavExis_Internalname, GXutil.ltrimstr( AV41Exis, 12, 4));
         }
         AV18CCStkDsc = A3357CCStkDsc ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkdsc_Internalname, AV18CCStkDsc);
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCCSTKDSC"+"_"+sGXsfl_111_idx, getSecureSignedToken( sPrefix+sGXsfl_111_idx, GXutil.rtrim( localUtil.format( AV18CCStkDsc, ""))));
         AV68TipMovCc = A3345TipMovCc ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTipmovcc_Internalname, AV68TipMovCc);
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTIPMOVCC"+"_"+sGXsfl_111_idx, getSecureSignedToken( sPrefix+sGXsfl_111_idx, GXutil.rtrim( localUtil.format( AV68TipMovCc, ""))));
         AV22CCStkLin = A3342CCStkLin ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstklin_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22CCStkLin), 12, 0));
         AV38DiaHora = localUtil.dtoc( A3348CCStkFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + " " + A3356CCStkHor ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDiahora_Internalname, AV38DiaHora);
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vDIAHORA"+"_"+sGXsfl_111_idx, getSecureSignedToken( sPrefix+sGXsfl_111_idx, GXutil.rtrim( localUtil.format( AV38DiaHora, ""))));
         AV19CCStkFec = A3348CCStkFec ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkfec_Internalname, localUtil.format(AV19CCStkFec, "99/99/99"));
         AV5CCStkHor = A3356CCStkHor ;
         AV27CCStkPre = A3349CCStkPre ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkpre_Internalname, GXutil.ltrimstr( AV27CCStkPre, 14, 5));
         AV16CCStkCanE = A3343CCStkCanE ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkcane_Internalname, GXutil.ltrimstr( AV16CCStkCanE, 12, 4));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCCSTKCANE"+"_"+sGXsfl_111_idx, getSecureSignedToken( sPrefix+sGXsfl_111_idx, localUtil.format( AV16CCStkCanE, "ZZZZZZ9.9999")));
         AV17CCStkCanS = A3344CCStkCanS ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkcans_Internalname, GXutil.ltrimstr( AV17CCStkCanS, 12, 4));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCCSTKCANS"+"_"+sGXsfl_111_idx, getSecureSignedToken( sPrefix+sGXsfl_111_idx, localUtil.format( AV17CCStkCanS, "ZZZZZZ9.9999")));
         AV23CCStkLot = A5722CCStkLot ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstklot_Internalname, AV23CCStkLot);
         AV49Hdr = ((A3350CCStkBar==0) ? " " : GXutil.str( A3350CCStkBar, 8, 0)+"-"+GXutil.str( A3351CCStkReo, 1, 0)+A3352CCStkPar) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHdr_Internalname, AV49Hdr);
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vHDR"+"_"+sGXsfl_111_idx, getSecureSignedToken( sPrefix+sGXsfl_111_idx, GXutil.rtrim( localUtil.format( AV49Hdr, ""))));
         AV15CCStkBar = A3350CCStkBar ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkbar_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15CCStkBar), 8, 0));
         AV28CCStkReo = A3351CCStkReo ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkreo_Internalname, GXutil.str( AV28CCStkReo, 1, 0));
         AV25CCStkPar = A3352CCStkPar ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkpar_Internalname, AV25CCStkPar);
         AV21CCStkLen = A3358CCStkLen ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstklen_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21CCStkLen), 4, 0));
         AV26CCStkPed = A3353CCStkPed ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkped_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26CCStkPed), 8, 0));
         AV29CCStkUsu = A3355CCStkUsu ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkusu_Internalname, AV29CCStkUsu);
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCCSTKUSU"+"_"+sGXsfl_111_idx, getSecureSignedToken( sPrefix+sGXsfl_111_idx, GXutil.rtrim( localUtil.format( AV29CCStkUsu, "@!"))));
         AV24CCStkLotFech = A13979CCStkLotFe ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstklotfech_Internalname, localUtil.format(AV24CCStkLotFech, "99/99/99"));
         AV16CCStkCanE = ((GXutil.strcmp(A3345TipMovCc, "SR")==0) ? DecimalUtil.doubleToDec(0) : AV16CCStkCanE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkcane_Internalname, GXutil.ltrimstr( AV16CCStkCanE, 12, 4));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCCSTKCANE"+"_"+sGXsfl_111_idx, getSecureSignedToken( sPrefix+sGXsfl_111_idx, localUtil.format( AV16CCStkCanE, "ZZZZZZ9.9999")));
         AV17CCStkCanS = ((GXutil.strcmp(A3345TipMovCc, "SR")==0) ? DecimalUtil.doubleToDec(0) : AV17CCStkCanS) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkcans_Internalname, GXutil.ltrimstr( AV17CCStkCanS, 12, 4));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCCSTKCANS"+"_"+sGXsfl_111_idx, getSecureSignedToken( sPrefix+sGXsfl_111_idx, localUtil.format( AV17CCStkCanS, "ZZZZZZ9.9999")));
         AV41Exis = AV41Exis.add((AV16CCStkCanE.subtract(AV17CCStkCanS))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavExis_Internalname, GXutil.ltrimstr( AV41Exis, 12, 4));
         cmbavAccionesgrupo.removeAllItems();
         cmbavAccionesgrupo.addItem("0", ";fa fa-bars", (short)(0));
         if ( AV94deletelinea == 1 )
         {
            cmbavAccionesgrupo.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "Eliminar Linea", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
         }
         cmbavAccionesgrupo.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "Modificar Lote", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         cmbavAccionesgrupo.setColumnClass( ((GXutil.strcmp(AV68TipMovCc, "SR")==0) ? "WWActionGroupColumn WWColumnSuccess WWColumnSuccessFirstColumn" : "WWActionGroupColumn") );
         edtavCcstklin_Columnclass = ((GXutil.strcmp(AV68TipMovCc, "SR")==0) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         edtavDiahora_Columnclass = ((GXutil.strcmp(AV68TipMovCc, "SR")==0) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         edtavTipmovcc_Columnclass = ((GXutil.strcmp(AV68TipMovCc, "SR")==0) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         edtavCcstkdsc_Columnclass = ((GXutil.strcmp(AV68TipMovCc, "SR")==0) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         edtavCcstkcane_Columnclass = ((GXutil.strcmp(AV68TipMovCc, "SR")==0) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         edtavCcstkcans_Columnclass = ((GXutil.strcmp(AV68TipMovCc, "SR")==0) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         edtavCcstkpre_Columnclass = ((GXutil.strcmp(AV68TipMovCc, "SR")==0) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         edtavExis_Columnclass = ((GXutil.strcmp(AV68TipMovCc, "SR")==0) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         edtavCcstklot_Columnclass = ((GXutil.strcmp(AV68TipMovCc, "SR")==0) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         edtavCcstklotfech_Columnclass = ((GXutil.strcmp(AV68TipMovCc, "SR")==0) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         edtavHdrwithtags_Columnclass = ((GXutil.strcmp(AV68TipMovCc, "SR")==0) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         edtavCcstkusu_Columnclass = ((GXutil.strcmp(AV68TipMovCc, "SR")==0) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         AV87HdrWithTags = AV49Hdr ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHdrwithtags_Internalname, AV87HdrWithTags);
         AV87HdrWithTags += "<i class='WWPPopoverIcon TagAfterText fa fa-caret-down'></i>" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHdrwithtags_Internalname, AV87HdrWithTags);
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(111) ;
         }
         if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
         {
            sendrow_1112( ) ;
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
         if ( isFullAjaxMode( ) && ! bGXsfl_111_Refreshing )
         {
            httpContext.doAjaxLoad(111, GridRow);
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /*  Sending Event outputs  */
      cmbavAccionesgrupo.setValue( GXutil.trim( GXutil.str( AV13AccionesGrupo, 4, 0)) );
   }

   public void e121SO2( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S152 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S132 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("StocksQuimicos.UPQ_CuentaCorriente_p_WCFilters")),GXutil.URLEncode(GXutil.rtrim(AV97Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV53ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53ManageFiltersExecutionStep", GXutil.str( AV53ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("StocksQuimicos.UPQ_CuentaCorriente_p_WCFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV53ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53ManageFiltersExecutionStep", GXutil.str( AV53ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV54ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "StocksQuimicos.UPQ_CuentaCorriente_p_WCFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         upq_cuentacorriente_p_wc_impl.this.GXt_char1 = GXv_char4[0] ;
         AV54ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV54ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S152 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV97Pgmname+"GridState", AV54ManageFiltersXml) ;
            AV47GridState.fromxml(AV54ManageFiltersXml, null, null);
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S162 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefreshCmp(sPrefix);
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV47GridState", AV47GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV52ManageFiltersData", AV52ManageFiltersData);
   }

   public void e151SO2( )
   {
      /* Dvelop_confirmpanel_btnauditar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_btnauditar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION AUDITAR' */
         S172 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV62ProgressIndicator", AV62ProgressIndicator);
   }

   public void e231SO2( )
   {
      /* Accionesgrupo_Click Routine */
      returnInSub = false ;
      if ( AV13AccionesGrupo == 1 )
      {
         /* Execute user subroutine: 'DO ELIMINAR' */
         S182 ();
         if (returnInSub) return;
      }
      else if ( AV13AccionesGrupo == 2 )
      {
         /* Execute user subroutine: 'DO MODIFICAR' */
         S192 ();
         if (returnInSub) return;
      }
      AV13AccionesGrupo = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavAccionesgrupo.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13AccionesGrupo), 4, 0));
      /*  Sending Event outputs  */
      cmbavAccionesgrupo.setValue( GXutil.trim( GXutil.str( AV13AccionesGrupo, 4, 0)) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavAccionesgrupo.getInternalname(), "Values", cmbavAccionesgrupo.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV52ManageFiltersData", AV52ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV47GridState", AV47GridState);
   }

   public void e161SO2( )
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
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV52ManageFiltersData", AV52ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV47GridState", AV47GridState);
   }

   public void e171SO2( )
   {
      /* 'DoAuditarPwd' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.validapassword", new String[] {GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"IsAuthorized"}) , new Object[] {"AV51IsAuthorized"});
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV52ManageFiltersData", AV52ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV47GridState", AV47GridState);
   }

   public void e181SO2( )
   {
      /* 'DoExportExcel' Routine */
      returnInSub = false ;
      if ( 1 == 0 )
      {
         GXv_char4[0] = AV39emprcod ;
         GXv_char3[0] = AV61PrdnumIN ;
         GXv_char2[0] = AV60PrdNom ;
         GXv_date10[0] = AV82CCstkfecfrom ;
         GXv_date11[0] = AV83CCstkfecto ;
         GXv_decimal12[0] = AV64saldoinicial ;
         GXv_char13[0] = AV85ExcelFilename ;
         GXv_char14[0] = AV86ErrorMessage ;
         new app.upq_cuentacorriente_export(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2, GXv_date10, GXv_date11, GXv_decimal12, GXv_char13, GXv_char14) ;
         upq_cuentacorriente_p_wc_impl.this.AV39emprcod = GXv_char4[0] ;
         upq_cuentacorriente_p_wc_impl.this.AV61PrdnumIN = GXv_char3[0] ;
         upq_cuentacorriente_p_wc_impl.this.AV60PrdNom = GXv_char2[0] ;
         upq_cuentacorriente_p_wc_impl.this.AV82CCstkfecfrom = GXv_date10[0] ;
         upq_cuentacorriente_p_wc_impl.this.AV83CCstkfecto = GXv_date11[0] ;
         upq_cuentacorriente_p_wc_impl.this.AV64saldoinicial = GXv_decimal12[0] ;
         upq_cuentacorriente_p_wc_impl.this.AV85ExcelFilename = GXv_char13[0] ;
         upq_cuentacorriente_p_wc_impl.this.AV86ErrorMessage = GXv_char14[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39emprcod", AV39emprcod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61PrdnumIN", AV61PrdnumIN);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60PrdNom", AV60PrdNom);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82CCstkfecfrom", localUtil.format(AV82CCstkfecfrom, "99/99/99"));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83CCstkfecto", localUtil.format(AV83CCstkfecto, "99/99/99"));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64saldoinicial", GXutil.ltrimstr( AV64saldoinicial, 12, 4));
      }
      GXv_char14[0] = AV39emprcod ;
      GXv_char13[0] = AV61PrdnumIN ;
      GXv_char4[0] = AV60PrdNom ;
      GXv_date11[0] = AV82CCstkfecfrom ;
      GXv_date10[0] = AV83CCstkfecto ;
      GXv_decimal12[0] = AV64saldoinicial ;
      GXv_char3[0] = AV85ExcelFilename ;
      GXv_char2[0] = AV86ErrorMessage ;
      new app.upq_cuentacorriente_export(remoteHandle, context).execute( GXv_char14, GXv_char13, GXv_char4, GXv_date11, GXv_date10, GXv_decimal12, GXv_char3, GXv_char2) ;
      upq_cuentacorriente_p_wc_impl.this.AV39emprcod = GXv_char14[0] ;
      upq_cuentacorriente_p_wc_impl.this.AV61PrdnumIN = GXv_char13[0] ;
      upq_cuentacorriente_p_wc_impl.this.AV60PrdNom = GXv_char4[0] ;
      upq_cuentacorriente_p_wc_impl.this.AV82CCstkfecfrom = GXv_date11[0] ;
      upq_cuentacorriente_p_wc_impl.this.AV83CCstkfecto = GXv_date10[0] ;
      upq_cuentacorriente_p_wc_impl.this.AV64saldoinicial = GXv_decimal12[0] ;
      upq_cuentacorriente_p_wc_impl.this.AV85ExcelFilename = GXv_char3[0] ;
      upq_cuentacorriente_p_wc_impl.this.AV86ErrorMessage = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39emprcod", AV39emprcod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61PrdnumIN", AV61PrdnumIN);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60PrdNom", AV60PrdNom);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82CCstkfecfrom", localUtil.format(AV82CCstkfecfrom, "99/99/99"));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83CCstkfecto", localUtil.format(AV83CCstkfecto, "99/99/99"));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64saldoinicial", GXutil.ltrimstr( AV64saldoinicial, 12, 4));
      if ( GXutil.strcmp(AV85ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV85ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV86ErrorMessage);
      }
      /*  Sending Event outputs  */
   }

   public void e191SO2( )
   {
      /* 'DoCSV' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.stocksquimicos.upq_cuentacorriente_exportcsv", new String[] {GXutil.URLEncode(GXutil.rtrim(AV39emprcod)),GXutil.URLEncode(GXutil.rtrim(AV61PrdnumIN)),GXutil.URLEncode(GXutil.formatDateParm(AV82CCstkfecfrom)),GXutil.URLEncode(GXutil.formatDateParm(AV83CCstkfecto)),GXutil.URLEncode(DecimalUtil.decToString(AV64saldoinicial))}, new String[] {"Emprcod","Prdnum","CCstkfec","CCstkfec_to","SaldoInicial"}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item15 = AV52ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item16[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item15 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "StocksQuimicos.UPQ_CuentaCorriente_p_WCFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item16) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item15 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item16[0] ;
      AV52ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item15 ;
   }

   public void S152( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV44FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44FilterFullText", AV44FilterFullText);
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
      if ( GXutil.strcmp(AV18CCStkDsc, httpContext.getMessage( "Consumo Manual Almacen,wIntMov", "")) == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Esta linea, NO se puede Eliminar", ""));
      }
      else
      {
         GXv_char14[0] = AV39emprcod ;
         GXv_char13[0] = AV61PrdnumIN ;
         GXv_int6[0] = AV22CCStkLin ;
         new app.pkccstks(remoteHandle, context).execute( GXv_char14, GXv_char13, GXv_int6) ;
         upq_cuentacorriente_p_wc_impl.this.AV39emprcod = GXv_char14[0] ;
         upq_cuentacorriente_p_wc_impl.this.AV61PrdnumIN = GXv_char13[0] ;
         upq_cuentacorriente_p_wc_impl.this.AV22CCStkLin = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39emprcod", AV39emprcod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61PrdnumIN", AV61PrdnumIN);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstklin_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22CCStkLin), 12, 0));
         AV88Inc_obs = httpContext.getMessage( "Producto ", "") + AV61PrdnumIN + " " + GXutil.trim( AV60PrdNom) + GXutil.newLine( ) ;
         AV88Inc_obs += httpContext.getMessage( "Del Rgto CCSTKS, Linea/Mov/Desc/Usua/Fecha-Hora/Cant E/Cant S =", "") + GXutil.newLine( ) ;
         AV88Inc_obs += GXutil.trim( GXutil.str( AV22CCStkLin, 12, 0)) + " " + AV68TipMovCc + " " + GXutil.newLine( ) ;
         AV88Inc_obs += GXutil.trim( AV18CCStkDsc) + " " + GXutil.trim( AV29CCStkUsu) + GXutil.newLine( ) ;
         AV88Inc_obs += AV38DiaHora + " " + GXutil.str( AV16CCStkCanE, 12, 4) + " " + GXutil.str( AV17CCStkCanS, 12, 4) + GXutil.newLine( ) ;
         new app.pctrinc(remoteHandle, context).execute( AV39emprcod, GXutil.substring( AV97Pgmname, 1, 10), AV89Usurcod, AV90Station, AV88Inc_obs, 99999999, (byte)(0), "@") ;
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
   }

   public void S192( )
   {
      /* 'DO MODIFICAR' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV18CCStkDsc, httpContext.getMessage( "Consumo Manual Almacen,wIntMov", "")) == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Esta linea, NO se puede Modificar", ""));
      }
      else
      {
         if ( GXutil.strcmp(AV68TipMovCc, httpContext.getMessage( "SC", "")) == 0 )
         {
            httpContext.popup(formatLink("app.webwuti010", new String[] {GXutil.URLEncode(GXutil.rtrim(AV39emprcod)),GXutil.URLEncode(GXutil.rtrim(AV61PrdnumIN)),GXutil.URLEncode(GXutil.ltrimstr(AV22CCStkLin,12,0)),GXutil.URLEncode(GXutil.ltrimstr(AV15CCStkBar,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV28CCStkReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV25CCStkPar))}, new String[] {"EmprCod","Prdnum","CCStkLin","CCStkBar","CCStkReo","CCStkpar"}) , new Object[] {"AV39emprcod","AV61PrdnumIN","AV22CCStkLin","AV15CCStkBar","AV28CCStkReo","AV25CCStkPar"});
            httpContext.doAjaxRefreshCmp(sPrefix);
         }
         else if ( GXutil.strcmp(AV68TipMovCc, httpContext.getMessage( "SM", "")) == 0 )
         {
            httpContext.popup(formatLink("app.webwuti011", new String[] {GXutil.URLEncode(GXutil.rtrim(AV39emprcod)),GXutil.URLEncode(GXutil.rtrim(AV61PrdnumIN)),GXutil.URLEncode(GXutil.ltrimstr(AV22CCStkLin,12,0)),GXutil.URLEncode(GXutil.ltrimstr(AV26CCStkPed,8,0))}, new String[] {"EmprCod","Prdnum","CCStkLin","Ccstkped"}) , new Object[] {"AV39emprcod","AV61PrdnumIN","AV22CCStkLin","AV26CCStkPed"});
            httpContext.doAjaxRefreshCmp(sPrefix);
         }
         else if ( GXutil.strcmp(AV68TipMovCc, httpContext.getMessage( "EN", "")) == 0 )
         {
            httpContext.popup(formatLink("app.webwuti012", new String[] {GXutil.URLEncode(GXutil.rtrim(AV39emprcod)),GXutil.URLEncode(GXutil.rtrim(AV61PrdnumIN)),GXutil.URLEncode(GXutil.ltrimstr(AV22CCStkLin,12,0)),GXutil.URLEncode(GXutil.ltrimstr(AV21CCStkLen,4,0))}, new String[] {"EmprCod","Prdnum","CCStkLin","CCStkLen"}) , new Object[] {"AV39emprcod","AV61PrdnumIN","AV22CCStkLin","AV21CCStkLen"});
            httpContext.doAjaxRefreshCmp(sPrefix);
         }
         else if ( GXutil.strcmp(AV68TipMovCc, httpContext.getMessage( "SR", "")) == 0 )
         {
            httpContext.popup(formatLink("app.webwuti014", new String[] {GXutil.URLEncode(GXutil.rtrim(AV39emprcod)),GXutil.URLEncode(GXutil.rtrim(AV61PrdnumIN)),GXutil.URLEncode(GXutil.ltrimstr(AV22CCStkLin,12,0)),GXutil.URLEncode(GXutil.formatDateParm(AV19CCStkFec))}, new String[] {"EmprCod","Prdnum","CCStkLin","Recfec"}) , new Object[] {"AV39emprcod","AV61PrdnumIN","AV22CCStkLin","AV19CCStkFec"});
            httpContext.doAjaxRefreshCmp(sPrefix);
         }
      }
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV66Session.getValue(AV97Pgmname+"GridState"), "") == 0 )
      {
         AV47GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV97Pgmname+"GridState"), null, null);
      }
      else
      {
         AV47GridState.fromxml(AV66Session.getValue(AV97Pgmname+"GridState"), null, null);
      }
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S162 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV47GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV47GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV47GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S162( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV99GXV1 = 1 ;
      while ( AV99GXV1 <= AV47GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV48GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV47GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV99GXV1));
         if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV44FilterFullText = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44FilterFullText", AV44FilterFullText);
         }
         AV99GXV1 = (int)(AV99GXV1+1) ;
      }
   }

   public void S132( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV47GridState.fromxml(AV66Session.getValue(AV97Pgmname+"GridState"), null, null);
      AV47GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState17[0] = AV47GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState17, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV44FilterFullText)==0), (short)(0), AV44FilterFullText, "") ;
      AV47GridState = GXv_SdtWWPGridState17[0] ;
      AV47GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV47GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV97Pgmname+"GridState", AV47GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S143( )
   {
      /* 'RECUENTO' Routine */
      returnInSub = false ;
      AV10Recexiteo = DecimalUtil.doubleToDec(0) ;
      AV8RecExiRea = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8RecExiRea", GXutil.ltrimstr( AV8RecExiRea, 12, 4));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vRECEXIREA", getSecureSignedToken( sPrefix, localUtil.format( AV8RecExiRea, "ZZZZZZ9.9999")));
      AV9RecExiTcc = DecimalUtil.doubleToDec(0) ;
      AV7RecExiRcc = DecimalUtil.doubleToDec(0) ;
      /* Using cursor H01SO3 */
      pr_default.execute(1, new Object[] {AV39emprcod, AV61PrdnumIN, AV11Recfec});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A810RecFec = H01SO3_A810RecFec[0] ;
         A719PrdNum = H01SO3_A719PrdNum[0] ;
         A396EmprCod = H01SO3_A396EmprCod[0] ;
         A809RecExiTeo = H01SO3_A809RecExiTeo[0] ;
         A807RecExiRea = H01SO3_A807RecExiRea[0] ;
         A808RecExiTcc = H01SO3_A808RecExiTcc[0] ;
         A806RecExiRcc = H01SO3_A806RecExiRcc[0] ;
         AV10Recexiteo = A809RecExiTeo ;
         AV8RecExiRea = A807RecExiRea ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8RecExiRea", GXutil.ltrimstr( AV8RecExiRea, 12, 4));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vRECEXIREA", getSecureSignedToken( sPrefix, localUtil.format( AV8RecExiRea, "ZZZZZZ9.9999")));
         AV9RecExiTcc = A808RecExiTcc ;
         AV7RecExiRcc = A806RecExiRcc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      GXv_char14[0] = AV39emprcod ;
      GXv_char13[0] = AV61PrdnumIN ;
      GXv_date11[0] = AV11Recfec ;
      GXv_decimal12[0] = AV76ComprasInv ;
      GXv_decimal18[0] = AV77ConsumosInv ;
      new app.pprc124(remoteHandle, context).execute( GXv_char14, GXv_char13, GXv_date11, GXv_decimal12, GXv_decimal18) ;
      upq_cuentacorriente_p_wc_impl.this.AV39emprcod = GXv_char14[0] ;
      upq_cuentacorriente_p_wc_impl.this.AV61PrdnumIN = GXv_char13[0] ;
      upq_cuentacorriente_p_wc_impl.this.AV11Recfec = GXv_date11[0] ;
      upq_cuentacorriente_p_wc_impl.this.AV76ComprasInv = GXv_decimal12[0] ;
      upq_cuentacorriente_p_wc_impl.this.AV77ConsumosInv = GXv_decimal18[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39emprcod", AV39emprcod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61PrdnumIN", AV61PrdnumIN);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11Recfec", localUtil.format(AV11Recfec, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vRECFEC", getSecureSignedToken( sPrefix, AV11Recfec));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76ComprasInv", GXutil.ltrimstr( AV76ComprasInv, 12, 4));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOMPRASINV", getSecureSignedToken( sPrefix, localUtil.format( AV76ComprasInv, "ZZZZZZ9.9999")));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77ConsumosInv", GXutil.ltrimstr( AV77ConsumosInv, 12, 4));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCONSUMOSINV", getSecureSignedToken( sPrefix, localUtil.format( AV77ConsumosInv, "ZZZZZZ9.9999")));
   }

   public void S172( )
   {
      /* 'DO ACTION AUDITAR' Routine */
      returnInSub = false ;
      AV62ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(1) );
      AV62ProgressIndicator.showwithtitle(httpContext.getMessage( "Informe 1, situacion de los productos......", ""));
      AV62ProgressIndicator.setgxTv_SdtProgress_Value( 20 );
      AV80i = GXutil.sleep( 1) ;
      new app.pupq000(remoteHandle, context).execute( AV39emprcod, AV61PrdnumIN, AV61PrdnumIN, AV6File, AV97Pgmname) ;
      AV6File = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6File", AV6File);
      callWebObject(formatLink("app.apupq001", new String[] {GXutil.URLEncode(GXutil.rtrim(AV39emprcod)),GXutil.URLEncode(GXutil.rtrim(AV61PrdnumIN)),GXutil.URLEncode(GXutil.rtrim(AV61PrdnumIN)),GXutil.URLEncode(GXutil.rtrim(AV67Siacumular)),GXutil.URLEncode(GXutil.rtrim(AV14Actualizardatos)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.rtrim(AV6File)),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "UPQ_CuentaCorriente", "")))}, new String[] {"Emprcod","Prdnum1","Prdnum2","Siacumular","ActDatos","CantCierre","File","PgmnameOut"}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      if ( ! AV63PwdBo )
      {
      }
      else
      {
         AV62ProgressIndicator.showwithtitle(httpContext.getMessage( "Auditoria Productos Existencias ..........", ""));
         AV62ProgressIndicator.setgxTv_SdtProgress_Value( 60 );
         AV80i = GXutil.sleep( 2) ;
         AV62ProgressIndicator.setgxTv_SdtProgress_Description( httpContext.getMessage( "(1) Producto ", "")+GXutil.trim( AV61PrdnumIN)+" "+GXutil.trim( AV60PrdNom) );
         GXv_char14[0] = AV39emprcod ;
         GXv_char13[0] = AV61PrdnumIN ;
         GXv_char4[0] = AV67Siacumular ;
         GXv_decimal18[0] = AV78Dif ;
         GXv_decimal12[0] = AV79Dif2 ;
         GXv_char3[0] = AV75obs ;
         new app.pupq003(remoteHandle, context).execute( GXv_char14, GXv_char13, GXv_char4, GXv_decimal18, GXv_decimal12, GXv_char3) ;
         upq_cuentacorriente_p_wc_impl.this.AV39emprcod = GXv_char14[0] ;
         upq_cuentacorriente_p_wc_impl.this.AV61PrdnumIN = GXv_char13[0] ;
         upq_cuentacorriente_p_wc_impl.this.AV67Siacumular = GXv_char4[0] ;
         upq_cuentacorriente_p_wc_impl.this.AV78Dif = GXv_decimal18[0] ;
         upq_cuentacorriente_p_wc_impl.this.AV79Dif2 = GXv_decimal12[0] ;
         upq_cuentacorriente_p_wc_impl.this.AV75obs = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39emprcod", AV39emprcod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61PrdnumIN", AV61PrdnumIN);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67Siacumular", AV67Siacumular);
         GXv_char14[0] = AV39emprcod ;
         GXv_char13[0] = AV61PrdnumIN ;
         GXv_decimal18[0] = AV78Dif ;
         GXv_decimal12[0] = AV79Dif2 ;
         GXv_char4[0] = AV75obs ;
         new app.pupq002(remoteHandle, context).execute( GXv_char14, GXv_char13, GXv_decimal18, GXv_decimal12, GXv_char4) ;
         upq_cuentacorriente_p_wc_impl.this.AV39emprcod = GXv_char14[0] ;
         upq_cuentacorriente_p_wc_impl.this.AV61PrdnumIN = GXv_char13[0] ;
         upq_cuentacorriente_p_wc_impl.this.AV78Dif = GXv_decimal18[0] ;
         upq_cuentacorriente_p_wc_impl.this.AV79Dif2 = GXv_decimal12[0] ;
         upq_cuentacorriente_p_wc_impl.this.AV75obs = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39emprcod", AV39emprcod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61PrdnumIN", AV61PrdnumIN);
         new app.pcommit(remoteHandle, context).execute( ) ;
         GXv_char14[0] = AV39emprcod ;
         GXv_char13[0] = AV61PrdnumIN ;
         new app.core.upq004(remoteHandle, context).execute( GXv_char14, GXv_char13) ;
         upq_cuentacorriente_p_wc_impl.this.AV39emprcod = GXv_char14[0] ;
         upq_cuentacorriente_p_wc_impl.this.AV61PrdnumIN = GXv_char13[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39emprcod", AV39emprcod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61PrdnumIN", AV61PrdnumIN);
         AV62ProgressIndicator.setgxTv_SdtProgress_Description( httpContext.getMessage( "(2) Producto ", "")+GXutil.trim( AV61PrdnumIN)+" "+GXutil.trim( AV60PrdNom) );
         GXv_char14[0] = AV39emprcod ;
         GXv_char13[0] = AV61PrdnumIN ;
         GXv_char4[0] = AV67Siacumular ;
         GXv_decimal18[0] = AV78Dif ;
         GXv_decimal12[0] = AV79Dif2 ;
         GXv_char3[0] = AV75obs ;
         new app.pupq003(remoteHandle, context).execute( GXv_char14, GXv_char13, GXv_char4, GXv_decimal18, GXv_decimal12, GXv_char3) ;
         upq_cuentacorriente_p_wc_impl.this.AV39emprcod = GXv_char14[0] ;
         upq_cuentacorriente_p_wc_impl.this.AV61PrdnumIN = GXv_char13[0] ;
         upq_cuentacorriente_p_wc_impl.this.AV67Siacumular = GXv_char4[0] ;
         upq_cuentacorriente_p_wc_impl.this.AV78Dif = GXv_decimal18[0] ;
         upq_cuentacorriente_p_wc_impl.this.AV79Dif2 = GXv_decimal12[0] ;
         upq_cuentacorriente_p_wc_impl.this.AV75obs = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39emprcod", AV39emprcod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61PrdnumIN", AV61PrdnumIN);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67Siacumular", AV67Siacumular);
         GXv_char14[0] = AV39emprcod ;
         GXv_char13[0] = AV61PrdnumIN ;
         GXv_decimal18[0] = AV78Dif ;
         GXv_decimal12[0] = AV79Dif2 ;
         GXv_char4[0] = AV75obs ;
         new app.pupq002(remoteHandle, context).execute( GXv_char14, GXv_char13, GXv_decimal18, GXv_decimal12, GXv_char4) ;
         upq_cuentacorriente_p_wc_impl.this.AV39emprcod = GXv_char14[0] ;
         upq_cuentacorriente_p_wc_impl.this.AV61PrdnumIN = GXv_char13[0] ;
         upq_cuentacorriente_p_wc_impl.this.AV78Dif = GXv_decimal18[0] ;
         upq_cuentacorriente_p_wc_impl.this.AV79Dif2 = GXv_decimal12[0] ;
         upq_cuentacorriente_p_wc_impl.this.AV75obs = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39emprcod", AV39emprcod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61PrdnumIN", AV61PrdnumIN);
         new app.pcommit(remoteHandle, context).execute( ) ;
         GXv_char14[0] = AV39emprcod ;
         GXv_char13[0] = AV61PrdnumIN ;
         new app.core.upq004(remoteHandle, context).execute( GXv_char14, GXv_char13) ;
         upq_cuentacorriente_p_wc_impl.this.AV39emprcod = GXv_char14[0] ;
         upq_cuentacorriente_p_wc_impl.this.AV61PrdnumIN = GXv_char13[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39emprcod", AV39emprcod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61PrdnumIN", AV61PrdnumIN);
         AV80i = GXutil.sleep( 1) ;
         AV62ProgressIndicator.showwithtitle(httpContext.getMessage( "Informe 2, situacion de los productos..........", ""));
         AV62ProgressIndicator.setgxTv_SdtProgress_Description( " " );
         AV62ProgressIndicator.setgxTv_SdtProgress_Value( 70 );
         callWebObject(formatLink("app.apupq001", new String[] {GXutil.URLEncode(GXutil.rtrim(AV39emprcod)),GXutil.URLEncode(GXutil.rtrim(AV61PrdnumIN)),GXutil.URLEncode(GXutil.rtrim(AV61PrdnumIN)),GXutil.URLEncode(GXutil.rtrim(AV67Siacumular)),GXutil.URLEncode(GXutil.rtrim(AV14Actualizardatos)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.rtrim(AV6File)),GXutil.URLEncode(GXutil.rtrim(GXutil.substring( AV97Pgmname, 1, 10)))}, new String[] {"Emprcod","Prdnum1","Prdnum2","Siacumular","ActDatos","CantCierre","File","PgmnameOut"}) );
         httpContext.wjLocDisableFrm = (byte)(2) ;
      }
      AV62ProgressIndicator.showwithtitle(httpContext.getMessage( "Finalizado", ""));
      AV62ProgressIndicator.setgxTv_SdtProgress_Value( 100 );
      AV80i = GXutil.sleep( 1) ;
      AV62ProgressIndicator.hide();
   }

   public void wb_table4_167_1SO2( boolean wbgen )
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
         wb_table4_167_1SO2e( true) ;
      }
      else
      {
         wb_table4_167_1SO2e( false) ;
      }
   }

   public void wb_table3_162_1SO2( boolean wbgen )
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
         wb_table3_162_1SO2e( true) ;
      }
      else
      {
         wb_table3_162_1SO2e( false) ;
      }
   }

   public void wb_table2_99_1SO2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable4_Internalname, tblUnnamedtable4_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"W0102"+"", GXutil.rtrim( WebComp_Wcupq_cuentacorriente_detallecompras_wc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+sPrefix+"gxHTMLWrpW0102"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_111_Refreshing )
            {
               if ( GXutil.len( WebComp_Wcupq_cuentacorriente_detallecompras_wc_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldWcupq_cuentacorriente_detallecompras_wc), GXutil.lower( WebComp_Wcupq_cuentacorriente_detallecompras_wc_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp(sPrefix+"gxHTMLWrpW0102"+"");
                  }
                  WebComp_Wcupq_cuentacorriente_detallecompras_wc.componentdraw();
                  if ( GXutil.strcmp(GXutil.lower( OldWcupq_cuentacorriente_detallecompras_wc), GXutil.lower( WebComp_Wcupq_cuentacorriente_detallecompras_wc_Component)) != 0 )
                  {
                     httpContext.ajax_rspEndCmp();
                  }
               }
            }
            httpContext.writeText( "</div>") ;
         }
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_99_1SO2e( true) ;
      }
      else
      {
         wb_table2_99_1SO2e( false) ;
      }
   }

   public void wb_table1_21_1SO2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV52ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table5_26_1SO2( true) ;
      }
      else
      {
         wb_table5_26_1SO2( false) ;
      }
      return  ;
   }

   public void wb_table5_26_1SO2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_21_1SO2e( true) ;
      }
      else
      {
         wb_table1_21_1SO2e( false) ;
      }
   }

   public void wb_table5_26_1SO2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'" + sPrefix + "',false,'" + sGXsfl_111_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV44FilterFullText, GXutil.rtrim( localUtil.format( AV44FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_p_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_26_1SO2e( true) ;
      }
      else
      {
         wb_table5_26_1SO2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV39emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39emprcod", AV39emprcod);
      AV61PrdnumIN = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61PrdnumIN", AV61PrdnumIN);
      AV82CCstkfecfrom = (java.util.Date)getParm(obj,2,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82CCstkfecfrom", localUtil.format(AV82CCstkfecfrom, "99/99/99"));
      AV83CCstkfecto = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83CCstkfecto", localUtil.format(AV83CCstkfecto, "99/99/99"));
      AV33Compras = (java.math.BigDecimal)getParm(obj,4,TypeConstants.DECIMAL) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33Compras", GXutil.ltrimstr( AV33Compras, 12, 4));
      AV34Consumos = (java.math.BigDecimal)getParm(obj,5,TypeConstants.DECIMAL) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34Consumos", GXutil.ltrimstr( AV34Consumos, 12, 4));
      AV37Devoluciones = (java.math.BigDecimal)getParm(obj,6,TypeConstants.DECIMAL) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37Devoluciones", GXutil.ltrimstr( AV37Devoluciones, 12, 4));
      AV64saldoinicial = (java.math.BigDecimal)getParm(obj,7,TypeConstants.DECIMAL) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64saldoinicial", GXutil.ltrimstr( AV64saldoinicial, 12, 4));
      AV42Existenciascuentacorriente = (java.math.BigDecimal)getParm(obj,8,TypeConstants.DECIMAL) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42Existenciascuentacorriente", GXutil.ltrimstr( AV42Existenciascuentacorriente, 12, 4));
      AV59PrdExiAlm = (java.math.BigDecimal)getParm(obj,9,TypeConstants.DECIMAL) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59PrdExiAlm", GXutil.ltrimstr( AV59PrdExiAlm, 12, 4));
      AV58PrdCanRes = (java.math.BigDecimal)getParm(obj,10,TypeConstants.DECIMAL) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58PrdCanRes", GXutil.ltrimstr( AV58PrdCanRes, 12, 4));
      AV60PrdNom = (String)getParm(obj,11,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60PrdNom", AV60PrdNom);
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
      pa1SO2( ) ;
      ws1SO2( ) ;
      we1SO2( ) ;
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
      sCtrlAV39emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV61PrdnumIN = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV82CCstkfecfrom = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV83CCstkfecto = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV33Compras = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV34Consumos = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV37Devoluciones = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV64saldoinicial = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV42Existenciascuentacorriente = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV59PrdExiAlm = (String)getParm(obj,9,TypeConstants.STRING) ;
      sCtrlAV58PrdCanRes = (String)getParm(obj,10,TypeConstants.STRING) ;
      sCtrlAV60PrdNom = (String)getParm(obj,11,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1SO2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "stocksquimicos\\upq_cuentacorriente_p_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1SO2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV39emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39emprcod", AV39emprcod);
         AV61PrdnumIN = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61PrdnumIN", AV61PrdnumIN);
         AV82CCstkfecfrom = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82CCstkfecfrom", localUtil.format(AV82CCstkfecfrom, "99/99/99"));
         AV83CCstkfecto = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83CCstkfecto", localUtil.format(AV83CCstkfecto, "99/99/99"));
         AV33Compras = (java.math.BigDecimal)getParm(obj,6,TypeConstants.DECIMAL) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33Compras", GXutil.ltrimstr( AV33Compras, 12, 4));
         AV34Consumos = (java.math.BigDecimal)getParm(obj,7,TypeConstants.DECIMAL) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34Consumos", GXutil.ltrimstr( AV34Consumos, 12, 4));
         AV37Devoluciones = (java.math.BigDecimal)getParm(obj,8,TypeConstants.DECIMAL) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37Devoluciones", GXutil.ltrimstr( AV37Devoluciones, 12, 4));
         AV64saldoinicial = (java.math.BigDecimal)getParm(obj,9,TypeConstants.DECIMAL) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64saldoinicial", GXutil.ltrimstr( AV64saldoinicial, 12, 4));
         AV42Existenciascuentacorriente = (java.math.BigDecimal)getParm(obj,10,TypeConstants.DECIMAL) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42Existenciascuentacorriente", GXutil.ltrimstr( AV42Existenciascuentacorriente, 12, 4));
         AV59PrdExiAlm = (java.math.BigDecimal)getParm(obj,11,TypeConstants.DECIMAL) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59PrdExiAlm", GXutil.ltrimstr( AV59PrdExiAlm, 12, 4));
         AV58PrdCanRes = (java.math.BigDecimal)getParm(obj,12,TypeConstants.DECIMAL) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58PrdCanRes", GXutil.ltrimstr( AV58PrdCanRes, 12, 4));
         AV60PrdNom = (String)getParm(obj,13,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60PrdNom", AV60PrdNom);
      }
      wcpOAV39emprcod = httpContext.cgiGet( sPrefix+"wcpOAV39emprcod") ;
      wcpOAV61PrdnumIN = httpContext.cgiGet( sPrefix+"wcpOAV61PrdnumIN") ;
      wcpOAV82CCstkfecfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV82CCstkfecfrom"), 0) ;
      wcpOAV83CCstkfecto = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV83CCstkfecto"), 0) ;
      wcpOAV33Compras = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV33Compras")) ;
      wcpOAV34Consumos = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV34Consumos")) ;
      wcpOAV37Devoluciones = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV37Devoluciones")) ;
      wcpOAV64saldoinicial = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV64saldoinicial")) ;
      wcpOAV42Existenciascuentacorriente = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV42Existenciascuentacorriente")) ;
      wcpOAV59PrdExiAlm = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV59PrdExiAlm")) ;
      wcpOAV58PrdCanRes = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV58PrdCanRes")) ;
      wcpOAV60PrdNom = httpContext.cgiGet( sPrefix+"wcpOAV60PrdNom") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV39emprcod, wcpOAV39emprcod) != 0 ) || ( GXutil.strcmp(AV61PrdnumIN, wcpOAV61PrdnumIN) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(AV82CCstkfecfrom), GXutil.resetTime(wcpOAV82CCstkfecfrom)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV83CCstkfecto), GXutil.resetTime(wcpOAV83CCstkfecto)) ) || ( DecimalUtil.compareTo(AV33Compras, wcpOAV33Compras) != 0 ) || ( DecimalUtil.compareTo(AV34Consumos, wcpOAV34Consumos) != 0 ) || ( DecimalUtil.compareTo(AV37Devoluciones, wcpOAV37Devoluciones) != 0 ) || ( DecimalUtil.compareTo(AV64saldoinicial, wcpOAV64saldoinicial) != 0 ) || ( DecimalUtil.compareTo(AV42Existenciascuentacorriente, wcpOAV42Existenciascuentacorriente) != 0 ) || ( DecimalUtil.compareTo(AV59PrdExiAlm, wcpOAV59PrdExiAlm) != 0 ) || ( DecimalUtil.compareTo(AV58PrdCanRes, wcpOAV58PrdCanRes) != 0 ) || ( GXutil.strcmp(AV60PrdNom, wcpOAV60PrdNom) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV39emprcod = AV39emprcod ;
      wcpOAV61PrdnumIN = AV61PrdnumIN ;
      wcpOAV82CCstkfecfrom = AV82CCstkfecfrom ;
      wcpOAV83CCstkfecto = AV83CCstkfecto ;
      wcpOAV33Compras = AV33Compras ;
      wcpOAV34Consumos = AV34Consumos ;
      wcpOAV37Devoluciones = AV37Devoluciones ;
      wcpOAV64saldoinicial = AV64saldoinicial ;
      wcpOAV42Existenciascuentacorriente = AV42Existenciascuentacorriente ;
      wcpOAV59PrdExiAlm = AV59PrdExiAlm ;
      wcpOAV58PrdCanRes = AV58PrdCanRes ;
      wcpOAV60PrdNom = AV60PrdNom ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV39emprcod = httpContext.cgiGet( sPrefix+"AV39emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV39emprcod) > 0 )
      {
         AV39emprcod = httpContext.cgiGet( sCtrlAV39emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39emprcod", AV39emprcod);
      }
      else
      {
         AV39emprcod = httpContext.cgiGet( sPrefix+"AV39emprcod_PARM") ;
      }
      sCtrlAV61PrdnumIN = httpContext.cgiGet( sPrefix+"AV61PrdnumIN_CTRL") ;
      if ( GXutil.len( sCtrlAV61PrdnumIN) > 0 )
      {
         AV61PrdnumIN = httpContext.cgiGet( sCtrlAV61PrdnumIN) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61PrdnumIN", AV61PrdnumIN);
      }
      else
      {
         AV61PrdnumIN = httpContext.cgiGet( sPrefix+"AV61PrdnumIN_PARM") ;
      }
      sCtrlAV82CCstkfecfrom = httpContext.cgiGet( sPrefix+"AV82CCstkfecfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV82CCstkfecfrom) > 0 )
      {
         AV82CCstkfecfrom = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV82CCstkfecfrom), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82CCstkfecfrom", localUtil.format(AV82CCstkfecfrom, "99/99/99"));
      }
      else
      {
         AV82CCstkfecfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV82CCstkfecfrom_PARM"), 0) ;
      }
      sCtrlAV83CCstkfecto = httpContext.cgiGet( sPrefix+"AV83CCstkfecto_CTRL") ;
      if ( GXutil.len( sCtrlAV83CCstkfecto) > 0 )
      {
         AV83CCstkfecto = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV83CCstkfecto), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83CCstkfecto", localUtil.format(AV83CCstkfecto, "99/99/99"));
      }
      else
      {
         AV83CCstkfecto = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV83CCstkfecto_PARM"), 0) ;
      }
      sCtrlAV33Compras = httpContext.cgiGet( sPrefix+"AV33Compras_CTRL") ;
      if ( GXutil.len( sCtrlAV33Compras) > 0 )
      {
         AV33Compras = localUtil.ctond( httpContext.cgiGet( sCtrlAV33Compras)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33Compras", GXutil.ltrimstr( AV33Compras, 12, 4));
      }
      else
      {
         AV33Compras = localUtil.ctond( httpContext.cgiGet( sPrefix+"AV33Compras_PARM")) ;
      }
      sCtrlAV34Consumos = httpContext.cgiGet( sPrefix+"AV34Consumos_CTRL") ;
      if ( GXutil.len( sCtrlAV34Consumos) > 0 )
      {
         AV34Consumos = localUtil.ctond( httpContext.cgiGet( sCtrlAV34Consumos)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34Consumos", GXutil.ltrimstr( AV34Consumos, 12, 4));
      }
      else
      {
         AV34Consumos = localUtil.ctond( httpContext.cgiGet( sPrefix+"AV34Consumos_PARM")) ;
      }
      sCtrlAV37Devoluciones = httpContext.cgiGet( sPrefix+"AV37Devoluciones_CTRL") ;
      if ( GXutil.len( sCtrlAV37Devoluciones) > 0 )
      {
         AV37Devoluciones = localUtil.ctond( httpContext.cgiGet( sCtrlAV37Devoluciones)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37Devoluciones", GXutil.ltrimstr( AV37Devoluciones, 12, 4));
      }
      else
      {
         AV37Devoluciones = localUtil.ctond( httpContext.cgiGet( sPrefix+"AV37Devoluciones_PARM")) ;
      }
      sCtrlAV64saldoinicial = httpContext.cgiGet( sPrefix+"AV64saldoinicial_CTRL") ;
      if ( GXutil.len( sCtrlAV64saldoinicial) > 0 )
      {
         AV64saldoinicial = localUtil.ctond( httpContext.cgiGet( sCtrlAV64saldoinicial)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64saldoinicial", GXutil.ltrimstr( AV64saldoinicial, 12, 4));
      }
      else
      {
         AV64saldoinicial = localUtil.ctond( httpContext.cgiGet( sPrefix+"AV64saldoinicial_PARM")) ;
      }
      sCtrlAV42Existenciascuentacorriente = httpContext.cgiGet( sPrefix+"AV42Existenciascuentacorriente_CTRL") ;
      if ( GXutil.len( sCtrlAV42Existenciascuentacorriente) > 0 )
      {
         AV42Existenciascuentacorriente = localUtil.ctond( httpContext.cgiGet( sCtrlAV42Existenciascuentacorriente)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42Existenciascuentacorriente", GXutil.ltrimstr( AV42Existenciascuentacorriente, 12, 4));
      }
      else
      {
         AV42Existenciascuentacorriente = localUtil.ctond( httpContext.cgiGet( sPrefix+"AV42Existenciascuentacorriente_PARM")) ;
      }
      sCtrlAV59PrdExiAlm = httpContext.cgiGet( sPrefix+"AV59PrdExiAlm_CTRL") ;
      if ( GXutil.len( sCtrlAV59PrdExiAlm) > 0 )
      {
         AV59PrdExiAlm = localUtil.ctond( httpContext.cgiGet( sCtrlAV59PrdExiAlm)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59PrdExiAlm", GXutil.ltrimstr( AV59PrdExiAlm, 12, 4));
      }
      else
      {
         AV59PrdExiAlm = localUtil.ctond( httpContext.cgiGet( sPrefix+"AV59PrdExiAlm_PARM")) ;
      }
      sCtrlAV58PrdCanRes = httpContext.cgiGet( sPrefix+"AV58PrdCanRes_CTRL") ;
      if ( GXutil.len( sCtrlAV58PrdCanRes) > 0 )
      {
         AV58PrdCanRes = localUtil.ctond( httpContext.cgiGet( sCtrlAV58PrdCanRes)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58PrdCanRes", GXutil.ltrimstr( AV58PrdCanRes, 12, 4));
      }
      else
      {
         AV58PrdCanRes = localUtil.ctond( httpContext.cgiGet( sPrefix+"AV58PrdCanRes_PARM")) ;
      }
      sCtrlAV60PrdNom = httpContext.cgiGet( sPrefix+"AV60PrdNom_CTRL") ;
      if ( GXutil.len( sCtrlAV60PrdNom) > 0 )
      {
         AV60PrdNom = httpContext.cgiGet( sCtrlAV60PrdNom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60PrdNom", AV60PrdNom);
      }
      else
      {
         AV60PrdNom = httpContext.cgiGet( sPrefix+"AV60PrdNom_PARM") ;
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
      pa1SO2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1SO2( ) ;
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
      ws1SO2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV39emprcod_PARM", GXutil.rtrim( AV39emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV39emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV39emprcod_CTRL", GXutil.rtrim( sCtrlAV39emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV61PrdnumIN_PARM", GXutil.rtrim( AV61PrdnumIN));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV61PrdnumIN)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV61PrdnumIN_CTRL", GXutil.rtrim( sCtrlAV61PrdnumIN));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV82CCstkfecfrom_PARM", localUtil.dtoc( AV82CCstkfecfrom, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV82CCstkfecfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV82CCstkfecfrom_CTRL", GXutil.rtrim( sCtrlAV82CCstkfecfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV83CCstkfecto_PARM", localUtil.dtoc( AV83CCstkfecto, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV83CCstkfecto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV83CCstkfecto_CTRL", GXutil.rtrim( sCtrlAV83CCstkfecto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV33Compras_PARM", GXutil.ltrim( localUtil.ntoc( AV33Compras, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV33Compras)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV33Compras_CTRL", GXutil.rtrim( sCtrlAV33Compras));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV34Consumos_PARM", GXutil.ltrim( localUtil.ntoc( AV34Consumos, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV34Consumos)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV34Consumos_CTRL", GXutil.rtrim( sCtrlAV34Consumos));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV37Devoluciones_PARM", GXutil.ltrim( localUtil.ntoc( AV37Devoluciones, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV37Devoluciones)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV37Devoluciones_CTRL", GXutil.rtrim( sCtrlAV37Devoluciones));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV64saldoinicial_PARM", GXutil.ltrim( localUtil.ntoc( AV64saldoinicial, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV64saldoinicial)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV64saldoinicial_CTRL", GXutil.rtrim( sCtrlAV64saldoinicial));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV42Existenciascuentacorriente_PARM", GXutil.ltrim( localUtil.ntoc( AV42Existenciascuentacorriente, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV42Existenciascuentacorriente)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV42Existenciascuentacorriente_CTRL", GXutil.rtrim( sCtrlAV42Existenciascuentacorriente));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV59PrdExiAlm_PARM", GXutil.ltrim( localUtil.ntoc( AV59PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV59PrdExiAlm)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV59PrdExiAlm_CTRL", GXutil.rtrim( sCtrlAV59PrdExiAlm));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV58PrdCanRes_PARM", GXutil.ltrim( localUtil.ntoc( AV58PrdCanRes, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV58PrdCanRes)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV58PrdCanRes_CTRL", GXutil.rtrim( sCtrlAV58PrdCanRes));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV60PrdNom_PARM", GXutil.rtrim( AV60PrdNom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV60PrdNom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV60PrdNom_CTRL", GXutil.rtrim( sCtrlAV60PrdNom));
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
      we1SO2( ) ;
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
      if ( ! ( WebComp_Wcupq_cuentacorriente_detallecompras_wc == null ) )
      {
         WebComp_Wcupq_cuentacorriente_detallecompras_wc.componentjscripts();
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
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("calendar-system.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      if ( ! ( WebComp_Wcupq_cuentacorriente_detallecompras_wc == null ) )
      {
         if ( GXutil.len( WebComp_Wcupq_cuentacorriente_detallecompras_wc_Component) != 0 )
         {
            WebComp_Wcupq_cuentacorriente_detallecompras_wc.componentthemes();
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026921642185", true, true);
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
      httpContext.AddJavascriptSource("stocksquimicos/upq_cuentacorriente_p_wc.js", "?2026921642185", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Popover/WWPPopoverRender.js", "", false, true);
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

   public void subsflControlProps_1112( )
   {
      cmbavAccionesgrupo.setInternalname( sPrefix+"vACCIONESGRUPO_"+sGXsfl_111_idx );
      edtavCcstklin_Internalname = sPrefix+"vCCSTKLIN_"+sGXsfl_111_idx ;
      edtavDiahora_Internalname = sPrefix+"vDIAHORA_"+sGXsfl_111_idx ;
      edtavTipmovcc_Internalname = sPrefix+"vTIPMOVCC_"+sGXsfl_111_idx ;
      edtavCcstkdsc_Internalname = sPrefix+"vCCSTKDSC_"+sGXsfl_111_idx ;
      edtavCcstkcane_Internalname = sPrefix+"vCCSTKCANE_"+sGXsfl_111_idx ;
      edtavCcstkcans_Internalname = sPrefix+"vCCSTKCANS_"+sGXsfl_111_idx ;
      edtavCcstkpre_Internalname = sPrefix+"vCCSTKPRE_"+sGXsfl_111_idx ;
      edtavExis_Internalname = sPrefix+"vEXIS_"+sGXsfl_111_idx ;
      edtavCcstklot_Internalname = sPrefix+"vCCSTKLOT_"+sGXsfl_111_idx ;
      edtavCcstklotfech_Internalname = sPrefix+"vCCSTKLOTFECH_"+sGXsfl_111_idx ;
      edtavHdrwithtags_Internalname = sPrefix+"vHDRWITHTAGS_"+sGXsfl_111_idx ;
      edtavHdr_Internalname = sPrefix+"vHDR_"+sGXsfl_111_idx ;
      edtavCcstkusu_Internalname = sPrefix+"vCCSTKUSU_"+sGXsfl_111_idx ;
      edtavCcstkbar_Internalname = sPrefix+"vCCSTKBAR_"+sGXsfl_111_idx ;
      edtavCcstkreo_Internalname = sPrefix+"vCCSTKREO_"+sGXsfl_111_idx ;
      edtavCcstkpar_Internalname = sPrefix+"vCCSTKPAR_"+sGXsfl_111_idx ;
      edtavCcstkped_Internalname = sPrefix+"vCCSTKPED_"+sGXsfl_111_idx ;
      edtavCcstklen_Internalname = sPrefix+"vCCSTKLEN_"+sGXsfl_111_idx ;
      edtavCcstkfec_Internalname = sPrefix+"vCCSTKFEC_"+sGXsfl_111_idx ;
   }

   public void subsflControlProps_fel_1112( )
   {
      cmbavAccionesgrupo.setInternalname( sPrefix+"vACCIONESGRUPO_"+sGXsfl_111_fel_idx );
      edtavCcstklin_Internalname = sPrefix+"vCCSTKLIN_"+sGXsfl_111_fel_idx ;
      edtavDiahora_Internalname = sPrefix+"vDIAHORA_"+sGXsfl_111_fel_idx ;
      edtavTipmovcc_Internalname = sPrefix+"vTIPMOVCC_"+sGXsfl_111_fel_idx ;
      edtavCcstkdsc_Internalname = sPrefix+"vCCSTKDSC_"+sGXsfl_111_fel_idx ;
      edtavCcstkcane_Internalname = sPrefix+"vCCSTKCANE_"+sGXsfl_111_fel_idx ;
      edtavCcstkcans_Internalname = sPrefix+"vCCSTKCANS_"+sGXsfl_111_fel_idx ;
      edtavCcstkpre_Internalname = sPrefix+"vCCSTKPRE_"+sGXsfl_111_fel_idx ;
      edtavExis_Internalname = sPrefix+"vEXIS_"+sGXsfl_111_fel_idx ;
      edtavCcstklot_Internalname = sPrefix+"vCCSTKLOT_"+sGXsfl_111_fel_idx ;
      edtavCcstklotfech_Internalname = sPrefix+"vCCSTKLOTFECH_"+sGXsfl_111_fel_idx ;
      edtavHdrwithtags_Internalname = sPrefix+"vHDRWITHTAGS_"+sGXsfl_111_fel_idx ;
      edtavHdr_Internalname = sPrefix+"vHDR_"+sGXsfl_111_fel_idx ;
      edtavCcstkusu_Internalname = sPrefix+"vCCSTKUSU_"+sGXsfl_111_fel_idx ;
      edtavCcstkbar_Internalname = sPrefix+"vCCSTKBAR_"+sGXsfl_111_fel_idx ;
      edtavCcstkreo_Internalname = sPrefix+"vCCSTKREO_"+sGXsfl_111_fel_idx ;
      edtavCcstkpar_Internalname = sPrefix+"vCCSTKPAR_"+sGXsfl_111_fel_idx ;
      edtavCcstkped_Internalname = sPrefix+"vCCSTKPED_"+sGXsfl_111_fel_idx ;
      edtavCcstklen_Internalname = sPrefix+"vCCSTKLEN_"+sGXsfl_111_fel_idx ;
      edtavCcstkfec_Internalname = sPrefix+"vCCSTKFEC_"+sGXsfl_111_fel_idx ;
   }

   public void sendrow_1112( )
   {
      subsflControlProps_1112( ) ;
      wb1SO0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_111_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_111_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_111_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavAccionesgrupo.getEnabled()!=0)&&(cmbavAccionesgrupo.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 112,'"+sPrefix+"',false,'"+sGXsfl_111_idx+"',111)\"" : " ") ;
         if ( ( cmbavAccionesgrupo.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vACCIONESGRUPO_" + sGXsfl_111_idx ;
            cmbavAccionesgrupo.setName( GXCCtl );
            cmbavAccionesgrupo.setWebtags( "" );
            if ( cmbavAccionesgrupo.getItemCount() > 0 )
            {
               AV13AccionesGrupo = (short)(GXutil.lval( cmbavAccionesgrupo.getValidValue(GXutil.trim( GXutil.str( AV13AccionesGrupo, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavAccionesgrupo.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13AccionesGrupo), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavAccionesgrupo,cmbavAccionesgrupo.getInternalname(),GXutil.trim( GXutil.str( AV13AccionesGrupo, 4, 0)),Integer.valueOf(1),cmbavAccionesgrupo.getJsonclick(),Integer.valueOf(5),"'"+sPrefix+"'"+",false,"+"'"+sPrefix+"EVACCIONESGRUPO.CLICK."+sGXsfl_111_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO",cmbavAccionesgrupo.getColumnClass(),cmbavAccionesgrupo.getColumnHeaderClass(),TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavAccionesgrupo.getEnabled()!=0)&&(cmbavAccionesgrupo.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,112);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavAccionesgrupo.setValue( GXutil.trim( GXutil.str( AV13AccionesGrupo, 4, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavAccionesgrupo.getInternalname(), "Values", cmbavAccionesgrupo.ToJavascriptSource(), !bGXsfl_111_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCcstklin_Enabled!=0)&&(edtavCcstklin_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 113,'"+sPrefix+"',false,'"+sGXsfl_111_idx+"',111)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCcstklin_Internalname,GXutil.ltrim( localUtil.ntoc( AV22CCStkLin, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCcstklin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV22CCStkLin), "ZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV22CCStkLin), "ZZZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavCcstklin_Enabled!=0)&&(edtavCcstklin_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,113);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCcstklin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavCcstklin_Columnclass,edtavCcstklin_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavCcstklin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavDiahora_Enabled!=0)&&(edtavDiahora_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 114,'"+sPrefix+"',false,'"+sGXsfl_111_idx+"',111)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDiahora_Internalname,GXutil.rtrim( AV38DiaHora),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavDiahora_Enabled!=0)&&(edtavDiahora_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,114);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDiahora_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavDiahora_Columnclass,edtavDiahora_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavDiahora_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavTipmovcc_Enabled!=0)&&(edtavTipmovcc_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 115,'"+sPrefix+"',false,'"+sGXsfl_111_idx+"',111)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTipmovcc_Internalname,GXutil.rtrim( AV68TipMovCc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavTipmovcc_Enabled!=0)&&(edtavTipmovcc_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,115);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavTipmovcc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavTipmovcc_Columnclass,edtavTipmovcc_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavTipmovcc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCcstkdsc_Enabled!=0)&&(edtavCcstkdsc_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 116,'"+sPrefix+"',false,'"+sGXsfl_111_idx+"',111)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCcstkdsc_Internalname,GXutil.rtrim( AV18CCStkDsc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavCcstkdsc_Enabled!=0)&&(edtavCcstkdsc_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,116);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCcstkdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavCcstkdsc_Columnclass,edtavCcstkdsc_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavCcstkdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCcstkcane_Enabled!=0)&&(edtavCcstkcane_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 117,'"+sPrefix+"',false,'"+sGXsfl_111_idx+"',111)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCcstkcane_Internalname,GXutil.ltrim( localUtil.ntoc( AV16CCStkCanE, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCcstkcane_Enabled!=0) ? localUtil.format( AV16CCStkCanE, "ZZZZZZ9.9999") : localUtil.format( AV16CCStkCanE, "ZZZZZZ9.9999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+((edtavCcstkcane_Enabled!=0)&&(edtavCcstkcane_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,117);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCcstkcane_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavCcstkcane_Columnclass,edtavCcstkcane_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavCcstkcane_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCcstkcans_Enabled!=0)&&(edtavCcstkcans_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 118,'"+sPrefix+"',false,'"+sGXsfl_111_idx+"',111)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCcstkcans_Internalname,GXutil.ltrim( localUtil.ntoc( AV17CCStkCanS, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCcstkcans_Enabled!=0) ? localUtil.format( AV17CCStkCanS, "ZZZZZZ9.9999") : localUtil.format( AV17CCStkCanS, "ZZZZZZ9.9999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+((edtavCcstkcans_Enabled!=0)&&(edtavCcstkcans_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,118);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCcstkcans_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavCcstkcans_Columnclass,edtavCcstkcans_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavCcstkcans_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCcstkpre_Enabled!=0)&&(edtavCcstkpre_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 119,'"+sPrefix+"',false,'"+sGXsfl_111_idx+"',111)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCcstkpre_Internalname,GXutil.ltrim( localUtil.ntoc( AV27CCStkPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCcstkpre_Enabled!=0) ? localUtil.format( AV27CCStkPre, "ZZZZZZZ9.999") : localUtil.format( AV27CCStkPre, "ZZZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+((edtavCcstkpre_Enabled!=0)&&(edtavCcstkpre_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,119);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCcstkpre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavCcstkpre_Columnclass,edtavCcstkpre_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavCcstkpre_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavExis_Enabled!=0)&&(edtavExis_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 120,'"+sPrefix+"',false,'"+sGXsfl_111_idx+"',111)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavExis_Internalname,GXutil.ltrim( localUtil.ntoc( AV41Exis, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavExis_Enabled!=0) ? localUtil.format( AV41Exis, "ZZZZZZ9.9999") : localUtil.format( AV41Exis, "ZZZZZZ9.9999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+((edtavExis_Enabled!=0)&&(edtavExis_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,120);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavExis_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavExis_Columnclass,edtavExis_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavExis_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCcstklot_Enabled!=0)&&(edtavCcstklot_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 121,'"+sPrefix+"',false,'"+sGXsfl_111_idx+"',111)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCcstklot_Internalname,GXutil.rtrim( AV23CCStkLot),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavCcstklot_Enabled!=0)&&(edtavCcstklot_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,121);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCcstklot_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavCcstklot_Columnclass,edtavCcstklot_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavCcstklot_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCcstklotfech_Enabled!=0)&&(edtavCcstklotfech_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 122,'"+sPrefix+"',false,'"+sGXsfl_111_idx+"',111)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCcstklotfech_Internalname,localUtil.format(AV24CCStkLotFech, "99/99/99"),localUtil.format( AV24CCStkLotFech, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+((edtavCcstklotfech_Enabled!=0)&&(edtavCcstklotfech_Visible!=0) ? " onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,122);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCcstklotfech_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavCcstklotfech_Columnclass,edtavCcstklotfech_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavCcstklotfech_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavHdrwithtags_Enabled!=0)&&(edtavHdrwithtags_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 123,'"+sPrefix+"',false,'"+sGXsfl_111_idx+"',111)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdrwithtags_Internalname,AV87HdrWithTags,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavHdrwithtags_Enabled!=0)&&(edtavHdrwithtags_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,123);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavHdrwithtags_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavHdrwithtags_Columnclass,edtavHdrwithtags_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavHdrwithtags_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavHdr_Enabled!=0)&&(edtavHdr_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 124,'"+sPrefix+"',false,'"+sGXsfl_111_idx+"',111)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr_Internalname,GXutil.rtrim( AV49Hdr),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavHdr_Enabled!=0)&&(edtavHdr_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,124);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+"e241so2_client"+"'","","","","",edtavHdr_Jsonclick,Integer.valueOf(7),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavHdr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCcstkusu_Enabled!=0)&&(edtavCcstkusu_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 125,'"+sPrefix+"',false,'"+sGXsfl_111_idx+"',111)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCcstkusu_Internalname,GXutil.rtrim( AV29CCStkUsu),GXutil.rtrim( localUtil.format( AV29CCStkUsu, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+((edtavCcstkusu_Enabled!=0)&&(edtavCcstkusu_Visible!=0) ? " onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,125);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCcstkusu_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavCcstkusu_Columnclass,edtavCcstkusu_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavCcstkusu_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCcstkbar_Enabled!=0)&&(edtavCcstkbar_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 126,'"+sPrefix+"',false,'"+sGXsfl_111_idx+"',111)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCcstkbar_Internalname,GXutil.ltrim( localUtil.ntoc( AV15CCStkBar, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCcstkbar_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV15CCStkBar), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV15CCStkBar), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavCcstkbar_Enabled!=0)&&(edtavCcstkbar_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,126);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCcstkbar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavCcstkbar_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCcstkreo_Enabled!=0)&&(edtavCcstkreo_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 127,'"+sPrefix+"',false,'"+sGXsfl_111_idx+"',111)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCcstkreo_Internalname,GXutil.ltrim( localUtil.ntoc( AV28CCStkReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCcstkreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV28CCStkReo), "9") : localUtil.format( DecimalUtil.doubleToDec(AV28CCStkReo), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavCcstkreo_Enabled!=0)&&(edtavCcstkreo_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,127);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCcstkreo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavCcstkreo_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCcstkpar_Enabled!=0)&&(edtavCcstkpar_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 128,'"+sPrefix+"',false,'"+sGXsfl_111_idx+"',111)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCcstkpar_Internalname,GXutil.rtrim( AV25CCStkPar),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavCcstkpar_Enabled!=0)&&(edtavCcstkpar_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,128);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCcstkpar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavCcstkpar_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCcstkped_Enabled!=0)&&(edtavCcstkped_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 129,'"+sPrefix+"',false,'"+sGXsfl_111_idx+"',111)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCcstkped_Internalname,GXutil.ltrim( localUtil.ntoc( AV26CCStkPed, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCcstkped_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV26CCStkPed), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV26CCStkPed), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavCcstkped_Enabled!=0)&&(edtavCcstkped_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,129);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCcstkped_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavCcstkped_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCcstklen_Enabled!=0)&&(edtavCcstklen_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 130,'"+sPrefix+"',false,'"+sGXsfl_111_idx+"',111)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCcstklen_Internalname,GXutil.ltrim( localUtil.ntoc( AV21CCStkLen, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCcstklen_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV21CCStkLen), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV21CCStkLen), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavCcstklen_Enabled!=0)&&(edtavCcstklen_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,130);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCcstklen_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavCcstklen_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCcstkfec_Enabled!=0)&&(edtavCcstkfec_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 131,'"+sPrefix+"',false,'"+sGXsfl_111_idx+"',111)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCcstkfec_Internalname,localUtil.format(AV19CCStkFec, "99/99/99"),localUtil.format( AV19CCStkFec, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+((edtavCcstkfec_Enabled!=0)&&(edtavCcstkfec_Visible!=0) ? " onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,131);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCcstkfec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavCcstkfec_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1SO2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_111_idx = ((subGrid_Islastpage==1)&&(nGXsfl_111_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_111_idx+1) ;
         sGXsfl_111_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_111_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1112( ) ;
      }
      /* End function sendrow_1112 */
   }

   public void startgridcontrol111( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"111\">") ;
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
         httpContext.writeValue( httpContext.getMessage( "Linea", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Dia Hora", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Entrada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Salida", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Precio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Saldo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Lote", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Caducidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Usuario", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hoja de Ruta", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Reoperado", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Particion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Pedido", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea Entrada Almacen", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Movimiento", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         GridContainer.AddObjectProperty("GridName", "Grid");
      }
      else
      {
         GridContainer.AddObjectProperty("GridName", "Grid");
         GridContainer.AddObjectProperty("Header", subGrid_Header);
         GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV13AccionesGrupo, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( cmbavAccionesgrupo.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( cmbavAccionesgrupo.getColumnHeaderClass()));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV22CCStkLin, (byte)(12), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavCcstklin_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavCcstklin_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCcstklin_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV38DiaHora));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavDiahora_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavDiahora_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDiahora_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV68TipMovCc));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavTipmovcc_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavTipmovcc_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTipmovcc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV18CCStkDsc));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavCcstkdsc_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavCcstkdsc_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCcstkdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV16CCStkCanE, (byte)(12), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavCcstkcane_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavCcstkcane_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCcstkcane_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV17CCStkCanS, (byte)(12), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavCcstkcans_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavCcstkcans_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCcstkcans_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV27CCStkPre, (byte)(14), (byte)(5), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavCcstkpre_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavCcstkpre_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCcstkpre_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV41Exis, (byte)(12), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavExis_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavExis_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavExis_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV23CCStkLot));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavCcstklot_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavCcstklot_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCcstklot_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(AV24CCStkLotFech, "99/99/99"));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavCcstklotfech_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavCcstklotfech_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCcstklotfech_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", AV87HdrWithTags);
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavHdrwithtags_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavHdrwithtags_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHdrwithtags_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV49Hdr));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHdr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV29CCStkUsu));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavCcstkusu_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavCcstkusu_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCcstkusu_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV15CCStkBar, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCcstkbar_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV28CCStkReo, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCcstkreo_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV25CCStkPar));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCcstkpar_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV26CCStkPed, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCcstkped_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV21CCStkLen, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCcstklen_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(AV19CCStkFec, "99/99/99"));
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
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      Ddo_managefilters_Internalname = sPrefix+"DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = sPrefix+"vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = sPrefix+"TABLEFILTERS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      Datamon_Internalname = sPrefix+"DATAMON" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      edtavSaldoinicialafecha_Internalname = sPrefix+"vSALDOINICIALAFECHA" ;
      divSaldoinicial_Internalname = sPrefix+"SALDOINICIAL" ;
      grpUnnamedgroup1_Internalname = sPrefix+"UNNAMEDGROUP1" ;
      edtavExistenciascuentacorriente_Internalname = sPrefix+"vEXISTENCIASCUENTACORRIENTE" ;
      edtavPrdexialm_Internalname = sPrefix+"vPRDEXIALM" ;
      edtavExistenciasdif_Internalname = sPrefix+"vEXISTENCIASDIF" ;
      bttBtnauditarpwd_Internalname = sPrefix+"BTNAUDITARPWD" ;
      chkavActualizardatos.setInternalname( sPrefix+"vACTUALIZARDATOS" );
      chkavPwdbo.setInternalname( sPrefix+"vPWDBO" );
      divUnnamedtable6_Internalname = sPrefix+"UNNAMEDTABLE6" ;
      divControlexistencias_Internalname = sPrefix+"CONTROLEXISTENCIAS" ;
      grpUnnamedgroup2_Internalname = sPrefix+"UNNAMEDGROUP2" ;
      edtavCompras_Internalname = sPrefix+"vCOMPRAS" ;
      edtavConsumos_Internalname = sPrefix+"vCONSUMOS" ;
      edtavDevoluciones_Internalname = sPrefix+"vDEVOLUCIONES" ;
      edtavPrdcanres_Internalname = sPrefix+"vPRDCANRES" ;
      divResumenmovimientos_Internalname = sPrefix+"RESUMENMOVIMIENTOS" ;
      grpUnnamedgroup3_Internalname = sPrefix+"UNNAMEDGROUP3" ;
      tblUnnamedtable4_Internalname = sPrefix+"UNNAMEDTABLE4" ;
      grpUnnamedgroup5_Internalname = sPrefix+"UNNAMEDGROUP5" ;
      divInformacion_Internalname = sPrefix+"INFORMACION" ;
      Dvpanel_informacion_Internalname = sPrefix+"DVPANEL_INFORMACION" ;
      cmbavAccionesgrupo.setInternalname( sPrefix+"vACCIONESGRUPO" );
      edtavCcstklin_Internalname = sPrefix+"vCCSTKLIN" ;
      edtavDiahora_Internalname = sPrefix+"vDIAHORA" ;
      edtavTipmovcc_Internalname = sPrefix+"vTIPMOVCC" ;
      edtavCcstkdsc_Internalname = sPrefix+"vCCSTKDSC" ;
      edtavCcstkcane_Internalname = sPrefix+"vCCSTKCANE" ;
      edtavCcstkcans_Internalname = sPrefix+"vCCSTKCANS" ;
      edtavCcstkpre_Internalname = sPrefix+"vCCSTKPRE" ;
      edtavExis_Internalname = sPrefix+"vEXIS" ;
      edtavCcstklot_Internalname = sPrefix+"vCCSTKLOT" ;
      edtavCcstklotfech_Internalname = sPrefix+"vCCSTKLOTFECH" ;
      edtavHdrwithtags_Internalname = sPrefix+"vHDRWITHTAGS" ;
      edtavHdr_Internalname = sPrefix+"vHDR" ;
      edtavCcstkusu_Internalname = sPrefix+"vCCSTKUSU" ;
      edtavCcstkbar_Internalname = sPrefix+"vCCSTKBAR" ;
      edtavCcstkreo_Internalname = sPrefix+"vCCSTKREO" ;
      edtavCcstkpar_Internalname = sPrefix+"vCCSTKPAR" ;
      edtavCcstkped_Internalname = sPrefix+"vCCSTKPED" ;
      edtavCcstklen_Internalname = sPrefix+"vCCSTKLEN" ;
      edtavCcstkfec_Internalname = sPrefix+"vCCSTKFEC" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      Datamonjs_Internalname = sPrefix+"DATAMONJS" ;
      edtavNumeroregistros_Internalname = sPrefix+"vNUMEROREGISTROS" ;
      bttBtnauditar_Internalname = sPrefix+"BTNAUDITAR" ;
      chkavIsauthorized.setInternalname( sPrefix+"vISAUTHORIZED" );
      divTableinvisible_Internalname = sPrefix+"TABLEINVISIBLE" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Popover_hdr_Internalname = sPrefix+"POPOVER_HDR" ;
      Dvelop_confirmpanel_btnauditar_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_BTNAUDITAR" ;
      tblTabledvelop_confirmpanel_btnauditar_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_BTNAUDITAR" ;
      Dvelop_confirmpanel_eliminar_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR" ;
      tblTabledvelop_confirmpanel_eliminar_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_ELIMINAR" ;
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
      edtavCcstkusu_Visible = -1 ;
      edtavCcstkusu_Enabled = 1 ;
      edtavHdr_Jsonclick = "" ;
      edtavHdr_Visible = 0 ;
      edtavHdr_Enabled = 1 ;
      edtavHdrwithtags_Jsonclick = "" ;
      edtavHdrwithtags_Columnclass = "WWColumn" ;
      edtavHdrwithtags_Visible = -1 ;
      edtavHdrwithtags_Enabled = 1 ;
      edtavCcstklotfech_Jsonclick = "" ;
      edtavCcstklotfech_Columnclass = "WWColumn" ;
      edtavCcstklotfech_Visible = -1 ;
      edtavCcstklotfech_Enabled = 1 ;
      edtavCcstklot_Jsonclick = "" ;
      edtavCcstklot_Columnclass = "WWColumn" ;
      edtavCcstklot_Visible = -1 ;
      edtavCcstklot_Enabled = 1 ;
      edtavExis_Jsonclick = "" ;
      edtavExis_Columnclass = "WWColumn" ;
      edtavExis_Visible = -1 ;
      edtavExis_Enabled = 1 ;
      edtavCcstkpre_Jsonclick = "" ;
      edtavCcstkpre_Columnclass = "WWColumn" ;
      edtavCcstkpre_Visible = -1 ;
      edtavCcstkpre_Enabled = 1 ;
      edtavCcstkcans_Jsonclick = "" ;
      edtavCcstkcans_Columnclass = "WWColumn" ;
      edtavCcstkcans_Visible = -1 ;
      edtavCcstkcans_Enabled = 1 ;
      edtavCcstkcane_Jsonclick = "" ;
      edtavCcstkcane_Columnclass = "WWColumn" ;
      edtavCcstkcane_Visible = -1 ;
      edtavCcstkcane_Enabled = 1 ;
      edtavCcstkdsc_Jsonclick = "" ;
      edtavCcstkdsc_Columnclass = "WWColumn" ;
      edtavCcstkdsc_Visible = -1 ;
      edtavCcstkdsc_Enabled = 1 ;
      edtavTipmovcc_Jsonclick = "" ;
      edtavTipmovcc_Columnclass = "WWColumn" ;
      edtavTipmovcc_Visible = -1 ;
      edtavTipmovcc_Enabled = 1 ;
      edtavDiahora_Jsonclick = "" ;
      edtavDiahora_Columnclass = "WWColumn" ;
      edtavDiahora_Visible = -1 ;
      edtavDiahora_Enabled = 1 ;
      edtavCcstklin_Jsonclick = "" ;
      edtavCcstklin_Columnclass = "WWColumn" ;
      edtavCcstklin_Visible = -1 ;
      edtavCcstklin_Enabled = 1 ;
      cmbavAccionesgrupo.setJsonclick( "" );
      cmbavAccionesgrupo.setVisible( -1 );
      cmbavAccionesgrupo.setEnabled( 1 );
      cmbavAccionesgrupo.setColumnClass( "WWActionGroupColumn" );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtavCcstkusu_Columnheaderclass = "" ;
      edtavHdrwithtags_Columnheaderclass = "" ;
      edtavCcstklotfech_Columnheaderclass = "" ;
      edtavCcstklot_Columnheaderclass = "" ;
      edtavExis_Columnheaderclass = "" ;
      edtavCcstkpre_Columnheaderclass = "" ;
      edtavCcstkcans_Columnheaderclass = "" ;
      edtavCcstkcane_Columnheaderclass = "" ;
      edtavCcstkdsc_Columnheaderclass = "" ;
      edtavTipmovcc_Columnheaderclass = "" ;
      edtavDiahora_Columnheaderclass = "" ;
      edtavCcstklin_Columnheaderclass = "" ;
      cmbavAccionesgrupo.setColumnHeaderClass( "" );
      chkavIsauthorized.setEnabled( 1 );
      edtavNumeroregistros_Jsonclick = "" ;
      edtavNumeroregistros_Enabled = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavPrdcanres_Jsonclick = "" ;
      edtavPrdcanres_Enabled = 0 ;
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
      Grid_empowerer_Popoversingrid = "Popover_Hdr" ;
      Grid_empowerer_Hascategories = GXutil.toBoolean( -1) ;
      Grid_titlescategories_Gridtitlescategories = ";;;;;Cantidad;Cantidad;;;;Fecha;;;;;;;;;" ;
      Dvelop_confirmpanel_eliminar_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminar_Confirmationtext = "¿Desea eliminarla Linea?" ;
      Dvelop_confirmpanel_eliminar_Title = "" ;
      Dvelop_confirmpanel_btnauditar_Confirmtype = "1" ;
      Dvelop_confirmpanel_btnauditar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_btnauditar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_btnauditar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_btnauditar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_btnauditar_Confirmationtext = "¿Auditar?" ;
      Dvelop_confirmpanel_btnauditar_Title = "" ;
      Popover_hdr_Position = "Bottom" ;
      Popover_hdr_Popoverwidth = 800 ;
      Popover_hdr_Trigger = "Click" ;
      Popover_hdr_Isgriditem = GXutil.toBoolean( -1) ;
      Popover_hdr_Iteminternalname = "" ;
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
      GXCCtl = "vACCIONESGRUPO_" + sGXsfl_111_idx ;
      cmbavAccionesgrupo.setName( GXCCtl );
      cmbavAccionesgrupo.setWebtags( "" );
      if ( cmbavAccionesgrupo.getItemCount() > 0 )
      {
      }
      chkavIsauthorized.setName( "vISAUTHORIZED" );
      chkavIsauthorized.setWebtags( "" );
      chkavIsauthorized.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavIsauthorized.getInternalname(), "TitleCaption", chkavIsauthorized.getCaption(), true);
      chkavIsauthorized.setCheckedValue( "false" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV64saldoinicial',fld:'vSALDOINICIAL',pic:'ZZZZZZ9.9999'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A3348CCStkFec',fld:'CCSTKFEC',pic:''},{av:'A3356CCStkHor',fld:'CCSTKHOR',pic:''},{av:'A3345TipMovCc',fld:'TIPMOVCC',pic:''},{av:'A3357CCStkDsc',fld:'CCSTKDSC',pic:''},{av:'A3342CCStkLin',fld:'CCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'A3349CCStkPre',fld:'CCSTKPRE',pic:'ZZZZZZZ9.999'},{av:'A3343CCStkCanE',fld:'CCSTKCANE',pic:'ZZZZZZ9.9999'},{av:'A3344CCStkCanS',fld:'CCSTKCANS',pic:'ZZZZZZ9.9999'},{av:'A5722CCStkLot',fld:'CCSTKLOT',pic:''},{av:'A3350CCStkBar',fld:'CCSTKBAR',pic:'ZZZZZZZ9'},{av:'A3351CCStkReo',fld:'CCSTKREO',pic:'9'},{av:'A3352CCStkPar',fld:'CCSTKPAR',pic:''},{av:'A3358CCStkLen',fld:'CCSTKLEN',pic:'ZZZ9'},{av:'A3353CCStkPed',fld:'CCSTKPED',pic:'ZZZZZZZ9'},{av:'A3355CCStkUsu',fld:'CCSTKUSU',pic:'@!'},{av:'A13979CCStkLotFe',fld:'CCSTKLOTFE',pic:''},{av:'A810RecFec',fld:'RECFEC',pic:''},{av:'A809RecExiTeo',fld:'RECEXITEO',pic:'ZZZZZZ9.9999'},{av:'A807RecExiRea',fld:'RECEXIREA',pic:'ZZZZZZ9.9999'},{av:'A808RecExiTcc',fld:'RECEXITCC',pic:'ZZZZZZ9.9999'},{av:'A806RecExiRcc',fld:'RECEXIRCC',pic:'ZZZZZZ9.9999'},{av:'sPrefix'},{av:'AV53ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV39emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV61PrdnumIN',fld:'vPRDNUMIN',pic:''},{av:'AV82CCstkfecfrom',fld:'vCCSTKFECFROM',pic:''},{av:'AV83CCstkfecto',fld:'vCCSTKFECTO',pic:''},{av:'AV51IsAuthorized',fld:'vISAUTHORIZED',pic:''},{av:'AV97Pgmname',fld:'vPGMNAME',pic:''},{av:'AV44FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV40EntSalInv',fld:'vENTSALINV',pic:'ZZZ9',hsh:true},{av:'AV8RecExiRea',fld:'vRECEXIREA',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV76ComprasInv',fld:'vCOMPRASINV',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV77ConsumosInv',fld:'vCONSUMOSINV',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV94deletelinea',fld:'vDELETELINEA',pic:'ZZZ9',hsh:true},{av:'AV11Recfec',fld:'vRECFEC',pic:'',hsh:true},{av:'AV14Actualizardatos',fld:'vACTUALIZARDATOS',pic:''},{av:'AV63PwdBo',fld:'vPWDBO',pic:''},{av:'AV89Usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV90Station',fld:'vSTATION',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV53ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV45GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'cmbavAccionesgrupo'},{av:'edtavCcstklin_Columnheaderclass',ctrl:'vCCSTKLIN',prop:'Columnheaderclass'},{av:'edtavDiahora_Columnheaderclass',ctrl:'vDIAHORA',prop:'Columnheaderclass'},{av:'edtavTipmovcc_Columnheaderclass',ctrl:'vTIPMOVCC',prop:'Columnheaderclass'},{av:'edtavCcstkdsc_Columnheaderclass',ctrl:'vCCSTKDSC',prop:'Columnheaderclass'},{av:'edtavCcstkcane_Columnheaderclass',ctrl:'vCCSTKCANE',prop:'Columnheaderclass'},{av:'edtavCcstkcans_Columnheaderclass',ctrl:'vCCSTKCANS',prop:'Columnheaderclass'},{av:'edtavCcstkpre_Columnheaderclass',ctrl:'vCCSTKPRE',prop:'Columnheaderclass'},{av:'edtavExis_Columnheaderclass',ctrl:'vEXIS',prop:'Columnheaderclass'},{av:'edtavCcstklot_Columnheaderclass',ctrl:'vCCSTKLOT',prop:'Columnheaderclass'},{av:'edtavCcstklotfech_Columnheaderclass',ctrl:'vCCSTKLOTFECH',prop:'Columnheaderclass'},{av:'edtavHdrwithtags_Columnheaderclass',ctrl:'vHDRWITHTAGS',prop:'Columnheaderclass'},{av:'edtavCcstkusu_Columnheaderclass',ctrl:'vCCSTKUSU',prop:'Columnheaderclass'},{av:'AV55NumeroRegistros',fld:'vNUMEROREGISTROS',pic:'ZZZZZZZZZZZ9'},{av:'AV46GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV51IsAuthorized',fld:'vISAUTHORIZED',pic:''},{av:'AV52ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV47GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e131SO2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV53ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV39emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV61PrdnumIN',fld:'vPRDNUMIN',pic:''},{av:'AV82CCstkfecfrom',fld:'vCCSTKFECFROM',pic:''},{av:'AV83CCstkfecto',fld:'vCCSTKFECTO',pic:''},{av:'AV51IsAuthorized',fld:'vISAUTHORIZED',pic:''},{av:'AV97Pgmname',fld:'vPGMNAME',pic:''},{av:'AV44FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV64saldoinicial',fld:'vSALDOINICIAL',pic:'ZZZZZZ9.9999'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A3348CCStkFec',fld:'CCSTKFEC',pic:''},{av:'A3356CCStkHor',fld:'CCSTKHOR',pic:''},{av:'A3345TipMovCc',fld:'TIPMOVCC',pic:''},{av:'AV40EntSalInv',fld:'vENTSALINV',pic:'ZZZ9',hsh:true},{av:'AV8RecExiRea',fld:'vRECEXIREA',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV76ComprasInv',fld:'vCOMPRASINV',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV77ConsumosInv',fld:'vCONSUMOSINV',pic:'ZZZZZZ9.9999',hsh:true},{av:'A3357CCStkDsc',fld:'CCSTKDSC',pic:''},{av:'A3342CCStkLin',fld:'CCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'A3349CCStkPre',fld:'CCSTKPRE',pic:'ZZZZZZZ9.999'},{av:'A3343CCStkCanE',fld:'CCSTKCANE',pic:'ZZZZZZ9.9999'},{av:'A3344CCStkCanS',fld:'CCSTKCANS',pic:'ZZZZZZ9.9999'},{av:'A5722CCStkLot',fld:'CCSTKLOT',pic:''},{av:'A3350CCStkBar',fld:'CCSTKBAR',pic:'ZZZZZZZ9'},{av:'A3351CCStkReo',fld:'CCSTKREO',pic:'9'},{av:'A3352CCStkPar',fld:'CCSTKPAR',pic:''},{av:'A3358CCStkLen',fld:'CCSTKLEN',pic:'ZZZ9'},{av:'A3353CCStkPed',fld:'CCSTKPED',pic:'ZZZZZZZ9'},{av:'A3355CCStkUsu',fld:'CCSTKUSU',pic:'@!'},{av:'A13979CCStkLotFe',fld:'CCSTKLOTFE',pic:''},{av:'AV94deletelinea',fld:'vDELETELINEA',pic:'ZZZ9',hsh:true},{av:'A810RecFec',fld:'RECFEC',pic:''},{av:'AV11Recfec',fld:'vRECFEC',pic:'',hsh:true},{av:'A809RecExiTeo',fld:'RECEXITEO',pic:'ZZZZZZ9.9999'},{av:'A807RecExiRea',fld:'RECEXIREA',pic:'ZZZZZZ9.9999'},{av:'A808RecExiTcc',fld:'RECEXITCC',pic:'ZZZZZZ9.9999'},{av:'A806RecExiRcc',fld:'RECEXIRCC',pic:'ZZZZZZ9.9999'},{av:'AV14Actualizardatos',fld:'vACTUALIZARDATOS',pic:''},{av:'AV63PwdBo',fld:'vPWDBO',pic:''},{av:'AV89Usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV90Station',fld:'vSTATION',pic:'',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e141SO2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV53ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV39emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV61PrdnumIN',fld:'vPRDNUMIN',pic:''},{av:'AV82CCstkfecfrom',fld:'vCCSTKFECFROM',pic:''},{av:'AV83CCstkfecto',fld:'vCCSTKFECTO',pic:''},{av:'AV51IsAuthorized',fld:'vISAUTHORIZED',pic:''},{av:'AV97Pgmname',fld:'vPGMNAME',pic:''},{av:'AV44FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV64saldoinicial',fld:'vSALDOINICIAL',pic:'ZZZZZZ9.9999'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A3348CCStkFec',fld:'CCSTKFEC',pic:''},{av:'A3356CCStkHor',fld:'CCSTKHOR',pic:''},{av:'A3345TipMovCc',fld:'TIPMOVCC',pic:''},{av:'AV40EntSalInv',fld:'vENTSALINV',pic:'ZZZ9',hsh:true},{av:'AV8RecExiRea',fld:'vRECEXIREA',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV76ComprasInv',fld:'vCOMPRASINV',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV77ConsumosInv',fld:'vCONSUMOSINV',pic:'ZZZZZZ9.9999',hsh:true},{av:'A3357CCStkDsc',fld:'CCSTKDSC',pic:''},{av:'A3342CCStkLin',fld:'CCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'A3349CCStkPre',fld:'CCSTKPRE',pic:'ZZZZZZZ9.999'},{av:'A3343CCStkCanE',fld:'CCSTKCANE',pic:'ZZZZZZ9.9999'},{av:'A3344CCStkCanS',fld:'CCSTKCANS',pic:'ZZZZZZ9.9999'},{av:'A5722CCStkLot',fld:'CCSTKLOT',pic:''},{av:'A3350CCStkBar',fld:'CCSTKBAR',pic:'ZZZZZZZ9'},{av:'A3351CCStkReo',fld:'CCSTKREO',pic:'9'},{av:'A3352CCStkPar',fld:'CCSTKPAR',pic:''},{av:'A3358CCStkLen',fld:'CCSTKLEN',pic:'ZZZ9'},{av:'A3353CCStkPed',fld:'CCSTKPED',pic:'ZZZZZZZ9'},{av:'A3355CCStkUsu',fld:'CCSTKUSU',pic:'@!'},{av:'A13979CCStkLotFe',fld:'CCSTKLOTFE',pic:''},{av:'AV94deletelinea',fld:'vDELETELINEA',pic:'ZZZ9',hsh:true},{av:'A810RecFec',fld:'RECFEC',pic:''},{av:'AV11Recfec',fld:'vRECFEC',pic:'',hsh:true},{av:'A809RecExiTeo',fld:'RECEXITEO',pic:'ZZZZZZ9.9999'},{av:'A807RecExiRea',fld:'RECEXIREA',pic:'ZZZZZZ9.9999'},{av:'A808RecExiTcc',fld:'RECEXITCC',pic:'ZZZZZZ9.9999'},{av:'A806RecExiRcc',fld:'RECEXIRCC',pic:'ZZZZZZ9.9999'},{av:'AV14Actualizardatos',fld:'vACTUALIZARDATOS',pic:''},{av:'AV63PwdBo',fld:'vPWDBO',pic:''},{av:'AV89Usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV90Station',fld:'vSTATION',pic:'',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e221SO2',iparms:[{av:'AV64saldoinicial',fld:'vSALDOINICIAL',pic:'ZZZZZZ9.9999'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A3348CCStkFec',fld:'CCSTKFEC',pic:''},{av:'A3356CCStkHor',fld:'CCSTKHOR',pic:''},{av:'AV39emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV61PrdnumIN',fld:'vPRDNUMIN',pic:''},{av:'AV82CCstkfecfrom',fld:'vCCSTKFECFROM',pic:''},{av:'AV83CCstkfecto',fld:'vCCSTKFECTO',pic:''},{av:'A3345TipMovCc',fld:'TIPMOVCC',pic:''},{av:'AV40EntSalInv',fld:'vENTSALINV',pic:'ZZZ9',hsh:true},{av:'AV8RecExiRea',fld:'vRECEXIREA',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV76ComprasInv',fld:'vCOMPRASINV',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV77ConsumosInv',fld:'vCONSUMOSINV',pic:'ZZZZZZ9.9999',hsh:true},{av:'A3357CCStkDsc',fld:'CCSTKDSC',pic:''},{av:'A3342CCStkLin',fld:'CCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'A3349CCStkPre',fld:'CCSTKPRE',pic:'ZZZZZZZ9.999'},{av:'A3343CCStkCanE',fld:'CCSTKCANE',pic:'ZZZZZZ9.9999'},{av:'A3344CCStkCanS',fld:'CCSTKCANS',pic:'ZZZZZZ9.9999'},{av:'A5722CCStkLot',fld:'CCSTKLOT',pic:''},{av:'A3350CCStkBar',fld:'CCSTKBAR',pic:'ZZZZZZZ9'},{av:'A3351CCStkReo',fld:'CCSTKREO',pic:'9'},{av:'A3352CCStkPar',fld:'CCSTKPAR',pic:''},{av:'A3358CCStkLen',fld:'CCSTKLEN',pic:'ZZZ9'},{av:'A3353CCStkPed',fld:'CCSTKPED',pic:'ZZZZZZZ9'},{av:'A3355CCStkUsu',fld:'CCSTKUSU',pic:'@!'},{av:'A13979CCStkLotFe',fld:'CCSTKLOTFE',pic:''},{av:'AV94deletelinea',fld:'vDELETELINEA',pic:'ZZZ9',hsh:true},{av:'A810RecFec',fld:'RECFEC',pic:''},{av:'AV11Recfec',fld:'vRECFEC',pic:'',hsh:true},{av:'A809RecExiTeo',fld:'RECEXITEO',pic:'ZZZZZZ9.9999'},{av:'A807RecExiRea',fld:'RECEXIREA',pic:'ZZZZZZ9.9999'},{av:'A808RecExiTcc',fld:'RECEXITCC',pic:'ZZZZZZ9.9999'},{av:'A806RecExiRcc',fld:'RECEXIRCC',pic:'ZZZZZZ9.9999'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV41Exis',fld:'vEXIS',pic:'ZZZZZZ9.9999'},{av:'AV11Recfec',fld:'vRECFEC',pic:'',hsh:true},{av:'AV18CCStkDsc',fld:'vCCSTKDSC',pic:'',hsh:true},{av:'AV68TipMovCc',fld:'vTIPMOVCC',pic:'',hsh:true},{av:'AV22CCStkLin',fld:'vCCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'AV38DiaHora',fld:'vDIAHORA',pic:'',hsh:true},{av:'AV19CCStkFec',fld:'vCCSTKFEC',pic:''},{av:'AV27CCStkPre',fld:'vCCSTKPRE',pic:'ZZZZZZZ9.999'},{av:'AV16CCStkCanE',fld:'vCCSTKCANE',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV17CCStkCanS',fld:'vCCSTKCANS',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV23CCStkLot',fld:'vCCSTKLOT',pic:''},{av:'AV49Hdr',fld:'vHDR',pic:'',hsh:true},{av:'AV15CCStkBar',fld:'vCCSTKBAR',pic:'ZZZZZZZ9'},{av:'AV28CCStkReo',fld:'vCCSTKREO',pic:'9'},{av:'AV25CCStkPar',fld:'vCCSTKPAR',pic:''},{av:'AV21CCStkLen',fld:'vCCSTKLEN',pic:'ZZZ9'},{av:'AV26CCStkPed',fld:'vCCSTKPED',pic:'ZZZZZZZ9'},{av:'AV29CCStkUsu',fld:'vCCSTKUSU',pic:'@!',hsh:true},{av:'AV24CCStkLotFech',fld:'vCCSTKLOTFECH',pic:''},{av:'cmbavAccionesgrupo'},{av:'AV13AccionesGrupo',fld:'vACCIONESGRUPO',pic:'ZZZ9'},{av:'edtavCcstklin_Columnclass',ctrl:'vCCSTKLIN',prop:'Columnclass'},{av:'edtavDiahora_Columnclass',ctrl:'vDIAHORA',prop:'Columnclass'},{av:'edtavTipmovcc_Columnclass',ctrl:'vTIPMOVCC',prop:'Columnclass'},{av:'edtavCcstkdsc_Columnclass',ctrl:'vCCSTKDSC',prop:'Columnclass'},{av:'edtavCcstkcane_Columnclass',ctrl:'vCCSTKCANE',prop:'Columnclass'},{av:'edtavCcstkcans_Columnclass',ctrl:'vCCSTKCANS',prop:'Columnclass'},{av:'edtavCcstkpre_Columnclass',ctrl:'vCCSTKPRE',prop:'Columnclass'},{av:'edtavExis_Columnclass',ctrl:'vEXIS',prop:'Columnclass'},{av:'edtavCcstklot_Columnclass',ctrl:'vCCSTKLOT',prop:'Columnclass'},{av:'edtavCcstklotfech_Columnclass',ctrl:'vCCSTKLOTFECH',prop:'Columnclass'},{av:'edtavHdrwithtags_Columnclass',ctrl:'vHDRWITHTAGS',prop:'Columnclass'},{av:'edtavCcstkusu_Columnclass',ctrl:'vCCSTKUSU',prop:'Columnclass'},{av:'AV87HdrWithTags',fld:'vHDRWITHTAGS',pic:''},{av:'AV8RecExiRea',fld:'vRECEXIREA',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV77ConsumosInv',fld:'vCONSUMOSINV',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV76ComprasInv',fld:'vCOMPRASINV',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV61PrdnumIN',fld:'vPRDNUMIN',pic:''},{av:'AV39emprcod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e121SO2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV53ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV39emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV61PrdnumIN',fld:'vPRDNUMIN',pic:''},{av:'AV82CCstkfecfrom',fld:'vCCSTKFECFROM',pic:''},{av:'AV83CCstkfecto',fld:'vCCSTKFECTO',pic:''},{av:'AV51IsAuthorized',fld:'vISAUTHORIZED',pic:''},{av:'AV97Pgmname',fld:'vPGMNAME',pic:''},{av:'AV44FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV64saldoinicial',fld:'vSALDOINICIAL',pic:'ZZZZZZ9.9999'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A3348CCStkFec',fld:'CCSTKFEC',pic:''},{av:'A3356CCStkHor',fld:'CCSTKHOR',pic:''},{av:'A3345TipMovCc',fld:'TIPMOVCC',pic:''},{av:'AV40EntSalInv',fld:'vENTSALINV',pic:'ZZZ9',hsh:true},{av:'AV8RecExiRea',fld:'vRECEXIREA',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV76ComprasInv',fld:'vCOMPRASINV',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV77ConsumosInv',fld:'vCONSUMOSINV',pic:'ZZZZZZ9.9999',hsh:true},{av:'A3357CCStkDsc',fld:'CCSTKDSC',pic:''},{av:'A3342CCStkLin',fld:'CCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'A3349CCStkPre',fld:'CCSTKPRE',pic:'ZZZZZZZ9.999'},{av:'A3343CCStkCanE',fld:'CCSTKCANE',pic:'ZZZZZZ9.9999'},{av:'A3344CCStkCanS',fld:'CCSTKCANS',pic:'ZZZZZZ9.9999'},{av:'A5722CCStkLot',fld:'CCSTKLOT',pic:''},{av:'A3350CCStkBar',fld:'CCSTKBAR',pic:'ZZZZZZZ9'},{av:'A3351CCStkReo',fld:'CCSTKREO',pic:'9'},{av:'A3352CCStkPar',fld:'CCSTKPAR',pic:''},{av:'A3358CCStkLen',fld:'CCSTKLEN',pic:'ZZZ9'},{av:'A3353CCStkPed',fld:'CCSTKPED',pic:'ZZZZZZZ9'},{av:'A3355CCStkUsu',fld:'CCSTKUSU',pic:'@!'},{av:'A13979CCStkLotFe',fld:'CCSTKLOTFE',pic:''},{av:'AV94deletelinea',fld:'vDELETELINEA',pic:'ZZZ9',hsh:true},{av:'A810RecFec',fld:'RECFEC',pic:''},{av:'AV11Recfec',fld:'vRECFEC',pic:'',hsh:true},{av:'A809RecExiTeo',fld:'RECEXITEO',pic:'ZZZZZZ9.9999'},{av:'A807RecExiRea',fld:'RECEXIREA',pic:'ZZZZZZ9.9999'},{av:'A808RecExiTcc',fld:'RECEXITCC',pic:'ZZZZZZ9.9999'},{av:'A806RecExiRcc',fld:'RECEXIRCC',pic:'ZZZZZZ9.9999'},{av:'AV14Actualizardatos',fld:'vACTUALIZARDATOS',pic:''},{av:'AV63PwdBo',fld:'vPWDBO',pic:''},{av:'AV89Usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV90Station',fld:'vSTATION',pic:'',hsh:true},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV47GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV53ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV47GridState',fld:'vGRIDSTATE',pic:''},{av:'AV44FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV45GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'cmbavAccionesgrupo'},{av:'edtavCcstklin_Columnheaderclass',ctrl:'vCCSTKLIN',prop:'Columnheaderclass'},{av:'edtavDiahora_Columnheaderclass',ctrl:'vDIAHORA',prop:'Columnheaderclass'},{av:'edtavTipmovcc_Columnheaderclass',ctrl:'vTIPMOVCC',prop:'Columnheaderclass'},{av:'edtavCcstkdsc_Columnheaderclass',ctrl:'vCCSTKDSC',prop:'Columnheaderclass'},{av:'edtavCcstkcane_Columnheaderclass',ctrl:'vCCSTKCANE',prop:'Columnheaderclass'},{av:'edtavCcstkcans_Columnheaderclass',ctrl:'vCCSTKCANS',prop:'Columnheaderclass'},{av:'edtavCcstkpre_Columnheaderclass',ctrl:'vCCSTKPRE',prop:'Columnheaderclass'},{av:'edtavExis_Columnheaderclass',ctrl:'vEXIS',prop:'Columnheaderclass'},{av:'edtavCcstklot_Columnheaderclass',ctrl:'vCCSTKLOT',prop:'Columnheaderclass'},{av:'edtavCcstklotfech_Columnheaderclass',ctrl:'vCCSTKLOTFECH',prop:'Columnheaderclass'},{av:'edtavHdrwithtags_Columnheaderclass',ctrl:'vHDRWITHTAGS',prop:'Columnheaderclass'},{av:'edtavCcstkusu_Columnheaderclass',ctrl:'vCCSTKUSU',prop:'Columnheaderclass'},{av:'AV55NumeroRegistros',fld:'vNUMEROREGISTROS',pic:'ZZZZZZZZZZZ9'},{av:'AV46GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV51IsAuthorized',fld:'vISAUTHORIZED',pic:''},{av:'AV52ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("'DOAUDITAR'","{handler:'e111SO1',iparms:[]");
      setEventMetadata("'DOAUDITAR'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNAUDITAR.CLOSE","{handler:'e151SO2',iparms:[{av:'Dvelop_confirmpanel_btnauditar_Result',ctrl:'DVELOP_CONFIRMPANEL_BTNAUDITAR',prop:'Result'},{av:'AV39emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV61PrdnumIN',fld:'vPRDNUMIN',pic:''},{av:'AV6File',fld:'vFILE',pic:''},{av:'AV97Pgmname',fld:'vPGMNAME',pic:''},{av:'AV67Siacumular',fld:'vSIACUMULAR',pic:''},{av:'AV14Actualizardatos',fld:'vACTUALIZARDATOS',pic:''},{av:'AV63PwdBo',fld:'vPWDBO',pic:''},{av:'AV60PrdNom',fld:'vPRDNOM',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNAUDITAR.CLOSE",",oparms:[{av:'AV6File',fld:'vFILE',pic:''},{av:'AV14Actualizardatos',fld:'vACTUALIZARDATOS',pic:''},{av:'AV67Siacumular',fld:'vSIACUMULAR',pic:''},{av:'AV61PrdnumIN',fld:'vPRDNUMIN',pic:''},{av:'AV39emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV97Pgmname',fld:'vPGMNAME',pic:''}]}");
      setEventMetadata("VACCIONESGRUPO.CLICK","{handler:'e231SO2',iparms:[{av:'cmbavAccionesgrupo'},{av:'AV13AccionesGrupo',fld:'vACCIONESGRUPO',pic:'ZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV53ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV39emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV61PrdnumIN',fld:'vPRDNUMIN',pic:''},{av:'AV82CCstkfecfrom',fld:'vCCSTKFECFROM',pic:''},{av:'AV83CCstkfecto',fld:'vCCSTKFECTO',pic:''},{av:'AV51IsAuthorized',fld:'vISAUTHORIZED',pic:''},{av:'AV97Pgmname',fld:'vPGMNAME',pic:''},{av:'AV44FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV64saldoinicial',fld:'vSALDOINICIAL',pic:'ZZZZZZ9.9999'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A3348CCStkFec',fld:'CCSTKFEC',pic:''},{av:'A3356CCStkHor',fld:'CCSTKHOR',pic:''},{av:'A3345TipMovCc',fld:'TIPMOVCC',pic:''},{av:'AV40EntSalInv',fld:'vENTSALINV',pic:'ZZZ9',hsh:true},{av:'AV8RecExiRea',fld:'vRECEXIREA',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV76ComprasInv',fld:'vCOMPRASINV',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV77ConsumosInv',fld:'vCONSUMOSINV',pic:'ZZZZZZ9.9999',hsh:true},{av:'A3357CCStkDsc',fld:'CCSTKDSC',pic:''},{av:'A3342CCStkLin',fld:'CCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'A3349CCStkPre',fld:'CCSTKPRE',pic:'ZZZZZZZ9.999'},{av:'A3343CCStkCanE',fld:'CCSTKCANE',pic:'ZZZZZZ9.9999'},{av:'A3344CCStkCanS',fld:'CCSTKCANS',pic:'ZZZZZZ9.9999'},{av:'A5722CCStkLot',fld:'CCSTKLOT',pic:''},{av:'A3350CCStkBar',fld:'CCSTKBAR',pic:'ZZZZZZZ9'},{av:'A3351CCStkReo',fld:'CCSTKREO',pic:'9'},{av:'A3352CCStkPar',fld:'CCSTKPAR',pic:''},{av:'A3358CCStkLen',fld:'CCSTKLEN',pic:'ZZZ9'},{av:'A3353CCStkPed',fld:'CCSTKPED',pic:'ZZZZZZZ9'},{av:'A3355CCStkUsu',fld:'CCSTKUSU',pic:'@!'},{av:'A13979CCStkLotFe',fld:'CCSTKLOTFE',pic:''},{av:'AV94deletelinea',fld:'vDELETELINEA',pic:'ZZZ9',hsh:true},{av:'A810RecFec',fld:'RECFEC',pic:''},{av:'AV11Recfec',fld:'vRECFEC',pic:'',hsh:true},{av:'A809RecExiTeo',fld:'RECEXITEO',pic:'ZZZZZZ9.9999'},{av:'A807RecExiRea',fld:'RECEXIREA',pic:'ZZZZZZ9.9999'},{av:'A808RecExiTcc',fld:'RECEXITCC',pic:'ZZZZZZ9.9999'},{av:'A806RecExiRcc',fld:'RECEXIRCC',pic:'ZZZZZZ9.9999'},{av:'AV14Actualizardatos',fld:'vACTUALIZARDATOS',pic:''},{av:'AV63PwdBo',fld:'vPWDBO',pic:''},{av:'AV89Usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV90Station',fld:'vSTATION',pic:'',hsh:true},{av:'sPrefix'},{av:'AV18CCStkDsc',fld:'vCCSTKDSC',pic:'',hsh:true},{av:'AV68TipMovCc',fld:'vTIPMOVCC',pic:'',hsh:true},{av:'AV22CCStkLin',fld:'vCCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'AV15CCStkBar',fld:'vCCSTKBAR',pic:'ZZZZZZZ9'},{av:'AV28CCStkReo',fld:'vCCSTKREO',pic:'9'},{av:'AV25CCStkPar',fld:'vCCSTKPAR',pic:''},{av:'AV26CCStkPed',fld:'vCCSTKPED',pic:'ZZZZZZZ9'},{av:'AV21CCStkLen',fld:'vCCSTKLEN',pic:'ZZZ9'},{av:'AV19CCStkFec',fld:'vCCSTKFEC',pic:''}]");
      setEventMetadata("VACCIONESGRUPO.CLICK",",oparms:[{av:'cmbavAccionesgrupo'},{av:'AV13AccionesGrupo',fld:'vACCIONESGRUPO',pic:'ZZZ9'},{av:'AV25CCStkPar',fld:'vCCSTKPAR',pic:''},{av:'AV28CCStkReo',fld:'vCCSTKREO',pic:'9'},{av:'AV15CCStkBar',fld:'vCCSTKBAR',pic:'ZZZZZZZ9'},{av:'AV22CCStkLin',fld:'vCCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'AV61PrdnumIN',fld:'vPRDNUMIN',pic:''},{av:'AV39emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV26CCStkPed',fld:'vCCSTKPED',pic:'ZZZZZZZ9'},{av:'AV21CCStkLen',fld:'vCCSTKLEN',pic:'ZZZ9'},{av:'AV19CCStkFec',fld:'vCCSTKFEC',pic:''},{av:'AV53ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV45GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'edtavCcstklin_Columnheaderclass',ctrl:'vCCSTKLIN',prop:'Columnheaderclass'},{av:'edtavDiahora_Columnheaderclass',ctrl:'vDIAHORA',prop:'Columnheaderclass'},{av:'edtavTipmovcc_Columnheaderclass',ctrl:'vTIPMOVCC',prop:'Columnheaderclass'},{av:'edtavCcstkdsc_Columnheaderclass',ctrl:'vCCSTKDSC',prop:'Columnheaderclass'},{av:'edtavCcstkcane_Columnheaderclass',ctrl:'vCCSTKCANE',prop:'Columnheaderclass'},{av:'edtavCcstkcans_Columnheaderclass',ctrl:'vCCSTKCANS',prop:'Columnheaderclass'},{av:'edtavCcstkpre_Columnheaderclass',ctrl:'vCCSTKPRE',prop:'Columnheaderclass'},{av:'edtavExis_Columnheaderclass',ctrl:'vEXIS',prop:'Columnheaderclass'},{av:'edtavCcstklot_Columnheaderclass',ctrl:'vCCSTKLOT',prop:'Columnheaderclass'},{av:'edtavCcstklotfech_Columnheaderclass',ctrl:'vCCSTKLOTFECH',prop:'Columnheaderclass'},{av:'edtavHdrwithtags_Columnheaderclass',ctrl:'vHDRWITHTAGS',prop:'Columnheaderclass'},{av:'edtavCcstkusu_Columnheaderclass',ctrl:'vCCSTKUSU',prop:'Columnheaderclass'},{av:'AV55NumeroRegistros',fld:'vNUMEROREGISTROS',pic:'ZZZZZZZZZZZ9'},{av:'AV46GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV51IsAuthorized',fld:'vISAUTHORIZED',pic:''},{av:'AV52ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV47GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE","{handler:'e161SO2',iparms:[{av:'Dvelop_confirmpanel_eliminar_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINAR',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV53ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV39emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV61PrdnumIN',fld:'vPRDNUMIN',pic:''},{av:'AV82CCstkfecfrom',fld:'vCCSTKFECFROM',pic:''},{av:'AV83CCstkfecto',fld:'vCCSTKFECTO',pic:''},{av:'AV51IsAuthorized',fld:'vISAUTHORIZED',pic:''},{av:'AV97Pgmname',fld:'vPGMNAME',pic:''},{av:'AV44FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV64saldoinicial',fld:'vSALDOINICIAL',pic:'ZZZZZZ9.9999'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A3348CCStkFec',fld:'CCSTKFEC',pic:''},{av:'A3356CCStkHor',fld:'CCSTKHOR',pic:''},{av:'A3345TipMovCc',fld:'TIPMOVCC',pic:''},{av:'AV40EntSalInv',fld:'vENTSALINV',pic:'ZZZ9',hsh:true},{av:'AV8RecExiRea',fld:'vRECEXIREA',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV76ComprasInv',fld:'vCOMPRASINV',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV77ConsumosInv',fld:'vCONSUMOSINV',pic:'ZZZZZZ9.9999',hsh:true},{av:'A3357CCStkDsc',fld:'CCSTKDSC',pic:''},{av:'A3342CCStkLin',fld:'CCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'A3349CCStkPre',fld:'CCSTKPRE',pic:'ZZZZZZZ9.999'},{av:'A3343CCStkCanE',fld:'CCSTKCANE',pic:'ZZZZZZ9.9999'},{av:'A3344CCStkCanS',fld:'CCSTKCANS',pic:'ZZZZZZ9.9999'},{av:'A5722CCStkLot',fld:'CCSTKLOT',pic:''},{av:'A3350CCStkBar',fld:'CCSTKBAR',pic:'ZZZZZZZ9'},{av:'A3351CCStkReo',fld:'CCSTKREO',pic:'9'},{av:'A3352CCStkPar',fld:'CCSTKPAR',pic:''},{av:'A3358CCStkLen',fld:'CCSTKLEN',pic:'ZZZ9'},{av:'A3353CCStkPed',fld:'CCSTKPED',pic:'ZZZZZZZ9'},{av:'A3355CCStkUsu',fld:'CCSTKUSU',pic:'@!'},{av:'A13979CCStkLotFe',fld:'CCSTKLOTFE',pic:''},{av:'AV94deletelinea',fld:'vDELETELINEA',pic:'ZZZ9',hsh:true},{av:'A810RecFec',fld:'RECFEC',pic:''},{av:'AV11Recfec',fld:'vRECFEC',pic:'',hsh:true},{av:'A809RecExiTeo',fld:'RECEXITEO',pic:'ZZZZZZ9.9999'},{av:'A807RecExiRea',fld:'RECEXIREA',pic:'ZZZZZZ9.9999'},{av:'A808RecExiTcc',fld:'RECEXITCC',pic:'ZZZZZZ9.9999'},{av:'A806RecExiRcc',fld:'RECEXIRCC',pic:'ZZZZZZ9.9999'},{av:'AV14Actualizardatos',fld:'vACTUALIZARDATOS',pic:''},{av:'AV63PwdBo',fld:'vPWDBO',pic:''},{av:'AV89Usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV90Station',fld:'vSTATION',pic:'',hsh:true},{av:'sPrefix'},{av:'AV18CCStkDsc',fld:'vCCSTKDSC',pic:'',hsh:true},{av:'AV22CCStkLin',fld:'vCCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'AV60PrdNom',fld:'vPRDNOM',pic:''},{av:'AV68TipMovCc',fld:'vTIPMOVCC',pic:'',hsh:true},{av:'AV29CCStkUsu',fld:'vCCSTKUSU',pic:'@!',hsh:true},{av:'AV38DiaHora',fld:'vDIAHORA',pic:'',hsh:true},{av:'AV16CCStkCanE',fld:'vCCSTKCANE',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV17CCStkCanS',fld:'vCCSTKCANS',pic:'ZZZZZZ9.9999',hsh:true}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE",",oparms:[{av:'AV22CCStkLin',fld:'vCCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'AV61PrdnumIN',fld:'vPRDNUMIN',pic:''},{av:'AV39emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV53ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV45GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'cmbavAccionesgrupo'},{av:'edtavCcstklin_Columnheaderclass',ctrl:'vCCSTKLIN',prop:'Columnheaderclass'},{av:'edtavDiahora_Columnheaderclass',ctrl:'vDIAHORA',prop:'Columnheaderclass'},{av:'edtavTipmovcc_Columnheaderclass',ctrl:'vTIPMOVCC',prop:'Columnheaderclass'},{av:'edtavCcstkdsc_Columnheaderclass',ctrl:'vCCSTKDSC',prop:'Columnheaderclass'},{av:'edtavCcstkcane_Columnheaderclass',ctrl:'vCCSTKCANE',prop:'Columnheaderclass'},{av:'edtavCcstkcans_Columnheaderclass',ctrl:'vCCSTKCANS',prop:'Columnheaderclass'},{av:'edtavCcstkpre_Columnheaderclass',ctrl:'vCCSTKPRE',prop:'Columnheaderclass'},{av:'edtavExis_Columnheaderclass',ctrl:'vEXIS',prop:'Columnheaderclass'},{av:'edtavCcstklot_Columnheaderclass',ctrl:'vCCSTKLOT',prop:'Columnheaderclass'},{av:'edtavCcstklotfech_Columnheaderclass',ctrl:'vCCSTKLOTFECH',prop:'Columnheaderclass'},{av:'edtavHdrwithtags_Columnheaderclass',ctrl:'vHDRWITHTAGS',prop:'Columnheaderclass'},{av:'edtavCcstkusu_Columnheaderclass',ctrl:'vCCSTKUSU',prop:'Columnheaderclass'},{av:'AV55NumeroRegistros',fld:'vNUMEROREGISTROS',pic:'ZZZZZZZZZZZ9'},{av:'AV46GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV51IsAuthorized',fld:'vISAUTHORIZED',pic:''},{av:'AV52ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV47GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOAUDITARPWD'","{handler:'e171SO2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV53ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV39emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV61PrdnumIN',fld:'vPRDNUMIN',pic:''},{av:'AV82CCstkfecfrom',fld:'vCCSTKFECFROM',pic:''},{av:'AV83CCstkfecto',fld:'vCCSTKFECTO',pic:''},{av:'AV51IsAuthorized',fld:'vISAUTHORIZED',pic:''},{av:'AV97Pgmname',fld:'vPGMNAME',pic:''},{av:'AV44FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV64saldoinicial',fld:'vSALDOINICIAL',pic:'ZZZZZZ9.9999'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A3348CCStkFec',fld:'CCSTKFEC',pic:''},{av:'A3356CCStkHor',fld:'CCSTKHOR',pic:''},{av:'A3345TipMovCc',fld:'TIPMOVCC',pic:''},{av:'AV40EntSalInv',fld:'vENTSALINV',pic:'ZZZ9',hsh:true},{av:'AV8RecExiRea',fld:'vRECEXIREA',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV76ComprasInv',fld:'vCOMPRASINV',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV77ConsumosInv',fld:'vCONSUMOSINV',pic:'ZZZZZZ9.9999',hsh:true},{av:'A3357CCStkDsc',fld:'CCSTKDSC',pic:''},{av:'A3342CCStkLin',fld:'CCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'A3349CCStkPre',fld:'CCSTKPRE',pic:'ZZZZZZZ9.999'},{av:'A3343CCStkCanE',fld:'CCSTKCANE',pic:'ZZZZZZ9.9999'},{av:'A3344CCStkCanS',fld:'CCSTKCANS',pic:'ZZZZZZ9.9999'},{av:'A5722CCStkLot',fld:'CCSTKLOT',pic:''},{av:'A3350CCStkBar',fld:'CCSTKBAR',pic:'ZZZZZZZ9'},{av:'A3351CCStkReo',fld:'CCSTKREO',pic:'9'},{av:'A3352CCStkPar',fld:'CCSTKPAR',pic:''},{av:'A3358CCStkLen',fld:'CCSTKLEN',pic:'ZZZ9'},{av:'A3353CCStkPed',fld:'CCSTKPED',pic:'ZZZZZZZ9'},{av:'A3355CCStkUsu',fld:'CCSTKUSU',pic:'@!'},{av:'A13979CCStkLotFe',fld:'CCSTKLOTFE',pic:''},{av:'AV94deletelinea',fld:'vDELETELINEA',pic:'ZZZ9',hsh:true},{av:'A810RecFec',fld:'RECFEC',pic:''},{av:'AV11Recfec',fld:'vRECFEC',pic:'',hsh:true},{av:'A809RecExiTeo',fld:'RECEXITEO',pic:'ZZZZZZ9.9999'},{av:'A807RecExiRea',fld:'RECEXIREA',pic:'ZZZZZZ9.9999'},{av:'A808RecExiTcc',fld:'RECEXITCC',pic:'ZZZZZZ9.9999'},{av:'A806RecExiRcc',fld:'RECEXIRCC',pic:'ZZZZZZ9.9999'},{av:'AV14Actualizardatos',fld:'vACTUALIZARDATOS',pic:''},{av:'AV63PwdBo',fld:'vPWDBO',pic:''},{av:'AV89Usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV90Station',fld:'vSTATION',pic:'',hsh:true},{av:'sPrefix'}]");
      setEventMetadata("'DOAUDITARPWD'",",oparms:[{av:'AV51IsAuthorized',fld:'vISAUTHORIZED',pic:''},{av:'AV53ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV45GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'cmbavAccionesgrupo'},{av:'edtavCcstklin_Columnheaderclass',ctrl:'vCCSTKLIN',prop:'Columnheaderclass'},{av:'edtavDiahora_Columnheaderclass',ctrl:'vDIAHORA',prop:'Columnheaderclass'},{av:'edtavTipmovcc_Columnheaderclass',ctrl:'vTIPMOVCC',prop:'Columnheaderclass'},{av:'edtavCcstkdsc_Columnheaderclass',ctrl:'vCCSTKDSC',prop:'Columnheaderclass'},{av:'edtavCcstkcane_Columnheaderclass',ctrl:'vCCSTKCANE',prop:'Columnheaderclass'},{av:'edtavCcstkcans_Columnheaderclass',ctrl:'vCCSTKCANS',prop:'Columnheaderclass'},{av:'edtavCcstkpre_Columnheaderclass',ctrl:'vCCSTKPRE',prop:'Columnheaderclass'},{av:'edtavExis_Columnheaderclass',ctrl:'vEXIS',prop:'Columnheaderclass'},{av:'edtavCcstklot_Columnheaderclass',ctrl:'vCCSTKLOT',prop:'Columnheaderclass'},{av:'edtavCcstklotfech_Columnheaderclass',ctrl:'vCCSTKLOTFECH',prop:'Columnheaderclass'},{av:'edtavHdrwithtags_Columnheaderclass',ctrl:'vHDRWITHTAGS',prop:'Columnheaderclass'},{av:'edtavCcstkusu_Columnheaderclass',ctrl:'vCCSTKUSU',prop:'Columnheaderclass'},{av:'AV55NumeroRegistros',fld:'vNUMEROREGISTROS',pic:'ZZZZZZZZZZZ9'},{av:'AV46GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV52ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV47GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOEXPORTEXCEL'","{handler:'e181SO2',iparms:[{av:'AV39emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV61PrdnumIN',fld:'vPRDNUMIN',pic:''},{av:'AV60PrdNom',fld:'vPRDNOM',pic:''},{av:'AV82CCstkfecfrom',fld:'vCCSTKFECFROM',pic:''},{av:'AV83CCstkfecto',fld:'vCCSTKFECTO',pic:''},{av:'AV64saldoinicial',fld:'vSALDOINICIAL',pic:'ZZZZZZ9.9999'}]");
      setEventMetadata("'DOEXPORTEXCEL'",",oparms:[{av:'AV64saldoinicial',fld:'vSALDOINICIAL',pic:'ZZZZZZ9.9999'},{av:'AV83CCstkfecto',fld:'vCCSTKFECTO',pic:''},{av:'AV82CCstkfecfrom',fld:'vCCSTKFECFROM',pic:''},{av:'AV60PrdNom',fld:'vPRDNOM',pic:''},{av:'AV61PrdnumIN',fld:'vPRDNUMIN',pic:''},{av:'AV39emprcod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOCSV'","{handler:'e191SO2',iparms:[{av:'AV39emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV61PrdnumIN',fld:'vPRDNUMIN',pic:''},{av:'AV82CCstkfecfrom',fld:'vCCSTKFECFROM',pic:''},{av:'AV83CCstkfecto',fld:'vCCSTKFECTO',pic:''},{av:'AV64saldoinicial',fld:'vSALDOINICIAL',pic:'ZZZZZZ9.9999'}]");
      setEventMetadata("'DOCSV'",",oparms:[{av:'AV64saldoinicial',fld:'vSALDOINICIAL',pic:'ZZZZZZ9.9999'},{av:'AV83CCstkfecto',fld:'vCCSTKFECTO',pic:''},{av:'AV82CCstkfecfrom',fld:'vCCSTKFECFROM',pic:''},{av:'AV61PrdnumIN',fld:'vPRDNUMIN',pic:''},{av:'AV39emprcod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("VHDR.CLICK","{handler:'e241SO2',iparms:[{av:'AV68TipMovCc',fld:'vTIPMOVCC',pic:'',hsh:true},{av:'AV49Hdr',fld:'vHDR',pic:'',hsh:true},{av:'AV39emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV15CCStkBar',fld:'vCCSTKBAR',pic:'ZZZZZZZ9'},{av:'AV28CCStkReo',fld:'vCCSTKREO',pic:'9'},{av:'AV25CCStkPar',fld:'vCCSTKPAR',pic:''},{av:'AV61PrdnumIN',fld:'vPRDNUMIN',pic:''}]");
      setEventMetadata("VHDR.CLICK",",oparms:[{ctrl:'WWPAUX_WC'}]}");
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
      wcpOAV39emprcod = "" ;
      wcpOAV61PrdnumIN = "" ;
      wcpOAV82CCstkfecfrom = GXutil.nullDate() ;
      wcpOAV83CCstkfecto = GXutil.nullDate() ;
      wcpOAV33Compras = DecimalUtil.ZERO ;
      wcpOAV34Consumos = DecimalUtil.ZERO ;
      wcpOAV37Devoluciones = DecimalUtil.ZERO ;
      wcpOAV64saldoinicial = DecimalUtil.ZERO ;
      wcpOAV42Existenciascuentacorriente = DecimalUtil.ZERO ;
      wcpOAV59PrdExiAlm = DecimalUtil.ZERO ;
      wcpOAV58PrdCanRes = DecimalUtil.ZERO ;
      wcpOAV60PrdNom = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      Dvelop_confirmpanel_btnauditar_Result = "" ;
      Dvelop_confirmpanel_eliminar_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV39emprcod = "" ;
      AV61PrdnumIN = "" ;
      AV82CCstkfecfrom = GXutil.nullDate() ;
      AV83CCstkfecto = GXutil.nullDate() ;
      AV33Compras = DecimalUtil.ZERO ;
      AV34Consumos = DecimalUtil.ZERO ;
      AV37Devoluciones = DecimalUtil.ZERO ;
      AV64saldoinicial = DecimalUtil.ZERO ;
      AV42Existenciascuentacorriente = DecimalUtil.ZERO ;
      AV59PrdExiAlm = DecimalUtil.ZERO ;
      AV58PrdCanRes = DecimalUtil.ZERO ;
      AV60PrdNom = "" ;
      AV97Pgmname = "" ;
      AV44FilterFullText = "" ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      A3348CCStkFec = GXutil.nullDate() ;
      A3356CCStkHor = "" ;
      A3345TipMovCc = "" ;
      AV8RecExiRea = DecimalUtil.ZERO ;
      AV76ComprasInv = DecimalUtil.ZERO ;
      AV77ConsumosInv = DecimalUtil.ZERO ;
      A3357CCStkDsc = "" ;
      A3349CCStkPre = DecimalUtil.ZERO ;
      A3343CCStkCanE = DecimalUtil.ZERO ;
      A3344CCStkCanS = DecimalUtil.ZERO ;
      A5722CCStkLot = "" ;
      A3352CCStkPar = "" ;
      A3355CCStkUsu = "" ;
      A13979CCStkLotFe = GXutil.nullDate() ;
      A810RecFec = GXutil.nullDate() ;
      AV11Recfec = GXutil.nullDate() ;
      A809RecExiTeo = DecimalUtil.ZERO ;
      A807RecExiRea = DecimalUtil.ZERO ;
      A808RecExiTcc = DecimalUtil.ZERO ;
      A806RecExiRcc = DecimalUtil.ZERO ;
      AV14Actualizardatos = "" ;
      AV89Usurcod = "" ;
      AV90Station = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV52ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV47GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV6File = "" ;
      AV67Siacumular = "" ;
      Popover_hdr_Gridinternalname = "" ;
      Grid_titlescategories_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnexportexcel_Jsonclick = "" ;
      bttBtncsv_Jsonclick = "" ;
      ucDatamon = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_informacion = new com.genexus.webpanels.GXUserControl();
      AV65SaldoInicialaFecha = "" ;
      AV43ExistenciasDif = DecimalUtil.ZERO ;
      bttBtnauditarpwd_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      bttBtnauditar_Jsonclick = "" ;
      ucPopover_hdr = new com.genexus.webpanels.GXUserControl();
      ucGrid_titlescategories = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      WebComp_Wwpaux_wc_Component = "" ;
      OldWwpaux_wc = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV38DiaHora = "" ;
      AV68TipMovCc = "" ;
      AV18CCStkDsc = "" ;
      AV16CCStkCanE = DecimalUtil.ZERO ;
      AV17CCStkCanS = DecimalUtil.ZERO ;
      AV27CCStkPre = DecimalUtil.ZERO ;
      AV41Exis = DecimalUtil.ZERO ;
      AV23CCStkLot = "" ;
      AV24CCStkLotFech = GXutil.nullDate() ;
      AV87HdrWithTags = "" ;
      AV49Hdr = "" ;
      AV29CCStkUsu = "" ;
      AV25CCStkPar = "" ;
      AV19CCStkFec = GXutil.nullDate() ;
      OldWcupq_cuentacorriente_detallecompras_wc = "" ;
      WebComp_Wcupq_cuentacorriente_detallecompras_wc_Component = "" ;
      hsh = "" ;
      AV91EmprNom = "" ;
      AV12WebSession = httpContext.getWebSession();
      GXv_int8 = new byte[1] ;
      AV73WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      scmdbuf = "" ;
      H01SO2_A396EmprCod = new String[] {""} ;
      H01SO2_A719PrdNum = new String[] {""} ;
      H01SO2_A3345TipMovCc = new String[] {""} ;
      H01SO2_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      H01SO2_A3357CCStkDsc = new String[] {""} ;
      H01SO2_A3342CCStkLin = new long[1] ;
      H01SO2_A3349CCStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01SO2_A3343CCStkCanE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01SO2_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01SO2_A5722CCStkLot = new String[] {""} ;
      H01SO2_A3352CCStkPar = new String[] {""} ;
      H01SO2_A3351CCStkReo = new byte[1] ;
      H01SO2_A3350CCStkBar = new int[1] ;
      H01SO2_A3358CCStkLen = new short[1] ;
      H01SO2_A3353CCStkPed = new int[1] ;
      H01SO2_A3355CCStkUsu = new String[] {""} ;
      H01SO2_A13979CCStkLotFe = new java.util.Date[] {GXutil.nullDate()} ;
      H01SO2_A3356CCStkHor = new String[] {""} ;
      AV5CCStkHor = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV54ManageFiltersXml = "" ;
      GXt_char1 = "" ;
      AV62ProgressIndicator = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      AV85ExcelFilename = "" ;
      AV86ErrorMessage = "" ;
      GXv_date10 = new java.util.Date[1] ;
      GXv_char2 = new String[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item15 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item16 = new GXBaseCollection[1] ;
      GXv_int6 = new long[1] ;
      AV88Inc_obs = "" ;
      AV66Session = httpContext.getWebSession();
      AV48GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXv_SdtWWPGridState17 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV10Recexiteo = DecimalUtil.ZERO ;
      AV9RecExiTcc = DecimalUtil.ZERO ;
      AV7RecExiRcc = DecimalUtil.ZERO ;
      H01SO3_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      H01SO3_A719PrdNum = new String[] {""} ;
      H01SO3_A396EmprCod = new String[] {""} ;
      H01SO3_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01SO3_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01SO3_A808RecExiTcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01SO3_A806RecExiRcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      GXv_date11 = new java.util.Date[1] ;
      AV78Dif = DecimalUtil.ZERO ;
      AV79Dif2 = DecimalUtil.ZERO ;
      AV75obs = "" ;
      GXv_char3 = new String[1] ;
      GXv_decimal18 = new java.math.BigDecimal[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_char4 = new String[1] ;
      GXv_char14 = new String[1] ;
      GXv_char13 = new String[1] ;
      ucDvelop_confirmpanel_eliminar = new com.genexus.webpanels.GXUserControl();
      ucDvelop_confirmpanel_btnauditar = new com.genexus.webpanels.GXUserControl();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV39emprcod = "" ;
      sCtrlAV61PrdnumIN = "" ;
      sCtrlAV82CCstkfecfrom = "" ;
      sCtrlAV83CCstkfecto = "" ;
      sCtrlAV33Compras = "" ;
      sCtrlAV34Consumos = "" ;
      sCtrlAV37Devoluciones = "" ;
      sCtrlAV64saldoinicial = "" ;
      sCtrlAV42Existenciascuentacorriente = "" ;
      sCtrlAV59PrdExiAlm = "" ;
      sCtrlAV58PrdCanRes = "" ;
      sCtrlAV60PrdNom = "" ;
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.upq_cuentacorriente_p_wc__default(),
         new Object[] {
             new Object[] {
            H01SO2_A396EmprCod, H01SO2_A719PrdNum, H01SO2_A3345TipMovCc, H01SO2_A3348CCStkFec, H01SO2_A3357CCStkDsc, H01SO2_A3342CCStkLin, H01SO2_A3349CCStkPre, H01SO2_A3343CCStkCanE, H01SO2_A3344CCStkCanS, H01SO2_A5722CCStkLot,
            H01SO2_A3352CCStkPar, H01SO2_A3351CCStkReo, H01SO2_A3350CCStkBar, H01SO2_A3358CCStkLen, H01SO2_A3353CCStkPed, H01SO2_A3355CCStkUsu, H01SO2_A13979CCStkLotFe, H01SO2_A3356CCStkHor
            }
            , new Object[] {
            H01SO3_A810RecFec, H01SO3_A719PrdNum, H01SO3_A396EmprCod, H01SO3_A809RecExiTeo, H01SO3_A807RecExiRea, H01SO3_A808RecExiTcc, H01SO3_A806RecExiRcc
            }
         }
      );
      AV97Pgmname = "StocksQuimicos.UPQ_CuentaCorriente_p_WC" ;
      /* GeneXus formulas. */
      AV97Pgmname = "StocksQuimicos.UPQ_CuentaCorriente_p_WC" ;
      Gx_err = (short)(0) ;
      edtavSaldoinicialafecha_Enabled = 0 ;
      edtavExistenciascuentacorriente_Enabled = 0 ;
      edtavPrdexialm_Enabled = 0 ;
      edtavExistenciasdif_Enabled = 0 ;
      chkavPwdbo.setEnabled( 0 );
      edtavCompras_Enabled = 0 ;
      edtavConsumos_Enabled = 0 ;
      edtavDevoluciones_Enabled = 0 ;
      edtavPrdcanres_Enabled = 0 ;
      edtavCcstklin_Enabled = 0 ;
      edtavDiahora_Enabled = 0 ;
      edtavTipmovcc_Enabled = 0 ;
      edtavCcstkdsc_Enabled = 0 ;
      edtavCcstkcane_Enabled = 0 ;
      edtavCcstkcans_Enabled = 0 ;
      edtavCcstkpre_Enabled = 0 ;
      edtavExis_Enabled = 0 ;
      edtavCcstklot_Enabled = 0 ;
      edtavCcstklotfech_Enabled = 0 ;
      edtavHdrwithtags_Enabled = 0 ;
      edtavHdr_Enabled = 0 ;
      edtavCcstkusu_Enabled = 0 ;
      edtavCcstkbar_Enabled = 0 ;
      edtavCcstkreo_Enabled = 0 ;
      edtavCcstkpar_Enabled = 0 ;
      edtavCcstkped_Enabled = 0 ;
      edtavCcstklen_Enabled = 0 ;
      edtavCcstkfec_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
      edtavNumeroregistros_Enabled = 0 ;
      WebComp_Wcupq_cuentacorriente_detallecompras_wc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Wwpaux_wc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV53ManageFiltersExecutionStep ;
   private byte A3351CCStkReo ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte AV28CCStkReo ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte GXt_int7 ;
   private byte GXv_int8[] ;
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
   private short AV40EntSalInv ;
   private short A3358CCStkLen ;
   private short AV94deletelinea ;
   private short wbEnd ;
   private short wbStart ;
   private short AV13AccionesGrupo ;
   private short AV21CCStkLen ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV57Password ;
   private short AV35Cotexsur ;
   private short AV80i ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_111 ;
   private int nGXsfl_111_idx=1 ;
   private int A3350CCStkBar ;
   private int A3353CCStkPed ;
   private int Gridpaginationbar_Pagestoshow ;
   private int Popover_hdr_Popoverwidth ;
   private int edtavSaldoinicialafecha_Enabled ;
   private int edtavExistenciascuentacorriente_Enabled ;
   private int edtavPrdexialm_Enabled ;
   private int edtavExistenciasdif_Enabled ;
   private int edtavCompras_Enabled ;
   private int edtavConsumos_Enabled ;
   private int edtavDevoluciones_Enabled ;
   private int edtavPrdcanres_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavNumeroregistros_Enabled ;
   private int AV15CCStkBar ;
   private int AV26CCStkPed ;
   private int subGrid_Islastpage ;
   private int edtavCcstklin_Enabled ;
   private int edtavDiahora_Enabled ;
   private int edtavTipmovcc_Enabled ;
   private int edtavCcstkdsc_Enabled ;
   private int edtavCcstkcane_Enabled ;
   private int edtavCcstkcans_Enabled ;
   private int edtavCcstkpre_Enabled ;
   private int edtavExis_Enabled ;
   private int edtavCcstklot_Enabled ;
   private int edtavCcstklotfech_Enabled ;
   private int edtavHdrwithtags_Enabled ;
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
   private int AV84GridRows ;
   private int AV56PageToGo ;
   private int AV99GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavCcstklin_Visible ;
   private int edtavDiahora_Visible ;
   private int edtavTipmovcc_Visible ;
   private int edtavCcstkdsc_Visible ;
   private int edtavCcstkcane_Visible ;
   private int edtavCcstkcans_Visible ;
   private int edtavCcstkpre_Visible ;
   private int edtavExis_Visible ;
   private int edtavCcstklot_Visible ;
   private int edtavCcstklotfech_Visible ;
   private int edtavHdrwithtags_Visible ;
   private int edtavHdr_Visible ;
   private int edtavCcstkusu_Visible ;
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
   private long AV45GridCurrentPage ;
   private long AV46GridPageCount ;
   private long AV55NumeroRegistros ;
   private long AV22CCStkLin ;
   private long GRID_nCurrentRecord ;
   private long GXt_int5 ;
   private long GXv_int6[] ;
   private java.math.BigDecimal wcpOAV33Compras ;
   private java.math.BigDecimal wcpOAV34Consumos ;
   private java.math.BigDecimal wcpOAV37Devoluciones ;
   private java.math.BigDecimal wcpOAV64saldoinicial ;
   private java.math.BigDecimal wcpOAV42Existenciascuentacorriente ;
   private java.math.BigDecimal wcpOAV59PrdExiAlm ;
   private java.math.BigDecimal wcpOAV58PrdCanRes ;
   private java.math.BigDecimal AV33Compras ;
   private java.math.BigDecimal AV34Consumos ;
   private java.math.BigDecimal AV37Devoluciones ;
   private java.math.BigDecimal AV64saldoinicial ;
   private java.math.BigDecimal AV42Existenciascuentacorriente ;
   private java.math.BigDecimal AV59PrdExiAlm ;
   private java.math.BigDecimal AV58PrdCanRes ;
   private java.math.BigDecimal AV8RecExiRea ;
   private java.math.BigDecimal AV76ComprasInv ;
   private java.math.BigDecimal AV77ConsumosInv ;
   private java.math.BigDecimal A3349CCStkPre ;
   private java.math.BigDecimal A3343CCStkCanE ;
   private java.math.BigDecimal A3344CCStkCanS ;
   private java.math.BigDecimal A809RecExiTeo ;
   private java.math.BigDecimal A807RecExiRea ;
   private java.math.BigDecimal A808RecExiTcc ;
   private java.math.BigDecimal A806RecExiRcc ;
   private java.math.BigDecimal AV43ExistenciasDif ;
   private java.math.BigDecimal AV16CCStkCanE ;
   private java.math.BigDecimal AV17CCStkCanS ;
   private java.math.BigDecimal AV27CCStkPre ;
   private java.math.BigDecimal AV41Exis ;
   private java.math.BigDecimal AV10Recexiteo ;
   private java.math.BigDecimal AV9RecExiTcc ;
   private java.math.BigDecimal AV7RecExiRcc ;
   private java.math.BigDecimal AV78Dif ;
   private java.math.BigDecimal AV79Dif2 ;
   private java.math.BigDecimal GXv_decimal18[] ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private String wcpOAV39emprcod ;
   private String wcpOAV61PrdnumIN ;
   private String wcpOAV60PrdNom ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_managefilters_Activeeventkey ;
   private String Dvelop_confirmpanel_btnauditar_Result ;
   private String Dvelop_confirmpanel_eliminar_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV39emprcod ;
   private String AV61PrdnumIN ;
   private String AV60PrdNom ;
   private String sGXsfl_111_idx="0001" ;
   private String AV97Pgmname ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String A3356CCStkHor ;
   private String A3345TipMovCc ;
   private String A3357CCStkDsc ;
   private String A5722CCStkLot ;
   private String A3352CCStkPar ;
   private String A3355CCStkUsu ;
   private String AV14Actualizardatos ;
   private String AV89Usurcod ;
   private String AV90Station ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV67Siacumular ;
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
   private String Popover_hdr_Gridinternalname ;
   private String Popover_hdr_Iteminternalname ;
   private String Popover_hdr_Trigger ;
   private String Popover_hdr_Position ;
   private String Dvelop_confirmpanel_btnauditar_Title ;
   private String Dvelop_confirmpanel_btnauditar_Confirmationtext ;
   private String Dvelop_confirmpanel_btnauditar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_btnauditar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_btnauditar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_btnauditar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_btnauditar_Confirmtype ;
   private String Dvelop_confirmpanel_eliminar_Title ;
   private String Dvelop_confirmpanel_eliminar_Confirmationtext ;
   private String Dvelop_confirmpanel_eliminar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_eliminar_Confirmtype ;
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
   private String Datamon_Internalname ;
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
   private String divUnnamedtable6_Internalname ;
   private String bttBtnauditarpwd_Internalname ;
   private String bttBtnauditarpwd_Jsonclick ;
   private String grpUnnamedgroup3_Internalname ;
   private String divResumenmovimientos_Internalname ;
   private String edtavCompras_Internalname ;
   private String edtavCompras_Jsonclick ;
   private String edtavConsumos_Internalname ;
   private String edtavConsumos_Jsonclick ;
   private String edtavDevoluciones_Internalname ;
   private String edtavDevoluciones_Jsonclick ;
   private String edtavPrdcanres_Internalname ;
   private String edtavPrdcanres_Jsonclick ;
   private String grpUnnamedgroup5_Internalname ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String edtavNumeroregistros_Internalname ;
   private String edtavNumeroregistros_Jsonclick ;
   private String divTableinvisible_Internalname ;
   private String bttBtnauditar_Internalname ;
   private String bttBtnauditar_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Popover_hdr_Internalname ;
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
   private String AV38DiaHora ;
   private String edtavDiahora_Internalname ;
   private String AV68TipMovCc ;
   private String edtavTipmovcc_Internalname ;
   private String AV18CCStkDsc ;
   private String edtavCcstkdsc_Internalname ;
   private String edtavCcstkcane_Internalname ;
   private String edtavCcstkcans_Internalname ;
   private String edtavCcstkpre_Internalname ;
   private String edtavExis_Internalname ;
   private String AV23CCStkLot ;
   private String edtavCcstklot_Internalname ;
   private String edtavCcstklotfech_Internalname ;
   private String edtavHdrwithtags_Internalname ;
   private String AV49Hdr ;
   private String edtavHdr_Internalname ;
   private String AV29CCStkUsu ;
   private String edtavCcstkusu_Internalname ;
   private String edtavCcstkbar_Internalname ;
   private String edtavCcstkreo_Internalname ;
   private String AV25CCStkPar ;
   private String edtavCcstkpar_Internalname ;
   private String edtavCcstkped_Internalname ;
   private String edtavCcstklen_Internalname ;
   private String edtavCcstkfec_Internalname ;
   private String OldWcupq_cuentacorriente_detallecompras_wc ;
   private String WebComp_Wcupq_cuentacorriente_detallecompras_wc_Component ;
   private String edtavFilterfulltext_Internalname ;
   private String hsh ;
   private String AV91EmprNom ;
   private String edtavCcstklin_Columnheaderclass ;
   private String edtavDiahora_Columnheaderclass ;
   private String edtavTipmovcc_Columnheaderclass ;
   private String edtavCcstkdsc_Columnheaderclass ;
   private String edtavCcstkcane_Columnheaderclass ;
   private String edtavCcstkcans_Columnheaderclass ;
   private String edtavCcstkpre_Columnheaderclass ;
   private String edtavExis_Columnheaderclass ;
   private String edtavCcstklot_Columnheaderclass ;
   private String edtavCcstklotfech_Columnheaderclass ;
   private String edtavHdrwithtags_Columnheaderclass ;
   private String edtavCcstkusu_Columnheaderclass ;
   private String scmdbuf ;
   private String AV5CCStkHor ;
   private String edtavCcstklin_Columnclass ;
   private String edtavDiahora_Columnclass ;
   private String edtavTipmovcc_Columnclass ;
   private String edtavCcstkdsc_Columnclass ;
   private String edtavCcstkcane_Columnclass ;
   private String edtavCcstkcans_Columnclass ;
   private String edtavCcstkpre_Columnclass ;
   private String edtavExis_Columnclass ;
   private String edtavCcstklot_Columnclass ;
   private String edtavCcstklotfech_Columnclass ;
   private String edtavHdrwithtags_Columnclass ;
   private String edtavCcstkusu_Columnclass ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV75obs ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String GXv_char14[] ;
   private String GXv_char13[] ;
   private String tblTabledvelop_confirmpanel_eliminar_Internalname ;
   private String Dvelop_confirmpanel_eliminar_Internalname ;
   private String tblTabledvelop_confirmpanel_btnauditar_Internalname ;
   private String Dvelop_confirmpanel_btnauditar_Internalname ;
   private String tblUnnamedtable4_Internalname ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV39emprcod ;
   private String sCtrlAV61PrdnumIN ;
   private String sCtrlAV82CCstkfecfrom ;
   private String sCtrlAV83CCstkfecto ;
   private String sCtrlAV33Compras ;
   private String sCtrlAV34Consumos ;
   private String sCtrlAV37Devoluciones ;
   private String sCtrlAV64saldoinicial ;
   private String sCtrlAV42Existenciascuentacorriente ;
   private String sCtrlAV59PrdExiAlm ;
   private String sCtrlAV58PrdCanRes ;
   private String sCtrlAV60PrdNom ;
   private String sGXsfl_111_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtavCcstklin_Jsonclick ;
   private String edtavDiahora_Jsonclick ;
   private String edtavTipmovcc_Jsonclick ;
   private String edtavCcstkdsc_Jsonclick ;
   private String edtavCcstkcane_Jsonclick ;
   private String edtavCcstkcans_Jsonclick ;
   private String edtavCcstkpre_Jsonclick ;
   private String edtavExis_Jsonclick ;
   private String edtavCcstklot_Jsonclick ;
   private String edtavCcstklotfech_Jsonclick ;
   private String edtavHdrwithtags_Jsonclick ;
   private String edtavHdr_Jsonclick ;
   private String edtavCcstkusu_Jsonclick ;
   private String edtavCcstkbar_Jsonclick ;
   private String edtavCcstkreo_Jsonclick ;
   private String edtavCcstkpar_Jsonclick ;
   private String edtavCcstkped_Jsonclick ;
   private String edtavCcstklen_Jsonclick ;
   private String edtavCcstkfec_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV82CCstkfecfrom ;
   private java.util.Date wcpOAV83CCstkfecto ;
   private java.util.Date AV82CCstkfecfrom ;
   private java.util.Date AV83CCstkfecto ;
   private java.util.Date A3348CCStkFec ;
   private java.util.Date A13979CCStkLotFe ;
   private java.util.Date A810RecFec ;
   private java.util.Date AV11Recfec ;
   private java.util.Date AV24CCStkLotFech ;
   private java.util.Date AV19CCStkFec ;
   private java.util.Date GXv_date10[] ;
   private java.util.Date GXv_date11[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV51IsAuthorized ;
   private boolean AV63PwdBo ;
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
   private boolean Popover_hdr_Isgriditem ;
   private boolean Grid_empowerer_Hascategories ;
   private boolean wbLoad ;
   private boolean bGXsfl_111_Refreshing=false ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean bDynCreated_Wcupq_cuentacorriente_detallecompras_wc ;
   private boolean gx_refresh_fired ;
   private String AV54ManageFiltersXml ;
   private String AV44FilterFullText ;
   private String AV6File ;
   private String AV65SaldoInicialaFecha ;
   private String AV87HdrWithTags ;
   private String AV85ExcelFilename ;
   private String AV86ErrorMessage ;
   private String AV88Inc_obs ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wcupq_cuentacorriente_detallecompras_wc ;
   private GXWebComponent WebComp_Wwpaux_wc ;
   private com.genexus.webpanels.WebSession AV66Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDatamon ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_informacion ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucPopover_hdr ;
   private com.genexus.webpanels.GXUserControl ucGrid_titlescategories ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminar ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_btnauditar ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkavActualizardatos ;
   private ICheckbox chkavPwdbo ;
   private HTMLChoice cmbavAccionesgrupo ;
   private ICheckbox chkavIsauthorized ;
   private IDataStoreProvider pr_default ;
   private String[] H01SO2_A396EmprCod ;
   private String[] H01SO2_A719PrdNum ;
   private String[] H01SO2_A3345TipMovCc ;
   private java.util.Date[] H01SO2_A3348CCStkFec ;
   private String[] H01SO2_A3357CCStkDsc ;
   private long[] H01SO2_A3342CCStkLin ;
   private java.math.BigDecimal[] H01SO2_A3349CCStkPre ;
   private java.math.BigDecimal[] H01SO2_A3343CCStkCanE ;
   private java.math.BigDecimal[] H01SO2_A3344CCStkCanS ;
   private String[] H01SO2_A5722CCStkLot ;
   private String[] H01SO2_A3352CCStkPar ;
   private byte[] H01SO2_A3351CCStkReo ;
   private int[] H01SO2_A3350CCStkBar ;
   private short[] H01SO2_A3358CCStkLen ;
   private int[] H01SO2_A3353CCStkPed ;
   private String[] H01SO2_A3355CCStkUsu ;
   private java.util.Date[] H01SO2_A13979CCStkLotFe ;
   private String[] H01SO2_A3356CCStkHor ;
   private java.util.Date[] H01SO3_A810RecFec ;
   private String[] H01SO3_A719PrdNum ;
   private String[] H01SO3_A396EmprCod ;
   private java.math.BigDecimal[] H01SO3_A809RecExiTeo ;
   private java.math.BigDecimal[] H01SO3_A807RecExiRea ;
   private java.math.BigDecimal[] H01SO3_A808RecExiTcc ;
   private java.math.BigDecimal[] H01SO3_A806RecExiRcc ;
   private com.genexus.webpanels.WebSession AV12WebSession ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV52ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item15 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item16[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV47GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState17[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV48GridStateFilterValue ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV62ProgressIndicator ;
   private app.wwpbaseobjects.SdtWWPContext AV73WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
}

final  class upq_cuentacorriente_p_wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01SO2", "SELECT EmprCod, PrdNum, TipMovCc, CCStkFec, CCStkDsc, CCStkLin, CCStkPre, CCStkCanE, CCStkCanS, CCStkLot, CCStkPar, CCStkReo, CCStkBar, CCStkLen, CCStkPed, CCStkUsu, CCStkLotFe, CCStkHor FROM TXPCCSTKS WHERE (EmprCod = ? and PrdNum = ? and CCStkFec >= ?) AND (TipMovCc <> 'EC') AND (CCStkFec <= ?) ORDER BY EmprCod, PrdNum, CCStkFec, CCStkHor ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01SO3", "SELECT RecFec, PrdNum, EmprCod, RecExiTeo, RecExiRea, RecExiTcc, RecExiRcc FROM TXPRECUEN WHERE EmprCod = ? and PrdNum = ? and RecFec = ? ORDER BY EmprCod, PrdNum, RecFec ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setDate(4, (java.util.Date)parms[3]);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
      }
   }

}

