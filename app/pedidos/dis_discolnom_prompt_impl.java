package app.pedidos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class dis_discolnom_prompt_impl extends GXDataArea
{
   public dis_discolnom_prompt_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public dis_discolnom_prompt_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dis_discolnom_prompt_impl.class ));
   }

   public dis_discolnom_prompt_impl( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavEquiv = new HTMLChoice();
      cmbForBlo = new HTMLChoice();
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( nGotPars == 0 )
      {
         entryPointCalled = false ;
         gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
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
            gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
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
            AV7EmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV5CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV5CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5CliCod), 6, 0));
               AV6ForSer = httpContext.GetPar( "ForSer") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV6ForSer", AV6ForSer);
               AV49ForColNom = httpContext.GetPar( "ForColNom") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV49ForColNom", AV49ForColNom);
               AV50ForColNum = (int)(GXutil.lval( httpContext.GetPar( "ForColNum"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV50ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50ForColNum), 6, 0));
               AV52ForNomCli = httpContext.GetPar( "ForNomCli") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV52ForNomCli", AV52ForNomCli);
               AV53ForNumCli = (int)(GXutil.lval( httpContext.GetPar( "ForNumCli"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV53ForNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53ForNumCli), 6, 0));
               AV51TipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV51TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51TipColCod), 2, 0));
               AV65Fortonal = httpContext.GetPar( "Fortonal") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV65Fortonal", AV65Fortonal);
               AV91forblo = httpContext.GetPar( "forblo") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV91forblo", AV91forblo);
               AV100TipColDsc = httpContext.GetPar( "TipColDsc") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV100TipColDsc", AV100TipColDsc);
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
      nRC_GXsfl_54 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_54"))) ;
      nGXsfl_54_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_54_idx"))) ;
      sGXsfl_54_idx = httpContext.GetPar( "sGXsfl_54_idx") ;
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
      AV7EmprCod = httpContext.GetPar( "EmprCod") ;
      AV56TFCliCod = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod"))) ;
      AV57TFCliNom = httpContext.GetPar( "TFCliNom") ;
      AV23TFForSer = httpContext.GetPar( "TFForSer") ;
      AV58TFForSerDsc = httpContext.GetPar( "TFForSerDsc") ;
      AV66TFForTipArtDsc = httpContext.GetPar( "TFForTipArtDsc") ;
      AV67TFForTipArtDsc_Sel = httpContext.GetPar( "TFForTipArtDsc_Sel") ;
      AV25TFForColNom = httpContext.GetPar( "TFForColNom") ;
      AV27TFForColNum = (int)(GXutil.lval( httpContext.GetPar( "TFForColNum"))) ;
      AV29TFTipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TFTipColCod"))) ;
      AV101TFTipColDsc = httpContext.GetPar( "TFTipColDsc") ;
      AV102TFTipColDsc_Sel = httpContext.GetPar( "TFTipColDsc_Sel") ;
      AV31TFForNomCli = httpContext.GetPar( "TFForNomCli") ;
      AV33TFForNumCli = (int)(GXutil.lval( httpContext.GetPar( "TFForNumCli"))) ;
      AV35TFIntDsc = httpContext.GetPar( "TFIntDsc") ;
      AV37TFForTonal = httpContext.GetPar( "TFForTonal") ;
      AV68TFForFec = localUtil.parseDateParm( httpContext.GetPar( "TFForFec")) ;
      AV72TFForUltMod = localUtil.parseDateParm( httpContext.GetPar( "TFForUltMod")) ;
      AV76TFForUltUti = localUtil.parseDateParm( httpContext.GetPar( "TFForUltUti")) ;
      AV80TFForNumArc = (int)(GXutil.lval( httpContext.GetPar( "TFForNumArc"))) ;
      AV81TFForNumArc_To = (int)(GXutil.lval( httpContext.GetPar( "TFForNumArc_To"))) ;
      AV82TFForFecApr = localUtil.parseDateParm( httpContext.GetPar( "TFForFecApr")) ;
      AV86TFForOpcCli = httpContext.GetPar( "TFForOpcCli") ;
      AV87TFForOpcCli_Sel = httpContext.GetPar( "TFForOpcCli_Sel") ;
      AV88TFForNumCol = (int)(GXutil.lval( httpContext.GetPar( "TFForNumCol"))) ;
      AV89TFForNumCol_To = (int)(GXutil.lval( httpContext.GetPar( "TFForNumCol_To"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV98TFForBlo_Sels);
      AV105Pgmname = httpContext.GetPar( "Pgmname") ;
      AV20OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV21OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      A4339ForRGB = GXutil.lval( httpContext.GetPar( "ForRGB")) ;
      n4339ForRGB = false ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV7EmprCod, AV56TFCliCod, AV57TFCliNom, AV23TFForSer, AV58TFForSerDsc, AV66TFForTipArtDsc, AV67TFForTipArtDsc_Sel, AV25TFForColNom, AV27TFForColNum, AV29TFTipColCod, AV101TFTipColDsc, AV102TFTipColDsc_Sel, AV31TFForNomCli, AV33TFForNumCli, AV35TFIntDsc, AV37TFForTonal, AV68TFForFec, AV72TFForUltMod, AV76TFForUltUti, AV80TFForNumArc, AV81TFForNumArc_To, AV82TFForFecApr, AV86TFForOpcCli, AV87TFForOpcCli_Sel, AV88TFForNumCol, AV89TFForNumCol_To, AV98TFForBlo_Sels, AV105Pgmname, AV20OrderedBy, AV21OrderedDsc, A4339ForRGB) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         MasterPageObj= createMasterPage(remoteHandle, "app.wwpbaseobjects.workwithplusmasterpageprompt");
         MasterPageObj.setDataArea(this,true);
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
      pa1Y12( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1Y12( ) ;
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
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-"+GXutil.substring( httpContext.getLanguageProperty( "culture"), 1, 2)+".js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"false\"" ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.pedidos.dis_discolnom_prompt", new String[] {GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV5CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV6ForSer)),GXutil.URLEncode(GXutil.rtrim(AV49ForColNom)),GXutil.URLEncode(GXutil.ltrimstr(AV50ForColNum,6,0)),GXutil.URLEncode(GXutil.rtrim(AV52ForNomCli)),GXutil.URLEncode(GXutil.ltrimstr(AV53ForNumCli,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV51TipColCod,2,0)),GXutil.URLEncode(GXutil.rtrim(AV65Fortonal)),GXutil.URLEncode(GXutil.rtrim(AV91forblo)),GXutil.URLEncode(GXutil.rtrim(AV100TipColDsc))}, new String[] {"EmprCod","CliCod","ForSer","ForColNom","ForColNum","ForNomCli","ForNumCli","TipColCod","Fortonal","forblo","TipColDsc"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_FORRGB", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A4339ForRGB), "ZZZZZZZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"Dis_DisColNom_Prompt");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV105Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("pedidos\\dis_discolnom_prompt:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_54", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_54, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV45GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV46GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV43DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV43DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLICOD", GXutil.ltrim( localUtil.ntoc( AV56TFCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLINOM", GXutil.rtrim( AV57TFCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORSER", GXutil.rtrim( AV23TFForSer));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORSERDSC", GXutil.rtrim( AV58TFForSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORTIPARTDSC", GXutil.rtrim( AV66TFForTipArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORTIPARTDSC_SEL", GXutil.rtrim( AV67TFForTipArtDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORCOLNOM", GXutil.rtrim( AV25TFForColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORCOLNUM", GXutil.ltrim( localUtil.ntoc( AV27TFForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTIPCOLCOD", GXutil.ltrim( localUtil.ntoc( AV29TFTipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTIPCOLDSC", GXutil.rtrim( AV101TFTipColDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTIPCOLDSC_SEL", GXutil.rtrim( AV102TFTipColDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORNOMCLI", GXutil.rtrim( AV31TFForNomCli));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORNUMCLI", GXutil.ltrim( localUtil.ntoc( AV33TFForNumCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFINTDSC", GXutil.rtrim( AV35TFIntDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORTONAL", GXutil.rtrim( AV37TFForTonal));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORFEC", localUtil.dtoc( AV68TFForFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORULTMOD", localUtil.dtoc( AV72TFForUltMod, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORULTUTI", localUtil.dtoc( AV76TFForUltUti, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORNUMARC", GXutil.ltrim( localUtil.ntoc( AV80TFForNumArc, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORNUMARC_TO", GXutil.ltrim( localUtil.ntoc( AV81TFForNumArc_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORFECAPR", localUtil.dtoc( AV82TFForFecApr, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFOROPCCLI", GXutil.rtrim( AV86TFForOpcCli));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFOROPCCLI_SEL", GXutil.rtrim( AV87TFForOpcCli_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORNUMCOL", GXutil.ltrim( localUtil.ntoc( AV88TFForNumCol, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORNUMCOL_TO", GXutil.ltrim( localUtil.ntoc( AV89TFForNumCol_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFFORBLO_SELS", AV98TFForBlo_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFFORBLO_SELS", AV98TFForBlo_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV20OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV21OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "FORRGB", GXutil.ltrim( localUtil.ntoc( A4339ForRGB, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_FORRGB", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A4339ForRGB), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTIPCOLDSC", GXutil.rtrim( AV100TipColDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV7EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORCOLNOM", GXutil.rtrim( AV49ForColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORCOLNUM", GXutil.ltrim( localUtil.ntoc( AV50ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORNOMCLI", GXutil.rtrim( AV52ForNomCli));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORNUMCLI", GXutil.ltrim( localUtil.ntoc( AV53ForNumCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTIPCOLCOD", GXutil.ltrim( localUtil.ntoc( AV51TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORTONAL", GXutil.rtrim( AV65Fortonal));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORBLO", GXutil.rtrim( AV91forblo));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Width", GXutil.rtrim( Dvpanel_unnamedtable1_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable1_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable1_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Cls", GXutil.rtrim( Dvpanel_unnamedtable1_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Title", GXutil.rtrim( Dvpanel_unnamedtable1_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable1_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable1_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable1_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Class", GXutil.rtrim( Gridpaginationbar_Class));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Showfirst", GXutil.booltostr( Gridpaginationbar_Showfirst));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Showprevious", GXutil.booltostr( Gridpaginationbar_Showprevious));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Shownext", GXutil.booltostr( Gridpaginationbar_Shownext));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Showlast", GXutil.booltostr( Gridpaginationbar_Showlast));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Pagestoshow", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Pagestoshow, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Pagingbuttonsposition", GXutil.rtrim( Gridpaginationbar_Pagingbuttonsposition));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Pagingcaptionposition", GXutil.rtrim( Gridpaginationbar_Pagingcaptionposition));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Emptygridclass", GXutil.rtrim( Gridpaginationbar_Emptygridclass));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselector", GXutil.booltostr( Gridpaginationbar_Rowsperpageselector));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageoptions", GXutil.rtrim( Gridpaginationbar_Rowsperpageoptions));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Previous", GXutil.rtrim( Gridpaginationbar_Previous));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Next", GXutil.rtrim( Gridpaginationbar_Next));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Caption", GXutil.rtrim( Gridpaginationbar_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Emptygridcaption", GXutil.rtrim( Gridpaginationbar_Emptygridcaption));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpagecaption", GXutil.rtrim( Gridpaginationbar_Rowsperpagecaption));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Allowmultipleselection", GXutil.rtrim( Ddo_grid_Allowmultipleselection));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalistfixedvalues", GXutil.rtrim( Ddo_grid_Datalistfixedvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Cleanfilter", GXutil.rtrim( Ddo_grid_Cleanfilter));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CREARCOLOR_Title", GXutil.rtrim( Dvelop_confirmpanel_crearcolor_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CREARCOLOR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_crearcolor_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CREARCOLOR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_crearcolor_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CREARCOLOR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_crearcolor_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CREARCOLOR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_crearcolor_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CREARCOLOR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_crearcolor_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CREARCOLOR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_crearcolor_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CREARCOLOR_Result", GXutil.rtrim( Dvelop_confirmpanel_crearcolor_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CREARCOLOR_Result", GXutil.rtrim( Dvelop_confirmpanel_crearcolor_Result));
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
         we1Y12( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1Y12( ) ;
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
      return formatLink("app.pedidos.dis_discolnom_prompt", new String[] {GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV5CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV6ForSer)),GXutil.URLEncode(GXutil.rtrim(AV49ForColNom)),GXutil.URLEncode(GXutil.ltrimstr(AV50ForColNum,6,0)),GXutil.URLEncode(GXutil.rtrim(AV52ForNomCli)),GXutil.URLEncode(GXutil.ltrimstr(AV53ForNumCli,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV51TipColCod,2,0)),GXutil.URLEncode(GXutil.rtrim(AV65Fortonal)),GXutil.URLEncode(GXutil.rtrim(AV91forblo)),GXutil.URLEncode(GXutil.rtrim(AV100TipColDsc))}, new String[] {"EmprCod","CliCod","ForSer","ForColNom","ForColNum","ForNomCli","ForNumCli","TipColCod","Fortonal","forblo","TipColDsc"})  ;
   }

   public String getPgmname( )
   {
      return "Pedidos.Dis_DisColNom_Prompt" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Selección de colores", "") ;
   }

   public void wb1Y10( )
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
         app.GxWebStd.gx_div_start( httpContext, divLayoutmaintable_Internalname, 1, 0, "px", 0, "px", "Table TableWithSelectableGrid", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablemain_Internalname, 1, 0, "px", divTablemain_Height, "px", "TableMain", "left", "top", "", "", "div");
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
         ucDvpanel_unnamedtable1.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable1_Internalname, "DVPANEL_UNNAMEDTABLE1Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE1Container"+"UnnamedTable1"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavEquiv.getInternalname()+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'" + sGXsfl_54_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavEquiv, cmbavEquiv.getInternalname(), GXutil.trim( GXutil.str( AV96Equiv, 1, 0)), 1, cmbavEquiv.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbavEquiv.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,19);\"", "", true, (byte)(0), "HLP_Pedidos\\Dis_DisColNom_Prompt.htm");
         cmbavEquiv.setValue( GXutil.trim( GXutil.str( AV96Equiv, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavEquiv.getInternalname(), "Values", cmbavEquiv.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncrearcolor_Internalname, "gx.evt.setGridEvt("+GXutil.str( 54, 2, 0)+","+"null"+");", httpContext.getMessage( "Crear Color", ""), bttBtncrearcolor_Jsonclick, 5, httpContext.getMessage( "Crear Color", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCREARCOLOR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Pedidos\\Dis_DisColNom_Prompt.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClicod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClicod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV5CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV5CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV5CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\Dis_DisColNom_Prompt.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavForser_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavForser_Internalname, httpContext.getMessage( "Articulo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavForser_Internalname, GXutil.rtrim( AV6ForSer), GXutil.rtrim( localUtil.format( AV6ForSer, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavForser_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavForser_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\Dis_DisColNom_Prompt.htm");
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
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table1_43_1Y12( true) ;
      }
      else
      {
         wb_table1_43_1Y12( false) ;
      }
      return  ;
   }

   public void wb_table1_43_1Y12e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", divUnnamedtable2_Height, "px", "", "left", "top", "", "", "div");
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
         startgridcontrol54( ) ;
      }
      if ( wbEnd == 54 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_54 = (int)(nGXsfl_54_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
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
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, "GRIDPAGINATIONBARContainer");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV105Pgmname), GXutil.rtrim( localUtil.format( AV105Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\Dis_DisColNom_Prompt.htm");
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
         ucDdo_grid.setProperty("AllowMultipleSelection", Ddo_grid_Allowmultipleselection);
         ucDdo_grid.setProperty("DataListFixedValues", Ddo_grid_Datalistfixedvalues);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV43DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         wb_table2_92_1Y12( true) ;
      }
      else
      {
         wb_table2_92_1Y12( false) ;
      }
      return  ;
   }

   public void wb_table2_92_1Y12e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_forfecauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'" + sGXsfl_54_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_forfecauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_forfecauxdate_Internalname, localUtil.format(AV70DDO_ForFecAuxDate, "99/99/99"), localUtil.format( AV70DDO_ForFecAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_forfecauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\Dis_DisColNom_Prompt.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_forfecauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Pedidos\\Dis_DisColNom_Prompt.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_forultmodauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'" + sGXsfl_54_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_forultmodauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_forultmodauxdate_Internalname, localUtil.format(AV74DDO_ForUltModAuxDate, "99/99/99"), localUtil.format( AV74DDO_ForUltModAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_forultmodauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\Dis_DisColNom_Prompt.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_forultmodauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Pedidos\\Dis_DisColNom_Prompt.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_forultutiauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'" + sGXsfl_54_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_forultutiauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_forultutiauxdate_Internalname, localUtil.format(AV78DDO_ForUltUtiAuxDate, "99/99/99"), localUtil.format( AV78DDO_ForUltUtiAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,103);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_forultutiauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\Dis_DisColNom_Prompt.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_forultutiauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Pedidos\\Dis_DisColNom_Prompt.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_forfecaprauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 105,'',false,'" + sGXsfl_54_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_forfecaprauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_forfecaprauxdate_Internalname, localUtil.format(AV84DDO_ForFecAprAuxDate, "99/99/99"), localUtil.format( AV84DDO_ForFecAprAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,105);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_forfecaprauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\Dis_DisColNom_Prompt.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_forfecaprauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Pedidos\\Dis_DisColNom_Prompt.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 54 )
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

   public void start1Y12( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Selección de colores", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1Y10( ) ;
   }

   public void ws1Y12( )
   {
      start1Y12( ) ;
      evt1Y12( ) ;
   }

   public void evt1Y12( )
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
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e111Y12 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e121Y12 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e131Y12 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_CREARCOLOR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e141Y12 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCREARCOLOR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCrearColor' */
                           e151Y12 ();
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
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) )
                        {
                           nGXsfl_54_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_54_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_54_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_542( ) ;
                           AV47Select = httpContext.cgiGet( edtavSelect_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavSelect_Internalname, AV47Select);
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           A494ForSer = httpContext.cgiGet( edtForSer_Internalname) ;
                           A5742ForSerDsc = httpContext.cgiGet( edtForSerDsc_Internalname) ;
                           n5742ForSerDsc = false ;
                           A13929ForTipArtD = httpContext.cgiGet( edtForTipArtD_Internalname) ;
                           n13929ForTipArtD = false ;
                           A482ForColNom = httpContext.cgiGet( edtForColNom_Internalname) ;
                           A483ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtForColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A831TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtTipColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A832TipColDsc = httpContext.cgiGet( edtTipColDsc_Internalname) ;
                           n832TipColDsc = false ;
                           A1191ForNomCli = httpContext.cgiGet( edtForNomCli_Internalname) ;
                           n1191ForNomCli = false ;
                           A1192ForNumCli = (int)(localUtil.ctol( httpContext.cgiGet( edtForNumCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n1192ForNumCli = false ;
                           A584IntDsc = httpContext.cgiGet( edtIntDsc_Internalname) ;
                           n584IntDsc = false ;
                           A995ForTonal = httpContext.cgiGet( edtForTonal_Internalname) ;
                           n995ForTonal = false ;
                           A485ForFec = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtForFec_Internalname), 0)) ;
                           n485ForFec = false ;
                           A495ForUltMod = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtForUltMod_Internalname), 0)) ;
                           n495ForUltMod = false ;
                           A496ForUltUti = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtForUltUti_Internalname), 0)) ;
                           n496ForUltUti = false ;
                           A3315ForNumArc = (int)(localUtil.ctol( httpContext.cgiGet( edtForNumArc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n3315ForNumArc = false ;
                           A3558ForFecApr = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtForFecApr_Internalname), 0)) ;
                           n3558ForFecApr = false ;
                           A3560ForOpcCli = GXutil.upper( httpContext.cgiGet( edtForOpcCli_Internalname)) ;
                           n3560ForOpcCli = false ;
                           A486ForNumCol = (int)(localUtil.ctol( httpContext.cgiGet( edtForNumCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           cmbForBlo.setName( cmbForBlo.getInternalname() );
                           cmbForBlo.setValue( httpContext.cgiGet( cmbForBlo.getInternalname()) );
                           A7781ForBlo = httpContext.cgiGet( cmbForBlo.getInternalname()) ;
                           n7781ForBlo = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e161Y12 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e171Y12 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e181Y12 ();
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
                                       e191Y12 ();
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

   public void we1Y12( )
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

   public void pa1Y12( )
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
            GX_FocusControl = cmbavEquiv.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
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
      subsflControlProps_542( ) ;
      while ( nGXsfl_54_idx <= nRC_GXsfl_54 )
      {
         sendrow_542( ) ;
         nGXsfl_54_idx = ((subGrid_Islastpage==1)&&(nGXsfl_54_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_54_idx+1) ;
         sGXsfl_54_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_54_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_542( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV7EmprCod ,
                                 int AV56TFCliCod ,
                                 String AV57TFCliNom ,
                                 String AV23TFForSer ,
                                 String AV58TFForSerDsc ,
                                 String AV66TFForTipArtDsc ,
                                 String AV67TFForTipArtDsc_Sel ,
                                 String AV25TFForColNom ,
                                 int AV27TFForColNum ,
                                 byte AV29TFTipColCod ,
                                 String AV101TFTipColDsc ,
                                 String AV102TFTipColDsc_Sel ,
                                 String AV31TFForNomCli ,
                                 int AV33TFForNumCli ,
                                 String AV35TFIntDsc ,
                                 String AV37TFForTonal ,
                                 java.util.Date AV68TFForFec ,
                                 java.util.Date AV72TFForUltMod ,
                                 java.util.Date AV76TFForUltUti ,
                                 int AV80TFForNumArc ,
                                 int AV81TFForNumArc_To ,
                                 java.util.Date AV82TFForFecApr ,
                                 String AV86TFForOpcCli ,
                                 String AV87TFForOpcCli_Sel ,
                                 int AV88TFForNumCol ,
                                 int AV89TFForNumCol_To ,
                                 GXSimpleCollection<String> AV98TFForBlo_Sels ,
                                 String AV105Pgmname ,
                                 short AV20OrderedBy ,
                                 boolean AV21OrderedDsc ,
                                 long A4339ForRGB )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e171Y12 ();
      GRID_nCurrentRecord = 0 ;
      rf1Y12( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"Dis_DisColNom_Prompt");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV105Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("pedidos\\dis_discolnom_prompt:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_FORBLO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A7781ForBlo, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "FORBLO", GXutil.rtrim( A7781ForBlo));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_FORTONAL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A995ForTonal, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "FORTONAL", GXutil.rtrim( A995ForTonal));
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
      if ( cmbavEquiv.getItemCount() > 0 )
      {
         AV96Equiv = (byte)(GXutil.lval( cmbavEquiv.getValidValue(GXutil.trim( GXutil.str( AV96Equiv, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV96Equiv", GXutil.str( AV96Equiv, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavEquiv.setValue( GXutil.trim( GXutil.str( AV96Equiv, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavEquiv.getInternalname(), "Values", cmbavEquiv.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf1Y12( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV105Pgmname = "Pedidos.Dis_DisColNom_Prompt" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV105Pgmname", AV105Pgmname);
      Gx_err = (short)(0) ;
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavForser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavForser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavForser_Enabled), 5, 0), true);
      edtavSelect_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSelect_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSelect_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1Y12( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(54) ;
      /* Execute user event: Refresh */
      e171Y12 ();
      nGXsfl_54_idx = 1 ;
      sGXsfl_54_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_54_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_542( ) ;
      bGXsfl_54_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
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
         subsflControlProps_542( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              A7781ForBlo ,
                                              AV131Pedidos_dis_discolnom_promptds_26_tfforblo_sels ,
                                              Integer.valueOf(AV106Pedidos_dis_discolnom_promptds_1_tfclicod) ,
                                              AV107Pedidos_dis_discolnom_promptds_2_tfclinom ,
                                              AV108Pedidos_dis_discolnom_promptds_3_tfforser ,
                                              AV109Pedidos_dis_discolnom_promptds_4_tfforserdsc ,
                                              AV112Pedidos_dis_discolnom_promptds_7_tfforcolnom ,
                                              Integer.valueOf(AV113Pedidos_dis_discolnom_promptds_8_tfforcolnum) ,
                                              Byte.valueOf(AV114Pedidos_dis_discolnom_promptds_9_tftipcolcod) ,
                                              AV116Pedidos_dis_discolnom_promptds_11_tftipcoldsc_sel ,
                                              AV115Pedidos_dis_discolnom_promptds_10_tftipcoldsc ,
                                              AV117Pedidos_dis_discolnom_promptds_12_tffornomcli ,
                                              Integer.valueOf(AV118Pedidos_dis_discolnom_promptds_13_tffornumcli) ,
                                              AV120Pedidos_dis_discolnom_promptds_15_tffortonal ,
                                              AV121Pedidos_dis_discolnom_promptds_16_tfforfec ,
                                              AV122Pedidos_dis_discolnom_promptds_17_tfforultmod ,
                                              AV123Pedidos_dis_discolnom_promptds_18_tfforultuti ,
                                              Integer.valueOf(AV124Pedidos_dis_discolnom_promptds_19_tffornumarc) ,
                                              Integer.valueOf(AV125Pedidos_dis_discolnom_promptds_20_tffornumarc_to) ,
                                              AV126Pedidos_dis_discolnom_promptds_21_tfforfecapr ,
                                              AV128Pedidos_dis_discolnom_promptds_23_tfforopccli_sel ,
                                              AV127Pedidos_dis_discolnom_promptds_22_tfforopccli ,
                                              Integer.valueOf(AV129Pedidos_dis_discolnom_promptds_24_tffornumcol) ,
                                              Integer.valueOf(AV130Pedidos_dis_discolnom_promptds_25_tffornumcol_to) ,
                                              Integer.valueOf(AV131Pedidos_dis_discolnom_promptds_26_tfforblo_sels.size()) ,
                                              Integer.valueOf(A252CliCod) ,
                                              A279CliNom ,
                                              A494ForSer ,
                                              A5742ForSerDsc ,
                                              A482ForColNom ,
                                              Integer.valueOf(A483ForColNum) ,
                                              Byte.valueOf(A831TipColCod) ,
                                              A832TipColDsc ,
                                              A1191ForNomCli ,
                                              Integer.valueOf(A1192ForNumCli) ,
                                              A995ForTonal ,
                                              A485ForFec ,
                                              A495ForUltMod ,
                                              A496ForUltUti ,
                                              Integer.valueOf(A3315ForNumArc) ,
                                              A3558ForFecApr ,
                                              A3560ForOpcCli ,
                                              Integer.valueOf(A486ForNumCol) ,
                                              Short.valueOf(AV20OrderedBy) ,
                                              Boolean.valueOf(AV21OrderedDsc) ,
                                              AV111Pedidos_dis_discolnom_promptds_6_tffortipartdsc_sel ,
                                              AV110Pedidos_dis_discolnom_promptds_5_tffortipartdsc ,
                                              A13929ForTipArtD ,
                                              A10045CliAct ,
                                              AV7EmprCod ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                              TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DATE,
                                              TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV110Pedidos_dis_discolnom_promptds_5_tffortipartdsc = GXutil.padr( GXutil.rtrim( AV110Pedidos_dis_discolnom_promptds_5_tffortipartdsc), 30, "%") ;
         lV107Pedidos_dis_discolnom_promptds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV107Pedidos_dis_discolnom_promptds_2_tfclinom), 30, "%") ;
         lV108Pedidos_dis_discolnom_promptds_3_tfforser = GXutil.padr( GXutil.rtrim( AV108Pedidos_dis_discolnom_promptds_3_tfforser), 16, "%") ;
         lV109Pedidos_dis_discolnom_promptds_4_tfforserdsc = GXutil.padr( GXutil.rtrim( AV109Pedidos_dis_discolnom_promptds_4_tfforserdsc), 26, "%") ;
         lV112Pedidos_dis_discolnom_promptds_7_tfforcolnom = GXutil.padr( GXutil.rtrim( AV112Pedidos_dis_discolnom_promptds_7_tfforcolnom), 13, "%") ;
         lV115Pedidos_dis_discolnom_promptds_10_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV115Pedidos_dis_discolnom_promptds_10_tftipcoldsc), 30, "%") ;
         lV117Pedidos_dis_discolnom_promptds_12_tffornomcli = GXutil.padr( GXutil.rtrim( AV117Pedidos_dis_discolnom_promptds_12_tffornomcli), 13, "%") ;
         lV120Pedidos_dis_discolnom_promptds_15_tffortonal = GXutil.padr( GXutil.rtrim( AV120Pedidos_dis_discolnom_promptds_15_tffortonal), 20, "%") ;
         lV127Pedidos_dis_discolnom_promptds_22_tfforopccli = GXutil.padr( GXutil.rtrim( AV127Pedidos_dis_discolnom_promptds_22_tfforopccli), 1, "%") ;
         /* Using cursor H01Y12 */
         pr_default.execute(0, new Object[] {AV7EmprCod, AV111Pedidos_dis_discolnom_promptds_6_tffortipartdsc_sel, AV110Pedidos_dis_discolnom_promptds_5_tffortipartdsc, lV110Pedidos_dis_discolnom_promptds_5_tffortipartdsc, AV111Pedidos_dis_discolnom_promptds_6_tffortipartdsc_sel, AV111Pedidos_dis_discolnom_promptds_6_tffortipartdsc_sel, Integer.valueOf(AV106Pedidos_dis_discolnom_promptds_1_tfclicod), lV107Pedidos_dis_discolnom_promptds_2_tfclinom, lV108Pedidos_dis_discolnom_promptds_3_tfforser, lV109Pedidos_dis_discolnom_promptds_4_tfforserdsc, lV112Pedidos_dis_discolnom_promptds_7_tfforcolnom, Integer.valueOf(AV113Pedidos_dis_discolnom_promptds_8_tfforcolnum), Byte.valueOf(AV114Pedidos_dis_discolnom_promptds_9_tftipcolcod), lV115Pedidos_dis_discolnom_promptds_10_tftipcoldsc, AV116Pedidos_dis_discolnom_promptds_11_tftipcoldsc_sel, lV117Pedidos_dis_discolnom_promptds_12_tffornomcli, Integer.valueOf(AV118Pedidos_dis_discolnom_promptds_13_tffornumcli), lV120Pedidos_dis_discolnom_promptds_15_tffortonal, AV121Pedidos_dis_discolnom_promptds_16_tfforfec, AV122Pedidos_dis_discolnom_promptds_17_tfforultmod, AV123Pedidos_dis_discolnom_promptds_18_tfforultuti, Integer.valueOf(AV124Pedidos_dis_discolnom_promptds_19_tffornumarc), Integer.valueOf(AV125Pedidos_dis_discolnom_promptds_20_tffornumarc_to), AV126Pedidos_dis_discolnom_promptds_21_tfforfecapr, lV127Pedidos_dis_discolnom_promptds_22_tfforopccli, AV128Pedidos_dis_discolnom_promptds_23_tfforopccli_sel, Integer.valueOf(AV129Pedidos_dis_discolnom_promptds_24_tffornumcol), Integer.valueOf(AV130Pedidos_dis_discolnom_promptds_25_tffornumcol_to), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_54_idx = 1 ;
         sGXsfl_54_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_54_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_542( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A583IntCod = H01Y12_A583IntCod[0] ;
            A4384ForTipArt = H01Y12_A4384ForTipArt[0] ;
            n4384ForTipArt = H01Y12_n4384ForTipArt[0] ;
            A10045CliAct = H01Y12_A10045CliAct[0] ;
            A4339ForRGB = H01Y12_A4339ForRGB[0] ;
            n4339ForRGB = H01Y12_n4339ForRGB[0] ;
            A7781ForBlo = H01Y12_A7781ForBlo[0] ;
            n7781ForBlo = H01Y12_n7781ForBlo[0] ;
            A486ForNumCol = H01Y12_A486ForNumCol[0] ;
            A3560ForOpcCli = H01Y12_A3560ForOpcCli[0] ;
            n3560ForOpcCli = H01Y12_n3560ForOpcCli[0] ;
            A3558ForFecApr = H01Y12_A3558ForFecApr[0] ;
            n3558ForFecApr = H01Y12_n3558ForFecApr[0] ;
            A3315ForNumArc = H01Y12_A3315ForNumArc[0] ;
            n3315ForNumArc = H01Y12_n3315ForNumArc[0] ;
            A496ForUltUti = H01Y12_A496ForUltUti[0] ;
            n496ForUltUti = H01Y12_n496ForUltUti[0] ;
            A495ForUltMod = H01Y12_A495ForUltMod[0] ;
            n495ForUltMod = H01Y12_n495ForUltMod[0] ;
            A485ForFec = H01Y12_A485ForFec[0] ;
            n485ForFec = H01Y12_n485ForFec[0] ;
            A995ForTonal = H01Y12_A995ForTonal[0] ;
            n995ForTonal = H01Y12_n995ForTonal[0] ;
            A584IntDsc = H01Y12_A584IntDsc[0] ;
            n584IntDsc = H01Y12_n584IntDsc[0] ;
            A1192ForNumCli = H01Y12_A1192ForNumCli[0] ;
            n1192ForNumCli = H01Y12_n1192ForNumCli[0] ;
            A1191ForNomCli = H01Y12_A1191ForNomCli[0] ;
            n1191ForNomCli = H01Y12_n1191ForNomCli[0] ;
            A832TipColDsc = H01Y12_A832TipColDsc[0] ;
            n832TipColDsc = H01Y12_n832TipColDsc[0] ;
            A831TipColCod = H01Y12_A831TipColCod[0] ;
            A483ForColNum = H01Y12_A483ForColNum[0] ;
            A482ForColNom = H01Y12_A482ForColNom[0] ;
            A5742ForSerDsc = H01Y12_A5742ForSerDsc[0] ;
            n5742ForSerDsc = H01Y12_n5742ForSerDsc[0] ;
            A494ForSer = H01Y12_A494ForSer[0] ;
            A279CliNom = H01Y12_A279CliNom[0] ;
            A252CliCod = H01Y12_A252CliCod[0] ;
            A396EmprCod = H01Y12_A396EmprCod[0] ;
            A13929ForTipArtD = H01Y12_A13929ForTipArtD[0] ;
            n13929ForTipArtD = H01Y12_n13929ForTipArtD[0] ;
            A10045CliAct = H01Y12_A10045CliAct[0] ;
            A279CliNom = H01Y12_A279CliNom[0] ;
            A584IntDsc = H01Y12_A584IntDsc[0] ;
            n584IntDsc = H01Y12_n584IntDsc[0] ;
            A832TipColDsc = H01Y12_A832TipColDsc[0] ;
            n832TipColDsc = H01Y12_n832TipColDsc[0] ;
            A13929ForTipArtD = H01Y12_A13929ForTipArtD[0] ;
            n13929ForTipArtD = H01Y12_n13929ForTipArtD[0] ;
            e181Y12 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(54) ;
         wb1Y10( ) ;
      }
      bGXsfl_54_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1Y12( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_FORBLO"+"_"+sGXsfl_54_idx, getSecureSignedToken( sGXsfl_54_idx, GXutil.rtrim( localUtil.format( A7781ForBlo, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "FORRGB", GXutil.ltrim( localUtil.ntoc( A4339ForRGB, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_FORRGB", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A4339ForRGB), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_FORTONAL"+"_"+sGXsfl_54_idx, getSecureSignedToken( sGXsfl_54_idx, GXutil.rtrim( localUtil.format( A995ForTonal, ""))));
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
      AV106Pedidos_dis_discolnom_promptds_1_tfclicod = AV56TFCliCod ;
      AV107Pedidos_dis_discolnom_promptds_2_tfclinom = AV57TFCliNom ;
      AV108Pedidos_dis_discolnom_promptds_3_tfforser = AV23TFForSer ;
      AV109Pedidos_dis_discolnom_promptds_4_tfforserdsc = AV58TFForSerDsc ;
      AV110Pedidos_dis_discolnom_promptds_5_tffortipartdsc = AV66TFForTipArtDsc ;
      AV111Pedidos_dis_discolnom_promptds_6_tffortipartdsc_sel = AV67TFForTipArtDsc_Sel ;
      AV112Pedidos_dis_discolnom_promptds_7_tfforcolnom = AV25TFForColNom ;
      AV113Pedidos_dis_discolnom_promptds_8_tfforcolnum = AV27TFForColNum ;
      AV114Pedidos_dis_discolnom_promptds_9_tftipcolcod = AV29TFTipColCod ;
      AV115Pedidos_dis_discolnom_promptds_10_tftipcoldsc = AV101TFTipColDsc ;
      AV116Pedidos_dis_discolnom_promptds_11_tftipcoldsc_sel = AV102TFTipColDsc_Sel ;
      AV117Pedidos_dis_discolnom_promptds_12_tffornomcli = AV31TFForNomCli ;
      AV118Pedidos_dis_discolnom_promptds_13_tffornumcli = AV33TFForNumCli ;
      AV119Pedidos_dis_discolnom_promptds_14_tfintdsc = AV35TFIntDsc ;
      AV120Pedidos_dis_discolnom_promptds_15_tffortonal = AV37TFForTonal ;
      AV121Pedidos_dis_discolnom_promptds_16_tfforfec = AV68TFForFec ;
      AV122Pedidos_dis_discolnom_promptds_17_tfforultmod = AV72TFForUltMod ;
      AV123Pedidos_dis_discolnom_promptds_18_tfforultuti = AV76TFForUltUti ;
      AV124Pedidos_dis_discolnom_promptds_19_tffornumarc = AV80TFForNumArc ;
      AV125Pedidos_dis_discolnom_promptds_20_tffornumarc_to = AV81TFForNumArc_To ;
      AV126Pedidos_dis_discolnom_promptds_21_tfforfecapr = AV82TFForFecApr ;
      AV127Pedidos_dis_discolnom_promptds_22_tfforopccli = AV86TFForOpcCli ;
      AV128Pedidos_dis_discolnom_promptds_23_tfforopccli_sel = AV87TFForOpcCli_Sel ;
      AV129Pedidos_dis_discolnom_promptds_24_tffornumcol = AV88TFForNumCol ;
      AV130Pedidos_dis_discolnom_promptds_25_tffornumcol_to = AV89TFForNumCol_To ;
      AV131Pedidos_dis_discolnom_promptds_26_tfforblo_sels = AV98TFForBlo_Sels ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A7781ForBlo ,
                                           AV131Pedidos_dis_discolnom_promptds_26_tfforblo_sels ,
                                           Integer.valueOf(AV106Pedidos_dis_discolnom_promptds_1_tfclicod) ,
                                           AV107Pedidos_dis_discolnom_promptds_2_tfclinom ,
                                           AV108Pedidos_dis_discolnom_promptds_3_tfforser ,
                                           AV109Pedidos_dis_discolnom_promptds_4_tfforserdsc ,
                                           AV112Pedidos_dis_discolnom_promptds_7_tfforcolnom ,
                                           Integer.valueOf(AV113Pedidos_dis_discolnom_promptds_8_tfforcolnum) ,
                                           Byte.valueOf(AV114Pedidos_dis_discolnom_promptds_9_tftipcolcod) ,
                                           AV116Pedidos_dis_discolnom_promptds_11_tftipcoldsc_sel ,
                                           AV115Pedidos_dis_discolnom_promptds_10_tftipcoldsc ,
                                           AV117Pedidos_dis_discolnom_promptds_12_tffornomcli ,
                                           Integer.valueOf(AV118Pedidos_dis_discolnom_promptds_13_tffornumcli) ,
                                           AV120Pedidos_dis_discolnom_promptds_15_tffortonal ,
                                           AV121Pedidos_dis_discolnom_promptds_16_tfforfec ,
                                           AV122Pedidos_dis_discolnom_promptds_17_tfforultmod ,
                                           AV123Pedidos_dis_discolnom_promptds_18_tfforultuti ,
                                           Integer.valueOf(AV124Pedidos_dis_discolnom_promptds_19_tffornumarc) ,
                                           Integer.valueOf(AV125Pedidos_dis_discolnom_promptds_20_tffornumarc_to) ,
                                           AV126Pedidos_dis_discolnom_promptds_21_tfforfecapr ,
                                           AV128Pedidos_dis_discolnom_promptds_23_tfforopccli_sel ,
                                           AV127Pedidos_dis_discolnom_promptds_22_tfforopccli ,
                                           Integer.valueOf(AV129Pedidos_dis_discolnom_promptds_24_tffornumcol) ,
                                           Integer.valueOf(AV130Pedidos_dis_discolnom_promptds_25_tffornumcol_to) ,
                                           Integer.valueOf(AV131Pedidos_dis_discolnom_promptds_26_tfforblo_sels.size()) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           A1191ForNomCli ,
                                           Integer.valueOf(A1192ForNumCli) ,
                                           A995ForTonal ,
                                           A485ForFec ,
                                           A495ForUltMod ,
                                           A496ForUltUti ,
                                           Integer.valueOf(A3315ForNumArc) ,
                                           A3558ForFecApr ,
                                           A3560ForOpcCli ,
                                           Integer.valueOf(A486ForNumCol) ,
                                           Short.valueOf(AV20OrderedBy) ,
                                           Boolean.valueOf(AV21OrderedDsc) ,
                                           AV111Pedidos_dis_discolnom_promptds_6_tffortipartdsc_sel ,
                                           AV110Pedidos_dis_discolnom_promptds_5_tffortipartdsc ,
                                           A13929ForTipArtD ,
                                           A10045CliAct ,
                                           AV7EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV110Pedidos_dis_discolnom_promptds_5_tffortipartdsc = GXutil.padr( GXutil.rtrim( AV110Pedidos_dis_discolnom_promptds_5_tffortipartdsc), 30, "%") ;
      lV107Pedidos_dis_discolnom_promptds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV107Pedidos_dis_discolnom_promptds_2_tfclinom), 30, "%") ;
      lV108Pedidos_dis_discolnom_promptds_3_tfforser = GXutil.padr( GXutil.rtrim( AV108Pedidos_dis_discolnom_promptds_3_tfforser), 16, "%") ;
      lV109Pedidos_dis_discolnom_promptds_4_tfforserdsc = GXutil.padr( GXutil.rtrim( AV109Pedidos_dis_discolnom_promptds_4_tfforserdsc), 26, "%") ;
      lV112Pedidos_dis_discolnom_promptds_7_tfforcolnom = GXutil.padr( GXutil.rtrim( AV112Pedidos_dis_discolnom_promptds_7_tfforcolnom), 13, "%") ;
      lV115Pedidos_dis_discolnom_promptds_10_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV115Pedidos_dis_discolnom_promptds_10_tftipcoldsc), 30, "%") ;
      lV117Pedidos_dis_discolnom_promptds_12_tffornomcli = GXutil.padr( GXutil.rtrim( AV117Pedidos_dis_discolnom_promptds_12_tffornomcli), 13, "%") ;
      lV120Pedidos_dis_discolnom_promptds_15_tffortonal = GXutil.padr( GXutil.rtrim( AV120Pedidos_dis_discolnom_promptds_15_tffortonal), 20, "%") ;
      lV127Pedidos_dis_discolnom_promptds_22_tfforopccli = GXutil.padr( GXutil.rtrim( AV127Pedidos_dis_discolnom_promptds_22_tfforopccli), 1, "%") ;
      /* Using cursor H01Y13 */
      pr_default.execute(1, new Object[] {AV7EmprCod, AV111Pedidos_dis_discolnom_promptds_6_tffortipartdsc_sel, AV110Pedidos_dis_discolnom_promptds_5_tffortipartdsc, lV110Pedidos_dis_discolnom_promptds_5_tffortipartdsc, AV111Pedidos_dis_discolnom_promptds_6_tffortipartdsc_sel, AV111Pedidos_dis_discolnom_promptds_6_tffortipartdsc_sel, Integer.valueOf(AV106Pedidos_dis_discolnom_promptds_1_tfclicod), lV107Pedidos_dis_discolnom_promptds_2_tfclinom, lV108Pedidos_dis_discolnom_promptds_3_tfforser, lV109Pedidos_dis_discolnom_promptds_4_tfforserdsc, lV112Pedidos_dis_discolnom_promptds_7_tfforcolnom, Integer.valueOf(AV113Pedidos_dis_discolnom_promptds_8_tfforcolnum), Byte.valueOf(AV114Pedidos_dis_discolnom_promptds_9_tftipcolcod), lV115Pedidos_dis_discolnom_promptds_10_tftipcoldsc, AV116Pedidos_dis_discolnom_promptds_11_tftipcoldsc_sel, lV117Pedidos_dis_discolnom_promptds_12_tffornomcli, Integer.valueOf(AV118Pedidos_dis_discolnom_promptds_13_tffornumcli), lV120Pedidos_dis_discolnom_promptds_15_tffortonal, AV121Pedidos_dis_discolnom_promptds_16_tfforfec, AV122Pedidos_dis_discolnom_promptds_17_tfforultmod, AV123Pedidos_dis_discolnom_promptds_18_tfforultuti, Integer.valueOf(AV124Pedidos_dis_discolnom_promptds_19_tffornumarc), Integer.valueOf(AV125Pedidos_dis_discolnom_promptds_20_tffornumarc_to), AV126Pedidos_dis_discolnom_promptds_21_tfforfecapr, lV127Pedidos_dis_discolnom_promptds_22_tfforopccli, AV128Pedidos_dis_discolnom_promptds_23_tfforopccli_sel, Integer.valueOf(AV129Pedidos_dis_discolnom_promptds_24_tffornumcol), Integer.valueOf(AV130Pedidos_dis_discolnom_promptds_25_tffornumcol_to)});
      GRID_nRecordCount = H01Y13_AGRID_nRecordCount[0] ;
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
      AV106Pedidos_dis_discolnom_promptds_1_tfclicod = AV56TFCliCod ;
      AV107Pedidos_dis_discolnom_promptds_2_tfclinom = AV57TFCliNom ;
      AV108Pedidos_dis_discolnom_promptds_3_tfforser = AV23TFForSer ;
      AV109Pedidos_dis_discolnom_promptds_4_tfforserdsc = AV58TFForSerDsc ;
      AV110Pedidos_dis_discolnom_promptds_5_tffortipartdsc = AV66TFForTipArtDsc ;
      AV111Pedidos_dis_discolnom_promptds_6_tffortipartdsc_sel = AV67TFForTipArtDsc_Sel ;
      AV112Pedidos_dis_discolnom_promptds_7_tfforcolnom = AV25TFForColNom ;
      AV113Pedidos_dis_discolnom_promptds_8_tfforcolnum = AV27TFForColNum ;
      AV114Pedidos_dis_discolnom_promptds_9_tftipcolcod = AV29TFTipColCod ;
      AV115Pedidos_dis_discolnom_promptds_10_tftipcoldsc = AV101TFTipColDsc ;
      AV116Pedidos_dis_discolnom_promptds_11_tftipcoldsc_sel = AV102TFTipColDsc_Sel ;
      AV117Pedidos_dis_discolnom_promptds_12_tffornomcli = AV31TFForNomCli ;
      AV118Pedidos_dis_discolnom_promptds_13_tffornumcli = AV33TFForNumCli ;
      AV119Pedidos_dis_discolnom_promptds_14_tfintdsc = AV35TFIntDsc ;
      AV120Pedidos_dis_discolnom_promptds_15_tffortonal = AV37TFForTonal ;
      AV121Pedidos_dis_discolnom_promptds_16_tfforfec = AV68TFForFec ;
      AV122Pedidos_dis_discolnom_promptds_17_tfforultmod = AV72TFForUltMod ;
      AV123Pedidos_dis_discolnom_promptds_18_tfforultuti = AV76TFForUltUti ;
      AV124Pedidos_dis_discolnom_promptds_19_tffornumarc = AV80TFForNumArc ;
      AV125Pedidos_dis_discolnom_promptds_20_tffornumarc_to = AV81TFForNumArc_To ;
      AV126Pedidos_dis_discolnom_promptds_21_tfforfecapr = AV82TFForFecApr ;
      AV127Pedidos_dis_discolnom_promptds_22_tfforopccli = AV86TFForOpcCli ;
      AV128Pedidos_dis_discolnom_promptds_23_tfforopccli_sel = AV87TFForOpcCli_Sel ;
      AV129Pedidos_dis_discolnom_promptds_24_tffornumcol = AV88TFForNumCol ;
      AV130Pedidos_dis_discolnom_promptds_25_tffornumcol_to = AV89TFForNumCol_To ;
      AV131Pedidos_dis_discolnom_promptds_26_tfforblo_sels = AV98TFForBlo_Sels ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV7EmprCod, AV56TFCliCod, AV57TFCliNom, AV23TFForSer, AV58TFForSerDsc, AV66TFForTipArtDsc, AV67TFForTipArtDsc_Sel, AV25TFForColNom, AV27TFForColNum, AV29TFTipColCod, AV101TFTipColDsc, AV102TFTipColDsc_Sel, AV31TFForNomCli, AV33TFForNumCli, AV35TFIntDsc, AV37TFForTonal, AV68TFForFec, AV72TFForUltMod, AV76TFForUltUti, AV80TFForNumArc, AV81TFForNumArc_To, AV82TFForFecApr, AV86TFForOpcCli, AV87TFForOpcCli_Sel, AV88TFForNumCol, AV89TFForNumCol_To, AV98TFForBlo_Sels, AV105Pgmname, AV20OrderedBy, AV21OrderedDsc, A4339ForRGB) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV106Pedidos_dis_discolnom_promptds_1_tfclicod = AV56TFCliCod ;
      AV107Pedidos_dis_discolnom_promptds_2_tfclinom = AV57TFCliNom ;
      AV108Pedidos_dis_discolnom_promptds_3_tfforser = AV23TFForSer ;
      AV109Pedidos_dis_discolnom_promptds_4_tfforserdsc = AV58TFForSerDsc ;
      AV110Pedidos_dis_discolnom_promptds_5_tffortipartdsc = AV66TFForTipArtDsc ;
      AV111Pedidos_dis_discolnom_promptds_6_tffortipartdsc_sel = AV67TFForTipArtDsc_Sel ;
      AV112Pedidos_dis_discolnom_promptds_7_tfforcolnom = AV25TFForColNom ;
      AV113Pedidos_dis_discolnom_promptds_8_tfforcolnum = AV27TFForColNum ;
      AV114Pedidos_dis_discolnom_promptds_9_tftipcolcod = AV29TFTipColCod ;
      AV115Pedidos_dis_discolnom_promptds_10_tftipcoldsc = AV101TFTipColDsc ;
      AV116Pedidos_dis_discolnom_promptds_11_tftipcoldsc_sel = AV102TFTipColDsc_Sel ;
      AV117Pedidos_dis_discolnom_promptds_12_tffornomcli = AV31TFForNomCli ;
      AV118Pedidos_dis_discolnom_promptds_13_tffornumcli = AV33TFForNumCli ;
      AV119Pedidos_dis_discolnom_promptds_14_tfintdsc = AV35TFIntDsc ;
      AV120Pedidos_dis_discolnom_promptds_15_tffortonal = AV37TFForTonal ;
      AV121Pedidos_dis_discolnom_promptds_16_tfforfec = AV68TFForFec ;
      AV122Pedidos_dis_discolnom_promptds_17_tfforultmod = AV72TFForUltMod ;
      AV123Pedidos_dis_discolnom_promptds_18_tfforultuti = AV76TFForUltUti ;
      AV124Pedidos_dis_discolnom_promptds_19_tffornumarc = AV80TFForNumArc ;
      AV125Pedidos_dis_discolnom_promptds_20_tffornumarc_to = AV81TFForNumArc_To ;
      AV126Pedidos_dis_discolnom_promptds_21_tfforfecapr = AV82TFForFecApr ;
      AV127Pedidos_dis_discolnom_promptds_22_tfforopccli = AV86TFForOpcCli ;
      AV128Pedidos_dis_discolnom_promptds_23_tfforopccli_sel = AV87TFForOpcCli_Sel ;
      AV129Pedidos_dis_discolnom_promptds_24_tffornumcol = AV88TFForNumCol ;
      AV130Pedidos_dis_discolnom_promptds_25_tffornumcol_to = AV89TFForNumCol_To ;
      AV131Pedidos_dis_discolnom_promptds_26_tfforblo_sels = AV98TFForBlo_Sels ;
      GRID_nRecordCount = subgrid_fnc_recordcount( ) ;
      if ( ( GRID_nRecordCount >= subgrid_fnc_recordsperpage( ) ) && ( GRID_nEOF == 0 ) )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV7EmprCod, AV56TFCliCod, AV57TFCliNom, AV23TFForSer, AV58TFForSerDsc, AV66TFForTipArtDsc, AV67TFForTipArtDsc_Sel, AV25TFForColNom, AV27TFForColNum, AV29TFTipColCod, AV101TFTipColDsc, AV102TFTipColDsc_Sel, AV31TFForNomCli, AV33TFForNumCli, AV35TFIntDsc, AV37TFForTonal, AV68TFForFec, AV72TFForUltMod, AV76TFForUltUti, AV80TFForNumArc, AV81TFForNumArc_To, AV82TFForFecApr, AV86TFForOpcCli, AV87TFForOpcCli_Sel, AV88TFForNumCol, AV89TFForNumCol_To, AV98TFForBlo_Sels, AV105Pgmname, AV20OrderedBy, AV21OrderedDsc, A4339ForRGB) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV106Pedidos_dis_discolnom_promptds_1_tfclicod = AV56TFCliCod ;
      AV107Pedidos_dis_discolnom_promptds_2_tfclinom = AV57TFCliNom ;
      AV108Pedidos_dis_discolnom_promptds_3_tfforser = AV23TFForSer ;
      AV109Pedidos_dis_discolnom_promptds_4_tfforserdsc = AV58TFForSerDsc ;
      AV110Pedidos_dis_discolnom_promptds_5_tffortipartdsc = AV66TFForTipArtDsc ;
      AV111Pedidos_dis_discolnom_promptds_6_tffortipartdsc_sel = AV67TFForTipArtDsc_Sel ;
      AV112Pedidos_dis_discolnom_promptds_7_tfforcolnom = AV25TFForColNom ;
      AV113Pedidos_dis_discolnom_promptds_8_tfforcolnum = AV27TFForColNum ;
      AV114Pedidos_dis_discolnom_promptds_9_tftipcolcod = AV29TFTipColCod ;
      AV115Pedidos_dis_discolnom_promptds_10_tftipcoldsc = AV101TFTipColDsc ;
      AV116Pedidos_dis_discolnom_promptds_11_tftipcoldsc_sel = AV102TFTipColDsc_Sel ;
      AV117Pedidos_dis_discolnom_promptds_12_tffornomcli = AV31TFForNomCli ;
      AV118Pedidos_dis_discolnom_promptds_13_tffornumcli = AV33TFForNumCli ;
      AV119Pedidos_dis_discolnom_promptds_14_tfintdsc = AV35TFIntDsc ;
      AV120Pedidos_dis_discolnom_promptds_15_tffortonal = AV37TFForTonal ;
      AV121Pedidos_dis_discolnom_promptds_16_tfforfec = AV68TFForFec ;
      AV122Pedidos_dis_discolnom_promptds_17_tfforultmod = AV72TFForUltMod ;
      AV123Pedidos_dis_discolnom_promptds_18_tfforultuti = AV76TFForUltUti ;
      AV124Pedidos_dis_discolnom_promptds_19_tffornumarc = AV80TFForNumArc ;
      AV125Pedidos_dis_discolnom_promptds_20_tffornumarc_to = AV81TFForNumArc_To ;
      AV126Pedidos_dis_discolnom_promptds_21_tfforfecapr = AV82TFForFecApr ;
      AV127Pedidos_dis_discolnom_promptds_22_tfforopccli = AV86TFForOpcCli ;
      AV128Pedidos_dis_discolnom_promptds_23_tfforopccli_sel = AV87TFForOpcCli_Sel ;
      AV129Pedidos_dis_discolnom_promptds_24_tffornumcol = AV88TFForNumCol ;
      AV130Pedidos_dis_discolnom_promptds_25_tffornumcol_to = AV89TFForNumCol_To ;
      AV131Pedidos_dis_discolnom_promptds_26_tfforblo_sels = AV98TFForBlo_Sels ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7EmprCod, AV56TFCliCod, AV57TFCliNom, AV23TFForSer, AV58TFForSerDsc, AV66TFForTipArtDsc, AV67TFForTipArtDsc_Sel, AV25TFForColNom, AV27TFForColNum, AV29TFTipColCod, AV101TFTipColDsc, AV102TFTipColDsc_Sel, AV31TFForNomCli, AV33TFForNumCli, AV35TFIntDsc, AV37TFForTonal, AV68TFForFec, AV72TFForUltMod, AV76TFForUltUti, AV80TFForNumArc, AV81TFForNumArc_To, AV82TFForFecApr, AV86TFForOpcCli, AV87TFForOpcCli_Sel, AV88TFForNumCol, AV89TFForNumCol_To, AV98TFForBlo_Sels, AV105Pgmname, AV20OrderedBy, AV21OrderedDsc, A4339ForRGB) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV106Pedidos_dis_discolnom_promptds_1_tfclicod = AV56TFCliCod ;
      AV107Pedidos_dis_discolnom_promptds_2_tfclinom = AV57TFCliNom ;
      AV108Pedidos_dis_discolnom_promptds_3_tfforser = AV23TFForSer ;
      AV109Pedidos_dis_discolnom_promptds_4_tfforserdsc = AV58TFForSerDsc ;
      AV110Pedidos_dis_discolnom_promptds_5_tffortipartdsc = AV66TFForTipArtDsc ;
      AV111Pedidos_dis_discolnom_promptds_6_tffortipartdsc_sel = AV67TFForTipArtDsc_Sel ;
      AV112Pedidos_dis_discolnom_promptds_7_tfforcolnom = AV25TFForColNom ;
      AV113Pedidos_dis_discolnom_promptds_8_tfforcolnum = AV27TFForColNum ;
      AV114Pedidos_dis_discolnom_promptds_9_tftipcolcod = AV29TFTipColCod ;
      AV115Pedidos_dis_discolnom_promptds_10_tftipcoldsc = AV101TFTipColDsc ;
      AV116Pedidos_dis_discolnom_promptds_11_tftipcoldsc_sel = AV102TFTipColDsc_Sel ;
      AV117Pedidos_dis_discolnom_promptds_12_tffornomcli = AV31TFForNomCli ;
      AV118Pedidos_dis_discolnom_promptds_13_tffornumcli = AV33TFForNumCli ;
      AV119Pedidos_dis_discolnom_promptds_14_tfintdsc = AV35TFIntDsc ;
      AV120Pedidos_dis_discolnom_promptds_15_tffortonal = AV37TFForTonal ;
      AV121Pedidos_dis_discolnom_promptds_16_tfforfec = AV68TFForFec ;
      AV122Pedidos_dis_discolnom_promptds_17_tfforultmod = AV72TFForUltMod ;
      AV123Pedidos_dis_discolnom_promptds_18_tfforultuti = AV76TFForUltUti ;
      AV124Pedidos_dis_discolnom_promptds_19_tffornumarc = AV80TFForNumArc ;
      AV125Pedidos_dis_discolnom_promptds_20_tffornumarc_to = AV81TFForNumArc_To ;
      AV126Pedidos_dis_discolnom_promptds_21_tfforfecapr = AV82TFForFecApr ;
      AV127Pedidos_dis_discolnom_promptds_22_tfforopccli = AV86TFForOpcCli ;
      AV128Pedidos_dis_discolnom_promptds_23_tfforopccli_sel = AV87TFForOpcCli_Sel ;
      AV129Pedidos_dis_discolnom_promptds_24_tffornumcol = AV88TFForNumCol ;
      AV130Pedidos_dis_discolnom_promptds_25_tffornumcol_to = AV89TFForNumCol_To ;
      AV131Pedidos_dis_discolnom_promptds_26_tfforblo_sels = AV98TFForBlo_Sels ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7EmprCod, AV56TFCliCod, AV57TFCliNom, AV23TFForSer, AV58TFForSerDsc, AV66TFForTipArtDsc, AV67TFForTipArtDsc_Sel, AV25TFForColNom, AV27TFForColNum, AV29TFTipColCod, AV101TFTipColDsc, AV102TFTipColDsc_Sel, AV31TFForNomCli, AV33TFForNumCli, AV35TFIntDsc, AV37TFForTonal, AV68TFForFec, AV72TFForUltMod, AV76TFForUltUti, AV80TFForNumArc, AV81TFForNumArc_To, AV82TFForFecApr, AV86TFForOpcCli, AV87TFForOpcCli_Sel, AV88TFForNumCol, AV89TFForNumCol_To, AV98TFForBlo_Sels, AV105Pgmname, AV20OrderedBy, AV21OrderedDsc, A4339ForRGB) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV106Pedidos_dis_discolnom_promptds_1_tfclicod = AV56TFCliCod ;
      AV107Pedidos_dis_discolnom_promptds_2_tfclinom = AV57TFCliNom ;
      AV108Pedidos_dis_discolnom_promptds_3_tfforser = AV23TFForSer ;
      AV109Pedidos_dis_discolnom_promptds_4_tfforserdsc = AV58TFForSerDsc ;
      AV110Pedidos_dis_discolnom_promptds_5_tffortipartdsc = AV66TFForTipArtDsc ;
      AV111Pedidos_dis_discolnom_promptds_6_tffortipartdsc_sel = AV67TFForTipArtDsc_Sel ;
      AV112Pedidos_dis_discolnom_promptds_7_tfforcolnom = AV25TFForColNom ;
      AV113Pedidos_dis_discolnom_promptds_8_tfforcolnum = AV27TFForColNum ;
      AV114Pedidos_dis_discolnom_promptds_9_tftipcolcod = AV29TFTipColCod ;
      AV115Pedidos_dis_discolnom_promptds_10_tftipcoldsc = AV101TFTipColDsc ;
      AV116Pedidos_dis_discolnom_promptds_11_tftipcoldsc_sel = AV102TFTipColDsc_Sel ;
      AV117Pedidos_dis_discolnom_promptds_12_tffornomcli = AV31TFForNomCli ;
      AV118Pedidos_dis_discolnom_promptds_13_tffornumcli = AV33TFForNumCli ;
      AV119Pedidos_dis_discolnom_promptds_14_tfintdsc = AV35TFIntDsc ;
      AV120Pedidos_dis_discolnom_promptds_15_tffortonal = AV37TFForTonal ;
      AV121Pedidos_dis_discolnom_promptds_16_tfforfec = AV68TFForFec ;
      AV122Pedidos_dis_discolnom_promptds_17_tfforultmod = AV72TFForUltMod ;
      AV123Pedidos_dis_discolnom_promptds_18_tfforultuti = AV76TFForUltUti ;
      AV124Pedidos_dis_discolnom_promptds_19_tffornumarc = AV80TFForNumArc ;
      AV125Pedidos_dis_discolnom_promptds_20_tffornumarc_to = AV81TFForNumArc_To ;
      AV126Pedidos_dis_discolnom_promptds_21_tfforfecapr = AV82TFForFecApr ;
      AV127Pedidos_dis_discolnom_promptds_22_tfforopccli = AV86TFForOpcCli ;
      AV128Pedidos_dis_discolnom_promptds_23_tfforopccli_sel = AV87TFForOpcCli_Sel ;
      AV129Pedidos_dis_discolnom_promptds_24_tffornumcol = AV88TFForNumCol ;
      AV130Pedidos_dis_discolnom_promptds_25_tffornumcol_to = AV89TFForNumCol_To ;
      AV131Pedidos_dis_discolnom_promptds_26_tfforblo_sels = AV98TFForBlo_Sels ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7EmprCod, AV56TFCliCod, AV57TFCliNom, AV23TFForSer, AV58TFForSerDsc, AV66TFForTipArtDsc, AV67TFForTipArtDsc_Sel, AV25TFForColNom, AV27TFForColNum, AV29TFTipColCod, AV101TFTipColDsc, AV102TFTipColDsc_Sel, AV31TFForNomCli, AV33TFForNumCli, AV35TFIntDsc, AV37TFForTonal, AV68TFForFec, AV72TFForUltMod, AV76TFForUltUti, AV80TFForNumArc, AV81TFForNumArc_To, AV82TFForFecApr, AV86TFForOpcCli, AV87TFForOpcCli_Sel, AV88TFForNumCol, AV89TFForNumCol_To, AV98TFForBlo_Sels, AV105Pgmname, AV20OrderedBy, AV21OrderedDsc, A4339ForRGB) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV105Pgmname = "Pedidos.Dis_DisColNom_Prompt" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV105Pgmname", AV105Pgmname);
      Gx_err = (short)(0) ;
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavForser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavForser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavForser_Enabled), 5, 0), true);
      edtavSelect_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSelect_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSelect_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1Y10( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e161Y12 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV43DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_54 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_54"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV45GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV46GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Dvpanel_unnamedtable1_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Width") ;
         Dvpanel_unnamedtable1_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autowidth")) ;
         Dvpanel_unnamedtable1_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autoheight")) ;
         Dvpanel_unnamedtable1_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Cls") ;
         Dvpanel_unnamedtable1_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Title") ;
         Dvpanel_unnamedtable1_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Collapsible")) ;
         Dvpanel_unnamedtable1_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Collapsed")) ;
         Dvpanel_unnamedtable1_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Showcollapseicon")) ;
         Dvpanel_unnamedtable1_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Iconposition") ;
         Dvpanel_unnamedtable1_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autoscroll")) ;
         Gridpaginationbar_Class = httpContext.cgiGet( "GRIDPAGINATIONBAR_Class") ;
         Gridpaginationbar_Showfirst = GXutil.strtobool( httpContext.cgiGet( "GRIDPAGINATIONBAR_Showfirst")) ;
         Gridpaginationbar_Showprevious = GXutil.strtobool( httpContext.cgiGet( "GRIDPAGINATIONBAR_Showprevious")) ;
         Gridpaginationbar_Shownext = GXutil.strtobool( httpContext.cgiGet( "GRIDPAGINATIONBAR_Shownext")) ;
         Gridpaginationbar_Showlast = GXutil.strtobool( httpContext.cgiGet( "GRIDPAGINATIONBAR_Showlast")) ;
         Gridpaginationbar_Pagestoshow = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Pagestoshow"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridpaginationbar_Pagingbuttonsposition = httpContext.cgiGet( "GRIDPAGINATIONBAR_Pagingbuttonsposition") ;
         Gridpaginationbar_Pagingcaptionposition = httpContext.cgiGet( "GRIDPAGINATIONBAR_Pagingcaptionposition") ;
         Gridpaginationbar_Emptygridclass = httpContext.cgiGet( "GRIDPAGINATIONBAR_Emptygridclass") ;
         Gridpaginationbar_Rowsperpageselector = GXutil.strtobool( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselector")) ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridpaginationbar_Rowsperpageoptions = httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageoptions") ;
         Gridpaginationbar_Previous = httpContext.cgiGet( "GRIDPAGINATIONBAR_Previous") ;
         Gridpaginationbar_Next = httpContext.cgiGet( "GRIDPAGINATIONBAR_Next") ;
         Gridpaginationbar_Caption = httpContext.cgiGet( "GRIDPAGINATIONBAR_Caption") ;
         Gridpaginationbar_Emptygridcaption = httpContext.cgiGet( "GRIDPAGINATIONBAR_Emptygridcaption") ;
         Gridpaginationbar_Rowsperpagecaption = httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpagecaption") ;
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
         Ddo_grid_Allowmultipleselection = httpContext.cgiGet( "DDO_GRID_Allowmultipleselection") ;
         Ddo_grid_Datalistfixedvalues = httpContext.cgiGet( "DDO_GRID_Datalistfixedvalues") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( "DDO_GRID_Datalistproc") ;
         Ddo_grid_Cleanfilter = httpContext.cgiGet( "DDO_GRID_Cleanfilter") ;
         Dvelop_confirmpanel_crearcolor_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CREARCOLOR_Title") ;
         Dvelop_confirmpanel_crearcolor_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CREARCOLOR_Confirmationtext") ;
         Dvelop_confirmpanel_crearcolor_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CREARCOLOR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_crearcolor_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CREARCOLOR_Nobuttoncaption") ;
         Dvelop_confirmpanel_crearcolor_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CREARCOLOR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_crearcolor_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CREARCOLOR_Yesbuttonposition") ;
         Dvelop_confirmpanel_crearcolor_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CREARCOLOR_Confirmtype") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( "GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( "DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( "DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( "DDO_GRID_Filteredtextto_get") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( "DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( "DDO_GRID_Selectedcolumn") ;
         Dvelop_confirmpanel_crearcolor_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CREARCOLOR_Result") ;
         /* Read variables values. */
         cmbavEquiv.setName( cmbavEquiv.getInternalname() );
         cmbavEquiv.setValue( httpContext.cgiGet( cmbavEquiv.getInternalname()) );
         AV96Equiv = (byte)(GXutil.lval( httpContext.cgiGet( cmbavEquiv.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV96Equiv", GXutil.str( AV96Equiv, 1, 0));
         AV105Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV105Pgmname", AV105Pgmname);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_forfecauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_FORFECAUXDATE");
            GX_FocusControl = edtavDdo_forfecauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV70DDO_ForFecAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70DDO_ForFecAuxDate", localUtil.format(AV70DDO_ForFecAuxDate, "99/99/99"));
         }
         else
         {
            AV70DDO_ForFecAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_forfecauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70DDO_ForFecAuxDate", localUtil.format(AV70DDO_ForFecAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_forultmodauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_FORULTMODAUXDATE");
            GX_FocusControl = edtavDdo_forultmodauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV74DDO_ForUltModAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74DDO_ForUltModAuxDate", localUtil.format(AV74DDO_ForUltModAuxDate, "99/99/99"));
         }
         else
         {
            AV74DDO_ForUltModAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_forultmodauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74DDO_ForUltModAuxDate", localUtil.format(AV74DDO_ForUltModAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_forultutiauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_FORULTUTIAUXDATE");
            GX_FocusControl = edtavDdo_forultutiauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV78DDO_ForUltUtiAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV78DDO_ForUltUtiAuxDate", localUtil.format(AV78DDO_ForUltUtiAuxDate, "99/99/99"));
         }
         else
         {
            AV78DDO_ForUltUtiAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_forultutiauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV78DDO_ForUltUtiAuxDate", localUtil.format(AV78DDO_ForUltUtiAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_forfecaprauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_FORFECAPRAUXDATE");
            GX_FocusControl = edtavDdo_forfecaprauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV84DDO_ForFecAprAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV84DDO_ForFecAprAuxDate", localUtil.format(AV84DDO_ForFecAprAuxDate, "99/99/99"));
         }
         else
         {
            AV84DDO_ForFecAprAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_forfecaprauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV84DDO_ForFecAprAuxDate", localUtil.format(AV84DDO_ForFecAprAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         nGXsfl_54_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_54_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_54_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_542( ) ;
         if ( nGXsfl_54_idx > 0 )
         {
            AV47Select = httpContext.cgiGet( edtavSelect_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavSelect_Internalname, AV47Select);
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            A494ForSer = httpContext.cgiGet( edtForSer_Internalname) ;
            A5742ForSerDsc = httpContext.cgiGet( edtForSerDsc_Internalname) ;
            n5742ForSerDsc = false ;
            A13929ForTipArtD = httpContext.cgiGet( edtForTipArtD_Internalname) ;
            n13929ForTipArtD = false ;
            A482ForColNom = httpContext.cgiGet( edtForColNom_Internalname) ;
            A483ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtForColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A831TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtTipColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A832TipColDsc = httpContext.cgiGet( edtTipColDsc_Internalname) ;
            n832TipColDsc = false ;
            A1191ForNomCli = httpContext.cgiGet( edtForNomCli_Internalname) ;
            n1191ForNomCli = false ;
            A1192ForNumCli = (int)(localUtil.ctol( httpContext.cgiGet( edtForNumCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1192ForNumCli = false ;
            A584IntDsc = httpContext.cgiGet( edtIntDsc_Internalname) ;
            n584IntDsc = false ;
            A995ForTonal = httpContext.cgiGet( edtForTonal_Internalname) ;
            n995ForTonal = false ;
            A485ForFec = localUtil.ctod( httpContext.cgiGet( edtForFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n485ForFec = false ;
            A495ForUltMod = localUtil.ctod( httpContext.cgiGet( edtForUltMod_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n495ForUltMod = false ;
            A496ForUltUti = localUtil.ctod( httpContext.cgiGet( edtForUltUti_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n496ForUltUti = false ;
            A3315ForNumArc = (int)(localUtil.ctol( httpContext.cgiGet( edtForNumArc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3315ForNumArc = false ;
            A3558ForFecApr = localUtil.ctod( httpContext.cgiGet( edtForFecApr_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n3558ForFecApr = false ;
            A3560ForOpcCli = GXutil.upper( httpContext.cgiGet( edtForOpcCli_Internalname)) ;
            n3560ForOpcCli = false ;
            A486ForNumCol = (int)(localUtil.ctol( httpContext.cgiGet( edtForNumCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            cmbForBlo.setName( cmbForBlo.getInternalname() );
            cmbForBlo.setValue( httpContext.cgiGet( cmbForBlo.getInternalname()) );
            A7781ForBlo = httpContext.cgiGet( cmbForBlo.getInternalname()) ;
            n7781ForBlo = false ;
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"Dis_DisColNom_Prompt");
         AV105Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV105Pgmname", AV105Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV105Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("pedidos\\dis_discolnom_prompt:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e161Y12 ();
      if (returnInSub) return;
   }

   public void e161Y12( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV93Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      dis_discolnom_prompt_impl.this.GXt_char1 = GXv_char2[0] ;
      AV93Station = GXt_char1 ;
      GXv_char2[0] = AV7EmprCod ;
      GXv_char3[0] = AV94EmprNom ;
      GXv_char4[0] = AV95UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV93Station, GXv_char2, GXv_char3, GXv_char4) ;
      dis_discolnom_prompt_impl.this.AV7EmprCod = GXv_char2[0] ;
      dis_discolnom_prompt_impl.this.AV94EmprNom = GXv_char3[0] ;
      dis_discolnom_prompt_impl.this.AV95UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      divTablemain_Height = 600 ;
      httpContext.ajax_rsp_assign_prop("", false, divTablemain_Internalname, "Height", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTablemain_Height), 9, 0), true);
      divUnnamedtable2_Height = 500 ;
      httpContext.ajax_rsp_assign_prop("", false, divUnnamedtable2_Internalname, "Height", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable2_Height), 9, 0), true);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( "Selección de colores", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      if ( AV20OrderedBy < 1 )
      {
         AV20OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV43DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV43DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      AV61Session.setValue(AV105Pgmname+"GridState", "");
      AV63ManageFiltersXml = "" ;
      AV56TFCliCod = AV5CliCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TFCliCod), 6, 0));
      AV23TFForSer = AV6ForSer ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23TFForSer", AV23TFForSer);
      AV96Equiv = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV96Equiv", GXutil.str( AV96Equiv, 1, 0));
      AV56TFCliCod = (int)(GXutil.lval( GXutil.str( AV5CliCod, 6, 0))) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TFCliCod), 6, 0));
      Ddo_grid_Cleanfilter = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "CleanFilter", Ddo_grid_Cleanfilter);
   }

   public void e171Y12( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext7[0] = AV9WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV9WWPContext = GXv_SdtWWPContext7[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      AV45GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45GridCurrentPage), 10, 0));
      AV46GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46GridPageCount), 10, 0));
      edtavSelect_Columnheaderclass = "WWIconActionColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSelect_Internalname, "Columnheaderclass", edtavSelect_Columnheaderclass, !bGXsfl_54_Refreshing);
      edtCliCod_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Columnheaderclass", edtCliCod_Columnheaderclass, !bGXsfl_54_Refreshing);
      edtCliNom_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Columnheaderclass", edtCliNom_Columnheaderclass, !bGXsfl_54_Refreshing);
      edtForSer_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtForSer_Internalname, "Columnheaderclass", edtForSer_Columnheaderclass, !bGXsfl_54_Refreshing);
      edtForSerDsc_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtForSerDsc_Internalname, "Columnheaderclass", edtForSerDsc_Columnheaderclass, !bGXsfl_54_Refreshing);
      edtForTipArtD_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtForTipArtD_Internalname, "Columnheaderclass", edtForTipArtD_Columnheaderclass, !bGXsfl_54_Refreshing);
      edtForColNom_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtForColNom_Internalname, "Columnheaderclass", edtForColNom_Columnheaderclass, !bGXsfl_54_Refreshing);
      edtForColNum_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtForColNum_Internalname, "Columnheaderclass", edtForColNum_Columnheaderclass, !bGXsfl_54_Refreshing);
      edtTipColCod_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipColCod_Internalname, "Columnheaderclass", edtTipColCod_Columnheaderclass, !bGXsfl_54_Refreshing);
      edtTipColDsc_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipColDsc_Internalname, "Columnheaderclass", edtTipColDsc_Columnheaderclass, !bGXsfl_54_Refreshing);
      edtForNomCli_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtForNomCli_Internalname, "Columnheaderclass", edtForNomCli_Columnheaderclass, !bGXsfl_54_Refreshing);
      edtForNumCli_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtForNumCli_Internalname, "Columnheaderclass", edtForNumCli_Columnheaderclass, !bGXsfl_54_Refreshing);
      edtIntDsc_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtIntDsc_Internalname, "Columnheaderclass", edtIntDsc_Columnheaderclass, !bGXsfl_54_Refreshing);
      edtForTonal_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtForTonal_Internalname, "Columnheaderclass", edtForTonal_Columnheaderclass, !bGXsfl_54_Refreshing);
      edtForFec_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtForFec_Internalname, "Columnheaderclass", edtForFec_Columnheaderclass, !bGXsfl_54_Refreshing);
      edtForUltMod_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtForUltMod_Internalname, "Columnheaderclass", edtForUltMod_Columnheaderclass, !bGXsfl_54_Refreshing);
      edtForUltUti_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtForUltUti_Internalname, "Columnheaderclass", edtForUltUti_Columnheaderclass, !bGXsfl_54_Refreshing);
      edtForNumArc_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtForNumArc_Internalname, "Columnheaderclass", edtForNumArc_Columnheaderclass, !bGXsfl_54_Refreshing);
      edtForFecApr_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtForFecApr_Internalname, "Columnheaderclass", edtForFecApr_Columnheaderclass, !bGXsfl_54_Refreshing);
      edtForOpcCli_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtForOpcCli_Internalname, "Columnheaderclass", edtForOpcCli_Columnheaderclass, !bGXsfl_54_Refreshing);
      edtForNumCol_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtForNumCol_Internalname, "Columnheaderclass", edtForNumCol_Columnheaderclass, !bGXsfl_54_Refreshing);
      cmbForBlo.setColumnHeaderClass( "WWColumn" );
      httpContext.ajax_rsp_assign_prop("", false, cmbForBlo.getInternalname(), "Columnheaderclass", cmbForBlo.getColumnHeaderClass(), !bGXsfl_54_Refreshing);
      this.executeUsercontrolMethod("", false, "DATAMONJSContainer", "GridLayoutClean", "", new Object[] {});
      AV106Pedidos_dis_discolnom_promptds_1_tfclicod = AV56TFCliCod ;
      AV107Pedidos_dis_discolnom_promptds_2_tfclinom = AV57TFCliNom ;
      AV108Pedidos_dis_discolnom_promptds_3_tfforser = AV23TFForSer ;
      AV109Pedidos_dis_discolnom_promptds_4_tfforserdsc = AV58TFForSerDsc ;
      AV110Pedidos_dis_discolnom_promptds_5_tffortipartdsc = AV66TFForTipArtDsc ;
      AV111Pedidos_dis_discolnom_promptds_6_tffortipartdsc_sel = AV67TFForTipArtDsc_Sel ;
      AV112Pedidos_dis_discolnom_promptds_7_tfforcolnom = AV25TFForColNom ;
      AV113Pedidos_dis_discolnom_promptds_8_tfforcolnum = AV27TFForColNum ;
      AV114Pedidos_dis_discolnom_promptds_9_tftipcolcod = AV29TFTipColCod ;
      AV115Pedidos_dis_discolnom_promptds_10_tftipcoldsc = AV101TFTipColDsc ;
      AV116Pedidos_dis_discolnom_promptds_11_tftipcoldsc_sel = AV102TFTipColDsc_Sel ;
      AV117Pedidos_dis_discolnom_promptds_12_tffornomcli = AV31TFForNomCli ;
      AV118Pedidos_dis_discolnom_promptds_13_tffornumcli = AV33TFForNumCli ;
      AV119Pedidos_dis_discolnom_promptds_14_tfintdsc = AV35TFIntDsc ;
      AV120Pedidos_dis_discolnom_promptds_15_tffortonal = AV37TFForTonal ;
      AV121Pedidos_dis_discolnom_promptds_16_tfforfec = AV68TFForFec ;
      AV122Pedidos_dis_discolnom_promptds_17_tfforultmod = AV72TFForUltMod ;
      AV123Pedidos_dis_discolnom_promptds_18_tfforultuti = AV76TFForUltUti ;
      AV124Pedidos_dis_discolnom_promptds_19_tffornumarc = AV80TFForNumArc ;
      AV125Pedidos_dis_discolnom_promptds_20_tffornumarc_to = AV81TFForNumArc_To ;
      AV126Pedidos_dis_discolnom_promptds_21_tfforfecapr = AV82TFForFecApr ;
      AV127Pedidos_dis_discolnom_promptds_22_tfforopccli = AV86TFForOpcCli ;
      AV128Pedidos_dis_discolnom_promptds_23_tfforopccli_sel = AV87TFForOpcCli_Sel ;
      AV129Pedidos_dis_discolnom_promptds_24_tffornumcol = AV88TFForNumCol ;
      AV130Pedidos_dis_discolnom_promptds_25_tffornumcol_to = AV89TFForNumCol_To ;
      AV131Pedidos_dis_discolnom_promptds_26_tfforblo_sels = AV98TFForBlo_Sels ;
      /*  Sending Event outputs  */
   }

   public void e111Y12( )
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
         AV44PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV44PageToGo) ;
      }
   }

   public void e121Y12( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e131Y12( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV20OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20OrderedBy), 4, 0));
         AV21OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21OrderedDsc", AV21OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliCod") == 0 )
         {
            AV56TFCliCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TFCliCod), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliNom") == 0 )
         {
            AV57TFCliNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFCliNom", AV57TFCliNom);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForSer") == 0 )
         {
            AV23TFForSer = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23TFForSer", AV23TFForSer);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForSerDsc") == 0 )
         {
            AV58TFForSerDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFForSerDsc", AV58TFForSerDsc);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForTipArtDsc") == 0 )
         {
            AV66TFForTipArtDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66TFForTipArtDsc", AV66TFForTipArtDsc);
            AV67TFForTipArtDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67TFForTipArtDsc_Sel", AV67TFForTipArtDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForColNom") == 0 )
         {
            AV25TFForColNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25TFForColNom", AV25TFForColNom);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForColNum") == 0 )
         {
            AV27TFForColNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFForColNum), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "TipColCod") == 0 )
         {
            AV29TFTipColCod = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFTipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFTipColCod), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "TipColDsc") == 0 )
         {
            AV101TFTipColDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV101TFTipColDsc", AV101TFTipColDsc);
            AV102TFTipColDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV102TFTipColDsc_Sel", AV102TFTipColDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForNomCli") == 0 )
         {
            AV31TFForNomCli = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFForNomCli", AV31TFForNomCli);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForNumCli") == 0 )
         {
            AV33TFForNumCli = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFForNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33TFForNumCli), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "IntDsc") == 0 )
         {
            AV35TFIntDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFIntDsc", AV35TFIntDsc);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForTonal") == 0 )
         {
            AV37TFForTonal = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFForTonal", AV37TFForTonal);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForFec") == 0 )
         {
            AV68TFForFec = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68TFForFec", localUtil.format(AV68TFForFec, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForUltMod") == 0 )
         {
            AV72TFForUltMod = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV72TFForUltMod", localUtil.format(AV72TFForUltMod, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForUltUti") == 0 )
         {
            AV76TFForUltUti = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76TFForUltUti", localUtil.format(AV76TFForUltUti, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForNumArc") == 0 )
         {
            AV80TFForNumArc = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV80TFForNumArc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80TFForNumArc), 8, 0));
            AV81TFForNumArc_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV81TFForNumArc_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81TFForNumArc_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForFecApr") == 0 )
         {
            AV82TFForFecApr = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82TFForFecApr", localUtil.format(AV82TFForFecApr, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForOpcCli") == 0 )
         {
            AV86TFForOpcCli = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV86TFForOpcCli", AV86TFForOpcCli);
            AV87TFForOpcCli_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV87TFForOpcCli_Sel", AV87TFForOpcCli_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForNumCol") == 0 )
         {
            AV88TFForNumCol = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV88TFForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV88TFForNumCol), 8, 0));
            AV89TFForNumCol_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89TFForNumCol_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV89TFForNumCol_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForBlo") == 0 )
         {
            AV97TFForBlo_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV97TFForBlo_SelsJson", AV97TFForBlo_SelsJson);
            AV98TFForBlo_Sels.fromJSonString(AV97TFForBlo_SelsJson, null);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV98TFForBlo_Sels", AV98TFForBlo_Sels);
   }

   private void e181Y12( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV47Select = "<i class=\"fas fa-check\"></i>" ;
      httpContext.ajax_rsp_assign_attri("", false, edtavSelect_Internalname, AV47Select);
      edtavSelect_Columnclass = ((GXutil.strcmp(A7781ForBlo, "S")==0) ? "WWIconActionColumn WWColumnDanger WWColumnDangerFirstColumn" : "WWIconActionColumn") ;
      edtCliCod_Columnclass = ((GXutil.strcmp(A7781ForBlo, "S")==0) ? "WWColumn WWColumnDanger" : "WWColumn") ;
      edtCliNom_Columnclass = ((GXutil.strcmp(A7781ForBlo, "S")==0) ? "WWColumn WWColumnDanger hidden-xs" : "WWColumn hidden-xs") ;
      edtForSer_Columnclass = ((GXutil.strcmp(A7781ForBlo, "S")==0) ? "WWColumn WWColumnDanger" : "WWColumn") ;
      edtForSerDsc_Columnclass = ((GXutil.strcmp(A7781ForBlo, "S")==0) ? "WWColumn WWColumnDanger hidden-xs" : "WWColumn hidden-xs") ;
      edtForTipArtD_Columnclass = ((GXutil.strcmp(A7781ForBlo, "S")==0) ? "WWColumn WWColumnDanger" : "WWColumn") ;
      edtForColNom_Columnclass = ((GXutil.strcmp(A7781ForBlo, "S")==0) ? "WWColumn WWColumnDanger" : "WWColumn") ;
      edtForColNum_Columnclass = ((GXutil.strcmp(A7781ForBlo, "S")==0) ? "WWColumn WWColumnDanger" : "WWColumn") ;
      edtTipColCod_Columnclass = ((GXutil.strcmp(A7781ForBlo, "S")==0) ? "WWColumn WWColumnDanger" : "WWColumn") ;
      edtTipColDsc_Columnclass = ((GXutil.strcmp(A7781ForBlo, "S")==0) ? "WWColumn WWColumnDanger" : "WWColumn") ;
      edtForNomCli_Columnclass = ((GXutil.strcmp(A7781ForBlo, "S")==0) ? "WWColumn WWColumnDanger" : "WWColumn") ;
      edtForNumCli_Columnclass = ((GXutil.strcmp(A7781ForBlo, "S")==0) ? "WWColumn WWColumnDanger" : "WWColumn") ;
      edtIntDsc_Columnclass = ((GXutil.strcmp(A7781ForBlo, "S")==0) ? "WWColumn WWColumnDanger" : "WWColumn") ;
      edtForTonal_Columnclass = ((GXutil.strcmp(A7781ForBlo, "S")==0) ? "WWColumn WWColumnDanger" : "WWColumn") ;
      edtForFec_Columnclass = ((GXutil.strcmp(A7781ForBlo, "S")==0) ? "WWColumn WWColumnDanger hidden-xs" : "WWColumn hidden-xs") ;
      edtForUltMod_Columnclass = ((GXutil.strcmp(A7781ForBlo, "S")==0) ? "WWColumn WWColumnDanger" : "WWColumn") ;
      edtForUltUti_Columnclass = ((GXutil.strcmp(A7781ForBlo, "S")==0) ? "WWColumn WWColumnDanger" : "WWColumn") ;
      edtForNumArc_Columnclass = ((GXutil.strcmp(A7781ForBlo, "S")==0) ? "WWColumn WWColumnDanger" : "WWColumn") ;
      edtForFecApr_Columnclass = ((GXutil.strcmp(A7781ForBlo, "S")==0) ? "WWColumn WWColumnDanger hidden-xs" : "WWColumn hidden-xs") ;
      edtForOpcCli_Columnclass = ((GXutil.strcmp(A7781ForBlo, "S")==0) ? "WWColumn WWColumnDanger hidden-xs" : "WWColumn hidden-xs") ;
      edtForNumCol_Columnclass = ((GXutil.strcmp(A7781ForBlo, "S")==0) ? "WWColumn WWColumnDanger hidden-xs" : "WWColumn hidden-xs") ;
      cmbForBlo.setColumnClass( ((GXutil.strcmp(A7781ForBlo, "S")==0) ? "WWColumn WWColumnDanger" : "WWColumn") );
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(54) ;
      }
      sendrow_542( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_54_Refreshing )
      {
         httpContext.doAjaxLoad(54, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void e151Y12( )
   {
      /* 'DoCrearColor' Routine */
      returnInSub = false ;
      Dvelop_confirmpanel_crearcolor_Confirmationtext = httpContext.getMessage( "Origen", "")+GXutil.newLine( ) ;
      ucDvelop_confirmpanel_crearcolor.sendProperty(context, "", false, Dvelop_confirmpanel_crearcolor_Internalname, "ConfirmationText", Dvelop_confirmpanel_crearcolor_Confirmationtext);
      Dvelop_confirmpanel_crearcolor_Confirmationtext = Dvelop_confirmpanel_crearcolor_Confirmationtext+httpContext.getMessage( "Cliente :", "")+GXutil.trim( GXutil.str( A252CliCod, 6, 0))+GXutil.newLine( ) ;
      ucDvelop_confirmpanel_crearcolor.sendProperty(context, "", false, Dvelop_confirmpanel_crearcolor_Internalname, "ConfirmationText", Dvelop_confirmpanel_crearcolor_Confirmationtext);
      Dvelop_confirmpanel_crearcolor_Confirmationtext = Dvelop_confirmpanel_crearcolor_Confirmationtext+httpContext.getMessage( "Articulo:", "")+GXutil.trim( A494ForSer)+GXutil.newLine( ) ;
      ucDvelop_confirmpanel_crearcolor.sendProperty(context, "", false, Dvelop_confirmpanel_crearcolor_Internalname, "ConfirmationText", Dvelop_confirmpanel_crearcolor_Confirmationtext);
      Dvelop_confirmpanel_crearcolor_Confirmationtext = Dvelop_confirmpanel_crearcolor_Confirmationtext+httpContext.getMessage( "Color   :", "")+GXutil.trim( A482ForColNom)+GXutil.newLine( ) ;
      ucDvelop_confirmpanel_crearcolor.sendProperty(context, "", false, Dvelop_confirmpanel_crearcolor_Internalname, "ConfirmationText", Dvelop_confirmpanel_crearcolor_Confirmationtext);
      Dvelop_confirmpanel_crearcolor_Confirmationtext = Dvelop_confirmpanel_crearcolor_Confirmationtext+httpContext.getMessage( "Numero  :", "")+GXutil.trim( GXutil.str( A483ForColNum, 6, 0))+GXutil.newLine( ) ;
      ucDvelop_confirmpanel_crearcolor.sendProperty(context, "", false, Dvelop_confirmpanel_crearcolor_Internalname, "ConfirmationText", Dvelop_confirmpanel_crearcolor_Confirmationtext);
      Dvelop_confirmpanel_crearcolor_Confirmationtext = Dvelop_confirmpanel_crearcolor_Confirmationtext+httpContext.getMessage( "TC      :", "")+GXutil.trim( GXutil.str( A831TipColCod, 2, 0))+GXutil.newLine( ) ;
      ucDvelop_confirmpanel_crearcolor.sendProperty(context, "", false, Dvelop_confirmpanel_crearcolor_Internalname, "ConfirmationText", Dvelop_confirmpanel_crearcolor_Confirmationtext);
      Dvelop_confirmpanel_crearcolor_Confirmationtext = Dvelop_confirmpanel_crearcolor_Confirmationtext+httpContext.getMessage( "Destino", "")+GXutil.newLine( ) ;
      ucDvelop_confirmpanel_crearcolor.sendProperty(context, "", false, Dvelop_confirmpanel_crearcolor_Internalname, "ConfirmationText", Dvelop_confirmpanel_crearcolor_Confirmationtext);
      Dvelop_confirmpanel_crearcolor_Confirmationtext = Dvelop_confirmpanel_crearcolor_Confirmationtext+httpContext.getMessage( "Cliente :", "")+GXutil.trim( GXutil.str( AV5CliCod, 6, 0))+GXutil.newLine( ) ;
      ucDvelop_confirmpanel_crearcolor.sendProperty(context, "", false, Dvelop_confirmpanel_crearcolor_Internalname, "ConfirmationText", Dvelop_confirmpanel_crearcolor_Confirmationtext);
      Dvelop_confirmpanel_crearcolor_Confirmationtext = Dvelop_confirmpanel_crearcolor_Confirmationtext+httpContext.getMessage( "Articulo:", "")+GXutil.trim( AV6ForSer)+GXutil.newLine( ) ;
      ucDvelop_confirmpanel_crearcolor.sendProperty(context, "", false, Dvelop_confirmpanel_crearcolor_Internalname, "ConfirmationText", Dvelop_confirmpanel_crearcolor_Confirmationtext);
      Dvelop_confirmpanel_crearcolor_Confirmationtext = Dvelop_confirmpanel_crearcolor_Confirmationtext+httpContext.getMessage( "Color   :", "")+GXutil.trim( A482ForColNom)+GXutil.newLine( ) ;
      ucDvelop_confirmpanel_crearcolor.sendProperty(context, "", false, Dvelop_confirmpanel_crearcolor_Internalname, "ConfirmationText", Dvelop_confirmpanel_crearcolor_Confirmationtext);
      Dvelop_confirmpanel_crearcolor_Confirmationtext = Dvelop_confirmpanel_crearcolor_Confirmationtext+httpContext.getMessage( "Numero  :", "")+GXutil.trim( GXutil.str( A483ForColNum, 6, 0))+GXutil.newLine( ) ;
      ucDvelop_confirmpanel_crearcolor.sendProperty(context, "", false, Dvelop_confirmpanel_crearcolor_Internalname, "ConfirmationText", Dvelop_confirmpanel_crearcolor_Confirmationtext);
      Dvelop_confirmpanel_crearcolor_Confirmationtext = Dvelop_confirmpanel_crearcolor_Confirmationtext+httpContext.getMessage( "TC      :", "")+GXutil.trim( GXutil.str( A831TipColCod, 2, 0))+GXutil.newLine( ) ;
      ucDvelop_confirmpanel_crearcolor.sendProperty(context, "", false, Dvelop_confirmpanel_crearcolor_Internalname, "ConfirmationText", Dvelop_confirmpanel_crearcolor_Confirmationtext);
      Dvelop_confirmpanel_crearcolor_Confirmationtext = Dvelop_confirmpanel_crearcolor_Confirmationtext+" "+GXutil.newLine( ) ;
      ucDvelop_confirmpanel_crearcolor.sendProperty(context, "", false, Dvelop_confirmpanel_crearcolor_Internalname, "ConfirmationText", Dvelop_confirmpanel_crearcolor_Confirmationtext);
      Dvelop_confirmpanel_crearcolor_Confirmationtext = Dvelop_confirmpanel_crearcolor_Confirmationtext+((AV96Equiv==0) ? httpContext.getMessage( "opcion DUPLICADO", "") : httpContext.getMessage( "opcion EQUIVALENTE", ""))+GXutil.newLine( ) ;
      ucDvelop_confirmpanel_crearcolor.sendProperty(context, "", false, Dvelop_confirmpanel_crearcolor_Internalname, "ConfirmationText", Dvelop_confirmpanel_crearcolor_Confirmationtext);
      GXv_int8[0] = AV99Flag ;
      new app.formulaciontinte.pbufori(remoteHandle, context).execute( A396EmprCod, AV5CliCod, AV6ForSer, A482ForColNom, A483ForColNum, A831TipColCod, GXv_int8) ;
      dis_discolnom_prompt_impl.this.AV99Flag = GXv_int8[0] ;
      if ( AV99Flag == 1 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Color Destino, existe ¡¡¡", ""));
      }
      else
      {
         if ( GXutil.strcmp(A7781ForBlo, "S") == 0 )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Color Bloqueado !", ""));
         }
         else
         {
            this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_CREARCOLORContainer", "Confirm", "", new Object[] {});
         }
      }
      /*  Sending Event outputs  */
   }

   public void e141Y12( )
   {
      /* Dvelop_confirmpanel_crearcolor_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_crearcolor_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION CREARCOLOR' */
         S152 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      cmbavEquiv.setValue( GXutil.trim( GXutil.str( AV96Equiv, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavEquiv.getInternalname(), "Values", cmbavEquiv.ToJavascriptSource(), true);
   }

   public void S132( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV20OrderedBy, 4, 0))+":"+(AV21OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S152( )
   {
      /* 'DO ACTION CREARCOLOR' Routine */
      returnInSub = false ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int9[0] = A252CliCod ;
      GXv_char3[0] = A494ForSer ;
      GXv_char2[0] = A482ForColNom ;
      GXv_int10[0] = A483ForColNum ;
      GXv_int8[0] = A831TipColCod ;
      GXv_int11[0] = AV5CliCod ;
      GXv_char12[0] = AV6ForSer ;
      GXv_char13[0] = A482ForColNom ;
      GXv_int14[0] = A483ForColNum ;
      GXv_int15[0] = A831TipColCod ;
      GXv_char16[0] = A1191ForNomCli ;
      GXv_int17[0] = A1192ForNumCli ;
      GXv_int18[0] = AV96Equiv ;
      new app.pdupfork(remoteHandle, context).execute( GXv_char4, GXv_int9, GXv_char3, GXv_char2, GXv_int10, GXv_int8, GXv_int11, GXv_char12, GXv_char13, GXv_int14, GXv_int15, GXv_char16, GXv_int17, GXv_int18) ;
      dis_discolnom_prompt_impl.this.A396EmprCod = GXv_char4[0] ;
      dis_discolnom_prompt_impl.this.A252CliCod = GXv_int9[0] ;
      dis_discolnom_prompt_impl.this.A494ForSer = GXv_char3[0] ;
      dis_discolnom_prompt_impl.this.A482ForColNom = GXv_char2[0] ;
      dis_discolnom_prompt_impl.this.A483ForColNum = GXv_int10[0] ;
      dis_discolnom_prompt_impl.this.A831TipColCod = GXv_int8[0] ;
      dis_discolnom_prompt_impl.this.AV5CliCod = GXv_int11[0] ;
      dis_discolnom_prompt_impl.this.AV6ForSer = GXv_char12[0] ;
      dis_discolnom_prompt_impl.this.A482ForColNom = GXv_char13[0] ;
      dis_discolnom_prompt_impl.this.A483ForColNum = GXv_int14[0] ;
      dis_discolnom_prompt_impl.this.A831TipColCod = GXv_int15[0] ;
      dis_discolnom_prompt_impl.this.A1191ForNomCli = GXv_char16[0] ;
      dis_discolnom_prompt_impl.this.A1192ForNumCli = GXv_int17[0] ;
      dis_discolnom_prompt_impl.this.AV96Equiv = GXv_int18[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5CliCod), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV6ForSer", AV6ForSer);
      httpContext.ajax_rsp_assign_attri("", false, "AV96Equiv", GXutil.str( AV96Equiv, 1, 0));
      AV49ForColNom = A482ForColNom ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49ForColNom", AV49ForColNom);
      AV50ForColNum = A483ForColNum ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50ForColNum), 6, 0));
      AV51TipColCod = A831TipColCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51TipColCod), 2, 0));
      AV52ForNomCli = A1191ForNomCli ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52ForNomCli", AV52ForNomCli);
      AV53ForNumCli = A1192ForNumCli ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53ForNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53ForNumCli), 6, 0));
      AV54ForRGB = A4339ForRGB ;
      AV65Fortonal = A995ForTonal ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65Fortonal", AV65Fortonal);
      AV91forblo = A7781ForBlo ;
      httpContext.ajax_rsp_assign_attri("", false, "AV91forblo", AV91forblo);
      httpContext.setWebReturnParms(new Object[] {AV49ForColNom,Integer.valueOf(AV50ForColNum),AV52ForNomCli,Integer.valueOf(AV53ForNumCli),Byte.valueOf(AV51TipColCod),AV65Fortonal,AV91forblo,AV100TipColDsc});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV49ForColNom","AV50ForColNum","AV52ForNomCli","AV53ForNumCli","AV51TipColCod","AV65Fortonal","AV91forblo","AV100TipColDsc"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV61Session.getValue(AV105Pgmname+"GridState"), "") == 0 )
      {
         AV18GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV105Pgmname+"GridState"), null, null);
      }
      else
      {
         AV18GridState.fromxml(AV61Session.getValue(AV105Pgmname+"GridState"), null, null);
      }
      AV20OrderedBy = AV18GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20OrderedBy), 4, 0));
      AV21OrderedDsc = AV18GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21OrderedDsc", AV21OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S132 ();
      if (returnInSub) return;
      AV132GXV1 = 1 ;
      while ( AV132GXV1 <= AV18GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV19GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV18GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV132GXV1));
         if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV56TFCliCod = (int)(GXutil.lval( AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TFCliCod), 6, 0));
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV57TFCliNom = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFCliNom", AV57TFCliNom);
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER") == 0 )
         {
            AV23TFForSer = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23TFForSer", AV23TFForSer);
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSERDSC") == 0 )
         {
            AV58TFForSerDsc = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFForSerDsc", AV58TFForSerDsc);
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORTIPARTDSC") == 0 )
         {
            AV66TFForTipArtDsc = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66TFForTipArtDsc", AV66TFForTipArtDsc);
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORTIPARTDSC_SEL") == 0 )
         {
            AV67TFForTipArtDsc_Sel = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67TFForTipArtDsc_Sel", AV67TFForTipArtDsc_Sel);
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM") == 0 )
         {
            AV25TFForColNom = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25TFForColNom", AV25TFForColNom);
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNUM") == 0 )
         {
            AV27TFForColNum = (int)(GXutil.lval( AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFForColNum), 6, 0));
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLCOD") == 0 )
         {
            AV29TFTipColCod = (byte)(GXutil.lval( AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFTipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFTipColCod), 2, 0));
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLDSC") == 0 )
         {
            AV101TFTipColDsc = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV101TFTipColDsc", AV101TFTipColDsc);
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLDSC_SEL") == 0 )
         {
            AV102TFTipColDsc_Sel = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV102TFTipColDsc_Sel", AV102TFTipColDsc_Sel);
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORNOMCLI") == 0 )
         {
            AV31TFForNomCli = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFForNomCli", AV31TFForNomCli);
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORNUMCLI") == 0 )
         {
            AV33TFForNumCli = (int)(GXutil.lval( AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFForNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33TFForNumCli), 6, 0));
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTDSC") == 0 )
         {
            AV35TFIntDsc = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFIntDsc", AV35TFIntDsc);
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORTONAL") == 0 )
         {
            AV37TFForTonal = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFForTonal", AV37TFForTonal);
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORFEC") == 0 )
         {
            AV68TFForFec = localUtil.ctod( AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68TFForFec", localUtil.format(AV68TFForFec, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORULTMOD") == 0 )
         {
            AV72TFForUltMod = localUtil.ctod( AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV72TFForUltMod", localUtil.format(AV72TFForUltMod, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORULTUTI") == 0 )
         {
            AV76TFForUltUti = localUtil.ctod( AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76TFForUltUti", localUtil.format(AV76TFForUltUti, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORNUMARC") == 0 )
         {
            AV80TFForNumArc = (int)(GXutil.lval( AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV80TFForNumArc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80TFForNumArc), 8, 0));
            AV81TFForNumArc_To = (int)(GXutil.lval( AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV81TFForNumArc_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81TFForNumArc_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORFECAPR") == 0 )
         {
            AV82TFForFecApr = localUtil.ctod( AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82TFForFecApr", localUtil.format(AV82TFForFecApr, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFOROPCCLI") == 0 )
         {
            AV86TFForOpcCli = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV86TFForOpcCli", AV86TFForOpcCli);
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFOROPCCLI_SEL") == 0 )
         {
            AV87TFForOpcCli_Sel = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV87TFForOpcCli_Sel", AV87TFForOpcCli_Sel);
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORNUMCOL") == 0 )
         {
            AV88TFForNumCol = (int)(GXutil.lval( AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV88TFForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV88TFForNumCol), 8, 0));
            AV89TFForNumCol_To = (int)(GXutil.lval( AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89TFForNumCol_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV89TFForNumCol_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORBLO_SEL") == 0 )
         {
            AV97TFForBlo_SelsJson = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV97TFForBlo_SelsJson", AV97TFForBlo_SelsJson);
            AV98TFForBlo_Sels.fromJSonString(AV97TFForBlo_SelsJson, null);
         }
         AV132GXV1 = (int)(AV132GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char16[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV67TFForTipArtDsc_Sel)==0), AV67TFForTipArtDsc_Sel, GXv_char16) ;
      dis_discolnom_prompt_impl.this.GXt_char1 = GXv_char16[0] ;
      GXt_char19 = "" ;
      GXv_char13[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV102TFTipColDsc_Sel)==0), AV102TFTipColDsc_Sel, GXv_char13) ;
      dis_discolnom_prompt_impl.this.GXt_char19 = GXv_char13[0] ;
      GXt_char20 = "" ;
      GXv_char12[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV87TFForOpcCli_Sel)==0), AV87TFForOpcCli_Sel, GXv_char12) ;
      dis_discolnom_prompt_impl.this.GXt_char20 = GXv_char12[0] ;
      GXt_char21 = "" ;
      GXv_char4[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV98TFForBlo_Sels.size()==0), AV97TFForBlo_SelsJson, GXv_char4) ;
      dis_discolnom_prompt_impl.this.GXt_char21 = GXv_char4[0] ;
      Ddo_grid_Selectedvalue_set = "||||"+GXt_char1+"||||"+GXt_char19+"||||||||||"+GXt_char20+"||"+GXt_char21 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char21 = "" ;
      GXv_char16[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV57TFCliNom)==0), AV57TFCliNom, GXv_char16) ;
      dis_discolnom_prompt_impl.this.GXt_char21 = GXv_char16[0] ;
      GXt_char20 = "" ;
      GXv_char13[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV23TFForSer)==0), AV23TFForSer, GXv_char13) ;
      dis_discolnom_prompt_impl.this.GXt_char20 = GXv_char13[0] ;
      GXt_char19 = "" ;
      GXv_char12[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV58TFForSerDsc)==0), AV58TFForSerDsc, GXv_char12) ;
      dis_discolnom_prompt_impl.this.GXt_char19 = GXv_char12[0] ;
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV66TFForTipArtDsc)==0), AV66TFForTipArtDsc, GXv_char4) ;
      dis_discolnom_prompt_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char22 = "" ;
      GXv_char3[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV25TFForColNom)==0), AV25TFForColNom, GXv_char3) ;
      dis_discolnom_prompt_impl.this.GXt_char22 = GXv_char3[0] ;
      GXt_char23 = "" ;
      GXv_char2[0] = GXt_char23 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV101TFTipColDsc)==0), AV101TFTipColDsc, GXv_char2) ;
      dis_discolnom_prompt_impl.this.GXt_char23 = GXv_char2[0] ;
      GXt_char24 = "" ;
      GXv_char25[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV31TFForNomCli)==0), AV31TFForNomCli, GXv_char25) ;
      dis_discolnom_prompt_impl.this.GXt_char24 = GXv_char25[0] ;
      GXt_char26 = "" ;
      GXv_char27[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV35TFIntDsc)==0), AV35TFIntDsc, GXv_char27) ;
      dis_discolnom_prompt_impl.this.GXt_char26 = GXv_char27[0] ;
      GXt_char28 = "" ;
      GXv_char29[0] = GXt_char28 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV37TFForTonal)==0), AV37TFForTonal, GXv_char29) ;
      dis_discolnom_prompt_impl.this.GXt_char28 = GXv_char29[0] ;
      GXt_char30 = "" ;
      GXv_char31[0] = GXt_char30 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV86TFForOpcCli)==0), AV86TFForOpcCli, GXv_char31) ;
      dis_discolnom_prompt_impl.this.GXt_char30 = GXv_char31[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV56TFCliCod) ? "" : GXutil.str( AV56TFCliCod, 6, 0))+"|"+GXt_char21+"|"+GXt_char20+"|"+GXt_char19+"|"+GXt_char1+"|"+GXt_char22+"|"+((0==AV27TFForColNum) ? "" : GXutil.str( AV27TFForColNum, 6, 0))+"|"+((0==AV29TFTipColCod) ? "" : GXutil.str( AV29TFTipColCod, 2, 0))+"|"+GXt_char23+"|"+GXt_char24+"|"+((0==AV33TFForNumCli) ? "" : GXutil.str( AV33TFForNumCli, 6, 0))+"|"+GXt_char26+"|"+GXt_char28+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV68TFForFec)) ? "" : localUtil.dtoc( AV68TFForFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV72TFForUltMod)) ? "" : localUtil.dtoc( AV72TFForUltMod, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV76TFForUltUti)) ? "" : localUtil.dtoc( AV76TFForUltUti, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+((0==AV80TFForNumArc) ? "" : GXutil.str( AV80TFForNumArc, 8, 0))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV82TFForFecApr)) ? "" : localUtil.dtoc( AV82TFForFecApr, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+GXt_char30+"|"+((0==AV88TFForNumCol) ? "" : GXutil.str( AV88TFForNumCol, 8, 0))+"|" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "||||||||||||||||"+((0==AV81TFForNumArc_To) ? "" : GXutil.str( AV81TFForNumArc_To, 8, 0))+"|||"+((0==AV89TFForNumCol_To) ? "" : GXutil.str( AV89TFForNumCol_To, 8, 0))+"|" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
      if ( ! (GXutil.strcmp("", GXutil.trim( AV18GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV18GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV18GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S142( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV18GridState.fromxml(AV61Session.getValue(AV105Pgmname+"GridState"), null, null);
      AV18GridState.setgxTv_SdtWWPGridState_Orderedby( AV20OrderedBy );
      AV18GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV21OrderedDsc );
      AV18GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState32[0] = AV18GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFCLICOD", "", !(0==AV56TFCliCod), (short)(0), GXutil.trim( GXutil.str( AV56TFCliCod, 6, 0)), "") ;
      AV18GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV18GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFCLINOM", "", !(GXutil.strcmp("", AV57TFCliNom)==0), (short)(0), AV57TFCliNom, "") ;
      AV18GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV18GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFFORSER", "", !(GXutil.strcmp("", AV23TFForSer)==0), (short)(0), AV23TFForSer, "") ;
      AV18GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV18GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFFORSERDSC", "", !(GXutil.strcmp("", AV58TFForSerDsc)==0), (short)(0), AV58TFForSerDsc, "") ;
      AV18GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV18GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFFORTIPARTDSC", "", !(GXutil.strcmp("", AV66TFForTipArtDsc)==0), (short)(0), AV66TFForTipArtDsc, "", !(GXutil.strcmp("", AV67TFForTipArtDsc_Sel)==0), AV67TFForTipArtDsc_Sel, "") ;
      AV18GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV18GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFFORCOLNOM", "", !(GXutil.strcmp("", AV25TFForColNom)==0), (short)(0), AV25TFForColNom, "") ;
      AV18GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV18GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFFORCOLNUM", "", !(0==AV27TFForColNum), (short)(0), GXutil.trim( GXutil.str( AV27TFForColNum, 6, 0)), "") ;
      AV18GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV18GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFTIPCOLCOD", "", !(0==AV29TFTipColCod), (short)(0), GXutil.trim( GXutil.str( AV29TFTipColCod, 2, 0)), "") ;
      AV18GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV18GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFTIPCOLDSC", "", !(GXutil.strcmp("", AV101TFTipColDsc)==0), (short)(0), AV101TFTipColDsc, "", !(GXutil.strcmp("", AV102TFTipColDsc_Sel)==0), AV102TFTipColDsc_Sel, "") ;
      AV18GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV18GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFFORNOMCLI", "", !(GXutil.strcmp("", AV31TFForNomCli)==0), (short)(0), AV31TFForNomCli, "") ;
      AV18GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV18GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFFORNUMCLI", "", !(0==AV33TFForNumCli), (short)(0), GXutil.trim( GXutil.str( AV33TFForNumCli, 6, 0)), "") ;
      AV18GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV18GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFINTDSC", "", !(GXutil.strcmp("", AV35TFIntDsc)==0), (short)(0), AV35TFIntDsc, "") ;
      AV18GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV18GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFFORTONAL", "", !(GXutil.strcmp("", AV37TFForTonal)==0), (short)(0), AV37TFForTonal, "") ;
      AV18GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV18GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFFORFEC", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV68TFForFec)), (short)(0), GXutil.trim( localUtil.dtoc( AV68TFForFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV18GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV18GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFFORULTMOD", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV72TFForUltMod)), (short)(0), GXutil.trim( localUtil.dtoc( AV72TFForUltMod, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV18GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV18GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFFORULTUTI", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV76TFForUltUti)), (short)(0), GXutil.trim( localUtil.dtoc( AV76TFForUltUti, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV18GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV18GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFFORNUMARC", "", !((0==AV80TFForNumArc)&&(0==AV81TFForNumArc_To)), (short)(0), GXutil.trim( GXutil.str( AV80TFForNumArc, 8, 0)), GXutil.trim( GXutil.str( AV81TFForNumArc_To, 8, 0))) ;
      AV18GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV18GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFFORFECAPR", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV82TFForFecApr)), (short)(0), GXutil.trim( localUtil.dtoc( AV82TFForFecApr, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV18GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV18GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFFOROPCCLI", "", !(GXutil.strcmp("", AV86TFForOpcCli)==0), (short)(0), AV86TFForOpcCli, "", !(GXutil.strcmp("", AV87TFForOpcCli_Sel)==0), AV87TFForOpcCli_Sel, "") ;
      AV18GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV18GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFFORNUMCOL", "", !((0==AV88TFForNumCol)&&(0==AV89TFForNumCol_To)), (short)(0), GXutil.trim( GXutil.str( AV88TFForNumCol, 8, 0)), GXutil.trim( GXutil.str( AV89TFForNumCol_To, 8, 0))) ;
      AV18GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV18GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFFORBLO_SEL", "", !(AV98TFForBlo_Sels.size()==0), (short)(0), AV98TFForBlo_Sels.toJSonString(false), "") ;
      AV18GridState = GXv_SdtWWPGridState32[0] ;
      AV18GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV18GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV105Pgmname+"GridState", AV18GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV59TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV59TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV105Pgmname );
      AV59TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV59TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV17HTTPRequest.getScriptName()+"?"+AV17HTTPRequest.getQuerystring() );
      AV59TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TCFORMU" );
      AV61Session.setValue("TrnContext", AV59TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e191Y12 ();
      if (returnInSub) return;
   }

   public void e191Y12( )
   {
      /* Enter Routine */
      returnInSub = false ;
      AV49ForColNom = A482ForColNom ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49ForColNom", AV49ForColNom);
      AV50ForColNum = A483ForColNum ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50ForColNum), 6, 0));
      AV51TipColCod = A831TipColCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51TipColCod), 2, 0));
      AV52ForNomCli = A1191ForNomCli ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52ForNomCli", AV52ForNomCli);
      AV53ForNumCli = A1192ForNumCli ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53ForNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53ForNumCli), 6, 0));
      AV54ForRGB = A4339ForRGB ;
      AV65Fortonal = A995ForTonal ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65Fortonal", AV65Fortonal);
      AV91forblo = A7781ForBlo ;
      httpContext.ajax_rsp_assign_attri("", false, "AV91forblo", AV91forblo);
      AV100TipColDsc = A832TipColDsc ;
      httpContext.ajax_rsp_assign_attri("", false, "AV100TipColDsc", AV100TipColDsc);
      GXv_int18[0] = AV99Flag ;
      new app.formulaciontinte.pbufori(remoteHandle, context).execute( A396EmprCod, AV5CliCod, AV6ForSer, A482ForColNom, A483ForColNum, A831TipColCod, GXv_int18) ;
      dis_discolnom_prompt_impl.this.AV99Flag = GXv_int18[0] ;
      httpContext.setWebReturnParms(new Object[] {AV49ForColNom,Integer.valueOf(AV50ForColNum),AV52ForNomCli,Integer.valueOf(AV53ForNumCli),Byte.valueOf(AV51TipColCod),AV65Fortonal,AV91forblo,AV100TipColDsc});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV49ForColNom","AV50ForColNum","AV52ForNomCli","AV53ForNumCli","AV51TipColCod","AV65Fortonal","AV91forblo","AV100TipColDsc"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
   }

   public void wb_table2_92_1Y12( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_crearcolor_Internalname, tblTabledvelop_confirmpanel_crearcolor_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_crearcolor.setProperty("Title", Dvelop_confirmpanel_crearcolor_Title);
         ucDvelop_confirmpanel_crearcolor.setProperty("ConfirmationText", Dvelop_confirmpanel_crearcolor_Confirmationtext);
         ucDvelop_confirmpanel_crearcolor.setProperty("YesButtonCaption", Dvelop_confirmpanel_crearcolor_Yesbuttoncaption);
         ucDvelop_confirmpanel_crearcolor.setProperty("NoButtonCaption", Dvelop_confirmpanel_crearcolor_Nobuttoncaption);
         ucDvelop_confirmpanel_crearcolor.setProperty("CancelButtonCaption", Dvelop_confirmpanel_crearcolor_Cancelbuttoncaption);
         ucDvelop_confirmpanel_crearcolor.setProperty("YesButtonPosition", Dvelop_confirmpanel_crearcolor_Yesbuttonposition);
         ucDvelop_confirmpanel_crearcolor.setProperty("ConfirmType", Dvelop_confirmpanel_crearcolor_Confirmtype);
         ucDvelop_confirmpanel_crearcolor.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_crearcolor_Internalname, "DVELOP_CONFIRMPANEL_CREARCOLORContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_CREARCOLORContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_92_1Y12e( true) ;
      }
      else
      {
         wb_table2_92_1Y12e( false) ;
      }
   }

   public void wb_table1_43_1Y12( boolean wbgen )
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
         wb_table1_43_1Y12e( true) ;
      }
      else
      {
         wb_table1_43_1Y12e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV7EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      AV5CliCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5CliCod), 6, 0));
      AV6ForSer = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6ForSer", AV6ForSer);
      AV49ForColNom = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49ForColNom", AV49ForColNom);
      AV50ForColNum = ((Number) GXutil.testNumericType( getParm(obj,4), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50ForColNum), 6, 0));
      AV52ForNomCli = (String)getParm(obj,5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52ForNomCli", AV52ForNomCli);
      AV53ForNumCli = ((Number) GXutil.testNumericType( getParm(obj,6), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53ForNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53ForNumCli), 6, 0));
      AV51TipColCod = ((Number) GXutil.testNumericType( getParm(obj,7), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51TipColCod), 2, 0));
      AV65Fortonal = (String)getParm(obj,8) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65Fortonal", AV65Fortonal);
      AV91forblo = (String)getParm(obj,9) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV91forblo", AV91forblo);
      AV100TipColDsc = (String)getParm(obj,10) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV100TipColDsc", AV100TipColDsc);
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
      pa1Y12( ) ;
      ws1Y12( ) ;
      we1Y12( ) ;
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
      httpContext.AddStyleSheetFile("DVelop/DVPaginationBar/DVPaginationBar.css", "");
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116142762", true, true);
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
      httpContext.AddJavascriptSource("pedidos/dis_discolnom_prompt.js", "?202682116142762", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
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

   public void subsflControlProps_542( )
   {
      edtavSelect_Internalname = "vSELECT_"+sGXsfl_54_idx ;
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_54_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_54_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_54_idx ;
      edtForSer_Internalname = "FORSER_"+sGXsfl_54_idx ;
      edtForSerDsc_Internalname = "FORSERDSC_"+sGXsfl_54_idx ;
      edtForTipArtD_Internalname = "FORTIPARTD_"+sGXsfl_54_idx ;
      edtForColNom_Internalname = "FORCOLNOM_"+sGXsfl_54_idx ;
      edtForColNum_Internalname = "FORCOLNUM_"+sGXsfl_54_idx ;
      edtTipColCod_Internalname = "TIPCOLCOD_"+sGXsfl_54_idx ;
      edtTipColDsc_Internalname = "TIPCOLDSC_"+sGXsfl_54_idx ;
      edtForNomCli_Internalname = "FORNOMCLI_"+sGXsfl_54_idx ;
      edtForNumCli_Internalname = "FORNUMCLI_"+sGXsfl_54_idx ;
      edtIntDsc_Internalname = "INTDSC_"+sGXsfl_54_idx ;
      edtForTonal_Internalname = "FORTONAL_"+sGXsfl_54_idx ;
      edtForFec_Internalname = "FORFEC_"+sGXsfl_54_idx ;
      edtForUltMod_Internalname = "FORULTMOD_"+sGXsfl_54_idx ;
      edtForUltUti_Internalname = "FORULTUTI_"+sGXsfl_54_idx ;
      edtForNumArc_Internalname = "FORNUMARC_"+sGXsfl_54_idx ;
      edtForFecApr_Internalname = "FORFECAPR_"+sGXsfl_54_idx ;
      edtForOpcCli_Internalname = "FOROPCCLI_"+sGXsfl_54_idx ;
      edtForNumCol_Internalname = "FORNUMCOL_"+sGXsfl_54_idx ;
      cmbForBlo.setInternalname( "FORBLO_"+sGXsfl_54_idx );
   }

   public void subsflControlProps_fel_542( )
   {
      edtavSelect_Internalname = "vSELECT_"+sGXsfl_54_fel_idx ;
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_54_fel_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_54_fel_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_54_fel_idx ;
      edtForSer_Internalname = "FORSER_"+sGXsfl_54_fel_idx ;
      edtForSerDsc_Internalname = "FORSERDSC_"+sGXsfl_54_fel_idx ;
      edtForTipArtD_Internalname = "FORTIPARTD_"+sGXsfl_54_fel_idx ;
      edtForColNom_Internalname = "FORCOLNOM_"+sGXsfl_54_fel_idx ;
      edtForColNum_Internalname = "FORCOLNUM_"+sGXsfl_54_fel_idx ;
      edtTipColCod_Internalname = "TIPCOLCOD_"+sGXsfl_54_fel_idx ;
      edtTipColDsc_Internalname = "TIPCOLDSC_"+sGXsfl_54_fel_idx ;
      edtForNomCli_Internalname = "FORNOMCLI_"+sGXsfl_54_fel_idx ;
      edtForNumCli_Internalname = "FORNUMCLI_"+sGXsfl_54_fel_idx ;
      edtIntDsc_Internalname = "INTDSC_"+sGXsfl_54_fel_idx ;
      edtForTonal_Internalname = "FORTONAL_"+sGXsfl_54_fel_idx ;
      edtForFec_Internalname = "FORFEC_"+sGXsfl_54_fel_idx ;
      edtForUltMod_Internalname = "FORULTMOD_"+sGXsfl_54_fel_idx ;
      edtForUltUti_Internalname = "FORULTUTI_"+sGXsfl_54_fel_idx ;
      edtForNumArc_Internalname = "FORNUMARC_"+sGXsfl_54_fel_idx ;
      edtForFecApr_Internalname = "FORFECAPR_"+sGXsfl_54_fel_idx ;
      edtForOpcCli_Internalname = "FOROPCCLI_"+sGXsfl_54_fel_idx ;
      edtForNumCol_Internalname = "FORNUMCOL_"+sGXsfl_54_fel_idx ;
      cmbForBlo.setInternalname( "FORBLO_"+sGXsfl_54_fel_idx );
   }

   public void sendrow_542( )
   {
      subsflControlProps_542( ) ;
      wb1Y10( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_54_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_54_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_54_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavSelect_Enabled!=0)&&(edtavSelect_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 55,'',false,'"+sGXsfl_54_idx+"',54)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSelect_Internalname,GXutil.rtrim( AV47Select),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavSelect_Enabled!=0)&&(edtavSelect_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,55);\"" : " "),"'"+""+"'"+",false,"+"'"+"EENTER."+sGXsfl_54_idx+"'","","",httpContext.getMessage( "GX_BtnSelect", ""),"",edtavSelect_Jsonclick,Integer.valueOf(5),"Attribute","",ROClassString,edtavSelect_Columnclass,edtavSelect_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavSelect_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtCliCod_Columnclass,edtCliCod_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtCliNom_Columnclass,edtCliNom_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForSer_Internalname,GXutil.rtrim( A494ForSer),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtForSer_Columnclass,edtForSer_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForSerDsc_Internalname,GXutil.rtrim( A5742ForSerDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForSerDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtForSerDsc_Columnclass,edtForSerDsc_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForTipArtD_Internalname,GXutil.rtrim( A13929ForTipArtD),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForTipArtD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtForTipArtD_Columnclass,edtForTipArtD_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForColNom_Internalname,GXutil.rtrim( A482ForColNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtForColNom_Columnclass,edtForColNom_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A483ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtForColNum_Columnclass,edtForColNum_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipColCod_Internalname,GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTipColCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtTipColCod_Columnclass,edtTipColCod_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipColDsc_Internalname,GXutil.rtrim( A832TipColDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTipColDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtTipColDsc_Columnclass,edtTipColDsc_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForNomCli_Internalname,GXutil.rtrim( A1191ForNomCli),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForNomCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtForNomCli_Columnclass,edtForNomCli_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForNumCli_Internalname,GXutil.ltrim( localUtil.ntoc( A1192ForNumCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1192ForNumCli), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForNumCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtForNumCli_Columnclass,edtForNumCli_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtIntDsc_Internalname,GXutil.rtrim( A584IntDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtIntDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtIntDsc_Columnclass,edtIntDsc_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForTonal_Internalname,GXutil.rtrim( A995ForTonal),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForTonal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtForTonal_Columnclass,edtForTonal_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForFec_Internalname,localUtil.format(A485ForFec, "99/99/99"),localUtil.format( A485ForFec, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForFec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtForFec_Columnclass,edtForFec_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForUltMod_Internalname,localUtil.format(A495ForUltMod, "99/99/99"),localUtil.format( A495ForUltMod, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForUltMod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtForUltMod_Columnclass,edtForUltMod_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForUltUti_Internalname,localUtil.format(A496ForUltUti, "99/99/99"),localUtil.format( A496ForUltUti, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForUltUti_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtForUltUti_Columnclass,edtForUltUti_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForNumArc_Internalname,GXutil.ltrim( localUtil.ntoc( A3315ForNumArc, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3315ForNumArc), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForNumArc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtForNumArc_Columnclass,edtForNumArc_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForFecApr_Internalname,localUtil.format(A3558ForFecApr, "99/99/99"),localUtil.format( A3558ForFecApr, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForFecApr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtForFecApr_Columnclass,edtForFecApr_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForOpcCli_Internalname,GXutil.rtrim( A3560ForOpcCli),GXutil.rtrim( localUtil.format( A3560ForOpcCli, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForOpcCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtForOpcCli_Columnclass,edtForOpcCli_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForNumCol_Internalname,GXutil.ltrim( localUtil.ntoc( A486ForNumCol, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A486ForNumCol), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForNumCol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtForNumCol_Columnclass,edtForNumCol_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( cmbForBlo.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "FORBLO_" + sGXsfl_54_idx ;
            cmbForBlo.setName( GXCCtl );
            cmbForBlo.setWebtags( "" );
            cmbForBlo.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
            cmbForBlo.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
            if ( cmbForBlo.getItemCount() > 0 )
            {
               A7781ForBlo = cmbForBlo.getValidValue(A7781ForBlo) ;
               n7781ForBlo = false ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbForBlo,cmbForBlo.getInternalname(),GXutil.rtrim( A7781ForBlo),Integer.valueOf(1),cmbForBlo.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute",cmbForBlo.getColumnClass(),cmbForBlo.getColumnHeaderClass(),"","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbForBlo.setValue( GXutil.rtrim( A7781ForBlo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbForBlo.getInternalname(), "Values", cmbForBlo.ToJavascriptSource(), !bGXsfl_54_Refreshing);
         send_integrity_lvl_hashes1Y12( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_54_idx = ((subGrid_Islastpage==1)&&(nGXsfl_54_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_54_idx+1) ;
         sGXsfl_54_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_54_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_542( ) ;
      }
      /* End function sendrow_542 */
   }

   public void startgridcontrol54( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"54\">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Código Empresa", "")) ;
         httpContext.writeTextNL( "</th>") ;
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
         httpContext.writeValue( httpContext.getMessage( "Tipo Art.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tc", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color Cli.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero Cli.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Intensidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Colección", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Ent.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Ult. Mod.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Ult. Uti.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Ensayo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Aprob.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Opcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Formula", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Bloqueo?", "")) ;
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
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV47Select));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavSelect_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavSelect_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSelect_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtCliCod_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtCliCod_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A279CliNom));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtCliNom_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtCliNom_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A494ForSer));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtForSer_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtForSer_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5742ForSerDsc));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtForSerDsc_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtForSerDsc_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13929ForTipArtD));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtForTipArtD_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtForTipArtD_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A482ForColNom));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtForColNom_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtForColNom_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A483ForColNum, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtForColNum_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtForColNum_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtTipColCod_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtTipColCod_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A832TipColDsc));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtTipColDsc_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtTipColDsc_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1191ForNomCli));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtForNomCli_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtForNomCli_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1192ForNumCli, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtForNumCli_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtForNumCli_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A584IntDsc));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtIntDsc_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtIntDsc_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A995ForTonal));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtForTonal_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtForTonal_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A485ForFec, "99/99/99"));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtForFec_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtForFec_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A495ForUltMod, "99/99/99"));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtForUltMod_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtForUltMod_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A496ForUltUti, "99/99/99"));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtForUltUti_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtForUltUti_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3315ForNumArc, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtForNumArc_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtForNumArc_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A3558ForFecApr, "99/99/99"));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtForFecApr_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtForFecApr_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A3560ForOpcCli));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtForOpcCli_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtForOpcCli_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A486ForNumCol, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtForNumCol_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtForNumCol_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A7781ForBlo));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( cmbForBlo.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( cmbForBlo.getColumnHeaderClass()));
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
      cmbavEquiv.setInternalname( "vEQUIV" );
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      bttBtncrearcolor_Internalname = "BTNCREARCOLOR" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      edtavClicod_Internalname = "vCLICOD" ;
      edtavForser_Internalname = "vFORSER" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      edtavSelect_Internalname = "vSELECT" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtCliNom_Internalname = "CLINOM" ;
      edtForSer_Internalname = "FORSER" ;
      edtForSerDsc_Internalname = "FORSERDSC" ;
      edtForTipArtD_Internalname = "FORTIPARTD" ;
      edtForColNom_Internalname = "FORCOLNOM" ;
      edtForColNum_Internalname = "FORCOLNUM" ;
      edtTipColCod_Internalname = "TIPCOLCOD" ;
      edtTipColDsc_Internalname = "TIPCOLDSC" ;
      edtForNomCli_Internalname = "FORNOMCLI" ;
      edtForNumCli_Internalname = "FORNUMCLI" ;
      edtIntDsc_Internalname = "INTDSC" ;
      edtForTonal_Internalname = "FORTONAL" ;
      edtForFec_Internalname = "FORFEC" ;
      edtForUltMod_Internalname = "FORULTMOD" ;
      edtForUltUti_Internalname = "FORULTUTI" ;
      edtForNumArc_Internalname = "FORNUMARC" ;
      edtForFecApr_Internalname = "FORFECAPR" ;
      edtForOpcCli_Internalname = "FOROPCCLI" ;
      edtForNumCol_Internalname = "FORNUMCOL" ;
      cmbForBlo.setInternalname( "FORBLO" );
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Dvelop_confirmpanel_crearcolor_Internalname = "DVELOP_CONFIRMPANEL_CREARCOLOR" ;
      tblTabledvelop_confirmpanel_crearcolor_Internalname = "TABLEDVELOP_CONFIRMPANEL_CREARCOLOR" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      edtavDdo_forfecauxdate_Internalname = "vDDO_FORFECAUXDATE" ;
      divDdo_forfecauxdates_Internalname = "DDO_FORFECAUXDATES" ;
      edtavDdo_forultmodauxdate_Internalname = "vDDO_FORULTMODAUXDATE" ;
      divDdo_forultmodauxdates_Internalname = "DDO_FORULTMODAUXDATES" ;
      edtavDdo_forultutiauxdate_Internalname = "vDDO_FORULTUTIAUXDATE" ;
      divDdo_forultutiauxdates_Internalname = "DDO_FORULTUTIAUXDATES" ;
      edtavDdo_forfecaprauxdate_Internalname = "vDDO_FORFECAPRAUXDATE" ;
      divDdo_forfecaprauxdates_Internalname = "DDO_FORFECAPRAUXDATES" ;
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
      subGrid_Allowhovering = (byte)(0) ;
      subGrid_Allowselection = (byte)(1) ;
      subGrid_Header = "" ;
      cmbForBlo.setJsonclick( "" );
      cmbForBlo.setColumnClass( "WWColumn" );
      edtForNumCol_Jsonclick = "" ;
      edtForNumCol_Columnclass = "WWColumn hidden-xs" ;
      edtForOpcCli_Jsonclick = "" ;
      edtForOpcCli_Columnclass = "WWColumn hidden-xs" ;
      edtForFecApr_Jsonclick = "" ;
      edtForFecApr_Columnclass = "WWColumn hidden-xs" ;
      edtForNumArc_Jsonclick = "" ;
      edtForNumArc_Columnclass = "WWColumn" ;
      edtForUltUti_Jsonclick = "" ;
      edtForUltUti_Columnclass = "WWColumn" ;
      edtForUltMod_Jsonclick = "" ;
      edtForUltMod_Columnclass = "WWColumn" ;
      edtForFec_Jsonclick = "" ;
      edtForFec_Columnclass = "WWColumn hidden-xs" ;
      edtForTonal_Jsonclick = "" ;
      edtForTonal_Columnclass = "WWColumn" ;
      edtIntDsc_Jsonclick = "" ;
      edtIntDsc_Columnclass = "WWColumn" ;
      edtForNumCli_Jsonclick = "" ;
      edtForNumCli_Columnclass = "WWColumn" ;
      edtForNomCli_Jsonclick = "" ;
      edtForNomCli_Columnclass = "WWColumn" ;
      edtTipColDsc_Jsonclick = "" ;
      edtTipColDsc_Columnclass = "WWColumn" ;
      edtTipColCod_Jsonclick = "" ;
      edtTipColCod_Columnclass = "WWColumn" ;
      edtForColNum_Jsonclick = "" ;
      edtForColNum_Columnclass = "WWColumn" ;
      edtForColNom_Jsonclick = "" ;
      edtForColNom_Columnclass = "WWColumn" ;
      edtForTipArtD_Jsonclick = "" ;
      edtForTipArtD_Columnclass = "WWColumn" ;
      edtForSerDsc_Jsonclick = "" ;
      edtForSerDsc_Columnclass = "WWColumn hidden-xs" ;
      edtForSer_Jsonclick = "" ;
      edtForSer_Columnclass = "WWColumn" ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Columnclass = "WWColumn hidden-xs" ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Columnclass = "WWColumn" ;
      edtEmprCod_Jsonclick = "" ;
      edtavSelect_Jsonclick = "" ;
      edtavSelect_Columnclass = "WWIconActionColumn" ;
      edtavSelect_Visible = -1 ;
      edtavSelect_Enabled = 1 ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      cmbForBlo.setColumnHeaderClass( "" );
      edtForNumCol_Columnheaderclass = "" ;
      edtForOpcCli_Columnheaderclass = "" ;
      edtForFecApr_Columnheaderclass = "" ;
      edtForNumArc_Columnheaderclass = "" ;
      edtForUltUti_Columnheaderclass = "" ;
      edtForUltMod_Columnheaderclass = "" ;
      edtForFec_Columnheaderclass = "" ;
      edtForTonal_Columnheaderclass = "" ;
      edtIntDsc_Columnheaderclass = "" ;
      edtForNumCli_Columnheaderclass = "" ;
      edtForNomCli_Columnheaderclass = "" ;
      edtTipColDsc_Columnheaderclass = "" ;
      edtTipColCod_Columnheaderclass = "" ;
      edtForColNum_Columnheaderclass = "" ;
      edtForColNom_Columnheaderclass = "" ;
      edtForTipArtD_Columnheaderclass = "" ;
      edtForSerDsc_Columnheaderclass = "" ;
      edtForSer_Columnheaderclass = "" ;
      edtCliNom_Columnheaderclass = "" ;
      edtCliCod_Columnheaderclass = "" ;
      edtavSelect_Columnheaderclass = "" ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_forfecaprauxdate_Jsonclick = "" ;
      edtavDdo_forultutiauxdate_Jsonclick = "" ;
      edtavDdo_forultmodauxdate_Jsonclick = "" ;
      edtavDdo_forfecauxdate_Jsonclick = "" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      divUnnamedtable2_Height = 0 ;
      edtavForser_Jsonclick = "" ;
      edtavForser_Enabled = 0 ;
      edtavClicod_Jsonclick = "" ;
      edtavClicod_Enabled = 0 ;
      cmbavEquiv.setJsonclick( "" );
      cmbavEquiv.setEnabled( 1 );
      divTablemain_Height = 0 ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Dvelop_confirmpanel_crearcolor_Confirmtype = "1" ;
      Dvelop_confirmpanel_crearcolor_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_crearcolor_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_crearcolor_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_crearcolor_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_crearcolor_Confirmationtext = "¿Desea Crear Color?" ;
      Dvelop_confirmpanel_crearcolor_Title = "" ;
      Ddo_grid_Cleanfilter = "" ;
      Ddo_grid_Datalistproc = "Pedidos.Dis_DisColNom_PromptGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "||||||||||||||||||||N:N,S:S" ;
      Ddo_grid_Allowmultipleselection = "||||||||||||||||||||T" ;
      Ddo_grid_Datalisttype = "||||Dynamic||||Dynamic||||||||||Dynamic||FixedValues" ;
      Ddo_grid_Includedatalist = "||||T||||T||||||||||T||T" ;
      Ddo_grid_Filterisrange = "||||||||||||||||T|||T|" ;
      Ddo_grid_Filtertype = "Numeric|Character|Character|Character|Character|Character|Numeric|Numeric|Character|Character|Numeric|Character|Character|Date|Date|Date|Numeric|Date|Character|Numeric|" ;
      Ddo_grid_Includefilter = "T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|" ;
      Ddo_grid_Includesortasc = "T|T|T|T||T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5||6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21" ;
      Ddo_grid_Columnids = "2:CliCod|3:CliNom|4:ForSer|5:ForSerDsc|6:ForTipArtDsc|7:ForColNom|8:ForColNum|9:TipColCod|10:TipColDsc|11:ForNomCli|12:ForNumCli|13:IntDsc|14:ForTonal|15:ForFec|16:ForUltMod|17:ForUltUti|18:ForNumArc|19:ForFecApr|20:ForOpcCli|21:ForNumCol|22:ForBlo" ;
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
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Crear Color", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Selección de colores", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavEquiv.setName( "vEQUIV" );
      cmbavEquiv.setWebtags( "" );
      cmbavEquiv.addItem("1", httpContext.getMessage( "Equivalente", ""), (short)(0));
      cmbavEquiv.addItem("0", httpContext.getMessage( "Duplicado", ""), (short)(0));
      if ( cmbavEquiv.getItemCount() > 0 )
      {
         AV96Equiv = (byte)(GXutil.lval( cmbavEquiv.getValidValue(GXutil.trim( GXutil.str( AV96Equiv, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV96Equiv", GXutil.str( AV96Equiv, 1, 0));
      }
      GXCCtl = "FORBLO_" + sGXsfl_54_idx ;
      cmbForBlo.setName( GXCCtl );
      cmbForBlo.setWebtags( "" );
      cmbForBlo.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbForBlo.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbForBlo.getItemCount() > 0 )
      {
         A7781ForBlo = cmbForBlo.getValidValue(A7781ForBlo) ;
         n7781ForBlo = false ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV56TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV57TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV23TFForSer',fld:'vTFFORSER',pic:''},{av:'AV58TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV66TFForTipArtDsc',fld:'vTFFORTIPARTDSC',pic:''},{av:'AV67TFForTipArtDsc_Sel',fld:'vTFFORTIPARTDSC_SEL',pic:''},{av:'AV25TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV27TFForColNum',fld:'vTFFORCOLNUM',pic:'ZZZZZ9'},{av:'AV29TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV101TFTipColDsc',fld:'vTFTIPCOLDSC',pic:''},{av:'AV102TFTipColDsc_Sel',fld:'vTFTIPCOLDSC_SEL',pic:''},{av:'AV31TFForNomCli',fld:'vTFFORNOMCLI',pic:''},{av:'AV33TFForNumCli',fld:'vTFFORNUMCLI',pic:'ZZZZZ9'},{av:'AV35TFIntDsc',fld:'vTFINTDSC',pic:''},{av:'AV37TFForTonal',fld:'vTFFORTONAL',pic:''},{av:'AV68TFForFec',fld:'vTFFORFEC',pic:''},{av:'AV72TFForUltMod',fld:'vTFFORULTMOD',pic:''},{av:'AV76TFForUltUti',fld:'vTFFORULTUTI',pic:''},{av:'AV80TFForNumArc',fld:'vTFFORNUMARC',pic:'ZZZZZZZ9'},{av:'AV81TFForNumArc_To',fld:'vTFFORNUMARC_TO',pic:'ZZZZZZZ9'},{av:'AV82TFForFecApr',fld:'vTFFORFECAPR',pic:''},{av:'AV86TFForOpcCli',fld:'vTFFOROPCCLI',pic:'@!'},{av:'AV87TFForOpcCli_Sel',fld:'vTFFOROPCCLI_SEL',pic:'@!'},{av:'AV88TFForNumCol',fld:'vTFFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV89TFForNumCol_To',fld:'vTFFORNUMCOL_TO',pic:'ZZZZZZZ9'},{av:'AV98TFForBlo_Sels',fld:'vTFFORBLO_SELS',pic:''},{av:'AV105Pgmname',fld:'vPGMNAME',pic:''},{av:'AV20OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV21OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A4339ForRGB',fld:'FORRGB',pic:'ZZZZZZZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV45GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV46GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtavSelect_Columnheaderclass',ctrl:'vSELECT',prop:'Columnheaderclass'},{av:'edtCliCod_Columnheaderclass',ctrl:'CLICOD',prop:'Columnheaderclass'},{av:'edtCliNom_Columnheaderclass',ctrl:'CLINOM',prop:'Columnheaderclass'},{av:'edtForSer_Columnheaderclass',ctrl:'FORSER',prop:'Columnheaderclass'},{av:'edtForSerDsc_Columnheaderclass',ctrl:'FORSERDSC',prop:'Columnheaderclass'},{av:'edtForTipArtD_Columnheaderclass',ctrl:'FORTIPARTD',prop:'Columnheaderclass'},{av:'edtForColNom_Columnheaderclass',ctrl:'FORCOLNOM',prop:'Columnheaderclass'},{av:'edtForColNum_Columnheaderclass',ctrl:'FORCOLNUM',prop:'Columnheaderclass'},{av:'edtTipColCod_Columnheaderclass',ctrl:'TIPCOLCOD',prop:'Columnheaderclass'},{av:'edtTipColDsc_Columnheaderclass',ctrl:'TIPCOLDSC',prop:'Columnheaderclass'},{av:'edtForNomCli_Columnheaderclass',ctrl:'FORNOMCLI',prop:'Columnheaderclass'},{av:'edtForNumCli_Columnheaderclass',ctrl:'FORNUMCLI',prop:'Columnheaderclass'},{av:'edtIntDsc_Columnheaderclass',ctrl:'INTDSC',prop:'Columnheaderclass'},{av:'edtForTonal_Columnheaderclass',ctrl:'FORTONAL',prop:'Columnheaderclass'},{av:'edtForFec_Columnheaderclass',ctrl:'FORFEC',prop:'Columnheaderclass'},{av:'edtForUltMod_Columnheaderclass',ctrl:'FORULTMOD',prop:'Columnheaderclass'},{av:'edtForUltUti_Columnheaderclass',ctrl:'FORULTUTI',prop:'Columnheaderclass'},{av:'edtForNumArc_Columnheaderclass',ctrl:'FORNUMARC',prop:'Columnheaderclass'},{av:'edtForFecApr_Columnheaderclass',ctrl:'FORFECAPR',prop:'Columnheaderclass'},{av:'edtForOpcCli_Columnheaderclass',ctrl:'FOROPCCLI',prop:'Columnheaderclass'},{av:'edtForNumCol_Columnheaderclass',ctrl:'FORNUMCOL',prop:'Columnheaderclass'},{av:'cmbForBlo'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e111Y12',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV56TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV57TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV23TFForSer',fld:'vTFFORSER',pic:''},{av:'AV58TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV66TFForTipArtDsc',fld:'vTFFORTIPARTDSC',pic:''},{av:'AV67TFForTipArtDsc_Sel',fld:'vTFFORTIPARTDSC_SEL',pic:''},{av:'AV25TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV27TFForColNum',fld:'vTFFORCOLNUM',pic:'ZZZZZ9'},{av:'AV29TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV101TFTipColDsc',fld:'vTFTIPCOLDSC',pic:''},{av:'AV102TFTipColDsc_Sel',fld:'vTFTIPCOLDSC_SEL',pic:''},{av:'AV31TFForNomCli',fld:'vTFFORNOMCLI',pic:''},{av:'AV33TFForNumCli',fld:'vTFFORNUMCLI',pic:'ZZZZZ9'},{av:'AV35TFIntDsc',fld:'vTFINTDSC',pic:''},{av:'AV37TFForTonal',fld:'vTFFORTONAL',pic:''},{av:'AV68TFForFec',fld:'vTFFORFEC',pic:''},{av:'AV72TFForUltMod',fld:'vTFFORULTMOD',pic:''},{av:'AV76TFForUltUti',fld:'vTFFORULTUTI',pic:''},{av:'AV80TFForNumArc',fld:'vTFFORNUMARC',pic:'ZZZZZZZ9'},{av:'AV81TFForNumArc_To',fld:'vTFFORNUMARC_TO',pic:'ZZZZZZZ9'},{av:'AV82TFForFecApr',fld:'vTFFORFECAPR',pic:''},{av:'AV86TFForOpcCli',fld:'vTFFOROPCCLI',pic:'@!'},{av:'AV87TFForOpcCli_Sel',fld:'vTFFOROPCCLI_SEL',pic:'@!'},{av:'AV88TFForNumCol',fld:'vTFFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV89TFForNumCol_To',fld:'vTFFORNUMCOL_TO',pic:'ZZZZZZZ9'},{av:'AV98TFForBlo_Sels',fld:'vTFFORBLO_SELS',pic:''},{av:'AV105Pgmname',fld:'vPGMNAME',pic:''},{av:'AV20OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV21OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A4339ForRGB',fld:'FORRGB',pic:'ZZZZZZZZZ9',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e121Y12',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV56TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV57TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV23TFForSer',fld:'vTFFORSER',pic:''},{av:'AV58TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV66TFForTipArtDsc',fld:'vTFFORTIPARTDSC',pic:''},{av:'AV67TFForTipArtDsc_Sel',fld:'vTFFORTIPARTDSC_SEL',pic:''},{av:'AV25TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV27TFForColNum',fld:'vTFFORCOLNUM',pic:'ZZZZZ9'},{av:'AV29TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV101TFTipColDsc',fld:'vTFTIPCOLDSC',pic:''},{av:'AV102TFTipColDsc_Sel',fld:'vTFTIPCOLDSC_SEL',pic:''},{av:'AV31TFForNomCli',fld:'vTFFORNOMCLI',pic:''},{av:'AV33TFForNumCli',fld:'vTFFORNUMCLI',pic:'ZZZZZ9'},{av:'AV35TFIntDsc',fld:'vTFINTDSC',pic:''},{av:'AV37TFForTonal',fld:'vTFFORTONAL',pic:''},{av:'AV68TFForFec',fld:'vTFFORFEC',pic:''},{av:'AV72TFForUltMod',fld:'vTFFORULTMOD',pic:''},{av:'AV76TFForUltUti',fld:'vTFFORULTUTI',pic:''},{av:'AV80TFForNumArc',fld:'vTFFORNUMARC',pic:'ZZZZZZZ9'},{av:'AV81TFForNumArc_To',fld:'vTFFORNUMARC_TO',pic:'ZZZZZZZ9'},{av:'AV82TFForFecApr',fld:'vTFFORFECAPR',pic:''},{av:'AV86TFForOpcCli',fld:'vTFFOROPCCLI',pic:'@!'},{av:'AV87TFForOpcCli_Sel',fld:'vTFFOROPCCLI_SEL',pic:'@!'},{av:'AV88TFForNumCol',fld:'vTFFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV89TFForNumCol_To',fld:'vTFFORNUMCOL_TO',pic:'ZZZZZZZ9'},{av:'AV98TFForBlo_Sels',fld:'vTFFORBLO_SELS',pic:''},{av:'AV105Pgmname',fld:'vPGMNAME',pic:''},{av:'AV20OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV21OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A4339ForRGB',fld:'FORRGB',pic:'ZZZZZZZZZ9',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e131Y12',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV56TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV57TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV23TFForSer',fld:'vTFFORSER',pic:''},{av:'AV58TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV66TFForTipArtDsc',fld:'vTFFORTIPARTDSC',pic:''},{av:'AV67TFForTipArtDsc_Sel',fld:'vTFFORTIPARTDSC_SEL',pic:''},{av:'AV25TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV27TFForColNum',fld:'vTFFORCOLNUM',pic:'ZZZZZ9'},{av:'AV29TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV101TFTipColDsc',fld:'vTFTIPCOLDSC',pic:''},{av:'AV102TFTipColDsc_Sel',fld:'vTFTIPCOLDSC_SEL',pic:''},{av:'AV31TFForNomCli',fld:'vTFFORNOMCLI',pic:''},{av:'AV33TFForNumCli',fld:'vTFFORNUMCLI',pic:'ZZZZZ9'},{av:'AV35TFIntDsc',fld:'vTFINTDSC',pic:''},{av:'AV37TFForTonal',fld:'vTFFORTONAL',pic:''},{av:'AV68TFForFec',fld:'vTFFORFEC',pic:''},{av:'AV72TFForUltMod',fld:'vTFFORULTMOD',pic:''},{av:'AV76TFForUltUti',fld:'vTFFORULTUTI',pic:''},{av:'AV80TFForNumArc',fld:'vTFFORNUMARC',pic:'ZZZZZZZ9'},{av:'AV81TFForNumArc_To',fld:'vTFFORNUMARC_TO',pic:'ZZZZZZZ9'},{av:'AV82TFForFecApr',fld:'vTFFORFECAPR',pic:''},{av:'AV86TFForOpcCli',fld:'vTFFOROPCCLI',pic:'@!'},{av:'AV87TFForOpcCli_Sel',fld:'vTFFOROPCCLI_SEL',pic:'@!'},{av:'AV88TFForNumCol',fld:'vTFFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV89TFForNumCol_To',fld:'vTFFORNUMCOL_TO',pic:'ZZZZZZZ9'},{av:'AV98TFForBlo_Sels',fld:'vTFFORBLO_SELS',pic:''},{av:'AV105Pgmname',fld:'vPGMNAME',pic:''},{av:'AV20OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV21OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A4339ForRGB',fld:'FORRGB',pic:'ZZZZZZZZZ9',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV20OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV21OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV97TFForBlo_SelsJson',fld:'vTFFORBLO_SELSJSON',pic:''},{av:'AV98TFForBlo_Sels',fld:'vTFFORBLO_SELS',pic:''},{av:'AV88TFForNumCol',fld:'vTFFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV89TFForNumCol_To',fld:'vTFFORNUMCOL_TO',pic:'ZZZZZZZ9'},{av:'AV86TFForOpcCli',fld:'vTFFOROPCCLI',pic:'@!'},{av:'AV87TFForOpcCli_Sel',fld:'vTFFOROPCCLI_SEL',pic:'@!'},{av:'AV82TFForFecApr',fld:'vTFFORFECAPR',pic:''},{av:'AV80TFForNumArc',fld:'vTFFORNUMARC',pic:'ZZZZZZZ9'},{av:'AV81TFForNumArc_To',fld:'vTFFORNUMARC_TO',pic:'ZZZZZZZ9'},{av:'AV76TFForUltUti',fld:'vTFFORULTUTI',pic:''},{av:'AV72TFForUltMod',fld:'vTFFORULTMOD',pic:''},{av:'AV68TFForFec',fld:'vTFFORFEC',pic:''},{av:'AV37TFForTonal',fld:'vTFFORTONAL',pic:''},{av:'AV35TFIntDsc',fld:'vTFINTDSC',pic:''},{av:'AV33TFForNumCli',fld:'vTFFORNUMCLI',pic:'ZZZZZ9'},{av:'AV31TFForNomCli',fld:'vTFFORNOMCLI',pic:''},{av:'AV101TFTipColDsc',fld:'vTFTIPCOLDSC',pic:''},{av:'AV102TFTipColDsc_Sel',fld:'vTFTIPCOLDSC_SEL',pic:''},{av:'AV29TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV27TFForColNum',fld:'vTFFORCOLNUM',pic:'ZZZZZ9'},{av:'AV25TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV66TFForTipArtDsc',fld:'vTFFORTIPARTDSC',pic:''},{av:'AV67TFForTipArtDsc_Sel',fld:'vTFFORTIPARTDSC_SEL',pic:''},{av:'AV58TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV23TFForSer',fld:'vTFFORSER',pic:''},{av:'AV57TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV56TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e181Y12',iparms:[{av:'cmbForBlo'},{av:'A7781ForBlo',fld:'FORBLO',pic:'@!',hsh:true}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV47Select',fld:'vSELECT',pic:''},{av:'edtavSelect_Columnclass',ctrl:'vSELECT',prop:'Columnclass'},{av:'edtCliCod_Columnclass',ctrl:'CLICOD',prop:'Columnclass'},{av:'edtCliNom_Columnclass',ctrl:'CLINOM',prop:'Columnclass'},{av:'edtForSer_Columnclass',ctrl:'FORSER',prop:'Columnclass'},{av:'edtForSerDsc_Columnclass',ctrl:'FORSERDSC',prop:'Columnclass'},{av:'edtForTipArtD_Columnclass',ctrl:'FORTIPARTD',prop:'Columnclass'},{av:'edtForColNom_Columnclass',ctrl:'FORCOLNOM',prop:'Columnclass'},{av:'edtForColNum_Columnclass',ctrl:'FORCOLNUM',prop:'Columnclass'},{av:'edtTipColCod_Columnclass',ctrl:'TIPCOLCOD',prop:'Columnclass'},{av:'edtTipColDsc_Columnclass',ctrl:'TIPCOLDSC',prop:'Columnclass'},{av:'edtForNomCli_Columnclass',ctrl:'FORNOMCLI',prop:'Columnclass'},{av:'edtForNumCli_Columnclass',ctrl:'FORNUMCLI',prop:'Columnclass'},{av:'edtIntDsc_Columnclass',ctrl:'INTDSC',prop:'Columnclass'},{av:'edtForTonal_Columnclass',ctrl:'FORTONAL',prop:'Columnclass'},{av:'edtForFec_Columnclass',ctrl:'FORFEC',prop:'Columnclass'},{av:'edtForUltMod_Columnclass',ctrl:'FORULTMOD',prop:'Columnclass'},{av:'edtForUltUti_Columnclass',ctrl:'FORULTUTI',prop:'Columnclass'},{av:'edtForNumArc_Columnclass',ctrl:'FORNUMARC',prop:'Columnclass'},{av:'edtForFecApr_Columnclass',ctrl:'FORFECAPR',prop:'Columnclass'},{av:'edtForOpcCli_Columnclass',ctrl:'FOROPCCLI',prop:'Columnclass'},{av:'edtForNumCol_Columnclass',ctrl:'FORNUMCOL',prop:'Columnclass'},{av:'cmbForBlo'}]}");
      setEventMetadata("'DOCREARCOLOR'","{handler:'e151Y12',iparms:[{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'AV5CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV6ForSer',fld:'vFORSER',pic:''},{av:'cmbavEquiv'},{av:'AV96Equiv',fld:'vEQUIV',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'cmbForBlo'},{av:'A7781ForBlo',fld:'FORBLO',pic:'@!',hsh:true}]");
      setEventMetadata("'DOCREARCOLOR'",",oparms:[{av:'Dvelop_confirmpanel_crearcolor_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_CREARCOLOR',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_CREARCOLOR.CLOSE","{handler:'e141Y12',iparms:[{av:'Dvelop_confirmpanel_crearcolor_Result',ctrl:'DVELOP_CONFIRMPANEL_CREARCOLOR',prop:'Result'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'AV5CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV6ForSer',fld:'vFORSER',pic:''},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A1191ForNomCli',fld:'FORNOMCLI',pic:''},{av:'A1192ForNumCli',fld:'FORNUMCLI',pic:'ZZZZZ9'},{av:'cmbavEquiv'},{av:'AV96Equiv',fld:'vEQUIV',pic:'9'},{av:'A4339ForRGB',fld:'FORRGB',pic:'ZZZZZZZZZ9',hsh:true},{av:'A995ForTonal',fld:'FORTONAL',pic:'',hsh:true},{av:'cmbForBlo'},{av:'A7781ForBlo',fld:'FORBLO',pic:'@!',hsh:true},{av:'AV100TipColDsc',fld:'vTIPCOLDSC',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_CREARCOLOR.CLOSE",",oparms:[{av:'cmbavEquiv'},{av:'AV96Equiv',fld:'vEQUIV',pic:'9'},{av:'A1192ForNumCli',fld:'FORNUMCLI',pic:'ZZZZZ9'},{av:'A1191ForNomCli',fld:'FORNOMCLI',pic:''},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'AV6ForSer',fld:'vFORSER',pic:''},{av:'AV5CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV49ForColNom',fld:'vFORCOLNOM',pic:''},{av:'AV50ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV51TipColCod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV52ForNomCli',fld:'vFORNOMCLI',pic:''},{av:'AV53ForNumCli',fld:'vFORNUMCLI',pic:'ZZZZZ9'},{av:'AV65Fortonal',fld:'vFORTONAL',pic:''},{av:'AV91forblo',fld:'vFORBLO',pic:'@!'}]}");
      setEventMetadata("ENTER","{handler:'e191Y12',iparms:[{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A1191ForNomCli',fld:'FORNOMCLI',pic:''},{av:'A1192ForNumCli',fld:'FORNUMCLI',pic:'ZZZZZ9'},{av:'A4339ForRGB',fld:'FORRGB',pic:'ZZZZZZZZZ9',hsh:true},{av:'A995ForTonal',fld:'FORTONAL',pic:'',hsh:true},{av:'cmbForBlo'},{av:'A7781ForBlo',fld:'FORBLO',pic:'@!',hsh:true},{av:'A832TipColDsc',fld:'TIPCOLDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV5CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV6ForSer',fld:'vFORSER',pic:''}]");
      setEventMetadata("ENTER",",oparms:[{av:'AV49ForColNom',fld:'vFORCOLNOM',pic:''},{av:'AV50ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV51TipColCod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV52ForNomCli',fld:'vFORNOMCLI',pic:''},{av:'AV53ForNumCli',fld:'vFORNUMCLI',pic:'ZZZZZ9'},{av:'AV65Fortonal',fld:'vFORTONAL',pic:''},{av:'AV91forblo',fld:'vFORBLO',pic:'@!'},{av:'AV100TipColDsc',fld:'vTIPCOLDSC',pic:''}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_TIPCOLCOD","{handler:'valid_Tipcolcod',iparms:[]");
      setEventMetadata("VALID_TIPCOLCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Forblo',iparms:[]");
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
      wcpOAV7EmprCod = "" ;
      wcpOAV6ForSer = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Dvelop_confirmpanel_crearcolor_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV7EmprCod = "" ;
      AV6ForSer = "" ;
      AV49ForColNom = "" ;
      AV52ForNomCli = "" ;
      AV65Fortonal = "" ;
      AV91forblo = "" ;
      AV100TipColDsc = "" ;
      AV57TFCliNom = "" ;
      AV23TFForSer = "" ;
      AV58TFForSerDsc = "" ;
      AV66TFForTipArtDsc = "" ;
      AV67TFForTipArtDsc_Sel = "" ;
      AV25TFForColNom = "" ;
      AV101TFTipColDsc = "" ;
      AV102TFTipColDsc_Sel = "" ;
      AV31TFForNomCli = "" ;
      AV35TFIntDsc = "" ;
      AV37TFForTonal = "" ;
      AV68TFForFec = GXutil.nullDate() ;
      AV72TFForUltMod = GXutil.nullDate() ;
      AV76TFForUltUti = GXutil.nullDate() ;
      AV82TFForFecApr = GXutil.nullDate() ;
      AV86TFForOpcCli = "" ;
      AV87TFForOpcCli_Sel = "" ;
      AV98TFForBlo_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV105Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV43DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtncrearcolor_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV70DDO_ForFecAuxDate = GXutil.nullDate() ;
      AV74DDO_ForUltModAuxDate = GXutil.nullDate() ;
      AV78DDO_ForUltUtiAuxDate = GXutil.nullDate() ;
      AV84DDO_ForFecAprAuxDate = GXutil.nullDate() ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV47Select = "" ;
      A396EmprCod = "" ;
      A279CliNom = "" ;
      A494ForSer = "" ;
      A5742ForSerDsc = "" ;
      A13929ForTipArtD = "" ;
      A482ForColNom = "" ;
      A832TipColDsc = "" ;
      A1191ForNomCli = "" ;
      A584IntDsc = "" ;
      A995ForTonal = "" ;
      A485ForFec = GXutil.nullDate() ;
      A495ForUltMod = GXutil.nullDate() ;
      A496ForUltUti = GXutil.nullDate() ;
      A3558ForFecApr = GXutil.nullDate() ;
      A3560ForOpcCli = "" ;
      A7781ForBlo = "" ;
      AV131Pedidos_dis_discolnom_promptds_26_tfforblo_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV110Pedidos_dis_discolnom_promptds_5_tffortipartdsc = "" ;
      lV107Pedidos_dis_discolnom_promptds_2_tfclinom = "" ;
      lV108Pedidos_dis_discolnom_promptds_3_tfforser = "" ;
      lV109Pedidos_dis_discolnom_promptds_4_tfforserdsc = "" ;
      lV112Pedidos_dis_discolnom_promptds_7_tfforcolnom = "" ;
      lV115Pedidos_dis_discolnom_promptds_10_tftipcoldsc = "" ;
      lV117Pedidos_dis_discolnom_promptds_12_tffornomcli = "" ;
      lV120Pedidos_dis_discolnom_promptds_15_tffortonal = "" ;
      lV127Pedidos_dis_discolnom_promptds_22_tfforopccli = "" ;
      AV107Pedidos_dis_discolnom_promptds_2_tfclinom = "" ;
      AV108Pedidos_dis_discolnom_promptds_3_tfforser = "" ;
      AV109Pedidos_dis_discolnom_promptds_4_tfforserdsc = "" ;
      AV112Pedidos_dis_discolnom_promptds_7_tfforcolnom = "" ;
      AV116Pedidos_dis_discolnom_promptds_11_tftipcoldsc_sel = "" ;
      AV115Pedidos_dis_discolnom_promptds_10_tftipcoldsc = "" ;
      AV117Pedidos_dis_discolnom_promptds_12_tffornomcli = "" ;
      AV120Pedidos_dis_discolnom_promptds_15_tffortonal = "" ;
      AV121Pedidos_dis_discolnom_promptds_16_tfforfec = GXutil.nullDate() ;
      AV122Pedidos_dis_discolnom_promptds_17_tfforultmod = GXutil.nullDate() ;
      AV123Pedidos_dis_discolnom_promptds_18_tfforultuti = GXutil.nullDate() ;
      AV126Pedidos_dis_discolnom_promptds_21_tfforfecapr = GXutil.nullDate() ;
      AV128Pedidos_dis_discolnom_promptds_23_tfforopccli_sel = "" ;
      AV127Pedidos_dis_discolnom_promptds_22_tfforopccli = "" ;
      AV111Pedidos_dis_discolnom_promptds_6_tffortipartdsc_sel = "" ;
      AV110Pedidos_dis_discolnom_promptds_5_tffortipartdsc = "" ;
      A10045CliAct = "" ;
      H01Y12_A829TipArtCod = new short[1] ;
      H01Y12_A583IntCod = new byte[1] ;
      H01Y12_A4384ForTipArt = new short[1] ;
      H01Y12_n4384ForTipArt = new boolean[] {false} ;
      H01Y12_A10045CliAct = new String[] {""} ;
      H01Y12_A4339ForRGB = new long[1] ;
      H01Y12_n4339ForRGB = new boolean[] {false} ;
      H01Y12_A7781ForBlo = new String[] {""} ;
      H01Y12_n7781ForBlo = new boolean[] {false} ;
      H01Y12_A486ForNumCol = new int[1] ;
      H01Y12_A3560ForOpcCli = new String[] {""} ;
      H01Y12_n3560ForOpcCli = new boolean[] {false} ;
      H01Y12_A3558ForFecApr = new java.util.Date[] {GXutil.nullDate()} ;
      H01Y12_n3558ForFecApr = new boolean[] {false} ;
      H01Y12_A3315ForNumArc = new int[1] ;
      H01Y12_n3315ForNumArc = new boolean[] {false} ;
      H01Y12_A496ForUltUti = new java.util.Date[] {GXutil.nullDate()} ;
      H01Y12_n496ForUltUti = new boolean[] {false} ;
      H01Y12_A495ForUltMod = new java.util.Date[] {GXutil.nullDate()} ;
      H01Y12_n495ForUltMod = new boolean[] {false} ;
      H01Y12_A485ForFec = new java.util.Date[] {GXutil.nullDate()} ;
      H01Y12_n485ForFec = new boolean[] {false} ;
      H01Y12_A995ForTonal = new String[] {""} ;
      H01Y12_n995ForTonal = new boolean[] {false} ;
      H01Y12_A584IntDsc = new String[] {""} ;
      H01Y12_n584IntDsc = new boolean[] {false} ;
      H01Y12_A1192ForNumCli = new int[1] ;
      H01Y12_n1192ForNumCli = new boolean[] {false} ;
      H01Y12_A1191ForNomCli = new String[] {""} ;
      H01Y12_n1191ForNomCli = new boolean[] {false} ;
      H01Y12_A832TipColDsc = new String[] {""} ;
      H01Y12_n832TipColDsc = new boolean[] {false} ;
      H01Y12_A831TipColCod = new byte[1] ;
      H01Y12_A483ForColNum = new int[1] ;
      H01Y12_A482ForColNom = new String[] {""} ;
      H01Y12_A5742ForSerDsc = new String[] {""} ;
      H01Y12_n5742ForSerDsc = new boolean[] {false} ;
      H01Y12_A494ForSer = new String[] {""} ;
      H01Y12_A279CliNom = new String[] {""} ;
      H01Y12_A252CliCod = new int[1] ;
      H01Y12_A396EmprCod = new String[] {""} ;
      H01Y12_A13929ForTipArtD = new String[] {""} ;
      H01Y12_n13929ForTipArtD = new boolean[] {false} ;
      AV119Pedidos_dis_discolnom_promptds_14_tfintdsc = "" ;
      H01Y13_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV93Station = "" ;
      AV94EmprNom = "" ;
      AV95UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV61Session = httpContext.getWebSession();
      AV63ManageFiltersXml = "" ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV97TFForBlo_SelsJson = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      ucDvelop_confirmpanel_crearcolor = new com.genexus.webpanels.GXUserControl();
      GXv_int9 = new int[1] ;
      GXv_int10 = new int[1] ;
      GXv_int8 = new byte[1] ;
      GXv_int11 = new int[1] ;
      GXv_int14 = new int[1] ;
      GXv_int15 = new byte[1] ;
      GXv_int17 = new int[1] ;
      AV18GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV19GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char21 = "" ;
      GXv_char16 = new String[1] ;
      GXt_char20 = "" ;
      GXv_char13 = new String[1] ;
      GXt_char19 = "" ;
      GXv_char12 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char22 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char23 = "" ;
      GXv_char2 = new String[1] ;
      GXt_char24 = "" ;
      GXv_char25 = new String[1] ;
      GXt_char26 = "" ;
      GXv_char27 = new String[1] ;
      GXt_char28 = "" ;
      GXv_char29 = new String[1] ;
      GXt_char30 = "" ;
      GXv_char31 = new String[1] ;
      GXv_SdtWWPGridState32 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV59TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV17HTTPRequest = httpContext.getHttpRequest();
      GXv_int18 = new byte[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GXCCtl = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidos.dis_discolnom_prompt__default(),
         new Object[] {
             new Object[] {
            H01Y12_A829TipArtCod, H01Y12_A583IntCod, H01Y12_A4384ForTipArt, H01Y12_n4384ForTipArt, H01Y12_A10045CliAct, H01Y12_A4339ForRGB, H01Y12_n4339ForRGB, H01Y12_A7781ForBlo, H01Y12_n7781ForBlo, H01Y12_A486ForNumCol,
            H01Y12_A3560ForOpcCli, H01Y12_n3560ForOpcCli, H01Y12_A3558ForFecApr, H01Y12_n3558ForFecApr, H01Y12_A3315ForNumArc, H01Y12_n3315ForNumArc, H01Y12_A496ForUltUti, H01Y12_n496ForUltUti, H01Y12_A495ForUltMod, H01Y12_n495ForUltMod,
            H01Y12_A485ForFec, H01Y12_n485ForFec, H01Y12_A995ForTonal, H01Y12_n995ForTonal, H01Y12_A584IntDsc, H01Y12_n584IntDsc, H01Y12_A1192ForNumCli, H01Y12_n1192ForNumCli, H01Y12_A1191ForNomCli, H01Y12_n1191ForNomCli,
            H01Y12_A832TipColDsc, H01Y12_n832TipColDsc, H01Y12_A831TipColCod, H01Y12_A483ForColNum, H01Y12_A482ForColNom, H01Y12_A5742ForSerDsc, H01Y12_n5742ForSerDsc, H01Y12_A494ForSer, H01Y12_A279CliNom, H01Y12_A252CliCod,
            H01Y12_A396EmprCod, H01Y12_A13929ForTipArtD, H01Y12_n13929ForTipArtD
            }
            , new Object[] {
            H01Y13_AGRID_nRecordCount
            }
         }
      );
      AV105Pgmname = "Pedidos.Dis_DisColNom_Prompt" ;
      /* GeneXus formulas. */
      AV105Pgmname = "Pedidos.Dis_DisColNom_Prompt" ;
      Gx_err = (short)(0) ;
      edtavClicod_Enabled = 0 ;
      edtavForser_Enabled = 0 ;
      edtavSelect_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV51TipColCod ;
   private byte AV29TFTipColCod ;
   private byte gxajaxcallmode ;
   private byte AV96Equiv ;
   private byte A831TipColCod ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV114Pedidos_dis_discolnom_promptds_9_tftipcolcod ;
   private byte A583IntCod ;
   private byte AV99Flag ;
   private byte GXv_int8[] ;
   private byte GXv_int15[] ;
   private byte GXv_int18[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV20OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short A4384ForTipArt ;
   private int wcpOAV5CliCod ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_54 ;
   private int AV5CliCod ;
   private int AV50ForColNum ;
   private int AV53ForNumCli ;
   private int nGXsfl_54_idx=1 ;
   private int AV56TFCliCod ;
   private int AV27TFForColNum ;
   private int AV33TFForNumCli ;
   private int AV80TFForNumArc ;
   private int AV81TFForNumArc_To ;
   private int AV88TFForNumCol ;
   private int AV89TFForNumCol_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int divTablemain_Height ;
   private int edtavClicod_Enabled ;
   private int edtavForser_Enabled ;
   private int divUnnamedtable2_Height ;
   private int edtavPgmname_Enabled ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int A1192ForNumCli ;
   private int A3315ForNumArc ;
   private int A486ForNumCol ;
   private int subGrid_Islastpage ;
   private int edtavSelect_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV131Pedidos_dis_discolnom_promptds_26_tfforblo_sels_size ;
   private int AV106Pedidos_dis_discolnom_promptds_1_tfclicod ;
   private int AV113Pedidos_dis_discolnom_promptds_8_tfforcolnum ;
   private int AV118Pedidos_dis_discolnom_promptds_13_tffornumcli ;
   private int AV124Pedidos_dis_discolnom_promptds_19_tffornumarc ;
   private int AV125Pedidos_dis_discolnom_promptds_20_tffornumarc_to ;
   private int AV129Pedidos_dis_discolnom_promptds_24_tffornumcol ;
   private int AV130Pedidos_dis_discolnom_promptds_25_tffornumcol_to ;
   private int AV44PageToGo ;
   private int GXv_int9[] ;
   private int GXv_int10[] ;
   private int GXv_int11[] ;
   private int GXv_int14[] ;
   private int GXv_int17[] ;
   private int AV132GXV1 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavSelect_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long A4339ForRGB ;
   private long AV45GridCurrentPage ;
   private long AV46GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private long AV54ForRGB ;
   private String wcpOAV7EmprCod ;
   private String wcpOAV6ForSer ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Dvelop_confirmpanel_crearcolor_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV7EmprCod ;
   private String AV6ForSer ;
   private String AV49ForColNom ;
   private String AV52ForNomCli ;
   private String AV65Fortonal ;
   private String AV91forblo ;
   private String AV100TipColDsc ;
   private String sGXsfl_54_idx="0001" ;
   private String AV57TFCliNom ;
   private String AV23TFForSer ;
   private String AV58TFForSerDsc ;
   private String AV66TFForTipArtDsc ;
   private String AV67TFForTipArtDsc_Sel ;
   private String AV25TFForColNom ;
   private String AV101TFTipColDsc ;
   private String AV102TFTipColDsc_Sel ;
   private String AV31TFForNomCli ;
   private String AV35TFIntDsc ;
   private String AV37TFForTonal ;
   private String AV86TFForOpcCli ;
   private String AV87TFForOpcCli_Sel ;
   private String AV105Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
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
   private String Ddo_grid_Allowmultipleselection ;
   private String Ddo_grid_Datalistfixedvalues ;
   private String Ddo_grid_Datalistproc ;
   private String Ddo_grid_Cleanfilter ;
   private String Dvelop_confirmpanel_crearcolor_Title ;
   private String Dvelop_confirmpanel_crearcolor_Confirmationtext ;
   private String Dvelop_confirmpanel_crearcolor_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_crearcolor_Nobuttoncaption ;
   private String Dvelop_confirmpanel_crearcolor_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_crearcolor_Yesbuttonposition ;
   private String Dvelop_confirmpanel_crearcolor_Confirmtype ;
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String TempTags ;
   private String divUnnamedtable4_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtncrearcolor_Internalname ;
   private String bttBtncrearcolor_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
   private String edtavClicod_Internalname ;
   private String edtavClicod_Jsonclick ;
   private String edtavForser_Internalname ;
   private String edtavForser_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_forfecauxdates_Internalname ;
   private String edtavDdo_forfecauxdate_Internalname ;
   private String edtavDdo_forfecauxdate_Jsonclick ;
   private String divDdo_forultmodauxdates_Internalname ;
   private String edtavDdo_forultmodauxdate_Internalname ;
   private String edtavDdo_forultmodauxdate_Jsonclick ;
   private String divDdo_forultutiauxdates_Internalname ;
   private String edtavDdo_forultutiauxdate_Internalname ;
   private String edtavDdo_forultutiauxdate_Jsonclick ;
   private String divDdo_forfecaprauxdates_Internalname ;
   private String edtavDdo_forfecaprauxdate_Internalname ;
   private String edtavDdo_forfecaprauxdate_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV47Select ;
   private String edtavSelect_Internalname ;
   private String A396EmprCod ;
   private String edtEmprCod_Internalname ;
   private String edtCliCod_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Internalname ;
   private String A494ForSer ;
   private String edtForSer_Internalname ;
   private String A5742ForSerDsc ;
   private String edtForSerDsc_Internalname ;
   private String A13929ForTipArtD ;
   private String edtForTipArtD_Internalname ;
   private String A482ForColNom ;
   private String edtForColNom_Internalname ;
   private String edtForColNum_Internalname ;
   private String edtTipColCod_Internalname ;
   private String A832TipColDsc ;
   private String edtTipColDsc_Internalname ;
   private String A1191ForNomCli ;
   private String edtForNomCli_Internalname ;
   private String edtForNumCli_Internalname ;
   private String A584IntDsc ;
   private String edtIntDsc_Internalname ;
   private String A995ForTonal ;
   private String edtForTonal_Internalname ;
   private String edtForFec_Internalname ;
   private String edtForUltMod_Internalname ;
   private String edtForUltUti_Internalname ;
   private String edtForNumArc_Internalname ;
   private String edtForFecApr_Internalname ;
   private String A3560ForOpcCli ;
   private String edtForOpcCli_Internalname ;
   private String edtForNumCol_Internalname ;
   private String A7781ForBlo ;
   private String scmdbuf ;
   private String lV110Pedidos_dis_discolnom_promptds_5_tffortipartdsc ;
   private String lV107Pedidos_dis_discolnom_promptds_2_tfclinom ;
   private String lV108Pedidos_dis_discolnom_promptds_3_tfforser ;
   private String lV109Pedidos_dis_discolnom_promptds_4_tfforserdsc ;
   private String lV112Pedidos_dis_discolnom_promptds_7_tfforcolnom ;
   private String lV115Pedidos_dis_discolnom_promptds_10_tftipcoldsc ;
   private String lV117Pedidos_dis_discolnom_promptds_12_tffornomcli ;
   private String lV120Pedidos_dis_discolnom_promptds_15_tffortonal ;
   private String lV127Pedidos_dis_discolnom_promptds_22_tfforopccli ;
   private String AV107Pedidos_dis_discolnom_promptds_2_tfclinom ;
   private String AV108Pedidos_dis_discolnom_promptds_3_tfforser ;
   private String AV109Pedidos_dis_discolnom_promptds_4_tfforserdsc ;
   private String AV112Pedidos_dis_discolnom_promptds_7_tfforcolnom ;
   private String AV116Pedidos_dis_discolnom_promptds_11_tftipcoldsc_sel ;
   private String AV115Pedidos_dis_discolnom_promptds_10_tftipcoldsc ;
   private String AV117Pedidos_dis_discolnom_promptds_12_tffornomcli ;
   private String AV120Pedidos_dis_discolnom_promptds_15_tffortonal ;
   private String AV128Pedidos_dis_discolnom_promptds_23_tfforopccli_sel ;
   private String AV127Pedidos_dis_discolnom_promptds_22_tfforopccli ;
   private String AV111Pedidos_dis_discolnom_promptds_6_tffortipartdsc_sel ;
   private String AV110Pedidos_dis_discolnom_promptds_5_tffortipartdsc ;
   private String A10045CliAct ;
   private String AV119Pedidos_dis_discolnom_promptds_14_tfintdsc ;
   private String hsh ;
   private String AV93Station ;
   private String AV94EmprNom ;
   private String AV95UsurCod ;
   private String edtavSelect_Columnheaderclass ;
   private String edtCliCod_Columnheaderclass ;
   private String edtCliNom_Columnheaderclass ;
   private String edtForSer_Columnheaderclass ;
   private String edtForSerDsc_Columnheaderclass ;
   private String edtForTipArtD_Columnheaderclass ;
   private String edtForColNom_Columnheaderclass ;
   private String edtForColNum_Columnheaderclass ;
   private String edtTipColCod_Columnheaderclass ;
   private String edtTipColDsc_Columnheaderclass ;
   private String edtForNomCli_Columnheaderclass ;
   private String edtForNumCli_Columnheaderclass ;
   private String edtIntDsc_Columnheaderclass ;
   private String edtForTonal_Columnheaderclass ;
   private String edtForFec_Columnheaderclass ;
   private String edtForUltMod_Columnheaderclass ;
   private String edtForUltUti_Columnheaderclass ;
   private String edtForNumArc_Columnheaderclass ;
   private String edtForFecApr_Columnheaderclass ;
   private String edtForOpcCli_Columnheaderclass ;
   private String edtForNumCol_Columnheaderclass ;
   private String edtavSelect_Columnclass ;
   private String edtCliCod_Columnclass ;
   private String edtCliNom_Columnclass ;
   private String edtForSer_Columnclass ;
   private String edtForSerDsc_Columnclass ;
   private String edtForTipArtD_Columnclass ;
   private String edtForColNom_Columnclass ;
   private String edtForColNum_Columnclass ;
   private String edtTipColCod_Columnclass ;
   private String edtTipColDsc_Columnclass ;
   private String edtForNomCli_Columnclass ;
   private String edtForNumCli_Columnclass ;
   private String edtIntDsc_Columnclass ;
   private String edtForTonal_Columnclass ;
   private String edtForFec_Columnclass ;
   private String edtForUltMod_Columnclass ;
   private String edtForUltUti_Columnclass ;
   private String edtForNumArc_Columnclass ;
   private String edtForFecApr_Columnclass ;
   private String edtForOpcCli_Columnclass ;
   private String edtForNumCol_Columnclass ;
   private String Dvelop_confirmpanel_crearcolor_Internalname ;
   private String GXt_char21 ;
   private String GXv_char16[] ;
   private String GXt_char20 ;
   private String GXv_char13[] ;
   private String GXt_char19 ;
   private String GXv_char12[] ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXt_char22 ;
   private String GXv_char3[] ;
   private String GXt_char23 ;
   private String GXv_char2[] ;
   private String GXt_char24 ;
   private String GXv_char25[] ;
   private String GXt_char26 ;
   private String GXv_char27[] ;
   private String GXt_char28 ;
   private String GXv_char29[] ;
   private String GXt_char30 ;
   private String GXv_char31[] ;
   private String tblTabledvelop_confirmpanel_crearcolor_Internalname ;
   private String tblTablerightheader_Internalname ;
   private String sGXsfl_54_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavSelect_Jsonclick ;
   private String edtEmprCod_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtForSer_Jsonclick ;
   private String edtForSerDsc_Jsonclick ;
   private String edtForTipArtD_Jsonclick ;
   private String edtForColNom_Jsonclick ;
   private String edtForColNum_Jsonclick ;
   private String edtTipColCod_Jsonclick ;
   private String edtTipColDsc_Jsonclick ;
   private String edtForNomCli_Jsonclick ;
   private String edtForNumCli_Jsonclick ;
   private String edtIntDsc_Jsonclick ;
   private String edtForTonal_Jsonclick ;
   private String edtForFec_Jsonclick ;
   private String edtForUltMod_Jsonclick ;
   private String edtForUltUti_Jsonclick ;
   private String edtForNumArc_Jsonclick ;
   private String edtForFecApr_Jsonclick ;
   private String edtForOpcCli_Jsonclick ;
   private String edtForNumCol_Jsonclick ;
   private String GXCCtl ;
   private String subGrid_Header ;
   private java.util.Date AV68TFForFec ;
   private java.util.Date AV72TFForUltMod ;
   private java.util.Date AV76TFForUltUti ;
   private java.util.Date AV82TFForFecApr ;
   private java.util.Date AV70DDO_ForFecAuxDate ;
   private java.util.Date AV74DDO_ForUltModAuxDate ;
   private java.util.Date AV78DDO_ForUltUtiAuxDate ;
   private java.util.Date AV84DDO_ForFecAprAuxDate ;
   private java.util.Date A485ForFec ;
   private java.util.Date A495ForUltMod ;
   private java.util.Date A496ForUltUti ;
   private java.util.Date A3558ForFecApr ;
   private java.util.Date AV121Pedidos_dis_discolnom_promptds_16_tfforfec ;
   private java.util.Date AV122Pedidos_dis_discolnom_promptds_17_tfforultmod ;
   private java.util.Date AV123Pedidos_dis_discolnom_promptds_18_tfforultuti ;
   private java.util.Date AV126Pedidos_dis_discolnom_promptds_21_tfforfecapr ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV21OrderedDsc ;
   private boolean n4339ForRGB ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
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
   private boolean n13929ForTipArtD ;
   private boolean n832TipColDsc ;
   private boolean n1191ForNomCli ;
   private boolean n1192ForNumCli ;
   private boolean n584IntDsc ;
   private boolean n995ForTonal ;
   private boolean n485ForFec ;
   private boolean n495ForUltMod ;
   private boolean n496ForUltUti ;
   private boolean n3315ForNumArc ;
   private boolean n3558ForFecApr ;
   private boolean n3560ForOpcCli ;
   private boolean n7781ForBlo ;
   private boolean bGXsfl_54_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n4384ForTipArt ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV63ManageFiltersXml ;
   private String AV97TFForBlo_SelsJson ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV17HTTPRequest ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_crearcolor ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private GXSimpleCollection<String> AV131Pedidos_dis_discolnom_promptds_26_tfforblo_sels ;
   private HTMLChoice cmbavEquiv ;
   private HTMLChoice cmbForBlo ;
   private IDataStoreProvider pr_default ;
   private short[] H01Y12_A829TipArtCod ;
   private byte[] H01Y12_A583IntCod ;
   private short[] H01Y12_A4384ForTipArt ;
   private boolean[] H01Y12_n4384ForTipArt ;
   private String[] H01Y12_A10045CliAct ;
   private long[] H01Y12_A4339ForRGB ;
   private boolean[] H01Y12_n4339ForRGB ;
   private String[] H01Y12_A7781ForBlo ;
   private boolean[] H01Y12_n7781ForBlo ;
   private int[] H01Y12_A486ForNumCol ;
   private String[] H01Y12_A3560ForOpcCli ;
   private boolean[] H01Y12_n3560ForOpcCli ;
   private java.util.Date[] H01Y12_A3558ForFecApr ;
   private boolean[] H01Y12_n3558ForFecApr ;
   private int[] H01Y12_A3315ForNumArc ;
   private boolean[] H01Y12_n3315ForNumArc ;
   private java.util.Date[] H01Y12_A496ForUltUti ;
   private boolean[] H01Y12_n496ForUltUti ;
   private java.util.Date[] H01Y12_A495ForUltMod ;
   private boolean[] H01Y12_n495ForUltMod ;
   private java.util.Date[] H01Y12_A485ForFec ;
   private boolean[] H01Y12_n485ForFec ;
   private String[] H01Y12_A995ForTonal ;
   private boolean[] H01Y12_n995ForTonal ;
   private String[] H01Y12_A584IntDsc ;
   private boolean[] H01Y12_n584IntDsc ;
   private int[] H01Y12_A1192ForNumCli ;
   private boolean[] H01Y12_n1192ForNumCli ;
   private String[] H01Y12_A1191ForNomCli ;
   private boolean[] H01Y12_n1191ForNomCli ;
   private String[] H01Y12_A832TipColDsc ;
   private boolean[] H01Y12_n832TipColDsc ;
   private byte[] H01Y12_A831TipColCod ;
   private int[] H01Y12_A483ForColNum ;
   private String[] H01Y12_A482ForColNom ;
   private String[] H01Y12_A5742ForSerDsc ;
   private boolean[] H01Y12_n5742ForSerDsc ;
   private String[] H01Y12_A494ForSer ;
   private String[] H01Y12_A279CliNom ;
   private int[] H01Y12_A252CliCod ;
   private String[] H01Y12_A396EmprCod ;
   private String[] H01Y12_A13929ForTipArtD ;
   private boolean[] H01Y12_n13929ForTipArtD ;
   private long[] H01Y13_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.webpanels.WebSession AV61Session ;
   private GXSimpleCollection<String> AV98TFForBlo_Sels ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV43DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV18GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState32[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV19GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV59TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
}

final  class dis_discolnom_prompt__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01Y12( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A7781ForBlo ,
                                          GXSimpleCollection<String> AV131Pedidos_dis_discolnom_promptds_26_tfforblo_sels ,
                                          int AV106Pedidos_dis_discolnom_promptds_1_tfclicod ,
                                          String AV107Pedidos_dis_discolnom_promptds_2_tfclinom ,
                                          String AV108Pedidos_dis_discolnom_promptds_3_tfforser ,
                                          String AV109Pedidos_dis_discolnom_promptds_4_tfforserdsc ,
                                          String AV112Pedidos_dis_discolnom_promptds_7_tfforcolnom ,
                                          int AV113Pedidos_dis_discolnom_promptds_8_tfforcolnum ,
                                          byte AV114Pedidos_dis_discolnom_promptds_9_tftipcolcod ,
                                          String AV116Pedidos_dis_discolnom_promptds_11_tftipcoldsc_sel ,
                                          String AV115Pedidos_dis_discolnom_promptds_10_tftipcoldsc ,
                                          String AV117Pedidos_dis_discolnom_promptds_12_tffornomcli ,
                                          int AV118Pedidos_dis_discolnom_promptds_13_tffornumcli ,
                                          String AV120Pedidos_dis_discolnom_promptds_15_tffortonal ,
                                          java.util.Date AV121Pedidos_dis_discolnom_promptds_16_tfforfec ,
                                          java.util.Date AV122Pedidos_dis_discolnom_promptds_17_tfforultmod ,
                                          java.util.Date AV123Pedidos_dis_discolnom_promptds_18_tfforultuti ,
                                          int AV124Pedidos_dis_discolnom_promptds_19_tffornumarc ,
                                          int AV125Pedidos_dis_discolnom_promptds_20_tffornumarc_to ,
                                          java.util.Date AV126Pedidos_dis_discolnom_promptds_21_tfforfecapr ,
                                          String AV128Pedidos_dis_discolnom_promptds_23_tfforopccli_sel ,
                                          String AV127Pedidos_dis_discolnom_promptds_22_tfforopccli ,
                                          int AV129Pedidos_dis_discolnom_promptds_24_tffornumcol ,
                                          int AV130Pedidos_dis_discolnom_promptds_25_tffornumcol_to ,
                                          int AV131Pedidos_dis_discolnom_promptds_26_tfforblo_sels_size ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          String A1191ForNomCli ,
                                          int A1192ForNumCli ,
                                          String A995ForTonal ,
                                          java.util.Date A485ForFec ,
                                          java.util.Date A495ForUltMod ,
                                          java.util.Date A496ForUltUti ,
                                          int A3315ForNumArc ,
                                          java.util.Date A3558ForFecApr ,
                                          String A3560ForOpcCli ,
                                          int A486ForNumCol ,
                                          short AV20OrderedBy ,
                                          boolean AV21OrderedDsc ,
                                          String AV111Pedidos_dis_discolnom_promptds_6_tffortipartdsc_sel ,
                                          String AV110Pedidos_dis_discolnom_promptds_5_tffortipartdsc ,
                                          String A13929ForTipArtD ,
                                          String A10045CliAct ,
                                          String AV7EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int33 = new byte[33];
      Object[] GXv_Object34 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T5.TipArtCod, T1.IntCod, T1.ForTipArt, T2.CliAct, T1.ForRGB, T1.ForBlo, T1.ForNumCol, T1.ForOpcCli, T1.ForFecApr, T1.ForNumArc, T1.ForUltUti, T1.ForUltMod, T1.ForFec," ;
      sSelectString += " T1.ForTonal, T3.IntDsc, T1.ForNumCli, T1.ForNomCli, T4.TipColDsc, T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSerDsc, T1.ForSer, T2.CliNom, T1.CliCod, T1.EmprCod," ;
      sSelectString += " COALESCE( T5.TipArtDsc, ' ') AS ForTipArtD" ;
      sFromString = " FROM ((((TXPCFORMU T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) INNER JOIN TXPINTENS T3 ON T3.EmprCod = T1.EmprCod AND T3.IntCod" ;
      sFromString += " = T1.IntCod) INNER JOIN TXPTIPCOL T4 ON T4.EmprCod = T1.EmprCod AND T4.TipColCod = T1.TipColCod) LEFT JOIN TXPTIPART T5 ON T5.EmprCod = T1.EmprCod AND T5.TipArtCod" ;
      sFromString += " = T1.ForTipArt)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T5.TipArtDsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T5.TipArtDsc, ' ') = ?))");
      addWhere(sWhereString, "(T2.CliAct = 'S')");
      if ( ! (0==AV106Pedidos_dis_discolnom_promptds_1_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int33[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Pedidos_dis_discolnom_promptds_2_tfclinom)==0) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Pedidos_dis_discolnom_promptds_3_tfforser)==0) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like UPPER(?))");
      }
      else
      {
         GXv_int33[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Pedidos_dis_discolnom_promptds_4_tfforserdsc)==0) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Pedidos_dis_discolnom_promptds_7_tfforcolnom)==0) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[10] = (byte)(1) ;
      }
      if ( ! (0==AV113Pedidos_dis_discolnom_promptds_8_tfforcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum = ?)");
      }
      else
      {
         GXv_int33[11] = (byte)(1) ;
      }
      if ( ! (0==AV114Pedidos_dis_discolnom_promptds_9_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod = ?)");
      }
      else
      {
         GXv_int33[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV116Pedidos_dis_discolnom_promptds_11_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV115Pedidos_dis_discolnom_promptds_10_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116Pedidos_dis_discolnom_promptds_11_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.TipColDsc = ?)");
      }
      else
      {
         GXv_int33[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Pedidos_dis_discolnom_promptds_12_tffornomcli)==0) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[15] = (byte)(1) ;
      }
      if ( ! (0==AV118Pedidos_dis_discolnom_promptds_13_tffornumcli) )
      {
         addWhere(sWhereString, "(T1.ForNumCli = ?)");
      }
      else
      {
         GXv_int33[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Pedidos_dis_discolnom_promptds_15_tffortonal)==0) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForTonal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV121Pedidos_dis_discolnom_promptds_16_tfforfec)) )
      {
         addWhere(sWhereString, "(T1.ForFec >= ?)");
      }
      else
      {
         GXv_int33[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV122Pedidos_dis_discolnom_promptds_17_tfforultmod)) )
      {
         addWhere(sWhereString, "(T1.ForUltMod >= ?)");
      }
      else
      {
         GXv_int33[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV123Pedidos_dis_discolnom_promptds_18_tfforultuti)) )
      {
         addWhere(sWhereString, "(T1.ForUltUti >= ?)");
      }
      else
      {
         GXv_int33[20] = (byte)(1) ;
      }
      if ( ! (0==AV124Pedidos_dis_discolnom_promptds_19_tffornumarc) )
      {
         addWhere(sWhereString, "(T1.ForNumArc >= ?)");
      }
      else
      {
         GXv_int33[21] = (byte)(1) ;
      }
      if ( ! (0==AV125Pedidos_dis_discolnom_promptds_20_tffornumarc_to) )
      {
         addWhere(sWhereString, "(T1.ForNumArc <= ?)");
      }
      else
      {
         GXv_int33[22] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV126Pedidos_dis_discolnom_promptds_21_tfforfecapr)) )
      {
         addWhere(sWhereString, "(T1.ForFecApr >= ?)");
      }
      else
      {
         GXv_int33[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV128Pedidos_dis_discolnom_promptds_23_tfforopccli_sel)==0) && ( ! (GXutil.strcmp("", AV127Pedidos_dis_discolnom_promptds_22_tfforopccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForOpcCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV128Pedidos_dis_discolnom_promptds_23_tfforopccli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForOpcCli = ?)");
      }
      else
      {
         GXv_int33[25] = (byte)(1) ;
      }
      if ( ! (0==AV129Pedidos_dis_discolnom_promptds_24_tffornumcol) )
      {
         addWhere(sWhereString, "(T1.ForNumCol >= ?)");
      }
      else
      {
         GXv_int33[26] = (byte)(1) ;
      }
      if ( ! (0==AV130Pedidos_dis_discolnom_promptds_25_tffornumcol_to) )
      {
         addWhere(sWhereString, "(T1.ForNumCol <= ?)");
      }
      else
      {
         GXv_int33[27] = (byte)(1) ;
      }
      if ( AV131Pedidos_dis_discolnom_promptds_26_tfforblo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV131Pedidos_dis_discolnom_promptds_26_tfforblo_sels, "T1.ForBlo IN (", ")")+")");
      }
      if ( AV20OrderedBy == 1 )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod" ;
      }
      else if ( ( AV20OrderedBy == 2 ) && ! AV21OrderedDsc )
      {
         sOrderString += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV20OrderedBy == 2 ) && ( AV21OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV20OrderedBy == 3 ) && ! AV21OrderedDsc )
      {
         sOrderString += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV20OrderedBy == 3 ) && ( AV21OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV20OrderedBy == 4 ) && ! AV21OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ForSer" ;
      }
      else if ( ( AV20OrderedBy == 4 ) && ( AV21OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ForSer DESC" ;
      }
      else if ( ( AV20OrderedBy == 5 ) && ! AV21OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ForSerDsc" ;
      }
      else if ( ( AV20OrderedBy == 5 ) && ( AV21OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ForSerDsc DESC" ;
      }
      else if ( ( AV20OrderedBy == 6 ) && ! AV21OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ForColNom" ;
      }
      else if ( ( AV20OrderedBy == 6 ) && ( AV21OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ForColNom DESC" ;
      }
      else if ( ( AV20OrderedBy == 7 ) && ! AV21OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ForColNum" ;
      }
      else if ( ( AV20OrderedBy == 7 ) && ( AV21OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ForColNum DESC" ;
      }
      else if ( ( AV20OrderedBy == 8 ) && ! AV21OrderedDsc )
      {
         sOrderString += " ORDER BY T1.TipColCod" ;
      }
      else if ( ( AV20OrderedBy == 8 ) && ( AV21OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.TipColCod DESC" ;
      }
      else if ( ( AV20OrderedBy == 9 ) && ! AV21OrderedDsc )
      {
         sOrderString += " ORDER BY T4.TipColDsc" ;
      }
      else if ( ( AV20OrderedBy == 9 ) && ( AV21OrderedDsc ) )
      {
         sOrderString += " ORDER BY T4.TipColDsc DESC" ;
      }
      else if ( ( AV20OrderedBy == 10 ) && ! AV21OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ForNomCli" ;
      }
      else if ( ( AV20OrderedBy == 10 ) && ( AV21OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ForNomCli DESC" ;
      }
      else if ( ( AV20OrderedBy == 11 ) && ! AV21OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ForNumCli" ;
      }
      else if ( ( AV20OrderedBy == 11 ) && ( AV21OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ForNumCli DESC" ;
      }
      else if ( ( AV20OrderedBy == 12 ) && ! AV21OrderedDsc )
      {
         sOrderString += " ORDER BY T3.IntDsc" ;
      }
      else if ( ( AV20OrderedBy == 12 ) && ( AV21OrderedDsc ) )
      {
         sOrderString += " ORDER BY T3.IntDsc DESC" ;
      }
      else if ( ( AV20OrderedBy == 13 ) && ! AV21OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ForTonal" ;
      }
      else if ( ( AV20OrderedBy == 13 ) && ( AV21OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ForTonal DESC" ;
      }
      else if ( ( AV20OrderedBy == 14 ) && ! AV21OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ForFec" ;
      }
      else if ( ( AV20OrderedBy == 14 ) && ( AV21OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ForFec DESC" ;
      }
      else if ( ( AV20OrderedBy == 15 ) && ! AV21OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ForUltMod" ;
      }
      else if ( ( AV20OrderedBy == 15 ) && ( AV21OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ForUltMod DESC" ;
      }
      else if ( ( AV20OrderedBy == 16 ) && ! AV21OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ForUltUti" ;
      }
      else if ( ( AV20OrderedBy == 16 ) && ( AV21OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ForUltUti DESC" ;
      }
      else if ( ( AV20OrderedBy == 17 ) && ! AV21OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ForNumArc" ;
      }
      else if ( ( AV20OrderedBy == 17 ) && ( AV21OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ForNumArc DESC" ;
      }
      else if ( ( AV20OrderedBy == 18 ) && ! AV21OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ForFecApr" ;
      }
      else if ( ( AV20OrderedBy == 18 ) && ( AV21OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ForFecApr DESC" ;
      }
      else if ( ( AV20OrderedBy == 19 ) && ! AV21OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ForOpcCli" ;
      }
      else if ( ( AV20OrderedBy == 19 ) && ( AV21OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ForOpcCli DESC" ;
      }
      else if ( ( AV20OrderedBy == 20 ) && ! AV21OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ForNumCol" ;
      }
      else if ( ( AV20OrderedBy == 20 ) && ( AV21OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ForNumCol DESC" ;
      }
      else if ( ( AV20OrderedBy == 21 ) && ! AV21OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ForBlo" ;
      }
      else if ( ( AV20OrderedBy == 21 ) && ( AV21OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ForBlo DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object34[0] = scmdbuf ;
      GXv_Object34[1] = GXv_int33 ;
      return GXv_Object34 ;
   }

   protected Object[] conditional_H01Y13( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A7781ForBlo ,
                                          GXSimpleCollection<String> AV131Pedidos_dis_discolnom_promptds_26_tfforblo_sels ,
                                          int AV106Pedidos_dis_discolnom_promptds_1_tfclicod ,
                                          String AV107Pedidos_dis_discolnom_promptds_2_tfclinom ,
                                          String AV108Pedidos_dis_discolnom_promptds_3_tfforser ,
                                          String AV109Pedidos_dis_discolnom_promptds_4_tfforserdsc ,
                                          String AV112Pedidos_dis_discolnom_promptds_7_tfforcolnom ,
                                          int AV113Pedidos_dis_discolnom_promptds_8_tfforcolnum ,
                                          byte AV114Pedidos_dis_discolnom_promptds_9_tftipcolcod ,
                                          String AV116Pedidos_dis_discolnom_promptds_11_tftipcoldsc_sel ,
                                          String AV115Pedidos_dis_discolnom_promptds_10_tftipcoldsc ,
                                          String AV117Pedidos_dis_discolnom_promptds_12_tffornomcli ,
                                          int AV118Pedidos_dis_discolnom_promptds_13_tffornumcli ,
                                          String AV120Pedidos_dis_discolnom_promptds_15_tffortonal ,
                                          java.util.Date AV121Pedidos_dis_discolnom_promptds_16_tfforfec ,
                                          java.util.Date AV122Pedidos_dis_discolnom_promptds_17_tfforultmod ,
                                          java.util.Date AV123Pedidos_dis_discolnom_promptds_18_tfforultuti ,
                                          int AV124Pedidos_dis_discolnom_promptds_19_tffornumarc ,
                                          int AV125Pedidos_dis_discolnom_promptds_20_tffornumarc_to ,
                                          java.util.Date AV126Pedidos_dis_discolnom_promptds_21_tfforfecapr ,
                                          String AV128Pedidos_dis_discolnom_promptds_23_tfforopccli_sel ,
                                          String AV127Pedidos_dis_discolnom_promptds_22_tfforopccli ,
                                          int AV129Pedidos_dis_discolnom_promptds_24_tffornumcol ,
                                          int AV130Pedidos_dis_discolnom_promptds_25_tffornumcol_to ,
                                          int AV131Pedidos_dis_discolnom_promptds_26_tfforblo_sels_size ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          String A1191ForNomCli ,
                                          int A1192ForNumCli ,
                                          String A995ForTonal ,
                                          java.util.Date A485ForFec ,
                                          java.util.Date A495ForUltMod ,
                                          java.util.Date A496ForUltUti ,
                                          int A3315ForNumArc ,
                                          java.util.Date A3558ForFecApr ,
                                          String A3560ForOpcCli ,
                                          int A486ForNumCol ,
                                          short AV20OrderedBy ,
                                          boolean AV21OrderedDsc ,
                                          String AV111Pedidos_dis_discolnom_promptds_6_tffortipartdsc_sel ,
                                          String AV110Pedidos_dis_discolnom_promptds_5_tffortipartdsc ,
                                          String A13929ForTipArtD ,
                                          String A10045CliAct ,
                                          String AV7EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int36 = new byte[28];
      Object[] GXv_Object37 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM ((((TXPCFORMU T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) INNER JOIN TXPINTENS T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.IntCod = T1.IntCod) INNER JOIN TXPTIPCOL T4 ON T4.EmprCod = T1.EmprCod AND T4.TipColCod = T1.TipColCod) LEFT JOIN TXPTIPART T5 ON T5.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T5.TipArtCod = T1.ForTipArt)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T5.TipArtDsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T5.TipArtDsc, ' ') = ?))");
      addWhere(sWhereString, "(T2.CliAct = 'S')");
      if ( ! (0==AV106Pedidos_dis_discolnom_promptds_1_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int36[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Pedidos_dis_discolnom_promptds_2_tfclinom)==0) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Pedidos_dis_discolnom_promptds_3_tfforser)==0) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like UPPER(?))");
      }
      else
      {
         GXv_int36[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Pedidos_dis_discolnom_promptds_4_tfforserdsc)==0) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Pedidos_dis_discolnom_promptds_7_tfforcolnom)==0) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[10] = (byte)(1) ;
      }
      if ( ! (0==AV113Pedidos_dis_discolnom_promptds_8_tfforcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum = ?)");
      }
      else
      {
         GXv_int36[11] = (byte)(1) ;
      }
      if ( ! (0==AV114Pedidos_dis_discolnom_promptds_9_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod = ?)");
      }
      else
      {
         GXv_int36[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV116Pedidos_dis_discolnom_promptds_11_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV115Pedidos_dis_discolnom_promptds_10_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116Pedidos_dis_discolnom_promptds_11_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.TipColDsc = ?)");
      }
      else
      {
         GXv_int36[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Pedidos_dis_discolnom_promptds_12_tffornomcli)==0) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[15] = (byte)(1) ;
      }
      if ( ! (0==AV118Pedidos_dis_discolnom_promptds_13_tffornumcli) )
      {
         addWhere(sWhereString, "(T1.ForNumCli = ?)");
      }
      else
      {
         GXv_int36[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Pedidos_dis_discolnom_promptds_15_tffortonal)==0) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForTonal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV121Pedidos_dis_discolnom_promptds_16_tfforfec)) )
      {
         addWhere(sWhereString, "(T1.ForFec >= ?)");
      }
      else
      {
         GXv_int36[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV122Pedidos_dis_discolnom_promptds_17_tfforultmod)) )
      {
         addWhere(sWhereString, "(T1.ForUltMod >= ?)");
      }
      else
      {
         GXv_int36[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV123Pedidos_dis_discolnom_promptds_18_tfforultuti)) )
      {
         addWhere(sWhereString, "(T1.ForUltUti >= ?)");
      }
      else
      {
         GXv_int36[20] = (byte)(1) ;
      }
      if ( ! (0==AV124Pedidos_dis_discolnom_promptds_19_tffornumarc) )
      {
         addWhere(sWhereString, "(T1.ForNumArc >= ?)");
      }
      else
      {
         GXv_int36[21] = (byte)(1) ;
      }
      if ( ! (0==AV125Pedidos_dis_discolnom_promptds_20_tffornumarc_to) )
      {
         addWhere(sWhereString, "(T1.ForNumArc <= ?)");
      }
      else
      {
         GXv_int36[22] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV126Pedidos_dis_discolnom_promptds_21_tfforfecapr)) )
      {
         addWhere(sWhereString, "(T1.ForFecApr >= ?)");
      }
      else
      {
         GXv_int36[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV128Pedidos_dis_discolnom_promptds_23_tfforopccli_sel)==0) && ( ! (GXutil.strcmp("", AV127Pedidos_dis_discolnom_promptds_22_tfforopccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForOpcCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV128Pedidos_dis_discolnom_promptds_23_tfforopccli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForOpcCli = ?)");
      }
      else
      {
         GXv_int36[25] = (byte)(1) ;
      }
      if ( ! (0==AV129Pedidos_dis_discolnom_promptds_24_tffornumcol) )
      {
         addWhere(sWhereString, "(T1.ForNumCol >= ?)");
      }
      else
      {
         GXv_int36[26] = (byte)(1) ;
      }
      if ( ! (0==AV130Pedidos_dis_discolnom_promptds_25_tffornumcol_to) )
      {
         addWhere(sWhereString, "(T1.ForNumCol <= ?)");
      }
      else
      {
         GXv_int36[27] = (byte)(1) ;
      }
      if ( AV131Pedidos_dis_discolnom_promptds_26_tfforblo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV131Pedidos_dis_discolnom_promptds_26_tfforblo_sels, "T1.ForBlo IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      if ( AV20OrderedBy == 1 )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 2 ) && ! AV21OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 2 ) && ( AV21OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 3 ) && ! AV21OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 3 ) && ( AV21OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 4 ) && ! AV21OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 4 ) && ( AV21OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 5 ) && ! AV21OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 5 ) && ( AV21OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 6 ) && ! AV21OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 6 ) && ( AV21OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 7 ) && ! AV21OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 7 ) && ( AV21OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 8 ) && ! AV21OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 8 ) && ( AV21OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 9 ) && ! AV21OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 9 ) && ( AV21OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 10 ) && ! AV21OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 10 ) && ( AV21OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 11 ) && ! AV21OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 11 ) && ( AV21OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 12 ) && ! AV21OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 12 ) && ( AV21OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 13 ) && ! AV21OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 13 ) && ( AV21OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 14 ) && ! AV21OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 14 ) && ( AV21OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 15 ) && ! AV21OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 15 ) && ( AV21OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 16 ) && ! AV21OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 16 ) && ( AV21OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 17 ) && ! AV21OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 17 ) && ( AV21OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 18 ) && ! AV21OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 18 ) && ( AV21OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 19 ) && ! AV21OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 19 ) && ( AV21OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 20 ) && ! AV21OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 20 ) && ( AV21OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 21 ) && ! AV21OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 21 ) && ( AV21OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object37[0] = scmdbuf ;
      GXv_Object37[1] = GXv_int36 ;
      return GXv_Object37 ;
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
                  return conditional_H01Y12(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).byteValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (java.util.Date)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , (java.util.Date)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).shortValue() , ((Boolean) dynConstraints[44]).booleanValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] );
            case 1 :
                  return conditional_H01Y13(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).byteValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (java.util.Date)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , (java.util.Date)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).shortValue() , ((Boolean) dynConstraints[44]).booleanValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01Y12", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01Y13", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((long[]) buf[5])[0] = rslt.getLong(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(7);
               ((String[]) buf[10])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(11);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(12);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(13);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(14, 20);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(15, 30);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((int[]) buf[26])[0] = rslt.getInt(16);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(17, 13);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(18, 30);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((byte[]) buf[32])[0] = rslt.getByte(19);
               ((int[]) buf[33])[0] = rslt.getInt(20);
               ((String[]) buf[34])[0] = rslt.getString(21, 13);
               ((String[]) buf[35])[0] = rslt.getString(22, 26);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(23, 16);
               ((String[]) buf[38])[0] = rslt.getString(24, 30);
               ((int[]) buf[39])[0] = rslt.getInt(25);
               ((String[]) buf[40])[0] = rslt.getString(26, 3);
               ((String[]) buf[41])[0] = rslt.getString(27, 30);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[33], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[45]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 20);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[51]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[52]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[53]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[56]);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[40]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 20);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[46]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[47]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[48]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[51]);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               return;
      }
   }

}

