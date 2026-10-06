package app.recetasdeacabados ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class recetadeacabado01_wp_impl extends GXDataArea
{
   public recetadeacabado01_wp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public recetadeacabado01_wp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recetadeacabado01_wp_impl.class ));
   }

   public recetadeacabado01_wp_impl( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkavSeleccionar = UIFactory.getCheckbox(this);
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
            AV12EmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12EmprCod", AV12EmprCod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV13BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV13BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13BarCod), 8, 0));
               AV14BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14BarCodReo", GXutil.str( AV14BarCodReo, 1, 0));
               AV15BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15BarCodPar", AV15BarCodPar);
               AV16BarKgm = CommonUtil.decimalVal( httpContext.GetPar( "BarKgm"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV16BarKgm", GXutil.ltrimstr( AV16BarKgm, 9, 2));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARKGM", getSecureSignedToken( "", localUtil.format( AV16BarKgm, "ZZZZZ9.99")));
               AV17BarMtr = CommonUtil.decimalVal( httpContext.GetPar( "BarMtr"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV17BarMtr", GXutil.ltrimstr( AV17BarMtr, 9, 2));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARMTR", getSecureSignedToken( "", localUtil.format( AV17BarMtr, "ZZZZZ9.99")));
               AV18ArtFacabs = CommonUtil.decimalVal( httpContext.GetPar( "ArtFacabs"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18ArtFacabs", GXutil.ltrimstr( AV18ArtFacabs, 6, 2));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTFACABS", getSecureSignedToken( "", localUtil.format( AV18ArtFacabs, "ZZ9.99")));
               AV6CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV6CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6CliCod), 6, 0));
               AV19CliNom = httpContext.GetPar( "CliNom") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV19CliNom", AV19CliNom);
               AV20BarSer = httpContext.GetPar( "BarSer") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV20BarSer", AV20BarSer);
               AV7BarSerDsc = httpContext.GetPar( "BarSerDsc") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7BarSerDsc", AV7BarSerDsc);
               AV21Procod = httpContext.GetPar( "Procod") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV21Procod", AV21Procod);
               AV22ProDsc = httpContext.GetPar( "ProDsc") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV22ProDsc", AV22ProDsc);
               AV23MaqCod = httpContext.GetPar( "MaqCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV23MaqCod", AV23MaqCod);
               AV24MaqDsc = httpContext.GetPar( "MaqDsc") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV24MaqDsc", AV24MaqDsc);
               AV25MaqVolRes = (int)(GXutil.lval( httpContext.GetPar( "MaqVolRes"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV25MaqVolRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25MaqVolRes), 5, 0));
               AV26MaqVolTop = (int)(GXutil.lval( httpContext.GetPar( "MaqVolTop"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV26MaqVolTop", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26MaqVolTop), 5, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQVOLTOP", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV26MaqVolTop), "ZZZZ9")));
               AV27BarAncCru1 = (short)(GXutil.lval( httpContext.GetPar( "BarAncCru1"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV27BarAncCru1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27BarAncCru1), 3, 0));
               AV28PedidoCliente = httpContext.GetPar( "PedidoCliente") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV28PedidoCliente", AV28PedidoCliente);
               AV29BarPle = httpContext.GetPar( "BarPle") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV29BarPle", AV29BarPle);
               AV34Contextura = httpContext.GetPar( "Contextura") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV34Contextura", AV34Contextura);
               AV9BarColNom = httpContext.GetPar( "BarColNom") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9BarColNom", AV9BarColNom);
               AV10BarColNum = (int)(GXutil.lval( httpContext.GetPar( "BarColNum"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10BarColNum), 6, 0));
               AV30BarMat = httpContext.GetPar( "BarMat") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV30BarMat", AV30BarMat);
               AV5RecLtssr = (int)(GXutil.lval( httpContext.GetPar( "RecLtssr"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV5RecLtssr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5RecLtssr), 5, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECLTSSR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV5RecLtssr), "ZZZZ9")));
               AV35LtsSob = (int)(GXutil.lval( httpContext.GetPar( "LtsSob"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV35LtsSob", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35LtsSob), 5, 0));
               AV31Hrefacabs = CommonUtil.decimalVal( httpContext.GetPar( "Hrefacabs"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV31Hrefacabs", GXutil.ltrimstr( AV31Hrefacabs, 6, 2));
               AV36Var1 = httpContext.GetPar( "Var1") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV36Var1", AV36Var1);
               AV37Msg_tosa = httpContext.GetPar( "Msg_tosa") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV37Msg_tosa", AV37Msg_tosa);
               AV11BarFasecod = httpContext.GetPar( "BarFasecod") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV11BarFasecod", AV11BarFasecod);
               AV32BarFaseOrd = (short)(GXutil.lval( httpContext.GetPar( "BarFaseOrd"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV32BarFaseOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32BarFaseOrd), 4, 0));
               AV33barMaqTin = httpContext.GetPar( "barMaqTin") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV33barMaqTin", AV33barMaqTin);
               AV179ErrMensaje1 = httpContext.GetPar( "ErrMensaje1") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV179ErrMensaje1", AV179ErrMensaje1);
               AV178ErrMensaje = httpContext.GetPar( "ErrMensaje") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV178ErrMensaje", AV178ErrMensaje);
               AV176HdrscreadasToJson = httpContext.GetPar( "HdrscreadasToJson") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV176HdrscreadasToJson", AV176HdrscreadasToJson);
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
      nRC_GXsfl_149 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_149"))) ;
      nGXsfl_149_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_149_idx"))) ;
      sGXsfl_149_idx = httpContext.GetPar( "sGXsfl_149_idx") ;
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
      AV71TFFasCod = httpContext.GetPar( "TFFasCod") ;
      AV72TFFasCod_Sel = httpContext.GetPar( "TFFasCod_Sel") ;
      AV142TFFasDsc = httpContext.GetPar( "TFFasDsc") ;
      AV143TFFasDsc_Sel = httpContext.GetPar( "TFFasDsc_Sel") ;
      AV144TFFasQuiLin = (short)(GXutil.lval( httpContext.GetPar( "TFFasQuiLin"))) ;
      AV145TFFasQuiLin_To = (short)(GXutil.lval( httpContext.GetPar( "TFFasQuiLin_To"))) ;
      AV146TFProForCod = httpContext.GetPar( "TFProForCod") ;
      AV147TFProForCod_Sel = httpContext.GetPar( "TFProForCod_Sel") ;
      AV148TFProForDsc = httpContext.GetPar( "TFProForDsc") ;
      AV149TFProForDsc_Sel = httpContext.GetPar( "TFProForDsc_Sel") ;
      AV185Pgmname = httpContext.GetPar( "Pgmname") ;
      AV45OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV46OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV173tabladevolumenes = httpContext.GetPar( "tabladevolumenes") ;
      AV5RecLtssr = (int)(GXutil.lval( httpContext.GetPar( "RecLtssr"))) ;
      AV18ArtFacabs = CommonUtil.decimalVal( httpContext.GetPar( "ArtFacabs"), ".") ;
      AV16BarKgm = CommonUtil.decimalVal( httpContext.GetPar( "BarKgm"), ".") ;
      AV17BarMtr = CommonUtil.decimalVal( httpContext.GetPar( "BarMtr"), ".") ;
      AV26MaqVolTop = (int)(GXutil.lval( httpContext.GetPar( "MaqVolTop"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV71TFFasCod, AV72TFFasCod_Sel, AV142TFFasDsc, AV143TFFasDsc_Sel, AV144TFFasQuiLin, AV145TFFasQuiLin_To, AV146TFProForCod, AV147TFProForCod_Sel, AV148TFProForDsc, AV149TFProForDsc_Sel, AV185Pgmname, AV45OrderedBy, AV46OrderedDsc, AV173tabladevolumenes, AV5RecLtssr, AV18ArtFacabs, AV16BarKgm, AV17BarMtr, AV26MaqVolTop) ;
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
      pa24Q2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start24Q2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.recetasdeacabados.recetadeacabado01_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV12EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV13BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV14BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV15BarCodPar)),GXutil.URLEncode(DecimalUtil.decToString(AV16BarKgm)),GXutil.URLEncode(DecimalUtil.decToString(AV17BarMtr)),GXutil.URLEncode(DecimalUtil.decToString(AV18ArtFacabs)),GXutil.URLEncode(GXutil.ltrimstr(AV6CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV19CliNom)),GXutil.URLEncode(GXutil.rtrim(AV20BarSer)),GXutil.URLEncode(GXutil.rtrim(AV7BarSerDsc)),GXutil.URLEncode(GXutil.rtrim(AV21Procod)),GXutil.URLEncode(GXutil.rtrim(AV22ProDsc)),GXutil.URLEncode(GXutil.rtrim(AV23MaqCod)),GXutil.URLEncode(GXutil.rtrim(AV24MaqDsc)),GXutil.URLEncode(GXutil.ltrimstr(AV25MaqVolRes,5,0)),GXutil.URLEncode(GXutil.ltrimstr(AV26MaqVolTop,5,0)),GXutil.URLEncode(GXutil.ltrimstr(AV27BarAncCru1,3,0)),GXutil.URLEncode(GXutil.rtrim(AV28PedidoCliente)),GXutil.URLEncode(GXutil.rtrim(AV29BarPle)),GXutil.URLEncode(GXutil.rtrim(AV34Contextura)),GXutil.URLEncode(GXutil.rtrim(AV9BarColNom)),GXutil.URLEncode(GXutil.ltrimstr(AV10BarColNum,6,0)),GXutil.URLEncode(GXutil.rtrim(AV30BarMat)),GXutil.URLEncode(GXutil.ltrimstr(AV5RecLtssr,5,0)),GXutil.URLEncode(GXutil.ltrimstr(AV35LtsSob,5,0)),GXutil.URLEncode(DecimalUtil.decToString(AV31Hrefacabs)),GXutil.URLEncode(GXutil.rtrim(AV36Var1)),GXutil.URLEncode(GXutil.rtrim(AV37Msg_tosa)),GXutil.URLEncode(GXutil.rtrim(AV11BarFasecod)),GXutil.URLEncode(GXutil.ltrimstr(AV32BarFaseOrd,4,0)),GXutil.URLEncode(GXutil.rtrim(AV33barMaqTin)),GXutil.URLEncode(GXutil.rtrim(AV179ErrMensaje1)),GXutil.URLEncode(GXutil.rtrim(AV178ErrMensaje)),GXutil.URLEncode(GXutil.rtrim(AV176HdrscreadasToJson))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","BarKgm","BarMtr","ArtFacabs","CliCod","CliNom","BarSer","BarSerDsc","Procod","ProDsc","MaqCod","MaqDsc","MaqVolRes","MaqVolTop","BarAncCru1","PedidoCliente","BarPle","Contextura","BarColNom","BarColNum","BarMat","RecLtssr","LtsSob","Hrefacabs","Var1","Msg_tosa","BarFasecod","BarFaseOrd","barMaqTin","ErrMensaje1","ErrMensaje","HdrscreadasToJson"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTABLADEVOLUMENES", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV173tabladevolumenes, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARKGM", getSecureSignedToken( "", localUtil.format( AV16BarKgm, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARMTR", getSecureSignedToken( "", localUtil.format( AV17BarMtr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTFACABS", getSecureSignedToken( "", localUtil.format( AV18ArtFacabs, "ZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQVOLTOP", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV26MaqVolTop), "ZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECLTSSR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV5RecLtssr), "ZZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"RecetadeAcabado01_WP");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV185Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("recetasdeacabados\\recetadeacabado01_wp:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_149", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_149, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV137DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV137DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASCOD", GXutil.rtrim( AV71TFFasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASCOD_SEL", GXutil.rtrim( AV72TFFasCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASDSC", GXutil.rtrim( AV142TFFasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASDSC_SEL", GXutil.rtrim( AV143TFFasDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASQUILIN", GXutil.ltrim( localUtil.ntoc( AV144TFFasQuiLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASQUILIN_TO", GXutil.ltrim( localUtil.ntoc( AV145TFFasQuiLin_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROFORCOD", GXutil.rtrim( AV146TFProForCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROFORCOD_SEL", GXutil.rtrim( AV147TFProForCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROFORDSC", GXutil.rtrim( AV148TFProForDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROFORDSC_SEL", GXutil.rtrim( AV149TFProForDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV45OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV46OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vREP", GXutil.ltrim( localUtil.ntoc( AV167Rep, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTABLADEVOLUMENES", GXutil.rtrim( AV173tabladevolumenes));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTABLADEVOLUMENES", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV173tabladevolumenes, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV12EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vPROCOD", GXutil.rtrim( AV21Procod));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV163UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECLINMAQ", GXutil.ltrim( localUtil.ntoc( AV177RecLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vLTSREC", GXutil.ltrim( localUtil.ntoc( AV164LtsRec, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vABS2", GXutil.ltrim( localUtil.ntoc( AV181Abs2, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVAR1", GXutil.rtrim( AV36Var1));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vHDRSCREADAS_SDTS", AV175Hdrscreadas_SDTs);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vHDRSCREADAS_SDTS", AV175Hdrscreadas_SDTs);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vRECLTSSR", GXutil.ltrim( localUtil.ntoc( AV5RecLtssr, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECLTSSR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV5RecLtssr), "ZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVOLMUL", GXutil.ltrim( localUtil.ntoc( AV165VolMul, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vARTFACABS", GXutil.ltrim( localUtil.ntoc( AV18ArtFacabs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTFACABS", getSecureSignedToken( "", localUtil.format( AV18ArtFacabs, "ZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRODSC", GXutil.rtrim( AV22ProDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPLE", GXutil.rtrim( AV29BarPle));
      app.GxWebStd.gx_hidden_field( httpContext, "vCONTEXTURA", GXutil.rtrim( AV34Contextura));
      app.GxWebStd.gx_hidden_field( httpContext, "vLTSSOB", GXutil.ltrim( localUtil.ntoc( AV35LtsSob, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vHREFACABS", GXutil.ltrim( localUtil.ntoc( AV31Hrefacabs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG_TOSA", GXutil.rtrim( AV37Msg_tosa));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARFASECOD", GXutil.rtrim( AV11BarFasecod));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARFASEORD", GXutil.ltrim( localUtil.ntoc( AV32BarFaseOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARMAQTIN", GXutil.rtrim( AV33barMaqTin));
      app.GxWebStd.gx_hidden_field( httpContext, "vERRMENSAJE1", AV179ErrMensaje1);
      app.GxWebStd.gx_hidden_field( httpContext, "vERRMENSAJE", AV178ErrMensaje);
      app.GxWebStd.gx_hidden_field( httpContext, "vHDRSCREADASTOJSON", AV176HdrscreadasToJson);
      app.GxWebStd.gx_hidden_field( httpContext, "vREP2", GXutil.ltrim( localUtil.ntoc( AV156Rep2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVOLUMEN2", GXutil.ltrim( localUtil.ntoc( AV160Volumen2, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVOLUMENC", GXutil.ltrim( localUtil.ntoc( AV159Volumenc, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVOLPAR", GXutil.ltrim( localUtil.ntoc( AV158VolPar, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vI", GXutil.ltrim( localUtil.ntoc( AV169i, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Width", GXutil.rtrim( Dvpanel_panel_filtrosgenerales_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Autowidth", GXutil.booltostr( Dvpanel_panel_filtrosgenerales_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Autoheight", GXutil.booltostr( Dvpanel_panel_filtrosgenerales_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Cls", GXutil.rtrim( Dvpanel_panel_filtrosgenerales_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Title", GXutil.rtrim( Dvpanel_panel_filtrosgenerales_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Collapsible", GXutil.booltostr( Dvpanel_panel_filtrosgenerales_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Collapsed", GXutil.booltostr( Dvpanel_panel_filtrosgenerales_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Showcollapseicon", GXutil.booltostr( Dvpanel_panel_filtrosgenerales_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Iconposition", GXutil.rtrim( Dvpanel_panel_filtrosgenerales_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Autoscroll", GXutil.booltostr( Dvpanel_panel_filtrosgenerales_Autoscroll));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Title", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Result));
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
         we24Q2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt24Q2( ) ;
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
      return formatLink("app.recetasdeacabados.recetadeacabado01_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV12EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV13BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV14BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV15BarCodPar)),GXutil.URLEncode(DecimalUtil.decToString(AV16BarKgm)),GXutil.URLEncode(DecimalUtil.decToString(AV17BarMtr)),GXutil.URLEncode(DecimalUtil.decToString(AV18ArtFacabs)),GXutil.URLEncode(GXutil.ltrimstr(AV6CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV19CliNom)),GXutil.URLEncode(GXutil.rtrim(AV20BarSer)),GXutil.URLEncode(GXutil.rtrim(AV7BarSerDsc)),GXutil.URLEncode(GXutil.rtrim(AV21Procod)),GXutil.URLEncode(GXutil.rtrim(AV22ProDsc)),GXutil.URLEncode(GXutil.rtrim(AV23MaqCod)),GXutil.URLEncode(GXutil.rtrim(AV24MaqDsc)),GXutil.URLEncode(GXutil.ltrimstr(AV25MaqVolRes,5,0)),GXutil.URLEncode(GXutil.ltrimstr(AV26MaqVolTop,5,0)),GXutil.URLEncode(GXutil.ltrimstr(AV27BarAncCru1,3,0)),GXutil.URLEncode(GXutil.rtrim(AV28PedidoCliente)),GXutil.URLEncode(GXutil.rtrim(AV29BarPle)),GXutil.URLEncode(GXutil.rtrim(AV34Contextura)),GXutil.URLEncode(GXutil.rtrim(AV9BarColNom)),GXutil.URLEncode(GXutil.ltrimstr(AV10BarColNum,6,0)),GXutil.URLEncode(GXutil.rtrim(AV30BarMat)),GXutil.URLEncode(GXutil.ltrimstr(AV5RecLtssr,5,0)),GXutil.URLEncode(GXutil.ltrimstr(AV35LtsSob,5,0)),GXutil.URLEncode(DecimalUtil.decToString(AV31Hrefacabs)),GXutil.URLEncode(GXutil.rtrim(AV36Var1)),GXutil.URLEncode(GXutil.rtrim(AV37Msg_tosa)),GXutil.URLEncode(GXutil.rtrim(AV11BarFasecod)),GXutil.URLEncode(GXutil.ltrimstr(AV32BarFaseOrd,4,0)),GXutil.URLEncode(GXutil.rtrim(AV33barMaqTin)),GXutil.URLEncode(GXutil.rtrim(AV179ErrMensaje1)),GXutil.URLEncode(GXutil.rtrim(AV178ErrMensaje)),GXutil.URLEncode(GXutil.rtrim(AV176HdrscreadasToJson))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","BarKgm","BarMtr","ArtFacabs","CliCod","CliNom","BarSer","BarSerDsc","Procod","ProDsc","MaqCod","MaqDsc","MaqVolRes","MaqVolTop","BarAncCru1","PedidoCliente","BarPle","Contextura","BarColNom","BarColNum","BarMat","RecLtssr","LtsSob","Hrefacabs","Var1","Msg_tosa","BarFasecod","BarFaseOrd","barMaqTin","ErrMensaje1","ErrMensaje","HdrscreadasToJson"})  ;
   }

   public String getPgmname( )
   {
      return "RecetasDeAcabados.RecetadeAcabado01_WP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " FASQUI", "") ;
   }

   public void wb24Q0( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_panel_filtrosgenerales.setProperty("Width", Dvpanel_panel_filtrosgenerales_Width);
         ucDvpanel_panel_filtrosgenerales.setProperty("AutoWidth", Dvpanel_panel_filtrosgenerales_Autowidth);
         ucDvpanel_panel_filtrosgenerales.setProperty("AutoHeight", Dvpanel_panel_filtrosgenerales_Autoheight);
         ucDvpanel_panel_filtrosgenerales.setProperty("Cls", Dvpanel_panel_filtrosgenerales_Cls);
         ucDvpanel_panel_filtrosgenerales.setProperty("Title", Dvpanel_panel_filtrosgenerales_Title);
         ucDvpanel_panel_filtrosgenerales.setProperty("Collapsible", Dvpanel_panel_filtrosgenerales_Collapsible);
         ucDvpanel_panel_filtrosgenerales.setProperty("Collapsed", Dvpanel_panel_filtrosgenerales_Collapsed);
         ucDvpanel_panel_filtrosgenerales.setProperty("ShowCollapseIcon", Dvpanel_panel_filtrosgenerales_Showcollapseicon);
         ucDvpanel_panel_filtrosgenerales.setProperty("IconPosition", Dvpanel_panel_filtrosgenerales_Iconposition);
         ucDvpanel_panel_filtrosgenerales.setProperty("AutoScroll", Dvpanel_panel_filtrosgenerales_Autoscroll);
         ucDvpanel_panel_filtrosgenerales.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panel_filtrosgenerales_Internalname, "DVPANEL_PANEL_FILTROSGENERALESContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANEL_FILTROSGENERALESContainer"+"Panel_FiltrosGenerales"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPanel_filtrosgenerales_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcod_Internalname, httpContext.getMessage( "Nº Hdr", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV13BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV13BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV13BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasDeAcabados\\RecetadeAcabado01_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodreo_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodreo_Internalname, httpContext.getMessage( "R", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodreo_Internalname, GXutil.ltrim( localUtil.ntoc( AV14BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcodreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV14BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(AV14BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodreo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodreo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasDeAcabados\\RecetadeAcabado01_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodpar_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodpar_Internalname, httpContext.getMessage( "P", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodpar_Internalname, GXutil.rtrim( AV15BarCodPar), GXutil.rtrim( localUtil.format( AV15BarCodPar, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodpar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodpar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetasDeAcabados\\RecetadeAcabado01_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClicod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClicod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV6CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV6CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV6CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasDeAcabados\\RecetadeAcabado01_WP.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClinom_Internalname, GXutil.rtrim( AV19CliNom), GXutil.rtrim( localUtil.format( AV19CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClinom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClinom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetasDeAcabados\\RecetadeAcabado01_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPedidocliente_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPedidocliente_Internalname, httpContext.getMessage( "Pedido Cli.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPedidocliente_Internalname, GXutil.rtrim( AV28PedidoCliente), GXutil.rtrim( localUtil.format( AV28PedidoCliente, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPedidocliente_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPedidocliente_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetasDeAcabados\\RecetadeAcabado01_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarser_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarser_Internalname, httpContext.getMessage( "Articulo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarser_Internalname, GXutil.rtrim( AV20BarSer), GXutil.rtrim( localUtil.format( AV20BarSer, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarser_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarser_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetasDeAcabados\\RecetadeAcabado01_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarserdsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarserdsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarserdsc_Internalname, GXutil.rtrim( AV7BarSerDsc), GXutil.rtrim( localUtil.format( AV7BarSerDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarserdsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarserdsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetasDeAcabados\\RecetadeAcabado01_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarmat_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarmat_Internalname, httpContext.getMessage( "Materia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarmat_Internalname, GXutil.rtrim( AV30BarMat), GXutil.rtrim( localUtil.format( AV30BarMat, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarmat_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarmat_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetasDeAcabados\\RecetadeAcabado01_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBaranccru1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBaranccru1_Internalname, httpContext.getMessage( "Ancho", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBaranccru1_Internalname, GXutil.ltrim( localUtil.ntoc( AV27BarAncCru1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBaranccru1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV27BarAncCru1), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV27BarAncCru1), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBaranccru1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBaranccru1_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasDeAcabados\\RecetadeAcabado01_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable8_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnom_Internalname, httpContext.getMessage( "Color", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnom_Internalname, GXutil.rtrim( AV9BarColNom), GXutil.rtrim( localUtil.format( AV9BarColNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetasDeAcabados\\RecetadeAcabado01_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnum_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnum_Internalname, httpContext.getMessage( "Numero", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnum_Internalname, GXutil.ltrim( localUtil.ntoc( AV10BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcolnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV10BarColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV10BarColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasDeAcabados\\RecetadeAcabado01_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 149, 3, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnconfirmar_Jsonclick, 7, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e1124q1_client"+"'", TempTags, "", 2, "HLP_RecetasDeAcabados\\RecetadeAcabado01_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 149, 3, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 7, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e1224q1_client"+"'", TempTags, "", 2, "HLP_RecetasDeAcabados\\RecetadeAcabado01_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMaqcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMaqcod_Internalname, httpContext.getMessage( "Maquina", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqcod_Internalname, GXutil.rtrim( AV23MaqCod), GXutil.rtrim( localUtil.format( AV23MaqCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMaqcod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetasDeAcabados\\RecetadeAcabado01_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMaqdsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMaqdsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqdsc_Internalname, GXutil.rtrim( AV24MaqDsc), GXutil.rtrim( localUtil.format( AV24MaqDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqdsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMaqdsc_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetasDeAcabados\\RecetadeAcabado01_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMaqvolres_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMaqvolres_Internalname, httpContext.getMessage( "Vol. Resi.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqvolres_Internalname, GXutil.ltrim( localUtil.ntoc( AV25MaqVolRes, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavMaqvolres_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV25MaqVolRes), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV25MaqVolRes), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqvolres_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMaqvolres_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasDeAcabados\\RecetadeAcabado01_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMaqvoltop_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMaqvoltop_Internalname, httpContext.getMessage( "Baño Tope", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqvoltop_Internalname, GXutil.ltrim( localUtil.ntoc( AV26MaqVolTop, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavMaqvoltop_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV26MaqVolTop), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV26MaqVolTop), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqvoltop_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMaqvoltop_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasDeAcabados\\RecetadeAcabado01_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFacabs_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFacabs_Internalname, httpContext.getMessage( "Fact. Abs.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 118,'',false,'" + sGXsfl_149_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFacabs_Internalname, GXutil.ltrim( localUtil.ntoc( AV150FacAbs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavFacabs_Enabled!=0) ? localUtil.format( AV150FacAbs, "ZZ9.99") : localUtil.format( AV150FacAbs, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,118);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFacabs_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFacabs_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasDeAcabados\\RecetadeAcabado01_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavVolumen_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavVolumen_Internalname, httpContext.getMessage( "Volumen", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 122,'',false,'" + sGXsfl_149_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavVolumen_Internalname, GXutil.ltrim( localUtil.ntoc( AV151Volumen, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavVolumen_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV151Volumen), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV151Volumen), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,122);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavVolumen_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavVolumen_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasDeAcabados\\RecetadeAcabado01_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarkgm_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarkgm_Internalname, httpContext.getMessage( "Kilos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarkgm_Internalname, GXutil.ltrim( localUtil.ntoc( AV16BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarkgm_Enabled!=0) ? localUtil.format( AV16BarKgm, "ZZZZZ9.99") : localUtil.format( AV16BarKgm, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarkgm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarkgm_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasDeAcabados\\RecetadeAcabado01_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavTot_kgs_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTot_kgs_Internalname, httpContext.getMessage( "Kgs. Tot", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 130,'',false,'" + sGXsfl_149_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTot_kgs_Internalname, GXutil.ltrim( localUtil.ntoc( AV152Tot_kgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavTot_kgs_Enabled!=0) ? localUtil.format( AV152Tot_kgs, "ZZZZZ9.99") : localUtil.format( AV152Tot_kgs, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,130);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTot_kgs_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTot_kgs_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasDeAcabados\\RecetadeAcabado01_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarmtr_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarmtr_Internalname, httpContext.getMessage( "Metros", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarmtr_Internalname, GXutil.ltrim( localUtil.ntoc( AV17BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarmtr_Enabled!=0) ? localUtil.format( AV17BarMtr, "ZZZZZ9.99") : localUtil.format( AV17BarMtr, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarmtr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarmtr_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasDeAcabados\\RecetadeAcabado01_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavTot_mts_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTot_mts_Internalname, httpContext.getMessage( "Mts. Tot.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 138,'',false,'" + sGXsfl_149_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTot_mts_Internalname, GXutil.ltrim( localUtil.ntoc( AV153Tot_mts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavTot_mts_Enabled!=0) ? localUtil.format( AV153Tot_mts, "ZZZZZ9.99") : localUtil.format( AV153Tot_mts, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,138);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTot_mts_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTot_mts_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasDeAcabados\\RecetadeAcabado01_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavVolumenes_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavVolumenes_Internalname, httpContext.getMessage( "Volumen(s)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'',false,'" + sGXsfl_149_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavVolumenes_Internalname, GXutil.rtrim( AV155Volumenes), GXutil.rtrim( localUtil.format( AV155Volumenes, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,146);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavVolumenes_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavVolumenes_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetasDeAcabados\\RecetadeAcabado01_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell CellMarginTop HasGridEmpowerer", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol149( ) ;
      }
      if ( wbEnd == 149 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_149 = (int)(nGXsfl_149_idx-1) ;
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV185Pgmname), GXutil.rtrim( localUtil.format( AV185Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetasDeAcabados\\RecetadeAcabado01_WP.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV137DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         wb_table1_173_24Q2( true) ;
      }
      else
      {
         wb_table1_173_24Q2( false) ;
      }
      return  ;
   }

   public void wb_table1_173_24Q2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 149 )
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

   public void start24Q2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " FASQUI", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup24Q0( ) ;
   }

   public void ws24Q2( )
   {
      start24Q2( ) ;
      evt24Q2( ) ;
   }

   public void evt24Q2( )
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
                           e1324Q2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1424Q2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VFACABS.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1524Q2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           AV186Recetasdeacabados_recetadeacabado01_wpds_1_tffascod = AV71TFFasCod ;
                           AV187Recetasdeacabados_recetadeacabado01_wpds_2_tffascod_sel = AV72TFFasCod_Sel ;
                           AV188Recetasdeacabados_recetadeacabado01_wpds_3_tffasdsc = AV142TFFasDsc ;
                           AV189Recetasdeacabados_recetadeacabado01_wpds_4_tffasdsc_sel = AV143TFFasDsc_Sel ;
                           AV190Recetasdeacabados_recetadeacabado01_wpds_5_tffasquilin = AV144TFFasQuiLin ;
                           AV191Recetasdeacabados_recetadeacabado01_wpds_6_tffasquilin_to = AV145TFFasQuiLin_To ;
                           AV192Recetasdeacabados_recetadeacabado01_wpds_7_tfproforcod = AV146TFProForCod ;
                           AV193Recetasdeacabados_recetadeacabado01_wpds_8_tfproforcod_sel = AV147TFProForCod_Sel ;
                           AV194Recetasdeacabados_recetadeacabado01_wpds_9_tfprofordsc = AV148TFProForDsc ;
                           AV195Recetasdeacabados_recetadeacabado01_wpds_10_tfprofordsc_sel = AV149TFProForDsc_Sel ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_149_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_149_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_149_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_1492( ) ;
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
                           A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
                           A194BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           AV168Seleccionar = GXutil.strtobool( httpContext.cgiGet( chkavSeleccionar.getInternalname())) ;
                           httpContext.ajax_rsp_assign_attri("", false, chkavSeleccionar.getInternalname(), AV168Seleccionar);
                           A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
                           A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
                           A5371FasQuiLin = (short)(localUtil.ctol( httpContext.cgiGet( edtFasQuiLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A764ProForCod = httpContext.cgiGet( edtProForCod_Internalname) ;
                           A766ProForDsc = httpContext.cgiGet( edtProForDsc_Internalname) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e1624Q2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e1724Q2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e1824Q2 ();
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

   public void we24Q2( )
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

   public void pa24Q2( )
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
            GX_FocusControl = edtavFacabs_Internalname ;
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
      subsflControlProps_1492( ) ;
      while ( nGXsfl_149_idx <= nRC_GXsfl_149 )
      {
         sendrow_1492( ) ;
         nGXsfl_149_idx = ((subGrid_Islastpage==1)&&(nGXsfl_149_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_149_idx+1) ;
         sGXsfl_149_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_149_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1492( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV71TFFasCod ,
                                 String AV72TFFasCod_Sel ,
                                 String AV142TFFasDsc ,
                                 String AV143TFFasDsc_Sel ,
                                 short AV144TFFasQuiLin ,
                                 short AV145TFFasQuiLin_To ,
                                 String AV146TFProForCod ,
                                 String AV147TFProForCod_Sel ,
                                 String AV148TFProForDsc ,
                                 String AV149TFProForDsc_Sel ,
                                 String AV185Pgmname ,
                                 short AV45OrderedBy ,
                                 boolean AV46OrderedDsc ,
                                 String AV173tabladevolumenes ,
                                 int AV5RecLtssr ,
                                 java.math.BigDecimal AV18ArtFacabs ,
                                 java.math.BigDecimal AV16BarKgm ,
                                 java.math.BigDecimal AV17BarMtr ,
                                 int AV26MaqVolTop )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e1724Q2 ();
      GRID_nCurrentRecord = 0 ;
      rf24Q2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"RecetadeAcabado01_WP");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV185Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("recetasdeacabados\\recetadeacabado01_wp:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf24Q2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV185Pgmname = "RecetasDeAcabados.RecetadeAcabado01_WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV185Pgmname", AV185Pgmname);
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
      edtavBarser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarser_Enabled), 5, 0), true);
      edtavBarserdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarserdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarserdsc_Enabled), 5, 0), true);
      edtavBarmat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarmat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarmat_Enabled), 5, 0), true);
      edtavBaranccru1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBaranccru1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaranccru1_Enabled), 5, 0), true);
      edtavBarcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnom_Enabled), 5, 0), true);
      edtavBarcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnum_Enabled), 5, 0), true);
      edtavMaqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod_Enabled), 5, 0), true);
      edtavMaqdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqdsc_Enabled), 5, 0), true);
      edtavMaqvolres_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqvolres_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqvolres_Enabled), 5, 0), true);
      edtavMaqvoltop_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqvoltop_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqvoltop_Enabled), 5, 0), true);
      edtavBarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgm_Enabled), 5, 0), true);
      edtavTot_kgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTot_kgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTot_kgs_Enabled), 5, 0), true);
      edtavBarmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarmtr_Enabled), 5, 0), true);
      edtavTot_mts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTot_mts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTot_mts_Enabled), 5, 0), true);
      edtavVolumenes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavVolumenes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavVolumenes_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf24Q2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(149) ;
      /* Execute user event: Refresh */
      e1724Q2 ();
      nGXsfl_149_idx = 1 ;
      sGXsfl_149_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_149_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1492( ) ;
      bGXsfl_149_Refreshing = true ;
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
         subsflControlProps_1492( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV187Recetasdeacabados_recetadeacabado01_wpds_2_tffascod_sel ,
                                              AV186Recetasdeacabados_recetadeacabado01_wpds_1_tffascod ,
                                              AV189Recetasdeacabados_recetadeacabado01_wpds_4_tffasdsc_sel ,
                                              AV188Recetasdeacabados_recetadeacabado01_wpds_3_tffasdsc ,
                                              Short.valueOf(AV190Recetasdeacabados_recetadeacabado01_wpds_5_tffasquilin) ,
                                              Short.valueOf(AV191Recetasdeacabados_recetadeacabado01_wpds_6_tffasquilin_to) ,
                                              AV193Recetasdeacabados_recetadeacabado01_wpds_8_tfproforcod_sel ,
                                              AV192Recetasdeacabados_recetadeacabado01_wpds_7_tfproforcod ,
                                              AV195Recetasdeacabados_recetadeacabado01_wpds_10_tfprofordsc_sel ,
                                              AV194Recetasdeacabados_recetadeacabado01_wpds_9_tfprofordsc ,
                                              A457FasCod ,
                                              A460FasDsc ,
                                              Short.valueOf(A5371FasQuiLin) ,
                                              A764ProForCod ,
                                              A766ProForDsc ,
                                              Short.valueOf(AV45OrderedBy) ,
                                              Boolean.valueOf(AV46OrderedDsc) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                              }
         });
         lV186Recetasdeacabados_recetadeacabado01_wpds_1_tffascod = GXutil.padr( GXutil.rtrim( AV186Recetasdeacabados_recetadeacabado01_wpds_1_tffascod), 8, "%") ;
         lV188Recetasdeacabados_recetadeacabado01_wpds_3_tffasdsc = GXutil.padr( GXutil.rtrim( AV188Recetasdeacabados_recetadeacabado01_wpds_3_tffasdsc), 28, "%") ;
         lV192Recetasdeacabados_recetadeacabado01_wpds_7_tfproforcod = GXutil.padr( GXutil.rtrim( AV192Recetasdeacabados_recetadeacabado01_wpds_7_tfproforcod), 6, "%") ;
         lV194Recetasdeacabados_recetadeacabado01_wpds_9_tfprofordsc = GXutil.padr( GXutil.rtrim( AV194Recetasdeacabados_recetadeacabado01_wpds_9_tfprofordsc), 30, "%") ;
         /* Using cursor H024Q2 */
         pr_default.execute(0, new Object[] {lV186Recetasdeacabados_recetadeacabado01_wpds_1_tffascod, AV187Recetasdeacabados_recetadeacabado01_wpds_2_tffascod_sel, lV188Recetasdeacabados_recetadeacabado01_wpds_3_tffasdsc, AV189Recetasdeacabados_recetadeacabado01_wpds_4_tffasdsc_sel, Short.valueOf(AV190Recetasdeacabados_recetadeacabado01_wpds_5_tffasquilin), Short.valueOf(AV191Recetasdeacabados_recetadeacabado01_wpds_6_tffasquilin_to), lV192Recetasdeacabados_recetadeacabado01_wpds_7_tfproforcod, AV193Recetasdeacabados_recetadeacabado01_wpds_8_tfproforcod_sel, lV194Recetasdeacabados_recetadeacabado01_wpds_9_tfprofordsc, AV195Recetasdeacabados_recetadeacabado01_wpds_10_tfprofordsc_sel, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_149_idx = 1 ;
         sGXsfl_149_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_149_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1492( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A766ProForDsc = H024Q2_A766ProForDsc[0] ;
            A764ProForCod = H024Q2_A764ProForCod[0] ;
            A5371FasQuiLin = H024Q2_A5371FasQuiLin[0] ;
            A460FasDsc = H024Q2_A460FasDsc[0] ;
            A457FasCod = H024Q2_A457FasCod[0] ;
            A194BarOrdLin = H024Q2_A194BarOrdLin[0] ;
            A758ProCod = H024Q2_A758ProCod[0] ;
            A130BarCodPar = H024Q2_A130BarCodPar[0] ;
            A132BarCodReo = H024Q2_A132BarCodReo[0] ;
            A129BarCod = H024Q2_A129BarCod[0] ;
            A396EmprCod = H024Q2_A396EmprCod[0] ;
            A457FasCod = H024Q2_A457FasCod[0] ;
            A460FasDsc = H024Q2_A460FasDsc[0] ;
            A766ProForDsc = H024Q2_A766ProForDsc[0] ;
            e1824Q2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(149) ;
         wb24Q0( ) ;
      }
      bGXsfl_149_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes24Q2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vTABLADEVOLUMENES", GXutil.rtrim( AV173tabladevolumenes));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTABLADEVOLUMENES", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV173tabladevolumenes, ""))));
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
      AV186Recetasdeacabados_recetadeacabado01_wpds_1_tffascod = AV71TFFasCod ;
      AV187Recetasdeacabados_recetadeacabado01_wpds_2_tffascod_sel = AV72TFFasCod_Sel ;
      AV188Recetasdeacabados_recetadeacabado01_wpds_3_tffasdsc = AV142TFFasDsc ;
      AV189Recetasdeacabados_recetadeacabado01_wpds_4_tffasdsc_sel = AV143TFFasDsc_Sel ;
      AV190Recetasdeacabados_recetadeacabado01_wpds_5_tffasquilin = AV144TFFasQuiLin ;
      AV191Recetasdeacabados_recetadeacabado01_wpds_6_tffasquilin_to = AV145TFFasQuiLin_To ;
      AV192Recetasdeacabados_recetadeacabado01_wpds_7_tfproforcod = AV146TFProForCod ;
      AV193Recetasdeacabados_recetadeacabado01_wpds_8_tfproforcod_sel = AV147TFProForCod_Sel ;
      AV194Recetasdeacabados_recetadeacabado01_wpds_9_tfprofordsc = AV148TFProForDsc ;
      AV195Recetasdeacabados_recetadeacabado01_wpds_10_tfprofordsc_sel = AV149TFProForDsc_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV187Recetasdeacabados_recetadeacabado01_wpds_2_tffascod_sel ,
                                           AV186Recetasdeacabados_recetadeacabado01_wpds_1_tffascod ,
                                           AV189Recetasdeacabados_recetadeacabado01_wpds_4_tffasdsc_sel ,
                                           AV188Recetasdeacabados_recetadeacabado01_wpds_3_tffasdsc ,
                                           Short.valueOf(AV190Recetasdeacabados_recetadeacabado01_wpds_5_tffasquilin) ,
                                           Short.valueOf(AV191Recetasdeacabados_recetadeacabado01_wpds_6_tffasquilin_to) ,
                                           AV193Recetasdeacabados_recetadeacabado01_wpds_8_tfproforcod_sel ,
                                           AV192Recetasdeacabados_recetadeacabado01_wpds_7_tfproforcod ,
                                           AV195Recetasdeacabados_recetadeacabado01_wpds_10_tfprofordsc_sel ,
                                           AV194Recetasdeacabados_recetadeacabado01_wpds_9_tfprofordsc ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           Short.valueOf(A5371FasQuiLin) ,
                                           A764ProForCod ,
                                           A766ProForDsc ,
                                           Short.valueOf(AV45OrderedBy) ,
                                           Boolean.valueOf(AV46OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV186Recetasdeacabados_recetadeacabado01_wpds_1_tffascod = GXutil.padr( GXutil.rtrim( AV186Recetasdeacabados_recetadeacabado01_wpds_1_tffascod), 8, "%") ;
      lV188Recetasdeacabados_recetadeacabado01_wpds_3_tffasdsc = GXutil.padr( GXutil.rtrim( AV188Recetasdeacabados_recetadeacabado01_wpds_3_tffasdsc), 28, "%") ;
      lV192Recetasdeacabados_recetadeacabado01_wpds_7_tfproforcod = GXutil.padr( GXutil.rtrim( AV192Recetasdeacabados_recetadeacabado01_wpds_7_tfproforcod), 6, "%") ;
      lV194Recetasdeacabados_recetadeacabado01_wpds_9_tfprofordsc = GXutil.padr( GXutil.rtrim( AV194Recetasdeacabados_recetadeacabado01_wpds_9_tfprofordsc), 30, "%") ;
      /* Using cursor H024Q3 */
      pr_default.execute(1, new Object[] {lV186Recetasdeacabados_recetadeacabado01_wpds_1_tffascod, AV187Recetasdeacabados_recetadeacabado01_wpds_2_tffascod_sel, lV188Recetasdeacabados_recetadeacabado01_wpds_3_tffasdsc, AV189Recetasdeacabados_recetadeacabado01_wpds_4_tffasdsc_sel, Short.valueOf(AV190Recetasdeacabados_recetadeacabado01_wpds_5_tffasquilin), Short.valueOf(AV191Recetasdeacabados_recetadeacabado01_wpds_6_tffasquilin_to), lV192Recetasdeacabados_recetadeacabado01_wpds_7_tfproforcod, AV193Recetasdeacabados_recetadeacabado01_wpds_8_tfproforcod_sel, lV194Recetasdeacabados_recetadeacabado01_wpds_9_tfprofordsc, AV195Recetasdeacabados_recetadeacabado01_wpds_10_tfprofordsc_sel});
      GRID_nRecordCount = H024Q3_AGRID_nRecordCount[0] ;
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
      AV186Recetasdeacabados_recetadeacabado01_wpds_1_tffascod = AV71TFFasCod ;
      AV187Recetasdeacabados_recetadeacabado01_wpds_2_tffascod_sel = AV72TFFasCod_Sel ;
      AV188Recetasdeacabados_recetadeacabado01_wpds_3_tffasdsc = AV142TFFasDsc ;
      AV189Recetasdeacabados_recetadeacabado01_wpds_4_tffasdsc_sel = AV143TFFasDsc_Sel ;
      AV190Recetasdeacabados_recetadeacabado01_wpds_5_tffasquilin = AV144TFFasQuiLin ;
      AV191Recetasdeacabados_recetadeacabado01_wpds_6_tffasquilin_to = AV145TFFasQuiLin_To ;
      AV192Recetasdeacabados_recetadeacabado01_wpds_7_tfproforcod = AV146TFProForCod ;
      AV193Recetasdeacabados_recetadeacabado01_wpds_8_tfproforcod_sel = AV147TFProForCod_Sel ;
      AV194Recetasdeacabados_recetadeacabado01_wpds_9_tfprofordsc = AV148TFProForDsc ;
      AV195Recetasdeacabados_recetadeacabado01_wpds_10_tfprofordsc_sel = AV149TFProForDsc_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV71TFFasCod, AV72TFFasCod_Sel, AV142TFFasDsc, AV143TFFasDsc_Sel, AV144TFFasQuiLin, AV145TFFasQuiLin_To, AV146TFProForCod, AV147TFProForCod_Sel, AV148TFProForDsc, AV149TFProForDsc_Sel, AV185Pgmname, AV45OrderedBy, AV46OrderedDsc, AV173tabladevolumenes, AV5RecLtssr, AV18ArtFacabs, AV16BarKgm, AV17BarMtr, AV26MaqVolTop) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV186Recetasdeacabados_recetadeacabado01_wpds_1_tffascod = AV71TFFasCod ;
      AV187Recetasdeacabados_recetadeacabado01_wpds_2_tffascod_sel = AV72TFFasCod_Sel ;
      AV188Recetasdeacabados_recetadeacabado01_wpds_3_tffasdsc = AV142TFFasDsc ;
      AV189Recetasdeacabados_recetadeacabado01_wpds_4_tffasdsc_sel = AV143TFFasDsc_Sel ;
      AV190Recetasdeacabados_recetadeacabado01_wpds_5_tffasquilin = AV144TFFasQuiLin ;
      AV191Recetasdeacabados_recetadeacabado01_wpds_6_tffasquilin_to = AV145TFFasQuiLin_To ;
      AV192Recetasdeacabados_recetadeacabado01_wpds_7_tfproforcod = AV146TFProForCod ;
      AV193Recetasdeacabados_recetadeacabado01_wpds_8_tfproforcod_sel = AV147TFProForCod_Sel ;
      AV194Recetasdeacabados_recetadeacabado01_wpds_9_tfprofordsc = AV148TFProForDsc ;
      AV195Recetasdeacabados_recetadeacabado01_wpds_10_tfprofordsc_sel = AV149TFProForDsc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV71TFFasCod, AV72TFFasCod_Sel, AV142TFFasDsc, AV143TFFasDsc_Sel, AV144TFFasQuiLin, AV145TFFasQuiLin_To, AV146TFProForCod, AV147TFProForCod_Sel, AV148TFProForDsc, AV149TFProForDsc_Sel, AV185Pgmname, AV45OrderedBy, AV46OrderedDsc, AV173tabladevolumenes, AV5RecLtssr, AV18ArtFacabs, AV16BarKgm, AV17BarMtr, AV26MaqVolTop) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV186Recetasdeacabados_recetadeacabado01_wpds_1_tffascod = AV71TFFasCod ;
      AV187Recetasdeacabados_recetadeacabado01_wpds_2_tffascod_sel = AV72TFFasCod_Sel ;
      AV188Recetasdeacabados_recetadeacabado01_wpds_3_tffasdsc = AV142TFFasDsc ;
      AV189Recetasdeacabados_recetadeacabado01_wpds_4_tffasdsc_sel = AV143TFFasDsc_Sel ;
      AV190Recetasdeacabados_recetadeacabado01_wpds_5_tffasquilin = AV144TFFasQuiLin ;
      AV191Recetasdeacabados_recetadeacabado01_wpds_6_tffasquilin_to = AV145TFFasQuiLin_To ;
      AV192Recetasdeacabados_recetadeacabado01_wpds_7_tfproforcod = AV146TFProForCod ;
      AV193Recetasdeacabados_recetadeacabado01_wpds_8_tfproforcod_sel = AV147TFProForCod_Sel ;
      AV194Recetasdeacabados_recetadeacabado01_wpds_9_tfprofordsc = AV148TFProForDsc ;
      AV195Recetasdeacabados_recetadeacabado01_wpds_10_tfprofordsc_sel = AV149TFProForDsc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV71TFFasCod, AV72TFFasCod_Sel, AV142TFFasDsc, AV143TFFasDsc_Sel, AV144TFFasQuiLin, AV145TFFasQuiLin_To, AV146TFProForCod, AV147TFProForCod_Sel, AV148TFProForDsc, AV149TFProForDsc_Sel, AV185Pgmname, AV45OrderedBy, AV46OrderedDsc, AV173tabladevolumenes, AV5RecLtssr, AV18ArtFacabs, AV16BarKgm, AV17BarMtr, AV26MaqVolTop) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV186Recetasdeacabados_recetadeacabado01_wpds_1_tffascod = AV71TFFasCod ;
      AV187Recetasdeacabados_recetadeacabado01_wpds_2_tffascod_sel = AV72TFFasCod_Sel ;
      AV188Recetasdeacabados_recetadeacabado01_wpds_3_tffasdsc = AV142TFFasDsc ;
      AV189Recetasdeacabados_recetadeacabado01_wpds_4_tffasdsc_sel = AV143TFFasDsc_Sel ;
      AV190Recetasdeacabados_recetadeacabado01_wpds_5_tffasquilin = AV144TFFasQuiLin ;
      AV191Recetasdeacabados_recetadeacabado01_wpds_6_tffasquilin_to = AV145TFFasQuiLin_To ;
      AV192Recetasdeacabados_recetadeacabado01_wpds_7_tfproforcod = AV146TFProForCod ;
      AV193Recetasdeacabados_recetadeacabado01_wpds_8_tfproforcod_sel = AV147TFProForCod_Sel ;
      AV194Recetasdeacabados_recetadeacabado01_wpds_9_tfprofordsc = AV148TFProForDsc ;
      AV195Recetasdeacabados_recetadeacabado01_wpds_10_tfprofordsc_sel = AV149TFProForDsc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV71TFFasCod, AV72TFFasCod_Sel, AV142TFFasDsc, AV143TFFasDsc_Sel, AV144TFFasQuiLin, AV145TFFasQuiLin_To, AV146TFProForCod, AV147TFProForCod_Sel, AV148TFProForDsc, AV149TFProForDsc_Sel, AV185Pgmname, AV45OrderedBy, AV46OrderedDsc, AV173tabladevolumenes, AV5RecLtssr, AV18ArtFacabs, AV16BarKgm, AV17BarMtr, AV26MaqVolTop) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV186Recetasdeacabados_recetadeacabado01_wpds_1_tffascod = AV71TFFasCod ;
      AV187Recetasdeacabados_recetadeacabado01_wpds_2_tffascod_sel = AV72TFFasCod_Sel ;
      AV188Recetasdeacabados_recetadeacabado01_wpds_3_tffasdsc = AV142TFFasDsc ;
      AV189Recetasdeacabados_recetadeacabado01_wpds_4_tffasdsc_sel = AV143TFFasDsc_Sel ;
      AV190Recetasdeacabados_recetadeacabado01_wpds_5_tffasquilin = AV144TFFasQuiLin ;
      AV191Recetasdeacabados_recetadeacabado01_wpds_6_tffasquilin_to = AV145TFFasQuiLin_To ;
      AV192Recetasdeacabados_recetadeacabado01_wpds_7_tfproforcod = AV146TFProForCod ;
      AV193Recetasdeacabados_recetadeacabado01_wpds_8_tfproforcod_sel = AV147TFProForCod_Sel ;
      AV194Recetasdeacabados_recetadeacabado01_wpds_9_tfprofordsc = AV148TFProForDsc ;
      AV195Recetasdeacabados_recetadeacabado01_wpds_10_tfprofordsc_sel = AV149TFProForDsc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV71TFFasCod, AV72TFFasCod_Sel, AV142TFFasDsc, AV143TFFasDsc_Sel, AV144TFFasQuiLin, AV145TFFasQuiLin_To, AV146TFProForCod, AV147TFProForCod_Sel, AV148TFProForDsc, AV149TFProForDsc_Sel, AV185Pgmname, AV45OrderedBy, AV46OrderedDsc, AV173tabladevolumenes, AV5RecLtssr, AV18ArtFacabs, AV16BarKgm, AV17BarMtr, AV26MaqVolTop) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV185Pgmname = "RecetasDeAcabados.RecetadeAcabado01_WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV185Pgmname", AV185Pgmname);
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
      edtavBarser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarser_Enabled), 5, 0), true);
      edtavBarserdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarserdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarserdsc_Enabled), 5, 0), true);
      edtavBarmat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarmat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarmat_Enabled), 5, 0), true);
      edtavBaranccru1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBaranccru1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaranccru1_Enabled), 5, 0), true);
      edtavBarcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnom_Enabled), 5, 0), true);
      edtavBarcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnum_Enabled), 5, 0), true);
      edtavMaqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod_Enabled), 5, 0), true);
      edtavMaqdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqdsc_Enabled), 5, 0), true);
      edtavMaqvolres_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqvolres_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqvolres_Enabled), 5, 0), true);
      edtavMaqvoltop_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqvoltop_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqvoltop_Enabled), 5, 0), true);
      edtavBarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgm_Enabled), 5, 0), true);
      edtavTot_kgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTot_kgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTot_kgs_Enabled), 5, 0), true);
      edtavBarmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarmtr_Enabled), 5, 0), true);
      edtavTot_mts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTot_mts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTot_mts_Enabled), 5, 0), true);
      edtavVolumenes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavVolumenes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavVolumenes_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup24Q0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1624Q2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV137DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_149 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_149"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV167Rep = (short)(localUtil.ctol( httpContext.cgiGet( "vREP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV156Rep2 = (short)(localUtil.ctol( httpContext.cgiGet( "vREP2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV160Volumen2 = (int)(localUtil.ctol( httpContext.cgiGet( "vVOLUMEN2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV159Volumenc = (int)(localUtil.ctol( httpContext.cgiGet( "vVOLUMENC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV158VolPar = (int)(localUtil.ctol( httpContext.cgiGet( "vVOLPAR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV5RecLtssr = (int)(localUtil.ctol( httpContext.cgiGet( "vRECLTSSR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV169i = (short)(localUtil.ctol( httpContext.cgiGet( "vI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Dvpanel_panel_filtrosgenerales_Width = httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Width") ;
         Dvpanel_panel_filtrosgenerales_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Autowidth")) ;
         Dvpanel_panel_filtrosgenerales_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Autoheight")) ;
         Dvpanel_panel_filtrosgenerales_Cls = httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Cls") ;
         Dvpanel_panel_filtrosgenerales_Title = httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Title") ;
         Dvpanel_panel_filtrosgenerales_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Collapsible")) ;
         Dvpanel_panel_filtrosgenerales_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Collapsed")) ;
         Dvpanel_panel_filtrosgenerales_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Showcollapseicon")) ;
         Dvpanel_panel_filtrosgenerales_Iconposition = httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Iconposition") ;
         Dvpanel_panel_filtrosgenerales_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Autoscroll")) ;
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
         Dvelop_confirmpanel_confirmar_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Title") ;
         Dvelop_confirmpanel_confirmar_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmationtext") ;
         Dvelop_confirmpanel_confirmar_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_confirmar_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmtype") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Ddo_grid_Activeeventkey = httpContext.cgiGet( "DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( "DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( "DDO_GRID_Selectedcolumn") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( "DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( "DDO_GRID_Filteredtextto_get") ;
         Dvelop_confirmpanel_confirmar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Result") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavFacabs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavFacabs_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFACABS");
            GX_FocusControl = edtavFacabs_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV150FacAbs = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV150FacAbs", GXutil.ltrimstr( AV150FacAbs, 6, 2));
         }
         else
         {
            AV150FacAbs = localUtil.ctond( httpContext.cgiGet( edtavFacabs_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV150FacAbs", GXutil.ltrimstr( AV150FacAbs, 6, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavVolumen_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavVolumen_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vVOLUMEN");
            GX_FocusControl = edtavVolumen_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV151Volumen = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV151Volumen", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV151Volumen), 5, 0));
         }
         else
         {
            AV151Volumen = (int)(localUtil.ctol( httpContext.cgiGet( edtavVolumen_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV151Volumen", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV151Volumen), 5, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavTot_kgs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavTot_kgs_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTOT_KGS");
            GX_FocusControl = edtavTot_kgs_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV152Tot_kgs = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV152Tot_kgs", GXutil.ltrimstr( AV152Tot_kgs, 9, 2));
         }
         else
         {
            AV152Tot_kgs = localUtil.ctond( httpContext.cgiGet( edtavTot_kgs_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV152Tot_kgs", GXutil.ltrimstr( AV152Tot_kgs, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavTot_mts_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavTot_mts_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTOT_MTS");
            GX_FocusControl = edtavTot_mts_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV153Tot_mts = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV153Tot_mts", GXutil.ltrimstr( AV153Tot_mts, 9, 2));
         }
         else
         {
            AV153Tot_mts = localUtil.ctond( httpContext.cgiGet( edtavTot_mts_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV153Tot_mts", GXutil.ltrimstr( AV153Tot_mts, 9, 2));
         }
         AV155Volumenes = httpContext.cgiGet( edtavVolumenes_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV155Volumenes", AV155Volumenes);
         AV185Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV185Pgmname", AV185Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"RecetadeAcabado01_WP");
         AV185Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV185Pgmname", AV185Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV185Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("recetasdeacabados\\recetadeacabado01_wp:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e1624Q2 ();
      if (returnInSub) return;
   }

   public void e1624Q2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV161Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      recetadeacabado01_wp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV161Station = GXt_char1 ;
      GXv_char2[0] = AV12EmprCod ;
      GXv_char3[0] = AV162EmprNom ;
      GXv_char4[0] = AV163UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV161Station, GXv_char2, GXv_char3, GXv_char4) ;
      recetadeacabado01_wp_impl.this.AV12EmprCod = GXv_char2[0] ;
      recetadeacabado01_wp_impl.this.AV162EmprNom = GXv_char3[0] ;
      recetadeacabado01_wp_impl.this.AV163UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12EmprCod", AV12EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV163UsurCod", AV163UsurCod);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " FASQUI", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      if ( AV45OrderedBy < 1 )
      {
         AV45OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV137DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV137DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      GXt_int7 = AV165VolMul ;
      GXv_int8[0] = GXt_int7 ;
      new app.pbuscon(remoteHandle, context).execute( AV12EmprCod, httpContext.getMessage( "VOLMUL", ""), GXv_int8) ;
      recetadeacabado01_wp_impl.this.GXt_int7 = GXv_int8[0] ;
      AV165VolMul = (short)(GXt_int7) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV165VolMul", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV165VolMul), 4, 0));
      /* Execute user subroutine: 'SUMO_KGS' */
      S142 ();
      if (returnInSub) return;
      AV150FacAbs = ((DecimalUtil.compareTo(DecimalUtil.ZERO, AV18ArtFacabs)==0) ? DecimalUtil.doubleToDec(100) : AV18ArtFacabs) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV150FacAbs", GXutil.ltrimstr( AV150FacAbs, 6, 2));
      GXt_int7 = AV151Volumen ;
      GXv_decimal9[0] = AV150FacAbs ;
      GXv_int8[0] = AV25MaqVolRes ;
      GXv_int10[0] = (byte)(AV165VolMul) ;
      GXv_decimal11[0] = AV152Tot_kgs ;
      GXv_int12[0] = GXt_int7 ;
      new app.pcalvol(remoteHandle, context).execute( GXv_decimal9, GXv_int8, GXv_int10, GXv_decimal11, GXv_int12) ;
      recetadeacabado01_wp_impl.this.AV150FacAbs = GXv_decimal9[0] ;
      recetadeacabado01_wp_impl.this.AV25MaqVolRes = GXv_int8[0] ;
      recetadeacabado01_wp_impl.this.AV165VolMul = GXv_int10[0] ;
      recetadeacabado01_wp_impl.this.AV152Tot_kgs = GXv_decimal11[0] ;
      recetadeacabado01_wp_impl.this.GXt_int7 = GXv_int12[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV150FacAbs", GXutil.ltrimstr( AV150FacAbs, 6, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV25MaqVolRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25MaqVolRes), 5, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV165VolMul", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV165VolMul), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV152Tot_kgs", GXutil.ltrimstr( AV152Tot_kgs, 9, 2));
      AV151Volumen = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV151Volumen", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV151Volumen), 5, 0));
      /* Execute user subroutine: 'TOPE_BANYO' */
      S152 ();
      if (returnInSub) return;
      AV178ErrMensaje = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV178ErrMensaje", AV178ErrMensaje);
   }

   public void e1724Q2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext13[0] = AV39WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext13) ;
      AV39WWPContext = GXv_SdtWWPContext13[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S162 ();
      if (returnInSub) return;
      AV186Recetasdeacabados_recetadeacabado01_wpds_1_tffascod = AV71TFFasCod ;
      AV187Recetasdeacabados_recetadeacabado01_wpds_2_tffascod_sel = AV72TFFasCod_Sel ;
      AV188Recetasdeacabados_recetadeacabado01_wpds_3_tffasdsc = AV142TFFasDsc ;
      AV189Recetasdeacabados_recetadeacabado01_wpds_4_tffasdsc_sel = AV143TFFasDsc_Sel ;
      AV190Recetasdeacabados_recetadeacabado01_wpds_5_tffasquilin = AV144TFFasQuiLin ;
      AV191Recetasdeacabados_recetadeacabado01_wpds_6_tffasquilin_to = AV145TFFasQuiLin_To ;
      AV192Recetasdeacabados_recetadeacabado01_wpds_7_tfproforcod = AV146TFProForCod ;
      AV193Recetasdeacabados_recetadeacabado01_wpds_8_tfproforcod_sel = AV147TFProForCod_Sel ;
      AV194Recetasdeacabados_recetadeacabado01_wpds_9_tfprofordsc = AV148TFProForDsc ;
      AV195Recetasdeacabados_recetadeacabado01_wpds_10_tfprofordsc_sel = AV149TFProForDsc_Sel ;
   }

   public void e1324Q2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV45OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45OrderedBy), 4, 0));
         AV46OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46OrderedDsc", AV46OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasCod") == 0 )
         {
            AV71TFFasCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71TFFasCod", AV71TFFasCod);
            AV72TFFasCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV72TFFasCod_Sel", AV72TFFasCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasDsc") == 0 )
         {
            AV142TFFasDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV142TFFasDsc", AV142TFFasDsc);
            AV143TFFasDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV143TFFasDsc_Sel", AV143TFFasDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasQuiLin") == 0 )
         {
            AV144TFFasQuiLin = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV144TFFasQuiLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV144TFFasQuiLin), 4, 0));
            AV145TFFasQuiLin_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV145TFFasQuiLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV145TFFasQuiLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProForCod") == 0 )
         {
            AV146TFProForCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV146TFProForCod", AV146TFProForCod);
            AV147TFProForCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV147TFProForCod_Sel", AV147TFProForCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProForDsc") == 0 )
         {
            AV148TFProForDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV148TFProForDsc", AV148TFProForDsc);
            AV149TFProForDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV149TFProForDsc_Sel", AV149TFProForDsc_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e1824Q2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(149) ;
      }
      sendrow_1492( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_149_Refreshing )
      {
         httpContext.doAjaxLoad(149, GridRow);
      }
   }

   public void e1424Q2( )
   {
      /* Dvelop_confirmpanel_confirmar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_confirmar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION CONFIRMAR' */
         S172 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV175Hdrscreadas_SDTs", AV175Hdrscreadas_SDTs);
   }

   public void S132( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV45OrderedBy, 4, 0))+":"+(AV46OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S172( )
   {
      /* 'DO ACTION CONFIRMAR' Routine */
      returnInSub = false ;
      AV170LinPro = (byte)(5) ;
      if ( AV167Rep == 1 )
      {
         GX_I = 1 ;
         while ( GX_I <= 100 )
         {
            AV157Tab_vol[GX_I-1] = 0 ;
            GX_I = (int)(GX_I+1) ;
         }
         AV157Tab_vol[1-1] = AV151Volumen ;
      }
      else
      {
         AV169i = (short)(1) ;
         AV180t = (short)(1) ;
         while ( AV169i <= AV167Rep )
         {
            AV157Tab_vol[AV169i-1] = (int)(GXutil.lval( GXutil.substring( AV173tabladevolumenes, AV180t, 5))) ;
            AV169i = (short)(AV169i+1) ;
            AV180t = (short)(AV180t+5) ;
         }
      }
      AV169i = (short)(1) ;
      GX_I = 1 ;
      while ( GX_I <= 3 )
      {
         AV172Tabla_Hdr[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV176HdrscreadasToJson = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV176HdrscreadasToJson", AV176HdrscreadasToJson);
      /* Start For Each Line */
      nRC_GXsfl_149 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_149"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      nGXsfl_149_fel_idx = 0 ;
      while ( nGXsfl_149_fel_idx < nRC_GXsfl_149 )
      {
         nGXsfl_149_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_149_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_149_fel_idx+1) ;
         sGXsfl_149_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_149_fel_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_fel_1492( ) ;
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
         A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
         A194BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV168Seleccionar = GXutil.strtobool( httpContext.cgiGet( chkavSeleccionar.getInternalname())) ;
         A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
         A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
         A5371FasQuiLin = (short)(localUtil.ctol( httpContext.cgiGet( edtFasQuiLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A764ProForCod = httpContext.cgiGet( edtProForCod_Internalname) ;
         A766ProForDsc = httpContext.cgiGet( edtProForDsc_Internalname) ;
         if ( AV168Seleccionar )
         {
            while ( AV169i <= 100 )
            {
               if ( AV157Tab_vol[AV169i-1] == 0 )
               {
                  if (true) break;
               }
               AV198Volumeni = AV157Tab_vol[AV169i-1] ;
               GXv_char4[0] = AV12EmprCod ;
               GXv_int12[0] = AV13BarCod ;
               GXv_int10[0] = AV14BarCodReo ;
               GXv_char3[0] = AV15BarCodPar ;
               new app.prac033(remoteHandle, context).execute( GXv_char4, GXv_int12, GXv_int10, GXv_char3) ;
               recetadeacabado01_wp_impl.this.AV12EmprCod = GXv_char4[0] ;
               recetadeacabado01_wp_impl.this.AV13BarCod = GXv_int12[0] ;
               recetadeacabado01_wp_impl.this.AV14BarCodReo = GXv_int10[0] ;
               recetadeacabado01_wp_impl.this.AV15BarCodPar = GXv_char3[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV12EmprCod", AV12EmprCod);
               httpContext.ajax_rsp_assign_attri("", false, "AV13BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13BarCod), 8, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV14BarCodReo", GXutil.str( AV14BarCodReo, 1, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV15BarCodPar", AV15BarCodPar);
               GXv_char4[0] = AV12EmprCod ;
               GXv_int12[0] = AV13BarCod ;
               GXv_int10[0] = AV14BarCodReo ;
               GXv_char3[0] = AV15BarCodPar ;
               GXv_decimal11[0] = AV152Tot_kgs ;
               GXv_decimal9[0] = AV153Tot_mts ;
               GXv_decimal14[0] = AV150FacAbs ;
               GXv_int8[0] = AV6CliCod ;
               GXv_char2[0] = AV20BarSer ;
               GXv_char15[0] = AV21Procod ;
               GXv_char16[0] = AV23MaqCod ;
               GXv_char17[0] = A457FasCod ;
               GXv_char18[0] = A764ProForCod ;
               GXv_int19[0] = AV198Volumeni ;
               GXv_int20[0] = AV170LinPro ;
               GXv_char21[0] = AV163UsurCod ;
               GXv_int22[0] = AV177RecLinMaq ;
               GXv_int23[0] = A194BarOrdLin ;
               GXv_int24[0] = AV164LtsRec ;
               GXv_decimal25[0] = AV181Abs2 ;
               GXv_char26[0] = AV36Var1 ;
               new app.prac001(remoteHandle, context).execute( GXv_char4, GXv_int12, GXv_int10, GXv_char3, GXv_decimal11, GXv_decimal9, GXv_decimal14, GXv_int8, GXv_char2, GXv_char15, GXv_char16, GXv_char17, GXv_char18, GXv_int19, GXv_int20, GXv_char21, GXv_int22, GXv_int23, GXv_int24, GXv_decimal25, GXv_char26) ;
               recetadeacabado01_wp_impl.this.AV12EmprCod = GXv_char4[0] ;
               recetadeacabado01_wp_impl.this.AV13BarCod = GXv_int12[0] ;
               recetadeacabado01_wp_impl.this.AV14BarCodReo = GXv_int10[0] ;
               recetadeacabado01_wp_impl.this.AV15BarCodPar = GXv_char3[0] ;
               recetadeacabado01_wp_impl.this.AV152Tot_kgs = GXv_decimal11[0] ;
               recetadeacabado01_wp_impl.this.AV153Tot_mts = GXv_decimal9[0] ;
               recetadeacabado01_wp_impl.this.AV150FacAbs = GXv_decimal14[0] ;
               recetadeacabado01_wp_impl.this.AV6CliCod = GXv_int8[0] ;
               recetadeacabado01_wp_impl.this.AV20BarSer = GXv_char2[0] ;
               recetadeacabado01_wp_impl.this.AV21Procod = GXv_char15[0] ;
               recetadeacabado01_wp_impl.this.AV23MaqCod = GXv_char16[0] ;
               recetadeacabado01_wp_impl.this.A457FasCod = GXv_char17[0] ;
               recetadeacabado01_wp_impl.this.A764ProForCod = GXv_char18[0] ;
               recetadeacabado01_wp_impl.this.AV198Volumeni = GXv_int19[0] ;
               recetadeacabado01_wp_impl.this.AV170LinPro = GXv_int20[0] ;
               recetadeacabado01_wp_impl.this.AV163UsurCod = GXv_char21[0] ;
               recetadeacabado01_wp_impl.this.AV177RecLinMaq = GXv_int22[0] ;
               recetadeacabado01_wp_impl.this.A194BarOrdLin = GXv_int23[0] ;
               recetadeacabado01_wp_impl.this.AV164LtsRec = (short)((short)(GXv_int24[0])) ;
               recetadeacabado01_wp_impl.this.AV181Abs2 = GXv_decimal25[0] ;
               recetadeacabado01_wp_impl.this.AV36Var1 = GXv_char26[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV12EmprCod", AV12EmprCod);
               httpContext.ajax_rsp_assign_attri("", false, "AV13BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13BarCod), 8, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV14BarCodReo", GXutil.str( AV14BarCodReo, 1, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV15BarCodPar", AV15BarCodPar);
               httpContext.ajax_rsp_assign_attri("", false, "AV152Tot_kgs", GXutil.ltrimstr( AV152Tot_kgs, 9, 2));
               httpContext.ajax_rsp_assign_attri("", false, "AV153Tot_mts", GXutil.ltrimstr( AV153Tot_mts, 9, 2));
               httpContext.ajax_rsp_assign_attri("", false, "AV150FacAbs", GXutil.ltrimstr( AV150FacAbs, 6, 2));
               httpContext.ajax_rsp_assign_attri("", false, "AV6CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6CliCod), 6, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV20BarSer", AV20BarSer);
               httpContext.ajax_rsp_assign_attri("", false, "AV21Procod", AV21Procod);
               httpContext.ajax_rsp_assign_attri("", false, "AV23MaqCod", AV23MaqCod);
               httpContext.ajax_rsp_assign_attri("", false, "AV163UsurCod", AV163UsurCod);
               httpContext.ajax_rsp_assign_attri("", false, "AV177RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV177RecLinMaq), 4, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV164LtsRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV164LtsRec), 4, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV181Abs2", GXutil.ltrimstr( AV181Abs2, 6, 2));
               httpContext.ajax_rsp_assign_attri("", false, "AV36Var1", AV36Var1);
               GXv_char26[0] = AV12EmprCod ;
               GXv_int24[0] = AV13BarCod ;
               GXv_int20[0] = AV14BarCodReo ;
               GXv_char21[0] = AV15BarCodPar ;
               GXv_int23[0] = AV177RecLinMaq ;
               GXv_char18[0] = "N" ;
               new app.prac004(remoteHandle, context).execute( GXv_char26, GXv_int24, GXv_int20, GXv_char21, GXv_int23, GXv_char18) ;
               recetadeacabado01_wp_impl.this.AV12EmprCod = GXv_char26[0] ;
               recetadeacabado01_wp_impl.this.AV13BarCod = GXv_int24[0] ;
               recetadeacabado01_wp_impl.this.AV14BarCodReo = GXv_int20[0] ;
               recetadeacabado01_wp_impl.this.AV15BarCodPar = GXv_char21[0] ;
               recetadeacabado01_wp_impl.this.AV177RecLinMaq = GXv_int23[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV12EmprCod", AV12EmprCod);
               httpContext.ajax_rsp_assign_attri("", false, "AV13BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13BarCod), 8, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV14BarCodReo", GXutil.str( AV14BarCodReo, 1, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV15BarCodPar", AV15BarCodPar);
               httpContext.ajax_rsp_assign_attri("", false, "AV177RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV177RecLinMaq), 4, 0));
               GXv_char26[0] = AV12EmprCod ;
               GXv_int24[0] = AV13BarCod ;
               GXv_int20[0] = AV14BarCodReo ;
               GXv_char21[0] = AV15BarCodPar ;
               GXv_int23[0] = AV177RecLinMaq ;
               new app.prenum(remoteHandle, context).execute( GXv_char26, GXv_int24, GXv_int20, GXv_char21, GXv_int23) ;
               recetadeacabado01_wp_impl.this.AV12EmprCod = GXv_char26[0] ;
               recetadeacabado01_wp_impl.this.AV13BarCod = GXv_int24[0] ;
               recetadeacabado01_wp_impl.this.AV14BarCodReo = GXv_int20[0] ;
               recetadeacabado01_wp_impl.this.AV15BarCodPar = GXv_char21[0] ;
               recetadeacabado01_wp_impl.this.AV177RecLinMaq = GXv_int23[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV12EmprCod", AV12EmprCod);
               httpContext.ajax_rsp_assign_attri("", false, "AV13BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13BarCod), 8, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV14BarCodReo", GXutil.str( AV14BarCodReo, 1, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV15BarCodPar", AV15BarCodPar);
               httpContext.ajax_rsp_assign_attri("", false, "AV177RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV177RecLinMaq), 4, 0));
               AV174Hdrscreadas_SDT = (app.SdtHdrscreadas_SDT)new app.SdtHdrscreadas_SDT(remoteHandle, context);
               AV174Hdrscreadas_SDT.setgxTv_SdtHdrscreadas_SDT_Barcod( AV13BarCod );
               AV174Hdrscreadas_SDT.setgxTv_SdtHdrscreadas_SDT_Barcodreo( AV14BarCodReo );
               AV174Hdrscreadas_SDT.setgxTv_SdtHdrscreadas_SDT_Barcodpar( AV15BarCodPar );
               AV174Hdrscreadas_SDT.setgxTv_SdtHdrscreadas_SDT_Reclinmaq( AV177RecLinMaq );
               AV175Hdrscreadas_SDTs.add(AV174Hdrscreadas_SDT, 0);
               AV169i = (short)(AV169i+1) ;
            }
            AV170LinPro = (byte)(AV170LinPro+5) ;
         }
         /* End For Each Line */
      }
      if ( nGXsfl_149_fel_idx == 0 )
      {
         nGXsfl_149_idx = 1 ;
         sGXsfl_149_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_149_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1492( ) ;
      }
      nGXsfl_149_fel_idx = 1 ;
      AV176HdrscreadasToJson = AV175Hdrscreadas_SDTs.toJSonString(false) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV176HdrscreadasToJson", AV176HdrscreadasToJson);
      if ( AV170LinPro > 5 )
      {
         GXv_char26[0] = AV12EmprCod ;
         GXv_int24[0] = AV13BarCod ;
         GXv_int20[0] = AV14BarCodReo ;
         GXv_char21[0] = AV15BarCodPar ;
         new app.prac002(remoteHandle, context).execute( GXv_char26, GXv_int24, GXv_int20, GXv_char21) ;
         recetadeacabado01_wp_impl.this.AV12EmprCod = GXv_char26[0] ;
         recetadeacabado01_wp_impl.this.AV13BarCod = GXv_int24[0] ;
         recetadeacabado01_wp_impl.this.AV14BarCodReo = GXv_int20[0] ;
         recetadeacabado01_wp_impl.this.AV15BarCodPar = GXv_char21[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12EmprCod", AV12EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV13BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV14BarCodReo", GXutil.str( AV14BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV15BarCodPar", AV15BarCodPar);
         AV178ErrMensaje = httpContext.getMessage( "Proceso finalizado con exito!", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV178ErrMensaje", AV178ErrMensaje);
         httpContext.GX_msglist.addItem(AV178ErrMensaje);
         httpContext.setWebReturnParms(new Object[] {AV178ErrMensaje,AV176HdrscreadasToJson});
         httpContext.setWebReturnParmsMetadata(new Object[] {"AV178ErrMensaje","AV176HdrscreadasToJson"});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV55Session.getValue(AV185Pgmname+"GridState"), "") == 0 )
      {
         AV43GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV185Pgmname+"GridState"), null, null);
      }
      else
      {
         AV43GridState.fromxml(AV55Session.getValue(AV185Pgmname+"GridState"), null, null);
      }
      AV45OrderedBy = AV43GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45OrderedBy), 4, 0));
      AV46OrderedDsc = AV43GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46OrderedDsc", AV46OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S132 ();
      if (returnInSub) return;
      AV199GXV1 = 1 ;
      while ( AV199GXV1 <= AV43GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV44GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV43GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV199GXV1));
         if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD") == 0 )
         {
            AV71TFFasCod = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71TFFasCod", AV71TFFasCod);
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD_SEL") == 0 )
         {
            AV72TFFasCod_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV72TFFasCod_Sel", AV72TFFasCod_Sel);
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC") == 0 )
         {
            AV142TFFasDsc = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV142TFFasDsc", AV142TFFasDsc);
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC_SEL") == 0 )
         {
            AV143TFFasDsc_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV143TFFasDsc_Sel", AV143TFFasDsc_Sel);
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASQUILIN") == 0 )
         {
            AV144TFFasQuiLin = (short)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV144TFFasQuiLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV144TFFasQuiLin), 4, 0));
            AV145TFFasQuiLin_To = (short)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV145TFFasQuiLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV145TFFasQuiLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORCOD") == 0 )
         {
            AV146TFProForCod = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV146TFProForCod", AV146TFProForCod);
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORCOD_SEL") == 0 )
         {
            AV147TFProForCod_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV147TFProForCod_Sel", AV147TFProForCod_Sel);
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORDSC") == 0 )
         {
            AV148TFProForDsc = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV148TFProForDsc", AV148TFProForDsc);
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORDSC_SEL") == 0 )
         {
            AV149TFProForDsc_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV149TFProForDsc_Sel", AV149TFProForDsc_Sel);
         }
         AV199GXV1 = (int)(AV199GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char26[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV72TFFasCod_Sel)==0), AV72TFFasCod_Sel, GXv_char26) ;
      recetadeacabado01_wp_impl.this.GXt_char1 = GXv_char26[0] ;
      GXt_char27 = "" ;
      GXv_char21[0] = GXt_char27 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV143TFFasDsc_Sel)==0), AV143TFFasDsc_Sel, GXv_char21) ;
      recetadeacabado01_wp_impl.this.GXt_char27 = GXv_char21[0] ;
      GXt_char28 = "" ;
      GXv_char18[0] = GXt_char28 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV147TFProForCod_Sel)==0), AV147TFProForCod_Sel, GXv_char18) ;
      recetadeacabado01_wp_impl.this.GXt_char28 = GXv_char18[0] ;
      GXt_char29 = "" ;
      GXv_char17[0] = GXt_char29 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV149TFProForDsc_Sel)==0), AV149TFProForDsc_Sel, GXv_char17) ;
      recetadeacabado01_wp_impl.this.GXt_char29 = GXv_char17[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"|"+GXt_char27+"||"+GXt_char28+"|"+GXt_char29 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char29 = "" ;
      GXv_char26[0] = GXt_char29 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV71TFFasCod)==0), AV71TFFasCod, GXv_char26) ;
      recetadeacabado01_wp_impl.this.GXt_char29 = GXv_char26[0] ;
      GXt_char28 = "" ;
      GXv_char21[0] = GXt_char28 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV142TFFasDsc)==0), AV142TFFasDsc, GXv_char21) ;
      recetadeacabado01_wp_impl.this.GXt_char28 = GXv_char21[0] ;
      GXt_char27 = "" ;
      GXv_char18[0] = GXt_char27 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV146TFProForCod)==0), AV146TFProForCod, GXv_char18) ;
      recetadeacabado01_wp_impl.this.GXt_char27 = GXv_char18[0] ;
      GXt_char1 = "" ;
      GXv_char17[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV148TFProForDsc)==0), AV148TFProForDsc, GXv_char17) ;
      recetadeacabado01_wp_impl.this.GXt_char1 = GXv_char17[0] ;
      Ddo_grid_Filteredtext_set = GXt_char29+"|"+GXt_char28+"|"+((0==AV144TFFasQuiLin) ? "" : GXutil.str( AV144TFFasQuiLin, 4, 0))+"|"+GXt_char27+"|"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "||"+((0==AV145TFFasQuiLin_To) ? "" : GXutil.str( AV145TFFasQuiLin_To, 4, 0))+"||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
      if ( ! (GXutil.strcmp("", GXutil.trim( AV43GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV43GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV43GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S162( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV43GridState.fromxml(AV55Session.getValue(AV185Pgmname+"GridState"), null, null);
      AV43GridState.setgxTv_SdtWWPGridState_Orderedby( AV45OrderedBy );
      AV43GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV46OrderedDsc );
      AV43GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState30[0] = AV43GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFFASCOD", "", !(GXutil.strcmp("", AV71TFFasCod)==0), (short)(0), AV71TFFasCod, "", !(GXutil.strcmp("", AV72TFFasCod_Sel)==0), AV72TFFasCod_Sel, "") ;
      AV43GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV43GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFFASDSC", "", !(GXutil.strcmp("", AV142TFFasDsc)==0), (short)(0), AV142TFFasDsc, "", !(GXutil.strcmp("", AV143TFFasDsc_Sel)==0), AV143TFFasDsc_Sel, "") ;
      AV43GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV43GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFFASQUILIN", "", !((0==AV144TFFasQuiLin)&&(0==AV145TFFasQuiLin_To)), (short)(0), GXutil.trim( GXutil.str( AV144TFFasQuiLin, 4, 0)), GXutil.trim( GXutil.str( AV145TFFasQuiLin_To, 4, 0))) ;
      AV43GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV43GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFPROFORCOD", "", !(GXutil.strcmp("", AV146TFProForCod)==0), (short)(0), AV146TFProForCod, "", !(GXutil.strcmp("", AV147TFProForCod_Sel)==0), AV147TFProForCod_Sel, "") ;
      AV43GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV43GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFPROFORDSC", "", !(GXutil.strcmp("", AV148TFProForDsc)==0), (short)(0), AV148TFProForDsc, "", !(GXutil.strcmp("", AV149TFProForDsc_Sel)==0), AV149TFProForDsc_Sel, "") ;
      AV43GridState = GXv_SdtWWPGridState30[0] ;
      AV43GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV43GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV185Pgmname+"GridState", AV43GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV41TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV41TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV185Pgmname );
      AV41TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV41TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV40HTTPRequest.getScriptName()+"?"+AV40HTTPRequest.getQuerystring() );
      AV41TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "RecetasDeAcabados.FASQUI" );
      AV55Session.setValue("TrnContext", AV41TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void e1524Q2( )
   {
      /* Facabs_Isvalid Routine */
      returnInSub = false ;
      if ( AV5RecLtssr == 0 )
      {
         GXt_int7 = AV151Volumen ;
         GXv_decimal25[0] = AV150FacAbs ;
         GXv_int24[0] = AV25MaqVolRes ;
         GXv_int20[0] = (byte)(AV165VolMul) ;
         GXv_decimal14[0] = AV152Tot_kgs ;
         GXv_int19[0] = GXt_int7 ;
         new app.pcalvol(remoteHandle, context).execute( GXv_decimal25, GXv_int24, GXv_int20, GXv_decimal14, GXv_int19) ;
         recetadeacabado01_wp_impl.this.AV150FacAbs = GXv_decimal25[0] ;
         recetadeacabado01_wp_impl.this.AV25MaqVolRes = GXv_int24[0] ;
         recetadeacabado01_wp_impl.this.AV165VolMul = GXv_int20[0] ;
         recetadeacabado01_wp_impl.this.AV152Tot_kgs = GXv_decimal14[0] ;
         recetadeacabado01_wp_impl.this.GXt_int7 = GXv_int19[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV150FacAbs", GXutil.ltrimstr( AV150FacAbs, 6, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV25MaqVolRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25MaqVolRes), 5, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV165VolMul", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV165VolMul), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV152Tot_kgs", GXutil.ltrimstr( AV152Tot_kgs, 9, 2));
         AV151Volumen = GXt_int7 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV151Volumen", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV151Volumen), 5, 0));
         /* Execute user subroutine: 'TOPE_BANYO' */
         S152 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void S142( )
   {
      /* 'SUMO_KGS' Routine */
      returnInSub = false ;
      AV152Tot_kgs = AV16BarKgm ;
      httpContext.ajax_rsp_assign_attri("", false, "AV152Tot_kgs", GXutil.ltrimstr( AV152Tot_kgs, 9, 2));
      AV154OldKgs = AV16BarKgm ;
      AV153Tot_mts = AV17BarMtr ;
      httpContext.ajax_rsp_assign_attri("", false, "AV153Tot_mts", GXutil.ltrimstr( AV153Tot_mts, 9, 2));
      /* Optimized group. */
      /* Using cursor H024Q4 */
      pr_default.execute(2, new Object[] {AV12EmprCod, Integer.valueOf(AV13BarCod), Byte.valueOf(AV14BarCodReo), AV15BarCodPar});
      c6035Ac_Kilos = H024Q4_A6035Ac_Kilos[0] ;
      n6035Ac_Kilos = H024Q4_n6035Ac_Kilos[0] ;
      c6035Ac_Kilos = H024Q4_A6035Ac_Kilos[0] ;
      n6035Ac_Kilos = H024Q4_n6035Ac_Kilos[0] ;
      c6034Ac_Metros = H024Q4_A6034Ac_Metros[0] ;
      n6034Ac_Metros = H024Q4_n6034Ac_Metros[0] ;
      pr_default.close(2);
      AV152Tot_kgs = AV152Tot_kgs.add(c6035Ac_Kilos) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV152Tot_kgs", GXutil.ltrimstr( AV152Tot_kgs, 9, 2));
      AV154OldKgs = AV154OldKgs.add(c6035Ac_Kilos) ;
      AV153Tot_mts = AV153Tot_mts.add(c6034Ac_Metros) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV153Tot_mts", GXutil.ltrimstr( AV153Tot_mts, 9, 2));
      /* End optimized group. */
   }

   public void S152( )
   {
      /* 'TOPE_BANYO' Routine */
      returnInSub = false ;
      if ( AV26MaqVolTop > 0 )
      {
         if ( ( GXutil.Int( AV151Volumen/ (double) (AV26MaqVolTop)) == AV151Volumen / (double) ( AV26MaqVolTop ) ) )
         {
            AV167Rep = (short)(GXutil.Int( AV151Volumen/ (double) (AV26MaqVolTop))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV167Rep", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV167Rep), 4, 0));
         }
         else
         {
            AV167Rep = (short)(GXutil.Int( AV151Volumen/ (double) (AV26MaqVolTop))+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV167Rep", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV167Rep), 4, 0));
         }
         AV156Rep2 = (short)(1) ;
         AV160Volumen2 = AV151Volumen ;
         AV155Volumenes = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV155Volumenes", AV155Volumenes);
         GX_I = 1 ;
         while ( GX_I <= 100 )
         {
            AV157Tab_vol[GX_I-1] = 0 ;
            GX_I = (int)(GX_I+1) ;
         }
         while ( AV156Rep2 <= AV167Rep )
         {
            AV159Volumenc = (int)(AV160Volumen2-AV156Rep2*AV26MaqVolTop) ;
            if ( AV159Volumenc < 0 )
            {
               AV158VolPar = (int)(AV160Volumen2-(AV156Rep2-1)*AV26MaqVolTop) ;
            }
            else
            {
               AV158VolPar = AV26MaqVolTop ;
            }
            AV157Tab_vol[AV156Rep2-1] = AV158VolPar ;
            AV156Rep2 = (short)(AV156Rep2+1) ;
            if ( (GXutil.strcmp("", AV155Volumenes)==0) )
            {
               AV155Volumenes = GXutil.trim( GXutil.str( AV158VolPar, 5, 0)) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV155Volumenes", AV155Volumenes);
            }
            else
            {
               AV155Volumenes = GXutil.concat( AV155Volumenes, GXutil.trim( GXutil.str( AV158VolPar, 5, 0)), "-") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV155Volumenes", AV155Volumenes);
            }
         }
      }
   }

   public void wb_table1_173_24Q2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_confirmar_Internalname, tblTabledvelop_confirmpanel_confirmar_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_confirmar.setProperty("Title", Dvelop_confirmpanel_confirmar_Title);
         ucDvelop_confirmpanel_confirmar.setProperty("ConfirmationText", Dvelop_confirmpanel_confirmar_Confirmationtext);
         ucDvelop_confirmpanel_confirmar.setProperty("YesButtonCaption", Dvelop_confirmpanel_confirmar_Yesbuttoncaption);
         ucDvelop_confirmpanel_confirmar.setProperty("NoButtonCaption", Dvelop_confirmpanel_confirmar_Nobuttoncaption);
         ucDvelop_confirmpanel_confirmar.setProperty("CancelButtonCaption", Dvelop_confirmpanel_confirmar_Cancelbuttoncaption);
         ucDvelop_confirmpanel_confirmar.setProperty("YesButtonPosition", Dvelop_confirmpanel_confirmar_Yesbuttonposition);
         ucDvelop_confirmpanel_confirmar.setProperty("ConfirmType", Dvelop_confirmpanel_confirmar_Confirmtype);
         ucDvelop_confirmpanel_confirmar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_confirmar_Internalname, "DVELOP_CONFIRMPANEL_CONFIRMARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_CONFIRMARContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_173_24Q2e( true) ;
      }
      else
      {
         wb_table1_173_24Q2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV12EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12EmprCod", AV12EmprCod);
      AV13BarCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13BarCod), 8, 0));
      AV14BarCodReo = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14BarCodReo", GXutil.str( AV14BarCodReo, 1, 0));
      AV15BarCodPar = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15BarCodPar", AV15BarCodPar);
      AV16BarKgm = (java.math.BigDecimal)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16BarKgm", GXutil.ltrimstr( AV16BarKgm, 9, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARKGM", getSecureSignedToken( "", localUtil.format( AV16BarKgm, "ZZZZZ9.99")));
      AV17BarMtr = (java.math.BigDecimal)getParm(obj,5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17BarMtr", GXutil.ltrimstr( AV17BarMtr, 9, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARMTR", getSecureSignedToken( "", localUtil.format( AV17BarMtr, "ZZZZZ9.99")));
      AV18ArtFacabs = (java.math.BigDecimal)getParm(obj,6) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18ArtFacabs", GXutil.ltrimstr( AV18ArtFacabs, 6, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTFACABS", getSecureSignedToken( "", localUtil.format( AV18ArtFacabs, "ZZ9.99")));
      AV6CliCod = ((Number) GXutil.testNumericType( getParm(obj,7), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6CliCod), 6, 0));
      AV19CliNom = (String)getParm(obj,8) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19CliNom", AV19CliNom);
      AV20BarSer = (String)getParm(obj,9) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20BarSer", AV20BarSer);
      AV7BarSerDsc = (String)getParm(obj,10) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7BarSerDsc", AV7BarSerDsc);
      AV21Procod = (String)getParm(obj,11) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Procod", AV21Procod);
      AV22ProDsc = (String)getParm(obj,12) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22ProDsc", AV22ProDsc);
      AV23MaqCod = (String)getParm(obj,13) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23MaqCod", AV23MaqCod);
      AV24MaqDsc = (String)getParm(obj,14) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24MaqDsc", AV24MaqDsc);
      AV25MaqVolRes = ((Number) GXutil.testNumericType( getParm(obj,15), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25MaqVolRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25MaqVolRes), 5, 0));
      AV26MaqVolTop = ((Number) GXutil.testNumericType( getParm(obj,16), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26MaqVolTop", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26MaqVolTop), 5, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQVOLTOP", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV26MaqVolTop), "ZZZZ9")));
      AV27BarAncCru1 = ((Number) GXutil.testNumericType( getParm(obj,17), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27BarAncCru1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27BarAncCru1), 3, 0));
      AV28PedidoCliente = (String)getParm(obj,18) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28PedidoCliente", AV28PedidoCliente);
      AV29BarPle = (String)getParm(obj,19) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29BarPle", AV29BarPle);
      AV34Contextura = (String)getParm(obj,20) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Contextura", AV34Contextura);
      AV9BarColNom = (String)getParm(obj,21) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9BarColNom", AV9BarColNom);
      AV10BarColNum = ((Number) GXutil.testNumericType( getParm(obj,22), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10BarColNum), 6, 0));
      AV30BarMat = (String)getParm(obj,23) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30BarMat", AV30BarMat);
      AV5RecLtssr = ((Number) GXutil.testNumericType( getParm(obj,24), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5RecLtssr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5RecLtssr), 5, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECLTSSR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV5RecLtssr), "ZZZZ9")));
      AV35LtsSob = ((Number) GXutil.testNumericType( getParm(obj,25), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35LtsSob", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35LtsSob), 5, 0));
      AV31Hrefacabs = (java.math.BigDecimal)getParm(obj,26) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Hrefacabs", GXutil.ltrimstr( AV31Hrefacabs, 6, 2));
      AV36Var1 = (String)getParm(obj,27) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36Var1", AV36Var1);
      AV37Msg_tosa = (String)getParm(obj,28) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37Msg_tosa", AV37Msg_tosa);
      AV11BarFasecod = (String)getParm(obj,29) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11BarFasecod", AV11BarFasecod);
      AV32BarFaseOrd = ((Number) GXutil.testNumericType( getParm(obj,30), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32BarFaseOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32BarFaseOrd), 4, 0));
      AV33barMaqTin = (String)getParm(obj,31) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33barMaqTin", AV33barMaqTin);
      AV179ErrMensaje1 = (String)getParm(obj,32) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV179ErrMensaje1", AV179ErrMensaje1);
      AV178ErrMensaje = (String)getParm(obj,33) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV178ErrMensaje", AV178ErrMensaje);
      AV176HdrscreadasToJson = (String)getParm(obj,34) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV176HdrscreadasToJson", AV176HdrscreadasToJson);
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
      pa24Q2( ) ;
      ws24Q2( ) ;
      we24Q2( ) ;
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
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116144840", true, true);
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
      httpContext.AddJavascriptSource("recetasdeacabados/recetadeacabado01_wp.js", "?202682116144840", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_1492( )
   {
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_149_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_149_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_149_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_149_idx ;
      edtProCod_Internalname = "PROCOD_"+sGXsfl_149_idx ;
      edtBarOrdLin_Internalname = "BARORDLIN_"+sGXsfl_149_idx ;
      chkavSeleccionar.setInternalname( "vSELECCIONAR_"+sGXsfl_149_idx );
      edtFasCod_Internalname = "FASCOD_"+sGXsfl_149_idx ;
      edtFasDsc_Internalname = "FASDSC_"+sGXsfl_149_idx ;
      edtFasQuiLin_Internalname = "FASQUILIN_"+sGXsfl_149_idx ;
      edtProForCod_Internalname = "PROFORCOD_"+sGXsfl_149_idx ;
      edtProForDsc_Internalname = "PROFORDSC_"+sGXsfl_149_idx ;
   }

   public void subsflControlProps_fel_1492( )
   {
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_149_fel_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_149_fel_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_149_fel_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_149_fel_idx ;
      edtProCod_Internalname = "PROCOD_"+sGXsfl_149_fel_idx ;
      edtBarOrdLin_Internalname = "BARORDLIN_"+sGXsfl_149_fel_idx ;
      chkavSeleccionar.setInternalname( "vSELECCIONAR_"+sGXsfl_149_fel_idx );
      edtFasCod_Internalname = "FASCOD_"+sGXsfl_149_fel_idx ;
      edtFasDsc_Internalname = "FASDSC_"+sGXsfl_149_fel_idx ;
      edtFasQuiLin_Internalname = "FASQUILIN_"+sGXsfl_149_fel_idx ;
      edtProForCod_Internalname = "PROFORCOD_"+sGXsfl_149_fel_idx ;
      edtProForDsc_Internalname = "PROFORDSC_"+sGXsfl_149_fel_idx ;
   }

   public void sendrow_1492( )
   {
      subsflControlProps_1492( ) ;
      wb24Q0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_149_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_149_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_149_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(149),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(149),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(149),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(149),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProCod_Internalname,GXutil.rtrim( A758ProCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(149),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarOrdLin_Internalname,GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarOrdLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(149),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavSeleccionar.getEnabled()!=0)&&(chkavSeleccionar.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 156,'',false,'"+sGXsfl_149_idx+"',149)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "vSELECCIONAR_" + sGXsfl_149_idx ;
         chkavSeleccionar.setName( GXCCtl );
         chkavSeleccionar.setWebtags( "" );
         chkavSeleccionar.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavSeleccionar.getInternalname(), "TitleCaption", chkavSeleccionar.getCaption(), !bGXsfl_149_Refreshing);
         chkavSeleccionar.setCheckedValue( "false" );
         AV168Seleccionar = GXutil.strtobool( GXutil.booltostr( AV168Seleccionar)) ;
         httpContext.ajax_rsp_assign_attri("", false, chkavSeleccionar.getInternalname(), AV168Seleccionar);
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavSeleccionar.getInternalname(),GXutil.booltostr( AV168Seleccionar),"","",Integer.valueOf(-1),Integer.valueOf(1),"true","",StyleString,ClassString,"WWColumn","",TempTags+" onclick="+"\"gx.fn.checkboxClick(156, this, 'true', 'false',"+"''"+");"+"gx.evt.onchange(this, event);\""+((chkavSeleccionar.getEnabled()!=0)&&(chkavSeleccionar.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,156);\"" : " ")});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasCod_Internalname,GXutil.rtrim( A457FasCod),GXutil.rtrim( localUtil.format( A457FasCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(149),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasDsc_Internalname,GXutil.rtrim( A460FasDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(149),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasQuiLin_Internalname,GXutil.ltrim( localUtil.ntoc( A5371FasQuiLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5371FasQuiLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasQuiLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(149),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForCod_Internalname,GXutil.rtrim( A764ProForCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(149),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForDsc_Internalname,GXutil.rtrim( A766ProForDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(149),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes24Q2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_149_idx = ((subGrid_Islastpage==1)&&(nGXsfl_149_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_149_idx+1) ;
         sGXsfl_149_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_149_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1492( ) ;
      }
      /* End function sendrow_1492 */
   }

   public void startgridcontrol149( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"149\">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Proceso", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Orden", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion de Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Proceso", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A758ProCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.booltostr( AV168Seleccionar));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A457FasCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A460FasDsc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5371FasQuiLin, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A764ProForCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A766ProForDsc));
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
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      edtavClicod_Internalname = "vCLICOD" ;
      edtavClinom_Internalname = "vCLINOM" ;
      edtavPedidocliente_Internalname = "vPEDIDOCLIENTE" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      edtavBarser_Internalname = "vBARSER" ;
      edtavBarserdsc_Internalname = "vBARSERDSC" ;
      edtavBarmat_Internalname = "vBARMAT" ;
      edtavBaranccru1_Internalname = "vBARANCCRU1" ;
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      edtavBarcolnom_Internalname = "vBARCOLNOM" ;
      edtavBarcolnum_Internalname = "vBARCOLNUM" ;
      divUnnamedtable8_Internalname = "UNNAMEDTABLE8" ;
      divPanel_filtrosgenerales_Internalname = "PANEL_FILTROSGENERALES" ;
      Dvpanel_panel_filtrosgenerales_Internalname = "DVPANEL_PANEL_FILTROSGENERALES" ;
      bttBtnconfirmar_Internalname = "BTNCONFIRMAR" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      edtavMaqcod_Internalname = "vMAQCOD" ;
      edtavMaqdsc_Internalname = "vMAQDSC" ;
      edtavMaqvolres_Internalname = "vMAQVOLRES" ;
      edtavMaqvoltop_Internalname = "vMAQVOLTOP" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      edtavFacabs_Internalname = "vFACABS" ;
      edtavVolumen_Internalname = "vVOLUMEN" ;
      edtavBarkgm_Internalname = "vBARKGM" ;
      edtavTot_kgs_Internalname = "vTOT_KGS" ;
      edtavBarmtr_Internalname = "vBARMTR" ;
      edtavTot_mts_Internalname = "vTOT_MTS" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      edtavVolumenes_Internalname = "vVOLUMENES" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      edtProCod_Internalname = "PROCOD" ;
      edtBarOrdLin_Internalname = "BARORDLIN" ;
      chkavSeleccionar.setInternalname( "vSELECCIONAR" );
      edtFasCod_Internalname = "FASCOD" ;
      edtFasDsc_Internalname = "FASDSC" ;
      edtFasQuiLin_Internalname = "FASQUILIN" ;
      edtProForCod_Internalname = "PROFORCOD" ;
      edtProForDsc_Internalname = "PROFORDSC" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Dvelop_confirmpanel_confirmar_Internalname = "DVELOP_CONFIRMPANEL_CONFIRMAR" ;
      tblTabledvelop_confirmpanel_confirmar_Internalname = "TABLEDVELOP_CONFIRMPANEL_CONFIRMAR" ;
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
      edtProForDsc_Jsonclick = "" ;
      edtProForCod_Jsonclick = "" ;
      edtFasQuiLin_Jsonclick = "" ;
      edtFasDsc_Jsonclick = "" ;
      edtFasCod_Jsonclick = "" ;
      chkavSeleccionar.setCaption( "" );
      chkavSeleccionar.setVisible( -1 );
      chkavSeleccionar.setEnabled( 1 );
      edtBarOrdLin_Jsonclick = "" ;
      edtProCod_Jsonclick = "" ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCod_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      subGrid_Class = "GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      subGrid_Sortable = (byte)(0) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavVolumenes_Jsonclick = "" ;
      edtavVolumenes_Enabled = 1 ;
      edtavTot_mts_Jsonclick = "" ;
      edtavTot_mts_Enabled = 1 ;
      edtavBarmtr_Jsonclick = "" ;
      edtavBarmtr_Enabled = 0 ;
      edtavTot_kgs_Jsonclick = "" ;
      edtavTot_kgs_Enabled = 1 ;
      edtavBarkgm_Jsonclick = "" ;
      edtavBarkgm_Enabled = 0 ;
      edtavVolumen_Jsonclick = "" ;
      edtavVolumen_Enabled = 1 ;
      edtavFacabs_Jsonclick = "" ;
      edtavFacabs_Enabled = 1 ;
      edtavMaqvoltop_Jsonclick = "" ;
      edtavMaqvoltop_Enabled = 0 ;
      edtavMaqvolres_Jsonclick = "" ;
      edtavMaqvolres_Enabled = 0 ;
      edtavMaqdsc_Jsonclick = "" ;
      edtavMaqdsc_Enabled = 0 ;
      edtavMaqcod_Jsonclick = "" ;
      edtavMaqcod_Enabled = 0 ;
      edtavBarcolnum_Jsonclick = "" ;
      edtavBarcolnum_Enabled = 0 ;
      edtavBarcolnom_Jsonclick = "" ;
      edtavBarcolnom_Enabled = 0 ;
      edtavBaranccru1_Jsonclick = "" ;
      edtavBaranccru1_Enabled = 0 ;
      edtavBarmat_Jsonclick = "" ;
      edtavBarmat_Enabled = 0 ;
      edtavBarserdsc_Jsonclick = "" ;
      edtavBarserdsc_Enabled = 0 ;
      edtavBarser_Jsonclick = "" ;
      edtavBarser_Enabled = 0 ;
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
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Dvelop_confirmpanel_confirmar_Confirmtype = "1" ;
      Dvelop_confirmpanel_confirmar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_confirmar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_confirmar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_confirmar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_confirmar_Confirmationtext = "¿Confirma los datos?" ;
      Dvelop_confirmpanel_confirmar_Title = "" ;
      Ddo_grid_Datalistproc = "RecetasDeAcabados.RecetadeAcabado01_WPGetFilterData" ;
      Ddo_grid_Datalisttype = "Dynamic|Dynamic||Dynamic|Dynamic" ;
      Ddo_grid_Includedatalist = "T|T||T|T" ;
      Ddo_grid_Filterisrange = "||T||" ;
      Ddo_grid_Filtertype = "Character|Character|Numeric|Character|Character" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "1|2|3|4|5" ;
      Ddo_grid_Columnids = "7:FasCod|8:FasDsc|9:FasQuiLin|10:ProForCod|11:ProForDsc" ;
      Ddo_grid_Gridinternalname = "" ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = "" ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      Dvpanel_panel_filtrosgenerales_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtrosgenerales_Iconposition = "Right" ;
      Dvpanel_panel_filtrosgenerales_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtrosgenerales_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtrosgenerales_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panel_filtrosgenerales_Title = httpContext.getMessage( "Generales", "") ;
      Dvpanel_panel_filtrosgenerales_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panel_filtrosgenerales_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panel_filtrosgenerales_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtrosgenerales_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( " FASQUI", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vSELECCIONAR_" + sGXsfl_149_idx ;
      chkavSeleccionar.setName( GXCCtl );
      chkavSeleccionar.setWebtags( "" );
      chkavSeleccionar.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavSeleccionar.getInternalname(), "TitleCaption", chkavSeleccionar.getCaption(), !bGXsfl_149_Refreshing);
      chkavSeleccionar.setCheckedValue( "false" );
      AV168Seleccionar = GXutil.strtobool( GXutil.booltostr( AV168Seleccionar)) ;
      httpContext.ajax_rsp_assign_attri("", false, chkavSeleccionar.getInternalname(), AV168Seleccionar);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV71TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV72TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV142TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV143TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV144TFFasQuiLin',fld:'vTFFASQUILIN',pic:'ZZZ9'},{av:'AV145TFFasQuiLin_To',fld:'vTFFASQUILIN_TO',pic:'ZZZ9'},{av:'AV146TFProForCod',fld:'vTFPROFORCOD',pic:''},{av:'AV147TFProForCod_Sel',fld:'vTFPROFORCOD_SEL',pic:''},{av:'AV148TFProForDsc',fld:'vTFPROFORDSC',pic:''},{av:'AV149TFProForDsc_Sel',fld:'vTFPROFORDSC_SEL',pic:''},{av:'AV45OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV46OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV185Pgmname',fld:'vPGMNAME',pic:''},{av:'AV173tabladevolumenes',fld:'vTABLADEVOLUMENES',pic:'',hsh:true},{av:'AV5RecLtssr',fld:'vRECLTSSR',pic:'ZZZZ9',hsh:true},{av:'AV18ArtFacabs',fld:'vARTFACABS',pic:'ZZ9.99',hsh:true},{av:'AV16BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV17BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV26MaqVolTop',fld:'vMAQVOLTOP',pic:'ZZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e1324Q2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV71TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV72TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV142TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV143TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV144TFFasQuiLin',fld:'vTFFASQUILIN',pic:'ZZZ9'},{av:'AV145TFFasQuiLin_To',fld:'vTFFASQUILIN_TO',pic:'ZZZ9'},{av:'AV146TFProForCod',fld:'vTFPROFORCOD',pic:''},{av:'AV147TFProForCod_Sel',fld:'vTFPROFORCOD_SEL',pic:''},{av:'AV148TFProForDsc',fld:'vTFPROFORDSC',pic:''},{av:'AV149TFProForDsc_Sel',fld:'vTFPROFORDSC_SEL',pic:''},{av:'AV185Pgmname',fld:'vPGMNAME',pic:''},{av:'AV45OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV46OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV173tabladevolumenes',fld:'vTABLADEVOLUMENES',pic:'',hsh:true},{av:'AV5RecLtssr',fld:'vRECLTSSR',pic:'ZZZZ9',hsh:true},{av:'AV18ArtFacabs',fld:'vARTFACABS',pic:'ZZ9.99',hsh:true},{av:'AV16BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV17BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV26MaqVolTop',fld:'vMAQVOLTOP',pic:'ZZZZ9',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV45OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV46OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV71TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV72TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV142TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV143TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV144TFFasQuiLin',fld:'vTFFASQUILIN',pic:'ZZZ9'},{av:'AV145TFFasQuiLin_To',fld:'vTFFASQUILIN_TO',pic:'ZZZ9'},{av:'AV146TFProForCod',fld:'vTFPROFORCOD',pic:''},{av:'AV147TFProForCod_Sel',fld:'vTFPROFORCOD_SEL',pic:''},{av:'AV148TFProForDsc',fld:'vTFPROFORDSC',pic:''},{av:'AV149TFProForDsc_Sel',fld:'vTFPROFORDSC_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e1824Q2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e1124Q1',iparms:[{av:'AV168Seleccionar',fld:'vSELECCIONAR',grid:149,pic:''},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_149',ctrl:'GRID',grid:149,prop:'GridRC',grid:149},{av:'AV151Volumen',fld:'vVOLUMEN',pic:'ZZZZ9'},{av:'AV167Rep',fld:'vREP',pic:'ZZZ9'}]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[{av:'AV167Rep',fld:'vREP',pic:'ZZZ9'},{av:'Dvelop_confirmpanel_confirmar_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_CONFIRMAR',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE","{handler:'e1424Q2',iparms:[{av:'Dvelop_confirmpanel_confirmar_Result',ctrl:'DVELOP_CONFIRMPANEL_CONFIRMAR',prop:'Result'},{av:'AV167Rep',fld:'vREP',pic:'ZZZ9'},{av:'AV151Volumen',fld:'vVOLUMEN',pic:'ZZZZ9'},{av:'AV173tabladevolumenes',fld:'vTABLADEVOLUMENES',pic:'',hsh:true},{av:'AV168Seleccionar',fld:'vSELECCIONAR',grid:149,pic:''},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_149',ctrl:'GRID',grid:149,prop:'GridRC',grid:149},{av:'AV12EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV13BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV14BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV15BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV152Tot_kgs',fld:'vTOT_KGS',pic:'ZZZZZ9.99'},{av:'AV153Tot_mts',fld:'vTOT_MTS',pic:'ZZZZZ9.99'},{av:'AV150FacAbs',fld:'vFACABS',pic:'ZZ9.99'},{av:'AV6CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV20BarSer',fld:'vBARSER',pic:''},{av:'AV21Procod',fld:'vPROCOD',pic:''},{av:'AV23MaqCod',fld:'vMAQCOD',pic:''},{av:'A457FasCod',fld:'FASCOD',grid:149,pic:'@!'},{av:'A764ProForCod',fld:'PROFORCOD',grid:149,pic:''},{av:'AV163UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV177RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'A194BarOrdLin',fld:'BARORDLIN',grid:149,pic:'ZZZ9'},{av:'AV164LtsRec',fld:'vLTSREC',pic:'ZZZ9'},{av:'AV181Abs2',fld:'vABS2',pic:'ZZ9.99'},{av:'AV36Var1',fld:'vVAR1',pic:''},{av:'AV175Hdrscreadas_SDTs',fld:'vHDRSCREADAS_SDTS',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE",",oparms:[{av:'AV176HdrscreadasToJson',fld:'vHDRSCREADASTOJSON',pic:''},{av:'AV15BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV14BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV13BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV12EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV36Var1',fld:'vVAR1',pic:''},{av:'AV181Abs2',fld:'vABS2',pic:'ZZ9.99'},{av:'AV164LtsRec',fld:'vLTSREC',pic:'ZZZ9'},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'AV177RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV163UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'A764ProForCod',fld:'PROFORCOD',pic:''},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'AV23MaqCod',fld:'vMAQCOD',pic:''},{av:'AV21Procod',fld:'vPROCOD',pic:''},{av:'AV20BarSer',fld:'vBARSER',pic:''},{av:'AV6CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV150FacAbs',fld:'vFACABS',pic:'ZZ9.99'},{av:'AV153Tot_mts',fld:'vTOT_MTS',pic:'ZZZZZ9.99'},{av:'AV152Tot_kgs',fld:'vTOT_KGS',pic:'ZZZZZ9.99'},{av:'AV175Hdrscreadas_SDTs',fld:'vHDRSCREADAS_SDTS',pic:''},{av:'AV178ErrMensaje',fld:'vERRMENSAJE',pic:''}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e1224Q1',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("VFACABS.ISVALID","{handler:'e1524Q2',iparms:[{av:'AV5RecLtssr',fld:'vRECLTSSR',pic:'ZZZZ9',hsh:true},{av:'AV150FacAbs',fld:'vFACABS',pic:'ZZ9.99'},{av:'AV25MaqVolRes',fld:'vMAQVOLRES',pic:'ZZZZ9'},{av:'AV165VolMul',fld:'vVOLMUL',pic:'ZZZ9'},{av:'AV152Tot_kgs',fld:'vTOT_KGS',pic:'ZZZZZ9.99'},{av:'AV26MaqVolTop',fld:'vMAQVOLTOP',pic:'ZZZZ9',hsh:true},{av:'AV151Volumen',fld:'vVOLUMEN',pic:'ZZZZ9'}]");
      setEventMetadata("VFACABS.ISVALID",",oparms:[{av:'AV151Volumen',fld:'vVOLUMEN',pic:'ZZZZ9'},{av:'AV152Tot_kgs',fld:'vTOT_KGS',pic:'ZZZZZ9.99'},{av:'AV165VolMul',fld:'vVOLMUL',pic:'ZZZ9'},{av:'AV25MaqVolRes',fld:'vMAQVOLRES',pic:'ZZZZ9'},{av:'AV150FacAbs',fld:'vFACABS',pic:'ZZ9.99'},{av:'AV167Rep',fld:'vREP',pic:'ZZZ9'},{av:'AV155Volumenes',fld:'vVOLUMENES',pic:''}]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV173tabladevolumenes',fld:'vTABLADEVOLUMENES',pic:'',hsh:true},{av:'AV5RecLtssr',fld:'vRECLTSSR',pic:'ZZZZ9',hsh:true},{av:'AV18ArtFacabs',fld:'vARTFACABS',pic:'ZZ9.99',hsh:true},{av:'AV16BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV17BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV26MaqVolTop',fld:'vMAQVOLTOP',pic:'ZZZZ9',hsh:true},{av:'AV71TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV72TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV142TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV143TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV144TFFasQuiLin',fld:'vTFFASQUILIN',pic:'ZZZ9'},{av:'AV145TFFasQuiLin_To',fld:'vTFFASQUILIN_TO',pic:'ZZZ9'},{av:'AV146TFProForCod',fld:'vTFPROFORCOD',pic:''},{av:'AV147TFProForCod_Sel',fld:'vTFPROFORCOD_SEL',pic:''},{av:'AV148TFProForDsc',fld:'vTFPROFORDSC',pic:''},{av:'AV149TFProForDsc_Sel',fld:'vTFPROFORDSC_SEL',pic:''},{av:'AV185Pgmname',fld:'vPGMNAME',pic:''},{av:'AV45OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV46OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]");
      setEventMetadata("GRID_FIRSTPAGE",",oparms:[]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV173tabladevolumenes',fld:'vTABLADEVOLUMENES',pic:'',hsh:true},{av:'AV5RecLtssr',fld:'vRECLTSSR',pic:'ZZZZ9',hsh:true},{av:'AV18ArtFacabs',fld:'vARTFACABS',pic:'ZZ9.99',hsh:true},{av:'AV16BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV17BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV26MaqVolTop',fld:'vMAQVOLTOP',pic:'ZZZZ9',hsh:true},{av:'AV71TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV72TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV142TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV143TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV144TFFasQuiLin',fld:'vTFFASQUILIN',pic:'ZZZ9'},{av:'AV145TFFasQuiLin_To',fld:'vTFFASQUILIN_TO',pic:'ZZZ9'},{av:'AV146TFProForCod',fld:'vTFPROFORCOD',pic:''},{av:'AV147TFProForCod_Sel',fld:'vTFPROFORCOD_SEL',pic:''},{av:'AV148TFProForDsc',fld:'vTFPROFORDSC',pic:''},{av:'AV149TFProForDsc_Sel',fld:'vTFPROFORDSC_SEL',pic:''},{av:'AV185Pgmname',fld:'vPGMNAME',pic:''},{av:'AV45OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV46OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]");
      setEventMetadata("GRID_PREVPAGE",",oparms:[]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV173tabladevolumenes',fld:'vTABLADEVOLUMENES',pic:'',hsh:true},{av:'AV5RecLtssr',fld:'vRECLTSSR',pic:'ZZZZ9',hsh:true},{av:'AV18ArtFacabs',fld:'vARTFACABS',pic:'ZZ9.99',hsh:true},{av:'AV16BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV17BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV26MaqVolTop',fld:'vMAQVOLTOP',pic:'ZZZZ9',hsh:true},{av:'AV71TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV72TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV142TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV143TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV144TFFasQuiLin',fld:'vTFFASQUILIN',pic:'ZZZ9'},{av:'AV145TFFasQuiLin_To',fld:'vTFFASQUILIN_TO',pic:'ZZZ9'},{av:'AV146TFProForCod',fld:'vTFPROFORCOD',pic:''},{av:'AV147TFProForCod_Sel',fld:'vTFPROFORCOD_SEL',pic:''},{av:'AV148TFProForDsc',fld:'vTFPROFORDSC',pic:''},{av:'AV149TFProForDsc_Sel',fld:'vTFPROFORDSC_SEL',pic:''},{av:'AV185Pgmname',fld:'vPGMNAME',pic:''},{av:'AV45OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV46OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]");
      setEventMetadata("GRID_NEXTPAGE",",oparms:[]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV173tabladevolumenes',fld:'vTABLADEVOLUMENES',pic:'',hsh:true},{av:'AV5RecLtssr',fld:'vRECLTSSR',pic:'ZZZZ9',hsh:true},{av:'AV18ArtFacabs',fld:'vARTFACABS',pic:'ZZ9.99',hsh:true},{av:'AV16BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV17BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV26MaqVolTop',fld:'vMAQVOLTOP',pic:'ZZZZ9',hsh:true},{av:'AV71TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV72TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV142TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV143TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV144TFFasQuiLin',fld:'vTFFASQUILIN',pic:'ZZZ9'},{av:'AV145TFFasQuiLin_To',fld:'vTFFASQUILIN_TO',pic:'ZZZ9'},{av:'AV146TFProForCod',fld:'vTFPROFORCOD',pic:''},{av:'AV147TFProForCod_Sel',fld:'vTFPROFORCOD_SEL',pic:''},{av:'AV148TFProForDsc',fld:'vTFPROFORDSC',pic:''},{av:'AV149TFProForDsc_Sel',fld:'vTFPROFORDSC_SEL',pic:''},{av:'AV185Pgmname',fld:'vPGMNAME',pic:''},{av:'AV45OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV46OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]");
      setEventMetadata("GRID_LASTPAGE",",oparms:[]}");
      setEventMetadata("VALIDV_BARCOD","{handler:'validv_Barcod',iparms:[]");
      setEventMetadata("VALIDV_BARCOD",",oparms:[]}");
      setEventMetadata("VALIDV_BARCODREO","{handler:'validv_Barcodreo',iparms:[]");
      setEventMetadata("VALIDV_BARCODREO",",oparms:[]}");
      setEventMetadata("VALIDV_BARCODPAR","{handler:'validv_Barcodpar',iparms:[]");
      setEventMetadata("VALIDV_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_PROCOD","{handler:'valid_Procod',iparms:[]");
      setEventMetadata("VALID_PROCOD",",oparms:[]}");
      setEventMetadata("VALID_BARORDLIN","{handler:'valid_Barordlin',iparms:[]");
      setEventMetadata("VALID_BARORDLIN",",oparms:[]}");
      setEventMetadata("VALID_FASCOD","{handler:'valid_Fascod',iparms:[]");
      setEventMetadata("VALID_FASCOD",",oparms:[]}");
      setEventMetadata("VALID_PROFORCOD","{handler:'valid_Proforcod',iparms:[]");
      setEventMetadata("VALID_PROFORCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Profordsc',iparms:[]");
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
      wcpOAV12EmprCod = "" ;
      wcpOAV15BarCodPar = "" ;
      wcpOAV16BarKgm = DecimalUtil.ZERO ;
      wcpOAV17BarMtr = DecimalUtil.ZERO ;
      wcpOAV18ArtFacabs = DecimalUtil.ZERO ;
      wcpOAV19CliNom = "" ;
      wcpOAV20BarSer = "" ;
      wcpOAV7BarSerDsc = "" ;
      wcpOAV21Procod = "" ;
      wcpOAV22ProDsc = "" ;
      wcpOAV23MaqCod = "" ;
      wcpOAV24MaqDsc = "" ;
      wcpOAV28PedidoCliente = "" ;
      wcpOAV29BarPle = "" ;
      wcpOAV34Contextura = "" ;
      wcpOAV9BarColNom = "" ;
      wcpOAV30BarMat = "" ;
      wcpOAV31Hrefacabs = DecimalUtil.ZERO ;
      wcpOAV36Var1 = "" ;
      wcpOAV37Msg_tosa = "" ;
      wcpOAV11BarFasecod = "" ;
      wcpOAV33barMaqTin = "" ;
      wcpOAV179ErrMensaje1 = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Dvelop_confirmpanel_confirmar_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV12EmprCod = "" ;
      AV15BarCodPar = "" ;
      AV16BarKgm = DecimalUtil.ZERO ;
      AV17BarMtr = DecimalUtil.ZERO ;
      AV18ArtFacabs = DecimalUtil.ZERO ;
      AV19CliNom = "" ;
      AV20BarSer = "" ;
      AV7BarSerDsc = "" ;
      AV21Procod = "" ;
      AV22ProDsc = "" ;
      AV23MaqCod = "" ;
      AV24MaqDsc = "" ;
      AV28PedidoCliente = "" ;
      AV29BarPle = "" ;
      AV34Contextura = "" ;
      AV9BarColNom = "" ;
      AV30BarMat = "" ;
      AV31Hrefacabs = DecimalUtil.ZERO ;
      AV36Var1 = "" ;
      AV37Msg_tosa = "" ;
      AV11BarFasecod = "" ;
      AV33barMaqTin = "" ;
      AV179ErrMensaje1 = "" ;
      AV178ErrMensaje = "" ;
      AV176HdrscreadasToJson = "" ;
      AV71TFFasCod = "" ;
      AV72TFFasCod_Sel = "" ;
      AV142TFFasDsc = "" ;
      AV143TFFasDsc_Sel = "" ;
      AV146TFProForCod = "" ;
      AV147TFProForCod_Sel = "" ;
      AV148TFProForDsc = "" ;
      AV149TFProForDsc_Sel = "" ;
      AV185Pgmname = "" ;
      AV173tabladevolumenes = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV137DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV163UsurCod = "" ;
      AV181Abs2 = DecimalUtil.ZERO ;
      AV175Hdrscreadas_SDTs = new GXBaseCollection<app.SdtHdrscreadas_SDT>(app.SdtHdrscreadas_SDT.class, "Hdrscreadas_SDT", "TexplusNET", remoteHandle);
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
      ucDvpanel_panel_filtrosgenerales = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      bttBtnconfirmar_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      AV150FacAbs = DecimalUtil.ZERO ;
      AV152Tot_kgs = DecimalUtil.ZERO ;
      AV153Tot_mts = DecimalUtil.ZERO ;
      AV155Volumenes = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV186Recetasdeacabados_recetadeacabado01_wpds_1_tffascod = "" ;
      AV187Recetasdeacabados_recetadeacabado01_wpds_2_tffascod_sel = "" ;
      AV188Recetasdeacabados_recetadeacabado01_wpds_3_tffasdsc = "" ;
      AV189Recetasdeacabados_recetadeacabado01_wpds_4_tffasdsc_sel = "" ;
      AV192Recetasdeacabados_recetadeacabado01_wpds_7_tfproforcod = "" ;
      AV193Recetasdeacabados_recetadeacabado01_wpds_8_tfproforcod_sel = "" ;
      AV194Recetasdeacabados_recetadeacabado01_wpds_9_tfprofordsc = "" ;
      AV195Recetasdeacabados_recetadeacabado01_wpds_10_tfprofordsc_sel = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A758ProCod = "" ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      A764ProForCod = "" ;
      A766ProForDsc = "" ;
      scmdbuf = "" ;
      lV186Recetasdeacabados_recetadeacabado01_wpds_1_tffascod = "" ;
      lV188Recetasdeacabados_recetadeacabado01_wpds_3_tffasdsc = "" ;
      lV192Recetasdeacabados_recetadeacabado01_wpds_7_tfproforcod = "" ;
      lV194Recetasdeacabados_recetadeacabado01_wpds_9_tfprofordsc = "" ;
      H024Q2_A766ProForDsc = new String[] {""} ;
      H024Q2_A764ProForCod = new String[] {""} ;
      H024Q2_A5371FasQuiLin = new short[1] ;
      H024Q2_A460FasDsc = new String[] {""} ;
      H024Q2_A457FasCod = new String[] {""} ;
      H024Q2_A194BarOrdLin = new short[1] ;
      H024Q2_A758ProCod = new String[] {""} ;
      H024Q2_A130BarCodPar = new String[] {""} ;
      H024Q2_A132BarCodReo = new byte[1] ;
      H024Q2_A129BarCod = new int[1] ;
      H024Q2_A396EmprCod = new String[] {""} ;
      H024Q3_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV161Station = "" ;
      AV162EmprNom = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV39WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext13 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV157Tab_vol = new int[100] ;
      AV172Tabla_Hdr = new String[3] ;
      GX_I = 1 ;
      while ( GX_I <= 3 )
      {
         AV172Tabla_Hdr[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      GXv_char4 = new String[1] ;
      GXv_int12 = new int[1] ;
      GXv_int10 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_int8 = new int[1] ;
      GXv_char2 = new String[1] ;
      GXv_char15 = new String[1] ;
      GXv_char16 = new String[1] ;
      GXv_int22 = new short[1] ;
      GXv_int23 = new short[1] ;
      AV174Hdrscreadas_SDT = new app.SdtHdrscreadas_SDT(remoteHandle, context);
      AV55Session = httpContext.getWebSession();
      AV43GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV44GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char29 = "" ;
      GXv_char26 = new String[1] ;
      GXt_char28 = "" ;
      GXv_char21 = new String[1] ;
      GXt_char27 = "" ;
      GXv_char18 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char17 = new String[1] ;
      GXv_SdtWWPGridState30 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV41TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV40HTTPRequest = httpContext.getHttpRequest();
      GXv_decimal25 = new java.math.BigDecimal[1] ;
      GXv_int24 = new int[1] ;
      GXv_int20 = new byte[1] ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      GXv_int19 = new int[1] ;
      AV154OldKgs = DecimalUtil.ZERO ;
      c6035Ac_Kilos = DecimalUtil.ZERO ;
      c6034Ac_Metros = DecimalUtil.ZERO ;
      H024Q4_A6035Ac_Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H024Q4_n6035Ac_Kilos = new boolean[] {false} ;
      H024Q4_A6034Ac_Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H024Q4_n6034Ac_Metros = new boolean[] {false} ;
      ucDvelop_confirmpanel_confirmar = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GXCCtl = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.recetasdeacabados.recetadeacabado01_wp__default(),
         new Object[] {
             new Object[] {
            H024Q2_A766ProForDsc, H024Q2_A764ProForCod, H024Q2_A5371FasQuiLin, H024Q2_A460FasDsc, H024Q2_A457FasCod, H024Q2_A194BarOrdLin, H024Q2_A758ProCod, H024Q2_A130BarCodPar, H024Q2_A132BarCodReo, H024Q2_A129BarCod,
            H024Q2_A396EmprCod
            }
            , new Object[] {
            H024Q3_AGRID_nRecordCount
            }
            , new Object[] {
            H024Q4_A6035Ac_Kilos, H024Q4_n6035Ac_Kilos, H024Q4_A6034Ac_Metros, H024Q4_n6034Ac_Metros
            }
         }
      );
      AV185Pgmname = "RecetasDeAcabados.RecetadeAcabado01_WP" ;
      /* GeneXus formulas. */
      AV185Pgmname = "RecetasDeAcabados.RecetadeAcabado01_WP" ;
      Gx_err = (short)(0) ;
      edtavBarcod_Enabled = 0 ;
      edtavBarcodreo_Enabled = 0 ;
      edtavBarcodpar_Enabled = 0 ;
      edtavClicod_Enabled = 0 ;
      edtavClinom_Enabled = 0 ;
      edtavPedidocliente_Enabled = 0 ;
      edtavBarser_Enabled = 0 ;
      edtavBarserdsc_Enabled = 0 ;
      edtavBarmat_Enabled = 0 ;
      edtavBaranccru1_Enabled = 0 ;
      edtavBarcolnom_Enabled = 0 ;
      edtavBarcolnum_Enabled = 0 ;
      edtavMaqcod_Enabled = 0 ;
      edtavMaqdsc_Enabled = 0 ;
      edtavMaqvolres_Enabled = 0 ;
      edtavMaqvoltop_Enabled = 0 ;
      edtavBarkgm_Enabled = 0 ;
      edtavTot_kgs_Enabled = 0 ;
      edtavBarmtr_Enabled = 0 ;
      edtavTot_mts_Enabled = 0 ;
      edtavVolumenes_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOAV14BarCodReo ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV14BarCodReo ;
   private byte gxajaxcallmode ;
   private byte A132BarCodReo ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV170LinPro ;
   private byte GXv_int10[] ;
   private byte GXv_int20[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short wcpOAV27BarAncCru1 ;
   private short wcpOAV32BarFaseOrd ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV27BarAncCru1 ;
   private short AV32BarFaseOrd ;
   private short AV144TFFasQuiLin ;
   private short AV145TFFasQuiLin_To ;
   private short AV45OrderedBy ;
   private short AV167Rep ;
   private short AV177RecLinMaq ;
   private short AV164LtsRec ;
   private short AV165VolMul ;
   private short AV156Rep2 ;
   private short AV169i ;
   private short wbEnd ;
   private short wbStart ;
   private short AV190Recetasdeacabados_recetadeacabado01_wpds_5_tffasquilin ;
   private short AV191Recetasdeacabados_recetadeacabado01_wpds_6_tffasquilin_to ;
   private short A194BarOrdLin ;
   private short A5371FasQuiLin ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV180t ;
   private short GXv_int22[] ;
   private short GXv_int23[] ;
   private int wcpOAV13BarCod ;
   private int wcpOAV6CliCod ;
   private int wcpOAV25MaqVolRes ;
   private int wcpOAV26MaqVolTop ;
   private int wcpOAV10BarColNum ;
   private int wcpOAV5RecLtssr ;
   private int wcpOAV35LtsSob ;
   private int subGrid_Rows ;
   private int nRC_GXsfl_149 ;
   private int AV13BarCod ;
   private int AV6CliCod ;
   private int AV25MaqVolRes ;
   private int AV26MaqVolTop ;
   private int AV10BarColNum ;
   private int AV5RecLtssr ;
   private int AV35LtsSob ;
   private int nGXsfl_149_idx=1 ;
   private int AV160Volumen2 ;
   private int AV159Volumenc ;
   private int AV158VolPar ;
   private int edtavBarcod_Enabled ;
   private int edtavBarcodreo_Enabled ;
   private int edtavBarcodpar_Enabled ;
   private int edtavClicod_Enabled ;
   private int edtavClinom_Enabled ;
   private int edtavPedidocliente_Enabled ;
   private int edtavBarser_Enabled ;
   private int edtavBarserdsc_Enabled ;
   private int edtavBarmat_Enabled ;
   private int edtavBaranccru1_Enabled ;
   private int edtavBarcolnom_Enabled ;
   private int edtavBarcolnum_Enabled ;
   private int edtavMaqcod_Enabled ;
   private int edtavMaqdsc_Enabled ;
   private int edtavMaqvolres_Enabled ;
   private int edtavMaqvoltop_Enabled ;
   private int edtavFacabs_Enabled ;
   private int AV151Volumen ;
   private int edtavVolumen_Enabled ;
   private int edtavBarkgm_Enabled ;
   private int edtavTot_kgs_Enabled ;
   private int edtavBarmtr_Enabled ;
   private int edtavTot_mts_Enabled ;
   private int edtavVolumenes_Enabled ;
   private int edtavPgmname_Enabled ;
   private int A129BarCod ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int GX_I ;
   private int AV157Tab_vol[] ;
   private int nGXsfl_149_fel_idx=1 ;
   private int AV198Volumeni ;
   private int GXv_int12[] ;
   private int GXv_int8[] ;
   private int AV199GXV1 ;
   private int GXt_int7 ;
   private int GXv_int24[] ;
   private int GXv_int19[] ;
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
   private java.math.BigDecimal wcpOAV16BarKgm ;
   private java.math.BigDecimal wcpOAV17BarMtr ;
   private java.math.BigDecimal wcpOAV18ArtFacabs ;
   private java.math.BigDecimal wcpOAV31Hrefacabs ;
   private java.math.BigDecimal AV16BarKgm ;
   private java.math.BigDecimal AV17BarMtr ;
   private java.math.BigDecimal AV18ArtFacabs ;
   private java.math.BigDecimal AV31Hrefacabs ;
   private java.math.BigDecimal AV181Abs2 ;
   private java.math.BigDecimal AV150FacAbs ;
   private java.math.BigDecimal AV152Tot_kgs ;
   private java.math.BigDecimal AV153Tot_mts ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal GXv_decimal25[] ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private java.math.BigDecimal AV154OldKgs ;
   private java.math.BigDecimal c6035Ac_Kilos ;
   private java.math.BigDecimal c6034Ac_Metros ;
   private String wcpOAV12EmprCod ;
   private String wcpOAV15BarCodPar ;
   private String wcpOAV19CliNom ;
   private String wcpOAV20BarSer ;
   private String wcpOAV7BarSerDsc ;
   private String wcpOAV21Procod ;
   private String wcpOAV22ProDsc ;
   private String wcpOAV23MaqCod ;
   private String wcpOAV24MaqDsc ;
   private String wcpOAV28PedidoCliente ;
   private String wcpOAV29BarPle ;
   private String wcpOAV34Contextura ;
   private String wcpOAV9BarColNom ;
   private String wcpOAV30BarMat ;
   private String wcpOAV36Var1 ;
   private String wcpOAV37Msg_tosa ;
   private String wcpOAV11BarFasecod ;
   private String wcpOAV33barMaqTin ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Dvelop_confirmpanel_confirmar_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV12EmprCod ;
   private String AV15BarCodPar ;
   private String AV19CliNom ;
   private String AV20BarSer ;
   private String AV7BarSerDsc ;
   private String AV21Procod ;
   private String AV22ProDsc ;
   private String AV23MaqCod ;
   private String AV24MaqDsc ;
   private String AV28PedidoCliente ;
   private String AV29BarPle ;
   private String AV34Contextura ;
   private String AV9BarColNom ;
   private String AV30BarMat ;
   private String AV36Var1 ;
   private String AV37Msg_tosa ;
   private String AV11BarFasecod ;
   private String AV33barMaqTin ;
   private String sGXsfl_149_idx="0001" ;
   private String AV71TFFasCod ;
   private String AV72TFFasCod_Sel ;
   private String AV142TFFasDsc ;
   private String AV143TFFasDsc_Sel ;
   private String AV146TFProForCod ;
   private String AV147TFProForCod_Sel ;
   private String AV148TFProForDsc ;
   private String AV149TFProForDsc_Sel ;
   private String AV185Pgmname ;
   private String AV173tabladevolumenes ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV163UsurCod ;
   private String Dvpanel_panel_filtrosgenerales_Width ;
   private String Dvpanel_panel_filtrosgenerales_Cls ;
   private String Dvpanel_panel_filtrosgenerales_Title ;
   private String Dvpanel_panel_filtrosgenerales_Iconposition ;
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
   private String Ddo_grid_Sortedstatus ;
   private String Ddo_grid_Includefilter ;
   private String Ddo_grid_Filtertype ;
   private String Ddo_grid_Filterisrange ;
   private String Ddo_grid_Includedatalist ;
   private String Ddo_grid_Datalisttype ;
   private String Ddo_grid_Datalistproc ;
   private String Dvelop_confirmpanel_confirmar_Title ;
   private String Dvelop_confirmpanel_confirmar_Confirmationtext ;
   private String Dvelop_confirmpanel_confirmar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_confirmar_Confirmtype ;
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String Dvpanel_panel_filtrosgenerales_Internalname ;
   private String divPanel_filtrosgenerales_Internalname ;
   private String divUnnamedtable5_Internalname ;
   private String edtavBarcod_Internalname ;
   private String edtavBarcod_Jsonclick ;
   private String edtavBarcodreo_Internalname ;
   private String edtavBarcodreo_Jsonclick ;
   private String edtavBarcodpar_Internalname ;
   private String edtavBarcodpar_Jsonclick ;
   private String divUnnamedtable6_Internalname ;
   private String edtavClicod_Internalname ;
   private String edtavClicod_Jsonclick ;
   private String edtavClinom_Internalname ;
   private String edtavClinom_Jsonclick ;
   private String edtavPedidocliente_Internalname ;
   private String edtavPedidocliente_Jsonclick ;
   private String divUnnamedtable7_Internalname ;
   private String edtavBarser_Internalname ;
   private String edtavBarser_Jsonclick ;
   private String edtavBarserdsc_Internalname ;
   private String edtavBarserdsc_Jsonclick ;
   private String edtavBarmat_Internalname ;
   private String edtavBarmat_Jsonclick ;
   private String edtavBaranccru1_Internalname ;
   private String edtavBaranccru1_Jsonclick ;
   private String divUnnamedtable8_Internalname ;
   private String edtavBarcolnom_Internalname ;
   private String edtavBarcolnom_Jsonclick ;
   private String edtavBarcolnum_Internalname ;
   private String edtavBarcolnum_Jsonclick ;
   private String TempTags ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String edtavMaqcod_Internalname ;
   private String edtavMaqcod_Jsonclick ;
   private String edtavMaqdsc_Internalname ;
   private String edtavMaqdsc_Jsonclick ;
   private String edtavMaqvolres_Internalname ;
   private String edtavMaqvolres_Jsonclick ;
   private String edtavMaqvoltop_Internalname ;
   private String edtavMaqvoltop_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String edtavFacabs_Internalname ;
   private String edtavFacabs_Jsonclick ;
   private String edtavVolumen_Internalname ;
   private String edtavVolumen_Jsonclick ;
   private String edtavBarkgm_Internalname ;
   private String edtavBarkgm_Jsonclick ;
   private String edtavTot_kgs_Internalname ;
   private String edtavTot_kgs_Jsonclick ;
   private String edtavBarmtr_Internalname ;
   private String edtavBarmtr_Jsonclick ;
   private String edtavTot_mts_Internalname ;
   private String edtavTot_mts_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String edtavVolumenes_Internalname ;
   private String AV155Volumenes ;
   private String edtavVolumenes_Jsonclick ;
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
   private String AV186Recetasdeacabados_recetadeacabado01_wpds_1_tffascod ;
   private String AV187Recetasdeacabados_recetadeacabado01_wpds_2_tffascod_sel ;
   private String AV188Recetasdeacabados_recetadeacabado01_wpds_3_tffasdsc ;
   private String AV189Recetasdeacabados_recetadeacabado01_wpds_4_tffasdsc_sel ;
   private String AV192Recetasdeacabados_recetadeacabado01_wpds_7_tfproforcod ;
   private String AV193Recetasdeacabados_recetadeacabado01_wpds_8_tfproforcod_sel ;
   private String AV194Recetasdeacabados_recetadeacabado01_wpds_9_tfprofordsc ;
   private String AV195Recetasdeacabados_recetadeacabado01_wpds_10_tfprofordsc_sel ;
   private String A396EmprCod ;
   private String edtEmprCod_Internalname ;
   private String edtBarCod_Internalname ;
   private String edtBarCodReo_Internalname ;
   private String A130BarCodPar ;
   private String edtBarCodPar_Internalname ;
   private String A758ProCod ;
   private String edtProCod_Internalname ;
   private String edtBarOrdLin_Internalname ;
   private String A457FasCod ;
   private String edtFasCod_Internalname ;
   private String A460FasDsc ;
   private String edtFasDsc_Internalname ;
   private String edtFasQuiLin_Internalname ;
   private String A764ProForCod ;
   private String edtProForCod_Internalname ;
   private String A766ProForDsc ;
   private String edtProForDsc_Internalname ;
   private String scmdbuf ;
   private String lV186Recetasdeacabados_recetadeacabado01_wpds_1_tffascod ;
   private String lV188Recetasdeacabados_recetadeacabado01_wpds_3_tffasdsc ;
   private String lV192Recetasdeacabados_recetadeacabado01_wpds_7_tfproforcod ;
   private String lV194Recetasdeacabados_recetadeacabado01_wpds_9_tfprofordsc ;
   private String hsh ;
   private String AV161Station ;
   private String AV162EmprNom ;
   private String AV172Tabla_Hdr[] ;
   private String sGXsfl_149_fel_idx="0001" ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char15[] ;
   private String GXv_char16[] ;
   private String GXt_char29 ;
   private String GXv_char26[] ;
   private String GXt_char28 ;
   private String GXv_char21[] ;
   private String GXt_char27 ;
   private String GXv_char18[] ;
   private String GXt_char1 ;
   private String GXv_char17[] ;
   private String tblTabledvelop_confirmpanel_confirmar_Internalname ;
   private String Dvelop_confirmpanel_confirmar_Internalname ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtEmprCod_Jsonclick ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
   private String edtProCod_Jsonclick ;
   private String edtBarOrdLin_Jsonclick ;
   private String GXCCtl ;
   private String edtFasCod_Jsonclick ;
   private String edtFasDsc_Jsonclick ;
   private String edtFasQuiLin_Jsonclick ;
   private String edtProForCod_Jsonclick ;
   private String edtProForDsc_Jsonclick ;
   private String subGrid_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV46OrderedDsc ;
   private boolean Dvpanel_panel_filtrosgenerales_Autowidth ;
   private boolean Dvpanel_panel_filtrosgenerales_Autoheight ;
   private boolean Dvpanel_panel_filtrosgenerales_Collapsible ;
   private boolean Dvpanel_panel_filtrosgenerales_Collapsed ;
   private boolean Dvpanel_panel_filtrosgenerales_Showcollapseicon ;
   private boolean Dvpanel_panel_filtrosgenerales_Autoscroll ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean AV168Seleccionar ;
   private boolean bGXsfl_149_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean n6035Ac_Kilos ;
   private boolean n6034Ac_Metros ;
   private String wcpOAV179ErrMensaje1 ;
   private String AV179ErrMensaje1 ;
   private String AV178ErrMensaje ;
   private String AV176HdrscreadasToJson ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV40HTTPRequest ;
   private com.genexus.webpanels.WebSession AV55Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtrosgenerales ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_confirmar ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkavSeleccionar ;
   private IDataStoreProvider pr_default ;
   private String[] H024Q2_A766ProForDsc ;
   private String[] H024Q2_A764ProForCod ;
   private short[] H024Q2_A5371FasQuiLin ;
   private String[] H024Q2_A460FasDsc ;
   private String[] H024Q2_A457FasCod ;
   private short[] H024Q2_A194BarOrdLin ;
   private String[] H024Q2_A758ProCod ;
   private String[] H024Q2_A130BarCodPar ;
   private byte[] H024Q2_A132BarCodReo ;
   private int[] H024Q2_A129BarCod ;
   private String[] H024Q2_A396EmprCod ;
   private long[] H024Q3_AGRID_nRecordCount ;
   private java.math.BigDecimal[] H024Q4_A6035Ac_Kilos ;
   private boolean[] H024Q4_n6035Ac_Kilos ;
   private java.math.BigDecimal[] H024Q4_A6034Ac_Metros ;
   private boolean[] H024Q4_n6034Ac_Metros ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.SdtHdrscreadas_SDT> AV175Hdrscreadas_SDTs ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV137DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV43GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState30[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV44GridStateFilterValue ;
   private app.SdtHdrscreadas_SDT AV174Hdrscreadas_SDT ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV41TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV39WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext13[] ;
}

final  class recetadeacabado01_wp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H024Q2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV187Recetasdeacabados_recetadeacabado01_wpds_2_tffascod_sel ,
                                          String AV186Recetasdeacabados_recetadeacabado01_wpds_1_tffascod ,
                                          String AV189Recetasdeacabados_recetadeacabado01_wpds_4_tffasdsc_sel ,
                                          String AV188Recetasdeacabados_recetadeacabado01_wpds_3_tffasdsc ,
                                          short AV190Recetasdeacabados_recetadeacabado01_wpds_5_tffasquilin ,
                                          short AV191Recetasdeacabados_recetadeacabado01_wpds_6_tffasquilin_to ,
                                          String AV193Recetasdeacabados_recetadeacabado01_wpds_8_tfproforcod_sel ,
                                          String AV192Recetasdeacabados_recetadeacabado01_wpds_7_tfproforcod ,
                                          String AV195Recetasdeacabados_recetadeacabado01_wpds_10_tfprofordsc_sel ,
                                          String AV194Recetasdeacabados_recetadeacabado01_wpds_9_tfprofordsc ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          short A5371FasQuiLin ,
                                          String A764ProForCod ,
                                          String A766ProForDsc ,
                                          short AV45OrderedBy ,
                                          boolean AV46OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int31 = new byte[15];
      Object[] GXv_Object32 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T4.ProForDsc, T1.ProForCod, T1.FasQuiLin, T3.FasDsc, T2.FasCod, T1.BarOrdLin, T1.ProCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod" ;
      sFromString = " FROM (((TXPFASQUI T1 INNER JOIN TXPBARFAS T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar" ;
      sFromString += " AND T2.ProCod = T1.ProCod AND T2.BarOrdLin = T1.BarOrdLin) LEFT JOIN TXPFASPRO T3 ON T3.EmprCod = T1.EmprCod AND T3.FasCod = T2.FasCod) INNER JOIN TXPCPROFO T4" ;
      sFromString += " ON T4.EmprCod = T1.EmprCod AND T4.ProForCod = T1.ProForCod)" ;
      sOrderString = "" ;
      if ( (GXutil.strcmp("", AV187Recetasdeacabados_recetadeacabado01_wpds_2_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV186Recetasdeacabados_recetadeacabado01_wpds_1_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV187Recetasdeacabados_recetadeacabado01_wpds_2_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasCod = ?)");
      }
      else
      {
         GXv_int31[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV189Recetasdeacabados_recetadeacabado01_wpds_4_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV188Recetasdeacabados_recetadeacabado01_wpds_3_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV189Recetasdeacabados_recetadeacabado01_wpds_4_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.FasDsc = ?)");
      }
      else
      {
         GXv_int31[3] = (byte)(1) ;
      }
      if ( ! (0==AV190Recetasdeacabados_recetadeacabado01_wpds_5_tffasquilin) )
      {
         addWhere(sWhereString, "(T1.FasQuiLin >= ?)");
      }
      else
      {
         GXv_int31[4] = (byte)(1) ;
      }
      if ( ! (0==AV191Recetasdeacabados_recetadeacabado01_wpds_6_tffasquilin_to) )
      {
         addWhere(sWhereString, "(T1.FasQuiLin <= ?)");
      }
      else
      {
         GXv_int31[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV193Recetasdeacabados_recetadeacabado01_wpds_8_tfproforcod_sel)==0) && ( ! (GXutil.strcmp("", AV192Recetasdeacabados_recetadeacabado01_wpds_7_tfproforcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV193Recetasdeacabados_recetadeacabado01_wpds_8_tfproforcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForCod = ?)");
      }
      else
      {
         GXv_int31[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV195Recetasdeacabados_recetadeacabado01_wpds_10_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV194Recetasdeacabados_recetadeacabado01_wpds_9_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV195Recetasdeacabados_recetadeacabado01_wpds_10_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProForDsc = ?)");
      }
      else
      {
         GXv_int31[9] = (byte)(1) ;
      }
      if ( ( AV45OrderedBy == 1 ) && ! AV46OrderedDsc )
      {
         sOrderString += " ORDER BY T2.FasCod" ;
      }
      else if ( ( AV45OrderedBy == 1 ) && ( AV46OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.FasCod DESC" ;
      }
      else if ( ( AV45OrderedBy == 2 ) && ! AV46OrderedDsc )
      {
         sOrderString += " ORDER BY T3.FasDsc" ;
      }
      else if ( ( AV45OrderedBy == 2 ) && ( AV46OrderedDsc ) )
      {
         sOrderString += " ORDER BY T3.FasDsc DESC" ;
      }
      else if ( ( AV45OrderedBy == 3 ) && ! AV46OrderedDsc )
      {
         sOrderString += " ORDER BY T1.FasQuiLin" ;
      }
      else if ( ( AV45OrderedBy == 3 ) && ( AV46OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.FasQuiLin DESC" ;
      }
      else if ( ( AV45OrderedBy == 4 ) && ! AV46OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ProForCod" ;
      }
      else if ( ( AV45OrderedBy == 4 ) && ( AV46OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ProForCod DESC" ;
      }
      else if ( ( AV45OrderedBy == 5 ) && ! AV46OrderedDsc )
      {
         sOrderString += " ORDER BY T4.ProForDsc" ;
      }
      else if ( ( AV45OrderedBy == 5 ) && ( AV46OrderedDsc ) )
      {
         sOrderString += " ORDER BY T4.ProForDsc DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin, T1.FasQuiLin" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object32[0] = scmdbuf ;
      GXv_Object32[1] = GXv_int31 ;
      return GXv_Object32 ;
   }

   protected Object[] conditional_H024Q3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV187Recetasdeacabados_recetadeacabado01_wpds_2_tffascod_sel ,
                                          String AV186Recetasdeacabados_recetadeacabado01_wpds_1_tffascod ,
                                          String AV189Recetasdeacabados_recetadeacabado01_wpds_4_tffasdsc_sel ,
                                          String AV188Recetasdeacabados_recetadeacabado01_wpds_3_tffasdsc ,
                                          short AV190Recetasdeacabados_recetadeacabado01_wpds_5_tffasquilin ,
                                          short AV191Recetasdeacabados_recetadeacabado01_wpds_6_tffasquilin_to ,
                                          String AV193Recetasdeacabados_recetadeacabado01_wpds_8_tfproforcod_sel ,
                                          String AV192Recetasdeacabados_recetadeacabado01_wpds_7_tfproforcod ,
                                          String AV195Recetasdeacabados_recetadeacabado01_wpds_10_tfprofordsc_sel ,
                                          String AV194Recetasdeacabados_recetadeacabado01_wpds_9_tfprofordsc ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          short A5371FasQuiLin ,
                                          String A764ProForCod ,
                                          String A766ProForDsc ,
                                          short AV45OrderedBy ,
                                          boolean AV46OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int33 = new byte[10];
      Object[] GXv_Object34 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (((TXPFASQUI T1 INNER JOIN TXPBARFAS T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar AND T2.ProCod = T1.ProCod AND T2.BarOrdLin = T1.BarOrdLin) LEFT JOIN TXPFASPRO T3 ON T3.EmprCod = T1.EmprCod AND T3.FasCod = T2.FasCod) INNER JOIN" ;
      scmdbuf += " TXPCPROFO T4 ON T4.EmprCod = T1.EmprCod AND T4.ProForCod = T1.ProForCod)" ;
      if ( (GXutil.strcmp("", AV187Recetasdeacabados_recetadeacabado01_wpds_2_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV186Recetasdeacabados_recetadeacabado01_wpds_1_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV187Recetasdeacabados_recetadeacabado01_wpds_2_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasCod = ?)");
      }
      else
      {
         GXv_int33[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV189Recetasdeacabados_recetadeacabado01_wpds_4_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV188Recetasdeacabados_recetadeacabado01_wpds_3_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV189Recetasdeacabados_recetadeacabado01_wpds_4_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.FasDsc = ?)");
      }
      else
      {
         GXv_int33[3] = (byte)(1) ;
      }
      if ( ! (0==AV190Recetasdeacabados_recetadeacabado01_wpds_5_tffasquilin) )
      {
         addWhere(sWhereString, "(T1.FasQuiLin >= ?)");
      }
      else
      {
         GXv_int33[4] = (byte)(1) ;
      }
      if ( ! (0==AV191Recetasdeacabados_recetadeacabado01_wpds_6_tffasquilin_to) )
      {
         addWhere(sWhereString, "(T1.FasQuiLin <= ?)");
      }
      else
      {
         GXv_int33[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV193Recetasdeacabados_recetadeacabado01_wpds_8_tfproforcod_sel)==0) && ( ! (GXutil.strcmp("", AV192Recetasdeacabados_recetadeacabado01_wpds_7_tfproforcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV193Recetasdeacabados_recetadeacabado01_wpds_8_tfproforcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForCod = ?)");
      }
      else
      {
         GXv_int33[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV195Recetasdeacabados_recetadeacabado01_wpds_10_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV194Recetasdeacabados_recetadeacabado01_wpds_9_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV195Recetasdeacabados_recetadeacabado01_wpds_10_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProForDsc = ?)");
      }
      else
      {
         GXv_int33[9] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV45OrderedBy == 1 ) && ! AV46OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV45OrderedBy == 1 ) && ( AV46OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV45OrderedBy == 2 ) && ! AV46OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV45OrderedBy == 2 ) && ( AV46OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV45OrderedBy == 3 ) && ! AV46OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV45OrderedBy == 3 ) && ( AV46OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV45OrderedBy == 4 ) && ! AV46OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV45OrderedBy == 4 ) && ( AV46OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV45OrderedBy == 5 ) && ! AV46OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV45OrderedBy == 5 ) && ( AV46OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object34[0] = scmdbuf ;
      GXv_Object34[1] = GXv_int33 ;
      return GXv_Object34 ;
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
                  return conditional_H024Q2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).shortValue() , ((Number) dynConstraints[5]).shortValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).shortValue() , ((Boolean) dynConstraints[16]).booleanValue() );
            case 1 :
                  return conditional_H024Q3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).shortValue() , ((Number) dynConstraints[5]).shortValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).shortValue() , ((Boolean) dynConstraints[16]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H024Q2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H024Q3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H024Q4", "SELECT SUM(Ac_Kilos), SUM(Ac_Metros) FROM TXPHDRACA WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 28);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 3);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[15], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 28);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 28);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[19]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[20]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 28);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 28);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[14]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[15]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 30);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

