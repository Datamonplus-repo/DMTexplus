package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class recepciondeensayocliente_wc_impl extends GXWebComponent
{
   public recepciondeensayocliente_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public recepciondeensayocliente_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recepciondeensayocliente_wc_impl.class ));
   }

   public recepciondeensayocliente_wc_impl( int remoteHandle ,
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
      chkavActualizacionensayotxp = UIFactory.getCheckbox(this);
      chkavAprobacioncolorlab = UIFactory.getCheckbox(this);
      chkavSeleccionar = UIFactory.getCheckbox(this);
      cmbavLb_tiprec = new HTMLChoice();
      cmbLb_Estado = new HTMLChoice();
      chkavSeleccionareliminar = UIFactory.getCheckbox(this);
      cmbavLb_provdef = new HTMLChoice();
      cmbLb_opSt = new HTMLChoice();
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
               AV32Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32Emprcod", AV32Emprcod);
               AV5Clicod = (int)(GXutil.lval( httpContext.GetPar( "Clicod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5Clicod), 6, 0));
               AV43Lb_Cartaz = httpContext.GetPar( "Lb_Cartaz") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43Lb_Cartaz", AV43Lb_Cartaz);
               AV44Lb_colnom = httpContext.GetPar( "Lb_colnom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44Lb_colnom", AV44Lb_colnom);
               AV47Lb_numero = (int)(GXutil.lval( httpContext.GetPar( "Lb_numero"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47Lb_numero), 8, 0));
               AV46Lb_fechaR = localUtil.parseDateParm( httpContext.GetPar( "Lb_fechaR")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46Lb_fechaR", localUtil.format(AV46Lb_fechaR, "99/99/99"));
               AV45Lb_estado = (byte)(GXutil.lval( httpContext.GetPar( "Lb_estado"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45Lb_estado", GXutil.str( AV45Lb_estado, 1, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV32Emprcod,Integer.valueOf(AV5Clicod),AV43Lb_Cartaz,AV44Lb_colnom,Integer.valueOf(AV47Lb_numero),AV46Lb_fechaR,Byte.valueOf(AV45Lb_estado)});
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
      nRC_GXsfl_67 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_67"))) ;
      nGXsfl_67_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_67_idx"))) ;
      sGXsfl_67_idx = httpContext.GetPar( "sGXsfl_67_idx") ;
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
      AV35FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV32Emprcod = httpContext.GetPar( "Emprcod") ;
      AV5Clicod = (int)(GXutil.lval( httpContext.GetPar( "Clicod"))) ;
      AV43Lb_Cartaz = httpContext.GetPar( "Lb_Cartaz") ;
      AV44Lb_colnom = httpContext.GetPar( "Lb_colnom") ;
      AV47Lb_numero = (int)(GXutil.lval( httpContext.GetPar( "Lb_numero"))) ;
      AV45Lb_estado = (byte)(GXutil.lval( httpContext.GetPar( "Lb_estado"))) ;
      AV49ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV6ColumnsSelector);
      AV100TFLb_numero = (int)(GXutil.lval( httpContext.GetPar( "TFLb_numero"))) ;
      AV101TFLb_numero_To = (int)(GXutil.lval( httpContext.GetPar( "TFLb_numero_To"))) ;
      AV58TFCliCod = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod"))) ;
      AV59TFCliCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod_To"))) ;
      AV64TFLb_ArtCod = httpContext.GetPar( "TFLb_ArtCod") ;
      AV65TFLb_ArtCod_Sel = httpContext.GetPar( "TFLb_ArtCod_Sel") ;
      AV68TFLb_ColNomC = httpContext.GetPar( "TFLb_ColNomC") ;
      AV69TFLb_ColNomC_Sel = httpContext.GetPar( "TFLb_ColNomC_Sel") ;
      AV175TFLb_ColNum = (int)(GXutil.lval( httpContext.GetPar( "TFLb_ColNum"))) ;
      AV176TFLb_ColNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFLb_ColNum_To"))) ;
      AV120TFLb_Rb = CommonUtil.decimalVal( httpContext.GetPar( "TFLb_Rb"), ".") ;
      AV121TFLb_Rb_To = CommonUtil.decimalVal( httpContext.GetPar( "TFLb_Rb_To"), ".") ;
      AV108TFLb_opcion = httpContext.GetPar( "TFLb_opcion") ;
      AV109TFLb_opcion_Sel = httpContext.GetPar( "TFLb_opcion_Sel") ;
      AV102TFLb_numop = (byte)(GXutil.lval( httpContext.GetPar( "TFLb_numop"))) ;
      AV103TFLb_numop_To = (byte)(GXutil.lval( httpContext.GetPar( "TFLb_numop_To"))) ;
      AV66TFLb_Cartaz = httpContext.GetPar( "TFLb_Cartaz") ;
      AV67TFLb_Cartaz_Sel = httpContext.GetPar( "TFLb_Cartaz_Sel") ;
      AV80TFLb_FechaE = localUtil.parseDateParm( httpContext.GetPar( "TFLb_FechaE")) ;
      AV82TFLb_FechaEn = localUtil.parseDateParm( httpContext.GetPar( "TFLb_FechaEn")) ;
      AV84TFLb_FechaR = localUtil.parseDateParm( httpContext.GetPar( "TFLb_FechaR")) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV75TFLb_Estado_Sels);
      AV104TFLb_ObsCR = httpContext.GetPar( "TFLb_ObsCR") ;
      AV105TFLb_ObsCR_Sel = httpContext.GetPar( "TFLb_ObsCR_Sel") ;
      AV180Pgmname = httpContext.GetPar( "Pgmname") ;
      AV51OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV53OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV46Lb_fechaR = localUtil.parseDateParm( httpContext.GetPar( "Lb_fechaR")) ;
      AV153F_Cformu = (short)(GXutil.lval( httpContext.GetPar( "F_Cformu"))) ;
      AV157ForUltUti = localUtil.parseDateParm( httpContext.GetPar( "ForUltUti")) ;
      AV156ForNumCol = (int)(GXutil.lval( httpContext.GetPar( "ForNumCol"))) ;
      Gx_msg = httpContext.GetPar( "Gx_msg") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV127Col_Lb_numero);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV129Col_Lb_opcion);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV128Col_Lb_numeroE);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV130Col_Lb_opcionE);
      AV148ActualizacionEnsayoTxp = httpContext.GetPar( "ActualizacionEnsayoTxp") ;
      AV149AprobacionColorLab = httpContext.GetPar( "AprobacionColorLab") ;
      AV139Moda21 = (short)(GXutil.lval( httpContext.GetPar( "Moda21"))) ;
      AV174coste = (short)(GXutil.lval( httpContext.GetPar( "coste"))) ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV35FilterFullText, AV32Emprcod, AV5Clicod, AV43Lb_Cartaz, AV44Lb_colnom, AV47Lb_numero, AV45Lb_estado, AV49ManageFiltersExecutionStep, AV6ColumnsSelector, AV100TFLb_numero, AV101TFLb_numero_To, AV58TFCliCod, AV59TFCliCod_To, AV64TFLb_ArtCod, AV65TFLb_ArtCod_Sel, AV68TFLb_ColNomC, AV69TFLb_ColNomC_Sel, AV175TFLb_ColNum, AV176TFLb_ColNum_To, AV120TFLb_Rb, AV121TFLb_Rb_To, AV108TFLb_opcion, AV109TFLb_opcion_Sel, AV102TFLb_numop, AV103TFLb_numop_To, AV66TFLb_Cartaz, AV67TFLb_Cartaz_Sel, AV80TFLb_FechaE, AV82TFLb_FechaEn, AV84TFLb_FechaR, AV75TFLb_Estado_Sels, AV104TFLb_ObsCR, AV105TFLb_ObsCR_Sel, AV180Pgmname, AV51OrderedBy, AV53OrderedDsc, AV46Lb_fechaR, AV153F_Cformu, AV157ForUltUti, AV156ForNumCol, Gx_msg, AV127Col_Lb_numero, AV129Col_Lb_opcion, AV128Col_Lb_numeroE, AV130Col_Lb_opcionE, AV148ActualizacionEnsayoTxp, AV149AprobacionColorLab, AV139Moda21, AV174coste, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1TS2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Recepcion de Ensayos", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.gestionlaboratorio.recepciondeensayocliente_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV32Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV5Clicod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV43Lb_Cartaz)),GXutil.URLEncode(GXutil.rtrim(AV44Lb_colnom)),GXutil.URLEncode(GXutil.ltrimstr(AV47Lb_numero,8,0)),GXutil.URLEncode(GXutil.formatDateParm(AV46Lb_fechaR)),GXutil.URLEncode(GXutil.ltrimstr(AV45Lb_estado,1,0))}, new String[] {"Emprcod","Clicod","Lb_Cartaz","Lb_colnom","Lb_numero","Lb_fechaR","Lb_estado"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFORULTUTI", getSecureSignedToken( sPrefix, AV157ForUltUti));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV139Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOSTE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV174coste), "ZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"RecepciondeEnsayoCliente_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV180Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("gestionlaboratorio\\recepciondeensayocliente_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXH_vFILTERFULLTEXT", AV35FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_67", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_67, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV48ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV48ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV37GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV38GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV31DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV31DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV6ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV6ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV32Emprcod", GXutil.rtrim( wcpOAV32Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV5Clicod", GXutil.ltrim( localUtil.ntoc( wcpOAV5Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV43Lb_Cartaz", GXutil.rtrim( wcpOAV43Lb_Cartaz));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV44Lb_colnom", GXutil.rtrim( wcpOAV44Lb_colnom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV47Lb_numero", GXutil.ltrim( localUtil.ntoc( wcpOAV47Lb_numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV46Lb_fechaR", localUtil.dtoc( wcpOAV46Lb_fechaR, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV45Lb_estado", GXutil.ltrim( localUtil.ntoc( wcpOAV45Lb_estado, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV49ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_NUMERO", GXutil.ltrim( localUtil.ntoc( AV100TFLb_numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_NUMERO_TO", GXutil.ltrim( localUtil.ntoc( AV101TFLb_numero_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLICOD", GXutil.ltrim( localUtil.ntoc( AV58TFCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV59TFCliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_ARTCOD", GXutil.rtrim( AV64TFLb_ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_ARTCOD_SEL", GXutil.rtrim( AV65TFLb_ArtCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_COLNOMC", GXutil.rtrim( AV68TFLb_ColNomC));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_COLNOMC_SEL", GXutil.rtrim( AV69TFLb_ColNomC_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_COLNUM", GXutil.ltrim( localUtil.ntoc( AV175TFLb_ColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_COLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV176TFLb_ColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_RB", GXutil.ltrim( localUtil.ntoc( AV120TFLb_Rb, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_RB_TO", GXutil.ltrim( localUtil.ntoc( AV121TFLb_Rb_To, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_OPCION", GXutil.rtrim( AV108TFLb_opcion));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_OPCION_SEL", GXutil.rtrim( AV109TFLb_opcion_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_NUMOP", GXutil.ltrim( localUtil.ntoc( AV102TFLb_numop, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_NUMOP_TO", GXutil.ltrim( localUtil.ntoc( AV103TFLb_numop_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_CARTAZ", GXutil.rtrim( AV66TFLb_Cartaz));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_CARTAZ_SEL", GXutil.rtrim( AV67TFLb_Cartaz_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_FECHAE", localUtil.dtoc( AV80TFLb_FechaE, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_FECHAEN", localUtil.dtoc( AV82TFLb_FechaEn, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_FECHAR", localUtil.dtoc( AV84TFLb_FechaR, 0, "/"));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vTFLB_ESTADO_SELS", AV75TFLb_Estado_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vTFLB_ESTADO_SELS", AV75TFLb_Estado_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_OBSCR", AV104TFLb_ObsCR);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_OBSCR_SEL", AV105TFLb_ObsCR_Sel);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV51OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV53OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV32Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD", GXutil.ltrim( localUtil.ntoc( AV5Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_CARTAZ", GXutil.rtrim( AV43Lb_Cartaz));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_COLNOM", GXutil.rtrim( AV44Lb_colnom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_NUMERO", GXutil.ltrim( localUtil.ntoc( AV47Lb_numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_FECHAR", localUtil.dtoc( AV46Lb_fechaR, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_ESTADO", GXutil.ltrim( localUtil.ntoc( AV45Lb_estado, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"LB_TIPREC", GXutil.ltrim( localUtil.ntoc( A5597Lb_TipRec, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"LB_PROVDEF", GXutil.rtrim( A6631Lb_ProvDef));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORULTUTI", localUtil.dtoc( AV157ForUltUti, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFORULTUTI", getSecureSignedToken( sPrefix, AV157ForUltUti));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMSG", GXutil.rtrim( Gx_msg));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOL_LB_NUMERO", AV127Col_Lb_numero);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOL_LB_NUMERO", AV127Col_Lb_numero);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOL_LB_OPCION", AV129Col_Lb_opcion);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOL_LB_OPCION", AV129Col_Lb_opcion);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOL_LB_NUMEROE", AV128Col_Lb_numeroE);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOL_LB_NUMEROE", AV128Col_Lb_numeroE);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOL_LB_OPCIONE", AV130Col_Lb_opcionE);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOL_LB_OPCIONE", AV130Col_Lb_opcionE);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV39GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV39GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_ESTADO_SELSJSON", AV76TFLb_Estado_SelsJson);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPCOLCOD", GXutil.ltrim( localUtil.ntoc( AV172TipColcod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vNUMFORM", GXutil.ltrim( localUtil.ntoc( AV170Numform, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vIN_LB_NUMERO", GXutil.ltrim( localUtil.ntoc( AV132IN_Lb_numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMODA21", GXutil.ltrim( localUtil.ntoc( AV139Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV139Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_COSTEE", GXutil.ltrim( localUtil.ntoc( AV164Lb_CosteE, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_RGB", GXutil.ltrim( localUtil.ntoc( AV146Lb_RGB, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFECHA_B", localUtil.dtoc( AV143Fecha_b, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCOSTE", GXutil.ltrim( localUtil.ntoc( AV174coste, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOSTE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV174coste), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vI", GXutil.ltrim( localUtil.ntoc( AV131i, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vT", GXutil.ltrim( localUtil.ntoc( AV133t, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vIN_LB_NUMEROT", GXutil.ltrim( localUtil.ntoc( AV134IN_Lb_numerot, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vNUM_V", GXutil.ltrim( localUtil.ntoc( AV135Num_v, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_RECEPCION_Title", GXutil.rtrim( Dvelop_confirmpanel_recepcion_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_RECEPCION_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_recepcion_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_RECEPCION_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_recepcion_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_RECEPCION_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_recepcion_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_RECEPCION_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_recepcion_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_RECEPCION_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_recepcion_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_RECEPCION_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_recepcion_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARRECEPCION_Title", GXutil.rtrim( Dvelop_confirmpanel_eliminarrecepcion_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARRECEPCION_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_eliminarrecepcion_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARRECEPCION_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminarrecepcion_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARRECEPCION_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminarrecepcion_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARRECEPCION_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminarrecepcion_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARRECEPCION_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_eliminarrecepcion_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARRECEPCION_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_eliminarrecepcion_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_APROBACIONINTERNA_Title", GXutil.rtrim( Dvelop_confirmpanel_aprobacioninterna_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_APROBACIONINTERNA_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_aprobacioninterna_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_APROBACIONINTERNA_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_aprobacioninterna_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_APROBACIONINTERNA_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_aprobacioninterna_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_APROBACIONINTERNA_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_aprobacioninterna_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_APROBACIONINTERNA_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_aprobacioninterna_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_APROBACIONINTERNA_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_aprobacioninterna_Confirmtype));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_RECEPCION_Result", GXutil.rtrim( Dvelop_confirmpanel_recepcion_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARRECEPCION_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminarrecepcion_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_APROBACIONINTERNA_Result", GXutil.rtrim( Dvelop_confirmpanel_aprobacioninterna_Result));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_RECEPCION_Result", GXutil.rtrim( Dvelop_confirmpanel_recepcion_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARRECEPCION_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminarrecepcion_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_APROBACIONINTERNA_Result", GXutil.rtrim( Dvelop_confirmpanel_aprobacioninterna_Result));
   }

   public void renderHtmlCloseForm1TS2( )
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
      return "GestionLaboratorio.RecepciondeEnsayoCliente_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Recepcion de Ensayos", "") ;
   }

   public void wb1TS0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.gestionlaboratorio.recepciondeensayocliente_wc");
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 67, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\RecepciondeEnsayoCliente_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 67, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\RecepciondeEnsayoCliente_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 67, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\RecepciondeEnsayoCliente_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_23_1TS2( true) ;
      }
      else
      {
         wb_table1_23_1TS2( false) ;
      }
      return  ;
   }

   public void wb_table1_23_1TS2e( boolean wbgen )
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnrecepcion_Internalname, "gx.evt.setGridEvt("+GXutil.str( 67, 2, 0)+","+"null"+");", httpContext.getMessage( "Recepcion Ensayo", ""), bttBtnrecepcion_Jsonclick, 5, httpContext.getMessage( "Recepcion Ensayo", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DORECEPCION\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\RecepciondeEnsayoCliente_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneliminarrecepcion_Internalname, "gx.evt.setGridEvt("+GXutil.str( 67, 2, 0)+","+"null"+");", httpContext.getMessage( "Eliminar Recepcion", ""), bttBtneliminarrecepcion_Jsonclick, 7, httpContext.getMessage( "Eliminar Recepcion", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e111ts1_client"+"'", TempTags, "", 2, "HLP_GestionLaboratorio\\RecepciondeEnsayoCliente_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnaprobacioninterna_Internalname, "gx.evt.setGridEvt("+GXutil.str( 67, 2, 0)+","+"null"+");", httpContext.getMessage( "Aprobacion Interna", ""), bttBtnaprobacioninterna_Jsonclick, 7, httpContext.getMessage( "Aprobacion Interna", ""), "", StyleString, ClassString, bttBtnaprobacioninterna_Visible, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e121ts1_client"+"'", TempTags, "", 2, "HLP_GestionLaboratorio\\RecepciondeEnsayoCliente_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncancelar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 67, 2, 0)+","+"null"+");", httpContext.getMessage( "Cancelar", ""), bttBtncancelar_Jsonclick, 5, httpContext.getMessage( "Cancelar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOCANCELAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\RecepciondeEnsayoCliente_WC.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavActualizacionensayotxp.getInternalname()+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'" + sPrefix + "',false,'" + sGXsfl_67_idx + "',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavActualizacionensayotxp.getInternalname(), AV148ActualizacionEnsayoTxp, "", "", 1, chkavActualizacionensayotxp.getEnabled(), "S", httpContext.getMessage( "Actualizar Ensayo en Produccion?", ""), StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(54, this, 'S', 'N',"+"'"+sPrefix+"'"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,54);\"");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavAprobacioncolorlab.getInternalname()+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'" + sPrefix + "',false,'" + sGXsfl_67_idx + "',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavAprobacioncolorlab.getInternalname(), AV149AprobacionColorLab, "", "", 1, chkavAprobacioncolorlab.getEnabled(), "S", httpContext.getMessage( "Actualizar Color Laboratorio?", ""), StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(58, this, 'S', 'N',"+"'"+sPrefix+"'"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,58);\"");
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
         startgridcontrol67( ) ;
      }
      if ( wbEnd == 67 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_67 = (int)(nGXsfl_67_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV37GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV38GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV180Pgmname), GXutil.rtrim( localUtil.format( AV180Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GestionLaboratorio\\RecepciondeEnsayoCliente_WC.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV31DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV31DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV6ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         wb_table2_107_1TS2( true) ;
      }
      else
      {
         wb_table2_107_1TS2( false) ;
      }
      return  ;
   }

   public void wb_table2_107_1TS2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table3_112_1TS2( true) ;
      }
      else
      {
         wb_table3_112_1TS2( false) ;
      }
      return  ;
   }

   public void wb_table3_112_1TS2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table4_117_1TS2( true) ;
      }
      else
      {
         wb_table4_117_1TS2( false) ;
      }
      return  ;
   }

   public void wb_table4_117_1TS2e( boolean wbgen )
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
         app.GxWebStd.gx_div_start( httpContext, divDdo_lb_fechaeauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 125,'" + sPrefix + "',false,'" + sGXsfl_67_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_lb_fechaeauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_lb_fechaeauxdate_Internalname, localUtil.format(AV11DDO_Lb_FechaEAuxDate, "99/99/99"), localUtil.format( AV11DDO_Lb_FechaEAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,125);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_lb_fechaeauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\RecepciondeEnsayoCliente_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_lb_fechaeauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_GestionLaboratorio\\RecepciondeEnsayoCliente_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_lb_fechaenauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 127,'" + sPrefix + "',false,'" + sGXsfl_67_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_lb_fechaenauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_lb_fechaenauxdate_Internalname, localUtil.format(AV13DDO_Lb_FechaEnAuxDate, "99/99/99"), localUtil.format( AV13DDO_Lb_FechaEnAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,127);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_lb_fechaenauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\RecepciondeEnsayoCliente_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_lb_fechaenauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_GestionLaboratorio\\RecepciondeEnsayoCliente_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_lb_fecharauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'" + sPrefix + "',false,'" + sGXsfl_67_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_lb_fecharauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_lb_fecharauxdate_Internalname, localUtil.format(AV15DDO_Lb_FechaRAuxDate, "99/99/99"), localUtil.format( AV15DDO_Lb_FechaRAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,129);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_lb_fecharauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\RecepciondeEnsayoCliente_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_lb_fecharauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_GestionLaboratorio\\RecepciondeEnsayoCliente_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 67 )
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

   public void start1TS2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Recepcion de Ensayos", ""), (short)(0)) ;
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
            strup1TS0( ) ;
         }
      }
   }

   public void ws1TS2( )
   {
      start1TS2( ) ;
      evt1TS2( ) ;
   }

   public void evt1TS2( )
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
                              strup1TS0( ) ;
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
                              strup1TS0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e131TS2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1TS0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e141TS2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1TS0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e151TS2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1TS0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e161TS2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1TS0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e171TS2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_RECEPCION.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1TS0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e181TS2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINARRECEPCION.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1TS0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e191TS2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_APROBACIONINTERNA.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1TS0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e201TS2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DORECEPCION'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1TS0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoRecepcion' */
                                 e211TS2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCANCELAR'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1TS0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoCancelar' */
                                 e221TS2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1TS0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e231TS2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1TS0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e241TS2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1TS0( ) ;
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
                              strup1TS0( ) ;
                           }
                           nGXsfl_67_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_67_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_67_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_672( ) ;
                           AV55Seleccionar = GXutil.strtobool( httpContext.cgiGet( chkavSeleccionar.getInternalname())) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSeleccionar.getInternalname(), AV55Seleccionar);
                           A5532Lb_numero = (int)(localUtil.ctol( httpContext.cgiGet( edtLb_numero_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A5533Lb_ArtCod = httpContext.cgiGet( edtLb_ArtCod_Internalname) ;
                           A5538Lb_ColNomC = httpContext.cgiGet( edtLb_ColNomC_Internalname) ;
                           A5537Lb_ColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtLb_ColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A5547Lb_Rb = localUtil.ctond( httpContext.cgiGet( edtLb_Rb_Internalname)) ;
                           A5555Lb_opcion = GXutil.upper( httpContext.cgiGet( edtLb_opcion_Internalname)) ;
                           cmbavLb_tiprec.setName( cmbavLb_tiprec.getInternalname() );
                           cmbavLb_tiprec.setValue( httpContext.cgiGet( cmbavLb_tiprec.getInternalname()) );
                           AV138Lb_TipRec = (byte)(GXutil.lval( httpContext.cgiGet( cmbavLb_tiprec.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavLb_tiprec.getInternalname(), GXutil.str( AV138Lb_TipRec, 1, 0));
                           A5718Lb_numop = (byte)(localUtil.ctol( httpContext.cgiGet( edtLb_numop_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A5540Lb_Cartaz = httpContext.cgiGet( edtLb_Cartaz_Internalname) ;
                           A5541Lb_FechaE = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtLb_FechaE_Internalname), 0)) ;
                           A5567Lb_FechaEn = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtLb_FechaEn_Internalname), 0)) ;
                           A5563Lb_FechaR = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtLb_FechaR_Internalname), 0)) ;
                           cmbLb_Estado.setName( cmbLb_Estado.getInternalname() );
                           cmbLb_Estado.setValue( httpContext.cgiGet( cmbLb_Estado.getInternalname()) );
                           A5566Lb_Estado = (byte)(GXutil.lval( httpContext.cgiGet( cmbLb_Estado.getInternalname()))) ;
                           AV56SeleccionarEliminar = GXutil.strtobool( httpContext.cgiGet( chkavSeleccionareliminar.getInternalname())) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSeleccionareliminar.getInternalname(), AV56SeleccionarEliminar);
                           cmbavLb_provdef.setName( cmbavLb_provdef.getInternalname() );
                           cmbavLb_provdef.setValue( httpContext.cgiGet( cmbavLb_provdef.getInternalname()) );
                           AV144Lb_ProvDef = httpContext.cgiGet( cmbavLb_provdef.getInternalname()) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavLb_provdef.getInternalname(), AV144Lb_ProvDef);
                           A10822Lb_ObsCR = httpContext.cgiGet( edtLb_ObsCR_Internalname) ;
                           cmbLb_opSt.setName( cmbLb_opSt.getInternalname() );
                           cmbLb_opSt.setValue( httpContext.cgiGet( cmbLb_opSt.getInternalname()) );
                           A12525Lb_opSt = httpContext.cgiGet( cmbLb_opSt.getInternalname()) ;
                           n12525Lb_opSt = false ;
                           A12526Lb_opFc = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtLb_opFc_Internalname), 0)) ;
                           n12526Lb_opFc = false ;
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavF_cformu_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavF_cformu_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vF_CFORMU");
                              GX_FocusControl = edtavF_cformu_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV153F_Cformu = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavF_cformu_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV153F_Cformu), 4, 0));
                           }
                           else
                           {
                              AV153F_Cformu = (short)(localUtil.ctol( httpContext.cgiGet( edtavF_cformu_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavF_cformu_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV153F_Cformu), 4, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavFornumcol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavFornumcol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFORNUMCOL");
                              GX_FocusControl = edtavFornumcol_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV156ForNumCol = 0 ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavFornumcol_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV156ForNumCol), 8, 0));
                           }
                           else
                           {
                              AV156ForNumCol = (int)(localUtil.ctol( httpContext.cgiGet( edtavFornumcol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavFornumcol_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV156ForNumCol), 8, 0));
                           }
                           A5565Lb_CosteE = localUtil.ctond( httpContext.cgiGet( edtLb_CosteE_Internalname)) ;
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGridvariable1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGridvariable1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGRIDVARIABLE1");
                              GX_FocusControl = edtavGridvariable1_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV158GridVariable1 = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavGridvariable1_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV158GridVariable1), 4, 0));
                           }
                           else
                           {
                              AV158GridVariable1 = (short)(localUtil.ctol( httpContext.cgiGet( edtavGridvariable1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavGridvariable1_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV158GridVariable1), 4, 0));
                           }
                           A831TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtTipColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n831TipColCod = false ;
                           A5536Lb_ColNom = httpContext.cgiGet( edtLb_ColNom_Internalname) ;
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
                                       e251TS2 ();
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
                                       e261TS2 ();
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
                                       e271TS2 ();
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
                                          if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV35FilterFullText) != 0 )
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
                                    strup1TS0( ) ;
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

   public void we1TS2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1TS2( ) ;
         }
      }
   }

   public void pa1TS2( )
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
      subsflControlProps_672( ) ;
      while ( nGXsfl_67_idx <= nRC_GXsfl_67 )
      {
         sendrow_672( ) ;
         nGXsfl_67_idx = ((subGrid_Islastpage==1)&&(nGXsfl_67_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_67_idx+1) ;
         sGXsfl_67_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_67_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_672( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV35FilterFullText ,
                                 String AV32Emprcod ,
                                 int AV5Clicod ,
                                 String AV43Lb_Cartaz ,
                                 String AV44Lb_colnom ,
                                 int AV47Lb_numero ,
                                 byte AV45Lb_estado ,
                                 byte AV49ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV6ColumnsSelector ,
                                 int AV100TFLb_numero ,
                                 int AV101TFLb_numero_To ,
                                 int AV58TFCliCod ,
                                 int AV59TFCliCod_To ,
                                 String AV64TFLb_ArtCod ,
                                 String AV65TFLb_ArtCod_Sel ,
                                 String AV68TFLb_ColNomC ,
                                 String AV69TFLb_ColNomC_Sel ,
                                 int AV175TFLb_ColNum ,
                                 int AV176TFLb_ColNum_To ,
                                 java.math.BigDecimal AV120TFLb_Rb ,
                                 java.math.BigDecimal AV121TFLb_Rb_To ,
                                 String AV108TFLb_opcion ,
                                 String AV109TFLb_opcion_Sel ,
                                 byte AV102TFLb_numop ,
                                 byte AV103TFLb_numop_To ,
                                 String AV66TFLb_Cartaz ,
                                 String AV67TFLb_Cartaz_Sel ,
                                 java.util.Date AV80TFLb_FechaE ,
                                 java.util.Date AV82TFLb_FechaEn ,
                                 java.util.Date AV84TFLb_FechaR ,
                                 GXSimpleCollection<Byte> AV75TFLb_Estado_Sels ,
                                 String AV104TFLb_ObsCR ,
                                 String AV105TFLb_ObsCR_Sel ,
                                 String AV180Pgmname ,
                                 short AV51OrderedBy ,
                                 boolean AV53OrderedDsc ,
                                 java.util.Date AV46Lb_fechaR ,
                                 short AV153F_Cformu ,
                                 java.util.Date AV157ForUltUti ,
                                 int AV156ForNumCol ,
                                 String Gx_msg ,
                                 GXSimpleCollection<Integer> AV127Col_Lb_numero ,
                                 GXSimpleCollection<String> AV129Col_Lb_opcion ,
                                 GXSimpleCollection<Integer> AV128Col_Lb_numeroE ,
                                 GXSimpleCollection<String> AV130Col_Lb_opcionE ,
                                 String AV148ActualizacionEnsayoTxp ,
                                 String AV149AprobacionColorLab ,
                                 short AV139Moda21 ,
                                 short AV174coste ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e261TS2 ();
      GRID_nCurrentRecord = 0 ;
      rf1TS2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"RecepciondeEnsayoCliente_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV180Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("gestionlaboratorio\\recepciondeensayocliente_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_LB_FECHAEN", getSecureSignedToken( sPrefix, A5567Lb_FechaEn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"LB_FECHAEN", localUtil.format(A5567Lb_FechaEn, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_LB_NUMOP", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A5718Lb_numop), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"LB_NUMOP", GXutil.ltrim( localUtil.ntoc( A5718Lb_numop, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_LB_NUMERO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A5532Lb_numero), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"LB_NUMERO", GXutil.ltrim( localUtil.ntoc( A5532Lb_numero, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_LB_OPCION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A5555Lb_opcion, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"LB_OPCION", GXutil.rtrim( A5555Lb_opcion));
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
      AV148ActualizacionEnsayoTxp = ((GXutil.strcmp(GXutil.rtrim( AV148ActualizacionEnsayoTxp), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV148ActualizacionEnsayoTxp", AV148ActualizacionEnsayoTxp);
      AV149AprobacionColorLab = ((GXutil.strcmp(GXutil.rtrim( AV149AprobacionColorLab), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV149AprobacionColorLab", AV149AprobacionColorLab);
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf1TS2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV180Pgmname = "GestionLaboratorio.RecepciondeEnsayoCliente_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV180Pgmname", AV180Pgmname);
      Gx_err = (short)(0) ;
      edtavF_cformu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavF_cformu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavF_cformu_Enabled), 5, 0), !bGXsfl_67_Refreshing);
      edtavFornumcol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFornumcol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFornumcol_Enabled), 5, 0), !bGXsfl_67_Refreshing);
      edtavGridvariable1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavGridvariable1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGridvariable1_Enabled), 5, 0), !bGXsfl_67_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1TS2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(67) ;
      /* Execute user event: Refresh */
      e261TS2 ();
      nGXsfl_67_idx = 1 ;
      sGXsfl_67_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_67_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_672( ) ;
      bGXsfl_67_Refreshing = true ;
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
         subsflControlProps_672( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Byte.valueOf(A5566Lb_Estado) ,
                                              AV206Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels ,
                                              AV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext ,
                                              Integer.valueOf(AV185Gestionlaboratorio_recepciondeensayocliente_wcds_2_tflb_numero) ,
                                              Integer.valueOf(AV186Gestionlaboratorio_recepciondeensayocliente_wcds_3_tflb_numero_to) ,
                                              Integer.valueOf(AV187Gestionlaboratorio_recepciondeensayocliente_wcds_4_tfclicod) ,
                                              Integer.valueOf(AV188Gestionlaboratorio_recepciondeensayocliente_wcds_5_tfclicod_to) ,
                                              AV190Gestionlaboratorio_recepciondeensayocliente_wcds_7_tflb_artcod_sel ,
                                              AV189Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod ,
                                              AV192Gestionlaboratorio_recepciondeensayocliente_wcds_9_tflb_colnomc_sel ,
                                              AV191Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc ,
                                              Integer.valueOf(AV193Gestionlaboratorio_recepciondeensayocliente_wcds_10_tflb_colnum) ,
                                              Integer.valueOf(AV194Gestionlaboratorio_recepciondeensayocliente_wcds_11_tflb_colnum_to) ,
                                              AV195Gestionlaboratorio_recepciondeensayocliente_wcds_12_tflb_rb ,
                                              AV196Gestionlaboratorio_recepciondeensayocliente_wcds_13_tflb_rb_to ,
                                              AV198Gestionlaboratorio_recepciondeensayocliente_wcds_15_tflb_opcion_sel ,
                                              AV197Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion ,
                                              Byte.valueOf(AV199Gestionlaboratorio_recepciondeensayocliente_wcds_16_tflb_numop) ,
                                              Byte.valueOf(AV200Gestionlaboratorio_recepciondeensayocliente_wcds_17_tflb_numop_to) ,
                                              AV202Gestionlaboratorio_recepciondeensayocliente_wcds_19_tflb_cartaz_sel ,
                                              AV201Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz ,
                                              AV203Gestionlaboratorio_recepciondeensayocliente_wcds_20_tflb_fechae ,
                                              AV204Gestionlaboratorio_recepciondeensayocliente_wcds_21_tflb_fechaen ,
                                              AV205Gestionlaboratorio_recepciondeensayocliente_wcds_22_tflb_fechar ,
                                              Integer.valueOf(AV206Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels.size()) ,
                                              AV208Gestionlaboratorio_recepciondeensayocliente_wcds_25_tflb_obscr_sel ,
                                              AV207Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr ,
                                              Integer.valueOf(AV5Clicod) ,
                                              AV43Lb_Cartaz ,
                                              AV44Lb_colnom ,
                                              Integer.valueOf(AV47Lb_numero) ,
                                              Integer.valueOf(A5532Lb_numero) ,
                                              Integer.valueOf(A252CliCod) ,
                                              A5533Lb_ArtCod ,
                                              A5538Lb_ColNomC ,
                                              Integer.valueOf(A5537Lb_ColNum) ,
                                              A5547Lb_Rb ,
                                              A5555Lb_opcion ,
                                              Byte.valueOf(A5718Lb_numop) ,
                                              A5540Lb_Cartaz ,
                                              A10822Lb_ObsCR ,
                                              A5541Lb_FechaE ,
                                              A5567Lb_FechaEn ,
                                              A5563Lb_FechaR ,
                                              A5536Lb_ColNom ,
                                              Short.valueOf(AV51OrderedBy) ,
                                              Boolean.valueOf(AV53OrderedDsc) ,
                                              Byte.valueOf(A5569Lb_EstEns) ,
                                              A6461Lb_FecNoa1 ,
                                              Byte.valueOf(AV45Lb_estado) ,
                                              AV32Emprcod ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.STRING,
                                              TypeConstants.STRING
                                              }
         });
         lV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
         lV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
         lV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
         lV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
         lV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
         lV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
         lV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
         lV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
         lV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
         lV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
         lV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
         lV189Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod = GXutil.padr( GXutil.rtrim( AV189Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod), 16, "%") ;
         lV191Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc = GXutil.padr( GXutil.rtrim( AV191Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc), 13, "%") ;
         lV197Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion = GXutil.padr( GXutil.rtrim( AV197Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion), 1, "%") ;
         lV201Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV201Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz), 20, "%") ;
         lV207Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr = GXutil.concat( GXutil.rtrim( AV207Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr), "%", "") ;
         lV43Lb_Cartaz = GXutil.padr( GXutil.rtrim( AV43Lb_Cartaz), 20, "%") ;
         lV44Lb_colnom = GXutil.padr( GXutil.rtrim( AV44Lb_colnom), 13, "%") ;
         /* Using cursor H01TS2 */
         pr_default.execute(0, new Object[] {AV32Emprcod, Byte.valueOf(AV45Lb_estado), Byte.valueOf(AV45Lb_estado), lV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, Integer.valueOf(AV185Gestionlaboratorio_recepciondeensayocliente_wcds_2_tflb_numero), Integer.valueOf(AV186Gestionlaboratorio_recepciondeensayocliente_wcds_3_tflb_numero_to), Integer.valueOf(AV187Gestionlaboratorio_recepciondeensayocliente_wcds_4_tfclicod), Integer.valueOf(AV188Gestionlaboratorio_recepciondeensayocliente_wcds_5_tfclicod_to), lV189Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod, AV190Gestionlaboratorio_recepciondeensayocliente_wcds_7_tflb_artcod_sel, lV191Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc, AV192Gestionlaboratorio_recepciondeensayocliente_wcds_9_tflb_colnomc_sel, Integer.valueOf(AV193Gestionlaboratorio_recepciondeensayocliente_wcds_10_tflb_colnum), Integer.valueOf(AV194Gestionlaboratorio_recepciondeensayocliente_wcds_11_tflb_colnum_to), AV195Gestionlaboratorio_recepciondeensayocliente_wcds_12_tflb_rb, AV196Gestionlaboratorio_recepciondeensayocliente_wcds_13_tflb_rb_to, lV197Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion, AV198Gestionlaboratorio_recepciondeensayocliente_wcds_15_tflb_opcion_sel, Byte.valueOf(AV199Gestionlaboratorio_recepciondeensayocliente_wcds_16_tflb_numop), Byte.valueOf(AV200Gestionlaboratorio_recepciondeensayocliente_wcds_17_tflb_numop_to), lV201Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz, AV202Gestionlaboratorio_recepciondeensayocliente_wcds_19_tflb_cartaz_sel, AV203Gestionlaboratorio_recepciondeensayocliente_wcds_20_tflb_fechae, AV204Gestionlaboratorio_recepciondeensayocliente_wcds_21_tflb_fechaen, AV205Gestionlaboratorio_recepciondeensayocliente_wcds_22_tflb_fechar, lV207Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr, AV208Gestionlaboratorio_recepciondeensayocliente_wcds_25_tflb_obscr_sel, Integer.valueOf(AV5Clicod), lV43Lb_Cartaz, lV44Lb_colnom, Integer.valueOf(AV47Lb_numero), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_67_idx = 1 ;
         sGXsfl_67_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_67_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_672( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A5569Lb_EstEns = H01TS2_A5569Lb_EstEns[0] ;
            A6461Lb_FecNoa1 = H01TS2_A6461Lb_FecNoa1[0] ;
            A5597Lb_TipRec = H01TS2_A5597Lb_TipRec[0] ;
            A6631Lb_ProvDef = H01TS2_A6631Lb_ProvDef[0] ;
            A396EmprCod = H01TS2_A396EmprCod[0] ;
            A5536Lb_ColNom = H01TS2_A5536Lb_ColNom[0] ;
            A831TipColCod = H01TS2_A831TipColCod[0] ;
            n831TipColCod = H01TS2_n831TipColCod[0] ;
            A5565Lb_CosteE = H01TS2_A5565Lb_CosteE[0] ;
            A279CliNom = H01TS2_A279CliNom[0] ;
            A12526Lb_opFc = H01TS2_A12526Lb_opFc[0] ;
            n12526Lb_opFc = H01TS2_n12526Lb_opFc[0] ;
            A12525Lb_opSt = H01TS2_A12525Lb_opSt[0] ;
            n12525Lb_opSt = H01TS2_n12525Lb_opSt[0] ;
            A10822Lb_ObsCR = H01TS2_A10822Lb_ObsCR[0] ;
            A5566Lb_Estado = H01TS2_A5566Lb_Estado[0] ;
            A5563Lb_FechaR = H01TS2_A5563Lb_FechaR[0] ;
            A5567Lb_FechaEn = H01TS2_A5567Lb_FechaEn[0] ;
            A5541Lb_FechaE = H01TS2_A5541Lb_FechaE[0] ;
            A5540Lb_Cartaz = H01TS2_A5540Lb_Cartaz[0] ;
            A5718Lb_numop = H01TS2_A5718Lb_numop[0] ;
            A5555Lb_opcion = H01TS2_A5555Lb_opcion[0] ;
            A5547Lb_Rb = H01TS2_A5547Lb_Rb[0] ;
            A5537Lb_ColNum = H01TS2_A5537Lb_ColNum[0] ;
            A5538Lb_ColNomC = H01TS2_A5538Lb_ColNomC[0] ;
            A5533Lb_ArtCod = H01TS2_A5533Lb_ArtCod[0] ;
            A252CliCod = H01TS2_A252CliCod[0] ;
            A5532Lb_numero = H01TS2_A5532Lb_numero[0] ;
            A5569Lb_EstEns = H01TS2_A5569Lb_EstEns[0] ;
            A5597Lb_TipRec = H01TS2_A5597Lb_TipRec[0] ;
            A5536Lb_ColNom = H01TS2_A5536Lb_ColNom[0] ;
            A831TipColCod = H01TS2_A831TipColCod[0] ;
            n831TipColCod = H01TS2_n831TipColCod[0] ;
            A5541Lb_FechaE = H01TS2_A5541Lb_FechaE[0] ;
            A5540Lb_Cartaz = H01TS2_A5540Lb_Cartaz[0] ;
            A5547Lb_Rb = H01TS2_A5547Lb_Rb[0] ;
            A5537Lb_ColNum = H01TS2_A5537Lb_ColNum[0] ;
            A5538Lb_ColNomC = H01TS2_A5538Lb_ColNomC[0] ;
            A5533Lb_ArtCod = H01TS2_A5533Lb_ArtCod[0] ;
            A252CliCod = H01TS2_A252CliCod[0] ;
            A279CliNom = H01TS2_A279CliNom[0] ;
            e271TS2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(67) ;
         wb1TS0( ) ;
      }
      bGXsfl_67_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1TS2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORULTUTI", localUtil.dtoc( AV157ForUltUti, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFORULTUTI", getSecureSignedToken( sPrefix, AV157ForUltUti));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_LB_FECHAEN"+"_"+sGXsfl_67_idx, getSecureSignedToken( sPrefix+sGXsfl_67_idx, A5567Lb_FechaEn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMODA21", GXutil.ltrim( localUtil.ntoc( AV139Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV139Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_LB_NUMOP"+"_"+sGXsfl_67_idx, getSecureSignedToken( sPrefix+sGXsfl_67_idx, localUtil.format( DecimalUtil.doubleToDec(A5718Lb_numop), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_LB_NUMERO"+"_"+sGXsfl_67_idx, getSecureSignedToken( sPrefix+sGXsfl_67_idx, localUtil.format( DecimalUtil.doubleToDec(A5532Lb_numero), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCOSTE", GXutil.ltrim( localUtil.ntoc( AV174coste, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOSTE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV174coste), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_LB_OPCION"+"_"+sGXsfl_67_idx, getSecureSignedToken( sPrefix+sGXsfl_67_idx, GXutil.rtrim( localUtil.format( A5555Lb_opcion, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_LB_ESTADO"+"_"+sGXsfl_67_idx, getSecureSignedToken( sPrefix+sGXsfl_67_idx, localUtil.format( DecimalUtil.doubleToDec(A5566Lb_Estado), "9")));
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
      AV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = AV35FilterFullText ;
      AV185Gestionlaboratorio_recepciondeensayocliente_wcds_2_tflb_numero = AV100TFLb_numero ;
      AV186Gestionlaboratorio_recepciondeensayocliente_wcds_3_tflb_numero_to = AV101TFLb_numero_To ;
      AV187Gestionlaboratorio_recepciondeensayocliente_wcds_4_tfclicod = AV58TFCliCod ;
      AV188Gestionlaboratorio_recepciondeensayocliente_wcds_5_tfclicod_to = AV59TFCliCod_To ;
      AV189Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod = AV64TFLb_ArtCod ;
      AV190Gestionlaboratorio_recepciondeensayocliente_wcds_7_tflb_artcod_sel = AV65TFLb_ArtCod_Sel ;
      AV191Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc = AV68TFLb_ColNomC ;
      AV192Gestionlaboratorio_recepciondeensayocliente_wcds_9_tflb_colnomc_sel = AV69TFLb_ColNomC_Sel ;
      AV193Gestionlaboratorio_recepciondeensayocliente_wcds_10_tflb_colnum = AV175TFLb_ColNum ;
      AV194Gestionlaboratorio_recepciondeensayocliente_wcds_11_tflb_colnum_to = AV176TFLb_ColNum_To ;
      AV195Gestionlaboratorio_recepciondeensayocliente_wcds_12_tflb_rb = AV120TFLb_Rb ;
      AV196Gestionlaboratorio_recepciondeensayocliente_wcds_13_tflb_rb_to = AV121TFLb_Rb_To ;
      AV197Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion = AV108TFLb_opcion ;
      AV198Gestionlaboratorio_recepciondeensayocliente_wcds_15_tflb_opcion_sel = AV109TFLb_opcion_Sel ;
      AV199Gestionlaboratorio_recepciondeensayocliente_wcds_16_tflb_numop = AV102TFLb_numop ;
      AV200Gestionlaboratorio_recepciondeensayocliente_wcds_17_tflb_numop_to = AV103TFLb_numop_To ;
      AV201Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz = AV66TFLb_Cartaz ;
      AV202Gestionlaboratorio_recepciondeensayocliente_wcds_19_tflb_cartaz_sel = AV67TFLb_Cartaz_Sel ;
      AV203Gestionlaboratorio_recepciondeensayocliente_wcds_20_tflb_fechae = AV80TFLb_FechaE ;
      AV204Gestionlaboratorio_recepciondeensayocliente_wcds_21_tflb_fechaen = AV82TFLb_FechaEn ;
      AV205Gestionlaboratorio_recepciondeensayocliente_wcds_22_tflb_fechar = AV84TFLb_FechaR ;
      AV206Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels = AV75TFLb_Estado_Sels ;
      AV207Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr = AV104TFLb_ObsCR ;
      AV208Gestionlaboratorio_recepciondeensayocliente_wcds_25_tflb_obscr_sel = AV105TFLb_ObsCR_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Byte.valueOf(A5566Lb_Estado) ,
                                           AV206Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels ,
                                           AV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext ,
                                           Integer.valueOf(AV185Gestionlaboratorio_recepciondeensayocliente_wcds_2_tflb_numero) ,
                                           Integer.valueOf(AV186Gestionlaboratorio_recepciondeensayocliente_wcds_3_tflb_numero_to) ,
                                           Integer.valueOf(AV187Gestionlaboratorio_recepciondeensayocliente_wcds_4_tfclicod) ,
                                           Integer.valueOf(AV188Gestionlaboratorio_recepciondeensayocliente_wcds_5_tfclicod_to) ,
                                           AV190Gestionlaboratorio_recepciondeensayocliente_wcds_7_tflb_artcod_sel ,
                                           AV189Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod ,
                                           AV192Gestionlaboratorio_recepciondeensayocliente_wcds_9_tflb_colnomc_sel ,
                                           AV191Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc ,
                                           Integer.valueOf(AV193Gestionlaboratorio_recepciondeensayocliente_wcds_10_tflb_colnum) ,
                                           Integer.valueOf(AV194Gestionlaboratorio_recepciondeensayocliente_wcds_11_tflb_colnum_to) ,
                                           AV195Gestionlaboratorio_recepciondeensayocliente_wcds_12_tflb_rb ,
                                           AV196Gestionlaboratorio_recepciondeensayocliente_wcds_13_tflb_rb_to ,
                                           AV198Gestionlaboratorio_recepciondeensayocliente_wcds_15_tflb_opcion_sel ,
                                           AV197Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion ,
                                           Byte.valueOf(AV199Gestionlaboratorio_recepciondeensayocliente_wcds_16_tflb_numop) ,
                                           Byte.valueOf(AV200Gestionlaboratorio_recepciondeensayocliente_wcds_17_tflb_numop_to) ,
                                           AV202Gestionlaboratorio_recepciondeensayocliente_wcds_19_tflb_cartaz_sel ,
                                           AV201Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz ,
                                           AV203Gestionlaboratorio_recepciondeensayocliente_wcds_20_tflb_fechae ,
                                           AV204Gestionlaboratorio_recepciondeensayocliente_wcds_21_tflb_fechaen ,
                                           AV205Gestionlaboratorio_recepciondeensayocliente_wcds_22_tflb_fechar ,
                                           Integer.valueOf(AV206Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels.size()) ,
                                           AV208Gestionlaboratorio_recepciondeensayocliente_wcds_25_tflb_obscr_sel ,
                                           AV207Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr ,
                                           Integer.valueOf(AV5Clicod) ,
                                           AV43Lb_Cartaz ,
                                           AV44Lb_colnom ,
                                           Integer.valueOf(AV47Lb_numero) ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A5533Lb_ArtCod ,
                                           A5538Lb_ColNomC ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           A5547Lb_Rb ,
                                           A5555Lb_opcion ,
                                           Byte.valueOf(A5718Lb_numop) ,
                                           A5540Lb_Cartaz ,
                                           A10822Lb_ObsCR ,
                                           A5541Lb_FechaE ,
                                           A5567Lb_FechaEn ,
                                           A5563Lb_FechaR ,
                                           A5536Lb_ColNom ,
                                           Short.valueOf(AV51OrderedBy) ,
                                           Boolean.valueOf(AV53OrderedDsc) ,
                                           Byte.valueOf(A5569Lb_EstEns) ,
                                           A6461Lb_FecNoa1 ,
                                           Byte.valueOf(AV45Lb_estado) ,
                                           AV32Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV189Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod = GXutil.padr( GXutil.rtrim( AV189Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod), 16, "%") ;
      lV191Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc = GXutil.padr( GXutil.rtrim( AV191Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc), 13, "%") ;
      lV197Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion = GXutil.padr( GXutil.rtrim( AV197Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion), 1, "%") ;
      lV201Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV201Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz), 20, "%") ;
      lV207Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr = GXutil.concat( GXutil.rtrim( AV207Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr), "%", "") ;
      lV43Lb_Cartaz = GXutil.padr( GXutil.rtrim( AV43Lb_Cartaz), 20, "%") ;
      lV44Lb_colnom = GXutil.padr( GXutil.rtrim( AV44Lb_colnom), 13, "%") ;
      /* Using cursor H01TS3 */
      pr_default.execute(1, new Object[] {AV32Emprcod, Byte.valueOf(AV45Lb_estado), Byte.valueOf(AV45Lb_estado), lV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, Integer.valueOf(AV185Gestionlaboratorio_recepciondeensayocliente_wcds_2_tflb_numero), Integer.valueOf(AV186Gestionlaboratorio_recepciondeensayocliente_wcds_3_tflb_numero_to), Integer.valueOf(AV187Gestionlaboratorio_recepciondeensayocliente_wcds_4_tfclicod), Integer.valueOf(AV188Gestionlaboratorio_recepciondeensayocliente_wcds_5_tfclicod_to), lV189Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod, AV190Gestionlaboratorio_recepciondeensayocliente_wcds_7_tflb_artcod_sel, lV191Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc, AV192Gestionlaboratorio_recepciondeensayocliente_wcds_9_tflb_colnomc_sel, Integer.valueOf(AV193Gestionlaboratorio_recepciondeensayocliente_wcds_10_tflb_colnum), Integer.valueOf(AV194Gestionlaboratorio_recepciondeensayocliente_wcds_11_tflb_colnum_to), AV195Gestionlaboratorio_recepciondeensayocliente_wcds_12_tflb_rb, AV196Gestionlaboratorio_recepciondeensayocliente_wcds_13_tflb_rb_to, lV197Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion, AV198Gestionlaboratorio_recepciondeensayocliente_wcds_15_tflb_opcion_sel, Byte.valueOf(AV199Gestionlaboratorio_recepciondeensayocliente_wcds_16_tflb_numop), Byte.valueOf(AV200Gestionlaboratorio_recepciondeensayocliente_wcds_17_tflb_numop_to), lV201Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz, AV202Gestionlaboratorio_recepciondeensayocliente_wcds_19_tflb_cartaz_sel, AV203Gestionlaboratorio_recepciondeensayocliente_wcds_20_tflb_fechae, AV204Gestionlaboratorio_recepciondeensayocliente_wcds_21_tflb_fechaen, AV205Gestionlaboratorio_recepciondeensayocliente_wcds_22_tflb_fechar, lV207Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr, AV208Gestionlaboratorio_recepciondeensayocliente_wcds_25_tflb_obscr_sel, Integer.valueOf(AV5Clicod), lV43Lb_Cartaz, lV44Lb_colnom, Integer.valueOf(AV47Lb_numero)});
      GRID_nRecordCount = H01TS3_AGRID_nRecordCount[0] ;
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
      AV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = AV35FilterFullText ;
      AV185Gestionlaboratorio_recepciondeensayocliente_wcds_2_tflb_numero = AV100TFLb_numero ;
      AV186Gestionlaboratorio_recepciondeensayocliente_wcds_3_tflb_numero_to = AV101TFLb_numero_To ;
      AV187Gestionlaboratorio_recepciondeensayocliente_wcds_4_tfclicod = AV58TFCliCod ;
      AV188Gestionlaboratorio_recepciondeensayocliente_wcds_5_tfclicod_to = AV59TFCliCod_To ;
      AV189Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod = AV64TFLb_ArtCod ;
      AV190Gestionlaboratorio_recepciondeensayocliente_wcds_7_tflb_artcod_sel = AV65TFLb_ArtCod_Sel ;
      AV191Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc = AV68TFLb_ColNomC ;
      AV192Gestionlaboratorio_recepciondeensayocliente_wcds_9_tflb_colnomc_sel = AV69TFLb_ColNomC_Sel ;
      AV193Gestionlaboratorio_recepciondeensayocliente_wcds_10_tflb_colnum = AV175TFLb_ColNum ;
      AV194Gestionlaboratorio_recepciondeensayocliente_wcds_11_tflb_colnum_to = AV176TFLb_ColNum_To ;
      AV195Gestionlaboratorio_recepciondeensayocliente_wcds_12_tflb_rb = AV120TFLb_Rb ;
      AV196Gestionlaboratorio_recepciondeensayocliente_wcds_13_tflb_rb_to = AV121TFLb_Rb_To ;
      AV197Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion = AV108TFLb_opcion ;
      AV198Gestionlaboratorio_recepciondeensayocliente_wcds_15_tflb_opcion_sel = AV109TFLb_opcion_Sel ;
      AV199Gestionlaboratorio_recepciondeensayocliente_wcds_16_tflb_numop = AV102TFLb_numop ;
      AV200Gestionlaboratorio_recepciondeensayocliente_wcds_17_tflb_numop_to = AV103TFLb_numop_To ;
      AV201Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz = AV66TFLb_Cartaz ;
      AV202Gestionlaboratorio_recepciondeensayocliente_wcds_19_tflb_cartaz_sel = AV67TFLb_Cartaz_Sel ;
      AV203Gestionlaboratorio_recepciondeensayocliente_wcds_20_tflb_fechae = AV80TFLb_FechaE ;
      AV204Gestionlaboratorio_recepciondeensayocliente_wcds_21_tflb_fechaen = AV82TFLb_FechaEn ;
      AV205Gestionlaboratorio_recepciondeensayocliente_wcds_22_tflb_fechar = AV84TFLb_FechaR ;
      AV206Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels = AV75TFLb_Estado_Sels ;
      AV207Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr = AV104TFLb_ObsCR ;
      AV208Gestionlaboratorio_recepciondeensayocliente_wcds_25_tflb_obscr_sel = AV105TFLb_ObsCR_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV35FilterFullText, AV32Emprcod, AV5Clicod, AV43Lb_Cartaz, AV44Lb_colnom, AV47Lb_numero, AV45Lb_estado, AV49ManageFiltersExecutionStep, AV6ColumnsSelector, AV100TFLb_numero, AV101TFLb_numero_To, AV58TFCliCod, AV59TFCliCod_To, AV64TFLb_ArtCod, AV65TFLb_ArtCod_Sel, AV68TFLb_ColNomC, AV69TFLb_ColNomC_Sel, AV175TFLb_ColNum, AV176TFLb_ColNum_To, AV120TFLb_Rb, AV121TFLb_Rb_To, AV108TFLb_opcion, AV109TFLb_opcion_Sel, AV102TFLb_numop, AV103TFLb_numop_To, AV66TFLb_Cartaz, AV67TFLb_Cartaz_Sel, AV80TFLb_FechaE, AV82TFLb_FechaEn, AV84TFLb_FechaR, AV75TFLb_Estado_Sels, AV104TFLb_ObsCR, AV105TFLb_ObsCR_Sel, AV180Pgmname, AV51OrderedBy, AV53OrderedDsc, AV46Lb_fechaR, AV153F_Cformu, AV157ForUltUti, AV156ForNumCol, Gx_msg, AV127Col_Lb_numero, AV129Col_Lb_opcion, AV128Col_Lb_numeroE, AV130Col_Lb_opcionE, AV148ActualizacionEnsayoTxp, AV149AprobacionColorLab, AV139Moda21, AV174coste, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = AV35FilterFullText ;
      AV185Gestionlaboratorio_recepciondeensayocliente_wcds_2_tflb_numero = AV100TFLb_numero ;
      AV186Gestionlaboratorio_recepciondeensayocliente_wcds_3_tflb_numero_to = AV101TFLb_numero_To ;
      AV187Gestionlaboratorio_recepciondeensayocliente_wcds_4_tfclicod = AV58TFCliCod ;
      AV188Gestionlaboratorio_recepciondeensayocliente_wcds_5_tfclicod_to = AV59TFCliCod_To ;
      AV189Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod = AV64TFLb_ArtCod ;
      AV190Gestionlaboratorio_recepciondeensayocliente_wcds_7_tflb_artcod_sel = AV65TFLb_ArtCod_Sel ;
      AV191Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc = AV68TFLb_ColNomC ;
      AV192Gestionlaboratorio_recepciondeensayocliente_wcds_9_tflb_colnomc_sel = AV69TFLb_ColNomC_Sel ;
      AV193Gestionlaboratorio_recepciondeensayocliente_wcds_10_tflb_colnum = AV175TFLb_ColNum ;
      AV194Gestionlaboratorio_recepciondeensayocliente_wcds_11_tflb_colnum_to = AV176TFLb_ColNum_To ;
      AV195Gestionlaboratorio_recepciondeensayocliente_wcds_12_tflb_rb = AV120TFLb_Rb ;
      AV196Gestionlaboratorio_recepciondeensayocliente_wcds_13_tflb_rb_to = AV121TFLb_Rb_To ;
      AV197Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion = AV108TFLb_opcion ;
      AV198Gestionlaboratorio_recepciondeensayocliente_wcds_15_tflb_opcion_sel = AV109TFLb_opcion_Sel ;
      AV199Gestionlaboratorio_recepciondeensayocliente_wcds_16_tflb_numop = AV102TFLb_numop ;
      AV200Gestionlaboratorio_recepciondeensayocliente_wcds_17_tflb_numop_to = AV103TFLb_numop_To ;
      AV201Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz = AV66TFLb_Cartaz ;
      AV202Gestionlaboratorio_recepciondeensayocliente_wcds_19_tflb_cartaz_sel = AV67TFLb_Cartaz_Sel ;
      AV203Gestionlaboratorio_recepciondeensayocliente_wcds_20_tflb_fechae = AV80TFLb_FechaE ;
      AV204Gestionlaboratorio_recepciondeensayocliente_wcds_21_tflb_fechaen = AV82TFLb_FechaEn ;
      AV205Gestionlaboratorio_recepciondeensayocliente_wcds_22_tflb_fechar = AV84TFLb_FechaR ;
      AV206Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels = AV75TFLb_Estado_Sels ;
      AV207Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr = AV104TFLb_ObsCR ;
      AV208Gestionlaboratorio_recepciondeensayocliente_wcds_25_tflb_obscr_sel = AV105TFLb_ObsCR_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV35FilterFullText, AV32Emprcod, AV5Clicod, AV43Lb_Cartaz, AV44Lb_colnom, AV47Lb_numero, AV45Lb_estado, AV49ManageFiltersExecutionStep, AV6ColumnsSelector, AV100TFLb_numero, AV101TFLb_numero_To, AV58TFCliCod, AV59TFCliCod_To, AV64TFLb_ArtCod, AV65TFLb_ArtCod_Sel, AV68TFLb_ColNomC, AV69TFLb_ColNomC_Sel, AV175TFLb_ColNum, AV176TFLb_ColNum_To, AV120TFLb_Rb, AV121TFLb_Rb_To, AV108TFLb_opcion, AV109TFLb_opcion_Sel, AV102TFLb_numop, AV103TFLb_numop_To, AV66TFLb_Cartaz, AV67TFLb_Cartaz_Sel, AV80TFLb_FechaE, AV82TFLb_FechaEn, AV84TFLb_FechaR, AV75TFLb_Estado_Sels, AV104TFLb_ObsCR, AV105TFLb_ObsCR_Sel, AV180Pgmname, AV51OrderedBy, AV53OrderedDsc, AV46Lb_fechaR, AV153F_Cformu, AV157ForUltUti, AV156ForNumCol, Gx_msg, AV127Col_Lb_numero, AV129Col_Lb_opcion, AV128Col_Lb_numeroE, AV130Col_Lb_opcionE, AV148ActualizacionEnsayoTxp, AV149AprobacionColorLab, AV139Moda21, AV174coste, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = AV35FilterFullText ;
      AV185Gestionlaboratorio_recepciondeensayocliente_wcds_2_tflb_numero = AV100TFLb_numero ;
      AV186Gestionlaboratorio_recepciondeensayocliente_wcds_3_tflb_numero_to = AV101TFLb_numero_To ;
      AV187Gestionlaboratorio_recepciondeensayocliente_wcds_4_tfclicod = AV58TFCliCod ;
      AV188Gestionlaboratorio_recepciondeensayocliente_wcds_5_tfclicod_to = AV59TFCliCod_To ;
      AV189Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod = AV64TFLb_ArtCod ;
      AV190Gestionlaboratorio_recepciondeensayocliente_wcds_7_tflb_artcod_sel = AV65TFLb_ArtCod_Sel ;
      AV191Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc = AV68TFLb_ColNomC ;
      AV192Gestionlaboratorio_recepciondeensayocliente_wcds_9_tflb_colnomc_sel = AV69TFLb_ColNomC_Sel ;
      AV193Gestionlaboratorio_recepciondeensayocliente_wcds_10_tflb_colnum = AV175TFLb_ColNum ;
      AV194Gestionlaboratorio_recepciondeensayocliente_wcds_11_tflb_colnum_to = AV176TFLb_ColNum_To ;
      AV195Gestionlaboratorio_recepciondeensayocliente_wcds_12_tflb_rb = AV120TFLb_Rb ;
      AV196Gestionlaboratorio_recepciondeensayocliente_wcds_13_tflb_rb_to = AV121TFLb_Rb_To ;
      AV197Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion = AV108TFLb_opcion ;
      AV198Gestionlaboratorio_recepciondeensayocliente_wcds_15_tflb_opcion_sel = AV109TFLb_opcion_Sel ;
      AV199Gestionlaboratorio_recepciondeensayocliente_wcds_16_tflb_numop = AV102TFLb_numop ;
      AV200Gestionlaboratorio_recepciondeensayocliente_wcds_17_tflb_numop_to = AV103TFLb_numop_To ;
      AV201Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz = AV66TFLb_Cartaz ;
      AV202Gestionlaboratorio_recepciondeensayocliente_wcds_19_tflb_cartaz_sel = AV67TFLb_Cartaz_Sel ;
      AV203Gestionlaboratorio_recepciondeensayocliente_wcds_20_tflb_fechae = AV80TFLb_FechaE ;
      AV204Gestionlaboratorio_recepciondeensayocliente_wcds_21_tflb_fechaen = AV82TFLb_FechaEn ;
      AV205Gestionlaboratorio_recepciondeensayocliente_wcds_22_tflb_fechar = AV84TFLb_FechaR ;
      AV206Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels = AV75TFLb_Estado_Sels ;
      AV207Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr = AV104TFLb_ObsCR ;
      AV208Gestionlaboratorio_recepciondeensayocliente_wcds_25_tflb_obscr_sel = AV105TFLb_ObsCR_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV35FilterFullText, AV32Emprcod, AV5Clicod, AV43Lb_Cartaz, AV44Lb_colnom, AV47Lb_numero, AV45Lb_estado, AV49ManageFiltersExecutionStep, AV6ColumnsSelector, AV100TFLb_numero, AV101TFLb_numero_To, AV58TFCliCod, AV59TFCliCod_To, AV64TFLb_ArtCod, AV65TFLb_ArtCod_Sel, AV68TFLb_ColNomC, AV69TFLb_ColNomC_Sel, AV175TFLb_ColNum, AV176TFLb_ColNum_To, AV120TFLb_Rb, AV121TFLb_Rb_To, AV108TFLb_opcion, AV109TFLb_opcion_Sel, AV102TFLb_numop, AV103TFLb_numop_To, AV66TFLb_Cartaz, AV67TFLb_Cartaz_Sel, AV80TFLb_FechaE, AV82TFLb_FechaEn, AV84TFLb_FechaR, AV75TFLb_Estado_Sels, AV104TFLb_ObsCR, AV105TFLb_ObsCR_Sel, AV180Pgmname, AV51OrderedBy, AV53OrderedDsc, AV46Lb_fechaR, AV153F_Cformu, AV157ForUltUti, AV156ForNumCol, Gx_msg, AV127Col_Lb_numero, AV129Col_Lb_opcion, AV128Col_Lb_numeroE, AV130Col_Lb_opcionE, AV148ActualizacionEnsayoTxp, AV149AprobacionColorLab, AV139Moda21, AV174coste, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = AV35FilterFullText ;
      AV185Gestionlaboratorio_recepciondeensayocliente_wcds_2_tflb_numero = AV100TFLb_numero ;
      AV186Gestionlaboratorio_recepciondeensayocliente_wcds_3_tflb_numero_to = AV101TFLb_numero_To ;
      AV187Gestionlaboratorio_recepciondeensayocliente_wcds_4_tfclicod = AV58TFCliCod ;
      AV188Gestionlaboratorio_recepciondeensayocliente_wcds_5_tfclicod_to = AV59TFCliCod_To ;
      AV189Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod = AV64TFLb_ArtCod ;
      AV190Gestionlaboratorio_recepciondeensayocliente_wcds_7_tflb_artcod_sel = AV65TFLb_ArtCod_Sel ;
      AV191Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc = AV68TFLb_ColNomC ;
      AV192Gestionlaboratorio_recepciondeensayocliente_wcds_9_tflb_colnomc_sel = AV69TFLb_ColNomC_Sel ;
      AV193Gestionlaboratorio_recepciondeensayocliente_wcds_10_tflb_colnum = AV175TFLb_ColNum ;
      AV194Gestionlaboratorio_recepciondeensayocliente_wcds_11_tflb_colnum_to = AV176TFLb_ColNum_To ;
      AV195Gestionlaboratorio_recepciondeensayocliente_wcds_12_tflb_rb = AV120TFLb_Rb ;
      AV196Gestionlaboratorio_recepciondeensayocliente_wcds_13_tflb_rb_to = AV121TFLb_Rb_To ;
      AV197Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion = AV108TFLb_opcion ;
      AV198Gestionlaboratorio_recepciondeensayocliente_wcds_15_tflb_opcion_sel = AV109TFLb_opcion_Sel ;
      AV199Gestionlaboratorio_recepciondeensayocliente_wcds_16_tflb_numop = AV102TFLb_numop ;
      AV200Gestionlaboratorio_recepciondeensayocliente_wcds_17_tflb_numop_to = AV103TFLb_numop_To ;
      AV201Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz = AV66TFLb_Cartaz ;
      AV202Gestionlaboratorio_recepciondeensayocliente_wcds_19_tflb_cartaz_sel = AV67TFLb_Cartaz_Sel ;
      AV203Gestionlaboratorio_recepciondeensayocliente_wcds_20_tflb_fechae = AV80TFLb_FechaE ;
      AV204Gestionlaboratorio_recepciondeensayocliente_wcds_21_tflb_fechaen = AV82TFLb_FechaEn ;
      AV205Gestionlaboratorio_recepciondeensayocliente_wcds_22_tflb_fechar = AV84TFLb_FechaR ;
      AV206Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels = AV75TFLb_Estado_Sels ;
      AV207Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr = AV104TFLb_ObsCR ;
      AV208Gestionlaboratorio_recepciondeensayocliente_wcds_25_tflb_obscr_sel = AV105TFLb_ObsCR_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV35FilterFullText, AV32Emprcod, AV5Clicod, AV43Lb_Cartaz, AV44Lb_colnom, AV47Lb_numero, AV45Lb_estado, AV49ManageFiltersExecutionStep, AV6ColumnsSelector, AV100TFLb_numero, AV101TFLb_numero_To, AV58TFCliCod, AV59TFCliCod_To, AV64TFLb_ArtCod, AV65TFLb_ArtCod_Sel, AV68TFLb_ColNomC, AV69TFLb_ColNomC_Sel, AV175TFLb_ColNum, AV176TFLb_ColNum_To, AV120TFLb_Rb, AV121TFLb_Rb_To, AV108TFLb_opcion, AV109TFLb_opcion_Sel, AV102TFLb_numop, AV103TFLb_numop_To, AV66TFLb_Cartaz, AV67TFLb_Cartaz_Sel, AV80TFLb_FechaE, AV82TFLb_FechaEn, AV84TFLb_FechaR, AV75TFLb_Estado_Sels, AV104TFLb_ObsCR, AV105TFLb_ObsCR_Sel, AV180Pgmname, AV51OrderedBy, AV53OrderedDsc, AV46Lb_fechaR, AV153F_Cformu, AV157ForUltUti, AV156ForNumCol, Gx_msg, AV127Col_Lb_numero, AV129Col_Lb_opcion, AV128Col_Lb_numeroE, AV130Col_Lb_opcionE, AV148ActualizacionEnsayoTxp, AV149AprobacionColorLab, AV139Moda21, AV174coste, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = AV35FilterFullText ;
      AV185Gestionlaboratorio_recepciondeensayocliente_wcds_2_tflb_numero = AV100TFLb_numero ;
      AV186Gestionlaboratorio_recepciondeensayocliente_wcds_3_tflb_numero_to = AV101TFLb_numero_To ;
      AV187Gestionlaboratorio_recepciondeensayocliente_wcds_4_tfclicod = AV58TFCliCod ;
      AV188Gestionlaboratorio_recepciondeensayocliente_wcds_5_tfclicod_to = AV59TFCliCod_To ;
      AV189Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod = AV64TFLb_ArtCod ;
      AV190Gestionlaboratorio_recepciondeensayocliente_wcds_7_tflb_artcod_sel = AV65TFLb_ArtCod_Sel ;
      AV191Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc = AV68TFLb_ColNomC ;
      AV192Gestionlaboratorio_recepciondeensayocliente_wcds_9_tflb_colnomc_sel = AV69TFLb_ColNomC_Sel ;
      AV193Gestionlaboratorio_recepciondeensayocliente_wcds_10_tflb_colnum = AV175TFLb_ColNum ;
      AV194Gestionlaboratorio_recepciondeensayocliente_wcds_11_tflb_colnum_to = AV176TFLb_ColNum_To ;
      AV195Gestionlaboratorio_recepciondeensayocliente_wcds_12_tflb_rb = AV120TFLb_Rb ;
      AV196Gestionlaboratorio_recepciondeensayocliente_wcds_13_tflb_rb_to = AV121TFLb_Rb_To ;
      AV197Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion = AV108TFLb_opcion ;
      AV198Gestionlaboratorio_recepciondeensayocliente_wcds_15_tflb_opcion_sel = AV109TFLb_opcion_Sel ;
      AV199Gestionlaboratorio_recepciondeensayocliente_wcds_16_tflb_numop = AV102TFLb_numop ;
      AV200Gestionlaboratorio_recepciondeensayocliente_wcds_17_tflb_numop_to = AV103TFLb_numop_To ;
      AV201Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz = AV66TFLb_Cartaz ;
      AV202Gestionlaboratorio_recepciondeensayocliente_wcds_19_tflb_cartaz_sel = AV67TFLb_Cartaz_Sel ;
      AV203Gestionlaboratorio_recepciondeensayocliente_wcds_20_tflb_fechae = AV80TFLb_FechaE ;
      AV204Gestionlaboratorio_recepciondeensayocliente_wcds_21_tflb_fechaen = AV82TFLb_FechaEn ;
      AV205Gestionlaboratorio_recepciondeensayocliente_wcds_22_tflb_fechar = AV84TFLb_FechaR ;
      AV206Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels = AV75TFLb_Estado_Sels ;
      AV207Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr = AV104TFLb_ObsCR ;
      AV208Gestionlaboratorio_recepciondeensayocliente_wcds_25_tflb_obscr_sel = AV105TFLb_ObsCR_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV35FilterFullText, AV32Emprcod, AV5Clicod, AV43Lb_Cartaz, AV44Lb_colnom, AV47Lb_numero, AV45Lb_estado, AV49ManageFiltersExecutionStep, AV6ColumnsSelector, AV100TFLb_numero, AV101TFLb_numero_To, AV58TFCliCod, AV59TFCliCod_To, AV64TFLb_ArtCod, AV65TFLb_ArtCod_Sel, AV68TFLb_ColNomC, AV69TFLb_ColNomC_Sel, AV175TFLb_ColNum, AV176TFLb_ColNum_To, AV120TFLb_Rb, AV121TFLb_Rb_To, AV108TFLb_opcion, AV109TFLb_opcion_Sel, AV102TFLb_numop, AV103TFLb_numop_To, AV66TFLb_Cartaz, AV67TFLb_Cartaz_Sel, AV80TFLb_FechaE, AV82TFLb_FechaEn, AV84TFLb_FechaR, AV75TFLb_Estado_Sels, AV104TFLb_ObsCR, AV105TFLb_ObsCR_Sel, AV180Pgmname, AV51OrderedBy, AV53OrderedDsc, AV46Lb_fechaR, AV153F_Cformu, AV157ForUltUti, AV156ForNumCol, Gx_msg, AV127Col_Lb_numero, AV129Col_Lb_opcion, AV128Col_Lb_numeroE, AV130Col_Lb_opcionE, AV148ActualizacionEnsayoTxp, AV149AprobacionColorLab, AV139Moda21, AV174coste, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV180Pgmname = "GestionLaboratorio.RecepciondeEnsayoCliente_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV180Pgmname", AV180Pgmname);
      Gx_err = (short)(0) ;
      edtavF_cformu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavF_cformu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavF_cformu_Enabled), 5, 0), !bGXsfl_67_Refreshing);
      edtavFornumcol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFornumcol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFornumcol_Enabled), 5, 0), !bGXsfl_67_Refreshing);
      edtavGridvariable1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavGridvariable1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGridvariable1_Enabled), 5, 0), !bGXsfl_67_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1TS0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e251TS2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV48ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV31DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV6ColumnsSelector);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOL_LB_OPCIONE"), AV130Col_Lb_opcionE);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOL_LB_NUMEROE"), AV128Col_Lb_numeroE);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOL_LB_OPCION"), AV129Col_Lb_opcion);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOL_LB_NUMERO"), AV127Col_Lb_numero);
         /* Read saved values. */
         nRC_GXsfl_67 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_67"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV37GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV38GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV32Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV32Emprcod") ;
         wcpOAV5Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV5Clicod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV43Lb_Cartaz = httpContext.cgiGet( sPrefix+"wcpOAV43Lb_Cartaz") ;
         wcpOAV44Lb_colnom = httpContext.cgiGet( sPrefix+"wcpOAV44Lb_colnom") ;
         wcpOAV47Lb_numero = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV47Lb_numero"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV46Lb_fechaR = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV46Lb_fechaR"), 0) ;
         wcpOAV45Lb_estado = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV45Lb_estado"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV131i = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV133t = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV134IN_Lb_numerot = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vIN_LB_NUMEROT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV46Lb_fechaR = localUtil.ctod( httpContext.cgiGet( sPrefix+"vLB_FECHAR"), 0) ;
         AV132IN_Lb_numero = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vIN_LB_NUMERO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_msg = httpContext.cgiGet( sPrefix+"vMSG") ;
         AV135Num_v = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vNUM_V"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         Dvelop_confirmpanel_recepcion_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_RECEPCION_Title") ;
         Dvelop_confirmpanel_recepcion_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_RECEPCION_Confirmationtext") ;
         Dvelop_confirmpanel_recepcion_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_RECEPCION_Yesbuttoncaption") ;
         Dvelop_confirmpanel_recepcion_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_RECEPCION_Nobuttoncaption") ;
         Dvelop_confirmpanel_recepcion_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_RECEPCION_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_recepcion_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_RECEPCION_Yesbuttonposition") ;
         Dvelop_confirmpanel_recepcion_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_RECEPCION_Confirmtype") ;
         Dvelop_confirmpanel_eliminarrecepcion_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARRECEPCION_Title") ;
         Dvelop_confirmpanel_eliminarrecepcion_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARRECEPCION_Confirmationtext") ;
         Dvelop_confirmpanel_eliminarrecepcion_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARRECEPCION_Yesbuttoncaption") ;
         Dvelop_confirmpanel_eliminarrecepcion_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARRECEPCION_Nobuttoncaption") ;
         Dvelop_confirmpanel_eliminarrecepcion_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARRECEPCION_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_eliminarrecepcion_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARRECEPCION_Yesbuttonposition") ;
         Dvelop_confirmpanel_eliminarrecepcion_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARRECEPCION_Confirmtype") ;
         Dvelop_confirmpanel_aprobacioninterna_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_APROBACIONINTERNA_Title") ;
         Dvelop_confirmpanel_aprobacioninterna_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_APROBACIONINTERNA_Confirmationtext") ;
         Dvelop_confirmpanel_aprobacioninterna_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_APROBACIONINTERNA_Yesbuttoncaption") ;
         Dvelop_confirmpanel_aprobacioninterna_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_APROBACIONINTERNA_Nobuttoncaption") ;
         Dvelop_confirmpanel_aprobacioninterna_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_APROBACIONINTERNA_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_aprobacioninterna_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_APROBACIONINTERNA_Yesbuttonposition") ;
         Dvelop_confirmpanel_aprobacioninterna_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_APROBACIONINTERNA_Confirmtype") ;
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
         Dvelop_confirmpanel_recepcion_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_RECEPCION_Result") ;
         Dvelop_confirmpanel_eliminarrecepcion_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARRECEPCION_Result") ;
         Dvelop_confirmpanel_aprobacioninterna_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_APROBACIONINTERNA_Result") ;
         /* Read variables values. */
         AV35FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35FilterFullText", AV35FilterFullText);
         AV148ActualizacionEnsayoTxp = ((GXutil.strcmp(httpContext.cgiGet( chkavActualizacionensayotxp.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV148ActualizacionEnsayoTxp", AV148ActualizacionEnsayoTxp);
         AV149AprobacionColorLab = ((GXutil.strcmp(httpContext.cgiGet( chkavAprobacioncolorlab.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV149AprobacionColorLab", AV149AprobacionColorLab);
         AV180Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV180Pgmname", AV180Pgmname);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_lb_fechaeauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_LB_FECHAEAUXDATE");
            GX_FocusControl = edtavDdo_lb_fechaeauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV11DDO_Lb_FechaEAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11DDO_Lb_FechaEAuxDate", localUtil.format(AV11DDO_Lb_FechaEAuxDate, "99/99/99"));
         }
         else
         {
            AV11DDO_Lb_FechaEAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_lb_fechaeauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11DDO_Lb_FechaEAuxDate", localUtil.format(AV11DDO_Lb_FechaEAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_lb_fechaenauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_LB_FECHAENAUXDATE");
            GX_FocusControl = edtavDdo_lb_fechaenauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13DDO_Lb_FechaEnAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13DDO_Lb_FechaEnAuxDate", localUtil.format(AV13DDO_Lb_FechaEnAuxDate, "99/99/99"));
         }
         else
         {
            AV13DDO_Lb_FechaEnAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_lb_fechaenauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13DDO_Lb_FechaEnAuxDate", localUtil.format(AV13DDO_Lb_FechaEnAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_lb_fecharauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_LB_FECHARAUXDATE");
            GX_FocusControl = edtavDdo_lb_fecharauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV15DDO_Lb_FechaRAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15DDO_Lb_FechaRAuxDate", localUtil.format(AV15DDO_Lb_FechaRAuxDate, "99/99/99"));
         }
         else
         {
            AV15DDO_Lb_FechaRAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_lb_fecharauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15DDO_Lb_FechaRAuxDate", localUtil.format(AV15DDO_Lb_FechaRAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         nGXsfl_67_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_67_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_67_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_672( ) ;
         if ( nGXsfl_67_idx > 0 )
         {
            AV55Seleccionar = GXutil.strtobool( httpContext.cgiGet( chkavSeleccionar.getInternalname())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSeleccionar.getInternalname(), AV55Seleccionar);
            A5532Lb_numero = (int)(localUtil.ctol( httpContext.cgiGet( edtLb_numero_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A5533Lb_ArtCod = httpContext.cgiGet( edtLb_ArtCod_Internalname) ;
            A5538Lb_ColNomC = httpContext.cgiGet( edtLb_ColNomC_Internalname) ;
            A5537Lb_ColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtLb_ColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A5547Lb_Rb = localUtil.ctond( httpContext.cgiGet( edtLb_Rb_Internalname)) ;
            A5555Lb_opcion = GXutil.upper( httpContext.cgiGet( edtLb_opcion_Internalname)) ;
            cmbavLb_tiprec.setName( cmbavLb_tiprec.getInternalname() );
            cmbavLb_tiprec.setValue( httpContext.cgiGet( cmbavLb_tiprec.getInternalname()) );
            AV138Lb_TipRec = (byte)(GXutil.lval( httpContext.cgiGet( cmbavLb_tiprec.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavLb_tiprec.getInternalname(), GXutil.str( AV138Lb_TipRec, 1, 0));
            A5718Lb_numop = (byte)(localUtil.ctol( httpContext.cgiGet( edtLb_numop_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A5540Lb_Cartaz = httpContext.cgiGet( edtLb_Cartaz_Internalname) ;
            A5541Lb_FechaE = localUtil.ctod( httpContext.cgiGet( edtLb_FechaE_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            A5567Lb_FechaEn = localUtil.ctod( httpContext.cgiGet( edtLb_FechaEn_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            A5563Lb_FechaR = localUtil.ctod( httpContext.cgiGet( edtLb_FechaR_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            cmbLb_Estado.setName( cmbLb_Estado.getInternalname() );
            cmbLb_Estado.setValue( httpContext.cgiGet( cmbLb_Estado.getInternalname()) );
            A5566Lb_Estado = (byte)(GXutil.lval( httpContext.cgiGet( cmbLb_Estado.getInternalname()))) ;
            AV56SeleccionarEliminar = GXutil.strtobool( httpContext.cgiGet( chkavSeleccionareliminar.getInternalname())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSeleccionareliminar.getInternalname(), AV56SeleccionarEliminar);
            cmbavLb_provdef.setName( cmbavLb_provdef.getInternalname() );
            cmbavLb_provdef.setValue( httpContext.cgiGet( cmbavLb_provdef.getInternalname()) );
            AV144Lb_ProvDef = httpContext.cgiGet( cmbavLb_provdef.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavLb_provdef.getInternalname(), AV144Lb_ProvDef);
            A10822Lb_ObsCR = httpContext.cgiGet( edtLb_ObsCR_Internalname) ;
            cmbLb_opSt.setName( cmbLb_opSt.getInternalname() );
            cmbLb_opSt.setValue( httpContext.cgiGet( cmbLb_opSt.getInternalname()) );
            A12525Lb_opSt = httpContext.cgiGet( cmbLb_opSt.getInternalname()) ;
            n12525Lb_opSt = false ;
            A12526Lb_opFc = localUtil.ctod( httpContext.cgiGet( edtLb_opFc_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n12526Lb_opFc = false ;
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavF_cformu_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavF_cformu_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vF_CFORMU");
               GX_FocusControl = edtavF_cformu_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV153F_Cformu = (short)(0) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavF_cformu_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV153F_Cformu), 4, 0));
            }
            else
            {
               AV153F_Cformu = (short)(localUtil.ctol( httpContext.cgiGet( edtavF_cformu_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavF_cformu_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV153F_Cformu), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavFornumcol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavFornumcol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFORNUMCOL");
               GX_FocusControl = edtavFornumcol_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV156ForNumCol = 0 ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavFornumcol_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV156ForNumCol), 8, 0));
            }
            else
            {
               AV156ForNumCol = (int)(localUtil.ctol( httpContext.cgiGet( edtavFornumcol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavFornumcol_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV156ForNumCol), 8, 0));
            }
            A5565Lb_CosteE = localUtil.ctond( httpContext.cgiGet( edtLb_CosteE_Internalname)) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGridvariable1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGridvariable1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGRIDVARIABLE1");
               GX_FocusControl = edtavGridvariable1_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV158GridVariable1 = (short)(0) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavGridvariable1_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV158GridVariable1), 4, 0));
            }
            else
            {
               AV158GridVariable1 = (short)(localUtil.ctol( httpContext.cgiGet( edtavGridvariable1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavGridvariable1_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV158GridVariable1), 4, 0));
            }
            A831TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtTipColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n831TipColCod = false ;
            A5536Lb_ColNom = httpContext.cgiGet( edtLb_ColNom_Internalname) ;
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"RecepciondeEnsayoCliente_WC");
         AV180Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV180Pgmname", AV180Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV180Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("gestionlaboratorio\\recepciondeensayocliente_wc:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV35FilterFullText) != 0 )
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
      e251TS2 ();
      if (returnInSub) return;
   }

   public void e251TS2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_int1 = (byte)(AV139Moda21) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV32Emprcod, httpContext.getMessage( "MODA21", ""), GXv_int2) ;
      recepciondeensayocliente_wc_impl.this.GXt_int1 = GXv_int2[0] ;
      AV139Moda21 = GXt_int1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV139Moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV139Moda21), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV139Moda21), "ZZZ9")));
      AV148ActualizacionEnsayoTxp = "N" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV148ActualizacionEnsayoTxp", AV148ActualizacionEnsayoTxp);
      AV149AprobacionColorLab = "N" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV149AprobacionColorLab", AV149AprobacionColorLab);
      AV150AprobacionInterna = "N" ;
      GXt_char3 = AV181Station ;
      GXv_char4[0] = GXt_char3 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      recepciondeensayocliente_wc_impl.this.GXt_char3 = GXv_char4[0] ;
      AV181Station = GXt_char3 ;
      GXv_char4[0] = AV32Emprcod ;
      GXv_char5[0] = AV182Emprnom ;
      GXv_char6[0] = AV183Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV181Station, GXv_char4, GXv_char5, GXv_char6) ;
      recepciondeensayocliente_wc_impl.this.AV32Emprcod = GXv_char4[0] ;
      recepciondeensayocliente_wc_impl.this.AV182Emprnom = GXv_char5[0] ;
      recepciondeensayocliente_wc_impl.this.AV183Usurcod = GXv_char6[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32Emprcod", AV32Emprcod);
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
      if ( AV51OrderedBy < 1 )
      {
         AV51OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = AV31DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] ;
      AV31DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      bttBtnaprobacioninterna_Visible = AV139Moda21 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, bttBtnaprobacioninterna_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtnaprobacioninterna_Visible), 5, 0), true);
   }

   public void e261TS2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext9[0] = AV125WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV125WWPContext = GXv_SdtWWPContext9[0] ;
      if ( AV49ManageFiltersExecutionStep == 1 )
      {
         AV49ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49ManageFiltersExecutionStep", GXutil.str( AV49ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV49ManageFiltersExecutionStep == 2 )
      {
         AV49ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49ManageFiltersExecutionStep", GXutil.str( AV49ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV57Session.getValue("GestionLaboratorio.RecepciondeEnsayoCliente_WCColumnsSelector"), "") != 0 )
      {
         AV8ColumnsSelectorXML = AV57Session.getValue("GestionLaboratorio.RecepciondeEnsayoCliente_WCColumnsSelector") ;
         AV6ColumnsSelector.fromxml(AV8ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      chkavSeleccionar.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSeleccionar.getInternalname(), "Visible", GXutil.ltrimstr( chkavSeleccionar.getVisible(), 5, 0), !bGXsfl_67_Refreshing);
      edtLb_numero_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_numero_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_numero_Visible), 5, 0), !bGXsfl_67_Refreshing);
      edtCliCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Visible), 5, 0), !bGXsfl_67_Refreshing);
      edtLb_ArtCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_ArtCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_ArtCod_Visible), 5, 0), !bGXsfl_67_Refreshing);
      edtLb_ColNomC_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_ColNomC_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_ColNomC_Visible), 5, 0), !bGXsfl_67_Refreshing);
      edtLb_ColNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_ColNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_ColNum_Visible), 5, 0), !bGXsfl_67_Refreshing);
      edtLb_Rb_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_Rb_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_Rb_Visible), 5, 0), !bGXsfl_67_Refreshing);
      edtLb_opcion_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_opcion_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_opcion_Visible), 5, 0), !bGXsfl_67_Refreshing);
      cmbavLb_tiprec.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavLb_tiprec.getInternalname(), "Visible", GXutil.ltrimstr( cmbavLb_tiprec.getVisible(), 5, 0), !bGXsfl_67_Refreshing);
      edtLb_numop_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_numop_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_numop_Visible), 5, 0), !bGXsfl_67_Refreshing);
      edtLb_Cartaz_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_Cartaz_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_Cartaz_Visible), 5, 0), !bGXsfl_67_Refreshing);
      edtLb_FechaE_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_FechaE_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_FechaE_Visible), 5, 0), !bGXsfl_67_Refreshing);
      edtLb_FechaEn_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_FechaEn_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_FechaEn_Visible), 5, 0), !bGXsfl_67_Refreshing);
      edtLb_FechaR_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_FechaR_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_FechaR_Visible), 5, 0), !bGXsfl_67_Refreshing);
      cmbLb_Estado.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbLb_Estado.getInternalname(), "Visible", GXutil.ltrimstr( cmbLb_Estado.getVisible(), 5, 0), !bGXsfl_67_Refreshing);
      chkavSeleccionareliminar.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSeleccionareliminar.getInternalname(), "Visible", GXutil.ltrimstr( chkavSeleccionareliminar.getVisible(), 5, 0), !bGXsfl_67_Refreshing);
      cmbavLb_provdef.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavLb_provdef.getInternalname(), "Visible", GXutil.ltrimstr( cmbavLb_provdef.getVisible(), 5, 0), !bGXsfl_67_Refreshing);
      edtLb_ObsCR_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_ObsCR_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_ObsCR_Visible), 5, 0), !bGXsfl_67_Refreshing);
      AV37GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37GridCurrentPage), 10, 0));
      AV38GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38GridPageCount), 10, 0));
      AV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = AV35FilterFullText ;
      AV185Gestionlaboratorio_recepciondeensayocliente_wcds_2_tflb_numero = AV100TFLb_numero ;
      AV186Gestionlaboratorio_recepciondeensayocliente_wcds_3_tflb_numero_to = AV101TFLb_numero_To ;
      AV187Gestionlaboratorio_recepciondeensayocliente_wcds_4_tfclicod = AV58TFCliCod ;
      AV188Gestionlaboratorio_recepciondeensayocliente_wcds_5_tfclicod_to = AV59TFCliCod_To ;
      AV189Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod = AV64TFLb_ArtCod ;
      AV190Gestionlaboratorio_recepciondeensayocliente_wcds_7_tflb_artcod_sel = AV65TFLb_ArtCod_Sel ;
      AV191Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc = AV68TFLb_ColNomC ;
      AV192Gestionlaboratorio_recepciondeensayocliente_wcds_9_tflb_colnomc_sel = AV69TFLb_ColNomC_Sel ;
      AV193Gestionlaboratorio_recepciondeensayocliente_wcds_10_tflb_colnum = AV175TFLb_ColNum ;
      AV194Gestionlaboratorio_recepciondeensayocliente_wcds_11_tflb_colnum_to = AV176TFLb_ColNum_To ;
      AV195Gestionlaboratorio_recepciondeensayocliente_wcds_12_tflb_rb = AV120TFLb_Rb ;
      AV196Gestionlaboratorio_recepciondeensayocliente_wcds_13_tflb_rb_to = AV121TFLb_Rb_To ;
      AV197Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion = AV108TFLb_opcion ;
      AV198Gestionlaboratorio_recepciondeensayocliente_wcds_15_tflb_opcion_sel = AV109TFLb_opcion_Sel ;
      AV199Gestionlaboratorio_recepciondeensayocliente_wcds_16_tflb_numop = AV102TFLb_numop ;
      AV200Gestionlaboratorio_recepciondeensayocliente_wcds_17_tflb_numop_to = AV103TFLb_numop_To ;
      AV201Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz = AV66TFLb_Cartaz ;
      AV202Gestionlaboratorio_recepciondeensayocliente_wcds_19_tflb_cartaz_sel = AV67TFLb_Cartaz_Sel ;
      AV203Gestionlaboratorio_recepciondeensayocliente_wcds_20_tflb_fechae = AV80TFLb_FechaE ;
      AV204Gestionlaboratorio_recepciondeensayocliente_wcds_21_tflb_fechaen = AV82TFLb_FechaEn ;
      AV205Gestionlaboratorio_recepciondeensayocliente_wcds_22_tflb_fechar = AV84TFLb_FechaR ;
      AV206Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels = AV75TFLb_Estado_Sels ;
      AV207Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr = AV104TFLb_ObsCR ;
      AV208Gestionlaboratorio_recepciondeensayocliente_wcds_25_tflb_obscr_sel = AV105TFLb_ObsCR_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV6ColumnsSelector", AV6ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV48ManageFiltersData", AV48ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV39GridState", AV39GridState);
   }

   public void e141TS2( )
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
         AV54PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV54PageToGo) ;
      }
   }

   public void e151TS2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e161TS2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV51OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51OrderedBy), 4, 0));
         AV53OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53OrderedDsc", AV53OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_numero") == 0 )
         {
            AV100TFLb_numero = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV100TFLb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV100TFLb_numero), 8, 0));
            AV101TFLb_numero_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV101TFLb_numero_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV101TFLb_numero_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliCod") == 0 )
         {
            AV58TFCliCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58TFCliCod), 6, 0));
            AV59TFCliCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_ArtCod") == 0 )
         {
            AV64TFLb_ArtCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFLb_ArtCod", AV64TFLb_ArtCod);
            AV65TFLb_ArtCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFLb_ArtCod_Sel", AV65TFLb_ArtCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_ColNomC") == 0 )
         {
            AV68TFLb_ColNomC = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TFLb_ColNomC", AV68TFLb_ColNomC);
            AV69TFLb_ColNomC_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69TFLb_ColNomC_Sel", AV69TFLb_ColNomC_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_ColNum") == 0 )
         {
            AV175TFLb_ColNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV175TFLb_ColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV175TFLb_ColNum), 6, 0));
            AV176TFLb_ColNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV176TFLb_ColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV176TFLb_ColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_Rb") == 0 )
         {
            AV120TFLb_Rb = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV120TFLb_Rb", GXutil.ltrimstr( AV120TFLb_Rb, 7, 2));
            AV121TFLb_Rb_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV121TFLb_Rb_To", GXutil.ltrimstr( AV121TFLb_Rb_To, 7, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_opcion") == 0 )
         {
            AV108TFLb_opcion = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV108TFLb_opcion", AV108TFLb_opcion);
            AV109TFLb_opcion_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV109TFLb_opcion_Sel", AV109TFLb_opcion_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_numop") == 0 )
         {
            AV102TFLb_numop = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV102TFLb_numop", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV102TFLb_numop), 2, 0));
            AV103TFLb_numop_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV103TFLb_numop_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV103TFLb_numop_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_Cartaz") == 0 )
         {
            AV66TFLb_Cartaz = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFLb_Cartaz", AV66TFLb_Cartaz);
            AV67TFLb_Cartaz_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67TFLb_Cartaz_Sel", AV67TFLb_Cartaz_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_FechaE") == 0 )
         {
            AV80TFLb_FechaE = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80TFLb_FechaE", localUtil.format(AV80TFLb_FechaE, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_FechaEn") == 0 )
         {
            AV82TFLb_FechaEn = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82TFLb_FechaEn", localUtil.format(AV82TFLb_FechaEn, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_FechaR") == 0 )
         {
            AV84TFLb_FechaR = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84TFLb_FechaR", localUtil.format(AV84TFLb_FechaR, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_Estado") == 0 )
         {
            AV76TFLb_Estado_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76TFLb_Estado_SelsJson", AV76TFLb_Estado_SelsJson);
            AV75TFLb_Estado_Sels.fromJSonString(GXutil.strReplace( AV76TFLb_Estado_SelsJson, "\"", ""), null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_ObsCR") == 0 )
         {
            AV104TFLb_ObsCR = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV104TFLb_ObsCR", AV104TFLb_ObsCR);
            AV105TFLb_ObsCR_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV105TFLb_ObsCR_Sel", AV105TFLb_ObsCR_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV75TFLb_Estado_Sels", AV75TFLb_Estado_Sels);
   }

   private void e271TS2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV138Lb_TipRec = A5597Lb_TipRec ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavLb_tiprec.getInternalname(), GXutil.str( AV138Lb_TipRec, 1, 0));
      AV144Lb_ProvDef = A6631Lb_ProvDef ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavLb_provdef.getInternalname(), AV144Lb_ProvDef);
      GXv_char6[0] = A396EmprCod ;
      GXv_int10[0] = A252CliCod ;
      GXv_char5[0] = A5533Lb_ArtCod ;
      GXv_char4[0] = A5536Lb_ColNom ;
      GXv_int11[0] = A5537Lb_ColNum ;
      GXv_int2[0] = A831TipColCod ;
      GXv_int12[0] = (byte)(AV153F_Cformu) ;
      GXv_date13[0] = AV157ForUltUti ;
      GXv_int14[0] = AV156ForNumCol ;
      GXv_char15[0] = Gx_msg ;
      new app.pens011(remoteHandle, context).execute( GXv_char6, GXv_int10, GXv_char5, GXv_char4, GXv_int11, GXv_int2, GXv_int12, GXv_date13, GXv_int14, GXv_char15) ;
      recepciondeensayocliente_wc_impl.this.A396EmprCod = GXv_char6[0] ;
      recepciondeensayocliente_wc_impl.this.A252CliCod = GXv_int10[0] ;
      recepciondeensayocliente_wc_impl.this.A5533Lb_ArtCod = GXv_char5[0] ;
      recepciondeensayocliente_wc_impl.this.A5536Lb_ColNom = GXv_char4[0] ;
      recepciondeensayocliente_wc_impl.this.A5537Lb_ColNum = GXv_int11[0] ;
      recepciondeensayocliente_wc_impl.this.A831TipColCod = GXv_int2[0] ;
      recepciondeensayocliente_wc_impl.this.AV153F_Cformu = GXv_int12[0] ;
      recepciondeensayocliente_wc_impl.this.AV157ForUltUti = GXv_date13[0] ;
      recepciondeensayocliente_wc_impl.this.AV156ForNumCol = GXv_int14[0] ;
      recepciondeensayocliente_wc_impl.this.Gx_msg = GXv_char15[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavF_cformu_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV153F_Cformu), 4, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV157ForUltUti", localUtil.format(AV157ForUltUti, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFORULTUTI", getSecureSignedToken( sPrefix, AV157ForUltUti));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavFornumcol_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV156ForNumCol), 8, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_msg", Gx_msg);
      AV55Seleccionar = false ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSeleccionar.getInternalname(), AV55Seleccionar);
      AV131i = (short)(1) ;
      while ( AV131i <= AV127Col_Lb_numero.size() )
      {
         if ( ( ((Number) AV127Col_Lb_numero.elementAt(-1+AV131i)).intValue() == A5532Lb_numero ) && ( GXutil.strcmp((String)AV129Col_Lb_opcion.elementAt(-1+AV131i), A5555Lb_opcion) == 0 ) )
         {
            AV55Seleccionar = true ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSeleccionar.getInternalname(), AV55Seleccionar);
            if (true) break;
         }
         AV131i = (short)(AV131i+1) ;
      }
      AV56SeleccionarEliminar = false ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSeleccionareliminar.getInternalname(), AV56SeleccionarEliminar);
      AV131i = (short)(1) ;
      while ( AV131i <= AV128Col_Lb_numeroE.size() )
      {
         if ( ( ((Number) AV128Col_Lb_numeroE.elementAt(-1+AV131i)).intValue() == A5532Lb_numero ) && ( GXutil.strcmp((String)AV130Col_Lb_opcionE.elementAt(-1+AV131i), A5555Lb_opcion) == 0 ) )
         {
            AV56SeleccionarEliminar = true ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSeleccionareliminar.getInternalname(), AV56SeleccionarEliminar);
            if (true) break;
         }
         AV131i = (short)(AV131i+1) ;
      }
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(67) ;
      }
      sendrow_672( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_67_Refreshing )
      {
         httpContext.doAjaxLoad(67, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavLb_tiprec.setValue( GXutil.trim( GXutil.str( AV138Lb_TipRec, 1, 0)) );
      cmbavLb_provdef.setValue( GXutil.rtrim( AV144Lb_ProvDef) );
   }

   public void e171TS2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV8ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV6ColumnsSelector.fromJSonString(AV8ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "GestionLaboratorio.RecepciondeEnsayoCliente_WCColumnsSelector", ((GXutil.strcmp("", AV8ColumnsSelectorXML)==0) ? "" : AV6ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV6ColumnsSelector", AV6ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV48ManageFiltersData", AV48ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV39GridState", AV39GridState);
   }

   public void e131TS2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("GestionLaboratorio.RecepciondeEnsayoCliente_WCFilters")),GXutil.URLEncode(GXutil.rtrim(AV180Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV49ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49ManageFiltersExecutionStep", GXutil.str( AV49ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("GestionLaboratorio.RecepciondeEnsayoCliente_WCFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV49ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49ManageFiltersExecutionStep", GXutil.str( AV49ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char3 = AV50ManageFiltersXml ;
         GXv_char15[0] = GXt_char3 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "GestionLaboratorio.RecepciondeEnsayoCliente_WCFilters", Ddo_managefilters_Activeeventkey, GXv_char15) ;
         recepciondeensayocliente_wc_impl.this.GXt_char3 = GXv_char15[0] ;
         AV50ManageFiltersXml = GXt_char3 ;
         if ( (GXutil.strcmp("", AV50ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV180Pgmname+"GridState", AV50ManageFiltersXml) ;
            AV39GridState.fromxml(AV50ManageFiltersXml, null, null);
            AV51OrderedBy = AV39GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51OrderedBy), 4, 0));
            AV53OrderedDsc = AV39GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53OrderedDsc", AV53OrderedDsc);
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
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV39GridState", AV39GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV75TFLb_Estado_Sels", AV75TFLb_Estado_Sels);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV6ColumnsSelector", AV6ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV48ManageFiltersData", AV48ManageFiltersData);
   }

   public void e211TS2( )
   {
      /* 'DoRecepcion' Routine */
      returnInSub = false ;
      AV135Num_v = (short)(0) ;
      Gx_msg = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_msg", Gx_msg);
      AV131i = (short)(1) ;
      while ( AV131i <= AV127Col_Lb_numero.size() )
      {
         AV132IN_Lb_numero = ((Number) AV127Col_Lb_numero.elementAt(-1+AV131i)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV132IN_Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV132IN_Lb_numero), 8, 0));
         if ( GXutil.resetTime(AV46Lb_fechaR).before( GXutil.resetTime( A5567Lb_FechaEn )) )
         {
            Gx_msg = httpContext.getMessage( "Fecha de Recepcion es inferior a Fecha Envio", "") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_msg", Gx_msg);
            if (true) break;
         }
         /* Execute user subroutine: 'NVECES' */
         S192 ();
         if (returnInSub) return;
         if ( AV135Num_v > 1 )
         {
            if (true) break;
         }
         AV131i = (short)(AV131i+1) ;
      }
      if ( ! (GXutil.strcmp("", Gx_msg)==0) )
      {
         httpContext.GX_msglist.addItem(Gx_msg);
      }
      else
      {
         if ( (0==AV127Col_Lb_numero.size()) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "NO ha selecciona ninguna linea¡", ""));
         }
         else
         {
            if ( AV135Num_v > 1 )
            {
               Gx_msg = httpContext.getMessage( "Atencion. el Ensayo ", "") + GXutil.trim( GXutil.str( AV132IN_Lb_numero, 8, 0)) + httpContext.getMessage( " tiene mas de una opcion.", "") + GXutil.newLine( ) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_msg", Gx_msg);
               Gx_msg += httpContext.getMessage( "Solo se permite una opcion¡", "") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_msg", Gx_msg);
               httpContext.GX_msglist.addItem(Gx_msg);
            }
            else
            {
               if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV46Lb_fechaR)) )
               {
                  httpContext.GX_msglist.addItem(httpContext.getMessage( "NO hay Fecha Recepcion", ""));
               }
               else
               {
                  if ( GXutil.strcmp(AV148ActualizacionEnsayoTxp, "S") == 0 )
                  {
                     if ( (0==AV153F_Cformu) )
                     {
                        AV131i = (short)(1) ;
                        while ( AV131i <= AV127Col_Lb_numero.size() )
                        {
                           AV5Clicod = A252CliCod ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5Clicod), 6, 0));
                           AV152CliNom = A279CliNom ;
                           AV161lb_artcod = A5533Lb_ArtCod ;
                           AV44Lb_colnom = A5536Lb_ColNom ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44Lb_colnom", AV44Lb_colnom);
                           AV162lb_colNum = A5537Lb_ColNum ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV172TipColcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV172TipColcod), 2, 0));
                           AV145Lb_colnomc = A5538Lb_ColNomC ;
                           AV131i = (short)(AV131i+1) ;
                        }
                        Dvelop_confirmpanel_recepcion_Confirmationtext = httpContext.getMessage( "Ha seleccionado Actualizar en Produccion", "")+GXutil.newLine( ) ;
                        ucDvelop_confirmpanel_recepcion.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_recepcion_Internalname, "ConfirmationText", Dvelop_confirmpanel_recepcion_Confirmationtext);
                        Dvelop_confirmpanel_recepcion_Confirmationtext = Dvelop_confirmpanel_recepcion_Confirmationtext+httpContext.getMessage( "Ademas de hacer la Recepcion, se procedera a:", "")+GXutil.newLine( ) ;
                        ucDvelop_confirmpanel_recepcion.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_recepcion_Internalname, "ConfirmationText", Dvelop_confirmpanel_recepcion_Confirmationtext);
                        Dvelop_confirmpanel_recepcion_Confirmationtext = Dvelop_confirmpanel_recepcion_Confirmationtext+httpContext.getMessage( "Este Nº Ensayo, NO existe en Colorteca.", "")+GXutil.newLine( ) ;
                        ucDvelop_confirmpanel_recepcion.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_recepcion_Internalname, "ConfirmationText", Dvelop_confirmpanel_recepcion_Confirmationtext);
                        Dvelop_confirmpanel_recepcion_Confirmationtext = Dvelop_confirmpanel_recepcion_Confirmationtext+httpContext.getMessage( "Creara el COLOR:", "")+GXutil.newLine( ) ;
                        ucDvelop_confirmpanel_recepcion.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_recepcion_Internalname, "ConfirmationText", Dvelop_confirmpanel_recepcion_Confirmationtext);
                        Dvelop_confirmpanel_recepcion_Confirmationtext = Dvelop_confirmpanel_recepcion_Confirmationtext+httpContext.getMessage( "Cliente ", "")+GXutil.trim( AV152CliNom)+GXutil.newLine( ) ;
                        ucDvelop_confirmpanel_recepcion.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_recepcion_Internalname, "ConfirmationText", Dvelop_confirmpanel_recepcion_Confirmationtext);
                        Dvelop_confirmpanel_recepcion_Confirmationtext = Dvelop_confirmpanel_recepcion_Confirmationtext+httpContext.getMessage( "Color ", "")+GXutil.trim( AV145Lb_colnomc)+GXutil.newLine( ) ;
                        ucDvelop_confirmpanel_recepcion.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_recepcion_Internalname, "ConfirmationText", Dvelop_confirmpanel_recepcion_Confirmationtext);
                        Dvelop_confirmpanel_recepcion_Confirmationtext = Dvelop_confirmpanel_recepcion_Confirmationtext+httpContext.getMessage( "Numero ", "")+GXutil.trim( GXutil.str( AV162lb_colNum, 6, 0))+GXutil.newLine( ) ;
                        ucDvelop_confirmpanel_recepcion.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_recepcion_Internalname, "ConfirmationText", Dvelop_confirmpanel_recepcion_Confirmationtext);
                        Dvelop_confirmpanel_recepcion_Confirmationtext = Dvelop_confirmpanel_recepcion_Confirmationtext+httpContext.getMessage( "Numero ", "")+GXutil.trim( GXutil.str( AV172TipColcod, 2, 0))+GXutil.newLine( ) ;
                        ucDvelop_confirmpanel_recepcion.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_recepcion_Internalname, "ConfirmationText", Dvelop_confirmpanel_recepcion_Confirmationtext);
                        Dvelop_confirmpanel_recepcion_Confirmationtext = Dvelop_confirmpanel_recepcion_Confirmationtext+httpContext.getMessage( "Desea continuar?", "") ;
                        ucDvelop_confirmpanel_recepcion.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_recepcion_Internalname, "ConfirmationText", Dvelop_confirmpanel_recepcion_Confirmationtext);
                     }
                     else
                     {
                        GXv_char15[0] = AV32Emprcod ;
                        GXv_int14[0] = AV156ForNumCol ;
                        GXv_int11[0] = AV170Numform ;
                        new app.pfornumcol(remoteHandle, context).execute( GXv_char15, GXv_int14, GXv_int11) ;
                        recepciondeensayocliente_wc_impl.this.AV32Emprcod = GXv_char15[0] ;
                        recepciondeensayocliente_wc_impl.this.AV156ForNumCol = GXv_int14[0] ;
                        recepciondeensayocliente_wc_impl.this.AV170Numform = (short)((short)(GXv_int11[0])) ;
                        httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32Emprcod", AV32Emprcod);
                        httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavFornumcol_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV156ForNumCol), 8, 0));
                        httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV170Numform", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV170Numform), 4, 0));
                        Dvelop_confirmpanel_recepcion_Confirmationtext = httpContext.getMessage( "Ha seleccionado Actualizar en Produccion", "")+GXutil.newLine( ) ;
                        ucDvelop_confirmpanel_recepcion.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_recepcion_Internalname, "ConfirmationText", Dvelop_confirmpanel_recepcion_Confirmationtext);
                        Dvelop_confirmpanel_recepcion_Confirmationtext = Dvelop_confirmpanel_recepcion_Confirmationtext+httpContext.getMessage( "Ademas de hacer la Recepcion, se procedera a:", "")+GXutil.newLine( ) ;
                        ucDvelop_confirmpanel_recepcion.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_recepcion_Internalname, "ConfirmationText", Dvelop_confirmpanel_recepcion_Confirmationtext);
                        Dvelop_confirmpanel_recepcion_Confirmationtext = Dvelop_confirmpanel_recepcion_Confirmationtext+httpContext.getMessage( "Este Nº Ensayo, EXISTE en Colorteca.", "")+GXutil.newLine( ) ;
                        ucDvelop_confirmpanel_recepcion.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_recepcion_Internalname, "ConfirmationText", Dvelop_confirmpanel_recepcion_Confirmationtext);
                        Dvelop_confirmpanel_recepcion_Confirmationtext = Dvelop_confirmpanel_recepcion_Confirmationtext+httpContext.getMessage( "Se eliminaran: COLORANTES y PRODUCTOS(#)", "")+GXutil.newLine( ) ;
                        ucDvelop_confirmpanel_recepcion.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_recepcion_Internalname, "ConfirmationText", Dvelop_confirmpanel_recepcion_Confirmationtext);
                        Dvelop_confirmpanel_recepcion_Confirmationtext = Dvelop_confirmpanel_recepcion_Confirmationtext+httpContext.getMessage( "Desea continuar?", "") ;
                        ucDvelop_confirmpanel_recepcion.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_recepcion_Internalname, "ConfirmationText", Dvelop_confirmpanel_recepcion_Confirmationtext);
                     }
                  }
                  this.executeUsercontrolMethod(sPrefix, false, "DVELOP_CONFIRMPANEL_RECEPCIONContainer", "Confirm", "", new Object[] {});
               }
            }
         }
      }
      /*  Sending Event outputs  */
   }

   public void e181TS2( )
   {
      /* Dvelop_confirmpanel_recepcion_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_recepcion_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION RECEPCION' */
         S202 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV129Col_Lb_opcion", AV129Col_Lb_opcion);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV127Col_Lb_numero", AV127Col_Lb_numero);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV6ColumnsSelector", AV6ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV48ManageFiltersData", AV48ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV39GridState", AV39GridState);
   }

   public void e191TS2( )
   {
      /* Dvelop_confirmpanel_eliminarrecepcion_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_eliminarrecepcion_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMINARRECEPCION' */
         S212 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV130Col_Lb_opcionE", AV130Col_Lb_opcionE);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV128Col_Lb_numeroE", AV128Col_Lb_numeroE);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV6ColumnsSelector", AV6ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV48ManageFiltersData", AV48ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV39GridState", AV39GridState);
   }

   public void e201TS2( )
   {
      /* Dvelop_confirmpanel_aprobacioninterna_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_aprobacioninterna_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION APROBACIONINTERNA' */
         S222 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      cmbavLb_tiprec.setValue( GXutil.trim( GXutil.str( AV138Lb_TipRec, 1, 0)) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavLb_tiprec.getInternalname(), "Values", cmbavLb_tiprec.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV6ColumnsSelector", AV6ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV48ManageFiltersData", AV48ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV39GridState", AV39GridState);
   }

   public void e221TS2( )
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

   public void e231TS2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char15[0] = AV34ExcelFilename ;
      GXv_char6[0] = AV33ErrorMessage ;
      new app.gestionlaboratorio.recepciondeensayocliente_wcexport(remoteHandle, context).execute( GXv_char15, GXv_char6) ;
      recepciondeensayocliente_wc_impl.this.AV34ExcelFilename = GXv_char15[0] ;
      recepciondeensayocliente_wc_impl.this.AV33ErrorMessage = GXv_char6[0] ;
      if ( GXutil.strcmp(AV34ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV34ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV33ErrorMessage);
      }
   }

   public void e241TS2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.gestionlaboratorio.recepciondeensayocliente_wcexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV51OrderedBy, 4, 0))+":"+(AV53OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV6ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector16[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "&Seleccionar", "", "", true, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "Lb_numero", "", "Nº de Ensayo", true, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "CliCod", "", "Cliente", true, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "Lb_ArtCod", "", "Articulo", true, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "Lb_ColNomC", "", "Color Cliente", true, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "Lb_ColNum", "", "Numero", true, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "Lb_Rb", "", "Rb", true, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "Lb_opcion", "", "Opcion", true, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "&Lb_TipRec", "", "Tipo", true, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "Lb_numop", "", "Nº", true, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "Lb_Cartaz", "", "Coleccion", true, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "Lb_FechaE", "Fecha", "Entrada", true, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "Lb_FechaEn", "Fecha", "Envio", true, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "Lb_FechaR", "Fecha", "Recepcion", true, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "Lb_Estado", "", "Estado", true, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "&SeleccionarEliminar", "", "E", true, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      if ( new app.pexicon(remoteHandle, context).executeUdp( AV32Emprcod, httpContext.getMessage( "MODA21", "")) == 1 )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         GXv_SdtWWPColumnsSelector16[0] = AV6ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "&Lb_ProvDef", "", "P_D", true, "") ;
         AV6ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector16[0] = AV6ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "", "", "", false, "") ;
         AV6ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      }
      GXv_SdtWWPColumnsSelector16[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "Lb_ObsCR", "", "Obs", true, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXt_char3 = AV124UserCustomValue ;
      GXv_char15[0] = GXt_char3 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "GestionLaboratorio.RecepciondeEnsayoCliente_WCColumnsSelector", GXv_char15) ;
      recepciondeensayocliente_wc_impl.this.GXt_char3 = GXv_char15[0] ;
      AV124UserCustomValue = GXt_char3 ;
      if ( ! ( (GXutil.strcmp("", AV124UserCustomValue)==0) ) )
      {
         AV7ColumnsSelectorAux.fromxml(AV124UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector16[0] = AV7ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector17[0] = AV6ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, GXv_SdtWWPColumnsSelector17) ;
         AV7ColumnsSelectorAux = GXv_SdtWWPColumnsSelector16[0] ;
         AV6ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item18 = AV48ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item19[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item18 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "GestionLaboratorio.RecepciondeEnsayoCliente_WCFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item19) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item18 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item19[0] ;
      AV48ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item18 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV35FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35FilterFullText", AV35FilterFullText);
      AV100TFLb_numero = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV100TFLb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV100TFLb_numero), 8, 0));
      AV101TFLb_numero_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV101TFLb_numero_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV101TFLb_numero_To), 8, 0));
      AV58TFCliCod = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58TFCliCod), 6, 0));
      AV59TFCliCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59TFCliCod_To), 6, 0));
      AV64TFLb_ArtCod = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFLb_ArtCod", AV64TFLb_ArtCod);
      AV65TFLb_ArtCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFLb_ArtCod_Sel", AV65TFLb_ArtCod_Sel);
      AV68TFLb_ColNomC = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TFLb_ColNomC", AV68TFLb_ColNomC);
      AV69TFLb_ColNomC_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69TFLb_ColNomC_Sel", AV69TFLb_ColNomC_Sel);
      AV175TFLb_ColNum = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV175TFLb_ColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV175TFLb_ColNum), 6, 0));
      AV176TFLb_ColNum_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV176TFLb_ColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV176TFLb_ColNum_To), 6, 0));
      AV120TFLb_Rb = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV120TFLb_Rb", GXutil.ltrimstr( AV120TFLb_Rb, 7, 2));
      AV121TFLb_Rb_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV121TFLb_Rb_To", GXutil.ltrimstr( AV121TFLb_Rb_To, 7, 2));
      AV108TFLb_opcion = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV108TFLb_opcion", AV108TFLb_opcion);
      AV109TFLb_opcion_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV109TFLb_opcion_Sel", AV109TFLb_opcion_Sel);
      AV102TFLb_numop = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV102TFLb_numop", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV102TFLb_numop), 2, 0));
      AV103TFLb_numop_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV103TFLb_numop_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV103TFLb_numop_To), 2, 0));
      AV66TFLb_Cartaz = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFLb_Cartaz", AV66TFLb_Cartaz);
      AV67TFLb_Cartaz_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67TFLb_Cartaz_Sel", AV67TFLb_Cartaz_Sel);
      AV80TFLb_FechaE = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80TFLb_FechaE", localUtil.format(AV80TFLb_FechaE, "99/99/99"));
      AV82TFLb_FechaEn = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82TFLb_FechaEn", localUtil.format(AV82TFLb_FechaEn, "99/99/99"));
      AV84TFLb_FechaR = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84TFLb_FechaR", localUtil.format(AV84TFLb_FechaR, "99/99/99"));
      AV75TFLb_Estado_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "") ;
      AV104TFLb_ObsCR = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV104TFLb_ObsCR", AV104TFLb_ObsCR);
      AV105TFLb_ObsCR_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV105TFLb_ObsCR_Sel", AV105TFLb_ObsCR_Sel);
      Ddo_grid_Selectedvalue_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      Ddo_grid_Filteredtext_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S202( )
   {
      /* 'DO ACTION RECEPCION' Routine */
      returnInSub = false ;
      AV136Lb_HoraR = GXutil.resetDate(GXutil.serverNow( context, remoteHandle, pr_default)) ;
      AV131i = (short)(1) ;
      while ( AV131i <= AV127Col_Lb_numero.size() )
      {
         AV132IN_Lb_numero = ((Number) AV127Col_Lb_numero.elementAt(-1+AV131i)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV132IN_Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV132IN_Lb_numero), 8, 0));
         AV137IN_Lb_opcion = (String)AV129Col_Lb_opcion.elementAt(-1+AV131i) ;
         new app.gestionlaboratorio.pens007(remoteHandle, context).execute( AV32Emprcod, AV132IN_Lb_numero, AV137IN_Lb_opcion, AV46Lb_fechaR, AV136Lb_HoraR, A5536Lb_ColNom, A5537Lb_ColNum, A831TipColCod, AV138Lb_TipRec, (byte)(2), AV144Lb_ProvDef) ;
         GXv_char15[0] = AV32Emprcod ;
         GXv_int14[0] = AV132IN_Lb_numero ;
         new app.gestionlaboratorio.pdbgl03(remoteHandle, context).execute( GXv_char15, GXv_int14) ;
         recepciondeensayocliente_wc_impl.this.AV32Emprcod = GXv_char15[0] ;
         recepciondeensayocliente_wc_impl.this.AV132IN_Lb_numero = GXv_int14[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32Emprcod", AV32Emprcod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV132IN_Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV132IN_Lb_numero), 8, 0));
         if ( AV139Moda21 == 1 )
         {
            new app.gestionlaboratorio.pregcor7(remoteHandle, context).execute( AV32Emprcod, AV132IN_Lb_numero, AV137IN_Lb_opcion, AV46Lb_fechaR, A252CliCod, AV144Lb_ProvDef) ;
         }
         AV5Clicod = A252CliCod ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5Clicod), 6, 0));
         AV152CliNom = A279CliNom ;
         AV161lb_artcod = A5533Lb_ArtCod ;
         AV44Lb_colnom = A5536Lb_ColNom ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44Lb_colnom", AV44Lb_colnom);
         AV162lb_colNum = A5537Lb_ColNum ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV172TipColcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV172TipColcod), 2, 0));
         AV169Num_color = GXutil.trim( GXutil.str( A5537Lb_ColNum, 6, 0)) + GXutil.trim( GXutil.str( A5718Lb_numop, 2, 0)) ;
         AV168N_color = (int)(GXutil.lval( GXutil.substring( AV169Num_color, 1, 6))) ;
         AV131i = (short)(AV131i+1) ;
      }
      if ( GXutil.strcmp(AV148ActualizacionEnsayoTxp, "S") == 0 )
      {
         GXv_char15[0] = AV32Emprcod ;
         GXv_int14[0] = AV132IN_Lb_numero ;
         GXv_char6[0] = AV44Lb_colnom ;
         GXv_int11[0] = AV162lb_colNum ;
         new app.pens09c(remoteHandle, context).execute( GXv_char15, GXv_int14, GXv_char6, GXv_int11) ;
         recepciondeensayocliente_wc_impl.this.AV32Emprcod = GXv_char15[0] ;
         recepciondeensayocliente_wc_impl.this.AV132IN_Lb_numero = GXv_int14[0] ;
         recepciondeensayocliente_wc_impl.this.AV44Lb_colnom = GXv_char6[0] ;
         recepciondeensayocliente_wc_impl.this.AV162lb_colNum = GXv_int11[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32Emprcod", AV32Emprcod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV132IN_Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV132IN_Lb_numero), 8, 0));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44Lb_colnom", AV44Lb_colnom);
         GXv_char15[0] = AV32Emprcod ;
         GXv_int14[0] = AV132IN_Lb_numero ;
         GXv_char6[0] = AV137IN_Lb_opcion ;
         GXv_date13[0] = AV46Lb_fechaR ;
         GXv_decimal20[0] = AV164Lb_CosteE ;
         GXv_int21[0] = AV146Lb_RGB ;
         GXv_int12[0] = (byte)(AV153F_Cformu) ;
         GXv_int2[0] = (byte)(0) ;
         GXv_int22[0] = (byte)(0) ;
         GXv_int11[0] = AV162lb_colNum ;
         GXv_char5[0] = httpContext.getMessage( "N", "") ;
         new app.gestionlaboratorio.pens009(remoteHandle, context).execute( GXv_char15, GXv_int14, GXv_char6, GXv_date13, GXv_decimal20, GXv_int21, GXv_int12, GXv_int2, GXv_int22, GXv_int11, GXv_char5) ;
         recepciondeensayocliente_wc_impl.this.AV32Emprcod = GXv_char15[0] ;
         recepciondeensayocliente_wc_impl.this.AV132IN_Lb_numero = GXv_int14[0] ;
         recepciondeensayocliente_wc_impl.this.AV137IN_Lb_opcion = GXv_char6[0] ;
         recepciondeensayocliente_wc_impl.this.AV46Lb_fechaR = GXv_date13[0] ;
         recepciondeensayocliente_wc_impl.this.AV164Lb_CosteE = GXv_decimal20[0] ;
         recepciondeensayocliente_wc_impl.this.AV146Lb_RGB = GXv_int21[0] ;
         recepciondeensayocliente_wc_impl.this.AV153F_Cformu = GXv_int12[0] ;
         recepciondeensayocliente_wc_impl.this.AV162lb_colNum = GXv_int11[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32Emprcod", AV32Emprcod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV132IN_Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV132IN_Lb_numero), 8, 0));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46Lb_fechaR", localUtil.format(AV46Lb_fechaR, "99/99/99"));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV164Lb_CosteE", GXutil.ltrimstr( AV164Lb_CosteE, 11, 5));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV146Lb_RGB", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV146Lb_RGB), 10, 0));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavF_cformu_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV153F_Cformu), 4, 0));
         if ( GXutil.strcmp(AV149AprobacionColorLab, "S") == 0 )
         {
            httpContext.popup(formatLink("app.gestionlaboratorio.aprobacioncolorhdr", new String[] {GXutil.URLEncode(GXutil.rtrim(AV32Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV5Clicod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV152CliNom)),GXutil.URLEncode(GXutil.rtrim(AV161lb_artcod)),GXutil.URLEncode(GXutil.rtrim(AV44Lb_colnom)),GXutil.URLEncode(GXutil.ltrimstr(AV162lb_colNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV172TipColcod,2,0))}, new String[] {"EmprCod","CliCod","CliNom","ForSer","ForColNom","ForColNum","TipColCod"}) , new Object[] {"AV32Emprcod","AV5Clicod","AV152CliNom","AV161lb_artcod","AV44Lb_colnom","AV162lb_colNum","AV172TipColcod"});
         }
         if ( AV139Moda21 == 1 )
         {
            httpContext.popup(formatLink("app.gestionlaboratorio.rens22m", new String[] {GXutil.URLEncode(GXutil.rtrim(AV32Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV132IN_Lb_numero,8,0)),GXutil.URLEncode(GXutil.rtrim(AV137IN_Lb_opcion)),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "SCR", "")))}, new String[] {"EmprCod","Lb_numero","Lb_opcion","Output"}) , new Object[] {"AV32Emprcod","AV132IN_Lb_numero","AV137IN_Lb_opcion",""});
         }
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Proceso Actualizacion Finalizado", ""));
      }
      AV148ActualizacionEnsayoTxp = "N" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV148ActualizacionEnsayoTxp", AV148ActualizacionEnsayoTxp);
      AV149AprobacionColorLab = "N" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV149AprobacionColorLab", AV149AprobacionColorLab);
      AV129Col_Lb_opcion.clear();
      AV127Col_Lb_numero.clear();
      AV129Col_Lb_opcion.clear();
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S212( )
   {
      /* 'DO ACTION ELIMINARRECEPCION' Routine */
      returnInSub = false ;
      AV131i = (short)(1) ;
      while ( AV131i <= AV128Col_Lb_numeroE.size() )
      {
         AV132IN_Lb_numero = ((Number) AV128Col_Lb_numeroE.elementAt(-1+AV131i)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV132IN_Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV132IN_Lb_numero), 8, 0));
         AV137IN_Lb_opcion = (String)AV130Col_Lb_opcionE.elementAt(-1+AV131i) ;
         AV140Fec_null = GXutil.nullDate() ;
         AV141Hora_null = GXutil.resetTime( GXutil.nullDate() );
         new app.gestionlaboratorio.pens007(remoteHandle, context).execute( AV32Emprcod, AV132IN_Lb_numero, AV137IN_Lb_opcion, AV140Fec_null, AV141Hora_null, A5536Lb_ColNom, A5537Lb_ColNum, A831TipColCod, AV138Lb_TipRec, (byte)(1), AV144Lb_ProvDef) ;
         GXv_char15[0] = AV32Emprcod ;
         GXv_int14[0] = AV132IN_Lb_numero ;
         new app.gestionlaboratorio.pdbgl03(remoteHandle, context).execute( GXv_char15, GXv_int14) ;
         recepciondeensayocliente_wc_impl.this.AV32Emprcod = GXv_char15[0] ;
         recepciondeensayocliente_wc_impl.this.AV132IN_Lb_numero = GXv_int14[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32Emprcod", AV32Emprcod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV132IN_Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV132IN_Lb_numero), 8, 0));
         if ( AV139Moda21 == 1 )
         {
            AV143Fecha_b = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV143Fecha_b", localUtil.format(AV143Fecha_b, "99/99/99"));
            new app.gestionlaboratorio.pregcor7(remoteHandle, context).execute( AV32Emprcod, AV132IN_Lb_numero, " ", AV143Fecha_b, A252CliCod, AV144Lb_ProvDef) ;
         }
         AV131i = (short)(AV131i+1) ;
      }
      AV130Col_Lb_opcionE.clear();
      AV128Col_Lb_numeroE.clear();
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S222( )
   {
      /* 'DO ACTION APROBACIONINTERNA' Routine */
      returnInSub = false ;
      AV147Act_op = (short)(0) ;
      AV166Lb_opcions = "" ;
      AV126Col_EnvioEnsayo.clear();
      AV131i = (short)(1) ;
      while ( AV131i <= AV127Col_Lb_numero.size() )
      {
         AV171Opcion = "" ;
         AV161lb_artcod = "" ;
         AV44Lb_colnom = "" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44Lb_colnom", AV44Lb_colnom);
         AV132IN_Lb_numero = ((Number) AV127Col_Lb_numero.elementAt(-1+AV131i)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV132IN_Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV132IN_Lb_numero), 8, 0));
         AV137IN_Lb_opcion = (String)AV129Col_Lb_opcion.elementAt(-1+AV131i) ;
         GXv_char15[0] = AV32Emprcod ;
         GXv_int14[0] = AV132IN_Lb_numero ;
         GXv_char6[0] = AV137IN_Lb_opcion ;
         GXv_char5[0] = A5533Lb_ArtCod ;
         GXv_char4[0] = AV44Lb_colnom ;
         GXv_int11[0] = A5537Lb_ColNum ;
         GXv_int22[0] = A831TipColCod ;
         GXv_int12[0] = AV138Lb_TipRec ;
         GXv_date13[0] = AV46Lb_fechaR ;
         GXv_char23[0] = AV171Opcion ;
         new app.gestionlaboratorio.pens019(remoteHandle, context).execute( GXv_char15, GXv_int14, GXv_char6, GXv_char5, GXv_char4, GXv_int11, GXv_int22, GXv_int12, GXv_date13, GXv_char23) ;
         recepciondeensayocliente_wc_impl.this.AV32Emprcod = GXv_char15[0] ;
         recepciondeensayocliente_wc_impl.this.AV132IN_Lb_numero = GXv_int14[0] ;
         recepciondeensayocliente_wc_impl.this.AV137IN_Lb_opcion = GXv_char6[0] ;
         recepciondeensayocliente_wc_impl.this.A5533Lb_ArtCod = GXv_char5[0] ;
         recepciondeensayocliente_wc_impl.this.AV44Lb_colnom = GXv_char4[0] ;
         recepciondeensayocliente_wc_impl.this.A5537Lb_ColNum = GXv_int11[0] ;
         recepciondeensayocliente_wc_impl.this.A831TipColCod = GXv_int22[0] ;
         recepciondeensayocliente_wc_impl.this.AV138Lb_TipRec = GXv_int12[0] ;
         recepciondeensayocliente_wc_impl.this.AV46Lb_fechaR = GXv_date13[0] ;
         recepciondeensayocliente_wc_impl.this.AV171Opcion = GXv_char23[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32Emprcod", AV32Emprcod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV132IN_Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV132IN_Lb_numero), 8, 0));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44Lb_colnom", AV44Lb_colnom);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavLb_tiprec.getInternalname(), GXutil.str( AV138Lb_TipRec, 1, 0));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46Lb_fechaR", localUtil.format(AV46Lb_fechaR, "99/99/99"));
         AV147Act_op = (short)(1) ;
         AV165Lb_opcioni = AV137IN_Lb_opcion ;
         AV163Lb_colnumi = A5537Lb_ColNum ;
         AV167Lb_tipreci = A5597Lb_TipRec ;
         AV151Clicodgrid = A252CliCod ;
         if ( GXutil.strcmp(AV166Lb_opcions, " ") == 0 )
         {
            AV166Lb_opcions = GXutil.trim( AV137IN_Lb_opcion) + "+" ;
         }
         else
         {
            AV166Lb_opcions += GXutil.concat( GXutil.trim( AV137IN_Lb_opcion), "+", "") ;
         }
         AV159IN_Lb_numerol = AV132IN_Lb_numero ;
         AV173Item_EnvioEnsayo = (app.gestionlaboratorio.SdtEnviodeEnsayo_SDT)new app.gestionlaboratorio.SdtEnviodeEnsayo_SDT(remoteHandle, context);
         AV173Item_EnvioEnsayo.setgxTv_SdtEnviodeEnsayo_SDT_Lb_numero( AV132IN_Lb_numero );
         AV173Item_EnvioEnsayo.setgxTv_SdtEnviodeEnsayo_SDT_Lb_opcion( AV137IN_Lb_opcion );
         AV173Item_EnvioEnsayo.setgxTv_SdtEnviodeEnsayo_SDT_Lb_cartaz( A5540Lb_Cartaz );
         AV173Item_EnvioEnsayo.setgxTv_SdtEnviodeEnsayo_SDT_Coste( DecimalUtil.doubleToDec(AV174coste) );
         AV126Col_EnvioEnsayo.add(AV173Item_EnvioEnsayo, 0);
         AV131i = (short)(AV131i+1) ;
      }
      if ( GXutil.strcmp(AV166Lb_opcions, " ") != 0 )
      {
         GXv_char23[0] = AV32Emprcod ;
         GXv_int14[0] = AV159IN_Lb_numerol ;
         GXv_char15[0] = AV166Lb_opcions ;
         GXv_date13[0] = AV46Lb_fechaR ;
         GXv_int11[0] = AV151Clicodgrid ;
         new app.gestionlaboratorio.pregcor8(remoteHandle, context).execute( GXv_char23, GXv_int14, GXv_char15, GXv_date13, GXv_int11) ;
         recepciondeensayocliente_wc_impl.this.AV32Emprcod = GXv_char23[0] ;
         recepciondeensayocliente_wc_impl.this.AV159IN_Lb_numerol = GXv_int14[0] ;
         recepciondeensayocliente_wc_impl.this.AV166Lb_opcions = GXv_char15[0] ;
         recepciondeensayocliente_wc_impl.this.AV46Lb_fechaR = GXv_date13[0] ;
         recepciondeensayocliente_wc_impl.this.AV151Clicodgrid = GXv_int11[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32Emprcod", AV32Emprcod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46Lb_fechaR", localUtil.format(AV46Lb_fechaR, "99/99/99"));
         new app.gestionlaboratorio.pregcor7(remoteHandle, context).execute( AV32Emprcod, AV159IN_Lb_numerol, AV166Lb_opcions, AV46Lb_fechaR, AV151Clicodgrid, AV144Lb_ProvDef) ;
      }
      if ( AV147Act_op == 1 )
      {
         GXv_char23[0] = AV32Emprcod ;
         GXv_int14[0] = AV47Lb_numero ;
         GXv_char15[0] = AV165Lb_opcioni ;
         GXv_int11[0] = AV163Lb_colnumi ;
         GXv_int22[0] = AV167Lb_tipreci ;
         GXv_date13[0] = AV46Lb_fechaR ;
         new app.gestionlaboratorio.pens019r(remoteHandle, context).execute( GXv_char23, GXv_int14, GXv_char15, GXv_int11, GXv_int22, GXv_date13) ;
         recepciondeensayocliente_wc_impl.this.AV32Emprcod = GXv_char23[0] ;
         recepciondeensayocliente_wc_impl.this.AV47Lb_numero = GXv_int14[0] ;
         recepciondeensayocliente_wc_impl.this.AV165Lb_opcioni = GXv_char15[0] ;
         recepciondeensayocliente_wc_impl.this.AV163Lb_colnumi = GXv_int11[0] ;
         recepciondeensayocliente_wc_impl.this.AV167Lb_tipreci = GXv_int22[0] ;
         recepciondeensayocliente_wc_impl.this.AV46Lb_fechaR = GXv_date13[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32Emprcod", AV32Emprcod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47Lb_numero), 8, 0));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46Lb_fechaR", localUtil.format(AV46Lb_fechaR, "99/99/99"));
      }
      AV160Json_EnvioEnsayo = AV126Col_EnvioEnsayo.toJSonString(false) ;
      httpContext.popup(formatLink("app.gestionlaboratorio.rensm016", new String[] {GXutil.URLEncode(GXutil.rtrim(AV32Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV151Clicodgrid,6,0)),GXutil.URLEncode(GXutil.rtrim(AV43Lb_Cartaz)),GXutil.URLEncode(GXutil.formatDateParm(AV46Lb_fechaR)),GXutil.URLEncode(GXutil.rtrim(AV160Json_EnvioEnsayo))}, new String[] {"EmprCod","CliCod","Lb_cartaz","Lb_fechaen","Json_EnvioEnsayo"}) , new Object[] {"AV32Emprcod","AV151Clicodgrid","AV43Lb_Cartaz","AV46Lb_fechaR","AV160Json_EnvioEnsayo"});
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV57Session.getValue(AV180Pgmname+"GridState"), "") == 0 )
      {
         AV39GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV180Pgmname+"GridState"), null, null);
      }
      else
      {
         AV39GridState.fromxml(AV57Session.getValue(AV180Pgmname+"GridState"), null, null);
      }
      AV51OrderedBy = AV39GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51OrderedBy), 4, 0));
      AV53OrderedDsc = AV39GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53OrderedDsc", AV53OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S182 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV39GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV39GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV39GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S182( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV210GXV1 = 1 ;
      while ( AV210GXV1 <= AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV40GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV210GXV1));
         if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV35FilterFullText = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35FilterFullText", AV35FilterFullText);
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_NUMERO") == 0 )
         {
            AV100TFLb_numero = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV100TFLb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV100TFLb_numero), 8, 0));
            AV101TFLb_numero_To = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV101TFLb_numero_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV101TFLb_numero_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV58TFCliCod = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58TFCliCod), 6, 0));
            AV59TFCliCod_To = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTCOD") == 0 )
         {
            AV64TFLb_ArtCod = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFLb_ArtCod", AV64TFLb_ArtCod);
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTCOD_SEL") == 0 )
         {
            AV65TFLb_ArtCod_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFLb_ArtCod_Sel", AV65TFLb_ArtCod_Sel);
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOMC") == 0 )
         {
            AV68TFLb_ColNomC = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TFLb_ColNomC", AV68TFLb_ColNomC);
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOMC_SEL") == 0 )
         {
            AV69TFLb_ColNomC_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69TFLb_ColNomC_Sel", AV69TFLb_ColNomC_Sel);
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNUM") == 0 )
         {
            AV175TFLb_ColNum = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV175TFLb_ColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV175TFLb_ColNum), 6, 0));
            AV176TFLb_ColNum_To = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV176TFLb_ColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV176TFLb_ColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_RB") == 0 )
         {
            AV120TFLb_Rb = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV120TFLb_Rb", GXutil.ltrimstr( AV120TFLb_Rb, 7, 2));
            AV121TFLb_Rb_To = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV121TFLb_Rb_To", GXutil.ltrimstr( AV121TFLb_Rb_To, 7, 2));
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_OPCION") == 0 )
         {
            AV108TFLb_opcion = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV108TFLb_opcion", AV108TFLb_opcion);
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_OPCION_SEL") == 0 )
         {
            AV109TFLb_opcion_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV109TFLb_opcion_Sel", AV109TFLb_opcion_Sel);
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_NUMOP") == 0 )
         {
            AV102TFLb_numop = (byte)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV102TFLb_numop", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV102TFLb_numop), 2, 0));
            AV103TFLb_numop_To = (byte)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV103TFLb_numop_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV103TFLb_numop_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZ") == 0 )
         {
            AV66TFLb_Cartaz = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFLb_Cartaz", AV66TFLb_Cartaz);
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZ_SEL") == 0 )
         {
            AV67TFLb_Cartaz_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67TFLb_Cartaz_Sel", AV67TFLb_Cartaz_Sel);
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FECHAE") == 0 )
         {
            AV80TFLb_FechaE = localUtil.ctod( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80TFLb_FechaE", localUtil.format(AV80TFLb_FechaE, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FECHAEN") == 0 )
         {
            AV82TFLb_FechaEn = localUtil.ctod( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82TFLb_FechaEn", localUtil.format(AV82TFLb_FechaEn, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FECHAR") == 0 )
         {
            AV84TFLb_FechaR = localUtil.ctod( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84TFLb_FechaR", localUtil.format(AV84TFLb_FechaR, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ESTADO_SEL") == 0 )
         {
            AV76TFLb_Estado_SelsJson = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76TFLb_Estado_SelsJson", AV76TFLb_Estado_SelsJson);
            AV75TFLb_Estado_Sels.fromJSonString(AV76TFLb_Estado_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_OBSCR") == 0 )
         {
            AV104TFLb_ObsCR = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV104TFLb_ObsCR", AV104TFLb_ObsCR);
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_OBSCR_SEL") == 0 )
         {
            AV105TFLb_ObsCR_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV105TFLb_ObsCR_Sel", AV105TFLb_ObsCR_Sel);
         }
         AV210GXV1 = (int)(AV210GXV1+1) ;
      }
      GXt_char3 = "" ;
      GXv_char23[0] = GXt_char3 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV65TFLb_ArtCod_Sel)==0), AV65TFLb_ArtCod_Sel, GXv_char23) ;
      recepciondeensayocliente_wc_impl.this.GXt_char3 = GXv_char23[0] ;
      GXt_char24 = "" ;
      GXv_char15[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV69TFLb_ColNomC_Sel)==0), AV69TFLb_ColNomC_Sel, GXv_char15) ;
      recepciondeensayocliente_wc_impl.this.GXt_char24 = GXv_char15[0] ;
      GXt_char25 = "" ;
      GXv_char6[0] = GXt_char25 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV109TFLb_opcion_Sel)==0), AV109TFLb_opcion_Sel, GXv_char6) ;
      recepciondeensayocliente_wc_impl.this.GXt_char25 = GXv_char6[0] ;
      GXt_char26 = "" ;
      GXv_char5[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV67TFLb_Cartaz_Sel)==0), AV67TFLb_Cartaz_Sel, GXv_char5) ;
      recepciondeensayocliente_wc_impl.this.GXt_char26 = GXv_char5[0] ;
      GXt_char27 = "" ;
      GXv_char4[0] = GXt_char27 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV105TFLb_ObsCR_Sel)==0), AV105TFLb_ObsCR_Sel, GXv_char4) ;
      recepciondeensayocliente_wc_impl.this.GXt_char27 = GXv_char4[0] ;
      Ddo_grid_Selectedvalue_set = "|||"+GXt_char3+"|"+GXt_char24+"|||"+GXt_char25+"|||"+GXt_char26+"||||"+((AV75TFLb_Estado_Sels.size()==0) ? "" : AV76TFLb_Estado_SelsJson)+"|||"+GXt_char27 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char27 = "" ;
      GXv_char23[0] = GXt_char27 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV64TFLb_ArtCod)==0), AV64TFLb_ArtCod, GXv_char23) ;
      recepciondeensayocliente_wc_impl.this.GXt_char27 = GXv_char23[0] ;
      GXt_char26 = "" ;
      GXv_char15[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV68TFLb_ColNomC)==0), AV68TFLb_ColNomC, GXv_char15) ;
      recepciondeensayocliente_wc_impl.this.GXt_char26 = GXv_char15[0] ;
      GXt_char25 = "" ;
      GXv_char6[0] = GXt_char25 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV108TFLb_opcion)==0), AV108TFLb_opcion, GXv_char6) ;
      recepciondeensayocliente_wc_impl.this.GXt_char25 = GXv_char6[0] ;
      GXt_char24 = "" ;
      GXv_char5[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV66TFLb_Cartaz)==0), AV66TFLb_Cartaz, GXv_char5) ;
      recepciondeensayocliente_wc_impl.this.GXt_char24 = GXv_char5[0] ;
      GXt_char3 = "" ;
      GXv_char4[0] = GXt_char3 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV104TFLb_ObsCR)==0), AV104TFLb_ObsCR, GXv_char4) ;
      recepciondeensayocliente_wc_impl.this.GXt_char3 = GXv_char4[0] ;
      Ddo_grid_Filteredtext_set = "|"+((0==AV100TFLb_numero) ? "" : GXutil.str( AV100TFLb_numero, 8, 0))+"|"+((0==AV58TFCliCod) ? "" : GXutil.str( AV58TFCliCod, 6, 0))+"|"+GXt_char27+"|"+GXt_char26+"|"+((0==AV175TFLb_ColNum) ? "" : GXutil.str( AV175TFLb_ColNum, 6, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV120TFLb_Rb)==0) ? "" : GXutil.str( AV120TFLb_Rb, 7, 2))+"|"+GXt_char25+"||"+((0==AV102TFLb_numop) ? "" : GXutil.str( AV102TFLb_numop, 2, 0))+"|"+GXt_char24+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV80TFLb_FechaE)) ? "" : localUtil.dtoc( AV80TFLb_FechaE, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV82TFLb_FechaEn)) ? "" : localUtil.dtoc( AV82TFLb_FechaEn, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV84TFLb_FechaR)) ? "" : localUtil.dtoc( AV84TFLb_FechaR, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"||||"+GXt_char3 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "|"+((0==AV101TFLb_numero_To) ? "" : GXutil.str( AV101TFLb_numero_To, 8, 0))+"|"+((0==AV59TFCliCod_To) ? "" : GXutil.str( AV59TFCliCod_To, 6, 0))+"|||"+((0==AV176TFLb_ColNum_To) ? "" : GXutil.str( AV176TFLb_ColNum_To, 6, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV121TFLb_Rb_To)==0) ? "" : GXutil.str( AV121TFLb_Rb_To, 7, 2))+"|||"+((0==AV103TFLb_numop_To) ? "" : GXutil.str( AV103TFLb_numop_To, 2, 0))+"||||||||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV39GridState.fromxml(AV57Session.getValue(AV180Pgmname+"GridState"), null, null);
      AV39GridState.setgxTv_SdtWWPGridState_Orderedby( AV51OrderedBy );
      AV39GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV53OrderedDsc );
      AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState28[0] = AV39GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV35FilterFullText)==0), (short)(0), AV35FilterFullText, "") ;
      AV39GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV39GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFLB_NUMERO", "", !((0==AV100TFLb_numero)&&(0==AV101TFLb_numero_To)), (short)(0), GXutil.trim( GXutil.str( AV100TFLb_numero, 8, 0)), GXutil.trim( GXutil.str( AV101TFLb_numero_To, 8, 0))) ;
      AV39GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV39GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFCLICOD", "", !((0==AV58TFCliCod)&&(0==AV59TFCliCod_To)), (short)(0), GXutil.trim( GXutil.str( AV58TFCliCod, 6, 0)), GXutil.trim( GXutil.str( AV59TFCliCod_To, 6, 0))) ;
      AV39GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV39GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFLB_ARTCOD", "", !(GXutil.strcmp("", AV64TFLb_ArtCod)==0), (short)(0), AV64TFLb_ArtCod, "", !(GXutil.strcmp("", AV65TFLb_ArtCod_Sel)==0), AV65TFLb_ArtCod_Sel, "") ;
      AV39GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV39GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFLB_COLNOMC", "", !(GXutil.strcmp("", AV68TFLb_ColNomC)==0), (short)(0), AV68TFLb_ColNomC, "", !(GXutil.strcmp("", AV69TFLb_ColNomC_Sel)==0), AV69TFLb_ColNomC_Sel, "") ;
      AV39GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV39GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFLB_COLNUM", "", !((0==AV175TFLb_ColNum)&&(0==AV176TFLb_ColNum_To)), (short)(0), GXutil.trim( GXutil.str( AV175TFLb_ColNum, 6, 0)), GXutil.trim( GXutil.str( AV176TFLb_ColNum_To, 6, 0))) ;
      AV39GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV39GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFLB_RB", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV120TFLb_Rb)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV121TFLb_Rb_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV120TFLb_Rb, 7, 2)), GXutil.trim( GXutil.str( AV121TFLb_Rb_To, 7, 2))) ;
      AV39GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV39GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFLB_OPCION", "", !(GXutil.strcmp("", AV108TFLb_opcion)==0), (short)(0), AV108TFLb_opcion, "", !(GXutil.strcmp("", AV109TFLb_opcion_Sel)==0), AV109TFLb_opcion_Sel, "") ;
      AV39GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV39GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFLB_NUMOP", "", !((0==AV102TFLb_numop)&&(0==AV103TFLb_numop_To)), (short)(0), GXutil.trim( GXutil.str( AV102TFLb_numop, 2, 0)), GXutil.trim( GXutil.str( AV103TFLb_numop_To, 2, 0))) ;
      AV39GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV39GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFLB_CARTAZ", "", !(GXutil.strcmp("", AV66TFLb_Cartaz)==0), (short)(0), AV66TFLb_Cartaz, "", !(GXutil.strcmp("", AV67TFLb_Cartaz_Sel)==0), AV67TFLb_Cartaz_Sel, "") ;
      AV39GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV39GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFLB_FECHAE", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV80TFLb_FechaE)), (short)(0), GXutil.trim( localUtil.dtoc( AV80TFLb_FechaE, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV39GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV39GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFLB_FECHAEN", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV82TFLb_FechaEn)), (short)(0), GXutil.trim( localUtil.dtoc( AV82TFLb_FechaEn, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV39GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV39GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFLB_FECHAR", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV84TFLb_FechaR)), (short)(0), GXutil.trim( localUtil.dtoc( AV84TFLb_FechaR, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV39GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV39GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFLB_ESTADO_SEL", "", !(AV75TFLb_Estado_Sels.size()==0), (short)(0), AV75TFLb_Estado_Sels.toJSonString(false), "") ;
      AV39GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV39GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFLB_OBSCR", "", !(GXutil.strcmp("", AV104TFLb_ObsCR)==0), (short)(0), AV104TFLb_ObsCR, "", !(GXutil.strcmp("", AV105TFLb_ObsCR_Sel)==0), AV105TFLb_ObsCR_Sel, "") ;
      AV39GridState = GXv_SdtWWPGridState28[0] ;
      if ( ! (GXutil.strcmp("", AV32Emprcod)==0) )
      {
         AV40GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV40GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV40GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV32Emprcod );
         AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV40GridStateFilterValue, 0);
      }
      if ( ! (0==AV5Clicod) )
      {
         AV40GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV40GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICOD" );
         AV40GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV5Clicod, 6, 0) );
         AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV40GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV43Lb_Cartaz)==0) )
      {
         AV40GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV40GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&LB_CARTAZ" );
         AV40GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV43Lb_Cartaz );
         AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV40GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV44Lb_colnom)==0) )
      {
         AV40GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV40GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&LB_COLNOM" );
         AV40GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV44Lb_colnom );
         AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV40GridStateFilterValue, 0);
      }
      if ( ! (0==AV47Lb_numero) )
      {
         AV40GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV40GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&LB_NUMERO" );
         AV40GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV47Lb_numero, 8, 0) );
         AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV40GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV46Lb_fechaR)) )
      {
         AV40GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV40GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&LB_FECHAR" );
         AV40GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV46Lb_fechaR, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV40GridStateFilterValue, 0);
      }
      if ( ! (0==AV45Lb_estado) )
      {
         AV40GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV40GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&LB_ESTADO" );
         AV40GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV45Lb_estado, 1, 0) );
         AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV40GridStateFilterValue, 0);
      }
      AV39GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV39GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV180Pgmname+"GridState", AV39GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV122TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV122TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV180Pgmname );
      AV122TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV122TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV41HTTPRequest.getScriptName()+"?"+AV41HTTPRequest.getQuerystring() );
      AV122TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "GestionLaboratorio.TENS003" );
      AV57Session.setValue("TrnContext", AV122TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S192( )
   {
      /* 'NVECES' Routine */
      returnInSub = false ;
      AV135Num_v = (short)(0) ;
      AV133t = (short)(1) ;
      while ( AV133t <= AV127Col_Lb_numero.size() )
      {
         AV134IN_Lb_numerot = ((Number) AV127Col_Lb_numero.elementAt(-1+AV133t)).intValue() ;
         if ( AV134IN_Lb_numerot == AV132IN_Lb_numero )
         {
            AV135Num_v = (short)(AV135Num_v+1) ;
         }
         AV133t = (short)(AV133t+1) ;
      }
   }

   public void wb_table4_117_1TS2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_aprobacioninterna_Internalname, tblTabledvelop_confirmpanel_aprobacioninterna_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_aprobacioninterna.setProperty("Title", Dvelop_confirmpanel_aprobacioninterna_Title);
         ucDvelop_confirmpanel_aprobacioninterna.setProperty("ConfirmationText", Dvelop_confirmpanel_aprobacioninterna_Confirmationtext);
         ucDvelop_confirmpanel_aprobacioninterna.setProperty("YesButtonCaption", Dvelop_confirmpanel_aprobacioninterna_Yesbuttoncaption);
         ucDvelop_confirmpanel_aprobacioninterna.setProperty("NoButtonCaption", Dvelop_confirmpanel_aprobacioninterna_Nobuttoncaption);
         ucDvelop_confirmpanel_aprobacioninterna.setProperty("CancelButtonCaption", Dvelop_confirmpanel_aprobacioninterna_Cancelbuttoncaption);
         ucDvelop_confirmpanel_aprobacioninterna.setProperty("YesButtonPosition", Dvelop_confirmpanel_aprobacioninterna_Yesbuttonposition);
         ucDvelop_confirmpanel_aprobacioninterna.setProperty("ConfirmType", Dvelop_confirmpanel_aprobacioninterna_Confirmtype);
         ucDvelop_confirmpanel_aprobacioninterna.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_aprobacioninterna_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_APROBACIONINTERNAContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_APROBACIONINTERNAContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_117_1TS2e( true) ;
      }
      else
      {
         wb_table4_117_1TS2e( false) ;
      }
   }

   public void wb_table3_112_1TS2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_eliminarrecepcion_Internalname, tblTabledvelop_confirmpanel_eliminarrecepcion_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_eliminarrecepcion.setProperty("Title", Dvelop_confirmpanel_eliminarrecepcion_Title);
         ucDvelop_confirmpanel_eliminarrecepcion.setProperty("ConfirmationText", Dvelop_confirmpanel_eliminarrecepcion_Confirmationtext);
         ucDvelop_confirmpanel_eliminarrecepcion.setProperty("YesButtonCaption", Dvelop_confirmpanel_eliminarrecepcion_Yesbuttoncaption);
         ucDvelop_confirmpanel_eliminarrecepcion.setProperty("NoButtonCaption", Dvelop_confirmpanel_eliminarrecepcion_Nobuttoncaption);
         ucDvelop_confirmpanel_eliminarrecepcion.setProperty("CancelButtonCaption", Dvelop_confirmpanel_eliminarrecepcion_Cancelbuttoncaption);
         ucDvelop_confirmpanel_eliminarrecepcion.setProperty("YesButtonPosition", Dvelop_confirmpanel_eliminarrecepcion_Yesbuttonposition);
         ucDvelop_confirmpanel_eliminarrecepcion.setProperty("ConfirmType", Dvelop_confirmpanel_eliminarrecepcion_Confirmtype);
         ucDvelop_confirmpanel_eliminarrecepcion.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_eliminarrecepcion_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARRECEPCIONContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARRECEPCIONContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_112_1TS2e( true) ;
      }
      else
      {
         wb_table3_112_1TS2e( false) ;
      }
   }

   public void wb_table2_107_1TS2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_recepcion_Internalname, tblTabledvelop_confirmpanel_recepcion_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_recepcion.setProperty("Title", Dvelop_confirmpanel_recepcion_Title);
         ucDvelop_confirmpanel_recepcion.setProperty("ConfirmationText", Dvelop_confirmpanel_recepcion_Confirmationtext);
         ucDvelop_confirmpanel_recepcion.setProperty("YesButtonCaption", Dvelop_confirmpanel_recepcion_Yesbuttoncaption);
         ucDvelop_confirmpanel_recepcion.setProperty("NoButtonCaption", Dvelop_confirmpanel_recepcion_Nobuttoncaption);
         ucDvelop_confirmpanel_recepcion.setProperty("CancelButtonCaption", Dvelop_confirmpanel_recepcion_Cancelbuttoncaption);
         ucDvelop_confirmpanel_recepcion.setProperty("YesButtonPosition", Dvelop_confirmpanel_recepcion_Yesbuttonposition);
         ucDvelop_confirmpanel_recepcion.setProperty("ConfirmType", Dvelop_confirmpanel_recepcion_Confirmtype);
         ucDvelop_confirmpanel_recepcion.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_recepcion_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_RECEPCIONContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_RECEPCIONContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_107_1TS2e( true) ;
      }
      else
      {
         wb_table2_107_1TS2e( false) ;
      }
   }

   public void wb_table1_23_1TS2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV48ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table5_28_1TS2( true) ;
      }
      else
      {
         wb_table5_28_1TS2( false) ;
      }
      return  ;
   }

   public void wb_table5_28_1TS2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_23_1TS2e( true) ;
      }
      else
      {
         wb_table1_23_1TS2e( false) ;
      }
   }

   public void wb_table5_28_1TS2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'" + sPrefix + "',false,'" + sGXsfl_67_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV35FilterFullText, GXutil.rtrim( localUtil.format( AV35FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_GestionLaboratorio\\RecepciondeEnsayoCliente_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_28_1TS2e( true) ;
      }
      else
      {
         wb_table5_28_1TS2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV32Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32Emprcod", AV32Emprcod);
      AV5Clicod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5Clicod), 6, 0));
      AV43Lb_Cartaz = (String)getParm(obj,2,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43Lb_Cartaz", AV43Lb_Cartaz);
      AV44Lb_colnom = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44Lb_colnom", AV44Lb_colnom);
      AV47Lb_numero = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47Lb_numero), 8, 0));
      AV46Lb_fechaR = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46Lb_fechaR", localUtil.format(AV46Lb_fechaR, "99/99/99"));
      AV45Lb_estado = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45Lb_estado", GXutil.str( AV45Lb_estado, 1, 0));
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
      pa1TS2( ) ;
      ws1TS2( ) ;
      we1TS2( ) ;
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
      sCtrlAV32Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV5Clicod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV43Lb_Cartaz = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV44Lb_colnom = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV47Lb_numero = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV46Lb_fechaR = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV45Lb_estado = (String)getParm(obj,6,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1TS2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "gestionlaboratorio\\recepciondeensayocliente_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1TS2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV32Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32Emprcod", AV32Emprcod);
         AV5Clicod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5Clicod), 6, 0));
         AV43Lb_Cartaz = (String)getParm(obj,4,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43Lb_Cartaz", AV43Lb_Cartaz);
         AV44Lb_colnom = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44Lb_colnom", AV44Lb_colnom);
         AV47Lb_numero = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47Lb_numero), 8, 0));
         AV46Lb_fechaR = (java.util.Date)getParm(obj,7,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46Lb_fechaR", localUtil.format(AV46Lb_fechaR, "99/99/99"));
         AV45Lb_estado = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45Lb_estado", GXutil.str( AV45Lb_estado, 1, 0));
      }
      wcpOAV32Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV32Emprcod") ;
      wcpOAV5Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV5Clicod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV43Lb_Cartaz = httpContext.cgiGet( sPrefix+"wcpOAV43Lb_Cartaz") ;
      wcpOAV44Lb_colnom = httpContext.cgiGet( sPrefix+"wcpOAV44Lb_colnom") ;
      wcpOAV47Lb_numero = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV47Lb_numero"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV46Lb_fechaR = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV46Lb_fechaR"), 0) ;
      wcpOAV45Lb_estado = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV45Lb_estado"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV32Emprcod, wcpOAV32Emprcod) != 0 ) || ( AV5Clicod != wcpOAV5Clicod ) || ( GXutil.strcmp(AV43Lb_Cartaz, wcpOAV43Lb_Cartaz) != 0 ) || ( GXutil.strcmp(AV44Lb_colnom, wcpOAV44Lb_colnom) != 0 ) || ( AV47Lb_numero != wcpOAV47Lb_numero ) || !( GXutil.dateCompare(GXutil.resetTime(AV46Lb_fechaR), GXutil.resetTime(wcpOAV46Lb_fechaR)) ) || ( AV45Lb_estado != wcpOAV45Lb_estado ) ) )
      {
         setjustcreated();
      }
      wcpOAV32Emprcod = AV32Emprcod ;
      wcpOAV5Clicod = AV5Clicod ;
      wcpOAV43Lb_Cartaz = AV43Lb_Cartaz ;
      wcpOAV44Lb_colnom = AV44Lb_colnom ;
      wcpOAV47Lb_numero = AV47Lb_numero ;
      wcpOAV46Lb_fechaR = AV46Lb_fechaR ;
      wcpOAV45Lb_estado = AV45Lb_estado ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV32Emprcod = httpContext.cgiGet( sPrefix+"AV32Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV32Emprcod) > 0 )
      {
         AV32Emprcod = httpContext.cgiGet( sCtrlAV32Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32Emprcod", AV32Emprcod);
      }
      else
      {
         AV32Emprcod = httpContext.cgiGet( sPrefix+"AV32Emprcod_PARM") ;
      }
      sCtrlAV5Clicod = httpContext.cgiGet( sPrefix+"AV5Clicod_CTRL") ;
      if ( GXutil.len( sCtrlAV5Clicod) > 0 )
      {
         AV5Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV5Clicod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5Clicod), 6, 0));
      }
      else
      {
         AV5Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV5Clicod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV43Lb_Cartaz = httpContext.cgiGet( sPrefix+"AV43Lb_Cartaz_CTRL") ;
      if ( GXutil.len( sCtrlAV43Lb_Cartaz) > 0 )
      {
         AV43Lb_Cartaz = httpContext.cgiGet( sCtrlAV43Lb_Cartaz) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43Lb_Cartaz", AV43Lb_Cartaz);
      }
      else
      {
         AV43Lb_Cartaz = httpContext.cgiGet( sPrefix+"AV43Lb_Cartaz_PARM") ;
      }
      sCtrlAV44Lb_colnom = httpContext.cgiGet( sPrefix+"AV44Lb_colnom_CTRL") ;
      if ( GXutil.len( sCtrlAV44Lb_colnom) > 0 )
      {
         AV44Lb_colnom = httpContext.cgiGet( sCtrlAV44Lb_colnom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44Lb_colnom", AV44Lb_colnom);
      }
      else
      {
         AV44Lb_colnom = httpContext.cgiGet( sPrefix+"AV44Lb_colnom_PARM") ;
      }
      sCtrlAV47Lb_numero = httpContext.cgiGet( sPrefix+"AV47Lb_numero_CTRL") ;
      if ( GXutil.len( sCtrlAV47Lb_numero) > 0 )
      {
         AV47Lb_numero = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV47Lb_numero), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47Lb_numero), 8, 0));
      }
      else
      {
         AV47Lb_numero = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV47Lb_numero_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV46Lb_fechaR = httpContext.cgiGet( sPrefix+"AV46Lb_fechaR_CTRL") ;
      if ( GXutil.len( sCtrlAV46Lb_fechaR) > 0 )
      {
         AV46Lb_fechaR = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV46Lb_fechaR), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46Lb_fechaR", localUtil.format(AV46Lb_fechaR, "99/99/99"));
      }
      else
      {
         AV46Lb_fechaR = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV46Lb_fechaR_PARM"), 0) ;
      }
      sCtrlAV45Lb_estado = httpContext.cgiGet( sPrefix+"AV45Lb_estado_CTRL") ;
      if ( GXutil.len( sCtrlAV45Lb_estado) > 0 )
      {
         AV45Lb_estado = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV45Lb_estado), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45Lb_estado", GXutil.str( AV45Lb_estado, 1, 0));
      }
      else
      {
         AV45Lb_estado = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV45Lb_estado_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa1TS2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1TS2( ) ;
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
      ws1TS2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV32Emprcod_PARM", GXutil.rtrim( AV32Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV32Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV32Emprcod_CTRL", GXutil.rtrim( sCtrlAV32Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5Clicod_PARM", GXutil.ltrim( localUtil.ntoc( AV5Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV5Clicod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5Clicod_CTRL", GXutil.rtrim( sCtrlAV5Clicod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV43Lb_Cartaz_PARM", GXutil.rtrim( AV43Lb_Cartaz));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV43Lb_Cartaz)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV43Lb_Cartaz_CTRL", GXutil.rtrim( sCtrlAV43Lb_Cartaz));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV44Lb_colnom_PARM", GXutil.rtrim( AV44Lb_colnom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV44Lb_colnom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV44Lb_colnom_CTRL", GXutil.rtrim( sCtrlAV44Lb_colnom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV47Lb_numero_PARM", GXutil.ltrim( localUtil.ntoc( AV47Lb_numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV47Lb_numero)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV47Lb_numero_CTRL", GXutil.rtrim( sCtrlAV47Lb_numero));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV46Lb_fechaR_PARM", localUtil.dtoc( AV46Lb_fechaR, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV46Lb_fechaR)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV46Lb_fechaR_CTRL", GXutil.rtrim( sCtrlAV46Lb_fechaR));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV45Lb_estado_PARM", GXutil.ltrim( localUtil.ntoc( AV45Lb_estado, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV45Lb_estado)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV45Lb_estado_CTRL", GXutil.rtrim( sCtrlAV45Lb_estado));
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
      we1TS2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026821166675", true, true);
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
      httpContext.AddJavascriptSource("gestionlaboratorio/recepciondeensayocliente_wc.js", "?2026821166676", false, true);
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

   public void subsflControlProps_672( )
   {
      chkavSeleccionar.setInternalname( sPrefix+"vSELECCIONAR_"+sGXsfl_67_idx );
      edtLb_numero_Internalname = sPrefix+"LB_NUMERO_"+sGXsfl_67_idx ;
      edtCliCod_Internalname = sPrefix+"CLICOD_"+sGXsfl_67_idx ;
      edtLb_ArtCod_Internalname = sPrefix+"LB_ARTCOD_"+sGXsfl_67_idx ;
      edtLb_ColNomC_Internalname = sPrefix+"LB_COLNOMC_"+sGXsfl_67_idx ;
      edtLb_ColNum_Internalname = sPrefix+"LB_COLNUM_"+sGXsfl_67_idx ;
      edtLb_Rb_Internalname = sPrefix+"LB_RB_"+sGXsfl_67_idx ;
      edtLb_opcion_Internalname = sPrefix+"LB_OPCION_"+sGXsfl_67_idx ;
      cmbavLb_tiprec.setInternalname( sPrefix+"vLB_TIPREC_"+sGXsfl_67_idx );
      edtLb_numop_Internalname = sPrefix+"LB_NUMOP_"+sGXsfl_67_idx ;
      edtLb_Cartaz_Internalname = sPrefix+"LB_CARTAZ_"+sGXsfl_67_idx ;
      edtLb_FechaE_Internalname = sPrefix+"LB_FECHAE_"+sGXsfl_67_idx ;
      edtLb_FechaEn_Internalname = sPrefix+"LB_FECHAEN_"+sGXsfl_67_idx ;
      edtLb_FechaR_Internalname = sPrefix+"LB_FECHAR_"+sGXsfl_67_idx ;
      cmbLb_Estado.setInternalname( sPrefix+"LB_ESTADO_"+sGXsfl_67_idx );
      chkavSeleccionareliminar.setInternalname( sPrefix+"vSELECCIONARELIMINAR_"+sGXsfl_67_idx );
      cmbavLb_provdef.setInternalname( sPrefix+"vLB_PROVDEF_"+sGXsfl_67_idx );
      edtLb_ObsCR_Internalname = sPrefix+"LB_OBSCR_"+sGXsfl_67_idx ;
      cmbLb_opSt.setInternalname( sPrefix+"LB_OPST_"+sGXsfl_67_idx );
      edtLb_opFc_Internalname = sPrefix+"LB_OPFC_"+sGXsfl_67_idx ;
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_67_idx ;
      edtavF_cformu_Internalname = sPrefix+"vF_CFORMU_"+sGXsfl_67_idx ;
      edtavFornumcol_Internalname = sPrefix+"vFORNUMCOL_"+sGXsfl_67_idx ;
      edtLb_CosteE_Internalname = sPrefix+"LB_COSTEE_"+sGXsfl_67_idx ;
      edtavGridvariable1_Internalname = sPrefix+"vGRIDVARIABLE1_"+sGXsfl_67_idx ;
      edtTipColCod_Internalname = sPrefix+"TIPCOLCOD_"+sGXsfl_67_idx ;
      edtLb_ColNom_Internalname = sPrefix+"LB_COLNOM_"+sGXsfl_67_idx ;
   }

   public void subsflControlProps_fel_672( )
   {
      chkavSeleccionar.setInternalname( sPrefix+"vSELECCIONAR_"+sGXsfl_67_fel_idx );
      edtLb_numero_Internalname = sPrefix+"LB_NUMERO_"+sGXsfl_67_fel_idx ;
      edtCliCod_Internalname = sPrefix+"CLICOD_"+sGXsfl_67_fel_idx ;
      edtLb_ArtCod_Internalname = sPrefix+"LB_ARTCOD_"+sGXsfl_67_fel_idx ;
      edtLb_ColNomC_Internalname = sPrefix+"LB_COLNOMC_"+sGXsfl_67_fel_idx ;
      edtLb_ColNum_Internalname = sPrefix+"LB_COLNUM_"+sGXsfl_67_fel_idx ;
      edtLb_Rb_Internalname = sPrefix+"LB_RB_"+sGXsfl_67_fel_idx ;
      edtLb_opcion_Internalname = sPrefix+"LB_OPCION_"+sGXsfl_67_fel_idx ;
      cmbavLb_tiprec.setInternalname( sPrefix+"vLB_TIPREC_"+sGXsfl_67_fel_idx );
      edtLb_numop_Internalname = sPrefix+"LB_NUMOP_"+sGXsfl_67_fel_idx ;
      edtLb_Cartaz_Internalname = sPrefix+"LB_CARTAZ_"+sGXsfl_67_fel_idx ;
      edtLb_FechaE_Internalname = sPrefix+"LB_FECHAE_"+sGXsfl_67_fel_idx ;
      edtLb_FechaEn_Internalname = sPrefix+"LB_FECHAEN_"+sGXsfl_67_fel_idx ;
      edtLb_FechaR_Internalname = sPrefix+"LB_FECHAR_"+sGXsfl_67_fel_idx ;
      cmbLb_Estado.setInternalname( sPrefix+"LB_ESTADO_"+sGXsfl_67_fel_idx );
      chkavSeleccionareliminar.setInternalname( sPrefix+"vSELECCIONARELIMINAR_"+sGXsfl_67_fel_idx );
      cmbavLb_provdef.setInternalname( sPrefix+"vLB_PROVDEF_"+sGXsfl_67_fel_idx );
      edtLb_ObsCR_Internalname = sPrefix+"LB_OBSCR_"+sGXsfl_67_fel_idx ;
      cmbLb_opSt.setInternalname( sPrefix+"LB_OPST_"+sGXsfl_67_fel_idx );
      edtLb_opFc_Internalname = sPrefix+"LB_OPFC_"+sGXsfl_67_fel_idx ;
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_67_fel_idx ;
      edtavF_cformu_Internalname = sPrefix+"vF_CFORMU_"+sGXsfl_67_fel_idx ;
      edtavFornumcol_Internalname = sPrefix+"vFORNUMCOL_"+sGXsfl_67_fel_idx ;
      edtLb_CosteE_Internalname = sPrefix+"LB_COSTEE_"+sGXsfl_67_fel_idx ;
      edtavGridvariable1_Internalname = sPrefix+"vGRIDVARIABLE1_"+sGXsfl_67_fel_idx ;
      edtTipColCod_Internalname = sPrefix+"TIPCOLCOD_"+sGXsfl_67_fel_idx ;
      edtLb_ColNom_Internalname = sPrefix+"LB_COLNOM_"+sGXsfl_67_fel_idx ;
   }

   public void sendrow_672( )
   {
      subsflControlProps_672( ) ;
      wb1TS0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_67_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_67_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_67_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+((chkavSeleccionar.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavSeleccionar.getEnabled()!=0)&&(chkavSeleccionar.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 68,'"+sPrefix+"',false,'"+sGXsfl_67_idx+"',67)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "vSELECCIONAR_" + sGXsfl_67_idx ;
         chkavSeleccionar.setName( GXCCtl );
         chkavSeleccionar.setWebtags( "" );
         chkavSeleccionar.setCaption( "" );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSeleccionar.getInternalname(), "TitleCaption", chkavSeleccionar.getCaption(), !bGXsfl_67_Refreshing);
         chkavSeleccionar.setCheckedValue( "false" );
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavSeleccionar.getInternalname(),GXutil.booltostr( AV55Seleccionar),"","",Integer.valueOf(chkavSeleccionar.getVisible()),Integer.valueOf(1),"true","",StyleString,ClassString,"WWColumn","",TempTags+((chkavSeleccionar.getEnabled()!=0)&&(chkavSeleccionar.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,68);\"" : " ")});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtLb_numero_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_numero_Internalname,GXutil.ltrim( localUtil.ntoc( A5532Lb_numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5532Lb_numero), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_numero_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtLb_numero_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(67),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCliCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(67),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtLb_ArtCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_ArtCod_Internalname,GXutil.rtrim( A5533Lb_ArtCod),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_ArtCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtLb_ArtCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(67),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtLb_ColNomC_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_ColNomC_Internalname,GXutil.rtrim( A5538Lb_ColNomC),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_ColNomC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtLb_ColNomC_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(67),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtLb_ColNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_ColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A5537Lb_ColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5537Lb_ColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_ColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtLb_ColNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(67),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtLb_Rb_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_Rb_Internalname,GXutil.ltrim( localUtil.ntoc( A5547Lb_Rb, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A5547Lb_Rb, "ZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_Rb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtLb_Rb_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(67),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtLb_opcion_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_opcion_Internalname,GXutil.rtrim( A5555Lb_opcion),GXutil.rtrim( localUtil.format( A5555Lb_opcion, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_opcion_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtLb_opcion_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(67),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((cmbavLb_tiprec.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         TempTags = " " + ((cmbavLb_tiprec.getEnabled()!=0)&&(cmbavLb_tiprec.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 76,'"+sPrefix+"',false,'"+sGXsfl_67_idx+"',67)\"" : " ") ;
         if ( ( cmbavLb_tiprec.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vLB_TIPREC_" + sGXsfl_67_idx ;
            cmbavLb_tiprec.setName( GXCCtl );
            cmbavLb_tiprec.setWebtags( "" );
            cmbavLb_tiprec.addItem("1", httpContext.getMessage( "Receta", ""), (short)(0));
            cmbavLb_tiprec.addItem("2", httpContext.getMessage( "Añadida", ""), (short)(0));
            cmbavLb_tiprec.addItem("3", httpContext.getMessage( "Conf.", ""), (short)(0));
            if ( cmbavLb_tiprec.getItemCount() > 0 )
            {
               AV138Lb_TipRec = (byte)(GXutil.lval( cmbavLb_tiprec.getValidValue(GXutil.trim( GXutil.str( AV138Lb_TipRec, 1, 0))))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavLb_tiprec.getInternalname(), GXutil.str( AV138Lb_TipRec, 1, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavLb_tiprec,cmbavLb_tiprec.getInternalname(),GXutil.trim( GXutil.str( AV138Lb_TipRec, 1, 0)),Integer.valueOf(1),cmbavLb_tiprec.getJsonclick(),Integer.valueOf(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(cmbavLb_tiprec.getVisible()),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavLb_tiprec.getEnabled()!=0)&&(cmbavLb_tiprec.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,76);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavLb_tiprec.setValue( GXutil.trim( GXutil.str( AV138Lb_TipRec, 1, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavLb_tiprec.getInternalname(), "Values", cmbavLb_tiprec.ToJavascriptSource(), !bGXsfl_67_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtLb_numop_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_numop_Internalname,GXutil.ltrim( localUtil.ntoc( A5718Lb_numop, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5718Lb_numop), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_numop_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtLb_numop_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(67),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtLb_Cartaz_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_Cartaz_Internalname,GXutil.rtrim( A5540Lb_Cartaz),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_Cartaz_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtLb_Cartaz_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(67),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtLb_FechaE_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_FechaE_Internalname,localUtil.format(A5541Lb_FechaE, "99/99/99"),localUtil.format( A5541Lb_FechaE, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_FechaE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtLb_FechaE_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(67),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtLb_FechaEn_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_FechaEn_Internalname,localUtil.format(A5567Lb_FechaEn, "99/99/99"),localUtil.format( A5567Lb_FechaEn, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_FechaEn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtLb_FechaEn_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(67),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtLb_FechaR_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_FechaR_Internalname,localUtil.format(A5563Lb_FechaR, "99/99/99"),localUtil.format( A5563Lb_FechaR, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_FechaR_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtLb_FechaR_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(67),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((cmbLb_Estado.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbLb_Estado.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "LB_ESTADO_" + sGXsfl_67_idx ;
            cmbLb_Estado.setName( GXCCtl );
            cmbLb_Estado.setWebtags( "" );
            cmbLb_Estado.addItem("1", httpContext.getMessage( "Enviado", ""), (short)(0));
            cmbLb_Estado.addItem("2", httpContext.getMessage( "Recepcionado", ""), (short)(0));
            if ( cmbLb_Estado.getItemCount() > 0 )
            {
               A5566Lb_Estado = (byte)(GXutil.lval( cmbLb_Estado.getValidValue(GXutil.trim( GXutil.str( A5566Lb_Estado, 1, 0))))) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbLb_Estado,cmbLb_Estado.getInternalname(),GXutil.trim( GXutil.str( A5566Lb_Estado, 1, 0)),Integer.valueOf(1),cmbLb_Estado.getJsonclick(),Integer.valueOf(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(cmbLb_Estado.getVisible()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn hidden-xs","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbLb_Estado.setValue( GXutil.trim( GXutil.str( A5566Lb_Estado, 1, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbLb_Estado.getInternalname(), "Values", cmbLb_Estado.ToJavascriptSource(), !bGXsfl_67_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+((chkavSeleccionareliminar.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavSeleccionareliminar.getEnabled()!=0)&&(chkavSeleccionareliminar.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 83,'"+sPrefix+"',false,'"+sGXsfl_67_idx+"',67)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "vSELECCIONARELIMINAR_" + sGXsfl_67_idx ;
         chkavSeleccionareliminar.setName( GXCCtl );
         chkavSeleccionareliminar.setWebtags( "" );
         chkavSeleccionareliminar.setCaption( "" );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSeleccionareliminar.getInternalname(), "TitleCaption", chkavSeleccionareliminar.getCaption(), !bGXsfl_67_Refreshing);
         chkavSeleccionareliminar.setCheckedValue( "false" );
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavSeleccionareliminar.getInternalname(),GXutil.booltostr( AV56SeleccionarEliminar),"","",Integer.valueOf(chkavSeleccionareliminar.getVisible()),Integer.valueOf(1),"true","",StyleString,ClassString,"WWColumn","",TempTags+((chkavSeleccionareliminar.getEnabled()!=0)&&(chkavSeleccionareliminar.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,83);\"" : " ")});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((cmbavLb_provdef.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         TempTags = " " + ((cmbavLb_provdef.getEnabled()!=0)&&(cmbavLb_provdef.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 84,'"+sPrefix+"',false,'"+sGXsfl_67_idx+"',67)\"" : " ") ;
         if ( ( cmbavLb_provdef.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vLB_PROVDEF_" + sGXsfl_67_idx ;
            cmbavLb_provdef.setName( GXCCtl );
            cmbavLb_provdef.setWebtags( "" );
            cmbavLb_provdef.addItem("D", httpContext.getMessage( "D", ""), (short)(0));
            cmbavLb_provdef.addItem("P", httpContext.getMessage( "P", ""), (short)(0));
            if ( cmbavLb_provdef.getItemCount() > 0 )
            {
               AV144Lb_ProvDef = cmbavLb_provdef.getValidValue(AV144Lb_ProvDef) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavLb_provdef.getInternalname(), AV144Lb_ProvDef);
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavLb_provdef,cmbavLb_provdef.getInternalname(),GXutil.rtrim( AV144Lb_ProvDef),Integer.valueOf(1),cmbavLb_provdef.getJsonclick(),Integer.valueOf(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbavLb_provdef.getVisible()),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavLb_provdef.getEnabled()!=0)&&(cmbavLb_provdef.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,84);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavLb_provdef.setValue( GXutil.rtrim( AV144Lb_ProvDef) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavLb_provdef.getInternalname(), "Values", cmbavLb_provdef.ToJavascriptSource(), !bGXsfl_67_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtLb_ObsCR_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_ObsCR_Internalname,A10822Lb_ObsCR,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_ObsCR_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtLb_ObsCR_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(300),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(67),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         if ( ( cmbLb_opSt.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "LB_OPST_" + sGXsfl_67_idx ;
            cmbLb_opSt.setName( GXCCtl );
            cmbLb_opSt.setWebtags( "" );
            cmbLb_opSt.addItem("*", httpContext.getMessage( "Aprovado o Reprovado", ""), (short)(0));
            cmbLb_opSt.addItem("A", httpContext.getMessage( "Aprovado", ""), (short)(0));
            cmbLb_opSt.addItem("R", httpContext.getMessage( "Reprovado", ""), (short)(0));
            if ( cmbLb_opSt.getItemCount() > 0 )
            {
               A12525Lb_opSt = cmbLb_opSt.getValidValue(A12525Lb_opSt) ;
               n12525Lb_opSt = false ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbLb_opSt,cmbLb_opSt.getInternalname(),GXutil.rtrim( A12525Lb_opSt),Integer.valueOf(1),cmbLb_opSt.getJsonclick(),Integer.valueOf(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbLb_opSt.setValue( GXutil.rtrim( A12525Lb_opSt) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbLb_opSt.getInternalname(), "Values", cmbLb_opSt.ToJavascriptSource(), !bGXsfl_67_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_opFc_Internalname,localUtil.format(A12526Lb_opFc, "99/99/99"),localUtil.format( A12526Lb_opFc, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_opFc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(67),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(67),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavF_cformu_Enabled!=0)&&(edtavF_cformu_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 89,'"+sPrefix+"',false,'"+sGXsfl_67_idx+"',67)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavF_cformu_Internalname,GXutil.ltrim( localUtil.ntoc( AV153F_Cformu, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavF_cformu_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV153F_Cformu), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV153F_Cformu), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavF_cformu_Enabled!=0)&&(edtavF_cformu_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,89);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavF_cformu_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavF_cformu_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(67),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavFornumcol_Enabled!=0)&&(edtavFornumcol_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 90,'"+sPrefix+"',false,'"+sGXsfl_67_idx+"',67)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavFornumcol_Internalname,GXutil.ltrim( localUtil.ntoc( AV156ForNumCol, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavFornumcol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV156ForNumCol), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV156ForNumCol), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavFornumcol_Enabled!=0)&&(edtavFornumcol_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,90);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavFornumcol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavFornumcol_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(67),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_CosteE_Internalname,GXutil.ltrim( localUtil.ntoc( A5565Lb_CosteE, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A5565Lb_CosteE, "ZZZZ9.99999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_CosteE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(67),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavGridvariable1_Enabled!=0)&&(edtavGridvariable1_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 92,'"+sPrefix+"',false,'"+sGXsfl_67_idx+"',67)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGridvariable1_Internalname,GXutil.ltrim( localUtil.ntoc( AV158GridVariable1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavGridvariable1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV158GridVariable1), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV158GridVariable1), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavGridvariable1_Enabled!=0)&&(edtavGridvariable1_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,92);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavGridvariable1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavGridvariable1_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(67),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipColCod_Internalname,GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTipColCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(67),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_ColNom_Internalname,GXutil.rtrim( A5536Lb_ColNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_ColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(67),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes1TS2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_67_idx = ((subGrid_Islastpage==1)&&(nGXsfl_67_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_67_idx+1) ;
         sGXsfl_67_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_67_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_672( ) ;
      }
      /* End function sendrow_672 */
   }

   public void startgridcontrol67( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"67\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_ColNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_Rb_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Rb", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_opcion_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Opcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbavLb_tiprec.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_numop_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_Cartaz_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coleccion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_FechaE_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Entrada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_FechaEn_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Envio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_FechaR_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Recepcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbLb_Estado.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Estado", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((chkavSeleccionareliminar.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "E", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbavLb_provdef.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "P_D", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_ObsCR_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Obs", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
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
         GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.booltostr( AV55Seleccionar));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( chkavSeleccionar.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5532Lb_numero, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_numero_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCliCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5533Lb_ArtCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_ArtCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5538Lb_ColNomC));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_ColNomC_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5537Lb_ColNum, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_ColNum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5547Lb_Rb, (byte)(7), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_Rb_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5555Lb_opcion));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_opcion_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV138Lb_TipRec, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbavLb_tiprec.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5718Lb_numop, (byte)(2), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_numop_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5540Lb_Cartaz));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_Cartaz_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A5541Lb_FechaE, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_FechaE_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A5567Lb_FechaEn, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_FechaEn_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A5563Lb_FechaR, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_FechaR_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5566Lb_Estado, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbLb_Estado.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.booltostr( AV56SeleccionarEliminar));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( chkavSeleccionareliminar.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV144Lb_ProvDef));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbavLb_provdef.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A10822Lb_ObsCR);
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_ObsCR_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A12525Lb_opSt));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A12526Lb_opFc, "99/99/99"));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A279CliNom));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV153F_Cformu, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavF_cformu_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV156ForNumCol, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavFornumcol_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5565Lb_CosteE, (byte)(11), (byte)(5), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV158GridVariable1, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGridvariable1_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5536Lb_ColNom));
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
      bttBtnrecepcion_Internalname = sPrefix+"BTNRECEPCION" ;
      bttBtneliminarrecepcion_Internalname = sPrefix+"BTNELIMINARRECEPCION" ;
      bttBtnaprobacioninterna_Internalname = sPrefix+"BTNAPROBACIONINTERNA" ;
      bttBtncancelar_Internalname = sPrefix+"BTNCANCELAR" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      chkavActualizacionensayotxp.setInternalname( sPrefix+"vACTUALIZACIONENSAYOTXP" );
      chkavAprobacioncolorlab.setInternalname( sPrefix+"vAPROBACIONCOLORLAB" );
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      chkavSeleccionar.setInternalname( sPrefix+"vSELECCIONAR" );
      edtLb_numero_Internalname = sPrefix+"LB_NUMERO" ;
      edtCliCod_Internalname = sPrefix+"CLICOD" ;
      edtLb_ArtCod_Internalname = sPrefix+"LB_ARTCOD" ;
      edtLb_ColNomC_Internalname = sPrefix+"LB_COLNOMC" ;
      edtLb_ColNum_Internalname = sPrefix+"LB_COLNUM" ;
      edtLb_Rb_Internalname = sPrefix+"LB_RB" ;
      edtLb_opcion_Internalname = sPrefix+"LB_OPCION" ;
      cmbavLb_tiprec.setInternalname( sPrefix+"vLB_TIPREC" );
      edtLb_numop_Internalname = sPrefix+"LB_NUMOP" ;
      edtLb_Cartaz_Internalname = sPrefix+"LB_CARTAZ" ;
      edtLb_FechaE_Internalname = sPrefix+"LB_FECHAE" ;
      edtLb_FechaEn_Internalname = sPrefix+"LB_FECHAEN" ;
      edtLb_FechaR_Internalname = sPrefix+"LB_FECHAR" ;
      cmbLb_Estado.setInternalname( sPrefix+"LB_ESTADO" );
      chkavSeleccionareliminar.setInternalname( sPrefix+"vSELECCIONARELIMINAR" );
      cmbavLb_provdef.setInternalname( sPrefix+"vLB_PROVDEF" );
      edtLb_ObsCR_Internalname = sPrefix+"LB_OBSCR" ;
      cmbLb_opSt.setInternalname( sPrefix+"LB_OPST" );
      edtLb_opFc_Internalname = sPrefix+"LB_OPFC" ;
      edtCliNom_Internalname = sPrefix+"CLINOM" ;
      edtavF_cformu_Internalname = sPrefix+"vF_CFORMU" ;
      edtavFornumcol_Internalname = sPrefix+"vFORNUMCOL" ;
      edtLb_CosteE_Internalname = sPrefix+"LB_COSTEE" ;
      edtavGridvariable1_Internalname = sPrefix+"vGRIDVARIABLE1" ;
      edtTipColCod_Internalname = sPrefix+"TIPCOLCOD" ;
      edtLb_ColNom_Internalname = sPrefix+"LB_COLNOM" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      Dvelop_confirmpanel_recepcion_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_RECEPCION" ;
      tblTabledvelop_confirmpanel_recepcion_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_RECEPCION" ;
      Dvelop_confirmpanel_eliminarrecepcion_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARRECEPCION" ;
      tblTabledvelop_confirmpanel_eliminarrecepcion_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_ELIMINARRECEPCION" ;
      Dvelop_confirmpanel_aprobacioninterna_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_APROBACIONINTERNA" ;
      tblTabledvelop_confirmpanel_aprobacioninterna_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_APROBACIONINTERNA" ;
      Grid_titlescategories_Internalname = sPrefix+"GRID_TITLESCATEGORIES" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
      edtavDdo_lb_fechaeauxdate_Internalname = sPrefix+"vDDO_LB_FECHAEAUXDATE" ;
      divDdo_lb_fechaeauxdates_Internalname = sPrefix+"DDO_LB_FECHAEAUXDATES" ;
      edtavDdo_lb_fechaenauxdate_Internalname = sPrefix+"vDDO_LB_FECHAENAUXDATE" ;
      divDdo_lb_fechaenauxdates_Internalname = sPrefix+"DDO_LB_FECHAENAUXDATES" ;
      edtavDdo_lb_fecharauxdate_Internalname = sPrefix+"vDDO_LB_FECHARAUXDATE" ;
      divDdo_lb_fecharauxdates_Internalname = sPrefix+"DDO_LB_FECHARAUXDATES" ;
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
      edtLb_ColNom_Jsonclick = "" ;
      edtTipColCod_Jsonclick = "" ;
      edtavGridvariable1_Jsonclick = "" ;
      edtavGridvariable1_Visible = 0 ;
      edtavGridvariable1_Enabled = 1 ;
      edtLb_CosteE_Jsonclick = "" ;
      edtavFornumcol_Jsonclick = "" ;
      edtavFornumcol_Visible = 0 ;
      edtavFornumcol_Enabled = 1 ;
      edtavF_cformu_Jsonclick = "" ;
      edtavF_cformu_Visible = 0 ;
      edtavF_cformu_Enabled = 1 ;
      edtCliNom_Jsonclick = "" ;
      edtLb_opFc_Jsonclick = "" ;
      cmbLb_opSt.setJsonclick( "" );
      edtLb_ObsCR_Jsonclick = "" ;
      cmbavLb_provdef.setJsonclick( "" );
      cmbavLb_provdef.setEnabled( 1 );
      chkavSeleccionareliminar.setCaption( "" );
      chkavSeleccionareliminar.setEnabled( 1 );
      cmbLb_Estado.setJsonclick( "" );
      edtLb_FechaR_Jsonclick = "" ;
      edtLb_FechaEn_Jsonclick = "" ;
      edtLb_FechaE_Jsonclick = "" ;
      edtLb_Cartaz_Jsonclick = "" ;
      edtLb_numop_Jsonclick = "" ;
      cmbavLb_tiprec.setJsonclick( "" );
      cmbavLb_tiprec.setEnabled( 1 );
      edtLb_opcion_Jsonclick = "" ;
      edtLb_Rb_Jsonclick = "" ;
      edtLb_ColNum_Jsonclick = "" ;
      edtLb_ColNomC_Jsonclick = "" ;
      edtLb_ArtCod_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      edtLb_numero_Jsonclick = "" ;
      chkavSeleccionar.setCaption( "" );
      chkavSeleccionar.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtLb_ObsCR_Visible = -1 ;
      cmbavLb_provdef.setVisible( -1 );
      chkavSeleccionareliminar.setVisible( -1 );
      cmbLb_Estado.setVisible( -1 );
      edtLb_FechaR_Visible = -1 ;
      edtLb_FechaEn_Visible = -1 ;
      edtLb_FechaE_Visible = -1 ;
      edtLb_Cartaz_Visible = -1 ;
      edtLb_numop_Visible = -1 ;
      cmbavLb_tiprec.setVisible( -1 );
      edtLb_opcion_Visible = -1 ;
      edtLb_Rb_Visible = -1 ;
      edtLb_ColNum_Visible = -1 ;
      edtLb_ColNomC_Visible = -1 ;
      edtLb_ArtCod_Visible = -1 ;
      edtCliCod_Visible = -1 ;
      edtLb_numero_Visible = -1 ;
      chkavSeleccionar.setVisible( -1 );
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_lb_fecharauxdate_Jsonclick = "" ;
      edtavDdo_lb_fechaenauxdate_Jsonclick = "" ;
      edtavDdo_lb_fechaeauxdate_Jsonclick = "" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      chkavAprobacioncolorlab.setEnabled( 1 );
      chkavActualizacionensayotxp.setEnabled( 1 );
      bttBtnaprobacioninterna_Visible = 1 ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hascategories = GXutil.toBoolean( -1) ;
      Grid_titlescategories_Gridtitlescategories = ";;;;;;;;;;;Fecha;Fecha;Fecha;;;;;;;;;;;;;" ;
      Dvelop_confirmpanel_aprobacioninterna_Confirmtype = "1" ;
      Dvelop_confirmpanel_aprobacioninterna_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_aprobacioninterna_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_aprobacioninterna_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_aprobacioninterna_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_aprobacioninterna_Confirmationtext = "¿Desea aplicar Aprobacion Interna?" ;
      Dvelop_confirmpanel_aprobacioninterna_Title = "" ;
      Dvelop_confirmpanel_eliminarrecepcion_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminarrecepcion_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminarrecepcion_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminarrecepcion_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminarrecepcion_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminarrecepcion_Confirmationtext = "¿Desea eliminar la Recepcion?" ;
      Dvelop_confirmpanel_eliminarrecepcion_Title = "" ;
      Dvelop_confirmpanel_recepcion_Confirmtype = "1" ;
      Dvelop_confirmpanel_recepcion_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_recepcion_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_recepcion_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_recepcion_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_recepcion_Confirmationtext = "¿Confirma Recepcion?" ;
      Dvelop_confirmpanel_recepcion_Title = "" ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "GestionLaboratorio.RecepciondeEnsayoCliente_WCGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "||||||||||||||1:Enviado,2:Recepcionado|||" ;
      Ddo_grid_Allowmultipleselection = "||||||||||||||T|||" ;
      Ddo_grid_Datalisttype = "|||Dynamic|Dynamic|||Dynamic|||Dynamic||||FixedValues|||Dynamic" ;
      Ddo_grid_Includedatalist = "|||T|T|||T|||T||||T|||T" ;
      Ddo_grid_Filterisrange = "|T|T|||T|T|||T||||||||" ;
      Ddo_grid_Filtertype = "|Numeric|Numeric|Character|Character|Numeric|Numeric|Character||Numeric|Character|Date|Date|Date||||Character" ;
      Ddo_grid_Includefilter = "|T|T|T|T|T|T|T||T|T|T|T|T||||T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "|T|T|T|T|T|T|T||T|T|T|T|T|T|||T" ;
      Ddo_grid_Columnssortvalues = "|2|3|4|5|6|7|8||9|10|11|12|13|14|||15" ;
      Ddo_grid_Columnids = "0:Seleccionar|1:Lb_numero|2:CliCod|3:Lb_ArtCod|4:Lb_ColNomC|5:Lb_ColNum|6:Lb_Rb|7:Lb_opcion|8:Lb_TipRec|9:Lb_numop|10:Lb_Cartaz|11:Lb_FechaE|12:Lb_FechaEn|13:Lb_FechaR|14:Lb_Estado|15:SeleccionarEliminar|16:Lb_ProvDef|17:Lb_ObsCR" ;
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
      chkavActualizacionensayotxp.setName( "vACTUALIZACIONENSAYOTXP" );
      chkavActualizacionensayotxp.setWebtags( "" );
      chkavActualizacionensayotxp.setCaption( httpContext.getMessage( "Actualizar Ensayo en Produccion?", "") );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavActualizacionensayotxp.getInternalname(), "TitleCaption", chkavActualizacionensayotxp.getCaption(), true);
      chkavActualizacionensayotxp.setCheckedValue( "N" );
      chkavAprobacioncolorlab.setName( "vAPROBACIONCOLORLAB" );
      chkavAprobacioncolorlab.setWebtags( "" );
      chkavAprobacioncolorlab.setCaption( httpContext.getMessage( "Actualizar Color Laboratorio?", "") );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavAprobacioncolorlab.getInternalname(), "TitleCaption", chkavAprobacioncolorlab.getCaption(), true);
      chkavAprobacioncolorlab.setCheckedValue( "N" );
      GXCCtl = "vSELECCIONAR_" + sGXsfl_67_idx ;
      chkavSeleccionar.setName( GXCCtl );
      chkavSeleccionar.setWebtags( "" );
      chkavSeleccionar.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSeleccionar.getInternalname(), "TitleCaption", chkavSeleccionar.getCaption(), !bGXsfl_67_Refreshing);
      chkavSeleccionar.setCheckedValue( "false" );
      GXCCtl = "vLB_TIPREC_" + sGXsfl_67_idx ;
      cmbavLb_tiprec.setName( GXCCtl );
      cmbavLb_tiprec.setWebtags( "" );
      cmbavLb_tiprec.addItem("1", httpContext.getMessage( "Receta", ""), (short)(0));
      cmbavLb_tiprec.addItem("2", httpContext.getMessage( "Añadida", ""), (short)(0));
      cmbavLb_tiprec.addItem("3", httpContext.getMessage( "Conf.", ""), (short)(0));
      if ( cmbavLb_tiprec.getItemCount() > 0 )
      {
      }
      GXCCtl = "LB_ESTADO_" + sGXsfl_67_idx ;
      cmbLb_Estado.setName( GXCCtl );
      cmbLb_Estado.setWebtags( "" );
      cmbLb_Estado.addItem("1", httpContext.getMessage( "Enviado", ""), (short)(0));
      cmbLb_Estado.addItem("2", httpContext.getMessage( "Recepcionado", ""), (short)(0));
      if ( cmbLb_Estado.getItemCount() > 0 )
      {
      }
      GXCCtl = "vSELECCIONARELIMINAR_" + sGXsfl_67_idx ;
      chkavSeleccionareliminar.setName( GXCCtl );
      chkavSeleccionareliminar.setWebtags( "" );
      chkavSeleccionareliminar.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSeleccionareliminar.getInternalname(), "TitleCaption", chkavSeleccionareliminar.getCaption(), !bGXsfl_67_Refreshing);
      chkavSeleccionareliminar.setCheckedValue( "false" );
      GXCCtl = "vLB_PROVDEF_" + sGXsfl_67_idx ;
      cmbavLb_provdef.setName( GXCCtl );
      cmbavLb_provdef.setWebtags( "" );
      cmbavLb_provdef.addItem("D", httpContext.getMessage( "D", ""), (short)(0));
      cmbavLb_provdef.addItem("P", httpContext.getMessage( "P", ""), (short)(0));
      if ( cmbavLb_provdef.getItemCount() > 0 )
      {
      }
      GXCCtl = "LB_OPST_" + sGXsfl_67_idx ;
      cmbLb_opSt.setName( GXCCtl );
      cmbLb_opSt.setWebtags( "" );
      cmbLb_opSt.addItem("*", httpContext.getMessage( "Aprovado o Reprovado", ""), (short)(0));
      cmbLb_opSt.addItem("A", httpContext.getMessage( "Aprovado", ""), (short)(0));
      cmbLb_opSt.addItem("R", httpContext.getMessage( "Reprovado", ""), (short)(0));
      if ( cmbLb_opSt.getItemCount() > 0 )
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV153F_Cformu',fld:'vF_CFORMU',pic:'ZZZ9'},{av:'AV156ForNumCol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9'},{av:'Gx_msg',fld:'vMSG',pic:''},{av:'AV127Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV129Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'AV128Col_Lb_numeroE',fld:'vCOL_LB_NUMEROE',pic:''},{av:'AV130Col_Lb_opcionE',fld:'vCOL_LB_OPCIONE',pic:''},{av:'sPrefix'},{av:'AV49ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV6ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV35FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV32Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV43Lb_Cartaz',fld:'vLB_CARTAZ',pic:''},{av:'AV44Lb_colnom',fld:'vLB_COLNOM',pic:''},{av:'AV47Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV45Lb_estado',fld:'vLB_ESTADO',pic:'9'},{av:'AV100TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV101TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV58TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV59TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV64TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV65TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV68TFLb_ColNomC',fld:'vTFLB_COLNOMC',pic:''},{av:'AV69TFLb_ColNomC_Sel',fld:'vTFLB_COLNOMC_SEL',pic:''},{av:'AV175TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV176TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV120TFLb_Rb',fld:'vTFLB_RB',pic:'ZZZ9.99'},{av:'AV121TFLb_Rb_To',fld:'vTFLB_RB_TO',pic:'ZZZ9.99'},{av:'AV108TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV109TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV102TFLb_numop',fld:'vTFLB_NUMOP',pic:'Z9'},{av:'AV103TFLb_numop_To',fld:'vTFLB_NUMOP_TO',pic:'Z9'},{av:'AV66TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV67TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV80TFLb_FechaE',fld:'vTFLB_FECHAE',pic:''},{av:'AV82TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV84TFLb_FechaR',fld:'vTFLB_FECHAR',pic:''},{av:'AV75TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV104TFLb_ObsCR',fld:'vTFLB_OBSCR',pic:''},{av:'AV105TFLb_ObsCR_Sel',fld:'vTFLB_OBSCR_SEL',pic:''},{av:'AV180Pgmname',fld:'vPGMNAME',pic:''},{av:'AV51OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV53OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV46Lb_fechaR',fld:'vLB_FECHAR',pic:''},{av:'AV157ForUltUti',fld:'vFORULTUTI',pic:'',hsh:true},{av:'AV148ActualizacionEnsayoTxp',fld:'vACTUALIZACIONENSAYOTXP',pic:''},{av:'AV149AprobacionColorLab',fld:'vAPROBACIONCOLORLAB',pic:''},{av:'AV139Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV174coste',fld:'vCOSTE',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV49ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV6ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'edtLb_numero_Visible',ctrl:'LB_NUMERO',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtLb_ArtCod_Visible',ctrl:'LB_ARTCOD',prop:'Visible'},{av:'edtLb_ColNomC_Visible',ctrl:'LB_COLNOMC',prop:'Visible'},{av:'edtLb_ColNum_Visible',ctrl:'LB_COLNUM',prop:'Visible'},{av:'edtLb_Rb_Visible',ctrl:'LB_RB',prop:'Visible'},{av:'edtLb_opcion_Visible',ctrl:'LB_OPCION',prop:'Visible'},{av:'cmbavLb_tiprec'},{av:'edtLb_numop_Visible',ctrl:'LB_NUMOP',prop:'Visible'},{av:'edtLb_Cartaz_Visible',ctrl:'LB_CARTAZ',prop:'Visible'},{av:'edtLb_FechaE_Visible',ctrl:'LB_FECHAE',prop:'Visible'},{av:'edtLb_FechaEn_Visible',ctrl:'LB_FECHAEN',prop:'Visible'},{av:'edtLb_FechaR_Visible',ctrl:'LB_FECHAR',prop:'Visible'},{av:'cmbLb_Estado'},{av:'chkavSeleccionareliminar.getVisible()',ctrl:'vSELECCIONARELIMINAR',prop:'Visible'},{av:'cmbavLb_provdef'},{av:'edtLb_ObsCR_Visible',ctrl:'LB_OBSCR',prop:'Visible'},{av:'AV37GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV38GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV48ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV39GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e141TS2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV35FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV32Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV43Lb_Cartaz',fld:'vLB_CARTAZ',pic:''},{av:'AV44Lb_colnom',fld:'vLB_COLNOM',pic:''},{av:'AV47Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV45Lb_estado',fld:'vLB_ESTADO',pic:'9'},{av:'AV49ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV6ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV100TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV101TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV58TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV59TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV64TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV65TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV68TFLb_ColNomC',fld:'vTFLB_COLNOMC',pic:''},{av:'AV69TFLb_ColNomC_Sel',fld:'vTFLB_COLNOMC_SEL',pic:''},{av:'AV175TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV176TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV120TFLb_Rb',fld:'vTFLB_RB',pic:'ZZZ9.99'},{av:'AV121TFLb_Rb_To',fld:'vTFLB_RB_TO',pic:'ZZZ9.99'},{av:'AV108TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV109TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV102TFLb_numop',fld:'vTFLB_NUMOP',pic:'Z9'},{av:'AV103TFLb_numop_To',fld:'vTFLB_NUMOP_TO',pic:'Z9'},{av:'AV66TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV67TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV80TFLb_FechaE',fld:'vTFLB_FECHAE',pic:''},{av:'AV82TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV84TFLb_FechaR',fld:'vTFLB_FECHAR',pic:''},{av:'AV75TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV104TFLb_ObsCR',fld:'vTFLB_OBSCR',pic:''},{av:'AV105TFLb_ObsCR_Sel',fld:'vTFLB_OBSCR_SEL',pic:''},{av:'AV180Pgmname',fld:'vPGMNAME',pic:''},{av:'AV51OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV53OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV46Lb_fechaR',fld:'vLB_FECHAR',pic:''},{av:'AV153F_Cformu',fld:'vF_CFORMU',pic:'ZZZ9'},{av:'AV157ForUltUti',fld:'vFORULTUTI',pic:'',hsh:true},{av:'AV156ForNumCol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9'},{av:'Gx_msg',fld:'vMSG',pic:''},{av:'AV127Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV129Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'AV128Col_Lb_numeroE',fld:'vCOL_LB_NUMEROE',pic:''},{av:'AV130Col_Lb_opcionE',fld:'vCOL_LB_OPCIONE',pic:''},{av:'AV148ActualizacionEnsayoTxp',fld:'vACTUALIZACIONENSAYOTXP',pic:''},{av:'AV149AprobacionColorLab',fld:'vAPROBACIONCOLORLAB',pic:''},{av:'AV139Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV174coste',fld:'vCOSTE',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e151TS2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV35FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV32Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV43Lb_Cartaz',fld:'vLB_CARTAZ',pic:''},{av:'AV44Lb_colnom',fld:'vLB_COLNOM',pic:''},{av:'AV47Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV45Lb_estado',fld:'vLB_ESTADO',pic:'9'},{av:'AV49ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV6ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV100TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV101TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV58TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV59TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV64TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV65TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV68TFLb_ColNomC',fld:'vTFLB_COLNOMC',pic:''},{av:'AV69TFLb_ColNomC_Sel',fld:'vTFLB_COLNOMC_SEL',pic:''},{av:'AV175TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV176TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV120TFLb_Rb',fld:'vTFLB_RB',pic:'ZZZ9.99'},{av:'AV121TFLb_Rb_To',fld:'vTFLB_RB_TO',pic:'ZZZ9.99'},{av:'AV108TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV109TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV102TFLb_numop',fld:'vTFLB_NUMOP',pic:'Z9'},{av:'AV103TFLb_numop_To',fld:'vTFLB_NUMOP_TO',pic:'Z9'},{av:'AV66TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV67TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV80TFLb_FechaE',fld:'vTFLB_FECHAE',pic:''},{av:'AV82TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV84TFLb_FechaR',fld:'vTFLB_FECHAR',pic:''},{av:'AV75TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV104TFLb_ObsCR',fld:'vTFLB_OBSCR',pic:''},{av:'AV105TFLb_ObsCR_Sel',fld:'vTFLB_OBSCR_SEL',pic:''},{av:'AV180Pgmname',fld:'vPGMNAME',pic:''},{av:'AV51OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV53OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV46Lb_fechaR',fld:'vLB_FECHAR',pic:''},{av:'AV153F_Cformu',fld:'vF_CFORMU',pic:'ZZZ9'},{av:'AV157ForUltUti',fld:'vFORULTUTI',pic:'',hsh:true},{av:'AV156ForNumCol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9'},{av:'Gx_msg',fld:'vMSG',pic:''},{av:'AV127Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV129Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'AV128Col_Lb_numeroE',fld:'vCOL_LB_NUMEROE',pic:''},{av:'AV130Col_Lb_opcionE',fld:'vCOL_LB_OPCIONE',pic:''},{av:'AV148ActualizacionEnsayoTxp',fld:'vACTUALIZACIONENSAYOTXP',pic:''},{av:'AV149AprobacionColorLab',fld:'vAPROBACIONCOLORLAB',pic:''},{av:'AV139Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV174coste',fld:'vCOSTE',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e161TS2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV35FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV32Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV43Lb_Cartaz',fld:'vLB_CARTAZ',pic:''},{av:'AV44Lb_colnom',fld:'vLB_COLNOM',pic:''},{av:'AV47Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV45Lb_estado',fld:'vLB_ESTADO',pic:'9'},{av:'AV49ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV6ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV100TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV101TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV58TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV59TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV64TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV65TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV68TFLb_ColNomC',fld:'vTFLB_COLNOMC',pic:''},{av:'AV69TFLb_ColNomC_Sel',fld:'vTFLB_COLNOMC_SEL',pic:''},{av:'AV175TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV176TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV120TFLb_Rb',fld:'vTFLB_RB',pic:'ZZZ9.99'},{av:'AV121TFLb_Rb_To',fld:'vTFLB_RB_TO',pic:'ZZZ9.99'},{av:'AV108TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV109TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV102TFLb_numop',fld:'vTFLB_NUMOP',pic:'Z9'},{av:'AV103TFLb_numop_To',fld:'vTFLB_NUMOP_TO',pic:'Z9'},{av:'AV66TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV67TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV80TFLb_FechaE',fld:'vTFLB_FECHAE',pic:''},{av:'AV82TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV84TFLb_FechaR',fld:'vTFLB_FECHAR',pic:''},{av:'AV75TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV104TFLb_ObsCR',fld:'vTFLB_OBSCR',pic:''},{av:'AV105TFLb_ObsCR_Sel',fld:'vTFLB_OBSCR_SEL',pic:''},{av:'AV180Pgmname',fld:'vPGMNAME',pic:''},{av:'AV51OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV53OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV46Lb_fechaR',fld:'vLB_FECHAR',pic:''},{av:'AV153F_Cformu',fld:'vF_CFORMU',pic:'ZZZ9'},{av:'AV157ForUltUti',fld:'vFORULTUTI',pic:'',hsh:true},{av:'AV156ForNumCol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9'},{av:'Gx_msg',fld:'vMSG',pic:''},{av:'AV127Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV129Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'AV128Col_Lb_numeroE',fld:'vCOL_LB_NUMEROE',pic:''},{av:'AV130Col_Lb_opcionE',fld:'vCOL_LB_OPCIONE',pic:''},{av:'AV148ActualizacionEnsayoTxp',fld:'vACTUALIZACIONENSAYOTXP',pic:''},{av:'AV149AprobacionColorLab',fld:'vAPROBACIONCOLORLAB',pic:''},{av:'AV139Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV174coste',fld:'vCOSTE',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV51OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV53OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV104TFLb_ObsCR',fld:'vTFLB_OBSCR',pic:''},{av:'AV105TFLb_ObsCR_Sel',fld:'vTFLB_OBSCR_SEL',pic:''},{av:'AV76TFLb_Estado_SelsJson',fld:'vTFLB_ESTADO_SELSJSON',pic:''},{av:'AV75TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV84TFLb_FechaR',fld:'vTFLB_FECHAR',pic:''},{av:'AV82TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV80TFLb_FechaE',fld:'vTFLB_FECHAE',pic:''},{av:'AV66TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV67TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV102TFLb_numop',fld:'vTFLB_NUMOP',pic:'Z9'},{av:'AV103TFLb_numop_To',fld:'vTFLB_NUMOP_TO',pic:'Z9'},{av:'AV108TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV109TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV120TFLb_Rb',fld:'vTFLB_RB',pic:'ZZZ9.99'},{av:'AV121TFLb_Rb_To',fld:'vTFLB_RB_TO',pic:'ZZZ9.99'},{av:'AV175TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV176TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV68TFLb_ColNomC',fld:'vTFLB_COLNOMC',pic:''},{av:'AV69TFLb_ColNomC_Sel',fld:'vTFLB_COLNOMC_SEL',pic:''},{av:'AV64TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV65TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV58TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV59TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV100TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV101TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e271TS2',iparms:[{av:'A5597Lb_TipRec',fld:'LB_TIPREC',pic:'9'},{av:'A6631Lb_ProvDef',fld:'LB_PROVDEF',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A5533Lb_ArtCod',fld:'LB_ARTCOD',pic:''},{av:'A5536Lb_ColNom',fld:'LB_COLNOM',pic:''},{av:'A5537Lb_ColNum',fld:'LB_COLNUM',pic:'ZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'AV153F_Cformu',fld:'vF_CFORMU',pic:'ZZZ9'},{av:'AV157ForUltUti',fld:'vFORULTUTI',pic:'',hsh:true},{av:'AV156ForNumCol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9'},{av:'Gx_msg',fld:'vMSG',pic:''},{av:'AV127Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'A5532Lb_numero',fld:'LB_NUMERO',pic:'ZZZZZZZ9',hsh:true},{av:'AV129Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'A5555Lb_opcion',fld:'LB_OPCION',pic:'@!',hsh:true},{av:'AV128Col_Lb_numeroE',fld:'vCOL_LB_NUMEROE',pic:''},{av:'AV130Col_Lb_opcionE',fld:'vCOL_LB_OPCIONE',pic:''}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavLb_tiprec'},{av:'AV138Lb_TipRec',fld:'vLB_TIPREC',pic:'9'},{av:'cmbavLb_provdef'},{av:'AV144Lb_ProvDef',fld:'vLB_PROVDEF',pic:''},{av:'Gx_msg',fld:'vMSG',pic:''},{av:'AV156ForNumCol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV157ForUltUti',fld:'vFORULTUTI',pic:'',hsh:true},{av:'AV153F_Cformu',fld:'vF_CFORMU',pic:'ZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A5537Lb_ColNum',fld:'LB_COLNUM',pic:'ZZZZZ9'},{av:'A5536Lb_ColNom',fld:'LB_COLNOM',pic:''},{av:'A5533Lb_ArtCod',fld:'LB_ARTCOD',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV55Seleccionar',fld:'vSELECCIONAR',pic:''},{av:'AV56SeleccionarEliminar',fld:'vSELECCIONARELIMINAR',pic:''}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e171TS2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV35FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV32Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV43Lb_Cartaz',fld:'vLB_CARTAZ',pic:''},{av:'AV44Lb_colnom',fld:'vLB_COLNOM',pic:''},{av:'AV47Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV45Lb_estado',fld:'vLB_ESTADO',pic:'9'},{av:'AV49ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV6ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV100TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV101TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV58TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV59TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV64TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV65TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV68TFLb_ColNomC',fld:'vTFLB_COLNOMC',pic:''},{av:'AV69TFLb_ColNomC_Sel',fld:'vTFLB_COLNOMC_SEL',pic:''},{av:'AV175TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV176TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV120TFLb_Rb',fld:'vTFLB_RB',pic:'ZZZ9.99'},{av:'AV121TFLb_Rb_To',fld:'vTFLB_RB_TO',pic:'ZZZ9.99'},{av:'AV108TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV109TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV102TFLb_numop',fld:'vTFLB_NUMOP',pic:'Z9'},{av:'AV103TFLb_numop_To',fld:'vTFLB_NUMOP_TO',pic:'Z9'},{av:'AV66TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV67TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV80TFLb_FechaE',fld:'vTFLB_FECHAE',pic:''},{av:'AV82TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV84TFLb_FechaR',fld:'vTFLB_FECHAR',pic:''},{av:'AV75TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV104TFLb_ObsCR',fld:'vTFLB_OBSCR',pic:''},{av:'AV105TFLb_ObsCR_Sel',fld:'vTFLB_OBSCR_SEL',pic:''},{av:'AV180Pgmname',fld:'vPGMNAME',pic:''},{av:'AV51OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV53OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV46Lb_fechaR',fld:'vLB_FECHAR',pic:''},{av:'AV153F_Cformu',fld:'vF_CFORMU',pic:'ZZZ9'},{av:'AV157ForUltUti',fld:'vFORULTUTI',pic:'',hsh:true},{av:'AV156ForNumCol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9'},{av:'Gx_msg',fld:'vMSG',pic:''},{av:'AV127Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV129Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'AV128Col_Lb_numeroE',fld:'vCOL_LB_NUMEROE',pic:''},{av:'AV130Col_Lb_opcionE',fld:'vCOL_LB_OPCIONE',pic:''},{av:'AV148ActualizacionEnsayoTxp',fld:'vACTUALIZACIONENSAYOTXP',pic:''},{av:'AV149AprobacionColorLab',fld:'vAPROBACIONCOLORLAB',pic:''},{av:'AV139Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV174coste',fld:'vCOSTE',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV6ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV49ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'edtLb_numero_Visible',ctrl:'LB_NUMERO',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtLb_ArtCod_Visible',ctrl:'LB_ARTCOD',prop:'Visible'},{av:'edtLb_ColNomC_Visible',ctrl:'LB_COLNOMC',prop:'Visible'},{av:'edtLb_ColNum_Visible',ctrl:'LB_COLNUM',prop:'Visible'},{av:'edtLb_Rb_Visible',ctrl:'LB_RB',prop:'Visible'},{av:'edtLb_opcion_Visible',ctrl:'LB_OPCION',prop:'Visible'},{av:'cmbavLb_tiprec'},{av:'edtLb_numop_Visible',ctrl:'LB_NUMOP',prop:'Visible'},{av:'edtLb_Cartaz_Visible',ctrl:'LB_CARTAZ',prop:'Visible'},{av:'edtLb_FechaE_Visible',ctrl:'LB_FECHAE',prop:'Visible'},{av:'edtLb_FechaEn_Visible',ctrl:'LB_FECHAEN',prop:'Visible'},{av:'edtLb_FechaR_Visible',ctrl:'LB_FECHAR',prop:'Visible'},{av:'cmbLb_Estado'},{av:'chkavSeleccionareliminar.getVisible()',ctrl:'vSELECCIONARELIMINAR',prop:'Visible'},{av:'cmbavLb_provdef'},{av:'edtLb_ObsCR_Visible',ctrl:'LB_OBSCR',prop:'Visible'},{av:'AV37GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV38GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV48ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV39GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e131TS2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV35FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV32Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV43Lb_Cartaz',fld:'vLB_CARTAZ',pic:''},{av:'AV44Lb_colnom',fld:'vLB_COLNOM',pic:''},{av:'AV47Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV45Lb_estado',fld:'vLB_ESTADO',pic:'9'},{av:'AV49ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV6ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV100TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV101TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV58TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV59TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV64TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV65TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV68TFLb_ColNomC',fld:'vTFLB_COLNOMC',pic:''},{av:'AV69TFLb_ColNomC_Sel',fld:'vTFLB_COLNOMC_SEL',pic:''},{av:'AV175TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV176TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV120TFLb_Rb',fld:'vTFLB_RB',pic:'ZZZ9.99'},{av:'AV121TFLb_Rb_To',fld:'vTFLB_RB_TO',pic:'ZZZ9.99'},{av:'AV108TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV109TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV102TFLb_numop',fld:'vTFLB_NUMOP',pic:'Z9'},{av:'AV103TFLb_numop_To',fld:'vTFLB_NUMOP_TO',pic:'Z9'},{av:'AV66TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV67TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV80TFLb_FechaE',fld:'vTFLB_FECHAE',pic:''},{av:'AV82TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV84TFLb_FechaR',fld:'vTFLB_FECHAR',pic:''},{av:'AV75TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV104TFLb_ObsCR',fld:'vTFLB_OBSCR',pic:''},{av:'AV105TFLb_ObsCR_Sel',fld:'vTFLB_OBSCR_SEL',pic:''},{av:'AV180Pgmname',fld:'vPGMNAME',pic:''},{av:'AV51OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV53OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV46Lb_fechaR',fld:'vLB_FECHAR',pic:''},{av:'AV153F_Cformu',fld:'vF_CFORMU',pic:'ZZZ9'},{av:'AV157ForUltUti',fld:'vFORULTUTI',pic:'',hsh:true},{av:'AV156ForNumCol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9'},{av:'Gx_msg',fld:'vMSG',pic:''},{av:'AV127Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV129Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'AV128Col_Lb_numeroE',fld:'vCOL_LB_NUMEROE',pic:''},{av:'AV130Col_Lb_opcionE',fld:'vCOL_LB_OPCIONE',pic:''},{av:'AV148ActualizacionEnsayoTxp',fld:'vACTUALIZACIONENSAYOTXP',pic:''},{av:'AV149AprobacionColorLab',fld:'vAPROBACIONCOLORLAB',pic:''},{av:'AV139Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV174coste',fld:'vCOSTE',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV39GridState',fld:'vGRIDSTATE',pic:''},{av:'AV76TFLb_Estado_SelsJson',fld:'vTFLB_ESTADO_SELSJSON',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV49ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV39GridState',fld:'vGRIDSTATE',pic:''},{av:'AV51OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV53OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV35FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV100TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV101TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV58TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV59TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV64TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV65TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV68TFLb_ColNomC',fld:'vTFLB_COLNOMC',pic:''},{av:'AV69TFLb_ColNomC_Sel',fld:'vTFLB_COLNOMC_SEL',pic:''},{av:'AV175TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV176TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV120TFLb_Rb',fld:'vTFLB_RB',pic:'ZZZ9.99'},{av:'AV121TFLb_Rb_To',fld:'vTFLB_RB_TO',pic:'ZZZ9.99'},{av:'AV108TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV109TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV102TFLb_numop',fld:'vTFLB_NUMOP',pic:'Z9'},{av:'AV103TFLb_numop_To',fld:'vTFLB_NUMOP_TO',pic:'Z9'},{av:'AV66TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV67TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV80TFLb_FechaE',fld:'vTFLB_FECHAE',pic:''},{av:'AV82TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV84TFLb_FechaR',fld:'vTFLB_FECHAR',pic:''},{av:'AV75TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV104TFLb_ObsCR',fld:'vTFLB_OBSCR',pic:''},{av:'AV105TFLb_ObsCR_Sel',fld:'vTFLB_OBSCR_SEL',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV76TFLb_Estado_SelsJson',fld:'vTFLB_ESTADO_SELSJSON',pic:''},{av:'AV6ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'edtLb_numero_Visible',ctrl:'LB_NUMERO',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtLb_ArtCod_Visible',ctrl:'LB_ARTCOD',prop:'Visible'},{av:'edtLb_ColNomC_Visible',ctrl:'LB_COLNOMC',prop:'Visible'},{av:'edtLb_ColNum_Visible',ctrl:'LB_COLNUM',prop:'Visible'},{av:'edtLb_Rb_Visible',ctrl:'LB_RB',prop:'Visible'},{av:'edtLb_opcion_Visible',ctrl:'LB_OPCION',prop:'Visible'},{av:'cmbavLb_tiprec'},{av:'edtLb_numop_Visible',ctrl:'LB_NUMOP',prop:'Visible'},{av:'edtLb_Cartaz_Visible',ctrl:'LB_CARTAZ',prop:'Visible'},{av:'edtLb_FechaE_Visible',ctrl:'LB_FECHAE',prop:'Visible'},{av:'edtLb_FechaEn_Visible',ctrl:'LB_FECHAEN',prop:'Visible'},{av:'edtLb_FechaR_Visible',ctrl:'LB_FECHAR',prop:'Visible'},{av:'cmbLb_Estado'},{av:'chkavSeleccionareliminar.getVisible()',ctrl:'vSELECCIONARELIMINAR',prop:'Visible'},{av:'cmbavLb_provdef'},{av:'edtLb_ObsCR_Visible',ctrl:'LB_OBSCR',prop:'Visible'},{av:'AV37GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV38GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV48ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("'DORECEPCION'","{handler:'e211TS2',iparms:[{av:'AV127Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV46Lb_fechaR',fld:'vLB_FECHAR',pic:''},{av:'A5567Lb_FechaEn',fld:'LB_FECHAEN',pic:'',hsh:true},{av:'AV148ActualizacionEnsayoTxp',fld:'vACTUALIZACIONENSAYOTXP',pic:''},{av:'AV153F_Cformu',fld:'vF_CFORMU',pic:'ZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A5533Lb_ArtCod',fld:'LB_ARTCOD',pic:''},{av:'A5536Lb_ColNom',fld:'LB_COLNOM',pic:''},{av:'A5537Lb_ColNum',fld:'LB_COLNUM',pic:'ZZZZZ9'},{av:'AV172TipColcod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'A5538Lb_ColNomC',fld:'LB_COLNOMC',pic:''},{av:'AV32Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV156ForNumCol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV170Numform',fld:'vNUMFORM',pic:'ZZZ9'},{av:'AV132IN_Lb_numero',fld:'vIN_LB_NUMERO',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'DORECEPCION'",",oparms:[{av:'Gx_msg',fld:'vMSG',pic:''},{av:'AV132IN_Lb_numero',fld:'vIN_LB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV5Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV44Lb_colnom',fld:'vLB_COLNOM',pic:''},{av:'AV172TipColcod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV170Numform',fld:'vNUMFORM',pic:'ZZZ9'},{av:'AV156ForNumCol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV32Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'Dvelop_confirmpanel_recepcion_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_RECEPCION',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_RECEPCION.CLOSE","{handler:'e181TS2',iparms:[{av:'Dvelop_confirmpanel_recepcion_Result',ctrl:'DVELOP_CONFIRMPANEL_RECEPCION',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV35FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV32Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV43Lb_Cartaz',fld:'vLB_CARTAZ',pic:''},{av:'AV44Lb_colnom',fld:'vLB_COLNOM',pic:''},{av:'AV47Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV45Lb_estado',fld:'vLB_ESTADO',pic:'9'},{av:'AV49ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV6ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV100TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV101TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV58TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV59TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV64TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV65TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV68TFLb_ColNomC',fld:'vTFLB_COLNOMC',pic:''},{av:'AV69TFLb_ColNomC_Sel',fld:'vTFLB_COLNOMC_SEL',pic:''},{av:'AV175TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV176TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV120TFLb_Rb',fld:'vTFLB_RB',pic:'ZZZ9.99'},{av:'AV121TFLb_Rb_To',fld:'vTFLB_RB_TO',pic:'ZZZ9.99'},{av:'AV108TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV109TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV102TFLb_numop',fld:'vTFLB_NUMOP',pic:'Z9'},{av:'AV103TFLb_numop_To',fld:'vTFLB_NUMOP_TO',pic:'Z9'},{av:'AV66TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV67TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV80TFLb_FechaE',fld:'vTFLB_FECHAE',pic:''},{av:'AV82TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV84TFLb_FechaR',fld:'vTFLB_FECHAR',pic:''},{av:'AV75TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV104TFLb_ObsCR',fld:'vTFLB_OBSCR',pic:''},{av:'AV105TFLb_ObsCR_Sel',fld:'vTFLB_OBSCR_SEL',pic:''},{av:'AV180Pgmname',fld:'vPGMNAME',pic:''},{av:'AV51OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV53OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV46Lb_fechaR',fld:'vLB_FECHAR',pic:''},{av:'AV153F_Cformu',fld:'vF_CFORMU',pic:'ZZZ9'},{av:'AV157ForUltUti',fld:'vFORULTUTI',pic:'',hsh:true},{av:'AV156ForNumCol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9'},{av:'Gx_msg',fld:'vMSG',pic:''},{av:'AV127Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV129Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'AV128Col_Lb_numeroE',fld:'vCOL_LB_NUMEROE',pic:''},{av:'AV130Col_Lb_opcionE',fld:'vCOL_LB_OPCIONE',pic:''},{av:'AV148ActualizacionEnsayoTxp',fld:'vACTUALIZACIONENSAYOTXP',pic:''},{av:'AV149AprobacionColorLab',fld:'vAPROBACIONCOLORLAB',pic:''},{av:'AV139Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV174coste',fld:'vCOSTE',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'A5536Lb_ColNom',fld:'LB_COLNOM',pic:''},{av:'A5537Lb_ColNum',fld:'LB_COLNUM',pic:'ZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'cmbavLb_tiprec'},{av:'AV138Lb_TipRec',fld:'vLB_TIPREC',pic:'9'},{av:'cmbavLb_provdef'},{av:'AV144Lb_ProvDef',fld:'vLB_PROVDEF',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A5533Lb_ArtCod',fld:'LB_ARTCOD',pic:''},{av:'AV172TipColcod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'A5718Lb_numop',fld:'LB_NUMOP',pic:'Z9',hsh:true},{av:'AV164Lb_CosteE',fld:'vLB_COSTEE',pic:'ZZZZ9.99999'},{av:'AV146Lb_RGB',fld:'vLB_RGB',pic:'ZZZZZZZZZ9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_RECEPCION.CLOSE",",oparms:[{av:'AV132IN_Lb_numero',fld:'vIN_LB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV32Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV44Lb_colnom',fld:'vLB_COLNOM',pic:''},{av:'AV172TipColcod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV153F_Cformu',fld:'vF_CFORMU',pic:'ZZZ9'},{av:'AV146Lb_RGB',fld:'vLB_RGB',pic:'ZZZZZZZZZ9'},{av:'AV164Lb_CosteE',fld:'vLB_COSTEE',pic:'ZZZZ9.99999'},{av:'AV46Lb_fechaR',fld:'vLB_FECHAR',pic:''},{av:'AV148ActualizacionEnsayoTxp',fld:'vACTUALIZACIONENSAYOTXP',pic:''},{av:'AV149AprobacionColorLab',fld:'vAPROBACIONCOLORLAB',pic:''},{av:'AV129Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'AV127Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV49ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV6ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'edtLb_numero_Visible',ctrl:'LB_NUMERO',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtLb_ArtCod_Visible',ctrl:'LB_ARTCOD',prop:'Visible'},{av:'edtLb_ColNomC_Visible',ctrl:'LB_COLNOMC',prop:'Visible'},{av:'edtLb_ColNum_Visible',ctrl:'LB_COLNUM',prop:'Visible'},{av:'edtLb_Rb_Visible',ctrl:'LB_RB',prop:'Visible'},{av:'edtLb_opcion_Visible',ctrl:'LB_OPCION',prop:'Visible'},{av:'cmbavLb_tiprec'},{av:'edtLb_numop_Visible',ctrl:'LB_NUMOP',prop:'Visible'},{av:'edtLb_Cartaz_Visible',ctrl:'LB_CARTAZ',prop:'Visible'},{av:'edtLb_FechaE_Visible',ctrl:'LB_FECHAE',prop:'Visible'},{av:'edtLb_FechaEn_Visible',ctrl:'LB_FECHAEN',prop:'Visible'},{av:'edtLb_FechaR_Visible',ctrl:'LB_FECHAR',prop:'Visible'},{av:'cmbLb_Estado'},{av:'chkavSeleccionareliminar.getVisible()',ctrl:'vSELECCIONARELIMINAR',prop:'Visible'},{av:'cmbavLb_provdef'},{av:'edtLb_ObsCR_Visible',ctrl:'LB_OBSCR',prop:'Visible'},{av:'AV37GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV38GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV48ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV39GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOELIMINARRECEPCION'","{handler:'e111TS1',iparms:[{av:'AV128Col_Lb_numeroE',fld:'vCOL_LB_NUMEROE',pic:''}]");
      setEventMetadata("'DOELIMINARRECEPCION'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINARRECEPCION.CLOSE","{handler:'e191TS2',iparms:[{av:'Dvelop_confirmpanel_eliminarrecepcion_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINARRECEPCION',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV35FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV32Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV43Lb_Cartaz',fld:'vLB_CARTAZ',pic:''},{av:'AV44Lb_colnom',fld:'vLB_COLNOM',pic:''},{av:'AV47Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV45Lb_estado',fld:'vLB_ESTADO',pic:'9'},{av:'AV49ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV6ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV100TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV101TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV58TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV59TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV64TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV65TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV68TFLb_ColNomC',fld:'vTFLB_COLNOMC',pic:''},{av:'AV69TFLb_ColNomC_Sel',fld:'vTFLB_COLNOMC_SEL',pic:''},{av:'AV175TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV176TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV120TFLb_Rb',fld:'vTFLB_RB',pic:'ZZZ9.99'},{av:'AV121TFLb_Rb_To',fld:'vTFLB_RB_TO',pic:'ZZZ9.99'},{av:'AV108TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV109TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV102TFLb_numop',fld:'vTFLB_NUMOP',pic:'Z9'},{av:'AV103TFLb_numop_To',fld:'vTFLB_NUMOP_TO',pic:'Z9'},{av:'AV66TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV67TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV80TFLb_FechaE',fld:'vTFLB_FECHAE',pic:''},{av:'AV82TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV84TFLb_FechaR',fld:'vTFLB_FECHAR',pic:''},{av:'AV75TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV104TFLb_ObsCR',fld:'vTFLB_OBSCR',pic:''},{av:'AV105TFLb_ObsCR_Sel',fld:'vTFLB_OBSCR_SEL',pic:''},{av:'AV180Pgmname',fld:'vPGMNAME',pic:''},{av:'AV51OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV53OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV46Lb_fechaR',fld:'vLB_FECHAR',pic:''},{av:'AV153F_Cformu',fld:'vF_CFORMU',pic:'ZZZ9'},{av:'AV157ForUltUti',fld:'vFORULTUTI',pic:'',hsh:true},{av:'AV156ForNumCol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9'},{av:'Gx_msg',fld:'vMSG',pic:''},{av:'AV127Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV129Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'AV128Col_Lb_numeroE',fld:'vCOL_LB_NUMEROE',pic:''},{av:'AV130Col_Lb_opcionE',fld:'vCOL_LB_OPCIONE',pic:''},{av:'AV148ActualizacionEnsayoTxp',fld:'vACTUALIZACIONENSAYOTXP',pic:''},{av:'AV149AprobacionColorLab',fld:'vAPROBACIONCOLORLAB',pic:''},{av:'AV139Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV174coste',fld:'vCOSTE',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'A5536Lb_ColNom',fld:'LB_COLNOM',pic:''},{av:'A5537Lb_ColNum',fld:'LB_COLNUM',pic:'ZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'cmbavLb_tiprec'},{av:'AV138Lb_TipRec',fld:'vLB_TIPREC',pic:'9'},{av:'cmbavLb_provdef'},{av:'AV144Lb_ProvDef',fld:'vLB_PROVDEF',pic:''},{av:'AV143Fecha_b',fld:'vFECHA_B',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINARRECEPCION.CLOSE",",oparms:[{av:'AV132IN_Lb_numero',fld:'vIN_LB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV32Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV143Fecha_b',fld:'vFECHA_B',pic:''},{av:'AV130Col_Lb_opcionE',fld:'vCOL_LB_OPCIONE',pic:''},{av:'AV128Col_Lb_numeroE',fld:'vCOL_LB_NUMEROE',pic:''},{av:'AV49ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV6ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'edtLb_numero_Visible',ctrl:'LB_NUMERO',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtLb_ArtCod_Visible',ctrl:'LB_ARTCOD',prop:'Visible'},{av:'edtLb_ColNomC_Visible',ctrl:'LB_COLNOMC',prop:'Visible'},{av:'edtLb_ColNum_Visible',ctrl:'LB_COLNUM',prop:'Visible'},{av:'edtLb_Rb_Visible',ctrl:'LB_RB',prop:'Visible'},{av:'edtLb_opcion_Visible',ctrl:'LB_OPCION',prop:'Visible'},{av:'cmbavLb_tiprec'},{av:'edtLb_numop_Visible',ctrl:'LB_NUMOP',prop:'Visible'},{av:'edtLb_Cartaz_Visible',ctrl:'LB_CARTAZ',prop:'Visible'},{av:'edtLb_FechaE_Visible',ctrl:'LB_FECHAE',prop:'Visible'},{av:'edtLb_FechaEn_Visible',ctrl:'LB_FECHAEN',prop:'Visible'},{av:'edtLb_FechaR_Visible',ctrl:'LB_FECHAR',prop:'Visible'},{av:'cmbLb_Estado'},{av:'chkavSeleccionareliminar.getVisible()',ctrl:'vSELECCIONARELIMINAR',prop:'Visible'},{av:'cmbavLb_provdef'},{av:'edtLb_ObsCR_Visible',ctrl:'LB_OBSCR',prop:'Visible'},{av:'AV37GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV38GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV48ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV39GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOAPROBACIONINTERNA'","{handler:'e121TS1',iparms:[{av:'AV127Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV46Lb_fechaR',fld:'vLB_FECHAR',pic:''},{av:'A5567Lb_FechaEn',fld:'LB_FECHAEN',pic:'',hsh:true},{av:'A5532Lb_numero',fld:'LB_NUMERO',pic:'ZZZZZZZ9',hsh:true},{av:'AV132IN_Lb_numero',fld:'vIN_LB_NUMERO',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'DOAPROBACIONINTERNA'",",oparms:[{av:'Gx_msg',fld:'vMSG',pic:''},{av:'AV132IN_Lb_numero',fld:'vIN_LB_NUMERO',pic:'ZZZZZZZ9'},{av:'Dvelop_confirmpanel_aprobacioninterna_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_APROBACIONINTERNA',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_APROBACIONINTERNA.CLOSE","{handler:'e201TS2',iparms:[{av:'Dvelop_confirmpanel_aprobacioninterna_Result',ctrl:'DVELOP_CONFIRMPANEL_APROBACIONINTERNA',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV35FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV32Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV43Lb_Cartaz',fld:'vLB_CARTAZ',pic:''},{av:'AV44Lb_colnom',fld:'vLB_COLNOM',pic:''},{av:'AV47Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV45Lb_estado',fld:'vLB_ESTADO',pic:'9'},{av:'AV49ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV6ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV100TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV101TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV58TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV59TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV64TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV65TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV68TFLb_ColNomC',fld:'vTFLB_COLNOMC',pic:''},{av:'AV69TFLb_ColNomC_Sel',fld:'vTFLB_COLNOMC_SEL',pic:''},{av:'AV175TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV176TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV120TFLb_Rb',fld:'vTFLB_RB',pic:'ZZZ9.99'},{av:'AV121TFLb_Rb_To',fld:'vTFLB_RB_TO',pic:'ZZZ9.99'},{av:'AV108TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV109TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV102TFLb_numop',fld:'vTFLB_NUMOP',pic:'Z9'},{av:'AV103TFLb_numop_To',fld:'vTFLB_NUMOP_TO',pic:'Z9'},{av:'AV66TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV67TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV80TFLb_FechaE',fld:'vTFLB_FECHAE',pic:''},{av:'AV82TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV84TFLb_FechaR',fld:'vTFLB_FECHAR',pic:''},{av:'AV75TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV104TFLb_ObsCR',fld:'vTFLB_OBSCR',pic:''},{av:'AV105TFLb_ObsCR_Sel',fld:'vTFLB_OBSCR_SEL',pic:''},{av:'AV180Pgmname',fld:'vPGMNAME',pic:''},{av:'AV51OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV53OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV46Lb_fechaR',fld:'vLB_FECHAR',pic:''},{av:'AV153F_Cformu',fld:'vF_CFORMU',pic:'ZZZ9'},{av:'AV157ForUltUti',fld:'vFORULTUTI',pic:'',hsh:true},{av:'AV156ForNumCol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9'},{av:'Gx_msg',fld:'vMSG',pic:''},{av:'AV127Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV129Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'AV128Col_Lb_numeroE',fld:'vCOL_LB_NUMEROE',pic:''},{av:'AV130Col_Lb_opcionE',fld:'vCOL_LB_OPCIONE',pic:''},{av:'AV148ActualizacionEnsayoTxp',fld:'vACTUALIZACIONENSAYOTXP',pic:''},{av:'AV149AprobacionColorLab',fld:'vAPROBACIONCOLORLAB',pic:''},{av:'AV139Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV174coste',fld:'vCOSTE',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'A5533Lb_ArtCod',fld:'LB_ARTCOD',pic:''},{av:'A5537Lb_ColNum',fld:'LB_COLNUM',pic:'ZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'cmbavLb_tiprec'},{av:'AV138Lb_TipRec',fld:'vLB_TIPREC',pic:'9'},{av:'A5597Lb_TipRec',fld:'LB_TIPREC',pic:'9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A5540Lb_Cartaz',fld:'LB_CARTAZ',pic:''},{av:'cmbavLb_provdef'},{av:'AV144Lb_ProvDef',fld:'vLB_PROVDEF',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_APROBACIONINTERNA.CLOSE",",oparms:[{av:'AV44Lb_colnom',fld:'vLB_COLNOM',pic:''},{av:'AV132IN_Lb_numero',fld:'vIN_LB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV46Lb_fechaR',fld:'vLB_FECHAR',pic:''},{av:'cmbavLb_tiprec'},{av:'AV138Lb_TipRec',fld:'vLB_TIPREC',pic:'9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A5537Lb_ColNum',fld:'LB_COLNUM',pic:'ZZZZZ9'},{av:'A5533Lb_ArtCod',fld:'LB_ARTCOD',pic:''},{av:'AV32Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV47Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV43Lb_Cartaz',fld:'vLB_CARTAZ',pic:''},{av:'AV49ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV6ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'edtLb_numero_Visible',ctrl:'LB_NUMERO',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtLb_ArtCod_Visible',ctrl:'LB_ARTCOD',prop:'Visible'},{av:'edtLb_ColNomC_Visible',ctrl:'LB_COLNOMC',prop:'Visible'},{av:'edtLb_ColNum_Visible',ctrl:'LB_COLNUM',prop:'Visible'},{av:'edtLb_Rb_Visible',ctrl:'LB_RB',prop:'Visible'},{av:'edtLb_opcion_Visible',ctrl:'LB_OPCION',prop:'Visible'},{av:'edtLb_numop_Visible',ctrl:'LB_NUMOP',prop:'Visible'},{av:'edtLb_Cartaz_Visible',ctrl:'LB_CARTAZ',prop:'Visible'},{av:'edtLb_FechaE_Visible',ctrl:'LB_FECHAE',prop:'Visible'},{av:'edtLb_FechaEn_Visible',ctrl:'LB_FECHAEN',prop:'Visible'},{av:'edtLb_FechaR_Visible',ctrl:'LB_FECHAR',prop:'Visible'},{av:'cmbLb_Estado'},{av:'chkavSeleccionareliminar.getVisible()',ctrl:'vSELECCIONARELIMINAR',prop:'Visible'},{av:'cmbavLb_provdef'},{av:'edtLb_ObsCR_Visible',ctrl:'LB_OBSCR',prop:'Visible'},{av:'AV37GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV38GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV48ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV39GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOCANCELAR'","{handler:'e221TS2',iparms:[]");
      setEventMetadata("'DOCANCELAR'",",oparms:[]}");
      setEventMetadata("'DOEXPORT'","{handler:'e231TS2',iparms:[]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e241TS2',iparms:[]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("VALID_LB_NUMERO","{handler:'valid_Lb_numero',iparms:[]");
      setEventMetadata("VALID_LB_NUMERO",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Lb_colnom',iparms:[]");
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
      wcpOAV32Emprcod = "" ;
      wcpOAV43Lb_Cartaz = "" ;
      wcpOAV44Lb_colnom = "" ;
      wcpOAV46Lb_fechaR = GXutil.nullDate() ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      Dvelop_confirmpanel_recepcion_Result = "" ;
      Dvelop_confirmpanel_eliminarrecepcion_Result = "" ;
      Dvelop_confirmpanel_aprobacioninterna_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV32Emprcod = "" ;
      AV43Lb_Cartaz = "" ;
      AV44Lb_colnom = "" ;
      AV46Lb_fechaR = GXutil.nullDate() ;
      AV35FilterFullText = "" ;
      AV6ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV64TFLb_ArtCod = "" ;
      AV65TFLb_ArtCod_Sel = "" ;
      AV68TFLb_ColNomC = "" ;
      AV69TFLb_ColNomC_Sel = "" ;
      AV120TFLb_Rb = DecimalUtil.ZERO ;
      AV121TFLb_Rb_To = DecimalUtil.ZERO ;
      AV108TFLb_opcion = "" ;
      AV109TFLb_opcion_Sel = "" ;
      AV66TFLb_Cartaz = "" ;
      AV67TFLb_Cartaz_Sel = "" ;
      AV80TFLb_FechaE = GXutil.nullDate() ;
      AV82TFLb_FechaEn = GXutil.nullDate() ;
      AV84TFLb_FechaR = GXutil.nullDate() ;
      AV75TFLb_Estado_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV104TFLb_ObsCR = "" ;
      AV105TFLb_ObsCR_Sel = "" ;
      AV180Pgmname = "" ;
      AV157ForUltUti = GXutil.nullDate() ;
      Gx_msg = "" ;
      AV127Col_Lb_numero = new GXSimpleCollection<Integer>(Integer.class, "internal", "");
      AV129Col_Lb_opcion = new GXSimpleCollection<String>(String.class, "internal", "");
      AV128Col_Lb_numeroE = new GXSimpleCollection<Integer>(Integer.class, "internal", "");
      AV130Col_Lb_opcionE = new GXSimpleCollection<String>(String.class, "internal", "");
      AV148ActualizacionEnsayoTxp = "" ;
      AV149AprobacionColorLab = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV48ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV31DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A6631Lb_ProvDef = "" ;
      A396EmprCod = "" ;
      AV39GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV76TFLb_Estado_SelsJson = "" ;
      AV164Lb_CosteE = DecimalUtil.ZERO ;
      AV143Fecha_b = GXutil.nullDate() ;
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
      bttBtnrecepcion_Jsonclick = "" ;
      bttBtneliminarrecepcion_Jsonclick = "" ;
      bttBtnaprobacioninterna_Jsonclick = "" ;
      bttBtncancelar_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_titlescategories = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV11DDO_Lb_FechaEAuxDate = GXutil.nullDate() ;
      AV13DDO_Lb_FechaEnAuxDate = GXutil.nullDate() ;
      AV15DDO_Lb_FechaRAuxDate = GXutil.nullDate() ;
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
      A5563Lb_FechaR = GXutil.nullDate() ;
      AV144Lb_ProvDef = "" ;
      A10822Lb_ObsCR = "" ;
      A12525Lb_opSt = "" ;
      A12526Lb_opFc = GXutil.nullDate() ;
      A279CliNom = "" ;
      A5565Lb_CosteE = DecimalUtil.ZERO ;
      A5536Lb_ColNom = "" ;
      AV206Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      scmdbuf = "" ;
      lV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = "" ;
      lV189Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod = "" ;
      lV191Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc = "" ;
      lV197Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion = "" ;
      lV201Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz = "" ;
      lV207Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr = "" ;
      lV43Lb_Cartaz = "" ;
      lV44Lb_colnom = "" ;
      AV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = "" ;
      AV190Gestionlaboratorio_recepciondeensayocliente_wcds_7_tflb_artcod_sel = "" ;
      AV189Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod = "" ;
      AV192Gestionlaboratorio_recepciondeensayocliente_wcds_9_tflb_colnomc_sel = "" ;
      AV191Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc = "" ;
      AV195Gestionlaboratorio_recepciondeensayocliente_wcds_12_tflb_rb = DecimalUtil.ZERO ;
      AV196Gestionlaboratorio_recepciondeensayocliente_wcds_13_tflb_rb_to = DecimalUtil.ZERO ;
      AV198Gestionlaboratorio_recepciondeensayocliente_wcds_15_tflb_opcion_sel = "" ;
      AV197Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion = "" ;
      AV202Gestionlaboratorio_recepciondeensayocliente_wcds_19_tflb_cartaz_sel = "" ;
      AV201Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz = "" ;
      AV203Gestionlaboratorio_recepciondeensayocliente_wcds_20_tflb_fechae = GXutil.nullDate() ;
      AV204Gestionlaboratorio_recepciondeensayocliente_wcds_21_tflb_fechaen = GXutil.nullDate() ;
      AV205Gestionlaboratorio_recepciondeensayocliente_wcds_22_tflb_fechar = GXutil.nullDate() ;
      AV208Gestionlaboratorio_recepciondeensayocliente_wcds_25_tflb_obscr_sel = "" ;
      AV207Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr = "" ;
      A6461Lb_FecNoa1 = GXutil.nullDate() ;
      H01TS2_A5569Lb_EstEns = new byte[1] ;
      H01TS2_A6461Lb_FecNoa1 = new java.util.Date[] {GXutil.nullDate()} ;
      H01TS2_A5597Lb_TipRec = new byte[1] ;
      H01TS2_A6631Lb_ProvDef = new String[] {""} ;
      H01TS2_A396EmprCod = new String[] {""} ;
      H01TS2_A5536Lb_ColNom = new String[] {""} ;
      H01TS2_A831TipColCod = new byte[1] ;
      H01TS2_n831TipColCod = new boolean[] {false} ;
      H01TS2_A5565Lb_CosteE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01TS2_A279CliNom = new String[] {""} ;
      H01TS2_A12526Lb_opFc = new java.util.Date[] {GXutil.nullDate()} ;
      H01TS2_n12526Lb_opFc = new boolean[] {false} ;
      H01TS2_A12525Lb_opSt = new String[] {""} ;
      H01TS2_n12525Lb_opSt = new boolean[] {false} ;
      H01TS2_A10822Lb_ObsCR = new String[] {""} ;
      H01TS2_A5566Lb_Estado = new byte[1] ;
      H01TS2_A5563Lb_FechaR = new java.util.Date[] {GXutil.nullDate()} ;
      H01TS2_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      H01TS2_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      H01TS2_A5540Lb_Cartaz = new String[] {""} ;
      H01TS2_A5718Lb_numop = new byte[1] ;
      H01TS2_A5555Lb_opcion = new String[] {""} ;
      H01TS2_A5547Lb_Rb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01TS2_A5537Lb_ColNum = new int[1] ;
      H01TS2_A5538Lb_ColNomC = new String[] {""} ;
      H01TS2_A5533Lb_ArtCod = new String[] {""} ;
      H01TS2_A252CliCod = new int[1] ;
      H01TS2_A5532Lb_numero = new int[1] ;
      H01TS3_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV150AprobacionInterna = "" ;
      AV181Station = "" ;
      AV182Emprnom = "" ;
      AV183Usurcod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV125WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV57Session = httpContext.getWebSession();
      AV8ColumnsSelectorXML = "" ;
      GXv_int10 = new int[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV50ManageFiltersXml = "" ;
      AV152CliNom = "" ;
      AV161lb_artcod = "" ;
      AV145Lb_colnomc = "" ;
      ucDvelop_confirmpanel_recepcion = new com.genexus.webpanels.GXUserControl();
      AV34ExcelFilename = "" ;
      AV33ErrorMessage = "" ;
      AV124UserCustomValue = "" ;
      AV7ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector16 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector17 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item18 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item19 = new GXBaseCollection[1] ;
      AV136Lb_HoraR = GXutil.resetTime( GXutil.nullDate() );
      AV137IN_Lb_opcion = "" ;
      AV169Num_color = "" ;
      GXv_decimal20 = new java.math.BigDecimal[1] ;
      GXv_int21 = new long[1] ;
      GXv_int2 = new byte[1] ;
      AV140Fec_null = GXutil.nullDate() ;
      AV141Hora_null = GXutil.resetTime( GXutil.nullDate() );
      AV166Lb_opcions = "" ;
      AV126Col_EnvioEnsayo = new GXBaseCollection<app.gestionlaboratorio.SdtEnviodeEnsayo_SDT>(app.gestionlaboratorio.SdtEnviodeEnsayo_SDT.class, "EnviodeEnsayo_SDT", "TexplusNET", remoteHandle);
      AV171Opcion = "" ;
      GXv_int12 = new byte[1] ;
      AV165Lb_opcioni = "" ;
      AV173Item_EnvioEnsayo = new app.gestionlaboratorio.SdtEnviodeEnsayo_SDT(remoteHandle, context);
      GXv_int14 = new int[1] ;
      GXv_int11 = new int[1] ;
      GXv_int22 = new byte[1] ;
      GXv_date13 = new java.util.Date[1] ;
      AV160Json_EnvioEnsayo = "" ;
      AV40GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char27 = "" ;
      GXv_char23 = new String[1] ;
      GXt_char26 = "" ;
      GXv_char15 = new String[1] ;
      GXt_char25 = "" ;
      GXv_char6 = new String[1] ;
      GXt_char24 = "" ;
      GXv_char5 = new String[1] ;
      GXt_char3 = "" ;
      GXv_char4 = new String[1] ;
      GXv_SdtWWPGridState28 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV122TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV41HTTPRequest = httpContext.getHttpRequest();
      ucDvelop_confirmpanel_aprobacioninterna = new com.genexus.webpanels.GXUserControl();
      ucDvelop_confirmpanel_eliminarrecepcion = new com.genexus.webpanels.GXUserControl();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV32Emprcod = "" ;
      sCtrlAV5Clicod = "" ;
      sCtrlAV43Lb_Cartaz = "" ;
      sCtrlAV44Lb_colnom = "" ;
      sCtrlAV47Lb_numero = "" ;
      sCtrlAV46Lb_fechaR = "" ;
      sCtrlAV45Lb_estado = "" ;
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.recepciondeensayocliente_wc__default(),
         new Object[] {
             new Object[] {
            H01TS2_A5569Lb_EstEns, H01TS2_A6461Lb_FecNoa1, H01TS2_A5597Lb_TipRec, H01TS2_A6631Lb_ProvDef, H01TS2_A396EmprCod, H01TS2_A5536Lb_ColNom, H01TS2_A831TipColCod, H01TS2_n831TipColCod, H01TS2_A5565Lb_CosteE, H01TS2_A279CliNom,
            H01TS2_A12526Lb_opFc, H01TS2_n12526Lb_opFc, H01TS2_A12525Lb_opSt, H01TS2_n12525Lb_opSt, H01TS2_A10822Lb_ObsCR, H01TS2_A5566Lb_Estado, H01TS2_A5563Lb_FechaR, H01TS2_A5567Lb_FechaEn, H01TS2_A5541Lb_FechaE, H01TS2_A5540Lb_Cartaz,
            H01TS2_A5718Lb_numop, H01TS2_A5555Lb_opcion, H01TS2_A5547Lb_Rb, H01TS2_A5537Lb_ColNum, H01TS2_A5538Lb_ColNomC, H01TS2_A5533Lb_ArtCod, H01TS2_A252CliCod, H01TS2_A5532Lb_numero
            }
            , new Object[] {
            H01TS3_AGRID_nRecordCount
            }
         }
      );
      AV180Pgmname = "GestionLaboratorio.RecepciondeEnsayoCliente_WC" ;
      /* GeneXus formulas. */
      AV180Pgmname = "GestionLaboratorio.RecepciondeEnsayoCliente_WC" ;
      Gx_err = (short)(0) ;
      edtavF_cformu_Enabled = 0 ;
      edtavFornumcol_Enabled = 0 ;
      edtavGridvariable1_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOAV45Lb_estado ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV45Lb_estado ;
   private byte AV49ManageFiltersExecutionStep ;
   private byte AV102TFLb_numop ;
   private byte AV103TFLb_numop_To ;
   private byte A5597Lb_TipRec ;
   private byte AV172TipColcod ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte AV138Lb_TipRec ;
   private byte A5718Lb_numop ;
   private byte A5566Lb_Estado ;
   private byte A831TipColCod ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV199Gestionlaboratorio_recepciondeensayocliente_wcds_16_tflb_numop ;
   private byte AV200Gestionlaboratorio_recepciondeensayocliente_wcds_17_tflb_numop_to ;
   private byte A5569Lb_EstEns ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte GXv_int12[] ;
   private byte AV167Lb_tipreci ;
   private byte GXv_int22[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV51OrderedBy ;
   private short AV153F_Cformu ;
   private short AV139Moda21 ;
   private short AV174coste ;
   private short AV170Numform ;
   private short AV131i ;
   private short AV133t ;
   private short AV135Num_v ;
   private short wbEnd ;
   private short wbStart ;
   private short AV158GridVariable1 ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV147Act_op ;
   private int wcpOAV5Clicod ;
   private int wcpOAV47Lb_numero ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_67 ;
   private int AV5Clicod ;
   private int AV47Lb_numero ;
   private int nGXsfl_67_idx=1 ;
   private int AV100TFLb_numero ;
   private int AV101TFLb_numero_To ;
   private int AV58TFCliCod ;
   private int AV59TFCliCod_To ;
   private int AV175TFLb_ColNum ;
   private int AV176TFLb_ColNum_To ;
   private int AV156ForNumCol ;
   private int AV132IN_Lb_numero ;
   private int AV134IN_Lb_numerot ;
   private int Gridpaginationbar_Pagestoshow ;
   private int bttBtnaprobacioninterna_Visible ;
   private int edtavPgmname_Enabled ;
   private int A5532Lb_numero ;
   private int A252CliCod ;
   private int A5537Lb_ColNum ;
   private int subGrid_Islastpage ;
   private int edtavF_cformu_Enabled ;
   private int edtavFornumcol_Enabled ;
   private int edtavGridvariable1_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV206Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels_size ;
   private int AV185Gestionlaboratorio_recepciondeensayocliente_wcds_2_tflb_numero ;
   private int AV186Gestionlaboratorio_recepciondeensayocliente_wcds_3_tflb_numero_to ;
   private int AV187Gestionlaboratorio_recepciondeensayocliente_wcds_4_tfclicod ;
   private int AV188Gestionlaboratorio_recepciondeensayocliente_wcds_5_tfclicod_to ;
   private int AV193Gestionlaboratorio_recepciondeensayocliente_wcds_10_tflb_colnum ;
   private int AV194Gestionlaboratorio_recepciondeensayocliente_wcds_11_tflb_colnum_to ;
   private int edtLb_numero_Visible ;
   private int edtCliCod_Visible ;
   private int edtLb_ArtCod_Visible ;
   private int edtLb_ColNomC_Visible ;
   private int edtLb_ColNum_Visible ;
   private int edtLb_Rb_Visible ;
   private int edtLb_opcion_Visible ;
   private int edtLb_numop_Visible ;
   private int edtLb_Cartaz_Visible ;
   private int edtLb_FechaE_Visible ;
   private int edtLb_FechaEn_Visible ;
   private int edtLb_FechaR_Visible ;
   private int edtLb_ObsCR_Visible ;
   private int AV54PageToGo ;
   private int GXv_int10[] ;
   private int AV162lb_colNum ;
   private int AV168N_color ;
   private int AV163Lb_colnumi ;
   private int AV151Clicodgrid ;
   private int AV159IN_Lb_numerol ;
   private int GXv_int14[] ;
   private int GXv_int11[] ;
   private int AV210GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavF_cformu_Visible ;
   private int edtavFornumcol_Visible ;
   private int edtavGridvariable1_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV37GridCurrentPage ;
   private long AV38GridPageCount ;
   private long AV146Lb_RGB ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private long GXv_int21[] ;
   private java.math.BigDecimal AV120TFLb_Rb ;
   private java.math.BigDecimal AV121TFLb_Rb_To ;
   private java.math.BigDecimal AV164Lb_CosteE ;
   private java.math.BigDecimal A5547Lb_Rb ;
   private java.math.BigDecimal A5565Lb_CosteE ;
   private java.math.BigDecimal AV195Gestionlaboratorio_recepciondeensayocliente_wcds_12_tflb_rb ;
   private java.math.BigDecimal AV196Gestionlaboratorio_recepciondeensayocliente_wcds_13_tflb_rb_to ;
   private java.math.BigDecimal GXv_decimal20[] ;
   private String wcpOAV32Emprcod ;
   private String wcpOAV43Lb_Cartaz ;
   private String wcpOAV44Lb_colnom ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String Dvelop_confirmpanel_recepcion_Result ;
   private String Dvelop_confirmpanel_eliminarrecepcion_Result ;
   private String Dvelop_confirmpanel_aprobacioninterna_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV32Emprcod ;
   private String AV43Lb_Cartaz ;
   private String AV44Lb_colnom ;
   private String sGXsfl_67_idx="0001" ;
   private String AV64TFLb_ArtCod ;
   private String AV65TFLb_ArtCod_Sel ;
   private String AV68TFLb_ColNomC ;
   private String AV69TFLb_ColNomC_Sel ;
   private String AV108TFLb_opcion ;
   private String AV109TFLb_opcion_Sel ;
   private String AV66TFLb_Cartaz ;
   private String AV67TFLb_Cartaz_Sel ;
   private String AV180Pgmname ;
   private String Gx_msg ;
   private String AV148ActualizacionEnsayoTxp ;
   private String AV149AprobacionColorLab ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A6631Lb_ProvDef ;
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
   private String Dvelop_confirmpanel_recepcion_Title ;
   private String Dvelop_confirmpanel_recepcion_Confirmationtext ;
   private String Dvelop_confirmpanel_recepcion_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_recepcion_Nobuttoncaption ;
   private String Dvelop_confirmpanel_recepcion_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_recepcion_Yesbuttonposition ;
   private String Dvelop_confirmpanel_recepcion_Confirmtype ;
   private String Dvelop_confirmpanel_eliminarrecepcion_Title ;
   private String Dvelop_confirmpanel_eliminarrecepcion_Confirmationtext ;
   private String Dvelop_confirmpanel_eliminarrecepcion_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_eliminarrecepcion_Nobuttoncaption ;
   private String Dvelop_confirmpanel_eliminarrecepcion_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_eliminarrecepcion_Yesbuttonposition ;
   private String Dvelop_confirmpanel_eliminarrecepcion_Confirmtype ;
   private String Dvelop_confirmpanel_aprobacioninterna_Title ;
   private String Dvelop_confirmpanel_aprobacioninterna_Confirmationtext ;
   private String Dvelop_confirmpanel_aprobacioninterna_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_aprobacioninterna_Nobuttoncaption ;
   private String Dvelop_confirmpanel_aprobacioninterna_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_aprobacioninterna_Yesbuttonposition ;
   private String Dvelop_confirmpanel_aprobacioninterna_Confirmtype ;
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
   private String divUnnamedtable1_Internalname ;
   private String bttBtnrecepcion_Internalname ;
   private String bttBtnrecepcion_Jsonclick ;
   private String bttBtneliminarrecepcion_Internalname ;
   private String bttBtneliminarrecepcion_Jsonclick ;
   private String bttBtnaprobacioninterna_Internalname ;
   private String bttBtnaprobacioninterna_Jsonclick ;
   private String bttBtncancelar_Internalname ;
   private String bttBtncancelar_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
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
   private String divDdo_lb_fechaeauxdates_Internalname ;
   private String edtavDdo_lb_fechaeauxdate_Internalname ;
   private String edtavDdo_lb_fechaeauxdate_Jsonclick ;
   private String divDdo_lb_fechaenauxdates_Internalname ;
   private String edtavDdo_lb_fechaenauxdate_Internalname ;
   private String edtavDdo_lb_fechaenauxdate_Jsonclick ;
   private String divDdo_lb_fecharauxdates_Internalname ;
   private String edtavDdo_lb_fecharauxdate_Internalname ;
   private String edtavDdo_lb_fecharauxdate_Jsonclick ;
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
   private String edtLb_ColNum_Internalname ;
   private String edtLb_Rb_Internalname ;
   private String A5555Lb_opcion ;
   private String edtLb_opcion_Internalname ;
   private String edtLb_numop_Internalname ;
   private String A5540Lb_Cartaz ;
   private String edtLb_Cartaz_Internalname ;
   private String edtLb_FechaE_Internalname ;
   private String edtLb_FechaEn_Internalname ;
   private String edtLb_FechaR_Internalname ;
   private String AV144Lb_ProvDef ;
   private String edtLb_ObsCR_Internalname ;
   private String A12525Lb_opSt ;
   private String edtLb_opFc_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Internalname ;
   private String edtavF_cformu_Internalname ;
   private String edtavFornumcol_Internalname ;
   private String edtLb_CosteE_Internalname ;
   private String edtavGridvariable1_Internalname ;
   private String edtTipColCod_Internalname ;
   private String A5536Lb_ColNom ;
   private String edtLb_ColNom_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String scmdbuf ;
   private String lV189Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod ;
   private String lV191Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc ;
   private String lV197Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion ;
   private String lV201Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz ;
   private String lV43Lb_Cartaz ;
   private String lV44Lb_colnom ;
   private String AV190Gestionlaboratorio_recepciondeensayocliente_wcds_7_tflb_artcod_sel ;
   private String AV189Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod ;
   private String AV192Gestionlaboratorio_recepciondeensayocliente_wcds_9_tflb_colnomc_sel ;
   private String AV191Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc ;
   private String AV198Gestionlaboratorio_recepciondeensayocliente_wcds_15_tflb_opcion_sel ;
   private String AV197Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion ;
   private String AV202Gestionlaboratorio_recepciondeensayocliente_wcds_19_tflb_cartaz_sel ;
   private String AV201Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz ;
   private String hsh ;
   private String AV150AprobacionInterna ;
   private String AV181Station ;
   private String AV182Emprnom ;
   private String AV183Usurcod ;
   private String AV152CliNom ;
   private String AV161lb_artcod ;
   private String AV145Lb_colnomc ;
   private String Dvelop_confirmpanel_recepcion_Internalname ;
   private String AV137IN_Lb_opcion ;
   private String AV169Num_color ;
   private String AV166Lb_opcions ;
   private String AV171Opcion ;
   private String AV165Lb_opcioni ;
   private String GXt_char27 ;
   private String GXv_char23[] ;
   private String GXt_char26 ;
   private String GXv_char15[] ;
   private String GXt_char25 ;
   private String GXv_char6[] ;
   private String GXt_char24 ;
   private String GXv_char5[] ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private String tblTabledvelop_confirmpanel_aprobacioninterna_Internalname ;
   private String Dvelop_confirmpanel_aprobacioninterna_Internalname ;
   private String tblTabledvelop_confirmpanel_eliminarrecepcion_Internalname ;
   private String Dvelop_confirmpanel_eliminarrecepcion_Internalname ;
   private String tblTabledvelop_confirmpanel_recepcion_Internalname ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV32Emprcod ;
   private String sCtrlAV5Clicod ;
   private String sCtrlAV43Lb_Cartaz ;
   private String sCtrlAV44Lb_colnom ;
   private String sCtrlAV47Lb_numero ;
   private String sCtrlAV46Lb_fechaR ;
   private String sCtrlAV45Lb_estado ;
   private String sGXsfl_67_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtLb_numero_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String edtLb_ArtCod_Jsonclick ;
   private String edtLb_ColNomC_Jsonclick ;
   private String edtLb_ColNum_Jsonclick ;
   private String edtLb_Rb_Jsonclick ;
   private String edtLb_opcion_Jsonclick ;
   private String edtLb_numop_Jsonclick ;
   private String edtLb_Cartaz_Jsonclick ;
   private String edtLb_FechaE_Jsonclick ;
   private String edtLb_FechaEn_Jsonclick ;
   private String edtLb_FechaR_Jsonclick ;
   private String edtLb_ObsCR_Jsonclick ;
   private String edtLb_opFc_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtavF_cformu_Jsonclick ;
   private String edtavFornumcol_Jsonclick ;
   private String edtLb_CosteE_Jsonclick ;
   private String edtavGridvariable1_Jsonclick ;
   private String edtTipColCod_Jsonclick ;
   private String edtLb_ColNom_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV136Lb_HoraR ;
   private java.util.Date AV141Hora_null ;
   private java.util.Date wcpOAV46Lb_fechaR ;
   private java.util.Date AV46Lb_fechaR ;
   private java.util.Date AV80TFLb_FechaE ;
   private java.util.Date AV82TFLb_FechaEn ;
   private java.util.Date AV84TFLb_FechaR ;
   private java.util.Date AV157ForUltUti ;
   private java.util.Date AV143Fecha_b ;
   private java.util.Date AV11DDO_Lb_FechaEAuxDate ;
   private java.util.Date AV13DDO_Lb_FechaEnAuxDate ;
   private java.util.Date AV15DDO_Lb_FechaRAuxDate ;
   private java.util.Date A5541Lb_FechaE ;
   private java.util.Date A5567Lb_FechaEn ;
   private java.util.Date A5563Lb_FechaR ;
   private java.util.Date A12526Lb_opFc ;
   private java.util.Date AV203Gestionlaboratorio_recepciondeensayocliente_wcds_20_tflb_fechae ;
   private java.util.Date AV204Gestionlaboratorio_recepciondeensayocliente_wcds_21_tflb_fechaen ;
   private java.util.Date AV205Gestionlaboratorio_recepciondeensayocliente_wcds_22_tflb_fechar ;
   private java.util.Date A6461Lb_FecNoa1 ;
   private java.util.Date AV140Fec_null ;
   private java.util.Date GXv_date13[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV53OrderedDsc ;
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
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean AV55Seleccionar ;
   private boolean AV56SeleccionarEliminar ;
   private boolean n12525Lb_opSt ;
   private boolean n12526Lb_opFc ;
   private boolean n831TipColCod ;
   private boolean bGXsfl_67_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean Cond_result ;
   private String AV76TFLb_Estado_SelsJson ;
   private String AV8ColumnsSelectorXML ;
   private String AV50ManageFiltersXml ;
   private String AV124UserCustomValue ;
   private String AV35FilterFullText ;
   private String AV104TFLb_ObsCR ;
   private String AV105TFLb_ObsCR_Sel ;
   private String A10822Lb_ObsCR ;
   private String lV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext ;
   private String lV207Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr ;
   private String AV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext ;
   private String AV208Gestionlaboratorio_recepciondeensayocliente_wcds_25_tflb_obscr_sel ;
   private String AV207Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr ;
   private String AV34ExcelFilename ;
   private String AV33ErrorMessage ;
   private String AV160Json_EnvioEnsayo ;
   private GXSimpleCollection<Byte> AV206Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels ;
   private GXSimpleCollection<Byte> AV75TFLb_Estado_Sels ;
   private GXSimpleCollection<Integer> AV127Col_Lb_numero ;
   private GXSimpleCollection<Integer> AV128Col_Lb_numeroE ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV41HTTPRequest ;
   private com.genexus.webpanels.WebSession AV57Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_titlescategories ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_recepcion ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_aprobacioninterna ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminarrecepcion ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkavActualizacionensayotxp ;
   private ICheckbox chkavAprobacioncolorlab ;
   private ICheckbox chkavSeleccionar ;
   private HTMLChoice cmbavLb_tiprec ;
   private HTMLChoice cmbLb_Estado ;
   private ICheckbox chkavSeleccionareliminar ;
   private HTMLChoice cmbavLb_provdef ;
   private HTMLChoice cmbLb_opSt ;
   private IDataStoreProvider pr_default ;
   private byte[] H01TS2_A5569Lb_EstEns ;
   private java.util.Date[] H01TS2_A6461Lb_FecNoa1 ;
   private byte[] H01TS2_A5597Lb_TipRec ;
   private String[] H01TS2_A6631Lb_ProvDef ;
   private String[] H01TS2_A396EmprCod ;
   private String[] H01TS2_A5536Lb_ColNom ;
   private byte[] H01TS2_A831TipColCod ;
   private boolean[] H01TS2_n831TipColCod ;
   private java.math.BigDecimal[] H01TS2_A5565Lb_CosteE ;
   private String[] H01TS2_A279CliNom ;
   private java.util.Date[] H01TS2_A12526Lb_opFc ;
   private boolean[] H01TS2_n12526Lb_opFc ;
   private String[] H01TS2_A12525Lb_opSt ;
   private boolean[] H01TS2_n12525Lb_opSt ;
   private String[] H01TS2_A10822Lb_ObsCR ;
   private byte[] H01TS2_A5566Lb_Estado ;
   private java.util.Date[] H01TS2_A5563Lb_FechaR ;
   private java.util.Date[] H01TS2_A5567Lb_FechaEn ;
   private java.util.Date[] H01TS2_A5541Lb_FechaE ;
   private String[] H01TS2_A5540Lb_Cartaz ;
   private byte[] H01TS2_A5718Lb_numop ;
   private String[] H01TS2_A5555Lb_opcion ;
   private java.math.BigDecimal[] H01TS2_A5547Lb_Rb ;
   private int[] H01TS2_A5537Lb_ColNum ;
   private String[] H01TS2_A5538Lb_ColNomC ;
   private String[] H01TS2_A5533Lb_ArtCod ;
   private int[] H01TS2_A252CliCod ;
   private int[] H01TS2_A5532Lb_numero ;
   private long[] H01TS3_AGRID_nRecordCount ;
   private GXSimpleCollection<String> AV129Col_Lb_opcion ;
   private GXSimpleCollection<String> AV130Col_Lb_opcionE ;
   private GXBaseCollection<app.gestionlaboratorio.SdtEnviodeEnsayo_SDT> AV126Col_EnvioEnsayo ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV48ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item18 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item19[] ;
   private app.gestionlaboratorio.SdtEnviodeEnsayo_SDT AV173Item_EnvioEnsayo ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV6ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV7ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector16[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector17[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV31DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV39GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState28[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV40GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV122TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV125WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
}

final  class recepciondeensayocliente_wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01TS2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5566Lb_Estado ,
                                          GXSimpleCollection<Byte> AV206Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels ,
                                          String AV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext ,
                                          int AV185Gestionlaboratorio_recepciondeensayocliente_wcds_2_tflb_numero ,
                                          int AV186Gestionlaboratorio_recepciondeensayocliente_wcds_3_tflb_numero_to ,
                                          int AV187Gestionlaboratorio_recepciondeensayocliente_wcds_4_tfclicod ,
                                          int AV188Gestionlaboratorio_recepciondeensayocliente_wcds_5_tfclicod_to ,
                                          String AV190Gestionlaboratorio_recepciondeensayocliente_wcds_7_tflb_artcod_sel ,
                                          String AV189Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod ,
                                          String AV192Gestionlaboratorio_recepciondeensayocliente_wcds_9_tflb_colnomc_sel ,
                                          String AV191Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc ,
                                          int AV193Gestionlaboratorio_recepciondeensayocliente_wcds_10_tflb_colnum ,
                                          int AV194Gestionlaboratorio_recepciondeensayocliente_wcds_11_tflb_colnum_to ,
                                          java.math.BigDecimal AV195Gestionlaboratorio_recepciondeensayocliente_wcds_12_tflb_rb ,
                                          java.math.BigDecimal AV196Gestionlaboratorio_recepciondeensayocliente_wcds_13_tflb_rb_to ,
                                          String AV198Gestionlaboratorio_recepciondeensayocliente_wcds_15_tflb_opcion_sel ,
                                          String AV197Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion ,
                                          byte AV199Gestionlaboratorio_recepciondeensayocliente_wcds_16_tflb_numop ,
                                          byte AV200Gestionlaboratorio_recepciondeensayocliente_wcds_17_tflb_numop_to ,
                                          String AV202Gestionlaboratorio_recepciondeensayocliente_wcds_19_tflb_cartaz_sel ,
                                          String AV201Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz ,
                                          java.util.Date AV203Gestionlaboratorio_recepciondeensayocliente_wcds_20_tflb_fechae ,
                                          java.util.Date AV204Gestionlaboratorio_recepciondeensayocliente_wcds_21_tflb_fechaen ,
                                          java.util.Date AV205Gestionlaboratorio_recepciondeensayocliente_wcds_22_tflb_fechar ,
                                          int AV206Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels_size ,
                                          String AV208Gestionlaboratorio_recepciondeensayocliente_wcds_25_tflb_obscr_sel ,
                                          String AV207Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr ,
                                          int AV5Clicod ,
                                          String AV43Lb_Cartaz ,
                                          String AV44Lb_colnom ,
                                          int AV47Lb_numero ,
                                          int A5532Lb_numero ,
                                          int A252CliCod ,
                                          String A5533Lb_ArtCod ,
                                          String A5538Lb_ColNomC ,
                                          int A5537Lb_ColNum ,
                                          java.math.BigDecimal A5547Lb_Rb ,
                                          String A5555Lb_opcion ,
                                          byte A5718Lb_numop ,
                                          String A5540Lb_Cartaz ,
                                          String A10822Lb_ObsCR ,
                                          java.util.Date A5541Lb_FechaE ,
                                          java.util.Date A5567Lb_FechaEn ,
                                          java.util.Date A5563Lb_FechaR ,
                                          String A5536Lb_ColNom ,
                                          short AV51OrderedBy ,
                                          boolean AV53OrderedDsc ,
                                          byte A5569Lb_EstEns ,
                                          java.util.Date A6461Lb_FecNoa1 ,
                                          byte AV45Lb_estado ,
                                          String AV32Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int29 = new byte[46];
      Object[] GXv_Object30 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T2.Lb_EstEns, T1.Lb_FecNoa1, T2.Lb_TipRec, T1.Lb_ProvDef, T1.EmprCod, T2.Lb_ColNom, T2.TipColCod, T1.Lb_CosteE, T3.CliNom, T1.Lb_opFc, T1.Lb_opSt, T1.Lb_ObsCR," ;
      sSelectString += " T1.Lb_Estado, T1.Lb_FechaR, T1.Lb_FechaEn, T2.Lb_FechaE, T2.Lb_Cartaz, T1.Lb_numop, T1.Lb_opcion, T2.Lb_Rb, T2.Lb_ColNum, T2.Lb_ColNomC, T2.Lb_ArtCod, T2.CliCod," ;
      sSelectString += " T1.Lb_numero" ;
      sFromString = " FROM ((TXPENS002 T1 INNER JOIN TXPENS001 T2 ON T2.EmprCod = T1.EmprCod AND T2.Lb_numero = T1.Lb_numero) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod" ;
      sFromString += " = T2.CliCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T2.Lb_EstEns < 2)");
      addWhere(sWhereString, "((T1.Lb_FecNoa1 = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(Not (T1.Lb_FechaEn = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(T1.Lb_Estado = ? or ? = 0 and T1.Lb_Estado <> 3)");
      if ( ! (GXutil.strcmp("", AV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T2.Lb_ColNomC) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.Lb_Rb,'9990.99'), 2) like '%' || ?) or ( UPPER(T1.Lb_opcion) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_numop,'90'), 2) like '%' || ?) or ( UPPER(T2.Lb_Cartaz) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_Estado,'90'), 2) like '%' || ?) or ( UPPER(T1.Lb_ObsCR) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int29[3] = (byte)(1) ;
         GXv_int29[4] = (byte)(1) ;
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
      if ( ! (0==AV185Gestionlaboratorio_recepciondeensayocliente_wcds_2_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int29[14] = (byte)(1) ;
      }
      if ( ! (0==AV186Gestionlaboratorio_recepciondeensayocliente_wcds_3_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int29[15] = (byte)(1) ;
      }
      if ( ! (0==AV187Gestionlaboratorio_recepciondeensayocliente_wcds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int29[16] = (byte)(1) ;
      }
      if ( ! (0==AV188Gestionlaboratorio_recepciondeensayocliente_wcds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int29[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV190Gestionlaboratorio_recepciondeensayocliente_wcds_7_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV189Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV190Gestionlaboratorio_recepciondeensayocliente_wcds_7_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int29[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV192Gestionlaboratorio_recepciondeensayocliente_wcds_9_tflb_colnomc_sel)==0) && ( ! (GXutil.strcmp("", AV191Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_ColNomC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV192Gestionlaboratorio_recepciondeensayocliente_wcds_9_tflb_colnomc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNomC = ?)");
      }
      else
      {
         GXv_int29[21] = (byte)(1) ;
      }
      if ( ! (0==AV193Gestionlaboratorio_recepciondeensayocliente_wcds_10_tflb_colnum) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int29[22] = (byte)(1) ;
      }
      if ( ! (0==AV194Gestionlaboratorio_recepciondeensayocliente_wcds_11_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int29[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV195Gestionlaboratorio_recepciondeensayocliente_wcds_12_tflb_rb)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Rb >= ?)");
      }
      else
      {
         GXv_int29[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV196Gestionlaboratorio_recepciondeensayocliente_wcds_13_tflb_rb_to)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Rb <= ?)");
      }
      else
      {
         GXv_int29[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV198Gestionlaboratorio_recepciondeensayocliente_wcds_15_tflb_opcion_sel)==0) && ( ! (GXutil.strcmp("", AV197Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_opcion) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV198Gestionlaboratorio_recepciondeensayocliente_wcds_15_tflb_opcion_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_opcion = ?)");
      }
      else
      {
         GXv_int29[27] = (byte)(1) ;
      }
      if ( ! (0==AV199Gestionlaboratorio_recepciondeensayocliente_wcds_16_tflb_numop) )
      {
         addWhere(sWhereString, "(T1.Lb_numop >= ?)");
      }
      else
      {
         GXv_int29[28] = (byte)(1) ;
      }
      if ( ! (0==AV200Gestionlaboratorio_recepciondeensayocliente_wcds_17_tflb_numop_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numop <= ?)");
      }
      else
      {
         GXv_int29[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV202Gestionlaboratorio_recepciondeensayocliente_wcds_19_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV201Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV202Gestionlaboratorio_recepciondeensayocliente_wcds_19_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int29[31] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV203Gestionlaboratorio_recepciondeensayocliente_wcds_20_tflb_fechae)) )
      {
         addWhere(sWhereString, "(T2.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int29[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV204Gestionlaboratorio_recepciondeensayocliente_wcds_21_tflb_fechaen)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaEn >= ?)");
      }
      else
      {
         GXv_int29[33] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV205Gestionlaboratorio_recepciondeensayocliente_wcds_22_tflb_fechar)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaR >= ?)");
      }
      else
      {
         GXv_int29[34] = (byte)(1) ;
      }
      if ( AV206Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV206Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels, "T1.Lb_Estado IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV208Gestionlaboratorio_recepciondeensayocliente_wcds_25_tflb_obscr_sel)==0) && ( ! (GXutil.strcmp("", AV207Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ObsCR) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV208Gestionlaboratorio_recepciondeensayocliente_wcds_25_tflb_obscr_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ObsCR = ?)");
      }
      else
      {
         GXv_int29[36] = (byte)(1) ;
      }
      if ( ! (0==AV5Clicod) )
      {
         addWhere(sWhereString, "(T2.CliCod = ?)");
      }
      else
      {
         GXv_int29[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43Lb_Cartaz)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Cartaz like ?)");
      }
      else
      {
         GXv_int29[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV44Lb_colnom)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNom like ?)");
      }
      else
      {
         GXv_int29[39] = (byte)(1) ;
      }
      if ( ! (0==AV47Lb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero = ?)");
      }
      else
      {
         GXv_int29[40] = (byte)(1) ;
      }
      if ( AV51OrderedBy == 1 )
      {
         sOrderString += " ORDER BY T1.EmprCod, T2.CliCod, T1.Lb_numero, T1.Lb_opcion" ;
      }
      else if ( ( AV51OrderedBy == 2 ) && ! AV53OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_numero" ;
      }
      else if ( ( AV51OrderedBy == 2 ) && ( AV53OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_numero DESC" ;
      }
      else if ( ( AV51OrderedBy == 3 ) && ! AV53OrderedDsc )
      {
         sOrderString += " ORDER BY T2.CliCod" ;
      }
      else if ( ( AV51OrderedBy == 3 ) && ( AV53OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.CliCod DESC" ;
      }
      else if ( ( AV51OrderedBy == 4 ) && ! AV53OrderedDsc )
      {
         sOrderString += " ORDER BY T2.Lb_ArtCod" ;
      }
      else if ( ( AV51OrderedBy == 4 ) && ( AV53OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.Lb_ArtCod DESC" ;
      }
      else if ( ( AV51OrderedBy == 5 ) && ! AV53OrderedDsc )
      {
         sOrderString += " ORDER BY T2.Lb_ColNomC" ;
      }
      else if ( ( AV51OrderedBy == 5 ) && ( AV53OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.Lb_ColNomC DESC" ;
      }
      else if ( ( AV51OrderedBy == 6 ) && ! AV53OrderedDsc )
      {
         sOrderString += " ORDER BY T2.Lb_ColNum" ;
      }
      else if ( ( AV51OrderedBy == 6 ) && ( AV53OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.Lb_ColNum DESC" ;
      }
      else if ( ( AV51OrderedBy == 7 ) && ! AV53OrderedDsc )
      {
         sOrderString += " ORDER BY T2.Lb_Rb" ;
      }
      else if ( ( AV51OrderedBy == 7 ) && ( AV53OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.Lb_Rb DESC" ;
      }
      else if ( ( AV51OrderedBy == 8 ) && ! AV53OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_opcion" ;
      }
      else if ( ( AV51OrderedBy == 8 ) && ( AV53OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_opcion DESC" ;
      }
      else if ( ( AV51OrderedBy == 9 ) && ! AV53OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_numop" ;
      }
      else if ( ( AV51OrderedBy == 9 ) && ( AV53OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_numop DESC" ;
      }
      else if ( ( AV51OrderedBy == 10 ) && ! AV53OrderedDsc )
      {
         sOrderString += " ORDER BY T2.Lb_Cartaz" ;
      }
      else if ( ( AV51OrderedBy == 10 ) && ( AV53OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.Lb_Cartaz DESC" ;
      }
      else if ( ( AV51OrderedBy == 11 ) && ! AV53OrderedDsc )
      {
         sOrderString += " ORDER BY T2.Lb_FechaE" ;
      }
      else if ( ( AV51OrderedBy == 11 ) && ( AV53OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.Lb_FechaE DESC" ;
      }
      else if ( ( AV51OrderedBy == 12 ) && ! AV53OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_FechaEn" ;
      }
      else if ( ( AV51OrderedBy == 12 ) && ( AV53OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_FechaEn DESC" ;
      }
      else if ( ( AV51OrderedBy == 13 ) && ! AV53OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_FechaR" ;
      }
      else if ( ( AV51OrderedBy == 13 ) && ( AV53OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_FechaR DESC" ;
      }
      else if ( ( AV51OrderedBy == 14 ) && ! AV53OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_Estado" ;
      }
      else if ( ( AV51OrderedBy == 14 ) && ( AV53OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_Estado DESC" ;
      }
      else if ( ( AV51OrderedBy == 15 ) && ! AV53OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_ObsCR" ;
      }
      else if ( ( AV51OrderedBy == 15 ) && ( AV53OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_ObsCR DESC" ;
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

   protected Object[] conditional_H01TS3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5566Lb_Estado ,
                                          GXSimpleCollection<Byte> AV206Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels ,
                                          String AV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext ,
                                          int AV185Gestionlaboratorio_recepciondeensayocliente_wcds_2_tflb_numero ,
                                          int AV186Gestionlaboratorio_recepciondeensayocliente_wcds_3_tflb_numero_to ,
                                          int AV187Gestionlaboratorio_recepciondeensayocliente_wcds_4_tfclicod ,
                                          int AV188Gestionlaboratorio_recepciondeensayocliente_wcds_5_tfclicod_to ,
                                          String AV190Gestionlaboratorio_recepciondeensayocliente_wcds_7_tflb_artcod_sel ,
                                          String AV189Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod ,
                                          String AV192Gestionlaboratorio_recepciondeensayocliente_wcds_9_tflb_colnomc_sel ,
                                          String AV191Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc ,
                                          int AV193Gestionlaboratorio_recepciondeensayocliente_wcds_10_tflb_colnum ,
                                          int AV194Gestionlaboratorio_recepciondeensayocliente_wcds_11_tflb_colnum_to ,
                                          java.math.BigDecimal AV195Gestionlaboratorio_recepciondeensayocliente_wcds_12_tflb_rb ,
                                          java.math.BigDecimal AV196Gestionlaboratorio_recepciondeensayocliente_wcds_13_tflb_rb_to ,
                                          String AV198Gestionlaboratorio_recepciondeensayocliente_wcds_15_tflb_opcion_sel ,
                                          String AV197Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion ,
                                          byte AV199Gestionlaboratorio_recepciondeensayocliente_wcds_16_tflb_numop ,
                                          byte AV200Gestionlaboratorio_recepciondeensayocliente_wcds_17_tflb_numop_to ,
                                          String AV202Gestionlaboratorio_recepciondeensayocliente_wcds_19_tflb_cartaz_sel ,
                                          String AV201Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz ,
                                          java.util.Date AV203Gestionlaboratorio_recepciondeensayocliente_wcds_20_tflb_fechae ,
                                          java.util.Date AV204Gestionlaboratorio_recepciondeensayocliente_wcds_21_tflb_fechaen ,
                                          java.util.Date AV205Gestionlaboratorio_recepciondeensayocliente_wcds_22_tflb_fechar ,
                                          int AV206Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels_size ,
                                          String AV208Gestionlaboratorio_recepciondeensayocliente_wcds_25_tflb_obscr_sel ,
                                          String AV207Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr ,
                                          int AV5Clicod ,
                                          String AV43Lb_Cartaz ,
                                          String AV44Lb_colnom ,
                                          int AV47Lb_numero ,
                                          int A5532Lb_numero ,
                                          int A252CliCod ,
                                          String A5533Lb_ArtCod ,
                                          String A5538Lb_ColNomC ,
                                          int A5537Lb_ColNum ,
                                          java.math.BigDecimal A5547Lb_Rb ,
                                          String A5555Lb_opcion ,
                                          byte A5718Lb_numop ,
                                          String A5540Lb_Cartaz ,
                                          String A10822Lb_ObsCR ,
                                          java.util.Date A5541Lb_FechaE ,
                                          java.util.Date A5567Lb_FechaEn ,
                                          java.util.Date A5563Lb_FechaR ,
                                          String A5536Lb_ColNom ,
                                          short AV51OrderedBy ,
                                          boolean AV53OrderedDsc ,
                                          byte A5569Lb_EstEns ,
                                          java.util.Date A6461Lb_FecNoa1 ,
                                          byte AV45Lb_estado ,
                                          String AV32Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int32 = new byte[41];
      Object[] GXv_Object33 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM ((TXPENS002 T1 INNER JOIN TXPENS001 T2 ON T2.EmprCod = T1.EmprCod AND T2.Lb_numero = T1.Lb_numero) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.CliCod = T2.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T2.Lb_EstEns < 2)");
      addWhere(sWhereString, "((T1.Lb_FecNoa1 = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(Not (T1.Lb_FechaEn = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(T1.Lb_Estado = ? or ? = 0 and T1.Lb_Estado <> 3)");
      if ( ! (GXutil.strcmp("", AV184Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T2.Lb_ColNomC) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.Lb_Rb,'9990.99'), 2) like '%' || ?) or ( UPPER(T1.Lb_opcion) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_numop,'90'), 2) like '%' || ?) or ( UPPER(T2.Lb_Cartaz) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_Estado,'90'), 2) like '%' || ?) or ( UPPER(T1.Lb_ObsCR) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int32[3] = (byte)(1) ;
         GXv_int32[4] = (byte)(1) ;
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
      if ( ! (0==AV185Gestionlaboratorio_recepciondeensayocliente_wcds_2_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int32[14] = (byte)(1) ;
      }
      if ( ! (0==AV186Gestionlaboratorio_recepciondeensayocliente_wcds_3_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int32[15] = (byte)(1) ;
      }
      if ( ! (0==AV187Gestionlaboratorio_recepciondeensayocliente_wcds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int32[16] = (byte)(1) ;
      }
      if ( ! (0==AV188Gestionlaboratorio_recepciondeensayocliente_wcds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int32[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV190Gestionlaboratorio_recepciondeensayocliente_wcds_7_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV189Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV190Gestionlaboratorio_recepciondeensayocliente_wcds_7_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int32[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV192Gestionlaboratorio_recepciondeensayocliente_wcds_9_tflb_colnomc_sel)==0) && ( ! (GXutil.strcmp("", AV191Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_ColNomC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV192Gestionlaboratorio_recepciondeensayocliente_wcds_9_tflb_colnomc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNomC = ?)");
      }
      else
      {
         GXv_int32[21] = (byte)(1) ;
      }
      if ( ! (0==AV193Gestionlaboratorio_recepciondeensayocliente_wcds_10_tflb_colnum) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int32[22] = (byte)(1) ;
      }
      if ( ! (0==AV194Gestionlaboratorio_recepciondeensayocliente_wcds_11_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int32[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV195Gestionlaboratorio_recepciondeensayocliente_wcds_12_tflb_rb)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Rb >= ?)");
      }
      else
      {
         GXv_int32[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV196Gestionlaboratorio_recepciondeensayocliente_wcds_13_tflb_rb_to)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Rb <= ?)");
      }
      else
      {
         GXv_int32[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV198Gestionlaboratorio_recepciondeensayocliente_wcds_15_tflb_opcion_sel)==0) && ( ! (GXutil.strcmp("", AV197Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_opcion) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV198Gestionlaboratorio_recepciondeensayocliente_wcds_15_tflb_opcion_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_opcion = ?)");
      }
      else
      {
         GXv_int32[27] = (byte)(1) ;
      }
      if ( ! (0==AV199Gestionlaboratorio_recepciondeensayocliente_wcds_16_tflb_numop) )
      {
         addWhere(sWhereString, "(T1.Lb_numop >= ?)");
      }
      else
      {
         GXv_int32[28] = (byte)(1) ;
      }
      if ( ! (0==AV200Gestionlaboratorio_recepciondeensayocliente_wcds_17_tflb_numop_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numop <= ?)");
      }
      else
      {
         GXv_int32[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV202Gestionlaboratorio_recepciondeensayocliente_wcds_19_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV201Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV202Gestionlaboratorio_recepciondeensayocliente_wcds_19_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int32[31] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV203Gestionlaboratorio_recepciondeensayocliente_wcds_20_tflb_fechae)) )
      {
         addWhere(sWhereString, "(T2.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int32[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV204Gestionlaboratorio_recepciondeensayocliente_wcds_21_tflb_fechaen)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaEn >= ?)");
      }
      else
      {
         GXv_int32[33] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV205Gestionlaboratorio_recepciondeensayocliente_wcds_22_tflb_fechar)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaR >= ?)");
      }
      else
      {
         GXv_int32[34] = (byte)(1) ;
      }
      if ( AV206Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV206Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels, "T1.Lb_Estado IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV208Gestionlaboratorio_recepciondeensayocliente_wcds_25_tflb_obscr_sel)==0) && ( ! (GXutil.strcmp("", AV207Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ObsCR) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV208Gestionlaboratorio_recepciondeensayocliente_wcds_25_tflb_obscr_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ObsCR = ?)");
      }
      else
      {
         GXv_int32[36] = (byte)(1) ;
      }
      if ( ! (0==AV5Clicod) )
      {
         addWhere(sWhereString, "(T2.CliCod = ?)");
      }
      else
      {
         GXv_int32[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43Lb_Cartaz)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Cartaz like ?)");
      }
      else
      {
         GXv_int32[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV44Lb_colnom)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNom like ?)");
      }
      else
      {
         GXv_int32[39] = (byte)(1) ;
      }
      if ( ! (0==AV47Lb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero = ?)");
      }
      else
      {
         GXv_int32[40] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV51OrderedBy == 1 )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV51OrderedBy == 2 ) && ! AV53OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV51OrderedBy == 2 ) && ( AV53OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV51OrderedBy == 3 ) && ! AV53OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV51OrderedBy == 3 ) && ( AV53OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV51OrderedBy == 4 ) && ! AV53OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV51OrderedBy == 4 ) && ( AV53OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV51OrderedBy == 5 ) && ! AV53OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV51OrderedBy == 5 ) && ( AV53OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV51OrderedBy == 6 ) && ! AV53OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV51OrderedBy == 6 ) && ( AV53OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV51OrderedBy == 7 ) && ! AV53OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV51OrderedBy == 7 ) && ( AV53OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV51OrderedBy == 8 ) && ! AV53OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV51OrderedBy == 8 ) && ( AV53OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV51OrderedBy == 9 ) && ! AV53OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV51OrderedBy == 9 ) && ( AV53OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV51OrderedBy == 10 ) && ! AV53OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV51OrderedBy == 10 ) && ( AV53OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV51OrderedBy == 11 ) && ! AV53OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV51OrderedBy == 11 ) && ( AV53OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV51OrderedBy == 12 ) && ! AV53OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV51OrderedBy == 12 ) && ( AV53OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV51OrderedBy == 13 ) && ! AV53OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV51OrderedBy == 13 ) && ( AV53OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV51OrderedBy == 14 ) && ! AV53OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV51OrderedBy == 14 ) && ( AV53OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV51OrderedBy == 15 ) && ! AV53OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV51OrderedBy == 15 ) && ( AV53OrderedDsc ) )
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
                  return conditional_H01TS2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.util.Date)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (java.math.BigDecimal)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , (java.util.Date)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).shortValue() , ((Boolean) dynConstraints[46]).booleanValue() , ((Number) dynConstraints[47]).byteValue() , (java.util.Date)dynConstraints[48] , ((Number) dynConstraints[49]).byteValue() , (String)dynConstraints[50] , (String)dynConstraints[51] );
            case 1 :
                  return conditional_H01TS3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.util.Date)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (java.math.BigDecimal)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , (java.util.Date)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).shortValue() , ((Boolean) dynConstraints[46]).booleanValue() , ((Number) dynConstraints[47]).byteValue() , (java.util.Date)dynConstraints[48] , ((Number) dynConstraints[49]).byteValue() , (String)dynConstraints[50] , (String)dynConstraints[51] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01TS2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01TS3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,5);
               ((String[]) buf[9])[0] = rslt.getString(9, 30);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(12);
               ((byte[]) buf[15])[0] = rslt.getByte(13);
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(14);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(15);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(16);
               ((String[]) buf[19])[0] = rslt.getString(17, 20);
               ((byte[]) buf[20])[0] = rslt.getByte(18);
               ((String[]) buf[21])[0] = rslt.getString(19, 1);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(20,2);
               ((int[]) buf[23])[0] = rslt.getInt(21);
               ((String[]) buf[24])[0] = rslt.getString(22, 13);
               ((String[]) buf[25])[0] = rslt.getString(23, 16);
               ((int[]) buf[26])[0] = rslt.getInt(24);
               ((int[]) buf[27])[0] = rslt.getInt(25);
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
                  stmt.setString(sIdx, (String)parms[46], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[47]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 13);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[74]).byteValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[75]).byteValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 20);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 20);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[78]);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[79]);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[80]);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 300);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 300);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 20);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[90]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[91]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[43]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 13);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[69]).byteValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[70]).byteValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 20);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 20);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[73]);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[74]);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[75]);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 300);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 300);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 20);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               return;
      }
   }

}

