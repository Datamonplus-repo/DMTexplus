package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class hojaderuta_pieza_impl extends GXDataArea
{
   public void initenv( )
   {
      if ( GxWebError != 0 )
      {
         return  ;
      }
   }

   public void inittrn( )
   {
      initialize_properties( ) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action39") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A228BarUniMed = httpContext.GetPar( "BarUniMed") ;
         httpContext.ajax_rsp_assign_attri("", false, "A228BarUniMed", A228BarUniMed);
         AV14PesoML = (short)(GXutil.lval( httpContext.GetPar( "PesoML"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14PesoML", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14PesoML), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_39_1SD18( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A228BarUniMed, AV14PesoML) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action47") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_47_1SD18( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action48") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_48_1SD18( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action49") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A203BarPieKil = CommonUtil.decimalVal( httpContext.GetPar( "BarPieKil"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "A203BarPieKil", GXutil.ltrimstr( A203BarPieKil, 9, 2));
         A120BarAgrEst = httpContext.GetPar( "BarAgrEst") ;
         httpContext.ajax_rsp_assign_attri("", false, "A120BarAgrEst", A120BarAgrEst);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_49_1SD18( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A203BarPieKil, A120BarAgrEst) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel3"+"_"+"PEDIDOCLIE") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4812BarEncCli = httpContext.GetPar( "BarEncCli") ;
         httpContext.ajax_rsp_assign_attri("", false, "A4812BarEncCli", A4812BarEncCli);
         A143BarDisNum = httpContext.GetPar( "BarDisNum") ;
         httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx3asapedidoclie1SD18( A396EmprCod, A4812BarEncCli, A143BarDisNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_52") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_52( A396EmprCod, A44AlbRecCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_54") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_54( A396EmprCod, A252CliCod) ;
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
            AV7EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
            AV18BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18BarCod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV18BarCod), "ZZZZZZZ9")));
            AV19BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19BarCodReo", GXutil.str( AV19BarCodReo, 1, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV19BarCodReo), "9")));
            AV20BarCodPar = httpContext.GetPar( "BarCodPar") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20BarCodPar", AV20BarCodPar);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20BarCodPar, ""))));
            AV21BarPieCod = httpContext.GetPar( "BarPieCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21BarPieCod", AV21BarPieCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPIECOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV21BarPieCod, ""))));
         }
      }
      if ( toggleJsOutput )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableJsOutput();
         }
      }
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
      if ( ! httpContext.isSpaRequest( ) )
      {
         if ( httpContext.exposeMetadata( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 17_0_11-163677", (short)(0)) ;
         }
         Form.getMeta().addItem("description", httpContext.getMessage( "Modificacion", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtBarPieKil_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public hojaderuta_pieza_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public hojaderuta_pieza_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( hojaderuta_pieza_impl.class ));
   }

   public hojaderuta_pieza_impl( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
   }

   public void webExecute( )
   {
      initenv( ) ;
      inittrn( ) ;
      if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
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

   public void fix_multi_value_controls( )
   {
   }

   public void draw( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         disable_std_buttons( ) ;
         enableDisable( ) ;
         set_caption( ) ;
         /* Form start */
         drawControls( ) ;
         fix_multi_value_controls( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void drawControls( )
   {
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-gx-base-lib=\"bootstrapv3\""+" "+"data-abstract-form"+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divLayoutmaintable_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablemain_Internalname, 1, 0, "px", 0, "px", "TableMainTransaction", "left", "top", "", "", "div");
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
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "TableContent15", "left", "top", "", "", "div");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarNHdr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarNHdr_Internalname, httpContext.getMessage( "N° Hdr", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarNHdr_Internalname, GXutil.rtrim( A13696BarNHdr), GXutil.rtrim( localUtil.format( A13696BarNHdr, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarNHdr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarNHdr_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta_Pieza.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-8 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPedidoClie_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPedidoClie_Internalname, httpContext.getMessage( "Pedido Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPedidoClie_Internalname, GXutil.rtrim( A13878PedidoClie), GXutil.rtrim( localUtil.format( A13878PedidoClie, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPedidoClie_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPedidoClie_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta_Pieza.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliNom_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta_Pieza.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarSer_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarSer_Internalname, httpContext.getMessage( "Articulo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarSer_Internalname, GXutil.rtrim( A212BarSer), GXutil.rtrim( localUtil.format( A212BarSer, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarSer_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarSer_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta_Pieza.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarSerDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarSerDsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarSerDsc_Internalname, GXutil.rtrim( A1652BarSerDsc), GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarSerDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarSerDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta_Pieza.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, divUnnamedtable5_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarColNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarColNom_Internalname, httpContext.getMessage( "Color", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarColNom_Internalname, GXutil.rtrim( A135BarColNom), GXutil.rtrim( localUtil.format( A135BarColNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarColNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarColNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta_Pieza.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarColNum_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarColNum_Internalname, httpContext.getMessage( "Numero", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarColNum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarColNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta_Pieza.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarTipCol_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarTipCol_Internalname, httpContext.getMessage( "TC", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarTipCol_Internalname, GXutil.ltrim( localUtil.ntoc( A218BarTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarTipCol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A218BarTipCol), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A218BarTipCol), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarTipCol_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarTipCol_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta_Pieza.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarKgm_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarKgm_Internalname, httpContext.getMessage( "Kilos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A166BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarKgm_Enabled!=0) ? localUtil.format( A166BarKgm, "ZZZZZ9.99") : localUtil.format( A166BarKgm, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarKgm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarKgm_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta_Pieza.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarMtr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarMtr_Internalname, httpContext.getMessage( "Metros", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A184BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarMtr_Enabled!=0) ? localUtil.format( A184BarMtr, "ZZZZZ9.99") : localUtil.format( A184BarMtr, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarMtr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarMtr_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta_Pieza.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarPieNDes_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarPieNDes_Internalname, httpContext.getMessage( "Piezas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPieNDes_Internalname, GXutil.ltrim( localUtil.ntoc( A898BarPieNDes, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarPieNDes_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A898BarPieNDes), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A898BarPieNDes), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPieNDes_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarPieNDes_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta_Pieza.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarUniMed_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarUniMed_Internalname, httpContext.getMessage( "Und", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarUniMed_Internalname, GXutil.rtrim( A228BarUniMed), GXutil.rtrim( localUtil.format( A228BarUniMed, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarUniMed_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarUniMed_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta_Pieza.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRecCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRecCod_Internalname, httpContext.getMessage( "N Recepcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRecCod_Internalname, GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRecCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRecCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRecCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta_Pieza.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarPieKil_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarPieKil_Internalname, httpContext.getMessage( "Kilos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPieKil_Internalname, GXutil.ltrim( localUtil.ntoc( A203BarPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarPieKil_Enabled!=0) ? localUtil.format( A203BarPieKil, "ZZZZZ9.99") : localUtil.format( A203BarPieKil, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,98);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPieKil_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarPieKil_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta_Pieza.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarPieMet_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarPieMet_Internalname, httpContext.getMessage( "Metros", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 102,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPieMet_Internalname, GXutil.ltrim( localUtil.ntoc( A205BarPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( A205BarPieMet, "ZZZZZ9.99")), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,102);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPieMet_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarPieMet_Enabled, 1, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta_Pieza.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarPiePie_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarPiePie_Internalname, httpContext.getMessage( "Piezas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPiePie_Internalname, GXutil.ltrim( localUtil.ntoc( A1501BarPiePie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarPiePie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1501BarPiePie), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1501BarPiePie), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPiePie_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarPiePie_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta_Pieza.htm");
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
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group TrnActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_PedidosClienteSinDetalle\\HojadeRuta_Pieza.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_PedidosClienteSinDetalle\\HojadeRuta_Pieza.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV30Pgmname), GXutil.rtrim( localUtil.format( AV30Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta_Pieza.htm");
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
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPieCod_Internalname, GXutil.rtrim( A200BarPieCod), GXutil.rtrim( localUtil.format( A200BarPieCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPieCod_Jsonclick, 0, "Attribute", "", "", "", "", edtBarPieCod_Visible, edtBarPieCod_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta_Pieza.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarNumUni_Internalname, GXutil.ltrim( localUtil.ntoc( A192BarNumUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarNumUni_Enabled!=0) ? localUtil.format( A192BarNumUni, "ZZZZZ9.99") : localUtil.format( A192BarNumUni, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarNumUni_Jsonclick, 0, "Attribute", "", "", "", "", edtBarNumUni_Visible, edtBarNumUni_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta_Pieza.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarNumPie_Internalname, GXutil.ltrim( localUtil.ntoc( A191BarNumPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarNumPie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A191BarNumPie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A191BarNumPie), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarNumPie_Jsonclick, 0, "Attribute", "", "", "", "", edtBarNumPie_Visible, edtBarNumPie_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta_Pieza.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPes_Internalname, GXutil.ltrim( localUtil.ntoc( A864BarPes, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarPes_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A864BarPes), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A864BarPes), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPes_Jsonclick, 0, "Attribute", "", "", "", "", edtBarPes_Visible, edtBarPes_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta_Pieza.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "Attribute", "", "", "", "", edtCliCod_Visible, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta_Pieza.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void userMain( )
   {
      standaloneStartup( ) ;
   }

   public void userMainFullajax( )
   {
      initenv( ) ;
      inittrn( ) ;
      userMain( ) ;
      draw( ) ;
      sendCloseFormHiddens( ) ;
   }

   public void standaloneStartup( )
   {
      standaloneStartupServer( ) ;
      disable_std_buttons( ) ;
      enableDisable( ) ;
      process( ) ;
   }

   public void standaloneStartupServer( )
   {
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e111SD2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z130BarCodPar = httpContext.cgiGet( "Z130BarCodPar") ;
            Z200BarPieCod = httpContext.cgiGet( "Z200BarPieCod") ;
            Z203BarPieKil = localUtil.ctond( httpContext.cgiGet( "Z203BarPieKil")) ;
            Z205BarPieMet = localUtil.ctond( httpContext.cgiGet( "Z205BarPieMet")) ;
            Z201BarPieEst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z201BarPieEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z170BarKilLan = localUtil.ctond( httpContext.cgiGet( "Z170BarKilLan")) ;
            Z183BarMetLan = localUtil.ctond( httpContext.cgiGet( "Z183BarMetLan")) ;
            Z197BarPConTro = (short)(localUtil.ctol( httpContext.cgiGet( "Z197BarPConTro"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z908PieOriCod = httpContext.cgiGet( "Z908PieOriCod") ;
            Z1271BarPieLzd = (int)(localUtil.ctol( httpContext.cgiGet( "Z1271BarPieLzd"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1501BarPiePie = (int)(localUtil.ctol( httpContext.cgiGet( "Z1501BarPiePie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z44AlbRecCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A201BarPieEst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z201BarPieEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A170BarKilLan = localUtil.ctond( httpContext.cgiGet( "Z170BarKilLan")) ;
            A183BarMetLan = localUtil.ctond( httpContext.cgiGet( "Z183BarMetLan")) ;
            A197BarPConTro = (short)(localUtil.ctol( httpContext.cgiGet( "Z197BarPConTro"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A908PieOriCod = httpContext.cgiGet( "Z908PieOriCod") ;
            A1271BarPieLzd = (int)(localUtil.ctol( httpContext.cgiGet( "Z1271BarPieLzd"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O1501BarPiePie = (int)(localUtil.ctol( httpContext.cgiGet( "O1501BarPiePie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O205BarPieMet = localUtil.ctond( httpContext.cgiGet( "O205BarPieMet")) ;
            O203BarPieKil = localUtil.ctond( httpContext.cgiGet( "O203BarPieKil")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            N205BarPieMet = localUtil.ctond( httpContext.cgiGet( "N205BarPieMet")) ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            A4812BarEncCli = httpContext.cgiGet( "BARENCCLI") ;
            A143BarDisNum = httpContext.cgiGet( "BARDISNUM") ;
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "BARCODREO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A130BarCodPar = httpContext.cgiGet( "BARCODPAR") ;
            A365DisDes = httpContext.cgiGet( "DISDES") ;
            A199BarPie1 = (short)(localUtil.ctol( httpContext.cgiGet( "BARPIE1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A198BarPie = (int)(localUtil.ctol( httpContext.cgiGet( "BARPIE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A58AlbRUniEnt = localUtil.ctond( httpContext.cgiGet( "ALBRUNIENT")) ;
            A60AlbRUniUti = localUtil.ctond( httpContext.cgiGet( "ALBRUNIUTI")) ;
            A57AlbRUniDis = localUtil.ctond( httpContext.cgiGet( "ALBRUNIDIS")) ;
            A52AlbRPieEnt = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRPIEENT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A54AlbRPieUti = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRPIEUTI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A51AlbRPieDis = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRPIEDIS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV7EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV18BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "vBARCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV19BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "vBARCODREO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV20BarCodPar = httpContext.cgiGet( "vBARCODPAR") ;
            AV21BarPieCod = httpContext.cgiGet( "vBARPIECOD") ;
            AV25Insert_AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( "vINSERT_ALBRECCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV11Flag2 = (short)(localUtil.ctol( httpContext.cgiGet( "vFLAG2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV27KilAnt = localUtil.ctond( httpContext.cgiGet( "vKILANT")) ;
            AV28MtrAnt = localUtil.ctond( httpContext.cgiGet( "vMTRANT")) ;
            AV29BarPieAnt = (int)(localUtil.ctol( httpContext.cgiGet( "vBARPIEANT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A213BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( "BARSIT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV14PesoML = (short)(localUtil.ctol( httpContext.cgiGet( "vPESOML"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV15Vertex = (short)(localUtil.ctol( httpContext.cgiGet( "vVERTEX"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A120BarAgrEst = httpContext.cgiGet( "BARAGREST") ;
            A201BarPieEst = (byte)(localUtil.ctol( httpContext.cgiGet( "BARPIEEST"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A170BarKilLan = localUtil.ctond( httpContext.cgiGet( "BARKILLAN")) ;
            A183BarMetLan = localUtil.ctond( httpContext.cgiGet( "BARMETLAN")) ;
            A197BarPConTro = (short)(localUtil.ctol( httpContext.cgiGet( "BARPCONTRO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A908PieOriCod = httpContext.cgiGet( "PIEORICOD") ;
            A1271BarPieLzd = (int)(localUtil.ctol( httpContext.cgiGet( "BARPIELZD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A47AlbREst = (byte)(localUtil.ctol( httpContext.cgiGet( "ALBREST"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A46AlbREnt = httpContext.cgiGet( "ALBRENT") ;
            A182BarMat = httpContext.cgiGet( "BARMAT") ;
            A392DisUniMed = httpContext.cgiGet( "DISUNIMED") ;
            Dvpanel_tableattributes_Objectcall = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Objectcall") ;
            Dvpanel_tableattributes_Class = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Class") ;
            Dvpanel_tableattributes_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Enabled")) ;
            Dvpanel_tableattributes_Width = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Width") ;
            Dvpanel_tableattributes_Height = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Height") ;
            Dvpanel_tableattributes_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Autowidth")) ;
            Dvpanel_tableattributes_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Autoheight")) ;
            Dvpanel_tableattributes_Cls = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Cls") ;
            Dvpanel_tableattributes_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Showheader")) ;
            Dvpanel_tableattributes_Title = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Title") ;
            Dvpanel_tableattributes_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Collapsible")) ;
            Dvpanel_tableattributes_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Collapsed")) ;
            Dvpanel_tableattributes_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Showcollapseicon")) ;
            Dvpanel_tableattributes_Iconposition = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Iconposition") ;
            Dvpanel_tableattributes_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Autoscroll")) ;
            Dvpanel_tableattributes_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Visible")) ;
            Dvpanel_tableattributes_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Dvpanel_unnamedtable1_Objectcall = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Objectcall") ;
            Dvpanel_unnamedtable1_Class = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Class") ;
            Dvpanel_unnamedtable1_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Enabled")) ;
            Dvpanel_unnamedtable1_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Width") ;
            Dvpanel_unnamedtable1_Height = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Height") ;
            Dvpanel_unnamedtable1_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autowidth")) ;
            Dvpanel_unnamedtable1_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autoheight")) ;
            Dvpanel_unnamedtable1_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Cls") ;
            Dvpanel_unnamedtable1_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Showheader")) ;
            Dvpanel_unnamedtable1_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Title") ;
            Dvpanel_unnamedtable1_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Collapsible")) ;
            Dvpanel_unnamedtable1_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Collapsed")) ;
            Dvpanel_unnamedtable1_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Showcollapseicon")) ;
            Dvpanel_unnamedtable1_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Iconposition") ;
            Dvpanel_unnamedtable1_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autoscroll")) ;
            Dvpanel_unnamedtable1_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Visible")) ;
            Dvpanel_unnamedtable1_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A13696BarNHdr = httpContext.cgiGet( edtBarNHdr_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13696BarNHdr", A13696BarNHdr);
            A13878PedidoClie = httpContext.cgiGet( edtPedidoClie_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13878PedidoClie", A13878PedidoClie);
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
            A1652BarSerDsc = httpContext.cgiGet( edtBarSerDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1652BarSerDsc", A1652BarSerDsc);
            A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
            A136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
            A218BarTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarTipCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
            A166BarKgm = localUtil.ctond( httpContext.cgiGet( edtBarKgm_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
            A184BarMtr = localUtil.ctond( httpContext.cgiGet( edtBarMtr_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
            A898BarPieNDes = (int)(localUtil.ctol( httpContext.cgiGet( edtBarPieNDes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A898BarPieNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A898BarPieNDes), 6, 0));
            A228BarUniMed = GXutil.upper( httpContext.cgiGet( edtBarUniMed_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A228BarUniMed", A228BarUniMed);
            A44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarPieKil_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarPieKil_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARPIEKIL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarPieKil_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A203BarPieKil = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A203BarPieKil", GXutil.ltrimstr( A203BarPieKil, 9, 2));
            }
            else
            {
               A203BarPieKil = localUtil.ctond( httpContext.cgiGet( edtBarPieKil_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A203BarPieKil", GXutil.ltrimstr( A203BarPieKil, 9, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarPieMet_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarPieMet_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARPIEMET");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarPieMet_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A205BarPieMet = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A205BarPieMet", GXutil.ltrimstr( A205BarPieMet, 9, 2));
            }
            else
            {
               A205BarPieMet = localUtil.ctond( httpContext.cgiGet( edtBarPieMet_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A205BarPieMet", GXutil.ltrimstr( A205BarPieMet, 9, 2));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarPiePie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarPiePie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARPIEPIE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarPiePie_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A1501BarPiePie = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A1501BarPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1501BarPiePie), 6, 0));
            }
            else
            {
               A1501BarPiePie = (int)(localUtil.ctol( httpContext.cgiGet( edtBarPiePie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1501BarPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1501BarPiePie), 6, 0));
            }
            AV30Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30Pgmname", AV30Pgmname);
            A200BarPieCod = httpContext.cgiGet( edtBarPieCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
            A192BarNumUni = localUtil.ctond( httpContext.cgiGet( edtBarNumUni_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A192BarNumUni", GXutil.ltrimstr( A192BarNumUni, 9, 2));
            A191BarNumPie = (short)(localUtil.ctol( httpContext.cgiGet( edtBarNumPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A191BarNumPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A191BarNumPie), 4, 0));
            A864BarPes = (short)(localUtil.ctol( httpContext.cgiGet( edtBarPes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A864BarPes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A864BarPes), 4, 0));
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"HojadeRuta_Pieza");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            AV30Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30Pgmname", AV30Pgmname);
            forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV30Pgmname, "")));
            forbiddenHiddens.add("BarPieEst", localUtil.format( DecimalUtil.doubleToDec(A201BarPieEst), "9"));
            forbiddenHiddens.add("BarKilLan", localUtil.format( A170BarKilLan, "ZZZZZ9.99"));
            forbiddenHiddens.add("BarMetLan", localUtil.format( A183BarMetLan, "ZZZZZ9.99"));
            forbiddenHiddens.add("BarPConTro", localUtil.format( DecimalUtil.doubleToDec(A197BarPConTro), "ZZ9"));
            forbiddenHiddens.add("PieOriCod", GXutil.rtrim( localUtil.format( A908PieOriCod, "")));
            forbiddenHiddens.add("BarPieLzd", localUtil.format( DecimalUtil.doubleToDec(A1271BarPieLzd), "ZZZ9"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A200BarPieCod, Z200BarPieCod) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("pedidosclientesindetalle\\hojaderuta_pieza:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               AnyError = (short)(1) ;
               return  ;
            }
            standaloneNotModal( ) ;
         }
         else
         {
            standaloneNotModal( ) ;
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") == 0 )
            {
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               A200BarPieCod = httpContext.GetPar( "BarPieCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
               getEqualNoModal( ) ;
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               disable_std_buttons( ) ;
               standaloneModal( ) ;
            }
            else
            {
               if ( isDsp( ) )
               {
                  sMode18 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode18 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound18 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1SD0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "BARPIECOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtBarPieCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
      }
   }

   public void process( )
   {
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read Transaction buttons. */
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
                     if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Start */
                        e111SD2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121SD2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        if ( ! isDsp( ) )
                        {
                           btn_enter( ) ;
                        }
                        /* No code required for Cancel button. It is implemented as the Reset button. */
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

   public void afterTrn( )
   {
      if ( trnEnded == 1 )
      {
         if ( ! (GXutil.strcmp("", endTrnMsgTxt)==0) )
         {
            httpContext.GX_msglist.addItem(endTrnMsgTxt, endTrnMsgCod, 0, "", true);
         }
         /* Execute user event: After Trn */
         e121SD2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1SD18( ) ;
            standaloneNotModal( ) ;
            standaloneModal( ) ;
         }
      }
      endTrnMsgTxt = "" ;
   }

   public String toString( )
   {
      return "" ;
   }

   public GXContentInfo getContentInfo( )
   {
      return (GXContentInfo)(null) ;
   }

   public void disable_std_buttons( )
   {
      if ( isDsp( ) || isDlt( ) )
      {
         if ( isDsp( ) )
         {
            bttBtntrn_enter_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_enter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_enter_Visible), 5, 0), true);
         }
         disableAttributes1SD18( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void set_caption( )
   {
      if ( ( IsConfirmed == 1 ) && ( AnyError == 0 ) )
      {
         if ( isDlt( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_confdelete"), 0, "", true);
         }
         else
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_mustconfirm"), 0, "", true);
         }
      }
   }

   public void confirm_1SD0( )
   {
      beforeValidate1SD18( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1SD18( ) ;
         }
         else
         {
            checkExtendedTable1SD18( ) ;
            closeExtendedTableCursors1SD18( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption1SD0( )
   {
   }

   public void e111SD2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV8Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      hojaderuta_pieza_impl.this.GXt_char1 = GXv_char2[0] ;
      AV8Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Station", AV8Station);
      GXv_char2[0] = AV7EmprCod ;
      GXv_char3[0] = AV9EmprNom ;
      GXv_char4[0] = AV10UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV8Station, GXv_char2, GXv_char3, GXv_char4) ;
      hojaderuta_pieza_impl.this.AV7EmprCod = GXv_char2[0] ;
      hojaderuta_pieza_impl.this.AV9EmprNom = GXv_char3[0] ;
      hojaderuta_pieza_impl.this.AV10UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV9EmprNom", AV9EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV10UsurCod", AV10UsurCod);
      GXt_int5 = (byte)(AV11Flag2) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, "999999", GXv_int6) ;
      hojaderuta_pieza_impl.this.GXt_int5 = GXv_int6[0] ;
      AV11Flag2 = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11Flag2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11Flag2), 4, 0));
      GXt_int5 = (byte)(AV12Flag1) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "HISEMP", ""), GXv_int6) ;
      hojaderuta_pieza_impl.this.GXt_int5 = GXv_int6[0] ;
      AV12Flag1 = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Flag1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12Flag1), 4, 0));
      GXv_int6[0] = (byte)(AV14PesoML) ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "NOPML", ""), GXv_int6) ;
      hojaderuta_pieza_impl.this.AV14PesoML = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14PesoML", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14PesoML), 4, 0));
      GXt_int5 = (byte)(AV15Vertex) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "VERTEX", ""), GXv_int6) ;
      hojaderuta_pieza_impl.this.GXt_int5 = GXv_int6[0] ;
      AV15Vertex = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Vertex", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15Vertex), 4, 0));
      GXv_int6[0] = (byte)(AV16Velta) ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "TINTTO", ""), GXv_int6) ;
      hojaderuta_pieza_impl.this.AV16Velta = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Velta", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16Velta), 4, 0));
      if ( AV16Velta == 1 )
      {
         GXv_char4[0] = AV7EmprCod ;
         GXv_int7[0] = A129BarCod ;
         GXv_int6[0] = A132BarCodReo ;
         GXv_char3[0] = A130BarCodPar ;
         GXv_decimal8[0] = DecimalUtil.doubleToDec(0) ;
         GXv_decimal9[0] = AV17BarMtrOld ;
         GXv_int10[0] = 0 ;
         new app.pbuskmp(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int6, GXv_char3, GXv_decimal8, GXv_decimal9, GXv_int10) ;
         hojaderuta_pieza_impl.this.AV7EmprCod = GXv_char4[0] ;
         hojaderuta_pieza_impl.this.A129BarCod = GXv_int7[0] ;
         hojaderuta_pieza_impl.this.A132BarCodReo = GXv_int6[0] ;
         hojaderuta_pieza_impl.this.A130BarCodPar = GXv_char3[0] ;
         hojaderuta_pieza_impl.this.AV17BarMtrOld = GXv_decimal9[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.ajax_rsp_assign_attri("", false, "AV17BarMtrOld", GXutil.ltrimstr( AV17BarMtrOld, 9, 2));
      }
      GXt_char1 = AV8Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      hojaderuta_pieza_impl.this.GXt_char1 = GXv_char4[0] ;
      AV8Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Station", AV8Station);
      GXv_char4[0] = AV7EmprCod ;
      GXv_char3[0] = AV9EmprNom ;
      GXv_char2[0] = AV10UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV8Station, GXv_char4, GXv_char3, GXv_char2) ;
      hojaderuta_pieza_impl.this.AV7EmprCod = GXv_char4[0] ;
      hojaderuta_pieza_impl.this.AV9EmprNom = GXv_char3[0] ;
      hojaderuta_pieza_impl.this.AV10UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV9EmprNom", AV9EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV10UsurCod", AV10UsurCod);
      GXv_SdtWWPContext11[0] = AV22WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext11) ;
      AV22WWPContext = GXv_SdtWWPContext11[0] ;
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV23TrnContext.fromxml(AV24WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV23TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV30Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV31GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31GXV1), 8, 0));
         while ( AV31GXV1 <= AV23TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV26TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV23TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV31GXV1));
            if ( GXutil.strcmp(AV26TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "AlbRecCod") == 0 )
            {
               AV25Insert_AlbRecCod = (int)(GXutil.lval( AV26TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV25Insert_AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25Insert_AlbRecCod), 8, 0));
            }
            AV31GXV1 = (int)(AV31GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31GXV1), 8, 0));
         }
      }
      edtBarPieCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieCod_Visible), 5, 0), true);
      edtBarNumUni_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNumUni_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNumUni_Visible), 5, 0), true);
      edtBarNumPie_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNumPie_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNumPie_Visible), 5, 0), true);
      edtBarPes_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPes_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPes_Visible), 5, 0), true);
      edtCliCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Visible), 5, 0), true);
   }

   public void e121SD2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(7);
      pr_default.close(6);
      pr_default.close(5);
      pr_default.close(4);
      pr_default.close(3);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void S112( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
   }

   public void zm1SD18( int GX_JID )
   {
      if ( ( GX_JID == 50 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z203BarPieKil = T01SD3_A203BarPieKil[0] ;
            Z205BarPieMet = T01SD3_A205BarPieMet[0] ;
            Z201BarPieEst = T01SD3_A201BarPieEst[0] ;
            Z170BarKilLan = T01SD3_A170BarKilLan[0] ;
            Z183BarMetLan = T01SD3_A183BarMetLan[0] ;
            Z197BarPConTro = T01SD3_A197BarPConTro[0] ;
            Z908PieOriCod = T01SD3_A908PieOriCod[0] ;
            Z1271BarPieLzd = T01SD3_A1271BarPieLzd[0] ;
            Z1501BarPiePie = T01SD3_A1501BarPiePie[0] ;
            Z44AlbRecCod = T01SD3_A44AlbRecCod[0] ;
         }
         else
         {
            Z203BarPieKil = A203BarPieKil ;
            Z205BarPieMet = A205BarPieMet ;
            Z201BarPieEst = A201BarPieEst ;
            Z170BarKilLan = A170BarKilLan ;
            Z183BarMetLan = A183BarMetLan ;
            Z197BarPConTro = A197BarPConTro ;
            Z908PieOriCod = A908PieOriCod ;
            Z1271BarPieLzd = A1271BarPieLzd ;
            Z1501BarPiePie = A1501BarPiePie ;
            Z44AlbRecCod = A44AlbRecCod ;
         }
      }
      if ( GX_JID == -50 )
      {
         Z200BarPieCod = A200BarPieCod ;
         Z203BarPieKil = A203BarPieKil ;
         Z205BarPieMet = A205BarPieMet ;
         Z201BarPieEst = A201BarPieEst ;
         Z170BarKilLan = A170BarKilLan ;
         Z183BarMetLan = A183BarMetLan ;
         Z197BarPConTro = A197BarPConTro ;
         Z908PieOriCod = A908PieOriCod ;
         Z1271BarPieLzd = A1271BarPieLzd ;
         Z1501BarPiePie = A1501BarPiePie ;
         Z396EmprCod = A396EmprCod ;
         Z44AlbRecCod = A44AlbRecCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z407EmprNom = A407EmprNom ;
         Z60AlbRUniUti = A60AlbRUniUti ;
         Z54AlbRPieUti = A54AlbRPieUti ;
         Z58AlbRUniEnt = A58AlbRUniEnt ;
         Z52AlbRPieEnt = A52AlbRPieEnt ;
         Z47AlbREst = A47AlbREst ;
         Z46AlbREnt = A46AlbREnt ;
         Z252CliCod = A252CliCod ;
         Z279CliNom = A279CliNom ;
         Z4812BarEncCli = A4812BarEncCli ;
         Z143BarDisNum = A143BarDisNum ;
         Z212BarSer = A212BarSer ;
         Z1652BarSerDsc = A1652BarSerDsc ;
         Z182BarMat = A182BarMat ;
         Z135BarColNom = A135BarColNom ;
         Z136BarColNum = A136BarColNum ;
         Z218BarTipCol = A218BarTipCol ;
         Z864BarPes = A864BarPes ;
         Z213BarSit = A213BarSit ;
         Z120BarAgrEst = A120BarAgrEst ;
         Z228BarUniMed = A228BarUniMed ;
         Z192BarNumUni = A192BarNumUni ;
         Z191BarNumPie = A191BarNumPie ;
         Z361DisCod = A361DisCod ;
         Z392DisUniMed = A392DisUniMed ;
         Z365DisDes = A365DisDes ;
         Z898BarPieNDes = A898BarPieNDes ;
         Z184BarMtr = A184BarMtr ;
         Z166BarKgm = A166BarKgm ;
         Z199BarPie1 = A199BarPie1 ;
      }
   }

   public void standaloneNotModal( )
   {
      edtBarPieCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieCod_Enabled), 5, 0), true);
      edtAlbRecCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), true);
      edtBarUniMed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarUniMed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarUniMed_Enabled), 5, 0), true);
      edtBarColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNom_Enabled), 5, 0), true);
      edtBarColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNum_Enabled), 5, 0), true);
      edtBarTipCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTipCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipCol_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtBarSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Enabled), 5, 0), true);
      edtBarSerDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSerDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSerDsc_Enabled), 5, 0), true);
      divUnnamedtable5_Visible = (((1==0)) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, divUnnamedtable5_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable5_Visible), 5, 0), true);
      AV30Pgmname = "PedidosClienteSinDetalle.HojadeRuta_Pieza" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30Pgmname", AV30Pgmname);
      edtBarPieCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieCod_Enabled), 5, 0), true);
      edtAlbRecCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), true);
      edtBarUniMed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarUniMed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarUniMed_Enabled), 5, 0), true);
      edtBarColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNom_Enabled), 5, 0), true);
      edtBarColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNum_Enabled), 5, 0), true);
      edtBarTipCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTipCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipCol_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtBarSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Enabled), 5, 0), true);
      edtBarSerDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSerDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSerDsc_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV7EmprCod)==0) )
      {
         A396EmprCod = AV7EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01SD4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01SD4_A407EmprNom[0] ;
      n407EmprNom = T01SD4_n407EmprNom[0] ;
      pr_default.close(2);
      if ( ! (0==AV18BarCod) )
      {
         A129BarCod = AV18BarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      }
      if ( ! (0==AV19BarCodReo) )
      {
         A132BarCodReo = AV19BarCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      }
      if ( ! (GXutil.strcmp("", AV20BarCodPar)==0) )
      {
         A130BarCodPar = AV20BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      }
      /* Using cursor T01SD6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
      }
      A4812BarEncCli = T01SD6_A4812BarEncCli[0] ;
      A143BarDisNum = T01SD6_A143BarDisNum[0] ;
      A212BarSer = T01SD6_A212BarSer[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
      A1652BarSerDsc = T01SD6_A1652BarSerDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1652BarSerDsc", A1652BarSerDsc);
      A182BarMat = T01SD6_A182BarMat[0] ;
      A135BarColNom = T01SD6_A135BarColNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
      A136BarColNum = T01SD6_A136BarColNum[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
      A218BarTipCol = T01SD6_A218BarTipCol[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
      A864BarPes = T01SD6_A864BarPes[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A864BarPes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A864BarPes), 4, 0));
      A213BarSit = T01SD6_A213BarSit[0] ;
      A120BarAgrEst = T01SD6_A120BarAgrEst[0] ;
      A228BarUniMed = T01SD6_A228BarUniMed[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A228BarUniMed", A228BarUniMed);
      A192BarNumUni = T01SD6_A192BarNumUni[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A192BarNumUni", GXutil.ltrimstr( A192BarNumUni, 9, 2));
      A191BarNumPie = T01SD6_A191BarNumPie[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A191BarNumPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A191BarNumPie), 4, 0));
      A361DisCod = T01SD6_A361DisCod[0] ;
      pr_default.close(4);
      GXt_char1 = A13878PedidoClie ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A4812BarEncCli ;
      GXv_char2[0] = A143BarDisNum ;
      GXv_char12[0] = GXt_char1 ;
      new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2, GXv_char12) ;
      hojaderuta_pieza_impl.this.A396EmprCod = GXv_char4[0] ;
      hojaderuta_pieza_impl.this.A4812BarEncCli = GXv_char3[0] ;
      hojaderuta_pieza_impl.this.A143BarDisNum = GXv_char2[0] ;
      hojaderuta_pieza_impl.this.GXt_char1 = GXv_char12[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A4812BarEncCli", A4812BarEncCli);
      httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
      A13878PedidoClie = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A13878PedidoClie", A13878PedidoClie);
      if ( GXutil.strcmp(A228BarUniMed, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 )
      {
         edtBarPieMet_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarPieMet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieMet_Enabled), 5, 0), true);
      }
      else
      {
         edtBarPieMet_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarPieMet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieMet_Enabled), 5, 0), true);
      }
      /* Using cursor T01SD8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
      }
      A392DisUniMed = T01SD8_A392DisUniMed[0] ;
      A365DisDes = T01SD8_A365DisDes[0] ;
      pr_default.close(6);
      /* Using cursor T01SD10 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(7) != 101) )
      {
         A898BarPieNDes = T01SD10_A898BarPieNDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A898BarPieNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A898BarPieNDes), 6, 0));
         A184BarMtr = T01SD10_A184BarMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
         A166BarKgm = T01SD10_A166BarKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
         A199BarPie1 = T01SD10_A199BarPie1[0] ;
      }
      else
      {
         A898BarPieNDes = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A898BarPieNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A898BarPieNDes), 6, 0));
         A184BarMtr = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
         A166BarKgm = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
         A199BarPie1 = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A199BarPie1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A199BarPie1), 4, 0));
      }
      pr_default.close(7);
      if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
      {
         A198BarPie = A898BarPieNDes ;
         httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
      }
      else
      {
         A198BarPie = A199BarPie1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
      }
      A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
      httpContext.ajax_rsp_assign_attri("", false, "A13696BarNHdr", A13696BarNHdr);
      if ( ! (GXutil.strcmp("", AV21BarPieCod)==0) )
      {
         A200BarPieCod = AV21BarPieCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
      }
   }

   public void standaloneModal( )
   {
      if ( isIns( )  && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Funcion no permitida", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV25Insert_AlbRecCod) )
      {
         A44AlbRecCod = AV25Insert_AlbRecCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      }
      if ( GXutil.strcmp(Gx_mode, "DSP") == 0 )
      {
         bttBtntrn_enter_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_enter_Enabled), 5, 0), true);
      }
      else
      {
         bttBtntrn_enter_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_enter_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         /* Using cursor T01SD5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         A60AlbRUniUti = T01SD5_A60AlbRUniUti[0] ;
         A54AlbRPieUti = T01SD5_A54AlbRPieUti[0] ;
         A58AlbRUniEnt = T01SD5_A58AlbRUniEnt[0] ;
         A52AlbRPieEnt = T01SD5_A52AlbRPieEnt[0] ;
         A47AlbREst = T01SD5_A47AlbREst[0] ;
         A46AlbREnt = T01SD5_A46AlbREnt[0] ;
         A252CliCod = T01SD5_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         pr_default.close(3);
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
         {
            A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
         else
         {
            if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
            }
            else
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
            }
         }
         A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
         httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
         /* Using cursor T01SD7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01SD7_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(5);
      }
   }

   public void load1SD18( )
   {
      /* Using cursor T01SD12 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound18 = (short)(1) ;
         A203BarPieKil = T01SD12_A203BarPieKil[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A203BarPieKil", GXutil.ltrimstr( A203BarPieKil, 9, 2));
         A4812BarEncCli = T01SD12_A4812BarEncCli[0] ;
         A143BarDisNum = T01SD12_A143BarDisNum[0] ;
         A279CliNom = T01SD12_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A212BarSer = T01SD12_A212BarSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
         A1652BarSerDsc = T01SD12_A1652BarSerDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1652BarSerDsc", A1652BarSerDsc);
         A182BarMat = T01SD12_A182BarMat[0] ;
         A135BarColNom = T01SD12_A135BarColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
         A136BarColNum = T01SD12_A136BarColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
         A218BarTipCol = T01SD12_A218BarTipCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
         A392DisUniMed = T01SD12_A392DisUniMed[0] ;
         A864BarPes = T01SD12_A864BarPes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A864BarPes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A864BarPes), 4, 0));
         A213BarSit = T01SD12_A213BarSit[0] ;
         A120BarAgrEst = T01SD12_A120BarAgrEst[0] ;
         A407EmprNom = T01SD12_A407EmprNom[0] ;
         n407EmprNom = T01SD12_n407EmprNom[0] ;
         A228BarUniMed = T01SD12_A228BarUniMed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A228BarUniMed", A228BarUniMed);
         A192BarNumUni = T01SD12_A192BarNumUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A192BarNumUni", GXutil.ltrimstr( A192BarNumUni, 9, 2));
         A191BarNumPie = T01SD12_A191BarNumPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A191BarNumPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A191BarNumPie), 4, 0));
         A60AlbRUniUti = T01SD12_A60AlbRUniUti[0] ;
         A54AlbRPieUti = T01SD12_A54AlbRPieUti[0] ;
         A58AlbRUniEnt = T01SD12_A58AlbRUniEnt[0] ;
         A52AlbRPieEnt = T01SD12_A52AlbRPieEnt[0] ;
         A47AlbREst = T01SD12_A47AlbREst[0] ;
         A205BarPieMet = T01SD12_A205BarPieMet[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A205BarPieMet", GXutil.ltrimstr( A205BarPieMet, 9, 2));
         A201BarPieEst = T01SD12_A201BarPieEst[0] ;
         A170BarKilLan = T01SD12_A170BarKilLan[0] ;
         A183BarMetLan = T01SD12_A183BarMetLan[0] ;
         A197BarPConTro = T01SD12_A197BarPConTro[0] ;
         A908PieOriCod = T01SD12_A908PieOriCod[0] ;
         A1271BarPieLzd = T01SD12_A1271BarPieLzd[0] ;
         A1501BarPiePie = T01SD12_A1501BarPiePie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1501BarPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1501BarPiePie), 6, 0));
         A46AlbREnt = T01SD12_A46AlbREnt[0] ;
         A365DisDes = T01SD12_A365DisDes[0] ;
         A44AlbRecCod = T01SD12_A44AlbRecCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A252CliCod = T01SD12_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A361DisCod = T01SD12_A361DisCod[0] ;
         A898BarPieNDes = T01SD12_A898BarPieNDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A898BarPieNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A898BarPieNDes), 6, 0));
         A184BarMtr = T01SD12_A184BarMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
         A166BarKgm = T01SD12_A166BarKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
         A199BarPie1 = T01SD12_A199BarPie1[0] ;
         zm1SD18( -50) ;
      }
      pr_default.close(8);
      onLoadActions1SD18( ) ;
   }

   public void onLoadActions1SD18( )
   {
      AV28MtrAnt = O205BarPieMet ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28MtrAnt", GXutil.ltrimstr( AV28MtrAnt, 9, 2));
      AV29BarPieAnt = O1501BarPiePie ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29BarPieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29BarPieAnt), 6, 0));
      if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
      {
         A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
         httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
      }
      else
      {
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
         {
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
         else
         {
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
      }
      A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
      if ( ( GXutil.strcmp(A228BarUniMed, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && ( DecimalUtil.compareTo(A203BarPieKil, O203BarPieKil) == 0 ) && ( DecimalUtil.compareTo(A205BarPieMet, O205BarPieMet) != 0 ) && ( AV11Flag2 != 1 ) )
      {
         A203BarPieKil = A205BarPieMet.multiply(DecimalUtil.doubleToDec(A864BarPes)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
         httpContext.ajax_rsp_assign_attri("", false, "A203BarPieKil", GXutil.ltrimstr( A203BarPieKil, 9, 2));
      }
      AV27KilAnt = O203BarPieKil ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27KilAnt", GXutil.ltrimstr( AV27KilAnt, 9, 2));
   }

   public void checkExtendedTable1SD18( )
   {
      nIsDirty_18 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      if ( ( GXutil.strcmp(A120BarAgrEst, httpContext.getMessage( "S", "")) == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Hoja de Ruta Agrupada", ""), 0, "");
      }
      if ( ( A213BarSit > 8 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Hoja de Ruta cerrada", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( ( A213BarSit == 4 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Hoja de Ruta con receta", ""), 0, "");
      }
      if ( (GXutil.strcmp("", A200BarPieCod)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Código de pieza nulo", ""), 1, "");
         AnyError = (short)(1) ;
      }
      AV28MtrAnt = O205BarPieMet ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28MtrAnt", GXutil.ltrimstr( AV28MtrAnt, 9, 2));
      AV29BarPieAnt = O1501BarPiePie ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29BarPieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29BarPieAnt), 6, 0));
      /* Using cursor T01SD5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBREC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBRECCOD");
         AnyError = (short)(1) ;
      }
      A60AlbRUniUti = T01SD5_A60AlbRUniUti[0] ;
      A54AlbRPieUti = T01SD5_A54AlbRPieUti[0] ;
      A58AlbRUniEnt = T01SD5_A58AlbRUniEnt[0] ;
      A52AlbRPieEnt = T01SD5_A52AlbRPieEnt[0] ;
      A47AlbREst = T01SD5_A47AlbREst[0] ;
      A46AlbREnt = T01SD5_A46AlbREnt[0] ;
      A252CliCod = T01SD5_A252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      pr_default.close(3);
      if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
      {
         nIsDirty_18 = (short)(1) ;
         A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
         httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
      }
      else
      {
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
         {
            nIsDirty_18 = (short)(1) ;
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
         else
         {
            nIsDirty_18 = (short)(1) ;
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
      }
      nIsDirty_18 = (short)(1) ;
      A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
      if ( ( ( A54AlbRPieUti - O1501BarPiePie + A1501BarPiePie ) > A52AlbRPieEnt ) && ( AV15Vertex == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. Cantidad de piezas dispuestas superior a la disponible", ""), 1, "BARPIEPIE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarPiePie_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( ( A54AlbRPieUti - O1501BarPiePie + A1501BarPiePie ) > A52AlbRPieEnt ) && ( AV15Vertex == 1 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "AVISO. Quantidade de peças dispostas superior à disponível", ""), 0, "BARPIEPIE");
      }
      /* Using cursor T01SD7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01SD7_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(5);
      if ( ( GXutil.strcmp(A228BarUniMed, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && ( DecimalUtil.compareTo(A203BarPieKil, O203BarPieKil) == 0 ) && ( DecimalUtil.compareTo(A205BarPieMet, O205BarPieMet) != 0 ) && ( AV11Flag2 != 1 ) )
      {
         nIsDirty_18 = (short)(1) ;
         A203BarPieKil = A205BarPieMet.multiply(DecimalUtil.doubleToDec(A864BarPes)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
         httpContext.ajax_rsp_assign_attri("", false, "A203BarPieKil", GXutil.ltrimstr( A203BarPieKil, 9, 2));
      }
      if ( ( ( DecimalUtil.compareTo((A60AlbRUniUti.subtract(O205BarPieMet).add(A205BarPieMet)), A58AlbRUniEnt) > 0 ) ) && ( GXutil.strcmp(A228BarUniMed, httpContext.getMessage( "M", "")) == 0 ) && ( AV15Vertex == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. Cantidad de unidades dispuestas superior a la disponible", ""), 1, "BARPIEMET");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarPieMet_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( ( DecimalUtil.compareTo((A60AlbRUniUti.subtract(O203BarPieKil).add(A203BarPieKil)), A58AlbRUniEnt) > 0 ) ) && ( GXutil.strcmp(A228BarUniMed, httpContext.getMessage( "K", "")) == 0 ) && ( AV15Vertex == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. Cantidad de unidades dispuestas superior a la disponible", ""), 1, "BARPIEKIL");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarPieKil_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( ( DecimalUtil.compareTo((A60AlbRUniUti.subtract(O203BarPieKil).add(A203BarPieKil)), A58AlbRUniEnt) > 0 ) ) && ( GXutil.strcmp(A228BarUniMed, httpContext.getMessage( "K", "")) == 0 ) && ( AV15Vertex == 1 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Aviso. Quantidade de unidades dispostas superior à disponível", ""), 0, "BARPIEKIL");
      }
      if ( ( ( DecimalUtil.compareTo((A60AlbRUniUti.subtract(O203BarPieKil).add(A203BarPieKil)), A58AlbRUniEnt) > 0 ) ) && ( GXutil.strcmp(A228BarUniMed, httpContext.getMessage( "M", "")) == 0 ) && ( AV15Vertex == 1 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Aviso. Quantidade de unidades dispostas superior à disponível", ""), 0, "BARPIEKIL");
      }
      AV27KilAnt = O203BarPieKil ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27KilAnt", GXutil.ltrimstr( AV27KilAnt, 9, 2));
   }

   public void closeExtendedTableCursors1SD18( )
   {
      pr_default.close(3);
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_52( String A396EmprCod ,
                          int A44AlbRecCod )
   {
      /* Using cursor T01SD13 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBREC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBRECCOD");
         AnyError = (short)(1) ;
      }
      A60AlbRUniUti = T01SD13_A60AlbRUniUti[0] ;
      A54AlbRPieUti = T01SD13_A54AlbRPieUti[0] ;
      A58AlbRUniEnt = T01SD13_A58AlbRUniEnt[0] ;
      A52AlbRPieEnt = T01SD13_A52AlbRPieEnt[0] ;
      A47AlbREst = T01SD13_A47AlbREst[0] ;
      A46AlbREnt = T01SD13_A46AlbREnt[0] ;
      A252CliCod = T01SD13_A252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A46AlbREnt))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void gxload_54( String A396EmprCod ,
                          int A252CliCod )
   {
      /* Using cursor T01SD14 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01SD14_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void getKey1SD18( )
   {
      /* Using cursor T01SD15 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound18 = (short)(1) ;
      }
      else
      {
         RcdFound18 = (short)(0) ;
      }
      pr_default.close(11);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01SD3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
      if ( (pr_default.getStatus(1) != 101) && ( T01SD3_A129BarCod[0] == A129BarCod ) && ( T01SD3_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01SD3_A130BarCodPar[0], A130BarCodPar) == 0 ) )
      {
         zm1SD18( 50) ;
         RcdFound18 = (short)(1) ;
         A200BarPieCod = T01SD3_A200BarPieCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
         A203BarPieKil = T01SD3_A203BarPieKil[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A203BarPieKil", GXutil.ltrimstr( A203BarPieKil, 9, 2));
         A205BarPieMet = T01SD3_A205BarPieMet[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A205BarPieMet", GXutil.ltrimstr( A205BarPieMet, 9, 2));
         A201BarPieEst = T01SD3_A201BarPieEst[0] ;
         A170BarKilLan = T01SD3_A170BarKilLan[0] ;
         A183BarMetLan = T01SD3_A183BarMetLan[0] ;
         A197BarPConTro = T01SD3_A197BarPConTro[0] ;
         A908PieOriCod = T01SD3_A908PieOriCod[0] ;
         A1271BarPieLzd = T01SD3_A1271BarPieLzd[0] ;
         A1501BarPiePie = T01SD3_A1501BarPiePie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1501BarPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1501BarPiePie), 6, 0));
         A396EmprCod = T01SD3_A396EmprCod[0] ;
         A44AlbRecCod = T01SD3_A44AlbRecCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         O1501BarPiePie = A1501BarPiePie ;
         httpContext.ajax_rsp_assign_attri("", false, "A1501BarPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1501BarPiePie), 6, 0));
         O205BarPieMet = A205BarPieMet ;
         httpContext.ajax_rsp_assign_attri("", false, "A205BarPieMet", GXutil.ltrimstr( A205BarPieMet, 9, 2));
         O203BarPieKil = A203BarPieKil ;
         httpContext.ajax_rsp_assign_attri("", false, "A203BarPieKil", GXutil.ltrimstr( A203BarPieKil, 9, 2));
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z200BarPieCod = A200BarPieCod ;
         sMode18 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1SD18( ) ;
         if ( AnyError == 1 )
         {
            RcdFound18 = (short)(0) ;
            initializeNonKey1SD18( ) ;
         }
         Gx_mode = sMode18 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound18 = (short)(0) ;
         initializeNonKey1SD18( ) ;
         sMode18 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode18 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1SD18( ) ;
      if ( RcdFound18 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound18 = (short)(0) ;
      /* Using cursor T01SD16 */
      pr_default.execute(12, new Object[] {A396EmprCod, A396EmprCod, A200BarPieCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T01SD16_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01SD16_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01SD16_A200BarPieCod[0], A200BarPieCod) < 0 ) ) && ( T01SD16_A129BarCod[0] == A129BarCod ) && ( T01SD16_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01SD16_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T01SD16_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01SD16_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01SD16_A200BarPieCod[0], A200BarPieCod) > 0 ) ) && ( T01SD16_A129BarCod[0] == A129BarCod ) && ( T01SD16_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01SD16_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            A396EmprCod = T01SD16_A396EmprCod[0] ;
            A200BarPieCod = T01SD16_A200BarPieCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
            RcdFound18 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void move_previous( )
   {
      RcdFound18 = (short)(0) ;
      /* Using cursor T01SD17 */
      pr_default.execute(13, new Object[] {A396EmprCod, A396EmprCod, A200BarPieCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T01SD17_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01SD17_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01SD17_A200BarPieCod[0], A200BarPieCod) > 0 ) ) && ( T01SD17_A129BarCod[0] == A129BarCod ) && ( T01SD17_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01SD17_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T01SD17_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01SD17_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01SD17_A200BarPieCod[0], A200BarPieCod) < 0 ) ) && ( T01SD17_A129BarCod[0] == A129BarCod ) && ( T01SD17_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01SD17_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            A396EmprCod = T01SD17_A396EmprCod[0] ;
            A200BarPieCod = T01SD17_A200BarPieCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
            RcdFound18 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1SD18( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtBarPieKil_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1SD18( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound18 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A200BarPieCod, Z200BarPieCod) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A200BarPieCod = Z200BarPieCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "BARPIECOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarPieCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtBarPieKil_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1SD18( ) ;
               GX_FocusControl = edtBarPieKil_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A200BarPieCod, Z200BarPieCod) != 0 ) )
            {
               /* Insert record */
               GX_FocusControl = edtBarPieKil_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1SD18( ) ;
               if ( AnyError == 1 )
               {
                  GX_FocusControl = "" ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "BARPIECOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtBarPieCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtBarPieKil_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1SD18( ) ;
                  if ( AnyError == 1 )
                  {
                     GX_FocusControl = "" ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
      }
      afterTrn( ) ;
      if ( isUpd( ) || isDlt( ) )
      {
         if ( AnyError == 0 )
         {
            httpContext.nUserReturn = (byte)(1) ;
         }
      }
   }

   public void btn_delete( )
   {
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A200BarPieCod, Z200BarPieCod) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A200BarPieCod = Z200BarPieCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "BARPIECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarPieCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtBarPieKil_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1SD18( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01SD2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARPIE"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z203BarPieKil, T01SD2_A203BarPieKil[0]) != 0 ) || ( DecimalUtil.compareTo(Z205BarPieMet, T01SD2_A205BarPieMet[0]) != 0 ) || ( Z201BarPieEst != T01SD2_A201BarPieEst[0] ) || ( DecimalUtil.compareTo(Z170BarKilLan, T01SD2_A170BarKilLan[0]) != 0 ) || ( DecimalUtil.compareTo(Z183BarMetLan, T01SD2_A183BarMetLan[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z197BarPConTro != T01SD2_A197BarPConTro[0] ) || ( GXutil.strcmp(Z908PieOriCod, T01SD2_A908PieOriCod[0]) != 0 ) || ( Z1271BarPieLzd != T01SD2_A1271BarPieLzd[0] ) || ( Z1501BarPiePie != T01SD2_A1501BarPiePie[0] ) || ( Z44AlbRecCod != T01SD2_A44AlbRecCod[0] ) )
         {
            if ( DecimalUtil.compareTo(Z203BarPieKil, T01SD2_A203BarPieKil[0]) != 0 )
            {
               GXutil.writeLogln("pedidosclientesindetalle.hojaderuta_pieza:[seudo value changed for attri]"+"BarPieKil");
               GXutil.writeLogRaw("Old: ",Z203BarPieKil);
               GXutil.writeLogRaw("Current: ",T01SD2_A203BarPieKil[0]);
            }
            if ( DecimalUtil.compareTo(Z205BarPieMet, T01SD2_A205BarPieMet[0]) != 0 )
            {
               GXutil.writeLogln("pedidosclientesindetalle.hojaderuta_pieza:[seudo value changed for attri]"+"BarPieMet");
               GXutil.writeLogRaw("Old: ",Z205BarPieMet);
               GXutil.writeLogRaw("Current: ",T01SD2_A205BarPieMet[0]);
            }
            if ( Z201BarPieEst != T01SD2_A201BarPieEst[0] )
            {
               GXutil.writeLogln("pedidosclientesindetalle.hojaderuta_pieza:[seudo value changed for attri]"+"BarPieEst");
               GXutil.writeLogRaw("Old: ",Z201BarPieEst);
               GXutil.writeLogRaw("Current: ",T01SD2_A201BarPieEst[0]);
            }
            if ( DecimalUtil.compareTo(Z170BarKilLan, T01SD2_A170BarKilLan[0]) != 0 )
            {
               GXutil.writeLogln("pedidosclientesindetalle.hojaderuta_pieza:[seudo value changed for attri]"+"BarKilLan");
               GXutil.writeLogRaw("Old: ",Z170BarKilLan);
               GXutil.writeLogRaw("Current: ",T01SD2_A170BarKilLan[0]);
            }
            if ( DecimalUtil.compareTo(Z183BarMetLan, T01SD2_A183BarMetLan[0]) != 0 )
            {
               GXutil.writeLogln("pedidosclientesindetalle.hojaderuta_pieza:[seudo value changed for attri]"+"BarMetLan");
               GXutil.writeLogRaw("Old: ",Z183BarMetLan);
               GXutil.writeLogRaw("Current: ",T01SD2_A183BarMetLan[0]);
            }
            if ( Z197BarPConTro != T01SD2_A197BarPConTro[0] )
            {
               GXutil.writeLogln("pedidosclientesindetalle.hojaderuta_pieza:[seudo value changed for attri]"+"BarPConTro");
               GXutil.writeLogRaw("Old: ",Z197BarPConTro);
               GXutil.writeLogRaw("Current: ",T01SD2_A197BarPConTro[0]);
            }
            if ( GXutil.strcmp(Z908PieOriCod, T01SD2_A908PieOriCod[0]) != 0 )
            {
               GXutil.writeLogln("pedidosclientesindetalle.hojaderuta_pieza:[seudo value changed for attri]"+"PieOriCod");
               GXutil.writeLogRaw("Old: ",Z908PieOriCod);
               GXutil.writeLogRaw("Current: ",T01SD2_A908PieOriCod[0]);
            }
            if ( Z1271BarPieLzd != T01SD2_A1271BarPieLzd[0] )
            {
               GXutil.writeLogln("pedidosclientesindetalle.hojaderuta_pieza:[seudo value changed for attri]"+"BarPieLzd");
               GXutil.writeLogRaw("Old: ",Z1271BarPieLzd);
               GXutil.writeLogRaw("Current: ",T01SD2_A1271BarPieLzd[0]);
            }
            if ( Z1501BarPiePie != T01SD2_A1501BarPiePie[0] )
            {
               GXutil.writeLogln("pedidosclientesindetalle.hojaderuta_pieza:[seudo value changed for attri]"+"BarPiePie");
               GXutil.writeLogRaw("Old: ",Z1501BarPiePie);
               GXutil.writeLogRaw("Current: ",T01SD2_A1501BarPiePie[0]);
            }
            if ( Z44AlbRecCod != T01SD2_A44AlbRecCod[0] )
            {
               GXutil.writeLogln("pedidosclientesindetalle.hojaderuta_pieza:[seudo value changed for attri]"+"AlbRecCod");
               GXutil.writeLogRaw("Old: ",Z44AlbRecCod);
               GXutil.writeLogRaw("Current: ",T01SD2_A44AlbRecCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPBARPIE"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1SD18( )
   {
      beforeValidate1SD18( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1SD18( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1SD18( 0) ;
         checkOptimisticConcurrency1SD18( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1SD18( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1SD18( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01SD18 */
                  pr_default.execute(14, new Object[] {A200BarPieCod, A203BarPieKil, A205BarPieMet, Byte.valueOf(A201BarPieEst), A170BarKilLan, A183BarMetLan, Short.valueOf(A197BarPConTro), A908PieOriCod, Integer.valueOf(A1271BarPieLzd), Integer.valueOf(A1501BarPiePie), A396EmprCod, Integer.valueOf(A44AlbRecCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
                  if ( (pr_default.getStatus(14) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption1SD0( ) ;
                     }
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
         else
         {
            load1SD18( ) ;
         }
         endLevel1SD18( ) ;
      }
      closeExtendedTableCursors1SD18( ) ;
   }

   public void update1SD18( )
   {
      beforeValidate1SD18( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1SD18( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1SD18( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1SD18( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1SD18( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01SD19 */
                  pr_default.execute(15, new Object[] {A203BarPieKil, A205BarPieMet, Byte.valueOf(A201BarPieEst), A170BarKilLan, A183BarMetLan, Short.valueOf(A197BarPConTro), A908PieOriCod, Integer.valueOf(A1271BarPieLzd), Integer.valueOf(A1501BarPiePie), Integer.valueOf(A44AlbRecCod), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
                  if ( (pr_default.getStatus(15) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARPIE"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1SD18( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     if ( ( true /* After */ || true /* After */ ) && true /* Level */ && ( GXutil.strcmp(A120BarAgrEst, httpContext.getMessage( "S", "")) == 0 ) )
                     {
                        GXv_char12[0] = A396EmprCod ;
                        GXv_int10[0] = A129BarCod ;
                        GXv_int6[0] = A132BarCodReo ;
                        GXv_char4[0] = A130BarCodPar ;
                        new app.pactagr(remoteHandle, context).execute( GXv_char12, GXv_int10, GXv_int6, GXv_char4) ;
                        hojaderuta_pieza_impl.this.A396EmprCod = GXv_char12[0] ;
                        hojaderuta_pieza_impl.this.A129BarCod = GXv_int10[0] ;
                        hojaderuta_pieza_impl.this.A132BarCodReo = GXv_int6[0] ;
                        hojaderuta_pieza_impl.this.A130BarCodPar = GXv_char4[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
                     }
                     if ( true /* After */ )
                     {
                        GXv_char12[0] = A396EmprCod ;
                        GXv_int10[0] = A361DisCod ;
                        GXv_int7[0] = A44AlbRecCod ;
                        GXv_char4[0] = A200BarPieCod ;
                        GXv_decimal9[0] = A203BarPieKil ;
                        GXv_decimal8[0] = AV27KilAnt ;
                        GXv_decimal13[0] = A205BarPieMet ;
                        GXv_decimal14[0] = AV28MtrAnt ;
                        GXv_int15[0] = A1501BarPiePie ;
                        GXv_int16[0] = AV29BarPieAnt ;
                        GXv_char3[0] = httpContext.getMessage( "N", "") ;
                        new app.pmodpdi2(remoteHandle, context).execute( GXv_char12, GXv_int10, GXv_int7, GXv_char4, GXv_decimal9, GXv_decimal8, GXv_decimal13, GXv_decimal14, GXv_int15, GXv_int16, GXv_char3) ;
                        hojaderuta_pieza_impl.this.A396EmprCod = GXv_char12[0] ;
                        hojaderuta_pieza_impl.this.A361DisCod = GXv_int10[0] ;
                        hojaderuta_pieza_impl.this.A44AlbRecCod = GXv_int7[0] ;
                        hojaderuta_pieza_impl.this.A200BarPieCod = GXv_char4[0] ;
                        hojaderuta_pieza_impl.this.A203BarPieKil = GXv_decimal9[0] ;
                        hojaderuta_pieza_impl.this.AV27KilAnt = GXv_decimal8[0] ;
                        hojaderuta_pieza_impl.this.A205BarPieMet = GXv_decimal13[0] ;
                        hojaderuta_pieza_impl.this.AV28MtrAnt = GXv_decimal14[0] ;
                        hojaderuta_pieza_impl.this.A1501BarPiePie = GXv_int15[0] ;
                        hojaderuta_pieza_impl.this.AV29BarPieAnt = GXv_int16[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A203BarPieKil", GXutil.ltrimstr( A203BarPieKil, 9, 2));
                        httpContext.ajax_rsp_assign_attri("", false, "AV27KilAnt", GXutil.ltrimstr( AV27KilAnt, 9, 2));
                        httpContext.ajax_rsp_assign_attri("", false, "A205BarPieMet", GXutil.ltrimstr( A205BarPieMet, 9, 2));
                        httpContext.ajax_rsp_assign_attri("", false, "AV28MtrAnt", GXutil.ltrimstr( AV28MtrAnt, 9, 2));
                        httpContext.ajax_rsp_assign_attri("", false, "A1501BarPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1501BarPiePie), 6, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "AV29BarPieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29BarPieAnt), 6, 0));
                     }
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        if ( isUpd( ) || isDlt( ) )
                        {
                           if ( AnyError == 0 )
                           {
                              httpContext.nUserReturn = (byte)(1) ;
                           }
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         endLevel1SD18( ) ;
      }
      closeExtendedTableCursors1SD18( ) ;
   }

   public void deferredUpdate1SD18( )
   {
   }

   public void delete( )
   {
      beforeValidate1SD18( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1SD18( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1SD18( ) ;
         afterConfirm1SD18( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1SD18( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01SD20 */
               pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  if ( ( true /* After */ || true /* After */ ) && true /* Level */ && ( GXutil.strcmp(A120BarAgrEst, httpContext.getMessage( "S", "")) == 0 ) )
                  {
                     GXv_char12[0] = A396EmprCod ;
                     GXv_int16[0] = A129BarCod ;
                     GXv_int6[0] = A132BarCodReo ;
                     GXv_char4[0] = A130BarCodPar ;
                     new app.pactagr(remoteHandle, context).execute( GXv_char12, GXv_int16, GXv_int6, GXv_char4) ;
                     hojaderuta_pieza_impl.this.A396EmprCod = GXv_char12[0] ;
                     hojaderuta_pieza_impl.this.A129BarCod = GXv_int16[0] ;
                     hojaderuta_pieza_impl.this.A132BarCodReo = GXv_int6[0] ;
                     hojaderuta_pieza_impl.this.A130BarCodPar = GXv_char4[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                     httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
                     httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
                     httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
                  }
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     if ( isUpd( ) || isDlt( ) )
                     {
                        if ( AnyError == 0 )
                        {
                           httpContext.nUserReturn = (byte)(1) ;
                        }
                     }
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
      }
      sMode18 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1SD18( ) ;
      Gx_mode = sMode18 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1SD18( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV27KilAnt = O203BarPieKil ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27KilAnt", GXutil.ltrimstr( AV27KilAnt, 9, 2));
         AV28MtrAnt = O205BarPieMet ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28MtrAnt", GXutil.ltrimstr( AV28MtrAnt, 9, 2));
         AV29BarPieAnt = O1501BarPiePie ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29BarPieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29BarPieAnt), 6, 0));
         /* Using cursor T01SD21 */
         pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         A60AlbRUniUti = T01SD21_A60AlbRUniUti[0] ;
         A54AlbRPieUti = T01SD21_A54AlbRPieUti[0] ;
         A58AlbRUniEnt = T01SD21_A58AlbRUniEnt[0] ;
         A52AlbRPieEnt = T01SD21_A52AlbRPieEnt[0] ;
         A47AlbREst = T01SD21_A47AlbREst[0] ;
         A46AlbREnt = T01SD21_A46AlbREnt[0] ;
         A252CliCod = T01SD21_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         pr_default.close(17);
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
         {
            A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
         else
         {
            if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
            }
            else
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
            }
         }
         A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
         httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
         /* Using cursor T01SD22 */
         pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01SD22_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(18);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01SD23 */
         pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Defectos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T01SD24 */
         pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARTRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T01SD25 */
         pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
      }
   }

   public void endLevel1SD18( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1SD18( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "pedidosclientesindetalle.hojaderuta_pieza");
         if ( AnyError == 0 )
         {
            confirmValues1SD0( ) ;
         }
         /* After transaction rules */
         if ( true /* After */ && ( GXutil.strcmp(A228BarUniMed, httpContext.getMessage( "M", "")) == 0 ) && ( AV14PesoML == 0 ) )
         {
            GXv_char12[0] = A396EmprCod ;
            GXv_int16[0] = A129BarCod ;
            GXv_int6[0] = A132BarCodReo ;
            GXv_char4[0] = A130BarCodPar ;
            new app.pmodpes(remoteHandle, context).execute( GXv_char12, GXv_int16, GXv_int6, GXv_char4) ;
            hojaderuta_pieza_impl.this.A396EmprCod = GXv_char12[0] ;
            hojaderuta_pieza_impl.this.A129BarCod = GXv_int16[0] ;
            hojaderuta_pieza_impl.this.A132BarCodReo = GXv_int6[0] ;
            hojaderuta_pieza_impl.this.A130BarCodPar = GXv_char4[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         }
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "pedidosclientesindetalle.hojaderuta_pieza");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1SD18( )
   {
      /* Scan By routine */
      /* Using cursor T01SD26 */
      pr_default.execute(22, new Object[] {Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      RcdFound18 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound18 = (short)(1) ;
         A396EmprCod = T01SD26_A396EmprCod[0] ;
         A200BarPieCod = T01SD26_A200BarPieCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1SD18( )
   {
      /* Scan next routine */
      pr_default.readNext(22);
      RcdFound18 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound18 = (short)(1) ;
         A396EmprCod = T01SD26_A396EmprCod[0] ;
         A200BarPieCod = T01SD26_A200BarPieCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
      }
   }

   public void scanEnd1SD18( )
   {
      pr_default.close(22);
   }

   public void afterConfirm1SD18( )
   {
      /* After Confirm Rules */
      if ( isDlt( )  && true /* After */ && true /* Level */ )
      {
         GXv_char12[0] = A396EmprCod ;
         GXv_int16[0] = A361DisCod ;
         GXv_int15[0] = A44AlbRecCod ;
         GXv_char4[0] = A200BarPieCod ;
         GXv_char3[0] = httpContext.getMessage( "N", "") ;
         GXv_decimal14[0] = A203BarPieKil ;
         GXv_decimal13[0] = A205BarPieMet ;
         GXv_int10[0] = A1501BarPiePie ;
         new app.pdelpdi2(remoteHandle, context).execute( GXv_char12, GXv_int16, GXv_int15, GXv_char4, GXv_char3, GXv_decimal14, GXv_decimal13, GXv_int10) ;
         hojaderuta_pieza_impl.this.A396EmprCod = GXv_char12[0] ;
         hojaderuta_pieza_impl.this.A361DisCod = GXv_int16[0] ;
         hojaderuta_pieza_impl.this.A44AlbRecCod = GXv_int15[0] ;
         hojaderuta_pieza_impl.this.A200BarPieCod = GXv_char4[0] ;
         hojaderuta_pieza_impl.this.A203BarPieKil = GXv_decimal14[0] ;
         hojaderuta_pieza_impl.this.A205BarPieMet = GXv_decimal13[0] ;
         hojaderuta_pieza_impl.this.A1501BarPiePie = GXv_int10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
         httpContext.ajax_rsp_assign_attri("", false, "A203BarPieKil", GXutil.ltrimstr( A203BarPieKil, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A205BarPieMet", GXutil.ltrimstr( A205BarPieMet, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A1501BarPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1501BarPiePie), 6, 0));
      }
   }

   public void beforeInsert1SD18( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1SD18( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1SD18( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1SD18( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1SD18( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1SD18( )
   {
      edtBarNHdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNHdr_Enabled), 5, 0), true);
      edtPedidoClie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedidoClie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedidoClie_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtBarSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Enabled), 5, 0), true);
      edtBarSerDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSerDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSerDsc_Enabled), 5, 0), true);
      edtBarColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNom_Enabled), 5, 0), true);
      edtBarColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNum_Enabled), 5, 0), true);
      edtBarTipCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTipCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipCol_Enabled), 5, 0), true);
      edtBarKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarKgm_Enabled), 5, 0), true);
      edtBarMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMtr_Enabled), 5, 0), true);
      edtBarPieNDes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieNDes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieNDes_Enabled), 5, 0), true);
      edtBarUniMed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarUniMed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarUniMed_Enabled), 5, 0), true);
      edtAlbRecCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), true);
      edtBarPieKil_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieKil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieKil_Enabled), 5, 0), true);
      edtBarPieMet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieMet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieMet_Enabled), 5, 0), true);
      edtBarPiePie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPiePie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPiePie_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtBarPieCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieCod_Enabled), 5, 0), true);
      edtBarNumUni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNumUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNumUni_Enabled), 5, 0), true);
      edtBarNumPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNumPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNumPie_Enabled), 5, 0), true);
      edtBarPes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPes_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1SD18( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1SD0( )
   {
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
      MasterPageObj.master_styles();
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
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"false\"" ;
      httpContext.writeText( "<body ") ;
      bodyStyle = "" + "background-color:" + WebUtils.getHTMLColor( Form.getIBackground()) + ";color:" + WebUtils.getHTMLColor( Form.getTextcolor()) + ";" ;
      bodyStyle += "-moz-opacity:0;opacity:0;" ;
      if ( ! ( (GXutil.strcmp("", Form.getBackground())==0) ) )
      {
         bodyStyle += " background-image:url(" + httpContext.convertURL( Form.getBackground()) + ")" ;
      }
      httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.pedidosclientesindetalle.hojaderuta_pieza", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV18BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV19BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV20BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV21BarPieCod))}, new String[] {"Gx_mode","EmprCod","BarCod","BarCodReo","BarCodPar","BarPieCod"}) +"\">") ;
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
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"HojadeRuta_Pieza");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV30Pgmname, "")));
      forbiddenHiddens.add("BarPieEst", localUtil.format( DecimalUtil.doubleToDec(A201BarPieEst), "9"));
      forbiddenHiddens.add("BarKilLan", localUtil.format( A170BarKilLan, "ZZZZZ9.99"));
      forbiddenHiddens.add("BarMetLan", localUtil.format( A183BarMetLan, "ZZZZZ9.99"));
      forbiddenHiddens.add("BarPConTro", localUtil.format( DecimalUtil.doubleToDec(A197BarPConTro), "ZZ9"));
      forbiddenHiddens.add("PieOriCod", GXutil.rtrim( localUtil.format( A908PieOriCod, "")));
      forbiddenHiddens.add("BarPieLzd", localUtil.format( DecimalUtil.doubleToDec(A1271BarPieLzd), "ZZZ9"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("pedidosclientesindetalle\\hojaderuta_pieza:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z200BarPieCod", GXutil.rtrim( Z200BarPieCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z203BarPieKil", GXutil.ltrim( localUtil.ntoc( Z203BarPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z205BarPieMet", GXutil.ltrim( localUtil.ntoc( Z205BarPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z201BarPieEst", GXutil.ltrim( localUtil.ntoc( Z201BarPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z170BarKilLan", GXutil.ltrim( localUtil.ntoc( Z170BarKilLan, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z183BarMetLan", GXutil.ltrim( localUtil.ntoc( Z183BarMetLan, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z197BarPConTro", GXutil.ltrim( localUtil.ntoc( Z197BarPConTro, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z908PieOriCod", GXutil.rtrim( Z908PieOriCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1271BarPieLzd", GXutil.ltrim( localUtil.ntoc( Z1271BarPieLzd, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1501BarPiePie", GXutil.ltrim( localUtil.ntoc( Z1501BarPiePie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z44AlbRecCod", GXutil.ltrim( localUtil.ntoc( Z44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O1501BarPiePie", GXutil.ltrim( localUtil.ntoc( O1501BarPiePie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O205BarPieMet", GXutil.ltrim( localUtil.ntoc( O205BarPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O203BarPieKil", GXutil.ltrim( localUtil.ntoc( O203BarPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "N205BarPieMet", GXutil.ltrim( localUtil.ntoc( A205BarPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "BARENCCLI", GXutil.rtrim( A4812BarEncCli));
      app.GxWebStd.gx_hidden_field( httpContext, "BARDISNUM", GXutil.rtrim( A143BarDisNum));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODPAR", GXutil.rtrim( A130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "DISDES", GXutil.rtrim( A365DisDes));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIE1", GXutil.ltrim( localUtil.ntoc( A199BarPie1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIE", GXutil.ltrim( localUtil.ntoc( A198BarPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRUNIENT", GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRUNIUTI", GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRUNIDIS", GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRPIEENT", GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRPIEUTI", GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRPIEDIS", GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV7EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV18BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV18BarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV19BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV19BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV20BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20BarCodPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPIECOD", GXutil.rtrim( AV21BarPieCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPIECOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV21BarPieCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_ALBRECCOD", GXutil.ltrim( localUtil.ntoc( AV25Insert_AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAG2", GXutil.ltrim( localUtil.ntoc( AV11Flag2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vKILANT", GXutil.ltrim( localUtil.ntoc( AV27KilAnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMTRANT", GXutil.ltrim( localUtil.ntoc( AV28MtrAnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPIEANT", GXutil.ltrim( localUtil.ntoc( AV29BarPieAnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARSIT", GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPESOML", GXutil.ltrim( localUtil.ntoc( AV14PesoML, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVERTEX", GXutil.ltrim( localUtil.ntoc( AV15Vertex, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISCOD", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAGREST", GXutil.rtrim( A120BarAgrEst));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIEEST", GXutil.ltrim( localUtil.ntoc( A201BarPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARKILLAN", GXutil.ltrim( localUtil.ntoc( A170BarKilLan, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARMETLAN", GXutil.ltrim( localUtil.ntoc( A183BarMetLan, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPCONTRO", GXutil.ltrim( localUtil.ntoc( A197BarPConTro, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PIEORICOD", GXutil.rtrim( A908PieOriCod));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIELZD", GXutil.ltrim( localUtil.ntoc( A1271BarPieLzd, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBREST", GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRENT", GXutil.rtrim( A46AlbREnt));
      app.GxWebStd.gx_hidden_field( httpContext, "BARMAT", GXutil.rtrim( A182BarMat));
      app.GxWebStd.gx_hidden_field( httpContext, "DISUNIMED", GXutil.rtrim( A392DisUniMed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Objectcall", GXutil.rtrim( Dvpanel_tableattributes_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Enabled", GXutil.booltostr( Dvpanel_tableattributes_Enabled));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Objectcall", GXutil.rtrim( Dvpanel_unnamedtable1_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Enabled", GXutil.booltostr( Dvpanel_unnamedtable1_Enabled));
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

   public byte executeStartEvent( )
   {
      standaloneStartup( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      return gxajaxcallmode ;
   }

   public void renderHtmlContent( )
   {
      httpContext.writeText( "<div") ;
      app.GxWebStd.classAttribute( httpContext, "gx-ct-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
      httpContext.writeText( ">") ;
      draw( ) ;
      httpContext.writeText( "</div>") ;
   }

   public void dispatchEvents( )
   {
      process( ) ;
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
      return formatLink("app.pedidosclientesindetalle.hojaderuta_pieza", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV18BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV19BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV20BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV21BarPieCod))}, new String[] {"Gx_mode","EmprCod","BarCod","BarCodReo","BarCodPar","BarPieCod"})  ;
   }

   public String getPgmname( )
   {
      return "PedidosClienteSinDetalle.HojadeRuta_Pieza" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Modificacion", "") ;
   }

   public void initializeNonKey1SD18( )
   {
      A44AlbRecCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      A203BarPieKil = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A203BarPieKil", GXutil.ltrimstr( A203BarPieKil, 9, 2));
      AV27KilAnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27KilAnt", GXutil.ltrimstr( AV27KilAnt, 9, 2));
      AV28MtrAnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28MtrAnt", GXutil.ltrimstr( AV28MtrAnt, 9, 2));
      AV29BarPieAnt = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29BarPieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29BarPieAnt), 6, 0));
      A51AlbRPieDis = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
      A57AlbRUniDis = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
      A252CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A60AlbRUniUti = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      A54AlbRPieUti = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
      A52AlbRPieEnt = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
      A47AlbREst = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      A205BarPieMet = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A205BarPieMet", GXutil.ltrimstr( A205BarPieMet, 9, 2));
      A201BarPieEst = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A201BarPieEst", GXutil.str( A201BarPieEst, 1, 0));
      A170BarKilLan = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A170BarKilLan", GXutil.ltrimstr( A170BarKilLan, 9, 2));
      A183BarMetLan = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A183BarMetLan", GXutil.ltrimstr( A183BarMetLan, 9, 2));
      A197BarPConTro = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A197BarPConTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A197BarPConTro), 3, 0));
      A908PieOriCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A908PieOriCod", A908PieOriCod);
      A1271BarPieLzd = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1271BarPieLzd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1271BarPieLzd), 6, 0));
      A1501BarPiePie = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1501BarPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1501BarPiePie), 6, 0));
      A46AlbREnt = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A46AlbREnt", A46AlbREnt);
      O1501BarPiePie = A1501BarPiePie ;
      httpContext.ajax_rsp_assign_attri("", false, "A1501BarPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1501BarPiePie), 6, 0));
      O205BarPieMet = A205BarPieMet ;
      httpContext.ajax_rsp_assign_attri("", false, "A205BarPieMet", GXutil.ltrimstr( A205BarPieMet, 9, 2));
      O203BarPieKil = A203BarPieKil ;
      httpContext.ajax_rsp_assign_attri("", false, "A203BarPieKil", GXutil.ltrimstr( A203BarPieKil, 9, 2));
      Z203BarPieKil = DecimalUtil.ZERO ;
      Z205BarPieMet = DecimalUtil.ZERO ;
      Z201BarPieEst = (byte)(0) ;
      Z170BarKilLan = DecimalUtil.ZERO ;
      Z183BarMetLan = DecimalUtil.ZERO ;
      Z197BarPConTro = (short)(0) ;
      Z908PieOriCod = "" ;
      Z1271BarPieLzd = 0 ;
      Z1501BarPiePie = 0 ;
      Z44AlbRecCod = 0 ;
   }

   public void initAll1SD18( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A200BarPieCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
      initializeNonKey1SD18( ) ;
   }

   public void standaloneModalInsert( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241512353", true, true);
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
      httpContext.AddJavascriptSource("pedidosclientesindetalle/hojaderuta_pieza.js", "?20268241512354", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtBarNHdr_Internalname = "BARNHDR" ;
      edtPedidoClie_Internalname = "PEDIDOCLIE" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      edtCliNom_Internalname = "CLINOM" ;
      edtBarSer_Internalname = "BARSER" ;
      edtBarSerDsc_Internalname = "BARSERDSC" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      edtBarColNom_Internalname = "BARCOLNOM" ;
      edtBarColNum_Internalname = "BARCOLNUM" ;
      edtBarTipCol_Internalname = "BARTIPCOL" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      edtBarKgm_Internalname = "BARKGM" ;
      edtBarMtr_Internalname = "BARMTR" ;
      edtBarPieNDes_Internalname = "BARPIENDES" ;
      edtBarUniMed_Internalname = "BARUNIMED" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      edtAlbRecCod_Internalname = "ALBRECCOD" ;
      edtBarPieKil_Internalname = "BARPIEKIL" ;
      edtBarPieMet_Internalname = "BARPIEMET" ;
      edtBarPiePie_Internalname = "BARPIEPIE" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtBarPieCod_Internalname = "BARPIECOD" ;
      edtBarNumUni_Internalname = "BARNUMUNI" ;
      edtBarNumPie_Internalname = "BARNUMPIE" ;
      edtBarPes_Internalname = "BARPES" ;
      edtCliCod_Internalname = "CLICOD" ;
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
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Modificacion", "") );
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 0 ;
      edtCliCod_Visible = 1 ;
      edtBarPes_Jsonclick = "" ;
      edtBarPes_Enabled = 0 ;
      edtBarPes_Visible = 1 ;
      edtBarNumPie_Jsonclick = "" ;
      edtBarNumPie_Enabled = 0 ;
      edtBarNumPie_Visible = 1 ;
      edtBarNumUni_Jsonclick = "" ;
      edtBarNumUni_Enabled = 0 ;
      edtBarNumUni_Visible = 1 ;
      edtBarPieCod_Jsonclick = "" ;
      edtBarPieCod_Enabled = 0 ;
      edtBarPieCod_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtBarPiePie_Jsonclick = "" ;
      edtBarPiePie_Enabled = 1 ;
      edtBarPieMet_Jsonclick = "" ;
      edtBarPieMet_Enabled = 1 ;
      edtBarPieKil_Jsonclick = "" ;
      edtBarPieKil_Enabled = 1 ;
      edtAlbRecCod_Jsonclick = "" ;
      edtAlbRecCod_Enabled = 0 ;
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
      edtBarUniMed_Jsonclick = "" ;
      edtBarUniMed_Enabled = 0 ;
      edtBarPieNDes_Jsonclick = "" ;
      edtBarPieNDes_Enabled = 0 ;
      edtBarMtr_Jsonclick = "" ;
      edtBarMtr_Enabled = 0 ;
      edtBarKgm_Jsonclick = "" ;
      edtBarKgm_Enabled = 0 ;
      edtBarTipCol_Jsonclick = "" ;
      edtBarTipCol_Enabled = 0 ;
      edtBarColNum_Jsonclick = "" ;
      edtBarColNum_Enabled = 0 ;
      edtBarColNom_Jsonclick = "" ;
      edtBarColNom_Enabled = 0 ;
      divUnnamedtable5_Visible = 1 ;
      edtBarSerDsc_Jsonclick = "" ;
      edtBarSerDsc_Enabled = 0 ;
      edtBarSer_Jsonclick = "" ;
      edtBarSer_Enabled = 0 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Enabled = 0 ;
      edtPedidoClie_Jsonclick = "" ;
      edtPedidoClie_Enabled = 0 ;
      edtBarNHdr_Jsonclick = "" ;
      edtBarNHdr_Enabled = 0 ;
      Dvpanel_tableattributes_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Iconposition = "Right" ;
      Dvpanel_tableattributes_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_tableattributes_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_tableattributes_Title = httpContext.getMessage( "WWP_TemplateDataPanelTitle", "") ;
      Dvpanel_tableattributes_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tableattributes_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tableattributes_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Width = "100%" ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gx3asapedidoclie1SD18( String A396EmprCod ,
                                      String A4812BarEncCli ,
                                      String A143BarDisNum )
   {
      GXt_char1 = A13878PedidoClie ;
      GXv_char12[0] = A396EmprCod ;
      GXv_char4[0] = A4812BarEncCli ;
      GXv_char3[0] = A143BarDisNum ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char12, GXv_char4, GXv_char3, GXv_char2) ;
      hojaderuta_pieza_impl.this.A396EmprCod = GXv_char12[0] ;
      hojaderuta_pieza_impl.this.A4812BarEncCli = GXv_char4[0] ;
      hojaderuta_pieza_impl.this.A143BarDisNum = GXv_char3[0] ;
      hojaderuta_pieza_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A4812BarEncCli", A4812BarEncCli);
      httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
      A13878PedidoClie = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A13878PedidoClie", A13878PedidoClie);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13878PedidoClie))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_39_1SD18( String A396EmprCod ,
                            int A129BarCod ,
                            byte A132BarCodReo ,
                            String A130BarCodPar ,
                            String A228BarUniMed ,
                            short AV14PesoML )
   {
      if ( true /* After */ && ( GXutil.strcmp(A228BarUniMed, httpContext.getMessage( "M", "")) == 0 ) && ( AV14PesoML == 0 ) )
      {
         GXv_char12[0] = A396EmprCod ;
         GXv_int16[0] = A129BarCod ;
         GXv_int6[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         new app.pmodpes(remoteHandle, context).execute( GXv_char12, GXv_int16, GXv_int6, GXv_char4) ;
         A396EmprCod = GXv_char12[0] ;
         A129BarCod = GXv_int16[0] ;
         A132BarCodReo = GXv_int6[0] ;
         A130BarCodPar = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A130BarCodPar))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_47_1SD18( )
   {
      if ( true /* After */ )
      {
         GXv_char12[0] = A396EmprCod ;
         GXv_int16[0] = A361DisCod ;
         GXv_int15[0] = A44AlbRecCod ;
         GXv_char4[0] = A200BarPieCod ;
         GXv_decimal14[0] = A203BarPieKil ;
         GXv_decimal13[0] = AV27KilAnt ;
         GXv_decimal9[0] = A205BarPieMet ;
         GXv_decimal8[0] = AV28MtrAnt ;
         GXv_int10[0] = A1501BarPiePie ;
         GXv_int7[0] = AV29BarPieAnt ;
         GXv_char3[0] = httpContext.getMessage( "N", "") ;
         new app.pmodpdi2(remoteHandle, context).execute( GXv_char12, GXv_int16, GXv_int15, GXv_char4, GXv_decimal14, GXv_decimal13, GXv_decimal9, GXv_decimal8, GXv_int10, GXv_int7, GXv_char3) ;
         A396EmprCod = GXv_char12[0] ;
         A361DisCod = GXv_int16[0] ;
         A44AlbRecCod = GXv_int15[0] ;
         A200BarPieCod = GXv_char4[0] ;
         A203BarPieKil = GXv_decimal14[0] ;
         AV27KilAnt = GXv_decimal13[0] ;
         A205BarPieMet = GXv_decimal9[0] ;
         AV28MtrAnt = GXv_decimal8[0] ;
         A1501BarPiePie = GXv_int10[0] ;
         AV29BarPieAnt = GXv_int7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
         httpContext.ajax_rsp_assign_attri("", false, "A203BarPieKil", GXutil.ltrimstr( A203BarPieKil, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV27KilAnt", GXutil.ltrimstr( AV27KilAnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A205BarPieMet", GXutil.ltrimstr( A205BarPieMet, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV28MtrAnt", GXutil.ltrimstr( AV28MtrAnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A1501BarPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1501BarPiePie), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV29BarPieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29BarPieAnt), 6, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_48_1SD18( )
   {
      if ( isDlt( )  && true /* After */ && true /* Level */ )
      {
         GXv_char12[0] = A396EmprCod ;
         GXv_int16[0] = A361DisCod ;
         GXv_int15[0] = A44AlbRecCod ;
         GXv_char4[0] = A200BarPieCod ;
         GXv_char3[0] = httpContext.getMessage( "N", "") ;
         GXv_decimal14[0] = A203BarPieKil ;
         GXv_decimal13[0] = A205BarPieMet ;
         GXv_int10[0] = A1501BarPiePie ;
         new app.pdelpdi2(remoteHandle, context).execute( GXv_char12, GXv_int16, GXv_int15, GXv_char4, GXv_char3, GXv_decimal14, GXv_decimal13, GXv_int10) ;
         A396EmprCod = GXv_char12[0] ;
         A361DisCod = GXv_int16[0] ;
         A44AlbRecCod = GXv_int15[0] ;
         A200BarPieCod = GXv_char4[0] ;
         A203BarPieKil = GXv_decimal14[0] ;
         A205BarPieMet = GXv_decimal13[0] ;
         A1501BarPiePie = GXv_int10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
         httpContext.ajax_rsp_assign_attri("", false, "A203BarPieKil", GXutil.ltrimstr( A203BarPieKil, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A205BarPieMet", GXutil.ltrimstr( A205BarPieMet, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A1501BarPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1501BarPiePie), 6, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_49_1SD18( String A396EmprCod ,
                            int A129BarCod ,
                            byte A132BarCodReo ,
                            String A130BarCodPar ,
                            java.math.BigDecimal A203BarPieKil ,
                            String A120BarAgrEst )
   {
      if ( ( true /* After */ || true /* After */ ) && true /* Level */ && ( GXutil.strcmp(A120BarAgrEst, httpContext.getMessage( "S", "")) == 0 ) )
      {
         GXv_char12[0] = A396EmprCod ;
         GXv_int16[0] = A129BarCod ;
         GXv_int6[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         new app.pactagr(remoteHandle, context).execute( GXv_char12, GXv_int16, GXv_int6, GXv_char4) ;
         A396EmprCod = GXv_char12[0] ;
         A129BarCod = GXv_int16[0] ;
         A132BarCodReo = GXv_int6[0] ;
         A130BarCodPar = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A130BarCodPar))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void init_web_controls( )
   {
      /* End function init_web_controls */
   }

   public boolean isIns( )
   {
      return ((GXutil.strcmp(Gx_mode, "INS")==0) ? true : false) ;
   }

   public boolean isDlt( )
   {
      return ((GXutil.strcmp(Gx_mode, "DLT")==0) ? true : false) ;
   }

   public boolean isUpd( )
   {
      return ((GXutil.strcmp(Gx_mode, "UPD")==0) ? true : false) ;
   }

   public boolean isDsp( )
   {
      return ((GXutil.strcmp(Gx_mode, "DSP")==0) ? true : false) ;
   }

   public void valid_Albreccod( )
   {
      /* Using cursor T01SD21 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBREC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBRECCOD");
         AnyError = (short)(1) ;
      }
      A60AlbRUniUti = T01SD21_A60AlbRUniUti[0] ;
      A54AlbRPieUti = T01SD21_A54AlbRPieUti[0] ;
      A58AlbRUniEnt = T01SD21_A58AlbRUniEnt[0] ;
      A52AlbRPieEnt = T01SD21_A52AlbRPieEnt[0] ;
      A47AlbREst = T01SD21_A47AlbREst[0] ;
      A46AlbREnt = T01SD21_A46AlbREnt[0] ;
      A252CliCod = T01SD21_A252CliCod[0] ;
      pr_default.close(17);
      if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
      {
         A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
      }
      else
      {
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
         {
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
         }
         else
         {
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
         }
      }
      A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
      /* Using cursor T01SD22 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01SD22_A279CliNom[0] ;
      pr_default.close(18);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A46AlbREnt", GXutil.rtrim( A46AlbREnt));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
   }

   public void valid_Barpiemet( )
   {
      if ( ( GXutil.strcmp(A228BarUniMed, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && ( DecimalUtil.compareTo(A203BarPieKil, O203BarPieKil) == 0 ) && ( DecimalUtil.compareTo(A205BarPieMet, O205BarPieMet) != 0 ) && ( AV11Flag2 != 1 ) )
      {
         A203BarPieKil = A205BarPieMet.multiply(DecimalUtil.doubleToDec(A864BarPes)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
      }
      AV27KilAnt = O203BarPieKil ;
      if ( ( ( DecimalUtil.compareTo((A60AlbRUniUti.subtract(O203BarPieKil).add(A203BarPieKil)), A58AlbRUniEnt) > 0 ) ) && ( GXutil.strcmp(A228BarUniMed, httpContext.getMessage( "K", "")) == 0 ) && ( AV15Vertex == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. Cantidad de unidades dispuestas superior a la disponible", ""), 1, "BARPIEMET");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarPieMet_Internalname ;
      }
      if ( ( ( DecimalUtil.compareTo((A60AlbRUniUti.subtract(O203BarPieKil).add(A203BarPieKil)), A58AlbRUniEnt) > 0 ) ) && ( GXutil.strcmp(A228BarUniMed, httpContext.getMessage( "K", "")) == 0 ) && ( AV15Vertex == 1 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Aviso. Quantidade de unidades dispostas superior à disponível", ""), 0, "BARPIEKIL");
      }
      if ( ( ( DecimalUtil.compareTo((A60AlbRUniUti.subtract(O203BarPieKil).add(A203BarPieKil)), A58AlbRUniEnt) > 0 ) ) && ( GXutil.strcmp(A228BarUniMed, httpContext.getMessage( "M", "")) == 0 ) && ( AV15Vertex == 1 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Aviso. Quantidade de unidades dispostas superior à disponível", ""), 0, "BARPIEKIL");
      }
      AV28MtrAnt = O205BarPieMet ;
      if ( ( ( DecimalUtil.compareTo((A60AlbRUniUti.subtract(O205BarPieMet).add(A205BarPieMet)), A58AlbRUniEnt) > 0 ) ) && ( GXutil.strcmp(A228BarUniMed, httpContext.getMessage( "M", "")) == 0 ) && ( AV15Vertex == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. Cantidad de unidades dispuestas superior a la disponible", ""), 1, "BARPIEMET");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarPieMet_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A203BarPieKil", GXutil.ltrim( localUtil.ntoc( A203BarPieKil, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV27KilAnt", GXutil.ltrim( localUtil.ntoc( AV27KilAnt, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV28MtrAnt", GXutil.ltrim( localUtil.ntoc( AV28MtrAnt, (byte)(9), (byte)(2), ".", "")));
   }

   public void valid_Barpiepie( )
   {
      AV29BarPieAnt = O1501BarPiePie ;
      if ( ( ( A54AlbRPieUti - O1501BarPiePie + A1501BarPiePie ) > A52AlbRPieEnt ) && ( AV15Vertex == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. Cantidad de piezas dispuestas superior a la disponible", ""), 1, "BARPIEPIE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarPiePie_Internalname ;
      }
      if ( ( ( A54AlbRPieUti - O1501BarPiePie + A1501BarPiePie ) > A52AlbRPieEnt ) && ( AV15Vertex == 1 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "AVISO. Quantidade de peças dispostas superior à disponível", ""), 0, "BARPIEPIE");
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV29BarPieAnt", GXutil.ltrim( localUtil.ntoc( AV29BarPieAnt, (byte)(6), (byte)(0), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV18BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV19BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV20BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV21BarPieCod',fld:'vBARPIECOD',pic:'',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV18BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV19BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV20BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV21BarPieCod',fld:'vBARPIECOD',pic:'',hsh:true},{av:'AV30Pgmname',fld:'vPGMNAME',pic:''},{av:'A201BarPieEst',fld:'BARPIEEST',pic:'9'},{av:'A170BarKilLan',fld:'BARKILLAN',pic:'ZZZZZ9.99'},{av:'A183BarMetLan',fld:'BARMETLAN',pic:'ZZZZZ9.99'},{av:'A197BarPConTro',fld:'BARPCONTRO',pic:'ZZ9'},{av:'A908PieOriCod',fld:'PIEORICOD',pic:''},{av:'A1271BarPieLzd',fld:'BARPIELZD',pic:'ZZZ9'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121SD2',iparms:[]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_BARPIENDES","{handler:'valid_Barpiendes',iparms:[]");
      setEventMetadata("VALID_BARPIENDES",",oparms:[]}");
      setEventMetadata("VALID_BARUNIMED","{handler:'valid_Barunimed',iparms:[]");
      setEventMetadata("VALID_BARUNIMED",",oparms:[]}");
      setEventMetadata("VALID_ALBRECCOD","{handler:'valid_Albreccod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A58AlbRUniEnt',fld:'ALBRUNIENT',pic:'ZZZZZ9.99'},{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'A52AlbRPieEnt',fld:'ALBRPIEENT',pic:'ZZZZZ9'},{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A47AlbREst',fld:'ALBREST',pic:'9'},{av:'A46AlbREnt',fld:'ALBRENT',pic:''},{av:'A57AlbRUniDis',fld:'ALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'A51AlbRPieDis',fld:'ALBRPIEDIS',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''}]");
      setEventMetadata("VALID_ALBRECCOD",",oparms:[{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'},{av:'A58AlbRUniEnt',fld:'ALBRUNIENT',pic:'ZZZZZ9.99'},{av:'A52AlbRPieEnt',fld:'ALBRPIEENT',pic:'ZZZZZ9'},{av:'A47AlbREst',fld:'ALBREST',pic:'9'},{av:'A46AlbREnt',fld:'ALBRENT',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A57AlbRUniDis',fld:'ALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'A51AlbRPieDis',fld:'ALBRPIEDIS',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''}]}");
      setEventMetadata("VALID_BARPIEKIL","{handler:'valid_Barpiekil',iparms:[]");
      setEventMetadata("VALID_BARPIEKIL",",oparms:[]}");
      setEventMetadata("VALID_BARPIEMET","{handler:'valid_Barpiemet',iparms:[{av:'O205BarPieMet'},{av:'O203BarPieKil'},{av:'A205BarPieMet',fld:'BARPIEMET',pic:'ZZZZZ9.99'},{av:'A864BarPes',fld:'BARPES',pic:'ZZZ9'},{av:'A228BarUniMed',fld:'BARUNIMED',pic:'@!'},{av:'A203BarPieKil',fld:'BARPIEKIL',pic:'ZZZZZ9.99'},{av:'AV11Flag2',fld:'vFLAG2',pic:'ZZZ9'},{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'A58AlbRUniEnt',fld:'ALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV15Vertex',fld:'vVERTEX',pic:'ZZZ9'},{av:'AV27KilAnt',fld:'vKILANT',pic:'ZZZZZ9.99'},{av:'AV28MtrAnt',fld:'vMTRANT',pic:'ZZZZZ9.99'}]");
      setEventMetadata("VALID_BARPIEMET",",oparms:[{av:'A203BarPieKil',fld:'BARPIEKIL',pic:'ZZZZZ9.99'},{av:'AV27KilAnt',fld:'vKILANT',pic:'ZZZZZ9.99'},{av:'AV28MtrAnt',fld:'vMTRANT',pic:'ZZZZZ9.99'}]}");
      setEventMetadata("VALID_BARPIEPIE","{handler:'valid_Barpiepie',iparms:[{av:'O1501BarPiePie'},{av:'A1501BarPiePie',fld:'BARPIEPIE',pic:'ZZZZZ9'},{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'},{av:'A52AlbRPieEnt',fld:'ALBRPIEENT',pic:'ZZZZZ9'},{av:'AV15Vertex',fld:'vVERTEX',pic:'ZZZ9'},{av:'AV29BarPieAnt',fld:'vBARPIEANT',pic:'ZZZZZ9'}]");
      setEventMetadata("VALID_BARPIEPIE",",oparms:[{av:'AV29BarPieAnt',fld:'vBARPIEANT',pic:'ZZZZZ9'}]}");
      setEventMetadata("VALID_BARPIECOD","{handler:'valid_Barpiecod',iparms:[]");
      setEventMetadata("VALID_BARPIECOD",",oparms:[]}");
      setEventMetadata("VALID_BARPES","{handler:'valid_Barpes',iparms:[]");
      setEventMetadata("VALID_BARPES",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
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
      pr_default.close(17);
      pr_default.close(18);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV7EmprCod = "" ;
      wcpOAV20BarCodPar = "" ;
      wcpOAV21BarPieCod = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z200BarPieCod = "" ;
      Z203BarPieKil = DecimalUtil.ZERO ;
      Z205BarPieMet = DecimalUtil.ZERO ;
      Z170BarKilLan = DecimalUtil.ZERO ;
      Z183BarMetLan = DecimalUtil.ZERO ;
      Z908PieOriCod = "" ;
      O205BarPieMet = DecimalUtil.ZERO ;
      O203BarPieKil = DecimalUtil.ZERO ;
      N205BarPieMet = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A228BarUniMed = "" ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A120BarAgrEst = "" ;
      A4812BarEncCli = "" ;
      A143BarDisNum = "" ;
      Gx_mode = "" ;
      AV7EmprCod = "" ;
      AV20BarCodPar = "" ;
      AV21BarPieCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      A13696BarNHdr = "" ;
      A13878PedidoClie = "" ;
      A279CliNom = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A205BarPieMet = DecimalUtil.ZERO ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      AV30Pgmname = "" ;
      A200BarPieCod = "" ;
      A192BarNumUni = DecimalUtil.ZERO ;
      A170BarKilLan = DecimalUtil.ZERO ;
      A183BarMetLan = DecimalUtil.ZERO ;
      A908PieOriCod = "" ;
      A365DisDes = "" ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      AV27KilAnt = DecimalUtil.ZERO ;
      AV28MtrAnt = DecimalUtil.ZERO ;
      A407EmprNom = "" ;
      A46AlbREnt = "" ;
      A182BarMat = "" ;
      A392DisUniMed = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Dvpanel_unnamedtable1_Objectcall = "" ;
      Dvpanel_unnamedtable1_Class = "" ;
      Dvpanel_unnamedtable1_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode18 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV8Station = "" ;
      AV9EmprNom = "" ;
      AV10UsurCod = "" ;
      AV17BarMtrOld = DecimalUtil.ZERO ;
      AV22WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext11 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV23TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV24WebSession = httpContext.getWebSession();
      AV26TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      Z407EmprNom = "" ;
      Z60AlbRUniUti = DecimalUtil.ZERO ;
      Z58AlbRUniEnt = DecimalUtil.ZERO ;
      Z46AlbREnt = "" ;
      Z279CliNom = "" ;
      Z4812BarEncCli = "" ;
      Z143BarDisNum = "" ;
      Z212BarSer = "" ;
      Z1652BarSerDsc = "" ;
      Z182BarMat = "" ;
      Z135BarColNom = "" ;
      Z120BarAgrEst = "" ;
      Z228BarUniMed = "" ;
      Z192BarNumUni = DecimalUtil.ZERO ;
      Z392DisUniMed = "" ;
      Z365DisDes = "" ;
      Z184BarMtr = DecimalUtil.ZERO ;
      Z166BarKgm = DecimalUtil.ZERO ;
      T01SD4_A407EmprNom = new String[] {""} ;
      T01SD4_n407EmprNom = new boolean[] {false} ;
      T01SD6_A4812BarEncCli = new String[] {""} ;
      T01SD6_A143BarDisNum = new String[] {""} ;
      T01SD6_A212BarSer = new String[] {""} ;
      T01SD6_A1652BarSerDsc = new String[] {""} ;
      T01SD6_A182BarMat = new String[] {""} ;
      T01SD6_A135BarColNom = new String[] {""} ;
      T01SD6_A136BarColNum = new int[1] ;
      T01SD6_A218BarTipCol = new byte[1] ;
      T01SD6_A864BarPes = new short[1] ;
      T01SD6_A213BarSit = new byte[1] ;
      T01SD6_A120BarAgrEst = new String[] {""} ;
      T01SD6_A228BarUniMed = new String[] {""} ;
      T01SD6_A192BarNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SD6_A191BarNumPie = new short[1] ;
      T01SD6_A361DisCod = new int[1] ;
      T01SD8_A392DisUniMed = new String[] {""} ;
      T01SD8_A365DisDes = new String[] {""} ;
      T01SD10_A898BarPieNDes = new int[1] ;
      T01SD10_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SD10_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SD10_A199BarPie1 = new short[1] ;
      T01SD5_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SD5_A54AlbRPieUti = new int[1] ;
      T01SD5_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SD5_A52AlbRPieEnt = new int[1] ;
      T01SD5_A47AlbREst = new byte[1] ;
      T01SD5_A46AlbREnt = new String[] {""} ;
      T01SD5_A252CliCod = new int[1] ;
      T01SD7_A279CliNom = new String[] {""} ;
      T01SD12_A200BarPieCod = new String[] {""} ;
      T01SD12_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SD12_A4812BarEncCli = new String[] {""} ;
      T01SD12_A143BarDisNum = new String[] {""} ;
      T01SD12_A279CliNom = new String[] {""} ;
      T01SD12_A212BarSer = new String[] {""} ;
      T01SD12_A1652BarSerDsc = new String[] {""} ;
      T01SD12_A182BarMat = new String[] {""} ;
      T01SD12_A135BarColNom = new String[] {""} ;
      T01SD12_A136BarColNum = new int[1] ;
      T01SD12_A218BarTipCol = new byte[1] ;
      T01SD12_A392DisUniMed = new String[] {""} ;
      T01SD12_A864BarPes = new short[1] ;
      T01SD12_A213BarSit = new byte[1] ;
      T01SD12_A120BarAgrEst = new String[] {""} ;
      T01SD12_A407EmprNom = new String[] {""} ;
      T01SD12_n407EmprNom = new boolean[] {false} ;
      T01SD12_A228BarUniMed = new String[] {""} ;
      T01SD12_A192BarNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SD12_A191BarNumPie = new short[1] ;
      T01SD12_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SD12_A54AlbRPieUti = new int[1] ;
      T01SD12_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SD12_A52AlbRPieEnt = new int[1] ;
      T01SD12_A47AlbREst = new byte[1] ;
      T01SD12_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SD12_A201BarPieEst = new byte[1] ;
      T01SD12_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SD12_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SD12_A197BarPConTro = new short[1] ;
      T01SD12_A908PieOriCod = new String[] {""} ;
      T01SD12_A1271BarPieLzd = new int[1] ;
      T01SD12_A1501BarPiePie = new int[1] ;
      T01SD12_A46AlbREnt = new String[] {""} ;
      T01SD12_A365DisDes = new String[] {""} ;
      T01SD12_A396EmprCod = new String[] {""} ;
      T01SD12_A44AlbRecCod = new int[1] ;
      T01SD12_A129BarCod = new int[1] ;
      T01SD12_A132BarCodReo = new byte[1] ;
      T01SD12_A130BarCodPar = new String[] {""} ;
      T01SD12_A252CliCod = new int[1] ;
      T01SD12_A361DisCod = new int[1] ;
      T01SD12_A898BarPieNDes = new int[1] ;
      T01SD12_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SD12_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SD12_A199BarPie1 = new short[1] ;
      T01SD13_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SD13_A54AlbRPieUti = new int[1] ;
      T01SD13_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SD13_A52AlbRPieEnt = new int[1] ;
      T01SD13_A47AlbREst = new byte[1] ;
      T01SD13_A46AlbREnt = new String[] {""} ;
      T01SD13_A252CliCod = new int[1] ;
      T01SD14_A279CliNom = new String[] {""} ;
      T01SD15_A396EmprCod = new String[] {""} ;
      T01SD15_A129BarCod = new int[1] ;
      T01SD15_A132BarCodReo = new byte[1] ;
      T01SD15_A130BarCodPar = new String[] {""} ;
      T01SD15_A200BarPieCod = new String[] {""} ;
      T01SD3_A200BarPieCod = new String[] {""} ;
      T01SD3_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SD3_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SD3_A201BarPieEst = new byte[1] ;
      T01SD3_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SD3_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SD3_A197BarPConTro = new short[1] ;
      T01SD3_A908PieOriCod = new String[] {""} ;
      T01SD3_A1271BarPieLzd = new int[1] ;
      T01SD3_A1501BarPiePie = new int[1] ;
      T01SD3_A396EmprCod = new String[] {""} ;
      T01SD3_A44AlbRecCod = new int[1] ;
      T01SD3_A129BarCod = new int[1] ;
      T01SD3_A132BarCodReo = new byte[1] ;
      T01SD3_A130BarCodPar = new String[] {""} ;
      T01SD16_A396EmprCod = new String[] {""} ;
      T01SD16_A129BarCod = new int[1] ;
      T01SD16_A132BarCodReo = new byte[1] ;
      T01SD16_A130BarCodPar = new String[] {""} ;
      T01SD16_A200BarPieCod = new String[] {""} ;
      T01SD17_A396EmprCod = new String[] {""} ;
      T01SD17_A129BarCod = new int[1] ;
      T01SD17_A132BarCodReo = new byte[1] ;
      T01SD17_A130BarCodPar = new String[] {""} ;
      T01SD17_A200BarPieCod = new String[] {""} ;
      T01SD2_A200BarPieCod = new String[] {""} ;
      T01SD2_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SD2_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SD2_A201BarPieEst = new byte[1] ;
      T01SD2_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SD2_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SD2_A197BarPConTro = new short[1] ;
      T01SD2_A908PieOriCod = new String[] {""} ;
      T01SD2_A1271BarPieLzd = new int[1] ;
      T01SD2_A1501BarPiePie = new int[1] ;
      T01SD2_A396EmprCod = new String[] {""} ;
      T01SD2_A44AlbRecCod = new int[1] ;
      T01SD2_A129BarCod = new int[1] ;
      T01SD2_A132BarCodReo = new byte[1] ;
      T01SD2_A130BarCodPar = new String[] {""} ;
      T01SD21_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SD21_A54AlbRPieUti = new int[1] ;
      T01SD21_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SD21_A52AlbRPieEnt = new int[1] ;
      T01SD21_A47AlbREst = new byte[1] ;
      T01SD21_A46AlbREnt = new String[] {""} ;
      T01SD21_A252CliCod = new int[1] ;
      T01SD22_A279CliNom = new String[] {""} ;
      T01SD23_A396EmprCod = new String[] {""} ;
      T01SD23_A129BarCod = new int[1] ;
      T01SD23_A132BarCodReo = new byte[1] ;
      T01SD23_A130BarCodPar = new String[] {""} ;
      T01SD23_A200BarPieCod = new String[] {""} ;
      T01SD23_A12913BarPieLDf = new short[1] ;
      T01SD24_A396EmprCod = new String[] {""} ;
      T01SD24_A129BarCod = new int[1] ;
      T01SD24_A132BarCodReo = new byte[1] ;
      T01SD24_A130BarCodPar = new String[] {""} ;
      T01SD24_A200BarPieCod = new String[] {""} ;
      T01SD24_A3858BarTroCod = new short[1] ;
      T01SD25_A396EmprCod = new String[] {""} ;
      T01SD25_A30AlbProCod = new long[1] ;
      T01SD25_A129BarCod = new int[1] ;
      T01SD25_A132BarCodReo = new byte[1] ;
      T01SD25_A130BarCodPar = new String[] {""} ;
      T01SD25_A200BarPieCod = new String[] {""} ;
      T01SD26_A396EmprCod = new String[] {""} ;
      T01SD26_A129BarCod = new int[1] ;
      T01SD26_A132BarCodReo = new byte[1] ;
      T01SD26_A130BarCodPar = new String[] {""} ;
      T01SD26_A200BarPieCod = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_int7 = new int[1] ;
      GXv_int15 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      GXv_int10 = new int[1] ;
      GXv_char12 = new String[1] ;
      GXv_int16 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char4 = new String[1] ;
      Z57AlbRUniDis = DecimalUtil.ZERO ;
      ZV27KilAnt = DecimalUtil.ZERO ;
      ZV28MtrAnt = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.pedidosclientesindetalle.hojaderuta_pieza__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.pedidosclientesindetalle.hojaderuta_pieza__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.pedidosclientesindetalle.hojaderuta_pieza__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.pedidosclientesindetalle.hojaderuta_pieza__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidosclientesindetalle.hojaderuta_pieza__default(),
         new Object[] {
             new Object[] {
            T01SD2_A200BarPieCod, T01SD2_A203BarPieKil, T01SD2_A205BarPieMet, T01SD2_A201BarPieEst, T01SD2_A170BarKilLan, T01SD2_A183BarMetLan, T01SD2_A197BarPConTro, T01SD2_A908PieOriCod, T01SD2_A1271BarPieLzd, T01SD2_A1501BarPiePie,
            T01SD2_A396EmprCod, T01SD2_A44AlbRecCod, T01SD2_A129BarCod, T01SD2_A132BarCodReo, T01SD2_A130BarCodPar
            }
            , new Object[] {
            T01SD3_A200BarPieCod, T01SD3_A203BarPieKil, T01SD3_A205BarPieMet, T01SD3_A201BarPieEst, T01SD3_A170BarKilLan, T01SD3_A183BarMetLan, T01SD3_A197BarPConTro, T01SD3_A908PieOriCod, T01SD3_A1271BarPieLzd, T01SD3_A1501BarPiePie,
            T01SD3_A396EmprCod, T01SD3_A44AlbRecCod, T01SD3_A129BarCod, T01SD3_A132BarCodReo, T01SD3_A130BarCodPar
            }
            , new Object[] {
            T01SD4_A407EmprNom, T01SD4_n407EmprNom
            }
            , new Object[] {
            T01SD5_A60AlbRUniUti, T01SD5_A54AlbRPieUti, T01SD5_A58AlbRUniEnt, T01SD5_A52AlbRPieEnt, T01SD5_A47AlbREst, T01SD5_A46AlbREnt, T01SD5_A252CliCod
            }
            , new Object[] {
            T01SD6_A4812BarEncCli, T01SD6_A143BarDisNum, T01SD6_A212BarSer, T01SD6_A1652BarSerDsc, T01SD6_A182BarMat, T01SD6_A135BarColNom, T01SD6_A136BarColNum, T01SD6_A218BarTipCol, T01SD6_A864BarPes, T01SD6_A213BarSit,
            T01SD6_A120BarAgrEst, T01SD6_A228BarUniMed, T01SD6_A192BarNumUni, T01SD6_A191BarNumPie, T01SD6_A361DisCod
            }
            , new Object[] {
            T01SD7_A279CliNom
            }
            , new Object[] {
            T01SD8_A392DisUniMed, T01SD8_A365DisDes
            }
            , new Object[] {
            T01SD10_A898BarPieNDes, T01SD10_A184BarMtr, T01SD10_A166BarKgm, T01SD10_A199BarPie1
            }
            , new Object[] {
            T01SD12_A200BarPieCod, T01SD12_A203BarPieKil, T01SD12_A4812BarEncCli, T01SD12_A143BarDisNum, T01SD12_A279CliNom, T01SD12_A212BarSer, T01SD12_A1652BarSerDsc, T01SD12_A182BarMat, T01SD12_A135BarColNom, T01SD12_A136BarColNum,
            T01SD12_A218BarTipCol, T01SD12_A392DisUniMed, T01SD12_A864BarPes, T01SD12_A213BarSit, T01SD12_A120BarAgrEst, T01SD12_A407EmprNom, T01SD12_n407EmprNom, T01SD12_A228BarUniMed, T01SD12_A192BarNumUni, T01SD12_A191BarNumPie,
            T01SD12_A60AlbRUniUti, T01SD12_A54AlbRPieUti, T01SD12_A58AlbRUniEnt, T01SD12_A52AlbRPieEnt, T01SD12_A47AlbREst, T01SD12_A205BarPieMet, T01SD12_A201BarPieEst, T01SD12_A170BarKilLan, T01SD12_A183BarMetLan, T01SD12_A197BarPConTro,
            T01SD12_A908PieOriCod, T01SD12_A1271BarPieLzd, T01SD12_A1501BarPiePie, T01SD12_A46AlbREnt, T01SD12_A365DisDes, T01SD12_A396EmprCod, T01SD12_A44AlbRecCod, T01SD12_A129BarCod, T01SD12_A132BarCodReo, T01SD12_A130BarCodPar,
            T01SD12_A252CliCod, T01SD12_A361DisCod, T01SD12_A898BarPieNDes, T01SD12_A184BarMtr, T01SD12_A166BarKgm, T01SD12_A199BarPie1
            }
            , new Object[] {
            T01SD13_A60AlbRUniUti, T01SD13_A54AlbRPieUti, T01SD13_A58AlbRUniEnt, T01SD13_A52AlbRPieEnt, T01SD13_A47AlbREst, T01SD13_A46AlbREnt, T01SD13_A252CliCod
            }
            , new Object[] {
            T01SD14_A279CliNom
            }
            , new Object[] {
            T01SD15_A396EmprCod, T01SD15_A129BarCod, T01SD15_A132BarCodReo, T01SD15_A130BarCodPar, T01SD15_A200BarPieCod
            }
            , new Object[] {
            T01SD16_A396EmprCod, T01SD16_A129BarCod, T01SD16_A132BarCodReo, T01SD16_A130BarCodPar, T01SD16_A200BarPieCod
            }
            , new Object[] {
            T01SD17_A396EmprCod, T01SD17_A129BarCod, T01SD17_A132BarCodReo, T01SD17_A130BarCodPar, T01SD17_A200BarPieCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01SD21_A60AlbRUniUti, T01SD21_A54AlbRPieUti, T01SD21_A58AlbRUniEnt, T01SD21_A52AlbRPieEnt, T01SD21_A47AlbREst, T01SD21_A46AlbREnt, T01SD21_A252CliCod
            }
            , new Object[] {
            T01SD22_A279CliNom
            }
            , new Object[] {
            T01SD23_A396EmprCod, T01SD23_A129BarCod, T01SD23_A132BarCodReo, T01SD23_A130BarCodPar, T01SD23_A200BarPieCod, T01SD23_A12913BarPieLDf
            }
            , new Object[] {
            T01SD24_A396EmprCod, T01SD24_A129BarCod, T01SD24_A132BarCodReo, T01SD24_A130BarCodPar, T01SD24_A200BarPieCod, T01SD24_A3858BarTroCod
            }
            , new Object[] {
            T01SD25_A396EmprCod, T01SD25_A30AlbProCod, T01SD25_A129BarCod, T01SD25_A132BarCodReo, T01SD25_A130BarCodPar, T01SD25_A200BarPieCod
            }
            , new Object[] {
            T01SD26_A396EmprCod, T01SD26_A129BarCod, T01SD26_A132BarCodReo, T01SD26_A130BarCodPar, T01SD26_A200BarPieCod
            }
         }
      );
      Z130BarCodPar = "" ;
      A130BarCodPar = "" ;
      Z132BarCodReo = (byte)(0) ;
      A132BarCodReo = (byte)(0) ;
      Z129BarCod = 0 ;
      A129BarCod = 0 ;
      AV30Pgmname = "PedidosClienteSinDetalle.HojadeRuta_Pieza" ;
   }

   private byte wcpOAV19BarCodReo ;
   private byte Z132BarCodReo ;
   private byte Z201BarPieEst ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte AV19BarCodReo ;
   private byte nKeyPressed ;
   private byte A218BarTipCol ;
   private byte A201BarPieEst ;
   private byte A213BarSit ;
   private byte A47AlbREst ;
   private byte GXt_int5 ;
   private byte Z47AlbREst ;
   private byte Z218BarTipCol ;
   private byte Z213BarSit ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte GXv_int6[] ;
   private short Z197BarPConTro ;
   private short AV14PesoML ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A191BarNumPie ;
   private short A864BarPes ;
   private short A197BarPConTro ;
   private short A199BarPie1 ;
   private short AV11Flag2 ;
   private short AV15Vertex ;
   private short RcdFound18 ;
   private short AV12Flag1 ;
   private short AV16Velta ;
   private short Z864BarPes ;
   private short Z191BarNumPie ;
   private short Z199BarPie1 ;
   private short nIsDirty_18 ;
   private int wcpOAV18BarCod ;
   private int Z129BarCod ;
   private int Z1271BarPieLzd ;
   private int Z1501BarPiePie ;
   private int Z44AlbRecCod ;
   private int O1501BarPiePie ;
   private int A129BarCod ;
   private int A44AlbRecCod ;
   private int A252CliCod ;
   private int AV18BarCod ;
   private int trnEnded ;
   private int edtBarNHdr_Enabled ;
   private int edtPedidoClie_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtBarSer_Enabled ;
   private int edtBarSerDsc_Enabled ;
   private int divUnnamedtable5_Visible ;
   private int edtBarColNom_Enabled ;
   private int A136BarColNum ;
   private int edtBarColNum_Enabled ;
   private int edtBarTipCol_Enabled ;
   private int edtBarKgm_Enabled ;
   private int edtBarMtr_Enabled ;
   private int A898BarPieNDes ;
   private int edtBarPieNDes_Enabled ;
   private int edtBarUniMed_Enabled ;
   private int edtAlbRecCod_Enabled ;
   private int edtBarPieKil_Enabled ;
   private int edtBarPieMet_Enabled ;
   private int A1501BarPiePie ;
   private int edtBarPiePie_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int edtavPgmname_Enabled ;
   private int edtBarPieCod_Visible ;
   private int edtBarPieCod_Enabled ;
   private int edtBarNumUni_Enabled ;
   private int edtBarNumUni_Visible ;
   private int edtBarNumPie_Enabled ;
   private int edtBarNumPie_Visible ;
   private int edtBarPes_Enabled ;
   private int edtBarPes_Visible ;
   private int edtCliCod_Enabled ;
   private int edtCliCod_Visible ;
   private int A1271BarPieLzd ;
   private int A198BarPie ;
   private int A52AlbRPieEnt ;
   private int A54AlbRPieUti ;
   private int A51AlbRPieDis ;
   private int AV25Insert_AlbRecCod ;
   private int AV29BarPieAnt ;
   private int A361DisCod ;
   private int Dvpanel_tableattributes_Gxcontroltype ;
   private int Dvpanel_unnamedtable1_Gxcontroltype ;
   private int AV31GXV1 ;
   private int GX_JID ;
   private int Z54AlbRPieUti ;
   private int Z52AlbRPieEnt ;
   private int Z252CliCod ;
   private int Z136BarColNum ;
   private int Z361DisCod ;
   private int Z898BarPieNDes ;
   private int idxLst ;
   private int GXv_int7[] ;
   private int GXv_int15[] ;
   private int GXv_int10[] ;
   private int GXv_int16[] ;
   private int Z51AlbRPieDis ;
   private int ZV29BarPieAnt ;
   private java.math.BigDecimal Z203BarPieKil ;
   private java.math.BigDecimal Z205BarPieMet ;
   private java.math.BigDecimal Z170BarKilLan ;
   private java.math.BigDecimal Z183BarMetLan ;
   private java.math.BigDecimal O205BarPieMet ;
   private java.math.BigDecimal O203BarPieKil ;
   private java.math.BigDecimal N205BarPieMet ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A205BarPieMet ;
   private java.math.BigDecimal A192BarNumUni ;
   private java.math.BigDecimal A170BarKilLan ;
   private java.math.BigDecimal A183BarMetLan ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private java.math.BigDecimal AV27KilAnt ;
   private java.math.BigDecimal AV28MtrAnt ;
   private java.math.BigDecimal AV17BarMtrOld ;
   private java.math.BigDecimal Z60AlbRUniUti ;
   private java.math.BigDecimal Z58AlbRUniEnt ;
   private java.math.BigDecimal Z192BarNumUni ;
   private java.math.BigDecimal Z184BarMtr ;
   private java.math.BigDecimal Z166BarKgm ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private java.math.BigDecimal Z57AlbRUniDis ;
   private java.math.BigDecimal ZV27KilAnt ;
   private java.math.BigDecimal ZV28MtrAnt ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV7EmprCod ;
   private String wcpOAV20BarCodPar ;
   private String wcpOAV21BarPieCod ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z200BarPieCod ;
   private String Z908PieOriCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A228BarUniMed ;
   private String A120BarAgrEst ;
   private String A4812BarEncCli ;
   private String A143BarDisNum ;
   private String Gx_mode ;
   private String AV7EmprCod ;
   private String AV20BarCodPar ;
   private String AV21BarPieCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtBarPieKil_Internalname ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_tableattributes_Width ;
   private String Dvpanel_tableattributes_Cls ;
   private String Dvpanel_tableattributes_Title ;
   private String Dvpanel_tableattributes_Iconposition ;
   private String Dvpanel_tableattributes_Internalname ;
   private String divTableattributes_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String edtBarNHdr_Internalname ;
   private String A13696BarNHdr ;
   private String edtBarNHdr_Jsonclick ;
   private String edtPedidoClie_Internalname ;
   private String A13878PedidoClie ;
   private String edtPedidoClie_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String edtBarSer_Internalname ;
   private String A212BarSer ;
   private String edtBarSer_Jsonclick ;
   private String edtBarSerDsc_Internalname ;
   private String A1652BarSerDsc ;
   private String edtBarSerDsc_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
   private String edtBarColNom_Internalname ;
   private String A135BarColNom ;
   private String edtBarColNom_Jsonclick ;
   private String edtBarColNum_Internalname ;
   private String edtBarColNum_Jsonclick ;
   private String edtBarTipCol_Internalname ;
   private String edtBarTipCol_Jsonclick ;
   private String divUnnamedtable6_Internalname ;
   private String edtBarKgm_Internalname ;
   private String edtBarKgm_Jsonclick ;
   private String edtBarMtr_Internalname ;
   private String edtBarMtr_Jsonclick ;
   private String edtBarPieNDes_Internalname ;
   private String edtBarPieNDes_Jsonclick ;
   private String edtBarUniMed_Internalname ;
   private String edtBarUniMed_Jsonclick ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String edtAlbRecCod_Internalname ;
   private String edtAlbRecCod_Jsonclick ;
   private String TempTags ;
   private String edtBarPieKil_Jsonclick ;
   private String edtBarPieMet_Internalname ;
   private String edtBarPieMet_Jsonclick ;
   private String edtBarPiePie_Internalname ;
   private String edtBarPiePie_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV30Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtBarPieCod_Internalname ;
   private String A200BarPieCod ;
   private String edtBarPieCod_Jsonclick ;
   private String edtBarNumUni_Internalname ;
   private String edtBarNumUni_Jsonclick ;
   private String edtBarNumPie_Internalname ;
   private String edtBarNumPie_Jsonclick ;
   private String edtBarPes_Internalname ;
   private String edtBarPes_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String A908PieOriCod ;
   private String A365DisDes ;
   private String A407EmprNom ;
   private String A46AlbREnt ;
   private String A182BarMat ;
   private String A392DisUniMed ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Dvpanel_unnamedtable1_Objectcall ;
   private String Dvpanel_unnamedtable1_Class ;
   private String Dvpanel_unnamedtable1_Height ;
   private String hsh ;
   private String sMode18 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV8Station ;
   private String AV9EmprNom ;
   private String AV10UsurCod ;
   private String Z407EmprNom ;
   private String Z46AlbREnt ;
   private String Z279CliNom ;
   private String Z4812BarEncCli ;
   private String Z143BarDisNum ;
   private String Z212BarSer ;
   private String Z1652BarSerDsc ;
   private String Z182BarMat ;
   private String Z135BarColNom ;
   private String Z120BarAgrEst ;
   private String Z228BarUniMed ;
   private String Z392DisUniMed ;
   private String Z365DisDes ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String GXv_char12[] ;
   private String GXv_char4[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean n407EmprNom ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Dvpanel_unnamedtable1_Enabled ;
   private boolean Dvpanel_unnamedtable1_Showheader ;
   private boolean Dvpanel_unnamedtable1_Visible ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.WebSession AV24WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T01SD4_A407EmprNom ;
   private boolean[] T01SD4_n407EmprNom ;
   private String[] T01SD6_A4812BarEncCli ;
   private String[] T01SD6_A143BarDisNum ;
   private String[] T01SD6_A212BarSer ;
   private String[] T01SD6_A1652BarSerDsc ;
   private String[] T01SD6_A182BarMat ;
   private String[] T01SD6_A135BarColNom ;
   private int[] T01SD6_A136BarColNum ;
   private byte[] T01SD6_A218BarTipCol ;
   private short[] T01SD6_A864BarPes ;
   private byte[] T01SD6_A213BarSit ;
   private String[] T01SD6_A120BarAgrEst ;
   private String[] T01SD6_A228BarUniMed ;
   private java.math.BigDecimal[] T01SD6_A192BarNumUni ;
   private short[] T01SD6_A191BarNumPie ;
   private int[] T01SD6_A361DisCod ;
   private String[] T01SD8_A392DisUniMed ;
   private String[] T01SD8_A365DisDes ;
   private int[] T01SD10_A898BarPieNDes ;
   private java.math.BigDecimal[] T01SD10_A184BarMtr ;
   private java.math.BigDecimal[] T01SD10_A166BarKgm ;
   private short[] T01SD10_A199BarPie1 ;
   private java.math.BigDecimal[] T01SD5_A60AlbRUniUti ;
   private int[] T01SD5_A54AlbRPieUti ;
   private java.math.BigDecimal[] T01SD5_A58AlbRUniEnt ;
   private int[] T01SD5_A52AlbRPieEnt ;
   private byte[] T01SD5_A47AlbREst ;
   private String[] T01SD5_A46AlbREnt ;
   private int[] T01SD5_A252CliCod ;
   private String[] T01SD7_A279CliNom ;
   private String[] T01SD12_A200BarPieCod ;
   private java.math.BigDecimal[] T01SD12_A203BarPieKil ;
   private String[] T01SD12_A4812BarEncCli ;
   private String[] T01SD12_A143BarDisNum ;
   private String[] T01SD12_A279CliNom ;
   private String[] T01SD12_A212BarSer ;
   private String[] T01SD12_A1652BarSerDsc ;
   private String[] T01SD12_A182BarMat ;
   private String[] T01SD12_A135BarColNom ;
   private int[] T01SD12_A136BarColNum ;
   private byte[] T01SD12_A218BarTipCol ;
   private String[] T01SD12_A392DisUniMed ;
   private short[] T01SD12_A864BarPes ;
   private byte[] T01SD12_A213BarSit ;
   private String[] T01SD12_A120BarAgrEst ;
   private String[] T01SD12_A407EmprNom ;
   private boolean[] T01SD12_n407EmprNom ;
   private String[] T01SD12_A228BarUniMed ;
   private java.math.BigDecimal[] T01SD12_A192BarNumUni ;
   private short[] T01SD12_A191BarNumPie ;
   private java.math.BigDecimal[] T01SD12_A60AlbRUniUti ;
   private int[] T01SD12_A54AlbRPieUti ;
   private java.math.BigDecimal[] T01SD12_A58AlbRUniEnt ;
   private int[] T01SD12_A52AlbRPieEnt ;
   private byte[] T01SD12_A47AlbREst ;
   private java.math.BigDecimal[] T01SD12_A205BarPieMet ;
   private byte[] T01SD12_A201BarPieEst ;
   private java.math.BigDecimal[] T01SD12_A170BarKilLan ;
   private java.math.BigDecimal[] T01SD12_A183BarMetLan ;
   private short[] T01SD12_A197BarPConTro ;
   private String[] T01SD12_A908PieOriCod ;
   private int[] T01SD12_A1271BarPieLzd ;
   private int[] T01SD12_A1501BarPiePie ;
   private String[] T01SD12_A46AlbREnt ;
   private String[] T01SD12_A365DisDes ;
   private String[] T01SD12_A396EmprCod ;
   private int[] T01SD12_A44AlbRecCod ;
   private int[] T01SD12_A129BarCod ;
   private byte[] T01SD12_A132BarCodReo ;
   private String[] T01SD12_A130BarCodPar ;
   private int[] T01SD12_A252CliCod ;
   private int[] T01SD12_A361DisCod ;
   private int[] T01SD12_A898BarPieNDes ;
   private java.math.BigDecimal[] T01SD12_A184BarMtr ;
   private java.math.BigDecimal[] T01SD12_A166BarKgm ;
   private short[] T01SD12_A199BarPie1 ;
   private java.math.BigDecimal[] T01SD13_A60AlbRUniUti ;
   private int[] T01SD13_A54AlbRPieUti ;
   private java.math.BigDecimal[] T01SD13_A58AlbRUniEnt ;
   private int[] T01SD13_A52AlbRPieEnt ;
   private byte[] T01SD13_A47AlbREst ;
   private String[] T01SD13_A46AlbREnt ;
   private int[] T01SD13_A252CliCod ;
   private String[] T01SD14_A279CliNom ;
   private String[] T01SD15_A396EmprCod ;
   private int[] T01SD15_A129BarCod ;
   private byte[] T01SD15_A132BarCodReo ;
   private String[] T01SD15_A130BarCodPar ;
   private String[] T01SD15_A200BarPieCod ;
   private String[] T01SD3_A200BarPieCod ;
   private java.math.BigDecimal[] T01SD3_A203BarPieKil ;
   private java.math.BigDecimal[] T01SD3_A205BarPieMet ;
   private byte[] T01SD3_A201BarPieEst ;
   private java.math.BigDecimal[] T01SD3_A170BarKilLan ;
   private java.math.BigDecimal[] T01SD3_A183BarMetLan ;
   private short[] T01SD3_A197BarPConTro ;
   private String[] T01SD3_A908PieOriCod ;
   private int[] T01SD3_A1271BarPieLzd ;
   private int[] T01SD3_A1501BarPiePie ;
   private String[] T01SD3_A396EmprCod ;
   private int[] T01SD3_A44AlbRecCod ;
   private int[] T01SD3_A129BarCod ;
   private byte[] T01SD3_A132BarCodReo ;
   private String[] T01SD3_A130BarCodPar ;
   private String[] T01SD16_A396EmprCod ;
   private int[] T01SD16_A129BarCod ;
   private byte[] T01SD16_A132BarCodReo ;
   private String[] T01SD16_A130BarCodPar ;
   private String[] T01SD16_A200BarPieCod ;
   private String[] T01SD17_A396EmprCod ;
   private int[] T01SD17_A129BarCod ;
   private byte[] T01SD17_A132BarCodReo ;
   private String[] T01SD17_A130BarCodPar ;
   private String[] T01SD17_A200BarPieCod ;
   private String[] T01SD2_A200BarPieCod ;
   private java.math.BigDecimal[] T01SD2_A203BarPieKil ;
   private java.math.BigDecimal[] T01SD2_A205BarPieMet ;
   private byte[] T01SD2_A201BarPieEst ;
   private java.math.BigDecimal[] T01SD2_A170BarKilLan ;
   private java.math.BigDecimal[] T01SD2_A183BarMetLan ;
   private short[] T01SD2_A197BarPConTro ;
   private String[] T01SD2_A908PieOriCod ;
   private int[] T01SD2_A1271BarPieLzd ;
   private int[] T01SD2_A1501BarPiePie ;
   private String[] T01SD2_A396EmprCod ;
   private int[] T01SD2_A44AlbRecCod ;
   private int[] T01SD2_A129BarCod ;
   private byte[] T01SD2_A132BarCodReo ;
   private String[] T01SD2_A130BarCodPar ;
   private java.math.BigDecimal[] T01SD21_A60AlbRUniUti ;
   private int[] T01SD21_A54AlbRPieUti ;
   private java.math.BigDecimal[] T01SD21_A58AlbRUniEnt ;
   private int[] T01SD21_A52AlbRPieEnt ;
   private byte[] T01SD21_A47AlbREst ;
   private String[] T01SD21_A46AlbREnt ;
   private int[] T01SD21_A252CliCod ;
   private String[] T01SD22_A279CliNom ;
   private String[] T01SD23_A396EmprCod ;
   private int[] T01SD23_A129BarCod ;
   private byte[] T01SD23_A132BarCodReo ;
   private String[] T01SD23_A130BarCodPar ;
   private String[] T01SD23_A200BarPieCod ;
   private short[] T01SD23_A12913BarPieLDf ;
   private String[] T01SD24_A396EmprCod ;
   private int[] T01SD24_A129BarCod ;
   private byte[] T01SD24_A132BarCodReo ;
   private String[] T01SD24_A130BarCodPar ;
   private String[] T01SD24_A200BarPieCod ;
   private short[] T01SD24_A3858BarTroCod ;
   private String[] T01SD25_A396EmprCod ;
   private long[] T01SD25_A30AlbProCod ;
   private int[] T01SD25_A129BarCod ;
   private byte[] T01SD25_A132BarCodReo ;
   private String[] T01SD25_A130BarCodPar ;
   private String[] T01SD25_A200BarPieCod ;
   private String[] T01SD26_A396EmprCod ;
   private int[] T01SD26_A129BarCod ;
   private byte[] T01SD26_A132BarCodReo ;
   private String[] T01SD26_A130BarCodPar ;
   private String[] T01SD26_A200BarPieCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV22WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext11[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV23TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV26TrnContextAtt ;
}

final  class hojaderuta_pieza__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "MODA21";
   }

}

final  class hojaderuta_pieza__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "VERTEX";
   }

}

final  class hojaderuta_pieza__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

final  class hojaderuta_pieza__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

final  class hojaderuta_pieza__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01SD2", "SELECT BarPieCod, BarPieKil, BarPieMet, BarPieEst, BarKilLan, BarMetLan, BarPConTro, PieOriCod, BarPieLzd, BarPiePie, EmprCod, AlbRecCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?  FOR UPDATE OF BarPieKil, BarPieMet, BarPieEst, BarKilLan, BarMetLan, BarPConTro, PieOriCod, BarPieLzd, BarPiePie, AlbRecCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SD3", "SELECT BarPieCod, BarPieKil, BarPieMet, BarPieEst, BarKilLan, BarMetLan, BarPConTro, PieOriCod, BarPieLzd, BarPiePie, EmprCod, AlbRecCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SD4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SD5", "SELECT AlbRUniUti, AlbRPieUti, AlbRUniEnt, AlbRPieEnt, AlbREst, AlbREnt, CliCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SD6", "SELECT BarEncCli, BarDisNum, BarSer, BarSerDsc, BarMat, BarColNom, BarColNum, BarTipCol, BarPes, BarSit, BarAgrEst, BarUniMed, BarNumUni, BarNumPie, DisCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SD7", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SD8", "SELECT DisUniMed, DisDes FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SD10", "SELECT COALESCE( T1.BarPieNDes, 0) AS BarPieNDes, COALESCE( T1.BarMtr, 0) AS BarMtr, COALESCE( T1.BarKgm, 0) AS BarKgm, COALESCE( T1.BarPie1, 0) AS BarPie1 FROM (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr, SUM(BarPieKil) AS BarKgm, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SD12", "SELECT /*+ FIRST_ROWS(100) */ TM1.BarPieCod, TM1.BarPieKil, T5.BarEncCli, T5.BarDisNum, T4.CliNom, T5.BarSer, T5.BarSerDsc, T5.BarMat, T5.BarColNom, T5.BarColNum, T5.BarTipCol, T6.DisUniMed, T5.BarPes, T5.BarSit, T5.BarAgrEst, T2.EmprNom, T5.BarUniMed, T5.BarNumUni, T5.BarNumPie, T3.AlbRUniUti, T3.AlbRPieUti, T3.AlbRUniEnt, T3.AlbRPieEnt, T3.AlbREst, TM1.BarPieMet, TM1.BarPieEst, TM1.BarKilLan, TM1.BarMetLan, TM1.BarPConTro, TM1.PieOriCod, TM1.BarPieLzd, TM1.BarPiePie, T3.AlbREnt, T6.DisDes, TM1.EmprCod, TM1.AlbRecCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, T3.CliCod, T5.DisCod, COALESCE( T7.BarPieNDes, 0) AS BarPieNDes, COALESCE( T7.BarMtr, 0) AS BarMtr, COALESCE( T7.BarKgm, 0) AS BarKgm, COALESCE( T7.BarPie1, 0) AS BarPie1 FROM ((((((TXPBARPIE TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPALBREC T3 ON T3.EmprCod = TM1.EmprCod AND T3.AlbRecCod = TM1.AlbRecCod) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = TM1.EmprCod AND T4.CliCod = T3.CliCod) INNER JOIN TXPBARCAD T5 ON T5.EmprCod = TM1.EmprCod AND T5.BarCod = TM1.BarCod AND T5.BarCodReo = TM1.BarCodReo AND T5.BarCodPar = TM1.BarCodPar) LEFT JOIN TXPDISPOS T6 ON T6.EmprCod = TM1.EmprCod AND T6.DisCod = T5.DisCod) LEFT JOIN (SELECT SUM(TM1.BarPiePie) AS BarPieNDes, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, SUM(TM1.BarPieMet) AS BarMtr, SUM(TM1.BarPieKil) AS BarKgm, COUNT(*) AS BarPie1 FROM TXPBARPIE TM1 GROUP BY TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar ) T7 ON T7.EmprCod = TM1.EmprCod AND T7.BarCod = TM1.BarCod AND T7.BarCodReo = TM1.BarCodReo AND T7.BarCodPar = TM1.BarCodPar) WHERE TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? and TM1.BarPieCod = ? ORDER BY TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.BarPieCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SD13", "SELECT AlbRUniUti, AlbRPieUti, AlbRUniEnt, AlbRPieEnt, AlbREst, AlbREnt, CliCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SD14", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SD15", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SD16", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPBARPIE WHERE ( EmprCod > ? or EmprCod = ? and BarPieCod > ?) and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SD17", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPBARPIE WHERE ( EmprCod < ? or EmprCod = ? and BarPieCod < ?) and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, BarPieCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01SD18", "INSERT INTO TXPBARPIE(BarPieCod, BarPieKil, BarPieMet, BarPieEst, BarKilLan, BarMetLan, BarPConTro, PieOriCod, BarPieLzd, BarPiePie, EmprCod, AlbRecCod, BarCod, BarCodReo, BarCodPar, BarPieAnc, BarPieLoc, BarKgsAut, BarMtsAut, BarPieAut, BarPieImp, BarPieIdPz, BapieObs, CodBarPz, PzaB80, BarPieK1, BarPieK2, BarPz1, BarPz2, BarNPes, BarPieAncc, BarPiePda, BarPieObs, BarTara, BarUniB, BarPieOrd, BarPieCLd, BarPieFdv, BarPieUsu, BarPieFep, BarPieUltD, BarPieColD, BarPieColN, BarPieArtI, BarPieArtD, BarPieCliI, BarPieCliN, BarPieCoCI, BarPieCoCN, BarPieEncC, BarPieTono, BarPieSecu, BarPieOpe, BarPieDest, BarPieEmp, BarPieLote, BarPieST, BarPieTurn, BarPieMq, BarPieVtx) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', 0, 0, 0, ' ', ' ', ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, ' ', ' ', 0, ' ', ' ', 0, ' ', ' ', ' ', 0, 0, 0, ' ', ' ', 0, ' ', ' ')", GX_NOMASK, "TXPBARPIE")
         ,new UpdateCursor("T01SD19", "UPDATE TXPBARPIE SET BarPieKil=?, BarPieMet=?, BarPieEst=?, BarKilLan=?, BarMetLan=?, BarPConTro=?, PieOriCod=?, BarPieLzd=?, BarPiePie=?, AlbRecCod=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK, "TXPBARPIE")
         ,new UpdateCursor("T01SD20", "DELETE FROM TXPBARPIE  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK, "TXPBARPIE")
         ,new ForEachCursor("T01SD21", "SELECT AlbRUniUti, AlbRPieUti, AlbRUniEnt, AlbRPieEnt, AlbREst, AlbREnt, CliCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SD22", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SD23", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarPieLDf FROM TXPBARPDE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SD24", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarTroCod FROM TXPBARTRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SD25", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPLALPRD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SD26", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPBARPIE WHERE BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 9);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 9);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 3);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 9);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 9);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 3);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 9);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((String[]) buf[8])[0] = rslt.getString(9, 13);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 1);
               ((String[]) buf[15])[0] = rslt.getString(16, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(17, 1);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(18,2);
               ((short[]) buf[19])[0] = rslt.getShort(19);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(20,2);
               ((int[]) buf[21])[0] = rslt.getInt(21);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(22,2);
               ((int[]) buf[23])[0] = rslt.getInt(23);
               ((byte[]) buf[24])[0] = rslt.getByte(24);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(25,2);
               ((byte[]) buf[26])[0] = rslt.getByte(26);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(27,2);
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(28,2);
               ((short[]) buf[29])[0] = rslt.getShort(29);
               ((String[]) buf[30])[0] = rslt.getString(30, 9);
               ((int[]) buf[31])[0] = rslt.getInt(31);
               ((int[]) buf[32])[0] = rslt.getInt(32);
               ((String[]) buf[33])[0] = rslt.getString(33, 8);
               ((String[]) buf[34])[0] = rslt.getString(34, 1);
               ((String[]) buf[35])[0] = rslt.getString(35, 3);
               ((int[]) buf[36])[0] = rslt.getInt(36);
               ((int[]) buf[37])[0] = rslt.getInt(37);
               ((byte[]) buf[38])[0] = rslt.getByte(38);
               ((String[]) buf[39])[0] = rslt.getString(39, 1);
               ((int[]) buf[40])[0] = rslt.getInt(40);
               ((int[]) buf[41])[0] = rslt.getInt(41);
               ((int[]) buf[42])[0] = rslt.getInt(42);
               ((java.math.BigDecimal[]) buf[43])[0] = rslt.getBigDecimal(43,2);
               ((java.math.BigDecimal[]) buf[44])[0] = rslt.getBigDecimal(44,2);
               ((short[]) buf[45])[0] = rslt.getShort(45);
               return;
            case 9 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               return;
            case 17 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 9);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 9);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 9);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setString(8, (String)parms[7], 9);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setString(11, (String)parms[10], 3);
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setByte(14, ((Number) parms[13]).byteValue());
               stmt.setString(15, (String)parms[14], 1);
               return;
            case 15 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 9);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setString(11, (String)parms[10], 3);
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setByte(13, ((Number) parms[12]).byteValue());
               stmt.setString(14, (String)parms[13], 1);
               stmt.setString(15, (String)parms[14], 9);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 22 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
      }
   }

}

