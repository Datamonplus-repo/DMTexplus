package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wchistoricorecetaslconti_impl extends GXWebComponent
{
   public wchistoricorecetaslconti_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wchistoricorecetaslconti_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wchistoricorecetaslconti_impl.class ));
   }

   public wchistoricorecetaslconti_impl( int remoteHandle ,
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
               AV54EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54EmprCod", AV54EmprCod);
               AV60Fec1 = localUtil.parseDateParm( httpContext.GetPar( "Fec1")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60Fec1", localUtil.format(AV60Fec1, "99/99/99"));
               AV62Fec3 = localUtil.parseDateParm( httpContext.GetPar( "Fec3")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62Fec3", localUtil.format(AV62Fec3, "99/99/99"));
               AV111PCliCod = (int)(GXutil.lval( httpContext.GetPar( "PCliCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV111PCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV111PCliCod), 6, 0));
               AV34CliCodP = (int)(GXutil.lval( httpContext.GetPar( "CliCodP"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34CliCodP", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34CliCodP), 6, 0));
               AV108PBarCod = (int)(GXutil.lval( httpContext.GetPar( "PBarCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV108PBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV108PBarCod), 8, 0));
               AV11BarCodP = (int)(GXutil.lval( httpContext.GetPar( "BarCodP"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11BarCodP", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11BarCodP), 8, 0));
               AV110PBarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "PBarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV110PBarCodReo", GXutil.str( AV110PBarCodReo, 1, 0));
               AV15BarCodReoP = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReoP"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15BarCodReoP", GXutil.str( AV15BarCodReoP, 1, 0));
               AV109PBarCodPar = httpContext.GetPar( "PBarCodPar") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV109PBarCodPar", AV109PBarCodPar);
               AV13BarCodParP = httpContext.GetPar( "BarCodParP") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13BarCodParP", AV13BarCodParP);
               AV114PSerie = httpContext.GetPar( "PSerie") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV114PSerie", AV114PSerie);
               AV118SerieP = httpContext.GetPar( "SerieP") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV118SerieP", AV118SerieP);
               AV113PColor = httpContext.GetPar( "PColor") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV113PColor", AV113PColor);
               AV37ColorP = httpContext.GetPar( "ColorP") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37ColorP", AV37ColorP);
               AV112PColNum = (int)(GXutil.lval( httpContext.GetPar( "PColNum"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV112PColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV112PColNum), 6, 0));
               AV36ColNumP = (int)(GXutil.lval( httpContext.GetPar( "ColNumP"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36ColNumP", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36ColNumP), 6, 0));
               AV51DispCli1 = httpContext.GetPar( "DispCli1") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51DispCli1", AV51DispCli1);
               AV53DispCli3 = httpContext.GetPar( "DispCli3") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53DispCli3", AV53DispCli3);
               AV72HreRacab = httpContext.GetPar( "HreRacab") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72HreRacab", AV72HreRacab);
               AV97MaqCodi = httpContext.GetPar( "MaqCodi") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV97MaqCodi", AV97MaqCodi);
               AV95maqcod3 = httpContext.GetPar( "maqcod3") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV95maqcod3", AV95maqcod3);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV54EmprCod,AV60Fec1,AV62Fec3,Integer.valueOf(AV111PCliCod),Integer.valueOf(AV34CliCodP),Integer.valueOf(AV108PBarCod),Integer.valueOf(AV11BarCodP),Byte.valueOf(AV110PBarCodReo),Byte.valueOf(AV15BarCodReoP),AV109PBarCodPar,AV13BarCodParP,AV114PSerie,AV118SerieP,AV113PColor,AV37ColorP,Integer.valueOf(AV112PColNum),Integer.valueOf(AV36ColNumP),AV51DispCli1,AV53DispCli3,AV72HreRacab,AV97MaqCodi,AV95maqcod3});
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
      nRC_GXsfl_41 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_41"))) ;
      nGXsfl_41_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_41_idx"))) ;
      sGXsfl_41_idx = httpContext.GetPar( "sGXsfl_41_idx") ;
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
      AV228FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV54EmprCod = httpContext.GetPar( "EmprCod") ;
      AV60Fec1 = localUtil.parseDateParm( httpContext.GetPar( "Fec1")) ;
      AV62Fec3 = localUtil.parseDateParm( httpContext.GetPar( "Fec3")) ;
      AV111PCliCod = (int)(GXutil.lval( httpContext.GetPar( "PCliCod"))) ;
      AV34CliCodP = (int)(GXutil.lval( httpContext.GetPar( "CliCodP"))) ;
      AV108PBarCod = (int)(GXutil.lval( httpContext.GetPar( "PBarCod"))) ;
      AV11BarCodP = (int)(GXutil.lval( httpContext.GetPar( "BarCodP"))) ;
      AV110PBarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "PBarCodReo"))) ;
      AV15BarCodReoP = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReoP"))) ;
      AV109PBarCodPar = httpContext.GetPar( "PBarCodPar") ;
      AV13BarCodParP = httpContext.GetPar( "BarCodParP") ;
      AV114PSerie = httpContext.GetPar( "PSerie") ;
      AV118SerieP = httpContext.GetPar( "SerieP") ;
      AV113PColor = httpContext.GetPar( "PColor") ;
      AV37ColorP = httpContext.GetPar( "ColorP") ;
      AV112PColNum = (int)(GXutil.lval( httpContext.GetPar( "PColNum"))) ;
      AV36ColNumP = (int)(GXutil.lval( httpContext.GetPar( "ColNumP"))) ;
      AV51DispCli1 = httpContext.GetPar( "DispCli1") ;
      AV53DispCli3 = httpContext.GetPar( "DispCli3") ;
      AV72HreRacab = httpContext.GetPar( "HreRacab") ;
      AV97MaqCodi = httpContext.GetPar( "MaqCodi") ;
      AV95maqcod3 = httpContext.GetPar( "maqcod3") ;
      AV153ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV148ColumnsSelector);
      AV235Pgmname = httpContext.GetPar( "Pgmname") ;
      AV141OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV142OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV220TotBarKgmTin = CommonUtil.decimalVal( httpContext.GetPar( "TotBarKgmTin"), ".") ;
      AV222TotBarMtrTin = CommonUtil.decimalVal( httpContext.GetPar( "TotBarMtrTin"), ".") ;
      AV216TFBarNumAna_To = (short)(GXutil.lval( httpContext.GetPar( "TFBarNumAna_To"))) ;
      AV215TFBarNumAna = (short)(GXutil.lval( httpContext.GetPar( "TFBarNumAna"))) ;
      AV219TFBarDispCli_Sel = httpContext.GetPar( "TFBarDispCli_Sel") ;
      AV218TFBarDispCli = httpContext.GetPar( "TFBarDispCli") ;
      AV207TFBarVolTin_To = (int)(GXutil.lval( httpContext.GetPar( "TFBarVolTin_To"))) ;
      AV206TFBarVolTin = (int)(GXutil.lval( httpContext.GetPar( "TFBarVolTin"))) ;
      AV204TFBarMaqTin_Sel = httpContext.GetPar( "TFBarMaqTin_Sel") ;
      AV203TFBarMaqTin = httpContext.GetPar( "TFBarMaqTin") ;
      AV201TFBarMtsTt_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarMtsTt_To"), ".") ;
      AV200TFBarMtsTt = CommonUtil.decimalVal( httpContext.GetPar( "TFBarMtsTt"), ".") ;
      AV198TFBarMtrTin_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarMtrTin_To"), ".") ;
      AV197TFBarMtrTin = CommonUtil.decimalVal( httpContext.GetPar( "TFBarMtrTin"), ".") ;
      AV195TFBarKgsTt_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarKgsTt_To"), ".") ;
      AV194TFBarKgsTt = CommonUtil.decimalVal( httpContext.GetPar( "TFBarKgsTt"), ".") ;
      AV192TFBarKgmTin_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarKgmTin_To"), ".") ;
      AV191TFBarKgmTin = CommonUtil.decimalVal( httpContext.GetPar( "TFBarKgmTin"), ".") ;
      AV189TFBarTipCoT_To = (byte)(GXutil.lval( httpContext.GetPar( "TFBarTipCoT_To"))) ;
      AV188TFBarTipCoT = (byte)(GXutil.lval( httpContext.GetPar( "TFBarTipCoT"))) ;
      AV186TFBarColNuT_To = (int)(GXutil.lval( httpContext.GetPar( "TFBarColNuT_To"))) ;
      AV185TFBarColNuT = (int)(GXutil.lval( httpContext.GetPar( "TFBarColNuT"))) ;
      AV183TFBarColNoT_Sel = httpContext.GetPar( "TFBarColNoT_Sel") ;
      AV182TFBarColNoT = httpContext.GetPar( "TFBarColNoT") ;
      AV180TFBarDscTin_Sel = httpContext.GetPar( "TFBarDscTin_Sel") ;
      AV179TFBarDscTin = httpContext.GetPar( "TFBarDscTin") ;
      AV177TFBarSerTin_Sel = httpContext.GetPar( "TFBarSerTin_Sel") ;
      AV176TFBarSerTin = httpContext.GetPar( "TFBarSerTin") ;
      AV174TFCliNom_Sel = httpContext.GetPar( "TFCliNom_Sel") ;
      AV173TFCliNom = httpContext.GetPar( "TFCliNom") ;
      AV171TFCliCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod_To"))) ;
      AV170TFCliCod = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod"))) ;
      AV210TFBarAgrLot_Sel = httpContext.GetPar( "TFBarAgrLot_Sel") ;
      AV209TFBarAgrLot = httpContext.GetPar( "TFBarAgrLot") ;
      AV232TFBarnhdr_lconti_Sel = httpContext.GetPar( "TFBarnhdr_lconti_Sel") ;
      AV231TFBarnhdr_lconti = httpContext.GetPar( "TFBarnhdr_lconti") ;
      AV161TFEstTinNr_To = (short)(GXutil.lval( httpContext.GetPar( "TFEstTinNr_To"))) ;
      AV160TFEstTinNr = (short)(GXutil.lval( httpContext.GetPar( "TFEstTinNr"))) ;
      AV156TFEstFecCier_To = localUtil.parseDateParm( httpContext.GetPar( "TFEstFecCier_To")) ;
      AV155TFEstFecCier = localUtil.parseDateParm( httpContext.GetPar( "TFEstFecCier")) ;
      AV106num_t = (int)(GXutil.lval( httpContext.GetPar( "num_t"))) ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV228FilterFullText, AV54EmprCod, AV60Fec1, AV62Fec3, AV111PCliCod, AV34CliCodP, AV108PBarCod, AV11BarCodP, AV110PBarCodReo, AV15BarCodReoP, AV109PBarCodPar, AV13BarCodParP, AV114PSerie, AV118SerieP, AV113PColor, AV37ColorP, AV112PColNum, AV36ColNumP, AV51DispCli1, AV53DispCli3, AV72HreRacab, AV97MaqCodi, AV95maqcod3, AV153ManageFiltersExecutionStep, AV148ColumnsSelector, AV235Pgmname, AV141OrderedBy, AV142OrderedDsc, AV220TotBarKgmTin, AV222TotBarMtrTin, AV216TFBarNumAna_To, AV215TFBarNumAna, AV219TFBarDispCli_Sel, AV218TFBarDispCli, AV207TFBarVolTin_To, AV206TFBarVolTin, AV204TFBarMaqTin_Sel, AV203TFBarMaqTin, AV201TFBarMtsTt_To, AV200TFBarMtsTt, AV198TFBarMtrTin_To, AV197TFBarMtrTin, AV195TFBarKgsTt_To, AV194TFBarKgsTt, AV192TFBarKgmTin_To, AV191TFBarKgmTin, AV189TFBarTipCoT_To, AV188TFBarTipCoT, AV186TFBarColNuT_To, AV185TFBarColNuT, AV183TFBarColNoT_Sel, AV182TFBarColNoT, AV180TFBarDscTin_Sel, AV179TFBarDscTin, AV177TFBarSerTin_Sel, AV176TFBarSerTin, AV174TFCliNom_Sel, AV173TFCliNom, AV171TFCliCod_To, AV170TFCliCod, AV210TFBarAgrLot_Sel, AV209TFBarAgrLot, AV232TFBarnhdr_lconti_Sel, AV231TFBarnhdr_lconti, AV161TFEstTinNr_To, AV160TFEstTinNr, AV156TFEstFecCier_To, AV155TFEstFecCier, AV106num_t, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         paT92( ) ;
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
         httpContext.writeValue( httpContext.getMessage( " LCONTI", "")) ;
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
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.wchistoricorecetaslconti", new String[] {GXutil.URLEncode(GXutil.rtrim(AV54EmprCod)),GXutil.URLEncode(GXutil.formatDateParm(AV60Fec1)),GXutil.URLEncode(GXutil.formatDateParm(AV62Fec3)),GXutil.URLEncode(GXutil.ltrimstr(AV111PCliCod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV34CliCodP,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV108PBarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV11BarCodP,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV110PBarCodReo,1,0)),GXutil.URLEncode(GXutil.ltrimstr(AV15BarCodReoP,1,0)),GXutil.URLEncode(GXutil.rtrim(AV109PBarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV13BarCodParP)),GXutil.URLEncode(GXutil.rtrim(AV114PSerie)),GXutil.URLEncode(GXutil.rtrim(AV118SerieP)),GXutil.URLEncode(GXutil.rtrim(AV113PColor)),GXutil.URLEncode(GXutil.rtrim(AV37ColorP)),GXutil.URLEncode(GXutil.ltrimstr(AV112PColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV36ColNumP,6,0)),GXutil.URLEncode(GXutil.rtrim(AV51DispCli1)),GXutil.URLEncode(GXutil.rtrim(AV53DispCli3)),GXutil.URLEncode(GXutil.rtrim(AV72HreRacab)),GXutil.URLEncode(GXutil.rtrim(AV97MaqCodi)),GXutil.URLEncode(GXutil.rtrim(AV95maqcod3))}, new String[] {"EmprCod","Fec1","Fec3","PCliCod","CliCodP","PBarCod","BarCodP","PBarCodReo","BarCodReoP","PBarCodPar","BarCodParP","PSerie","SerieP","PColor","ColorP","PColNum","ColNumP","DispCli1","DispCli3","HreRacab","MaqCodi","maqcod3"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARKGMTIN", getSecureSignedToken( sPrefix, localUtil.format( AV220TotBarKgmTin, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARMTRTIN", getSecureSignedToken( sPrefix, localUtil.format( AV222TotBarMtrTin, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARNUMANA_TO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV216TFBarNumAna_To), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARNUMANA", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV215TFBarNumAna), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARDISPCLI_SEL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV219TFBarDispCli_Sel, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARDISPCLI", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV218TFBarDispCli, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARVOLTIN_TO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV207TFBarVolTin_To), "ZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARVOLTIN", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV206TFBarVolTin), "ZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARMAQTIN_SEL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV204TFBarMaqTin_Sel, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARMAQTIN", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV203TFBarMaqTin, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARMTSTT_TO", getSecureSignedToken( sPrefix, localUtil.format( AV201TFBarMtsTt_To, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARMTSTT", getSecureSignedToken( sPrefix, localUtil.format( AV200TFBarMtsTt, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARMTRTIN_TO", getSecureSignedToken( sPrefix, localUtil.format( AV198TFBarMtrTin_To, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARMTRTIN", getSecureSignedToken( sPrefix, localUtil.format( AV197TFBarMtrTin, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARKGSTT_TO", getSecureSignedToken( sPrefix, localUtil.format( AV195TFBarKgsTt_To, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARKGSTT", getSecureSignedToken( sPrefix, localUtil.format( AV194TFBarKgsTt, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARKGMTIN_TO", getSecureSignedToken( sPrefix, localUtil.format( AV192TFBarKgmTin_To, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARKGMTIN", getSecureSignedToken( sPrefix, localUtil.format( AV191TFBarKgmTin, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARTIPCOT_TO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV189TFBarTipCoT_To), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARTIPCOT", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV188TFBarTipCoT), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARCOLNUT_TO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV186TFBarColNuT_To), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARCOLNUT", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV185TFBarColNuT), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARCOLNOT_SEL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV183TFBarColNoT_Sel, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARCOLNOT", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV182TFBarColNoT, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARDSCTIN_SEL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV180TFBarDscTin_Sel, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARDSCTIN", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV179TFBarDscTin, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARSERTIN_SEL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV177TFBarSerTin_Sel, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARSERTIN", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV176TFBarSerTin, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFCLINOM_SEL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV174TFCliNom_Sel, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFCLINOM", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV173TFCliNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFCLICOD_TO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV171TFCliCod_To), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFCLICOD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV170TFCliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARAGRLOT_SEL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV210TFBarAgrLot_Sel, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARAGRLOT", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV209TFBarAgrLot, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARNHDR_LCONTI_SEL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV232TFBarnhdr_lconti_Sel, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARNHDR_LCONTI", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV231TFBarnhdr_lconti, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFESTTINNR_TO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV161TFEstTinNr_To), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFESTTINNR", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV160TFEstTinNr), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFESTFECCIER_TO", getSecureSignedToken( sPrefix, AV156TFEstFecCier_To));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFESTFECCIER", getSecureSignedToken( sPrefix, AV155TFEstFecCier));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vNUM_T", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV106num_t), "ZZZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"WCHistoricoRecetasLconti");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV235Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("wchistoricorecetaslconti:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXH_vFILTERFULLTEXT", AV228FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_41", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_41, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV151ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV151ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV165GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV166GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV163DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV163DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV148ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV148ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV54EmprCod", GXutil.rtrim( wcpOAV54EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV60Fec1", localUtil.dtoc( wcpOAV60Fec1, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV62Fec3", localUtil.dtoc( wcpOAV62Fec3, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV111PCliCod", GXutil.ltrim( localUtil.ntoc( wcpOAV111PCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV34CliCodP", GXutil.ltrim( localUtil.ntoc( wcpOAV34CliCodP, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV108PBarCod", GXutil.ltrim( localUtil.ntoc( wcpOAV108PBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV11BarCodP", GXutil.ltrim( localUtil.ntoc( wcpOAV11BarCodP, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV110PBarCodReo", GXutil.ltrim( localUtil.ntoc( wcpOAV110PBarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV15BarCodReoP", GXutil.ltrim( localUtil.ntoc( wcpOAV15BarCodReoP, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV109PBarCodPar", GXutil.rtrim( wcpOAV109PBarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV13BarCodParP", GXutil.rtrim( wcpOAV13BarCodParP));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV114PSerie", GXutil.rtrim( wcpOAV114PSerie));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV118SerieP", GXutil.rtrim( wcpOAV118SerieP));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV113PColor", GXutil.rtrim( wcpOAV113PColor));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV37ColorP", GXutil.rtrim( wcpOAV37ColorP));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV112PColNum", GXutil.ltrim( localUtil.ntoc( wcpOAV112PColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV36ColNumP", GXutil.ltrim( localUtil.ntoc( wcpOAV36ColNumP, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV51DispCli1", GXutil.rtrim( wcpOAV51DispCli1));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV53DispCli3", GXutil.rtrim( wcpOAV53DispCli3));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV72HreRacab", GXutil.rtrim( wcpOAV72HreRacab));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV97MaqCodi", GXutil.rtrim( wcpOAV97MaqCodi));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV95maqcod3", GXutil.rtrim( wcpOAV95maqcod3));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV153ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV141OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV142OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV54EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFEC1", localUtil.dtoc( AV60Fec1, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFEC3", localUtil.dtoc( AV62Fec3, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPCLICOD", GXutil.ltrim( localUtil.ntoc( AV111PCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICODP", GXutil.ltrim( localUtil.ntoc( AV34CliCodP, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPBARCOD", GXutil.ltrim( localUtil.ntoc( AV108PBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODP", GXutil.ltrim( localUtil.ntoc( AV11BarCodP, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPBARCODREO", GXutil.ltrim( localUtil.ntoc( AV110PBarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODREOP", GXutil.ltrim( localUtil.ntoc( AV15BarCodReoP, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPBARCODPAR", GXutil.rtrim( AV109PBarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODPARP", GXutil.rtrim( AV13BarCodParP));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPSERIE", GXutil.rtrim( AV114PSerie));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSERIEP", GXutil.rtrim( AV118SerieP));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPCOLOR", GXutil.rtrim( AV113PColor));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCOLORP", GXutil.rtrim( AV37ColorP));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPCOLNUM", GXutil.ltrim( localUtil.ntoc( AV112PColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCOLNUMP", GXutil.ltrim( localUtil.ntoc( AV36ColNumP, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vDISPCLI1", GXutil.rtrim( AV51DispCli1));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vDISPCLI3", GXutil.rtrim( AV53DispCli3));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHRERACAB", GXutil.rtrim( AV72HreRacab));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCODI", GXutil.rtrim( AV97MaqCodi));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCOD3", GXutil.rtrim( AV95maqcod3));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARRECACB", GXutil.rtrim( A6634BarRecAcb));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTBARKGMTIN", GXutil.ltrim( localUtil.ntoc( AV220TotBarKgmTin, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARKGMTIN", getSecureSignedToken( sPrefix, localUtil.format( AV220TotBarKgmTin, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTBARMTRTIN", GXutil.ltrim( localUtil.ntoc( AV222TotBarMtrTin, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARMTRTIN", getSecureSignedToken( sPrefix, localUtil.format( AV222TotBarMtrTin, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNUMANA_TO", GXutil.ltrim( localUtil.ntoc( AV216TFBarNumAna_To, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARNUMANA_TO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV216TFBarNumAna_To), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNUMANA", GXutil.ltrim( localUtil.ntoc( AV215TFBarNumAna, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARNUMANA", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV215TFBarNumAna), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARDISPCLI_SEL", GXutil.rtrim( AV219TFBarDispCli_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARDISPCLI_SEL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV219TFBarDispCli_Sel, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARDISPCLI", GXutil.rtrim( AV218TFBarDispCli));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARDISPCLI", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV218TFBarDispCli, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARVOLTIN_TO", GXutil.ltrim( localUtil.ntoc( AV207TFBarVolTin_To, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARVOLTIN_TO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV207TFBarVolTin_To), "ZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARVOLTIN", GXutil.ltrim( localUtil.ntoc( AV206TFBarVolTin, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARVOLTIN", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV206TFBarVolTin), "ZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARMAQTIN_SEL", GXutil.rtrim( AV204TFBarMaqTin_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARMAQTIN_SEL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV204TFBarMaqTin_Sel, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARMAQTIN", GXutil.rtrim( AV203TFBarMaqTin));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARMAQTIN", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV203TFBarMaqTin, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARMTSTT_TO", GXutil.ltrim( localUtil.ntoc( AV201TFBarMtsTt_To, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARMTSTT_TO", getSecureSignedToken( sPrefix, localUtil.format( AV201TFBarMtsTt_To, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARMTSTT", GXutil.ltrim( localUtil.ntoc( AV200TFBarMtsTt, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARMTSTT", getSecureSignedToken( sPrefix, localUtil.format( AV200TFBarMtsTt, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARMTRTIN_TO", GXutil.ltrim( localUtil.ntoc( AV198TFBarMtrTin_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARMTRTIN_TO", getSecureSignedToken( sPrefix, localUtil.format( AV198TFBarMtrTin_To, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARMTRTIN", GXutil.ltrim( localUtil.ntoc( AV197TFBarMtrTin, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARMTRTIN", getSecureSignedToken( sPrefix, localUtil.format( AV197TFBarMtrTin, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARKGSTT_TO", GXutil.ltrim( localUtil.ntoc( AV195TFBarKgsTt_To, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARKGSTT_TO", getSecureSignedToken( sPrefix, localUtil.format( AV195TFBarKgsTt_To, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARKGSTT", GXutil.ltrim( localUtil.ntoc( AV194TFBarKgsTt, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARKGSTT", getSecureSignedToken( sPrefix, localUtil.format( AV194TFBarKgsTt, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARKGMTIN_TO", GXutil.ltrim( localUtil.ntoc( AV192TFBarKgmTin_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARKGMTIN_TO", getSecureSignedToken( sPrefix, localUtil.format( AV192TFBarKgmTin_To, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARKGMTIN", GXutil.ltrim( localUtil.ntoc( AV191TFBarKgmTin, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARKGMTIN", getSecureSignedToken( sPrefix, localUtil.format( AV191TFBarKgmTin, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARTIPCOT_TO", GXutil.ltrim( localUtil.ntoc( AV189TFBarTipCoT_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARTIPCOT_TO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV189TFBarTipCoT_To), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARTIPCOT", GXutil.ltrim( localUtil.ntoc( AV188TFBarTipCoT, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARTIPCOT", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV188TFBarTipCoT), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNUT_TO", GXutil.ltrim( localUtil.ntoc( AV186TFBarColNuT_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARCOLNUT_TO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV186TFBarColNuT_To), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNUT", GXutil.ltrim( localUtil.ntoc( AV185TFBarColNuT, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARCOLNUT", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV185TFBarColNuT), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNOT_SEL", GXutil.rtrim( AV183TFBarColNoT_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARCOLNOT_SEL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV183TFBarColNoT_Sel, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNOT", GXutil.rtrim( AV182TFBarColNoT));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARCOLNOT", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV182TFBarColNoT, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARDSCTIN_SEL", GXutil.rtrim( AV180TFBarDscTin_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARDSCTIN_SEL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV180TFBarDscTin_Sel, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARDSCTIN", GXutil.rtrim( AV179TFBarDscTin));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARDSCTIN", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV179TFBarDscTin, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSERTIN_SEL", GXutil.rtrim( AV177TFBarSerTin_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARSERTIN_SEL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV177TFBarSerTin_Sel, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSERTIN", GXutil.rtrim( AV176TFBarSerTin));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARSERTIN", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV176TFBarSerTin, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLINOM_SEL", GXutil.rtrim( AV174TFCliNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFCLINOM_SEL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV174TFCliNom_Sel, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLINOM", GXutil.rtrim( AV173TFCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFCLINOM", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV173TFCliNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV171TFCliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFCLICOD_TO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV171TFCliCod_To), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLICOD", GXutil.ltrim( localUtil.ntoc( AV170TFCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFCLICOD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV170TFCliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARAGRLOT_SEL", GXutil.rtrim( AV210TFBarAgrLot_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARAGRLOT_SEL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV210TFBarAgrLot_Sel, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARAGRLOT", GXutil.rtrim( AV209TFBarAgrLot));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARAGRLOT", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV209TFBarAgrLot, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNHDR_LCONTI_SEL", GXutil.rtrim( AV232TFBarnhdr_lconti_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARNHDR_LCONTI_SEL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV232TFBarnhdr_lconti_Sel, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNHDR_LCONTI", GXutil.rtrim( AV231TFBarnhdr_lconti));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARNHDR_LCONTI", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV231TFBarnhdr_lconti, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFESTTINNR_TO", GXutil.ltrim( localUtil.ntoc( AV161TFEstTinNr_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFESTTINNR_TO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV161TFEstTinNr_To), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFESTTINNR", GXutil.ltrim( localUtil.ntoc( AV160TFEstTinNr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFESTTINNR", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV160TFEstTinNr), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFESTFECCIER_TO", localUtil.dtoc( AV156TFEstFecCier_To, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFESTFECCIER_TO", getSecureSignedToken( sPrefix, AV156TFEstFecCier_To));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFESTFECCIER", localUtil.dtoc( AV155TFEstFecCier, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFESTFECCIER", getSecureSignedToken( sPrefix, AV155TFEstFecCier));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vNUM_T", GXutil.ltrim( localUtil.ntoc( AV106num_t, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vNUM_T", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV106num_t), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCOSPD", GXutil.ltrim( localUtil.ntoc( A3654BarCosPD, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCOSPA", GXutil.ltrim( localUtil.ntoc( A3658BarCosPA, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCOSCOL", GXutil.ltrim( localUtil.ntoc( A3705BarCosCol, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCOSAD", GXutil.ltrim( localUtil.ntoc( A3656BarCosAD, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCOSAA", GXutil.ltrim( localUtil.ntoc( A3657BarCosAA, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCOSANC", GXutil.ltrim( localUtil.ntoc( A3706BarCosAnc, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV139GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV139GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCODTIN", GXutil.ltrim( localUtil.ntoc( A1933BarCodTin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARREOTIN", GXutil.ltrim( localUtil.ntoc( A1934BarReoTin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARPARTIN", GXutil.rtrim( A1935BarParTin));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includesortasc", GXutil.rtrim( Ddo_grid_Includesortasc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Fixable", GXutil.rtrim( Ddo_grid_Fixable));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
   }

   public void renderHtmlCloseFormT92( )
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
      return "WCHistoricoRecetasLconti" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " LCONTI", "") ;
   }

   public void wbT90( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.wchistoricorecetaslconti");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
            httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCHistoricoRecetasLconti.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCHistoricoRecetasLconti.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCHistoricoRecetasLconti.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_23_T92( true) ;
      }
      else
      {
         wb_table1_23_T92( false) ;
      }
      return  ;
   }

   public void wb_table1_23_T92e( boolean wbgen )
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
         startgridcontrol41( ) ;
      }
      if ( wbEnd == 41 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_41 = (int)(nGXsfl_41_idx-1) ;
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row Invisible", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table2_72_T92( true) ;
      }
      else
      {
         wb_table2_72_T92( false) ;
      }
      return  ;
   }

   public void wb_table2_72_T92e( boolean wbgen )
   {
      if ( wbgen )
      {
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
         ucGridpaginationbar.setProperty("CurrentPage", AV165GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV166GridPageCount);
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"W0111"+"", GXutil.rtrim( WebComp_Grid_dwc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+sPrefix+"gxHTMLWrpW0111"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_41_Refreshing )
            {
               if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldGrid_dwc), GXutil.lower( WebComp_Grid_dwc_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp(sPrefix+"gxHTMLWrpW0111"+"");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV235Pgmname), GXutil.rtrim( localUtil.format( AV235Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WCHistoricoRecetasLconti.htm");
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
         ucDdo_grid.setProperty("Fixable", Ddo_grid_Fixable);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV163DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV163DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV148ColumnsSelector);
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
      if ( wbEnd == 41 )
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

   public void startT92( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( " LCONTI", ""), (short)(0)) ;
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
            strupT90( ) ;
         }
      }
   }

   public void wsT92( )
   {
      startT92( ) ;
      evtT92( ) ;
   }

   public void evtT92( )
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
                              strupT90( ) ;
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
                              strupT90( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e11T92 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupT90( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e12T92 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupT90( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e13T92 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupT90( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e14T92 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupT90( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e15T92 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupT90( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e16T92 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupT90( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e17T92 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupT90( ) ;
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
                              strupT90( ) ;
                           }
                           nGXsfl_41_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_412( ) ;
                           AV230DetailWebComponent = httpContext.cgiGet( edtavDetailwebcomponent_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDetailwebcomponent_Internalname, AV230DetailWebComponent);
                           A13759EstFecCier = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtEstFecCier_Internalname), 0)) ;
                           A1929EstTinNr = (short)(localUtil.ctol( httpContext.cgiGet( edtEstTinNr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A13841Barnhdr_lc = httpContext.cgiGet( edtBarnhdr_lc_Internalname) ;
                           A2316BarAgrLot = httpContext.cgiGet( edtBarAgrLot_Internalname) ;
                           n2316BarAgrLot = false ;
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           A1936BarSerTin = httpContext.cgiGet( edtBarSerTin_Internalname) ;
                           n1936BarSerTin = false ;
                           A1937BarDscTin = httpContext.cgiGet( edtBarDscTin_Internalname) ;
                           n1937BarDscTin = false ;
                           A1940BarColNoT = httpContext.cgiGet( edtBarColNoT_Internalname) ;
                           n1940BarColNoT = false ;
                           A1941BarColNuT = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNuT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n1941BarColNuT = false ;
                           A1942BarTipCoT = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarTipCoT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n1942BarTipCoT = false ;
                           A1947BarKgmTin = localUtil.ctond( httpContext.cgiGet( edtBarKgmTin_Internalname)) ;
                           n1947BarKgmTin = false ;
                           A8563BarKgsTt = localUtil.ctond( httpContext.cgiGet( edtBarKgsTt_Internalname)) ;
                           n8563BarKgsTt = false ;
                           A1948BarMtrTin = localUtil.ctond( httpContext.cgiGet( edtBarMtrTin_Internalname)) ;
                           n1948BarMtrTin = false ;
                           A12993BarMtsTt = localUtil.ctond( httpContext.cgiGet( edtBarMtsTt_Internalname)) ;
                           n12993BarMtsTt = false ;
                           A1945BarMaqTin = httpContext.cgiGet( edtBarMaqTin_Internalname) ;
                           n1945BarMaqTin = false ;
                           A1946BarVolTin = (int)(localUtil.ctol( httpContext.cgiGet( edtBarVolTin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n1946BarVolTin = false ;
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavFornumarc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavFornumarc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFORNUMARC");
                              GX_FocusControl = edtavFornumarc_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV65ForNumArc = 0 ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavFornumarc_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65ForNumArc), 8, 0));
                           }
                           else
                           {
                              AV65ForNumArc = (int)(localUtil.ctol( httpContext.cgiGet( edtavFornumarc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavFornumarc_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65ForNumArc), 8, 0));
                           }
                           A11762BarDispCli = httpContext.cgiGet( edtBarDispCli_Internalname) ;
                           n11762BarDispCli = false ;
                           A3650BarNumAna = (short)(localUtil.ctol( httpContext.cgiGet( edtBarNumAna_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n3650BarNumAna = false ;
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCostesi_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCostesi_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCOSTESI");
                              GX_FocusControl = edtavCostesi_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV45CostesI = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostesi_Internalname, GXutil.ltrimstr( AV45CostesI, 11, 5));
                           }
                           else
                           {
                              AV45CostesI = localUtil.ctond( httpContext.cgiGet( edtavCostesi_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostesi_Internalname, GXutil.ltrimstr( AV45CostesI, 11, 5));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCostesa_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCostesa_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCOSTESA");
                              GX_FocusControl = edtavCostesa_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV44CostesA = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostesa_Internalname, GXutil.ltrimstr( AV44CostesA, 11, 5));
                           }
                           else
                           {
                              AV44CostesA = localUtil.ctond( httpContext.cgiGet( edtavCostesa_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostesa_Internalname, GXutil.ltrimstr( AV44CostesA, 11, 5));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCostekg_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCostekg_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCOSTEKG");
                              GX_FocusControl = edtavCostekg_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV41CosteKg = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostekg_Internalname, GXutil.ltrimstr( AV41CosteKg, 11, 5));
                           }
                           else
                           {
                              AV41CosteKg = localUtil.ctond( httpContext.cgiGet( edtavCostekg_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostekg_Internalname, GXutil.ltrimstr( AV41CosteKg, 11, 5));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCostemt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCostemt_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCOSTEMT");
                              GX_FocusControl = edtavCostemt_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV42CosteMT = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostemt_Internalname, GXutil.ltrimstr( AV42CosteMT, 11, 5));
                           }
                           else
                           {
                              AV42CosteMT = localUtil.ctond( httpContext.cgiGet( edtavCostemt_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostemt_Internalname, GXutil.ltrimstr( AV42CosteMT, 11, 5));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCOD");
                              GX_FocusControl = edtavBarcod_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV10BarCod = 0 ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarcod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10BarCod), 8, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARCOD"+"_"+sGXsfl_41_idx, getSecureSignedToken( sPrefix+sGXsfl_41_idx, localUtil.format( DecimalUtil.doubleToDec(AV10BarCod), "ZZZZZZZ9")));
                           }
                           else
                           {
                              AV10BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarcod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10BarCod), 8, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARCOD"+"_"+sGXsfl_41_idx, getSecureSignedToken( sPrefix+sGXsfl_41_idx, localUtil.format( DecimalUtil.doubleToDec(AV10BarCod), "ZZZZZZZ9")));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCODREO");
                              GX_FocusControl = edtavBarcodreo_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV14BarCodReo = (byte)(0) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarcodreo_Internalname, GXutil.str( AV14BarCodReo, 1, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARCODREO"+"_"+sGXsfl_41_idx, getSecureSignedToken( sPrefix+sGXsfl_41_idx, localUtil.format( DecimalUtil.doubleToDec(AV14BarCodReo), "9")));
                           }
                           else
                           {
                              AV14BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarcodreo_Internalname, GXutil.str( AV14BarCodReo, 1, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARCODREO"+"_"+sGXsfl_41_idx, getSecureSignedToken( sPrefix+sGXsfl_41_idx, localUtil.format( DecimalUtil.doubleToDec(AV14BarCodReo), "9")));
                           }
                           AV12BarCodPar = httpContext.cgiGet( edtavBarcodpar_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarcodpar_Internalname, AV12BarCodPar);
                           app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARCODPAR"+"_"+sGXsfl_41_idx, getSecureSignedToken( sPrefix+sGXsfl_41_idx, GXutil.rtrim( localUtil.format( AV12BarCodPar, ""))));
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
                                       e18T92 ();
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
                                       e19T92 ();
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
                                       e20T92 ();
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
                                          if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV228FilterFullText) != 0 )
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
                                    strupT90( ) ;
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
                     if ( nCmpId == 111 )
                     {
                        OldGrid_dwc = httpContext.cgiGet( sPrefix+"W0111") ;
                        if ( ( GXutil.len( OldGrid_dwc) == 0 ) || ( GXutil.strcmp(OldGrid_dwc, WebComp_Grid_dwc_Component) != 0 ) )
                        {
                           WebComp_Grid_dwc = WebUtils.getWebComponent(getClass(), "app." + OldGrid_dwc + "_impl", remoteHandle, context);
                           WebComp_Grid_dwc_Component = OldGrid_dwc ;
                        }
                        if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
                        {
                           WebComp_Grid_dwc.componentprocess(sPrefix+"W0111", "", sEvt);
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

   public void weT92( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseFormT92( ) ;
         }
      }
   }

   public void paT92( )
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
      subsflControlProps_412( ) ;
      while ( nGXsfl_41_idx <= nRC_GXsfl_41 )
      {
         sendrow_412( ) ;
         nGXsfl_41_idx = ((subGrid_Islastpage==1)&&(nGXsfl_41_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_41_idx+1) ;
         sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_412( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV228FilterFullText ,
                                 String AV54EmprCod ,
                                 java.util.Date AV60Fec1 ,
                                 java.util.Date AV62Fec3 ,
                                 int AV111PCliCod ,
                                 int AV34CliCodP ,
                                 int AV108PBarCod ,
                                 int AV11BarCodP ,
                                 byte AV110PBarCodReo ,
                                 byte AV15BarCodReoP ,
                                 String AV109PBarCodPar ,
                                 String AV13BarCodParP ,
                                 String AV114PSerie ,
                                 String AV118SerieP ,
                                 String AV113PColor ,
                                 String AV37ColorP ,
                                 int AV112PColNum ,
                                 int AV36ColNumP ,
                                 String AV51DispCli1 ,
                                 String AV53DispCli3 ,
                                 String AV72HreRacab ,
                                 String AV97MaqCodi ,
                                 String AV95maqcod3 ,
                                 byte AV153ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV148ColumnsSelector ,
                                 String AV235Pgmname ,
                                 short AV141OrderedBy ,
                                 boolean AV142OrderedDsc ,
                                 java.math.BigDecimal AV220TotBarKgmTin ,
                                 java.math.BigDecimal AV222TotBarMtrTin ,
                                 short AV216TFBarNumAna_To ,
                                 short AV215TFBarNumAna ,
                                 String AV219TFBarDispCli_Sel ,
                                 String AV218TFBarDispCli ,
                                 int AV207TFBarVolTin_To ,
                                 int AV206TFBarVolTin ,
                                 String AV204TFBarMaqTin_Sel ,
                                 String AV203TFBarMaqTin ,
                                 java.math.BigDecimal AV201TFBarMtsTt_To ,
                                 java.math.BigDecimal AV200TFBarMtsTt ,
                                 java.math.BigDecimal AV198TFBarMtrTin_To ,
                                 java.math.BigDecimal AV197TFBarMtrTin ,
                                 java.math.BigDecimal AV195TFBarKgsTt_To ,
                                 java.math.BigDecimal AV194TFBarKgsTt ,
                                 java.math.BigDecimal AV192TFBarKgmTin_To ,
                                 java.math.BigDecimal AV191TFBarKgmTin ,
                                 byte AV189TFBarTipCoT_To ,
                                 byte AV188TFBarTipCoT ,
                                 int AV186TFBarColNuT_To ,
                                 int AV185TFBarColNuT ,
                                 String AV183TFBarColNoT_Sel ,
                                 String AV182TFBarColNoT ,
                                 String AV180TFBarDscTin_Sel ,
                                 String AV179TFBarDscTin ,
                                 String AV177TFBarSerTin_Sel ,
                                 String AV176TFBarSerTin ,
                                 String AV174TFCliNom_Sel ,
                                 String AV173TFCliNom ,
                                 int AV171TFCliCod_To ,
                                 int AV170TFCliCod ,
                                 String AV210TFBarAgrLot_Sel ,
                                 String AV209TFBarAgrLot ,
                                 String AV232TFBarnhdr_lconti_Sel ,
                                 String AV231TFBarnhdr_lconti ,
                                 short AV161TFEstTinNr_To ,
                                 short AV160TFEstTinNr ,
                                 java.util.Date AV156TFEstFecCier_To ,
                                 java.util.Date AV155TFEstFecCier ,
                                 int AV106num_t ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e19T92 ();
      GRID_nCurrentRecord = 0 ;
      rfT92( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"WCHistoricoRecetasLconti");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV235Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("wchistoricorecetaslconti:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARCOD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV10BarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOD", GXutil.ltrim( localUtil.ntoc( AV10BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARCODREO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV14BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV14BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARCODPAR", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV12BarCodPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODPAR", GXutil.rtrim( AV12BarCodPar));
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
      rfT92( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV235Pgmname = "WCHistoricoRecetasLconti" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV235Pgmname", AV235Pgmname);
      Gx_err = (short)(0) ;
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavFornumarc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFornumarc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFornumarc_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesi_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesa_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostekg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostekg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostekg_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostemt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostemt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostemt_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavBarcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcod_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavBarcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodreo_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavBarcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodpar_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavTotvaluebarkgmtin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluebarkgmtin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebarkgmtin_Enabled), 5, 0), true);
      edtavTotvaluebarmtrtin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluebarmtrtin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebarmtrtin_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rfT92( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(41) ;
      /* Execute user event: Refresh */
      e19T92 ();
      nGXsfl_41_idx = 1 ;
      sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_412( ) ;
      bGXsfl_41_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith");
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
         subsflControlProps_412( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV236Wchistoricorecetaslcontids_1_filterfulltext ,
                                              Short.valueOf(A1929EstTinNr) ,
                                              Integer.valueOf(A1933BarCodTin) ,
                                              Byte.valueOf(A1934BarReoTin) ,
                                              A1935BarParTin ,
                                              A2316BarAgrLot ,
                                              Integer.valueOf(A252CliCod) ,
                                              A279CliNom ,
                                              A1936BarSerTin ,
                                              A1937BarDscTin ,
                                              A1940BarColNoT ,
                                              Integer.valueOf(A1941BarColNuT) ,
                                              Byte.valueOf(A1942BarTipCoT) ,
                                              A1947BarKgmTin ,
                                              A8563BarKgsTt ,
                                              A1948BarMtrTin ,
                                              A12993BarMtsTt ,
                                              A1945BarMaqTin ,
                                              Integer.valueOf(A1946BarVolTin) ,
                                              A11762BarDispCli ,
                                              Short.valueOf(A3650BarNumAna) ,
                                              Short.valueOf(AV141OrderedBy) ,
                                              Boolean.valueOf(AV142OrderedDsc) ,
                                              A13759EstFecCier ,
                                              AV60Fec1 ,
                                              AV62Fec3 ,
                                              Integer.valueOf(AV111PCliCod) ,
                                              Integer.valueOf(AV34CliCodP) ,
                                              Integer.valueOf(AV108PBarCod) ,
                                              Integer.valueOf(AV11BarCodP) ,
                                              Byte.valueOf(AV110PBarCodReo) ,
                                              Byte.valueOf(AV15BarCodReoP) ,
                                              AV109PBarCodPar ,
                                              AV13BarCodParP ,
                                              AV114PSerie ,
                                              AV118SerieP ,
                                              AV113PColor ,
                                              AV37ColorP ,
                                              Integer.valueOf(AV112PColNum) ,
                                              Integer.valueOf(AV36ColNumP) ,
                                              AV51DispCli1 ,
                                              AV53DispCli3 ,
                                              A6634BarRecAcb ,
                                              AV72HreRacab ,
                                              AV97MaqCodi ,
                                              AV95maqcod3 ,
                                              AV54EmprCod ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                              TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                              TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                              TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
         lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
         lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
         lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
         lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
         lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
         lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
         lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
         lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
         lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
         lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
         lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
         lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
         lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
         lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
         lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
         lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
         lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
         /* Using cursor H00T92 */
         pr_default.execute(0, new Object[] {AV54EmprCod, AV60Fec1, AV62Fec3, Integer.valueOf(AV111PCliCod), Integer.valueOf(AV34CliCodP), Integer.valueOf(AV108PBarCod), Integer.valueOf(AV11BarCodP), Byte.valueOf(AV110PBarCodReo), Byte.valueOf(AV15BarCodReoP), AV109PBarCodPar, AV13BarCodParP, AV114PSerie, AV118SerieP, AV113PColor, AV37ColorP, Integer.valueOf(AV112PColNum), Integer.valueOf(AV36ColNumP), AV51DispCli1, AV53DispCli3, AV72HreRacab, AV72HreRacab, AV97MaqCodi, AV95maqcod3, lV236Wchistoricorecetaslcontids_1_filterfulltext, lV236Wchistoricorecetaslcontids_1_filterfulltext, lV236Wchistoricorecetaslcontids_1_filterfulltext, lV236Wchistoricorecetaslcontids_1_filterfulltext, lV236Wchistoricorecetaslcontids_1_filterfulltext, lV236Wchistoricorecetaslcontids_1_filterfulltext, lV236Wchistoricorecetaslcontids_1_filterfulltext, lV236Wchistoricorecetaslcontids_1_filterfulltext, lV236Wchistoricorecetaslcontids_1_filterfulltext, lV236Wchistoricorecetaslcontids_1_filterfulltext, lV236Wchistoricorecetaslcontids_1_filterfulltext, lV236Wchistoricorecetaslcontids_1_filterfulltext, lV236Wchistoricorecetaslcontids_1_filterfulltext, lV236Wchistoricorecetaslcontids_1_filterfulltext, lV236Wchistoricorecetaslcontids_1_filterfulltext, lV236Wchistoricorecetaslcontids_1_filterfulltext, lV236Wchistoricorecetaslcontids_1_filterfulltext, lV236Wchistoricorecetaslcontids_1_filterfulltext, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_41_idx = 1 ;
         sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_412( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A6634BarRecAcb = H00T92_A6634BarRecAcb[0] ;
            n6634BarRecAcb = H00T92_n6634BarRecAcb[0] ;
            A396EmprCod = H00T92_A396EmprCod[0] ;
            A3705BarCosCol = H00T92_A3705BarCosCol[0] ;
            n3705BarCosCol = H00T92_n3705BarCosCol[0] ;
            A3658BarCosPA = H00T92_A3658BarCosPA[0] ;
            n3658BarCosPA = H00T92_n3658BarCosPA[0] ;
            A3654BarCosPD = H00T92_A3654BarCosPD[0] ;
            n3654BarCosPD = H00T92_n3654BarCosPD[0] ;
            A3706BarCosAnc = H00T92_A3706BarCosAnc[0] ;
            n3706BarCosAnc = H00T92_n3706BarCosAnc[0] ;
            A3657BarCosAA = H00T92_A3657BarCosAA[0] ;
            n3657BarCosAA = H00T92_n3657BarCosAA[0] ;
            A3656BarCosAD = H00T92_A3656BarCosAD[0] ;
            n3656BarCosAD = H00T92_n3656BarCosAD[0] ;
            A3650BarNumAna = H00T92_A3650BarNumAna[0] ;
            n3650BarNumAna = H00T92_n3650BarNumAna[0] ;
            A11762BarDispCli = H00T92_A11762BarDispCli[0] ;
            n11762BarDispCli = H00T92_n11762BarDispCli[0] ;
            A1946BarVolTin = H00T92_A1946BarVolTin[0] ;
            n1946BarVolTin = H00T92_n1946BarVolTin[0] ;
            A1945BarMaqTin = H00T92_A1945BarMaqTin[0] ;
            n1945BarMaqTin = H00T92_n1945BarMaqTin[0] ;
            A12993BarMtsTt = H00T92_A12993BarMtsTt[0] ;
            n12993BarMtsTt = H00T92_n12993BarMtsTt[0] ;
            A1948BarMtrTin = H00T92_A1948BarMtrTin[0] ;
            n1948BarMtrTin = H00T92_n1948BarMtrTin[0] ;
            A8563BarKgsTt = H00T92_A8563BarKgsTt[0] ;
            n8563BarKgsTt = H00T92_n8563BarKgsTt[0] ;
            A1947BarKgmTin = H00T92_A1947BarKgmTin[0] ;
            n1947BarKgmTin = H00T92_n1947BarKgmTin[0] ;
            A1942BarTipCoT = H00T92_A1942BarTipCoT[0] ;
            n1942BarTipCoT = H00T92_n1942BarTipCoT[0] ;
            A1941BarColNuT = H00T92_A1941BarColNuT[0] ;
            n1941BarColNuT = H00T92_n1941BarColNuT[0] ;
            A1940BarColNoT = H00T92_A1940BarColNoT[0] ;
            n1940BarColNoT = H00T92_n1940BarColNoT[0] ;
            A1937BarDscTin = H00T92_A1937BarDscTin[0] ;
            n1937BarDscTin = H00T92_n1937BarDscTin[0] ;
            A1936BarSerTin = H00T92_A1936BarSerTin[0] ;
            n1936BarSerTin = H00T92_n1936BarSerTin[0] ;
            A279CliNom = H00T92_A279CliNom[0] ;
            A252CliCod = H00T92_A252CliCod[0] ;
            A2316BarAgrLot = H00T92_A2316BarAgrLot[0] ;
            n2316BarAgrLot = H00T92_n2316BarAgrLot[0] ;
            A1929EstTinNr = H00T92_A1929EstTinNr[0] ;
            A13759EstFecCier = H00T92_A13759EstFecCier[0] ;
            A1935BarParTin = H00T92_A1935BarParTin[0] ;
            n1935BarParTin = H00T92_n1935BarParTin[0] ;
            A1934BarReoTin = H00T92_A1934BarReoTin[0] ;
            n1934BarReoTin = H00T92_n1934BarReoTin[0] ;
            A1933BarCodTin = H00T92_A1933BarCodTin[0] ;
            n1933BarCodTin = H00T92_n1933BarCodTin[0] ;
            A279CliNom = H00T92_A279CliNom[0] ;
            A13841Barnhdr_lc = GXutil.str( A1933BarCodTin, 8, 0) + "-" + GXutil.str( A1934BarReoTin, 1, 0) + A1935BarParTin ;
            e20T92 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(41) ;
         wbT90( ) ;
      }
      bGXsfl_41_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesT92( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTBARKGMTIN", GXutil.ltrim( localUtil.ntoc( AV220TotBarKgmTin, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARKGMTIN", getSecureSignedToken( sPrefix, localUtil.format( AV220TotBarKgmTin, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTBARMTRTIN", GXutil.ltrim( localUtil.ntoc( AV222TotBarMtrTin, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARMTRTIN", getSecureSignedToken( sPrefix, localUtil.format( AV222TotBarMtrTin, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNUMANA_TO", GXutil.ltrim( localUtil.ntoc( AV216TFBarNumAna_To, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARNUMANA_TO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV216TFBarNumAna_To), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNUMANA", GXutil.ltrim( localUtil.ntoc( AV215TFBarNumAna, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARNUMANA", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV215TFBarNumAna), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARDISPCLI_SEL", GXutil.rtrim( AV219TFBarDispCli_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARDISPCLI_SEL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV219TFBarDispCli_Sel, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARDISPCLI", GXutil.rtrim( AV218TFBarDispCli));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARDISPCLI", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV218TFBarDispCli, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARVOLTIN_TO", GXutil.ltrim( localUtil.ntoc( AV207TFBarVolTin_To, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARVOLTIN_TO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV207TFBarVolTin_To), "ZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARVOLTIN", GXutil.ltrim( localUtil.ntoc( AV206TFBarVolTin, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARVOLTIN", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV206TFBarVolTin), "ZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARMAQTIN_SEL", GXutil.rtrim( AV204TFBarMaqTin_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARMAQTIN_SEL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV204TFBarMaqTin_Sel, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARMAQTIN", GXutil.rtrim( AV203TFBarMaqTin));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARMAQTIN", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV203TFBarMaqTin, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARMTSTT_TO", GXutil.ltrim( localUtil.ntoc( AV201TFBarMtsTt_To, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARMTSTT_TO", getSecureSignedToken( sPrefix, localUtil.format( AV201TFBarMtsTt_To, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARMTSTT", GXutil.ltrim( localUtil.ntoc( AV200TFBarMtsTt, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARMTSTT", getSecureSignedToken( sPrefix, localUtil.format( AV200TFBarMtsTt, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARMTRTIN_TO", GXutil.ltrim( localUtil.ntoc( AV198TFBarMtrTin_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARMTRTIN_TO", getSecureSignedToken( sPrefix, localUtil.format( AV198TFBarMtrTin_To, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARMTRTIN", GXutil.ltrim( localUtil.ntoc( AV197TFBarMtrTin, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARMTRTIN", getSecureSignedToken( sPrefix, localUtil.format( AV197TFBarMtrTin, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARKGSTT_TO", GXutil.ltrim( localUtil.ntoc( AV195TFBarKgsTt_To, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARKGSTT_TO", getSecureSignedToken( sPrefix, localUtil.format( AV195TFBarKgsTt_To, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARKGSTT", GXutil.ltrim( localUtil.ntoc( AV194TFBarKgsTt, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARKGSTT", getSecureSignedToken( sPrefix, localUtil.format( AV194TFBarKgsTt, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARKGMTIN_TO", GXutil.ltrim( localUtil.ntoc( AV192TFBarKgmTin_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARKGMTIN_TO", getSecureSignedToken( sPrefix, localUtil.format( AV192TFBarKgmTin_To, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARKGMTIN", GXutil.ltrim( localUtil.ntoc( AV191TFBarKgmTin, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARKGMTIN", getSecureSignedToken( sPrefix, localUtil.format( AV191TFBarKgmTin, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARTIPCOT_TO", GXutil.ltrim( localUtil.ntoc( AV189TFBarTipCoT_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARTIPCOT_TO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV189TFBarTipCoT_To), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARTIPCOT", GXutil.ltrim( localUtil.ntoc( AV188TFBarTipCoT, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARTIPCOT", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV188TFBarTipCoT), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNUT_TO", GXutil.ltrim( localUtil.ntoc( AV186TFBarColNuT_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARCOLNUT_TO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV186TFBarColNuT_To), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNUT", GXutil.ltrim( localUtil.ntoc( AV185TFBarColNuT, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARCOLNUT", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV185TFBarColNuT), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNOT_SEL", GXutil.rtrim( AV183TFBarColNoT_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARCOLNOT_SEL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV183TFBarColNoT_Sel, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNOT", GXutil.rtrim( AV182TFBarColNoT));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARCOLNOT", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV182TFBarColNoT, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARDSCTIN_SEL", GXutil.rtrim( AV180TFBarDscTin_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARDSCTIN_SEL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV180TFBarDscTin_Sel, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARDSCTIN", GXutil.rtrim( AV179TFBarDscTin));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARDSCTIN", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV179TFBarDscTin, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSERTIN_SEL", GXutil.rtrim( AV177TFBarSerTin_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARSERTIN_SEL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV177TFBarSerTin_Sel, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSERTIN", GXutil.rtrim( AV176TFBarSerTin));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARSERTIN", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV176TFBarSerTin, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLINOM_SEL", GXutil.rtrim( AV174TFCliNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFCLINOM_SEL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV174TFCliNom_Sel, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLINOM", GXutil.rtrim( AV173TFCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFCLINOM", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV173TFCliNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV171TFCliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFCLICOD_TO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV171TFCliCod_To), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLICOD", GXutil.ltrim( localUtil.ntoc( AV170TFCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFCLICOD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV170TFCliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARAGRLOT_SEL", GXutil.rtrim( AV210TFBarAgrLot_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARAGRLOT_SEL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV210TFBarAgrLot_Sel, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARAGRLOT", GXutil.rtrim( AV209TFBarAgrLot));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARAGRLOT", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV209TFBarAgrLot, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNHDR_LCONTI_SEL", GXutil.rtrim( AV232TFBarnhdr_lconti_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARNHDR_LCONTI_SEL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV232TFBarnhdr_lconti_Sel, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNHDR_LCONTI", GXutil.rtrim( AV231TFBarnhdr_lconti));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARNHDR_LCONTI", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV231TFBarnhdr_lconti, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFESTTINNR_TO", GXutil.ltrim( localUtil.ntoc( AV161TFEstTinNr_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFESTTINNR_TO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV161TFEstTinNr_To), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFESTTINNR", GXutil.ltrim( localUtil.ntoc( AV160TFEstTinNr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFESTTINNR", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV160TFEstTinNr), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFESTFECCIER_TO", localUtil.dtoc( AV156TFEstFecCier_To, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFESTFECCIER_TO", getSecureSignedToken( sPrefix, AV156TFEstFecCier_To));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFESTFECCIER", localUtil.dtoc( AV155TFEstFecCier, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFESTFECCIER", getSecureSignedToken( sPrefix, AV155TFEstFecCier));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vNUM_T", GXutil.ltrim( localUtil.ntoc( AV106num_t, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vNUM_T", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV106num_t), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARCOD"+"_"+sGXsfl_41_idx, getSecureSignedToken( sPrefix+sGXsfl_41_idx, localUtil.format( DecimalUtil.doubleToDec(AV10BarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARCODREO"+"_"+sGXsfl_41_idx, getSecureSignedToken( sPrefix+sGXsfl_41_idx, localUtil.format( DecimalUtil.doubleToDec(AV14BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARCODPAR"+"_"+sGXsfl_41_idx, getSecureSignedToken( sPrefix+sGXsfl_41_idx, GXutil.rtrim( localUtil.format( AV12BarCodPar, ""))));
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
      AV236Wchistoricorecetaslcontids_1_filterfulltext = AV228FilterFullText ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV236Wchistoricorecetaslcontids_1_filterfulltext ,
                                           Short.valueOf(A1929EstTinNr) ,
                                           Integer.valueOf(A1933BarCodTin) ,
                                           Byte.valueOf(A1934BarReoTin) ,
                                           A1935BarParTin ,
                                           A2316BarAgrLot ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A1936BarSerTin ,
                                           A1937BarDscTin ,
                                           A1940BarColNoT ,
                                           Integer.valueOf(A1941BarColNuT) ,
                                           Byte.valueOf(A1942BarTipCoT) ,
                                           A1947BarKgmTin ,
                                           A8563BarKgsTt ,
                                           A1948BarMtrTin ,
                                           A12993BarMtsTt ,
                                           A1945BarMaqTin ,
                                           Integer.valueOf(A1946BarVolTin) ,
                                           A11762BarDispCli ,
                                           Short.valueOf(A3650BarNumAna) ,
                                           Short.valueOf(AV141OrderedBy) ,
                                           Boolean.valueOf(AV142OrderedDsc) ,
                                           A13759EstFecCier ,
                                           AV60Fec1 ,
                                           AV62Fec3 ,
                                           Integer.valueOf(AV111PCliCod) ,
                                           Integer.valueOf(AV34CliCodP) ,
                                           Integer.valueOf(AV108PBarCod) ,
                                           Integer.valueOf(AV11BarCodP) ,
                                           Byte.valueOf(AV110PBarCodReo) ,
                                           Byte.valueOf(AV15BarCodReoP) ,
                                           AV109PBarCodPar ,
                                           AV13BarCodParP ,
                                           AV114PSerie ,
                                           AV118SerieP ,
                                           AV113PColor ,
                                           AV37ColorP ,
                                           Integer.valueOf(AV112PColNum) ,
                                           Integer.valueOf(AV36ColNumP) ,
                                           AV51DispCli1 ,
                                           AV53DispCli3 ,
                                           A6634BarRecAcb ,
                                           AV72HreRacab ,
                                           AV97MaqCodi ,
                                           AV95maqcod3 ,
                                           AV54EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      /* Using cursor H00T93 */
      pr_default.execute(1, new Object[] {AV54EmprCod, AV60Fec1, AV62Fec3, Integer.valueOf(AV111PCliCod), Integer.valueOf(AV34CliCodP), Integer.valueOf(AV108PBarCod), Integer.valueOf(AV11BarCodP), Byte.valueOf(AV110PBarCodReo), Byte.valueOf(AV15BarCodReoP), AV109PBarCodPar, AV13BarCodParP, AV114PSerie, AV118SerieP, AV113PColor, AV37ColorP, Integer.valueOf(AV112PColNum), Integer.valueOf(AV36ColNumP), AV51DispCli1, AV53DispCli3, AV72HreRacab, AV72HreRacab, AV97MaqCodi, AV95maqcod3, AV72HreRacab, AV72HreRacab, lV236Wchistoricorecetaslcontids_1_filterfulltext, lV236Wchistoricorecetaslcontids_1_filterfulltext, lV236Wchistoricorecetaslcontids_1_filterfulltext, lV236Wchistoricorecetaslcontids_1_filterfulltext, lV236Wchistoricorecetaslcontids_1_filterfulltext, lV236Wchistoricorecetaslcontids_1_filterfulltext, lV236Wchistoricorecetaslcontids_1_filterfulltext, lV236Wchistoricorecetaslcontids_1_filterfulltext, lV236Wchistoricorecetaslcontids_1_filterfulltext, lV236Wchistoricorecetaslcontids_1_filterfulltext, lV236Wchistoricorecetaslcontids_1_filterfulltext, lV236Wchistoricorecetaslcontids_1_filterfulltext, lV236Wchistoricorecetaslcontids_1_filterfulltext, lV236Wchistoricorecetaslcontids_1_filterfulltext, lV236Wchistoricorecetaslcontids_1_filterfulltext, lV236Wchistoricorecetaslcontids_1_filterfulltext, lV236Wchistoricorecetaslcontids_1_filterfulltext, lV236Wchistoricorecetaslcontids_1_filterfulltext});
      GRID_nRecordCount = H00T93_AGRID_nRecordCount[0] ;
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
      AV236Wchistoricorecetaslcontids_1_filterfulltext = AV228FilterFullText ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV228FilterFullText, AV54EmprCod, AV60Fec1, AV62Fec3, AV111PCliCod, AV34CliCodP, AV108PBarCod, AV11BarCodP, AV110PBarCodReo, AV15BarCodReoP, AV109PBarCodPar, AV13BarCodParP, AV114PSerie, AV118SerieP, AV113PColor, AV37ColorP, AV112PColNum, AV36ColNumP, AV51DispCli1, AV53DispCli3, AV72HreRacab, AV97MaqCodi, AV95maqcod3, AV153ManageFiltersExecutionStep, AV148ColumnsSelector, AV235Pgmname, AV141OrderedBy, AV142OrderedDsc, AV220TotBarKgmTin, AV222TotBarMtrTin, AV216TFBarNumAna_To, AV215TFBarNumAna, AV219TFBarDispCli_Sel, AV218TFBarDispCli, AV207TFBarVolTin_To, AV206TFBarVolTin, AV204TFBarMaqTin_Sel, AV203TFBarMaqTin, AV201TFBarMtsTt_To, AV200TFBarMtsTt, AV198TFBarMtrTin_To, AV197TFBarMtrTin, AV195TFBarKgsTt_To, AV194TFBarKgsTt, AV192TFBarKgmTin_To, AV191TFBarKgmTin, AV189TFBarTipCoT_To, AV188TFBarTipCoT, AV186TFBarColNuT_To, AV185TFBarColNuT, AV183TFBarColNoT_Sel, AV182TFBarColNoT, AV180TFBarDscTin_Sel, AV179TFBarDscTin, AV177TFBarSerTin_Sel, AV176TFBarSerTin, AV174TFCliNom_Sel, AV173TFCliNom, AV171TFCliCod_To, AV170TFCliCod, AV210TFBarAgrLot_Sel, AV209TFBarAgrLot, AV232TFBarnhdr_lconti_Sel, AV231TFBarnhdr_lconti, AV161TFEstTinNr_To, AV160TFEstTinNr, AV156TFEstFecCier_To, AV155TFEstFecCier, AV106num_t, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV236Wchistoricorecetaslcontids_1_filterfulltext = AV228FilterFullText ;
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
         gxgrgrid_refresh( subGrid_Rows, AV228FilterFullText, AV54EmprCod, AV60Fec1, AV62Fec3, AV111PCliCod, AV34CliCodP, AV108PBarCod, AV11BarCodP, AV110PBarCodReo, AV15BarCodReoP, AV109PBarCodPar, AV13BarCodParP, AV114PSerie, AV118SerieP, AV113PColor, AV37ColorP, AV112PColNum, AV36ColNumP, AV51DispCli1, AV53DispCli3, AV72HreRacab, AV97MaqCodi, AV95maqcod3, AV153ManageFiltersExecutionStep, AV148ColumnsSelector, AV235Pgmname, AV141OrderedBy, AV142OrderedDsc, AV220TotBarKgmTin, AV222TotBarMtrTin, AV216TFBarNumAna_To, AV215TFBarNumAna, AV219TFBarDispCli_Sel, AV218TFBarDispCli, AV207TFBarVolTin_To, AV206TFBarVolTin, AV204TFBarMaqTin_Sel, AV203TFBarMaqTin, AV201TFBarMtsTt_To, AV200TFBarMtsTt, AV198TFBarMtrTin_To, AV197TFBarMtrTin, AV195TFBarKgsTt_To, AV194TFBarKgsTt, AV192TFBarKgmTin_To, AV191TFBarKgmTin, AV189TFBarTipCoT_To, AV188TFBarTipCoT, AV186TFBarColNuT_To, AV185TFBarColNuT, AV183TFBarColNoT_Sel, AV182TFBarColNoT, AV180TFBarDscTin_Sel, AV179TFBarDscTin, AV177TFBarSerTin_Sel, AV176TFBarSerTin, AV174TFCliNom_Sel, AV173TFCliNom, AV171TFCliCod_To, AV170TFCliCod, AV210TFBarAgrLot_Sel, AV209TFBarAgrLot, AV232TFBarnhdr_lconti_Sel, AV231TFBarnhdr_lconti, AV161TFEstTinNr_To, AV160TFEstTinNr, AV156TFEstFecCier_To, AV155TFEstFecCier, AV106num_t, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV236Wchistoricorecetaslcontids_1_filterfulltext = AV228FilterFullText ;
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
         gxgrgrid_refresh( subGrid_Rows, AV228FilterFullText, AV54EmprCod, AV60Fec1, AV62Fec3, AV111PCliCod, AV34CliCodP, AV108PBarCod, AV11BarCodP, AV110PBarCodReo, AV15BarCodReoP, AV109PBarCodPar, AV13BarCodParP, AV114PSerie, AV118SerieP, AV113PColor, AV37ColorP, AV112PColNum, AV36ColNumP, AV51DispCli1, AV53DispCli3, AV72HreRacab, AV97MaqCodi, AV95maqcod3, AV153ManageFiltersExecutionStep, AV148ColumnsSelector, AV235Pgmname, AV141OrderedBy, AV142OrderedDsc, AV220TotBarKgmTin, AV222TotBarMtrTin, AV216TFBarNumAna_To, AV215TFBarNumAna, AV219TFBarDispCli_Sel, AV218TFBarDispCli, AV207TFBarVolTin_To, AV206TFBarVolTin, AV204TFBarMaqTin_Sel, AV203TFBarMaqTin, AV201TFBarMtsTt_To, AV200TFBarMtsTt, AV198TFBarMtrTin_To, AV197TFBarMtrTin, AV195TFBarKgsTt_To, AV194TFBarKgsTt, AV192TFBarKgmTin_To, AV191TFBarKgmTin, AV189TFBarTipCoT_To, AV188TFBarTipCoT, AV186TFBarColNuT_To, AV185TFBarColNuT, AV183TFBarColNoT_Sel, AV182TFBarColNoT, AV180TFBarDscTin_Sel, AV179TFBarDscTin, AV177TFBarSerTin_Sel, AV176TFBarSerTin, AV174TFCliNom_Sel, AV173TFCliNom, AV171TFCliCod_To, AV170TFCliCod, AV210TFBarAgrLot_Sel, AV209TFBarAgrLot, AV232TFBarnhdr_lconti_Sel, AV231TFBarnhdr_lconti, AV161TFEstTinNr_To, AV160TFEstTinNr, AV156TFEstFecCier_To, AV155TFEstFecCier, AV106num_t, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV236Wchistoricorecetaslcontids_1_filterfulltext = AV228FilterFullText ;
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
         gxgrgrid_refresh( subGrid_Rows, AV228FilterFullText, AV54EmprCod, AV60Fec1, AV62Fec3, AV111PCliCod, AV34CliCodP, AV108PBarCod, AV11BarCodP, AV110PBarCodReo, AV15BarCodReoP, AV109PBarCodPar, AV13BarCodParP, AV114PSerie, AV118SerieP, AV113PColor, AV37ColorP, AV112PColNum, AV36ColNumP, AV51DispCli1, AV53DispCli3, AV72HreRacab, AV97MaqCodi, AV95maqcod3, AV153ManageFiltersExecutionStep, AV148ColumnsSelector, AV235Pgmname, AV141OrderedBy, AV142OrderedDsc, AV220TotBarKgmTin, AV222TotBarMtrTin, AV216TFBarNumAna_To, AV215TFBarNumAna, AV219TFBarDispCli_Sel, AV218TFBarDispCli, AV207TFBarVolTin_To, AV206TFBarVolTin, AV204TFBarMaqTin_Sel, AV203TFBarMaqTin, AV201TFBarMtsTt_To, AV200TFBarMtsTt, AV198TFBarMtrTin_To, AV197TFBarMtrTin, AV195TFBarKgsTt_To, AV194TFBarKgsTt, AV192TFBarKgmTin_To, AV191TFBarKgmTin, AV189TFBarTipCoT_To, AV188TFBarTipCoT, AV186TFBarColNuT_To, AV185TFBarColNuT, AV183TFBarColNoT_Sel, AV182TFBarColNoT, AV180TFBarDscTin_Sel, AV179TFBarDscTin, AV177TFBarSerTin_Sel, AV176TFBarSerTin, AV174TFCliNom_Sel, AV173TFCliNom, AV171TFCliCod_To, AV170TFCliCod, AV210TFBarAgrLot_Sel, AV209TFBarAgrLot, AV232TFBarnhdr_lconti_Sel, AV231TFBarnhdr_lconti, AV161TFEstTinNr_To, AV160TFEstTinNr, AV156TFEstFecCier_To, AV155TFEstFecCier, AV106num_t, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV236Wchistoricorecetaslcontids_1_filterfulltext = AV228FilterFullText ;
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
         gxgrgrid_refresh( subGrid_Rows, AV228FilterFullText, AV54EmprCod, AV60Fec1, AV62Fec3, AV111PCliCod, AV34CliCodP, AV108PBarCod, AV11BarCodP, AV110PBarCodReo, AV15BarCodReoP, AV109PBarCodPar, AV13BarCodParP, AV114PSerie, AV118SerieP, AV113PColor, AV37ColorP, AV112PColNum, AV36ColNumP, AV51DispCli1, AV53DispCli3, AV72HreRacab, AV97MaqCodi, AV95maqcod3, AV153ManageFiltersExecutionStep, AV148ColumnsSelector, AV235Pgmname, AV141OrderedBy, AV142OrderedDsc, AV220TotBarKgmTin, AV222TotBarMtrTin, AV216TFBarNumAna_To, AV215TFBarNumAna, AV219TFBarDispCli_Sel, AV218TFBarDispCli, AV207TFBarVolTin_To, AV206TFBarVolTin, AV204TFBarMaqTin_Sel, AV203TFBarMaqTin, AV201TFBarMtsTt_To, AV200TFBarMtsTt, AV198TFBarMtrTin_To, AV197TFBarMtrTin, AV195TFBarKgsTt_To, AV194TFBarKgsTt, AV192TFBarKgmTin_To, AV191TFBarKgmTin, AV189TFBarTipCoT_To, AV188TFBarTipCoT, AV186TFBarColNuT_To, AV185TFBarColNuT, AV183TFBarColNoT_Sel, AV182TFBarColNoT, AV180TFBarDscTin_Sel, AV179TFBarDscTin, AV177TFBarSerTin_Sel, AV176TFBarSerTin, AV174TFCliNom_Sel, AV173TFCliNom, AV171TFCliCod_To, AV170TFCliCod, AV210TFBarAgrLot_Sel, AV209TFBarAgrLot, AV232TFBarnhdr_lconti_Sel, AV231TFBarnhdr_lconti, AV161TFEstTinNr_To, AV160TFEstTinNr, AV156TFEstFecCier_To, AV155TFEstFecCier, AV106num_t, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV235Pgmname = "WCHistoricoRecetasLconti" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV235Pgmname", AV235Pgmname);
      Gx_err = (short)(0) ;
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavFornumarc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFornumarc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFornumarc_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesi_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesa_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostekg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostekg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostekg_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostemt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostemt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostemt_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavBarcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcod_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavBarcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodreo_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavBarcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodpar_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavTotvaluebarkgmtin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluebarkgmtin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebarkgmtin_Enabled), 5, 0), true);
      edtavTotvaluebarmtrtin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluebarmtrtin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebarmtrtin_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strupT90( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e18T92 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV151ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV163DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV148ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_41 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_41"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV165GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV166GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV54EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV54EmprCod") ;
         wcpOAV60Fec1 = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV60Fec1"), 0) ;
         wcpOAV62Fec3 = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV62Fec3"), 0) ;
         wcpOAV111PCliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV111PCliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV34CliCodP = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV34CliCodP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV108PBarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV108PBarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV11BarCodP = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV11BarCodP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV110PBarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV110PBarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV15BarCodReoP = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV15BarCodReoP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV109PBarCodPar = httpContext.cgiGet( sPrefix+"wcpOAV109PBarCodPar") ;
         wcpOAV13BarCodParP = httpContext.cgiGet( sPrefix+"wcpOAV13BarCodParP") ;
         wcpOAV114PSerie = httpContext.cgiGet( sPrefix+"wcpOAV114PSerie") ;
         wcpOAV118SerieP = httpContext.cgiGet( sPrefix+"wcpOAV118SerieP") ;
         wcpOAV113PColor = httpContext.cgiGet( sPrefix+"wcpOAV113PColor") ;
         wcpOAV37ColorP = httpContext.cgiGet( sPrefix+"wcpOAV37ColorP") ;
         wcpOAV112PColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV112PColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV36ColNumP = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV36ColNumP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV51DispCli1 = httpContext.cgiGet( sPrefix+"wcpOAV51DispCli1") ;
         wcpOAV53DispCli3 = httpContext.cgiGet( sPrefix+"wcpOAV53DispCli3") ;
         wcpOAV72HreRacab = httpContext.cgiGet( sPrefix+"wcpOAV72HreRacab") ;
         wcpOAV97MaqCodi = httpContext.cgiGet( sPrefix+"wcpOAV97MaqCodi") ;
         wcpOAV95maqcod3 = httpContext.cgiGet( sPrefix+"wcpOAV95maqcod3") ;
         AV54EmprCod = httpContext.cgiGet( sPrefix+"vEMPRCOD") ;
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
         Ddo_grid_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Includesortasc = httpContext.cgiGet( sPrefix+"DDO_GRID_Includesortasc") ;
         Ddo_grid_Fixable = httpContext.cgiGet( sPrefix+"DDO_GRID_Fixable") ;
         Ddo_grid_Sortedstatus = httpContext.cgiGet( sPrefix+"DDO_GRID_Sortedstatus") ;
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
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         Ddo_managefilters_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Activeeventkey") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         /* Read variables values. */
         AV228FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV228FilterFullText", AV228FilterFullText);
         AV221TotValueBarKgmTin = httpContext.cgiGet( edtavTotvaluebarkgmtin_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV221TotValueBarKgmTin", AV221TotValueBarKgmTin);
         AV223TotValueBarMtrTin = httpContext.cgiGet( edtavTotvaluebarmtrtin_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV223TotValueBarMtrTin", AV223TotValueBarMtrTin);
         AV235Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV235Pgmname", AV235Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"WCHistoricoRecetasLconti");
         AV235Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV235Pgmname", AV235Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV235Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("wchistoricorecetaslconti:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV228FilterFullText) != 0 )
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
      e18T92 ();
      if (returnInSub) return;
   }

   public void e18T92( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV120Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wchistoricorecetaslconti_impl.this.GXt_char1 = GXv_char2[0] ;
      AV120Station = GXt_char1 ;
      GXv_char2[0] = AV54EmprCod ;
      GXv_char3[0] = AV55EmprNom ;
      GXv_char4[0] = AV132UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV120Station, GXv_char2, GXv_char3, GXv_char4) ;
      wchistoricorecetaslconti_impl.this.AV54EmprCod = GXv_char2[0] ;
      wchistoricorecetaslconti_impl.this.AV55EmprNom = GXv_char3[0] ;
      wchistoricorecetaslconti_impl.this.AV132UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54EmprCod", AV54EmprCod);
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
      if ( AV141OrderedBy < 1 )
      {
         AV141OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV141OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV141OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV163DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV163DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e19T92( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext7[0] = AV135WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV135WWPContext = GXv_SdtWWPContext7[0] ;
      if ( AV153ManageFiltersExecutionStep == 1 )
      {
         AV153ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV153ManageFiltersExecutionStep", GXutil.str( AV153ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV153ManageFiltersExecutionStep == 2 )
      {
         AV153ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV153ManageFiltersExecutionStep", GXutil.str( AV153ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV150Session.getValue("WCHistoricoRecetasLcontiColumnsSelector"), "") != 0 )
      {
         AV146ColumnsSelectorXML = AV150Session.getValue("WCHistoricoRecetasLcontiColumnsSelector") ;
         AV148ColumnsSelector.fromxml(AV146ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtEstFecCier_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV148ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtEstFecCier_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstFecCier_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtEstTinNr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV148ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtEstTinNr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstTinNr_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarnhdr_lc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV148ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarnhdr_lc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarnhdr_lc_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarAgrLot_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV148ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarAgrLot_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrLot_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtCliCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV148ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtCliNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV148ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarSerTin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV148ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarSerTin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSerTin_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarDscTin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV148ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarDscTin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDscTin_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarColNoT_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV148ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarColNoT_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNoT_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarColNuT_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV148ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarColNuT_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNuT_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarTipCoT_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV148ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarTipCoT_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipCoT_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarKgmTin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV148ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarKgmTin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarKgmTin_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarKgsTt_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV148ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarKgsTt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarKgsTt_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarMtrTin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV148ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarMtrTin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMtrTin_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarMtsTt_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV148ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarMtsTt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMtsTt_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarMaqTin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV148ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarMaqTin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMaqTin_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarVolTin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV148ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarVolTin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarVolTin_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavFornumarc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV148ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFornumarc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFornumarc_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarDispCli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV148ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarDispCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDispCli_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarNumAna_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV148ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarNumAna_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNumAna_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesi_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV148ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesi_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesi_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesa_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV148ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesa_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesa_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostekg_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV148ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostekg_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostekg_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostemt_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV148ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostemt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostemt_Visible), 5, 0), !bGXsfl_41_Refreshing);
      /* Execute user subroutine: 'INITIALIZETOTALIZERS' */
      S172 ();
      if (returnInSub) return;
      AV165GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV165GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV165GridCurrentPage), 10, 0));
      AV166GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV166GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV166GridPageCount), 10, 0));
      /* Execute user subroutine: 'CALCULATETOTALIZERS' */
      S182 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'INICIALIZOTOTALES' */
      S192 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'CALCULOTOTALES' */
      S202 ();
      if (returnInSub) return;
      AV236Wchistoricorecetaslcontids_1_filterfulltext = AV228FilterFullText ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV148ColumnsSelector", AV148ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV151ManageFiltersData", AV151ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV139GridState", AV139GridState);
   }

   public void e12T92( )
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
         AV164PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV164PageToGo) ;
      }
   }

   public void e13T92( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e14T92( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV141OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV141OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV141OrderedBy), 4, 0));
         AV142OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV142OrderedDsc", AV142OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e20T92( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV230DetailWebComponent = "<i class=\"fas fa-angle-right ArrowIcon\"></i>" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDetailwebcomponent_Internalname, AV230DetailWebComponent);
      GXt_int8 = AV65ForNumArc ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int9[0] = A252CliCod ;
      GXv_char3[0] = A1936BarSerTin ;
      GXv_char2[0] = A1940BarColNoT ;
      GXv_int10[0] = A1941BarColNuT ;
      GXv_int11[0] = A1942BarTipCoT ;
      GXv_int12[0] = GXt_int8 ;
      new app.pleoarc(remoteHandle, context).execute( GXv_char4, GXv_int9, GXv_char3, GXv_char2, GXv_int10, GXv_int11, GXv_int12) ;
      wchistoricorecetaslconti_impl.this.A396EmprCod = GXv_char4[0] ;
      wchistoricorecetaslconti_impl.this.A252CliCod = GXv_int9[0] ;
      wchistoricorecetaslconti_impl.this.A1936BarSerTin = GXv_char3[0] ;
      wchistoricorecetaslconti_impl.this.A1940BarColNoT = GXv_char2[0] ;
      wchistoricorecetaslconti_impl.this.A1941BarColNuT = GXv_int10[0] ;
      wchistoricorecetaslconti_impl.this.A1942BarTipCoT = GXv_int11[0] ;
      wchistoricorecetaslconti_impl.this.GXt_int8 = GXv_int12[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      AV65ForNumArc = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavFornumarc_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65ForNumArc), 8, 0));
      AV45CostesI = A3654BarCosPD.add(A3658BarCosPA).add(A3705BarCosCol) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostesi_Internalname, GXutil.ltrimstr( AV45CostesI, 11, 5));
      AV44CostesA = A3656BarCosAD.add(A3657BarCosAA).add(A3706BarCosAnc) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostesa_Internalname, GXutil.ltrimstr( AV44CostesA, 11, 5));
      AV41CosteKg = ((A8563BarKgsTt.doubleValue()>0) ? (AV45CostesI.add(AV44CostesA)).divide(A8563BarKgsTt, 18, java.math.RoundingMode.DOWN) : DecimalUtil.doubleToDec(0)) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostekg_Internalname, GXutil.ltrimstr( AV41CosteKg, 11, 5));
      AV42CosteMT = ((A1948BarMtrTin.doubleValue()>0) ? (AV45CostesI.add(AV44CostesA)).divide(A1948BarMtrTin, 18, java.math.RoundingMode.DOWN) : DecimalUtil.doubleToDec(0)) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostemt_Internalname, GXutil.ltrimstr( AV42CosteMT, 11, 5));
      AV10BarCod = (int)(GXutil.lval( GXutil.substring( A2316BarAgrLot, 1, 8))) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarcod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10BarCod), 8, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARCOD"+"_"+sGXsfl_41_idx, getSecureSignedToken( sPrefix+sGXsfl_41_idx, localUtil.format( DecimalUtil.doubleToDec(AV10BarCod), "ZZZZZZZ9")));
      AV14BarCodReo = (byte)(GXutil.lval( GXutil.substring( A2316BarAgrLot, 9, 1))) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarcodreo_Internalname, GXutil.str( AV14BarCodReo, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARCODREO"+"_"+sGXsfl_41_idx, getSecureSignedToken( sPrefix+sGXsfl_41_idx, localUtil.format( DecimalUtil.doubleToDec(AV14BarCodReo), "9")));
      AV12BarCodPar = GXutil.substring( A2316BarAgrLot, 10, 1) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarcodpar_Internalname, AV12BarCodPar);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARCODPAR"+"_"+sGXsfl_41_idx, getSecureSignedToken( sPrefix+sGXsfl_41_idx, GXutil.rtrim( localUtil.format( AV12BarCodPar, ""))));
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(41) ;
      }
      sendrow_412( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_41_Refreshing )
      {
         httpContext.doAjaxLoad(41, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void e15T92( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV146ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV148ColumnsSelector.fromJSonString(AV146ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "WCHistoricoRecetasLcontiColumnsSelector", ((GXutil.strcmp("", AV146ColumnsSelectorXML)==0) ? "" : AV148ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV148ColumnsSelector", AV148ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV151ManageFiltersData", AV151ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV139GridState", AV139GridState);
   }

   public void e11T92( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S212 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S152 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("WCHistoricoRecetasLcontiFilters")),GXutil.URLEncode(GXutil.rtrim(AV235Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV153ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV153ManageFiltersExecutionStep", GXutil.str( AV153ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("WCHistoricoRecetasLcontiFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV153ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV153ManageFiltersExecutionStep", GXutil.str( AV153ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV152ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "WCHistoricoRecetasLcontiFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         wchistoricorecetaslconti_impl.this.GXt_char1 = GXv_char4[0] ;
         AV152ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV152ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S212 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV235Pgmname+"GridState", AV152ManageFiltersXml) ;
            AV139GridState.fromxml(AV152ManageFiltersXml, null, null);
            AV141OrderedBy = AV139GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV141OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV141OrderedBy), 4, 0));
            AV142OrderedDsc = AV139GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV142OrderedDsc", AV142OrderedDsc);
            /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
            S142 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S222 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefreshCmp(sPrefix);
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV139GridState", AV139GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV148ColumnsSelector", AV148ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV151ManageFiltersData", AV151ManageFiltersData);
   }

   public void e16T92( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV144ExcelFilename ;
      GXv_char3[0] = AV145ErrorMessage ;
      new app.wchistoricorecetaslcontiexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      wchistoricorecetaslconti_impl.this.AV144ExcelFilename = GXv_char4[0] ;
      wchistoricorecetaslconti_impl.this.AV145ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV144ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV144ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV145ErrorMessage);
      }
   }

   public void e17T92( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.wchistoricorecetaslcontiexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV141OrderedBy, 4, 0))+":"+(AV142OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV148ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector13[0] = AV148ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "EstFecCier", "", "Fecha", true, "") ;
      AV148ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV148ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "EstTinNr", "", "#", true, "") ;
      AV148ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV148ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "Barnhdr_lconti", "", "Hdr", true, "") ;
      AV148ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV148ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "BarAgrLot", "", "Lote", true, "") ;
      AV148ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV148ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "CliCod", "", "Cliente", false, "") ;
      AV148ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV148ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "CliNom", "", "Nombre Cliente", true, "") ;
      AV148ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV148ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "BarSerTin", "", "Articulo", true, "") ;
      AV148ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV148ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "BarDscTin", "", "Descripcion", true, "") ;
      AV148ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV148ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "BarColNoT", "", "Color", true, "") ;
      AV148ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV148ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "BarColNuT", "", "Numero", true, "") ;
      AV148ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV148ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "BarTipCoT", "", "Tc", true, "") ;
      AV148ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV148ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "BarKgmTin", "", "Kgs", true, "") ;
      AV148ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV148ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "BarKgsTt", "", "Kgs Tot", true, "") ;
      AV148ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV148ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "BarMtrTin", "", "Mts", true, "") ;
      AV148ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV148ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "BarMtsTt", "", "Mts Tot", true, "") ;
      AV148ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV148ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "BarMaqTin", "", "Maquina", true, "") ;
      AV148ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV148ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "BarVolTin", "", "Volumen", true, "") ;
      AV148ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV148ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "&ForNumArc", "", "Nº Ensayo", false, "") ;
      AV148ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV148ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "BarDispCli", "", "Disp Cli", true, "") ;
      AV148ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV148ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "BarNumAna", "", "Nº Adi", true, "") ;
      AV148ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV148ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "&CostesI", "", "Costes I", true, "") ;
      AV148ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV148ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "&CostesA", "", "Costes Ad", true, "") ;
      AV148ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV148ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "&CosteKg", "", "Coste kg", true, "") ;
      AV148ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV148ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "&CosteMT", "", "Coste mt", true, "") ;
      AV148ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXt_char1 = AV147UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WCHistoricoRecetasLcontiColumnsSelector", GXv_char4) ;
      wchistoricorecetaslconti_impl.this.GXt_char1 = GXv_char4[0] ;
      AV147UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV147UserCustomValue)==0) ) )
      {
         AV149ColumnsSelectorAux.fromxml(AV147UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector13[0] = AV149ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector14[0] = AV148ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, GXv_SdtWWPColumnsSelector14) ;
         AV149ColumnsSelectorAux = GXv_SdtWWPColumnsSelector13[0] ;
         AV148ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item15 = AV151ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item16[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item15 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "WCHistoricoRecetasLcontiFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item16) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item15 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item16[0] ;
      AV151ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item15 ;
   }

   public void S212( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV228FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV228FilterFullText", AV228FilterFullText);
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV150Session.getValue(AV235Pgmname+"GridState"), "") == 0 )
      {
         AV139GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV235Pgmname+"GridState"), null, null);
      }
      else
      {
         AV139GridState.fromxml(AV150Session.getValue(AV235Pgmname+"GridState"), null, null);
      }
      AV141OrderedBy = AV139GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV141OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV141OrderedBy), 4, 0));
      AV142OrderedDsc = AV139GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV142OrderedDsc", AV142OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S222 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV139GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV139GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV139GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S222( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV237GXV1 = 1 ;
      while ( AV237GXV1 <= AV139GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV140GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV139GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV237GXV1));
         if ( GXutil.strcmp(AV140GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV228FilterFullText = AV140GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV228FilterFullText", AV228FilterFullText);
         }
         AV237GXV1 = (int)(AV237GXV1+1) ;
      }
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV139GridState.fromxml(AV150Session.getValue(AV235Pgmname+"GridState"), null, null);
      AV139GridState.setgxTv_SdtWWPGridState_Orderedby( AV141OrderedBy );
      AV139GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV142OrderedDsc );
      AV139GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState17[0] = AV139GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState17, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV228FilterFullText)==0), (short)(0), AV228FilterFullText, "") ;
      AV139GridState = GXv_SdtWWPGridState17[0] ;
      if ( ! (GXutil.strcmp("", AV54EmprCod)==0) )
      {
         AV140GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV140GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV140GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV54EmprCod );
         AV139GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV140GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV60Fec1)) )
      {
         AV140GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV140GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FEC1" );
         AV140GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV60Fec1, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV139GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV140GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV62Fec3)) )
      {
         AV140GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV140GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FEC3" );
         AV140GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV62Fec3, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV139GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV140GridStateFilterValue, 0);
      }
      if ( ! (0==AV111PCliCod) )
      {
         AV140GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV140GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PCLICOD" );
         AV140GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV111PCliCod, 6, 0) );
         AV139GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV140GridStateFilterValue, 0);
      }
      if ( ! (0==AV34CliCodP) )
      {
         AV140GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV140GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICODP" );
         AV140GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV34CliCodP, 6, 0) );
         AV139GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV140GridStateFilterValue, 0);
      }
      if ( ! (0==AV108PBarCod) )
      {
         AV140GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV140GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PBARCOD" );
         AV140GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV108PBarCod, 8, 0) );
         AV139GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV140GridStateFilterValue, 0);
      }
      if ( ! (0==AV11BarCodP) )
      {
         AV140GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV140GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODP" );
         AV140GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV11BarCodP, 8, 0) );
         AV139GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV140GridStateFilterValue, 0);
      }
      if ( ! (0==AV110PBarCodReo) )
      {
         AV140GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV140GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PBARCODREO" );
         AV140GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV110PBarCodReo, 1, 0) );
         AV139GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV140GridStateFilterValue, 0);
      }
      if ( ! (0==AV15BarCodReoP) )
      {
         AV140GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV140GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODREOP" );
         AV140GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV15BarCodReoP, 1, 0) );
         AV139GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV140GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV109PBarCodPar)==0) )
      {
         AV140GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV140GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PBARCODPAR" );
         AV140GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV109PBarCodPar );
         AV139GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV140GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV13BarCodParP)==0) )
      {
         AV140GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV140GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODPARP" );
         AV140GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV13BarCodParP );
         AV139GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV140GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV114PSerie)==0) )
      {
         AV140GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV140GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PSERIE" );
         AV140GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV114PSerie );
         AV139GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV140GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV118SerieP)==0) )
      {
         AV140GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV140GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&SERIEP" );
         AV140GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV118SerieP );
         AV139GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV140GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV113PColor)==0) )
      {
         AV140GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV140GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PCOLOR" );
         AV140GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV113PColor );
         AV139GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV140GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV37ColorP)==0) )
      {
         AV140GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV140GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&COLORP" );
         AV140GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV37ColorP );
         AV139GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV140GridStateFilterValue, 0);
      }
      if ( ! (0==AV112PColNum) )
      {
         AV140GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV140GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PCOLNUM" );
         AV140GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV112PColNum, 6, 0) );
         AV139GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV140GridStateFilterValue, 0);
      }
      if ( ! (0==AV36ColNumP) )
      {
         AV140GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV140GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&COLNUMP" );
         AV140GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV36ColNumP, 6, 0) );
         AV139GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV140GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV51DispCli1)==0) )
      {
         AV140GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV140GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&DISPCLI1" );
         AV140GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV51DispCli1 );
         AV139GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV140GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV53DispCli3)==0) )
      {
         AV140GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV140GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&DISPCLI3" );
         AV140GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV53DispCli3 );
         AV139GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV140GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV72HreRacab)==0) )
      {
         AV140GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV140GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&HRERACAB" );
         AV140GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV72HreRacab );
         AV139GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV140GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV97MaqCodi)==0) )
      {
         AV140GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV140GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&MAQCODI" );
         AV140GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV97MaqCodi );
         AV139GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV140GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV95maqcod3)==0) )
      {
         AV140GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV140GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&MAQCOD3" );
         AV140GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV95maqcod3 );
         AV139GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV140GridStateFilterValue, 0);
      }
      AV139GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV139GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV235Pgmname+"GridState", AV139GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV137TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV137TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV235Pgmname );
      AV137TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV137TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV136HTTPRequest.getScriptName()+"?"+AV136HTTPRequest.getQuerystring() );
      AV137TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "LCONTI" );
      AV150Session.setValue("TrnContext", AV137TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S172( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
      AV220TotBarKgmTin = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV220TotBarKgmTin", GXutil.ltrimstr( AV220TotBarKgmTin, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARKGMTIN", getSecureSignedToken( sPrefix, localUtil.format( AV220TotBarKgmTin, "ZZZZZ9.99")));
      AV222TotBarMtrTin = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV222TotBarMtrTin", GXutil.ltrimstr( AV222TotBarMtrTin, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARMTRTIN", getSecureSignedToken( sPrefix, localUtil.format( AV222TotBarMtrTin, "ZZZZZ9.99")));
   }

   public void S182( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      AV236Wchistoricorecetaslcontids_1_filterfulltext = AV228FilterFullText ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV236Wchistoricorecetaslcontids_1_filterfulltext ,
                                           Short.valueOf(A1929EstTinNr) ,
                                           Integer.valueOf(A1933BarCodTin) ,
                                           Byte.valueOf(A1934BarReoTin) ,
                                           A1935BarParTin ,
                                           A2316BarAgrLot ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A1936BarSerTin ,
                                           A1937BarDscTin ,
                                           A1940BarColNoT ,
                                           Integer.valueOf(A1941BarColNuT) ,
                                           Byte.valueOf(A1942BarTipCoT) ,
                                           A1947BarKgmTin ,
                                           A8563BarKgsTt ,
                                           A1948BarMtrTin ,
                                           A12993BarMtsTt ,
                                           A1945BarMaqTin ,
                                           Integer.valueOf(A1946BarVolTin) ,
                                           A11762BarDispCli ,
                                           Short.valueOf(A3650BarNumAna) ,
                                           A13759EstFecCier ,
                                           AV60Fec1 ,
                                           AV62Fec3 ,
                                           Integer.valueOf(AV111PCliCod) ,
                                           Integer.valueOf(AV34CliCodP) ,
                                           Integer.valueOf(AV108PBarCod) ,
                                           Integer.valueOf(AV11BarCodP) ,
                                           Byte.valueOf(AV110PBarCodReo) ,
                                           Byte.valueOf(AV15BarCodReoP) ,
                                           AV109PBarCodPar ,
                                           AV13BarCodParP ,
                                           AV114PSerie ,
                                           AV118SerieP ,
                                           AV113PColor ,
                                           AV37ColorP ,
                                           Integer.valueOf(AV112PColNum) ,
                                           Integer.valueOf(AV36ColNumP) ,
                                           AV51DispCli1 ,
                                           AV53DispCli3 ,
                                           A6634BarRecAcb ,
                                           AV72HreRacab ,
                                           AV97MaqCodi ,
                                           AV95maqcod3 ,
                                           AV54EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      /* Using cursor H00T94 */
      pr_default.execute(2, new Object[] {AV54EmprCod, AV60Fec1, AV62Fec3, Integer.valueOf(AV111PCliCod), Integer.valueOf(AV34CliCodP), Integer.valueOf(AV108PBarCod), Integer.valueOf(AV11BarCodP), Byte.valueOf(AV110PBarCodReo), Byte.valueOf(AV15BarCodReoP), AV109PBarCodPar, AV13BarCodParP, AV114PSerie, AV118SerieP, AV113PColor, AV37ColorP, Integer.valueOf(AV112PColNum), Integer.valueOf(AV36ColNumP), AV51DispCli1, AV53DispCli3, AV72HreRacab, AV72HreRacab, AV97MaqCodi, AV95maqcod3, lV236Wchistoricorecetaslcontids_1_filterfulltext, lV236Wchistoricorecetaslcontids_1_filterfulltext, lV236Wchistoricorecetaslcontids_1_filterfulltext, lV236Wchistoricorecetaslcontids_1_filterfulltext, lV236Wchistoricorecetaslcontids_1_filterfulltext, lV236Wchistoricorecetaslcontids_1_filterfulltext, lV236Wchistoricorecetaslcontids_1_filterfulltext, lV236Wchistoricorecetaslcontids_1_filterfulltext, lV236Wchistoricorecetaslcontids_1_filterfulltext, lV236Wchistoricorecetaslcontids_1_filterfulltext, lV236Wchistoricorecetaslcontids_1_filterfulltext, lV236Wchistoricorecetaslcontids_1_filterfulltext, lV236Wchistoricorecetaslcontids_1_filterfulltext, lV236Wchistoricorecetaslcontids_1_filterfulltext, lV236Wchistoricorecetaslcontids_1_filterfulltext, lV236Wchistoricorecetaslcontids_1_filterfulltext, lV236Wchistoricorecetaslcontids_1_filterfulltext, lV236Wchistoricorecetaslcontids_1_filterfulltext});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A6634BarRecAcb = H00T94_A6634BarRecAcb[0] ;
         n6634BarRecAcb = H00T94_n6634BarRecAcb[0] ;
         A13759EstFecCier = H00T94_A13759EstFecCier[0] ;
         A396EmprCod = H00T94_A396EmprCod[0] ;
         A3650BarNumAna = H00T94_A3650BarNumAna[0] ;
         n3650BarNumAna = H00T94_n3650BarNumAna[0] ;
         A11762BarDispCli = H00T94_A11762BarDispCli[0] ;
         n11762BarDispCli = H00T94_n11762BarDispCli[0] ;
         A1946BarVolTin = H00T94_A1946BarVolTin[0] ;
         n1946BarVolTin = H00T94_n1946BarVolTin[0] ;
         A1945BarMaqTin = H00T94_A1945BarMaqTin[0] ;
         n1945BarMaqTin = H00T94_n1945BarMaqTin[0] ;
         A12993BarMtsTt = H00T94_A12993BarMtsTt[0] ;
         n12993BarMtsTt = H00T94_n12993BarMtsTt[0] ;
         A1948BarMtrTin = H00T94_A1948BarMtrTin[0] ;
         n1948BarMtrTin = H00T94_n1948BarMtrTin[0] ;
         A8563BarKgsTt = H00T94_A8563BarKgsTt[0] ;
         n8563BarKgsTt = H00T94_n8563BarKgsTt[0] ;
         A1947BarKgmTin = H00T94_A1947BarKgmTin[0] ;
         n1947BarKgmTin = H00T94_n1947BarKgmTin[0] ;
         A1942BarTipCoT = H00T94_A1942BarTipCoT[0] ;
         n1942BarTipCoT = H00T94_n1942BarTipCoT[0] ;
         A1941BarColNuT = H00T94_A1941BarColNuT[0] ;
         n1941BarColNuT = H00T94_n1941BarColNuT[0] ;
         A1940BarColNoT = H00T94_A1940BarColNoT[0] ;
         n1940BarColNoT = H00T94_n1940BarColNoT[0] ;
         A1937BarDscTin = H00T94_A1937BarDscTin[0] ;
         n1937BarDscTin = H00T94_n1937BarDscTin[0] ;
         A1936BarSerTin = H00T94_A1936BarSerTin[0] ;
         n1936BarSerTin = H00T94_n1936BarSerTin[0] ;
         A279CliNom = H00T94_A279CliNom[0] ;
         A252CliCod = H00T94_A252CliCod[0] ;
         A2316BarAgrLot = H00T94_A2316BarAgrLot[0] ;
         n2316BarAgrLot = H00T94_n2316BarAgrLot[0] ;
         A1929EstTinNr = H00T94_A1929EstTinNr[0] ;
         A1935BarParTin = H00T94_A1935BarParTin[0] ;
         n1935BarParTin = H00T94_n1935BarParTin[0] ;
         A1934BarReoTin = H00T94_A1934BarReoTin[0] ;
         n1934BarReoTin = H00T94_n1934BarReoTin[0] ;
         A1933BarCodTin = H00T94_A1933BarCodTin[0] ;
         n1933BarCodTin = H00T94_n1933BarCodTin[0] ;
         A279CliNom = H00T94_A279CliNom[0] ;
         A13841Barnhdr_lc = GXutil.str( A1933BarCodTin, 8, 0) + "-" + GXutil.str( A1934BarReoTin, 1, 0) + A1935BarParTin ;
         AV220TotBarKgmTin = A1947BarKgmTin.add(AV220TotBarKgmTin) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV220TotBarKgmTin", GXutil.ltrimstr( AV220TotBarKgmTin, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARKGMTIN", getSecureSignedToken( sPrefix, localUtil.format( AV220TotBarKgmTin, "ZZZZZ9.99")));
         AV222TotBarMtrTin = A1948BarMtrTin.add(AV222TotBarMtrTin) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV222TotBarMtrTin", GXutil.ltrimstr( AV222TotBarMtrTin, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARMTRTIN", getSecureSignedToken( sPrefix, localUtil.format( AV222TotBarMtrTin, "ZZZZZ9.99")));
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV221TotValueBarKgmTin = localUtil.format( AV220TotBarKgmTin, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV221TotValueBarKgmTin", AV221TotValueBarKgmTin);
      AV223TotValueBarMtrTin = localUtil.format( AV222TotBarMtrTin, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV223TotValueBarMtrTin", AV223TotValueBarMtrTin);
   }

   public void S192( )
   {
      /* 'INICIALIZOTOTALES' Routine */
      returnInSub = false ;
      AV220TotBarKgmTin = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV220TotBarKgmTin", GXutil.ltrimstr( AV220TotBarKgmTin, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARKGMTIN", getSecureSignedToken( sPrefix, localUtil.format( AV220TotBarKgmTin, "ZZZZZ9.99")));
      AV222TotBarMtrTin = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV222TotBarMtrTin", GXutil.ltrimstr( AV222TotBarMtrTin, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARMTRTIN", getSecureSignedToken( sPrefix, localUtil.format( AV222TotBarMtrTin, "ZZZZZ9.99")));
      AV106num_t = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV106num_t", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV106num_t), 6, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vNUM_T", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV106num_t), "ZZZZZ9")));
   }

   public void S202( )
   {
      /* 'CALCULOTOTALES' Routine */
      returnInSub = false ;
      AV236Wchistoricorecetaslcontids_1_filterfulltext = AV228FilterFullText ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV236Wchistoricorecetaslcontids_1_filterfulltext ,
                                           Short.valueOf(A1929EstTinNr) ,
                                           Integer.valueOf(A1933BarCodTin) ,
                                           Byte.valueOf(A1934BarReoTin) ,
                                           A1935BarParTin ,
                                           A2316BarAgrLot ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A1936BarSerTin ,
                                           A1937BarDscTin ,
                                           A1940BarColNoT ,
                                           Integer.valueOf(A1941BarColNuT) ,
                                           Byte.valueOf(A1942BarTipCoT) ,
                                           A1947BarKgmTin ,
                                           A8563BarKgsTt ,
                                           A1948BarMtrTin ,
                                           A12993BarMtsTt ,
                                           A1945BarMaqTin ,
                                           Integer.valueOf(A1946BarVolTin) ,
                                           A11762BarDispCli ,
                                           Short.valueOf(A3650BarNumAna) ,
                                           A13759EstFecCier ,
                                           AV60Fec1 ,
                                           AV62Fec3 ,
                                           Integer.valueOf(AV111PCliCod) ,
                                           Integer.valueOf(AV34CliCodP) ,
                                           Integer.valueOf(AV108PBarCod) ,
                                           Integer.valueOf(AV11BarCodP) ,
                                           Byte.valueOf(AV110PBarCodReo) ,
                                           Byte.valueOf(AV15BarCodReoP) ,
                                           AV109PBarCodPar ,
                                           AV13BarCodParP ,
                                           AV114PSerie ,
                                           AV118SerieP ,
                                           AV113PColor ,
                                           AV37ColorP ,
                                           Integer.valueOf(AV112PColNum) ,
                                           Integer.valueOf(AV36ColNumP) ,
                                           AV51DispCli1 ,
                                           AV53DispCli3 ,
                                           A6634BarRecAcb ,
                                           AV72HreRacab ,
                                           AV97MaqCodi ,
                                           AV95maqcod3 ,
                                           AV54EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV236Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV236Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      /* Using cursor H00T95 */
      pr_default.execute(3, new Object[] {AV54EmprCod, AV60Fec1, AV62Fec3, Integer.valueOf(AV111PCliCod), Integer.valueOf(AV34CliCodP), Integer.valueOf(AV108PBarCod), Integer.valueOf(AV11BarCodP), Byte.valueOf(AV110PBarCodReo), Byte.valueOf(AV15BarCodReoP), AV109PBarCodPar, AV13BarCodParP, AV114PSerie, AV118SerieP, AV113PColor, AV37ColorP, Integer.valueOf(AV112PColNum), Integer.valueOf(AV36ColNumP), AV51DispCli1, AV53DispCli3, AV97MaqCodi, AV95maqcod3, lV236Wchistoricorecetaslcontids_1_filterfulltext, lV236Wchistoricorecetaslcontids_1_filterfulltext, lV236Wchistoricorecetaslcontids_1_filterfulltext, lV236Wchistoricorecetaslcontids_1_filterfulltext, lV236Wchistoricorecetaslcontids_1_filterfulltext, lV236Wchistoricorecetaslcontids_1_filterfulltext, lV236Wchistoricorecetaslcontids_1_filterfulltext, lV236Wchistoricorecetaslcontids_1_filterfulltext, lV236Wchistoricorecetaslcontids_1_filterfulltext, lV236Wchistoricorecetaslcontids_1_filterfulltext, lV236Wchistoricorecetaslcontids_1_filterfulltext, lV236Wchistoricorecetaslcontids_1_filterfulltext, lV236Wchistoricorecetaslcontids_1_filterfulltext, lV236Wchistoricorecetaslcontids_1_filterfulltext, lV236Wchistoricorecetaslcontids_1_filterfulltext, lV236Wchistoricorecetaslcontids_1_filterfulltext, lV236Wchistoricorecetaslcontids_1_filterfulltext, lV236Wchistoricorecetaslcontids_1_filterfulltext});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A6634BarRecAcb = H00T95_A6634BarRecAcb[0] ;
         n6634BarRecAcb = H00T95_n6634BarRecAcb[0] ;
         A13759EstFecCier = H00T95_A13759EstFecCier[0] ;
         A396EmprCod = H00T95_A396EmprCod[0] ;
         A3650BarNumAna = H00T95_A3650BarNumAna[0] ;
         n3650BarNumAna = H00T95_n3650BarNumAna[0] ;
         A11762BarDispCli = H00T95_A11762BarDispCli[0] ;
         n11762BarDispCli = H00T95_n11762BarDispCli[0] ;
         A1946BarVolTin = H00T95_A1946BarVolTin[0] ;
         n1946BarVolTin = H00T95_n1946BarVolTin[0] ;
         A1945BarMaqTin = H00T95_A1945BarMaqTin[0] ;
         n1945BarMaqTin = H00T95_n1945BarMaqTin[0] ;
         A12993BarMtsTt = H00T95_A12993BarMtsTt[0] ;
         n12993BarMtsTt = H00T95_n12993BarMtsTt[0] ;
         A1948BarMtrTin = H00T95_A1948BarMtrTin[0] ;
         n1948BarMtrTin = H00T95_n1948BarMtrTin[0] ;
         A8563BarKgsTt = H00T95_A8563BarKgsTt[0] ;
         n8563BarKgsTt = H00T95_n8563BarKgsTt[0] ;
         A1947BarKgmTin = H00T95_A1947BarKgmTin[0] ;
         n1947BarKgmTin = H00T95_n1947BarKgmTin[0] ;
         A1942BarTipCoT = H00T95_A1942BarTipCoT[0] ;
         n1942BarTipCoT = H00T95_n1942BarTipCoT[0] ;
         A1941BarColNuT = H00T95_A1941BarColNuT[0] ;
         n1941BarColNuT = H00T95_n1941BarColNuT[0] ;
         A1940BarColNoT = H00T95_A1940BarColNoT[0] ;
         n1940BarColNoT = H00T95_n1940BarColNoT[0] ;
         A1937BarDscTin = H00T95_A1937BarDscTin[0] ;
         n1937BarDscTin = H00T95_n1937BarDscTin[0] ;
         A1936BarSerTin = H00T95_A1936BarSerTin[0] ;
         n1936BarSerTin = H00T95_n1936BarSerTin[0] ;
         A279CliNom = H00T95_A279CliNom[0] ;
         A252CliCod = H00T95_A252CliCod[0] ;
         A2316BarAgrLot = H00T95_A2316BarAgrLot[0] ;
         n2316BarAgrLot = H00T95_n2316BarAgrLot[0] ;
         A1929EstTinNr = H00T95_A1929EstTinNr[0] ;
         A1935BarParTin = H00T95_A1935BarParTin[0] ;
         n1935BarParTin = H00T95_n1935BarParTin[0] ;
         A1934BarReoTin = H00T95_A1934BarReoTin[0] ;
         n1934BarReoTin = H00T95_n1934BarReoTin[0] ;
         A1933BarCodTin = H00T95_A1933BarCodTin[0] ;
         n1933BarCodTin = H00T95_n1933BarCodTin[0] ;
         A279CliNom = H00T95_A279CliNom[0] ;
         if ( ( GXutil.strcmp(A6634BarRecAcb, AV72HreRacab) == 0 ) || ( GXutil.strcmp(AV72HreRacab, httpContext.getMessage( "T", "")) == 0 ) )
         {
            A13841Barnhdr_lc = GXutil.str( A1933BarCodTin, 8, 0) + "-" + GXutil.str( A1934BarReoTin, 1, 0) + A1935BarParTin ;
            AV220TotBarKgmTin = A1947BarKgmTin.add(AV220TotBarKgmTin) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV220TotBarKgmTin", GXutil.ltrimstr( AV220TotBarKgmTin, 18, 2));
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARKGMTIN", getSecureSignedToken( sPrefix, localUtil.format( AV220TotBarKgmTin, "ZZZZZ9.99")));
            AV222TotBarMtrTin = A1948BarMtrTin.add(AV222TotBarMtrTin) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV222TotBarMtrTin", GXutil.ltrimstr( AV222TotBarMtrTin, 18, 2));
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARMTRTIN", getSecureSignedToken( sPrefix, localUtil.format( AV222TotBarMtrTin, "ZZZZZ9.99")));
            AV106num_t = (int)(AV106num_t+(((A1933BarCodTin==CommonUtil.decimalVal( GXutil.substring( A2316BarAgrLot, 1, 8), ".").doubleValue())&&(A1934BarReoTin==CommonUtil.decimalVal( GXutil.substring( A2316BarAgrLot, 9, 1), ".").doubleValue())&&(GXutil.strcmp(A1935BarParTin, GXutil.substring( A2316BarAgrLot, 10, 1))==0) ? 1 : 0))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV106num_t", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV106num_t), 6, 0));
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vNUM_T", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV106num_t), "ZZZZZ9")));
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
      AV221TotValueBarKgmTin = localUtil.format( AV220TotBarKgmTin, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV221TotValueBarKgmTin", AV221TotValueBarKgmTin);
      AV223TotValueBarMtrTin = localUtil.format( AV222TotBarMtrTin, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV223TotValueBarMtrTin", AV223TotValueBarMtrTin);
   }

   public void wb_table2_72_T92( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblGridtabletotalizer_Internalname, tblGridtabletotalizer_Internalname, "", "TableTotalizerAl", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluebarkgmtin_Internalname, httpContext.getMessage( "Tot Value Bar Kgm Tin", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'" + sPrefix + "',false,'" + sGXsfl_41_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluebarkgmtin_Internalname, AV221TotValueBarKgmTin, GXutil.rtrim( localUtil.format( AV221TotValueBarKgmTin, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,88);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluebarkgmtin_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluebarkgmtin_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WCHistoricoRecetasLconti.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluebarmtrtin_Internalname, httpContext.getMessage( "Tot Value Bar Mtr Tin", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 92,'" + sPrefix + "',false,'" + sGXsfl_41_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluebarmtrtin_Internalname, AV223TotValueBarMtrTin, GXutil.rtrim( localUtil.format( AV223TotValueBarMtrTin, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,92);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluebarmtrtin_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluebarmtrtin_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WCHistoricoRecetasLconti.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_72_T92e( true) ;
      }
      else
      {
         wb_table2_72_T92e( false) ;
      }
   }

   public void wb_table1_23_T92( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV151ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table3_28_T92( true) ;
      }
      else
      {
         wb_table3_28_T92( false) ;
      }
      return  ;
   }

   public void wb_table3_28_T92e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_23_T92e( true) ;
      }
      else
      {
         wb_table1_23_T92e( false) ;
      }
   }

   public void wb_table3_28_T92( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'" + sPrefix + "',false,'" + sGXsfl_41_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV228FilterFullText, GXutil.rtrim( localUtil.format( AV228FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_WCHistoricoRecetasLconti.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_28_T92e( true) ;
      }
      else
      {
         wb_table3_28_T92e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV54EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54EmprCod", AV54EmprCod);
      AV60Fec1 = (java.util.Date)getParm(obj,1,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60Fec1", localUtil.format(AV60Fec1, "99/99/99"));
      AV62Fec3 = (java.util.Date)getParm(obj,2,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62Fec3", localUtil.format(AV62Fec3, "99/99/99"));
      AV111PCliCod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV111PCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV111PCliCod), 6, 0));
      AV34CliCodP = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34CliCodP", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34CliCodP), 6, 0));
      AV108PBarCod = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV108PBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV108PBarCod), 8, 0));
      AV11BarCodP = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11BarCodP", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11BarCodP), 8, 0));
      AV110PBarCodReo = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV110PBarCodReo", GXutil.str( AV110PBarCodReo, 1, 0));
      AV15BarCodReoP = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15BarCodReoP", GXutil.str( AV15BarCodReoP, 1, 0));
      AV109PBarCodPar = (String)getParm(obj,9,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV109PBarCodPar", AV109PBarCodPar);
      AV13BarCodParP = (String)getParm(obj,10,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13BarCodParP", AV13BarCodParP);
      AV114PSerie = (String)getParm(obj,11,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV114PSerie", AV114PSerie);
      AV118SerieP = (String)getParm(obj,12,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV118SerieP", AV118SerieP);
      AV113PColor = (String)getParm(obj,13,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV113PColor", AV113PColor);
      AV37ColorP = (String)getParm(obj,14,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37ColorP", AV37ColorP);
      AV112PColNum = ((Number) GXutil.testNumericType( getParm(obj,15,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV112PColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV112PColNum), 6, 0));
      AV36ColNumP = ((Number) GXutil.testNumericType( getParm(obj,16,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36ColNumP", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36ColNumP), 6, 0));
      AV51DispCli1 = (String)getParm(obj,17,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51DispCli1", AV51DispCli1);
      AV53DispCli3 = (String)getParm(obj,18,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53DispCli3", AV53DispCli3);
      AV72HreRacab = (String)getParm(obj,19,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72HreRacab", AV72HreRacab);
      AV97MaqCodi = (String)getParm(obj,20,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV97MaqCodi", AV97MaqCodi);
      AV95maqcod3 = (String)getParm(obj,21,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV95maqcod3", AV95maqcod3);
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
      paT92( ) ;
      wsT92( ) ;
      weT92( ) ;
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
      sCtrlAV54EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV60Fec1 = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV62Fec3 = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV111PCliCod = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV34CliCodP = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV108PBarCod = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV11BarCodP = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV110PBarCodReo = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV15BarCodReoP = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV109PBarCodPar = (String)getParm(obj,9,TypeConstants.STRING) ;
      sCtrlAV13BarCodParP = (String)getParm(obj,10,TypeConstants.STRING) ;
      sCtrlAV114PSerie = (String)getParm(obj,11,TypeConstants.STRING) ;
      sCtrlAV118SerieP = (String)getParm(obj,12,TypeConstants.STRING) ;
      sCtrlAV113PColor = (String)getParm(obj,13,TypeConstants.STRING) ;
      sCtrlAV37ColorP = (String)getParm(obj,14,TypeConstants.STRING) ;
      sCtrlAV112PColNum = (String)getParm(obj,15,TypeConstants.STRING) ;
      sCtrlAV36ColNumP = (String)getParm(obj,16,TypeConstants.STRING) ;
      sCtrlAV51DispCli1 = (String)getParm(obj,17,TypeConstants.STRING) ;
      sCtrlAV53DispCli3 = (String)getParm(obj,18,TypeConstants.STRING) ;
      sCtrlAV72HreRacab = (String)getParm(obj,19,TypeConstants.STRING) ;
      sCtrlAV97MaqCodi = (String)getParm(obj,20,TypeConstants.STRING) ;
      sCtrlAV95maqcod3 = (String)getParm(obj,21,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      paT92( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "wchistoricorecetaslconti", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      paT92( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV54EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54EmprCod", AV54EmprCod);
         AV60Fec1 = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60Fec1", localUtil.format(AV60Fec1, "99/99/99"));
         AV62Fec3 = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62Fec3", localUtil.format(AV62Fec3, "99/99/99"));
         AV111PCliCod = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV111PCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV111PCliCod), 6, 0));
         AV34CliCodP = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34CliCodP", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34CliCodP), 6, 0));
         AV108PBarCod = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV108PBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV108PBarCod), 8, 0));
         AV11BarCodP = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11BarCodP", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11BarCodP), 8, 0));
         AV110PBarCodReo = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV110PBarCodReo", GXutil.str( AV110PBarCodReo, 1, 0));
         AV15BarCodReoP = ((Number) GXutil.testNumericType( getParm(obj,10,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15BarCodReoP", GXutil.str( AV15BarCodReoP, 1, 0));
         AV109PBarCodPar = (String)getParm(obj,11,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV109PBarCodPar", AV109PBarCodPar);
         AV13BarCodParP = (String)getParm(obj,12,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13BarCodParP", AV13BarCodParP);
         AV114PSerie = (String)getParm(obj,13,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV114PSerie", AV114PSerie);
         AV118SerieP = (String)getParm(obj,14,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV118SerieP", AV118SerieP);
         AV113PColor = (String)getParm(obj,15,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV113PColor", AV113PColor);
         AV37ColorP = (String)getParm(obj,16,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37ColorP", AV37ColorP);
         AV112PColNum = ((Number) GXutil.testNumericType( getParm(obj,17,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV112PColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV112PColNum), 6, 0));
         AV36ColNumP = ((Number) GXutil.testNumericType( getParm(obj,18,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36ColNumP", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36ColNumP), 6, 0));
         AV51DispCli1 = (String)getParm(obj,19,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51DispCli1", AV51DispCli1);
         AV53DispCli3 = (String)getParm(obj,20,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53DispCli3", AV53DispCli3);
         AV72HreRacab = (String)getParm(obj,21,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72HreRacab", AV72HreRacab);
         AV97MaqCodi = (String)getParm(obj,22,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV97MaqCodi", AV97MaqCodi);
         AV95maqcod3 = (String)getParm(obj,23,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV95maqcod3", AV95maqcod3);
      }
      wcpOAV54EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV54EmprCod") ;
      wcpOAV60Fec1 = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV60Fec1"), 0) ;
      wcpOAV62Fec3 = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV62Fec3"), 0) ;
      wcpOAV111PCliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV111PCliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV34CliCodP = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV34CliCodP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV108PBarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV108PBarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV11BarCodP = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV11BarCodP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV110PBarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV110PBarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV15BarCodReoP = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV15BarCodReoP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV109PBarCodPar = httpContext.cgiGet( sPrefix+"wcpOAV109PBarCodPar") ;
      wcpOAV13BarCodParP = httpContext.cgiGet( sPrefix+"wcpOAV13BarCodParP") ;
      wcpOAV114PSerie = httpContext.cgiGet( sPrefix+"wcpOAV114PSerie") ;
      wcpOAV118SerieP = httpContext.cgiGet( sPrefix+"wcpOAV118SerieP") ;
      wcpOAV113PColor = httpContext.cgiGet( sPrefix+"wcpOAV113PColor") ;
      wcpOAV37ColorP = httpContext.cgiGet( sPrefix+"wcpOAV37ColorP") ;
      wcpOAV112PColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV112PColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV36ColNumP = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV36ColNumP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV51DispCli1 = httpContext.cgiGet( sPrefix+"wcpOAV51DispCli1") ;
      wcpOAV53DispCli3 = httpContext.cgiGet( sPrefix+"wcpOAV53DispCli3") ;
      wcpOAV72HreRacab = httpContext.cgiGet( sPrefix+"wcpOAV72HreRacab") ;
      wcpOAV97MaqCodi = httpContext.cgiGet( sPrefix+"wcpOAV97MaqCodi") ;
      wcpOAV95maqcod3 = httpContext.cgiGet( sPrefix+"wcpOAV95maqcod3") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV54EmprCod, wcpOAV54EmprCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(AV60Fec1), GXutil.resetTime(wcpOAV60Fec1)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV62Fec3), GXutil.resetTime(wcpOAV62Fec3)) ) || ( AV111PCliCod != wcpOAV111PCliCod ) || ( AV34CliCodP != wcpOAV34CliCodP ) || ( AV108PBarCod != wcpOAV108PBarCod ) || ( AV11BarCodP != wcpOAV11BarCodP ) || ( AV110PBarCodReo != wcpOAV110PBarCodReo ) || ( AV15BarCodReoP != wcpOAV15BarCodReoP ) || ( GXutil.strcmp(AV109PBarCodPar, wcpOAV109PBarCodPar) != 0 ) || ( GXutil.strcmp(AV13BarCodParP, wcpOAV13BarCodParP) != 0 ) || ( GXutil.strcmp(AV114PSerie, wcpOAV114PSerie) != 0 ) || ( GXutil.strcmp(AV118SerieP, wcpOAV118SerieP) != 0 ) || ( GXutil.strcmp(AV113PColor, wcpOAV113PColor) != 0 ) || ( GXutil.strcmp(AV37ColorP, wcpOAV37ColorP) != 0 ) || ( AV112PColNum != wcpOAV112PColNum ) || ( AV36ColNumP != wcpOAV36ColNumP ) || ( GXutil.strcmp(AV51DispCli1, wcpOAV51DispCli1) != 0 ) || ( GXutil.strcmp(AV53DispCli3, wcpOAV53DispCli3) != 0 ) || ( GXutil.strcmp(AV72HreRacab, wcpOAV72HreRacab) != 0 ) || ( GXutil.strcmp(AV97MaqCodi, wcpOAV97MaqCodi) != 0 ) || ( GXutil.strcmp(AV95maqcod3, wcpOAV95maqcod3) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV54EmprCod = AV54EmprCod ;
      wcpOAV60Fec1 = AV60Fec1 ;
      wcpOAV62Fec3 = AV62Fec3 ;
      wcpOAV111PCliCod = AV111PCliCod ;
      wcpOAV34CliCodP = AV34CliCodP ;
      wcpOAV108PBarCod = AV108PBarCod ;
      wcpOAV11BarCodP = AV11BarCodP ;
      wcpOAV110PBarCodReo = AV110PBarCodReo ;
      wcpOAV15BarCodReoP = AV15BarCodReoP ;
      wcpOAV109PBarCodPar = AV109PBarCodPar ;
      wcpOAV13BarCodParP = AV13BarCodParP ;
      wcpOAV114PSerie = AV114PSerie ;
      wcpOAV118SerieP = AV118SerieP ;
      wcpOAV113PColor = AV113PColor ;
      wcpOAV37ColorP = AV37ColorP ;
      wcpOAV112PColNum = AV112PColNum ;
      wcpOAV36ColNumP = AV36ColNumP ;
      wcpOAV51DispCli1 = AV51DispCli1 ;
      wcpOAV53DispCli3 = AV53DispCli3 ;
      wcpOAV72HreRacab = AV72HreRacab ;
      wcpOAV97MaqCodi = AV97MaqCodi ;
      wcpOAV95maqcod3 = AV95maqcod3 ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV54EmprCod = httpContext.cgiGet( sPrefix+"AV54EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlAV54EmprCod) > 0 )
      {
         AV54EmprCod = httpContext.cgiGet( sCtrlAV54EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54EmprCod", AV54EmprCod);
      }
      else
      {
         AV54EmprCod = httpContext.cgiGet( sPrefix+"AV54EmprCod_PARM") ;
      }
      sCtrlAV60Fec1 = httpContext.cgiGet( sPrefix+"AV60Fec1_CTRL") ;
      if ( GXutil.len( sCtrlAV60Fec1) > 0 )
      {
         AV60Fec1 = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV60Fec1), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60Fec1", localUtil.format(AV60Fec1, "99/99/99"));
      }
      else
      {
         AV60Fec1 = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV60Fec1_PARM"), 0) ;
      }
      sCtrlAV62Fec3 = httpContext.cgiGet( sPrefix+"AV62Fec3_CTRL") ;
      if ( GXutil.len( sCtrlAV62Fec3) > 0 )
      {
         AV62Fec3 = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV62Fec3), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62Fec3", localUtil.format(AV62Fec3, "99/99/99"));
      }
      else
      {
         AV62Fec3 = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV62Fec3_PARM"), 0) ;
      }
      sCtrlAV111PCliCod = httpContext.cgiGet( sPrefix+"AV111PCliCod_CTRL") ;
      if ( GXutil.len( sCtrlAV111PCliCod) > 0 )
      {
         AV111PCliCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV111PCliCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV111PCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV111PCliCod), 6, 0));
      }
      else
      {
         AV111PCliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV111PCliCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV34CliCodP = httpContext.cgiGet( sPrefix+"AV34CliCodP_CTRL") ;
      if ( GXutil.len( sCtrlAV34CliCodP) > 0 )
      {
         AV34CliCodP = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV34CliCodP), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34CliCodP", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34CliCodP), 6, 0));
      }
      else
      {
         AV34CliCodP = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV34CliCodP_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV108PBarCod = httpContext.cgiGet( sPrefix+"AV108PBarCod_CTRL") ;
      if ( GXutil.len( sCtrlAV108PBarCod) > 0 )
      {
         AV108PBarCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV108PBarCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV108PBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV108PBarCod), 8, 0));
      }
      else
      {
         AV108PBarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV108PBarCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV11BarCodP = httpContext.cgiGet( sPrefix+"AV11BarCodP_CTRL") ;
      if ( GXutil.len( sCtrlAV11BarCodP) > 0 )
      {
         AV11BarCodP = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV11BarCodP), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11BarCodP", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11BarCodP), 8, 0));
      }
      else
      {
         AV11BarCodP = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV11BarCodP_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV110PBarCodReo = httpContext.cgiGet( sPrefix+"AV110PBarCodReo_CTRL") ;
      if ( GXutil.len( sCtrlAV110PBarCodReo) > 0 )
      {
         AV110PBarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV110PBarCodReo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV110PBarCodReo", GXutil.str( AV110PBarCodReo, 1, 0));
      }
      else
      {
         AV110PBarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV110PBarCodReo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV15BarCodReoP = httpContext.cgiGet( sPrefix+"AV15BarCodReoP_CTRL") ;
      if ( GXutil.len( sCtrlAV15BarCodReoP) > 0 )
      {
         AV15BarCodReoP = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV15BarCodReoP), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15BarCodReoP", GXutil.str( AV15BarCodReoP, 1, 0));
      }
      else
      {
         AV15BarCodReoP = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV15BarCodReoP_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV109PBarCodPar = httpContext.cgiGet( sPrefix+"AV109PBarCodPar_CTRL") ;
      if ( GXutil.len( sCtrlAV109PBarCodPar) > 0 )
      {
         AV109PBarCodPar = httpContext.cgiGet( sCtrlAV109PBarCodPar) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV109PBarCodPar", AV109PBarCodPar);
      }
      else
      {
         AV109PBarCodPar = httpContext.cgiGet( sPrefix+"AV109PBarCodPar_PARM") ;
      }
      sCtrlAV13BarCodParP = httpContext.cgiGet( sPrefix+"AV13BarCodParP_CTRL") ;
      if ( GXutil.len( sCtrlAV13BarCodParP) > 0 )
      {
         AV13BarCodParP = httpContext.cgiGet( sCtrlAV13BarCodParP) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13BarCodParP", AV13BarCodParP);
      }
      else
      {
         AV13BarCodParP = httpContext.cgiGet( sPrefix+"AV13BarCodParP_PARM") ;
      }
      sCtrlAV114PSerie = httpContext.cgiGet( sPrefix+"AV114PSerie_CTRL") ;
      if ( GXutil.len( sCtrlAV114PSerie) > 0 )
      {
         AV114PSerie = httpContext.cgiGet( sCtrlAV114PSerie) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV114PSerie", AV114PSerie);
      }
      else
      {
         AV114PSerie = httpContext.cgiGet( sPrefix+"AV114PSerie_PARM") ;
      }
      sCtrlAV118SerieP = httpContext.cgiGet( sPrefix+"AV118SerieP_CTRL") ;
      if ( GXutil.len( sCtrlAV118SerieP) > 0 )
      {
         AV118SerieP = httpContext.cgiGet( sCtrlAV118SerieP) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV118SerieP", AV118SerieP);
      }
      else
      {
         AV118SerieP = httpContext.cgiGet( sPrefix+"AV118SerieP_PARM") ;
      }
      sCtrlAV113PColor = httpContext.cgiGet( sPrefix+"AV113PColor_CTRL") ;
      if ( GXutil.len( sCtrlAV113PColor) > 0 )
      {
         AV113PColor = httpContext.cgiGet( sCtrlAV113PColor) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV113PColor", AV113PColor);
      }
      else
      {
         AV113PColor = httpContext.cgiGet( sPrefix+"AV113PColor_PARM") ;
      }
      sCtrlAV37ColorP = httpContext.cgiGet( sPrefix+"AV37ColorP_CTRL") ;
      if ( GXutil.len( sCtrlAV37ColorP) > 0 )
      {
         AV37ColorP = httpContext.cgiGet( sCtrlAV37ColorP) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37ColorP", AV37ColorP);
      }
      else
      {
         AV37ColorP = httpContext.cgiGet( sPrefix+"AV37ColorP_PARM") ;
      }
      sCtrlAV112PColNum = httpContext.cgiGet( sPrefix+"AV112PColNum_CTRL") ;
      if ( GXutil.len( sCtrlAV112PColNum) > 0 )
      {
         AV112PColNum = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV112PColNum), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV112PColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV112PColNum), 6, 0));
      }
      else
      {
         AV112PColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV112PColNum_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV36ColNumP = httpContext.cgiGet( sPrefix+"AV36ColNumP_CTRL") ;
      if ( GXutil.len( sCtrlAV36ColNumP) > 0 )
      {
         AV36ColNumP = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV36ColNumP), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36ColNumP", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36ColNumP), 6, 0));
      }
      else
      {
         AV36ColNumP = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV36ColNumP_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV51DispCli1 = httpContext.cgiGet( sPrefix+"AV51DispCli1_CTRL") ;
      if ( GXutil.len( sCtrlAV51DispCli1) > 0 )
      {
         AV51DispCli1 = httpContext.cgiGet( sCtrlAV51DispCli1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51DispCli1", AV51DispCli1);
      }
      else
      {
         AV51DispCli1 = httpContext.cgiGet( sPrefix+"AV51DispCli1_PARM") ;
      }
      sCtrlAV53DispCli3 = httpContext.cgiGet( sPrefix+"AV53DispCli3_CTRL") ;
      if ( GXutil.len( sCtrlAV53DispCli3) > 0 )
      {
         AV53DispCli3 = httpContext.cgiGet( sCtrlAV53DispCli3) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53DispCli3", AV53DispCli3);
      }
      else
      {
         AV53DispCli3 = httpContext.cgiGet( sPrefix+"AV53DispCli3_PARM") ;
      }
      sCtrlAV72HreRacab = httpContext.cgiGet( sPrefix+"AV72HreRacab_CTRL") ;
      if ( GXutil.len( sCtrlAV72HreRacab) > 0 )
      {
         AV72HreRacab = httpContext.cgiGet( sCtrlAV72HreRacab) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72HreRacab", AV72HreRacab);
      }
      else
      {
         AV72HreRacab = httpContext.cgiGet( sPrefix+"AV72HreRacab_PARM") ;
      }
      sCtrlAV97MaqCodi = httpContext.cgiGet( sPrefix+"AV97MaqCodi_CTRL") ;
      if ( GXutil.len( sCtrlAV97MaqCodi) > 0 )
      {
         AV97MaqCodi = httpContext.cgiGet( sCtrlAV97MaqCodi) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV97MaqCodi", AV97MaqCodi);
      }
      else
      {
         AV97MaqCodi = httpContext.cgiGet( sPrefix+"AV97MaqCodi_PARM") ;
      }
      sCtrlAV95maqcod3 = httpContext.cgiGet( sPrefix+"AV95maqcod3_CTRL") ;
      if ( GXutil.len( sCtrlAV95maqcod3) > 0 )
      {
         AV95maqcod3 = httpContext.cgiGet( sCtrlAV95maqcod3) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV95maqcod3", AV95maqcod3);
      }
      else
      {
         AV95maqcod3 = httpContext.cgiGet( sPrefix+"AV95maqcod3_PARM") ;
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
      paT92( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      wsT92( ) ;
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
      wsT92( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV54EmprCod_PARM", GXutil.rtrim( AV54EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV54EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV54EmprCod_CTRL", GXutil.rtrim( sCtrlAV54EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV60Fec1_PARM", localUtil.dtoc( AV60Fec1, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV60Fec1)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV60Fec1_CTRL", GXutil.rtrim( sCtrlAV60Fec1));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV62Fec3_PARM", localUtil.dtoc( AV62Fec3, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV62Fec3)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV62Fec3_CTRL", GXutil.rtrim( sCtrlAV62Fec3));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV111PCliCod_PARM", GXutil.ltrim( localUtil.ntoc( AV111PCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV111PCliCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV111PCliCod_CTRL", GXutil.rtrim( sCtrlAV111PCliCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV34CliCodP_PARM", GXutil.ltrim( localUtil.ntoc( AV34CliCodP, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV34CliCodP)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV34CliCodP_CTRL", GXutil.rtrim( sCtrlAV34CliCodP));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV108PBarCod_PARM", GXutil.ltrim( localUtil.ntoc( AV108PBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV108PBarCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV108PBarCod_CTRL", GXutil.rtrim( sCtrlAV108PBarCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11BarCodP_PARM", GXutil.ltrim( localUtil.ntoc( AV11BarCodP, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV11BarCodP)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11BarCodP_CTRL", GXutil.rtrim( sCtrlAV11BarCodP));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV110PBarCodReo_PARM", GXutil.ltrim( localUtil.ntoc( AV110PBarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV110PBarCodReo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV110PBarCodReo_CTRL", GXutil.rtrim( sCtrlAV110PBarCodReo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV15BarCodReoP_PARM", GXutil.ltrim( localUtil.ntoc( AV15BarCodReoP, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV15BarCodReoP)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV15BarCodReoP_CTRL", GXutil.rtrim( sCtrlAV15BarCodReoP));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV109PBarCodPar_PARM", GXutil.rtrim( AV109PBarCodPar));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV109PBarCodPar)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV109PBarCodPar_CTRL", GXutil.rtrim( sCtrlAV109PBarCodPar));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV13BarCodParP_PARM", GXutil.rtrim( AV13BarCodParP));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV13BarCodParP)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV13BarCodParP_CTRL", GXutil.rtrim( sCtrlAV13BarCodParP));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV114PSerie_PARM", GXutil.rtrim( AV114PSerie));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV114PSerie)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV114PSerie_CTRL", GXutil.rtrim( sCtrlAV114PSerie));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV118SerieP_PARM", GXutil.rtrim( AV118SerieP));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV118SerieP)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV118SerieP_CTRL", GXutil.rtrim( sCtrlAV118SerieP));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV113PColor_PARM", GXutil.rtrim( AV113PColor));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV113PColor)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV113PColor_CTRL", GXutil.rtrim( sCtrlAV113PColor));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV37ColorP_PARM", GXutil.rtrim( AV37ColorP));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV37ColorP)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV37ColorP_CTRL", GXutil.rtrim( sCtrlAV37ColorP));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV112PColNum_PARM", GXutil.ltrim( localUtil.ntoc( AV112PColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV112PColNum)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV112PColNum_CTRL", GXutil.rtrim( sCtrlAV112PColNum));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV36ColNumP_PARM", GXutil.ltrim( localUtil.ntoc( AV36ColNumP, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV36ColNumP)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV36ColNumP_CTRL", GXutil.rtrim( sCtrlAV36ColNumP));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV51DispCli1_PARM", GXutil.rtrim( AV51DispCli1));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV51DispCli1)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV51DispCli1_CTRL", GXutil.rtrim( sCtrlAV51DispCli1));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV53DispCli3_PARM", GXutil.rtrim( AV53DispCli3));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV53DispCli3)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV53DispCli3_CTRL", GXutil.rtrim( sCtrlAV53DispCli3));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV72HreRacab_PARM", GXutil.rtrim( AV72HreRacab));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV72HreRacab)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV72HreRacab_CTRL", GXutil.rtrim( sCtrlAV72HreRacab));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV97MaqCodi_PARM", GXutil.rtrim( AV97MaqCodi));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV97MaqCodi)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV97MaqCodi_CTRL", GXutil.rtrim( sCtrlAV97MaqCodi));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV95maqcod3_PARM", GXutil.rtrim( AV95maqcod3));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV95maqcod3)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV95maqcod3_CTRL", GXutil.rtrim( sCtrlAV95maqcod3));
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
      weT92( ) ;
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
      httpContext.AddStyleSheetFile("calendar-system.css", "");
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115565493", true, true);
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
      httpContext.AddJavascriptSource("wchistoricorecetaslconti.js", "?202682115565493", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_412( )
   {
      edtavDetailwebcomponent_Internalname = sPrefix+"vDETAILWEBCOMPONENT_"+sGXsfl_41_idx ;
      edtEstFecCier_Internalname = sPrefix+"ESTFECCIER_"+sGXsfl_41_idx ;
      edtEstTinNr_Internalname = sPrefix+"ESTTINNR_"+sGXsfl_41_idx ;
      edtBarnhdr_lc_Internalname = sPrefix+"BARNHDR_LC_"+sGXsfl_41_idx ;
      edtBarAgrLot_Internalname = sPrefix+"BARAGRLOT_"+sGXsfl_41_idx ;
      edtCliCod_Internalname = sPrefix+"CLICOD_"+sGXsfl_41_idx ;
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_41_idx ;
      edtBarSerTin_Internalname = sPrefix+"BARSERTIN_"+sGXsfl_41_idx ;
      edtBarDscTin_Internalname = sPrefix+"BARDSCTIN_"+sGXsfl_41_idx ;
      edtBarColNoT_Internalname = sPrefix+"BARCOLNOT_"+sGXsfl_41_idx ;
      edtBarColNuT_Internalname = sPrefix+"BARCOLNUT_"+sGXsfl_41_idx ;
      edtBarTipCoT_Internalname = sPrefix+"BARTIPCOT_"+sGXsfl_41_idx ;
      edtBarKgmTin_Internalname = sPrefix+"BARKGMTIN_"+sGXsfl_41_idx ;
      edtBarKgsTt_Internalname = sPrefix+"BARKGSTT_"+sGXsfl_41_idx ;
      edtBarMtrTin_Internalname = sPrefix+"BARMTRTIN_"+sGXsfl_41_idx ;
      edtBarMtsTt_Internalname = sPrefix+"BARMTSTT_"+sGXsfl_41_idx ;
      edtBarMaqTin_Internalname = sPrefix+"BARMAQTIN_"+sGXsfl_41_idx ;
      edtBarVolTin_Internalname = sPrefix+"BARVOLTIN_"+sGXsfl_41_idx ;
      edtavFornumarc_Internalname = sPrefix+"vFORNUMARC_"+sGXsfl_41_idx ;
      edtBarDispCli_Internalname = sPrefix+"BARDISPCLI_"+sGXsfl_41_idx ;
      edtBarNumAna_Internalname = sPrefix+"BARNUMANA_"+sGXsfl_41_idx ;
      edtavCostesi_Internalname = sPrefix+"vCOSTESI_"+sGXsfl_41_idx ;
      edtavCostesa_Internalname = sPrefix+"vCOSTESA_"+sGXsfl_41_idx ;
      edtavCostekg_Internalname = sPrefix+"vCOSTEKG_"+sGXsfl_41_idx ;
      edtavCostemt_Internalname = sPrefix+"vCOSTEMT_"+sGXsfl_41_idx ;
      edtavBarcod_Internalname = sPrefix+"vBARCOD_"+sGXsfl_41_idx ;
      edtavBarcodreo_Internalname = sPrefix+"vBARCODREO_"+sGXsfl_41_idx ;
      edtavBarcodpar_Internalname = sPrefix+"vBARCODPAR_"+sGXsfl_41_idx ;
   }

   public void subsflControlProps_fel_412( )
   {
      edtavDetailwebcomponent_Internalname = sPrefix+"vDETAILWEBCOMPONENT_"+sGXsfl_41_fel_idx ;
      edtEstFecCier_Internalname = sPrefix+"ESTFECCIER_"+sGXsfl_41_fel_idx ;
      edtEstTinNr_Internalname = sPrefix+"ESTTINNR_"+sGXsfl_41_fel_idx ;
      edtBarnhdr_lc_Internalname = sPrefix+"BARNHDR_LC_"+sGXsfl_41_fel_idx ;
      edtBarAgrLot_Internalname = sPrefix+"BARAGRLOT_"+sGXsfl_41_fel_idx ;
      edtCliCod_Internalname = sPrefix+"CLICOD_"+sGXsfl_41_fel_idx ;
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_41_fel_idx ;
      edtBarSerTin_Internalname = sPrefix+"BARSERTIN_"+sGXsfl_41_fel_idx ;
      edtBarDscTin_Internalname = sPrefix+"BARDSCTIN_"+sGXsfl_41_fel_idx ;
      edtBarColNoT_Internalname = sPrefix+"BARCOLNOT_"+sGXsfl_41_fel_idx ;
      edtBarColNuT_Internalname = sPrefix+"BARCOLNUT_"+sGXsfl_41_fel_idx ;
      edtBarTipCoT_Internalname = sPrefix+"BARTIPCOT_"+sGXsfl_41_fel_idx ;
      edtBarKgmTin_Internalname = sPrefix+"BARKGMTIN_"+sGXsfl_41_fel_idx ;
      edtBarKgsTt_Internalname = sPrefix+"BARKGSTT_"+sGXsfl_41_fel_idx ;
      edtBarMtrTin_Internalname = sPrefix+"BARMTRTIN_"+sGXsfl_41_fel_idx ;
      edtBarMtsTt_Internalname = sPrefix+"BARMTSTT_"+sGXsfl_41_fel_idx ;
      edtBarMaqTin_Internalname = sPrefix+"BARMAQTIN_"+sGXsfl_41_fel_idx ;
      edtBarVolTin_Internalname = sPrefix+"BARVOLTIN_"+sGXsfl_41_fel_idx ;
      edtavFornumarc_Internalname = sPrefix+"vFORNUMARC_"+sGXsfl_41_fel_idx ;
      edtBarDispCli_Internalname = sPrefix+"BARDISPCLI_"+sGXsfl_41_fel_idx ;
      edtBarNumAna_Internalname = sPrefix+"BARNUMANA_"+sGXsfl_41_fel_idx ;
      edtavCostesi_Internalname = sPrefix+"vCOSTESI_"+sGXsfl_41_fel_idx ;
      edtavCostesa_Internalname = sPrefix+"vCOSTESA_"+sGXsfl_41_fel_idx ;
      edtavCostekg_Internalname = sPrefix+"vCOSTEKG_"+sGXsfl_41_fel_idx ;
      edtavCostemt_Internalname = sPrefix+"vCOSTEMT_"+sGXsfl_41_fel_idx ;
      edtavBarcod_Internalname = sPrefix+"vBARCOD_"+sGXsfl_41_fel_idx ;
      edtavBarcodreo_Internalname = sPrefix+"vBARCODREO_"+sGXsfl_41_fel_idx ;
      edtavBarcodpar_Internalname = sPrefix+"vBARCODPAR_"+sGXsfl_41_fel_idx ;
   }

   public void sendrow_412( )
   {
      subsflControlProps_412( ) ;
      wbT90( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_41_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_41_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_41_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 42,'"+sPrefix+"',false,'"+sGXsfl_41_idx+"',41)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDetailwebcomponent_Internalname,GXutil.rtrim( AV230DetailWebComponent),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,42);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+"e21t92_client"+"'","","","","",edtavDetailwebcomponent_Jsonclick,Integer.valueOf(7),"Attribute","",ROClassString,"WWIconActionColumn WCD_ActionColumn","",Integer.valueOf(-1),Integer.valueOf(edtavDetailwebcomponent_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtEstFecCier_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEstFecCier_Internalname,localUtil.format(A13759EstFecCier, "99/99/99"),localUtil.format( A13759EstFecCier, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtEstFecCier_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtEstFecCier_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtEstTinNr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEstTinNr_Internalname,GXutil.ltrim( localUtil.ntoc( A1929EstTinNr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1929EstTinNr), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtEstTinNr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtEstTinNr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarnhdr_lc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarnhdr_lc_Internalname,GXutil.rtrim( A13841Barnhdr_lc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarnhdr_lc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarnhdr_lc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarAgrLot_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAgrLot_Internalname,GXutil.rtrim( A2316BarAgrLot),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarAgrLot_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarAgrLot_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCliCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCliNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarSerTin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSerTin_Internalname,GXutil.rtrim( A1936BarSerTin),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarSerTin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarSerTin_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarDscTin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarDscTin_Internalname,GXutil.rtrim( A1937BarDscTin),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarDscTin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarDscTin_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarColNoT_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNoT_Internalname,GXutil.rtrim( A1940BarColNoT),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarColNoT_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarColNoT_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarColNuT_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNuT_Internalname,GXutil.ltrim( localUtil.ntoc( A1941BarColNuT, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1941BarColNuT), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarColNuT_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarColNuT_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarTipCoT_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTipCoT_Internalname,GXutil.ltrim( localUtil.ntoc( A1942BarTipCoT, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1942BarTipCoT), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarTipCoT_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarTipCoT_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarKgmTin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarKgmTin_Internalname,GXutil.ltrim( localUtil.ntoc( A1947BarKgmTin, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A1947BarKgmTin, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarKgmTin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarKgmTin_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarKgsTt_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarKgsTt_Internalname,GXutil.ltrim( localUtil.ntoc( A8563BarKgsTt, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A8563BarKgsTt, "ZZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarKgsTt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarKgsTt_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarMtrTin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarMtrTin_Internalname,GXutil.ltrim( localUtil.ntoc( A1948BarMtrTin, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A1948BarMtrTin, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarMtrTin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarMtrTin_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarMtsTt_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarMtsTt_Internalname,GXutil.ltrim( localUtil.ntoc( A12993BarMtsTt, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A12993BarMtsTt, "ZZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarMtsTt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarMtsTt_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarMaqTin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarMaqTin_Internalname,GXutil.rtrim( A1945BarMaqTin),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarMaqTin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarMaqTin_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarVolTin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarVolTin_Internalname,GXutil.ltrim( localUtil.ntoc( A1946BarVolTin, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1946BarVolTin), "ZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarVolTin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarVolTin_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavFornumarc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavFornumarc_Enabled!=0)&&(edtavFornumarc_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 60,'"+sPrefix+"',false,'"+sGXsfl_41_idx+"',41)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavFornumarc_Internalname,GXutil.ltrim( localUtil.ntoc( AV65ForNumArc, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavFornumarc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV65ForNumArc), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV65ForNumArc), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavFornumarc_Enabled!=0)&&(edtavFornumarc_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,60);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavFornumarc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavFornumarc_Visible),Integer.valueOf(edtavFornumarc_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarDispCli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarDispCli_Internalname,GXutil.rtrim( A11762BarDispCli),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarDispCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarDispCli_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarNumAna_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNumAna_Internalname,GXutil.ltrim( localUtil.ntoc( A3650BarNumAna, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3650BarNumAna), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarNumAna_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarNumAna_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCostesi_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCostesi_Enabled!=0)&&(edtavCostesi_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 63,'"+sPrefix+"',false,'"+sGXsfl_41_idx+"',41)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostesi_Internalname,GXutil.ltrim( localUtil.ntoc( AV45CostesI, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCostesi_Enabled!=0) ? localUtil.format( AV45CostesI, "ZZZZ9.99999") : localUtil.format( AV45CostesI, "ZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+((edtavCostesi_Enabled!=0)&&(edtavCostesi_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,63);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostesi_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostesi_Visible),Integer.valueOf(edtavCostesi_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCostesa_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCostesa_Enabled!=0)&&(edtavCostesa_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 64,'"+sPrefix+"',false,'"+sGXsfl_41_idx+"',41)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostesa_Internalname,GXutil.ltrim( localUtil.ntoc( AV44CostesA, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCostesa_Enabled!=0) ? localUtil.format( AV44CostesA, "ZZZZ9.99999") : localUtil.format( AV44CostesA, "ZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+((edtavCostesa_Enabled!=0)&&(edtavCostesa_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,64);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostesa_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostesa_Visible),Integer.valueOf(edtavCostesa_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCostekg_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCostekg_Enabled!=0)&&(edtavCostekg_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 65,'"+sPrefix+"',false,'"+sGXsfl_41_idx+"',41)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostekg_Internalname,GXutil.ltrim( localUtil.ntoc( AV41CosteKg, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCostekg_Enabled!=0) ? localUtil.format( AV41CosteKg, "ZZZZ9.99999") : localUtil.format( AV41CosteKg, "ZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+((edtavCostekg_Enabled!=0)&&(edtavCostekg_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,65);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostekg_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostekg_Visible),Integer.valueOf(edtavCostekg_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCostemt_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCostemt_Enabled!=0)&&(edtavCostemt_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 66,'"+sPrefix+"',false,'"+sGXsfl_41_idx+"',41)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostemt_Internalname,GXutil.ltrim( localUtil.ntoc( AV42CosteMT, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCostemt_Enabled!=0) ? localUtil.format( AV42CosteMT, "ZZZZ9.99999") : localUtil.format( AV42CosteMT, "ZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+((edtavCostemt_Enabled!=0)&&(edtavCostemt_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,66);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostemt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostemt_Visible),Integer.valueOf(edtavCostemt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBarcod_Enabled!=0)&&(edtavBarcod_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 67,'"+sPrefix+"',false,'"+sGXsfl_41_idx+"',41)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarcod_Internalname,GXutil.ltrim( localUtil.ntoc( AV10BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBarcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV10BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV10BarCod), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavBarcod_Enabled!=0)&&(edtavBarcod_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,67);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBarcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavBarcod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBarcodreo_Enabled!=0)&&(edtavBarcodreo_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 68,'"+sPrefix+"',false,'"+sGXsfl_41_idx+"',41)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarcodreo_Internalname,GXutil.ltrim( localUtil.ntoc( AV14BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBarcodreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV14BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(AV14BarCodReo), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavBarcodreo_Enabled!=0)&&(edtavBarcodreo_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,68);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBarcodreo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavBarcodreo_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBarcodpar_Enabled!=0)&&(edtavBarcodpar_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 69,'"+sPrefix+"',false,'"+sGXsfl_41_idx+"',41)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarcodpar_Internalname,GXutil.rtrim( AV12BarCodPar),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavBarcodpar_Enabled!=0)&&(edtavBarcodpar_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,69);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBarcodpar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavBarcodpar_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashesT92( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_41_idx = ((subGrid_Islastpage==1)&&(nGXsfl_41_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_41_idx+1) ;
         sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_412( ) ;
      }
      /* End function sendrow_412 */
   }

   public void startgridcontrol41( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"41\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtEstFecCier_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtEstTinNr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( "#") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarnhdr_lc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarAgrLot_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Lote", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarSerTin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarDscTin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarColNoT_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarColNuT_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarTipCoT_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tc", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarKgmTin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kgs", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarKgsTt_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kgs Tot", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarMtrTin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Mts", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarMtsTt_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Mts Tot", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarMaqTin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarVolTin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Volumen", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavFornumarc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Ensayo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarDispCli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Disp Cli", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarNumAna_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Adi", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostesi_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Costes I", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostesa_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Costes Ad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostekg_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coste kg", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostemt_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coste mt", "")) ;
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
         GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV230DetailWebComponent));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDetailwebcomponent_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A13759EstFecCier, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtEstFecCier_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1929EstTinNr, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtEstTinNr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13841Barnhdr_lc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarnhdr_lc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A2316BarAgrLot));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarAgrLot_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCliCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A279CliNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCliNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1936BarSerTin));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarSerTin_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1937BarDscTin));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarDscTin_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1940BarColNoT));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarColNoT_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1941BarColNuT, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarColNuT_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1942BarTipCoT, (byte)(2), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarTipCoT_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1947BarKgmTin, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarKgmTin_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8563BarKgsTt, (byte)(10), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarKgsTt_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1948BarMtrTin, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarMtrTin_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12993BarMtsTt, (byte)(10), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarMtsTt_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1945BarMaqTin));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarMaqTin_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1946BarVolTin, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarVolTin_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV65ForNumArc, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavFornumarc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavFornumarc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A11762BarDispCli));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarDispCli_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3650BarNumAna, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarNumAna_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV45CostesI, (byte)(11), (byte)(5), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostesi_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostesi_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV44CostesA, (byte)(11), (byte)(5), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostesa_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostesa_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV41CosteKg, (byte)(11), (byte)(5), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostekg_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostekg_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV42CosteMT, (byte)(11), (byte)(5), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostemt_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostemt_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV10BarCod, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV14BarCodReo, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarcodreo_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV12BarCodPar));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarcodpar_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtavDetailwebcomponent_Internalname = sPrefix+"vDETAILWEBCOMPONENT" ;
      edtEstFecCier_Internalname = sPrefix+"ESTFECCIER" ;
      edtEstTinNr_Internalname = sPrefix+"ESTTINNR" ;
      edtBarnhdr_lc_Internalname = sPrefix+"BARNHDR_LC" ;
      edtBarAgrLot_Internalname = sPrefix+"BARAGRLOT" ;
      edtCliCod_Internalname = sPrefix+"CLICOD" ;
      edtCliNom_Internalname = sPrefix+"CLINOM" ;
      edtBarSerTin_Internalname = sPrefix+"BARSERTIN" ;
      edtBarDscTin_Internalname = sPrefix+"BARDSCTIN" ;
      edtBarColNoT_Internalname = sPrefix+"BARCOLNOT" ;
      edtBarColNuT_Internalname = sPrefix+"BARCOLNUT" ;
      edtBarTipCoT_Internalname = sPrefix+"BARTIPCOT" ;
      edtBarKgmTin_Internalname = sPrefix+"BARKGMTIN" ;
      edtBarKgsTt_Internalname = sPrefix+"BARKGSTT" ;
      edtBarMtrTin_Internalname = sPrefix+"BARMTRTIN" ;
      edtBarMtsTt_Internalname = sPrefix+"BARMTSTT" ;
      edtBarMaqTin_Internalname = sPrefix+"BARMAQTIN" ;
      edtBarVolTin_Internalname = sPrefix+"BARVOLTIN" ;
      edtavFornumarc_Internalname = sPrefix+"vFORNUMARC" ;
      edtBarDispCli_Internalname = sPrefix+"BARDISPCLI" ;
      edtBarNumAna_Internalname = sPrefix+"BARNUMANA" ;
      edtavCostesi_Internalname = sPrefix+"vCOSTESI" ;
      edtavCostesa_Internalname = sPrefix+"vCOSTESA" ;
      edtavCostekg_Internalname = sPrefix+"vCOSTEKG" ;
      edtavCostemt_Internalname = sPrefix+"vCOSTEMT" ;
      edtavBarcod_Internalname = sPrefix+"vBARCOD" ;
      edtavBarcodreo_Internalname = sPrefix+"vBARCODREO" ;
      edtavBarcodpar_Internalname = sPrefix+"vBARCODPAR" ;
      edtavTotvaluebarkgmtin_Internalname = sPrefix+"vTOTVALUEBARKGMTIN" ;
      edtavTotvaluebarmtrtin_Internalname = sPrefix+"vTOTVALUEBARMTRTIN" ;
      tblGridtabletotalizer_Internalname = sPrefix+"GRIDTABLETOTALIZER" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divCell_grid_dwc_Internalname = sPrefix+"CELL_GRID_DWC" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      Datamonjs_Internalname = sPrefix+"DATAMONJS" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
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
      edtavBarcodpar_Jsonclick = "" ;
      edtavBarcodpar_Visible = 0 ;
      edtavBarcodpar_Enabled = 1 ;
      edtavBarcodreo_Jsonclick = "" ;
      edtavBarcodreo_Visible = 0 ;
      edtavBarcodreo_Enabled = 1 ;
      edtavBarcod_Jsonclick = "" ;
      edtavBarcod_Visible = 0 ;
      edtavBarcod_Enabled = 1 ;
      edtavCostemt_Jsonclick = "" ;
      edtavCostemt_Enabled = 1 ;
      edtavCostekg_Jsonclick = "" ;
      edtavCostekg_Enabled = 1 ;
      edtavCostesa_Jsonclick = "" ;
      edtavCostesa_Enabled = 1 ;
      edtavCostesi_Jsonclick = "" ;
      edtavCostesi_Enabled = 1 ;
      edtBarNumAna_Jsonclick = "" ;
      edtBarDispCli_Jsonclick = "" ;
      edtavFornumarc_Jsonclick = "" ;
      edtavFornumarc_Enabled = 1 ;
      edtBarVolTin_Jsonclick = "" ;
      edtBarMaqTin_Jsonclick = "" ;
      edtBarMtsTt_Jsonclick = "" ;
      edtBarMtrTin_Jsonclick = "" ;
      edtBarKgsTt_Jsonclick = "" ;
      edtBarKgmTin_Jsonclick = "" ;
      edtBarTipCoT_Jsonclick = "" ;
      edtBarColNuT_Jsonclick = "" ;
      edtBarColNoT_Jsonclick = "" ;
      edtBarDscTin_Jsonclick = "" ;
      edtBarSerTin_Jsonclick = "" ;
      edtCliNom_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      edtBarAgrLot_Jsonclick = "" ;
      edtBarnhdr_lc_Jsonclick = "" ;
      edtEstTinNr_Jsonclick = "" ;
      edtEstFecCier_Jsonclick = "" ;
      edtavDetailwebcomponent_Jsonclick = "" ;
      edtavDetailwebcomponent_Visible = -1 ;
      edtavDetailwebcomponent_Enabled = 1 ;
      subGrid_Class = "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtavTotvaluebarmtrtin_Jsonclick = "" ;
      edtavTotvaluebarmtrtin_Enabled = 1 ;
      edtavTotvaluebarkgmtin_Jsonclick = "" ;
      edtavTotvaluebarkgmtin_Enabled = 1 ;
      edtavCostemt_Visible = -1 ;
      edtavCostekg_Visible = -1 ;
      edtavCostesa_Visible = -1 ;
      edtavCostesi_Visible = -1 ;
      edtBarNumAna_Visible = -1 ;
      edtBarDispCli_Visible = -1 ;
      edtavFornumarc_Visible = -1 ;
      edtBarVolTin_Visible = -1 ;
      edtBarMaqTin_Visible = -1 ;
      edtBarMtsTt_Visible = -1 ;
      edtBarMtrTin_Visible = -1 ;
      edtBarKgsTt_Visible = -1 ;
      edtBarKgmTin_Visible = -1 ;
      edtBarTipCoT_Visible = -1 ;
      edtBarColNuT_Visible = -1 ;
      edtBarColNoT_Visible = -1 ;
      edtBarDscTin_Visible = -1 ;
      edtBarSerTin_Visible = -1 ;
      edtCliNom_Visible = -1 ;
      edtCliCod_Visible = -1 ;
      edtBarAgrLot_Visible = -1 ;
      edtBarnhdr_lc_Visible = -1 ;
      edtEstTinNr_Visible = -1 ;
      edtEstFecCier_Visible = -1 ;
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
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T||T|T|T|T|T|T|T|T|T|T|T|T|T|T||T|T||||" ;
      Ddo_grid_Columnssortvalues = "1|2||3|4|5|6|7|8|9|10|11|12|13|14|15|16||17|18||||" ;
      Ddo_grid_Columnids = "1:EstFecCier|2:EstTinNr|3:Barnhdr_lconti|4:BarAgrLot|5:CliCod|6:CliNom|7:BarSerTin|8:BarDscTin|9:BarColNoT|10:BarColNuT|11:BarTipCoT|12:BarKgmTin|13:BarKgsTt|14:BarMtrTin|15:BarMtsTt|16:BarMaqTin|17:BarVolTin|18:ForNumArc|19:BarDispCli|20:BarNumAna|21:CostesI|22:CostesA|23:CosteKg|24:CosteMT" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV153ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV148ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV228FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV54EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV60Fec1',fld:'vFEC1',pic:''},{av:'AV62Fec3',fld:'vFEC3',pic:''},{av:'AV111PCliCod',fld:'vPCLICOD',pic:'ZZZZZ9'},{av:'AV34CliCodP',fld:'vCLICODP',pic:'ZZZZZ9'},{av:'AV108PBarCod',fld:'vPBARCOD',pic:'ZZZZZZZ9'},{av:'AV11BarCodP',fld:'vBARCODP',pic:'ZZZZZZZ9'},{av:'AV110PBarCodReo',fld:'vPBARCODREO',pic:'9'},{av:'AV15BarCodReoP',fld:'vBARCODREOP',pic:'9'},{av:'AV109PBarCodPar',fld:'vPBARCODPAR',pic:''},{av:'AV13BarCodParP',fld:'vBARCODPARP',pic:''},{av:'AV114PSerie',fld:'vPSERIE',pic:''},{av:'AV118SerieP',fld:'vSERIEP',pic:''},{av:'AV113PColor',fld:'vPCOLOR',pic:''},{av:'AV37ColorP',fld:'vCOLORP',pic:''},{av:'AV112PColNum',fld:'vPCOLNUM',pic:'ZZZZZ9'},{av:'AV36ColNumP',fld:'vCOLNUMP',pic:'ZZZZZ9'},{av:'AV51DispCli1',fld:'vDISPCLI1',pic:''},{av:'AV53DispCli3',fld:'vDISPCLI3',pic:''},{av:'AV72HreRacab',fld:'vHRERACAB',pic:''},{av:'AV97MaqCodi',fld:'vMAQCODI',pic:''},{av:'AV95maqcod3',fld:'vMAQCOD3',pic:''},{av:'AV235Pgmname',fld:'vPGMNAME',pic:''},{av:'AV141OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV142OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV220TotBarKgmTin',fld:'vTOTBARKGMTIN',pic:'ZZZZZ9.99',hsh:true},{av:'AV222TotBarMtrTin',fld:'vTOTBARMTRTIN',pic:'ZZZZZ9.99',hsh:true},{av:'AV216TFBarNumAna_To',fld:'vTFBARNUMANA_TO',pic:'ZZ9',hsh:true},{av:'AV215TFBarNumAna',fld:'vTFBARNUMANA',pic:'ZZ9',hsh:true},{av:'AV219TFBarDispCli_Sel',fld:'vTFBARDISPCLI_SEL',pic:'',hsh:true},{av:'AV218TFBarDispCli',fld:'vTFBARDISPCLI',pic:'',hsh:true},{av:'AV207TFBarVolTin_To',fld:'vTFBARVOLTIN_TO',pic:'ZZZZ9',hsh:true},{av:'AV206TFBarVolTin',fld:'vTFBARVOLTIN',pic:'ZZZZ9',hsh:true},{av:'AV204TFBarMaqTin_Sel',fld:'vTFBARMAQTIN_SEL',pic:'',hsh:true},{av:'AV203TFBarMaqTin',fld:'vTFBARMAQTIN',pic:'',hsh:true},{av:'AV201TFBarMtsTt_To',fld:'vTFBARMTSTT_TO',pic:'ZZZZZZ9.99',hsh:true},{av:'AV200TFBarMtsTt',fld:'vTFBARMTSTT',pic:'ZZZZZZ9.99',hsh:true},{av:'AV198TFBarMtrTin_To',fld:'vTFBARMTRTIN_TO',pic:'ZZZZZ9.99',hsh:true},{av:'AV197TFBarMtrTin',fld:'vTFBARMTRTIN',pic:'ZZZZZ9.99',hsh:true},{av:'AV195TFBarKgsTt_To',fld:'vTFBARKGSTT_TO',pic:'ZZZZZZ9.99',hsh:true},{av:'AV194TFBarKgsTt',fld:'vTFBARKGSTT',pic:'ZZZZZZ9.99',hsh:true},{av:'AV192TFBarKgmTin_To',fld:'vTFBARKGMTIN_TO',pic:'ZZZZZ9.99',hsh:true},{av:'AV191TFBarKgmTin',fld:'vTFBARKGMTIN',pic:'ZZZZZ9.99',hsh:true},{av:'AV189TFBarTipCoT_To',fld:'vTFBARTIPCOT_TO',pic:'Z9',hsh:true},{av:'AV188TFBarTipCoT',fld:'vTFBARTIPCOT',pic:'Z9',hsh:true},{av:'AV186TFBarColNuT_To',fld:'vTFBARCOLNUT_TO',pic:'ZZZZZ9',hsh:true},{av:'AV185TFBarColNuT',fld:'vTFBARCOLNUT',pic:'ZZZZZ9',hsh:true},{av:'AV183TFBarColNoT_Sel',fld:'vTFBARCOLNOT_SEL',pic:'',hsh:true},{av:'AV182TFBarColNoT',fld:'vTFBARCOLNOT',pic:'',hsh:true},{av:'AV180TFBarDscTin_Sel',fld:'vTFBARDSCTIN_SEL',pic:'',hsh:true},{av:'AV179TFBarDscTin',fld:'vTFBARDSCTIN',pic:'',hsh:true},{av:'AV177TFBarSerTin_Sel',fld:'vTFBARSERTIN_SEL',pic:'',hsh:true},{av:'AV176TFBarSerTin',fld:'vTFBARSERTIN',pic:'',hsh:true},{av:'AV174TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:'',hsh:true},{av:'AV173TFCliNom',fld:'vTFCLINOM',pic:'',hsh:true},{av:'AV171TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9',hsh:true},{av:'AV170TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV210TFBarAgrLot_Sel',fld:'vTFBARAGRLOT_SEL',pic:'',hsh:true},{av:'AV209TFBarAgrLot',fld:'vTFBARAGRLOT',pic:'',hsh:true},{av:'AV232TFBarnhdr_lconti_Sel',fld:'vTFBARNHDR_LCONTI_SEL',pic:'',hsh:true},{av:'AV231TFBarnhdr_lconti',fld:'vTFBARNHDR_LCONTI',pic:'',hsh:true},{av:'AV161TFEstTinNr_To',fld:'vTFESTTINNR_TO',pic:'ZZZ9',hsh:true},{av:'AV160TFEstTinNr',fld:'vTFESTTINNR',pic:'ZZZ9',hsh:true},{av:'AV156TFEstFecCier_To',fld:'vTFESTFECCIER_TO',pic:'',hsh:true},{av:'AV155TFEstFecCier',fld:'vTFESTFECCIER',pic:'',hsh:true},{av:'AV106num_t',fld:'vNUM_T',pic:'ZZZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13759EstFecCier',fld:'ESTFECCIER',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A1933BarCodTin',fld:'BARCODTIN',pic:'ZZZZZZZ9'},{av:'A1934BarReoTin',fld:'BARREOTIN',pic:'9'},{av:'A1935BarParTin',fld:'BARPARTIN',pic:''},{av:'A1936BarSerTin',fld:'BARSERTIN',pic:''},{av:'A1940BarColNoT',fld:'BARCOLNOT',pic:''},{av:'A1941BarColNuT',fld:'BARCOLNUT',pic:'ZZZZZ9'},{av:'A11762BarDispCli',fld:'BARDISPCLI',pic:''},{av:'A6634BarRecAcb',fld:'BARRECACB',pic:''},{av:'A1945BarMaqTin',fld:'BARMAQTIN',pic:''},{av:'A1947BarKgmTin',fld:'BARKGMTIN',pic:'ZZZZZ9.99'},{av:'A1948BarMtrTin',fld:'BARMTRTIN',pic:'ZZZZZ9.99'},{av:'A2316BarAgrLot',fld:'BARAGRLOT',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV153ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV148ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtEstFecCier_Visible',ctrl:'ESTFECCIER',prop:'Visible'},{av:'edtEstTinNr_Visible',ctrl:'ESTTINNR',prop:'Visible'},{av:'edtBarnhdr_lc_Visible',ctrl:'BARNHDR_LC',prop:'Visible'},{av:'edtBarAgrLot_Visible',ctrl:'BARAGRLOT',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtBarSerTin_Visible',ctrl:'BARSERTIN',prop:'Visible'},{av:'edtBarDscTin_Visible',ctrl:'BARDSCTIN',prop:'Visible'},{av:'edtBarColNoT_Visible',ctrl:'BARCOLNOT',prop:'Visible'},{av:'edtBarColNuT_Visible',ctrl:'BARCOLNUT',prop:'Visible'},{av:'edtBarTipCoT_Visible',ctrl:'BARTIPCOT',prop:'Visible'},{av:'edtBarKgmTin_Visible',ctrl:'BARKGMTIN',prop:'Visible'},{av:'edtBarKgsTt_Visible',ctrl:'BARKGSTT',prop:'Visible'},{av:'edtBarMtrTin_Visible',ctrl:'BARMTRTIN',prop:'Visible'},{av:'edtBarMtsTt_Visible',ctrl:'BARMTSTT',prop:'Visible'},{av:'edtBarMaqTin_Visible',ctrl:'BARMAQTIN',prop:'Visible'},{av:'edtBarVolTin_Visible',ctrl:'BARVOLTIN',prop:'Visible'},{av:'edtavFornumarc_Visible',ctrl:'vFORNUMARC',prop:'Visible'},{av:'edtBarDispCli_Visible',ctrl:'BARDISPCLI',prop:'Visible'},{av:'edtBarNumAna_Visible',ctrl:'BARNUMANA',prop:'Visible'},{av:'edtavCostesi_Visible',ctrl:'vCOSTESI',prop:'Visible'},{av:'edtavCostesa_Visible',ctrl:'vCOSTESA',prop:'Visible'},{av:'edtavCostekg_Visible',ctrl:'vCOSTEKG',prop:'Visible'},{av:'edtavCostemt_Visible',ctrl:'vCOSTEMT',prop:'Visible'},{av:'AV165GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV166GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV151ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV139GridState',fld:'vGRIDSTATE',pic:''},{av:'AV220TotBarKgmTin',fld:'vTOTBARKGMTIN',pic:'ZZZZZ9.99',hsh:true},{av:'AV222TotBarMtrTin',fld:'vTOTBARMTRTIN',pic:'ZZZZZ9.99',hsh:true},{av:'AV221TotValueBarKgmTin',fld:'vTOTVALUEBARKGMTIN',pic:''},{av:'AV223TotValueBarMtrTin',fld:'vTOTVALUEBARMTRTIN',pic:''},{av:'AV106num_t',fld:'vNUM_T',pic:'ZZZZZ9',hsh:true}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e12T92',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV228FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV54EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV60Fec1',fld:'vFEC1',pic:''},{av:'AV62Fec3',fld:'vFEC3',pic:''},{av:'AV111PCliCod',fld:'vPCLICOD',pic:'ZZZZZ9'},{av:'AV34CliCodP',fld:'vCLICODP',pic:'ZZZZZ9'},{av:'AV108PBarCod',fld:'vPBARCOD',pic:'ZZZZZZZ9'},{av:'AV11BarCodP',fld:'vBARCODP',pic:'ZZZZZZZ9'},{av:'AV110PBarCodReo',fld:'vPBARCODREO',pic:'9'},{av:'AV15BarCodReoP',fld:'vBARCODREOP',pic:'9'},{av:'AV109PBarCodPar',fld:'vPBARCODPAR',pic:''},{av:'AV13BarCodParP',fld:'vBARCODPARP',pic:''},{av:'AV114PSerie',fld:'vPSERIE',pic:''},{av:'AV118SerieP',fld:'vSERIEP',pic:''},{av:'AV113PColor',fld:'vPCOLOR',pic:''},{av:'AV37ColorP',fld:'vCOLORP',pic:''},{av:'AV112PColNum',fld:'vPCOLNUM',pic:'ZZZZZ9'},{av:'AV36ColNumP',fld:'vCOLNUMP',pic:'ZZZZZ9'},{av:'AV51DispCli1',fld:'vDISPCLI1',pic:''},{av:'AV53DispCli3',fld:'vDISPCLI3',pic:''},{av:'AV72HreRacab',fld:'vHRERACAB',pic:''},{av:'AV97MaqCodi',fld:'vMAQCODI',pic:''},{av:'AV95maqcod3',fld:'vMAQCOD3',pic:''},{av:'AV153ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV148ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV235Pgmname',fld:'vPGMNAME',pic:''},{av:'AV141OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV142OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV220TotBarKgmTin',fld:'vTOTBARKGMTIN',pic:'ZZZZZ9.99',hsh:true},{av:'AV222TotBarMtrTin',fld:'vTOTBARMTRTIN',pic:'ZZZZZ9.99',hsh:true},{av:'AV216TFBarNumAna_To',fld:'vTFBARNUMANA_TO',pic:'ZZ9',hsh:true},{av:'AV215TFBarNumAna',fld:'vTFBARNUMANA',pic:'ZZ9',hsh:true},{av:'AV219TFBarDispCli_Sel',fld:'vTFBARDISPCLI_SEL',pic:'',hsh:true},{av:'AV218TFBarDispCli',fld:'vTFBARDISPCLI',pic:'',hsh:true},{av:'AV207TFBarVolTin_To',fld:'vTFBARVOLTIN_TO',pic:'ZZZZ9',hsh:true},{av:'AV206TFBarVolTin',fld:'vTFBARVOLTIN',pic:'ZZZZ9',hsh:true},{av:'AV204TFBarMaqTin_Sel',fld:'vTFBARMAQTIN_SEL',pic:'',hsh:true},{av:'AV203TFBarMaqTin',fld:'vTFBARMAQTIN',pic:'',hsh:true},{av:'AV201TFBarMtsTt_To',fld:'vTFBARMTSTT_TO',pic:'ZZZZZZ9.99',hsh:true},{av:'AV200TFBarMtsTt',fld:'vTFBARMTSTT',pic:'ZZZZZZ9.99',hsh:true},{av:'AV198TFBarMtrTin_To',fld:'vTFBARMTRTIN_TO',pic:'ZZZZZ9.99',hsh:true},{av:'AV197TFBarMtrTin',fld:'vTFBARMTRTIN',pic:'ZZZZZ9.99',hsh:true},{av:'AV195TFBarKgsTt_To',fld:'vTFBARKGSTT_TO',pic:'ZZZZZZ9.99',hsh:true},{av:'AV194TFBarKgsTt',fld:'vTFBARKGSTT',pic:'ZZZZZZ9.99',hsh:true},{av:'AV192TFBarKgmTin_To',fld:'vTFBARKGMTIN_TO',pic:'ZZZZZ9.99',hsh:true},{av:'AV191TFBarKgmTin',fld:'vTFBARKGMTIN',pic:'ZZZZZ9.99',hsh:true},{av:'AV189TFBarTipCoT_To',fld:'vTFBARTIPCOT_TO',pic:'Z9',hsh:true},{av:'AV188TFBarTipCoT',fld:'vTFBARTIPCOT',pic:'Z9',hsh:true},{av:'AV186TFBarColNuT_To',fld:'vTFBARCOLNUT_TO',pic:'ZZZZZ9',hsh:true},{av:'AV185TFBarColNuT',fld:'vTFBARCOLNUT',pic:'ZZZZZ9',hsh:true},{av:'AV183TFBarColNoT_Sel',fld:'vTFBARCOLNOT_SEL',pic:'',hsh:true},{av:'AV182TFBarColNoT',fld:'vTFBARCOLNOT',pic:'',hsh:true},{av:'AV180TFBarDscTin_Sel',fld:'vTFBARDSCTIN_SEL',pic:'',hsh:true},{av:'AV179TFBarDscTin',fld:'vTFBARDSCTIN',pic:'',hsh:true},{av:'AV177TFBarSerTin_Sel',fld:'vTFBARSERTIN_SEL',pic:'',hsh:true},{av:'AV176TFBarSerTin',fld:'vTFBARSERTIN',pic:'',hsh:true},{av:'AV174TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:'',hsh:true},{av:'AV173TFCliNom',fld:'vTFCLINOM',pic:'',hsh:true},{av:'AV171TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9',hsh:true},{av:'AV170TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV210TFBarAgrLot_Sel',fld:'vTFBARAGRLOT_SEL',pic:'',hsh:true},{av:'AV209TFBarAgrLot',fld:'vTFBARAGRLOT',pic:'',hsh:true},{av:'AV232TFBarnhdr_lconti_Sel',fld:'vTFBARNHDR_LCONTI_SEL',pic:'',hsh:true},{av:'AV231TFBarnhdr_lconti',fld:'vTFBARNHDR_LCONTI',pic:'',hsh:true},{av:'AV161TFEstTinNr_To',fld:'vTFESTTINNR_TO',pic:'ZZZ9',hsh:true},{av:'AV160TFEstTinNr',fld:'vTFESTTINNR',pic:'ZZZ9',hsh:true},{av:'AV156TFEstFecCier_To',fld:'vTFESTFECCIER_TO',pic:'',hsh:true},{av:'AV155TFEstFecCier',fld:'vTFESTFECCIER',pic:'',hsh:true},{av:'AV106num_t',fld:'vNUM_T',pic:'ZZZZZ9',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e13T92',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV228FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV54EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV60Fec1',fld:'vFEC1',pic:''},{av:'AV62Fec3',fld:'vFEC3',pic:''},{av:'AV111PCliCod',fld:'vPCLICOD',pic:'ZZZZZ9'},{av:'AV34CliCodP',fld:'vCLICODP',pic:'ZZZZZ9'},{av:'AV108PBarCod',fld:'vPBARCOD',pic:'ZZZZZZZ9'},{av:'AV11BarCodP',fld:'vBARCODP',pic:'ZZZZZZZ9'},{av:'AV110PBarCodReo',fld:'vPBARCODREO',pic:'9'},{av:'AV15BarCodReoP',fld:'vBARCODREOP',pic:'9'},{av:'AV109PBarCodPar',fld:'vPBARCODPAR',pic:''},{av:'AV13BarCodParP',fld:'vBARCODPARP',pic:''},{av:'AV114PSerie',fld:'vPSERIE',pic:''},{av:'AV118SerieP',fld:'vSERIEP',pic:''},{av:'AV113PColor',fld:'vPCOLOR',pic:''},{av:'AV37ColorP',fld:'vCOLORP',pic:''},{av:'AV112PColNum',fld:'vPCOLNUM',pic:'ZZZZZ9'},{av:'AV36ColNumP',fld:'vCOLNUMP',pic:'ZZZZZ9'},{av:'AV51DispCli1',fld:'vDISPCLI1',pic:''},{av:'AV53DispCli3',fld:'vDISPCLI3',pic:''},{av:'AV72HreRacab',fld:'vHRERACAB',pic:''},{av:'AV97MaqCodi',fld:'vMAQCODI',pic:''},{av:'AV95maqcod3',fld:'vMAQCOD3',pic:''},{av:'AV153ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV148ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV235Pgmname',fld:'vPGMNAME',pic:''},{av:'AV141OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV142OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV220TotBarKgmTin',fld:'vTOTBARKGMTIN',pic:'ZZZZZ9.99',hsh:true},{av:'AV222TotBarMtrTin',fld:'vTOTBARMTRTIN',pic:'ZZZZZ9.99',hsh:true},{av:'AV216TFBarNumAna_To',fld:'vTFBARNUMANA_TO',pic:'ZZ9',hsh:true},{av:'AV215TFBarNumAna',fld:'vTFBARNUMANA',pic:'ZZ9',hsh:true},{av:'AV219TFBarDispCli_Sel',fld:'vTFBARDISPCLI_SEL',pic:'',hsh:true},{av:'AV218TFBarDispCli',fld:'vTFBARDISPCLI',pic:'',hsh:true},{av:'AV207TFBarVolTin_To',fld:'vTFBARVOLTIN_TO',pic:'ZZZZ9',hsh:true},{av:'AV206TFBarVolTin',fld:'vTFBARVOLTIN',pic:'ZZZZ9',hsh:true},{av:'AV204TFBarMaqTin_Sel',fld:'vTFBARMAQTIN_SEL',pic:'',hsh:true},{av:'AV203TFBarMaqTin',fld:'vTFBARMAQTIN',pic:'',hsh:true},{av:'AV201TFBarMtsTt_To',fld:'vTFBARMTSTT_TO',pic:'ZZZZZZ9.99',hsh:true},{av:'AV200TFBarMtsTt',fld:'vTFBARMTSTT',pic:'ZZZZZZ9.99',hsh:true},{av:'AV198TFBarMtrTin_To',fld:'vTFBARMTRTIN_TO',pic:'ZZZZZ9.99',hsh:true},{av:'AV197TFBarMtrTin',fld:'vTFBARMTRTIN',pic:'ZZZZZ9.99',hsh:true},{av:'AV195TFBarKgsTt_To',fld:'vTFBARKGSTT_TO',pic:'ZZZZZZ9.99',hsh:true},{av:'AV194TFBarKgsTt',fld:'vTFBARKGSTT',pic:'ZZZZZZ9.99',hsh:true},{av:'AV192TFBarKgmTin_To',fld:'vTFBARKGMTIN_TO',pic:'ZZZZZ9.99',hsh:true},{av:'AV191TFBarKgmTin',fld:'vTFBARKGMTIN',pic:'ZZZZZ9.99',hsh:true},{av:'AV189TFBarTipCoT_To',fld:'vTFBARTIPCOT_TO',pic:'Z9',hsh:true},{av:'AV188TFBarTipCoT',fld:'vTFBARTIPCOT',pic:'Z9',hsh:true},{av:'AV186TFBarColNuT_To',fld:'vTFBARCOLNUT_TO',pic:'ZZZZZ9',hsh:true},{av:'AV185TFBarColNuT',fld:'vTFBARCOLNUT',pic:'ZZZZZ9',hsh:true},{av:'AV183TFBarColNoT_Sel',fld:'vTFBARCOLNOT_SEL',pic:'',hsh:true},{av:'AV182TFBarColNoT',fld:'vTFBARCOLNOT',pic:'',hsh:true},{av:'AV180TFBarDscTin_Sel',fld:'vTFBARDSCTIN_SEL',pic:'',hsh:true},{av:'AV179TFBarDscTin',fld:'vTFBARDSCTIN',pic:'',hsh:true},{av:'AV177TFBarSerTin_Sel',fld:'vTFBARSERTIN_SEL',pic:'',hsh:true},{av:'AV176TFBarSerTin',fld:'vTFBARSERTIN',pic:'',hsh:true},{av:'AV174TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:'',hsh:true},{av:'AV173TFCliNom',fld:'vTFCLINOM',pic:'',hsh:true},{av:'AV171TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9',hsh:true},{av:'AV170TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV210TFBarAgrLot_Sel',fld:'vTFBARAGRLOT_SEL',pic:'',hsh:true},{av:'AV209TFBarAgrLot',fld:'vTFBARAGRLOT',pic:'',hsh:true},{av:'AV232TFBarnhdr_lconti_Sel',fld:'vTFBARNHDR_LCONTI_SEL',pic:'',hsh:true},{av:'AV231TFBarnhdr_lconti',fld:'vTFBARNHDR_LCONTI',pic:'',hsh:true},{av:'AV161TFEstTinNr_To',fld:'vTFESTTINNR_TO',pic:'ZZZ9',hsh:true},{av:'AV160TFEstTinNr',fld:'vTFESTTINNR',pic:'ZZZ9',hsh:true},{av:'AV156TFEstFecCier_To',fld:'vTFESTFECCIER_TO',pic:'',hsh:true},{av:'AV155TFEstFecCier',fld:'vTFESTFECCIER',pic:'',hsh:true},{av:'AV106num_t',fld:'vNUM_T',pic:'ZZZZZ9',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e14T92',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV228FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV54EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV60Fec1',fld:'vFEC1',pic:''},{av:'AV62Fec3',fld:'vFEC3',pic:''},{av:'AV111PCliCod',fld:'vPCLICOD',pic:'ZZZZZ9'},{av:'AV34CliCodP',fld:'vCLICODP',pic:'ZZZZZ9'},{av:'AV108PBarCod',fld:'vPBARCOD',pic:'ZZZZZZZ9'},{av:'AV11BarCodP',fld:'vBARCODP',pic:'ZZZZZZZ9'},{av:'AV110PBarCodReo',fld:'vPBARCODREO',pic:'9'},{av:'AV15BarCodReoP',fld:'vBARCODREOP',pic:'9'},{av:'AV109PBarCodPar',fld:'vPBARCODPAR',pic:''},{av:'AV13BarCodParP',fld:'vBARCODPARP',pic:''},{av:'AV114PSerie',fld:'vPSERIE',pic:''},{av:'AV118SerieP',fld:'vSERIEP',pic:''},{av:'AV113PColor',fld:'vPCOLOR',pic:''},{av:'AV37ColorP',fld:'vCOLORP',pic:''},{av:'AV112PColNum',fld:'vPCOLNUM',pic:'ZZZZZ9'},{av:'AV36ColNumP',fld:'vCOLNUMP',pic:'ZZZZZ9'},{av:'AV51DispCli1',fld:'vDISPCLI1',pic:''},{av:'AV53DispCli3',fld:'vDISPCLI3',pic:''},{av:'AV72HreRacab',fld:'vHRERACAB',pic:''},{av:'AV97MaqCodi',fld:'vMAQCODI',pic:''},{av:'AV95maqcod3',fld:'vMAQCOD3',pic:''},{av:'AV153ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV148ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV235Pgmname',fld:'vPGMNAME',pic:''},{av:'AV141OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV142OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV220TotBarKgmTin',fld:'vTOTBARKGMTIN',pic:'ZZZZZ9.99',hsh:true},{av:'AV222TotBarMtrTin',fld:'vTOTBARMTRTIN',pic:'ZZZZZ9.99',hsh:true},{av:'AV216TFBarNumAna_To',fld:'vTFBARNUMANA_TO',pic:'ZZ9',hsh:true},{av:'AV215TFBarNumAna',fld:'vTFBARNUMANA',pic:'ZZ9',hsh:true},{av:'AV219TFBarDispCli_Sel',fld:'vTFBARDISPCLI_SEL',pic:'',hsh:true},{av:'AV218TFBarDispCli',fld:'vTFBARDISPCLI',pic:'',hsh:true},{av:'AV207TFBarVolTin_To',fld:'vTFBARVOLTIN_TO',pic:'ZZZZ9',hsh:true},{av:'AV206TFBarVolTin',fld:'vTFBARVOLTIN',pic:'ZZZZ9',hsh:true},{av:'AV204TFBarMaqTin_Sel',fld:'vTFBARMAQTIN_SEL',pic:'',hsh:true},{av:'AV203TFBarMaqTin',fld:'vTFBARMAQTIN',pic:'',hsh:true},{av:'AV201TFBarMtsTt_To',fld:'vTFBARMTSTT_TO',pic:'ZZZZZZ9.99',hsh:true},{av:'AV200TFBarMtsTt',fld:'vTFBARMTSTT',pic:'ZZZZZZ9.99',hsh:true},{av:'AV198TFBarMtrTin_To',fld:'vTFBARMTRTIN_TO',pic:'ZZZZZ9.99',hsh:true},{av:'AV197TFBarMtrTin',fld:'vTFBARMTRTIN',pic:'ZZZZZ9.99',hsh:true},{av:'AV195TFBarKgsTt_To',fld:'vTFBARKGSTT_TO',pic:'ZZZZZZ9.99',hsh:true},{av:'AV194TFBarKgsTt',fld:'vTFBARKGSTT',pic:'ZZZZZZ9.99',hsh:true},{av:'AV192TFBarKgmTin_To',fld:'vTFBARKGMTIN_TO',pic:'ZZZZZ9.99',hsh:true},{av:'AV191TFBarKgmTin',fld:'vTFBARKGMTIN',pic:'ZZZZZ9.99',hsh:true},{av:'AV189TFBarTipCoT_To',fld:'vTFBARTIPCOT_TO',pic:'Z9',hsh:true},{av:'AV188TFBarTipCoT',fld:'vTFBARTIPCOT',pic:'Z9',hsh:true},{av:'AV186TFBarColNuT_To',fld:'vTFBARCOLNUT_TO',pic:'ZZZZZ9',hsh:true},{av:'AV185TFBarColNuT',fld:'vTFBARCOLNUT',pic:'ZZZZZ9',hsh:true},{av:'AV183TFBarColNoT_Sel',fld:'vTFBARCOLNOT_SEL',pic:'',hsh:true},{av:'AV182TFBarColNoT',fld:'vTFBARCOLNOT',pic:'',hsh:true},{av:'AV180TFBarDscTin_Sel',fld:'vTFBARDSCTIN_SEL',pic:'',hsh:true},{av:'AV179TFBarDscTin',fld:'vTFBARDSCTIN',pic:'',hsh:true},{av:'AV177TFBarSerTin_Sel',fld:'vTFBARSERTIN_SEL',pic:'',hsh:true},{av:'AV176TFBarSerTin',fld:'vTFBARSERTIN',pic:'',hsh:true},{av:'AV174TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:'',hsh:true},{av:'AV173TFCliNom',fld:'vTFCLINOM',pic:'',hsh:true},{av:'AV171TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9',hsh:true},{av:'AV170TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV210TFBarAgrLot_Sel',fld:'vTFBARAGRLOT_SEL',pic:'',hsh:true},{av:'AV209TFBarAgrLot',fld:'vTFBARAGRLOT',pic:'',hsh:true},{av:'AV232TFBarnhdr_lconti_Sel',fld:'vTFBARNHDR_LCONTI_SEL',pic:'',hsh:true},{av:'AV231TFBarnhdr_lconti',fld:'vTFBARNHDR_LCONTI',pic:'',hsh:true},{av:'AV161TFEstTinNr_To',fld:'vTFESTTINNR_TO',pic:'ZZZ9',hsh:true},{av:'AV160TFEstTinNr',fld:'vTFESTTINNR',pic:'ZZZ9',hsh:true},{av:'AV156TFEstFecCier_To',fld:'vTFESTFECCIER_TO',pic:'',hsh:true},{av:'AV155TFEstFecCier',fld:'vTFESTFECCIER',pic:'',hsh:true},{av:'AV106num_t',fld:'vNUM_T',pic:'ZZZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV141OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV142OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e20T92',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A1936BarSerTin',fld:'BARSERTIN',pic:''},{av:'A1940BarColNoT',fld:'BARCOLNOT',pic:''},{av:'A1941BarColNuT',fld:'BARCOLNUT',pic:'ZZZZZ9'},{av:'A1942BarTipCoT',fld:'BARTIPCOT',pic:'Z9'},{av:'A3654BarCosPD',fld:'BARCOSPD',pic:'ZZZZZZ9.99'},{av:'A3658BarCosPA',fld:'BARCOSPA',pic:'ZZZZZZ9.99'},{av:'A3705BarCosCol',fld:'BARCOSCOL',pic:'ZZZZZZ9.99'},{av:'A3656BarCosAD',fld:'BARCOSAD',pic:'ZZZZZZ9.99'},{av:'A3657BarCosAA',fld:'BARCOSAA',pic:'ZZZZZZ9.99'},{av:'A3706BarCosAnc',fld:'BARCOSANC',pic:'ZZZZZZ9.99'},{av:'A8563BarKgsTt',fld:'BARKGSTT',pic:'ZZZZZZ9.99'},{av:'A1948BarMtrTin',fld:'BARMTRTIN',pic:'ZZZZZ9.99'},{av:'A2316BarAgrLot',fld:'BARAGRLOT',pic:''}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV230DetailWebComponent',fld:'vDETAILWEBCOMPONENT',pic:''},{av:'AV65ForNumArc',fld:'vFORNUMARC',pic:'ZZZZZZZ9'},{av:'AV45CostesI',fld:'vCOSTESI',pic:'ZZZZ9.99999'},{av:'AV44CostesA',fld:'vCOSTESA',pic:'ZZZZ9.99999'},{av:'AV41CosteKg',fld:'vCOSTEKG',pic:'ZZZZ9.99999'},{av:'AV42CosteMT',fld:'vCOSTEMT',pic:'ZZZZ9.99999'},{av:'AV10BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV14BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV12BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e15T92',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV228FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV54EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV60Fec1',fld:'vFEC1',pic:''},{av:'AV62Fec3',fld:'vFEC3',pic:''},{av:'AV111PCliCod',fld:'vPCLICOD',pic:'ZZZZZ9'},{av:'AV34CliCodP',fld:'vCLICODP',pic:'ZZZZZ9'},{av:'AV108PBarCod',fld:'vPBARCOD',pic:'ZZZZZZZ9'},{av:'AV11BarCodP',fld:'vBARCODP',pic:'ZZZZZZZ9'},{av:'AV110PBarCodReo',fld:'vPBARCODREO',pic:'9'},{av:'AV15BarCodReoP',fld:'vBARCODREOP',pic:'9'},{av:'AV109PBarCodPar',fld:'vPBARCODPAR',pic:''},{av:'AV13BarCodParP',fld:'vBARCODPARP',pic:''},{av:'AV114PSerie',fld:'vPSERIE',pic:''},{av:'AV118SerieP',fld:'vSERIEP',pic:''},{av:'AV113PColor',fld:'vPCOLOR',pic:''},{av:'AV37ColorP',fld:'vCOLORP',pic:''},{av:'AV112PColNum',fld:'vPCOLNUM',pic:'ZZZZZ9'},{av:'AV36ColNumP',fld:'vCOLNUMP',pic:'ZZZZZ9'},{av:'AV51DispCli1',fld:'vDISPCLI1',pic:''},{av:'AV53DispCli3',fld:'vDISPCLI3',pic:''},{av:'AV72HreRacab',fld:'vHRERACAB',pic:''},{av:'AV97MaqCodi',fld:'vMAQCODI',pic:''},{av:'AV95maqcod3',fld:'vMAQCOD3',pic:''},{av:'AV153ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV148ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV235Pgmname',fld:'vPGMNAME',pic:''},{av:'AV141OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV142OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV220TotBarKgmTin',fld:'vTOTBARKGMTIN',pic:'ZZZZZ9.99',hsh:true},{av:'AV222TotBarMtrTin',fld:'vTOTBARMTRTIN',pic:'ZZZZZ9.99',hsh:true},{av:'AV216TFBarNumAna_To',fld:'vTFBARNUMANA_TO',pic:'ZZ9',hsh:true},{av:'AV215TFBarNumAna',fld:'vTFBARNUMANA',pic:'ZZ9',hsh:true},{av:'AV219TFBarDispCli_Sel',fld:'vTFBARDISPCLI_SEL',pic:'',hsh:true},{av:'AV218TFBarDispCli',fld:'vTFBARDISPCLI',pic:'',hsh:true},{av:'AV207TFBarVolTin_To',fld:'vTFBARVOLTIN_TO',pic:'ZZZZ9',hsh:true},{av:'AV206TFBarVolTin',fld:'vTFBARVOLTIN',pic:'ZZZZ9',hsh:true},{av:'AV204TFBarMaqTin_Sel',fld:'vTFBARMAQTIN_SEL',pic:'',hsh:true},{av:'AV203TFBarMaqTin',fld:'vTFBARMAQTIN',pic:'',hsh:true},{av:'AV201TFBarMtsTt_To',fld:'vTFBARMTSTT_TO',pic:'ZZZZZZ9.99',hsh:true},{av:'AV200TFBarMtsTt',fld:'vTFBARMTSTT',pic:'ZZZZZZ9.99',hsh:true},{av:'AV198TFBarMtrTin_To',fld:'vTFBARMTRTIN_TO',pic:'ZZZZZ9.99',hsh:true},{av:'AV197TFBarMtrTin',fld:'vTFBARMTRTIN',pic:'ZZZZZ9.99',hsh:true},{av:'AV195TFBarKgsTt_To',fld:'vTFBARKGSTT_TO',pic:'ZZZZZZ9.99',hsh:true},{av:'AV194TFBarKgsTt',fld:'vTFBARKGSTT',pic:'ZZZZZZ9.99',hsh:true},{av:'AV192TFBarKgmTin_To',fld:'vTFBARKGMTIN_TO',pic:'ZZZZZ9.99',hsh:true},{av:'AV191TFBarKgmTin',fld:'vTFBARKGMTIN',pic:'ZZZZZ9.99',hsh:true},{av:'AV189TFBarTipCoT_To',fld:'vTFBARTIPCOT_TO',pic:'Z9',hsh:true},{av:'AV188TFBarTipCoT',fld:'vTFBARTIPCOT',pic:'Z9',hsh:true},{av:'AV186TFBarColNuT_To',fld:'vTFBARCOLNUT_TO',pic:'ZZZZZ9',hsh:true},{av:'AV185TFBarColNuT',fld:'vTFBARCOLNUT',pic:'ZZZZZ9',hsh:true},{av:'AV183TFBarColNoT_Sel',fld:'vTFBARCOLNOT_SEL',pic:'',hsh:true},{av:'AV182TFBarColNoT',fld:'vTFBARCOLNOT',pic:'',hsh:true},{av:'AV180TFBarDscTin_Sel',fld:'vTFBARDSCTIN_SEL',pic:'',hsh:true},{av:'AV179TFBarDscTin',fld:'vTFBARDSCTIN',pic:'',hsh:true},{av:'AV177TFBarSerTin_Sel',fld:'vTFBARSERTIN_SEL',pic:'',hsh:true},{av:'AV176TFBarSerTin',fld:'vTFBARSERTIN',pic:'',hsh:true},{av:'AV174TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:'',hsh:true},{av:'AV173TFCliNom',fld:'vTFCLINOM',pic:'',hsh:true},{av:'AV171TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9',hsh:true},{av:'AV170TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV210TFBarAgrLot_Sel',fld:'vTFBARAGRLOT_SEL',pic:'',hsh:true},{av:'AV209TFBarAgrLot',fld:'vTFBARAGRLOT',pic:'',hsh:true},{av:'AV232TFBarnhdr_lconti_Sel',fld:'vTFBARNHDR_LCONTI_SEL',pic:'',hsh:true},{av:'AV231TFBarnhdr_lconti',fld:'vTFBARNHDR_LCONTI',pic:'',hsh:true},{av:'AV161TFEstTinNr_To',fld:'vTFESTTINNR_TO',pic:'ZZZ9',hsh:true},{av:'AV160TFEstTinNr',fld:'vTFESTTINNR',pic:'ZZZ9',hsh:true},{av:'AV156TFEstFecCier_To',fld:'vTFESTFECCIER_TO',pic:'',hsh:true},{av:'AV155TFEstFecCier',fld:'vTFESTFECCIER',pic:'',hsh:true},{av:'AV106num_t',fld:'vNUM_T',pic:'ZZZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13759EstFecCier',fld:'ESTFECCIER',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A1933BarCodTin',fld:'BARCODTIN',pic:'ZZZZZZZ9'},{av:'A1934BarReoTin',fld:'BARREOTIN',pic:'9'},{av:'A1935BarParTin',fld:'BARPARTIN',pic:''},{av:'A1936BarSerTin',fld:'BARSERTIN',pic:''},{av:'A1940BarColNoT',fld:'BARCOLNOT',pic:''},{av:'A1941BarColNuT',fld:'BARCOLNUT',pic:'ZZZZZ9'},{av:'A11762BarDispCli',fld:'BARDISPCLI',pic:''},{av:'A6634BarRecAcb',fld:'BARRECACB',pic:''},{av:'A1945BarMaqTin',fld:'BARMAQTIN',pic:''},{av:'A1947BarKgmTin',fld:'BARKGMTIN',pic:'ZZZZZ9.99'},{av:'A1948BarMtrTin',fld:'BARMTRTIN',pic:'ZZZZZ9.99'},{av:'A2316BarAgrLot',fld:'BARAGRLOT',pic:''}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV148ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV153ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtEstFecCier_Visible',ctrl:'ESTFECCIER',prop:'Visible'},{av:'edtEstTinNr_Visible',ctrl:'ESTTINNR',prop:'Visible'},{av:'edtBarnhdr_lc_Visible',ctrl:'BARNHDR_LC',prop:'Visible'},{av:'edtBarAgrLot_Visible',ctrl:'BARAGRLOT',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtBarSerTin_Visible',ctrl:'BARSERTIN',prop:'Visible'},{av:'edtBarDscTin_Visible',ctrl:'BARDSCTIN',prop:'Visible'},{av:'edtBarColNoT_Visible',ctrl:'BARCOLNOT',prop:'Visible'},{av:'edtBarColNuT_Visible',ctrl:'BARCOLNUT',prop:'Visible'},{av:'edtBarTipCoT_Visible',ctrl:'BARTIPCOT',prop:'Visible'},{av:'edtBarKgmTin_Visible',ctrl:'BARKGMTIN',prop:'Visible'},{av:'edtBarKgsTt_Visible',ctrl:'BARKGSTT',prop:'Visible'},{av:'edtBarMtrTin_Visible',ctrl:'BARMTRTIN',prop:'Visible'},{av:'edtBarMtsTt_Visible',ctrl:'BARMTSTT',prop:'Visible'},{av:'edtBarMaqTin_Visible',ctrl:'BARMAQTIN',prop:'Visible'},{av:'edtBarVolTin_Visible',ctrl:'BARVOLTIN',prop:'Visible'},{av:'edtavFornumarc_Visible',ctrl:'vFORNUMARC',prop:'Visible'},{av:'edtBarDispCli_Visible',ctrl:'BARDISPCLI',prop:'Visible'},{av:'edtBarNumAna_Visible',ctrl:'BARNUMANA',prop:'Visible'},{av:'edtavCostesi_Visible',ctrl:'vCOSTESI',prop:'Visible'},{av:'edtavCostesa_Visible',ctrl:'vCOSTESA',prop:'Visible'},{av:'edtavCostekg_Visible',ctrl:'vCOSTEKG',prop:'Visible'},{av:'edtavCostemt_Visible',ctrl:'vCOSTEMT',prop:'Visible'},{av:'AV165GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV166GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV151ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV139GridState',fld:'vGRIDSTATE',pic:''},{av:'AV220TotBarKgmTin',fld:'vTOTBARKGMTIN',pic:'ZZZZZ9.99',hsh:true},{av:'AV222TotBarMtrTin',fld:'vTOTBARMTRTIN',pic:'ZZZZZ9.99',hsh:true},{av:'AV221TotValueBarKgmTin',fld:'vTOTVALUEBARKGMTIN',pic:''},{av:'AV223TotValueBarMtrTin',fld:'vTOTVALUEBARMTRTIN',pic:''},{av:'AV106num_t',fld:'vNUM_T',pic:'ZZZZZ9',hsh:true}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e11T92',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV228FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV54EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV60Fec1',fld:'vFEC1',pic:''},{av:'AV62Fec3',fld:'vFEC3',pic:''},{av:'AV111PCliCod',fld:'vPCLICOD',pic:'ZZZZZ9'},{av:'AV34CliCodP',fld:'vCLICODP',pic:'ZZZZZ9'},{av:'AV108PBarCod',fld:'vPBARCOD',pic:'ZZZZZZZ9'},{av:'AV11BarCodP',fld:'vBARCODP',pic:'ZZZZZZZ9'},{av:'AV110PBarCodReo',fld:'vPBARCODREO',pic:'9'},{av:'AV15BarCodReoP',fld:'vBARCODREOP',pic:'9'},{av:'AV109PBarCodPar',fld:'vPBARCODPAR',pic:''},{av:'AV13BarCodParP',fld:'vBARCODPARP',pic:''},{av:'AV114PSerie',fld:'vPSERIE',pic:''},{av:'AV118SerieP',fld:'vSERIEP',pic:''},{av:'AV113PColor',fld:'vPCOLOR',pic:''},{av:'AV37ColorP',fld:'vCOLORP',pic:''},{av:'AV112PColNum',fld:'vPCOLNUM',pic:'ZZZZZ9'},{av:'AV36ColNumP',fld:'vCOLNUMP',pic:'ZZZZZ9'},{av:'AV51DispCli1',fld:'vDISPCLI1',pic:''},{av:'AV53DispCli3',fld:'vDISPCLI3',pic:''},{av:'AV72HreRacab',fld:'vHRERACAB',pic:''},{av:'AV97MaqCodi',fld:'vMAQCODI',pic:''},{av:'AV95maqcod3',fld:'vMAQCOD3',pic:''},{av:'AV153ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV148ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV235Pgmname',fld:'vPGMNAME',pic:''},{av:'AV141OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV142OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV220TotBarKgmTin',fld:'vTOTBARKGMTIN',pic:'ZZZZZ9.99',hsh:true},{av:'AV222TotBarMtrTin',fld:'vTOTBARMTRTIN',pic:'ZZZZZ9.99',hsh:true},{av:'AV216TFBarNumAna_To',fld:'vTFBARNUMANA_TO',pic:'ZZ9',hsh:true},{av:'AV215TFBarNumAna',fld:'vTFBARNUMANA',pic:'ZZ9',hsh:true},{av:'AV219TFBarDispCli_Sel',fld:'vTFBARDISPCLI_SEL',pic:'',hsh:true},{av:'AV218TFBarDispCli',fld:'vTFBARDISPCLI',pic:'',hsh:true},{av:'AV207TFBarVolTin_To',fld:'vTFBARVOLTIN_TO',pic:'ZZZZ9',hsh:true},{av:'AV206TFBarVolTin',fld:'vTFBARVOLTIN',pic:'ZZZZ9',hsh:true},{av:'AV204TFBarMaqTin_Sel',fld:'vTFBARMAQTIN_SEL',pic:'',hsh:true},{av:'AV203TFBarMaqTin',fld:'vTFBARMAQTIN',pic:'',hsh:true},{av:'AV201TFBarMtsTt_To',fld:'vTFBARMTSTT_TO',pic:'ZZZZZZ9.99',hsh:true},{av:'AV200TFBarMtsTt',fld:'vTFBARMTSTT',pic:'ZZZZZZ9.99',hsh:true},{av:'AV198TFBarMtrTin_To',fld:'vTFBARMTRTIN_TO',pic:'ZZZZZ9.99',hsh:true},{av:'AV197TFBarMtrTin',fld:'vTFBARMTRTIN',pic:'ZZZZZ9.99',hsh:true},{av:'AV195TFBarKgsTt_To',fld:'vTFBARKGSTT_TO',pic:'ZZZZZZ9.99',hsh:true},{av:'AV194TFBarKgsTt',fld:'vTFBARKGSTT',pic:'ZZZZZZ9.99',hsh:true},{av:'AV192TFBarKgmTin_To',fld:'vTFBARKGMTIN_TO',pic:'ZZZZZ9.99',hsh:true},{av:'AV191TFBarKgmTin',fld:'vTFBARKGMTIN',pic:'ZZZZZ9.99',hsh:true},{av:'AV189TFBarTipCoT_To',fld:'vTFBARTIPCOT_TO',pic:'Z9',hsh:true},{av:'AV188TFBarTipCoT',fld:'vTFBARTIPCOT',pic:'Z9',hsh:true},{av:'AV186TFBarColNuT_To',fld:'vTFBARCOLNUT_TO',pic:'ZZZZZ9',hsh:true},{av:'AV185TFBarColNuT',fld:'vTFBARCOLNUT',pic:'ZZZZZ9',hsh:true},{av:'AV183TFBarColNoT_Sel',fld:'vTFBARCOLNOT_SEL',pic:'',hsh:true},{av:'AV182TFBarColNoT',fld:'vTFBARCOLNOT',pic:'',hsh:true},{av:'AV180TFBarDscTin_Sel',fld:'vTFBARDSCTIN_SEL',pic:'',hsh:true},{av:'AV179TFBarDscTin',fld:'vTFBARDSCTIN',pic:'',hsh:true},{av:'AV177TFBarSerTin_Sel',fld:'vTFBARSERTIN_SEL',pic:'',hsh:true},{av:'AV176TFBarSerTin',fld:'vTFBARSERTIN',pic:'',hsh:true},{av:'AV174TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:'',hsh:true},{av:'AV173TFCliNom',fld:'vTFCLINOM',pic:'',hsh:true},{av:'AV171TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9',hsh:true},{av:'AV170TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV210TFBarAgrLot_Sel',fld:'vTFBARAGRLOT_SEL',pic:'',hsh:true},{av:'AV209TFBarAgrLot',fld:'vTFBARAGRLOT',pic:'',hsh:true},{av:'AV232TFBarnhdr_lconti_Sel',fld:'vTFBARNHDR_LCONTI_SEL',pic:'',hsh:true},{av:'AV231TFBarnhdr_lconti',fld:'vTFBARNHDR_LCONTI',pic:'',hsh:true},{av:'AV161TFEstTinNr_To',fld:'vTFESTTINNR_TO',pic:'ZZZ9',hsh:true},{av:'AV160TFEstTinNr',fld:'vTFESTTINNR',pic:'ZZZ9',hsh:true},{av:'AV156TFEstFecCier_To',fld:'vTFESTFECCIER_TO',pic:'',hsh:true},{av:'AV155TFEstFecCier',fld:'vTFESTFECCIER',pic:'',hsh:true},{av:'AV106num_t',fld:'vNUM_T',pic:'ZZZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV139GridState',fld:'vGRIDSTATE',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13759EstFecCier',fld:'ESTFECCIER',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A1933BarCodTin',fld:'BARCODTIN',pic:'ZZZZZZZ9'},{av:'A1934BarReoTin',fld:'BARREOTIN',pic:'9'},{av:'A1935BarParTin',fld:'BARPARTIN',pic:''},{av:'A1936BarSerTin',fld:'BARSERTIN',pic:''},{av:'A1940BarColNoT',fld:'BARCOLNOT',pic:''},{av:'A1941BarColNuT',fld:'BARCOLNUT',pic:'ZZZZZ9'},{av:'A11762BarDispCli',fld:'BARDISPCLI',pic:''},{av:'A6634BarRecAcb',fld:'BARRECACB',pic:''},{av:'A1945BarMaqTin',fld:'BARMAQTIN',pic:''},{av:'A1947BarKgmTin',fld:'BARKGMTIN',pic:'ZZZZZ9.99'},{av:'A1948BarMtrTin',fld:'BARMTRTIN',pic:'ZZZZZ9.99'},{av:'A2316BarAgrLot',fld:'BARAGRLOT',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV153ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV139GridState',fld:'vGRIDSTATE',pic:''},{av:'AV141OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV142OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV228FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV148ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtEstFecCier_Visible',ctrl:'ESTFECCIER',prop:'Visible'},{av:'edtEstTinNr_Visible',ctrl:'ESTTINNR',prop:'Visible'},{av:'edtBarnhdr_lc_Visible',ctrl:'BARNHDR_LC',prop:'Visible'},{av:'edtBarAgrLot_Visible',ctrl:'BARAGRLOT',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtBarSerTin_Visible',ctrl:'BARSERTIN',prop:'Visible'},{av:'edtBarDscTin_Visible',ctrl:'BARDSCTIN',prop:'Visible'},{av:'edtBarColNoT_Visible',ctrl:'BARCOLNOT',prop:'Visible'},{av:'edtBarColNuT_Visible',ctrl:'BARCOLNUT',prop:'Visible'},{av:'edtBarTipCoT_Visible',ctrl:'BARTIPCOT',prop:'Visible'},{av:'edtBarKgmTin_Visible',ctrl:'BARKGMTIN',prop:'Visible'},{av:'edtBarKgsTt_Visible',ctrl:'BARKGSTT',prop:'Visible'},{av:'edtBarMtrTin_Visible',ctrl:'BARMTRTIN',prop:'Visible'},{av:'edtBarMtsTt_Visible',ctrl:'BARMTSTT',prop:'Visible'},{av:'edtBarMaqTin_Visible',ctrl:'BARMAQTIN',prop:'Visible'},{av:'edtBarVolTin_Visible',ctrl:'BARVOLTIN',prop:'Visible'},{av:'edtavFornumarc_Visible',ctrl:'vFORNUMARC',prop:'Visible'},{av:'edtBarDispCli_Visible',ctrl:'BARDISPCLI',prop:'Visible'},{av:'edtBarNumAna_Visible',ctrl:'BARNUMANA',prop:'Visible'},{av:'edtavCostesi_Visible',ctrl:'vCOSTESI',prop:'Visible'},{av:'edtavCostesa_Visible',ctrl:'vCOSTESA',prop:'Visible'},{av:'edtavCostekg_Visible',ctrl:'vCOSTEKG',prop:'Visible'},{av:'edtavCostemt_Visible',ctrl:'vCOSTEMT',prop:'Visible'},{av:'AV165GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV166GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV151ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV220TotBarKgmTin',fld:'vTOTBARKGMTIN',pic:'ZZZZZ9.99',hsh:true},{av:'AV222TotBarMtrTin',fld:'vTOTBARMTRTIN',pic:'ZZZZZ9.99',hsh:true},{av:'AV221TotValueBarKgmTin',fld:'vTOTVALUEBARKGMTIN',pic:''},{av:'AV223TotValueBarMtrTin',fld:'vTOTVALUEBARMTRTIN',pic:''},{av:'AV106num_t',fld:'vNUM_T',pic:'ZZZZZ9',hsh:true}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e16T92',iparms:[]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e17T92',iparms:[]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK","{handler:'e21T92',iparms:[{av:'AV54EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV10BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV14BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV12BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'A1945BarMaqTin',fld:'BARMAQTIN',pic:''}]");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK",",oparms:[{ctrl:'GRID_DWC'}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Barcodpar',iparms:[]");
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
      wcpOAV54EmprCod = "" ;
      wcpOAV60Fec1 = GXutil.nullDate() ;
      wcpOAV62Fec3 = GXutil.nullDate() ;
      wcpOAV109PBarCodPar = "" ;
      wcpOAV13BarCodParP = "" ;
      wcpOAV114PSerie = "" ;
      wcpOAV118SerieP = "" ;
      wcpOAV113PColor = "" ;
      wcpOAV37ColorP = "" ;
      wcpOAV51DispCli1 = "" ;
      wcpOAV53DispCli3 = "" ;
      wcpOAV72HreRacab = "" ;
      wcpOAV97MaqCodi = "" ;
      wcpOAV95maqcod3 = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV54EmprCod = "" ;
      AV60Fec1 = GXutil.nullDate() ;
      AV62Fec3 = GXutil.nullDate() ;
      AV109PBarCodPar = "" ;
      AV13BarCodParP = "" ;
      AV114PSerie = "" ;
      AV118SerieP = "" ;
      AV113PColor = "" ;
      AV37ColorP = "" ;
      AV51DispCli1 = "" ;
      AV53DispCli3 = "" ;
      AV72HreRacab = "" ;
      AV97MaqCodi = "" ;
      AV95maqcod3 = "" ;
      AV228FilterFullText = "" ;
      AV148ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV235Pgmname = "" ;
      AV220TotBarKgmTin = DecimalUtil.ZERO ;
      AV222TotBarMtrTin = DecimalUtil.ZERO ;
      AV219TFBarDispCli_Sel = "" ;
      AV218TFBarDispCli = "" ;
      AV204TFBarMaqTin_Sel = "" ;
      AV203TFBarMaqTin = "" ;
      AV201TFBarMtsTt_To = DecimalUtil.ZERO ;
      AV200TFBarMtsTt = DecimalUtil.ZERO ;
      AV198TFBarMtrTin_To = DecimalUtil.ZERO ;
      AV197TFBarMtrTin = DecimalUtil.ZERO ;
      AV195TFBarKgsTt_To = DecimalUtil.ZERO ;
      AV194TFBarKgsTt = DecimalUtil.ZERO ;
      AV192TFBarKgmTin_To = DecimalUtil.ZERO ;
      AV191TFBarKgmTin = DecimalUtil.ZERO ;
      AV183TFBarColNoT_Sel = "" ;
      AV182TFBarColNoT = "" ;
      AV180TFBarDscTin_Sel = "" ;
      AV179TFBarDscTin = "" ;
      AV177TFBarSerTin_Sel = "" ;
      AV176TFBarSerTin = "" ;
      AV174TFCliNom_Sel = "" ;
      AV173TFCliNom = "" ;
      AV210TFBarAgrLot_Sel = "" ;
      AV209TFBarAgrLot = "" ;
      AV232TFBarnhdr_lconti_Sel = "" ;
      AV231TFBarnhdr_lconti = "" ;
      AV156TFEstFecCier_To = GXutil.nullDate() ;
      AV155TFEstFecCier = GXutil.nullDate() ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV151ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV163DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A396EmprCod = "" ;
      A6634BarRecAcb = "" ;
      A3654BarCosPD = DecimalUtil.ZERO ;
      A3658BarCosPA = DecimalUtil.ZERO ;
      A3705BarCosCol = DecimalUtil.ZERO ;
      A3656BarCosAD = DecimalUtil.ZERO ;
      A3657BarCosAA = DecimalUtil.ZERO ;
      A3706BarCosAnc = DecimalUtil.ZERO ;
      AV139GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      A1935BarParTin = "" ;
      Ddo_grid_Caption = "" ;
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
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      WebComp_Grid_dwc_Component = "" ;
      OldGrid_dwc = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV230DetailWebComponent = "" ;
      A13759EstFecCier = GXutil.nullDate() ;
      A13841Barnhdr_lc = "" ;
      A2316BarAgrLot = "" ;
      A279CliNom = "" ;
      A1936BarSerTin = "" ;
      A1937BarDscTin = "" ;
      A1940BarColNoT = "" ;
      A1947BarKgmTin = DecimalUtil.ZERO ;
      A8563BarKgsTt = DecimalUtil.ZERO ;
      A1948BarMtrTin = DecimalUtil.ZERO ;
      A12993BarMtsTt = DecimalUtil.ZERO ;
      A1945BarMaqTin = "" ;
      A11762BarDispCli = "" ;
      AV45CostesI = DecimalUtil.ZERO ;
      AV44CostesA = DecimalUtil.ZERO ;
      AV41CosteKg = DecimalUtil.ZERO ;
      AV42CosteMT = DecimalUtil.ZERO ;
      AV12BarCodPar = "" ;
      scmdbuf = "" ;
      lV236Wchistoricorecetaslcontids_1_filterfulltext = "" ;
      AV236Wchistoricorecetaslcontids_1_filterfulltext = "" ;
      H00T92_A3646EstTinAny = new short[1] ;
      H00T92_A3647EstTinMes = new byte[1] ;
      H00T92_A3648EstTinDia = new byte[1] ;
      H00T92_A6634BarRecAcb = new String[] {""} ;
      H00T92_n6634BarRecAcb = new boolean[] {false} ;
      H00T92_A396EmprCod = new String[] {""} ;
      H00T92_A3705BarCosCol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00T92_n3705BarCosCol = new boolean[] {false} ;
      H00T92_A3658BarCosPA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00T92_n3658BarCosPA = new boolean[] {false} ;
      H00T92_A3654BarCosPD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00T92_n3654BarCosPD = new boolean[] {false} ;
      H00T92_A3706BarCosAnc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00T92_n3706BarCosAnc = new boolean[] {false} ;
      H00T92_A3657BarCosAA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00T92_n3657BarCosAA = new boolean[] {false} ;
      H00T92_A3656BarCosAD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00T92_n3656BarCosAD = new boolean[] {false} ;
      H00T92_A3650BarNumAna = new short[1] ;
      H00T92_n3650BarNumAna = new boolean[] {false} ;
      H00T92_A11762BarDispCli = new String[] {""} ;
      H00T92_n11762BarDispCli = new boolean[] {false} ;
      H00T92_A1946BarVolTin = new int[1] ;
      H00T92_n1946BarVolTin = new boolean[] {false} ;
      H00T92_A1945BarMaqTin = new String[] {""} ;
      H00T92_n1945BarMaqTin = new boolean[] {false} ;
      H00T92_A12993BarMtsTt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00T92_n12993BarMtsTt = new boolean[] {false} ;
      H00T92_A1948BarMtrTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00T92_n1948BarMtrTin = new boolean[] {false} ;
      H00T92_A8563BarKgsTt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00T92_n8563BarKgsTt = new boolean[] {false} ;
      H00T92_A1947BarKgmTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00T92_n1947BarKgmTin = new boolean[] {false} ;
      H00T92_A1942BarTipCoT = new byte[1] ;
      H00T92_n1942BarTipCoT = new boolean[] {false} ;
      H00T92_A1941BarColNuT = new int[1] ;
      H00T92_n1941BarColNuT = new boolean[] {false} ;
      H00T92_A1940BarColNoT = new String[] {""} ;
      H00T92_n1940BarColNoT = new boolean[] {false} ;
      H00T92_A1937BarDscTin = new String[] {""} ;
      H00T92_n1937BarDscTin = new boolean[] {false} ;
      H00T92_A1936BarSerTin = new String[] {""} ;
      H00T92_n1936BarSerTin = new boolean[] {false} ;
      H00T92_A279CliNom = new String[] {""} ;
      H00T92_A252CliCod = new int[1] ;
      H00T92_A2316BarAgrLot = new String[] {""} ;
      H00T92_n2316BarAgrLot = new boolean[] {false} ;
      H00T92_A1929EstTinNr = new short[1] ;
      H00T92_A13759EstFecCier = new java.util.Date[] {GXutil.nullDate()} ;
      H00T92_A1935BarParTin = new String[] {""} ;
      H00T92_n1935BarParTin = new boolean[] {false} ;
      H00T92_A1934BarReoTin = new byte[1] ;
      H00T92_n1934BarReoTin = new boolean[] {false} ;
      H00T92_A1933BarCodTin = new int[1] ;
      H00T92_n1933BarCodTin = new boolean[] {false} ;
      H00T93_AGRID_nRecordCount = new long[1] ;
      AV221TotValueBarKgmTin = "" ;
      AV223TotValueBarMtrTin = "" ;
      hsh = "" ;
      AV120Station = "" ;
      AV55EmprNom = "" ;
      AV132UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV135WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV150Session = httpContext.getWebSession();
      AV146ColumnsSelectorXML = "" ;
      GXv_int9 = new int[1] ;
      GXv_char2 = new String[1] ;
      GXv_int10 = new int[1] ;
      GXv_int11 = new byte[1] ;
      GXv_int12 = new int[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV152ManageFiltersXml = "" ;
      AV144ExcelFilename = "" ;
      AV145ErrorMessage = "" ;
      GXv_char3 = new String[1] ;
      AV147UserCustomValue = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      AV149ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector13 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector14 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item15 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item16 = new GXBaseCollection[1] ;
      AV140GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXv_SdtWWPGridState17 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV137TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV136HTTPRequest = httpContext.getHttpRequest();
      H00T94_A3646EstTinAny = new short[1] ;
      H00T94_A3647EstTinMes = new byte[1] ;
      H00T94_A3648EstTinDia = new byte[1] ;
      H00T94_A6634BarRecAcb = new String[] {""} ;
      H00T94_n6634BarRecAcb = new boolean[] {false} ;
      H00T94_A13759EstFecCier = new java.util.Date[] {GXutil.nullDate()} ;
      H00T94_A396EmprCod = new String[] {""} ;
      H00T94_A3650BarNumAna = new short[1] ;
      H00T94_n3650BarNumAna = new boolean[] {false} ;
      H00T94_A11762BarDispCli = new String[] {""} ;
      H00T94_n11762BarDispCli = new boolean[] {false} ;
      H00T94_A1946BarVolTin = new int[1] ;
      H00T94_n1946BarVolTin = new boolean[] {false} ;
      H00T94_A1945BarMaqTin = new String[] {""} ;
      H00T94_n1945BarMaqTin = new boolean[] {false} ;
      H00T94_A12993BarMtsTt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00T94_n12993BarMtsTt = new boolean[] {false} ;
      H00T94_A1948BarMtrTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00T94_n1948BarMtrTin = new boolean[] {false} ;
      H00T94_A8563BarKgsTt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00T94_n8563BarKgsTt = new boolean[] {false} ;
      H00T94_A1947BarKgmTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00T94_n1947BarKgmTin = new boolean[] {false} ;
      H00T94_A1942BarTipCoT = new byte[1] ;
      H00T94_n1942BarTipCoT = new boolean[] {false} ;
      H00T94_A1941BarColNuT = new int[1] ;
      H00T94_n1941BarColNuT = new boolean[] {false} ;
      H00T94_A1940BarColNoT = new String[] {""} ;
      H00T94_n1940BarColNoT = new boolean[] {false} ;
      H00T94_A1937BarDscTin = new String[] {""} ;
      H00T94_n1937BarDscTin = new boolean[] {false} ;
      H00T94_A1936BarSerTin = new String[] {""} ;
      H00T94_n1936BarSerTin = new boolean[] {false} ;
      H00T94_A279CliNom = new String[] {""} ;
      H00T94_A252CliCod = new int[1] ;
      H00T94_A2316BarAgrLot = new String[] {""} ;
      H00T94_n2316BarAgrLot = new boolean[] {false} ;
      H00T94_A1929EstTinNr = new short[1] ;
      H00T94_A1935BarParTin = new String[] {""} ;
      H00T94_n1935BarParTin = new boolean[] {false} ;
      H00T94_A1934BarReoTin = new byte[1] ;
      H00T94_n1934BarReoTin = new boolean[] {false} ;
      H00T94_A1933BarCodTin = new int[1] ;
      H00T94_n1933BarCodTin = new boolean[] {false} ;
      H00T95_A3646EstTinAny = new short[1] ;
      H00T95_A3647EstTinMes = new byte[1] ;
      H00T95_A3648EstTinDia = new byte[1] ;
      H00T95_A6634BarRecAcb = new String[] {""} ;
      H00T95_n6634BarRecAcb = new boolean[] {false} ;
      H00T95_A13759EstFecCier = new java.util.Date[] {GXutil.nullDate()} ;
      H00T95_A396EmprCod = new String[] {""} ;
      H00T95_A3650BarNumAna = new short[1] ;
      H00T95_n3650BarNumAna = new boolean[] {false} ;
      H00T95_A11762BarDispCli = new String[] {""} ;
      H00T95_n11762BarDispCli = new boolean[] {false} ;
      H00T95_A1946BarVolTin = new int[1] ;
      H00T95_n1946BarVolTin = new boolean[] {false} ;
      H00T95_A1945BarMaqTin = new String[] {""} ;
      H00T95_n1945BarMaqTin = new boolean[] {false} ;
      H00T95_A12993BarMtsTt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00T95_n12993BarMtsTt = new boolean[] {false} ;
      H00T95_A1948BarMtrTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00T95_n1948BarMtrTin = new boolean[] {false} ;
      H00T95_A8563BarKgsTt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00T95_n8563BarKgsTt = new boolean[] {false} ;
      H00T95_A1947BarKgmTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00T95_n1947BarKgmTin = new boolean[] {false} ;
      H00T95_A1942BarTipCoT = new byte[1] ;
      H00T95_n1942BarTipCoT = new boolean[] {false} ;
      H00T95_A1941BarColNuT = new int[1] ;
      H00T95_n1941BarColNuT = new boolean[] {false} ;
      H00T95_A1940BarColNoT = new String[] {""} ;
      H00T95_n1940BarColNoT = new boolean[] {false} ;
      H00T95_A1937BarDscTin = new String[] {""} ;
      H00T95_n1937BarDscTin = new boolean[] {false} ;
      H00T95_A1936BarSerTin = new String[] {""} ;
      H00T95_n1936BarSerTin = new boolean[] {false} ;
      H00T95_A279CliNom = new String[] {""} ;
      H00T95_A252CliCod = new int[1] ;
      H00T95_A2316BarAgrLot = new String[] {""} ;
      H00T95_n2316BarAgrLot = new boolean[] {false} ;
      H00T95_A1929EstTinNr = new short[1] ;
      H00T95_A1935BarParTin = new String[] {""} ;
      H00T95_n1935BarParTin = new boolean[] {false} ;
      H00T95_A1934BarReoTin = new byte[1] ;
      H00T95_n1934BarReoTin = new boolean[] {false} ;
      H00T95_A1933BarCodTin = new int[1] ;
      H00T95_n1933BarCodTin = new boolean[] {false} ;
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV54EmprCod = "" ;
      sCtrlAV60Fec1 = "" ;
      sCtrlAV62Fec3 = "" ;
      sCtrlAV111PCliCod = "" ;
      sCtrlAV34CliCodP = "" ;
      sCtrlAV108PBarCod = "" ;
      sCtrlAV11BarCodP = "" ;
      sCtrlAV110PBarCodReo = "" ;
      sCtrlAV15BarCodReoP = "" ;
      sCtrlAV109PBarCodPar = "" ;
      sCtrlAV13BarCodParP = "" ;
      sCtrlAV114PSerie = "" ;
      sCtrlAV118SerieP = "" ;
      sCtrlAV113PColor = "" ;
      sCtrlAV37ColorP = "" ;
      sCtrlAV112PColNum = "" ;
      sCtrlAV36ColNumP = "" ;
      sCtrlAV51DispCli1 = "" ;
      sCtrlAV53DispCli3 = "" ;
      sCtrlAV72HreRacab = "" ;
      sCtrlAV97MaqCodi = "" ;
      sCtrlAV95maqcod3 = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wchistoricorecetaslconti__default(),
         new Object[] {
             new Object[] {
            H00T92_A3646EstTinAny, H00T92_A3647EstTinMes, H00T92_A3648EstTinDia, H00T92_A6634BarRecAcb, H00T92_n6634BarRecAcb, H00T92_A396EmprCod, H00T92_A3705BarCosCol, H00T92_n3705BarCosCol, H00T92_A3658BarCosPA, H00T92_n3658BarCosPA,
            H00T92_A3654BarCosPD, H00T92_n3654BarCosPD, H00T92_A3706BarCosAnc, H00T92_n3706BarCosAnc, H00T92_A3657BarCosAA, H00T92_n3657BarCosAA, H00T92_A3656BarCosAD, H00T92_n3656BarCosAD, H00T92_A3650BarNumAna, H00T92_n3650BarNumAna,
            H00T92_A11762BarDispCli, H00T92_n11762BarDispCli, H00T92_A1946BarVolTin, H00T92_n1946BarVolTin, H00T92_A1945BarMaqTin, H00T92_n1945BarMaqTin, H00T92_A12993BarMtsTt, H00T92_n12993BarMtsTt, H00T92_A1948BarMtrTin, H00T92_n1948BarMtrTin,
            H00T92_A8563BarKgsTt, H00T92_n8563BarKgsTt, H00T92_A1947BarKgmTin, H00T92_n1947BarKgmTin, H00T92_A1942BarTipCoT, H00T92_n1942BarTipCoT, H00T92_A1941BarColNuT, H00T92_n1941BarColNuT, H00T92_A1940BarColNoT, H00T92_n1940BarColNoT,
            H00T92_A1937BarDscTin, H00T92_n1937BarDscTin, H00T92_A1936BarSerTin, H00T92_n1936BarSerTin, H00T92_A279CliNom, H00T92_A252CliCod, H00T92_A2316BarAgrLot, H00T92_n2316BarAgrLot, H00T92_A1929EstTinNr, H00T92_A13759EstFecCier,
            H00T92_A1935BarParTin, H00T92_n1935BarParTin, H00T92_A1934BarReoTin, H00T92_n1934BarReoTin, H00T92_A1933BarCodTin, H00T92_n1933BarCodTin
            }
            , new Object[] {
            H00T93_AGRID_nRecordCount
            }
            , new Object[] {
            H00T94_A3646EstTinAny, H00T94_A3647EstTinMes, H00T94_A3648EstTinDia, H00T94_A6634BarRecAcb, H00T94_n6634BarRecAcb, H00T94_A13759EstFecCier, H00T94_A396EmprCod, H00T94_A3650BarNumAna, H00T94_n3650BarNumAna, H00T94_A11762BarDispCli,
            H00T94_n11762BarDispCli, H00T94_A1946BarVolTin, H00T94_n1946BarVolTin, H00T94_A1945BarMaqTin, H00T94_n1945BarMaqTin, H00T94_A12993BarMtsTt, H00T94_n12993BarMtsTt, H00T94_A1948BarMtrTin, H00T94_n1948BarMtrTin, H00T94_A8563BarKgsTt,
            H00T94_n8563BarKgsTt, H00T94_A1947BarKgmTin, H00T94_n1947BarKgmTin, H00T94_A1942BarTipCoT, H00T94_n1942BarTipCoT, H00T94_A1941BarColNuT, H00T94_n1941BarColNuT, H00T94_A1940BarColNoT, H00T94_n1940BarColNoT, H00T94_A1937BarDscTin,
            H00T94_n1937BarDscTin, H00T94_A1936BarSerTin, H00T94_n1936BarSerTin, H00T94_A279CliNom, H00T94_A252CliCod, H00T94_A2316BarAgrLot, H00T94_n2316BarAgrLot, H00T94_A1929EstTinNr, H00T94_A1935BarParTin, H00T94_n1935BarParTin,
            H00T94_A1934BarReoTin, H00T94_n1934BarReoTin, H00T94_A1933BarCodTin, H00T94_n1933BarCodTin
            }
            , new Object[] {
            H00T95_A3646EstTinAny, H00T95_A3647EstTinMes, H00T95_A3648EstTinDia, H00T95_A6634BarRecAcb, H00T95_n6634BarRecAcb, H00T95_A13759EstFecCier, H00T95_A396EmprCod, H00T95_A3650BarNumAna, H00T95_n3650BarNumAna, H00T95_A11762BarDispCli,
            H00T95_n11762BarDispCli, H00T95_A1946BarVolTin, H00T95_n1946BarVolTin, H00T95_A1945BarMaqTin, H00T95_n1945BarMaqTin, H00T95_A12993BarMtsTt, H00T95_n12993BarMtsTt, H00T95_A1948BarMtrTin, H00T95_n1948BarMtrTin, H00T95_A8563BarKgsTt,
            H00T95_n8563BarKgsTt, H00T95_A1947BarKgmTin, H00T95_n1947BarKgmTin, H00T95_A1942BarTipCoT, H00T95_n1942BarTipCoT, H00T95_A1941BarColNuT, H00T95_n1941BarColNuT, H00T95_A1940BarColNoT, H00T95_n1940BarColNoT, H00T95_A1937BarDscTin,
            H00T95_n1937BarDscTin, H00T95_A1936BarSerTin, H00T95_n1936BarSerTin, H00T95_A279CliNom, H00T95_A252CliCod, H00T95_A2316BarAgrLot, H00T95_n2316BarAgrLot, H00T95_A1929EstTinNr, H00T95_A1935BarParTin, H00T95_n1935BarParTin,
            H00T95_A1934BarReoTin, H00T95_n1934BarReoTin, H00T95_A1933BarCodTin, H00T95_n1933BarCodTin
            }
         }
      );
      AV235Pgmname = "WCHistoricoRecetasLconti" ;
      /* GeneXus formulas. */
      AV235Pgmname = "WCHistoricoRecetasLconti" ;
      Gx_err = (short)(0) ;
      edtavDetailwebcomponent_Enabled = 0 ;
      edtavFornumarc_Enabled = 0 ;
      edtavCostesi_Enabled = 0 ;
      edtavCostesa_Enabled = 0 ;
      edtavCostekg_Enabled = 0 ;
      edtavCostemt_Enabled = 0 ;
      edtavBarcod_Enabled = 0 ;
      edtavBarcodreo_Enabled = 0 ;
      edtavBarcodpar_Enabled = 0 ;
      edtavTotvaluebarkgmtin_Enabled = 0 ;
      edtavTotvaluebarmtrtin_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
      WebComp_Grid_dwc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte wcpOAV110PBarCodReo ;
   private byte wcpOAV15BarCodReoP ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV110PBarCodReo ;
   private byte AV15BarCodReoP ;
   private byte AV153ManageFiltersExecutionStep ;
   private byte AV189TFBarTipCoT_To ;
   private byte AV188TFBarTipCoT ;
   private byte A1934BarReoTin ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte A1942BarTipCoT ;
   private byte AV14BarCodReo ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXv_int11[] ;
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
   private short AV141OrderedBy ;
   private short AV216TFBarNumAna_To ;
   private short AV215TFBarNumAna ;
   private short AV161TFEstTinNr_To ;
   private short AV160TFEstTinNr ;
   private short wbEnd ;
   private short wbStart ;
   private short A1929EstTinNr ;
   private short A3650BarNumAna ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV111PCliCod ;
   private int wcpOAV34CliCodP ;
   private int wcpOAV108PBarCod ;
   private int wcpOAV11BarCodP ;
   private int wcpOAV112PColNum ;
   private int wcpOAV36ColNumP ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_41 ;
   private int AV111PCliCod ;
   private int AV34CliCodP ;
   private int AV108PBarCod ;
   private int AV11BarCodP ;
   private int AV112PColNum ;
   private int AV36ColNumP ;
   private int nGXsfl_41_idx=1 ;
   private int AV207TFBarVolTin_To ;
   private int AV206TFBarVolTin ;
   private int AV186TFBarColNuT_To ;
   private int AV185TFBarColNuT ;
   private int AV171TFCliCod_To ;
   private int AV170TFCliCod ;
   private int AV106num_t ;
   private int A1933BarCodTin ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavPgmname_Enabled ;
   private int A252CliCod ;
   private int A1941BarColNuT ;
   private int A1946BarVolTin ;
   private int AV65ForNumArc ;
   private int AV10BarCod ;
   private int subGrid_Islastpage ;
   private int edtavDetailwebcomponent_Enabled ;
   private int edtavFornumarc_Enabled ;
   private int edtavCostesi_Enabled ;
   private int edtavCostesa_Enabled ;
   private int edtavCostekg_Enabled ;
   private int edtavCostemt_Enabled ;
   private int edtavBarcod_Enabled ;
   private int edtavBarcodreo_Enabled ;
   private int edtavBarcodpar_Enabled ;
   private int edtavTotvaluebarkgmtin_Enabled ;
   private int edtavTotvaluebarmtrtin_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int edtEstFecCier_Visible ;
   private int edtEstTinNr_Visible ;
   private int edtBarnhdr_lc_Visible ;
   private int edtBarAgrLot_Visible ;
   private int edtCliCod_Visible ;
   private int edtCliNom_Visible ;
   private int edtBarSerTin_Visible ;
   private int edtBarDscTin_Visible ;
   private int edtBarColNoT_Visible ;
   private int edtBarColNuT_Visible ;
   private int edtBarTipCoT_Visible ;
   private int edtBarKgmTin_Visible ;
   private int edtBarKgsTt_Visible ;
   private int edtBarMtrTin_Visible ;
   private int edtBarMtsTt_Visible ;
   private int edtBarMaqTin_Visible ;
   private int edtBarVolTin_Visible ;
   private int edtavFornumarc_Visible ;
   private int edtBarDispCli_Visible ;
   private int edtBarNumAna_Visible ;
   private int edtavCostesi_Visible ;
   private int edtavCostesa_Visible ;
   private int edtavCostekg_Visible ;
   private int edtavCostemt_Visible ;
   private int AV164PageToGo ;
   private int GXt_int8 ;
   private int GXv_int9[] ;
   private int GXv_int10[] ;
   private int GXv_int12[] ;
   private int AV237GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavDetailwebcomponent_Visible ;
   private int edtavBarcod_Visible ;
   private int edtavBarcodreo_Visible ;
   private int edtavBarcodpar_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV165GridCurrentPage ;
   private long AV166GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV220TotBarKgmTin ;
   private java.math.BigDecimal AV222TotBarMtrTin ;
   private java.math.BigDecimal AV201TFBarMtsTt_To ;
   private java.math.BigDecimal AV200TFBarMtsTt ;
   private java.math.BigDecimal AV198TFBarMtrTin_To ;
   private java.math.BigDecimal AV197TFBarMtrTin ;
   private java.math.BigDecimal AV195TFBarKgsTt_To ;
   private java.math.BigDecimal AV194TFBarKgsTt ;
   private java.math.BigDecimal AV192TFBarKgmTin_To ;
   private java.math.BigDecimal AV191TFBarKgmTin ;
   private java.math.BigDecimal A3654BarCosPD ;
   private java.math.BigDecimal A3658BarCosPA ;
   private java.math.BigDecimal A3705BarCosCol ;
   private java.math.BigDecimal A3656BarCosAD ;
   private java.math.BigDecimal A3657BarCosAA ;
   private java.math.BigDecimal A3706BarCosAnc ;
   private java.math.BigDecimal A1947BarKgmTin ;
   private java.math.BigDecimal A8563BarKgsTt ;
   private java.math.BigDecimal A1948BarMtrTin ;
   private java.math.BigDecimal A12993BarMtsTt ;
   private java.math.BigDecimal AV45CostesI ;
   private java.math.BigDecimal AV44CostesA ;
   private java.math.BigDecimal AV41CosteKg ;
   private java.math.BigDecimal AV42CosteMT ;
   private String wcpOAV54EmprCod ;
   private String wcpOAV109PBarCodPar ;
   private String wcpOAV13BarCodParP ;
   private String wcpOAV114PSerie ;
   private String wcpOAV118SerieP ;
   private String wcpOAV113PColor ;
   private String wcpOAV37ColorP ;
   private String wcpOAV51DispCli1 ;
   private String wcpOAV53DispCli3 ;
   private String wcpOAV72HreRacab ;
   private String wcpOAV97MaqCodi ;
   private String wcpOAV95maqcod3 ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV54EmprCod ;
   private String AV109PBarCodPar ;
   private String AV13BarCodParP ;
   private String AV114PSerie ;
   private String AV118SerieP ;
   private String AV113PColor ;
   private String AV37ColorP ;
   private String AV51DispCli1 ;
   private String AV53DispCli3 ;
   private String AV72HreRacab ;
   private String AV97MaqCodi ;
   private String AV95maqcod3 ;
   private String sGXsfl_41_idx="0001" ;
   private String AV235Pgmname ;
   private String AV219TFBarDispCli_Sel ;
   private String AV218TFBarDispCli ;
   private String AV204TFBarMaqTin_Sel ;
   private String AV203TFBarMaqTin ;
   private String AV183TFBarColNoT_Sel ;
   private String AV182TFBarColNoT ;
   private String AV180TFBarDscTin_Sel ;
   private String AV179TFBarDscTin ;
   private String AV177TFBarSerTin_Sel ;
   private String AV176TFBarSerTin ;
   private String AV174TFCliNom_Sel ;
   private String AV173TFCliNom ;
   private String AV210TFBarAgrLot_Sel ;
   private String AV209TFBarAgrLot ;
   private String AV232TFBarnhdr_lconti_Sel ;
   private String AV231TFBarnhdr_lconti ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A396EmprCod ;
   private String A6634BarRecAcb ;
   private String A1935BarParTin ;
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
   private String Ddo_grid_Gridinternalname ;
   private String Ddo_grid_Columnids ;
   private String Ddo_grid_Columnssortvalues ;
   private String Ddo_grid_Includesortasc ;
   private String Ddo_grid_Fixable ;
   private String Ddo_grid_Sortedstatus ;
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
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavDetailwebcomponent_Internalname ;
   private String AV230DetailWebComponent ;
   private String edtEstFecCier_Internalname ;
   private String edtEstTinNr_Internalname ;
   private String A13841Barnhdr_lc ;
   private String edtBarnhdr_lc_Internalname ;
   private String A2316BarAgrLot ;
   private String edtBarAgrLot_Internalname ;
   private String edtCliCod_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Internalname ;
   private String A1936BarSerTin ;
   private String edtBarSerTin_Internalname ;
   private String A1937BarDscTin ;
   private String edtBarDscTin_Internalname ;
   private String A1940BarColNoT ;
   private String edtBarColNoT_Internalname ;
   private String edtBarColNuT_Internalname ;
   private String edtBarTipCoT_Internalname ;
   private String edtBarKgmTin_Internalname ;
   private String edtBarKgsTt_Internalname ;
   private String edtBarMtrTin_Internalname ;
   private String edtBarMtsTt_Internalname ;
   private String A1945BarMaqTin ;
   private String edtBarMaqTin_Internalname ;
   private String edtBarVolTin_Internalname ;
   private String edtavFornumarc_Internalname ;
   private String A11762BarDispCli ;
   private String edtBarDispCli_Internalname ;
   private String edtBarNumAna_Internalname ;
   private String edtavCostesi_Internalname ;
   private String edtavCostesa_Internalname ;
   private String edtavCostekg_Internalname ;
   private String edtavCostemt_Internalname ;
   private String edtavBarcod_Internalname ;
   private String edtavBarcodreo_Internalname ;
   private String AV12BarCodPar ;
   private String edtavBarcodpar_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String edtavTotvaluebarkgmtin_Internalname ;
   private String edtavTotvaluebarmtrtin_Internalname ;
   private String scmdbuf ;
   private String hsh ;
   private String AV120Station ;
   private String AV55EmprNom ;
   private String AV132UsurCod ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvaluebarkgmtin_Jsonclick ;
   private String edtavTotvaluebarmtrtin_Jsonclick ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV54EmprCod ;
   private String sCtrlAV60Fec1 ;
   private String sCtrlAV62Fec3 ;
   private String sCtrlAV111PCliCod ;
   private String sCtrlAV34CliCodP ;
   private String sCtrlAV108PBarCod ;
   private String sCtrlAV11BarCodP ;
   private String sCtrlAV110PBarCodReo ;
   private String sCtrlAV15BarCodReoP ;
   private String sCtrlAV109PBarCodPar ;
   private String sCtrlAV13BarCodParP ;
   private String sCtrlAV114PSerie ;
   private String sCtrlAV118SerieP ;
   private String sCtrlAV113PColor ;
   private String sCtrlAV37ColorP ;
   private String sCtrlAV112PColNum ;
   private String sCtrlAV36ColNumP ;
   private String sCtrlAV51DispCli1 ;
   private String sCtrlAV53DispCli3 ;
   private String sCtrlAV72HreRacab ;
   private String sCtrlAV97MaqCodi ;
   private String sCtrlAV95maqcod3 ;
   private String sGXsfl_41_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavDetailwebcomponent_Jsonclick ;
   private String edtEstFecCier_Jsonclick ;
   private String edtEstTinNr_Jsonclick ;
   private String edtBarnhdr_lc_Jsonclick ;
   private String edtBarAgrLot_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtBarSerTin_Jsonclick ;
   private String edtBarDscTin_Jsonclick ;
   private String edtBarColNoT_Jsonclick ;
   private String edtBarColNuT_Jsonclick ;
   private String edtBarTipCoT_Jsonclick ;
   private String edtBarKgmTin_Jsonclick ;
   private String edtBarKgsTt_Jsonclick ;
   private String edtBarMtrTin_Jsonclick ;
   private String edtBarMtsTt_Jsonclick ;
   private String edtBarMaqTin_Jsonclick ;
   private String edtBarVolTin_Jsonclick ;
   private String edtavFornumarc_Jsonclick ;
   private String edtBarDispCli_Jsonclick ;
   private String edtBarNumAna_Jsonclick ;
   private String edtavCostesi_Jsonclick ;
   private String edtavCostesa_Jsonclick ;
   private String edtavCostekg_Jsonclick ;
   private String edtavCostemt_Jsonclick ;
   private String edtavBarcod_Jsonclick ;
   private String edtavBarcodreo_Jsonclick ;
   private String edtavBarcodpar_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV60Fec1 ;
   private java.util.Date wcpOAV62Fec3 ;
   private java.util.Date AV60Fec1 ;
   private java.util.Date AV62Fec3 ;
   private java.util.Date AV156TFEstFecCier_To ;
   private java.util.Date AV155TFEstFecCier ;
   private java.util.Date A13759EstFecCier ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV142OrderedDsc ;
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
   private boolean Grid_empowerer_Hascolumnsselector ;
   private boolean wbLoad ;
   private boolean bGXsfl_41_Refreshing=false ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n2316BarAgrLot ;
   private boolean n1936BarSerTin ;
   private boolean n1937BarDscTin ;
   private boolean n1940BarColNoT ;
   private boolean n1941BarColNuT ;
   private boolean n1942BarTipCoT ;
   private boolean n1947BarKgmTin ;
   private boolean n8563BarKgsTt ;
   private boolean n1948BarMtrTin ;
   private boolean n12993BarMtsTt ;
   private boolean n1945BarMaqTin ;
   private boolean n1946BarVolTin ;
   private boolean n11762BarDispCli ;
   private boolean n3650BarNumAna ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n6634BarRecAcb ;
   private boolean n3705BarCosCol ;
   private boolean n3658BarCosPA ;
   private boolean n3654BarCosPD ;
   private boolean n3706BarCosAnc ;
   private boolean n3657BarCosAA ;
   private boolean n3656BarCosAD ;
   private boolean n1935BarParTin ;
   private boolean n1934BarReoTin ;
   private boolean n1933BarCodTin ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV146ColumnsSelectorXML ;
   private String AV152ManageFiltersXml ;
   private String AV147UserCustomValue ;
   private String AV228FilterFullText ;
   private String lV236Wchistoricorecetaslcontids_1_filterfulltext ;
   private String AV236Wchistoricorecetaslcontids_1_filterfulltext ;
   private String AV221TotValueBarKgmTin ;
   private String AV223TotValueBarMtrTin ;
   private String AV144ExcelFilename ;
   private String AV145ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Grid_dwc ;
   private com.genexus.internet.HttpRequest AV136HTTPRequest ;
   private com.genexus.webpanels.WebSession AV150Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private short[] H00T92_A3646EstTinAny ;
   private byte[] H00T92_A3647EstTinMes ;
   private byte[] H00T92_A3648EstTinDia ;
   private String[] H00T92_A6634BarRecAcb ;
   private boolean[] H00T92_n6634BarRecAcb ;
   private String[] H00T92_A396EmprCod ;
   private java.math.BigDecimal[] H00T92_A3705BarCosCol ;
   private boolean[] H00T92_n3705BarCosCol ;
   private java.math.BigDecimal[] H00T92_A3658BarCosPA ;
   private boolean[] H00T92_n3658BarCosPA ;
   private java.math.BigDecimal[] H00T92_A3654BarCosPD ;
   private boolean[] H00T92_n3654BarCosPD ;
   private java.math.BigDecimal[] H00T92_A3706BarCosAnc ;
   private boolean[] H00T92_n3706BarCosAnc ;
   private java.math.BigDecimal[] H00T92_A3657BarCosAA ;
   private boolean[] H00T92_n3657BarCosAA ;
   private java.math.BigDecimal[] H00T92_A3656BarCosAD ;
   private boolean[] H00T92_n3656BarCosAD ;
   private short[] H00T92_A3650BarNumAna ;
   private boolean[] H00T92_n3650BarNumAna ;
   private String[] H00T92_A11762BarDispCli ;
   private boolean[] H00T92_n11762BarDispCli ;
   private int[] H00T92_A1946BarVolTin ;
   private boolean[] H00T92_n1946BarVolTin ;
   private String[] H00T92_A1945BarMaqTin ;
   private boolean[] H00T92_n1945BarMaqTin ;
   private java.math.BigDecimal[] H00T92_A12993BarMtsTt ;
   private boolean[] H00T92_n12993BarMtsTt ;
   private java.math.BigDecimal[] H00T92_A1948BarMtrTin ;
   private boolean[] H00T92_n1948BarMtrTin ;
   private java.math.BigDecimal[] H00T92_A8563BarKgsTt ;
   private boolean[] H00T92_n8563BarKgsTt ;
   private java.math.BigDecimal[] H00T92_A1947BarKgmTin ;
   private boolean[] H00T92_n1947BarKgmTin ;
   private byte[] H00T92_A1942BarTipCoT ;
   private boolean[] H00T92_n1942BarTipCoT ;
   private int[] H00T92_A1941BarColNuT ;
   private boolean[] H00T92_n1941BarColNuT ;
   private String[] H00T92_A1940BarColNoT ;
   private boolean[] H00T92_n1940BarColNoT ;
   private String[] H00T92_A1937BarDscTin ;
   private boolean[] H00T92_n1937BarDscTin ;
   private String[] H00T92_A1936BarSerTin ;
   private boolean[] H00T92_n1936BarSerTin ;
   private String[] H00T92_A279CliNom ;
   private int[] H00T92_A252CliCod ;
   private String[] H00T92_A2316BarAgrLot ;
   private boolean[] H00T92_n2316BarAgrLot ;
   private short[] H00T92_A1929EstTinNr ;
   private java.util.Date[] H00T92_A13759EstFecCier ;
   private String[] H00T92_A1935BarParTin ;
   private boolean[] H00T92_n1935BarParTin ;
   private byte[] H00T92_A1934BarReoTin ;
   private boolean[] H00T92_n1934BarReoTin ;
   private int[] H00T92_A1933BarCodTin ;
   private boolean[] H00T92_n1933BarCodTin ;
   private long[] H00T93_AGRID_nRecordCount ;
   private short[] H00T94_A3646EstTinAny ;
   private byte[] H00T94_A3647EstTinMes ;
   private byte[] H00T94_A3648EstTinDia ;
   private String[] H00T94_A6634BarRecAcb ;
   private boolean[] H00T94_n6634BarRecAcb ;
   private java.util.Date[] H00T94_A13759EstFecCier ;
   private String[] H00T94_A396EmprCod ;
   private short[] H00T94_A3650BarNumAna ;
   private boolean[] H00T94_n3650BarNumAna ;
   private String[] H00T94_A11762BarDispCli ;
   private boolean[] H00T94_n11762BarDispCli ;
   private int[] H00T94_A1946BarVolTin ;
   private boolean[] H00T94_n1946BarVolTin ;
   private String[] H00T94_A1945BarMaqTin ;
   private boolean[] H00T94_n1945BarMaqTin ;
   private java.math.BigDecimal[] H00T94_A12993BarMtsTt ;
   private boolean[] H00T94_n12993BarMtsTt ;
   private java.math.BigDecimal[] H00T94_A1948BarMtrTin ;
   private boolean[] H00T94_n1948BarMtrTin ;
   private java.math.BigDecimal[] H00T94_A8563BarKgsTt ;
   private boolean[] H00T94_n8563BarKgsTt ;
   private java.math.BigDecimal[] H00T94_A1947BarKgmTin ;
   private boolean[] H00T94_n1947BarKgmTin ;
   private byte[] H00T94_A1942BarTipCoT ;
   private boolean[] H00T94_n1942BarTipCoT ;
   private int[] H00T94_A1941BarColNuT ;
   private boolean[] H00T94_n1941BarColNuT ;
   private String[] H00T94_A1940BarColNoT ;
   private boolean[] H00T94_n1940BarColNoT ;
   private String[] H00T94_A1937BarDscTin ;
   private boolean[] H00T94_n1937BarDscTin ;
   private String[] H00T94_A1936BarSerTin ;
   private boolean[] H00T94_n1936BarSerTin ;
   private String[] H00T94_A279CliNom ;
   private int[] H00T94_A252CliCod ;
   private String[] H00T94_A2316BarAgrLot ;
   private boolean[] H00T94_n2316BarAgrLot ;
   private short[] H00T94_A1929EstTinNr ;
   private String[] H00T94_A1935BarParTin ;
   private boolean[] H00T94_n1935BarParTin ;
   private byte[] H00T94_A1934BarReoTin ;
   private boolean[] H00T94_n1934BarReoTin ;
   private int[] H00T94_A1933BarCodTin ;
   private boolean[] H00T94_n1933BarCodTin ;
   private short[] H00T95_A3646EstTinAny ;
   private byte[] H00T95_A3647EstTinMes ;
   private byte[] H00T95_A3648EstTinDia ;
   private String[] H00T95_A6634BarRecAcb ;
   private boolean[] H00T95_n6634BarRecAcb ;
   private java.util.Date[] H00T95_A13759EstFecCier ;
   private String[] H00T95_A396EmprCod ;
   private short[] H00T95_A3650BarNumAna ;
   private boolean[] H00T95_n3650BarNumAna ;
   private String[] H00T95_A11762BarDispCli ;
   private boolean[] H00T95_n11762BarDispCli ;
   private int[] H00T95_A1946BarVolTin ;
   private boolean[] H00T95_n1946BarVolTin ;
   private String[] H00T95_A1945BarMaqTin ;
   private boolean[] H00T95_n1945BarMaqTin ;
   private java.math.BigDecimal[] H00T95_A12993BarMtsTt ;
   private boolean[] H00T95_n12993BarMtsTt ;
   private java.math.BigDecimal[] H00T95_A1948BarMtrTin ;
   private boolean[] H00T95_n1948BarMtrTin ;
   private java.math.BigDecimal[] H00T95_A8563BarKgsTt ;
   private boolean[] H00T95_n8563BarKgsTt ;
   private java.math.BigDecimal[] H00T95_A1947BarKgmTin ;
   private boolean[] H00T95_n1947BarKgmTin ;
   private byte[] H00T95_A1942BarTipCoT ;
   private boolean[] H00T95_n1942BarTipCoT ;
   private int[] H00T95_A1941BarColNuT ;
   private boolean[] H00T95_n1941BarColNuT ;
   private String[] H00T95_A1940BarColNoT ;
   private boolean[] H00T95_n1940BarColNoT ;
   private String[] H00T95_A1937BarDscTin ;
   private boolean[] H00T95_n1937BarDscTin ;
   private String[] H00T95_A1936BarSerTin ;
   private boolean[] H00T95_n1936BarSerTin ;
   private String[] H00T95_A279CliNom ;
   private int[] H00T95_A252CliCod ;
   private String[] H00T95_A2316BarAgrLot ;
   private boolean[] H00T95_n2316BarAgrLot ;
   private short[] H00T95_A1929EstTinNr ;
   private String[] H00T95_A1935BarParTin ;
   private boolean[] H00T95_n1935BarParTin ;
   private byte[] H00T95_A1934BarReoTin ;
   private boolean[] H00T95_n1934BarReoTin ;
   private int[] H00T95_A1933BarCodTin ;
   private boolean[] H00T95_n1933BarCodTin ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV151ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item15 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item16[] ;
   private app.wwpbaseobjects.SdtWWPContext AV135WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV137TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV139GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState17[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV140GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV148ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV149ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector13[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector14[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV163DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class wchistoricorecetaslconti__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00T92( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV236Wchistoricorecetaslcontids_1_filterfulltext ,
                                          short A1929EstTinNr ,
                                          int A1933BarCodTin ,
                                          byte A1934BarReoTin ,
                                          String A1935BarParTin ,
                                          String A2316BarAgrLot ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A1936BarSerTin ,
                                          String A1937BarDscTin ,
                                          String A1940BarColNoT ,
                                          int A1941BarColNuT ,
                                          byte A1942BarTipCoT ,
                                          java.math.BigDecimal A1947BarKgmTin ,
                                          java.math.BigDecimal A8563BarKgsTt ,
                                          java.math.BigDecimal A1948BarMtrTin ,
                                          java.math.BigDecimal A12993BarMtsTt ,
                                          String A1945BarMaqTin ,
                                          int A1946BarVolTin ,
                                          String A11762BarDispCli ,
                                          short A3650BarNumAna ,
                                          short AV141OrderedBy ,
                                          boolean AV142OrderedDsc ,
                                          java.util.Date A13759EstFecCier ,
                                          java.util.Date AV60Fec1 ,
                                          java.util.Date AV62Fec3 ,
                                          int AV111PCliCod ,
                                          int AV34CliCodP ,
                                          int AV108PBarCod ,
                                          int AV11BarCodP ,
                                          byte AV110PBarCodReo ,
                                          byte AV15BarCodReoP ,
                                          String AV109PBarCodPar ,
                                          String AV13BarCodParP ,
                                          String AV114PSerie ,
                                          String AV118SerieP ,
                                          String AV113PColor ,
                                          String AV37ColorP ,
                                          int AV112PColNum ,
                                          int AV36ColNumP ,
                                          String AV51DispCli1 ,
                                          String AV53DispCli3 ,
                                          String A6634BarRecAcb ,
                                          String AV72HreRacab ,
                                          String AV97MaqCodi ,
                                          String AV95maqcod3 ,
                                          String AV54EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int18 = new byte[46];
      Object[] GXv_Object19 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.EstTinAny, T1.EstTinMes, T1.EstTinDia, T1.BarRecAcb, T1.EmprCod, T1.BarCosCol, T1.BarCosPA, T1.BarCosPD, T1.BarCosAnc, T1.BarCosAA, T1.BarCosAD, T1.BarNumAna," ;
      sSelectString += " T1.BarDispCli, T1.BarVolTin, T1.BarMaqTin, T1.BarMtsTt, T1.BarMtrTin, T1.BarKgsTt, T1.BarKgmTin, T1.BarTipCoT, T1.BarColNuT, T1.BarColNoT, T1.BarDscTin, T1.BarSerTin," ;
      sSelectString += " T2.CliNom, T1.CliCod, T1.BarAgrLot, T1.EstTinNr, T1.EstFecCier, T1.BarParTin, T1.BarReoTin, T1.BarCodTin" ;
      sFromString = " FROM (TXPLCONTI T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.EstFecCier >= ?)");
      addWhere(sWhereString, "(T1.EstFecCier <= ?)");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.BarCodTin >= ?)");
      addWhere(sWhereString, "(T1.BarCodTin <= ?)");
      addWhere(sWhereString, "(T1.BarReoTin >= ? and T1.BarReoTin <= ?)");
      addWhere(sWhereString, "(T1.BarParTin >= ? and T1.BarParTin <= ?)");
      addWhere(sWhereString, "(T1.BarSerTin >= ?)");
      addWhere(sWhereString, "(T1.BarSerTin <= ?)");
      addWhere(sWhereString, "(T1.BarColNoT >= ? and T1.BarColNoT <= ?)");
      addWhere(sWhereString, "(T1.BarColNuT >= ? and T1.BarColNuT <= ?)");
      addWhere(sWhereString, "(T1.BarDispCli >= ? and T1.BarDispCli <= ?)");
      addWhere(sWhereString, "(T1.BarRecAcb = ? or ? = 'T')");
      addWhere(sWhereString, "(T1.BarMaqTin >= ?)");
      addWhere(sWhereString, "(T1.BarMaqTin <= ?)");
      if ( ! (GXutil.strcmp("", AV236Wchistoricorecetaslcontids_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.EstTinNr,'9990'), 2) like '%' || ?) or ( UPPER(SUBSTR(TO_CHAR(T1.BarCodTin,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(T1.BarReoTin,'90'), 2) || T1.BarParTin) like '%' || UPPER(?)) or ( UPPER(T1.BarAgrLot) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.BarSerTin) like '%' || UPPER(?)) or ( UPPER(T1.BarDscTin) like '%' || UPPER(?)) or ( UPPER(T1.BarColNoT) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarColNuT,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarTipCoT,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarKgmTin,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarKgsTt,'9999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarMtrTin,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarMtsTt,'9999990.99'), 2) like '%' || ?) or ( UPPER(T1.BarMaqTin) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarVolTin,'99990'), 2) like '%' || ?) or ( UPPER(T1.BarDispCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarNumAna,'990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int18[23] = (byte)(1) ;
         GXv_int18[24] = (byte)(1) ;
         GXv_int18[25] = (byte)(1) ;
         GXv_int18[26] = (byte)(1) ;
         GXv_int18[27] = (byte)(1) ;
         GXv_int18[28] = (byte)(1) ;
         GXv_int18[29] = (byte)(1) ;
         GXv_int18[30] = (byte)(1) ;
         GXv_int18[31] = (byte)(1) ;
         GXv_int18[32] = (byte)(1) ;
         GXv_int18[33] = (byte)(1) ;
         GXv_int18[34] = (byte)(1) ;
         GXv_int18[35] = (byte)(1) ;
         GXv_int18[36] = (byte)(1) ;
         GXv_int18[37] = (byte)(1) ;
         GXv_int18[38] = (byte)(1) ;
         GXv_int18[39] = (byte)(1) ;
         GXv_int18[40] = (byte)(1) ;
      }
      if ( ( AV141OrderedBy == 1 ) && ! AV142OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EstFecCier" ;
      }
      else if ( ( AV141OrderedBy == 1 ) && ( AV142OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EstFecCier DESC" ;
      }
      else if ( ( AV141OrderedBy == 2 ) && ! AV142OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EstTinNr" ;
      }
      else if ( ( AV141OrderedBy == 2 ) && ( AV142OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EstTinNr DESC" ;
      }
      else if ( ( AV141OrderedBy == 3 ) && ! AV142OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarAgrLot" ;
      }
      else if ( ( AV141OrderedBy == 3 ) && ( AV142OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarAgrLot DESC" ;
      }
      else if ( ( AV141OrderedBy == 4 ) && ! AV142OrderedDsc )
      {
         sOrderString += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV141OrderedBy == 4 ) && ( AV142OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV141OrderedBy == 5 ) && ! AV142OrderedDsc )
      {
         sOrderString += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV141OrderedBy == 5 ) && ( AV142OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV141OrderedBy == 6 ) && ! AV142OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarSerTin" ;
      }
      else if ( ( AV141OrderedBy == 6 ) && ( AV142OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarSerTin DESC" ;
      }
      else if ( ( AV141OrderedBy == 7 ) && ! AV142OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarDscTin" ;
      }
      else if ( ( AV141OrderedBy == 7 ) && ( AV142OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarDscTin DESC" ;
      }
      else if ( ( AV141OrderedBy == 8 ) && ! AV142OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarColNoT" ;
      }
      else if ( ( AV141OrderedBy == 8 ) && ( AV142OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarColNoT DESC" ;
      }
      else if ( ( AV141OrderedBy == 9 ) && ! AV142OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarColNuT" ;
      }
      else if ( ( AV141OrderedBy == 9 ) && ( AV142OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarColNuT DESC" ;
      }
      else if ( ( AV141OrderedBy == 10 ) && ! AV142OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarTipCoT" ;
      }
      else if ( ( AV141OrderedBy == 10 ) && ( AV142OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarTipCoT DESC" ;
      }
      else if ( ( AV141OrderedBy == 11 ) && ! AV142OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarKgmTin" ;
      }
      else if ( ( AV141OrderedBy == 11 ) && ( AV142OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarKgmTin DESC" ;
      }
      else if ( ( AV141OrderedBy == 12 ) && ! AV142OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarKgsTt" ;
      }
      else if ( ( AV141OrderedBy == 12 ) && ( AV142OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarKgsTt DESC" ;
      }
      else if ( ( AV141OrderedBy == 13 ) && ! AV142OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarMtrTin" ;
      }
      else if ( ( AV141OrderedBy == 13 ) && ( AV142OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarMtrTin DESC" ;
      }
      else if ( ( AV141OrderedBy == 14 ) && ! AV142OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarMtsTt" ;
      }
      else if ( ( AV141OrderedBy == 14 ) && ( AV142OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarMtsTt DESC" ;
      }
      else if ( ( AV141OrderedBy == 15 ) && ! AV142OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarMaqTin" ;
      }
      else if ( ( AV141OrderedBy == 15 ) && ( AV142OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarMaqTin DESC" ;
      }
      else if ( ( AV141OrderedBy == 16 ) && ! AV142OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarVolTin" ;
      }
      else if ( ( AV141OrderedBy == 16 ) && ( AV142OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarVolTin DESC" ;
      }
      else if ( ( AV141OrderedBy == 17 ) && ! AV142OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarDispCli" ;
      }
      else if ( ( AV141OrderedBy == 17 ) && ( AV142OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarDispCli DESC" ;
      }
      else if ( ( AV141OrderedBy == 18 ) && ! AV142OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarNumAna" ;
      }
      else if ( ( AV141OrderedBy == 18 ) && ( AV142OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarNumAna DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.EstTinAny, T1.EstTinMes, T1.EstTinDia, T1.EstTinNr" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object19[0] = scmdbuf ;
      GXv_Object19[1] = GXv_int18 ;
      return GXv_Object19 ;
   }

   protected Object[] conditional_H00T93( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV236Wchistoricorecetaslcontids_1_filterfulltext ,
                                          short A1929EstTinNr ,
                                          int A1933BarCodTin ,
                                          byte A1934BarReoTin ,
                                          String A1935BarParTin ,
                                          String A2316BarAgrLot ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A1936BarSerTin ,
                                          String A1937BarDscTin ,
                                          String A1940BarColNoT ,
                                          int A1941BarColNuT ,
                                          byte A1942BarTipCoT ,
                                          java.math.BigDecimal A1947BarKgmTin ,
                                          java.math.BigDecimal A8563BarKgsTt ,
                                          java.math.BigDecimal A1948BarMtrTin ,
                                          java.math.BigDecimal A12993BarMtsTt ,
                                          String A1945BarMaqTin ,
                                          int A1946BarVolTin ,
                                          String A11762BarDispCli ,
                                          short A3650BarNumAna ,
                                          short AV141OrderedBy ,
                                          boolean AV142OrderedDsc ,
                                          java.util.Date A13759EstFecCier ,
                                          java.util.Date AV60Fec1 ,
                                          java.util.Date AV62Fec3 ,
                                          int AV111PCliCod ,
                                          int AV34CliCodP ,
                                          int AV108PBarCod ,
                                          int AV11BarCodP ,
                                          byte AV110PBarCodReo ,
                                          byte AV15BarCodReoP ,
                                          String AV109PBarCodPar ,
                                          String AV13BarCodParP ,
                                          String AV114PSerie ,
                                          String AV118SerieP ,
                                          String AV113PColor ,
                                          String AV37ColorP ,
                                          int AV112PColNum ,
                                          int AV36ColNumP ,
                                          String AV51DispCli1 ,
                                          String AV53DispCli3 ,
                                          String A6634BarRecAcb ,
                                          String AV72HreRacab ,
                                          String AV97MaqCodi ,
                                          String AV95maqcod3 ,
                                          String AV54EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int20 = new byte[43];
      Object[] GXv_Object21 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPLCONTI T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.EstFecCier >= ?)");
      addWhere(sWhereString, "(T1.EstFecCier <= ?)");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.BarCodTin >= ?)");
      addWhere(sWhereString, "(T1.BarCodTin <= ?)");
      addWhere(sWhereString, "(T1.BarReoTin >= ? and T1.BarReoTin <= ?)");
      addWhere(sWhereString, "(T1.BarParTin >= ? and T1.BarParTin <= ?)");
      addWhere(sWhereString, "(T1.BarSerTin >= ?)");
      addWhere(sWhereString, "(T1.BarSerTin <= ?)");
      addWhere(sWhereString, "(T1.BarColNoT >= ? and T1.BarColNoT <= ?)");
      addWhere(sWhereString, "(T1.BarColNuT >= ? and T1.BarColNuT <= ?)");
      addWhere(sWhereString, "(T1.BarDispCli >= ? and T1.BarDispCli <= ?)");
      addWhere(sWhereString, "(T1.BarRecAcb = ? or ? = 'T')");
      addWhere(sWhereString, "(T1.BarMaqTin >= ?)");
      addWhere(sWhereString, "(T1.BarMaqTin <= ?)");
      addWhere(sWhereString, "(T1.BarRecAcb = ? or ? = 'T')");
      if ( ! (GXutil.strcmp("", AV236Wchistoricorecetaslcontids_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.EstTinNr,'9990'), 2) like '%' || ?) or ( UPPER(SUBSTR(TO_CHAR(T1.BarCodTin,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(T1.BarReoTin,'90'), 2) || T1.BarParTin) like '%' || UPPER(?)) or ( UPPER(T1.BarAgrLot) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.BarSerTin) like '%' || UPPER(?)) or ( UPPER(T1.BarDscTin) like '%' || UPPER(?)) or ( UPPER(T1.BarColNoT) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarColNuT,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarTipCoT,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarKgmTin,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarKgsTt,'9999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarMtrTin,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarMtsTt,'9999990.99'), 2) like '%' || ?) or ( UPPER(T1.BarMaqTin) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarVolTin,'99990'), 2) like '%' || ?) or ( UPPER(T1.BarDispCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarNumAna,'990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int20[25] = (byte)(1) ;
         GXv_int20[26] = (byte)(1) ;
         GXv_int20[27] = (byte)(1) ;
         GXv_int20[28] = (byte)(1) ;
         GXv_int20[29] = (byte)(1) ;
         GXv_int20[30] = (byte)(1) ;
         GXv_int20[31] = (byte)(1) ;
         GXv_int20[32] = (byte)(1) ;
         GXv_int20[33] = (byte)(1) ;
         GXv_int20[34] = (byte)(1) ;
         GXv_int20[35] = (byte)(1) ;
         GXv_int20[36] = (byte)(1) ;
         GXv_int20[37] = (byte)(1) ;
         GXv_int20[38] = (byte)(1) ;
         GXv_int20[39] = (byte)(1) ;
         GXv_int20[40] = (byte)(1) ;
         GXv_int20[41] = (byte)(1) ;
         GXv_int20[42] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV141OrderedBy == 1 ) && ! AV142OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV141OrderedBy == 1 ) && ( AV142OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV141OrderedBy == 2 ) && ! AV142OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV141OrderedBy == 2 ) && ( AV142OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV141OrderedBy == 3 ) && ! AV142OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV141OrderedBy == 3 ) && ( AV142OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV141OrderedBy == 4 ) && ! AV142OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV141OrderedBy == 4 ) && ( AV142OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV141OrderedBy == 5 ) && ! AV142OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV141OrderedBy == 5 ) && ( AV142OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV141OrderedBy == 6 ) && ! AV142OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV141OrderedBy == 6 ) && ( AV142OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV141OrderedBy == 7 ) && ! AV142OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV141OrderedBy == 7 ) && ( AV142OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV141OrderedBy == 8 ) && ! AV142OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV141OrderedBy == 8 ) && ( AV142OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV141OrderedBy == 9 ) && ! AV142OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV141OrderedBy == 9 ) && ( AV142OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV141OrderedBy == 10 ) && ! AV142OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV141OrderedBy == 10 ) && ( AV142OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV141OrderedBy == 11 ) && ! AV142OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV141OrderedBy == 11 ) && ( AV142OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV141OrderedBy == 12 ) && ! AV142OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV141OrderedBy == 12 ) && ( AV142OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV141OrderedBy == 13 ) && ! AV142OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV141OrderedBy == 13 ) && ( AV142OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV141OrderedBy == 14 ) && ! AV142OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV141OrderedBy == 14 ) && ( AV142OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV141OrderedBy == 15 ) && ! AV142OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV141OrderedBy == 15 ) && ( AV142OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV141OrderedBy == 16 ) && ! AV142OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV141OrderedBy == 16 ) && ( AV142OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV141OrderedBy == 17 ) && ! AV142OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV141OrderedBy == 17 ) && ( AV142OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV141OrderedBy == 18 ) && ! AV142OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV141OrderedBy == 18 ) && ( AV142OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object21[0] = scmdbuf ;
      GXv_Object21[1] = GXv_int20 ;
      return GXv_Object21 ;
   }

   protected Object[] conditional_H00T94( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV236Wchistoricorecetaslcontids_1_filterfulltext ,
                                          short A1929EstTinNr ,
                                          int A1933BarCodTin ,
                                          byte A1934BarReoTin ,
                                          String A1935BarParTin ,
                                          String A2316BarAgrLot ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A1936BarSerTin ,
                                          String A1937BarDscTin ,
                                          String A1940BarColNoT ,
                                          int A1941BarColNuT ,
                                          byte A1942BarTipCoT ,
                                          java.math.BigDecimal A1947BarKgmTin ,
                                          java.math.BigDecimal A8563BarKgsTt ,
                                          java.math.BigDecimal A1948BarMtrTin ,
                                          java.math.BigDecimal A12993BarMtsTt ,
                                          String A1945BarMaqTin ,
                                          int A1946BarVolTin ,
                                          String A11762BarDispCli ,
                                          short A3650BarNumAna ,
                                          java.util.Date A13759EstFecCier ,
                                          java.util.Date AV60Fec1 ,
                                          java.util.Date AV62Fec3 ,
                                          int AV111PCliCod ,
                                          int AV34CliCodP ,
                                          int AV108PBarCod ,
                                          int AV11BarCodP ,
                                          byte AV110PBarCodReo ,
                                          byte AV15BarCodReoP ,
                                          String AV109PBarCodPar ,
                                          String AV13BarCodParP ,
                                          String AV114PSerie ,
                                          String AV118SerieP ,
                                          String AV113PColor ,
                                          String AV37ColorP ,
                                          int AV112PColNum ,
                                          int AV36ColNumP ,
                                          String AV51DispCli1 ,
                                          String AV53DispCli3 ,
                                          String A6634BarRecAcb ,
                                          String AV72HreRacab ,
                                          String AV97MaqCodi ,
                                          String AV95maqcod3 ,
                                          String AV54EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int22 = new byte[41];
      Object[] GXv_Object23 = new Object[2];
      scmdbuf = "SELECT T1.EstTinAny, T1.EstTinMes, T1.EstTinDia, T1.BarRecAcb, T1.EstFecCier, T1.EmprCod, T1.BarNumAna, T1.BarDispCli, T1.BarVolTin, T1.BarMaqTin, T1.BarMtsTt, T1.BarMtrTin," ;
      scmdbuf += " T1.BarKgsTt, T1.BarKgmTin, T1.BarTipCoT, T1.BarColNuT, T1.BarColNoT, T1.BarDscTin, T1.BarSerTin, T2.CliNom, T1.CliCod, T1.BarAgrLot, T1.EstTinNr, T1.BarParTin," ;
      scmdbuf += " T1.BarReoTin, T1.BarCodTin FROM (TXPLCONTI T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.EstFecCier >= ?)");
      addWhere(sWhereString, "(T1.EstFecCier <= ?)");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.BarCodTin >= ?)");
      addWhere(sWhereString, "(T1.BarCodTin <= ?)");
      addWhere(sWhereString, "(T1.BarReoTin >= ? and T1.BarReoTin <= ?)");
      addWhere(sWhereString, "(T1.BarParTin >= ? and T1.BarParTin <= ?)");
      addWhere(sWhereString, "(T1.BarSerTin >= ?)");
      addWhere(sWhereString, "(T1.BarSerTin <= ?)");
      addWhere(sWhereString, "(T1.BarColNoT >= ? and T1.BarColNoT <= ?)");
      addWhere(sWhereString, "(T1.BarColNuT >= ? and T1.BarColNuT <= ?)");
      addWhere(sWhereString, "(T1.BarDispCli >= ? and T1.BarDispCli <= ?)");
      addWhere(sWhereString, "(T1.BarRecAcb = ? or ? = 'T')");
      addWhere(sWhereString, "(T1.BarMaqTin >= ?)");
      addWhere(sWhereString, "(T1.BarMaqTin <= ?)");
      if ( ! (GXutil.strcmp("", AV236Wchistoricorecetaslcontids_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.EstTinNr,'9990'), 2) like '%' || ?) or ( UPPER(SUBSTR(TO_CHAR(T1.BarCodTin,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(T1.BarReoTin,'90'), 2) || T1.BarParTin) like '%' || UPPER(?)) or ( UPPER(T1.BarAgrLot) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.BarSerTin) like '%' || UPPER(?)) or ( UPPER(T1.BarDscTin) like '%' || UPPER(?)) or ( UPPER(T1.BarColNoT) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarColNuT,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarTipCoT,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarKgmTin,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarKgsTt,'9999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarMtrTin,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarMtsTt,'9999990.99'), 2) like '%' || ?) or ( UPPER(T1.BarMaqTin) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarVolTin,'99990'), 2) like '%' || ?) or ( UPPER(T1.BarDispCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarNumAna,'990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int22[23] = (byte)(1) ;
         GXv_int22[24] = (byte)(1) ;
         GXv_int22[25] = (byte)(1) ;
         GXv_int22[26] = (byte)(1) ;
         GXv_int22[27] = (byte)(1) ;
         GXv_int22[28] = (byte)(1) ;
         GXv_int22[29] = (byte)(1) ;
         GXv_int22[30] = (byte)(1) ;
         GXv_int22[31] = (byte)(1) ;
         GXv_int22[32] = (byte)(1) ;
         GXv_int22[33] = (byte)(1) ;
         GXv_int22[34] = (byte)(1) ;
         GXv_int22[35] = (byte)(1) ;
         GXv_int22[36] = (byte)(1) ;
         GXv_int22[37] = (byte)(1) ;
         GXv_int22[38] = (byte)(1) ;
         GXv_int22[39] = (byte)(1) ;
         GXv_int22[40] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object23[0] = scmdbuf ;
      GXv_Object23[1] = GXv_int22 ;
      return GXv_Object23 ;
   }

   protected Object[] conditional_H00T95( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV236Wchistoricorecetaslcontids_1_filterfulltext ,
                                          short A1929EstTinNr ,
                                          int A1933BarCodTin ,
                                          byte A1934BarReoTin ,
                                          String A1935BarParTin ,
                                          String A2316BarAgrLot ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A1936BarSerTin ,
                                          String A1937BarDscTin ,
                                          String A1940BarColNoT ,
                                          int A1941BarColNuT ,
                                          byte A1942BarTipCoT ,
                                          java.math.BigDecimal A1947BarKgmTin ,
                                          java.math.BigDecimal A8563BarKgsTt ,
                                          java.math.BigDecimal A1948BarMtrTin ,
                                          java.math.BigDecimal A12993BarMtsTt ,
                                          String A1945BarMaqTin ,
                                          int A1946BarVolTin ,
                                          String A11762BarDispCli ,
                                          short A3650BarNumAna ,
                                          java.util.Date A13759EstFecCier ,
                                          java.util.Date AV60Fec1 ,
                                          java.util.Date AV62Fec3 ,
                                          int AV111PCliCod ,
                                          int AV34CliCodP ,
                                          int AV108PBarCod ,
                                          int AV11BarCodP ,
                                          byte AV110PBarCodReo ,
                                          byte AV15BarCodReoP ,
                                          String AV109PBarCodPar ,
                                          String AV13BarCodParP ,
                                          String AV114PSerie ,
                                          String AV118SerieP ,
                                          String AV113PColor ,
                                          String AV37ColorP ,
                                          int AV112PColNum ,
                                          int AV36ColNumP ,
                                          String AV51DispCli1 ,
                                          String AV53DispCli3 ,
                                          String A6634BarRecAcb ,
                                          String AV72HreRacab ,
                                          String AV97MaqCodi ,
                                          String AV95maqcod3 ,
                                          String AV54EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int24 = new byte[39];
      Object[] GXv_Object25 = new Object[2];
      scmdbuf = "SELECT T1.EstTinAny, T1.EstTinMes, T1.EstTinDia, T1.BarRecAcb, T1.EstFecCier, T1.EmprCod, T1.BarNumAna, T1.BarDispCli, T1.BarVolTin, T1.BarMaqTin, T1.BarMtsTt, T1.BarMtrTin," ;
      scmdbuf += " T1.BarKgsTt, T1.BarKgmTin, T1.BarTipCoT, T1.BarColNuT, T1.BarColNoT, T1.BarDscTin, T1.BarSerTin, T2.CliNom, T1.CliCod, T1.BarAgrLot, T1.EstTinNr, T1.BarParTin," ;
      scmdbuf += " T1.BarReoTin, T1.BarCodTin FROM (TXPLCONTI T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.EstFecCier >= ?)");
      addWhere(sWhereString, "(T1.EstFecCier <= ?)");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.BarCodTin >= ?)");
      addWhere(sWhereString, "(T1.BarCodTin <= ?)");
      addWhere(sWhereString, "(T1.BarReoTin >= ? and T1.BarReoTin <= ?)");
      addWhere(sWhereString, "(T1.BarParTin >= ? and T1.BarParTin <= ?)");
      addWhere(sWhereString, "(T1.BarSerTin >= ?)");
      addWhere(sWhereString, "(T1.BarSerTin <= ?)");
      addWhere(sWhereString, "(T1.BarColNoT >= ? and T1.BarColNoT <= ?)");
      addWhere(sWhereString, "(T1.BarColNuT >= ? and T1.BarColNuT <= ?)");
      addWhere(sWhereString, "(T1.BarDispCli >= ? and T1.BarDispCli <= ?)");
      addWhere(sWhereString, "(T1.BarMaqTin >= ?)");
      addWhere(sWhereString, "(T1.BarMaqTin <= ?)");
      if ( ! (GXutil.strcmp("", AV236Wchistoricorecetaslcontids_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.EstTinNr,'9990'), 2) like '%' || ?) or ( UPPER(SUBSTR(TO_CHAR(T1.BarCodTin,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(T1.BarReoTin,'90'), 2) || T1.BarParTin) like '%' || UPPER(?)) or ( UPPER(T1.BarAgrLot) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.BarSerTin) like '%' || UPPER(?)) or ( UPPER(T1.BarDscTin) like '%' || UPPER(?)) or ( UPPER(T1.BarColNoT) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarColNuT,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarTipCoT,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarKgmTin,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarKgsTt,'9999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarMtrTin,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarMtsTt,'9999990.99'), 2) like '%' || ?) or ( UPPER(T1.BarMaqTin) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarVolTin,'99990'), 2) like '%' || ?) or ( UPPER(T1.BarDispCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarNumAna,'990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int24[21] = (byte)(1) ;
         GXv_int24[22] = (byte)(1) ;
         GXv_int24[23] = (byte)(1) ;
         GXv_int24[24] = (byte)(1) ;
         GXv_int24[25] = (byte)(1) ;
         GXv_int24[26] = (byte)(1) ;
         GXv_int24[27] = (byte)(1) ;
         GXv_int24[28] = (byte)(1) ;
         GXv_int24[29] = (byte)(1) ;
         GXv_int24[30] = (byte)(1) ;
         GXv_int24[31] = (byte)(1) ;
         GXv_int24[32] = (byte)(1) ;
         GXv_int24[33] = (byte)(1) ;
         GXv_int24[34] = (byte)(1) ;
         GXv_int24[35] = (byte)(1) ;
         GXv_int24[36] = (byte)(1) ;
         GXv_int24[37] = (byte)(1) ;
         GXv_int24[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object25[0] = scmdbuf ;
      GXv_Object25[1] = GXv_int24 ;
      return GXv_Object25 ;
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
                  return conditional_H00T92(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).byteValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).byteValue() , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , ((Boolean) dynConstraints[22]).booleanValue() , (java.util.Date)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).byteValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] );
            case 1 :
                  return conditional_H00T93(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).byteValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).byteValue() , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , ((Boolean) dynConstraints[22]).booleanValue() , (java.util.Date)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).byteValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] );
            case 2 :
                  return conditional_H00T94(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).byteValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).byteValue() , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.util.Date)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).byteValue() , ((Number) dynConstraints[29]).byteValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] );
            case 3 :
                  return conditional_H00T95(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).byteValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).byteValue() , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.util.Date)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).byteValue() , ((Number) dynConstraints[29]).byteValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00T92", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00T93", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00T94", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00T95", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(12);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(13, 20);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((int[]) buf[22])[0] = rslt.getInt(14);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(15, 6);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((byte[]) buf[34])[0] = rslt.getByte(20);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((int[]) buf[36])[0] = rslt.getInt(21);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getString(22, 13);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getString(23, 26);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getString(24, 16);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getString(25, 30);
               ((int[]) buf[45])[0] = rslt.getInt(26);
               ((String[]) buf[46])[0] = rslt.getString(27, 10);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((short[]) buf[48])[0] = rslt.getShort(28);
               ((java.util.Date[]) buf[49])[0] = rslt.getGXDate(29);
               ((String[]) buf[50])[0] = rslt.getString(30, 1);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((byte[]) buf[52])[0] = rslt.getByte(31);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((int[]) buf[54])[0] = rslt.getInt(32);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 3);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 20);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(9);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 6);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((byte[]) buf[23])[0] = rslt.getByte(15);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((int[]) buf[25])[0] = rslt.getInt(16);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(17, 13);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(18, 26);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(19, 16);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(20, 30);
               ((int[]) buf[34])[0] = rslt.getInt(21);
               ((String[]) buf[35])[0] = rslt.getString(22, 10);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((short[]) buf[37])[0] = rslt.getShort(23);
               ((String[]) buf[38])[0] = rslt.getString(24, 1);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((byte[]) buf[40])[0] = rslt.getByte(25);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((int[]) buf[42])[0] = rslt.getInt(26);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 3);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 20);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(9);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 6);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((byte[]) buf[23])[0] = rslt.getByte(15);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((int[]) buf[25])[0] = rslt.getInt(16);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(17, 13);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(18, 26);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(19, 16);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(20, 30);
               ((int[]) buf[34])[0] = rslt.getInt(21);
               ((String[]) buf[35])[0] = rslt.getString(22, 10);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((short[]) buf[37])[0] = rslt.getShort(23);
               ((String[]) buf[38])[0] = rslt.getString(24, 1);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((byte[]) buf[40])[0] = rslt.getByte(25);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((int[]) buf[42])[0] = rslt.getInt(26);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
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
                  stmt.setDate(sIdx, (java.util.Date)parms[47]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[48]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 13);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 13);
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
                  stmt.setString(sIdx, (String)parms[63], 20);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 20);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 1);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 6);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 6);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 100);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 100);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
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
                  stmt.setString(sIdx, (String)parms[43], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[44]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[45]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[50]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[51]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 1);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 13);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 20);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 20);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 6);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 6);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 1);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 100);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 100);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 100);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 100);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[42]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[43]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 1);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 13);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 13);
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
                  stmt.setString(sIdx, (String)parms[58], 20);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 20);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 1);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 6);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 6);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[66], 100);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[67], 100);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 100);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 100);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 100);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 100);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[40]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[41]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[46]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[47]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 1);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 13);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 20);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 20);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 6);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[66], 100);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[67], 100);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 100);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 100);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 100);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 100);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               return;
      }
   }

}

