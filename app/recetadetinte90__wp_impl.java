package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class recetadetinte90__wp_impl extends GXDataArea
{
   public recetadetinte90__wp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public recetadetinte90__wp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recetadetinte90__wp_impl.class ));
   }

   public recetadetinte90__wp_impl( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( nGotPars == 0 )
      {
         entryPointCalled = false ;
         gxfirstwebparm = httpContext.GetFirstPar( "Mode") ;
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxEvt") == 0 )
         {
            httpContext.setAjaxEventMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "Mode") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "Mode") ;
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
            Gx_mode = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV9EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9EmprCod", AV9EmprCod);
               AV5BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV5BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarCod), 8, 0));
               AV7BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7BarCodReo", GXutil.str( AV7BarCodReo, 1, 0));
               AV6BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV6BarCodPar", AV6BarCodPar);
               AV22RecLinMaq = (short)(GXutil.lval( httpContext.GetPar( "RecLinMaq"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV22RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22RecLinMaq), 4, 0));
               AV23RecLinPro = (byte)(GXutil.lval( httpContext.GetPar( "RecLinPro"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV23RecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23RecLinPro), 2, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECLINPRO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV23RecLinPro), "Z9")));
               AV32TotKgs = CommonUtil.decimalVal( httpContext.GetPar( "TotKgs"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV32TotKgs", GXutil.ltrimstr( AV32TotKgs, 10, 2));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTKGS", getSecureSignedToken( "", localUtil.format( AV32TotKgs, "ZZZZZZ9.99")));
               AV34Volumen = (int)(GXutil.lval( httpContext.GetPar( "Volumen"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV34Volumen", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Volumen), 5, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVOLUMEN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV34Volumen), "ZZZZ9")));
               AV12FecPan = localUtil.parseDateParm( httpContext.GetPar( "FecPan")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV12FecPan", localUtil.format(AV12FecPan, "99/99/99"));
               AV8Barnhdr = httpContext.GetPar( "Barnhdr") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8Barnhdr", AV8Barnhdr);
               AV18ProForDsc = httpContext.GetPar( "ProForDsc") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18ProForDsc", AV18ProForDsc);
               AV19Proforfab = httpContext.GetPar( "Proforfab") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV19Proforfab", AV19Proforfab);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROFORFAB", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV19Proforfab, ""))));
               AV15modif2 = httpContext.GetPar( "modif2") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15modif2", AV15modif2);
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
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         MasterPageObj= createMasterPage(remoteHandle, "app.wwpbaseobjects.workwithplusmasterpage");
         MasterPageObj.setDataArea(this,false);
         validateSpaRequest();
         MasterPageObj.webExecute();
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
      if ( isAjaxCallMode( ) )
      {
         cleanup();
      }
   }

   public byte executeStartEvent( )
   {
      pa29G2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start29G2( ) ;
      }
      return gxajaxcallmode ;
   }

   public void renderHtmlHeaders( )
   {
      app.GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), true);
   }

   public void renderHtmlOpenForm( )
   {
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( Form.getCaption()) ;
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
      if ( nGXWrapped != 1 )
      {
         MasterPageObj.master_styles();
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"true\"" ;
      httpContext.writeText( "<body ") ;
      bodyStyle = "" + "background-color:" + WebUtils.getHTMLColor( Form.getIBackground()) + ";color:" + WebUtils.getHTMLColor( Form.getTextcolor()) + ";" ;
      if ( nGXWrapped == 0 )
      {
         bodyStyle += "-moz-opacity:0;opacity:0;" ;
      }
      if ( ! ( (GXutil.strcmp("", Form.getBackground())==0) ) )
      {
         bodyStyle += " background-image:url(" + httpContext.convertURL( Form.getBackground()) + ")" ;
      }
      httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.recetadetinte90__wp", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV9EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV5BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV6BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV22RecLinMaq,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV23RecLinPro,2,0)),GXutil.URLEncode(DecimalUtil.decToString(AV32TotKgs)),GXutil.URLEncode(GXutil.ltrimstr(AV34Volumen,5,0)),GXutil.URLEncode(GXutil.formatDateParm(AV12FecPan)),GXutil.URLEncode(GXutil.rtrim(AV8Barnhdr)),GXutil.URLEncode(GXutil.rtrim(AV18ProForDsc)),GXutil.URLEncode(GXutil.rtrim(AV19Proforfab)),GXutil.URLEncode(GXutil.rtrim(AV15modif2))}, new String[] {"Gx_mode","EmprCod","BarCod","BarCodReo","BarCodPar","RecLinMaq","RecLinPro","TotKgs","Volumen","FecPan","Barnhdr","ProForDsc","Proforfab","modif2"}) +"\">") ;
      app.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      app.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      app.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:block;height:0;border:0;padding:0\" disabled>") ;
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Class", "form-horizontal Form", true);
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
   }

   public void send_integrity_footer_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVALCOS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV39ValCos), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV33UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV29Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV49Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECLINPRO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV23RecLinPro), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTKGS", getSecureSignedToken( "", localUtil.format( AV32TotKgs, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVOLUMEN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV34Volumen), "ZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROFORFAB", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV19Proforfab, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"RecetadeTinte90__WP");
      forbiddenHiddens.add("Totaldekilos", localUtil.format( AV31Totaldekilos, "ZZZZZZ9.99"));
      forbiddenHiddens.add("VolumenReceta", localUtil.format( DecimalUtil.doubleToDec(AV35VolumenReceta), "ZZZZ9"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("recetadetinte90__wp:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV9EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRDNOM", GXutil.rtrim( AV17PrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORPRDDSCCONTROL", GXutil.rtrim( AV55ForPrdDsccontrol));
      app.GxWebStd.gx_hidden_field( httpContext, "vLRECET", GXutil.ltrim( localUtil.ntoc( AV40lrecet, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVALCOS", GXutil.ltrim( localUtil.ntoc( AV39ValCos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVALCOS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV39ValCos), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV5BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV7BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV6BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECLINMAQ", GXutil.ltrim( localUtil.ntoc( AV22RecLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECLINPRO", GXutil.ltrim( localUtil.ntoc( AV23RecLinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECLINPRO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV23RecLinPro), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV33UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV33UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV29Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV29Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODIF2", GXutil.rtrim( AV15modif2));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNUM", GXutil.rtrim( A719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODA21", GXutil.ltrim( localUtil.ntoc( AV49Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV49Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDLOTE", GXutil.rtrim( A10881PrdLote));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDUMEFO", GXutil.ltrim( localUtil.ntoc( A4338PrdUMeFo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNOM", GXutil.rtrim( A718PrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDCANRES", GXutil.ltrim( localUtil.ntoc( A685PrdCanRes, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDEXIALM", GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDEXICC", GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDTIP", GXutil.rtrim( A1643PrdTip));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPRDUME", GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPRDDSC", GXutil.rtrim( A488ForPrdDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTKGS", GXutil.ltrim( localUtil.ntoc( AV32TotKgs, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTKGS", getSecureSignedToken( "", localUtil.format( AV32TotKgs, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVOLUMEN", GXutil.ltrim( localUtil.ntoc( AV34Volumen, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVOLUMEN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV34Volumen), "ZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFECPAN", localUtil.dtoc( AV12FecPan, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARNHDR", GXutil.rtrim( AV8Barnhdr));
      app.GxWebStd.gx_hidden_field( httpContext, "vPROFORFAB", GXutil.rtrim( AV19Proforfab));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROFORFAB", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV19Proforfab, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Width", GXutil.rtrim( Dvpanel_tableattributes_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Autowidth", GXutil.booltostr( Dvpanel_tableattributes_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Autoheight", GXutil.booltostr( Dvpanel_tableattributes_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Cls", GXutil.rtrim( Dvpanel_tableattributes_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Title", GXutil.rtrim( Dvpanel_tableattributes_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Collapsible", GXutil.booltostr( Dvpanel_tableattributes_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Collapsed", GXutil.booltostr( Dvpanel_tableattributes_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Showcollapseicon", GXutil.booltostr( Dvpanel_tableattributes_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Iconposition", GXutil.rtrim( Dvpanel_tableattributes_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Autoscroll", GXutil.booltostr( Dvpanel_tableattributes_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Width", GXutil.rtrim( Dvpanel_unnamedtable2_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable2_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable2_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Cls", GXutil.rtrim( Dvpanel_unnamedtable2_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Title", GXutil.rtrim( Dvpanel_unnamedtable2_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable2_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable2_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable2_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable2_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable2_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Title", GXutil.rtrim( Dvelop_confirmpanel_enter_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_enter_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_enter_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_enter_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Result", GXutil.rtrim( Dvelop_confirmpanel_enter_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Result", GXutil.rtrim( Dvelop_confirmpanel_enter_Result));
   }

   public void renderHtmlCloseForm( )
   {
      sendCloseFormHiddens( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "GX_FocusControl", GX_FocusControl);
      httpContext.SendAjaxEncryptionKey();
      sendSecurityToken(sPrefix);
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
      if ( ! ( WebComp_Wcrecetadetinte90__wc == null ) )
      {
         WebComp_Wcrecetadetinte90__wc.componentjscripts();
      }
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
   }

   public void renderHtmlContent( )
   {
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         httpContext.writeText( "<div") ;
         app.GxWebStd.classAttribute( httpContext, "gx-ct-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
         httpContext.writeText( ">") ;
         we29G2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt29G2( ) ;
   }

   public boolean hasEnterEvent( )
   {
      return true ;
   }

   public com.genexus.webpanels.GXWebForm getForm( )
   {
      return Form ;
   }

   public String getSelfLink( )
   {
      return formatLink("app.recetadetinte90__wp", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV9EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV5BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV6BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV22RecLinMaq,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV23RecLinPro,2,0)),GXutil.URLEncode(DecimalUtil.decToString(AV32TotKgs)),GXutil.URLEncode(GXutil.ltrimstr(AV34Volumen,5,0)),GXutil.URLEncode(GXutil.formatDateParm(AV12FecPan)),GXutil.URLEncode(GXutil.rtrim(AV8Barnhdr)),GXutil.URLEncode(GXutil.rtrim(AV18ProForDsc)),GXutil.URLEncode(GXutil.rtrim(AV19Proforfab)),GXutil.URLEncode(GXutil.rtrim(AV15modif2))}, new String[] {"Gx_mode","EmprCod","BarCod","BarCodReo","BarCodPar","RecLinMaq","RecLinPro","TotKgs","Volumen","FecPan","Barnhdr","ProForDsc","Proforfab","modif2"})  ;
   }

   public String getPgmname( )
   {
      return "RecetadeTinte90__WP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Mantenimiento Lineas Receta", "") ;
   }

   public void wb29G0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         if ( nGXWrapped == 1 )
         {
            renderHtmlHeaders( ) ;
            renderHtmlOpenForm( ) ;
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
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_tableattributes.setProperty("Width", Dvpanel_tableattributes_Width);
         ucDvpanel_tableattributes.setProperty("AutoWidth", Dvpanel_tableattributes_Autowidth);
         ucDvpanel_tableattributes.setProperty("AutoHeight", Dvpanel_tableattributes_Autoheight);
         ucDvpanel_tableattributes.setProperty("Cls", Dvpanel_tableattributes_Cls);
         ucDvpanel_tableattributes.setProperty("Title", Dvpanel_tableattributes_Title);
         ucDvpanel_tableattributes.setProperty("Collapsible", Dvpanel_tableattributes_Collapsible);
         ucDvpanel_tableattributes.setProperty("Collapsed", Dvpanel_tableattributes_Collapsed);
         ucDvpanel_tableattributes.setProperty("ShowCollapseIcon", Dvpanel_tableattributes_Showcollapseicon);
         ucDvpanel_tableattributes.setProperty("IconPosition", Dvpanel_tableattributes_Iconposition);
         ucDvpanel_tableattributes.setProperty("AutoScroll", Dvpanel_tableattributes_Autoscroll);
         ucDvpanel_tableattributes.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tableattributes_Internalname, "DVPANEL_TABLEATTRIBUTESContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_TABLEATTRIBUTESContainer"+"TableAttributes"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableattributes_Internalname, 1, 0, "px", 0, "px", "TableData", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavProfordsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavProfordsc_Internalname, httpContext.getMessage( "Proceso", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavProfordsc_Internalname, GXutil.rtrim( AV18ProForDsc), GXutil.rtrim( localUtil.format( AV18ProForDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavProfordsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavProfordsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetadeTinte90__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavTotaldekilos_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotaldekilos_Internalname, httpContext.getMessage( "Total Kilos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotaldekilos_Internalname, GXutil.ltrim( localUtil.ntoc( AV31Totaldekilos, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavTotaldekilos_Enabled!=0) ? localUtil.format( AV31Totaldekilos, "ZZZZZZ9.99") : localUtil.format( AV31Totaldekilos, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,29);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotaldekilos_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTotaldekilos_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte90__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavVolumenreceta_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavVolumenreceta_Internalname, httpContext.getMessage( "Volumen", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavVolumenreceta_Internalname, GXutil.ltrim( localUtil.ntoc( AV35VolumenReceta, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavVolumenreceta_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV35VolumenReceta), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV35VolumenReceta), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavVolumenreceta_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavVolumenreceta_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte90__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTbmessage_Internalname, lblTbmessage_Caption, "", "", lblTbmessage_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextDanger", 0, "", 1, 1, 0, (short)(0), "HLP_RecetadeTinte90__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_unnamedtable2.setProperty("Width", Dvpanel_unnamedtable2_Width);
         ucDvpanel_unnamedtable2.setProperty("AutoWidth", Dvpanel_unnamedtable2_Autowidth);
         ucDvpanel_unnamedtable2.setProperty("AutoHeight", Dvpanel_unnamedtable2_Autoheight);
         ucDvpanel_unnamedtable2.setProperty("Cls", Dvpanel_unnamedtable2_Cls);
         ucDvpanel_unnamedtable2.setProperty("Title", Dvpanel_unnamedtable2_Title);
         ucDvpanel_unnamedtable2.setProperty("Collapsible", Dvpanel_unnamedtable2_Collapsible);
         ucDvpanel_unnamedtable2.setProperty("Collapsed", Dvpanel_unnamedtable2_Collapsed);
         ucDvpanel_unnamedtable2.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable2_Showcollapseicon);
         ucDvpanel_unnamedtable2.setProperty("IconPosition", Dvpanel_unnamedtable2_Iconposition);
         ucDvpanel_unnamedtable2.setProperty("AutoScroll", Dvpanel_unnamedtable2_Autoscroll);
         ucDvpanel_unnamedtable2.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable2_Internalname, "DVPANEL_UNNAMEDTABLE2Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE2Container"+"UnnamedTable2"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavReclin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavReclin_Internalname, "##", "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavReclin_Internalname, GXutil.ltrim( localUtil.ntoc( AV21RecLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavReclin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV21RecLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV21RecLin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavReclin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavReclin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte90__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavRecprdnum_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavRecprdnum_Internalname, httpContext.getMessage( "Producto", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavRecprdnum_Internalname, GXutil.rtrim( AV27RecPrdNum), GXutil.rtrim( localUtil.format( AV27RecPrdNum, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavRecprdnum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavRecprdnum_Enabled, 1, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetadeTinte90__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-1 CellMarginTop35", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+imgavVarprompt_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Active Bitmap Variable */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
         ClassString = "ImagePrompt" + " " + ((GXutil.strcmp(imgavVarprompt_gximage, "")==0) ? "" : "GX_Image_"+imgavVarprompt_gximage+"_Class") ;
         StyleString = "" ;
         AV54VarPrompt_IsBlob = (boolean)(((GXutil.strcmp("", AV54VarPrompt)==0)&&(GXutil.strcmp("", AV60Varprompt_GXI)==0))||!(GXutil.strcmp("", AV54VarPrompt)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV54VarPrompt)==0) ? AV60Varprompt_GXI : httpContext.getResourceRelative(AV54VarPrompt)) ;
         app.GxWebStd.gx_bitmap( httpContext, imgavVarprompt_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, -1, 0, "", 0, "", 0, 0, 5, imgavVarprompt_Jsonclick, "'"+""+"'"+",false,"+"'"+"EVVARPROMPT.CLICK."+"'", StyleString, ClassString, "", "", "", "", ""+TempTags, "", "", 1, AV54VarPrompt_IsBlob, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_RecetadeTinte90__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavRecprddsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavRecprddsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavRecprddsc_Internalname, GXutil.rtrim( AV26RecPrdDsc), GXutil.rtrim( localUtil.format( AV26RecPrdDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavRecprddsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavRecprddsc_Enabled, 1, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetadeTinte90__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFaccon_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFaccon_Internalname, httpContext.getMessage( "Factor", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFaccon_Internalname, GXutil.ltrim( localUtil.ntoc( AV11FacCon, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavFaccon_Enabled!=0) ? localUtil.format( AV11FacCon, "ZZZZ9.99999") : localUtil.format( AV11FacCon, "ZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,65);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFaccon_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFaccon_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte90__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedforprdume_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockforprdume_Internalname, httpContext.getMessage( "Und", ""), "", "", lblTextblockforprdume_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_RecetadeTinte90__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table1_72_29G2( true) ;
      }
      else
      {
         wb_table1_72_29G2( false) ;
      }
      return  ;
   }

   public void wb_table1_72_29G2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavForprddsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavForprddsc_Internalname, httpContext.getMessage( "Des.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavForprddsc_Internalname, GXutil.rtrim( AV13ForPrdDsc), GXutil.rtrim( localUtil.format( AV13ForPrdDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,82);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavForprddsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavForprddsc_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetadeTinte90__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPrdcant_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPrdcant_Internalname, httpContext.getMessage( "Cantidad", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPrdcant_Internalname, GXutil.ltrim( localUtil.ntoc( AV16PrdCant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( AV16PrdCant, "ZZZZZZ9.999")), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPrdcant_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPrdcant_Enabled, 1, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte90__WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavReclote_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavReclote_Internalname, httpContext.getMessage( "Lote", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavReclote_Internalname, GXutil.rtrim( AV24RecLote), GXutil.rtrim( localUtil.format( AV24RecLote, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavReclote_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavReclote_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetadeTinte90__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavRecfornro_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavRecfornro_Internalname, httpContext.getMessage( "Nº", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavRecfornro_Internalname, GXutil.ltrim( localUtil.ntoc( AV20RecForNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavRecfornro_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV20RecForNro), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV20RecForNro), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,98);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavRecfornro_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavRecfornro_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte90__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavRecprdtnq_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavRecprdtnq_Internalname, httpContext.getMessage( "Tq", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 102,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavRecprdtnq_Internalname, GXutil.ltrim( localUtil.ntoc( AV28RecPrdTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavRecprdtnq_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV28RecPrdTnq), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV28RecPrdTnq), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,102);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavRecprdtnq_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavRecprdtnq_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte90__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavRecmanaut_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavRecmanaut_Internalname, httpContext.getMessage( "M/A", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavRecmanaut_Internalname, GXutil.rtrim( AV25RecManAut), GXutil.rtrim( localUtil.format( AV25RecManAut, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavRecmanaut_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavRecmanaut_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetadeTinte90__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPrdexialm_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPrdexialm_Internalname, httpContext.getMessage( "Almacen", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 110,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPrdexialm_Internalname, GXutil.ltrim( localUtil.ntoc( AV51PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavPrdexialm_Enabled!=0) ? localUtil.format( AV51PrdExiAlm, "ZZZZZZ9.9999") : localUtil.format( AV51PrdExiAlm, "ZZZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,110);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPrdexialm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPrdexialm_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte90__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPrdcanres_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPrdcanres_Internalname, httpContext.getMessage( "Reservada", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPrdcanres_Internalname, GXutil.ltrim( localUtil.ntoc( AV52PrdCanRes, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavPrdcanres_Enabled!=0) ? localUtil.format( AV52PrdCanRes, "ZZZZZZ9.9999") : localUtil.format( AV52PrdCanRes, "ZZZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,114);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPrdcanres_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPrdcanres_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte90__WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, divUnnamedtable6_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavOldreclote_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavOldreclote_Internalname, httpContext.getMessage( "Lote Producto", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 122,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavOldreclote_Internalname, GXutil.rtrim( AV41oldRecLote), GXutil.rtrim( localUtil.format( AV41oldRecLote, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,122);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavOldreclote_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavOldreclote_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetadeTinte90__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCantold_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCantold_Internalname, httpContext.getMessage( "Cantold", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCantold_Internalname, GXutil.ltrim( localUtil.ntoc( AV42Cantold, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCantold_Enabled!=0) ? localUtil.format( AV42Cantold, "ZZZZZZ9.999") : localUtil.format( AV42Cantold, "ZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,126);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCantold_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCantold_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte90__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCanresold_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCanresold_Internalname, httpContext.getMessage( "Can Resold", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 130,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCanresold_Internalname, GXutil.ltrim( localUtil.ntoc( AV43CanResold, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCanresold_Enabled!=0) ? localUtil.format( AV43CanResold, "ZZZZ9.99") : localUtil.format( AV43CanResold, "ZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,130);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCanresold_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCanresold_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte90__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavOldfaccon_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavOldfaccon_Internalname, httpContext.getMessage( "Factor Conversion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 134,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavOldfaccon_Internalname, GXutil.ltrim( localUtil.ntoc( AV44OldFaccon, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavOldfaccon_Enabled!=0) ? localUtil.format( AV44OldFaccon, "ZZZZ9.99999") : localUtil.format( AV44OldFaccon, "ZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,134);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavOldfaccon_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavOldfaccon_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte90__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 142,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "", httpContext.getMessage( "Confirmar", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RecetadeTinte90__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 144,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnlimpiar_Internalname, "", httpContext.getMessage( "Limpiar Variables", ""), bttBtnlimpiar_Jsonclick, 5, httpContext.getMessage( "Limpiar Variables", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOLIMPIAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RecetadeTinte90__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RecetadeTinte90__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0152"+"", GXutil.rtrim( WebComp_Wcrecetadetinte90__wc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0152"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcrecetadetinte90__wc_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcrecetadetinte90__wc), GXutil.lower( WebComp_Wcrecetadetinte90__wc_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0152"+"");
               }
               WebComp_Wcrecetadetinte90__wc.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcrecetadetinte90__wc), GXutil.lower( WebComp_Wcrecetadetinte90__wc_Component)) != 0 )
               {
                  httpContext.ajax_rspEndCmp();
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV59Pgmname), GXutil.rtrim( localUtil.format( AV59Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetadeTinte90__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDatamonjs.render(context, "datamonjs", Datamonjs_Internalname, "DATAMONJSContainer");
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
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 163,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTipodeproceso_Internalname, GXutil.rtrim( AV30TipodeProceso), GXutil.rtrim( localUtil.format( AV30TipodeProceso, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,163);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTipodeproceso_Jsonclick, 0, "Attribute", "", "", "", "", edtavTipodeproceso_Visible, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetadeTinte90__WP.htm");
         wb_table2_164_29G2( true) ;
      }
      else
      {
         wb_table2_164_29G2( false) ;
      }
      return  ;
   }

   public void wb_table2_164_29G2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start29G2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         if ( httpContext.exposeMetadata( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 17_0_11-163677", (short)(0)) ;
         }
         Form.getMeta().addItem("description", httpContext.getMessage( "Mantenimiento Lineas Receta", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup29G0( ) ;
   }

   public void ws29G2( )
   {
      start29G2( ) ;
      evt29G2( ) ;
   }

   public void evt29G2( )
   {
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) && ! wbErr )
         {
            /* Read Web Panel buttons. */
            sEvt = httpContext.cgiGet( "_EventName") ;
            EvtGridId = httpContext.cgiGet( "_EventGridId") ;
            EvtRowId = httpContext.cgiGet( "_EventRowId") ;
            if ( GXutil.len( sEvt) > 0 )
            {
               sEvtType = GXutil.left( sEvt, 1) ;
               sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-1) ;
               if ( GXutil.strcmp(sEvtType, "M") != 0 )
               {
                  if ( GXutil.strcmp(sEvtType, "E") == 0 )
                  {
                     sEvtType = GXutil.right( sEvt, 1) ;
                     if ( GXutil.strcmp(sEvtType, ".") == 0 )
                     {
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                        if ( GXutil.strcmp(sEvt, "RFR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ENTER.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1129G2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Start */
                           e1229G2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ! wbErr )
                           {
                              Rfr0gs = false ;
                              if ( ! Rfr0gs )
                              {
                                 /* Execute user event: Enter */
                                 e1329G2 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOLIMPIAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoLimpiar' */
                           e1429G2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e1529G2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VRECLIN.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1629G2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VFORPRDUME.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1729G2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VRECPRDNUM.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1829G2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e1929G2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VVARPROMPT.CLICK") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e2029G2 ();
                           /* No code required for Cancel button. It is implemented as the Reset button. */
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                     }
                  }
                  else if ( GXutil.strcmp(sEvtType, "W") == 0 )
                  {
                     sEvtType = GXutil.left( sEvt, 4) ;
                     sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-4) ;
                     nCmpId = (short)(GXutil.lval( sEvtType)) ;
                     if ( nCmpId == 152 )
                     {
                        OldWcrecetadetinte90__wc = httpContext.cgiGet( "W0152") ;
                        if ( ( GXutil.len( OldWcrecetadetinte90__wc) == 0 ) || ( GXutil.strcmp(OldWcrecetadetinte90__wc, WebComp_Wcrecetadetinte90__wc_Component) != 0 ) )
                        {
                           WebComp_Wcrecetadetinte90__wc = WebUtils.getWebComponent(getClass(), "app." + OldWcrecetadetinte90__wc + "_impl", remoteHandle, context);
                           WebComp_Wcrecetadetinte90__wc_Component = OldWcrecetadetinte90__wc ;
                        }
                        if ( GXutil.len( WebComp_Wcrecetadetinte90__wc_Component) != 0 )
                        {
                           WebComp_Wcrecetadetinte90__wc.componentprocess("W0152", "", sEvt);
                        }
                        WebComp_Wcrecetadetinte90__wc_Component = OldWcrecetadetinte90__wc ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we29G2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            if ( nGXWrapped == 1 )
            {
               renderHtmlCloseForm( ) ;
            }
         }
      }
   }

   public void pa29G2( )
   {
      if ( nDonePA == 0 )
      {
         if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
         {
            gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(httpContext.getHttpSecure( ))) ;
         }
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableJsOutput();
         }
         init_web_controls( ) ;
         if ( toggleJsOutput )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableJsOutput();
            }
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
            GX_FocusControl = edtavTotaldekilos_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
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
      rf29G2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV59Pgmname = "RecetadeTinte90__WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59Pgmname", AV59Pgmname);
      Gx_err = (short)(0) ;
      edtavProfordsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavProfordsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavProfordsc_Enabled), 5, 0), true);
      edtavTotaldekilos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotaldekilos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotaldekilos_Enabled), 5, 0), true);
      edtavVolumenreceta_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavVolumenreceta_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavVolumenreceta_Enabled), 5, 0), true);
      edtavForprddsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavForprddsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavForprddsc_Enabled), 5, 0), true);
      edtavPrdexialm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrdexialm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdexialm_Enabled), 5, 0), true);
      edtavPrdcanres_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrdcanres_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdcanres_Enabled), 5, 0), true);
      edtavOldreclote_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavOldreclote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOldreclote_Enabled), 5, 0), true);
      edtavCantold_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCantold_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCantold_Enabled), 5, 0), true);
      edtavCanresold_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCanresold_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCanresold_Enabled), 5, 0), true);
      edtavOldfaccon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavOldfaccon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOldfaccon_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      imgPrompt_forprdume_Link = "javascript:"+"gx.popup.openPrompt('"+"app.formulaciontinte.tunmefoprompt"+"',["+"{Ctrl:gx.dom.el('"+"vEMPRCOD"+"'), id:'"+"vEMPRCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vFORPRDUME"+"'), id:'"+"vFORPRDUME"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vFORPRDDSC"+"'), id:'"+"vFORPRDDSC"+"'"+",IOType:'inout'}"+"],"+"null"+","+"'', false"+","+"false"+");" ;
      httpContext.ajax_rsp_assign_prop("", false, imgPrompt_forprdume_Internalname, "Link", imgPrompt_forprdume_Link, true);
      imgPrompt_forprdume_Link = "javascript:"+"gx.popup.openPrompt('"+"app.formulaciontinte.tunmefoprompt"+"',["+"{Ctrl:gx.dom.el('"+"vEMPRCOD"+"'), id:'"+"vEMPRCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vFORPRDUME"+"'), id:'"+"vFORPRDUME"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vFORPRDDSC"+"'), id:'"+"vFORPRDDSC"+"'"+",IOType:'inout'}"+"],"+"null"+","+"'', false"+","+"false"+");" ;
      httpContext.ajax_rsp_assign_prop("", false, imgPrompt_forprdume_Internalname, "Link", imgPrompt_forprdume_Link, true);
   }

   public void rf29G2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcrecetadetinte90__wc_Component) != 0 )
            {
               WebComp_Wcrecetadetinte90__wc.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e1929G2 ();
         wb29G0( ) ;
      }
   }

   public void send_integrity_lvl_hashes29G2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vVALCOS", GXutil.ltrim( localUtil.ntoc( AV39ValCos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVALCOS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV39ValCos), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV33UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV33UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV29Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV29Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODA21", GXutil.ltrim( localUtil.ntoc( AV49Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV49Moda21), "ZZZ9")));
   }

   public void before_start_formulas( )
   {
      AV59Pgmname = "RecetadeTinte90__WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59Pgmname", AV59Pgmname);
      Gx_err = (short)(0) ;
      edtavProfordsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavProfordsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavProfordsc_Enabled), 5, 0), true);
      edtavTotaldekilos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotaldekilos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotaldekilos_Enabled), 5, 0), true);
      edtavVolumenreceta_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavVolumenreceta_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavVolumenreceta_Enabled), 5, 0), true);
      edtavForprddsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavForprddsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavForprddsc_Enabled), 5, 0), true);
      edtavPrdexialm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrdexialm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdexialm_Enabled), 5, 0), true);
      edtavPrdcanres_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrdcanres_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdcanres_Enabled), 5, 0), true);
      edtavOldreclote_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavOldreclote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOldreclote_Enabled), 5, 0), true);
      edtavCantold_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCantold_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCantold_Enabled), 5, 0), true);
      edtavCanresold_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCanresold_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCanresold_Enabled), 5, 0), true);
      edtavOldfaccon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavOldfaccon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOldfaccon_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      imgPrompt_forprdume_Link = "javascript:"+"gx.popup.openPrompt('"+"app.formulaciontinte.tunmefoprompt"+"',["+"{Ctrl:gx.dom.el('"+"vEMPRCOD"+"'), id:'"+"vEMPRCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vFORPRDUME"+"'), id:'"+"vFORPRDUME"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vFORPRDDSC"+"'), id:'"+"vFORPRDDSC"+"'"+",IOType:'inout'}"+"],"+"null"+","+"'', false"+","+"false"+");" ;
      httpContext.ajax_rsp_assign_prop("", false, imgPrompt_forprdume_Internalname, "Link", imgPrompt_forprdume_Link, true);
      imgPrompt_forprdume_Link = "javascript:"+"gx.popup.openPrompt('"+"app.formulaciontinte.tunmefoprompt"+"',["+"{Ctrl:gx.dom.el('"+"vEMPRCOD"+"'), id:'"+"vEMPRCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vFORPRDUME"+"'), id:'"+"vFORPRDUME"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vFORPRDDSC"+"'), id:'"+"vFORPRDDSC"+"'"+",IOType:'inout'}"+"],"+"null"+","+"'', false"+","+"false"+");" ;
      httpContext.ajax_rsp_assign_prop("", false, imgPrompt_forprdume_Internalname, "Link", imgPrompt_forprdume_Link, true);
      fix_multi_value_controls( ) ;
   }

   public void strup29G0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1229G2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         AV39ValCos = (short)(localUtil.ctol( httpContext.cgiGet( "vVALCOS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Dvpanel_tableattributes_Width = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Width") ;
         Dvpanel_tableattributes_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Autowidth")) ;
         Dvpanel_tableattributes_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Autoheight")) ;
         Dvpanel_tableattributes_Cls = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Cls") ;
         Dvpanel_tableattributes_Title = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Title") ;
         Dvpanel_tableattributes_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Collapsible")) ;
         Dvpanel_tableattributes_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Collapsed")) ;
         Dvpanel_tableattributes_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Showcollapseicon")) ;
         Dvpanel_tableattributes_Iconposition = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Iconposition") ;
         Dvpanel_tableattributes_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Autoscroll")) ;
         Dvpanel_unnamedtable2_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Width") ;
         Dvpanel_unnamedtable2_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Autowidth")) ;
         Dvpanel_unnamedtable2_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Autoheight")) ;
         Dvpanel_unnamedtable2_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Cls") ;
         Dvpanel_unnamedtable2_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Title") ;
         Dvpanel_unnamedtable2_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Collapsible")) ;
         Dvpanel_unnamedtable2_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Collapsed")) ;
         Dvpanel_unnamedtable2_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Showcollapseicon")) ;
         Dvpanel_unnamedtable2_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Iconposition") ;
         Dvpanel_unnamedtable2_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Autoscroll")) ;
         Dvelop_confirmpanel_enter_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Title") ;
         Dvelop_confirmpanel_enter_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Confirmationtext") ;
         Dvelop_confirmpanel_enter_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Yesbuttoncaption") ;
         Dvelop_confirmpanel_enter_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Nobuttoncaption") ;
         Dvelop_confirmpanel_enter_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_enter_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Yesbuttonposition") ;
         Dvelop_confirmpanel_enter_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Confirmtype") ;
         Dvelop_confirmpanel_enter_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Result") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavTotaldekilos_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavTotaldekilos_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTOTALDEKILOS");
            GX_FocusControl = edtavTotaldekilos_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV31Totaldekilos = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31Totaldekilos", GXutil.ltrimstr( AV31Totaldekilos, 10, 2));
         }
         else
         {
            AV31Totaldekilos = localUtil.ctond( httpContext.cgiGet( edtavTotaldekilos_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31Totaldekilos", GXutil.ltrimstr( AV31Totaldekilos, 10, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavVolumenreceta_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavVolumenreceta_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vVOLUMENRECETA");
            GX_FocusControl = edtavVolumenreceta_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV35VolumenReceta = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35VolumenReceta", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35VolumenReceta), 5, 0));
         }
         else
         {
            AV35VolumenReceta = (int)(localUtil.ctol( httpContext.cgiGet( edtavVolumenreceta_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35VolumenReceta", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35VolumenReceta), 5, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavReclin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavReclin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRECLIN");
            GX_FocusControl = edtavReclin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV21RecLin = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21RecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21RecLin), 4, 0));
         }
         else
         {
            AV21RecLin = (short)(localUtil.ctol( httpContext.cgiGet( edtavReclin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21RecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21RecLin), 4, 0));
         }
         AV27RecPrdNum = httpContext.cgiGet( edtavRecprdnum_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27RecPrdNum", AV27RecPrdNum);
         AV54VarPrompt = httpContext.cgiGet( imgavVarprompt_Internalname) ;
         AV26RecPrdDsc = httpContext.cgiGet( edtavRecprddsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26RecPrdDsc", AV26RecPrdDsc);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavFaccon_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavFaccon_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFACCON");
            GX_FocusControl = edtavFaccon_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV11FacCon = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11FacCon", GXutil.ltrimstr( AV11FacCon, 11, 5));
         }
         else
         {
            AV11FacCon = localUtil.ctond( httpContext.cgiGet( edtavFaccon_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11FacCon", GXutil.ltrimstr( AV11FacCon, 11, 5));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavForprdume_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavForprdume_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFORPRDUME");
            GX_FocusControl = edtavForprdume_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV14ForPrdUMe = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14ForPrdUMe", GXutil.str( AV14ForPrdUMe, 1, 0));
         }
         else
         {
            AV14ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( edtavForprdume_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14ForPrdUMe", GXutil.str( AV14ForPrdUMe, 1, 0));
         }
         AV13ForPrdDsc = httpContext.cgiGet( edtavForprddsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13ForPrdDsc", AV13ForPrdDsc);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPrdcant_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPrdcant_Internalname)), DecimalUtil.stringToDec("9999999.999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPRDCANT");
            GX_FocusControl = edtavPrdcant_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV16PrdCant = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16PrdCant", GXutil.ltrimstr( AV16PrdCant, 11, 3));
         }
         else
         {
            AV16PrdCant = localUtil.ctond( httpContext.cgiGet( edtavPrdcant_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16PrdCant", GXutil.ltrimstr( AV16PrdCant, 11, 3));
         }
         AV24RecLote = httpContext.cgiGet( edtavReclote_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24RecLote", AV24RecLote);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavRecfornro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavRecfornro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRECFORNRO");
            GX_FocusControl = edtavRecfornro_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV20RecForNro = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20RecForNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20RecForNro), 2, 0));
         }
         else
         {
            AV20RecForNro = (byte)(localUtil.ctol( httpContext.cgiGet( edtavRecfornro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20RecForNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20RecForNro), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavRecprdtnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavRecprdtnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRECPRDTNQ");
            GX_FocusControl = edtavRecprdtnq_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV28RecPrdTnq = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28RecPrdTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28RecPrdTnq), 2, 0));
         }
         else
         {
            AV28RecPrdTnq = (byte)(localUtil.ctol( httpContext.cgiGet( edtavRecprdtnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28RecPrdTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28RecPrdTnq), 2, 0));
         }
         AV25RecManAut = httpContext.cgiGet( edtavRecmanaut_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25RecManAut", AV25RecManAut);
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPrdexialm_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPrdexialm_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPRDEXIALM");
            GX_FocusControl = edtavPrdexialm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV51PrdExiAlm = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51PrdExiAlm", GXutil.ltrimstr( AV51PrdExiAlm, 12, 4));
         }
         else
         {
            AV51PrdExiAlm = localUtil.ctond( httpContext.cgiGet( edtavPrdexialm_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51PrdExiAlm", GXutil.ltrimstr( AV51PrdExiAlm, 12, 4));
         }
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPrdcanres_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPrdcanres_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPRDCANRES");
            GX_FocusControl = edtavPrdcanres_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV52PrdCanRes = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52PrdCanRes", GXutil.ltrimstr( AV52PrdCanRes, 12, 4));
         }
         else
         {
            AV52PrdCanRes = localUtil.ctond( httpContext.cgiGet( edtavPrdcanres_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52PrdCanRes", GXutil.ltrimstr( AV52PrdCanRes, 12, 4));
         }
         AV41oldRecLote = httpContext.cgiGet( edtavOldreclote_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41oldRecLote", AV41oldRecLote);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCantold_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCantold_Internalname)), DecimalUtil.stringToDec("9999999.999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCANTOLD");
            GX_FocusControl = edtavCantold_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV42Cantold = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42Cantold", GXutil.ltrimstr( AV42Cantold, 11, 3));
         }
         else
         {
            AV42Cantold = localUtil.ctond( httpContext.cgiGet( edtavCantold_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42Cantold", GXutil.ltrimstr( AV42Cantold, 11, 3));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCanresold_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCanresold_Internalname)), DecimalUtil.stringToDec("99999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCANRESOLD");
            GX_FocusControl = edtavCanresold_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV43CanResold = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43CanResold", GXutil.ltrimstr( AV43CanResold, 8, 2));
         }
         else
         {
            AV43CanResold = localUtil.ctond( httpContext.cgiGet( edtavCanresold_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43CanResold", GXutil.ltrimstr( AV43CanResold, 8, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavOldfaccon_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavOldfaccon_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vOLDFACCON");
            GX_FocusControl = edtavOldfaccon_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV44OldFaccon = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44OldFaccon", GXutil.ltrimstr( AV44OldFaccon, 11, 5));
         }
         else
         {
            AV44OldFaccon = localUtil.ctond( httpContext.cgiGet( edtavOldfaccon_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44OldFaccon", GXutil.ltrimstr( AV44OldFaccon, 11, 5));
         }
         AV59Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV59Pgmname", AV59Pgmname);
         AV30TipodeProceso = httpContext.cgiGet( edtavTipodeproceso_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30TipodeProceso", AV30TipodeProceso);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"RecetadeTinte90__WP");
         AV31Totaldekilos = localUtil.ctond( httpContext.cgiGet( edtavTotaldekilos_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31Totaldekilos", GXutil.ltrimstr( AV31Totaldekilos, 10, 2));
         forbiddenHiddens.add("Totaldekilos", localUtil.format( AV31Totaldekilos, "ZZZZZZ9.99"));
         AV35VolumenReceta = (int)(localUtil.ctol( httpContext.cgiGet( edtavVolumenreceta_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35VolumenReceta", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35VolumenReceta), 5, 0));
         forbiddenHiddens.add("VolumenReceta", localUtil.format( DecimalUtil.doubleToDec(AV35VolumenReceta), "ZZZZ9"));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("recetadetinte90__wp:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
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
      e1229G2 ();
      if (returnInSub) return;
   }

   public void e1229G2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV29Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      recetadetinte90__wp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV29Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Station", AV29Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV29Station, ""))));
      GXv_char2[0] = AV9EmprCod ;
      GXv_char3[0] = AV10EmprNom ;
      GXv_char4[0] = AV33UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV29Station, GXv_char2, GXv_char3, GXv_char4) ;
      recetadetinte90__wp_impl.this.AV9EmprCod = GXv_char2[0] ;
      recetadetinte90__wp_impl.this.AV10EmprNom = GXv_char3[0] ;
      recetadetinte90__wp_impl.this.AV33UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9EmprCod", AV9EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV33UsurCod", AV33UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV33UsurCod, "@!"))));
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S112 ();
      if (returnInSub) return;
      edtavTipodeproceso_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTipodeproceso_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipodeproceso_Visible), 5, 0), true);
      GXt_int5 = AV39ValCos ;
      GXv_char4[0] = AV9EmprCod ;
      GXv_char3[0] = "030100" ;
      GXv_int6[0] = GXt_int5 ;
      new app.pbuscou(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int6) ;
      recetadetinte90__wp_impl.this.AV9EmprCod = GXv_char4[0] ;
      recetadetinte90__wp_impl.this.GXt_int5 = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9EmprCod", AV9EmprCod);
      AV39ValCos = (short)(GXt_int5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39ValCos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39ValCos), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVALCOS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV39ValCos), "ZZZ9")));
      GXt_int7 = (byte)(AV47EliminarReceta) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV9EmprCod, httpContext.getMessage( "INCI92", ""), GXv_int8) ;
      recetadetinte90__wp_impl.this.GXt_int7 = GXv_int8[0] ;
      AV47EliminarReceta = GXt_int7 ;
      GXt_int7 = (byte)(DecimalUtil.decToDouble(AV48NoCantidad)) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV9EmprCod, httpContext.getMessage( "NOCTD", ""), GXv_int8) ;
      recetadetinte90__wp_impl.this.GXt_int7 = GXv_int8[0] ;
      AV48NoCantidad = DecimalUtil.doubleToDec(GXt_int7) ;
      GXt_int7 = (byte)(AV49Moda21) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV9EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int8) ;
      recetadetinte90__wp_impl.this.GXt_int7 = GXv_int8[0] ;
      AV49Moda21 = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49Moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49Moda21), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV49Moda21), "ZZZ9")));
      AV31Totaldekilos = AV32TotKgs ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Totaldekilos", GXutil.ltrimstr( AV31Totaldekilos, 10, 2));
      AV30TipodeProceso = AV19Proforfab ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30TipodeProceso", AV30TipodeProceso);
      AV35VolumenReceta = AV34Volumen ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35VolumenReceta", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35VolumenReceta), 5, 0));
      AV50modif = AV15modif2 ;
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcrecetadetinte90__wc = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcrecetadetinte90__wc_Component), GXutil.lower( "RecetadeTinte90__WC")) != 0 )
      {
         WebComp_Wcrecetadetinte90__wc = WebUtils.getWebComponent(getClass(), "app.recetadetinte90__wc_impl", remoteHandle, context);
         WebComp_Wcrecetadetinte90__wc_Component = "RecetadeTinte90__WC" ;
      }
      if ( GXutil.len( WebComp_Wcrecetadetinte90__wc_Component) != 0 )
      {
         WebComp_Wcrecetadetinte90__wc.setjustcreated();
         WebComp_Wcrecetadetinte90__wc.componentprepare(new Object[] {"W0152","",AV9EmprCod,Integer.valueOf(AV5BarCod),Byte.valueOf(AV7BarCodReo),AV6BarCodPar,Short.valueOf(AV22RecLinMaq),Byte.valueOf(AV23RecLinPro)});
         WebComp_Wcrecetadetinte90__wc.componentbind(new Object[] {"","","","","",""});
      }
      edtavPrdcant_Enabled = ((AV48NoCantidad.doubleValue()==1)&&(AV49Moda21==1) ? 0 : 1) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrdcant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdcant_Enabled), 5, 0), true);
      this.executeUsercontrolMethod("", false, "DATAMONJSContainer", "RemoveElement", "", new Object[] {httpContext.getMessage( ".gx-popup-close", "")});
      imgavVarprompt_gximage = "prompt" ;
      httpContext.ajax_rsp_assign_prop("", false, imgavVarprompt_Internalname, "gximage", imgavVarprompt_gximage, true);
      AV54VarPrompt = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop("", false, imgavVarprompt_Internalname, "Bitmap", ((GXutil.strcmp("", AV54VarPrompt)==0) ? AV60Varprompt_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV54VarPrompt))), true);
      httpContext.ajax_rsp_assign_prop("", false, imgavVarprompt_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV54VarPrompt), true);
      AV60Varprompt_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop("", false, imgavVarprompt_Internalname, "Bitmap", ((GXutil.strcmp("", AV54VarPrompt)==0) ? AV60Varprompt_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV54VarPrompt))), true);
      httpContext.ajax_rsp_assign_prop("", false, imgavVarprompt_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV54VarPrompt), true);
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e1329G2 ();
      if (returnInSub) return;
   }

   public void e1329G2( )
   {
      /* Enter Routine */
      returnInSub = false ;
      lblTbmessage_Caption = "" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      if ( ! (GXutil.strcmp("", AV27RecPrdNum)==0) )
      {
         GXt_char1 = AV17PrdNom ;
         GXv_char4[0] = AV9EmprCod ;
         GXv_char3[0] = AV27RecPrdNum ;
         GXv_char2[0] = GXt_char1 ;
         new app.pprddsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
         recetadetinte90__wp_impl.this.AV9EmprCod = GXv_char4[0] ;
         recetadetinte90__wp_impl.this.AV27RecPrdNum = GXv_char3[0] ;
         recetadetinte90__wp_impl.this.GXt_char1 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9EmprCod", AV9EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV27RecPrdNum", AV27RecPrdNum);
         AV17PrdNom = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17PrdNom", AV17PrdNom);
         GXt_char1 = AV55ForPrdDsccontrol ;
         GXv_char4[0] = GXt_char1 ;
         new app.get_forprddsc(remoteHandle, context).execute( AV9EmprCod, AV14ForPrdUMe, GXv_char4) ;
         recetadetinte90__wp_impl.this.GXt_char1 = GXv_char4[0] ;
         AV55ForPrdDsccontrol = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV55ForPrdDsccontrol", AV55ForPrdDsccontrol);
      }
      if ( ( GXutil.strcmp(AV17PrdNom, httpContext.getMessage( "Error", "")) == 0 ) && ! (GXutil.strcmp("", AV27RecPrdNum)==0) )
      {
         httpContext.doAjaxRefresh();
         lblTbmessage_Caption = httpContext.getMessage( "NO existe Producto", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
         GX_FocusControl = edtavRecprdnum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         if ( ( GXutil.strcmp(AV55ForPrdDsccontrol, httpContext.getMessage( "Error", "")) == 0 ) && ! (GXutil.strcmp("", AV27RecPrdNum)==0) )
         {
            httpContext.doAjaxRefresh();
            lblTbmessage_Caption = httpContext.getMessage( "NO es una UNIDAD Valida", "") ;
            httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
            GX_FocusControl = edtavForprdume_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            if ( (0==AV21RecLin) )
            {
               httpContext.doAjaxRefresh();
               lblTbmessage_Caption = httpContext.getMessage( "Se debe de entrar Numero Linea", "") ;
               httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
               GX_FocusControl = edtavReclin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               httpContext.doAjaxSetFocus(GX_FocusControl);
            }
            else
            {
               GXv_int8[0] = AV36Flag ;
               GXv_int9[0] = AV37Valcod ;
               new app.pbusval(remoteHandle, context).execute( AV9EmprCod, AV27RecPrdNum, GXv_int8, GXv_int9) ;
               recetadetinte90__wp_impl.this.AV36Flag = GXv_int8[0] ;
               recetadetinte90__wp_impl.this.AV37Valcod = GXv_int9[0] ;
               if ( ( AV37Valcod == 3 ) && ! (GXutil.strcmp("", AV27RecPrdNum)==0) )
               {
                  httpContext.doAjaxRefresh();
                  lblTbmessage_Caption = httpContext.getMessage( "Producto SUPRIMIDO", "") ;
                  httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                  GX_FocusControl = edtavRecprdnum_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  httpContext.doAjaxSetFocus(GX_FocusControl);
               }
               else
               {
                  if ( ( AV11FacCon.doubleValue() > 0 ) && ( AV14ForPrdUMe == 0 ) )
                  {
                     httpContext.doAjaxRefresh();
                     lblTbmessage_Caption = httpContext.getMessage( "AVISO. NO hay PRODUCTO. Hay Factor, pero NO ha entrado UNIDAD=1,2,3", "") ;
                     httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                     GX_FocusControl = edtavForprdume_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                     httpContext.doAjaxSetFocus(GX_FocusControl);
                  }
                  else
                  {
                     if ( ! ( ( GXutil.strcmp(AV25RecManAut, httpContext.getMessage( "M", "")) == 0 ) || ( GXutil.strcmp(AV25RecManAut, httpContext.getMessage( "A", "")) == 0 ) ) && ! (GXutil.strcmp("", AV27RecPrdNum)==0) )
                     {
                        httpContext.doAjaxRefresh();
                        lblTbmessage_Caption = httpContext.getMessage( "El valor permitido es M(manual) o A(automatico)", "") ;
                        httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                        GX_FocusControl = edtavRecmanaut_Internalname ;
                        httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        httpContext.doAjaxSetFocus(GX_FocusControl);
                     }
                     else
                     {
                        /* Execute user subroutine: 'CALCULARCANTIDAD' */
                        S122 ();
                        if (returnInSub) return;
                        if ( AV40lrecet == 0 )
                        {
                           Dvelop_confirmpanel_enter_Confirmationtext = httpContext.getMessage( "Desea agregar la linea ", "")+GXutil.trim( GXutil.str( AV21RecLin, 4, 0))+"?" ;
                           ucDvelop_confirmpanel_enter.sendProperty(context, "", false, Dvelop_confirmpanel_enter_Internalname, "ConfirmationText", Dvelop_confirmpanel_enter_Confirmationtext);
                        }
                        else
                        {
                           Dvelop_confirmpanel_enter_Confirmationtext = httpContext.getMessage( "Desea modificar la linea ", "")+GXutil.trim( GXutil.str( AV21RecLin, 4, 0))+"?" ;
                           ucDvelop_confirmpanel_enter.sendProperty(context, "", false, Dvelop_confirmpanel_enter_Internalname, "ConfirmationText", Dvelop_confirmpanel_enter_Confirmationtext);
                        }
                        this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ENTERContainer", "Confirm", "", new Object[] {});
                     }
                  }
               }
            }
         }
      }
      /*  Sending Event outputs  */
   }

   public void e1129G2( )
   {
      /* Dvelop_confirmpanel_enter_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_enter_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ENTER' */
         S132 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e1429G2( )
   {
      /* 'DoLimpiar' Routine */
      returnInSub = false ;
      AV21RecLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21RecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21RecLin), 4, 0));
      AV40lrecet = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40lrecet", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40lrecet), 4, 0));
      AV27RecPrdNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27RecPrdNum", AV27RecPrdNum);
      AV26RecPrdDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26RecPrdDsc", AV26RecPrdDsc);
      AV14ForPrdUMe = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14ForPrdUMe", GXutil.str( AV14ForPrdUMe, 1, 0));
      AV13ForPrdDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13ForPrdDsc", AV13ForPrdDsc);
      AV11FacCon = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11FacCon", GXutil.ltrimstr( AV11FacCon, 11, 5));
      AV16PrdCant = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16PrdCant", GXutil.ltrimstr( AV16PrdCant, 11, 3));
      AV25RecManAut = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25RecManAut", AV25RecManAut);
      AV24RecLote = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24RecLote", AV24RecLote);
      AV20RecForNro = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20RecForNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20RecForNro), 2, 0));
      AV28RecPrdTnq = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28RecPrdTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28RecPrdTnq), 2, 0));
      AV41oldRecLote = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41oldRecLote", AV41oldRecLote);
      AV42Cantold = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42Cantold", GXutil.ltrimstr( AV42Cantold, 11, 3));
      AV43CanResold = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43CanResold", GXutil.ltrimstr( AV43CanResold, 8, 2));
      AV51PrdExiAlm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51PrdExiAlm", GXutil.ltrimstr( AV51PrdExiAlm, 12, 4));
      AV52PrdCanRes = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52PrdCanRes", GXutil.ltrimstr( AV52PrdCanRes, 12, 4));
      AV53PrdExiCC = DecimalUtil.ZERO ;
      GX_FocusControl = edtavReclin_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      httpContext.doAjaxSetFocus(GX_FocusControl);
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcrecetadetinte90__wc = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcrecetadetinte90__wc_Component), GXutil.lower( "RecetadeTinte90__WC")) != 0 )
      {
         WebComp_Wcrecetadetinte90__wc = WebUtils.getWebComponent(getClass(), "app.recetadetinte90__wc_impl", remoteHandle, context);
         WebComp_Wcrecetadetinte90__wc_Component = "RecetadeTinte90__WC" ;
      }
      if ( GXutil.len( WebComp_Wcrecetadetinte90__wc_Component) != 0 )
      {
         WebComp_Wcrecetadetinte90__wc.setjustcreated();
         WebComp_Wcrecetadetinte90__wc.componentprepare(new Object[] {"W0152","",AV9EmprCod,Integer.valueOf(AV5BarCod),Byte.valueOf(AV7BarCodReo),AV6BarCodPar,Short.valueOf(AV22RecLinMaq),Byte.valueOf(AV23RecLinPro)});
         WebComp_Wcrecetadetinte90__wc.componentbind(new Object[] {"","","","","",""});
      }
      if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wcrecetadetinte90__wc )
      {
         httpContext.ajax_rspStartCmp("gxHTMLWrpW0152"+"");
         WebComp_Wcrecetadetinte90__wc.componentdraw();
         httpContext.ajax_rspEndCmp();
      }
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e1529G2( )
   {
      /* 'DoCerrar' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV9EmprCod ;
      GXv_int6[0] = AV5BarCod ;
      GXv_int9[0] = AV7BarCodReo ;
      GXv_char3[0] = AV6BarCodPar ;
      GXv_int10[0] = AV22RecLinMaq ;
      new app.pdyrp013(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_int9, GXv_char3, GXv_int10) ;
      recetadetinte90__wp_impl.this.AV9EmprCod = GXv_char4[0] ;
      recetadetinte90__wp_impl.this.AV5BarCod = GXv_int6[0] ;
      recetadetinte90__wp_impl.this.AV7BarCodReo = GXv_int9[0] ;
      recetadetinte90__wp_impl.this.AV6BarCodPar = GXv_char3[0] ;
      recetadetinte90__wp_impl.this.AV22RecLinMaq = GXv_int10[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9EmprCod", AV9EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV5BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV7BarCodReo", GXutil.str( AV7BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV6BarCodPar", AV6BarCodPar);
      httpContext.ajax_rsp_assign_attri("", false, "AV22RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22RecLinMaq), 4, 0));
      httpContext.setWebReturnParms(new Object[] {AV15modif2});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV15modif2"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
   }

   public void S132( )
   {
      /* 'DO ACTION ENTER' Routine */
      returnInSub = false ;
      new app.recetatinte91__prc(remoteHandle, context).execute( AV9EmprCod, AV5BarCod, AV7BarCodReo, AV6BarCodPar, AV22RecLinMaq, AV23RecLinPro, AV21RecLin, AV11FacCon, AV14ForPrdUMe, AV16PrdCant, AV20RecForNro, AV24RecLote, AV25RecManAut, AV26RecPrdDsc, AV27RecPrdNum, AV28RecPrdTnq, AV41oldRecLote, AV42Cantold, AV43CanResold, AV44OldFaccon, AV31Totaldekilos, AV35VolumenReceta, AV39ValCos, AV33UsurCod, AV29Station) ;
      AV21RecLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21RecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21RecLin), 4, 0));
      AV40lrecet = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40lrecet", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40lrecet), 4, 0));
      AV27RecPrdNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27RecPrdNum", AV27RecPrdNum);
      AV26RecPrdDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26RecPrdDsc", AV26RecPrdDsc);
      AV14ForPrdUMe = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14ForPrdUMe", GXutil.str( AV14ForPrdUMe, 1, 0));
      AV13ForPrdDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13ForPrdDsc", AV13ForPrdDsc);
      AV11FacCon = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11FacCon", GXutil.ltrimstr( AV11FacCon, 11, 5));
      AV16PrdCant = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16PrdCant", GXutil.ltrimstr( AV16PrdCant, 11, 3));
      AV25RecManAut = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25RecManAut", AV25RecManAut);
      AV24RecLote = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24RecLote", AV24RecLote);
      AV20RecForNro = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20RecForNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20RecForNro), 2, 0));
      AV28RecPrdTnq = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28RecPrdTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28RecPrdTnq), 2, 0));
      AV41oldRecLote = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41oldRecLote", AV41oldRecLote);
      AV42Cantold = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42Cantold", GXutil.ltrimstr( AV42Cantold, 11, 3));
      AV43CanResold = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43CanResold", GXutil.ltrimstr( AV43CanResold, 8, 2));
      AV51PrdExiAlm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51PrdExiAlm", GXutil.ltrimstr( AV51PrdExiAlm, 12, 4));
      AV52PrdCanRes = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52PrdCanRes", GXutil.ltrimstr( AV52PrdCanRes, 12, 4));
      AV53PrdExiCC = DecimalUtil.ZERO ;
      GX_FocusControl = edtavReclin_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      httpContext.doAjaxSetFocus(GX_FocusControl);
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcrecetadetinte90__wc = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcrecetadetinte90__wc_Component), GXutil.lower( "RecetadeTinte90__WC")) != 0 )
      {
         WebComp_Wcrecetadetinte90__wc = WebUtils.getWebComponent(getClass(), "app.recetadetinte90__wc_impl", remoteHandle, context);
         WebComp_Wcrecetadetinte90__wc_Component = "RecetadeTinte90__WC" ;
      }
      if ( GXutil.len( WebComp_Wcrecetadetinte90__wc_Component) != 0 )
      {
         WebComp_Wcrecetadetinte90__wc.setjustcreated();
         WebComp_Wcrecetadetinte90__wc.componentprepare(new Object[] {"W0152","",AV9EmprCod,Integer.valueOf(AV5BarCod),Byte.valueOf(AV7BarCodReo),AV6BarCodPar,Short.valueOf(AV22RecLinMaq),Byte.valueOf(AV23RecLinPro)});
         WebComp_Wcrecetadetinte90__wc.componentbind(new Object[] {"","","","","",""});
      }
      if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wcrecetadetinte90__wc )
      {
         httpContext.ajax_rspStartCmp("gxHTMLWrpW0152"+"");
         WebComp_Wcrecetadetinte90__wc.componentdraw();
         httpContext.ajax_rspEndCmp();
      }
      httpContext.doAjaxRefresh();
   }

   public void S112( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      divUnnamedtable6_Visible = (((1==2)) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, divUnnamedtable6_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable6_Visible), 5, 0), true);
   }

   public void e1629G2( )
   {
      /* Reclin_Isvalid Routine */
      returnInSub = false ;
      lblTbmessage_Caption = "" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      if ( (0==AV21RecLin) )
      {
         lblTbmessage_Caption = httpContext.getMessage( "Se debe de entrar Numero Linea", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
         httpContext.doAjaxRefresh();
         GX_FocusControl = edtavReclin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         GXv_decimal11[0] = AV11FacCon ;
         GXv_char4[0] = AV13ForPrdDsc ;
         GXv_int9[0] = AV14ForPrdUMe ;
         GXv_decimal12[0] = AV16PrdCant ;
         GXv_int8[0] = AV20RecForNro ;
         GXv_char3[0] = AV24RecLote ;
         GXv_char2[0] = AV25RecManAut ;
         GXv_char13[0] = AV26RecPrdDsc ;
         GXv_char14[0] = AV27RecPrdNum ;
         GXv_int15[0] = AV28RecPrdTnq ;
         GXv_char16[0] = AV41oldRecLote ;
         GXv_decimal17[0] = AV42Cantold ;
         GXv_decimal18[0] = AV43CanResold ;
         GXv_decimal19[0] = AV44OldFaccon ;
         GXv_decimal20[0] = AV51PrdExiAlm ;
         GXv_decimal21[0] = AV52PrdCanRes ;
         GXv_decimal22[0] = AV53PrdExiCC ;
         GXv_int10[0] = AV40lrecet ;
         new app.recetatinte90__prc(remoteHandle, context).execute( AV9EmprCod, AV5BarCod, AV7BarCodReo, AV6BarCodPar, AV22RecLinMaq, AV23RecLinPro, AV21RecLin, GXv_decimal11, GXv_char4, GXv_int9, GXv_decimal12, GXv_int8, GXv_char3, GXv_char2, GXv_char13, GXv_char14, GXv_int15, GXv_char16, GXv_decimal17, GXv_decimal18, GXv_decimal19, GXv_decimal20, GXv_decimal21, GXv_decimal22, GXv_int10) ;
         recetadetinte90__wp_impl.this.AV11FacCon = GXv_decimal11[0] ;
         recetadetinte90__wp_impl.this.AV13ForPrdDsc = GXv_char4[0] ;
         recetadetinte90__wp_impl.this.AV14ForPrdUMe = GXv_int9[0] ;
         recetadetinte90__wp_impl.this.AV16PrdCant = GXv_decimal12[0] ;
         recetadetinte90__wp_impl.this.AV20RecForNro = GXv_int8[0] ;
         recetadetinte90__wp_impl.this.AV24RecLote = GXv_char3[0] ;
         recetadetinte90__wp_impl.this.AV25RecManAut = GXv_char2[0] ;
         recetadetinte90__wp_impl.this.AV26RecPrdDsc = GXv_char13[0] ;
         recetadetinte90__wp_impl.this.AV27RecPrdNum = GXv_char14[0] ;
         recetadetinte90__wp_impl.this.AV28RecPrdTnq = GXv_int15[0] ;
         recetadetinte90__wp_impl.this.AV41oldRecLote = GXv_char16[0] ;
         recetadetinte90__wp_impl.this.AV42Cantold = GXv_decimal17[0] ;
         recetadetinte90__wp_impl.this.AV43CanResold = GXv_decimal18[0] ;
         recetadetinte90__wp_impl.this.AV44OldFaccon = GXv_decimal19[0] ;
         recetadetinte90__wp_impl.this.AV51PrdExiAlm = GXv_decimal20[0] ;
         recetadetinte90__wp_impl.this.AV52PrdCanRes = GXv_decimal21[0] ;
         recetadetinte90__wp_impl.this.AV53PrdExiCC = GXv_decimal22[0] ;
         recetadetinte90__wp_impl.this.AV40lrecet = GXv_int10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11FacCon", GXutil.ltrimstr( AV11FacCon, 11, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV13ForPrdDsc", AV13ForPrdDsc);
         httpContext.ajax_rsp_assign_attri("", false, "AV14ForPrdUMe", GXutil.str( AV14ForPrdUMe, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV16PrdCant", GXutil.ltrimstr( AV16PrdCant, 11, 3));
         httpContext.ajax_rsp_assign_attri("", false, "AV20RecForNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20RecForNro), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV24RecLote", AV24RecLote);
         httpContext.ajax_rsp_assign_attri("", false, "AV25RecManAut", AV25RecManAut);
         httpContext.ajax_rsp_assign_attri("", false, "AV26RecPrdDsc", AV26RecPrdDsc);
         httpContext.ajax_rsp_assign_attri("", false, "AV27RecPrdNum", AV27RecPrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "AV28RecPrdTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28RecPrdTnq), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV41oldRecLote", AV41oldRecLote);
         httpContext.ajax_rsp_assign_attri("", false, "AV42Cantold", GXutil.ltrimstr( AV42Cantold, 11, 3));
         httpContext.ajax_rsp_assign_attri("", false, "AV43CanResold", GXutil.ltrimstr( AV43CanResold, 8, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV44OldFaccon", GXutil.ltrimstr( AV44OldFaccon, 11, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV51PrdExiAlm", GXutil.ltrimstr( AV51PrdExiAlm, 12, 4));
         httpContext.ajax_rsp_assign_attri("", false, "AV52PrdCanRes", GXutil.ltrimstr( AV52PrdCanRes, 12, 4));
         httpContext.ajax_rsp_assign_attri("", false, "AV40lrecet", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40lrecet), 4, 0));
         edtavRecprdnum_Enabled = ((AV40lrecet==0) ? 1 : 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtavRecprdnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecprdnum_Enabled), 5, 0), true);
         edtavRecprddsc_Enabled = ((AV40lrecet==0) ? 1 : 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtavRecprddsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecprddsc_Enabled), 5, 0), true);
      }
      /*  Sending Event outputs  */
   }

   public void e1729G2( )
   {
      /* Forprdume_Controlvaluechanged Routine */
      returnInSub = false ;
      if ( ( ( AV14ForPrdUMe == 1 ) || ( AV14ForPrdUMe == 2 ) ) && ( GXutil.strcmp(AV30TipodeProceso, "*") != 0 ) )
      {
         AV16PrdCant = (AV11FacCon.multiply(DecimalUtil.doubleToDec(AV35VolumenReceta))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16PrdCant", GXutil.ltrimstr( AV16PrdCant, 11, 3));
      }
      if ( ( AV14ForPrdUMe == 3 ) && ( GXutil.strcmp(AV30TipodeProceso, "*") != 0 ) )
      {
         AV16PrdCant = AV31Totaldekilos.multiply(AV11FacCon).multiply(DecimalUtil.doubleToDec(AV39ValCos)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16PrdCant", GXutil.ltrimstr( AV16PrdCant, 11, 3));
      }
      GXt_char1 = AV13ForPrdDsc ;
      GXv_char16[0] = GXt_char1 ;
      new app.get_forprddsc(remoteHandle, context).execute( AV9EmprCod, AV14ForPrdUMe, GXv_char16) ;
      recetadetinte90__wp_impl.this.GXt_char1 = GXv_char16[0] ;
      AV13ForPrdDsc = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13ForPrdDsc", AV13ForPrdDsc);
      /*  Sending Event outputs  */
   }

   public void e2029G2( )
   {
      /* Varprompt_Click Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.stocksquimicos.producprompt", new String[] {GXutil.URLEncode(GXutil.rtrim(AV9EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV27RecPrdNum)),GXutil.URLEncode(GXutil.rtrim(AV26RecPrdDsc))}, new String[] {"InOutEmprCod","InOutPrdNum","InOutPrdNom"}) , new Object[] {"AV9EmprCod","AV27RecPrdNum","AV26RecPrdDsc"});
      /*  Sending Event outputs  */
   }

   public void e1829G2( )
   {
      /* Recprdnum_Controlvaluechanged Routine */
      returnInSub = false ;
      lblTbmessage_Caption = "" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      if ( ! (GXutil.strcmp("", AV27RecPrdNum)==0) )
      {
         GXt_char1 = AV17PrdNom ;
         GXv_char16[0] = AV9EmprCod ;
         GXv_char14[0] = AV27RecPrdNum ;
         GXv_char13[0] = GXt_char1 ;
         new app.pprddsc(remoteHandle, context).execute( GXv_char16, GXv_char14, GXv_char13) ;
         recetadetinte90__wp_impl.this.AV9EmprCod = GXv_char16[0] ;
         recetadetinte90__wp_impl.this.AV27RecPrdNum = GXv_char14[0] ;
         recetadetinte90__wp_impl.this.GXt_char1 = GXv_char13[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9EmprCod", AV9EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV27RecPrdNum", AV27RecPrdNum);
         AV17PrdNom = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17PrdNom", AV17PrdNom);
         if ( GXutil.strcmp(AV17PrdNom, httpContext.getMessage( "Error", "")) == 0 )
         {
            lblTbmessage_Caption = httpContext.getMessage( "NO existe Producto", "") ;
            httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
            httpContext.doAjaxRefresh();
            GX_FocusControl = edtavRecprdnum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            if ( AV40lrecet == 0 )
            {
               /* Execute user subroutine: 'PRODUC' */
               S142 ();
               if (returnInSub) return;
               /* Execute user subroutine: 'UNIDAD' */
               S152 ();
               if (returnInSub) return;
            }
         }
      }
      /*  Sending Event outputs  */
   }

   public void S152( )
   {
      /* 'UNIDAD' Routine */
      returnInSub = false ;
      AV13ForPrdDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13ForPrdDsc", AV13ForPrdDsc);
      /* Using cursor H029G2 */
      pr_default.execute(0, new Object[] {AV9EmprCod, Byte.valueOf(AV14ForPrdUMe)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A490ForPrdUMe = H029G2_A490ForPrdUMe[0] ;
         A396EmprCod = H029G2_A396EmprCod[0] ;
         A488ForPrdDsc = H029G2_A488ForPrdDsc[0] ;
         n488ForPrdDsc = H029G2_n488ForPrdDsc[0] ;
         AV13ForPrdDsc = A488ForPrdDsc ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13ForPrdDsc", AV13ForPrdDsc);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
   }

   public void S142( )
   {
      /* 'PRODUC' Routine */
      returnInSub = false ;
      AV24RecLote = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24RecLote", AV24RecLote);
      AV14ForPrdUMe = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14ForPrdUMe", GXutil.str( AV14ForPrdUMe, 1, 0));
      AV26RecPrdDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26RecPrdDsc", AV26RecPrdDsc);
      AV52PrdCanRes = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52PrdCanRes", GXutil.ltrimstr( AV52PrdCanRes, 12, 4));
      AV51PrdExiAlm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51PrdExiAlm", GXutil.ltrimstr( AV51PrdExiAlm, 12, 4));
      AV53PrdExiCC = DecimalUtil.ZERO ;
      AV25RecManAut = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25RecManAut", AV25RecManAut);
      /* Using cursor H029G3 */
      pr_default.execute(1, new Object[] {AV9EmprCod, AV27RecPrdNum});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A719PrdNum = H029G3_A719PrdNum[0] ;
         A396EmprCod = H029G3_A396EmprCod[0] ;
         A10881PrdLote = H029G3_A10881PrdLote[0] ;
         A4338PrdUMeFo = H029G3_A4338PrdUMeFo[0] ;
         A718PrdNom = H029G3_A718PrdNom[0] ;
         A685PrdCanRes = H029G3_A685PrdCanRes[0] ;
         A704PrdExiAlm = H029G3_A704PrdExiAlm[0] ;
         A705PrdExiCC = H029G3_A705PrdExiCC[0] ;
         A1643PrdTip = H029G3_A1643PrdTip[0] ;
         if ( AV49Moda21 == 0 )
         {
            AV24RecLote = A10881PrdLote ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24RecLote", AV24RecLote);
         }
         AV14ForPrdUMe = A4338PrdUMeFo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14ForPrdUMe", GXutil.str( AV14ForPrdUMe, 1, 0));
         AV26RecPrdDsc = A718PrdNom ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26RecPrdDsc", AV26RecPrdDsc);
         AV52PrdCanRes = A685PrdCanRes ;
         httpContext.ajax_rsp_assign_attri("", false, "AV52PrdCanRes", GXutil.ltrimstr( AV52PrdCanRes, 12, 4));
         AV51PrdExiAlm = A704PrdExiAlm ;
         httpContext.ajax_rsp_assign_attri("", false, "AV51PrdExiAlm", GXutil.ltrimstr( AV51PrdExiAlm, 12, 4));
         AV53PrdExiCC = A705PrdExiCC ;
         AV25RecManAut = A1643PrdTip ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25RecManAut", AV25RecManAut);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
   }

   public void S122( )
   {
      /* 'CALCULARCANTIDAD' Routine */
      returnInSub = false ;
      if ( ( ( AV14ForPrdUMe == 1 ) || ( AV14ForPrdUMe == 2 ) ) && ( GXutil.strcmp(AV30TipodeProceso, "*") != 0 ) )
      {
         AV16PrdCant = (AV11FacCon.multiply(DecimalUtil.doubleToDec(AV35VolumenReceta))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16PrdCant", GXutil.ltrimstr( AV16PrdCant, 11, 3));
      }
      if ( ( AV14ForPrdUMe == 3 ) && ( GXutil.strcmp(AV30TipodeProceso, "*") != 0 ) )
      {
         AV16PrdCant = AV31Totaldekilos.multiply(AV11FacCon).multiply(DecimalUtil.doubleToDec(AV39ValCos)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16PrdCant", GXutil.ltrimstr( AV16PrdCant, 11, 3));
      }
   }

   protected void nextLoad( )
   {
   }

   protected void e1929G2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   public void wb_table2_164_29G2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_enter_Internalname, tblTabledvelop_confirmpanel_enter_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_enter.setProperty("Title", Dvelop_confirmpanel_enter_Title);
         ucDvelop_confirmpanel_enter.setProperty("ConfirmationText", Dvelop_confirmpanel_enter_Confirmationtext);
         ucDvelop_confirmpanel_enter.setProperty("YesButtonCaption", Dvelop_confirmpanel_enter_Yesbuttoncaption);
         ucDvelop_confirmpanel_enter.setProperty("NoButtonCaption", Dvelop_confirmpanel_enter_Nobuttoncaption);
         ucDvelop_confirmpanel_enter.setProperty("CancelButtonCaption", Dvelop_confirmpanel_enter_Cancelbuttoncaption);
         ucDvelop_confirmpanel_enter.setProperty("YesButtonPosition", Dvelop_confirmpanel_enter_Yesbuttonposition);
         ucDvelop_confirmpanel_enter.setProperty("ConfirmType", Dvelop_confirmpanel_enter_Confirmtype);
         ucDvelop_confirmpanel_enter.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_enter_Internalname, "DVELOP_CONFIRMPANEL_ENTERContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_ENTERContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_164_29G2e( true) ;
      }
      else
      {
         wb_table2_164_29G2e( false) ;
      }
   }

   public void wb_table1_72_29G2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedforprdume_Internalname, tblTablemergedforprdume_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavForprdume_Internalname, httpContext.getMessage( "For Prd UMe", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavForprdume_Internalname, GXutil.ltrim( localUtil.ntoc( AV14ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavForprdume_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV14ForPrdUMe), "9") : localUtil.format( DecimalUtil.doubleToDec(AV14ForPrdUMe), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavForprdume_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavForprdume_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte90__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Static images/pictures */
         ClassString = "Image" + " " + ((GXutil.strcmp(imgPrompt_forprdume_gximage, "")==0) ? "GX_Image_prompt_Class" : "GX_Image_"+imgPrompt_forprdume_gximage+"_Class") ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
         app.GxWebStd.gx_bitmap( httpContext, imgPrompt_forprdume_Internalname, sImgUrl, imgPrompt_forprdume_Link, "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", " "+"data-gx-image"+" ", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_RecetadeTinte90__WP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_72_29G2e( true) ;
      }
      else
      {
         wb_table1_72_29G2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      Gx_mode = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      AV9EmprCod = (String)getParm(obj,1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9EmprCod", AV9EmprCod);
      AV5BarCod = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarCod), 8, 0));
      AV7BarCodReo = ((Number) GXutil.testNumericType( getParm(obj,3), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7BarCodReo", GXutil.str( AV7BarCodReo, 1, 0));
      AV6BarCodPar = (String)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6BarCodPar", AV6BarCodPar);
      AV22RecLinMaq = ((Number) GXutil.testNumericType( getParm(obj,5), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22RecLinMaq), 4, 0));
      AV23RecLinPro = ((Number) GXutil.testNumericType( getParm(obj,6), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23RecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23RecLinPro), 2, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECLINPRO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV23RecLinPro), "Z9")));
      AV32TotKgs = (java.math.BigDecimal)getParm(obj,7) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32TotKgs", GXutil.ltrimstr( AV32TotKgs, 10, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTKGS", getSecureSignedToken( "", localUtil.format( AV32TotKgs, "ZZZZZZ9.99")));
      AV34Volumen = ((Number) GXutil.testNumericType( getParm(obj,8), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Volumen", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Volumen), 5, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVOLUMEN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV34Volumen), "ZZZZ9")));
      AV12FecPan = (java.util.Date)getParm(obj,9) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12FecPan", localUtil.format(AV12FecPan, "99/99/99"));
      AV8Barnhdr = (String)getParm(obj,10) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Barnhdr", AV8Barnhdr);
      AV18ProForDsc = (String)getParm(obj,11) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18ProForDsc", AV18ProForDsc);
      AV19Proforfab = (String)getParm(obj,12) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Proforfab", AV19Proforfab);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROFORFAB", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV19Proforfab, ""))));
      AV15modif2 = (String)getParm(obj,13) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15modif2", AV15modif2);
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
      pa29G2( ) ;
      ws29G2( ) ;
      we29G2( ) ;
      if ( isAjaxCallMode( ) )
      {
         cleanup();
      }
      httpContext.setWrapped(false);
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

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      if ( ! ( WebComp_Wcrecetadetinte90__wc == null ) )
      {
         if ( GXutil.len( WebComp_Wcrecetadetinte90__wc_Component) != 0 )
         {
            WebComp_Wcrecetadetinte90__wc.componentthemes();
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016453851", true, true);
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
      httpContext.AddJavascriptSource("recetadetinte90__wp.js", "?202661016453851", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtavProfordsc_Internalname = "vPROFORDSC" ;
      edtavTotaldekilos_Internalname = "vTOTALDEKILOS" ;
      edtavVolumenreceta_Internalname = "vVOLUMENRECETA" ;
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      lblTbmessage_Internalname = "TBMESSAGE" ;
      edtavReclin_Internalname = "vRECLIN" ;
      edtavRecprdnum_Internalname = "vRECPRDNUM" ;
      imgavVarprompt_Internalname = "vVARPROMPT" ;
      edtavRecprddsc_Internalname = "vRECPRDDSC" ;
      edtavFaccon_Internalname = "vFACCON" ;
      lblTextblockforprdume_Internalname = "TEXTBLOCKFORPRDUME" ;
      edtavForprdume_Internalname = "vFORPRDUME" ;
      imgPrompt_forprdume_Internalname = "PROMPT_FORPRDUME" ;
      tblTablemergedforprdume_Internalname = "TABLEMERGEDFORPRDUME" ;
      divTablesplittedforprdume_Internalname = "TABLESPLITTEDFORPRDUME" ;
      edtavForprddsc_Internalname = "vFORPRDDSC" ;
      edtavPrdcant_Internalname = "vPRDCANT" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      edtavReclote_Internalname = "vRECLOTE" ;
      edtavRecfornro_Internalname = "vRECFORNRO" ;
      edtavRecprdtnq_Internalname = "vRECPRDTNQ" ;
      edtavRecmanaut_Internalname = "vRECMANAUT" ;
      edtavPrdexialm_Internalname = "vPRDEXIALM" ;
      edtavPrdcanres_Internalname = "vPRDCANRES" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      edtavOldreclote_Internalname = "vOLDRECLOTE" ;
      edtavCantold_Internalname = "vCANTOLD" ;
      edtavCanresold_Internalname = "vCANRESOLD" ;
      edtavOldfaccon_Internalname = "vOLDFACCON" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      bttBtnlimpiar_Internalname = "BTNLIMPIAR" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavTipodeproceso_Internalname = "vTIPODEPROCESO" ;
      Dvelop_confirmpanel_enter_Internalname = "DVELOP_CONFIRMPANEL_ENTER" ;
      tblTabledvelop_confirmpanel_enter_Internalname = "TABLEDVELOP_CONFIRMPANEL_ENTER" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
   }

   public void initialize_properties( )
   {
      httpContext.setAjaxOnSessionTimeout(ajaxOnSessionTimeout());
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
      init_default_properties( ) ;
      imgPrompt_forprdume_Link = "" ;
      edtavForprdume_Jsonclick = "" ;
      edtavForprdume_Enabled = 1 ;
      edtavTipodeproceso_Jsonclick = "" ;
      edtavTipodeproceso_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavOldfaccon_Jsonclick = "" ;
      edtavOldfaccon_Enabled = 1 ;
      edtavCanresold_Jsonclick = "" ;
      edtavCanresold_Enabled = 1 ;
      edtavCantold_Jsonclick = "" ;
      edtavCantold_Enabled = 1 ;
      edtavOldreclote_Jsonclick = "" ;
      edtavOldreclote_Enabled = 1 ;
      divUnnamedtable6_Visible = 1 ;
      edtavPrdcanres_Jsonclick = "" ;
      edtavPrdcanres_Enabled = 1 ;
      edtavPrdexialm_Jsonclick = "" ;
      edtavPrdexialm_Enabled = 1 ;
      edtavRecmanaut_Jsonclick = "" ;
      edtavRecmanaut_Enabled = 1 ;
      edtavRecprdtnq_Jsonclick = "" ;
      edtavRecprdtnq_Enabled = 1 ;
      edtavRecfornro_Jsonclick = "" ;
      edtavRecfornro_Enabled = 1 ;
      edtavReclote_Jsonclick = "" ;
      edtavReclote_Enabled = 1 ;
      edtavPrdcant_Jsonclick = "" ;
      edtavPrdcant_Enabled = 1 ;
      edtavForprddsc_Jsonclick = "" ;
      edtavForprddsc_Enabled = 1 ;
      edtavFaccon_Jsonclick = "" ;
      edtavFaccon_Enabled = 1 ;
      edtavRecprddsc_Jsonclick = "" ;
      edtavRecprddsc_Enabled = 1 ;
      imgavVarprompt_Jsonclick = "" ;
      imgavVarprompt_gximage = "" ;
      edtavRecprdnum_Jsonclick = "" ;
      edtavRecprdnum_Enabled = 1 ;
      edtavReclin_Jsonclick = "" ;
      edtavReclin_Enabled = 1 ;
      lblTbmessage_Caption = "  " ;
      edtavVolumenreceta_Jsonclick = "" ;
      edtavVolumenreceta_Enabled = 1 ;
      edtavTotaldekilos_Jsonclick = "" ;
      edtavTotaldekilos_Enabled = 1 ;
      edtavProfordsc_Jsonclick = "" ;
      edtavProfordsc_Enabled = 0 ;
      Dvelop_confirmpanel_enter_Confirmtype = "1" ;
      Dvelop_confirmpanel_enter_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_enter_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_enter_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_enter_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_enter_Confirmationtext = "¿Desea modificar la linea?" ;
      Dvelop_confirmpanel_enter_Title = "" ;
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = "" ;
      Dvpanel_unnamedtable2_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Width = "100%" ;
      Dvpanel_tableattributes_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Iconposition = "Right" ;
      Dvpanel_tableattributes_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_tableattributes_Title = httpContext.getMessage( "Informacion", "") ;
      Dvpanel_tableattributes_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tableattributes_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tableattributes_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Mantenimiento Lineas Receta", "") );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV39ValCos',fld:'vVALCOS',pic:'ZZZ9',hsh:true},{av:'AV23RecLinPro',fld:'vRECLINPRO',pic:'Z9',hsh:true},{av:'AV33UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV29Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV49Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV32TotKgs',fld:'vTOTKGS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV34Volumen',fld:'vVOLUMEN',pic:'ZZZZ9',hsh:true},{av:'AV19Proforfab',fld:'vPROFORFAB',pic:'',hsh:true},{av:'AV31Totaldekilos',fld:'vTOTALDEKILOS',pic:'ZZZZZZ9.99'},{av:'AV35VolumenReceta',fld:'vVOLUMENRECETA',pic:'ZZZZ9'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("ENTER","{handler:'e1329G2',iparms:[{av:'AV27RecPrdNum',fld:'vRECPRDNUM',pic:''},{av:'AV9EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV14ForPrdUMe',fld:'vFORPRDUME',pic:'9'},{av:'AV17PrdNom',fld:'vPRDNOM',pic:''},{av:'AV55ForPrdDsccontrol',fld:'vFORPRDDSCCONTROL',pic:''},{av:'AV21RecLin',fld:'vRECLIN',pic:'ZZZ9'},{av:'AV11FacCon',fld:'vFACCON',pic:'ZZZZ9.99999'},{av:'AV25RecManAut',fld:'vRECMANAUT',pic:''},{av:'AV40lrecet',fld:'vLRECET',pic:'ZZZ9'},{av:'AV30TipodeProceso',fld:'vTIPODEPROCESO',pic:''},{av:'AV35VolumenReceta',fld:'vVOLUMENRECETA',pic:'ZZZZ9'},{av:'AV31Totaldekilos',fld:'vTOTALDEKILOS',pic:'ZZZZZZ9.99'},{av:'AV39ValCos',fld:'vVALCOS',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'AV17PrdNom',fld:'vPRDNOM',pic:''},{av:'AV27RecPrdNum',fld:'vRECPRDNUM',pic:''},{av:'AV9EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV55ForPrdDsccontrol',fld:'vFORPRDDSCCONTROL',pic:''},{av:'Dvelop_confirmpanel_enter_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_ENTER',prop:'ConfirmationText'},{av:'AV16PrdCant',fld:'vPRDCANT',pic:'ZZZZZZ9.999'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ENTER.CLOSE","{handler:'e1129G2',iparms:[{av:'Dvelop_confirmpanel_enter_Result',ctrl:'DVELOP_CONFIRMPANEL_ENTER',prop:'Result'},{av:'AV9EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV6BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV22RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV23RecLinPro',fld:'vRECLINPRO',pic:'Z9',hsh:true},{av:'AV21RecLin',fld:'vRECLIN',pic:'ZZZ9'},{av:'AV11FacCon',fld:'vFACCON',pic:'ZZZZ9.99999'},{av:'AV14ForPrdUMe',fld:'vFORPRDUME',pic:'9'},{av:'AV16PrdCant',fld:'vPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV20RecForNro',fld:'vRECFORNRO',pic:'Z9'},{av:'AV24RecLote',fld:'vRECLOTE',pic:''},{av:'AV25RecManAut',fld:'vRECMANAUT',pic:''},{av:'AV26RecPrdDsc',fld:'vRECPRDDSC',pic:''},{av:'AV27RecPrdNum',fld:'vRECPRDNUM',pic:''},{av:'AV28RecPrdTnq',fld:'vRECPRDTNQ',pic:'Z9'},{av:'AV41oldRecLote',fld:'vOLDRECLOTE',pic:''},{av:'AV42Cantold',fld:'vCANTOLD',pic:'ZZZZZZ9.999'},{av:'AV43CanResold',fld:'vCANRESOLD',pic:'ZZZZ9.99'},{av:'AV44OldFaccon',fld:'vOLDFACCON',pic:'ZZZZ9.99999'},{av:'AV31Totaldekilos',fld:'vTOTALDEKILOS',pic:'ZZZZZZ9.99'},{av:'AV35VolumenReceta',fld:'vVOLUMENRECETA',pic:'ZZZZ9'},{av:'AV39ValCos',fld:'vVALCOS',pic:'ZZZ9',hsh:true},{av:'AV33UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV29Station',fld:'vSTATION',pic:'',hsh:true}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ENTER.CLOSE",",oparms:[{av:'AV21RecLin',fld:'vRECLIN',pic:'ZZZ9'},{av:'AV40lrecet',fld:'vLRECET',pic:'ZZZ9'},{av:'AV27RecPrdNum',fld:'vRECPRDNUM',pic:''},{av:'AV26RecPrdDsc',fld:'vRECPRDDSC',pic:''},{av:'AV14ForPrdUMe',fld:'vFORPRDUME',pic:'9'},{av:'AV13ForPrdDsc',fld:'vFORPRDDSC',pic:''},{av:'AV11FacCon',fld:'vFACCON',pic:'ZZZZ9.99999'},{av:'AV16PrdCant',fld:'vPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV25RecManAut',fld:'vRECMANAUT',pic:''},{av:'AV24RecLote',fld:'vRECLOTE',pic:''},{av:'AV20RecForNro',fld:'vRECFORNRO',pic:'Z9'},{av:'AV28RecPrdTnq',fld:'vRECPRDTNQ',pic:'Z9'},{av:'AV41oldRecLote',fld:'vOLDRECLOTE',pic:''},{av:'AV42Cantold',fld:'vCANTOLD',pic:'ZZZZZZ9.999'},{av:'AV43CanResold',fld:'vCANRESOLD',pic:'ZZZZ9.99'},{av:'AV51PrdExiAlm',fld:'vPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV52PrdCanRes',fld:'vPRDCANRES',pic:'ZZZZZZ9.9999'},{ctrl:'WCRECETADETINTE90__WC'}]}");
      setEventMetadata("'DOLIMPIAR'","{handler:'e1429G2',iparms:[{av:'AV9EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV6BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV22RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV23RecLinPro',fld:'vRECLINPRO',pic:'Z9',hsh:true}]");
      setEventMetadata("'DOLIMPIAR'",",oparms:[{av:'AV21RecLin',fld:'vRECLIN',pic:'ZZZ9'},{av:'AV40lrecet',fld:'vLRECET',pic:'ZZZ9'},{av:'AV27RecPrdNum',fld:'vRECPRDNUM',pic:''},{av:'AV26RecPrdDsc',fld:'vRECPRDDSC',pic:''},{av:'AV14ForPrdUMe',fld:'vFORPRDUME',pic:'9'},{av:'AV13ForPrdDsc',fld:'vFORPRDDSC',pic:''},{av:'AV11FacCon',fld:'vFACCON',pic:'ZZZZ9.99999'},{av:'AV16PrdCant',fld:'vPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV25RecManAut',fld:'vRECMANAUT',pic:''},{av:'AV24RecLote',fld:'vRECLOTE',pic:''},{av:'AV20RecForNro',fld:'vRECFORNRO',pic:'Z9'},{av:'AV28RecPrdTnq',fld:'vRECPRDTNQ',pic:'Z9'},{av:'AV41oldRecLote',fld:'vOLDRECLOTE',pic:''},{av:'AV42Cantold',fld:'vCANTOLD',pic:'ZZZZZZ9.999'},{av:'AV43CanResold',fld:'vCANRESOLD',pic:'ZZZZ9.99'},{av:'AV51PrdExiAlm',fld:'vPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV52PrdCanRes',fld:'vPRDCANRES',pic:'ZZZZZZ9.9999'},{ctrl:'WCRECETADETINTE90__WC'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e1529G2',iparms:[{av:'AV9EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV6BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV22RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV15modif2',fld:'vMODIF2',pic:''}]");
      setEventMetadata("'DOCERRAR'",",oparms:[{av:'AV22RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV6BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV9EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("VRECLIN.ISVALID","{handler:'e1629G2',iparms:[{av:'AV21RecLin',fld:'vRECLIN',pic:'ZZZ9'},{av:'AV9EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV6BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV22RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV23RecLinPro',fld:'vRECLINPRO',pic:'Z9',hsh:true}]");
      setEventMetadata("VRECLIN.ISVALID",",oparms:[{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'AV40lrecet',fld:'vLRECET',pic:'ZZZ9'},{av:'AV52PrdCanRes',fld:'vPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV51PrdExiAlm',fld:'vPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV44OldFaccon',fld:'vOLDFACCON',pic:'ZZZZ9.99999'},{av:'AV43CanResold',fld:'vCANRESOLD',pic:'ZZZZ9.99'},{av:'AV42Cantold',fld:'vCANTOLD',pic:'ZZZZZZ9.999'},{av:'AV41oldRecLote',fld:'vOLDRECLOTE',pic:''},{av:'AV28RecPrdTnq',fld:'vRECPRDTNQ',pic:'Z9'},{av:'AV27RecPrdNum',fld:'vRECPRDNUM',pic:''},{av:'AV26RecPrdDsc',fld:'vRECPRDDSC',pic:''},{av:'AV25RecManAut',fld:'vRECMANAUT',pic:''},{av:'AV24RecLote',fld:'vRECLOTE',pic:''},{av:'AV20RecForNro',fld:'vRECFORNRO',pic:'Z9'},{av:'AV16PrdCant',fld:'vPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV14ForPrdUMe',fld:'vFORPRDUME',pic:'9'},{av:'AV13ForPrdDsc',fld:'vFORPRDDSC',pic:''},{av:'AV11FacCon',fld:'vFACCON',pic:'ZZZZ9.99999'},{av:'edtavRecprdnum_Enabled',ctrl:'vRECPRDNUM',prop:'Enabled'},{av:'edtavRecprddsc_Enabled',ctrl:'vRECPRDDSC',prop:'Enabled'}]}");
      setEventMetadata("VFORPRDUME.CONTROLVALUECHANGED","{handler:'e1729G2',iparms:[{av:'AV14ForPrdUMe',fld:'vFORPRDUME',pic:'9'},{av:'AV30TipodeProceso',fld:'vTIPODEPROCESO',pic:''},{av:'AV11FacCon',fld:'vFACCON',pic:'ZZZZ9.99999'},{av:'AV35VolumenReceta',fld:'vVOLUMENRECETA',pic:'ZZZZ9'},{av:'AV31Totaldekilos',fld:'vTOTALDEKILOS',pic:'ZZZZZZ9.99'},{av:'AV39ValCos',fld:'vVALCOS',pic:'ZZZ9',hsh:true},{av:'AV9EmprCod',fld:'vEMPRCOD',pic:'@!'}]");
      setEventMetadata("VFORPRDUME.CONTROLVALUECHANGED",",oparms:[{av:'AV16PrdCant',fld:'vPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV13ForPrdDsc',fld:'vFORPRDDSC',pic:''}]}");
      setEventMetadata("VVARPROMPT.CLICK","{handler:'e2029G2',iparms:[{av:'AV9EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV27RecPrdNum',fld:'vRECPRDNUM',pic:''},{av:'AV26RecPrdDsc',fld:'vRECPRDDSC',pic:''}]");
      setEventMetadata("VVARPROMPT.CLICK",",oparms:[{av:'AV26RecPrdDsc',fld:'vRECPRDDSC',pic:''},{av:'AV27RecPrdNum',fld:'vRECPRDNUM',pic:''},{av:'AV9EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("VRECPRDNUM.CONTROLVALUECHANGED","{handler:'e1829G2',iparms:[{av:'AV27RecPrdNum',fld:'vRECPRDNUM',pic:''},{av:'AV9EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV40lrecet',fld:'vLRECET',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'AV49Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'A10881PrdLote',fld:'PRDLOTE',pic:''},{av:'A4338PrdUMeFo',fld:'PRDUMEFO',pic:'9'},{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A685PrdCanRes',fld:'PRDCANRES',pic:'ZZZZZZ9.9999'},{av:'A704PrdExiAlm',fld:'PRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'A705PrdExiCC',fld:'PRDEXICC',pic:'ZZZZZZ9.9999'},{av:'A1643PrdTip',fld:'PRDTIP',pic:'@!'},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'},{av:'AV14ForPrdUMe',fld:'vFORPRDUME',pic:'9'},{av:'A488ForPrdDsc',fld:'FORPRDDSC',pic:''}]");
      setEventMetadata("VRECPRDNUM.CONTROLVALUECHANGED",",oparms:[{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'AV17PrdNom',fld:'vPRDNOM',pic:''},{av:'AV27RecPrdNum',fld:'vRECPRDNUM',pic:''},{av:'AV9EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV24RecLote',fld:'vRECLOTE',pic:''},{av:'AV14ForPrdUMe',fld:'vFORPRDUME',pic:'9'},{av:'AV26RecPrdDsc',fld:'vRECPRDDSC',pic:''},{av:'AV52PrdCanRes',fld:'vPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV51PrdExiAlm',fld:'vPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV25RecManAut',fld:'vRECMANAUT',pic:''},{av:'AV13ForPrdDsc',fld:'vFORPRDDSC',pic:''}]}");
      setEventMetadata("VALIDV_RECPRDNUM","{handler:'validv_Recprdnum',iparms:[]");
      setEventMetadata("VALIDV_RECPRDNUM",",oparms:[]}");
      setEventMetadata("VALIDV_FORPRDUME","{handler:'validv_Forprdume',iparms:[]");
      setEventMetadata("VALIDV_FORPRDUME",",oparms:[]}");
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
      wcpOGx_mode = "" ;
      wcpOAV9EmprCod = "" ;
      wcpOAV6BarCodPar = "" ;
      wcpOAV32TotKgs = DecimalUtil.ZERO ;
      wcpOAV12FecPan = GXutil.nullDate() ;
      wcpOAV8Barnhdr = "" ;
      wcpOAV18ProForDsc = "" ;
      wcpOAV19Proforfab = "" ;
      Dvelop_confirmpanel_enter_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      AV9EmprCod = "" ;
      AV6BarCodPar = "" ;
      AV32TotKgs = DecimalUtil.ZERO ;
      AV12FecPan = GXutil.nullDate() ;
      AV8Barnhdr = "" ;
      AV18ProForDsc = "" ;
      AV19Proforfab = "" ;
      AV15modif2 = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV33UsurCod = "" ;
      AV29Station = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV31Totaldekilos = DecimalUtil.ZERO ;
      AV17PrdNom = "" ;
      AV55ForPrdDsccontrol = "" ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      A10881PrdLote = "" ;
      A718PrdNom = "" ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      A1643PrdTip = "" ;
      A488ForPrdDsc = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      lblTbmessage_Jsonclick = "" ;
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      AV27RecPrdNum = "" ;
      AV54VarPrompt = "" ;
      AV60Varprompt_GXI = "" ;
      sImgUrl = "" ;
      AV26RecPrdDsc = "" ;
      AV11FacCon = DecimalUtil.ZERO ;
      lblTextblockforprdume_Jsonclick = "" ;
      AV13ForPrdDsc = "" ;
      AV16PrdCant = DecimalUtil.ZERO ;
      AV24RecLote = "" ;
      AV25RecManAut = "" ;
      AV51PrdExiAlm = DecimalUtil.ZERO ;
      AV52PrdCanRes = DecimalUtil.ZERO ;
      AV41oldRecLote = "" ;
      AV42Cantold = DecimalUtil.ZERO ;
      AV43CanResold = DecimalUtil.ZERO ;
      AV44OldFaccon = DecimalUtil.ZERO ;
      bttBtnenter_Jsonclick = "" ;
      bttBtnlimpiar_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      WebComp_Wcrecetadetinte90__wc_Component = "" ;
      OldWcrecetadetinte90__wc = "" ;
      AV59Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      AV30TipodeProceso = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      hsh = "" ;
      AV10EmprNom = "" ;
      AV48NoCantidad = DecimalUtil.ZERO ;
      AV50modif = "" ;
      ucDvelop_confirmpanel_enter = new com.genexus.webpanels.GXUserControl();
      AV53PrdExiCC = DecimalUtil.ZERO ;
      GXv_int6 = new int[1] ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      GXv_char4 = new String[1] ;
      GXv_int9 = new byte[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_int8 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int15 = new byte[1] ;
      GXv_decimal17 = new java.math.BigDecimal[1] ;
      GXv_decimal18 = new java.math.BigDecimal[1] ;
      GXv_decimal19 = new java.math.BigDecimal[1] ;
      GXv_decimal20 = new java.math.BigDecimal[1] ;
      GXv_decimal21 = new java.math.BigDecimal[1] ;
      GXv_decimal22 = new java.math.BigDecimal[1] ;
      GXv_int10 = new short[1] ;
      GXt_char1 = "" ;
      GXv_char16 = new String[1] ;
      GXv_char14 = new String[1] ;
      GXv_char13 = new String[1] ;
      scmdbuf = "" ;
      H029G2_A490ForPrdUMe = new byte[1] ;
      H029G2_A396EmprCod = new String[] {""} ;
      H029G2_A488ForPrdDsc = new String[] {""} ;
      H029G2_n488ForPrdDsc = new boolean[] {false} ;
      H029G3_A719PrdNum = new String[] {""} ;
      H029G3_A396EmprCod = new String[] {""} ;
      H029G3_A10881PrdLote = new String[] {""} ;
      H029G3_A4338PrdUMeFo = new byte[1] ;
      H029G3_A718PrdNom = new String[] {""} ;
      H029G3_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H029G3_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H029G3_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H029G3_A1643PrdTip = new String[] {""} ;
      sStyleString = "" ;
      imgPrompt_forprdume_gximage = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.recetadetinte90__wp__default(),
         new Object[] {
             new Object[] {
            H029G2_A490ForPrdUMe, H029G2_A396EmprCod, H029G2_A488ForPrdDsc, H029G2_n488ForPrdDsc
            }
            , new Object[] {
            H029G3_A719PrdNum, H029G3_A396EmprCod, H029G3_A10881PrdLote, H029G3_A4338PrdUMeFo, H029G3_A718PrdNom, H029G3_A685PrdCanRes, H029G3_A704PrdExiAlm, H029G3_A705PrdExiCC, H029G3_A1643PrdTip
            }
         }
      );
      AV59Pgmname = "RecetadeTinte90__WP" ;
      /* GeneXus formulas. */
      AV59Pgmname = "RecetadeTinte90__WP" ;
      Gx_err = (short)(0) ;
      edtavProfordsc_Enabled = 0 ;
      edtavTotaldekilos_Enabled = 0 ;
      edtavVolumenreceta_Enabled = 0 ;
      edtavForprddsc_Enabled = 0 ;
      edtavPrdexialm_Enabled = 0 ;
      edtavPrdcanres_Enabled = 0 ;
      edtavOldreclote_Enabled = 0 ;
      edtavCantold_Enabled = 0 ;
      edtavCanresold_Enabled = 0 ;
      edtavOldfaccon_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
      imgPrompt_forprdume_Link = "javascript:"+"gx.popup.openPrompt('"+"app.formulaciontinte.tunmefoprompt"+"',["+"{Ctrl:gx.dom.el('"+"vEMPRCOD"+"'), id:'"+"vEMPRCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vFORPRDUME"+"'), id:'"+"vFORPRDUME"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vFORPRDDSC"+"'), id:'"+"vFORPRDDSC"+"'"+",IOType:'inout'}"+"],"+"null"+","+"'', false"+","+"false"+");" ;
      imgPrompt_forprdume_Link = "javascript:"+"gx.popup.openPrompt('"+"app.formulaciontinte.tunmefoprompt"+"',["+"{Ctrl:gx.dom.el('"+"vEMPRCOD"+"'), id:'"+"vEMPRCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vFORPRDUME"+"'), id:'"+"vFORPRDUME"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vFORPRDDSC"+"'), id:'"+"vFORPRDDSC"+"'"+",IOType:'inout'}"+"],"+"null"+","+"'', false"+","+"false"+");" ;
      WebComp_Wcrecetadetinte90__wc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte wcpOAV7BarCodReo ;
   private byte wcpOAV23RecLinPro ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV7BarCodReo ;
   private byte AV23RecLinPro ;
   private byte gxajaxcallmode ;
   private byte A4338PrdUMeFo ;
   private byte A490ForPrdUMe ;
   private byte AV20RecForNro ;
   private byte AV28RecPrdTnq ;
   private byte nDonePA ;
   private byte AV14ForPrdUMe ;
   private byte GXt_int7 ;
   private byte AV36Flag ;
   private byte AV37Valcod ;
   private byte GXv_int9[] ;
   private byte GXv_int8[] ;
   private byte GXv_int15[] ;
   private byte nGXWrapped ;
   private short wcpOAV22RecLinMaq ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV22RecLinMaq ;
   private short AV39ValCos ;
   private short AV49Moda21 ;
   private short AV40lrecet ;
   private short wbEnd ;
   private short wbStart ;
   private short AV21RecLin ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV47EliminarReceta ;
   private short GXv_int10[] ;
   private int wcpOAV5BarCod ;
   private int wcpOAV34Volumen ;
   private int AV5BarCod ;
   private int AV34Volumen ;
   private int AV35VolumenReceta ;
   private int edtavProfordsc_Enabled ;
   private int edtavTotaldekilos_Enabled ;
   private int edtavVolumenreceta_Enabled ;
   private int edtavReclin_Enabled ;
   private int edtavRecprdnum_Enabled ;
   private int edtavRecprddsc_Enabled ;
   private int edtavFaccon_Enabled ;
   private int edtavForprddsc_Enabled ;
   private int edtavPrdcant_Enabled ;
   private int edtavReclote_Enabled ;
   private int edtavRecfornro_Enabled ;
   private int edtavRecprdtnq_Enabled ;
   private int edtavRecmanaut_Enabled ;
   private int edtavPrdexialm_Enabled ;
   private int edtavPrdcanres_Enabled ;
   private int divUnnamedtable6_Visible ;
   private int edtavOldreclote_Enabled ;
   private int edtavCantold_Enabled ;
   private int edtavCanresold_Enabled ;
   private int edtavOldfaccon_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavTipodeproceso_Visible ;
   private int GXt_int5 ;
   private int GXv_int6[] ;
   private int edtavForprdume_Enabled ;
   private int idxLst ;
   private java.math.BigDecimal wcpOAV32TotKgs ;
   private java.math.BigDecimal AV32TotKgs ;
   private java.math.BigDecimal AV31Totaldekilos ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal AV11FacCon ;
   private java.math.BigDecimal AV16PrdCant ;
   private java.math.BigDecimal AV51PrdExiAlm ;
   private java.math.BigDecimal AV52PrdCanRes ;
   private java.math.BigDecimal AV42Cantold ;
   private java.math.BigDecimal AV43CanResold ;
   private java.math.BigDecimal AV44OldFaccon ;
   private java.math.BigDecimal AV48NoCantidad ;
   private java.math.BigDecimal AV53PrdExiCC ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal GXv_decimal17[] ;
   private java.math.BigDecimal GXv_decimal18[] ;
   private java.math.BigDecimal GXv_decimal19[] ;
   private java.math.BigDecimal GXv_decimal20[] ;
   private java.math.BigDecimal GXv_decimal21[] ;
   private java.math.BigDecimal GXv_decimal22[] ;
   private String wcpOGx_mode ;
   private String wcpOAV9EmprCod ;
   private String wcpOAV6BarCodPar ;
   private String wcpOAV8Barnhdr ;
   private String wcpOAV18ProForDsc ;
   private String wcpOAV19Proforfab ;
   private String Dvelop_confirmpanel_enter_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String AV9EmprCod ;
   private String AV6BarCodPar ;
   private String AV8Barnhdr ;
   private String AV18ProForDsc ;
   private String AV19Proforfab ;
   private String AV15modif2 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV33UsurCod ;
   private String AV29Station ;
   private String GXKey ;
   private String AV17PrdNom ;
   private String AV55ForPrdDsccontrol ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String A10881PrdLote ;
   private String A718PrdNom ;
   private String A1643PrdTip ;
   private String A488ForPrdDsc ;
   private String Dvpanel_tableattributes_Width ;
   private String Dvpanel_tableattributes_Cls ;
   private String Dvpanel_tableattributes_Title ;
   private String Dvpanel_tableattributes_Iconposition ;
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
   private String Dvelop_confirmpanel_enter_Title ;
   private String Dvelop_confirmpanel_enter_Confirmationtext ;
   private String Dvelop_confirmpanel_enter_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_enter_Nobuttoncaption ;
   private String Dvelop_confirmpanel_enter_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_enter_Yesbuttonposition ;
   private String Dvelop_confirmpanel_enter_Confirmtype ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_tableattributes_Internalname ;
   private String divTableattributes_Internalname ;
   private String divUnnamedtable7_Internalname ;
   private String edtavProfordsc_Internalname ;
   private String edtavProfordsc_Jsonclick ;
   private String edtavTotaldekilos_Internalname ;
   private String TempTags ;
   private String edtavTotaldekilos_Jsonclick ;
   private String edtavVolumenreceta_Internalname ;
   private String edtavVolumenreceta_Jsonclick ;
   private String lblTbmessage_Internalname ;
   private String lblTbmessage_Caption ;
   private String lblTbmessage_Jsonclick ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String edtavReclin_Internalname ;
   private String edtavReclin_Jsonclick ;
   private String edtavRecprdnum_Internalname ;
   private String AV27RecPrdNum ;
   private String edtavRecprdnum_Jsonclick ;
   private String imgavVarprompt_Internalname ;
   private String imgavVarprompt_gximage ;
   private String sImgUrl ;
   private String imgavVarprompt_Jsonclick ;
   private String edtavRecprddsc_Internalname ;
   private String AV26RecPrdDsc ;
   private String edtavRecprddsc_Jsonclick ;
   private String edtavFaccon_Internalname ;
   private String edtavFaccon_Jsonclick ;
   private String divTablesplittedforprdume_Internalname ;
   private String lblTextblockforprdume_Internalname ;
   private String lblTextblockforprdume_Jsonclick ;
   private String edtavForprddsc_Internalname ;
   private String AV13ForPrdDsc ;
   private String edtavForprddsc_Jsonclick ;
   private String edtavPrdcant_Internalname ;
   private String edtavPrdcant_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
   private String edtavReclote_Internalname ;
   private String AV24RecLote ;
   private String edtavReclote_Jsonclick ;
   private String edtavRecfornro_Internalname ;
   private String edtavRecfornro_Jsonclick ;
   private String edtavRecprdtnq_Internalname ;
   private String edtavRecprdtnq_Jsonclick ;
   private String edtavRecmanaut_Internalname ;
   private String AV25RecManAut ;
   private String edtavRecmanaut_Jsonclick ;
   private String edtavPrdexialm_Internalname ;
   private String edtavPrdexialm_Jsonclick ;
   private String edtavPrdcanres_Internalname ;
   private String edtavPrdcanres_Jsonclick ;
   private String divUnnamedtable6_Internalname ;
   private String edtavOldreclote_Internalname ;
   private String AV41oldRecLote ;
   private String edtavOldreclote_Jsonclick ;
   private String edtavCantold_Internalname ;
   private String edtavCantold_Jsonclick ;
   private String edtavCanresold_Internalname ;
   private String edtavCanresold_Jsonclick ;
   private String edtavOldfaccon_Internalname ;
   private String edtavOldfaccon_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtnlimpiar_Internalname ;
   private String bttBtnlimpiar_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String WebComp_Wcrecetadetinte90__wc_Component ;
   private String OldWcrecetadetinte90__wc ;
   private String edtavPgmname_Internalname ;
   private String AV59Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavTipodeproceso_Internalname ;
   private String AV30TipodeProceso ;
   private String edtavTipodeproceso_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String imgPrompt_forprdume_Link ;
   private String imgPrompt_forprdume_Internalname ;
   private String edtavForprdume_Internalname ;
   private String hsh ;
   private String AV10EmprNom ;
   private String AV50modif ;
   private String Dvelop_confirmpanel_enter_Internalname ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXt_char1 ;
   private String GXv_char16[] ;
   private String GXv_char14[] ;
   private String GXv_char13[] ;
   private String scmdbuf ;
   private String sStyleString ;
   private String tblTabledvelop_confirmpanel_enter_Internalname ;
   private String tblTablemergedforprdume_Internalname ;
   private String edtavForprdume_Jsonclick ;
   private String imgPrompt_forprdume_gximage ;
   private java.util.Date wcpOAV12FecPan ;
   private java.util.Date AV12FecPan ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Dvpanel_unnamedtable2_Autowidth ;
   private boolean Dvpanel_unnamedtable2_Autoheight ;
   private boolean Dvpanel_unnamedtable2_Collapsible ;
   private boolean Dvpanel_unnamedtable2_Collapsed ;
   private boolean Dvpanel_unnamedtable2_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable2_Autoscroll ;
   private boolean wbLoad ;
   private boolean AV54VarPrompt_IsBlob ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean bDynCreated_Wcrecetadetinte90__wc ;
   private boolean n488ForPrdDsc ;
   private String AV60Varprompt_GXI ;
   private String AV54VarPrompt ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wcrecetadetinte90__wc ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_enter ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private byte[] H029G2_A490ForPrdUMe ;
   private String[] H029G2_A396EmprCod ;
   private String[] H029G2_A488ForPrdDsc ;
   private boolean[] H029G2_n488ForPrdDsc ;
   private String[] H029G3_A719PrdNum ;
   private String[] H029G3_A396EmprCod ;
   private String[] H029G3_A10881PrdLote ;
   private byte[] H029G3_A4338PrdUMeFo ;
   private String[] H029G3_A718PrdNom ;
   private java.math.BigDecimal[] H029G3_A685PrdCanRes ;
   private java.math.BigDecimal[] H029G3_A704PrdExiAlm ;
   private java.math.BigDecimal[] H029G3_A705PrdExiCC ;
   private String[] H029G3_A1643PrdTip ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class recetadetinte90__wp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H029G2", "SELECT ForPrdUMe, EmprCod, ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? and ForPrdUMe = ? ORDER BY EmprCod, ForPrdUMe ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H029G3", "SELECT PrdNum, EmprCod, PrdLote, PrdUMeFo, PrdNom, PrdCanRes, PrdExiAlm, PrdExiCC, PrdTip FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 5);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,4);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
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
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

