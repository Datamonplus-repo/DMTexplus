package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class recetadetinte90__wc_impl extends GXWebComponent
{
   public recetadetinte90__wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public recetadetinte90__wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recetadetinte90__wc_impl.class ));
   }

   public recetadetinte90__wc_impl( int remoteHandle ,
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
      chkavSelected = UIFactory.getCheckbox(this);
      cmbavGridactiongroup1 = new HTMLChoice();
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
               AV6Barcod = (int)(GXutil.lval( httpContext.GetPar( "Barcod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Barcod), 8, 0));
               AV7Barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "Barcodreo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Barcodreo", GXutil.str( AV7Barcodreo, 1, 0));
               AV8Barcodpar = httpContext.GetPar( "Barcodpar") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Barcodpar", AV8Barcodpar);
               AV9RecLinMaq = (short)(GXutil.lval( httpContext.GetPar( "RecLinMaq"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9RecLinMaq), 4, 0));
               AV57RecLinpro = (byte)(GXutil.lval( httpContext.GetPar( "RecLinpro"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57RecLinpro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57RecLinpro), 2, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV5Emprcod,Integer.valueOf(AV6Barcod),Byte.valueOf(AV7Barcodreo),AV8Barcodpar,Short.valueOf(AV9RecLinMaq),Byte.valueOf(AV57RecLinpro)});
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
            if ( ! entryPointCalled && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
            {
               AV5Emprcod = gxfirstwebparm ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
               if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
               {
                  AV6Barcod = (int)(GXutil.lval( httpContext.GetPar( "Barcod"))) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Barcod), 8, 0));
                  AV7Barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "Barcodreo"))) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Barcodreo", GXutil.str( AV7Barcodreo, 1, 0));
                  AV8Barcodpar = httpContext.GetPar( "Barcodpar") ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Barcodpar", AV8Barcodpar);
                  AV9RecLinMaq = (short)(GXutil.lval( httpContext.GetPar( "RecLinMaq"))) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9RecLinMaq), 4, 0));
                  AV57RecLinpro = (byte)(GXutil.lval( httpContext.GetPar( "RecLinpro"))) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57RecLinpro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57RecLinpro), 2, 0));
               }
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
      nRC_GXsfl_20 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_20"))) ;
      nGXsfl_20_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_20_idx"))) ;
      sGXsfl_20_idx = httpContext.GetPar( "sGXsfl_20_idx") ;
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
      AV5Emprcod = httpContext.GetPar( "Emprcod") ;
      AV6Barcod = (int)(GXutil.lval( httpContext.GetPar( "Barcod"))) ;
      AV7Barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "Barcodreo"))) ;
      AV8Barcodpar = httpContext.GetPar( "Barcodpar") ;
      AV9RecLinMaq = (short)(GXutil.lval( httpContext.GetPar( "RecLinMaq"))) ;
      AV57RecLinpro = (byte)(GXutil.lval( httpContext.GetPar( "RecLinpro"))) ;
      AV29TFRecLinPro = (byte)(GXutil.lval( httpContext.GetPar( "TFRecLinPro"))) ;
      AV30TFRecLinPro_To = (byte)(GXutil.lval( httpContext.GetPar( "TFRecLinPro_To"))) ;
      AV31TFProForCod = httpContext.GetPar( "TFProForCod") ;
      AV32TFProForCod_Sel = httpContext.GetPar( "TFProForCod_Sel") ;
      AV33TFProForDsc = httpContext.GetPar( "TFProForDsc") ;
      AV34TFProForDsc_Sel = httpContext.GetPar( "TFProForDsc_Sel") ;
      AV35TFRecLin = (short)(GXutil.lval( httpContext.GetPar( "TFRecLin"))) ;
      AV36TFRecLin_To = (short)(GXutil.lval( httpContext.GetPar( "TFRecLin_To"))) ;
      AV37TFRecPrdNum = httpContext.GetPar( "TFRecPrdNum") ;
      AV38TFRecPrdNum_Sel = httpContext.GetPar( "TFRecPrdNum_Sel") ;
      AV39TFRecPrdDsc = httpContext.GetPar( "TFRecPrdDsc") ;
      AV40TFRecPrdDsc_Sel = httpContext.GetPar( "TFRecPrdDsc_Sel") ;
      AV41TFFacCon = CommonUtil.decimalVal( httpContext.GetPar( "TFFacCon"), ".") ;
      AV42TFFacCon_To = CommonUtil.decimalVal( httpContext.GetPar( "TFFacCon_To"), ".") ;
      AV43TFPrdCant = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdCant"), ".") ;
      AV44TFPrdCant_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdCant_To"), ".") ;
      AV45TFForPrdDsc = httpContext.GetPar( "TFForPrdDsc") ;
      AV46TFForPrdDsc_Sel = httpContext.GetPar( "TFForPrdDsc_Sel") ;
      AV47TFRecForNro = (byte)(GXutil.lval( httpContext.GetPar( "TFRecForNro"))) ;
      AV48TFRecForNro_To = (byte)(GXutil.lval( httpContext.GetPar( "TFRecForNro_To"))) ;
      AV49TFRecPrdTnq = (byte)(GXutil.lval( httpContext.GetPar( "TFRecPrdTnq"))) ;
      AV50TFRecPrdTnq_To = (byte)(GXutil.lval( httpContext.GetPar( "TFRecPrdTnq_To"))) ;
      AV51TFRecLote = httpContext.GetPar( "TFRecLote") ;
      AV52TFRecLote_Sel = httpContext.GetPar( "TFRecLote_Sel") ;
      AV62TFRecManAut = httpContext.GetPar( "TFRecManAut") ;
      AV63TFRecManAut_Sel = httpContext.GetPar( "TFRecManAut_Sel") ;
      AV69Pgmname = httpContext.GetPar( "Pgmname") ;
      AV18OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV19OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV61UsurCod = httpContext.GetPar( "UsurCod") ;
      AV59Station = httpContext.GetPar( "Station") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV6Barcod, AV7Barcodreo, AV8Barcodpar, AV9RecLinMaq, AV57RecLinpro, AV29TFRecLinPro, AV30TFRecLinPro_To, AV31TFProForCod, AV32TFProForCod_Sel, AV33TFProForDsc, AV34TFProForDsc_Sel, AV35TFRecLin, AV36TFRecLin_To, AV37TFRecPrdNum, AV38TFRecPrdNum_Sel, AV39TFRecPrdDsc, AV40TFRecPrdDsc_Sel, AV41TFFacCon, AV42TFFacCon_To, AV43TFPrdCant, AV44TFPrdCant_To, AV45TFForPrdDsc, AV46TFForPrdDsc_Sel, AV47TFRecForNro, AV48TFRecForNro_To, AV49TFRecPrdTnq, AV50TFRecPrdTnq_To, AV51TFRecLote, AV52TFRecLote_Sel, AV62TFRecManAut, AV63TFRecManAut_Sel, AV69Pgmname, AV18OrderedBy, AV19OrderedDsc, AV61UsurCod, AV59Station, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa29F2( ) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            validateSpaRequest();
         }
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( ! isAjaxCallMode( ) )
            {
            }
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            ws29F2( ) ;
            if ( ! isAjaxCallMode( ) )
            {
               if ( nDynComponent == 0 )
               {
                  we29F2( ) ;
               }
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
         httpContext.writeValue( httpContext.getMessage( " Mantenimiento de Productos (Receta)", "")) ;
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
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.recetadetinte90__wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV6Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV8Barcodpar)),GXutil.URLEncode(GXutil.ltrimstr(AV9RecLinMaq,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV57RecLinpro,2,0))}, new String[] {"Emprcod","Barcod","Barcodreo","Barcodpar","RecLinMaq","RecLinpro"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vUSURCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV61UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTATION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV59Station, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"RecetadeTinte90__WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV69Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("recetadetinte90__wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_20", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_20, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV53DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV53DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV5Emprcod", GXutil.rtrim( wcpOAV5Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV6Barcod", GXutil.ltrim( localUtil.ntoc( wcpOAV6Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7Barcodreo", GXutil.ltrim( localUtil.ntoc( wcpOAV7Barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV8Barcodpar", GXutil.rtrim( wcpOAV8Barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV9RecLinMaq", GXutil.ltrim( localUtil.ntoc( wcpOAV9RecLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV57RecLinpro", GXutil.ltrim( localUtil.ntoc( wcpOAV57RecLinpro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRECLINPRO", GXutil.ltrim( localUtil.ntoc( AV29TFRecLinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRECLINPRO_TO", GXutil.ltrim( localUtil.ntoc( AV30TFRecLinPro_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPROFORCOD", GXutil.rtrim( AV31TFProForCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPROFORCOD_SEL", GXutil.rtrim( AV32TFProForCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPROFORDSC", GXutil.rtrim( AV33TFProForDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPROFORDSC_SEL", GXutil.rtrim( AV34TFProForDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRECLIN", GXutil.ltrim( localUtil.ntoc( AV35TFRecLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRECLIN_TO", GXutil.ltrim( localUtil.ntoc( AV36TFRecLin_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRECPRDNUM", GXutil.rtrim( AV37TFRecPrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRECPRDNUM_SEL", GXutil.rtrim( AV38TFRecPrdNum_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRECPRDDSC", GXutil.rtrim( AV39TFRecPrdDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRECPRDDSC_SEL", GXutil.rtrim( AV40TFRecPrdDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFACCON", GXutil.ltrim( localUtil.ntoc( AV41TFFacCon, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFACCON_TO", GXutil.ltrim( localUtil.ntoc( AV42TFFacCon_To, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDCANT", GXutil.ltrim( localUtil.ntoc( AV43TFPrdCant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDCANT_TO", GXutil.ltrim( localUtil.ntoc( AV44TFPrdCant_To, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFORPRDDSC", GXutil.rtrim( AV45TFForPrdDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFORPRDDSC_SEL", GXutil.rtrim( AV46TFForPrdDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRECFORNRO", GXutil.ltrim( localUtil.ntoc( AV47TFRecForNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRECFORNRO_TO", GXutil.ltrim( localUtil.ntoc( AV48TFRecForNro_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRECPRDTNQ", GXutil.ltrim( localUtil.ntoc( AV49TFRecPrdTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRECPRDTNQ_TO", GXutil.ltrim( localUtil.ntoc( AV50TFRecPrdTnq_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRECLOTE", GXutil.rtrim( AV51TFRecLote));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRECLOTE_SEL", GXutil.rtrim( AV52TFRecLote_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRECMANAUT", GXutil.rtrim( AV62TFRecManAut));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRECMANAUT_SEL", GXutil.rtrim( AV63TFRecManAut_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV18OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV19OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV5Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOD", GXutil.ltrim( localUtil.ntoc( AV6Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV7Barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODPAR", GXutil.rtrim( AV8Barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vRECLINMAQ", GXutil.ltrim( localUtil.ntoc( AV9RecLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vRECLINPRO", GXutil.ltrim( localUtil.ntoc( AV57RecLinpro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PRDRGB", GXutil.ltrim( localUtil.ntoc( A13232PrdRGB, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vUSURCOD", GXutil.rtrim( AV61UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vUSURCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV61UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSTATION", GXutil.rtrim( AV59Station));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTATION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV59Station, ""))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vSELECTEDROWS", AV65SelectedRows);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vSELECTEDROWS", AV65SelectedRows);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD_SELECTED", GXutil.rtrim( AV97Emprcod_selected));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOD_SELECTED", GXutil.ltrim( localUtil.ntoc( AV98Barcod_selected, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODREO_SELECTED", GXutil.ltrim( localUtil.ntoc( AV99Barcodreo_selected, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODPAR_SELECTED", GXutil.rtrim( AV100Barcodpar_selected));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vRECLINMAQ_SELECTED", GXutil.ltrim( localUtil.ntoc( AV101Reclinmaq_selected, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vRECLINPRO_SELECTED", GXutil.ltrim( localUtil.ntoc( AV102Reclinpro_selected, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Title", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Infinitescrolling", GXutil.rtrim( Grid_empowerer_Infinitescrolling));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Result));
   }

   public void renderHtmlCloseForm29F2( )
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
         httpContext.writeText( "<script type=\"text/javascript\">") ;
         httpContext.writeText( "gx.setLanguageCode(\""+httpContext.getLanguageProperty( "code")+"\");") ;
         if ( ! httpContext.isSpaRequest( ) )
         {
            httpContext.writeText( "gx.setDateFormat(\""+httpContext.getLanguageProperty( "date_fmt")+"\");") ;
            httpContext.writeText( "gx.setTimeFormat("+httpContext.getLanguageProperty( "time_fmt")+");") ;
            httpContext.writeText( "gx.setCenturyFirstYear("+40+");") ;
            httpContext.writeText( "gx.setDecimalPoint(\""+httpContext.getLanguageProperty( "decimal_point")+"\");") ;
            httpContext.writeText( "gx.setThousandSeparator(\""+httpContext.getLanguageProperty( "thousand_sep")+"\");") ;
            httpContext.writeText( "gx.StorageTimeZone = "+2+";") ;
         }
         httpContext.writeText( "</script>") ;
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
      return "RecetadeTinte90__WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Mantenimiento de Productos (Receta)", "") ;
   }

   public void wb29F0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.recetadetinte90__wc");
            httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, sPrefix, "false");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginBottom10", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableactions_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial WWPBtnNeedMultiRowWOPagingSelection" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnuseraction1_Internalname, "gx.evt.setGridEvt("+GXutil.str( 20, 2, 0)+","+"null"+");", httpContext.getMessage( "Eliminar", ""), bttBtnuseraction1_Jsonclick, 5, httpContext.getMessage( "Selecionar para eliminar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOUSERACTION1\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RecetadeTinte90__WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 hidden-xs", "left", "top", "", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell HasGridEmpowerer", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol20( ) ;
      }
      if ( wbEnd == 20 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_20 = (int)(nGXsfl_20_idx-1) ;
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV69Pgmname), GXutil.rtrim( localUtil.format( AV69Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetadeTinte90__WC.htm");
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
         ucDdo_grid.setProperty("IncludeFilter", Ddo_grid_Includefilter);
         ucDdo_grid.setProperty("FilterType", Ddo_grid_Filtertype);
         ucDdo_grid.setProperty("FilterIsRange", Ddo_grid_Filterisrange);
         ucDdo_grid.setProperty("IncludeDataList", Ddo_grid_Includedatalist);
         ucDdo_grid.setProperty("DataListType", Ddo_grid_Datalisttype);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV53DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         wb_table1_63_29F2( true) ;
      }
      else
      {
         wb_table1_63_29F2( false) ;
      }
      return  ;
   }

   public void wb_table1_63_29F2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.setProperty("InfiniteScrolling", Grid_empowerer_Infinitescrolling);
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 20 )
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

   public void start29F2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( " Mantenimiento de Productos (Receta)", ""), (short)(0)) ;
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
            strup29F0( ) ;
         }
      }
   }

   public void ws29F2( )
   {
      start29F2( ) ;
      evt29F2( ) ;
   }

   public void evt29F2( )
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
                              strup29F0( ) ;
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
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup29F0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1129F2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup29F0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1229F2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOUSERACTION1'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup29F0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoUserAction1' */
                                 e1329F2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup29F0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = chkavSelected.getInternalname() ;
                                 httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup29F0( ) ;
                           }
                           AV70Recetadetinte90__wcds_1_tfreclinpro = AV29TFRecLinPro ;
                           AV71Recetadetinte90__wcds_2_tfreclinpro_to = AV30TFRecLinPro_To ;
                           AV72Recetadetinte90__wcds_3_tfproforcod = AV31TFProForCod ;
                           AV73Recetadetinte90__wcds_4_tfproforcod_sel = AV32TFProForCod_Sel ;
                           AV74Recetadetinte90__wcds_5_tfprofordsc = AV33TFProForDsc ;
                           AV75Recetadetinte90__wcds_6_tfprofordsc_sel = AV34TFProForDsc_Sel ;
                           AV76Recetadetinte90__wcds_7_tfreclin = AV35TFRecLin ;
                           AV77Recetadetinte90__wcds_8_tfreclin_to = AV36TFRecLin_To ;
                           AV78Recetadetinte90__wcds_9_tfrecprdnum = AV37TFRecPrdNum ;
                           AV79Recetadetinte90__wcds_10_tfrecprdnum_sel = AV38TFRecPrdNum_Sel ;
                           AV80Recetadetinte90__wcds_11_tfrecprddsc = AV39TFRecPrdDsc ;
                           AV81Recetadetinte90__wcds_12_tfrecprddsc_sel = AV40TFRecPrdDsc_Sel ;
                           AV82Recetadetinte90__wcds_13_tffaccon = AV41TFFacCon ;
                           AV83Recetadetinte90__wcds_14_tffaccon_to = AV42TFFacCon_To ;
                           AV84Recetadetinte90__wcds_15_tfprdcant = AV43TFPrdCant ;
                           AV85Recetadetinte90__wcds_16_tfprdcant_to = AV44TFPrdCant_To ;
                           AV86Recetadetinte90__wcds_17_tfforprddsc = AV45TFForPrdDsc ;
                           AV87Recetadetinte90__wcds_18_tfforprddsc_sel = AV46TFForPrdDsc_Sel ;
                           AV88Recetadetinte90__wcds_19_tfrecfornro = AV47TFRecForNro ;
                           AV89Recetadetinte90__wcds_20_tfrecfornro_to = AV48TFRecForNro_To ;
                           AV90Recetadetinte90__wcds_21_tfrecprdtnq = AV49TFRecPrdTnq ;
                           AV91Recetadetinte90__wcds_22_tfrecprdtnq_to = AV50TFRecPrdTnq_To ;
                           AV92Recetadetinte90__wcds_23_tfreclote = AV51TFRecLote ;
                           AV93Recetadetinte90__wcds_24_tfreclote_sel = AV52TFRecLote_Sel ;
                           AV94Recetadetinte90__wcds_25_tfrecmanaut = AV62TFRecManAut ;
                           AV95Recetadetinte90__wcds_26_tfrecmanaut_sel = AV63TFRecManAut_Sel ;
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
                              strup29F0( ) ;
                           }
                           nGXsfl_20_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_20_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_20_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_202( ) ;
                           AV64Selected = GXutil.strtobool( httpContext.cgiGet( chkavSelected.getInternalname())) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSelected.getInternalname(), AV64Selected);
                           cmbavGridactiongroup1.setName( cmbavGridactiongroup1.getInternalname() );
                           cmbavGridactiongroup1.setValue( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()) );
                           AV58GridActionGroup1 = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58GridActionGroup1), 4, 0));
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
                           A2804RecLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( edtRecLinMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1273RecLinPro = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecLinPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A764ProForCod = httpContext.cgiGet( edtProForCod_Internalname) ;
                           A766ProForDsc = httpContext.cgiGet( edtProForDsc_Internalname) ;
                           A811RecLin = (short)(localUtil.ctol( httpContext.cgiGet( edtRecLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A872RecPrdNum = httpContext.cgiGet( edtRecPrdNum_Internalname) ;
                           A875RecPrdDsc = httpContext.cgiGet( edtRecPrdDsc_Internalname) ;
                           A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
                           n719PrdNum = false ;
                           A490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( edtForPrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n490ForPrdUMe = false ;
                           A431FacCon = localUtil.ctond( httpContext.cgiGet( edtFacCon_Internalname)) ;
                           A686PrdCant = localUtil.ctond( httpContext.cgiGet( edtPrdCant_Internalname)) ;
                           A488ForPrdDsc = httpContext.cgiGet( edtForPrdDsc_Internalname) ;
                           n488ForPrdDsc = false ;
                           A2394RecForNro = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecForNro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A3274RecPrdTnq = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecPrdTnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A5725RecLote = httpContext.cgiGet( edtRecLote_Internalname) ;
                           A14055RecManAut = httpContext.cgiGet( edtRecManAut_Internalname) ;
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavPrdrgb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavPrdrgb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPRDRGB");
                              GX_FocusControl = edtavPrdrgb_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV21PrdRGB = 0 ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPrdrgb_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21PrdRGB), 10, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPRDRGB"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(AV21PrdRGB), "ZZZZZZZZZ9")));
                           }
                           else
                           {
                              AV21PrdRGB = localUtil.ctol( httpContext.cgiGet( edtavPrdrgb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPrdrgb_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21PrdRGB), 10, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPRDRGB"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(AV21PrdRGB), "ZZZZZZZZZ9")));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vR");
                              GX_FocusControl = edtavR_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV22R = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavR_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22R), 3, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vR"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(AV22R), "ZZ9")));
                           }
                           else
                           {
                              AV22R = (short)(localUtil.ctol( httpContext.cgiGet( edtavR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavR_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22R), 3, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vR"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(AV22R), "ZZ9")));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavG_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavG_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vG");
                              GX_FocusControl = edtavG_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV23G = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavG_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23G), 3, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vG"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(AV23G), "ZZ9")));
                           }
                           else
                           {
                              AV23G = (short)(localUtil.ctol( httpContext.cgiGet( edtavG_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavG_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23G), 3, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vG"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(AV23G), "ZZ9")));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vB");
                              GX_FocusControl = edtavB_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV24B = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavB_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24B), 3, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vB"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(AV24B), "ZZ9")));
                           }
                           else
                           {
                              AV24B = (short)(localUtil.ctol( httpContext.cgiGet( edtavB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavB_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24B), 3, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vB"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(AV24B), "ZZ9")));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavR2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavR2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vR2");
                              GX_FocusControl = edtavR2_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV25R2 = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavR2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25R2), 3, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vR2"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(AV25R2), "ZZ9")));
                           }
                           else
                           {
                              AV25R2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavR2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavR2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25R2), 3, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vR2"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(AV25R2), "ZZ9")));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavG2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavG2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vG2");
                              GX_FocusControl = edtavG2_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV26G2 = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavG2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26G2), 3, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vG2"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(AV26G2), "ZZ9")));
                           }
                           else
                           {
                              AV26G2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavG2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavG2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26G2), 3, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vG2"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(AV26G2), "ZZ9")));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavB2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavB2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vB2");
                              GX_FocusControl = edtavB2_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV27B2 = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavB2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27B2), 3, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vB2"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(AV27B2), "ZZ9")));
                           }
                           else
                           {
                              AV27B2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavB2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavB2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27B2), 3, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vB2"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(AV27B2), "ZZ9")));
                           }
                           A6018ProForFab = httpContext.cgiGet( edtProForFab_Internalname) ;
                           n6018ProForFab = false ;
                           A4024RecMar = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecMar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
                                       GX_FocusControl = chkavSelected.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e1429F2 ();
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
                                       GX_FocusControl = chkavSelected.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e1529F2 ();
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
                                       GX_FocusControl = chkavSelected.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e1629F2 ();
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
                                    strup29F0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = chkavSelected.getInternalname() ;
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

   public void we29F2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm29F2( ) ;
         }
      }
   }

   public void pa29F2( )
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
      subsflControlProps_202( ) ;
      while ( nGXsfl_20_idx <= nRC_GXsfl_20 )
      {
         sendrow_202( ) ;
         nGXsfl_20_idx = ((subGrid_Islastpage==1)&&(nGXsfl_20_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_20_idx+1) ;
         sGXsfl_20_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_20_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_202( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV5Emprcod ,
                                 int AV6Barcod ,
                                 byte AV7Barcodreo ,
                                 String AV8Barcodpar ,
                                 short AV9RecLinMaq ,
                                 byte AV57RecLinpro ,
                                 byte AV29TFRecLinPro ,
                                 byte AV30TFRecLinPro_To ,
                                 String AV31TFProForCod ,
                                 String AV32TFProForCod_Sel ,
                                 String AV33TFProForDsc ,
                                 String AV34TFProForDsc_Sel ,
                                 short AV35TFRecLin ,
                                 short AV36TFRecLin_To ,
                                 String AV37TFRecPrdNum ,
                                 String AV38TFRecPrdNum_Sel ,
                                 String AV39TFRecPrdDsc ,
                                 String AV40TFRecPrdDsc_Sel ,
                                 java.math.BigDecimal AV41TFFacCon ,
                                 java.math.BigDecimal AV42TFFacCon_To ,
                                 java.math.BigDecimal AV43TFPrdCant ,
                                 java.math.BigDecimal AV44TFPrdCant_To ,
                                 String AV45TFForPrdDsc ,
                                 String AV46TFForPrdDsc_Sel ,
                                 byte AV47TFRecForNro ,
                                 byte AV48TFRecForNro_To ,
                                 byte AV49TFRecPrdTnq ,
                                 byte AV50TFRecPrdTnq_To ,
                                 String AV51TFRecLote ,
                                 String AV52TFRecLote_Sel ,
                                 String AV62TFRecManAut ,
                                 String AV63TFRecManAut_Sel ,
                                 String AV69Pgmname ,
                                 short AV18OrderedBy ,
                                 boolean AV19OrderedDsc ,
                                 String AV61UsurCod ,
                                 String AV59Station ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e1529F2 ();
      GRID_nCurrentRecord = 0 ;
      rf29F2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"RecetadeTinte90__WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV69Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("recetadetinte90__wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_RECLIN", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A811RecLin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"RECLIN", GXutil.ltrim( localUtil.ntoc( A811RecLin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARCOD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARCODREO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARCODPAR", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A130BarCodPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCODPAR", GXutil.rtrim( A130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_RECLINMAQ", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A2804RecLinMaq), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"RECLINMAQ", GXutil.ltrim( localUtil.ntoc( A2804RecLinMaq, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_RECLINPRO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A1273RecLinPro), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"RECLINPRO", GXutil.ltrim( localUtil.ntoc( A1273RecLinPro, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_RECPRDNUM", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A872RecPrdNum, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"RECPRDNUM", GXutil.rtrim( A872RecPrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_RECPRDDSC", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A875RecPrdDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"RECPRDDSC", GXutil.rtrim( A875RecPrdDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_PRDNUM", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A719PrdNum, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PRDNUM", GXutil.rtrim( A719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_FORPRDUME", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A490ForPrdUMe), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"FORPRDUME", GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_FACCON", getSecureSignedToken( sPrefix, localUtil.format( A431FacCon, "ZZZZ9.99999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"FACCON", GXutil.ltrim( localUtil.ntoc( A431FacCon, (byte)(11), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_PRDCANT", getSecureSignedToken( sPrefix, localUtil.format( A686PrdCant, "ZZZZZZ9.999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PRDCANT", GXutil.ltrim( localUtil.ntoc( A686PrdCant, (byte)(11), (byte)(3), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_RECFORNRO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A2394RecForNro), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"RECFORNRO", GXutil.ltrim( localUtil.ntoc( A2394RecForNro, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_RECPRDTNQ", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A3274RecPrdTnq), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"RECPRDTNQ", GXutil.ltrim( localUtil.ntoc( A3274RecPrdTnq, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_RECLOTE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A5725RecLote, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"RECLOTE", GXutil.rtrim( A5725RecLote));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_RECMANAUT", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A14055RecManAut, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"RECMANAUT", GXutil.rtrim( A14055RecManAut));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPRDRGB", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV21PrdRGB), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRDRGB", GXutil.ltrim( localUtil.ntoc( AV21PrdRGB, (byte)(10), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vR", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV22R), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vR", GXutil.ltrim( localUtil.ntoc( AV22R, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vG", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV23G), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vG", GXutil.ltrim( localUtil.ntoc( AV23G, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vB", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV24B), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vB", GXutil.ltrim( localUtil.ntoc( AV24B, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vR2", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV25R2), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vR2", GXutil.ltrim( localUtil.ntoc( AV25R2, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vG2", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV26G2), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vG2", GXutil.ltrim( localUtil.ntoc( AV26G2, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vB2", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV27B2), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vB2", GXutil.ltrim( localUtil.ntoc( AV27B2, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_RECMAR", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A4024RecMar), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"RECMAR", GXutil.ltrim( localUtil.ntoc( A4024RecMar, (byte)(1), (byte)(0), ".", "")));
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
      GXCCtl = "GRID_nFirstRecordOnPage_" + sGXsfl_20_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      send_integrity_hashes( ) ;
      rf29F2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV69Pgmname = "RecetadeTinte90__WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69Pgmname", AV69Pgmname);
      Gx_err = (short)(0) ;
      edtavPrdrgb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrdrgb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdrgb_Enabled), 5, 0), !bGXsfl_20_Refreshing);
      edtavR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavR_Enabled), 5, 0), !bGXsfl_20_Refreshing);
      edtavG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavG_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavG_Enabled), 5, 0), !bGXsfl_20_Refreshing);
      edtavB_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavB_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavB_Enabled), 5, 0), !bGXsfl_20_Refreshing);
      edtavR2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavR2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavR2_Enabled), 5, 0), !bGXsfl_20_Refreshing);
      edtavG2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavG2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavG2_Enabled), 5, 0), !bGXsfl_20_Refreshing);
      edtavB2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavB2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavB2_Enabled), 5, 0), !bGXsfl_20_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf29F2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(20) ;
      /* Execute user event: Refresh */
      e1529F2 ();
      nGXsfl_20_idx = (int)(1+GRID_nFirstRecordOnPage) ;
      sGXsfl_20_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_20_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_202( ) ;
      bGXsfl_20_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
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
         subsflControlProps_202( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Byte.valueOf(AV70Recetadetinte90__wcds_1_tfreclinpro) ,
                                              Byte.valueOf(AV71Recetadetinte90__wcds_2_tfreclinpro_to) ,
                                              AV73Recetadetinte90__wcds_4_tfproforcod_sel ,
                                              AV72Recetadetinte90__wcds_3_tfproforcod ,
                                              AV75Recetadetinte90__wcds_6_tfprofordsc_sel ,
                                              AV74Recetadetinte90__wcds_5_tfprofordsc ,
                                              Short.valueOf(AV76Recetadetinte90__wcds_7_tfreclin) ,
                                              Short.valueOf(AV77Recetadetinte90__wcds_8_tfreclin_to) ,
                                              AV79Recetadetinte90__wcds_10_tfrecprdnum_sel ,
                                              AV78Recetadetinte90__wcds_9_tfrecprdnum ,
                                              AV81Recetadetinte90__wcds_12_tfrecprddsc_sel ,
                                              AV80Recetadetinte90__wcds_11_tfrecprddsc ,
                                              AV82Recetadetinte90__wcds_13_tffaccon ,
                                              AV83Recetadetinte90__wcds_14_tffaccon_to ,
                                              AV84Recetadetinte90__wcds_15_tfprdcant ,
                                              AV85Recetadetinte90__wcds_16_tfprdcant_to ,
                                              AV87Recetadetinte90__wcds_18_tfforprddsc_sel ,
                                              AV86Recetadetinte90__wcds_17_tfforprddsc ,
                                              Byte.valueOf(AV88Recetadetinte90__wcds_19_tfrecfornro) ,
                                              Byte.valueOf(AV89Recetadetinte90__wcds_20_tfrecfornro_to) ,
                                              Byte.valueOf(AV90Recetadetinte90__wcds_21_tfrecprdtnq) ,
                                              Byte.valueOf(AV91Recetadetinte90__wcds_22_tfrecprdtnq_to) ,
                                              AV93Recetadetinte90__wcds_24_tfreclote_sel ,
                                              AV92Recetadetinte90__wcds_23_tfreclote ,
                                              AV95Recetadetinte90__wcds_26_tfrecmanaut_sel ,
                                              AV94Recetadetinte90__wcds_25_tfrecmanaut ,
                                              Byte.valueOf(A1273RecLinPro) ,
                                              A764ProForCod ,
                                              A766ProForDsc ,
                                              Short.valueOf(A811RecLin) ,
                                              A872RecPrdNum ,
                                              A875RecPrdDsc ,
                                              A431FacCon ,
                                              A686PrdCant ,
                                              A488ForPrdDsc ,
                                              Byte.valueOf(A2394RecForNro) ,
                                              Byte.valueOf(A3274RecPrdTnq) ,
                                              A5725RecLote ,
                                              A14055RecManAut ,
                                              Short.valueOf(AV18OrderedBy) ,
                                              Boolean.valueOf(AV19OrderedDsc) ,
                                              AV5Emprcod ,
                                              Integer.valueOf(AV6Barcod) ,
                                              Byte.valueOf(AV7Barcodreo) ,
                                              AV8Barcodpar ,
                                              Short.valueOf(AV9RecLinMaq) ,
                                              Byte.valueOf(AV57RecLinpro) ,
                                              A396EmprCod ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar ,
                                              Short.valueOf(A2804RecLinMaq) } ,
                                              new int[]{
                                              TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                              TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT,
                                              TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT
                                              }
         });
         lV72Recetadetinte90__wcds_3_tfproforcod = GXutil.padr( GXutil.rtrim( AV72Recetadetinte90__wcds_3_tfproforcod), 6, "%") ;
         lV74Recetadetinte90__wcds_5_tfprofordsc = GXutil.padr( GXutil.rtrim( AV74Recetadetinte90__wcds_5_tfprofordsc), 30, "%") ;
         lV78Recetadetinte90__wcds_9_tfrecprdnum = GXutil.padr( GXutil.rtrim( AV78Recetadetinte90__wcds_9_tfrecprdnum), 6, "%") ;
         lV80Recetadetinte90__wcds_11_tfrecprddsc = GXutil.padr( GXutil.rtrim( AV80Recetadetinte90__wcds_11_tfrecprddsc), 26, "%") ;
         lV86Recetadetinte90__wcds_17_tfforprddsc = GXutil.padr( GXutil.rtrim( AV86Recetadetinte90__wcds_17_tfforprddsc), 5, "%") ;
         lV92Recetadetinte90__wcds_23_tfreclote = GXutil.padr( GXutil.rtrim( AV92Recetadetinte90__wcds_23_tfreclote), 26, "%") ;
         lV94Recetadetinte90__wcds_25_tfrecmanaut = GXutil.padr( GXutil.rtrim( AV94Recetadetinte90__wcds_25_tfrecmanaut), 1, "%") ;
         /* Using cursor H029F2 */
         pr_default.execute(0, new Object[] {AV5Emprcod, Integer.valueOf(AV6Barcod), Byte.valueOf(AV7Barcodreo), AV8Barcodpar, Short.valueOf(AV9RecLinMaq), Byte.valueOf(AV57RecLinpro), Byte.valueOf(AV70Recetadetinte90__wcds_1_tfreclinpro), Byte.valueOf(AV71Recetadetinte90__wcds_2_tfreclinpro_to), lV72Recetadetinte90__wcds_3_tfproforcod, AV73Recetadetinte90__wcds_4_tfproforcod_sel, lV74Recetadetinte90__wcds_5_tfprofordsc, AV75Recetadetinte90__wcds_6_tfprofordsc_sel, Short.valueOf(AV76Recetadetinte90__wcds_7_tfreclin), Short.valueOf(AV77Recetadetinte90__wcds_8_tfreclin_to), lV78Recetadetinte90__wcds_9_tfrecprdnum, AV79Recetadetinte90__wcds_10_tfrecprdnum_sel, lV80Recetadetinte90__wcds_11_tfrecprddsc, AV81Recetadetinte90__wcds_12_tfrecprddsc_sel, AV82Recetadetinte90__wcds_13_tffaccon, AV83Recetadetinte90__wcds_14_tffaccon_to, AV84Recetadetinte90__wcds_15_tfprdcant, AV85Recetadetinte90__wcds_16_tfprdcant_to, lV86Recetadetinte90__wcds_17_tfforprddsc, AV87Recetadetinte90__wcds_18_tfforprddsc_sel, Byte.valueOf(AV88Recetadetinte90__wcds_19_tfrecfornro), Byte.valueOf(AV89Recetadetinte90__wcds_20_tfrecfornro_to), Byte.valueOf(AV90Recetadetinte90__wcds_21_tfrecprdtnq), Byte.valueOf(AV91Recetadetinte90__wcds_22_tfrecprdtnq_to), lV92Recetadetinte90__wcds_23_tfreclote, AV93Recetadetinte90__wcds_24_tfreclote_sel, lV94Recetadetinte90__wcds_25_tfrecmanaut, AV95Recetadetinte90__wcds_26_tfrecmanaut_sel, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_20_idx = (int)(1+GRID_nFirstRecordOnPage) ;
         sGXsfl_20_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_20_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_202( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A13232PrdRGB = H029F2_A13232PrdRGB[0] ;
            A4024RecMar = H029F2_A4024RecMar[0] ;
            A6018ProForFab = H029F2_A6018ProForFab[0] ;
            n6018ProForFab = H029F2_n6018ProForFab[0] ;
            A14055RecManAut = H029F2_A14055RecManAut[0] ;
            A5725RecLote = H029F2_A5725RecLote[0] ;
            A3274RecPrdTnq = H029F2_A3274RecPrdTnq[0] ;
            A2394RecForNro = H029F2_A2394RecForNro[0] ;
            A488ForPrdDsc = H029F2_A488ForPrdDsc[0] ;
            n488ForPrdDsc = H029F2_n488ForPrdDsc[0] ;
            A686PrdCant = H029F2_A686PrdCant[0] ;
            A431FacCon = H029F2_A431FacCon[0] ;
            A490ForPrdUMe = H029F2_A490ForPrdUMe[0] ;
            n490ForPrdUMe = H029F2_n490ForPrdUMe[0] ;
            A719PrdNum = H029F2_A719PrdNum[0] ;
            n719PrdNum = H029F2_n719PrdNum[0] ;
            A875RecPrdDsc = H029F2_A875RecPrdDsc[0] ;
            A872RecPrdNum = H029F2_A872RecPrdNum[0] ;
            A811RecLin = H029F2_A811RecLin[0] ;
            A766ProForDsc = H029F2_A766ProForDsc[0] ;
            A764ProForCod = H029F2_A764ProForCod[0] ;
            A1273RecLinPro = H029F2_A1273RecLinPro[0] ;
            A2804RecLinMaq = H029F2_A2804RecLinMaq[0] ;
            A130BarCodPar = H029F2_A130BarCodPar[0] ;
            A132BarCodReo = H029F2_A132BarCodReo[0] ;
            A129BarCod = H029F2_A129BarCod[0] ;
            A396EmprCod = H029F2_A396EmprCod[0] ;
            A13232PrdRGB = H029F2_A13232PrdRGB[0] ;
            A488ForPrdDsc = H029F2_A488ForPrdDsc[0] ;
            n488ForPrdDsc = H029F2_n488ForPrdDsc[0] ;
            A764ProForCod = H029F2_A764ProForCod[0] ;
            A6018ProForFab = H029F2_A6018ProForFab[0] ;
            n6018ProForFab = H029F2_n6018ProForFab[0] ;
            A766ProForDsc = H029F2_A766ProForDsc[0] ;
            e1629F2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(20) ;
         wb29F0( ) ;
      }
      bGXsfl_20_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes29F2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_RECLIN"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(A811RecLin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARCOD"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARCODREO"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARCODPAR"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A130BarCodPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_RECLINMAQ"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(A2804RecLinMaq), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_RECLINPRO"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(A1273RecLinPro), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vUSURCOD", GXutil.rtrim( AV61UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vUSURCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV61UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSTATION", GXutil.rtrim( AV59Station));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTATION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV59Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_RECPRDNUM"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A872RecPrdNum, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_RECPRDDSC"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A875RecPrdDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_PRDNUM"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A719PrdNum, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_FORPRDUME"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(A490ForPrdUMe), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_FACCON"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( A431FacCon, "ZZZZ9.99999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_PRDCANT"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( A686PrdCant, "ZZZZZZ9.999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_RECFORNRO"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(A2394RecForNro), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_RECPRDTNQ"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(A3274RecPrdTnq), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_RECLOTE"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A5725RecLote, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_RECMANAUT"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, GXutil.rtrim( localUtil.format( A14055RecManAut, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPRDRGB"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(AV21PrdRGB), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vR"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(AV22R), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vG"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(AV23G), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vB"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(AV24B), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vR2"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(AV25R2), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vG2"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(AV26G2), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vB2"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(AV27B2), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_RECMAR"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(A4024RecMar), "9")));
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
      AV70Recetadetinte90__wcds_1_tfreclinpro = AV29TFRecLinPro ;
      AV71Recetadetinte90__wcds_2_tfreclinpro_to = AV30TFRecLinPro_To ;
      AV72Recetadetinte90__wcds_3_tfproforcod = AV31TFProForCod ;
      AV73Recetadetinte90__wcds_4_tfproforcod_sel = AV32TFProForCod_Sel ;
      AV74Recetadetinte90__wcds_5_tfprofordsc = AV33TFProForDsc ;
      AV75Recetadetinte90__wcds_6_tfprofordsc_sel = AV34TFProForDsc_Sel ;
      AV76Recetadetinte90__wcds_7_tfreclin = AV35TFRecLin ;
      AV77Recetadetinte90__wcds_8_tfreclin_to = AV36TFRecLin_To ;
      AV78Recetadetinte90__wcds_9_tfrecprdnum = AV37TFRecPrdNum ;
      AV79Recetadetinte90__wcds_10_tfrecprdnum_sel = AV38TFRecPrdNum_Sel ;
      AV80Recetadetinte90__wcds_11_tfrecprddsc = AV39TFRecPrdDsc ;
      AV81Recetadetinte90__wcds_12_tfrecprddsc_sel = AV40TFRecPrdDsc_Sel ;
      AV82Recetadetinte90__wcds_13_tffaccon = AV41TFFacCon ;
      AV83Recetadetinte90__wcds_14_tffaccon_to = AV42TFFacCon_To ;
      AV84Recetadetinte90__wcds_15_tfprdcant = AV43TFPrdCant ;
      AV85Recetadetinte90__wcds_16_tfprdcant_to = AV44TFPrdCant_To ;
      AV86Recetadetinte90__wcds_17_tfforprddsc = AV45TFForPrdDsc ;
      AV87Recetadetinte90__wcds_18_tfforprddsc_sel = AV46TFForPrdDsc_Sel ;
      AV88Recetadetinte90__wcds_19_tfrecfornro = AV47TFRecForNro ;
      AV89Recetadetinte90__wcds_20_tfrecfornro_to = AV48TFRecForNro_To ;
      AV90Recetadetinte90__wcds_21_tfrecprdtnq = AV49TFRecPrdTnq ;
      AV91Recetadetinte90__wcds_22_tfrecprdtnq_to = AV50TFRecPrdTnq_To ;
      AV92Recetadetinte90__wcds_23_tfreclote = AV51TFRecLote ;
      AV93Recetadetinte90__wcds_24_tfreclote_sel = AV52TFRecLote_Sel ;
      AV94Recetadetinte90__wcds_25_tfrecmanaut = AV62TFRecManAut ;
      AV95Recetadetinte90__wcds_26_tfrecmanaut_sel = AV63TFRecManAut_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Byte.valueOf(AV70Recetadetinte90__wcds_1_tfreclinpro) ,
                                           Byte.valueOf(AV71Recetadetinte90__wcds_2_tfreclinpro_to) ,
                                           AV73Recetadetinte90__wcds_4_tfproforcod_sel ,
                                           AV72Recetadetinte90__wcds_3_tfproforcod ,
                                           AV75Recetadetinte90__wcds_6_tfprofordsc_sel ,
                                           AV74Recetadetinte90__wcds_5_tfprofordsc ,
                                           Short.valueOf(AV76Recetadetinte90__wcds_7_tfreclin) ,
                                           Short.valueOf(AV77Recetadetinte90__wcds_8_tfreclin_to) ,
                                           AV79Recetadetinte90__wcds_10_tfrecprdnum_sel ,
                                           AV78Recetadetinte90__wcds_9_tfrecprdnum ,
                                           AV81Recetadetinte90__wcds_12_tfrecprddsc_sel ,
                                           AV80Recetadetinte90__wcds_11_tfrecprddsc ,
                                           AV82Recetadetinte90__wcds_13_tffaccon ,
                                           AV83Recetadetinte90__wcds_14_tffaccon_to ,
                                           AV84Recetadetinte90__wcds_15_tfprdcant ,
                                           AV85Recetadetinte90__wcds_16_tfprdcant_to ,
                                           AV87Recetadetinte90__wcds_18_tfforprddsc_sel ,
                                           AV86Recetadetinte90__wcds_17_tfforprddsc ,
                                           Byte.valueOf(AV88Recetadetinte90__wcds_19_tfrecfornro) ,
                                           Byte.valueOf(AV89Recetadetinte90__wcds_20_tfrecfornro_to) ,
                                           Byte.valueOf(AV90Recetadetinte90__wcds_21_tfrecprdtnq) ,
                                           Byte.valueOf(AV91Recetadetinte90__wcds_22_tfrecprdtnq_to) ,
                                           AV93Recetadetinte90__wcds_24_tfreclote_sel ,
                                           AV92Recetadetinte90__wcds_23_tfreclote ,
                                           AV95Recetadetinte90__wcds_26_tfrecmanaut_sel ,
                                           AV94Recetadetinte90__wcds_25_tfrecmanaut ,
                                           Byte.valueOf(A1273RecLinPro) ,
                                           A764ProForCod ,
                                           A766ProForDsc ,
                                           Short.valueOf(A811RecLin) ,
                                           A872RecPrdNum ,
                                           A875RecPrdDsc ,
                                           A431FacCon ,
                                           A686PrdCant ,
                                           A488ForPrdDsc ,
                                           Byte.valueOf(A2394RecForNro) ,
                                           Byte.valueOf(A3274RecPrdTnq) ,
                                           A5725RecLote ,
                                           A14055RecManAut ,
                                           Short.valueOf(AV18OrderedBy) ,
                                           Boolean.valueOf(AV19OrderedDsc) ,
                                           AV5Emprcod ,
                                           Integer.valueOf(AV6Barcod) ,
                                           Byte.valueOf(AV7Barcodreo) ,
                                           AV8Barcodpar ,
                                           Short.valueOf(AV9RecLinMaq) ,
                                           Byte.valueOf(AV57RecLinpro) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(A2804RecLinMaq) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT
                                           }
      });
      lV72Recetadetinte90__wcds_3_tfproforcod = GXutil.padr( GXutil.rtrim( AV72Recetadetinte90__wcds_3_tfproforcod), 6, "%") ;
      lV74Recetadetinte90__wcds_5_tfprofordsc = GXutil.padr( GXutil.rtrim( AV74Recetadetinte90__wcds_5_tfprofordsc), 30, "%") ;
      lV78Recetadetinte90__wcds_9_tfrecprdnum = GXutil.padr( GXutil.rtrim( AV78Recetadetinte90__wcds_9_tfrecprdnum), 6, "%") ;
      lV80Recetadetinte90__wcds_11_tfrecprddsc = GXutil.padr( GXutil.rtrim( AV80Recetadetinte90__wcds_11_tfrecprddsc), 26, "%") ;
      lV86Recetadetinte90__wcds_17_tfforprddsc = GXutil.padr( GXutil.rtrim( AV86Recetadetinte90__wcds_17_tfforprddsc), 5, "%") ;
      lV92Recetadetinte90__wcds_23_tfreclote = GXutil.padr( GXutil.rtrim( AV92Recetadetinte90__wcds_23_tfreclote), 26, "%") ;
      lV94Recetadetinte90__wcds_25_tfrecmanaut = GXutil.padr( GXutil.rtrim( AV94Recetadetinte90__wcds_25_tfrecmanaut), 1, "%") ;
      /* Using cursor H029F3 */
      pr_default.execute(1, new Object[] {AV5Emprcod, Integer.valueOf(AV6Barcod), Byte.valueOf(AV7Barcodreo), AV8Barcodpar, Short.valueOf(AV9RecLinMaq), Byte.valueOf(AV57RecLinpro), Byte.valueOf(AV70Recetadetinte90__wcds_1_tfreclinpro), Byte.valueOf(AV71Recetadetinte90__wcds_2_tfreclinpro_to), lV72Recetadetinte90__wcds_3_tfproforcod, AV73Recetadetinte90__wcds_4_tfproforcod_sel, lV74Recetadetinte90__wcds_5_tfprofordsc, AV75Recetadetinte90__wcds_6_tfprofordsc_sel, Short.valueOf(AV76Recetadetinte90__wcds_7_tfreclin), Short.valueOf(AV77Recetadetinte90__wcds_8_tfreclin_to), lV78Recetadetinte90__wcds_9_tfrecprdnum, AV79Recetadetinte90__wcds_10_tfrecprdnum_sel, lV80Recetadetinte90__wcds_11_tfrecprddsc, AV81Recetadetinte90__wcds_12_tfrecprddsc_sel, AV82Recetadetinte90__wcds_13_tffaccon, AV83Recetadetinte90__wcds_14_tffaccon_to, AV84Recetadetinte90__wcds_15_tfprdcant, AV85Recetadetinte90__wcds_16_tfprdcant_to, lV86Recetadetinte90__wcds_17_tfforprddsc, AV87Recetadetinte90__wcds_18_tfforprddsc_sel, Byte.valueOf(AV88Recetadetinte90__wcds_19_tfrecfornro), Byte.valueOf(AV89Recetadetinte90__wcds_20_tfrecfornro_to), Byte.valueOf(AV90Recetadetinte90__wcds_21_tfrecprdtnq), Byte.valueOf(AV91Recetadetinte90__wcds_22_tfrecprdtnq_to), lV92Recetadetinte90__wcds_23_tfreclote, AV93Recetadetinte90__wcds_24_tfreclote_sel, lV94Recetadetinte90__wcds_25_tfrecmanaut, AV95Recetadetinte90__wcds_26_tfrecmanaut_sel});
      GRID_nRecordCount = H029F3_AGRID_nRecordCount[0] ;
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
      AV70Recetadetinte90__wcds_1_tfreclinpro = AV29TFRecLinPro ;
      AV71Recetadetinte90__wcds_2_tfreclinpro_to = AV30TFRecLinPro_To ;
      AV72Recetadetinte90__wcds_3_tfproforcod = AV31TFProForCod ;
      AV73Recetadetinte90__wcds_4_tfproforcod_sel = AV32TFProForCod_Sel ;
      AV74Recetadetinte90__wcds_5_tfprofordsc = AV33TFProForDsc ;
      AV75Recetadetinte90__wcds_6_tfprofordsc_sel = AV34TFProForDsc_Sel ;
      AV76Recetadetinte90__wcds_7_tfreclin = AV35TFRecLin ;
      AV77Recetadetinte90__wcds_8_tfreclin_to = AV36TFRecLin_To ;
      AV78Recetadetinte90__wcds_9_tfrecprdnum = AV37TFRecPrdNum ;
      AV79Recetadetinte90__wcds_10_tfrecprdnum_sel = AV38TFRecPrdNum_Sel ;
      AV80Recetadetinte90__wcds_11_tfrecprddsc = AV39TFRecPrdDsc ;
      AV81Recetadetinte90__wcds_12_tfrecprddsc_sel = AV40TFRecPrdDsc_Sel ;
      AV82Recetadetinte90__wcds_13_tffaccon = AV41TFFacCon ;
      AV83Recetadetinte90__wcds_14_tffaccon_to = AV42TFFacCon_To ;
      AV84Recetadetinte90__wcds_15_tfprdcant = AV43TFPrdCant ;
      AV85Recetadetinte90__wcds_16_tfprdcant_to = AV44TFPrdCant_To ;
      AV86Recetadetinte90__wcds_17_tfforprddsc = AV45TFForPrdDsc ;
      AV87Recetadetinte90__wcds_18_tfforprddsc_sel = AV46TFForPrdDsc_Sel ;
      AV88Recetadetinte90__wcds_19_tfrecfornro = AV47TFRecForNro ;
      AV89Recetadetinte90__wcds_20_tfrecfornro_to = AV48TFRecForNro_To ;
      AV90Recetadetinte90__wcds_21_tfrecprdtnq = AV49TFRecPrdTnq ;
      AV91Recetadetinte90__wcds_22_tfrecprdtnq_to = AV50TFRecPrdTnq_To ;
      AV92Recetadetinte90__wcds_23_tfreclote = AV51TFRecLote ;
      AV93Recetadetinte90__wcds_24_tfreclote_sel = AV52TFRecLote_Sel ;
      AV94Recetadetinte90__wcds_25_tfrecmanaut = AV62TFRecManAut ;
      AV95Recetadetinte90__wcds_26_tfrecmanaut_sel = AV63TFRecManAut_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV6Barcod, AV7Barcodreo, AV8Barcodpar, AV9RecLinMaq, AV57RecLinpro, AV29TFRecLinPro, AV30TFRecLinPro_To, AV31TFProForCod, AV32TFProForCod_Sel, AV33TFProForDsc, AV34TFProForDsc_Sel, AV35TFRecLin, AV36TFRecLin_To, AV37TFRecPrdNum, AV38TFRecPrdNum_Sel, AV39TFRecPrdDsc, AV40TFRecPrdDsc_Sel, AV41TFFacCon, AV42TFFacCon_To, AV43TFPrdCant, AV44TFPrdCant_To, AV45TFForPrdDsc, AV46TFForPrdDsc_Sel, AV47TFRecForNro, AV48TFRecForNro_To, AV49TFRecPrdTnq, AV50TFRecPrdTnq_To, AV51TFRecLote, AV52TFRecLote_Sel, AV62TFRecManAut, AV63TFRecManAut_Sel, AV69Pgmname, AV18OrderedBy, AV19OrderedDsc, AV61UsurCod, AV59Station, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV70Recetadetinte90__wcds_1_tfreclinpro = AV29TFRecLinPro ;
      AV71Recetadetinte90__wcds_2_tfreclinpro_to = AV30TFRecLinPro_To ;
      AV72Recetadetinte90__wcds_3_tfproforcod = AV31TFProForCod ;
      AV73Recetadetinte90__wcds_4_tfproforcod_sel = AV32TFProForCod_Sel ;
      AV74Recetadetinte90__wcds_5_tfprofordsc = AV33TFProForDsc ;
      AV75Recetadetinte90__wcds_6_tfprofordsc_sel = AV34TFProForDsc_Sel ;
      AV76Recetadetinte90__wcds_7_tfreclin = AV35TFRecLin ;
      AV77Recetadetinte90__wcds_8_tfreclin_to = AV36TFRecLin_To ;
      AV78Recetadetinte90__wcds_9_tfrecprdnum = AV37TFRecPrdNum ;
      AV79Recetadetinte90__wcds_10_tfrecprdnum_sel = AV38TFRecPrdNum_Sel ;
      AV80Recetadetinte90__wcds_11_tfrecprddsc = AV39TFRecPrdDsc ;
      AV81Recetadetinte90__wcds_12_tfrecprddsc_sel = AV40TFRecPrdDsc_Sel ;
      AV82Recetadetinte90__wcds_13_tffaccon = AV41TFFacCon ;
      AV83Recetadetinte90__wcds_14_tffaccon_to = AV42TFFacCon_To ;
      AV84Recetadetinte90__wcds_15_tfprdcant = AV43TFPrdCant ;
      AV85Recetadetinte90__wcds_16_tfprdcant_to = AV44TFPrdCant_To ;
      AV86Recetadetinte90__wcds_17_tfforprddsc = AV45TFForPrdDsc ;
      AV87Recetadetinte90__wcds_18_tfforprddsc_sel = AV46TFForPrdDsc_Sel ;
      AV88Recetadetinte90__wcds_19_tfrecfornro = AV47TFRecForNro ;
      AV89Recetadetinte90__wcds_20_tfrecfornro_to = AV48TFRecForNro_To ;
      AV90Recetadetinte90__wcds_21_tfrecprdtnq = AV49TFRecPrdTnq ;
      AV91Recetadetinte90__wcds_22_tfrecprdtnq_to = AV50TFRecPrdTnq_To ;
      AV92Recetadetinte90__wcds_23_tfreclote = AV51TFRecLote ;
      AV93Recetadetinte90__wcds_24_tfreclote_sel = AV52TFRecLote_Sel ;
      AV94Recetadetinte90__wcds_25_tfrecmanaut = AV62TFRecManAut ;
      AV95Recetadetinte90__wcds_26_tfrecmanaut_sel = AV63TFRecManAut_Sel ;
      GRID_nRecordCount = subgrid_fnc_recordcount( ) ;
      if ( ( GRID_nRecordCount >= subgrid_fnc_recordsperpage( ) ) && ( GRID_nEOF == 0 ) )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      if ( GRID_nEOF == 1 )
      {
         GRID_nFirstRecordOnPage = GRID_nCurrentRecord ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV6Barcod, AV7Barcodreo, AV8Barcodpar, AV9RecLinMaq, AV57RecLinpro, AV29TFRecLinPro, AV30TFRecLinPro_To, AV31TFProForCod, AV32TFProForCod_Sel, AV33TFProForDsc, AV34TFProForDsc_Sel, AV35TFRecLin, AV36TFRecLin_To, AV37TFRecPrdNum, AV38TFRecPrdNum_Sel, AV39TFRecPrdDsc, AV40TFRecPrdDsc_Sel, AV41TFFacCon, AV42TFFacCon_To, AV43TFPrdCant, AV44TFPrdCant_To, AV45TFForPrdDsc, AV46TFForPrdDsc_Sel, AV47TFRecForNro, AV48TFRecForNro_To, AV49TFRecPrdTnq, AV50TFRecPrdTnq_To, AV51TFRecLote, AV52TFRecLote_Sel, AV62TFRecManAut, AV63TFRecManAut_Sel, AV69Pgmname, AV18OrderedBy, AV19OrderedDsc, AV61UsurCod, AV59Station, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV70Recetadetinte90__wcds_1_tfreclinpro = AV29TFRecLinPro ;
      AV71Recetadetinte90__wcds_2_tfreclinpro_to = AV30TFRecLinPro_To ;
      AV72Recetadetinte90__wcds_3_tfproforcod = AV31TFProForCod ;
      AV73Recetadetinte90__wcds_4_tfproforcod_sel = AV32TFProForCod_Sel ;
      AV74Recetadetinte90__wcds_5_tfprofordsc = AV33TFProForDsc ;
      AV75Recetadetinte90__wcds_6_tfprofordsc_sel = AV34TFProForDsc_Sel ;
      AV76Recetadetinte90__wcds_7_tfreclin = AV35TFRecLin ;
      AV77Recetadetinte90__wcds_8_tfreclin_to = AV36TFRecLin_To ;
      AV78Recetadetinte90__wcds_9_tfrecprdnum = AV37TFRecPrdNum ;
      AV79Recetadetinte90__wcds_10_tfrecprdnum_sel = AV38TFRecPrdNum_Sel ;
      AV80Recetadetinte90__wcds_11_tfrecprddsc = AV39TFRecPrdDsc ;
      AV81Recetadetinte90__wcds_12_tfrecprddsc_sel = AV40TFRecPrdDsc_Sel ;
      AV82Recetadetinte90__wcds_13_tffaccon = AV41TFFacCon ;
      AV83Recetadetinte90__wcds_14_tffaccon_to = AV42TFFacCon_To ;
      AV84Recetadetinte90__wcds_15_tfprdcant = AV43TFPrdCant ;
      AV85Recetadetinte90__wcds_16_tfprdcant_to = AV44TFPrdCant_To ;
      AV86Recetadetinte90__wcds_17_tfforprddsc = AV45TFForPrdDsc ;
      AV87Recetadetinte90__wcds_18_tfforprddsc_sel = AV46TFForPrdDsc_Sel ;
      AV88Recetadetinte90__wcds_19_tfrecfornro = AV47TFRecForNro ;
      AV89Recetadetinte90__wcds_20_tfrecfornro_to = AV48TFRecForNro_To ;
      AV90Recetadetinte90__wcds_21_tfrecprdtnq = AV49TFRecPrdTnq ;
      AV91Recetadetinte90__wcds_22_tfrecprdtnq_to = AV50TFRecPrdTnq_To ;
      AV92Recetadetinte90__wcds_23_tfreclote = AV51TFRecLote ;
      AV93Recetadetinte90__wcds_24_tfreclote_sel = AV52TFRecLote_Sel ;
      AV94Recetadetinte90__wcds_25_tfrecmanaut = AV62TFRecManAut ;
      AV95Recetadetinte90__wcds_26_tfrecmanaut_sel = AV63TFRecManAut_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV6Barcod, AV7Barcodreo, AV8Barcodpar, AV9RecLinMaq, AV57RecLinpro, AV29TFRecLinPro, AV30TFRecLinPro_To, AV31TFProForCod, AV32TFProForCod_Sel, AV33TFProForDsc, AV34TFProForDsc_Sel, AV35TFRecLin, AV36TFRecLin_To, AV37TFRecPrdNum, AV38TFRecPrdNum_Sel, AV39TFRecPrdDsc, AV40TFRecPrdDsc_Sel, AV41TFFacCon, AV42TFFacCon_To, AV43TFPrdCant, AV44TFPrdCant_To, AV45TFForPrdDsc, AV46TFForPrdDsc_Sel, AV47TFRecForNro, AV48TFRecForNro_To, AV49TFRecPrdTnq, AV50TFRecPrdTnq_To, AV51TFRecLote, AV52TFRecLote_Sel, AV62TFRecManAut, AV63TFRecManAut_Sel, AV69Pgmname, AV18OrderedBy, AV19OrderedDsc, AV61UsurCod, AV59Station, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV70Recetadetinte90__wcds_1_tfreclinpro = AV29TFRecLinPro ;
      AV71Recetadetinte90__wcds_2_tfreclinpro_to = AV30TFRecLinPro_To ;
      AV72Recetadetinte90__wcds_3_tfproforcod = AV31TFProForCod ;
      AV73Recetadetinte90__wcds_4_tfproforcod_sel = AV32TFProForCod_Sel ;
      AV74Recetadetinte90__wcds_5_tfprofordsc = AV33TFProForDsc ;
      AV75Recetadetinte90__wcds_6_tfprofordsc_sel = AV34TFProForDsc_Sel ;
      AV76Recetadetinte90__wcds_7_tfreclin = AV35TFRecLin ;
      AV77Recetadetinte90__wcds_8_tfreclin_to = AV36TFRecLin_To ;
      AV78Recetadetinte90__wcds_9_tfrecprdnum = AV37TFRecPrdNum ;
      AV79Recetadetinte90__wcds_10_tfrecprdnum_sel = AV38TFRecPrdNum_Sel ;
      AV80Recetadetinte90__wcds_11_tfrecprddsc = AV39TFRecPrdDsc ;
      AV81Recetadetinte90__wcds_12_tfrecprddsc_sel = AV40TFRecPrdDsc_Sel ;
      AV82Recetadetinte90__wcds_13_tffaccon = AV41TFFacCon ;
      AV83Recetadetinte90__wcds_14_tffaccon_to = AV42TFFacCon_To ;
      AV84Recetadetinte90__wcds_15_tfprdcant = AV43TFPrdCant ;
      AV85Recetadetinte90__wcds_16_tfprdcant_to = AV44TFPrdCant_To ;
      AV86Recetadetinte90__wcds_17_tfforprddsc = AV45TFForPrdDsc ;
      AV87Recetadetinte90__wcds_18_tfforprddsc_sel = AV46TFForPrdDsc_Sel ;
      AV88Recetadetinte90__wcds_19_tfrecfornro = AV47TFRecForNro ;
      AV89Recetadetinte90__wcds_20_tfrecfornro_to = AV48TFRecForNro_To ;
      AV90Recetadetinte90__wcds_21_tfrecprdtnq = AV49TFRecPrdTnq ;
      AV91Recetadetinte90__wcds_22_tfrecprdtnq_to = AV50TFRecPrdTnq_To ;
      AV92Recetadetinte90__wcds_23_tfreclote = AV51TFRecLote ;
      AV93Recetadetinte90__wcds_24_tfreclote_sel = AV52TFRecLote_Sel ;
      AV94Recetadetinte90__wcds_25_tfrecmanaut = AV62TFRecManAut ;
      AV95Recetadetinte90__wcds_26_tfrecmanaut_sel = AV63TFRecManAut_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV6Barcod, AV7Barcodreo, AV8Barcodpar, AV9RecLinMaq, AV57RecLinpro, AV29TFRecLinPro, AV30TFRecLinPro_To, AV31TFProForCod, AV32TFProForCod_Sel, AV33TFProForDsc, AV34TFProForDsc_Sel, AV35TFRecLin, AV36TFRecLin_To, AV37TFRecPrdNum, AV38TFRecPrdNum_Sel, AV39TFRecPrdDsc, AV40TFRecPrdDsc_Sel, AV41TFFacCon, AV42TFFacCon_To, AV43TFPrdCant, AV44TFPrdCant_To, AV45TFForPrdDsc, AV46TFForPrdDsc_Sel, AV47TFRecForNro, AV48TFRecForNro_To, AV49TFRecPrdTnq, AV50TFRecPrdTnq_To, AV51TFRecLote, AV52TFRecLote_Sel, AV62TFRecManAut, AV63TFRecManAut_Sel, AV69Pgmname, AV18OrderedBy, AV19OrderedDsc, AV61UsurCod, AV59Station, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV70Recetadetinte90__wcds_1_tfreclinpro = AV29TFRecLinPro ;
      AV71Recetadetinte90__wcds_2_tfreclinpro_to = AV30TFRecLinPro_To ;
      AV72Recetadetinte90__wcds_3_tfproforcod = AV31TFProForCod ;
      AV73Recetadetinte90__wcds_4_tfproforcod_sel = AV32TFProForCod_Sel ;
      AV74Recetadetinte90__wcds_5_tfprofordsc = AV33TFProForDsc ;
      AV75Recetadetinte90__wcds_6_tfprofordsc_sel = AV34TFProForDsc_Sel ;
      AV76Recetadetinte90__wcds_7_tfreclin = AV35TFRecLin ;
      AV77Recetadetinte90__wcds_8_tfreclin_to = AV36TFRecLin_To ;
      AV78Recetadetinte90__wcds_9_tfrecprdnum = AV37TFRecPrdNum ;
      AV79Recetadetinte90__wcds_10_tfrecprdnum_sel = AV38TFRecPrdNum_Sel ;
      AV80Recetadetinte90__wcds_11_tfrecprddsc = AV39TFRecPrdDsc ;
      AV81Recetadetinte90__wcds_12_tfrecprddsc_sel = AV40TFRecPrdDsc_Sel ;
      AV82Recetadetinte90__wcds_13_tffaccon = AV41TFFacCon ;
      AV83Recetadetinte90__wcds_14_tffaccon_to = AV42TFFacCon_To ;
      AV84Recetadetinte90__wcds_15_tfprdcant = AV43TFPrdCant ;
      AV85Recetadetinte90__wcds_16_tfprdcant_to = AV44TFPrdCant_To ;
      AV86Recetadetinte90__wcds_17_tfforprddsc = AV45TFForPrdDsc ;
      AV87Recetadetinte90__wcds_18_tfforprddsc_sel = AV46TFForPrdDsc_Sel ;
      AV88Recetadetinte90__wcds_19_tfrecfornro = AV47TFRecForNro ;
      AV89Recetadetinte90__wcds_20_tfrecfornro_to = AV48TFRecForNro_To ;
      AV90Recetadetinte90__wcds_21_tfrecprdtnq = AV49TFRecPrdTnq ;
      AV91Recetadetinte90__wcds_22_tfrecprdtnq_to = AV50TFRecPrdTnq_To ;
      AV92Recetadetinte90__wcds_23_tfreclote = AV51TFRecLote ;
      AV93Recetadetinte90__wcds_24_tfreclote_sel = AV52TFRecLote_Sel ;
      AV94Recetadetinte90__wcds_25_tfrecmanaut = AV62TFRecManAut ;
      AV95Recetadetinte90__wcds_26_tfrecmanaut_sel = AV63TFRecManAut_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV6Barcod, AV7Barcodreo, AV8Barcodpar, AV9RecLinMaq, AV57RecLinpro, AV29TFRecLinPro, AV30TFRecLinPro_To, AV31TFProForCod, AV32TFProForCod_Sel, AV33TFProForDsc, AV34TFProForDsc_Sel, AV35TFRecLin, AV36TFRecLin_To, AV37TFRecPrdNum, AV38TFRecPrdNum_Sel, AV39TFRecPrdDsc, AV40TFRecPrdDsc_Sel, AV41TFFacCon, AV42TFFacCon_To, AV43TFPrdCant, AV44TFPrdCant_To, AV45TFForPrdDsc, AV46TFForPrdDsc_Sel, AV47TFRecForNro, AV48TFRecForNro_To, AV49TFRecPrdTnq, AV50TFRecPrdTnq_To, AV51TFRecLote, AV52TFRecLote_Sel, AV62TFRecManAut, AV63TFRecManAut_Sel, AV69Pgmname, AV18OrderedBy, AV19OrderedDsc, AV61UsurCod, AV59Station, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV69Pgmname = "RecetadeTinte90__WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69Pgmname", AV69Pgmname);
      Gx_err = (short)(0) ;
      edtavPrdrgb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrdrgb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdrgb_Enabled), 5, 0), !bGXsfl_20_Refreshing);
      edtavR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavR_Enabled), 5, 0), !bGXsfl_20_Refreshing);
      edtavG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavG_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavG_Enabled), 5, 0), !bGXsfl_20_Refreshing);
      edtavB_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavB_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavB_Enabled), 5, 0), !bGXsfl_20_Refreshing);
      edtavR2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavR2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavR2_Enabled), 5, 0), !bGXsfl_20_Refreshing);
      edtavG2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavG2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavG2_Enabled), 5, 0), !bGXsfl_20_Refreshing);
      edtavB2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavB2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavB2_Enabled), 5, 0), !bGXsfl_20_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup29F0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1429F2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV53DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_20 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_20"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV5Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV5Emprcod") ;
         wcpOAV6Barcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV6Barcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV7Barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV7Barcodreo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV8Barcodpar = httpContext.cgiGet( sPrefix+"wcpOAV8Barcodpar") ;
         wcpOAV9RecLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV9RecLinMaq"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV57RecLinpro = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV57RecLinpro"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV97Emprcod_selected = httpContext.cgiGet( sPrefix+"vEMPRCOD_SELECTED") ;
         AV98Barcod_selected = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vBARCOD_SELECTED"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV99Barcodreo_selected = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vBARCODREO_SELECTED"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV100Barcodpar_selected = httpContext.cgiGet( sPrefix+"vBARCODPAR_SELECTED") ;
         AV101Reclinmaq_selected = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vRECLINMAQ_SELECTED"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV102Reclinpro_selected = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vRECLINPRO_SELECTED"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
         Dvelop_confirmpanel_eliminar_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Title") ;
         Dvelop_confirmpanel_eliminar_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Confirmationtext") ;
         Dvelop_confirmpanel_eliminar_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_eliminar_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Confirmtype") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Infinitescrolling = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Infinitescrolling") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_get") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedcolumn") ;
         Dvelop_confirmpanel_eliminar_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Result") ;
         /* Read variables values. */
         AV69Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69Pgmname", AV69Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"RecetadeTinte90__WC");
         AV69Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69Pgmname", AV69Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV69Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("recetadetinte90__wc:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e1429F2 ();
      if (returnInSub) return;
   }

   public void e1429F2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV59Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      recetadetinte90__wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV59Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59Station", AV59Station);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTATION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV59Station, ""))));
      GXv_char2[0] = AV5Emprcod ;
      GXv_char3[0] = AV60EmprNom ;
      GXv_char4[0] = AV61UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV59Station, GXv_char2, GXv_char3, GXv_char4) ;
      recetadetinte90__wc_impl.this.AV5Emprcod = GXv_char2[0] ;
      recetadetinte90__wc_impl.this.AV60EmprNom = GXv_char3[0] ;
      recetadetinte90__wc_impl.this.AV61UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61UsurCod", AV61UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vUSURCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV61UsurCod, "@!"))));
      subGrid_Rows = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      if ( AV18OrderedBy < 1 )
      {
         AV18OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV53DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV53DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
   }

   public void e1529F2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext7[0] = AV12WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV12WWPContext = GXv_SdtWWPContext7[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      AV70Recetadetinte90__wcds_1_tfreclinpro = AV29TFRecLinPro ;
      AV71Recetadetinte90__wcds_2_tfreclinpro_to = AV30TFRecLinPro_To ;
      AV72Recetadetinte90__wcds_3_tfproforcod = AV31TFProForCod ;
      AV73Recetadetinte90__wcds_4_tfproforcod_sel = AV32TFProForCod_Sel ;
      AV74Recetadetinte90__wcds_5_tfprofordsc = AV33TFProForDsc ;
      AV75Recetadetinte90__wcds_6_tfprofordsc_sel = AV34TFProForDsc_Sel ;
      AV76Recetadetinte90__wcds_7_tfreclin = AV35TFRecLin ;
      AV77Recetadetinte90__wcds_8_tfreclin_to = AV36TFRecLin_To ;
      AV78Recetadetinte90__wcds_9_tfrecprdnum = AV37TFRecPrdNum ;
      AV79Recetadetinte90__wcds_10_tfrecprdnum_sel = AV38TFRecPrdNum_Sel ;
      AV80Recetadetinte90__wcds_11_tfrecprddsc = AV39TFRecPrdDsc ;
      AV81Recetadetinte90__wcds_12_tfrecprddsc_sel = AV40TFRecPrdDsc_Sel ;
      AV82Recetadetinte90__wcds_13_tffaccon = AV41TFFacCon ;
      AV83Recetadetinte90__wcds_14_tffaccon_to = AV42TFFacCon_To ;
      AV84Recetadetinte90__wcds_15_tfprdcant = AV43TFPrdCant ;
      AV85Recetadetinte90__wcds_16_tfprdcant_to = AV44TFPrdCant_To ;
      AV86Recetadetinte90__wcds_17_tfforprddsc = AV45TFForPrdDsc ;
      AV87Recetadetinte90__wcds_18_tfforprddsc_sel = AV46TFForPrdDsc_Sel ;
      AV88Recetadetinte90__wcds_19_tfrecfornro = AV47TFRecForNro ;
      AV89Recetadetinte90__wcds_20_tfrecfornro_to = AV48TFRecForNro_To ;
      AV90Recetadetinte90__wcds_21_tfrecprdtnq = AV49TFRecPrdTnq ;
      AV91Recetadetinte90__wcds_22_tfrecprdtnq_to = AV50TFRecPrdTnq_To ;
      AV92Recetadetinte90__wcds_23_tfreclote = AV51TFRecLote ;
      AV93Recetadetinte90__wcds_24_tfreclote_sel = AV52TFRecLote_Sel ;
      AV94Recetadetinte90__wcds_25_tfrecmanaut = AV62TFRecManAut ;
      AV95Recetadetinte90__wcds_26_tfrecmanaut_sel = AV63TFRecManAut_Sel ;
   }

   public void e1129F2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV18OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18OrderedBy), 4, 0));
         AV19OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19OrderedDsc", AV19OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecLinPro") == 0 )
         {
            AV29TFRecLinPro = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFRecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFRecLinPro), 2, 0));
            AV30TFRecLinPro_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFRecLinPro_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TFRecLinPro_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProForCod") == 0 )
         {
            AV31TFProForCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFProForCod", AV31TFProForCod);
            AV32TFProForCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFProForCod_Sel", AV32TFProForCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProForDsc") == 0 )
         {
            AV33TFProForDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFProForDsc", AV33TFProForDsc);
            AV34TFProForDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFProForDsc_Sel", AV34TFProForDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecLin") == 0 )
         {
            AV35TFRecLin = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFRecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFRecLin), 4, 0));
            AV36TFRecLin_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFRecLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFRecLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecPrdNum") == 0 )
         {
            AV37TFRecPrdNum = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFRecPrdNum", AV37TFRecPrdNum);
            AV38TFRecPrdNum_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFRecPrdNum_Sel", AV38TFRecPrdNum_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecPrdDsc") == 0 )
         {
            AV39TFRecPrdDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFRecPrdDsc", AV39TFRecPrdDsc);
            AV40TFRecPrdDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFRecPrdDsc_Sel", AV40TFRecPrdDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FacCon") == 0 )
         {
            AV41TFFacCon = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFFacCon", GXutil.ltrimstr( AV41TFFacCon, 11, 5));
            AV42TFFacCon_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFFacCon_To", GXutil.ltrimstr( AV42TFFacCon_To, 11, 5));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdCant") == 0 )
         {
            AV43TFPrdCant = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFPrdCant", GXutil.ltrimstr( AV43TFPrdCant, 11, 3));
            AV44TFPrdCant_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFPrdCant_To", GXutil.ltrimstr( AV44TFPrdCant_To, 11, 3));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForPrdDsc") == 0 )
         {
            AV45TFForPrdDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFForPrdDsc", AV45TFForPrdDsc);
            AV46TFForPrdDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFForPrdDsc_Sel", AV46TFForPrdDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecForNro") == 0 )
         {
            AV47TFRecForNro = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFRecForNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFRecForNro), 2, 0));
            AV48TFRecForNro_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFRecForNro_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFRecForNro_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecPrdTnq") == 0 )
         {
            AV49TFRecPrdTnq = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFRecPrdTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFRecPrdTnq), 2, 0));
            AV50TFRecPrdTnq_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFRecPrdTnq_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50TFRecPrdTnq_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecLote") == 0 )
         {
            AV51TFRecLote = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFRecLote", AV51TFRecLote);
            AV52TFRecLote_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFRecLote_Sel", AV52TFRecLote_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecManAut") == 0 )
         {
            AV62TFRecManAut = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFRecManAut", AV62TFRecManAut);
            AV63TFRecManAut_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFRecManAut_Sel", AV63TFRecManAut_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e1629F2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGridactiongroup1.removeAllItems();
      cmbavGridactiongroup1.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGridactiongroup1.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "Eliminar", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      AV64Selected = false ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSelected.getInternalname(), AV64Selected);
      AV21PrdRGB = ((A13232PrdRGB==0) ? 16777215 : A13232PrdRGB) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPrdrgb_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21PrdRGB), 10, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPRDRGB"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(AV21PrdRGB), "ZZZZZZZZZ9")));
      GXv_int8[0] = AV22R ;
      GXv_int9[0] = AV23G ;
      GXv_int10[0] = AV24B ;
      GXv_int11[0] = AV25R2 ;
      GXv_int12[0] = AV26G2 ;
      GXv_int13[0] = AV27B2 ;
      new app.backcolorforecolor(remoteHandle, context).execute( AV21PrdRGB, GXv_int8, GXv_int9, GXv_int10, GXv_int11, GXv_int12, GXv_int13) ;
      recetadetinte90__wc_impl.this.AV22R = GXv_int8[0] ;
      recetadetinte90__wc_impl.this.AV23G = GXv_int9[0] ;
      recetadetinte90__wc_impl.this.AV24B = GXv_int10[0] ;
      recetadetinte90__wc_impl.this.AV25R2 = GXv_int11[0] ;
      recetadetinte90__wc_impl.this.AV26G2 = GXv_int12[0] ;
      recetadetinte90__wc_impl.this.AV27B2 = GXv_int13[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavR_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22R), 3, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vR"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(AV22R), "ZZ9")));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavG_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23G), 3, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vG"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(AV23G), "ZZ9")));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavB_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24B), 3, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vB"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(AV24B), "ZZ9")));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavR2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25R2), 3, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vR2"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(AV25R2), "ZZ9")));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavG2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26G2), 3, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vG2"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(AV26G2), "ZZ9")));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavB2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27B2), 3, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vB2"+"_"+sGXsfl_20_idx, getSecureSignedToken( sPrefix+sGXsfl_20_idx, localUtil.format( DecimalUtil.doubleToDec(AV27B2), "ZZ9")));
      edtRecPrdDsc_Backcolor = GXutil.getColor( AV22R, AV23G, AV24B) ;
      edtRecPrdDsc_Forecolor = GXutil.getColor( AV25R2, AV26G2, AV27B2) ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(20) ;
      }
      sendrow_202( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_20_Refreshing )
      {
         httpContext.doAjaxLoad(20, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV58GridActionGroup1, 4, 0)) );
   }

   public void e1229F2( )
   {
      /* Dvelop_confirmpanel_eliminar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_eliminar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMINAR' */
         S162 ();
         if (returnInSub) return;
      }
   }

   public void e1329F2( )
   {
      /* 'DoUserAction1' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADSELECTEDROWS' */
      S172 ();
      if (returnInSub) return;
      if ( AV65SelectedRows.size() == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_NoRecordSelected", ""));
      }
      if ( AV65SelectedRows.size() > 0 )
      {
         AV96GXV1 = 1 ;
         while ( AV96GXV1 <= AV65SelectedRows.size() )
         {
            AV66SelectedRow = (app.SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem)((app.SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem)AV65SelectedRows.elementAt(-1+AV96GXV1));
            new app.recetatinte92__prc(remoteHandle, context).execute( AV66SelectedRow.getgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Emprcod(), AV66SelectedRow.getgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Barcod(), AV66SelectedRow.getgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Barcodreo(), AV66SelectedRow.getgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Barcodpar(), AV66SelectedRow.getgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Reclinmaq(), AV66SelectedRow.getgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Reclinpro(), AV66SelectedRow.getgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Reclin(), AV61UsurCod, AV59Station) ;
            AV96GXV1 = (int)(AV96GXV1+1) ;
         }
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV65SelectedRows", AV65SelectedRows);
   }

   public void S132( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV18OrderedBy, 4, 0))+":"+(AV19OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S152( )
   {
      /* 'DO ELIMINAR' Routine */
      returnInSub = false ;
      Dvelop_confirmpanel_eliminar_Confirmationtext = httpContext.getMessage( "Deseas eliminar la linea ", "")+GXutil.trim( GXutil.str( A811RecLin, 4, 0))+" ?" ;
      ucDvelop_confirmpanel_eliminar.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_eliminar_Internalname, "ConfirmationText", Dvelop_confirmpanel_eliminar_Confirmationtext);
      AV97Emprcod_selected = A396EmprCod ;
      AV98Barcod_selected = A129BarCod ;
      AV99Barcodreo_selected = A132BarCodReo ;
      AV100Barcodpar_selected = A130BarCodPar ;
      AV101Reclinmaq_selected = A2804RecLinMaq ;
      AV102Reclinpro_selected = A1273RecLinPro ;
      this.executeUsercontrolMethod(sPrefix, false, "DVELOP_CONFIRMPANEL_ELIMINARContainer", "Confirm", "", new Object[] {});
   }

   public void S162( )
   {
      /* 'DO ACTION ELIMINAR' Routine */
      returnInSub = false ;
      new app.recetatinte92__prc(remoteHandle, context).execute( AV5Emprcod, AV6Barcod, AV7Barcodreo, AV8Barcodpar, AV9RecLinMaq, AV57RecLinpro, A811RecLin, AV61UsurCod, AV59Station) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S172( )
   {
      /* 'LOADSELECTEDROWS' Routine */
      returnInSub = false ;
      AV65SelectedRows = new GXBaseCollection<app.SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem>(app.SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem.class, "RecetadeTinte90__WCSDTItem", "TexplusNET", remoteHandle) ;
      /* Start For Each Line */
      nRC_GXsfl_20 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_20"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      nGXsfl_20_fel_idx = 0 ;
      while ( nGXsfl_20_fel_idx < nRC_GXsfl_20 )
      {
         nGXsfl_20_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_20_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_20_fel_idx+1) ;
         sGXsfl_20_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_20_fel_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_fel_202( ) ;
         AV64Selected = GXutil.strtobool( httpContext.cgiGet( chkavSelected.getInternalname())) ;
         cmbavGridactiongroup1.setName( cmbavGridactiongroup1.getInternalname() );
         cmbavGridactiongroup1.setValue( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()) );
         AV58GridActionGroup1 = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()))) ;
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
         A2804RecLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( edtRecLinMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A1273RecLinPro = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecLinPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A764ProForCod = httpContext.cgiGet( edtProForCod_Internalname) ;
         A766ProForDsc = httpContext.cgiGet( edtProForDsc_Internalname) ;
         A811RecLin = (short)(localUtil.ctol( httpContext.cgiGet( edtRecLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A872RecPrdNum = httpContext.cgiGet( edtRecPrdNum_Internalname) ;
         A875RecPrdDsc = httpContext.cgiGet( edtRecPrdDsc_Internalname) ;
         A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
         n719PrdNum = false ;
         A490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( edtForPrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n490ForPrdUMe = false ;
         A431FacCon = localUtil.ctond( httpContext.cgiGet( edtFacCon_Internalname)) ;
         A686PrdCant = localUtil.ctond( httpContext.cgiGet( edtPrdCant_Internalname)) ;
         A488ForPrdDsc = httpContext.cgiGet( edtForPrdDsc_Internalname) ;
         n488ForPrdDsc = false ;
         A2394RecForNro = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecForNro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A3274RecPrdTnq = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecPrdTnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A5725RecLote = httpContext.cgiGet( edtRecLote_Internalname) ;
         A14055RecManAut = httpContext.cgiGet( edtRecManAut_Internalname) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavPrdrgb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavPrdrgb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPRDRGB");
            GX_FocusControl = edtavPrdrgb_Internalname ;
            wbErr = true ;
            AV21PrdRGB = 0 ;
         }
         else
         {
            AV21PrdRGB = localUtil.ctol( httpContext.cgiGet( edtavPrdrgb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vR");
            GX_FocusControl = edtavR_Internalname ;
            wbErr = true ;
            AV22R = (short)(0) ;
         }
         else
         {
            AV22R = (short)(localUtil.ctol( httpContext.cgiGet( edtavR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavG_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavG_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vG");
            GX_FocusControl = edtavG_Internalname ;
            wbErr = true ;
            AV23G = (short)(0) ;
         }
         else
         {
            AV23G = (short)(localUtil.ctol( httpContext.cgiGet( edtavG_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vB");
            GX_FocusControl = edtavB_Internalname ;
            wbErr = true ;
            AV24B = (short)(0) ;
         }
         else
         {
            AV24B = (short)(localUtil.ctol( httpContext.cgiGet( edtavB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavR2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavR2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vR2");
            GX_FocusControl = edtavR2_Internalname ;
            wbErr = true ;
            AV25R2 = (short)(0) ;
         }
         else
         {
            AV25R2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavR2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavG2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavG2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vG2");
            GX_FocusControl = edtavG2_Internalname ;
            wbErr = true ;
            AV26G2 = (short)(0) ;
         }
         else
         {
            AV26G2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavG2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavB2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavB2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vB2");
            GX_FocusControl = edtavB2_Internalname ;
            wbErr = true ;
            AV27B2 = (short)(0) ;
         }
         else
         {
            AV27B2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavB2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         }
         A6018ProForFab = httpContext.cgiGet( edtProForFab_Internalname) ;
         n6018ProForFab = false ;
         A4024RecMar = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecMar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         if ( AV64Selected )
         {
            AV66SelectedRow = (app.SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem)new app.SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem(remoteHandle, context);
            AV66SelectedRow.setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Emprcod( A396EmprCod );
            AV66SelectedRow.setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Barcod( A129BarCod );
            AV66SelectedRow.setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Barcodreo( A132BarCodReo );
            AV66SelectedRow.setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Barcodpar( A130BarCodPar );
            AV66SelectedRow.setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Reclinmaq( A2804RecLinMaq );
            AV66SelectedRow.setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Reclinpro( A1273RecLinPro );
            AV66SelectedRow.setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Proforcod( A764ProForCod );
            AV66SelectedRow.setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Profordsc( A766ProForDsc );
            AV66SelectedRow.setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Reclin( A811RecLin );
            AV66SelectedRow.setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Recprdnum( A872RecPrdNum );
            AV66SelectedRow.setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Recprddsc( A875RecPrdDsc );
            AV66SelectedRow.setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Prdnum( A719PrdNum );
            AV66SelectedRow.setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Forprdume( A490ForPrdUMe );
            AV66SelectedRow.setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Faccon( A431FacCon );
            AV66SelectedRow.setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Prdcant( A686PrdCant );
            AV66SelectedRow.setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Forprddsc( A488ForPrdDsc );
            AV66SelectedRow.setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Recfornro( A2394RecForNro );
            AV66SelectedRow.setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Recprdtnq( A3274RecPrdTnq );
            AV66SelectedRow.setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Reclote( A5725RecLote );
            AV66SelectedRow.setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Recmanaut( A14055RecManAut );
            AV66SelectedRow.setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Prdrgb( AV21PrdRGB );
            AV66SelectedRow.setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_R( AV22R );
            AV66SelectedRow.setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_G( AV23G );
            AV66SelectedRow.setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_B( AV24B );
            AV66SelectedRow.setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_R2( AV25R2 );
            AV66SelectedRow.setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_G2( AV26G2 );
            AV66SelectedRow.setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_B2( AV27B2 );
            AV66SelectedRow.setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Proforfab( A6018ProForFab );
            AV66SelectedRow.setgxTv_SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem_Recmar( A4024RecMar );
            AV65SelectedRows.add(AV66SelectedRow, 0);
         }
         /* End For Each Line */
      }
      if ( nGXsfl_20_fel_idx == 0 )
      {
         nGXsfl_20_idx = 1 ;
         sGXsfl_20_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_20_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_202( ) ;
      }
      nGXsfl_20_fel_idx = 1 ;
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV28Session.getValue(AV69Pgmname+"GridState"), "") == 0 )
      {
         AV16GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV69Pgmname+"GridState"), null, null);
      }
      else
      {
         AV16GridState.fromxml(AV28Session.getValue(AV69Pgmname+"GridState"), null, null);
      }
      AV18OrderedBy = AV16GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18OrderedBy), 4, 0));
      AV19OrderedDsc = AV16GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19OrderedDsc", AV19OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S132 ();
      if (returnInSub) return;
      AV104GXV2 = 1 ;
      while ( AV104GXV2 <= AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV104GXV2));
         if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLINPRO") == 0 )
         {
            AV29TFRecLinPro = (byte)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFRecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFRecLinPro), 2, 0));
            AV30TFRecLinPro_To = (byte)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFRecLinPro_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TFRecLinPro_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORCOD") == 0 )
         {
            AV31TFProForCod = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFProForCod", AV31TFProForCod);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORCOD_SEL") == 0 )
         {
            AV32TFProForCod_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFProForCod_Sel", AV32TFProForCod_Sel);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORDSC") == 0 )
         {
            AV33TFProForDsc = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFProForDsc", AV33TFProForDsc);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORDSC_SEL") == 0 )
         {
            AV34TFProForDsc_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFProForDsc_Sel", AV34TFProForDsc_Sel);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLIN") == 0 )
         {
            AV35TFRecLin = (short)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFRecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFRecLin), 4, 0));
            AV36TFRecLin_To = (short)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFRecLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFRecLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDNUM") == 0 )
         {
            AV37TFRecPrdNum = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFRecPrdNum", AV37TFRecPrdNum);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDNUM_SEL") == 0 )
         {
            AV38TFRecPrdNum_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFRecPrdNum_Sel", AV38TFRecPrdNum_Sel);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDDSC") == 0 )
         {
            AV39TFRecPrdDsc = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFRecPrdDsc", AV39TFRecPrdDsc);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDDSC_SEL") == 0 )
         {
            AV40TFRecPrdDsc_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFRecPrdDsc_Sel", AV40TFRecPrdDsc_Sel);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACCON") == 0 )
         {
            AV41TFFacCon = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFFacCon", GXutil.ltrimstr( AV41TFFacCon, 11, 5));
            AV42TFFacCon_To = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFFacCon_To", GXutil.ltrimstr( AV42TFFacCon_To, 11, 5));
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCANT") == 0 )
         {
            AV43TFPrdCant = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFPrdCant", GXutil.ltrimstr( AV43TFPrdCant, 11, 3));
            AV44TFPrdCant_To = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFPrdCant_To", GXutil.ltrimstr( AV44TFPrdCant_To, 11, 3));
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC") == 0 )
         {
            AV45TFForPrdDsc = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFForPrdDsc", AV45TFForPrdDsc);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC_SEL") == 0 )
         {
            AV46TFForPrdDsc_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFForPrdDsc_Sel", AV46TFForPrdDsc_Sel);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECFORNRO") == 0 )
         {
            AV47TFRecForNro = (byte)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFRecForNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFRecForNro), 2, 0));
            AV48TFRecForNro_To = (byte)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFRecForNro_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFRecForNro_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDTNQ") == 0 )
         {
            AV49TFRecPrdTnq = (byte)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFRecPrdTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFRecPrdTnq), 2, 0));
            AV50TFRecPrdTnq_To = (byte)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFRecPrdTnq_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50TFRecPrdTnq_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLOTE") == 0 )
         {
            AV51TFRecLote = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFRecLote", AV51TFRecLote);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLOTE_SEL") == 0 )
         {
            AV52TFRecLote_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFRecLote_Sel", AV52TFRecLote_Sel);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECMANAUT") == 0 )
         {
            AV62TFRecManAut = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFRecManAut", AV62TFRecManAut);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECMANAUT_SEL") == 0 )
         {
            AV63TFRecManAut_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFRecManAut_Sel", AV63TFRecManAut_Sel);
         }
         AV104GXV2 = (int)(AV104GXV2+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV32TFProForCod_Sel)==0), AV32TFProForCod_Sel, GXv_char4) ;
      recetadetinte90__wc_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char14 = "" ;
      GXv_char3[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV34TFProForDsc_Sel)==0), AV34TFProForDsc_Sel, GXv_char3) ;
      recetadetinte90__wc_impl.this.GXt_char14 = GXv_char3[0] ;
      GXt_char15 = "" ;
      GXv_char2[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV38TFRecPrdNum_Sel)==0), AV38TFRecPrdNum_Sel, GXv_char2) ;
      recetadetinte90__wc_impl.this.GXt_char15 = GXv_char2[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV40TFRecPrdDsc_Sel)==0), AV40TFRecPrdDsc_Sel, GXv_char17) ;
      recetadetinte90__wc_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV46TFForPrdDsc_Sel)==0), AV46TFForPrdDsc_Sel, GXv_char19) ;
      recetadetinte90__wc_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV52TFRecLote_Sel)==0), AV52TFRecLote_Sel, GXv_char21) ;
      recetadetinte90__wc_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV63TFRecManAut_Sel)==0), AV63TFRecManAut_Sel, GXv_char23) ;
      recetadetinte90__wc_impl.this.GXt_char22 = GXv_char23[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"|"+GXt_char14+"||"+GXt_char15+"|"+GXt_char16+"|||"+GXt_char18+"|||"+GXt_char20+"|"+GXt_char22 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV31TFProForCod)==0), AV31TFProForCod, GXv_char23) ;
      recetadetinte90__wc_impl.this.GXt_char22 = GXv_char23[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV33TFProForDsc)==0), AV33TFProForDsc, GXv_char21) ;
      recetadetinte90__wc_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV37TFRecPrdNum)==0), AV37TFRecPrdNum, GXv_char19) ;
      recetadetinte90__wc_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV39TFRecPrdDsc)==0), AV39TFRecPrdDsc, GXv_char17) ;
      recetadetinte90__wc_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char15 = "" ;
      GXv_char4[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV45TFForPrdDsc)==0), AV45TFForPrdDsc, GXv_char4) ;
      recetadetinte90__wc_impl.this.GXt_char15 = GXv_char4[0] ;
      GXt_char14 = "" ;
      GXv_char3[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV51TFRecLote)==0), AV51TFRecLote, GXv_char3) ;
      recetadetinte90__wc_impl.this.GXt_char14 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV62TFRecManAut)==0), AV62TFRecManAut, GXv_char2) ;
      recetadetinte90__wc_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV29TFRecLinPro) ? "" : GXutil.str( AV29TFRecLinPro, 2, 0))+"|"+GXt_char22+"|"+GXt_char20+"|"+((0==AV35TFRecLin) ? "" : GXutil.str( AV35TFRecLin, 4, 0))+"|"+GXt_char18+"|"+GXt_char16+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFFacCon)==0) ? "" : GXutil.str( AV41TFFacCon, 11, 5))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV43TFPrdCant)==0) ? "" : GXutil.str( AV43TFPrdCant, 11, 3))+"|"+GXt_char15+"|"+((0==AV47TFRecForNro) ? "" : GXutil.str( AV47TFRecForNro, 2, 0))+"|"+((0==AV49TFRecPrdTnq) ? "" : GXutil.str( AV49TFRecPrdTnq, 2, 0))+"|"+GXt_char14+"|"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV30TFRecLinPro_To) ? "" : GXutil.str( AV30TFRecLinPro_To, 2, 0))+"|||"+((0==AV36TFRecLin_To) ? "" : GXutil.str( AV36TFRecLin_To, 4, 0))+"|||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFFacCon_To)==0) ? "" : GXutil.str( AV42TFFacCon_To, 11, 5))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV44TFPrdCant_To)==0) ? "" : GXutil.str( AV44TFPrdCant_To, 11, 3))+"||"+((0==AV48TFRecForNro_To) ? "" : GXutil.str( AV48TFRecForNro_To, 2, 0))+"|"+((0==AV50TFRecPrdTnq_To) ? "" : GXutil.str( AV50TFRecPrdTnq_To, 2, 0))+"||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S142( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV16GridState.fromxml(AV28Session.getValue(AV69Pgmname+"GridState"), null, null);
      AV16GridState.setgxTv_SdtWWPGridState_Orderedby( AV18OrderedBy );
      AV16GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV19OrderedDsc );
      AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState24[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFRECLINPRO", "", !((0==AV29TFRecLinPro)&&(0==AV30TFRecLinPro_To)), (short)(0), GXutil.trim( GXutil.str( AV29TFRecLinPro, 2, 0)), GXutil.trim( GXutil.str( AV30TFRecLinPro_To, 2, 0))) ;
      AV16GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFPROFORCOD", "", !(GXutil.strcmp("", AV31TFProForCod)==0), (short)(0), AV31TFProForCod, "", !(GXutil.strcmp("", AV32TFProForCod_Sel)==0), AV32TFProForCod_Sel, "") ;
      AV16GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFPROFORDSC", "", !(GXutil.strcmp("", AV33TFProForDsc)==0), (short)(0), AV33TFProForDsc, "", !(GXutil.strcmp("", AV34TFProForDsc_Sel)==0), AV34TFProForDsc_Sel, "") ;
      AV16GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFRECLIN", "", !((0==AV35TFRecLin)&&(0==AV36TFRecLin_To)), (short)(0), GXutil.trim( GXutil.str( AV35TFRecLin, 4, 0)), GXutil.trim( GXutil.str( AV36TFRecLin_To, 4, 0))) ;
      AV16GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFRECPRDNUM", "", !(GXutil.strcmp("", AV37TFRecPrdNum)==0), (short)(0), AV37TFRecPrdNum, "", !(GXutil.strcmp("", AV38TFRecPrdNum_Sel)==0), AV38TFRecPrdNum_Sel, "") ;
      AV16GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFRECPRDDSC", "", !(GXutil.strcmp("", AV39TFRecPrdDsc)==0), (short)(0), AV39TFRecPrdDsc, "", !(GXutil.strcmp("", AV40TFRecPrdDsc_Sel)==0), AV40TFRecPrdDsc_Sel, "") ;
      AV16GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFFACCON", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFFacCon)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFFacCon_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV41TFFacCon, 11, 5)), GXutil.trim( GXutil.str( AV42TFFacCon_To, 11, 5))) ;
      AV16GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFPRDCANT", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV43TFPrdCant)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV44TFPrdCant_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV43TFPrdCant, 11, 3)), GXutil.trim( GXutil.str( AV44TFPrdCant_To, 11, 3))) ;
      AV16GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFFORPRDDSC", "", !(GXutil.strcmp("", AV45TFForPrdDsc)==0), (short)(0), AV45TFForPrdDsc, "", !(GXutil.strcmp("", AV46TFForPrdDsc_Sel)==0), AV46TFForPrdDsc_Sel, "") ;
      AV16GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFRECFORNRO", "", !((0==AV47TFRecForNro)&&(0==AV48TFRecForNro_To)), (short)(0), GXutil.trim( GXutil.str( AV47TFRecForNro, 2, 0)), GXutil.trim( GXutil.str( AV48TFRecForNro_To, 2, 0))) ;
      AV16GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFRECPRDTNQ", "", !((0==AV49TFRecPrdTnq)&&(0==AV50TFRecPrdTnq_To)), (short)(0), GXutil.trim( GXutil.str( AV49TFRecPrdTnq, 2, 0)), GXutil.trim( GXutil.str( AV50TFRecPrdTnq_To, 2, 0))) ;
      AV16GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFRECLOTE", "", !(GXutil.strcmp("", AV51TFRecLote)==0), (short)(0), AV51TFRecLote, "", !(GXutil.strcmp("", AV52TFRecLote_Sel)==0), AV52TFRecLote_Sel, "") ;
      AV16GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFRECMANAUT", "", !(GXutil.strcmp("", AV62TFRecManAut)==0), (short)(0), AV62TFRecManAut, "", !(GXutil.strcmp("", AV63TFRecManAut_Sel)==0), AV63TFRecManAut_Sel, "") ;
      AV16GridState = GXv_SdtWWPGridState24[0] ;
      if ( ! (GXutil.strcmp("", AV5Emprcod)==0) )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV5Emprcod );
         AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV17GridStateFilterValue, 0);
      }
      if ( ! (0==AV6Barcod) )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOD" );
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV6Barcod, 8, 0) );
         AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV17GridStateFilterValue, 0);
      }
      if ( ! (0==AV7Barcodreo) )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODREO" );
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV7Barcodreo, 1, 0) );
         AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV17GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV8Barcodpar)==0) )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODPAR" );
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV8Barcodpar );
         AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV17GridStateFilterValue, 0);
      }
      if ( ! (0==AV9RecLinMaq) )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&RECLINMAQ" );
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV9RecLinMaq, 4, 0) );
         AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV17GridStateFilterValue, 0);
      }
      if ( ! (0==AV57RecLinpro) )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&RECLINPRO" );
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV57RecLinpro, 2, 0) );
         AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV17GridStateFilterValue, 0);
      }
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV69Pgmname+"GridState", AV16GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV14TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV14TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV69Pgmname );
      AV14TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV14TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV13HTTPRequest.getScriptName()+"?"+AV13HTTPRequest.getQuerystring() );
      AV14TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "MantenimientoProductosReceta_TRN" );
      AV28Session.setValue("TrnContext", AV14TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_63_29F2( boolean wbgen )
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
         wb_table1_63_29F2e( true) ;
      }
      else
      {
         wb_table1_63_29F2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV5Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
      AV6Barcod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Barcod), 8, 0));
      AV7Barcodreo = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Barcodreo", GXutil.str( AV7Barcodreo, 1, 0));
      AV8Barcodpar = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Barcodpar", AV8Barcodpar);
      AV9RecLinMaq = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9RecLinMaq), 4, 0));
      AV57RecLinpro = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57RecLinpro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57RecLinpro), 2, 0));
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
      pa29F2( ) ;
      ws29F2( ) ;
      we29F2( ) ;
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
      sCtrlAV6Barcod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV7Barcodreo = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV8Barcodpar = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV9RecLinMaq = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV57RecLinpro = (String)getParm(obj,5,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa29F2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "recetadetinte90__wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa29F2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV5Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
         AV6Barcod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Barcod), 8, 0));
         AV7Barcodreo = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Barcodreo", GXutil.str( AV7Barcodreo, 1, 0));
         AV8Barcodpar = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Barcodpar", AV8Barcodpar);
         AV9RecLinMaq = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9RecLinMaq), 4, 0));
         AV57RecLinpro = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57RecLinpro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57RecLinpro), 2, 0));
      }
      wcpOAV5Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV5Emprcod") ;
      wcpOAV6Barcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV6Barcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV7Barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV7Barcodreo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV8Barcodpar = httpContext.cgiGet( sPrefix+"wcpOAV8Barcodpar") ;
      wcpOAV9RecLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV9RecLinMaq"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV57RecLinpro = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV57RecLinpro"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV5Emprcod, wcpOAV5Emprcod) != 0 ) || ( AV6Barcod != wcpOAV6Barcod ) || ( AV7Barcodreo != wcpOAV7Barcodreo ) || ( GXutil.strcmp(AV8Barcodpar, wcpOAV8Barcodpar) != 0 ) || ( AV9RecLinMaq != wcpOAV9RecLinMaq ) || ( AV57RecLinpro != wcpOAV57RecLinpro ) ) )
      {
         setjustcreated();
      }
      wcpOAV5Emprcod = AV5Emprcod ;
      wcpOAV6Barcod = AV6Barcod ;
      wcpOAV7Barcodreo = AV7Barcodreo ;
      wcpOAV8Barcodpar = AV8Barcodpar ;
      wcpOAV9RecLinMaq = AV9RecLinMaq ;
      wcpOAV57RecLinpro = AV57RecLinpro ;
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
      sCtrlAV6Barcod = httpContext.cgiGet( sPrefix+"AV6Barcod_CTRL") ;
      if ( GXutil.len( sCtrlAV6Barcod) > 0 )
      {
         AV6Barcod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV6Barcod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Barcod), 8, 0));
      }
      else
      {
         AV6Barcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV6Barcod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV7Barcodreo = httpContext.cgiGet( sPrefix+"AV7Barcodreo_CTRL") ;
      if ( GXutil.len( sCtrlAV7Barcodreo) > 0 )
      {
         AV7Barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV7Barcodreo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Barcodreo", GXutil.str( AV7Barcodreo, 1, 0));
      }
      else
      {
         AV7Barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV7Barcodreo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV8Barcodpar = httpContext.cgiGet( sPrefix+"AV8Barcodpar_CTRL") ;
      if ( GXutil.len( sCtrlAV8Barcodpar) > 0 )
      {
         AV8Barcodpar = httpContext.cgiGet( sCtrlAV8Barcodpar) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Barcodpar", AV8Barcodpar);
      }
      else
      {
         AV8Barcodpar = httpContext.cgiGet( sPrefix+"AV8Barcodpar_PARM") ;
      }
      sCtrlAV9RecLinMaq = httpContext.cgiGet( sPrefix+"AV9RecLinMaq_CTRL") ;
      if ( GXutil.len( sCtrlAV9RecLinMaq) > 0 )
      {
         AV9RecLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV9RecLinMaq), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9RecLinMaq), 4, 0));
      }
      else
      {
         AV9RecLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV9RecLinMaq_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV57RecLinpro = httpContext.cgiGet( sPrefix+"AV57RecLinpro_CTRL") ;
      if ( GXutil.len( sCtrlAV57RecLinpro) > 0 )
      {
         AV57RecLinpro = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV57RecLinpro), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57RecLinpro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57RecLinpro), 2, 0));
      }
      else
      {
         AV57RecLinpro = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV57RecLinpro_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa29F2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws29F2( ) ;
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
      ws29F2( ) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6Barcod_PARM", GXutil.ltrim( localUtil.ntoc( AV6Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV6Barcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6Barcod_CTRL", GXutil.rtrim( sCtrlAV6Barcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7Barcodreo_PARM", GXutil.ltrim( localUtil.ntoc( AV7Barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7Barcodreo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7Barcodreo_CTRL", GXutil.rtrim( sCtrlAV7Barcodreo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8Barcodpar_PARM", GXutil.rtrim( AV8Barcodpar));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV8Barcodpar)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8Barcodpar_CTRL", GXutil.rtrim( sCtrlAV8Barcodpar));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9RecLinMaq_PARM", GXutil.ltrim( localUtil.ntoc( AV9RecLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV9RecLinMaq)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9RecLinMaq_CTRL", GXutil.rtrim( sCtrlAV9RecLinMaq));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV57RecLinpro_PARM", GXutil.ltrim( localUtil.ntoc( AV57RecLinpro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV57RecLinpro)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV57RecLinpro_CTRL", GXutil.rtrim( sCtrlAV57RecLinpro));
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
      we29F2( ) ;
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
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211692272", true, true);
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
      httpContext.AddJavascriptSource("messages."+httpContext.getLanguageProperty( "code")+".js", "?"+httpContext.getCacheInvalidationToken( ), false, true);
      httpContext.AddJavascriptSource("recetadetinte90__wc.js", "?20268211692273", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_202( )
   {
      chkavSelected.setInternalname( sPrefix+"vSELECTED_"+sGXsfl_20_idx );
      cmbavGridactiongroup1.setInternalname( sPrefix+"vGRIDACTIONGROUP1_"+sGXsfl_20_idx );
      edtEmprCod_Internalname = sPrefix+"EMPRCOD_"+sGXsfl_20_idx ;
      edtBarCod_Internalname = sPrefix+"BARCOD_"+sGXsfl_20_idx ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO_"+sGXsfl_20_idx ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR_"+sGXsfl_20_idx ;
      edtRecLinMaq_Internalname = sPrefix+"RECLINMAQ_"+sGXsfl_20_idx ;
      edtRecLinPro_Internalname = sPrefix+"RECLINPRO_"+sGXsfl_20_idx ;
      edtProForCod_Internalname = sPrefix+"PROFORCOD_"+sGXsfl_20_idx ;
      edtProForDsc_Internalname = sPrefix+"PROFORDSC_"+sGXsfl_20_idx ;
      edtRecLin_Internalname = sPrefix+"RECLIN_"+sGXsfl_20_idx ;
      edtRecPrdNum_Internalname = sPrefix+"RECPRDNUM_"+sGXsfl_20_idx ;
      edtRecPrdDsc_Internalname = sPrefix+"RECPRDDSC_"+sGXsfl_20_idx ;
      edtPrdNum_Internalname = sPrefix+"PRDNUM_"+sGXsfl_20_idx ;
      edtForPrdUMe_Internalname = sPrefix+"FORPRDUME_"+sGXsfl_20_idx ;
      edtFacCon_Internalname = sPrefix+"FACCON_"+sGXsfl_20_idx ;
      edtPrdCant_Internalname = sPrefix+"PRDCANT_"+sGXsfl_20_idx ;
      edtForPrdDsc_Internalname = sPrefix+"FORPRDDSC_"+sGXsfl_20_idx ;
      edtRecForNro_Internalname = sPrefix+"RECFORNRO_"+sGXsfl_20_idx ;
      edtRecPrdTnq_Internalname = sPrefix+"RECPRDTNQ_"+sGXsfl_20_idx ;
      edtRecLote_Internalname = sPrefix+"RECLOTE_"+sGXsfl_20_idx ;
      edtRecManAut_Internalname = sPrefix+"RECMANAUT_"+sGXsfl_20_idx ;
      edtavPrdrgb_Internalname = sPrefix+"vPRDRGB_"+sGXsfl_20_idx ;
      edtavR_Internalname = sPrefix+"vR_"+sGXsfl_20_idx ;
      edtavG_Internalname = sPrefix+"vG_"+sGXsfl_20_idx ;
      edtavB_Internalname = sPrefix+"vB_"+sGXsfl_20_idx ;
      edtavR2_Internalname = sPrefix+"vR2_"+sGXsfl_20_idx ;
      edtavG2_Internalname = sPrefix+"vG2_"+sGXsfl_20_idx ;
      edtavB2_Internalname = sPrefix+"vB2_"+sGXsfl_20_idx ;
      edtProForFab_Internalname = sPrefix+"PROFORFAB_"+sGXsfl_20_idx ;
      edtRecMar_Internalname = sPrefix+"RECMAR_"+sGXsfl_20_idx ;
   }

   public void subsflControlProps_fel_202( )
   {
      chkavSelected.setInternalname( sPrefix+"vSELECTED_"+sGXsfl_20_fel_idx );
      cmbavGridactiongroup1.setInternalname( sPrefix+"vGRIDACTIONGROUP1_"+sGXsfl_20_fel_idx );
      edtEmprCod_Internalname = sPrefix+"EMPRCOD_"+sGXsfl_20_fel_idx ;
      edtBarCod_Internalname = sPrefix+"BARCOD_"+sGXsfl_20_fel_idx ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO_"+sGXsfl_20_fel_idx ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR_"+sGXsfl_20_fel_idx ;
      edtRecLinMaq_Internalname = sPrefix+"RECLINMAQ_"+sGXsfl_20_fel_idx ;
      edtRecLinPro_Internalname = sPrefix+"RECLINPRO_"+sGXsfl_20_fel_idx ;
      edtProForCod_Internalname = sPrefix+"PROFORCOD_"+sGXsfl_20_fel_idx ;
      edtProForDsc_Internalname = sPrefix+"PROFORDSC_"+sGXsfl_20_fel_idx ;
      edtRecLin_Internalname = sPrefix+"RECLIN_"+sGXsfl_20_fel_idx ;
      edtRecPrdNum_Internalname = sPrefix+"RECPRDNUM_"+sGXsfl_20_fel_idx ;
      edtRecPrdDsc_Internalname = sPrefix+"RECPRDDSC_"+sGXsfl_20_fel_idx ;
      edtPrdNum_Internalname = sPrefix+"PRDNUM_"+sGXsfl_20_fel_idx ;
      edtForPrdUMe_Internalname = sPrefix+"FORPRDUME_"+sGXsfl_20_fel_idx ;
      edtFacCon_Internalname = sPrefix+"FACCON_"+sGXsfl_20_fel_idx ;
      edtPrdCant_Internalname = sPrefix+"PRDCANT_"+sGXsfl_20_fel_idx ;
      edtForPrdDsc_Internalname = sPrefix+"FORPRDDSC_"+sGXsfl_20_fel_idx ;
      edtRecForNro_Internalname = sPrefix+"RECFORNRO_"+sGXsfl_20_fel_idx ;
      edtRecPrdTnq_Internalname = sPrefix+"RECPRDTNQ_"+sGXsfl_20_fel_idx ;
      edtRecLote_Internalname = sPrefix+"RECLOTE_"+sGXsfl_20_fel_idx ;
      edtRecManAut_Internalname = sPrefix+"RECMANAUT_"+sGXsfl_20_fel_idx ;
      edtavPrdrgb_Internalname = sPrefix+"vPRDRGB_"+sGXsfl_20_fel_idx ;
      edtavR_Internalname = sPrefix+"vR_"+sGXsfl_20_fel_idx ;
      edtavG_Internalname = sPrefix+"vG_"+sGXsfl_20_fel_idx ;
      edtavB_Internalname = sPrefix+"vB_"+sGXsfl_20_fel_idx ;
      edtavR2_Internalname = sPrefix+"vR2_"+sGXsfl_20_fel_idx ;
      edtavG2_Internalname = sPrefix+"vG2_"+sGXsfl_20_fel_idx ;
      edtavB2_Internalname = sPrefix+"vB2_"+sGXsfl_20_fel_idx ;
      edtProForFab_Internalname = sPrefix+"PROFORFAB_"+sGXsfl_20_fel_idx ;
      edtRecMar_Internalname = sPrefix+"RECMAR_"+sGXsfl_20_fel_idx ;
   }

   public void sendrow_202( )
   {
      subsflControlProps_202( ) ;
      wb29F0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_20_idx - GRID_nFirstRecordOnPage <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_20_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_20_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavSelected.getEnabled()!=0)&&(chkavSelected.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 21,'"+sPrefix+"',false,'"+sGXsfl_20_idx+"',20)\"" : " ") ;
         ClassString = "AttributeCheckBox" ;
         StyleString = "" ;
         GXCCtl = "vSELECTED_" + sGXsfl_20_idx ;
         chkavSelected.setName( GXCCtl );
         chkavSelected.setWebtags( "" );
         chkavSelected.setCaption( "" );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSelected.getInternalname(), "TitleCaption", chkavSelected.getCaption(), !bGXsfl_20_Refreshing);
         chkavSelected.setCheckedValue( "false" );
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavSelected.getInternalname(),GXutil.booltostr( AV64Selected),"","",Integer.valueOf(-1),Integer.valueOf(1),"true","",StyleString,ClassString,"","",TempTags+" onclick="+"\"gx.fn.checkboxClick(21, this, 'true', 'false',"+"'"+sPrefix+"'"+");"+"gx.evt.onchange(this, event);\""+((chkavSelected.getEnabled()!=0)&&(chkavSelected.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,21);\"" : " ")});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactiongroup1.getEnabled()!=0)&&(cmbavGridactiongroup1.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 22,'"+sPrefix+"',false,'"+sGXsfl_20_idx+"',20)\"" : " ") ;
         if ( ( cmbavGridactiongroup1.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONGROUP1_" + sGXsfl_20_idx ;
            cmbavGridactiongroup1.setName( GXCCtl );
            cmbavGridactiongroup1.setWebtags( "" );
            if ( cmbavGridactiongroup1.getItemCount() > 0 )
            {
               AV58GridActionGroup1 = (short)(GXutil.lval( cmbavGridactiongroup1.getValidValue(GXutil.trim( GXutil.str( AV58GridActionGroup1, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58GridActionGroup1), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactiongroup1,cmbavGridactiongroup1.getInternalname(),GXutil.trim( GXutil.str( AV58GridActionGroup1, 4, 0)),Integer.valueOf(1),cmbavGridactiongroup1.getJsonclick(),Integer.valueOf(7),"'"+sPrefix+"'"+",false,"+"'"+"e1729f2_client"+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactiongroup1.getEnabled()!=0)&&(cmbavGridactiongroup1.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,22);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV58GridActionGroup1, 4, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavGridactiongroup1.getInternalname(), "Values", cmbavGridactiongroup1.ToJavascriptSource(), !bGXsfl_20_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecLinMaq_Internalname,GXutil.ltrim( localUtil.ntoc( A2804RecLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2804RecLinMaq), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRecLinMaq_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecLinPro_Internalname,GXutil.ltrim( localUtil.ntoc( A1273RecLinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1273RecLinPro), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRecLinPro_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForCod_Internalname,GXutil.rtrim( A764ProForCod),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtProForCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForDsc_Internalname,GXutil.rtrim( A766ProForDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtProForDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecLin_Internalname,GXutil.ltrim( localUtil.ntoc( A811RecLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A811RecLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRecLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecPrdNum_Internalname,GXutil.rtrim( A872RecPrdNum),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRecPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtRecPrdDsc_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecPrdDsc_Internalname,GXutil.rtrim( A875RecPrdDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRecPrdDsc_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtRecPrdDsc_Forecolor)+";"+((edtRecPrdDsc_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtRecPrdDsc_Backcolor)+";"),ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum_Internalname,GXutil.rtrim( A719PrdNum),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForPrdUMe_Internalname,GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A490ForPrdUMe), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtForPrdUMe_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacCon_Internalname,GXutil.ltrim( localUtil.ntoc( A431FacCon, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A431FacCon, "ZZZZ9.99999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtFacCon_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdCant_Internalname,GXutil.ltrim( localUtil.ntoc( A686PrdCant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A686PrdCant, "ZZZZZZ9.999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdCant_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForPrdDsc_Internalname,GXutil.rtrim( A488ForPrdDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtForPrdDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecForNro_Internalname,GXutil.ltrim( localUtil.ntoc( A2394RecForNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2394RecForNro), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRecForNro_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecPrdTnq_Internalname,GXutil.ltrim( localUtil.ntoc( A3274RecPrdTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3274RecPrdTnq), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRecPrdTnq_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecLote_Internalname,GXutil.rtrim( A5725RecLote),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRecLote_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecManAut_Internalname,GXutil.rtrim( A14055RecManAut),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRecManAut_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavPrdrgb_Enabled!=0)&&(edtavPrdrgb_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 43,'"+sPrefix+"',false,'"+sGXsfl_20_idx+"',20)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrdrgb_Internalname,GXutil.ltrim( localUtil.ntoc( AV21PrdRGB, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPrdrgb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV21PrdRGB), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV21PrdRGB), "ZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavPrdrgb_Enabled!=0)&&(edtavPrdrgb_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,43);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPrdrgb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavPrdrgb_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavR_Enabled!=0)&&(edtavR_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 44,'"+sPrefix+"',false,'"+sGXsfl_20_idx+"',20)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavR_Internalname,GXutil.ltrim( localUtil.ntoc( AV22R, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavR_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV22R), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV22R), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavR_Enabled!=0)&&(edtavR_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,44);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavR_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavR_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavG_Enabled!=0)&&(edtavG_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 45,'"+sPrefix+"',false,'"+sGXsfl_20_idx+"',20)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavG_Internalname,GXutil.ltrim( localUtil.ntoc( AV23G, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavG_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV23G), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV23G), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavG_Enabled!=0)&&(edtavG_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,45);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavG_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavG_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavB_Enabled!=0)&&(edtavB_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 46,'"+sPrefix+"',false,'"+sGXsfl_20_idx+"',20)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavB_Internalname,GXutil.ltrim( localUtil.ntoc( AV24B, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavB_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV24B), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV24B), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavB_Enabled!=0)&&(edtavB_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavB_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavB_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavR2_Enabled!=0)&&(edtavR2_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 47,'"+sPrefix+"',false,'"+sGXsfl_20_idx+"',20)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavR2_Internalname,GXutil.ltrim( localUtil.ntoc( AV25R2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavR2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV25R2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV25R2), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavR2_Enabled!=0)&&(edtavR2_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,47);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavR2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavR2_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavG2_Enabled!=0)&&(edtavG2_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 48,'"+sPrefix+"',false,'"+sGXsfl_20_idx+"',20)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavG2_Internalname,GXutil.ltrim( localUtil.ntoc( AV26G2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavG2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV26G2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV26G2), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavG2_Enabled!=0)&&(edtavG2_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,48);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavG2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavG2_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavB2_Enabled!=0)&&(edtavB2_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 49,'"+sPrefix+"',false,'"+sGXsfl_20_idx+"',20)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavB2_Internalname,GXutil.ltrim( localUtil.ntoc( AV27B2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavB2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV27B2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV27B2), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavB2_Enabled!=0)&&(edtavB2_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,49);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavB2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavB2_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForFab_Internalname,GXutil.rtrim( A6018ProForFab),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtProForFab_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecMar_Internalname,GXutil.ltrim( localUtil.ntoc( A4024RecMar, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4024RecMar), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRecMar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes29F2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_20_idx = ((subGrid_Islastpage==1)&&(nGXsfl_20_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_20_idx+1) ;
         sGXsfl_20_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_20_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_202( ) ;
      }
      /* End function sendrow_202 */
   }

   public void startgridcontrol20( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"20\">") ;
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
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"AttributeCheckBox"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"ConvertToDDO"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Código Empresa", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Barcada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Reoperado Barcada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Particion Barcada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea Maquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "#") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Proceso", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "##") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Unidad Medida", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Factor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cantidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Unidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tq", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Lote", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "M/A", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "RGB", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "R", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "G", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "B", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "R2", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "G2", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "B2", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "M", "")) ;
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
         GridContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.booltostr( AV64Selected));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV58GridActionGroup1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A130BarCodPar));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2804RecLinMaq, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1273RecLinPro, (byte)(2), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A764ProForCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A766ProForDsc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A811RecLin, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A872RecPrdNum));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A875RecPrdDsc));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtRecPrdDsc_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtRecPrdDsc_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A719PrdNum));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A431FacCon, (byte)(11), (byte)(5), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A686PrdCant, (byte)(11), (byte)(3), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A488ForPrdDsc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2394RecForNro, (byte)(2), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3274RecPrdTnq, (byte)(2), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5725RecLote));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14055RecManAut));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV21PrdRGB, (byte)(10), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrdrgb_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV22R, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavR_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV23G, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavG_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV24B, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavB_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV25R2, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavR2_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV26G2, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavG2_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV27B2, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavB2_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A6018ProForFab));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4024RecMar, (byte)(1), (byte)(0), ".", "")));
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
      bttBtnuseraction1_Internalname = sPrefix+"BTNUSERACTION1" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      chkavSelected.setInternalname( sPrefix+"vSELECTED" );
      cmbavGridactiongroup1.setInternalname( sPrefix+"vGRIDACTIONGROUP1" );
      edtEmprCod_Internalname = sPrefix+"EMPRCOD" ;
      edtBarCod_Internalname = sPrefix+"BARCOD" ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO" ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR" ;
      edtRecLinMaq_Internalname = sPrefix+"RECLINMAQ" ;
      edtRecLinPro_Internalname = sPrefix+"RECLINPRO" ;
      edtProForCod_Internalname = sPrefix+"PROFORCOD" ;
      edtProForDsc_Internalname = sPrefix+"PROFORDSC" ;
      edtRecLin_Internalname = sPrefix+"RECLIN" ;
      edtRecPrdNum_Internalname = sPrefix+"RECPRDNUM" ;
      edtRecPrdDsc_Internalname = sPrefix+"RECPRDDSC" ;
      edtPrdNum_Internalname = sPrefix+"PRDNUM" ;
      edtForPrdUMe_Internalname = sPrefix+"FORPRDUME" ;
      edtFacCon_Internalname = sPrefix+"FACCON" ;
      edtPrdCant_Internalname = sPrefix+"PRDCANT" ;
      edtForPrdDsc_Internalname = sPrefix+"FORPRDDSC" ;
      edtRecForNro_Internalname = sPrefix+"RECFORNRO" ;
      edtRecPrdTnq_Internalname = sPrefix+"RECPRDTNQ" ;
      edtRecLote_Internalname = sPrefix+"RECLOTE" ;
      edtRecManAut_Internalname = sPrefix+"RECMANAUT" ;
      edtavPrdrgb_Internalname = sPrefix+"vPRDRGB" ;
      edtavR_Internalname = sPrefix+"vR" ;
      edtavG_Internalname = sPrefix+"vG" ;
      edtavB_Internalname = sPrefix+"vB" ;
      edtavR2_Internalname = sPrefix+"vR2" ;
      edtavG2_Internalname = sPrefix+"vG2" ;
      edtavB2_Internalname = sPrefix+"vB2" ;
      edtProForFab_Internalname = sPrefix+"PROFORFAB" ;
      edtRecMar_Internalname = sPrefix+"RECMAR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      Datamonjs_Internalname = sPrefix+"DATAMONJS" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Dvelop_confirmpanel_eliminar_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR" ;
      tblTabledvelop_confirmpanel_eliminar_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_ELIMINAR" ;
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
      edtRecMar_Jsonclick = "" ;
      edtProForFab_Jsonclick = "" ;
      edtavB2_Jsonclick = "" ;
      edtavB2_Visible = 0 ;
      edtavB2_Enabled = 1 ;
      edtavG2_Jsonclick = "" ;
      edtavG2_Visible = 0 ;
      edtavG2_Enabled = 1 ;
      edtavR2_Jsonclick = "" ;
      edtavR2_Visible = 0 ;
      edtavR2_Enabled = 1 ;
      edtavB_Jsonclick = "" ;
      edtavB_Visible = 0 ;
      edtavB_Enabled = 1 ;
      edtavG_Jsonclick = "" ;
      edtavG_Visible = 0 ;
      edtavG_Enabled = 1 ;
      edtavR_Jsonclick = "" ;
      edtavR_Visible = 0 ;
      edtavR_Enabled = 1 ;
      edtavPrdrgb_Jsonclick = "" ;
      edtavPrdrgb_Visible = 0 ;
      edtavPrdrgb_Enabled = 1 ;
      edtRecManAut_Jsonclick = "" ;
      edtRecLote_Jsonclick = "" ;
      edtRecPrdTnq_Jsonclick = "" ;
      edtRecForNro_Jsonclick = "" ;
      edtForPrdDsc_Jsonclick = "" ;
      edtPrdCant_Jsonclick = "" ;
      edtFacCon_Jsonclick = "" ;
      edtForPrdUMe_Jsonclick = "" ;
      edtPrdNum_Jsonclick = "" ;
      edtRecPrdDsc_Jsonclick = "" ;
      edtRecPrdDsc_Forecolor = (int)(0x000000) ;
      edtRecPrdDsc_Backcolor = -1 ;
      edtRecPrdNum_Jsonclick = "" ;
      edtRecLin_Jsonclick = "" ;
      edtProForDsc_Jsonclick = "" ;
      edtProForCod_Jsonclick = "" ;
      edtRecLinPro_Jsonclick = "" ;
      edtRecLinMaq_Jsonclick = "" ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCod_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      cmbavGridactiongroup1.setJsonclick( "" );
      cmbavGridactiongroup1.setVisible( -1 );
      cmbavGridactiongroup1.setEnabled( 1 );
      chkavSelected.setCaption( "" );
      chkavSelected.setVisible( -1 );
      chkavSelected.setEnabled( 1 );
      subGrid_Class = "GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      subGrid_Sortable = (byte)(0) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Infinitescrolling = "Form" ;
      Dvelop_confirmpanel_eliminar_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminar_Confirmationtext = "¿Desea eliminar la linea?" ;
      Dvelop_confirmpanel_eliminar_Title = "" ;
      Ddo_grid_Datalistproc = "RecetadeTinte90__WCGetFilterData" ;
      Ddo_grid_Datalisttype = "|Dynamic|Dynamic||Dynamic|Dynamic|||Dynamic|||Dynamic|Dynamic" ;
      Ddo_grid_Includedatalist = "|T|T||T|T|||T|||T|T" ;
      Ddo_grid_Filterisrange = "T|||T|||T|T||T|T||" ;
      Ddo_grid_Filtertype = "Numeric|Character|Character|Numeric|Character|Character|Numeric|Numeric|Character|Numeric|Numeric|Character|Character" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6|7|8|9|10|11|12|13|14" ;
      Ddo_grid_Columnids = "7:RecLinPro|8:ProForCod|9:ProForDsc|10:RecLin|11:RecPrdNum|12:RecPrdDsc|15:FacCon|16:PrdCant|17:ForPrdDsc|18:RecForNro|19:RecPrdTnq|20:RecLote|21:RecManAut" ;
      Ddo_grid_Gridinternalname = "" ;
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
      GXCCtl = "vSELECTED_" + sGXsfl_20_idx ;
      chkavSelected.setName( GXCCtl );
      chkavSelected.setWebtags( "" );
      chkavSelected.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSelected.getInternalname(), "TitleCaption", chkavSelected.getCaption(), !bGXsfl_20_Refreshing);
      chkavSelected.setCheckedValue( "false" );
      GXCCtl = "vGRIDACTIONGROUP1_" + sGXsfl_20_idx ;
      cmbavGridactiongroup1.setName( GXCCtl );
      cmbavGridactiongroup1.setWebtags( "" );
      if ( cmbavGridactiongroup1.getItemCount() > 0 )
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'sPrefix'},{av:'AV29TFRecLinPro',fld:'vTFRECLINPRO',pic:'Z9'},{av:'AV30TFRecLinPro_To',fld:'vTFRECLINPRO_TO',pic:'Z9'},{av:'AV31TFProForCod',fld:'vTFPROFORCOD',pic:''},{av:'AV32TFProForCod_Sel',fld:'vTFPROFORCOD_SEL',pic:''},{av:'AV33TFProForDsc',fld:'vTFPROFORDSC',pic:''},{av:'AV34TFProForDsc_Sel',fld:'vTFPROFORDSC_SEL',pic:''},{av:'AV35TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV36TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'AV37TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV38TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV39TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV40TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV41TFFacCon',fld:'vTFFACCON',pic:'ZZZZ9.99999'},{av:'AV42TFFacCon_To',fld:'vTFFACCON_TO',pic:'ZZZZ9.99999'},{av:'AV43TFPrdCant',fld:'vTFPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV44TFPrdCant_To',fld:'vTFPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV45TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV46TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV47TFRecForNro',fld:'vTFRECFORNRO',pic:'Z9'},{av:'AV48TFRecForNro_To',fld:'vTFRECFORNRO_TO',pic:'Z9'},{av:'AV49TFRecPrdTnq',fld:'vTFRECPRDTNQ',pic:'Z9'},{av:'AV50TFRecPrdTnq_To',fld:'vTFRECPRDTNQ_TO',pic:'Z9'},{av:'AV51TFRecLote',fld:'vTFRECLOTE',pic:''},{av:'AV52TFRecLote_Sel',fld:'vTFRECLOTE_SEL',pic:''},{av:'AV62TFRecManAut',fld:'vTFRECMANAUT',pic:''},{av:'AV63TFRecManAut_Sel',fld:'vTFRECMANAUT_SEL',pic:''},{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV8Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV9RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV57RecLinpro',fld:'vRECLINPRO',pic:'Z9'},{av:'AV61UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV59Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV69Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e1129F2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV8Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV9RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV57RecLinpro',fld:'vRECLINPRO',pic:'Z9'},{av:'AV29TFRecLinPro',fld:'vTFRECLINPRO',pic:'Z9'},{av:'AV30TFRecLinPro_To',fld:'vTFRECLINPRO_TO',pic:'Z9'},{av:'AV31TFProForCod',fld:'vTFPROFORCOD',pic:''},{av:'AV32TFProForCod_Sel',fld:'vTFPROFORCOD_SEL',pic:''},{av:'AV33TFProForDsc',fld:'vTFPROFORDSC',pic:''},{av:'AV34TFProForDsc_Sel',fld:'vTFPROFORDSC_SEL',pic:''},{av:'AV35TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV36TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'AV37TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV38TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV39TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV40TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV41TFFacCon',fld:'vTFFACCON',pic:'ZZZZ9.99999'},{av:'AV42TFFacCon_To',fld:'vTFFACCON_TO',pic:'ZZZZ9.99999'},{av:'AV43TFPrdCant',fld:'vTFPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV44TFPrdCant_To',fld:'vTFPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV45TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV46TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV47TFRecForNro',fld:'vTFRECFORNRO',pic:'Z9'},{av:'AV48TFRecForNro_To',fld:'vTFRECFORNRO_TO',pic:'Z9'},{av:'AV49TFRecPrdTnq',fld:'vTFRECPRDTNQ',pic:'Z9'},{av:'AV50TFRecPrdTnq_To',fld:'vTFRECPRDTNQ_TO',pic:'Z9'},{av:'AV51TFRecLote',fld:'vTFRECLOTE',pic:''},{av:'AV52TFRecLote_Sel',fld:'vTFRECLOTE_SEL',pic:''},{av:'AV62TFRecManAut',fld:'vTFRECMANAUT',pic:''},{av:'AV63TFRecManAut_Sel',fld:'vTFRECMANAUT_SEL',pic:''},{av:'AV69Pgmname',fld:'vPGMNAME',pic:''},{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV61UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV59Station',fld:'vSTATION',pic:'',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV62TFRecManAut',fld:'vTFRECMANAUT',pic:''},{av:'AV63TFRecManAut_Sel',fld:'vTFRECMANAUT_SEL',pic:''},{av:'AV51TFRecLote',fld:'vTFRECLOTE',pic:''},{av:'AV52TFRecLote_Sel',fld:'vTFRECLOTE_SEL',pic:''},{av:'AV49TFRecPrdTnq',fld:'vTFRECPRDTNQ',pic:'Z9'},{av:'AV50TFRecPrdTnq_To',fld:'vTFRECPRDTNQ_TO',pic:'Z9'},{av:'AV47TFRecForNro',fld:'vTFRECFORNRO',pic:'Z9'},{av:'AV48TFRecForNro_To',fld:'vTFRECFORNRO_TO',pic:'Z9'},{av:'AV45TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV46TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV43TFPrdCant',fld:'vTFPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV44TFPrdCant_To',fld:'vTFPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV41TFFacCon',fld:'vTFFACCON',pic:'ZZZZ9.99999'},{av:'AV42TFFacCon_To',fld:'vTFFACCON_TO',pic:'ZZZZ9.99999'},{av:'AV39TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV40TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV37TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV38TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV35TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV36TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'AV33TFProForDsc',fld:'vTFPROFORDSC',pic:''},{av:'AV34TFProForDsc_Sel',fld:'vTFPROFORDSC_SEL',pic:''},{av:'AV31TFProForCod',fld:'vTFPROFORCOD',pic:''},{av:'AV32TFProForCod_Sel',fld:'vTFPROFORCOD_SEL',pic:''},{av:'AV29TFRecLinPro',fld:'vTFRECLINPRO',pic:'Z9'},{av:'AV30TFRecLinPro_To',fld:'vTFRECLINPRO_TO',pic:'Z9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e1629F2',iparms:[{av:'A13232PrdRGB',fld:'PRDRGB',pic:'ZZZZZZZZZ9'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactiongroup1'},{av:'AV58GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{av:'AV64Selected',fld:'vSELECTED',pic:''},{av:'AV21PrdRGB',fld:'vPRDRGB',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV27B2',fld:'vB2',pic:'ZZ9',hsh:true},{av:'AV26G2',fld:'vG2',pic:'ZZ9',hsh:true},{av:'AV25R2',fld:'vR2',pic:'ZZ9',hsh:true},{av:'AV24B',fld:'vB',pic:'ZZ9',hsh:true},{av:'AV23G',fld:'vG',pic:'ZZ9',hsh:true},{av:'AV22R',fld:'vR',pic:'ZZ9',hsh:true},{av:'edtRecPrdDsc_Backcolor',ctrl:'RECPRDDSC',prop:'Backcolor'},{av:'edtRecPrdDsc_Forecolor',ctrl:'RECPRDDSC',prop:'Forecolor'}]}");
      setEventMetadata("VGRIDACTIONGROUP1.CLICK","{handler:'e1729F2',iparms:[{av:'cmbavGridactiongroup1'},{av:'AV58GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{av:'A811RecLin',fld:'RECLIN',pic:'ZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:'',hsh:true},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9',hsh:true},{av:'A1273RecLinPro',fld:'RECLINPRO',pic:'Z9',hsh:true}]");
      setEventMetadata("VGRIDACTIONGROUP1.CLICK",",oparms:[{av:'cmbavGridactiongroup1'},{av:'AV58GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{av:'Dvelop_confirmpanel_eliminar_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_ELIMINAR',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE","{handler:'e1229F2',iparms:[{av:'Dvelop_confirmpanel_eliminar_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINAR',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV8Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV9RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV57RecLinpro',fld:'vRECLINPRO',pic:'Z9'},{av:'AV29TFRecLinPro',fld:'vTFRECLINPRO',pic:'Z9'},{av:'AV30TFRecLinPro_To',fld:'vTFRECLINPRO_TO',pic:'Z9'},{av:'AV31TFProForCod',fld:'vTFPROFORCOD',pic:''},{av:'AV32TFProForCod_Sel',fld:'vTFPROFORCOD_SEL',pic:''},{av:'AV33TFProForDsc',fld:'vTFPROFORDSC',pic:''},{av:'AV34TFProForDsc_Sel',fld:'vTFPROFORDSC_SEL',pic:''},{av:'AV35TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV36TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'AV37TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV38TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV39TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV40TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV41TFFacCon',fld:'vTFFACCON',pic:'ZZZZ9.99999'},{av:'AV42TFFacCon_To',fld:'vTFFACCON_TO',pic:'ZZZZ9.99999'},{av:'AV43TFPrdCant',fld:'vTFPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV44TFPrdCant_To',fld:'vTFPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV45TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV46TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV47TFRecForNro',fld:'vTFRECFORNRO',pic:'Z9'},{av:'AV48TFRecForNro_To',fld:'vTFRECFORNRO_TO',pic:'Z9'},{av:'AV49TFRecPrdTnq',fld:'vTFRECPRDTNQ',pic:'Z9'},{av:'AV50TFRecPrdTnq_To',fld:'vTFRECPRDTNQ_TO',pic:'Z9'},{av:'AV51TFRecLote',fld:'vTFRECLOTE',pic:''},{av:'AV52TFRecLote_Sel',fld:'vTFRECLOTE_SEL',pic:''},{av:'AV62TFRecManAut',fld:'vTFRECMANAUT',pic:''},{av:'AV63TFRecManAut_Sel',fld:'vTFRECMANAUT_SEL',pic:''},{av:'AV69Pgmname',fld:'vPGMNAME',pic:''},{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV61UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV59Station',fld:'vSTATION',pic:'',hsh:true},{av:'sPrefix'},{av:'A811RecLin',fld:'RECLIN',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE",",oparms:[]}");
      setEventMetadata("'DOUSERACTION1'","{handler:'e1329F2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV8Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV9RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV57RecLinpro',fld:'vRECLINPRO',pic:'Z9'},{av:'AV29TFRecLinPro',fld:'vTFRECLINPRO',pic:'Z9'},{av:'AV30TFRecLinPro_To',fld:'vTFRECLINPRO_TO',pic:'Z9'},{av:'AV31TFProForCod',fld:'vTFPROFORCOD',pic:''},{av:'AV32TFProForCod_Sel',fld:'vTFPROFORCOD_SEL',pic:''},{av:'AV33TFProForDsc',fld:'vTFPROFORDSC',pic:''},{av:'AV34TFProForDsc_Sel',fld:'vTFPROFORDSC_SEL',pic:''},{av:'AV35TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV36TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'AV37TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV38TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV39TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV40TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV41TFFacCon',fld:'vTFFACCON',pic:'ZZZZ9.99999'},{av:'AV42TFFacCon_To',fld:'vTFFACCON_TO',pic:'ZZZZ9.99999'},{av:'AV43TFPrdCant',fld:'vTFPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV44TFPrdCant_To',fld:'vTFPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV45TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV46TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV47TFRecForNro',fld:'vTFRECFORNRO',pic:'Z9'},{av:'AV48TFRecForNro_To',fld:'vTFRECFORNRO_TO',pic:'Z9'},{av:'AV49TFRecPrdTnq',fld:'vTFRECPRDTNQ',pic:'Z9'},{av:'AV50TFRecPrdTnq_To',fld:'vTFRECPRDTNQ_TO',pic:'Z9'},{av:'AV51TFRecLote',fld:'vTFRECLOTE',pic:''},{av:'AV52TFRecLote_Sel',fld:'vTFRECLOTE_SEL',pic:''},{av:'AV62TFRecManAut',fld:'vTFRECMANAUT',pic:''},{av:'AV63TFRecManAut_Sel',fld:'vTFRECMANAUT_SEL',pic:''},{av:'AV69Pgmname',fld:'vPGMNAME',pic:''},{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV61UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV59Station',fld:'vSTATION',pic:'',hsh:true},{av:'sPrefix'},{av:'AV65SelectedRows',fld:'vSELECTEDROWS',pic:''},{av:'AV64Selected',fld:'vSELECTED',grid:20,pic:''},{av:'nRC_GXsfl_20',ctrl:'GRID',grid:20,prop:'GridRC',grid:20},{av:'A396EmprCod',fld:'EMPRCOD',grid:20,pic:'@!',hsh:true},{av:'A129BarCod',fld:'BARCOD',grid:20,pic:'ZZZZZZZ9',hsh:true},{av:'A132BarCodReo',fld:'BARCODREO',grid:20,pic:'9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',grid:20,pic:'',hsh:true},{av:'A2804RecLinMaq',fld:'RECLINMAQ',grid:20,pic:'ZZZ9',hsh:true},{av:'A1273RecLinPro',fld:'RECLINPRO',grid:20,pic:'Z9',hsh:true},{av:'A764ProForCod',fld:'PROFORCOD',grid:20,pic:''},{av:'A766ProForDsc',fld:'PROFORDSC',grid:20,pic:''},{av:'A811RecLin',fld:'RECLIN',grid:20,pic:'ZZZ9',hsh:true},{av:'A872RecPrdNum',fld:'RECPRDNUM',grid:20,pic:'',hsh:true},{av:'A875RecPrdDsc',fld:'RECPRDDSC',grid:20,pic:'',hsh:true},{av:'A719PrdNum',fld:'PRDNUM',grid:20,pic:'',hsh:true},{av:'A490ForPrdUMe',fld:'FORPRDUME',grid:20,pic:'9',hsh:true},{av:'A431FacCon',fld:'FACCON',grid:20,pic:'ZZZZ9.99999',hsh:true},{av:'A686PrdCant',fld:'PRDCANT',grid:20,pic:'ZZZZZZ9.999',hsh:true},{av:'A488ForPrdDsc',fld:'FORPRDDSC',grid:20,pic:''},{av:'A2394RecForNro',fld:'RECFORNRO',grid:20,pic:'Z9',hsh:true},{av:'A3274RecPrdTnq',fld:'RECPRDTNQ',grid:20,pic:'Z9',hsh:true},{av:'A5725RecLote',fld:'RECLOTE',grid:20,pic:'',hsh:true},{av:'A14055RecManAut',fld:'RECMANAUT',grid:20,pic:'',hsh:true},{av:'AV21PrdRGB',fld:'vPRDRGB',grid:20,pic:'ZZZZZZZZZ9',hsh:true},{av:'AV22R',fld:'vR',grid:20,pic:'ZZ9',hsh:true},{av:'AV23G',fld:'vG',grid:20,pic:'ZZ9',hsh:true},{av:'AV24B',fld:'vB',grid:20,pic:'ZZ9',hsh:true},{av:'AV25R2',fld:'vR2',grid:20,pic:'ZZ9',hsh:true},{av:'AV26G2',fld:'vG2',grid:20,pic:'ZZ9',hsh:true},{av:'AV27B2',fld:'vB2',grid:20,pic:'ZZ9',hsh:true},{av:'A6018ProForFab',fld:'PROFORFAB',grid:20,pic:''},{av:'A4024RecMar',fld:'RECMAR',grid:20,pic:'9',hsh:true}]");
      setEventMetadata("'DOUSERACTION1'",",oparms:[{av:'AV65SelectedRows',fld:'vSELECTEDROWS',pic:''}]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV61UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV59Station',fld:'vSTATION',pic:'',hsh:true},{av:'sPrefix'},{av:'AV29TFRecLinPro',fld:'vTFRECLINPRO',pic:'Z9'},{av:'AV30TFRecLinPro_To',fld:'vTFRECLINPRO_TO',pic:'Z9'},{av:'AV31TFProForCod',fld:'vTFPROFORCOD',pic:''},{av:'AV32TFProForCod_Sel',fld:'vTFPROFORCOD_SEL',pic:''},{av:'AV33TFProForDsc',fld:'vTFPROFORDSC',pic:''},{av:'AV34TFProForDsc_Sel',fld:'vTFPROFORDSC_SEL',pic:''},{av:'AV35TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV36TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'AV37TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV38TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV39TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV40TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV41TFFacCon',fld:'vTFFACCON',pic:'ZZZZ9.99999'},{av:'AV42TFFacCon_To',fld:'vTFFACCON_TO',pic:'ZZZZ9.99999'},{av:'AV43TFPrdCant',fld:'vTFPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV44TFPrdCant_To',fld:'vTFPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV45TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV46TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV47TFRecForNro',fld:'vTFRECFORNRO',pic:'Z9'},{av:'AV48TFRecForNro_To',fld:'vTFRECFORNRO_TO',pic:'Z9'},{av:'AV49TFRecPrdTnq',fld:'vTFRECPRDTNQ',pic:'Z9'},{av:'AV50TFRecPrdTnq_To',fld:'vTFRECPRDTNQ_TO',pic:'Z9'},{av:'AV51TFRecLote',fld:'vTFRECLOTE',pic:''},{av:'AV52TFRecLote_Sel',fld:'vTFRECLOTE_SEL',pic:''},{av:'AV62TFRecManAut',fld:'vTFRECMANAUT',pic:''},{av:'AV63TFRecManAut_Sel',fld:'vTFRECMANAUT_SEL',pic:''},{av:'AV69Pgmname',fld:'vPGMNAME',pic:''},{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV8Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV9RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV57RecLinpro',fld:'vRECLINPRO',pic:'Z9'}]");
      setEventMetadata("GRID_FIRSTPAGE",",oparms:[]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV61UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV59Station',fld:'vSTATION',pic:'',hsh:true},{av:'sPrefix'},{av:'AV29TFRecLinPro',fld:'vTFRECLINPRO',pic:'Z9'},{av:'AV30TFRecLinPro_To',fld:'vTFRECLINPRO_TO',pic:'Z9'},{av:'AV31TFProForCod',fld:'vTFPROFORCOD',pic:''},{av:'AV32TFProForCod_Sel',fld:'vTFPROFORCOD_SEL',pic:''},{av:'AV33TFProForDsc',fld:'vTFPROFORDSC',pic:''},{av:'AV34TFProForDsc_Sel',fld:'vTFPROFORDSC_SEL',pic:''},{av:'AV35TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV36TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'AV37TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV38TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV39TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV40TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV41TFFacCon',fld:'vTFFACCON',pic:'ZZZZ9.99999'},{av:'AV42TFFacCon_To',fld:'vTFFACCON_TO',pic:'ZZZZ9.99999'},{av:'AV43TFPrdCant',fld:'vTFPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV44TFPrdCant_To',fld:'vTFPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV45TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV46TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV47TFRecForNro',fld:'vTFRECFORNRO',pic:'Z9'},{av:'AV48TFRecForNro_To',fld:'vTFRECFORNRO_TO',pic:'Z9'},{av:'AV49TFRecPrdTnq',fld:'vTFRECPRDTNQ',pic:'Z9'},{av:'AV50TFRecPrdTnq_To',fld:'vTFRECPRDTNQ_TO',pic:'Z9'},{av:'AV51TFRecLote',fld:'vTFRECLOTE',pic:''},{av:'AV52TFRecLote_Sel',fld:'vTFRECLOTE_SEL',pic:''},{av:'AV62TFRecManAut',fld:'vTFRECMANAUT',pic:''},{av:'AV63TFRecManAut_Sel',fld:'vTFRECMANAUT_SEL',pic:''},{av:'AV69Pgmname',fld:'vPGMNAME',pic:''},{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV8Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV9RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV57RecLinpro',fld:'vRECLINPRO',pic:'Z9'}]");
      setEventMetadata("GRID_PREVPAGE",",oparms:[]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV61UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV59Station',fld:'vSTATION',pic:'',hsh:true},{av:'sPrefix'},{av:'AV29TFRecLinPro',fld:'vTFRECLINPRO',pic:'Z9'},{av:'AV30TFRecLinPro_To',fld:'vTFRECLINPRO_TO',pic:'Z9'},{av:'AV31TFProForCod',fld:'vTFPROFORCOD',pic:''},{av:'AV32TFProForCod_Sel',fld:'vTFPROFORCOD_SEL',pic:''},{av:'AV33TFProForDsc',fld:'vTFPROFORDSC',pic:''},{av:'AV34TFProForDsc_Sel',fld:'vTFPROFORDSC_SEL',pic:''},{av:'AV35TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV36TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'AV37TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV38TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV39TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV40TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV41TFFacCon',fld:'vTFFACCON',pic:'ZZZZ9.99999'},{av:'AV42TFFacCon_To',fld:'vTFFACCON_TO',pic:'ZZZZ9.99999'},{av:'AV43TFPrdCant',fld:'vTFPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV44TFPrdCant_To',fld:'vTFPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV45TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV46TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV47TFRecForNro',fld:'vTFRECFORNRO',pic:'Z9'},{av:'AV48TFRecForNro_To',fld:'vTFRECFORNRO_TO',pic:'Z9'},{av:'AV49TFRecPrdTnq',fld:'vTFRECPRDTNQ',pic:'Z9'},{av:'AV50TFRecPrdTnq_To',fld:'vTFRECPRDTNQ_TO',pic:'Z9'},{av:'AV51TFRecLote',fld:'vTFRECLOTE',pic:''},{av:'AV52TFRecLote_Sel',fld:'vTFRECLOTE_SEL',pic:''},{av:'AV62TFRecManAut',fld:'vTFRECMANAUT',pic:''},{av:'AV63TFRecManAut_Sel',fld:'vTFRECMANAUT_SEL',pic:''},{av:'AV69Pgmname',fld:'vPGMNAME',pic:''},{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV8Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV9RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV57RecLinpro',fld:'vRECLINPRO',pic:'Z9'}]");
      setEventMetadata("GRID_NEXTPAGE",",oparms:[]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV61UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV59Station',fld:'vSTATION',pic:'',hsh:true},{av:'sPrefix'},{av:'AV29TFRecLinPro',fld:'vTFRECLINPRO',pic:'Z9'},{av:'AV30TFRecLinPro_To',fld:'vTFRECLINPRO_TO',pic:'Z9'},{av:'AV31TFProForCod',fld:'vTFPROFORCOD',pic:''},{av:'AV32TFProForCod_Sel',fld:'vTFPROFORCOD_SEL',pic:''},{av:'AV33TFProForDsc',fld:'vTFPROFORDSC',pic:''},{av:'AV34TFProForDsc_Sel',fld:'vTFPROFORDSC_SEL',pic:''},{av:'AV35TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV36TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'AV37TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV38TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV39TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV40TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV41TFFacCon',fld:'vTFFACCON',pic:'ZZZZ9.99999'},{av:'AV42TFFacCon_To',fld:'vTFFACCON_TO',pic:'ZZZZ9.99999'},{av:'AV43TFPrdCant',fld:'vTFPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV44TFPrdCant_To',fld:'vTFPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV45TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV46TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV47TFRecForNro',fld:'vTFRECFORNRO',pic:'Z9'},{av:'AV48TFRecForNro_To',fld:'vTFRECFORNRO_TO',pic:'Z9'},{av:'AV49TFRecPrdTnq',fld:'vTFRECPRDTNQ',pic:'Z9'},{av:'AV50TFRecPrdTnq_To',fld:'vTFRECPRDTNQ_TO',pic:'Z9'},{av:'AV51TFRecLote',fld:'vTFRECLOTE',pic:''},{av:'AV52TFRecLote_Sel',fld:'vTFRECLOTE_SEL',pic:''},{av:'AV62TFRecManAut',fld:'vTFRECMANAUT',pic:''},{av:'AV63TFRecManAut_Sel',fld:'vTFRECMANAUT_SEL',pic:''},{av:'AV69Pgmname',fld:'vPGMNAME',pic:''},{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV8Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV9RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV57RecLinpro',fld:'vRECLINPRO',pic:'Z9'}]");
      setEventMetadata("GRID_LASTPAGE",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_RECLINMAQ","{handler:'valid_Reclinmaq',iparms:[]");
      setEventMetadata("VALID_RECLINMAQ",",oparms:[]}");
      setEventMetadata("VALID_RECLINPRO","{handler:'valid_Reclinpro',iparms:[]");
      setEventMetadata("VALID_RECLINPRO",",oparms:[]}");
      setEventMetadata("VALID_PROFORCOD","{handler:'valid_Proforcod',iparms:[]");
      setEventMetadata("VALID_PROFORCOD",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[]");
      setEventMetadata("VALID_PRDNUM",",oparms:[]}");
      setEventMetadata("VALID_FORPRDUME","{handler:'valid_Forprdume',iparms:[]");
      setEventMetadata("VALID_FORPRDUME",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Recmar',iparms:[]");
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
      wcpOAV8Barcodpar = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Dvelop_confirmpanel_eliminar_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV5Emprcod = "" ;
      AV8Barcodpar = "" ;
      AV31TFProForCod = "" ;
      AV32TFProForCod_Sel = "" ;
      AV33TFProForDsc = "" ;
      AV34TFProForDsc_Sel = "" ;
      AV37TFRecPrdNum = "" ;
      AV38TFRecPrdNum_Sel = "" ;
      AV39TFRecPrdDsc = "" ;
      AV40TFRecPrdDsc_Sel = "" ;
      AV41TFFacCon = DecimalUtil.ZERO ;
      AV42TFFacCon_To = DecimalUtil.ZERO ;
      AV43TFPrdCant = DecimalUtil.ZERO ;
      AV44TFPrdCant_To = DecimalUtil.ZERO ;
      AV45TFForPrdDsc = "" ;
      AV46TFForPrdDsc_Sel = "" ;
      AV51TFRecLote = "" ;
      AV52TFRecLote_Sel = "" ;
      AV62TFRecManAut = "" ;
      AV63TFRecManAut_Sel = "" ;
      AV69Pgmname = "" ;
      AV61UsurCod = "" ;
      AV59Station = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV53DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV65SelectedRows = new GXBaseCollection<app.SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem>(app.SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem.class, "RecetadeTinte90__WCSDTItem", "TexplusNET", remoteHandle);
      AV97Emprcod_selected = "" ;
      AV100Barcodpar_selected = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      TempTags = "" ;
      bttBtnuseraction1_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV72Recetadetinte90__wcds_3_tfproforcod = "" ;
      AV73Recetadetinte90__wcds_4_tfproforcod_sel = "" ;
      AV74Recetadetinte90__wcds_5_tfprofordsc = "" ;
      AV75Recetadetinte90__wcds_6_tfprofordsc_sel = "" ;
      AV78Recetadetinte90__wcds_9_tfrecprdnum = "" ;
      AV79Recetadetinte90__wcds_10_tfrecprdnum_sel = "" ;
      AV80Recetadetinte90__wcds_11_tfrecprddsc = "" ;
      AV81Recetadetinte90__wcds_12_tfrecprddsc_sel = "" ;
      AV82Recetadetinte90__wcds_13_tffaccon = DecimalUtil.ZERO ;
      AV83Recetadetinte90__wcds_14_tffaccon_to = DecimalUtil.ZERO ;
      AV84Recetadetinte90__wcds_15_tfprdcant = DecimalUtil.ZERO ;
      AV85Recetadetinte90__wcds_16_tfprdcant_to = DecimalUtil.ZERO ;
      AV86Recetadetinte90__wcds_17_tfforprddsc = "" ;
      AV87Recetadetinte90__wcds_18_tfforprddsc_sel = "" ;
      AV92Recetadetinte90__wcds_23_tfreclote = "" ;
      AV93Recetadetinte90__wcds_24_tfreclote_sel = "" ;
      AV94Recetadetinte90__wcds_25_tfrecmanaut = "" ;
      AV95Recetadetinte90__wcds_26_tfrecmanaut_sel = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A764ProForCod = "" ;
      A766ProForDsc = "" ;
      A872RecPrdNum = "" ;
      A875RecPrdDsc = "" ;
      A719PrdNum = "" ;
      A431FacCon = DecimalUtil.ZERO ;
      A686PrdCant = DecimalUtil.ZERO ;
      A488ForPrdDsc = "" ;
      A5725RecLote = "" ;
      A14055RecManAut = "" ;
      A6018ProForFab = "" ;
      GXCCtl = "" ;
      scmdbuf = "" ;
      lV72Recetadetinte90__wcds_3_tfproforcod = "" ;
      lV74Recetadetinte90__wcds_5_tfprofordsc = "" ;
      lV78Recetadetinte90__wcds_9_tfrecprdnum = "" ;
      lV80Recetadetinte90__wcds_11_tfrecprddsc = "" ;
      lV86Recetadetinte90__wcds_17_tfforprddsc = "" ;
      lV92Recetadetinte90__wcds_23_tfreclote = "" ;
      lV94Recetadetinte90__wcds_25_tfrecmanaut = "" ;
      H029F2_A13232PrdRGB = new long[1] ;
      H029F2_A4024RecMar = new byte[1] ;
      H029F2_A6018ProForFab = new String[] {""} ;
      H029F2_n6018ProForFab = new boolean[] {false} ;
      H029F2_A14055RecManAut = new String[] {""} ;
      H029F2_A5725RecLote = new String[] {""} ;
      H029F2_A3274RecPrdTnq = new byte[1] ;
      H029F2_A2394RecForNro = new byte[1] ;
      H029F2_A488ForPrdDsc = new String[] {""} ;
      H029F2_n488ForPrdDsc = new boolean[] {false} ;
      H029F2_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H029F2_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H029F2_A490ForPrdUMe = new byte[1] ;
      H029F2_n490ForPrdUMe = new boolean[] {false} ;
      H029F2_A719PrdNum = new String[] {""} ;
      H029F2_n719PrdNum = new boolean[] {false} ;
      H029F2_A875RecPrdDsc = new String[] {""} ;
      H029F2_A872RecPrdNum = new String[] {""} ;
      H029F2_A811RecLin = new short[1] ;
      H029F2_A766ProForDsc = new String[] {""} ;
      H029F2_A764ProForCod = new String[] {""} ;
      H029F2_A1273RecLinPro = new byte[1] ;
      H029F2_A2804RecLinMaq = new short[1] ;
      H029F2_A130BarCodPar = new String[] {""} ;
      H029F2_A132BarCodReo = new byte[1] ;
      H029F2_A129BarCod = new int[1] ;
      H029F2_A396EmprCod = new String[] {""} ;
      H029F3_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV60EmprNom = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV12WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GXv_int8 = new short[1] ;
      GXv_int9 = new short[1] ;
      GXv_int10 = new short[1] ;
      GXv_int11 = new short[1] ;
      GXv_int12 = new short[1] ;
      GXv_int13 = new short[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV66SelectedRow = new app.SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem(remoteHandle, context);
      ucDvelop_confirmpanel_eliminar = new com.genexus.webpanels.GXUserControl();
      AV28Session = httpContext.getWebSession();
      AV16GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV17GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char22 = "" ;
      GXv_char23 = new String[1] ;
      GXt_char20 = "" ;
      GXv_char21 = new String[1] ;
      GXt_char18 = "" ;
      GXv_char19 = new String[1] ;
      GXt_char16 = "" ;
      GXv_char17 = new String[1] ;
      GXt_char15 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char14 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState24 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV14TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV13HTTPRequest = httpContext.getHttpRequest();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV5Emprcod = "" ;
      sCtrlAV6Barcod = "" ;
      sCtrlAV7Barcodreo = "" ;
      sCtrlAV8Barcodpar = "" ;
      sCtrlAV9RecLinMaq = "" ;
      sCtrlAV57RecLinpro = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.recetadetinte90__wc__default(),
         new Object[] {
             new Object[] {
            H029F2_A13232PrdRGB, H029F2_A4024RecMar, H029F2_A6018ProForFab, H029F2_n6018ProForFab, H029F2_A14055RecManAut, H029F2_A5725RecLote, H029F2_A3274RecPrdTnq, H029F2_A2394RecForNro, H029F2_A488ForPrdDsc, H029F2_n488ForPrdDsc,
            H029F2_A686PrdCant, H029F2_A431FacCon, H029F2_A490ForPrdUMe, H029F2_n490ForPrdUMe, H029F2_A719PrdNum, H029F2_n719PrdNum, H029F2_A875RecPrdDsc, H029F2_A872RecPrdNum, H029F2_A811RecLin, H029F2_A766ProForDsc,
            H029F2_A764ProForCod, H029F2_A1273RecLinPro, H029F2_A2804RecLinMaq, H029F2_A130BarCodPar, H029F2_A132BarCodReo, H029F2_A129BarCod, H029F2_A396EmprCod
            }
            , new Object[] {
            H029F3_AGRID_nRecordCount
            }
         }
      );
      AV69Pgmname = "RecetadeTinte90__WC" ;
      /* GeneXus formulas. */
      AV69Pgmname = "RecetadeTinte90__WC" ;
      Gx_err = (short)(0) ;
      edtavPrdrgb_Enabled = 0 ;
      edtavR_Enabled = 0 ;
      edtavG_Enabled = 0 ;
      edtavB_Enabled = 0 ;
      edtavR2_Enabled = 0 ;
      edtavG2_Enabled = 0 ;
      edtavB2_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOAV7Barcodreo ;
   private byte wcpOAV57RecLinpro ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV7Barcodreo ;
   private byte AV57RecLinpro ;
   private byte AV29TFRecLinPro ;
   private byte AV30TFRecLinPro_To ;
   private byte AV47TFRecForNro ;
   private byte AV48TFRecForNro_To ;
   private byte AV49TFRecPrdTnq ;
   private byte AV50TFRecPrdTnq_To ;
   private byte AV99Barcodreo_selected ;
   private byte AV102Reclinpro_selected ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte AV70Recetadetinte90__wcds_1_tfreclinpro ;
   private byte AV71Recetadetinte90__wcds_2_tfreclinpro_to ;
   private byte AV88Recetadetinte90__wcds_19_tfrecfornro ;
   private byte AV89Recetadetinte90__wcds_20_tfrecfornro_to ;
   private byte AV90Recetadetinte90__wcds_21_tfrecprdtnq ;
   private byte AV91Recetadetinte90__wcds_22_tfrecprdtnq_to ;
   private byte A132BarCodReo ;
   private byte A1273RecLinPro ;
   private byte A490ForPrdUMe ;
   private byte A2394RecForNro ;
   private byte A3274RecPrdTnq ;
   private byte A4024RecMar ;
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
   private short wcpOAV9RecLinMaq ;
   private short AV9RecLinMaq ;
   private short AV35TFRecLin ;
   private short AV36TFRecLin_To ;
   private short AV18OrderedBy ;
   private short AV101Reclinmaq_selected ;
   private short wbEnd ;
   private short wbStart ;
   private short AV76Recetadetinte90__wcds_7_tfreclin ;
   private short AV77Recetadetinte90__wcds_8_tfreclin_to ;
   private short AV58GridActionGroup1 ;
   private short A2804RecLinMaq ;
   private short A811RecLin ;
   private short AV22R ;
   private short AV23G ;
   private short AV24B ;
   private short AV25R2 ;
   private short AV26G2 ;
   private short AV27B2 ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short GXv_int8[] ;
   private short GXv_int9[] ;
   private short GXv_int10[] ;
   private short GXv_int11[] ;
   private short GXv_int12[] ;
   private short GXv_int13[] ;
   private int wcpOAV6Barcod ;
   private int nRC_GXsfl_20 ;
   private int AV6Barcod ;
   private int subGrid_Rows ;
   private int nGXsfl_20_idx=1 ;
   private int AV98Barcod_selected ;
   private int edtavPgmname_Enabled ;
   private int A129BarCod ;
   private int subGrid_Islastpage ;
   private int edtavPrdrgb_Enabled ;
   private int edtavR_Enabled ;
   private int edtavG_Enabled ;
   private int edtavB_Enabled ;
   private int edtavR2_Enabled ;
   private int edtavG2_Enabled ;
   private int edtavB2_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int edtRecPrdDsc_Backcolor ;
   private int edtRecPrdDsc_Forecolor ;
   private int AV96GXV1 ;
   private int nGXsfl_20_fel_idx=1 ;
   private int AV104GXV2 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavPrdrgb_Visible ;
   private int edtavR_Visible ;
   private int edtavG_Visible ;
   private int edtavB_Visible ;
   private int edtavR2_Visible ;
   private int edtavG2_Visible ;
   private int edtavB2_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long A13232PrdRGB ;
   private long AV21PrdRGB ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV41TFFacCon ;
   private java.math.BigDecimal AV42TFFacCon_To ;
   private java.math.BigDecimal AV43TFPrdCant ;
   private java.math.BigDecimal AV44TFPrdCant_To ;
   private java.math.BigDecimal AV82Recetadetinte90__wcds_13_tffaccon ;
   private java.math.BigDecimal AV83Recetadetinte90__wcds_14_tffaccon_to ;
   private java.math.BigDecimal AV84Recetadetinte90__wcds_15_tfprdcant ;
   private java.math.BigDecimal AV85Recetadetinte90__wcds_16_tfprdcant_to ;
   private java.math.BigDecimal A431FacCon ;
   private java.math.BigDecimal A686PrdCant ;
   private String wcpOAV5Emprcod ;
   private String wcpOAV8Barcodpar ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Dvelop_confirmpanel_eliminar_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV5Emprcod ;
   private String AV8Barcodpar ;
   private String sGXsfl_20_idx="0001" ;
   private String AV31TFProForCod ;
   private String AV32TFProForCod_Sel ;
   private String AV33TFProForDsc ;
   private String AV34TFProForDsc_Sel ;
   private String AV37TFRecPrdNum ;
   private String AV38TFRecPrdNum_Sel ;
   private String AV39TFRecPrdDsc ;
   private String AV40TFRecPrdDsc_Sel ;
   private String AV45TFForPrdDsc ;
   private String AV46TFForPrdDsc_Sel ;
   private String AV51TFRecLote ;
   private String AV52TFRecLote_Sel ;
   private String AV62TFRecManAut ;
   private String AV63TFRecManAut_Sel ;
   private String AV69Pgmname ;
   private String AV61UsurCod ;
   private String AV59Station ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV97Emprcod_selected ;
   private String AV100Barcodpar_selected ;
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
   private String Dvelop_confirmpanel_eliminar_Title ;
   private String Dvelop_confirmpanel_eliminar_Confirmationtext ;
   private String Dvelop_confirmpanel_eliminar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_eliminar_Confirmtype ;
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Infinitescrolling ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTableactions_Internalname ;
   private String TempTags ;
   private String bttBtnuseraction1_Internalname ;
   private String bttBtnuseraction1_Jsonclick ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV72Recetadetinte90__wcds_3_tfproforcod ;
   private String AV73Recetadetinte90__wcds_4_tfproforcod_sel ;
   private String AV74Recetadetinte90__wcds_5_tfprofordsc ;
   private String AV75Recetadetinte90__wcds_6_tfprofordsc_sel ;
   private String AV78Recetadetinte90__wcds_9_tfrecprdnum ;
   private String AV79Recetadetinte90__wcds_10_tfrecprdnum_sel ;
   private String AV80Recetadetinte90__wcds_11_tfrecprddsc ;
   private String AV81Recetadetinte90__wcds_12_tfrecprddsc_sel ;
   private String AV86Recetadetinte90__wcds_17_tfforprddsc ;
   private String AV87Recetadetinte90__wcds_18_tfforprddsc_sel ;
   private String AV92Recetadetinte90__wcds_23_tfreclote ;
   private String AV93Recetadetinte90__wcds_24_tfreclote_sel ;
   private String AV94Recetadetinte90__wcds_25_tfrecmanaut ;
   private String AV95Recetadetinte90__wcds_26_tfrecmanaut_sel ;
   private String A396EmprCod ;
   private String edtEmprCod_Internalname ;
   private String edtBarCod_Internalname ;
   private String edtBarCodReo_Internalname ;
   private String A130BarCodPar ;
   private String edtBarCodPar_Internalname ;
   private String edtRecLinMaq_Internalname ;
   private String edtRecLinPro_Internalname ;
   private String A764ProForCod ;
   private String edtProForCod_Internalname ;
   private String A766ProForDsc ;
   private String edtProForDsc_Internalname ;
   private String edtRecLin_Internalname ;
   private String A872RecPrdNum ;
   private String edtRecPrdNum_Internalname ;
   private String A875RecPrdDsc ;
   private String edtRecPrdDsc_Internalname ;
   private String A719PrdNum ;
   private String edtPrdNum_Internalname ;
   private String edtForPrdUMe_Internalname ;
   private String edtFacCon_Internalname ;
   private String edtPrdCant_Internalname ;
   private String A488ForPrdDsc ;
   private String edtForPrdDsc_Internalname ;
   private String edtRecForNro_Internalname ;
   private String edtRecPrdTnq_Internalname ;
   private String A5725RecLote ;
   private String edtRecLote_Internalname ;
   private String A14055RecManAut ;
   private String edtRecManAut_Internalname ;
   private String edtavPrdrgb_Internalname ;
   private String edtavR_Internalname ;
   private String edtavG_Internalname ;
   private String edtavB_Internalname ;
   private String edtavR2_Internalname ;
   private String edtavG2_Internalname ;
   private String edtavB2_Internalname ;
   private String A6018ProForFab ;
   private String edtProForFab_Internalname ;
   private String edtRecMar_Internalname ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String lV72Recetadetinte90__wcds_3_tfproforcod ;
   private String lV74Recetadetinte90__wcds_5_tfprofordsc ;
   private String lV78Recetadetinte90__wcds_9_tfrecprdnum ;
   private String lV80Recetadetinte90__wcds_11_tfrecprddsc ;
   private String lV86Recetadetinte90__wcds_17_tfforprddsc ;
   private String lV92Recetadetinte90__wcds_23_tfreclote ;
   private String lV94Recetadetinte90__wcds_25_tfrecmanaut ;
   private String hsh ;
   private String AV60EmprNom ;
   private String Dvelop_confirmpanel_eliminar_Internalname ;
   private String sGXsfl_20_fel_idx="0001" ;
   private String GXt_char22 ;
   private String GXv_char23[] ;
   private String GXt_char20 ;
   private String GXv_char21[] ;
   private String GXt_char18 ;
   private String GXv_char19[] ;
   private String GXt_char16 ;
   private String GXv_char17[] ;
   private String GXt_char15 ;
   private String GXv_char4[] ;
   private String GXt_char14 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblTabledvelop_confirmpanel_eliminar_Internalname ;
   private String sCtrlAV5Emprcod ;
   private String sCtrlAV6Barcod ;
   private String sCtrlAV7Barcodreo ;
   private String sCtrlAV8Barcodpar ;
   private String sCtrlAV9RecLinMaq ;
   private String sCtrlAV57RecLinpro ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtEmprCod_Jsonclick ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
   private String edtRecLinMaq_Jsonclick ;
   private String edtRecLinPro_Jsonclick ;
   private String edtProForCod_Jsonclick ;
   private String edtProForDsc_Jsonclick ;
   private String edtRecLin_Jsonclick ;
   private String edtRecPrdNum_Jsonclick ;
   private String edtRecPrdDsc_Jsonclick ;
   private String edtPrdNum_Jsonclick ;
   private String edtForPrdUMe_Jsonclick ;
   private String edtFacCon_Jsonclick ;
   private String edtPrdCant_Jsonclick ;
   private String edtForPrdDsc_Jsonclick ;
   private String edtRecForNro_Jsonclick ;
   private String edtRecPrdTnq_Jsonclick ;
   private String edtRecLote_Jsonclick ;
   private String edtRecManAut_Jsonclick ;
   private String edtavPrdrgb_Jsonclick ;
   private String edtavR_Jsonclick ;
   private String edtavG_Jsonclick ;
   private String edtavB_Jsonclick ;
   private String edtavR2_Jsonclick ;
   private String edtavG2_Jsonclick ;
   private String edtavB2_Jsonclick ;
   private String edtProForFab_Jsonclick ;
   private String edtRecMar_Jsonclick ;
   private String subGrid_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV19OrderedDsc ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean AV64Selected ;
   private boolean n719PrdNum ;
   private boolean n490ForPrdUMe ;
   private boolean n488ForPrdDsc ;
   private boolean n6018ProForFab ;
   private boolean bGXsfl_20_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV13HTTPRequest ;
   private com.genexus.webpanels.WebSession AV28Session ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminar ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkavSelected ;
   private HTMLChoice cmbavGridactiongroup1 ;
   private IDataStoreProvider pr_default ;
   private long[] H029F2_A13232PrdRGB ;
   private byte[] H029F2_A4024RecMar ;
   private String[] H029F2_A6018ProForFab ;
   private boolean[] H029F2_n6018ProForFab ;
   private String[] H029F2_A14055RecManAut ;
   private String[] H029F2_A5725RecLote ;
   private byte[] H029F2_A3274RecPrdTnq ;
   private byte[] H029F2_A2394RecForNro ;
   private String[] H029F2_A488ForPrdDsc ;
   private boolean[] H029F2_n488ForPrdDsc ;
   private java.math.BigDecimal[] H029F2_A686PrdCant ;
   private java.math.BigDecimal[] H029F2_A431FacCon ;
   private byte[] H029F2_A490ForPrdUMe ;
   private boolean[] H029F2_n490ForPrdUMe ;
   private String[] H029F2_A719PrdNum ;
   private boolean[] H029F2_n719PrdNum ;
   private String[] H029F2_A875RecPrdDsc ;
   private String[] H029F2_A872RecPrdNum ;
   private short[] H029F2_A811RecLin ;
   private String[] H029F2_A766ProForDsc ;
   private String[] H029F2_A764ProForCod ;
   private byte[] H029F2_A1273RecLinPro ;
   private short[] H029F2_A2804RecLinMaq ;
   private String[] H029F2_A130BarCodPar ;
   private byte[] H029F2_A132BarCodReo ;
   private int[] H029F2_A129BarCod ;
   private String[] H029F2_A396EmprCod ;
   private long[] H029F3_AGRID_nRecordCount ;
   private GXBaseCollection<app.SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem> AV65SelectedRows ;
   private app.wwpbaseobjects.SdtWWPContext AV12WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV14TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV16GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState24[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV17GridStateFilterValue ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV53DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.SdtRecetadeTinte90__WCSDT_RecetadeTinte90__WCSDTItem AV66SelectedRow ;
}

final  class recetadetinte90__wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H029F2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV70Recetadetinte90__wcds_1_tfreclinpro ,
                                          byte AV71Recetadetinte90__wcds_2_tfreclinpro_to ,
                                          String AV73Recetadetinte90__wcds_4_tfproforcod_sel ,
                                          String AV72Recetadetinte90__wcds_3_tfproforcod ,
                                          String AV75Recetadetinte90__wcds_6_tfprofordsc_sel ,
                                          String AV74Recetadetinte90__wcds_5_tfprofordsc ,
                                          short AV76Recetadetinte90__wcds_7_tfreclin ,
                                          short AV77Recetadetinte90__wcds_8_tfreclin_to ,
                                          String AV79Recetadetinte90__wcds_10_tfrecprdnum_sel ,
                                          String AV78Recetadetinte90__wcds_9_tfrecprdnum ,
                                          String AV81Recetadetinte90__wcds_12_tfrecprddsc_sel ,
                                          String AV80Recetadetinte90__wcds_11_tfrecprddsc ,
                                          java.math.BigDecimal AV82Recetadetinte90__wcds_13_tffaccon ,
                                          java.math.BigDecimal AV83Recetadetinte90__wcds_14_tffaccon_to ,
                                          java.math.BigDecimal AV84Recetadetinte90__wcds_15_tfprdcant ,
                                          java.math.BigDecimal AV85Recetadetinte90__wcds_16_tfprdcant_to ,
                                          String AV87Recetadetinte90__wcds_18_tfforprddsc_sel ,
                                          String AV86Recetadetinte90__wcds_17_tfforprddsc ,
                                          byte AV88Recetadetinte90__wcds_19_tfrecfornro ,
                                          byte AV89Recetadetinte90__wcds_20_tfrecfornro_to ,
                                          byte AV90Recetadetinte90__wcds_21_tfrecprdtnq ,
                                          byte AV91Recetadetinte90__wcds_22_tfrecprdtnq_to ,
                                          String AV93Recetadetinte90__wcds_24_tfreclote_sel ,
                                          String AV92Recetadetinte90__wcds_23_tfreclote ,
                                          String AV95Recetadetinte90__wcds_26_tfrecmanaut_sel ,
                                          String AV94Recetadetinte90__wcds_25_tfrecmanaut ,
                                          byte A1273RecLinPro ,
                                          String A764ProForCod ,
                                          String A766ProForDsc ,
                                          short A811RecLin ,
                                          String A872RecPrdNum ,
                                          String A875RecPrdDsc ,
                                          java.math.BigDecimal A431FacCon ,
                                          java.math.BigDecimal A686PrdCant ,
                                          String A488ForPrdDsc ,
                                          byte A2394RecForNro ,
                                          byte A3274RecPrdTnq ,
                                          String A5725RecLote ,
                                          String A14055RecManAut ,
                                          short AV18OrderedBy ,
                                          boolean AV19OrderedDsc ,
                                          String AV5Emprcod ,
                                          int AV6Barcod ,
                                          byte AV7Barcodreo ,
                                          String AV8Barcodpar ,
                                          short AV9RecLinMaq ,
                                          byte AV57RecLinpro ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          short A2804RecLinMaq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int25 = new byte[37];
      Object[] GXv_Object26 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " /*+ FIRST_ROWS(51) */ T2.PrdRGB, T1.RecMar, T5.ProForFab, T1.RecManAut, T1.RecLote, T1.RecPrdTnq, T1.RecForNro, T3.ForPrdDsc, T1.PrdCant, T1.FacCon, T1.ForPrdUMe," ;
      sSelectString += " T1.PrdNum, T1.RecPrdDsc, T1.RecPrdNum, T1.RecLin, T5.ProForDsc, T4.ProForCod, T1.RecLinPro, T1.RecLinMaq, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod" ;
      sFromString = " FROM ((((TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe" ;
      sFromString += " = T1.ForPrdUMe) INNER JOIN TXPCRECET T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar AND" ;
      sFromString += " T4.RecLinMaq = T1.RecLinMaq AND T4.RecLinPro = T1.RecLinPro) LEFT JOIN TXPCPROFO T5 ON T5.EmprCod = T1.EmprCod AND T5.ProForCod = T4.ProForCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? and T1.RecLinPro = ?)");
      if ( ! (0==AV70Recetadetinte90__wcds_1_tfreclinpro) )
      {
         addWhere(sWhereString, "(T1.RecLinPro >= ?)");
      }
      else
      {
         GXv_int25[6] = (byte)(1) ;
      }
      if ( ! (0==AV71Recetadetinte90__wcds_2_tfreclinpro_to) )
      {
         addWhere(sWhereString, "(T1.RecLinPro <= ?)");
      }
      else
      {
         GXv_int25[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Recetadetinte90__wcds_4_tfproforcod_sel)==0) && ( ! (GXutil.strcmp("", AV72Recetadetinte90__wcds_3_tfproforcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProForCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Recetadetinte90__wcds_4_tfproforcod_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProForCod = ?)");
      }
      else
      {
         GXv_int25[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Recetadetinte90__wcds_6_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV74Recetadetinte90__wcds_5_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Recetadetinte90__wcds_6_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(T5.ProForDsc = ?)");
      }
      else
      {
         GXv_int25[11] = (byte)(1) ;
      }
      if ( ! (0==AV76Recetadetinte90__wcds_7_tfreclin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int25[12] = (byte)(1) ;
      }
      if ( ! (0==AV77Recetadetinte90__wcds_8_tfreclin_to) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int25[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Recetadetinte90__wcds_10_tfrecprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV78Recetadetinte90__wcds_9_tfrecprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Recetadetinte90__wcds_10_tfrecprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int25[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Recetadetinte90__wcds_12_tfrecprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV80Recetadetinte90__wcds_11_tfrecprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Recetadetinte90__wcds_12_tfrecprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int25[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Recetadetinte90__wcds_13_tffaccon)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon >= ?)");
      }
      else
      {
         GXv_int25[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Recetadetinte90__wcds_14_tffaccon_to)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon <= ?)");
      }
      else
      {
         GXv_int25[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Recetadetinte90__wcds_15_tfprdcant)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant >= ?)");
      }
      else
      {
         GXv_int25[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Recetadetinte90__wcds_16_tfprdcant_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant <= ?)");
      }
      else
      {
         GXv_int25[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Recetadetinte90__wcds_18_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV86Recetadetinte90__wcds_17_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Recetadetinte90__wcds_18_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int25[23] = (byte)(1) ;
      }
      if ( ! (0==AV88Recetadetinte90__wcds_19_tfrecfornro) )
      {
         addWhere(sWhereString, "(T1.RecForNro >= ?)");
      }
      else
      {
         GXv_int25[24] = (byte)(1) ;
      }
      if ( ! (0==AV89Recetadetinte90__wcds_20_tfrecfornro_to) )
      {
         addWhere(sWhereString, "(T1.RecForNro <= ?)");
      }
      else
      {
         GXv_int25[25] = (byte)(1) ;
      }
      if ( ! (0==AV90Recetadetinte90__wcds_21_tfrecprdtnq) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq >= ?)");
      }
      else
      {
         GXv_int25[26] = (byte)(1) ;
      }
      if ( ! (0==AV91Recetadetinte90__wcds_22_tfrecprdtnq_to) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq <= ?)");
      }
      else
      {
         GXv_int25[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Recetadetinte90__wcds_24_tfreclote_sel)==0) && ( ! (GXutil.strcmp("", AV92Recetadetinte90__wcds_23_tfreclote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Recetadetinte90__wcds_24_tfreclote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecLote = ?)");
      }
      else
      {
         GXv_int25[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Recetadetinte90__wcds_26_tfrecmanaut_sel)==0) && ( ! (GXutil.strcmp("", AV94Recetadetinte90__wcds_25_tfrecmanaut)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecManAut) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Recetadetinte90__wcds_26_tfrecmanaut_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecManAut = ?)");
      }
      else
      {
         GXv_int25[31] = (byte)(1) ;
      }
      if ( AV18OrderedBy == 1 )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T1.RecLin" ;
      }
      else if ( ( AV18OrderedBy == 2 ) && ! AV19OrderedDsc )
      {
         sOrderString += " ORDER BY T1.RecLinPro" ;
      }
      else if ( ( AV18OrderedBy == 2 ) && ( AV19OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.RecLinPro DESC" ;
      }
      else if ( ( AV18OrderedBy == 3 ) && ! AV19OrderedDsc )
      {
         sOrderString += " ORDER BY T4.ProForCod" ;
      }
      else if ( ( AV18OrderedBy == 3 ) && ( AV19OrderedDsc ) )
      {
         sOrderString += " ORDER BY T4.ProForCod DESC" ;
      }
      else if ( ( AV18OrderedBy == 4 ) && ! AV19OrderedDsc )
      {
         sOrderString += " ORDER BY T5.ProForDsc" ;
      }
      else if ( ( AV18OrderedBy == 4 ) && ( AV19OrderedDsc ) )
      {
         sOrderString += " ORDER BY T5.ProForDsc DESC" ;
      }
      else if ( ( AV18OrderedBy == 5 ) && ! AV19OrderedDsc )
      {
         sOrderString += " ORDER BY T1.RecLin" ;
      }
      else if ( ( AV18OrderedBy == 5 ) && ( AV19OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.RecLin DESC" ;
      }
      else if ( ( AV18OrderedBy == 6 ) && ! AV19OrderedDsc )
      {
         sOrderString += " ORDER BY T1.RecPrdNum" ;
      }
      else if ( ( AV18OrderedBy == 6 ) && ( AV19OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.RecPrdNum DESC" ;
      }
      else if ( ( AV18OrderedBy == 7 ) && ! AV19OrderedDsc )
      {
         sOrderString += " ORDER BY T1.RecPrdDsc" ;
      }
      else if ( ( AV18OrderedBy == 7 ) && ( AV19OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.RecPrdDsc DESC" ;
      }
      else if ( ( AV18OrderedBy == 8 ) && ! AV19OrderedDsc )
      {
         sOrderString += " ORDER BY T1.FacCon" ;
      }
      else if ( ( AV18OrderedBy == 8 ) && ( AV19OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.FacCon DESC" ;
      }
      else if ( ( AV18OrderedBy == 9 ) && ! AV19OrderedDsc )
      {
         sOrderString += " ORDER BY T1.PrdCant" ;
      }
      else if ( ( AV18OrderedBy == 9 ) && ( AV19OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.PrdCant DESC" ;
      }
      else if ( ( AV18OrderedBy == 10 ) && ! AV19OrderedDsc )
      {
         sOrderString += " ORDER BY T3.ForPrdDsc" ;
      }
      else if ( ( AV18OrderedBy == 10 ) && ( AV19OrderedDsc ) )
      {
         sOrderString += " ORDER BY T3.ForPrdDsc DESC" ;
      }
      else if ( ( AV18OrderedBy == 11 ) && ! AV19OrderedDsc )
      {
         sOrderString += " ORDER BY T1.RecForNro" ;
      }
      else if ( ( AV18OrderedBy == 11 ) && ( AV19OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.RecForNro DESC" ;
      }
      else if ( ( AV18OrderedBy == 12 ) && ! AV19OrderedDsc )
      {
         sOrderString += " ORDER BY T1.RecPrdTnq" ;
      }
      else if ( ( AV18OrderedBy == 12 ) && ( AV19OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.RecPrdTnq DESC" ;
      }
      else if ( ( AV18OrderedBy == 13 ) && ! AV19OrderedDsc )
      {
         sOrderString += " ORDER BY T1.RecLote" ;
      }
      else if ( ( AV18OrderedBy == 13 ) && ( AV19OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.RecLote DESC" ;
      }
      else if ( ( AV18OrderedBy == 14 ) && ! AV19OrderedDsc )
      {
         sOrderString += " ORDER BY T1.RecManAut" ;
      }
      else if ( ( AV18OrderedBy == 14 ) && ( AV19OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.RecManAut DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T1.RecLin" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object26[0] = scmdbuf ;
      GXv_Object26[1] = GXv_int25 ;
      return GXv_Object26 ;
   }

   protected Object[] conditional_H029F3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV70Recetadetinte90__wcds_1_tfreclinpro ,
                                          byte AV71Recetadetinte90__wcds_2_tfreclinpro_to ,
                                          String AV73Recetadetinte90__wcds_4_tfproforcod_sel ,
                                          String AV72Recetadetinte90__wcds_3_tfproforcod ,
                                          String AV75Recetadetinte90__wcds_6_tfprofordsc_sel ,
                                          String AV74Recetadetinte90__wcds_5_tfprofordsc ,
                                          short AV76Recetadetinte90__wcds_7_tfreclin ,
                                          short AV77Recetadetinte90__wcds_8_tfreclin_to ,
                                          String AV79Recetadetinte90__wcds_10_tfrecprdnum_sel ,
                                          String AV78Recetadetinte90__wcds_9_tfrecprdnum ,
                                          String AV81Recetadetinte90__wcds_12_tfrecprddsc_sel ,
                                          String AV80Recetadetinte90__wcds_11_tfrecprddsc ,
                                          java.math.BigDecimal AV82Recetadetinte90__wcds_13_tffaccon ,
                                          java.math.BigDecimal AV83Recetadetinte90__wcds_14_tffaccon_to ,
                                          java.math.BigDecimal AV84Recetadetinte90__wcds_15_tfprdcant ,
                                          java.math.BigDecimal AV85Recetadetinte90__wcds_16_tfprdcant_to ,
                                          String AV87Recetadetinte90__wcds_18_tfforprddsc_sel ,
                                          String AV86Recetadetinte90__wcds_17_tfforprddsc ,
                                          byte AV88Recetadetinte90__wcds_19_tfrecfornro ,
                                          byte AV89Recetadetinte90__wcds_20_tfrecfornro_to ,
                                          byte AV90Recetadetinte90__wcds_21_tfrecprdtnq ,
                                          byte AV91Recetadetinte90__wcds_22_tfrecprdtnq_to ,
                                          String AV93Recetadetinte90__wcds_24_tfreclote_sel ,
                                          String AV92Recetadetinte90__wcds_23_tfreclote ,
                                          String AV95Recetadetinte90__wcds_26_tfrecmanaut_sel ,
                                          String AV94Recetadetinte90__wcds_25_tfrecmanaut ,
                                          byte A1273RecLinPro ,
                                          String A764ProForCod ,
                                          String A766ProForDsc ,
                                          short A811RecLin ,
                                          String A872RecPrdNum ,
                                          String A875RecPrdDsc ,
                                          java.math.BigDecimal A431FacCon ,
                                          java.math.BigDecimal A686PrdCant ,
                                          String A488ForPrdDsc ,
                                          byte A2394RecForNro ,
                                          byte A3274RecPrdTnq ,
                                          String A5725RecLote ,
                                          String A14055RecManAut ,
                                          short AV18OrderedBy ,
                                          boolean AV19OrderedDsc ,
                                          String AV5Emprcod ,
                                          int AV6Barcod ,
                                          byte AV7Barcodreo ,
                                          String AV8Barcodpar ,
                                          short AV9RecLinMaq ,
                                          byte AV57RecLinpro ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          short A2804RecLinMaq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int27 = new byte[32];
      Object[] GXv_Object28 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM ((((TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.ForPrdUMe = T1.ForPrdUMe) INNER JOIN TXPCRECET T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar =" ;
      scmdbuf += " T1.BarCodPar AND T4.RecLinMaq = T1.RecLinMaq AND T4.RecLinPro = T1.RecLinPro) LEFT JOIN TXPCPROFO T5 ON T5.EmprCod = T1.EmprCod AND T5.ProForCod = T4.ProForCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? and T1.RecLinPro = ?)");
      if ( ! (0==AV70Recetadetinte90__wcds_1_tfreclinpro) )
      {
         addWhere(sWhereString, "(T1.RecLinPro >= ?)");
      }
      else
      {
         GXv_int27[6] = (byte)(1) ;
      }
      if ( ! (0==AV71Recetadetinte90__wcds_2_tfreclinpro_to) )
      {
         addWhere(sWhereString, "(T1.RecLinPro <= ?)");
      }
      else
      {
         GXv_int27[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Recetadetinte90__wcds_4_tfproforcod_sel)==0) && ( ! (GXutil.strcmp("", AV72Recetadetinte90__wcds_3_tfproforcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProForCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Recetadetinte90__wcds_4_tfproforcod_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProForCod = ?)");
      }
      else
      {
         GXv_int27[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Recetadetinte90__wcds_6_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV74Recetadetinte90__wcds_5_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Recetadetinte90__wcds_6_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(T5.ProForDsc = ?)");
      }
      else
      {
         GXv_int27[11] = (byte)(1) ;
      }
      if ( ! (0==AV76Recetadetinte90__wcds_7_tfreclin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int27[12] = (byte)(1) ;
      }
      if ( ! (0==AV77Recetadetinte90__wcds_8_tfreclin_to) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int27[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Recetadetinte90__wcds_10_tfrecprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV78Recetadetinte90__wcds_9_tfrecprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Recetadetinte90__wcds_10_tfrecprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int27[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Recetadetinte90__wcds_12_tfrecprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV80Recetadetinte90__wcds_11_tfrecprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Recetadetinte90__wcds_12_tfrecprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int27[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Recetadetinte90__wcds_13_tffaccon)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon >= ?)");
      }
      else
      {
         GXv_int27[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Recetadetinte90__wcds_14_tffaccon_to)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon <= ?)");
      }
      else
      {
         GXv_int27[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Recetadetinte90__wcds_15_tfprdcant)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant >= ?)");
      }
      else
      {
         GXv_int27[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Recetadetinte90__wcds_16_tfprdcant_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant <= ?)");
      }
      else
      {
         GXv_int27[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Recetadetinte90__wcds_18_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV86Recetadetinte90__wcds_17_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Recetadetinte90__wcds_18_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int27[23] = (byte)(1) ;
      }
      if ( ! (0==AV88Recetadetinte90__wcds_19_tfrecfornro) )
      {
         addWhere(sWhereString, "(T1.RecForNro >= ?)");
      }
      else
      {
         GXv_int27[24] = (byte)(1) ;
      }
      if ( ! (0==AV89Recetadetinte90__wcds_20_tfrecfornro_to) )
      {
         addWhere(sWhereString, "(T1.RecForNro <= ?)");
      }
      else
      {
         GXv_int27[25] = (byte)(1) ;
      }
      if ( ! (0==AV90Recetadetinte90__wcds_21_tfrecprdtnq) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq >= ?)");
      }
      else
      {
         GXv_int27[26] = (byte)(1) ;
      }
      if ( ! (0==AV91Recetadetinte90__wcds_22_tfrecprdtnq_to) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq <= ?)");
      }
      else
      {
         GXv_int27[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Recetadetinte90__wcds_24_tfreclote_sel)==0) && ( ! (GXutil.strcmp("", AV92Recetadetinte90__wcds_23_tfreclote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Recetadetinte90__wcds_24_tfreclote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecLote = ?)");
      }
      else
      {
         GXv_int27[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Recetadetinte90__wcds_26_tfrecmanaut_sel)==0) && ( ! (GXutil.strcmp("", AV94Recetadetinte90__wcds_25_tfrecmanaut)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecManAut) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Recetadetinte90__wcds_26_tfrecmanaut_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecManAut = ?)");
      }
      else
      {
         GXv_int27[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV18OrderedBy == 1 )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 2 ) && ! AV19OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 2 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 3 ) && ! AV19OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 3 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 4 ) && ! AV19OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 4 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 5 ) && ! AV19OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 5 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 6 ) && ! AV19OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 6 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 7 ) && ! AV19OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 7 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 8 ) && ! AV19OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 8 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 9 ) && ! AV19OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 9 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 10 ) && ! AV19OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 10 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 11 ) && ! AV19OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 11 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 12 ) && ! AV19OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 12 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 13 ) && ! AV19OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 13 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 14 ) && ! AV19OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 14 ) && ( AV19OrderedDsc ) )
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
                  return conditional_H029F2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).byteValue() , ((Number) dynConstraints[36]).byteValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).shortValue() , ((Boolean) dynConstraints[40]).booleanValue() , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).byteValue() , (String)dynConstraints[44] , ((Number) dynConstraints[45]).shortValue() , ((Number) dynConstraints[46]).byteValue() , (String)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).byteValue() , (String)dynConstraints[50] , ((Number) dynConstraints[51]).shortValue() );
            case 1 :
                  return conditional_H029F3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).byteValue() , ((Number) dynConstraints[36]).byteValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).shortValue() , ((Boolean) dynConstraints[40]).booleanValue() , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).byteValue() , (String)dynConstraints[44] , ((Number) dynConstraints[45]).shortValue() , ((Number) dynConstraints[46]).byteValue() , (String)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).byteValue() , (String)dynConstraints[50] , ((Number) dynConstraints[51]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H029F2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,51, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H029F3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((String[]) buf[5])[0] = rslt.getString(5, 26);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,3);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,5);
               ((byte[]) buf[12])[0] = rslt.getByte(11);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(12, 6);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(13, 26);
               ((String[]) buf[17])[0] = rslt.getString(14, 6);
               ((short[]) buf[18])[0] = rslt.getShort(15);
               ((String[]) buf[19])[0] = rslt.getString(16, 30);
               ((String[]) buf[20])[0] = rslt.getString(17, 6);
               ((byte[]) buf[21])[0] = rslt.getByte(18);
               ((short[]) buf[22])[0] = rslt.getShort(19);
               ((String[]) buf[23])[0] = rslt.getString(20, 1);
               ((byte[]) buf[24])[0] = rslt.getByte(21);
               ((int[]) buf[25])[0] = rslt.getInt(22);
               ((String[]) buf[26])[0] = rslt.getString(23, 3);
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
                  stmt.setString(sIdx, (String)parms[37], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[43]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[44]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[49]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[50]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 5);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 5);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 3);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[58], 3);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 5);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 5);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[61]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[62]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[63]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[64]).byteValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 26);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 1);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[34]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[36]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 5);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 5);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 3);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 3);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 5);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 5);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[56]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[57]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[58]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 26);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 26);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 1);
               }
               return;
      }
   }

}

