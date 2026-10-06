package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wctablaalbbar_impl extends GXWebComponent
{
   public wctablaalbbar_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wctablaalbbar_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wctablaalbbar_impl.class ));
   }

   public wctablaalbbar_impl( int remoteHandle ,
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
      cmbAlbProVal = new HTMLChoice();
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
               AV99Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV99Emprcod", AV99Emprcod);
               AV100AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV100AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV100AlbProCod), 10, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV99Emprcod,Long.valueOf(AV100AlbProCod)});
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
      nRC_GXsfl_36 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_36"))) ;
      nGXsfl_36_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_36_idx"))) ;
      sGXsfl_36_idx = httpContext.GetPar( "sGXsfl_36_idx") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      edtCodCod_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCodCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCodCod_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtPlasCod_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPlasCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlasCod_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtBarAlbPlas_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarAlbPlas_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbPlas_Visible), 5, 0), !bGXsfl_36_Refreshing);
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
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV19ColumnsSelector);
      AV99Emprcod = httpContext.GetPar( "Emprcod") ;
      AV100AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
      AV103TFEmprGuiRem = httpContext.GetPar( "TFEmprGuiRem") ;
      AV104TFEmprGuiRem_Sel = httpContext.GetPar( "TFEmprGuiRem_Sel") ;
      AV26TFBarCod = (int)(GXutil.lval( httpContext.GetPar( "TFBarCod"))) ;
      AV27TFBarCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFBarCod_To"))) ;
      AV29TFBarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "TFBarCodReo"))) ;
      AV30TFBarCodReo_To = (byte)(GXutil.lval( httpContext.GetPar( "TFBarCodReo_To"))) ;
      AV32TFBarCodPar = httpContext.GetPar( "TFBarCodPar") ;
      AV33TFBarCodPar_Sel = httpContext.GetPar( "TFBarCodPar_Sel") ;
      AV35TFAlbSer = httpContext.GetPar( "TFAlbSer") ;
      AV36TFAlbSer_Sel = httpContext.GetPar( "TFAlbSer_Sel") ;
      AV38TFAlbSerD = httpContext.GetPar( "TFAlbSerD") ;
      AV39TFAlbSerD_Sel = httpContext.GetPar( "TFAlbSerD_Sel") ;
      AV41TFAlbColNom = httpContext.GetPar( "TFAlbColNom") ;
      AV42TFAlbColNom_Sel = httpContext.GetPar( "TFAlbColNom_Sel") ;
      AV44TFAlbNomCli = httpContext.GetPar( "TFAlbNomCli") ;
      AV45TFAlbNomCli_Sel = httpContext.GetPar( "TFAlbNomCli_Sel") ;
      AV47TFAlbColNum = (int)(GXutil.lval( httpContext.GetPar( "TFAlbColNum"))) ;
      AV48TFAlbColNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFAlbColNum_To"))) ;
      AV50TFCodCod = httpContext.GetPar( "TFCodCod") ;
      AV51TFCodCod_Sel = httpContext.GetPar( "TFCodCod_Sel") ;
      AV53TFBarAlbKgmE = CommonUtil.decimalVal( httpContext.GetPar( "TFBarAlbKgmE"), ".") ;
      AV54TFBarAlbKgmE_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarAlbKgmE_To"), ".") ;
      AV56TFBarPreKgm = CommonUtil.decimalVal( httpContext.GetPar( "TFBarPreKgm"), ".") ;
      AV57TFBarPreKgm_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarPreKgm_To"), ".") ;
      AV59TFAlbHdrAnc = (short)(GXutil.lval( httpContext.GetPar( "TFAlbHdrAnc"))) ;
      AV60TFAlbHdrAnc_To = (short)(GXutil.lval( httpContext.GetPar( "TFAlbHdrAnc_To"))) ;
      AV62TFAlbHdrgm2 = (short)(GXutil.lval( httpContext.GetPar( "TFAlbHdrgm2"))) ;
      AV63TFAlbHdrgm2_To = (short)(GXutil.lval( httpContext.GetPar( "TFAlbHdrgm2_To"))) ;
      AV65TFBarAlbMtrE = CommonUtil.decimalVal( httpContext.GetPar( "TFBarAlbMtrE"), ".") ;
      AV66TFBarAlbMtrE_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarAlbMtrE_To"), ".") ;
      AV68TFBarPreMtr = CommonUtil.decimalVal( httpContext.GetPar( "TFBarPreMtr"), ".") ;
      AV69TFBarPreMtr_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarPreMtr_To"), ".") ;
      AV71TFBarAlbPie = (int)(GXutil.lval( httpContext.GetPar( "TFBarAlbPie"))) ;
      AV72TFBarAlbPie_To = (int)(GXutil.lval( httpContext.GetPar( "TFBarAlbPie_To"))) ;
      AV74TFTubCod = (short)(GXutil.lval( httpContext.GetPar( "TFTubCod"))) ;
      AV75TFTubCod_To = (short)(GXutil.lval( httpContext.GetPar( "TFTubCod_To"))) ;
      AV77TFBarAlbTub = (int)(GXutil.lval( httpContext.GetPar( "TFBarAlbTub"))) ;
      AV78TFBarAlbTub_To = (int)(GXutil.lval( httpContext.GetPar( "TFBarAlbTub_To"))) ;
      AV80TFPlasCod = (short)(GXutil.lval( httpContext.GetPar( "TFPlasCod"))) ;
      AV81TFPlasCod_To = (short)(GXutil.lval( httpContext.GetPar( "TFPlasCod_To"))) ;
      AV83TFBarAlbPlas = (short)(GXutil.lval( httpContext.GetPar( "TFBarAlbPlas"))) ;
      AV84TFBarAlbPlas_To = (short)(GXutil.lval( httpContext.GetPar( "TFBarAlbPlas_To"))) ;
      AV86TFAlbHdrObs = httpContext.GetPar( "TFAlbHdrObs") ;
      AV87TFAlbHdrObs_Sel = httpContext.GetPar( "TFAlbHdrObs_Sel") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV90TFAlbProVal_Sels);
      AV92TFAlbTipEnt = httpContext.GetPar( "TFAlbTipEnt") ;
      AV93TFAlbTipEnt_Sel = httpContext.GetPar( "TFAlbTipEnt_Sel") ;
      AV160Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      edtCodCod_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCodCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCodCod_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtPlasCod_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPlasCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlasCod_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtBarAlbPlas_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarAlbPlas_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbPlas_Visible), 5, 0), !bGXsfl_36_Refreshing);
      AV111Wctablaalbbards_1_emprcod = httpContext.GetPar( "Wctablaalbbards_1_emprcod") ;
      AV112Wctablaalbbards_2_albprocod = GXutil.lval( httpContext.GetPar( "Wctablaalbbards_2_albprocod")) ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV19ColumnsSelector, AV99Emprcod, AV100AlbProCod, AV103TFEmprGuiRem, AV104TFEmprGuiRem_Sel, AV26TFBarCod, AV27TFBarCod_To, AV29TFBarCodReo, AV30TFBarCodReo_To, AV32TFBarCodPar, AV33TFBarCodPar_Sel, AV35TFAlbSer, AV36TFAlbSer_Sel, AV38TFAlbSerD, AV39TFAlbSerD_Sel, AV41TFAlbColNom, AV42TFAlbColNom_Sel, AV44TFAlbNomCli, AV45TFAlbNomCli_Sel, AV47TFAlbColNum, AV48TFAlbColNum_To, AV50TFCodCod, AV51TFCodCod_Sel, AV53TFBarAlbKgmE, AV54TFBarAlbKgmE_To, AV56TFBarPreKgm, AV57TFBarPreKgm_To, AV59TFAlbHdrAnc, AV60TFAlbHdrAnc_To, AV62TFAlbHdrgm2, AV63TFAlbHdrgm2_To, AV65TFBarAlbMtrE, AV66TFBarAlbMtrE_To, AV68TFBarPreMtr, AV69TFBarPreMtr_To, AV71TFBarAlbPie, AV72TFBarAlbPie_To, AV74TFTubCod, AV75TFTubCod_To, AV77TFBarAlbTub, AV78TFBarAlbTub_To, AV80TFPlasCod, AV81TFPlasCod_To, AV83TFBarAlbPlas, AV84TFBarAlbPlas_To, AV86TFAlbHdrObs, AV87TFAlbHdrObs_Sel, AV90TFAlbProVal_Sels, AV92TFAlbTipEnt, AV93TFAlbTipEnt_Sel, AV160Pgmname, AV12OrderedBy, AV13OrderedDsc, AV111Wctablaalbbards_1_emprcod, AV112Wctablaalbbards_2_albprocod, A396EmprCod, A30AlbProCod, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         paMC2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( " Guias (Detail HDRs)", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.wctablaalbbar", new String[] {GXutil.URLEncode(GXutil.rtrim(AV99Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV100AlbProCod,10,0))}, new String[] {"Emprcod","AlbProCod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV160Pgmname, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"WCTablaAlbbar");
      forbiddenHiddens.add("EmprCod", GXutil.rtrim( localUtil.format( A396EmprCod, "@!")));
      forbiddenHiddens.add("AlbProCod", localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("wctablaalbbar:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_36", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_36, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV97GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV98GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV95DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV95DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV19ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV19ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV99Emprcod", GXutil.rtrim( wcpOAV99Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV100AlbProCod", GXutil.ltrim( localUtil.ntoc( wcpOAV100AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV99Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFEMPRGUIREM", GXutil.rtrim( AV103TFEmprGuiRem));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFEMPRGUIREM_SEL", GXutil.rtrim( AV104TFEmprGuiRem_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOD", GXutil.ltrim( localUtil.ntoc( AV26TFBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOD_TO", GXutil.ltrim( localUtil.ntoc( AV27TFBarCod_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCODREO", GXutil.ltrim( localUtil.ntoc( AV29TFBarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCODREO_TO", GXutil.ltrim( localUtil.ntoc( AV30TFBarCodReo_To, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCODPAR", GXutil.rtrim( AV32TFBarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCODPAR_SEL", GXutil.rtrim( AV33TFBarCodPar_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBSER", GXutil.rtrim( AV35TFAlbSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBSER_SEL", GXutil.rtrim( AV36TFAlbSer_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBSERD", GXutil.rtrim( AV38TFAlbSerD));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBSERD_SEL", GXutil.rtrim( AV39TFAlbSerD_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBCOLNOM", GXutil.rtrim( AV41TFAlbColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBCOLNOM_SEL", GXutil.rtrim( AV42TFAlbColNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBNOMCLI", GXutil.rtrim( AV44TFAlbNomCli));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBNOMCLI_SEL", GXutil.rtrim( AV45TFAlbNomCli_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBCOLNUM", GXutil.ltrim( localUtil.ntoc( AV47TFAlbColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBCOLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV48TFAlbColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCODCOD", GXutil.rtrim( AV50TFCodCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCODCOD_SEL", GXutil.rtrim( AV51TFCodCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARALBKGME", GXutil.ltrim( localUtil.ntoc( AV53TFBarAlbKgmE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARALBKGME_TO", GXutil.ltrim( localUtil.ntoc( AV54TFBarAlbKgmE_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARPREKGM", GXutil.ltrim( localUtil.ntoc( AV56TFBarPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARPREKGM_TO", GXutil.ltrim( localUtil.ntoc( AV57TFBarPreKgm_To, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBHDRANC", GXutil.ltrim( localUtil.ntoc( AV59TFAlbHdrAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBHDRANC_TO", GXutil.ltrim( localUtil.ntoc( AV60TFAlbHdrAnc_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBHDRGM2", GXutil.ltrim( localUtil.ntoc( AV62TFAlbHdrgm2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBHDRGM2_TO", GXutil.ltrim( localUtil.ntoc( AV63TFAlbHdrgm2_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARALBMTRE", GXutil.ltrim( localUtil.ntoc( AV65TFBarAlbMtrE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARALBMTRE_TO", GXutil.ltrim( localUtil.ntoc( AV66TFBarAlbMtrE_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARPREMTR", GXutil.ltrim( localUtil.ntoc( AV68TFBarPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARPREMTR_TO", GXutil.ltrim( localUtil.ntoc( AV69TFBarPreMtr_To, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARALBPIE", GXutil.ltrim( localUtil.ntoc( AV71TFBarAlbPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARALBPIE_TO", GXutil.ltrim( localUtil.ntoc( AV72TFBarAlbPie_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFTUBCOD", GXutil.ltrim( localUtil.ntoc( AV74TFTubCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFTUBCOD_TO", GXutil.ltrim( localUtil.ntoc( AV75TFTubCod_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARALBTUB", GXutil.ltrim( localUtil.ntoc( AV77TFBarAlbTub, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARALBTUB_TO", GXutil.ltrim( localUtil.ntoc( AV78TFBarAlbTub_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPLASCOD", GXutil.ltrim( localUtil.ntoc( AV80TFPlasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPLASCOD_TO", GXutil.ltrim( localUtil.ntoc( AV81TFPlasCod_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARALBPLAS", GXutil.ltrim( localUtil.ntoc( AV83TFBarAlbPlas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARALBPLAS_TO", GXutil.ltrim( localUtil.ntoc( AV84TFBarAlbPlas_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBHDROBS", GXutil.rtrim( AV86TFAlbHdrObs));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBHDROBS_SEL", GXutil.rtrim( AV87TFAlbHdrObs_Sel));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vTFALBPROVAL_SELS", AV90TFAlbProVal_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vTFALBPROVAL_SELS", AV90TFAlbProVal_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBTIPENT", GXutil.rtrim( AV92TFAlbTipEnt));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBTIPENT_SEL", GXutil.rtrim( AV93TFAlbTipEnt_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV160Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV160Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vWCTABLAALBBARDS_1_EMPRCOD", GXutil.rtrim( AV111Wctablaalbbards_1_emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vWCTABLAALBBARDS_2_ALBPROCOD", GXutil.ltrim( localUtil.ntoc( AV112Wctablaalbbards_2_albprocod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Allowmultipleselection", GXutil.rtrim( Ddo_grid_Allowmultipleselection));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalistfixedvalues", GXutil.rtrim( Ddo_grid_Datalistfixedvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption", GXutil.rtrim( Ddo_gridcolumnsselector_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip", GXutil.rtrim( Ddo_gridcolumnsselector_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls", GXutil.rtrim( Ddo_gridcolumnsselector_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype", GXutil.rtrim( Ddo_gridcolumnsselector_Dropdownoptionstype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname", GXutil.rtrim( Ddo_gridcolumnsselector_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace", GXutil.rtrim( Ddo_gridcolumnsselector_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Fixedcolumns", GXutil.rtrim( Grid_empowerer_Fixedcolumns));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CODCOD_Visible", GXutil.ltrim( localUtil.ntoc( edtCodCod_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PLASCOD_Visible", GXutil.ltrim( localUtil.ntoc( edtPlasCod_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARALBPLAS_Visible", GXutil.ltrim( localUtil.ntoc( edtBarAlbPlas_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
   }

   public void renderHtmlCloseFormMC2( )
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
         if ( ! ( WebComp_Wcwctablaalbfas == null ) )
         {
            WebComp_Wcwctablaalbfas.componentjscripts();
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
      return "WCTablaAlbbar" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Guias (Detail HDRs)", "") ;
   }

   public void wbMC0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.wctablaalbbar");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 36, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCTablaAlbbar.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 36, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCTablaAlbbar.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbprocod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbprocod_Internalname, httpContext.getMessage( "Nº Guia", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbprocod_Internalname, GXutil.ltrim( localUtil.ntoc( AV100AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbprocod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV100AlbProCod), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV100AlbProCod), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbprocod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbprocod_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WCTablaAlbbar.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnfases_Internalname, "gx.evt.setGridEvt("+GXutil.str( 36, 2, 0)+","+"null"+");", httpContext.getMessage( "Fases", ""), bttBtnfases_Jsonclick, 7, httpContext.getMessage( "Fases", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e11mc1_client"+"'", TempTags, "", 2, "HLP_WCTablaAlbbar.htm");
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
         startgridcontrol36( ) ;
      }
      if ( wbEnd == 36 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_36 = (int)(nGXsfl_36_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV97GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV98GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, sPrefix+"GRIDPAGINATIONBARContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"W0072"+"", GXutil.rtrim( WebComp_Wcwctablaalbfas_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+sPrefix+"gxHTMLWrpW0072"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_36_Refreshing )
            {
               if ( GXutil.len( WebComp_Wcwctablaalbfas_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldWcwctablaalbfas), GXutil.lower( WebComp_Wcwctablaalbfas_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp(sPrefix+"gxHTMLWrpW0072"+"");
                  }
                  WebComp_Wcwctablaalbfas.componentdraw();
                  if ( GXutil.strcmp(GXutil.lower( OldWcwctablaalbfas), GXutil.lower( WebComp_Wcwctablaalbfas_Component)) != 0 )
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
         ucDdo_grid.setProperty("AllowMultipleSelection", Ddo_grid_Allowmultipleselection);
         ucDdo_grid.setProperty("DataListFixedValues", Ddo_grid_Datalistfixedvalues);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV95DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, 0, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WCTablaAlbbar.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProCod_Internalname, GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProCod_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbProCod_Visible, 0, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WCTablaAlbbar.htm");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV95DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV19ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 36 )
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

   public void startMC2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( " Guias (Detail HDRs)", ""), (short)(0)) ;
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
            strupMC0( ) ;
         }
      }
   }

   public void wsMC2( )
   {
      startMC2( ) ;
      evtMC2( ) ;
   }

   public void evtMC2( )
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
                              strupMC0( ) ;
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
                              strupMC0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e12MC2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupMC0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e13MC2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupMC0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e14MC2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupMC0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e15MC2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupMC0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e16MC2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupMC0( ) ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupMC0( ) ;
                           }
                           nGXsfl_36_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_36_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_36_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_362( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV105GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV105GridActions), 4, 0));
                           A1253EmprGuiRem = GXutil.upper( httpContext.cgiGet( edtEmprGuiRem_Internalname)) ;
                           A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
                           A3391AlbSer = httpContext.cgiGet( edtAlbSer_Internalname) ;
                           A8879AlbSerD = httpContext.cgiGet( edtAlbSerD_Internalname) ;
                           A3392AlbColNom = httpContext.cgiGet( edtAlbColNom_Internalname) ;
                           A12232AlbNomCli = httpContext.cgiGet( edtAlbNomCli_Internalname) ;
                           A3393AlbColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A3153CodCod = httpContext.cgiGet( edtCodCod_Internalname) ;
                           A1261BarAlbKgmE = localUtil.ctond( httpContext.cgiGet( edtBarAlbKgmE_Internalname)) ;
                           A1262BarPreKgm = localUtil.ctond( httpContext.cgiGet( edtBarPreKgm_Internalname)) ;
                           A3271AlbHdrAnc = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbHdrAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A5019AlbHdrgm2 = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbHdrgm2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1263BarAlbMtrE = localUtil.ctond( httpContext.cgiGet( edtBarAlbMtrE_Internalname)) ;
                           A1264BarPreMtr = localUtil.ctond( httpContext.cgiGet( edtBarPreMtr_Internalname)) ;
                           A1265BarAlbPie = (int)(localUtil.ctol( httpContext.cgiGet( edtBarAlbPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1206TubCod = (short)(localUtil.ctol( httpContext.cgiGet( edtTubCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1266BarAlbTub = (int)(localUtil.ctol( httpContext.cgiGet( edtBarAlbTub_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A6466PlasCod = (short)(localUtil.ctol( httpContext.cgiGet( edtPlasCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A6467BarAlbPlas = (short)(localUtil.ctol( httpContext.cgiGet( edtBarAlbPlas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A2441AlbHdrObs = httpContext.cgiGet( edtAlbHdrObs_Internalname) ;
                           cmbAlbProVal.setName( cmbAlbProVal.getInternalname() );
                           cmbAlbProVal.setValue( httpContext.cgiGet( cmbAlbProVal.getInternalname()) );
                           A2839AlbProVal = httpContext.cgiGet( cmbAlbProVal.getInternalname()) ;
                           A1095AlbTipEnt = GXutil.upper( httpContext.cgiGet( edtAlbTipEnt_Internalname)) ;
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
                                       e17MC2 ();
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
                                       e18MC2 ();
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
                                       e19MC2 ();
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
                                    strupMC0( ) ;
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
                  else if ( GXutil.strcmp(sEvtType, "W") == 0 )
                  {
                     sEvtType = GXutil.left( sEvt, 4) ;
                     sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-4) ;
                     nCmpId = (short)(GXutil.lval( sEvtType)) ;
                     if ( nCmpId == 72 )
                     {
                        OldWcwctablaalbfas = httpContext.cgiGet( sPrefix+"W0072") ;
                        if ( ( GXutil.len( OldWcwctablaalbfas) == 0 ) || ( GXutil.strcmp(OldWcwctablaalbfas, WebComp_Wcwctablaalbfas_Component) != 0 ) )
                        {
                           WebComp_Wcwctablaalbfas = WebUtils.getWebComponent(getClass(), "app." + OldWcwctablaalbfas + "_impl", remoteHandle, context);
                           WebComp_Wcwctablaalbfas_Component = OldWcwctablaalbfas ;
                        }
                        if ( GXutil.len( WebComp_Wcwctablaalbfas_Component) != 0 )
                        {
                           WebComp_Wcwctablaalbfas.componentprocess(sPrefix+"W0072", "", sEvt);
                        }
                        WebComp_Wcwctablaalbfas_Component = OldWcwctablaalbfas ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void weMC2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseFormMC2( ) ;
         }
      }
   }

   public void paMC2( )
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
      subsflControlProps_362( ) ;
      while ( nGXsfl_36_idx <= nRC_GXsfl_36 )
      {
         sendrow_362( ) ;
         nGXsfl_36_idx = ((subGrid_Islastpage==1)&&(nGXsfl_36_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_36_idx+1) ;
         sGXsfl_36_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_36_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_362( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV19ColumnsSelector ,
                                 String AV99Emprcod ,
                                 long AV100AlbProCod ,
                                 String AV103TFEmprGuiRem ,
                                 String AV104TFEmprGuiRem_Sel ,
                                 int AV26TFBarCod ,
                                 int AV27TFBarCod_To ,
                                 byte AV29TFBarCodReo ,
                                 byte AV30TFBarCodReo_To ,
                                 String AV32TFBarCodPar ,
                                 String AV33TFBarCodPar_Sel ,
                                 String AV35TFAlbSer ,
                                 String AV36TFAlbSer_Sel ,
                                 String AV38TFAlbSerD ,
                                 String AV39TFAlbSerD_Sel ,
                                 String AV41TFAlbColNom ,
                                 String AV42TFAlbColNom_Sel ,
                                 String AV44TFAlbNomCli ,
                                 String AV45TFAlbNomCli_Sel ,
                                 int AV47TFAlbColNum ,
                                 int AV48TFAlbColNum_To ,
                                 String AV50TFCodCod ,
                                 String AV51TFCodCod_Sel ,
                                 java.math.BigDecimal AV53TFBarAlbKgmE ,
                                 java.math.BigDecimal AV54TFBarAlbKgmE_To ,
                                 java.math.BigDecimal AV56TFBarPreKgm ,
                                 java.math.BigDecimal AV57TFBarPreKgm_To ,
                                 short AV59TFAlbHdrAnc ,
                                 short AV60TFAlbHdrAnc_To ,
                                 short AV62TFAlbHdrgm2 ,
                                 short AV63TFAlbHdrgm2_To ,
                                 java.math.BigDecimal AV65TFBarAlbMtrE ,
                                 java.math.BigDecimal AV66TFBarAlbMtrE_To ,
                                 java.math.BigDecimal AV68TFBarPreMtr ,
                                 java.math.BigDecimal AV69TFBarPreMtr_To ,
                                 int AV71TFBarAlbPie ,
                                 int AV72TFBarAlbPie_To ,
                                 short AV74TFTubCod ,
                                 short AV75TFTubCod_To ,
                                 int AV77TFBarAlbTub ,
                                 int AV78TFBarAlbTub_To ,
                                 short AV80TFPlasCod ,
                                 short AV81TFPlasCod_To ,
                                 short AV83TFBarAlbPlas ,
                                 short AV84TFBarAlbPlas_To ,
                                 String AV86TFAlbHdrObs ,
                                 String AV87TFAlbHdrObs_Sel ,
                                 GXSimpleCollection<String> AV90TFAlbProVal_Sels ,
                                 String AV92TFAlbTipEnt ,
                                 String AV93TFAlbTipEnt_Sel ,
                                 String AV160Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 String AV111Wctablaalbbards_1_emprcod ,
                                 long AV112Wctablaalbbards_2_albprocod ,
                                 String A396EmprCod ,
                                 long A30AlbProCod ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e18MC2 ();
      GRID_nCurrentRecord = 0 ;
      rfMC2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"WCTablaAlbbar");
      forbiddenHiddens.add("EmprCod", GXutil.rtrim( localUtil.format( A396EmprCod, "@!")));
      forbiddenHiddens.add("AlbProCod", localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("wctablaalbbar:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARCOD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARCODREO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARCODPAR", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A130BarCodPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCODPAR", GXutil.rtrim( A130BarCodPar));
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
      rfMC2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV160Pgmname = "WCTablaAlbbar" ;
      Gx_err = (short)(0) ;
      edtavAlbprocod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlbprocod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbprocod_Enabled), 5, 0), true);
   }

   public void rfMC2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(36) ;
      /* Execute user event: Refresh */
      e18MC2 ();
      nGXsfl_36_idx = 1 ;
      sGXsfl_36_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_36_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_362( ) ;
      bGXsfl_36_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_fnc_recordsperpage( ) );
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcwctablaalbfas_Component) != 0 )
            {
               WebComp_Wcwctablaalbfas.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_362( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              A2839AlbProVal ,
                                              AV157Wctablaalbbards_47_tfalbproval_sels ,
                                              AV114Wctablaalbbards_4_tfemprguirem_sel ,
                                              AV113Wctablaalbbards_3_tfemprguirem ,
                                              Integer.valueOf(AV115Wctablaalbbards_5_tfbarcod) ,
                                              Integer.valueOf(AV116Wctablaalbbards_6_tfbarcod_to) ,
                                              Byte.valueOf(AV117Wctablaalbbards_7_tfbarcodreo) ,
                                              Byte.valueOf(AV118Wctablaalbbards_8_tfbarcodreo_to) ,
                                              AV120Wctablaalbbards_10_tfbarcodpar_sel ,
                                              AV119Wctablaalbbards_9_tfbarcodpar ,
                                              AV122Wctablaalbbards_12_tfalbser_sel ,
                                              AV121Wctablaalbbards_11_tfalbser ,
                                              AV124Wctablaalbbards_14_tfalbserd_sel ,
                                              AV123Wctablaalbbards_13_tfalbserd ,
                                              AV126Wctablaalbbards_16_tfalbcolnom_sel ,
                                              AV125Wctablaalbbards_15_tfalbcolnom ,
                                              AV128Wctablaalbbards_18_tfalbnomcli_sel ,
                                              AV127Wctablaalbbards_17_tfalbnomcli ,
                                              Integer.valueOf(AV129Wctablaalbbards_19_tfalbcolnum) ,
                                              Integer.valueOf(AV130Wctablaalbbards_20_tfalbcolnum_to) ,
                                              AV132Wctablaalbbards_22_tfcodcod_sel ,
                                              AV131Wctablaalbbards_21_tfcodcod ,
                                              AV133Wctablaalbbards_23_tfbaralbkgme ,
                                              AV134Wctablaalbbards_24_tfbaralbkgme_to ,
                                              AV135Wctablaalbbards_25_tfbarprekgm ,
                                              AV136Wctablaalbbards_26_tfbarprekgm_to ,
                                              Short.valueOf(AV137Wctablaalbbards_27_tfalbhdranc) ,
                                              Short.valueOf(AV138Wctablaalbbards_28_tfalbhdranc_to) ,
                                              Short.valueOf(AV139Wctablaalbbards_29_tfalbhdrgm2) ,
                                              Short.valueOf(AV140Wctablaalbbards_30_tfalbhdrgm2_to) ,
                                              AV141Wctablaalbbards_31_tfbaralbmtre ,
                                              AV142Wctablaalbbards_32_tfbaralbmtre_to ,
                                              AV143Wctablaalbbards_33_tfbarpremtr ,
                                              AV144Wctablaalbbards_34_tfbarpremtr_to ,
                                              Integer.valueOf(AV145Wctablaalbbards_35_tfbaralbpie) ,
                                              Integer.valueOf(AV146Wctablaalbbards_36_tfbaralbpie_to) ,
                                              Short.valueOf(AV147Wctablaalbbards_37_tftubcod) ,
                                              Short.valueOf(AV148Wctablaalbbards_38_tftubcod_to) ,
                                              Integer.valueOf(AV149Wctablaalbbards_39_tfbaralbtub) ,
                                              Integer.valueOf(AV150Wctablaalbbards_40_tfbaralbtub_to) ,
                                              Short.valueOf(AV151Wctablaalbbards_41_tfplascod) ,
                                              Short.valueOf(AV152Wctablaalbbards_42_tfplascod_to) ,
                                              Short.valueOf(AV153Wctablaalbbards_43_tfbaralbplas) ,
                                              Short.valueOf(AV154Wctablaalbbards_44_tfbaralbplas_to) ,
                                              AV156Wctablaalbbards_46_tfalbhdrobs_sel ,
                                              AV155Wctablaalbbards_45_tfalbhdrobs ,
                                              Integer.valueOf(AV157Wctablaalbbards_47_tfalbproval_sels.size()) ,
                                              AV159Wctablaalbbards_49_tfalbtipent_sel ,
                                              AV158Wctablaalbbards_48_tfalbtipent ,
                                              A1253EmprGuiRem ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar ,
                                              A3391AlbSer ,
                                              A8879AlbSerD ,
                                              A3392AlbColNom ,
                                              A12232AlbNomCli ,
                                              Integer.valueOf(A3393AlbColNum) ,
                                              A3153CodCod ,
                                              A1261BarAlbKgmE ,
                                              A1262BarPreKgm ,
                                              Short.valueOf(A3271AlbHdrAnc) ,
                                              Short.valueOf(A5019AlbHdrgm2) ,
                                              A1263BarAlbMtrE ,
                                              A1264BarPreMtr ,
                                              Integer.valueOf(A1265BarAlbPie) ,
                                              Short.valueOf(A1206TubCod) ,
                                              Integer.valueOf(A1266BarAlbTub) ,
                                              Short.valueOf(A6466PlasCod) ,
                                              Short.valueOf(A6467BarAlbPlas) ,
                                              A2441AlbHdrObs ,
                                              A1095AlbTipEnt ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV111Wctablaalbbards_1_emprcod ,
                                              Long.valueOf(AV112Wctablaalbbards_2_albprocod) ,
                                              A396EmprCod ,
                                              Long.valueOf(A30AlbProCod) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT,
                                              TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                              TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.LONG
                                              }
         });
         lV113Wctablaalbbards_3_tfemprguirem = GXutil.padr( GXutil.rtrim( AV113Wctablaalbbards_3_tfemprguirem), 3, "%") ;
         /* Using cursor H00MC2 */
         pr_default.execute(0, new Object[] {AV111Wctablaalbbards_1_emprcod, Long.valueOf(AV112Wctablaalbbards_2_albprocod), lV113Wctablaalbbards_3_tfemprguirem, AV114Wctablaalbbards_4_tfemprguirem_sel, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_36_idx = 1 ;
         sGXsfl_36_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_36_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_362( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A396EmprCod = H00MC2_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
            A30AlbProCod = H00MC2_A30AlbProCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            A1253EmprGuiRem = H00MC2_A1253EmprGuiRem[0] ;
            e19MC2 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(36) ;
         wbMC0( ) ;
      }
      bGXsfl_36_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesMC2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV160Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV160Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARCOD"+"_"+sGXsfl_36_idx, getSecureSignedToken( sPrefix+sGXsfl_36_idx, localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARCODREO"+"_"+sGXsfl_36_idx, getSecureSignedToken( sPrefix+sGXsfl_36_idx, localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARCODPAR"+"_"+sGXsfl_36_idx, getSecureSignedToken( sPrefix+sGXsfl_36_idx, GXutil.rtrim( localUtil.format( A130BarCodPar, ""))));
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
      AV111Wctablaalbbards_1_emprcod = AV99Emprcod ;
      AV112Wctablaalbbards_2_albprocod = AV100AlbProCod ;
      AV113Wctablaalbbards_3_tfemprguirem = AV103TFEmprGuiRem ;
      AV114Wctablaalbbards_4_tfemprguirem_sel = AV104TFEmprGuiRem_Sel ;
      AV115Wctablaalbbards_5_tfbarcod = AV26TFBarCod ;
      AV116Wctablaalbbards_6_tfbarcod_to = AV27TFBarCod_To ;
      AV117Wctablaalbbards_7_tfbarcodreo = AV29TFBarCodReo ;
      AV118Wctablaalbbards_8_tfbarcodreo_to = AV30TFBarCodReo_To ;
      AV119Wctablaalbbards_9_tfbarcodpar = AV32TFBarCodPar ;
      AV120Wctablaalbbards_10_tfbarcodpar_sel = AV33TFBarCodPar_Sel ;
      AV121Wctablaalbbards_11_tfalbser = AV35TFAlbSer ;
      AV122Wctablaalbbards_12_tfalbser_sel = AV36TFAlbSer_Sel ;
      AV123Wctablaalbbards_13_tfalbserd = AV38TFAlbSerD ;
      AV124Wctablaalbbards_14_tfalbserd_sel = AV39TFAlbSerD_Sel ;
      AV125Wctablaalbbards_15_tfalbcolnom = AV41TFAlbColNom ;
      AV126Wctablaalbbards_16_tfalbcolnom_sel = AV42TFAlbColNom_Sel ;
      AV127Wctablaalbbards_17_tfalbnomcli = AV44TFAlbNomCli ;
      AV128Wctablaalbbards_18_tfalbnomcli_sel = AV45TFAlbNomCli_Sel ;
      AV129Wctablaalbbards_19_tfalbcolnum = AV47TFAlbColNum ;
      AV130Wctablaalbbards_20_tfalbcolnum_to = AV48TFAlbColNum_To ;
      AV131Wctablaalbbards_21_tfcodcod = AV50TFCodCod ;
      AV132Wctablaalbbards_22_tfcodcod_sel = AV51TFCodCod_Sel ;
      AV133Wctablaalbbards_23_tfbaralbkgme = AV53TFBarAlbKgmE ;
      AV134Wctablaalbbards_24_tfbaralbkgme_to = AV54TFBarAlbKgmE_To ;
      AV135Wctablaalbbards_25_tfbarprekgm = AV56TFBarPreKgm ;
      AV136Wctablaalbbards_26_tfbarprekgm_to = AV57TFBarPreKgm_To ;
      AV137Wctablaalbbards_27_tfalbhdranc = AV59TFAlbHdrAnc ;
      AV138Wctablaalbbards_28_tfalbhdranc_to = AV60TFAlbHdrAnc_To ;
      AV139Wctablaalbbards_29_tfalbhdrgm2 = AV62TFAlbHdrgm2 ;
      AV140Wctablaalbbards_30_tfalbhdrgm2_to = AV63TFAlbHdrgm2_To ;
      AV141Wctablaalbbards_31_tfbaralbmtre = AV65TFBarAlbMtrE ;
      AV142Wctablaalbbards_32_tfbaralbmtre_to = AV66TFBarAlbMtrE_To ;
      AV143Wctablaalbbards_33_tfbarpremtr = AV68TFBarPreMtr ;
      AV144Wctablaalbbards_34_tfbarpremtr_to = AV69TFBarPreMtr_To ;
      AV145Wctablaalbbards_35_tfbaralbpie = AV71TFBarAlbPie ;
      AV146Wctablaalbbards_36_tfbaralbpie_to = AV72TFBarAlbPie_To ;
      AV147Wctablaalbbards_37_tftubcod = AV74TFTubCod ;
      AV148Wctablaalbbards_38_tftubcod_to = AV75TFTubCod_To ;
      AV149Wctablaalbbards_39_tfbaralbtub = AV77TFBarAlbTub ;
      AV150Wctablaalbbards_40_tfbaralbtub_to = AV78TFBarAlbTub_To ;
      AV151Wctablaalbbards_41_tfplascod = AV80TFPlasCod ;
      AV152Wctablaalbbards_42_tfplascod_to = AV81TFPlasCod_To ;
      AV153Wctablaalbbards_43_tfbaralbplas = AV83TFBarAlbPlas ;
      AV154Wctablaalbbards_44_tfbaralbplas_to = AV84TFBarAlbPlas_To ;
      AV155Wctablaalbbards_45_tfalbhdrobs = AV86TFAlbHdrObs ;
      AV156Wctablaalbbards_46_tfalbhdrobs_sel = AV87TFAlbHdrObs_Sel ;
      AV157Wctablaalbbards_47_tfalbproval_sels = AV90TFAlbProVal_Sels ;
      AV158Wctablaalbbards_48_tfalbtipent = AV92TFAlbTipEnt ;
      AV159Wctablaalbbards_49_tfalbtipent_sel = AV93TFAlbTipEnt_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A2839AlbProVal ,
                                           AV157Wctablaalbbards_47_tfalbproval_sels ,
                                           AV114Wctablaalbbards_4_tfemprguirem_sel ,
                                           AV113Wctablaalbbards_3_tfemprguirem ,
                                           Integer.valueOf(AV115Wctablaalbbards_5_tfbarcod) ,
                                           Integer.valueOf(AV116Wctablaalbbards_6_tfbarcod_to) ,
                                           Byte.valueOf(AV117Wctablaalbbards_7_tfbarcodreo) ,
                                           Byte.valueOf(AV118Wctablaalbbards_8_tfbarcodreo_to) ,
                                           AV120Wctablaalbbards_10_tfbarcodpar_sel ,
                                           AV119Wctablaalbbards_9_tfbarcodpar ,
                                           AV122Wctablaalbbards_12_tfalbser_sel ,
                                           AV121Wctablaalbbards_11_tfalbser ,
                                           AV124Wctablaalbbards_14_tfalbserd_sel ,
                                           AV123Wctablaalbbards_13_tfalbserd ,
                                           AV126Wctablaalbbards_16_tfalbcolnom_sel ,
                                           AV125Wctablaalbbards_15_tfalbcolnom ,
                                           AV128Wctablaalbbards_18_tfalbnomcli_sel ,
                                           AV127Wctablaalbbards_17_tfalbnomcli ,
                                           Integer.valueOf(AV129Wctablaalbbards_19_tfalbcolnum) ,
                                           Integer.valueOf(AV130Wctablaalbbards_20_tfalbcolnum_to) ,
                                           AV132Wctablaalbbards_22_tfcodcod_sel ,
                                           AV131Wctablaalbbards_21_tfcodcod ,
                                           AV133Wctablaalbbards_23_tfbaralbkgme ,
                                           AV134Wctablaalbbards_24_tfbaralbkgme_to ,
                                           AV135Wctablaalbbards_25_tfbarprekgm ,
                                           AV136Wctablaalbbards_26_tfbarprekgm_to ,
                                           Short.valueOf(AV137Wctablaalbbards_27_tfalbhdranc) ,
                                           Short.valueOf(AV138Wctablaalbbards_28_tfalbhdranc_to) ,
                                           Short.valueOf(AV139Wctablaalbbards_29_tfalbhdrgm2) ,
                                           Short.valueOf(AV140Wctablaalbbards_30_tfalbhdrgm2_to) ,
                                           AV141Wctablaalbbards_31_tfbaralbmtre ,
                                           AV142Wctablaalbbards_32_tfbaralbmtre_to ,
                                           AV143Wctablaalbbards_33_tfbarpremtr ,
                                           AV144Wctablaalbbards_34_tfbarpremtr_to ,
                                           Integer.valueOf(AV145Wctablaalbbards_35_tfbaralbpie) ,
                                           Integer.valueOf(AV146Wctablaalbbards_36_tfbaralbpie_to) ,
                                           Short.valueOf(AV147Wctablaalbbards_37_tftubcod) ,
                                           Short.valueOf(AV148Wctablaalbbards_38_tftubcod_to) ,
                                           Integer.valueOf(AV149Wctablaalbbards_39_tfbaralbtub) ,
                                           Integer.valueOf(AV150Wctablaalbbards_40_tfbaralbtub_to) ,
                                           Short.valueOf(AV151Wctablaalbbards_41_tfplascod) ,
                                           Short.valueOf(AV152Wctablaalbbards_42_tfplascod_to) ,
                                           Short.valueOf(AV153Wctablaalbbards_43_tfbaralbplas) ,
                                           Short.valueOf(AV154Wctablaalbbards_44_tfbaralbplas_to) ,
                                           AV156Wctablaalbbards_46_tfalbhdrobs_sel ,
                                           AV155Wctablaalbbards_45_tfalbhdrobs ,
                                           Integer.valueOf(AV157Wctablaalbbards_47_tfalbproval_sels.size()) ,
                                           AV159Wctablaalbbards_49_tfalbtipent_sel ,
                                           AV158Wctablaalbbards_48_tfalbtipent ,
                                           A1253EmprGuiRem ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A3391AlbSer ,
                                           A8879AlbSerD ,
                                           A3392AlbColNom ,
                                           A12232AlbNomCli ,
                                           Integer.valueOf(A3393AlbColNum) ,
                                           A3153CodCod ,
                                           A1261BarAlbKgmE ,
                                           A1262BarPreKgm ,
                                           Short.valueOf(A3271AlbHdrAnc) ,
                                           Short.valueOf(A5019AlbHdrgm2) ,
                                           A1263BarAlbMtrE ,
                                           A1264BarPreMtr ,
                                           Integer.valueOf(A1265BarAlbPie) ,
                                           Short.valueOf(A1206TubCod) ,
                                           Integer.valueOf(A1266BarAlbTub) ,
                                           Short.valueOf(A6466PlasCod) ,
                                           Short.valueOf(A6467BarAlbPlas) ,
                                           A2441AlbHdrObs ,
                                           A1095AlbTipEnt ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV111Wctablaalbbards_1_emprcod ,
                                           Long.valueOf(AV112Wctablaalbbards_2_albprocod) ,
                                           A396EmprCod ,
                                           Long.valueOf(A30AlbProCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.LONG
                                           }
      });
      lV113Wctablaalbbards_3_tfemprguirem = GXutil.padr( GXutil.rtrim( AV113Wctablaalbbards_3_tfemprguirem), 3, "%") ;
      /* Using cursor H00MC3 */
      pr_default.execute(1, new Object[] {AV111Wctablaalbbards_1_emprcod, Long.valueOf(AV112Wctablaalbbards_2_albprocod), lV113Wctablaalbbards_3_tfemprguirem, AV114Wctablaalbbards_4_tfemprguirem_sel});
      GRID_nRecordCount = H00MC3_AGRID_nRecordCount[0] ;
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
      AV111Wctablaalbbards_1_emprcod = AV99Emprcod ;
      AV112Wctablaalbbards_2_albprocod = AV100AlbProCod ;
      AV113Wctablaalbbards_3_tfemprguirem = AV103TFEmprGuiRem ;
      AV114Wctablaalbbards_4_tfemprguirem_sel = AV104TFEmprGuiRem_Sel ;
      AV115Wctablaalbbards_5_tfbarcod = AV26TFBarCod ;
      AV116Wctablaalbbards_6_tfbarcod_to = AV27TFBarCod_To ;
      AV117Wctablaalbbards_7_tfbarcodreo = AV29TFBarCodReo ;
      AV118Wctablaalbbards_8_tfbarcodreo_to = AV30TFBarCodReo_To ;
      AV119Wctablaalbbards_9_tfbarcodpar = AV32TFBarCodPar ;
      AV120Wctablaalbbards_10_tfbarcodpar_sel = AV33TFBarCodPar_Sel ;
      AV121Wctablaalbbards_11_tfalbser = AV35TFAlbSer ;
      AV122Wctablaalbbards_12_tfalbser_sel = AV36TFAlbSer_Sel ;
      AV123Wctablaalbbards_13_tfalbserd = AV38TFAlbSerD ;
      AV124Wctablaalbbards_14_tfalbserd_sel = AV39TFAlbSerD_Sel ;
      AV125Wctablaalbbards_15_tfalbcolnom = AV41TFAlbColNom ;
      AV126Wctablaalbbards_16_tfalbcolnom_sel = AV42TFAlbColNom_Sel ;
      AV127Wctablaalbbards_17_tfalbnomcli = AV44TFAlbNomCli ;
      AV128Wctablaalbbards_18_tfalbnomcli_sel = AV45TFAlbNomCli_Sel ;
      AV129Wctablaalbbards_19_tfalbcolnum = AV47TFAlbColNum ;
      AV130Wctablaalbbards_20_tfalbcolnum_to = AV48TFAlbColNum_To ;
      AV131Wctablaalbbards_21_tfcodcod = AV50TFCodCod ;
      AV132Wctablaalbbards_22_tfcodcod_sel = AV51TFCodCod_Sel ;
      AV133Wctablaalbbards_23_tfbaralbkgme = AV53TFBarAlbKgmE ;
      AV134Wctablaalbbards_24_tfbaralbkgme_to = AV54TFBarAlbKgmE_To ;
      AV135Wctablaalbbards_25_tfbarprekgm = AV56TFBarPreKgm ;
      AV136Wctablaalbbards_26_tfbarprekgm_to = AV57TFBarPreKgm_To ;
      AV137Wctablaalbbards_27_tfalbhdranc = AV59TFAlbHdrAnc ;
      AV138Wctablaalbbards_28_tfalbhdranc_to = AV60TFAlbHdrAnc_To ;
      AV139Wctablaalbbards_29_tfalbhdrgm2 = AV62TFAlbHdrgm2 ;
      AV140Wctablaalbbards_30_tfalbhdrgm2_to = AV63TFAlbHdrgm2_To ;
      AV141Wctablaalbbards_31_tfbaralbmtre = AV65TFBarAlbMtrE ;
      AV142Wctablaalbbards_32_tfbaralbmtre_to = AV66TFBarAlbMtrE_To ;
      AV143Wctablaalbbards_33_tfbarpremtr = AV68TFBarPreMtr ;
      AV144Wctablaalbbards_34_tfbarpremtr_to = AV69TFBarPreMtr_To ;
      AV145Wctablaalbbards_35_tfbaralbpie = AV71TFBarAlbPie ;
      AV146Wctablaalbbards_36_tfbaralbpie_to = AV72TFBarAlbPie_To ;
      AV147Wctablaalbbards_37_tftubcod = AV74TFTubCod ;
      AV148Wctablaalbbards_38_tftubcod_to = AV75TFTubCod_To ;
      AV149Wctablaalbbards_39_tfbaralbtub = AV77TFBarAlbTub ;
      AV150Wctablaalbbards_40_tfbaralbtub_to = AV78TFBarAlbTub_To ;
      AV151Wctablaalbbards_41_tfplascod = AV80TFPlasCod ;
      AV152Wctablaalbbards_42_tfplascod_to = AV81TFPlasCod_To ;
      AV153Wctablaalbbards_43_tfbaralbplas = AV83TFBarAlbPlas ;
      AV154Wctablaalbbards_44_tfbaralbplas_to = AV84TFBarAlbPlas_To ;
      AV155Wctablaalbbards_45_tfalbhdrobs = AV86TFAlbHdrObs ;
      AV156Wctablaalbbards_46_tfalbhdrobs_sel = AV87TFAlbHdrObs_Sel ;
      AV157Wctablaalbbards_47_tfalbproval_sels = AV90TFAlbProVal_Sels ;
      AV158Wctablaalbbards_48_tfalbtipent = AV92TFAlbTipEnt ;
      AV159Wctablaalbbards_49_tfalbtipent_sel = AV93TFAlbTipEnt_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV19ColumnsSelector, AV99Emprcod, AV100AlbProCod, AV103TFEmprGuiRem, AV104TFEmprGuiRem_Sel, AV26TFBarCod, AV27TFBarCod_To, AV29TFBarCodReo, AV30TFBarCodReo_To, AV32TFBarCodPar, AV33TFBarCodPar_Sel, AV35TFAlbSer, AV36TFAlbSer_Sel, AV38TFAlbSerD, AV39TFAlbSerD_Sel, AV41TFAlbColNom, AV42TFAlbColNom_Sel, AV44TFAlbNomCli, AV45TFAlbNomCli_Sel, AV47TFAlbColNum, AV48TFAlbColNum_To, AV50TFCodCod, AV51TFCodCod_Sel, AV53TFBarAlbKgmE, AV54TFBarAlbKgmE_To, AV56TFBarPreKgm, AV57TFBarPreKgm_To, AV59TFAlbHdrAnc, AV60TFAlbHdrAnc_To, AV62TFAlbHdrgm2, AV63TFAlbHdrgm2_To, AV65TFBarAlbMtrE, AV66TFBarAlbMtrE_To, AV68TFBarPreMtr, AV69TFBarPreMtr_To, AV71TFBarAlbPie, AV72TFBarAlbPie_To, AV74TFTubCod, AV75TFTubCod_To, AV77TFBarAlbTub, AV78TFBarAlbTub_To, AV80TFPlasCod, AV81TFPlasCod_To, AV83TFBarAlbPlas, AV84TFBarAlbPlas_To, AV86TFAlbHdrObs, AV87TFAlbHdrObs_Sel, AV90TFAlbProVal_Sels, AV92TFAlbTipEnt, AV93TFAlbTipEnt_Sel, AV160Pgmname, AV12OrderedBy, AV13OrderedDsc, AV111Wctablaalbbards_1_emprcod, AV112Wctablaalbbards_2_albprocod, A396EmprCod, A30AlbProCod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV111Wctablaalbbards_1_emprcod = AV99Emprcod ;
      AV112Wctablaalbbards_2_albprocod = AV100AlbProCod ;
      AV113Wctablaalbbards_3_tfemprguirem = AV103TFEmprGuiRem ;
      AV114Wctablaalbbards_4_tfemprguirem_sel = AV104TFEmprGuiRem_Sel ;
      AV115Wctablaalbbards_5_tfbarcod = AV26TFBarCod ;
      AV116Wctablaalbbards_6_tfbarcod_to = AV27TFBarCod_To ;
      AV117Wctablaalbbards_7_tfbarcodreo = AV29TFBarCodReo ;
      AV118Wctablaalbbards_8_tfbarcodreo_to = AV30TFBarCodReo_To ;
      AV119Wctablaalbbards_9_tfbarcodpar = AV32TFBarCodPar ;
      AV120Wctablaalbbards_10_tfbarcodpar_sel = AV33TFBarCodPar_Sel ;
      AV121Wctablaalbbards_11_tfalbser = AV35TFAlbSer ;
      AV122Wctablaalbbards_12_tfalbser_sel = AV36TFAlbSer_Sel ;
      AV123Wctablaalbbards_13_tfalbserd = AV38TFAlbSerD ;
      AV124Wctablaalbbards_14_tfalbserd_sel = AV39TFAlbSerD_Sel ;
      AV125Wctablaalbbards_15_tfalbcolnom = AV41TFAlbColNom ;
      AV126Wctablaalbbards_16_tfalbcolnom_sel = AV42TFAlbColNom_Sel ;
      AV127Wctablaalbbards_17_tfalbnomcli = AV44TFAlbNomCli ;
      AV128Wctablaalbbards_18_tfalbnomcli_sel = AV45TFAlbNomCli_Sel ;
      AV129Wctablaalbbards_19_tfalbcolnum = AV47TFAlbColNum ;
      AV130Wctablaalbbards_20_tfalbcolnum_to = AV48TFAlbColNum_To ;
      AV131Wctablaalbbards_21_tfcodcod = AV50TFCodCod ;
      AV132Wctablaalbbards_22_tfcodcod_sel = AV51TFCodCod_Sel ;
      AV133Wctablaalbbards_23_tfbaralbkgme = AV53TFBarAlbKgmE ;
      AV134Wctablaalbbards_24_tfbaralbkgme_to = AV54TFBarAlbKgmE_To ;
      AV135Wctablaalbbards_25_tfbarprekgm = AV56TFBarPreKgm ;
      AV136Wctablaalbbards_26_tfbarprekgm_to = AV57TFBarPreKgm_To ;
      AV137Wctablaalbbards_27_tfalbhdranc = AV59TFAlbHdrAnc ;
      AV138Wctablaalbbards_28_tfalbhdranc_to = AV60TFAlbHdrAnc_To ;
      AV139Wctablaalbbards_29_tfalbhdrgm2 = AV62TFAlbHdrgm2 ;
      AV140Wctablaalbbards_30_tfalbhdrgm2_to = AV63TFAlbHdrgm2_To ;
      AV141Wctablaalbbards_31_tfbaralbmtre = AV65TFBarAlbMtrE ;
      AV142Wctablaalbbards_32_tfbaralbmtre_to = AV66TFBarAlbMtrE_To ;
      AV143Wctablaalbbards_33_tfbarpremtr = AV68TFBarPreMtr ;
      AV144Wctablaalbbards_34_tfbarpremtr_to = AV69TFBarPreMtr_To ;
      AV145Wctablaalbbards_35_tfbaralbpie = AV71TFBarAlbPie ;
      AV146Wctablaalbbards_36_tfbaralbpie_to = AV72TFBarAlbPie_To ;
      AV147Wctablaalbbards_37_tftubcod = AV74TFTubCod ;
      AV148Wctablaalbbards_38_tftubcod_to = AV75TFTubCod_To ;
      AV149Wctablaalbbards_39_tfbaralbtub = AV77TFBarAlbTub ;
      AV150Wctablaalbbards_40_tfbaralbtub_to = AV78TFBarAlbTub_To ;
      AV151Wctablaalbbards_41_tfplascod = AV80TFPlasCod ;
      AV152Wctablaalbbards_42_tfplascod_to = AV81TFPlasCod_To ;
      AV153Wctablaalbbards_43_tfbaralbplas = AV83TFBarAlbPlas ;
      AV154Wctablaalbbards_44_tfbaralbplas_to = AV84TFBarAlbPlas_To ;
      AV155Wctablaalbbards_45_tfalbhdrobs = AV86TFAlbHdrObs ;
      AV156Wctablaalbbards_46_tfalbhdrobs_sel = AV87TFAlbHdrObs_Sel ;
      AV157Wctablaalbbards_47_tfalbproval_sels = AV90TFAlbProVal_Sels ;
      AV158Wctablaalbbards_48_tfalbtipent = AV92TFAlbTipEnt ;
      AV159Wctablaalbbards_49_tfalbtipent_sel = AV93TFAlbTipEnt_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV19ColumnsSelector, AV99Emprcod, AV100AlbProCod, AV103TFEmprGuiRem, AV104TFEmprGuiRem_Sel, AV26TFBarCod, AV27TFBarCod_To, AV29TFBarCodReo, AV30TFBarCodReo_To, AV32TFBarCodPar, AV33TFBarCodPar_Sel, AV35TFAlbSer, AV36TFAlbSer_Sel, AV38TFAlbSerD, AV39TFAlbSerD_Sel, AV41TFAlbColNom, AV42TFAlbColNom_Sel, AV44TFAlbNomCli, AV45TFAlbNomCli_Sel, AV47TFAlbColNum, AV48TFAlbColNum_To, AV50TFCodCod, AV51TFCodCod_Sel, AV53TFBarAlbKgmE, AV54TFBarAlbKgmE_To, AV56TFBarPreKgm, AV57TFBarPreKgm_To, AV59TFAlbHdrAnc, AV60TFAlbHdrAnc_To, AV62TFAlbHdrgm2, AV63TFAlbHdrgm2_To, AV65TFBarAlbMtrE, AV66TFBarAlbMtrE_To, AV68TFBarPreMtr, AV69TFBarPreMtr_To, AV71TFBarAlbPie, AV72TFBarAlbPie_To, AV74TFTubCod, AV75TFTubCod_To, AV77TFBarAlbTub, AV78TFBarAlbTub_To, AV80TFPlasCod, AV81TFPlasCod_To, AV83TFBarAlbPlas, AV84TFBarAlbPlas_To, AV86TFAlbHdrObs, AV87TFAlbHdrObs_Sel, AV90TFAlbProVal_Sels, AV92TFAlbTipEnt, AV93TFAlbTipEnt_Sel, AV160Pgmname, AV12OrderedBy, AV13OrderedDsc, AV111Wctablaalbbards_1_emprcod, AV112Wctablaalbbards_2_albprocod, A396EmprCod, A30AlbProCod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV111Wctablaalbbards_1_emprcod = AV99Emprcod ;
      AV112Wctablaalbbards_2_albprocod = AV100AlbProCod ;
      AV113Wctablaalbbards_3_tfemprguirem = AV103TFEmprGuiRem ;
      AV114Wctablaalbbards_4_tfemprguirem_sel = AV104TFEmprGuiRem_Sel ;
      AV115Wctablaalbbards_5_tfbarcod = AV26TFBarCod ;
      AV116Wctablaalbbards_6_tfbarcod_to = AV27TFBarCod_To ;
      AV117Wctablaalbbards_7_tfbarcodreo = AV29TFBarCodReo ;
      AV118Wctablaalbbards_8_tfbarcodreo_to = AV30TFBarCodReo_To ;
      AV119Wctablaalbbards_9_tfbarcodpar = AV32TFBarCodPar ;
      AV120Wctablaalbbards_10_tfbarcodpar_sel = AV33TFBarCodPar_Sel ;
      AV121Wctablaalbbards_11_tfalbser = AV35TFAlbSer ;
      AV122Wctablaalbbards_12_tfalbser_sel = AV36TFAlbSer_Sel ;
      AV123Wctablaalbbards_13_tfalbserd = AV38TFAlbSerD ;
      AV124Wctablaalbbards_14_tfalbserd_sel = AV39TFAlbSerD_Sel ;
      AV125Wctablaalbbards_15_tfalbcolnom = AV41TFAlbColNom ;
      AV126Wctablaalbbards_16_tfalbcolnom_sel = AV42TFAlbColNom_Sel ;
      AV127Wctablaalbbards_17_tfalbnomcli = AV44TFAlbNomCli ;
      AV128Wctablaalbbards_18_tfalbnomcli_sel = AV45TFAlbNomCli_Sel ;
      AV129Wctablaalbbards_19_tfalbcolnum = AV47TFAlbColNum ;
      AV130Wctablaalbbards_20_tfalbcolnum_to = AV48TFAlbColNum_To ;
      AV131Wctablaalbbards_21_tfcodcod = AV50TFCodCod ;
      AV132Wctablaalbbards_22_tfcodcod_sel = AV51TFCodCod_Sel ;
      AV133Wctablaalbbards_23_tfbaralbkgme = AV53TFBarAlbKgmE ;
      AV134Wctablaalbbards_24_tfbaralbkgme_to = AV54TFBarAlbKgmE_To ;
      AV135Wctablaalbbards_25_tfbarprekgm = AV56TFBarPreKgm ;
      AV136Wctablaalbbards_26_tfbarprekgm_to = AV57TFBarPreKgm_To ;
      AV137Wctablaalbbards_27_tfalbhdranc = AV59TFAlbHdrAnc ;
      AV138Wctablaalbbards_28_tfalbhdranc_to = AV60TFAlbHdrAnc_To ;
      AV139Wctablaalbbards_29_tfalbhdrgm2 = AV62TFAlbHdrgm2 ;
      AV140Wctablaalbbards_30_tfalbhdrgm2_to = AV63TFAlbHdrgm2_To ;
      AV141Wctablaalbbards_31_tfbaralbmtre = AV65TFBarAlbMtrE ;
      AV142Wctablaalbbards_32_tfbaralbmtre_to = AV66TFBarAlbMtrE_To ;
      AV143Wctablaalbbards_33_tfbarpremtr = AV68TFBarPreMtr ;
      AV144Wctablaalbbards_34_tfbarpremtr_to = AV69TFBarPreMtr_To ;
      AV145Wctablaalbbards_35_tfbaralbpie = AV71TFBarAlbPie ;
      AV146Wctablaalbbards_36_tfbaralbpie_to = AV72TFBarAlbPie_To ;
      AV147Wctablaalbbards_37_tftubcod = AV74TFTubCod ;
      AV148Wctablaalbbards_38_tftubcod_to = AV75TFTubCod_To ;
      AV149Wctablaalbbards_39_tfbaralbtub = AV77TFBarAlbTub ;
      AV150Wctablaalbbards_40_tfbaralbtub_to = AV78TFBarAlbTub_To ;
      AV151Wctablaalbbards_41_tfplascod = AV80TFPlasCod ;
      AV152Wctablaalbbards_42_tfplascod_to = AV81TFPlasCod_To ;
      AV153Wctablaalbbards_43_tfbaralbplas = AV83TFBarAlbPlas ;
      AV154Wctablaalbbards_44_tfbaralbplas_to = AV84TFBarAlbPlas_To ;
      AV155Wctablaalbbards_45_tfalbhdrobs = AV86TFAlbHdrObs ;
      AV156Wctablaalbbards_46_tfalbhdrobs_sel = AV87TFAlbHdrObs_Sel ;
      AV157Wctablaalbbards_47_tfalbproval_sels = AV90TFAlbProVal_Sels ;
      AV158Wctablaalbbards_48_tfalbtipent = AV92TFAlbTipEnt ;
      AV159Wctablaalbbards_49_tfalbtipent_sel = AV93TFAlbTipEnt_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV19ColumnsSelector, AV99Emprcod, AV100AlbProCod, AV103TFEmprGuiRem, AV104TFEmprGuiRem_Sel, AV26TFBarCod, AV27TFBarCod_To, AV29TFBarCodReo, AV30TFBarCodReo_To, AV32TFBarCodPar, AV33TFBarCodPar_Sel, AV35TFAlbSer, AV36TFAlbSer_Sel, AV38TFAlbSerD, AV39TFAlbSerD_Sel, AV41TFAlbColNom, AV42TFAlbColNom_Sel, AV44TFAlbNomCli, AV45TFAlbNomCli_Sel, AV47TFAlbColNum, AV48TFAlbColNum_To, AV50TFCodCod, AV51TFCodCod_Sel, AV53TFBarAlbKgmE, AV54TFBarAlbKgmE_To, AV56TFBarPreKgm, AV57TFBarPreKgm_To, AV59TFAlbHdrAnc, AV60TFAlbHdrAnc_To, AV62TFAlbHdrgm2, AV63TFAlbHdrgm2_To, AV65TFBarAlbMtrE, AV66TFBarAlbMtrE_To, AV68TFBarPreMtr, AV69TFBarPreMtr_To, AV71TFBarAlbPie, AV72TFBarAlbPie_To, AV74TFTubCod, AV75TFTubCod_To, AV77TFBarAlbTub, AV78TFBarAlbTub_To, AV80TFPlasCod, AV81TFPlasCod_To, AV83TFBarAlbPlas, AV84TFBarAlbPlas_To, AV86TFAlbHdrObs, AV87TFAlbHdrObs_Sel, AV90TFAlbProVal_Sels, AV92TFAlbTipEnt, AV93TFAlbTipEnt_Sel, AV160Pgmname, AV12OrderedBy, AV13OrderedDsc, AV111Wctablaalbbards_1_emprcod, AV112Wctablaalbbards_2_albprocod, A396EmprCod, A30AlbProCod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV111Wctablaalbbards_1_emprcod = AV99Emprcod ;
      AV112Wctablaalbbards_2_albprocod = AV100AlbProCod ;
      AV113Wctablaalbbards_3_tfemprguirem = AV103TFEmprGuiRem ;
      AV114Wctablaalbbards_4_tfemprguirem_sel = AV104TFEmprGuiRem_Sel ;
      AV115Wctablaalbbards_5_tfbarcod = AV26TFBarCod ;
      AV116Wctablaalbbards_6_tfbarcod_to = AV27TFBarCod_To ;
      AV117Wctablaalbbards_7_tfbarcodreo = AV29TFBarCodReo ;
      AV118Wctablaalbbards_8_tfbarcodreo_to = AV30TFBarCodReo_To ;
      AV119Wctablaalbbards_9_tfbarcodpar = AV32TFBarCodPar ;
      AV120Wctablaalbbards_10_tfbarcodpar_sel = AV33TFBarCodPar_Sel ;
      AV121Wctablaalbbards_11_tfalbser = AV35TFAlbSer ;
      AV122Wctablaalbbards_12_tfalbser_sel = AV36TFAlbSer_Sel ;
      AV123Wctablaalbbards_13_tfalbserd = AV38TFAlbSerD ;
      AV124Wctablaalbbards_14_tfalbserd_sel = AV39TFAlbSerD_Sel ;
      AV125Wctablaalbbards_15_tfalbcolnom = AV41TFAlbColNom ;
      AV126Wctablaalbbards_16_tfalbcolnom_sel = AV42TFAlbColNom_Sel ;
      AV127Wctablaalbbards_17_tfalbnomcli = AV44TFAlbNomCli ;
      AV128Wctablaalbbards_18_tfalbnomcli_sel = AV45TFAlbNomCli_Sel ;
      AV129Wctablaalbbards_19_tfalbcolnum = AV47TFAlbColNum ;
      AV130Wctablaalbbards_20_tfalbcolnum_to = AV48TFAlbColNum_To ;
      AV131Wctablaalbbards_21_tfcodcod = AV50TFCodCod ;
      AV132Wctablaalbbards_22_tfcodcod_sel = AV51TFCodCod_Sel ;
      AV133Wctablaalbbards_23_tfbaralbkgme = AV53TFBarAlbKgmE ;
      AV134Wctablaalbbards_24_tfbaralbkgme_to = AV54TFBarAlbKgmE_To ;
      AV135Wctablaalbbards_25_tfbarprekgm = AV56TFBarPreKgm ;
      AV136Wctablaalbbards_26_tfbarprekgm_to = AV57TFBarPreKgm_To ;
      AV137Wctablaalbbards_27_tfalbhdranc = AV59TFAlbHdrAnc ;
      AV138Wctablaalbbards_28_tfalbhdranc_to = AV60TFAlbHdrAnc_To ;
      AV139Wctablaalbbards_29_tfalbhdrgm2 = AV62TFAlbHdrgm2 ;
      AV140Wctablaalbbards_30_tfalbhdrgm2_to = AV63TFAlbHdrgm2_To ;
      AV141Wctablaalbbards_31_tfbaralbmtre = AV65TFBarAlbMtrE ;
      AV142Wctablaalbbards_32_tfbaralbmtre_to = AV66TFBarAlbMtrE_To ;
      AV143Wctablaalbbards_33_tfbarpremtr = AV68TFBarPreMtr ;
      AV144Wctablaalbbards_34_tfbarpremtr_to = AV69TFBarPreMtr_To ;
      AV145Wctablaalbbards_35_tfbaralbpie = AV71TFBarAlbPie ;
      AV146Wctablaalbbards_36_tfbaralbpie_to = AV72TFBarAlbPie_To ;
      AV147Wctablaalbbards_37_tftubcod = AV74TFTubCod ;
      AV148Wctablaalbbards_38_tftubcod_to = AV75TFTubCod_To ;
      AV149Wctablaalbbards_39_tfbaralbtub = AV77TFBarAlbTub ;
      AV150Wctablaalbbards_40_tfbaralbtub_to = AV78TFBarAlbTub_To ;
      AV151Wctablaalbbards_41_tfplascod = AV80TFPlasCod ;
      AV152Wctablaalbbards_42_tfplascod_to = AV81TFPlasCod_To ;
      AV153Wctablaalbbards_43_tfbaralbplas = AV83TFBarAlbPlas ;
      AV154Wctablaalbbards_44_tfbaralbplas_to = AV84TFBarAlbPlas_To ;
      AV155Wctablaalbbards_45_tfalbhdrobs = AV86TFAlbHdrObs ;
      AV156Wctablaalbbards_46_tfalbhdrobs_sel = AV87TFAlbHdrObs_Sel ;
      AV157Wctablaalbbards_47_tfalbproval_sels = AV90TFAlbProVal_Sels ;
      AV158Wctablaalbbards_48_tfalbtipent = AV92TFAlbTipEnt ;
      AV159Wctablaalbbards_49_tfalbtipent_sel = AV93TFAlbTipEnt_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV19ColumnsSelector, AV99Emprcod, AV100AlbProCod, AV103TFEmprGuiRem, AV104TFEmprGuiRem_Sel, AV26TFBarCod, AV27TFBarCod_To, AV29TFBarCodReo, AV30TFBarCodReo_To, AV32TFBarCodPar, AV33TFBarCodPar_Sel, AV35TFAlbSer, AV36TFAlbSer_Sel, AV38TFAlbSerD, AV39TFAlbSerD_Sel, AV41TFAlbColNom, AV42TFAlbColNom_Sel, AV44TFAlbNomCli, AV45TFAlbNomCli_Sel, AV47TFAlbColNum, AV48TFAlbColNum_To, AV50TFCodCod, AV51TFCodCod_Sel, AV53TFBarAlbKgmE, AV54TFBarAlbKgmE_To, AV56TFBarPreKgm, AV57TFBarPreKgm_To, AV59TFAlbHdrAnc, AV60TFAlbHdrAnc_To, AV62TFAlbHdrgm2, AV63TFAlbHdrgm2_To, AV65TFBarAlbMtrE, AV66TFBarAlbMtrE_To, AV68TFBarPreMtr, AV69TFBarPreMtr_To, AV71TFBarAlbPie, AV72TFBarAlbPie_To, AV74TFTubCod, AV75TFTubCod_To, AV77TFBarAlbTub, AV78TFBarAlbTub_To, AV80TFPlasCod, AV81TFPlasCod_To, AV83TFBarAlbPlas, AV84TFBarAlbPlas_To, AV86TFAlbHdrObs, AV87TFAlbHdrObs_Sel, AV90TFAlbProVal_Sels, AV92TFAlbTipEnt, AV93TFAlbTipEnt_Sel, AV160Pgmname, AV12OrderedBy, AV13OrderedDsc, AV111Wctablaalbbards_1_emprcod, AV112Wctablaalbbards_2_albprocod, A396EmprCod, A30AlbProCod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV111Wctablaalbbards_1_emprcod = AV99Emprcod ;
      AV112Wctablaalbbards_2_albprocod = AV100AlbProCod ;
      AV113Wctablaalbbards_3_tfemprguirem = AV103TFEmprGuiRem ;
      AV114Wctablaalbbards_4_tfemprguirem_sel = AV104TFEmprGuiRem_Sel ;
      AV115Wctablaalbbards_5_tfbarcod = AV26TFBarCod ;
      AV116Wctablaalbbards_6_tfbarcod_to = AV27TFBarCod_To ;
      AV117Wctablaalbbards_7_tfbarcodreo = AV29TFBarCodReo ;
      AV118Wctablaalbbards_8_tfbarcodreo_to = AV30TFBarCodReo_To ;
      AV119Wctablaalbbards_9_tfbarcodpar = AV32TFBarCodPar ;
      AV120Wctablaalbbards_10_tfbarcodpar_sel = AV33TFBarCodPar_Sel ;
      AV121Wctablaalbbards_11_tfalbser = AV35TFAlbSer ;
      AV122Wctablaalbbards_12_tfalbser_sel = AV36TFAlbSer_Sel ;
      AV123Wctablaalbbards_13_tfalbserd = AV38TFAlbSerD ;
      AV124Wctablaalbbards_14_tfalbserd_sel = AV39TFAlbSerD_Sel ;
      AV125Wctablaalbbards_15_tfalbcolnom = AV41TFAlbColNom ;
      AV126Wctablaalbbards_16_tfalbcolnom_sel = AV42TFAlbColNom_Sel ;
      AV127Wctablaalbbards_17_tfalbnomcli = AV44TFAlbNomCli ;
      AV128Wctablaalbbards_18_tfalbnomcli_sel = AV45TFAlbNomCli_Sel ;
      AV129Wctablaalbbards_19_tfalbcolnum = AV47TFAlbColNum ;
      AV130Wctablaalbbards_20_tfalbcolnum_to = AV48TFAlbColNum_To ;
      AV131Wctablaalbbards_21_tfcodcod = AV50TFCodCod ;
      AV132Wctablaalbbards_22_tfcodcod_sel = AV51TFCodCod_Sel ;
      AV133Wctablaalbbards_23_tfbaralbkgme = AV53TFBarAlbKgmE ;
      AV134Wctablaalbbards_24_tfbaralbkgme_to = AV54TFBarAlbKgmE_To ;
      AV135Wctablaalbbards_25_tfbarprekgm = AV56TFBarPreKgm ;
      AV136Wctablaalbbards_26_tfbarprekgm_to = AV57TFBarPreKgm_To ;
      AV137Wctablaalbbards_27_tfalbhdranc = AV59TFAlbHdrAnc ;
      AV138Wctablaalbbards_28_tfalbhdranc_to = AV60TFAlbHdrAnc_To ;
      AV139Wctablaalbbards_29_tfalbhdrgm2 = AV62TFAlbHdrgm2 ;
      AV140Wctablaalbbards_30_tfalbhdrgm2_to = AV63TFAlbHdrgm2_To ;
      AV141Wctablaalbbards_31_tfbaralbmtre = AV65TFBarAlbMtrE ;
      AV142Wctablaalbbards_32_tfbaralbmtre_to = AV66TFBarAlbMtrE_To ;
      AV143Wctablaalbbards_33_tfbarpremtr = AV68TFBarPreMtr ;
      AV144Wctablaalbbards_34_tfbarpremtr_to = AV69TFBarPreMtr_To ;
      AV145Wctablaalbbards_35_tfbaralbpie = AV71TFBarAlbPie ;
      AV146Wctablaalbbards_36_tfbaralbpie_to = AV72TFBarAlbPie_To ;
      AV147Wctablaalbbards_37_tftubcod = AV74TFTubCod ;
      AV148Wctablaalbbards_38_tftubcod_to = AV75TFTubCod_To ;
      AV149Wctablaalbbards_39_tfbaralbtub = AV77TFBarAlbTub ;
      AV150Wctablaalbbards_40_tfbaralbtub_to = AV78TFBarAlbTub_To ;
      AV151Wctablaalbbards_41_tfplascod = AV80TFPlasCod ;
      AV152Wctablaalbbards_42_tfplascod_to = AV81TFPlasCod_To ;
      AV153Wctablaalbbards_43_tfbaralbplas = AV83TFBarAlbPlas ;
      AV154Wctablaalbbards_44_tfbaralbplas_to = AV84TFBarAlbPlas_To ;
      AV155Wctablaalbbards_45_tfalbhdrobs = AV86TFAlbHdrObs ;
      AV156Wctablaalbbards_46_tfalbhdrobs_sel = AV87TFAlbHdrObs_Sel ;
      AV157Wctablaalbbards_47_tfalbproval_sels = AV90TFAlbProVal_Sels ;
      AV158Wctablaalbbards_48_tfalbtipent = AV92TFAlbTipEnt ;
      AV159Wctablaalbbards_49_tfalbtipent_sel = AV93TFAlbTipEnt_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV19ColumnsSelector, AV99Emprcod, AV100AlbProCod, AV103TFEmprGuiRem, AV104TFEmprGuiRem_Sel, AV26TFBarCod, AV27TFBarCod_To, AV29TFBarCodReo, AV30TFBarCodReo_To, AV32TFBarCodPar, AV33TFBarCodPar_Sel, AV35TFAlbSer, AV36TFAlbSer_Sel, AV38TFAlbSerD, AV39TFAlbSerD_Sel, AV41TFAlbColNom, AV42TFAlbColNom_Sel, AV44TFAlbNomCli, AV45TFAlbNomCli_Sel, AV47TFAlbColNum, AV48TFAlbColNum_To, AV50TFCodCod, AV51TFCodCod_Sel, AV53TFBarAlbKgmE, AV54TFBarAlbKgmE_To, AV56TFBarPreKgm, AV57TFBarPreKgm_To, AV59TFAlbHdrAnc, AV60TFAlbHdrAnc_To, AV62TFAlbHdrgm2, AV63TFAlbHdrgm2_To, AV65TFBarAlbMtrE, AV66TFBarAlbMtrE_To, AV68TFBarPreMtr, AV69TFBarPreMtr_To, AV71TFBarAlbPie, AV72TFBarAlbPie_To, AV74TFTubCod, AV75TFTubCod_To, AV77TFBarAlbTub, AV78TFBarAlbTub_To, AV80TFPlasCod, AV81TFPlasCod_To, AV83TFBarAlbPlas, AV84TFBarAlbPlas_To, AV86TFAlbHdrObs, AV87TFAlbHdrObs_Sel, AV90TFAlbProVal_Sels, AV92TFAlbTipEnt, AV93TFAlbTipEnt_Sel, AV160Pgmname, AV12OrderedBy, AV13OrderedDsc, AV111Wctablaalbbards_1_emprcod, AV112Wctablaalbbards_2_albprocod, A396EmprCod, A30AlbProCod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV160Pgmname = "WCTablaAlbbar" ;
      Gx_err = (short)(0) ;
      edtavAlbprocod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlbprocod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbprocod_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strupMC0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e17MC2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV95DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV19ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_36 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_36"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV97GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV98GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV99Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV99Emprcod") ;
         wcpOAV100AlbProCod = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV100AlbProCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV99Emprcod = httpContext.cgiGet( sPrefix+"vEMPRCOD") ;
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
         Ddo_grid_Allowmultipleselection = httpContext.cgiGet( sPrefix+"DDO_GRID_Allowmultipleselection") ;
         Ddo_grid_Datalistfixedvalues = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalistfixedvalues") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalistproc") ;
         Ddo_gridcolumnsselector_Caption = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption") ;
         Ddo_gridcolumnsselector_Tooltip = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip") ;
         Ddo_gridcolumnsselector_Cls = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls") ;
         Ddo_gridcolumnsselector_Dropdownoptionstype = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype") ;
         Ddo_gridcolumnsselector_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname") ;
         Ddo_gridcolumnsselector_Titlecontrolidtoreplace = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Hascolumnsselector = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hascolumnsselector")) ;
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
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         A30AlbProCod = localUtil.ctol( httpContext.cgiGet( edtAlbProCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         /* Read subfile selected row values. */
         nGXsfl_36_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_36_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_36_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_362( ) ;
         if ( nGXsfl_36_idx > 0 )
         {
            cmbavGridactions.setName( cmbavGridactions.getInternalname() );
            cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
            AV105GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV105GridActions), 4, 0));
            A1253EmprGuiRem = GXutil.upper( httpContext.cgiGet( edtEmprGuiRem_Internalname)) ;
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
            A3391AlbSer = httpContext.cgiGet( edtAlbSer_Internalname) ;
            A8879AlbSerD = httpContext.cgiGet( edtAlbSerD_Internalname) ;
            A3392AlbColNom = httpContext.cgiGet( edtAlbColNom_Internalname) ;
            A12232AlbNomCli = httpContext.cgiGet( edtAlbNomCli_Internalname) ;
            A3393AlbColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A3153CodCod = httpContext.cgiGet( edtCodCod_Internalname) ;
            A1261BarAlbKgmE = localUtil.ctond( httpContext.cgiGet( edtBarAlbKgmE_Internalname)) ;
            A1262BarPreKgm = localUtil.ctond( httpContext.cgiGet( edtBarPreKgm_Internalname)) ;
            A3271AlbHdrAnc = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbHdrAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A5019AlbHdrgm2 = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbHdrgm2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1263BarAlbMtrE = localUtil.ctond( httpContext.cgiGet( edtBarAlbMtrE_Internalname)) ;
            A1264BarPreMtr = localUtil.ctond( httpContext.cgiGet( edtBarPreMtr_Internalname)) ;
            A1265BarAlbPie = (int)(localUtil.ctol( httpContext.cgiGet( edtBarAlbPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1206TubCod = (short)(localUtil.ctol( httpContext.cgiGet( edtTubCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1266BarAlbTub = (int)(localUtil.ctol( httpContext.cgiGet( edtBarAlbTub_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A6466PlasCod = (short)(localUtil.ctol( httpContext.cgiGet( edtPlasCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A6467BarAlbPlas = (short)(localUtil.ctol( httpContext.cgiGet( edtBarAlbPlas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A2441AlbHdrObs = httpContext.cgiGet( edtAlbHdrObs_Internalname) ;
            cmbAlbProVal.setName( cmbAlbProVal.getInternalname() );
            cmbAlbProVal.setValue( httpContext.cgiGet( cmbAlbProVal.getInternalname()) );
            A2839AlbProVal = httpContext.cgiGet( cmbAlbProVal.getInternalname()) ;
            A1095AlbTipEnt = GXutil.upper( httpContext.cgiGet( edtAlbTipEnt_Internalname)) ;
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"WCTablaAlbbar");
         A396EmprCod = httpContext.cgiGet( edtEmprCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         forbiddenHiddens.add("EmprCod", GXutil.rtrim( localUtil.format( A396EmprCod, "@!")));
         A30AlbProCod = localUtil.ctol( httpContext.cgiGet( edtAlbProCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         forbiddenHiddens.add("AlbProCod", localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9"));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("wctablaalbbar:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e17MC2 ();
      if (returnInSub) return;
   }

   public void e17MC2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_int1 = (byte)(AV101Artemalha) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV99Emprcod, httpContext.getMessage( "ARTEMH", ""), GXv_int2) ;
      wctablaalbbar_impl.this.GXt_int1 = GXv_int2[0] ;
      AV101Artemalha = GXt_int1 ;
      GXt_int1 = (byte)(AV102siplasticos) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV99Emprcod, httpContext.getMessage( "PLASTI", ""), GXv_int2) ;
      wctablaalbbar_impl.this.GXt_int1 = GXv_int2[0] ;
      AV102siplasticos = GXt_int1 ;
      edtCodCod_Visible = (((AV101Artemalha==1) ? true : false) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCodCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCodCod_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtPlasCod_Visible = (((AV102siplasticos==1) ? true : false) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPlasCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlasCod_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtBarAlbPlas_Visible = (((AV102siplasticos==1) ? true : false) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarAlbPlas_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbPlas_Visible), 5, 0), !bGXsfl_36_Refreshing);
      GXt_char3 = AV108Station ;
      GXv_char4[0] = GXt_char3 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      wctablaalbbar_impl.this.GXt_char3 = GXv_char4[0] ;
      AV108Station = GXt_char3 ;
      GXv_char4[0] = AV99Emprcod ;
      GXv_char5[0] = AV109Emprnom ;
      GXv_char6[0] = AV110Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV108Station, GXv_char4, GXv_char5, GXv_char6) ;
      wctablaalbbar_impl.this.AV99Emprcod = GXv_char4[0] ;
      wctablaalbbar_impl.this.AV109Emprnom = GXv_char5[0] ;
      wctablaalbbar_impl.this.AV110Usurcod = GXv_char6[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV99Emprcod", AV99Emprcod);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      edtAlbProCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbProCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCod_Visible), 5, 0), true);
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
      /* Object Property */
      if ( GXutil.len( sPrefix) == 0 )
      {
         bDynCreated_Wcwctablaalbfas = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwctablaalbfas_Component), GXutil.lower( "WCTablaAlbfas")) != 0 )
      {
         WebComp_Wcwctablaalbfas = WebUtils.getWebComponent(getClass(), "app.wctablaalbfas_impl", remoteHandle, context);
         WebComp_Wcwctablaalbfas_Component = "WCTablaAlbfas" ;
      }
      if ( GXutil.len( WebComp_Wcwctablaalbfas_Component) != 0 )
      {
         WebComp_Wcwctablaalbfas.setjustcreated();
         WebComp_Wcwctablaalbfas.componentprepare(new Object[] {sPrefix+"W0072","",AV99Emprcod,Long.valueOf(AV100AlbProCod),Integer.valueOf(A129BarCod),Byte.valueOf(A132BarCodReo),A130BarCodPar});
         WebComp_Wcwctablaalbfas.componentbind(new Object[] {"",sPrefix+"vALBPROCOD","","",""});
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = AV95DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] ;
      AV95DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e18MC2( )
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
      S142 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV21Session.getValue("WCTablaAlbbarColumnsSelector"), "") != 0 )
      {
         AV17ColumnsSelectorXML = AV21Session.getValue("WCTablaAlbbarColumnsSelector") ;
         AV19ColumnsSelector.fromxml(AV17ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S152 ();
         if (returnInSub) return;
      }
      edtEmprGuiRem_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtEmprGuiRem_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprGuiRem_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtBarCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtBarCodReo_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarCodReo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtBarCodPar_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarCodPar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtAlbSer_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbSer_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbSer_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtAlbSerD_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbSerD_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbSerD_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtAlbColNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbColNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbColNom_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtAlbNomCli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbNomCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbNomCli_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtAlbColNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbColNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbColNum_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtCodCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCodCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCodCod_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtBarAlbKgmE_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarAlbKgmE_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbKgmE_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtBarPreKgm_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarPreKgm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPreKgm_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtAlbHdrAnc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbHdrAnc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdrAnc_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtAlbHdrgm2_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbHdrgm2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdrgm2_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtBarAlbMtrE_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarAlbMtrE_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbMtrE_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtBarPreMtr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarPreMtr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPreMtr_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtBarAlbPie_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarAlbPie_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbPie_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtTubCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtTubCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTubCod_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtBarAlbTub_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarAlbTub_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbTub_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtPlasCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPlasCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlasCod_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtBarAlbPlas_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarAlbPlas_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbPlas_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtAlbHdrObs_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbHdrObs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdrObs_Visible), 5, 0), !bGXsfl_36_Refreshing);
      cmbAlbProVal.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlbProVal.getInternalname(), "Visible", GXutil.ltrimstr( cmbAlbProVal.getVisible(), 5, 0), !bGXsfl_36_Refreshing);
      edtAlbTipEnt_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbTipEnt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbTipEnt_Visible), 5, 0), !bGXsfl_36_Refreshing);
      AV97GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV97GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV97GridCurrentPage), 10, 0));
      AV98GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV98GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV98GridPageCount), 10, 0));
      AV111Wctablaalbbards_1_emprcod = AV99Emprcod ;
      AV112Wctablaalbbards_2_albprocod = AV100AlbProCod ;
      AV113Wctablaalbbards_3_tfemprguirem = AV103TFEmprGuiRem ;
      AV114Wctablaalbbards_4_tfemprguirem_sel = AV104TFEmprGuiRem_Sel ;
      AV115Wctablaalbbards_5_tfbarcod = AV26TFBarCod ;
      AV116Wctablaalbbards_6_tfbarcod_to = AV27TFBarCod_To ;
      AV117Wctablaalbbards_7_tfbarcodreo = AV29TFBarCodReo ;
      AV118Wctablaalbbards_8_tfbarcodreo_to = AV30TFBarCodReo_To ;
      AV119Wctablaalbbards_9_tfbarcodpar = AV32TFBarCodPar ;
      AV120Wctablaalbbards_10_tfbarcodpar_sel = AV33TFBarCodPar_Sel ;
      AV121Wctablaalbbards_11_tfalbser = AV35TFAlbSer ;
      AV122Wctablaalbbards_12_tfalbser_sel = AV36TFAlbSer_Sel ;
      AV123Wctablaalbbards_13_tfalbserd = AV38TFAlbSerD ;
      AV124Wctablaalbbards_14_tfalbserd_sel = AV39TFAlbSerD_Sel ;
      AV125Wctablaalbbards_15_tfalbcolnom = AV41TFAlbColNom ;
      AV126Wctablaalbbards_16_tfalbcolnom_sel = AV42TFAlbColNom_Sel ;
      AV127Wctablaalbbards_17_tfalbnomcli = AV44TFAlbNomCli ;
      AV128Wctablaalbbards_18_tfalbnomcli_sel = AV45TFAlbNomCli_Sel ;
      AV129Wctablaalbbards_19_tfalbcolnum = AV47TFAlbColNum ;
      AV130Wctablaalbbards_20_tfalbcolnum_to = AV48TFAlbColNum_To ;
      AV131Wctablaalbbards_21_tfcodcod = AV50TFCodCod ;
      AV132Wctablaalbbards_22_tfcodcod_sel = AV51TFCodCod_Sel ;
      AV133Wctablaalbbards_23_tfbaralbkgme = AV53TFBarAlbKgmE ;
      AV134Wctablaalbbards_24_tfbaralbkgme_to = AV54TFBarAlbKgmE_To ;
      AV135Wctablaalbbards_25_tfbarprekgm = AV56TFBarPreKgm ;
      AV136Wctablaalbbards_26_tfbarprekgm_to = AV57TFBarPreKgm_To ;
      AV137Wctablaalbbards_27_tfalbhdranc = AV59TFAlbHdrAnc ;
      AV138Wctablaalbbards_28_tfalbhdranc_to = AV60TFAlbHdrAnc_To ;
      AV139Wctablaalbbards_29_tfalbhdrgm2 = AV62TFAlbHdrgm2 ;
      AV140Wctablaalbbards_30_tfalbhdrgm2_to = AV63TFAlbHdrgm2_To ;
      AV141Wctablaalbbards_31_tfbaralbmtre = AV65TFBarAlbMtrE ;
      AV142Wctablaalbbards_32_tfbaralbmtre_to = AV66TFBarAlbMtrE_To ;
      AV143Wctablaalbbards_33_tfbarpremtr = AV68TFBarPreMtr ;
      AV144Wctablaalbbards_34_tfbarpremtr_to = AV69TFBarPreMtr_To ;
      AV145Wctablaalbbards_35_tfbaralbpie = AV71TFBarAlbPie ;
      AV146Wctablaalbbards_36_tfbaralbpie_to = AV72TFBarAlbPie_To ;
      AV147Wctablaalbbards_37_tftubcod = AV74TFTubCod ;
      AV148Wctablaalbbards_38_tftubcod_to = AV75TFTubCod_To ;
      AV149Wctablaalbbards_39_tfbaralbtub = AV77TFBarAlbTub ;
      AV150Wctablaalbbards_40_tfbaralbtub_to = AV78TFBarAlbTub_To ;
      AV151Wctablaalbbards_41_tfplascod = AV80TFPlasCod ;
      AV152Wctablaalbbards_42_tfplascod_to = AV81TFPlasCod_To ;
      AV153Wctablaalbbards_43_tfbaralbplas = AV83TFBarAlbPlas ;
      AV154Wctablaalbbards_44_tfbaralbplas_to = AV84TFBarAlbPlas_To ;
      AV155Wctablaalbbards_45_tfalbhdrobs = AV86TFAlbHdrObs ;
      AV156Wctablaalbbards_46_tfalbhdrobs_sel = AV87TFAlbHdrObs_Sel ;
      AV157Wctablaalbbards_47_tfalbproval_sels = AV90TFAlbProVal_Sels ;
      AV158Wctablaalbbards_48_tfalbtipent = AV92TFAlbTipEnt ;
      AV159Wctablaalbbards_49_tfalbtipent_sel = AV93TFAlbTipEnt_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV19ColumnsSelector", AV19ColumnsSelector);
   }

   public void e12MC2( )
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
         AV96PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV96PageToGo) ;
      }
   }

   public void e13MC2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e14MC2( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "EmprGuiRem") == 0 )
         {
            AV103TFEmprGuiRem = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV103TFEmprGuiRem", AV103TFEmprGuiRem);
            AV104TFEmprGuiRem_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV104TFEmprGuiRem_Sel", AV104TFEmprGuiRem_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarCod") == 0 )
         {
            AV26TFBarCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFBarCod), 8, 0));
            AV27TFBarCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFBarCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFBarCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarCodReo") == 0 )
         {
            AV29TFBarCodReo = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFBarCodReo", GXutil.str( AV29TFBarCodReo, 1, 0));
            AV30TFBarCodReo_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFBarCodReo_To", GXutil.str( AV30TFBarCodReo_To, 1, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarCodPar") == 0 )
         {
            AV32TFBarCodPar = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFBarCodPar", AV32TFBarCodPar);
            AV33TFBarCodPar_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFBarCodPar_Sel", AV33TFBarCodPar_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbSer") == 0 )
         {
            AV35TFAlbSer = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFAlbSer", AV35TFAlbSer);
            AV36TFAlbSer_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFAlbSer_Sel", AV36TFAlbSer_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbSerD") == 0 )
         {
            AV38TFAlbSerD = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFAlbSerD", AV38TFAlbSerD);
            AV39TFAlbSerD_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFAlbSerD_Sel", AV39TFAlbSerD_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbColNom") == 0 )
         {
            AV41TFAlbColNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFAlbColNom", AV41TFAlbColNom);
            AV42TFAlbColNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFAlbColNom_Sel", AV42TFAlbColNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbNomCli") == 0 )
         {
            AV44TFAlbNomCli = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFAlbNomCli", AV44TFAlbNomCli);
            AV45TFAlbNomCli_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFAlbNomCli_Sel", AV45TFAlbNomCli_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbColNum") == 0 )
         {
            AV47TFAlbColNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFAlbColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFAlbColNum), 6, 0));
            AV48TFAlbColNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFAlbColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFAlbColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CodCod") == 0 )
         {
            AV50TFCodCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFCodCod", AV50TFCodCod);
            AV51TFCodCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFCodCod_Sel", AV51TFCodCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarAlbKgmE") == 0 )
         {
            AV53TFBarAlbKgmE = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFBarAlbKgmE", GXutil.ltrimstr( AV53TFBarAlbKgmE, 9, 2));
            AV54TFBarAlbKgmE_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFBarAlbKgmE_To", GXutil.ltrimstr( AV54TFBarAlbKgmE_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarPreKgm") == 0 )
         {
            AV56TFBarPreKgm = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFBarPreKgm", GXutil.ltrimstr( AV56TFBarPreKgm, 13, 5));
            AV57TFBarPreKgm_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFBarPreKgm_To", GXutil.ltrimstr( AV57TFBarPreKgm_To, 13, 5));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbHdrAnc") == 0 )
         {
            AV59TFAlbHdrAnc = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFAlbHdrAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59TFAlbHdrAnc), 4, 0));
            AV60TFAlbHdrAnc_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFAlbHdrAnc_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60TFAlbHdrAnc_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbHdrgm2") == 0 )
         {
            AV62TFAlbHdrgm2 = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFAlbHdrgm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62TFAlbHdrgm2), 4, 0));
            AV63TFAlbHdrgm2_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFAlbHdrgm2_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63TFAlbHdrgm2_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarAlbMtrE") == 0 )
         {
            AV65TFBarAlbMtrE = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFBarAlbMtrE", GXutil.ltrimstr( AV65TFBarAlbMtrE, 9, 2));
            AV66TFBarAlbMtrE_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFBarAlbMtrE_To", GXutil.ltrimstr( AV66TFBarAlbMtrE_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarPreMtr") == 0 )
         {
            AV68TFBarPreMtr = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TFBarPreMtr", GXutil.ltrimstr( AV68TFBarPreMtr, 13, 5));
            AV69TFBarPreMtr_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69TFBarPreMtr_To", GXutil.ltrimstr( AV69TFBarPreMtr_To, 13, 5));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarAlbPie") == 0 )
         {
            AV71TFBarAlbPie = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71TFBarAlbPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71TFBarAlbPie), 6, 0));
            AV72TFBarAlbPie_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72TFBarAlbPie_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72TFBarAlbPie_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "TubCod") == 0 )
         {
            AV74TFTubCod = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74TFTubCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74TFTubCod), 4, 0));
            AV75TFTubCod_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75TFTubCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV75TFTubCod_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarAlbTub") == 0 )
         {
            AV77TFBarAlbTub = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77TFBarAlbTub", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77TFBarAlbTub), 6, 0));
            AV78TFBarAlbTub_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78TFBarAlbTub_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV78TFBarAlbTub_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PlasCod") == 0 )
         {
            AV80TFPlasCod = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80TFPlasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80TFPlasCod), 4, 0));
            AV81TFPlasCod_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81TFPlasCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81TFPlasCod_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarAlbPlas") == 0 )
         {
            AV83TFBarAlbPlas = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83TFBarAlbPlas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83TFBarAlbPlas), 4, 0));
            AV84TFBarAlbPlas_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84TFBarAlbPlas_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV84TFBarAlbPlas_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbHdrObs") == 0 )
         {
            AV86TFAlbHdrObs = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV86TFAlbHdrObs", AV86TFAlbHdrObs);
            AV87TFAlbHdrObs_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV87TFAlbHdrObs_Sel", AV87TFAlbHdrObs_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbProVal") == 0 )
         {
            AV89TFAlbProVal_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89TFAlbProVal_SelsJson", AV89TFAlbProVal_SelsJson);
            AV90TFAlbProVal_Sels.fromJSonString(AV89TFAlbProVal_SelsJson, null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbTipEnt") == 0 )
         {
            AV92TFAlbTipEnt = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92TFAlbTipEnt", AV92TFAlbTipEnt);
            AV93TFAlbTipEnt_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV93TFAlbTipEnt_Sel", AV93TFAlbTipEnt_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV90TFAlbProVal_Sels", AV90TFAlbProVal_Sels);
   }

   private void e19MC2( )
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
         wbStart = (short)(36) ;
      }
      sendrow_362( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_36_Refreshing )
      {
         httpContext.doAjaxLoad(36, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV105GridActions, 4, 0)) );
   }

   public void e15MC2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV17ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV19ColumnsSelector.fromJSonString(AV17ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "WCTablaAlbbarColumnsSelector", ((GXutil.strcmp("", AV17ColumnsSelectorXML)==0) ? "" : AV19ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV19ColumnsSelector", AV19ColumnsSelector);
   }

   public void e16MC2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char6[0] = AV15ExcelFilename ;
      GXv_char5[0] = AV16ErrorMessage ;
      new app.wctablaalbbarexport(remoteHandle, context).execute( GXv_char6, GXv_char5) ;
      wctablaalbbar_impl.this.AV15ExcelFilename = GXv_char6[0] ;
      wctablaalbbar_impl.this.AV16ErrorMessage = GXv_char5[0] ;
      if ( GXutil.strcmp(AV15ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV15ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV16ErrorMessage);
      }
   }

   public void S132( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV12OrderedBy, 4, 0))+":"+(AV13OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S152( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV19ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "EmprGuiRem", "", "EmprGuiRem", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "BarCod", "", "OS", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "BarCodReo", "", "R", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "BarCodPar", "", "P", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "AlbSer", "", "Artigo", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "AlbSerD", "", "Descriçao", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "AlbColNom", "", "Cor", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "AlbNomCli", "", "Cor Cli", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "AlbColNum", "", "Numero Cor", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CodCod", "", "ERP", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "BarAlbKgmE", "", "Quilos", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "BarPreKgm", "", "Preço", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "AlbHdrAnc", "", "Largura", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "AlbHdrgm2", "", "Grm2", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "BarAlbMtrE", "", "Metros", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "BarPreMtr", "", "Preço", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "BarAlbPie", "", "Peças", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "TubCod", "", "Tubo", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "BarAlbTub", "", "Qtde", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "PlasCod", "", "Plasticos", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "BarAlbPlas", "", "Qtde", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "AlbHdrObs", "", "Obs", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "AlbProVal", "", "F?", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "AlbTipEnt", "", "P_T", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXt_char3 = AV18UserCustomValue ;
      GXv_char6[0] = GXt_char3 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WCTablaAlbbarColumnsSelector", GXv_char6) ;
      wctablaalbbar_impl.this.GXt_char3 = GXv_char6[0] ;
      AV18UserCustomValue = GXt_char3 ;
      if ( ! ( (GXutil.strcmp("", AV18UserCustomValue)==0) ) )
      {
         AV20ColumnsSelectorAux.fromxml(AV18UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector11[0] = AV19ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, GXv_SdtWWPColumnsSelector11) ;
         AV20ColumnsSelectorAux = GXv_SdtWWPColumnsSelector10[0] ;
         AV19ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      }
   }

   public void S162( )
   {
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.ttrn07", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0))}, new String[] {"Mode","EmprCod","AlbProCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S172( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.ttrn07", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0))}, new String[] {"Mode","EmprCod","AlbProCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV21Session.getValue(AV160Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV160Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV21Session.getValue(AV160Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S132 ();
      if (returnInSub) return;
      AV161GXV1 = 1 ;
      while ( AV161GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV161GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRGUIREM") == 0 )
         {
            AV103TFEmprGuiRem = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV103TFEmprGuiRem", AV103TFEmprGuiRem);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRGUIREM_SEL") == 0 )
         {
            AV104TFEmprGuiRem_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV104TFEmprGuiRem_Sel", AV104TFEmprGuiRem_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOD") == 0 )
         {
            AV26TFBarCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFBarCod), 8, 0));
            AV27TFBarCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFBarCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFBarCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODREO") == 0 )
         {
            AV29TFBarCodReo = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFBarCodReo", GXutil.str( AV29TFBarCodReo, 1, 0));
            AV30TFBarCodReo_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFBarCodReo_To", GXutil.str( AV30TFBarCodReo_To, 1, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODPAR") == 0 )
         {
            AV32TFBarCodPar = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFBarCodPar", AV32TFBarCodPar);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODPAR_SEL") == 0 )
         {
            AV33TFBarCodPar_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFBarCodPar_Sel", AV33TFBarCodPar_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBSER") == 0 )
         {
            AV35TFAlbSer = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFAlbSer", AV35TFAlbSer);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBSER_SEL") == 0 )
         {
            AV36TFAlbSer_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFAlbSer_Sel", AV36TFAlbSer_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBSERD") == 0 )
         {
            AV38TFAlbSerD = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFAlbSerD", AV38TFAlbSerD);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBSERD_SEL") == 0 )
         {
            AV39TFAlbSerD_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFAlbSerD_Sel", AV39TFAlbSerD_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOLNOM") == 0 )
         {
            AV41TFAlbColNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFAlbColNom", AV41TFAlbColNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOLNOM_SEL") == 0 )
         {
            AV42TFAlbColNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFAlbColNom_Sel", AV42TFAlbColNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBNOMCLI") == 0 )
         {
            AV44TFAlbNomCli = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFAlbNomCli", AV44TFAlbNomCli);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBNOMCLI_SEL") == 0 )
         {
            AV45TFAlbNomCli_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFAlbNomCli_Sel", AV45TFAlbNomCli_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOLNUM") == 0 )
         {
            AV47TFAlbColNum = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFAlbColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFAlbColNum), 6, 0));
            AV48TFAlbColNum_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFAlbColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFAlbColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCODCOD") == 0 )
         {
            AV50TFCodCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFCodCod", AV50TFCodCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCODCOD_SEL") == 0 )
         {
            AV51TFCodCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFCodCod_Sel", AV51TFCodCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBKGME") == 0 )
         {
            AV53TFBarAlbKgmE = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFBarAlbKgmE", GXutil.ltrimstr( AV53TFBarAlbKgmE, 9, 2));
            AV54TFBarAlbKgmE_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFBarAlbKgmE_To", GXutil.ltrimstr( AV54TFBarAlbKgmE_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPREKGM") == 0 )
         {
            AV56TFBarPreKgm = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFBarPreKgm", GXutil.ltrimstr( AV56TFBarPreKgm, 13, 5));
            AV57TFBarPreKgm_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFBarPreKgm_To", GXutil.ltrimstr( AV57TFBarPreKgm_To, 13, 5));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBHDRANC") == 0 )
         {
            AV59TFAlbHdrAnc = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFAlbHdrAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59TFAlbHdrAnc), 4, 0));
            AV60TFAlbHdrAnc_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFAlbHdrAnc_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60TFAlbHdrAnc_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBHDRGM2") == 0 )
         {
            AV62TFAlbHdrgm2 = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFAlbHdrgm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62TFAlbHdrgm2), 4, 0));
            AV63TFAlbHdrgm2_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFAlbHdrgm2_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63TFAlbHdrgm2_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBMTRE") == 0 )
         {
            AV65TFBarAlbMtrE = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFBarAlbMtrE", GXutil.ltrimstr( AV65TFBarAlbMtrE, 9, 2));
            AV66TFBarAlbMtrE_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFBarAlbMtrE_To", GXutil.ltrimstr( AV66TFBarAlbMtrE_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPREMTR") == 0 )
         {
            AV68TFBarPreMtr = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TFBarPreMtr", GXutil.ltrimstr( AV68TFBarPreMtr, 13, 5));
            AV69TFBarPreMtr_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69TFBarPreMtr_To", GXutil.ltrimstr( AV69TFBarPreMtr_To, 13, 5));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBPIE") == 0 )
         {
            AV71TFBarAlbPie = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71TFBarAlbPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71TFBarAlbPie), 6, 0));
            AV72TFBarAlbPie_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72TFBarAlbPie_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72TFBarAlbPie_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTUBCOD") == 0 )
         {
            AV74TFTubCod = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74TFTubCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74TFTubCod), 4, 0));
            AV75TFTubCod_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75TFTubCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV75TFTubCod_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBTUB") == 0 )
         {
            AV77TFBarAlbTub = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77TFBarAlbTub", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77TFBarAlbTub), 6, 0));
            AV78TFBarAlbTub_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78TFBarAlbTub_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV78TFBarAlbTub_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPLASCOD") == 0 )
         {
            AV80TFPlasCod = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80TFPlasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80TFPlasCod), 4, 0));
            AV81TFPlasCod_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81TFPlasCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81TFPlasCod_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBPLAS") == 0 )
         {
            AV83TFBarAlbPlas = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83TFBarAlbPlas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83TFBarAlbPlas), 4, 0));
            AV84TFBarAlbPlas_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84TFBarAlbPlas_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV84TFBarAlbPlas_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBHDROBS") == 0 )
         {
            AV86TFAlbHdrObs = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV86TFAlbHdrObs", AV86TFAlbHdrObs);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBHDROBS_SEL") == 0 )
         {
            AV87TFAlbHdrObs_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV87TFAlbHdrObs_Sel", AV87TFAlbHdrObs_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROVAL_SEL") == 0 )
         {
            AV89TFAlbProVal_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89TFAlbProVal_SelsJson", AV89TFAlbProVal_SelsJson);
            AV90TFAlbProVal_Sels.fromJSonString(AV89TFAlbProVal_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBTIPENT") == 0 )
         {
            AV92TFAlbTipEnt = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92TFAlbTipEnt", AV92TFAlbTipEnt);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBTIPENT_SEL") == 0 )
         {
            AV93TFAlbTipEnt_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV93TFAlbTipEnt_Sel", AV93TFAlbTipEnt_Sel);
         }
         AV161GXV1 = (int)(AV161GXV1+1) ;
      }
      GXt_char3 = "" ;
      GXv_char6[0] = GXt_char3 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV104TFEmprGuiRem_Sel)==0), AV104TFEmprGuiRem_Sel, GXv_char6) ;
      wctablaalbbar_impl.this.GXt_char3 = GXv_char6[0] ;
      GXt_char12 = "" ;
      GXv_char5[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV33TFBarCodPar_Sel)==0), AV33TFBarCodPar_Sel, GXv_char5) ;
      wctablaalbbar_impl.this.GXt_char12 = GXv_char5[0] ;
      GXt_char13 = "" ;
      GXv_char4[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV36TFAlbSer_Sel)==0), AV36TFAlbSer_Sel, GXv_char4) ;
      wctablaalbbar_impl.this.GXt_char13 = GXv_char4[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV39TFAlbSerD_Sel)==0), AV39TFAlbSerD_Sel, GXv_char15) ;
      wctablaalbbar_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV42TFAlbColNom_Sel)==0), AV42TFAlbColNom_Sel, GXv_char17) ;
      wctablaalbbar_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV45TFAlbNomCli_Sel)==0), AV45TFAlbNomCli_Sel, GXv_char19) ;
      wctablaalbbar_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV51TFCodCod_Sel)==0), AV51TFCodCod_Sel, GXv_char21) ;
      wctablaalbbar_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV87TFAlbHdrObs_Sel)==0), AV87TFAlbHdrObs_Sel, GXv_char23) ;
      wctablaalbbar_impl.this.GXt_char22 = GXv_char23[0] ;
      GXt_char24 = "" ;
      GXv_char25[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV90TFAlbProVal_Sels.size()==0), AV89TFAlbProVal_SelsJson, GXv_char25) ;
      wctablaalbbar_impl.this.GXt_char24 = GXv_char25[0] ;
      GXt_char26 = "" ;
      GXv_char27[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV93TFAlbTipEnt_Sel)==0), AV93TFAlbTipEnt_Sel, GXv_char27) ;
      wctablaalbbar_impl.this.GXt_char26 = GXv_char27[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char3+"|||"+GXt_char12+"|"+GXt_char13+"|"+GXt_char14+"|"+GXt_char16+"|"+GXt_char18+"||"+GXt_char20+"||||||||||||"+GXt_char22+"|"+GXt_char24+"|"+GXt_char26 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char26 = "" ;
      GXv_char27[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV103TFEmprGuiRem)==0), AV103TFEmprGuiRem, GXv_char27) ;
      wctablaalbbar_impl.this.GXt_char26 = GXv_char27[0] ;
      GXt_char24 = "" ;
      GXv_char25[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV32TFBarCodPar)==0), AV32TFBarCodPar, GXv_char25) ;
      wctablaalbbar_impl.this.GXt_char24 = GXv_char25[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV35TFAlbSer)==0), AV35TFAlbSer, GXv_char23) ;
      wctablaalbbar_impl.this.GXt_char22 = GXv_char23[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV38TFAlbSerD)==0), AV38TFAlbSerD, GXv_char21) ;
      wctablaalbbar_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV41TFAlbColNom)==0), AV41TFAlbColNom, GXv_char19) ;
      wctablaalbbar_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV44TFAlbNomCli)==0), AV44TFAlbNomCli, GXv_char17) ;
      wctablaalbbar_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV50TFCodCod)==0), AV50TFCodCod, GXv_char15) ;
      wctablaalbbar_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char13 = "" ;
      GXv_char6[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV86TFAlbHdrObs)==0), AV86TFAlbHdrObs, GXv_char6) ;
      wctablaalbbar_impl.this.GXt_char13 = GXv_char6[0] ;
      GXt_char12 = "" ;
      GXv_char5[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV92TFAlbTipEnt)==0), AV92TFAlbTipEnt, GXv_char5) ;
      wctablaalbbar_impl.this.GXt_char12 = GXv_char5[0] ;
      Ddo_grid_Filteredtext_set = GXt_char26+"|"+((0==AV26TFBarCod) ? "" : GXutil.str( AV26TFBarCod, 8, 0))+"|"+((0==AV29TFBarCodReo) ? "" : GXutil.str( AV29TFBarCodReo, 1, 0))+"|"+GXt_char24+"|"+GXt_char22+"|"+GXt_char20+"|"+GXt_char18+"|"+GXt_char16+"|"+((0==AV47TFAlbColNum) ? "" : GXutil.str( AV47TFAlbColNum, 6, 0))+"|"+GXt_char14+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV53TFBarAlbKgmE)==0) ? "" : GXutil.str( AV53TFBarAlbKgmE, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV56TFBarPreKgm)==0) ? "" : GXutil.str( AV56TFBarPreKgm, 13, 5))+"|"+((0==AV59TFAlbHdrAnc) ? "" : GXutil.str( AV59TFAlbHdrAnc, 4, 0))+"|"+((0==AV62TFAlbHdrgm2) ? "" : GXutil.str( AV62TFAlbHdrgm2, 4, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV65TFBarAlbMtrE)==0) ? "" : GXutil.str( AV65TFBarAlbMtrE, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV68TFBarPreMtr)==0) ? "" : GXutil.str( AV68TFBarPreMtr, 13, 5))+"|"+((0==AV71TFBarAlbPie) ? "" : GXutil.str( AV71TFBarAlbPie, 6, 0))+"|"+((0==AV74TFTubCod) ? "" : GXutil.str( AV74TFTubCod, 4, 0))+"|"+((0==AV77TFBarAlbTub) ? "" : GXutil.str( AV77TFBarAlbTub, 6, 0))+"|"+((0==AV80TFPlasCod) ? "" : GXutil.str( AV80TFPlasCod, 4, 0))+"|"+((0==AV83TFBarAlbPlas) ? "" : GXutil.str( AV83TFBarAlbPlas, 4, 0))+"|"+GXt_char13+"||"+GXt_char12 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "|"+((0==AV27TFBarCod_To) ? "" : GXutil.str( AV27TFBarCod_To, 8, 0))+"|"+((0==AV30TFBarCodReo_To) ? "" : GXutil.str( AV30TFBarCodReo_To, 1, 0))+"||||||"+((0==AV48TFAlbColNum_To) ? "" : GXutil.str( AV48TFAlbColNum_To, 6, 0))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV54TFBarAlbKgmE_To)==0) ? "" : GXutil.str( AV54TFBarAlbKgmE_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV57TFBarPreKgm_To)==0) ? "" : GXutil.str( AV57TFBarPreKgm_To, 13, 5))+"|"+((0==AV60TFAlbHdrAnc_To) ? "" : GXutil.str( AV60TFAlbHdrAnc_To, 4, 0))+"|"+((0==AV63TFAlbHdrgm2_To) ? "" : GXutil.str( AV63TFAlbHdrgm2_To, 4, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV66TFBarAlbMtrE_To)==0) ? "" : GXutil.str( AV66TFBarAlbMtrE_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV69TFBarPreMtr_To)==0) ? "" : GXutil.str( AV69TFBarPreMtr_To, 13, 5))+"|"+((0==AV72TFBarAlbPie_To) ? "" : GXutil.str( AV72TFBarAlbPie_To, 6, 0))+"|"+((0==AV75TFTubCod_To) ? "" : GXutil.str( AV75TFTubCod_To, 4, 0))+"|"+((0==AV78TFBarAlbTub_To) ? "" : GXutil.str( AV78TFBarAlbTub_To, 6, 0))+"|"+((0==AV81TFPlasCod_To) ? "" : GXutil.str( AV81TFPlasCod_To, 4, 0))+"|"+((0==AV84TFBarAlbPlas_To) ? "" : GXutil.str( AV84TFBarAlbPlas_To, 4, 0))+"|||" ;
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
      AV10GridState.fromxml(AV21Session.getValue(AV160Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFEMPRGUIREM", "", !(GXutil.strcmp("", AV103TFEmprGuiRem)==0), (short)(0), AV103TFEmprGuiRem, "", !(GXutil.strcmp("", AV104TFEmprGuiRem_Sel)==0), AV104TFEmprGuiRem_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFBARCOD", "", !((0==AV26TFBarCod)&&(0==AV27TFBarCod_To)), (short)(0), GXutil.trim( GXutil.str( AV26TFBarCod, 8, 0)), GXutil.trim( GXutil.str( AV27TFBarCod_To, 8, 0))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFBARCODREO", "", !((0==AV29TFBarCodReo)&&(0==AV30TFBarCodReo_To)), (short)(0), GXutil.trim( GXutil.str( AV29TFBarCodReo, 1, 0)), GXutil.trim( GXutil.str( AV30TFBarCodReo_To, 1, 0))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFBARCODPAR", "", !(GXutil.strcmp("", AV32TFBarCodPar)==0), (short)(0), AV32TFBarCodPar, "", !(GXutil.strcmp("", AV33TFBarCodPar_Sel)==0), AV33TFBarCodPar_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFALBSER", "", !(GXutil.strcmp("", AV35TFAlbSer)==0), (short)(0), AV35TFAlbSer, "", !(GXutil.strcmp("", AV36TFAlbSer_Sel)==0), AV36TFAlbSer_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFALBSERD", "", !(GXutil.strcmp("", AV38TFAlbSerD)==0), (short)(0), AV38TFAlbSerD, "", !(GXutil.strcmp("", AV39TFAlbSerD_Sel)==0), AV39TFAlbSerD_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFALBCOLNOM", "", !(GXutil.strcmp("", AV41TFAlbColNom)==0), (short)(0), AV41TFAlbColNom, "", !(GXutil.strcmp("", AV42TFAlbColNom_Sel)==0), AV42TFAlbColNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFALBNOMCLI", "", !(GXutil.strcmp("", AV44TFAlbNomCli)==0), (short)(0), AV44TFAlbNomCli, "", !(GXutil.strcmp("", AV45TFAlbNomCli_Sel)==0), AV45TFAlbNomCli_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFALBCOLNUM", "", !((0==AV47TFAlbColNum)&&(0==AV48TFAlbColNum_To)), (short)(0), GXutil.trim( GXutil.str( AV47TFAlbColNum, 6, 0)), GXutil.trim( GXutil.str( AV48TFAlbColNum_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFCODCOD", "", !(GXutil.strcmp("", AV50TFCodCod)==0), (short)(0), AV50TFCodCod, "", !(GXutil.strcmp("", AV51TFCodCod_Sel)==0), AV51TFCodCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFBARALBKGME", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV53TFBarAlbKgmE)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV54TFBarAlbKgmE_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV53TFBarAlbKgmE, 9, 2)), GXutil.trim( GXutil.str( AV54TFBarAlbKgmE_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFBARPREKGM", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV56TFBarPreKgm)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV57TFBarPreKgm_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV56TFBarPreKgm, 13, 5)), GXutil.trim( GXutil.str( AV57TFBarPreKgm_To, 13, 5))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFALBHDRANC", "", !((0==AV59TFAlbHdrAnc)&&(0==AV60TFAlbHdrAnc_To)), (short)(0), GXutil.trim( GXutil.str( AV59TFAlbHdrAnc, 4, 0)), GXutil.trim( GXutil.str( AV60TFAlbHdrAnc_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFALBHDRGM2", "", !((0==AV62TFAlbHdrgm2)&&(0==AV63TFAlbHdrgm2_To)), (short)(0), GXutil.trim( GXutil.str( AV62TFAlbHdrgm2, 4, 0)), GXutil.trim( GXutil.str( AV63TFAlbHdrgm2_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFBARALBMTRE", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV65TFBarAlbMtrE)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV66TFBarAlbMtrE_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV65TFBarAlbMtrE, 9, 2)), GXutil.trim( GXutil.str( AV66TFBarAlbMtrE_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFBARPREMTR", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV68TFBarPreMtr)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV69TFBarPreMtr_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV68TFBarPreMtr, 13, 5)), GXutil.trim( GXutil.str( AV69TFBarPreMtr_To, 13, 5))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFBARALBPIE", "", !((0==AV71TFBarAlbPie)&&(0==AV72TFBarAlbPie_To)), (short)(0), GXutil.trim( GXutil.str( AV71TFBarAlbPie, 6, 0)), GXutil.trim( GXutil.str( AV72TFBarAlbPie_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFTUBCOD", "", !((0==AV74TFTubCod)&&(0==AV75TFTubCod_To)), (short)(0), GXutil.trim( GXutil.str( AV74TFTubCod, 4, 0)), GXutil.trim( GXutil.str( AV75TFTubCod_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFBARALBTUB", "", !((0==AV77TFBarAlbTub)&&(0==AV78TFBarAlbTub_To)), (short)(0), GXutil.trim( GXutil.str( AV77TFBarAlbTub, 6, 0)), GXutil.trim( GXutil.str( AV78TFBarAlbTub_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFPLASCOD", "", !((0==AV80TFPlasCod)&&(0==AV81TFPlasCod_To)), (short)(0), GXutil.trim( GXutil.str( AV80TFPlasCod, 4, 0)), GXutil.trim( GXutil.str( AV81TFPlasCod_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFBARALBPLAS", "", !((0==AV83TFBarAlbPlas)&&(0==AV84TFBarAlbPlas_To)), (short)(0), GXutil.trim( GXutil.str( AV83TFBarAlbPlas, 4, 0)), GXutil.trim( GXutil.str( AV84TFBarAlbPlas_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFALBHDROBS", "", !(GXutil.strcmp("", AV86TFAlbHdrObs)==0), (short)(0), AV86TFAlbHdrObs, "", !(GXutil.strcmp("", AV87TFAlbHdrObs_Sel)==0), AV87TFAlbHdrObs_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFALBPROVAL_SEL", "", !(AV90TFAlbProVal_Sels.size()==0), (short)(0), AV90TFAlbProVal_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFALBTIPENT", "", !(GXutil.strcmp("", AV92TFAlbTipEnt)==0), (short)(0), AV92TFAlbTipEnt, "", !(GXutil.strcmp("", AV93TFAlbTipEnt_Sel)==0), AV93TFAlbTipEnt_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      if ( ! (GXutil.strcmp("", AV99Emprcod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV99Emprcod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV100AlbProCod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBPROCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV100AlbProCod, 10, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV160Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV160Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TTrn07" );
      AV9TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "Emprcod" );
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( AV99Emprcod );
      AV8TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV9TrnContextAtt, 0);
      AV9TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "AlbProcod" );
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( GXutil.str( AV100AlbProCod, 10, 0) );
      AV8TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV9TrnContextAtt, 0);
      AV21Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV99Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV99Emprcod", AV99Emprcod);
      AV100AlbProCod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV100AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV100AlbProCod), 10, 0));
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
      paMC2( ) ;
      wsMC2( ) ;
      weMC2( ) ;
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
      sCtrlAV99Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV100AlbProCod = (String)getParm(obj,1,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      paMC2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "wctablaalbbar", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      paMC2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV99Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV99Emprcod", AV99Emprcod);
         AV100AlbProCod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV100AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV100AlbProCod), 10, 0));
      }
      wcpOAV99Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV99Emprcod") ;
      wcpOAV100AlbProCod = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV100AlbProCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV99Emprcod, wcpOAV99Emprcod) != 0 ) || ( AV100AlbProCod != wcpOAV100AlbProCod ) ) )
      {
         setjustcreated();
      }
      wcpOAV99Emprcod = AV99Emprcod ;
      wcpOAV100AlbProCod = AV100AlbProCod ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV99Emprcod = httpContext.cgiGet( sPrefix+"AV99Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV99Emprcod) > 0 )
      {
         AV99Emprcod = httpContext.cgiGet( sCtrlAV99Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV99Emprcod", AV99Emprcod);
      }
      else
      {
         AV99Emprcod = httpContext.cgiGet( sPrefix+"AV99Emprcod_PARM") ;
      }
      sCtrlAV100AlbProCod = httpContext.cgiGet( sPrefix+"AV100AlbProCod_CTRL") ;
      if ( GXutil.len( sCtrlAV100AlbProCod) > 0 )
      {
         AV100AlbProCod = localUtil.ctol( httpContext.cgiGet( sCtrlAV100AlbProCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV100AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV100AlbProCod), 10, 0));
      }
      else
      {
         AV100AlbProCod = localUtil.ctol( httpContext.cgiGet( sPrefix+"AV100AlbProCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
      paMC2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      wsMC2( ) ;
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
      wsMC2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV99Emprcod_PARM", GXutil.rtrim( AV99Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV99Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV99Emprcod_CTRL", GXutil.rtrim( sCtrlAV99Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV100AlbProCod_PARM", GXutil.ltrim( localUtil.ntoc( AV100AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV100AlbProCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV100AlbProCod_CTRL", GXutil.rtrim( sCtrlAV100AlbProCod));
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
      weMC2( ) ;
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
      if ( ! ( WebComp_Wcwctablaalbfas == null ) )
      {
         WebComp_Wcwctablaalbfas.componentjscripts();
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
      if ( ! ( WebComp_Wcwctablaalbfas == null ) )
      {
         if ( GXutil.len( WebComp_Wcwctablaalbfas_Component) != 0 )
         {
            WebComp_Wcwctablaalbfas.componentthemes();
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211664576", true, true);
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
      httpContext.AddJavascriptSource("wctablaalbbar.js", "?20268211664576", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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

   public void subsflControlProps_362( )
   {
      cmbavGridactions.setInternalname( sPrefix+"vGRIDACTIONS_"+sGXsfl_36_idx );
      edtEmprGuiRem_Internalname = sPrefix+"EMPRGUIREM_"+sGXsfl_36_idx ;
      edtBarCod_Internalname = sPrefix+"BARCOD_"+sGXsfl_36_idx ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO_"+sGXsfl_36_idx ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR_"+sGXsfl_36_idx ;
      edtAlbSer_Internalname = sPrefix+"ALBSER_"+sGXsfl_36_idx ;
      edtAlbSerD_Internalname = sPrefix+"ALBSERD_"+sGXsfl_36_idx ;
      edtAlbColNom_Internalname = sPrefix+"ALBCOLNOM_"+sGXsfl_36_idx ;
      edtAlbNomCli_Internalname = sPrefix+"ALBNOMCLI_"+sGXsfl_36_idx ;
      edtAlbColNum_Internalname = sPrefix+"ALBCOLNUM_"+sGXsfl_36_idx ;
      edtCodCod_Internalname = sPrefix+"CODCOD_"+sGXsfl_36_idx ;
      edtBarAlbKgmE_Internalname = sPrefix+"BARALBKGME_"+sGXsfl_36_idx ;
      edtBarPreKgm_Internalname = sPrefix+"BARPREKGM_"+sGXsfl_36_idx ;
      edtAlbHdrAnc_Internalname = sPrefix+"ALBHDRANC_"+sGXsfl_36_idx ;
      edtAlbHdrgm2_Internalname = sPrefix+"ALBHDRGM2_"+sGXsfl_36_idx ;
      edtBarAlbMtrE_Internalname = sPrefix+"BARALBMTRE_"+sGXsfl_36_idx ;
      edtBarPreMtr_Internalname = sPrefix+"BARPREMTR_"+sGXsfl_36_idx ;
      edtBarAlbPie_Internalname = sPrefix+"BARALBPIE_"+sGXsfl_36_idx ;
      edtTubCod_Internalname = sPrefix+"TUBCOD_"+sGXsfl_36_idx ;
      edtBarAlbTub_Internalname = sPrefix+"BARALBTUB_"+sGXsfl_36_idx ;
      edtPlasCod_Internalname = sPrefix+"PLASCOD_"+sGXsfl_36_idx ;
      edtBarAlbPlas_Internalname = sPrefix+"BARALBPLAS_"+sGXsfl_36_idx ;
      edtAlbHdrObs_Internalname = sPrefix+"ALBHDROBS_"+sGXsfl_36_idx ;
      cmbAlbProVal.setInternalname( sPrefix+"ALBPROVAL_"+sGXsfl_36_idx );
      edtAlbTipEnt_Internalname = sPrefix+"ALBTIPENT_"+sGXsfl_36_idx ;
   }

   public void subsflControlProps_fel_362( )
   {
      cmbavGridactions.setInternalname( sPrefix+"vGRIDACTIONS_"+sGXsfl_36_fel_idx );
      edtEmprGuiRem_Internalname = sPrefix+"EMPRGUIREM_"+sGXsfl_36_fel_idx ;
      edtBarCod_Internalname = sPrefix+"BARCOD_"+sGXsfl_36_fel_idx ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO_"+sGXsfl_36_fel_idx ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR_"+sGXsfl_36_fel_idx ;
      edtAlbSer_Internalname = sPrefix+"ALBSER_"+sGXsfl_36_fel_idx ;
      edtAlbSerD_Internalname = sPrefix+"ALBSERD_"+sGXsfl_36_fel_idx ;
      edtAlbColNom_Internalname = sPrefix+"ALBCOLNOM_"+sGXsfl_36_fel_idx ;
      edtAlbNomCli_Internalname = sPrefix+"ALBNOMCLI_"+sGXsfl_36_fel_idx ;
      edtAlbColNum_Internalname = sPrefix+"ALBCOLNUM_"+sGXsfl_36_fel_idx ;
      edtCodCod_Internalname = sPrefix+"CODCOD_"+sGXsfl_36_fel_idx ;
      edtBarAlbKgmE_Internalname = sPrefix+"BARALBKGME_"+sGXsfl_36_fel_idx ;
      edtBarPreKgm_Internalname = sPrefix+"BARPREKGM_"+sGXsfl_36_fel_idx ;
      edtAlbHdrAnc_Internalname = sPrefix+"ALBHDRANC_"+sGXsfl_36_fel_idx ;
      edtAlbHdrgm2_Internalname = sPrefix+"ALBHDRGM2_"+sGXsfl_36_fel_idx ;
      edtBarAlbMtrE_Internalname = sPrefix+"BARALBMTRE_"+sGXsfl_36_fel_idx ;
      edtBarPreMtr_Internalname = sPrefix+"BARPREMTR_"+sGXsfl_36_fel_idx ;
      edtBarAlbPie_Internalname = sPrefix+"BARALBPIE_"+sGXsfl_36_fel_idx ;
      edtTubCod_Internalname = sPrefix+"TUBCOD_"+sGXsfl_36_fel_idx ;
      edtBarAlbTub_Internalname = sPrefix+"BARALBTUB_"+sGXsfl_36_fel_idx ;
      edtPlasCod_Internalname = sPrefix+"PLASCOD_"+sGXsfl_36_fel_idx ;
      edtBarAlbPlas_Internalname = sPrefix+"BARALBPLAS_"+sGXsfl_36_fel_idx ;
      edtAlbHdrObs_Internalname = sPrefix+"ALBHDROBS_"+sGXsfl_36_fel_idx ;
      cmbAlbProVal.setInternalname( sPrefix+"ALBPROVAL_"+sGXsfl_36_fel_idx );
      edtAlbTipEnt_Internalname = sPrefix+"ALBTIPENT_"+sGXsfl_36_fel_idx ;
   }

   public void sendrow_362( )
   {
      subsflControlProps_362( ) ;
      wbMC0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_36_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_36_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_36_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 37,'"+sPrefix+"',false,'"+sGXsfl_36_idx+"',36)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_36_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV105GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV105GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV105GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV105GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(7),"'"+sPrefix+"'"+",false,"+"'"+"e20mc2_client"+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,37);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV105GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_36_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtEmprGuiRem_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprGuiRem_Internalname,GXutil.rtrim( A1253EmprGuiRem),GXutil.rtrim( localUtil.format( A1253EmprGuiRem, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtEmprGuiRem_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtEmprGuiRem_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarCodReo_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarCodReo_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarCodPar_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarCodPar_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtAlbSer_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbSer_Internalname,GXutil.rtrim( A3391AlbSer),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtAlbSer_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtAlbSerD_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbSerD_Internalname,GXutil.rtrim( A8879AlbSerD),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbSerD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtAlbSerD_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtAlbColNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbColNom_Internalname,GXutil.rtrim( A3392AlbColNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtAlbColNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtAlbNomCli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbNomCli_Internalname,GXutil.rtrim( A12232AlbNomCli),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbNomCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtAlbNomCli_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtAlbColNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A3393AlbColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3393AlbColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtAlbColNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCodCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCodCod_Internalname,GXutil.rtrim( A3153CodCod),GXutil.rtrim( localUtil.format( A3153CodCod, "XXXXXX")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCodCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCodCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarAlbKgmE_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbKgmE_Internalname,GXutil.ltrim( localUtil.ntoc( A1261BarAlbKgmE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A1261BarAlbKgmE, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbKgmE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarAlbKgmE_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarPreKgm_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPreKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A1262BarPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A1262BarPreKgm, "ZZZZZZ9.999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarPreKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarPreKgm_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtAlbHdrAnc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbHdrAnc_Internalname,GXutil.ltrim( localUtil.ntoc( A3271AlbHdrAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3271AlbHdrAnc), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbHdrAnc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtAlbHdrAnc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtAlbHdrgm2_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbHdrgm2_Internalname,GXutil.ltrim( localUtil.ntoc( A5019AlbHdrgm2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5019AlbHdrgm2), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbHdrgm2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtAlbHdrgm2_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarAlbMtrE_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbMtrE_Internalname,GXutil.ltrim( localUtil.ntoc( A1263BarAlbMtrE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A1263BarAlbMtrE, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbMtrE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarAlbMtrE_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarPreMtr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPreMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A1264BarPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A1264BarPreMtr, "ZZZZZZ9.999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarPreMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarPreMtr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarAlbPie_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbPie_Internalname,GXutil.ltrim( localUtil.ntoc( A1265BarAlbPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1265BarAlbPie), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbPie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarAlbPie_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtTubCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTubCod_Internalname,GXutil.ltrim( localUtil.ntoc( A1206TubCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1206TubCod), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTubCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtTubCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarAlbTub_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbTub_Internalname,GXutil.ltrim( localUtil.ntoc( A1266BarAlbTub, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1266BarAlbTub), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbTub_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarAlbTub_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPlasCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPlasCod_Internalname,GXutil.ltrim( localUtil.ntoc( A6466PlasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6466PlasCod), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPlasCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPlasCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarAlbPlas_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbPlas_Internalname,GXutil.ltrim( localUtil.ntoc( A6467BarAlbPlas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6467BarAlbPlas), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbPlas_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarAlbPlas_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtAlbHdrObs_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbHdrObs_Internalname,GXutil.rtrim( A2441AlbHdrObs),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbHdrObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtAlbHdrObs_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((cmbAlbProVal.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbAlbProVal.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ALBPROVAL_" + sGXsfl_36_idx ;
            cmbAlbProVal.setName( GXCCtl );
            cmbAlbProVal.setWebtags( "" );
            cmbAlbProVal.addItem("S", httpContext.getMessage( "Si", ""), (short)(0));
            cmbAlbProVal.addItem("N", httpContext.getMessage( "No", ""), (short)(0));
            if ( cmbAlbProVal.getItemCount() > 0 )
            {
               A2839AlbProVal = cmbAlbProVal.getValidValue(A2839AlbProVal) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbProVal,cmbAlbProVal.getInternalname(),GXutil.rtrim( A2839AlbProVal),Integer.valueOf(1),cmbAlbProVal.getJsonclick(),Integer.valueOf(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbAlbProVal.getVisible()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbAlbProVal.setValue( GXutil.rtrim( A2839AlbProVal) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlbProVal.getInternalname(), "Values", cmbAlbProVal.ToJavascriptSource(), !bGXsfl_36_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtAlbTipEnt_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbTipEnt_Internalname,GXutil.rtrim( A1095AlbTipEnt),GXutil.rtrim( localUtil.format( A1095AlbTipEnt, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbTipEnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtAlbTipEnt_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashesMC2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_36_idx = ((subGrid_Islastpage==1)&&(nGXsfl_36_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_36_idx+1) ;
         sGXsfl_36_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_36_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_362( ) ;
      }
      /* End function sendrow_362 */
   }

   public void startgridcontrol36( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"36\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"ConvertToDDO"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtEmprGuiRem_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "EmprGuiRem", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "OS", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarCodReo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "R", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarCodPar_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "P", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbSer_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Artigo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbSerD_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descriçao", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbColNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbNomCli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cor Cli", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbColNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero Cor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCodCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "ERP", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarAlbKgmE_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Quilos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarPreKgm_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Preço", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbHdrAnc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Largura", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbHdrgm2_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Grm2", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarAlbMtrE_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarPreMtr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Preço", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarAlbPie_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Peças", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtTubCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tubo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarAlbTub_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Qtde", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPlasCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Plasticos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarAlbPlas_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Qtde", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbHdrObs_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Obs", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbAlbProVal.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "F?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbTipEnt_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "P_T", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV105GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1253EmprGuiRem));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtEmprGuiRem_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarCodReo_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A130BarCodPar));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarCodPar_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A3391AlbSer));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbSer_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A8879AlbSerD));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbSerD_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A3392AlbColNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbColNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A12232AlbNomCli));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbNomCli_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3393AlbColNum, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbColNum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A3153CodCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCodCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1261BarAlbKgmE, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarAlbKgmE_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1262BarPreKgm, (byte)(13), (byte)(5), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarPreKgm_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3271AlbHdrAnc, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbHdrAnc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5019AlbHdrgm2, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbHdrgm2_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1263BarAlbMtrE, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarAlbMtrE_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1264BarPreMtr, (byte)(13), (byte)(5), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarPreMtr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1265BarAlbPie, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarAlbPie_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1206TubCod, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtTubCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1266BarAlbTub, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarAlbTub_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6466PlasCod, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPlasCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6467BarAlbPlas, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarAlbPlas_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A2441AlbHdrObs));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbHdrObs_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A2839AlbProVal));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbAlbProVal.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1095AlbTipEnt));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbTipEnt_Visible, (byte)(5), (byte)(0), ".", "")));
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
      bttBtneditcolumns_Internalname = sPrefix+"BTNEDITCOLUMNS" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      edtavAlbprocod_Internalname = sPrefix+"vALBPROCOD" ;
      bttBtnfases_Internalname = sPrefix+"BTNFASES" ;
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      cmbavGridactions.setInternalname( sPrefix+"vGRIDACTIONS" );
      edtEmprGuiRem_Internalname = sPrefix+"EMPRGUIREM" ;
      edtBarCod_Internalname = sPrefix+"BARCOD" ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO" ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR" ;
      edtAlbSer_Internalname = sPrefix+"ALBSER" ;
      edtAlbSerD_Internalname = sPrefix+"ALBSERD" ;
      edtAlbColNom_Internalname = sPrefix+"ALBCOLNOM" ;
      edtAlbNomCli_Internalname = sPrefix+"ALBNOMCLI" ;
      edtAlbColNum_Internalname = sPrefix+"ALBCOLNUM" ;
      edtCodCod_Internalname = sPrefix+"CODCOD" ;
      edtBarAlbKgmE_Internalname = sPrefix+"BARALBKGME" ;
      edtBarPreKgm_Internalname = sPrefix+"BARPREKGM" ;
      edtAlbHdrAnc_Internalname = sPrefix+"ALBHDRANC" ;
      edtAlbHdrgm2_Internalname = sPrefix+"ALBHDRGM2" ;
      edtBarAlbMtrE_Internalname = sPrefix+"BARALBMTRE" ;
      edtBarPreMtr_Internalname = sPrefix+"BARPREMTR" ;
      edtBarAlbPie_Internalname = sPrefix+"BARALBPIE" ;
      edtTubCod_Internalname = sPrefix+"TUBCOD" ;
      edtBarAlbTub_Internalname = sPrefix+"BARALBTUB" ;
      edtPlasCod_Internalname = sPrefix+"PLASCOD" ;
      edtBarAlbPlas_Internalname = sPrefix+"BARALBPLAS" ;
      edtAlbHdrObs_Internalname = sPrefix+"ALBHDROBS" ;
      cmbAlbProVal.setInternalname( sPrefix+"ALBPROVAL" );
      edtAlbTipEnt_Internalname = sPrefix+"ALBTIPENT" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE1" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      edtEmprCod_Internalname = sPrefix+"EMPRCOD" ;
      edtAlbProCod_Internalname = sPrefix+"ALBPROCOD" ;
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
      subGrid_Allowhovering = (byte)(-1) ;
      subGrid_Allowselection = (byte)(1) ;
      subGrid_Header = "" ;
      edtAlbTipEnt_Jsonclick = "" ;
      cmbAlbProVal.setJsonclick( "" );
      edtAlbHdrObs_Jsonclick = "" ;
      edtBarAlbPlas_Jsonclick = "" ;
      edtPlasCod_Jsonclick = "" ;
      edtBarAlbTub_Jsonclick = "" ;
      edtTubCod_Jsonclick = "" ;
      edtBarAlbPie_Jsonclick = "" ;
      edtBarPreMtr_Jsonclick = "" ;
      edtBarAlbMtrE_Jsonclick = "" ;
      edtAlbHdrgm2_Jsonclick = "" ;
      edtAlbHdrAnc_Jsonclick = "" ;
      edtBarPreKgm_Jsonclick = "" ;
      edtBarAlbKgmE_Jsonclick = "" ;
      edtCodCod_Jsonclick = "" ;
      edtAlbColNum_Jsonclick = "" ;
      edtAlbNomCli_Jsonclick = "" ;
      edtAlbColNom_Jsonclick = "" ;
      edtAlbSerD_Jsonclick = "" ;
      edtAlbSer_Jsonclick = "" ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCod_Jsonclick = "" ;
      edtEmprGuiRem_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtAlbTipEnt_Visible = -1 ;
      cmbAlbProVal.setVisible( -1 );
      edtAlbHdrObs_Visible = -1 ;
      edtBarAlbTub_Visible = -1 ;
      edtTubCod_Visible = -1 ;
      edtBarAlbPie_Visible = -1 ;
      edtBarPreMtr_Visible = -1 ;
      edtBarAlbMtrE_Visible = -1 ;
      edtAlbHdrgm2_Visible = -1 ;
      edtAlbHdrAnc_Visible = -1 ;
      edtBarPreKgm_Visible = -1 ;
      edtBarAlbKgmE_Visible = -1 ;
      edtAlbColNum_Visible = -1 ;
      edtAlbNomCli_Visible = -1 ;
      edtAlbColNom_Visible = -1 ;
      edtAlbSerD_Visible = -1 ;
      edtAlbSer_Visible = -1 ;
      edtBarCodPar_Visible = -1 ;
      edtBarCodReo_Visible = -1 ;
      edtBarCod_Visible = -1 ;
      edtEmprGuiRem_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtAlbProCod_Jsonclick = "" ;
      edtAlbProCod_Visible = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Visible = 1 ;
      edtavAlbprocod_Jsonclick = "" ;
      edtavAlbprocod_Enabled = 0 ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;;;;;;;;;;;;;;" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "WCTablaAlbbarGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "||||||||||||||||||||||S:Si,N:No|" ;
      Ddo_grid_Allowmultipleselection = "||||||||||||||||||||||T|" ;
      Ddo_grid_Datalisttype = "Dynamic|||Dynamic|Dynamic|Dynamic|Dynamic|Dynamic||Dynamic||||||||||||Dynamic|FixedValues|Dynamic" ;
      Ddo_grid_Includedatalist = "T|||T|T|T|T|T||T||||||||||||T|T|T" ;
      Ddo_grid_Filterisrange = "|T|T||||||T||T|T|T|T|T|T|T|T|T|T|T|||" ;
      Ddo_grid_Filtertype = "Character|Numeric|Numeric|Character|Character|Character|Character|Character|Numeric|Character|Numeric|Numeric|Numeric|Numeric|Numeric|Numeric|Numeric|Numeric|Numeric|Numeric|Numeric|Character||Character" ;
      Ddo_grid_Includefilter = "T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T||T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24" ;
      Ddo_grid_Columnids = "1:EmprGuiRem|2:BarCod|3:BarCodReo|4:BarCodPar|5:AlbSer|6:AlbSerD|7:AlbColNom|8:AlbNomCli|9:AlbColNum|10:CodCod|11:BarAlbKgmE|12:BarPreKgm|13:AlbHdrAnc|14:AlbHdrgm2|15:BarAlbMtrE|16:BarPreMtr|17:BarAlbPie|18:TubCod|19:BarAlbTub|20:PlasCod|21:BarAlbPlas|22:AlbHdrObs|23:AlbProVal|24:AlbTipEnt" ;
      Ddo_grid_Gridinternalname = "" ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Serviços (Fases)", "") ;
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
      edtBarAlbPlas_Visible = -1 ;
      edtPlasCod_Visible = -1 ;
      edtCodCod_Visible = -1 ;
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
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_36_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
      }
      GXCCtl = "ALBPROVAL_" + sGXsfl_36_idx ;
      cmbAlbProVal.setName( GXCCtl );
      cmbAlbProVal.setWebtags( "" );
      cmbAlbProVal.addItem("S", httpContext.getMessage( "Si", ""), (short)(0));
      cmbAlbProVal.addItem("N", httpContext.getMessage( "No", ""), (short)(0));
      if ( cmbAlbProVal.getItemCount() > 0 )
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'edtCodCod_Visible',ctrl:'CODCOD',prop:'Visible'},{av:'edtPlasCod_Visible',ctrl:'PLASCOD',prop:'Visible'},{av:'edtBarAlbPlas_Visible',ctrl:'BARALBPLAS',prop:'Visible'},{av:'AV111Wctablaalbbards_1_emprcod',fld:'vWCTABLAALBBARDS_1_EMPRCOD',pic:'@!'},{av:'AV112Wctablaalbbards_2_albprocod',fld:'vWCTABLAALBBARDS_2_ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'sPrefix'},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV99Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV100AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV103TFEmprGuiRem',fld:'vTFEMPRGUIREM',pic:'@!'},{av:'AV104TFEmprGuiRem_Sel',fld:'vTFEMPRGUIREM_SEL',pic:'@!'},{av:'AV26TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV27TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV29TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV30TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV32TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV33TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV35TFAlbSer',fld:'vTFALBSER',pic:''},{av:'AV36TFAlbSer_Sel',fld:'vTFALBSER_SEL',pic:''},{av:'AV38TFAlbSerD',fld:'vTFALBSERD',pic:''},{av:'AV39TFAlbSerD_Sel',fld:'vTFALBSERD_SEL',pic:''},{av:'AV41TFAlbColNom',fld:'vTFALBCOLNOM',pic:''},{av:'AV42TFAlbColNom_Sel',fld:'vTFALBCOLNOM_SEL',pic:''},{av:'AV44TFAlbNomCli',fld:'vTFALBNOMCLI',pic:''},{av:'AV45TFAlbNomCli_Sel',fld:'vTFALBNOMCLI_SEL',pic:''},{av:'AV47TFAlbColNum',fld:'vTFALBCOLNUM',pic:'ZZZZZ9'},{av:'AV48TFAlbColNum_To',fld:'vTFALBCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV50TFCodCod',fld:'vTFCODCOD',pic:'XXXXXX'},{av:'AV51TFCodCod_Sel',fld:'vTFCODCOD_SEL',pic:'XXXXXX'},{av:'AV53TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV54TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV56TFBarPreKgm',fld:'vTFBARPREKGM',pic:'ZZZZZZ9.999'},{av:'AV57TFBarPreKgm_To',fld:'vTFBARPREKGM_TO',pic:'ZZZZZZ9.999'},{av:'AV59TFAlbHdrAnc',fld:'vTFALBHDRANC',pic:'ZZZ9'},{av:'AV60TFAlbHdrAnc_To',fld:'vTFALBHDRANC_TO',pic:'ZZZ9'},{av:'AV62TFAlbHdrgm2',fld:'vTFALBHDRGM2',pic:'ZZZ9'},{av:'AV63TFAlbHdrgm2_To',fld:'vTFALBHDRGM2_TO',pic:'ZZZ9'},{av:'AV65TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV66TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV68TFBarPreMtr',fld:'vTFBARPREMTR',pic:'ZZZZZZ9.999'},{av:'AV69TFBarPreMtr_To',fld:'vTFBARPREMTR_TO',pic:'ZZZZZZ9.999'},{av:'AV71TFBarAlbPie',fld:'vTFBARALBPIE',pic:'ZZZZZ9'},{av:'AV72TFBarAlbPie_To',fld:'vTFBARALBPIE_TO',pic:'ZZZZZ9'},{av:'AV74TFTubCod',fld:'vTFTUBCOD',pic:'ZZZ9'},{av:'AV75TFTubCod_To',fld:'vTFTUBCOD_TO',pic:'ZZZ9'},{av:'AV77TFBarAlbTub',fld:'vTFBARALBTUB',pic:'ZZZ9'},{av:'AV78TFBarAlbTub_To',fld:'vTFBARALBTUB_TO',pic:'ZZZ9'},{av:'AV80TFPlasCod',fld:'vTFPLASCOD',pic:'ZZZ9'},{av:'AV81TFPlasCod_To',fld:'vTFPLASCOD_TO',pic:'ZZZ9'},{av:'AV83TFBarAlbPlas',fld:'vTFBARALBPLAS',pic:'ZZZ9'},{av:'AV84TFBarAlbPlas_To',fld:'vTFBARALBPLAS_TO',pic:'ZZZ9'},{av:'AV86TFAlbHdrObs',fld:'vTFALBHDROBS',pic:''},{av:'AV87TFAlbHdrObs_Sel',fld:'vTFALBHDROBS_SEL',pic:''},{av:'AV90TFAlbProVal_Sels',fld:'vTFALBPROVAL_SELS',pic:''},{av:'AV92TFAlbTipEnt',fld:'vTFALBTIPENT',pic:'@!'},{av:'AV93TFAlbTipEnt_Sel',fld:'vTFALBTIPENT_SEL',pic:'@!'},{av:'AV160Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtEmprGuiRem_Visible',ctrl:'EMPRGUIREM',prop:'Visible'},{av:'edtBarCod_Visible',ctrl:'BARCOD',prop:'Visible'},{av:'edtBarCodReo_Visible',ctrl:'BARCODREO',prop:'Visible'},{av:'edtBarCodPar_Visible',ctrl:'BARCODPAR',prop:'Visible'},{av:'edtAlbSer_Visible',ctrl:'ALBSER',prop:'Visible'},{av:'edtAlbSerD_Visible',ctrl:'ALBSERD',prop:'Visible'},{av:'edtAlbColNom_Visible',ctrl:'ALBCOLNOM',prop:'Visible'},{av:'edtAlbNomCli_Visible',ctrl:'ALBNOMCLI',prop:'Visible'},{av:'edtAlbColNum_Visible',ctrl:'ALBCOLNUM',prop:'Visible'},{av:'edtCodCod_Visible',ctrl:'CODCOD',prop:'Visible'},{av:'edtBarAlbKgmE_Visible',ctrl:'BARALBKGME',prop:'Visible'},{av:'edtBarPreKgm_Visible',ctrl:'BARPREKGM',prop:'Visible'},{av:'edtAlbHdrAnc_Visible',ctrl:'ALBHDRANC',prop:'Visible'},{av:'edtAlbHdrgm2_Visible',ctrl:'ALBHDRGM2',prop:'Visible'},{av:'edtBarAlbMtrE_Visible',ctrl:'BARALBMTRE',prop:'Visible'},{av:'edtBarPreMtr_Visible',ctrl:'BARPREMTR',prop:'Visible'},{av:'edtBarAlbPie_Visible',ctrl:'BARALBPIE',prop:'Visible'},{av:'edtTubCod_Visible',ctrl:'TUBCOD',prop:'Visible'},{av:'edtBarAlbTub_Visible',ctrl:'BARALBTUB',prop:'Visible'},{av:'edtPlasCod_Visible',ctrl:'PLASCOD',prop:'Visible'},{av:'edtBarAlbPlas_Visible',ctrl:'BARALBPLAS',prop:'Visible'},{av:'edtAlbHdrObs_Visible',ctrl:'ALBHDROBS',prop:'Visible'},{av:'cmbAlbProVal'},{av:'edtAlbTipEnt_Visible',ctrl:'ALBTIPENT',prop:'Visible'},{av:'AV97GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV98GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e12MC2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV99Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV100AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV103TFEmprGuiRem',fld:'vTFEMPRGUIREM',pic:'@!'},{av:'AV104TFEmprGuiRem_Sel',fld:'vTFEMPRGUIREM_SEL',pic:'@!'},{av:'AV26TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV27TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV29TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV30TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV32TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV33TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV35TFAlbSer',fld:'vTFALBSER',pic:''},{av:'AV36TFAlbSer_Sel',fld:'vTFALBSER_SEL',pic:''},{av:'AV38TFAlbSerD',fld:'vTFALBSERD',pic:''},{av:'AV39TFAlbSerD_Sel',fld:'vTFALBSERD_SEL',pic:''},{av:'AV41TFAlbColNom',fld:'vTFALBCOLNOM',pic:''},{av:'AV42TFAlbColNom_Sel',fld:'vTFALBCOLNOM_SEL',pic:''},{av:'AV44TFAlbNomCli',fld:'vTFALBNOMCLI',pic:''},{av:'AV45TFAlbNomCli_Sel',fld:'vTFALBNOMCLI_SEL',pic:''},{av:'AV47TFAlbColNum',fld:'vTFALBCOLNUM',pic:'ZZZZZ9'},{av:'AV48TFAlbColNum_To',fld:'vTFALBCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV50TFCodCod',fld:'vTFCODCOD',pic:'XXXXXX'},{av:'AV51TFCodCod_Sel',fld:'vTFCODCOD_SEL',pic:'XXXXXX'},{av:'AV53TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV54TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV56TFBarPreKgm',fld:'vTFBARPREKGM',pic:'ZZZZZZ9.999'},{av:'AV57TFBarPreKgm_To',fld:'vTFBARPREKGM_TO',pic:'ZZZZZZ9.999'},{av:'AV59TFAlbHdrAnc',fld:'vTFALBHDRANC',pic:'ZZZ9'},{av:'AV60TFAlbHdrAnc_To',fld:'vTFALBHDRANC_TO',pic:'ZZZ9'},{av:'AV62TFAlbHdrgm2',fld:'vTFALBHDRGM2',pic:'ZZZ9'},{av:'AV63TFAlbHdrgm2_To',fld:'vTFALBHDRGM2_TO',pic:'ZZZ9'},{av:'AV65TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV66TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV68TFBarPreMtr',fld:'vTFBARPREMTR',pic:'ZZZZZZ9.999'},{av:'AV69TFBarPreMtr_To',fld:'vTFBARPREMTR_TO',pic:'ZZZZZZ9.999'},{av:'AV71TFBarAlbPie',fld:'vTFBARALBPIE',pic:'ZZZZZ9'},{av:'AV72TFBarAlbPie_To',fld:'vTFBARALBPIE_TO',pic:'ZZZZZ9'},{av:'AV74TFTubCod',fld:'vTFTUBCOD',pic:'ZZZ9'},{av:'AV75TFTubCod_To',fld:'vTFTUBCOD_TO',pic:'ZZZ9'},{av:'AV77TFBarAlbTub',fld:'vTFBARALBTUB',pic:'ZZZ9'},{av:'AV78TFBarAlbTub_To',fld:'vTFBARALBTUB_TO',pic:'ZZZ9'},{av:'AV80TFPlasCod',fld:'vTFPLASCOD',pic:'ZZZ9'},{av:'AV81TFPlasCod_To',fld:'vTFPLASCOD_TO',pic:'ZZZ9'},{av:'AV83TFBarAlbPlas',fld:'vTFBARALBPLAS',pic:'ZZZ9'},{av:'AV84TFBarAlbPlas_To',fld:'vTFBARALBPLAS_TO',pic:'ZZZ9'},{av:'AV86TFAlbHdrObs',fld:'vTFALBHDROBS',pic:''},{av:'AV87TFAlbHdrObs_Sel',fld:'vTFALBHDROBS_SEL',pic:''},{av:'AV90TFAlbProVal_Sels',fld:'vTFALBPROVAL_SELS',pic:''},{av:'AV92TFAlbTipEnt',fld:'vTFALBTIPENT',pic:'@!'},{av:'AV93TFAlbTipEnt_Sel',fld:'vTFALBTIPENT_SEL',pic:'@!'},{av:'AV160Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'edtCodCod_Visible',ctrl:'CODCOD',prop:'Visible'},{av:'edtPlasCod_Visible',ctrl:'PLASCOD',prop:'Visible'},{av:'edtBarAlbPlas_Visible',ctrl:'BARALBPLAS',prop:'Visible'},{av:'AV111Wctablaalbbards_1_emprcod',fld:'vWCTABLAALBBARDS_1_EMPRCOD',pic:'@!'},{av:'AV112Wctablaalbbards_2_albprocod',fld:'vWCTABLAALBBARDS_2_ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e13MC2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV99Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV100AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV103TFEmprGuiRem',fld:'vTFEMPRGUIREM',pic:'@!'},{av:'AV104TFEmprGuiRem_Sel',fld:'vTFEMPRGUIREM_SEL',pic:'@!'},{av:'AV26TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV27TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV29TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV30TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV32TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV33TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV35TFAlbSer',fld:'vTFALBSER',pic:''},{av:'AV36TFAlbSer_Sel',fld:'vTFALBSER_SEL',pic:''},{av:'AV38TFAlbSerD',fld:'vTFALBSERD',pic:''},{av:'AV39TFAlbSerD_Sel',fld:'vTFALBSERD_SEL',pic:''},{av:'AV41TFAlbColNom',fld:'vTFALBCOLNOM',pic:''},{av:'AV42TFAlbColNom_Sel',fld:'vTFALBCOLNOM_SEL',pic:''},{av:'AV44TFAlbNomCli',fld:'vTFALBNOMCLI',pic:''},{av:'AV45TFAlbNomCli_Sel',fld:'vTFALBNOMCLI_SEL',pic:''},{av:'AV47TFAlbColNum',fld:'vTFALBCOLNUM',pic:'ZZZZZ9'},{av:'AV48TFAlbColNum_To',fld:'vTFALBCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV50TFCodCod',fld:'vTFCODCOD',pic:'XXXXXX'},{av:'AV51TFCodCod_Sel',fld:'vTFCODCOD_SEL',pic:'XXXXXX'},{av:'AV53TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV54TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV56TFBarPreKgm',fld:'vTFBARPREKGM',pic:'ZZZZZZ9.999'},{av:'AV57TFBarPreKgm_To',fld:'vTFBARPREKGM_TO',pic:'ZZZZZZ9.999'},{av:'AV59TFAlbHdrAnc',fld:'vTFALBHDRANC',pic:'ZZZ9'},{av:'AV60TFAlbHdrAnc_To',fld:'vTFALBHDRANC_TO',pic:'ZZZ9'},{av:'AV62TFAlbHdrgm2',fld:'vTFALBHDRGM2',pic:'ZZZ9'},{av:'AV63TFAlbHdrgm2_To',fld:'vTFALBHDRGM2_TO',pic:'ZZZ9'},{av:'AV65TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV66TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV68TFBarPreMtr',fld:'vTFBARPREMTR',pic:'ZZZZZZ9.999'},{av:'AV69TFBarPreMtr_To',fld:'vTFBARPREMTR_TO',pic:'ZZZZZZ9.999'},{av:'AV71TFBarAlbPie',fld:'vTFBARALBPIE',pic:'ZZZZZ9'},{av:'AV72TFBarAlbPie_To',fld:'vTFBARALBPIE_TO',pic:'ZZZZZ9'},{av:'AV74TFTubCod',fld:'vTFTUBCOD',pic:'ZZZ9'},{av:'AV75TFTubCod_To',fld:'vTFTUBCOD_TO',pic:'ZZZ9'},{av:'AV77TFBarAlbTub',fld:'vTFBARALBTUB',pic:'ZZZ9'},{av:'AV78TFBarAlbTub_To',fld:'vTFBARALBTUB_TO',pic:'ZZZ9'},{av:'AV80TFPlasCod',fld:'vTFPLASCOD',pic:'ZZZ9'},{av:'AV81TFPlasCod_To',fld:'vTFPLASCOD_TO',pic:'ZZZ9'},{av:'AV83TFBarAlbPlas',fld:'vTFBARALBPLAS',pic:'ZZZ9'},{av:'AV84TFBarAlbPlas_To',fld:'vTFBARALBPLAS_TO',pic:'ZZZ9'},{av:'AV86TFAlbHdrObs',fld:'vTFALBHDROBS',pic:''},{av:'AV87TFAlbHdrObs_Sel',fld:'vTFALBHDROBS_SEL',pic:''},{av:'AV90TFAlbProVal_Sels',fld:'vTFALBPROVAL_SELS',pic:''},{av:'AV92TFAlbTipEnt',fld:'vTFALBTIPENT',pic:'@!'},{av:'AV93TFAlbTipEnt_Sel',fld:'vTFALBTIPENT_SEL',pic:'@!'},{av:'AV160Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'edtCodCod_Visible',ctrl:'CODCOD',prop:'Visible'},{av:'edtPlasCod_Visible',ctrl:'PLASCOD',prop:'Visible'},{av:'edtBarAlbPlas_Visible',ctrl:'BARALBPLAS',prop:'Visible'},{av:'AV111Wctablaalbbards_1_emprcod',fld:'vWCTABLAALBBARDS_1_EMPRCOD',pic:'@!'},{av:'AV112Wctablaalbbards_2_albprocod',fld:'vWCTABLAALBBARDS_2_ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e14MC2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV99Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV100AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV103TFEmprGuiRem',fld:'vTFEMPRGUIREM',pic:'@!'},{av:'AV104TFEmprGuiRem_Sel',fld:'vTFEMPRGUIREM_SEL',pic:'@!'},{av:'AV26TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV27TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV29TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV30TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV32TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV33TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV35TFAlbSer',fld:'vTFALBSER',pic:''},{av:'AV36TFAlbSer_Sel',fld:'vTFALBSER_SEL',pic:''},{av:'AV38TFAlbSerD',fld:'vTFALBSERD',pic:''},{av:'AV39TFAlbSerD_Sel',fld:'vTFALBSERD_SEL',pic:''},{av:'AV41TFAlbColNom',fld:'vTFALBCOLNOM',pic:''},{av:'AV42TFAlbColNom_Sel',fld:'vTFALBCOLNOM_SEL',pic:''},{av:'AV44TFAlbNomCli',fld:'vTFALBNOMCLI',pic:''},{av:'AV45TFAlbNomCli_Sel',fld:'vTFALBNOMCLI_SEL',pic:''},{av:'AV47TFAlbColNum',fld:'vTFALBCOLNUM',pic:'ZZZZZ9'},{av:'AV48TFAlbColNum_To',fld:'vTFALBCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV50TFCodCod',fld:'vTFCODCOD',pic:'XXXXXX'},{av:'AV51TFCodCod_Sel',fld:'vTFCODCOD_SEL',pic:'XXXXXX'},{av:'AV53TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV54TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV56TFBarPreKgm',fld:'vTFBARPREKGM',pic:'ZZZZZZ9.999'},{av:'AV57TFBarPreKgm_To',fld:'vTFBARPREKGM_TO',pic:'ZZZZZZ9.999'},{av:'AV59TFAlbHdrAnc',fld:'vTFALBHDRANC',pic:'ZZZ9'},{av:'AV60TFAlbHdrAnc_To',fld:'vTFALBHDRANC_TO',pic:'ZZZ9'},{av:'AV62TFAlbHdrgm2',fld:'vTFALBHDRGM2',pic:'ZZZ9'},{av:'AV63TFAlbHdrgm2_To',fld:'vTFALBHDRGM2_TO',pic:'ZZZ9'},{av:'AV65TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV66TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV68TFBarPreMtr',fld:'vTFBARPREMTR',pic:'ZZZZZZ9.999'},{av:'AV69TFBarPreMtr_To',fld:'vTFBARPREMTR_TO',pic:'ZZZZZZ9.999'},{av:'AV71TFBarAlbPie',fld:'vTFBARALBPIE',pic:'ZZZZZ9'},{av:'AV72TFBarAlbPie_To',fld:'vTFBARALBPIE_TO',pic:'ZZZZZ9'},{av:'AV74TFTubCod',fld:'vTFTUBCOD',pic:'ZZZ9'},{av:'AV75TFTubCod_To',fld:'vTFTUBCOD_TO',pic:'ZZZ9'},{av:'AV77TFBarAlbTub',fld:'vTFBARALBTUB',pic:'ZZZ9'},{av:'AV78TFBarAlbTub_To',fld:'vTFBARALBTUB_TO',pic:'ZZZ9'},{av:'AV80TFPlasCod',fld:'vTFPLASCOD',pic:'ZZZ9'},{av:'AV81TFPlasCod_To',fld:'vTFPLASCOD_TO',pic:'ZZZ9'},{av:'AV83TFBarAlbPlas',fld:'vTFBARALBPLAS',pic:'ZZZ9'},{av:'AV84TFBarAlbPlas_To',fld:'vTFBARALBPLAS_TO',pic:'ZZZ9'},{av:'AV86TFAlbHdrObs',fld:'vTFALBHDROBS',pic:''},{av:'AV87TFAlbHdrObs_Sel',fld:'vTFALBHDROBS_SEL',pic:''},{av:'AV90TFAlbProVal_Sels',fld:'vTFALBPROVAL_SELS',pic:''},{av:'AV92TFAlbTipEnt',fld:'vTFALBTIPENT',pic:'@!'},{av:'AV93TFAlbTipEnt_Sel',fld:'vTFALBTIPENT_SEL',pic:'@!'},{av:'AV160Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'edtCodCod_Visible',ctrl:'CODCOD',prop:'Visible'},{av:'edtPlasCod_Visible',ctrl:'PLASCOD',prop:'Visible'},{av:'edtBarAlbPlas_Visible',ctrl:'BARALBPLAS',prop:'Visible'},{av:'AV111Wctablaalbbards_1_emprcod',fld:'vWCTABLAALBBARDS_1_EMPRCOD',pic:'@!'},{av:'AV112Wctablaalbbards_2_albprocod',fld:'vWCTABLAALBBARDS_2_ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV92TFAlbTipEnt',fld:'vTFALBTIPENT',pic:'@!'},{av:'AV93TFAlbTipEnt_Sel',fld:'vTFALBTIPENT_SEL',pic:'@!'},{av:'AV89TFAlbProVal_SelsJson',fld:'vTFALBPROVAL_SELSJSON',pic:''},{av:'AV90TFAlbProVal_Sels',fld:'vTFALBPROVAL_SELS',pic:''},{av:'AV86TFAlbHdrObs',fld:'vTFALBHDROBS',pic:''},{av:'AV87TFAlbHdrObs_Sel',fld:'vTFALBHDROBS_SEL',pic:''},{av:'AV83TFBarAlbPlas',fld:'vTFBARALBPLAS',pic:'ZZZ9'},{av:'AV84TFBarAlbPlas_To',fld:'vTFBARALBPLAS_TO',pic:'ZZZ9'},{av:'AV80TFPlasCod',fld:'vTFPLASCOD',pic:'ZZZ9'},{av:'AV81TFPlasCod_To',fld:'vTFPLASCOD_TO',pic:'ZZZ9'},{av:'AV77TFBarAlbTub',fld:'vTFBARALBTUB',pic:'ZZZ9'},{av:'AV78TFBarAlbTub_To',fld:'vTFBARALBTUB_TO',pic:'ZZZ9'},{av:'AV74TFTubCod',fld:'vTFTUBCOD',pic:'ZZZ9'},{av:'AV75TFTubCod_To',fld:'vTFTUBCOD_TO',pic:'ZZZ9'},{av:'AV71TFBarAlbPie',fld:'vTFBARALBPIE',pic:'ZZZZZ9'},{av:'AV72TFBarAlbPie_To',fld:'vTFBARALBPIE_TO',pic:'ZZZZZ9'},{av:'AV68TFBarPreMtr',fld:'vTFBARPREMTR',pic:'ZZZZZZ9.999'},{av:'AV69TFBarPreMtr_To',fld:'vTFBARPREMTR_TO',pic:'ZZZZZZ9.999'},{av:'AV65TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV66TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV62TFAlbHdrgm2',fld:'vTFALBHDRGM2',pic:'ZZZ9'},{av:'AV63TFAlbHdrgm2_To',fld:'vTFALBHDRGM2_TO',pic:'ZZZ9'},{av:'AV59TFAlbHdrAnc',fld:'vTFALBHDRANC',pic:'ZZZ9'},{av:'AV60TFAlbHdrAnc_To',fld:'vTFALBHDRANC_TO',pic:'ZZZ9'},{av:'AV56TFBarPreKgm',fld:'vTFBARPREKGM',pic:'ZZZZZZ9.999'},{av:'AV57TFBarPreKgm_To',fld:'vTFBARPREKGM_TO',pic:'ZZZZZZ9.999'},{av:'AV53TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV54TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV50TFCodCod',fld:'vTFCODCOD',pic:'XXXXXX'},{av:'AV51TFCodCod_Sel',fld:'vTFCODCOD_SEL',pic:'XXXXXX'},{av:'AV47TFAlbColNum',fld:'vTFALBCOLNUM',pic:'ZZZZZ9'},{av:'AV48TFAlbColNum_To',fld:'vTFALBCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV44TFAlbNomCli',fld:'vTFALBNOMCLI',pic:''},{av:'AV45TFAlbNomCli_Sel',fld:'vTFALBNOMCLI_SEL',pic:''},{av:'AV41TFAlbColNom',fld:'vTFALBCOLNOM',pic:''},{av:'AV42TFAlbColNom_Sel',fld:'vTFALBCOLNOM_SEL',pic:''},{av:'AV38TFAlbSerD',fld:'vTFALBSERD',pic:''},{av:'AV39TFAlbSerD_Sel',fld:'vTFALBSERD_SEL',pic:''},{av:'AV35TFAlbSer',fld:'vTFALBSER',pic:''},{av:'AV36TFAlbSer_Sel',fld:'vTFALBSER_SEL',pic:''},{av:'AV32TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV33TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV29TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV30TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV26TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV27TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV103TFEmprGuiRem',fld:'vTFEMPRGUIREM',pic:'@!'},{av:'AV104TFEmprGuiRem_Sel',fld:'vTFEMPRGUIREM_SEL',pic:'@!'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e19MC2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV105GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e15MC2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV99Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV100AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV103TFEmprGuiRem',fld:'vTFEMPRGUIREM',pic:'@!'},{av:'AV104TFEmprGuiRem_Sel',fld:'vTFEMPRGUIREM_SEL',pic:'@!'},{av:'AV26TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV27TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV29TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV30TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV32TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV33TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV35TFAlbSer',fld:'vTFALBSER',pic:''},{av:'AV36TFAlbSer_Sel',fld:'vTFALBSER_SEL',pic:''},{av:'AV38TFAlbSerD',fld:'vTFALBSERD',pic:''},{av:'AV39TFAlbSerD_Sel',fld:'vTFALBSERD_SEL',pic:''},{av:'AV41TFAlbColNom',fld:'vTFALBCOLNOM',pic:''},{av:'AV42TFAlbColNom_Sel',fld:'vTFALBCOLNOM_SEL',pic:''},{av:'AV44TFAlbNomCli',fld:'vTFALBNOMCLI',pic:''},{av:'AV45TFAlbNomCli_Sel',fld:'vTFALBNOMCLI_SEL',pic:''},{av:'AV47TFAlbColNum',fld:'vTFALBCOLNUM',pic:'ZZZZZ9'},{av:'AV48TFAlbColNum_To',fld:'vTFALBCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV50TFCodCod',fld:'vTFCODCOD',pic:'XXXXXX'},{av:'AV51TFCodCod_Sel',fld:'vTFCODCOD_SEL',pic:'XXXXXX'},{av:'AV53TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV54TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV56TFBarPreKgm',fld:'vTFBARPREKGM',pic:'ZZZZZZ9.999'},{av:'AV57TFBarPreKgm_To',fld:'vTFBARPREKGM_TO',pic:'ZZZZZZ9.999'},{av:'AV59TFAlbHdrAnc',fld:'vTFALBHDRANC',pic:'ZZZ9'},{av:'AV60TFAlbHdrAnc_To',fld:'vTFALBHDRANC_TO',pic:'ZZZ9'},{av:'AV62TFAlbHdrgm2',fld:'vTFALBHDRGM2',pic:'ZZZ9'},{av:'AV63TFAlbHdrgm2_To',fld:'vTFALBHDRGM2_TO',pic:'ZZZ9'},{av:'AV65TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV66TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV68TFBarPreMtr',fld:'vTFBARPREMTR',pic:'ZZZZZZ9.999'},{av:'AV69TFBarPreMtr_To',fld:'vTFBARPREMTR_TO',pic:'ZZZZZZ9.999'},{av:'AV71TFBarAlbPie',fld:'vTFBARALBPIE',pic:'ZZZZZ9'},{av:'AV72TFBarAlbPie_To',fld:'vTFBARALBPIE_TO',pic:'ZZZZZ9'},{av:'AV74TFTubCod',fld:'vTFTUBCOD',pic:'ZZZ9'},{av:'AV75TFTubCod_To',fld:'vTFTUBCOD_TO',pic:'ZZZ9'},{av:'AV77TFBarAlbTub',fld:'vTFBARALBTUB',pic:'ZZZ9'},{av:'AV78TFBarAlbTub_To',fld:'vTFBARALBTUB_TO',pic:'ZZZ9'},{av:'AV80TFPlasCod',fld:'vTFPLASCOD',pic:'ZZZ9'},{av:'AV81TFPlasCod_To',fld:'vTFPLASCOD_TO',pic:'ZZZ9'},{av:'AV83TFBarAlbPlas',fld:'vTFBARALBPLAS',pic:'ZZZ9'},{av:'AV84TFBarAlbPlas_To',fld:'vTFBARALBPLAS_TO',pic:'ZZZ9'},{av:'AV86TFAlbHdrObs',fld:'vTFALBHDROBS',pic:''},{av:'AV87TFAlbHdrObs_Sel',fld:'vTFALBHDROBS_SEL',pic:''},{av:'AV90TFAlbProVal_Sels',fld:'vTFALBPROVAL_SELS',pic:''},{av:'AV92TFAlbTipEnt',fld:'vTFALBTIPENT',pic:'@!'},{av:'AV93TFAlbTipEnt_Sel',fld:'vTFALBTIPENT_SEL',pic:'@!'},{av:'AV160Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'edtCodCod_Visible',ctrl:'CODCOD',prop:'Visible'},{av:'edtPlasCod_Visible',ctrl:'PLASCOD',prop:'Visible'},{av:'edtBarAlbPlas_Visible',ctrl:'BARALBPLAS',prop:'Visible'},{av:'AV111Wctablaalbbards_1_emprcod',fld:'vWCTABLAALBBARDS_1_EMPRCOD',pic:'@!'},{av:'AV112Wctablaalbbards_2_albprocod',fld:'vWCTABLAALBBARDS_2_ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtEmprGuiRem_Visible',ctrl:'EMPRGUIREM',prop:'Visible'},{av:'edtBarCod_Visible',ctrl:'BARCOD',prop:'Visible'},{av:'edtBarCodReo_Visible',ctrl:'BARCODREO',prop:'Visible'},{av:'edtBarCodPar_Visible',ctrl:'BARCODPAR',prop:'Visible'},{av:'edtAlbSer_Visible',ctrl:'ALBSER',prop:'Visible'},{av:'edtAlbSerD_Visible',ctrl:'ALBSERD',prop:'Visible'},{av:'edtAlbColNom_Visible',ctrl:'ALBCOLNOM',prop:'Visible'},{av:'edtAlbNomCli_Visible',ctrl:'ALBNOMCLI',prop:'Visible'},{av:'edtAlbColNum_Visible',ctrl:'ALBCOLNUM',prop:'Visible'},{av:'edtCodCod_Visible',ctrl:'CODCOD',prop:'Visible'},{av:'edtBarAlbKgmE_Visible',ctrl:'BARALBKGME',prop:'Visible'},{av:'edtBarPreKgm_Visible',ctrl:'BARPREKGM',prop:'Visible'},{av:'edtAlbHdrAnc_Visible',ctrl:'ALBHDRANC',prop:'Visible'},{av:'edtAlbHdrgm2_Visible',ctrl:'ALBHDRGM2',prop:'Visible'},{av:'edtBarAlbMtrE_Visible',ctrl:'BARALBMTRE',prop:'Visible'},{av:'edtBarPreMtr_Visible',ctrl:'BARPREMTR',prop:'Visible'},{av:'edtBarAlbPie_Visible',ctrl:'BARALBPIE',prop:'Visible'},{av:'edtTubCod_Visible',ctrl:'TUBCOD',prop:'Visible'},{av:'edtBarAlbTub_Visible',ctrl:'BARALBTUB',prop:'Visible'},{av:'edtPlasCod_Visible',ctrl:'PLASCOD',prop:'Visible'},{av:'edtBarAlbPlas_Visible',ctrl:'BARALBPLAS',prop:'Visible'},{av:'edtAlbHdrObs_Visible',ctrl:'ALBHDROBS',prop:'Visible'},{av:'cmbAlbProVal'},{av:'edtAlbTipEnt_Visible',ctrl:'ALBTIPENT',prop:'Visible'},{av:'AV97GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV98GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e20MC2',iparms:[{av:'cmbavGridactions'},{av:'AV105GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV105GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("'DOFASES'","{handler:'e11MC1',iparms:[{av:'AV99Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV100AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:'',hsh:true}]");
      setEventMetadata("'DOFASES'",",oparms:[]}");
      setEventMetadata("'DOEXPORT'","{handler:'e16MC2',iparms:[]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Albtipent',iparms:[]");
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
      wcpOAV99Emprcod = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV99Emprcod = "" ;
      AV19ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV103TFEmprGuiRem = "" ;
      AV104TFEmprGuiRem_Sel = "" ;
      AV32TFBarCodPar = "" ;
      AV33TFBarCodPar_Sel = "" ;
      AV35TFAlbSer = "" ;
      AV36TFAlbSer_Sel = "" ;
      AV38TFAlbSerD = "" ;
      AV39TFAlbSerD_Sel = "" ;
      AV41TFAlbColNom = "" ;
      AV42TFAlbColNom_Sel = "" ;
      AV44TFAlbNomCli = "" ;
      AV45TFAlbNomCli_Sel = "" ;
      AV50TFCodCod = "" ;
      AV51TFCodCod_Sel = "" ;
      AV53TFBarAlbKgmE = DecimalUtil.ZERO ;
      AV54TFBarAlbKgmE_To = DecimalUtil.ZERO ;
      AV56TFBarPreKgm = DecimalUtil.ZERO ;
      AV57TFBarPreKgm_To = DecimalUtil.ZERO ;
      AV65TFBarAlbMtrE = DecimalUtil.ZERO ;
      AV66TFBarAlbMtrE_To = DecimalUtil.ZERO ;
      AV68TFBarPreMtr = DecimalUtil.ZERO ;
      AV69TFBarPreMtr_To = DecimalUtil.ZERO ;
      AV86TFAlbHdrObs = "" ;
      AV87TFAlbHdrObs_Sel = "" ;
      AV90TFAlbProVal_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV92TFAlbTipEnt = "" ;
      AV93TFAlbTipEnt_Sel = "" ;
      AV160Pgmname = "" ;
      AV111Wctablaalbbards_1_emprcod = "" ;
      A396EmprCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV95DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
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
      bttBtneditcolumns_Jsonclick = "" ;
      bttBtnfases_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      WebComp_Wcwctablaalbfas_Component = "" ;
      OldWcwctablaalbfas = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A1253EmprGuiRem = "" ;
      A130BarCodPar = "" ;
      A3391AlbSer = "" ;
      A8879AlbSerD = "" ;
      A3392AlbColNom = "" ;
      A12232AlbNomCli = "" ;
      A3153CodCod = "" ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1262BarPreKgm = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A1264BarPreMtr = DecimalUtil.ZERO ;
      A2441AlbHdrObs = "" ;
      A2839AlbProVal = "" ;
      A1095AlbTipEnt = "" ;
      AV157Wctablaalbbards_47_tfalbproval_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV113Wctablaalbbards_3_tfemprguirem = "" ;
      AV114Wctablaalbbards_4_tfemprguirem_sel = "" ;
      AV113Wctablaalbbards_3_tfemprguirem = "" ;
      AV120Wctablaalbbards_10_tfbarcodpar_sel = "" ;
      AV119Wctablaalbbards_9_tfbarcodpar = "" ;
      AV122Wctablaalbbards_12_tfalbser_sel = "" ;
      AV121Wctablaalbbards_11_tfalbser = "" ;
      AV124Wctablaalbbards_14_tfalbserd_sel = "" ;
      AV123Wctablaalbbards_13_tfalbserd = "" ;
      AV126Wctablaalbbards_16_tfalbcolnom_sel = "" ;
      AV125Wctablaalbbards_15_tfalbcolnom = "" ;
      AV128Wctablaalbbards_18_tfalbnomcli_sel = "" ;
      AV127Wctablaalbbards_17_tfalbnomcli = "" ;
      AV132Wctablaalbbards_22_tfcodcod_sel = "" ;
      AV131Wctablaalbbards_21_tfcodcod = "" ;
      AV133Wctablaalbbards_23_tfbaralbkgme = DecimalUtil.ZERO ;
      AV134Wctablaalbbards_24_tfbaralbkgme_to = DecimalUtil.ZERO ;
      AV135Wctablaalbbards_25_tfbarprekgm = DecimalUtil.ZERO ;
      AV136Wctablaalbbards_26_tfbarprekgm_to = DecimalUtil.ZERO ;
      AV141Wctablaalbbards_31_tfbaralbmtre = DecimalUtil.ZERO ;
      AV142Wctablaalbbards_32_tfbaralbmtre_to = DecimalUtil.ZERO ;
      AV143Wctablaalbbards_33_tfbarpremtr = DecimalUtil.ZERO ;
      AV144Wctablaalbbards_34_tfbarpremtr_to = DecimalUtil.ZERO ;
      AV156Wctablaalbbards_46_tfalbhdrobs_sel = "" ;
      AV155Wctablaalbbards_45_tfalbhdrobs = "" ;
      AV159Wctablaalbbards_49_tfalbtipent_sel = "" ;
      AV158Wctablaalbbards_48_tfalbtipent = "" ;
      H00MC2_A396EmprCod = new String[] {""} ;
      H00MC2_A30AlbProCod = new long[1] ;
      H00MC2_A1253EmprGuiRem = new String[] {""} ;
      H00MC3_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      GXv_int2 = new byte[1] ;
      AV108Station = "" ;
      AV109Emprnom = "" ;
      AV110Usurcod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV21Session = httpContext.getWebSession();
      AV17ColumnsSelectorXML = "" ;
      AV89TFAlbProVal_SelsJson = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV15ExcelFilename = "" ;
      AV16ErrorMessage = "" ;
      AV18UserCustomValue = "" ;
      AV20ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector11 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char3 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char26 = "" ;
      GXv_char27 = new String[1] ;
      GXt_char24 = "" ;
      GXv_char25 = new String[1] ;
      GXt_char22 = "" ;
      GXv_char23 = new String[1] ;
      GXt_char20 = "" ;
      GXv_char21 = new String[1] ;
      GXt_char18 = "" ;
      GXv_char19 = new String[1] ;
      GXt_char16 = "" ;
      GXv_char17 = new String[1] ;
      GXt_char14 = "" ;
      GXv_char15 = new String[1] ;
      GXt_char13 = "" ;
      GXv_char6 = new String[1] ;
      GXt_char12 = "" ;
      GXv_char5 = new String[1] ;
      GXv_SdtWWPGridState28 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      AV9TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV99Emprcod = "" ;
      sCtrlAV100AlbProCod = "" ;
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wctablaalbbar__default(),
         new Object[] {
             new Object[] {
            H00MC2_A396EmprCod, H00MC2_A30AlbProCod, H00MC2_A1253EmprGuiRem
            }
            , new Object[] {
            H00MC3_AGRID_nRecordCount
            }
         }
      );
      AV160Pgmname = "WCTablaAlbbar" ;
      /* GeneXus formulas. */
      AV160Pgmname = "WCTablaAlbbar" ;
      Gx_err = (short)(0) ;
      edtavAlbprocod_Enabled = 0 ;
      WebComp_Wcwctablaalbfas = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV29TFBarCodReo ;
   private byte AV30TFBarCodReo_To ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte A132BarCodReo ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV117Wctablaalbbards_7_tfbarcodreo ;
   private byte AV118Wctablaalbbards_8_tfbarcodreo_to ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV59TFAlbHdrAnc ;
   private short AV60TFAlbHdrAnc_To ;
   private short AV62TFAlbHdrgm2 ;
   private short AV63TFAlbHdrgm2_To ;
   private short AV74TFTubCod ;
   private short AV75TFTubCod_To ;
   private short AV80TFPlasCod ;
   private short AV81TFPlasCod_To ;
   private short AV83TFBarAlbPlas ;
   private short AV84TFBarAlbPlas_To ;
   private short AV12OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV105GridActions ;
   private short A3271AlbHdrAnc ;
   private short A5019AlbHdrgm2 ;
   private short A1206TubCod ;
   private short A6466PlasCod ;
   private short A6467BarAlbPlas ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV137Wctablaalbbards_27_tfalbhdranc ;
   private short AV138Wctablaalbbards_28_tfalbhdranc_to ;
   private short AV139Wctablaalbbards_29_tfalbhdrgm2 ;
   private short AV140Wctablaalbbards_30_tfalbhdrgm2_to ;
   private short AV147Wctablaalbbards_37_tftubcod ;
   private short AV148Wctablaalbbards_38_tftubcod_to ;
   private short AV151Wctablaalbbards_41_tfplascod ;
   private short AV152Wctablaalbbards_42_tfplascod_to ;
   private short AV153Wctablaalbbards_43_tfbaralbplas ;
   private short AV154Wctablaalbbards_44_tfbaralbplas_to ;
   private short AV101Artemalha ;
   private short AV102siplasticos ;
   private int edtCodCod_Visible ;
   private int edtPlasCod_Visible ;
   private int edtBarAlbPlas_Visible ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_36 ;
   private int nGXsfl_36_idx=1 ;
   private int AV26TFBarCod ;
   private int AV27TFBarCod_To ;
   private int AV47TFAlbColNum ;
   private int AV48TFAlbColNum_To ;
   private int AV71TFBarAlbPie ;
   private int AV72TFBarAlbPie_To ;
   private int AV77TFBarAlbTub ;
   private int AV78TFBarAlbTub_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavAlbprocod_Enabled ;
   private int edtEmprCod_Visible ;
   private int edtAlbProCod_Visible ;
   private int A129BarCod ;
   private int A3393AlbColNum ;
   private int A1265BarAlbPie ;
   private int A1266BarAlbTub ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV157Wctablaalbbards_47_tfalbproval_sels_size ;
   private int AV115Wctablaalbbards_5_tfbarcod ;
   private int AV116Wctablaalbbards_6_tfbarcod_to ;
   private int AV129Wctablaalbbards_19_tfalbcolnum ;
   private int AV130Wctablaalbbards_20_tfalbcolnum_to ;
   private int AV145Wctablaalbbards_35_tfbaralbpie ;
   private int AV146Wctablaalbbards_36_tfbaralbpie_to ;
   private int AV149Wctablaalbbards_39_tfbaralbtub ;
   private int AV150Wctablaalbbards_40_tfbaralbtub_to ;
   private int edtEmprGuiRem_Visible ;
   private int edtBarCod_Visible ;
   private int edtBarCodReo_Visible ;
   private int edtBarCodPar_Visible ;
   private int edtAlbSer_Visible ;
   private int edtAlbSerD_Visible ;
   private int edtAlbColNom_Visible ;
   private int edtAlbNomCli_Visible ;
   private int edtAlbColNum_Visible ;
   private int edtBarAlbKgmE_Visible ;
   private int edtBarPreKgm_Visible ;
   private int edtAlbHdrAnc_Visible ;
   private int edtAlbHdrgm2_Visible ;
   private int edtBarAlbMtrE_Visible ;
   private int edtBarPreMtr_Visible ;
   private int edtBarAlbPie_Visible ;
   private int edtTubCod_Visible ;
   private int edtBarAlbTub_Visible ;
   private int edtAlbHdrObs_Visible ;
   private int edtAlbTipEnt_Visible ;
   private int AV96PageToGo ;
   private int AV161GXV1 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long wcpOAV100AlbProCod ;
   private long GRID_nFirstRecordOnPage ;
   private long AV100AlbProCod ;
   private long AV112Wctablaalbbards_2_albprocod ;
   private long A30AlbProCod ;
   private long AV97GridCurrentPage ;
   private long AV98GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV53TFBarAlbKgmE ;
   private java.math.BigDecimal AV54TFBarAlbKgmE_To ;
   private java.math.BigDecimal AV56TFBarPreKgm ;
   private java.math.BigDecimal AV57TFBarPreKgm_To ;
   private java.math.BigDecimal AV65TFBarAlbMtrE ;
   private java.math.BigDecimal AV66TFBarAlbMtrE_To ;
   private java.math.BigDecimal AV68TFBarPreMtr ;
   private java.math.BigDecimal AV69TFBarPreMtr_To ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1262BarPreKgm ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A1264BarPreMtr ;
   private java.math.BigDecimal AV133Wctablaalbbards_23_tfbaralbkgme ;
   private java.math.BigDecimal AV134Wctablaalbbards_24_tfbaralbkgme_to ;
   private java.math.BigDecimal AV135Wctablaalbbards_25_tfbarprekgm ;
   private java.math.BigDecimal AV136Wctablaalbbards_26_tfbarprekgm_to ;
   private java.math.BigDecimal AV141Wctablaalbbards_31_tfbaralbmtre ;
   private java.math.BigDecimal AV142Wctablaalbbards_32_tfbaralbmtre_to ;
   private java.math.BigDecimal AV143Wctablaalbbards_33_tfbarpremtr ;
   private java.math.BigDecimal AV144Wctablaalbbards_34_tfbarpremtr_to ;
   private String wcpOAV99Emprcod ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV99Emprcod ;
   private String sGXsfl_36_idx="0001" ;
   private String edtCodCod_Internalname ;
   private String edtPlasCod_Internalname ;
   private String edtBarAlbPlas_Internalname ;
   private String AV103TFEmprGuiRem ;
   private String AV104TFEmprGuiRem_Sel ;
   private String AV32TFBarCodPar ;
   private String AV33TFBarCodPar_Sel ;
   private String AV35TFAlbSer ;
   private String AV36TFAlbSer_Sel ;
   private String AV38TFAlbSerD ;
   private String AV39TFAlbSerD_Sel ;
   private String AV41TFAlbColNom ;
   private String AV42TFAlbColNom_Sel ;
   private String AV44TFAlbNomCli ;
   private String AV45TFAlbNomCli_Sel ;
   private String AV50TFCodCod ;
   private String AV51TFCodCod_Sel ;
   private String AV86TFAlbHdrObs ;
   private String AV87TFAlbHdrObs_Sel ;
   private String AV92TFAlbTipEnt ;
   private String AV93TFAlbTipEnt_Sel ;
   private String AV160Pgmname ;
   private String AV111Wctablaalbbards_1_emprcod ;
   private String A396EmprCod ;
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
   private String Ddo_grid_Allowmultipleselection ;
   private String Ddo_grid_Datalistfixedvalues ;
   private String Ddo_grid_Datalistproc ;
   private String Ddo_gridcolumnsselector_Caption ;
   private String Ddo_gridcolumnsselector_Tooltip ;
   private String Ddo_gridcolumnsselector_Cls ;
   private String Ddo_gridcolumnsselector_Dropdownoptionstype ;
   private String Ddo_gridcolumnsselector_Gridinternalname ;
   private String Ddo_gridcolumnsselector_Titlecontrolidtoreplace ;
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
   private String bttBtnexport_Internalname ;
   private String bttBtnexport_Jsonclick ;
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String edtavAlbprocod_Internalname ;
   private String edtavAlbprocod_Jsonclick ;
   private String bttBtnfases_Internalname ;
   private String bttBtnfases_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String WebComp_Wcwctablaalbfas_Component ;
   private String OldWcwctablaalbfas ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String edtAlbProCod_Internalname ;
   private String edtAlbProCod_Jsonclick ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String A1253EmprGuiRem ;
   private String edtEmprGuiRem_Internalname ;
   private String edtBarCod_Internalname ;
   private String edtBarCodReo_Internalname ;
   private String A130BarCodPar ;
   private String edtBarCodPar_Internalname ;
   private String A3391AlbSer ;
   private String edtAlbSer_Internalname ;
   private String A8879AlbSerD ;
   private String edtAlbSerD_Internalname ;
   private String A3392AlbColNom ;
   private String edtAlbColNom_Internalname ;
   private String A12232AlbNomCli ;
   private String edtAlbNomCli_Internalname ;
   private String edtAlbColNum_Internalname ;
   private String A3153CodCod ;
   private String edtBarAlbKgmE_Internalname ;
   private String edtBarPreKgm_Internalname ;
   private String edtAlbHdrAnc_Internalname ;
   private String edtAlbHdrgm2_Internalname ;
   private String edtBarAlbMtrE_Internalname ;
   private String edtBarPreMtr_Internalname ;
   private String edtBarAlbPie_Internalname ;
   private String edtTubCod_Internalname ;
   private String edtBarAlbTub_Internalname ;
   private String A2441AlbHdrObs ;
   private String edtAlbHdrObs_Internalname ;
   private String A2839AlbProVal ;
   private String A1095AlbTipEnt ;
   private String edtAlbTipEnt_Internalname ;
   private String scmdbuf ;
   private String lV113Wctablaalbbards_3_tfemprguirem ;
   private String AV114Wctablaalbbards_4_tfemprguirem_sel ;
   private String AV113Wctablaalbbards_3_tfemprguirem ;
   private String AV120Wctablaalbbards_10_tfbarcodpar_sel ;
   private String AV119Wctablaalbbards_9_tfbarcodpar ;
   private String AV122Wctablaalbbards_12_tfalbser_sel ;
   private String AV121Wctablaalbbards_11_tfalbser ;
   private String AV124Wctablaalbbards_14_tfalbserd_sel ;
   private String AV123Wctablaalbbards_13_tfalbserd ;
   private String AV126Wctablaalbbards_16_tfalbcolnom_sel ;
   private String AV125Wctablaalbbards_15_tfalbcolnom ;
   private String AV128Wctablaalbbards_18_tfalbnomcli_sel ;
   private String AV127Wctablaalbbards_17_tfalbnomcli ;
   private String AV132Wctablaalbbards_22_tfcodcod_sel ;
   private String AV131Wctablaalbbards_21_tfcodcod ;
   private String AV156Wctablaalbbards_46_tfalbhdrobs_sel ;
   private String AV155Wctablaalbbards_45_tfalbhdrobs ;
   private String AV159Wctablaalbbards_49_tfalbtipent_sel ;
   private String AV158Wctablaalbbards_48_tfalbtipent ;
   private String hsh ;
   private String AV108Station ;
   private String AV109Emprnom ;
   private String AV110Usurcod ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private String GXt_char26 ;
   private String GXv_char27[] ;
   private String GXt_char24 ;
   private String GXv_char25[] ;
   private String GXt_char22 ;
   private String GXv_char23[] ;
   private String GXt_char20 ;
   private String GXv_char21[] ;
   private String GXt_char18 ;
   private String GXv_char19[] ;
   private String GXt_char16 ;
   private String GXv_char17[] ;
   private String GXt_char14 ;
   private String GXv_char15[] ;
   private String GXt_char13 ;
   private String GXv_char6[] ;
   private String GXt_char12 ;
   private String GXv_char5[] ;
   private String sCtrlAV99Emprcod ;
   private String sCtrlAV100AlbProCod ;
   private String sGXsfl_36_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtEmprGuiRem_Jsonclick ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
   private String edtAlbSer_Jsonclick ;
   private String edtAlbSerD_Jsonclick ;
   private String edtAlbColNom_Jsonclick ;
   private String edtAlbNomCli_Jsonclick ;
   private String edtAlbColNum_Jsonclick ;
   private String edtCodCod_Jsonclick ;
   private String edtBarAlbKgmE_Jsonclick ;
   private String edtBarPreKgm_Jsonclick ;
   private String edtAlbHdrAnc_Jsonclick ;
   private String edtAlbHdrgm2_Jsonclick ;
   private String edtBarAlbMtrE_Jsonclick ;
   private String edtBarPreMtr_Jsonclick ;
   private String edtBarAlbPie_Jsonclick ;
   private String edtTubCod_Jsonclick ;
   private String edtBarAlbTub_Jsonclick ;
   private String edtPlasCod_Jsonclick ;
   private String edtBarAlbPlas_Jsonclick ;
   private String edtAlbHdrObs_Jsonclick ;
   private String edtAlbTipEnt_Jsonclick ;
   private String subGrid_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean bGXsfl_36_Refreshing=false ;
   private boolean AV13OrderedDsc ;
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
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean bDynCreated_Wcwctablaalbfas ;
   private boolean gx_refresh_fired ;
   private String AV17ColumnsSelectorXML ;
   private String AV89TFAlbProVal_SelsJson ;
   private String AV18UserCustomValue ;
   private String AV15ExcelFilename ;
   private String AV16ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wcwctablaalbfas ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV21Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private GXSimpleCollection<String> AV157Wctablaalbbards_47_tfalbproval_sels ;
   private HTMLChoice cmbavGridactions ;
   private HTMLChoice cmbAlbProVal ;
   private IDataStoreProvider pr_default ;
   private String[] H00MC2_A396EmprCod ;
   private long[] H00MC2_A30AlbProCod ;
   private String[] H00MC2_A1253EmprGuiRem ;
   private long[] H00MC3_AGRID_nRecordCount ;
   private GXSimpleCollection<String> AV90TFAlbProVal_Sels ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV9TrnContextAtt ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState28[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV19ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector10[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector11[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV95DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[] ;
}

final  class wctablaalbbar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00MC2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A2839AlbProVal ,
                                          GXSimpleCollection<String> AV157Wctablaalbbards_47_tfalbproval_sels ,
                                          String AV114Wctablaalbbards_4_tfemprguirem_sel ,
                                          String AV113Wctablaalbbards_3_tfemprguirem ,
                                          int AV115Wctablaalbbards_5_tfbarcod ,
                                          int AV116Wctablaalbbards_6_tfbarcod_to ,
                                          byte AV117Wctablaalbbards_7_tfbarcodreo ,
                                          byte AV118Wctablaalbbards_8_tfbarcodreo_to ,
                                          String AV120Wctablaalbbards_10_tfbarcodpar_sel ,
                                          String AV119Wctablaalbbards_9_tfbarcodpar ,
                                          String AV122Wctablaalbbards_12_tfalbser_sel ,
                                          String AV121Wctablaalbbards_11_tfalbser ,
                                          String AV124Wctablaalbbards_14_tfalbserd_sel ,
                                          String AV123Wctablaalbbards_13_tfalbserd ,
                                          String AV126Wctablaalbbards_16_tfalbcolnom_sel ,
                                          String AV125Wctablaalbbards_15_tfalbcolnom ,
                                          String AV128Wctablaalbbards_18_tfalbnomcli_sel ,
                                          String AV127Wctablaalbbards_17_tfalbnomcli ,
                                          int AV129Wctablaalbbards_19_tfalbcolnum ,
                                          int AV130Wctablaalbbards_20_tfalbcolnum_to ,
                                          String AV132Wctablaalbbards_22_tfcodcod_sel ,
                                          String AV131Wctablaalbbards_21_tfcodcod ,
                                          java.math.BigDecimal AV133Wctablaalbbards_23_tfbaralbkgme ,
                                          java.math.BigDecimal AV134Wctablaalbbards_24_tfbaralbkgme_to ,
                                          java.math.BigDecimal AV135Wctablaalbbards_25_tfbarprekgm ,
                                          java.math.BigDecimal AV136Wctablaalbbards_26_tfbarprekgm_to ,
                                          short AV137Wctablaalbbards_27_tfalbhdranc ,
                                          short AV138Wctablaalbbards_28_tfalbhdranc_to ,
                                          short AV139Wctablaalbbards_29_tfalbhdrgm2 ,
                                          short AV140Wctablaalbbards_30_tfalbhdrgm2_to ,
                                          java.math.BigDecimal AV141Wctablaalbbards_31_tfbaralbmtre ,
                                          java.math.BigDecimal AV142Wctablaalbbards_32_tfbaralbmtre_to ,
                                          java.math.BigDecimal AV143Wctablaalbbards_33_tfbarpremtr ,
                                          java.math.BigDecimal AV144Wctablaalbbards_34_tfbarpremtr_to ,
                                          int AV145Wctablaalbbards_35_tfbaralbpie ,
                                          int AV146Wctablaalbbards_36_tfbaralbpie_to ,
                                          short AV147Wctablaalbbards_37_tftubcod ,
                                          short AV148Wctablaalbbards_38_tftubcod_to ,
                                          int AV149Wctablaalbbards_39_tfbaralbtub ,
                                          int AV150Wctablaalbbards_40_tfbaralbtub_to ,
                                          short AV151Wctablaalbbards_41_tfplascod ,
                                          short AV152Wctablaalbbards_42_tfplascod_to ,
                                          short AV153Wctablaalbbards_43_tfbaralbplas ,
                                          short AV154Wctablaalbbards_44_tfbaralbplas_to ,
                                          String AV156Wctablaalbbards_46_tfalbhdrobs_sel ,
                                          String AV155Wctablaalbbards_45_tfalbhdrobs ,
                                          int AV157Wctablaalbbards_47_tfalbproval_sels_size ,
                                          String AV159Wctablaalbbards_49_tfalbtipent_sel ,
                                          String AV158Wctablaalbbards_48_tfalbtipent ,
                                          String A1253EmprGuiRem ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A3391AlbSer ,
                                          String A8879AlbSerD ,
                                          String A3392AlbColNom ,
                                          String A12232AlbNomCli ,
                                          int A3393AlbColNum ,
                                          String A3153CodCod ,
                                          java.math.BigDecimal A1261BarAlbKgmE ,
                                          java.math.BigDecimal A1262BarPreKgm ,
                                          short A3271AlbHdrAnc ,
                                          short A5019AlbHdrgm2 ,
                                          java.math.BigDecimal A1263BarAlbMtrE ,
                                          java.math.BigDecimal A1264BarPreMtr ,
                                          int A1265BarAlbPie ,
                                          short A1206TubCod ,
                                          int A1266BarAlbTub ,
                                          short A6466PlasCod ,
                                          short A6467BarAlbPlas ,
                                          String A2441AlbHdrObs ,
                                          String A1095AlbTipEnt ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV111Wctablaalbbards_1_emprcod ,
                                          long AV112Wctablaalbbards_2_albprocod ,
                                          String A396EmprCod ,
                                          long A30AlbProCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int29 = new byte[9];
      Object[] GXv_Object30 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " EmprCod, AlbProCod, EmprGuiRem" ;
      sFromString = " FROM TXPCALPRD" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(EmprCod = ? and AlbProCod = ?)");
      if ( (GXutil.strcmp("", AV114Wctablaalbbards_4_tfemprguirem_sel)==0) && ( ! (GXutil.strcmp("", AV113Wctablaalbbards_3_tfemprguirem)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(EmprGuiRem) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Wctablaalbbards_4_tfemprguirem_sel)==0) )
      {
         addWhere(sWhereString, "(EmprGuiRem = ?)");
      }
      else
      {
         GXv_int29[3] = (byte)(1) ;
      }
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod, AlbProCod, EmprGuiRem" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC, AlbProCod DESC, EmprGuiRem DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod, AlbProCod" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC, AlbProCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod, AlbProCod" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC, AlbProCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod, AlbProCod" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC, AlbProCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod, AlbProCod" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC, AlbProCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod, AlbProCod" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC, AlbProCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod, AlbProCod" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC, AlbProCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod, AlbProCod" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC, AlbProCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod, AlbProCod" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC, AlbProCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod, AlbProCod" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC, AlbProCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod, AlbProCod" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC, AlbProCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod, AlbProCod" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC, AlbProCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod, AlbProCod" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC, AlbProCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod, AlbProCod" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC, AlbProCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod, AlbProCod" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC, AlbProCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod, AlbProCod" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC, AlbProCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 17 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod, AlbProCod" ;
      }
      else if ( ( AV12OrderedBy == 17 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC, AlbProCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 18 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod, AlbProCod" ;
      }
      else if ( ( AV12OrderedBy == 18 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC, AlbProCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 19 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod, AlbProCod" ;
      }
      else if ( ( AV12OrderedBy == 19 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC, AlbProCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 20 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod, AlbProCod" ;
      }
      else if ( ( AV12OrderedBy == 20 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC, AlbProCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 21 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod, AlbProCod" ;
      }
      else if ( ( AV12OrderedBy == 21 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC, AlbProCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 22 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod, AlbProCod" ;
      }
      else if ( ( AV12OrderedBy == 22 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC, AlbProCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 23 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod, AlbProCod" ;
      }
      else if ( ( AV12OrderedBy == 23 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC, AlbProCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 24 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod, AlbProCod" ;
      }
      else if ( ( AV12OrderedBy == 24 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC, AlbProCod DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY EmprCod, AlbProCod" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object30[0] = scmdbuf ;
      GXv_Object30[1] = GXv_int29 ;
      return GXv_Object30 ;
   }

   protected Object[] conditional_H00MC3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A2839AlbProVal ,
                                          GXSimpleCollection<String> AV157Wctablaalbbards_47_tfalbproval_sels ,
                                          String AV114Wctablaalbbards_4_tfemprguirem_sel ,
                                          String AV113Wctablaalbbards_3_tfemprguirem ,
                                          int AV115Wctablaalbbards_5_tfbarcod ,
                                          int AV116Wctablaalbbards_6_tfbarcod_to ,
                                          byte AV117Wctablaalbbards_7_tfbarcodreo ,
                                          byte AV118Wctablaalbbards_8_tfbarcodreo_to ,
                                          String AV120Wctablaalbbards_10_tfbarcodpar_sel ,
                                          String AV119Wctablaalbbards_9_tfbarcodpar ,
                                          String AV122Wctablaalbbards_12_tfalbser_sel ,
                                          String AV121Wctablaalbbards_11_tfalbser ,
                                          String AV124Wctablaalbbards_14_tfalbserd_sel ,
                                          String AV123Wctablaalbbards_13_tfalbserd ,
                                          String AV126Wctablaalbbards_16_tfalbcolnom_sel ,
                                          String AV125Wctablaalbbards_15_tfalbcolnom ,
                                          String AV128Wctablaalbbards_18_tfalbnomcli_sel ,
                                          String AV127Wctablaalbbards_17_tfalbnomcli ,
                                          int AV129Wctablaalbbards_19_tfalbcolnum ,
                                          int AV130Wctablaalbbards_20_tfalbcolnum_to ,
                                          String AV132Wctablaalbbards_22_tfcodcod_sel ,
                                          String AV131Wctablaalbbards_21_tfcodcod ,
                                          java.math.BigDecimal AV133Wctablaalbbards_23_tfbaralbkgme ,
                                          java.math.BigDecimal AV134Wctablaalbbards_24_tfbaralbkgme_to ,
                                          java.math.BigDecimal AV135Wctablaalbbards_25_tfbarprekgm ,
                                          java.math.BigDecimal AV136Wctablaalbbards_26_tfbarprekgm_to ,
                                          short AV137Wctablaalbbards_27_tfalbhdranc ,
                                          short AV138Wctablaalbbards_28_tfalbhdranc_to ,
                                          short AV139Wctablaalbbards_29_tfalbhdrgm2 ,
                                          short AV140Wctablaalbbards_30_tfalbhdrgm2_to ,
                                          java.math.BigDecimal AV141Wctablaalbbards_31_tfbaralbmtre ,
                                          java.math.BigDecimal AV142Wctablaalbbards_32_tfbaralbmtre_to ,
                                          java.math.BigDecimal AV143Wctablaalbbards_33_tfbarpremtr ,
                                          java.math.BigDecimal AV144Wctablaalbbards_34_tfbarpremtr_to ,
                                          int AV145Wctablaalbbards_35_tfbaralbpie ,
                                          int AV146Wctablaalbbards_36_tfbaralbpie_to ,
                                          short AV147Wctablaalbbards_37_tftubcod ,
                                          short AV148Wctablaalbbards_38_tftubcod_to ,
                                          int AV149Wctablaalbbards_39_tfbaralbtub ,
                                          int AV150Wctablaalbbards_40_tfbaralbtub_to ,
                                          short AV151Wctablaalbbards_41_tfplascod ,
                                          short AV152Wctablaalbbards_42_tfplascod_to ,
                                          short AV153Wctablaalbbards_43_tfbaralbplas ,
                                          short AV154Wctablaalbbards_44_tfbaralbplas_to ,
                                          String AV156Wctablaalbbards_46_tfalbhdrobs_sel ,
                                          String AV155Wctablaalbbards_45_tfalbhdrobs ,
                                          int AV157Wctablaalbbards_47_tfalbproval_sels_size ,
                                          String AV159Wctablaalbbards_49_tfalbtipent_sel ,
                                          String AV158Wctablaalbbards_48_tfalbtipent ,
                                          String A1253EmprGuiRem ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A3391AlbSer ,
                                          String A8879AlbSerD ,
                                          String A3392AlbColNom ,
                                          String A12232AlbNomCli ,
                                          int A3393AlbColNum ,
                                          String A3153CodCod ,
                                          java.math.BigDecimal A1261BarAlbKgmE ,
                                          java.math.BigDecimal A1262BarPreKgm ,
                                          short A3271AlbHdrAnc ,
                                          short A5019AlbHdrgm2 ,
                                          java.math.BigDecimal A1263BarAlbMtrE ,
                                          java.math.BigDecimal A1264BarPreMtr ,
                                          int A1265BarAlbPie ,
                                          short A1206TubCod ,
                                          int A1266BarAlbTub ,
                                          short A6466PlasCod ,
                                          short A6467BarAlbPlas ,
                                          String A2441AlbHdrObs ,
                                          String A1095AlbTipEnt ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV111Wctablaalbbards_1_emprcod ,
                                          long AV112Wctablaalbbards_2_albprocod ,
                                          String A396EmprCod ,
                                          long A30AlbProCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int31 = new byte[4];
      Object[] GXv_Object32 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM TXPCALPRD" ;
      addWhere(sWhereString, "(EmprCod = ? and AlbProCod = ?)");
      if ( (GXutil.strcmp("", AV114Wctablaalbbards_4_tfemprguirem_sel)==0) && ( ! (GXutil.strcmp("", AV113Wctablaalbbards_3_tfemprguirem)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(EmprGuiRem) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Wctablaalbbards_4_tfemprguirem_sel)==0) )
      {
         addWhere(sWhereString, "(EmprGuiRem = ?)");
      }
      else
      {
         GXv_int31[3] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
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
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 17 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 17 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 18 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 18 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 19 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 19 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 20 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 20 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 21 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 21 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 22 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 22 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 23 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 23 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 24 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 24 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object32[0] = scmdbuf ;
      GXv_Object32[1] = GXv_int31 ;
      return GXv_Object32 ;
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
                  return conditional_H00MC2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).byteValue() , ((Number) dynConstraints[7]).byteValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).shortValue() , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).shortValue() , ((Number) dynConstraints[41]).shortValue() , ((Number) dynConstraints[42]).shortValue() , ((Number) dynConstraints[43]).shortValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , ((Number) dynConstraints[50]).intValue() , ((Number) dynConstraints[51]).byteValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , ((Number) dynConstraints[57]).intValue() , (String)dynConstraints[58] , (java.math.BigDecimal)dynConstraints[59] , (java.math.BigDecimal)dynConstraints[60] , ((Number) dynConstraints[61]).shortValue() , ((Number) dynConstraints[62]).shortValue() , (java.math.BigDecimal)dynConstraints[63] , (java.math.BigDecimal)dynConstraints[64] , ((Number) dynConstraints[65]).intValue() , ((Number) dynConstraints[66]).shortValue() , ((Number) dynConstraints[67]).intValue() , ((Number) dynConstraints[68]).shortValue() , ((Number) dynConstraints[69]).shortValue() , (String)dynConstraints[70] , (String)dynConstraints[71] , ((Number) dynConstraints[72]).shortValue() , ((Boolean) dynConstraints[73]).booleanValue() , (String)dynConstraints[74] , ((Number) dynConstraints[75]).longValue() , (String)dynConstraints[76] , ((Number) dynConstraints[77]).longValue() );
            case 1 :
                  return conditional_H00MC3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).byteValue() , ((Number) dynConstraints[7]).byteValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).shortValue() , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).shortValue() , ((Number) dynConstraints[41]).shortValue() , ((Number) dynConstraints[42]).shortValue() , ((Number) dynConstraints[43]).shortValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , ((Number) dynConstraints[50]).intValue() , ((Number) dynConstraints[51]).byteValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , ((Number) dynConstraints[57]).intValue() , (String)dynConstraints[58] , (java.math.BigDecimal)dynConstraints[59] , (java.math.BigDecimal)dynConstraints[60] , ((Number) dynConstraints[61]).shortValue() , ((Number) dynConstraints[62]).shortValue() , (java.math.BigDecimal)dynConstraints[63] , (java.math.BigDecimal)dynConstraints[64] , ((Number) dynConstraints[65]).intValue() , ((Number) dynConstraints[66]).shortValue() , ((Number) dynConstraints[67]).intValue() , ((Number) dynConstraints[68]).shortValue() , ((Number) dynConstraints[69]).shortValue() , (String)dynConstraints[70] , (String)dynConstraints[71] , ((Number) dynConstraints[72]).shortValue() , ((Boolean) dynConstraints[73]).booleanValue() , (String)dynConstraints[74] , ((Number) dynConstraints[75]).longValue() , (String)dynConstraints[76] , ((Number) dynConstraints[77]).longValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00MC2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00MC3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
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
                  stmt.setString(sIdx, (String)parms[9], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[10]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 3);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[14]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[4], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[5]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[6], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 3);
               }
               return;
      }
   }

}

