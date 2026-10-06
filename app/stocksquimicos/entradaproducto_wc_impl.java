package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class entradaproducto_wc_impl extends GXWebComponent
{
   public entradaproducto_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public entradaproducto_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( entradaproducto_wc_impl.class ));
   }

   public entradaproducto_wc_impl( int remoteHandle ,
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
      cmbavGridactions = new HTMLChoice();
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
               AV7Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Emprcod", AV7Emprcod);
               AV8PrdNum = httpContext.GetPar( "PrdNum") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8PrdNum", AV8PrdNum);
               AV68PrdNom = httpContext.GetPar( "PrdNom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68PrdNom", AV68PrdNom);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV7Emprcod,AV8PrdNum,AV68PrdNom});
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
      nRC_GXsfl_42 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_42"))) ;
      nGXsfl_42_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_42_idx"))) ;
      sGXsfl_42_idx = httpContext.GetPar( "sGXsfl_42_idx") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      edtAlbaran_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbaran_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbaran_Visible), 5, 0), !bGXsfl_42_Refreshing);
      edtEntNAlbar_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtEntNAlbar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntNAlbar_Visible), 5, 0), !bGXsfl_42_Refreshing);
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
      AV7Emprcod = httpContext.GetPar( "Emprcod") ;
      AV8PrdNum = httpContext.GetPar( "PrdNum") ;
      AV26TFLinEnt = (short)(GXutil.lval( httpContext.GetPar( "TFLinEnt"))) ;
      AV27TFLinEnt_To = (short)(GXutil.lval( httpContext.GetPar( "TFLinEnt_To"))) ;
      AV28TFEntFecEnt = localUtil.parseDateParm( httpContext.GetPar( "TFEntFecEnt")) ;
      AV32TFAlbaran = httpContext.GetPar( "TFAlbaran") ;
      AV33TFAlbaran_Sel = httpContext.GetPar( "TFAlbaran_Sel") ;
      AV34TFEntNAlbar = httpContext.GetPar( "TFEntNAlbar") ;
      AV35TFEntNAlbar_Sel = httpContext.GetPar( "TFEntNAlbar_Sel") ;
      AV36TFPedCod = (int)(GXutil.lval( httpContext.GetPar( "TFPedCod"))) ;
      AV37TFPedCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFPedCod_To"))) ;
      AV38TFEntPrvNum = (int)(GXutil.lval( httpContext.GetPar( "TFEntPrvNum"))) ;
      AV39TFEntPrvNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFEntPrvNum_To"))) ;
      AV40TFEntUniEnt = CommonUtil.decimalVal( httpContext.GetPar( "TFEntUniEnt"), ".") ;
      AV41TFEntUniEnt_To = CommonUtil.decimalVal( httpContext.GetPar( "TFEntUniEnt_To"), ".") ;
      AV50TFEntPre = CommonUtil.decimalVal( httpContext.GetPar( "TFEntPre"), ".") ;
      AV51TFEntPre_To = CommonUtil.decimalVal( httpContext.GetPar( "TFEntPre_To"), ".") ;
      AV52TFEntUniRem = CommonUtil.decimalVal( httpContext.GetPar( "TFEntUniRem"), ".") ;
      AV53TFEntUniRem_To = CommonUtil.decimalVal( httpContext.GetPar( "TFEntUniRem_To"), ".") ;
      AV54TFEntLotN = httpContext.GetPar( "TFEntLotN") ;
      AV55TFEntLotN_Sel = httpContext.GetPar( "TFEntLotN_Sel") ;
      AV56TFEntFVal = localUtil.parseDateParm( httpContext.GetPar( "TFEntFVal")) ;
      AV75Pgmname = httpContext.GetPar( "Pgmname") ;
      AV14OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV15OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV68PrdNom = httpContext.GetPar( "PrdNom") ;
      edtAlbaran_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbaran_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbaran_Visible), 5, 0), !bGXsfl_42_Refreshing);
      edtEntNAlbar_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtEntNAlbar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntNAlbar_Visible), 5, 0), !bGXsfl_42_Refreshing);
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
      gxgrgrid_refresh( subGrid_Rows, AV7Emprcod, AV8PrdNum, AV26TFLinEnt, AV27TFLinEnt_To, AV28TFEntFecEnt, AV32TFAlbaran, AV33TFAlbaran_Sel, AV34TFEntNAlbar, AV35TFEntNAlbar_Sel, AV36TFPedCod, AV37TFPedCod_To, AV38TFEntPrvNum, AV39TFEntPrvNum_To, AV40TFEntUniEnt, AV41TFEntUniEnt_To, AV50TFEntPre, AV51TFEntPre_To, AV52TFEntUniRem, AV53TFEntUniRem_To, AV54TFEntLotN, AV55TFEntLotN_Sel, AV56TFEntFVal, AV75Pgmname, AV14OrderedBy, AV15OrderedDsc, AV68PrdNom, A396EmprCod, A719PrdNum, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1TA2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( " Entrada de Productos Almacen", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.stocksquimicos.entradaproducto_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV7Emprcod)),GXutil.URLEncode(GXutil.rtrim(AV8PrdNum)),GXutil.URLEncode(GXutil.rtrim(AV68PrdNom))}, new String[] {"Emprcod","PrdNum","PrdNom"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"EntradaProducto_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV75Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("stocksquimicos\\entradaproducto_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_42", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_42, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV62GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV63GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV60DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV60DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7Emprcod", GXutil.rtrim( wcpOAV7Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV8PrdNum", GXutil.rtrim( wcpOAV8PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV68PrdNom", GXutil.rtrim( wcpOAV68PrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLINENT", GXutil.ltrim( localUtil.ntoc( AV26TFLinEnt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLINENT_TO", GXutil.ltrim( localUtil.ntoc( AV27TFLinEnt_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFENTFECENT", localUtil.dtoc( AV28TFEntFecEnt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBARAN", GXutil.rtrim( AV32TFAlbaran));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBARAN_SEL", GXutil.rtrim( AV33TFAlbaran_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFENTNALBAR", GXutil.rtrim( AV34TFEntNAlbar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFENTNALBAR_SEL", GXutil.rtrim( AV35TFEntNAlbar_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPEDCOD", GXutil.ltrim( localUtil.ntoc( AV36TFPedCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPEDCOD_TO", GXutil.ltrim( localUtil.ntoc( AV37TFPedCod_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFENTPRVNUM", GXutil.ltrim( localUtil.ntoc( AV38TFEntPrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFENTPRVNUM_TO", GXutil.ltrim( localUtil.ntoc( AV39TFEntPrvNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFENTUNIENT", GXutil.ltrim( localUtil.ntoc( AV40TFEntUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFENTUNIENT_TO", GXutil.ltrim( localUtil.ntoc( AV41TFEntUniEnt_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFENTPRE", GXutil.ltrim( localUtil.ntoc( AV50TFEntPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFENTPRE_TO", GXutil.ltrim( localUtil.ntoc( AV51TFEntPre_To, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFENTUNIREM", GXutil.ltrim( localUtil.ntoc( AV52TFEntUniRem, (byte)(11), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFENTUNIREM_TO", GXutil.ltrim( localUtil.ntoc( AV53TFEntUniRem_To, (byte)(11), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFENTLOTN", GXutil.rtrim( AV54TFEntLotN));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFENTLOTN_SEL", GXutil.rtrim( AV55TFEntLotN_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFENTFVAL", localUtil.dtoc( AV56TFEntFVal, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV14OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV15OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV7Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PRDNUM", GXutil.rtrim( A719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_PRDNUM", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A719PrdNum, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filterisrange", GXutil.rtrim( Ddo_grid_Filterisrange));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includedatalist", GXutil.rtrim( Ddo_grid_Includedatalist));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalisttype", GXutil.rtrim( Ddo_grid_Datalisttype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Fixedcolumns", GXutil.rtrim( Grid_empowerer_Fixedcolumns));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"ALBARAN_Visible", GXutil.ltrim( localUtil.ntoc( edtAlbaran_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"ENTNALBAR_Visible", GXutil.ltrim( localUtil.ntoc( edtEntNAlbar_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
   }

   public void renderHtmlCloseForm1TA2( )
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
      return "StocksQuimicos.EntradaProducto_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Entrada de Productos Almacen", "") ;
   }

   public void wb1TA0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.stocksquimicos.entradaproducto_wc");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsertar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 42, 2, 0)+","+"null"+");", httpContext.getMessage( "Agregar", ""), bttBtninsertar_Jsonclick, 5, httpContext.getMessage( "Agregar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOINSERTAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\EntradaProducto_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtableprdnum_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockprdnum_Internalname, httpContext.getMessage( "Producto", ""), "", "", lblTextblockprdnum_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_StocksQuimicos\\EntradaProducto_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPrdnum_Internalname, httpContext.getMessage( "Prd Num", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPrdnum_Internalname, GXutil.rtrim( AV8PrdNum), GXutil.rtrim( localUtil.format( AV8PrdNum, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPrdnum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPrdnum_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\EntradaProducto_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtableprdnom_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockprdnom_Internalname, httpContext.getMessage( "Descripcion", ""), "", "", lblTextblockprdnom_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_StocksQuimicos\\EntradaProducto_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPrdnom_Internalname, httpContext.getMessage( "Prd Nom", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPrdnom_Internalname, GXutil.rtrim( AV68PrdNom), GXutil.rtrim( localUtil.format( AV68PrdNom, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPrdnom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPrdnom_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\EntradaProducto_WC.htm");
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
         startgridcontrol42( ) ;
      }
      if ( wbEnd == 42 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_42 = (int)(nGXsfl_42_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV62GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV63GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV75Pgmname), GXutil.rtrim( localUtil.format( AV75Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\EntradaProducto_WC.htm");
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
         ucDdo_grid.setProperty("IncludeFilter", Ddo_grid_Includefilter);
         ucDdo_grid.setProperty("FilterType", Ddo_grid_Filtertype);
         ucDdo_grid.setProperty("FilterIsRange", Ddo_grid_Filterisrange);
         ucDdo_grid.setProperty("IncludeDataList", Ddo_grid_Includedatalist);
         ucDdo_grid.setProperty("DataListType", Ddo_grid_Datalisttype);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV60DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_entfecentauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'" + sPrefix + "',false,'" + sGXsfl_42_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_entfecentauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_entfecentauxdate_Internalname, localUtil.format(AV30DDO_EntFecEntAuxDate, "99/99/99"), localUtil.format( AV30DDO_EntFecEntAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,68);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_entfecentauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\EntradaProducto_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_entfecentauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_StocksQuimicos\\EntradaProducto_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_entfvalauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'" + sPrefix + "',false,'" + sGXsfl_42_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_entfvalauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_entfvalauxdate_Internalname, localUtil.format(AV58DDO_EntFValAuxDate, "99/99/99"), localUtil.format( AV58DDO_EntFValAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,70);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_entfvalauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\EntradaProducto_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_entfvalauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_StocksQuimicos\\EntradaProducto_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 42 )
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

   public void start1TA2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( " Entrada de Productos Almacen", ""), (short)(0)) ;
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
            strup1TA0( ) ;
         }
      }
   }

   public void ws1TA2( )
   {
      start1TA2( ) ;
      evt1TA2( ) ;
   }

   public void evt1TA2( )
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
                              strup1TA0( ) ;
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
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1TA0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e111TA2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1TA0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e121TA2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1TA0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e131TA2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERTAR'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1TA0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoInsertar' */
                                 e141TA2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1TA0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = cmbavGridactions.getInternalname() ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 18), "VGRIDACTIONS.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 18), "VGRIDACTIONS.CLICK") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1TA0( ) ;
                           }
                           nGXsfl_42_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_42_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_42_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_422( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV64GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64GridActions), 4, 0));
                           A597LinEnt = (short)(localUtil.ctol( httpContext.cgiGet( edtLinEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A415EntFecEnt = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtEntFecEnt_Internalname), 0)) ;
                           A11Albaran = httpContext.cgiGet( edtAlbaran_Internalname) ;
                           A12857EntNAlbar = httpContext.cgiGet( edtEntNAlbar_Internalname) ;
                           A658PedCod = (int)(localUtil.ctol( httpContext.cgiGet( edtPedCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n658PedCod = false ;
                           A6156EntPrvNum = (int)(localUtil.ctol( httpContext.cgiGet( edtEntPrvNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n6156EntPrvNum = false ;
                           A418EntUniEnt = localUtil.ctond( httpContext.cgiGet( edtEntUniEnt_Internalname)) ;
                           A417EntPre = localUtil.ctond( httpContext.cgiGet( edtEntPre_Internalname)) ;
                           A419EntUniRem = localUtil.ctond( httpContext.cgiGet( edtEntUniRem_Internalname)) ;
                           A5686EntLotN = httpContext.cgiGet( edtEntLotN_Internalname) ;
                           A5685EntFVal = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtEntFVal_Internalname), 0)) ;
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
                                       GX_FocusControl = cmbavGridactions.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e151TA2 ();
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
                                       GX_FocusControl = cmbavGridactions.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e161TA2 ();
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
                                       GX_FocusControl = cmbavGridactions.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e171TA2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONS.CLICK") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavGridactions.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e181TA2 ();
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
                                    strup1TA0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavGridactions.getInternalname() ;
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

   public void we1TA2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1TA2( ) ;
         }
      }
   }

   public void pa1TA2( )
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
            GX_FocusControl = edtavDdo_entfecentauxdate_Internalname ;
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
      subsflControlProps_422( ) ;
      while ( nGXsfl_42_idx <= nRC_GXsfl_42 )
      {
         sendrow_422( ) ;
         nGXsfl_42_idx = ((subGrid_Islastpage==1)&&(nGXsfl_42_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_42_idx+1) ;
         sGXsfl_42_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_42_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_422( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV7Emprcod ,
                                 String AV8PrdNum ,
                                 short AV26TFLinEnt ,
                                 short AV27TFLinEnt_To ,
                                 java.util.Date AV28TFEntFecEnt ,
                                 String AV32TFAlbaran ,
                                 String AV33TFAlbaran_Sel ,
                                 String AV34TFEntNAlbar ,
                                 String AV35TFEntNAlbar_Sel ,
                                 int AV36TFPedCod ,
                                 int AV37TFPedCod_To ,
                                 int AV38TFEntPrvNum ,
                                 int AV39TFEntPrvNum_To ,
                                 java.math.BigDecimal AV40TFEntUniEnt ,
                                 java.math.BigDecimal AV41TFEntUniEnt_To ,
                                 java.math.BigDecimal AV50TFEntPre ,
                                 java.math.BigDecimal AV51TFEntPre_To ,
                                 java.math.BigDecimal AV52TFEntUniRem ,
                                 java.math.BigDecimal AV53TFEntUniRem_To ,
                                 String AV54TFEntLotN ,
                                 String AV55TFEntLotN_Sel ,
                                 java.util.Date AV56TFEntFVal ,
                                 String AV75Pgmname ,
                                 short AV14OrderedBy ,
                                 boolean AV15OrderedDsc ,
                                 String AV68PrdNom ,
                                 String A396EmprCod ,
                                 String A719PrdNum ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e161TA2 ();
      GRID_nCurrentRecord = 0 ;
      rf1TA2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"EntradaProducto_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV75Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("stocksquimicos\\entradaproducto_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_ENTUNIREM", getSecureSignedToken( sPrefix, localUtil.format( A419EntUniRem, "ZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"ENTUNIREM", GXutil.ltrim( localUtil.ntoc( A419EntUniRem, (byte)(11), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_ENTUNIENT", getSecureSignedToken( sPrefix, localUtil.format( A418EntUniEnt, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"ENTUNIENT", GXutil.ltrim( localUtil.ntoc( A418EntUniEnt, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_LINENT", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A597LinEnt), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"LINENT", GXutil.ltrim( localUtil.ntoc( A597LinEnt, (byte)(4), (byte)(0), ".", "")));
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
      rf1TA2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV75Pgmname = "StocksQuimicos.EntradaProducto_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75Pgmname", AV75Pgmname);
      Gx_err = (short)(0) ;
      edtavPrdnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrdnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdnum_Enabled), 5, 0), true);
      edtavPrdnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrdnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdnom_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1TA2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(42) ;
      /* Execute user event: Refresh */
      e161TA2 ();
      nGXsfl_42_idx = 1 ;
      sGXsfl_42_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_42_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_422( ) ;
      bGXsfl_42_Refreshing = true ;
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
         subsflControlProps_422( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Short.valueOf(AV76Stocksquimicos_entradaproducto_wcds_1_tflinent) ,
                                              Short.valueOf(AV77Stocksquimicos_entradaproducto_wcds_2_tflinent_to) ,
                                              AV78Stocksquimicos_entradaproducto_wcds_3_tfentfecent ,
                                              AV80Stocksquimicos_entradaproducto_wcds_5_tfalbaran_sel ,
                                              AV79Stocksquimicos_entradaproducto_wcds_4_tfalbaran ,
                                              AV82Stocksquimicos_entradaproducto_wcds_7_tfentnalbar_sel ,
                                              AV81Stocksquimicos_entradaproducto_wcds_6_tfentnalbar ,
                                              Integer.valueOf(AV83Stocksquimicos_entradaproducto_wcds_8_tfpedcod) ,
                                              Integer.valueOf(AV84Stocksquimicos_entradaproducto_wcds_9_tfpedcod_to) ,
                                              Integer.valueOf(AV85Stocksquimicos_entradaproducto_wcds_10_tfentprvnum) ,
                                              Integer.valueOf(AV86Stocksquimicos_entradaproducto_wcds_11_tfentprvnum_to) ,
                                              AV87Stocksquimicos_entradaproducto_wcds_12_tfentunient ,
                                              AV88Stocksquimicos_entradaproducto_wcds_13_tfentunient_to ,
                                              AV89Stocksquimicos_entradaproducto_wcds_14_tfentpre ,
                                              AV90Stocksquimicos_entradaproducto_wcds_15_tfentpre_to ,
                                              AV91Stocksquimicos_entradaproducto_wcds_16_tfentunirem ,
                                              AV92Stocksquimicos_entradaproducto_wcds_17_tfentunirem_to ,
                                              AV94Stocksquimicos_entradaproducto_wcds_19_tfentlotn_sel ,
                                              AV93Stocksquimicos_entradaproducto_wcds_18_tfentlotn ,
                                              AV95Stocksquimicos_entradaproducto_wcds_20_tfentfval ,
                                              Short.valueOf(A597LinEnt) ,
                                              A415EntFecEnt ,
                                              A11Albaran ,
                                              A12857EntNAlbar ,
                                              Integer.valueOf(A658PedCod) ,
                                              Integer.valueOf(A6156EntPrvNum) ,
                                              A418EntUniEnt ,
                                              A417EntPre ,
                                              A419EntUniRem ,
                                              A5686EntLotN ,
                                              A5685EntFVal ,
                                              Short.valueOf(AV14OrderedBy) ,
                                              Boolean.valueOf(AV15OrderedDsc) ,
                                              Byte.valueOf(A411EntCon) ,
                                              AV7Emprcod ,
                                              AV8PrdNum ,
                                              A396EmprCod ,
                                              A719PrdNum } ,
                                              new int[]{
                                              TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                              TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                              TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV79Stocksquimicos_entradaproducto_wcds_4_tfalbaran = GXutil.padr( GXutil.rtrim( AV79Stocksquimicos_entradaproducto_wcds_4_tfalbaran), 10, "%") ;
         lV81Stocksquimicos_entradaproducto_wcds_6_tfentnalbar = GXutil.padr( GXutil.rtrim( AV81Stocksquimicos_entradaproducto_wcds_6_tfentnalbar), 20, "%") ;
         lV93Stocksquimicos_entradaproducto_wcds_18_tfentlotn = GXutil.padr( GXutil.rtrim( AV93Stocksquimicos_entradaproducto_wcds_18_tfentlotn), 26, "%") ;
         /* Using cursor H01TA2 */
         pr_default.execute(0, new Object[] {AV7Emprcod, AV8PrdNum, Short.valueOf(AV76Stocksquimicos_entradaproducto_wcds_1_tflinent), Short.valueOf(AV77Stocksquimicos_entradaproducto_wcds_2_tflinent_to), AV78Stocksquimicos_entradaproducto_wcds_3_tfentfecent, lV79Stocksquimicos_entradaproducto_wcds_4_tfalbaran, AV80Stocksquimicos_entradaproducto_wcds_5_tfalbaran_sel, lV81Stocksquimicos_entradaproducto_wcds_6_tfentnalbar, AV82Stocksquimicos_entradaproducto_wcds_7_tfentnalbar_sel, Integer.valueOf(AV83Stocksquimicos_entradaproducto_wcds_8_tfpedcod), Integer.valueOf(AV84Stocksquimicos_entradaproducto_wcds_9_tfpedcod_to), Integer.valueOf(AV85Stocksquimicos_entradaproducto_wcds_10_tfentprvnum), Integer.valueOf(AV86Stocksquimicos_entradaproducto_wcds_11_tfentprvnum_to), AV87Stocksquimicos_entradaproducto_wcds_12_tfentunient, AV88Stocksquimicos_entradaproducto_wcds_13_tfentunient_to, AV89Stocksquimicos_entradaproducto_wcds_14_tfentpre, AV90Stocksquimicos_entradaproducto_wcds_15_tfentpre_to, AV91Stocksquimicos_entradaproducto_wcds_16_tfentunirem, AV92Stocksquimicos_entradaproducto_wcds_17_tfentunirem_to, lV93Stocksquimicos_entradaproducto_wcds_18_tfentlotn, AV94Stocksquimicos_entradaproducto_wcds_19_tfentlotn_sel, AV95Stocksquimicos_entradaproducto_wcds_20_tfentfval, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_42_idx = 1 ;
         sGXsfl_42_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_42_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_422( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A411EntCon = H01TA2_A411EntCon[0] ;
            A396EmprCod = H01TA2_A396EmprCod[0] ;
            A719PrdNum = H01TA2_A719PrdNum[0] ;
            A5685EntFVal = H01TA2_A5685EntFVal[0] ;
            A5686EntLotN = H01TA2_A5686EntLotN[0] ;
            A419EntUniRem = H01TA2_A419EntUniRem[0] ;
            A417EntPre = H01TA2_A417EntPre[0] ;
            A418EntUniEnt = H01TA2_A418EntUniEnt[0] ;
            A6156EntPrvNum = H01TA2_A6156EntPrvNum[0] ;
            n6156EntPrvNum = H01TA2_n6156EntPrvNum[0] ;
            A658PedCod = H01TA2_A658PedCod[0] ;
            n658PedCod = H01TA2_n658PedCod[0] ;
            A12857EntNAlbar = H01TA2_A12857EntNAlbar[0] ;
            A11Albaran = H01TA2_A11Albaran[0] ;
            A415EntFecEnt = H01TA2_A415EntFecEnt[0] ;
            A597LinEnt = H01TA2_A597LinEnt[0] ;
            e171TA2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(42) ;
         wb1TA0( ) ;
      }
      bGXsfl_42_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1TA2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_ENTUNIREM"+"_"+sGXsfl_42_idx, getSecureSignedToken( sPrefix+sGXsfl_42_idx, localUtil.format( A419EntUniRem, "ZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_ENTUNIENT"+"_"+sGXsfl_42_idx, getSecureSignedToken( sPrefix+sGXsfl_42_idx, localUtil.format( A418EntUniEnt, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PRDNUM", GXutil.rtrim( A719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_PRDNUM", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A719PrdNum, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_LINENT"+"_"+sGXsfl_42_idx, getSecureSignedToken( sPrefix+sGXsfl_42_idx, localUtil.format( DecimalUtil.doubleToDec(A597LinEnt), "ZZZ9")));
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
      AV76Stocksquimicos_entradaproducto_wcds_1_tflinent = AV26TFLinEnt ;
      AV77Stocksquimicos_entradaproducto_wcds_2_tflinent_to = AV27TFLinEnt_To ;
      AV78Stocksquimicos_entradaproducto_wcds_3_tfentfecent = AV28TFEntFecEnt ;
      AV79Stocksquimicos_entradaproducto_wcds_4_tfalbaran = AV32TFAlbaran ;
      AV80Stocksquimicos_entradaproducto_wcds_5_tfalbaran_sel = AV33TFAlbaran_Sel ;
      AV81Stocksquimicos_entradaproducto_wcds_6_tfentnalbar = AV34TFEntNAlbar ;
      AV82Stocksquimicos_entradaproducto_wcds_7_tfentnalbar_sel = AV35TFEntNAlbar_Sel ;
      AV83Stocksquimicos_entradaproducto_wcds_8_tfpedcod = AV36TFPedCod ;
      AV84Stocksquimicos_entradaproducto_wcds_9_tfpedcod_to = AV37TFPedCod_To ;
      AV85Stocksquimicos_entradaproducto_wcds_10_tfentprvnum = AV38TFEntPrvNum ;
      AV86Stocksquimicos_entradaproducto_wcds_11_tfentprvnum_to = AV39TFEntPrvNum_To ;
      AV87Stocksquimicos_entradaproducto_wcds_12_tfentunient = AV40TFEntUniEnt ;
      AV88Stocksquimicos_entradaproducto_wcds_13_tfentunient_to = AV41TFEntUniEnt_To ;
      AV89Stocksquimicos_entradaproducto_wcds_14_tfentpre = AV50TFEntPre ;
      AV90Stocksquimicos_entradaproducto_wcds_15_tfentpre_to = AV51TFEntPre_To ;
      AV91Stocksquimicos_entradaproducto_wcds_16_tfentunirem = AV52TFEntUniRem ;
      AV92Stocksquimicos_entradaproducto_wcds_17_tfentunirem_to = AV53TFEntUniRem_To ;
      AV93Stocksquimicos_entradaproducto_wcds_18_tfentlotn = AV54TFEntLotN ;
      AV94Stocksquimicos_entradaproducto_wcds_19_tfentlotn_sel = AV55TFEntLotN_Sel ;
      AV95Stocksquimicos_entradaproducto_wcds_20_tfentfval = AV56TFEntFVal ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Short.valueOf(AV76Stocksquimicos_entradaproducto_wcds_1_tflinent) ,
                                           Short.valueOf(AV77Stocksquimicos_entradaproducto_wcds_2_tflinent_to) ,
                                           AV78Stocksquimicos_entradaproducto_wcds_3_tfentfecent ,
                                           AV80Stocksquimicos_entradaproducto_wcds_5_tfalbaran_sel ,
                                           AV79Stocksquimicos_entradaproducto_wcds_4_tfalbaran ,
                                           AV82Stocksquimicos_entradaproducto_wcds_7_tfentnalbar_sel ,
                                           AV81Stocksquimicos_entradaproducto_wcds_6_tfentnalbar ,
                                           Integer.valueOf(AV83Stocksquimicos_entradaproducto_wcds_8_tfpedcod) ,
                                           Integer.valueOf(AV84Stocksquimicos_entradaproducto_wcds_9_tfpedcod_to) ,
                                           Integer.valueOf(AV85Stocksquimicos_entradaproducto_wcds_10_tfentprvnum) ,
                                           Integer.valueOf(AV86Stocksquimicos_entradaproducto_wcds_11_tfentprvnum_to) ,
                                           AV87Stocksquimicos_entradaproducto_wcds_12_tfentunient ,
                                           AV88Stocksquimicos_entradaproducto_wcds_13_tfentunient_to ,
                                           AV89Stocksquimicos_entradaproducto_wcds_14_tfentpre ,
                                           AV90Stocksquimicos_entradaproducto_wcds_15_tfentpre_to ,
                                           AV91Stocksquimicos_entradaproducto_wcds_16_tfentunirem ,
                                           AV92Stocksquimicos_entradaproducto_wcds_17_tfentunirem_to ,
                                           AV94Stocksquimicos_entradaproducto_wcds_19_tfentlotn_sel ,
                                           AV93Stocksquimicos_entradaproducto_wcds_18_tfentlotn ,
                                           AV95Stocksquimicos_entradaproducto_wcds_20_tfentfval ,
                                           Short.valueOf(A597LinEnt) ,
                                           A415EntFecEnt ,
                                           A11Albaran ,
                                           A12857EntNAlbar ,
                                           Integer.valueOf(A658PedCod) ,
                                           Integer.valueOf(A6156EntPrvNum) ,
                                           A418EntUniEnt ,
                                           A417EntPre ,
                                           A419EntUniRem ,
                                           A5686EntLotN ,
                                           A5685EntFVal ,
                                           Short.valueOf(AV14OrderedBy) ,
                                           Boolean.valueOf(AV15OrderedDsc) ,
                                           Byte.valueOf(A411EntCon) ,
                                           AV7Emprcod ,
                                           AV8PrdNum ,
                                           A396EmprCod ,
                                           A719PrdNum } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV79Stocksquimicos_entradaproducto_wcds_4_tfalbaran = GXutil.padr( GXutil.rtrim( AV79Stocksquimicos_entradaproducto_wcds_4_tfalbaran), 10, "%") ;
      lV81Stocksquimicos_entradaproducto_wcds_6_tfentnalbar = GXutil.padr( GXutil.rtrim( AV81Stocksquimicos_entradaproducto_wcds_6_tfentnalbar), 20, "%") ;
      lV93Stocksquimicos_entradaproducto_wcds_18_tfentlotn = GXutil.padr( GXutil.rtrim( AV93Stocksquimicos_entradaproducto_wcds_18_tfentlotn), 26, "%") ;
      /* Using cursor H01TA3 */
      pr_default.execute(1, new Object[] {AV7Emprcod, AV8PrdNum, Short.valueOf(AV76Stocksquimicos_entradaproducto_wcds_1_tflinent), Short.valueOf(AV77Stocksquimicos_entradaproducto_wcds_2_tflinent_to), AV78Stocksquimicos_entradaproducto_wcds_3_tfentfecent, lV79Stocksquimicos_entradaproducto_wcds_4_tfalbaran, AV80Stocksquimicos_entradaproducto_wcds_5_tfalbaran_sel, lV81Stocksquimicos_entradaproducto_wcds_6_tfentnalbar, AV82Stocksquimicos_entradaproducto_wcds_7_tfentnalbar_sel, Integer.valueOf(AV83Stocksquimicos_entradaproducto_wcds_8_tfpedcod), Integer.valueOf(AV84Stocksquimicos_entradaproducto_wcds_9_tfpedcod_to), Integer.valueOf(AV85Stocksquimicos_entradaproducto_wcds_10_tfentprvnum), Integer.valueOf(AV86Stocksquimicos_entradaproducto_wcds_11_tfentprvnum_to), AV87Stocksquimicos_entradaproducto_wcds_12_tfentunient, AV88Stocksquimicos_entradaproducto_wcds_13_tfentunient_to, AV89Stocksquimicos_entradaproducto_wcds_14_tfentpre, AV90Stocksquimicos_entradaproducto_wcds_15_tfentpre_to, AV91Stocksquimicos_entradaproducto_wcds_16_tfentunirem, AV92Stocksquimicos_entradaproducto_wcds_17_tfentunirem_to, lV93Stocksquimicos_entradaproducto_wcds_18_tfentlotn, AV94Stocksquimicos_entradaproducto_wcds_19_tfentlotn_sel, AV95Stocksquimicos_entradaproducto_wcds_20_tfentfval});
      GRID_nRecordCount = H01TA3_AGRID_nRecordCount[0] ;
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
      AV76Stocksquimicos_entradaproducto_wcds_1_tflinent = AV26TFLinEnt ;
      AV77Stocksquimicos_entradaproducto_wcds_2_tflinent_to = AV27TFLinEnt_To ;
      AV78Stocksquimicos_entradaproducto_wcds_3_tfentfecent = AV28TFEntFecEnt ;
      AV79Stocksquimicos_entradaproducto_wcds_4_tfalbaran = AV32TFAlbaran ;
      AV80Stocksquimicos_entradaproducto_wcds_5_tfalbaran_sel = AV33TFAlbaran_Sel ;
      AV81Stocksquimicos_entradaproducto_wcds_6_tfentnalbar = AV34TFEntNAlbar ;
      AV82Stocksquimicos_entradaproducto_wcds_7_tfentnalbar_sel = AV35TFEntNAlbar_Sel ;
      AV83Stocksquimicos_entradaproducto_wcds_8_tfpedcod = AV36TFPedCod ;
      AV84Stocksquimicos_entradaproducto_wcds_9_tfpedcod_to = AV37TFPedCod_To ;
      AV85Stocksquimicos_entradaproducto_wcds_10_tfentprvnum = AV38TFEntPrvNum ;
      AV86Stocksquimicos_entradaproducto_wcds_11_tfentprvnum_to = AV39TFEntPrvNum_To ;
      AV87Stocksquimicos_entradaproducto_wcds_12_tfentunient = AV40TFEntUniEnt ;
      AV88Stocksquimicos_entradaproducto_wcds_13_tfentunient_to = AV41TFEntUniEnt_To ;
      AV89Stocksquimicos_entradaproducto_wcds_14_tfentpre = AV50TFEntPre ;
      AV90Stocksquimicos_entradaproducto_wcds_15_tfentpre_to = AV51TFEntPre_To ;
      AV91Stocksquimicos_entradaproducto_wcds_16_tfentunirem = AV52TFEntUniRem ;
      AV92Stocksquimicos_entradaproducto_wcds_17_tfentunirem_to = AV53TFEntUniRem_To ;
      AV93Stocksquimicos_entradaproducto_wcds_18_tfentlotn = AV54TFEntLotN ;
      AV94Stocksquimicos_entradaproducto_wcds_19_tfentlotn_sel = AV55TFEntLotN_Sel ;
      AV95Stocksquimicos_entradaproducto_wcds_20_tfentfval = AV56TFEntFVal ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV7Emprcod, AV8PrdNum, AV26TFLinEnt, AV27TFLinEnt_To, AV28TFEntFecEnt, AV32TFAlbaran, AV33TFAlbaran_Sel, AV34TFEntNAlbar, AV35TFEntNAlbar_Sel, AV36TFPedCod, AV37TFPedCod_To, AV38TFEntPrvNum, AV39TFEntPrvNum_To, AV40TFEntUniEnt, AV41TFEntUniEnt_To, AV50TFEntPre, AV51TFEntPre_To, AV52TFEntUniRem, AV53TFEntUniRem_To, AV54TFEntLotN, AV55TFEntLotN_Sel, AV56TFEntFVal, AV75Pgmname, AV14OrderedBy, AV15OrderedDsc, AV68PrdNom, A396EmprCod, A719PrdNum, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV76Stocksquimicos_entradaproducto_wcds_1_tflinent = AV26TFLinEnt ;
      AV77Stocksquimicos_entradaproducto_wcds_2_tflinent_to = AV27TFLinEnt_To ;
      AV78Stocksquimicos_entradaproducto_wcds_3_tfentfecent = AV28TFEntFecEnt ;
      AV79Stocksquimicos_entradaproducto_wcds_4_tfalbaran = AV32TFAlbaran ;
      AV80Stocksquimicos_entradaproducto_wcds_5_tfalbaran_sel = AV33TFAlbaran_Sel ;
      AV81Stocksquimicos_entradaproducto_wcds_6_tfentnalbar = AV34TFEntNAlbar ;
      AV82Stocksquimicos_entradaproducto_wcds_7_tfentnalbar_sel = AV35TFEntNAlbar_Sel ;
      AV83Stocksquimicos_entradaproducto_wcds_8_tfpedcod = AV36TFPedCod ;
      AV84Stocksquimicos_entradaproducto_wcds_9_tfpedcod_to = AV37TFPedCod_To ;
      AV85Stocksquimicos_entradaproducto_wcds_10_tfentprvnum = AV38TFEntPrvNum ;
      AV86Stocksquimicos_entradaproducto_wcds_11_tfentprvnum_to = AV39TFEntPrvNum_To ;
      AV87Stocksquimicos_entradaproducto_wcds_12_tfentunient = AV40TFEntUniEnt ;
      AV88Stocksquimicos_entradaproducto_wcds_13_tfentunient_to = AV41TFEntUniEnt_To ;
      AV89Stocksquimicos_entradaproducto_wcds_14_tfentpre = AV50TFEntPre ;
      AV90Stocksquimicos_entradaproducto_wcds_15_tfentpre_to = AV51TFEntPre_To ;
      AV91Stocksquimicos_entradaproducto_wcds_16_tfentunirem = AV52TFEntUniRem ;
      AV92Stocksquimicos_entradaproducto_wcds_17_tfentunirem_to = AV53TFEntUniRem_To ;
      AV93Stocksquimicos_entradaproducto_wcds_18_tfentlotn = AV54TFEntLotN ;
      AV94Stocksquimicos_entradaproducto_wcds_19_tfentlotn_sel = AV55TFEntLotN_Sel ;
      AV95Stocksquimicos_entradaproducto_wcds_20_tfentfval = AV56TFEntFVal ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7Emprcod, AV8PrdNum, AV26TFLinEnt, AV27TFLinEnt_To, AV28TFEntFecEnt, AV32TFAlbaran, AV33TFAlbaran_Sel, AV34TFEntNAlbar, AV35TFEntNAlbar_Sel, AV36TFPedCod, AV37TFPedCod_To, AV38TFEntPrvNum, AV39TFEntPrvNum_To, AV40TFEntUniEnt, AV41TFEntUniEnt_To, AV50TFEntPre, AV51TFEntPre_To, AV52TFEntUniRem, AV53TFEntUniRem_To, AV54TFEntLotN, AV55TFEntLotN_Sel, AV56TFEntFVal, AV75Pgmname, AV14OrderedBy, AV15OrderedDsc, AV68PrdNom, A396EmprCod, A719PrdNum, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV76Stocksquimicos_entradaproducto_wcds_1_tflinent = AV26TFLinEnt ;
      AV77Stocksquimicos_entradaproducto_wcds_2_tflinent_to = AV27TFLinEnt_To ;
      AV78Stocksquimicos_entradaproducto_wcds_3_tfentfecent = AV28TFEntFecEnt ;
      AV79Stocksquimicos_entradaproducto_wcds_4_tfalbaran = AV32TFAlbaran ;
      AV80Stocksquimicos_entradaproducto_wcds_5_tfalbaran_sel = AV33TFAlbaran_Sel ;
      AV81Stocksquimicos_entradaproducto_wcds_6_tfentnalbar = AV34TFEntNAlbar ;
      AV82Stocksquimicos_entradaproducto_wcds_7_tfentnalbar_sel = AV35TFEntNAlbar_Sel ;
      AV83Stocksquimicos_entradaproducto_wcds_8_tfpedcod = AV36TFPedCod ;
      AV84Stocksquimicos_entradaproducto_wcds_9_tfpedcod_to = AV37TFPedCod_To ;
      AV85Stocksquimicos_entradaproducto_wcds_10_tfentprvnum = AV38TFEntPrvNum ;
      AV86Stocksquimicos_entradaproducto_wcds_11_tfentprvnum_to = AV39TFEntPrvNum_To ;
      AV87Stocksquimicos_entradaproducto_wcds_12_tfentunient = AV40TFEntUniEnt ;
      AV88Stocksquimicos_entradaproducto_wcds_13_tfentunient_to = AV41TFEntUniEnt_To ;
      AV89Stocksquimicos_entradaproducto_wcds_14_tfentpre = AV50TFEntPre ;
      AV90Stocksquimicos_entradaproducto_wcds_15_tfentpre_to = AV51TFEntPre_To ;
      AV91Stocksquimicos_entradaproducto_wcds_16_tfentunirem = AV52TFEntUniRem ;
      AV92Stocksquimicos_entradaproducto_wcds_17_tfentunirem_to = AV53TFEntUniRem_To ;
      AV93Stocksquimicos_entradaproducto_wcds_18_tfentlotn = AV54TFEntLotN ;
      AV94Stocksquimicos_entradaproducto_wcds_19_tfentlotn_sel = AV55TFEntLotN_Sel ;
      AV95Stocksquimicos_entradaproducto_wcds_20_tfentfval = AV56TFEntFVal ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7Emprcod, AV8PrdNum, AV26TFLinEnt, AV27TFLinEnt_To, AV28TFEntFecEnt, AV32TFAlbaran, AV33TFAlbaran_Sel, AV34TFEntNAlbar, AV35TFEntNAlbar_Sel, AV36TFPedCod, AV37TFPedCod_To, AV38TFEntPrvNum, AV39TFEntPrvNum_To, AV40TFEntUniEnt, AV41TFEntUniEnt_To, AV50TFEntPre, AV51TFEntPre_To, AV52TFEntUniRem, AV53TFEntUniRem_To, AV54TFEntLotN, AV55TFEntLotN_Sel, AV56TFEntFVal, AV75Pgmname, AV14OrderedBy, AV15OrderedDsc, AV68PrdNom, A396EmprCod, A719PrdNum, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV76Stocksquimicos_entradaproducto_wcds_1_tflinent = AV26TFLinEnt ;
      AV77Stocksquimicos_entradaproducto_wcds_2_tflinent_to = AV27TFLinEnt_To ;
      AV78Stocksquimicos_entradaproducto_wcds_3_tfentfecent = AV28TFEntFecEnt ;
      AV79Stocksquimicos_entradaproducto_wcds_4_tfalbaran = AV32TFAlbaran ;
      AV80Stocksquimicos_entradaproducto_wcds_5_tfalbaran_sel = AV33TFAlbaran_Sel ;
      AV81Stocksquimicos_entradaproducto_wcds_6_tfentnalbar = AV34TFEntNAlbar ;
      AV82Stocksquimicos_entradaproducto_wcds_7_tfentnalbar_sel = AV35TFEntNAlbar_Sel ;
      AV83Stocksquimicos_entradaproducto_wcds_8_tfpedcod = AV36TFPedCod ;
      AV84Stocksquimicos_entradaproducto_wcds_9_tfpedcod_to = AV37TFPedCod_To ;
      AV85Stocksquimicos_entradaproducto_wcds_10_tfentprvnum = AV38TFEntPrvNum ;
      AV86Stocksquimicos_entradaproducto_wcds_11_tfentprvnum_to = AV39TFEntPrvNum_To ;
      AV87Stocksquimicos_entradaproducto_wcds_12_tfentunient = AV40TFEntUniEnt ;
      AV88Stocksquimicos_entradaproducto_wcds_13_tfentunient_to = AV41TFEntUniEnt_To ;
      AV89Stocksquimicos_entradaproducto_wcds_14_tfentpre = AV50TFEntPre ;
      AV90Stocksquimicos_entradaproducto_wcds_15_tfentpre_to = AV51TFEntPre_To ;
      AV91Stocksquimicos_entradaproducto_wcds_16_tfentunirem = AV52TFEntUniRem ;
      AV92Stocksquimicos_entradaproducto_wcds_17_tfentunirem_to = AV53TFEntUniRem_To ;
      AV93Stocksquimicos_entradaproducto_wcds_18_tfentlotn = AV54TFEntLotN ;
      AV94Stocksquimicos_entradaproducto_wcds_19_tfentlotn_sel = AV55TFEntLotN_Sel ;
      AV95Stocksquimicos_entradaproducto_wcds_20_tfentfval = AV56TFEntFVal ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7Emprcod, AV8PrdNum, AV26TFLinEnt, AV27TFLinEnt_To, AV28TFEntFecEnt, AV32TFAlbaran, AV33TFAlbaran_Sel, AV34TFEntNAlbar, AV35TFEntNAlbar_Sel, AV36TFPedCod, AV37TFPedCod_To, AV38TFEntPrvNum, AV39TFEntPrvNum_To, AV40TFEntUniEnt, AV41TFEntUniEnt_To, AV50TFEntPre, AV51TFEntPre_To, AV52TFEntUniRem, AV53TFEntUniRem_To, AV54TFEntLotN, AV55TFEntLotN_Sel, AV56TFEntFVal, AV75Pgmname, AV14OrderedBy, AV15OrderedDsc, AV68PrdNom, A396EmprCod, A719PrdNum, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV76Stocksquimicos_entradaproducto_wcds_1_tflinent = AV26TFLinEnt ;
      AV77Stocksquimicos_entradaproducto_wcds_2_tflinent_to = AV27TFLinEnt_To ;
      AV78Stocksquimicos_entradaproducto_wcds_3_tfentfecent = AV28TFEntFecEnt ;
      AV79Stocksquimicos_entradaproducto_wcds_4_tfalbaran = AV32TFAlbaran ;
      AV80Stocksquimicos_entradaproducto_wcds_5_tfalbaran_sel = AV33TFAlbaran_Sel ;
      AV81Stocksquimicos_entradaproducto_wcds_6_tfentnalbar = AV34TFEntNAlbar ;
      AV82Stocksquimicos_entradaproducto_wcds_7_tfentnalbar_sel = AV35TFEntNAlbar_Sel ;
      AV83Stocksquimicos_entradaproducto_wcds_8_tfpedcod = AV36TFPedCod ;
      AV84Stocksquimicos_entradaproducto_wcds_9_tfpedcod_to = AV37TFPedCod_To ;
      AV85Stocksquimicos_entradaproducto_wcds_10_tfentprvnum = AV38TFEntPrvNum ;
      AV86Stocksquimicos_entradaproducto_wcds_11_tfentprvnum_to = AV39TFEntPrvNum_To ;
      AV87Stocksquimicos_entradaproducto_wcds_12_tfentunient = AV40TFEntUniEnt ;
      AV88Stocksquimicos_entradaproducto_wcds_13_tfentunient_to = AV41TFEntUniEnt_To ;
      AV89Stocksquimicos_entradaproducto_wcds_14_tfentpre = AV50TFEntPre ;
      AV90Stocksquimicos_entradaproducto_wcds_15_tfentpre_to = AV51TFEntPre_To ;
      AV91Stocksquimicos_entradaproducto_wcds_16_tfentunirem = AV52TFEntUniRem ;
      AV92Stocksquimicos_entradaproducto_wcds_17_tfentunirem_to = AV53TFEntUniRem_To ;
      AV93Stocksquimicos_entradaproducto_wcds_18_tfentlotn = AV54TFEntLotN ;
      AV94Stocksquimicos_entradaproducto_wcds_19_tfentlotn_sel = AV55TFEntLotN_Sel ;
      AV95Stocksquimicos_entradaproducto_wcds_20_tfentfval = AV56TFEntFVal ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7Emprcod, AV8PrdNum, AV26TFLinEnt, AV27TFLinEnt_To, AV28TFEntFecEnt, AV32TFAlbaran, AV33TFAlbaran_Sel, AV34TFEntNAlbar, AV35TFEntNAlbar_Sel, AV36TFPedCod, AV37TFPedCod_To, AV38TFEntPrvNum, AV39TFEntPrvNum_To, AV40TFEntUniEnt, AV41TFEntUniEnt_To, AV50TFEntPre, AV51TFEntPre_To, AV52TFEntUniRem, AV53TFEntUniRem_To, AV54TFEntLotN, AV55TFEntLotN_Sel, AV56TFEntFVal, AV75Pgmname, AV14OrderedBy, AV15OrderedDsc, AV68PrdNom, A396EmprCod, A719PrdNum, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV75Pgmname = "StocksQuimicos.EntradaProducto_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75Pgmname", AV75Pgmname);
      Gx_err = (short)(0) ;
      edtavPrdnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrdnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdnum_Enabled), 5, 0), true);
      edtavPrdnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrdnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdnom_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1TA0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e151TA2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV60DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_42 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_42"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV62GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV63GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV7Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV7Emprcod") ;
         wcpOAV8PrdNum = httpContext.cgiGet( sPrefix+"wcpOAV8PrdNum") ;
         wcpOAV68PrdNom = httpContext.cgiGet( sPrefix+"wcpOAV68PrdNom") ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
         Ddo_grid_Sortedstatus = httpContext.cgiGet( sPrefix+"DDO_GRID_Sortedstatus") ;
         Ddo_grid_Includefilter = httpContext.cgiGet( sPrefix+"DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( sPrefix+"DDO_GRID_Filtertype") ;
         Ddo_grid_Filterisrange = httpContext.cgiGet( sPrefix+"DDO_GRID_Filterisrange") ;
         Ddo_grid_Includedatalist = httpContext.cgiGet( sPrefix+"DDO_GRID_Includedatalist") ;
         Ddo_grid_Datalisttype = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalisttype") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalistproc") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Fixedcolumns = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Fixedcolumns") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_get") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedcolumn") ;
         /* Read variables values. */
         AV75Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75Pgmname", AV75Pgmname);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_entfecentauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_ENTFECENTAUXDATE");
            GX_FocusControl = edtavDdo_entfecentauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV30DDO_EntFecEntAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30DDO_EntFecEntAuxDate", localUtil.format(AV30DDO_EntFecEntAuxDate, "99/99/99"));
         }
         else
         {
            AV30DDO_EntFecEntAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_entfecentauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30DDO_EntFecEntAuxDate", localUtil.format(AV30DDO_EntFecEntAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_entfvalauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_ENTFVALAUXDATE");
            GX_FocusControl = edtavDdo_entfvalauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV58DDO_EntFValAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58DDO_EntFValAuxDate", localUtil.format(AV58DDO_EntFValAuxDate, "99/99/99"));
         }
         else
         {
            AV58DDO_EntFValAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_entfvalauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58DDO_EntFValAuxDate", localUtil.format(AV58DDO_EntFValAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"EntradaProducto_WC");
         AV75Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75Pgmname", AV75Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV75Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("stocksquimicos\\entradaproducto_wc:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e151TA2 ();
      if (returnInSub) return;
   }

   public void e151TA2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV65Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      entradaproducto_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV65Station = GXt_char1 ;
      GXv_char2[0] = AV7Emprcod ;
      GXv_char3[0] = AV66EmprNom ;
      GXv_char4[0] = AV67UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV65Station, GXv_char2, GXv_char3, GXv_char4) ;
      entradaproducto_wc_impl.this.AV7Emprcod = GXv_char2[0] ;
      entradaproducto_wc_impl.this.AV66EmprNom = GXv_char3[0] ;
      entradaproducto_wc_impl.this.AV67UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Emprcod", AV7Emprcod);
      GXt_char1 = AV65Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      entradaproducto_wc_impl.this.GXt_char1 = GXv_char4[0] ;
      AV65Station = GXt_char1 ;
      GXv_char4[0] = AV7Emprcod ;
      GXv_char3[0] = AV66EmprNom ;
      GXv_char2[0] = AV67UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV65Station, GXv_char4, GXv_char3, GXv_char2) ;
      entradaproducto_wc_impl.this.AV7Emprcod = GXv_char4[0] ;
      entradaproducto_wc_impl.this.AV66EmprNom = GXv_char3[0] ;
      entradaproducto_wc_impl.this.AV67UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Emprcod", AV7Emprcod);
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S112 ();
      if (returnInSub) return;
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( AV14OrderedBy < 1 )
      {
         AV14OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14OrderedBy), 4, 0));
         AV15OrderedDsc = true ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15OrderedDsc", AV15OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV60DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV60DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e161TA2( )
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
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      AV62GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62GridCurrentPage), 10, 0));
      AV63GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63GridPageCount), 10, 0));
      AV76Stocksquimicos_entradaproducto_wcds_1_tflinent = AV26TFLinEnt ;
      AV77Stocksquimicos_entradaproducto_wcds_2_tflinent_to = AV27TFLinEnt_To ;
      AV78Stocksquimicos_entradaproducto_wcds_3_tfentfecent = AV28TFEntFecEnt ;
      AV79Stocksquimicos_entradaproducto_wcds_4_tfalbaran = AV32TFAlbaran ;
      AV80Stocksquimicos_entradaproducto_wcds_5_tfalbaran_sel = AV33TFAlbaran_Sel ;
      AV81Stocksquimicos_entradaproducto_wcds_6_tfentnalbar = AV34TFEntNAlbar ;
      AV82Stocksquimicos_entradaproducto_wcds_7_tfentnalbar_sel = AV35TFEntNAlbar_Sel ;
      AV83Stocksquimicos_entradaproducto_wcds_8_tfpedcod = AV36TFPedCod ;
      AV84Stocksquimicos_entradaproducto_wcds_9_tfpedcod_to = AV37TFPedCod_To ;
      AV85Stocksquimicos_entradaproducto_wcds_10_tfentprvnum = AV38TFEntPrvNum ;
      AV86Stocksquimicos_entradaproducto_wcds_11_tfentprvnum_to = AV39TFEntPrvNum_To ;
      AV87Stocksquimicos_entradaproducto_wcds_12_tfentunient = AV40TFEntUniEnt ;
      AV88Stocksquimicos_entradaproducto_wcds_13_tfentunient_to = AV41TFEntUniEnt_To ;
      AV89Stocksquimicos_entradaproducto_wcds_14_tfentpre = AV50TFEntPre ;
      AV90Stocksquimicos_entradaproducto_wcds_15_tfentpre_to = AV51TFEntPre_To ;
      AV91Stocksquimicos_entradaproducto_wcds_16_tfentunirem = AV52TFEntUniRem ;
      AV92Stocksquimicos_entradaproducto_wcds_17_tfentunirem_to = AV53TFEntUniRem_To ;
      AV93Stocksquimicos_entradaproducto_wcds_18_tfentlotn = AV54TFEntLotN ;
      AV94Stocksquimicos_entradaproducto_wcds_19_tfentlotn_sel = AV55TFEntLotN_Sel ;
      AV95Stocksquimicos_entradaproducto_wcds_20_tfentfval = AV56TFEntFVal ;
      /*  Sending Event outputs  */
   }

   public void e111TA2( )
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
         AV61PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV61PageToGo) ;
      }
   }

   public void e121TA2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e131TA2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV14OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14OrderedBy), 4, 0));
         AV15OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15OrderedDsc", AV15OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "LinEnt") == 0 )
         {
            AV26TFLinEnt = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFLinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFLinEnt), 4, 0));
            AV27TFLinEnt_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFLinEnt_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFLinEnt_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "EntFecEnt") == 0 )
         {
            AV28TFEntFecEnt = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFEntFecEnt", localUtil.format(AV28TFEntFecEnt, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Albaran") == 0 )
         {
            AV32TFAlbaran = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFAlbaran", AV32TFAlbaran);
            AV33TFAlbaran_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFAlbaran_Sel", AV33TFAlbaran_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "EntNAlbar") == 0 )
         {
            AV34TFEntNAlbar = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFEntNAlbar", AV34TFEntNAlbar);
            AV35TFEntNAlbar_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFEntNAlbar_Sel", AV35TFEntNAlbar_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PedCod") == 0 )
         {
            AV36TFPedCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFPedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFPedCod), 8, 0));
            AV37TFPedCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFPedCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFPedCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "EntPrvNum") == 0 )
         {
            AV38TFEntPrvNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFEntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38TFEntPrvNum), 6, 0));
            AV39TFEntPrvNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFEntPrvNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39TFEntPrvNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "EntUniEnt") == 0 )
         {
            AV40TFEntUniEnt = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFEntUniEnt", GXutil.ltrimstr( AV40TFEntUniEnt, 9, 2));
            AV41TFEntUniEnt_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFEntUniEnt_To", GXutil.ltrimstr( AV41TFEntUniEnt_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "EntPre") == 0 )
         {
            AV50TFEntPre = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFEntPre", GXutil.ltrimstr( AV50TFEntPre, 14, 5));
            AV51TFEntPre_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFEntPre_To", GXutil.ltrimstr( AV51TFEntPre_To, 14, 5));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "EntUniRem") == 0 )
         {
            AV52TFEntUniRem = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFEntUniRem", GXutil.ltrimstr( AV52TFEntUniRem, 11, 4));
            AV53TFEntUniRem_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFEntUniRem_To", GXutil.ltrimstr( AV53TFEntUniRem_To, 11, 4));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "EntLotN") == 0 )
         {
            AV54TFEntLotN = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFEntLotN", AV54TFEntLotN);
            AV55TFEntLotN_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFEntLotN_Sel", AV55TFEntLotN_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "EntFVal") == 0 )
         {
            AV56TFEntFVal = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFEntFVal", localUtil.format(AV56TFEntFVal, "99/99/99"));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e171TA2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGridactions.removeAllItems();
      cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "Modificar", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GX_BtnDelete", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(42) ;
      }
      sendrow_422( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_42_Refreshing )
      {
         httpContext.doAjaxLoad(42, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV64GridActions, 4, 0)) );
   }

   public void e181TA2( )
   {
      /* Gridactions_Click Routine */
      returnInSub = false ;
      if ( AV64GridActions == 1 )
      {
         /* Execute user subroutine: 'DO MODIFICAR' */
         S162 ();
         if (returnInSub) return;
      }
      else if ( AV64GridActions == 2 )
      {
         /* Execute user subroutine: 'DO DELETE' */
         S172 ();
         if (returnInSub) return;
      }
      AV64GridActions = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64GridActions), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV64GridActions, 4, 0)) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), true);
   }

   public void e141TA2( )
   {
      /* 'DoInsertar' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.stocksquimicos.entradaproducto_trn", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim(AV7Emprcod)),GXutil.URLEncode(GXutil.rtrim(AV8PrdNum)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0))}, new String[] {"Mode","EmprCod","PrdNum","LinEnt"}) , new Object[] {});
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV14OrderedBy, 4, 0))+":"+(AV15OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'DO MODIFICAR' Routine */
      returnInSub = false ;
      if ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) == 0 )
      {
         httpContext.popup(formatLink("app.stocksquimicos.entradaproducto_trn", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A719PrdNum)),GXutil.URLEncode(GXutil.ltrimstr(A597LinEnt,4,0))}, new String[] {"Mode","EmprCod","PrdNum","LinEnt"}) , new Object[] {});
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencion.Esta linea ya se esta consumiento. NO se permite modificar", ""));
      }
   }

   public void S172( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
      if ( DecimalUtil.compareTo(A419EntUniRem, A418EntUniEnt) == 0 )
      {
         callWebObject(formatLink("app.stocksquimicos.entradaproducto_trn", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A719PrdNum)),GXutil.URLEncode(GXutil.ltrimstr(A597LinEnt,4,0))}, new String[] {"Mode","EmprCod","PrdNum","LinEnt"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencion.Esta linea ya se esta consumiento. NO se permite Eliminarr", ""));
      }
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV22Session.getValue(AV75Pgmname+"GridState"), "") == 0 )
      {
         AV12GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV75Pgmname+"GridState"), null, null);
      }
      else
      {
         AV12GridState.fromxml(AV22Session.getValue(AV75Pgmname+"GridState"), null, null);
      }
      AV14OrderedBy = AV12GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14OrderedBy), 4, 0));
      AV15OrderedDsc = AV12GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15OrderedDsc", AV15OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      AV96GXV1 = 1 ;
      while ( AV96GXV1 <= AV12GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV13GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV12GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV96GXV1));
         if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLINENT") == 0 )
         {
            AV26TFLinEnt = (short)(GXutil.lval( AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFLinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFLinEnt), 4, 0));
            AV27TFLinEnt_To = (short)(GXutil.lval( AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFLinEnt_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFLinEnt_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTFECENT") == 0 )
         {
            AV28TFEntFecEnt = localUtil.ctod( AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFEntFecEnt", localUtil.format(AV28TFEntFecEnt, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBARAN") == 0 )
         {
            AV32TFAlbaran = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFAlbaran", AV32TFAlbaran);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBARAN_SEL") == 0 )
         {
            AV33TFAlbaran_Sel = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFAlbaran_Sel", AV33TFAlbaran_Sel);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTNALBAR") == 0 )
         {
            AV34TFEntNAlbar = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFEntNAlbar", AV34TFEntNAlbar);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTNALBAR_SEL") == 0 )
         {
            AV35TFEntNAlbar_Sel = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFEntNAlbar_Sel", AV35TFEntNAlbar_Sel);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDCOD") == 0 )
         {
            AV36TFPedCod = (int)(GXutil.lval( AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFPedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFPedCod), 8, 0));
            AV37TFPedCod_To = (int)(GXutil.lval( AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFPedCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFPedCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTPRVNUM") == 0 )
         {
            AV38TFEntPrvNum = (int)(GXutil.lval( AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFEntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38TFEntPrvNum), 6, 0));
            AV39TFEntPrvNum_To = (int)(GXutil.lval( AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFEntPrvNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39TFEntPrvNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTUNIENT") == 0 )
         {
            AV40TFEntUniEnt = CommonUtil.decimalVal( AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFEntUniEnt", GXutil.ltrimstr( AV40TFEntUniEnt, 9, 2));
            AV41TFEntUniEnt_To = CommonUtil.decimalVal( AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFEntUniEnt_To", GXutil.ltrimstr( AV41TFEntUniEnt_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTPRE") == 0 )
         {
            AV50TFEntPre = CommonUtil.decimalVal( AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFEntPre", GXutil.ltrimstr( AV50TFEntPre, 14, 5));
            AV51TFEntPre_To = CommonUtil.decimalVal( AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFEntPre_To", GXutil.ltrimstr( AV51TFEntPre_To, 14, 5));
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTUNIREM") == 0 )
         {
            AV52TFEntUniRem = CommonUtil.decimalVal( AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFEntUniRem", GXutil.ltrimstr( AV52TFEntUniRem, 11, 4));
            AV53TFEntUniRem_To = CommonUtil.decimalVal( AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFEntUniRem_To", GXutil.ltrimstr( AV53TFEntUniRem_To, 11, 4));
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTLOTN") == 0 )
         {
            AV54TFEntLotN = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFEntLotN", AV54TFEntLotN);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTLOTN_SEL") == 0 )
         {
            AV55TFEntLotN_Sel = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFEntLotN_Sel", AV55TFEntLotN_Sel);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTFVAL") == 0 )
         {
            AV56TFEntFVal = localUtil.ctod( AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFEntFVal", localUtil.format(AV56TFEntFVal, "99/99/99"));
         }
         AV96GXV1 = (int)(AV96GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV33TFAlbaran_Sel)==0), AV33TFAlbaran_Sel, GXv_char4) ;
      entradaproducto_wc_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char8 = "" ;
      GXv_char3[0] = GXt_char8 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV35TFEntNAlbar_Sel)==0), AV35TFEntNAlbar_Sel, GXv_char3) ;
      entradaproducto_wc_impl.this.GXt_char8 = GXv_char3[0] ;
      GXt_char9 = "" ;
      GXv_char2[0] = GXt_char9 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV55TFEntLotN_Sel)==0), AV55TFEntLotN_Sel, GXv_char2) ;
      entradaproducto_wc_impl.this.GXt_char9 = GXv_char2[0] ;
      Ddo_grid_Selectedvalue_set = "||"+GXt_char1+"|"+GXt_char8+"||||||"+GXt_char9+"|" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char9 = "" ;
      GXv_char4[0] = GXt_char9 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV32TFAlbaran)==0), AV32TFAlbaran, GXv_char4) ;
      entradaproducto_wc_impl.this.GXt_char9 = GXv_char4[0] ;
      GXt_char8 = "" ;
      GXv_char3[0] = GXt_char8 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV34TFEntNAlbar)==0), AV34TFEntNAlbar, GXv_char3) ;
      entradaproducto_wc_impl.this.GXt_char8 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV54TFEntLotN)==0), AV54TFEntLotN, GXv_char2) ;
      entradaproducto_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV26TFLinEnt) ? "" : GXutil.str( AV26TFLinEnt, 4, 0))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV28TFEntFecEnt)) ? "" : localUtil.dtoc( AV28TFEntFecEnt, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+GXt_char9+"|"+GXt_char8+"|"+((0==AV36TFPedCod) ? "" : GXutil.str( AV36TFPedCod, 8, 0))+"|"+((0==AV38TFEntPrvNum) ? "" : GXutil.str( AV38TFEntPrvNum, 6, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFEntUniEnt)==0) ? "" : GXutil.str( AV40TFEntUniEnt, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV50TFEntPre)==0) ? "" : GXutil.str( AV50TFEntPre, 14, 5))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV52TFEntUniRem)==0) ? "" : GXutil.str( AV52TFEntUniRem, 11, 4))+"|"+GXt_char1+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV56TFEntFVal)) ? "" : localUtil.dtoc( AV56TFEntFVal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV27TFLinEnt_To) ? "" : GXutil.str( AV27TFLinEnt_To, 4, 0))+"||||"+((0==AV37TFPedCod_To) ? "" : GXutil.str( AV37TFPedCod_To, 8, 0))+"|"+((0==AV39TFEntPrvNum_To) ? "" : GXutil.str( AV39TFEntPrvNum_To, 6, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFEntUniEnt_To)==0) ? "" : GXutil.str( AV41TFEntUniEnt_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TFEntPre_To)==0) ? "" : GXutil.str( AV51TFEntPre_To, 14, 5))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV53TFEntUniRem_To)==0) ? "" : GXutil.str( AV53TFEntUniRem_To, 11, 4))+"||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
      if ( ! (GXutil.strcmp("", GXutil.trim( AV12GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV12GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV12GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV12GridState.fromxml(AV22Session.getValue(AV75Pgmname+"GridState"), null, null);
      AV12GridState.setgxTv_SdtWWPGridState_Orderedby( AV14OrderedBy );
      AV12GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV15OrderedDsc );
      AV12GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState10[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState10, "TFLINENT", "", !((0==AV26TFLinEnt)&&(0==AV27TFLinEnt_To)), (short)(0), GXutil.trim( GXutil.str( AV26TFLinEnt, 4, 0)), GXutil.trim( GXutil.str( AV27TFLinEnt_To, 4, 0))) ;
      AV12GridState = GXv_SdtWWPGridState10[0] ;
      GXv_SdtWWPGridState10[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState10, "TFENTFECENT", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV28TFEntFecEnt)), (short)(0), GXutil.trim( localUtil.dtoc( AV28TFEntFecEnt, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV12GridState = GXv_SdtWWPGridState10[0] ;
      GXv_SdtWWPGridState10[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState10, "TFALBARAN", "", !(GXutil.strcmp("", AV32TFAlbaran)==0), (short)(0), AV32TFAlbaran, "", !(GXutil.strcmp("", AV33TFAlbaran_Sel)==0), AV33TFAlbaran_Sel, "") ;
      AV12GridState = GXv_SdtWWPGridState10[0] ;
      GXv_SdtWWPGridState10[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState10, "TFENTNALBAR", "", !(GXutil.strcmp("", AV34TFEntNAlbar)==0), (short)(0), AV34TFEntNAlbar, "", !(GXutil.strcmp("", AV35TFEntNAlbar_Sel)==0), AV35TFEntNAlbar_Sel, "") ;
      AV12GridState = GXv_SdtWWPGridState10[0] ;
      GXv_SdtWWPGridState10[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState10, "TFPEDCOD", "", !((0==AV36TFPedCod)&&(0==AV37TFPedCod_To)), (short)(0), GXutil.trim( GXutil.str( AV36TFPedCod, 8, 0)), GXutil.trim( GXutil.str( AV37TFPedCod_To, 8, 0))) ;
      AV12GridState = GXv_SdtWWPGridState10[0] ;
      GXv_SdtWWPGridState10[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState10, "TFENTPRVNUM", "", !((0==AV38TFEntPrvNum)&&(0==AV39TFEntPrvNum_To)), (short)(0), GXutil.trim( GXutil.str( AV38TFEntPrvNum, 6, 0)), GXutil.trim( GXutil.str( AV39TFEntPrvNum_To, 6, 0))) ;
      AV12GridState = GXv_SdtWWPGridState10[0] ;
      GXv_SdtWWPGridState10[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState10, "TFENTUNIENT", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFEntUniEnt)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFEntUniEnt_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV40TFEntUniEnt, 9, 2)), GXutil.trim( GXutil.str( AV41TFEntUniEnt_To, 9, 2))) ;
      AV12GridState = GXv_SdtWWPGridState10[0] ;
      GXv_SdtWWPGridState10[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState10, "TFENTPRE", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV50TFEntPre)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TFEntPre_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV50TFEntPre, 14, 5)), GXutil.trim( GXutil.str( AV51TFEntPre_To, 14, 5))) ;
      AV12GridState = GXv_SdtWWPGridState10[0] ;
      GXv_SdtWWPGridState10[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState10, "TFENTUNIREM", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV52TFEntUniRem)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV53TFEntUniRem_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV52TFEntUniRem, 11, 4)), GXutil.trim( GXutil.str( AV53TFEntUniRem_To, 11, 4))) ;
      AV12GridState = GXv_SdtWWPGridState10[0] ;
      GXv_SdtWWPGridState10[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState10, "TFENTLOTN", "", !(GXutil.strcmp("", AV54TFEntLotN)==0), (short)(0), AV54TFEntLotN, "", !(GXutil.strcmp("", AV55TFEntLotN_Sel)==0), AV55TFEntLotN_Sel, "") ;
      AV12GridState = GXv_SdtWWPGridState10[0] ;
      GXv_SdtWWPGridState10[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState10, "TFENTFVAL", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV56TFEntFVal)), (short)(0), GXutil.trim( localUtil.dtoc( AV56TFEntFVal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV12GridState = GXv_SdtWWPGridState10[0] ;
      if ( ! (GXutil.strcmp("", AV7Emprcod)==0) )
      {
         AV13GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV13GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV13GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV7Emprcod );
         AV12GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV13GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV8PrdNum)==0) )
      {
         AV13GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV13GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PRDNUM" );
         AV13GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV8PrdNum );
         AV12GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV13GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV68PrdNom)==0) )
      {
         AV13GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV13GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PRDNOM" );
         AV13GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV68PrdNom );
         AV12GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV13GridStateFilterValue, 0);
      }
      AV12GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV12GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV75Pgmname+"GridState", AV12GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV10TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV10TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV75Pgmname );
      AV10TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV10TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV9HTTPRequest.getScriptName()+"?"+AV9HTTPRequest.getQuerystring() );
      AV10TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "StocksQuimicos.EntradadeProductosAlmacen_TRN" );
      AV22Session.setValue("TrnContext", AV10TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S112( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV22Session.getValue(AV75Pgmname+"GridState"), "") == 0 )
      {
         AV12GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV75Pgmname+"GridState"), null, null);
      }
      else
      {
         AV12GridState.fromxml(AV22Session.getValue(AV75Pgmname+"GridState"), null, null);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "ALBA20", "")) == 0 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtAlbaran_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbaran_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbaran_Visible), 5, 0), !bGXsfl_42_Refreshing);
         GXv_SdtWWPGridState10[0] = AV12GridState;
         if ( new app.wwpbaseobjects.wwp_deletefilter(remoteHandle, context).executeUdp( GXv_SdtWWPGridState10, "TFALBARAN", false) )
         {
            Cond_result = true ;
         }
         else
         {
            Cond_result = false ;
         }
         AV12GridState = GXv_SdtWWPGridState10[0] ;
         if ( Cond_result )
         {
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV75Pgmname+"GridState", AV12GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
         }
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "ALBA20", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtEntNAlbar_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtEntNAlbar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntNAlbar_Visible), 5, 0), !bGXsfl_42_Refreshing);
         GXv_SdtWWPGridState10[0] = AV12GridState;
         if ( new app.wwpbaseobjects.wwp_deletefilter(remoteHandle, context).executeUdp( GXv_SdtWWPGridState10, "TFENTNALBAR", false) )
         {
            Cond_result = true ;
         }
         else
         {
            Cond_result = false ;
         }
         AV12GridState = GXv_SdtWWPGridState10[0] ;
         if ( Cond_result )
         {
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV75Pgmname+"GridState", AV12GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
         }
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV7Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Emprcod", AV7Emprcod);
      AV8PrdNum = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8PrdNum", AV8PrdNum);
      AV68PrdNom = (String)getParm(obj,2,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68PrdNom", AV68PrdNom);
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
      pa1TA2( ) ;
      ws1TA2( ) ;
      we1TA2( ) ;
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
      sCtrlAV7Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV8PrdNum = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV68PrdNom = (String)getParm(obj,2,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1TA2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "stocksquimicos\\entradaproducto_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1TA2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV7Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Emprcod", AV7Emprcod);
         AV8PrdNum = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8PrdNum", AV8PrdNum);
         AV68PrdNom = (String)getParm(obj,4,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68PrdNom", AV68PrdNom);
      }
      wcpOAV7Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV7Emprcod") ;
      wcpOAV8PrdNum = httpContext.cgiGet( sPrefix+"wcpOAV8PrdNum") ;
      wcpOAV68PrdNom = httpContext.cgiGet( sPrefix+"wcpOAV68PrdNom") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV7Emprcod, wcpOAV7Emprcod) != 0 ) || ( GXutil.strcmp(AV8PrdNum, wcpOAV8PrdNum) != 0 ) || ( GXutil.strcmp(AV68PrdNom, wcpOAV68PrdNom) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV7Emprcod = AV7Emprcod ;
      wcpOAV8PrdNum = AV8PrdNum ;
      wcpOAV68PrdNom = AV68PrdNom ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV7Emprcod = httpContext.cgiGet( sPrefix+"AV7Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV7Emprcod) > 0 )
      {
         AV7Emprcod = httpContext.cgiGet( sCtrlAV7Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Emprcod", AV7Emprcod);
      }
      else
      {
         AV7Emprcod = httpContext.cgiGet( sPrefix+"AV7Emprcod_PARM") ;
      }
      sCtrlAV8PrdNum = httpContext.cgiGet( sPrefix+"AV8PrdNum_CTRL") ;
      if ( GXutil.len( sCtrlAV8PrdNum) > 0 )
      {
         AV8PrdNum = httpContext.cgiGet( sCtrlAV8PrdNum) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8PrdNum", AV8PrdNum);
      }
      else
      {
         AV8PrdNum = httpContext.cgiGet( sPrefix+"AV8PrdNum_PARM") ;
      }
      sCtrlAV68PrdNom = httpContext.cgiGet( sPrefix+"AV68PrdNom_CTRL") ;
      if ( GXutil.len( sCtrlAV68PrdNom) > 0 )
      {
         AV68PrdNom = httpContext.cgiGet( sCtrlAV68PrdNom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68PrdNom", AV68PrdNom);
      }
      else
      {
         AV68PrdNom = httpContext.cgiGet( sPrefix+"AV68PrdNom_PARM") ;
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
      pa1TA2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1TA2( ) ;
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
      ws1TA2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7Emprcod_PARM", GXutil.rtrim( AV7Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7Emprcod_CTRL", GXutil.rtrim( sCtrlAV7Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8PrdNum_PARM", GXutil.rtrim( AV8PrdNum));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV8PrdNum)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8PrdNum_CTRL", GXutil.rtrim( sCtrlAV8PrdNum));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV68PrdNom_PARM", GXutil.rtrim( AV68PrdNom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV68PrdNom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV68PrdNom_CTRL", GXutil.rtrim( sCtrlAV68PrdNom));
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
      we1TA2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211693623", true, true);
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
      httpContext.AddJavascriptSource("stocksquimicos/entradaproducto_wc.js", "?20268211693623", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_422( )
   {
      cmbavGridactions.setInternalname( sPrefix+"vGRIDACTIONS_"+sGXsfl_42_idx );
      edtLinEnt_Internalname = sPrefix+"LINENT_"+sGXsfl_42_idx ;
      edtEntFecEnt_Internalname = sPrefix+"ENTFECENT_"+sGXsfl_42_idx ;
      edtAlbaran_Internalname = sPrefix+"ALBARAN_"+sGXsfl_42_idx ;
      edtEntNAlbar_Internalname = sPrefix+"ENTNALBAR_"+sGXsfl_42_idx ;
      edtPedCod_Internalname = sPrefix+"PEDCOD_"+sGXsfl_42_idx ;
      edtEntPrvNum_Internalname = sPrefix+"ENTPRVNUM_"+sGXsfl_42_idx ;
      edtEntUniEnt_Internalname = sPrefix+"ENTUNIENT_"+sGXsfl_42_idx ;
      edtEntPre_Internalname = sPrefix+"ENTPRE_"+sGXsfl_42_idx ;
      edtEntUniRem_Internalname = sPrefix+"ENTUNIREM_"+sGXsfl_42_idx ;
      edtEntLotN_Internalname = sPrefix+"ENTLOTN_"+sGXsfl_42_idx ;
      edtEntFVal_Internalname = sPrefix+"ENTFVAL_"+sGXsfl_42_idx ;
   }

   public void subsflControlProps_fel_422( )
   {
      cmbavGridactions.setInternalname( sPrefix+"vGRIDACTIONS_"+sGXsfl_42_fel_idx );
      edtLinEnt_Internalname = sPrefix+"LINENT_"+sGXsfl_42_fel_idx ;
      edtEntFecEnt_Internalname = sPrefix+"ENTFECENT_"+sGXsfl_42_fel_idx ;
      edtAlbaran_Internalname = sPrefix+"ALBARAN_"+sGXsfl_42_fel_idx ;
      edtEntNAlbar_Internalname = sPrefix+"ENTNALBAR_"+sGXsfl_42_fel_idx ;
      edtPedCod_Internalname = sPrefix+"PEDCOD_"+sGXsfl_42_fel_idx ;
      edtEntPrvNum_Internalname = sPrefix+"ENTPRVNUM_"+sGXsfl_42_fel_idx ;
      edtEntUniEnt_Internalname = sPrefix+"ENTUNIENT_"+sGXsfl_42_fel_idx ;
      edtEntPre_Internalname = sPrefix+"ENTPRE_"+sGXsfl_42_fel_idx ;
      edtEntUniRem_Internalname = sPrefix+"ENTUNIREM_"+sGXsfl_42_fel_idx ;
      edtEntLotN_Internalname = sPrefix+"ENTLOTN_"+sGXsfl_42_fel_idx ;
      edtEntFVal_Internalname = sPrefix+"ENTFVAL_"+sGXsfl_42_fel_idx ;
   }

   public void sendrow_422( )
   {
      subsflControlProps_422( ) ;
      wb1TA0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_42_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_42_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_42_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 43,'"+sPrefix+"',false,'"+sGXsfl_42_idx+"',42)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_42_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV64GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV64GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV64GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(5),"'"+sPrefix+"'"+",false,"+"'"+sPrefix+"EVGRIDACTIONS.CLICK."+sGXsfl_42_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,43);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV64GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_42_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLinEnt_Internalname,GXutil.ltrim( localUtil.ntoc( A597LinEnt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A597LinEnt), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLinEnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEntFecEnt_Internalname,localUtil.format(A415EntFecEnt, "99/99/99"),localUtil.format( A415EntFecEnt, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtEntFecEnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtAlbaran_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbaran_Internalname,GXutil.rtrim( A11Albaran),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbaran_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtAlbaran_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtEntNAlbar_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEntNAlbar_Internalname,GXutil.rtrim( A12857EntNAlbar),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtEntNAlbar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtEntNAlbar_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPedCod_Internalname,GXutil.ltrim( localUtil.ntoc( A658PedCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A658PedCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPedCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEntPrvNum_Internalname,GXutil.ltrim( localUtil.ntoc( A6156EntPrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6156EntPrvNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtEntPrvNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEntUniEnt_Internalname,GXutil.ltrim( localUtil.ntoc( A418EntUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A418EntUniEnt, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtEntUniEnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEntPre_Internalname,GXutil.ltrim( localUtil.ntoc( A417EntPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A417EntPre, "ZZZZZZZ9.999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtEntPre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEntUniRem_Internalname,GXutil.ltrim( localUtil.ntoc( A419EntUniRem, (byte)(11), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A419EntUniRem, "ZZZZZ9.9999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtEntUniRem_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEntLotN_Internalname,GXutil.rtrim( A5686EntLotN),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtEntLotN_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEntFVal_Internalname,localUtil.format(A5685EntFVal, "99/99/99"),localUtil.format( A5685EntFVal, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtEntFVal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1TA2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_42_idx = ((subGrid_Islastpage==1)&&(nGXsfl_42_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_42_idx+1) ;
         sGXsfl_42_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_42_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_422( ) ;
      }
      /* End function sendrow_422 */
   }

   public void startgridcontrol42( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"42\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbaran_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Documento", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtEntNAlbar_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Documento", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Pedido", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Proveedor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Unidades", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Precio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Remanente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Lote", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Caducidad", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV64GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A597LinEnt, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A415EntFecEnt, "99/99/99"));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A11Albaran));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbaran_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A12857EntNAlbar));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtEntNAlbar_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A658PedCod, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6156EntPrvNum, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A418EntUniEnt, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A417EntPre, (byte)(14), (byte)(5), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A419EntUniRem, (byte)(11), (byte)(4), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5686EntLotN));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A5685EntFVal, "99/99/99"));
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
      bttBtninsertar_Internalname = sPrefix+"BTNINSERTAR" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      lblTextblockprdnum_Internalname = sPrefix+"TEXTBLOCKPRDNUM" ;
      edtavPrdnum_Internalname = sPrefix+"vPRDNUM" ;
      divUnnamedtableprdnum_Internalname = sPrefix+"UNNAMEDTABLEPRDNUM" ;
      lblTextblockprdnom_Internalname = sPrefix+"TEXTBLOCKPRDNOM" ;
      edtavPrdnom_Internalname = sPrefix+"vPRDNOM" ;
      divUnnamedtableprdnom_Internalname = sPrefix+"UNNAMEDTABLEPRDNOM" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      cmbavGridactions.setInternalname( sPrefix+"vGRIDACTIONS" );
      edtLinEnt_Internalname = sPrefix+"LINENT" ;
      edtEntFecEnt_Internalname = sPrefix+"ENTFECENT" ;
      edtAlbaran_Internalname = sPrefix+"ALBARAN" ;
      edtEntNAlbar_Internalname = sPrefix+"ENTNALBAR" ;
      edtPedCod_Internalname = sPrefix+"PEDCOD" ;
      edtEntPrvNum_Internalname = sPrefix+"ENTPRVNUM" ;
      edtEntUniEnt_Internalname = sPrefix+"ENTUNIENT" ;
      edtEntPre_Internalname = sPrefix+"ENTPRE" ;
      edtEntUniRem_Internalname = sPrefix+"ENTUNIREM" ;
      edtEntLotN_Internalname = sPrefix+"ENTLOTN" ;
      edtEntFVal_Internalname = sPrefix+"ENTFVAL" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
      edtavDdo_entfecentauxdate_Internalname = sPrefix+"vDDO_ENTFECENTAUXDATE" ;
      divDdo_entfecentauxdates_Internalname = sPrefix+"DDO_ENTFECENTAUXDATES" ;
      edtavDdo_entfvalauxdate_Internalname = sPrefix+"vDDO_ENTFVALAUXDATE" ;
      divDdo_entfvalauxdates_Internalname = sPrefix+"DDO_ENTFVALAUXDATES" ;
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
      edtEntFVal_Jsonclick = "" ;
      edtEntLotN_Jsonclick = "" ;
      edtEntUniRem_Jsonclick = "" ;
      edtEntPre_Jsonclick = "" ;
      edtEntUniEnt_Jsonclick = "" ;
      edtEntPrvNum_Jsonclick = "" ;
      edtPedCod_Jsonclick = "" ;
      edtEntNAlbar_Jsonclick = "" ;
      edtAlbaran_Jsonclick = "" ;
      edtEntFecEnt_Jsonclick = "" ;
      edtLinEnt_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_entfvalauxdate_Jsonclick = "" ;
      edtavDdo_entfecentauxdate_Jsonclick = "" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavPrdnom_Jsonclick = "" ;
      edtavPrdnom_Enabled = 0 ;
      edtavPrdnum_Jsonclick = "" ;
      edtavPrdnum_Enabled = 0 ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;" ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_grid_Datalistproc = "StocksQuimicos.EntradaProducto_WCGetFilterData" ;
      Ddo_grid_Datalisttype = "||Dynamic|Dynamic||||||Dynamic|" ;
      Ddo_grid_Includedatalist = "||T|T||||||T|" ;
      Ddo_grid_Filterisrange = "T||||T|T|T|T|T||" ;
      Ddo_grid_Filtertype = "Numeric|Date|Character|Character|Numeric|Numeric|Numeric|Numeric|Numeric|Character|Date" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "1|2|3|4|5|6|7|8|9|10|11" ;
      Ddo_grid_Columnids = "1:LinEnt|2:EntFecEnt|3:Albaran|4:EntNAlbar|5:PedCod|6:EntPrvNum|7:EntUniEnt|8:EntPre|9:EntUniRem|10:EntLotN|11:EntFVal" ;
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
      edtEntNAlbar_Visible = -1 ;
      edtAlbaran_Visible = -1 ;
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
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_42_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'edtAlbaran_Visible',ctrl:'ALBARAN',prop:'Visible'},{av:'edtEntNAlbar_Visible',ctrl:'ENTNALBAR',prop:'Visible'},{av:'sPrefix'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8PrdNum',fld:'vPRDNUM',pic:''},{av:'AV26TFLinEnt',fld:'vTFLINENT',pic:'ZZZ9'},{av:'AV27TFLinEnt_To',fld:'vTFLINENT_TO',pic:'ZZZ9'},{av:'AV28TFEntFecEnt',fld:'vTFENTFECENT',pic:''},{av:'AV32TFAlbaran',fld:'vTFALBARAN',pic:''},{av:'AV33TFAlbaran_Sel',fld:'vTFALBARAN_SEL',pic:''},{av:'AV34TFEntNAlbar',fld:'vTFENTNALBAR',pic:''},{av:'AV35TFEntNAlbar_Sel',fld:'vTFENTNALBAR_SEL',pic:''},{av:'AV36TFPedCod',fld:'vTFPEDCOD',pic:'ZZZZZZZ9'},{av:'AV37TFPedCod_To',fld:'vTFPEDCOD_TO',pic:'ZZZZZZZ9'},{av:'AV38TFEntPrvNum',fld:'vTFENTPRVNUM',pic:'ZZZZZ9'},{av:'AV39TFEntPrvNum_To',fld:'vTFENTPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV40TFEntUniEnt',fld:'vTFENTUNIENT',pic:'ZZZZZ9.99'},{av:'AV41TFEntUniEnt_To',fld:'vTFENTUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV50TFEntPre',fld:'vTFENTPRE',pic:'ZZZZZZZ9.999'},{av:'AV51TFEntPre_To',fld:'vTFENTPRE_TO',pic:'ZZZZZZZ9.999'},{av:'AV52TFEntUniRem',fld:'vTFENTUNIREM',pic:'ZZZZZ9.9999'},{av:'AV53TFEntUniRem_To',fld:'vTFENTUNIREM_TO',pic:'ZZZZZ9.9999'},{av:'AV54TFEntLotN',fld:'vTFENTLOTN',pic:''},{av:'AV55TFEntLotN_Sel',fld:'vTFENTLOTN_SEL',pic:''},{av:'AV56TFEntFVal',fld:'vTFENTFVAL',pic:''},{av:'AV75Pgmname',fld:'vPGMNAME',pic:''},{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV68PrdNom',fld:'vPRDNOM',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A719PrdNum',fld:'PRDNUM',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV62GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV63GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e111TA2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8PrdNum',fld:'vPRDNUM',pic:''},{av:'AV26TFLinEnt',fld:'vTFLINENT',pic:'ZZZ9'},{av:'AV27TFLinEnt_To',fld:'vTFLINENT_TO',pic:'ZZZ9'},{av:'AV28TFEntFecEnt',fld:'vTFENTFECENT',pic:''},{av:'AV32TFAlbaran',fld:'vTFALBARAN',pic:''},{av:'AV33TFAlbaran_Sel',fld:'vTFALBARAN_SEL',pic:''},{av:'AV34TFEntNAlbar',fld:'vTFENTNALBAR',pic:''},{av:'AV35TFEntNAlbar_Sel',fld:'vTFENTNALBAR_SEL',pic:''},{av:'AV36TFPedCod',fld:'vTFPEDCOD',pic:'ZZZZZZZ9'},{av:'AV37TFPedCod_To',fld:'vTFPEDCOD_TO',pic:'ZZZZZZZ9'},{av:'AV38TFEntPrvNum',fld:'vTFENTPRVNUM',pic:'ZZZZZ9'},{av:'AV39TFEntPrvNum_To',fld:'vTFENTPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV40TFEntUniEnt',fld:'vTFENTUNIENT',pic:'ZZZZZ9.99'},{av:'AV41TFEntUniEnt_To',fld:'vTFENTUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV50TFEntPre',fld:'vTFENTPRE',pic:'ZZZZZZZ9.999'},{av:'AV51TFEntPre_To',fld:'vTFENTPRE_TO',pic:'ZZZZZZZ9.999'},{av:'AV52TFEntUniRem',fld:'vTFENTUNIREM',pic:'ZZZZZ9.9999'},{av:'AV53TFEntUniRem_To',fld:'vTFENTUNIREM_TO',pic:'ZZZZZ9.9999'},{av:'AV54TFEntLotN',fld:'vTFENTLOTN',pic:''},{av:'AV55TFEntLotN_Sel',fld:'vTFENTLOTN_SEL',pic:''},{av:'AV56TFEntFVal',fld:'vTFENTFVAL',pic:''},{av:'AV75Pgmname',fld:'vPGMNAME',pic:''},{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV68PrdNom',fld:'vPRDNOM',pic:''},{av:'edtAlbaran_Visible',ctrl:'ALBARAN',prop:'Visible'},{av:'edtEntNAlbar_Visible',ctrl:'ENTNALBAR',prop:'Visible'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A719PrdNum',fld:'PRDNUM',pic:'',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e121TA2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8PrdNum',fld:'vPRDNUM',pic:''},{av:'AV26TFLinEnt',fld:'vTFLINENT',pic:'ZZZ9'},{av:'AV27TFLinEnt_To',fld:'vTFLINENT_TO',pic:'ZZZ9'},{av:'AV28TFEntFecEnt',fld:'vTFENTFECENT',pic:''},{av:'AV32TFAlbaran',fld:'vTFALBARAN',pic:''},{av:'AV33TFAlbaran_Sel',fld:'vTFALBARAN_SEL',pic:''},{av:'AV34TFEntNAlbar',fld:'vTFENTNALBAR',pic:''},{av:'AV35TFEntNAlbar_Sel',fld:'vTFENTNALBAR_SEL',pic:''},{av:'AV36TFPedCod',fld:'vTFPEDCOD',pic:'ZZZZZZZ9'},{av:'AV37TFPedCod_To',fld:'vTFPEDCOD_TO',pic:'ZZZZZZZ9'},{av:'AV38TFEntPrvNum',fld:'vTFENTPRVNUM',pic:'ZZZZZ9'},{av:'AV39TFEntPrvNum_To',fld:'vTFENTPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV40TFEntUniEnt',fld:'vTFENTUNIENT',pic:'ZZZZZ9.99'},{av:'AV41TFEntUniEnt_To',fld:'vTFENTUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV50TFEntPre',fld:'vTFENTPRE',pic:'ZZZZZZZ9.999'},{av:'AV51TFEntPre_To',fld:'vTFENTPRE_TO',pic:'ZZZZZZZ9.999'},{av:'AV52TFEntUniRem',fld:'vTFENTUNIREM',pic:'ZZZZZ9.9999'},{av:'AV53TFEntUniRem_To',fld:'vTFENTUNIREM_TO',pic:'ZZZZZ9.9999'},{av:'AV54TFEntLotN',fld:'vTFENTLOTN',pic:''},{av:'AV55TFEntLotN_Sel',fld:'vTFENTLOTN_SEL',pic:''},{av:'AV56TFEntFVal',fld:'vTFENTFVAL',pic:''},{av:'AV75Pgmname',fld:'vPGMNAME',pic:''},{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV68PrdNom',fld:'vPRDNOM',pic:''},{av:'edtAlbaran_Visible',ctrl:'ALBARAN',prop:'Visible'},{av:'edtEntNAlbar_Visible',ctrl:'ENTNALBAR',prop:'Visible'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A719PrdNum',fld:'PRDNUM',pic:'',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e131TA2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8PrdNum',fld:'vPRDNUM',pic:''},{av:'AV26TFLinEnt',fld:'vTFLINENT',pic:'ZZZ9'},{av:'AV27TFLinEnt_To',fld:'vTFLINENT_TO',pic:'ZZZ9'},{av:'AV28TFEntFecEnt',fld:'vTFENTFECENT',pic:''},{av:'AV32TFAlbaran',fld:'vTFALBARAN',pic:''},{av:'AV33TFAlbaran_Sel',fld:'vTFALBARAN_SEL',pic:''},{av:'AV34TFEntNAlbar',fld:'vTFENTNALBAR',pic:''},{av:'AV35TFEntNAlbar_Sel',fld:'vTFENTNALBAR_SEL',pic:''},{av:'AV36TFPedCod',fld:'vTFPEDCOD',pic:'ZZZZZZZ9'},{av:'AV37TFPedCod_To',fld:'vTFPEDCOD_TO',pic:'ZZZZZZZ9'},{av:'AV38TFEntPrvNum',fld:'vTFENTPRVNUM',pic:'ZZZZZ9'},{av:'AV39TFEntPrvNum_To',fld:'vTFENTPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV40TFEntUniEnt',fld:'vTFENTUNIENT',pic:'ZZZZZ9.99'},{av:'AV41TFEntUniEnt_To',fld:'vTFENTUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV50TFEntPre',fld:'vTFENTPRE',pic:'ZZZZZZZ9.999'},{av:'AV51TFEntPre_To',fld:'vTFENTPRE_TO',pic:'ZZZZZZZ9.999'},{av:'AV52TFEntUniRem',fld:'vTFENTUNIREM',pic:'ZZZZZ9.9999'},{av:'AV53TFEntUniRem_To',fld:'vTFENTUNIREM_TO',pic:'ZZZZZ9.9999'},{av:'AV54TFEntLotN',fld:'vTFENTLOTN',pic:''},{av:'AV55TFEntLotN_Sel',fld:'vTFENTLOTN_SEL',pic:''},{av:'AV56TFEntFVal',fld:'vTFENTFVAL',pic:''},{av:'AV75Pgmname',fld:'vPGMNAME',pic:''},{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV68PrdNom',fld:'vPRDNOM',pic:''},{av:'edtAlbaran_Visible',ctrl:'ALBARAN',prop:'Visible'},{av:'edtEntNAlbar_Visible',ctrl:'ENTNALBAR',prop:'Visible'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A719PrdNum',fld:'PRDNUM',pic:'',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV56TFEntFVal',fld:'vTFENTFVAL',pic:''},{av:'AV54TFEntLotN',fld:'vTFENTLOTN',pic:''},{av:'AV55TFEntLotN_Sel',fld:'vTFENTLOTN_SEL',pic:''},{av:'AV52TFEntUniRem',fld:'vTFENTUNIREM',pic:'ZZZZZ9.9999'},{av:'AV53TFEntUniRem_To',fld:'vTFENTUNIREM_TO',pic:'ZZZZZ9.9999'},{av:'AV50TFEntPre',fld:'vTFENTPRE',pic:'ZZZZZZZ9.999'},{av:'AV51TFEntPre_To',fld:'vTFENTPRE_TO',pic:'ZZZZZZZ9.999'},{av:'AV40TFEntUniEnt',fld:'vTFENTUNIENT',pic:'ZZZZZ9.99'},{av:'AV41TFEntUniEnt_To',fld:'vTFENTUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV38TFEntPrvNum',fld:'vTFENTPRVNUM',pic:'ZZZZZ9'},{av:'AV39TFEntPrvNum_To',fld:'vTFENTPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV36TFPedCod',fld:'vTFPEDCOD',pic:'ZZZZZZZ9'},{av:'AV37TFPedCod_To',fld:'vTFPEDCOD_TO',pic:'ZZZZZZZ9'},{av:'AV34TFEntNAlbar',fld:'vTFENTNALBAR',pic:''},{av:'AV35TFEntNAlbar_Sel',fld:'vTFENTNALBAR_SEL',pic:''},{av:'AV32TFAlbaran',fld:'vTFALBARAN',pic:''},{av:'AV33TFAlbaran_Sel',fld:'vTFALBARAN_SEL',pic:''},{av:'AV28TFEntFecEnt',fld:'vTFENTFECENT',pic:''},{av:'AV26TFLinEnt',fld:'vTFLINENT',pic:'ZZZ9'},{av:'AV27TFLinEnt_To',fld:'vTFLINENT_TO',pic:'ZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e171TA2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV64GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e181TA2',iparms:[{av:'cmbavGridactions'},{av:'AV64GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8PrdNum',fld:'vPRDNUM',pic:''},{av:'AV26TFLinEnt',fld:'vTFLINENT',pic:'ZZZ9'},{av:'AV27TFLinEnt_To',fld:'vTFLINENT_TO',pic:'ZZZ9'},{av:'AV28TFEntFecEnt',fld:'vTFENTFECENT',pic:''},{av:'AV32TFAlbaran',fld:'vTFALBARAN',pic:''},{av:'AV33TFAlbaran_Sel',fld:'vTFALBARAN_SEL',pic:''},{av:'AV34TFEntNAlbar',fld:'vTFENTNALBAR',pic:''},{av:'AV35TFEntNAlbar_Sel',fld:'vTFENTNALBAR_SEL',pic:''},{av:'AV36TFPedCod',fld:'vTFPEDCOD',pic:'ZZZZZZZ9'},{av:'AV37TFPedCod_To',fld:'vTFPEDCOD_TO',pic:'ZZZZZZZ9'},{av:'AV38TFEntPrvNum',fld:'vTFENTPRVNUM',pic:'ZZZZZ9'},{av:'AV39TFEntPrvNum_To',fld:'vTFENTPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV40TFEntUniEnt',fld:'vTFENTUNIENT',pic:'ZZZZZ9.99'},{av:'AV41TFEntUniEnt_To',fld:'vTFENTUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV50TFEntPre',fld:'vTFENTPRE',pic:'ZZZZZZZ9.999'},{av:'AV51TFEntPre_To',fld:'vTFENTPRE_TO',pic:'ZZZZZZZ9.999'},{av:'AV52TFEntUniRem',fld:'vTFENTUNIREM',pic:'ZZZZZ9.9999'},{av:'AV53TFEntUniRem_To',fld:'vTFENTUNIREM_TO',pic:'ZZZZZ9.9999'},{av:'AV54TFEntLotN',fld:'vTFENTLOTN',pic:''},{av:'AV55TFEntLotN_Sel',fld:'vTFENTLOTN_SEL',pic:''},{av:'AV56TFEntFVal',fld:'vTFENTFVAL',pic:''},{av:'AV75Pgmname',fld:'vPGMNAME',pic:''},{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV68PrdNom',fld:'vPRDNOM',pic:''},{av:'edtAlbaran_Visible',ctrl:'ALBARAN',prop:'Visible'},{av:'edtEntNAlbar_Visible',ctrl:'ENTNALBAR',prop:'Visible'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A719PrdNum',fld:'PRDNUM',pic:'',hsh:true},{av:'sPrefix'},{av:'A419EntUniRem',fld:'ENTUNIREM',pic:'ZZZZZ9.9999',hsh:true},{av:'A418EntUniEnt',fld:'ENTUNIENT',pic:'ZZZZZ9.99',hsh:true},{av:'A597LinEnt',fld:'LINENT',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV64GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'AV62GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV63GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'DOINSERTAR'","{handler:'e141TA2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8PrdNum',fld:'vPRDNUM',pic:''},{av:'AV26TFLinEnt',fld:'vTFLINENT',pic:'ZZZ9'},{av:'AV27TFLinEnt_To',fld:'vTFLINENT_TO',pic:'ZZZ9'},{av:'AV28TFEntFecEnt',fld:'vTFENTFECENT',pic:''},{av:'AV32TFAlbaran',fld:'vTFALBARAN',pic:''},{av:'AV33TFAlbaran_Sel',fld:'vTFALBARAN_SEL',pic:''},{av:'AV34TFEntNAlbar',fld:'vTFENTNALBAR',pic:''},{av:'AV35TFEntNAlbar_Sel',fld:'vTFENTNALBAR_SEL',pic:''},{av:'AV36TFPedCod',fld:'vTFPEDCOD',pic:'ZZZZZZZ9'},{av:'AV37TFPedCod_To',fld:'vTFPEDCOD_TO',pic:'ZZZZZZZ9'},{av:'AV38TFEntPrvNum',fld:'vTFENTPRVNUM',pic:'ZZZZZ9'},{av:'AV39TFEntPrvNum_To',fld:'vTFENTPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV40TFEntUniEnt',fld:'vTFENTUNIENT',pic:'ZZZZZ9.99'},{av:'AV41TFEntUniEnt_To',fld:'vTFENTUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV50TFEntPre',fld:'vTFENTPRE',pic:'ZZZZZZZ9.999'},{av:'AV51TFEntPre_To',fld:'vTFENTPRE_TO',pic:'ZZZZZZZ9.999'},{av:'AV52TFEntUniRem',fld:'vTFENTUNIREM',pic:'ZZZZZ9.9999'},{av:'AV53TFEntUniRem_To',fld:'vTFENTUNIREM_TO',pic:'ZZZZZ9.9999'},{av:'AV54TFEntLotN',fld:'vTFENTLOTN',pic:''},{av:'AV55TFEntLotN_Sel',fld:'vTFENTLOTN_SEL',pic:''},{av:'AV56TFEntFVal',fld:'vTFENTFVAL',pic:''},{av:'AV75Pgmname',fld:'vPGMNAME',pic:''},{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV68PrdNom',fld:'vPRDNOM',pic:''},{av:'edtAlbaran_Visible',ctrl:'ALBARAN',prop:'Visible'},{av:'edtEntNAlbar_Visible',ctrl:'ENTNALBAR',prop:'Visible'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A719PrdNum',fld:'PRDNUM',pic:'',hsh:true},{av:'sPrefix'},{av:'A597LinEnt',fld:'LINENT',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("'DOINSERTAR'",",oparms:[{av:'AV62GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV63GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("VALIDV_PRDNUM","{handler:'validv_Prdnum',iparms:[]");
      setEventMetadata("VALIDV_PRDNUM",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Entfval',iparms:[]");
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
      wcpOAV7Emprcod = "" ;
      wcpOAV8PrdNum = "" ;
      wcpOAV68PrdNom = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV7Emprcod = "" ;
      AV8PrdNum = "" ;
      AV68PrdNom = "" ;
      AV28TFEntFecEnt = GXutil.nullDate() ;
      AV32TFAlbaran = "" ;
      AV33TFAlbaran_Sel = "" ;
      AV34TFEntNAlbar = "" ;
      AV35TFEntNAlbar_Sel = "" ;
      AV40TFEntUniEnt = DecimalUtil.ZERO ;
      AV41TFEntUniEnt_To = DecimalUtil.ZERO ;
      AV50TFEntPre = DecimalUtil.ZERO ;
      AV51TFEntPre_To = DecimalUtil.ZERO ;
      AV52TFEntUniRem = DecimalUtil.ZERO ;
      AV53TFEntUniRem_To = DecimalUtil.ZERO ;
      AV54TFEntLotN = "" ;
      AV55TFEntLotN_Sel = "" ;
      AV56TFEntFVal = GXutil.nullDate() ;
      AV75Pgmname = "" ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV60DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtninsertar_Jsonclick = "" ;
      lblTextblockprdnum_Jsonclick = "" ;
      lblTextblockprdnom_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV30DDO_EntFecEntAuxDate = GXutil.nullDate() ;
      AV58DDO_EntFValAuxDate = GXutil.nullDate() ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A415EntFecEnt = GXutil.nullDate() ;
      A11Albaran = "" ;
      A12857EntNAlbar = "" ;
      A418EntUniEnt = DecimalUtil.ZERO ;
      A417EntPre = DecimalUtil.ZERO ;
      A419EntUniRem = DecimalUtil.ZERO ;
      A5686EntLotN = "" ;
      A5685EntFVal = GXutil.nullDate() ;
      scmdbuf = "" ;
      lV79Stocksquimicos_entradaproducto_wcds_4_tfalbaran = "" ;
      lV81Stocksquimicos_entradaproducto_wcds_6_tfentnalbar = "" ;
      lV93Stocksquimicos_entradaproducto_wcds_18_tfentlotn = "" ;
      AV78Stocksquimicos_entradaproducto_wcds_3_tfentfecent = GXutil.nullDate() ;
      AV80Stocksquimicos_entradaproducto_wcds_5_tfalbaran_sel = "" ;
      AV79Stocksquimicos_entradaproducto_wcds_4_tfalbaran = "" ;
      AV82Stocksquimicos_entradaproducto_wcds_7_tfentnalbar_sel = "" ;
      AV81Stocksquimicos_entradaproducto_wcds_6_tfentnalbar = "" ;
      AV87Stocksquimicos_entradaproducto_wcds_12_tfentunient = DecimalUtil.ZERO ;
      AV88Stocksquimicos_entradaproducto_wcds_13_tfentunient_to = DecimalUtil.ZERO ;
      AV89Stocksquimicos_entradaproducto_wcds_14_tfentpre = DecimalUtil.ZERO ;
      AV90Stocksquimicos_entradaproducto_wcds_15_tfentpre_to = DecimalUtil.ZERO ;
      AV91Stocksquimicos_entradaproducto_wcds_16_tfentunirem = DecimalUtil.ZERO ;
      AV92Stocksquimicos_entradaproducto_wcds_17_tfentunirem_to = DecimalUtil.ZERO ;
      AV94Stocksquimicos_entradaproducto_wcds_19_tfentlotn_sel = "" ;
      AV93Stocksquimicos_entradaproducto_wcds_18_tfentlotn = "" ;
      AV95Stocksquimicos_entradaproducto_wcds_20_tfentfval = GXutil.nullDate() ;
      H01TA2_A411EntCon = new byte[1] ;
      H01TA2_A396EmprCod = new String[] {""} ;
      H01TA2_A719PrdNum = new String[] {""} ;
      H01TA2_A5685EntFVal = new java.util.Date[] {GXutil.nullDate()} ;
      H01TA2_A5686EntLotN = new String[] {""} ;
      H01TA2_A419EntUniRem = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01TA2_A417EntPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01TA2_A418EntUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01TA2_A6156EntPrvNum = new int[1] ;
      H01TA2_n6156EntPrvNum = new boolean[] {false} ;
      H01TA2_A658PedCod = new int[1] ;
      H01TA2_n658PedCod = new boolean[] {false} ;
      H01TA2_A12857EntNAlbar = new String[] {""} ;
      H01TA2_A11Albaran = new String[] {""} ;
      H01TA2_A415EntFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      H01TA2_A597LinEnt = new short[1] ;
      H01TA3_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV65Station = "" ;
      AV66EmprNom = "" ;
      AV67UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV22Session = httpContext.getWebSession();
      AV12GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV13GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char9 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char8 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV10TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV9HTTPRequest = httpContext.getHttpRequest();
      GXv_SdtWWPGridState10 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV7Emprcod = "" ;
      sCtrlAV8PrdNum = "" ;
      sCtrlAV68PrdNom = "" ;
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.entradaproducto_wc__default(),
         new Object[] {
             new Object[] {
            H01TA2_A411EntCon, H01TA2_A396EmprCod, H01TA2_A719PrdNum, H01TA2_A5685EntFVal, H01TA2_A5686EntLotN, H01TA2_A419EntUniRem, H01TA2_A417EntPre, H01TA2_A418EntUniEnt, H01TA2_A6156EntPrvNum, H01TA2_n6156EntPrvNum,
            H01TA2_A658PedCod, H01TA2_n658PedCod, H01TA2_A12857EntNAlbar, H01TA2_A11Albaran, H01TA2_A415EntFecEnt, H01TA2_A597LinEnt
            }
            , new Object[] {
            H01TA3_AGRID_nRecordCount
            }
         }
      );
      AV75Pgmname = "StocksQuimicos.EntradaProducto_WC" ;
      /* GeneXus formulas. */
      AV75Pgmname = "StocksQuimicos.EntradaProducto_WC" ;
      Gx_err = (short)(0) ;
      edtavPrdnum_Enabled = 0 ;
      edtavPrdnom_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte A411EntCon ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV26TFLinEnt ;
   private short AV27TFLinEnt_To ;
   private short AV14OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV64GridActions ;
   private short A597LinEnt ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV76Stocksquimicos_entradaproducto_wcds_1_tflinent ;
   private short AV77Stocksquimicos_entradaproducto_wcds_2_tflinent_to ;
   private int edtAlbaran_Visible ;
   private int edtEntNAlbar_Visible ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_42 ;
   private int nGXsfl_42_idx=1 ;
   private int AV36TFPedCod ;
   private int AV37TFPedCod_To ;
   private int AV38TFEntPrvNum ;
   private int AV39TFEntPrvNum_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavPrdnum_Enabled ;
   private int edtavPrdnom_Enabled ;
   private int edtavPgmname_Enabled ;
   private int A658PedCod ;
   private int A6156EntPrvNum ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV83Stocksquimicos_entradaproducto_wcds_8_tfpedcod ;
   private int AV84Stocksquimicos_entradaproducto_wcds_9_tfpedcod_to ;
   private int AV85Stocksquimicos_entradaproducto_wcds_10_tfentprvnum ;
   private int AV86Stocksquimicos_entradaproducto_wcds_11_tfentprvnum_to ;
   private int AV61PageToGo ;
   private int AV96GXV1 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV62GridCurrentPage ;
   private long AV63GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV40TFEntUniEnt ;
   private java.math.BigDecimal AV41TFEntUniEnt_To ;
   private java.math.BigDecimal AV50TFEntPre ;
   private java.math.BigDecimal AV51TFEntPre_To ;
   private java.math.BigDecimal AV52TFEntUniRem ;
   private java.math.BigDecimal AV53TFEntUniRem_To ;
   private java.math.BigDecimal A418EntUniEnt ;
   private java.math.BigDecimal A417EntPre ;
   private java.math.BigDecimal A419EntUniRem ;
   private java.math.BigDecimal AV87Stocksquimicos_entradaproducto_wcds_12_tfentunient ;
   private java.math.BigDecimal AV88Stocksquimicos_entradaproducto_wcds_13_tfentunient_to ;
   private java.math.BigDecimal AV89Stocksquimicos_entradaproducto_wcds_14_tfentpre ;
   private java.math.BigDecimal AV90Stocksquimicos_entradaproducto_wcds_15_tfentpre_to ;
   private java.math.BigDecimal AV91Stocksquimicos_entradaproducto_wcds_16_tfentunirem ;
   private java.math.BigDecimal AV92Stocksquimicos_entradaproducto_wcds_17_tfentunirem_to ;
   private String wcpOAV7Emprcod ;
   private String wcpOAV8PrdNum ;
   private String wcpOAV68PrdNom ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV7Emprcod ;
   private String AV8PrdNum ;
   private String AV68PrdNom ;
   private String sGXsfl_42_idx="0001" ;
   private String edtAlbaran_Internalname ;
   private String edtEntNAlbar_Internalname ;
   private String AV32TFAlbaran ;
   private String AV33TFAlbaran_Sel ;
   private String AV34TFEntNAlbar ;
   private String AV35TFEntNAlbar_Sel ;
   private String AV54TFEntLotN ;
   private String AV55TFEntLotN_Sel ;
   private String AV75Pgmname ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
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
   private String Ddo_grid_Sortedstatus ;
   private String Ddo_grid_Includefilter ;
   private String Ddo_grid_Filtertype ;
   private String Ddo_grid_Filterisrange ;
   private String Ddo_grid_Includedatalist ;
   private String Ddo_grid_Datalisttype ;
   private String Ddo_grid_Datalistproc ;
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Fixedcolumns ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divTableactions_Internalname ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtninsertar_Internalname ;
   private String bttBtninsertar_Jsonclick ;
   private String divUnnamedtableprdnum_Internalname ;
   private String lblTextblockprdnum_Internalname ;
   private String lblTextblockprdnum_Jsonclick ;
   private String edtavPrdnum_Internalname ;
   private String edtavPrdnum_Jsonclick ;
   private String divUnnamedtableprdnom_Internalname ;
   private String lblTextblockprdnom_Internalname ;
   private String lblTextblockprdnom_Jsonclick ;
   private String edtavPrdnom_Internalname ;
   private String edtavPrdnom_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_entfecentauxdates_Internalname ;
   private String edtavDdo_entfecentauxdate_Internalname ;
   private String edtavDdo_entfecentauxdate_Jsonclick ;
   private String divDdo_entfvalauxdates_Internalname ;
   private String edtavDdo_entfvalauxdate_Internalname ;
   private String edtavDdo_entfvalauxdate_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtLinEnt_Internalname ;
   private String edtEntFecEnt_Internalname ;
   private String A11Albaran ;
   private String A12857EntNAlbar ;
   private String edtPedCod_Internalname ;
   private String edtEntPrvNum_Internalname ;
   private String edtEntUniEnt_Internalname ;
   private String edtEntPre_Internalname ;
   private String edtEntUniRem_Internalname ;
   private String A5686EntLotN ;
   private String edtEntLotN_Internalname ;
   private String edtEntFVal_Internalname ;
   private String scmdbuf ;
   private String lV79Stocksquimicos_entradaproducto_wcds_4_tfalbaran ;
   private String lV81Stocksquimicos_entradaproducto_wcds_6_tfentnalbar ;
   private String lV93Stocksquimicos_entradaproducto_wcds_18_tfentlotn ;
   private String AV80Stocksquimicos_entradaproducto_wcds_5_tfalbaran_sel ;
   private String AV79Stocksquimicos_entradaproducto_wcds_4_tfalbaran ;
   private String AV82Stocksquimicos_entradaproducto_wcds_7_tfentnalbar_sel ;
   private String AV81Stocksquimicos_entradaproducto_wcds_6_tfentnalbar ;
   private String AV94Stocksquimicos_entradaproducto_wcds_19_tfentlotn_sel ;
   private String AV93Stocksquimicos_entradaproducto_wcds_18_tfentlotn ;
   private String hsh ;
   private String AV65Station ;
   private String AV66EmprNom ;
   private String AV67UsurCod ;
   private String GXt_char9 ;
   private String GXv_char4[] ;
   private String GXt_char8 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String sCtrlAV7Emprcod ;
   private String sCtrlAV8PrdNum ;
   private String sCtrlAV68PrdNom ;
   private String sGXsfl_42_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtLinEnt_Jsonclick ;
   private String edtEntFecEnt_Jsonclick ;
   private String edtAlbaran_Jsonclick ;
   private String edtEntNAlbar_Jsonclick ;
   private String edtPedCod_Jsonclick ;
   private String edtEntPrvNum_Jsonclick ;
   private String edtEntUniEnt_Jsonclick ;
   private String edtEntPre_Jsonclick ;
   private String edtEntUniRem_Jsonclick ;
   private String edtEntLotN_Jsonclick ;
   private String edtEntFVal_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV28TFEntFecEnt ;
   private java.util.Date AV56TFEntFVal ;
   private java.util.Date AV30DDO_EntFecEntAuxDate ;
   private java.util.Date AV58DDO_EntFValAuxDate ;
   private java.util.Date A415EntFecEnt ;
   private java.util.Date A5685EntFVal ;
   private java.util.Date AV78Stocksquimicos_entradaproducto_wcds_3_tfentfecent ;
   private java.util.Date AV95Stocksquimicos_entradaproducto_wcds_20_tfentfval ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean bGXsfl_42_Refreshing=false ;
   private boolean AV15OrderedDsc ;
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
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n658PedCod ;
   private boolean n6156EntPrvNum ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean Cond_result ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV9HTTPRequest ;
   private com.genexus.webpanels.WebSession AV22Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavGridactions ;
   private IDataStoreProvider pr_default ;
   private byte[] H01TA2_A411EntCon ;
   private String[] H01TA2_A396EmprCod ;
   private String[] H01TA2_A719PrdNum ;
   private java.util.Date[] H01TA2_A5685EntFVal ;
   private String[] H01TA2_A5686EntLotN ;
   private java.math.BigDecimal[] H01TA2_A419EntUniRem ;
   private java.math.BigDecimal[] H01TA2_A417EntPre ;
   private java.math.BigDecimal[] H01TA2_A418EntUniEnt ;
   private int[] H01TA2_A6156EntPrvNum ;
   private boolean[] H01TA2_n6156EntPrvNum ;
   private int[] H01TA2_A658PedCod ;
   private boolean[] H01TA2_n658PedCod ;
   private String[] H01TA2_A12857EntNAlbar ;
   private String[] H01TA2_A11Albaran ;
   private java.util.Date[] H01TA2_A415EntFecEnt ;
   private short[] H01TA2_A597LinEnt ;
   private long[] H01TA3_AGRID_nRecordCount ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV10TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV12GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState10[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV13GridStateFilterValue ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV60DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class entradaproducto_wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01TA2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV76Stocksquimicos_entradaproducto_wcds_1_tflinent ,
                                          short AV77Stocksquimicos_entradaproducto_wcds_2_tflinent_to ,
                                          java.util.Date AV78Stocksquimicos_entradaproducto_wcds_3_tfentfecent ,
                                          String AV80Stocksquimicos_entradaproducto_wcds_5_tfalbaran_sel ,
                                          String AV79Stocksquimicos_entradaproducto_wcds_4_tfalbaran ,
                                          String AV82Stocksquimicos_entradaproducto_wcds_7_tfentnalbar_sel ,
                                          String AV81Stocksquimicos_entradaproducto_wcds_6_tfentnalbar ,
                                          int AV83Stocksquimicos_entradaproducto_wcds_8_tfpedcod ,
                                          int AV84Stocksquimicos_entradaproducto_wcds_9_tfpedcod_to ,
                                          int AV85Stocksquimicos_entradaproducto_wcds_10_tfentprvnum ,
                                          int AV86Stocksquimicos_entradaproducto_wcds_11_tfentprvnum_to ,
                                          java.math.BigDecimal AV87Stocksquimicos_entradaproducto_wcds_12_tfentunient ,
                                          java.math.BigDecimal AV88Stocksquimicos_entradaproducto_wcds_13_tfentunient_to ,
                                          java.math.BigDecimal AV89Stocksquimicos_entradaproducto_wcds_14_tfentpre ,
                                          java.math.BigDecimal AV90Stocksquimicos_entradaproducto_wcds_15_tfentpre_to ,
                                          java.math.BigDecimal AV91Stocksquimicos_entradaproducto_wcds_16_tfentunirem ,
                                          java.math.BigDecimal AV92Stocksquimicos_entradaproducto_wcds_17_tfentunirem_to ,
                                          String AV94Stocksquimicos_entradaproducto_wcds_19_tfentlotn_sel ,
                                          String AV93Stocksquimicos_entradaproducto_wcds_18_tfentlotn ,
                                          java.util.Date AV95Stocksquimicos_entradaproducto_wcds_20_tfentfval ,
                                          short A597LinEnt ,
                                          java.util.Date A415EntFecEnt ,
                                          String A11Albaran ,
                                          String A12857EntNAlbar ,
                                          int A658PedCod ,
                                          int A6156EntPrvNum ,
                                          java.math.BigDecimal A418EntUniEnt ,
                                          java.math.BigDecimal A417EntPre ,
                                          java.math.BigDecimal A419EntUniRem ,
                                          String A5686EntLotN ,
                                          java.util.Date A5685EntFVal ,
                                          short AV14OrderedBy ,
                                          boolean AV15OrderedDsc ,
                                          byte A411EntCon ,
                                          String AV7Emprcod ,
                                          String AV8PrdNum ,
                                          String A396EmprCod ,
                                          String A719PrdNum )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[27];
      Object[] GXv_Object12 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " EntCon, EmprCod, PrdNum, EntFVal, EntLotN, EntUniRem, EntPre, EntUniEnt, EntPrvNum, PedCod, EntNAlbar, Albaran, EntFecEnt, LinEnt" ;
      sFromString = " FROM TXPENTALM" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(EmprCod = ? and PrdNum = ?)");
      addWhere(sWhereString, "(EntCon = 0)");
      if ( ! (0==AV76Stocksquimicos_entradaproducto_wcds_1_tflinent) )
      {
         addWhere(sWhereString, "(LinEnt >= ?)");
      }
      else
      {
         GXv_int11[2] = (byte)(1) ;
      }
      if ( ! (0==AV77Stocksquimicos_entradaproducto_wcds_2_tflinent_to) )
      {
         addWhere(sWhereString, "(LinEnt <= ?)");
      }
      else
      {
         GXv_int11[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV78Stocksquimicos_entradaproducto_wcds_3_tfentfecent)) )
      {
         addWhere(sWhereString, "(EntFecEnt >= ?)");
      }
      else
      {
         GXv_int11[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Stocksquimicos_entradaproducto_wcds_5_tfalbaran_sel)==0) && ( ! (GXutil.strcmp("", AV79Stocksquimicos_entradaproducto_wcds_4_tfalbaran)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Albaran) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Stocksquimicos_entradaproducto_wcds_5_tfalbaran_sel)==0) )
      {
         addWhere(sWhereString, "(Albaran = ?)");
      }
      else
      {
         GXv_int11[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Stocksquimicos_entradaproducto_wcds_7_tfentnalbar_sel)==0) && ( ! (GXutil.strcmp("", AV81Stocksquimicos_entradaproducto_wcds_6_tfentnalbar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(EntNAlbar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Stocksquimicos_entradaproducto_wcds_7_tfentnalbar_sel)==0) )
      {
         addWhere(sWhereString, "(EntNAlbar = ?)");
      }
      else
      {
         GXv_int11[8] = (byte)(1) ;
      }
      if ( ! (0==AV83Stocksquimicos_entradaproducto_wcds_8_tfpedcod) )
      {
         addWhere(sWhereString, "(PedCod >= ?)");
      }
      else
      {
         GXv_int11[9] = (byte)(1) ;
      }
      if ( ! (0==AV84Stocksquimicos_entradaproducto_wcds_9_tfpedcod_to) )
      {
         addWhere(sWhereString, "(PedCod <= ?)");
      }
      else
      {
         GXv_int11[10] = (byte)(1) ;
      }
      if ( ! (0==AV85Stocksquimicos_entradaproducto_wcds_10_tfentprvnum) )
      {
         addWhere(sWhereString, "(EntPrvNum >= ?)");
      }
      else
      {
         GXv_int11[11] = (byte)(1) ;
      }
      if ( ! (0==AV86Stocksquimicos_entradaproducto_wcds_11_tfentprvnum_to) )
      {
         addWhere(sWhereString, "(EntPrvNum <= ?)");
      }
      else
      {
         GXv_int11[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Stocksquimicos_entradaproducto_wcds_12_tfentunient)==0) )
      {
         addWhere(sWhereString, "(EntUniEnt >= ?)");
      }
      else
      {
         GXv_int11[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Stocksquimicos_entradaproducto_wcds_13_tfentunient_to)==0) )
      {
         addWhere(sWhereString, "(EntUniEnt <= ?)");
      }
      else
      {
         GXv_int11[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Stocksquimicos_entradaproducto_wcds_14_tfentpre)==0) )
      {
         addWhere(sWhereString, "(EntPre >= ?)");
      }
      else
      {
         GXv_int11[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Stocksquimicos_entradaproducto_wcds_15_tfentpre_to)==0) )
      {
         addWhere(sWhereString, "(EntPre <= ?)");
      }
      else
      {
         GXv_int11[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Stocksquimicos_entradaproducto_wcds_16_tfentunirem)==0) )
      {
         addWhere(sWhereString, "(EntUniRem >= ?)");
      }
      else
      {
         GXv_int11[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Stocksquimicos_entradaproducto_wcds_17_tfentunirem_to)==0) )
      {
         addWhere(sWhereString, "(EntUniRem <= ?)");
      }
      else
      {
         GXv_int11[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Stocksquimicos_entradaproducto_wcds_19_tfentlotn_sel)==0) && ( ! (GXutil.strcmp("", AV93Stocksquimicos_entradaproducto_wcds_18_tfentlotn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(EntLotN) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Stocksquimicos_entradaproducto_wcds_19_tfentlotn_sel)==0) )
      {
         addWhere(sWhereString, "(EntLotN = ?)");
      }
      else
      {
         GXv_int11[20] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV95Stocksquimicos_entradaproducto_wcds_20_tfentfval)) )
      {
         addWhere(sWhereString, "(EntFVal >= ?)");
      }
      else
      {
         GXv_int11[21] = (byte)(1) ;
      }
      if ( ( AV14OrderedBy == 1 ) && ! AV15OrderedDsc )
      {
         sOrderString += " ORDER BY LinEnt" ;
      }
      else if ( ( AV14OrderedBy == 1 ) && ( AV15OrderedDsc ) )
      {
         sOrderString += " ORDER BY LinEnt DESC" ;
      }
      else if ( ( AV14OrderedBy == 2 ) && ! AV15OrderedDsc )
      {
         sOrderString += " ORDER BY EntFecEnt" ;
      }
      else if ( ( AV14OrderedBy == 2 ) && ( AV15OrderedDsc ) )
      {
         sOrderString += " ORDER BY EntFecEnt DESC" ;
      }
      else if ( ( AV14OrderedBy == 3 ) && ! AV15OrderedDsc )
      {
         sOrderString += " ORDER BY Albaran" ;
      }
      else if ( ( AV14OrderedBy == 3 ) && ( AV15OrderedDsc ) )
      {
         sOrderString += " ORDER BY Albaran DESC" ;
      }
      else if ( ( AV14OrderedBy == 4 ) && ! AV15OrderedDsc )
      {
         sOrderString += " ORDER BY EntNAlbar" ;
      }
      else if ( ( AV14OrderedBy == 4 ) && ( AV15OrderedDsc ) )
      {
         sOrderString += " ORDER BY EntNAlbar DESC" ;
      }
      else if ( ( AV14OrderedBy == 5 ) && ! AV15OrderedDsc )
      {
         sOrderString += " ORDER BY PedCod" ;
      }
      else if ( ( AV14OrderedBy == 5 ) && ( AV15OrderedDsc ) )
      {
         sOrderString += " ORDER BY PedCod DESC" ;
      }
      else if ( ( AV14OrderedBy == 6 ) && ! AV15OrderedDsc )
      {
         sOrderString += " ORDER BY EntPrvNum" ;
      }
      else if ( ( AV14OrderedBy == 6 ) && ( AV15OrderedDsc ) )
      {
         sOrderString += " ORDER BY EntPrvNum DESC" ;
      }
      else if ( ( AV14OrderedBy == 7 ) && ! AV15OrderedDsc )
      {
         sOrderString += " ORDER BY EntUniEnt" ;
      }
      else if ( ( AV14OrderedBy == 7 ) && ( AV15OrderedDsc ) )
      {
         sOrderString += " ORDER BY EntUniEnt DESC" ;
      }
      else if ( ( AV14OrderedBy == 8 ) && ! AV15OrderedDsc )
      {
         sOrderString += " ORDER BY EntPre" ;
      }
      else if ( ( AV14OrderedBy == 8 ) && ( AV15OrderedDsc ) )
      {
         sOrderString += " ORDER BY EntPre DESC" ;
      }
      else if ( ( AV14OrderedBy == 9 ) && ! AV15OrderedDsc )
      {
         sOrderString += " ORDER BY EntUniRem" ;
      }
      else if ( ( AV14OrderedBy == 9 ) && ( AV15OrderedDsc ) )
      {
         sOrderString += " ORDER BY EntUniRem DESC" ;
      }
      else if ( ( AV14OrderedBy == 10 ) && ! AV15OrderedDsc )
      {
         sOrderString += " ORDER BY EntLotN" ;
      }
      else if ( ( AV14OrderedBy == 10 ) && ( AV15OrderedDsc ) )
      {
         sOrderString += " ORDER BY EntLotN DESC" ;
      }
      else if ( ( AV14OrderedBy == 11 ) && ! AV15OrderedDsc )
      {
         sOrderString += " ORDER BY EntFVal" ;
      }
      else if ( ( AV14OrderedBy == 11 ) && ( AV15OrderedDsc ) )
      {
         sOrderString += " ORDER BY EntFVal DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY EmprCod, PrdNum, LinEnt" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
   }

   protected Object[] conditional_H01TA3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV76Stocksquimicos_entradaproducto_wcds_1_tflinent ,
                                          short AV77Stocksquimicos_entradaproducto_wcds_2_tflinent_to ,
                                          java.util.Date AV78Stocksquimicos_entradaproducto_wcds_3_tfentfecent ,
                                          String AV80Stocksquimicos_entradaproducto_wcds_5_tfalbaran_sel ,
                                          String AV79Stocksquimicos_entradaproducto_wcds_4_tfalbaran ,
                                          String AV82Stocksquimicos_entradaproducto_wcds_7_tfentnalbar_sel ,
                                          String AV81Stocksquimicos_entradaproducto_wcds_6_tfentnalbar ,
                                          int AV83Stocksquimicos_entradaproducto_wcds_8_tfpedcod ,
                                          int AV84Stocksquimicos_entradaproducto_wcds_9_tfpedcod_to ,
                                          int AV85Stocksquimicos_entradaproducto_wcds_10_tfentprvnum ,
                                          int AV86Stocksquimicos_entradaproducto_wcds_11_tfentprvnum_to ,
                                          java.math.BigDecimal AV87Stocksquimicos_entradaproducto_wcds_12_tfentunient ,
                                          java.math.BigDecimal AV88Stocksquimicos_entradaproducto_wcds_13_tfentunient_to ,
                                          java.math.BigDecimal AV89Stocksquimicos_entradaproducto_wcds_14_tfentpre ,
                                          java.math.BigDecimal AV90Stocksquimicos_entradaproducto_wcds_15_tfentpre_to ,
                                          java.math.BigDecimal AV91Stocksquimicos_entradaproducto_wcds_16_tfentunirem ,
                                          java.math.BigDecimal AV92Stocksquimicos_entradaproducto_wcds_17_tfentunirem_to ,
                                          String AV94Stocksquimicos_entradaproducto_wcds_19_tfentlotn_sel ,
                                          String AV93Stocksquimicos_entradaproducto_wcds_18_tfentlotn ,
                                          java.util.Date AV95Stocksquimicos_entradaproducto_wcds_20_tfentfval ,
                                          short A597LinEnt ,
                                          java.util.Date A415EntFecEnt ,
                                          String A11Albaran ,
                                          String A12857EntNAlbar ,
                                          int A658PedCod ,
                                          int A6156EntPrvNum ,
                                          java.math.BigDecimal A418EntUniEnt ,
                                          java.math.BigDecimal A417EntPre ,
                                          java.math.BigDecimal A419EntUniRem ,
                                          String A5686EntLotN ,
                                          java.util.Date A5685EntFVal ,
                                          short AV14OrderedBy ,
                                          boolean AV15OrderedDsc ,
                                          byte A411EntCon ,
                                          String AV7Emprcod ,
                                          String AV8PrdNum ,
                                          String A396EmprCod ,
                                          String A719PrdNum )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int13 = new byte[22];
      Object[] GXv_Object14 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM TXPENTALM" ;
      addWhere(sWhereString, "(EmprCod = ? and PrdNum = ?)");
      addWhere(sWhereString, "(EntCon = 0)");
      if ( ! (0==AV76Stocksquimicos_entradaproducto_wcds_1_tflinent) )
      {
         addWhere(sWhereString, "(LinEnt >= ?)");
      }
      else
      {
         GXv_int13[2] = (byte)(1) ;
      }
      if ( ! (0==AV77Stocksquimicos_entradaproducto_wcds_2_tflinent_to) )
      {
         addWhere(sWhereString, "(LinEnt <= ?)");
      }
      else
      {
         GXv_int13[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV78Stocksquimicos_entradaproducto_wcds_3_tfentfecent)) )
      {
         addWhere(sWhereString, "(EntFecEnt >= ?)");
      }
      else
      {
         GXv_int13[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Stocksquimicos_entradaproducto_wcds_5_tfalbaran_sel)==0) && ( ! (GXutil.strcmp("", AV79Stocksquimicos_entradaproducto_wcds_4_tfalbaran)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Albaran) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Stocksquimicos_entradaproducto_wcds_5_tfalbaran_sel)==0) )
      {
         addWhere(sWhereString, "(Albaran = ?)");
      }
      else
      {
         GXv_int13[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Stocksquimicos_entradaproducto_wcds_7_tfentnalbar_sel)==0) && ( ! (GXutil.strcmp("", AV81Stocksquimicos_entradaproducto_wcds_6_tfentnalbar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(EntNAlbar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Stocksquimicos_entradaproducto_wcds_7_tfentnalbar_sel)==0) )
      {
         addWhere(sWhereString, "(EntNAlbar = ?)");
      }
      else
      {
         GXv_int13[8] = (byte)(1) ;
      }
      if ( ! (0==AV83Stocksquimicos_entradaproducto_wcds_8_tfpedcod) )
      {
         addWhere(sWhereString, "(PedCod >= ?)");
      }
      else
      {
         GXv_int13[9] = (byte)(1) ;
      }
      if ( ! (0==AV84Stocksquimicos_entradaproducto_wcds_9_tfpedcod_to) )
      {
         addWhere(sWhereString, "(PedCod <= ?)");
      }
      else
      {
         GXv_int13[10] = (byte)(1) ;
      }
      if ( ! (0==AV85Stocksquimicos_entradaproducto_wcds_10_tfentprvnum) )
      {
         addWhere(sWhereString, "(EntPrvNum >= ?)");
      }
      else
      {
         GXv_int13[11] = (byte)(1) ;
      }
      if ( ! (0==AV86Stocksquimicos_entradaproducto_wcds_11_tfentprvnum_to) )
      {
         addWhere(sWhereString, "(EntPrvNum <= ?)");
      }
      else
      {
         GXv_int13[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Stocksquimicos_entradaproducto_wcds_12_tfentunient)==0) )
      {
         addWhere(sWhereString, "(EntUniEnt >= ?)");
      }
      else
      {
         GXv_int13[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Stocksquimicos_entradaproducto_wcds_13_tfentunient_to)==0) )
      {
         addWhere(sWhereString, "(EntUniEnt <= ?)");
      }
      else
      {
         GXv_int13[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Stocksquimicos_entradaproducto_wcds_14_tfentpre)==0) )
      {
         addWhere(sWhereString, "(EntPre >= ?)");
      }
      else
      {
         GXv_int13[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Stocksquimicos_entradaproducto_wcds_15_tfentpre_to)==0) )
      {
         addWhere(sWhereString, "(EntPre <= ?)");
      }
      else
      {
         GXv_int13[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Stocksquimicos_entradaproducto_wcds_16_tfentunirem)==0) )
      {
         addWhere(sWhereString, "(EntUniRem >= ?)");
      }
      else
      {
         GXv_int13[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Stocksquimicos_entradaproducto_wcds_17_tfentunirem_to)==0) )
      {
         addWhere(sWhereString, "(EntUniRem <= ?)");
      }
      else
      {
         GXv_int13[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Stocksquimicos_entradaproducto_wcds_19_tfentlotn_sel)==0) && ( ! (GXutil.strcmp("", AV93Stocksquimicos_entradaproducto_wcds_18_tfentlotn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(EntLotN) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Stocksquimicos_entradaproducto_wcds_19_tfentlotn_sel)==0) )
      {
         addWhere(sWhereString, "(EntLotN = ?)");
      }
      else
      {
         GXv_int13[20] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV95Stocksquimicos_entradaproducto_wcds_20_tfentfval)) )
      {
         addWhere(sWhereString, "(EntFVal >= ?)");
      }
      else
      {
         GXv_int13[21] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV14OrderedBy == 1 ) && ! AV15OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 1 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 2 ) && ! AV15OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 2 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 3 ) && ! AV15OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 3 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 4 ) && ! AV15OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 4 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 5 ) && ! AV15OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 5 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 6 ) && ! AV15OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 6 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 7 ) && ! AV15OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 7 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 8 ) && ! AV15OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 8 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 9 ) && ! AV15OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 9 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 10 ) && ! AV15OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 10 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 11 ) && ! AV15OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 11 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object14[0] = scmdbuf ;
      GXv_Object14[1] = GXv_int13 ;
      return GXv_Object14 ;
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
                  return conditional_H01TA2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.util.Date)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , (java.util.Date)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (String)dynConstraints[29] , (java.util.Date)dynConstraints[30] , ((Number) dynConstraints[31]).shortValue() , ((Boolean) dynConstraints[32]).booleanValue() , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] );
            case 1 :
                  return conditional_H01TA3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.util.Date)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , (java.util.Date)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (String)dynConstraints[29] , (java.util.Date)dynConstraints[30] , ((Number) dynConstraints[31]).shortValue() , ((Boolean) dynConstraints[32]).booleanValue() , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01TA2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01TA3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(11, 20);
               ((String[]) buf[13])[0] = rslt.getString(12, 10);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(13);
               ((short[]) buf[15])[0] = rslt.getShort(14);
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
                  stmt.setString(sIdx, (String)parms[27], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[30]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[31]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 10);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 10);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 20);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 20);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 5);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 5);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 4);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 4);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[48]);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[24]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[25]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[26]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 10);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 10);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 20);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 20);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 5);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 5);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 4);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 4);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[43]);
               }
               return;
      }
   }

}

