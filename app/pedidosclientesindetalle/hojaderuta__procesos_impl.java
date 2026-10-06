package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class hojaderuta__procesos_impl extends GXDataArea
{
   public hojaderuta__procesos_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public hojaderuta__procesos_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( hojaderuta__procesos_impl.class ));
   }

   public hojaderuta__procesos_impl( int remoteHandle ,
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
            A396EmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV37BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV37BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37BarCod), 8, 0));
               AV38BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV38BarCodReo", GXutil.str( AV38BarCodReo, 1, 0));
               AV39BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV39BarCodPar", AV39BarCodPar);
               AV25Discod = (int)(GXutil.lval( httpContext.GetPar( "Discod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV25Discod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25Discod), 8, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV25Discod), "ZZZZZZZ9")));
               AV26BarSit = (byte)(GXutil.lval( httpContext.GetPar( "BarSit"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV26BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26BarSit), 2, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSIT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV26BarSit), "Z9")));
               AV27BarExt = (byte)(GXutil.lval( httpContext.GetPar( "BarExt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV27BarExt", GXutil.str( AV27BarExt, 1, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBAREXT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV27BarExt), "9")));
               AV48CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV48CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48CliCod), 6, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV48CliCod), "ZZZZZ9")));
               AV50Barunimed = httpContext.GetPar( "Barunimed") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV50Barunimed", AV50Barunimed);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARUNIMED", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV50Barunimed, "@!"))));
               AV51Barpes = (short)(GXutil.lval( httpContext.GetPar( "Barpes"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV51Barpes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51Barpes), 4, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPES", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV51Barpes), "ZZZ9")));
               AV52BarSer = httpContext.GetPar( "BarSer") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV52BarSer", AV52BarSer);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSER", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV52BarSer, ""))));
               AV53PedidoCliente = httpContext.GetPar( "PedidoCliente") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV53PedidoCliente", AV53PedidoCliente);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPEDIDOCLIENTE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV53PedidoCliente, ""))));
               AV54BarColNom = httpContext.GetPar( "BarColNom") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV54BarColNom", AV54BarColNom);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV54BarColNom, ""))));
               AV55BarColNum = (int)(GXutil.lval( httpContext.GetPar( "BarColNum"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV55BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55BarColNum), 6, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNUM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV55BarColNum), "ZZZZZ9")));
               AV56BarPie = (int)(GXutil.lval( httpContext.GetPar( "BarPie"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV56BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56BarPie), 6, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPIE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV56BarPie), "ZZZZZ9")));
               AV49BarKgm = CommonUtil.decimalVal( httpContext.GetPar( "BarKgm"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV49BarKgm", GXutil.ltrimstr( AV49BarKgm, 9, 2));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARKGM", getSecureSignedToken( "", localUtil.format( AV49BarKgm, "ZZZZZ9.99")));
               AV57BarMtr = CommonUtil.decimalVal( httpContext.GetPar( "BarMtr"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV57BarMtr", GXutil.ltrimstr( AV57BarMtr, 9, 2));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARMTR", getSecureSignedToken( "", localUtil.format( AV57BarMtr, "ZZZZZ9.99")));
               AV58CliNom = httpContext.GetPar( "CliNom") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV58CliNom", AV58CliNom);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLINOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV58CliNom, ""))));
               AV59BarSerDsc = httpContext.GetPar( "BarSerDsc") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV59BarSerDsc", AV59BarSerDsc);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSERDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV59BarSerDsc, ""))));
               AV60BarAgrEst = httpContext.GetPar( "BarAgrEst") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV60BarAgrEst", AV60BarAgrEst);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARAGREST", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV60BarAgrEst, "@!"))));
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
      nRC_GXsfl_122 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_122"))) ;
      nGXsfl_122_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_122_idx"))) ;
      sGXsfl_122_idx = httpContext.GetPar( "sGXsfl_122_idx") ;
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
      AV37BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      AV38BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      AV39BarCodPar = httpContext.GetPar( "BarCodPar") ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      AV15TFProCod = httpContext.GetPar( "TFProCod") ;
      AV16TFProCod_Sel = httpContext.GetPar( "TFProCod_Sel") ;
      AV17TFProDsc = httpContext.GetPar( "TFProDsc") ;
      AV18TFProDsc_Sel = httpContext.GetPar( "TFProDsc_Sel") ;
      AV40TFProFasEst = (byte)(GXutil.lval( httpContext.GetPar( "TFProFasEst"))) ;
      AV41TFProFasEst_To = (byte)(GXutil.lval( httpContext.GetPar( "TFProFasEst_To"))) ;
      AV66Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV25Discod = (int)(GXutil.lval( httpContext.GetPar( "Discod"))) ;
      AV27BarExt = (byte)(GXutil.lval( httpContext.GetPar( "BarExt"))) ;
      AV26BarSit = (byte)(GXutil.lval( httpContext.GetPar( "BarSit"))) ;
      AV50Barunimed = httpContext.GetPar( "Barunimed") ;
      AV51Barpes = (short)(GXutil.lval( httpContext.GetPar( "Barpes"))) ;
      AV59BarSerDsc = httpContext.GetPar( "BarSerDsc") ;
      AV60BarAgrEst = httpContext.GetPar( "BarAgrEst") ;
      AV33Planing = (short)(GXutil.lval( httpContext.GetPar( "Planing"))) ;
      AV34Carvema = (short)(GXutil.lval( httpContext.GetPar( "Carvema"))) ;
      AV35Tinamar = (short)(GXutil.lval( httpContext.GetPar( "Tinamar"))) ;
      AV36CtrlUsu = (short)(GXutil.lval( httpContext.GetPar( "CtrlUsu"))) ;
      A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
      AV48CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
      AV52BarSer = httpContext.GetPar( "BarSer") ;
      AV53PedidoCliente = httpContext.GetPar( "PedidoCliente") ;
      AV54BarColNom = httpContext.GetPar( "BarColNom") ;
      AV55BarColNum = (int)(GXutil.lval( httpContext.GetPar( "BarColNum"))) ;
      AV56BarPie = (int)(GXutil.lval( httpContext.GetPar( "BarPie"))) ;
      AV49BarKgm = CommonUtil.decimalVal( httpContext.GetPar( "BarKgm"), ".") ;
      AV57BarMtr = CommonUtil.decimalVal( httpContext.GetPar( "BarMtr"), ".") ;
      AV58CliNom = httpContext.GetPar( "CliNom") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV37BarCod, AV38BarCodReo, AV39BarCodPar, A396EmprCod, AV15TFProCod, AV16TFProCod_Sel, AV17TFProDsc, AV18TFProDsc_Sel, AV40TFProFasEst, AV41TFProFasEst_To, AV66Pgmname, AV12OrderedBy, AV13OrderedDsc, AV25Discod, AV27BarExt, AV26BarSit, AV50Barunimed, AV51Barpes, AV59BarSerDsc, AV60BarAgrEst, AV33Planing, AV34Carvema, AV35Tinamar, AV36CtrlUsu, A129BarCod, A132BarCodReo, A130BarCodPar, AV48CliCod, AV52BarSer, AV53PedidoCliente, AV54BarColNom, AV55BarColNum, AV56BarPie, AV49BarKgm, AV57BarMtr, AV58CliNom) ;
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
      pa24E2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start24E2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.pedidosclientesindetalle.hojaderuta__procesos", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV37BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV38BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV39BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV25Discod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV26BarSit,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV27BarExt,1,0)),GXutil.URLEncode(GXutil.ltrimstr(AV48CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV50Barunimed)),GXutil.URLEncode(GXutil.ltrimstr(AV51Barpes,4,0)),GXutil.URLEncode(GXutil.rtrim(AV52BarSer)),GXutil.URLEncode(GXutil.rtrim(AV53PedidoCliente)),GXutil.URLEncode(GXutil.rtrim(AV54BarColNom)),GXutil.URLEncode(GXutil.ltrimstr(AV55BarColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV56BarPie,6,0)),GXutil.URLEncode(DecimalUtil.decToString(AV49BarKgm)),GXutil.URLEncode(DecimalUtil.decToString(AV57BarMtr)),GXutil.URLEncode(GXutil.rtrim(AV58CliNom)),GXutil.URLEncode(GXutil.rtrim(AV59BarSerDsc)),GXutil.URLEncode(GXutil.rtrim(AV60BarAgrEst))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","Discod","BarSit","BarExt","CliCod","Barunimed","Barpes","BarSer","PedidoCliente","BarColNom","BarColNum","BarPie","BarKgm","BarMtr","CliNom","BarSerDsc","BarAgrEst"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV25Discod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A130BarCodPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBAREXT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV27BarExt), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSIT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV26BarSit), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARUNIMED", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV50Barunimed, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPES", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV51Barpes), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSERDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV59BarSerDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARAGREST", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV60BarAgrEst, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPLANING", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV33Planing), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCARVEMA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV34Carvema), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTINAMAR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV35Tinamar), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCTRLUSU", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV36CtrlUsu), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV48CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSER", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV52BarSer, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPEDIDOCLIENTE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV53PedidoCliente, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV54BarColNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNUM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV55BarColNum), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPIE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV56BarPie), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARKGM", getSecureSignedToken( "", localUtil.format( AV49BarKgm, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARMTR", getSecureSignedToken( "", localUtil.format( AV57BarMtr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLINOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV58CliNom, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"HojadeRuta__Procesos");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV66Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("pedidosclientesindetalle\\hojaderuta__procesos:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_122", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_122, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV19DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV19DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROCOD", GXutil.rtrim( AV15TFProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROCOD_SEL", GXutil.rtrim( AV16TFProCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRODSC", GXutil.rtrim( AV17TFProDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRODSC_SEL", GXutil.rtrim( AV18TFProDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROFASEST", GXutil.ltrim( localUtil.ntoc( AV40TFProFasEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROFASEST_TO", GXutil.ltrim( localUtil.ntoc( AV41TFProFasEst_To, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vDISCOD", GXutil.ltrim( localUtil.ntoc( AV25Discod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV25Discod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODPAR", GXutil.rtrim( A130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A130BarCodPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBAREXT", GXutil.ltrim( localUtil.ntoc( AV27BarExt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBAREXT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV27BarExt), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARSIT", GXutil.ltrim( localUtil.ntoc( AV26BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSIT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV26BarSit), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARUNIMED", GXutil.rtrim( AV50Barunimed));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARUNIMED", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV50Barunimed, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPES", GXutil.ltrim( localUtil.ntoc( AV51Barpes, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPES", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV51Barpes), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARSERDSC", GXutil.rtrim( AV59BarSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSERDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV59BarSerDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARAGREST", GXutil.rtrim( AV60BarAgrEst));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARAGREST", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV60BarAgrEst, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV30UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV28Station));
      app.GxWebStd.gx_hidden_field( httpContext, "vPLANING", GXutil.ltrim( localUtil.ntoc( AV33Planing, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPLANING", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV33Planing), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCARVEMA", GXutil.ltrim( localUtil.ntoc( AV34Carvema, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCARVEMA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV34Carvema), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTINAMAR", GXutil.ltrim( localUtil.ntoc( AV35Tinamar, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTINAMAR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV35Tinamar), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCTRLUSU", GXutil.ltrim( localUtil.ntoc( AV36CtrlUsu, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCTRLUSU", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV36CtrlUsu), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEXISBARPRO", GXutil.ltrim( localUtil.ntoc( AV46ExisBarpro, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARPROCESO_Title", GXutil.rtrim( Dvelop_confirmpanel_eliminarproceso_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARPROCESO_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_eliminarproceso_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARPROCESO_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminarproceso_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARPROCESO_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminarproceso_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARPROCESO_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminarproceso_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARPROCESO_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_eliminarproceso_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARPROCESO_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_eliminarproceso_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Title", GXutil.rtrim( Dvelop_confirmpanel_enter_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_enter_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_enter_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_enter_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Fixedcolumns", GXutil.rtrim( Grid_empowerer_Fixedcolumns));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARPROCESO_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminarproceso_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Result", GXutil.rtrim( Dvelop_confirmpanel_enter_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARPROCESO_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminarproceso_Result));
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
         we24E2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt24E2( ) ;
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
      return formatLink("app.pedidosclientesindetalle.hojaderuta__procesos", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV37BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV38BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV39BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV25Discod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV26BarSit,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV27BarExt,1,0)),GXutil.URLEncode(GXutil.ltrimstr(AV48CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV50Barunimed)),GXutil.URLEncode(GXutil.ltrimstr(AV51Barpes,4,0)),GXutil.URLEncode(GXutil.rtrim(AV52BarSer)),GXutil.URLEncode(GXutil.rtrim(AV53PedidoCliente)),GXutil.URLEncode(GXutil.rtrim(AV54BarColNom)),GXutil.URLEncode(GXutil.ltrimstr(AV55BarColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV56BarPie,6,0)),GXutil.URLEncode(DecimalUtil.decToString(AV49BarKgm)),GXutil.URLEncode(DecimalUtil.decToString(AV57BarMtr)),GXutil.URLEncode(GXutil.rtrim(AV58CliNom)),GXutil.URLEncode(GXutil.rtrim(AV59BarSerDsc)),GXutil.URLEncode(GXutil.rtrim(AV60BarAgrEst))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","Discod","BarSit","BarExt","CliCod","Barunimed","Barpes","BarSer","PedidoCliente","BarColNom","BarColNum","BarPie","BarKgm","BarMtr","CliNom","BarSerDsc","BarAgrEst"})  ;
   }

   public String getPgmname( )
   {
      return "PedidosClienteSinDetalle.HojadeRuta__Procesos" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Procesos Produccion", "") ;
   }

   public void wb24E0( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcod_Internalname, httpContext.getMessage( "Nº Hdr", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV37BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV37BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV37BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__Procesos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodreo_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodreo_Internalname, httpContext.getMessage( "R", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodreo_Internalname, GXutil.ltrim( localUtil.ntoc( AV38BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcodreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV38BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(AV38BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodreo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodreo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__Procesos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodpar_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodpar_Internalname, httpContext.getMessage( "P", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodpar_Internalname, GXutil.rtrim( AV39BarCodPar), GXutil.rtrim( localUtil.format( AV39BarCodPar, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodpar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodpar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__Procesos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClicod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClicod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV48CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV48CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV48CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__Procesos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClinom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClinom_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClinom_Internalname, GXutil.rtrim( AV58CliNom), GXutil.rtrim( localUtil.format( AV58CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClinom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClinom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__Procesos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPedidocliente_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPedidocliente_Internalname, httpContext.getMessage( "Pedido Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPedidocliente_Internalname, GXutil.rtrim( AV53PedidoCliente), GXutil.rtrim( localUtil.format( AV53PedidoCliente, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPedidocliente_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPedidocliente_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__Procesos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavVar_agrupacion_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'" + sGXsfl_122_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavVar_agrupacion_Internalname, GXutil.rtrim( AV61Var_agrupacion), GXutil.rtrim( localUtil.format( AV61Var_agrupacion, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavVar_agrupacion_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavVar_agrupacion_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__Procesos.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarser_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarser_Internalname, httpContext.getMessage( "Articulo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarser_Internalname, GXutil.rtrim( AV52BarSer), GXutil.rtrim( localUtil.format( AV52BarSer, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarser_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarser_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__Procesos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnom_Internalname, httpContext.getMessage( "Color", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnom_Internalname, GXutil.rtrim( AV54BarColNom), GXutil.rtrim( localUtil.format( AV54BarColNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__Procesos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnum_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnum_Internalname, httpContext.getMessage( "Numero", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnum_Internalname, GXutil.ltrim( localUtil.ntoc( AV55BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcolnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV55BarColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV55BarColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__Procesos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarpie_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarpie_Internalname, httpContext.getMessage( "Piezas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarpie_Internalname, GXutil.ltrim( localUtil.ntoc( AV56BarPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarpie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV56BarPie), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV56BarPie), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarpie_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarpie_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__Procesos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarkgm_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarkgm_Internalname, httpContext.getMessage( "Kilos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarkgm_Internalname, GXutil.ltrim( localUtil.ntoc( AV49BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarkgm_Enabled!=0) ? localUtil.format( AV49BarKgm, "ZZZZZ9.99") : localUtil.format( AV49BarKgm, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarkgm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarkgm_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__Procesos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarmtr_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarmtr_Internalname, httpContext.getMessage( "Metros", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarmtr_Internalname, GXutil.ltrim( localUtil.ntoc( AV57BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarmtr_Enabled!=0) ? localUtil.format( AV57BarMtr, "ZZZZZ9.99") : localUtil.format( AV57BarMtr, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarmtr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarmtr_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__Procesos.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divTableheader_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedprocod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockprocod_Internalname, httpContext.getMessage( "Proceso", ""), "", "", lblTextblockprocod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_PedidosClienteSinDetalle\\HojadeRuta__Procesos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table1_96_24E2( true) ;
      }
      else
      {
         wb_table1_96_24E2( false) ;
      }
      return  ;
   }

   public void wb_table1_96_24E2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-10", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavProdsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavProdsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'" + sGXsfl_122_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavProdsc_Internalname, GXutil.rtrim( AV62ProDsc), GXutil.rtrim( localUtil.format( AV62ProDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavProdsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavProdsc_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__Procesos.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "gx.evt.setGridEvt("+GXutil.str( 122, 3, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_PedidosClienteSinDetalle\\HojadeRuta__Procesos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 122, 3, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_PedidosClienteSinDetalle\\HojadeRuta__Procesos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
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
         app.GxWebStd.gx_label_ctrl( httpContext, lblTbmessage_Internalname, lblTbmessage_Caption, "", "", lblTbmessage_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextDanger", 0, "", 1, 1, 0, (short)(0), "HLP_PedidosClienteSinDetalle\\HojadeRuta__Procesos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell CellMarginTop HasGridEmpowerer", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol122( ) ;
      }
      if ( wbEnd == 122 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_122 = (int)(nGXsfl_122_idx-1) ;
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV66Pgmname), GXutil.rtrim( localUtil.format( AV66Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__Procesos.htm");
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
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV19DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         wb_table2_139_24E2( true) ;
      }
      else
      {
         wb_table2_139_24E2( false) ;
      }
      return  ;
   }

   public void wb_table2_139_24E2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table3_144_24E2( true) ;
      }
      else
      {
         wb_table3_144_24E2( false) ;
      }
      return  ;
   }

   public void wb_table3_144_24E2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 122 )
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

   public void start24E2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Procesos Produccion", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup24E0( ) ;
   }

   public void ws24E2( )
   {
      start24E2( ) ;
      evt24E2( ) ;
   }

   public void evt24E2( )
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
                           e1124E2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINARPROCESO.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1224E2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ENTER.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1324E2 ();
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
                                 e1424E2 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e1524E2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VPROCOD.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1624E2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           AV67Pedidosclientesindetalle_hojaderuta__procesosds_1_tfprocod = AV15TFProCod ;
                           AV68Pedidosclientesindetalle_hojaderuta__procesosds_2_tfprocod_sel = AV16TFProCod_Sel ;
                           AV69Pedidosclientesindetalle_hojaderuta__procesosds_3_tfprodsc = AV17TFProDsc ;
                           AV70Pedidosclientesindetalle_hojaderuta__procesosds_4_tfprodsc_sel = AV18TFProDsc_Sel ;
                           AV71Pedidosclientesindetalle_hojaderuta__procesosds_5_tfprofasest = AV40TFProFasEst ;
                           AV72Pedidosclientesindetalle_hojaderuta__procesosds_6_tfprofasest_to = AV41TFProFasEst_To ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 18), "VGRIDACTIONS.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 18), "VGRIDACTIONS.CLICK") == 0 ) )
                        {
                           nGXsfl_122_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_122_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_122_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_1222( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV42GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42GridActions), 4, 0));
                           A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
                           A759ProDsc = httpContext.cgiGet( edtProDsc_Internalname) ;
                           A760ProFasEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtProFasEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n760ProFasEst = false ;
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTdislin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTdislin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTDISLIN");
                              GX_FocusControl = edtavTdislin_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV32Tdislin = (byte)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavTdislin_Internalname, GXutil.str( AV32Tdislin, 1, 0));
                           }
                           else
                           {
                              AV32Tdislin = (byte)(localUtil.ctol( httpContext.cgiGet( edtavTdislin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavTdislin_Internalname, GXutil.str( AV32Tdislin, 1, 0));
                           }
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e1724E2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e1824E2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e1924E2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONS.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e2024E2 ();
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

   public void we24E2( )
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

   public void pa24E2( )
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
            GX_FocusControl = edtavVar_agrupacion_Internalname ;
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
      subsflControlProps_1222( ) ;
      while ( nGXsfl_122_idx <= nRC_GXsfl_122 )
      {
         sendrow_1222( ) ;
         nGXsfl_122_idx = ((subGrid_Islastpage==1)&&(nGXsfl_122_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_122_idx+1) ;
         sGXsfl_122_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_122_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1222( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 int AV37BarCod ,
                                 byte AV38BarCodReo ,
                                 String AV39BarCodPar ,
                                 String A396EmprCod ,
                                 String AV15TFProCod ,
                                 String AV16TFProCod_Sel ,
                                 String AV17TFProDsc ,
                                 String AV18TFProDsc_Sel ,
                                 byte AV40TFProFasEst ,
                                 byte AV41TFProFasEst_To ,
                                 String AV66Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 int AV25Discod ,
                                 byte AV27BarExt ,
                                 byte AV26BarSit ,
                                 String AV50Barunimed ,
                                 short AV51Barpes ,
                                 String AV59BarSerDsc ,
                                 String AV60BarAgrEst ,
                                 short AV33Planing ,
                                 short AV34Carvema ,
                                 short AV35Tinamar ,
                                 short AV36CtrlUsu ,
                                 int A129BarCod ,
                                 byte A132BarCodReo ,
                                 String A130BarCodPar ,
                                 int AV48CliCod ,
                                 String AV52BarSer ,
                                 String AV53PedidoCliente ,
                                 String AV54BarColNom ,
                                 int AV55BarColNum ,
                                 int AV56BarPie ,
                                 java.math.BigDecimal AV49BarKgm ,
                                 java.math.BigDecimal AV57BarMtr ,
                                 String AV58CliNom )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e1824E2 ();
      GRID_nCurrentRecord = 0 ;
      rf24E2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"HojadeRuta__Procesos");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV66Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("pedidosclientesindetalle\\hojaderuta__procesos:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf24E2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV66Pgmname = "PedidosClienteSinDetalle.HojadeRuta__Procesos" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66Pgmname", AV66Pgmname);
      Gx_err = (short)(0) ;
      edtavBarcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcod_Enabled), 5, 0), true);
      edtavBarcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodreo_Enabled), 5, 0), true);
      edtavBarcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodpar_Enabled), 5, 0), true);
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), true);
      edtavPedidocliente_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPedidocliente_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPedidocliente_Enabled), 5, 0), true);
      edtavVar_agrupacion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavVar_agrupacion_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavVar_agrupacion_Enabled), 5, 0), true);
      edtavBarser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarser_Enabled), 5, 0), true);
      edtavBarcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnom_Enabled), 5, 0), true);
      edtavBarcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnum_Enabled), 5, 0), true);
      edtavBarpie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarpie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarpie_Enabled), 5, 0), true);
      edtavBarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgm_Enabled), 5, 0), true);
      edtavBarmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarmtr_Enabled), 5, 0), true);
      edtavProdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavProdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavProdsc_Enabled), 5, 0), true);
      edtavTdislin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTdislin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTdislin_Enabled), 5, 0), !bGXsfl_122_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      imgPrompt_procod_Link = "javascript:"+"gx.popup.openPrompt('"+"app.ficherosbasicos.tprocesprompt"+"',["+"{Ctrl:gx.dom.el('"+"EMPRCOD"+"'), id:'"+"EMPRCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vPROCOD"+"'), id:'"+"vPROCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vPRODSC"+"'), id:'"+"vPRODSC"+"'"+",IOType:'inout'}"+"],"+"null"+","+"'', false"+","+"false"+");" ;
      httpContext.ajax_rsp_assign_prop("", false, imgPrompt_procod_Internalname, "Link", imgPrompt_procod_Link, true);
      imgPrompt_procod_Link = "javascript:"+"gx.popup.openPrompt('"+"app.ficherosbasicos.tprocesprompt"+"',["+"{Ctrl:gx.dom.el('"+"EMPRCOD"+"'), id:'"+"EMPRCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vPROCOD"+"'), id:'"+"vPROCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vPRODSC"+"'), id:'"+"vPRODSC"+"'"+",IOType:'inout'}"+"],"+"null"+","+"'', false"+","+"false"+");" ;
      httpContext.ajax_rsp_assign_prop("", false, imgPrompt_procod_Internalname, "Link", imgPrompt_procod_Link, true);
   }

   public void rf24E2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(122) ;
      /* Execute user event: Refresh */
      e1824E2 ();
      nGXsfl_122_idx = 1 ;
      sGXsfl_122_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_122_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1222( ) ;
      bGXsfl_122_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridNoBorder WorkWithSelection WorkWith");
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
         subsflControlProps_1222( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV68Pedidosclientesindetalle_hojaderuta__procesosds_2_tfprocod_sel ,
                                              AV67Pedidosclientesindetalle_hojaderuta__procesosds_1_tfprocod ,
                                              AV70Pedidosclientesindetalle_hojaderuta__procesosds_4_tfprodsc_sel ,
                                              AV69Pedidosclientesindetalle_hojaderuta__procesosds_3_tfprodsc ,
                                              A758ProCod ,
                                              A759ProDsc ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              Byte.valueOf(AV71Pedidosclientesindetalle_hojaderuta__procesosds_5_tfprofasest) ,
                                              Byte.valueOf(A760ProFasEst) ,
                                              Byte.valueOf(AV72Pedidosclientesindetalle_hojaderuta__procesosds_6_tfprofasest_to) ,
                                              A396EmprCod ,
                                              Integer.valueOf(AV37BarCod) ,
                                              Byte.valueOf(AV38BarCodReo) ,
                                              AV39BarCodPar ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE,
                                              TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                              }
         });
         lV67Pedidosclientesindetalle_hojaderuta__procesosds_1_tfprocod = GXutil.padr( GXutil.rtrim( AV67Pedidosclientesindetalle_hojaderuta__procesosds_1_tfprocod), 8, "%") ;
         lV69Pedidosclientesindetalle_hojaderuta__procesosds_3_tfprodsc = GXutil.padr( GXutil.rtrim( AV69Pedidosclientesindetalle_hojaderuta__procesosds_3_tfprodsc), 40, "%") ;
         /* Using cursor H024E3 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV37BarCod), Byte.valueOf(AV38BarCodReo), AV39BarCodPar, Byte.valueOf(AV71Pedidosclientesindetalle_hojaderuta__procesosds_5_tfprofasest), Byte.valueOf(AV71Pedidosclientesindetalle_hojaderuta__procesosds_5_tfprofasest), Byte.valueOf(AV72Pedidosclientesindetalle_hojaderuta__procesosds_6_tfprofasest_to), Byte.valueOf(AV72Pedidosclientesindetalle_hojaderuta__procesosds_6_tfprofasest_to), lV67Pedidosclientesindetalle_hojaderuta__procesosds_1_tfprocod, AV68Pedidosclientesindetalle_hojaderuta__procesosds_2_tfprocod_sel, lV69Pedidosclientesindetalle_hojaderuta__procesosds_3_tfprodsc, AV70Pedidosclientesindetalle_hojaderuta__procesosds_4_tfprodsc_sel, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_122_idx = 1 ;
         sGXsfl_122_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_122_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1222( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A130BarCodPar = H024E3_A130BarCodPar[0] ;
            A132BarCodReo = H024E3_A132BarCodReo[0] ;
            A129BarCod = H024E3_A129BarCod[0] ;
            A759ProDsc = H024E3_A759ProDsc[0] ;
            A758ProCod = H024E3_A758ProCod[0] ;
            A760ProFasEst = H024E3_A760ProFasEst[0] ;
            n760ProFasEst = H024E3_n760ProFasEst[0] ;
            A759ProDsc = H024E3_A759ProDsc[0] ;
            A760ProFasEst = H024E3_A760ProFasEst[0] ;
            n760ProFasEst = H024E3_n760ProFasEst[0] ;
            e1924E2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(122) ;
         wb24E0( ) ;
      }
      bGXsfl_122_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes24E2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vDISCOD", GXutil.ltrim( localUtil.ntoc( AV25Discod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV25Discod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODPAR", GXutil.rtrim( A130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A130BarCodPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBAREXT", GXutil.ltrim( localUtil.ntoc( AV27BarExt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBAREXT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV27BarExt), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARSIT", GXutil.ltrim( localUtil.ntoc( AV26BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSIT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV26BarSit), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARUNIMED", GXutil.rtrim( AV50Barunimed));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARUNIMED", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV50Barunimed, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPES", GXutil.ltrim( localUtil.ntoc( AV51Barpes, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPES", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV51Barpes), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARSERDSC", GXutil.rtrim( AV59BarSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSERDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV59BarSerDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARAGREST", GXutil.rtrim( AV60BarAgrEst));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARAGREST", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV60BarAgrEst, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPLANING", GXutil.ltrim( localUtil.ntoc( AV33Planing, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPLANING", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV33Planing), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCARVEMA", GXutil.ltrim( localUtil.ntoc( AV34Carvema, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCARVEMA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV34Carvema), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTINAMAR", GXutil.ltrim( localUtil.ntoc( AV35Tinamar, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTINAMAR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV35Tinamar), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCTRLUSU", GXutil.ltrim( localUtil.ntoc( AV36CtrlUsu, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCTRLUSU", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV36CtrlUsu), "ZZZ9")));
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
      AV67Pedidosclientesindetalle_hojaderuta__procesosds_1_tfprocod = AV15TFProCod ;
      AV68Pedidosclientesindetalle_hojaderuta__procesosds_2_tfprocod_sel = AV16TFProCod_Sel ;
      AV69Pedidosclientesindetalle_hojaderuta__procesosds_3_tfprodsc = AV17TFProDsc ;
      AV70Pedidosclientesindetalle_hojaderuta__procesosds_4_tfprodsc_sel = AV18TFProDsc_Sel ;
      AV71Pedidosclientesindetalle_hojaderuta__procesosds_5_tfprofasest = AV40TFProFasEst ;
      AV72Pedidosclientesindetalle_hojaderuta__procesosds_6_tfprofasest_to = AV41TFProFasEst_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV68Pedidosclientesindetalle_hojaderuta__procesosds_2_tfprocod_sel ,
                                           AV67Pedidosclientesindetalle_hojaderuta__procesosds_1_tfprocod ,
                                           AV70Pedidosclientesindetalle_hojaderuta__procesosds_4_tfprodsc_sel ,
                                           AV69Pedidosclientesindetalle_hojaderuta__procesosds_3_tfprodsc ,
                                           A758ProCod ,
                                           A759ProDsc ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           Byte.valueOf(AV71Pedidosclientesindetalle_hojaderuta__procesosds_5_tfprofasest) ,
                                           Byte.valueOf(A760ProFasEst) ,
                                           Byte.valueOf(AV72Pedidosclientesindetalle_hojaderuta__procesosds_6_tfprofasest_to) ,
                                           A396EmprCod ,
                                           Integer.valueOf(AV37BarCod) ,
                                           Byte.valueOf(AV38BarCodReo) ,
                                           AV39BarCodPar ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV67Pedidosclientesindetalle_hojaderuta__procesosds_1_tfprocod = GXutil.padr( GXutil.rtrim( AV67Pedidosclientesindetalle_hojaderuta__procesosds_1_tfprocod), 8, "%") ;
      lV69Pedidosclientesindetalle_hojaderuta__procesosds_3_tfprodsc = GXutil.padr( GXutil.rtrim( AV69Pedidosclientesindetalle_hojaderuta__procesosds_3_tfprodsc), 40, "%") ;
      /* Using cursor H024E5 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV37BarCod), Byte.valueOf(AV38BarCodReo), AV39BarCodPar, Byte.valueOf(AV71Pedidosclientesindetalle_hojaderuta__procesosds_5_tfprofasest), Byte.valueOf(AV71Pedidosclientesindetalle_hojaderuta__procesosds_5_tfprofasest), Byte.valueOf(AV72Pedidosclientesindetalle_hojaderuta__procesosds_6_tfprofasest_to), Byte.valueOf(AV72Pedidosclientesindetalle_hojaderuta__procesosds_6_tfprofasest_to), lV67Pedidosclientesindetalle_hojaderuta__procesosds_1_tfprocod, AV68Pedidosclientesindetalle_hojaderuta__procesosds_2_tfprocod_sel, lV69Pedidosclientesindetalle_hojaderuta__procesosds_3_tfprodsc, AV70Pedidosclientesindetalle_hojaderuta__procesosds_4_tfprodsc_sel});
      GRID_nRecordCount = H024E5_AGRID_nRecordCount[0] ;
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
      AV67Pedidosclientesindetalle_hojaderuta__procesosds_1_tfprocod = AV15TFProCod ;
      AV68Pedidosclientesindetalle_hojaderuta__procesosds_2_tfprocod_sel = AV16TFProCod_Sel ;
      AV69Pedidosclientesindetalle_hojaderuta__procesosds_3_tfprodsc = AV17TFProDsc ;
      AV70Pedidosclientesindetalle_hojaderuta__procesosds_4_tfprodsc_sel = AV18TFProDsc_Sel ;
      AV71Pedidosclientesindetalle_hojaderuta__procesosds_5_tfprofasest = AV40TFProFasEst ;
      AV72Pedidosclientesindetalle_hojaderuta__procesosds_6_tfprofasest_to = AV41TFProFasEst_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV37BarCod, AV38BarCodReo, AV39BarCodPar, A396EmprCod, AV15TFProCod, AV16TFProCod_Sel, AV17TFProDsc, AV18TFProDsc_Sel, AV40TFProFasEst, AV41TFProFasEst_To, AV66Pgmname, AV12OrderedBy, AV13OrderedDsc, AV25Discod, AV27BarExt, AV26BarSit, AV50Barunimed, AV51Barpes, AV59BarSerDsc, AV60BarAgrEst, AV33Planing, AV34Carvema, AV35Tinamar, AV36CtrlUsu, A129BarCod, A132BarCodReo, A130BarCodPar, AV48CliCod, AV52BarSer, AV53PedidoCliente, AV54BarColNom, AV55BarColNum, AV56BarPie, AV49BarKgm, AV57BarMtr, AV58CliNom) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV67Pedidosclientesindetalle_hojaderuta__procesosds_1_tfprocod = AV15TFProCod ;
      AV68Pedidosclientesindetalle_hojaderuta__procesosds_2_tfprocod_sel = AV16TFProCod_Sel ;
      AV69Pedidosclientesindetalle_hojaderuta__procesosds_3_tfprodsc = AV17TFProDsc ;
      AV70Pedidosclientesindetalle_hojaderuta__procesosds_4_tfprodsc_sel = AV18TFProDsc_Sel ;
      AV71Pedidosclientesindetalle_hojaderuta__procesosds_5_tfprofasest = AV40TFProFasEst ;
      AV72Pedidosclientesindetalle_hojaderuta__procesosds_6_tfprofasest_to = AV41TFProFasEst_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV37BarCod, AV38BarCodReo, AV39BarCodPar, A396EmprCod, AV15TFProCod, AV16TFProCod_Sel, AV17TFProDsc, AV18TFProDsc_Sel, AV40TFProFasEst, AV41TFProFasEst_To, AV66Pgmname, AV12OrderedBy, AV13OrderedDsc, AV25Discod, AV27BarExt, AV26BarSit, AV50Barunimed, AV51Barpes, AV59BarSerDsc, AV60BarAgrEst, AV33Planing, AV34Carvema, AV35Tinamar, AV36CtrlUsu, A129BarCod, A132BarCodReo, A130BarCodPar, AV48CliCod, AV52BarSer, AV53PedidoCliente, AV54BarColNom, AV55BarColNum, AV56BarPie, AV49BarKgm, AV57BarMtr, AV58CliNom) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV67Pedidosclientesindetalle_hojaderuta__procesosds_1_tfprocod = AV15TFProCod ;
      AV68Pedidosclientesindetalle_hojaderuta__procesosds_2_tfprocod_sel = AV16TFProCod_Sel ;
      AV69Pedidosclientesindetalle_hojaderuta__procesosds_3_tfprodsc = AV17TFProDsc ;
      AV70Pedidosclientesindetalle_hojaderuta__procesosds_4_tfprodsc_sel = AV18TFProDsc_Sel ;
      AV71Pedidosclientesindetalle_hojaderuta__procesosds_5_tfprofasest = AV40TFProFasEst ;
      AV72Pedidosclientesindetalle_hojaderuta__procesosds_6_tfprofasest_to = AV41TFProFasEst_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV37BarCod, AV38BarCodReo, AV39BarCodPar, A396EmprCod, AV15TFProCod, AV16TFProCod_Sel, AV17TFProDsc, AV18TFProDsc_Sel, AV40TFProFasEst, AV41TFProFasEst_To, AV66Pgmname, AV12OrderedBy, AV13OrderedDsc, AV25Discod, AV27BarExt, AV26BarSit, AV50Barunimed, AV51Barpes, AV59BarSerDsc, AV60BarAgrEst, AV33Planing, AV34Carvema, AV35Tinamar, AV36CtrlUsu, A129BarCod, A132BarCodReo, A130BarCodPar, AV48CliCod, AV52BarSer, AV53PedidoCliente, AV54BarColNom, AV55BarColNum, AV56BarPie, AV49BarKgm, AV57BarMtr, AV58CliNom) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV67Pedidosclientesindetalle_hojaderuta__procesosds_1_tfprocod = AV15TFProCod ;
      AV68Pedidosclientesindetalle_hojaderuta__procesosds_2_tfprocod_sel = AV16TFProCod_Sel ;
      AV69Pedidosclientesindetalle_hojaderuta__procesosds_3_tfprodsc = AV17TFProDsc ;
      AV70Pedidosclientesindetalle_hojaderuta__procesosds_4_tfprodsc_sel = AV18TFProDsc_Sel ;
      AV71Pedidosclientesindetalle_hojaderuta__procesosds_5_tfprofasest = AV40TFProFasEst ;
      AV72Pedidosclientesindetalle_hojaderuta__procesosds_6_tfprofasest_to = AV41TFProFasEst_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV37BarCod, AV38BarCodReo, AV39BarCodPar, A396EmprCod, AV15TFProCod, AV16TFProCod_Sel, AV17TFProDsc, AV18TFProDsc_Sel, AV40TFProFasEst, AV41TFProFasEst_To, AV66Pgmname, AV12OrderedBy, AV13OrderedDsc, AV25Discod, AV27BarExt, AV26BarSit, AV50Barunimed, AV51Barpes, AV59BarSerDsc, AV60BarAgrEst, AV33Planing, AV34Carvema, AV35Tinamar, AV36CtrlUsu, A129BarCod, A132BarCodReo, A130BarCodPar, AV48CliCod, AV52BarSer, AV53PedidoCliente, AV54BarColNom, AV55BarColNum, AV56BarPie, AV49BarKgm, AV57BarMtr, AV58CliNom) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV67Pedidosclientesindetalle_hojaderuta__procesosds_1_tfprocod = AV15TFProCod ;
      AV68Pedidosclientesindetalle_hojaderuta__procesosds_2_tfprocod_sel = AV16TFProCod_Sel ;
      AV69Pedidosclientesindetalle_hojaderuta__procesosds_3_tfprodsc = AV17TFProDsc ;
      AV70Pedidosclientesindetalle_hojaderuta__procesosds_4_tfprodsc_sel = AV18TFProDsc_Sel ;
      AV71Pedidosclientesindetalle_hojaderuta__procesosds_5_tfprofasest = AV40TFProFasEst ;
      AV72Pedidosclientesindetalle_hojaderuta__procesosds_6_tfprofasest_to = AV41TFProFasEst_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV37BarCod, AV38BarCodReo, AV39BarCodPar, A396EmprCod, AV15TFProCod, AV16TFProCod_Sel, AV17TFProDsc, AV18TFProDsc_Sel, AV40TFProFasEst, AV41TFProFasEst_To, AV66Pgmname, AV12OrderedBy, AV13OrderedDsc, AV25Discod, AV27BarExt, AV26BarSit, AV50Barunimed, AV51Barpes, AV59BarSerDsc, AV60BarAgrEst, AV33Planing, AV34Carvema, AV35Tinamar, AV36CtrlUsu, A129BarCod, A132BarCodReo, A130BarCodPar, AV48CliCod, AV52BarSer, AV53PedidoCliente, AV54BarColNom, AV55BarColNum, AV56BarPie, AV49BarKgm, AV57BarMtr, AV58CliNom) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV66Pgmname = "PedidosClienteSinDetalle.HojadeRuta__Procesos" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66Pgmname", AV66Pgmname);
      Gx_err = (short)(0) ;
      edtavBarcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcod_Enabled), 5, 0), true);
      edtavBarcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodreo_Enabled), 5, 0), true);
      edtavBarcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodpar_Enabled), 5, 0), true);
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), true);
      edtavPedidocliente_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPedidocliente_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPedidocliente_Enabled), 5, 0), true);
      edtavVar_agrupacion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavVar_agrupacion_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavVar_agrupacion_Enabled), 5, 0), true);
      edtavBarser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarser_Enabled), 5, 0), true);
      edtavBarcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnom_Enabled), 5, 0), true);
      edtavBarcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnum_Enabled), 5, 0), true);
      edtavBarpie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarpie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarpie_Enabled), 5, 0), true);
      edtavBarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgm_Enabled), 5, 0), true);
      edtavBarmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarmtr_Enabled), 5, 0), true);
      edtavProdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavProdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavProdsc_Enabled), 5, 0), true);
      edtavTdislin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTdislin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTdislin_Enabled), 5, 0), !bGXsfl_122_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      imgPrompt_procod_Link = "javascript:"+"gx.popup.openPrompt('"+"app.ficherosbasicos.tprocesprompt"+"',["+"{Ctrl:gx.dom.el('"+"EMPRCOD"+"'), id:'"+"EMPRCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vPROCOD"+"'), id:'"+"vPROCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vPRODSC"+"'), id:'"+"vPRODSC"+"'"+",IOType:'inout'}"+"],"+"null"+","+"'', false"+","+"false"+");" ;
      httpContext.ajax_rsp_assign_prop("", false, imgPrompt_procod_Internalname, "Link", imgPrompt_procod_Link, true);
      imgPrompt_procod_Link = "javascript:"+"gx.popup.openPrompt('"+"app.ficherosbasicos.tprocesprompt"+"',["+"{Ctrl:gx.dom.el('"+"EMPRCOD"+"'), id:'"+"EMPRCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vPROCOD"+"'), id:'"+"vPROCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vPRODSC"+"'), id:'"+"vPRODSC"+"'"+",IOType:'inout'}"+"],"+"null"+","+"'', false"+","+"false"+");" ;
      httpContext.ajax_rsp_assign_prop("", false, imgPrompt_procod_Internalname, "Link", imgPrompt_procod_Link, true);
      fix_multi_value_controls( ) ;
   }

   public void strup24E0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1724E2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV19DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_122 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_122"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         Dvelop_confirmpanel_eliminarproceso_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARPROCESO_Title") ;
         Dvelop_confirmpanel_eliminarproceso_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARPROCESO_Confirmationtext") ;
         Dvelop_confirmpanel_eliminarproceso_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARPROCESO_Yesbuttoncaption") ;
         Dvelop_confirmpanel_eliminarproceso_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARPROCESO_Nobuttoncaption") ;
         Dvelop_confirmpanel_eliminarproceso_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARPROCESO_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_eliminarproceso_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARPROCESO_Yesbuttonposition") ;
         Dvelop_confirmpanel_eliminarproceso_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARPROCESO_Confirmtype") ;
         Dvelop_confirmpanel_enter_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Title") ;
         Dvelop_confirmpanel_enter_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Confirmationtext") ;
         Dvelop_confirmpanel_enter_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Yesbuttoncaption") ;
         Dvelop_confirmpanel_enter_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Nobuttoncaption") ;
         Dvelop_confirmpanel_enter_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_enter_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Yesbuttonposition") ;
         Dvelop_confirmpanel_enter_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Confirmtype") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Fixedcolumns = httpContext.cgiGet( "GRID_EMPOWERER_Fixedcolumns") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Ddo_grid_Activeeventkey = httpContext.cgiGet( "DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( "DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( "DDO_GRID_Selectedcolumn") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( "DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( "DDO_GRID_Filteredtextto_get") ;
         Dvelop_confirmpanel_eliminarproceso_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARPROCESO_Result") ;
         Dvelop_confirmpanel_enter_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Result") ;
         /* Read variables values. */
         AV61Var_agrupacion = httpContext.cgiGet( edtavVar_agrupacion_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV61Var_agrupacion", AV61Var_agrupacion);
         AV43ProCod = httpContext.cgiGet( edtavProcod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV43ProCod", AV43ProCod);
         AV62ProDsc = httpContext.cgiGet( edtavProdsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV62ProDsc", AV62ProDsc);
         AV66Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV66Pgmname", AV66Pgmname);
         /* Read subfile selected row values. */
         nGXsfl_122_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_122_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_122_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1222( ) ;
         if ( nGXsfl_122_idx > 0 )
         {
            cmbavGridactions.setName( cmbavGridactions.getInternalname() );
            cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
            AV42GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42GridActions), 4, 0));
            A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
            A759ProDsc = httpContext.cgiGet( edtProDsc_Internalname) ;
            A760ProFasEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtProFasEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n760ProFasEst = false ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTdislin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTdislin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTDISLIN");
               GX_FocusControl = edtavTdislin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV32Tdislin = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavTdislin_Internalname, GXutil.str( AV32Tdislin, 1, 0));
            }
            else
            {
               AV32Tdislin = (byte)(localUtil.ctol( httpContext.cgiGet( edtavTdislin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavTdislin_Internalname, GXutil.str( AV32Tdislin, 1, 0));
            }
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"HojadeRuta__Procesos");
         AV66Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV66Pgmname", AV66Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV66Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("pedidosclientesindetalle\\hojaderuta__procesos:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e1724E2 ();
      if (returnInSub) return;
   }

   public void e1724E2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV28Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      hojaderuta__procesos_impl.this.GXt_char1 = GXv_char2[0] ;
      AV28Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Station", AV28Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV29EmprNom ;
      GXv_char4[0] = AV30UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV28Station, GXv_char2, GXv_char3, GXv_char4) ;
      hojaderuta__procesos_impl.this.A396EmprCod = GXv_char2[0] ;
      hojaderuta__procesos_impl.this.AV29EmprNom = GXv_char3[0] ;
      hojaderuta__procesos_impl.this.AV30UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV30UsurCod", AV30UsurCod);
      GXt_int5 = (byte)(AV33Planing) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PLANNC", ""), GXv_int6) ;
      hojaderuta__procesos_impl.this.GXt_int5 = GXv_int6[0] ;
      AV33Planing = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Planing", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Planing), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPLANING", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV33Planing), "ZZZ9")));
      GXt_int5 = (byte)(AV34Carvema) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CARVEM", ""), GXv_int6) ;
      hojaderuta__procesos_impl.this.GXt_int5 = GXv_int6[0] ;
      AV34Carvema = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Carvema", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Carvema), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCARVEMA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV34Carvema), "ZZZ9")));
      GXt_int5 = (byte)(AV35Tinamar) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TINAMA", ""), GXv_int6) ;
      hojaderuta__procesos_impl.this.GXt_int5 = GXv_int6[0] ;
      AV35Tinamar = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Tinamar", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35Tinamar), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTINAMAR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV35Tinamar), "ZZZ9")));
      GXt_int5 = (byte)(AV36CtrlUsu) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CTRLOS", ""), GXv_int6) ;
      hojaderuta__procesos_impl.this.GXt_int5 = GXv_int6[0] ;
      AV36CtrlUsu = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36CtrlUsu", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36CtrlUsu), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCTRLUSU", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV36CtrlUsu), "ZZZ9")));
      AV61Var_agrupacion = ((GXutil.strcmp(AV60BarAgrEst, "S")==0) ? httpContext.getMessage( "Nº Hoja de Ruta, AGRUPADA ¡¡¡", "") : "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61Var_agrupacion", AV61Var_agrupacion);
      if ( GXutil.strcmp(AV60BarAgrEst, "S") == 0 )
      {
         httpContext.GX_msglist.addItem(AV61Var_agrupacion);
      }
      GXt_char1 = AV28Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      hojaderuta__procesos_impl.this.GXt_char1 = GXv_char4[0] ;
      AV28Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Station", AV28Station);
      GXv_char4[0] = AV31EmprCod ;
      GXv_char3[0] = AV29EmprNom ;
      GXv_char2[0] = AV30UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV28Station, GXv_char4, GXv_char3, GXv_char2) ;
      hojaderuta__procesos_impl.this.AV31EmprCod = GXv_char4[0] ;
      hojaderuta__procesos_impl.this.AV29EmprNom = GXv_char3[0] ;
      hojaderuta__procesos_impl.this.AV30UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30UsurCod", AV30UsurCod);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( "Procesos Produccion", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      if ( AV12OrderedBy < 1 )
      {
         AV12OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = AV19DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] ;
      AV19DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
   }

   public void e1824E2( )
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
      cmbavGridactions.setColumnHeaderClass( "WWActionGroupColumn" );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Columnheaderclass", cmbavGridactions.getColumnHeaderClass(), !bGXsfl_122_Refreshing);
      edtProCod_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Columnheaderclass", edtProCod_Columnheaderclass, !bGXsfl_122_Refreshing);
      edtProDsc_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtProDsc_Internalname, "Columnheaderclass", edtProDsc_Columnheaderclass, !bGXsfl_122_Refreshing);
      edtProFasEst_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtProFasEst_Internalname, "Columnheaderclass", edtProFasEst_Columnheaderclass, !bGXsfl_122_Refreshing);
      AV67Pedidosclientesindetalle_hojaderuta__procesosds_1_tfprocod = AV15TFProCod ;
      AV68Pedidosclientesindetalle_hojaderuta__procesosds_2_tfprocod_sel = AV16TFProCod_Sel ;
      AV69Pedidosclientesindetalle_hojaderuta__procesosds_3_tfprodsc = AV17TFProDsc ;
      AV70Pedidosclientesindetalle_hojaderuta__procesosds_4_tfprodsc_sel = AV18TFProDsc_Sel ;
      AV71Pedidosclientesindetalle_hojaderuta__procesosds_5_tfprofasest = AV40TFProFasEst ;
      AV72Pedidosclientesindetalle_hojaderuta__procesosds_6_tfprofasest_to = AV41TFProFasEst_To ;
      /*  Sending Event outputs  */
   }

   public void e1124E2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV12OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         AV13OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProCod") == 0 )
         {
            AV15TFProCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15TFProCod", AV15TFProCod);
            AV16TFProCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16TFProCod_Sel", AV16TFProCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProDsc") == 0 )
         {
            AV17TFProDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17TFProDsc", AV17TFProDsc);
            AV18TFProDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18TFProDsc_Sel", AV18TFProDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProFasEst") == 0 )
         {
            AV40TFProFasEst = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFProFasEst", GXutil.str( AV40TFProFasEst, 1, 0));
            AV41TFProFasEst_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFProFasEst_To", GXutil.str( AV41TFProFasEst_To, 1, 0));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e1924E2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGridactions.removeAllItems();
      cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
      if ( 1 == 0 )
      {
         cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "Fases", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      }
      cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "Fases v02", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("3", GXutil.format( "%1;%2", httpContext.getMessage( "Eliminar Proceso", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      GXt_int5 = AV32Tdislin ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int10[0] = AV25Discod ;
      GXv_char3[0] = A758ProCod ;
      GXv_int6[0] = GXt_int5 ;
      new app.pdislin(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_char3, GXv_int6) ;
      hojaderuta__procesos_impl.this.A396EmprCod = GXv_char4[0] ;
      hojaderuta__procesos_impl.this.AV25Discod = GXv_int10[0] ;
      hojaderuta__procesos_impl.this.A758ProCod = GXv_char3[0] ;
      hojaderuta__procesos_impl.this.GXt_int5 = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV25Discod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25Discod), 8, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV25Discod), "ZZZZZZZ9")));
      AV32Tdislin = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, edtavTdislin_Internalname, GXutil.str( AV32Tdislin, 1, 0));
      if ( A760ProFasEst == 1 )
      {
         cmbavGridactions.setColumnClass( "WWActionGroupColumn WWColumnWarning WWColumnWarningFirstColumn" );
         edtProCod_Columnclass = "WWColumn WWColumnWarning" ;
         edtProDsc_Columnclass = "WWColumn WWColumnWarning" ;
         edtProFasEst_Columnclass = "WWColumn WWColumnWarning" ;
      }
      else if ( A760ProFasEst == 2 )
      {
         cmbavGridactions.setColumnClass( "WWActionGroupColumn WWColumnSuccess WWColumnSuccessFirstColumn" );
         edtProCod_Columnclass = "WWColumn WWColumnSuccess" ;
         edtProDsc_Columnclass = "WWColumn WWColumnSuccess" ;
         edtProFasEst_Columnclass = "WWColumn WWColumnSuccess" ;
      }
      else
      {
         cmbavGridactions.setColumnClass( httpContext.getMessage( "WWActionGroupColumn", "") );
         edtProCod_Columnclass = httpContext.getMessage( "WWColumn", "") ;
         edtProDsc_Columnclass = httpContext.getMessage( "WWColumn", "") ;
         edtProFasEst_Columnclass = httpContext.getMessage( "WWColumn", "") ;
      }
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(122) ;
      }
      sendrow_1222( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_122_Refreshing )
      {
         httpContext.doAjaxLoad(122, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV42GridActions, 4, 0)) );
   }

   public void e2024E2( )
   {
      /* Gridactions_Click Routine */
      returnInSub = false ;
      if ( AV42GridActions == 1 )
      {
         /* Execute user subroutine: 'DO FASES' */
         S152 ();
         if (returnInSub) return;
      }
      else if ( AV42GridActions == 2 )
      {
         /* Execute user subroutine: 'DO FASESV02' */
         S162 ();
         if (returnInSub) return;
      }
      else if ( AV42GridActions == 3 )
      {
         /* Execute user subroutine: 'DO ELIMINARPROCESO' */
         S172 ();
         if (returnInSub) return;
      }
      AV42GridActions = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42GridActions), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV42GridActions, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), true);
   }

   public void e1224E2( )
   {
      /* Dvelop_confirmpanel_eliminarproceso_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_eliminarproceso_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMINARPROCESO' */
         S182 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e1424E2 ();
      if (returnInSub) return;
   }

   public void e1424E2( )
   {
      /* Enter Routine */
      returnInSub = false ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int10[0] = AV37BarCod ;
      GXv_int6[0] = AV38BarCodReo ;
      GXv_char3[0] = AV39BarCodPar ;
      GXv_char2[0] = AV43ProCod ;
      GXv_int11[0] = (byte)(AV46ExisBarpro) ;
      new app.pprofs10(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_int6, GXv_char3, GXv_char2, GXv_int11) ;
      hojaderuta__procesos_impl.this.A396EmprCod = GXv_char4[0] ;
      hojaderuta__procesos_impl.this.AV37BarCod = GXv_int10[0] ;
      hojaderuta__procesos_impl.this.AV38BarCodReo = GXv_int6[0] ;
      hojaderuta__procesos_impl.this.AV39BarCodPar = GXv_char3[0] ;
      hojaderuta__procesos_impl.this.AV43ProCod = GXv_char2[0] ;
      hojaderuta__procesos_impl.this.AV46ExisBarpro = GXv_int11[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV37BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV38BarCodReo", GXutil.str( AV38BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV39BarCodPar", AV39BarCodPar);
      httpContext.ajax_rsp_assign_attri("", false, "AV43ProCod", AV43ProCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV46ExisBarpro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46ExisBarpro), 4, 0));
      GXv_char4[0] = AV62ProDsc ;
      GXv_char3[0] = AV63Proact ;
      new app.descripcionprocesoyactivo(remoteHandle, context).execute( A396EmprCod, AV43ProCod, GXv_char4, GXv_char3) ;
      hojaderuta__procesos_impl.this.AV62ProDsc = GXv_char4[0] ;
      hojaderuta__procesos_impl.this.AV63Proact = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62ProDsc", AV62ProDsc);
      lblTbmessage_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      if ( (GXutil.strcmp("", AV43ProCod)==0) )
      {
         GX_FocusControl = edtavProcod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
         httpContext.doAjaxRefresh();
         lblTbmessage_Caption = httpContext.getMessage( "Proceso no valido", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      }
      else
      {
         if ( GXutil.strcmp(AV63Proact, "I") == 0 )
         {
            GX_FocusControl = edtavProcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
            httpContext.doAjaxRefresh();
            lblTbmessage_Caption = httpContext.getMessage( "Proceso INACTIVO", "") ;
            httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
         }
         else
         {
            if ( AV46ExisBarpro == 1 )
            {
               GX_FocusControl = edtavProcod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               httpContext.doAjaxSetFocus(GX_FocusControl);
               httpContext.doAjaxRefresh();
               lblTbmessage_Caption = httpContext.getMessage( "Este Proceso ", "")+GXutil.trim( AV43ProCod)+httpContext.getMessage( ", YA existe", "") ;
               httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
            }
            else
            {
               Dvelop_confirmpanel_enter_Confirmationtext = httpContext.getMessage( "¿Desea agregar el proceso ", "")+GXutil.trim( AV43ProCod)+"?" ;
               ucDvelop_confirmpanel_enter.sendProperty(context, "", false, Dvelop_confirmpanel_enter_Internalname, "ConfirmationText", Dvelop_confirmpanel_enter_Confirmationtext);
               this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ENTERContainer", "Confirm", "", new Object[] {});
            }
         }
      }
      /*  Sending Event outputs  */
   }

   public void e1324E2( )
   {
      /* Dvelop_confirmpanel_enter_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_enter_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ENTER' */
         S192 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e1524E2( )
   {
      /* 'DoCerrar' Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S132( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV12OrderedBy, 4, 0))+":"+(AV13OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S152( )
   {
      /* 'DO FASES' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.pedidosclientesindetalle.hojaderuta_fases", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.rtrim(A758ProCod)),GXutil.URLEncode(GXutil.rtrim(A759ProDsc)),GXutil.URLEncode(GXutil.ltrimstr(AV27BarExt,1,0)),GXutil.URLEncode(GXutil.ltrimstr(AV25Discod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV26BarSit,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV48CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV50Barunimed)),GXutil.URLEncode(GXutil.ltrimstr(AV51Barpes,4,0)),GXutil.URLEncode(GXutil.rtrim(AV52BarSer)),GXutil.URLEncode(GXutil.rtrim(AV53PedidoCliente)),GXutil.URLEncode(GXutil.rtrim(AV54BarColNom)),GXutil.URLEncode(GXutil.ltrimstr(AV55BarColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV56BarPie,6,0)),GXutil.URLEncode(DecimalUtil.decToString(AV49BarKgm)),GXutil.URLEncode(DecimalUtil.decToString(AV57BarMtr)),GXutil.URLEncode(GXutil.rtrim(AV58CliNom)),GXutil.URLEncode(GXutil.rtrim(AV59BarSerDsc)),GXutil.URLEncode(GXutil.rtrim(AV60BarAgrEst))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","ProCod","Prodsc","BarExt","Discod","BarSit","CliCod","Barunimed","Barpes","BarSer","PedidoCliente","BarColNom","BarColNum","BarPie","BarKgm","BarMtr","CliNom","BarSerDsc","BarAgrest"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S162( )
   {
      /* 'DO FASESV02' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.pedidosclientesindetalle.hojaderuta__fases", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.rtrim(A758ProCod)),GXutil.URLEncode(GXutil.rtrim(A759ProDsc)),GXutil.URLEncode(GXutil.ltrimstr(AV27BarExt,1,0)),GXutil.URLEncode(GXutil.ltrimstr(AV25Discod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV26BarSit,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV48CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV50Barunimed)),GXutil.URLEncode(GXutil.ltrimstr(AV51Barpes,4,0)),GXutil.URLEncode(GXutil.rtrim(AV52BarSer)),GXutil.URLEncode(GXutil.rtrim(AV53PedidoCliente)),GXutil.URLEncode(GXutil.rtrim(AV54BarColNom)),GXutil.URLEncode(GXutil.ltrimstr(AV55BarColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV56BarPie,6,0)),GXutil.URLEncode(DecimalUtil.decToString(AV49BarKgm)),GXutil.URLEncode(DecimalUtil.decToString(AV57BarMtr)),GXutil.URLEncode(GXutil.rtrim(AV58CliNom)),GXutil.URLEncode(GXutil.rtrim(AV59BarSerDsc)),GXutil.URLEncode(GXutil.rtrim(AV60BarAgrEst))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","ProCod","ProDsc","BarExt","Discod","BarSit","Clicod","Barunimed","Barpes","barser","PedidoCliente","barcolnom","barcolnum","Barpie","BarKgm","Barmtr","CliNom","BarSerDsc","BarAgrest"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S172( )
   {
      /* 'DO ELIMINARPROCESO' Routine */
      returnInSub = false ;
      AV73Emprcod_selected = A396EmprCod ;
      AV74Barcod_selected = A129BarCod ;
      AV75Barcodreo_selected = A132BarCodReo ;
      AV76Barcodpar_selected = A130BarCodPar ;
      AV77Procod_selected = A758ProCod ;
      this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ELIMINARPROCESOContainer", "Confirm", "", new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S182( )
   {
      /* 'DO ACTION ELIMINARPROCESO' Routine */
      returnInSub = false ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int10[0] = AV37BarCod ;
      GXv_int11[0] = AV38BarCodReo ;
      GXv_char3[0] = AV39BarCodPar ;
      GXv_char2[0] = A758ProCod ;
      GXv_char12[0] = httpContext.getMessage( "DEL", "") ;
      new app.pprofs02(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_int11, GXv_char3, GXv_char2, GXv_char12) ;
      hojaderuta__procesos_impl.this.A396EmprCod = GXv_char4[0] ;
      hojaderuta__procesos_impl.this.AV37BarCod = GXv_int10[0] ;
      hojaderuta__procesos_impl.this.AV38BarCodReo = GXv_int11[0] ;
      hojaderuta__procesos_impl.this.AV39BarCodPar = GXv_char3[0] ;
      hojaderuta__procesos_impl.this.A758ProCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV37BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV38BarCodReo", GXutil.str( AV38BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV39BarCodPar", AV39BarCodPar);
      GXv_char12[0] = A396EmprCod ;
      GXv_int10[0] = AV37BarCod ;
      GXv_int11[0] = AV38BarCodReo ;
      GXv_char4[0] = AV39BarCodPar ;
      GXv_char3[0] = A758ProCod ;
      GXv_char2[0] = httpContext.getMessage( "DEL", "") ;
      new app.prenfas(remoteHandle, context).execute( GXv_char12, GXv_int10, GXv_int11, GXv_char4, GXv_char3, GXv_char2) ;
      hojaderuta__procesos_impl.this.A396EmprCod = GXv_char12[0] ;
      hojaderuta__procesos_impl.this.AV37BarCod = GXv_int10[0] ;
      hojaderuta__procesos_impl.this.AV38BarCodReo = GXv_int11[0] ;
      hojaderuta__procesos_impl.this.AV39BarCodPar = GXv_char4[0] ;
      hojaderuta__procesos_impl.this.A758ProCod = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV37BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV38BarCodReo", GXutil.str( AV38BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV39BarCodPar", AV39BarCodPar);
      new app.pcommit(remoteHandle, context).execute( ) ;
      AV47Inc_obs = httpContext.getMessage( "Baja Proceso= ", "") + A758ProCod + GXutil.newLine( ) ;
      new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV66Pgmname, AV30UsurCod, AV28Station, AV47Inc_obs, AV37BarCod, AV38BarCodReo, AV39BarCodPar) ;
      if ( AV33Planing == 1 )
      {
         GXv_char12[0] = A396EmprCod ;
         GXv_int10[0] = AV37BarCod ;
         GXv_int11[0] = AV38BarCodReo ;
         GXv_char4[0] = AV39BarCodPar ;
         new app.ppla005(remoteHandle, context).execute( GXv_char12, GXv_int10, GXv_int11, GXv_char4) ;
         hojaderuta__procesos_impl.this.A396EmprCod = GXv_char12[0] ;
         hojaderuta__procesos_impl.this.AV37BarCod = GXv_int10[0] ;
         hojaderuta__procesos_impl.this.AV38BarCodReo = GXv_int11[0] ;
         hojaderuta__procesos_impl.this.AV39BarCodPar = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV37BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV38BarCodReo", GXutil.str( AV38BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV39BarCodPar", AV39BarCodPar);
      }
      if ( AV34Carvema == 1 )
      {
         GXv_char12[0] = A396EmprCod ;
         GXv_int10[0] = AV37BarCod ;
         GXv_int11[0] = AV38BarCodReo ;
         GXv_char4[0] = AV39BarCodPar ;
         GXv_char3[0] = AV30UsurCod ;
         GXv_char2[0] = AV28Station ;
         new app.pultfasfteo(remoteHandle, context).execute( GXv_char12, GXv_int10, GXv_int11, GXv_char4, GXv_char3, GXv_char2) ;
         hojaderuta__procesos_impl.this.A396EmprCod = GXv_char12[0] ;
         hojaderuta__procesos_impl.this.AV37BarCod = GXv_int10[0] ;
         hojaderuta__procesos_impl.this.AV38BarCodReo = GXv_int11[0] ;
         hojaderuta__procesos_impl.this.AV39BarCodPar = GXv_char4[0] ;
         hojaderuta__procesos_impl.this.AV30UsurCod = GXv_char3[0] ;
         hojaderuta__procesos_impl.this.AV28Station = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV37BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV38BarCodReo", GXutil.str( AV38BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV39BarCodPar", AV39BarCodPar);
         httpContext.ajax_rsp_assign_attri("", false, "AV30UsurCod", AV30UsurCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV28Station", AV28Station);
      }
      if ( ( AV35Tinamar == 1 ) || ( AV36CtrlUsu == 1 ) )
      {
         GXv_char12[0] = A396EmprCod ;
         GXv_int10[0] = AV37BarCod ;
         GXv_int11[0] = AV38BarCodReo ;
         GXv_char4[0] = AV39BarCodPar ;
         GXv_char3[0] = AV30UsurCod ;
         new app.pctrusu(remoteHandle, context).execute( GXv_char12, GXv_int10, GXv_int11, GXv_char4, GXv_char3) ;
         hojaderuta__procesos_impl.this.A396EmprCod = GXv_char12[0] ;
         hojaderuta__procesos_impl.this.AV37BarCod = GXv_int10[0] ;
         hojaderuta__procesos_impl.this.AV38BarCodReo = GXv_int11[0] ;
         hojaderuta__procesos_impl.this.AV39BarCodPar = GXv_char4[0] ;
         hojaderuta__procesos_impl.this.AV30UsurCod = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV37BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV38BarCodReo", GXutil.str( AV38BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV39BarCodPar", AV39BarCodPar);
         httpContext.ajax_rsp_assign_attri("", false, "AV30UsurCod", AV30UsurCod);
      }
      httpContext.doAjaxRefresh();
   }

   public void S192( )
   {
      /* 'DO ACTION ENTER' Routine */
      returnInSub = false ;
      GXv_char12[0] = A396EmprCod ;
      GXv_int10[0] = AV37BarCod ;
      GXv_int11[0] = AV38BarCodReo ;
      GXv_char4[0] = AV39BarCodPar ;
      GXv_char3[0] = AV43ProCod ;
      GXv_int6[0] = (byte)(AV46ExisBarpro) ;
      new app.pprofs10(remoteHandle, context).execute( GXv_char12, GXv_int10, GXv_int11, GXv_char4, GXv_char3, GXv_int6) ;
      hojaderuta__procesos_impl.this.A396EmprCod = GXv_char12[0] ;
      hojaderuta__procesos_impl.this.AV37BarCod = GXv_int10[0] ;
      hojaderuta__procesos_impl.this.AV38BarCodReo = GXv_int11[0] ;
      hojaderuta__procesos_impl.this.AV39BarCodPar = GXv_char4[0] ;
      hojaderuta__procesos_impl.this.AV43ProCod = GXv_char3[0] ;
      hojaderuta__procesos_impl.this.AV46ExisBarpro = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV37BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV38BarCodReo", GXutil.str( AV38BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV39BarCodPar", AV39BarCodPar);
      httpContext.ajax_rsp_assign_attri("", false, "AV43ProCod", AV43ProCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV46ExisBarpro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46ExisBarpro), 4, 0));
      GXv_char12[0] = A396EmprCod ;
      GXv_int10[0] = AV37BarCod ;
      GXv_int11[0] = AV38BarCodReo ;
      GXv_char4[0] = AV39BarCodPar ;
      GXv_char3[0] = AV43ProCod ;
      new app.pprofs00(remoteHandle, context).execute( GXv_char12, GXv_int10, GXv_int11, GXv_char4, GXv_char3) ;
      hojaderuta__procesos_impl.this.A396EmprCod = GXv_char12[0] ;
      hojaderuta__procesos_impl.this.AV37BarCod = GXv_int10[0] ;
      hojaderuta__procesos_impl.this.AV38BarCodReo = GXv_int11[0] ;
      hojaderuta__procesos_impl.this.AV39BarCodPar = GXv_char4[0] ;
      hojaderuta__procesos_impl.this.AV43ProCod = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV37BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV38BarCodReo", GXutil.str( AV38BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV39BarCodPar", AV39BarCodPar);
      httpContext.ajax_rsp_assign_attri("", false, "AV43ProCod", AV43ProCod);
      GXv_char12[0] = A396EmprCod ;
      GXv_int10[0] = AV37BarCod ;
      GXv_int11[0] = AV38BarCodReo ;
      GXv_char4[0] = AV39BarCodPar ;
      GXv_char3[0] = AV43ProCod ;
      new app.pprofs01(remoteHandle, context).execute( GXv_char12, GXv_int10, GXv_int11, GXv_char4, GXv_char3) ;
      hojaderuta__procesos_impl.this.A396EmprCod = GXv_char12[0] ;
      hojaderuta__procesos_impl.this.AV37BarCod = GXv_int10[0] ;
      hojaderuta__procesos_impl.this.AV38BarCodReo = GXv_int11[0] ;
      hojaderuta__procesos_impl.this.AV39BarCodPar = GXv_char4[0] ;
      hojaderuta__procesos_impl.this.AV43ProCod = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV37BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV38BarCodReo", GXutil.str( AV38BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV39BarCodPar", AV39BarCodPar);
      httpContext.ajax_rsp_assign_attri("", false, "AV43ProCod", AV43ProCod);
      GXv_char12[0] = A396EmprCod ;
      GXv_int10[0] = AV37BarCod ;
      GXv_int11[0] = AV38BarCodReo ;
      GXv_char4[0] = AV39BarCodPar ;
      GXv_char3[0] = "        " ;
      GXv_char2[0] = httpContext.getMessage( "INS", "") ;
      new app.prenfas(remoteHandle, context).execute( GXv_char12, GXv_int10, GXv_int11, GXv_char4, GXv_char3, GXv_char2) ;
      hojaderuta__procesos_impl.this.A396EmprCod = GXv_char12[0] ;
      hojaderuta__procesos_impl.this.AV37BarCod = GXv_int10[0] ;
      hojaderuta__procesos_impl.this.AV38BarCodReo = GXv_int11[0] ;
      hojaderuta__procesos_impl.this.AV39BarCodPar = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV37BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV38BarCodReo", GXutil.str( AV38BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV39BarCodPar", AV39BarCodPar);
      new app.pcommit(remoteHandle, context).execute( ) ;
      AV47Inc_obs = httpContext.getMessage( "Alta Proceso= ", "") + AV43ProCod + GXutil.newLine( ) ;
      new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV66Pgmname, AV30UsurCod, AV28Station, AV47Inc_obs, AV37BarCod, AV38BarCodReo, AV39BarCodPar) ;
      AV43ProCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43ProCod", AV43ProCod);
      httpContext.doAjaxRefresh();
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV14Session.getValue(AV66Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV66Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV14Session.getValue(AV66Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S132 ();
      if (returnInSub) return;
      AV78GXV1 = 1 ;
      while ( AV78GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV78GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCOD") == 0 )
         {
            AV15TFProCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15TFProCod", AV15TFProCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCOD_SEL") == 0 )
         {
            AV16TFProCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16TFProCod_Sel", AV16TFProCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRODSC") == 0 )
         {
            AV17TFProDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17TFProDsc", AV17TFProDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRODSC_SEL") == 0 )
         {
            AV18TFProDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18TFProDsc_Sel", AV18TFProDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFASEST") == 0 )
         {
            AV40TFProFasEst = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFProFasEst", GXutil.str( AV40TFProFasEst, 1, 0));
            AV41TFProFasEst_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFProFasEst_To", GXutil.str( AV41TFProFasEst_To, 1, 0));
         }
         AV78GXV1 = (int)(AV78GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char12[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV16TFProCod_Sel)==0), AV16TFProCod_Sel, GXv_char12) ;
      hojaderuta__procesos_impl.this.GXt_char1 = GXv_char12[0] ;
      GXt_char13 = "" ;
      GXv_char4[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV18TFProDsc_Sel)==0), AV18TFProDsc_Sel, GXv_char4) ;
      hojaderuta__procesos_impl.this.GXt_char13 = GXv_char4[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"|"+GXt_char13+"|" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char13 = "" ;
      GXv_char12[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV15TFProCod)==0), AV15TFProCod, GXv_char12) ;
      hojaderuta__procesos_impl.this.GXt_char13 = GXv_char12[0] ;
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV17TFProDsc)==0), AV17TFProDsc, GXv_char4) ;
      hojaderuta__procesos_impl.this.GXt_char1 = GXv_char4[0] ;
      Ddo_grid_Filteredtext_set = GXt_char13+"|"+GXt_char1+"|"+((0==AV40TFProFasEst) ? "" : GXutil.str( AV40TFProFasEst, 1, 0)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "||"+((0==AV41TFProFasEst_To) ? "" : GXutil.str( AV41TFProFasEst_To, 1, 0)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S142( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV14Session.getValue(AV66Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFPROCOD", "", !(GXutil.strcmp("", AV15TFProCod)==0), (short)(0), AV15TFProCod, "", !(GXutil.strcmp("", AV16TFProCod_Sel)==0), AV16TFProCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFPRODSC", "", !(GXutil.strcmp("", AV17TFProDsc)==0), (short)(0), AV17TFProDsc, "", !(GXutil.strcmp("", AV18TFProDsc_Sel)==0), AV18TFProDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFPROFASEST", "", !((0==AV40TFProFasEst)&&(0==AV41TFProFasEst_To)), (short)(0), GXutil.trim( GXutil.str( AV40TFProFasEst, 1, 0)), GXutil.trim( GXutil.str( AV41TFProFasEst_To, 1, 0))) ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV66Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV66Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "PedidosClienteSinDetalle.BARPRO" );
      AV14Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void e1624E2( )
   {
      /* Procod_Controlvaluechanged Routine */
      returnInSub = false ;
      lblTbmessage_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      GXv_char12[0] = AV62ProDsc ;
      GXv_char4[0] = AV63Proact ;
      new app.descripcionprocesoyactivo(remoteHandle, context).execute( A396EmprCod, AV43ProCod, GXv_char12, GXv_char4) ;
      hojaderuta__procesos_impl.this.AV62ProDsc = GXv_char12[0] ;
      hojaderuta__procesos_impl.this.AV63Proact = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62ProDsc", AV62ProDsc);
      if ( GXutil.strcmp(AV63Proact, "I") == 0 )
      {
         GX_FocusControl = edtavProcod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
         httpContext.doAjaxRefresh();
         lblTbmessage_Caption = httpContext.getMessage( "Proceso INACTIVO", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      }
      else
      {
         if ( GXutil.strcmp(AV62ProDsc, httpContext.getMessage( "No existe proceso", "")) == 0 )
         {
            GX_FocusControl = edtavProcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
            httpContext.doAjaxRefresh();
            lblTbmessage_Caption = httpContext.getMessage( "No existe proceso", "") ;
            httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
         }
      }
      /*  Sending Event outputs  */
   }

   public void wb_table3_144_24E2( boolean wbgen )
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
         wb_table3_144_24E2e( true) ;
      }
      else
      {
         wb_table3_144_24E2e( false) ;
      }
   }

   public void wb_table2_139_24E2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_eliminarproceso_Internalname, tblTabledvelop_confirmpanel_eliminarproceso_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_eliminarproceso.setProperty("Title", Dvelop_confirmpanel_eliminarproceso_Title);
         ucDvelop_confirmpanel_eliminarproceso.setProperty("ConfirmationText", Dvelop_confirmpanel_eliminarproceso_Confirmationtext);
         ucDvelop_confirmpanel_eliminarproceso.setProperty("YesButtonCaption", Dvelop_confirmpanel_eliminarproceso_Yesbuttoncaption);
         ucDvelop_confirmpanel_eliminarproceso.setProperty("NoButtonCaption", Dvelop_confirmpanel_eliminarproceso_Nobuttoncaption);
         ucDvelop_confirmpanel_eliminarproceso.setProperty("CancelButtonCaption", Dvelop_confirmpanel_eliminarproceso_Cancelbuttoncaption);
         ucDvelop_confirmpanel_eliminarproceso.setProperty("YesButtonPosition", Dvelop_confirmpanel_eliminarproceso_Yesbuttonposition);
         ucDvelop_confirmpanel_eliminarproceso.setProperty("ConfirmType", Dvelop_confirmpanel_eliminarproceso_Confirmtype);
         ucDvelop_confirmpanel_eliminarproceso.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_eliminarproceso_Internalname, "DVELOP_CONFIRMPANEL_ELIMINARPROCESOContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_ELIMINARPROCESOContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_139_24E2e( true) ;
      }
      else
      {
         wb_table2_139_24E2e( false) ;
      }
   }

   public void wb_table1_96_24E2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedprocod_Internalname, tblTablemergedprocod_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavProcod_Internalname, httpContext.getMessage( "Pro Cod", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 100,'',false,'" + sGXsfl_122_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavProcod_Internalname, GXutil.rtrim( AV43ProCod), GXutil.rtrim( localUtil.format( AV43ProCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,100);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavProcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavProcod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__Procesos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Static images/pictures */
         ClassString = "Image" + " " + ((GXutil.strcmp(imgPrompt_procod_gximage, "")==0) ? "GX_Image_prompt_Class" : "GX_Image_"+imgPrompt_procod_gximage+"_Class") ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
         app.GxWebStd.gx_bitmap( httpContext, imgPrompt_procod_Internalname, sImgUrl, imgPrompt_procod_Link, "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", " "+"data-gx-image"+" ", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_PedidosClienteSinDetalle\\HojadeRuta__Procesos.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_96_24E2e( true) ;
      }
      else
      {
         wb_table1_96_24E2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      A396EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      AV37BarCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37BarCod), 8, 0));
      AV38BarCodReo = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38BarCodReo", GXutil.str( AV38BarCodReo, 1, 0));
      AV39BarCodPar = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39BarCodPar", AV39BarCodPar);
      AV25Discod = ((Number) GXutil.testNumericType( getParm(obj,4), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Discod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25Discod), 8, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV25Discod), "ZZZZZZZ9")));
      AV26BarSit = ((Number) GXutil.testNumericType( getParm(obj,5), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26BarSit), 2, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSIT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV26BarSit), "Z9")));
      AV27BarExt = ((Number) GXutil.testNumericType( getParm(obj,6), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27BarExt", GXutil.str( AV27BarExt, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBAREXT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV27BarExt), "9")));
      AV48CliCod = ((Number) GXutil.testNumericType( getParm(obj,7), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48CliCod), 6, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV48CliCod), "ZZZZZ9")));
      AV50Barunimed = (String)getParm(obj,8) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50Barunimed", AV50Barunimed);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARUNIMED", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV50Barunimed, "@!"))));
      AV51Barpes = ((Number) GXutil.testNumericType( getParm(obj,9), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51Barpes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51Barpes), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPES", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV51Barpes), "ZZZ9")));
      AV52BarSer = (String)getParm(obj,10) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52BarSer", AV52BarSer);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSER", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV52BarSer, ""))));
      AV53PedidoCliente = (String)getParm(obj,11) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53PedidoCliente", AV53PedidoCliente);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPEDIDOCLIENTE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV53PedidoCliente, ""))));
      AV54BarColNom = (String)getParm(obj,12) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54BarColNom", AV54BarColNom);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV54BarColNom, ""))));
      AV55BarColNum = ((Number) GXutil.testNumericType( getParm(obj,13), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55BarColNum), 6, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNUM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV55BarColNum), "ZZZZZ9")));
      AV56BarPie = ((Number) GXutil.testNumericType( getParm(obj,14), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56BarPie), 6, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPIE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV56BarPie), "ZZZZZ9")));
      AV49BarKgm = (java.math.BigDecimal)getParm(obj,15) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49BarKgm", GXutil.ltrimstr( AV49BarKgm, 9, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARKGM", getSecureSignedToken( "", localUtil.format( AV49BarKgm, "ZZZZZ9.99")));
      AV57BarMtr = (java.math.BigDecimal)getParm(obj,16) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57BarMtr", GXutil.ltrimstr( AV57BarMtr, 9, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARMTR", getSecureSignedToken( "", localUtil.format( AV57BarMtr, "ZZZZZ9.99")));
      AV58CliNom = (String)getParm(obj,17) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58CliNom", AV58CliNom);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLINOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV58CliNom, ""))));
      AV59BarSerDsc = (String)getParm(obj,18) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59BarSerDsc", AV59BarSerDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSERDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV59BarSerDsc, ""))));
      AV60BarAgrEst = (String)getParm(obj,19) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60BarAgrEst", AV60BarAgrEst);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARAGREST", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV60BarAgrEst, "@!"))));
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
      pa24E2( ) ;
      ws24E2( ) ;
      we24E2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116144834", true, true);
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
      httpContext.AddJavascriptSource("pedidosclientesindetalle/hojaderuta__procesos.js", "?202682116144834", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_1222( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_122_idx );
      edtProCod_Internalname = "PROCOD_"+sGXsfl_122_idx ;
      edtProDsc_Internalname = "PRODSC_"+sGXsfl_122_idx ;
      edtProFasEst_Internalname = "PROFASEST_"+sGXsfl_122_idx ;
      edtavTdislin_Internalname = "vTDISLIN_"+sGXsfl_122_idx ;
   }

   public void subsflControlProps_fel_1222( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_122_fel_idx );
      edtProCod_Internalname = "PROCOD_"+sGXsfl_122_fel_idx ;
      edtProDsc_Internalname = "PRODSC_"+sGXsfl_122_fel_idx ;
      edtProFasEst_Internalname = "PROFASEST_"+sGXsfl_122_fel_idx ;
      edtavTdislin_Internalname = "vTDISLIN_"+sGXsfl_122_fel_idx ;
   }

   public void sendrow_1222( )
   {
      subsflControlProps_1222( ) ;
      wb24E0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_122_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_122_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"GridNoBorder WorkWithSelection WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_122_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 123,'',false,'"+sGXsfl_122_idx+"',122)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_122_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV42GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV42GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV42GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRIDACTIONS.CLICK."+sGXsfl_122_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO",cmbavGridactions.getColumnClass(),cmbavGridactions.getColumnHeaderClass(),TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,123);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV42GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_122_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProCod_Internalname,GXutil.rtrim( A758ProCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtProCod_Columnclass,edtProCod_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(122),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProDsc_Internalname,GXutil.rtrim( A759ProDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtProDsc_Columnclass,edtProDsc_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(122),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProFasEst_Internalname,GXutil.ltrim( localUtil.ntoc( A760ProFasEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A760ProFasEst), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProFasEst_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtProFasEst_Columnclass,edtProFasEst_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(122),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavTdislin_Enabled!=0)&&(edtavTdislin_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 127,'',false,'"+sGXsfl_122_idx+"',122)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTdislin_Internalname,GXutil.ltrim( localUtil.ntoc( AV32Tdislin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavTdislin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV32Tdislin), "9") : localUtil.format( DecimalUtil.doubleToDec(AV32Tdislin), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavTdislin_Enabled!=0)&&(edtavTdislin_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,127);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTdislin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavTdislin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(122),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes24E2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_122_idx = ((subGrid_Islastpage==1)&&(nGXsfl_122_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_122_idx+1) ;
         sGXsfl_122_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_122_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1222( ) ;
      }
      /* End function sendrow_1222 */
   }

   public void startgridcontrol122( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"122\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridNoBorder WorkWithSelection WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Proceso", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Estado", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tdislin", "")) ;
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
         GridContainer.AddObjectProperty("Class", "GridNoBorder WorkWithSelection WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV42GridActions, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( cmbavGridactions.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( cmbavGridactions.getColumnHeaderClass()));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A758ProCod));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtProCod_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtProCod_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A759ProDsc));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtProDsc_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtProDsc_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A760ProFasEst, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtProFasEst_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtProFasEst_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV32Tdislin, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTdislin_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtavBarcod_Internalname = "vBARCOD" ;
      edtavBarcodreo_Internalname = "vBARCODREO" ;
      edtavBarcodpar_Internalname = "vBARCODPAR" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      edtavClicod_Internalname = "vCLICOD" ;
      edtavClinom_Internalname = "vCLINOM" ;
      edtavPedidocliente_Internalname = "vPEDIDOCLIENTE" ;
      edtavVar_agrupacion_Internalname = "vVAR_AGRUPACION" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      edtavBarser_Internalname = "vBARSER" ;
      edtavBarcolnom_Internalname = "vBARCOLNOM" ;
      edtavBarcolnum_Internalname = "vBARCOLNUM" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      edtavBarpie_Internalname = "vBARPIE" ;
      edtavBarkgm_Internalname = "vBARKGM" ;
      edtavBarmtr_Internalname = "vBARMTR" ;
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      lblTextblockprocod_Internalname = "TEXTBLOCKPROCOD" ;
      edtavProcod_Internalname = "vPROCOD" ;
      imgPrompt_procod_Internalname = "PROMPT_PROCOD" ;
      tblTablemergedprocod_Internalname = "TABLEMERGEDPROCOD" ;
      divTablesplittedprocod_Internalname = "TABLESPLITTEDPROCOD" ;
      edtavProdsc_Internalname = "vPRODSC" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      lblTbmessage_Internalname = "TBMESSAGE" ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS" );
      edtProCod_Internalname = "PROCOD" ;
      edtProDsc_Internalname = "PRODSC" ;
      edtProFasEst_Internalname = "PROFASEST" ;
      edtavTdislin_Internalname = "vTDISLIN" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Dvelop_confirmpanel_eliminarproceso_Internalname = "DVELOP_CONFIRMPANEL_ELIMINARPROCESO" ;
      tblTabledvelop_confirmpanel_eliminarproceso_Internalname = "TABLEDVELOP_CONFIRMPANEL_ELIMINARPROCESO" ;
      Dvelop_confirmpanel_enter_Internalname = "DVELOP_CONFIRMPANEL_ENTER" ;
      tblTabledvelop_confirmpanel_enter_Internalname = "TABLEDVELOP_CONFIRMPANEL_ENTER" ;
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
      subGrid_Allowhovering = (byte)(-1) ;
      subGrid_Allowselection = (byte)(1) ;
      subGrid_Header = "" ;
      edtavTdislin_Jsonclick = "" ;
      edtavTdislin_Visible = 0 ;
      edtavTdislin_Enabled = 1 ;
      edtProFasEst_Jsonclick = "" ;
      edtProFasEst_Columnclass = "WWColumn" ;
      edtProDsc_Jsonclick = "" ;
      edtProDsc_Columnclass = "WWColumn" ;
      edtProCod_Jsonclick = "" ;
      edtProCod_Columnclass = "WWColumn" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      cmbavGridactions.setColumnClass( "WWActionGroupColumn" );
      subGrid_Class = "GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      imgPrompt_procod_Link = "" ;
      edtavProcod_Jsonclick = "" ;
      edtavProcod_Enabled = 1 ;
      edtProFasEst_Columnheaderclass = "" ;
      edtProDsc_Columnheaderclass = "" ;
      edtProCod_Columnheaderclass = "" ;
      cmbavGridactions.setColumnHeaderClass( "" );
      subGrid_Sortable = (byte)(0) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      lblTbmessage_Caption = "  " ;
      edtavProdsc_Jsonclick = "" ;
      edtavProdsc_Enabled = 1 ;
      edtavBarmtr_Jsonclick = "" ;
      edtavBarmtr_Enabled = 0 ;
      edtavBarkgm_Jsonclick = "" ;
      edtavBarkgm_Enabled = 0 ;
      edtavBarpie_Jsonclick = "" ;
      edtavBarpie_Enabled = 0 ;
      edtavBarcolnum_Jsonclick = "" ;
      edtavBarcolnum_Enabled = 0 ;
      edtavBarcolnom_Jsonclick = "" ;
      edtavBarcolnom_Enabled = 0 ;
      edtavBarser_Jsonclick = "" ;
      edtavBarser_Enabled = 0 ;
      edtavVar_agrupacion_Jsonclick = "" ;
      edtavVar_agrupacion_Enabled = 1 ;
      edtavPedidocliente_Jsonclick = "" ;
      edtavPedidocliente_Enabled = 0 ;
      edtavClinom_Jsonclick = "" ;
      edtavClinom_Enabled = 0 ;
      edtavClicod_Jsonclick = "" ;
      edtavClicod_Enabled = 0 ;
      edtavBarcodpar_Jsonclick = "" ;
      edtavBarcodpar_Enabled = 0 ;
      edtavBarcodreo_Jsonclick = "" ;
      edtavBarcodreo_Enabled = 0 ;
      edtavBarcod_Jsonclick = "" ;
      edtavBarcod_Enabled = 0 ;
      Grid_empowerer_Fixedcolumns = "L;;;;" ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Dvelop_confirmpanel_enter_Confirmtype = "1" ;
      Dvelop_confirmpanel_enter_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_enter_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_enter_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_enter_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_enter_Confirmationtext = "¿Confirma el Proceso?" ;
      Dvelop_confirmpanel_enter_Title = "" ;
      Dvelop_confirmpanel_eliminarproceso_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminarproceso_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminarproceso_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminarproceso_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminarproceso_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminarproceso_Confirmationtext = "¿Desea eliminar el Proceso?" ;
      Dvelop_confirmpanel_eliminarproceso_Title = "" ;
      Ddo_grid_Datalistproc = "PedidosClienteSinDetalle.HojadeRuta__ProcesosGetFilterData" ;
      Ddo_grid_Datalisttype = "Dynamic|Dynamic|" ;
      Ddo_grid_Includedatalist = "T|T|" ;
      Ddo_grid_Filterisrange = "||T" ;
      Ddo_grid_Filtertype = "Character|Character|Numeric" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Includesortasc = "T|T|" ;
      Ddo_grid_Columnssortvalues = "1|2|" ;
      Ddo_grid_Columnids = "1:ProCod|2:ProDsc|3:ProFasEst" ;
      Ddo_grid_Gridinternalname = "" ;
      Dvpanel_tableheader_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Iconposition = "Right" ;
      Dvpanel_tableheader_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_tableheader_Title = "" ;
      Dvpanel_tableheader_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tableheader_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tableheader_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Width = "100%" ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Informacion", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Procesos Produccion", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_122_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         AV42GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV42GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42GridActions), 4, 0));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV37BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV38BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV39BarCodPar',fld:'vBARCODPAR',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV15TFProCod',fld:'vTFPROCOD',pic:''},{av:'AV16TFProCod_Sel',fld:'vTFPROCOD_SEL',pic:''},{av:'AV17TFProDsc',fld:'vTFPRODSC',pic:''},{av:'AV18TFProDsc_Sel',fld:'vTFPRODSC_SEL',pic:''},{av:'AV40TFProFasEst',fld:'vTFPROFASEST',pic:'9'},{av:'AV41TFProFasEst_To',fld:'vTFPROFASEST_TO',pic:'9'},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV66Pgmname',fld:'vPGMNAME',pic:''},{av:'AV25Discod',fld:'vDISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV27BarExt',fld:'vBAREXT',pic:'9',hsh:true},{av:'AV26BarSit',fld:'vBARSIT',pic:'Z9',hsh:true},{av:'AV50Barunimed',fld:'vBARUNIMED',pic:'@!',hsh:true},{av:'AV51Barpes',fld:'vBARPES',pic:'ZZZ9',hsh:true},{av:'AV59BarSerDsc',fld:'vBARSERDSC',pic:'',hsh:true},{av:'AV60BarAgrEst',fld:'vBARAGREST',pic:'@!',hsh:true},{av:'AV33Planing',fld:'vPLANING',pic:'ZZZ9',hsh:true},{av:'AV34Carvema',fld:'vCARVEMA',pic:'ZZZ9',hsh:true},{av:'AV35Tinamar',fld:'vTINAMAR',pic:'ZZZ9',hsh:true},{av:'AV36CtrlUsu',fld:'vCTRLUSU',pic:'ZZZ9',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:'',hsh:true},{av:'AV48CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV52BarSer',fld:'vBARSER',pic:'',hsh:true},{av:'AV53PedidoCliente',fld:'vPEDIDOCLIENTE',pic:'',hsh:true},{av:'AV54BarColNom',fld:'vBARCOLNOM',pic:'',hsh:true},{av:'AV55BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'AV56BarPie',fld:'vBARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV49BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV57BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV58CliNom',fld:'vCLINOM',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'cmbavGridactions'},{av:'edtProCod_Columnheaderclass',ctrl:'PROCOD',prop:'Columnheaderclass'},{av:'edtProDsc_Columnheaderclass',ctrl:'PRODSC',prop:'Columnheaderclass'},{av:'edtProFasEst_Columnheaderclass',ctrl:'PROFASEST',prop:'Columnheaderclass'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e1124E2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV37BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV38BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV39BarCodPar',fld:'vBARCODPAR',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV15TFProCod',fld:'vTFPROCOD',pic:''},{av:'AV16TFProCod_Sel',fld:'vTFPROCOD_SEL',pic:''},{av:'AV17TFProDsc',fld:'vTFPRODSC',pic:''},{av:'AV18TFProDsc_Sel',fld:'vTFPRODSC_SEL',pic:''},{av:'AV40TFProFasEst',fld:'vTFPROFASEST',pic:'9'},{av:'AV41TFProFasEst_To',fld:'vTFPROFASEST_TO',pic:'9'},{av:'AV66Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV25Discod',fld:'vDISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV27BarExt',fld:'vBAREXT',pic:'9',hsh:true},{av:'AV26BarSit',fld:'vBARSIT',pic:'Z9',hsh:true},{av:'AV50Barunimed',fld:'vBARUNIMED',pic:'@!',hsh:true},{av:'AV51Barpes',fld:'vBARPES',pic:'ZZZ9',hsh:true},{av:'AV59BarSerDsc',fld:'vBARSERDSC',pic:'',hsh:true},{av:'AV60BarAgrEst',fld:'vBARAGREST',pic:'@!',hsh:true},{av:'AV33Planing',fld:'vPLANING',pic:'ZZZ9',hsh:true},{av:'AV34Carvema',fld:'vCARVEMA',pic:'ZZZ9',hsh:true},{av:'AV35Tinamar',fld:'vTINAMAR',pic:'ZZZ9',hsh:true},{av:'AV36CtrlUsu',fld:'vCTRLUSU',pic:'ZZZ9',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:'',hsh:true},{av:'AV48CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV52BarSer',fld:'vBARSER',pic:'',hsh:true},{av:'AV53PedidoCliente',fld:'vPEDIDOCLIENTE',pic:'',hsh:true},{av:'AV54BarColNom',fld:'vBARCOLNOM',pic:'',hsh:true},{av:'AV55BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'AV56BarPie',fld:'vBARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV49BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV57BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV58CliNom',fld:'vCLINOM',pic:'',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV15TFProCod',fld:'vTFPROCOD',pic:''},{av:'AV16TFProCod_Sel',fld:'vTFPROCOD_SEL',pic:''},{av:'AV17TFProDsc',fld:'vTFPRODSC',pic:''},{av:'AV18TFProDsc_Sel',fld:'vTFPRODSC_SEL',pic:''},{av:'AV40TFProFasEst',fld:'vTFPROFASEST',pic:'9'},{av:'AV41TFProFasEst_To',fld:'vTFPROFASEST_TO',pic:'9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e1924E2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV25Discod',fld:'vDISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A760ProFasEst',fld:'PROFASEST',pic:'9'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV42GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'AV32Tdislin',fld:'vTDISLIN',pic:'9'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'AV25Discod',fld:'vDISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'edtProCod_Columnclass',ctrl:'PROCOD',prop:'Columnclass'},{av:'edtProDsc_Columnclass',ctrl:'PRODSC',prop:'Columnclass'},{av:'edtProFasEst_Columnclass',ctrl:'PROFASEST',prop:'Columnclass'}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e2024E2',iparms:[{av:'cmbavGridactions'},{av:'AV42GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV37BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV38BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV39BarCodPar',fld:'vBARCODPAR',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV15TFProCod',fld:'vTFPROCOD',pic:''},{av:'AV16TFProCod_Sel',fld:'vTFPROCOD_SEL',pic:''},{av:'AV17TFProDsc',fld:'vTFPRODSC',pic:''},{av:'AV18TFProDsc_Sel',fld:'vTFPRODSC_SEL',pic:''},{av:'AV40TFProFasEst',fld:'vTFPROFASEST',pic:'9'},{av:'AV41TFProFasEst_To',fld:'vTFPROFASEST_TO',pic:'9'},{av:'AV66Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV25Discod',fld:'vDISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV27BarExt',fld:'vBAREXT',pic:'9',hsh:true},{av:'AV26BarSit',fld:'vBARSIT',pic:'Z9',hsh:true},{av:'AV50Barunimed',fld:'vBARUNIMED',pic:'@!',hsh:true},{av:'AV51Barpes',fld:'vBARPES',pic:'ZZZ9',hsh:true},{av:'AV59BarSerDsc',fld:'vBARSERDSC',pic:'',hsh:true},{av:'AV60BarAgrEst',fld:'vBARAGREST',pic:'@!',hsh:true},{av:'AV33Planing',fld:'vPLANING',pic:'ZZZ9',hsh:true},{av:'AV34Carvema',fld:'vCARVEMA',pic:'ZZZ9',hsh:true},{av:'AV35Tinamar',fld:'vTINAMAR',pic:'ZZZ9',hsh:true},{av:'AV36CtrlUsu',fld:'vCTRLUSU',pic:'ZZZ9',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:'',hsh:true},{av:'AV48CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV52BarSer',fld:'vBARSER',pic:'',hsh:true},{av:'AV53PedidoCliente',fld:'vPEDIDOCLIENTE',pic:'',hsh:true},{av:'AV54BarColNom',fld:'vBARCOLNOM',pic:'',hsh:true},{av:'AV55BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'AV56BarPie',fld:'vBARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV49BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV57BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV58CliNom',fld:'vCLINOM',pic:'',hsh:true},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A759ProDsc',fld:'PRODSC',pic:''}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV42GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'edtProCod_Columnheaderclass',ctrl:'PROCOD',prop:'Columnheaderclass'},{av:'edtProDsc_Columnheaderclass',ctrl:'PRODSC',prop:'Columnheaderclass'},{av:'edtProFasEst_Columnheaderclass',ctrl:'PROFASEST',prop:'Columnheaderclass'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINARPROCESO.CLOSE","{handler:'e1224E2',iparms:[{av:'Dvelop_confirmpanel_eliminarproceso_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINARPROCESO',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV37BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV38BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV39BarCodPar',fld:'vBARCODPAR',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV15TFProCod',fld:'vTFPROCOD',pic:''},{av:'AV16TFProCod_Sel',fld:'vTFPROCOD_SEL',pic:''},{av:'AV17TFProDsc',fld:'vTFPRODSC',pic:''},{av:'AV18TFProDsc_Sel',fld:'vTFPRODSC_SEL',pic:''},{av:'AV40TFProFasEst',fld:'vTFPROFASEST',pic:'9'},{av:'AV41TFProFasEst_To',fld:'vTFPROFASEST_TO',pic:'9'},{av:'AV66Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV25Discod',fld:'vDISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV27BarExt',fld:'vBAREXT',pic:'9',hsh:true},{av:'AV26BarSit',fld:'vBARSIT',pic:'Z9',hsh:true},{av:'AV50Barunimed',fld:'vBARUNIMED',pic:'@!',hsh:true},{av:'AV51Barpes',fld:'vBARPES',pic:'ZZZ9',hsh:true},{av:'AV59BarSerDsc',fld:'vBARSERDSC',pic:'',hsh:true},{av:'AV60BarAgrEst',fld:'vBARAGREST',pic:'@!',hsh:true},{av:'AV33Planing',fld:'vPLANING',pic:'ZZZ9',hsh:true},{av:'AV34Carvema',fld:'vCARVEMA',pic:'ZZZ9',hsh:true},{av:'AV35Tinamar',fld:'vTINAMAR',pic:'ZZZ9',hsh:true},{av:'AV36CtrlUsu',fld:'vCTRLUSU',pic:'ZZZ9',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:'',hsh:true},{av:'AV48CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV52BarSer',fld:'vBARSER',pic:'',hsh:true},{av:'AV53PedidoCliente',fld:'vPEDIDOCLIENTE',pic:'',hsh:true},{av:'AV54BarColNom',fld:'vBARCOLNOM',pic:'',hsh:true},{av:'AV55BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'AV56BarPie',fld:'vBARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV49BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV57BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV58CliNom',fld:'vCLINOM',pic:'',hsh:true},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'AV30UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV28Station',fld:'vSTATION',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINARPROCESO.CLOSE",",oparms:[{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'AV39BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV38BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV37BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV28Station',fld:'vSTATION',pic:''},{av:'AV30UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'cmbavGridactions'},{av:'edtProCod_Columnheaderclass',ctrl:'PROCOD',prop:'Columnheaderclass'},{av:'edtProDsc_Columnheaderclass',ctrl:'PRODSC',prop:'Columnheaderclass'},{av:'edtProFasEst_Columnheaderclass',ctrl:'PROFASEST',prop:'Columnheaderclass'}]}");
      setEventMetadata("ENTER","{handler:'e1424E2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV37BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV38BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV39BarCodPar',fld:'vBARCODPAR',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV15TFProCod',fld:'vTFPROCOD',pic:''},{av:'AV16TFProCod_Sel',fld:'vTFPROCOD_SEL',pic:''},{av:'AV17TFProDsc',fld:'vTFPRODSC',pic:''},{av:'AV18TFProDsc_Sel',fld:'vTFPRODSC_SEL',pic:''},{av:'AV40TFProFasEst',fld:'vTFPROFASEST',pic:'9'},{av:'AV41TFProFasEst_To',fld:'vTFPROFASEST_TO',pic:'9'},{av:'AV66Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV25Discod',fld:'vDISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV27BarExt',fld:'vBAREXT',pic:'9',hsh:true},{av:'AV26BarSit',fld:'vBARSIT',pic:'Z9',hsh:true},{av:'AV50Barunimed',fld:'vBARUNIMED',pic:'@!',hsh:true},{av:'AV51Barpes',fld:'vBARPES',pic:'ZZZ9',hsh:true},{av:'AV59BarSerDsc',fld:'vBARSERDSC',pic:'',hsh:true},{av:'AV60BarAgrEst',fld:'vBARAGREST',pic:'@!',hsh:true},{av:'AV33Planing',fld:'vPLANING',pic:'ZZZ9',hsh:true},{av:'AV34Carvema',fld:'vCARVEMA',pic:'ZZZ9',hsh:true},{av:'AV35Tinamar',fld:'vTINAMAR',pic:'ZZZ9',hsh:true},{av:'AV36CtrlUsu',fld:'vCTRLUSU',pic:'ZZZ9',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:'',hsh:true},{av:'AV48CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV52BarSer',fld:'vBARSER',pic:'',hsh:true},{av:'AV53PedidoCliente',fld:'vPEDIDOCLIENTE',pic:'',hsh:true},{av:'AV54BarColNom',fld:'vBARCOLNOM',pic:'',hsh:true},{av:'AV55BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'AV56BarPie',fld:'vBARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV49BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV57BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV58CliNom',fld:'vCLINOM',pic:'',hsh:true},{av:'AV43ProCod',fld:'vPROCOD',pic:''},{av:'AV46ExisBarpro',fld:'vEXISBARPRO',pic:'ZZZ9'}]");
      setEventMetadata("ENTER",",oparms:[{av:'AV46ExisBarpro',fld:'vEXISBARPRO',pic:'ZZZ9'},{av:'AV43ProCod',fld:'vPROCOD',pic:''},{av:'AV39BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV38BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV37BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV62ProDsc',fld:'vPRODSC',pic:''},{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'Dvelop_confirmpanel_enter_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_ENTER',prop:'ConfirmationText'},{av:'cmbavGridactions'},{av:'edtProCod_Columnheaderclass',ctrl:'PROCOD',prop:'Columnheaderclass'},{av:'edtProDsc_Columnheaderclass',ctrl:'PRODSC',prop:'Columnheaderclass'},{av:'edtProFasEst_Columnheaderclass',ctrl:'PROFASEST',prop:'Columnheaderclass'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ENTER.CLOSE","{handler:'e1324E2',iparms:[{av:'Dvelop_confirmpanel_enter_Result',ctrl:'DVELOP_CONFIRMPANEL_ENTER',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV37BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV38BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV39BarCodPar',fld:'vBARCODPAR',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV15TFProCod',fld:'vTFPROCOD',pic:''},{av:'AV16TFProCod_Sel',fld:'vTFPROCOD_SEL',pic:''},{av:'AV17TFProDsc',fld:'vTFPRODSC',pic:''},{av:'AV18TFProDsc_Sel',fld:'vTFPRODSC_SEL',pic:''},{av:'AV40TFProFasEst',fld:'vTFPROFASEST',pic:'9'},{av:'AV41TFProFasEst_To',fld:'vTFPROFASEST_TO',pic:'9'},{av:'AV66Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV25Discod',fld:'vDISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV27BarExt',fld:'vBAREXT',pic:'9',hsh:true},{av:'AV26BarSit',fld:'vBARSIT',pic:'Z9',hsh:true},{av:'AV50Barunimed',fld:'vBARUNIMED',pic:'@!',hsh:true},{av:'AV51Barpes',fld:'vBARPES',pic:'ZZZ9',hsh:true},{av:'AV59BarSerDsc',fld:'vBARSERDSC',pic:'',hsh:true},{av:'AV60BarAgrEst',fld:'vBARAGREST',pic:'@!',hsh:true},{av:'AV33Planing',fld:'vPLANING',pic:'ZZZ9',hsh:true},{av:'AV34Carvema',fld:'vCARVEMA',pic:'ZZZ9',hsh:true},{av:'AV35Tinamar',fld:'vTINAMAR',pic:'ZZZ9',hsh:true},{av:'AV36CtrlUsu',fld:'vCTRLUSU',pic:'ZZZ9',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:'',hsh:true},{av:'AV48CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV52BarSer',fld:'vBARSER',pic:'',hsh:true},{av:'AV53PedidoCliente',fld:'vPEDIDOCLIENTE',pic:'',hsh:true},{av:'AV54BarColNom',fld:'vBARCOLNOM',pic:'',hsh:true},{av:'AV55BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'AV56BarPie',fld:'vBARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV49BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV57BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV58CliNom',fld:'vCLINOM',pic:'',hsh:true},{av:'AV43ProCod',fld:'vPROCOD',pic:''},{av:'AV46ExisBarpro',fld:'vEXISBARPRO',pic:'ZZZ9'},{av:'AV30UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV28Station',fld:'vSTATION',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ENTER.CLOSE",",oparms:[{av:'AV46ExisBarpro',fld:'vEXISBARPRO',pic:'ZZZ9'},{av:'AV43ProCod',fld:'vPROCOD',pic:''},{av:'AV39BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV38BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV37BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'cmbavGridactions'},{av:'edtProCod_Columnheaderclass',ctrl:'PROCOD',prop:'Columnheaderclass'},{av:'edtProDsc_Columnheaderclass',ctrl:'PRODSC',prop:'Columnheaderclass'},{av:'edtProFasEst_Columnheaderclass',ctrl:'PROFASEST',prop:'Columnheaderclass'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e1524E2',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("VPROCOD.CONTROLVALUECHANGED","{handler:'e1624E2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV37BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV38BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV39BarCodPar',fld:'vBARCODPAR',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV15TFProCod',fld:'vTFPROCOD',pic:''},{av:'AV16TFProCod_Sel',fld:'vTFPROCOD_SEL',pic:''},{av:'AV17TFProDsc',fld:'vTFPRODSC',pic:''},{av:'AV18TFProDsc_Sel',fld:'vTFPRODSC_SEL',pic:''},{av:'AV40TFProFasEst',fld:'vTFPROFASEST',pic:'9'},{av:'AV41TFProFasEst_To',fld:'vTFPROFASEST_TO',pic:'9'},{av:'AV66Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV25Discod',fld:'vDISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV27BarExt',fld:'vBAREXT',pic:'9',hsh:true},{av:'AV26BarSit',fld:'vBARSIT',pic:'Z9',hsh:true},{av:'AV50Barunimed',fld:'vBARUNIMED',pic:'@!',hsh:true},{av:'AV51Barpes',fld:'vBARPES',pic:'ZZZ9',hsh:true},{av:'AV59BarSerDsc',fld:'vBARSERDSC',pic:'',hsh:true},{av:'AV60BarAgrEst',fld:'vBARAGREST',pic:'@!',hsh:true},{av:'AV33Planing',fld:'vPLANING',pic:'ZZZ9',hsh:true},{av:'AV34Carvema',fld:'vCARVEMA',pic:'ZZZ9',hsh:true},{av:'AV35Tinamar',fld:'vTINAMAR',pic:'ZZZ9',hsh:true},{av:'AV36CtrlUsu',fld:'vCTRLUSU',pic:'ZZZ9',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:'',hsh:true},{av:'AV48CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV52BarSer',fld:'vBARSER',pic:'',hsh:true},{av:'AV53PedidoCliente',fld:'vPEDIDOCLIENTE',pic:'',hsh:true},{av:'AV54BarColNom',fld:'vBARCOLNOM',pic:'',hsh:true},{av:'AV55BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'AV56BarPie',fld:'vBARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV49BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV57BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV58CliNom',fld:'vCLINOM',pic:'',hsh:true},{av:'AV43ProCod',fld:'vPROCOD',pic:''}]");
      setEventMetadata("VPROCOD.CONTROLVALUECHANGED",",oparms:[{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'AV62ProDsc',fld:'vPRODSC',pic:''},{av:'cmbavGridactions'},{av:'edtProCod_Columnheaderclass',ctrl:'PROCOD',prop:'Columnheaderclass'},{av:'edtProDsc_Columnheaderclass',ctrl:'PRODSC',prop:'Columnheaderclass'},{av:'edtProFasEst_Columnheaderclass',ctrl:'PROFASEST',prop:'Columnheaderclass'}]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV37BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV38BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV39BarCodPar',fld:'vBARCODPAR',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV25Discod',fld:'vDISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV27BarExt',fld:'vBAREXT',pic:'9',hsh:true},{av:'AV26BarSit',fld:'vBARSIT',pic:'Z9',hsh:true},{av:'AV50Barunimed',fld:'vBARUNIMED',pic:'@!',hsh:true},{av:'AV51Barpes',fld:'vBARPES',pic:'ZZZ9',hsh:true},{av:'AV59BarSerDsc',fld:'vBARSERDSC',pic:'',hsh:true},{av:'AV60BarAgrEst',fld:'vBARAGREST',pic:'@!',hsh:true},{av:'AV33Planing',fld:'vPLANING',pic:'ZZZ9',hsh:true},{av:'AV34Carvema',fld:'vCARVEMA',pic:'ZZZ9',hsh:true},{av:'AV35Tinamar',fld:'vTINAMAR',pic:'ZZZ9',hsh:true},{av:'AV36CtrlUsu',fld:'vCTRLUSU',pic:'ZZZ9',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:'',hsh:true},{av:'AV48CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV52BarSer',fld:'vBARSER',pic:'',hsh:true},{av:'AV53PedidoCliente',fld:'vPEDIDOCLIENTE',pic:'',hsh:true},{av:'AV54BarColNom',fld:'vBARCOLNOM',pic:'',hsh:true},{av:'AV55BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'AV56BarPie',fld:'vBARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV49BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV57BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV58CliNom',fld:'vCLINOM',pic:'',hsh:true},{av:'AV15TFProCod',fld:'vTFPROCOD',pic:''},{av:'AV16TFProCod_Sel',fld:'vTFPROCOD_SEL',pic:''},{av:'AV17TFProDsc',fld:'vTFPRODSC',pic:''},{av:'AV18TFProDsc_Sel',fld:'vTFPRODSC_SEL',pic:''},{av:'AV40TFProFasEst',fld:'vTFPROFASEST',pic:'9'},{av:'AV41TFProFasEst_To',fld:'vTFPROFASEST_TO',pic:'9'},{av:'AV66Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]");
      setEventMetadata("GRID_FIRSTPAGE",",oparms:[{av:'cmbavGridactions'},{av:'edtProCod_Columnheaderclass',ctrl:'PROCOD',prop:'Columnheaderclass'},{av:'edtProDsc_Columnheaderclass',ctrl:'PRODSC',prop:'Columnheaderclass'},{av:'edtProFasEst_Columnheaderclass',ctrl:'PROFASEST',prop:'Columnheaderclass'}]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV37BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV38BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV39BarCodPar',fld:'vBARCODPAR',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV25Discod',fld:'vDISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV27BarExt',fld:'vBAREXT',pic:'9',hsh:true},{av:'AV26BarSit',fld:'vBARSIT',pic:'Z9',hsh:true},{av:'AV50Barunimed',fld:'vBARUNIMED',pic:'@!',hsh:true},{av:'AV51Barpes',fld:'vBARPES',pic:'ZZZ9',hsh:true},{av:'AV59BarSerDsc',fld:'vBARSERDSC',pic:'',hsh:true},{av:'AV60BarAgrEst',fld:'vBARAGREST',pic:'@!',hsh:true},{av:'AV33Planing',fld:'vPLANING',pic:'ZZZ9',hsh:true},{av:'AV34Carvema',fld:'vCARVEMA',pic:'ZZZ9',hsh:true},{av:'AV35Tinamar',fld:'vTINAMAR',pic:'ZZZ9',hsh:true},{av:'AV36CtrlUsu',fld:'vCTRLUSU',pic:'ZZZ9',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:'',hsh:true},{av:'AV48CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV52BarSer',fld:'vBARSER',pic:'',hsh:true},{av:'AV53PedidoCliente',fld:'vPEDIDOCLIENTE',pic:'',hsh:true},{av:'AV54BarColNom',fld:'vBARCOLNOM',pic:'',hsh:true},{av:'AV55BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'AV56BarPie',fld:'vBARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV49BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV57BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV58CliNom',fld:'vCLINOM',pic:'',hsh:true},{av:'AV15TFProCod',fld:'vTFPROCOD',pic:''},{av:'AV16TFProCod_Sel',fld:'vTFPROCOD_SEL',pic:''},{av:'AV17TFProDsc',fld:'vTFPRODSC',pic:''},{av:'AV18TFProDsc_Sel',fld:'vTFPRODSC_SEL',pic:''},{av:'AV40TFProFasEst',fld:'vTFPROFASEST',pic:'9'},{av:'AV41TFProFasEst_To',fld:'vTFPROFASEST_TO',pic:'9'},{av:'AV66Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]");
      setEventMetadata("GRID_PREVPAGE",",oparms:[{av:'cmbavGridactions'},{av:'edtProCod_Columnheaderclass',ctrl:'PROCOD',prop:'Columnheaderclass'},{av:'edtProDsc_Columnheaderclass',ctrl:'PRODSC',prop:'Columnheaderclass'},{av:'edtProFasEst_Columnheaderclass',ctrl:'PROFASEST',prop:'Columnheaderclass'}]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV37BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV38BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV39BarCodPar',fld:'vBARCODPAR',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV25Discod',fld:'vDISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV27BarExt',fld:'vBAREXT',pic:'9',hsh:true},{av:'AV26BarSit',fld:'vBARSIT',pic:'Z9',hsh:true},{av:'AV50Barunimed',fld:'vBARUNIMED',pic:'@!',hsh:true},{av:'AV51Barpes',fld:'vBARPES',pic:'ZZZ9',hsh:true},{av:'AV59BarSerDsc',fld:'vBARSERDSC',pic:'',hsh:true},{av:'AV60BarAgrEst',fld:'vBARAGREST',pic:'@!',hsh:true},{av:'AV33Planing',fld:'vPLANING',pic:'ZZZ9',hsh:true},{av:'AV34Carvema',fld:'vCARVEMA',pic:'ZZZ9',hsh:true},{av:'AV35Tinamar',fld:'vTINAMAR',pic:'ZZZ9',hsh:true},{av:'AV36CtrlUsu',fld:'vCTRLUSU',pic:'ZZZ9',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:'',hsh:true},{av:'AV48CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV52BarSer',fld:'vBARSER',pic:'',hsh:true},{av:'AV53PedidoCliente',fld:'vPEDIDOCLIENTE',pic:'',hsh:true},{av:'AV54BarColNom',fld:'vBARCOLNOM',pic:'',hsh:true},{av:'AV55BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'AV56BarPie',fld:'vBARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV49BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV57BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV58CliNom',fld:'vCLINOM',pic:'',hsh:true},{av:'AV15TFProCod',fld:'vTFPROCOD',pic:''},{av:'AV16TFProCod_Sel',fld:'vTFPROCOD_SEL',pic:''},{av:'AV17TFProDsc',fld:'vTFPRODSC',pic:''},{av:'AV18TFProDsc_Sel',fld:'vTFPRODSC_SEL',pic:''},{av:'AV40TFProFasEst',fld:'vTFPROFASEST',pic:'9'},{av:'AV41TFProFasEst_To',fld:'vTFPROFASEST_TO',pic:'9'},{av:'AV66Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]");
      setEventMetadata("GRID_NEXTPAGE",",oparms:[{av:'cmbavGridactions'},{av:'edtProCod_Columnheaderclass',ctrl:'PROCOD',prop:'Columnheaderclass'},{av:'edtProDsc_Columnheaderclass',ctrl:'PRODSC',prop:'Columnheaderclass'},{av:'edtProFasEst_Columnheaderclass',ctrl:'PROFASEST',prop:'Columnheaderclass'}]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV37BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV38BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV39BarCodPar',fld:'vBARCODPAR',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV25Discod',fld:'vDISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV27BarExt',fld:'vBAREXT',pic:'9',hsh:true},{av:'AV26BarSit',fld:'vBARSIT',pic:'Z9',hsh:true},{av:'AV50Barunimed',fld:'vBARUNIMED',pic:'@!',hsh:true},{av:'AV51Barpes',fld:'vBARPES',pic:'ZZZ9',hsh:true},{av:'AV59BarSerDsc',fld:'vBARSERDSC',pic:'',hsh:true},{av:'AV60BarAgrEst',fld:'vBARAGREST',pic:'@!',hsh:true},{av:'AV33Planing',fld:'vPLANING',pic:'ZZZ9',hsh:true},{av:'AV34Carvema',fld:'vCARVEMA',pic:'ZZZ9',hsh:true},{av:'AV35Tinamar',fld:'vTINAMAR',pic:'ZZZ9',hsh:true},{av:'AV36CtrlUsu',fld:'vCTRLUSU',pic:'ZZZ9',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:'',hsh:true},{av:'AV48CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV52BarSer',fld:'vBARSER',pic:'',hsh:true},{av:'AV53PedidoCliente',fld:'vPEDIDOCLIENTE',pic:'',hsh:true},{av:'AV54BarColNom',fld:'vBARCOLNOM',pic:'',hsh:true},{av:'AV55BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'AV56BarPie',fld:'vBARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV49BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV57BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV58CliNom',fld:'vCLINOM',pic:'',hsh:true},{av:'AV15TFProCod',fld:'vTFPROCOD',pic:''},{av:'AV16TFProCod_Sel',fld:'vTFPROCOD_SEL',pic:''},{av:'AV17TFProDsc',fld:'vTFPRODSC',pic:''},{av:'AV18TFProDsc_Sel',fld:'vTFPRODSC_SEL',pic:''},{av:'AV40TFProFasEst',fld:'vTFPROFASEST',pic:'9'},{av:'AV41TFProFasEst_To',fld:'vTFPROFASEST_TO',pic:'9'},{av:'AV66Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]");
      setEventMetadata("GRID_LASTPAGE",",oparms:[{av:'cmbavGridactions'},{av:'edtProCod_Columnheaderclass',ctrl:'PROCOD',prop:'Columnheaderclass'},{av:'edtProDsc_Columnheaderclass',ctrl:'PRODSC',prop:'Columnheaderclass'},{av:'edtProFasEst_Columnheaderclass',ctrl:'PROFASEST',prop:'Columnheaderclass'}]}");
      setEventMetadata("VALIDV_BARCOD","{handler:'validv_Barcod',iparms:[]");
      setEventMetadata("VALIDV_BARCOD",",oparms:[]}");
      setEventMetadata("VALIDV_BARCODREO","{handler:'validv_Barcodreo',iparms:[]");
      setEventMetadata("VALIDV_BARCODREO",",oparms:[]}");
      setEventMetadata("VALIDV_BARCODPAR","{handler:'validv_Barcodpar',iparms:[]");
      setEventMetadata("VALIDV_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_PROCOD","{handler:'valid_Procod',iparms:[]");
      setEventMetadata("VALID_PROCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Tdislin',iparms:[]");
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
      wcpOA396EmprCod = "" ;
      wcpOAV39BarCodPar = "" ;
      wcpOAV50Barunimed = "" ;
      wcpOAV52BarSer = "" ;
      wcpOAV53PedidoCliente = "" ;
      wcpOAV54BarColNom = "" ;
      wcpOAV49BarKgm = DecimalUtil.ZERO ;
      wcpOAV57BarMtr = DecimalUtil.ZERO ;
      wcpOAV58CliNom = "" ;
      wcpOAV59BarSerDsc = "" ;
      wcpOAV60BarAgrEst = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Dvelop_confirmpanel_eliminarproceso_Result = "" ;
      Dvelop_confirmpanel_enter_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      AV39BarCodPar = "" ;
      AV50Barunimed = "" ;
      AV52BarSer = "" ;
      AV53PedidoCliente = "" ;
      AV54BarColNom = "" ;
      AV49BarKgm = DecimalUtil.ZERO ;
      AV57BarMtr = DecimalUtil.ZERO ;
      AV58CliNom = "" ;
      AV59BarSerDsc = "" ;
      AV60BarAgrEst = "" ;
      AV15TFProCod = "" ;
      AV16TFProCod_Sel = "" ;
      AV17TFProDsc = "" ;
      AV18TFProDsc_Sel = "" ;
      AV66Pgmname = "" ;
      A130BarCodPar = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV19DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV30UsurCod = "" ;
      AV28Station = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV61Var_agrupacion = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      lblTextblockprocod_Jsonclick = "" ;
      AV62ProDsc = "" ;
      bttBtnenter_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      lblTbmessage_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV67Pedidosclientesindetalle_hojaderuta__procesosds_1_tfprocod = "" ;
      AV68Pedidosclientesindetalle_hojaderuta__procesosds_2_tfprocod_sel = "" ;
      AV69Pedidosclientesindetalle_hojaderuta__procesosds_3_tfprodsc = "" ;
      AV70Pedidosclientesindetalle_hojaderuta__procesosds_4_tfprodsc_sel = "" ;
      A758ProCod = "" ;
      A759ProDsc = "" ;
      scmdbuf = "" ;
      lV67Pedidosclientesindetalle_hojaderuta__procesosds_1_tfprocod = "" ;
      lV69Pedidosclientesindetalle_hojaderuta__procesosds_3_tfprodsc = "" ;
      H024E3_A396EmprCod = new String[] {""} ;
      H024E3_A130BarCodPar = new String[] {""} ;
      H024E3_A132BarCodReo = new byte[1] ;
      H024E3_A129BarCod = new int[1] ;
      H024E3_A759ProDsc = new String[] {""} ;
      H024E3_A758ProCod = new String[] {""} ;
      H024E3_A760ProFasEst = new byte[1] ;
      H024E3_n760ProFasEst = new boolean[] {false} ;
      H024E5_AGRID_nRecordCount = new long[1] ;
      AV43ProCod = "" ;
      hsh = "" ;
      AV29EmprNom = "" ;
      AV31EmprCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV63Proact = "" ;
      ucDvelop_confirmpanel_enter = new com.genexus.webpanels.GXUserControl();
      AV73Emprcod_selected = "" ;
      AV76Barcodpar_selected = "" ;
      AV77Procod_selected = "" ;
      AV47Inc_obs = "" ;
      GXv_int6 = new byte[1] ;
      GXv_int10 = new int[1] ;
      GXv_int11 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV14Session = httpContext.getWebSession();
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char13 = "" ;
      GXt_char1 = "" ;
      GXv_SdtWWPGridState14 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      GXv_char12 = new String[1] ;
      GXv_char4 = new String[1] ;
      ucDvelop_confirmpanel_eliminarproceso = new com.genexus.webpanels.GXUserControl();
      imgPrompt_procod_gximage = "" ;
      sImgUrl = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidosclientesindetalle.hojaderuta__procesos__default(),
         new Object[] {
             new Object[] {
            H024E3_A396EmprCod, H024E3_A130BarCodPar, H024E3_A132BarCodReo, H024E3_A129BarCod, H024E3_A759ProDsc, H024E3_A758ProCod, H024E3_A760ProFasEst, H024E3_n760ProFasEst
            }
            , new Object[] {
            H024E5_AGRID_nRecordCount
            }
         }
      );
      AV66Pgmname = "PedidosClienteSinDetalle.HojadeRuta__Procesos" ;
      /* GeneXus formulas. */
      AV66Pgmname = "PedidosClienteSinDetalle.HojadeRuta__Procesos" ;
      Gx_err = (short)(0) ;
      edtavBarcod_Enabled = 0 ;
      edtavBarcodreo_Enabled = 0 ;
      edtavBarcodpar_Enabled = 0 ;
      edtavClicod_Enabled = 0 ;
      edtavClinom_Enabled = 0 ;
      edtavPedidocliente_Enabled = 0 ;
      edtavVar_agrupacion_Enabled = 0 ;
      edtavBarser_Enabled = 0 ;
      edtavBarcolnom_Enabled = 0 ;
      edtavBarcolnum_Enabled = 0 ;
      edtavBarpie_Enabled = 0 ;
      edtavBarkgm_Enabled = 0 ;
      edtavBarmtr_Enabled = 0 ;
      edtavProdsc_Enabled = 0 ;
      edtavTdislin_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
      imgPrompt_procod_Link = "javascript:"+"gx.popup.openPrompt('"+"app.ficherosbasicos.tprocesprompt"+"',["+"{Ctrl:gx.dom.el('"+"EMPRCOD"+"'), id:'"+"EMPRCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vPROCOD"+"'), id:'"+"vPROCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vPRODSC"+"'), id:'"+"vPRODSC"+"'"+",IOType:'inout'}"+"],"+"null"+","+"'', false"+","+"false"+");" ;
      imgPrompt_procod_Link = "javascript:"+"gx.popup.openPrompt('"+"app.ficherosbasicos.tprocesprompt"+"',["+"{Ctrl:gx.dom.el('"+"EMPRCOD"+"'), id:'"+"EMPRCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vPROCOD"+"'), id:'"+"vPROCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vPRODSC"+"'), id:'"+"vPRODSC"+"'"+",IOType:'inout'}"+"],"+"null"+","+"'', false"+","+"false"+");" ;
   }

   private byte wcpOAV38BarCodReo ;
   private byte wcpOAV26BarSit ;
   private byte wcpOAV27BarExt ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV38BarCodReo ;
   private byte AV26BarSit ;
   private byte AV27BarExt ;
   private byte AV40TFProFasEst ;
   private byte AV41TFProFasEst_To ;
   private byte A132BarCodReo ;
   private byte gxajaxcallmode ;
   private byte AV71Pedidosclientesindetalle_hojaderuta__procesosds_5_tfprofasest ;
   private byte AV72Pedidosclientesindetalle_hojaderuta__procesosds_6_tfprofasest_to ;
   private byte A760ProFasEst ;
   private byte AV32Tdislin ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXt_int5 ;
   private byte AV75Barcodreo_selected ;
   private byte GXv_int6[] ;
   private byte GXv_int11[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short wcpOAV51Barpes ;
   private short AV51Barpes ;
   private short AV12OrderedBy ;
   private short AV33Planing ;
   private short AV34Carvema ;
   private short AV35Tinamar ;
   private short AV36CtrlUsu ;
   private short AV46ExisBarpro ;
   private short wbEnd ;
   private short wbStart ;
   private short AV42GridActions ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV37BarCod ;
   private int wcpOAV25Discod ;
   private int wcpOAV48CliCod ;
   private int wcpOAV55BarColNum ;
   private int wcpOAV56BarPie ;
   private int subGrid_Rows ;
   private int nRC_GXsfl_122 ;
   private int AV37BarCod ;
   private int AV25Discod ;
   private int AV48CliCod ;
   private int AV55BarColNum ;
   private int AV56BarPie ;
   private int nGXsfl_122_idx=1 ;
   private int A129BarCod ;
   private int edtavBarcod_Enabled ;
   private int edtavBarcodreo_Enabled ;
   private int edtavBarcodpar_Enabled ;
   private int edtavClicod_Enabled ;
   private int edtavClinom_Enabled ;
   private int edtavPedidocliente_Enabled ;
   private int edtavVar_agrupacion_Enabled ;
   private int edtavBarser_Enabled ;
   private int edtavBarcolnom_Enabled ;
   private int edtavBarcolnum_Enabled ;
   private int edtavBarpie_Enabled ;
   private int edtavBarkgm_Enabled ;
   private int edtavBarmtr_Enabled ;
   private int edtavProdsc_Enabled ;
   private int edtavPgmname_Enabled ;
   private int subGrid_Islastpage ;
   private int edtavTdislin_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV74Barcod_selected ;
   private int GXv_int10[] ;
   private int AV78GXV1 ;
   private int edtavProcod_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavTdislin_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal wcpOAV49BarKgm ;
   private java.math.BigDecimal wcpOAV57BarMtr ;
   private java.math.BigDecimal AV49BarKgm ;
   private java.math.BigDecimal AV57BarMtr ;
   private String wcpOA396EmprCod ;
   private String wcpOAV39BarCodPar ;
   private String wcpOAV50Barunimed ;
   private String wcpOAV52BarSer ;
   private String wcpOAV53PedidoCliente ;
   private String wcpOAV54BarColNom ;
   private String wcpOAV58CliNom ;
   private String wcpOAV59BarSerDsc ;
   private String wcpOAV60BarAgrEst ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Dvelop_confirmpanel_eliminarproceso_Result ;
   private String Dvelop_confirmpanel_enter_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String AV39BarCodPar ;
   private String AV50Barunimed ;
   private String AV52BarSer ;
   private String AV53PedidoCliente ;
   private String AV54BarColNom ;
   private String AV58CliNom ;
   private String AV59BarSerDsc ;
   private String AV60BarAgrEst ;
   private String sGXsfl_122_idx="0001" ;
   private String AV15TFProCod ;
   private String AV16TFProCod_Sel ;
   private String AV17TFProDsc ;
   private String AV18TFProDsc_Sel ;
   private String AV66Pgmname ;
   private String A130BarCodPar ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV30UsurCod ;
   private String AV28Station ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
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
   private String Dvelop_confirmpanel_eliminarproceso_Title ;
   private String Dvelop_confirmpanel_eliminarproceso_Confirmationtext ;
   private String Dvelop_confirmpanel_eliminarproceso_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_eliminarproceso_Nobuttoncaption ;
   private String Dvelop_confirmpanel_eliminarproceso_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_eliminarproceso_Yesbuttonposition ;
   private String Dvelop_confirmpanel_eliminarproceso_Confirmtype ;
   private String Dvelop_confirmpanel_enter_Title ;
   private String Dvelop_confirmpanel_enter_Confirmationtext ;
   private String Dvelop_confirmpanel_enter_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_enter_Nobuttoncaption ;
   private String Dvelop_confirmpanel_enter_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_enter_Yesbuttonposition ;
   private String Dvelop_confirmpanel_enter_Confirmtype ;
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Fixedcolumns ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String edtavBarcod_Internalname ;
   private String edtavBarcod_Jsonclick ;
   private String edtavBarcodreo_Internalname ;
   private String edtavBarcodreo_Jsonclick ;
   private String edtavBarcodpar_Internalname ;
   private String edtavBarcodpar_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
   private String edtavClicod_Internalname ;
   private String edtavClicod_Jsonclick ;
   private String edtavClinom_Internalname ;
   private String edtavClinom_Jsonclick ;
   private String edtavPedidocliente_Internalname ;
   private String edtavPedidocliente_Jsonclick ;
   private String edtavVar_agrupacion_Internalname ;
   private String TempTags ;
   private String AV61Var_agrupacion ;
   private String edtavVar_agrupacion_Jsonclick ;
   private String divUnnamedtable6_Internalname ;
   private String edtavBarser_Internalname ;
   private String edtavBarser_Jsonclick ;
   private String edtavBarcolnom_Internalname ;
   private String edtavBarcolnom_Jsonclick ;
   private String edtavBarcolnum_Internalname ;
   private String edtavBarcolnum_Jsonclick ;
   private String divUnnamedtable7_Internalname ;
   private String edtavBarpie_Internalname ;
   private String edtavBarpie_Jsonclick ;
   private String edtavBarkgm_Internalname ;
   private String edtavBarkgm_Jsonclick ;
   private String edtavBarmtr_Internalname ;
   private String edtavBarmtr_Jsonclick ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String divTablesplittedprocod_Internalname ;
   private String lblTextblockprocod_Internalname ;
   private String lblTextblockprocod_Jsonclick ;
   private String edtavProdsc_Internalname ;
   private String AV62ProDsc ;
   private String edtavProdsc_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String lblTbmessage_Internalname ;
   private String lblTbmessage_Caption ;
   private String lblTbmessage_Jsonclick ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV67Pedidosclientesindetalle_hojaderuta__procesosds_1_tfprocod ;
   private String AV68Pedidosclientesindetalle_hojaderuta__procesosds_2_tfprocod_sel ;
   private String AV69Pedidosclientesindetalle_hojaderuta__procesosds_3_tfprodsc ;
   private String AV70Pedidosclientesindetalle_hojaderuta__procesosds_4_tfprodsc_sel ;
   private String A758ProCod ;
   private String edtProCod_Internalname ;
   private String A759ProDsc ;
   private String edtProDsc_Internalname ;
   private String edtProFasEst_Internalname ;
   private String edtavTdislin_Internalname ;
   private String imgPrompt_procod_Link ;
   private String imgPrompt_procod_Internalname ;
   private String scmdbuf ;
   private String lV67Pedidosclientesindetalle_hojaderuta__procesosds_1_tfprocod ;
   private String lV69Pedidosclientesindetalle_hojaderuta__procesosds_3_tfprodsc ;
   private String AV43ProCod ;
   private String edtavProcod_Internalname ;
   private String hsh ;
   private String AV29EmprNom ;
   private String AV31EmprCod ;
   private String edtProCod_Columnheaderclass ;
   private String edtProDsc_Columnheaderclass ;
   private String edtProFasEst_Columnheaderclass ;
   private String edtProCod_Columnclass ;
   private String edtProDsc_Columnclass ;
   private String edtProFasEst_Columnclass ;
   private String AV63Proact ;
   private String Dvelop_confirmpanel_enter_Internalname ;
   private String AV73Emprcod_selected ;
   private String AV76Barcodpar_selected ;
   private String AV77Procod_selected ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXt_char13 ;
   private String GXt_char1 ;
   private String GXv_char12[] ;
   private String GXv_char4[] ;
   private String tblTabledvelop_confirmpanel_enter_Internalname ;
   private String tblTabledvelop_confirmpanel_eliminarproceso_Internalname ;
   private String Dvelop_confirmpanel_eliminarproceso_Internalname ;
   private String tblTablemergedprocod_Internalname ;
   private String edtavProcod_Jsonclick ;
   private String imgPrompt_procod_gximage ;
   private String sImgUrl ;
   private String sGXsfl_122_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtProCod_Jsonclick ;
   private String edtProDsc_Jsonclick ;
   private String edtProFasEst_Jsonclick ;
   private String edtavTdislin_Jsonclick ;
   private String subGrid_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV13OrderedDsc ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
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
   private boolean n760ProFasEst ;
   private boolean bGXsfl_122_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV47Inc_obs ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV14Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_enter ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminarproceso ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavGridactions ;
   private IDataStoreProvider pr_default ;
   private String[] H024E3_A396EmprCod ;
   private String[] H024E3_A130BarCodPar ;
   private byte[] H024E3_A132BarCodReo ;
   private int[] H024E3_A129BarCod ;
   private String[] H024E3_A759ProDsc ;
   private String[] H024E3_A758ProCod ;
   private byte[] H024E3_A760ProFasEst ;
   private boolean[] H024E3_n760ProFasEst ;
   private long[] H024E5_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV19DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState14[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
}

final  class hojaderuta__procesos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H024E3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV68Pedidosclientesindetalle_hojaderuta__procesosds_2_tfprocod_sel ,
                                          String AV67Pedidosclientesindetalle_hojaderuta__procesosds_1_tfprocod ,
                                          String AV70Pedidosclientesindetalle_hojaderuta__procesosds_4_tfprodsc_sel ,
                                          String AV69Pedidosclientesindetalle_hojaderuta__procesosds_3_tfprodsc ,
                                          String A758ProCod ,
                                          String A759ProDsc ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          byte AV71Pedidosclientesindetalle_hojaderuta__procesosds_5_tfprofasest ,
                                          byte A760ProFasEst ,
                                          byte AV72Pedidosclientesindetalle_hojaderuta__procesosds_6_tfprofasest_to ,
                                          String A396EmprCod ,
                                          int AV37BarCod ,
                                          byte AV38BarCodReo ,
                                          String AV39BarCodPar ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int15 = new byte[17];
      Object[] GXv_Object16 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.ProDsc, T1.ProCod, COALESCE( T3.ProFasEst, 0) AS ProFasEst" ;
      sFromString = " FROM ((TXPBARPRO T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod) LEFT JOIN (SELECT MIN(BarFasEst) AS ProFasEst, EmprCod, BarCod," ;
      sFromString += " BarCodReo, BarCodPar, ProCod FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod" ;
      sFromString += " = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar AND T3.ProCod = T1.ProCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.ProFasEst, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.ProFasEst, 0) <= ?))");
      if ( (GXutil.strcmp("", AV68Pedidosclientesindetalle_hojaderuta__procesosds_2_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV67Pedidosclientesindetalle_hojaderuta__procesosds_1_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Pedidosclientesindetalle_hojaderuta__procesosds_2_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int15[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Pedidosclientesindetalle_hojaderuta__procesosds_4_tfprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV69Pedidosclientesindetalle_hojaderuta__procesosds_3_tfprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Pedidosclientesindetalle_hojaderuta__procesosds_4_tfprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ProDsc = ?)");
      }
      else
      {
         GXv_int15[11] = (byte)(1) ;
      }
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ProCod" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ProCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.ProDsc" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.ProDsc DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object16[0] = scmdbuf ;
      GXv_Object16[1] = GXv_int15 ;
      return GXv_Object16 ;
   }

   protected Object[] conditional_H024E5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV68Pedidosclientesindetalle_hojaderuta__procesosds_2_tfprocod_sel ,
                                          String AV67Pedidosclientesindetalle_hojaderuta__procesosds_1_tfprocod ,
                                          String AV70Pedidosclientesindetalle_hojaderuta__procesosds_4_tfprodsc_sel ,
                                          String AV69Pedidosclientesindetalle_hojaderuta__procesosds_3_tfprodsc ,
                                          String A758ProCod ,
                                          String A759ProDsc ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          byte AV71Pedidosclientesindetalle_hojaderuta__procesosds_5_tfprofasest ,
                                          byte A760ProFasEst ,
                                          byte AV72Pedidosclientesindetalle_hojaderuta__procesosds_6_tfprofasest_to ,
                                          String A396EmprCod ,
                                          int AV37BarCod ,
                                          byte AV38BarCodReo ,
                                          String AV39BarCodPar ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[12];
      Object[] GXv_Object18 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM ((TXPBARPRO T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod) LEFT JOIN (SELECT MIN(BarFasEst) AS ProFasEst," ;
      scmdbuf += " EmprCod, BarCod, BarCodReo, BarCodPar, ProCod FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod ) T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar AND T3.ProCod = T1.ProCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.ProFasEst, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.ProFasEst, 0) <= ?))");
      if ( (GXutil.strcmp("", AV68Pedidosclientesindetalle_hojaderuta__procesosds_2_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV67Pedidosclientesindetalle_hojaderuta__procesosds_1_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Pedidosclientesindetalle_hojaderuta__procesosds_2_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int17[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Pedidosclientesindetalle_hojaderuta__procesosds_4_tfprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV69Pedidosclientesindetalle_hojaderuta__procesosds_3_tfprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Pedidosclientesindetalle_hojaderuta__procesosds_4_tfprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ProDsc = ?)");
      }
      else
      {
         GXv_int17[11] = (byte)(1) ;
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
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
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
                  return conditional_H024E3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Boolean) dynConstraints[7]).booleanValue() , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).byteValue() , (String)dynConstraints[17] );
            case 1 :
                  return conditional_H024E5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Boolean) dynConstraints[7]).booleanValue() , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).byteValue() , (String)dynConstraints[17] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H024E3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H024E5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 40);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[17], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[19]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[21]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[22]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[23]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[24]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 8);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 40);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 40);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[14]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[16]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[17]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[18]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[19]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 8);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 40);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 40);
               }
               return;
      }
   }

}

