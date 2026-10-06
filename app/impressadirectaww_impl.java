package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class impressadirectaww_impl extends GXDataArea
{
   public impressadirectaww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public impressadirectaww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( impressadirectaww_impl.class ));
   }

   public impressadirectaww_impl( int remoteHandle ,
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
            AV38emprcod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38emprcod", AV38emprcod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV38emprcod, "@!"))));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV6AlbProCodfrom = GXutil.lval( httpContext.GetPar( "AlbProCodfrom")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV6AlbProCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6AlbProCodfrom), 10, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROCODFROM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV6AlbProCodfrom), "ZZZZZZZZZ9")));
               AV7AlbProCodto = GXutil.lval( httpContext.GetPar( "AlbProCodto")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7AlbProCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7AlbProCodto), 10, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROCODTO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7AlbProCodto), "ZZZZZZZZZ9")));
               AV9AlbProfchfrom = localUtil.parseDateParm( httpContext.GetPar( "AlbProfchfrom")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9AlbProfchfrom", localUtil.format(AV9AlbProfchfrom, "99/99/99"));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROFCHFROM", getSecureSignedToken( "", AV9AlbProfchfrom));
               AV10AlbProfchto = localUtil.parseDateParm( httpContext.GetPar( "AlbProfchto")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10AlbProfchto", localUtil.format(AV10AlbProfchto, "99/99/99"));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROFCHTO", getSecureSignedToken( "", AV10AlbProfchto));
               AV12CliCodfrom = (int)(GXutil.lval( httpContext.GetPar( "CliCodfrom"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV12CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12CliCodfrom), 6, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICODFROM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV12CliCodfrom), "ZZZZZ9")));
               AV14CliCodto = (int)(GXutil.lval( httpContext.GetPar( "CliCodto"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14CliCodto), 6, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICODTO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV14CliCodto), "ZZZZZ9")));
               AV32PRIO = httpContext.GetPar( "PRIO") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV32PRIO", AV32PRIO);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRIO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32PRIO, "9"))));
               AV30ManAut = httpContext.GetPar( "ManAut") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV30ManAut", AV30ManAut);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMANAUT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV30ManAut, ""))));
               AV37VerMail = GXutil.strtobool( httpContext.GetPar( "VerMail")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV37VerMail", AV37VerMail);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVERMAIL", getSecureSignedToken( "", AV37VerMail));
               AV25Copias2 = (short)(GXutil.lval( httpContext.GetPar( "Copias2"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV25Copias2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25Copias2), 4, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCOPIAS2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV25Copias2), "ZZZ9")));
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
      pa28P2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start28P2( ) ;
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
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = ((nGXWrapped==0) ? " data-HasEnter=\"false\" data-Skiponenter=\"false\"" : "") ;
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
      if ( nGXWrapped != 1 )
      {
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.impressadirectaww", new String[] {GXutil.URLEncode(GXutil.rtrim(AV38emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV6AlbProCodfrom,10,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7AlbProCodto,10,0)),GXutil.URLEncode(GXutil.formatDateParm(AV9AlbProfchfrom)),GXutil.URLEncode(GXutil.formatDateParm(AV10AlbProfchto)),GXutil.URLEncode(GXutil.ltrimstr(AV12CliCodfrom,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV14CliCodto,6,0)),GXutil.URLEncode(GXutil.rtrim(AV32PRIO)),GXutil.URLEncode(GXutil.rtrim(AV30ManAut)),GXutil.URLEncode(GXutil.booltostr(AV37VerMail)),GXutil.URLEncode(GXutil.ltrimstr(AV25Copias2,4,0))}, new String[] {"emprcod","AlbProCodfrom","AlbProCodto","AlbProfchfrom","AlbProfchto","CliCodfrom","CliCodto","PRIO","ManAut","VerMail","Copias2"}) +"\">") ;
         app.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
         app.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
         app.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
         httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:block;height:0;border:0;padding:0\" disabled>") ;
         httpContext.ajax_rsp_assign_prop("", false, "FORM", "Class", "form-horizontal Form", true);
      }
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
   }

   public void send_integrity_footer_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV38emprcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROCODFROM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV6AlbProCodfrom), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROCODTO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7AlbProCodto), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROFCHFROM", getSecureSignedToken( "", AV9AlbProfchfrom));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROFCHTO", getSecureSignedToken( "", AV10AlbProfchto));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICODFROM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV12CliCodfrom), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICODTO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV14CliCodto), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRIO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32PRIO, "9"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMANAUT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV30ManAut, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVERMAIL", getSecureSignedToken( "", AV37VerMail));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCOPIAS2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV25Copias2), "ZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV38emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV38emprcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROCODFROM", GXutil.ltrim( localUtil.ntoc( AV6AlbProCodfrom, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROCODFROM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV6AlbProCodfrom), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROCODTO", GXutil.ltrim( localUtil.ntoc( AV7AlbProCodto, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROCODTO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7AlbProCodto), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROFCHFROM", localUtil.dtoc( AV9AlbProfchfrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROFCHFROM", getSecureSignedToken( "", AV9AlbProfchfrom));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROFCHTO", localUtil.dtoc( AV10AlbProfchto, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROFCHTO", getSecureSignedToken( "", AV10AlbProfchto));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICODFROM", GXutil.ltrim( localUtil.ntoc( AV12CliCodfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICODFROM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV12CliCodfrom), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICODTO", GXutil.ltrim( localUtil.ntoc( AV14CliCodto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICODTO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV14CliCodto), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRIO", GXutil.rtrim( AV32PRIO));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRIO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32PRIO, "9"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMANAUT", GXutil.rtrim( AV30ManAut));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMANAUT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV30ManAut, ""))));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vVERMAIL", AV37VerMail);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVERMAIL", getSecureSignedToken( "", AV37VerMail));
      app.GxWebStd.gx_hidden_field( httpContext, "vCOPIAS2", GXutil.ltrim( localUtil.ntoc( AV25Copias2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCOPIAS2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV25Copias2), "ZZZ9")));
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
      if ( nGXWrapped != 1 )
      {
         httpContext.writeTextNL( "</form>") ;
      }
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
   }

   public void renderHtmlContent( )
   {
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         httpContext.writeText( "<div") ;
         app.GxWebStd.classAttribute( httpContext, "gx-ct-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
         httpContext.writeText( ">") ;
         we28P2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt28P2( ) ;
   }

   public boolean hasEnterEvent( )
   {
      return false ;
   }

   public com.genexus.webpanels.GXWebForm getForm( )
   {
      return Form ;
   }

   public String getSelfLink( )
   {
      return formatLink("app.impressadirectaww", new String[] {GXutil.URLEncode(GXutil.rtrim(AV38emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV6AlbProCodfrom,10,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7AlbProCodto,10,0)),GXutil.URLEncode(GXutil.formatDateParm(AV9AlbProfchfrom)),GXutil.URLEncode(GXutil.formatDateParm(AV10AlbProfchto)),GXutil.URLEncode(GXutil.ltrimstr(AV12CliCodfrom,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV14CliCodto,6,0)),GXutil.URLEncode(GXutil.rtrim(AV32PRIO)),GXutil.URLEncode(GXutil.rtrim(AV30ManAut)),GXutil.URLEncode(GXutil.booltostr(AV37VerMail)),GXutil.URLEncode(GXutil.ltrimstr(AV25Copias2,4,0))}, new String[] {"emprcod","AlbProCodfrom","AlbProCodto","AlbProfchfrom","AlbProfchto","CliCodfrom","CliCodto","PRIO","ManAut","VerMail","Copias2"})  ;
   }

   public String getPgmname( )
   {
      return "ImpressaDirectaww" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Impressa Directaww", "") ;
   }

   public void wb28P0( )
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
         app.GxWebStd.gx_div_start( httpContext, divMaintable_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start28P2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Impressa Directaww", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup28P0( ) ;
   }

   public void ws28P2( )
   {
      start28P2( ) ;
      evt28P2( ) ;
   }

   public void evt28P2( )
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
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Start */
                           e1128P2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e1228P2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ! wbErr )
                           {
                              Rfr0gs = false ;
                              if ( ! Rfr0gs )
                              {
                              }
                              dynload_actions( ) ;
                           }
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
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we28P2( )
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

   public void pa28P2( )
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
      rf28P2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   public void rf28P2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e1228P2 ();
         wb28P0( ) ;
      }
   }

   public void send_integrity_lvl_hashes28P2( )
   {
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strup28P0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1128P2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         /* Read variables values. */
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e1128P2 ();
      if (returnInSub) return;
   }

   public void e1128P2( )
   {
      /* Start Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.documentotransporteproduccion.impresionguiasdirecto", new String[] {GXutil.URLEncode(GXutil.rtrim(AV38emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV6AlbProCodfrom,10,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7AlbProCodto,10,0)),GXutil.URLEncode(GXutil.formatDateParm(AV9AlbProfchfrom)),GXutil.URLEncode(GXutil.formatDateParm(AV10AlbProfchto)),GXutil.URLEncode(GXutil.ltrimstr(AV12CliCodfrom,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV14CliCodto,6,0)),GXutil.URLEncode(GXutil.rtrim(AV32PRIO)),GXutil.URLEncode(GXutil.rtrim(AV30ManAut)),GXutil.URLEncode(GXutil.booltostr(AV37VerMail)),GXutil.URLEncode(GXutil.ltrimstr(AV25Copias2,4,0))}, new String[] {"emprcod","AlbProCodfrom","AlbProCodto","AlbProfchfrom","AlbProfchto","Clicodfrom","Clicodto","prio","ManAut","VerMail","Copias2"}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   protected void nextLoad( )
   {
   }

   protected void e1228P2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV38emprcod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38emprcod", AV38emprcod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV38emprcod, "@!"))));
      AV6AlbProCodfrom = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6AlbProCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6AlbProCodfrom), 10, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROCODFROM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV6AlbProCodfrom), "ZZZZZZZZZ9")));
      AV7AlbProCodto = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7AlbProCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7AlbProCodto), 10, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROCODTO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7AlbProCodto), "ZZZZZZZZZ9")));
      AV9AlbProfchfrom = (java.util.Date)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9AlbProfchfrom", localUtil.format(AV9AlbProfchfrom, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROFCHFROM", getSecureSignedToken( "", AV9AlbProfchfrom));
      AV10AlbProfchto = (java.util.Date)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10AlbProfchto", localUtil.format(AV10AlbProfchto, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROFCHTO", getSecureSignedToken( "", AV10AlbProfchto));
      AV12CliCodfrom = ((Number) GXutil.testNumericType( getParm(obj,5), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12CliCodfrom), 6, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICODFROM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV12CliCodfrom), "ZZZZZ9")));
      AV14CliCodto = ((Number) GXutil.testNumericType( getParm(obj,6), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14CliCodto), 6, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICODTO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV14CliCodto), "ZZZZZ9")));
      AV32PRIO = (String)getParm(obj,7) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32PRIO", AV32PRIO);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRIO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32PRIO, "9"))));
      AV30ManAut = (String)getParm(obj,8) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30ManAut", AV30ManAut);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMANAUT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV30ManAut, ""))));
      AV37VerMail = ((Boolean) getParm(obj,9)).booleanValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37VerMail", AV37VerMail);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVERMAIL", getSecureSignedToken( "", AV37VerMail));
      AV25Copias2 = ((Number) GXutil.testNumericType( getParm(obj,10), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Copias2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25Copias2), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCOPIAS2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV25Copias2), "ZZZ9")));
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
      pa28P2( ) ;
      ws28P2( ) ;
      we28P2( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202681714202492", true, true);
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
      if ( nGXWrapped != 1 )
      {
         httpContext.AddJavascriptSource("messages."+httpContext.getLanguageProperty( "code")+".js", "?"+httpContext.getCacheInvalidationToken( ), false, true);
         httpContext.AddJavascriptSource("impressadirectaww.js", "?202681714202493", false, true);
      }
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      divMaintable_Internalname = "MAINTABLE" ;
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
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Impressa Directaww", "") );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV38emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV6AlbProCodfrom',fld:'vALBPROCODFROM',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV7AlbProCodto',fld:'vALBPROCODTO',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV9AlbProfchfrom',fld:'vALBPROFCHFROM',pic:'',hsh:true},{av:'AV10AlbProfchto',fld:'vALBPROFCHTO',pic:'',hsh:true},{av:'AV12CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9',hsh:true},{av:'AV14CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9',hsh:true},{av:'AV32PRIO',fld:'vPRIO',pic:'9',hsh:true},{av:'AV30ManAut',fld:'vMANAUT',pic:'',hsh:true},{av:'AV37VerMail',fld:'vVERMAIL',pic:'',hsh:true},{av:'AV25Copias2',fld:'vCOPIAS2',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
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
      wcpOAV38emprcod = "" ;
      wcpOAV9AlbProfchfrom = GXutil.nullDate() ;
      wcpOAV10AlbProfchto = GXutil.nullDate() ;
      wcpOAV32PRIO = "" ;
      wcpOAV30ManAut = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV38emprcod = "" ;
      AV9AlbProfchfrom = GXutil.nullDate() ;
      AV10AlbProfchto = GXutil.nullDate() ;
      AV32PRIO = "" ;
      AV30ManAut = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nGXWrapped ;
   private byte nDonePA ;
   private short wcpOAV25Copias2 ;
   private short AV25Copias2 ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV12CliCodfrom ;
   private int wcpOAV14CliCodto ;
   private int AV12CliCodfrom ;
   private int AV14CliCodto ;
   private int idxLst ;
   private long wcpOAV6AlbProCodfrom ;
   private long wcpOAV7AlbProCodto ;
   private long AV6AlbProCodfrom ;
   private long AV7AlbProCodto ;
   private String wcpOAV38emprcod ;
   private String wcpOAV32PRIO ;
   private String wcpOAV30ManAut ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV38emprcod ;
   private String AV32PRIO ;
   private String AV30ManAut ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divMaintable_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private java.util.Date wcpOAV9AlbProfchfrom ;
   private java.util.Date wcpOAV10AlbProfchto ;
   private java.util.Date AV9AlbProfchfrom ;
   private java.util.Date AV10AlbProfchto ;
   private boolean wcpOAV37VerMail ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV37VerMail ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXWebForm Form ;
}

