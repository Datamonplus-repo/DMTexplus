package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcwwkp89_impl extends GXWebComponent
{
   public wcwwkp89_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wcwwkp89_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcwwkp89_impl.class ));
   }

   public wcwwkp89_impl( int remoteHandle ,
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
               AV5Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
               AV6Prdnum = httpContext.GetPar( "Prdnum") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Prdnum", AV6Prdnum);
               AV7Prdnum_to = httpContext.GetPar( "Prdnum_to") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Prdnum_to", AV7Prdnum_to);
               AV72ValCodfrom = (short)(GXutil.lval( httpContext.GetPar( "ValCodfrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72ValCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72ValCodfrom), 4, 0));
               AV73ValCodto = (short)(GXutil.lval( httpContext.GetPar( "ValCodto"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73ValCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73ValCodto), 4, 0));
               AV8Seleccion = (byte)(GXutil.lval( httpContext.GetPar( "Seleccion"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Seleccion", GXutil.str( AV8Seleccion, 1, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV5Emprcod,AV6Prdnum,AV7Prdnum_to,Short.valueOf(AV72ValCodfrom),Short.valueOf(AV73ValCodto),Byte.valueOf(AV8Seleccion)});
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
      nRC_GXsfl_43 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_43"))) ;
      nGXsfl_43_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_43_idx"))) ;
      sGXsfl_43_idx = httpContext.GetPar( "sGXsfl_43_idx") ;
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
      AV19FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV5Emprcod = httpContext.GetPar( "Emprcod") ;
      AV6Prdnum = httpContext.GetPar( "Prdnum") ;
      AV7Prdnum_to = httpContext.GetPar( "Prdnum_to") ;
      AV72ValCodfrom = (short)(GXutil.lval( httpContext.GetPar( "ValCodfrom"))) ;
      AV73ValCodto = (short)(GXutil.lval( httpContext.GetPar( "ValCodto"))) ;
      AV37ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV32ColumnsSelector);
      AV38TFPrdNum = httpContext.GetPar( "TFPrdNum") ;
      AV39TFPrdNum_Sel = httpContext.GetPar( "TFPrdNum_Sel") ;
      AV40TFPrdNom = httpContext.GetPar( "TFPrdNom") ;
      AV41TFPrdNom_Sel = httpContext.GetPar( "TFPrdNom_Sel") ;
      AV42TFTipPrdDsc = httpContext.GetPar( "TFTipPrdDsc") ;
      AV43TFTipPrdDsc_Sel = httpContext.GetPar( "TFTipPrdDsc_Sel") ;
      AV44TFPrdRefPrv = httpContext.GetPar( "TFPrdRefPrv") ;
      AV45TFPrdRefPrv_Sel = httpContext.GetPar( "TFPrdRefPrv_Sel") ;
      AV46TFPrdUbicacion = httpContext.GetPar( "TFPrdUbicacion") ;
      AV47TFPrdUbicacion_Sel = httpContext.GetPar( "TFPrdUbicacion_Sel") ;
      AV48TFPrdStkMinU = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdStkMinU"), ".") ;
      AV49TFPrdStkMinU_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdStkMinU_To"), ".") ;
      AV60TFPrdPreAct = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdPreAct"), ".") ;
      AV61TFPrdPreAct_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdPreAct_To"), ".") ;
      AV62TFPrvNum = (int)(GXutil.lval( httpContext.GetPar( "TFPrvNum"))) ;
      AV63TFPrvNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFPrvNum_To"))) ;
      AV64TFPrvNom = httpContext.GetPar( "TFPrvNom") ;
      AV65TFPrvNom_Sel = httpContext.GetPar( "TFPrvNom_Sel") ;
      AV70TFPrdLote = httpContext.GetPar( "TFPrdLote") ;
      AV71TFPrdLote_Sel = httpContext.GetPar( "TFPrdLote_Sel") ;
      AV74TFValCod = (byte)(GXutil.lval( httpContext.GetPar( "TFValCod"))) ;
      AV75TFValCod_To = (byte)(GXutil.lval( httpContext.GetPar( "TFValCod_To"))) ;
      AV78Pgmname = httpContext.GetPar( "Pgmname") ;
      AV16OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV17OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV8Seleccion = (byte)(GXutil.lval( httpContext.GetPar( "Seleccion"))) ;
      AV20CantInv = CommonUtil.decimalVal( httpContext.GetPar( "CantInv"), ".") ;
      AV21Compras = CommonUtil.decimalVal( httpContext.GetPar( "Compras"), ".") ;
      AV22Consumos = CommonUtil.decimalVal( httpContext.GetPar( "Consumos"), ".") ;
      AV54compras2 = CommonUtil.decimalVal( httpContext.GetPar( "compras2"), ".") ;
      AV55consumos2 = CommonUtil.decimalVal( httpContext.GetPar( "consumos2"), ".") ;
      AV56obsp = httpContext.GetPar( "obsp") ;
      AV57cantRes = CommonUtil.decimalVal( httpContext.GetPar( "cantRes"), ".") ;
      AV24CantPesada = CommonUtil.decimalVal( httpContext.GetPar( "CantPesada"), ".") ;
      AV68Cantpdte = CommonUtil.decimalVal( httpContext.GetPar( "Cantpdte"), ".") ;
      AV58InciCPEDID = httpContext.GetPar( "InciCPEDID") ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV19FilterFullText, AV5Emprcod, AV6Prdnum, AV7Prdnum_to, AV72ValCodfrom, AV73ValCodto, AV37ManageFiltersExecutionStep, AV32ColumnsSelector, AV38TFPrdNum, AV39TFPrdNum_Sel, AV40TFPrdNom, AV41TFPrdNom_Sel, AV42TFTipPrdDsc, AV43TFTipPrdDsc_Sel, AV44TFPrdRefPrv, AV45TFPrdRefPrv_Sel, AV46TFPrdUbicacion, AV47TFPrdUbicacion_Sel, AV48TFPrdStkMinU, AV49TFPrdStkMinU_To, AV60TFPrdPreAct, AV61TFPrdPreAct_To, AV62TFPrvNum, AV63TFPrvNum_To, AV64TFPrvNom, AV65TFPrvNom_Sel, AV70TFPrdLote, AV71TFPrdLote_Sel, AV74TFValCod, AV75TFValCod_To, AV78Pgmname, AV16OrderedBy, AV17OrderedDsc, AV8Seleccion, AV20CantInv, AV21Compras, AV22Consumos, AV54compras2, AV55consumos2, AV56obsp, AV57cantRes, AV24CantPesada, AV68Cantpdte, AV58InciCPEDID, A396EmprCod, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa13W2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( " Mantenimiento Productos Quimicos", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.wcwwkp89", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5Emprcod)),GXutil.URLEncode(GXutil.rtrim(AV6Prdnum)),GXutil.URLEncode(GXutil.rtrim(AV7Prdnum_to)),GXutil.URLEncode(GXutil.ltrimstr(AV72ValCodfrom,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV73ValCodto,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV8Seleccion,1,0))}, new String[] {"Emprcod","Prdnum","Prdnum_to","ValCodfrom","ValCodto","Seleccion"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOMPRAS2", getSecureSignedToken( sPrefix, localUtil.format( AV54compras2, "ZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCONSUMOS2", getSecureSignedToken( sPrefix, localUtil.format( AV55consumos2, "ZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vOBSP", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV56obsp, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCANTRES", getSecureSignedToken( sPrefix, localUtil.format( AV57cantRes, "ZZZZZZZ9.999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCANTPDTE", getSecureSignedToken( sPrefix, localUtil.format( AV68Cantpdte, "ZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vINCICPEDID", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV58InciCPEDID, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"WCWWkp89");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV78Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("wcwwkp89:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXH_vFILTERFULLTEXT", AV19FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_43", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_43, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV35ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV35ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV52GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV53GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV50DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV50DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV32ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV32ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV5Emprcod", GXutil.rtrim( wcpOAV5Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV6Prdnum", GXutil.rtrim( wcpOAV6Prdnum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7Prdnum_to", GXutil.rtrim( wcpOAV7Prdnum_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV72ValCodfrom", GXutil.ltrim( localUtil.ntoc( wcpOAV72ValCodfrom, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV73ValCodto", GXutil.ltrim( localUtil.ntoc( wcpOAV73ValCodto, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV8Seleccion", GXutil.ltrim( localUtil.ntoc( wcpOAV8Seleccion, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV37ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNUM", GXutil.rtrim( AV38TFPrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNUM_SEL", GXutil.rtrim( AV39TFPrdNum_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNOM", GXutil.rtrim( AV40TFPrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNOM_SEL", GXutil.rtrim( AV41TFPrdNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFTIPPRDDSC", GXutil.rtrim( AV42TFTipPrdDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFTIPPRDDSC_SEL", GXutil.rtrim( AV43TFTipPrdDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDREFPRV", GXutil.rtrim( AV44TFPrdRefPrv));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDREFPRV_SEL", GXutil.rtrim( AV45TFPrdRefPrv_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDUBICACION", GXutil.rtrim( AV46TFPrdUbicacion));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDUBICACION_SEL", GXutil.rtrim( AV47TFPrdUbicacion_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDSTKMINU", GXutil.ltrim( localUtil.ntoc( AV48TFPrdStkMinU, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDSTKMINU_TO", GXutil.ltrim( localUtil.ntoc( AV49TFPrdStkMinU_To, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDPREACT", GXutil.ltrim( localUtil.ntoc( AV60TFPrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDPREACT_TO", GXutil.ltrim( localUtil.ntoc( AV61TFPrdPreAct_To, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRVNUM", GXutil.ltrim( localUtil.ntoc( AV62TFPrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRVNUM_TO", GXutil.ltrim( localUtil.ntoc( AV63TFPrvNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRVNOM", GXutil.rtrim( AV64TFPrvNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRVNOM_SEL", GXutil.rtrim( AV65TFPrvNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDLOTE", GXutil.rtrim( AV70TFPrdLote));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDLOTE_SEL", GXutil.rtrim( AV71TFPrdLote_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFVALCOD", GXutil.ltrim( localUtil.ntoc( AV74TFValCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFVALCOD_TO", GXutil.ltrim( localUtil.ntoc( AV75TFValCod_To, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV16OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV17OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV5Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRDNUM", GXutil.rtrim( AV6Prdnum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRDNUM_TO", GXutil.rtrim( AV7Prdnum_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vVALCODFROM", GXutil.ltrim( localUtil.ntoc( AV72ValCodfrom, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vVALCODTO", GXutil.ltrim( localUtil.ntoc( AV73ValCodto, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSELECCION", GXutil.ltrim( localUtil.ntoc( AV8Seleccion, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCOMPRAS2", GXutil.ltrim( localUtil.ntoc( AV54compras2, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOMPRAS2", getSecureSignedToken( sPrefix, localUtil.format( AV54compras2, "ZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCONSUMOS2", GXutil.ltrim( localUtil.ntoc( AV55consumos2, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCONSUMOS2", getSecureSignedToken( sPrefix, localUtil.format( AV55consumos2, "ZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vOBSP", GXutil.rtrim( AV56obsp));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vOBSP", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV56obsp, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCANTRES", GXutil.ltrim( localUtil.ntoc( AV57cantRes, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCANTRES", getSecureSignedToken( sPrefix, localUtil.format( AV57cantRes, "ZZZZZZZ9.999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCANTPDTE", GXutil.ltrim( localUtil.ntoc( AV68Cantpdte, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCANTPDTE", getSecureSignedToken( sPrefix, localUtil.format( AV68Cantpdte, "ZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vINCICPEDID", GXutil.rtrim( AV58InciCPEDID));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vINCICPEDID", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV58InciCPEDID, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PRDEXIALM", GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PRDCANRES", GXutil.ltrim( localUtil.ntoc( A685PrdCanRes, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV14GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV14GridState);
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Width", GXutil.rtrim( Dvpanel_unnamedtable1_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable1_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable1_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Cls", GXutil.rtrim( Dvpanel_unnamedtable1_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Title", GXutil.rtrim( Dvpanel_unnamedtable1_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable1_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable1_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable1_Autoscroll));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INNEWWINDOW1_Width", GXutil.rtrim( Innewwindow1_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INNEWWINDOW1_Height", GXutil.rtrim( Innewwindow1_Height));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INNEWWINDOW1_Target", GXutil.rtrim( Innewwindow1_Target));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption", GXutil.rtrim( Ddo_gridcolumnsselector_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip", GXutil.rtrim( Ddo_gridcolumnsselector_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls", GXutil.rtrim( Ddo_gridcolumnsselector_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype", GXutil.rtrim( Ddo_gridcolumnsselector_Dropdownoptionstype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname", GXutil.rtrim( Ddo_gridcolumnsselector_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace", GXutil.rtrim( Ddo_gridcolumnsselector_Titlecontrolidtoreplace));
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

   public void renderHtmlCloseForm13W2( )
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
      return "WCWWkp89" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Mantenimiento Productos Quimicos", "") ;
   }

   public void wb13W0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.wcwwkp89");
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
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCWWkp89.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCWWkp89.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportReportCaption", ""), bttBtnexportreport_Jsonclick, 7, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e1113w1_client"+"'", TempTags, "", 2, "HLP_WCWWkp89.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCWWkp89.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_25_13W2( true) ;
      }
      else
      {
         wb_table1_25_13W2( false) ;
      }
      return  ;
   }

   public void wb_table1_25_13W2e( boolean wbgen )
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
         startgridcontrol43( ) ;
      }
      if ( wbEnd == 43 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_43 = (int)(nGXsfl_43_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV52GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV53GridPageCount);
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"W0070"+"", GXutil.rtrim( WebComp_Grid_dwc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+sPrefix+"gxHTMLWrpW0070"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_43_Refreshing )
            {
               if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldGrid_dwc), GXutil.lower( WebComp_Grid_dwc_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp(sPrefix+"gxHTMLWrpW0070"+"");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV78Pgmname), GXutil.rtrim( localUtil.format( AV78Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WCWWkp89.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_unnamedtable1.setProperty("Width", Dvpanel_unnamedtable1_Width);
         ucDvpanel_unnamedtable1.setProperty("AutoWidth", Dvpanel_unnamedtable1_Autowidth);
         ucDvpanel_unnamedtable1.setProperty("AutoHeight", Dvpanel_unnamedtable1_Autoheight);
         ucDvpanel_unnamedtable1.setProperty("Cls", Dvpanel_unnamedtable1_Cls);
         ucDvpanel_unnamedtable1.setProperty("Title", Dvpanel_unnamedtable1_Title);
         ucDvpanel_unnamedtable1.setProperty("Collapsible", Dvpanel_unnamedtable1_Collapsible);
         ucDvpanel_unnamedtable1.setProperty("Collapsed", Dvpanel_unnamedtable1_Collapsed);
         ucDvpanel_unnamedtable1.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable1_Showcollapseicon);
         ucDvpanel_unnamedtable1.setProperty("IconPosition", Dvpanel_unnamedtable1_Iconposition);
         ucDvpanel_unnamedtable1.setProperty("AutoScroll", Dvpanel_unnamedtable1_Autoscroll);
         ucDvpanel_unnamedtable1.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable1_Internalname, sPrefix+"DVPANEL_UNNAMEDTABLE1Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_UNNAMEDTABLE1Container"+"UnnamedTable1"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "<h1 style=\"color:black;\">Stock Piso</h1>, es la diferencia entre Existencias que hay en las cajas menos cantidad pesada", ""), "", "", lblTextblock1_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(1), "HLP_WCWWkp89.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "<h1 style=\"color:black;\">Stock Total</h1>, es la suma entre Stock Piso + Stock Pesado", ""), "", "", lblTextblock2_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(1), "HLP_WCWWkp89.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "<h1 style=\"color:black;\">Valor</h1>, se calcula en base a Stock Piso mas Stock Pesado", ""), "", "", lblTextblock3_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(1), "HLP_WCWWkp89.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "<h1 style=\"color:black;\">Disponible</h1>, es la diferencia entre Stock Piso y Reserva.", ""), "", "", lblTextblock4_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(1), "HLP_WCWWkp89.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV50DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucInnewwindow1.render(context, "innewwindow", Innewwindow1_Internalname, sPrefix+"INNEWWINDOW1Container");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV50DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV32ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 43 )
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

   public void start13W2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( " Mantenimiento Productos Quimicos", ""), (short)(0)) ;
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
            strup13W0( ) ;
         }
      }
   }

   public void ws13W2( )
   {
      start13W2( ) ;
      evt13W2( ) ;
   }

   public void evt13W2( )
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
                              strup13W0( ) ;
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
                              strup13W0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1213W2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup13W0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1313W2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup13W0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1413W2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup13W0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1513W2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup13W0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1613W2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup13W0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e1713W2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup13W0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e1813W2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup13W0( ) ;
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
                              strup13W0( ) ;
                           }
                           nGXsfl_43_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_432( ) ;
                           AV69DetailWebComponent = httpContext.cgiGet( edtavDetailwebcomponent_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDetailwebcomponent_Internalname, AV69DetailWebComponent);
                           A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
                           A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
                           A6302TipPrdDsc = httpContext.cgiGet( edtTipPrdDsc_Internalname) ;
                           n6302TipPrdDsc = false ;
                           A728PrdRefPrv = httpContext.cgiGet( edtPrdRefPrv_Internalname) ;
                           A13457PrdUbicaci = httpContext.cgiGet( edtPrdUbicaci_Internalname) ;
                           A732PrdStkMinU = localUtil.ctond( httpContext.cgiGet( edtPrdStkMinU_Internalname)) ;
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCantinv_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCantinv_Internalname)), DecimalUtil.stringToDec("999999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCANTINV");
                              GX_FocusControl = edtavCantinv_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV20CantInv = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCantinv_Internalname, GXutil.ltrimstr( AV20CantInv, 12, 2));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCANTINV"+"_"+sGXsfl_43_idx, getSecureSignedToken( sPrefix+sGXsfl_43_idx, localUtil.format( AV20CantInv, "ZZZZZZZZ9.99")));
                           }
                           else
                           {
                              AV20CantInv = localUtil.ctond( httpContext.cgiGet( edtavCantinv_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCantinv_Internalname, GXutil.ltrimstr( AV20CantInv, 12, 2));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCANTINV"+"_"+sGXsfl_43_idx, getSecureSignedToken( sPrefix+sGXsfl_43_idx, localUtil.format( AV20CantInv, "ZZZZZZZZ9.99")));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCompras_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCompras_Internalname)), DecimalUtil.stringToDec("999999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCOMPRAS");
                              GX_FocusControl = edtavCompras_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV21Compras = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCompras_Internalname, GXutil.ltrimstr( AV21Compras, 12, 2));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOMPRAS"+"_"+sGXsfl_43_idx, getSecureSignedToken( sPrefix+sGXsfl_43_idx, localUtil.format( AV21Compras, "ZZZZZZZZ9.99")));
                           }
                           else
                           {
                              AV21Compras = localUtil.ctond( httpContext.cgiGet( edtavCompras_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCompras_Internalname, GXutil.ltrimstr( AV21Compras, 12, 2));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOMPRAS"+"_"+sGXsfl_43_idx, getSecureSignedToken( sPrefix+sGXsfl_43_idx, localUtil.format( AV21Compras, "ZZZZZZZZ9.99")));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavConsumos_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavConsumos_Internalname)), DecimalUtil.stringToDec("999999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCONSUMOS");
                              GX_FocusControl = edtavConsumos_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV22Consumos = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavConsumos_Internalname, GXutil.ltrimstr( AV22Consumos, 12, 2));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCONSUMOS"+"_"+sGXsfl_43_idx, getSecureSignedToken( sPrefix+sGXsfl_43_idx, localUtil.format( AV22Consumos, "ZZZZZZZZ9.99")));
                           }
                           else
                           {
                              AV22Consumos = localUtil.ctond( httpContext.cgiGet( edtavConsumos_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavConsumos_Internalname, GXutil.ltrimstr( AV22Consumos, 12, 2));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCONSUMOS"+"_"+sGXsfl_43_idx, getSecureSignedToken( sPrefix+sGXsfl_43_idx, localUtil.format( AV22Consumos, "ZZZZZZZZ9.99")));
                           }
                           if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPrdexialm_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPrdexialm_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPRDEXIALM");
                              GX_FocusControl = edtavPrdexialm_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV23PrdExiAlm = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPrdexialm_Internalname, GXutil.ltrimstr( AV23PrdExiAlm, 12, 4));
                           }
                           else
                           {
                              AV23PrdExiAlm = localUtil.ctond( httpContext.cgiGet( edtavPrdexialm_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPrdexialm_Internalname, GXutil.ltrimstr( AV23PrdExiAlm, 12, 4));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCantpesada_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCantpesada_Internalname)), DecimalUtil.stringToDec("999999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCANTPESADA");
                              GX_FocusControl = edtavCantpesada_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV24CantPesada = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCantpesada_Internalname, GXutil.ltrimstr( AV24CantPesada, 12, 2));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCANTPESADA"+"_"+sGXsfl_43_idx, getSecureSignedToken( sPrefix+sGXsfl_43_idx, localUtil.format( AV24CantPesada, "ZZZZZZZZ9.99")));
                           }
                           else
                           {
                              AV24CantPesada = localUtil.ctond( httpContext.cgiGet( edtavCantpesada_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCantpesada_Internalname, GXutil.ltrimstr( AV24CantPesada, 12, 2));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCANTPESADA"+"_"+sGXsfl_43_idx, getSecureSignedToken( sPrefix+sGXsfl_43_idx, localUtil.format( AV24CantPesada, "ZZZZZZZZ9.99")));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavStocktotal_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavStocktotal_Internalname)), DecimalUtil.stringToDec("999999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vSTOCKTOTAL");
                              GX_FocusControl = edtavStocktotal_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV25stockTotal = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavStocktotal_Internalname, GXutil.ltrimstr( AV25stockTotal, 12, 2));
                           }
                           else
                           {
                              AV25stockTotal = localUtil.ctond( httpContext.cgiGet( edtavStocktotal_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavStocktotal_Internalname, GXutil.ltrimstr( AV25stockTotal, 12, 2));
                           }
                           if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPrdcanres_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPrdcanres_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPRDCANRES");
                              GX_FocusControl = edtavPrdcanres_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV26PrdCanRes = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPrdcanres_Internalname, GXutil.ltrimstr( AV26PrdCanRes, 12, 4));
                           }
                           else
                           {
                              AV26PrdCanRes = localUtil.ctond( httpContext.cgiGet( edtavPrdcanres_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPrdcanres_Internalname, GXutil.ltrimstr( AV26PrdCanRes, 12, 4));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavStockdisponible_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavStockdisponible_Internalname)), DecimalUtil.stringToDec("999999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vSTOCKDISPONIBLE");
                              GX_FocusControl = edtavStockdisponible_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV27StockDisponible = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavStockdisponible_Internalname, GXutil.ltrimstr( AV27StockDisponible, 12, 2));
                           }
                           else
                           {
                              AV27StockDisponible = localUtil.ctond( httpContext.cgiGet( edtavStockdisponible_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavStockdisponible_Internalname, GXutil.ltrimstr( AV27StockDisponible, 12, 2));
                           }
                           A724PrdPreAct = localUtil.ctond( httpContext.cgiGet( edtPrdPreAct_Internalname)) ;
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavValor0_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavValor0_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vVALOR0");
                              GX_FocusControl = edtavValor0_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV59valor0 = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavValor0_Internalname, GXutil.ltrimstr( AV59valor0, 10, 2));
                           }
                           else
                           {
                              AV59valor0 = localUtil.ctond( httpContext.cgiGet( edtavValor0_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavValor0_Internalname, GXutil.ltrimstr( AV59valor0, 10, 2));
                           }
                           A795PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( edtPrvNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A794PrvNom = httpContext.cgiGet( edtPrvNom_Internalname) ;
                           n794PrvNom = false ;
                           A10881PrdLote = httpContext.cgiGet( edtPrdLote_Internalname) ;
                           A856ValCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtValCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
                                       e1913W2 ();
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
                                       e2013W2 ();
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
                                       e2113W2 ();
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
                                          if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV19FilterFullText) != 0 )
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
                                    strup13W0( ) ;
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
                     if ( nCmpId == 70 )
                     {
                        OldGrid_dwc = httpContext.cgiGet( sPrefix+"W0070") ;
                        if ( ( GXutil.len( OldGrid_dwc) == 0 ) || ( GXutil.strcmp(OldGrid_dwc, WebComp_Grid_dwc_Component) != 0 ) )
                        {
                           WebComp_Grid_dwc = WebUtils.getWebComponent(getClass(), "app." + OldGrid_dwc + "_impl", remoteHandle, context);
                           WebComp_Grid_dwc_Component = OldGrid_dwc ;
                        }
                        if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
                        {
                           WebComp_Grid_dwc.componentprocess(sPrefix+"W0070", "", sEvt);
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

   public void we13W2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm13W2( ) ;
         }
      }
   }

   public void pa13W2( )
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
      subsflControlProps_432( ) ;
      while ( nGXsfl_43_idx <= nRC_GXsfl_43 )
      {
         sendrow_432( ) ;
         nGXsfl_43_idx = ((subGrid_Islastpage==1)&&(nGXsfl_43_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_43_idx+1) ;
         sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_432( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV19FilterFullText ,
                                 String AV5Emprcod ,
                                 String AV6Prdnum ,
                                 String AV7Prdnum_to ,
                                 short AV72ValCodfrom ,
                                 short AV73ValCodto ,
                                 byte AV37ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV32ColumnsSelector ,
                                 String AV38TFPrdNum ,
                                 String AV39TFPrdNum_Sel ,
                                 String AV40TFPrdNom ,
                                 String AV41TFPrdNom_Sel ,
                                 String AV42TFTipPrdDsc ,
                                 String AV43TFTipPrdDsc_Sel ,
                                 String AV44TFPrdRefPrv ,
                                 String AV45TFPrdRefPrv_Sel ,
                                 String AV46TFPrdUbicacion ,
                                 String AV47TFPrdUbicacion_Sel ,
                                 java.math.BigDecimal AV48TFPrdStkMinU ,
                                 java.math.BigDecimal AV49TFPrdStkMinU_To ,
                                 java.math.BigDecimal AV60TFPrdPreAct ,
                                 java.math.BigDecimal AV61TFPrdPreAct_To ,
                                 int AV62TFPrvNum ,
                                 int AV63TFPrvNum_To ,
                                 String AV64TFPrvNom ,
                                 String AV65TFPrvNom_Sel ,
                                 String AV70TFPrdLote ,
                                 String AV71TFPrdLote_Sel ,
                                 byte AV74TFValCod ,
                                 byte AV75TFValCod_To ,
                                 String AV78Pgmname ,
                                 short AV16OrderedBy ,
                                 boolean AV17OrderedDsc ,
                                 byte AV8Seleccion ,
                                 java.math.BigDecimal AV20CantInv ,
                                 java.math.BigDecimal AV21Compras ,
                                 java.math.BigDecimal AV22Consumos ,
                                 java.math.BigDecimal AV54compras2 ,
                                 java.math.BigDecimal AV55consumos2 ,
                                 String AV56obsp ,
                                 java.math.BigDecimal AV57cantRes ,
                                 java.math.BigDecimal AV24CantPesada ,
                                 java.math.BigDecimal AV68Cantpdte ,
                                 String AV58InciCPEDID ,
                                 String A396EmprCod ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e2013W2 ();
      GRID_nCurrentRecord = 0 ;
      rf13W2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"WCWWkp89");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV78Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("wcwwkp89:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCANTINV", getSecureSignedToken( sPrefix, localUtil.format( AV20CantInv, "ZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCANTINV", GXutil.ltrim( localUtil.ntoc( AV20CantInv, (byte)(12), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOMPRAS", getSecureSignedToken( sPrefix, localUtil.format( AV21Compras, "ZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCOMPRAS", GXutil.ltrim( localUtil.ntoc( AV21Compras, (byte)(12), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCONSUMOS", getSecureSignedToken( sPrefix, localUtil.format( AV22Consumos, "ZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCONSUMOS", GXutil.ltrim( localUtil.ntoc( AV22Consumos, (byte)(12), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCANTPESADA", getSecureSignedToken( sPrefix, localUtil.format( AV24CantPesada, "ZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCANTPESADA", GXutil.ltrim( localUtil.ntoc( AV24CantPesada, (byte)(12), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_PRDNUM", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A719PrdNum, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PRDNUM", GXutil.rtrim( A719PrdNum));
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
      rf13W2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV78Pgmname = "WCWWkp89" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78Pgmname", AV78Pgmname);
      Gx_err = (short)(0) ;
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavCantinv_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCantinv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCantinv_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavCompras_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCompras_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCompras_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavConsumos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavConsumos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavConsumos_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavPrdexialm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrdexialm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdexialm_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavCantpesada_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCantpesada_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCantpesada_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavStocktotal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavStocktotal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavStocktotal_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavPrdcanres_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrdcanres_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdcanres_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavStockdisponible_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavStockdisponible_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavStockdisponible_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavValor0_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavValor0_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavValor0_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf13W2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(43) ;
      /* Execute user event: Refresh */
      e2013W2 ();
      nGXsfl_43_idx = 1 ;
      sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_432( ) ;
      bGXsfl_43_Refreshing = true ;
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
         subsflControlProps_432( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV82Wcwwkp89ds_1_filterfulltext ,
                                              AV84Wcwwkp89ds_3_tfprdnum_sel ,
                                              AV83Wcwwkp89ds_2_tfprdnum ,
                                              AV86Wcwwkp89ds_5_tfprdnom_sel ,
                                              AV85Wcwwkp89ds_4_tfprdnom ,
                                              AV88Wcwwkp89ds_7_tftipprddsc_sel ,
                                              AV87Wcwwkp89ds_6_tftipprddsc ,
                                              AV90Wcwwkp89ds_9_tfprdrefprv_sel ,
                                              AV89Wcwwkp89ds_8_tfprdrefprv ,
                                              AV92Wcwwkp89ds_11_tfprdubicacion_sel ,
                                              AV91Wcwwkp89ds_10_tfprdubicacion ,
                                              AV93Wcwwkp89ds_12_tfprdstkminu ,
                                              AV94Wcwwkp89ds_13_tfprdstkminu_to ,
                                              AV95Wcwwkp89ds_14_tfprdpreact ,
                                              AV96Wcwwkp89ds_15_tfprdpreact_to ,
                                              Integer.valueOf(AV97Wcwwkp89ds_16_tfprvnum) ,
                                              Integer.valueOf(AV98Wcwwkp89ds_17_tfprvnum_to) ,
                                              AV100Wcwwkp89ds_19_tfprvnom_sel ,
                                              AV99Wcwwkp89ds_18_tfprvnom ,
                                              AV102Wcwwkp89ds_21_tfprdlote_sel ,
                                              AV101Wcwwkp89ds_20_tfprdlote ,
                                              Byte.valueOf(AV103Wcwwkp89ds_22_tfvalcod) ,
                                              Byte.valueOf(AV104Wcwwkp89ds_23_tfvalcod_to) ,
                                              Short.valueOf(AV72ValCodfrom) ,
                                              Short.valueOf(AV73ValCodto) ,
                                              A719PrdNum ,
                                              A718PrdNom ,
                                              A6302TipPrdDsc ,
                                              A728PrdRefPrv ,
                                              A13457PrdUbicaci ,
                                              A732PrdStkMinU ,
                                              A724PrdPreAct ,
                                              Integer.valueOf(A795PrvNum) ,
                                              A794PrvNom ,
                                              A10881PrdLote ,
                                              Byte.valueOf(A856ValCod) ,
                                              Short.valueOf(AV16OrderedBy) ,
                                              Boolean.valueOf(AV17OrderedDsc) ,
                                              AV5Emprcod ,
                                              AV6Prdnum ,
                                              A396EmprCod ,
                                              AV7Prdnum_to } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV82Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV82Wcwwkp89ds_1_filterfulltext), "%", "") ;
         lV82Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV82Wcwwkp89ds_1_filterfulltext), "%", "") ;
         lV82Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV82Wcwwkp89ds_1_filterfulltext), "%", "") ;
         lV82Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV82Wcwwkp89ds_1_filterfulltext), "%", "") ;
         lV82Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV82Wcwwkp89ds_1_filterfulltext), "%", "") ;
         lV82Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV82Wcwwkp89ds_1_filterfulltext), "%", "") ;
         lV82Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV82Wcwwkp89ds_1_filterfulltext), "%", "") ;
         lV82Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV82Wcwwkp89ds_1_filterfulltext), "%", "") ;
         lV82Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV82Wcwwkp89ds_1_filterfulltext), "%", "") ;
         lV82Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV82Wcwwkp89ds_1_filterfulltext), "%", "") ;
         lV82Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV82Wcwwkp89ds_1_filterfulltext), "%", "") ;
         lV83Wcwwkp89ds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV83Wcwwkp89ds_2_tfprdnum), 6, "%") ;
         lV85Wcwwkp89ds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV85Wcwwkp89ds_4_tfprdnom), 26, "%") ;
         lV87Wcwwkp89ds_6_tftipprddsc = GXutil.padr( GXutil.rtrim( AV87Wcwwkp89ds_6_tftipprddsc), 40, "%") ;
         lV89Wcwwkp89ds_8_tfprdrefprv = GXutil.padr( GXutil.rtrim( AV89Wcwwkp89ds_8_tfprdrefprv), 30, "%") ;
         lV91Wcwwkp89ds_10_tfprdubicacion = GXutil.padr( GXutil.rtrim( AV91Wcwwkp89ds_10_tfprdubicacion), 20, "%") ;
         lV99Wcwwkp89ds_18_tfprvnom = GXutil.padr( GXutil.rtrim( AV99Wcwwkp89ds_18_tfprvnom), 30, "%") ;
         lV101Wcwwkp89ds_20_tfprdlote = GXutil.padr( GXutil.rtrim( AV101Wcwwkp89ds_20_tfprdlote), 26, "%") ;
         /* Using cursor H013W2 */
         pr_default.execute(0, new Object[] {AV5Emprcod, AV6Prdnum, AV7Prdnum_to, lV82Wcwwkp89ds_1_filterfulltext, lV82Wcwwkp89ds_1_filterfulltext, lV82Wcwwkp89ds_1_filterfulltext, lV82Wcwwkp89ds_1_filterfulltext, lV82Wcwwkp89ds_1_filterfulltext, lV82Wcwwkp89ds_1_filterfulltext, lV82Wcwwkp89ds_1_filterfulltext, lV82Wcwwkp89ds_1_filterfulltext, lV82Wcwwkp89ds_1_filterfulltext, lV82Wcwwkp89ds_1_filterfulltext, lV82Wcwwkp89ds_1_filterfulltext, lV83Wcwwkp89ds_2_tfprdnum, AV84Wcwwkp89ds_3_tfprdnum_sel, lV85Wcwwkp89ds_4_tfprdnom, AV86Wcwwkp89ds_5_tfprdnom_sel, lV87Wcwwkp89ds_6_tftipprddsc, AV88Wcwwkp89ds_7_tftipprddsc_sel, lV89Wcwwkp89ds_8_tfprdrefprv, AV90Wcwwkp89ds_9_tfprdrefprv_sel, lV91Wcwwkp89ds_10_tfprdubicacion, AV92Wcwwkp89ds_11_tfprdubicacion_sel, AV93Wcwwkp89ds_12_tfprdstkminu, AV94Wcwwkp89ds_13_tfprdstkminu_to, AV95Wcwwkp89ds_14_tfprdpreact, AV96Wcwwkp89ds_15_tfprdpreact_to, Integer.valueOf(AV97Wcwwkp89ds_16_tfprvnum), Integer.valueOf(AV98Wcwwkp89ds_17_tfprvnum_to), lV99Wcwwkp89ds_18_tfprvnom, AV100Wcwwkp89ds_19_tfprvnom_sel, lV101Wcwwkp89ds_20_tfprdlote, AV102Wcwwkp89ds_21_tfprdlote_sel, Byte.valueOf(AV103Wcwwkp89ds_22_tfvalcod), Byte.valueOf(AV104Wcwwkp89ds_23_tfvalcod_to), Short.valueOf(AV72ValCodfrom), Short.valueOf(AV73ValCodto), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_43_idx = 1 ;
         sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_432( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A6301TipPrdCod = H013W2_A6301TipPrdCod[0] ;
            n6301TipPrdCod = H013W2_n6301TipPrdCod[0] ;
            A396EmprCod = H013W2_A396EmprCod[0] ;
            A704PrdExiAlm = H013W2_A704PrdExiAlm[0] ;
            A685PrdCanRes = H013W2_A685PrdCanRes[0] ;
            A856ValCod = H013W2_A856ValCod[0] ;
            A10881PrdLote = H013W2_A10881PrdLote[0] ;
            A794PrvNom = H013W2_A794PrvNom[0] ;
            n794PrvNom = H013W2_n794PrvNom[0] ;
            A795PrvNum = H013W2_A795PrvNum[0] ;
            A724PrdPreAct = H013W2_A724PrdPreAct[0] ;
            A732PrdStkMinU = H013W2_A732PrdStkMinU[0] ;
            A13457PrdUbicaci = H013W2_A13457PrdUbicaci[0] ;
            A728PrdRefPrv = H013W2_A728PrdRefPrv[0] ;
            A6302TipPrdDsc = H013W2_A6302TipPrdDsc[0] ;
            n6302TipPrdDsc = H013W2_n6302TipPrdDsc[0] ;
            A718PrdNom = H013W2_A718PrdNom[0] ;
            A719PrdNum = H013W2_A719PrdNum[0] ;
            A6302TipPrdDsc = H013W2_A6302TipPrdDsc[0] ;
            n6302TipPrdDsc = H013W2_n6302TipPrdDsc[0] ;
            A794PrvNom = H013W2_A794PrvNom[0] ;
            n794PrvNom = H013W2_n794PrvNom[0] ;
            e2113W2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(43) ;
         wb13W0( ) ;
      }
      bGXsfl_43_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes13W2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCANTINV"+"_"+sGXsfl_43_idx, getSecureSignedToken( sPrefix+sGXsfl_43_idx, localUtil.format( AV20CantInv, "ZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOMPRAS"+"_"+sGXsfl_43_idx, getSecureSignedToken( sPrefix+sGXsfl_43_idx, localUtil.format( AV21Compras, "ZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCONSUMOS"+"_"+sGXsfl_43_idx, getSecureSignedToken( sPrefix+sGXsfl_43_idx, localUtil.format( AV22Consumos, "ZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCOMPRAS2", GXutil.ltrim( localUtil.ntoc( AV54compras2, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOMPRAS2", getSecureSignedToken( sPrefix, localUtil.format( AV54compras2, "ZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCONSUMOS2", GXutil.ltrim( localUtil.ntoc( AV55consumos2, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCONSUMOS2", getSecureSignedToken( sPrefix, localUtil.format( AV55consumos2, "ZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vOBSP", GXutil.rtrim( AV56obsp));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vOBSP", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV56obsp, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCANTRES", GXutil.ltrim( localUtil.ntoc( AV57cantRes, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCANTRES", getSecureSignedToken( sPrefix, localUtil.format( AV57cantRes, "ZZZZZZZ9.999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCANTPESADA"+"_"+sGXsfl_43_idx, getSecureSignedToken( sPrefix+sGXsfl_43_idx, localUtil.format( AV24CantPesada, "ZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCANTPDTE", GXutil.ltrim( localUtil.ntoc( AV68Cantpdte, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCANTPDTE", getSecureSignedToken( sPrefix, localUtil.format( AV68Cantpdte, "ZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vINCICPEDID", GXutil.rtrim( AV58InciCPEDID));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vINCICPEDID", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV58InciCPEDID, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_PRDNUM"+"_"+sGXsfl_43_idx, getSecureSignedToken( sPrefix+sGXsfl_43_idx, GXutil.rtrim( localUtil.format( A719PrdNum, ""))));
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
      AV82Wcwwkp89ds_1_filterfulltext = AV19FilterFullText ;
      AV83Wcwwkp89ds_2_tfprdnum = AV38TFPrdNum ;
      AV84Wcwwkp89ds_3_tfprdnum_sel = AV39TFPrdNum_Sel ;
      AV85Wcwwkp89ds_4_tfprdnom = AV40TFPrdNom ;
      AV86Wcwwkp89ds_5_tfprdnom_sel = AV41TFPrdNom_Sel ;
      AV87Wcwwkp89ds_6_tftipprddsc = AV42TFTipPrdDsc ;
      AV88Wcwwkp89ds_7_tftipprddsc_sel = AV43TFTipPrdDsc_Sel ;
      AV89Wcwwkp89ds_8_tfprdrefprv = AV44TFPrdRefPrv ;
      AV90Wcwwkp89ds_9_tfprdrefprv_sel = AV45TFPrdRefPrv_Sel ;
      AV91Wcwwkp89ds_10_tfprdubicacion = AV46TFPrdUbicacion ;
      AV92Wcwwkp89ds_11_tfprdubicacion_sel = AV47TFPrdUbicacion_Sel ;
      AV93Wcwwkp89ds_12_tfprdstkminu = AV48TFPrdStkMinU ;
      AV94Wcwwkp89ds_13_tfprdstkminu_to = AV49TFPrdStkMinU_To ;
      AV95Wcwwkp89ds_14_tfprdpreact = AV60TFPrdPreAct ;
      AV96Wcwwkp89ds_15_tfprdpreact_to = AV61TFPrdPreAct_To ;
      AV97Wcwwkp89ds_16_tfprvnum = AV62TFPrvNum ;
      AV98Wcwwkp89ds_17_tfprvnum_to = AV63TFPrvNum_To ;
      AV99Wcwwkp89ds_18_tfprvnom = AV64TFPrvNom ;
      AV100Wcwwkp89ds_19_tfprvnom_sel = AV65TFPrvNom_Sel ;
      AV101Wcwwkp89ds_20_tfprdlote = AV70TFPrdLote ;
      AV102Wcwwkp89ds_21_tfprdlote_sel = AV71TFPrdLote_Sel ;
      AV103Wcwwkp89ds_22_tfvalcod = AV74TFValCod ;
      AV104Wcwwkp89ds_23_tfvalcod_to = AV75TFValCod_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV82Wcwwkp89ds_1_filterfulltext ,
                                           AV84Wcwwkp89ds_3_tfprdnum_sel ,
                                           AV83Wcwwkp89ds_2_tfprdnum ,
                                           AV86Wcwwkp89ds_5_tfprdnom_sel ,
                                           AV85Wcwwkp89ds_4_tfprdnom ,
                                           AV88Wcwwkp89ds_7_tftipprddsc_sel ,
                                           AV87Wcwwkp89ds_6_tftipprddsc ,
                                           AV90Wcwwkp89ds_9_tfprdrefprv_sel ,
                                           AV89Wcwwkp89ds_8_tfprdrefprv ,
                                           AV92Wcwwkp89ds_11_tfprdubicacion_sel ,
                                           AV91Wcwwkp89ds_10_tfprdubicacion ,
                                           AV93Wcwwkp89ds_12_tfprdstkminu ,
                                           AV94Wcwwkp89ds_13_tfprdstkminu_to ,
                                           AV95Wcwwkp89ds_14_tfprdpreact ,
                                           AV96Wcwwkp89ds_15_tfprdpreact_to ,
                                           Integer.valueOf(AV97Wcwwkp89ds_16_tfprvnum) ,
                                           Integer.valueOf(AV98Wcwwkp89ds_17_tfprvnum_to) ,
                                           AV100Wcwwkp89ds_19_tfprvnom_sel ,
                                           AV99Wcwwkp89ds_18_tfprvnom ,
                                           AV102Wcwwkp89ds_21_tfprdlote_sel ,
                                           AV101Wcwwkp89ds_20_tfprdlote ,
                                           Byte.valueOf(AV103Wcwwkp89ds_22_tfvalcod) ,
                                           Byte.valueOf(AV104Wcwwkp89ds_23_tfvalcod_to) ,
                                           Short.valueOf(AV72ValCodfrom) ,
                                           Short.valueOf(AV73ValCodto) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A6302TipPrdDsc ,
                                           A728PrdRefPrv ,
                                           A13457PrdUbicaci ,
                                           A732PrdStkMinU ,
                                           A724PrdPreAct ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A10881PrdLote ,
                                           Byte.valueOf(A856ValCod) ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV5Emprcod ,
                                           AV6Prdnum ,
                                           A396EmprCod ,
                                           AV7Prdnum_to } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV82Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV82Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV82Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV82Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV82Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV82Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV82Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV82Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV82Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV82Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV82Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV82Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV82Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV82Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV82Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV82Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV82Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV82Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV82Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV82Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV82Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV82Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV83Wcwwkp89ds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV83Wcwwkp89ds_2_tfprdnum), 6, "%") ;
      lV85Wcwwkp89ds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV85Wcwwkp89ds_4_tfprdnom), 26, "%") ;
      lV87Wcwwkp89ds_6_tftipprddsc = GXutil.padr( GXutil.rtrim( AV87Wcwwkp89ds_6_tftipprddsc), 40, "%") ;
      lV89Wcwwkp89ds_8_tfprdrefprv = GXutil.padr( GXutil.rtrim( AV89Wcwwkp89ds_8_tfprdrefprv), 30, "%") ;
      lV91Wcwwkp89ds_10_tfprdubicacion = GXutil.padr( GXutil.rtrim( AV91Wcwwkp89ds_10_tfprdubicacion), 20, "%") ;
      lV99Wcwwkp89ds_18_tfprvnom = GXutil.padr( GXutil.rtrim( AV99Wcwwkp89ds_18_tfprvnom), 30, "%") ;
      lV101Wcwwkp89ds_20_tfprdlote = GXutil.padr( GXutil.rtrim( AV101Wcwwkp89ds_20_tfprdlote), 26, "%") ;
      /* Using cursor H013W3 */
      pr_default.execute(1, new Object[] {AV5Emprcod, AV6Prdnum, AV7Prdnum_to, lV82Wcwwkp89ds_1_filterfulltext, lV82Wcwwkp89ds_1_filterfulltext, lV82Wcwwkp89ds_1_filterfulltext, lV82Wcwwkp89ds_1_filterfulltext, lV82Wcwwkp89ds_1_filterfulltext, lV82Wcwwkp89ds_1_filterfulltext, lV82Wcwwkp89ds_1_filterfulltext, lV82Wcwwkp89ds_1_filterfulltext, lV82Wcwwkp89ds_1_filterfulltext, lV82Wcwwkp89ds_1_filterfulltext, lV82Wcwwkp89ds_1_filterfulltext, lV83Wcwwkp89ds_2_tfprdnum, AV84Wcwwkp89ds_3_tfprdnum_sel, lV85Wcwwkp89ds_4_tfprdnom, AV86Wcwwkp89ds_5_tfprdnom_sel, lV87Wcwwkp89ds_6_tftipprddsc, AV88Wcwwkp89ds_7_tftipprddsc_sel, lV89Wcwwkp89ds_8_tfprdrefprv, AV90Wcwwkp89ds_9_tfprdrefprv_sel, lV91Wcwwkp89ds_10_tfprdubicacion, AV92Wcwwkp89ds_11_tfprdubicacion_sel, AV93Wcwwkp89ds_12_tfprdstkminu, AV94Wcwwkp89ds_13_tfprdstkminu_to, AV95Wcwwkp89ds_14_tfprdpreact, AV96Wcwwkp89ds_15_tfprdpreact_to, Integer.valueOf(AV97Wcwwkp89ds_16_tfprvnum), Integer.valueOf(AV98Wcwwkp89ds_17_tfprvnum_to), lV99Wcwwkp89ds_18_tfprvnom, AV100Wcwwkp89ds_19_tfprvnom_sel, lV101Wcwwkp89ds_20_tfprdlote, AV102Wcwwkp89ds_21_tfprdlote_sel, Byte.valueOf(AV103Wcwwkp89ds_22_tfvalcod), Byte.valueOf(AV104Wcwwkp89ds_23_tfvalcod_to), Short.valueOf(AV72ValCodfrom), Short.valueOf(AV73ValCodto)});
      GRID_nRecordCount = H013W3_AGRID_nRecordCount[0] ;
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
      AV82Wcwwkp89ds_1_filterfulltext = AV19FilterFullText ;
      AV83Wcwwkp89ds_2_tfprdnum = AV38TFPrdNum ;
      AV84Wcwwkp89ds_3_tfprdnum_sel = AV39TFPrdNum_Sel ;
      AV85Wcwwkp89ds_4_tfprdnom = AV40TFPrdNom ;
      AV86Wcwwkp89ds_5_tfprdnom_sel = AV41TFPrdNom_Sel ;
      AV87Wcwwkp89ds_6_tftipprddsc = AV42TFTipPrdDsc ;
      AV88Wcwwkp89ds_7_tftipprddsc_sel = AV43TFTipPrdDsc_Sel ;
      AV89Wcwwkp89ds_8_tfprdrefprv = AV44TFPrdRefPrv ;
      AV90Wcwwkp89ds_9_tfprdrefprv_sel = AV45TFPrdRefPrv_Sel ;
      AV91Wcwwkp89ds_10_tfprdubicacion = AV46TFPrdUbicacion ;
      AV92Wcwwkp89ds_11_tfprdubicacion_sel = AV47TFPrdUbicacion_Sel ;
      AV93Wcwwkp89ds_12_tfprdstkminu = AV48TFPrdStkMinU ;
      AV94Wcwwkp89ds_13_tfprdstkminu_to = AV49TFPrdStkMinU_To ;
      AV95Wcwwkp89ds_14_tfprdpreact = AV60TFPrdPreAct ;
      AV96Wcwwkp89ds_15_tfprdpreact_to = AV61TFPrdPreAct_To ;
      AV97Wcwwkp89ds_16_tfprvnum = AV62TFPrvNum ;
      AV98Wcwwkp89ds_17_tfprvnum_to = AV63TFPrvNum_To ;
      AV99Wcwwkp89ds_18_tfprvnom = AV64TFPrvNom ;
      AV100Wcwwkp89ds_19_tfprvnom_sel = AV65TFPrvNom_Sel ;
      AV101Wcwwkp89ds_20_tfprdlote = AV70TFPrdLote ;
      AV102Wcwwkp89ds_21_tfprdlote_sel = AV71TFPrdLote_Sel ;
      AV103Wcwwkp89ds_22_tfvalcod = AV74TFValCod ;
      AV104Wcwwkp89ds_23_tfvalcod_to = AV75TFValCod_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV19FilterFullText, AV5Emprcod, AV6Prdnum, AV7Prdnum_to, AV72ValCodfrom, AV73ValCodto, AV37ManageFiltersExecutionStep, AV32ColumnsSelector, AV38TFPrdNum, AV39TFPrdNum_Sel, AV40TFPrdNom, AV41TFPrdNom_Sel, AV42TFTipPrdDsc, AV43TFTipPrdDsc_Sel, AV44TFPrdRefPrv, AV45TFPrdRefPrv_Sel, AV46TFPrdUbicacion, AV47TFPrdUbicacion_Sel, AV48TFPrdStkMinU, AV49TFPrdStkMinU_To, AV60TFPrdPreAct, AV61TFPrdPreAct_To, AV62TFPrvNum, AV63TFPrvNum_To, AV64TFPrvNom, AV65TFPrvNom_Sel, AV70TFPrdLote, AV71TFPrdLote_Sel, AV74TFValCod, AV75TFValCod_To, AV78Pgmname, AV16OrderedBy, AV17OrderedDsc, AV8Seleccion, AV20CantInv, AV21Compras, AV22Consumos, AV54compras2, AV55consumos2, AV56obsp, AV57cantRes, AV24CantPesada, AV68Cantpdte, AV58InciCPEDID, A396EmprCod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV82Wcwwkp89ds_1_filterfulltext = AV19FilterFullText ;
      AV83Wcwwkp89ds_2_tfprdnum = AV38TFPrdNum ;
      AV84Wcwwkp89ds_3_tfprdnum_sel = AV39TFPrdNum_Sel ;
      AV85Wcwwkp89ds_4_tfprdnom = AV40TFPrdNom ;
      AV86Wcwwkp89ds_5_tfprdnom_sel = AV41TFPrdNom_Sel ;
      AV87Wcwwkp89ds_6_tftipprddsc = AV42TFTipPrdDsc ;
      AV88Wcwwkp89ds_7_tftipprddsc_sel = AV43TFTipPrdDsc_Sel ;
      AV89Wcwwkp89ds_8_tfprdrefprv = AV44TFPrdRefPrv ;
      AV90Wcwwkp89ds_9_tfprdrefprv_sel = AV45TFPrdRefPrv_Sel ;
      AV91Wcwwkp89ds_10_tfprdubicacion = AV46TFPrdUbicacion ;
      AV92Wcwwkp89ds_11_tfprdubicacion_sel = AV47TFPrdUbicacion_Sel ;
      AV93Wcwwkp89ds_12_tfprdstkminu = AV48TFPrdStkMinU ;
      AV94Wcwwkp89ds_13_tfprdstkminu_to = AV49TFPrdStkMinU_To ;
      AV95Wcwwkp89ds_14_tfprdpreact = AV60TFPrdPreAct ;
      AV96Wcwwkp89ds_15_tfprdpreact_to = AV61TFPrdPreAct_To ;
      AV97Wcwwkp89ds_16_tfprvnum = AV62TFPrvNum ;
      AV98Wcwwkp89ds_17_tfprvnum_to = AV63TFPrvNum_To ;
      AV99Wcwwkp89ds_18_tfprvnom = AV64TFPrvNom ;
      AV100Wcwwkp89ds_19_tfprvnom_sel = AV65TFPrvNom_Sel ;
      AV101Wcwwkp89ds_20_tfprdlote = AV70TFPrdLote ;
      AV102Wcwwkp89ds_21_tfprdlote_sel = AV71TFPrdLote_Sel ;
      AV103Wcwwkp89ds_22_tfvalcod = AV74TFValCod ;
      AV104Wcwwkp89ds_23_tfvalcod_to = AV75TFValCod_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV19FilterFullText, AV5Emprcod, AV6Prdnum, AV7Prdnum_to, AV72ValCodfrom, AV73ValCodto, AV37ManageFiltersExecutionStep, AV32ColumnsSelector, AV38TFPrdNum, AV39TFPrdNum_Sel, AV40TFPrdNom, AV41TFPrdNom_Sel, AV42TFTipPrdDsc, AV43TFTipPrdDsc_Sel, AV44TFPrdRefPrv, AV45TFPrdRefPrv_Sel, AV46TFPrdUbicacion, AV47TFPrdUbicacion_Sel, AV48TFPrdStkMinU, AV49TFPrdStkMinU_To, AV60TFPrdPreAct, AV61TFPrdPreAct_To, AV62TFPrvNum, AV63TFPrvNum_To, AV64TFPrvNom, AV65TFPrvNom_Sel, AV70TFPrdLote, AV71TFPrdLote_Sel, AV74TFValCod, AV75TFValCod_To, AV78Pgmname, AV16OrderedBy, AV17OrderedDsc, AV8Seleccion, AV20CantInv, AV21Compras, AV22Consumos, AV54compras2, AV55consumos2, AV56obsp, AV57cantRes, AV24CantPesada, AV68Cantpdte, AV58InciCPEDID, A396EmprCod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV82Wcwwkp89ds_1_filterfulltext = AV19FilterFullText ;
      AV83Wcwwkp89ds_2_tfprdnum = AV38TFPrdNum ;
      AV84Wcwwkp89ds_3_tfprdnum_sel = AV39TFPrdNum_Sel ;
      AV85Wcwwkp89ds_4_tfprdnom = AV40TFPrdNom ;
      AV86Wcwwkp89ds_5_tfprdnom_sel = AV41TFPrdNom_Sel ;
      AV87Wcwwkp89ds_6_tftipprddsc = AV42TFTipPrdDsc ;
      AV88Wcwwkp89ds_7_tftipprddsc_sel = AV43TFTipPrdDsc_Sel ;
      AV89Wcwwkp89ds_8_tfprdrefprv = AV44TFPrdRefPrv ;
      AV90Wcwwkp89ds_9_tfprdrefprv_sel = AV45TFPrdRefPrv_Sel ;
      AV91Wcwwkp89ds_10_tfprdubicacion = AV46TFPrdUbicacion ;
      AV92Wcwwkp89ds_11_tfprdubicacion_sel = AV47TFPrdUbicacion_Sel ;
      AV93Wcwwkp89ds_12_tfprdstkminu = AV48TFPrdStkMinU ;
      AV94Wcwwkp89ds_13_tfprdstkminu_to = AV49TFPrdStkMinU_To ;
      AV95Wcwwkp89ds_14_tfprdpreact = AV60TFPrdPreAct ;
      AV96Wcwwkp89ds_15_tfprdpreact_to = AV61TFPrdPreAct_To ;
      AV97Wcwwkp89ds_16_tfprvnum = AV62TFPrvNum ;
      AV98Wcwwkp89ds_17_tfprvnum_to = AV63TFPrvNum_To ;
      AV99Wcwwkp89ds_18_tfprvnom = AV64TFPrvNom ;
      AV100Wcwwkp89ds_19_tfprvnom_sel = AV65TFPrvNom_Sel ;
      AV101Wcwwkp89ds_20_tfprdlote = AV70TFPrdLote ;
      AV102Wcwwkp89ds_21_tfprdlote_sel = AV71TFPrdLote_Sel ;
      AV103Wcwwkp89ds_22_tfvalcod = AV74TFValCod ;
      AV104Wcwwkp89ds_23_tfvalcod_to = AV75TFValCod_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV19FilterFullText, AV5Emprcod, AV6Prdnum, AV7Prdnum_to, AV72ValCodfrom, AV73ValCodto, AV37ManageFiltersExecutionStep, AV32ColumnsSelector, AV38TFPrdNum, AV39TFPrdNum_Sel, AV40TFPrdNom, AV41TFPrdNom_Sel, AV42TFTipPrdDsc, AV43TFTipPrdDsc_Sel, AV44TFPrdRefPrv, AV45TFPrdRefPrv_Sel, AV46TFPrdUbicacion, AV47TFPrdUbicacion_Sel, AV48TFPrdStkMinU, AV49TFPrdStkMinU_To, AV60TFPrdPreAct, AV61TFPrdPreAct_To, AV62TFPrvNum, AV63TFPrvNum_To, AV64TFPrvNom, AV65TFPrvNom_Sel, AV70TFPrdLote, AV71TFPrdLote_Sel, AV74TFValCod, AV75TFValCod_To, AV78Pgmname, AV16OrderedBy, AV17OrderedDsc, AV8Seleccion, AV20CantInv, AV21Compras, AV22Consumos, AV54compras2, AV55consumos2, AV56obsp, AV57cantRes, AV24CantPesada, AV68Cantpdte, AV58InciCPEDID, A396EmprCod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV82Wcwwkp89ds_1_filterfulltext = AV19FilterFullText ;
      AV83Wcwwkp89ds_2_tfprdnum = AV38TFPrdNum ;
      AV84Wcwwkp89ds_3_tfprdnum_sel = AV39TFPrdNum_Sel ;
      AV85Wcwwkp89ds_4_tfprdnom = AV40TFPrdNom ;
      AV86Wcwwkp89ds_5_tfprdnom_sel = AV41TFPrdNom_Sel ;
      AV87Wcwwkp89ds_6_tftipprddsc = AV42TFTipPrdDsc ;
      AV88Wcwwkp89ds_7_tftipprddsc_sel = AV43TFTipPrdDsc_Sel ;
      AV89Wcwwkp89ds_8_tfprdrefprv = AV44TFPrdRefPrv ;
      AV90Wcwwkp89ds_9_tfprdrefprv_sel = AV45TFPrdRefPrv_Sel ;
      AV91Wcwwkp89ds_10_tfprdubicacion = AV46TFPrdUbicacion ;
      AV92Wcwwkp89ds_11_tfprdubicacion_sel = AV47TFPrdUbicacion_Sel ;
      AV93Wcwwkp89ds_12_tfprdstkminu = AV48TFPrdStkMinU ;
      AV94Wcwwkp89ds_13_tfprdstkminu_to = AV49TFPrdStkMinU_To ;
      AV95Wcwwkp89ds_14_tfprdpreact = AV60TFPrdPreAct ;
      AV96Wcwwkp89ds_15_tfprdpreact_to = AV61TFPrdPreAct_To ;
      AV97Wcwwkp89ds_16_tfprvnum = AV62TFPrvNum ;
      AV98Wcwwkp89ds_17_tfprvnum_to = AV63TFPrvNum_To ;
      AV99Wcwwkp89ds_18_tfprvnom = AV64TFPrvNom ;
      AV100Wcwwkp89ds_19_tfprvnom_sel = AV65TFPrvNom_Sel ;
      AV101Wcwwkp89ds_20_tfprdlote = AV70TFPrdLote ;
      AV102Wcwwkp89ds_21_tfprdlote_sel = AV71TFPrdLote_Sel ;
      AV103Wcwwkp89ds_22_tfvalcod = AV74TFValCod ;
      AV104Wcwwkp89ds_23_tfvalcod_to = AV75TFValCod_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV19FilterFullText, AV5Emprcod, AV6Prdnum, AV7Prdnum_to, AV72ValCodfrom, AV73ValCodto, AV37ManageFiltersExecutionStep, AV32ColumnsSelector, AV38TFPrdNum, AV39TFPrdNum_Sel, AV40TFPrdNom, AV41TFPrdNom_Sel, AV42TFTipPrdDsc, AV43TFTipPrdDsc_Sel, AV44TFPrdRefPrv, AV45TFPrdRefPrv_Sel, AV46TFPrdUbicacion, AV47TFPrdUbicacion_Sel, AV48TFPrdStkMinU, AV49TFPrdStkMinU_To, AV60TFPrdPreAct, AV61TFPrdPreAct_To, AV62TFPrvNum, AV63TFPrvNum_To, AV64TFPrvNom, AV65TFPrvNom_Sel, AV70TFPrdLote, AV71TFPrdLote_Sel, AV74TFValCod, AV75TFValCod_To, AV78Pgmname, AV16OrderedBy, AV17OrderedDsc, AV8Seleccion, AV20CantInv, AV21Compras, AV22Consumos, AV54compras2, AV55consumos2, AV56obsp, AV57cantRes, AV24CantPesada, AV68Cantpdte, AV58InciCPEDID, A396EmprCod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV82Wcwwkp89ds_1_filterfulltext = AV19FilterFullText ;
      AV83Wcwwkp89ds_2_tfprdnum = AV38TFPrdNum ;
      AV84Wcwwkp89ds_3_tfprdnum_sel = AV39TFPrdNum_Sel ;
      AV85Wcwwkp89ds_4_tfprdnom = AV40TFPrdNom ;
      AV86Wcwwkp89ds_5_tfprdnom_sel = AV41TFPrdNom_Sel ;
      AV87Wcwwkp89ds_6_tftipprddsc = AV42TFTipPrdDsc ;
      AV88Wcwwkp89ds_7_tftipprddsc_sel = AV43TFTipPrdDsc_Sel ;
      AV89Wcwwkp89ds_8_tfprdrefprv = AV44TFPrdRefPrv ;
      AV90Wcwwkp89ds_9_tfprdrefprv_sel = AV45TFPrdRefPrv_Sel ;
      AV91Wcwwkp89ds_10_tfprdubicacion = AV46TFPrdUbicacion ;
      AV92Wcwwkp89ds_11_tfprdubicacion_sel = AV47TFPrdUbicacion_Sel ;
      AV93Wcwwkp89ds_12_tfprdstkminu = AV48TFPrdStkMinU ;
      AV94Wcwwkp89ds_13_tfprdstkminu_to = AV49TFPrdStkMinU_To ;
      AV95Wcwwkp89ds_14_tfprdpreact = AV60TFPrdPreAct ;
      AV96Wcwwkp89ds_15_tfprdpreact_to = AV61TFPrdPreAct_To ;
      AV97Wcwwkp89ds_16_tfprvnum = AV62TFPrvNum ;
      AV98Wcwwkp89ds_17_tfprvnum_to = AV63TFPrvNum_To ;
      AV99Wcwwkp89ds_18_tfprvnom = AV64TFPrvNom ;
      AV100Wcwwkp89ds_19_tfprvnom_sel = AV65TFPrvNom_Sel ;
      AV101Wcwwkp89ds_20_tfprdlote = AV70TFPrdLote ;
      AV102Wcwwkp89ds_21_tfprdlote_sel = AV71TFPrdLote_Sel ;
      AV103Wcwwkp89ds_22_tfvalcod = AV74TFValCod ;
      AV104Wcwwkp89ds_23_tfvalcod_to = AV75TFValCod_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV19FilterFullText, AV5Emprcod, AV6Prdnum, AV7Prdnum_to, AV72ValCodfrom, AV73ValCodto, AV37ManageFiltersExecutionStep, AV32ColumnsSelector, AV38TFPrdNum, AV39TFPrdNum_Sel, AV40TFPrdNom, AV41TFPrdNom_Sel, AV42TFTipPrdDsc, AV43TFTipPrdDsc_Sel, AV44TFPrdRefPrv, AV45TFPrdRefPrv_Sel, AV46TFPrdUbicacion, AV47TFPrdUbicacion_Sel, AV48TFPrdStkMinU, AV49TFPrdStkMinU_To, AV60TFPrdPreAct, AV61TFPrdPreAct_To, AV62TFPrvNum, AV63TFPrvNum_To, AV64TFPrvNom, AV65TFPrvNom_Sel, AV70TFPrdLote, AV71TFPrdLote_Sel, AV74TFValCod, AV75TFValCod_To, AV78Pgmname, AV16OrderedBy, AV17OrderedDsc, AV8Seleccion, AV20CantInv, AV21Compras, AV22Consumos, AV54compras2, AV55consumos2, AV56obsp, AV57cantRes, AV24CantPesada, AV68Cantpdte, AV58InciCPEDID, A396EmprCod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV78Pgmname = "WCWWkp89" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78Pgmname", AV78Pgmname);
      Gx_err = (short)(0) ;
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavCantinv_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCantinv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCantinv_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavCompras_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCompras_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCompras_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavConsumos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavConsumos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavConsumos_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavPrdexialm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrdexialm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdexialm_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavCantpesada_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCantpesada_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCantpesada_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavStocktotal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavStocktotal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavStocktotal_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavPrdcanres_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrdcanres_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdcanres_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavStockdisponible_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavStockdisponible_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavStockdisponible_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavValor0_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavValor0_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavValor0_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup13W0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1913W2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV35ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV50DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV32ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_43 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_43"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV52GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV53GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV5Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV5Emprcod") ;
         wcpOAV6Prdnum = httpContext.cgiGet( sPrefix+"wcpOAV6Prdnum") ;
         wcpOAV7Prdnum_to = httpContext.cgiGet( sPrefix+"wcpOAV7Prdnum_to") ;
         wcpOAV72ValCodfrom = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV72ValCodfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV73ValCodto = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV73ValCodto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV8Seleccion = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV8Seleccion"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A396EmprCod = httpContext.cgiGet( sPrefix+"EMPRCOD") ;
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
         Dvpanel_unnamedtable1_Width = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Width") ;
         Dvpanel_unnamedtable1_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Autowidth")) ;
         Dvpanel_unnamedtable1_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Autoheight")) ;
         Dvpanel_unnamedtable1_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Cls") ;
         Dvpanel_unnamedtable1_Title = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Title") ;
         Dvpanel_unnamedtable1_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Collapsible")) ;
         Dvpanel_unnamedtable1_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Collapsed")) ;
         Dvpanel_unnamedtable1_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Showcollapseicon")) ;
         Dvpanel_unnamedtable1_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Iconposition") ;
         Dvpanel_unnamedtable1_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Autoscroll")) ;
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
         Innewwindow1_Width = httpContext.cgiGet( sPrefix+"INNEWWINDOW1_Width") ;
         Innewwindow1_Height = httpContext.cgiGet( sPrefix+"INNEWWINDOW1_Height") ;
         Innewwindow1_Target = httpContext.cgiGet( sPrefix+"INNEWWINDOW1_Target") ;
         Ddo_gridcolumnsselector_Caption = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption") ;
         Ddo_gridcolumnsselector_Tooltip = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip") ;
         Ddo_gridcolumnsselector_Cls = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls") ;
         Ddo_gridcolumnsselector_Dropdownoptionstype = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype") ;
         Ddo_gridcolumnsselector_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname") ;
         Ddo_gridcolumnsselector_Titlecontrolidtoreplace = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace") ;
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
         /* Read variables values. */
         AV19FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19FilterFullText", AV19FilterFullText);
         AV78Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78Pgmname", AV78Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"WCWWkp89");
         AV78Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78Pgmname", AV78Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV78Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("wcwwkp89:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV19FilterFullText) != 0 )
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
      e1913W2 ();
      if (returnInSub) return;
   }

   public void e1913W2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV79Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wcwwkp89_impl.this.GXt_char1 = GXv_char2[0] ;
      AV79Station = GXt_char1 ;
      GXv_char2[0] = AV5Emprcod ;
      GXv_char3[0] = AV80Emprnom ;
      GXv_char4[0] = AV81Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV79Station, GXv_char2, GXv_char3, GXv_char4) ;
      wcwwkp89_impl.this.AV5Emprcod = GXv_char2[0] ;
      wcwwkp89_impl.this.AV80Emprnom = GXv_char3[0] ;
      wcwwkp89_impl.this.AV81Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
      divCell_grid_dwc_Class = "Invisible WCD_"+GXutil.upper( subGrid_Internalname) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, divCell_grid_dwc_Internalname, "Class", divCell_grid_dwc_Class, true);
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
      if ( AV16OrderedBy < 1 )
      {
         AV16OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV50DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV50DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e2013W2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext7[0] = AV10WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV10WWPContext = GXv_SdtWWPContext7[0] ;
      if ( AV37ManageFiltersExecutionStep == 1 )
      {
         AV37ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37ManageFiltersExecutionStep", GXutil.str( AV37ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV37ManageFiltersExecutionStep == 2 )
      {
         AV37ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37ManageFiltersExecutionStep", GXutil.str( AV37ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV34Session.getValue("WCWWkp89ColumnsSelector"), "") != 0 )
      {
         AV30ColumnsSelectorXML = AV34Session.getValue("WCWWkp89ColumnsSelector") ;
         AV32ColumnsSelector.fromxml(AV30ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtPrdNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV32ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrdNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV32ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtTipPrdDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV32ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtTipPrdDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipPrdDsc_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrdRefPrv_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV32ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdRefPrv_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdRefPrv_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrdUbicaci_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV32ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdUbicaci_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdUbicaci_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrdStkMinU_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV32ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdStkMinU_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdStkMinU_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavCantinv_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV32ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCantinv_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCantinv_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavCompras_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV32ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCompras_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCompras_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavConsumos_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV32ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavConsumos_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavConsumos_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavPrdexialm_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV32ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrdexialm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdexialm_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavCantpesada_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV32ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCantpesada_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCantpesada_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavStocktotal_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV32ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavStocktotal_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavStocktotal_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavPrdcanres_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV32ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrdcanres_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdcanres_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavStockdisponible_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV32ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavStockdisponible_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavStockdisponible_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrdPreAct_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV32ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdPreAct_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdPreAct_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavValor0_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV32ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavValor0_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavValor0_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrvNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV32ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrvNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNum_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrvNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV32ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrvNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNom_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrdLote_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV32ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdLote_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdLote_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtValCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV32ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtValCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtValCod_Visible), 5, 0), !bGXsfl_43_Refreshing);
      AV52GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52GridCurrentPage), 10, 0));
      AV53GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53GridPageCount), 10, 0));
      AV82Wcwwkp89ds_1_filterfulltext = AV19FilterFullText ;
      AV83Wcwwkp89ds_2_tfprdnum = AV38TFPrdNum ;
      AV84Wcwwkp89ds_3_tfprdnum_sel = AV39TFPrdNum_Sel ;
      AV85Wcwwkp89ds_4_tfprdnom = AV40TFPrdNom ;
      AV86Wcwwkp89ds_5_tfprdnom_sel = AV41TFPrdNom_Sel ;
      AV87Wcwwkp89ds_6_tftipprddsc = AV42TFTipPrdDsc ;
      AV88Wcwwkp89ds_7_tftipprddsc_sel = AV43TFTipPrdDsc_Sel ;
      AV89Wcwwkp89ds_8_tfprdrefprv = AV44TFPrdRefPrv ;
      AV90Wcwwkp89ds_9_tfprdrefprv_sel = AV45TFPrdRefPrv_Sel ;
      AV91Wcwwkp89ds_10_tfprdubicacion = AV46TFPrdUbicacion ;
      AV92Wcwwkp89ds_11_tfprdubicacion_sel = AV47TFPrdUbicacion_Sel ;
      AV93Wcwwkp89ds_12_tfprdstkminu = AV48TFPrdStkMinU ;
      AV94Wcwwkp89ds_13_tfprdstkminu_to = AV49TFPrdStkMinU_To ;
      AV95Wcwwkp89ds_14_tfprdpreact = AV60TFPrdPreAct ;
      AV96Wcwwkp89ds_15_tfprdpreact_to = AV61TFPrdPreAct_To ;
      AV97Wcwwkp89ds_16_tfprvnum = AV62TFPrvNum ;
      AV98Wcwwkp89ds_17_tfprvnum_to = AV63TFPrvNum_To ;
      AV99Wcwwkp89ds_18_tfprvnom = AV64TFPrvNom ;
      AV100Wcwwkp89ds_19_tfprvnom_sel = AV65TFPrvNom_Sel ;
      AV101Wcwwkp89ds_20_tfprdlote = AV70TFPrdLote ;
      AV102Wcwwkp89ds_21_tfprdlote_sel = AV71TFPrdLote_Sel ;
      AV103Wcwwkp89ds_22_tfvalcod = AV74TFValCod ;
      AV104Wcwwkp89ds_23_tfvalcod_to = AV75TFValCod_To ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV32ColumnsSelector", AV32ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV35ManageFiltersData", AV35ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV14GridState", AV14GridState);
   }

   public void e1313W2( )
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
         AV51PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV51PageToGo) ;
      }
   }

   public void e1413W2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e1513W2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV16OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16OrderedBy), 4, 0));
         AV17OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17OrderedDsc", AV17OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdNum") == 0 )
         {
            AV38TFPrdNum = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFPrdNum", AV38TFPrdNum);
            AV39TFPrdNum_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFPrdNum_Sel", AV39TFPrdNum_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdNom") == 0 )
         {
            AV40TFPrdNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFPrdNom", AV40TFPrdNom);
            AV41TFPrdNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFPrdNom_Sel", AV41TFPrdNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "TipPrdDsc") == 0 )
         {
            AV42TFTipPrdDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFTipPrdDsc", AV42TFTipPrdDsc);
            AV43TFTipPrdDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFTipPrdDsc_Sel", AV43TFTipPrdDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdRefPrv") == 0 )
         {
            AV44TFPrdRefPrv = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFPrdRefPrv", AV44TFPrdRefPrv);
            AV45TFPrdRefPrv_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFPrdRefPrv_Sel", AV45TFPrdRefPrv_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdUbicacion") == 0 )
         {
            AV46TFPrdUbicacion = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFPrdUbicacion", AV46TFPrdUbicacion);
            AV47TFPrdUbicacion_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFPrdUbicacion_Sel", AV47TFPrdUbicacion_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdStkMinU") == 0 )
         {
            AV48TFPrdStkMinU = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFPrdStkMinU", GXutil.ltrimstr( AV48TFPrdStkMinU, 8, 2));
            AV49TFPrdStkMinU_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFPrdStkMinU_To", GXutil.ltrimstr( AV49TFPrdStkMinU_To, 8, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdPreAct") == 0 )
         {
            AV60TFPrdPreAct = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFPrdPreAct", GXutil.ltrimstr( AV60TFPrdPreAct, 14, 5));
            AV61TFPrdPreAct_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFPrdPreAct_To", GXutil.ltrimstr( AV61TFPrdPreAct_To, 14, 5));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrvNum") == 0 )
         {
            AV62TFPrvNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62TFPrvNum), 6, 0));
            AV63TFPrvNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFPrvNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63TFPrvNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrvNom") == 0 )
         {
            AV64TFPrvNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFPrvNom", AV64TFPrvNom);
            AV65TFPrvNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFPrvNom_Sel", AV65TFPrvNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdLote") == 0 )
         {
            AV70TFPrdLote = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70TFPrdLote", AV70TFPrdLote);
            AV71TFPrdLote_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71TFPrdLote_Sel", AV71TFPrdLote_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ValCod") == 0 )
         {
            AV74TFValCod = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74TFValCod", GXutil.str( AV74TFValCod, 1, 0));
            AV75TFValCod_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75TFValCod_To", GXutil.str( AV75TFValCod_To, 1, 0));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e2113W2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV69DetailWebComponent = "<i class=\"fas fa-angle-right ArrowIcon\"></i>" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDetailwebcomponent_Internalname, AV69DetailWebComponent);
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A719PrdNum ;
      GXv_char2[0] = A719PrdNum ;
      GXv_decimal8[0] = AV20CantInv ;
      GXv_decimal9[0] = AV21Compras ;
      GXv_decimal10[0] = AV22Consumos ;
      GXv_decimal11[0] = AV54compras2 ;
      GXv_decimal12[0] = AV55consumos2 ;
      GXv_char13[0] = AV56obsp ;
      new app.pupq010(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2, GXv_decimal8, GXv_decimal9, GXv_decimal10, GXv_decimal11, GXv_decimal12, GXv_char13) ;
      wcwwkp89_impl.this.A396EmprCod = GXv_char4[0] ;
      wcwwkp89_impl.this.A719PrdNum = GXv_char3[0] ;
      wcwwkp89_impl.this.A719PrdNum = GXv_char2[0] ;
      wcwwkp89_impl.this.AV20CantInv = GXv_decimal8[0] ;
      wcwwkp89_impl.this.AV21Compras = GXv_decimal9[0] ;
      wcwwkp89_impl.this.AV22Consumos = GXv_decimal10[0] ;
      wcwwkp89_impl.this.AV54compras2 = GXv_decimal11[0] ;
      wcwwkp89_impl.this.AV55consumos2 = GXv_decimal12[0] ;
      wcwwkp89_impl.this.AV56obsp = GXv_char13[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCantinv_Internalname, GXutil.ltrimstr( AV20CantInv, 12, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCANTINV"+"_"+sGXsfl_43_idx, getSecureSignedToken( sPrefix+sGXsfl_43_idx, localUtil.format( AV20CantInv, "ZZZZZZZZ9.99")));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCompras_Internalname, GXutil.ltrimstr( AV21Compras, 12, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOMPRAS"+"_"+sGXsfl_43_idx, getSecureSignedToken( sPrefix+sGXsfl_43_idx, localUtil.format( AV21Compras, "ZZZZZZZZ9.99")));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavConsumos_Internalname, GXutil.ltrimstr( AV22Consumos, 12, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCONSUMOS"+"_"+sGXsfl_43_idx, getSecureSignedToken( sPrefix+sGXsfl_43_idx, localUtil.format( AV22Consumos, "ZZZZZZZZ9.99")));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54compras2", GXutil.ltrimstr( AV54compras2, 12, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOMPRAS2", getSecureSignedToken( sPrefix, localUtil.format( AV54compras2, "ZZZZZZZZ9.99")));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55consumos2", GXutil.ltrimstr( AV55consumos2, 12, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCONSUMOS2", getSecureSignedToken( sPrefix, localUtil.format( AV55consumos2, "ZZZZZZZZ9.99")));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56obsp", AV56obsp);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vOBSP", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV56obsp, ""))));
      GXv_char13[0] = A396EmprCod ;
      GXv_char4[0] = A719PrdNum ;
      GXv_decimal12[0] = AV57cantRes ;
      GXv_decimal11[0] = AV24CantPesada ;
      GXv_decimal10[0] = AV68Cantpdte ;
      GXv_char3[0] = AV58InciCPEDID ;
      new app.pprc175(remoteHandle, context).execute( GXv_char13, GXv_char4, GXv_decimal12, GXv_decimal11, GXv_decimal10, GXv_char3) ;
      wcwwkp89_impl.this.A396EmprCod = GXv_char13[0] ;
      wcwwkp89_impl.this.A719PrdNum = GXv_char4[0] ;
      wcwwkp89_impl.this.AV57cantRes = GXv_decimal12[0] ;
      wcwwkp89_impl.this.AV24CantPesada = GXv_decimal11[0] ;
      wcwwkp89_impl.this.AV68Cantpdte = GXv_decimal10[0] ;
      wcwwkp89_impl.this.AV58InciCPEDID = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57cantRes", GXutil.ltrimstr( AV57cantRes, 12, 3));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCANTRES", getSecureSignedToken( sPrefix, localUtil.format( AV57cantRes, "ZZZZZZZ9.999")));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCantpesada_Internalname, GXutil.ltrimstr( AV24CantPesada, 12, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCANTPESADA"+"_"+sGXsfl_43_idx, getSecureSignedToken( sPrefix+sGXsfl_43_idx, localUtil.format( AV24CantPesada, "ZZZZZZZZ9.99")));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68Cantpdte", GXutil.ltrimstr( AV68Cantpdte, 12, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCANTPDTE", getSecureSignedToken( sPrefix, localUtil.format( AV68Cantpdte, "ZZZZZZZZ9.99")));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58InciCPEDID", AV58InciCPEDID);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vINCICPEDID", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV58InciCPEDID, ""))));
      AV23PrdExiAlm = A704PrdExiAlm.subtract(AV24CantPesada) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPrdexialm_Internalname, GXutil.ltrimstr( AV23PrdExiAlm, 12, 4));
      AV25stockTotal = AV23PrdExiAlm.add(AV24CantPesada) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavStocktotal_Internalname, GXutil.ltrimstr( AV25stockTotal, 12, 2));
      AV26PrdCanRes = A685PrdCanRes.subtract(AV24CantPesada) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPrdcanres_Internalname, GXutil.ltrimstr( AV26PrdCanRes, 12, 4));
      AV27StockDisponible = A704PrdExiAlm.subtract(AV26PrdCanRes) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavStockdisponible_Internalname, GXutil.ltrimstr( AV27StockDisponible, 12, 2));
      AV59valor0 = (AV23PrdExiAlm.add(AV24CantPesada)).multiply(A724PrdPreAct) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavValor0_Internalname, GXutil.ltrimstr( AV59valor0, 10, 2));
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(43) ;
      }
      sendrow_432( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_43_Refreshing )
      {
         httpContext.doAjaxLoad(43, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void e1613W2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV30ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV32ColumnsSelector.fromJSonString(AV30ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "WCWWkp89ColumnsSelector", ((GXutil.strcmp("", AV30ColumnsSelectorXML)==0) ? "" : AV32ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV32ColumnsSelector", AV32ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV35ManageFiltersData", AV35ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV14GridState", AV14GridState);
   }

   public void e1213W2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("WCWWkp89Filters")),GXutil.URLEncode(GXutil.rtrim(AV78Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV37ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37ManageFiltersExecutionStep", GXutil.str( AV37ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("WCWWkp89Filters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV37ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37ManageFiltersExecutionStep", GXutil.str( AV37ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV36ManageFiltersXml ;
         GXv_char13[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "WCWWkp89Filters", Ddo_managefilters_Activeeventkey, GXv_char13) ;
         wcwwkp89_impl.this.GXt_char1 = GXv_char13[0] ;
         AV36ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV36ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV78Pgmname+"GridState", AV36ManageFiltersXml) ;
            AV14GridState.fromxml(AV36ManageFiltersXml, null, null);
            AV16OrderedBy = AV14GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16OrderedBy), 4, 0));
            AV17OrderedDsc = AV14GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17OrderedDsc", AV17OrderedDsc);
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
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV14GridState", AV14GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV32ColumnsSelector", AV32ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV35ManageFiltersData", AV35ManageFiltersData);
   }

   public void e1713W2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char13[0] = AV28ExcelFilename ;
      GXv_char4[0] = AV29ErrorMessage ;
      new app.wcwwkp89export(remoteHandle, context).execute( GXv_char13, GXv_char4) ;
      wcwwkp89_impl.this.AV28ExcelFilename = GXv_char13[0] ;
      wcwwkp89_impl.this.AV29ErrorMessage = GXv_char4[0] ;
      if ( GXutil.strcmp(AV28ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV28ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV29ErrorMessage);
      }
   }

   public void e1813W2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.wcwwkp89exportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV16OrderedBy, 4, 0))+":"+(AV17OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV32ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector14[0] = AV32ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "PrdNum", "", "Producto", true, "") ;
      AV32ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV32ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "PrdNom", "", "Descripcion", true, "") ;
      AV32ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV32ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "TipPrdDsc", "", "Familia", false, "") ;
      AV32ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV32ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "PrdRefPrv", "", "Uso", false, "") ;
      AV32ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV32ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "PrdUbicacion", "", "Ubicacion", false, "") ;
      AV32ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV32ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "PrdStkMinU", "", "Unidades Stock Minimo", false, "") ;
      AV32ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV32ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&CantInv", "", "Stock Inicial", true, "") ;
      AV32ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV32ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&Compras", "", "Compras", true, "") ;
      AV32ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV32ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&Consumos", "", "Consumos", true, "") ;
      AV32ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV32ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&PrdExiAlm", "", "Stock Piso", true, "") ;
      AV32ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV32ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&CantPesada", "", "Stock Pesado", true, "") ;
      AV32ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV32ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&stockTotal", "", "Stock Total", true, "") ;
      AV32ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV32ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&PrdCanRes", "", "Reservas", true, "") ;
      AV32ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV32ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&StockDisponible", "", "Stock Disponible", true, "") ;
      AV32ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV32ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "PrdPreAct", "", "Precio Actual", true, "") ;
      AV32ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV32ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&valor0", "", "Valor Stock", true, "") ;
      AV32ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV32ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "PrvNum", "", "Codigo Proveedor", false, "") ;
      AV32ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV32ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "PrvNom", "", "Nombre Proveedor", false, "") ;
      AV32ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV32ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "PrdLote", "", "Lote", true, "") ;
      AV32ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV32ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "ValCod", "", "Validez", true, "") ;
      AV32ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXt_char1 = AV31UserCustomValue ;
      GXv_char13[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WCWWkp89ColumnsSelector", GXv_char13) ;
      wcwwkp89_impl.this.GXt_char1 = GXv_char13[0] ;
      AV31UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV31UserCustomValue)==0) ) )
      {
         AV33ColumnsSelectorAux.fromxml(AV31UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector14[0] = AV33ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector15[0] = AV32ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, GXv_SdtWWPColumnsSelector15) ;
         AV33ColumnsSelectorAux = GXv_SdtWWPColumnsSelector14[0] ;
         AV32ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item16 = AV35ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item17[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item16 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "WCWWkp89Filters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item17) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item16 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item17[0] ;
      AV35ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item16 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV19FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19FilterFullText", AV19FilterFullText);
      AV38TFPrdNum = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFPrdNum", AV38TFPrdNum);
      AV39TFPrdNum_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFPrdNum_Sel", AV39TFPrdNum_Sel);
      AV40TFPrdNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFPrdNom", AV40TFPrdNom);
      AV41TFPrdNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFPrdNom_Sel", AV41TFPrdNom_Sel);
      AV42TFTipPrdDsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFTipPrdDsc", AV42TFTipPrdDsc);
      AV43TFTipPrdDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFTipPrdDsc_Sel", AV43TFTipPrdDsc_Sel);
      AV44TFPrdRefPrv = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFPrdRefPrv", AV44TFPrdRefPrv);
      AV45TFPrdRefPrv_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFPrdRefPrv_Sel", AV45TFPrdRefPrv_Sel);
      AV46TFPrdUbicacion = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFPrdUbicacion", AV46TFPrdUbicacion);
      AV47TFPrdUbicacion_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFPrdUbicacion_Sel", AV47TFPrdUbicacion_Sel);
      AV48TFPrdStkMinU = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFPrdStkMinU", GXutil.ltrimstr( AV48TFPrdStkMinU, 8, 2));
      AV49TFPrdStkMinU_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFPrdStkMinU_To", GXutil.ltrimstr( AV49TFPrdStkMinU_To, 8, 2));
      AV60TFPrdPreAct = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFPrdPreAct", GXutil.ltrimstr( AV60TFPrdPreAct, 14, 5));
      AV61TFPrdPreAct_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFPrdPreAct_To", GXutil.ltrimstr( AV61TFPrdPreAct_To, 14, 5));
      AV62TFPrvNum = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62TFPrvNum), 6, 0));
      AV63TFPrvNum_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFPrvNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63TFPrvNum_To), 6, 0));
      AV64TFPrvNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFPrvNom", AV64TFPrvNom);
      AV65TFPrvNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFPrvNom_Sel", AV65TFPrvNom_Sel);
      AV70TFPrdLote = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70TFPrdLote", AV70TFPrdLote);
      AV71TFPrdLote_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71TFPrdLote_Sel", AV71TFPrdLote_Sel);
      AV74TFValCod = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74TFValCod", GXutil.str( AV74TFValCod, 1, 0));
      AV75TFValCod_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75TFValCod_To", GXutil.str( AV75TFValCod_To, 1, 0));
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
      if ( GXutil.strcmp(AV34Session.getValue(AV78Pgmname+"GridState"), "") == 0 )
      {
         AV14GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV78Pgmname+"GridState"), null, null);
      }
      else
      {
         AV14GridState.fromxml(AV34Session.getValue(AV78Pgmname+"GridState"), null, null);
      }
      AV16OrderedBy = AV14GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16OrderedBy), 4, 0));
      AV17OrderedDsc = AV14GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17OrderedDsc", AV17OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S182 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV14GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV14GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV14GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S182( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV105GXV1 = 1 ;
      while ( AV105GXV1 <= AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV105GXV1));
         if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV19FilterFullText = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19FilterFullText", AV19FilterFullText);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV38TFPrdNum = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFPrdNum", AV38TFPrdNum);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV39TFPrdNum_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFPrdNum_Sel", AV39TFPrdNum_Sel);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV40TFPrdNom = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFPrdNom", AV40TFPrdNom);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV41TFPrdNom_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFPrdNom_Sel", AV41TFPrdNom_Sel);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPPRDDSC") == 0 )
         {
            AV42TFTipPrdDsc = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFTipPrdDsc", AV42TFTipPrdDsc);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPPRDDSC_SEL") == 0 )
         {
            AV43TFTipPrdDsc_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFTipPrdDsc_Sel", AV43TFTipPrdDsc_Sel);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREFPRV") == 0 )
         {
            AV44TFPrdRefPrv = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFPrdRefPrv", AV44TFPrdRefPrv);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREFPRV_SEL") == 0 )
         {
            AV45TFPrdRefPrv_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFPrdRefPrv_Sel", AV45TFPrdRefPrv_Sel);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDUBICACION") == 0 )
         {
            AV46TFPrdUbicacion = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFPrdUbicacion", AV46TFPrdUbicacion);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDUBICACION_SEL") == 0 )
         {
            AV47TFPrdUbicacion_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFPrdUbicacion_Sel", AV47TFPrdUbicacion_Sel);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDSTKMINU") == 0 )
         {
            AV48TFPrdStkMinU = CommonUtil.decimalVal( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFPrdStkMinU", GXutil.ltrimstr( AV48TFPrdStkMinU, 8, 2));
            AV49TFPrdStkMinU_To = CommonUtil.decimalVal( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFPrdStkMinU_To", GXutil.ltrimstr( AV49TFPrdStkMinU_To, 8, 2));
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDPREACT") == 0 )
         {
            AV60TFPrdPreAct = CommonUtil.decimalVal( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFPrdPreAct", GXutil.ltrimstr( AV60TFPrdPreAct, 14, 5));
            AV61TFPrdPreAct_To = CommonUtil.decimalVal( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFPrdPreAct_To", GXutil.ltrimstr( AV61TFPrdPreAct_To, 14, 5));
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNUM") == 0 )
         {
            AV62TFPrvNum = (int)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62TFPrvNum), 6, 0));
            AV63TFPrvNum_To = (int)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFPrvNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63TFPrvNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM") == 0 )
         {
            AV64TFPrvNom = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFPrvNom", AV64TFPrvNom);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM_SEL") == 0 )
         {
            AV65TFPrvNom_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFPrvNom_Sel", AV65TFPrvNom_Sel);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDLOTE") == 0 )
         {
            AV70TFPrdLote = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70TFPrdLote", AV70TFPrdLote);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDLOTE_SEL") == 0 )
         {
            AV71TFPrdLote_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71TFPrdLote_Sel", AV71TFPrdLote_Sel);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALCOD") == 0 )
         {
            AV74TFValCod = (byte)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74TFValCod", GXutil.str( AV74TFValCod, 1, 0));
            AV75TFValCod_To = (byte)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75TFValCod_To", GXutil.str( AV75TFValCod_To, 1, 0));
         }
         AV105GXV1 = (int)(AV105GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char13[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV39TFPrdNum_Sel)==0), AV39TFPrdNum_Sel, GXv_char13) ;
      wcwwkp89_impl.this.GXt_char1 = GXv_char13[0] ;
      GXt_char18 = "" ;
      GXv_char4[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV41TFPrdNom_Sel)==0), AV41TFPrdNom_Sel, GXv_char4) ;
      wcwwkp89_impl.this.GXt_char18 = GXv_char4[0] ;
      GXt_char19 = "" ;
      GXv_char3[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV43TFTipPrdDsc_Sel)==0), AV43TFTipPrdDsc_Sel, GXv_char3) ;
      wcwwkp89_impl.this.GXt_char19 = GXv_char3[0] ;
      GXt_char20 = "" ;
      GXv_char2[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV45TFPrdRefPrv_Sel)==0), AV45TFPrdRefPrv_Sel, GXv_char2) ;
      wcwwkp89_impl.this.GXt_char20 = GXv_char2[0] ;
      GXt_char21 = "" ;
      GXv_char22[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV47TFPrdUbicacion_Sel)==0), AV47TFPrdUbicacion_Sel, GXv_char22) ;
      wcwwkp89_impl.this.GXt_char21 = GXv_char22[0] ;
      GXt_char23 = "" ;
      GXv_char24[0] = GXt_char23 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV65TFPrvNom_Sel)==0), AV65TFPrvNom_Sel, GXv_char24) ;
      wcwwkp89_impl.this.GXt_char23 = GXv_char24[0] ;
      GXt_char25 = "" ;
      GXv_char26[0] = GXt_char25 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV71TFPrdLote_Sel)==0), AV71TFPrdLote_Sel, GXv_char26) ;
      wcwwkp89_impl.this.GXt_char25 = GXv_char26[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"|"+GXt_char18+"|"+GXt_char19+"|"+GXt_char20+"|"+GXt_char21+"|||||||||||||"+GXt_char23+"|"+GXt_char25+"|" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char25 = "" ;
      GXv_char26[0] = GXt_char25 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV38TFPrdNum)==0), AV38TFPrdNum, GXv_char26) ;
      wcwwkp89_impl.this.GXt_char25 = GXv_char26[0] ;
      GXt_char23 = "" ;
      GXv_char24[0] = GXt_char23 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV40TFPrdNom)==0), AV40TFPrdNom, GXv_char24) ;
      wcwwkp89_impl.this.GXt_char23 = GXv_char24[0] ;
      GXt_char21 = "" ;
      GXv_char22[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV42TFTipPrdDsc)==0), AV42TFTipPrdDsc, GXv_char22) ;
      wcwwkp89_impl.this.GXt_char21 = GXv_char22[0] ;
      GXt_char20 = "" ;
      GXv_char13[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV44TFPrdRefPrv)==0), AV44TFPrdRefPrv, GXv_char13) ;
      wcwwkp89_impl.this.GXt_char20 = GXv_char13[0] ;
      GXt_char19 = "" ;
      GXv_char4[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV46TFPrdUbicacion)==0), AV46TFPrdUbicacion, GXv_char4) ;
      wcwwkp89_impl.this.GXt_char19 = GXv_char4[0] ;
      GXt_char18 = "" ;
      GXv_char3[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV64TFPrvNom)==0), AV64TFPrvNom, GXv_char3) ;
      wcwwkp89_impl.this.GXt_char18 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV70TFPrdLote)==0), AV70TFPrdLote, GXv_char2) ;
      wcwwkp89_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = GXt_char25+"|"+GXt_char23+"|"+GXt_char21+"|"+GXt_char20+"|"+GXt_char19+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV48TFPrdStkMinU)==0) ? "" : GXutil.str( AV48TFPrdStkMinU, 8, 2))+"|||||||||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV60TFPrdPreAct)==0) ? "" : GXutil.str( AV60TFPrdPreAct, 14, 5))+"||"+((0==AV62TFPrvNum) ? "" : GXutil.str( AV62TFPrvNum, 6, 0))+"|"+GXt_char18+"|"+GXt_char1+"|"+((0==AV74TFValCod) ? "" : GXutil.str( AV74TFValCod, 1, 0)) ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "|||||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV49TFPrdStkMinU_To)==0) ? "" : GXutil.str( AV49TFPrdStkMinU_To, 8, 2))+"|||||||||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV61TFPrdPreAct_To)==0) ? "" : GXutil.str( AV61TFPrdPreAct_To, 14, 5))+"||"+((0==AV63TFPrvNum_To) ? "" : GXutil.str( AV63TFPrvNum_To, 6, 0))+"|||"+((0==AV75TFValCod_To) ? "" : GXutil.str( AV75TFValCod_To, 1, 0)) ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV14GridState.fromxml(AV34Session.getValue(AV78Pgmname+"GridState"), null, null);
      AV14GridState.setgxTv_SdtWWPGridState_Orderedby( AV16OrderedBy );
      AV14GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV17OrderedDsc );
      AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState27[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState27, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV19FilterFullText)==0), (short)(0), AV19FilterFullText, "") ;
      AV14GridState = GXv_SdtWWPGridState27[0] ;
      GXv_SdtWWPGridState27[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState27, "TFPRDNUM", "", !(GXutil.strcmp("", AV38TFPrdNum)==0), (short)(0), AV38TFPrdNum, "", !(GXutil.strcmp("", AV39TFPrdNum_Sel)==0), AV39TFPrdNum_Sel, "") ;
      AV14GridState = GXv_SdtWWPGridState27[0] ;
      GXv_SdtWWPGridState27[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState27, "TFPRDNOM", "", !(GXutil.strcmp("", AV40TFPrdNom)==0), (short)(0), AV40TFPrdNom, "", !(GXutil.strcmp("", AV41TFPrdNom_Sel)==0), AV41TFPrdNom_Sel, "") ;
      AV14GridState = GXv_SdtWWPGridState27[0] ;
      GXv_SdtWWPGridState27[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState27, "TFTIPPRDDSC", "", !(GXutil.strcmp("", AV42TFTipPrdDsc)==0), (short)(0), AV42TFTipPrdDsc, "", !(GXutil.strcmp("", AV43TFTipPrdDsc_Sel)==0), AV43TFTipPrdDsc_Sel, "") ;
      AV14GridState = GXv_SdtWWPGridState27[0] ;
      GXv_SdtWWPGridState27[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState27, "TFPRDREFPRV", "", !(GXutil.strcmp("", AV44TFPrdRefPrv)==0), (short)(0), AV44TFPrdRefPrv, "", !(GXutil.strcmp("", AV45TFPrdRefPrv_Sel)==0), AV45TFPrdRefPrv_Sel, "") ;
      AV14GridState = GXv_SdtWWPGridState27[0] ;
      GXv_SdtWWPGridState27[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState27, "TFPRDUBICACION", "", !(GXutil.strcmp("", AV46TFPrdUbicacion)==0), (short)(0), AV46TFPrdUbicacion, "", !(GXutil.strcmp("", AV47TFPrdUbicacion_Sel)==0), AV47TFPrdUbicacion_Sel, "") ;
      AV14GridState = GXv_SdtWWPGridState27[0] ;
      GXv_SdtWWPGridState27[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState27, "TFPRDSTKMINU", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV48TFPrdStkMinU)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV49TFPrdStkMinU_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV48TFPrdStkMinU, 8, 2)), GXutil.trim( GXutil.str( AV49TFPrdStkMinU_To, 8, 2))) ;
      AV14GridState = GXv_SdtWWPGridState27[0] ;
      GXv_SdtWWPGridState27[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState27, "TFPRDPREACT", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV60TFPrdPreAct)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV61TFPrdPreAct_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV60TFPrdPreAct, 14, 5)), GXutil.trim( GXutil.str( AV61TFPrdPreAct_To, 14, 5))) ;
      AV14GridState = GXv_SdtWWPGridState27[0] ;
      GXv_SdtWWPGridState27[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState27, "TFPRVNUM", "", !((0==AV62TFPrvNum)&&(0==AV63TFPrvNum_To)), (short)(0), GXutil.trim( GXutil.str( AV62TFPrvNum, 6, 0)), GXutil.trim( GXutil.str( AV63TFPrvNum_To, 6, 0))) ;
      AV14GridState = GXv_SdtWWPGridState27[0] ;
      GXv_SdtWWPGridState27[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState27, "TFPRVNOM", "", !(GXutil.strcmp("", AV64TFPrvNom)==0), (short)(0), AV64TFPrvNom, "", !(GXutil.strcmp("", AV65TFPrvNom_Sel)==0), AV65TFPrvNom_Sel, "") ;
      AV14GridState = GXv_SdtWWPGridState27[0] ;
      GXv_SdtWWPGridState27[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState27, "TFPRDLOTE", "", !(GXutil.strcmp("", AV70TFPrdLote)==0), (short)(0), AV70TFPrdLote, "", !(GXutil.strcmp("", AV71TFPrdLote_Sel)==0), AV71TFPrdLote_Sel, "") ;
      AV14GridState = GXv_SdtWWPGridState27[0] ;
      GXv_SdtWWPGridState27[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState27, "TFVALCOD", "", !((0==AV74TFValCod)&&(0==AV75TFValCod_To)), (short)(0), GXutil.trim( GXutil.str( AV74TFValCod, 1, 0)), GXutil.trim( GXutil.str( AV75TFValCod_To, 1, 0))) ;
      AV14GridState = GXv_SdtWWPGridState27[0] ;
      if ( ! (GXutil.strcmp("", AV5Emprcod)==0) )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV5Emprcod );
         AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV15GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV6Prdnum)==0) )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PRDNUM" );
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV6Prdnum );
         AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV15GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV7Prdnum_to)==0) )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PRDNUM_TO" );
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV7Prdnum_to );
         AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV15GridStateFilterValue, 0);
      }
      if ( ! (0==AV72ValCodfrom) )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&VALCODFROM" );
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV72ValCodfrom, 4, 0) );
         AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV15GridStateFilterValue, 0);
      }
      if ( ! (0==AV73ValCodto) )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&VALCODTO" );
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV73ValCodto, 4, 0) );
         AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV15GridStateFilterValue, 0);
      }
      if ( ! (0==AV8Seleccion) )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&SELECCION" );
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV8Seleccion, 1, 0) );
         AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV15GridStateFilterValue, 0);
      }
      AV14GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV14GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV78Pgmname+"GridState", AV14GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV12TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV12TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV78Pgmname );
      AV12TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV12TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV11HTTPRequest.getScriptName()+"?"+AV11HTTPRequest.getQuerystring() );
      AV12TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "StocksQuimicos.PRODUC" );
      AV34Session.setValue("TrnContext", AV12TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_25_13W2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV35ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_30_13W2( true) ;
      }
      else
      {
         wb_table2_30_13W2( false) ;
      }
      return  ;
   }

   public void wb_table2_30_13W2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_25_13W2e( true) ;
      }
      else
      {
         wb_table1_25_13W2e( false) ;
      }
   }

   public void wb_table2_30_13W2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'" + sPrefix + "',false,'" + sGXsfl_43_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV19FilterFullText, GXutil.rtrim( localUtil.format( AV19FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,34);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_WCWWkp89.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_30_13W2e( true) ;
      }
      else
      {
         wb_table2_30_13W2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV5Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
      AV6Prdnum = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Prdnum", AV6Prdnum);
      AV7Prdnum_to = (String)getParm(obj,2,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Prdnum_to", AV7Prdnum_to);
      AV72ValCodfrom = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72ValCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72ValCodfrom), 4, 0));
      AV73ValCodto = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73ValCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73ValCodto), 4, 0));
      AV8Seleccion = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Seleccion", GXutil.str( AV8Seleccion, 1, 0));
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
      pa13W2( ) ;
      ws13W2( ) ;
      we13W2( ) ;
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
      sCtrlAV5Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV6Prdnum = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV7Prdnum_to = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV72ValCodfrom = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV73ValCodto = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV8Seleccion = (String)getParm(obj,5,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa13W2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "wcwwkp89", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa13W2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV5Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
         AV6Prdnum = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Prdnum", AV6Prdnum);
         AV7Prdnum_to = (String)getParm(obj,4,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Prdnum_to", AV7Prdnum_to);
         AV72ValCodfrom = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72ValCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72ValCodfrom), 4, 0));
         AV73ValCodto = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73ValCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73ValCodto), 4, 0));
         AV8Seleccion = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Seleccion", GXutil.str( AV8Seleccion, 1, 0));
      }
      wcpOAV5Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV5Emprcod") ;
      wcpOAV6Prdnum = httpContext.cgiGet( sPrefix+"wcpOAV6Prdnum") ;
      wcpOAV7Prdnum_to = httpContext.cgiGet( sPrefix+"wcpOAV7Prdnum_to") ;
      wcpOAV72ValCodfrom = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV72ValCodfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV73ValCodto = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV73ValCodto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV8Seleccion = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV8Seleccion"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV5Emprcod, wcpOAV5Emprcod) != 0 ) || ( GXutil.strcmp(AV6Prdnum, wcpOAV6Prdnum) != 0 ) || ( GXutil.strcmp(AV7Prdnum_to, wcpOAV7Prdnum_to) != 0 ) || ( AV72ValCodfrom != wcpOAV72ValCodfrom ) || ( AV73ValCodto != wcpOAV73ValCodto ) || ( AV8Seleccion != wcpOAV8Seleccion ) ) )
      {
         setjustcreated();
      }
      wcpOAV5Emprcod = AV5Emprcod ;
      wcpOAV6Prdnum = AV6Prdnum ;
      wcpOAV7Prdnum_to = AV7Prdnum_to ;
      wcpOAV72ValCodfrom = AV72ValCodfrom ;
      wcpOAV73ValCodto = AV73ValCodto ;
      wcpOAV8Seleccion = AV8Seleccion ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV5Emprcod = httpContext.cgiGet( sPrefix+"AV5Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV5Emprcod) > 0 )
      {
         AV5Emprcod = httpContext.cgiGet( sCtrlAV5Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
      }
      else
      {
         AV5Emprcod = httpContext.cgiGet( sPrefix+"AV5Emprcod_PARM") ;
      }
      sCtrlAV6Prdnum = httpContext.cgiGet( sPrefix+"AV6Prdnum_CTRL") ;
      if ( GXutil.len( sCtrlAV6Prdnum) > 0 )
      {
         AV6Prdnum = httpContext.cgiGet( sCtrlAV6Prdnum) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Prdnum", AV6Prdnum);
      }
      else
      {
         AV6Prdnum = httpContext.cgiGet( sPrefix+"AV6Prdnum_PARM") ;
      }
      sCtrlAV7Prdnum_to = httpContext.cgiGet( sPrefix+"AV7Prdnum_to_CTRL") ;
      if ( GXutil.len( sCtrlAV7Prdnum_to) > 0 )
      {
         AV7Prdnum_to = httpContext.cgiGet( sCtrlAV7Prdnum_to) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Prdnum_to", AV7Prdnum_to);
      }
      else
      {
         AV7Prdnum_to = httpContext.cgiGet( sPrefix+"AV7Prdnum_to_PARM") ;
      }
      sCtrlAV72ValCodfrom = httpContext.cgiGet( sPrefix+"AV72ValCodfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV72ValCodfrom) > 0 )
      {
         AV72ValCodfrom = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV72ValCodfrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72ValCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72ValCodfrom), 4, 0));
      }
      else
      {
         AV72ValCodfrom = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV72ValCodfrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV73ValCodto = httpContext.cgiGet( sPrefix+"AV73ValCodto_CTRL") ;
      if ( GXutil.len( sCtrlAV73ValCodto) > 0 )
      {
         AV73ValCodto = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV73ValCodto), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73ValCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73ValCodto), 4, 0));
      }
      else
      {
         AV73ValCodto = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV73ValCodto_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV8Seleccion = httpContext.cgiGet( sPrefix+"AV8Seleccion_CTRL") ;
      if ( GXutil.len( sCtrlAV8Seleccion) > 0 )
      {
         AV8Seleccion = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV8Seleccion), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Seleccion", GXutil.str( AV8Seleccion, 1, 0));
      }
      else
      {
         AV8Seleccion = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV8Seleccion_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa13W2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws13W2( ) ;
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
      ws13W2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5Emprcod_PARM", GXutil.rtrim( AV5Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV5Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5Emprcod_CTRL", GXutil.rtrim( sCtrlAV5Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6Prdnum_PARM", GXutil.rtrim( AV6Prdnum));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV6Prdnum)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6Prdnum_CTRL", GXutil.rtrim( sCtrlAV6Prdnum));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7Prdnum_to_PARM", GXutil.rtrim( AV7Prdnum_to));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7Prdnum_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7Prdnum_to_CTRL", GXutil.rtrim( sCtrlAV7Prdnum_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV72ValCodfrom_PARM", GXutil.ltrim( localUtil.ntoc( AV72ValCodfrom, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV72ValCodfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV72ValCodfrom_CTRL", GXutil.rtrim( sCtrlAV72ValCodfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV73ValCodto_PARM", GXutil.ltrim( localUtil.ntoc( AV73ValCodto, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV73ValCodto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV73ValCodto_CTRL", GXutil.rtrim( sCtrlAV73ValCodto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8Seleccion_PARM", GXutil.ltrim( localUtil.ntoc( AV8Seleccion, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV8Seleccion)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8Seleccion_CTRL", GXutil.rtrim( sCtrlAV8Seleccion));
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
      we13W2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116848", true, true);
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
      httpContext.AddJavascriptSource("wcwwkp89.js", "?202682116848", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_432( )
   {
      edtavDetailwebcomponent_Internalname = sPrefix+"vDETAILWEBCOMPONENT_"+sGXsfl_43_idx ;
      edtPrdNum_Internalname = sPrefix+"PRDNUM_"+sGXsfl_43_idx ;
      edtPrdNom_Internalname = sPrefix+"PRDNOM_"+sGXsfl_43_idx ;
      edtTipPrdDsc_Internalname = sPrefix+"TIPPRDDSC_"+sGXsfl_43_idx ;
      edtPrdRefPrv_Internalname = sPrefix+"PRDREFPRV_"+sGXsfl_43_idx ;
      edtPrdUbicaci_Internalname = sPrefix+"PRDUBICACI_"+sGXsfl_43_idx ;
      edtPrdStkMinU_Internalname = sPrefix+"PRDSTKMINU_"+sGXsfl_43_idx ;
      edtavCantinv_Internalname = sPrefix+"vCANTINV_"+sGXsfl_43_idx ;
      edtavCompras_Internalname = sPrefix+"vCOMPRAS_"+sGXsfl_43_idx ;
      edtavConsumos_Internalname = sPrefix+"vCONSUMOS_"+sGXsfl_43_idx ;
      edtavPrdexialm_Internalname = sPrefix+"vPRDEXIALM_"+sGXsfl_43_idx ;
      edtavCantpesada_Internalname = sPrefix+"vCANTPESADA_"+sGXsfl_43_idx ;
      edtavStocktotal_Internalname = sPrefix+"vSTOCKTOTAL_"+sGXsfl_43_idx ;
      edtavPrdcanres_Internalname = sPrefix+"vPRDCANRES_"+sGXsfl_43_idx ;
      edtavStockdisponible_Internalname = sPrefix+"vSTOCKDISPONIBLE_"+sGXsfl_43_idx ;
      edtPrdPreAct_Internalname = sPrefix+"PRDPREACT_"+sGXsfl_43_idx ;
      edtavValor0_Internalname = sPrefix+"vVALOR0_"+sGXsfl_43_idx ;
      edtPrvNum_Internalname = sPrefix+"PRVNUM_"+sGXsfl_43_idx ;
      edtPrvNom_Internalname = sPrefix+"PRVNOM_"+sGXsfl_43_idx ;
      edtPrdLote_Internalname = sPrefix+"PRDLOTE_"+sGXsfl_43_idx ;
      edtValCod_Internalname = sPrefix+"VALCOD_"+sGXsfl_43_idx ;
   }

   public void subsflControlProps_fel_432( )
   {
      edtavDetailwebcomponent_Internalname = sPrefix+"vDETAILWEBCOMPONENT_"+sGXsfl_43_fel_idx ;
      edtPrdNum_Internalname = sPrefix+"PRDNUM_"+sGXsfl_43_fel_idx ;
      edtPrdNom_Internalname = sPrefix+"PRDNOM_"+sGXsfl_43_fel_idx ;
      edtTipPrdDsc_Internalname = sPrefix+"TIPPRDDSC_"+sGXsfl_43_fel_idx ;
      edtPrdRefPrv_Internalname = sPrefix+"PRDREFPRV_"+sGXsfl_43_fel_idx ;
      edtPrdUbicaci_Internalname = sPrefix+"PRDUBICACI_"+sGXsfl_43_fel_idx ;
      edtPrdStkMinU_Internalname = sPrefix+"PRDSTKMINU_"+sGXsfl_43_fel_idx ;
      edtavCantinv_Internalname = sPrefix+"vCANTINV_"+sGXsfl_43_fel_idx ;
      edtavCompras_Internalname = sPrefix+"vCOMPRAS_"+sGXsfl_43_fel_idx ;
      edtavConsumos_Internalname = sPrefix+"vCONSUMOS_"+sGXsfl_43_fel_idx ;
      edtavPrdexialm_Internalname = sPrefix+"vPRDEXIALM_"+sGXsfl_43_fel_idx ;
      edtavCantpesada_Internalname = sPrefix+"vCANTPESADA_"+sGXsfl_43_fel_idx ;
      edtavStocktotal_Internalname = sPrefix+"vSTOCKTOTAL_"+sGXsfl_43_fel_idx ;
      edtavPrdcanres_Internalname = sPrefix+"vPRDCANRES_"+sGXsfl_43_fel_idx ;
      edtavStockdisponible_Internalname = sPrefix+"vSTOCKDISPONIBLE_"+sGXsfl_43_fel_idx ;
      edtPrdPreAct_Internalname = sPrefix+"PRDPREACT_"+sGXsfl_43_fel_idx ;
      edtavValor0_Internalname = sPrefix+"vVALOR0_"+sGXsfl_43_fel_idx ;
      edtPrvNum_Internalname = sPrefix+"PRVNUM_"+sGXsfl_43_fel_idx ;
      edtPrvNom_Internalname = sPrefix+"PRVNOM_"+sGXsfl_43_fel_idx ;
      edtPrdLote_Internalname = sPrefix+"PRDLOTE_"+sGXsfl_43_fel_idx ;
      edtValCod_Internalname = sPrefix+"VALCOD_"+sGXsfl_43_fel_idx ;
   }

   public void sendrow_432( )
   {
      subsflControlProps_432( ) ;
      wb13W0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_43_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_43_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_43_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 44,'"+sPrefix+"',false,'"+sGXsfl_43_idx+"',43)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDetailwebcomponent_Internalname,GXutil.rtrim( AV69DetailWebComponent),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,44);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+"e2213w2_client"+"'","","","","",edtavDetailwebcomponent_Jsonclick,Integer.valueOf(7),"Attribute","",ROClassString,"WWIconActionColumn WCD_ActionColumn","",Integer.valueOf(-1),Integer.valueOf(edtavDetailwebcomponent_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum_Internalname,GXutil.rtrim( A719PrdNum),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNom_Internalname,GXutil.rtrim( A718PrdNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtTipPrdDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipPrdDsc_Internalname,GXutil.rtrim( A6302TipPrdDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTipPrdDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtTipPrdDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdRefPrv_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdRefPrv_Internalname,GXutil.rtrim( A728PrdRefPrv),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdRefPrv_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdRefPrv_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdUbicaci_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdUbicaci_Internalname,GXutil.rtrim( A13457PrdUbicaci),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdUbicaci_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdUbicaci_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrdStkMinU_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdStkMinU_Internalname,GXutil.ltrim( localUtil.ntoc( A732PrdStkMinU, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A732PrdStkMinU, "ZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdStkMinU_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdStkMinU_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCantinv_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCantinv_Enabled!=0)&&(edtavCantinv_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 51,'"+sPrefix+"',false,'"+sGXsfl_43_idx+"',43)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCantinv_Internalname,GXutil.ltrim( localUtil.ntoc( AV20CantInv, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCantinv_Enabled!=0) ? localUtil.format( AV20CantInv, "ZZZZZZZZ9.99") : localUtil.format( AV20CantInv, "ZZZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavCantinv_Enabled!=0)&&(edtavCantinv_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,51);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCantinv_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCantinv_Visible),Integer.valueOf(edtavCantinv_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCompras_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCompras_Enabled!=0)&&(edtavCompras_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 52,'"+sPrefix+"',false,'"+sGXsfl_43_idx+"',43)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCompras_Internalname,GXutil.ltrim( localUtil.ntoc( AV21Compras, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCompras_Enabled!=0) ? localUtil.format( AV21Compras, "ZZZZZZZZ9.99") : localUtil.format( AV21Compras, "ZZZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavCompras_Enabled!=0)&&(edtavCompras_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,52);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCompras_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCompras_Visible),Integer.valueOf(edtavCompras_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavConsumos_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavConsumos_Enabled!=0)&&(edtavConsumos_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 53,'"+sPrefix+"',false,'"+sGXsfl_43_idx+"',43)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavConsumos_Internalname,GXutil.ltrim( localUtil.ntoc( AV22Consumos, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavConsumos_Enabled!=0) ? localUtil.format( AV22Consumos, "ZZZZZZZZ9.99") : localUtil.format( AV22Consumos, "ZZZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavConsumos_Enabled!=0)&&(edtavConsumos_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,53);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavConsumos_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavConsumos_Visible),Integer.valueOf(edtavConsumos_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavPrdexialm_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavPrdexialm_Enabled!=0)&&(edtavPrdexialm_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 54,'"+sPrefix+"',false,'"+sGXsfl_43_idx+"',43)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrdexialm_Internalname,GXutil.ltrim( localUtil.ntoc( AV23PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPrdexialm_Enabled!=0) ? localUtil.format( AV23PrdExiAlm, "ZZZZZZ9.9999") : localUtil.format( AV23PrdExiAlm, "ZZZZZZ9.9999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+((edtavPrdexialm_Enabled!=0)&&(edtavPrdexialm_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,54);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPrdexialm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavPrdexialm_Visible),Integer.valueOf(edtavPrdexialm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCantpesada_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCantpesada_Enabled!=0)&&(edtavCantpesada_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 55,'"+sPrefix+"',false,'"+sGXsfl_43_idx+"',43)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCantpesada_Internalname,GXutil.ltrim( localUtil.ntoc( AV24CantPesada, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCantpesada_Enabled!=0) ? localUtil.format( AV24CantPesada, "ZZZZZZZZ9.99") : localUtil.format( AV24CantPesada, "ZZZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavCantpesada_Enabled!=0)&&(edtavCantpesada_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,55);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCantpesada_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCantpesada_Visible),Integer.valueOf(edtavCantpesada_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavStocktotal_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavStocktotal_Enabled!=0)&&(edtavStocktotal_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 56,'"+sPrefix+"',false,'"+sGXsfl_43_idx+"',43)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavStocktotal_Internalname,GXutil.ltrim( localUtil.ntoc( AV25stockTotal, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavStocktotal_Enabled!=0) ? localUtil.format( AV25stockTotal, "ZZZZZZZZ9.99") : localUtil.format( AV25stockTotal, "ZZZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavStocktotal_Enabled!=0)&&(edtavStocktotal_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,56);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavStocktotal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavStocktotal_Visible),Integer.valueOf(edtavStocktotal_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavPrdcanres_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavPrdcanres_Enabled!=0)&&(edtavPrdcanres_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 57,'"+sPrefix+"',false,'"+sGXsfl_43_idx+"',43)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrdcanres_Internalname,GXutil.ltrim( localUtil.ntoc( AV26PrdCanRes, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPrdcanres_Enabled!=0) ? localUtil.format( AV26PrdCanRes, "ZZZZZZ9.9999") : localUtil.format( AV26PrdCanRes, "ZZZZZZ9.9999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+((edtavPrdcanres_Enabled!=0)&&(edtavPrdcanres_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,57);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPrdcanres_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavPrdcanres_Visible),Integer.valueOf(edtavPrdcanres_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavStockdisponible_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavStockdisponible_Enabled!=0)&&(edtavStockdisponible_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 58,'"+sPrefix+"',false,'"+sGXsfl_43_idx+"',43)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavStockdisponible_Internalname,GXutil.ltrim( localUtil.ntoc( AV27StockDisponible, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavStockdisponible_Enabled!=0) ? localUtil.format( AV27StockDisponible, "ZZZZZZZZ9.99") : localUtil.format( AV27StockDisponible, "ZZZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavStockdisponible_Enabled!=0)&&(edtavStockdisponible_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,58);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavStockdisponible_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavStockdisponible_Visible),Integer.valueOf(edtavStockdisponible_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrdPreAct_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdPreAct_Internalname,GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A724PrdPreAct, "ZZZZZZZ9.999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdPreAct_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdPreAct_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavValor0_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavValor0_Enabled!=0)&&(edtavValor0_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 60,'"+sPrefix+"',false,'"+sGXsfl_43_idx+"',43)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavValor0_Internalname,GXutil.ltrim( localUtil.ntoc( AV59valor0, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavValor0_Enabled!=0) ? localUtil.format( AV59valor0, "ZZZZZZ9.99") : localUtil.format( AV59valor0, "ZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavValor0_Enabled!=0)&&(edtavValor0_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,60);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavValor0_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavValor0_Visible),Integer.valueOf(edtavValor0_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrvNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrvNum_Internalname,GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A795PrvNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrvNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrvNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrvNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrvNom_Internalname,GXutil.rtrim( A794PrvNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrvNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrvNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdLote_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdLote_Internalname,GXutil.rtrim( A10881PrdLote),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdLote_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdLote_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtValCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtValCod_Internalname,GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A856ValCod), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtValCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtValCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes13W2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_43_idx = ((subGrid_Islastpage==1)&&(nGXsfl_43_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_43_idx+1) ;
         sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_432( ) ;
      }
      /* End function sendrow_432 */
   }

   public void startgridcontrol43( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"43\">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtTipPrdDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Familia", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdRefPrv_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Uso", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdUbicaci_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Ubicacion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdStkMinU_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Unidades Stock Minimo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCantinv_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Stock Inicial", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCompras_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Compras", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavConsumos_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Consumos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPrdexialm_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Stock Piso", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCantpesada_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Stock Pesado", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavStocktotal_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Stock Total", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPrdcanres_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Reservas", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavStockdisponible_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Stock Disponible", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdPreAct_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Precio Actual", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavValor0_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Valor Stock", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrvNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Proveedor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrvNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre Proveedor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdLote_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Lote", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtValCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Validez", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV69DetailWebComponent));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDetailwebcomponent_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A719PrdNum));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A718PrdNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A6302TipPrdDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtTipPrdDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A728PrdRefPrv));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdRefPrv_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13457PrdUbicaci));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdUbicaci_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A732PrdStkMinU, (byte)(8), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdStkMinU_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV20CantInv, (byte)(12), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCantinv_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCantinv_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV21Compras, (byte)(12), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCompras_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCompras_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV22Consumos, (byte)(12), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavConsumos_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavConsumos_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV23PrdExiAlm, (byte)(12), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrdexialm_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPrdexialm_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV24CantPesada, (byte)(12), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCantpesada_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCantpesada_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV25stockTotal, (byte)(12), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavStocktotal_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavStocktotal_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV26PrdCanRes, (byte)(12), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrdcanres_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPrdcanres_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV27StockDisponible, (byte)(12), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavStockdisponible_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavStockdisponible_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdPreAct_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV59valor0, (byte)(10), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavValor0_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavValor0_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrvNum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A794PrvNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrvNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A10881PrdLote));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdLote_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtValCod_Visible, (byte)(5), (byte)(0), ".", "")));
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
      bttBtnexportreport_Internalname = sPrefix+"BTNEXPORTREPORT" ;
      bttBtneditcolumns_Internalname = sPrefix+"BTNEDITCOLUMNS" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      Ddo_managefilters_Internalname = sPrefix+"DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = sPrefix+"vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = sPrefix+"TABLEFILTERS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      edtavDetailwebcomponent_Internalname = sPrefix+"vDETAILWEBCOMPONENT" ;
      edtPrdNum_Internalname = sPrefix+"PRDNUM" ;
      edtPrdNom_Internalname = sPrefix+"PRDNOM" ;
      edtTipPrdDsc_Internalname = sPrefix+"TIPPRDDSC" ;
      edtPrdRefPrv_Internalname = sPrefix+"PRDREFPRV" ;
      edtPrdUbicaci_Internalname = sPrefix+"PRDUBICACI" ;
      edtPrdStkMinU_Internalname = sPrefix+"PRDSTKMINU" ;
      edtavCantinv_Internalname = sPrefix+"vCANTINV" ;
      edtavCompras_Internalname = sPrefix+"vCOMPRAS" ;
      edtavConsumos_Internalname = sPrefix+"vCONSUMOS" ;
      edtavPrdexialm_Internalname = sPrefix+"vPRDEXIALM" ;
      edtavCantpesada_Internalname = sPrefix+"vCANTPESADA" ;
      edtavStocktotal_Internalname = sPrefix+"vSTOCKTOTAL" ;
      edtavPrdcanres_Internalname = sPrefix+"vPRDCANRES" ;
      edtavStockdisponible_Internalname = sPrefix+"vSTOCKDISPONIBLE" ;
      edtPrdPreAct_Internalname = sPrefix+"PRDPREACT" ;
      edtavValor0_Internalname = sPrefix+"vVALOR0" ;
      edtPrvNum_Internalname = sPrefix+"PRVNUM" ;
      edtPrvNom_Internalname = sPrefix+"PRVNOM" ;
      edtPrdLote_Internalname = sPrefix+"PRDLOTE" ;
      edtValCod_Internalname = sPrefix+"VALCOD" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divCell_grid_dwc_Internalname = sPrefix+"CELL_GRID_DWC" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      lblTextblock1_Internalname = sPrefix+"TEXTBLOCK1" ;
      lblTextblock2_Internalname = sPrefix+"TEXTBLOCK2" ;
      lblTextblock3_Internalname = sPrefix+"TEXTBLOCK3" ;
      lblTextblock4_Internalname = sPrefix+"TEXTBLOCK4" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE1" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Innewwindow1_Internalname = sPrefix+"INNEWWINDOW1" ;
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
      edtValCod_Jsonclick = "" ;
      edtPrdLote_Jsonclick = "" ;
      edtPrvNom_Jsonclick = "" ;
      edtPrvNum_Jsonclick = "" ;
      edtavValor0_Jsonclick = "" ;
      edtavValor0_Enabled = 1 ;
      edtPrdPreAct_Jsonclick = "" ;
      edtavStockdisponible_Jsonclick = "" ;
      edtavStockdisponible_Enabled = 1 ;
      edtavPrdcanres_Jsonclick = "" ;
      edtavPrdcanres_Enabled = 1 ;
      edtavStocktotal_Jsonclick = "" ;
      edtavStocktotal_Enabled = 1 ;
      edtavCantpesada_Jsonclick = "" ;
      edtavCantpesada_Enabled = 1 ;
      edtavPrdexialm_Jsonclick = "" ;
      edtavPrdexialm_Enabled = 1 ;
      edtavConsumos_Jsonclick = "" ;
      edtavConsumos_Enabled = 1 ;
      edtavCompras_Jsonclick = "" ;
      edtavCompras_Enabled = 1 ;
      edtavCantinv_Jsonclick = "" ;
      edtavCantinv_Enabled = 1 ;
      edtPrdStkMinU_Jsonclick = "" ;
      edtPrdUbicaci_Jsonclick = "" ;
      edtPrdRefPrv_Jsonclick = "" ;
      edtTipPrdDsc_Jsonclick = "" ;
      edtPrdNom_Jsonclick = "" ;
      edtPrdNum_Jsonclick = "" ;
      edtavDetailwebcomponent_Jsonclick = "" ;
      edtavDetailwebcomponent_Visible = -1 ;
      edtavDetailwebcomponent_Enabled = 1 ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtValCod_Visible = -1 ;
      edtPrdLote_Visible = -1 ;
      edtPrvNom_Visible = -1 ;
      edtPrvNum_Visible = -1 ;
      edtavValor0_Visible = -1 ;
      edtPrdPreAct_Visible = -1 ;
      edtavStockdisponible_Visible = -1 ;
      edtavPrdcanres_Visible = -1 ;
      edtavStocktotal_Visible = -1 ;
      edtavCantpesada_Visible = -1 ;
      edtavPrdexialm_Visible = -1 ;
      edtavConsumos_Visible = -1 ;
      edtavCompras_Visible = -1 ;
      edtavCantinv_Visible = -1 ;
      edtPrdStkMinU_Visible = -1 ;
      edtPrdUbicaci_Visible = -1 ;
      edtPrdRefPrv_Visible = -1 ;
      edtTipPrdDsc_Visible = -1 ;
      edtPrdNom_Visible = -1 ;
      edtPrdNum_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      divCell_grid_dwc_Class = "col-xs-12" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Innewwindow1_Target = "" ;
      Innewwindow1_Height = "50" ;
      Innewwindow1_Width = "50" ;
      Ddo_grid_Datalistproc = "WCWWkp89GetFilterData" ;
      Ddo_grid_Datalisttype = "Dynamic|Dynamic|Dynamic|Dynamic|Dynamic|||||||||||||Dynamic|Dynamic|" ;
      Ddo_grid_Includedatalist = "T|T|T|T|T|||||||||||||T|T|" ;
      Ddo_grid_Filterisrange = "|||||T|||||||||T||T|||T" ;
      Ddo_grid_Filtertype = "Character|Character|Character|Character|Character|Numeric|||||||||Numeric||Numeric|Character|Character|Numeric" ;
      Ddo_grid_Includefilter = "T|T|T|T|T|T|||||||||T||T|T|T|T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T|T|T|T|T|||||||||T||T|T|T|T" ;
      Ddo_grid_Columnssortvalues = "1|2|3|4|5|6|||||||||7||8|9|10|11" ;
      Ddo_grid_Columnids = "1:PrdNum|2:PrdNom|3:TipPrdDsc|4:PrdRefPrv|5:PrdUbicacion|6:PrdStkMinU|7:CantInv|8:Compras|9:Consumos|10:PrdExiAlm|11:CantPesada|12:stockTotal|13:PrdCanRes|14:StockDisponible|15:PrdPreAct|16:valor0|17:PrvNum|18:PrvNom|19:PrdLote|20:ValCod" ;
      Ddo_grid_Gridinternalname = "" ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Descripcion columnas", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV20CantInv',fld:'vCANTINV',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV21Compras',fld:'vCOMPRAS',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV22Consumos',fld:'vCONSUMOS',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV24CantPesada',fld:'vCANTPESADA',pic:'ZZZZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'AV37ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV32ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Prdnum',fld:'vPRDNUM',pic:''},{av:'AV7Prdnum_to',fld:'vPRDNUM_TO',pic:''},{av:'AV72ValCodfrom',fld:'vVALCODFROM',pic:'ZZZ9'},{av:'AV73ValCodto',fld:'vVALCODTO',pic:'ZZZ9'},{av:'AV38TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV39TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV40TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV41TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV42TFTipPrdDsc',fld:'vTFTIPPRDDSC',pic:''},{av:'AV43TFTipPrdDsc_Sel',fld:'vTFTIPPRDDSC_SEL',pic:''},{av:'AV44TFPrdRefPrv',fld:'vTFPRDREFPRV',pic:''},{av:'AV45TFPrdRefPrv_Sel',fld:'vTFPRDREFPRV_SEL',pic:''},{av:'AV46TFPrdUbicacion',fld:'vTFPRDUBICACION',pic:''},{av:'AV47TFPrdUbicacion_Sel',fld:'vTFPRDUBICACION_SEL',pic:''},{av:'AV48TFPrdStkMinU',fld:'vTFPRDSTKMINU',pic:'ZZZZ9.99'},{av:'AV49TFPrdStkMinU_To',fld:'vTFPRDSTKMINU_TO',pic:'ZZZZ9.99'},{av:'AV60TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV61TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV62TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV63TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV64TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV65TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV70TFPrdLote',fld:'vTFPRDLOTE',pic:''},{av:'AV71TFPrdLote_Sel',fld:'vTFPRDLOTE_SEL',pic:''},{av:'AV74TFValCod',fld:'vTFVALCOD',pic:'9'},{av:'AV75TFValCod_To',fld:'vTFVALCOD_TO',pic:'9'},{av:'AV78Pgmname',fld:'vPGMNAME',pic:''},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV8Seleccion',fld:'vSELECCION',pic:'9'},{av:'AV54compras2',fld:'vCOMPRAS2',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV55consumos2',fld:'vCONSUMOS2',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV56obsp',fld:'vOBSP',pic:'',hsh:true},{av:'AV57cantRes',fld:'vCANTRES',pic:'ZZZZZZZ9.999',hsh:true},{av:'AV68Cantpdte',fld:'vCANTPDTE',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV58InciCPEDID',fld:'vINCICPEDID',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV37ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV32ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtTipPrdDsc_Visible',ctrl:'TIPPRDDSC',prop:'Visible'},{av:'edtPrdRefPrv_Visible',ctrl:'PRDREFPRV',prop:'Visible'},{av:'edtPrdUbicaci_Visible',ctrl:'PRDUBICACI',prop:'Visible'},{av:'edtPrdStkMinU_Visible',ctrl:'PRDSTKMINU',prop:'Visible'},{av:'edtavCantinv_Visible',ctrl:'vCANTINV',prop:'Visible'},{av:'edtavCompras_Visible',ctrl:'vCOMPRAS',prop:'Visible'},{av:'edtavConsumos_Visible',ctrl:'vCONSUMOS',prop:'Visible'},{av:'edtavPrdexialm_Visible',ctrl:'vPRDEXIALM',prop:'Visible'},{av:'edtavCantpesada_Visible',ctrl:'vCANTPESADA',prop:'Visible'},{av:'edtavStocktotal_Visible',ctrl:'vSTOCKTOTAL',prop:'Visible'},{av:'edtavPrdcanres_Visible',ctrl:'vPRDCANRES',prop:'Visible'},{av:'edtavStockdisponible_Visible',ctrl:'vSTOCKDISPONIBLE',prop:'Visible'},{av:'edtPrdPreAct_Visible',ctrl:'PRDPREACT',prop:'Visible'},{av:'edtavValor0_Visible',ctrl:'vVALOR0',prop:'Visible'},{av:'edtPrvNum_Visible',ctrl:'PRVNUM',prop:'Visible'},{av:'edtPrvNom_Visible',ctrl:'PRVNOM',prop:'Visible'},{av:'edtPrdLote_Visible',ctrl:'PRDLOTE',prop:'Visible'},{av:'edtValCod_Visible',ctrl:'VALCOD',prop:'Visible'},{av:'AV52GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV53GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV35ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e1313W2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Prdnum',fld:'vPRDNUM',pic:''},{av:'AV7Prdnum_to',fld:'vPRDNUM_TO',pic:''},{av:'AV72ValCodfrom',fld:'vVALCODFROM',pic:'ZZZ9'},{av:'AV73ValCodto',fld:'vVALCODTO',pic:'ZZZ9'},{av:'AV37ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV32ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV38TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV39TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV40TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV41TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV42TFTipPrdDsc',fld:'vTFTIPPRDDSC',pic:''},{av:'AV43TFTipPrdDsc_Sel',fld:'vTFTIPPRDDSC_SEL',pic:''},{av:'AV44TFPrdRefPrv',fld:'vTFPRDREFPRV',pic:''},{av:'AV45TFPrdRefPrv_Sel',fld:'vTFPRDREFPRV_SEL',pic:''},{av:'AV46TFPrdUbicacion',fld:'vTFPRDUBICACION',pic:''},{av:'AV47TFPrdUbicacion_Sel',fld:'vTFPRDUBICACION_SEL',pic:''},{av:'AV48TFPrdStkMinU',fld:'vTFPRDSTKMINU',pic:'ZZZZ9.99'},{av:'AV49TFPrdStkMinU_To',fld:'vTFPRDSTKMINU_TO',pic:'ZZZZ9.99'},{av:'AV60TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV61TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV62TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV63TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV64TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV65TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV70TFPrdLote',fld:'vTFPRDLOTE',pic:''},{av:'AV71TFPrdLote_Sel',fld:'vTFPRDLOTE_SEL',pic:''},{av:'AV74TFValCod',fld:'vTFVALCOD',pic:'9'},{av:'AV75TFValCod_To',fld:'vTFVALCOD_TO',pic:'9'},{av:'AV78Pgmname',fld:'vPGMNAME',pic:''},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV8Seleccion',fld:'vSELECCION',pic:'9'},{av:'AV20CantInv',fld:'vCANTINV',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV21Compras',fld:'vCOMPRAS',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV22Consumos',fld:'vCONSUMOS',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV54compras2',fld:'vCOMPRAS2',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV55consumos2',fld:'vCONSUMOS2',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV56obsp',fld:'vOBSP',pic:'',hsh:true},{av:'AV57cantRes',fld:'vCANTRES',pic:'ZZZZZZZ9.999',hsh:true},{av:'AV24CantPesada',fld:'vCANTPESADA',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV68Cantpdte',fld:'vCANTPDTE',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV58InciCPEDID',fld:'vINCICPEDID',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1413W2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Prdnum',fld:'vPRDNUM',pic:''},{av:'AV7Prdnum_to',fld:'vPRDNUM_TO',pic:''},{av:'AV72ValCodfrom',fld:'vVALCODFROM',pic:'ZZZ9'},{av:'AV73ValCodto',fld:'vVALCODTO',pic:'ZZZ9'},{av:'AV37ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV32ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV38TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV39TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV40TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV41TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV42TFTipPrdDsc',fld:'vTFTIPPRDDSC',pic:''},{av:'AV43TFTipPrdDsc_Sel',fld:'vTFTIPPRDDSC_SEL',pic:''},{av:'AV44TFPrdRefPrv',fld:'vTFPRDREFPRV',pic:''},{av:'AV45TFPrdRefPrv_Sel',fld:'vTFPRDREFPRV_SEL',pic:''},{av:'AV46TFPrdUbicacion',fld:'vTFPRDUBICACION',pic:''},{av:'AV47TFPrdUbicacion_Sel',fld:'vTFPRDUBICACION_SEL',pic:''},{av:'AV48TFPrdStkMinU',fld:'vTFPRDSTKMINU',pic:'ZZZZ9.99'},{av:'AV49TFPrdStkMinU_To',fld:'vTFPRDSTKMINU_TO',pic:'ZZZZ9.99'},{av:'AV60TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV61TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV62TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV63TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV64TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV65TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV70TFPrdLote',fld:'vTFPRDLOTE',pic:''},{av:'AV71TFPrdLote_Sel',fld:'vTFPRDLOTE_SEL',pic:''},{av:'AV74TFValCod',fld:'vTFVALCOD',pic:'9'},{av:'AV75TFValCod_To',fld:'vTFVALCOD_TO',pic:'9'},{av:'AV78Pgmname',fld:'vPGMNAME',pic:''},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV8Seleccion',fld:'vSELECCION',pic:'9'},{av:'AV20CantInv',fld:'vCANTINV',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV21Compras',fld:'vCOMPRAS',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV22Consumos',fld:'vCONSUMOS',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV54compras2',fld:'vCOMPRAS2',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV55consumos2',fld:'vCONSUMOS2',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV56obsp',fld:'vOBSP',pic:'',hsh:true},{av:'AV57cantRes',fld:'vCANTRES',pic:'ZZZZZZZ9.999',hsh:true},{av:'AV24CantPesada',fld:'vCANTPESADA',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV68Cantpdte',fld:'vCANTPDTE',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV58InciCPEDID',fld:'vINCICPEDID',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e1513W2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Prdnum',fld:'vPRDNUM',pic:''},{av:'AV7Prdnum_to',fld:'vPRDNUM_TO',pic:''},{av:'AV72ValCodfrom',fld:'vVALCODFROM',pic:'ZZZ9'},{av:'AV73ValCodto',fld:'vVALCODTO',pic:'ZZZ9'},{av:'AV37ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV32ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV38TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV39TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV40TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV41TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV42TFTipPrdDsc',fld:'vTFTIPPRDDSC',pic:''},{av:'AV43TFTipPrdDsc_Sel',fld:'vTFTIPPRDDSC_SEL',pic:''},{av:'AV44TFPrdRefPrv',fld:'vTFPRDREFPRV',pic:''},{av:'AV45TFPrdRefPrv_Sel',fld:'vTFPRDREFPRV_SEL',pic:''},{av:'AV46TFPrdUbicacion',fld:'vTFPRDUBICACION',pic:''},{av:'AV47TFPrdUbicacion_Sel',fld:'vTFPRDUBICACION_SEL',pic:''},{av:'AV48TFPrdStkMinU',fld:'vTFPRDSTKMINU',pic:'ZZZZ9.99'},{av:'AV49TFPrdStkMinU_To',fld:'vTFPRDSTKMINU_TO',pic:'ZZZZ9.99'},{av:'AV60TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV61TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV62TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV63TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV64TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV65TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV70TFPrdLote',fld:'vTFPRDLOTE',pic:''},{av:'AV71TFPrdLote_Sel',fld:'vTFPRDLOTE_SEL',pic:''},{av:'AV74TFValCod',fld:'vTFVALCOD',pic:'9'},{av:'AV75TFValCod_To',fld:'vTFVALCOD_TO',pic:'9'},{av:'AV78Pgmname',fld:'vPGMNAME',pic:''},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV8Seleccion',fld:'vSELECCION',pic:'9'},{av:'AV20CantInv',fld:'vCANTINV',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV21Compras',fld:'vCOMPRAS',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV22Consumos',fld:'vCONSUMOS',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV54compras2',fld:'vCOMPRAS2',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV55consumos2',fld:'vCONSUMOS2',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV56obsp',fld:'vOBSP',pic:'',hsh:true},{av:'AV57cantRes',fld:'vCANTRES',pic:'ZZZZZZZ9.999',hsh:true},{av:'AV24CantPesada',fld:'vCANTPESADA',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV68Cantpdte',fld:'vCANTPDTE',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV58InciCPEDID',fld:'vINCICPEDID',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV74TFValCod',fld:'vTFVALCOD',pic:'9'},{av:'AV75TFValCod_To',fld:'vTFVALCOD_TO',pic:'9'},{av:'AV70TFPrdLote',fld:'vTFPRDLOTE',pic:''},{av:'AV71TFPrdLote_Sel',fld:'vTFPRDLOTE_SEL',pic:''},{av:'AV64TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV65TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV62TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV63TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV60TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV61TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV48TFPrdStkMinU',fld:'vTFPRDSTKMINU',pic:'ZZZZ9.99'},{av:'AV49TFPrdStkMinU_To',fld:'vTFPRDSTKMINU_TO',pic:'ZZZZ9.99'},{av:'AV46TFPrdUbicacion',fld:'vTFPRDUBICACION',pic:''},{av:'AV47TFPrdUbicacion_Sel',fld:'vTFPRDUBICACION_SEL',pic:''},{av:'AV44TFPrdRefPrv',fld:'vTFPRDREFPRV',pic:''},{av:'AV45TFPrdRefPrv_Sel',fld:'vTFPRDREFPRV_SEL',pic:''},{av:'AV42TFTipPrdDsc',fld:'vTFTIPPRDDSC',pic:''},{av:'AV43TFTipPrdDsc_Sel',fld:'vTFTIPPRDDSC_SEL',pic:''},{av:'AV40TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV41TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV38TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV39TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e2113W2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A719PrdNum',fld:'PRDNUM',pic:'',hsh:true},{av:'AV20CantInv',fld:'vCANTINV',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV21Compras',fld:'vCOMPRAS',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV22Consumos',fld:'vCONSUMOS',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV54compras2',fld:'vCOMPRAS2',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV55consumos2',fld:'vCONSUMOS2',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV56obsp',fld:'vOBSP',pic:'',hsh:true},{av:'AV57cantRes',fld:'vCANTRES',pic:'ZZZZZZZ9.999',hsh:true},{av:'AV24CantPesada',fld:'vCANTPESADA',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV68Cantpdte',fld:'vCANTPDTE',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV58InciCPEDID',fld:'vINCICPEDID',pic:'',hsh:true},{av:'A704PrdExiAlm',fld:'PRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'A685PrdCanRes',fld:'PRDCANRES',pic:'ZZZZZZ9.9999'},{av:'A724PrdPreAct',fld:'PRDPREACT',pic:'ZZZZZZZ9.999'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV69DetailWebComponent',fld:'vDETAILWEBCOMPONENT',pic:''},{av:'AV56obsp',fld:'vOBSP',pic:'',hsh:true},{av:'AV55consumos2',fld:'vCONSUMOS2',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV54compras2',fld:'vCOMPRAS2',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV22Consumos',fld:'vCONSUMOS',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV21Compras',fld:'vCOMPRAS',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV20CantInv',fld:'vCANTINV',pic:'ZZZZZZZZ9.99',hsh:true},{av:'A719PrdNum',fld:'PRDNUM',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV58InciCPEDID',fld:'vINCICPEDID',pic:'',hsh:true},{av:'AV68Cantpdte',fld:'vCANTPDTE',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV24CantPesada',fld:'vCANTPESADA',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV57cantRes',fld:'vCANTRES',pic:'ZZZZZZZ9.999',hsh:true},{av:'AV23PrdExiAlm',fld:'vPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV25stockTotal',fld:'vSTOCKTOTAL',pic:'ZZZZZZZZ9.99'},{av:'AV26PrdCanRes',fld:'vPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV27StockDisponible',fld:'vSTOCKDISPONIBLE',pic:'ZZZZZZZZ9.99'},{av:'AV59valor0',fld:'vVALOR0',pic:'ZZZZZZ9.99'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e1613W2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Prdnum',fld:'vPRDNUM',pic:''},{av:'AV7Prdnum_to',fld:'vPRDNUM_TO',pic:''},{av:'AV72ValCodfrom',fld:'vVALCODFROM',pic:'ZZZ9'},{av:'AV73ValCodto',fld:'vVALCODTO',pic:'ZZZ9'},{av:'AV37ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV32ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV38TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV39TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV40TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV41TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV42TFTipPrdDsc',fld:'vTFTIPPRDDSC',pic:''},{av:'AV43TFTipPrdDsc_Sel',fld:'vTFTIPPRDDSC_SEL',pic:''},{av:'AV44TFPrdRefPrv',fld:'vTFPRDREFPRV',pic:''},{av:'AV45TFPrdRefPrv_Sel',fld:'vTFPRDREFPRV_SEL',pic:''},{av:'AV46TFPrdUbicacion',fld:'vTFPRDUBICACION',pic:''},{av:'AV47TFPrdUbicacion_Sel',fld:'vTFPRDUBICACION_SEL',pic:''},{av:'AV48TFPrdStkMinU',fld:'vTFPRDSTKMINU',pic:'ZZZZ9.99'},{av:'AV49TFPrdStkMinU_To',fld:'vTFPRDSTKMINU_TO',pic:'ZZZZ9.99'},{av:'AV60TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV61TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV62TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV63TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV64TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV65TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV70TFPrdLote',fld:'vTFPRDLOTE',pic:''},{av:'AV71TFPrdLote_Sel',fld:'vTFPRDLOTE_SEL',pic:''},{av:'AV74TFValCod',fld:'vTFVALCOD',pic:'9'},{av:'AV75TFValCod_To',fld:'vTFVALCOD_TO',pic:'9'},{av:'AV78Pgmname',fld:'vPGMNAME',pic:''},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV8Seleccion',fld:'vSELECCION',pic:'9'},{av:'AV20CantInv',fld:'vCANTINV',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV21Compras',fld:'vCOMPRAS',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV22Consumos',fld:'vCONSUMOS',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV54compras2',fld:'vCOMPRAS2',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV55consumos2',fld:'vCONSUMOS2',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV56obsp',fld:'vOBSP',pic:'',hsh:true},{av:'AV57cantRes',fld:'vCANTRES',pic:'ZZZZZZZ9.999',hsh:true},{av:'AV24CantPesada',fld:'vCANTPESADA',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV68Cantpdte',fld:'vCANTPDTE',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV58InciCPEDID',fld:'vINCICPEDID',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV32ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV37ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtTipPrdDsc_Visible',ctrl:'TIPPRDDSC',prop:'Visible'},{av:'edtPrdRefPrv_Visible',ctrl:'PRDREFPRV',prop:'Visible'},{av:'edtPrdUbicaci_Visible',ctrl:'PRDUBICACI',prop:'Visible'},{av:'edtPrdStkMinU_Visible',ctrl:'PRDSTKMINU',prop:'Visible'},{av:'edtavCantinv_Visible',ctrl:'vCANTINV',prop:'Visible'},{av:'edtavCompras_Visible',ctrl:'vCOMPRAS',prop:'Visible'},{av:'edtavConsumos_Visible',ctrl:'vCONSUMOS',prop:'Visible'},{av:'edtavPrdexialm_Visible',ctrl:'vPRDEXIALM',prop:'Visible'},{av:'edtavCantpesada_Visible',ctrl:'vCANTPESADA',prop:'Visible'},{av:'edtavStocktotal_Visible',ctrl:'vSTOCKTOTAL',prop:'Visible'},{av:'edtavPrdcanres_Visible',ctrl:'vPRDCANRES',prop:'Visible'},{av:'edtavStockdisponible_Visible',ctrl:'vSTOCKDISPONIBLE',prop:'Visible'},{av:'edtPrdPreAct_Visible',ctrl:'PRDPREACT',prop:'Visible'},{av:'edtavValor0_Visible',ctrl:'vVALOR0',prop:'Visible'},{av:'edtPrvNum_Visible',ctrl:'PRVNUM',prop:'Visible'},{av:'edtPrvNom_Visible',ctrl:'PRVNOM',prop:'Visible'},{av:'edtPrdLote_Visible',ctrl:'PRDLOTE',prop:'Visible'},{av:'edtValCod_Visible',ctrl:'VALCOD',prop:'Visible'},{av:'AV52GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV53GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV35ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e1213W2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Prdnum',fld:'vPRDNUM',pic:''},{av:'AV7Prdnum_to',fld:'vPRDNUM_TO',pic:''},{av:'AV72ValCodfrom',fld:'vVALCODFROM',pic:'ZZZ9'},{av:'AV73ValCodto',fld:'vVALCODTO',pic:'ZZZ9'},{av:'AV37ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV32ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV38TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV39TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV40TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV41TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV42TFTipPrdDsc',fld:'vTFTIPPRDDSC',pic:''},{av:'AV43TFTipPrdDsc_Sel',fld:'vTFTIPPRDDSC_SEL',pic:''},{av:'AV44TFPrdRefPrv',fld:'vTFPRDREFPRV',pic:''},{av:'AV45TFPrdRefPrv_Sel',fld:'vTFPRDREFPRV_SEL',pic:''},{av:'AV46TFPrdUbicacion',fld:'vTFPRDUBICACION',pic:''},{av:'AV47TFPrdUbicacion_Sel',fld:'vTFPRDUBICACION_SEL',pic:''},{av:'AV48TFPrdStkMinU',fld:'vTFPRDSTKMINU',pic:'ZZZZ9.99'},{av:'AV49TFPrdStkMinU_To',fld:'vTFPRDSTKMINU_TO',pic:'ZZZZ9.99'},{av:'AV60TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV61TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV62TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV63TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV64TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV65TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV70TFPrdLote',fld:'vTFPRDLOTE',pic:''},{av:'AV71TFPrdLote_Sel',fld:'vTFPRDLOTE_SEL',pic:''},{av:'AV74TFValCod',fld:'vTFVALCOD',pic:'9'},{av:'AV75TFValCod_To',fld:'vTFVALCOD_TO',pic:'9'},{av:'AV78Pgmname',fld:'vPGMNAME',pic:''},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV8Seleccion',fld:'vSELECCION',pic:'9'},{av:'AV20CantInv',fld:'vCANTINV',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV21Compras',fld:'vCOMPRAS',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV22Consumos',fld:'vCONSUMOS',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV54compras2',fld:'vCOMPRAS2',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV55consumos2',fld:'vCONSUMOS2',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV56obsp',fld:'vOBSP',pic:'',hsh:true},{av:'AV57cantRes',fld:'vCANTRES',pic:'ZZZZZZZ9.999',hsh:true},{av:'AV24CantPesada',fld:'vCANTPESADA',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV68Cantpdte',fld:'vCANTPDTE',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV58InciCPEDID',fld:'vINCICPEDID',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV37ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV38TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV39TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV40TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV41TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV42TFTipPrdDsc',fld:'vTFTIPPRDDSC',pic:''},{av:'AV43TFTipPrdDsc_Sel',fld:'vTFTIPPRDDSC_SEL',pic:''},{av:'AV44TFPrdRefPrv',fld:'vTFPRDREFPRV',pic:''},{av:'AV45TFPrdRefPrv_Sel',fld:'vTFPRDREFPRV_SEL',pic:''},{av:'AV46TFPrdUbicacion',fld:'vTFPRDUBICACION',pic:''},{av:'AV47TFPrdUbicacion_Sel',fld:'vTFPRDUBICACION_SEL',pic:''},{av:'AV48TFPrdStkMinU',fld:'vTFPRDSTKMINU',pic:'ZZZZ9.99'},{av:'AV49TFPrdStkMinU_To',fld:'vTFPRDSTKMINU_TO',pic:'ZZZZ9.99'},{av:'AV60TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV61TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV62TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV63TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV64TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV65TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV70TFPrdLote',fld:'vTFPRDLOTE',pic:''},{av:'AV71TFPrdLote_Sel',fld:'vTFPRDLOTE_SEL',pic:''},{av:'AV74TFValCod',fld:'vTFVALCOD',pic:'9'},{av:'AV75TFValCod_To',fld:'vTFVALCOD_TO',pic:'9'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV32ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtTipPrdDsc_Visible',ctrl:'TIPPRDDSC',prop:'Visible'},{av:'edtPrdRefPrv_Visible',ctrl:'PRDREFPRV',prop:'Visible'},{av:'edtPrdUbicaci_Visible',ctrl:'PRDUBICACI',prop:'Visible'},{av:'edtPrdStkMinU_Visible',ctrl:'PRDSTKMINU',prop:'Visible'},{av:'edtavCantinv_Visible',ctrl:'vCANTINV',prop:'Visible'},{av:'edtavCompras_Visible',ctrl:'vCOMPRAS',prop:'Visible'},{av:'edtavConsumos_Visible',ctrl:'vCONSUMOS',prop:'Visible'},{av:'edtavPrdexialm_Visible',ctrl:'vPRDEXIALM',prop:'Visible'},{av:'edtavCantpesada_Visible',ctrl:'vCANTPESADA',prop:'Visible'},{av:'edtavStocktotal_Visible',ctrl:'vSTOCKTOTAL',prop:'Visible'},{av:'edtavPrdcanres_Visible',ctrl:'vPRDCANRES',prop:'Visible'},{av:'edtavStockdisponible_Visible',ctrl:'vSTOCKDISPONIBLE',prop:'Visible'},{av:'edtPrdPreAct_Visible',ctrl:'PRDPREACT',prop:'Visible'},{av:'edtavValor0_Visible',ctrl:'vVALOR0',prop:'Visible'},{av:'edtPrvNum_Visible',ctrl:'PRVNUM',prop:'Visible'},{av:'edtPrvNom_Visible',ctrl:'PRVNOM',prop:'Visible'},{av:'edtPrdLote_Visible',ctrl:'PRDLOTE',prop:'Visible'},{av:'edtValCod_Visible',ctrl:'VALCOD',prop:'Visible'},{av:'AV52GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV53GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV35ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e1713W2',iparms:[]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e1113W1',iparms:[]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'Innewwindow1_Target',ctrl:'INNEWWINDOW1',prop:'Target'},{av:'Innewwindow1_Height',ctrl:'INNEWWINDOW1',prop:'Height'},{av:'Innewwindow1_Width',ctrl:'INNEWWINDOW1',prop:'Width'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e1813W2',iparms:[]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK","{handler:'e2213W2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A719PrdNum',fld:'PRDNUM',pic:'',hsh:true}]");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK",",oparms:[{ctrl:'GRID_DWC'}]}");
      setEventMetadata("VALID_PRVNUM","{handler:'valid_Prvnum',iparms:[]");
      setEventMetadata("VALID_PRVNUM",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Valcod',iparms:[]");
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
      wcpOAV5Emprcod = "" ;
      wcpOAV6Prdnum = "" ;
      wcpOAV7Prdnum_to = "" ;
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
      AV5Emprcod = "" ;
      AV6Prdnum = "" ;
      AV7Prdnum_to = "" ;
      AV19FilterFullText = "" ;
      AV32ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV38TFPrdNum = "" ;
      AV39TFPrdNum_Sel = "" ;
      AV40TFPrdNom = "" ;
      AV41TFPrdNom_Sel = "" ;
      AV42TFTipPrdDsc = "" ;
      AV43TFTipPrdDsc_Sel = "" ;
      AV44TFPrdRefPrv = "" ;
      AV45TFPrdRefPrv_Sel = "" ;
      AV46TFPrdUbicacion = "" ;
      AV47TFPrdUbicacion_Sel = "" ;
      AV48TFPrdStkMinU = DecimalUtil.ZERO ;
      AV49TFPrdStkMinU_To = DecimalUtil.ZERO ;
      AV60TFPrdPreAct = DecimalUtil.ZERO ;
      AV61TFPrdPreAct_To = DecimalUtil.ZERO ;
      AV64TFPrvNom = "" ;
      AV65TFPrvNom_Sel = "" ;
      AV70TFPrdLote = "" ;
      AV71TFPrdLote_Sel = "" ;
      AV78Pgmname = "" ;
      AV20CantInv = DecimalUtil.ZERO ;
      AV21Compras = DecimalUtil.ZERO ;
      AV22Consumos = DecimalUtil.ZERO ;
      AV54compras2 = DecimalUtil.ZERO ;
      AV55consumos2 = DecimalUtil.ZERO ;
      AV56obsp = "" ;
      AV57cantRes = DecimalUtil.ZERO ;
      AV24CantPesada = DecimalUtil.ZERO ;
      AV68Cantpdte = DecimalUtil.ZERO ;
      AV58InciCPEDID = "" ;
      A396EmprCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV35ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV50DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      AV14GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
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
      bttBtnexportreport_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      WebComp_Grid_dwc_Component = "" ;
      OldGrid_dwc = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      lblTextblock1_Jsonclick = "" ;
      lblTextblock2_Jsonclick = "" ;
      lblTextblock3_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucInnewwindow1 = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV69DetailWebComponent = "" ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A6302TipPrdDsc = "" ;
      A728PrdRefPrv = "" ;
      A13457PrdUbicaci = "" ;
      A732PrdStkMinU = DecimalUtil.ZERO ;
      AV23PrdExiAlm = DecimalUtil.ZERO ;
      AV25stockTotal = DecimalUtil.ZERO ;
      AV26PrdCanRes = DecimalUtil.ZERO ;
      AV27StockDisponible = DecimalUtil.ZERO ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      AV59valor0 = DecimalUtil.ZERO ;
      A794PrvNom = "" ;
      A10881PrdLote = "" ;
      scmdbuf = "" ;
      lV82Wcwwkp89ds_1_filterfulltext = "" ;
      lV83Wcwwkp89ds_2_tfprdnum = "" ;
      lV85Wcwwkp89ds_4_tfprdnom = "" ;
      lV87Wcwwkp89ds_6_tftipprddsc = "" ;
      lV89Wcwwkp89ds_8_tfprdrefprv = "" ;
      lV91Wcwwkp89ds_10_tfprdubicacion = "" ;
      lV99Wcwwkp89ds_18_tfprvnom = "" ;
      lV101Wcwwkp89ds_20_tfprdlote = "" ;
      AV82Wcwwkp89ds_1_filterfulltext = "" ;
      AV84Wcwwkp89ds_3_tfprdnum_sel = "" ;
      AV83Wcwwkp89ds_2_tfprdnum = "" ;
      AV86Wcwwkp89ds_5_tfprdnom_sel = "" ;
      AV85Wcwwkp89ds_4_tfprdnom = "" ;
      AV88Wcwwkp89ds_7_tftipprddsc_sel = "" ;
      AV87Wcwwkp89ds_6_tftipprddsc = "" ;
      AV90Wcwwkp89ds_9_tfprdrefprv_sel = "" ;
      AV89Wcwwkp89ds_8_tfprdrefprv = "" ;
      AV92Wcwwkp89ds_11_tfprdubicacion_sel = "" ;
      AV91Wcwwkp89ds_10_tfprdubicacion = "" ;
      AV93Wcwwkp89ds_12_tfprdstkminu = DecimalUtil.ZERO ;
      AV94Wcwwkp89ds_13_tfprdstkminu_to = DecimalUtil.ZERO ;
      AV95Wcwwkp89ds_14_tfprdpreact = DecimalUtil.ZERO ;
      AV96Wcwwkp89ds_15_tfprdpreact_to = DecimalUtil.ZERO ;
      AV100Wcwwkp89ds_19_tfprvnom_sel = "" ;
      AV99Wcwwkp89ds_18_tfprvnom = "" ;
      AV102Wcwwkp89ds_21_tfprdlote_sel = "" ;
      AV101Wcwwkp89ds_20_tfprdlote = "" ;
      H013W2_A6301TipPrdCod = new short[1] ;
      H013W2_n6301TipPrdCod = new boolean[] {false} ;
      H013W2_A396EmprCod = new String[] {""} ;
      H013W2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H013W2_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H013W2_A856ValCod = new byte[1] ;
      H013W2_A10881PrdLote = new String[] {""} ;
      H013W2_A794PrvNom = new String[] {""} ;
      H013W2_n794PrvNom = new boolean[] {false} ;
      H013W2_A795PrvNum = new int[1] ;
      H013W2_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H013W2_A732PrdStkMinU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H013W2_A13457PrdUbicaci = new String[] {""} ;
      H013W2_A728PrdRefPrv = new String[] {""} ;
      H013W2_A6302TipPrdDsc = new String[] {""} ;
      H013W2_n6302TipPrdDsc = new boolean[] {false} ;
      H013W2_A718PrdNom = new String[] {""} ;
      H013W2_A719PrdNum = new String[] {""} ;
      H013W3_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV79Station = "" ;
      AV80Emprnom = "" ;
      AV81Usurcod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV10WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV34Session = httpContext.getWebSession();
      AV30ColumnsSelectorXML = "" ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV36ManageFiltersXml = "" ;
      AV28ExcelFilename = "" ;
      AV29ErrorMessage = "" ;
      AV31UserCustomValue = "" ;
      AV33ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector14 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector15 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item16 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item17 = new GXBaseCollection[1] ;
      AV15GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char25 = "" ;
      GXv_char26 = new String[1] ;
      GXt_char23 = "" ;
      GXv_char24 = new String[1] ;
      GXt_char21 = "" ;
      GXv_char22 = new String[1] ;
      GXt_char20 = "" ;
      GXv_char13 = new String[1] ;
      GXt_char19 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char18 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState27 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV12TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV11HTTPRequest = httpContext.getHttpRequest();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV5Emprcod = "" ;
      sCtrlAV6Prdnum = "" ;
      sCtrlAV7Prdnum_to = "" ;
      sCtrlAV72ValCodfrom = "" ;
      sCtrlAV73ValCodto = "" ;
      sCtrlAV8Seleccion = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcwwkp89__default(),
         new Object[] {
             new Object[] {
            H013W2_A6301TipPrdCod, H013W2_n6301TipPrdCod, H013W2_A396EmprCod, H013W2_A704PrdExiAlm, H013W2_A685PrdCanRes, H013W2_A856ValCod, H013W2_A10881PrdLote, H013W2_A794PrvNom, H013W2_n794PrvNom, H013W2_A795PrvNum,
            H013W2_A724PrdPreAct, H013W2_A732PrdStkMinU, H013W2_A13457PrdUbicaci, H013W2_A728PrdRefPrv, H013W2_A6302TipPrdDsc, H013W2_n6302TipPrdDsc, H013W2_A718PrdNom, H013W2_A719PrdNum
            }
            , new Object[] {
            H013W3_AGRID_nRecordCount
            }
         }
      );
      AV78Pgmname = "WCWWkp89" ;
      /* GeneXus formulas. */
      AV78Pgmname = "WCWWkp89" ;
      Gx_err = (short)(0) ;
      edtavDetailwebcomponent_Enabled = 0 ;
      edtavCantinv_Enabled = 0 ;
      edtavCompras_Enabled = 0 ;
      edtavConsumos_Enabled = 0 ;
      edtavPrdexialm_Enabled = 0 ;
      edtavCantpesada_Enabled = 0 ;
      edtavStocktotal_Enabled = 0 ;
      edtavPrdcanres_Enabled = 0 ;
      edtavStockdisponible_Enabled = 0 ;
      edtavValor0_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
      WebComp_Grid_dwc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte wcpOAV8Seleccion ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV8Seleccion ;
   private byte AV37ManageFiltersExecutionStep ;
   private byte AV74TFValCod ;
   private byte AV75TFValCod_To ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte A856ValCod ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV103Wcwwkp89ds_22_tfvalcod ;
   private byte AV104Wcwwkp89ds_23_tfvalcod_to ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short wcpOAV72ValCodfrom ;
   private short wcpOAV73ValCodto ;
   private short AV72ValCodfrom ;
   private short AV73ValCodto ;
   private short AV16OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short A6301TipPrdCod ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_43 ;
   private int nGXsfl_43_idx=1 ;
   private int AV62TFPrvNum ;
   private int AV63TFPrvNum_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavPgmname_Enabled ;
   private int A795PrvNum ;
   private int subGrid_Islastpage ;
   private int edtavDetailwebcomponent_Enabled ;
   private int edtavCantinv_Enabled ;
   private int edtavCompras_Enabled ;
   private int edtavConsumos_Enabled ;
   private int edtavPrdexialm_Enabled ;
   private int edtavCantpesada_Enabled ;
   private int edtavStocktotal_Enabled ;
   private int edtavPrdcanres_Enabled ;
   private int edtavStockdisponible_Enabled ;
   private int edtavValor0_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV97Wcwwkp89ds_16_tfprvnum ;
   private int AV98Wcwwkp89ds_17_tfprvnum_to ;
   private int edtPrdNum_Visible ;
   private int edtPrdNom_Visible ;
   private int edtTipPrdDsc_Visible ;
   private int edtPrdRefPrv_Visible ;
   private int edtPrdUbicaci_Visible ;
   private int edtPrdStkMinU_Visible ;
   private int edtavCantinv_Visible ;
   private int edtavCompras_Visible ;
   private int edtavConsumos_Visible ;
   private int edtavPrdexialm_Visible ;
   private int edtavCantpesada_Visible ;
   private int edtavStocktotal_Visible ;
   private int edtavPrdcanres_Visible ;
   private int edtavStockdisponible_Visible ;
   private int edtPrdPreAct_Visible ;
   private int edtavValor0_Visible ;
   private int edtPrvNum_Visible ;
   private int edtPrvNom_Visible ;
   private int edtPrdLote_Visible ;
   private int edtValCod_Visible ;
   private int AV51PageToGo ;
   private int AV105GXV1 ;
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
   private long AV52GridCurrentPage ;
   private long AV53GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV48TFPrdStkMinU ;
   private java.math.BigDecimal AV49TFPrdStkMinU_To ;
   private java.math.BigDecimal AV60TFPrdPreAct ;
   private java.math.BigDecimal AV61TFPrdPreAct_To ;
   private java.math.BigDecimal AV20CantInv ;
   private java.math.BigDecimal AV21Compras ;
   private java.math.BigDecimal AV22Consumos ;
   private java.math.BigDecimal AV54compras2 ;
   private java.math.BigDecimal AV55consumos2 ;
   private java.math.BigDecimal AV57cantRes ;
   private java.math.BigDecimal AV24CantPesada ;
   private java.math.BigDecimal AV68Cantpdte ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal A732PrdStkMinU ;
   private java.math.BigDecimal AV23PrdExiAlm ;
   private java.math.BigDecimal AV25stockTotal ;
   private java.math.BigDecimal AV26PrdCanRes ;
   private java.math.BigDecimal AV27StockDisponible ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal AV59valor0 ;
   private java.math.BigDecimal AV93Wcwwkp89ds_12_tfprdstkminu ;
   private java.math.BigDecimal AV94Wcwwkp89ds_13_tfprdstkminu_to ;
   private java.math.BigDecimal AV95Wcwwkp89ds_14_tfprdpreact ;
   private java.math.BigDecimal AV96Wcwwkp89ds_15_tfprdpreact_to ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private String wcpOAV5Emprcod ;
   private String wcpOAV6Prdnum ;
   private String wcpOAV7Prdnum_to ;
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
   private String AV5Emprcod ;
   private String AV6Prdnum ;
   private String AV7Prdnum_to ;
   private String sGXsfl_43_idx="0001" ;
   private String AV38TFPrdNum ;
   private String AV39TFPrdNum_Sel ;
   private String AV40TFPrdNom ;
   private String AV41TFPrdNom_Sel ;
   private String AV42TFTipPrdDsc ;
   private String AV43TFTipPrdDsc_Sel ;
   private String AV44TFPrdRefPrv ;
   private String AV45TFPrdRefPrv_Sel ;
   private String AV46TFPrdUbicacion ;
   private String AV47TFPrdUbicacion_Sel ;
   private String AV64TFPrvNom ;
   private String AV65TFPrvNom_Sel ;
   private String AV70TFPrdLote ;
   private String AV71TFPrdLote_Sel ;
   private String AV78Pgmname ;
   private String AV56obsp ;
   private String AV58InciCPEDID ;
   private String A396EmprCod ;
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
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
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
   private String Innewwindow1_Width ;
   private String Innewwindow1_Height ;
   private String Innewwindow1_Target ;
   private String Ddo_gridcolumnsselector_Caption ;
   private String Ddo_gridcolumnsselector_Tooltip ;
   private String Ddo_gridcolumnsselector_Cls ;
   private String Ddo_gridcolumnsselector_Dropdownoptionstype ;
   private String Ddo_gridcolumnsselector_Gridinternalname ;
   private String Ddo_gridcolumnsselector_Titlecontrolidtoreplace ;
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
   private String bttBtnexportreport_Internalname ;
   private String bttBtnexportreport_Jsonclick ;
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
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String lblTextblock1_Internalname ;
   private String lblTextblock1_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Innewwindow1_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavDetailwebcomponent_Internalname ;
   private String AV69DetailWebComponent ;
   private String A719PrdNum ;
   private String edtPrdNum_Internalname ;
   private String A718PrdNom ;
   private String edtPrdNom_Internalname ;
   private String A6302TipPrdDsc ;
   private String edtTipPrdDsc_Internalname ;
   private String A728PrdRefPrv ;
   private String edtPrdRefPrv_Internalname ;
   private String A13457PrdUbicaci ;
   private String edtPrdUbicaci_Internalname ;
   private String edtPrdStkMinU_Internalname ;
   private String edtavCantinv_Internalname ;
   private String edtavCompras_Internalname ;
   private String edtavConsumos_Internalname ;
   private String edtavPrdexialm_Internalname ;
   private String edtavCantpesada_Internalname ;
   private String edtavStocktotal_Internalname ;
   private String edtavPrdcanres_Internalname ;
   private String edtavStockdisponible_Internalname ;
   private String edtPrdPreAct_Internalname ;
   private String edtavValor0_Internalname ;
   private String edtPrvNum_Internalname ;
   private String A794PrvNom ;
   private String edtPrvNom_Internalname ;
   private String A10881PrdLote ;
   private String edtPrdLote_Internalname ;
   private String edtValCod_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String scmdbuf ;
   private String lV83Wcwwkp89ds_2_tfprdnum ;
   private String lV85Wcwwkp89ds_4_tfprdnom ;
   private String lV87Wcwwkp89ds_6_tftipprddsc ;
   private String lV89Wcwwkp89ds_8_tfprdrefprv ;
   private String lV91Wcwwkp89ds_10_tfprdubicacion ;
   private String lV99Wcwwkp89ds_18_tfprvnom ;
   private String lV101Wcwwkp89ds_20_tfprdlote ;
   private String AV84Wcwwkp89ds_3_tfprdnum_sel ;
   private String AV83Wcwwkp89ds_2_tfprdnum ;
   private String AV86Wcwwkp89ds_5_tfprdnom_sel ;
   private String AV85Wcwwkp89ds_4_tfprdnom ;
   private String AV88Wcwwkp89ds_7_tftipprddsc_sel ;
   private String AV87Wcwwkp89ds_6_tftipprddsc ;
   private String AV90Wcwwkp89ds_9_tfprdrefprv_sel ;
   private String AV89Wcwwkp89ds_8_tfprdrefprv ;
   private String AV92Wcwwkp89ds_11_tfprdubicacion_sel ;
   private String AV91Wcwwkp89ds_10_tfprdubicacion ;
   private String AV100Wcwwkp89ds_19_tfprvnom_sel ;
   private String AV99Wcwwkp89ds_18_tfprvnom ;
   private String AV102Wcwwkp89ds_21_tfprdlote_sel ;
   private String AV101Wcwwkp89ds_20_tfprdlote ;
   private String hsh ;
   private String AV79Station ;
   private String AV80Emprnom ;
   private String AV81Usurcod ;
   private String GXt_char25 ;
   private String GXv_char26[] ;
   private String GXt_char23 ;
   private String GXv_char24[] ;
   private String GXt_char21 ;
   private String GXv_char22[] ;
   private String GXt_char20 ;
   private String GXv_char13[] ;
   private String GXt_char19 ;
   private String GXv_char4[] ;
   private String GXt_char18 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV5Emprcod ;
   private String sCtrlAV6Prdnum ;
   private String sCtrlAV7Prdnum_to ;
   private String sCtrlAV72ValCodfrom ;
   private String sCtrlAV73ValCodto ;
   private String sCtrlAV8Seleccion ;
   private String sGXsfl_43_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavDetailwebcomponent_Jsonclick ;
   private String edtPrdNum_Jsonclick ;
   private String edtPrdNom_Jsonclick ;
   private String edtTipPrdDsc_Jsonclick ;
   private String edtPrdRefPrv_Jsonclick ;
   private String edtPrdUbicaci_Jsonclick ;
   private String edtPrdStkMinU_Jsonclick ;
   private String edtavCantinv_Jsonclick ;
   private String edtavCompras_Jsonclick ;
   private String edtavConsumos_Jsonclick ;
   private String edtavPrdexialm_Jsonclick ;
   private String edtavCantpesada_Jsonclick ;
   private String edtavStocktotal_Jsonclick ;
   private String edtavPrdcanres_Jsonclick ;
   private String edtavStockdisponible_Jsonclick ;
   private String edtPrdPreAct_Jsonclick ;
   private String edtavValor0_Jsonclick ;
   private String edtPrvNum_Jsonclick ;
   private String edtPrvNom_Jsonclick ;
   private String edtPrdLote_Jsonclick ;
   private String edtValCod_Jsonclick ;
   private String subGrid_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV17OrderedDsc ;
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
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean Grid_empowerer_Hascolumnsselector ;
   private boolean wbLoad ;
   private boolean bGXsfl_43_Refreshing=false ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n6302TipPrdDsc ;
   private boolean n794PrvNom ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n6301TipPrdCod ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV30ColumnsSelectorXML ;
   private String AV36ManageFiltersXml ;
   private String AV31UserCustomValue ;
   private String AV19FilterFullText ;
   private String lV82Wcwwkp89ds_1_filterfulltext ;
   private String AV82Wcwwkp89ds_1_filterfulltext ;
   private String AV28ExcelFilename ;
   private String AV29ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Grid_dwc ;
   private com.genexus.internet.HttpRequest AV11HTTPRequest ;
   private com.genexus.webpanels.WebSession AV34Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucInnewwindow1 ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private short[] H013W2_A6301TipPrdCod ;
   private boolean[] H013W2_n6301TipPrdCod ;
   private String[] H013W2_A396EmprCod ;
   private java.math.BigDecimal[] H013W2_A704PrdExiAlm ;
   private java.math.BigDecimal[] H013W2_A685PrdCanRes ;
   private byte[] H013W2_A856ValCod ;
   private String[] H013W2_A10881PrdLote ;
   private String[] H013W2_A794PrvNom ;
   private boolean[] H013W2_n794PrvNom ;
   private int[] H013W2_A795PrvNum ;
   private java.math.BigDecimal[] H013W2_A724PrdPreAct ;
   private java.math.BigDecimal[] H013W2_A732PrdStkMinU ;
   private String[] H013W2_A13457PrdUbicaci ;
   private String[] H013W2_A728PrdRefPrv ;
   private String[] H013W2_A6302TipPrdDsc ;
   private boolean[] H013W2_n6302TipPrdDsc ;
   private String[] H013W2_A718PrdNom ;
   private String[] H013W2_A719PrdNum ;
   private long[] H013W3_AGRID_nRecordCount ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV35ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item16 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item17[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV32ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV33ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector14[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector15[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV50DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV14GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState27[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV15GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV12TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV10WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
}

final  class wcwwkp89__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H013W2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV82Wcwwkp89ds_1_filterfulltext ,
                                          String AV84Wcwwkp89ds_3_tfprdnum_sel ,
                                          String AV83Wcwwkp89ds_2_tfprdnum ,
                                          String AV86Wcwwkp89ds_5_tfprdnom_sel ,
                                          String AV85Wcwwkp89ds_4_tfprdnom ,
                                          String AV88Wcwwkp89ds_7_tftipprddsc_sel ,
                                          String AV87Wcwwkp89ds_6_tftipprddsc ,
                                          String AV90Wcwwkp89ds_9_tfprdrefprv_sel ,
                                          String AV89Wcwwkp89ds_8_tfprdrefprv ,
                                          String AV92Wcwwkp89ds_11_tfprdubicacion_sel ,
                                          String AV91Wcwwkp89ds_10_tfprdubicacion ,
                                          java.math.BigDecimal AV93Wcwwkp89ds_12_tfprdstkminu ,
                                          java.math.BigDecimal AV94Wcwwkp89ds_13_tfprdstkminu_to ,
                                          java.math.BigDecimal AV95Wcwwkp89ds_14_tfprdpreact ,
                                          java.math.BigDecimal AV96Wcwwkp89ds_15_tfprdpreact_to ,
                                          int AV97Wcwwkp89ds_16_tfprvnum ,
                                          int AV98Wcwwkp89ds_17_tfprvnum_to ,
                                          String AV100Wcwwkp89ds_19_tfprvnom_sel ,
                                          String AV99Wcwwkp89ds_18_tfprvnom ,
                                          String AV102Wcwwkp89ds_21_tfprdlote_sel ,
                                          String AV101Wcwwkp89ds_20_tfprdlote ,
                                          byte AV103Wcwwkp89ds_22_tfvalcod ,
                                          byte AV104Wcwwkp89ds_23_tfvalcod_to ,
                                          short AV72ValCodfrom ,
                                          short AV73ValCodto ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          String A6302TipPrdDsc ,
                                          String A728PrdRefPrv ,
                                          String A13457PrdUbicaci ,
                                          java.math.BigDecimal A732PrdStkMinU ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          String A10881PrdLote ,
                                          byte A856ValCod ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV5Emprcod ,
                                          String AV6Prdnum ,
                                          String A396EmprCod ,
                                          String AV7Prdnum_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int28 = new byte[43];
      Object[] GXv_Object29 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.TipPrdCod, T1.EmprCod, T1.PrdExiAlm, T1.PrdCanRes, T1.ValCod, T1.PrdLote, T3.PrvNom, T1.PrvNum, T1.PrdPreAct, T1.PrdStkMinU, T1.PrdUbicaci, T1.PrdRefPrv, T2.TipPrdDsc," ;
      sSelectString += " T1.PrdNom, T1.PrdNum" ;
      sFromString = " FROM ((TXPPRODUC T1 LEFT JOIN TXPTIPPRD T2 ON T2.EmprCod = T1.EmprCod AND T2.TipPrdCod = T1.TipPrdCod) INNER JOIN TXPPRVGEN T3 ON T3.EmprCod = T1.EmprCod AND T3.PrvNum" ;
      sFromString += " = T1.PrvNum)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.PrdNum >= ?)");
      addWhere(sWhereString, "(LENGTH(RTRIM(RTRIM(LTRIM(T1.PrdNum)))) >= 5)");
      addWhere(sWhereString, "(T1.PrdNum <= ?)");
      if ( ! (GXutil.strcmp("", AV82Wcwwkp89ds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T1.PrdNom) like '%' || UPPER(?)) or ( UPPER(T2.TipPrdDsc) like '%' || UPPER(?)) or ( UPPER(T1.PrdRefPrv) like '%' || UPPER(?)) or ( UPPER(T1.PrdUbicaci) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrdStkMinU,'99990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrdPreAct,'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrvNum,'999990'), 2) like '%' || ?) or ( UPPER(T3.PrvNom) like '%' || UPPER(?)) or ( UPPER(T1.PrdLote) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ValCod,'90'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int28[3] = (byte)(1) ;
         GXv_int28[4] = (byte)(1) ;
         GXv_int28[5] = (byte)(1) ;
         GXv_int28[6] = (byte)(1) ;
         GXv_int28[7] = (byte)(1) ;
         GXv_int28[8] = (byte)(1) ;
         GXv_int28[9] = (byte)(1) ;
         GXv_int28[10] = (byte)(1) ;
         GXv_int28[11] = (byte)(1) ;
         GXv_int28[12] = (byte)(1) ;
         GXv_int28[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Wcwwkp89ds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV83Wcwwkp89ds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Wcwwkp89ds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int28[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Wcwwkp89ds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV85Wcwwkp89ds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Wcwwkp89ds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int28[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Wcwwkp89ds_7_tftipprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV87Wcwwkp89ds_6_tftipprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Wcwwkp89ds_7_tftipprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipPrdDsc = ?)");
      }
      else
      {
         GXv_int28[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Wcwwkp89ds_9_tfprdrefprv_sel)==0) && ( ! (GXutil.strcmp("", AV89Wcwwkp89ds_8_tfprdrefprv)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdRefPrv) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Wcwwkp89ds_9_tfprdrefprv_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdRefPrv = ?)");
      }
      else
      {
         GXv_int28[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Wcwwkp89ds_11_tfprdubicacion_sel)==0) && ( ! (GXutil.strcmp("", AV91Wcwwkp89ds_10_tfprdubicacion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdUbicaci) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Wcwwkp89ds_11_tfprdubicacion_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdUbicaci = ?)");
      }
      else
      {
         GXv_int28[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Wcwwkp89ds_12_tfprdstkminu)==0) )
      {
         addWhere(sWhereString, "(T1.PrdStkMinU >= ?)");
      }
      else
      {
         GXv_int28[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV94Wcwwkp89ds_13_tfprdstkminu_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdStkMinU <= ?)");
      }
      else
      {
         GXv_int28[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Wcwwkp89ds_14_tfprdpreact)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int28[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96Wcwwkp89ds_15_tfprdpreact_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int28[27] = (byte)(1) ;
      }
      if ( ! (0==AV97Wcwwkp89ds_16_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int28[28] = (byte)(1) ;
      }
      if ( ! (0==AV98Wcwwkp89ds_17_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int28[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Wcwwkp89ds_19_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV99Wcwwkp89ds_18_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Wcwwkp89ds_19_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PrvNom = ?)");
      }
      else
      {
         GXv_int28[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Wcwwkp89ds_21_tfprdlote_sel)==0) && ( ! (GXutil.strcmp("", AV101Wcwwkp89ds_20_tfprdlote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Wcwwkp89ds_21_tfprdlote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdLote = ?)");
      }
      else
      {
         GXv_int28[33] = (byte)(1) ;
      }
      if ( ! (0==AV103Wcwwkp89ds_22_tfvalcod) )
      {
         addWhere(sWhereString, "(T1.ValCod >= ?)");
      }
      else
      {
         GXv_int28[34] = (byte)(1) ;
      }
      if ( ! (0==AV104Wcwwkp89ds_23_tfvalcod_to) )
      {
         addWhere(sWhereString, "(T1.ValCod <= ?)");
      }
      else
      {
         GXv_int28[35] = (byte)(1) ;
      }
      if ( ! (0==AV72ValCodfrom) )
      {
         addWhere(sWhereString, "(T1.ValCod >= ?)");
      }
      else
      {
         GXv_int28[36] = (byte)(1) ;
      }
      if ( ! (0==AV73ValCodto) )
      {
         addWhere(sWhereString, "(T1.ValCod <= ?)");
      }
      else
      {
         GXv_int28[37] = (byte)(1) ;
      }
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         sOrderString += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         sOrderString += " ORDER BY T1.PrdNom" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.PrdNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         sOrderString += " ORDER BY T2.TipPrdDsc" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.TipPrdDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         sOrderString += " ORDER BY T1.PrdRefPrv" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.PrdRefPrv DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         sOrderString += " ORDER BY T1.PrdUbicaci" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.PrdUbicaci DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         sOrderString += " ORDER BY T1.PrdStkMinU" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.PrdStkMinU DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         sOrderString += " ORDER BY T1.PrdPreAct" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.PrdPreAct DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         sOrderString += " ORDER BY T1.PrvNum" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.PrvNum DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         sOrderString += " ORDER BY T3.PrvNom" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         sOrderString += " ORDER BY T3.PrvNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         sOrderString += " ORDER BY T1.PrdLote" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.PrdLote DESC" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ! AV17OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ValCod" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ( AV17OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ValCod DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.PrdNum" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object29[0] = scmdbuf ;
      GXv_Object29[1] = GXv_int28 ;
      return GXv_Object29 ;
   }

   protected Object[] conditional_H013W3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV82Wcwwkp89ds_1_filterfulltext ,
                                          String AV84Wcwwkp89ds_3_tfprdnum_sel ,
                                          String AV83Wcwwkp89ds_2_tfprdnum ,
                                          String AV86Wcwwkp89ds_5_tfprdnom_sel ,
                                          String AV85Wcwwkp89ds_4_tfprdnom ,
                                          String AV88Wcwwkp89ds_7_tftipprddsc_sel ,
                                          String AV87Wcwwkp89ds_6_tftipprddsc ,
                                          String AV90Wcwwkp89ds_9_tfprdrefprv_sel ,
                                          String AV89Wcwwkp89ds_8_tfprdrefprv ,
                                          String AV92Wcwwkp89ds_11_tfprdubicacion_sel ,
                                          String AV91Wcwwkp89ds_10_tfprdubicacion ,
                                          java.math.BigDecimal AV93Wcwwkp89ds_12_tfprdstkminu ,
                                          java.math.BigDecimal AV94Wcwwkp89ds_13_tfprdstkminu_to ,
                                          java.math.BigDecimal AV95Wcwwkp89ds_14_tfprdpreact ,
                                          java.math.BigDecimal AV96Wcwwkp89ds_15_tfprdpreact_to ,
                                          int AV97Wcwwkp89ds_16_tfprvnum ,
                                          int AV98Wcwwkp89ds_17_tfprvnum_to ,
                                          String AV100Wcwwkp89ds_19_tfprvnom_sel ,
                                          String AV99Wcwwkp89ds_18_tfprvnom ,
                                          String AV102Wcwwkp89ds_21_tfprdlote_sel ,
                                          String AV101Wcwwkp89ds_20_tfprdlote ,
                                          byte AV103Wcwwkp89ds_22_tfvalcod ,
                                          byte AV104Wcwwkp89ds_23_tfvalcod_to ,
                                          short AV72ValCodfrom ,
                                          short AV73ValCodto ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          String A6302TipPrdDsc ,
                                          String A728PrdRefPrv ,
                                          String A13457PrdUbicaci ,
                                          java.math.BigDecimal A732PrdStkMinU ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          String A10881PrdLote ,
                                          byte A856ValCod ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV5Emprcod ,
                                          String AV6Prdnum ,
                                          String A396EmprCod ,
                                          String AV7Prdnum_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int30 = new byte[38];
      Object[] GXv_Object31 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM ((TXPPRODUC T1 LEFT JOIN TXPTIPPRD T3 ON T3.EmprCod = T1.EmprCod AND T3.TipPrdCod = T1.TipPrdCod) INNER JOIN TXPPRVGEN T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.PrvNum = T1.PrvNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.PrdNum >= ?)");
      addWhere(sWhereString, "(LENGTH(RTRIM(RTRIM(LTRIM(T1.PrdNum)))) >= 5)");
      addWhere(sWhereString, "(T1.PrdNum <= ?)");
      if ( ! (GXutil.strcmp("", AV82Wcwwkp89ds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T1.PrdNom) like '%' || UPPER(?)) or ( UPPER(T3.TipPrdDsc) like '%' || UPPER(?)) or ( UPPER(T1.PrdRefPrv) like '%' || UPPER(?)) or ( UPPER(T1.PrdUbicaci) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrdStkMinU,'99990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrdPreAct,'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrvNum,'999990'), 2) like '%' || ?) or ( UPPER(T2.PrvNom) like '%' || UPPER(?)) or ( UPPER(T1.PrdLote) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ValCod,'90'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int30[3] = (byte)(1) ;
         GXv_int30[4] = (byte)(1) ;
         GXv_int30[5] = (byte)(1) ;
         GXv_int30[6] = (byte)(1) ;
         GXv_int30[7] = (byte)(1) ;
         GXv_int30[8] = (byte)(1) ;
         GXv_int30[9] = (byte)(1) ;
         GXv_int30[10] = (byte)(1) ;
         GXv_int30[11] = (byte)(1) ;
         GXv_int30[12] = (byte)(1) ;
         GXv_int30[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Wcwwkp89ds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV83Wcwwkp89ds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Wcwwkp89ds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int30[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Wcwwkp89ds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV85Wcwwkp89ds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Wcwwkp89ds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int30[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Wcwwkp89ds_7_tftipprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV87Wcwwkp89ds_6_tftipprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Wcwwkp89ds_7_tftipprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipPrdDsc = ?)");
      }
      else
      {
         GXv_int30[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Wcwwkp89ds_9_tfprdrefprv_sel)==0) && ( ! (GXutil.strcmp("", AV89Wcwwkp89ds_8_tfprdrefprv)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdRefPrv) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Wcwwkp89ds_9_tfprdrefprv_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdRefPrv = ?)");
      }
      else
      {
         GXv_int30[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Wcwwkp89ds_11_tfprdubicacion_sel)==0) && ( ! (GXutil.strcmp("", AV91Wcwwkp89ds_10_tfprdubicacion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdUbicaci) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Wcwwkp89ds_11_tfprdubicacion_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdUbicaci = ?)");
      }
      else
      {
         GXv_int30[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Wcwwkp89ds_12_tfprdstkminu)==0) )
      {
         addWhere(sWhereString, "(T1.PrdStkMinU >= ?)");
      }
      else
      {
         GXv_int30[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV94Wcwwkp89ds_13_tfprdstkminu_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdStkMinU <= ?)");
      }
      else
      {
         GXv_int30[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Wcwwkp89ds_14_tfprdpreact)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int30[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96Wcwwkp89ds_15_tfprdpreact_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int30[27] = (byte)(1) ;
      }
      if ( ! (0==AV97Wcwwkp89ds_16_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int30[28] = (byte)(1) ;
      }
      if ( ! (0==AV98Wcwwkp89ds_17_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int30[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Wcwwkp89ds_19_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV99Wcwwkp89ds_18_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Wcwwkp89ds_19_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvNom = ?)");
      }
      else
      {
         GXv_int30[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Wcwwkp89ds_21_tfprdlote_sel)==0) && ( ! (GXutil.strcmp("", AV101Wcwwkp89ds_20_tfprdlote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Wcwwkp89ds_21_tfprdlote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdLote = ?)");
      }
      else
      {
         GXv_int30[33] = (byte)(1) ;
      }
      if ( ! (0==AV103Wcwwkp89ds_22_tfvalcod) )
      {
         addWhere(sWhereString, "(T1.ValCod >= ?)");
      }
      else
      {
         GXv_int30[34] = (byte)(1) ;
      }
      if ( ! (0==AV104Wcwwkp89ds_23_tfvalcod_to) )
      {
         addWhere(sWhereString, "(T1.ValCod <= ?)");
      }
      else
      {
         GXv_int30[35] = (byte)(1) ;
      }
      if ( ! (0==AV72ValCodfrom) )
      {
         addWhere(sWhereString, "(T1.ValCod >= ?)");
      }
      else
      {
         GXv_int30[36] = (byte)(1) ;
      }
      if ( ! (0==AV73ValCodto) )
      {
         addWhere(sWhereString, "(T1.ValCod <= ?)");
      }
      else
      {
         GXv_int30[37] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ! AV17OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
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
                  return conditional_H013W2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).shortValue() , ((Number) dynConstraints[24]).shortValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).byteValue() , ((Number) dynConstraints[36]).shortValue() , ((Boolean) dynConstraints[37]).booleanValue() , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] );
            case 1 :
                  return conditional_H013W3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).shortValue() , ((Number) dynConstraints[24]).shortValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).byteValue() , ((Number) dynConstraints[36]).shortValue() , ((Boolean) dynConstraints[37]).booleanValue() , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H013W2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H013W3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,4);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 26);
               ((String[]) buf[7])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,5);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[12])[0] = rslt.getString(11, 20);
               ((String[]) buf[13])[0] = rslt.getString(12, 30);
               ((String[]) buf[14])[0] = rslt.getString(13, 40);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(14, 26);
               ((String[]) buf[17])[0] = rslt.getString(15, 6);
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
                  stmt.setString(sIdx, (String)parms[44], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
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
                  stmt.setString(sIdx, (String)parms[57], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 40);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 40);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 20);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 5);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 5);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 26);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 26);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[77]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[78]).byteValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[79]).shortValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[80]).shortValue());
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
                  stmt.setString(sIdx, (String)parms[39], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
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
                  stmt.setString(sIdx, (String)parms[52], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 40);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 40);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 20);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 5);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 5);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 26);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 26);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[72]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[73]).byteValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[74]).shortValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[75]).shortValue());
               }
               return;
      }
   }

}

