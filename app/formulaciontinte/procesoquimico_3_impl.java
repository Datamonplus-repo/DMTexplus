package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class procesoquimico_3_impl extends GXDataArea
{
   public procesoquimico_3_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public procesoquimico_3_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( procesoquimico_3_impl.class ));
   }

   public procesoquimico_3_impl( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavGridactions = new HTMLChoice();
   }

   public void initweb( )
   {
      initialize_properties( ) ;
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
            AV7Emprcod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7Emprcod", AV7Emprcod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV8ProForCod = httpContext.GetPar( "ProForCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8ProForCod", AV8ProForCod);
               AV9ProForDsc = httpContext.GetPar( "ProForDsc") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9ProForDsc", AV9ProForDsc);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROFORDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9ProForDsc, ""))));
               AV10ProForDsc2 = httpContext.GetPar( "ProForDsc2") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10ProForDsc2", AV10ProForDsc2);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROFORDSC2", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10ProForDsc2, ""))));
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

   public void gxnrgrid_newrow_invoke( )
   {
      nRC_GXsfl_48 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_48"))) ;
      nGXsfl_48_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_48_idx"))) ;
      sGXsfl_48_idx = httpContext.GetPar( "sGXsfl_48_idx") ;
      edtProForClv_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForClv_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForClv_Visible), 5, 0), !bGXsfl_48_Refreshing);
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
      AV8ProForCod = httpContext.GetPar( "ProForCod") ;
      AV19TFProForLin = (short)(GXutil.lval( httpContext.GetPar( "TFProForLin"))) ;
      AV20TFProForLin_To = (short)(GXutil.lval( httpContext.GetPar( "TFProForLin_To"))) ;
      AV21TFProForPrd = httpContext.GetPar( "TFProForPrd") ;
      AV22TFProForPrd_Sel = httpContext.GetPar( "TFProForPrd_Sel") ;
      AV23TFProForDes = httpContext.GetPar( "TFProForDes") ;
      AV24TFProForDes_Sel = httpContext.GetPar( "TFProForDes_Sel") ;
      AV29TFProForCan = CommonUtil.decimalVal( httpContext.GetPar( "TFProForCan"), ".") ;
      AV30TFProForCan_To = CommonUtil.decimalVal( httpContext.GetPar( "TFProForCan_To"), ".") ;
      AV27TFForPrdDsc = httpContext.GetPar( "TFForPrdDsc") ;
      AV28TFForPrdDsc_Sel = httpContext.GetPar( "TFForPrdDsc_Sel") ;
      AV31TFProForNro = (byte)(GXutil.lval( httpContext.GetPar( "TFProForNro"))) ;
      AV32TFProForNro_To = (byte)(GXutil.lval( httpContext.GetPar( "TFProForNro_To"))) ;
      AV33TFProForTnq = (byte)(GXutil.lval( httpContext.GetPar( "TFProForTnq"))) ;
      AV34TFProForTnq_To = (byte)(GXutil.lval( httpContext.GetPar( "TFProForTnq_To"))) ;
      AV35TFProForCla = httpContext.GetPar( "TFProForCla") ;
      AV36TFProForCla_Sel = httpContext.GetPar( "TFProForCla_Sel") ;
      AV37TFProForClv = httpContext.GetPar( "TFProForClv") ;
      AV38TFProForClv_Sel = httpContext.GetPar( "TFProForClv_Sel") ;
      AV50Pgmname = httpContext.GetPar( "Pgmname") ;
      AV16OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV17OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV9ProForDsc = httpContext.GetPar( "ProForDsc") ;
      AV10ProForDsc2 = httpContext.GetPar( "ProForDsc2") ;
      edtProForClv_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForClv_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForClv_Visible), 5, 0), !bGXsfl_48_Refreshing);
      AV46Usurcod = httpContext.GetPar( "Usurcod") ;
      AV45Station = httpContext.GetPar( "Station") ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A764ProForCod = httpContext.GetPar( "ProForCod") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV7Emprcod, AV8ProForCod, AV19TFProForLin, AV20TFProForLin_To, AV21TFProForPrd, AV22TFProForPrd_Sel, AV23TFProForDes, AV24TFProForDes_Sel, AV29TFProForCan, AV30TFProForCan_To, AV27TFForPrdDsc, AV28TFForPrdDsc_Sel, AV31TFProForNro, AV32TFProForNro_To, AV33TFProForTnq, AV34TFProForTnq_To, AV35TFProForCla, AV36TFProForCla_Sel, AV37TFProForClv, AV38TFProForClv_Sel, AV50Pgmname, AV16OrderedBy, AV17OrderedDsc, AV9ProForDsc, AV10ProForDsc2, AV46Usurcod, AV45Station, A396EmprCod, A764ProForCod) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
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
      pa1WR2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1WR2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"false\" data-Skiponenter=\"false\"" ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.procesoquimico_3", new String[] {GXutil.URLEncode(GXutil.rtrim(AV7Emprcod)),GXutil.URLEncode(GXutil.rtrim(AV8ProForCod)),GXutil.URLEncode(GXutil.rtrim(AV9ProForDsc)),GXutil.URLEncode(GXutil.rtrim(AV10ProForDsc2))}, new String[] {"Emprcod","ProForCod","ProForDsc","ProForDsc2"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROFORDSC2", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10ProForDsc2, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PROFORCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A764ProForCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV46Usurcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV45Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROFORDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9ProForDsc, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"ProcesoQuimico_3");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV50Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("formulaciontinte\\procesoquimico_3:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_48", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_48, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV39DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV39DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROFORLIN", GXutil.ltrim( localUtil.ntoc( AV19TFProForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROFORLIN_TO", GXutil.ltrim( localUtil.ntoc( AV20TFProForLin_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROFORPRD", GXutil.rtrim( AV21TFProForPrd));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROFORPRD_SEL", GXutil.rtrim( AV22TFProForPrd_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROFORDES", GXutil.rtrim( AV23TFProForDes));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROFORDES_SEL", GXutil.rtrim( AV24TFProForDes_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROFORCAN", GXutil.ltrim( localUtil.ntoc( AV29TFProForCan, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROFORCAN_TO", GXutil.ltrim( localUtil.ntoc( AV30TFProForCan_To, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORPRDDSC", GXutil.rtrim( AV27TFForPrdDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORPRDDSC_SEL", GXutil.rtrim( AV28TFForPrdDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROFORNRO", GXutil.ltrim( localUtil.ntoc( AV31TFProForNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROFORNRO_TO", GXutil.ltrim( localUtil.ntoc( AV32TFProForNro_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROFORTNQ", GXutil.ltrim( localUtil.ntoc( AV33TFProForTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROFORTNQ_TO", GXutil.ltrim( localUtil.ntoc( AV34TFProForTnq_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROFORCLA", GXutil.rtrim( AV35TFProForCla));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROFORCLA_SEL", GXutil.rtrim( AV36TFProForCla_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROFORCLV", GXutil.rtrim( AV37TFProForClv));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROFORCLV_SEL", GXutil.rtrim( AV38TFProForClv_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV16OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV17OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV7Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "vPROFORDSC2", GXutil.rtrim( AV10ProForDsc2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROFORDSC2", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10ProForDsc2, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORCOD", GXutil.rtrim( A764ProForCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PROFORCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A764ProForCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV46Usurcod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV46Usurcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV45Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV45Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Width", GXutil.rtrim( Dvpanel_tableheader_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Autowidth", GXutil.booltostr( Dvpanel_tableheader_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Autoheight", GXutil.booltostr( Dvpanel_tableheader_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Cls", GXutil.rtrim( Dvpanel_tableheader_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Title", GXutil.rtrim( Dvpanel_tableheader_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Collapsible", GXutil.booltostr( Dvpanel_tableheader_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Collapsed", GXutil.booltostr( Dvpanel_tableheader_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Showcollapseicon", GXutil.booltostr( Dvpanel_tableheader_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Iconposition", GXutil.rtrim( Dvpanel_tableheader_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Autoscroll", GXutil.booltostr( Dvpanel_tableheader_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Caption", GXutil.rtrim( Ddo_grid_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_set", GXutil.rtrim( Ddo_grid_Filteredtext_set));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_set", GXutil.rtrim( Ddo_grid_Filteredtextto_set));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_set", GXutil.rtrim( Ddo_grid_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includesortasc", GXutil.rtrim( Ddo_grid_Includesortasc));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filterisrange", GXutil.rtrim( Ddo_grid_Filterisrange));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includedatalist", GXutil.rtrim( Ddo_grid_Includedatalist));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalisttype", GXutil.rtrim( Ddo_grid_Datalisttype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Infinitescrolling", GXutil.rtrim( Grid_empowerer_Infinitescrolling));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Fixedcolumns", GXutil.rtrim( Grid_empowerer_Fixedcolumns));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORCLV_Visible", GXutil.ltrim( localUtil.ntoc( edtProForClv_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
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
         we1WR2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1WR2( ) ;
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
      return formatLink("app.formulaciontinte.procesoquimico_3", new String[] {GXutil.URLEncode(GXutil.rtrim(AV7Emprcod)),GXutil.URLEncode(GXutil.rtrim(AV8ProForCod)),GXutil.URLEncode(GXutil.rtrim(AV9ProForDsc)),GXutil.URLEncode(GXutil.rtrim(AV10ProForDsc2))}, new String[] {"Emprcod","ProForCod","ProForDsc","ProForDsc2"})  ;
   }

   public String getPgmname( )
   {
      return "FormulacionTinte.ProcesoQuimico_3" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Proceso Quimico (Lineas)", "") ;
   }

   public void wb1WR0( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         ucDvpanel_tableheader.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tableheader_Internalname, "DVPANEL_TABLEHEADERContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_TABLEHEADERContainer"+"TableHeader"+"\" style=\"display:none;\">") ;
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 48, 2, 0)+","+"null"+");", httpContext.getMessage( "GXM_insert", ""), bttBtninsert_Jsonclick, 5, httpContext.getMessage( "GXM_insert", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\ProcesoQuimico_3.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnrenumerar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 48, 2, 0)+","+"null"+");", httpContext.getMessage( "Renumerar Lineas", ""), bttBtnrenumerar_Jsonclick, 5, httpContext.getMessage( "Renumerar Lineas", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DORENUMERAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\ProcesoQuimico_3.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_24_1WR2( true) ;
      }
      else
      {
         wb_table1_24_1WR2( false) ;
      }
      return  ;
   }

   public void wb_table1_24_1WR2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtableproforcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockproforcod_Internalname, httpContext.getMessage( "Proceso", ""), "", "", lblTextblockproforcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\ProcesoQuimico_3.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavProforcod_Internalname, httpContext.getMessage( "Pro For Cod", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavProforcod_Internalname, GXutil.rtrim( AV8ProForCod), GXutil.rtrim( localUtil.format( AV8ProForCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavProforcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavProforcod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ProcesoQuimico_3.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtableprofordsc_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockprofordsc_Internalname, httpContext.getMessage( "Descripcion", ""), "", "", lblTextblockprofordsc_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\ProcesoQuimico_3.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavProfordsc_Internalname, httpContext.getMessage( "Pro For Dsc", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavProfordsc_Internalname, GXutil.rtrim( AV9ProForDsc), GXutil.rtrim( localUtil.format( AV9ProForDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavProfordsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavProfordsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ProcesoQuimico_3.htm");
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
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell HasGridEmpowerer", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol48( ) ;
      }
      if ( wbEnd == 48 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_48 = (int)(nGXsfl_48_idx-1) ;
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
            httpContext.writeText( "<div id=\""+"GridContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Grid", GridContainer, subGrid_Internalname);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "GridContainerData", GridContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "GridContainerData"+"V", GridContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"GridContainerData"+"V"+"\" value='"+GridContainer.GridValuesHidden()+"'/>") ;
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV50Pgmname), GXutil.rtrim( localUtil.format( AV50Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ProcesoQuimico_3.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV39DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("InfiniteScrolling", Grid_empowerer_Infinitescrolling);
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 48 )
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
               httpContext.writeText( "<div id=\""+"GridContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid("_"+"Grid", GridContainer, subGrid_Internalname);
               if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "GridContainerData", GridContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "GridContainerData"+"V", GridContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"GridContainerData"+"V"+"\" value='"+GridContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void start1WR2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Proceso Quimico (Lineas)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1WR0( ) ;
   }

   public void ws1WR2( )
   {
      start1WR2( ) ;
      evt1WR2( ) ;
   }

   public void evt1WR2( )
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
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e111WR2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInsert' */
                           e121WR2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DORENUMERAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoRenumerar' */
                           e131WR2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           AV52Formulaciontinte_procesoquimico_3ds_1_tfproforlin = AV19TFProForLin ;
                           AV53Formulaciontinte_procesoquimico_3ds_2_tfproforlin_to = AV20TFProForLin_To ;
                           AV54Formulaciontinte_procesoquimico_3ds_3_tfproforprd = AV21TFProForPrd ;
                           AV55Formulaciontinte_procesoquimico_3ds_4_tfproforprd_sel = AV22TFProForPrd_Sel ;
                           AV56Formulaciontinte_procesoquimico_3ds_5_tfprofordes = AV23TFProForDes ;
                           AV57Formulaciontinte_procesoquimico_3ds_6_tfprofordes_sel = AV24TFProForDes_Sel ;
                           AV58Formulaciontinte_procesoquimico_3ds_7_tfproforcan = AV29TFProForCan ;
                           AV59Formulaciontinte_procesoquimico_3ds_8_tfproforcan_to = AV30TFProForCan_To ;
                           AV60Formulaciontinte_procesoquimico_3ds_9_tfforprddsc = AV27TFForPrdDsc ;
                           AV61Formulaciontinte_procesoquimico_3ds_10_tfforprddsc_sel = AV28TFForPrdDsc_Sel ;
                           AV62Formulaciontinte_procesoquimico_3ds_11_tfprofornro = AV31TFProForNro ;
                           AV63Formulaciontinte_procesoquimico_3ds_12_tfprofornro_to = AV32TFProForNro_To ;
                           AV64Formulaciontinte_procesoquimico_3ds_13_tfprofortnq = AV33TFProForTnq ;
                           AV65Formulaciontinte_procesoquimico_3ds_14_tfprofortnq_to = AV34TFProForTnq_To ;
                           AV66Formulaciontinte_procesoquimico_3ds_15_tfproforcla = AV35TFProForCla ;
                           AV67Formulaciontinte_procesoquimico_3ds_16_tfproforcla_sel = AV36TFProForCla_Sel ;
                           AV68Formulaciontinte_procesoquimico_3ds_17_tfproforclv = AV37TFProForClv ;
                           AV69Formulaciontinte_procesoquimico_3ds_18_tfproforclv_sel = AV38TFProForClv_Sel ;
                           sEvt = httpContext.cgiGet( "GRIDPAGING") ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 18), "VGRIDACTIONS.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 18), "VGRIDACTIONS.CLICK") == 0 ) )
                        {
                           nGXsfl_48_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_48_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_48_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_482( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV43GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43GridActions), 4, 0));
                           A767ProForLin = (short)(localUtil.ctol( httpContext.cgiGet( edtProForLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A770ProForPrd = httpContext.cgiGet( edtProForPrd_Internalname) ;
                           A765ProForDes = httpContext.cgiGet( edtProForDes_Internalname) ;
                           A762ProForCan = localUtil.ctond( httpContext.cgiGet( edtProForCan_Internalname)) ;
                           A488ForPrdDsc = httpContext.cgiGet( edtForPrdDsc_Internalname) ;
                           n488ForPrdDsc = false ;
                           A1645ProForNro = (byte)(localUtil.ctol( httpContext.cgiGet( edtProForNro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A3379ProForTnq = (byte)(localUtil.ctol( httpContext.cgiGet( edtProForTnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A763ProForCla = httpContext.cgiGet( edtProForCla_Internalname) ;
                           A5358ProForClv = httpContext.cgiGet( edtProForClv_Internalname) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e141WR2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e151WR2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e161WR2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONS.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e171WR2 ();
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

   public void we1WR2( )
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

   public void pa1WR2( )
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

   public void gxnrgrid_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_482( ) ;
      while ( nGXsfl_48_idx <= nRC_GXsfl_48 )
      {
         sendrow_482( ) ;
         nGXsfl_48_idx = ((subGrid_Islastpage==1)&&(nGXsfl_48_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_48_idx+1) ;
         sGXsfl_48_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_48_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_482( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV7Emprcod ,
                                 String AV8ProForCod ,
                                 short AV19TFProForLin ,
                                 short AV20TFProForLin_To ,
                                 String AV21TFProForPrd ,
                                 String AV22TFProForPrd_Sel ,
                                 String AV23TFProForDes ,
                                 String AV24TFProForDes_Sel ,
                                 java.math.BigDecimal AV29TFProForCan ,
                                 java.math.BigDecimal AV30TFProForCan_To ,
                                 String AV27TFForPrdDsc ,
                                 String AV28TFForPrdDsc_Sel ,
                                 byte AV31TFProForNro ,
                                 byte AV32TFProForNro_To ,
                                 byte AV33TFProForTnq ,
                                 byte AV34TFProForTnq_To ,
                                 String AV35TFProForCla ,
                                 String AV36TFProForCla_Sel ,
                                 String AV37TFProForClv ,
                                 String AV38TFProForClv_Sel ,
                                 String AV50Pgmname ,
                                 short AV16OrderedBy ,
                                 boolean AV17OrderedDsc ,
                                 String AV9ProForDsc ,
                                 String AV10ProForDsc2 ,
                                 String AV46Usurcod ,
                                 String AV45Station ,
                                 String A396EmprCod ,
                                 String A764ProForCod )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e151WR2 ();
      GRID_nCurrentRecord = 0 ;
      rf1WR2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"ProcesoQuimico_3");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV50Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("formulaciontinte\\procesoquimico_3:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PROFORLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A767ProForLin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORLIN", GXutil.ltrim( localUtil.ntoc( A767ProForLin, (byte)(4), (byte)(0), ".", "")));
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
      GXCCtl = "GRID_nFirstRecordOnPage_" + sGXsfl_48_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      send_integrity_hashes( ) ;
      rf1WR2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV50Pgmname = "FormulacionTinte.ProcesoQuimico_3" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50Pgmname", AV50Pgmname);
      Gx_err = (short)(0) ;
      edtavProforcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavProforcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavProforcod_Enabled), 5, 0), true);
      edtavProfordsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavProfordsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavProfordsc_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1WR2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(48) ;
      /* Execute user event: Refresh */
      e151WR2 ();
      nGXsfl_48_idx = (int)(1+GRID_nFirstRecordOnPage) ;
      sGXsfl_48_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_48_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_482( ) ;
      bGXsfl_48_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
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
         subsflControlProps_482( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Short.valueOf(AV52Formulaciontinte_procesoquimico_3ds_1_tfproforlin) ,
                                              Short.valueOf(AV53Formulaciontinte_procesoquimico_3ds_2_tfproforlin_to) ,
                                              AV55Formulaciontinte_procesoquimico_3ds_4_tfproforprd_sel ,
                                              AV54Formulaciontinte_procesoquimico_3ds_3_tfproforprd ,
                                              AV57Formulaciontinte_procesoquimico_3ds_6_tfprofordes_sel ,
                                              AV56Formulaciontinte_procesoquimico_3ds_5_tfprofordes ,
                                              AV58Formulaciontinte_procesoquimico_3ds_7_tfproforcan ,
                                              AV59Formulaciontinte_procesoquimico_3ds_8_tfproforcan_to ,
                                              AV61Formulaciontinte_procesoquimico_3ds_10_tfforprddsc_sel ,
                                              AV60Formulaciontinte_procesoquimico_3ds_9_tfforprddsc ,
                                              Byte.valueOf(AV62Formulaciontinte_procesoquimico_3ds_11_tfprofornro) ,
                                              Byte.valueOf(AV63Formulaciontinte_procesoquimico_3ds_12_tfprofornro_to) ,
                                              Byte.valueOf(AV64Formulaciontinte_procesoquimico_3ds_13_tfprofortnq) ,
                                              Byte.valueOf(AV65Formulaciontinte_procesoquimico_3ds_14_tfprofortnq_to) ,
                                              AV67Formulaciontinte_procesoquimico_3ds_16_tfproforcla_sel ,
                                              AV66Formulaciontinte_procesoquimico_3ds_15_tfproforcla ,
                                              AV69Formulaciontinte_procesoquimico_3ds_18_tfproforclv_sel ,
                                              AV68Formulaciontinte_procesoquimico_3ds_17_tfproforclv ,
                                              Short.valueOf(A767ProForLin) ,
                                              A770ProForPrd ,
                                              A765ProForDes ,
                                              A762ProForCan ,
                                              A488ForPrdDsc ,
                                              Byte.valueOf(A1645ProForNro) ,
                                              Byte.valueOf(A3379ProForTnq) ,
                                              A763ProForCla ,
                                              A5358ProForClv ,
                                              Short.valueOf(AV16OrderedBy) ,
                                              Boolean.valueOf(AV17OrderedDsc) ,
                                              AV7Emprcod ,
                                              AV8ProForCod ,
                                              A396EmprCod ,
                                              A764ProForCod } ,
                                              new int[]{
                                              TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV54Formulaciontinte_procesoquimico_3ds_3_tfproforprd = GXutil.padr( GXutil.rtrim( AV54Formulaciontinte_procesoquimico_3ds_3_tfproforprd), 6, "%") ;
         lV56Formulaciontinte_procesoquimico_3ds_5_tfprofordes = GXutil.padr( GXutil.rtrim( AV56Formulaciontinte_procesoquimico_3ds_5_tfprofordes), 26, "%") ;
         lV60Formulaciontinte_procesoquimico_3ds_9_tfforprddsc = GXutil.padr( GXutil.rtrim( AV60Formulaciontinte_procesoquimico_3ds_9_tfforprddsc), 5, "%") ;
         lV66Formulaciontinte_procesoquimico_3ds_15_tfproforcla = GXutil.padr( GXutil.rtrim( AV66Formulaciontinte_procesoquimico_3ds_15_tfproforcla), 16, "%") ;
         lV68Formulaciontinte_procesoquimico_3ds_17_tfproforclv = GXutil.padr( GXutil.rtrim( AV68Formulaciontinte_procesoquimico_3ds_17_tfproforclv), 30, "%") ;
         /* Using cursor H01WR2 */
         pr_default.execute(0, new Object[] {AV7Emprcod, AV8ProForCod, Short.valueOf(AV52Formulaciontinte_procesoquimico_3ds_1_tfproforlin), Short.valueOf(AV53Formulaciontinte_procesoquimico_3ds_2_tfproforlin_to), lV54Formulaciontinte_procesoquimico_3ds_3_tfproforprd, AV55Formulaciontinte_procesoquimico_3ds_4_tfproforprd_sel, lV56Formulaciontinte_procesoquimico_3ds_5_tfprofordes, AV57Formulaciontinte_procesoquimico_3ds_6_tfprofordes_sel, AV58Formulaciontinte_procesoquimico_3ds_7_tfproforcan, AV59Formulaciontinte_procesoquimico_3ds_8_tfproforcan_to, lV60Formulaciontinte_procesoquimico_3ds_9_tfforprddsc, AV61Formulaciontinte_procesoquimico_3ds_10_tfforprddsc_sel, Byte.valueOf(AV62Formulaciontinte_procesoquimico_3ds_11_tfprofornro), Byte.valueOf(AV63Formulaciontinte_procesoquimico_3ds_12_tfprofornro_to), Byte.valueOf(AV64Formulaciontinte_procesoquimico_3ds_13_tfprofortnq), Byte.valueOf(AV65Formulaciontinte_procesoquimico_3ds_14_tfprofortnq_to), lV66Formulaciontinte_procesoquimico_3ds_15_tfproforcla, AV67Formulaciontinte_procesoquimico_3ds_16_tfproforcla_sel, lV68Formulaciontinte_procesoquimico_3ds_17_tfproforclv, AV69Formulaciontinte_procesoquimico_3ds_18_tfproforclv_sel, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_48_idx = (int)(1+GRID_nFirstRecordOnPage) ;
         sGXsfl_48_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_48_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_482( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A490ForPrdUMe = H01WR2_A490ForPrdUMe[0] ;
            A396EmprCod = H01WR2_A396EmprCod[0] ;
            A764ProForCod = H01WR2_A764ProForCod[0] ;
            A5358ProForClv = H01WR2_A5358ProForClv[0] ;
            A763ProForCla = H01WR2_A763ProForCla[0] ;
            A3379ProForTnq = H01WR2_A3379ProForTnq[0] ;
            A1645ProForNro = H01WR2_A1645ProForNro[0] ;
            A488ForPrdDsc = H01WR2_A488ForPrdDsc[0] ;
            n488ForPrdDsc = H01WR2_n488ForPrdDsc[0] ;
            A762ProForCan = H01WR2_A762ProForCan[0] ;
            A765ProForDes = H01WR2_A765ProForDes[0] ;
            A770ProForPrd = H01WR2_A770ProForPrd[0] ;
            A767ProForLin = H01WR2_A767ProForLin[0] ;
            A488ForPrdDsc = H01WR2_A488ForPrdDsc[0] ;
            n488ForPrdDsc = H01WR2_n488ForPrdDsc[0] ;
            e161WR2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(48) ;
         wb1WR0( ) ;
      }
      bGXsfl_48_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1WR2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vPROFORDSC2", GXutil.rtrim( AV10ProForDsc2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROFORDSC2", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10ProForDsc2, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORCOD", GXutil.rtrim( A764ProForCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PROFORCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A764ProForCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PROFORLIN"+"_"+sGXsfl_48_idx, getSecureSignedToken( sGXsfl_48_idx, localUtil.format( DecimalUtil.doubleToDec(A767ProForLin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV46Usurcod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV46Usurcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV45Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV45Station, ""))));
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
      AV52Formulaciontinte_procesoquimico_3ds_1_tfproforlin = AV19TFProForLin ;
      AV53Formulaciontinte_procesoquimico_3ds_2_tfproforlin_to = AV20TFProForLin_To ;
      AV54Formulaciontinte_procesoquimico_3ds_3_tfproforprd = AV21TFProForPrd ;
      AV55Formulaciontinte_procesoquimico_3ds_4_tfproforprd_sel = AV22TFProForPrd_Sel ;
      AV56Formulaciontinte_procesoquimico_3ds_5_tfprofordes = AV23TFProForDes ;
      AV57Formulaciontinte_procesoquimico_3ds_6_tfprofordes_sel = AV24TFProForDes_Sel ;
      AV58Formulaciontinte_procesoquimico_3ds_7_tfproforcan = AV29TFProForCan ;
      AV59Formulaciontinte_procesoquimico_3ds_8_tfproforcan_to = AV30TFProForCan_To ;
      AV60Formulaciontinte_procesoquimico_3ds_9_tfforprddsc = AV27TFForPrdDsc ;
      AV61Formulaciontinte_procesoquimico_3ds_10_tfforprddsc_sel = AV28TFForPrdDsc_Sel ;
      AV62Formulaciontinte_procesoquimico_3ds_11_tfprofornro = AV31TFProForNro ;
      AV63Formulaciontinte_procesoquimico_3ds_12_tfprofornro_to = AV32TFProForNro_To ;
      AV64Formulaciontinte_procesoquimico_3ds_13_tfprofortnq = AV33TFProForTnq ;
      AV65Formulaciontinte_procesoquimico_3ds_14_tfprofortnq_to = AV34TFProForTnq_To ;
      AV66Formulaciontinte_procesoquimico_3ds_15_tfproforcla = AV35TFProForCla ;
      AV67Formulaciontinte_procesoquimico_3ds_16_tfproforcla_sel = AV36TFProForCla_Sel ;
      AV68Formulaciontinte_procesoquimico_3ds_17_tfproforclv = AV37TFProForClv ;
      AV69Formulaciontinte_procesoquimico_3ds_18_tfproforclv_sel = AV38TFProForClv_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Short.valueOf(AV52Formulaciontinte_procesoquimico_3ds_1_tfproforlin) ,
                                           Short.valueOf(AV53Formulaciontinte_procesoquimico_3ds_2_tfproforlin_to) ,
                                           AV55Formulaciontinte_procesoquimico_3ds_4_tfproforprd_sel ,
                                           AV54Formulaciontinte_procesoquimico_3ds_3_tfproforprd ,
                                           AV57Formulaciontinte_procesoquimico_3ds_6_tfprofordes_sel ,
                                           AV56Formulaciontinte_procesoquimico_3ds_5_tfprofordes ,
                                           AV58Formulaciontinte_procesoquimico_3ds_7_tfproforcan ,
                                           AV59Formulaciontinte_procesoquimico_3ds_8_tfproforcan_to ,
                                           AV61Formulaciontinte_procesoquimico_3ds_10_tfforprddsc_sel ,
                                           AV60Formulaciontinte_procesoquimico_3ds_9_tfforprddsc ,
                                           Byte.valueOf(AV62Formulaciontinte_procesoquimico_3ds_11_tfprofornro) ,
                                           Byte.valueOf(AV63Formulaciontinte_procesoquimico_3ds_12_tfprofornro_to) ,
                                           Byte.valueOf(AV64Formulaciontinte_procesoquimico_3ds_13_tfprofortnq) ,
                                           Byte.valueOf(AV65Formulaciontinte_procesoquimico_3ds_14_tfprofortnq_to) ,
                                           AV67Formulaciontinte_procesoquimico_3ds_16_tfproforcla_sel ,
                                           AV66Formulaciontinte_procesoquimico_3ds_15_tfproforcla ,
                                           AV69Formulaciontinte_procesoquimico_3ds_18_tfproforclv_sel ,
                                           AV68Formulaciontinte_procesoquimico_3ds_17_tfproforclv ,
                                           Short.valueOf(A767ProForLin) ,
                                           A770ProForPrd ,
                                           A765ProForDes ,
                                           A762ProForCan ,
                                           A488ForPrdDsc ,
                                           Byte.valueOf(A1645ProForNro) ,
                                           Byte.valueOf(A3379ProForTnq) ,
                                           A763ProForCla ,
                                           A5358ProForClv ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV7Emprcod ,
                                           AV8ProForCod ,
                                           A396EmprCod ,
                                           A764ProForCod } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV54Formulaciontinte_procesoquimico_3ds_3_tfproforprd = GXutil.padr( GXutil.rtrim( AV54Formulaciontinte_procesoquimico_3ds_3_tfproforprd), 6, "%") ;
      lV56Formulaciontinte_procesoquimico_3ds_5_tfprofordes = GXutil.padr( GXutil.rtrim( AV56Formulaciontinte_procesoquimico_3ds_5_tfprofordes), 26, "%") ;
      lV60Formulaciontinte_procesoquimico_3ds_9_tfforprddsc = GXutil.padr( GXutil.rtrim( AV60Formulaciontinte_procesoquimico_3ds_9_tfforprddsc), 5, "%") ;
      lV66Formulaciontinte_procesoquimico_3ds_15_tfproforcla = GXutil.padr( GXutil.rtrim( AV66Formulaciontinte_procesoquimico_3ds_15_tfproforcla), 16, "%") ;
      lV68Formulaciontinte_procesoquimico_3ds_17_tfproforclv = GXutil.padr( GXutil.rtrim( AV68Formulaciontinte_procesoquimico_3ds_17_tfproforclv), 30, "%") ;
      /* Using cursor H01WR3 */
      pr_default.execute(1, new Object[] {AV7Emprcod, AV8ProForCod, Short.valueOf(AV52Formulaciontinte_procesoquimico_3ds_1_tfproforlin), Short.valueOf(AV53Formulaciontinte_procesoquimico_3ds_2_tfproforlin_to), lV54Formulaciontinte_procesoquimico_3ds_3_tfproforprd, AV55Formulaciontinte_procesoquimico_3ds_4_tfproforprd_sel, lV56Formulaciontinte_procesoquimico_3ds_5_tfprofordes, AV57Formulaciontinte_procesoquimico_3ds_6_tfprofordes_sel, AV58Formulaciontinte_procesoquimico_3ds_7_tfproforcan, AV59Formulaciontinte_procesoquimico_3ds_8_tfproforcan_to, lV60Formulaciontinte_procesoquimico_3ds_9_tfforprddsc, AV61Formulaciontinte_procesoquimico_3ds_10_tfforprddsc_sel, Byte.valueOf(AV62Formulaciontinte_procesoquimico_3ds_11_tfprofornro), Byte.valueOf(AV63Formulaciontinte_procesoquimico_3ds_12_tfprofornro_to), Byte.valueOf(AV64Formulaciontinte_procesoquimico_3ds_13_tfprofortnq), Byte.valueOf(AV65Formulaciontinte_procesoquimico_3ds_14_tfprofortnq_to), lV66Formulaciontinte_procesoquimico_3ds_15_tfproforcla, AV67Formulaciontinte_procesoquimico_3ds_16_tfproforcla_sel, lV68Formulaciontinte_procesoquimico_3ds_17_tfproforclv, AV69Formulaciontinte_procesoquimico_3ds_18_tfproforclv_sel});
      GRID_nRecordCount = H01WR3_AGRID_nRecordCount[0] ;
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
      AV52Formulaciontinte_procesoquimico_3ds_1_tfproforlin = AV19TFProForLin ;
      AV53Formulaciontinte_procesoquimico_3ds_2_tfproforlin_to = AV20TFProForLin_To ;
      AV54Formulaciontinte_procesoquimico_3ds_3_tfproforprd = AV21TFProForPrd ;
      AV55Formulaciontinte_procesoquimico_3ds_4_tfproforprd_sel = AV22TFProForPrd_Sel ;
      AV56Formulaciontinte_procesoquimico_3ds_5_tfprofordes = AV23TFProForDes ;
      AV57Formulaciontinte_procesoquimico_3ds_6_tfprofordes_sel = AV24TFProForDes_Sel ;
      AV58Formulaciontinte_procesoquimico_3ds_7_tfproforcan = AV29TFProForCan ;
      AV59Formulaciontinte_procesoquimico_3ds_8_tfproforcan_to = AV30TFProForCan_To ;
      AV60Formulaciontinte_procesoquimico_3ds_9_tfforprddsc = AV27TFForPrdDsc ;
      AV61Formulaciontinte_procesoquimico_3ds_10_tfforprddsc_sel = AV28TFForPrdDsc_Sel ;
      AV62Formulaciontinte_procesoquimico_3ds_11_tfprofornro = AV31TFProForNro ;
      AV63Formulaciontinte_procesoquimico_3ds_12_tfprofornro_to = AV32TFProForNro_To ;
      AV64Formulaciontinte_procesoquimico_3ds_13_tfprofortnq = AV33TFProForTnq ;
      AV65Formulaciontinte_procesoquimico_3ds_14_tfprofortnq_to = AV34TFProForTnq_To ;
      AV66Formulaciontinte_procesoquimico_3ds_15_tfproforcla = AV35TFProForCla ;
      AV67Formulaciontinte_procesoquimico_3ds_16_tfproforcla_sel = AV36TFProForCla_Sel ;
      AV68Formulaciontinte_procesoquimico_3ds_17_tfproforclv = AV37TFProForClv ;
      AV69Formulaciontinte_procesoquimico_3ds_18_tfproforclv_sel = AV38TFProForClv_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV7Emprcod, AV8ProForCod, AV19TFProForLin, AV20TFProForLin_To, AV21TFProForPrd, AV22TFProForPrd_Sel, AV23TFProForDes, AV24TFProForDes_Sel, AV29TFProForCan, AV30TFProForCan_To, AV27TFForPrdDsc, AV28TFForPrdDsc_Sel, AV31TFProForNro, AV32TFProForNro_To, AV33TFProForTnq, AV34TFProForTnq_To, AV35TFProForCla, AV36TFProForCla_Sel, AV37TFProForClv, AV38TFProForClv_Sel, AV50Pgmname, AV16OrderedBy, AV17OrderedDsc, AV9ProForDsc, AV10ProForDsc2, AV46Usurcod, AV45Station, A396EmprCod, A764ProForCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV52Formulaciontinte_procesoquimico_3ds_1_tfproforlin = AV19TFProForLin ;
      AV53Formulaciontinte_procesoquimico_3ds_2_tfproforlin_to = AV20TFProForLin_To ;
      AV54Formulaciontinte_procesoquimico_3ds_3_tfproforprd = AV21TFProForPrd ;
      AV55Formulaciontinte_procesoquimico_3ds_4_tfproforprd_sel = AV22TFProForPrd_Sel ;
      AV56Formulaciontinte_procesoquimico_3ds_5_tfprofordes = AV23TFProForDes ;
      AV57Formulaciontinte_procesoquimico_3ds_6_tfprofordes_sel = AV24TFProForDes_Sel ;
      AV58Formulaciontinte_procesoquimico_3ds_7_tfproforcan = AV29TFProForCan ;
      AV59Formulaciontinte_procesoquimico_3ds_8_tfproforcan_to = AV30TFProForCan_To ;
      AV60Formulaciontinte_procesoquimico_3ds_9_tfforprddsc = AV27TFForPrdDsc ;
      AV61Formulaciontinte_procesoquimico_3ds_10_tfforprddsc_sel = AV28TFForPrdDsc_Sel ;
      AV62Formulaciontinte_procesoquimico_3ds_11_tfprofornro = AV31TFProForNro ;
      AV63Formulaciontinte_procesoquimico_3ds_12_tfprofornro_to = AV32TFProForNro_To ;
      AV64Formulaciontinte_procesoquimico_3ds_13_tfprofortnq = AV33TFProForTnq ;
      AV65Formulaciontinte_procesoquimico_3ds_14_tfprofortnq_to = AV34TFProForTnq_To ;
      AV66Formulaciontinte_procesoquimico_3ds_15_tfproforcla = AV35TFProForCla ;
      AV67Formulaciontinte_procesoquimico_3ds_16_tfproforcla_sel = AV36TFProForCla_Sel ;
      AV68Formulaciontinte_procesoquimico_3ds_17_tfproforclv = AV37TFProForClv ;
      AV69Formulaciontinte_procesoquimico_3ds_18_tfproforclv_sel = AV38TFProForClv_Sel ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV7Emprcod, AV8ProForCod, AV19TFProForLin, AV20TFProForLin_To, AV21TFProForPrd, AV22TFProForPrd_Sel, AV23TFProForDes, AV24TFProForDes_Sel, AV29TFProForCan, AV30TFProForCan_To, AV27TFForPrdDsc, AV28TFForPrdDsc_Sel, AV31TFProForNro, AV32TFProForNro_To, AV33TFProForTnq, AV34TFProForTnq_To, AV35TFProForCla, AV36TFProForCla_Sel, AV37TFProForClv, AV38TFProForClv_Sel, AV50Pgmname, AV16OrderedBy, AV17OrderedDsc, AV9ProForDsc, AV10ProForDsc2, AV46Usurcod, AV45Station, A396EmprCod, A764ProForCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV52Formulaciontinte_procesoquimico_3ds_1_tfproforlin = AV19TFProForLin ;
      AV53Formulaciontinte_procesoquimico_3ds_2_tfproforlin_to = AV20TFProForLin_To ;
      AV54Formulaciontinte_procesoquimico_3ds_3_tfproforprd = AV21TFProForPrd ;
      AV55Formulaciontinte_procesoquimico_3ds_4_tfproforprd_sel = AV22TFProForPrd_Sel ;
      AV56Formulaciontinte_procesoquimico_3ds_5_tfprofordes = AV23TFProForDes ;
      AV57Formulaciontinte_procesoquimico_3ds_6_tfprofordes_sel = AV24TFProForDes_Sel ;
      AV58Formulaciontinte_procesoquimico_3ds_7_tfproforcan = AV29TFProForCan ;
      AV59Formulaciontinte_procesoquimico_3ds_8_tfproforcan_to = AV30TFProForCan_To ;
      AV60Formulaciontinte_procesoquimico_3ds_9_tfforprddsc = AV27TFForPrdDsc ;
      AV61Formulaciontinte_procesoquimico_3ds_10_tfforprddsc_sel = AV28TFForPrdDsc_Sel ;
      AV62Formulaciontinte_procesoquimico_3ds_11_tfprofornro = AV31TFProForNro ;
      AV63Formulaciontinte_procesoquimico_3ds_12_tfprofornro_to = AV32TFProForNro_To ;
      AV64Formulaciontinte_procesoquimico_3ds_13_tfprofortnq = AV33TFProForTnq ;
      AV65Formulaciontinte_procesoquimico_3ds_14_tfprofortnq_to = AV34TFProForTnq_To ;
      AV66Formulaciontinte_procesoquimico_3ds_15_tfproforcla = AV35TFProForCla ;
      AV67Formulaciontinte_procesoquimico_3ds_16_tfproforcla_sel = AV36TFProForCla_Sel ;
      AV68Formulaciontinte_procesoquimico_3ds_17_tfproforclv = AV37TFProForClv ;
      AV69Formulaciontinte_procesoquimico_3ds_18_tfproforclv_sel = AV38TFProForClv_Sel ;
      if ( GRID_nFirstRecordOnPage >= subgrid_fnc_recordsperpage( ) )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage-subgrid_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV7Emprcod, AV8ProForCod, AV19TFProForLin, AV20TFProForLin_To, AV21TFProForPrd, AV22TFProForPrd_Sel, AV23TFProForDes, AV24TFProForDes_Sel, AV29TFProForCan, AV30TFProForCan_To, AV27TFForPrdDsc, AV28TFForPrdDsc_Sel, AV31TFProForNro, AV32TFProForNro_To, AV33TFProForTnq, AV34TFProForTnq_To, AV35TFProForCla, AV36TFProForCla_Sel, AV37TFProForClv, AV38TFProForClv_Sel, AV50Pgmname, AV16OrderedBy, AV17OrderedDsc, AV9ProForDsc, AV10ProForDsc2, AV46Usurcod, AV45Station, A396EmprCod, A764ProForCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV52Formulaciontinte_procesoquimico_3ds_1_tfproforlin = AV19TFProForLin ;
      AV53Formulaciontinte_procesoquimico_3ds_2_tfproforlin_to = AV20TFProForLin_To ;
      AV54Formulaciontinte_procesoquimico_3ds_3_tfproforprd = AV21TFProForPrd ;
      AV55Formulaciontinte_procesoquimico_3ds_4_tfproforprd_sel = AV22TFProForPrd_Sel ;
      AV56Formulaciontinte_procesoquimico_3ds_5_tfprofordes = AV23TFProForDes ;
      AV57Formulaciontinte_procesoquimico_3ds_6_tfprofordes_sel = AV24TFProForDes_Sel ;
      AV58Formulaciontinte_procesoquimico_3ds_7_tfproforcan = AV29TFProForCan ;
      AV59Formulaciontinte_procesoquimico_3ds_8_tfproforcan_to = AV30TFProForCan_To ;
      AV60Formulaciontinte_procesoquimico_3ds_9_tfforprddsc = AV27TFForPrdDsc ;
      AV61Formulaciontinte_procesoquimico_3ds_10_tfforprddsc_sel = AV28TFForPrdDsc_Sel ;
      AV62Formulaciontinte_procesoquimico_3ds_11_tfprofornro = AV31TFProForNro ;
      AV63Formulaciontinte_procesoquimico_3ds_12_tfprofornro_to = AV32TFProForNro_To ;
      AV64Formulaciontinte_procesoquimico_3ds_13_tfprofortnq = AV33TFProForTnq ;
      AV65Formulaciontinte_procesoquimico_3ds_14_tfprofortnq_to = AV34TFProForTnq_To ;
      AV66Formulaciontinte_procesoquimico_3ds_15_tfproforcla = AV35TFProForCla ;
      AV67Formulaciontinte_procesoquimico_3ds_16_tfproforcla_sel = AV36TFProForCla_Sel ;
      AV68Formulaciontinte_procesoquimico_3ds_17_tfproforclv = AV37TFProForClv ;
      AV69Formulaciontinte_procesoquimico_3ds_18_tfproforclv_sel = AV38TFProForClv_Sel ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV7Emprcod, AV8ProForCod, AV19TFProForLin, AV20TFProForLin_To, AV21TFProForPrd, AV22TFProForPrd_Sel, AV23TFProForDes, AV24TFProForDes_Sel, AV29TFProForCan, AV30TFProForCan_To, AV27TFForPrdDsc, AV28TFForPrdDsc_Sel, AV31TFProForNro, AV32TFProForNro_To, AV33TFProForTnq, AV34TFProForTnq_To, AV35TFProForCla, AV36TFProForCla_Sel, AV37TFProForClv, AV38TFProForClv_Sel, AV50Pgmname, AV16OrderedBy, AV17OrderedDsc, AV9ProForDsc, AV10ProForDsc2, AV46Usurcod, AV45Station, A396EmprCod, A764ProForCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV52Formulaciontinte_procesoquimico_3ds_1_tfproforlin = AV19TFProForLin ;
      AV53Formulaciontinte_procesoquimico_3ds_2_tfproforlin_to = AV20TFProForLin_To ;
      AV54Formulaciontinte_procesoquimico_3ds_3_tfproforprd = AV21TFProForPrd ;
      AV55Formulaciontinte_procesoquimico_3ds_4_tfproforprd_sel = AV22TFProForPrd_Sel ;
      AV56Formulaciontinte_procesoquimico_3ds_5_tfprofordes = AV23TFProForDes ;
      AV57Formulaciontinte_procesoquimico_3ds_6_tfprofordes_sel = AV24TFProForDes_Sel ;
      AV58Formulaciontinte_procesoquimico_3ds_7_tfproforcan = AV29TFProForCan ;
      AV59Formulaciontinte_procesoquimico_3ds_8_tfproforcan_to = AV30TFProForCan_To ;
      AV60Formulaciontinte_procesoquimico_3ds_9_tfforprddsc = AV27TFForPrdDsc ;
      AV61Formulaciontinte_procesoquimico_3ds_10_tfforprddsc_sel = AV28TFForPrdDsc_Sel ;
      AV62Formulaciontinte_procesoquimico_3ds_11_tfprofornro = AV31TFProForNro ;
      AV63Formulaciontinte_procesoquimico_3ds_12_tfprofornro_to = AV32TFProForNro_To ;
      AV64Formulaciontinte_procesoquimico_3ds_13_tfprofortnq = AV33TFProForTnq ;
      AV65Formulaciontinte_procesoquimico_3ds_14_tfprofortnq_to = AV34TFProForTnq_To ;
      AV66Formulaciontinte_procesoquimico_3ds_15_tfproforcla = AV35TFProForCla ;
      AV67Formulaciontinte_procesoquimico_3ds_16_tfproforcla_sel = AV36TFProForCla_Sel ;
      AV68Formulaciontinte_procesoquimico_3ds_17_tfproforclv = AV37TFProForClv ;
      AV69Formulaciontinte_procesoquimico_3ds_18_tfproforclv_sel = AV38TFProForClv_Sel ;
      if ( nPageNo > 0 )
      {
         GRID_nFirstRecordOnPage = (long)(subgrid_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRID_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV7Emprcod, AV8ProForCod, AV19TFProForLin, AV20TFProForLin_To, AV21TFProForPrd, AV22TFProForPrd_Sel, AV23TFProForDes, AV24TFProForDes_Sel, AV29TFProForCan, AV30TFProForCan_To, AV27TFForPrdDsc, AV28TFForPrdDsc_Sel, AV31TFProForNro, AV32TFProForNro_To, AV33TFProForTnq, AV34TFProForTnq_To, AV35TFProForCla, AV36TFProForCla_Sel, AV37TFProForClv, AV38TFProForClv_Sel, AV50Pgmname, AV16OrderedBy, AV17OrderedDsc, AV9ProForDsc, AV10ProForDsc2, AV46Usurcod, AV45Station, A396EmprCod, A764ProForCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV50Pgmname = "FormulacionTinte.ProcesoQuimico_3" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50Pgmname", AV50Pgmname);
      Gx_err = (short)(0) ;
      edtavProforcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavProforcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavProforcod_Enabled), 5, 0), true);
      edtavProfordsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavProfordsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavProfordsc_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1WR0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e141WR2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV39DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_48 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_48"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Dvpanel_tableheader_Width = httpContext.cgiGet( "DVPANEL_TABLEHEADER_Width") ;
         Dvpanel_tableheader_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Autowidth")) ;
         Dvpanel_tableheader_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Autoheight")) ;
         Dvpanel_tableheader_Cls = httpContext.cgiGet( "DVPANEL_TABLEHEADER_Cls") ;
         Dvpanel_tableheader_Title = httpContext.cgiGet( "DVPANEL_TABLEHEADER_Title") ;
         Dvpanel_tableheader_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Collapsible")) ;
         Dvpanel_tableheader_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Collapsed")) ;
         Dvpanel_tableheader_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Showcollapseicon")) ;
         Dvpanel_tableheader_Iconposition = httpContext.cgiGet( "DVPANEL_TABLEHEADER_Iconposition") ;
         Dvpanel_tableheader_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Autoscroll")) ;
         Ddo_grid_Caption = httpContext.cgiGet( "DDO_GRID_Caption") ;
         Ddo_grid_Filteredtext_set = httpContext.cgiGet( "DDO_GRID_Filteredtext_set") ;
         Ddo_grid_Filteredtextto_set = httpContext.cgiGet( "DDO_GRID_Filteredtextto_set") ;
         Ddo_grid_Selectedvalue_set = httpContext.cgiGet( "DDO_GRID_Selectedvalue_set") ;
         Ddo_grid_Gridinternalname = httpContext.cgiGet( "DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( "DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( "DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Includesortasc = httpContext.cgiGet( "DDO_GRID_Includesortasc") ;
         Ddo_grid_Sortedstatus = httpContext.cgiGet( "DDO_GRID_Sortedstatus") ;
         Ddo_grid_Includefilter = httpContext.cgiGet( "DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( "DDO_GRID_Filtertype") ;
         Ddo_grid_Filterisrange = httpContext.cgiGet( "DDO_GRID_Filterisrange") ;
         Ddo_grid_Includedatalist = httpContext.cgiGet( "DDO_GRID_Includedatalist") ;
         Ddo_grid_Datalisttype = httpContext.cgiGet( "DDO_GRID_Datalisttype") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( "DDO_GRID_Datalistproc") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Infinitescrolling = httpContext.cgiGet( "GRID_EMPOWERER_Infinitescrolling") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Fixedcolumns = httpContext.cgiGet( "GRID_EMPOWERER_Fixedcolumns") ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( "DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( "DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( "DDO_GRID_Filteredtextto_get") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( "DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( "DDO_GRID_Selectedcolumn") ;
         /* Read variables values. */
         AV50Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV50Pgmname", AV50Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"ProcesoQuimico_3");
         AV50Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV50Pgmname", AV50Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV50Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("formulaciontinte\\procesoquimico_3:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e141WR2 ();
      if (returnInSub) return;
   }

   public void e141WR2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV45Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      procesoquimico_3_impl.this.GXt_char1 = GXv_char2[0] ;
      AV45Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45Station", AV45Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV45Station, ""))));
      GXv_char2[0] = AV7Emprcod ;
      GXv_char3[0] = AV51Emprnom ;
      GXv_char4[0] = AV46Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV45Station, GXv_char2, GXv_char3, GXv_char4) ;
      procesoquimico_3_impl.this.AV7Emprcod = GXv_char2[0] ;
      procesoquimico_3_impl.this.AV51Emprnom = GXv_char3[0] ;
      procesoquimico_3_impl.this.AV46Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Emprcod", AV7Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV46Usurcod", AV46Usurcod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV46Usurcod, "@!"))));
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S112 ();
      if (returnInSub) return;
      subGrid_Rows = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " Proceso Quimico (Lineas)", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( AV16OrderedBy < 1 )
      {
         AV16OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV39DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV39DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      GXt_int7 = AV47Clave2 ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV7Emprcod, httpContext.getMessage( "CLAVE2", ""), GXv_int8) ;
      procesoquimico_3_impl.this.GXt_int7 = GXv_int8[0] ;
      AV47Clave2 = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47Clave2", GXutil.str( AV47Clave2, 1, 0));
   }

   public void e151WR2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext9[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV6WWPContext = GXv_SdtWWPContext9[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      AV52Formulaciontinte_procesoquimico_3ds_1_tfproforlin = AV19TFProForLin ;
      AV53Formulaciontinte_procesoquimico_3ds_2_tfproforlin_to = AV20TFProForLin_To ;
      AV54Formulaciontinte_procesoquimico_3ds_3_tfproforprd = AV21TFProForPrd ;
      AV55Formulaciontinte_procesoquimico_3ds_4_tfproforprd_sel = AV22TFProForPrd_Sel ;
      AV56Formulaciontinte_procesoquimico_3ds_5_tfprofordes = AV23TFProForDes ;
      AV57Formulaciontinte_procesoquimico_3ds_6_tfprofordes_sel = AV24TFProForDes_Sel ;
      AV58Formulaciontinte_procesoquimico_3ds_7_tfproforcan = AV29TFProForCan ;
      AV59Formulaciontinte_procesoquimico_3ds_8_tfproforcan_to = AV30TFProForCan_To ;
      AV60Formulaciontinte_procesoquimico_3ds_9_tfforprddsc = AV27TFForPrdDsc ;
      AV61Formulaciontinte_procesoquimico_3ds_10_tfforprddsc_sel = AV28TFForPrdDsc_Sel ;
      AV62Formulaciontinte_procesoquimico_3ds_11_tfprofornro = AV31TFProForNro ;
      AV63Formulaciontinte_procesoquimico_3ds_12_tfprofornro_to = AV32TFProForNro_To ;
      AV64Formulaciontinte_procesoquimico_3ds_13_tfprofortnq = AV33TFProForTnq ;
      AV65Formulaciontinte_procesoquimico_3ds_14_tfprofortnq_to = AV34TFProForTnq_To ;
      AV66Formulaciontinte_procesoquimico_3ds_15_tfproforcla = AV35TFProForCla ;
      AV67Formulaciontinte_procesoquimico_3ds_16_tfproforcla_sel = AV36TFProForCla_Sel ;
      AV68Formulaciontinte_procesoquimico_3ds_17_tfproforclv = AV37TFProForClv ;
      AV69Formulaciontinte_procesoquimico_3ds_18_tfproforclv_sel = AV38TFProForClv_Sel ;
   }

   public void e111WR2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV16OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16OrderedBy), 4, 0));
         AV17OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17OrderedDsc", AV17OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProForLin") == 0 )
         {
            AV19TFProForLin = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19TFProForLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19TFProForLin), 4, 0));
            AV20TFProForLin_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20TFProForLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20TFProForLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProForPrd") == 0 )
         {
            AV21TFProForPrd = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21TFProForPrd", AV21TFProForPrd);
            AV22TFProForPrd_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22TFProForPrd_Sel", AV22TFProForPrd_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProForDes") == 0 )
         {
            AV23TFProForDes = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23TFProForDes", AV23TFProForDes);
            AV24TFProForDes_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24TFProForDes_Sel", AV24TFProForDes_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProForCan") == 0 )
         {
            AV29TFProForCan = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFProForCan", GXutil.ltrimstr( AV29TFProForCan, 12, 5));
            AV30TFProForCan_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFProForCan_To", GXutil.ltrimstr( AV30TFProForCan_To, 12, 5));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForPrdDsc") == 0 )
         {
            AV27TFForPrdDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFForPrdDsc", AV27TFForPrdDsc);
            AV28TFForPrdDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFForPrdDsc_Sel", AV28TFForPrdDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProForNro") == 0 )
         {
            AV31TFProForNro = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFProForNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TFProForNro), 2, 0));
            AV32TFProForNro_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFProForNro_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32TFProForNro_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProForTnq") == 0 )
         {
            AV33TFProForTnq = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFProForTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33TFProForTnq), 2, 0));
            AV34TFProForTnq_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFProForTnq_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFProForTnq_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProForCla") == 0 )
         {
            AV35TFProForCla = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFProForCla", AV35TFProForCla);
            AV36TFProForCla_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFProForCla_Sel", AV36TFProForCla_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProForClv") == 0 )
         {
            AV37TFProForClv = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFProForClv", AV37TFProForClv);
            AV38TFProForClv_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFProForClv_Sel", AV38TFProForClv_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e161WR2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGridactions.removeAllItems();
      cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GX_BtnDelete", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(48) ;
      }
      sendrow_482( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_48_Refreshing )
      {
         httpContext.doAjaxLoad(48, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV43GridActions, 4, 0)) );
   }

   public void e171WR2( )
   {
      /* Gridactions_Click Routine */
      returnInSub = false ;
      if ( AV43GridActions == 1 )
      {
         /* Execute user subroutine: 'DO UPDATE' */
         S162 ();
         if (returnInSub) return;
      }
      else if ( AV43GridActions == 2 )
      {
         /* Execute user subroutine: 'DO DELETE' */
         S172 ();
         if (returnInSub) return;
      }
      AV43GridActions = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43GridActions), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV43GridActions, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), true);
   }

   public void e121WR2( )
   {
      /* 'DoInsert' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.formulaciontinte.procesoquimico_2", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim(AV7Emprcod)),GXutil.URLEncode(GXutil.rtrim(AV8ProForCod)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0))}, new String[] {"Mode","EmprCod","ProForCod","ProForLin"}) , new Object[] {});
      httpContext.doAjaxRefresh();
      if ( 1 == 0 )
      {
         callWebObject(formatLink("app.formulaciontinte.procesoquimico_2", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.ltrimstr(0,9,0))}, new String[] {"Mode","EmprCod","ProForCod","ProForLin"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void e131WR2( )
   {
      /* 'DoRenumerar' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV7Emprcod ;
      GXv_char3[0] = AV8ProForCod ;
      new app.formulaciontinte.prenprq(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      procesoquimico_3_impl.this.AV7Emprcod = GXv_char4[0] ;
      procesoquimico_3_impl.this.AV8ProForCod = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Emprcod", AV7Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV8ProForCod", AV8ProForCod);
      Gx_msg = httpContext.getMessage( "Proceso=", "") + GXutil.trim( AV8ProForCod) + httpContext.getMessage( "Re-numeracion LINEAS", "") ;
      new app.pctrinc(remoteHandle, context).execute( AV7Emprcod, AV50Pgmname, AV46Usurcod, AV45Station, Gx_msg, 99999999, (byte)(0), "@") ;
      httpContext.GX_msglist.addItem(httpContext.getMessage( "Proceso Finalizado", ""));
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV16OrderedBy, 4, 0))+":"+(AV17OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.formulaciontinte.procesoquimico_2", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A764ProForCod)),GXutil.URLEncode(GXutil.ltrimstr(A767ProForLin,4,0))}, new String[] {"Mode","EmprCod","ProForCod","ProForLin"}) , new Object[] {});
      httpContext.doAjaxRefresh();
      if ( 1 == 0 )
      {
         callWebObject(formatLink("app.formulaciontinte.procesoquimico_2", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A764ProForCod)),GXutil.URLEncode(GXutil.ltrimstr(A767ProForLin,4,0))}, new String[] {"Mode","EmprCod","ProForCod","ProForLin"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void S172( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
      AV44Window.setAutoresize( 0 );
      AV44Window.setWidth( 1600 );
      AV44Window.setHeight( 600 );
      /* Window Datatype Object Property */
      AV44Window.setUrl( formatLink("app.formulaciontinte.procesoquimico_2", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A764ProForCod)),GXutil.URLEncode(GXutil.ltrimstr(A767ProForLin,4,0))}, new String[] {"Mode","EmprCod","ProForCod","ProForLin"})  );
      AV44Window.setReturnParms(new Object[] {});
      httpContext.newWindow(AV44Window);
      httpContext.doAjaxRefresh();
      if ( 1 == 0 )
      {
         callWebObject(formatLink("app.formulaciontinte.procesoquimico_2", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A764ProForCod)),GXutil.URLEncode(GXutil.ltrimstr(A767ProForLin,4,0))}, new String[] {"Mode","EmprCod","ProForCod","ProForLin"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV18Session.getValue(AV50Pgmname+"GridState"), "") == 0 )
      {
         AV14GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV50Pgmname+"GridState"), null, null);
      }
      else
      {
         AV14GridState.fromxml(AV18Session.getValue(AV50Pgmname+"GridState"), null, null);
      }
      AV16OrderedBy = AV14GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16OrderedBy), 4, 0));
      AV17OrderedDsc = AV14GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17OrderedDsc", AV17OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      AV71GXV1 = 1 ;
      while ( AV71GXV1 <= AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV71GXV1));
         if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORLIN") == 0 )
         {
            AV19TFProForLin = (short)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19TFProForLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19TFProForLin), 4, 0));
            AV20TFProForLin_To = (short)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20TFProForLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20TFProForLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORPRD") == 0 )
         {
            AV21TFProForPrd = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21TFProForPrd", AV21TFProForPrd);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORPRD_SEL") == 0 )
         {
            AV22TFProForPrd_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22TFProForPrd_Sel", AV22TFProForPrd_Sel);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORDES") == 0 )
         {
            AV23TFProForDes = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23TFProForDes", AV23TFProForDes);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORDES_SEL") == 0 )
         {
            AV24TFProForDes_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24TFProForDes_Sel", AV24TFProForDes_Sel);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORCAN") == 0 )
         {
            AV29TFProForCan = CommonUtil.decimalVal( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFProForCan", GXutil.ltrimstr( AV29TFProForCan, 12, 5));
            AV30TFProForCan_To = CommonUtil.decimalVal( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFProForCan_To", GXutil.ltrimstr( AV30TFProForCan_To, 12, 5));
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC") == 0 )
         {
            AV27TFForPrdDsc = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFForPrdDsc", AV27TFForPrdDsc);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC_SEL") == 0 )
         {
            AV28TFForPrdDsc_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFForPrdDsc_Sel", AV28TFForPrdDsc_Sel);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORNRO") == 0 )
         {
            AV31TFProForNro = (byte)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFProForNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TFProForNro), 2, 0));
            AV32TFProForNro_To = (byte)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFProForNro_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32TFProForNro_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORTNQ") == 0 )
         {
            AV33TFProForTnq = (byte)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFProForTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33TFProForTnq), 2, 0));
            AV34TFProForTnq_To = (byte)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFProForTnq_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFProForTnq_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORCLA") == 0 )
         {
            AV35TFProForCla = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFProForCla", AV35TFProForCla);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORCLA_SEL") == 0 )
         {
            AV36TFProForCla_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFProForCla_Sel", AV36TFProForCla_Sel);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORCLV") == 0 )
         {
            AV37TFProForClv = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFProForClv", AV37TFProForClv);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORCLV_SEL") == 0 )
         {
            AV38TFProForClv_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFProForClv_Sel", AV38TFProForClv_Sel);
         }
         AV71GXV1 = (int)(AV71GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV22TFProForPrd_Sel)==0), AV22TFProForPrd_Sel, GXv_char4) ;
      procesoquimico_3_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char10 = "" ;
      GXv_char3[0] = GXt_char10 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV24TFProForDes_Sel)==0), AV24TFProForDes_Sel, GXv_char3) ;
      procesoquimico_3_impl.this.GXt_char10 = GXv_char3[0] ;
      GXt_char11 = "" ;
      GXv_char2[0] = GXt_char11 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV28TFForPrdDsc_Sel)==0), AV28TFForPrdDsc_Sel, GXv_char2) ;
      procesoquimico_3_impl.this.GXt_char11 = GXv_char2[0] ;
      GXt_char12 = "" ;
      GXv_char13[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV36TFProForCla_Sel)==0), AV36TFProForCla_Sel, GXv_char13) ;
      procesoquimico_3_impl.this.GXt_char12 = GXv_char13[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV38TFProForClv_Sel)==0), AV38TFProForClv_Sel, GXv_char15) ;
      procesoquimico_3_impl.this.GXt_char14 = GXv_char15[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"|"+GXt_char10+"||"+GXt_char11+"|||"+GXt_char12+"|"+GXt_char14 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV21TFProForPrd)==0), AV21TFProForPrd, GXv_char15) ;
      procesoquimico_3_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char12 = "" ;
      GXv_char13[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV23TFProForDes)==0), AV23TFProForDes, GXv_char13) ;
      procesoquimico_3_impl.this.GXt_char12 = GXv_char13[0] ;
      GXt_char11 = "" ;
      GXv_char4[0] = GXt_char11 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV27TFForPrdDsc)==0), AV27TFForPrdDsc, GXv_char4) ;
      procesoquimico_3_impl.this.GXt_char11 = GXv_char4[0] ;
      GXt_char10 = "" ;
      GXv_char3[0] = GXt_char10 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV35TFProForCla)==0), AV35TFProForCla, GXv_char3) ;
      procesoquimico_3_impl.this.GXt_char10 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV37TFProForClv)==0), AV37TFProForClv, GXv_char2) ;
      procesoquimico_3_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV19TFProForLin) ? "" : GXutil.str( AV19TFProForLin, 4, 0))+"|"+GXt_char14+"|"+GXt_char12+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV29TFProForCan)==0) ? "" : GXutil.str( AV29TFProForCan, 12, 5))+"|"+GXt_char11+"|"+((0==AV31TFProForNro) ? "" : GXutil.str( AV31TFProForNro, 2, 0))+"|"+((0==AV33TFProForTnq) ? "" : GXutil.str( AV33TFProForTnq, 2, 0))+"|"+GXt_char10+"|"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV20TFProForLin_To) ? "" : GXutil.str( AV20TFProForLin_To, 4, 0))+"|||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV30TFProForCan_To)==0) ? "" : GXutil.str( AV30TFProForCan_To, 12, 5))+"||"+((0==AV32TFProForNro_To) ? "" : GXutil.str( AV32TFProForNro_To, 2, 0))+"|"+((0==AV34TFProForTnq_To) ? "" : GXutil.str( AV34TFProForTnq_To, 2, 0))+"||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV14GridState.fromxml(AV18Session.getValue(AV50Pgmname+"GridState"), null, null);
      AV14GridState.setgxTv_SdtWWPGridState_Orderedby( AV16OrderedBy );
      AV14GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV17OrderedDsc );
      AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState16[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFPROFORLIN", "", !((0==AV19TFProForLin)&&(0==AV20TFProForLin_To)), (short)(0), GXutil.trim( GXutil.str( AV19TFProForLin, 4, 0)), GXutil.trim( GXutil.str( AV20TFProForLin_To, 4, 0))) ;
      AV14GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFPROFORPRD", "", !(GXutil.strcmp("", AV21TFProForPrd)==0), (short)(0), AV21TFProForPrd, "", !(GXutil.strcmp("", AV22TFProForPrd_Sel)==0), AV22TFProForPrd_Sel, "") ;
      AV14GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFPROFORDES", "", !(GXutil.strcmp("", AV23TFProForDes)==0), (short)(0), AV23TFProForDes, "", !(GXutil.strcmp("", AV24TFProForDes_Sel)==0), AV24TFProForDes_Sel, "") ;
      AV14GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFPROFORCAN", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV29TFProForCan)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV30TFProForCan_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV29TFProForCan, 12, 5)), GXutil.trim( GXutil.str( AV30TFProForCan_To, 12, 5))) ;
      AV14GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFFORPRDDSC", "", !(GXutil.strcmp("", AV27TFForPrdDsc)==0), (short)(0), AV27TFForPrdDsc, "", !(GXutil.strcmp("", AV28TFForPrdDsc_Sel)==0), AV28TFForPrdDsc_Sel, "") ;
      AV14GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFPROFORNRO", "", !((0==AV31TFProForNro)&&(0==AV32TFProForNro_To)), (short)(0), GXutil.trim( GXutil.str( AV31TFProForNro, 2, 0)), GXutil.trim( GXutil.str( AV32TFProForNro_To, 2, 0))) ;
      AV14GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFPROFORTNQ", "", !((0==AV33TFProForTnq)&&(0==AV34TFProForTnq_To)), (short)(0), GXutil.trim( GXutil.str( AV33TFProForTnq, 2, 0)), GXutil.trim( GXutil.str( AV34TFProForTnq_To, 2, 0))) ;
      AV14GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFPROFORCLA", "", !(GXutil.strcmp("", AV35TFProForCla)==0), (short)(0), AV35TFProForCla, "", !(GXutil.strcmp("", AV36TFProForCla_Sel)==0), AV36TFProForCla_Sel, "") ;
      AV14GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFPROFORCLV", "", !(GXutil.strcmp("", AV37TFProForClv)==0), (short)(0), AV37TFProForClv, "", !(GXutil.strcmp("", AV38TFProForClv_Sel)==0), AV38TFProForClv_Sel, "") ;
      AV14GridState = GXv_SdtWWPGridState16[0] ;
      if ( ! (GXutil.strcmp("", AV7Emprcod)==0) )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV7Emprcod );
         AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV15GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV8ProForCod)==0) )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PROFORCOD" );
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV8ProForCod );
         AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV15GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV9ProForDsc)==0) )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PROFORDSC" );
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV9ProForDsc );
         AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV15GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV10ProForDsc2)==0) )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PROFORDSC2" );
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV10ProForDsc2 );
         AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV15GridStateFilterValue, 0);
      }
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV50Pgmname+"GridState", AV14GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV12TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV12TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV50Pgmname );
      AV12TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV12TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV11HTTPRequest.getScriptName()+"?"+AV11HTTPRequest.getQuerystring() );
      AV12TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "FormulacionTinte.ProcesoQuimico_2" );
      AV18Session.setValue("TrnContext", AV12TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S112( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV18Session.getValue(AV50Pgmname+"GridState"), "") == 0 )
      {
         AV14GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV50Pgmname+"GridState"), null, null);
      }
      else
      {
         AV14GridState.fromxml(AV18Session.getValue(AV50Pgmname+"GridState"), null, null);
      }
      if ( ! ( ( AV47Clave2 == 1 ) ) )
      {
         edtProForClv_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProForClv_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForClv_Visible), 5, 0), !bGXsfl_48_Refreshing);
         GXv_SdtWWPGridState16[0] = AV14GridState;
         if ( new app.wwpbaseobjects.wwp_deletefilter(remoteHandle, context).executeUdp( GXv_SdtWWPGridState16, "TFPROFORCLV", false) )
         {
            Cond_result = true ;
         }
         else
         {
            Cond_result = false ;
         }
         AV14GridState = GXv_SdtWWPGridState16[0] ;
         if ( Cond_result )
         {
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV50Pgmname+"GridState", AV14GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
         }
      }
   }

   public void wb_table1_24_1WR2( boolean wbgen )
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
         wb_table1_24_1WR2e( true) ;
      }
      else
      {
         wb_table1_24_1WR2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV7Emprcod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Emprcod", AV7Emprcod);
      AV8ProForCod = (String)getParm(obj,1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8ProForCod", AV8ProForCod);
      AV9ProForDsc = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9ProForDsc", AV9ProForDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROFORDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9ProForDsc, ""))));
      AV10ProForDsc2 = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10ProForDsc2", AV10ProForDsc2);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROFORDSC2", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10ProForDsc2, ""))));
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
      pa1WR2( ) ;
      ws1WR2( ) ;
      we1WR2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116141586", true, true);
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
      httpContext.AddJavascriptSource("formulaciontinte/procesoquimico_3.js", "?202682116141586", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_482( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_48_idx );
      edtProForLin_Internalname = "PROFORLIN_"+sGXsfl_48_idx ;
      edtProForPrd_Internalname = "PROFORPRD_"+sGXsfl_48_idx ;
      edtProForDes_Internalname = "PROFORDES_"+sGXsfl_48_idx ;
      edtProForCan_Internalname = "PROFORCAN_"+sGXsfl_48_idx ;
      edtForPrdDsc_Internalname = "FORPRDDSC_"+sGXsfl_48_idx ;
      edtProForNro_Internalname = "PROFORNRO_"+sGXsfl_48_idx ;
      edtProForTnq_Internalname = "PROFORTNQ_"+sGXsfl_48_idx ;
      edtProForCla_Internalname = "PROFORCLA_"+sGXsfl_48_idx ;
      edtProForClv_Internalname = "PROFORCLV_"+sGXsfl_48_idx ;
   }

   public void subsflControlProps_fel_482( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_48_fel_idx );
      edtProForLin_Internalname = "PROFORLIN_"+sGXsfl_48_fel_idx ;
      edtProForPrd_Internalname = "PROFORPRD_"+sGXsfl_48_fel_idx ;
      edtProForDes_Internalname = "PROFORDES_"+sGXsfl_48_fel_idx ;
      edtProForCan_Internalname = "PROFORCAN_"+sGXsfl_48_fel_idx ;
      edtForPrdDsc_Internalname = "FORPRDDSC_"+sGXsfl_48_fel_idx ;
      edtProForNro_Internalname = "PROFORNRO_"+sGXsfl_48_fel_idx ;
      edtProForTnq_Internalname = "PROFORTNQ_"+sGXsfl_48_fel_idx ;
      edtProForCla_Internalname = "PROFORCLA_"+sGXsfl_48_fel_idx ;
      edtProForClv_Internalname = "PROFORCLV_"+sGXsfl_48_fel_idx ;
   }

   public void sendrow_482( )
   {
      subsflControlProps_482( ) ;
      wb1WR0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_48_idx - GRID_nFirstRecordOnPage <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_48_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_48_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 49,'',false,'"+sGXsfl_48_idx+"',48)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_48_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV43GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV43GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV43GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRIDACTIONS.CLICK."+sGXsfl_48_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,49);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV43GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_48_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForLin_Internalname,GXutil.ltrim( localUtil.ntoc( A767ProForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A767ProForLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForPrd_Internalname,GXutil.rtrim( A770ProForPrd),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForPrd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForDes_Internalname,GXutil.rtrim( A765ProForDes),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForDes_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForCan_Internalname,GXutil.ltrim( localUtil.ntoc( A762ProForCan, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A762ProForCan, "ZZZZZ9.9999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForCan_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForPrdDsc_Internalname,GXutil.rtrim( A488ForPrdDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForPrdDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForNro_Internalname,GXutil.ltrim( localUtil.ntoc( A1645ProForNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1645ProForNro), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForNro_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForTnq_Internalname,GXutil.ltrim( localUtil.ntoc( A3379ProForTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3379ProForTnq), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForTnq_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForCla_Internalname,GXutil.rtrim( A763ProForCla),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForCla_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtProForClv_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForClv_Internalname,GXutil.rtrim( A5358ProForClv),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForClv_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtProForClv_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes1WR2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_48_idx = ((subGrid_Islastpage==1)&&(nGXsfl_48_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_48_idx+1) ;
         sGXsfl_48_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_48_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_482( ) ;
      }
      /* End function sendrow_482 */
   }

   public void startgridcontrol48( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"48\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
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
         httpContext.writeValue( httpContext.getMessage( "Tq.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Clave I", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtProForClv_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Clave II", "")) ;
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
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV43GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A767ProForLin, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A770ProForPrd));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A765ProForDes));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A762ProForCan, (byte)(12), (byte)(5), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A488ForPrdDsc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1645ProForNro, (byte)(2), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3379ProForTnq, (byte)(2), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A763ProForCla));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5358ProForClv));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtProForClv_Visible, (byte)(5), (byte)(0), ".", "")));
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
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      bttBtninsert_Internalname = "BTNINSERT" ;
      bttBtnrenumerar_Internalname = "BTNRENUMERAR" ;
      divTableactions_Internalname = "TABLEACTIONS" ;
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      lblTextblockproforcod_Internalname = "TEXTBLOCKPROFORCOD" ;
      edtavProforcod_Internalname = "vPROFORCOD" ;
      divUnnamedtableproforcod_Internalname = "UNNAMEDTABLEPROFORCOD" ;
      lblTextblockprofordsc_Internalname = "TEXTBLOCKPROFORDSC" ;
      edtavProfordsc_Internalname = "vPROFORDSC" ;
      divUnnamedtableprofordsc_Internalname = "UNNAMEDTABLEPROFORDSC" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS" );
      edtProForLin_Internalname = "PROFORLIN" ;
      edtProForPrd_Internalname = "PROFORPRD" ;
      edtProForDes_Internalname = "PROFORDES" ;
      edtProForCan_Internalname = "PROFORCAN" ;
      edtForPrdDsc_Internalname = "FORPRDDSC" ;
      edtProForNro_Internalname = "PROFORNRO" ;
      edtProForTnq_Internalname = "PROFORTNQ" ;
      edtProForCla_Internalname = "PROFORCLA" ;
      edtProForClv_Internalname = "PROFORCLV" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGrid_Internalname = "GRID" ;
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
      subGrid_Allowcollapsing = (byte)(0) ;
      subGrid_Allowselection = (byte)(0) ;
      subGrid_Header = "" ;
      edtProForClv_Jsonclick = "" ;
      edtProForCla_Jsonclick = "" ;
      edtProForTnq_Jsonclick = "" ;
      edtProForNro_Jsonclick = "" ;
      edtForPrdDsc_Jsonclick = "" ;
      edtProForCan_Jsonclick = "" ;
      edtProForDes_Jsonclick = "" ;
      edtProForPrd_Jsonclick = "" ;
      edtProForLin_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      subGrid_Sortable = (byte)(0) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavProfordsc_Jsonclick = "" ;
      edtavProfordsc_Enabled = 0 ;
      edtavProforcod_Jsonclick = "" ;
      edtavProforcod_Enabled = 0 ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;" ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Infinitescrolling = "Form" ;
      Ddo_grid_Datalistproc = "FormulacionTinte.ProcesoQuimico_3GetFilterData" ;
      Ddo_grid_Datalisttype = "|Dynamic|Dynamic||Dynamic|||Dynamic|Dynamic" ;
      Ddo_grid_Includedatalist = "|T|T||T|||T|T" ;
      Ddo_grid_Filterisrange = "T|||T||T|T||" ;
      Ddo_grid_Filtertype = "Numeric|Character|Character|Numeric|Character|Numeric|Numeric|Character|Character" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "1|2|3|4|5|6|7|8|9" ;
      Ddo_grid_Columnids = "1:ProForLin|2:ProForPrd|3:ProForDes|4:ProForCan|5:ForPrdDsc|6:ProForNro|7:ProForTnq|8:ProForCla|9:ProForClv" ;
      Ddo_grid_Gridinternalname = "" ;
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
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( " Proceso Quimico (Lineas)", "") );
      edtProForClv_Visible = -1 ;
      subGrid_Rows = 50 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_48_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         AV43GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV43GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43GridActions), 4, 0));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'edtProForClv_Visible',ctrl:'PROFORCLV',prop:'Visible'},{av:'AV19TFProForLin',fld:'vTFPROFORLIN',pic:'ZZZ9'},{av:'AV20TFProForLin_To',fld:'vTFPROFORLIN_TO',pic:'ZZZ9'},{av:'AV21TFProForPrd',fld:'vTFPROFORPRD',pic:''},{av:'AV22TFProForPrd_Sel',fld:'vTFPROFORPRD_SEL',pic:''},{av:'AV23TFProForDes',fld:'vTFPROFORDES',pic:''},{av:'AV24TFProForDes_Sel',fld:'vTFPROFORDES_SEL',pic:''},{av:'AV29TFProForCan',fld:'vTFPROFORCAN',pic:'ZZZZZ9.9999'},{av:'AV30TFProForCan_To',fld:'vTFPROFORCAN_TO',pic:'ZZZZZ9.9999'},{av:'AV27TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV28TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV31TFProForNro',fld:'vTFPROFORNRO',pic:'Z9'},{av:'AV32TFProForNro_To',fld:'vTFPROFORNRO_TO',pic:'Z9'},{av:'AV33TFProForTnq',fld:'vTFPROFORTNQ',pic:'Z9'},{av:'AV34TFProForTnq_To',fld:'vTFPROFORTNQ_TO',pic:'Z9'},{av:'AV35TFProForCla',fld:'vTFPROFORCLA',pic:''},{av:'AV36TFProForCla_Sel',fld:'vTFPROFORCLA_SEL',pic:''},{av:'AV37TFProForClv',fld:'vTFPROFORCLV',pic:''},{av:'AV38TFProForClv_Sel',fld:'vTFPROFORCLV_SEL',pic:''},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8ProForCod',fld:'vPROFORCOD',pic:''},{av:'AV10ProForDsc2',fld:'vPROFORDSC2',pic:'',hsh:true},{av:'AV46Usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV45Station',fld:'vSTATION',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A764ProForCod',fld:'PROFORCOD',pic:'',hsh:true},{av:'AV9ProForDsc',fld:'vPROFORDSC',pic:'',hsh:true},{av:'AV50Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e111WR2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8ProForCod',fld:'vPROFORCOD',pic:''},{av:'AV19TFProForLin',fld:'vTFPROFORLIN',pic:'ZZZ9'},{av:'AV20TFProForLin_To',fld:'vTFPROFORLIN_TO',pic:'ZZZ9'},{av:'AV21TFProForPrd',fld:'vTFPROFORPRD',pic:''},{av:'AV22TFProForPrd_Sel',fld:'vTFPROFORPRD_SEL',pic:''},{av:'AV23TFProForDes',fld:'vTFPROFORDES',pic:''},{av:'AV24TFProForDes_Sel',fld:'vTFPROFORDES_SEL',pic:''},{av:'AV29TFProForCan',fld:'vTFPROFORCAN',pic:'ZZZZZ9.9999'},{av:'AV30TFProForCan_To',fld:'vTFPROFORCAN_TO',pic:'ZZZZZ9.9999'},{av:'AV27TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV28TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV31TFProForNro',fld:'vTFPROFORNRO',pic:'Z9'},{av:'AV32TFProForNro_To',fld:'vTFPROFORNRO_TO',pic:'Z9'},{av:'AV33TFProForTnq',fld:'vTFPROFORTNQ',pic:'Z9'},{av:'AV34TFProForTnq_To',fld:'vTFPROFORTNQ_TO',pic:'Z9'},{av:'AV35TFProForCla',fld:'vTFPROFORCLA',pic:''},{av:'AV36TFProForCla_Sel',fld:'vTFPROFORCLA_SEL',pic:''},{av:'AV37TFProForClv',fld:'vTFPROFORCLV',pic:''},{av:'AV38TFProForClv_Sel',fld:'vTFPROFORCLV_SEL',pic:''},{av:'AV50Pgmname',fld:'vPGMNAME',pic:''},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV9ProForDsc',fld:'vPROFORDSC',pic:'',hsh:true},{av:'AV10ProForDsc2',fld:'vPROFORDSC2',pic:'',hsh:true},{av:'edtProForClv_Visible',ctrl:'PROFORCLV',prop:'Visible'},{av:'AV46Usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV45Station',fld:'vSTATION',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A764ProForCod',fld:'PROFORCOD',pic:'',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV37TFProForClv',fld:'vTFPROFORCLV',pic:''},{av:'AV38TFProForClv_Sel',fld:'vTFPROFORCLV_SEL',pic:''},{av:'AV35TFProForCla',fld:'vTFPROFORCLA',pic:''},{av:'AV36TFProForCla_Sel',fld:'vTFPROFORCLA_SEL',pic:''},{av:'AV33TFProForTnq',fld:'vTFPROFORTNQ',pic:'Z9'},{av:'AV34TFProForTnq_To',fld:'vTFPROFORTNQ_TO',pic:'Z9'},{av:'AV31TFProForNro',fld:'vTFPROFORNRO',pic:'Z9'},{av:'AV32TFProForNro_To',fld:'vTFPROFORNRO_TO',pic:'Z9'},{av:'AV27TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV28TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV29TFProForCan',fld:'vTFPROFORCAN',pic:'ZZZZZ9.9999'},{av:'AV30TFProForCan_To',fld:'vTFPROFORCAN_TO',pic:'ZZZZZ9.9999'},{av:'AV23TFProForDes',fld:'vTFPROFORDES',pic:''},{av:'AV24TFProForDes_Sel',fld:'vTFPROFORDES_SEL',pic:''},{av:'AV21TFProForPrd',fld:'vTFPROFORPRD',pic:''},{av:'AV22TFProForPrd_Sel',fld:'vTFPROFORPRD_SEL',pic:''},{av:'AV19TFProForLin',fld:'vTFPROFORLIN',pic:'ZZZ9'},{av:'AV20TFProForLin_To',fld:'vTFPROFORLIN_TO',pic:'ZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e161WR2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV43GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e171WR2',iparms:[{av:'cmbavGridactions'},{av:'AV43GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8ProForCod',fld:'vPROFORCOD',pic:''},{av:'AV19TFProForLin',fld:'vTFPROFORLIN',pic:'ZZZ9'},{av:'AV20TFProForLin_To',fld:'vTFPROFORLIN_TO',pic:'ZZZ9'},{av:'AV21TFProForPrd',fld:'vTFPROFORPRD',pic:''},{av:'AV22TFProForPrd_Sel',fld:'vTFPROFORPRD_SEL',pic:''},{av:'AV23TFProForDes',fld:'vTFPROFORDES',pic:''},{av:'AV24TFProForDes_Sel',fld:'vTFPROFORDES_SEL',pic:''},{av:'AV29TFProForCan',fld:'vTFPROFORCAN',pic:'ZZZZZ9.9999'},{av:'AV30TFProForCan_To',fld:'vTFPROFORCAN_TO',pic:'ZZZZZ9.9999'},{av:'AV27TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV28TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV31TFProForNro',fld:'vTFPROFORNRO',pic:'Z9'},{av:'AV32TFProForNro_To',fld:'vTFPROFORNRO_TO',pic:'Z9'},{av:'AV33TFProForTnq',fld:'vTFPROFORTNQ',pic:'Z9'},{av:'AV34TFProForTnq_To',fld:'vTFPROFORTNQ_TO',pic:'Z9'},{av:'AV35TFProForCla',fld:'vTFPROFORCLA',pic:''},{av:'AV36TFProForCla_Sel',fld:'vTFPROFORCLA_SEL',pic:''},{av:'AV37TFProForClv',fld:'vTFPROFORCLV',pic:''},{av:'AV38TFProForClv_Sel',fld:'vTFPROFORCLV_SEL',pic:''},{av:'AV50Pgmname',fld:'vPGMNAME',pic:''},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV9ProForDsc',fld:'vPROFORDSC',pic:'',hsh:true},{av:'AV10ProForDsc2',fld:'vPROFORDSC2',pic:'',hsh:true},{av:'edtProForClv_Visible',ctrl:'PROFORCLV',prop:'Visible'},{av:'AV46Usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV45Station',fld:'vSTATION',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A764ProForCod',fld:'PROFORCOD',pic:'',hsh:true},{av:'A767ProForLin',fld:'PROFORLIN',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV43GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("'DOINSERT'","{handler:'e121WR2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8ProForCod',fld:'vPROFORCOD',pic:''},{av:'AV19TFProForLin',fld:'vTFPROFORLIN',pic:'ZZZ9'},{av:'AV20TFProForLin_To',fld:'vTFPROFORLIN_TO',pic:'ZZZ9'},{av:'AV21TFProForPrd',fld:'vTFPROFORPRD',pic:''},{av:'AV22TFProForPrd_Sel',fld:'vTFPROFORPRD_SEL',pic:''},{av:'AV23TFProForDes',fld:'vTFPROFORDES',pic:''},{av:'AV24TFProForDes_Sel',fld:'vTFPROFORDES_SEL',pic:''},{av:'AV29TFProForCan',fld:'vTFPROFORCAN',pic:'ZZZZZ9.9999'},{av:'AV30TFProForCan_To',fld:'vTFPROFORCAN_TO',pic:'ZZZZZ9.9999'},{av:'AV27TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV28TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV31TFProForNro',fld:'vTFPROFORNRO',pic:'Z9'},{av:'AV32TFProForNro_To',fld:'vTFPROFORNRO_TO',pic:'Z9'},{av:'AV33TFProForTnq',fld:'vTFPROFORTNQ',pic:'Z9'},{av:'AV34TFProForTnq_To',fld:'vTFPROFORTNQ_TO',pic:'Z9'},{av:'AV35TFProForCla',fld:'vTFPROFORCLA',pic:''},{av:'AV36TFProForCla_Sel',fld:'vTFPROFORCLA_SEL',pic:''},{av:'AV37TFProForClv',fld:'vTFPROFORCLV',pic:''},{av:'AV38TFProForClv_Sel',fld:'vTFPROFORCLV_SEL',pic:''},{av:'AV50Pgmname',fld:'vPGMNAME',pic:''},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV9ProForDsc',fld:'vPROFORDSC',pic:'',hsh:true},{av:'AV10ProForDsc2',fld:'vPROFORDSC2',pic:'',hsh:true},{av:'edtProForClv_Visible',ctrl:'PROFORCLV',prop:'Visible'},{av:'AV46Usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV45Station',fld:'vSTATION',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A764ProForCod',fld:'PROFORCOD',pic:'',hsh:true},{av:'A767ProForLin',fld:'PROFORLIN',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("'DOINSERT'",",oparms:[]}");
      setEventMetadata("'DORENUMERAR'","{handler:'e131WR2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8ProForCod',fld:'vPROFORCOD',pic:''},{av:'AV19TFProForLin',fld:'vTFPROFORLIN',pic:'ZZZ9'},{av:'AV20TFProForLin_To',fld:'vTFPROFORLIN_TO',pic:'ZZZ9'},{av:'AV21TFProForPrd',fld:'vTFPROFORPRD',pic:''},{av:'AV22TFProForPrd_Sel',fld:'vTFPROFORPRD_SEL',pic:''},{av:'AV23TFProForDes',fld:'vTFPROFORDES',pic:''},{av:'AV24TFProForDes_Sel',fld:'vTFPROFORDES_SEL',pic:''},{av:'AV29TFProForCan',fld:'vTFPROFORCAN',pic:'ZZZZZ9.9999'},{av:'AV30TFProForCan_To',fld:'vTFPROFORCAN_TO',pic:'ZZZZZ9.9999'},{av:'AV27TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV28TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV31TFProForNro',fld:'vTFPROFORNRO',pic:'Z9'},{av:'AV32TFProForNro_To',fld:'vTFPROFORNRO_TO',pic:'Z9'},{av:'AV33TFProForTnq',fld:'vTFPROFORTNQ',pic:'Z9'},{av:'AV34TFProForTnq_To',fld:'vTFPROFORTNQ_TO',pic:'Z9'},{av:'AV35TFProForCla',fld:'vTFPROFORCLA',pic:''},{av:'AV36TFProForCla_Sel',fld:'vTFPROFORCLA_SEL',pic:''},{av:'AV37TFProForClv',fld:'vTFPROFORCLV',pic:''},{av:'AV38TFProForClv_Sel',fld:'vTFPROFORCLV_SEL',pic:''},{av:'AV50Pgmname',fld:'vPGMNAME',pic:''},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV9ProForDsc',fld:'vPROFORDSC',pic:'',hsh:true},{av:'AV10ProForDsc2',fld:'vPROFORDSC2',pic:'',hsh:true},{av:'edtProForClv_Visible',ctrl:'PROFORCLV',prop:'Visible'},{av:'AV46Usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV45Station',fld:'vSTATION',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A764ProForCod',fld:'PROFORCOD',pic:'',hsh:true}]");
      setEventMetadata("'DORENUMERAR'",",oparms:[{av:'AV8ProForCod',fld:'vPROFORCOD',pic:''},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'edtProForClv_Visible',ctrl:'PROFORCLV',prop:'Visible'},{av:'AV46Usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV45Station',fld:'vSTATION',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A764ProForCod',fld:'PROFORCOD',pic:'',hsh:true},{av:'AV19TFProForLin',fld:'vTFPROFORLIN',pic:'ZZZ9'},{av:'AV20TFProForLin_To',fld:'vTFPROFORLIN_TO',pic:'ZZZ9'},{av:'AV21TFProForPrd',fld:'vTFPROFORPRD',pic:''},{av:'AV22TFProForPrd_Sel',fld:'vTFPROFORPRD_SEL',pic:''},{av:'AV23TFProForDes',fld:'vTFPROFORDES',pic:''},{av:'AV24TFProForDes_Sel',fld:'vTFPROFORDES_SEL',pic:''},{av:'AV29TFProForCan',fld:'vTFPROFORCAN',pic:'ZZZZZ9.9999'},{av:'AV30TFProForCan_To',fld:'vTFPROFORCAN_TO',pic:'ZZZZZ9.9999'},{av:'AV27TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV28TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV31TFProForNro',fld:'vTFPROFORNRO',pic:'Z9'},{av:'AV32TFProForNro_To',fld:'vTFPROFORNRO_TO',pic:'Z9'},{av:'AV33TFProForTnq',fld:'vTFPROFORTNQ',pic:'Z9'},{av:'AV34TFProForTnq_To',fld:'vTFPROFORTNQ_TO',pic:'Z9'},{av:'AV35TFProForCla',fld:'vTFPROFORCLA',pic:''},{av:'AV36TFProForCla_Sel',fld:'vTFPROFORCLA_SEL',pic:''},{av:'AV37TFProForClv',fld:'vTFPROFORCLV',pic:''},{av:'AV38TFProForClv_Sel',fld:'vTFPROFORCLV_SEL',pic:''},{av:'AV50Pgmname',fld:'vPGMNAME',pic:''},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8ProForCod',fld:'vPROFORCOD',pic:''},{av:'AV9ProForDsc',fld:'vPROFORDSC',pic:'',hsh:true},{av:'AV10ProForDsc2',fld:'vPROFORDSC2',pic:'',hsh:true}]");
      setEventMetadata("GRID_FIRSTPAGE",",oparms:[]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'edtProForClv_Visible',ctrl:'PROFORCLV',prop:'Visible'},{av:'AV46Usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV45Station',fld:'vSTATION',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A764ProForCod',fld:'PROFORCOD',pic:'',hsh:true},{av:'AV19TFProForLin',fld:'vTFPROFORLIN',pic:'ZZZ9'},{av:'AV20TFProForLin_To',fld:'vTFPROFORLIN_TO',pic:'ZZZ9'},{av:'AV21TFProForPrd',fld:'vTFPROFORPRD',pic:''},{av:'AV22TFProForPrd_Sel',fld:'vTFPROFORPRD_SEL',pic:''},{av:'AV23TFProForDes',fld:'vTFPROFORDES',pic:''},{av:'AV24TFProForDes_Sel',fld:'vTFPROFORDES_SEL',pic:''},{av:'AV29TFProForCan',fld:'vTFPROFORCAN',pic:'ZZZZZ9.9999'},{av:'AV30TFProForCan_To',fld:'vTFPROFORCAN_TO',pic:'ZZZZZ9.9999'},{av:'AV27TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV28TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV31TFProForNro',fld:'vTFPROFORNRO',pic:'Z9'},{av:'AV32TFProForNro_To',fld:'vTFPROFORNRO_TO',pic:'Z9'},{av:'AV33TFProForTnq',fld:'vTFPROFORTNQ',pic:'Z9'},{av:'AV34TFProForTnq_To',fld:'vTFPROFORTNQ_TO',pic:'Z9'},{av:'AV35TFProForCla',fld:'vTFPROFORCLA',pic:''},{av:'AV36TFProForCla_Sel',fld:'vTFPROFORCLA_SEL',pic:''},{av:'AV37TFProForClv',fld:'vTFPROFORCLV',pic:''},{av:'AV38TFProForClv_Sel',fld:'vTFPROFORCLV_SEL',pic:''},{av:'AV50Pgmname',fld:'vPGMNAME',pic:''},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8ProForCod',fld:'vPROFORCOD',pic:''},{av:'AV9ProForDsc',fld:'vPROFORDSC',pic:'',hsh:true},{av:'AV10ProForDsc2',fld:'vPROFORDSC2',pic:'',hsh:true}]");
      setEventMetadata("GRID_PREVPAGE",",oparms:[]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'edtProForClv_Visible',ctrl:'PROFORCLV',prop:'Visible'},{av:'AV46Usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV45Station',fld:'vSTATION',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A764ProForCod',fld:'PROFORCOD',pic:'',hsh:true},{av:'AV19TFProForLin',fld:'vTFPROFORLIN',pic:'ZZZ9'},{av:'AV20TFProForLin_To',fld:'vTFPROFORLIN_TO',pic:'ZZZ9'},{av:'AV21TFProForPrd',fld:'vTFPROFORPRD',pic:''},{av:'AV22TFProForPrd_Sel',fld:'vTFPROFORPRD_SEL',pic:''},{av:'AV23TFProForDes',fld:'vTFPROFORDES',pic:''},{av:'AV24TFProForDes_Sel',fld:'vTFPROFORDES_SEL',pic:''},{av:'AV29TFProForCan',fld:'vTFPROFORCAN',pic:'ZZZZZ9.9999'},{av:'AV30TFProForCan_To',fld:'vTFPROFORCAN_TO',pic:'ZZZZZ9.9999'},{av:'AV27TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV28TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV31TFProForNro',fld:'vTFPROFORNRO',pic:'Z9'},{av:'AV32TFProForNro_To',fld:'vTFPROFORNRO_TO',pic:'Z9'},{av:'AV33TFProForTnq',fld:'vTFPROFORTNQ',pic:'Z9'},{av:'AV34TFProForTnq_To',fld:'vTFPROFORTNQ_TO',pic:'Z9'},{av:'AV35TFProForCla',fld:'vTFPROFORCLA',pic:''},{av:'AV36TFProForCla_Sel',fld:'vTFPROFORCLA_SEL',pic:''},{av:'AV37TFProForClv',fld:'vTFPROFORCLV',pic:''},{av:'AV38TFProForClv_Sel',fld:'vTFPROFORCLV_SEL',pic:''},{av:'AV50Pgmname',fld:'vPGMNAME',pic:''},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8ProForCod',fld:'vPROFORCOD',pic:''},{av:'AV9ProForDsc',fld:'vPROFORDSC',pic:'',hsh:true},{av:'AV10ProForDsc2',fld:'vPROFORDSC2',pic:'',hsh:true}]");
      setEventMetadata("GRID_NEXTPAGE",",oparms:[]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'edtProForClv_Visible',ctrl:'PROFORCLV',prop:'Visible'},{av:'AV46Usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV45Station',fld:'vSTATION',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A764ProForCod',fld:'PROFORCOD',pic:'',hsh:true},{av:'AV19TFProForLin',fld:'vTFPROFORLIN',pic:'ZZZ9'},{av:'AV20TFProForLin_To',fld:'vTFPROFORLIN_TO',pic:'ZZZ9'},{av:'AV21TFProForPrd',fld:'vTFPROFORPRD',pic:''},{av:'AV22TFProForPrd_Sel',fld:'vTFPROFORPRD_SEL',pic:''},{av:'AV23TFProForDes',fld:'vTFPROFORDES',pic:''},{av:'AV24TFProForDes_Sel',fld:'vTFPROFORDES_SEL',pic:''},{av:'AV29TFProForCan',fld:'vTFPROFORCAN',pic:'ZZZZZ9.9999'},{av:'AV30TFProForCan_To',fld:'vTFPROFORCAN_TO',pic:'ZZZZZ9.9999'},{av:'AV27TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV28TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV31TFProForNro',fld:'vTFPROFORNRO',pic:'Z9'},{av:'AV32TFProForNro_To',fld:'vTFPROFORNRO_TO',pic:'Z9'},{av:'AV33TFProForTnq',fld:'vTFPROFORTNQ',pic:'Z9'},{av:'AV34TFProForTnq_To',fld:'vTFPROFORTNQ_TO',pic:'Z9'},{av:'AV35TFProForCla',fld:'vTFPROFORCLA',pic:''},{av:'AV36TFProForCla_Sel',fld:'vTFPROFORCLA_SEL',pic:''},{av:'AV37TFProForClv',fld:'vTFPROFORCLV',pic:''},{av:'AV38TFProForClv_Sel',fld:'vTFPROFORCLV_SEL',pic:''},{av:'AV50Pgmname',fld:'vPGMNAME',pic:''},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8ProForCod',fld:'vPROFORCOD',pic:''},{av:'AV9ProForDsc',fld:'vPROFORDSC',pic:'',hsh:true},{av:'AV10ProForDsc2',fld:'vPROFORDSC2',pic:'',hsh:true}]");
      setEventMetadata("GRID_LASTPAGE",",oparms:[]}");
      setEventMetadata("VALIDV_PROFORCOD","{handler:'validv_Proforcod',iparms:[]");
      setEventMetadata("VALIDV_PROFORCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Proforclv',iparms:[]");
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
      wcpOAV8ProForCod = "" ;
      wcpOAV9ProForDsc = "" ;
      wcpOAV10ProForDsc2 = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV7Emprcod = "" ;
      AV8ProForCod = "" ;
      AV9ProForDsc = "" ;
      AV10ProForDsc2 = "" ;
      AV21TFProForPrd = "" ;
      AV22TFProForPrd_Sel = "" ;
      AV23TFProForDes = "" ;
      AV24TFProForDes_Sel = "" ;
      AV29TFProForCan = DecimalUtil.ZERO ;
      AV30TFProForCan_To = DecimalUtil.ZERO ;
      AV27TFForPrdDsc = "" ;
      AV28TFForPrdDsc_Sel = "" ;
      AV35TFProForCla = "" ;
      AV36TFProForCla_Sel = "" ;
      AV37TFProForClv = "" ;
      AV38TFProForClv_Sel = "" ;
      AV50Pgmname = "" ;
      AV46Usurcod = "" ;
      AV45Station = "" ;
      A396EmprCod = "" ;
      A764ProForCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV39DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtninsert_Jsonclick = "" ;
      bttBtnrenumerar_Jsonclick = "" ;
      lblTextblockproforcod_Jsonclick = "" ;
      lblTextblockprofordsc_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV54Formulaciontinte_procesoquimico_3ds_3_tfproforprd = "" ;
      AV55Formulaciontinte_procesoquimico_3ds_4_tfproforprd_sel = "" ;
      AV56Formulaciontinte_procesoquimico_3ds_5_tfprofordes = "" ;
      AV57Formulaciontinte_procesoquimico_3ds_6_tfprofordes_sel = "" ;
      AV58Formulaciontinte_procesoquimico_3ds_7_tfproforcan = DecimalUtil.ZERO ;
      AV59Formulaciontinte_procesoquimico_3ds_8_tfproforcan_to = DecimalUtil.ZERO ;
      AV60Formulaciontinte_procesoquimico_3ds_9_tfforprddsc = "" ;
      AV61Formulaciontinte_procesoquimico_3ds_10_tfforprddsc_sel = "" ;
      AV66Formulaciontinte_procesoquimico_3ds_15_tfproforcla = "" ;
      AV67Formulaciontinte_procesoquimico_3ds_16_tfproforcla_sel = "" ;
      AV68Formulaciontinte_procesoquimico_3ds_17_tfproforclv = "" ;
      AV69Formulaciontinte_procesoquimico_3ds_18_tfproforclv_sel = "" ;
      A770ProForPrd = "" ;
      A765ProForDes = "" ;
      A762ProForCan = DecimalUtil.ZERO ;
      A488ForPrdDsc = "" ;
      A763ProForCla = "" ;
      A5358ProForClv = "" ;
      GXCCtl = "" ;
      scmdbuf = "" ;
      lV54Formulaciontinte_procesoquimico_3ds_3_tfproforprd = "" ;
      lV56Formulaciontinte_procesoquimico_3ds_5_tfprofordes = "" ;
      lV60Formulaciontinte_procesoquimico_3ds_9_tfforprddsc = "" ;
      lV66Formulaciontinte_procesoquimico_3ds_15_tfproforcla = "" ;
      lV68Formulaciontinte_procesoquimico_3ds_17_tfproforclv = "" ;
      H01WR2_A490ForPrdUMe = new byte[1] ;
      H01WR2_A396EmprCod = new String[] {""} ;
      H01WR2_A764ProForCod = new String[] {""} ;
      H01WR2_A5358ProForClv = new String[] {""} ;
      H01WR2_A763ProForCla = new String[] {""} ;
      H01WR2_A3379ProForTnq = new byte[1] ;
      H01WR2_A1645ProForNro = new byte[1] ;
      H01WR2_A488ForPrdDsc = new String[] {""} ;
      H01WR2_n488ForPrdDsc = new boolean[] {false} ;
      H01WR2_A762ProForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01WR2_A765ProForDes = new String[] {""} ;
      H01WR2_A770ProForPrd = new String[] {""} ;
      H01WR2_A767ProForLin = new short[1] ;
      H01WR3_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV51Emprnom = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      GXv_int8 = new byte[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      Gx_msg = "" ;
      AV44Window = new com.genexus.webpanels.GXWindow();
      AV18Session = httpContext.getWebSession();
      AV14GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV15GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char14 = "" ;
      GXv_char15 = new String[1] ;
      GXt_char12 = "" ;
      GXv_char13 = new String[1] ;
      GXt_char11 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char10 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV12TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV11HTTPRequest = httpContext.getHttpRequest();
      GXv_SdtWWPGridState16 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.procesoquimico_3__default(),
         new Object[] {
             new Object[] {
            H01WR2_A490ForPrdUMe, H01WR2_A396EmprCod, H01WR2_A764ProForCod, H01WR2_A5358ProForClv, H01WR2_A763ProForCla, H01WR2_A3379ProForTnq, H01WR2_A1645ProForNro, H01WR2_A488ForPrdDsc, H01WR2_n488ForPrdDsc, H01WR2_A762ProForCan,
            H01WR2_A765ProForDes, H01WR2_A770ProForPrd, H01WR2_A767ProForLin
            }
            , new Object[] {
            H01WR3_AGRID_nRecordCount
            }
         }
      );
      AV50Pgmname = "FormulacionTinte.ProcesoQuimico_3" ;
      /* GeneXus formulas. */
      AV50Pgmname = "FormulacionTinte.ProcesoQuimico_3" ;
      Gx_err = (short)(0) ;
      edtavProforcod_Enabled = 0 ;
      edtavProfordsc_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV31TFProForNro ;
   private byte AV32TFProForNro_To ;
   private byte AV33TFProForTnq ;
   private byte AV34TFProForTnq_To ;
   private byte gxajaxcallmode ;
   private byte AV62Formulaciontinte_procesoquimico_3ds_11_tfprofornro ;
   private byte AV63Formulaciontinte_procesoquimico_3ds_12_tfprofornro_to ;
   private byte AV64Formulaciontinte_procesoquimico_3ds_13_tfprofortnq ;
   private byte AV65Formulaciontinte_procesoquimico_3ds_14_tfprofortnq_to ;
   private byte A1645ProForNro ;
   private byte A3379ProForTnq ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte A490ForPrdUMe ;
   private byte AV47Clave2 ;
   private byte GXt_int7 ;
   private byte GXv_int8[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV19TFProForLin ;
   private short AV20TFProForLin_To ;
   private short AV16OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV52Formulaciontinte_procesoquimico_3ds_1_tfproforlin ;
   private short AV53Formulaciontinte_procesoquimico_3ds_2_tfproforlin_to ;
   private short AV43GridActions ;
   private short A767ProForLin ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int edtProForClv_Visible ;
   private int nRC_GXsfl_48 ;
   private int subGrid_Rows ;
   private int nGXsfl_48_idx=1 ;
   private int edtavProforcod_Enabled ;
   private int edtavProfordsc_Enabled ;
   private int edtavPgmname_Enabled ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV71GXV1 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV29TFProForCan ;
   private java.math.BigDecimal AV30TFProForCan_To ;
   private java.math.BigDecimal AV58Formulaciontinte_procesoquimico_3ds_7_tfproforcan ;
   private java.math.BigDecimal AV59Formulaciontinte_procesoquimico_3ds_8_tfproforcan_to ;
   private java.math.BigDecimal A762ProForCan ;
   private String wcpOAV7Emprcod ;
   private String wcpOAV8ProForCod ;
   private String wcpOAV9ProForDsc ;
   private String wcpOAV10ProForDsc2 ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV7Emprcod ;
   private String AV8ProForCod ;
   private String AV9ProForDsc ;
   private String AV10ProForDsc2 ;
   private String sGXsfl_48_idx="0001" ;
   private String edtProForClv_Internalname ;
   private String AV21TFProForPrd ;
   private String AV22TFProForPrd_Sel ;
   private String AV23TFProForDes ;
   private String AV24TFProForDes_Sel ;
   private String AV27TFForPrdDsc ;
   private String AV28TFForPrdDsc_Sel ;
   private String AV35TFProForCla ;
   private String AV36TFProForCla_Sel ;
   private String AV37TFProForClv ;
   private String AV38TFProForClv_Sel ;
   private String AV50Pgmname ;
   private String AV46Usurcod ;
   private String AV45Station ;
   private String A396EmprCod ;
   private String A764ProForCod ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Dvpanel_tableheader_Width ;
   private String Dvpanel_tableheader_Cls ;
   private String Dvpanel_tableheader_Title ;
   private String Dvpanel_tableheader_Iconposition ;
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
   private String Grid_empowerer_Infinitescrolling ;
   private String Grid_empowerer_Fixedcolumns ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divTableactions_Internalname ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtninsert_Internalname ;
   private String bttBtninsert_Jsonclick ;
   private String bttBtnrenumerar_Internalname ;
   private String bttBtnrenumerar_Jsonclick ;
   private String divUnnamedtableproforcod_Internalname ;
   private String lblTextblockproforcod_Internalname ;
   private String lblTextblockproforcod_Jsonclick ;
   private String edtavProforcod_Internalname ;
   private String edtavProforcod_Jsonclick ;
   private String divUnnamedtableprofordsc_Internalname ;
   private String lblTextblockprofordsc_Internalname ;
   private String lblTextblockprofordsc_Jsonclick ;
   private String edtavProfordsc_Internalname ;
   private String edtavProfordsc_Jsonclick ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV54Formulaciontinte_procesoquimico_3ds_3_tfproforprd ;
   private String AV55Formulaciontinte_procesoquimico_3ds_4_tfproforprd_sel ;
   private String AV56Formulaciontinte_procesoquimico_3ds_5_tfprofordes ;
   private String AV57Formulaciontinte_procesoquimico_3ds_6_tfprofordes_sel ;
   private String AV60Formulaciontinte_procesoquimico_3ds_9_tfforprddsc ;
   private String AV61Formulaciontinte_procesoquimico_3ds_10_tfforprddsc_sel ;
   private String AV66Formulaciontinte_procesoquimico_3ds_15_tfproforcla ;
   private String AV67Formulaciontinte_procesoquimico_3ds_16_tfproforcla_sel ;
   private String AV68Formulaciontinte_procesoquimico_3ds_17_tfproforclv ;
   private String AV69Formulaciontinte_procesoquimico_3ds_18_tfproforclv_sel ;
   private String edtProForLin_Internalname ;
   private String A770ProForPrd ;
   private String edtProForPrd_Internalname ;
   private String A765ProForDes ;
   private String edtProForDes_Internalname ;
   private String edtProForCan_Internalname ;
   private String A488ForPrdDsc ;
   private String edtForPrdDsc_Internalname ;
   private String edtProForNro_Internalname ;
   private String edtProForTnq_Internalname ;
   private String A763ProForCla ;
   private String edtProForCla_Internalname ;
   private String A5358ProForClv ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String lV54Formulaciontinte_procesoquimico_3ds_3_tfproforprd ;
   private String lV56Formulaciontinte_procesoquimico_3ds_5_tfprofordes ;
   private String lV60Formulaciontinte_procesoquimico_3ds_9_tfforprddsc ;
   private String lV66Formulaciontinte_procesoquimico_3ds_15_tfproforcla ;
   private String lV68Formulaciontinte_procesoquimico_3ds_17_tfproforclv ;
   private String hsh ;
   private String AV51Emprnom ;
   private String Gx_msg ;
   private String GXt_char14 ;
   private String GXv_char15[] ;
   private String GXt_char12 ;
   private String GXv_char13[] ;
   private String GXt_char11 ;
   private String GXv_char4[] ;
   private String GXt_char10 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblTablerightheader_Internalname ;
   private String sGXsfl_48_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtProForLin_Jsonclick ;
   private String edtProForPrd_Jsonclick ;
   private String edtProForDes_Jsonclick ;
   private String edtProForCan_Jsonclick ;
   private String edtForPrdDsc_Jsonclick ;
   private String edtProForNro_Jsonclick ;
   private String edtProForTnq_Jsonclick ;
   private String edtProForCla_Jsonclick ;
   private String edtProForClv_Jsonclick ;
   private String subGrid_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean bGXsfl_48_Refreshing=false ;
   private boolean AV17OrderedDsc ;
   private boolean Dvpanel_tableheader_Autowidth ;
   private boolean Dvpanel_tableheader_Autoheight ;
   private boolean Dvpanel_tableheader_Collapsible ;
   private boolean Dvpanel_tableheader_Collapsed ;
   private boolean Dvpanel_tableheader_Showcollapseicon ;
   private boolean Dvpanel_tableheader_Autoscroll ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n488ForPrdDsc ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean Cond_result ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWindow AV44Window ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV11HTTPRequest ;
   private com.genexus.webpanels.WebSession AV18Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavGridactions ;
   private IDataStoreProvider pr_default ;
   private byte[] H01WR2_A490ForPrdUMe ;
   private String[] H01WR2_A396EmprCod ;
   private String[] H01WR2_A764ProForCod ;
   private String[] H01WR2_A5358ProForClv ;
   private String[] H01WR2_A763ProForCla ;
   private byte[] H01WR2_A3379ProForTnq ;
   private byte[] H01WR2_A1645ProForNro ;
   private String[] H01WR2_A488ForPrdDsc ;
   private boolean[] H01WR2_n488ForPrdDsc ;
   private java.math.BigDecimal[] H01WR2_A762ProForCan ;
   private String[] H01WR2_A765ProForDes ;
   private String[] H01WR2_A770ProForPrd ;
   private short[] H01WR2_A767ProForLin ;
   private long[] H01WR3_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV12TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV14GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState16[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV15GridStateFilterValue ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV39DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class procesoquimico_3__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01WR2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV52Formulaciontinte_procesoquimico_3ds_1_tfproforlin ,
                                          short AV53Formulaciontinte_procesoquimico_3ds_2_tfproforlin_to ,
                                          String AV55Formulaciontinte_procesoquimico_3ds_4_tfproforprd_sel ,
                                          String AV54Formulaciontinte_procesoquimico_3ds_3_tfproforprd ,
                                          String AV57Formulaciontinte_procesoquimico_3ds_6_tfprofordes_sel ,
                                          String AV56Formulaciontinte_procesoquimico_3ds_5_tfprofordes ,
                                          java.math.BigDecimal AV58Formulaciontinte_procesoquimico_3ds_7_tfproforcan ,
                                          java.math.BigDecimal AV59Formulaciontinte_procesoquimico_3ds_8_tfproforcan_to ,
                                          String AV61Formulaciontinte_procesoquimico_3ds_10_tfforprddsc_sel ,
                                          String AV60Formulaciontinte_procesoquimico_3ds_9_tfforprddsc ,
                                          byte AV62Formulaciontinte_procesoquimico_3ds_11_tfprofornro ,
                                          byte AV63Formulaciontinte_procesoquimico_3ds_12_tfprofornro_to ,
                                          byte AV64Formulaciontinte_procesoquimico_3ds_13_tfprofortnq ,
                                          byte AV65Formulaciontinte_procesoquimico_3ds_14_tfprofortnq_to ,
                                          String AV67Formulaciontinte_procesoquimico_3ds_16_tfproforcla_sel ,
                                          String AV66Formulaciontinte_procesoquimico_3ds_15_tfproforcla ,
                                          String AV69Formulaciontinte_procesoquimico_3ds_18_tfproforclv_sel ,
                                          String AV68Formulaciontinte_procesoquimico_3ds_17_tfproforclv ,
                                          short A767ProForLin ,
                                          String A770ProForPrd ,
                                          String A765ProForDes ,
                                          java.math.BigDecimal A762ProForCan ,
                                          String A488ForPrdDsc ,
                                          byte A1645ProForNro ,
                                          byte A3379ProForTnq ,
                                          String A763ProForCla ,
                                          String A5358ProForClv ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV7Emprcod ,
                                          String AV8ProForCod ,
                                          String A396EmprCod ,
                                          String A764ProForCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[25];
      Object[] GXv_Object18 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " /*+ FIRST_ROWS(51) */ T1.ForPrdUMe, T1.EmprCod, T1.ProForCod, T1.ProForClv, T1.ProForCla, T1.ProForTnq, T1.ProForNro, T2.ForPrdDsc, T1.ProForCan, T1.ProForDes," ;
      sSelectString += " T1.ProForPrd, T1.ProForLin" ;
      sFromString = " FROM (TXPLPROFO T1 INNER JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.ProForCod = ?)");
      if ( ! (0==AV52Formulaciontinte_procesoquimico_3ds_1_tfproforlin) )
      {
         addWhere(sWhereString, "(T1.ProForLin >= ?)");
      }
      else
      {
         GXv_int17[2] = (byte)(1) ;
      }
      if ( ! (0==AV53Formulaciontinte_procesoquimico_3ds_2_tfproforlin_to) )
      {
         addWhere(sWhereString, "(T1.ProForLin <= ?)");
      }
      else
      {
         GXv_int17[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Formulaciontinte_procesoquimico_3ds_4_tfproforprd_sel)==0) && ( ! (GXutil.strcmp("", AV54Formulaciontinte_procesoquimico_3ds_3_tfproforprd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForPrd) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Formulaciontinte_procesoquimico_3ds_4_tfproforprd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForPrd = ?)");
      }
      else
      {
         GXv_int17[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Formulaciontinte_procesoquimico_3ds_6_tfprofordes_sel)==0) && ( ! (GXutil.strcmp("", AV56Formulaciontinte_procesoquimico_3ds_5_tfprofordes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Formulaciontinte_procesoquimico_3ds_6_tfprofordes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForDes = ?)");
      }
      else
      {
         GXv_int17[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58Formulaciontinte_procesoquimico_3ds_7_tfproforcan)==0) )
      {
         addWhere(sWhereString, "(T1.ProForCan >= ?)");
      }
      else
      {
         GXv_int17[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59Formulaciontinte_procesoquimico_3ds_8_tfproforcan_to)==0) )
      {
         addWhere(sWhereString, "(T1.ProForCan <= ?)");
      }
      else
      {
         GXv_int17[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Formulaciontinte_procesoquimico_3ds_10_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV60Formulaciontinte_procesoquimico_3ds_9_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Formulaciontinte_procesoquimico_3ds_10_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int17[11] = (byte)(1) ;
      }
      if ( ! (0==AV62Formulaciontinte_procesoquimico_3ds_11_tfprofornro) )
      {
         addWhere(sWhereString, "(T1.ProForNro >= ?)");
      }
      else
      {
         GXv_int17[12] = (byte)(1) ;
      }
      if ( ! (0==AV63Formulaciontinte_procesoquimico_3ds_12_tfprofornro_to) )
      {
         addWhere(sWhereString, "(T1.ProForNro <= ?)");
      }
      else
      {
         GXv_int17[13] = (byte)(1) ;
      }
      if ( ! (0==AV64Formulaciontinte_procesoquimico_3ds_13_tfprofortnq) )
      {
         addWhere(sWhereString, "(T1.ProForTnq >= ?)");
      }
      else
      {
         GXv_int17[14] = (byte)(1) ;
      }
      if ( ! (0==AV65Formulaciontinte_procesoquimico_3ds_14_tfprofortnq_to) )
      {
         addWhere(sWhereString, "(T1.ProForTnq <= ?)");
      }
      else
      {
         GXv_int17[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Formulaciontinte_procesoquimico_3ds_16_tfproforcla_sel)==0) && ( ! (GXutil.strcmp("", AV66Formulaciontinte_procesoquimico_3ds_15_tfproforcla)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForCla) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Formulaciontinte_procesoquimico_3ds_16_tfproforcla_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForCla = ?)");
      }
      else
      {
         GXv_int17[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Formulaciontinte_procesoquimico_3ds_18_tfproforclv_sel)==0) && ( ! (GXutil.strcmp("", AV68Formulaciontinte_procesoquimico_3ds_17_tfproforclv)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForClv) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Formulaciontinte_procesoquimico_3ds_18_tfproforclv_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForClv = ?)");
      }
      else
      {
         GXv_int17[19] = (byte)(1) ;
      }
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ProForLin" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ProForLin DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ProForPrd" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ProForPrd DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ProForDes" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ProForDes DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ProForCan" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ProForCan DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         sOrderString += " ORDER BY T2.ForPrdDsc" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.ForPrdDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ProForNro" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ProForNro DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ProForTnq" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ProForTnq DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ProForCla" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ProForCla DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ProForClv" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ProForClv DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.ProForCod, T1.ProForLin" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
   }

   protected Object[] conditional_H01WR3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV52Formulaciontinte_procesoquimico_3ds_1_tfproforlin ,
                                          short AV53Formulaciontinte_procesoquimico_3ds_2_tfproforlin_to ,
                                          String AV55Formulaciontinte_procesoquimico_3ds_4_tfproforprd_sel ,
                                          String AV54Formulaciontinte_procesoquimico_3ds_3_tfproforprd ,
                                          String AV57Formulaciontinte_procesoquimico_3ds_6_tfprofordes_sel ,
                                          String AV56Formulaciontinte_procesoquimico_3ds_5_tfprofordes ,
                                          java.math.BigDecimal AV58Formulaciontinte_procesoquimico_3ds_7_tfproforcan ,
                                          java.math.BigDecimal AV59Formulaciontinte_procesoquimico_3ds_8_tfproforcan_to ,
                                          String AV61Formulaciontinte_procesoquimico_3ds_10_tfforprddsc_sel ,
                                          String AV60Formulaciontinte_procesoquimico_3ds_9_tfforprddsc ,
                                          byte AV62Formulaciontinte_procesoquimico_3ds_11_tfprofornro ,
                                          byte AV63Formulaciontinte_procesoquimico_3ds_12_tfprofornro_to ,
                                          byte AV64Formulaciontinte_procesoquimico_3ds_13_tfprofortnq ,
                                          byte AV65Formulaciontinte_procesoquimico_3ds_14_tfprofortnq_to ,
                                          String AV67Formulaciontinte_procesoquimico_3ds_16_tfproforcla_sel ,
                                          String AV66Formulaciontinte_procesoquimico_3ds_15_tfproforcla ,
                                          String AV69Formulaciontinte_procesoquimico_3ds_18_tfproforclv_sel ,
                                          String AV68Formulaciontinte_procesoquimico_3ds_17_tfproforclv ,
                                          short A767ProForLin ,
                                          String A770ProForPrd ,
                                          String A765ProForDes ,
                                          java.math.BigDecimal A762ProForCan ,
                                          String A488ForPrdDsc ,
                                          byte A1645ProForNro ,
                                          byte A3379ProForTnq ,
                                          String A763ProForCla ,
                                          String A5358ProForClv ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV7Emprcod ,
                                          String AV8ProForCod ,
                                          String A396EmprCod ,
                                          String A764ProForCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int19 = new byte[20];
      Object[] GXv_Object20 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPLPROFO T1 INNER JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.ProForCod = ?)");
      if ( ! (0==AV52Formulaciontinte_procesoquimico_3ds_1_tfproforlin) )
      {
         addWhere(sWhereString, "(T1.ProForLin >= ?)");
      }
      else
      {
         GXv_int19[2] = (byte)(1) ;
      }
      if ( ! (0==AV53Formulaciontinte_procesoquimico_3ds_2_tfproforlin_to) )
      {
         addWhere(sWhereString, "(T1.ProForLin <= ?)");
      }
      else
      {
         GXv_int19[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Formulaciontinte_procesoquimico_3ds_4_tfproforprd_sel)==0) && ( ! (GXutil.strcmp("", AV54Formulaciontinte_procesoquimico_3ds_3_tfproforprd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForPrd) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Formulaciontinte_procesoquimico_3ds_4_tfproforprd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForPrd = ?)");
      }
      else
      {
         GXv_int19[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Formulaciontinte_procesoquimico_3ds_6_tfprofordes_sel)==0) && ( ! (GXutil.strcmp("", AV56Formulaciontinte_procesoquimico_3ds_5_tfprofordes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Formulaciontinte_procesoquimico_3ds_6_tfprofordes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForDes = ?)");
      }
      else
      {
         GXv_int19[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58Formulaciontinte_procesoquimico_3ds_7_tfproforcan)==0) )
      {
         addWhere(sWhereString, "(T1.ProForCan >= ?)");
      }
      else
      {
         GXv_int19[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59Formulaciontinte_procesoquimico_3ds_8_tfproforcan_to)==0) )
      {
         addWhere(sWhereString, "(T1.ProForCan <= ?)");
      }
      else
      {
         GXv_int19[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Formulaciontinte_procesoquimico_3ds_10_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV60Formulaciontinte_procesoquimico_3ds_9_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Formulaciontinte_procesoquimico_3ds_10_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int19[11] = (byte)(1) ;
      }
      if ( ! (0==AV62Formulaciontinte_procesoquimico_3ds_11_tfprofornro) )
      {
         addWhere(sWhereString, "(T1.ProForNro >= ?)");
      }
      else
      {
         GXv_int19[12] = (byte)(1) ;
      }
      if ( ! (0==AV63Formulaciontinte_procesoquimico_3ds_12_tfprofornro_to) )
      {
         addWhere(sWhereString, "(T1.ProForNro <= ?)");
      }
      else
      {
         GXv_int19[13] = (byte)(1) ;
      }
      if ( ! (0==AV64Formulaciontinte_procesoquimico_3ds_13_tfprofortnq) )
      {
         addWhere(sWhereString, "(T1.ProForTnq >= ?)");
      }
      else
      {
         GXv_int19[14] = (byte)(1) ;
      }
      if ( ! (0==AV65Formulaciontinte_procesoquimico_3ds_14_tfprofortnq_to) )
      {
         addWhere(sWhereString, "(T1.ProForTnq <= ?)");
      }
      else
      {
         GXv_int19[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Formulaciontinte_procesoquimico_3ds_16_tfproforcla_sel)==0) && ( ! (GXutil.strcmp("", AV66Formulaciontinte_procesoquimico_3ds_15_tfproforcla)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForCla) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Formulaciontinte_procesoquimico_3ds_16_tfproforcla_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForCla = ?)");
      }
      else
      {
         GXv_int19[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Formulaciontinte_procesoquimico_3ds_18_tfproforclv_sel)==0) && ( ! (GXutil.strcmp("", AV68Formulaciontinte_procesoquimico_3ds_17_tfproforclv)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForClv) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Formulaciontinte_procesoquimico_3ds_18_tfproforclv_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForClv = ?)");
      }
      else
      {
         GXv_int19[19] = (byte)(1) ;
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
                  return conditional_H01WR2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , ((Boolean) dynConstraints[28]).booleanValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] );
            case 1 :
                  return conditional_H01WR3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , ((Boolean) dynConstraints[28]).booleanValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01WR2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,51, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01WR3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,5);
               ((String[]) buf[10])[0] = rslt.getString(10, 26);
               ((String[]) buf[11])[0] = rslt.getString(11, 6);
               ((short[]) buf[12])[0] = rslt.getShort(12);
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
                  stmt.setString(sIdx, (String)parms[25], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 5);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 5);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 5);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 5);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[40]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[22]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[23]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 5);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 5);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 5);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 5);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[32]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[33]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[34]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[35]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               return;
      }
   }

}

