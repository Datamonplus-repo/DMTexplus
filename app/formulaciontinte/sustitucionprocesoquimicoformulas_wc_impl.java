package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class sustitucionprocesoquimicoformulas_wc_impl extends GXWebComponent
{
   public sustitucionprocesoquimicoformulas_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public sustitucionprocesoquimicoformulas_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( sustitucionprocesoquimicoformulas_wc_impl.class ));
   }

   public sustitucionprocesoquimicoformulas_wc_impl( int remoteHandle ,
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
               AV66Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66Emprcod", AV66Emprcod);
               AV67Clicod = (int)(GXutil.lval( httpContext.GetPar( "Clicod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67Clicod), 6, 0));
               AV68Clicod_to = (short)(GXutil.lval( httpContext.GetPar( "Clicod_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68Clicod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68Clicod_to), 4, 0));
               AV69ForColNom = httpContext.GetPar( "ForColNom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69ForColNom", AV69ForColNom);
               AV70ForColNom_to = httpContext.GetPar( "ForColNom_to") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70ForColNom_to", AV70ForColNom_to);
               AV71ForColNum = (int)(GXutil.lval( httpContext.GetPar( "ForColNum"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71ForColNum), 6, 0));
               AV72ForColNum_to = (int)(GXutil.lval( httpContext.GetPar( "ForColNum_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72ForColNum_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72ForColNum_to), 6, 0));
               AV73ForSer = httpContext.GetPar( "ForSer") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73ForSer", AV73ForSer);
               AV74ForSer_to = httpContext.GetPar( "ForSer_to") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74ForSer_to", AV74ForSer_to);
               AV75IntCod = (byte)(GXutil.lval( httpContext.GetPar( "IntCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV75IntCod), 2, 0));
               AV76IntCod_to = (byte)(GXutil.lval( httpContext.GetPar( "IntCod_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76IntCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV76IntCod_to), 2, 0));
               AV77MatCod = (short)(GXutil.lval( httpContext.GetPar( "MatCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77MatCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77MatCod), 3, 0));
               AV78MatCod_to = (short)(GXutil.lval( httpContext.GetPar( "MatCod_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78MatCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV78MatCod_to), 3, 0));
               AV79TipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV79TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79TipColCod), 2, 0));
               AV80TipColCod_to = (short)(GXutil.lval( httpContext.GetPar( "TipColCod_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80TipColCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80TipColCod_to), 4, 0));
               AV81ProForCod = httpContext.GetPar( "ProForCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81ProForCod", AV81ProForCod);
               AV82ProForCodDestino = httpContext.GetPar( "ProForCodDestino") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82ProForCodDestino", AV82ProForCodDestino);
               AV83ProForDsc = httpContext.GetPar( "ProForDsc") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83ProForDsc", AV83ProForDsc);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV66Emprcod,Integer.valueOf(AV67Clicod),Short.valueOf(AV68Clicod_to),AV69ForColNom,AV70ForColNom_to,Integer.valueOf(AV71ForColNum),Integer.valueOf(AV72ForColNum_to),AV73ForSer,AV74ForSer_to,Byte.valueOf(AV75IntCod),Byte.valueOf(AV76IntCod_to),Short.valueOf(AV77MatCod),Short.valueOf(AV78MatCod_to),Byte.valueOf(AV79TipColCod),Short.valueOf(AV80TipColCod_to),AV81ProForCod,AV82ProForCodDestino,AV83ProForDsc});
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
      nRC_GXsfl_23 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_23"))) ;
      nGXsfl_23_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_23_idx"))) ;
      sGXsfl_23_idx = httpContext.GetPar( "sGXsfl_23_idx") ;
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
      AV66Emprcod = httpContext.GetPar( "Emprcod") ;
      AV67Clicod = (int)(GXutil.lval( httpContext.GetPar( "Clicod"))) ;
      AV68Clicod_to = (short)(GXutil.lval( httpContext.GetPar( "Clicod_to"))) ;
      AV69ForColNom = httpContext.GetPar( "ForColNom") ;
      AV70ForColNom_to = httpContext.GetPar( "ForColNom_to") ;
      AV71ForColNum = (int)(GXutil.lval( httpContext.GetPar( "ForColNum"))) ;
      AV72ForColNum_to = (int)(GXutil.lval( httpContext.GetPar( "ForColNum_to"))) ;
      AV73ForSer = httpContext.GetPar( "ForSer") ;
      AV74ForSer_to = httpContext.GetPar( "ForSer_to") ;
      AV75IntCod = (byte)(GXutil.lval( httpContext.GetPar( "IntCod"))) ;
      AV76IntCod_to = (byte)(GXutil.lval( httpContext.GetPar( "IntCod_to"))) ;
      AV77MatCod = (short)(GXutil.lval( httpContext.GetPar( "MatCod"))) ;
      AV78MatCod_to = (short)(GXutil.lval( httpContext.GetPar( "MatCod_to"))) ;
      AV79TipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod"))) ;
      AV80TipColCod_to = (short)(GXutil.lval( httpContext.GetPar( "TipColCod_to"))) ;
      AV81ProForCod = httpContext.GetPar( "ProForCod") ;
      AV28TFCliCod = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod"))) ;
      AV29TFCliCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod_To"))) ;
      AV62TFCliNom = httpContext.GetPar( "TFCliNom") ;
      AV63TFCliNom_Sel = httpContext.GetPar( "TFCliNom_Sel") ;
      AV30TFForSer = httpContext.GetPar( "TFForSer") ;
      AV31TFForSer_Sel = httpContext.GetPar( "TFForSer_Sel") ;
      AV64TFForSerDsc = httpContext.GetPar( "TFForSerDsc") ;
      AV65TFForSerDsc_Sel = httpContext.GetPar( "TFForSerDsc_Sel") ;
      AV32TFForColNom = httpContext.GetPar( "TFForColNom") ;
      AV33TFForColNom_Sel = httpContext.GetPar( "TFForColNom_Sel") ;
      AV34TFForColNum = (int)(GXutil.lval( httpContext.GetPar( "TFForColNum"))) ;
      AV35TFForColNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFForColNum_To"))) ;
      AV36TFTipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TFTipColCod"))) ;
      AV37TFTipColCod_To = (byte)(GXutil.lval( httpContext.GetPar( "TFTipColCod_To"))) ;
      AV88TFIntDsc = httpContext.GetPar( "TFIntDsc") ;
      AV89TFIntDsc_Sel = httpContext.GetPar( "TFIntDsc_Sel") ;
      AV86TFMatDsc = httpContext.GetPar( "TFMatDsc") ;
      AV87TFMatDsc_Sel = httpContext.GetPar( "TFMatDsc_Sel") ;
      AV92Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV82ProForCodDestino = httpContext.GetPar( "ProForCodDestino") ;
      AV83ProForDsc = httpContext.GetPar( "ProForDsc") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV66Emprcod, AV67Clicod, AV68Clicod_to, AV69ForColNom, AV70ForColNom_to, AV71ForColNum, AV72ForColNum_to, AV73ForSer, AV74ForSer_to, AV75IntCod, AV76IntCod_to, AV77MatCod, AV78MatCod_to, AV79TipColCod, AV80TipColCod_to, AV81ProForCod, AV28TFCliCod, AV29TFCliCod_To, AV62TFCliNom, AV63TFCliNom_Sel, AV30TFForSer, AV31TFForSer_Sel, AV64TFForSerDsc, AV65TFForSerDsc_Sel, AV32TFForColNom, AV33TFForColNom_Sel, AV34TFForColNum, AV35TFForColNum_To, AV36TFTipColCod, AV37TFTipColCod_To, AV88TFIntDsc, AV89TFIntDsc_Sel, AV86TFMatDsc, AV87TFMatDsc_Sel, AV92Pgmname, AV12OrderedBy, AV13OrderedDsc, AV82ProForCodDestino, AV83ProForDsc, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1K72( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Sustitucion Proceso Quimico Formulas", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.sustitucionprocesoquimicoformulas_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV66Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV67Clicod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV68Clicod_to,4,0)),GXutil.URLEncode(GXutil.rtrim(AV69ForColNom)),GXutil.URLEncode(GXutil.rtrim(AV70ForColNom_to)),GXutil.URLEncode(GXutil.ltrimstr(AV71ForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV72ForColNum_to,6,0)),GXutil.URLEncode(GXutil.rtrim(AV73ForSer)),GXutil.URLEncode(GXutil.rtrim(AV74ForSer_to)),GXutil.URLEncode(GXutil.ltrimstr(AV75IntCod,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV76IntCod_to,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV77MatCod,3,0)),GXutil.URLEncode(GXutil.ltrimstr(AV78MatCod_to,3,0)),GXutil.URLEncode(GXutil.ltrimstr(AV79TipColCod,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV80TipColCod_to,4,0)),GXutil.URLEncode(GXutil.rtrim(AV81ProForCod)),GXutil.URLEncode(GXutil.rtrim(AV82ProForCodDestino)),GXutil.URLEncode(GXutil.rtrim(AV83ProForDsc))}, new String[] {"Emprcod","Clicod","Clicod_to","ForColNom","ForColNom_to","ForColNum","ForColNum_to","ForSer","ForSer_to","IntCod","IntCod_to","MatCod","MatCod_to","TipColCod","TipColCod_to","ProForCod","ProForCodDestino","ProForDsc"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"SustitucionProcesoQuimicoFormulas_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV92Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("formulaciontinte\\sustitucionprocesoquimicoformulas_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_23", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_23, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV59GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV60GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV57DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV57DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV66Emprcod", GXutil.rtrim( wcpOAV66Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV67Clicod", GXutil.ltrim( localUtil.ntoc( wcpOAV67Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV68Clicod_to", GXutil.ltrim( localUtil.ntoc( wcpOAV68Clicod_to, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV69ForColNom", GXutil.rtrim( wcpOAV69ForColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV70ForColNom_to", GXutil.rtrim( wcpOAV70ForColNom_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV71ForColNum", GXutil.ltrim( localUtil.ntoc( wcpOAV71ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV72ForColNum_to", GXutil.ltrim( localUtil.ntoc( wcpOAV72ForColNum_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV73ForSer", GXutil.rtrim( wcpOAV73ForSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV74ForSer_to", GXutil.rtrim( wcpOAV74ForSer_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV75IntCod", GXutil.ltrim( localUtil.ntoc( wcpOAV75IntCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV76IntCod_to", GXutil.ltrim( localUtil.ntoc( wcpOAV76IntCod_to, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV77MatCod", GXutil.ltrim( localUtil.ntoc( wcpOAV77MatCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV78MatCod_to", GXutil.ltrim( localUtil.ntoc( wcpOAV78MatCod_to, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV79TipColCod", GXutil.ltrim( localUtil.ntoc( wcpOAV79TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV80TipColCod_to", GXutil.ltrim( localUtil.ntoc( wcpOAV80TipColCod_to, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV81ProForCod", GXutil.rtrim( wcpOAV81ProForCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV82ProForCodDestino", GXutil.rtrim( wcpOAV82ProForCodDestino));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV83ProForDsc", GXutil.rtrim( wcpOAV83ProForDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLICOD", GXutil.ltrim( localUtil.ntoc( AV28TFCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV29TFCliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLINOM", GXutil.rtrim( AV62TFCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLINOM_SEL", GXutil.rtrim( AV63TFCliNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFORSER", GXutil.rtrim( AV30TFForSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFORSER_SEL", GXutil.rtrim( AV31TFForSer_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFORSERDSC", GXutil.rtrim( AV64TFForSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFORSERDSC_SEL", GXutil.rtrim( AV65TFForSerDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFORCOLNOM", GXutil.rtrim( AV32TFForColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFORCOLNOM_SEL", GXutil.rtrim( AV33TFForColNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFORCOLNUM", GXutil.ltrim( localUtil.ntoc( AV34TFForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFORCOLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV35TFForColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFTIPCOLCOD", GXutil.ltrim( localUtil.ntoc( AV36TFTipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFTIPCOLCOD_TO", GXutil.ltrim( localUtil.ntoc( AV37TFTipColCod_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFINTDSC", GXutil.rtrim( AV88TFIntDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFINTDSC_SEL", GXutil.rtrim( AV89TFIntDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMATDSC", GXutil.rtrim( AV86TFMatDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMATDSC_SEL", GXutil.rtrim( AV87TFMatDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV66Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD", GXutil.ltrim( localUtil.ntoc( AV67Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV68Clicod_to, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORCOLNOM", GXutil.rtrim( AV69ForColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORCOLNOM_TO", GXutil.rtrim( AV70ForColNom_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORCOLNUM", GXutil.ltrim( localUtil.ntoc( AV71ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORCOLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV72ForColNum_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORSER", GXutil.rtrim( AV73ForSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORSER_TO", GXutil.rtrim( AV74ForSer_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vINTCOD", GXutil.ltrim( localUtil.ntoc( AV75IntCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vINTCOD_TO", GXutil.ltrim( localUtil.ntoc( AV76IntCod_to, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMATCOD", GXutil.ltrim( localUtil.ntoc( AV77MatCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMATCOD_TO", GXutil.ltrim( localUtil.ntoc( AV78MatCod_to, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPCOLCOD", GXutil.ltrim( localUtil.ntoc( AV79TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPCOLCOD_TO", GXutil.ltrim( localUtil.ntoc( AV80TipColCod_to, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPROFORCOD", GXutil.rtrim( AV81ProForCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPROFORCODDESTINO", GXutil.rtrim( AV82ProForCodDestino));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPROFORDSC", GXutil.rtrim( AV83ProForDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
   }

   public void renderHtmlCloseForm1K72( )
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
      return "FormulacionTinte.SustitucionProcesoQuimicoFormulas_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Sustitucion Proceso Quimico Formulas", "") ;
   }

   public void wb1K70( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.formulaciontinte.sustitucionprocesoquimicoformulas_wc");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table1_12_1K72( true) ;
      }
      else
      {
         wb_table1_12_1K72( false) ;
      }
      return  ;
   }

   public void wb_table1_12_1K72e( boolean wbgen )
   {
      if ( wbgen )
      {
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
         startgridcontrol23( ) ;
      }
      if ( wbEnd == 23 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_23 = (int)(nGXsfl_23_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV59GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV60GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV92Pgmname), GXutil.rtrim( localUtil.format( AV92Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\SustitucionProcesoQuimicoFormulas_WC.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV57DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 23 )
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

   public void start1K72( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Sustitucion Proceso Quimico Formulas", ""), (short)(0)) ;
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
            strup1K70( ) ;
         }
      }
   }

   public void ws1K72( )
   {
      start1K72( ) ;
      evt1K72( ) ;
   }

   public void evt1K72( )
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
                              strup1K70( ) ;
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
                              strup1K70( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e111K72 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1K70( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e121K72 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1K70( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e131K72 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1K70( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
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
                              strup1K70( ) ;
                           }
                           nGXsfl_23_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_23_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_23_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_232( ) ;
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           A494ForSer = httpContext.cgiGet( edtForSer_Internalname) ;
                           A5742ForSerDsc = httpContext.cgiGet( edtForSerDsc_Internalname) ;
                           n5742ForSerDsc = false ;
                           A482ForColNom = httpContext.cgiGet( edtForColNom_Internalname) ;
                           A483ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtForColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A831TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtTipColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A584IntDsc = httpContext.cgiGet( edtIntDsc_Internalname) ;
                           n584IntDsc = false ;
                           A627MatDsc = httpContext.cgiGet( edtMatDsc_Internalname) ;
                           n627MatDsc = false ;
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
                                       /* Execute user event: Start */
                                       e141K72 ();
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
                                       /* Execute user event: Refresh */
                                       e151K72 ();
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
                                       e161K72 ();
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
                                    strup1K70( ) ;
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

   public void we1K72( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1K72( ) ;
         }
      }
   }

   public void pa1K72( )
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
      subsflControlProps_232( ) ;
      while ( nGXsfl_23_idx <= nRC_GXsfl_23 )
      {
         sendrow_232( ) ;
         nGXsfl_23_idx = ((subGrid_Islastpage==1)&&(nGXsfl_23_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_23_idx+1) ;
         sGXsfl_23_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_23_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_232( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV66Emprcod ,
                                 int AV67Clicod ,
                                 short AV68Clicod_to ,
                                 String AV69ForColNom ,
                                 String AV70ForColNom_to ,
                                 int AV71ForColNum ,
                                 int AV72ForColNum_to ,
                                 String AV73ForSer ,
                                 String AV74ForSer_to ,
                                 byte AV75IntCod ,
                                 byte AV76IntCod_to ,
                                 short AV77MatCod ,
                                 short AV78MatCod_to ,
                                 byte AV79TipColCod ,
                                 short AV80TipColCod_to ,
                                 String AV81ProForCod ,
                                 int AV28TFCliCod ,
                                 int AV29TFCliCod_To ,
                                 String AV62TFCliNom ,
                                 String AV63TFCliNom_Sel ,
                                 String AV30TFForSer ,
                                 String AV31TFForSer_Sel ,
                                 String AV64TFForSerDsc ,
                                 String AV65TFForSerDsc_Sel ,
                                 String AV32TFForColNom ,
                                 String AV33TFForColNom_Sel ,
                                 int AV34TFForColNum ,
                                 int AV35TFForColNum_To ,
                                 byte AV36TFTipColCod ,
                                 byte AV37TFTipColCod_To ,
                                 String AV88TFIntDsc ,
                                 String AV89TFIntDsc_Sel ,
                                 String AV86TFMatDsc ,
                                 String AV87TFMatDsc_Sel ,
                                 String AV92Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 String AV82ProForCodDestino ,
                                 String AV83ProForDsc ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e151K72 ();
      GRID_nCurrentRecord = 0 ;
      rf1K72( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"SustitucionProcesoQuimicoFormulas_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV92Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("formulaciontinte\\sustitucionprocesoquimicoformulas_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf1K72( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV92Pgmname = "FormulacionTinte.SustitucionProcesoQuimicoFormulas_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92Pgmname", AV92Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1K72( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(23) ;
      /* Execute user event: Refresh */
      e151K72 ();
      nGXsfl_23_idx = 1 ;
      sGXsfl_23_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_23_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_232( ) ;
      bGXsfl_23_Refreshing = true ;
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
         subsflControlProps_232( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Integer.valueOf(AV96Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_1_tfclicod) ,
                                              Integer.valueOf(AV97Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_2_tfclicod_to) ,
                                              AV99Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_4_tfclinom_sel ,
                                              AV98Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_3_tfclinom ,
                                              AV101Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_6_tfforser_sel ,
                                              AV100Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_5_tfforser ,
                                              AV103Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_8_tfforserdsc_sel ,
                                              AV102Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_7_tfforserdsc ,
                                              AV105Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_10_tfforcolnom_sel ,
                                              AV104Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_9_tfforcolnom ,
                                              Integer.valueOf(AV106Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_11_tfforcolnum) ,
                                              Integer.valueOf(AV107Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_12_tfforcolnum_to) ,
                                              Byte.valueOf(AV108Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_13_tftipcolcod) ,
                                              Byte.valueOf(AV109Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_14_tftipcolcod_to) ,
                                              AV111Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_16_tfintdsc_sel ,
                                              AV110Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_15_tfintdsc ,
                                              AV113Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_18_tfmatdsc_sel ,
                                              AV112Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_17_tfmatdsc ,
                                              Integer.valueOf(AV67Clicod) ,
                                              Short.valueOf(AV68Clicod_to) ,
                                              AV69ForColNom ,
                                              AV70ForColNom_to ,
                                              Integer.valueOf(AV71ForColNum) ,
                                              Integer.valueOf(AV72ForColNum_to) ,
                                              AV73ForSer ,
                                              AV74ForSer_to ,
                                              Byte.valueOf(AV75IntCod) ,
                                              Byte.valueOf(AV76IntCod_to) ,
                                              Short.valueOf(AV77MatCod) ,
                                              Short.valueOf(AV78MatCod_to) ,
                                              Byte.valueOf(AV79TipColCod) ,
                                              Short.valueOf(AV80TipColCod_to) ,
                                              Integer.valueOf(A252CliCod) ,
                                              A279CliNom ,
                                              A494ForSer ,
                                              A5742ForSerDsc ,
                                              A482ForColNom ,
                                              Integer.valueOf(A483ForColNum) ,
                                              Byte.valueOf(A831TipColCod) ,
                                              A584IntDsc ,
                                              A627MatDsc ,
                                              Byte.valueOf(A583IntCod) ,
                                              Short.valueOf(A626MatCod) ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV66Emprcod ,
                                              AV81ProForCod ,
                                              A396EmprCod ,
                                              A764ProForCod } ,
                                              new int[]{
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT,
                                              TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV98Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_3_tfclinom = GXutil.padr( GXutil.rtrim( AV98Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_3_tfclinom), 30, "%") ;
         lV100Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_5_tfforser = GXutil.padr( GXutil.rtrim( AV100Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_5_tfforser), 16, "%") ;
         lV102Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_7_tfforserdsc = GXutil.padr( GXutil.rtrim( AV102Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_7_tfforserdsc), 26, "%") ;
         lV104Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_9_tfforcolnom = GXutil.padr( GXutil.rtrim( AV104Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_9_tfforcolnom), 13, "%") ;
         lV110Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_15_tfintdsc = GXutil.padr( GXutil.rtrim( AV110Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_15_tfintdsc), 30, "%") ;
         lV112Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_17_tfmatdsc = GXutil.padr( GXutil.rtrim( AV112Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_17_tfmatdsc), 30, "%") ;
         /* Using cursor H01K72 */
         pr_default.execute(0, new Object[] {AV66Emprcod, AV81ProForCod, Integer.valueOf(AV96Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_1_tfclicod), Integer.valueOf(AV97Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_2_tfclicod_to), lV98Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_3_tfclinom, AV99Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_4_tfclinom_sel, lV100Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_5_tfforser, AV101Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_6_tfforser_sel, lV102Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_7_tfforserdsc, AV103Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_8_tfforserdsc_sel, lV104Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_9_tfforcolnom, AV105Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_10_tfforcolnom_sel, Integer.valueOf(AV106Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_11_tfforcolnum), Integer.valueOf(AV107Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_12_tfforcolnum_to), Byte.valueOf(AV108Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_13_tftipcolcod), Byte.valueOf(AV109Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_14_tftipcolcod_to), lV110Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_15_tfintdsc, AV111Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_16_tfintdsc_sel, lV112Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_17_tfmatdsc, AV113Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_18_tfmatdsc_sel, Integer.valueOf(AV67Clicod), Short.valueOf(AV68Clicod_to), AV69ForColNom, AV70ForColNom_to, Integer.valueOf(AV71ForColNum), Integer.valueOf(AV72ForColNum_to), AV73ForSer, AV74ForSer_to, Byte.valueOf(AV75IntCod), Byte.valueOf(AV76IntCod_to), Short.valueOf(AV77MatCod), Short.valueOf(AV78MatCod_to), Byte.valueOf(AV79TipColCod), Short.valueOf(AV80TipColCod_to), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_23_idx = 1 ;
         sGXsfl_23_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_23_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_232( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A626MatCod = H01K72_A626MatCod[0] ;
            A583IntCod = H01K72_A583IntCod[0] ;
            A396EmprCod = H01K72_A396EmprCod[0] ;
            A764ProForCod = H01K72_A764ProForCod[0] ;
            A627MatDsc = H01K72_A627MatDsc[0] ;
            n627MatDsc = H01K72_n627MatDsc[0] ;
            A584IntDsc = H01K72_A584IntDsc[0] ;
            n584IntDsc = H01K72_n584IntDsc[0] ;
            A831TipColCod = H01K72_A831TipColCod[0] ;
            A483ForColNum = H01K72_A483ForColNum[0] ;
            A482ForColNom = H01K72_A482ForColNom[0] ;
            A5742ForSerDsc = H01K72_A5742ForSerDsc[0] ;
            n5742ForSerDsc = H01K72_n5742ForSerDsc[0] ;
            A494ForSer = H01K72_A494ForSer[0] ;
            A279CliNom = H01K72_A279CliNom[0] ;
            A252CliCod = H01K72_A252CliCod[0] ;
            A279CliNom = H01K72_A279CliNom[0] ;
            A626MatCod = H01K72_A626MatCod[0] ;
            A583IntCod = H01K72_A583IntCod[0] ;
            A5742ForSerDsc = H01K72_A5742ForSerDsc[0] ;
            n5742ForSerDsc = H01K72_n5742ForSerDsc[0] ;
            A627MatDsc = H01K72_A627MatDsc[0] ;
            n627MatDsc = H01K72_n627MatDsc[0] ;
            A584IntDsc = H01K72_A584IntDsc[0] ;
            n584IntDsc = H01K72_n584IntDsc[0] ;
            e161K72 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(23) ;
         wb1K70( ) ;
      }
      bGXsfl_23_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1K72( )
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
      AV96Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_1_tfclicod = AV28TFCliCod ;
      AV97Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_2_tfclicod_to = AV29TFCliCod_To ;
      AV98Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_3_tfclinom = AV62TFCliNom ;
      AV99Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_4_tfclinom_sel = AV63TFCliNom_Sel ;
      AV100Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_5_tfforser = AV30TFForSer ;
      AV101Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_6_tfforser_sel = AV31TFForSer_Sel ;
      AV102Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_7_tfforserdsc = AV64TFForSerDsc ;
      AV103Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_8_tfforserdsc_sel = AV65TFForSerDsc_Sel ;
      AV104Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_9_tfforcolnom = AV32TFForColNom ;
      AV105Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_10_tfforcolnom_sel = AV33TFForColNom_Sel ;
      AV106Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_11_tfforcolnum = AV34TFForColNum ;
      AV107Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_12_tfforcolnum_to = AV35TFForColNum_To ;
      AV108Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_13_tftipcolcod = AV36TFTipColCod ;
      AV109Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_14_tftipcolcod_to = AV37TFTipColCod_To ;
      AV110Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_15_tfintdsc = AV88TFIntDsc ;
      AV111Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_16_tfintdsc_sel = AV89TFIntDsc_Sel ;
      AV112Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_17_tfmatdsc = AV86TFMatDsc ;
      AV113Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_18_tfmatdsc_sel = AV87TFMatDsc_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Integer.valueOf(AV96Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_1_tfclicod) ,
                                           Integer.valueOf(AV97Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_2_tfclicod_to) ,
                                           AV99Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_4_tfclinom_sel ,
                                           AV98Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_3_tfclinom ,
                                           AV101Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_6_tfforser_sel ,
                                           AV100Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_5_tfforser ,
                                           AV103Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_8_tfforserdsc_sel ,
                                           AV102Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_7_tfforserdsc ,
                                           AV105Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_10_tfforcolnom_sel ,
                                           AV104Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_9_tfforcolnom ,
                                           Integer.valueOf(AV106Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_11_tfforcolnum) ,
                                           Integer.valueOf(AV107Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_12_tfforcolnum_to) ,
                                           Byte.valueOf(AV108Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_13_tftipcolcod) ,
                                           Byte.valueOf(AV109Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_14_tftipcolcod_to) ,
                                           AV111Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_16_tfintdsc_sel ,
                                           AV110Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_15_tfintdsc ,
                                           AV113Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_18_tfmatdsc_sel ,
                                           AV112Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_17_tfmatdsc ,
                                           Integer.valueOf(AV67Clicod) ,
                                           Short.valueOf(AV68Clicod_to) ,
                                           AV69ForColNom ,
                                           AV70ForColNom_to ,
                                           Integer.valueOf(AV71ForColNum) ,
                                           Integer.valueOf(AV72ForColNum_to) ,
                                           AV73ForSer ,
                                           AV74ForSer_to ,
                                           Byte.valueOf(AV75IntCod) ,
                                           Byte.valueOf(AV76IntCod_to) ,
                                           Short.valueOf(AV77MatCod) ,
                                           Short.valueOf(AV78MatCod_to) ,
                                           Byte.valueOf(AV79TipColCod) ,
                                           Short.valueOf(AV80TipColCod_to) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A584IntDsc ,
                                           A627MatDsc ,
                                           Byte.valueOf(A583IntCod) ,
                                           Short.valueOf(A626MatCod) ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV66Emprcod ,
                                           AV81ProForCod ,
                                           A396EmprCod ,
                                           A764ProForCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV98Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_3_tfclinom = GXutil.padr( GXutil.rtrim( AV98Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_3_tfclinom), 30, "%") ;
      lV100Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_5_tfforser = GXutil.padr( GXutil.rtrim( AV100Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_5_tfforser), 16, "%") ;
      lV102Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_7_tfforserdsc = GXutil.padr( GXutil.rtrim( AV102Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_7_tfforserdsc), 26, "%") ;
      lV104Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_9_tfforcolnom = GXutil.padr( GXutil.rtrim( AV104Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_9_tfforcolnom), 13, "%") ;
      lV110Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_15_tfintdsc = GXutil.padr( GXutil.rtrim( AV110Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_15_tfintdsc), 30, "%") ;
      lV112Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_17_tfmatdsc = GXutil.padr( GXutil.rtrim( AV112Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_17_tfmatdsc), 30, "%") ;
      /* Using cursor H01K73 */
      pr_default.execute(1, new Object[] {AV66Emprcod, AV81ProForCod, Integer.valueOf(AV96Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_1_tfclicod), Integer.valueOf(AV97Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_2_tfclicod_to), lV98Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_3_tfclinom, AV99Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_4_tfclinom_sel, lV100Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_5_tfforser, AV101Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_6_tfforser_sel, lV102Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_7_tfforserdsc, AV103Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_8_tfforserdsc_sel, lV104Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_9_tfforcolnom, AV105Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_10_tfforcolnom_sel, Integer.valueOf(AV106Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_11_tfforcolnum), Integer.valueOf(AV107Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_12_tfforcolnum_to), Byte.valueOf(AV108Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_13_tftipcolcod), Byte.valueOf(AV109Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_14_tftipcolcod_to), lV110Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_15_tfintdsc, AV111Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_16_tfintdsc_sel, lV112Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_17_tfmatdsc, AV113Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_18_tfmatdsc_sel, Integer.valueOf(AV67Clicod), Short.valueOf(AV68Clicod_to), AV69ForColNom, AV70ForColNom_to, Integer.valueOf(AV71ForColNum), Integer.valueOf(AV72ForColNum_to), AV73ForSer, AV74ForSer_to, Byte.valueOf(AV75IntCod), Byte.valueOf(AV76IntCod_to), Short.valueOf(AV77MatCod), Short.valueOf(AV78MatCod_to), Byte.valueOf(AV79TipColCod), Short.valueOf(AV80TipColCod_to)});
      GRID_nRecordCount = H01K73_AGRID_nRecordCount[0] ;
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
      AV96Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_1_tfclicod = AV28TFCliCod ;
      AV97Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_2_tfclicod_to = AV29TFCliCod_To ;
      AV98Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_3_tfclinom = AV62TFCliNom ;
      AV99Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_4_tfclinom_sel = AV63TFCliNom_Sel ;
      AV100Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_5_tfforser = AV30TFForSer ;
      AV101Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_6_tfforser_sel = AV31TFForSer_Sel ;
      AV102Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_7_tfforserdsc = AV64TFForSerDsc ;
      AV103Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_8_tfforserdsc_sel = AV65TFForSerDsc_Sel ;
      AV104Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_9_tfforcolnom = AV32TFForColNom ;
      AV105Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_10_tfforcolnom_sel = AV33TFForColNom_Sel ;
      AV106Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_11_tfforcolnum = AV34TFForColNum ;
      AV107Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_12_tfforcolnum_to = AV35TFForColNum_To ;
      AV108Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_13_tftipcolcod = AV36TFTipColCod ;
      AV109Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_14_tftipcolcod_to = AV37TFTipColCod_To ;
      AV110Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_15_tfintdsc = AV88TFIntDsc ;
      AV111Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_16_tfintdsc_sel = AV89TFIntDsc_Sel ;
      AV112Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_17_tfmatdsc = AV86TFMatDsc ;
      AV113Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_18_tfmatdsc_sel = AV87TFMatDsc_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV66Emprcod, AV67Clicod, AV68Clicod_to, AV69ForColNom, AV70ForColNom_to, AV71ForColNum, AV72ForColNum_to, AV73ForSer, AV74ForSer_to, AV75IntCod, AV76IntCod_to, AV77MatCod, AV78MatCod_to, AV79TipColCod, AV80TipColCod_to, AV81ProForCod, AV28TFCliCod, AV29TFCliCod_To, AV62TFCliNom, AV63TFCliNom_Sel, AV30TFForSer, AV31TFForSer_Sel, AV64TFForSerDsc, AV65TFForSerDsc_Sel, AV32TFForColNom, AV33TFForColNom_Sel, AV34TFForColNum, AV35TFForColNum_To, AV36TFTipColCod, AV37TFTipColCod_To, AV88TFIntDsc, AV89TFIntDsc_Sel, AV86TFMatDsc, AV87TFMatDsc_Sel, AV92Pgmname, AV12OrderedBy, AV13OrderedDsc, AV82ProForCodDestino, AV83ProForDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV96Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_1_tfclicod = AV28TFCliCod ;
      AV97Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_2_tfclicod_to = AV29TFCliCod_To ;
      AV98Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_3_tfclinom = AV62TFCliNom ;
      AV99Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_4_tfclinom_sel = AV63TFCliNom_Sel ;
      AV100Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_5_tfforser = AV30TFForSer ;
      AV101Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_6_tfforser_sel = AV31TFForSer_Sel ;
      AV102Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_7_tfforserdsc = AV64TFForSerDsc ;
      AV103Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_8_tfforserdsc_sel = AV65TFForSerDsc_Sel ;
      AV104Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_9_tfforcolnom = AV32TFForColNom ;
      AV105Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_10_tfforcolnom_sel = AV33TFForColNom_Sel ;
      AV106Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_11_tfforcolnum = AV34TFForColNum ;
      AV107Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_12_tfforcolnum_to = AV35TFForColNum_To ;
      AV108Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_13_tftipcolcod = AV36TFTipColCod ;
      AV109Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_14_tftipcolcod_to = AV37TFTipColCod_To ;
      AV110Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_15_tfintdsc = AV88TFIntDsc ;
      AV111Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_16_tfintdsc_sel = AV89TFIntDsc_Sel ;
      AV112Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_17_tfmatdsc = AV86TFMatDsc ;
      AV113Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_18_tfmatdsc_sel = AV87TFMatDsc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV66Emprcod, AV67Clicod, AV68Clicod_to, AV69ForColNom, AV70ForColNom_to, AV71ForColNum, AV72ForColNum_to, AV73ForSer, AV74ForSer_to, AV75IntCod, AV76IntCod_to, AV77MatCod, AV78MatCod_to, AV79TipColCod, AV80TipColCod_to, AV81ProForCod, AV28TFCliCod, AV29TFCliCod_To, AV62TFCliNom, AV63TFCliNom_Sel, AV30TFForSer, AV31TFForSer_Sel, AV64TFForSerDsc, AV65TFForSerDsc_Sel, AV32TFForColNom, AV33TFForColNom_Sel, AV34TFForColNum, AV35TFForColNum_To, AV36TFTipColCod, AV37TFTipColCod_To, AV88TFIntDsc, AV89TFIntDsc_Sel, AV86TFMatDsc, AV87TFMatDsc_Sel, AV92Pgmname, AV12OrderedBy, AV13OrderedDsc, AV82ProForCodDestino, AV83ProForDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV96Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_1_tfclicod = AV28TFCliCod ;
      AV97Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_2_tfclicod_to = AV29TFCliCod_To ;
      AV98Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_3_tfclinom = AV62TFCliNom ;
      AV99Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_4_tfclinom_sel = AV63TFCliNom_Sel ;
      AV100Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_5_tfforser = AV30TFForSer ;
      AV101Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_6_tfforser_sel = AV31TFForSer_Sel ;
      AV102Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_7_tfforserdsc = AV64TFForSerDsc ;
      AV103Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_8_tfforserdsc_sel = AV65TFForSerDsc_Sel ;
      AV104Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_9_tfforcolnom = AV32TFForColNom ;
      AV105Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_10_tfforcolnom_sel = AV33TFForColNom_Sel ;
      AV106Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_11_tfforcolnum = AV34TFForColNum ;
      AV107Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_12_tfforcolnum_to = AV35TFForColNum_To ;
      AV108Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_13_tftipcolcod = AV36TFTipColCod ;
      AV109Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_14_tftipcolcod_to = AV37TFTipColCod_To ;
      AV110Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_15_tfintdsc = AV88TFIntDsc ;
      AV111Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_16_tfintdsc_sel = AV89TFIntDsc_Sel ;
      AV112Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_17_tfmatdsc = AV86TFMatDsc ;
      AV113Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_18_tfmatdsc_sel = AV87TFMatDsc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV66Emprcod, AV67Clicod, AV68Clicod_to, AV69ForColNom, AV70ForColNom_to, AV71ForColNum, AV72ForColNum_to, AV73ForSer, AV74ForSer_to, AV75IntCod, AV76IntCod_to, AV77MatCod, AV78MatCod_to, AV79TipColCod, AV80TipColCod_to, AV81ProForCod, AV28TFCliCod, AV29TFCliCod_To, AV62TFCliNom, AV63TFCliNom_Sel, AV30TFForSer, AV31TFForSer_Sel, AV64TFForSerDsc, AV65TFForSerDsc_Sel, AV32TFForColNom, AV33TFForColNom_Sel, AV34TFForColNum, AV35TFForColNum_To, AV36TFTipColCod, AV37TFTipColCod_To, AV88TFIntDsc, AV89TFIntDsc_Sel, AV86TFMatDsc, AV87TFMatDsc_Sel, AV92Pgmname, AV12OrderedBy, AV13OrderedDsc, AV82ProForCodDestino, AV83ProForDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV96Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_1_tfclicod = AV28TFCliCod ;
      AV97Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_2_tfclicod_to = AV29TFCliCod_To ;
      AV98Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_3_tfclinom = AV62TFCliNom ;
      AV99Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_4_tfclinom_sel = AV63TFCliNom_Sel ;
      AV100Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_5_tfforser = AV30TFForSer ;
      AV101Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_6_tfforser_sel = AV31TFForSer_Sel ;
      AV102Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_7_tfforserdsc = AV64TFForSerDsc ;
      AV103Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_8_tfforserdsc_sel = AV65TFForSerDsc_Sel ;
      AV104Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_9_tfforcolnom = AV32TFForColNom ;
      AV105Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_10_tfforcolnom_sel = AV33TFForColNom_Sel ;
      AV106Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_11_tfforcolnum = AV34TFForColNum ;
      AV107Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_12_tfforcolnum_to = AV35TFForColNum_To ;
      AV108Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_13_tftipcolcod = AV36TFTipColCod ;
      AV109Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_14_tftipcolcod_to = AV37TFTipColCod_To ;
      AV110Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_15_tfintdsc = AV88TFIntDsc ;
      AV111Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_16_tfintdsc_sel = AV89TFIntDsc_Sel ;
      AV112Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_17_tfmatdsc = AV86TFMatDsc ;
      AV113Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_18_tfmatdsc_sel = AV87TFMatDsc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV66Emprcod, AV67Clicod, AV68Clicod_to, AV69ForColNom, AV70ForColNom_to, AV71ForColNum, AV72ForColNum_to, AV73ForSer, AV74ForSer_to, AV75IntCod, AV76IntCod_to, AV77MatCod, AV78MatCod_to, AV79TipColCod, AV80TipColCod_to, AV81ProForCod, AV28TFCliCod, AV29TFCliCod_To, AV62TFCliNom, AV63TFCliNom_Sel, AV30TFForSer, AV31TFForSer_Sel, AV64TFForSerDsc, AV65TFForSerDsc_Sel, AV32TFForColNom, AV33TFForColNom_Sel, AV34TFForColNum, AV35TFForColNum_To, AV36TFTipColCod, AV37TFTipColCod_To, AV88TFIntDsc, AV89TFIntDsc_Sel, AV86TFMatDsc, AV87TFMatDsc_Sel, AV92Pgmname, AV12OrderedBy, AV13OrderedDsc, AV82ProForCodDestino, AV83ProForDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV96Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_1_tfclicod = AV28TFCliCod ;
      AV97Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_2_tfclicod_to = AV29TFCliCod_To ;
      AV98Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_3_tfclinom = AV62TFCliNom ;
      AV99Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_4_tfclinom_sel = AV63TFCliNom_Sel ;
      AV100Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_5_tfforser = AV30TFForSer ;
      AV101Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_6_tfforser_sel = AV31TFForSer_Sel ;
      AV102Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_7_tfforserdsc = AV64TFForSerDsc ;
      AV103Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_8_tfforserdsc_sel = AV65TFForSerDsc_Sel ;
      AV104Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_9_tfforcolnom = AV32TFForColNom ;
      AV105Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_10_tfforcolnom_sel = AV33TFForColNom_Sel ;
      AV106Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_11_tfforcolnum = AV34TFForColNum ;
      AV107Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_12_tfforcolnum_to = AV35TFForColNum_To ;
      AV108Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_13_tftipcolcod = AV36TFTipColCod ;
      AV109Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_14_tftipcolcod_to = AV37TFTipColCod_To ;
      AV110Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_15_tfintdsc = AV88TFIntDsc ;
      AV111Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_16_tfintdsc_sel = AV89TFIntDsc_Sel ;
      AV112Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_17_tfmatdsc = AV86TFMatDsc ;
      AV113Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_18_tfmatdsc_sel = AV87TFMatDsc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV66Emprcod, AV67Clicod, AV68Clicod_to, AV69ForColNom, AV70ForColNom_to, AV71ForColNum, AV72ForColNum_to, AV73ForSer, AV74ForSer_to, AV75IntCod, AV76IntCod_to, AV77MatCod, AV78MatCod_to, AV79TipColCod, AV80TipColCod_to, AV81ProForCod, AV28TFCliCod, AV29TFCliCod_To, AV62TFCliNom, AV63TFCliNom_Sel, AV30TFForSer, AV31TFForSer_Sel, AV64TFForSerDsc, AV65TFForSerDsc_Sel, AV32TFForColNom, AV33TFForColNom_Sel, AV34TFForColNum, AV35TFForColNum_To, AV36TFTipColCod, AV37TFTipColCod_To, AV88TFIntDsc, AV89TFIntDsc_Sel, AV86TFMatDsc, AV87TFMatDsc_Sel, AV92Pgmname, AV12OrderedBy, AV13OrderedDsc, AV82ProForCodDestino, AV83ProForDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV92Pgmname = "FormulacionTinte.SustitucionProcesoQuimicoFormulas_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92Pgmname", AV92Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1K70( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e141K72 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV57DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_23 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_23"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV59GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV60GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV66Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV66Emprcod") ;
         wcpOAV67Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV67Clicod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV68Clicod_to = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV68Clicod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV69ForColNom = httpContext.cgiGet( sPrefix+"wcpOAV69ForColNom") ;
         wcpOAV70ForColNom_to = httpContext.cgiGet( sPrefix+"wcpOAV70ForColNom_to") ;
         wcpOAV71ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV71ForColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV72ForColNum_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV72ForColNum_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV73ForSer = httpContext.cgiGet( sPrefix+"wcpOAV73ForSer") ;
         wcpOAV74ForSer_to = httpContext.cgiGet( sPrefix+"wcpOAV74ForSer_to") ;
         wcpOAV75IntCod = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV75IntCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV76IntCod_to = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV76IntCod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV77MatCod = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV77MatCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV78MatCod_to = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV78MatCod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV79TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV79TipColCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV80TipColCod_to = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV80TipColCod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV81ProForCod = httpContext.cgiGet( sPrefix+"wcpOAV81ProForCod") ;
         wcpOAV82ProForCodDestino = httpContext.cgiGet( sPrefix+"wcpOAV82ProForCodDestino") ;
         wcpOAV83ProForDsc = httpContext.cgiGet( sPrefix+"wcpOAV83ProForDsc") ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
         AV92Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92Pgmname", AV92Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"SustitucionProcesoQuimicoFormulas_WC");
         AV92Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92Pgmname", AV92Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV92Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("formulaciontinte\\sustitucionprocesoquimicoformulas_wc:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e141K72 ();
      if (returnInSub) return;
   }

   public void e141K72( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV93Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      sustitucionprocesoquimicoformulas_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV93Station = GXt_char1 ;
      GXv_char2[0] = AV66Emprcod ;
      GXv_char3[0] = AV94Emprnom ;
      GXv_char4[0] = AV95Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV93Station, GXv_char2, GXv_char3, GXv_char4) ;
      sustitucionprocesoquimicoformulas_wc_impl.this.AV66Emprcod = GXv_char2[0] ;
      sustitucionprocesoquimicoformulas_wc_impl.this.AV94Emprnom = GXv_char3[0] ;
      sustitucionprocesoquimicoformulas_wc_impl.this.AV95Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66Emprcod", AV66Emprcod);
      subGrid_Rows = 10 ;
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
      if ( AV12OrderedBy < 1 )
      {
         AV12OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV57DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV57DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e151K72( )
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
      S142 ();
      if (returnInSub) return;
      AV59GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59GridCurrentPage), 10, 0));
      AV60GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60GridPageCount), 10, 0));
      AV96Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_1_tfclicod = AV28TFCliCod ;
      AV97Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_2_tfclicod_to = AV29TFCliCod_To ;
      AV98Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_3_tfclinom = AV62TFCliNom ;
      AV99Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_4_tfclinom_sel = AV63TFCliNom_Sel ;
      AV100Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_5_tfforser = AV30TFForSer ;
      AV101Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_6_tfforser_sel = AV31TFForSer_Sel ;
      AV102Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_7_tfforserdsc = AV64TFForSerDsc ;
      AV103Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_8_tfforserdsc_sel = AV65TFForSerDsc_Sel ;
      AV104Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_9_tfforcolnom = AV32TFForColNom ;
      AV105Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_10_tfforcolnom_sel = AV33TFForColNom_Sel ;
      AV106Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_11_tfforcolnum = AV34TFForColNum ;
      AV107Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_12_tfforcolnum_to = AV35TFForColNum_To ;
      AV108Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_13_tftipcolcod = AV36TFTipColCod ;
      AV109Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_14_tftipcolcod_to = AV37TFTipColCod_To ;
      AV110Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_15_tfintdsc = AV88TFIntDsc ;
      AV111Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_16_tfintdsc_sel = AV89TFIntDsc_Sel ;
      AV112Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_17_tfmatdsc = AV86TFMatDsc ;
      AV113Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_18_tfmatdsc_sel = AV87TFMatDsc_Sel ;
      /*  Sending Event outputs  */
   }

   public void e111K72( )
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
         AV58PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV58PageToGo) ;
      }
   }

   public void e121K72( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e131K72( )
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
         S132 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliCod") == 0 )
         {
            AV28TFCliCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TFCliCod), 6, 0));
            AV29TFCliCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliNom") == 0 )
         {
            AV62TFCliNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFCliNom", AV62TFCliNom);
            AV63TFCliNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFCliNom_Sel", AV63TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForSer") == 0 )
         {
            AV30TFForSer = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFForSer", AV30TFForSer);
            AV31TFForSer_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFForSer_Sel", AV31TFForSer_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForSerDsc") == 0 )
         {
            AV64TFForSerDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFForSerDsc", AV64TFForSerDsc);
            AV65TFForSerDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFForSerDsc_Sel", AV65TFForSerDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForColNom") == 0 )
         {
            AV32TFForColNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFForColNom", AV32TFForColNom);
            AV33TFForColNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFForColNom_Sel", AV33TFForColNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForColNum") == 0 )
         {
            AV34TFForColNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFForColNum), 6, 0));
            AV35TFForColNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFForColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFForColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "TipColCod") == 0 )
         {
            AV36TFTipColCod = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFTipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFTipColCod), 2, 0));
            AV37TFTipColCod_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFTipColCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFTipColCod_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "IntDsc") == 0 )
         {
            AV88TFIntDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88TFIntDsc", AV88TFIntDsc);
            AV89TFIntDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89TFIntDsc_Sel", AV89TFIntDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MatDsc") == 0 )
         {
            AV86TFMatDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV86TFMatDsc", AV86TFMatDsc);
            AV87TFMatDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV87TFMatDsc_Sel", AV87TFMatDsc_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e161K72( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(23) ;
      }
      sendrow_232( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_23_Refreshing )
      {
         httpContext.doAjaxLoad(23, GridRow);
      }
   }

   public void S132( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV12OrderedBy, 4, 0))+":"+(AV13OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV22Session.getValue(AV92Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV92Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV22Session.getValue(AV92Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S132 ();
      if (returnInSub) return;
      AV114GXV1 = 1 ;
      while ( AV114GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV114GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV28TFCliCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TFCliCod), 6, 0));
            AV29TFCliCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV62TFCliNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFCliNom", AV62TFCliNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV63TFCliNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFCliNom_Sel", AV63TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER") == 0 )
         {
            AV30TFForSer = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFForSer", AV30TFForSer);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER_SEL") == 0 )
         {
            AV31TFForSer_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFForSer_Sel", AV31TFForSer_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSERDSC") == 0 )
         {
            AV64TFForSerDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFForSerDsc", AV64TFForSerDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSERDSC_SEL") == 0 )
         {
            AV65TFForSerDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFForSerDsc_Sel", AV65TFForSerDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM") == 0 )
         {
            AV32TFForColNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFForColNom", AV32TFForColNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM_SEL") == 0 )
         {
            AV33TFForColNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFForColNom_Sel", AV33TFForColNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNUM") == 0 )
         {
            AV34TFForColNum = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFForColNum), 6, 0));
            AV35TFForColNum_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFForColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFForColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLCOD") == 0 )
         {
            AV36TFTipColCod = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFTipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFTipColCod), 2, 0));
            AV37TFTipColCod_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFTipColCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFTipColCod_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTDSC") == 0 )
         {
            AV88TFIntDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88TFIntDsc", AV88TFIntDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTDSC_SEL") == 0 )
         {
            AV89TFIntDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89TFIntDsc_Sel", AV89TFIntDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMATDSC") == 0 )
         {
            AV86TFMatDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV86TFMatDsc", AV86TFMatDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMATDSC_SEL") == 0 )
         {
            AV87TFMatDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV87TFMatDsc_Sel", AV87TFMatDsc_Sel);
         }
         AV114GXV1 = (int)(AV114GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV63TFCliNom_Sel)==0), AV63TFCliNom_Sel, GXv_char4) ;
      sustitucionprocesoquimicoformulas_wc_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char8 = "" ;
      GXv_char3[0] = GXt_char8 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV31TFForSer_Sel)==0), AV31TFForSer_Sel, GXv_char3) ;
      sustitucionprocesoquimicoformulas_wc_impl.this.GXt_char8 = GXv_char3[0] ;
      GXt_char9 = "" ;
      GXv_char2[0] = GXt_char9 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV65TFForSerDsc_Sel)==0), AV65TFForSerDsc_Sel, GXv_char2) ;
      sustitucionprocesoquimicoformulas_wc_impl.this.GXt_char9 = GXv_char2[0] ;
      GXt_char10 = "" ;
      GXv_char11[0] = GXt_char10 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV33TFForColNom_Sel)==0), AV33TFForColNom_Sel, GXv_char11) ;
      sustitucionprocesoquimicoformulas_wc_impl.this.GXt_char10 = GXv_char11[0] ;
      GXt_char12 = "" ;
      GXv_char13[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV89TFIntDsc_Sel)==0), AV89TFIntDsc_Sel, GXv_char13) ;
      sustitucionprocesoquimicoformulas_wc_impl.this.GXt_char12 = GXv_char13[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV87TFMatDsc_Sel)==0), AV87TFMatDsc_Sel, GXv_char15) ;
      sustitucionprocesoquimicoformulas_wc_impl.this.GXt_char14 = GXv_char15[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"|"+GXt_char8+"|"+GXt_char9+"|"+GXt_char10+"|||"+GXt_char12+"|"+GXt_char14 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV62TFCliNom)==0), AV62TFCliNom, GXv_char15) ;
      sustitucionprocesoquimicoformulas_wc_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char12 = "" ;
      GXv_char13[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV30TFForSer)==0), AV30TFForSer, GXv_char13) ;
      sustitucionprocesoquimicoformulas_wc_impl.this.GXt_char12 = GXv_char13[0] ;
      GXt_char10 = "" ;
      GXv_char11[0] = GXt_char10 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV64TFForSerDsc)==0), AV64TFForSerDsc, GXv_char11) ;
      sustitucionprocesoquimicoformulas_wc_impl.this.GXt_char10 = GXv_char11[0] ;
      GXt_char9 = "" ;
      GXv_char4[0] = GXt_char9 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV32TFForColNom)==0), AV32TFForColNom, GXv_char4) ;
      sustitucionprocesoquimicoformulas_wc_impl.this.GXt_char9 = GXv_char4[0] ;
      GXt_char8 = "" ;
      GXv_char3[0] = GXt_char8 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV88TFIntDsc)==0), AV88TFIntDsc, GXv_char3) ;
      sustitucionprocesoquimicoformulas_wc_impl.this.GXt_char8 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV86TFMatDsc)==0), AV86TFMatDsc, GXv_char2) ;
      sustitucionprocesoquimicoformulas_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV28TFCliCod) ? "" : GXutil.str( AV28TFCliCod, 6, 0))+"|"+GXt_char14+"|"+GXt_char12+"|"+GXt_char10+"|"+GXt_char9+"|"+((0==AV34TFForColNum) ? "" : GXutil.str( AV34TFForColNum, 6, 0))+"|"+((0==AV36TFTipColCod) ? "" : GXutil.str( AV36TFTipColCod, 2, 0))+"|"+GXt_char8+"|"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV29TFCliCod_To) ? "" : GXutil.str( AV29TFCliCod_To, 6, 0))+"|||||"+((0==AV35TFForColNum_To) ? "" : GXutil.str( AV35TFForColNum_To, 6, 0))+"|"+((0==AV37TFTipColCod_To) ? "" : GXutil.str( AV37TFTipColCod_To, 2, 0))+"||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S142( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV22Session.getValue(AV92Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFCLICOD", "", !((0==AV28TFCliCod)&&(0==AV29TFCliCod_To)), (short)(0), GXutil.trim( GXutil.str( AV28TFCliCod, 6, 0)), GXutil.trim( GXutil.str( AV29TFCliCod_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFCLINOM", "", !(GXutil.strcmp("", AV62TFCliNom)==0), (short)(0), AV62TFCliNom, "", !(GXutil.strcmp("", AV63TFCliNom_Sel)==0), AV63TFCliNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFFORSER", "", !(GXutil.strcmp("", AV30TFForSer)==0), (short)(0), AV30TFForSer, "", !(GXutil.strcmp("", AV31TFForSer_Sel)==0), AV31TFForSer_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFFORSERDSC", "", !(GXutil.strcmp("", AV64TFForSerDsc)==0), (short)(0), AV64TFForSerDsc, "", !(GXutil.strcmp("", AV65TFForSerDsc_Sel)==0), AV65TFForSerDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFFORCOLNOM", "", !(GXutil.strcmp("", AV32TFForColNom)==0), (short)(0), AV32TFForColNom, "", !(GXutil.strcmp("", AV33TFForColNom_Sel)==0), AV33TFForColNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFFORCOLNUM", "", !((0==AV34TFForColNum)&&(0==AV35TFForColNum_To)), (short)(0), GXutil.trim( GXutil.str( AV34TFForColNum, 6, 0)), GXutil.trim( GXutil.str( AV35TFForColNum_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFTIPCOLCOD", "", !((0==AV36TFTipColCod)&&(0==AV37TFTipColCod_To)), (short)(0), GXutil.trim( GXutil.str( AV36TFTipColCod, 2, 0)), GXutil.trim( GXutil.str( AV37TFTipColCod_To, 2, 0))) ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFINTDSC", "", !(GXutil.strcmp("", AV88TFIntDsc)==0), (short)(0), AV88TFIntDsc, "", !(GXutil.strcmp("", AV89TFIntDsc_Sel)==0), AV89TFIntDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFMATDSC", "", !(GXutil.strcmp("", AV86TFMatDsc)==0), (short)(0), AV86TFMatDsc, "", !(GXutil.strcmp("", AV87TFMatDsc_Sel)==0), AV87TFMatDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      if ( ! (GXutil.strcmp("", AV66Emprcod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV66Emprcod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV67Clicod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV67Clicod, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV68Clicod_to) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICOD_TO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV68Clicod_to, 4, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV69ForColNom)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FORCOLNOM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV69ForColNom );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV70ForColNom_to)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FORCOLNOM_TO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV70ForColNom_to );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV71ForColNum) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FORCOLNUM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV71ForColNum, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV72ForColNum_to) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FORCOLNUM_TO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV72ForColNum_to, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV73ForSer)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FORSER" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV73ForSer );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV74ForSer_to)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FORSER_TO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV74ForSer_to );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV75IntCod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&INTCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV75IntCod, 2, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV76IntCod_to) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&INTCOD_TO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV76IntCod_to, 2, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV77MatCod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&MATCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV77MatCod, 3, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV78MatCod_to) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&MATCOD_TO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV78MatCod_to, 3, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV79TipColCod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&TIPCOLCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV79TipColCod, 2, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV80TipColCod_to) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&TIPCOLCOD_TO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV80TipColCod_to, 4, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV81ProForCod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PROFORCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV81ProForCod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV82ProForCodDestino)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PROFORCODDESTINO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV82ProForCodDestino );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV83ProForDsc)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PROFORDSC" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV83ProForDsc );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV92Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV92Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "LFORMU" );
      AV22Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_12_1K72( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablerightheader_Internalname, tblTablerightheader_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_12_1K72e( true) ;
      }
      else
      {
         wb_table1_12_1K72e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV66Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66Emprcod", AV66Emprcod);
      AV67Clicod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67Clicod), 6, 0));
      AV68Clicod_to = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68Clicod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68Clicod_to), 4, 0));
      AV69ForColNom = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69ForColNom", AV69ForColNom);
      AV70ForColNom_to = (String)getParm(obj,4,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70ForColNom_to", AV70ForColNom_to);
      AV71ForColNum = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71ForColNum), 6, 0));
      AV72ForColNum_to = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72ForColNum_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72ForColNum_to), 6, 0));
      AV73ForSer = (String)getParm(obj,7,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73ForSer", AV73ForSer);
      AV74ForSer_to = (String)getParm(obj,8,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74ForSer_to", AV74ForSer_to);
      AV75IntCod = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV75IntCod), 2, 0));
      AV76IntCod_to = ((Number) GXutil.testNumericType( getParm(obj,10,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76IntCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV76IntCod_to), 2, 0));
      AV77MatCod = ((Number) GXutil.testNumericType( getParm(obj,11,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77MatCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77MatCod), 3, 0));
      AV78MatCod_to = ((Number) GXutil.testNumericType( getParm(obj,12,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78MatCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV78MatCod_to), 3, 0));
      AV79TipColCod = ((Number) GXutil.testNumericType( getParm(obj,13,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV79TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79TipColCod), 2, 0));
      AV80TipColCod_to = ((Number) GXutil.testNumericType( getParm(obj,14,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80TipColCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80TipColCod_to), 4, 0));
      AV81ProForCod = (String)getParm(obj,15,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81ProForCod", AV81ProForCod);
      AV82ProForCodDestino = (String)getParm(obj,16,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82ProForCodDestino", AV82ProForCodDestino);
      AV83ProForDsc = (String)getParm(obj,17,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83ProForDsc", AV83ProForDsc);
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
      pa1K72( ) ;
      ws1K72( ) ;
      we1K72( ) ;
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
      sCtrlAV66Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV67Clicod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV68Clicod_to = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV69ForColNom = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV70ForColNom_to = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV71ForColNum = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV72ForColNum_to = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV73ForSer = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV74ForSer_to = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV75IntCod = (String)getParm(obj,9,TypeConstants.STRING) ;
      sCtrlAV76IntCod_to = (String)getParm(obj,10,TypeConstants.STRING) ;
      sCtrlAV77MatCod = (String)getParm(obj,11,TypeConstants.STRING) ;
      sCtrlAV78MatCod_to = (String)getParm(obj,12,TypeConstants.STRING) ;
      sCtrlAV79TipColCod = (String)getParm(obj,13,TypeConstants.STRING) ;
      sCtrlAV80TipColCod_to = (String)getParm(obj,14,TypeConstants.STRING) ;
      sCtrlAV81ProForCod = (String)getParm(obj,15,TypeConstants.STRING) ;
      sCtrlAV82ProForCodDestino = (String)getParm(obj,16,TypeConstants.STRING) ;
      sCtrlAV83ProForDsc = (String)getParm(obj,17,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1K72( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "formulaciontinte\\sustitucionprocesoquimicoformulas_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1K72( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV66Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66Emprcod", AV66Emprcod);
         AV67Clicod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67Clicod), 6, 0));
         AV68Clicod_to = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68Clicod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68Clicod_to), 4, 0));
         AV69ForColNom = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69ForColNom", AV69ForColNom);
         AV70ForColNom_to = (String)getParm(obj,6,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70ForColNom_to", AV70ForColNom_to);
         AV71ForColNum = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71ForColNum), 6, 0));
         AV72ForColNum_to = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72ForColNum_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72ForColNum_to), 6, 0));
         AV73ForSer = (String)getParm(obj,9,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73ForSer", AV73ForSer);
         AV74ForSer_to = (String)getParm(obj,10,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74ForSer_to", AV74ForSer_to);
         AV75IntCod = ((Number) GXutil.testNumericType( getParm(obj,11,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV75IntCod), 2, 0));
         AV76IntCod_to = ((Number) GXutil.testNumericType( getParm(obj,12,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76IntCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV76IntCod_to), 2, 0));
         AV77MatCod = ((Number) GXutil.testNumericType( getParm(obj,13,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77MatCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77MatCod), 3, 0));
         AV78MatCod_to = ((Number) GXutil.testNumericType( getParm(obj,14,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78MatCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV78MatCod_to), 3, 0));
         AV79TipColCod = ((Number) GXutil.testNumericType( getParm(obj,15,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV79TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79TipColCod), 2, 0));
         AV80TipColCod_to = ((Number) GXutil.testNumericType( getParm(obj,16,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80TipColCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80TipColCod_to), 4, 0));
         AV81ProForCod = (String)getParm(obj,17,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81ProForCod", AV81ProForCod);
         AV82ProForCodDestino = (String)getParm(obj,18,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82ProForCodDestino", AV82ProForCodDestino);
         AV83ProForDsc = (String)getParm(obj,19,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83ProForDsc", AV83ProForDsc);
      }
      wcpOAV66Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV66Emprcod") ;
      wcpOAV67Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV67Clicod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV68Clicod_to = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV68Clicod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV69ForColNom = httpContext.cgiGet( sPrefix+"wcpOAV69ForColNom") ;
      wcpOAV70ForColNom_to = httpContext.cgiGet( sPrefix+"wcpOAV70ForColNom_to") ;
      wcpOAV71ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV71ForColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV72ForColNum_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV72ForColNum_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV73ForSer = httpContext.cgiGet( sPrefix+"wcpOAV73ForSer") ;
      wcpOAV74ForSer_to = httpContext.cgiGet( sPrefix+"wcpOAV74ForSer_to") ;
      wcpOAV75IntCod = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV75IntCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV76IntCod_to = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV76IntCod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV77MatCod = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV77MatCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV78MatCod_to = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV78MatCod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV79TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV79TipColCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV80TipColCod_to = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV80TipColCod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV81ProForCod = httpContext.cgiGet( sPrefix+"wcpOAV81ProForCod") ;
      wcpOAV82ProForCodDestino = httpContext.cgiGet( sPrefix+"wcpOAV82ProForCodDestino") ;
      wcpOAV83ProForDsc = httpContext.cgiGet( sPrefix+"wcpOAV83ProForDsc") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV66Emprcod, wcpOAV66Emprcod) != 0 ) || ( AV67Clicod != wcpOAV67Clicod ) || ( AV68Clicod_to != wcpOAV68Clicod_to ) || ( GXutil.strcmp(AV69ForColNom, wcpOAV69ForColNom) != 0 ) || ( GXutil.strcmp(AV70ForColNom_to, wcpOAV70ForColNom_to) != 0 ) || ( AV71ForColNum != wcpOAV71ForColNum ) || ( AV72ForColNum_to != wcpOAV72ForColNum_to ) || ( GXutil.strcmp(AV73ForSer, wcpOAV73ForSer) != 0 ) || ( GXutil.strcmp(AV74ForSer_to, wcpOAV74ForSer_to) != 0 ) || ( AV75IntCod != wcpOAV75IntCod ) || ( AV76IntCod_to != wcpOAV76IntCod_to ) || ( AV77MatCod != wcpOAV77MatCod ) || ( AV78MatCod_to != wcpOAV78MatCod_to ) || ( AV79TipColCod != wcpOAV79TipColCod ) || ( AV80TipColCod_to != wcpOAV80TipColCod_to ) || ( GXutil.strcmp(AV81ProForCod, wcpOAV81ProForCod) != 0 ) || ( GXutil.strcmp(AV82ProForCodDestino, wcpOAV82ProForCodDestino) != 0 ) || ( GXutil.strcmp(AV83ProForDsc, wcpOAV83ProForDsc) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV66Emprcod = AV66Emprcod ;
      wcpOAV67Clicod = AV67Clicod ;
      wcpOAV68Clicod_to = AV68Clicod_to ;
      wcpOAV69ForColNom = AV69ForColNom ;
      wcpOAV70ForColNom_to = AV70ForColNom_to ;
      wcpOAV71ForColNum = AV71ForColNum ;
      wcpOAV72ForColNum_to = AV72ForColNum_to ;
      wcpOAV73ForSer = AV73ForSer ;
      wcpOAV74ForSer_to = AV74ForSer_to ;
      wcpOAV75IntCod = AV75IntCod ;
      wcpOAV76IntCod_to = AV76IntCod_to ;
      wcpOAV77MatCod = AV77MatCod ;
      wcpOAV78MatCod_to = AV78MatCod_to ;
      wcpOAV79TipColCod = AV79TipColCod ;
      wcpOAV80TipColCod_to = AV80TipColCod_to ;
      wcpOAV81ProForCod = AV81ProForCod ;
      wcpOAV82ProForCodDestino = AV82ProForCodDestino ;
      wcpOAV83ProForDsc = AV83ProForDsc ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV66Emprcod = httpContext.cgiGet( sPrefix+"AV66Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV66Emprcod) > 0 )
      {
         AV66Emprcod = httpContext.cgiGet( sCtrlAV66Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66Emprcod", AV66Emprcod);
      }
      else
      {
         AV66Emprcod = httpContext.cgiGet( sPrefix+"AV66Emprcod_PARM") ;
      }
      sCtrlAV67Clicod = httpContext.cgiGet( sPrefix+"AV67Clicod_CTRL") ;
      if ( GXutil.len( sCtrlAV67Clicod) > 0 )
      {
         AV67Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV67Clicod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67Clicod), 6, 0));
      }
      else
      {
         AV67Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV67Clicod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV68Clicod_to = httpContext.cgiGet( sPrefix+"AV68Clicod_to_CTRL") ;
      if ( GXutil.len( sCtrlAV68Clicod_to) > 0 )
      {
         AV68Clicod_to = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV68Clicod_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68Clicod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68Clicod_to), 4, 0));
      }
      else
      {
         AV68Clicod_to = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV68Clicod_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV69ForColNom = httpContext.cgiGet( sPrefix+"AV69ForColNom_CTRL") ;
      if ( GXutil.len( sCtrlAV69ForColNom) > 0 )
      {
         AV69ForColNom = httpContext.cgiGet( sCtrlAV69ForColNom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69ForColNom", AV69ForColNom);
      }
      else
      {
         AV69ForColNom = httpContext.cgiGet( sPrefix+"AV69ForColNom_PARM") ;
      }
      sCtrlAV70ForColNom_to = httpContext.cgiGet( sPrefix+"AV70ForColNom_to_CTRL") ;
      if ( GXutil.len( sCtrlAV70ForColNom_to) > 0 )
      {
         AV70ForColNom_to = httpContext.cgiGet( sCtrlAV70ForColNom_to) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70ForColNom_to", AV70ForColNom_to);
      }
      else
      {
         AV70ForColNom_to = httpContext.cgiGet( sPrefix+"AV70ForColNom_to_PARM") ;
      }
      sCtrlAV71ForColNum = httpContext.cgiGet( sPrefix+"AV71ForColNum_CTRL") ;
      if ( GXutil.len( sCtrlAV71ForColNum) > 0 )
      {
         AV71ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV71ForColNum), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71ForColNum), 6, 0));
      }
      else
      {
         AV71ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV71ForColNum_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV72ForColNum_to = httpContext.cgiGet( sPrefix+"AV72ForColNum_to_CTRL") ;
      if ( GXutil.len( sCtrlAV72ForColNum_to) > 0 )
      {
         AV72ForColNum_to = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV72ForColNum_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72ForColNum_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72ForColNum_to), 6, 0));
      }
      else
      {
         AV72ForColNum_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV72ForColNum_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV73ForSer = httpContext.cgiGet( sPrefix+"AV73ForSer_CTRL") ;
      if ( GXutil.len( sCtrlAV73ForSer) > 0 )
      {
         AV73ForSer = httpContext.cgiGet( sCtrlAV73ForSer) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73ForSer", AV73ForSer);
      }
      else
      {
         AV73ForSer = httpContext.cgiGet( sPrefix+"AV73ForSer_PARM") ;
      }
      sCtrlAV74ForSer_to = httpContext.cgiGet( sPrefix+"AV74ForSer_to_CTRL") ;
      if ( GXutil.len( sCtrlAV74ForSer_to) > 0 )
      {
         AV74ForSer_to = httpContext.cgiGet( sCtrlAV74ForSer_to) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74ForSer_to", AV74ForSer_to);
      }
      else
      {
         AV74ForSer_to = httpContext.cgiGet( sPrefix+"AV74ForSer_to_PARM") ;
      }
      sCtrlAV75IntCod = httpContext.cgiGet( sPrefix+"AV75IntCod_CTRL") ;
      if ( GXutil.len( sCtrlAV75IntCod) > 0 )
      {
         AV75IntCod = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV75IntCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV75IntCod), 2, 0));
      }
      else
      {
         AV75IntCod = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV75IntCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV76IntCod_to = httpContext.cgiGet( sPrefix+"AV76IntCod_to_CTRL") ;
      if ( GXutil.len( sCtrlAV76IntCod_to) > 0 )
      {
         AV76IntCod_to = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV76IntCod_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76IntCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV76IntCod_to), 2, 0));
      }
      else
      {
         AV76IntCod_to = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV76IntCod_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV77MatCod = httpContext.cgiGet( sPrefix+"AV77MatCod_CTRL") ;
      if ( GXutil.len( sCtrlAV77MatCod) > 0 )
      {
         AV77MatCod = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV77MatCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77MatCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77MatCod), 3, 0));
      }
      else
      {
         AV77MatCod = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV77MatCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV78MatCod_to = httpContext.cgiGet( sPrefix+"AV78MatCod_to_CTRL") ;
      if ( GXutil.len( sCtrlAV78MatCod_to) > 0 )
      {
         AV78MatCod_to = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV78MatCod_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78MatCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV78MatCod_to), 3, 0));
      }
      else
      {
         AV78MatCod_to = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV78MatCod_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV79TipColCod = httpContext.cgiGet( sPrefix+"AV79TipColCod_CTRL") ;
      if ( GXutil.len( sCtrlAV79TipColCod) > 0 )
      {
         AV79TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV79TipColCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV79TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79TipColCod), 2, 0));
      }
      else
      {
         AV79TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV79TipColCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV80TipColCod_to = httpContext.cgiGet( sPrefix+"AV80TipColCod_to_CTRL") ;
      if ( GXutil.len( sCtrlAV80TipColCod_to) > 0 )
      {
         AV80TipColCod_to = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV80TipColCod_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80TipColCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80TipColCod_to), 4, 0));
      }
      else
      {
         AV80TipColCod_to = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV80TipColCod_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV81ProForCod = httpContext.cgiGet( sPrefix+"AV81ProForCod_CTRL") ;
      if ( GXutil.len( sCtrlAV81ProForCod) > 0 )
      {
         AV81ProForCod = httpContext.cgiGet( sCtrlAV81ProForCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81ProForCod", AV81ProForCod);
      }
      else
      {
         AV81ProForCod = httpContext.cgiGet( sPrefix+"AV81ProForCod_PARM") ;
      }
      sCtrlAV82ProForCodDestino = httpContext.cgiGet( sPrefix+"AV82ProForCodDestino_CTRL") ;
      if ( GXutil.len( sCtrlAV82ProForCodDestino) > 0 )
      {
         AV82ProForCodDestino = httpContext.cgiGet( sCtrlAV82ProForCodDestino) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82ProForCodDestino", AV82ProForCodDestino);
      }
      else
      {
         AV82ProForCodDestino = httpContext.cgiGet( sPrefix+"AV82ProForCodDestino_PARM") ;
      }
      sCtrlAV83ProForDsc = httpContext.cgiGet( sPrefix+"AV83ProForDsc_CTRL") ;
      if ( GXutil.len( sCtrlAV83ProForDsc) > 0 )
      {
         AV83ProForDsc = httpContext.cgiGet( sCtrlAV83ProForDsc) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83ProForDsc", AV83ProForDsc);
      }
      else
      {
         AV83ProForDsc = httpContext.cgiGet( sPrefix+"AV83ProForDsc_PARM") ;
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
      pa1K72( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1K72( ) ;
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
      ws1K72( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV66Emprcod_PARM", GXutil.rtrim( AV66Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV66Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV66Emprcod_CTRL", GXutil.rtrim( sCtrlAV66Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV67Clicod_PARM", GXutil.ltrim( localUtil.ntoc( AV67Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV67Clicod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV67Clicod_CTRL", GXutil.rtrim( sCtrlAV67Clicod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV68Clicod_to_PARM", GXutil.ltrim( localUtil.ntoc( AV68Clicod_to, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV68Clicod_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV68Clicod_to_CTRL", GXutil.rtrim( sCtrlAV68Clicod_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV69ForColNom_PARM", GXutil.rtrim( AV69ForColNom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV69ForColNom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV69ForColNom_CTRL", GXutil.rtrim( sCtrlAV69ForColNom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV70ForColNom_to_PARM", GXutil.rtrim( AV70ForColNom_to));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV70ForColNom_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV70ForColNom_to_CTRL", GXutil.rtrim( sCtrlAV70ForColNom_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV71ForColNum_PARM", GXutil.ltrim( localUtil.ntoc( AV71ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV71ForColNum)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV71ForColNum_CTRL", GXutil.rtrim( sCtrlAV71ForColNum));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV72ForColNum_to_PARM", GXutil.ltrim( localUtil.ntoc( AV72ForColNum_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV72ForColNum_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV72ForColNum_to_CTRL", GXutil.rtrim( sCtrlAV72ForColNum_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV73ForSer_PARM", GXutil.rtrim( AV73ForSer));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV73ForSer)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV73ForSer_CTRL", GXutil.rtrim( sCtrlAV73ForSer));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV74ForSer_to_PARM", GXutil.rtrim( AV74ForSer_to));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV74ForSer_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV74ForSer_to_CTRL", GXutil.rtrim( sCtrlAV74ForSer_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV75IntCod_PARM", GXutil.ltrim( localUtil.ntoc( AV75IntCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV75IntCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV75IntCod_CTRL", GXutil.rtrim( sCtrlAV75IntCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV76IntCod_to_PARM", GXutil.ltrim( localUtil.ntoc( AV76IntCod_to, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV76IntCod_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV76IntCod_to_CTRL", GXutil.rtrim( sCtrlAV76IntCod_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV77MatCod_PARM", GXutil.ltrim( localUtil.ntoc( AV77MatCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV77MatCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV77MatCod_CTRL", GXutil.rtrim( sCtrlAV77MatCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV78MatCod_to_PARM", GXutil.ltrim( localUtil.ntoc( AV78MatCod_to, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV78MatCod_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV78MatCod_to_CTRL", GXutil.rtrim( sCtrlAV78MatCod_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV79TipColCod_PARM", GXutil.ltrim( localUtil.ntoc( AV79TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV79TipColCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV79TipColCod_CTRL", GXutil.rtrim( sCtrlAV79TipColCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV80TipColCod_to_PARM", GXutil.ltrim( localUtil.ntoc( AV80TipColCod_to, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV80TipColCod_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV80TipColCod_to_CTRL", GXutil.rtrim( sCtrlAV80TipColCod_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV81ProForCod_PARM", GXutil.rtrim( AV81ProForCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV81ProForCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV81ProForCod_CTRL", GXutil.rtrim( sCtrlAV81ProForCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV82ProForCodDestino_PARM", GXutil.rtrim( AV82ProForCodDestino));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV82ProForCodDestino)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV82ProForCodDestino_CTRL", GXutil.rtrim( sCtrlAV82ProForCodDestino));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV83ProForDsc_PARM", GXutil.rtrim( AV83ProForDsc));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV83ProForDsc)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV83ProForDsc_CTRL", GXutil.rtrim( sCtrlAV83ProForDsc));
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
      we1K72( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026821169657", true, true);
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
      httpContext.AddJavascriptSource("formulaciontinte/sustitucionprocesoquimicoformulas_wc.js", "?2026821169658", false, true);
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

   public void subsflControlProps_232( )
   {
      edtCliCod_Internalname = sPrefix+"CLICOD_"+sGXsfl_23_idx ;
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_23_idx ;
      edtForSer_Internalname = sPrefix+"FORSER_"+sGXsfl_23_idx ;
      edtForSerDsc_Internalname = sPrefix+"FORSERDSC_"+sGXsfl_23_idx ;
      edtForColNom_Internalname = sPrefix+"FORCOLNOM_"+sGXsfl_23_idx ;
      edtForColNum_Internalname = sPrefix+"FORCOLNUM_"+sGXsfl_23_idx ;
      edtTipColCod_Internalname = sPrefix+"TIPCOLCOD_"+sGXsfl_23_idx ;
      edtIntDsc_Internalname = sPrefix+"INTDSC_"+sGXsfl_23_idx ;
      edtMatDsc_Internalname = sPrefix+"MATDSC_"+sGXsfl_23_idx ;
   }

   public void subsflControlProps_fel_232( )
   {
      edtCliCod_Internalname = sPrefix+"CLICOD_"+sGXsfl_23_fel_idx ;
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_23_fel_idx ;
      edtForSer_Internalname = sPrefix+"FORSER_"+sGXsfl_23_fel_idx ;
      edtForSerDsc_Internalname = sPrefix+"FORSERDSC_"+sGXsfl_23_fel_idx ;
      edtForColNom_Internalname = sPrefix+"FORCOLNOM_"+sGXsfl_23_fel_idx ;
      edtForColNum_Internalname = sPrefix+"FORCOLNUM_"+sGXsfl_23_fel_idx ;
      edtTipColCod_Internalname = sPrefix+"TIPCOLCOD_"+sGXsfl_23_fel_idx ;
      edtIntDsc_Internalname = sPrefix+"INTDSC_"+sGXsfl_23_fel_idx ;
      edtMatDsc_Internalname = sPrefix+"MATDSC_"+sGXsfl_23_fel_idx ;
   }

   public void sendrow_232( )
   {
      subsflControlProps_232( ) ;
      wb1K70( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_23_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_23_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_23_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(23),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(23),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForSer_Internalname,GXutil.rtrim( A494ForSer),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtForSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(23),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForSerDsc_Internalname,GXutil.rtrim( A5742ForSerDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtForSerDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(23),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForColNom_Internalname,GXutil.rtrim( A482ForColNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtForColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(23),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A483ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtForColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(23),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipColCod_Internalname,GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTipColCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(23),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtIntDsc_Internalname,GXutil.rtrim( A584IntDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtIntDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(23),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMatDsc_Internalname,GXutil.rtrim( A627MatDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMatDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(23),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes1K72( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_23_idx = ((subGrid_Islastpage==1)&&(nGXsfl_23_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_23_idx+1) ;
         sGXsfl_23_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_23_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_232( ) ;
      }
      /* End function sendrow_232 */
   }

   public void startgridcontrol23( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"23\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Intensidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Matiz", "")) ;
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
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A279CliNom));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A494ForSer));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5742ForSerDsc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A482ForColNom));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A483ForColNum, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A584IntDsc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A627MatDsc));
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
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      edtCliCod_Internalname = sPrefix+"CLICOD" ;
      edtCliNom_Internalname = sPrefix+"CLINOM" ;
      edtForSer_Internalname = sPrefix+"FORSER" ;
      edtForSerDsc_Internalname = sPrefix+"FORSERDSC" ;
      edtForColNom_Internalname = sPrefix+"FORCOLNOM" ;
      edtForColNum_Internalname = sPrefix+"FORCOLNUM" ;
      edtTipColCod_Internalname = sPrefix+"TIPCOLCOD" ;
      edtIntDsc_Internalname = sPrefix+"INTDSC" ;
      edtMatDsc_Internalname = sPrefix+"MATDSC" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
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
      edtMatDsc_Jsonclick = "" ;
      edtIntDsc_Jsonclick = "" ;
      edtTipColCod_Jsonclick = "" ;
      edtForColNum_Jsonclick = "" ;
      edtForColNom_Jsonclick = "" ;
      edtForSerDsc_Jsonclick = "" ;
      edtForSer_Jsonclick = "" ;
      edtCliNom_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      subGrid_Sortable = (byte)(0) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_grid_Datalistproc = "FormulacionTinte.SustitucionProcesoQuimicoFormulas_WCGetFilterData" ;
      Ddo_grid_Datalisttype = "|Dynamic|Dynamic|Dynamic|Dynamic|||Dynamic|Dynamic" ;
      Ddo_grid_Includedatalist = "|T|T|T|T|||T|T" ;
      Ddo_grid_Filterisrange = "T|||||T|T||" ;
      Ddo_grid_Filtertype = "Numeric|Character|Character|Character|Character|Numeric|Numeric|Character|Character" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6|7|8|9|10" ;
      Ddo_grid_Columnids = "0:CliCod|1:CliNom|2:ForSer|3:ForSerDsc|4:ForColNom|5:ForColNum|6:TipColCod|7:IntDsc|8:MatDsc" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV66Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV67Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV68Clicod_to',fld:'vCLICOD_TO',pic:'ZZZ9'},{av:'AV69ForColNom',fld:'vFORCOLNOM',pic:''},{av:'AV70ForColNom_to',fld:'vFORCOLNOM_TO',pic:''},{av:'AV71ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV72ForColNum_to',fld:'vFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV73ForSer',fld:'vFORSER',pic:''},{av:'AV74ForSer_to',fld:'vFORSER_TO',pic:''},{av:'AV75IntCod',fld:'vINTCOD',pic:'Z9'},{av:'AV76IntCod_to',fld:'vINTCOD_TO',pic:'Z9'},{av:'AV77MatCod',fld:'vMATCOD',pic:'ZZ9'},{av:'AV78MatCod_to',fld:'vMATCOD_TO',pic:'ZZ9'},{av:'AV79TipColCod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV80TipColCod_to',fld:'vTIPCOLCOD_TO',pic:'ZZZ9'},{av:'AV81ProForCod',fld:'vPROFORCOD',pic:''},{av:'AV28TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV29TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV62TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV63TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV30TFForSer',fld:'vTFFORSER',pic:''},{av:'AV31TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV64TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV65TFForSerDsc_Sel',fld:'vTFFORSERDSC_SEL',pic:''},{av:'AV32TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV33TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV34TFForColNum',fld:'vTFFORCOLNUM',pic:'ZZZZZ9'},{av:'AV35TFForColNum_To',fld:'vTFFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV36TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV37TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV88TFIntDsc',fld:'vTFINTDSC',pic:''},{av:'AV89TFIntDsc_Sel',fld:'vTFINTDSC_SEL',pic:''},{av:'AV86TFMatDsc',fld:'vTFMATDSC',pic:''},{av:'AV87TFMatDsc_Sel',fld:'vTFMATDSC_SEL',pic:''},{av:'AV92Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV82ProForCodDestino',fld:'vPROFORCODDESTINO',pic:''},{av:'AV83ProForDsc',fld:'vPROFORDSC',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV59GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV60GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e111K72',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV66Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV67Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV68Clicod_to',fld:'vCLICOD_TO',pic:'ZZZ9'},{av:'AV69ForColNom',fld:'vFORCOLNOM',pic:''},{av:'AV70ForColNom_to',fld:'vFORCOLNOM_TO',pic:''},{av:'AV71ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV72ForColNum_to',fld:'vFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV73ForSer',fld:'vFORSER',pic:''},{av:'AV74ForSer_to',fld:'vFORSER_TO',pic:''},{av:'AV75IntCod',fld:'vINTCOD',pic:'Z9'},{av:'AV76IntCod_to',fld:'vINTCOD_TO',pic:'Z9'},{av:'AV77MatCod',fld:'vMATCOD',pic:'ZZ9'},{av:'AV78MatCod_to',fld:'vMATCOD_TO',pic:'ZZ9'},{av:'AV79TipColCod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV80TipColCod_to',fld:'vTIPCOLCOD_TO',pic:'ZZZ9'},{av:'AV81ProForCod',fld:'vPROFORCOD',pic:''},{av:'AV28TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV29TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV62TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV63TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV30TFForSer',fld:'vTFFORSER',pic:''},{av:'AV31TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV64TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV65TFForSerDsc_Sel',fld:'vTFFORSERDSC_SEL',pic:''},{av:'AV32TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV33TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV34TFForColNum',fld:'vTFFORCOLNUM',pic:'ZZZZZ9'},{av:'AV35TFForColNum_To',fld:'vTFFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV36TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV37TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV88TFIntDsc',fld:'vTFINTDSC',pic:''},{av:'AV89TFIntDsc_Sel',fld:'vTFINTDSC_SEL',pic:''},{av:'AV86TFMatDsc',fld:'vTFMATDSC',pic:''},{av:'AV87TFMatDsc_Sel',fld:'vTFMATDSC_SEL',pic:''},{av:'AV92Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV82ProForCodDestino',fld:'vPROFORCODDESTINO',pic:''},{av:'AV83ProForDsc',fld:'vPROFORDSC',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e121K72',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV66Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV67Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV68Clicod_to',fld:'vCLICOD_TO',pic:'ZZZ9'},{av:'AV69ForColNom',fld:'vFORCOLNOM',pic:''},{av:'AV70ForColNom_to',fld:'vFORCOLNOM_TO',pic:''},{av:'AV71ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV72ForColNum_to',fld:'vFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV73ForSer',fld:'vFORSER',pic:''},{av:'AV74ForSer_to',fld:'vFORSER_TO',pic:''},{av:'AV75IntCod',fld:'vINTCOD',pic:'Z9'},{av:'AV76IntCod_to',fld:'vINTCOD_TO',pic:'Z9'},{av:'AV77MatCod',fld:'vMATCOD',pic:'ZZ9'},{av:'AV78MatCod_to',fld:'vMATCOD_TO',pic:'ZZ9'},{av:'AV79TipColCod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV80TipColCod_to',fld:'vTIPCOLCOD_TO',pic:'ZZZ9'},{av:'AV81ProForCod',fld:'vPROFORCOD',pic:''},{av:'AV28TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV29TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV62TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV63TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV30TFForSer',fld:'vTFFORSER',pic:''},{av:'AV31TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV64TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV65TFForSerDsc_Sel',fld:'vTFFORSERDSC_SEL',pic:''},{av:'AV32TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV33TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV34TFForColNum',fld:'vTFFORCOLNUM',pic:'ZZZZZ9'},{av:'AV35TFForColNum_To',fld:'vTFFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV36TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV37TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV88TFIntDsc',fld:'vTFINTDSC',pic:''},{av:'AV89TFIntDsc_Sel',fld:'vTFINTDSC_SEL',pic:''},{av:'AV86TFMatDsc',fld:'vTFMATDSC',pic:''},{av:'AV87TFMatDsc_Sel',fld:'vTFMATDSC_SEL',pic:''},{av:'AV92Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV82ProForCodDestino',fld:'vPROFORCODDESTINO',pic:''},{av:'AV83ProForDsc',fld:'vPROFORDSC',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e131K72',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV66Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV67Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV68Clicod_to',fld:'vCLICOD_TO',pic:'ZZZ9'},{av:'AV69ForColNom',fld:'vFORCOLNOM',pic:''},{av:'AV70ForColNom_to',fld:'vFORCOLNOM_TO',pic:''},{av:'AV71ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV72ForColNum_to',fld:'vFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV73ForSer',fld:'vFORSER',pic:''},{av:'AV74ForSer_to',fld:'vFORSER_TO',pic:''},{av:'AV75IntCod',fld:'vINTCOD',pic:'Z9'},{av:'AV76IntCod_to',fld:'vINTCOD_TO',pic:'Z9'},{av:'AV77MatCod',fld:'vMATCOD',pic:'ZZ9'},{av:'AV78MatCod_to',fld:'vMATCOD_TO',pic:'ZZ9'},{av:'AV79TipColCod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV80TipColCod_to',fld:'vTIPCOLCOD_TO',pic:'ZZZ9'},{av:'AV81ProForCod',fld:'vPROFORCOD',pic:''},{av:'AV28TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV29TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV62TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV63TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV30TFForSer',fld:'vTFFORSER',pic:''},{av:'AV31TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV64TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV65TFForSerDsc_Sel',fld:'vTFFORSERDSC_SEL',pic:''},{av:'AV32TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV33TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV34TFForColNum',fld:'vTFFORCOLNUM',pic:'ZZZZZ9'},{av:'AV35TFForColNum_To',fld:'vTFFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV36TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV37TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV88TFIntDsc',fld:'vTFINTDSC',pic:''},{av:'AV89TFIntDsc_Sel',fld:'vTFINTDSC_SEL',pic:''},{av:'AV86TFMatDsc',fld:'vTFMATDSC',pic:''},{av:'AV87TFMatDsc_Sel',fld:'vTFMATDSC_SEL',pic:''},{av:'AV92Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV82ProForCodDestino',fld:'vPROFORCODDESTINO',pic:''},{av:'AV83ProForDsc',fld:'vPROFORDSC',pic:''},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV86TFMatDsc',fld:'vTFMATDSC',pic:''},{av:'AV87TFMatDsc_Sel',fld:'vTFMATDSC_SEL',pic:''},{av:'AV88TFIntDsc',fld:'vTFINTDSC',pic:''},{av:'AV89TFIntDsc_Sel',fld:'vTFINTDSC_SEL',pic:''},{av:'AV36TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV37TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV34TFForColNum',fld:'vTFFORCOLNUM',pic:'ZZZZZ9'},{av:'AV35TFForColNum_To',fld:'vTFFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV32TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV33TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV64TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV65TFForSerDsc_Sel',fld:'vTFFORSERDSC_SEL',pic:''},{av:'AV30TFForSer',fld:'vTFFORSER',pic:''},{av:'AV31TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV62TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV63TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV28TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV29TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e161K72',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_FORSER","{handler:'valid_Forser',iparms:[]");
      setEventMetadata("VALID_FORSER",",oparms:[]}");
      setEventMetadata("VALID_FORCOLNOM","{handler:'valid_Forcolnom',iparms:[]");
      setEventMetadata("VALID_FORCOLNOM",",oparms:[]}");
      setEventMetadata("VALID_FORCOLNUM","{handler:'valid_Forcolnum',iparms:[]");
      setEventMetadata("VALID_FORCOLNUM",",oparms:[]}");
      setEventMetadata("VALID_TIPCOLCOD","{handler:'valid_Tipcolcod',iparms:[]");
      setEventMetadata("VALID_TIPCOLCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Matdsc',iparms:[]");
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
      wcpOAV66Emprcod = "" ;
      wcpOAV69ForColNom = "" ;
      wcpOAV70ForColNom_to = "" ;
      wcpOAV73ForSer = "" ;
      wcpOAV74ForSer_to = "" ;
      wcpOAV81ProForCod = "" ;
      wcpOAV82ProForCodDestino = "" ;
      wcpOAV83ProForDsc = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV66Emprcod = "" ;
      AV69ForColNom = "" ;
      AV70ForColNom_to = "" ;
      AV73ForSer = "" ;
      AV74ForSer_to = "" ;
      AV81ProForCod = "" ;
      AV82ProForCodDestino = "" ;
      AV83ProForDsc = "" ;
      AV62TFCliNom = "" ;
      AV63TFCliNom_Sel = "" ;
      AV30TFForSer = "" ;
      AV31TFForSer_Sel = "" ;
      AV64TFForSerDsc = "" ;
      AV65TFForSerDsc_Sel = "" ;
      AV32TFForColNom = "" ;
      AV33TFForColNom_Sel = "" ;
      AV88TFIntDsc = "" ;
      AV89TFIntDsc_Sel = "" ;
      AV86TFMatDsc = "" ;
      AV87TFMatDsc_Sel = "" ;
      AV92Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV57DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A279CliNom = "" ;
      A494ForSer = "" ;
      A5742ForSerDsc = "" ;
      A482ForColNom = "" ;
      A584IntDsc = "" ;
      A627MatDsc = "" ;
      scmdbuf = "" ;
      lV98Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_3_tfclinom = "" ;
      lV100Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_5_tfforser = "" ;
      lV102Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_7_tfforserdsc = "" ;
      lV104Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_9_tfforcolnom = "" ;
      lV110Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_15_tfintdsc = "" ;
      lV112Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_17_tfmatdsc = "" ;
      AV99Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_4_tfclinom_sel = "" ;
      AV98Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_3_tfclinom = "" ;
      AV101Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_6_tfforser_sel = "" ;
      AV100Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_5_tfforser = "" ;
      AV103Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_8_tfforserdsc_sel = "" ;
      AV102Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_7_tfforserdsc = "" ;
      AV105Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_10_tfforcolnom_sel = "" ;
      AV104Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_9_tfforcolnom = "" ;
      AV111Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_16_tfintdsc_sel = "" ;
      AV110Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_15_tfintdsc = "" ;
      AV113Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_18_tfmatdsc_sel = "" ;
      AV112Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_17_tfmatdsc = "" ;
      A396EmprCod = "" ;
      A764ProForCod = "" ;
      H01K72_A1160ProForL = new short[1] ;
      H01K72_A626MatCod = new short[1] ;
      H01K72_A583IntCod = new byte[1] ;
      H01K72_A396EmprCod = new String[] {""} ;
      H01K72_A764ProForCod = new String[] {""} ;
      H01K72_A627MatDsc = new String[] {""} ;
      H01K72_n627MatDsc = new boolean[] {false} ;
      H01K72_A584IntDsc = new String[] {""} ;
      H01K72_n584IntDsc = new boolean[] {false} ;
      H01K72_A831TipColCod = new byte[1] ;
      H01K72_A483ForColNum = new int[1] ;
      H01K72_A482ForColNom = new String[] {""} ;
      H01K72_A5742ForSerDsc = new String[] {""} ;
      H01K72_n5742ForSerDsc = new boolean[] {false} ;
      H01K72_A494ForSer = new String[] {""} ;
      H01K72_A279CliNom = new String[] {""} ;
      H01K72_A252CliCod = new int[1] ;
      H01K73_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV93Station = "" ;
      AV94Emprnom = "" ;
      AV95Usurcod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV22Session = httpContext.getWebSession();
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char14 = "" ;
      GXv_char15 = new String[1] ;
      GXt_char12 = "" ;
      GXv_char13 = new String[1] ;
      GXt_char10 = "" ;
      GXv_char11 = new String[1] ;
      GXt_char9 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char8 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState16 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV66Emprcod = "" ;
      sCtrlAV67Clicod = "" ;
      sCtrlAV68Clicod_to = "" ;
      sCtrlAV69ForColNom = "" ;
      sCtrlAV70ForColNom_to = "" ;
      sCtrlAV71ForColNum = "" ;
      sCtrlAV72ForColNum_to = "" ;
      sCtrlAV73ForSer = "" ;
      sCtrlAV74ForSer_to = "" ;
      sCtrlAV75IntCod = "" ;
      sCtrlAV76IntCod_to = "" ;
      sCtrlAV77MatCod = "" ;
      sCtrlAV78MatCod_to = "" ;
      sCtrlAV79TipColCod = "" ;
      sCtrlAV80TipColCod_to = "" ;
      sCtrlAV81ProForCod = "" ;
      sCtrlAV82ProForCodDestino = "" ;
      sCtrlAV83ProForDsc = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.sustitucionprocesoquimicoformulas_wc__default(),
         new Object[] {
             new Object[] {
            H01K72_A1160ProForL, H01K72_A626MatCod, H01K72_A583IntCod, H01K72_A396EmprCod, H01K72_A764ProForCod, H01K72_A627MatDsc, H01K72_n627MatDsc, H01K72_A584IntDsc, H01K72_n584IntDsc, H01K72_A831TipColCod,
            H01K72_A483ForColNum, H01K72_A482ForColNom, H01K72_A5742ForSerDsc, H01K72_n5742ForSerDsc, H01K72_A494ForSer, H01K72_A279CliNom, H01K72_A252CliCod
            }
            , new Object[] {
            H01K73_AGRID_nRecordCount
            }
         }
      );
      AV92Pgmname = "FormulacionTinte.SustitucionProcesoQuimicoFormulas_WC" ;
      /* GeneXus formulas. */
      AV92Pgmname = "FormulacionTinte.SustitucionProcesoQuimicoFormulas_WC" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOAV75IntCod ;
   private byte wcpOAV76IntCod_to ;
   private byte wcpOAV79TipColCod ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV75IntCod ;
   private byte AV76IntCod_to ;
   private byte AV79TipColCod ;
   private byte AV36TFTipColCod ;
   private byte AV37TFTipColCod_To ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte A831TipColCod ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV108Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_13_tftipcolcod ;
   private byte AV109Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_14_tftipcolcod_to ;
   private byte A583IntCod ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short wcpOAV68Clicod_to ;
   private short wcpOAV77MatCod ;
   private short wcpOAV78MatCod_to ;
   private short wcpOAV80TipColCod_to ;
   private short AV68Clicod_to ;
   private short AV77MatCod ;
   private short AV78MatCod_to ;
   private short AV80TipColCod_to ;
   private short AV12OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short A626MatCod ;
   private int wcpOAV67Clicod ;
   private int wcpOAV71ForColNum ;
   private int wcpOAV72ForColNum_to ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_23 ;
   private int AV67Clicod ;
   private int AV71ForColNum ;
   private int AV72ForColNum_to ;
   private int nGXsfl_23_idx=1 ;
   private int AV28TFCliCod ;
   private int AV29TFCliCod_To ;
   private int AV34TFForColNum ;
   private int AV35TFForColNum_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavPgmname_Enabled ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV96Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_1_tfclicod ;
   private int AV97Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_2_tfclicod_to ;
   private int AV106Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_11_tfforcolnum ;
   private int AV107Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_12_tfforcolnum_to ;
   private int AV58PageToGo ;
   private int AV114GXV1 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV59GridCurrentPage ;
   private long AV60GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private String wcpOAV66Emprcod ;
   private String wcpOAV69ForColNom ;
   private String wcpOAV70ForColNom_to ;
   private String wcpOAV73ForSer ;
   private String wcpOAV74ForSer_to ;
   private String wcpOAV81ProForCod ;
   private String wcpOAV82ProForCodDestino ;
   private String wcpOAV83ProForDsc ;
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
   private String AV66Emprcod ;
   private String AV69ForColNom ;
   private String AV70ForColNom_to ;
   private String AV73ForSer ;
   private String AV74ForSer_to ;
   private String AV81ProForCod ;
   private String AV82ProForCodDestino ;
   private String AV83ProForDsc ;
   private String sGXsfl_23_idx="0001" ;
   private String AV62TFCliNom ;
   private String AV63TFCliNom_Sel ;
   private String AV30TFForSer ;
   private String AV31TFForSer_Sel ;
   private String AV64TFForSerDsc ;
   private String AV65TFForSerDsc_Sel ;
   private String AV32TFForColNom ;
   private String AV33TFForColNom_Sel ;
   private String AV88TFIntDsc ;
   private String AV89TFIntDsc_Sel ;
   private String AV86TFMatDsc ;
   private String AV87TFMatDsc_Sel ;
   private String AV92Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
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
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtCliCod_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Internalname ;
   private String A494ForSer ;
   private String edtForSer_Internalname ;
   private String A5742ForSerDsc ;
   private String edtForSerDsc_Internalname ;
   private String A482ForColNom ;
   private String edtForColNom_Internalname ;
   private String edtForColNum_Internalname ;
   private String edtTipColCod_Internalname ;
   private String A584IntDsc ;
   private String edtIntDsc_Internalname ;
   private String A627MatDsc ;
   private String edtMatDsc_Internalname ;
   private String scmdbuf ;
   private String lV98Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_3_tfclinom ;
   private String lV100Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_5_tfforser ;
   private String lV102Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_7_tfforserdsc ;
   private String lV104Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_9_tfforcolnom ;
   private String lV110Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_15_tfintdsc ;
   private String lV112Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_17_tfmatdsc ;
   private String AV99Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_4_tfclinom_sel ;
   private String AV98Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_3_tfclinom ;
   private String AV101Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_6_tfforser_sel ;
   private String AV100Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_5_tfforser ;
   private String AV103Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_8_tfforserdsc_sel ;
   private String AV102Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_7_tfforserdsc ;
   private String AV105Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_10_tfforcolnom_sel ;
   private String AV104Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_9_tfforcolnom ;
   private String AV111Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_16_tfintdsc_sel ;
   private String AV110Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_15_tfintdsc ;
   private String AV113Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_18_tfmatdsc_sel ;
   private String AV112Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_17_tfmatdsc ;
   private String A396EmprCod ;
   private String A764ProForCod ;
   private String hsh ;
   private String AV93Station ;
   private String AV94Emprnom ;
   private String AV95Usurcod ;
   private String GXt_char14 ;
   private String GXv_char15[] ;
   private String GXt_char12 ;
   private String GXv_char13[] ;
   private String GXt_char10 ;
   private String GXv_char11[] ;
   private String GXt_char9 ;
   private String GXv_char4[] ;
   private String GXt_char8 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblTablerightheader_Internalname ;
   private String sCtrlAV66Emprcod ;
   private String sCtrlAV67Clicod ;
   private String sCtrlAV68Clicod_to ;
   private String sCtrlAV69ForColNom ;
   private String sCtrlAV70ForColNom_to ;
   private String sCtrlAV71ForColNum ;
   private String sCtrlAV72ForColNum_to ;
   private String sCtrlAV73ForSer ;
   private String sCtrlAV74ForSer_to ;
   private String sCtrlAV75IntCod ;
   private String sCtrlAV76IntCod_to ;
   private String sCtrlAV77MatCod ;
   private String sCtrlAV78MatCod_to ;
   private String sCtrlAV79TipColCod ;
   private String sCtrlAV80TipColCod_to ;
   private String sCtrlAV81ProForCod ;
   private String sCtrlAV82ProForCodDestino ;
   private String sCtrlAV83ProForDsc ;
   private String sGXsfl_23_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtForSer_Jsonclick ;
   private String edtForSerDsc_Jsonclick ;
   private String edtForColNom_Jsonclick ;
   private String edtForColNum_Jsonclick ;
   private String edtTipColCod_Jsonclick ;
   private String edtIntDsc_Jsonclick ;
   private String edtMatDsc_Jsonclick ;
   private String subGrid_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV13OrderedDsc ;
   private boolean Gridpaginationbar_Showfirst ;
   private boolean Gridpaginationbar_Showprevious ;
   private boolean Gridpaginationbar_Shownext ;
   private boolean Gridpaginationbar_Showlast ;
   private boolean Gridpaginationbar_Rowsperpageselector ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n5742ForSerDsc ;
   private boolean n584IntDsc ;
   private boolean n627MatDsc ;
   private boolean bGXsfl_23_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV22Session ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private short[] H01K72_A1160ProForL ;
   private short[] H01K72_A626MatCod ;
   private byte[] H01K72_A583IntCod ;
   private String[] H01K72_A396EmprCod ;
   private String[] H01K72_A764ProForCod ;
   private String[] H01K72_A627MatDsc ;
   private boolean[] H01K72_n627MatDsc ;
   private String[] H01K72_A584IntDsc ;
   private boolean[] H01K72_n584IntDsc ;
   private byte[] H01K72_A831TipColCod ;
   private int[] H01K72_A483ForColNum ;
   private String[] H01K72_A482ForColNom ;
   private String[] H01K72_A5742ForSerDsc ;
   private boolean[] H01K72_n5742ForSerDsc ;
   private String[] H01K72_A494ForSer ;
   private String[] H01K72_A279CliNom ;
   private int[] H01K72_A252CliCod ;
   private long[] H01K73_AGRID_nRecordCount ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV57DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState16[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
}

final  class sustitucionprocesoquimicoformulas_wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01K72( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV96Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_1_tfclicod ,
                                          int AV97Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_2_tfclicod_to ,
                                          String AV99Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_4_tfclinom_sel ,
                                          String AV98Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_3_tfclinom ,
                                          String AV101Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_6_tfforser_sel ,
                                          String AV100Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_5_tfforser ,
                                          String AV103Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_8_tfforserdsc_sel ,
                                          String AV102Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_7_tfforserdsc ,
                                          String AV105Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_10_tfforcolnom_sel ,
                                          String AV104Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_9_tfforcolnom ,
                                          int AV106Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_11_tfforcolnum ,
                                          int AV107Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_12_tfforcolnum_to ,
                                          byte AV108Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_13_tftipcolcod ,
                                          byte AV109Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_14_tftipcolcod_to ,
                                          String AV111Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_16_tfintdsc_sel ,
                                          String AV110Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_15_tfintdsc ,
                                          String AV113Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_18_tfmatdsc_sel ,
                                          String AV112Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_17_tfmatdsc ,
                                          int AV67Clicod ,
                                          short AV68Clicod_to ,
                                          String AV69ForColNom ,
                                          String AV70ForColNom_to ,
                                          int AV71ForColNum ,
                                          int AV72ForColNum_to ,
                                          String AV73ForSer ,
                                          String AV74ForSer_to ,
                                          byte AV75IntCod ,
                                          byte AV76IntCod_to ,
                                          short AV77MatCod ,
                                          short AV78MatCod_to ,
                                          byte AV79TipColCod ,
                                          short AV80TipColCod_to ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A584IntDsc ,
                                          String A627MatDsc ,
                                          byte A583IntCod ,
                                          short A626MatCod ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV66Emprcod ,
                                          String AV81ProForCod ,
                                          String A396EmprCod ,
                                          String A764ProForCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[39];
      Object[] GXv_Object18 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.ProForL, T3.MatCod, T3.IntCod, T1.EmprCod, T1.ProForCod, T4.MatDsc, T5.IntDsc, T1.TipColCod, T1.ForColNum, T1.ForColNom, T3.ForSerDsc, T1.ForSer, T2.CliNom," ;
      sSelectString += " T1.CliCod" ;
      sFromString = " FROM ((((TXPLFORMU T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) INNER JOIN TXPCFORMU T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod" ;
      sFromString += " = T1.CliCod AND T3.ForSer = T1.ForSer AND T3.ForColNom = T1.ForColNom AND T3.ForColNum = T1.ForColNum AND T3.TipColCod = T1.TipColCod) LEFT JOIN TXPMATICE T4 ON" ;
      sFromString += " T4.EmprCod = T1.EmprCod AND T4.MatCod = T3.MatCod) LEFT JOIN TXPINTENS T5 ON T5.EmprCod = T1.EmprCod AND T5.IntCod = T3.IntCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.ProForCod = ?)");
      if ( ! (0==AV96Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_1_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int17[2] = (byte)(1) ;
      }
      if ( ! (0==AV97Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_2_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int17[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_4_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV98Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_3_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_4_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int17[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_6_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV100Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_5_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_6_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int17[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_8_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV102Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_7_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_8_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ForSerDsc = ?)");
      }
      else
      {
         GXv_int17[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_10_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV104Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_9_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_10_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int17[11] = (byte)(1) ;
      }
      if ( ! (0==AV106Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_11_tfforcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int17[12] = (byte)(1) ;
      }
      if ( ! (0==AV107Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_12_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int17[13] = (byte)(1) ;
      }
      if ( ! (0==AV108Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_13_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int17[14] = (byte)(1) ;
      }
      if ( ! (0==AV109Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_14_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int17[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_16_tfintdsc_sel)==0) && ( ! (GXutil.strcmp("", AV110Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_15_tfintdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.IntDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_16_tfintdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T5.IntDsc = ?)");
      }
      else
      {
         GXv_int17[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_18_tfmatdsc_sel)==0) && ( ! (GXutil.strcmp("", AV112Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_17_tfmatdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.MatDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_18_tfmatdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.MatDsc = ?)");
      }
      else
      {
         GXv_int17[19] = (byte)(1) ;
      }
      if ( ! (0==AV67Clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int17[20] = (byte)(1) ;
      }
      if ( ! (0==AV68Clicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int17[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69ForColNom)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom >= ?)");
      }
      else
      {
         GXv_int17[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70ForColNom_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom <= ?)");
      }
      else
      {
         GXv_int17[23] = (byte)(1) ;
      }
      if ( ! (0==AV71ForColNum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int17[24] = (byte)(1) ;
      }
      if ( ! (0==AV72ForColNum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int17[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73ForSer)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer >= ?)");
      }
      else
      {
         GXv_int17[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74ForSer_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer <= ?)");
      }
      else
      {
         GXv_int17[27] = (byte)(1) ;
      }
      if ( ! (0==AV75IntCod) )
      {
         addWhere(sWhereString, "(T3.IntCod >= ?)");
      }
      else
      {
         GXv_int17[28] = (byte)(1) ;
      }
      if ( ! (0==AV76IntCod_to) )
      {
         addWhere(sWhereString, "(T3.IntCod <= ?)");
      }
      else
      {
         GXv_int17[29] = (byte)(1) ;
      }
      if ( ! (0==AV77MatCod) )
      {
         addWhere(sWhereString, "(T3.MatCod >= ?)");
      }
      else
      {
         GXv_int17[30] = (byte)(1) ;
      }
      if ( ! (0==AV78MatCod_to) )
      {
         addWhere(sWhereString, "(T3.MatCod <= ?)");
      }
      else
      {
         GXv_int17[31] = (byte)(1) ;
      }
      if ( ! (0==AV79TipColCod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int17[32] = (byte)(1) ;
      }
      if ( ! (0==AV80TipColCod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int17[33] = (byte)(1) ;
      }
      if ( AV12OrderedBy == 1 )
      {
         sOrderString += " ORDER BY T1.ProForCod" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ForSer" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ForSer DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T3.ForSerDsc" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T3.ForSerDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ForColNom" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ForColNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ForColNum" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ForColNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.TipColCod" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.TipColCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T5.IntDsc" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T5.IntDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T4.MatDsc" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T4.MatDsc DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod, T1.ProForL" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
   }

   protected Object[] conditional_H01K73( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV96Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_1_tfclicod ,
                                          int AV97Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_2_tfclicod_to ,
                                          String AV99Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_4_tfclinom_sel ,
                                          String AV98Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_3_tfclinom ,
                                          String AV101Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_6_tfforser_sel ,
                                          String AV100Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_5_tfforser ,
                                          String AV103Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_8_tfforserdsc_sel ,
                                          String AV102Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_7_tfforserdsc ,
                                          String AV105Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_10_tfforcolnom_sel ,
                                          String AV104Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_9_tfforcolnom ,
                                          int AV106Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_11_tfforcolnum ,
                                          int AV107Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_12_tfforcolnum_to ,
                                          byte AV108Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_13_tftipcolcod ,
                                          byte AV109Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_14_tftipcolcod_to ,
                                          String AV111Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_16_tfintdsc_sel ,
                                          String AV110Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_15_tfintdsc ,
                                          String AV113Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_18_tfmatdsc_sel ,
                                          String AV112Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_17_tfmatdsc ,
                                          int AV67Clicod ,
                                          short AV68Clicod_to ,
                                          String AV69ForColNom ,
                                          String AV70ForColNom_to ,
                                          int AV71ForColNum ,
                                          int AV72ForColNum_to ,
                                          String AV73ForSer ,
                                          String AV74ForSer_to ,
                                          byte AV75IntCod ,
                                          byte AV76IntCod_to ,
                                          short AV77MatCod ,
                                          short AV78MatCod_to ,
                                          byte AV79TipColCod ,
                                          short AV80TipColCod_to ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A584IntDsc ,
                                          String A627MatDsc ,
                                          byte A583IntCod ,
                                          short A626MatCod ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV66Emprcod ,
                                          String AV81ProForCod ,
                                          String A396EmprCod ,
                                          String A764ProForCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int19 = new byte[34];
      Object[] GXv_Object20 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM ((((TXPLFORMU T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) INNER JOIN TXPCFORMU T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.CliCod = T1.CliCod AND T3.ForSer = T1.ForSer AND T3.ForColNom = T1.ForColNom AND T3.ForColNum = T1.ForColNum AND T3.TipColCod = T1.TipColCod) LEFT JOIN TXPMATICE" ;
      scmdbuf += " T5 ON T5.EmprCod = T1.EmprCod AND T5.MatCod = T3.MatCod) LEFT JOIN TXPINTENS T4 ON T4.EmprCod = T1.EmprCod AND T4.IntCod = T3.IntCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.ProForCod = ?)");
      if ( ! (0==AV96Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_1_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int19[2] = (byte)(1) ;
      }
      if ( ! (0==AV97Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_2_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int19[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_4_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV98Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_3_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_4_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int19[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_6_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV100Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_5_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_6_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int19[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_8_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV102Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_7_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_8_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ForSerDsc = ?)");
      }
      else
      {
         GXv_int19[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_10_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV104Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_9_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_10_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int19[11] = (byte)(1) ;
      }
      if ( ! (0==AV106Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_11_tfforcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int19[12] = (byte)(1) ;
      }
      if ( ! (0==AV107Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_12_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int19[13] = (byte)(1) ;
      }
      if ( ! (0==AV108Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_13_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int19[14] = (byte)(1) ;
      }
      if ( ! (0==AV109Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_14_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int19[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_16_tfintdsc_sel)==0) && ( ! (GXutil.strcmp("", AV110Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_15_tfintdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.IntDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_16_tfintdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.IntDsc = ?)");
      }
      else
      {
         GXv_int19[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_18_tfmatdsc_sel)==0) && ( ! (GXutil.strcmp("", AV112Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_17_tfmatdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.MatDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Formulaciontinte_sustitucionprocesoquimicoformulas_wcds_18_tfmatdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T5.MatDsc = ?)");
      }
      else
      {
         GXv_int19[19] = (byte)(1) ;
      }
      if ( ! (0==AV67Clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int19[20] = (byte)(1) ;
      }
      if ( ! (0==AV68Clicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int19[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69ForColNom)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom >= ?)");
      }
      else
      {
         GXv_int19[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70ForColNom_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom <= ?)");
      }
      else
      {
         GXv_int19[23] = (byte)(1) ;
      }
      if ( ! (0==AV71ForColNum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int19[24] = (byte)(1) ;
      }
      if ( ! (0==AV72ForColNum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int19[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73ForSer)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer >= ?)");
      }
      else
      {
         GXv_int19[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74ForSer_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer <= ?)");
      }
      else
      {
         GXv_int19[27] = (byte)(1) ;
      }
      if ( ! (0==AV75IntCod) )
      {
         addWhere(sWhereString, "(T3.IntCod >= ?)");
      }
      else
      {
         GXv_int19[28] = (byte)(1) ;
      }
      if ( ! (0==AV76IntCod_to) )
      {
         addWhere(sWhereString, "(T3.IntCod <= ?)");
      }
      else
      {
         GXv_int19[29] = (byte)(1) ;
      }
      if ( ! (0==AV77MatCod) )
      {
         addWhere(sWhereString, "(T3.MatCod >= ?)");
      }
      else
      {
         GXv_int19[30] = (byte)(1) ;
      }
      if ( ! (0==AV78MatCod_to) )
      {
         addWhere(sWhereString, "(T3.MatCod <= ?)");
      }
      else
      {
         GXv_int19[31] = (byte)(1) ;
      }
      if ( ! (0==AV79TipColCod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int19[32] = (byte)(1) ;
      }
      if ( ! (0==AV80TipColCod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int19[33] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV12OrderedBy == 1 )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object20[0] = scmdbuf ;
      GXv_Object20[1] = GXv_int19 ;
      return GXv_Object20 ;
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
                  return conditional_H01K72(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).shortValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).byteValue() , ((Number) dynConstraints[31]).shortValue() , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).byteValue() , ((Number) dynConstraints[42]).shortValue() , ((Number) dynConstraints[43]).shortValue() , ((Boolean) dynConstraints[44]).booleanValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] );
            case 1 :
                  return conditional_H01K73(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).shortValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).byteValue() , ((Number) dynConstraints[31]).shortValue() , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).byteValue() , ((Number) dynConstraints[42]).shortValue() , ((Number) dynConstraints[43]).shortValue() , ((Boolean) dynConstraints[44]).booleanValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01K72", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01K73", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 13);
               ((String[]) buf[12])[0] = rslt.getString(11, 26);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(12, 16);
               ((String[]) buf[15])[0] = rslt.getString(13, 30);
               ((int[]) buf[16])[0] = rslt.getInt(14);
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
                  stmt.setString(sIdx, (String)parms[39], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[60]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 16);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 16);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[67]).byteValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[69]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[70]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[71]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[72]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[55]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[62]).byteValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[63]).byteValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[66]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               return;
      }
   }

}

